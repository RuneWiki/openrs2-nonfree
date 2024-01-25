import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub6_Sub38 extends Class2_Sub6 {

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
	private int anInt10067;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
	private int anInt10070;

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
	private int anInt10072;

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
	private int anInt10074;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	private int anInt10075;

	@OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
	private int anInt10078;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
	private int anInt10066 = 0;

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
	private int anInt10081 = 0;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
	private int anInt10079 = 0;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt10081 = arg1.method8526();
		} else if (arg0 == 1) {
			this.anInt10066 = (arg1.method8548() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt10079 = (arg1.method8548() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
	private void method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = arg2 > arg1 ? arg2 : arg1;
		@Pc(26) int local26 = local19 < arg0 ? arg0 : local19;
		@Pc(37) int local37 = arg1 > arg2 ? arg2 : arg1;
		@Pc(48) int local48 = local37 > arg0 ? arg0 : local37;
		@Pc(53) int local53 = local26 - local48;
		this.anInt10078 = (local26 + local48) / 2;
		if (this.anInt10078 > 0 && this.anInt10078 < 4096) {
			this.anInt10067 = (local53 << 12) / (this.anInt10078 <= 2048 ? this.anInt10078 * 2 : 8192 - (this.anInt10078 * 2));
		} else {
			this.anInt10067 = 0;
		}
		if (local53 <= 0) {
			this.anInt10072 = 0;
			return;
		}
		@Pc(110) int local110 = (local26 - arg2 << 12) / local53;
		@Pc(119) int local119 = (local26 - arg1 << 12) / local53;
		@Pc(128) int local128 = (local26 - arg0 << 12) / local53;
		if (arg2 == local26) {
			this.anInt10072 = local48 == arg1 ? local128 + 20480 : 4096 - local119;
		} else if (arg1 == local26) {
			this.anInt10072 = arg0 == local48 ? local110 + 4096 : -local128 + 12288;
		} else {
			this.anInt10072 = local48 == arg2 ? local119 + 12288 : 20480 - local110;
		}
		this.anInt10072 /= 6;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIII)V")
	private void method8390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : arg2 * (4096 - -arg0) >> 12;
		if (local31 <= 0) {
			this.anInt10074 = this.anInt10075 = this.anInt10070 = arg2;
			return;
		}
		@Pc(37) int local37 = arg1 * 6;
		@Pc(43) int local43 = arg2 + arg2 - local31;
		@Pc(52) int local52 = (local31 - local43 << 12) / local31;
		@Pc(56) int local56 = local37 >> 12;
		@Pc(62) int local62 = local37 - (local56 << 12);
		@Pc(70) int local70 = local31 * local52 >> 12;
		@Pc(76) int local76 = local70 * local62 >> 12;
		@Pc(80) int local80 = local43 + local76;
		@Pc(85) int local85 = local31 - local76;
		if (local56 == 0) {
			this.anInt10070 = local43;
			this.anInt10075 = local80;
			this.anInt10074 = local31;
			return;
		}
		if (local56 == 1) {
			this.anInt10070 = local43;
			this.anInt10074 = local85;
			this.anInt10075 = local31;
			return;
		}
		if (local56 == 2) {
			this.anInt10075 = local31;
			this.anInt10074 = local43;
			this.anInt10070 = local80;
			return;
		}
		if (local56 == 3) {
			this.anInt10074 = local43;
			this.anInt10075 = local85;
			this.anInt10070 = local31;
			return;
		}
		if (local56 == 4) {
			this.anInt10074 = local80;
			this.anInt10070 = local31;
			this.anInt10075 = local43;
			return;
		}
		if (local56 == 5) {
			this.anInt10075 = local43;
			this.anInt10070 = local85;
			this.anInt10074 = local31;
			return;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(21) int[][] local21 = this.method8465(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static51.anInt1085; local47++) {
				this.method8389(local33[local47], local29[local47], local25[local47]);
				this.anInt10078 += this.anInt10079;
				this.anInt10067 += this.anInt10066;
				for (this.anInt10072 += this.anInt10081; this.anInt10072 < 0; this.anInt10072 += 4096) {
				}
				if (this.anInt10067 < 0) {
					this.anInt10067 = 0;
				}
				while (this.anInt10072 > 4096) {
					this.anInt10072 -= 4096;
				}
				if (this.anInt10067 > 4096) {
					this.anInt10067 = 4096;
				}
				if (this.anInt10078 < 0) {
					this.anInt10078 = 0;
				}
				if (this.anInt10078 > 4096) {
					this.anInt10078 = 4096;
				}
				this.method8390(this.anInt10067, this.anInt10072, this.anInt10078);
				local37[local47] = this.anInt10074;
				local41[local47] = this.anInt10075;
				local45[local47] = this.anInt10070;
			}
		}
		return local11;
	}
}
