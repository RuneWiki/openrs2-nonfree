import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method5151() {
		@Pc(13) byte[] local13 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local13);
		return local13;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBI)[B")
	@Override
	public byte[] method5153(@OriginalArg(0) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(7) byte[] local7 = new byte[32768];
		this.aByteBuffer1.get(local7, 0, 32768);
		return local7;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "([BB)V")
	@Override
	public void method5154(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
