import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([BI)V")
	@Override
	public void method2693(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer11 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer11.position(0);
		this.aByteBuffer11.put(arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method2695() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer11.capacity()];
		this.aByteBuffer11.position(0);
		this.aByteBuffer11.get(local4);
		return local4;
	}
}
