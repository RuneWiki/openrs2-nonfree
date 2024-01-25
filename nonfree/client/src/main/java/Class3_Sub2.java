import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
	private final int anInt897;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!uca;II[BI)V")
	public Class3_Sub2(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt897 = arg2;
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6726, 0, super.anInt6725, this.anInt897, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5571(true);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
	@Override
	public void method5566() {
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IZ)V")
	public void method856() {
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glTexParameteri(super.anInt6726, 10242, 33071);
	}
}
