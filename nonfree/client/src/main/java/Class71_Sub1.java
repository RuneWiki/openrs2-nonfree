import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method1327() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer4.capacity()];
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B[B)V")
	@Override
	public void method1328(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.put(arg0);
	}
}
