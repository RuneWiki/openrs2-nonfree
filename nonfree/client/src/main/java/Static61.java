import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt981;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
	public static boolean aBoolean50 = false;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)I")
	public static int method777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static142.anInt2546 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static349.anInt7457;
		@Pc(25) int local25 = arg1 - Static349.anInt7465;
		for (@Pc(30) Class6_Sub34 local30 = (Class6_Sub34) Static349.aClass275_155.method6366(); local30 != null; local30 = (Class6_Sub34) Static349.aClass275_155.method6364()) {
			if (local30.anInt4907 == arg0) {
				@Pc(48) int local48 = local30.anInt4906;
				@Pc(51) int local51 = local30.anInt4905;
				@Pc(62) int local62 = local48 + Static349.anInt7457 << 14 | Static349.anInt7465 + local51;
				@Pc(81) int local81 = (local21 - local48) * (local21 - local48) + (local25 - local51) * (local25 - local51);
				if (local14 < 0 || local81 < local16) {
					local16 = local81;
					local14 = local62;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public static void method778() {
		Static495.anInt8262 = Static338.aClass146_7.anInt3688 + Static338.aClass146_7.anInt3689 + 2;
		Static534.anInt9078 = Static340.aClass146_8.anInt3689 + Static340.aClass146_8.anInt3688 + 2;
		Static316.aStringArray22 = new String[500];
		for (@Pc(31) int local31 = 0; local31 < Static316.aStringArray22.length; local31++) {
			Static316.aStringArray22[local31] = "";
		}
	}
}
