import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LSQNLJTA")
public final class Class29 {

	@OriginalMember(owner = "client!LSQNLJTA", name = "d", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!LSQNLJTA", name = "e", descriptor = "I")
	private int anInt535;

	@OriginalMember(owner = "client!LSQNLJTA", name = "a", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!LSQNLJTA", name = "b", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!LSQNLJTA", name = "c", descriptor = "I")
	private int anInt533 = -7889;

	@OriginalMember(owner = "client!LSQNLJTA", name = "f", descriptor = "Lclient!UXRJCYSS;")
	private Class1_Sub1 aClass1_Sub1_31 = new Class1_Sub1();

	@OriginalMember(owner = "client!LSQNLJTA", name = "j", descriptor = "Lclient!BGEXEDZG;")
	private Class3 aClass3_1 = new Class3((byte) 3);

	@OriginalMember(owner = "client!LSQNLJTA", name = "g", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "client!LSQNLJTA", name = "h", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!LSQNLJTA", name = "i", descriptor = "Lclient!LJCRDSKE;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!LSQNLJTA", name = "<init>", descriptor = "(IB)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt536 = arg0;
			this.anInt537 = arg0;
			this.aClass26_1 = new Class26(1024, this.aBoolean127);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("94140, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LSQNLJTA", name = "a", descriptor = "(J)Lclient!UXRJCYSS;")
	public Class1_Sub1 method334(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass26_1.method327(arg0);
		if (local5 == null) {
			this.anInt534++;
		} else {
			this.aClass3_1.method27(local5);
			this.anInt535++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!LSQNLJTA", name = "a", descriptor = "(Lclient!UXRJCYSS;IJ)V")
	public void method335(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt537 == 0) {
				@Pc(18) Class1_Sub1 local18 = this.aClass3_1.method28();
				local18.method507();
				local18.method508();
				if (local18 == this.aClass1_Sub1_31) {
					local18 = this.aClass3_1.method28();
					local18.method507();
					local18.method508();
				}
			} else {
				this.anInt537--;
			}
			this.aClass26_1.method328((byte) 1, arg0, arg1);
			this.aClass3_1.method27(arg0);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("38550, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LSQNLJTA", name = "a", descriptor = "()V")
	public void method336() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass3_1.method28();
			if (local3 == null) {
				this.anInt537 = this.anInt536;
				return;
			}
			local3.method507();
			local3.method508();
		}
	}
}
