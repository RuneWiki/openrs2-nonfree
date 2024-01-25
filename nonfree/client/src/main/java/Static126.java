import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!qs;")
	public static Class211 aClass211_34;

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_70 = new Class158("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
	public static int anInt2792 = 0;

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
	public static int anInt2793 = 0;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
	public static int anInt2794 = 0;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([IIIBLclient!ih;[I)Lclient!ib;")
	public static Class24_Sub2 method2051(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class106_Sub2 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(27) int local27 = arg0[local12] + local12 * arg2;
			for (@Pc(29) int local29 = 0; local29 < arg4[local12]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class24_Sub2(arg3, arg2, arg1, local10);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)V")
	public static void method2053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static360.anIntArrayArray52 != null) {
			Static360.anIntArrayArray52[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static372.aShortArrayArray6 != null) {
			Static372.aShortArrayArray6[arg0][arg1] = (short) arg3;
		}
		if (Static383.aByteArrayArray22 != null) {
			Static383.aByteArrayArray22[arg0][arg1] = (byte) arg4;
		}
	}
}
