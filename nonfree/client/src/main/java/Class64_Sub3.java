import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public final class Class64_Sub3 extends Class64 {

	@OriginalMember(owner = "client!iia", name = "w", descriptor = "I")
	private final int anInt4215;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!uja;II[BI)V")
	public Class64_Sub3(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt4215 = arg2;
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt4996, 0, super.anInt4992, this.anInt4215, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4540(true);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	@Override
	public void method4536() {
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(ZI)V")
	public void method3819() {
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glTexParameteri(super.anInt4996, 10242, 33071);
	}
}
