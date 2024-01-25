import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public static void method4477() {
		@Pc(11) byte[] local11;
		if (aByteBuffer5 == null) {
			@Pc(5) Class49_Sub2_Sub1 local5 = new Class49_Sub2_Sub1();
			local11 = local5.method4161();
			aByteBuffer5 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer5.position(0);
			aByteBuffer5.put(local11);
			aByteBuffer5.flip();
		}
		if (aByteBuffer6 != null) {
			return;
		}
		@Pc(32) Class49_Sub1_Sub1 local32 = new Class49_Sub1_Sub1();
		local11 = local32.method1032();
		aByteBuffer6 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer6.position(0);
		aByteBuffer6.put(local11);
		aByteBuffer6.flip();
	}
}
