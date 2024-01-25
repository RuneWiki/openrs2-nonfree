import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lclient!ct;")
	public static Class30 aClass30_52;

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	public static int anInt3359 = 0;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "J")
	public static long aLong121 = 0L;

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_116 = new Class217(23, 1);

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!kf", name = "W", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_93 = new Class21(64);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
	public static void method3097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg3, 8);
		local13.method3480();
		local13.anInt3725 = arg1;
		local13.anInt3724 = arg2;
		local13.anInt3727 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)I")
	public static int method3098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method3099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(21) int local21 = arg0 - arg5;
		@Pc(25) int local25 = arg4 - arg5;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = arg4 * arg4;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg4 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(74) int local74 = local45 + local29 * (1 - local61);
		@Pc(82) int local82 = local33 - (local61 - 1) * local49;
		@Pc(91) int local91 = local37 * (1 - local65) + local53;
		@Pc(100) int local100 = local41 - local57 * (local65 - 1);
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = local49 * (local61 - 3);
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = (local65 - 3) * local57;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg4 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(169) int local169;
		@Pc(177) int local177;
		@Pc(186) int local186;
		@Pc(194) int local194;
		if (arg2 >= Static131.anInt2843 && Static38.anInt945 >= arg2) {
			@Pc(160) int[] local160 = Static43.anIntArrayArray57[arg2];
			local169 = Static11.method912(arg3 - arg0, Static122.anInt1360, Static93.anInt5014);
			local177 = Static11.method912(arg0 + arg3, Static122.anInt1360, Static93.anInt5014);
			local186 = Static11.method912(arg3 - local21, Static122.anInt1360, Static93.anInt5014);
			local194 = Static11.method912(local21 + arg3, Static122.anInt1360, Static93.anInt5014);
			Static367.method6081(arg6, local169, local160, local186);
			Static367.method6081(arg1, local186, local160, local194);
			Static367.method6081(arg6, local194, local160, local177);
		}
		@Pc(218) int local218 = (local25 - 1) * local112;
		while (local9 > 0) {
			@Pc(227) boolean local227 = local25 >= local9;
			if (local74 < 0) {
				while (local74 < 0) {
					local74 += local120;
					local82 += local138;
					local7++;
					local138 += local108;
					local120 += local108;
				}
			}
			if (local227) {
				if (local91 < 0) {
					while (local91 < 0) {
						local91 += local130;
						local100 += local146;
						local146 += local116;
						local130 += local116;
						local11++;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local91 += local130;
					local11++;
					local146 += local116;
					local130 += local116;
				}
				local100 += -local136;
				local91 += -local218;
				local218 -= local112;
				local136 -= local112;
			}
			if (local82 < 0) {
				local74 += local120;
				local82 += local138;
				local138 += local108;
				local7++;
				local120 += local108;
			}
			local82 += -local126;
			local74 += -local144;
			local126 -= local104;
			local144 -= local104;
			local9--;
			local169 = arg2 - local9;
			local177 = local9 + arg2;
			if (Static131.anInt2843 <= local177 && local169 <= Static38.anInt945) {
				local186 = Static11.method912(arg3 + local7, Static122.anInt1360, Static93.anInt5014);
				local194 = Static11.method912(arg3 - local7, Static122.anInt1360, Static93.anInt5014);
				if (local227) {
					@Pc(397) int local397 = Static11.method912(local11 + arg3, Static122.anInt1360, Static93.anInt5014);
					@Pc(405) int local405 = Static11.method912(arg3 - local11, Static122.anInt1360, Static93.anInt5014);
					@Pc(412) int[] local412;
					if (local169 >= Static131.anInt2843) {
						local412 = Static43.anIntArrayArray57[local169];
						Static367.method6081(arg6, local194, local412, local405);
						Static367.method6081(arg1, local405, local412, local397);
						Static367.method6081(arg6, local397, local412, local186);
					}
					if (local177 <= Static38.anInt945) {
						local412 = Static43.anIntArrayArray57[local177];
						Static367.method6081(arg6, local194, local412, local405);
						Static367.method6081(arg1, local405, local412, local397);
						Static367.method6081(arg6, local397, local412, local186);
					}
				} else {
					if (local169 >= Static131.anInt2843) {
						Static367.method6081(arg6, local194, Static43.anIntArrayArray57[local169], local186);
					}
					if (Static38.anInt945 >= local177) {
						Static367.method6081(arg6, local194, Static43.anIntArrayArray57[local177], local186);
					}
				}
			}
		}
	}
}
