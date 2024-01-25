import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class Class99 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!ic;")
	protected final Class48_Sub2 aClass48_Sub2_19;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!ic;[BI)V")
	protected Class99(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass48_Sub2_19 = arg0;
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer6.put(arg1, 0, arg2);
		}
		this.aByteBuffer6.flip();
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!ic;Ljava/nio/ByteBuffer;)V")
	protected Class99(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass48_Sub2_19 = arg0;
		this.aByteBuffer6 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([BI)V")
	protected final void method3554(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer6 == null || this.aByteBuffer6.capacity() < arg1) {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer6.clear();
		}
		this.aByteBuffer6.put(arg0, 0, arg1);
		this.aByteBuffer6.flip();
	}
}
