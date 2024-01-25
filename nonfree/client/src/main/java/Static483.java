import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
	public static int anInt7683 = -1;

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
	public static final int anInt7690 = 1407;

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
	public static int anInt7695 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method6386(@OriginalArg(1) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static627.anInt10388;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class28 local27 = Static256.aClass303_1.method6672(arg0[local18]);
			if (local27.anInt853 != -1) {
				@Pc(40) Class6 local40 = (Class6) Static675.aClass295_73.method6470((long) local27.anInt853);
				if (local40 == null) {
					@Pc(48) Class370 local48 = Static688.method8590(Static142.aClass362_32, local27.anInt853, 0);
					if (local48 != null) {
						local40 = Static119.aClass95_4.method8008(local48, true);
						Static675.aClass295_73.method6469((long) local27.anInt853, local40);
					}
				}
				if (local40 != null) {
					Static470.aClass6Array11[local16] = local40;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}
}
