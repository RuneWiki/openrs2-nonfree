import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "I")
	private int anInt7941 = -1;

	@OriginalMember(owner = "client!rv", name = "F", descriptor = "I")
	private int anInt7942 = -1;

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "I")
	public final int anInt7943;

	@OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
	public final int anInt7938;

	@OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
	public final int anInt7946;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!ad;IIII)V")
	public Class11_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt7943 = arg3;
		this.anInt7938 = arg2;
		this.anInt7946 = arg4;
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glTexImage3Dub(super.anInt8884, 0, super.anInt8889, this.anInt7938, this.anInt7943, this.anInt7946, 0, Static212.method3886(super.anInt8889), 5121, null, 0);
		this.method7303(true);
	}

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!ad;IIII[BI)V")
	public Class11_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt7943 = arg3;
		this.anInt7946 = arg4;
		this.anInt7938 = arg2;
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8884, 0, super.anInt8889, this.anInt7938, this.anInt7943, this.anInt7946, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7303(true);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIBII)V")
	public void method6570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8884, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	@Override
	public void method7295() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt7942, this.anInt7941, super.anInt8884, 0, 0, 0);
		this.anInt7942 = -1;
		this.anInt7941 = -1;
	}
}
