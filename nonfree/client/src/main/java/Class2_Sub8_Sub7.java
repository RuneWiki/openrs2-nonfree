import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub8_Sub7 extends Class2_Sub8 {

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
	private int anInt1884 = -1;

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
	private int anInt1892 = 0;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
	private int anInt1885;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8_Sub7(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static116.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt1884 = local12[0];
		this.anInt1885 = Static124.anInt2871;
		Static116.method1945(this.anInt1884);
		@Pc(32) int local32 = Static1.anIntArray2[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static124.anInt2872 += local61.limit() - this.anInt1892;
		this.anInt1892 = local61.limit();
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	public void method1436() {
		@Pc(8) int local8 = Static141.method2502();
		if ((local8 & 0x1) == 0) {
			Static116.method1945(this.anInt1884);
		}
		if ((local8 & 0x2) == 0) {
			Static116.method1977(0);
		}
		if ((local8 & 0x4) == 0) {
			Static116.method1976(0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1884 != -1) {
			Static124.method2212(this.anInt1884, this.anInt1892, this.anInt1885);
			this.anInt1884 = -1;
			this.anInt1892 = 0;
		}
		super.finalize();
	}
}
