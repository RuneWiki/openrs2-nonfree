import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!qf", name = "Zb", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_219 = new Class235(36, -1);

	@OriginalMember(owner = "client!qf", name = "lc", descriptor = "I")
	public static int anInt7451 = 0;

	@OriginalMember(owner = "client!qf", name = "qc", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_220 = new Class235(88, 19);

	@OriginalMember(owner = "client!qf", name = "tc", descriptor = "[I")
	public static final int[] anIntArray572 = new int[25];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)Z")
	public static boolean method5927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public static void method5928() {
		if (Static130.aClass260_4 == null) {
			return;
		}
		if (Static130.aClass260_4.anInt7041 == 1) {
			Static130.aClass260_4 = null;
			return;
		}
		if (Static130.aClass260_4.anInt7041 == 2) {
			Static248.method3684(Static4.aString2, 2, Static223.aClass109_7);
			Static130.aClass260_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!vq;IB)V")
	public static void method5931(@OriginalArg(0) Class8_Sub3_Sub3_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray532 == null) {
			return;
		}
		@Pc(16) int local16 = arg0.anIntArray532[arg1 + 1];
		if (arg0.anInt6822 == local16) {
			return;
		}
		arg0.anInt6850 = 0;
		arg0.anInt6803 = 0;
		arg0.anInt6825 = 1;
		arg0.anInt6822 = local16;
		arg0.anInt6858 = arg0.anInt6859;
		arg0.anInt6849 = 0;
		if (arg0.anInt6822 != -1) {
			Static137.method2090(Static192.aClass211_1.method4277(arg0.anInt6822), arg0.anInt9365, arg0.anInt6803, arg0 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg0.anInt9370, arg0.aByte123);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method5932(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
