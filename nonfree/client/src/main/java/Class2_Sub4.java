import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
	private int anInt8330 = -1;

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
	private int anInt8334 = -1;

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
	public final int anInt8331;

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
	public final int anInt8332;

	@OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
	public final int anInt8337;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!ac;IIII[BI)V")
	public Class2_Sub4(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt8331 = arg4;
		this.anInt8332 = arg2;
		this.anInt8337 = arg3;
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8317, 0, super.anInt8326, this.anInt8332, this.anInt8337, this.anInt8331, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6976(true);
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!ac;IIII)V")
	public Class2_Sub4(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt8332 = arg2;
		this.anInt8331 = arg4;
		this.anInt8337 = arg3;
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glTexImage3Dub(super.anInt8317, 0, super.anInt8326, this.anInt8332, this.anInt8337, this.anInt8331, 0, Static266.method4780(super.anInt8326), 5121, (byte[]) null, 0);
		this.method6976(true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
	public void method6982(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8317, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	@Override
	public void method6971() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt8334, this.anInt8330, super.anInt8317, 0, 0, 0);
		this.anInt8334 = -1;
		this.anInt8330 = -1;
	}
}
