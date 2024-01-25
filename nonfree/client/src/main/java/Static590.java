import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
	public static int anInt10263;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "[[[Lclient!up;")
	public static Class333[][][] aClass333ArrayArrayArray3;

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "[I")
	public static int[] anIntArray599;

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
	public static int anInt10277;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_149 = new Class287(79, -1);

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_9 = new Class95(6, 1);

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_204 = new Class342(8);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	public static void method8114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static145.method2769(arg0, arg1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!ol;)V")
	public static void method8118(@OriginalArg(1) Class25_Sub2_Sub2_Sub5 arg0) {
		if (arg0.anIntArray510 == null && arg0.anIntArray509 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray510.length; local16++) {
			@Pc(25) int local25 = -1;
			if (arg0.anIntArray510 != null) {
				local25 = arg0.anIntArray510[local16];
			}
			if (local25 != -1) {
				local14 = false;
				@Pc(99) int local99;
				@Pc(92) int local92;
				@Pc(71) int local71;
				if ((local25 & 0xC0000000) == -1073741824) {
					local71 = local25 & 0xFFFFFFF;
					@Pc(144) int local144 = local71 >> 14;
					@Pc(148) int local148 = local71 & 0x3FFF;
					local99 = arg0.anInt8476 - (local144 - Static321.anInt5874) * 512 - 256;
					local92 = arg0.anInt8482 - (local148 - Static137.anInt3293) * 512 - 256;
				} else if ((local25 & 0x8000) == 0) {
					@Pc(108) Class3_Sub39 local108 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local25);
					if (local108 == null) {
						arg0.method6680(local16, -1);
						continue;
					}
					@Pc(113) Class25_Sub2_Sub2_Sub5_Sub2 local113 = local108.aClass25_Sub2_Sub2_Sub5_Sub2_2;
					local92 = arg0.anInt8482 - local113.anInt8482;
					local99 = arg0.anInt8476 - local113.anInt8476;
				} else {
					local71 = local25 & 0x7FFF;
					@Pc(75) Class25_Sub2_Sub2_Sub5_Sub1 local75 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local71];
					if (local75 == null) {
						arg0.method6680(local16, -1);
						continue;
					}
					local92 = arg0.anInt8482 - local75.anInt8482;
					local99 = arg0.anInt8476 - local75.anInt8476;
				}
				if (local99 != 0 || local92 != 0) {
					arg0.method6680(local16, (int) (Math.atan2((double) local99, (double) local92) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method6680(local16, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray510 = null;
			arg0.anIntArray509 = null;
		}
	}
}
