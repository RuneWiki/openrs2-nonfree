import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class38 {

	@OriginalMember(owner = "client!el", name = "m", descriptor = "Lclient!cg;")
	private Class1_Sub11 aClass1_Sub11_2;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "[Lclient!hn;")
	private Class63_Sub1[] aClass63_Sub1Array1;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Lclient!ue;")
	private Class162 aClass162_1;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "Lclient!pk;")
	private Class130 aClass130_2;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "Lclient!qf;")
	private Class1_Sub2_Sub6_Sub2 aClass1_Sub2_Sub6_Sub2_1;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!ue;Lclient!pk;)V")
	public Class38(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class130 arg1) {
		this.aClass162_1 = arg0;
		this.aClass130_2 = arg1;
		if (!this.aClass162_1.method4039()) {
			this.aClass1_Sub2_Sub6_Sub2_1 = this.aClass162_1.method4036(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public void method1183() {
		if (this.aClass63_Sub1Array1 == null) {
			return;
		}
		@Pc(16) int local16;
		for (local16 = 0; local16 < this.aClass63_Sub1Array1.length; local16++) {
			if (this.aClass63_Sub1Array1[local16] != null) {
				this.aClass63_Sub1Array1[local16].method1933();
			}
		}
		for (local16 = 0; local16 < this.aClass63_Sub1Array1.length; local16++) {
			if (this.aClass63_Sub1Array1[local16] != null) {
				this.aClass63_Sub1Array1[local16].method1936();
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ng;IIZLclient!ng;)Lclient!hn;")
	private Class63_Sub1 method1184(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class111 arg2) {
		if (this.aClass1_Sub11_2 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub11_2.anInt3264 = arg1 * 8 + 5;
		if (this.aClass1_Sub11_2.anInt3264 >= this.aClass1_Sub11_2.aByteArray47.length) {
			throw new RuntimeException();
		} else if (this.aClass63_Sub1Array1[arg1] == null) {
			@Pc(52) int local52 = this.aClass1_Sub11_2.method2643();
			@Pc(57) int local57 = this.aClass1_Sub11_2.method2643();
			@Pc(71) Class63_Sub1 local71 = new Class63_Sub1(arg1, arg0, arg2, this.aClass162_1, this.aClass130_2, local52, local57, true);
			this.aClass63_Sub1Array1[arg1] = local71;
			return local71;
		} else {
			return this.aClass63_Sub1Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Z")
	public boolean method1185() {
		if (this.aClass1_Sub11_2 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub6_Sub2_1 == null) {
			if (this.aClass162_1.method4039()) {
				return false;
			}
			this.aClass1_Sub2_Sub6_Sub2_1 = this.aClass162_1.method4036(255, (byte) 0, 255, true);
		}
		if (this.aClass1_Sub2_Sub6_Sub2_1.aBoolean325) {
			return false;
		} else {
			this.aClass1_Sub11_2 = new Class1_Sub11(this.aClass1_Sub2_Sub6_Sub2_1.method3364());
			this.aClass63_Sub1Array1 = new Class63_Sub1[(this.aClass1_Sub11_2.aByteArray47.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ng;Lclient!ng;II)Lclient!hn;")
	public Class63_Sub1 method1186(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(3) int arg2) {
		return this.method1184(arg1, arg2, arg0);
	}
}
