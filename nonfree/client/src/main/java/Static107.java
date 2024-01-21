import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public static int anInt2874;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_16;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "Lclient!he;")
	private static Class26 aClass26_1549 = Static6.method100("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_1547 = aClass26_1549;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Lclient!he;")
	private static Class26 aClass26_1550 = Static6.method100("Connection lost");

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Lclient!he;")
	public static Class26 aClass26_1548 = aClass26_1550;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient!ib;")
	public static Class3_Sub11_Sub1 aClass3_Sub11_Sub1_3 = new Class3_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "Lclient!sf;")
	public static Class66 aClass66_24 = new Class66(64);

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "Lclient!he;")
	public static Class26 aClass26_1551 = Static6.method100("(U0a )2 via: ");

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "Lclient!sf;")
	public static Class66 aClass66_25 = new Class66(64);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method1966() {
		aClass3_Sub11_Sub1_3 = null;
		aClass26_1548 = null;
		aClass16_Sub1_16 = null;
		aClass26_1551 = null;
		aClass26_1547 = null;
		anImage4 = null;
		aClass66_24 = null;
		aClass26_1550 = null;
		aClass26_1549 = null;
		aClass66_25 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public static void method1967(@OriginalArg(0) int arg0) {
		if (!Static73.method1341(arg0)) {
			return;
		}
		@Pc(14) Class3_Sub14[] local14 = Static49.aClass3_Sub14ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class3_Sub14 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2144 = 0;
				local22.anInt2196 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lclient!ta;")
	public static Class3_Sub1_Sub16 method1972(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub16 local12 = (Class3_Sub1_Sub16) Static86.aClass66_19.method1970((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static90.aClass16_Sub1_13.method566(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class3_Sub1_Sub16();
		@Pc(32) int local32 = 0;
		@Pc(37) Class3_Sub11 local37 = new Class3_Sub11(local22);
		local37.anInt1562 = local37.aByteArray13.length - 12;
		@Pc(48) int local48 = local37.method984();
		local12.anInt2930 = local37.method974();
		local12.anInt2924 = local37.method974();
		local12.anInt2929 = local37.method974();
		local12.anInt2927 = local37.method974();
		local37.anInt1562 = 0;
		local12.aClass26_1595 = local37.method991();
		local12.anIntArray348 = new int[local48];
		local12.aClass26Array24 = new Class26[local48];
		local12.anIntArray349 = new int[local48];
		while (local37.aByteArray13.length - 12 > local37.anInt1562) {
			@Pc(99) int local99 = local37.method974();
			if (local99 == 3) {
				local12.aClass26Array24[local32] = local37.method977();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray348[local32] = local37.method981();
			} else {
				local12.anIntArray348[local32] = local37.method984();
			}
			local12.anIntArray349[local32++] = local99;
		}
		Static86.aClass66_19.method1969((long) arg0, local12);
		return local12;
	}
}
