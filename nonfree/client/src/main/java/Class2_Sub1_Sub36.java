import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class2_Sub1_Sub36 extends Class2_Sub1 {

	@OriginalMember(owner = "client!se", name = "R", descriptor = "[B")
	public static byte[] aByteArray50 = new byte[32896];

	@OriginalMember(owner = "client!se", name = "M", descriptor = "I")
	private int anInt5024 = 4096;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "I")
	private int anInt5029 = 0;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "I")
	private int anInt5030 = 12288;

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
	private int anInt5036 = 2048;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "I")
	private int anInt5026 = 2048;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
	private int anInt5034 = 0;

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
	private int anInt5040 = 8192;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(13) int local13 = 0; local13 <= local6; local13++) {
				aByteArray50[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local13 * local13 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Z")
	private boolean method4013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = (arg1 - arg0) * this.anInt5030 >> 12;
		@Pc(28) int local28 = Static290.anIntArray541[local14 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt5030;
		@Pc(42) int local42 = (local35 << 12) / this.anInt5040;
		@Pc(49) int local49 = this.anInt5024 * local42 >> 12;
		return arg0 + arg1 < local49 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5026 = arg0.method2130();
		} else if (arg1 == 1) {
			this.anInt5034 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt5029 = arg0.method2130();
		} else if (arg1 == 3) {
			this.anInt5036 = arg0.method2130();
		} else if (arg1 == 4) {
			this.anInt5030 = arg0.method2130();
		} else if (arg1 == 5) {
			this.anInt5024 = arg0.method2130();
		} else if (arg1 == 6) {
			this.anInt5040 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(28) int local28 = Static272.anIntArray521[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static281.anInt5558; local30++) {
				@Pc(39) int local39 = Static234.anIntArray462[local30] - 2048;
				@Pc(45) int local45 = local39 + this.anInt5026;
				@Pc(54) int local54 = local45 >= -2048 ? local45 : local45 + 4096;
				@Pc(59) int local59 = this.anInt5034 + local28;
				@Pc(68) int local68 = local54 > 2048 ? local54 - 4096 : local54;
				@Pc(79) int local79 = local59 < -2048 ? local59 + 4096 : local59;
				@Pc(90) int local90 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(95) int local95 = local39 + this.anInt5029;
				@Pc(101) int local101 = local28 + this.anInt5036;
				@Pc(112) int local112 = local101 >= -2048 ? local101 : local101 + 4096;
				@Pc(123) int local123 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(132) int local132 = local123 > 2048 ? local123 - 4096 : local123;
				@Pc(143) int local143 = local112 > 2048 ? local112 - 4096 : local112;
				local7[local30] = this.method4013(local68, local90) || this.method4024(local143, local132) ? 4096 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		Static66.method1205();
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)Z")
	private boolean method4024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt5030 * (arg1 + arg0) >> 12;
		@Pc(29) int local29 = Static290.anIntArray541[local12 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt5030;
		@Pc(43) int local43 = (local36 << 12) / this.anInt5040;
		@Pc(50) int local50 = this.anInt5024 * local43 >> 12;
		return arg0 - arg1 < local50 && arg0 - arg1 > -local50;
	}
}
