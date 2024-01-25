import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "J")
	public static long aLong402;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
	public static int anInt7770 = 500;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_184 = new Class25(80, 5);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
	public static boolean method6261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!ma;II)V")
	public static void method6265(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub26 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg2 << 28 | arg3 << 14 | arg0);
		@Pc(22) Class2_Sub43 local22 = (Class2_Sub43) Static293.aClass220_27.method5099(local16);
		if (local22 == null) {
			local22 = new Class2_Sub43();
			Static293.aClass220_27.method5104(local22, local16);
			local22.aClass181_47.method3973(arg1);
			return;
		}
		@Pc(45) Class218 local45 = Static413.aClass271_2.method6193(arg1.anInt4284);
		@Pc(48) int local48 = local45.anInt6309;
		if (local45.anInt6274 == 1) {
			local48 *= arg1.anInt4278 + 1;
		}
		for (@Pc(73) Class2_Sub26 local73 = (Class2_Sub26) local22.aClass181_47.method3972(); local73 != null; local73 = (Class2_Sub26) local22.aClass181_47.method3975()) {
			local45 = Static413.aClass271_2.method6193(local73.anInt4284);
			@Pc(84) int local84 = local45.anInt6309;
			if (local45.anInt6274 == 1) {
				local84 *= local73.anInt4278 + 1;
			}
			if (local48 > local84) {
				Static372.method5181(local73, arg1);
				return;
			}
		}
		local22.aClass181_47.method3973(arg1);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
	public static void method6267(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static175.aClass36ArrayArrayArray1 = Static317.aClass36ArrayArrayArray3;
			Static241.aClass22Array3 = Static46.aClass22Array1;
		} else {
			Static175.aClass36ArrayArrayArray1 = Static292.aClass36ArrayArrayArray2;
			Static241.aClass22Array3 = Static114.aClass22Array2;
		}
		Static180.anInt3181 = Static175.aClass36ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!kj;IIIBI)V")
	public static void method6269(@OriginalArg(1) Class11_Sub5_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static66.method1057(arg0.anInt7626, 0, arg0.anInt7622, arg2, arg3, arg0.aByte101, arg1);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method6270() {
		Static138.anIntArray215 = null;
		Static389.anIntArray544 = null;
		Static63.anIntArray547 = null;
		Static458.anIntArray634 = null;
		Static463.anIntArray637 = null;
		Static255.aBoolean324 = false;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
	public static int method6275(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
