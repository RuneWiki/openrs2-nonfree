import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub4_Sub30 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
	private int anInt4175;

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
	private int anInt4168;

	@OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
	private int anInt4170;

	@OriginalMember(owner = "client!ta", name = "kb", descriptor = "I")
	private int anInt4177;

	@OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
	private int anInt4169;

	@OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
	private int anInt4173;

	@OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
	private int anInt4172;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		Static145.method2764();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4168 = arg0.method546();
		} else if (arg1 == 1) {
			this.anInt4175 = arg0.method546();
		} else if (arg1 == 2) {
			this.anInt4177 = arg0.method546();
		} else if (arg1 == 3) {
			this.anInt4170 = arg0.method546();
		} else if (arg1 == 4) {
			this.anInt4173 = arg0.method546();
		} else if (arg1 == 5) {
			this.anInt4172 = arg0.method546();
		} else if (arg1 == 6) {
			this.anInt4169 = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)Z")
	private boolean method2851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg1 - arg0) * this.anInt4173 >> 12;
		@Pc(28) int local28 = Static29.anIntArray62[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt4173;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4169;
		@Pc(49) int local49 = this.anInt4172 * local42 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)Z")
	private boolean method2852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt4173 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static29.anIntArray62[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt4173;
		@Pc(37) int local37 = (local30 << 12) / this.anInt4169;
		@Pc(49) int local49 = local37 * this.anInt4172 >> 12;
		return arg0 - arg1 < local49 && arg0 - arg1 > -local49;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int local26 = Static150.anIntArray383[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static73.anInt1888; local28++) {
				@Pc(36) int local36 = Static171.anIntArray421[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt4168;
				@Pc(46) int local46 = this.anInt4170 + local26;
				@Pc(57) int local57 = local46 < -2048 ? local46 + 4096 : local46;
				@Pc(66) int local66 = local57 <= 2048 ? local57 : local57 - 4096;
				@Pc(75) int local75 = local41 >= -2048 ? local41 : local41 + 4096;
				@Pc(86) int local86 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(91) int local91 = this.anInt4175 + local26;
				@Pc(96) int local96 = this.anInt4177 + local36;
				@Pc(107) int local107 = local91 < -2048 ? local91 + 4096 : local91;
				@Pc(116) int local116 = local107 > 2048 ? local107 - 4096 : local107;
				@Pc(127) int local127 = local96 < -2048 ? local96 + 4096 : local96;
				@Pc(138) int local138 = local127 > 2048 ? local127 - 4096 : local127;
				local16[local28] = this.method2851(local86, local116) || this.method2852(local66, local138) ? 4096 : 0;
			}
		}
		return local16;
	}
}
