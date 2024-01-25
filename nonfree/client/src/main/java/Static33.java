import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Lclient!pv;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_12 = new Class84("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_8 = new Class237(52, 1);

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_9 = new Class237(85, -2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
	public static void method568(@OriginalArg(1) int arg0) {
		Static265.anInt4786 = arg0;
		Static361.aClass83_52.method1669();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)Z")
	public static boolean method572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static108.aBoolean111) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static448.aClass219ArrayArray2[local13] == null || Static448.aClass219ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class219 local40 = Static448.aClass219ArrayArray2[local13][local17];
		@Pc(55) Class1_Sub8 local55;
		if (arg0 == -1 && local40.anInt6377 == 0) {
			for (local55 = (Class1_Sub8) Static8.aClass266_2.method6000(); local55 != null; local55 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
				if (local55.anInt1758 == 5 || local55.anInt1758 == 1010 || local55.anInt1758 == 57 || local55.anInt1758 == 20 || local55.anInt1758 == 23) {
					for (@Pc(145) Class219 local145 = Static103.method1572(local55.anInt1759); local145 != null; local145 = Static119.method5886(local145)) {
						if (local145.anInt6422 == local40.anInt6422) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class1_Sub8) Static8.aClass266_2.method6000(); local55 != null; local55 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
				if (arg0 == local55.anInt1760 && local40.anInt6422 == local55.anInt1759 && (local55.anInt1758 == 5 || local55.anInt1758 == 1010 || local55.anInt1758 == 57 || local55.anInt1758 == 20 || local55.anInt1758 == 23)) {
					return true;
				}
			}
		}
		return false;
	}
}
