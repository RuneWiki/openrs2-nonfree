import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method1546() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[B)V")
	@Override
	public void method1543(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZII)[B")
	@Override
	public byte[] method1542(@OriginalArg(1) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(12) byte[] local12 = new byte[32768];
		this.aByteBuffer1.get(local12, 0, 32768);
		return local12;
	}
}
