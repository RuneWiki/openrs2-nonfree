import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
	public static void method837() {
		@Pc(11) byte[] local11;
		if (aByteBuffer4 == null) {
			@Pc(5) Class3_Sub2_Sub1 local5 = new Class3_Sub2_Sub1();
			local11 = local5.method5028();
			aByteBuffer4 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer4.position(0);
			aByteBuffer4.put(local11);
			aByteBuffer4.flip();
		}
		if (aByteBuffer3 != null) {
			return;
		}
		@Pc(32) Class3_Sub1_Sub1 local32 = new Class3_Sub1_Sub1();
		local11 = local32.method51();
		aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer3.position(0);
		aByteBuffer3.put(local11);
		aByteBuffer3.flip();
	}
}
