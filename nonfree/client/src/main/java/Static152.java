import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "Lclient!sc;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!tc", name = "nb", descriptor = "Lclient!ph;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
	public static int anInt3725 = -1;

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1286 = Static146.method2172("Lade)3)3)3");

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "J")
	public static volatile long aLong111 = 0L;

	@OriginalMember(owner = "client!tc", name = "rb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1288 = Static146.method2172("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!tc", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1287 = aClass77_1288;

	@OriginalMember(owner = "client!tc", name = "pb", descriptor = "I")
	public static int anInt3739 = 0;

	@OriginalMember(owner = "client!tc", name = "vb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1289 = Static146.method2172("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	public static void method2585() {
		aClass77_1289 = null;
		aClass57_1 = null;
		aClass23_1 = null;
		aClass77_1286 = null;
		aBooleanArray16 = null;
		aClass77_1287 = null;
		aClass77_1288 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
	public static int method2586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([BIBI)Z")
	public static boolean method2594(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class2_Sub18 local18 = new Class2_Sub18(arg0);
		@Pc(20) int local20 = -1;
		@Pc(22) boolean local22 = true;
		label54: while (true) {
			@Pc(26) int local26 = local18.method2380();
			if (local26 == 0) {
				return local22;
			}
			local20 += local26;
			@Pc(34) boolean local34 = false;
			@Pc(36) int local36 = 0;
			while (true) {
				@Pc(42) int local42;
				while (!local34) {
					local42 = local18.method2380();
					if (local42 == 0) {
						continue label54;
					}
					local36 += local42 - 1;
					@Pc(71) int local71 = local36 >> 6 & 0x3F;
					@Pc(75) int local75 = local36 & 0x3F;
					@Pc(81) int local81 = local18.method2387() >> 2;
					@Pc(86) int local86 = local71 + arg1;
					@Pc(90) int local90 = arg2 + local75;
					if (local86 > 0 && local90 > 0 && local86 < 103 && local90 < 103) {
						@Pc(107) Class2_Sub2_Sub5 local107 = Static121.method2129(local20);
						if (local81 != 22 || !Static92.aBoolean101 || local107.anInt540 != 0 || local107.anInt514 == 1 || local107.aBoolean26) {
							local34 = true;
							if (!local107.method342()) {
								local22 = false;
								Static124.anInt3043++;
							}
						}
					}
				}
				local42 = local18.method2380();
				if (local42 == 0) {
					break;
				}
				local18.method2387();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZLclient!ke;)Z")
	public static boolean method2595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class43 arg2) {
		@Pc(14) byte[] local14 = arg2.method2205(arg1, arg0);
		if (local14 == null) {
			return false;
		} else {
			Static20.method453(local14);
			return true;
		}
	}
}
