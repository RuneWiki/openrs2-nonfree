import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method2718() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B[B)V")
	@Override
	public void method2719(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
