import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public static void method3282() {
		@Pc(11) byte[] local11;
		if (aByteBuffer5 == null) {
			@Pc(5) Class27_Sub1_Sub1 local5 = new Class27_Sub1_Sub1();
			local11 = local5.method367();
			aByteBuffer5 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer5.position(0);
			aByteBuffer5.put(local11);
			aByteBuffer5.flip();
		}
		if (aByteBuffer4 != null) {
			return;
		}
		@Pc(32) Class27_Sub2_Sub1 local32 = new Class27_Sub2_Sub1();
		local11 = local32.method4655();
		aByteBuffer4 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer4.position(0);
		aByteBuffer4.put(local11);
		aByteBuffer4.flip();
	}
}
