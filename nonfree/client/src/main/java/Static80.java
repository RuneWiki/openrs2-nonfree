import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_28 = new Class216(69, -1);

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
	public static int anInt1713 = -1;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "Lclient!mo;")
	public static final Class237 aClass237_1 = new Class237();

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIILclient!ha;II)V")
	public static void method1705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.KA(arg1, arg0, arg1 + arg3, arg0 - -arg4);
		arg2.method8103(arg1, arg0, -16777216, arg4, arg3);
		if (Static532.anInt8252 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static154.anInt440 / (float) Static154.anInt433;
		@Pc(37) int local37 = arg3;
		@Pc(39) int local39 = arg4;
		if (local35 < 1.0F) {
			local39 = (int) (local35 * (float) arg3);
		} else {
			local37 = (int) ((float) arg4 / local35);
		}
		@Pc(66) int local66 = arg1 + (arg3 - local37) / 2;
		@Pc(75) int local75 = arg0 + (arg4 - local39) / 2;
		if (Static185.aClass17_28 == null || arg3 != Static185.aClass17_28.method5268() || Static185.aClass17_28.method5253() != arg4) {
			Static154.method452(Static154.anInt437, Static154.anInt440 + Static154.anInt439, Static154.anInt437 - -Static154.anInt433, Static154.anInt439, local66, local75, local37 + local66, local75 + local39);
			Static154.method466(arg2);
			Static185.aClass17_28 = arg2.method8151(local66, local75, local37, local39, false);
		}
		Static185.aClass17_28.method5246(local66, local75);
		@Pc(136) int local136 = Static642.anInt10085 * local37 / Static154.anInt433;
		@Pc(142) int local142 = Static601.anInt9245 * local39 / Static154.anInt440;
		@Pc(150) int local150 = local66 + Static635.anInt9893 * local37 / Static154.anInt433;
		@Pc(162) int local162 = local75 + local39 - local39 * Static644.anInt10134 / Static154.anInt440 - local142;
		@Pc(164) int local164 = -1996554240;
		if (Static333.aClass234_5 == Static92.aClass234_1) {
			local164 = -1996488705;
		}
		arg2.aa(local150, local162, local136, local142, local164, 1);
		arg2.method8142(local150, local162, local136, local142, local164, 0);
		if (Static215.anInt3479 <= 0) {
			return;
		}
		@Pc(199) int local199;
		if (Static300.anInt4711 > 50) {
			local199 = 500 - Static300.anInt4711 * 5;
		} else {
			local199 = Static300.anInt4711 * 5;
		}
		for (@Pc(210) Class4_Sub30 local210 = (Class4_Sub30) Static154.aClass163_6.method3639(); local210 != null; local210 = (Class4_Sub30) Static154.aClass163_6.method3640()) {
			@Pc(218) Class259 local218 = Static154.aClass59_2.method1798(local210.anInt4794);
			if (Static346.method4666(local218)) {
				@Pc(246) int local246;
				@Pc(258) int local258;
				if (local210.anInt4794 == Static591.anInt9102) {
					local246 = local66 + local37 * local210.anInt4799 / Static154.anInt433;
					local258 = local75 + local39 * (Static154.anInt440 - local210.anInt4798) / Static154.anInt440;
					arg2.method8103(local246 - 2, local258 + -2, local199 << 24 | 0xFFFF00, 4, 4);
				} else if (Static294.anInt4646 != -1 && local218.anInt6670 == Static294.anInt4646) {
					local246 = local210.anInt4799 * local37 / Static154.anInt433 + local66;
					local258 = local39 * (Static154.anInt440 - local210.anInt4798) / Static154.anInt440 + local75;
					arg2.method8103(local246 - 2, local258 + -2, local199 << 24 | 0xFFFF00, 4, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)V")
	public static void method1709() {
		if (Static244.aFileOutputStream1 != null) {
			try {
				Static244.aFileOutputStream1.close();
			} catch (@Pc(9) IOException local9) {
			}
		}
		Static244.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBII)Lclient!kg;")
	public static Class3_Sub1_Sub2_Sub2 method1710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class73 local16 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class3_Sub1_Sub2_Sub2 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class144 local27 = local16.aClass144_1; local27 != null; local27 = local27.aClass144_2) {
			@Pc(31) Class3_Sub1_Sub2 local31 = local27.aClass3_Sub1_Sub2_1;
			if (local31 instanceof Class3_Sub1_Sub2_Sub2) {
				@Pc(37) Class3_Sub1_Sub2_Sub2 local37 = (Class3_Sub1_Sub2_Sub2) local31;
				@Pc(47) int local47 = local37.method8514() * 256 + 252 - 256;
				@Pc(55) int local55 = local37.anInt9925 - local47 >> 9;
				@Pc(62) int local62 = local37.anInt9917 - local47 >> 9;
				@Pc(69) int local69 = local47 + local37.anInt9925 >> 9;
				@Pc(76) int local76 = local47 + local37.anInt9917 >> 9;
				if (arg1 >= local55 && local62 <= arg2 && arg1 <= local69 && local76 >= arg2) {
					@Pc(114) int local114 = (local69 + 1 - arg1) * (-arg2 + (local76 - -1));
					if (local24 < local114) {
						local22 = local37;
						local24 = local114;
					}
				}
			}
		}
		return local22;
	}
}
