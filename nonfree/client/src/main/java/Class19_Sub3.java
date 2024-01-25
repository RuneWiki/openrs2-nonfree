import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
	private final int anInt5568;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!os;II[BI)V")
	public Class19_Sub3(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5568 = arg2;
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt5629, 0, super.anInt5628, this.anInt5568, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4799(true);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(ZI)V")
	public void method4762() {
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glTexParameteri(super.anInt5629, 10242, 33071);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	@Override
	public void method4798() {
	}
}
