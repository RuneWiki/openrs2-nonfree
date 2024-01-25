import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ou", name = "I", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
	public static int anInt5229;

	@OriginalMember(owner = "client!ou", name = "S", descriptor = "B")
	public static byte aByte63;

	@OriginalMember(owner = "client!ou", name = "O", descriptor = "I")
	public static int anInt5234 = 0;

	@OriginalMember(owner = "client!ou", name = "Q", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!gh;)V")
	public static void method4198(@OriginalArg(1) Class89 arg0) {
		if (Static324.anInt5591 != arg0.anInt2715) {
			return;
		}
		if (Static263.aClass24_Sub3_Sub2_Sub2_4.aString58 == null) {
			arg0.anInt2722 = 0;
			arg0.anInt2733 = 0;
			return;
		}
		arg0.anInt2663 = 150;
		arg0.anInt2685 = (int) (Math.sin((double) Static400.anInt6752 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2733 = Static245.anInt4435;
		arg0.anInt2728 = 5;
		arg0.anInt2722 = Static308.method4263(Static263.aClass24_Sub3_Sub2_Sub2_4.aString58);
		arg0.anInt2661 = 0;
		arg0.anInt2665 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6212;
		arg0.anInt2697 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6238;
		arg0.anInt2704 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6260;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
	public static void method4199() {
		Static207.anInt4055 = 0;
		Static70.aClass163_13.method3619();
		Static35.aBoolean37 = false;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!jv;IIBIIZ)V")
	public static void method4200(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (Static443.anInt7418 >= 50 || (arg0 == null || arg0.anIntArrayArray37 == null || arg4 >= arg0.anIntArrayArray37.length || arg0.anIntArrayArray37[arg4] == null)) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray37[arg4][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg0.anIntArrayArray37[arg4].length > 1) {
			local61 = (int) (Math.random() * (double) arg0.anIntArrayArray37[arg4].length);
			if (local61 > 0) {
				local38 = arg0.anIntArrayArray37[arg4][local61];
			}
		}
		@Pc(74) int local74 = local34 & 0x1F;
		if (local74 == 0) {
			if (arg5) {
				Static349.method4740(local44, 255, local38, 0);
			}
		} else if (Static361.aClass85_Sub1_1.anInt2487 != 0) {
			local61 = arg1 - 64 >> 7;
			@Pc(108) int local108 = arg2 - 64 >> 7;
			Static383.aClass68Array1[Static443.anInt7418++] = new Class68((byte) 1, local38, local44, 0, 255, (local61 << 16) + ((arg3 << 24) + (local108 << 8) + local74));
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BIILclient!jq;II)V")
	public static void method4201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10_Sub23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt3996 == -1 && arg2.anIntArray396 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg2.anInt4003 * Static361.aClass85_Sub1_1.anInt2487 >> 8;
		if (arg0 > arg2.anInt3992) {
			local16 = arg0 - arg2.anInt3992;
		} else if (arg0 < arg2.anInt4002) {
			local16 = arg2.anInt4002 - arg0;
		}
		if (arg2.anInt3995 < arg3) {
			local16 += arg3 - arg2.anInt3995;
		} else if (arg3 < arg2.anInt4005) {
			local16 += arg2.anInt4005 - arg3;
		}
		if (arg2.anInt3991 == 0 || arg2.anInt3991 < local16 - 64 || Static361.aClass85_Sub1_1.anInt2487 == 0 || arg2.anInt3989 != arg4) {
			if (arg2.aClass10_Sub7_Sub1_2 != null) {
				Static461.aClass10_Sub7_Sub2_5.method1841(arg2.aClass10_Sub7_Sub1_2);
				arg2.aClass10_Sub7_Sub1_2 = null;
			}
			if (arg2.aClass10_Sub7_Sub1_3 != null) {
				Static461.aClass10_Sub7_Sub2_5.method1841(arg2.aClass10_Sub7_Sub1_3);
				arg2.aClass10_Sub7_Sub1_3 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(140) int local140 = (arg2.anInt3991 - local16) * local24 / arg2.anInt3991;
		if (arg2.aClass10_Sub7_Sub1_2 != null) {
			arg2.aClass10_Sub7_Sub1_2.method584(local140);
		} else if (arg2.anInt3996 >= 0) {
			@Pc(166) Class251 local166 = Static469.method5444(Static343.aClass187_105, arg2.anInt3996, 0);
			if (local166 != null) {
				@Pc(173) Class10_Sub25_Sub1 local173 = local166.method5445().method6029(Static267.aClass172_1);
				@Pc(178) Class10_Sub7_Sub1 local178 = Static462.method604(local173, local140);
				local178.method623(-1);
				Static461.aClass10_Sub7_Sub2_5.method1844(local178);
				arg2.aClass10_Sub7_Sub1_2 = local178;
			}
		}
		if (arg2.aClass10_Sub7_Sub1_3 != null) {
			arg2.aClass10_Sub7_Sub1_3.method584(local140);
			if (arg2.aClass10_Sub7_Sub1_3.method6034()) {
				return;
			}
			arg2.aClass10_Sub7_Sub1_3 = null;
		} else if (arg2.anIntArray396 != null && (arg2.anInt3997 -= arg1) <= 0) {
			@Pc(209) int local209 = (int) ((double) arg2.anIntArray396.length * Math.random());
			@Pc(217) Class251 local217 = Static469.method5444(Static343.aClass187_105, arg2.anIntArray396[local209], 0);
			if (local217 != null) {
				@Pc(224) Class10_Sub25_Sub1 local224 = local217.method5445().method6029(Static267.aClass172_1);
				@Pc(229) Class10_Sub7_Sub1 local229 = Static462.method604(local224, local140);
				local229.method623(0);
				Static461.aClass10_Sub7_Sub2_5.method1844(local229);
				arg2.anInt3997 = (int) ((double) (arg2.anInt3990 - arg2.anInt4004) * Math.random()) + arg2.anInt4004;
				arg2.aClass10_Sub7_Sub1_3 = local229;
				return;
			}
		}
	}
}
