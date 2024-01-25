import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class142_Sub1 extends Class142 {

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method3345(@OriginalArg(1) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(15) byte[] local15 = new byte[32768];
		this.aByteBuffer1.get(local15, 0, 32768);
		return local15;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method3343() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B[B)V")
	@Override
	public void method3344(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
