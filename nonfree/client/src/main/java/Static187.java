import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "I")
	public static int anInt3086;

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "Lclient!du;")
	public static Class85 aClass85_2;

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_4 = new Class307(2, 4, 4, 0);

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "I")
	public static int anInt3087 = 0;

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
	public static void method2725() {
		Static546.method7533();
		Static446.aClass196_243 = null;
		Static587.aClass196_296 = null;
		Static527.aClass196_263 = null;
		Static554.anInt3890 = 0;
		Static563.anInt9175 = 0;
		Static139.anInt2291 = 0;
		Static386.aClass5_Sub15_Sub2_2.anInt4144 = 0;
		Static398.aClass196_212 = null;
		Static556.method7639();
		Static493.method7181();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local33] = null;
		}
		Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 = null;
		for (@Pc(48) int local48 = 0; local48 < Static562.anInt9155; local48++) {
			@Pc(54) Class41_Sub1_Sub1_Sub3_Sub1 local54 = Static278.aClass5_Sub34Array1[local48].aClass41_Sub1_Sub1_Sub3_Sub1_1;
			if (local54 != null) {
				local54.anInt9452 = -1;
			}
		}
		Static267.method3771();
		Static67.anInt1033 = -1;
		Static297.anInt571 = -1;
		Static133.anInt2254 = 1;
		Static42.method560(10);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static425.aBooleanArray18[local80] = true;
		}
		Static288.method3976();
		Static584.aClass5_Sub33_2 = null;
		Static452.aLong241 = 0L;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)I")
	public static int method2726(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method2727(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) String local6 = arg0.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = local17 + (arg1 ? Static62.aClass100_2.anInt2277 : Static62.aClass100_2.anInt2275);
		for (@Pc(29) int local29 = local17; local29 < local27; local29++) {
			@Pc(35) Class5_Sub2_Sub2 local35 = Static62.aClass100_2.method2047(local29);
			if (local35.aBoolean6 && local35.method194().toLowerCase().indexOf(local6) != -1) {
				if (local11 >= 50) {
					Static219.aShortArray46 = null;
					Static500.anInt8516 = -1;
					return;
				}
				if (local9.length <= local11) {
					@Pc(64) short[] local64 = new short[local9.length * 2];
					for (@Pc(66) int local66 = 0; local66 < local11; local66++) {
						local64[local66] = local9[local66];
					}
					local9 = local64;
				}
				local9[local11++] = (short) local29;
			}
		}
		Static219.aShortArray46 = local9;
		Static547.anInt8953 = 0;
		Static500.anInt8516 = local11;
		@Pc(106) String[] local106 = new String[Static500.anInt8516];
		for (@Pc(108) int local108 = 0; local108 < Static500.anInt8516; local108++) {
			local106[local108] = Static62.aClass100_2.method2047(local9[local108]).method194();
		}
		Static182.method5927(local106, Static219.aShortArray46);
	}
}
