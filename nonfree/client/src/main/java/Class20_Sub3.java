import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	private int anInt3811 = -1;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	private final int anInt3809;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	private final int anInt3812;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	private final int anInt3810;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!fu;IIII[BI)V")
	public Class20_Sub3(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt3809 = arg2;
		this.anInt3812 = arg3;
		this.anInt3810 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass63_Sub2_42.method2068(this);
		local25.glTexImage3D(this.anInt6331, 0, this.anInt6334, this.anInt3809, this.anInt3812, this.anInt3810, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method5502(true);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
	@Override
	public void method5494() {
		this.aClass63_Sub2_42.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt3811, this.anInt6331, 0, 0, 0);
		this.anInt3811 = -1;
	}
}
