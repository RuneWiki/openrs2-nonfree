import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static205 {

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!rs;")
	public static Class220 aClass220_3;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_82 = new Class265(19, -2);

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZILclient!ef;IB[BII)Lclient!tq;")
	public static Class55_Sub3_Sub1 method3256(@OriginalArg(1) int arg0, @OriginalArg(2) Class49_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg1.aBoolean132 || Static54.method895(arg2) && Static54.method895(arg0)) {
			return new Class55_Sub3_Sub1(arg1, 3553, 6406, arg2, arg0, false, arg3, 6406);
		} else if (arg1.aBoolean126) {
			return new Class55_Sub3_Sub1(arg1, 34037, 6406, arg2, arg0, false, arg3, 6406);
		} else {
			return new Class55_Sub3_Sub1(arg1, 6406, arg2, arg0, Static51.method863(arg2), Static51.method863(arg0), arg3, 6406);
		}
	}
}
