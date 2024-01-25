import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt6877;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static void method6101() {
		@Pc(7) Class320 local7 = null;
		try {
			@Pc(13) Class380 local13 = Static651.aClass122_38.method3356("2");
			while (local13.anInt10067 == 0) {
				Static255.method4444(1L);
			}
			if (local13.anInt10067 == 1) {
				local7 = (Class320) local13.anObject25;
				@Pc(41) byte[] local41 = new byte[(int) local7.method7686()];
				@Pc(58) int local58;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local58) {
					local58 = local7.method7695(local41.length - local43, local41, local43);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static432.method6595(new Class6_Sub15(local41));
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local7 != null) {
				local7.method7693();
			}
		} catch (@Pc(97) Exception local97) {
		}
	}
}
