import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
	private int anInt6875 = -1;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	private final int anInt6872;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
	private final int anInt6873;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	private final int anInt6874;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!bf;IIII[BI)V", line = 6)
	public Class8_Sub4(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6872 = arg2;
		this.anInt6873 = arg3;
		this.anInt6874 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass19_Sub1_40.method848(this);
		local25.glTexImage3D(this.anInt6869, 0, this.anInt6870, this.anInt6872, this.anInt6873, this.anInt6874, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method6161(true);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "()V", line = 17)
	@Override
	public void method6153() {
		this.aClass19_Sub1_40.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt6875, this.anInt6869, 0, 0, 0);
		this.anInt6875 = -1;
	}
}
