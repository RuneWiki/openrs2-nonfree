import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!us", name = "b", descriptor = "Lclient!kea;")
	public static Class161 aClass161_38;

	@OriginalMember(owner = "client!us", name = "e", descriptor = "Lclient!gh;")
	public static Class106 aClass106_5;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "Lclient!fh;")
	public static final Class90 aClass90_5 = new Class90();

	@OriginalMember(owner = "client!us", name = "d", descriptor = "I")
	public static int anInt3719 = 0;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "Lclient!db;")
	public static final Class57 aClass57_5 = new Class57(11, 0, 1, 2);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)I")
	public static int method3120(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(30) int local30 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local7;
		return ((local35 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local35 & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZBI)I")
	public static int method3121(@OriginalArg(2) int arg0) {
		@Pc(14) Class3_Sub5 local14 = Static480.method7117(false, arg0);
		if (local14 == null) {
			return Static382.aClass275_1.method6842(arg0).anInt5041;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(34) int local34 = 0; local34 < local14.anIntArray120.length; local34++) {
			if (local14.anIntArray120[local34] == -1) {
				local24++;
			}
		}
		return local24 + Static382.aClass275_1.method6842(arg0).anInt5041 - local14.anIntArray120.length;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([FII)[F")
	public static float[] method3122(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static559.method5955(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
