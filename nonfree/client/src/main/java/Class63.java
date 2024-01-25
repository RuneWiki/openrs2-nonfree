import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class Class63 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!se;")
	protected final Class122_Sub2 aClass122_Sub2_39;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!se;[BI)V")
	protected Class63(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass122_Sub2_39 = arg0;
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer5.put(arg1, 0, arg2);
		}
		this.aByteBuffer5.flip();
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!se;Ljava/nio/ByteBuffer;)V")
	protected Class63(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass122_Sub2_39 = arg0;
		this.aByteBuffer5 = arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BI)V")
	protected final void method4939(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer5 == null || this.aByteBuffer5.capacity() < arg1) {
			this.aByteBuffer5 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer5.clear();
		}
		this.aByteBuffer5.put(arg0, 0, arg1);
		this.aByteBuffer5.flip();
	}
}
