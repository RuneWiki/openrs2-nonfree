import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_89 = new Class90(43, 6);

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "[I")
	public static final int[] anIntArray350 = new int[1000];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIIIII)V")
	public static void method5003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg4;
		@Pc(13) int local13 = arg1 - arg3;
		if (local9 == 0) {
			if (local13 != 0) {
				Static432.method6459(arg1, arg2, arg4, arg3);
			}
		} else if (local13 == 0) {
			Static274.method4442(arg0, arg3, arg2, arg4);
		} else {
			@Pc(49) int local49 = (local13 << 12) / local9;
			@Pc(58) int local58 = arg3 - (local49 * arg4 >> 12);
			@Pc(72) int local72;
			@Pc(70) int local70;
			if (arg4 < Static292.anInt5983) {
				local70 = local58 + (local49 * Static292.anInt5983 >> 12);
				local72 = Static292.anInt5983;
			} else if (arg4 <= Static61.anInt1627) {
				local72 = arg4;
				local70 = arg3;
			} else {
				local72 = Static61.anInt1627;
				local70 = local58 + (Static61.anInt1627 * local49 >> 12);
			}
			@Pc(106) int local106;
			@Pc(104) int local104;
			if (arg0 < Static292.anInt5983) {
				local104 = (Static292.anInt5983 * local49 >> 12) + local58;
				local106 = Static292.anInt5983;
			} else if (arg0 <= Static61.anInt1627) {
				local106 = arg0;
				local104 = arg1;
			} else {
				local104 = (local49 * Static61.anInt1627 >> 12) + local58;
				local106 = Static61.anInt1627;
			}
			if (local104 < Static289.anInt5872) {
				local106 = (Static289.anInt5872 - local58 << 12) / local49;
				local104 = Static289.anInt5872;
			} else if (local104 > Static160.anInt3347) {
				local106 = (Static160.anInt3347 - local58 << 12) / local49;
				local104 = Static160.anInt3347;
			}
			if (local70 < Static289.anInt5872) {
				local72 = (Static289.anInt5872 - local58 << 12) / local49;
				local70 = Static289.anInt5872;
			} else if (local70 > Static160.anInt3347) {
				local70 = Static160.anInt3347;
				local72 = (Static160.anInt3347 - local58 << 12) / local49;
			}
			Static390.method6008(arg2, local104, local70, local106, local72);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)C")
	public static char method5004(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(46) char local46 = Static101.aCharArray3[local7 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local7 = local46;
		}
		return (char) local7;
	}
}
