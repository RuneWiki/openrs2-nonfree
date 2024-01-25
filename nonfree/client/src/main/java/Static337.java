import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_114 = new Class73(52, 4);

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_115 = new Class73(2, 2);

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
	public static int anInt6701 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!bi;)V")
	public static void method5603(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub8_Sub1 arg1) {
		@Pc(15) boolean local15 = arg1.method1512(1) == 1;
		if (local15) {
			Static125.anIntArray119[Static76.anInt2534++] = arg0;
		}
		@Pc(30) int local30 = arg1.method1512(2);
		@Pc(34) Class9_Sub4_Sub2_Sub1_Sub2 local34 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[arg0];
		if (local30 != 0) {
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local30 == 1) {
				local146 = arg1.method1512(3);
				local151 = local34.anIntArray197[0];
				local156 = local34.anIntArray198[0];
				if (local146 == 0) {
					local151--;
					local156--;
				} else if (local146 == 1) {
					local156--;
				} else if (local146 == 2) {
					local156--;
					local151++;
				} else if (local146 == 3) {
					local151--;
				} else if (local146 == 4) {
					local151++;
				} else if (local146 == 5) {
					local156++;
					local151--;
				} else if (local146 == 6) {
					local156++;
				} else if (local146 == 7) {
					local151++;
					local156++;
				}
				if (local15) {
					local34.anInt4394 = local156;
					local34.aBoolean356 = true;
					local34.anInt4370 = local151;
				} else {
					local34.method3636(local151, local156, Static340.aByteArray57[arg0]);
				}
			} else if (local30 == 2) {
				local146 = arg1.method1512(4);
				local151 = local34.anIntArray197[0];
				local156 = local34.anIntArray198[0];
				if (local146 == 0) {
					local151 -= 2;
					local156 -= 2;
				} else if (local146 == 1) {
					local156 -= 2;
					local151--;
				} else if (local146 == 2) {
					local156 -= 2;
				} else if (local146 == 3) {
					local151++;
					local156 -= 2;
				} else if (local146 == 4) {
					local151 += 2;
					local156 -= 2;
				} else if (local146 == 5) {
					local151 -= 2;
					local156--;
				} else if (local146 == 6) {
					local151 += 2;
					local156--;
				} else if (local146 == 7) {
					local151 -= 2;
				} else if (local146 == 8) {
					local151 += 2;
				} else if (local146 == 9) {
					local156++;
					local151 -= 2;
				} else if (local146 == 10) {
					local151 += 2;
					local156++;
				} else if (local146 == 11) {
					local156 += 2;
					local151 -= 2;
				} else if (local146 == 12) {
					local151--;
					local156 += 2;
				} else if (local146 == 13) {
					local156 += 2;
				} else if (local146 == 14) {
					local151++;
					local156 += 2;
				} else if (local146 == 15) {
					local151 += 2;
					local156 += 2;
				}
				if (local15) {
					local34.anInt4394 = local156;
					local34.aBoolean356 = true;
					local34.anInt4370 = local151;
				} else {
					local34.method3636(local151, local156, Static340.aByteArray57[arg0]);
				}
			} else {
				local146 = arg1.method1512(1);
				@Pc(422) int local422;
				@Pc(432) int local432;
				@Pc(443) int local443;
				@Pc(451) int local451;
				if (local146 == 0) {
					local151 = arg1.method1512(12);
					local156 = local151 >> 10;
					local422 = local151 >> 5 & 0x1F;
					if (local422 > 15) {
						local422 -= 32;
					}
					local432 = local151 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local443 = local422 + local34.anIntArray197[0];
					local451 = local34.anIntArray198[0] + local432;
					if (local15) {
						local34.anInt4370 = local443;
						local34.aBoolean356 = true;
						local34.anInt4394 = local451;
					} else {
						local34.method3636(local443, local451, Static340.aByteArray57[arg0]);
					}
					local34.aByte135 = local34.aByte134 = (byte) (local156 + local34.aByte135 & 0x3);
					if (Static3.method52(local451, local443)) {
						local34.aByte134++;
					}
					if (Static238.anInt5268 == arg0) {
						if (local34.aByte135 != Static86.anInt10575) {
							Static610.aBoolean810 = true;
						}
						Static86.anInt10575 = local34.aByte135;
					}
				} else {
					local151 = arg1.method1512(30);
					local156 = local151 >> 28;
					local422 = local151 >> 14 & 0x3FFF;
					local432 = local151 & 0x3FFF;
					local443 = (local34.anIntArray197[0] + Static477.anInt8412 + local422 & 0x3FFF) - Static477.anInt8412;
					local451 = (local432 + Static227.anInt5049 + local34.anIntArray198[0] & 0x3FFF) - Static227.anInt5049;
					if (local15) {
						local34.anInt4394 = local451;
						local34.anInt4370 = local443;
						local34.aBoolean356 = true;
					} else {
						local34.method3636(local443, local451, Static340.aByteArray57[arg0]);
					}
					local34.aByte135 = local34.aByte134 = (byte) (local34.aByte135 + local156 & 0x3);
					if (Static3.method52(local451, local443)) {
						local34.aByte134++;
					}
					if (arg0 == Static238.anInt5268) {
						Static86.anInt10575 = local34.aByte135;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean356 = false;
		} else if (arg0 == Static238.anInt5268) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(62) Class379 local62 = Static530.aClass379Array1[arg0] = new Class379();
			local62.anInt10723 = (Static227.anInt5049 + local34.anIntArray198[0] >> 6) + (local34.anIntArray197[0] + Static477.anInt8412 >> 6 << 14) + (local34.aByte135 << 28);
			if (local34.anInt4362 == -1) {
				local62.anInt10721 = local34.aClass332_7.method7925();
			} else {
				local62.anInt10721 = local34.anInt4362;
			}
			local62.aBoolean845 = local34.aBoolean357;
			local62.anInt10724 = local34.anInt4293;
			if (local34.anInt4374 > 0) {
				Static383.method6041(local34);
			}
			Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[arg0] = null;
			if (arg1.method1512(1) != 0) {
				Static602.method8315(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method5604(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static270.method4845(arg0, local13);
		} else if (arg1 instanceof Class324) {
			@Pc(34) Class324 local34 = (Class324) arg1;
			return local34.method8089(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
