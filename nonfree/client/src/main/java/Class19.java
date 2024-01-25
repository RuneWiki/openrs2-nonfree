import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class Class19 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!hd;")
	protected final Class89_Sub1 aClass89_Sub1_42;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!hd;[BI)V")
	protected Class19(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass89_Sub1_42 = arg0;
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer7.put(arg1, 0, arg2);
		}
		this.aByteBuffer7.flip();
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!hd;Ljava/nio/ByteBuffer;)V")
	protected Class19(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass89_Sub1_42 = arg0;
		this.aByteBuffer7 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([BI)V")
	protected final void method5709(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer7 == null || this.aByteBuffer7.capacity() < arg1) {
			this.aByteBuffer7 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer7.clear();
		}
		this.aByteBuffer7.put(arg0, 0, arg1);
		this.aByteBuffer7.flip();
	}
}
