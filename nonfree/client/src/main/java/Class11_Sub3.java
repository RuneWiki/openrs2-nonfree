import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	private int anInt2978 = -1;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	private final int anInt2976;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
	private final int anInt2977;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
	private final int anInt2979;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!po;IIII[BI)V")
	public Class11_Sub3(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2976 = arg2;
		this.anInt2977 = arg3;
		this.anInt2979 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass59_Sub1_30.method4296(this);
		local25.glTexImage3D(this.anInt3902, 0, this.anInt3900, this.anInt2976, this.anInt2977, this.anInt2979, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method3575(true);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
	@Override
	public void method5524() {
		this.aClass59_Sub1_30.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt2978, this.anInt3902, 0, 0, 0);
		this.anInt2978 = -1;
	}
}
