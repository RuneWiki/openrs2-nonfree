import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class114_Sub4 extends Class114 {

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	private final int anInt5548;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!no;II[BI)V")
	public Class114_Sub4(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5548 = arg2;
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5902, 0, super.anInt5900, this.anInt5548, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4999(true);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	@Override
	public void method4996() {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZB)V")
	public void method4704() {
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glTexParameteri(super.anInt5902, 10242, 33071);
	}
}
