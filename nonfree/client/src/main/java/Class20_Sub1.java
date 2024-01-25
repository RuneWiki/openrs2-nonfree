import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!an", name = "u", descriptor = "I")
	private final int anInt924;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!nv;II[BI)V")
	public Class20_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt924 = arg2;
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9337, 0, super.anInt9338, this.anInt924, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7620(true);
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(ZI)V")
	public void method847() {
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glTexParameteri(super.anInt9337, 10242, 33071);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	@Override
	public void method7611() {
	}
}
