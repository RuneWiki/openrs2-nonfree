import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!la;")
	public static Class3_Sub12 aClass3_Sub12_7;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1356 = Static59.method1195("Unexpected server response");

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1357 = Static59.method1195("Null");

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1358 = Static59.method1195("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <lt>AUS<gt>");

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1362 = Static59.method1195("Username: ");

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1359 = aClass60_1362;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
	public static int[] anIntArray344 = new int[5];

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	public static int anInt3221 = 0;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1360 = aClass60_1356;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1361 = null;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array21 = new Class60[1000];

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public static int anInt3223 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2142() {
		aClass60_1360 = null;
		aClass60Array21 = null;
		anIntArray344 = null;
		aClass60_1358 = null;
		aClass3_Sub12_7 = null;
		aClass60_1362 = null;
		aClass60_1356 = null;
		aClass60_1359 = null;
		aClass60_1361 = null;
		aClass60_1357 = null;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method2144() {
		for (@Pc(3) int local3 = -1; local3 < Static53.anInt1744; local3++) {
			@Pc(12) int local12;
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static14.anIntArray56[local3];
			}
			@Pc(20) Class3_Sub1_Sub1_Sub3_Sub1 local20 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local12];
			if (local20 != null) {
				Static103.method2018(1, local20);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!nf;ZIII)V")
	public static void method2146(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static58.anInt1802 >= 50 || Static22.anInt870 == 0 || (arg0.anIntArray246 == null || arg0.anIntArray246.length <= arg1)) {
			return;
		}
		@Pc(29) int local29 = arg0.anIntArray246[arg1];
		if (local29 == 0) {
			return;
		}
		@Pc(39) int local39 = local29 >> 8;
		Static32.anIntArray135[Static58.anInt1802] = local39;
		@Pc(47) int local47 = local29 & 0xF;
		@Pc(53) int local53 = local29 >> 4 & 0x7;
		Static128.anIntArray389[Static58.anInt1802] = local53;
		@Pc(63) int local63 = (arg3 - 64) / 128;
		Static78.anIntArray241[Static58.anInt1802] = 0;
		@Pc(78) int local78 = (arg2 - 64) / 128;
		Static96.aClass63Array1[Static58.anInt1802] = null;
		Static103.anIntArray311[Static58.anInt1802] = local47 + (local63 << 8) + (local78 << 16);
		Static58.anInt1802++;
	}
}
