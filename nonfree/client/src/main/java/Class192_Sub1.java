import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class192_Sub1 extends Class192 {

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method7232() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method7231(@OriginalArg(2) int arg0) {
		@Pc(2) byte[] local2 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local2, 0, 32768);
		return local2;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "([BI)V")
	@Override
	public void method7233(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
