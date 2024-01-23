import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class4_Sub2_Sub13 extends Class4_Sub2 {

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
	private int anInt3079 = 0;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
	private int anInt3080 = -1;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	private int anInt3085;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2_Sub13(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static178.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt3080 = local12[0];
		this.anInt3085 = Static163.anInt3218;
		Static178.method2763(this.anInt3080);
		@Pc(32) int local32 = Static204.anIntArray354[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static163.anInt3221 += local61.limit() - this.anInt3079;
		this.anInt3079 = local61.limit();
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	public void method2435() {
		@Pc(2) int local2 = Static59.method2485();
		if ((local2 & 0x1) == 0) {
			Static178.method2763(this.anInt3080);
		}
		if ((local2 & 0x2) == 0) {
			Static178.method2754(0);
		}
		if ((local2 & 0x4) == 0) {
			Static178.method2769(0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3080 != -1) {
			Static163.method2523(this.anInt3080, this.anInt3079, this.anInt3085);
			this.anInt3080 = -1;
			this.anInt3079 = 0;
		}
		super.finalize();
	}
}
