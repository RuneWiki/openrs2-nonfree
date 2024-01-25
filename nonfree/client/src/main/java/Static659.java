import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
	public static int anInt10729;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_215 = new Class156(123, 1);

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
	public static int anInt10733 = 0;

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)V")
	public static void method9057() {
		@Pc(7) Class223 local7 = null;
		try {
			@Pc(13) Class361 local13 = Static681.aClass349_6.method7731("2");
			while (local13.anInt9720 == 0) {
				Static620.method7045(0xFFFFFFFE ^ 0x2, 1L);
			}
			if (local13.anInt9720 == 1) {
				local7 = (Class223) local13.anObject20;
				@Pc(48) byte[] local48 = new byte[(int) local7.method5090()];
				@Pc(63) int local63;
				for (@Pc(50) int local50 = 0; local50 < local48.length; local50 += local63) {
					local63 = local7.method5087(local50, local48.length - local50, local48);
					if (local63 == -1) {
						throw new IOException("EOF");
					}
				}
				Static646.method8927(new Class5_Sub36(local48));
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local7 != null) {
				local7.method5092();
			}
		} catch (@Pc(97) Exception local97) {
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Z")
	public static boolean method9060() {
		try {
			@Pc(12) Class147 local12 = new Class147();
			@Pc(17) byte[] local17 = local12.method3398(Static670.aByteArray68);
			Static671.method9118(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}
}
