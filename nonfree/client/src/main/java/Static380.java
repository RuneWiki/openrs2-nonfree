import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Lclient!jj;")
	public static final Class169 aClass169_1 = new Class169();

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZIII)V")
	public static void method5474(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
		@Pc(28) Class3_Sub24 local28 = (Class3_Sub24) Static36.aClass83_2.method2368(local14);
		if (local28 == null) {
			local28 = new Class3_Sub24();
			Static36.aClass83_2.method2377(local14, local28);
		}
		if (arg0 >= local28.anIntArray307.length) {
			@Pc(49) int[] local49 = new int[arg0 + 1];
			@Pc(54) int[] local54 = new int[arg0 + 1];
			for (@Pc(56) int local56 = 0; local56 < local28.anIntArray307.length; local56++) {
				local49[local56] = local28.anIntArray307[local56];
				local54[local56] = local28.anIntArray306[local56];
			}
			for (@Pc(86) int local86 = local28.anIntArray307.length; local86 < arg0; local86++) {
				local49[local86] = -1;
				local54[local86] = 0;
			}
			local28.anIntArray306 = local54;
			local28.anIntArray307 = local49;
		}
		local28.anIntArray307[arg0] = arg3;
		local28.anIntArray306[arg0] = arg4;
	}
}
