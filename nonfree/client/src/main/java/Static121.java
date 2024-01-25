import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
	public static int anInt2733;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
	public static int anInt2748;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_18 = new Class198(16);

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "Z")
	public static final boolean aBoolean229 = false;

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "[I")
	public static final int[] anIntArray255 = new int[6];

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "[I")
	public static final int[] anIntArray256 = new int[32];

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
	public static int anInt2745 = 0;

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString89 = "scroll:";

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public static void method2448() {
		@Pc(9) Class154 local9 = Static238.aClass154_76;
		synchronized (Static238.aClass154_76) {
			Static238.aClass154_76.method4219();
		}
		local9 = Static181.aClass154_64;
		synchronized (Static181.aClass154_64) {
			Static181.aClass154_64.method4219();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!or;IIIII)V")
	public static void method2449(@OriginalArg(0) Class151 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6714 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass4_Sub12_Sub1Array3[local4] != null) {
				arg0.anInt6714++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6714; local22++) {
			@Pc(31) int local31 = Static148.anIntArrayArrayArray13[arg1][arg2][arg3];
			@Pc(40) Class4_Sub12_Sub1 local40;
			while (local31 != 0) {
				local40 = Static126.aClass4_Sub12_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass4_Sub12_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static148.anIntArrayArrayArray13[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static126.aClass4_Sub12_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass4_Sub12_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt6714 - 1; local85++) {
				arg0.aClass4_Sub12_Sub1Array3[local85] = arg0.aClass4_Sub12_Sub1Array3[local85 + 1];
			}
			arg0.anInt6714--;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
	public static void method2451() {
		Static164.aClass154_59.method4220(5);
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
	public static void method2452() {
		for (@Pc(7) int local7 = 0; local7 < Static348.aByteArrayArrayArray11.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static348.aByteArrayArrayArray11[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static348.aByteArrayArrayArray11[0][0].length; local15++) {
					Static348.aByteArrayArrayArray11[local7][local11][local15] = 0;
				}
			}
		}
	}
}
