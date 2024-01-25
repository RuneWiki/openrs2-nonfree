import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([BI)V")
	@Override
	public void method5487(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer7.position(0);
		this.aByteBuffer7.put(arg0);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method5482() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer7.capacity()];
		this.aByteBuffer7.position(0);
		this.aByteBuffer7.get(local4);
		return local4;
	}
}
