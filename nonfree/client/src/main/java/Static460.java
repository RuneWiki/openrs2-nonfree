import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qea", name = "F", descriptor = "Lclient!iia;")
	public static final Class142 aClass142_8 = new Class142();

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!ni;B)V")
	public static void method6924(@OriginalArg(0) Class223 arg0) {
		Static615.anInt10411 = 0;
		Static602.anInt10200 = 0;
		Static470.aClass234_11 = new Class234();
		Static348.aClass9_Sub1_Sub1_Sub1Array2 = new Class9_Sub1_Sub1_Sub1[1024];
		Static82.aClass9_Sub5Array1 = new Class9_Sub5[Static85.anIntArray87[Static114.anInt2971] + 1];
		Static478.anInt8414 = 0;
		Static455.anInt8188 = 0;
		Static429.method6630(arg0);
		Static162.method3148(arg0);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)V")
	public static void method6926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static248.method4430(local7.aClass9_Sub4_Sub5_1);
		Static248.method4430(local7.aClass9_Sub4_Sub5_2);
		if (local7.aClass9_Sub4_Sub5_1 != null) {
			local7.aClass9_Sub4_Sub5_1 = null;
		}
		if (local7.aClass9_Sub4_Sub5_2 != null) {
			local7.aClass9_Sub4_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(III)Z")
	public static boolean method6927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static301.method5133(arg0, arg1) || Static405.method6339(arg0, arg1) || Static385.method6056(arg1, arg0);
	}
}
