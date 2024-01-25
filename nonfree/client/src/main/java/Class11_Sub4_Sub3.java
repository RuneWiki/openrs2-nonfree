import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class11_Sub4_Sub3 extends Class11_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!wf", name = "P", descriptor = "Lclient!oh;")
	public final Class156 aClass156_4;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Z")
	private final boolean aBoolean504;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIIIIZIIII)V")
	public Class11_Sub4_Sub3(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static230.method1866(arg3, arg2));
		this.aClass156_4 = new Class156(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean504 = arg1.anInt2377 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return this.aClass156_4.anInt4554;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		@Pc(21) Class3 local21 = this.aClass156_4.method4181(false, super.anInt6835, true, super.anInt6832, arg0, 1024);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class129 local28 = arg0.method4634();
		local28.method5774(super.anInt6835 + super.anInt6829, super.anInt6828, super.anInt6832 + super.anInt6833);
		@Pc(45) Class32_Sub7 local45 = null;
		if (this.aBoolean504) {
			local45 = Static67.method1550(1);
		}
		if (this.aClass156_4.aClass32_Sub2_2 == null) {
			local21.method1242(local28, local45 == null ? null : local45.aClass32_Sub4Array1[0], 0);
		} else {
			@Pc(61) Class26 local61 = this.aClass156_4.aClass32_Sub2_2.method1403();
			arg0.method4655(local21, local61, local28, local45 == null ? null : local45.aClass32_Sub4Array1[0]);
		}
		this.aClass156_4.method4183(super.anInt6832 >> 7, super.anInt6832 >> 7, super.anInt6835 >> 7, true, arg0, local21, super.anInt6835 >> 7);
		return local45;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3 local16 = this.aClass156_4.method4181(false, super.anInt6835, false, super.anInt6832, arg0, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class129 local23 = arg0.method4634();
			local23.method5774(super.anInt6829 + super.anInt6835, super.anInt6828, super.anInt6832 + super.anInt6833);
			return local16.method1283(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return this.aClass156_4.anInt4552;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
		this.aClass156_4.method4187(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return this.aClass156_4.anInt4545;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
		this.aClass156_4.method4189(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.aClass156_4.method4181(false, 0, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
		@Pc(16) Class3 local16 = this.aClass156_4.method4181(false, super.anInt6835, true, super.anInt6832, arg0, 131072);
		if (local16 != null) {
			this.aClass156_4.method4183(super.anInt6832 >> 7, super.anInt6832 >> 7, super.anInt6835 >> 7, false, arg0, local16, super.anInt6835 >> 7);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return this.aClass156_4.method4192();
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(B)I")
	@Override
	public int method5916() {
		return this.aClass156_4.method4191();
	}
}
