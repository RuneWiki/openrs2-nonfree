import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	public static int anInt6062;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
	public static int anInt6058 = 1;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	public static int anInt6063 = 0;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)Lclient!c;")
	public static Class31 method5294(@OriginalArg(0) int arg0) {
		@Pc(10) Class31 local10 = (Class31) Static164.aClass41_43.method823((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static114.aClass83_52.method1968(arg0, 1);
		local10 = new Class31();
		local10.anInt669 = arg0;
		if (local20 != null) {
			local10.method546(new Class2_Sub24(local20));
		}
		local10.method542();
		if (local10.anInt662 == 2 && Static337.aClass243_30.method5967((long) arg0) == null) {
			Static337.aClass243_30.method5968((long) arg0, new Class2_Sub16(Static111.anInt2489));
			Static197.aClass31Array1[Static111.anInt2489++] = local10;
		}
		Static164.aClass41_43.method832((long) arg0, local10);
		return local10;
	}
}
