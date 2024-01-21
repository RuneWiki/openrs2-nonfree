import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!i", name = "X", descriptor = "I")
	public static int anInt1492;

	@OriginalMember(owner = "client!i", name = "Ib", descriptor = "[[[Lclient!ab;")
	public static Class2_Sub1[][][] aClass2_Sub1ArrayArrayArray1;

	@OriginalMember(owner = "client!i", name = "N", descriptor = "I")
	public static int anInt1484 = 0;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "Lclient!rc;")
	public static Class74 aClass74_51 = new Class74(64);

	@OriginalMember(owner = "client!i", name = "Jb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_794 = Static32.method683("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!i", name = "Nb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_795 = Static32.method683("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public static void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass17_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[Lclient!lb;I[BIIII)V")
	public static void method1197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class48[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if (arg3 + local12 > 0 && arg3 + local12 < 103 && arg5 + local16 > 0 && local16 + arg5 < 103) {
					arg2[arg6].anIntArrayArray21[local12 + arg3][arg5 + local16] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(81) Class2_Sub13 local81 = new Class2_Sub13(arg4);
		for (@Pc(83) int local83 = 0; local83 < 4; local83++) {
			for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
				for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
					if (arg0 == local83 && arg8 <= local87 && arg8 + 8 > local87 && local91 >= arg7 && local91 < arg7 + 8) {
						Static27.method485(arg6, 0, arg1, arg5 + Static92.method1583(local91 & 0x7, local87 & 0x7, arg1), Static84.method1435(arg1, local87 & 0x7, local91 & 0x7) + arg3, 0, local81);
					} else {
						Static27.method485(0, 0, 0, -1, -1, 0, local81);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public static void method1199() {
		aClass2_Sub1ArrayArrayArray1 = null;
		aClass74_51 = null;
		aClass49_795 = null;
		aClass49_794 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!vg;IB)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) int arg2) {
		if (Static160.aClass85_14 != null || Static47.aBoolean40 || (arg1 == null || Static142.method2348(arg1) == null)) {
			return;
		}
		Static160.aClass85_14 = arg1;
		Static42.aClass85_2 = Static142.method2348(arg1);
		Static123.aBoolean118 = false;
		Static131.anInt3736 = arg0;
		Static143.anInt3033 = arg2;
		Static107.anInt2241 = 0;
	}
}
