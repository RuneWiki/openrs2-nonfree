import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
	private int anInt1604 = -1;

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "I")
	private int anInt1608 = -1;

	@OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
	public final int anInt1611;

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
	public final int anInt1607;

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "I")
	public final int anInt1610;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!ht;IIII[BI)V")
	public Class13_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt1611 = arg4;
		this.anInt1607 = arg2;
		this.anInt1610 = arg3;
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt3207, 0, super.anInt3197, this.anInt1607, this.anInt1610, this.anInt1611, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method2745(true);
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!ht;IIII)V")
	public Class13_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt1610 = arg3;
		this.anInt1607 = arg2;
		this.anInt1611 = arg4;
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glTexImage3Dub(super.anInt3207, 0, super.anInt3197, this.anInt1607, this.anInt1610, this.anInt1611, 0, Static315.method4741(super.anInt3197), 5121, null, 0);
		this.method2745(true);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIII)V")
	public void method1401(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glCopyTexSubImage3D(super.anInt3207, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	@Override
	public void method4467() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1604, this.anInt1608, super.anInt3207, 0, 0, 0);
		this.anInt1608 = -1;
		this.anInt1604 = -1;
	}
}
