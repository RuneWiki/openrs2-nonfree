import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class8_Sub3_Sub4 extends Class8_Sub3 {

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "[B")
	public static byte[] aByteArray4 = new byte[32896];

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
	private int anInt521 = 4096;

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
	private int anInt522 = 4096;

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
	private int anInt514 = 4096;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(13) int local13 = 0; local13 <= local6; local13++) {
				aByteArray4[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local13 * local13 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt514 = arg1.method2375();
		} else if (arg0 == 1) {
			this.anInt521 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt522 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(30) int[][] local30 = this.method4224(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local11[1];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local30[1];
			@Pc(54) int[] local54 = local30[2];
			for (@Pc(56) int local56 = 0; local56 < Static239.anInt4789; local56++) {
				@Pc(63) int local63 = local34[local56];
				@Pc(67) int local67 = local50[local56];
				@Pc(71) int local71 = local54[local56];
				if (local63 == local71 && local71 == local67) {
					local42[local56] = local63 * this.anInt514 >> 12;
					local38[local56] = local71 * this.anInt521 >> 12;
					local46[local56] = local67 * this.anInt522 >> 12;
				} else {
					local42[local56] = this.anInt514;
					local38[local56] = this.anInt521;
					local46[local56] = this.anInt522;
				}
			}
		}
		return local11;
	}
}
