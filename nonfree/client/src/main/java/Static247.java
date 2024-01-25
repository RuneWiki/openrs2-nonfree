import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	public static int anInt3838;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	public static int anInt3836 = -1;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Lclient!caa;")
	public static final Class52 aClass52_1 = new Class52(true);

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
	public static void method3456() {
		if (!Static157.aBoolean264) {
			Static357.aFloat91 += (-12.0F - Static357.aFloat91) / 2.0F;
			Static157.aBoolean264 = true;
			Static176.aBoolean298 = true;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)Lclient!gl;")
	public static Class2_Sub30 method3457() {
		@Pc(7) Class268 local7 = null;
		@Pc(13) Class2_Sub30 local13 = new Class2_Sub30(Static249.aClass150_6, 0);
		try {
			@Pc(27) Class163 local27 = Static135.aClass389_2.method9277("");
			while (local27.anInt3843 == 0) {
				Static570.method7907(1L);
			}
			if (local27.anInt3843 == 1) {
				local7 = (Class268) local27.anObject5;
				@Pc(56) byte[] local56 = new byte[(int) local7.method6514()];
				@Pc(71) int local71;
				for (@Pc(58) int local58 = 0; local58 < local56.length; local58 += local71) {
					local71 = local7.method6508(local56, local56.length - local58, local58);
					if (local71 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class2_Sub30(new Class2_Sub20(local56), Static249.aClass150_6, 0);
			}
		} catch (@Pc(106) Exception local106) {
		}
		try {
			if (local7 != null) {
				local7.method6511();
			}
		} catch (@Pc(113) Exception local113) {
		}
		return local13;
	}
}
