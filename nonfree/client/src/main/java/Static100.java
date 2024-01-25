import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "[I")
	public static final int[] anIntArray155 = new int[14];

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_22 = new Class136(20);

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method1794(@OriginalArg(1) Class14 arg0) {
		if (Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 != Static296.anInt5524 && (Static270.aClass276ArrayArrayArray2 != null && Static323.method5111(arg0, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108))) {
			Static296.anInt5524 = Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)I")
	public static int method1795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static25.anIntArray39[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIILclient!ap;)V")
	public static void method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3 arg3) {
		@Pc(4) Class276 local4 = Static417.method5977(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass4_Sub3_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public static void method1797() {
		Static418.method5988();
		Static528.method7220(Static140.aClass6_Sub48_Sub1_1.aBoolean687);
		Static3.aClass11_1 = Static244.method4236(Static32.aCanvas3, Static352.aClass272_2, 22050, 0);
		Static3.aClass11_1.method6285(Static96.aClass6_Sub18_Sub2_1);
		Static35.aClass11_3 = Static244.method4236(Static32.aCanvas3, Static352.aClass272_2, 2048, 1);
		Static35.aClass11_3.method6285(Static374.aClass6_Sub18_Sub4_2);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
	public static void method1798() {
		if (Static438.aBoolean528) {
			return;
		}
		Static261.aBoolean359 = true;
		if (Static140.aClass6_Sub48_Sub1_1.aBoolean678) {
			Static428.aFloat160 = (int) Static428.aFloat160 - 65 & 0xFFFFFF80;
		} else {
			Static272.aFloat131 += (-Static272.aFloat131 - 24.0F) / 2.0F;
		}
		Static438.aBoolean528 = true;
	}
}
