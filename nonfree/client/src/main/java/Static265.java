import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!r", name = "E", descriptor = "[Lclient!gh;")
	public static Class73[] aClass73Array44;

	@OriginalMember(owner = "client!r", name = "G", descriptor = "I")
	public static int anInt6826;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "[[Lclient!on;")
	public static Class146[][] aClass146ArrayArray41;

	@OriginalMember(owner = "client!r", name = "J", descriptor = "Lclient!il;")
	public static Class90 aClass90_41;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "I")
	public static int anInt6827 = 0;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
	public static void method5885() {
		Static257.aClass119_160.method3312();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Z")
	public static boolean method5886(@OriginalArg(0) int arg0) {
		if (Static104.aBooleanArray24[arg0]) {
			return true;
		} else if (Static252.aClass191_161.method5457(arg0)) {
			@Pc(23) int local23 = Static252.aClass191_161.method5443(arg0);
			if (local23 == 0) {
				Static104.aBooleanArray24[arg0] = true;
				return true;
			}
			if (aClass146ArrayArray41[arg0] == null) {
				aClass146ArrayArray41[arg0] = new Class146[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (aClass146ArrayArray41[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static252.aClass191_161.method5459(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class146 local73 = aClass146ArrayArray41[arg0][local47] = new Class146();
						local73.anInt4450 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method4046(new Class2_Sub10(local61));
					}
				}
			}
			Static104.aBooleanArray24[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
