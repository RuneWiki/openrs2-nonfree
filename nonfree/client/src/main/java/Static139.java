import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!mk", name = "lb", descriptor = "[I")
	public static int[] anIntArray261;

	@OriginalMember(owner = "client!mk", name = "bb", descriptor = "I")
	public static int anInt3092 = 0;

	@OriginalMember(owner = "client!mk", name = "fb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_836 = Static231.method3737("gleiten:");

	@OriginalMember(owner = "client!mk", name = "hb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_837 = Static231.method3737("null");

	@OriginalMember(owner = "client!mk", name = "tb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_838 = Static231.method3737("scape main");

	@OriginalMember(owner = "client!mk", name = "xb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_839 = Static231.method3737("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)Lclient!di;")
	public static Class30 method2340(@OriginalArg(1) int arg0) {
		@Pc(10) Class30 local10 = (Class30) Static218.aClass61_87.method1693((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static189.aClass28_65.method819(Static203.method185(arg0), Static219.method3597(arg0));
		local10 = new Class30();
		local10.anInt964 = arg0;
		if (local24 != null) {
			local10.method863(new Class1_Sub26(local24));
		}
		local10.method866();
		Static218.aClass61_87.method1694((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(III)Lclient!qc;")
	public static Class97 method2341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass97_1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!vf;B)V")
	public static void method2342(@OriginalArg(0) Class1_Sub26 arg0) {
		while (arg0.aByteArray52.length > arg0.anInt4021) {
			@Pc(16) boolean local16 = false;
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = 0;
			if (arg0.method2945() == 1) {
				local18 = arg0.method2945();
				local16 = true;
				local20 = arg0.method2945();
			}
			@Pc(41) int local41 = arg0.method2945();
			@Pc(45) int local45 = arg0.method2945();
			@Pc(52) int local52 = local41 * 64 - Static101.anInt2179;
			@Pc(63) int local63 = Static64.anInt1525 + Static152.anInt3375 - local45 * 64 - 1;
			@Pc(83) int local83;
			@Pc(89) int local89;
			if (local52 >= 0 && local63 - 63 >= 0 && local52 + 63 < Static170.anInt3706 && local63 < Static152.anInt3375) {
				local83 = local52 >> 6;
				local89 = local63 >> 6;
				for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
					for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
						if (!local16 || local18 * 8 <= local151 && local151 < local18 * 8 + 8 && local155 >= local20 * 8 && local155 < local20 * 8 + 8) {
							@Pc(201) int local201 = arg0.method2945();
							if (local201 != 0) {
								@Pc(215) int local215;
								if ((local201 & 0x1) == 1) {
									local215 = arg0.method2945();
									if (Static212.aByteArrayArrayArray12[local83][local89] == null) {
										Static212.aByteArrayArrayArray12[local83][local89] = new byte[4096];
									}
									Static212.aByteArrayArrayArray12[local83][local89][(63 - local155 << 6) + local151] = (byte) local215;
								}
								if ((local201 & 0x2) == 2) {
									local215 = arg0.method2964();
									if (Static88.aShortArrayArrayArray1[local83][local89] == null) {
										Static88.aShortArrayArrayArray1[local83][local89] = new short[4096];
									}
									Static88.aShortArrayArrayArray1[local83][local89][local151 + (63 - local155 << 6)] = (short) local215;
								}
								if ((local201 & 0x4) == 4) {
									local215 = ((arg0.method2945() & 0xFF) << 16) + ((arg0.method2945() & 0xFF) << 8) + (arg0.method2945() & 0xFF);
									if (Static223.anIntArrayArrayArray12[local83][local89] == null) {
										Static223.anIntArrayArrayArray12[local83][local89] = new int[4096];
									}
									local215--;
									@Pc(330) Class101 local330 = Static170.method2725(local215);
									if (local330.anIntArray338 != null) {
										local330 = local330.method2851();
										if (local330 == null || local330.anInt3917 == -1) {
											continue;
										}
									}
									Static223.anIntArrayArrayArray12[local83][local89][local151 + (63 - local155 << 6)] = local330.anInt3903 + 1;
									@Pc(367) Class1_Sub25 local367 = new Class1_Sub25();
									local367.anInt3754 = local52;
									local367.anInt3763 = local330.anInt3917;
									local367.anInt3755 = local63;
									Static199.aClass120_20.method3567(local367);
								}
							}
						}
					}
				}
			} else {
				for (local83 = 0; local83 < (local16 ? 64 : 4096); local83++) {
					local89 = arg0.method2945();
					if (local89 != 0) {
						if ((local89 & 0x1) == 1) {
							arg0.anInt4021++;
						}
						if ((local89 & 0x2) == 2) {
							arg0.anInt4021 += 2;
						}
						if ((local89 & 0x4) == 4) {
							arg0.anInt4021 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!jb;IZ)Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1 method2343(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		return Static23.method421(arg0, arg1) ? Static133.method2211() : null;
	}
}
