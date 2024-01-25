import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
	private final int anInt2276;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!rl;II[BI)V")
	public Class19_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2276 = arg2;
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5060, 0, super.anInt5062, this.anInt2276, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4238(true);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public void method4235() {
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZB)V")
	public void method1866() {
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glTexParameteri(super.anInt5060, 10242, 33071);
	}
}
