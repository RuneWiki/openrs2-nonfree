import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method1471() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer4.capacity()];
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I[B)V")
	@Override
	public void method1469(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.put(arg0);
	}
}
