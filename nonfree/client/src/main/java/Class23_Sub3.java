import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
	private final int anInt3773;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!qj;II[BI)V")
	public Class23_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3773 = arg2;
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9352, 0, super.anInt9354, this.anInt3773, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7783(true);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	@Override
	public void method7774() {
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZ)V")
	public void method3118() {
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glTexParameteri(super.anInt9352, 10242, 33071);
	}
}
