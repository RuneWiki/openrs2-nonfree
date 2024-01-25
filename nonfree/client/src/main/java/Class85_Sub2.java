import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
	private int anInt4452 = -1;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	private int anInt4454 = -1;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	public final int anInt4450;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
	public final int anInt4449;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
	public final int anInt4455;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!qo;IIII[BI)V")
	public Class85_Sub2(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4450 = arg2;
		this.anInt4449 = arg4;
		this.anInt4455 = arg3;
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10892, 0, super.anInt10899, this.anInt4450, this.anInt4455, this.anInt4449, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9102(true);
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!qo;IIII)V")
	public Class85_Sub2(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt4450 = arg2;
		this.anInt4455 = arg3;
		this.anInt4449 = arg4;
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glTexImage3Dub(super.anInt10892, 0, super.anInt10899, this.anInt4450, this.anInt4455, this.anInt4449, 0, Static206.method4083(super.anInt10899), 5121, null, 0);
		this.method9102(true);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V")
	public void method3894(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glCopyTexSubImage3D(super.anInt10892, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	@Override
	public void method9094() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt4454, this.anInt4452, super.anInt10892, 0, 0, 0);
		this.anInt4452 = -1;
		this.anInt4454 = -1;
	}
}
