import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!tt", name = "P", descriptor = "Lclient!daa;")
	public static Class58 aClass58_13;

	@OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
	public static final int anInt8233 = 1337;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIILclient!om;)Lclient!nda;")
	public static Class226 method6916(@OriginalArg(0) int arg0, @OriginalArg(3) Class246 arg1) {
		@Pc(14) byte[] local14 = arg1.method5653(arg0, 0);
		return local14 == null ? null : new Class226(local14);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([III[ILclient!cf;B)Lclient!po;")
	public static Class146_Sub2 method6917(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class43_Sub1 arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg4.method4180(Static461.aClass292_14, Static563.aClass93_13)) {
			@Pc(65) int[] local65 = new int[arg1 * arg2];
			for (local23 = 0; local23 < arg2; local23++) {
				local33 = local23 * arg1 + arg0[local23];
				for (local35 = 0; local35 < arg3[local23]; local35++) {
					local65[local33++] = -16777216;
				}
			}
			return new Class146_Sub2(arg4, arg1, arg2, local65);
		}
		@Pc(21) byte[] local21 = new byte[arg2 * arg1];
		for (local23 = 0; local23 < arg2; local23++) {
			local33 = arg1 * local23 + arg0[local23];
			for (local35 = 0; local35 < arg3[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class146_Sub2(arg4, arg1, arg2, local21);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!n;BLclient!om;)V")
	public static void method6918(@OriginalArg(0) Class221 arg0, @OriginalArg(2) Class246 arg1) {
		Static281.aClass246_130 = arg1;
		Static419.aClass221_11 = arg0;
		Static405.aString99 = "";
		if (Class141.aString54.startsWith("win")) {
			Static405.aString99 = Static405.aString99 + "windows/";
		} else if (Class141.aString54.startsWith("linux")) {
			Static405.aString99 = Static405.aString99 + "linux/";
		} else if (Class141.aString54.startsWith("mac")) {
			Static405.aString99 = Static405.aString99 + "macos/";
		}
		if (Static419.aClass221_11.aBoolean483) {
			Static405.aString99 = Static405.aString99 + "msjava/";
		} else if (Class141.aString53.startsWith("amd64") || Class141.aString53.startsWith("x86_64")) {
			Static405.aString99 = Static405.aString99 + "x86_64/";
		} else if (Class141.aString53.startsWith("i386") || Class141.aString53.startsWith("i486") || Class141.aString53.startsWith("i586") || Class141.aString53.startsWith("x86")) {
			Static405.aString99 = Static405.aString99 + "x86/";
		} else if (Class141.aString53.startsWith("ppc")) {
			Static405.aString99 = Static405.aString99 + "ppc/";
		} else {
			Static405.aString99 = Static405.aString99 + "universal/";
		}
	}
}
