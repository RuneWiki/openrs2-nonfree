import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class189_Sub1 extends Class189 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method4857() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer6.capacity()];
		this.aByteBuffer6.position(0);
		this.aByteBuffer6.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([BB)V")
	@Override
	public void method4856(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer6.position(0);
		this.aByteBuffer6.put(arg0);
	}
}
