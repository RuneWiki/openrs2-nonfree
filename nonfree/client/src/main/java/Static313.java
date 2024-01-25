import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!pc;")
	public static Class188 aClass188_84;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
	public static final int anInt5470 = -1;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_113 = new Class256("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_52 = new Class129(64);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lclient!fm;")
	public static Class38_Sub3 method4433(@OriginalArg(1) int arg0) {
		@Pc(7) Class184[] local7 = Class39.aClass184Array1;
		synchronized (Class39.aClass184Array1) {
			@Pc(30) Class38_Sub3 local30;
			if (Class39.aClass184Array1.length <= arg0 || Class39.aClass184Array1[arg0].method4214()) {
				local30 = new Class38_Sub3();
				local30.aClass38_Sub4Array1 = new Class38_Sub4[arg0];
				for (@Pc(54) int local54 = 0; local54 < arg0; local54++) {
					local30.aClass38_Sub4Array1[local54] = new Class38_Sub4();
				}
			} else {
				local30 = (Class38_Sub3) Class39.aClass184Array1[arg0].method4206();
				local30.method5069();
				@Pc(39) int local39 = Static280.anIntArray343[arg0]--;
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Z")
	public static boolean method4434() {
		return Static293.aClass269_10 != Static343.aClass269_11 || Static255.anInt4802 >= 2;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
	public static int method4435(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZ)V")
	public static void method4436(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static169.aClass2_Sub2_Sub11_3 != null) {
			Static291.anInt5271 = Static169.aClass2_Sub2_Sub11_3.anInt4047;
		} else {
			Static291.anInt5271 = -1;
		}
		Static22.aClass41_1 = null;
		Static169.aClass2_Sub2_Sub11_3 = null;
		Static128.aClass265_20 = null;
		Static430.anInt7475 = 0;
		Static169.method2545();
		Static169.aClass265_27.method6003();
		Static38.aClass49_6 = null;
		Static374.aClass49_27 = null;
		Static322.aClass49_24 = null;
		Static397.aClass49_28 = null;
		Static271.aClass76_12 = null;
		Static59.aClass49_7 = null;
		Static23.aClass49_4 = null;
		Static452.anInt7845 = -1;
		Static168.anInt3256 = -1;
		Static150.aClass49_13 = null;
		Static169.aClass201_2 = null;
		Static100.aClass49_31 = null;
		Static169.aClass173_3.method4021();
		Static169.aClass221_3.method5016(64, 64);
		Static169.aClass173_3.method4017(128, 64);
		Static169.aClass150_2.method3509(64);
		Static363.aClass165_1.method3915(64);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	public static void method4438() {
		for (@Pc(3) int local3 = 0; local3 < Static391.anInt6867; local3++) {
			@Pc(9) int local9 = Static312.anIntArray202[local3];
			@Pc(13) Class4_Sub2_Sub2_Sub2 local13 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local9];
			if (local13 != null) {
				Static291.method4269(local13.aClass215_1.anInt5998, local13);
			}
		}
	}
}
