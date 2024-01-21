import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method2881() {
		@Pc(12) byte[] local12 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local12);
		return local12;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[B)V")
	@Override
	public void method2877(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
