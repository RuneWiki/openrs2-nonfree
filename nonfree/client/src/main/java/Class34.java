import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class34 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_446 = Static12.method257("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_445 = Static12.method257("");

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_450 = Static12.method257("glow2:");

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_447 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_444 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_448 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public static int anInt1548 = -1;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_449 = Static12.method257("Use @lre@");

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_453 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_451 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_452 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!qc;")
	public static Class47 aClass47_14 = new Class47(64);

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	public static int anInt1550 = 0;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7 = new byte[4][104][104];

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
	private final int[] anIntArray315;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I", line = 28)
	public int method1038(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.anIntArray315.length - 2;
		@Pc(20) int local20 = local14 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray315[local20];
			if (arg0 == local25) {
				return this.anIntArray315[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local20 + 2 & local14;
		}
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([I)V", line = 216)
	public Class34(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray315 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray315[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray315[local57 + local57 + 1] != -1; local57 = local5 - 1 & local57 + 1) {
			}
			this.anIntArray315[local57 + local57] = arg0[local47];
			this.anIntArray315[local57 + local57 + 1] = local47++;
		}
	}
}
