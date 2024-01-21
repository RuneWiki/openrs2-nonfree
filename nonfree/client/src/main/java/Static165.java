import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "Lclient!kd;")
	public static Class2_Sub11 aClass2_Sub11_3;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
	public static final int anInt3490 = 3353893;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_12 = new Class13();

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
	public static int anInt3491 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIIII)V")
	public static void method2409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg2 - arg0;
		@Pc(15) int local15 = arg1 - arg4;
		if (local6 == 0) {
			if (local15 != 0) {
				Static36.method623(arg3, arg1, arg0, arg4);
			}
		} else if (local15 == 0) {
			Static33.method568(arg0, arg2, arg3, arg4);
		} else {
			@Pc(48) int local48 = (local15 << 12) / local6;
			@Pc(57) int local57 = arg4 - (arg0 * local48 >> 12);
			@Pc(70) int local70;
			@Pc(68) int local68;
			if (arg0 < Static122.anInt2718) {
				local68 = (Static122.anInt2718 * local48 >> 12) + local57;
				local70 = Static122.anInt2718;
			} else if (Static153.anInt3279 < arg0) {
				local68 = local57 + (Static153.anInt3279 * local48 >> 12);
				local70 = Static153.anInt3279;
			} else {
				local68 = arg4;
				local70 = arg0;
			}
			if (Static154.anInt3307 > local68) {
				local70 = (Static154.anInt3307 - local57 << 12) / local48;
				local68 = Static154.anInt3307;
			} else if (Static15.anInt353 < local68) {
				local68 = Static15.anInt353;
				local70 = (Static15.anInt353 - local57 << 12) / local48;
			}
			@Pc(142) int local142;
			@Pc(144) int local144;
			if (arg2 < Static122.anInt2718) {
				local144 = local57 + (local48 * Static122.anInt2718 >> 12);
				local142 = Static122.anInt2718;
			} else if (arg2 <= Static153.anInt3279) {
				local142 = arg2;
				local144 = arg1;
			} else {
				local144 = local57 + (Static153.anInt3279 * local48 >> 12);
				local142 = Static153.anInt3279;
			}
			if (local144 < Static154.anInt3307) {
				local142 = (Static154.anInt3307 - local57 << 12) / local48;
				local144 = Static154.anInt3307;
			} else if (local144 > Static15.anInt353) {
				local144 = Static15.anInt353;
				local142 = (Static15.anInt353 - local57 << 12) / local48;
			}
			Static194.method2778(arg3, local144, local68, local142, local70);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ii;I)V")
	public static void method2410(@OriginalArg(0) Class47 arg0) {
		if (arg0.anInt1900 == Static49.anInt1077) {
			Static176.aBooleanArray19[arg0.anInt1897] = true;
		}
	}
}
