import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class1_Sub4_Sub33 extends Class1_Sub4 {

	@OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
	private int anInt6087;

	@OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
	private int anInt6089;

	@OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
	private int anInt6095;

	@OriginalMember(owner = "client!rt", name = "S", descriptor = "I")
	private int anInt6097;

	@OriginalMember(owner = "client!rt", name = "X", descriptor = "I")
	private int anInt6101;

	@OriginalMember(owner = "client!rt", name = "Y", descriptor = "I")
	private int anInt6102;

	@OriginalMember(owner = "client!rt", name = "H", descriptor = "I")
	private int anInt6088 = 0;

	@OriginalMember(owner = "client!rt", name = "T", descriptor = "I")
	private int anInt6098 = 0;

	@OriginalMember(owner = "client!rt", name = "V", descriptor = "I")
	private int anInt6099 = 0;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(27) int[][] local27 = this.method5696(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static395.anInt6592; local53++) {
				this.method4807(local31[local53], local35[local53], local39[local53]);
				this.anInt6087 += this.anInt6088;
				this.anInt6097 += this.anInt6099;
				this.anInt6101 += this.anInt6098;
				while (this.anInt6087 < 0) {
					this.anInt6087 += 4096;
				}
				if (this.anInt6097 < 0) {
					this.anInt6097 = 0;
				}
				while (this.anInt6087 > 4096) {
					this.anInt6087 -= 4096;
				}
				if (this.anInt6101 < 0) {
					this.anInt6101 = 0;
				}
				if (this.anInt6097 > 4096) {
					this.anInt6097 = 4096;
				}
				if (this.anInt6101 > 4096) {
					this.anInt6101 = 4096;
				}
				this.method4808(this.anInt6101, this.anInt6087, this.anInt6097);
				local43[local53] = this.anInt6102;
				local47[local53] = this.anInt6095;
				local51[local53] = this.anInt6089;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIII)V")
	private void method4807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 < arg0 ? arg0 : arg1;
		@Pc(19) int local19 = arg1 > arg0 ? arg0 : arg1;
		@Pc(30) int local30 = arg2 > local12 ? arg2 : local12;
		@Pc(45) int local45 = local19 > arg2 ? arg2 : local19;
		this.anInt6101 = (local45 + local30) / 2;
		@Pc(57) int local57 = local30 - local45;
		if (local57 <= 0) {
			this.anInt6087 = 0;
		} else {
			@Pc(72) int local72 = (local30 - arg0 << 12) / local57;
			@Pc(81) int local81 = (local30 - arg1 << 12) / local57;
			@Pc(89) int local89 = (local30 - arg2 << 12) / local57;
			if (local30 == arg0) {
				this.anInt6087 = arg1 == local45 ? local89 + 20480 : -local81 + 4096;
			} else if (arg1 == local30) {
				this.anInt6087 = local45 == arg2 ? local72 + 4096 : -local89 + 12288;
			} else {
				this.anInt6087 = arg0 == local45 ? local81 + 12288 : 20480 - local72;
			}
			this.anInt6087 /= 6;
		}
		if (this.anInt6101 > 0 && this.anInt6101 < 4096) {
			this.anInt6097 = (local57 << 12) / (this.anInt6101 > 2048 ? 8192 - (this.anInt6101 * 2) : this.anInt6101 * 2);
		} else {
			this.anInt6097 = 0;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BIII)V")
	private void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg0 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local33 <= 0) {
			this.anInt6102 = this.anInt6095 = this.anInt6089 = arg0;
			return;
		}
		@Pc(42) int local42 = arg1 * 6;
		@Pc(48) int local48 = arg0 + arg0 - local33;
		@Pc(57) int local57 = (local33 - local48 << 12) / local33;
		@Pc(61) int local61 = local42 >> 12;
		@Pc(68) int local68 = local42 - (local61 << 12);
		@Pc(76) int local76 = local33 * local57 >> 12;
		@Pc(82) int local82 = local76 * local68 >> 12;
		@Pc(86) int local86 = local82 + local48;
		@Pc(91) int local91 = local33 - local82;
		if (local61 == 0) {
			this.anInt6089 = local48;
			this.anInt6095 = local86;
			this.anInt6102 = local33;
			return;
		}
		if (local61 == 1) {
			this.anInt6095 = local33;
			this.anInt6089 = local48;
			this.anInt6102 = local91;
			return;
		}
		if (local61 == 2) {
			this.anInt6095 = local33;
			this.anInt6102 = local48;
			this.anInt6089 = local86;
			return;
		}
		if (local61 == 3) {
			this.anInt6095 = local91;
			this.anInt6102 = local48;
			this.anInt6089 = local33;
			return;
		}
		if (local61 == 4) {
			this.anInt6095 = local48;
			this.anInt6102 = local86;
			this.anInt6089 = local33;
			return;
		}
		if (local61 == 5) {
			this.anInt6102 = local33;
			this.anInt6089 = local91;
			this.anInt6095 = local48;
			return;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6088 = arg0.method5382();
		} else if (arg1 == 1) {
			this.anInt6099 = (arg0.method5367() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt6098 = (arg0.method5367() << 12) / 100;
		}
	}
}
