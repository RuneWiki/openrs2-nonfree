import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!eaa", name = "A", descriptor = "I")
	private final int anInt2438;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!gi;II[BI)V")
	public Class79_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2438 = arg2;
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6293, 0, super.anInt6298, this.anInt2438, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5278(true);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(ZZ)V")
	public void method2199() {
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glTexParameteri(super.anInt6293, 10242, 33071);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
	@Override
	public void method5270() {
	}
}
