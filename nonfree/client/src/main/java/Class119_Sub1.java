import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method7514() {
		@Pc(13) byte[] local13 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local13);
		return local13;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method7518(@OriginalArg(1) int arg0) {
		@Pc(2) byte[] local2 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local2, 0, 32768);
		return local2;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[B)V")
	@Override
	public void method7516(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
