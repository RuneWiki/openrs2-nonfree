import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!at", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method270(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local10, 0, 32768);
		return local10;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([BI)V")
	@Override
	public void method265(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method271() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}
}
