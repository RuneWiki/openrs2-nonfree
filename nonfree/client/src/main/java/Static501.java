import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!tca", name = "M", descriptor = "[I")
	public static final int[] anIntArray614 = new int[1000];

	@OriginalMember(owner = "client!tca", name = "O", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_11 = new Class260(0, 1);

	@OriginalMember(owner = "client!tca", name = "T", descriptor = "[I")
	public static final int[] anIntArray615 = new int[25];

	@OriginalMember(owner = "client!tca", name = "U", descriptor = "Lclient!oda;")
	public static final Class240 aClass240_6 = new Class240();

	@OriginalMember(owner = "client!tca", name = "V", descriptor = "I")
	public static int anInt7991 = -1;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILjava/lang/String;IZI)V")
	public static void method6756(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static19.method421(arg1, arg3, false, arg0, arg2, null);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!fe;Z)V")
	public static void method6757(@OriginalArg(0) Class9_Sub2 arg0) {
		arg0.aClass9_Sub1_1 = null;
		@Pc(16) int local16 = arg0.aClass9_Sub9Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass9_Sub9Array1[local18].aBoolean567 = false;
		}
		@Pc(36) Class309[] local36 = Class222.aClass309Array5;
		synchronized (Class222.aClass309Array5) {
			if (local16 < Class222.aClass309Array5.length && Static537.anIntArray350[local16] < 200) {
				Class222.aClass309Array5[local16].method6595(arg0);
				@Pc(61) int local61 = Static537.anIntArray350[local16]++;
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BILclient!oe;)Z")
	public static boolean method6758(@OriginalArg(1) int arg0, @OriginalArg(2) Class241 arg1) {
		Static511.aClass109_6.method7095(arg1.anIntArray507[arg0], arg1.anIntArray508[arg0], arg1.anIntArray509[arg0], Static82.anIntArray139);
		@Pc(22) int local22 = Static82.anIntArray139[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray218[arg0] = (short) (Static217.anInt4277 * Static82.anIntArray139[0] / local22 + Static35.anInt839);
			arg1.aShortArray217[arg0] = (short) (Static82.anIntArray139[1] * Static566.anInt9122 / local22 + Static449.anInt7389);
			arg1.aShortArray216[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method6760(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static454.method6307(Static248.method7734(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(B)V")
	public static void method6761() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static508.aBooleanArray30[local7] = false;
		}
		Static296.anInt5367 = Static421.anInt7061;
		Static86.anInt2159 = -1;
		Static587.anInt9355 = 0;
		Static446.anInt7363 = 5;
		Static349.anInt6121 = 0;
		Static62.anInt4794 = Static305.anInt5560;
		Static366.anInt6301 = Static233.anInt4431;
		Static459.anInt7522 = -1;
		Static462.anInt7550 = Static37.anInt878;
		Static461.anInt7534 = Static154.anInt3150;
		Static205.anInt4130 = -1;
		Static471.anInt7695 = -1;
		Static53.anInt1243 = Static545.anInt8633;
	}
}
