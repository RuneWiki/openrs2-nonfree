import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
	public static int anInt105;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
	public static int anInt108 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/Object;Lclient!ec;)V")
	public static void method116(@OriginalArg(1) Object arg0, @OriginalArg(2) Class92 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static26.method592(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!qba;)I")
	public static int method117(@OriginalArg(1) Class34_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anInt9639 == 0) {
			return 0;
		}
		@Pc(69) int local69;
		@Pc(62) int local62;
		if (arg0.anInt9673 != -1) {
			@Pc(22) Class34_Sub1_Sub1_Sub2 local22 = null;
			if (arg0.anInt9673 < 32768) {
				@Pc(34) Class3_Sub52 local34 = (Class3_Sub52) Static105.aClass333_11.method7489((long) arg0.anInt9673);
				if (local34 != null) {
					local22 = local34.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				}
			} else if (arg0.anInt9673 >= 32768) {
				local22 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[arg0.anInt9673 - 32768];
			}
			if (local22 != null) {
				local62 = arg0.anInt9614 - local22.anInt9614;
				local69 = arg0.anInt9619 - local22.anInt9619;
				if (local62 != 0 || local69 != 0) {
					arg0.method7860((int) (Math.atan2((double) local62, (double) local69) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class34_Sub1_Sub1_Sub2_Sub1) {
			@Pc(170) Class34_Sub1_Sub1_Sub2_Sub1 local170 = (Class34_Sub1_Sub1_Sub2_Sub1) arg0;
			if (local170.anInt1799 != -1 && (local170.anInt9703 == 0 || local170.anInt9704 > 0)) {
				local170.method7860(local170.anInt1799);
				local170.anInt1799 = -1;
			}
		} else if (arg0 instanceof Class34_Sub1_Sub1_Sub2_Sub2) {
			@Pc(95) Class34_Sub1_Sub1_Sub2_Sub2 local95 = (Class34_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local95.anInt9713 != -1 && (local95.anInt9703 == 0 || local95.anInt9704 > 0)) {
				local62 = local95.anInt9614 - (local95.anInt9713 - Static534.anInt8358 - Static534.anInt8358) * 256;
				local69 = local95.anInt9619 - (local95.anInt9714 - Static402.anInt6661 - Static402.anInt6661) * 256;
				if (local62 != 0 || local69 != 0) {
					local95.method7860((int) (Math.atan2((double) local62, (double) local69) * 2607.5945876176133D) & 0x3FFF);
				}
				local95.anInt9713 = -1;
			}
		}
		return arg0.method7867();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!af;II)Z")
	public static boolean method118(@OriginalArg(0) Class3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method333(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (local8 == 0) {
			if (arg0.method333(1) != 0) {
				method118(arg0, arg1);
			}
			local28 = arg0.method333(6);
			local33 = arg0.method333(6);
			@Pc(43) boolean local43 = arg0.method333(1) == 1;
			if (local43) {
				Static135.anIntArray143[Static320.anInt5359++] = arg1;
			}
			if (Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class180 local66 = Static334.aClass180Array3[arg1];
			@Pc(74) Class34_Sub1_Sub1_Sub2_Sub1 local74 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[arg1] = new Class34_Sub1_Sub1_Sub2_Sub1();
			local74.anInt9671 = arg1;
			if (Static273.aClass3_Sub4Array1[arg1] != null) {
				local74.method1481(Static273.aClass3_Sub4Array1[arg1]);
			}
			local74.method7864(true, local66.anInt4735);
			local74.anInt9673 = local66.anInt4733;
			local100 = local66.anInt4734;
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			local114 = local100 & 0xFF;
			@Pc(123) int local123 = (local110 << 6) + local28 - Static534.anInt8358;
			local74.aBoolean144 = local66.aBoolean312;
			@Pc(137) int local137 = (local114 << 6) + local33 - Static402.anInt6661;
			local74.aBoolean146 = local66.aBoolean311;
			local74.aByteArray89[0] = Static121.aByteArray13[arg1];
			local74.aByte132 = local74.aByte131 = (byte) local104;
			if (Static209.method3118(local123, local137)) {
				local74.aByte131++;
			}
			local74.method1489(local137, local123);
			local74.aBoolean143 = false;
			Static334.aClass180Array3[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method333(2);
			local33 = Static334.aClass180Array3[arg1].anInt4734;
			Static334.aClass180Array3[arg1].anInt4734 = (((local33 >> 28) + local28 & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(229) int local229;
			@Pc(242) int local242;
			if (local8 != 2) {
				local28 = arg0.method333(18);
				local33 = local28 >> 16;
				local229 = local28 >> 8 & 0xFF;
				local242 = local28 & 0xFF;
				local100 = Static334.aClass180Array3[arg1].anInt4734;
				local104 = local33 + (local100 >> 28) & 0x3;
				local110 = local229 + (local100 >> 14) & 0xFF;
				local114 = local242 + local100 & 0xFF;
				Static334.aClass180Array3[arg1].anInt4734 = (local104 << 28) + ((local110 << 14) + local114);
				return false;
			}
			local28 = arg0.method333(5);
			local33 = local28 >> 3;
			local229 = local28 & 0x7;
			@Pc(234) int local234 = Static334.aClass180Array3[arg1].anInt4734;
			local242 = (local234 >> 28) + local33 & 0x3;
			local100 = local234 >> 14 & 0xFF;
			local104 = local234 & 0xFF;
			if (local229 == 0) {
				local100--;
				local104--;
			}
			if (local229 == 1) {
				local104--;
			}
			if (local229 == 2) {
				local100++;
				local104--;
			}
			if (local229 == 3) {
				local100--;
			}
			if (local229 == 4) {
				local100++;
			}
			if (local229 == 5) {
				local104++;
				local100--;
			}
			if (local229 == 6) {
				local104++;
			}
			if (local229 == 7) {
				local104++;
				local100++;
			}
			Static334.aClass180Array3[arg1].anInt4734 = local104 + (local100 << 14) + (local242 << 28);
			return false;
		}
	}
}
