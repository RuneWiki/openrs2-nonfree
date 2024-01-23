import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method1279() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer5.capacity()];
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[B)V")
	@Override
	public void method1278(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.put(arg0);
	}
}
