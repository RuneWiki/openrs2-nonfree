import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
	private int anInt5780 = 2048;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
	private int anInt5769 = 12288;

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
	private int anInt5776 = 0;

	@OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
	private int anInt5781 = 8192;

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
	private int anInt5782 = 0;

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
	private int anInt5774 = 4096;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
	private int anInt5775 = 2048;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5780 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt5782 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt5776 = arg0.method3107();
		} else if (arg1 == 3) {
			this.anInt5775 = arg0.method3107();
		} else if (arg1 == 4) {
			this.anInt5769 = arg0.method3107();
		} else if (arg1 == 5) {
			this.anInt5774 = arg0.method3107();
		} else if (arg1 == 6) {
			this.anInt5781 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		Static173.method2622();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	private boolean method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt5769 >> 12;
		@Pc(23) int local23 = Static134.anIntArray305[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5769;
		@Pc(46) int local46 = (local30 << 12) / this.anInt5781;
		@Pc(53) int local53 = local46 * this.anInt5774 >> 12;
		return local53 > arg1 + arg0 && -local53 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(21) int local21 = Static219.anIntArray515[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static131.anInt2513; local23++) {
				@Pc(36) int local36 = Static105.anIntArray261[local23] - 2048;
				@Pc(41) int local41 = local21 + this.anInt5782;
				@Pc(52) int local52 = local41 >= -2048 ? local41 : local41 + 4096;
				@Pc(57) int local57 = this.anInt5776 + local36;
				@Pc(62) int local62 = this.anInt5780 + local36;
				@Pc(71) int local71 = local57 < -2048 ? local57 + 4096 : local57;
				@Pc(82) int local82 = local52 > 2048 ? local52 - 4096 : local52;
				@Pc(93) int local93 = local71 > 2048 ? local71 - 4096 : local71;
				@Pc(98) int local98 = this.anInt5775 + local21;
				@Pc(107) int local107 = local62 >= -2048 ? local62 : local62 + 4096;
				@Pc(118) int local118 = local107 > 2048 ? local107 - 4096 : local107;
				@Pc(127) int local127 = local98 >= -2048 ? local98 : local98 + 4096;
				@Pc(136) int local136 = local127 > 2048 ? local127 - 4096 : local127;
				local11[local23] = this.method4462(local82, local118) || this.method4463(local93, local136) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)Z")
	private boolean method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt5769 * (arg1 + arg0) >> 12;
		@Pc(23) int local23 = Static134.anIntArray305[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5769;
		@Pc(37) int local37 = (local30 << 12) / this.anInt5781;
		@Pc(44) int local44 = this.anInt5774 * local37 >> 12;
		return local44 > arg1 - arg0 && -local44 < arg1 - arg0;
	}
}
