import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	private final int anInt3936;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!pg;II[BI)V")
	public Class20_Sub4(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3936 = arg2;
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt3919, 0, super.anInt3921, this.anInt3936, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method3113(true);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BZ)V")
	public void method3115() {
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glTexParameteri(super.anInt3919, 10242, 33071);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	@Override
	public void method4531() {
	}
}
