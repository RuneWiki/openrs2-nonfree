import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([BI)V")
	@Override
	public void method2606(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method2607() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IBI)[B")
	@Override
	public byte[] method2609(@OriginalArg(2) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(14) byte[] local14 = new byte[32768];
		this.aByteBuffer1.get(local14, 0, 32768);
		return local14;
	}
}
