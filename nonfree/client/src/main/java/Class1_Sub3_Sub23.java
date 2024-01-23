import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
	private int anInt6047 = 0;

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
	private int anInt6045 = -1;

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
	private int anInt6043;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub23(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static294.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt6043 = Static113.anInt2464;
		this.anInt6045 = local12[0];
		Static294.method4486(this.anInt6045);
		@Pc(32) int local32 = Static237.anIntArray462[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static113.anInt2465 += local61.limit() - this.anInt6047;
		this.anInt6047 = local61.limit();
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
	public void method4635() {
		@Pc(6) int local6 = Static308.method4678();
		if ((local6 & 0x1) == 0) {
			Static294.method4486(this.anInt6045);
		}
		if ((local6 & 0x2) == 0) {
			Static294.method4488(0);
		}
		if ((local6 & 0x4) == 0) {
			Static294.method4490(0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt6045 != -1) {
			Static113.method1837(this.anInt6045, this.anInt6047, this.anInt6043);
			this.anInt6047 = 0;
			this.anInt6045 = -1;
		}
		super.finalize();
	}
}
