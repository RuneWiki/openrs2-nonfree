import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "Lclient!op;")
	public static Class275 aClass275_5;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "Lclient!ha;")
	public static Class67 aClass67_16;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "Lclient!lb;")
	public static Class221 aClass221_154;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "Z")
	public static boolean aBoolean733;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "[Lclient!bla;")
	public static Class19_Sub1[] aClass19_Sub1Array3;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Z")
	public static boolean aBoolean732 = false;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "Lclient!pc;")
	public static final Class281 aClass281_8 = new Class281();

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Z")
	public static boolean aBoolean734 = false;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "[Lclient!ln;")
	public static final Class232[] aClass232Array1 = new Class232[6];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIILclient!gia;I)Lclient!to;")
	public static Class245_Sub2_Sub1 method8476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class67_Sub2 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean327 || Static28.method398(arg2) && Static28.method398(arg1)) {
			return new Class245_Sub2_Sub1(arg3, 3553, arg4, arg0, arg2, arg1, true);
		} else if (arg3.aBoolean308) {
			return new Class245_Sub2_Sub1(arg3, 34037, arg4, arg0, arg2, arg1, true);
		} else {
			return new Class245_Sub2_Sub1(arg3, arg4, arg0, arg2, arg1, Static60.method735(arg2), Static60.method735(arg1), true);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!gg;B[[B)V")
	public static void method8477(@OriginalArg(0) Class131_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt3589; local3++) {
			Static140.method2345();
			for (@Pc(11) int local11 = 0; local11 < Static362.anInt8653 >> 3; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static206.anInt11291 >> 3; local15++) {
					@Pc(25) int local25 = Static486.anIntArrayArrayArray6[local3][local11][local15];
					if (local25 != -1) {
						@Pc(35) int local35 = local25 >> 24 & 0x3;
						if (!arg0.aBoolean291 || local35 == 0) {
							@Pc(51) int local51 = local25 >> 1 & 0x3;
							@Pc(57) int local57 = local25 >> 14 & 0x3FF;
							@Pc(63) int local63 = local25 >> 3 & 0x7FF;
							@Pc(74) int local74 = (local57 / 8 << 8) + (local63 / 8);
							for (@Pc(76) int local76 = 0; local76 < Static46.anIntArray54.length; local76++) {
								if (local74 == Static46.anIntArray54[local76] && arg1[local76] != null) {
									arg0.method3085(local51, local3, (local63 & 0x7) * 8, Static488.aClass67_12, local15 * 8, local35, local11 * 8, Static678.aClass360Array5, arg1[local76], (local57 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (25 != 25) {
			aBoolean732 = false;
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)J")
	public static synchronized long method8479() {
		@Pc(12) long local12 = System.currentTimeMillis();
		if (Static124.aLong90 > local12) {
			Static362.aLong291 += Static124.aLong90 - local12;
		}
		Static124.aLong90 = local12;
		return local12 + Static362.aLong291;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
	public static void method8480() {
		Static238.aClass136_22.method3505();
	}
}
