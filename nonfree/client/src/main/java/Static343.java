import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!lga", name = "N", descriptor = "I")
	public static int anInt5857;

	@OriginalMember(owner = "client!lga", name = "A", descriptor = "Lclient!sb;")
	public static Class322 aClass322_105 = new Class322(58, -1);

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "(I)V")
	public static void method5260(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static261.anInt5003 == 2) {
				Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[0]);
				Static630.aClass106Array2[1].method2906(Static489.aClass15Array1[1]);
			} else if (Static261.anInt5003 == 3) {
				Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[0]);
				Static630.aClass106Array2[1].method2906(Static489.aClass15Array1[1]);
				Static630.aClass106Array2[2].method2906(Static489.aClass15Array1[2]);
			} else {
				Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[0]);
				Static630.aClass106Array2[1].method2906(Static489.aClass15Array1[1]);
				Static630.aClass106Array2[2].method2906(Static489.aClass15Array1[2]);
				Static630.aClass106Array2[3].method2906(Static489.aClass15Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static261.anInt5003 == 2) {
				Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[2]);
			} else if (Static261.anInt5003 == 3) {
				Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[3]);
				Static630.aClass106Array2[1].method2906(Static489.aClass15Array1[4]);
			} else {
				Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[4]);
				Static630.aClass106Array2[1].method2906(Static489.aClass15Array1[5]);
				Static630.aClass106Array2[2].method2906(Static489.aClass15Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static261.anInt5003 == 2) {
				Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[3]);
				return;
			}
			if (Static261.anInt5003 == 3) {
				Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[5]);
				return;
			}
			Static630.aClass106Array2[0].method2906(Static489.aClass15Array1[7]);
		}
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(II)Lclient!hj;")
	public static Class158 method5269(@OriginalArg(0) int arg0) {
		@Pc(8) Class158[] local8 = Static603.method8319();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt4414 == arg0) {
				return local8[local10];
			}
		}
		if (-1 != -1) {
			aClass322_105 = null;
		}
		return null;
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)Z")
	public static boolean method5282() {
		@Pc(10) Class6_Sub42 local10 = (Class6_Sub42) Static336.aClass340_40.method8124();
		if (local10 == null) {
			return false;
		}
		for (@Pc(25) int local25 = 0; local25 < local10.anInt7710; local25++) {
			if (local10.aClass380Array2[local25] != null && local10.aClass380Array2[local25].anInt10067 == 0) {
				return false;
			}
			if (local10.aClass380Array1[local25] != null && local10.aClass380Array1[local25].anInt10067 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
	public static void method5289() {
		if (Static672.method8907(Static37.anInt498)) {
			if (Static525.aClass260_3.aClass141_1 == null) {
				Static307.method4889(5);
			} else {
				Static307.method4889(7);
			}
		} else if (Static37.anInt498 == 5 || Static37.anInt498 == 6) {
			Static307.method4889(3);
		} else if (Static37.anInt498 == 13) {
			Static307.method4889(3);
		}
	}
}
