import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public final class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
	private final int anInt3364;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!ep;II[BI)V")
	public Class65_Sub3(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3364 = arg2;
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8058, 0, super.anInt8057, this.anInt3364, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6836(true);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(IZ)V")
	public void method2821() {
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glTexParameteri(super.anInt8058, 10242, 33071);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	@Override
	public void method6824() {
	}
}
