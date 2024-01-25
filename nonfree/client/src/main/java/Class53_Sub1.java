import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method3193() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer6.capacity()];
		this.aByteBuffer6.position(0);
		this.aByteBuffer6.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[B)V")
	@Override
	public void method3197(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer6.position(0);
		this.aByteBuffer6.put(arg0);
	}
}
