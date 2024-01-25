import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method354() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method353(@OriginalArg(1) int arg0) {
		@Pc(8) byte[] local8 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local8, 0, 32768);
		return local8;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B)V")
	@Override
	public void method352(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
