import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vla")
public final class Class150_Sub1 extends Class150 {

	@OriginalMember(owner = "client!vla", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!vla", name = "<init>", descriptor = "()V")
	private Class150_Sub1() {
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "([BI)V")
	@Override
	public void method9042(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer1 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.put(arg0);
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(IBI)[B")
	@Override
	public byte[] method9040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg0];
		this.aByteBuffer1.position(arg1);
		this.aByteBuffer1.get(local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method9041() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer1.capacity()];
		this.aByteBuffer1.position(0);
		this.aByteBuffer1.get(local4);
		return local4;
	}
}
