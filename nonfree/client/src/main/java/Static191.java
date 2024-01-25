import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!or;")
	public static Class182 aClass182_8;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public static int anInt3592 = 2;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "[S")
	public static final short[] aShortArray65 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
	public static int anInt3598 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3271(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static213.aCharArray3[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(80) int local80 = local54.length() - 1;
					local72 = ' ';
					local54.setCharAt(local80, Character.toUpperCase(local54.charAt(local80)));
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method3272(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static376.anInt6317 >= 100) {
			Static351.method5638(Static298.aClass32_79.method701(Static107.anInt2498));
			return;
		}
		@Pc(29) String local29 = Static136.method2646(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static376.anInt6317; local34++) {
			@Pc(42) String local42 = Static136.method2646(Static347.aStringArray149[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static351.method5638(arg0 + Static241.aClass32_61.method701(Static107.anInt2498));
				return;
			}
			if (Static366.aStringArray157[local34] != null) {
				local72 = Static136.method2646(Static366.aStringArray157[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static351.method5638(arg0 + Static241.aClass32_61.method701(Static107.anInt2498));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static121.anInt2600; local102++) {
			local72 = Static136.method2646(Static174.aStringArray82[local102]);
			if (local72 != null && local72.equals(local29)) {
				Static351.method5638(Static145.aClass32_84.method701(Static107.anInt2498) + arg0 + Static84.aClass32_28.method701(Static107.anInt2498));
				return;
			}
			if (Static21.aStringArray13[local102] != null) {
				@Pc(145) String local145 = Static136.method2646(Static21.aStringArray13[local102]);
				if (local145 != null && local145.equals(local29)) {
					Static351.method5638(Static145.aClass32_84.method701(Static107.anInt2498) + arg0 + Static84.aClass32_28.method701(Static107.anInt2498));
					return;
				}
			}
		}
		if (Static136.method2646(Static206.aClass1_Sub5_Sub1_Sub1_1.aString24).equals(local29)) {
			Static351.method5638(Static347.aClass32_92.method701(Static107.anInt2498));
		} else {
			Static216.method3597(Static132.aClass11_45);
			Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(arg0) + 1);
			Static372.aClass2_Sub16_Sub2_4.method5362(arg0);
			Static372.aClass2_Sub16_Sub2_4.method5358(arg1 ? 1 : 0);
		}
	}
}
