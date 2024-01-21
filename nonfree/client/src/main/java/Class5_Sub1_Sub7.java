import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class5_Sub1_Sub7 extends Class5_Sub1 {

	@OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
	private int anInt813 = 8192;

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
	private int anInt811 = 12288;

	@OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
	private int anInt822 = 4096;

	@OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
	private int anInt825 = 0;

	@OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
	private int anInt824 = 2048;

	@OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
	private int anInt827 = 2048;

	@OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
	private int anInt821 = 0;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)Z")
	private boolean method640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = (arg1 - arg0) * this.anInt811 >> 12;
		@Pc(27) int local27 = Static106.anIntArray238[local8 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt811;
		@Pc(41) int local41 = (local34 << 12) / this.anInt813;
		@Pc(48) int local48 = this.anInt822 * local41 >> 12;
		return local48 > arg0 + arg1 && arg0 + arg1 > -local48;
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		Static64.method1048();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(29) int local29 = Static147.anIntArray321[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static174.anInt3489; local31++) {
				@Pc(39) int local39 = Static117.anIntArray274[local31] - 2048;
				@Pc(44) int local44 = local39 + this.anInt824;
				@Pc(49) int local49 = local29 + this.anInt825;
				@Pc(60) int local60 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(65) int local65 = this.anInt821 + local39;
				@Pc(74) int local74 = local65 >= -2048 ? local65 : local65 + 4096;
				@Pc(85) int local85 = local60 > 2048 ? local60 - 4096 : local60;
				@Pc(96) int local96 = local49 >= -2048 ? local49 : local49 + 4096;
				@Pc(105) int local105 = local96 > 2048 ? local96 - 4096 : local96;
				@Pc(116) int local116 = local74 > 2048 ? local74 - 4096 : local74;
				@Pc(121) int local121 = local29 + this.anInt827;
				@Pc(130) int local130 = local121 >= -2048 ? local121 : local121 + 4096;
				@Pc(139) int local139 = local130 > 2048 ? local130 - 4096 : local130;
				local19[local31] = this.method640(local85, local105) || this.method646(local116, local139) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt824 = arg0.method3077();
		} else if (arg1 == 1) {
			this.anInt825 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt821 = arg0.method3077();
		} else if (arg1 == 3) {
			this.anInt827 = arg0.method3077();
		} else if (arg1 == 4) {
			this.anInt811 = arg0.method3077();
		} else if (arg1 == 5) {
			this.anInt822 = arg0.method3077();
		} else if (arg1 == 6) {
			this.anInt813 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(III)Z")
	private boolean method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt811 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static106.anIntArray238[local8 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt811;
		@Pc(41) int local41 = (local29 << 12) / this.anInt813;
		@Pc(48) int local48 = this.anInt822 * local41 >> 12;
		return local48 > arg1 - arg0 && -local48 < arg1 - arg0;
	}
}
