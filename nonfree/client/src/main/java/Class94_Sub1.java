import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!il", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([BB)V")
	@Override
	public void method2745(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer3 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer3.position(0);
		this.aByteBuffer3.put(arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method2749() {
		@Pc(11) byte[] local11 = new byte[this.aByteBuffer3.capacity()];
		this.aByteBuffer3.position(0);
		this.aByteBuffer3.get(local11);
		return local11;
	}
}
