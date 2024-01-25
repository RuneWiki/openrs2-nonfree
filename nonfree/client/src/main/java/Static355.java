import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Lclient!f;")
	public static Class73 aClass73_34;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_104 = new Class287(31, 8);

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_105 = new Class287(35, 7);

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "[I")
	public static final int[] anIntArray350 = new int[1000];

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_106 = new Class287(36, 3);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZIIIII)V")
	public static void method5095(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(20) Class3_Sub44 local20 = (Class3_Sub44) Static269.aClass297_22.method6531(local14);
		if (local20 == null) {
			local20 = new Class3_Sub44();
			Static269.aClass297_22.method6537(local14, local20);
		}
		if (local20.anIntArray446.length <= arg4) {
			@Pc(45) int[] local45 = new int[arg4 + 1];
			@Pc(50) int[] local50 = new int[arg4 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray446.length; local52++) {
				local45[local52] = local20.anIntArray446[local52];
				local50[local52] = local20.anIntArray447[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray446.length; local78 < arg4; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray447 = local50;
			local20.anIntArray446 = local45;
		}
		local20.anIntArray446[arg4] = arg1;
		local20.anIntArray447[arg4] = arg2;
	}
}
