import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class148_Sub1 extends Class148 {

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
	private Class148_Sub1() {
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(III)[B")
	@Override
	public byte[] method6551(@OriginalArg(1) int arg0) {
		@Pc(8) byte[] local8 = new byte[32768];
		this.aByteBuffer1.position(arg0);
		this.aByteBuffer1.get(local8, 0, 32768);
		return local8;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([BB)V")
	@Override
	public void method6550(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method6552() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}
}
