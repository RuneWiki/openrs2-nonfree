import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gda", name = "x", descriptor = "I")
	public static int anInt3331;

	@OriginalMember(owner = "client!gda", name = "A", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!gda", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!gda", name = "C", descriptor = "I")
	public static int anInt3335 = 0;

	@OriginalMember(owner = "client!gda", name = "H", descriptor = "I")
	public static int anInt3339 = 0;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "([BI)[B")
	public static byte[] method2928(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local13];
		Static601.method2938(arg0, 0, local16, 0, local13);
		return local16;
	}
}
