import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public final class Class29_Sub4 extends Class29 {

	@OriginalMember(owner = "client!qaa", name = "w", descriptor = "I")
	private final int anInt7691;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!vf;II[BI)V")
	public Class29_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt7691 = arg2;
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9567, 0, super.anInt9574, this.anInt7691, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8164(true);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
	@Override
	public void method8162() {
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(IZ)V")
	public void method6689() {
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glTexParameteri(super.anInt9567, 10242, 33071);
	}
}
