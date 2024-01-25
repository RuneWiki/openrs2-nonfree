import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "Lclient!eh;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_103 = new Class158(31, 7);

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public static int anInt8112 = -1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method6715(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local20 - 2 >= local6 || Static286.method4858(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local20 - 1 >= local6 || Static286.method4858(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(70) byte[] local70 = new byte[local26];
		Static347.method5530(0, arg0, local70);
		return local70;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([FII)[F")
	public static float[] method6716(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static559.method5955(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
