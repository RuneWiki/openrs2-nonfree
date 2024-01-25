import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_18 = new Class21("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_19 = new Class21("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([BI)[B")
	public static byte[] method1457(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub20 local8 = new Class4_Sub20(arg0);
		@Pc(12) int local12 = local8.method4614();
		@Pc(21) int local21 = local8.method4595();
		if (local21 < 0 || Static155.anInt3205 != 0 && local21 > Static155.anInt3205) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(46) byte[] local46 = new byte[local21];
			local8.method4566(local21, local46);
			return local46;
		} else {
			@Pc(58) int local58 = local8.method4595();
			if (local58 < 0 || Static155.anInt3205 != 0 && Static155.anInt3205 < local58) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local58];
			if (local12 == 1) {
				Static102.method1906(local79, local58, arg0, local21);
			} else {
				Static165.aClass264_1.method6060(local8, local79);
			}
			return local79;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method1458(@OriginalArg(0) int arg0) {
		Static97.anInt2097 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static230.anInt4581; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static268.anInt5106; local6++) {
				if (Static294.aClass162ArrayArrayArray2[arg0][local3][local6] == null) {
					Static294.aClass162ArrayArrayArray2[arg0][local3][local6] = new Class162(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method1459() {
		for (@Pc(3) int local3 = 0; local3 < Static93.anInt2064; local3++) {
			@Pc(9) Class7 local9 = Static121.aClass7Array2[local3];
			if (local9.aByte1 == 2) {
				if (local9.aClass4_Sub7_Sub1_1 == null) {
					local9.anInt63 = Integer.MIN_VALUE;
				} else {
					Static132.aClass4_Sub7_Sub4_1.method5474(local9.aClass4_Sub7_Sub1_1);
				}
			}
		}
	}
}
