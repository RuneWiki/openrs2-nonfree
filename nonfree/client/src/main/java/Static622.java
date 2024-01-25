import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_10 = new Class129(4, 1);

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "Z")
	public static boolean aBoolean830 = true;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I[BIZ)I")
	public static int method8520(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local12 = Class149_Sub1.anIntArray229[(arg1[local14] ^ local12) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILclient!sba;)Lclient!sba;")
	public static Class302 method8522(@OriginalArg(1) Class302 arg0) {
		@Pc(6) Class302 local6 = Static75.method2137(arg0);
		if (local6 == null) {
			local6 = arg0.aClass302_16;
		}
		return local6;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!ni;Lclient!fl;I)V")
	public static void method8524(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class104 arg1) {
		Static429.aClass104_2 = arg1;
		Static582.aString104 = "";
		Static398.aClass223_86 = arg0;
		if (Class28.aString7.startsWith("win")) {
			Static582.aString104 = Static582.aString104 + "windows/";
		} else if (Class28.aString7.startsWith("linux")) {
			Static582.aString104 = Static582.aString104 + "linux/";
		} else if (Class28.aString7.startsWith("mac")) {
			Static582.aString104 = Static582.aString104 + "macos/";
		}
		if (Static429.aClass104_2.aBoolean288) {
			Static582.aString104 = Static582.aString104 + "msjava/";
		} else if (Class28.aString6.startsWith("amd64") || Class28.aString6.startsWith("x86_64")) {
			Static582.aString104 = Static582.aString104 + "x86_64/";
		} else if (Class28.aString6.startsWith("i386") || Class28.aString6.startsWith("i486") || Class28.aString6.startsWith("i586") || Class28.aString6.startsWith("x86")) {
			Static582.aString104 = Static582.aString104 + "x86/";
		} else if (Class28.aString6.startsWith("ppc")) {
			Static582.aString104 = Static582.aString104 + "ppc/";
		} else {
			Static582.aString104 = Static582.aString104 + "universal/";
		}
	}
}
