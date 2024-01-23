import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
	private int anInt222 = 0;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
	private int anInt224 = -1;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static277.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt224 = local12[0];
		this.anInt225 = Static94.anInt2207;
		Static277.method4212(this.anInt224);
		@Pc(32) int local32 = Static110.anIntArray224[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static94.anInt2206 += local61.limit() - this.anInt222;
		this.anInt222 = local61.limit();
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
	public void method237() {
		@Pc(6) int local6 = Static225.method3548();
		if ((local6 & 0x1) == 0) {
			Static277.method4212(this.anInt224);
		}
		if ((local6 & 0x2) == 0) {
			Static277.method4222(0);
		}
		if ((local6 & 0x4) == 0) {
			Static277.method4190(0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt224 != -1) {
			Static94.method1748(this.anInt224, this.anInt222, this.anInt225);
			this.anInt224 = -1;
			this.anInt222 = 0;
		}
		super.finalize();
	}
}
