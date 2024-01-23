import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
	private int anInt3122 = 12288;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "I")
	private int anInt3116 = 4096;

	@OriginalMember(owner = "client!na", name = "V", descriptor = "I")
	private int anInt3119 = 2048;

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
	private int anInt3124 = 0;

	@OriginalMember(owner = "client!na", name = "db", descriptor = "I")
	private int anInt3127 = 2048;

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
	private int anInt3125 = 0;

	@OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
	private int anInt3130 = 8192;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB)Z")
	private boolean method2441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt3122 >> 12;
		@Pc(23) int local23 = Static157.anIntArray603[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local23 << 12) / this.anInt3122;
		@Pc(45) int local45 = (local38 << 12) / this.anInt3130;
		@Pc(52) int local52 = local45 * this.anInt3116 >> 12;
		return local52 > arg1 + arg0 && arg1 + arg0 > -local52;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIB)Z")
	private boolean method2442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt3122 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static157.anIntArray603[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt3122;
		@Pc(36) int local36 = (local29 << 12) / this.anInt3130;
		@Pc(43) int local43 = this.anInt3116 * local36 >> 12;
		return arg0 - arg1 < local43 && arg0 - arg1 > -local43;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3119 = arg0.method2095();
		} else if (arg1 == 1) {
			this.anInt3125 = arg0.method2095();
		} else if (arg1 == 2) {
			this.anInt3124 = arg0.method2095();
		} else if (arg1 == 3) {
			this.anInt3127 = arg0.method2095();
		} else if (arg1 == 4) {
			this.anInt3122 = arg0.method2095();
		} else if (arg1 == 5) {
			this.anInt3116 = arg0.method2095();
		} else if (arg1 == 6) {
			this.anInt3130 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		Static97.method1685();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(27) int local27 = Static157.anIntArray604[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static54.anInt953; local29++) {
				@Pc(37) int local37 = Static179.anIntArray682[local29] - 2048;
				@Pc(42) int local42 = local37 + this.anInt3124;
				@Pc(51) int local51 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local51 > 2048 ? local51 - 4096 : local51;
				@Pc(67) int local67 = local27 + this.anInt3125;
				@Pc(73) int local73 = local27 + this.anInt3127;
				@Pc(84) int local84 = local67 >= -2048 ? local67 : local67 + 4096;
				@Pc(95) int local95 = local84 > 2048 ? local84 - 4096 : local84;
				@Pc(104) int local104 = local73 < -2048 ? local73 + 4096 : local73;
				@Pc(115) int local115 = local104 <= 2048 ? local104 : local104 - 4096;
				@Pc(120) int local120 = this.anInt3119 + local37;
				@Pc(129) int local129 = local120 < -2048 ? local120 + 4096 : local120;
				@Pc(140) int local140 = local129 <= 2048 ? local129 : local129 - 4096;
				local17[local29] = this.method2441(local140, local95) || this.method2442(local115, local62) ? 4096 : 0;
			}
		}
		return local17;
	}
}
