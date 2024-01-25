import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "Lclient!ou;")
	public static final Class260 aClass260_2 = new Class260();

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;Lclient!ac;B)I")
	public static int method3396(@OriginalArg(0) String arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		@Pc(6) int local6 = arg1.anInt9802;
		@Pc(10) byte[] local10 = Static447.method6282(arg0);
		arg1.method7977(local10.length);
		arg1.anInt9802 += Static231.aClass301_1.method6444(local10.length, local10, 0, arg1.anInt9802, arg1.aByteArray104);
		return arg1.anInt9802 - local6;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZBLclient!qh;)V")
	public static void method3397(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub3_Sub2 arg1) {
		if (Static22.anInt572 >= 400) {
			return;
		}
		@Pc(16) Class354 local16 = arg1.aClass354_1;
		if (local16.anIntArray597 != null) {
			local16 = local16.method7683(Static390.aClass353_29);
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean701) {
			return;
		}
		@Pc(34) String local34 = local16.aString102;
		if (local16.anInt9407 != 0) {
			@Pc(53) String local53 = Static101.aClass42_1 == Static110.aClass42_2 ? Static375.aClass253_34.method5453(Static161.anInt3095) : Static375.aClass253_32.method5453(Static161.anInt3095);
			local34 = local34 + Static590.method7875(local16.anInt9407, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580) + " (" + local53 + local16.anInt9407 + ")";
		}
		if (Static563.aBoolean697 && !arg0) {
			@Pc(91) Class94 local91 = Static306.anInt4907 == -1 ? null : Static256.aClass263_1.method5592(Static306.anInt4907);
			if ((Static420.anInt7401 & 0x2) != 0 && (local91 == null || local16.method7685(Static306.anInt4907, local91.anInt2658) != local91.anInt2658)) {
				Static385.method5573(22, 0, Static318.aString69, Static385.anInt6906, false, true, Static146.aString26 + " -> <col=ffff00>" + local34, (long) arg1.anInt7524, 0, -1);
			}
		}
		if (!arg0) {
			@Pc(145) String[] local145 = local16.aStringArray39;
			if (Static368.aBoolean518) {
				local145 = Static465.method6468(local145);
			}
			@Pc(155) int local155;
			if (local145 != null) {
				for (local155 = 4; local155 >= 0; local155--) {
					if (local145[local155] != null && (local16.aByte121 == 0 || !local145[local155].equalsIgnoreCase(Static375.aClass253_27.method5453(Static161.anInt3095)))) {
						@Pc(175) byte local175 = 0;
						@Pc(177) int local177 = Static133.anInt2655;
						if (local155 == 0) {
							local175 = 6;
						}
						if (local155 == 1) {
							local175 = 57;
						}
						if (local155 == 2) {
							local175 = 10;
						}
						if (local155 == 3) {
							local175 = 47;
						}
						if (local16.anInt9425 == local155) {
							local177 = local16.anInt9419;
						}
						if (local155 == 4) {
							local175 = 49;
						}
						if (local155 == local16.anInt9409) {
							local177 = local16.anInt9396;
						}
						Static385.method5573(local175, 0, local145[local155], local145[local155].equalsIgnoreCase(Static375.aClass253_27.method5453(Static161.anInt3095)) ? local16.anInt9394 : local177, false, true, "<col=ffff00>" + local34, (long) arg1.anInt7524, 0, -1);
					}
				}
			}
			if (local16.aByte121 == 1 && local145 != null) {
				for (local155 = 4; local155 >= 0; local155--) {
					if (local145[local155] != null && local145[local155].equalsIgnoreCase(Static375.aClass253_27.method5453(Static161.anInt3095))) {
						@Pc(295) short local295 = 0;
						if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580 < local16.anInt9407) {
							local295 = 2000;
						}
						@Pc(308) short local308 = 0;
						if (local155 == 0) {
							local308 = 6;
						}
						if (local155 == 1) {
							local308 = 57;
						}
						if (local155 == 2) {
							local308 = 10;
						}
						if (local155 == 3) {
							local308 = 47;
						}
						if (local155 == 4) {
							local308 = 49;
						}
						if (local308 != 0) {
							local308 += local295;
						}
						Static385.method5573(local308, 0, local145[local155], local16.anInt9394, false, true, "<col=ffff00>" + local34, (long) arg1.anInt7524, 0, -1);
					}
				}
			}
		}
		Static385.method5573(1012, 0, Static375.aClass253_26.method5453(Static161.anInt3095), Static505.anInt8777, arg0, true, "<col=ffff00>" + local34, (long) arg1.anInt7524, 0, -1);
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)I")
	public static int method3400() {
		@Pc(12) Class78 local12 = Static31.aClass78_18;
		@Pc(14) boolean local14 = false;
		if (Static286.anInt5239 != 0) {
			@Pc(23) Canvas local23 = new Canvas();
			local23.setSize(100, 100);
			local12 = Static439.method6788(0, 0, local23, null, null);
			local14 = true;
		}
		@Pc(40) long local40 = Static480.method6650();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local12.method6836();
		}
		@Pc(67) int local67 = (int) (Static480.method6650() - local40);
		local12.method6800(-16777216, 100, 0, 100, 0);
		if (local14) {
			local12.method6786();
		}
		return local67;
	}
}
