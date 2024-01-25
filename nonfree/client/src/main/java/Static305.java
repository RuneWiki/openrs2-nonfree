import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "Lclient!wh;")
	public static Interface9 anInterface9_6;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString226 = " from your ignore list first.";

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
	public static int anInt6000 = 0;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
	public static int anInt6003 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)V")
	public static void method5099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static288.anIntArray471[arg0] = arg1;
		@Pc(19) Class3_Sub6 local19 = (Class3_Sub6) Static98.aClass24_9.method609((long) arg0);
		if (local19 == null) {
			local19 = new Class3_Sub6(4611686018427387905L);
			Static98.aClass24_9.method598((long) arg0, local19);
		} else if (local19.aLong12 != 4611686018427387905L) {
			local19.aLong12 = Static53.method898() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V")
	public static void method5101() {
		Static346.aClass198_62.method5230();
	}
}
