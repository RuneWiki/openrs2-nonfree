import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class73_Sub3 extends Class73 {

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
	private int anInt5616 = -1;

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
	private int anInt5615 = -1;

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
	public final int anInt5617;

	@OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
	public final int anInt5619;

	@OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
	public final int anInt5618;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!uq;IIII)V")
	public Class73_Sub3(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt5617 = arg2;
		this.anInt5619 = arg3;
		this.anInt5618 = arg4;
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glTexImage3Dub(super.anInt7616, 0, super.anInt7624, this.anInt5617, this.anInt5619, this.anInt5618, 0, Static463.method6529(super.anInt7624), 5121, null, 0);
		this.method6348(true);
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!uq;IIII[BI)V")
	public Class73_Sub3(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt5619 = arg3;
		this.anInt5617 = arg2;
		this.anInt5618 = arg4;
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7616, 0, super.anInt7624, this.anInt5617, this.anInt5619, this.anInt5618, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6348(true);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIII)V")
	public void method4803(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7616, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	@Override
	public void method6345() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt5615, this.anInt5616, super.anInt7616, 0, 0, 0);
		this.anInt5616 = -1;
		this.anInt5615 = -1;
	}
}
