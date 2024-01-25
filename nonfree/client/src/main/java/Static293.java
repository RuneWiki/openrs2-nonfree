import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!km", name = "l", descriptor = "[S")
	public static short[] aShortArray76;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "Lclient!qq;")
	public static Class276 aClass276_3;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "[I")
	public static final int[] anIntArray351 = new int[2];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
	public static void method5060(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static31.aClass133_3.method3643(Static317.aClass192_24.method5299(Static307.anInt5931));
		@Pc(83) int local83;
		@Pc(40) int local40;
		if (Static165.aBoolean249) {
			for (@Pc(28) Class6_Sub2_Sub12 local28 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7242(); local28 != null; local28 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7241()) {
				if (local28.anInt5417 == 1) {
					local40 = Static588.method8284((Class6_Sub2_Sub4) local28.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66);
				} else {
					local40 = Static430.method6727(local28);
				}
				if (local40 > local13) {
					local13 = local40;
				}
			}
			Static483.anInt8373 = (Static270.aBoolean364 ? 26 : 22) + Static608.anInt10066 * 16;
			local13 += 8;
			local83 = Static608.anInt10066 * 16 + 21;
		} else {
			for (@Pc(90) Class6_Sub2_Sub4 local90 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local90 != null; local90 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
				local40 = Static588.method8284(local90);
				if (local13 < local40) {
					local13 = local40;
				}
			}
			Static483.anInt8373 = Static462.anInt8179 * 16 + (Static270.aBoolean364 ? 26 : 22);
			local13 += 8;
			local83 = Static462.anInt8179 * 16 + 21;
		}
		@Pc(137) int local137 = arg0 - local13 / 2;
		if (local137 + local13 > Static321.anInt6137) {
			local137 = Static321.anInt6137 - local13;
		}
		if (local137 < 0) {
			local137 = 0;
		}
		local40 = arg1;
		if (Static356.anInt6630 < local83 + arg1) {
			local40 = Static356.anInt6630 - local83;
		}
		if (local40 < 0) {
			local40 = 0;
		}
		Static29.anInt622 = local137;
		Static400.anInt7476 = local13;
		Static94.anInt1854 = local40;
		Static71.aBoolean94 = true;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!vd;B)Lclient!pga;")
	public static Class32 method5063(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1) {
		@Pc(10) Class32 local10 = (Class32) Static380.aClass166_12.method4805((long) arg0);
		if (local10 == null) {
			if (Static638.aBoolean725) {
				local10 = Static162.aClass100_7.method8773(Static651.method2396(arg1, arg0), true);
			} else {
				local10 = Static483.method7218(arg1.method8419(arg0));
			}
			Static380.aClass166_12.method4803(local10, (long) arg0);
		}
		return local10;
	}
}
