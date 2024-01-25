import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "[I")
	public static final int[] anIntArray412 = new int[13];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
	public static int method4459(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(29) int local29 = (local18 & 0x33333333) + ((local18 & 0xCCCCCCCC) >>> 2);
		@Pc(38) int local38 = local29 + (local29 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)Lclient!dc;")
	public static Class51 method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static196.aClass51ArrayArrayArray3[0][arg1][arg2] != null && Static196.aClass51ArrayArrayArray3[0][arg1][arg2].aClass51_1 != null;
			if (local28 && arg0 >= Static32.anInt516 - 1) {
				return null;
			}
			Static211.method5300(arg0, arg1, arg2);
		}
		return Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4464(@OriginalArg(1) String arg0) {
		Static71.aString12 = arg0;
		if (Static62.aClass179_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static62.aClass179_2.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static62.aClass179_2.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static2.method56(Static22.method285() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static381.method5667(Static62.aClass179_2.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(93) Throwable local93) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
	public static void method4466(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static121.aByteArrayArray8;
		} else {
			local9 = Static84.aByteArrayArray4;
		}
		@Pc(24) int local24 = Static238.aByteArrayArray12.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) byte[] local32 = local9[local26];
			if (local32 != null) {
				@Pc(44) int local44 = (Static25.anIntArray50[local26] >> 8) * 64 - Static150.anInt3453;
				@Pc(55) int local55 = (Static25.anIntArray50[local26] & 0xFF) * 64 - Static287.anInt5776;
				Static276.method4761();
				Static40.method505(local55, local44, arg0, Static51.aClass37_1, local32, Static182.aClass61Array2);
			}
		}
	}
}
