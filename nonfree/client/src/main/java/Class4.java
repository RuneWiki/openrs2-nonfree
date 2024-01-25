import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class Class4 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!h;")
	protected final Class32_Sub2 aClass32_Sub2_19;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!h;[BI)V")
	protected Class4(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass32_Sub2_19 = arg0;
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer5.put(arg1, 0, arg2);
		}
		this.aByteBuffer5.flip();
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!h;Ljava/nio/ByteBuffer;)V")
	protected Class4(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass32_Sub2_19 = arg0;
		this.aByteBuffer5 = arg1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([BI)V")
	protected final void method2572(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer5 == null || this.aByteBuffer5.capacity() < arg1) {
			this.aByteBuffer5 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer5.clear();
		}
		this.aByteBuffer5.put(arg0, 0, arg1);
		this.aByteBuffer5.flip();
	}
}
