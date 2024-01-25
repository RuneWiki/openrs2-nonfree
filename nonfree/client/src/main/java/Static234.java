import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!om", name = "v", descriptor = "[I")
	public static final int[] anIntArray413 = new int[25];

	@OriginalMember(owner = "client!om", name = "D", descriptor = "Lclient!al;")
	public static final Class11 aClass11_98 = new Class11(8);

	@OriginalMember(owner = "client!om", name = "E", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V")
	public static void method4100() {
		Static262.aClass46_7.method5175(Static206.aFloat147, Static28.aFloat13, Static347.aFloat146);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBII)V")
	public static void method4102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static241.anInt5680 / (float) Static241.anInt5687;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg1 - local11) / 2;
		@Pc(49) int local49 = arg2 - (arg3 - local13) / 2;
		Static195.anInt3964 = -1;
		Static297.anInt5698 = local40 * Static241.anInt5687 / local11;
		Static273.anInt5198 = -1;
		Static41.anInt983 = Static241.anInt5680 - local49 * Static241.anInt5680 / local13;
		Static22.method502();
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)I")
	public static int method4105() {
		@Pc(11) Class11 local11 = Static93.aClass11_50;
		synchronized (Static93.aClass11_50) {
			return Static93.aClass11_50.method218();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!jr;I)Lclient!gr;")
	public static Class81 method4106(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub3 arg1) {
		@Pc(9) Class81 local9;
		if (Static236.aClass81_2 == null) {
			local9 = new Class81();
		} else {
			local9 = Static236.aClass81_2;
			Static236.aClass81_2 = Static236.aClass81_2.aClass81_3;
			local9.aClass81_3 = null;
			Static277.anInt5269--;
		}
		local9.aClass10_Sub3_1 = arg1;
		local9.anInt2432 = arg0;
		return local9;
	}
}
