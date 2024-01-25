import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method345() {
		@Pc(11) byte[] local11 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local11);
		return local11;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([BB)V")
	@Override
	public void method348(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
