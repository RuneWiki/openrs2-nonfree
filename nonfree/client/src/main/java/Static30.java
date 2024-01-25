import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!ks;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_17 = new Class211(1, 12);

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_14 = new Class134("K", "T", "K", "K");

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
	public static int anInt587 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ta;BLclient!at;ILclient!o;III)V")
	public static void method455(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static414.anInt6776 == 4) {
			local16 = (int) Static113.aFloat19 & 0x3FFF;
		} else {
			local16 = Static363.anInt6120 + (int) Static113.aFloat19 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg1.anInt294 / 2, arg1.anInt285 / 2) + 10;
		@Pc(48) int local48 = arg5 * arg5 + arg4 * arg4;
		if (local48 > local40 * local40) {
			return;
		}
		@Pc(58) int local58 = Class155.anIntArray342[local16];
		@Pc(62) int local62 = Class155.anIntArray341[local16];
		if (Static414.anInt6776 != 4) {
			local62 = local62 * 256 / (Static454.anInt7274 + 256);
			local58 = local58 * 256 / (Static454.anInt7274 + 256);
		}
		@Pc(93) int local93 = local58 * arg5 + local62 * arg4 >> 15;
		@Pc(104) int local104 = local62 * arg5 - arg4 * local58 >> 15;
		arg3.method5666(arg1.anInt294 / 2 + arg2 + local93 - arg3.RA() / 2, arg1.anInt285 / 2 + (arg6 - local104 - arg3.Q() / 2), arg0, arg2, arg6);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZILclient!sv;)V")
	public static void method456(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (Static29.aClass110_2 == null) {
			return;
		}
		try {
			Static29.aClass110_2.method2262(0L);
			Static29.aClass110_2.method2269(24, arg1.aByteArray52, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BZZII)I")
	public static int method458(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(12) Class2_Sub36 local12 = Static382.method4911(false, arg1);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(25) int local25 = 0; local25 < local12.anIntArray395.length; local25++) {
			if (local12.anIntArray395[local25] >= 0 && local12.anIntArray395[local25] < Static384.aClass164_2.anInt4231) {
				@Pc(56) Class208 local56 = Static384.aClass164_2.method3458(local12.anIntArray395[local25]);
				@Pc(66) int local66 = local56.method4477(Static234.aClass135_1.method2749(arg2).anInt5511, arg2);
				if (arg0) {
					local18 += local12.anIntArray396[local25] * local66;
				} else {
					local18 += local66;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
	public static int method460() {
		@Pc(7) Class163 local7 = Static82.aClass163_1;
		@Pc(9) boolean local9 = false;
		if (Static288.anInt4743 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static460.method5567(0, 0, local18, null, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static110.method1702();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method5523();
		}
		@Pc(63) int local63 = (int) (Static110.method1702() - local35);
		local7.method5545(100, -16777216, 100, 0, 0);
		if (local9) {
			local7.method5554();
		}
		return local63;
	}
}
