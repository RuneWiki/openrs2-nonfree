import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "I", descriptor = "I")
	private final int anInt43;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!bv;II[BI)V")
	public Class1_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt43 = arg2;
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5564, 0, super.anInt5551, this.anInt43, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4273(true);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	@Override
	public void method4264() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BZ)V")
	public void method31() {
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glTexParameteri(super.anInt5564, 10242, 33071);
	}
}
