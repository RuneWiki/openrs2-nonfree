import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jg", name = "ab", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35;

	@OriginalMember(owner = "client!jg", name = "kb", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "[B")
	public static final byte[] aByteArray73 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!jg", name = "pb", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V")
	public static void method2546(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class14_Sub28 local10 = (Class14_Sub28) Static257.aClass18_24.method459(); local10 != null; local10 = (Class14_Sub28) Static257.aClass18_24.method453()) {
			if (local10.aClass14_Sub19_Sub3_2 != null) {
				Static49.aClass14_Sub19_Sub2_1.method4245(local10.aClass14_Sub19_Sub3_2);
				local10.aClass14_Sub19_Sub3_2 = null;
			}
			if (local10.aClass14_Sub19_Sub3_1 != null) {
				Static49.aClass14_Sub19_Sub2_1.method4245(local10.aClass14_Sub19_Sub3_1);
				local10.aClass14_Sub19_Sub3_1 = null;
			}
			local10.method5986();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(49) Class14_Sub28 local49 = (Class14_Sub28) Static51.aClass18_3.method459(); local49 != null; local49 = (Class14_Sub28) Static51.aClass18_3.method453()) {
			if (local49.aClass14_Sub19_Sub3_2 != null) {
				Static49.aClass14_Sub19_Sub2_1.method4245(local49.aClass14_Sub19_Sub3_2);
				local49.aClass14_Sub19_Sub3_2 = null;
			}
			local49.method5986();
		}
		for (@Pc(78) Class14_Sub28 local78 = (Class14_Sub28) Static316.aClass25_16.method697(); local78 != null; local78 = (Class14_Sub28) Static316.aClass25_16.method694()) {
			if (local78.aClass14_Sub19_Sub3_2 != null) {
				Static49.aClass14_Sub19_Sub2_1.method4245(local78.aClass14_Sub19_Sub3_2);
				local78.aClass14_Sub19_Sub3_2 = null;
			}
			local78.method5986();
		}
	}

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "(I)V")
	public static void method2547() {
		for (@Pc(10) int local10 = -1; local10 < Static307.anInt2887; local10++) {
			@Pc(18) int local18;
			if (local10 == -1) {
				local18 = 2047;
			} else {
				local18 = Static213.anIntArray380[local10];
			}
			@Pc(28) Class10_Sub3_Sub3_Sub2 local28 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local18];
			if (local28 != null) {
				Static130.method2678(local28.method5353(), local28);
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZI)V")
	public static void method2549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static189.aClass11_135 = new Class11(arg1);
		Static348.aClass11_123 = new Class11(arg0);
	}
}
