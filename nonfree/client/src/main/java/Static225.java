import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[Lclient!ga;")
	public static Class59[] aClass59Array2;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public static int anInt4216 = 0;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public static int anInt4217 = -1;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
	public static int[] anIntArray470 = new int[5];

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public static int anInt4219 = 0;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString144 = "Started 3d Library";

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!uo;I)[Lclient!nc;")
	public static Class115[] method3627(@OriginalArg(0) Class176 arg0) {
		if (!arg0.method4375()) {
			return new Class115[0];
		}
		@Pc(17) Class153 local17 = arg0.method4367();
		while (local17.anInt4614 == 0) {
			Static16.method242(10L);
		}
		if (local17.anInt4614 == 2) {
			return new Class115[0];
		}
		@Pc(43) int[] local43 = (int[]) local17.anObject6;
		@Pc(49) Class115[] local49 = new Class115[local43.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
			@Pc(59) Class115 local59 = new Class115();
			local49[local51] = local59;
			local59.anInt3479 = local43[local51 << 2];
			local59.anInt3482 = local43[(local51 << 2) + 1];
			local59.anInt3481 = local43[(local51 << 2) + 2];
			local59.anInt3478 = local43[(local51 << 2) + 3];
		}
		return local49;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
	public static void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class18 local13 = local7.aClass18_1;
		if (local13 != null) {
			local13.anInt562 = local13.anInt562 * arg3 / 16;
			local13.anInt560 = local13.anInt560 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3630(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static69.aStringArray6.length; local12++) {
			if (Static69.aStringArray6[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
	public static void method3631() {
		Static183.aClass175_29.method4288(5);
		Static43.aClass175_8.method4288(5);
	}
}
