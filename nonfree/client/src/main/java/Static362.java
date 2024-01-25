import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "Lclient!tj;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
	public static int anInt6454;

	@OriginalMember(owner = "client!sl", name = "S", descriptor = "Lclient!f;")
	public static Class3 aClass3_20;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_44 = new Class258();

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILclient!bp;BI)V")
	public static void method5023(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub1_Sub1 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray536[0];
		@Pc(15) int local15 = arg1.anIntArray537[0];
		if (local10 < 0 || Static126.anInt2569 <= local10 || local15 < 0 || Static190.anInt3697 <= local15 || (arg2 < 0 || Static126.anInt2569 <= arg2 || arg0 < 0 || arg0 >= Static190.anInt3697)) {
			return;
		}
		@Pc(73) int local73 = Static48.method1022(0, Static395.aClass268Array1[arg1.aByte86], arg2, Static41.anIntArray78, 0, local15, -4, 0, 0, Static244.anIntArray368, arg1.method4763(), arg0, local10, true);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local73 - 1; local85++) {
				arg1.method705(Static244.anIntArray368[local85], Static41.anIntArray78[local85], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
	public static void method5024() {
		@Pc(1) Class69 local1 = Static67.aClass69_13;
		synchronized (Static67.aClass69_13) {
			Static67.aClass69_13.method1600();
		}
		@Pc(26) Class69 local26 = Static51.aClass69_11;
		synchronized (Static51.aClass69_11) {
			Static51.aClass69_11.method1600();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZII)V")
	public static void method5026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static209.method2982(Static355.aClass36_114);
		Static116.aClass4_Sub30_Sub1_1.method4846(arg0);
		Static116.aClass4_Sub30_Sub1_1.method4861(arg1);
	}
}
