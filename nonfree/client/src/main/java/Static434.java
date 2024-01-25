import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Lclient!vh;")
	public static Class250 aClass250_91;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
	public static int anInt7473 = -1;

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_186 = new Class131(34, 8);

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "S")
	public static short aShort102 = 32767;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!a;)V")
	public static void method5791(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static119.anInt7597; local7++) {
			@Pc(13) int local13 = Static160.anIntArray258[local7];
			@Pc(17) Class26_Sub2_Sub2_Sub1 local17 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = arg0.method4130();
			if ((local21 & 0x8) != 0) {
				local21 += arg0.method4130() << 8;
			}
			if ((local21 & 0x8000) != 0) {
				local21 += arg0.method4130() << 16;
			}
			Static327.method4602(local21, arg0, local13, local17);
		}
	}
}
