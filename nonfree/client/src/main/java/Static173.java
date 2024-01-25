import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public static int anInt3370;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_38 = new Class215(22, 4);

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "J")
	public static long aLong118 = 0L;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "[I")
	public static int[] anIntArray219 = new int[1];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!cw;B)V")
	public static void method2814(@OriginalArg(0) Class4_Sub12_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static441.anInt7199; local3++) {
			@Pc(9) int local9 = Static388.anIntArray497[local3];
			@Pc(13) Class16_Sub1_Sub5_Sub1 local13 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local9];
			@Pc(17) int local17 = arg0.method2490();
			if ((local17 & 0x4) != 0) {
				local17 += arg0.method2490() << 8;
			}
			if ((local17 & 0x2000) != 0) {
				local17 += arg0.method2490() << 16;
			}
			Static41.method729(local17, arg0, local9, local13);
		}
	}
}
