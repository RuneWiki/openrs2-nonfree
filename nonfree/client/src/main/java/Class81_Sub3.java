import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class81_Sub3 extends Class81 {

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	private int anInt4754 = -1;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
	private final int anInt4755;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
	private final int anInt4756;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	private final int anInt4757;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!cg;IIII[BI)V")
	public Class81_Sub3(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4755 = arg2;
		this.anInt4756 = arg3;
		this.anInt4757 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass37_Sub1_34.method767(this);
		local25.glTexImage3D(this.anInt5610, 0, this.anInt5609, this.anInt4755, this.anInt4756, this.anInt4757, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4737(true);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "()V")
	@Override
	public void method5338() {
		this.aClass37_Sub1_34.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt4754, this.anInt5610, 0, 0, 0);
		this.anInt4754 = -1;
	}
}
