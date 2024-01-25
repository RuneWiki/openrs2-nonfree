import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "[Lclient!bj;")
	public static Class25[] aClass25Array2;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "Lclient!qe;")
	public static Class1_Sub5_Sub4 aClass1_Sub5_Sub4_3;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!nk;")
	public static Class174 aClass174_7;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_233 = new Class12(17, 14);

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_76 = new Class96("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "[I")
	public static final int[] anIntArray362 = new int[14];

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
	public static final int[] anIntArray363 = new int[25];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[I[Ljava/lang/Object;II)V")
	public static void method3782(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg3) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg3; local59 < arg0; local59++) {
			if (local24 + (local57 & local59) > arg1[local59]) {
				@Pc(78) int local78 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20] = local78;
				@Pc(92) Object local92 = arg2[local59];
				arg2[local59] = arg2[local20];
				arg2[local20++] = local92;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method3782(local20 - 1, arg1, arg2, arg3);
		method3782(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Z")
	public static boolean method3783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static331.method4781(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static111.method1744(arg0, arg1) | Static276.method3833(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static60.method911(arg1, arg0) | Static155.method2471(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)I")
	public static int method3785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
	public static void method3789(@OriginalArg(0) int arg0) {
		if (!Static327.aClass230_Sub1_1.aBoolean618) {
			arg0 = -1;
		}
		if (arg0 == Static360.anInt6588) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class69 local29 = Static394.aClass86_2.method1712(arg0);
			@Pc(33) Class63 local33 = local29.method1239();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static403.aClass42_6.method662(local33.method1173(), local33.method1170(), local33.method1161(), new Point(local29.anInt1558, local29.anInt1557), Static159.aCanvas3);
				Static360.anInt6588 = arg0;
			}
		}
		if (arg0 == -1 && Static360.anInt6588 != -1) {
			Static403.aClass42_6.method662(-1, null, -1, new Point(), Static159.aCanvas3);
			Static360.anInt6588 = -1;
		}
	}
}
