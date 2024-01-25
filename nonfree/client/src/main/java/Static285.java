import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
	public static int anInt5128;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!ru;")
	public static final Class220 aClass220_25 = new Class220(16);

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "[I")
	public static int[] anIntArray428 = new int[2];

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!gh;I)V")
	public static void method4042(@OriginalArg(0) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(11) Class2_Sub3 local11 = (Class2_Sub3) Static271.aClass220_24.method5099((long) arg0.anInt7670);
		if (local11 == null) {
			return;
		}
		if (local11.aClass2_Sub8_Sub4_2 != null) {
			Static414.aClass2_Sub8_Sub1_2.method1041(local11.aClass2_Sub8_Sub4_2);
			local11.aClass2_Sub8_Sub4_2 = null;
		}
		local11.method6260();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)I")
	public static int method4043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static78.anIntArray97[arg1 & 0x3] : 256;
	}
}
