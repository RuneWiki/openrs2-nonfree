import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public static int anInt7015;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Lclient!ru;")
	public static final Class301 aClass301_2 = new Class301(false);

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!ru;")
	public static Class301 aClass301_3 = aClass301_2;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Lclient!gp;")
	public static Class3_Sub27 method6033() {
		@Pc(7) Class175 local7 = null;
		@Pc(13) Class3_Sub27 local13 = new Class3_Sub27(Static212.aClass222_2, 0);
		try {
			@Pc(19) Class304 local19 = Static205.aClass138_2.method3581("");
			while (local19.anInt8838 == 0) {
				Static258.method4293(1L);
			}
			if (local19.anInt8838 == 1) {
				local7 = (Class175) local19.anObject16;
				@Pc(43) byte[] local43 = new byte[(int) local7.method4458()];
				@Pc(60) int local60;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local60) {
					local60 = local7.method4466(local43.length - local45, local45, local43);
					if (local60 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class3_Sub27(new Class3_Sub3(local43), Static212.aClass222_2, 0);
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local7 != null) {
				local7.method4462();
			}
		} catch (@Pc(95) Exception local95) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
	public static int method6034(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)J")
	public static synchronized long method6036() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static420.aLong202 > local5) {
			Static436.aLong214 += Static420.aLong202 - local5;
		}
		Static420.aLong202 = local5;
		return local5 + Static436.aLong214;
	}
}
