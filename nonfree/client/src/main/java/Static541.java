import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "Lclient!db;")
	public static final Class64 aClass64_454 = new Class64(98, -1);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZII)I")
	public static int method7508(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class4_Sub20 local15 = Static17.method367(arg2, arg0);
		if (local15 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15.anIntArray308.length; local29++) {
				if (local15.anIntArray309[local29] == arg1) {
					local27 += local15.anIntArray308[local29];
				}
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ag;")
	public static Class10_Sub1 method7510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class35 local14 = local7.aClass35_2; local14 != null; local14 = local14.aClass35_1) {
			@Pc(18) Class10_Sub1 local18 = local14.aClass10_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort116 == arg1 && local18.aShort117 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIBI)V")
	public static void method7511(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static359.anInt6232 = arg0;
		Static68.anInt1306 = 0;
		Static252.anInt4971 = 0;
		Static589.anInt9684 = arg1;
	}
}
