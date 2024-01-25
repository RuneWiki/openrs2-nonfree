import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
	private int anInt1717 = -1;

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
	private int anInt1720 = -1;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
	public final int anInt1719;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
	public final int anInt1718;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
	public final int anInt1721;

	static {
		new Class15("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!ug;IIII[BI)V")
	public Class65_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt1719 = arg3;
		this.anInt1718 = arg4;
		this.anInt1721 = arg2;
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5976, 0, super.anInt5981, this.anInt1721, this.anInt1719, this.anInt1718, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4771(true);
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!ug;IIII)V")
	public Class65_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt1721 = arg2;
		this.anInt1718 = arg4;
		this.anInt1719 = arg3;
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glTexImage3Dub(super.anInt5976, 0, super.anInt5981, this.anInt1721, this.anInt1719, this.anInt1718, 0, Static444.method5922(super.anInt5981), 5121, null, 0);
		this.method4771(true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	@Override
	public void method4759() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1720, this.anInt1717, super.anInt5976, 0, 0, 0);
		this.anInt1717 = -1;
		this.anInt1720 = -1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIZIIII)V")
	public void method1408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5976, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}
}
