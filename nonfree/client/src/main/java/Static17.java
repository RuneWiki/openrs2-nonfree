import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bh", name = "db", descriptor = "Lclient!ke;")
	public static Class43 aClass43_5;

	@OriginalMember(owner = "client!bh", name = "ib", descriptor = "I")
	public static int anInt608;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_265 = Static146.method2172("rect_debug=");

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_266 = Static146.method2172("<)4col> x");

	@OriginalMember(owner = "client!bh", name = "nb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!bh", name = "pb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_267 = Static146.method2172("mapedge");

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(III)V")
	public static void method434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg1 != Static129.anInt3118) {
			Static163.anIntArray577 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static163.anIntArray577[local9] = (local9 << 12) / arg1;
			}
			Static129.anInt3118 = arg1;
			Static8.anInt230 = arg1 - 1;
		}
		if (arg0 == Static90.anInt2352) {
			return;
		}
		Static166.anIntArray619 = new int[arg0];
		for (local9 = 0; local9 < arg0; local9++) {
			Static166.anIntArray619[local9] = (local9 << 12) / arg0;
		}
		Static90.anInt2352 = arg0;
		Static78.anInt2044 = arg0 - 1;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(ILclient!qf;)Z")
	public static boolean method436(@OriginalArg(1) Class66 arg0) {
		if (arg0.anIntArray471 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray471.length; local12++) {
			@Pc(21) int local21 = Static170.method2837(arg0, local12);
			@Pc(26) int local26 = arg0.anIntArray467[local12];
			if (arg0.anIntArray471[local12] == 2) {
				if (local26 <= local21) {
					return false;
				}
			} else if (arg0.anIntArray471[local12] == 3) {
				if (local21 <= local26) {
					return false;
				}
			} else if (arg0.anIntArray471[local12] == 4) {
				if (local26 == local21) {
					return false;
				}
			} else if (local21 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(Z)V")
	public static void method437() {
		aClass43_5 = null;
		aBigInteger1 = null;
		aClass77_266 = null;
		aClass77_265 = null;
		aClass77_267 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lclient!va;")
	public static Class2_Sub2_Sub18 method438(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub18 local12 = (Class2_Sub2_Sub18) Static79.aClass82_32.method2699((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = Static51.aClass43_14.method2205(arg0, 8);
		local12 = new Class2_Sub2_Sub18();
		if (local24 != null) {
			local12.method2798(new Class2_Sub18(local24));
		}
		Static79.aClass82_32.method2701((long) arg0, local12);
		return local12;
	}
}
