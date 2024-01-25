import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class260_Sub1 extends Class260 {

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B)V")
	@Override
	public void method6257(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)[B")
	@Override
	public byte[] method6258(@OriginalArg(0) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(7) byte[] local7 = new byte[32768];
		this.aByteBuffer1.get(local7, 0, 32768);
		return local7;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method6262() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}
}
