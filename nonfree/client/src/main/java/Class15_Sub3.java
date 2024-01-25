import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt4900 = -1;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	private final int anInt4903;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	private final int anInt4902;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private final int anInt4901;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!nm;IIII[BI)V")
	public Class15_Sub3(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4903 = arg2;
		this.anInt4902 = arg3;
		this.anInt4901 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass164_Sub1_42.method3603(this);
		local25.glTexImage3D(this.anInt6388, 0, this.anInt6389, this.anInt4903, this.anInt4902, this.anInt4901, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method5556(true);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	@Override
	public void method5548() {
		this.aClass164_Sub1_42.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt4900, this.anInt6388, 0, 0, 0);
		this.anInt4900 = -1;
	}
}
