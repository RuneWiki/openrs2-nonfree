import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "Lclient!th;")
	public static Class169 aClass169_139 = new Class169(30);

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "[I")
	public static int[] anIntArray464 = new int[256];

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "[I")
	public static int[] anIntArray465 = new int[1000];

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "[I")
	public static int[] anIntArray466 = new int[14];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method3971() {
		if (Static92.anInt1758 == 5) {
			Static92.anInt1758 = 6;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!qf;B)Lclient!qf;")
	public static Class146 method3976(@OriginalArg(0) Class146 arg0) {
		@Pc(2) Class146 local2 = Static36.method644(arg0);
		if (local2 == null) {
			local2 = arg0.aClass146_14;
		}
		return local2;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method3977(@OriginalArg(1) String arg0) {
		@Pc(3) long local3 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local3 *= 37L;
			@Pc(28) char local28 = arg0.charAt(local17);
			if (local28 >= 'A' && local28 <= 'Z') {
				local3 += local28 + 1 - 65;
			} else if (local28 >= 'a' && local28 <= 'z') {
				local3 += local28 + 1 - 97;
			} else if (local28 >= '0' && local28 <= '9') {
				local3 += local28 + 27 - 48;
			}
			if (local3 >= 177917621779460413L) {
				break;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIB)V")
	public static void method3978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(40) String local40 = "::tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local40);
		Static302.method4513(local40);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	public static void method3980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class57 local7 = Static193.method3145(arg0);
		@Pc(10) int local10 = local7.anInt1481;
		@Pc(13) int local13 = local7.anInt1479;
		@Pc(16) int local16 = local7.anInt1480;
		@Pc(23) int local23 = Class191.anIntArray530[local16 - local13];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static307.method4559(Static46.anIntArray78[local10] & ~local23 | local23 & arg1 << local13, local10);
	}
}
