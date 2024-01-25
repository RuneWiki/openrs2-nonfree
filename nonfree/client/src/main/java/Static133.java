import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "Lclient!la;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "[Lclient!gw;")
	public static final Class1_Sub13[] aClass1_Sub13Array1 = new Class1_Sub13[2048];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[BIIIBI)Z")
	public static boolean method2879(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg3 % 8;
		@Pc(20) int local20;
		if (local14 == 0) {
			local20 = 0;
		} else {
			local20 = 8 - local14;
		}
		@Pc(33) int local33 = -((arg2 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg3 + 7) / 8);
		for (@Pc(44) int local44 = local33; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local20;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	public static void method2882() {
		@Pc(5) Class116 local5 = null;
		try {
			@Pc(11) Class243 local11 = Static91.aClass182_2.method4814("3", false);
			while (local11.anInt6905 == 0) {
				Static505.method7295(1L);
			}
			if (local11.anInt6905 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local5 = (Class116) local11.anObject12;
			@Pc(40) byte[] local40 = new byte[(int) local5.method3372()];
			if (local40.length == 0) {
				Static479.aString71 = "";
				Static511.aString85 = "";
			} else {
				@Pc(65) int local65;
				for (@Pc(53) int local53 = 0; local53 < local40.length; local53 += local65) {
					local65 = local5.method3369(local40.length - local53, local53, local40);
					if (local65 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(90) Class1_Sub13 local90 = new Class1_Sub13(local40);
				@Pc(94) int local94 = local90.method3043();
				if (local94 > 50) {
					throw new RuntimeException("Bad length");
				}
				local90.anInt3400 = local94 + 1;
				if (!local90.method3025()) {
					throw new RuntimeException("Invalid CRC");
				}
				local90.anInt3400 = 1;
				@Pc(125) int local125 = local90.method3043();
				if (local125 > 1) {
					throw new RuntimeException("Invalid version " + local125);
				}
				Static479.aString71 = local90.method3042();
				Static511.aString85 = local90.method3042();
				if (local125 < 1) {
					Static328.anInt6209 = Static143.anInt3316;
				} else {
					Static328.anInt6209 = local90.method3056();
				}
			}
		} catch (@Pc(163) Exception local163) {
			Static479.aString71 = "";
			Static511.aString85 = "";
		}
		try {
			if (local5 != null) {
				local5.method3371();
			}
		} catch (@Pc(174) Exception local174) {
		}
	}
}
