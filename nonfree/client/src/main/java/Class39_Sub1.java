import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!bja", name = "D", descriptor = "I")
	private int anInt1313 = -1;

	@OriginalMember(owner = "client!bja", name = "F", descriptor = "I")
	private int anInt1314 = -1;

	@OriginalMember(owner = "client!bja", name = "B", descriptor = "I")
	public final int anInt1312;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!hk;IIZ[[I)V")
	public Class39_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt1312 = arg2;
		super.aClass16_Sub2_39.method3620(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static188.method3033(arg4[local30], arg2, arg2, local30 + 34069, super.anInt9934, super.aClass16_Sub2_39.anInt4403);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9934, arg2, arg2, 0, 32993, super.aClass16_Sub2_39.anInt4403, arg4[local30], 0);
			}
		}
		this.method8465(true);
	}

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!hk;II)V")
	public Class39_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt1312 = arg2;
		super.aClass16_Sub2_39.method3620(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9934, arg2, arg2, 0, Static512.method7238(super.anInt9934), 5121, (byte[]) null, 0);
		}
		this.method8465(true);
	}

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!hk;IIZ[[BI)V")
	public Class39_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt1312 = arg2;
		super.aClass16_Sub2_39.method3620(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9934, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method8465(true);
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
	@Override
	public void method8457() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1313, this.anInt1314, 3553, 0, 0);
		this.anInt1313 = -1;
		this.anInt1314 = -1;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIIII)V")
	public void method1305(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt9939, 0);
		this.anInt1314 = arg2;
		this.anInt1313 = arg1;
	}
}
