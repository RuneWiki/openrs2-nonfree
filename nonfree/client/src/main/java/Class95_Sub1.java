import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7798() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([BB)V")
	@Override
	public void method7800(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method7799(@OriginalArg(2) int arg0) {
		@Pc(2) byte[] local2 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local2, 0, 32768);
		return local2;
	}
}
