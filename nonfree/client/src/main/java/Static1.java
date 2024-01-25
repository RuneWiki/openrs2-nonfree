import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_127;

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "I")
	public static int anInt9404;

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "Lclient!rr;")
	public static Class292 aClass292_16;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_67 = new Class361();

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray87 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	public static void method7670() {
		@Pc(11) Class31 local11 = null;
		try {
			@Pc(17) Class331 local17 = Static352.aClass272_2.method6125(false, "3");
			while (local17.anInt8818 == 0) {
				Static318.method4952(1L);
			}
			if (local17.anInt8818 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local11 = (Class31) local17.anObject18;
			@Pc(48) byte[] local48 = new byte[(int) local11.method1003()];
			if (local48.length == 0) {
				Static547.aString100 = "";
				Static4.aString3 = "";
			} else {
				@Pc(65) int local65;
				for (@Pc(53) int local53 = 0; local53 < local48.length; local53 += local65) {
					local65 = local11.method1004(local53, local48, local48.length - local53);
					if (local65 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(87) Class6_Sub21 local87 = new Class6_Sub21(local48);
				@Pc(91) int local91 = local87.method6069();
				if (local91 > 60) {
					throw new RuntimeException("Bad length");
				}
				local87.anInt7338 = local91 + 1;
				if (!local87.method6050()) {
					throw new RuntimeException("Invalid CRC");
				}
				local87.anInt7338 = 1;
				@Pc(120) int local120 = local87.method6069();
				if (local120 > 2) {
					throw new RuntimeException("Invalid version " + local120);
				}
				Static4.aString3 = local87.method6071();
				Static547.aString100 = local87.method6071();
				if (local120 >= 1) {
					Static175.anInt3692 = local87.method6003();
				} else {
					Static175.anInt3692 = Static488.anInt5164;
				}
				if (local120 >= 2) {
					Static91.aLong54 = local87.method6018();
				} else {
					Static91.aLong54 = Static358.aLong177;
				}
			}
		} catch (@Pc(178) Exception local178) {
			Static547.aString100 = "";
			Static4.aString3 = "";
		}
		try {
			if (local11 != null) {
				local11.method1007();
			}
		} catch (@Pc(189) Exception local189) {
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(II)Z")
	public static boolean method7675(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
