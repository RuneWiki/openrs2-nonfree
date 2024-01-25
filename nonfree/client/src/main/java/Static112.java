import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!eo", name = "U", descriptor = "Lclient!pn;")
	public static final Class224 aClass224_1 = new Class224();

	@OriginalMember(owner = "client!eo", name = "ab", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_31 = new Class243(29, 3);

	@OriginalMember(owner = "client!eo", name = "bb", descriptor = "[I")
	public static final int[] anIntArray234 = new int[256];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method2186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg3 + arg7 && arg6 + arg5 > arg3) {
			return arg4 + arg1 > arg2 && arg4 < arg0 + arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z")
	public static boolean method2188(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static514.anInt8971; local1 < Static323.anInt6015; local1++) {
			@Pc(6) Class262[][] local6 = Static399.aClass262ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static207.anInt3723; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static364.anInt6864 + local9;
				@Pc(18) int local18 = Static364.anInt6864 - local9;
				if (local14 >= Static75.anInt1567 || local18 < Static466.anInt8396) {
					for (@Pc(27) int local27 = -Static207.anInt3723; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static113.anInt2306 + local27;
						@Pc(36) int local36 = Static113.anInt2306 - local27;
						@Pc(48) Class262 local48;
						if (local14 >= Static75.anInt1567) {
							if (local32 >= Static469.anInt8451) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean590) {
									Static20.aBoolean30 = arg0;
									Static41.aClass137_1.method6551(local48);
									Static41.aClass137_1.method6552();
								}
							}
							if (local36 < Static392.anInt7448) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean590) {
									Static20.aBoolean30 = arg0;
									Static41.aClass137_1.method6551(local48);
									Static41.aClass137_1.method6552();
								}
							}
						}
						if (local18 < Static466.anInt8396) {
							if (local32 >= Static469.anInt8451) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean590) {
									Static20.aBoolean30 = arg0;
									Static41.aClass137_1.method6551(local48);
									Static41.aClass137_1.method6552();
								}
							}
							if (local36 < Static392.anInt7448) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean590) {
									Static20.aBoolean30 = arg0;
									Static41.aClass137_1.method6551(local48);
									Static41.aClass137_1.method6552();
								}
							}
						}
						if (Static248.anInt4540 == 0) {
							if (Static101.aBoolean612) {
								Static41.aClass137_1.method6550(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
