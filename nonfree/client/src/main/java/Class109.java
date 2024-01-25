import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class Class109 {

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Lclient!mi;")
	protected final Class155_Sub1 aClass155_Sub1_29;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!mi;[BI)V")
	protected Class109(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass155_Sub1_29 = arg0;
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer6.put(arg1, 0, arg2);
		}
		this.aByteBuffer6.flip();
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!mi;Ljava/nio/ByteBuffer;)V")
	protected Class109(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass155_Sub1_29 = arg0;
		this.aByteBuffer6 = arg1;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([BI)V")
	protected final void method3930(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer6 == null || this.aByteBuffer6.capacity() < arg1) {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer6.clear();
		}
		this.aByteBuffer6.put(arg0, 0, arg1);
		this.aByteBuffer6.flip();
	}
}
