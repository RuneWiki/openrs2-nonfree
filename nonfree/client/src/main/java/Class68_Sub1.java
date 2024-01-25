import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BII)[B")
	@Override
	public byte[] method2196(@OriginalArg(2) int arg0) {
		@Pc(9) byte[] local9 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local9, 0, 32768);
		return local9;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method2197() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[B)V")
	@Override
	public void method2199(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
