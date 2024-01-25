import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class6_Sub4_Sub31 extends Class6_Sub4 {

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
	private int anInt8117 = 0;

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
	private int anInt8119 = 2048;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
	private int anInt8123 = 12288;

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
	private int anInt8125 = 4096;

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
	private int anInt8116 = 8192;

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
	private int anInt8122 = 0;

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
	private int anInt8124 = 2048;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt8124 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt8117 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt8122 = arg1.method6003();
		} else if (arg0 == 3) {
			this.anInt8119 = arg1.method6003();
		} else if (arg0 == 4) {
			this.anInt8123 = arg1.method6003();
		} else if (arg0 == 5) {
			this.anInt8125 = arg1.method6003();
		} else if (arg0 == 6) {
			this.anInt8116 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)Z")
	private boolean method6609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt8123 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static300.anIntArray410[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt8123;
		@Pc(37) int local37 = (local30 << 12) / this.anInt8116;
		@Pc(44) int local44 = this.anInt8125 * local37 >> 12;
		return local44 > arg0 - arg1 && -local44 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)Z")
	private boolean method6610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt8123 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static300.anIntArray410[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt8123;
		@Pc(37) int local37 = (local30 << 12) / this.anInt8116;
		@Pc(49) int local49 = local37 * this.anInt8125 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		Static571.method7641();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(29) int local29 = Static501.anIntArray637[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static408.anInt7209; local31++) {
				@Pc(39) int local39 = Static398.anIntArray514[local31] - 2048;
				@Pc(45) int local45 = local39 + this.anInt8124;
				@Pc(56) int local56 = local45 >= -2048 ? local45 : local45 + 4096;
				@Pc(65) int local65 = local56 > 2048 ? local56 - 4096 : local56;
				@Pc(71) int local71 = local29 + this.anInt8117;
				@Pc(82) int local82 = local71 >= -2048 ? local71 : local71 + 4096;
				@Pc(93) int local93 = local82 > 2048 ? local82 - 4096 : local82;
				@Pc(98) int local98 = local39 + this.anInt8122;
				@Pc(107) int local107 = local98 >= -2048 ? local98 : local98 + 4096;
				@Pc(118) int local118 = local107 > 2048 ? local107 - 4096 : local107;
				@Pc(123) int local123 = local29 + this.anInt8119;
				@Pc(132) int local132 = local123 < -2048 ? local123 + 4096 : local123;
				@Pc(143) int local143 = local132 <= 2048 ? local132 : local132 - 4096;
				local11[local31] = this.method6610(local65, local93) || this.method6609(local143, local118) ? 4096 : 0;
			}
		}
		return local11;
	}
}
