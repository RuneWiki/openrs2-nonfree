import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class3_Sub4_Sub18 extends Class3_Sub4 {

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	private int anInt3679 = -1;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
	private int anInt3677 = 0;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub18(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static283.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt3684 = Static189.anInt3719;
		this.anInt3679 = local12[0];
		Static283.method4636(this.anInt3679);
		@Pc(32) int local32 = Static16.anIntArray25[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static189.anInt3721 += local61.limit() - this.anInt3677;
		this.anInt3677 = local61.limit();
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public void method3123() {
		@Pc(2) int local2 = Static110.method1779();
		if ((local2 & 0x1) == 0) {
			Static283.method4636(this.anInt3679);
		}
		if ((local2 & 0x2) == 0) {
			Static283.method4664(0);
		}
		if ((local2 & 0x4) == 0) {
			Static283.method4656(0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3679 != -1) {
			Static189.method3151(this.anInt3679, this.anInt3677, this.anInt3684);
			this.anInt3679 = -1;
			this.anInt3677 = 0;
		}
		super.finalize();
	}
}
