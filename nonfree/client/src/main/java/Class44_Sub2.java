import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	private int anInt3794 = -1;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	private final int anInt3796;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	private final int anInt3797;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	private final int anInt3795;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!nf;IIII[BI)V")
	public Class44_Sub2(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt3796 = arg2;
		this.anInt3797 = arg3;
		this.anInt3795 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass105_Sub1_41.method3591(this);
		local25.glTexImage3D(this.anInt6476, 0, this.anInt6475, this.anInt3796, this.anInt3797, this.anInt3795, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method5572(true);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
	@Override
	public void method5567() {
		this.aClass105_Sub1_41.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt3794, this.anInt6476, 0, 0, 0);
		this.anInt3794 = -1;
	}
}
