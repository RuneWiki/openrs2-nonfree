import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!in", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	private Class143_Sub1() {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BII)[B")
	@Override
	public byte[] method3806(@OriginalArg(2) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(15) byte[] local15 = new byte[32768];
		this.aByteBuffer1.get(local15, 0, 32768);
		return local15;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([BI)V")
	@Override
	public void method3807(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method3810() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}
}
