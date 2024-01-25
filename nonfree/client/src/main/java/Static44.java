import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!co", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()V")
	public static void method903() {
		@Pc(11) byte[] local11;
		if (aByteBuffer1 == null) {
			@Pc(5) Class129_Sub2_Sub1 local5 = new Class129_Sub2_Sub1();
			local11 = local5.method5198();
			aByteBuffer1 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer1.position(0);
			aByteBuffer1.put(local11);
			aByteBuffer1.flip();
		}
		if (aByteBuffer2 != null) {
			return;
		}
		@Pc(32) Class129_Sub1_Sub1 local32 = new Class129_Sub1_Sub1();
		local11 = local32.method4380();
		aByteBuffer2 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer2.position(0);
		aByteBuffer2.put(local11);
		aByteBuffer2.flip();
	}
}
