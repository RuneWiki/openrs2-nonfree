import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	public static int anInt6663;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	public static int anInt6670;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_101 = new Class45(98, 8);

	@OriginalMember(owner = "client!om", name = "w", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_102 = new Class45(51, 4);

	@OriginalMember(owner = "client!om", name = "x", descriptor = "I")
	public static int anInt6674 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!fb;)V")
	public static void method5569(@OriginalArg(0) Class97 arg0) {
		if (Static423.anInt78 >= 65535) {
			return;
		}
		@Pc(6) Class12_Sub7 local6 = arg0.aClass12_Sub7_1;
		Static485.aClass97Array1[Static423.anInt78] = arg0;
		Static449.aBooleanArray45[Static423.anInt78] = false;
		Static423.anInt78++;
		@Pc(21) int local21 = arg0.anInt2937;
		if (arg0.aBoolean240) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2937;
		if (arg0.aBoolean239) {
			local29 = Static36.anInt8450 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5117() + Static225.anInt4810 - local6.method5123() >> Static193.anInt4311;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5117() + local6.method5123() - Static225.anInt4810 >> Static193.anInt4311;
			if (local73 >= Static509.anInt9164) {
				local73 = Static509.anInt9164 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray43[local41++];
				@Pc(105) int local105 = (local6.method5124() + Static225.anInt4810 - local6.method5123() >> Static193.anInt4311) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static537.anInt9566) {
					local113 = Static537.anInt9566 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static130.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static130.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static423.anInt78;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static130.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static423.anInt78 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static130.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static423.anInt78 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static130.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static423.anInt78 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public static void method5570() {
		Static314.aClient1.method1518();
		Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
		Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
		Static402.aClass45_117 = null;
		Static167.aClass45_49 = null;
		Static47.anInt889 = 0;
		Static376.aClass45_154 = null;
		Static123.anInt2885 = 0;
		Static10.aClass45_4 = null;
		Static459.method6906();
		Static124.anInt2889 = 0;
		Static167.anInt3850 = 0;
		Static224.aClass169Array5 = null;
		Static155.anInt3380 = 0;
		Static482.aString99 = null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	public static void method5572() {
		if (Static241.aFrame25 != null) {
			return;
		}
		@Pc(8) int local8 = Static37.anInt7517;
		@Pc(10) int local10 = Static193.anInt4312;
		@Pc(17) int local17 = Static352.anInt6601 - Static169.anInt3893 - local8;
		@Pc(29) int local29 = Static121.anInt2757 - local10 - Static127.anInt2936;
		if (local8 <= 0 && local17 <= 0 && local10 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static308.aFrame17 == null) {
				local48 = Static375.aClass71_3.anApplet1;
			} else {
				local48 = Static308.aFrame17;
			}
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			if (Static308.aFrame17 == local48) {
				@Pc(62) Insets local62 = Static308.aFrame17.getInsets();
				local56 = local62.top;
				local54 = local62.left;
			}
			@Pc(71) Graphics local71 = local48.getGraphics();
			local71.setColor(Color.black);
			if (local8 > 0) {
				local71.fillRect(local54, local56, local8, Static121.anInt2757);
			}
			if (local10 > 0) {
				local71.fillRect(local54, local56, Static352.anInt6601, local10);
			}
			if (local17 > 0) {
				local71.fillRect(Static352.anInt6601 + local54 - local17, local56, local17, Static121.anInt2757);
			}
			if (local29 > 0) {
				local71.fillRect(local54, Static121.anInt2757 + local56 - local29, Static352.anInt6601, local29);
				return;
			}
		} catch (@Pc(125) Exception local125) {
			return;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public static void method5573() {
		if (Static299.aBoolean447) {
			return;
		}
		Static497.aBoolean640 = true;
		Static299.aBoolean447 = true;
		if (Static208.aClass12_Sub10_Sub1_1.aBoolean184) {
			Static500.aFloat186 = (int) Static500.aFloat186 + 191 & 0xFFFFFF80;
		} else {
			Static516.aFloat188 += (24.0F - Static516.aFloat188) / 2.0F;
		}
	}
}
