import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JETHVCIV")
public final class Class15 {

	@OriginalMember(owner = "client!JETHVCIV", name = "c", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!JETHVCIV", name = "d", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!JETHVCIV", name = "a", descriptor = "I")
	private int anInt339 = 8;

	@OriginalMember(owner = "client!JETHVCIV", name = "b", descriptor = "I")
	private int anInt340 = 8;

	@OriginalMember(owner = "client!JETHVCIV", name = "e", descriptor = "Lclient!HSUOZGYX;")
	private Class1_Sub1 aClass1_Sub1_19 = new Class1_Sub1();

	@OriginalMember(owner = "client!JETHVCIV", name = "i", descriptor = "Lclient!XBBVJJRK;")
	private Class44 aClass44_2 = new Class44((byte) -100);

	@OriginalMember(owner = "client!JETHVCIV", name = "f", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!JETHVCIV", name = "g", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!JETHVCIV", name = "h", descriptor = "Lclient!ZRDWHMTU;")
	private Class49 aClass49_1;

	@OriginalMember(owner = "client!JETHVCIV", name = "<init>", descriptor = "(ZI)V")
	public Class15(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt343 = arg1;
			this.anInt344 = arg1;
			this.aClass49_1 = new Class49(0, 1024);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("57625, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JETHVCIV", name = "a", descriptor = "(J)Lclient!HSUOZGYX;")
	public Class1_Sub1 method222(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass49_1.method537(arg0);
		if (local5 == null) {
			this.anInt341++;
		} else {
			this.aClass44_2.method491(local5);
			this.anInt342++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!JETHVCIV", name = "a", descriptor = "(ILclient!HSUOZGYX;J)V")
	public void method223(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt344 == 0) {
				@Pc(13) Class1_Sub1 local13 = this.aClass44_2.method492();
				local13.method510();
				local13.method511();
				if (local13 == this.aClass1_Sub1_19) {
					local13 = this.aClass44_2.method492();
					local13.method510();
					local13.method511();
				}
			} else {
				this.anInt344--;
			}
			this.aClass49_1.method538(arg1, arg0);
			this.aClass44_2.method491(arg0);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("74268, " + -363 + ", " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JETHVCIV", name = "a", descriptor = "()V")
	public void method224() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass44_2.method492();
			if (local3 == null) {
				this.anInt344 = this.anInt343;
				return;
			}
			local3.method510();
			local3.method511();
		}
	}
}
