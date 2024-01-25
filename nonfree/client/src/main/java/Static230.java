import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "J")
	public static long aLong124;

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "Lclient!kb;")
	public static Class183 aClass183_3;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
	public static final int anInt4189 = 328;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
	public static void method3720() {
		Static313.anInt4728 = 1;
		Static135.anInt2897 = -1;
		if (Static590.aString106 == null) {
			Static6.method139(35);
		} else {
			@Pc(21) Class4_Sub11 local21 = new Class4_Sub11(Static228.method3614(Static199.method3402(Static590.aString106)));
			@Pc(25) long local25 = local21.method4903();
			Static129.aLong67 = local21.method4903();
			Static263.method4439("", true, Static315.method5297(local25));
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIB)Z")
	public static boolean method3721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
