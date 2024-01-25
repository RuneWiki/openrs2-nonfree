import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array24;

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_67 = new Class140("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!dp", name = "s", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_93 = new Class157(22, -1);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
	public static int method2533(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIILclient!je;)V")
	public static void method2534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub3_Sub1 arg2) {
		if (arg1 == arg2.anInt6915 && arg1 != -1) {
			@Pc(80) Class84 local80 = Static91.method1822(arg1);
			@Pc(83) int local83 = local80.anInt2456;
			if (local83 == 1) {
				arg2.anInt6908 = 0;
				arg2.anInt6904 = 1;
				arg2.anInt6921 = 0;
				arg2.anInt6895 = 0;
				arg2.anInt6900 = arg0;
				Static41.method4705(arg2 == Static177.aClass1_Sub2_Sub3_Sub1_1, arg2.anInt6895, arg2.anInt6888, arg2.anInt6893, local80, arg2.aByte77);
			}
			if (local83 == 2) {
				arg2.anInt6908 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt6915 == -1 || Static91.method1822(arg1).anInt2459 >= Static91.method1822(arg2.anInt6915).anInt2459) {
			arg2.anInt6904 = 1;
			arg2.anInt6963 = arg2.anInt6962;
			arg2.anInt6915 = arg1;
			arg2.anInt6900 = arg0;
			arg2.anInt6895 = 0;
			arg2.anInt6908 = 0;
			arg2.anInt6921 = 0;
			if (arg2.anInt6915 != -1) {
				Static41.method4705(arg2 == Static177.aClass1_Sub2_Sub3_Sub1_1, arg2.anInt6895, arg2.anInt6888, arg2.anInt6893, Static91.method1822(arg2.anInt6915), arg2.aByte77);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
	public static void method2535() {
		if (Static353.anInt5913 <= 0) {
			Class139.lb = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static81.aStringArray8.length; local15++) {
			if (Static81.aStringArray8[local15].startsWith("--> ")) {
				local13++;
				if (local13 == Static353.anInt5913) {
					Class139.lb = Static81.aStringArray8[local15].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V")
	public static void method2536(@OriginalArg(1) int arg0) {
		Static150.aClass107_17 = new Class107(arg0);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!iq;I)V")
	public static void method2537(@OriginalArg(0) Class104 arg0) {
		Static255.aClass104_136 = arg0;
	}
}
