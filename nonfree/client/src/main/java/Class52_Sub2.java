import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	private int anInt6068 = -1;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	private final int anInt6069;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	private final int anInt6070;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	private final int anInt6067;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!ig;IIII[BI)V")
	public Class52_Sub2(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6069 = arg2;
		this.anInt6070 = arg3;
		this.anInt6067 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass47_Sub2_42.method2772(this);
		local25.glTexImage3D(this.anInt6685, 0, this.anInt6684, this.anInt6069, this.anInt6070, this.anInt6067, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method5604(true);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "()V")
	@Override
	public void method5602() {
		this.aClass47_Sub2_42.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt6068, this.anInt6685, 0, 0, 0);
		this.anInt6068 = -1;
	}
}
