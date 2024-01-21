import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class1_Sub1_Sub17_Sub1 extends Class1_Sub1_Sub17 {

	@OriginalMember(owner = "client!qd", name = "nb", descriptor = "[B")
	public static final byte[] aByteArray35 = new byte[32896];

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			for (@Pc(13) int local13 = 0; local13 <= local10; local13++) {
				aByteArray35[local8++] = (byte) (255.0D / Math.sqrt((double) ((float) (local10 * local10 + local13 * local13 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80 && this.method2621()) {
			@Pc(24) int[] local24 = local12[2];
			@Pc(28) int[] local28 = local12[1];
			@Pc(36) int local36 = super.anInt3414 * (arg0 % super.anInt3414);
			@Pc(40) int[] local40 = local12[0];
			for (@Pc(42) int local42 = 0; local42 < Static115.anInt2578; local42++) {
				@Pc(55) int local55 = super.anIntArray289[local36 + local42 % super.anInt3408];
				local24[local42] = (local55 & 0xFF) << 4;
				local28[local42] = local55 >> 4 & 0xFF0;
				local40[local42] = local55 >> 12 & 0xFF0;
			}
		}
		return local12;
	}
}
