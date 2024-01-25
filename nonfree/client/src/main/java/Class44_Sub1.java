import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B)V")
	@Override
	public void method6732(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method6728(@OriginalArg(1) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(14) byte[] local14 = new byte[32768];
		this.aByteBuffer1.get(local14, 0, 32768);
		return local14;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method6730() {
		@Pc(9) byte[] local9 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local9);
		return local9;
	}
}
