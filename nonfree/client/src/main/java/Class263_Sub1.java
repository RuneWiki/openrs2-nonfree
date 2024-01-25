import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class263_Sub1 extends Class263 {

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B[B)V")
	@Override
	public void method6922(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method6923(@OriginalArg(2) int arg0) {
		@Pc(10) byte[] local10 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local10, 0, 32768);
		return local10;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method6924() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}
}
