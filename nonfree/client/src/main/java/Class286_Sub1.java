import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class286_Sub1 extends Class286 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6534() {
		@Pc(12) byte[] local12 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local12);
		return local12;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([BI)V")
	@Override
	public void method6531(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method6533(@OriginalArg(1) int arg0) {
		@Pc(2) byte[] local2 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local2, 0, 32768);
		return local2;
	}
}
