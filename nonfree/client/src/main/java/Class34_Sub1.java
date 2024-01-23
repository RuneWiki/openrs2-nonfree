import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[B)V")
	@Override
	public void method940(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer2 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer2.position(0);
		this.aByteBuffer2.put(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method938() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer2.capacity()];
		this.aByteBuffer2.position(0);
		this.aByteBuffer2.get(local10);
		return local10;
	}
}
