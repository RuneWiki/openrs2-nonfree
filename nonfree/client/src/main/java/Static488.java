import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!so", name = "s", descriptor = "I")
	public static int anInt9245;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array13;

	@OriginalMember(owner = "client!so", name = "B", descriptor = "I")
	public static int anInt9251;

	@OriginalMember(owner = "client!so", name = "C", descriptor = "I")
	public static int anInt9252;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_17 = new Class68(6, 0, 4, 2);

	@OriginalMember(owner = "client!so", name = "y", descriptor = "[I")
	public static int[] anIntArray531 = new int[1];

	@OriginalMember(owner = "client!so", name = "A", descriptor = "I")
	public static int anInt9250 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)I")
	public static int method7097(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)Z")
	public static boolean method7099(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IZ)I")
	public static int method7100(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)I")
	public static int method7101() {
		return Static204.anInt8817;
	}
}
