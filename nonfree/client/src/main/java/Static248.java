import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Lclient!he;")
	public static Class100 aClass100_91;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_25 = new Class10(7, 0, 1, 1);

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "[B")
	public static final byte[] aByteArray93 = new byte[16384];

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "[I")
	public static final int[] anIntArray515 = new int[16];

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public static int anInt7513 = 0;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	public static int anInt7514 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Z")
	public static boolean method6162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static250.aBoolean294) {
			return false;
		}
		@Pc(18) int local18 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Static35.aClass239ArrayArray1[local18] == null || Static35.aClass239ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class239 local40 = Static35.aClass239ArrayArray1[local18][local22];
		@Pc(53) Class6_Sub40 local53;
		if (arg1 == -1 && local40.anInt6900 == 0) {
			for (local53 = (Class6_Sub40) Static292.aClass244_25.method5976(); local53 != null; local53 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
				if (local53.anInt6722 == 57 || local53.anInt6722 == 1011 || local53.anInt6722 == 18 || local53.anInt6722 == 60 || local53.anInt6722 == 46) {
					for (@Pc(139) Class239 local139 = Static121.method2092(local53.anInt6720); local139 != null; local139 = Static211.method3216(local139)) {
						if (local139.anInt6908 == local40.anInt6908) {
							return true;
						}
					}
				}
			}
		} else {
			for (local53 = (Class6_Sub40) Static292.aClass244_25.method5976(); local53 != null; local53 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
				if (local53.anInt6719 == arg1 && local53.anInt6720 == local40.anInt6908 && (local53.anInt6722 == 57 || local53.anInt6722 == 1011 || local53.anInt6722 == 18 || local53.anInt6722 == 60 || local53.anInt6722 == 46)) {
					return true;
				}
			}
		}
		return false;
	}
}
