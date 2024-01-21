import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1048 = Static33.method650("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1044 = aClass56_1048;

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1045 = Static33.method650("Titelbild geladen)3");

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	public static int anInt1966 = 0;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1046 = Static33.method650("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
	public static int anInt1968 = 0;

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[112];

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
	public static int anInt1970 = 0;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1047 = Static33.method650("sideicons");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!td;)Z")
	public static boolean method1304(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		@Pc(4) int local4 = arg0.anInt2811;
		if (local4 >= 1 && local4 <= 200 || !(local4 < 701 || local4 > 900)) {
			if (local4 >= 801) {
				local4 -= 701;
			} else if (local4 >= 701) {
				local4 -= 601;
			} else if (local4 < 101) {
				local4--;
			} else {
				local4 -= 101;
			}
			Static97.method1702(0, Static117.aClass56_1613, 35, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, Static113.aClass56Array15[local4] }), 0);
			Static97.method1702(0, Static116.aClass56_1595, 20, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, Static113.aClass56Array15[local4] }), 0);
			return true;
		} else if (local4 >= 401 && local4 <= 500) {
			Static97.method1702(0, Static117.aClass56_1613, 41, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, arg0.aClass56_1546 }), 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!tb;Lclient!tb;ZII)Lclient!fe;")
	public static Class3_Sub1_Sub5 method1305(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method1149(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg1.method1147(arg2, local12[local14]);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(52) byte[] local52 = arg0.method1147(local44, 0);
				if (local52 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub5(arg1, arg0, arg2, false);
		} catch (@Pc(87) Exception local87) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!oc;)V")
	public static void method1306(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static65.anIntArray144.length; local13++) {
			Static65.anIntArray144[local13] = 0;
		}
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
			local40 = (int) ((double) 256 * 128.0D * Math.random());
			Static65.anIntArray144[local40] = (int) (Math.random() * 256.0D);
		}
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(72) int local72;
		for (local40 = 0; local40 < 20; local40++) {
			for (local59 = 1; local59 < 255; local59++) {
				for (local63 = 1; local63 < 127; local63++) {
					local72 = local63 + (local59 << 7);
					Static118.anIntArray308[local72] = (Static65.anIntArray144[local72 + 1] + Static65.anIntArray144[local72 - 1] + Static65.anIntArray144[local72 - 128] + Static65.anIntArray144[local72 + 128]) / 4;
				}
			}
			@Pc(115) int[] local115 = Static65.anIntArray144;
			Static65.anIntArray144 = Static118.anIntArray308;
			Static118.anIntArray308 = local115;
		}
		if (arg0 == null) {
			return;
		}
		local59 = 0;
		for (local63 = 0; local63 < arg0.anInt2252; local63++) {
			for (local72 = 0; local72 < arg0.anInt2250; local72++) {
				if (arg0.aByteArray30[local59++] != 0) {
					@Pc(148) int local148 = local72 + arg0.anInt2247 + 16;
					@Pc(155) int local155 = local63 + arg0.anInt2249 + 16;
					@Pc(161) int local161 = (local155 << 7) + local148;
					Static65.anIntArray144[local161] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method1307() {
		aClass56_1047 = null;
		aClass56_1044 = null;
		aBooleanArray8 = null;
		aClass56_1046 = null;
		aClass56_1045 = null;
		aClass56_1048 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZII)V")
	public static void method1308(@OriginalArg(0) boolean arg0) {
		Static7.anInt420 = 22050;
		Static60.anInt1735 = 2;
		Static28.aBoolean44 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hb;")
	public static RuntimeException_Sub1 method1309(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
