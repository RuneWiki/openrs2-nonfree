import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class8_Sub1_Sub8 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	private int anInt2311 = -1;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	private int anInt2312 = 0;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	private int anInt2307;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V")
	public Class8_Sub1_Sub8(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static116.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt2311 = local12[0];
		this.anInt2307 = Static166.anInt3350;
		Static116.method1897(this.anInt2311);
		@Pc(32) int local32 = Static96.anIntArray135[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static166.anInt3351 += local61.limit() - this.anInt2312;
		this.anInt2312 = local61.limit();
	}

	@OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2311 != -1) {
			Static166.method2639(this.anInt2311, this.anInt2312, this.anInt2307);
			this.anInt2312 = 0;
			this.anInt2311 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V")
	public void method1836() {
		@Pc(6) int local6 = Static158.method2545();
		if ((local6 & 0x1) == 0) {
			Static116.method1897(this.anInt2311);
		}
		if ((local6 & 0x2) == 0) {
			Static116.method1884(0);
		}
		if ((local6 & 0x4) == 0) {
			Static116.method1889(0);
		}
	}
}
