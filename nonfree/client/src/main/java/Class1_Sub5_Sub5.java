import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class1_Sub5_Sub5 extends Class1_Sub5 {

	@OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
	private int anInt1113 = -1;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
	private int anInt1115 = 0;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
	private int anInt1114;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5_Sub5(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static71.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt1114 = Static162.anInt3245;
		this.anInt1113 = local12[0];
		Static71.method1400(this.anInt1113);
		@Pc(32) int local32 = Static119.anIntArray174[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static162.anInt3246 += local61.limit() - this.anInt1115;
		this.anInt1115 = local61.limit();
	}

	@OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1113 != -1) {
			Static162.method2800(this.anInt1113, this.anInt1115, this.anInt1114);
			this.anInt1113 = -1;
			this.anInt1115 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
	public void method941() {
		@Pc(6) int local6 = Static188.method3174();
		if ((local6 & 0x1) == 0) {
			Static71.method1400(this.anInt1113);
		}
		if ((local6 & 0x2) == 0) {
			Static71.method1392(0);
		}
		if ((local6 & 0x4) == 0) {
			Static71.method1380(0);
		}
	}
}
