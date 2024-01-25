import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
	public static int anInt7265;

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
	public static int anInt7270;

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "Lclient!om;")
	public static Class246 aClass246_205;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
	public static int anInt7278;

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "Lclient!md;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "Z")
	public static final boolean aBoolean571 = false;

	@OriginalMember(owner = "client!qq", name = "T", descriptor = "Z")
	public static boolean aBoolean572 = false;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!us;I[I[IIZ)Lclient!wg;")
	public static Class146_Sub3 method6177(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg4];
		for (@Pc(17) int local17 = 0; local17 < arg4; local17++) {
			@Pc(27) int local27 = arg3[local17] + arg1 * local17;
			for (@Pc(29) int local29 = 0; local29 < arg2[local17]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class146_Sub3(arg0, arg1, arg4, local10);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!om;IZIII)V")
	public static void method6178(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		Static135.method2613(arg1, arg0, 0L, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)V")
	public static void method6180() {
		if (Static4.aClass43_1.method7161()) {
			Static4.aClass43_1.method7183(Static347.aCanvas9);
			Static429.method6077();
			Static4.aClass43_1.method7199(Static347.aCanvas9);
			Static4.aClass43_1.method7163(Static347.aCanvas9);
		} else {
			Static137.method2648(Static260.anInt4932);
		}
		Static121.method2508();
	}
}
