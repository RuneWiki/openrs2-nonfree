import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class162_Sub1 extends Class162 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[B)V")
	@Override
	public void method4443(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.put(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method4440() {
		@Pc(11) byte[] local11 = new byte[this.aByteBuffer4.capacity()];
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.get(local11);
		return local11;
	}
}
