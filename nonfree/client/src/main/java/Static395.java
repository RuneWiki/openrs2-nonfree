import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!o", name = "s", descriptor = "I")
	public static int anInt6810;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "I")
	public static int anInt6811;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "I")
	public static int anInt6816;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public static void method5851() {
		Static420.method6132();
		Static113.aBoolean192 = false;
		Static437.method6296(Static250.anInt4790, Static131.anInt2708, Static240.anInt9646, Static441.anInt7238);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBI)I")
	public static int method5853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = 255 - arg1;
		@Pc(34) int local34 = ((arg2 & 0xFF00FF) * arg1 & 0xFF00FF00 | (arg2 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
		return (((arg0 & 0xFF00FF) * local16 & 0xFF00FF00 | local16 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local34;
	}
}
