import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class49_Sub3_Sub2 extends Class49_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!le", name = "y", descriptor = "Lclient!ud;")
	private Class291 aClass291_3;

	@OriginalMember(owner = "client!le", name = "B", descriptor = "Lclient!ej;")
	public final Class80 aClass80_1;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "Z")
	private final boolean aBoolean364;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIIZIIIIII)V")
	public Class49_Sub3_Sub2(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static418.method6144(arg12, arg11));
		this.aClass80_1 = new Class80(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean364 = arg1.anInt992 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		@Pc(18) Class145 local18 = this.aClass80_1.method1894(super.anInt9071, true, false, super.anInt9077, 2048, arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class118 local25 = arg0.method7256();
		local25.oa(super.anInt9076 + super.anInt9077, super.anInt9070, super.anInt9071 + super.anInt9068);
		@Pc(49) Class72_Sub7 local49 = null;
		if (this.aBoolean364) {
			local49 = Static186.method2914(1);
		}
		if (this.aClass80_1.aClass72_Sub4_4 == null) {
			local18.method6686(local25, local49 == null ? null : local49.aClass72_Sub2Array1[0], 0);
		} else {
			@Pc(65) Class175 local65 = this.aClass80_1.aClass72_Sub4_4.method4537();
			arg0.method7246(local18, local65, local25, local49 == null ? null : local49.aClass72_Sub2Array1[0]);
		}
		if (this.aClass291_3 == null) {
			this.aClass291_3 = Static158.method2472(local18, super.anInt9071, super.anInt9070, super.anInt9077);
		} else {
			Static391.method5898(this.aClass291_3, super.anInt9077, local18, super.anInt9070, super.anInt9071);
		}
		@Pc(125) int local125 = super.anInt9077 >> 9;
		@Pc(130) int local130 = super.anInt9071 >> 9;
		this.aClass80_1.method1901(local18, local130, true, local125, local130, local125, arg0);
		return local49;
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(I)I")
	@Override
	public int method7462() {
		return this.aClass80_1.method1891();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return this.aClass291_3;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return this.aClass80_1.anInt2233;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(22) Class145 local22 = this.aClass80_1.method1894(super.anInt9071, false, false, super.anInt9077, 131072, arg2);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class118 local29 = arg2.method7256();
			local29.oa(super.anInt9076 + super.anInt9077, super.anInt9070, super.anInt9071 + super.anInt9068);
			return local22.method6683(arg0, arg1, local29, false);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return this.aClass80_1.anInt2245;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return this.aClass80_1.method1894(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return this.aClass80_1.method1899();
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return this.aClass80_1.anInt2255;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
		@Pc(19) Class145 local19 = this.aClass80_1.method1894(super.anInt9071, true, false, super.anInt9077, 262144, arg0);
		if (local19 != null) {
			@Pc(26) int local26 = super.anInt9077 >> 9;
			@Pc(31) int local31 = super.anInt9071 >> 9;
			this.aClass80_1.method1901(local19, local31, false, local26, local31, local26, arg0);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
		this.aClass80_1.method1890(arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
		this.aClass80_1.method1898(arg0);
	}
}
