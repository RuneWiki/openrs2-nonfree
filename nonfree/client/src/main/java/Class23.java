import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class Class23 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!ks;")
	protected final Class63_Sub1 aClass63_Sub1_17;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!ks;[BI)V")
	protected Class23(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass63_Sub1_17 = arg0;
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer5.put(arg1, 0, arg2);
		}
		this.aByteBuffer5.flip();
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!ks;Ljava/nio/ByteBuffer;)V")
	protected Class23(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass63_Sub1_17 = arg0;
		this.aByteBuffer5 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V")
	protected final void method1743(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer5 == null || this.aByteBuffer5.capacity() < arg1) {
			this.aByteBuffer5 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer5.clear();
		}
		this.aByteBuffer5.put(arg0, 0, arg1);
		this.aByteBuffer5.flip();
	}
}
