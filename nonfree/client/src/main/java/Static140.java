import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
	public static void method2760() {
		@Pc(11) byte[] local11;
		if (aByteBuffer4 == null) {
			@Pc(5) Class9_Sub2_Sub1 local5 = new Class9_Sub2_Sub1();
			local11 = local5.method847();
			aByteBuffer4 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer4.position(0);
			aByteBuffer4.put(local11);
			aByteBuffer4.flip();
		}
		if (aByteBuffer5 != null) {
			return;
		}
		@Pc(32) Class9_Sub1_Sub1 local32 = new Class9_Sub1_Sub1();
		local11 = local32.method419();
		aByteBuffer5 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer5.position(0);
		aByteBuffer5.put(local11);
		aByteBuffer5.flip();
	}
}
