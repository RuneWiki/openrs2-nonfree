import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
	public static int anInt486 = 0;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)V")
	public static void method400(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static555.aBooleanArray42[arg0]) {
			Static400.aClass251_134.method5844(arg0);
			Static375.aClass97ArrayArray1[arg0] = null;
			Static538.aClass97ArrayArray2[arg0] = null;
			Static555.aBooleanArray42[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Z")
	public static boolean method401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static303.aByteArrayArrayArray13[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method402(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(20) char local20 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local20) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local20) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg0.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(81) char local81;
			if (local20 == '\u0000') {
				local81 = arg2.charAt(local15++);
			} else {
				local81 = local20;
			}
			local17 = Static492.method6800(local62);
			local20 = Static492.method6800(local81);
			local62 = Static428.method6253(local62, arg1);
			local81 = Static428.method6253(local81, arg1);
			if (local81 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local81)) {
				local62 = Character.toLowerCase(local62);
				local81 = Character.toLowerCase(local81);
				if (local62 != local81) {
					return Static227.method3329(arg1, local62) - Static227.method3329(arg1, local81);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg1 == 2) {
				local13 = local8 - local143 - 1;
				local15 = local11 - local143 - 1;
			} else {
				local15 = local143;
				local13 = local143;
			}
			@Pc(171) char local171 = arg0.charAt(local13);
			@Pc(175) char local175 = arg2.charAt(local15);
			if (local171 != local175 && Character.toUpperCase(local171) != Character.toUpperCase(local175)) {
				local171 = Character.toLowerCase(local171);
				local175 = Character.toLowerCase(local175);
				if (local175 != local171) {
					return Static227.method3329(arg1, local171) - Static227.method3329(arg1, local175);
				}
			}
		}
		@Pc(220) int local220 = local8 - local11;
		if (local220 != 0) {
			return local220;
		}
		for (@Pc(229) int local229 = 0; local229 < local141; local229++) {
			@Pc(235) char local235 = arg0.charAt(local229);
			@Pc(239) char local239 = arg2.charAt(local229);
			if (local239 != local235) {
				return Static227.method3329(arg1, local235) - Static227.method3329(arg1, local239);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!dn;")
	public static Class71 method403(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class71_Sub1(arg0, 5000);
	}
}
