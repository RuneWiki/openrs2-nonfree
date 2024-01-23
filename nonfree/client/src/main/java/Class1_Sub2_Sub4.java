import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!da", name = "G", descriptor = "I")
	private int anInt1210 = 0;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "I")
	private int anInt1204 = -1;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "I")
	private int anInt1205;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub4(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static296.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt1204 = local12[0];
		this.anInt1205 = Static237.anInt5216;
		Static296.method4812(this.anInt1204);
		@Pc(32) int local32 = Static151.anIntArray324[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, local61);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		Static237.anInt5215 += local61.limit() - this.anInt1210;
		this.anInt1210 = local61.limit();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public void method914() {
		@Pc(11) int local11 = Static285.method4695();
		if ((local11 & 0x1) == 0) {
			Static296.method4812(this.anInt1204);
		}
		if ((local11 & 0x2) == 0) {
			Static296.method4805(0);
		}
		if ((local11 & 0x4) == 0) {
			Static296.method4823(0);
		}
	}

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1204 != -1) {
			Static237.method4089(this.anInt1204, this.anInt1210, this.anInt1205);
			this.anInt1204 = -1;
			this.anInt1210 = 0;
		}
		super.finalize();
	}
}
