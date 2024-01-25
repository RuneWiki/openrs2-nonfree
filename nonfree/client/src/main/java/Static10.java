import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_10 = new Class235(8, 3);

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_3 = new Class70(5, 4);

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public static int anInt136 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Z")
	public static boolean method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static275.method3875(arg0, arg1) & (Static50.method830(arg0, arg1) | (arg1 & 0x2000) != 0 | Static351.method4775(arg1, arg0));
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B[FI)[F")
	public static float[] method107(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float[] local14 = new float[arg1];
		Static598.method1176(arg0, 0, local14, 0, arg1);
		return local14;
	}
}
