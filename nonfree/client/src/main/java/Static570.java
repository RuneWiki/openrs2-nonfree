import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!tga", name = "u", descriptor = "Lclient!lq;")
	public static Class224 aClass224_11;

	@OriginalMember(owner = "client!tga", name = "r", descriptor = "Lclient!kia;")
	public static Class201 aClass201_10;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tga", name = "q", descriptor = "Ljava/lang/Class;")
	private static Class aClass25;

	@OriginalMember(owner = "client!tga", name = "w", descriptor = "[I")
	public static final int[] anIntArray536 = new int[3];

	@OriginalMember(owner = "client!tga", name = "p", descriptor = "Z")
	public static boolean aBoolean734 = true;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB)I")
	public static int method8202(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!qja;)V")
	public static void method8203(@OriginalArg(1) Class5_Sub44 arg0) {
		if (Static260.aClass174ArrayArrayArray2 == null) {
			return;
		}
		@Pc(18) Interface16 local18 = null;
		if (arg0.anInt8143 == 0) {
			local18 = (Interface16) Static87.method1318(arg0.anInt8144, arg0.anInt8141, arg0.anInt8152);
		}
		if (arg0.anInt8143 == 1) {
			local18 = (Interface16) Static532.method7888(arg0.anInt8144, arg0.anInt8141, arg0.anInt8152);
		}
		if (arg0.anInt8143 == 2) {
			local18 = (Interface16) Static465.method5496(arg0.anInt8144, arg0.anInt8141, arg0.anInt8152, aClass25 == null ? (aClass25 = Class70_Sub2.a("nda")) : aClass25);
		}
		if (arg0.anInt8143 == 3) {
			local18 = (Interface16) Static209.method3036(arg0.anInt8144, arg0.anInt8141, arg0.anInt8152);
		}
		if (local18 == null) {
			arg0.anInt8140 = 0;
			arg0.anInt8150 = 0;
			arg0.anInt8148 = -1;
		} else {
			arg0.anInt8148 = local18.method8089();
			arg0.anInt8150 = local18.method8092(18636);
			arg0.anInt8140 = local18.method8091(false);
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(JI)V")
	public static void method8205(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static497.anInt10511;
		@Pc(9) int local9 = Static291.anInt5066;
		@Pc(20) int local20;
		@Pc(28) int local28;
		if (Static425.anInt7328 != local7) {
			local20 = local7 - Static425.anInt7328;
			local28 = (int) ((long) local20 * arg0 / 320L);
			if (local20 <= 0) {
				if (local28 == 0) {
					local28 = -1;
				} else if (local28 < local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = 1;
			} else if (local20 < local28) {
				local28 = local20;
			}
			Static425.anInt7328 += local28;
		}
		if (local9 != Static349.anInt6137) {
			local20 = local9 - Static349.anInt6137;
			local28 = (int) ((long) local20 * arg0 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local28 > local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local28 < local20) {
				local28 = local20;
			}
			Static349.anInt6137 += local28;
		}
		Static138.aFloat18 += (float) arg0 * Static149.aFloat23 / 40.0F * 8.0F;
		Static429.aFloat132 += Static10.aFloat3 * (float) arg0 / 40.0F * 8.0F;
		Static369.method5420();
	}
}
