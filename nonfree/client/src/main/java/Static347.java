import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
	public static int anInt6411;

	@OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
	public static int anInt6415;

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "Lclient!kg;")
	public static final Class188 aClass188_5 = new Class188("", 16);

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZI)I")
	public static int method5404(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V")
	public static void method5405() {
		Static495.aClass233_48.method5663();
	}
}
