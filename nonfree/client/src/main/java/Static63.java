import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
	public static int anInt1629;

	@OriginalMember(owner = "client!dm", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!dm", name = "fb", descriptor = "Lclient!ug;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!dm", name = "R", descriptor = "Lclient!cl;")
	public static final Class32 aClass32_3 = new Class32();

	@OriginalMember(owner = "client!dm", name = "hb", descriptor = "[I")
	public static final int[] anIntArray95 = new int[50];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!op;B)V")
	public static void method1311(@OriginalArg(0) Class4_Sub32 arg0) {
		if (Static273.aClass128ArrayArrayArray4 == null) {
			return;
		}
		@Pc(12) Interface7 local12 = null;
		if (arg0.anInt4724 == 0) {
			local12 = (Interface7) Static354.method5631(arg0.anInt4721, arg0.anInt4726, arg0.anInt4722);
		}
		if (arg0.anInt4724 == 1) {
			local12 = (Interface7) Static43.method852(arg0.anInt4721, arg0.anInt4726, arg0.anInt4722);
		}
		if (arg0.anInt4724 == 2) {
			local12 = (Interface7) Static347.method5528(arg0.anInt4721, arg0.anInt4726, arg0.anInt4722, mb.class);
		}
		if (arg0.anInt4724 == 3) {
			local12 = (Interface7) Static172.method3324(arg0.anInt4721, arg0.anInt4726, arg0.anInt4722);
		}
		if (local12 == null) {
			arg0.anInt4730 = 0;
			arg0.anInt4734 = -1;
			arg0.anInt4725 = 0;
		} else {
			arg0.anInt4734 = local12.method5594();
			arg0.anInt4725 = local12.method5589();
			arg0.anInt4730 = local12.method5590();
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)I")
	public static int method1312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "(B)V")
	public static void method1314() {
		if (!Static152.method3024()) {
			return;
		}
		if (Static278.aStringArray85 == null) {
			Static355.method5663();
		}
		Static5.aBoolean212 = true;
		Static287.aBooleanArray22 = new boolean[100];
		Static340.anIntArray497 = new int[100];
		Static135.anInt3159 = 0;
		Class192.lb = new int[100];
		Static183.anIntArray326 = new int[100];
		for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
			Static340.anIntArray497[local28] = (int) (Math.random() * (double) Static24.anInt496);
			Static183.anIntArray326[local28] = (int) (Math.random() * 350.0D);
			Class192.lb[local28] = (int) (Math.random() * 102.0D);
			Static287.aBooleanArray22[local28] = Math.random() < 0.5D;
		}
		try {
			Static238.aClipboard2 = Static76.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(74) Exception local74) {
		}
	}
}
