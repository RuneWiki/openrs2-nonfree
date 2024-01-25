import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class245_Sub4 extends Class245 {

	@OriginalMember(owner = "client!uda", name = "y", descriptor = "I")
	private final int anInt10374;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!gia;II[BI)V")
	public Class245_Sub4(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt10374 = arg2;
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt10362, 0, super.anInt10366, this.anInt10374, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8672(true);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZZ)V")
	public void method8686() {
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glTexParameteri(super.anInt10362, 10242, 33071);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
	@Override
	public void method8671() {
	}
}
