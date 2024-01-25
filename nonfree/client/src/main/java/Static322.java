import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!eq;")
	public static Class65 aClass65_3;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_14 = new Class85("M", "M", "M", "M");

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public static int anInt611 = 0;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_8 = new Class109(64);

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	public static int anInt612 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)Lclient!mf;")
	public static Class130 method544(@OriginalArg(1) int arg0) {
		@Pc(5) Class109 local5 = Static342.aClass109_61;
		@Pc(14) Class130 local14;
		synchronized (Static342.aClass109_61) {
			local14 = (Class130) Static342.aClass109_61.method2857((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static345.aClass93_127.method2410(Static246.method4394(arg0), Static230.method4144(arg0));
		local14 = new Class130();
		local14.anInt3852 = arg0;
		local14.aStringArray46 = new String[] { null, null, Static312.aClass85_128.method2020(Static120.anInt2260), null, null };
		local14.aStringArray47 = new String[] { null, null, null, null, Static137.aClass85_64.method2020(Static120.anInt2260) };
		if (local34 != null) {
			local14.method3457(new Class5_Sub12(local34));
		}
		local14.method3450();
		if (local14.anInt3875 != -1) {
			local14.method3453(method544(local14.anInt3843), method544(local14.anInt3875));
		}
		if (local14.anInt3876 != -1) {
			local14.method3458(method544(local14.anInt3876), method544(local14.anInt3854));
		}
		if (!Static79.aBoolean103 && local14.aBoolean296) {
			local14.aString26 = Static347.aClass85_145.method2020(Static120.anInt2260);
			local14.anInt3837 = 0;
			local14.anIntArray385 = null;
			local14.aBoolean298 = false;
			local14.aStringArray46 = Static47.aStringArray11;
			local14.aStringArray47 = Static170.aStringArray41;
			if (local14.aClass190_20 != null) {
				@Pc(175) boolean local175 = false;
				for (@Pc(180) Class5 local180 = local14.aClass190_20.method5471(); local180 != null; local180 = local14.aClass190_20.method5465()) {
					@Pc(187) Class5_Sub1_Sub17 local187 = Static86.method1559((int) local180.aLong235);
					if (local187.aBoolean459) {
						local180.method6005();
					} else {
						local175 = true;
					}
				}
				if (!local175) {
					local14.aClass190_20 = null;
				}
			}
		}
		@Pc(210) Class109 local210 = Static342.aClass109_61;
		synchronized (Static342.aClass109_61) {
			Static342.aClass109_61.method2855((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I")
	public static int method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[B")
	public static byte[] method549(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub1_Sub1 local16 = (Class5_Sub1_Sub1) Static49.aClass122_9.method3177((long) arg0);
		if (local16 == null) {
			@Pc(21) byte[] local21 = new byte[512];
			@Pc(27) Random local27 = new Random((long) arg0);
			for (@Pc(29) int local29 = 0; local29 < 255; local29++) {
				local21[local29] = (byte) local29;
			}
			for (@Pc(42) int local42 = 0; local42 < 255; local42++) {
				@Pc(49) int local49 = 255 - local42;
				@Pc(56) int local56 = Static329.method5695(local27, local49);
				@Pc(60) byte local60 = local21[local56];
				local21[local56] = local21[local49];
				local21[local49] = local21[511 - local42] = local60;
			}
			local16 = new Class5_Sub1_Sub1(local21);
			Static49.aClass122_9.method3181((long) arg0, local16);
		}
		return local16.aByteArray1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static208.anInt4116 == 1) {
			Static333.aClass95Array18[Static156.anInt3028 / 100].method5491(Static335.anInt6568 - 8, Static40.anInt716 + -8);
		}
		if (Static208.anInt4116 == 2) {
			Static333.aClass95Array18[Static156.anInt3028 / 100 + 4].method5491(Static335.anInt6568 - 8, Static40.anInt716 - 8);
		}
		Static35.method572();
	}
}
