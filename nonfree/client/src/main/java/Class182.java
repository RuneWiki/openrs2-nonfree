import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class Class182 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!sq;")
	protected final Class46_Sub2 aClass46_Sub2_38;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!sq;[BI)V")
	protected Class182(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass46_Sub2_38 = arg0;
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer6.put(arg1, 0, arg2);
		}
		this.aByteBuffer6.flip();
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!sq;Ljava/nio/ByteBuffer;)V")
	protected Class182(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass46_Sub2_38 = arg0;
		this.aByteBuffer6 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([BI)V")
	protected final void method5380(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer6 == null || this.aByteBuffer6.capacity() < arg1) {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer6.clear();
		}
		this.aByteBuffer6.put(arg0, 0, arg1);
		this.aByteBuffer6.flip();
	}
}
