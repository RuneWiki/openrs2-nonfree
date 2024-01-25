import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!br", name = "D", descriptor = "I")
	private final int anInt1064;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!us;II[BI)V")
	public Class34_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1064 = arg2;
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5770, 0, super.anInt5764, this.anInt1064, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4974(true);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)V")
	public void method822() {
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glTexParameteri(super.anInt5770, 10242, 33071);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	@Override
	public void method4969() {
	}
}
