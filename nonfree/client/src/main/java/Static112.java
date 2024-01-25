import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!gs", name = "S", descriptor = "Lclient!se;")
	public static final Class179 aClass179_5 = new Class179(64);

	@OriginalMember(owner = "client!gs", name = "T", descriptor = "[I")
	public static final int[] anIntArray225 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!gs", name = "X", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_75 = new Class119(4);

	@OriginalMember(owner = "client!gs", name = "Z", descriptor = "I")
	public static int anInt2503 = 0;

	@OriginalMember(owner = "client!gs", name = "ab", descriptor = "[I")
	public static final int[] anIntArray227 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
	public static void method2424() {
		for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) Static147.aClass216_8.method5992(); local15 != null; local15 = (Class2_Sub20) Static147.aClass216_8.method6000()) {
			if (local15.anInt2467 == -1) {
				local15.anInt2465 = 0;
				Static285.method5107(local15);
			} else {
				local15.method5945();
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)V")
	public static void method2425() {
		if (Static32.aBoolean71) {
			return;
		}
		if (Static234.aBoolean412) {
			Static92.aFloat28 = (int) Static92.aFloat28 + 191 & 0xFFFFFF80;
		} else {
			Static148.aFloat41 += (24.0F - Static148.aFloat41) / 2.0F;
		}
		Static32.aBoolean71 = true;
		Static285.aBoolean515 = true;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILclient!tn;Lclient!tn;)V")
	public static void method2426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62_Sub5 arg3, @OriginalArg(4) Class62_Sub5 arg4) {
		if (Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static65.method1493(arg0, arg1, arg2);
		}
		Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2].aClass62_Sub5_2 = arg3;
		Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2].aClass62_Sub5_1 = arg4;
	}
}
