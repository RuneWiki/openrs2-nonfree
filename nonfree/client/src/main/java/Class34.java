import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RHNYLZZL")
public final class Class34 {

	@OriginalMember(owner = "client!RHNYLZZL", name = "b", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!RHNYLZZL", name = "c", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "I")
	private int anInt539 = 256;

	@OriginalMember(owner = "client!RHNYLZZL", name = "d", descriptor = "Lclient!DPPNUUMQ;")
	private Class10_Sub1 aClass10_Sub1_29 = new Class10_Sub1();

	@OriginalMember(owner = "client!RHNYLZZL", name = "h", descriptor = "Lclient!CZYJUOKA;")
	private Class9 aClass9_1 = new Class9(true);

	@OriginalMember(owner = "client!RHNYLZZL", name = "e", descriptor = "I")
	private int anInt542;

	@OriginalMember(owner = "client!RHNYLZZL", name = "f", descriptor = "I")
	private int anInt543;

	@OriginalMember(owner = "client!RHNYLZZL", name = "g", descriptor = "Lclient!JLFXAIRK;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!RHNYLZZL", name = "<init>", descriptor = "(II)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt542 = arg0;
			this.anInt543 = arg0;
			this.aClass20_1 = new Class20((byte) 0, 1024);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("68195, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "(J)Lclient!DPPNUUMQ;")
	public Class10_Sub1 method387(@OriginalArg(0) long arg0) {
		@Pc(5) Class10_Sub1 local5 = (Class10_Sub1) this.aClass20_1.method163(arg0);
		if (local5 == null) {
			this.anInt540++;
		} else {
			this.aClass9_1.method33(local5);
			this.anInt541++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "(Lclient!DPPNUUMQ;JI)V")
	public void method388(@OriginalArg(0) Class10_Sub1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (this.anInt543 == 0) {
				@Pc(14) Class10_Sub1 local14 = this.aClass9_1.method34();
				local14.method534();
				local14.method535();
				if (local14 == this.aClass10_Sub1_29) {
					local14 = this.aClass9_1.method34();
					local14.method534();
					local14.method535();
				}
			} else {
				this.anInt543--;
			}
			this.aClass20_1.method164(arg0, arg1);
			this.aClass9_1.method33(arg0);
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("76413, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "()V")
	public void method389() {
		while (true) {
			@Pc(3) Class10_Sub1 local3 = this.aClass9_1.method34();
			if (local3 == null) {
				this.anInt543 = this.anInt542;
				return;
			}
			local3.method534();
			local3.method535();
		}
	}
}
