import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class85_Sub4 extends Class85 {

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
	private int anInt9021 = -1;

	@OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
	private int anInt9025 = -1;

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
	public final int anInt9022;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
	public final int anInt9020;

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
	public final int anInt9029;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!dia;IIII[BI)V")
	public Class85_Sub4(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt9022 = arg3;
		this.anInt9020 = arg2;
		this.anInt9029 = arg4;
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9006, 0, super.anInt9005, this.anInt9020, this.anInt9022, this.anInt9029, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7875(true);
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!dia;IIII)V")
	public Class85_Sub4(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt9029 = arg4;
		this.anInt9020 = arg2;
		this.anInt9022 = arg3;
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glTexImage3Dub(super.anInt9006, 0, super.anInt9005, this.anInt9020, this.anInt9022, this.anInt9029, 0, Static112.method5090(super.anInt9005), 5121, (byte[]) null, 0);
		this.method7875(true);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIIIIII)V")
	public void method7881(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9006, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	@Override
	public void method7868() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt9025, this.anInt9021, super.anInt9006, 0, 0, 0);
		this.anInt9025 = -1;
		this.anInt9021 = -1;
	}
}
