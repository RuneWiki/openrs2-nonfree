import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	private final int anInt5471;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!jj;II[BI)V")
	public Class4_Sub3(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5471 = arg2;
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt6708, 0, super.anInt6703, this.anInt5471, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5502(true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZ)V")
	public void method4571() {
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glTexParameteri(super.anInt6708, 10242, 33071);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	public void method5490() {
	}
}
