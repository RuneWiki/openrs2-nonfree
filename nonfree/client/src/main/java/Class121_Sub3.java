import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class121_Sub3 extends Class121 {

	@OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
	private final int anInt8389;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!eq;II[BI)V")
	public Class121_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt8389 = arg2;
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt8871, 0, super.anInt8883, this.anInt8389, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7326(true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZB)V")
	public void method6932() {
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glTexParameteri(super.anInt8871, 10242, 33071);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7320() {
	}
}
