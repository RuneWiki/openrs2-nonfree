import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	private final int anInt5514;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!tt;II[BI)V")
	public Class31_Sub3(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5514 = arg2;
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5787, 0, super.anInt5789, this.anInt5514, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4591(true);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(ZB)V")
	public void method4404() {
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glTexParameteri(super.anInt5787, 10242, 33071);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	@Override
	public void method4581() {
	}
}
