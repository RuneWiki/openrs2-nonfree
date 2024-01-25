import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class136_Sub1 extends Class136 {

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[B)V")
	@Override
	public void method3296(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method3293() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method3292(@OriginalArg(1) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(7) byte[] local7 = new byte[32768];
		this.aByteBuffer1.get(local7, 0, 32768);
		return local7;
	}
}
