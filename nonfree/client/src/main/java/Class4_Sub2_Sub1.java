import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!am", name = "L", descriptor = "Lclient!qt;")
	private Class277 aClass277_2;

	@OriginalMember(owner = "client!am", name = "N", descriptor = "Lclient!as;")
	public final Class16 aClass16_2;

	@OriginalMember(owner = "client!am", name = "M", descriptor = "Z")
	private final boolean aBoolean29;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIIZIIIIII)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static289.method4662(arg12, arg11));
		this.aClass16_2 = new Class16(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean29 = arg1.anInt6889 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return this.aClass16_2.anInt687;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return this.aClass16_2.method738();
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(B)I")
	@Override
	public int method5640() {
		return this.aClass16_2.method734();
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return this.aClass16_2.anInt672;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		@Pc(18) Class20 local18 = this.aClass16_2.method730(2048, arg0, super.anInt6706, false, super.anInt6695, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class54 local25 = arg0.method6851();
		local25.GA(super.anInt6699 + super.anInt6695, super.anInt6701, super.anInt6696 + super.anInt6706);
		@Pc(41) Class98_Sub8 local41 = null;
		if (this.aBoolean29) {
			local41 = Static348.method5326(1);
		}
		@Pc(53) int local53 = super.anInt6695 >> 9;
		@Pc(58) int local58 = super.anInt6706 >> 9;
		this.aClass16_2.method735(local25, true, local53, local18, local53, arg0, local58, local58);
		if (this.aClass16_2.aClass98_Sub3_3 == null) {
			local18.method7256(local25, local41 == null ? null : local41.aClass98_Sub5Array1[0], 0);
		} else {
			@Pc(79) Class144 local79 = this.aClass16_2.aClass98_Sub3_3.method4532();
			arg0.method6856(local18, local79, local25, local41 == null ? null : local41.aClass98_Sub5Array1[0], 0);
		}
		if (this.aClass277_2 == null) {
			this.aClass277_2 = Static323.method5117(local18, super.anInt6706, super.anInt6701, super.anInt6695);
		} else {
			Static490.method6709(local18, super.anInt6706, super.anInt6701, this.aClass277_2, super.anInt6695);
		}
		return local41;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class20 local24 = this.aClass16_2.method730(131072, arg1, super.anInt6706, false, super.anInt6695, false);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class54 local31 = arg1.method6851();
			local31.GA(super.anInt6699 + super.anInt6695, super.anInt6701, super.anInt6696 + super.anInt6706);
			return local24.method7266(arg2, arg0, local31, false);
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
		@Pc(20) Class20 local20 = this.aClass16_2.method730(262144, arg0, super.anInt6706, false, super.anInt6695, true);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt6695 >> 9;
		@Pc(32) int local32 = super.anInt6706 >> 9;
		@Pc(35) Class54 local35 = arg0.method6851();
		local35.GA(super.anInt6695, super.anInt6701, super.anInt6706);
		this.aClass16_2.method735(local35, false, local27, local20, local27, arg0, local32, local32);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
		this.aClass16_2.method732(arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
		this.aClass16_2.method729(arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return this.aClass16_2.method730(arg1, arg0, 0, false, 0, false);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return this.aClass277_2;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return this.aClass16_2.anInt682;
	}
}
