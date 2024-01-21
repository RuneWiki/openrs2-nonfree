import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EQSIBNHW")
public final class Class7 {

	@OriginalMember(owner = "client!EQSIBNHW", name = "c", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!EQSIBNHW", name = "d", descriptor = "I")
	private int anInt81;

	@OriginalMember(owner = "client!EQSIBNHW", name = "a", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!EQSIBNHW", name = "b", descriptor = "I")
	private int anInt79 = -192;

	@OriginalMember(owner = "client!EQSIBNHW", name = "e", descriptor = "Lclient!APQXVAYL;")
	private Class1_Sub1 aClass1_Sub1_9 = new Class1_Sub1();

	@OriginalMember(owner = "client!EQSIBNHW", name = "i", descriptor = "Lclient!LKYWDMZN;")
	private Class21 aClass21_1 = new Class21(0);

	@OriginalMember(owner = "client!EQSIBNHW", name = "f", descriptor = "I")
	private int anInt82;

	@OriginalMember(owner = "client!EQSIBNHW", name = "g", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!EQSIBNHW", name = "h", descriptor = "Lclient!OWFJUUFC;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!EQSIBNHW", name = "<init>", descriptor = "(II)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt82 = arg0;
			this.anInt83 = arg0;
			@Pc(28) int local28 = 89 / arg1;
			this.aClass27_1 = new Class27((byte) 5, 1024);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("38993, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EQSIBNHW", name = "a", descriptor = "(J)Lclient!APQXVAYL;")
	public Class1_Sub1 method40(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass27_1.method293(arg0);
		if (local5 == null) {
			this.anInt80++;
		} else {
			this.aClass21_1.method216(local5);
			this.anInt81++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!EQSIBNHW", name = "a", descriptor = "(IJLclient!APQXVAYL;)V")
	public void method41(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class1_Sub1 arg2) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt83 == 0) {
				@Pc(10) Class1_Sub1 local10 = this.aClass21_1.method217();
				local10.method551();
				local10.method552();
				if (local10 == this.aClass1_Sub1_9) {
					local10 = this.aClass21_1.method217();
					local10.method551();
					local10.method552();
				}
			} else {
				this.anInt83--;
			}
			this.aClass27_1.method294(arg1, arg2);
			this.aClass21_1.method216(arg2);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("80684, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EQSIBNHW", name = "a", descriptor = "()V")
	public void method42() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass21_1.method217();
			if (local3 == null) {
				this.anInt83 = this.anInt82;
				return;
			}
			local3.method551();
			local3.method552();
		}
	}
}
