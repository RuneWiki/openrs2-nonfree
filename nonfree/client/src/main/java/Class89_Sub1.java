import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([BZ)V")
	@Override
	public void method3742(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.put(arg0);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method3743() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer4.capacity()];
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.get(local4);
		return local4;
	}
}
