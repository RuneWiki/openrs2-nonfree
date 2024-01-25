import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!afa", name = "A", descriptor = "I")
	private final int anInt183;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!bi;II[BI)V")
	public Class10_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt183 = arg2;
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8418, 0, super.anInt8428, this.anInt183, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7260(true);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	@Override
	public void method7251() {
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)V")
	public void method144() {
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glTexParameteri(super.anInt8418, 10242, 33071);
	}
}
