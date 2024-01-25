import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
	public static final int[] anIntArray626 = new int[500];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
	public static void method7851(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static555.method7833();
		if (arg2 == 0) {
			Static546.aClass132_13 = Static513.method7271(Static630.aClass8_97, Static251.anInterface6_5, 0, Static96.aClass6_Sub22_7.aClass29_Sub6_1.method1664() * 2, Static140.aCanvas1);
			if (arg0 != null) {
				Static546.aClass132_13.GA(0);
				@Pc(180) Class151 local180 = Static462.method6858(Static466.aClass8_114, Static332.anInt7616);
				@Pc(189) Class19 local189 = Static546.aClass132_13.method7518(local180, Static681.method2323(Static624.aClass8_139, Static332.anInt7616));
				Static240.method3600();
				Static500.method7180(local180, Static546.aClass132_13, true, local189, arg0);
			}
		} else {
			@Pc(11) Class132 local11 = null;
			@Pc(41) Class19 local41;
			if (arg0 != null) {
				local11 = Static513.method7271(Static630.aClass8_97, Static251.anInterface6_5, 0, 0, Static140.aCanvas1);
				local11.GA(0);
				@Pc(32) Class151 local32 = Static462.method6858(Static466.aClass8_114, Static332.anInt7616);
				local41 = local11.method7518(local32, Static681.method2323(Static624.aClass8_139, Static332.anInt7616));
				Static240.method3600();
				Static500.method7180(local32, local11, true, local41, arg0);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static546.aClass132_13 = Static513.method7271(Static630.aClass8_97, Static251.anInterface6_5, arg2, Static96.aClass6_Sub22_7.aClass29_Sub6_1.method1664() * 2, Static140.aCanvas1);
					if (arg0 != null) {
						local11.GA(0);
						@Pc(74) Class151 local74 = Static462.method6858(Static466.aClass8_114, Static332.anInt7616);
						@Pc(83) Class19 local83 = local11.method7518(local74, Static681.method2323(Static624.aClass8_139, Static332.anInt7616));
						Static240.method3600();
						Static500.method7180(local74, local11, true, local83, arg0);
					}
					if (Static546.aClass132_13.method7508()) {
						@Pc(97) boolean local97 = true;
						try {
							local97 = Static296.aClass6_Sub33_1.anInt4998 > 256;
						} catch (@Pc(107) Throwable local107) {
						}
						@Pc(113) Class6_Sub20 local113;
						if (local97) {
							local113 = Static546.aClass132_13.method7453(146800640);
						} else {
							local113 = Static546.aClass132_13.method7453(104857600);
						}
						Static546.aClass132_13.method7483(local113);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(124) Throwable local124) {
					@Pc(129) int local129 = Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742();
					if (local129 == 2) {
						Static211.aBoolean214 = true;
					}
					Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_2, 0);
					method7851(arg0, arg1, local129);
					@Pc(146) Object local146 = null;
					var14 = false;
				} finally {
					if (var14) {
						local41 = null;
						if (local11 != null) {
							try {
								local11.method7491();
							} catch (@Pc(338) Throwable local338) {
							}
						}
					}
				}
				if (local11 != null) {
					try {
						local11.method7491();
					} catch (@Pc(318) Throwable local318) {
					}
				}
				return;
			}
			local41 = null;
			if (local11 != null) {
				try {
					local11.method7491();
				} catch (@Pc(328) Throwable local328) {
				}
			}
		}
		Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5743(!arg1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_2, arg2);
		Static281.method4109();
		Static546.aClass132_13.method7519();
		Static546.aClass132_13.X(32);
		Static185.aClass207_13 = Static546.aClass132_13.method7467();
		Static347.aClass207_39 = Static546.aClass132_13.method7467();
		Static665.method9027();
		Static546.aClass132_13.method7502(Static96.aClass6_Sub22_7.aClass29_Sub8_1.method1719() == 1);
		if (Static546.aClass132_13.method7470()) {
			Static119.method1849(Static96.aClass6_Sub22_7.aClass29_Sub26_1.method8504() == 1);
		}
		Static213.method3112(Static546.aClass132_13, Static393.anInt6574 >> 3, Static491.anInt9856 >> 3);
		Static139.method2087();
		Static558.aBoolean680 = true;
		Static274.aBoolean301 = false;
		Static506.aClass382Array1 = null;
		Static49.method969();
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method7853() {
		if (Static417.anInt7258 < 0) {
			Static417.anInt7258 = 0;
			Static428.anInt7352 = -1;
			Static360.anInt9757 = -1;
		}
		if (Static417.anInt7258 > Static528.anInt5364) {
			Static417.anInt7258 = Static528.anInt5364;
			Static360.anInt9757 = -1;
			Static428.anInt7352 = -1;
		}
		if (Static490.anInt8337 < 0) {
			Static360.anInt9757 = -1;
			Static490.anInt8337 = 0;
			Static428.anInt7352 = -1;
		}
		if (Static490.anInt8337 > Static528.anInt5369) {
			Static428.anInt7352 = -1;
			Static490.anInt8337 = Static528.anInt5369;
			Static360.anInt9757 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
	public static int method7855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static312.aByteArrayArray25 == null ? 0 : Static312.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!vt;)[Lclient!wb;")
	public static Class382[] method7857(@OriginalArg(1) Class380 arg0) {
		if (!arg0.method8819()) {
			return new Class382[0];
		}
		@Pc(21) Class103 local21 = arg0.method8823();
		while (local21.anInt2541 == 0) {
			Static520.method7923(10L);
		}
		if (local21.anInt2541 == 2) {
			return new Class382[0];
		}
		@Pc(45) int[] local45 = (int[]) local21.anObject9;
		@Pc(51) Class382[] local51 = new Class382[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class382 local59 = new Class382();
			local51[local53] = local59;
			local59.anInt10494 = local45[local53 << 2];
			local59.anInt10491 = local45[(local53 << 2) + 1];
			local59.anInt10499 = local45[(local53 << 2) + 2];
			local59.anInt10495 = local45[(local53 << 2) + 3];
		}
		return local51;
	}
}
