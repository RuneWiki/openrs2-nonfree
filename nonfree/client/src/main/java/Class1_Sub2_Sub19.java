import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
	private int anInt5235 = -1;

	@OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
	private int anInt5237 = 0;

	@OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
	private int anInt5229;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub19(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static240.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt5235 = local12[0];
		this.anInt5229 = Static154.anInt2852;
		Static240.method3789(this.anInt5235);
		@Pc(32) int local32 = Static208.anIntArray476[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static154.anInt2855 += local61.limit() - this.anInt5237;
		this.anInt5237 = local61.limit();
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	public void method4016() {
		@Pc(6) int local6 = Static238.method3763();
		if ((local6 & 0x1) == 0) {
			Static240.method3789(this.anInt5235);
		}
		if ((local6 & 0x2) == 0) {
			Static240.method3804(0);
		}
		if ((local6 & 0x4) == 0) {
			Static240.method3791(0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5235 != -1) {
			Static154.method2373(this.anInt5235, this.anInt5237, this.anInt5229);
			this.anInt5235 = -1;
			this.anInt5237 = 0;
		}
		super.finalize();
	}
}
