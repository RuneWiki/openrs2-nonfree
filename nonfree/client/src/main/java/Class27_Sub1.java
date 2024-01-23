import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[B)V")
	@Override
	public void method606(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.put(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method609() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer5.capacity()];
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.get(local4);
		return local4;
	}
}
