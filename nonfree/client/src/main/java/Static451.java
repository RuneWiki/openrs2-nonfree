import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	public static int anInt7729;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_120 = new Class21("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_98 = new Class212(74, -1);

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	public static int anInt7735 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)I")
	public static int method6166(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6167(@OriginalArg(1) String arg0) {
		@Pc(11) String local11 = Static166.method5266(Static234.method3954(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
	public static void method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg3;
		@Pc(20) int local20 = -arg3;
		@Pc(22) int local22 = -1;
		@Pc(32) int local32 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 + arg0);
		@Pc(40) int local40 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg0 - arg3);
		Static236.method3990(local32, local40, Static400.anIntArrayArray54[arg1], arg2);
		while (local17 > local15) {
			local22 += 2;
			local20 += local22;
			@Pc(72) int local72;
			@Pc(76) int local76;
			@Pc(96) int local96;
			@Pc(105) int local105;
			if (local20 > 0) {
				local17--;
				local20 -= local17 << 1;
				local72 = arg1 - local17;
				local76 = local17 + arg1;
				if (Static162.anInt1715 <= local76 && local72 <= Static55.anInt1319) {
					local96 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg0 + local15);
					local105 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg0 - local15);
					if (local76 <= Static55.anInt1319) {
						Static236.method3990(local96, local105, Static400.anIntArrayArray54[local76], arg2);
					}
					if (local72 >= Static162.anInt1715) {
						Static236.method3990(local96, local105, Static400.anIntArrayArray54[local72], arg2);
					}
				}
			}
			local15++;
			local72 = arg1 - local15;
			local76 = arg1 + local15;
			if (Static162.anInt1715 <= local76 && local72 <= Static55.anInt1319) {
				local96 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg0 + local17);
				local105 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg0 - local17);
				if (local76 <= Static55.anInt1319) {
					Static236.method3990(local96, local105, Static400.anIntArrayArray54[local76], arg2);
				}
				if (Static162.anInt1715 <= local72) {
					Static236.method3990(local96, local105, Static400.anIntArrayArray54[local72], arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBIZ)V")
	public static void method6170(@OriginalArg(3) boolean arg0) {
		Static3.aBoolean91 = arg0;
		Static88.anInt6642 = 22050;
		Static160.anInt3253 = 2;
	}
}
