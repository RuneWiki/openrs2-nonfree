import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bt", name = "Q", descriptor = "I")
	public static int anInt7640;

	@OriginalMember(owner = "client!bt", name = "X", descriptor = "[I")
	public static final int[] anIntArray586 = new int[5];

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V")
	public static void method5991() {
		Static169.anInt3551 = 0;
		Static374.aClass229_41.method5326();
		Static378.aBoolean462 = false;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)V")
	public static void method6019() {
		Static149.aClass71_4.method1746();
		Static89.aClass252_3.method5692();
		Static279.aClass109_8.method2973();
		Static55.aClass25_1.method857();
		Static154.aClass251_2.method5688();
		Static89.aClass157_1.method3845();
		Static196.aClass30_2.method937();
		Static102.aClass91_2.method2557();
		Static35.aClass227_2.method5296();
		Static260.aClass169_4.method4056();
		Static427.aClass237_1.method5478();
		Static408.aClass61_3.method1423();
		Static404.aClass123_3.method3176();
		Static294.aClass69_2.method1739();
		Static176.aClass120_1.method3119();
		Static290.aClass2_1.method62();
		Static430.aClass211_1.method5151();
		Static85.aClass246_41.method5630();
		Static199.aClass112_2.method3000();
		Static30.aClass254_1.method5744();
		Static75.method1355();
		Static120.method2158();
		Static140.method2524();
		Static164.method2887();
		Static133.aClass5_25.method106(5);
		Static360.aClass5_51.method106(5);
		Static99.aClass5_19.method106(5);
		Static269.aClass5_43.method106(5);
		Static272.aClass5_44.method106(5);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIII)V")
	public static void method6024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static161.anInt3448 && Static163.anInt3488 >= arg2) {
			@Pc(21) int local21 = Static439.method5863(arg1, Static450.anInt7594, Static142.anInt3212);
			@Pc(27) int local27 = Static439.method5863(arg0, Static450.anInt7594, Static142.anInt3212);
			Static275.method4097(arg2, arg3, local27, local21);
		}
	}
}
