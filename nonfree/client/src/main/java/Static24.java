import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Lclient!lc;")
	public static Class98 aClass98_11;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
	public static int anInt438;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public static int anInt439;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Lclient!cc;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "[Lclient!li;")
	public static Class101[] aClass101Array1 = new Class101[6];

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "[I")
	public static int[] anIntArray44 = new int[128];

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	public static int anInt440 = 0;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	public static int anInt441 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	public static void method379() {
		aClass22_2 = null;
		aClass101Array1 = null;
		aClass98_11 = null;
		anIntArray44 = null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public static void method380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class73 local3 = Static112.method1925(arg0);
		@Pc(6) int local6 = local3.anInt2594;
		@Pc(9) int local9 = local3.anInt2586;
		@Pc(20) int local20 = local3.anInt2590;
		@Pc(27) int local27 = Class154.anIntArray428[local20 - local9];
		if (arg1 < 0 || local27 < arg1) {
			arg1 = 0;
		}
		local27 <<= local9;
		Static234.method3668(local6, arg1 << local9 & local27 | Static221.anIntArray393[local6] & ~local27);
	}
}
