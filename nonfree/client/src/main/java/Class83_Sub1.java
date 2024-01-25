import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class83_Sub1 extends Class83 {

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method3898(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local10, 0, 32768);
		return local10;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([BZ)V")
	@Override
	public void method3900(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method3902() {
		@Pc(11) byte[] local11 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local11);
		return local11;
	}
}
