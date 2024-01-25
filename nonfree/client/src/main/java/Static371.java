import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!gm;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "[Lclient!uo;")
	public static Class41_Sub1[] aClass41_Sub1Array2;

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "Lclient!uu;")
	public static Class250 aClass250_90;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_159 = new Class163(4, 1);

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
	public static int anInt6310 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!jt;I)J")
	public static long method5202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface5 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(23) Class31 local23 = Static9.aClass149_1.method3573(arg2.method6263());
		@Pc(48) long local48 = (long) (arg0 << 7 | arg1 | arg2.method6261() << 14 | arg2.method6262() << 20 | 0x40000000);
		if (local23.anInt788 == 0) {
			local48 |= local14;
		}
		if (local23.anInt775 == 1) {
			local48 |= local5;
		}
		if (local23.aBoolean41) {
			local48 |= local7;
		}
		return local48 | (long) arg2.method6263() << 32;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public static void method5203() {
		Static243.aClass3_Sub25_Sub1_7.method4082(Static255.aClass250_63.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static101.aClass250_34.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static326.aClass250_81.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static90.aClass250_30.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static156.aClass250_45.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static92.aClass250_31.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static28.aClass250_12.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static119.aClass250_38.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static8.aClass250_2.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static126.aClass250_39.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static409.aClass250_98.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static145.aClass250_42.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static317.aClass250_79.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static351.aClass250_88.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static72.aClass250_24.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static464.aClass250_106.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static30.aClass250_13.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static333.aClass250_83.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static441.aClass250_102.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static171.aClass250_48.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static324.aClass250_80.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static6.aClass250_1.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static327.aClass250_82.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static171.aClass250_49.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static72.aClass250_23.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static180.aClass250_55.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static111.aClass250_37.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static339.aClass250_84.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static72.aClass250_25.method5805());
		Static243.aClass3_Sub25_Sub1_7.method4082(Static158.aClass250_46.method5805());
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public static void method5204() {
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			Static408.aBooleanArray26[local15] = false;
		}
		Static27.anInt490 = 1;
		Static330.anInt5523 = 0;
		Static416.anInt6989 = 0;
		Static243.anInt7142 = -1;
		Static464.anInt7828 = -1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public static void method5206(@OriginalArg(1) int arg0) {
		if (!Static39.aClass79_Sub1_1.aBoolean150) {
			arg0 = -1;
		}
		if (Static438.anInt2390 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class173 local25 = Static57.aClass98_1.method2340(arg0);
			@Pc(29) Class154 local29 = local25.method4204();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static32.aClass51_1.method1369(local29.method3618(), Static151.aCanvas2, new Point(local25.anInt5094, local25.anInt5096), local29.method3629(), local29.method3625());
				Static438.anInt2390 = arg0;
			}
		}
		if (arg0 == -1 && Static438.anInt2390 != -1) {
			Static32.aClass51_1.method1369(-1, Static151.aCanvas2, new Point(), -1, null);
			Static438.anInt2390 = -1;
		}
	}
}
