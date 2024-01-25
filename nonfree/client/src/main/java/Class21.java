import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class Class21 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!nm;")
	protected final Class164_Sub1 aClass164_Sub1_8;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!nm;[BI)V")
	protected Class21(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass164_Sub1_8 = arg0;
		this.aByteBuffer3 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer3.put(arg1, 0, arg2);
		}
		this.aByteBuffer3.flip();
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!nm;Ljava/nio/ByteBuffer;)V")
	protected Class21(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass164_Sub1_8 = arg0;
		this.aByteBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([BI)V")
	protected final void method840(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer3 == null || this.aByteBuffer3.capacity() < arg1) {
			this.aByteBuffer3 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer3.clear();
		}
		this.aByteBuffer3.put(arg0, 0, arg1);
		this.aByteBuffer3.flip();
	}
}
