import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V")
	@Override
	public void method3666(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.put(arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method3662() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer5.capacity()];
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.get(local4);
		return local4;
	}
}
