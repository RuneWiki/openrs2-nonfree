import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!em", name = "I", descriptor = "I")
	private int anInt1330 = -1;

	@OriginalMember(owner = "client!em", name = "A", descriptor = "I")
	private int anInt1324 = -1;

	@OriginalMember(owner = "client!em", name = "F", descriptor = "I")
	public final int anInt1328;

	@OriginalMember(owner = "client!em", name = "D", descriptor = "I")
	public final int anInt1326;

	@OriginalMember(owner = "client!em", name = "z", descriptor = "I")
	public final int anInt1323;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!ih;IIII)V")
	public Class23_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt1328 = arg3;
		this.anInt1326 = arg4;
		this.anInt1323 = arg2;
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glTexImage3Dub(super.anInt7163, 0, super.anInt7166, this.anInt1323, this.anInt1328, this.anInt1326, 0, Static19.method304(super.anInt7166), 5121, null, 0);
		this.method5805(true);
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!ih;IIII[BI)V")
	public Class23_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt1326 = arg4;
		this.anInt1328 = arg3;
		this.anInt1323 = arg2;
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7163, 0, super.anInt7166, this.anInt1323, this.anInt1328, this.anInt1326, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5805(true);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	@Override
	public void method5797() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1324, this.anInt1330, super.anInt7163, 0, 0, 0);
		this.anInt1330 = -1;
		this.anInt1324 = -1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V")
	public void method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7163, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}
}
