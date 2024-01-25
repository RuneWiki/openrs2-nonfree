import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
	private final int anInt105;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!kd;II[BI)V")
	public Class3_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt105 = arg2;
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt4987, 0, super.anInt4993, this.anInt105, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4146(true);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
	public void method92() {
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glTexParameteri(super.anInt4987, 10242, 33071);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	@Override
	public void method4145() {
	}
}
