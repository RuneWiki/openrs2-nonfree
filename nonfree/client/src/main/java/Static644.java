import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!vga", name = "Z", descriptor = "I")
	public static int anInt10593;

	@OriginalMember(owner = "client!vga", name = "J", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_270 = new Class160(106, -1);

	@OriginalMember(owner = "client!vga", name = "db", descriptor = "I")
	public static int anInt10590 = -1;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILclient!rea;)V")
	public static void method9053(@OriginalArg(1) Class14_Sub21_Sub2 arg0) {
		arg0.method7766();
		@Pc(10) int local10 = Static597.anInt9858;
		@Pc(20) Class4_Sub3_Sub3_Sub3_Sub2 local20 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local10] = new Class4_Sub3_Sub3_Sub3_Sub2();
		local20.anInt3238 = local10;
		@Pc(28) int local28 = arg0.method7764(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray200[0] = local39 - Static36.anInt617;
		local20.anInt11184 = (local20.anIntArray200[0] << 9) + (local20.method2870(0) << 8);
		local20.anIntArray201[0] = local43 - Static550.anInt9242;
		local20.anInt11178 = (local20.anIntArray201[0] << 9) + (local20.method2870(0) << 8);
		Static391.anInt6811 = local20.aByte146 = local20.aByte147 = local33;
		if (Static551.method7974(local20.anIntArray200[0], local20.anIntArray201[0])) {
			local20.aByte147++;
		}
		if (Static260.aClass14_Sub21Array1[local10] != null) {
			local20.method2885(Static260.aClass14_Sub21Array1[local10], 0);
		}
		Static258.anInt4846 = 0;
		Static43.anIntArray35[Static258.anInt4846++] = local10;
		Static244.aByteArray56[local10] = 0;
		Static363.anInt6202 = 0;
		for (@Pc(153) int local153 = 1; local153 < 2048; local153++) {
			if (local10 != local153) {
				@Pc(165) int local165 = arg0.method7764(18);
				@Pc(169) int local169 = local165 >> 16;
				@Pc(175) int local175 = local165 >> 8 & 0xFF;
				@Pc(179) int local179 = local165 & 0xFF;
				@Pc(187) Class245 local187 = Static671.aClass245Array1[local153] = new Class245();
				local187.anInt6979 = -1;
				local187.aBoolean491 = false;
				local187.anInt6983 = (local169 << 28) - (-(local175 << 14) - local179);
				local187.anInt6984 = 0;
				local187.aBoolean492 = false;
				Static367.anIntArray340[Static363.anInt6202++] = local153;
				Static244.aByteArray56[local153] = 0;
			}
		}
		arg0.method7768();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BI)S")
	public static short method9055(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(40) int local40 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(44) int local44 = local40 + local19;
		@Pc(50) int local50;
		if (local44 == 0) {
			local50 = local40 << 1;
		} else {
			local50 = (local40 << 8) / local44;
		}
		return (short) (local44 | local9 << 10 | local50 >> 4 << 7);
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)V")
	public static void method9056() {
		if (!Static473.method7088()) {
			return;
		}
		if (Static658.aStringArray47 == null) {
			Static391.method5938();
		}
		Static417.anInt7162 = 0;
		Static191.aBoolean244 = true;
	}
}
