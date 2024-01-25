import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method3351() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer4.capacity()];
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B[B)V")
	@Override
	public void method3353(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.put(arg0);
	}
}
