import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class3_Sub1_Sub24 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
	private int anInt7922 = 0;

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
	private int anInt7924 = 2048;

	@OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
	private int anInt7923 = 8192;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	private int anInt7928 = 4096;

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
	private int anInt7930 = 2048;

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
	private int anInt7931 = 12288;

	@OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
	private int anInt7932 = 0;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7930 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.anInt7932 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt7922 = arg1.method2028(-14795);
		} else if (arg0 == 3) {
			this.anInt7924 = arg1.method2028(-14795);
		} else if (arg0 == 4) {
			this.anInt7931 = arg1.method2028(-14795);
		} else if (arg0 == 5) {
			this.anInt7928 = arg1.method2028(-14795);
		} else if (arg0 == 6) {
			this.anInt7923 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(III)Z")
	private boolean method6802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt7931 * (arg0 - arg1) >> 12;
		@Pc(30) int local30 = Static523.anIntArray592[local20 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt7931;
		@Pc(44) int local44 = (local37 << 12) / this.anInt7923;
		@Pc(51) int local51 = local44 * this.anInt7928 >> 12;
		return local51 > arg0 + arg1 && arg0 + arg1 > -local51;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		Static561.method7327();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(22) int[] local22 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(32) int local32 = Static121.anIntArray145[arg0] - 2048;
			for (@Pc(34) int local34 = 0; local34 < Static379.anInt5859; local34++) {
				@Pc(42) int local42 = Static497.anIntArray579[local34] - 2048;
				@Pc(47) int local47 = this.anInt7930 + local42;
				@Pc(59) int local59 = local47 < -2048 ? local47 + 4096 : local47;
				@Pc(69) int local69 = local59 <= 2048 ? local59 : local59 - 4096;
				@Pc(74) int local74 = local32 + this.anInt7932;
				@Pc(86) int local86 = local74 >= -2048 ? local74 : local74 + 4096;
				@Pc(98) int local98 = local86 <= 2048 ? local86 : local86 - 4096;
				@Pc(104) int local104 = local42 + this.anInt7922;
				@Pc(114) int local114 = local104 >= -2048 ? local104 : local104 + 4096;
				@Pc(124) int local124 = local114 > 2048 ? local114 - 4096 : local114;
				@Pc(129) int local129 = local32 + this.anInt7924;
				@Pc(141) int local141 = local129 < -2048 ? local129 + 4096 : local129;
				@Pc(153) int local153 = local141 <= 2048 ? local141 : local141 - 4096;
				local22[local34] = this.method6802(local98, local69) || this.method6803(local124, local153) ? 4096 : 0;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(III)Z")
	private boolean method6803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = (arg1 + arg0) * this.anInt7931 >> 12;
		@Pc(31) int local31 = Static523.anIntArray592[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt7931;
		@Pc(45) int local45 = (local38 << 12) / this.anInt7923;
		@Pc(52) int local52 = local45 * this.anInt7928 >> 12;
		return local52 > arg1 - arg0 && -local52 < arg1 - arg0;
	}
}
