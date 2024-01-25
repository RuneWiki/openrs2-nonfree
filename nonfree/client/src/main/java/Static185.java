import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public static int anInt3405;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_36 = new Class171(41, 6);

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[5];

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!nq;")
	public static final Class255 aClass255_1 = new Class255(true);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ika;)V")
	public static void method2896(@OriginalArg(0) Class165 arg0) {
		if (Static619.anInt10271 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub13 local6 = arg0.aClass3_Sub13_1;
		Static192.aClass165Array1[Static619.anInt10271] = arg0;
		Static44.aBooleanArray3[Static619.anInt10271] = false;
		Static619.anInt10271++;
		@Pc(21) int local21 = arg0.anInt4514;
		if (arg0.aBoolean303) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4514;
		if (arg0.aBoolean302) {
			local29 = Static247.anInt4367 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5960() + Static579.anInt9391 - local6.method5962() >> Static571.anInt9216;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5960() + local6.method5962() - Static579.anInt9391 >> Static571.anInt9216;
			if (local73 >= Static155.anInt2874) {
				local73 = Static155.anInt2874 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray58[local41++];
				@Pc(105) int local105 = (local6.method5958() + Static579.anInt9391 - local6.method5962() >> Static571.anInt9216) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static133.anInt2551) {
					local113 = Static133.anInt2551 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static231.aLongArrayArrayArray3[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static231.aLongArrayArrayArray3[local38][local126][local82] = local135 | (long) Static619.anInt10271;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static231.aLongArrayArrayArray3[local38][local126][local82] = local135 | (long) Static619.anInt10271 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static231.aLongArrayArrayArray3[local38][local126][local82] = local135 | (long) Static619.anInt10271 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static231.aLongArrayArrayArray3[local38][local126][local82] = local135 | (long) Static619.anInt10271 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z")
	public static boolean method2900(@OriginalArg(1) int arg0) {
		if (Static375.aBooleanArray25[arg0]) {
			return true;
		} else if (Static192.aClass362_40.method8338(arg0)) {
			@Pc(31) int local31 = Static192.aClass362_40.method8355(arg0);
			if (local31 == 0) {
				Static375.aBooleanArray25[arg0] = true;
				return true;
			}
			if (Static270.aClass265ArrayArray2[arg0] == null) {
				Static270.aClass265ArrayArray2[arg0] = new Class265[local31];
			}
			for (@Pc(50) int local50 = 0; local50 < local31; local50++) {
				if (Static270.aClass265ArrayArray2[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static192.aClass362_40.method8368(arg0, local50);
					if (local64 != null) {
						@Pc(76) Class265 local76 = Static270.aClass265ArrayArray2[arg0][local50] = new Class265();
						local76.anInt7032 = (arg0 << 16) + local50;
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method5912(new Class3_Sub4(local64));
					}
				}
			}
			Static375.aBooleanArray25[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
	public static void method2901() {
		Static459.aClass3_Sub4_Sub1_1.method334();
		@Pc(18) int local18 = Static459.aClass3_Sub4_Sub1_1.method333(8);
		@Pc(23) int local23;
		if (local18 < Static52.anInt1140) {
			for (local23 = local18; local23 < Static52.anInt1140; local23++) {
				Static545.anIntArray466[Static502.anInt7943++] = Static603.anIntArray537[local23];
			}
		}
		if (local18 > Static52.anInt1140) {
			throw new RuntimeException("gnpov1");
		}
		Static52.anInt1140 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(57) int local57 = Static603.anIntArray537[local23];
			@Pc(65) Class34_Sub1_Sub1_Sub2_Sub2 local65 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) local57)).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			@Pc(70) int local70 = Static459.aClass3_Sub4_Sub1_1.method333(1);
			if (local70 == 0) {
				Static603.anIntArray537[Static52.anInt1140++] = local57;
				local65.anInt9667 = Static630.anInt10418;
			} else {
				@Pc(90) int local90 = Static459.aClass3_Sub4_Sub1_1.method333(2);
				if (local90 == 0) {
					Static603.anIntArray537[Static52.anInt1140++] = local57;
					local65.anInt9667 = Static630.anInt10418;
					Static388.anIntArray342[Static317.anInt5304++] = local57;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local90 == 1) {
						Static603.anIntArray537[Static52.anInt1140++] = local57;
						local65.anInt9667 = Static630.anInt10418;
						local137 = Static459.aClass3_Sub4_Sub1_1.method333(3);
						local65.method7881(local137, 1);
						local147 = Static459.aClass3_Sub4_Sub1_1.method333(1);
						if (local147 == 1) {
							Static388.anIntArray342[Static317.anInt5304++] = local57;
						}
					} else if (local90 == 2) {
						Static603.anIntArray537[Static52.anInt1140++] = local57;
						local65.anInt9667 = Static630.anInt10418;
						if (Static459.aClass3_Sub4_Sub1_1.method333(1) == 1) {
							local137 = Static459.aClass3_Sub4_Sub1_1.method333(3);
							local65.method7881(local137, 2);
							local147 = Static459.aClass3_Sub4_Sub1_1.method333(3);
							local65.method7881(local147, 2);
						} else {
							local137 = Static459.aClass3_Sub4_Sub1_1.method333(3);
							local65.method7881(local137, 0);
						}
						local137 = Static459.aClass3_Sub4_Sub1_1.method333(1);
						if (local137 == 1) {
							Static388.anIntArray342[Static317.anInt5304++] = local57;
						}
					} else if (local90 == 3) {
						Static545.anIntArray466[Static502.anInt7943++] = local57;
					}
				}
			}
		}
	}
}
