import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
	public static void method1174() {
		@Pc(11) byte[] local11;
		if (aByteBuffer2 == null) {
			@Pc(5) Class39_Sub1_Sub1 local5 = new Class39_Sub1_Sub1();
			local11 = local5.method3568();
			aByteBuffer2 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer2.position(0);
			aByteBuffer2.put(local11);
			aByteBuffer2.flip();
		}
		if (aByteBuffer3 != null) {
			return;
		}
		@Pc(32) Class39_Sub2_Sub1 local32 = new Class39_Sub2_Sub1();
		local11 = local32.method2690();
		aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer3.position(0);
		aByteBuffer3.put(local11);
		aByteBuffer3.flip();
	}
}
