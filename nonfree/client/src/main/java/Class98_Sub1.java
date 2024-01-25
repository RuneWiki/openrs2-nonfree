import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)[B")
	@Override
	public byte[] method2921(@OriginalArg(0) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(14) byte[] local14 = new byte[32768];
		this.aByteBuffer1.get(local14, 0, 32768);
		return local14;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z[B)V")
	@Override
	public void method2919(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method2918() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}
}
