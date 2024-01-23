import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method2554() {
		@Pc(12) byte[] local12 = new byte[this.aByteBuffer9.capacity()];
		this.aByteBuffer9.position(0);
		this.aByteBuffer9.get(local12);
		return local12;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([BI)V")
	@Override
	public void method2551(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer9 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer9.position(0);
		this.aByteBuffer9.put(arg0);
	}
}
