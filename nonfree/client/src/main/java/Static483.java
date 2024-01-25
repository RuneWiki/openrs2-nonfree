import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	public static int anInt8602;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "Lclient!bh;")
	public static Class29 aClass29_8;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
	public static int anInt8591 = 0;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(II)Z")
	public static boolean method7096(@OriginalArg(0) int arg0) {
		return arg0 == 21 || arg0 == 11 || arg0 == 1011 || arg0 == 30 || arg0 == 59;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V")
	public static void method7098() {
		@Pc(11) Class150 local11 = null;
		try {
			@Pc(17) Class376 local17 = Static379.aClass228_6.method5935("2");
			while (local17.anInt10510 == 0) {
				Static500.method7308(1L);
			}
			if (local17.anInt10510 == 1) {
				local11 = (Class150) local17.anObject19;
				@Pc(41) byte[] local41 = new byte[(int) local11.method4654()];
				@Pc(56) int local56;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local56) {
					local56 = local11.method4658(local41.length - local43, local43, local41);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static63.method1343(new Class3_Sub15(local41));
			}
		} catch (@Pc(81) Exception local81) {
		}
		try {
			if (local11 != null) {
				local11.method4653();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}
}
