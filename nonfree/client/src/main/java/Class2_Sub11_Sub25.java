import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class2_Sub11_Sub25 extends Class2_Sub11 {

	@OriginalMember(owner = "client!sba", name = "S", descriptor = "I")
	private int anInt9034 = 2048;

	@OriginalMember(owner = "client!sba", name = "J", descriptor = "I")
	private int anInt9039 = 2048;

	@OriginalMember(owner = "client!sba", name = "M", descriptor = "I")
	private int anInt9036 = 0;

	@OriginalMember(owner = "client!sba", name = "H", descriptor = "I")
	private int anInt9030 = 12288;

	@OriginalMember(owner = "client!sba", name = "R", descriptor = "I")
	private int anInt9035 = 4096;

	@OriginalMember(owner = "client!sba", name = "I", descriptor = "I")
	private int anInt9032 = 8192;

	@OriginalMember(owner = "client!sba", name = "E", descriptor = "I")
	private int anInt9043 = 0;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "(III)Z")
	private boolean method7963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt9030 * (arg0 - arg1) >> 12;
		@Pc(23) int local23 = Static519.anIntArray590[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt9030;
		@Pc(37) int local37 = (local30 << 12) / this.anInt9032;
		@Pc(44) int local44 = local37 * this.anInt9035 >> 12;
		return local44 > arg1 + arg0 && -local44 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		Static652.method8957();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(29) int local29 = Static137.anIntArray170[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static301.anInt10214; local31++) {
				@Pc(39) int local39 = Static523.anIntArray461[local31] - 2048;
				@Pc(44) int local44 = this.anInt9039 + local39;
				@Pc(54) int local54 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(64) int local64 = local54 > 2048 ? local54 - 4096 : local54;
				@Pc(70) int local70 = local29 + this.anInt9043;
				@Pc(80) int local80 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(90) int local90 = local80 > 2048 ? local80 - 4096 : local80;
				@Pc(95) int local95 = local39 + this.anInt9036;
				@Pc(105) int local105 = local95 < -2048 ? local95 + 4096 : local95;
				@Pc(115) int local115 = local105 > 2048 ? local105 - 4096 : local105;
				@Pc(120) int local120 = this.anInt9034 + local29;
				@Pc(132) int local132 = local120 >= -2048 ? local120 : local120 + 4096;
				@Pc(144) int local144 = local132 <= 2048 ? local132 : local132 - 4096;
				local19[local31] = this.method7963(local90, local64) || this.method7964(local115, local144) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(III)Z")
	private boolean method7964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt9030 >> 12;
		@Pc(22) int local22 = Static519.anIntArray590[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt9030;
		@Pc(36) int local36 = (local29 << 12) / this.anInt9032;
		@Pc(43) int local43 = this.anInt9035 * local36 >> 12;
		return local43 > arg1 - arg0 && -local43 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt9039 = arg1.method8575();
		} else if (arg0 == 1) {
			this.anInt9043 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt9036 = arg1.method8575();
		} else if (arg0 == 3) {
			this.anInt9034 = arg1.method8575();
		} else if (arg0 == 4) {
			this.anInt9030 = arg1.method8575();
		} else if (arg0 == 5) {
			this.anInt9035 = arg1.method8575();
		} else if (arg0 == 6) {
			this.anInt9032 = arg1.method8575();
		}
	}
}
