import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
	public static int anInt7083;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBIII)V")
	public static void method5793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static97.anInt1796 && arg1 <= Static85.anInt1636) {
			@Pc(24) int local24 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2);
			@Pc(30) int local30 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg3);
			Static258.method3969(local30, arg0, arg1, local24);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Lclient!tq;")
	public static Class239 method5795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class239 local7 = Static299.method4387(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass239Array1 == null || local7.aClass239Array1.length <= arg0) {
			return null;
		} else {
			return local7.aClass239Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBII)V")
	public static void method5796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static30.aClass189ArrayArrayArray2 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 | arg2 << 28 | arg1 << 14);
		@Pc(25) Class6_Sub12 local25 = (Class6_Sub12) Static23.aClass137_4.method3175(local19);
		if (local25 == null) {
			Static254.method3449(arg2, arg0, arg1);
			return;
		}
		@Pc(48) Class6_Sub42 local48 = (Class6_Sub42) local25.aClass88_21.method1882();
		if (local48 == null) {
			Static254.method3449(arg2, arg0, arg1);
			return;
		}
		@Pc(62) Class3_Sub2_Sub1 local62 = (Class3_Sub2_Sub1) Static254.method3449(arg2, arg0, arg1);
		if (local62 == null) {
			local62 = new Class3_Sub2_Sub1();
		} else {
			local62.anInt6632 = local62.anInt6625 = -1;
		}
		local62.anInt6623 = local48.anInt6905;
		local62.anInt6629 = local48.anInt6907;
		label44: while (true) {
			@Pc(90) Class6_Sub42 local90 = (Class6_Sub42) local25.aClass88_21.method1891();
			if (local90 == null) {
				break;
			}
			if (local62.anInt6623 != local90.anInt6905) {
				local62.anInt6632 = local90.anInt6905;
				local62.anInt6626 = local90.anInt6907;
				while (true) {
					@Pc(115) Class6_Sub42 local115 = (Class6_Sub42) local25.aClass88_21.method1891();
					if (local115 == null) {
						break label44;
					}
					if (local115.anInt6905 != local62.anInt6623 && local62.anInt6632 != local115.anInt6905) {
						local62.anInt6625 = local115.anInt6905;
						local62.anInt6624 = local115.anInt6907;
					}
				}
			}
		}
		@Pc(155) int local155 = Static165.method2689((arg0 << 7) + 64, arg2, (arg1 << 7) + 64);
		Static219.method3372(arg2, arg0, arg1, local155, local62);
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)V")
	public static void method5799() {
		Static127.aClass197Array1 = new Class197[50];
		Static117.anInt2050 = 0;
	}
}
