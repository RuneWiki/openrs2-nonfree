import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!hw", name = "A", descriptor = "I")
	public static int anInt3650 = -2;

	@OriginalMember(owner = "client!hw", name = "F", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_53 = new Class242(38, 7);

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
	public static void method2855() {
		if (Static289.anInt4838 != 3) {
			Static440.aClass112_6 = Static61.aClass112_11;
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(III)Lclient!na;")
	public static Class11_Sub2 method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass11_Sub2_2 == null ? null : local7.aClass11_Sub2_2;
	}
}
