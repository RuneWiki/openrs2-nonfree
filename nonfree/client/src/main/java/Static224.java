import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
	public static int[] anIntArray221;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_62 = new Class241(36, 8);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
	public static int[] anIntArray222 = new int[2];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	public static void method4039(@OriginalArg(1) boolean arg0) {
		if (Static623.aString118.length() == 0) {
			return;
		}
		Static655.method8761("--> " + Static623.aString118);
		Static654.method8744(false, Static623.aString118, arg0);
		Static233.anInt4508 = 0;
		if (!arg0) {
			Static623.aString118 = "";
			Static315.anInt5467 = 0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
	public static int method4041(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static145.method2850(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public static void method4042() {
		Static102.method1981();
		Static302.method4850();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!vo;Z)V")
	public static void method4043(@OriginalArg(0) Class381 arg0) {
		if (Static652.anInt10045 != arg0.anInt10117) {
			return;
		}
		if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23 == null) {
			arg0.anInt10071 = 0;
			arg0.anInt10114 = 0;
			return;
		}
		arg0.anInt10101 = 150;
		arg0.anInt10144 = (int) (Math.sin((double) Static141.anInt8737 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt10086 = 5;
		arg0.anInt10114 = Static503.anInt8407;
		arg0.anInt10071 = Static278.method3589(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23);
		@Pc(55) Class104 local55 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass104_7;
		if (local55 == null) {
			arg0.aClass104_11 = null;
			return;
		}
		if (arg0.aClass104_11 == null) {
			arg0.aClass104_11 = new Class104_Sub1();
		}
		arg0.anInt10158 = local55.method9032();
		arg0.aClass104_11.method9026(local55);
	}
}
