import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method2571() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer2.capacity()];
		this.aByteBuffer2.position(0);
		this.aByteBuffer2.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([BI)V")
	@Override
	public void method2572(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer2 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer2.position(0);
		this.aByteBuffer2.put(arg0);
	}
}
