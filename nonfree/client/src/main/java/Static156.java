import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
	public static void method2773() {
		@Pc(11) byte[] local11;
		if (aByteBuffer4 == null) {
			@Pc(5) Class23_Sub2_Sub1 local5 = new Class23_Sub2_Sub1();
			local11 = local5.method4280();
			aByteBuffer4 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer4.position(0);
			aByteBuffer4.put(local11);
			aByteBuffer4.flip();
		}
		if (aByteBuffer5 != null) {
			return;
		}
		@Pc(32) Class23_Sub1_Sub1 local32 = new Class23_Sub1_Sub1();
		local11 = local32.method2273();
		aByteBuffer5 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer5.position(0);
		aByteBuffer5.put(local11);
		aByteBuffer5.flip();
	}
}
