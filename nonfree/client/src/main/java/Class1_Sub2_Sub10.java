import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!m", name = "D", descriptor = "I")
	private int anInt3281 = 0;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "I")
	private int anInt3282 = -1;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "I")
	private int anInt3284;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub10(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static156.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt3282 = local12[0];
		this.anInt3284 = Static10.anInt142;
		Static156.method2699(this.anInt3282);
		@Pc(32) int local32 = Static215.anIntArray340[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static10.anInt141 += local61.limit() - this.anInt3281;
		this.anInt3281 = local61.limit();
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
	public void method2838() {
		@Pc(12) int local12 = Static45.method884();
		if ((local12 & 0x1) == 0) {
			Static156.method2699(this.anInt3282);
		}
		if ((local12 & 0x2) == 0) {
			Static156.method2695(0);
		}
		if ((local12 & 0x4) == 0) {
			Static156.method2681(0);
		}
	}

	@OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3282 != -1) {
			Static10.method130(this.anInt3282, this.anInt3281, this.anInt3284);
			this.anInt3281 = 0;
			this.anInt3282 = -1;
		}
		super.finalize();
	}
}
