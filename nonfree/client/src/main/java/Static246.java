import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	public static int anInt3031;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "Lclient!co;")
	public static final Class41 aClass41_37 = new Class41(8);

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
	public static int anInt3042 = 0;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "Lclient!id;")
	public static final Class105 aClass105_5 = new Class105(64);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILclient!kd;Lclient!eg;ILjava/awt/Canvas;)Lclient!oj;")
	public static synchronized Class48 method2494(@OriginalArg(1) int arg0, @OriginalArg(2) Class123 arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static339.aBooleanArray28[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(49) Class48 local49;
		if (arg3 == 0) {
			local49 = Static194.method3545(arg2, local7, arg4);
		} else if (arg3 == 1) {
			local49 = Static257.method4424(arg0, arg1, local7, arg4, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static339.aBooleanArray28[local7] = true;
		return local49;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BILclient!ab;I)V")
	public static void method2545(@OriginalArg(1) int arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) int arg2) {
		if (!Static45.aBoolean446) {
			@Pc(60) String local60;
			for (@Pc(53) int local53 = 9; local53 >= 5; local53--) {
				local60 = Static257.method4423(local53, arg1);
				if (local60 != null) {
					Static51.method787((long) (local53 + 1), arg1.anInt45, 1010, arg1.anInt56, Static153.method2737(local53, arg1), local60, arg1.anInt94, false, arg1.aString5, true);
				}
			}
			local60 = Static257.method4425(arg1);
			if (local60 != null) {
				Static51.method787(0L, arg1.anInt45, 18, arg1.anInt56, arg1.anInt37, local60, arg1.anInt94, false, arg1.aString5, true);
			}
			for (@Pc(123) int local123 = 4; local123 >= 0; local123--) {
				@Pc(130) String local130 = Static257.method4423(local123, arg1);
				if (local130 != null) {
					Static51.method787((long) (local123 + 1), arg1.anInt45, 15, arg1.anInt56, Static153.method2737(local123, arg1), local130, arg1.anInt94, false, arg1.aString5, true);
				}
			}
			if (!Static51.method778(arg1).method3762()) {
				return;
			}
			if (arg1.aString3 == null) {
				Static51.method787(0L, arg1.anInt45, 49, arg1.anInt56, -1, Static205.aClass62_151.method1389(Static200.anInt4144), arg1.anInt94, false, "", true);
			} else {
				Static51.method787(0L, arg1.anInt45, 49, arg1.anInt56, -1, arg1.aString3, arg1.anInt94, false, "", true);
			}
		} else if (Static51.method778(arg1).method3756() && (Static272.anInt5116 & 0x20) != 0) {
			Static51.method787(0L, arg1.anInt45, 22, arg1.anInt56, Static5.anInt136, Static207.aString34, arg1.anInt94, false, Static343.aString60 + " -> " + arg1.aString5, true);
			return;
		}
	}
}
