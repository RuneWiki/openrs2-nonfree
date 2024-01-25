import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method4421() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[B)V")
	@Override
	public void method4422(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method4423(@OriginalArg(2) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(14) byte[] local14 = new byte[32768];
		this.aByteBuffer1.get(local14, 0, 32768);
		return local14;
	}
}
