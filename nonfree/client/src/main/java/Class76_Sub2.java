import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
	private final int anInt5932;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!kw;II[BI)V")
	public Class76_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt5932 = arg2;
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt9197, 0, super.anInt9207, this.anInt5932, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7930(true);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
	@Override
	public void method7922() {
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZI)V")
	public void method5160() {
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glTexParameteri(super.anInt9197, 10242, 33071);
	}
}
