import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
	private int anInt753 = 2048;

	@OriginalMember(owner = "client!bp", name = "E", descriptor = "I")
	private int anInt751 = 0;

	@OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
	private int anInt756 = 8192;

	@OriginalMember(owner = "client!bp", name = "L", descriptor = "I")
	private int anInt757 = 12288;

	@OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
	private int anInt759 = 0;

	@OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
	private int anInt752 = 4096;

	@OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
	private int anInt758 = 2048;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "(III)Z")
	private boolean method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt757 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static268.anIntArray411[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt757;
		@Pc(36) int local36 = (local29 << 12) / this.anInt756;
		@Pc(51) int local51 = local36 * this.anInt752 >> 12;
		return local51 > arg0 - arg1 && -local51 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt758 = arg1.method5362();
		} else if (arg0 == 1) {
			this.anInt759 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt751 = arg1.method5362();
		} else if (arg0 == 3) {
			this.anInt753 = arg1.method5362();
		} else if (arg0 == 4) {
			this.anInt757 = arg1.method5362();
		} else if (arg0 == 5) {
			this.anInt752 = arg1.method5362();
		} else if (arg0 == 6) {
			this.anInt756 = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(26) int local26 = Static266.anIntArray628[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static66.anInt1511; local28++) {
				@Pc(36) int local36 = Static121.anIntArray197[local28] - 2048;
				@Pc(42) int local42 = local36 + this.anInt758;
				@Pc(51) int local51 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local51 > 2048 ? local51 - 4096 : local51;
				@Pc(67) int local67 = this.anInt759 + local26;
				@Pc(78) int local78 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(89) int local89 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(94) int local94 = this.anInt751 + local36;
				@Pc(105) int local105 = local94 < -2048 ? local94 + 4096 : local94;
				@Pc(114) int local114 = local105 > 2048 ? local105 - 4096 : local105;
				@Pc(119) int local119 = this.anInt753 + local26;
				@Pc(128) int local128 = local119 < -2048 ? local119 + 4096 : local119;
				@Pc(137) int local137 = local128 > 2048 ? local128 - 4096 : local128;
				local11[local28] = this.method693(local89, local62) || this.method691(local137, local114) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIB)Z")
	private boolean method693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 - arg1) * this.anInt757 >> 12;
		@Pc(22) int local22 = Static268.anIntArray411[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local22 << 12) / this.anInt757;
		@Pc(41) int local41 = (local34 << 12) / this.anInt756;
		@Pc(48) int local48 = this.anInt752 * local41 >> 12;
		return local48 > arg0 + arg1 && -local48 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		Static170.method2715();
	}
}
