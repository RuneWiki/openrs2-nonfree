import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FFRFJBIR")
public final class Class7 {

	@OriginalMember(owner = "client!FFRFJBIR", name = "d", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!FFRFJBIR", name = "e", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!FFRFJBIR", name = "a", descriptor = "I")
	private int anInt84 = -48253;

	@OriginalMember(owner = "client!FFRFJBIR", name = "b", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!FFRFJBIR", name = "c", descriptor = "I")
	private int anInt85 = 859;

	@OriginalMember(owner = "client!FFRFJBIR", name = "f", descriptor = "Lclient!EDVKOEOK;")
	private Class4_Sub1 aClass4_Sub1_13 = new Class4_Sub1();

	@OriginalMember(owner = "client!FFRFJBIR", name = "j", descriptor = "Lclient!AAITTAMV;")
	private Class1 aClass1_1 = new Class1((byte) -113);

	@OriginalMember(owner = "client!FFRFJBIR", name = "g", descriptor = "I")
	private int anInt88;

	@OriginalMember(owner = "client!FFRFJBIR", name = "h", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!FFRFJBIR", name = "i", descriptor = "Lclient!GUGSPPMO;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!FFRFJBIR", name = "<init>", descriptor = "(II)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt88 = arg0;
			this.anInt89 = arg0;
			this.aClass11_1 = new Class11(1024, 1);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("43330, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FFRFJBIR", name = "a", descriptor = "(J)Lclient!EDVKOEOK;")
	public Class4_Sub1 method85(@OriginalArg(0) long arg0) {
		@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass11_1.method185(arg0);
		if (local5 == null) {
			this.anInt86++;
		} else {
			this.aClass1_1.method1(local5);
			this.anInt87++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!FFRFJBIR", name = "a", descriptor = "(JLclient!EDVKOEOK;Z)V")
	public void method86(@OriginalArg(0) long arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (this.anInt89 == 0) {
				@Pc(8) Class4_Sub1 local8 = this.aClass1_1.method2();
				local8.method572();
				local8.method573();
				if (local8 == this.aClass4_Sub1_13) {
					local8 = this.aClass1_1.method2();
					local8.method572();
					local8.method573();
				}
			} else {
				this.anInt89--;
			}
			this.aClass11_1.method186(arg1, arg0);
			this.aClass1_1.method1(arg1);
			if (!arg2) {
				;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("55464, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FFRFJBIR", name = "a", descriptor = "()V")
	public void method87() {
		while (true) {
			@Pc(3) Class4_Sub1 local3 = this.aClass1_1.method2();
			if (local3 == null) {
				this.anInt89 = this.anInt88;
				return;
			}
			local3.method572();
			local3.method573();
		}
	}
}
