import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class233_Sub1 extends Class233 {

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method5445() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[B)V")
	@Override
	public void method5447(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method5449(@OriginalArg(1) int arg0) {
		@Pc(11) byte[] local11 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local11, 0, 32768);
		return local11;
	}
}
