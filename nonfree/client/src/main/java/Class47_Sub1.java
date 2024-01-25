import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method851() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([BI)V")
	@Override
	public void method853(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method852(@OriginalArg(2) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(16) byte[] local16 = new byte[32768];
		this.aByteBuffer1.get(local16, 0, 32768);
		return local16;
	}
}
