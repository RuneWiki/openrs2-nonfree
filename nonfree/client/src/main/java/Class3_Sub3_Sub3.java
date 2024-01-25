import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "Lclient!dj;")
	public final Class53 aClass53_3;

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "Z")
	private final boolean aBoolean462;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIIZIIIIII)V")
	public Class3_Sub3_Sub3(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static298.method157(arg12, arg11));
		this.aClass53_3 = new Class53(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean462 = arg1.anInt5357 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		@Pc(16) Class59 local16 = this.aClass53_3.method1093(super.anInt6458, false, arg0, 2048, super.anInt6454, true);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class31 local23 = arg0.method5539();
		local23.U(super.anInt6462 + super.anInt6454, super.anInt6459, super.anInt6456 + super.anInt6458);
		@Pc(39) Class21_Sub6 local39 = null;
		if (this.aBoolean462) {
			local39 = Static209.method2805(1);
		}
		if (this.aClass53_3.aClass21_Sub2_2 == null) {
			local16.method5736(local23, local39 == null ? null : local39.aClass21_Sub7Array1[0], 0);
		} else {
			@Pc(69) Class256 local69 = this.aClass53_3.aClass21_Sub2_2.method634();
			arg0.method5551(local16, local69, local23, local39 == null ? null : local39.aClass21_Sub7Array1[0]);
		}
		@Pc(93) int local93 = super.anInt6454 >> 7;
		@Pc(98) int local98 = super.anInt6458 >> 7;
		this.aClass53_3.method1088(arg0, local98, local93, local93, true, local16, local98);
		return local39;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
		this.aClass53_3.method1087(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
		@Pc(23) Class59 local23 = this.aClass53_3.method1093(super.anInt6458, false, arg0, 262144, super.anInt6454, true);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt6454 >> 7;
			@Pc(35) int local35 = super.anInt6458 >> 7;
			this.aClass53_3.method1088(arg0, local35, local30, local30, false, local23, local35);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return this.aClass53_3.method1093(0, false, arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(16) Class59 local16 = this.aClass53_3.method1093(super.anInt6458, false, arg2, 131072, super.anInt6454, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class31 local28 = arg2.method5539();
			local28.U(super.anInt6462 + super.anInt6454, super.anInt6459, super.anInt6458 + super.anInt6456);
			return local16.method5748(arg1, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
		this.aClass53_3.method1100(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)I")
	@Override
	public int method5020() {
		return this.aClass53_3.method1094();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return this.aClass53_3.anInt1391;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return this.aClass53_3.method1090();
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return this.aClass53_3.anInt1408;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return this.aClass53_3.anInt1413;
	}
}
