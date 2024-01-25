import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	public static int anInt5019;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!ya;ZILclient!la;II)V")
	public static void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class71 arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static402.aClass143_30.method5723((Static95.anInt1971 - Static402.aClass143_30.j()) / 2, (Static34.anInt715 - Static402.aClass143_30.T()) / 2);
			Static56.aClass143_8.method5723((Static95.anInt1971 - Static56.aClass143_8.j()) / 2, 18);
		}
		@Pc(31) String local31 = "";
		if (Static337.aClass61_5 == Static444.aClass61_7) {
			local31 = Static97.aClass7_51.method331(Static341.anInt5770);
		} else if (Static337.aClass61_5 == Static147.aClass61_4) {
			local31 = Static235.aClass7_101.method331(Static341.anInt5770);
		}
		arg4.method5446(Static34.anInt715 / 2 - 26, local31, -1, arg5, Static95.anInt1971 / 2);
		@Pc(69) int local69 = Static34.anInt715 / 2 - 18;
		arg1.method4513(Static95.anInt1971 / 2 - 152, local69, 304, 34, arg0, 0);
		arg1.method4513(Static95.anInt1971 / 2 - 151, local69 + 1, 302, 32, 0, 0);
		arg1.O(Static95.anInt1971 / 2 - 150, local69 - -2, Static148.anInt2855 * 3, 30, arg3, 0);
		arg1.O(Static95.anInt1971 / 2 + Static148.anInt2855 * 3 - 150, local69 + 2, 300 - Static148.anInt2855 * 3, 30, 0, 0);
		arg4.method5446(Static34.anInt715 / 2 + 4, Static250.aString39, -1, arg5, Static95.anInt1971 / 2);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!uq;B)Ljava/lang/String;")
	public static String method4171(@OriginalArg(0) Class251 arg0) {
		if (Static57.method1248(arg0).method1731() == 0) {
			return null;
		} else if (arg0.aString65 == null || arg0.aString65.trim().length() == 0) {
			return Static313.aBoolean387 ? "Hidden-use" : null;
		} else {
			return arg0.aString65;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	public static void method4172() {
		@Pc(5) Class222 local5 = null;
		try {
			@Pc(11) Class9 local11 = Static77.aClass180_1.method4083("2", true);
			while (local11.anInt368 == 0) {
				Static224.method3441(1L);
			}
			if (local11.anInt368 == 1) {
				local5 = (Class222) local11.anObject2;
				@Pc(34) byte[] local34 = new byte[(int) local5.method4984()];
				@Pc(48) int local48;
				for (@Pc(36) int local36 = 0; local36 < local34.length; local36 += local48) {
					local48 = local5.method4983(local36, local34, local34.length - local36);
					if (local48 == -1) {
						throw new IOException("EOF");
					}
				}
				Static201.method3260(new Class1_Sub5(local34));
			}
		} catch (@Pc(81) Exception local81) {
		}
		try {
			if (local5 != null) {
				local5.method4988();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}
}
