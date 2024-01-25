import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!nt", name = "G", descriptor = "F")
	public static float aFloat138;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_105 = new Class253(56, 0);

	@OriginalMember(owner = "client!nt", name = "C", descriptor = "I")
	public static final int anInt4675 = 1403;

	@OriginalMember(owner = "client!nt", name = "E", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_21 = new Class94(7, 6);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIZ)Z")
	public static boolean method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(12) int local12 = arg2; local12 <= arg3; local12++) {
			for (@Pc(16) int local16 = arg0; local16 <= arg4; local16++) {
				if (Static118.anIntArrayArray16[local12][local16] == arg1 && Static150.anIntArrayArray23[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method3706(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class7_Sub14 local12 = new Class7_Sub14(arg0);
		@Pc(14) int local14 = -1;
		label54: while (true) {
			@Pc(18) int local18 = local12.method3939();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(34) int local34;
				while (!local28) {
					local34 = local12.method3940();
					if (local34 == 0) {
						continue label54;
					}
					local26 += local34 - 1;
					@Pc(61) int local61 = local26 & 0x3F;
					@Pc(67) int local67 = local26 >> 6 & 0x3F;
					@Pc(73) int local73 = local12.method3981() >> 2;
					@Pc(77) int local77 = local67 + arg1;
					@Pc(81) int local81 = arg2 + local61;
					if (local77 > 0 && local81 > 0 && arg4 - 1 > local77 && arg3 - 1 > local81) {
						@Pc(106) Class189 local106 = Static411.aClass142_4.method3148(local14);
						if (local73 != 22 || Static130.aClass153_Sub1_1.aBoolean347 || local106.anInt5106 != 0 || local106.anInt5109 == 1 || local106.aBoolean320) {
							local28 = true;
							if (!local106.method4033()) {
								Static214.anInt2504++;
								local7 = false;
							}
						}
					}
				}
				local34 = local12.method3940();
				if (local34 == 0) {
					break;
				}
				local12.method3981();
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIII)I")
	public static int method3708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg0) {
			return arg2;
		} else if (arg0 <= arg1) {
			return arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)I")
	public static int method3709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z")
	public static boolean method3710(@OriginalArg(1) int arg0) {
		Static385.anInt6209 = arg0 + 1 & 0xFFFF;
		Static453.aBoolean504 = true;
		return true;
	}
}
