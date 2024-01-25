import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
	public static int anInt4094;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "J")
	public static long aLong116;

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
	public static int anInt4097 = 0;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method3558(@OriginalArg(1) File arg0) {
		return Static327.method4396((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)S")
	public static short method3559(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? (127 - local19) * local15 >> 7 : local19 * local15 >> 7;
		@Pc(41) int local41 = local19 + local37;
		@Pc(57) int local57;
		if (local41 == 0) {
			local57 = local37 << 1;
		} else {
			local57 = (local37 << 8) / local41;
		}
		return (short) (local41 | local9 << 10 | local57 >> 4 << 7);
	}
}
