import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class6_Sub8_Sub6 extends Class6_Sub8 {

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
	private int anInt3339 = 2048;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
	private int anInt3344 = 0;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
	private int anInt3342 = 0;

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
	private int anInt3340 = 4096;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
	private int anInt3343 = 12288;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
	private int anInt3346 = 8192;

	@OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
	private int anInt3341 = 2048;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(29) int local29 = Static424.anIntArray466[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static83.anInt1268; local31++) {
				@Pc(39) int local39 = Static2.anIntArray1[local31] - 2048;
				@Pc(44) int local44 = this.anInt3341 + local39;
				@Pc(56) int local56 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(66) int local66 = local56 > 2048 ? local56 - 4096 : local56;
				@Pc(71) int local71 = local29 + this.anInt3344;
				@Pc(81) int local81 = local71 >= -2048 ? local71 : local71 + 4096;
				@Pc(91) int local91 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(96) int local96 = this.anInt3342 + local39;
				@Pc(108) int local108 = local96 >= -2048 ? local96 : local96 + 4096;
				@Pc(120) int local120 = local108 > 2048 ? local108 - 4096 : local108;
				@Pc(125) int local125 = this.anInt3339 + local29;
				@Pc(137) int local137 = local125 >= -2048 ? local125 : local125 + 4096;
				@Pc(147) int local147 = local137 <= 2048 ? local137 : local137 - 4096;
				local11[local31] = this.method3154(local91, local66) || this.method3156(local147, local120) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)Z")
	private boolean method3154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = (arg0 - arg1) * this.anInt3343 >> 12;
		@Pc(29) int local29 = Static510.anIntArray636[local19 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt3343;
		@Pc(43) int local43 = (local36 << 12) / this.anInt3346;
		@Pc(50) int local50 = local43 * this.anInt3340 >> 12;
		return arg1 + arg0 < local50 && arg1 + arg0 > -local50;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3341 = arg1.method3018();
		} else if (arg0 == 1) {
			this.anInt3344 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt3342 = arg1.method3018();
		} else if (arg0 == 3) {
			this.anInt3339 = arg1.method3018();
		} else if (arg0 == 4) {
			this.anInt3343 = arg1.method3018();
		} else if (arg0 == 5) {
			this.anInt3340 = arg1.method3018();
		} else if (arg0 == 6) {
			this.anInt3346 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZ)Z")
	private boolean method3156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt3343 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static510.anIntArray636[local12 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local22 << 12) / this.anInt3343;
		@Pc(42) int local42 = (local35 << 12) / this.anInt3346;
		@Pc(49) int local49 = local42 * this.anInt3340 >> 12;
		return arg0 - arg1 < local49 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		Static496.method7310();
	}
}
