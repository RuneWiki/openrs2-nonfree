import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "Lclient!tq;")
	public static final Class305 aClass305_36 = new Class305(64);

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "Lclient!dj;")
	public static final Class71 aClass71_4 = new Class71();

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "Z")
	public static boolean aBoolean678 = false;

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "[I")
	public static final int[] anIntArray794 = new int[4096];

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method7533(@OriginalArg(0) int[] arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer();
		@Pc(19) int local19 = Static542.anInt9307;
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(30) Class80 local30 = Static72.aClass165_1.method4282(arg0[local21]);
			if (local30.anInt2439 != -1) {
				@Pc(43) Class66 local43 = (Class66) Static6.aClass245_7.method6082((long) local30.anInt2439);
				if (local43 == null) {
					@Pc(51) Class1 local51 = Static583.method55(Static132.aClass168_118, local30.anInt2439, 0);
					if (local51 != null) {
						local43 = Static323.aClass9_8.method5412(local51);
						Static6.aClass245_7.method6075(local43, (long) local30.anInt2439);
					}
				}
				if (local43 != null) {
					Static451.aClass66Array11[local19] = local43;
					local17.append(" <img=").append(local19).append(">");
					local19++;
				}
			}
		}
		return local17.toString();
	}
}
