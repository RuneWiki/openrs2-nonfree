import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class175_Sub1 extends Class175 {

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BI)V")
	@Override
	public void method4131(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method4134() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)[B")
	@Override
	public byte[] method4130(@OriginalArg(2) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(13) byte[] local13 = new byte[32768];
		this.aByteBuffer1.get(local13, 0, 32768);
		return local13;
	}
}
