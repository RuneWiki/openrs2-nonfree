import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	private int anInt2686 = -1;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public final int anInt2684;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
	public final int anInt2685;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
	public final int anInt2683;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!hd;IIII)V")
	public Class92_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2684 = arg2;
		this.anInt2685 = arg3;
		this.anInt2683 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass89_Sub1_30.method2445(this);
		local25.glTexImage3D(this.anInt3876, 0, this.anInt3877, this.anInt2684, this.anInt2685, this.anInt2683, 0, Static332.method3518(this.anInt3877), 5121, null);
		this.method3517(true);
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!hd;IIII[BI)V")
	public Class92_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2684 = arg2;
		this.anInt2685 = arg3;
		this.anInt2683 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass89_Sub1_30.method2445(this);
		local25.glTexImage3D(this.anInt3876, 0, this.anInt3877, this.anInt2684, this.anInt2685, this.anInt2683, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method3517(true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
	@Override
	public void method4829() {
		this.aClass89_Sub1_30.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt2686, this.anInt3876, 0, 0, 0);
		this.anInt2686 = -1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	public void method2522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass89_Sub1_30.anOpengl2.glFramebufferTexture3DEXT(36160, arg0, this.anInt3876, this.anInt3878, 0, arg1);
		this.anInt2686 = arg0;
	}
}
