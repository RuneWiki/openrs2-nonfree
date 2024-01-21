import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1162 = Static161.method2452("Please contact customer support)3");

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1163 = aClass20_1162;

	@OriginalMember(owner = "client!ph", name = "L", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1164 = Static161.method2452("rot:");

	@OriginalMember(owner = "client!ph", name = "T", descriptor = "[I")
	public static final int[] anIntArray333 = new int[5];

	@OriginalMember(owner = "client!ph", name = "Z", descriptor = "[S")
	public static final short[] aShortArray40 = new short[500];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!dc;)V")
	public static void method2313(@OriginalArg(1) Class20 arg0) {
		@Pc(3) Class5_Sub21 local3 = Static22.method2108(arg0);
		if (local3 == null) {
			return;
		}
		Static148.anInt3057 = Static59.anInt1331 + Static165.anInt2257 - local3.anInt2623;
		Static129.anInt2701 = local3.anInt2620 - Static207.anInt4070;
		@Pc(43) int local43 = Static129.anInt2701 - (int) ((double) Static122.aClass69_11.anInt2541 / Static216.aDouble11);
		@Pc(52) int local52 = Static129.anInt2701 + (int) ((double) Static122.aClass69_11.anInt2541 / Static216.aDouble11);
		if (local43 < 0) {
			Static129.anInt2701 = (int) ((double) Static122.aClass69_11.anInt2541 / Static216.aDouble11);
		}
		if (local52 > Static131.anInt2727) {
			Static129.anInt2701 = Static131.anInt2727 - (int) ((double) Static122.aClass69_11.anInt2541 / Static216.aDouble11);
		}
		@Pc(88) int local88 = Static148.anInt3057 - (int) ((double) Static122.aClass69_11.anInt2471 / Static216.aDouble11);
		@Pc(98) int local98 = Static148.anInt3057 + (int) ((double) Static122.aClass69_11.anInt2471 / Static216.aDouble11);
		if (local88 < 0) {
			Static148.anInt3057 = (int) ((double) Static122.aClass69_11.anInt2471 / Static216.aDouble11);
		}
		if (Static165.anInt2257 < local98) {
			Static148.anInt3057 = Static165.anInt2257 - (int) ((double) Static122.aClass69_11.anInt2471 / Static216.aDouble11);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	public static int method2316(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
	public static void method2319() {
		@Pc(7) byte[][] local7 = Static44.aByteArrayArray3;
		@Pc(10) int local10 = Static104.aByteArrayArray7.length;
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			@Pc(24) byte[] local24 = local7[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static125.anIntArray290[local18] & 0xFF) * 64 - Static110.anInt2295;
				@Pc(48) int local48 = (Static125.anIntArray290[local18] >> 8) * 64 - Static86.anInt1895;
				Static95.method1546();
				Static122.method1929(local37, Static9.aClass76Array1, local48, local24);
			}
		}
	}
}
