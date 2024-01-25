import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class77_Sub3 extends Class77 {

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
	private final int anInt8016;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!kga;II[BI)V")
	public Class77_Sub3(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt8016 = arg2;
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8662, 0, super.anInt8673, this.anInt8016, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7076(true);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BZ)V")
	public void method6673() {
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glTexParameteri(super.anInt8662, 10242, 33071);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	@Override
	public void method7064() {
	}
}
