import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!dja;")
	public static final Class80 aClass80_10 = new Class80("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[8];

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method7249(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static517.anInt8886 > 0) {
			local21 = Static466.aByteArrayArray19[--Static517.anInt8886];
			Static466.aByteArrayArray19[Static517.anInt8886] = null;
			return local21;
		} else if (arg0 == 5000 && Static83.anInt1454 > 0) {
			local21 = Static232.aByteArrayArray9[--Static83.anInt1454];
			Static232.aByteArrayArray9[Static83.anInt1454] = null;
			return local21;
		} else if (arg0 == 30000 && Static41.anInt659 > 0) {
			local21 = Static538.aByteArrayArray25[--Static41.anInt659];
			Static538.aByteArrayArray25[Static41.anInt659] = null;
			return local21;
		} else {
			if (Static218.aByteArrayArrayArray10 != null) {
				for (@Pc(80) int local80 = 0; local80 < Static232.anIntArray227.length; local80++) {
					if (Static232.anIntArray227[local80] == arg0 && Static654.anIntArray571[local80] > 0) {
						@Pc(108) byte[] local108 = Static218.aByteArrayArrayArray10[local80][--Static654.anIntArray571[local80]];
						Static218.aByteArrayArrayArray10[local80][Static654.anIntArray571[local80]] = null;
						return local108;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BI)V")
	public static synchronized void method7250(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static517.anInt8886 < 1000) {
			Static466.aByteArrayArray19[Static517.anInt8886++] = arg0;
		} else if (arg0.length == 5000 && Static83.anInt1454 < 250) {
			Static232.aByteArrayArray9[Static83.anInt1454++] = arg0;
		} else if (arg0.length == 30000 && Static41.anInt659 < 50) {
			Static538.aByteArrayArray25[Static41.anInt659++] = arg0;
		} else if (Static218.aByteArrayArrayArray10 != null) {
			for (@Pc(73) int local73 = 0; local73 < Static232.anIntArray227.length; local73++) {
				if (arg0.length == Static232.anIntArray227[local73] && Static654.anIntArray571[local73] < Static218.aByteArrayArrayArray10[local73].length) {
					Static218.aByteArrayArrayArray10[local73][Static654.anIntArray571[local73]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)I")
	public static int method7251(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) int local6 = arg2.length();
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local18 - local22 < local6 || local20 - local24 < local16) {
			if (local18 - local22 >= local6) {
				return -1;
			}
			if (local20 - local24 >= local16) {
				return 1;
			}
			@Pc(73) char local73;
			if (local22 == '\u0000') {
				local73 = arg2.charAt(local18++);
			} else {
				local73 = local22;
			}
			@Pc(85) char local85;
			if (local24 == '\u0000') {
				local85 = arg0.charAt(local20++);
			} else {
				local85 = local24;
			}
			local22 = Static482.method7254(local73);
			local24 = Static482.method7254(local85);
			local73 = Static332.method5144(local73, arg1);
			local85 = Static332.method5144(local85, arg1);
			if (local85 != local73 && Character.toUpperCase(local73) != Character.toUpperCase(local85)) {
				local73 = Character.toLowerCase(local73);
				local85 = Character.toLowerCase(local85);
				if (local73 != local85) {
					return Static441.method6593(local73, arg1) - Static441.method6593(local85, arg1);
				}
			}
		}
		@Pc(146) int local146 = Math.min(local6, local16);
		for (@Pc(148) int local148 = 0; local148 < local146; local148++) {
			if (arg1 == 2) {
				local20 = local16 - local148 - 1;
				local18 = local6 - local148 - 1;
			} else {
				local20 = local148;
				local18 = local148;
			}
			@Pc(177) char local177 = arg2.charAt(local18);
			@Pc(181) char local181 = arg0.charAt(local20);
			if (local177 != local181 && Character.toUpperCase(local177) != Character.toUpperCase(local181)) {
				local177 = Character.toLowerCase(local177);
				local181 = Character.toLowerCase(local181);
				if (local177 != local181) {
					return Static441.method6593(local177, arg1) - Static441.method6593(local181, arg1);
				}
			}
		}
		@Pc(236) int local236 = local6 - local16;
		if (local236 != 0) {
			return local236;
		}
		for (@Pc(243) int local243 = 0; local243 < local146; local243++) {
			@Pc(248) char local248 = arg2.charAt(local243);
			@Pc(252) char local252 = arg0.charAt(local243);
			if (local252 != local248) {
				return Static441.method6593(local248, arg1) - Static441.method6593(local252, arg1);
			}
		}
		return 0;
	}
}
