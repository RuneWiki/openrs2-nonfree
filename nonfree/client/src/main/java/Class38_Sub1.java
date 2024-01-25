import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method1198() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B)V")
	@Override
	public void method1197(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method1196(@OriginalArg(2) int arg0) {
		@Pc(10) byte[] local10 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local10, 0, 32768);
		return local10;
	}
}
