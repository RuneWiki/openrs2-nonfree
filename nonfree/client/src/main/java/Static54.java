import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!iq;")
	public static Class104 aClass104_39;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "[[[Lclient!dc;")
	public static Class51[][][] aClass51ArrayArrayArray1;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public static int anInt975;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!tb;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_44 = new Class221(49, 3);

	@OriginalMember(owner = "client!db", name = "G", descriptor = "[I")
	public static final int[] anIntArray90 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	public static int anInt976 = 0;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(II)Z")
	public static boolean method1199(@OriginalArg(0) int arg0) {
		Static28.aBoolean35 = true;
		Static281.anInt5678 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	public static void method1200() {
		Static29.method384();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)S")
	public static short method1201(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? (127 - local19) * local15 >> 7 : local15 * local19 >> 7;
		@Pc(43) int local43 = local39 + local19;
		@Pc(62) int local62;
		if (local43 == 0) {
			local62 = local39 << 1;
		} else {
			local62 = (local39 << 8) / local43;
		}
		return (short) (local62 >> 4 << 7 | local9 << 10 | local43);
	}
}
