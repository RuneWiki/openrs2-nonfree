import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public static int anInt1153;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public static int anInt1150 = 0;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!lb;")
	public static Class45 aClass45_8 = new Class45();

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_428 = Static41.method597("VOLL");

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!od;")
	private static Class60 aClass60_429 = Static41.method597("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_430 = Static41.method597("<col=ff0000>");

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Lclient!od;")
	private static Class60 aClass60_432 = Static41.method597(" is already on your friend list");

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_431 = aClass60_432;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_433 = Static41.method597("hel");

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_434 = aClass60_429;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_435 = Static41.method597("(Y");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method647(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static108.aBoolean112) {
			try {
				@Pc(25) Class33 local25 = (Class33) Class.forName("Class33_Sub1").getDeclaredConstructor().newInstance();
				local25.method676(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static108.aBoolean112 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method648() {
		aClass60_430 = null;
		aClass60_428 = null;
		aClass60_432 = null;
		aClass60_429 = null;
		aClass60_433 = null;
		aClass60_435 = null;
		aClass60_431 = null;
		aClass60_434 = null;
		aClass45_8 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!od;Lclient!od;ILclient!od;)V")
	public static void method649(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		Static68.aClass60_683 = arg1;
		Static68.aClass60_675 = arg0;
		Static68.aClass60_677 = arg2;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public static void method650() {
		Static39.anIntArray107 = new int[33];
		Static10.anIntArray27 = new int[33];
		Static97.anIntArray294 = new int[151];
		Static8.anIntArray10 = new int[151];
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 999;
			local25 = 0;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static5.aClass4_Sub3_Sub6_Sub2_2.aByteArray35[Static5.aClass4_Sub3_Sub6_Sub2_2.anInt2255 * local19 + local27] == 0) {
					if (local23 == 999) {
						local23 = local27;
					}
				} else if (local23 != 999) {
					local25 = local27;
					break;
				}
			}
			Static10.anIntArray27[local19] = local23;
			Static39.anIntArray107[local19] = local25 - local23;
		}
		for (local23 = 5; local23 < 156; local23++) {
			local27 = 0;
			local25 = 999;
			for (@Pc(93) int local93 = 25; local93 < 172; local93++) {
				if (Static5.aClass4_Sub3_Sub6_Sub2_2.aByteArray35[local93 + Static5.aClass4_Sub3_Sub6_Sub2_2.anInt2255 * local23] == 0 && (local93 > 34 || local23 > 34)) {
					if (local25 == 999) {
						local25 = local93;
					}
				} else if (local25 != 999) {
					local27 = local93;
					break;
				}
			}
			Static8.anIntArray10[local23 - 5] = local25 - 25;
			Static97.anIntArray294[local23 - 5] = local27 - local25;
		}
	}
}
