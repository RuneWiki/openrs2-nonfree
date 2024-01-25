import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_159 = new Class263(44, -1);

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "Z")
	public static boolean aBoolean433 = true;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!ec;B)Ljava/lang/String;")
	public static String method5222(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1) {
		if (!Static55.method1059(arg1).method4029(arg0) && arg1.anObjectArray7 == null) {
			return null;
		} else if (arg1.aStringArray13 == null || arg0 >= arg1.aStringArray13.length || arg1.aStringArray13[arg0] == null || arg1.aStringArray13[arg0].trim().length() == 0) {
			return Static226.aBoolean281 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray13[arg0];
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)V")
	public static void method5223(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub1_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class96 local8 = Static262.aClass96Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static198.anInt7949; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static216.anInt4346; local15++) {
						local1 = local8.OA(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static198.anInt7947;
							@Pc(32) int local32 = local12 << Static198.anInt7947;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class96 local41 = Static262.aClass96Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ua(local15, local12) - local41.ua(local15, local12);
									@Pc(67) int local67 = local8.ua(local15 + 1, local12) - local41.ua(local15 + 1, local12);
									@Pc(85) int local85 = local8.ua(local15 + 1, local12 + 1) - local41.ua(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ua(local15, local12 + 1) - local41.ua(local15, local12 + 1);
									local41.H(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
	public static void method5225() {
		if (Static226.anInt4474 < 0) {
			Static135.anInt3020 = -1;
			Static332.anInt6412 = -1;
			Static226.anInt4474 = 0;
		}
		if (Static226.anInt4474 > Static377.anInt5032) {
			Static332.anInt6412 = -1;
			Static135.anInt3020 = -1;
			Static226.anInt4474 = Static377.anInt5032;
		}
		if (Static125.anInt2774 < 0) {
			Static135.anInt3020 = -1;
			Static332.anInt6412 = -1;
			Static125.anInt2774 = 0;
		}
		if (Static125.anInt2774 > Static377.anInt5031) {
			Static332.anInt6412 = -1;
			Static135.anInt3020 = -1;
			Static125.anInt2774 = Static377.anInt5031;
		}
	}
}
