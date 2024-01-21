import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method1778() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B)V")
	@Override
	public void method1777(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
