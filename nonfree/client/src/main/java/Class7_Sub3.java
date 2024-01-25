import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	private int anInt3995 = -1;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	private final int anInt3997;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	private final int anInt3996;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	private final int anInt3998;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!qi;IIII[BI)V")
	public Class7_Sub3(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt3997 = arg2;
		this.anInt3996 = arg3;
		this.anInt3998 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass82_Sub2_33.method4614(this);
		local25.glTexImage3D(this.anInt5432, 0, this.anInt5433, this.anInt3997, this.anInt3996, this.anInt3998, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4734(true);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
	@Override
	public void method4731() {
		this.aClass82_Sub2_33.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt3995, this.anInt5432, 0, 0, 0);
		this.anInt3995 = -1;
	}
}
