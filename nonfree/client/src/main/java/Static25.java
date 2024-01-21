import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!ai;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lclient!wa;")
	public static Class1_Sub27[] aClass1_Sub27Array1;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
	public static int anInt670;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public static int anInt665 = 0;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_180 = Static81.method1507("Neuer Benutzer");

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	public static int anInt669 = 2;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_181 = Static81.method1507("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
	public static void method509(@OriginalArg(0) int arg0) {
		if (!Static110.method1903(arg0)) {
			return;
		}
		@Pc(14) Class98[] local14 = Static4.aClass98ArrayArray3[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class98 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt4384 = 0;
				local22.anInt4359 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZILclient!de;)V")
	public static void method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub2_Sub5 arg4) {
		@Pc(3) Class1_Sub5 local3 = new Class1_Sub5();
		local3.anInt691 = arg4.anInt983 * 128;
		local3.anInt688 = arg4.anInt962;
		local3.anInt680 = arg4.anInt960;
		local3.anInt684 = arg0;
		local3.anIntArray70 = arg4.anIntArray83;
		@Pc(31) int local31 = arg4.anInt958;
		local3.anInt681 = arg3 * 128;
		local3.anInt690 = arg1 * 128;
		local3.anInt687 = arg4.anInt959;
		@Pc(52) int local52 = arg4.anInt976;
		if (arg2 == 1 || arg2 == 3) {
			local52 = arg4.anInt958;
			local31 = arg4.anInt976;
		}
		local3.anInt689 = (arg1 + local31) * 128;
		local3.anInt692 = (local52 + arg3) * 128;
		if (arg4.anIntArray85 != null) {
			local3.aClass1_Sub2_Sub5_1 = arg4;
			local3.method523();
		}
		Static71.aClass87_11.method2823(local3);
		if (local3.anIntArray70 != null) {
			local3.anInt682 = (int) ((double) (local3.anInt680 - local3.anInt688) * Math.random()) + local3.anInt688;
		}
	}
}
