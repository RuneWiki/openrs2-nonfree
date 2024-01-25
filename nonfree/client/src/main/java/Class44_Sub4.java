import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class44_Sub4 extends Class44 {

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
	private final int anInt10486;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!ml;II[BI)V")
	public Class44_Sub4(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt10486 = arg2;
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt10474, 0, super.anInt10483, this.anInt10486, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9007(true);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	@Override
	public void method9004() {
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BZ)V")
	public void method9014() {
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glTexParameteri(super.anInt10474, 10242, 33071);
	}
}
