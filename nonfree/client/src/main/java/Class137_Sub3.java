import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class137_Sub3 extends Class137 {

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
	private final int anInt4309;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!nq;II[BI)V")
	public Class137_Sub3(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt4309 = arg2;
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7136, 0, super.anInt7134, this.anInt4309, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5783(true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
	public void method3602() {
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glTexParameteri(super.anInt7136, 10242, 33071);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5778() {
	}
}
