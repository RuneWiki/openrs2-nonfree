import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class164 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lclient!fa;")
	private Class50_Sub1[] aClass50_Sub1Array2;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Lclient!bt;")
	private Class3_Sub2 aClass3_Sub2_8;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!ph;")
	private final Class183 aClass183_3;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!au;")
	private final Class15 aClass15_3;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!bc;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!ph;Lclient!au;)V")
	public Class164(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class15 arg1) {
		this.aClass183_3 = arg0;
		this.aClass15_3 = arg1;
		if (!this.aClass183_3.method4508()) {
			this.aClass3_Sub3_Sub3_Sub1_1 = this.aClass183_3.method4503(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!jb;IBLclient!jb;)Lclient!fa;")
	public Class50_Sub1 method3969(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class117 arg2) {
		return this.method3972(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Z")
	public boolean method3970() {
		if (this.aClass3_Sub2_8 != null) {
			return true;
		}
		if (this.aClass3_Sub3_Sub3_Sub1_1 == null) {
			if (this.aClass183_3.method4508()) {
				return false;
			}
			this.aClass3_Sub3_Sub3_Sub1_1 = this.aClass183_3.method4503(255, 255, (byte) 0, true);
		}
		if (this.aClass3_Sub3_Sub3_Sub1_1.aBoolean272) {
			return false;
		} else {
			this.aClass3_Sub2_8 = new Class3_Sub2(this.aClass3_Sub3_Sub3_Sub1_1.method2882());
			this.aClass50_Sub1Array2 = new Class50_Sub1[(this.aClass3_Sub2_8.aByteArray95.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public void method3971() {
		if (this.aClass50_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass50_Sub1Array2.length; local11++) {
			if (this.aClass50_Sub1Array2[local11] != null) {
				this.aClass50_Sub1Array2[local11].method1830();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass50_Sub1Array2.length; local38++) {
			if (this.aClass50_Sub1Array2[local38] != null) {
				this.aClass50_Sub1Array2[local38].method1833();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!jb;BZLclient!jb;I)Lclient!fa;")
	private Class50_Sub1 method3972(@OriginalArg(0) Class117 arg0, @OriginalArg(3) Class117 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass3_Sub2_8 == null) {
			throw new RuntimeException();
		}
		this.aClass3_Sub2_8.anInt7620 = arg2 * 8 + 5;
		if (this.aClass3_Sub2_8.aByteArray95.length <= this.aClass3_Sub2_8.anInt7620) {
			throw new RuntimeException();
		} else if (this.aClass50_Sub1Array2[arg2] == null) {
			@Pc(59) int local59 = this.aClass3_Sub2_8.method6014();
			@Pc(64) int local64 = this.aClass3_Sub2_8.method6014();
			@Pc(78) Class50_Sub1 local78 = new Class50_Sub1(arg2, arg0, arg1, this.aClass183_3, this.aClass15_3, local59, local64, true);
			this.aClass50_Sub1Array2[arg2] = local78;
			return local78;
		} else {
			return this.aClass50_Sub1Array2[arg2];
		}
	}
}
