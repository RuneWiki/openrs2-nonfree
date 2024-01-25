import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_251 = new Class363(63, 2);

	@OriginalMember(owner = "client!te", name = "B", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_19 = new Class113(2, -1);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public static void method7024() {
		Static9.aClass15_1.method5283();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static503.aLongArray13[local10] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static250.aLongArray6[local28] = 0L;
		}
		Static336.anInt6191 = 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!pp;ILclient!pp;)V")
	public static void method7025(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg1.aClass2_Sub3_62 != null) {
			arg1.method7767();
		}
		arg1.aClass2_Sub3_61 = arg0.aClass2_Sub3_61;
		arg1.aClass2_Sub3_62 = arg0;
		arg1.aClass2_Sub3_62.aClass2_Sub3_61 = arg1;
		arg1.aClass2_Sub3_61.aClass2_Sub3_62 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLclient!ac;)I")
	public static int method7026(@OriginalArg(1) Class6_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) Class86 local8 = arg0.aClass86_1;
		if (local8.anIntArray136 != null) {
			local8 = local8.method1567(Static70.aClass78_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt2138;
		@Pc(27) Class54 local27 = arg0.method6168();
		if (arg0.aBoolean569) {
			local23 = local8.lb;
		} else if (local27.anInt1387 == arg0.anInt7419 || arg0.anInt7419 == local27.anInt1386 || arg0.anInt7419 == local27.anInt1423 || arg0.anInt7419 == local27.anInt1412) {
			local23 = local8.anInt2166;
		} else if (arg0.anInt7419 == local27.anInt1389 || arg0.anInt7419 == local27.anInt1384 || arg0.anInt7419 == local27.anInt1397 || arg0.anInt7419 == local27.anInt1391) {
			local23 = local8.anInt2159;
		}
		return local23;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!kp;)V")
	public static void method7027(@OriginalArg(1) Class196 arg0) {
		if (arg0.anInt5098 == 5 && arg0.anInt5152 != -1) {
			Static104.method1573(Static307.aClass100_6, arg0);
		}
	}
}
