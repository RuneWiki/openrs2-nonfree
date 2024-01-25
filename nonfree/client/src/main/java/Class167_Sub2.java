import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class167_Sub2 extends Class167 {

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
	private final int anInt5081;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!rs;II[BI)V")
	public Class167_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5081 = arg2;
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9270, 0, super.anInt9261, this.anInt5081, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8013(true);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	@Override
	public void method8000() {
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZ)V")
	public void method4571() {
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glTexParameteri(super.anInt9270, 10242, 33071);
	}
}
