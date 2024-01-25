import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!um", name = "Y", descriptor = "Lclient!rn;")
	public static Class18 aClass18_26;

	@OriginalMember(owner = "client!um", name = "Z", descriptor = "I")
	public static int anInt5919;

	@OriginalMember(owner = "client!um", name = "ab", descriptor = "Lclient!de;")
	public static Class44 aClass44_5;

	@OriginalMember(owner = "client!um", name = "T", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_93 = new Class32("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)Z")
	public static boolean method5096(@OriginalArg(1) int arg0) {
		if (Static350.aBooleanArray22[arg0]) {
			return true;
		} else if (Static233.aClass171_54.method3742(arg0)) {
			@Pc(23) int local23 = Static233.aClass171_54.method3750(arg0);
			if (local23 == 0) {
				Static350.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static183.aClass4ArrayArray1[arg0] == null) {
				Static183.aClass4ArrayArray1[arg0] = new Class4[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static183.aClass4ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static233.aClass171_54.method3745(arg0, local42);
					if (local56 != null) {
						@Pc(68) Class4 local68 = Static183.aClass4ArrayArray1[arg0][local42] = new Class4();
						local68.anInt94 = (arg0 << 16) + local42;
						if (local56[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local68.method81(new Class2_Sub16(local56));
					}
				}
			}
			Static350.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
