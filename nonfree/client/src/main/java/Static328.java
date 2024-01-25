import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
	public static int anInt5741;

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)V")
	public static void method4885() {
		@Pc(14) Class333 local14 = null;
		try {
			@Pc(20) Class201 local20 = Static310.aClass47_4.method939("");
			while (local20.anInt5729 == 0) {
				Static564.method7845(1L);
			}
			if (local20.anInt5729 == 1) {
				local14 = (Class333) local20.anObject16;
				@Pc(48) Class3_Sub28 local48 = Static713.aClass3_Sub55_31.method8890();
				local14.method7956(local48.aByteArray50, 0, local48.anInt6241);
			}
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (local14 != null) {
				local14.method7955();
			}
		} catch (@Pc(65) Exception local65) {
		}
	}
}
