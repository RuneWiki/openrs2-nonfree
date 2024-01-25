import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	private final int anInt7259;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!lf;II[BI)V")
	public Class10_Sub4(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt7259 = arg2;
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7252, 0, super.anInt7248, this.anInt7259, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6097(true);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZ)V")
	public void method6103() {
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glTexParameteri(super.anInt7252, 10242, 33071);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	@Override
	public void method6091() {
	}
}
