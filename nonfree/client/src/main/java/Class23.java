import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class Class23 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!fu;")
	protected final Class63_Sub2 aClass63_Sub2_14;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!fu;[BI)V")
	protected Class23(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass63_Sub2_14 = arg0;
		this.aByteBuffer3 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer3.put(arg1, 0, arg2);
		}
		this.aByteBuffer3.flip();
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!fu;Ljava/nio/ByteBuffer;)V")
	protected Class23(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass63_Sub2_14 = arg0;
		this.aByteBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([BI)V")
	protected final void method1837(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer3 == null || this.aByteBuffer3.capacity() < arg1) {
			this.aByteBuffer3 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer3.clear();
		}
		this.aByteBuffer3.put(arg0, 0, arg1);
		this.aByteBuffer3.flip();
	}
}
