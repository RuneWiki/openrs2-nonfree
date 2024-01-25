import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array26;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_41 = new Class214(81, 4);

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_42 = new Class214(35, -2);

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_56 = new Class137(5, 1);

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_43 = new Class214(53, 3);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
	public static void method869(@OriginalArg(1) boolean arg0) {
		Static15.method239();
		if (Static98.anInt1721 != 30 && Static98.anInt1721 != 25) {
			return;
		}
		Static300.anInt5018++;
		if (Static300.anInt5018 < 50 && !arg0) {
			return;
		}
		Static300.anInt5018 = 0;
		if (!Static13.aBoolean25 && Static48.aClass3_2 != null) {
			Static5.method94(Static145.aClass137_103);
			try {
				Static48.aClass3_2.method62(Static75.aClass1_Sub11_Sub1_1.anInt5766, Static75.aClass1_Sub11_Sub1_1.aByteArray64);
				Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
			} catch (@Pc(58) IOException local58) {
				Static13.aBoolean25 = true;
			}
		}
		Static15.method239();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)V")
	public static void method873(@OriginalArg(0) boolean arg0) {
		Static158.anInt2643 = 0;
		Static178.anInt2910 = 0;
		Static69.method4489();
		Static333.method4260(arg0);
		Static123.method1695();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < Static178.anInt2910; local18++) {
			local24 = Static379.anIntArray386[local18];
			if (Static98.aClass20_Sub3_Sub3_Sub2Array1[local24].anInt6043 != Static368.anInt6250) {
				if (Static98.aClass20_Sub3_Sub3_Sub2Array1[local24].aClass246_1.method5258()) {
					Static176.method2361(Static98.aClass20_Sub3_Sub3_Sub2Array1[local24]);
				}
				Static98.aClass20_Sub3_Sub3_Sub2Array1[local24].method4695(null);
				Static98.aClass20_Sub3_Sub3_Sub2Array1[local24] = null;
			}
		}
		if (Static329.anInt5393 != Static154.aClass1_Sub11_Sub1_3.anInt5766) {
			throw new RuntimeException("gnp1 pos:" + Static154.aClass1_Sub11_Sub1_3.anInt5766 + " psize:" + Static329.anInt5393);
		}
		for (local24 = 0; local24 < Static411.anInt6695; local24++) {
			if (Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + Static411.anInt6695);
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZII)V")
	public static void method880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = Static336.aClass106_Sub1_1.anInt5694 * arg2 >> 8;
		if (arg0 == -1 && !Static17.aBoolean28) {
			Static358.method4644();
		} else if (arg0 != -1 && (Static170.anInt2817 != arg0 || !Static169.method2132()) && local16 != 0 && !Static17.aBoolean28) {
			Static10.method176(Static116.aClass113_101, local16, arg1, arg0);
		}
		Static170.anInt2817 = arg0;
	}
}
