import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "Lclient!ah;")
	public static Class7 aClass7_54;

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1111 = Static170.method3101("Please contact customer support)3");

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "[I")
	public static int[] anIntArray581 = new int[1000];

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	public static int anInt3377 = 0;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1112 = aClass28_1111;

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
	public static int anInt3379 = 0;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] method2590() {
		@Pc(11) Class3_Sub2_Sub2_Sub4[] local11 = new Class3_Sub2_Sub2_Sub4[Static85.anInt2511];
		for (@Pc(13) int local13 = 0; local13 < Static85.anInt2511; local13++) {
			@Pc(18) Class3_Sub2_Sub2_Sub4 local18 = new Class3_Sub2_Sub2_Sub4();
			local18.anInt1173 = Static172.anInt4139;
			local18.anInt1172 = Static114.anInt2920;
			local18.anInt1174 = Static59.anIntArray293[local13];
			local18.anInt1176 = Static173.anIntArray690[local13];
			local18.anInt1175 = Static83.anIntArray394[local13];
			local18.anInt1171 = Static95.anIntArray452[local13];
			@Pc(48) byte[] local48 = Static59.aByteArrayArray41[local13];
			@Pc(54) int local54 = local18.anInt1171 * local18.anInt1175;
			local18.anIntArray222 = new int[local54];
			for (@Pc(60) int local60 = 0; local60 < local54; local60++) {
				local18.anIntArray222[local60] = Static55.anIntArray272[local48[local60] & 0xFF];
			}
			local11[local13] = local18;
		}
		Static82.method1880();
		return local11;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
	public static void method2592() {
		aClass28_1112 = null;
		aClass28_1111 = null;
		aClass7_54 = null;
		anIntArray581 = null;
	}
}
