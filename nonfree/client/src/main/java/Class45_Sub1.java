import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method3809() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer13.capacity()];
		this.aByteBuffer13.position(0);
		this.aByteBuffer13.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([BI)V")
	@Override
	public void method3806(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer13 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer13.position(0);
		this.aByteBuffer13.put(arg0);
	}
}
