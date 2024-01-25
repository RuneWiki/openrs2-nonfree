import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method4226(@OriginalArg(2) int arg0) {
		this.aByteBuffer1.position(arg0);
		@Pc(15) byte[] local15 = new byte[32768];
		this.aByteBuffer1.get(local15, 0, 32768);
		return local15;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method4228() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BI)V")
	@Override
	public void method4227(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}
}
