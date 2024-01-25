import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!ya;")
	public static Class39 aClass39_6;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!wt;")
	public static Class271 aClass271_6;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "F")
	public static float aFloat56 = 1024.0F;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)I")
	public static int method3257(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3259(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 <= '\u07ff') {
				local10 += 2;
			} else {
				local10 += 3;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLclient!hp;)V")
	public static void method3260(@OriginalArg(1) Class1_Sub5 arg0) {
		if (arg0.aByteArray89.length - arg0.anInt6475 < 1) {
			return;
		}
		@Pc(24) int local24 = arg0.method5366();
		if (local24 < 0 || local24 > 1 || arg0.aByteArray89.length - arg0.anInt6475 < 2) {
			return;
		}
		@Pc(49) int local49 = arg0.method5362();
		if (arg0.aByteArray89.length - arg0.anInt6475 < local49 * 6) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < local49; local67++) {
			@Pc(72) int local72 = arg0.method5362();
			@Pc(76) int local76 = arg0.method5407();
			if (Static266.anIntArray630.length > local72 && Static32.aBooleanArray1[local72] && (Static139.aClass119_1.method2843(local72).aChar4 != '1' || local76 >= -1 && local76 <= 1)) {
				Static266.anIntArray630[local72] = local76;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)Lclient!uq;")
	public static Class251 method3261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class251 local14 = Static378.method3544(arg1);
		if (arg0 == -1) {
			return local14;
		} else if (local14 == null || local14.aClass251Array2 == null || arg0 >= local14.aClass251Array2.length) {
			return null;
		} else {
			return local14.aClass251Array2[arg0];
		}
	}
}
