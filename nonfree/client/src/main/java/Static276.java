import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nt", name = "H", descriptor = "Lclient!c;")
	public static Class31 aClass31_3;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
	public static int anInt4560 = 0;

	@OriginalMember(owner = "client!nt", name = "G", descriptor = "[I")
	public static final int[] anIntArray390 = new int[13];

	@OriginalMember(owner = "client!nt", name = "I", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_68 = new Class134("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Lclient!iq;")
	public static Class3_Sub1 method3715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class3_Sub1 local14 = local7.aClass3_Sub1_1;
			local7.aClass3_Sub1_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZLjava/lang/String;Z)I")
	public static int method3716(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local31 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(84) int local84;
			if (local46 >= '0' && local46 <= '9') {
				local84 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local84 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local84 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local84) {
				throw new NumberFormatException();
			}
			if (local31) {
				local84 = -local84;
			}
			@Pc(124) int local124 = local84 + arg0 * local35;
			if (local124 / arg0 != local35) {
				throw new NumberFormatException();
			}
			local33 = true;
			local35 = local124;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIZII)I")
	public static int method3717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(11) int local11 = arg3;
			arg3 = arg2;
			arg2 = local11;
		}
		@Pc(19) int local19 = arg4 & 0x3;
		if (local19 == 0) {
			return arg5;
		} else if (local19 == 1) {
			return arg1;
		} else if (local19 == 2) {
			return 8 - arg5 - arg3;
		} else {
			return 1 + 7 - arg2 - arg1;
		}
	}
}
