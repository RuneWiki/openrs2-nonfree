import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B)V")
	@Override
	public void method455(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZI)[B")
	@Override
	public byte[] method457(@OriginalArg(0) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(13) byte[] local13 = new byte[32768];
		this.aByteBuffer1.get(local13, 0, 32768);
		return local13;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method456() {
		@Pc(11) byte[] local11 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local11);
		return local11;
	}
}
