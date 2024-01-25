import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_146 = new Class221("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "Z")
	public static boolean aBoolean327 = false;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_112 = new Class77(11, 1);

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_128 = new Class41(55, 0);

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "F")
	public static float aFloat45 = 0.0F;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "Z")
	public static boolean aBoolean328 = true;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_113 = new Class77(26, 6);

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "[I")
	public static final int[] anIntArray518 = new int[32];

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)V")
	public static void method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class12_Sub4 local13 = local7.aClass12_Sub4_3;
		@Pc(16) Class12_Sub4 local16 = local7.aClass12_Sub4_2;
		if (local13 != null) {
			local13.anInt5725 = local13.anInt5725 * arg3 / 16;
			local13.anInt5726 = local13.anInt5726 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5725 = local16.anInt5725 * arg3 / 16;
			local16.anInt5726 = local16.anInt5726 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)V")
	public static void method3802(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 6);
		local8.method412();
	}
}
