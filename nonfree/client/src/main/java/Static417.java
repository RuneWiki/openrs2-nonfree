import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ur", name = "Id", descriptor = "[Lclient!o;")
	public static Class6[] aClass6Array14;

	@OriginalMember(owner = "client!ur", name = "Ic", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_173 = new Class12(98, 4);

	@OriginalMember(owner = "client!ur", name = "ke", descriptor = "Lclient!fp;")
	public static final Class1_Sub18 aClass1_Sub18_1 = new Class1_Sub18(0, 0);

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(B)V")
	public static void method5509() {
		Static277.aClass241_12.method5225();
		Static382.aClass245_8.method5321();
		Static339.aClass215_2.method4768();
		Static341.aClass75_4.method1618();
		Static161.aClass231_2.method5023();
		Static342.aClass155_2.method3538();
		Static174.aClass254_1.method5669();
		Static88.aClass69_1.method1552();
		Static82.aClass105_4.method2289();
		Static208.aClass151_1.method3511();
		Static291.aClass21_1.method395();
		Static355.aClass263_4.method5836();
		Static392.aClass178_4.method3961();
		Static300.aClass223_1.method4917();
		Static65.aClass86_1.method1921();
		Static55.aClass187_1.method4189();
		Static130.aClass164_1.method3756();
		Static95.aClass26_1.method571();
		Static95.aClass163_1.method3748();
		Static271.aClass180_2.method3975();
		Static435.method5717();
		Static243.method3498();
		Static329.method4421();
		if (Static459.aClass30_13 != Static328.aClass30_10) {
			for (@Pc(91) int local91 = 0; local91 < Static335.aByteArrayArray23.length; local91++) {
				Static335.aByteArrayArray23[local91] = null;
			}
			Static102.anInt1846 = 0;
		}
		Static421.method5595();
		Static319.method4283();
		Static290.method3970();
		Static255.method1030();
		Static120.method1915();
		Static298.aClass102_40.method2271();
		Static185.aClass34_7.method5765();
		Static13.aClass17_1.method316();
		Static186.method2672();
		Static285.aClass82_68.method1837();
		Static231.aClass82_53.method1837();
		Static305.aClass82_72.method1837();
		Static19.aClass82_4.method1837();
		Static257.aClass82_59.method1837();
		Static206.aClass82_50.method1837();
		Static447.aClass82_54.method1837();
		Static145.aClass82_27.method1837();
		Static448.aClass82_104.method1837();
		Static146.aClass82_40.method1837();
		Static332.aClass82_77.method1837();
		Static409.aClass82_93.method1837();
		Static73.aClass82_19.method1837();
		Static332.aClass82_76.method1837();
		Static348.aClass82_81.method1837();
		Static459.aClass82_100.method1837();
		Static223.aClass82_80.method1837();
		Static388.aClass82_89.method1837();
		Static362.aClass82_21.method1837();
		Static104.aClass82_24.method1837();
		Static142.aClass82_39.method1837();
		Static441.aClass82_101.method1837();
		Static168.aClass82_44.method1837();
		Static160.aClass82_43.method1837();
		Static240.aClass82_91.method1837();
		Static394.aClass82_90.method1837();
		Static307.aClass82_74.method1837();
		Static337.aClass82_79.method1837();
		Static31.aClass82_6.method1837();
		Static431.aClass82_98.method1837();
		Static151.aClass102_20.method2271();
		Static234.aClass102_27.method2271();
		Static316.aClass102_44.method2271();
		Static250.aClass102_32.method2271();
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(IIII)I")
	public static int method5541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10);
	}
}
