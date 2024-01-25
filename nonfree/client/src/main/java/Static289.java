import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kha", name = "F", descriptor = "I")
	public static int anInt5726;

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V")
	public static void method5031() {
		@Pc(7) Class171 local7 = null;
		try {
			@Pc(13) Class328 local13 = Static529.aClass112_6.method3241("");
			while (local13.anInt9389 == 0) {
				Static179.method3254(1L);
			}
			if (local13.anInt9389 == 1) {
				local7 = (Class171) local13.anObject21;
				@Pc(43) Class6_Sub40 local43 = Static348.aClass6_Sub22_19.method3529();
				local7.method4937(local43.aByteArray113, 0, local43.anInt10169);
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			if (local7 != null) {
				local7.method4934();
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IBI)Z")
	public static boolean method5032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
