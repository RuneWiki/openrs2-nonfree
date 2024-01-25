import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public static int anInt7066;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_201 = new Class363(0, -2);

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	public static int anInt7068 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)S")
	public static short method5917(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? (127 - local19) * local15 >> 7 : local19 * local15 >> 7;
		@Pc(48) int local48 = local19 + local37;
		@Pc(54) int local54;
		if (local48 == 0) {
			local54 = local37 << 1;
		} else {
			local54 = (local37 << 8) / local48;
		}
		return (short) (local48 | local54 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!fa;I)Lclient!r;")
	public static Class100 method5918(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface5 arg2) {
		return new Class100_Sub3(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method5919(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(16) int local16 = arg1.length();
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local18 - local22 || local16 > local20 - local24) {
			if (local18 - local22 >= local8) {
				return -1;
			}
			if (local16 <= local20 - local24) {
				return 1;
			}
			@Pc(63) char local63;
			if (local22 == '\u0000') {
				local63 = arg2.charAt(local18++);
			} else {
				local63 = local22;
			}
			@Pc(76) char local76;
			if (local24 == '\u0000') {
				local76 = arg1.charAt(local20++);
			} else {
				local76 = local24;
			}
			local22 = Static353.method5263(local63);
			local24 = Static353.method5263(local76);
			local63 = Static251.method3928(arg0, local63);
			local76 = Static251.method3928(arg0, local76);
			if (local76 != local63 && Character.toUpperCase(local63) != Character.toUpperCase(local76)) {
				local63 = Character.toLowerCase(local63);
				local76 = Character.toLowerCase(local76);
				if (local76 != local63) {
					return Static117.method1746(local63, arg0) - Static117.method1746(local76, arg0);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local16);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg0 == 2) {
				local20 = local16 - local140 - 1;
				local18 = local8 - local140 - 1;
			} else {
				local20 = local140;
				local18 = local140;
			}
			@Pc(168) char local168 = arg2.charAt(local18);
			@Pc(172) char local172 = arg1.charAt(local20);
			if (local172 != local168 && Character.toUpperCase(local168) != Character.toUpperCase(local172)) {
				local168 = Character.toLowerCase(local168);
				local172 = Character.toLowerCase(local172);
				if (local172 != local168) {
					return Static117.method1746(local168, arg0) - Static117.method1746(local172, arg0);
				}
			}
		}
		@Pc(220) int local220 = local8 - local16;
		if (local220 != 0) {
			return local220;
		}
		for (@Pc(226) int local226 = 0; local226 < local138; local226++) {
			@Pc(232) char local232 = arg2.charAt(local226);
			@Pc(236) char local236 = arg1.charAt(local226);
			if (local232 != local236) {
				return Static117.method1746(local232, arg0) - Static117.method1746(local236, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public static void method5920() {
		if (Static100.aBoolean183) {
			return;
		}
		if (Static72.aClass2_Sub12_Sub1_1.aBoolean151) {
			Static447.aFloat233 = (int) Static447.aFloat233 + 191 & 0xFFFFFF80;
		} else {
			Static11.aFloat8 += (24.0F - Static11.aFloat8) / 2.0F;
		}
		Static100.aBoolean183 = true;
		Static341.aBoolean494 = true;
	}
}
