import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
	public static int anInt6629;

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "Lclient!uv;")
	public static Class253 aClass253_149;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_134 = new Class55(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
	public static int anInt6626 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIB)I")
	public static int method5226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static81.anIntArray110[arg0 & 0x3] : Static87.anIntArray113[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(FFBFI)F")
	public static float method5227(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(15) float[] local15 = Static168.aFloatArrayArray4[arg3];
		return local15[2] * arg1 + local15[1] * arg0 + local15[0] * arg2;
	}
}
