import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!paa", name = "cc", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_91 = new Class179(74, -1);

	@OriginalMember(owner = "client!paa", name = "yc", descriptor = "[I")
	public static final int[] anIntArray490 = new int[3];

	@OriginalMember(owner = "client!paa", name = "od", descriptor = "[I")
	public static final int[] anIntArray495 = new int[32];

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!jm;)V")
	public static void method5620(@OriginalArg(1) Class2_Sub2_Sub11 arg0) {
		if (arg0 == null) {
			return;
		}
		Static115.aClass109_11.method2323(arg0);
		Static474.anInt7600++;
		@Pc(35) Class2_Sub2_Sub12 local35;
		if (arg0.aBoolean301 || "".equals(arg0.aString43)) {
			local35 = new Class2_Sub2_Sub12(arg0.aString43);
			Static121.anInt2166++;
		} else {
			@Pc(29) long local29 = arg0.aLong123;
			for (local35 = (Class2_Sub2_Sub12) Static257.aClass118_25.method2595(local29); local35 != null && !local35.aString52.equals(arg0.aString43); local35 = (Class2_Sub2_Sub12) Static257.aClass118_25.method2605()) {
			}
			if (local35 == null) {
				local35 = (Class2_Sub2_Sub12) Static446.aClass32_79.method630(local29);
				if (local35 != null && !local35.aString52.equals(arg0.aString43)) {
					local35 = null;
				}
				if (local35 == null) {
					local35 = new Class2_Sub2_Sub12(arg0.aString43);
				}
				Static257.aClass118_25.method2601(local35, local29);
				Static121.anInt2166++;
			}
		}
		if (local35.method4157(arg0)) {
			Static347.method4642(local35);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BII)Z")
	public static boolean method5623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static191.method2770(arg1, arg0) & Static470.method6341(arg0, arg1);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZB)V")
	public static void method5624(@OriginalArg(0) boolean arg0) {
		Static469.aClass177_2.method7879(Static361.aClass95_9.method6979());
		@Pc(10) int[] local10 = Static361.aClass95_9.Y();
		Static578.anInt9401 = local10[1];
		Static116.anInt2103 = local10[3];
		Static237.anInt3891 = local10[2];
		Static415.anInt6464 = local10[0];
		if (arg0) {
			Static361.aClass95_9.DA(Static237.anInt3889, Static560.anInt9129, Static143.anInt2618, Static177.anInt8963);
			Static242.method3404(Static141.aDouble17);
		} else {
			Static361.aClass95_9.DA(Static136.anInt9996, Static38.anInt772, Static280.anInt4506, Static515.anInt8575);
			Static242.method3404(Static462.aDouble40);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BI)Z")
	public static boolean method5634(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
