import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	public static int anInt6884;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_153 = new Class180(70, 1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I")
	public static int method6190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return (arg1 + (arg1 >>> 31)) % arg0 + local16;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLclient!lda;ZILclient!lda;II)I")
	public static int method6191(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class98_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class98_Sub1 arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = Static249.method4131(arg2, arg5, arg4, arg1);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static249.method4131(arg0, arg3, arg4, arg1);
			return arg0 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public static void method6192() {
		if (Static178.anInt3512 < 0) {
			return;
		}
		@Pc(4) long local4 = Static524.method7320();
		Static178.anInt3512 = (int) ((long) Static178.anInt3512 + Static604.aLong290 - local4);
		if (Static178.anInt3512 <= 0) {
			Static37.aFloat34 = Static665.aClass312_2.aFloat193;
			Static674.aFloat227 = Static665.aClass312_2.aFloat191;
			Static438.anInt6925 = Static665.aClass312_2.anInt8864;
			Static631.aClass35_4 = Static665.aClass312_2.aClass35_3;
			Static486.anInt8044 = Static665.aClass312_2.anInt8868;
			Static297.anInt4985 = Static665.aClass312_2.anInt8862;
			Static113.aFloat70 = Static665.aClass312_2.aFloat192;
			Static273.aFloat103 = Static665.aClass312_2.aFloat188;
			Static640.aFloat210 = Static665.aClass312_2.aFloat190;
			Static178.anInt3512 = -1;
			Static544.aFloat195 = Static665.aClass312_2.aFloat189;
		} else {
			@Pc(58) int local58 = (Static178.anInt3512 << 8) / Static17.anInt432;
			@Pc(63) int local63 = 255 - local58;
			@Pc(68) float local68 = (float) local58 / 255.0F;
			@Pc(72) float local72 = 1.0F - local68;
			Static486.anInt8044 = ((Static665.aClass312_2.anInt8868 & 0xFF00FF) * local63 + (Static460.anInt7597 & 0xFF00FF) * local58 & 0xFF00FF00) + ((Static460.anInt7597 & 0xFF00) * local58 + (local63 * (Static665.aClass312_2.anInt8868 & 0xFF00)) & 0xFF0000) >>> 8;
			Static674.aFloat227 = Static237.aFloat98 + (Static665.aClass312_2.aFloat191 - Static237.aFloat98) * local72;
			Static273.aFloat103 = (Static665.aClass312_2.aFloat188 - Static227.aFloat94) * local72 + Static227.aFloat94;
			Static544.aFloat195 = Static634.aFloat209 + (Static665.aClass312_2.aFloat189 - Static634.aFloat209) * local72;
			Static297.anInt4985 = local63 * Static665.aClass312_2.anInt8862 + local58 * Static109.anInt2257 >> 8;
			Static113.aFloat70 = Static107.aFloat67 + (Static665.aClass312_2.aFloat192 - Static107.aFloat67) * local72;
			Static438.anInt6925 = (local58 * (Static550.anInt9003 & 0xFF00FF) + (Static665.aClass312_2.anInt8864 & 0xFF00FF) * local63 & 0xFF00FF00) + ((Static665.aClass312_2.anInt8864 & 0xFF00) * local63 + (Static550.anInt9003 & 0xFF00) * local58 & 0xFF0000) >>> 8;
			Static640.aFloat210 = Static580.aFloat200 + (Static665.aClass312_2.aFloat190 - Static580.aFloat200) * local72;
			Static37.aFloat34 = (Static665.aClass312_2.aFloat193 - Static80.aFloat201) * local72 + Static80.aFloat201;
			if (Static342.aClass35_2 != Static665.aClass312_2.aClass35_3) {
				Static631.aClass35_4 = Static90.aClass13_18.method8477(Static342.aClass35_2, Static665.aClass312_2.aClass35_3, local72, Static631.aClass35_4);
			}
		}
		Static604.aLong290 = local4;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIZIIII)V")
	public static void method6194(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static533.anInt8786 = arg4;
		Static554.anInt9042 = arg3;
		Static38.anInt905 = arg2;
		Static327.anInt5437 = arg5;
		Static547.anInt8967 = arg0;
		if (arg1 && Static327.anInt5437 >= 100) {
			Static509.anInt8222 = Static547.anInt8967 * 512 + 256;
			Static652.anInt10382 = Static38.anInt905 * 512 + 256;
			Static146.anInt2945 = Static168.method3058(Static309.anInt5138, Static509.anInt8222, Static652.anInt10382) - Static533.anInt8786;
		}
		Static428.anInt6834 = 2;
		Static153.anInt3036 = -1;
		Static410.anInt6542 = -1;
	}
}
