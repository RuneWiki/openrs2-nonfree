import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method922() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[B)V")
	@Override
	public void method923(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
