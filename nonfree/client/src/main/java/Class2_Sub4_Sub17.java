import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub4_Sub17 extends Class2_Sub4 {

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "[B")
	public static final byte[] aByteArray27 = new byte[32896];

	@OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
	private int anInt2396 = 4096;

	@OriginalMember(owner = "client!kh", name = "ib", descriptor = "Z")
	private boolean aBoolean113 = true;

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			for (@Pc(23) int local23 = 0; local23 <= local20; local23++) {
				aByteArray27[local18++] = (byte) (255.0D / Math.sqrt((double) ((float) (local20 * local20 + local23 * local23 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2396 = arg1.method1557();
		} else if (arg0 == 1) {
			this.aBoolean113 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(30) int[] local30 = this.method3129(0, arg0 - 1 & Static167.anInt3559);
			@Pc(36) int[] local36 = this.method3129(0, arg0);
			@Pc(46) int[] local46 = this.method3129(0, arg0 + 1 & Static167.anInt3559);
			@Pc(50) int[] local50 = local16[1];
			@Pc(54) int[] local54 = local16[2];
			@Pc(58) int[] local58 = local16[0];
			for (@Pc(60) int local60 = 0; local60 < Static118.anInt2608; local60++) {
				@Pc(82) int local82 = this.anInt2396 * (local36[Static82.anInt1734 & local60 + 1] - local36[Static82.anInt1734 & local60 - 1]);
				@Pc(94) int local94 = this.anInt2396 * (local46[local60] - local30[local60]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local82 >> 12;
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(114) int local114 = local98 * local98 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(139) int local139;
				@Pc(137) int local137;
				if (local128 == 0) {
					local135 = 0;
					local137 = 0;
					local139 = 0;
				} else {
					local135 = local82 / local128;
					local137 = 16777216 / local128;
					local139 = local94 / local128;
				}
				if (this.aBoolean113) {
					local135 = (local135 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
				}
				local58[local60] = local135;
				local50[local60] = local139;
				local54[local60] = local137;
			}
		}
		return local16;
	}
}
