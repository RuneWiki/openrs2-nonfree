import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class Class47 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!hj;")
	protected final Class2_Sub1 aClass2_Sub1_20;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!hj;[BI)V")
	protected Class47(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub1_20 = arg0;
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer4.put(arg1, 0, arg2);
		}
		this.aByteBuffer4.flip();
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!hj;Ljava/nio/ByteBuffer;)V")
	protected Class47(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass2_Sub1_20 = arg0;
		this.aByteBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BI)V")
	protected final void method2667(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer4 == null || this.aByteBuffer4.capacity() < arg1) {
			this.aByteBuffer4 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer4.clear();
		}
		this.aByteBuffer4.put(arg0, 0, arg1);
		this.aByteBuffer4.flip();
	}
}
