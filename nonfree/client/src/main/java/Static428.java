import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray59;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[6][];

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Lclient!di;")
	public static final Class54 aClass54_103 = new Class54(56, 7);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BILclient!vc;)V")
	public static void method5623(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub23_Sub2 arg1) {
		@Pc(15) boolean local15 = arg1.method5519(1) == 1;
		if (local15) {
			Static344.anIntArray506[Static404.anInt6735++] = arg0;
		}
		@Pc(30) int local30 = arg1.method5519(2);
		@Pc(34) Class3_Sub2_Sub1_Sub2 local34 = Static74.aClass3_Sub2_Sub1_Sub2Array1[arg0];
		if (local30 != 0) {
			@Pc(153) int local153;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local30 == 1) {
				local153 = arg1.method5519(3);
				local158 = local34.anIntArray525[0];
				local163 = local34.anIntArray524[0];
				if (local153 == 0) {
					local158--;
					local163--;
				} else if (local153 == 1) {
					local163--;
				} else if (local153 == 2) {
					local163--;
					local158++;
				} else if (local153 == 3) {
					local158--;
				} else if (local153 == 4) {
					local158++;
				} else if (local153 == 5) {
					local158--;
					local163++;
				} else if (local153 == 6) {
					local163++;
				} else if (local153 == 7) {
					local158++;
					local163++;
				}
				if (local15) {
					local34.anInt6222 = local158;
					local34.anInt6212 = local163;
					local34.aBoolean431 = true;
				} else {
					local34.method4938(local163, local158, Static160.aByteArray86[arg0]);
				}
			} else if (local30 == 2) {
				local153 = arg1.method5519(4);
				local158 = local34.anIntArray525[0];
				local163 = local34.anIntArray524[0];
				if (local153 == 0) {
					local158 -= 2;
					local163 -= 2;
				} else if (local153 == 1) {
					local158--;
					local163 -= 2;
				} else if (local153 == 2) {
					local163 -= 2;
				} else if (local153 == 3) {
					local163 -= 2;
					local158++;
				} else if (local153 == 4) {
					local163 -= 2;
					local158 += 2;
				} else if (local153 == 5) {
					local163--;
					local158 -= 2;
				} else if (local153 == 6) {
					local158 += 2;
					local163--;
				} else if (local153 == 7) {
					local158 -= 2;
				} else if (local153 == 8) {
					local158 += 2;
				} else if (local153 == 9) {
					local163++;
					local158 -= 2;
				} else if (local153 == 10) {
					local163++;
					local158 += 2;
				} else if (local153 == 11) {
					local158 -= 2;
					local163 += 2;
				} else if (local153 == 12) {
					local158--;
					local163 += 2;
				} else if (local153 == 13) {
					local163 += 2;
				} else if (local153 == 14) {
					local163 += 2;
					local158++;
				} else if (local153 == 15) {
					local163 += 2;
					local158 += 2;
				}
				if (local15) {
					local34.anInt6212 = local163;
					local34.anInt6222 = local158;
					local34.aBoolean431 = true;
				} else {
					local34.method4938(local163, local158, Static160.aByteArray86[arg0]);
				}
			} else {
				local153 = arg1.method5519(1);
				@Pc(431) int local431;
				@Pc(439) int local439;
				@Pc(452) int local452;
				@Pc(460) int local460;
				if (local153 == 0) {
					local158 = arg1.method5519(12);
					local163 = local158 >> 10;
					local431 = local158 >> 5 & 0x1F;
					if (local431 > 15) {
						local431 -= 32;
					}
					local439 = local158 & 0x1F;
					if (local439 > 15) {
						local439 -= 32;
					}
					local452 = local431 + local34.anIntArray525[0];
					local460 = local34.anIntArray524[0] + local439;
					if (local15) {
						local34.anInt6212 = local460;
						local34.anInt6222 = local452;
						local34.aBoolean431 = true;
					} else {
						local34.method4938(local460, local452, Static160.aByteArray86[arg0]);
					}
					local34.aByte89 = (byte) (local34.aByte89 + local163 & 0x3);
					if (arg0 == Static399.anInt6656) {
						Static383.anInt6436 = local34.aByte89;
					}
				} else {
					local158 = arg1.method5519(30);
					local163 = local158 >> 28;
					local431 = local158 >> 14 & 0x3FFF;
					local439 = local158 & 0x3FFF;
					local452 = (Static48.anInt962 + local34.anIntArray525[0] + local431 & 0x3FFF) - Static48.anInt962;
					local460 = (local439 + Static324.anInt5624 + local34.anIntArray524[0] & 0x3FFF) - Static324.anInt5624;
					if (local15) {
						local34.anInt6212 = local460;
						local34.anInt6222 = local452;
						local34.aBoolean431 = true;
					} else {
						local34.method4938(local460, local452, Static160.aByteArray86[arg0]);
					}
					local34.aByte89 = (byte) (local163 + local34.aByte89 & 0x3);
					if (Static399.anInt6656 == arg0) {
						Static383.anInt6436 = local34.aByte89;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean431 = false;
		} else if (Static399.anInt6656 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(69) Class224 local69 = Static171.aClass224Array1[arg0] = new Class224();
			local69.anInt6249 = (Static324.anInt5624 + local34.anIntArray524[0] >> 6) + (local34.anIntArray525[0] + Static48.anInt962 >> 6 << 14) + (local34.aByte89 << 28);
			if (local34.anInt6209 == -1) {
				local69.anInt6255 = local34.aClass266_7.method5718();
			} else {
				local69.anInt6255 = local34.anInt6209;
			}
			local69.anInt6251 = local34.anInt6167;
			local69.aBoolean436 = local34.aBoolean432;
			if (local34.anInt6226 > 0) {
				Static389.method5170(local34);
			}
			Static74.aClass3_Sub2_Sub1_Sub2Array1[arg0] = null;
			if (arg1.method5519(1) != 0) {
				Static239.method3692(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!em;II)V")
	public static void method5624(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(3) int arg2) {
		Static150.anInt4216 = arg2;
		Static131.aClass68_4 = arg1;
		Static249.anInt4713 = arg0;
	}
}
