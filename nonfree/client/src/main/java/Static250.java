import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
	public static void method4468() {
		@Pc(11) byte[] local11;
		if (aByteBuffer6 == null) {
			@Pc(5) Class30_Sub1_Sub1 local5 = new Class30_Sub1_Sub1();
			local11 = local5.method1864();
			aByteBuffer6 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer6.position(0);
			aByteBuffer6.put(local11);
			aByteBuffer6.flip();
		}
		if (aByteBuffer7 != null) {
			return;
		}
		@Pc(32) Class30_Sub2_Sub1 local32 = new Class30_Sub2_Sub1();
		local11 = local32.method4030();
		aByteBuffer7 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer7.position(0);
		aByteBuffer7.put(local11);
		aByteBuffer7.flip();
	}
}
