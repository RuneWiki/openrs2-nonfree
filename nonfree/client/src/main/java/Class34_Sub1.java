import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method1503() {
		@Pc(11) byte[] local11 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local11);
		return local11;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BB)V")
	@Override
	public void method1505(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
