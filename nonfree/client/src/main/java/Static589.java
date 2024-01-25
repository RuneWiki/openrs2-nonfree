import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "Lclient!mm;")
	public static final Class238 aClass238_1 = new Class238();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!haa;Z[[B)V")
	public static void method8458(@OriginalArg(0) Class153_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(41) int local41;
		@Pc(50) int local50;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt3423; local21++) {
			Static62.method873();
			for (local27 = 0; local27 < Static544.anInt9261 >> 3; local27++) {
				for (local31 = 0; local31 < Static282.anInt4887 >> 3; local31++) {
					local41 = Static107.anIntArrayArrayArray7[local21][local27][local31];
					if (local41 != -1) {
						local50 = local41 >> 24 & 0x3;
						if (!arg0.aBoolean274 || local50 == 0) {
							@Pc(66) int local66 = local41 >> 1 & 0x3;
							@Pc(72) int local72 = local41 >> 14 & 0x3FF;
							@Pc(78) int local78 = local41 >> 3 & 0x7FF;
							@Pc(89) int local89 = (local72 / 8 << 8) + (local78 / 8);
							for (@Pc(91) int local91 = 0; local91 < Static672.anIntArray621.length; local91++) {
								if (local89 == Static672.anIntArray621[local91] && arg1[local91] != null) {
									@Pc(117) Class5_Sub23 local117 = new Class5_Sub23(arg1[local91]);
									arg0.method3018(local50, local31 * 8, local21, local78, local27 * 8, local66, local72, Static670.aClass88Array1, local117);
									arg0.method3032(local78, local27 * 8, local31 * 8, local50, local21, Static457.aClass57_11, local66, local72, local117, local12[0] == -1 ? local12 : null);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local27 = 0; local27 < arg0.anInt3423; local27++) {
			Static62.method873();
			for (local31 = 0; local31 < Static544.anInt9261 >> 3; local31++) {
				for (local41 = 0; local41 < Static282.anInt4887 >> 3; local41++) {
					local50 = Static107.anIntArrayArrayArray7[local27][local31][local41];
					if (local50 == -1) {
						arg0.method3015(8, local41 * 8, local27, 8, local31 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static86.aClass311_1 = Static162.aClass181_1.method3885(local12[2], local12[3], local12[1], local12[0], Static112.aClass321_1);
			Static581.anInt9735 = local12[4];
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JZ)V")
	public static void method8459(@OriginalArg(0) long arg0) {
		Static242.aCalendar2.setTime(new Date(arg0));
	}
}
