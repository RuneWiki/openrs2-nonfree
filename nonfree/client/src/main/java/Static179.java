import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	public static void method3449() {
		@Pc(11) byte[] local11;
		if (aByteBuffer7 == null) {
			@Pc(5) Class40_Sub2_Sub1 local5 = new Class40_Sub2_Sub1();
			local11 = local5.method3850();
			aByteBuffer7 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer7.position(0);
			aByteBuffer7.put(local11);
			aByteBuffer7.flip();
		}
		if (aByteBuffer6 != null) {
			return;
		}
		@Pc(32) Class40_Sub1_Sub1 local32 = new Class40_Sub1_Sub1();
		local11 = local32.method5294();
		aByteBuffer6 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer6.position(0);
		aByteBuffer6.put(local11);
		aByteBuffer6.flip();
	}
}
