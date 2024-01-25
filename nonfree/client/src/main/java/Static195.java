import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
	public static void method3615() {
		@Pc(11) byte[] local11;
		if (aByteBuffer4 == null) {
			@Pc(5) Class83_Sub2_Sub1 local5 = new Class83_Sub2_Sub1();
			local11 = local5.method4790();
			aByteBuffer4 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer4.position(0);
			aByteBuffer4.put(local11);
			aByteBuffer4.flip();
		}
		if (aByteBuffer3 != null) {
			return;
		}
		@Pc(32) Class83_Sub1_Sub1 local32 = new Class83_Sub1_Sub1();
		local11 = local32.method3205();
		aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer3.position(0);
		aByteBuffer3.put(local11);
		aByteBuffer3.flip();
	}
}
