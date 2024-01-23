import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
	private int anInt3106 = 0;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	private int anInt3105 = -1;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
	private int anInt3111;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub15(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static60.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt3105 = local12[0];
		this.anInt3111 = Static256.anInt5185;
		Static60.method1157(this.anInt3105);
		@Pc(32) int local32 = Static93.anIntArray152[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static256.anInt5188 += local61.limit() - this.anInt3106;
		this.anInt3106 = local61.limit();
	}

	@OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3105 != -1) {
			Static256.method4129(this.anInt3105, this.anInt3106, this.anInt3111);
			this.anInt3105 = -1;
			this.anInt3106 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public void method2544() {
		@Pc(12) int local12 = Static115.method2111();
		if ((local12 & 0x1) == 0) {
			Static60.method1157(this.anInt3105);
		}
		if ((local12 & 0x2) == 0) {
			Static60.method1139(0);
		}
		if ((local12 & 0x4) == 0) {
			Static60.method1168(0);
		}
	}
}
