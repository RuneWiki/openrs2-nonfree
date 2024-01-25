import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7119() {
		@Pc(12) byte[] local12 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local12);
		return local12;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B)V")
	@Override
	public void method7118(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZI)[B")
	@Override
	public byte[] method7121(@OriginalArg(2) int arg0) {
		@Pc(10) byte[] local10 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local10, 0, 32768);
		return local10;
	}
}
