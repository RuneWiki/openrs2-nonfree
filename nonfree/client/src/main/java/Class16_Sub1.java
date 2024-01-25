import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)[B")
	@Override
	public byte[] method233(@OriginalArg(2) int arg0) {
		@Pc(9) byte[] local9 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local9, 0, 32768);
		return local9;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B[B)V")
	@Override
	public void method235(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method234() {
		@Pc(11) byte[] local11 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local11);
		return local11;
	}
}
