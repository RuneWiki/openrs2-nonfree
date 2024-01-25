import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!kb", name = "rb", descriptor = "I")
	public static int anInt5085;

	@OriginalMember(owner = "client!kb", name = "Ab", descriptor = "I")
	public static int anInt5092 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ)V")
	public static void method4241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static265.anInt5303 = arg1 - Static2.anInt5914;
		Static544.anInt9625 = arg0 - Static2.anInt5916;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method4253() {
		Static203.aClass125_24.method3442();
		Static432.aClass125_59.method3442();
		Static495.aClass125_63.method3442();
		Static145.aClass125_16.method3442();
		Static394.aClass125_53.method3442();
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)V")
	public static void method4266() {
		Static367.aClass68_53.method1922();
		Static322.aClass68_81.method1922();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public static void method4270() {
		Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
		Static376.aClass45_154 = null;
		Static402.aClass45_117 = null;
		Static331.anInt6307 = 0;
		Static47.anInt889 = 0;
		Static10.aClass45_4 = null;
		Static167.aClass45_49 = null;
		Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
		Static123.anInt2885 = 0;
		Static415.method3337();
		Static69.method7534();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static90.aClass30_Sub1_Sub1_Sub1Array1[local31] = null;
		}
		Static440.aClass30_Sub1_Sub1_Sub1_2 = null;
		for (@Pc(49) int local49 = 0; local49 < Static328.anInt6238; local49++) {
			@Pc(56) Class30_Sub1_Sub1_Sub2 local56 = Static352.aClass12_Sub41Array1[local49].aClass30_Sub1_Sub1_Sub2_2;
			if (local56 != null) {
				local56.anInt4135 = -1;
			}
		}
		Static46.method864();
		Static242.anInt4993 = 1;
		Static9.method278(9);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static154.aBooleanArray31[local74] = true;
		}
		Static397.method6233();
		Static234.aLong129 = 0L;
		Static479.aClass12_Sub37_2 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!daa;)V")
	public static void method4271(@OriginalArg(1) Class12_Sub8 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static243.aClass38_1 != null) {
			@Pc(25) int local25;
			try {
				Static243.aClass38_1.method858(0L);
				Static243.aClass38_1.method857(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method5193(local13, 24);
	}
}
