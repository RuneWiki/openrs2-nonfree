import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([BB)V")
	@Override
	public void method350(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method348() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)[B")
	@Override
	public byte[] method349(@OriginalArg(2) int arg0) {
		@Pc(9) byte[] local9 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local9, 0, 32768);
		return local9;
	}
}
