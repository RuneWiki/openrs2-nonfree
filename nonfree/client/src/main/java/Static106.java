import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "B")
	public static byte aByte34;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "[Lclient!vq;")
	public static final Class2_Sub13_Sub18[] aClass2_Sub13_Sub18Array1 = new Class2_Sub13_Sub18[14];

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_7 = new Class91(13, 6);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z")
	public static boolean method1964(@OriginalArg(1) int arg0) {
		if (Static99.aBooleanArray13[arg0]) {
			return true;
		} else if (Static298.aClass53_85.method1604(arg0)) {
			@Pc(25) int local25 = Static298.aClass53_85.method1592(arg0);
			if (local25 == 0) {
				Static99.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static235.aClass310ArrayArray2[arg0] == null) {
				Static235.aClass310ArrayArray2[arg0] = new Class310[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (Static235.aClass310ArrayArray2[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static298.aClass53_85.method1616(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class310 local73 = Static235.aClass310ArrayArray2[arg0][local47] = new Class310();
						local73.anInt9226 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method7646(new Class2_Sub29(local61));
					}
				}
			}
			Static99.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
