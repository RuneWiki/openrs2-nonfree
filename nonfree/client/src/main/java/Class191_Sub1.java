import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class191_Sub1 extends Class191 {

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	private Class191_Sub1() {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method7610(@OriginalArg(2) int arg0) {
		@Pc(2) byte[] local2 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local2, 0, 32768);
		return local2;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([BI)V")
	@Override
	public void method7608(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7609() {
		@Pc(15) byte[] local15 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local15);
		return local15;
	}
}
