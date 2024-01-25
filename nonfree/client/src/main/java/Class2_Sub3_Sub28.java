import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class2_Sub3_Sub28 extends Class2_Sub3 {

	@OriginalMember(owner = "client!rp", name = "Z", descriptor = "[J")
	public static final long[] aLongArray17 = new long[256];

	@OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
	private int anInt9151 = 0;

	@OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
	private int anInt9154 = 2048;

	@OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
	private int anInt9159 = 4096;

	@OriginalMember(owner = "client!rp", name = "U", descriptor = "I")
	private int anInt9161 = 0;

	@OriginalMember(owner = "client!rp", name = "V", descriptor = "I")
	private int anInt9162 = 12288;

	@OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
	private int anInt9160 = 8192;

	@OriginalMember(owner = "client!rp", name = "X", descriptor = "I")
	private int anInt9164 = 2048;

	static {
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(19) long local19 = (long) local15;
			for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
				if ((local19 & 0x1L) == 1L) {
					local19 = local19 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local19 >>>= 0x1;
				}
			}
			aLongArray17[local15] = local19;
		}
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(30) int local30 = Static547.anIntArray641[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static222.anInt4971; local32++) {
				@Pc(40) int local40 = Static464.anIntArray556[local32] - 2048;
				@Pc(46) int local46 = local40 + this.anInt9154;
				@Pc(57) int local57 = local46 < -2048 ? local46 + 4096 : local46;
				@Pc(66) int local66 = local57 <= 2048 ? local57 : local57 - 4096;
				@Pc(71) int local71 = this.anInt9161 + local30;
				@Pc(80) int local80 = local71 < -2048 ? local71 + 4096 : local71;
				@Pc(91) int local91 = local80 <= 2048 ? local80 : local80 - 4096;
				@Pc(97) int local97 = local40 + this.anInt9151;
				@Pc(106) int local106 = local97 < -2048 ? local97 + 4096 : local97;
				@Pc(115) int local115 = local106 > 2048 ? local106 - 4096 : local106;
				@Pc(120) int local120 = this.anInt9164 + local30;
				@Pc(129) int local129 = local120 < -2048 ? local120 + 4096 : local120;
				@Pc(138) int local138 = local129 > 2048 ? local129 - 4096 : local129;
				local11[local32] = this.method7699(local91, local66) || this.method7696(local138, local115) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		Static508.method7815();
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(III)Z")
	private boolean method7696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt9162 >> 12;
		@Pc(22) int local22 = Static375.anIntArray163[local12 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local22 << 12) / this.anInt9162;
		@Pc(42) int local42 = (local35 << 12) / this.anInt9160;
		@Pc(49) int local49 = local42 * this.anInt9159 >> 12;
		return local49 > arg0 - arg1 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9154 = arg0.method8326();
		} else if (arg1 == 1) {
			this.anInt9161 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt9151 = arg0.method8326();
		} else if (arg1 == 3) {
			this.anInt9164 = arg0.method8326();
		} else if (arg1 == 4) {
			this.anInt9162 = arg0.method8326();
		} else if (arg1 == 5) {
			this.anInt9159 = arg0.method8326();
		} else if (arg1 == 6) {
			this.anInt9160 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(III)Z")
	private boolean method7699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt9162 * (arg0 - arg1) >> 12;
		@Pc(27) int local27 = Static375.anIntArray163[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt9162;
		@Pc(41) int local41 = (local34 << 12) / this.anInt9160;
		@Pc(48) int local48 = this.anInt9159 * local41 >> 12;
		return arg1 + arg0 < local48 && arg0 + arg1 > -local48;
	}
}
