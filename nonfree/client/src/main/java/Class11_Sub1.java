import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
	private final int anInt436;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!ji;II[BI)V")
	public Class11_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt436 = arg2;
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9053, 0, super.anInt9048, this.anInt436, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7412(true);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	@Override
	public void method8310() {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)V")
	public void method425() {
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glTexParameteri(super.anInt9053, 10242, 33071);
	}
}
