import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!oja", name = "x", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!oja", name = "J", descriptor = "I")
	public static int anInt7365 = -1;

	@OriginalMember(owner = "client!oja", name = "A", descriptor = "Lclient!ug;")
	public static final Class372 aClass372_3 = new Class372();

	@OriginalMember(owner = "client!oja", name = "v", descriptor = "I")
	public static int anInt7366 = -2;

	@OriginalMember(owner = "client!oja", name = "c", descriptor = "(B)V")
	public static void method6367() {
		@Pc(7) Class288 local7 = null;
		try {
			@Pc(13) Class338 local13 = Static122.aClass47_1.method1391("2");
			while (local13.anInt8934 == 0) {
				Static550.method7219(1L);
			}
			if (local13.anInt8934 == 1) {
				local7 = (Class288) local13.anObject16;
				@Pc(41) byte[] local41 = new byte[(int) local7.method6776()];
				@Pc(58) int local58;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local58) {
					local58 = local7.method6778(local41.length - local43, local41, local43);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static92.method1939(new Class3_Sub2(local41));
			}
		} catch (@Pc(94) Exception local94) {
		}
		try {
			if (local7 != null) {
				local7.method6780();
			}
		} catch (@Pc(101) Exception local101) {
		}
	}
}
