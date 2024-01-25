import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
	public static int anInt1357;

	@OriginalMember(owner = "client!bs", name = "fb", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_30 = new Class44(96, -1);

	@OriginalMember(owner = "client!bs", name = "kb", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_31 = new Class44(84, -1);

	@OriginalMember(owner = "client!bs", name = "nb", descriptor = "I")
	public static int anInt1375 = 0;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "(I)Z")
	public static boolean method1179() {
		try {
			return Static144.method2298();
		} catch (@Pc(14) IOException local14) {
			Static456.method6584();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static156.aClass44_62 == null ? -1 : Static156.aClass44_62.method1191()) + "," + (Static264.aClass44_88 == null ? -1 : Static264.aClass44_88.method1191()) + "," + (Static349.aClass44_113 == null ? -1 : Static349.aClass44_113.method1191()) + " - " + Static638.anInt10676 + "," + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0] + Static329.anInt6225) + "," + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0] + Static202.anInt3755) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static638.anInt10676 && local79 < 50; local79++) {
				local77 = local77 + Static481.aClass14_Sub29_Sub1_2.aByteArray84[local79] + ",";
			}
			Static524.method7532(local77, local19);
			Static128.method2105(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!al;Lclient!al;B)V")
	public static void method1181(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class14_Sub3 arg1) {
		if (arg1.aClass14_Sub3_66 != null) {
			arg1.method9253();
		}
		arg1.aClass14_Sub3_66 = arg0;
		arg1.aClass14_Sub3_67 = arg0.aClass14_Sub3_67;
		arg1.aClass14_Sub3_66.aClass14_Sub3_67 = arg1;
		arg1.aClass14_Sub3_67.aClass14_Sub3_66 = arg1;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!dba;II[I)Lclient!uu;")
	public static Class358 method1182(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(12) int[] local12 = null;
		@Pc(14) int[] local14 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg0.aByteArray32 != null) {
			@Pc(24) int local24 = arg0.anInt2017;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			@Pc(86) int local86;
			@Pc(139) int local139;
			for (@Pc(80) int local80 = 0; local80 < arg1; local80++) {
				local86 = arg2[local80];
				if (arg0.aByteArray32[local86] != -1) {
					@Pc(99) int local99 = arg0.aByteArray32[local86] & 0xFF;
					for (@Pc(101) int local101 = 0; local101 < 3; local101++) {
						@Pc(110) short local110;
						if (local101 == 0) {
							local110 = arg0.aShortArray28[local86];
						} else if (local101 == 1) {
							local110 = arg0.aShortArray22[local86];
						} else {
							local110 = arg0.aShortArray25[local86];
						}
						@Pc(134) int local134 = arg0.anIntArray147[local110];
						local139 = arg0.anIntArray146[local110];
						@Pc(144) int local144 = arg0.anIntArray148[local110];
						if (local134 < local27[local99]) {
							local27[local99] = local134;
						}
						if (local134 > local30[local99]) {
							local30[local99] = local134;
						}
						if (local139 < local33[local99]) {
							local33[local99] = local139;
						}
						if (local139 > local36[local99]) {
							local36[local99] = local139;
						}
						if (local144 < local39[local99]) {
							local39[local99] = local144;
						}
						if (local144 > local42[local99]) {
							local42[local99] = local144;
						}
					}
				}
			}
			local16 = new int[local24];
			local14 = new int[local24];
			local18 = new float[local24][];
			local12 = new int[local24];
			for (local86 = 0; local86 < local24; local86++) {
				@Pc(243) byte local243 = arg0.aByteArray31[local86];
				if (local243 > 0) {
					local12[local86] = (local27[local86] + local30[local86]) / 2;
					local14[local86] = (local33[local86] + local36[local86]) / 2;
					local16[local86] = (local39[local86] + local42[local86]) / 2;
					@Pc(298) float local298;
					@Pc(306) float local306;
					@Pc(314) float local314;
					if (local243 == 1) {
						local139 = arg0.anIntArray141[local86];
						if (local139 == 0) {
							local306 = 1.0F;
							local298 = 1.0F;
						} else if (local139 <= 0) {
							local298 = (float) -local139 / 1024.0F;
							local306 = 1.0F;
						} else {
							local298 = 1.0F;
							local306 = (float) local139 / 1024.0F;
						}
						local314 = 64.0F / (float) arg0.anIntArray144[local86];
					} else if (local243 == 2) {
						local306 = 64.0F / (float) arg0.anIntArray145[local86];
						local314 = 64.0F / (float) arg0.anIntArray144[local86];
						local298 = 64.0F / (float) arg0.anIntArray141[local86];
					} else {
						local298 = (float) arg0.anIntArray141[local86] / 1024.0F;
						local306 = (float) arg0.anIntArray145[local86] / 1024.0F;
						local314 = (float) arg0.anIntArray144[local86] / 1024.0F;
					}
					local18[local86] = Static208.method3268(local298, arg0.aShortArray20[local86], arg0.aShortArray27[local86], arg0.aShortArray24[local86], local306, arg0.aByteArray28[local86] & 0xFF, local314);
				}
			}
		}
		return new Class358(local12, local14, local16, local18);
	}
}
