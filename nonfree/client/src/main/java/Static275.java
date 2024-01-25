import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "Lclient!k;")
	public static Class114 aClass114_7;

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
	public static int anInt5524;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_95 = new Class117("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Lclient!ms;")
	public static Class137 aClass137_16 = null;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "[I")
	public static final int[] anIntArray422 = new int[14];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZII)V")
	public static void method4654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class11_Sub4_Sub12 local12 = Static35.method512(6, arg0);
		local12.method3858();
		local12.anInt4390 = arg1;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(III)B")
	public static byte method4655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
	public static void method4656(@OriginalArg(0) int arg0) {
		@Pc(8) Class11_Sub4_Sub12 local8 = Static35.method512(16, arg0);
		local8.method3864();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([IIB)[I")
	public static int[] method4657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int[] local13 = new int[1152];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			for (@Pc(21) int local21 = 0; local21 < 36; local21++) {
				@Pc(27) int local27 = arg0[local15];
				if (local27 == 0) {
					if (local21 > 0 && arg0[local15 - 1] != 0) {
						local27 = arg1;
					} else if (local17 > 0 && arg0[local15 - 36] != 0) {
						local27 = arg1;
					} else if (local21 < 35 && arg0[local15 + 1] != 0) {
						local27 = arg1;
					} else if (local17 < 31 && arg0[local15 + 36] != 0) {
						local27 = arg1;
					}
				}
				local13[local15++] = local27;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!ms;II)V")
	public static void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aByte50 == 0) {
			arg1.anInt4071 = arg1.anInt4087;
		} else if (arg1.aByte50 == 1) {
			arg1.anInt4071 = arg1.anInt4087 + (arg2 - arg1.anInt4060) / 2;
		} else if (arg1.aByte50 == 2) {
			arg1.anInt4071 = arg2 - arg1.anInt4087 - arg1.anInt4060;
		} else if (arg1.aByte50 == 3) {
			arg1.anInt4071 = arg2 * arg1.anInt4087 >> 14;
		} else if (arg1.aByte50 == 4) {
			arg1.anInt4071 = (arg2 - arg1.anInt4060) / 2 + (arg1.anInt4087 * arg2 >> 14);
		} else {
			arg1.anInt4071 = arg2 - (arg2 * arg1.anInt4087 >> 14) - arg1.anInt4060;
		}
		if (arg1.aByte52 == 0) {
			arg1.anInt4098 = arg1.anInt4115;
		} else if (arg1.aByte52 == 1) {
			arg1.anInt4098 = (arg0 - arg1.anInt4110) / 2 + arg1.anInt4115;
		} else if (arg1.aByte52 == 2) {
			arg1.anInt4098 = arg0 - arg1.anInt4110 - arg1.anInt4115;
		} else if (arg1.aByte52 == 3) {
			arg1.anInt4098 = arg0 * arg1.anInt4115 >> 14;
		} else if (arg1.aByte52 == 4) {
			arg1.anInt4098 = (arg0 - arg1.anInt4110) / 2 + (arg0 * arg1.anInt4115 >> 14);
		} else {
			arg1.anInt4098 = arg0 - (arg0 * arg1.anInt4115 >> 14) - arg1.anInt4110;
		}
		if (!Static332.aBoolean414 || Static42.method634(arg1).anInt5612 == 0 && arg1.anInt4067 != 0) {
			return;
		}
		if (arg1.anInt4098 < 0) {
			arg1.anInt4098 = 0;
		} else if (arg1.anInt4110 + arg1.anInt4098 > arg0) {
			arg1.anInt4098 = arg0 - arg1.anInt4110;
		}
		if (arg1.anInt4071 < 0) {
			arg1.anInt4071 = 0;
		} else if (arg1.anInt4060 + arg1.anInt4071 > arg2) {
			arg1.anInt4071 = arg2 - arg1.anInt4060;
			return;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!wk;BI)V")
	public static void method4660(@OriginalArg(0) Class214 arg0, @OriginalArg(2) int arg1) {
		if (Static219.aBoolean296) {
			arg1 = 0;
			Static219.aBoolean296 = false;
		}
		if (Static216.aClass214_3 != null && Static216.aClass214_3.method5665(arg0)) {
			return;
		}
		Static216.aClass214_3 = arg0;
		Static247.aLong146 = Static268.method4627();
		Static160.anInt6123 = arg1;
		Static59.anInt1129 = arg1;
		if (Static59.anInt1129 == 0) {
			Static196.method3568();
			return;
		}
		Static211.anInt4305 = Static262.anInt5357;
		Static299.aFloat75 = Static7.aFloat1;
		Static235.anInt4736 = Static79.anInt5258;
		Static150.anInt2719 = Static106.anInt1978;
		Static140.aFloat16 = Static202.aFloat31;
		Static81.aFloat11 = Static112.aFloat14;
		Static305.aClass132_3 = Static294.aClass132_2;
		Static34.aFloat6 = Static86.aFloat12;
		Static52.aFloat50 = Static76.aFloat52;
		Static180.aFloat49 = Static148.aFloat20;
	}
}
