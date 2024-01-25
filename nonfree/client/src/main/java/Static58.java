import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!no;")
	public static Class173 aClass173_2;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_34 = new Class151("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "[I")
	public static final int[] anIntArray50 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!wf;")
	public static final Class260 aClass260_6 = new Class260();

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_44 = new Class214(82, 1);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
	public static void method886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub3_Sub13 local13 = Static397.method4998(15, 0);
		local13.method3459();
		local13.anInt4301 = arg1;
		local13.anInt4297 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
	public static void method887() {
		Static405.anInt6552 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static146.anInt6161; local3++) {
			@Pc(8) Class147 local8 = Static64.aClass147Array1[local3];
			@Pc(12) int local12;
			if (Static422.anIntArray458 != null) {
				for (local12 = 0; local12 < Static422.anIntArray458.length; local12++) {
					if (Static422.anIntArray458[local12] != -1000000 && (local8.anInt3706 <= Static422.anIntArray458[local12] || local8.anInt3703 <= Static422.anIntArray458[local12]) && (local8.anInt3698 <= Static118.anIntArray96[local12] || local8.anInt3690 <= Static118.anIntArray96[local12]) && (local8.anInt3698 >= Static22.anIntArray25[local12] || local8.anInt3690 >= Static22.anIntArray25[local12]) && (local8.anInt3700 <= Static34.anIntArray41[local12] || local8.anInt3697 <= Static34.anIntArray41[local12]) && (local8.anInt3700 >= Static23.anIntArray26[local12] || local8.anInt3697 >= Static23.anIntArray26[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt3695 == 1) {
				local12 = local8.anInt3691 + Static317.anInt5269 - Static85.anInt4657;
				if (local12 >= 0 && local12 <= Static317.anInt5269 + Static317.anInt5269) {
					local110 = local8.anInt3704 + Static317.anInt5269 - Static179.anInt2929;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static317.anInt5269 + Static317.anInt5269) {
						continue;
					}
					local128 = local8.anInt3699 + Static317.anInt5269 - Static179.anInt2929;
					if (local128 > Static317.anInt5269 + Static317.anInt5269) {
						local128 = Static317.anInt5269 + Static317.anInt5269;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static269.aBooleanArrayArray7[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static332.anInt5443 - local8.anInt3698;
						if (local164 > Static300.anInt5017) {
							local8.anInt3694 = 1;
						} else {
							if (local164 >= -Static300.anInt5017) {
								continue;
							}
							local8.anInt3694 = 2;
							local164 = -local164;
						}
						local8.anInt3692 = (local8.anInt3700 - Static410.anInt6678 << 8) / local164;
						local8.anInt3689 = (local8.anInt3697 - Static410.anInt6678 << 8) / local164;
						local8.anInt3707 = (local8.anInt3706 - Static13.anInt264 << 8) / local164;
						local8.anInt3705 = (local8.anInt3703 - Static13.anInt264 << 8) / local164;
						Static203.aClass147Array2[Static405.anInt6552++] = local8;
					}
				}
			} else if (local8.anInt3695 == 2) {
				local12 = local8.anInt3704 + Static317.anInt5269 - Static179.anInt2929;
				if (local12 >= 0 && local12 <= Static317.anInt5269 + Static317.anInt5269) {
					local110 = local8.anInt3691 + Static317.anInt5269 - Static85.anInt4657;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static317.anInt5269 + Static317.anInt5269) {
						continue;
					}
					local128 = local8.anInt3702 + Static317.anInt5269 - Static85.anInt4657;
					if (local128 > Static317.anInt5269 + Static317.anInt5269) {
						local128 = Static317.anInt5269 + Static317.anInt5269;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static269.aBooleanArrayArray7[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static410.anInt6678 - local8.anInt3700;
						if (local164 > Static300.anInt5017) {
							local8.anInt3694 = 3;
						} else {
							if (local164 >= -Static300.anInt5017) {
								continue;
							}
							local8.anInt3694 = 4;
							local164 = -local164;
						}
						local8.anInt3701 = (local8.anInt3698 - Static332.anInt5443 << 8) / local164;
						local8.anInt3696 = (local8.anInt3690 - Static332.anInt5443 << 8) / local164;
						local8.anInt3707 = (local8.anInt3706 - Static13.anInt264 << 8) / local164;
						local8.anInt3705 = (local8.anInt3703 - Static13.anInt264 << 8) / local164;
						Static203.aClass147Array2[Static405.anInt6552++] = local8;
					}
				}
			} else if (local8.anInt3695 == 4) {
				local12 = local8.anInt3706 - Static13.anInt264;
				if (local12 > Static269.anInt4264) {
					local110 = local8.anInt3704 + Static317.anInt5269 - Static179.anInt2929;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static317.anInt5269 + Static317.anInt5269) {
						continue;
					}
					local128 = local8.anInt3699 + Static317.anInt5269 - Static179.anInt2929;
					if (local128 > Static317.anInt5269 + Static317.anInt5269) {
						local128 = Static317.anInt5269 + Static317.anInt5269;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt3691 + Static317.anInt5269 - Static85.anInt4657;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static317.anInt5269 + Static317.anInt5269) {
						continue;
					}
					local164 = local8.anInt3702 + Static317.anInt5269 - Static85.anInt4657;
					if (local164 > Static317.anInt5269 + Static317.anInt5269) {
						local164 = Static317.anInt5269 + Static317.anInt5269;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static269.aBooleanArrayArray7[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt3694 = 5;
						local8.anInt3701 = (local8.anInt3698 - Static332.anInt5443 << 8) / local12;
						local8.anInt3696 = (local8.anInt3690 - Static332.anInt5443 << 8) / local12;
						local8.anInt3692 = (local8.anInt3700 - Static410.anInt6678 << 8) / local12;
						local8.anInt3689 = (local8.anInt3697 - Static410.anInt6678 << 8) / local12;
						Static203.aClass147Array2[Static405.anInt6552++] = local8;
					}
				}
			}
		}
	}
}
