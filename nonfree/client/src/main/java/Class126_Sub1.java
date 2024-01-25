import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class126_Sub1 extends Class126 {

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method3095() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer3.capacity()];
		this.aByteBuffer3.position(0);
		this.aByteBuffer3.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BB)V")
	@Override
	public void method3097(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer3 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer3.position(0);
		this.aByteBuffer3.put(arg0);
	}
}
