import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	private int anInt3465 = -1;

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
	private int anInt3469 = -1;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	public final int anInt3470;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
	public final int anInt3462;

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
	public final int anInt3468;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!rda;IIII[BI)V")
	public Class24_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt3470 = arg4;
		this.anInt3462 = arg2;
		this.anInt3468 = arg3;
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7702, 0, super.anInt7714, this.anInt3462, this.anInt3468, this.anInt3470, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6783(true);
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!rda;IIII)V")
	public Class24_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt3468 = arg3;
		this.anInt3470 = arg4;
		this.anInt3462 = arg2;
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glTexImage3Dub(super.anInt7702, 0, super.anInt7714, this.anInt3462, this.anInt3468, this.anInt3470, 0, Static274.method8783(super.anInt7714), 5121, (byte[]) null, 0);
		this.method6783(true);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIII)V")
	public void method3064(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2) {
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7702, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	@Override
	public void method6776() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3465, this.anInt3469, super.anInt7702, 0, 0, 0);
		this.anInt3465 = -1;
		this.anInt3469 = -1;
	}
}
