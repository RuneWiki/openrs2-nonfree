import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class Class8 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Lclient!po;")
	protected final Class59_Sub1 aClass59_Sub1_25;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!po;[BI)V")
	protected Class8(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass59_Sub1_25 = arg0;
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer7.put(arg1, 0, arg2);
		}
		this.aByteBuffer7.flip();
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!po;Ljava/nio/ByteBuffer;)V")
	protected Class8(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass59_Sub1_25 = arg0;
		this.aByteBuffer7 = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([BI)V")
	protected final void method3086(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer7 == null || this.aByteBuffer7.capacity() < arg1) {
			this.aByteBuffer7 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer7.clear();
		}
		this.aByteBuffer7.put(arg0, 0, arg1);
		this.aByteBuffer7.flip();
	}
}
