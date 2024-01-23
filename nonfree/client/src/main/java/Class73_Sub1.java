import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method2618() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer7.capacity()];
		this.aByteBuffer7.position(0);
		this.aByteBuffer7.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B[B)V")
	@Override
	public void method2613(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer7.position(0);
		this.aByteBuffer7.put(arg0);
	}
}
