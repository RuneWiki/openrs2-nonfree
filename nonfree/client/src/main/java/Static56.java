import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!df", name = "w", descriptor = "[Lclient!dn;")
	public static Class51[] aClass51Array2;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "I")
	public static int anInt1019;

	@OriginalMember(owner = "client!df", name = "C", descriptor = "Lclient!ij;")
	public static Class93 aClass93_22;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)Lclient!qg;")
	public static Class5_Sub32 method877() {
		if (Static290.aClass103_69 == null || Static155.aClass29_1 == null) {
			return null;
		}
		for (@Pc(19) Class5_Sub32 local19 = (Class5_Sub32) Static155.aClass29_1.method577(); local19 != null; local19 = (Class5_Sub32) Static155.aClass29_1.method577()) {
			@Pc(25) Class215 local25 = Static252.method4463(local19.anInt5146);
			if (local25 != null && local25.aBoolean588 && local25.method5994()) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method878(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
