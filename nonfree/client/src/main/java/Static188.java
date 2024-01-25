import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
	public static int anInt3789 = 0;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public static int anInt3791 = 0;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	public static int anInt3795 = -1;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!ci;Lclient!l;I)V")
	public static void method3404(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Interface4 arg1) {
		Static2.anInterface4_1 = arg1;
		Static194.aClass38_43 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!wn;)Lclient!om;")
	public static Class187 method3405(@OriginalArg(1) Class4_Sub20 arg0) {
		@Pc(11) Class187 local11 = new Class187();
		local11.anInt5359 = arg0.method4560();
		local11.aClass4_Sub1_Sub4_1 = Static135.aClass75_2.method2200(local11.anInt5359);
		return local11;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BZ)V")
	public static void method3406(@OriginalArg(1) boolean arg0) {
		Static316.anInt5738 = 0;
		Static222.anInt4450 = 0;
		Static272.method4368();
		Static133.method2463(arg0);
		Static325.method4859();
		@Pc(20) boolean local20 = false;
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static316.anInt5738; local22++) {
			local28 = Static259.anIntArray382[local22];
			@Pc(35) Class4_Sub44 local35 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local28);
			@Pc(38) Class11_Sub5_Sub2_Sub2 local38 = local35.aClass11_Sub5_Sub2_Sub2_2;
			if (Static87.aBoolean142 && Static7.method75(local28)) {
				Static459.method5986();
			}
			if (Static277.anInt2834 != local38.anInt6475) {
				if (local38.aClass241_1.method5597()) {
					Static371.method5250(local38);
				}
				local38.method5311(null);
				local35.method6330();
				local20 = true;
			}
		}
		if (local20) {
			Static328.anInt5871 = Static80.aClass96_8.method2807();
			Static80.aClass96_8.method2800(Static154.aClass4_Sub44Array1);
		}
		if (Static136.anInt2819 != Static196.aClass4_Sub20_Sub1_4.anInt5526) {
			throw new RuntimeException("gnp1 pos:" + Static196.aClass4_Sub20_Sub1_4.anInt5526 + " psize:" + Static136.anInt2819);
		}
		for (local28 = 0; local28 < Static77.anInt1870; local28++) {
			if (Static80.aClass96_8.method2797((long) Static2.anIntArray1[local28]) == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static77.anInt1870);
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public static void method3407() {
		if (Static367.aBoolean546) {
			return;
		}
		Static110.aBoolean165 = true;
		Static367.aBoolean546 = true;
		if (Static157.aClass185_Sub1_1.aBoolean393) {
			Static43.aFloat26 = (int) Static43.aFloat26 - 17 & 0xFFFFFFF0;
		} else {
			Static275.aFloat76 += (-Static275.aFloat76 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!ki;)I")
	public static int method3408(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt4170;
		@Pc(18) Class231 local18 = arg0.method5306();
		if (arg0.aBoolean475) {
			local14 = arg0.anInt4175;
		} else if (local18.anInt6389 == arg0.anInt6484 || local18.anInt6423 == arg0.anInt6484 || local18.anInt6397 == arg0.anInt6484 || arg0.anInt6484 == local18.anInt6404) {
			local14 = arg0.anInt4157;
		} else if (arg0.anInt6484 == local18.anInt6422 || local18.anInt6414 == arg0.anInt6484 || arg0.anInt6484 == local18.anInt6396 || arg0.anInt6484 == local18.anInt6412) {
			local14 = arg0.anInt4182;
		}
		return local14;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method3409(@OriginalArg(1) Class240 arg0) {
		@Pc(7) Class240 local7 = Static71.method1564(arg0);
		@Pc(16) int local16;
		@Pc(18) int local18;
		if (local7 == null) {
			local16 = Static374.anInt6595;
			local18 = Static30.anInt518;
		} else {
			local18 = local7.anInt6894;
			local16 = local7.anInt6904;
		}
		Static110.method2180(arg0, local18, local16, false);
		Static184.method3358(local16, local18, arg0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!tf;I)V")
	public static void method3410(@OriginalArg(0) Class240 arg0) {
		if (arg0.anInt6873 == 5 && arg0.anInt6876 != -1) {
			Static361.method5181(Static30.aClass30_3, arg0);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public static void method3411() {
		if (Static30.aClass30_3 == null) {
			return;
		}
		Static224.aClass273_1.method6243();
		Static310.method4732();
		Static391.method5497();
		Static338.method4977();
		Static178.method3294();
		Static420.method5851();
		if (Static91.aClass265_1 != null) {
			Static91.aClass265_1.method6064();
		}
		Static251.method4120();
		Static72.method1587();
		Static138.method2560();
		Static35.method519(false);
		Static165.method2910();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class11_Sub5_Sub2_Sub1 local47 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local41];
			if (local47 != null) {
				local47.aClass4_Sub46_3 = null;
				for (@Pc(54) int local54 = 0; local54 < local47.aClass57Array3.length; local54++) {
					local47.aClass57Array3[local54] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static328.anInt5871; local73++) {
			@Pc(80) Class11_Sub5_Sub2_Sub2 local80 = Static154.aClass4_Sub44Array1[local73].aClass11_Sub5_Sub2_Sub2_2;
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < local80.aClass57Array3.length; local84++) {
					local80.aClass57Array3[local84] = null;
				}
			}
		}
		Static117.aClass72_5 = null;
		Static113.aClass72_2 = null;
		Static30.aClass30_3.method2086();
		Static30.aClass30_3 = null;
	}
}
