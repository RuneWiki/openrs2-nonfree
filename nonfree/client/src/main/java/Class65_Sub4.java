import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class65_Sub4 extends Class65 {

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
	private final int anInt5270;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!bo;II[BI)V")
	public Class65_Sub4(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5270 = arg2;
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5266, 0, super.anInt5260, this.anInt5270, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4263(true);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZ)V")
	public void method4268() {
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glTexParameteri(super.anInt5266, 10242, 33071);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	@Override
	public void method4255() {
	}
}
