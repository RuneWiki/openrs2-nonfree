import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wa", name = "Vc", descriptor = "Lclient!na;")
	public static Class56 aClass56_39;

	@OriginalMember(owner = "client!wa", name = "bd", descriptor = "I")
	public static int anInt2838;

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "Lclient!bc;")
	public static Class8 aClass8_62 = new Class8(64);

	@OriginalMember(owner = "client!wa", name = "Fb", descriptor = "[Lclient!kd;")
	public static Class44[] aClass44Array1 = new Class44[50];

	@OriginalMember(owner = "client!wa", name = "Qc", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1227 = Static119.method1462("Click to switch");

	@OriginalMember(owner = "client!wa", name = "Tc", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1228 = aClass65_1227;

	@OriginalMember(owner = "client!wa", name = "Zc", descriptor = "I")
	public static int anInt2837 = 0;

	@OriginalMember(owner = "client!wa", name = "ad", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1229 = Static119.method1462("<col=ffb000>");

	@OriginalMember(owner = "client!wa", name = "cd", descriptor = "I")
	public static int anInt2839 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLclient!ub;)V")
	public static void method1971(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		if (arg0.anInt1930 == 0) {
			return;
		}
		@Pc(33) int local33;
		@Pc(40) int local40;
		if (arg0.anInt1971 != -1 && arg0.anInt1971 < 32768) {
			@Pc(24) Class2_Sub1_Sub1_Sub4_Sub2 local24 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[arg0.anInt1971];
			if (local24 != null) {
				local33 = arg0.anInt1948 - local24.anInt1948;
				local40 = arg0.anInt1958 - local24.anInt1958;
				if (local33 != 0 || local40 != 0) {
					arg0.anInt1962 = (int) (Math.atan2((double) local33, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(65) int local65;
		if (arg0.anInt1971 >= 32768) {
			local65 = arg0.anInt1971 - 32768;
			if (Static93.anInt2098 == local65) {
				local65 = 2047;
			}
			@Pc(78) Class2_Sub1_Sub1_Sub4_Sub1 local78 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local65];
			if (local78 != null) {
				local40 = arg0.anInt1948 - local78.anInt1948;
				@Pc(93) int local93 = arg0.anInt1958 - local78.anInt1958;
				if (local40 != 0 || local93 != 0) {
					arg0.anInt1962 = (int) (Math.atan2((double) local40, (double) local93) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1933 != 0 || arg0.anInt1954 != 0) && (arg0.anInt1935 == 0 || arg0.anInt1946 > 0)) {
			local33 = arg0.anInt1958 - (arg0.anInt1954 - Static66.anInt1577 - Static66.anInt1577) * 64;
			local65 = arg0.anInt1948 - (arg0.anInt1933 - Static34.anInt791 - Static34.anInt791) * 64;
			if (local65 != 0 || local33 != 0) {
				arg0.anInt1962 = (int) (Math.atan2((double) local65, (double) local33) * 325.949D) & 0x7FF;
			}
			arg0.anInt1933 = 0;
			arg0.anInt1954 = 0;
		}
		local65 = arg0.anInt1962 - arg0.anInt1965 & 0x7FF;
		if (local65 == 0) {
			arg0.anInt1943 = 0;
			return;
		}
		arg0.anInt1943++;
		@Pc(221) boolean local221;
		if (local65 <= 1024) {
			arg0.anInt1965 += arg0.anInt1930;
			local221 = true;
			if (local65 < arg0.anInt1930 || local65 > 2048 - arg0.anInt1930) {
				arg0.anInt1965 = arg0.anInt1962;
				local221 = false;
			}
			if (arg0.anInt1920 == arg0.anInt1964 && (arg0.anInt1943 > 25 || local221)) {
				if (arg0.anInt1931 == -1) {
					arg0.anInt1920 = arg0.anInt1959;
				} else {
					arg0.anInt1920 = arg0.anInt1931;
				}
			}
		} else {
			local221 = true;
			arg0.anInt1965 -= arg0.anInt1930;
			if (local65 < arg0.anInt1930 || local65 > 2048 - arg0.anInt1930) {
				local221 = false;
				arg0.anInt1965 = arg0.anInt1962;
			}
			if (arg0.anInt1920 == arg0.anInt1964 && (arg0.anInt1943 > 25 || local221)) {
				if (arg0.anInt1917 == -1) {
					arg0.anInt1920 = arg0.anInt1959;
				} else {
					arg0.anInt1920 = arg0.anInt1917;
				}
			}
		}
		arg0.anInt1965 &= 0x7FF;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public static void method1975() {
		aClass56_39 = null;
		aClass65_1227 = null;
		aClass65_1228 = null;
		aClass8_62 = null;
		aClass65_1229 = null;
		aClass44Array1 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!pe;IILclient!pe;ZILclient!na;)V")
	public static void method1979(@OriginalArg(0) Class65 arg0, @OriginalArg(3) Class65 arg1, @OriginalArg(6) Class56 arg2) {
		@Pc(8) int local8 = arg2.method1690(arg1);
		@Pc(18) int local18 = arg2.method1667(arg0, local8);
		Static108.method1745(local18, 255, local8, arg2);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZJ)V")
	public static void method1981(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static49.aClass2_Sub4_Sub1_1.method962(45);
			Static49.aClass2_Sub4_Sub1_1.method948(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	public static void method1982() {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = -1; local3 < Static35.anInt795; local3++) {
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static76.anIntArray223[local3];
			}
			@Pc(20) Class2_Sub1_Sub1_Sub4_Sub1 local20 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local12];
			if (local20 != null && local20.anInt1955 > 0) {
				local20.anInt1955--;
				if (local20.anInt1955 == 0) {
					local20.aClass65_838 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static110.anInt2469; local12++) {
			@Pc(56) int local56 = Static117.anIntArray340[local12];
			@Pc(60) Class2_Sub1_Sub1_Sub4_Sub2 local60 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local56];
			if (local60 != null && local60.anInt1955 > 0) {
				local60.anInt1955--;
				if (local60.anInt1955 == 0) {
					local60.aClass65_838 = null;
				}
			}
		}
	}
}
