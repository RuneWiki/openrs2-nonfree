import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
	public static int anInt620;

	@OriginalMember(owner = "client!aw", name = "G", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_2 = new Class111();

	@OriginalMember(owner = "client!aw", name = "L", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_11 = new Class208(19, -1);

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)Z")
	public static boolean method535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static406.aBoolean553) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static115.aClass160ArrayArray1[local13] == null || Static115.aClass160ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(43) Class160 local43 = Static115.aClass160ArrayArray1[local13][local17];
		@Pc(55) Class1_Sub40 local55;
		if (arg0 == -1 && local43.anInt4166 == 0) {
			for (local55 = (Class1_Sub40) Static166.aClass111_49.method2547(); local55 != null; local55 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
				if (local55.anInt7819 == 45 || local55.anInt7819 == 1011 || local55.anInt7819 == 2 || local55.anInt7819 == 5 || local55.anInt7819 == 20) {
					for (@Pc(139) Class160 local139 = Static512.method7155(local55.anInt7821); local139 != null; local139 = Static524.method1213(local139)) {
						if (local43.anInt4199 == local139.anInt4199) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class1_Sub40) Static166.aClass111_49.method2547(); local55 != null; local55 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
				if (local55.anInt7817 == arg0 && local43.anInt4199 == local55.anInt7821 && (local55.anInt7819 == 45 || local55.anInt7819 == 1011 || local55.anInt7819 == 2 || local55.anInt7819 == 5 || local55.anInt7819 == 20)) {
					return true;
				}
			}
		}
		return false;
	}
}
