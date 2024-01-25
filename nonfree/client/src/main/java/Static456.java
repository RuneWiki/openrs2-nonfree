import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
	public static int anInt8435;

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "[Lclient!wv;")
	public static Class350[] aClass350Array2;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
	public static int anInt8437 = 0;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZB[B)V")
	public static void method7063(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static387.aClass6_Sub26_6 == null) {
			Static387.aClass6_Sub26_6 = new Class6_Sub26(20000);
		}
		Static387.aClass6_Sub26_6.method4939(arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static65.method1367(Static387.aClass6_Sub26_6.aByteArray65);
		Static199.aClass116_Sub1Array1 = new Class116_Sub1[Static511.anInt9007];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static74.anInt8666; local37 <= Static13.anInt573; local37++) {
			@Pc(43) Class116_Sub1 local43 = Static224.method4022(local37);
			if (local43 != null) {
				Static199.aClass116_Sub1Array1[local35++] = local43;
			}
		}
		Static436.aBoolean588 = false;
		Static111.aLong57 = Static174.method3502();
		Static387.aClass6_Sub26_6 = null;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
	public static void method7064() {
		@Pc(14) int local14 = (int) ((double) Static228.anInt4746 * 34.46D);
		local14 <<= 0x2;
		if (Static323.aClass9_8.method5407()) {
			local14 += 512;
		}
		Static323.aClass9_8.sa(200, local14);
	}
}
