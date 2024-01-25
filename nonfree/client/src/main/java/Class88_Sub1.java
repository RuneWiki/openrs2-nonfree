import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class88_Sub1 extends Class88 {

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method2545() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer5.capacity()];
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[B)V")
	@Override
	public void method2542(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.put(arg0);
	}
}
