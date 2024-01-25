import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bia", name = "t", descriptor = "[I")
	public static final int[] anIntArray425 = new int[16];

	@OriginalMember(owner = "client!bia", name = "u", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!bia", name = "w", descriptor = "I")
	public static final int anInt5797 = 1401;

	@OriginalMember(owner = "client!bia", name = "x", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_78 = new Class179(59, 8);

	@OriginalMember(owner = "client!bia", name = "z", descriptor = "F")
	public static float aFloat113 = 0.25F;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BB)V")
	public static void method4969(@OriginalArg(0) byte arg0) {
		if (Static148.aByteArrayArrayArray4 == null) {
			Static148.aByteArrayArrayArray4 = new byte[4][Static228.anInt3704][Static162.anInt2911];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < Static228.anInt3704; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static162.anInt2911; local26++) {
					Static148.aByteArrayArrayArray4[local18][local22][local26] = arg0;
				}
			}
		}
	}
}
