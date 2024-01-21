import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!d", name = "T", descriptor = "Z")
	public static volatile boolean aBoolean24 = true;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "Lclient!od;")
	private static Class60 aClass60_200 = Static41.method597("Loading config )2 ");

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "Lclient!od;")
	public static Class60 aClass60_199 = aClass60_200;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "[I")
	public static int[] anIntArray77 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!d", name = "wb", descriptor = "I")
	public static int anInt680 = 0;

	@OriginalMember(owner = "client!d", name = "xb", descriptor = "Lclient!od;")
	public static Class60 aClass60_201 = Static41.method597("Abbrechen");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBIIII)V")
	public static void method372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 2048 - arg3 & 0x7FF;
		@Pc(21) int local21 = 2048 - arg2 & 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg1;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(51) int local51;
		if (local15 != 0) {
			local36 = Class4_Sub3_Sub6_Sub4.anIntArray301[local15];
			local40 = Class4_Sub3_Sub6_Sub4.anIntArray304[local15];
			local51 = local40 * 0 - arg1 * local36 >> 16;
			local27 = local40 * arg1 + local36 * 0 >> 16;
			local25 = local51;
		}
		if (local21 != 0) {
			local36 = Class4_Sub3_Sub6_Sub4.anIntArray301[local21];
			local40 = Class4_Sub3_Sub6_Sub4.anIntArray304[local21];
			local51 = local27 * local36 + local40 * 0 >> 16;
			local27 = local27 * local40 - local36 * 0 >> 16;
			local23 = local51;
		}
		Static23.anInt806 = arg3;
		Static108.anInt2581 = arg2;
		Static23.anInt816 = arg0 - local25;
		Static109.anInt2592 = arg4 - local27;
		Static98.anInt2286 = arg5 - local23;
	}

	@OriginalMember(owner = "client!d", name = "j", descriptor = "(I)V")
	public static void method373() {
		for (@Pc(10) Class4_Sub24 local10 = (Class4_Sub24) Static16.aClass45_2.method982(); local10 != null; local10 = (Class4_Sub24) Static16.aClass45_2.method986()) {
			if (local10.aClass4_Sub1_Sub2_2 != null) {
				Static109.aClass4_Sub1_Sub3_1.method972(local10.aClass4_Sub1_Sub2_2);
				local10.aClass4_Sub1_Sub2_2 = null;
			}
			if (local10.aClass4_Sub1_Sub2_3 != null) {
				Static109.aClass4_Sub1_Sub3_1.method972(local10.aClass4_Sub1_Sub2_3);
				local10.aClass4_Sub1_Sub2_3 = null;
			}
		}
		Static16.aClass45_2.method984();
	}

	@OriginalMember(owner = "client!d", name = "k", descriptor = "(I)V")
	public static void method374() {
		aClass60_199 = null;
		aClass60_201 = null;
		anIntArray77 = null;
		aShortArrayArray7 = null;
		aClass60_200 = null;
	}
}
