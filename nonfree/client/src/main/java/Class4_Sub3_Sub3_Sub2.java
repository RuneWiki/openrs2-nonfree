import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub3_Sub3_Sub2 extends Class4_Sub3_Sub3 implements Interface16 {

	@OriginalMember(owner = "client!fi", name = "bb", descriptor = "Lclient!th;")
	private Class348 aClass348_2;

	@OriginalMember(owner = "client!fi", name = "cb", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!fi", name = "Y", descriptor = "Lclient!eo;")
	public final Class100 aClass100_1;

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "Z")
	private final boolean aBoolean177;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ha;Lclient!gba;IIIIIZIIIIIII)V")
	public Class4_Sub3_Sub3_Sub2(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2988 == 1, Static237.method3982(arg12, arg13));
		this.aClass100_1 = new Class100(arg0, arg1, arg12, arg13, super.aByte146, arg3, this, arg7, arg14);
		this.aBoolean177 = arg1.anInt2945 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(12) Class129 local12 = this.aClass100_1.method2139(131072, false, arg2, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class263 local20 = arg2.method6907();
			local20.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
			return Static6.aBoolean9 ? local12.method5302(arg1, arg0, local20, false, 0, Static481.anInt10749) : local12.method5296(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9497(@OriginalArg(0) Class144 arg0) {
		this.aClass100_1.method2144(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)I")
	@Override
	public int method9501() {
		return this.aClass100_1.anInt2246;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
	@Override
	public int method9502() {
		return this.aClass100_1.anInt2254;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
	@Override
	public int method9498() {
		return this.aClass100_1.anInt2256;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9499(@OriginalArg(1) Class144 arg0) {
		this.aClass100_1.method2137(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		@Pc(14) Class129 local14 = this.aClass100_1.method2139(2048, false, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(31) Class263 local31 = arg0.method6907();
		local31.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
		@Pc(45) Class4_Sub9 local45 = Static272.method7693(1, this.aBoolean177);
		this.aClass100_1.method2134(super.aShort107, true, arg0, local31, super.aShort110, super.aShort109, local14, super.aShort108);
		if (Static6.aBoolean9) {
			local14.method5289(local31, local45.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
		} else {
			local14.method5307(local31, local45.aClass4_Sub1Array1[0], 0);
		}
		if (this.aClass100_1.aClass4_Sub8_1 != null) {
			@Pc(95) Class304 local95 = this.aClass100_1.aClass4_Sub8_1.method8671();
			if (Static6.aBoolean9) {
				arg0.method6902(local95, Static481.anInt10749);
			} else {
				arg0.method6903(local95);
			}
		}
		this.aBoolean178 = local14.F() || this.aClass100_1.aClass4_Sub8_1 != null;
		if (this.aClass348_2 == null) {
			this.aClass348_2 = Static260.method4352(local14, super.anInt11178, super.anInt11182, super.anInt11184);
		} else {
			Static125.method1961(super.anInt11178, this.aClass348_2, super.anInt11184, local14, super.anInt11182);
		}
		return local45;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
		@Pc(12) Class129 local12 = this.aClass100_1.method2139(262144, true, arg0, true);
		if (local12 != null) {
			@Pc(17) Class263 local17 = arg0.method6907();
			local17.method8444(super.anInt11184, super.anInt11182, super.anInt11178);
			this.aClass100_1.method2134(super.aShort107, false, arg0, local17, super.aShort110, super.aShort109, local12, super.aShort108);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aBoolean178;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!sea;Z)V")
	public void method2369(@OriginalArg(0) Class328 arg0) {
		this.aClass100_1.method2143(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9496() {
		return this.aClass100_1.method2140();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		return arg0 == 14603 ? this.aClass100_1.method2132(-17644) : 20;
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	@Override
	public void method9500() {
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		return this.aClass348_2;
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return this.aClass100_1.method2136();
	}
}
