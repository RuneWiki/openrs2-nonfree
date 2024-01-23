import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method348() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer4.capacity()];
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BI)V")
	@Override
	public void method347(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer4.position(0);
		this.aByteBuffer4.put(arg0);
	}
}
