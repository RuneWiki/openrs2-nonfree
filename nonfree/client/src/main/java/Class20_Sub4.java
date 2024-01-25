import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	private int anInt6566 = -1;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	private final int anInt6567;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	private final int anInt6568;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	private final int anInt6565;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!h;IIII[BI)V")
	public Class20_Sub4(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6567 = arg2;
		this.anInt6568 = arg3;
		this.anInt6565 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass32_Sub2_41.method2287(this);
		local25.glTexImage3D(this.anInt6563, 0, this.anInt6561, this.anInt6567, this.anInt6568, this.anInt6565, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method5512(true);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	@Override
	public void method5499() {
		this.aClass32_Sub2_41.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt6566, this.anInt6563, 0, 0, 0);
		this.anInt6566 = -1;
	}
}
