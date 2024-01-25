import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
	public static int anInt7373;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "Lclient!ws;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Lclient!it;")
	public static Class122 aClass122_16;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
	public static int anInt7372 = 0;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_103 = new Class177(66, 4);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)Z")
	public static boolean method5610(@OriginalArg(0) int arg0) {
		if (Static412.aBooleanArray24[arg0]) {
			return true;
		} else if (Static311.aClass211_73.method4757(arg0)) {
			@Pc(21) int local21 = Static311.aClass211_73.method4772(arg0);
			if (local21 == 0) {
				Static412.aBooleanArray24[arg0] = true;
				return true;
			}
			if (Static293.aClass68ArrayArray4[arg0] == null) {
				Static293.aClass68ArrayArray4[arg0] = new Class68[local21];
			}
			for (@Pc(48) int local48 = 0; local48 < local21; local48++) {
				if (Static293.aClass68ArrayArray4[arg0][local48] == null) {
					@Pc(63) byte[] local63 = Static311.aClass211_73.method4758(local48, arg0);
					if (local63 != null) {
						@Pc(75) Class68 local75 = Static293.aClass68ArrayArray4[arg0][local48] = new Class68();
						local75.anInt2135 = (arg0 << 16) + local48;
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method1584(new Class1_Sub3(local63));
					}
				}
			}
			Static412.aBooleanArray24[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
