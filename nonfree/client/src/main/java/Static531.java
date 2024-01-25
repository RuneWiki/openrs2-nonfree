import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public static int anInt8976;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_104 = new Class208(31, 8);

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "[I")
	public static final int[] anIntArray558 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!uh;")
	public static Class1_Sub46 aClass1_Sub46_2 = null;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public static void method7287(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 16);
		local8.method4833();
		local8.anInt5968 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!ac;I)V")
	public static void method7288(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (Static411.aClass302_8 == null) {
			return;
		}
		try {
			Static411.aClass302_8.method6452(0L);
			Static411.aClass302_8.method6450(arg1, arg0.aByteArray104, 24);
		} catch (@Pc(22) Exception local22) {
		}
	}
}
