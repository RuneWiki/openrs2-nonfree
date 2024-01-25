import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
	private int anInt3181 = -1;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
	private int anInt3176 = -1;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	public final int anInt3177;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
	public final int anInt3184;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
	public final int anInt3185;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!kfa;IIII[BI)V")
	public Class3_Sub3(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt3177 = arg2;
		this.anInt3184 = arg3;
		this.anInt3185 = arg4;
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt3442, 0, super.anInt3443, this.anInt3177, this.anInt3184, this.anInt3185, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method2739(true);
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!kfa;IIII)V")
	public Class3_Sub3(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt3177 = arg2;
		this.anInt3185 = arg4;
		this.anInt3184 = arg3;
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glTexImage3Dub(super.anInt3442, 0, super.anInt3443, this.anInt3177, this.anInt3184, this.anInt3185, 0, Static246.method3937(super.anInt3443), 5121, null, 0);
		this.method2739(true);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	@Override
	public void method4191() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3176, this.anInt3181, super.anInt3442, 0, 0, 0);
		this.anInt3181 = -1;
		this.anInt3176 = -1;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBIIIIII)V")
	public void method2569(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glCopyTexSubImage3D(super.anInt3442, 0, 0, 0, arg1, 0, 0, arg2, arg0);
		OpenGL.glFlush();
	}
}
