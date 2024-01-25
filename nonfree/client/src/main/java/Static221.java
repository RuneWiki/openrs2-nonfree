import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array10;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public static int anInt4940;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_45 = new Class94(12, 3);

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(II)S")
	public static short method4259(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(43) int local43 = local39 + local19;
		@Pc(51) int local51;
		if (local43 == 0) {
			local51 = local39 << 1;
		} else {
			local51 = (local39 << 8) / local43;
		}
		return (short) (local43 | local51 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
	public static void method4260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub6_Sub6 local13 = Static139.method3119(arg1, 16);
		local13.method3088();
		local13.anInt3368 = arg0;
	}
}
