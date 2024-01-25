import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!uga", name = "y", descriptor = "Lclient!th;")
	public static Class324 aClass324_2;

	@OriginalMember(owner = "client!uga", name = "m", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_29 = new Class8();

	@OriginalMember(owner = "client!uga", name = "p", descriptor = "I")
	public static int anInt4602 = -2;

	@OriginalMember(owner = "client!uga", name = "w", descriptor = "Z")
	public static boolean aBoolean330 = false;

	@OriginalMember(owner = "client!uga", name = "z", descriptor = "I")
	public static int anInt4608 = -1;

	@OriginalMember(owner = "client!uga", name = "A", descriptor = "Z")
	public static boolean aBoolean331 = false;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIBIIIII)V")
	public static void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg1);
		@Pc(25) int local25 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg5);
		@Pc(31) int local31 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg2);
		@Pc(37) int local37 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3);
		@Pc(45) int local45 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg4 + arg1);
		@Pc(54) int local54 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg5 - arg4);
		for (@Pc(56) int local56 = local11; local56 < local45; local56++) {
			Static312.method5228(arg0, Static484.anIntArrayArray41[local56], local37, local31);
		}
		for (@Pc(72) int local72 = local25; local72 > local54; local72--) {
			Static312.method5228(arg0, Static484.anIntArrayArray41[local72], local37, local31);
		}
		@Pc(95) int local95 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg2 + arg4);
		@Pc(104) int local104 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3 - arg4);
		for (@Pc(106) int local106 = local45; local106 <= local54; local106++) {
			@Pc(112) int[] local112 = Static484.anIntArrayArray41[local106];
			Static312.method5228(arg0, local112, local95, local31);
			Static312.method5228(arg6, local112, local104, local95);
			Static312.method5228(arg0, local112, local37, local104);
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method3994(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static317.aClass192_33.method5299(Static307.anInt5931) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static317.aClass192_35.method5299(Static307.anInt5931) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
