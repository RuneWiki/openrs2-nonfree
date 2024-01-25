import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!na", name = "u", descriptor = "F")
	public static float aFloat130;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "I")
	public static int anInt5707;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "[I")
	public static final int[] anIntArray462 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_186 = new Class235(13, -1);

	@OriginalMember(owner = "client!na", name = "t", descriptor = "I")
	public static final int anInt5706 = 1405;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
	public static boolean aBoolean451 = false;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZI)I")
	public static int method4682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) Class1_Sub25 local10 = Static189.method2917(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray327.length; local24++) {
				if (arg1 == local10.anIntArray328[local24]) {
					local22 += local10.anIntArray327[local24];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(JJ)J")
	public static long method4683(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
