import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
	private final int anInt4105;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!qg;II[BI)V")
	public Class21_Sub3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt4105 = arg2;
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt4557, 0, super.anInt4549, this.anInt4105, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method3755(true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
	@Override
	public void method3747() {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)V")
	public void method3423() {
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glTexParameteri(super.anInt4557, 10242, 33071);
	}
}
