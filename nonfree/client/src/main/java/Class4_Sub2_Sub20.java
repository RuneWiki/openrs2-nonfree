import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class4_Sub2_Sub20 extends Class4_Sub2 {

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	private int anInt5085 = 0;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	private int anInt5091 = -1;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "I")
	private int anInt5090;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2_Sub20(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static251.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt5090 = Static239.anInt4726;
		this.anInt5091 = local12[0];
		Static251.method3892(this.anInt5091);
		@Pc(32) int local32 = Static283.anIntArray441[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static239.anInt4728 += local61.limit() - this.anInt5085;
		this.anInt5085 = local61.limit();
	}

	@OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5091 != -1) {
			Static239.method3679(this.anInt5091, this.anInt5085, this.anInt5090);
			this.anInt5085 = 0;
			this.anInt5091 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public void method4049() {
		@Pc(8) int local8 = Static238.method3143();
		if ((local8 & 0x1) == 0) {
			Static251.method3892(this.anInt5091);
		}
		if ((local8 & 0x2) == 0) {
			Static251.method3870(0);
		}
		if ((local8 & 0x4) == 0) {
			Static251.method3851(0);
		}
	}
}
