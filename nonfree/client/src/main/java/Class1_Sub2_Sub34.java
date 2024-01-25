import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class1_Sub2_Sub34 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
	private int anInt5836 = 4096;

	@OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
	private int anInt5841 = 2048;

	@OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
	private int anInt5839 = 2048;

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
	private int anInt5837 = 12288;

	@OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
	private int anInt5844 = 0;

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
	private int anInt5833 = 8192;

	@OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
	private int anInt5846 = 0;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)Z")
	private boolean method5137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt5837 >> 12;
		@Pc(23) int local23 = Static238.anIntArray597[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5837;
		@Pc(42) int local42 = (local30 << 12) / this.anInt5833;
		@Pc(49) int local49 = local42 * this.anInt5836 >> 12;
		return arg0 + arg1 < local49 && arg0 + arg1 > -local49;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(27) int local27 = Static66.anIntArray158[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static251.anInt6509; local29++) {
				@Pc(37) int local37 = Static7.anIntArray23[local29] - 2048;
				@Pc(42) int local42 = this.anInt5839 + local37;
				@Pc(53) int local53 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(67) int local67 = local27 + this.anInt5846;
				@Pc(78) int local78 = local67 >= -2048 ? local67 : local67 + 4096;
				@Pc(89) int local89 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(95) int local95 = local37 + this.anInt5844;
				@Pc(106) int local106 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(115) int local115 = local106 > 2048 ? local106 - 4096 : local106;
				@Pc(120) int local120 = this.anInt5841 + local27;
				@Pc(131) int local131 = local120 >= -2048 ? local120 : local120 + 4096;
				@Pc(142) int local142 = local131 > 2048 ? local131 - 4096 : local131;
				local11[local29] = this.method5137(local62, local89) || this.method5139(local142, local115) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		Static244.method4324();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5839 = arg1.method3115();
		} else if (arg0 == 1) {
			this.anInt5846 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt5844 = arg1.method3115();
		} else if (arg0 == 3) {
			this.anInt5841 = arg1.method3115();
		} else if (arg0 == 4) {
			this.anInt5837 = arg1.method3115();
		} else if (arg0 == 5) {
			this.anInt5836 = arg1.method3115();
		} else if (arg0 == 6) {
			this.anInt5833 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(III)Z")
	private boolean method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 + arg1) * this.anInt5837 >> 12;
		@Pc(23) int local23 = Static238.anIntArray597[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5837;
		@Pc(43) int local43 = (local30 << 12) / this.anInt5833;
		@Pc(50) int local50 = this.anInt5836 * local43 >> 12;
		return arg0 - arg1 < local50 && -local50 < arg0 - arg1;
	}
}
