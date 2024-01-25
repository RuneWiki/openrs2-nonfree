import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	public static int anInt3400;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static final int anInt3397 = 0;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "[I")
	public static int[] anIntArray222 = null;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_50 = new Class179(50, 3);

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public static int anInt3399 = -1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!wn;)V")
	public static void method2849(@OriginalArg(1) Class2_Sub22_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static620.anInt9966; local7++) {
			@Pc(13) int local13 = Static556.anIntArray698[local7];
			@Pc(17) Class13_Sub1_Sub1_Sub1_Sub2 local17 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = arg0.method8547();
			if ((local21 & 0x4) != 0) {
				local21 += arg0.method8547() << 8;
			}
			if ((local21 & 0x2000) != 0) {
				local21 += arg0.method8547() << 16;
			}
			Static130.method1831(arg0, local21, local17, local13);
		}
	}
}
