import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class60_Sub3 extends Class60 {

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
	private int anInt2234 = -1;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	private final int anInt2235;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	private final int anInt2233;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
	private final int anInt2232;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!mm;IIII[BI)V")
	public Class60_Sub3(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2235 = arg2;
		this.anInt2233 = arg3;
		this.anInt2232 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass55_Sub1_40.method3677(this);
		local25.glTexImage3D(this.anInt6572, 0, this.anInt6570, this.anInt2235, this.anInt2233, this.anInt2232, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method5836(true);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "()V")
	@Override
	public void method5833() {
		this.aClass55_Sub1_40.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt2234, this.anInt6572, 0, 0, 0);
		this.anInt2234 = -1;
	}
}
