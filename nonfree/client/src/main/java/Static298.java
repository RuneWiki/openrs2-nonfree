import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!he;")
	public static Class100 aClass100_55;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!i;")
	public static final Class111 aClass111_4 = new Class111();

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
	public static final int[] anIntArray357 = new int[50];

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	public static int anInt5281 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!qn;I)V")
	public static void method4403(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class209 arg1) {
		while (true) {
			@Pc(10) Class122 local10 = arg1.method4678(arg0);
			while (local10.anInt3557 == 0) {
				Static88.method4161(10L);
			}
			if (local10.anInt3557 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static88.method4161(100L);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)V")
	public static void method4404() {
		Static403.method5961(Static244.aClass92_152);
		Static109.aClass6_Sub1_Sub1_5.method6439(0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIII)V")
	public static void method4405(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg2 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (arg3 < local15) {
			@Pc(19) int local19 = arg3 + 1;
			arg0[local19] = arg1;
			@Pc(24) int local24 = local19 + 1;
			arg0[local24] = arg1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local29] = arg1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local34] = arg1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local39] = arg1;
			@Pc(44) int local44 = local39 + 1;
			arg0[local44] = arg1;
			@Pc(49) int local49 = local44 + 1;
			arg0[local49] = arg1;
			arg3 = local49 + 1;
			arg0[arg3] = arg1;
		}
		while (local12 > arg3) {
			arg3++;
			arg0[arg3] = arg1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)V")
	public static void method4406() {
		if (Static97.anIntArray130 != null) {
			return;
		}
		Static97.anIntArray130 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(83) float local83 = local71 - (float) local74;
				@Pc(89) float local89 = local61 * (1.0F - local52);
				@Pc(97) float local97 = local61 * (1.0F - local52 * local83);
				@Pc(107) float local107 = (1.0F - (1.0F - local83) * local52) * local61;
				if (local78 == 0) {
					local63 = local61;
					local65 = local107;
					local67 = local89;
				} else if (local78 == 1) {
					local65 = local61;
					local67 = local89;
					local63 = local97;
				} else if (local78 == 2) {
					local67 = local107;
					local65 = local61;
					local63 = local89;
				} else if (local78 == 3) {
					local67 = local61;
					local63 = local89;
					local65 = local97;
				} else if (local78 == 4) {
					local67 = local61;
					local65 = local89;
					local63 = local107;
				} else if (local78 == 5) {
					local67 = local97;
					local63 = local61;
					local65 = local89;
				}
				local63 = (float) Math.pow((double) local63, local20);
				local65 = (float) Math.pow((double) local65, local20);
				local67 = (float) Math.pow((double) local67, local20);
				@Pc(200) int local200 = (int) (local63 * 256.0F);
				@Pc(205) int local205 = (int) (local65 * 256.0F);
				@Pc(210) int local210 = (int) (local67 * 256.0F);
				@Pc(222) int local222 = (local200 << 16) + (local205 << 8) + local210 - 16777216;
				Static97.anIntArray130[local27++] = local222;
			}
		}
	}
}
