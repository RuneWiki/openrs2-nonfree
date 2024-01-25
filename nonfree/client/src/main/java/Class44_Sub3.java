import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
	private int anInt7139 = -1;

	@OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
	private int anInt7135 = -1;

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
	public final int anInt7138;

	@OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
	public final int anInt7134;

	@OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
	public final int anInt7133;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!ml;IIII)V")
	public Class44_Sub3(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt7138 = arg3;
		this.anInt7134 = arg2;
		this.anInt7133 = arg4;
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glTexImage3Dub(super.anInt10474, 0, super.anInt10483, this.anInt7134, this.anInt7138, this.anInt7133, 0, Static2.method19(super.anInt10483), 5121, (byte[]) null, 0);
		this.method9007(true);
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!ml;IIII[BI)V")
	public Class44_Sub3(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt7138 = arg3;
		this.anInt7133 = arg4;
		this.anInt7134 = arg2;
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10474, 0, super.anInt10483, this.anInt7134, this.anInt7138, this.anInt7133, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9007(true);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	@Override
	public void method9004() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt7135, this.anInt7139, super.anInt10474, 0, 0, 0);
		this.anInt7135 = -1;
		this.anInt7139 = -1;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIBIIII)V")
	public void method6272(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glCopyTexSubImage3D(super.anInt10474, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}
}
