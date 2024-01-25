import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class66_Sub3 extends Class66 {

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
	private final int anInt8197;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!qfa;II[BI)V")
	public Class66_Sub3(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt8197 = arg2;
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8223, 0, super.anInt8228, this.anInt8197, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6848(true);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(IZ)V")
	public void method6831() {
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glTexParameteri(super.anInt8223, 10242, 33071);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	@Override
	public void method6844() {
	}
}
