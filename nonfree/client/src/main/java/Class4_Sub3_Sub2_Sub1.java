import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class4_Sub3_Sub2_Sub1 extends Class4_Sub3_Sub2 implements Interface16 {

	@OriginalMember(owner = "client!hba", name = "hb", descriptor = "Lclient!th;")
	private Class348 aClass348_3;

	@OriginalMember(owner = "client!hba", name = "db", descriptor = "Z")
	private boolean aBoolean268 = true;

	@OriginalMember(owner = "client!hba", name = "O", descriptor = "Lclient!eo;")
	public final Class100 aClass100_2;

	@OriginalMember(owner = "client!hba", name = "V", descriptor = "Z")
	private final boolean aBoolean269;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!ha;Lclient!gba;IIIIIZII)V")
	public Class4_Sub3_Sub2_Sub1(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt2974);
		this.aClass100_2 = new Class100(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean269 = arg1.anInt2945 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return this.aClass100_2.method2136();
	}

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		return false;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)I")
	@Override
	public int method9502() {
		return this.aClass100_2.anInt2254;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	@Override
	public void method9500() {
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
		@Pc(12) Class129 local12 = this.aClass100_2.method2139(262144, true, arg0, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt11184 >> 9;
		@Pc(24) int local24 = super.anInt11178 >> 9;
		@Pc(27) Class263 local27 = arg0.method6907();
		local27.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
		this.aClass100_2.method2134(local19, false, arg0, local27, local24, local24, local12, local19);
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		@Pc(14) Class129 local14 = this.aClass100_2.method2139(2048, false, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class263 local22 = arg0.method6907();
		local22.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
		@Pc(45) Class4_Sub9 local45 = Static272.method7693(1, this.aBoolean269);
		@Pc(50) int local50 = super.anInt11184 >> 9;
		@Pc(55) int local55 = super.anInt11178 >> 9;
		this.aClass100_2.method2134(local50, true, arg0, local22, local55, local55, local14, local50);
		if (Static6.aBoolean9) {
			local14.method5289(local22, local45.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
		} else {
			local14.method5307(local22, local45.aClass4_Sub1Array1[0], 0);
		}
		if (this.aClass100_2.aClass4_Sub8_1 != null) {
			@Pc(101) Class304 local101 = this.aClass100_2.aClass4_Sub8_1.method8671();
			if (Static6.aBoolean9) {
				arg0.method6902(local101, Static481.anInt10749);
			} else {
				arg0.method6903(local101);
			}
		}
		this.aBoolean268 = local14.F() || this.aClass100_2.aClass4_Sub8_1 != null;
		if (this.aClass348_3 == null) {
			this.aClass348_3 = Static260.method4352(local14, super.anInt11178, super.anInt11182, super.anInt11184);
		} else {
			Static125.method1961(super.anInt11178, this.aClass348_3, super.anInt11184, local14, super.anInt11182);
		}
		return local45;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		return this.aClass348_3;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(12) Class129 local12 = this.aClass100_2.method2139(131072, false, arg2, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class263 local20 = arg2.method6907();
			local20.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
			return Static6.aBoolean9 ? local12.method5302(arg1, arg0, local20, false, 0, Static481.anInt10749) : local12.method5296(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9497(@OriginalArg(0) Class144 arg0) {
		this.aClass100_2.method2144(arg0);
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)I")
	@Override
	public int method9498() {
		return this.aClass100_2.anInt2256;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLclient!sea;)V")
	public void method3243(@OriginalArg(1) Class328 arg0) {
		this.aClass100_2.method2143(arg0);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9496() {
		return this.aClass100_2.method2140();
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(B)I")
	@Override
	public int method9501() {
		return this.aClass100_2.anInt2246;
	}

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return false;
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aBoolean268;
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		if (arg0 != 14603) {
			this.method9491((Class144) null);
		}
		return this.aClass100_2.method2132(-17644);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9499(@OriginalArg(1) Class144 arg0) {
		this.aClass100_2.method2137(arg0);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		throw new IllegalStateException();
	}
}
