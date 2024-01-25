import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
	public static int anInt89;

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "Lclient!am;")
	public static final Class20 aClass20_1 = new Class20();

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIBII)V")
	public static void method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class3_Sub32 local6 = (Class3_Sub32) Static497.aClass193_54.method4457(); local6 != null; local6 = (Class3_Sub32) Static497.aClass193_54.method4459()) {
			Static345.method5206(arg3, arg1, local6, arg2, arg0);
		}
		@Pc(182) boolean local182;
		for (@Pc(37) Class3_Sub32 local37 = (Class3_Sub32) Static378.aClass193_33.method4457(); local37 != null; local37 = (Class3_Sub32) Static378.aClass193_33.method4459()) {
			@Pc(41) byte local41 = 1;
			@Pc(48) Class351 local48 = local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.method8630();
			if (local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148 == -1 || local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.aBoolean748) {
				local41 = 0;
			} else if (local48.anInt9413 == local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148 || local48.anInt9387 == local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148 || local48.anInt9406 == local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148 || local48.anInt9404 == local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148) {
				local41 = 2;
			} else if (local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148 == local48.anInt9417 || local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148 == local48.anInt9400 || local48.anInt9411 == local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148 || local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10148 == local48.anInt9386) {
				local41 = 3;
			}
			if (local41 != local37.anInt6063) {
				@Pc(136) int local136 = Static370.method5477(local37.aClass23_Sub2_Sub1_Sub2_Sub2_2);
				@Pc(140) Class5 local140 = local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.aClass5_1;
				if (local140.anIntArray1 != null) {
					local140 = local140.method56(Static592.aClass47_2);
				}
				if (local140 == null || local136 == -1) {
					local37.anInt6063 = local41;
					local37.aBoolean470 = false;
					local37.anInt6055 = -1;
				} else if (local37.anInt6055 == local136 && local37.aBoolean470 == local140.aBoolean5) {
					local37.anInt6059 = local140.anInt42;
					local37.anInt6063 = local41;
				} else {
					local182 = false;
					if (local37.aClass3_Sub9_Sub2_1 == null) {
						local182 = true;
					} else {
						local37.anInt6059 -= 512;
						if (local37.anInt6059 <= 0) {
							Static557.aClass3_Sub9_Sub1_2.method1420(local37.aClass3_Sub9_Sub2_1);
							local182 = true;
							local37.aClass3_Sub9_Sub2_1 = null;
						}
					}
					if (local182) {
						local37.anInt6055 = local136;
						local37.anInt6059 = local140.anInt42;
						local37.aClass3_Sub51_1 = null;
						local37.aBoolean470 = local140.aBoolean5;
						local37.anInt6063 = local41;
						local37.aClass3_Sub12_Sub1_2 = null;
					}
				}
			}
			local37.anInt6061 = local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10108;
			local37.anInt6058 = local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10108 + (local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.method8625() << 8);
			local37.anInt6071 = local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10109;
			local37.anInt6057 = local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.anInt10109 + (local37.aClass23_Sub2_Sub1_Sub2_Sub2_2.method8625() << 8);
			Static345.method5206(arg3, arg1, local37, arg2, arg0);
		}
		for (@Pc(297) Class3_Sub32 local297 = (Class3_Sub32) Static554.aClass62_43.method1680(); local297 != null; local297 = (Class3_Sub32) Static554.aClass62_43.method1681()) {
			@Pc(301) byte local301 = 1;
			@Pc(306) Class351 local306 = local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.method8630();
			if (local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148 == -1 || local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.aBoolean748) {
				local301 = 0;
			} else if (local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148 == local306.anInt9413 || local306.anInt9387 == local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148 || local306.anInt9406 == local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148 || local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148 == local306.anInt9404) {
				local301 = 2;
			} else if (local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148 == local306.anInt9417 || local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148 == local306.anInt9400 || local306.anInt9411 == local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148 || local306.anInt9386 == local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10148) {
				local301 = 3;
			}
			if (local297.anInt6063 != local301) {
				@Pc(406) int local406 = Static7.method70(local297.aClass23_Sub2_Sub1_Sub2_Sub1_1);
				if (local406 == local297.anInt6055 && local297.aBoolean470 == local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.aBoolean258) {
					local297.anInt6059 = local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt3276;
					local297.anInt6063 = local301;
				} else {
					local182 = false;
					if (local297.aClass3_Sub9_Sub2_1 == null) {
						local182 = true;
					} else {
						local297.anInt6059 -= 512;
						if (local297.anInt6059 <= 0) {
							Static557.aClass3_Sub9_Sub1_2.method1420(local297.aClass3_Sub9_Sub2_1);
							local182 = true;
							local297.aClass3_Sub9_Sub2_1 = null;
						}
					}
					if (local182) {
						local297.aClass3_Sub12_Sub1_2 = null;
						local297.aBoolean470 = local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.aBoolean258;
						local297.aClass3_Sub51_1 = null;
						local297.anInt6055 = local406;
						local297.anInt6059 = local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt3276;
						local297.anInt6063 = local301;
					}
				}
			}
			local297.anInt6061 = local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10108;
			local297.anInt6058 = local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10108 + (local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.method8625() << 8);
			local297.anInt6071 = local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10109;
			local297.anInt6057 = local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt10109 + (local297.aClass23_Sub2_Sub1_Sub2_Sub1_1.method8625() << 8);
			Static345.method5206(arg3, arg1, local297, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)I")
	public static int method66() {
		if (Static463.aBoolean600) {
			return 6;
		} else if (Static614.aClass3_Sub6_Sub16_4 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static614.aClass3_Sub6_Sub16_4.anInt7069;
			if (Static679.method8753(local19)) {
				return 1;
			} else if (Static315.method4940(local19)) {
				return 2;
			} else if (Static340.method5163(local19)) {
				return 3;
			} else if (Static156.method4836(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method67(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static113.method2117(local6.width, local6.height);
		if (Static418.anInt7055 == 1) {
			Static535.aClass16_10.method8184(arg0, Static137.anInt2535, Static554.anInt8569);
		} else {
			Static535.aClass16_10.method8184(arg0, Static224.anInt4089, Static278.anInt5212);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I[Ljava/lang/Object;[JII)V")
	public static void method68(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(27) int local27 = (arg3 + arg2) / 2;
		@Pc(29) int local29 = arg2;
		@Pc(33) long local33 = arg1[local27];
		arg1[local27] = arg1[arg3];
		arg1[arg3] = local33;
		@Pc(47) Object local47 = arg0[local27];
		arg0[local27] = arg0[arg3];
		arg0[arg3] = local47;
		@Pc(65) int local65 = local33 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(67) int local67 = arg2; local67 < arg3; local67++) {
			if ((long) (local67 & local65) + local33 > arg1[local67]) {
				@Pc(88) long local88 = arg1[local67];
				arg1[local67] = arg1[local29];
				arg1[local29] = local88;
				@Pc(102) Object local102 = arg0[local67];
				arg0[local67] = arg0[local29];
				arg0[local29++] = local102;
			}
		}
		arg1[arg3] = arg1[local29];
		arg1[local29] = local33;
		arg0[arg3] = arg0[local29];
		arg0[local29] = local47;
		method68(arg0, arg1, arg2, local29 - 1);
		method68(arg0, arg1, local29 + 1, arg3);
	}
}
