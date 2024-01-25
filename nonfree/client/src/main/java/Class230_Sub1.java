import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class230_Sub1 extends Class230 {

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method5476(@OriginalArg(1) int arg0) {
		@Pc(2) byte[] local2 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local2, 0, 32768);
		return local2;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method5478() {
		@Pc(9) byte[] local9 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local9);
		return local9;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5477(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
