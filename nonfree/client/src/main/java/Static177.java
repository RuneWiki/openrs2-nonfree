import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_123 = new Class34("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
	public static final int[] anIntArray372 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	public static void method3699() {
		if (Static119.aBoolean262) {
			return;
		}
		Static119.aBoolean262 = true;
		if (Static327.aBoolean607) {
			Static75.aFloat13 = (int) Static75.aFloat13 - 65 & 0xFFFFFF80;
		} else {
			Static356.aFloat79 += (-24.0F - Static356.aFloat79) / 2.0F;
		}
		Static329.aBoolean614 = true;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ip;)V")
	public static void method3700(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1) {
		Static298.aClass53Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!nh;I)[Lclient!tr;")
	public static Class200[] method3701(@OriginalArg(0) Class143 arg0) {
		if (!arg0.method3895()) {
			return new Class200[0];
		}
		@Pc(16) Class162 local16 = arg0.method3888();
		while (local16.anInt4801 == 0) {
			Static190.method3690(10L);
		}
		if (local16.anInt4801 == 2) {
			return new Class200[0];
		}
		@Pc(43) int[] local43 = (int[]) local16.anObject5;
		@Pc(49) Class200[] local49 = new Class200[local43.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
			@Pc(57) Class200 local57 = new Class200();
			local49[local51] = local57;
			local57.anInt6071 = local43[local51 << 2];
			local57.anInt6072 = local43[(local51 << 2) + 1];
			local57.anInt6074 = local43[(local51 << 2) + 2];
			local57.anInt6068 = local43[(local51 << 2) + 3];
		}
		return local49;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
	public static void method3703(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static77.aClass194ArrayArrayArray1 = Static91.aClass194ArrayArrayArray2;
			Static298.aClass53Array3 = Static269.aClass53Array2;
		} else {
			Static77.aClass194ArrayArrayArray1 = Static313.aClass194ArrayArrayArray3;
			Static298.aClass53Array3 = Static190.aClass53Array1;
		}
		Static113.anInt2651 = Static77.aClass194ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3704(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
