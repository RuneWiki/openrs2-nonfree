import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!ms", name = "L", descriptor = "Lclient!qt;")
	private Class277 aClass277_6;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "Lclient!as;")
	public final Class16 aClass16_4;

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "Z")
	private final boolean aBoolean414;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIIZII)V")
	public Class4_Sub3_Sub2(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt6932, arg1.lb, arg1.aBoolean483);
		this.aClass16_4 = new Class16(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean414 = arg1.anInt6889 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return this.aClass16_4.method730(arg1, arg0, 0, false, 0, false);
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
		@Pc(22) Class20 local22 = this.aClass16_4.method730(262144, arg0, super.anInt6067, true, super.anInt6071, true);
		if (local22 == null) {
			return;
		}
		@Pc(29) int local29 = super.anInt6071 >> 9;
		@Pc(34) int local34 = super.anInt6067 >> 9;
		@Pc(37) Class54 local37 = arg0.method6851();
		local37.GA(super.anInt6071, super.anInt6066, super.anInt6067);
		this.aClass16_4.method735(local37, false, local29, local22, local29, arg0, local34, local34);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return this.aClass277_6;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return this.aClass16_4.anInt687;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return this.aClass16_4.anInt682;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
		this.aClass16_4.method729(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return this.aClass16_4.anInt672;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		@Pc(18) Class20 local18 = this.aClass16_4.method730(2048, arg0, super.anInt6067, false, super.anInt6071, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class54 local25 = arg0.method6851();
		local25.GA(super.anInt6071, super.anInt6066, super.anInt6067);
		@Pc(44) Class98_Sub8 local44 = null;
		if (this.aBoolean414) {
			local44 = Static348.method5326(1);
		}
		@Pc(56) int local56 = super.anInt6071 >> 9;
		@Pc(61) int local61 = super.anInt6067 >> 9;
		this.aClass16_4.method735(local25, true, local56, local18, local56, arg0, local61, local61);
		if (this.aClass16_4.aClass98_Sub3_3 == null) {
			local18.method7256(local25, local44 == null ? null : local44.aClass98_Sub5Array1[0], 0);
		} else {
			@Pc(96) Class144 local96 = this.aClass16_4.aClass98_Sub3_3.method4532();
			arg0.method6856(local18, local96, local25, local44 == null ? null : local44.aClass98_Sub5Array1[0], 0);
		}
		if (this.aClass277_6 == null) {
			this.aClass277_6 = Static323.method5117(local18, super.anInt6067, super.anInt6066, super.anInt6071);
		} else {
			Static490.method6709(local18, super.anInt6067, super.anInt6066, this.aClass277_6, super.anInt6071);
		}
		return local44;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
		this.aClass16_4.method732(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class20 local24 = this.aClass16_4.method730(131072, arg1, super.anInt6067, false, super.anInt6071, false);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class54 local31 = arg1.method6851();
			local31.GA(super.anInt6071, super.anInt6066, super.anInt6067);
			return local24.method7266(arg2, arg0, local31, false);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return this.aClass16_4.method738();
	}
}
