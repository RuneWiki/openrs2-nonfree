import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class158_Sub1 extends Class158 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B)V")
	@Override
	public void method5021(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method5025() {
		@Pc(11) byte[] local11 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method5024(@OriginalArg(1) int arg0) {
		@Pc(2) byte[] local2 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local2, 0, 32768);
		return local2;
	}
}
