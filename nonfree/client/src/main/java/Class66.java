import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class Class66 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!ig;")
	protected final Class47_Sub2 aClass47_Sub2_29;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ig;[BI)V")
	protected Class66(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass47_Sub2_29 = arg0;
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer6.put(arg1, 0, arg2);
		}
		this.aByteBuffer6.flip();
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ig;Ljava/nio/ByteBuffer;)V")
	protected Class66(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass47_Sub2_29 = arg0;
		this.aByteBuffer6 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V")
	protected final void method4255(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer6 == null || this.aByteBuffer6.capacity() < arg1) {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer6.clear();
		}
		this.aByteBuffer6.put(arg0, 0, arg1);
		this.aByteBuffer6.flip();
	}
}
