import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!no", name = "o", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Z")
	public static boolean aBoolean598 = false;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "I")
	public static int anInt7087 = 0;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_71 = new Class230(66, 2);

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5891(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static272.method4722(Static490.method7465(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V")
	public static void method5892() {
		for (@Pc(5) int local5 = 0; local5 < Static198.aClass167ArrayArray1.length; local5++) {
			for (@Pc(8) int local8 = 0; local8 < Static198.aClass167ArrayArray1[local5].length; local8++) {
				Static198.aClass167ArrayArray1[local5][local8] = Static305.aClass167_6;
			}
		}
	}
}
