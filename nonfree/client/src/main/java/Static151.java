import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Lclient!ii;")
	public static Class47 aClass47_13;

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lclient!ga;")
	public static Class36 aClass36_3;

	@OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
	public static int anInt3208;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "[I")
	public static final int[] anIntArray283 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1112 = method2243("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
	public static int anInt3204 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!mb;")
	public static Class62 method2243(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class62 local13 = new Class62();
		local13.aByteArray28 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local19 < local9) {
			@Pc(27) int local27 = local6[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local19 >= local9) {
					break;
				}
				@Pc(47) int local47 = local6[local19++] & 0xFF;
				local13.aByteArray28[local13.anInt2653++] = (byte) (local27 * 43 + local47 - 1720 - 48);
			} else if (local27 != 0) {
				local13.aByteArray28[local13.anInt2653++] = (byte) local27;
			}
		}
		local13.method1852();
		return local13.method1860();
	}
}
