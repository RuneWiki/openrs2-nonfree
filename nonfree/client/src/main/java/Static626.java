import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!wh;")
	public static Class392 aClass392_8 = new Class392(5, 1);

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_19 = new Class226(10, 19);

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable15 = new Hashtable();

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lclient!es;")
	public static Class5_Sub19 method8558() {
		@Pc(7) Class223 local7 = null;
		@Pc(13) Class5_Sub19 local13 = new Class5_Sub19(Static536.aClass290_6, 0);
		try {
			@Pc(19) Class361 local19 = Static681.aClass349_6.method7731("");
			while (local19.anInt9720 == 0) {
				Static620.method7045(0xFFFFD0DB ^ 0x2F27, 1L);
			}
			if (-12069 != -12069) {
				aClass392_8 = null;
			}
			if (local19.anInt9720 == 1) {
				local7 = (Class223) local19.anObject20;
				@Pc(61) byte[] local61 = new byte[(int) local7.method5090()];
				@Pc(76) int local76;
				for (@Pc(63) int local63 = 0; local63 < local61.length; local63 += local76) {
					local76 = local7.method5087(local63, local61.length - local63, local61);
					if (local76 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class5_Sub19(new Class5_Sub36(local61), Static536.aClass290_6, 0);
			}
		} catch (@Pc(107) Exception local107) {
		}
		try {
			if (local7 != null) {
				local7.method5092();
			}
		} catch (@Pc(114) Exception local114) {
		}
		return local13;
	}
}
