import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	public static int anInt1779;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
	public static int anInt1780;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([BI)[B")
	public static byte[] method1485(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static598.method774(arg0, 0, local9, 0, local6);
		return local9;
	}
}
