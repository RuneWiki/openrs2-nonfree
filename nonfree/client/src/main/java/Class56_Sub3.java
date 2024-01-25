import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	private int anInt2126 = -1;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	private final int anInt2127;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	private final int anInt2128;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	private final int anInt2129;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!tb;IIII[BI)V")
	public Class56_Sub3(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2127 = arg2;
		this.anInt2128 = arg3;
		this.anInt2129 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass129_Sub2_26.method5084(this);
		local25.glTexImage3D(this.anInt3010, 0, this.anInt3011, this.anInt2127, this.anInt2128, this.anInt2129, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method2542(true);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	@Override
	public void method5673() {
		this.aClass129_Sub2_26.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt2126, this.anInt3010, 0, 0, 0);
		this.anInt2126 = -1;
	}
}
