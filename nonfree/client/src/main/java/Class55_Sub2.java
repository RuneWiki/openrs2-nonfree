import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!md", name = "C", descriptor = "I")
	private int anInt4573 = -1;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "I")
	private int anInt4576 = -1;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	public final int anInt4569;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "I")
	public final int anInt4574;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	public final int anInt4568;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ef;IIII)V")
	public Class55_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt4569 = arg3;
		this.anInt4574 = arg4;
		this.anInt4568 = arg2;
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glTexImage3Dub(super.anInt7037, 0, super.anInt7029, this.anInt4568, this.anInt4569, this.anInt4574, 0, Static192.method3007(super.anInt7029), 5121, null, 0);
		this.method5553(true);
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ef;IIII[BI)V")
	public Class55_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt4568 = arg2;
		this.anInt4574 = arg4;
		this.anInt4569 = arg3;
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7037, 0, super.anInt7029, this.anInt4568, this.anInt4569, this.anInt4574, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5553(true);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	@Override
	public void method5551() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt4573, this.anInt4576, super.anInt7037, 0, 0, 0);
		this.anInt4576 = -1;
		this.anInt4573 = -1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIB)V")
	public void method3683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7037, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}
}
