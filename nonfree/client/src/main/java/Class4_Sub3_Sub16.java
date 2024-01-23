import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class4_Sub3_Sub16 extends Class4_Sub3 {

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "[I")
	public static int[] anIntArray455 = new int[32];

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
	private int anInt4277 = 0;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
	private int anInt4279 = -1;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
	private int anInt4284;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray455[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public Class4_Sub3_Sub16(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static94.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt4279 = local12[0];
		this.anInt4284 = Static173.anInt3332;
		Static94.method1600(this.anInt4279);
		@Pc(32) int local32 = Static158.anIntArray295[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static173.anInt3330 += local61.limit() - this.anInt4277;
		this.anInt4277 = local61.limit();
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4279 != -1) {
			Static173.method2733(this.anInt4279, this.anInt4277, this.anInt4284);
			this.anInt4277 = 0;
			this.anInt4279 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public void method3576() {
		@Pc(6) int local6 = Static77.method1323();
		if ((local6 & 0x1) == 0) {
			Static94.method1600(this.anInt4279);
		}
		if ((local6 & 0x2) == 0) {
			Static94.method1597(0);
		}
		if ((local6 & 0x4) == 0) {
			Static94.method1607(0);
		}
	}
}
