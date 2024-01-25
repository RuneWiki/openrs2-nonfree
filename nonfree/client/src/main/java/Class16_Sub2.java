import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	private int anInt7793 = -1;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
	private int anInt7797 = -1;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	public final int anInt7795;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public final int anInt7796;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
	public final int anInt7798;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!en;IIII[BI)V")
	public Class16_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt7795 = arg4;
		this.anInt7796 = arg2;
		this.anInt7798 = arg3;
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9862, 0, super.anInt9852, this.anInt7796, this.anInt7798, this.anInt7795, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7843(true);
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!en;IIII)V")
	public Class16_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt7796 = arg2;
		this.anInt7798 = arg3;
		this.anInt7795 = arg4;
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glTexImage3Dub(super.anInt9862, 0, super.anInt9852, this.anInt7796, this.anInt7798, this.anInt7795, 0, Static122.method1910(super.anInt9852), 5121, null, 0);
		this.method7843(true);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	@Override
	public void method7838() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt7797, this.anInt7793, super.anInt9862, 0, 0, 0);
		this.anInt7793 = -1;
		this.anInt7797 = -1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIZIIII)V")
	public void method6208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(7) int arg2) {
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9862, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
