import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!as", name = "h", descriptor = "Lclient!aj;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Lclient!vf;")
	public static Class252 aClass252_1;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	public static int anInt323;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_9 = new Class231("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public static int anInt324 = 0;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "I")
	public static final int anInt325 = 1407;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!lt;Lclient!lt;Lclient!lt;ILclient!lt;)V")
	public static void method274(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(4) Class158 arg3) {
		Static346.aClass158_73 = arg2;
		Static51.aClass158_10 = arg1;
		Static223.aClass158_52 = arg0;
		Static17.aClass158_4 = arg3;
		Static129.aClass239ArrayArray1 = new Class239[Static223.aClass158_52.method3695()][];
		Static34.aBooleanArray2 = new boolean[Static223.aClass158_52.method3695()];
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Lclient!so;")
	public static Class74 method276() {
		try {
			return (Class74) Class.forName("Class74_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!pi;IIIII)V")
	public static void method277(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2147 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass6_Sub6Array3[local4] != null) {
				arg0.anInt2147++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt2147; local22++) {
			@Pc(31) long local31 = Static267.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class66 local41;
			while (local31 != 0L) {
				local41 = Static304.aClass66Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub6_1 == arg0.aClass6_Sub6Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static267.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static304.aClass66Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub6_1 == arg0.aClass6_Sub6Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt2147 - 1; local93++) {
				arg0.aClass6_Sub6Array3[local93] = arg0.aClass6_Sub6Array3[local93 + 1];
			}
			arg0.anInt2147--;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IBI)I")
	public static int method278(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(24) int local24 = (arg0 & 0x7F) * 96 >> 7;
		if (local24 < 2) {
			local24 = 2;
		} else if (local24 > 126) {
			local24 = 126;
		}
		return local24 + (arg0 & 0xFF80);
	}
}
