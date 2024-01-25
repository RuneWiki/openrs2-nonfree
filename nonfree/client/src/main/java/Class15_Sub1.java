import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([BZ)V")
	@Override
	public void method3814(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method3813() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method3812(@OriginalArg(2) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(13) byte[] local13 = new byte[32768];
		this.aByteBuffer1.get(local13, 0, 32768);
		return local13;
	}
}
