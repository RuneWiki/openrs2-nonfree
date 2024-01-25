import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[B)V")
	@Override
	public void method1253(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer3 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer3.position(0);
		this.aByteBuffer3.put(arg0);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method1251() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer3.capacity()];
		this.aByteBuffer3.position(0);
		this.aByteBuffer3.get(local10);
		return local10;
	}
}
