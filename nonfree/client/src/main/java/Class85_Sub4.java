import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public final class Class85_Sub4 extends Class85 {

	@OriginalMember(owner = "client!wha", name = "v", descriptor = "I")
	private final int anInt10906;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!qo;II[BI)V")
	public Class85_Sub4(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt10906 = arg2;
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt10892, 0, super.anInt10899, this.anInt10906, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9102(true);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	@Override
	public void method9094() {
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BZ)V")
	public void method9103() {
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glTexParameteri(super.anInt10892, 10242, 33071);
	}
}
