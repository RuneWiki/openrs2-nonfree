import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public static int anInt6660;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!qf;")
	public static final Class271 aClass271_6 = new Class271();

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
	public static final int[] anIntArray342 = new int[200];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!un;I)Lclient!qda;")
	public static Class22_Sub4 method5585(@OriginalArg(0) Class4_Sub11 arg0) {
		return new Class22_Sub4(arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4934(), arg0.method4905());
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method5587() {
		for (@Pc(7) int local7 = 0; local7 < Static418.anInt7866; local7++) {
			@Pc(13) int local13 = Static43.anIntArray23[local7];
			@Pc(20) Class4_Sub4 local20 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local13);
			if (local20 != null) {
				@Pc(25) Class1_Sub4_Sub2_Sub1_Sub1 local25 = local20.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				Static220.method3592(local25, local25.aClass283_1.anInt8266);
			}
		}
	}
}
