import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kga", name = "v", descriptor = "Lclient!sea;")
	public static final Class308 aClass308_6 = new Class308("runescape", 0);

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIBI)I")
	public static int method3511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!ps;)V")
	public static void method3513(@OriginalArg(1) Class273 arg0) {
		@Pc(7) Class273 local7 = Static561.method7333(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local12 = Static172.anInt2621;
			local15 = Static187.anInt8962;
		} else {
			local12 = local7.anInt6883;
			local15 = local7.anInt6814;
		}
		Static277.method4019(false, local15, local12, arg0);
		Static389.method5370(local12, local15, arg0);
	}
}
