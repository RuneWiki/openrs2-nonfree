import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cha")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!cha", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "()V")
	private Class56_Sub1() {
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIZ)[B")
	@Override
	public byte[] method977(@OriginalArg(1) int arg0) {
		@Pc(2) byte[] local2 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local2, 0, 32768);
		return local2;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method972() {
		@Pc(15) byte[] local15 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local15);
		return local15;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "([BI)V")
	@Override
	public void method974(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
