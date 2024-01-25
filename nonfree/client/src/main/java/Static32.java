import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
	public static int anInt11014;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_23 = new Class382(0, 2, 2, 1);

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray50 = new String[100];

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "Z")
	public static boolean aBoolean770 = false;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)V")
	public static void method9346() {
		@Pc(5) Class345 local5 = null;
		try {
			local5 = Static251.method4243("2");
			@Pc(20) Class14_Sub21 local20 = new Class14_Sub21(Static15.anInt213 * 6 + 3);
			local20.method7747(1);
			local20.method7751(Static15.anInt213);
			for (@Pc(30) int local30 = 0; local30 < Static184.anIntArray401.length; local30++) {
				if (Static195.aBooleanArray6[local30]) {
					local20.method7751(local30);
					local20.method7730(Static184.anIntArray401[local30]);
				}
			}
			local5.method8257(local20.aByteArray99, 0, local20.anInt8936);
		} catch (@Pc(71) Exception local71) {
		}
		try {
			if (local5 != null) {
				local5.method8253();
			}
		} catch (@Pc(78) Exception local78) {
		}
		Static3.aLong5 = Static26.method382();
		Static610.aBoolean693 = false;
	}
}
