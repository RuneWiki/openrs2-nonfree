import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fs", name = "I", descriptor = "Z")
	public static boolean aBoolean253;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
	public static void method3100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static639.anInt10659;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static639.anInt10659 = 2;
			Static349.anInt6555 = arg3;
			Static532.anInt9011 = arg0;
			Static102.anInt2003 = arg2;
			Static147.anInt2735 = arg1;
		} else if (local5 == 2) {
			if (Static349.anInt6555 < arg3) {
				Static349.anInt6555 = arg3;
			}
			if (arg2 < Static102.anInt2003) {
				Static102.anInt2003 = arg2;
			}
			if (Static532.anInt9011 > arg0) {
				Static532.anInt9011 = arg0;
			}
			if (Static147.anInt2735 < arg1) {
				Static147.anInt2735 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
	public static void method3101() {
		@Pc(13) Class6_Sub2_Sub9 local13 = Static144.method2332(15, 0);
		local13.method3722();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public static void method3103(@OriginalArg(0) int arg0) {
		Static132.anInt2524 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static544.anInt9353; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static608.anInt10072; local6++) {
				if (Static272.aClass97ArrayArrayArray3[arg0][local3][local6] == null) {
					Static272.aClass97ArrayArrayArray3[arg0][local3][local6] = new Class97(arg0);
				}
			}
		}
	}
}
