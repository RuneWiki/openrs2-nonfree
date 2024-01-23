import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	public static int anInt3360;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	public static int anInt3358 = 0;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	public static int anInt3362 = 0;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	public static int anInt3363 = 255;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(J[III)Ljava/lang/String;")
	public static String method2960(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (Static247.anInterface4_2 != null) {
			@Pc(14) String local14 = Static247.anInterface4_2.method2587(arg1, arg2, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Lclient!af;")
	public static Class4_Sub1 method2961() {
		return Static245.anInt4510 < Static25.aClass4_Sub1Array3.length ? Static25.aClass4_Sub1Array3[Static245.anInt4510++] : null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method2963(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) char[] local4 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(27) int local27 = arg0[local12 + arg2] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(46) char local46 = Static76.aCharArray5[local27 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local27 = local46;
				}
				local4[local10++] = (char) local27;
			}
		}
		return new String(local4, 0, local10);
	}
}
