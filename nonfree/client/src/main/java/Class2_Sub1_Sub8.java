import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
	private int anInt2094 = 0;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	private int anInt2096 = 0;

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
	private int anInt2104 = 4096;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
	private int anInt2095 = 12288;

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
	private int anInt2102 = 8192;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
	private int anInt2092 = 2048;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
	private int anInt2101 = 2048;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZI)Z")
	private boolean method1552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 - arg0) * this.anInt2095 >> 12;
		@Pc(27) int local27 = Static171.anIntArray220[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt2095;
		@Pc(41) int local41 = (local34 << 12) / this.anInt2102;
		@Pc(48) int local48 = this.anInt2104 * local41 >> 12;
		return arg1 + arg0 < local48 && -local48 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)Z")
	private boolean method1555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt2095 >> 12;
		@Pc(22) int local22 = Static171.anIntArray220[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2095;
		@Pc(36) int local36 = (local29 << 12) / this.anInt2102;
		@Pc(51) int local51 = local36 * this.anInt2104 >> 12;
		return arg1 - arg0 < local51 && arg1 - arg0 > -local51;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(30) int local30 = Static373.anIntArray55[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static131.anInt2581; local32++) {
				@Pc(40) int local40 = Static252.anIntArray323[local32] - 2048;
				@Pc(46) int local46 = local40 + this.anInt2092;
				@Pc(55) int local55 = local46 >= -2048 ? local46 : local46 + 4096;
				@Pc(64) int local64 = local55 <= 2048 ? local55 : local55 - 4096;
				@Pc(70) int local70 = local30 + this.anInt2096;
				@Pc(79) int local79 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(88) int local88 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(93) int local93 = this.anInt2094 + local40;
				@Pc(102) int local102 = local93 < -2048 ? local93 + 4096 : local93;
				@Pc(113) int local113 = local102 > 2048 ? local102 - 4096 : local102;
				@Pc(118) int local118 = this.anInt2101 + local30;
				@Pc(129) int local129 = local118 < -2048 ? local118 + 4096 : local118;
				@Pc(140) int local140 = local129 > 2048 ? local129 - 4096 : local129;
				local11[local32] = this.method1552(local64, local88) || this.method1555(local113, local140) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		Static10.method210();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2092 = arg1.method3711();
		} else if (arg0 == 1) {
			this.anInt2096 = arg1.method3711();
		} else if (arg0 == 2) {
			this.anInt2094 = arg1.method3711();
		} else if (arg0 == 3) {
			this.anInt2101 = arg1.method3711();
		} else if (arg0 == 4) {
			this.anInt2095 = arg1.method3711();
		} else if (arg0 == 5) {
			this.anInt2104 = arg1.method3711();
		} else if (arg0 == 6) {
			this.anInt2102 = arg1.method3711();
		}
	}
}
