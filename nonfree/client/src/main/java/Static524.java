import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_135 = new Class45("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
	public static int anInt9252 = 0;

	@OriginalMember(owner = "client!wb", name = "Mb", descriptor = "Z")
	public static boolean aBoolean694 = true;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8000(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBIIIIII)V")
	public static void method8019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static538.method8167(arg4, arg2, arg3, arg5, arg1, 0, arg0);
	}
}
