import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class346_Sub1 extends Class346 {

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method7934() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "([BI)V")
	@Override
	public void method7933(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method7936(@OriginalArg(1) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(7) byte[] local7 = new byte[32768];
		this.aByteBuffer1.get(local7, 0, 32768);
		return local7;
	}
}
