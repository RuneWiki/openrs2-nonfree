import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "[I")
	public static final int[] anIntArray135 = new int[2];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
	public static String method1716(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static562.anInt9322;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class273 local22 = Static27.aClass254_1.method6392(arg0[local13]);
			if (local22.anInt7657 != -1) {
				@Pc(34) Class103 local34 = (Class103) Static627.aClass136_72.method3134((long) local22.anInt7657);
				if (local34 == null) {
					@Pc(42) Class251 local42 = Static656.method6331(Static419.aClass343_200, local22.anInt7657, 0);
					if (local42 != null) {
						local34 = Static266.aClass82_8.method6106(local42, true);
						Static627.aClass136_72.method3135(local34, (long) local22.anInt7657);
					}
				}
				if (local34 != null) {
					Static307.aClass103Array12[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI)Z")
	public static boolean method1721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static411.method6900(arg1, arg0) & (Static270.method4505(arg1, arg0) | (arg0 & 0x2000) != 0 | Static500.method7264(arg0, arg1));
	}
}
