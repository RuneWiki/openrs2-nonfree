import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class51_Sub4 extends Class51 {

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
	private final int anInt9477;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!jaa;II[BI)V")
	public Class51_Sub4(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt9477 = arg2;
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9463, 0, super.anInt9471, this.anInt9477, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7734(true);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	@Override
	public void method7726() {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V")
	public void method7739() {
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glTexParameteri(super.anInt9463, 10242, 33071);
	}
}
