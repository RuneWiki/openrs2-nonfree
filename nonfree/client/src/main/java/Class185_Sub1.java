import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class185_Sub1 extends Class185 {

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method4067() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I[B)V")
	@Override
	public void method4068(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method4071(@OriginalArg(0) int arg0) {
		@Pc(8) byte[] local8 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local8, 0, 32768);
		return local8;
	}
}
