import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
	private int anInt4861 = 0;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
	private int anInt4863 = -1;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
	private int anInt4860;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub19(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static291.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt4863 = local12[0];
		this.anInt4860 = Static74.anInt1419;
		Static291.method4310(this.anInt4863);
		@Pc(32) int local32 = Static18.anIntArray26[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static74.anInt1418 += local61.limit() - this.anInt4861;
		this.anInt4861 = local61.limit();
	}

	@OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4863 != -1) {
			Static74.method1189(this.anInt4863, this.anInt4861, this.anInt4860);
			this.anInt4863 = -1;
			this.anInt4861 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V")
	public void method3784() {
		@Pc(6) int local6 = Static250.method2599();
		if ((local6 & 0x1) == 0) {
			Static291.method4310(this.anInt4863);
		}
		if ((local6 & 0x2) == 0) {
			Static291.method4296(0);
		}
		if ((local6 & 0x4) == 0) {
			Static291.method4323(0);
		}
	}
}
