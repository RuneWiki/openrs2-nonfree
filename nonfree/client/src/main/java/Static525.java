import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!u", name = "ed", descriptor = "I")
	public static int anInt8446 = 0;

	@OriginalMember(owner = "client!u", name = "fd", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_139 = new Class349(41, 3);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z")
	public static boolean method6782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIFIZII)[[I")
	public static int[][] method6785(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub4_Sub26 local13 = new Class2_Sub4_Sub26();
		local13.anInt7134 = 3;
		local13.anInt7130 = (int) (arg0 * 4096.0F);
		local13.anInt7135 = 4;
		local13.aBoolean586 = false;
		local13.anInt7133 = 4;
		local13.method7562();
		Static95.method1452(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method5823(local45, local9[local45]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!r;II)Lclient!fo;")
	public static Class112 method6788(@OriginalArg(0) Class162 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class345 local14 = Static101.method1525(arg1, arg0, true);
		return local14 == null ? null : local14.aClass112_12;
	}
}
