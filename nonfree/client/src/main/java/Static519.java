import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "Lclient!kr;")
	public static Class168 aClass168_3;

	@OriginalMember(owner = "client!vq", name = "P", descriptor = "Lclient!lt;")
	public static Class185 aClass185_7;

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "[I")
	public static final int[] anIntArray760 = new int[50];

	@OriginalMember(owner = "client!vq", name = "O", descriptor = "Z")
	public static boolean aBoolean611 = false;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public static void method7411() {
		@Pc(5) Class116 local5 = null;
		try {
			@Pc(11) Class243 local11 = Static91.aClass182_2.method4814("2", true);
			while (local11.anInt6905 == 0) {
				Static505.method7295(1L);
			}
			if (local11.anInt6905 == 1) {
				local5 = (Class116) local11.anObject12;
				@Pc(34) byte[] local34 = new byte[(int) local5.method3372()];
				@Pc(48) int local48;
				for (@Pc(36) int local36 = 0; local36 < local34.length; local36 += local48) {
					local48 = local5.method3369(local34.length - local36, local36, local34);
					if (local48 == -1) {
						throw new IOException("EOF");
					}
				}
				Static331.method5391(new Class1_Sub13(local34));
			}
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local5 != null) {
				local5.method3371();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}
}
