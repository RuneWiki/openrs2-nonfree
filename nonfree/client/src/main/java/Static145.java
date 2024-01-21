import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
	public static int anInt2993;

	@OriginalMember(owner = "client!oh", name = "mb", descriptor = "Lclient!b;")
	public static Class6 aClass6_75;

	@OriginalMember(owner = "client!oh", name = "Z", descriptor = "Lclient!gj;")
	public static Class40 aClass40_10 = new Class40(32);

	@OriginalMember(owner = "client!oh", name = "kb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1394 = Static193.method3027("Lade)3)3)3");

	@OriginalMember(owner = "client!oh", name = "lb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1395 = Static193.method3027("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!oh", name = "nb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1396 = Static193.method3027("::");

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLclient!we;)V")
	public static void method2122(@OriginalArg(1) Class26_Sub2 arg0) {
		if (arg0.anInt2616 == 0) {
			return;
		}
		@Pc(43) int local43;
		@Pc(37) int local37;
		if (arg0.anInt2620 != -1 && arg0.anInt2620 < 32768) {
			@Pc(28) Class26_Sub2_Sub2 local28 = Static8.aClass26_Sub2_Sub2Array1[arg0.anInt2620];
			if (local28 != null) {
				local37 = arg0.anInt2611 - local28.anInt2611;
				local43 = arg0.anInt2593 - local28.anInt2593;
				if (local43 != 0 || local37 != 0) {
					arg0.anInt2644 = (int) (Math.atan2((double) local43, (double) local37) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt2620 >= 32768) {
			local73 = arg0.anInt2620 - 32768;
			if (Static64.anInt1360 == local73) {
				local73 = 2047;
			}
			@Pc(82) Class26_Sub2_Sub1 local82 = Static146.aClass26_Sub2_Sub1Array1[local73];
			if (local82 != null) {
				local37 = arg0.anInt2593 - local82.anInt2593;
				@Pc(98) int local98 = arg0.anInt2611 - local82.anInt2611;
				if (local37 != 0 || local98 != 0) {
					arg0.anInt2644 = (int) (Math.atan2((double) local37, (double) local98) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2622 != 0 || arg0.anInt2631 != 0) && (arg0.anInt2635 == 0 || arg0.anInt2586 > 0)) {
			local73 = arg0.anInt2593 + arg0.anInt2604 * 64 - (-Static30.anInt695 + arg0.anInt2622 + -Static30.anInt695) * 64 - 64;
			local43 = arg0.anInt2611 + (arg0.anInt2604 - 1) * 64 - (arg0.anInt2631 - Static55.anInt1184 - Static55.anInt1184) * 64;
			if (local73 != 0 || local43 != 0) {
				arg0.anInt2644 = (int) (Math.atan2((double) local73, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.anInt2631 = 0;
			arg0.anInt2622 = 0;
		}
		local73 = arg0.anInt2644 - arg0.anInt2605 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt2602 = 0;
			return;
		}
		arg0.anInt2602++;
		@Pc(235) boolean local235;
		if (local73 <= 1024) {
			arg0.anInt2605 += arg0.anInt2616;
			local235 = true;
			if (local73 < arg0.anInt2616 || 2048 - arg0.anInt2616 < local73) {
				arg0.anInt2605 = arg0.anInt2644;
				local235 = false;
			}
			if (arg0.anInt2596 == arg0.anInt2594 && (arg0.anInt2602 > 25 || local235)) {
				if (arg0.anInt2633 == -1) {
					arg0.anInt2596 = arg0.anInt2603;
				} else {
					arg0.anInt2596 = arg0.anInt2633;
				}
			}
		} else {
			local235 = true;
			arg0.anInt2605 -= arg0.anInt2616;
			if (local73 < arg0.anInt2616 || local73 > 2048 - arg0.anInt2616) {
				arg0.anInt2605 = arg0.anInt2644;
				local235 = false;
			}
			if (arg0.anInt2596 == arg0.anInt2594 && (arg0.anInt2602 > 25 || local235)) {
				if (arg0.anInt2609 == -1) {
					arg0.anInt2596 = arg0.anInt2603;
				} else {
					arg0.anInt2596 = arg0.anInt2609;
				}
			}
		}
		arg0.anInt2605 &= 0x7FF;
	}
}
