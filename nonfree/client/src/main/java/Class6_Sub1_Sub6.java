import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class6_Sub1_Sub6 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
	private int anInt2757;

	@OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!dfa", name = "Q", descriptor = "I")
	private int anInt2766;

	@OriginalMember(owner = "client!dfa", name = "R", descriptor = "I")
	private int anInt2767;

	@OriginalMember(owner = "client!dfa", name = "S", descriptor = "I")
	private int anInt2768;

	@OriginalMember(owner = "client!dfa", name = "T", descriptor = "I")
	private int anInt2769;

	@OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
	private int anInt2759 = 0;

	@OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
	private int anInt2758 = 0;

	@OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
	private int anInt2763 = 0;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(27) int[][] local27 = this.method8725(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static53.anInt1787; local53++) {
				this.method2349(local31[local53], local39[local53], local35[local53]);
				this.anInt2757 += this.anInt2763;
				this.anInt2767 += this.anInt2758;
				this.anInt2766 += this.anInt2759;
				while (this.anInt2757 < 0) {
					this.anInt2757 += 4096;
				}
				if (this.anInt2767 < 0) {
					this.anInt2767 = 0;
				}
				while (this.anInt2757 > 4096) {
					this.anInt2757 -= 4096;
				}
				if (this.anInt2766 < 0) {
					this.anInt2766 = 0;
				}
				if (this.anInt2767 > 4096) {
					this.anInt2767 = 4096;
				}
				if (this.anInt2766 > 4096) {
					this.anInt2766 = 4096;
				}
				this.method2351(this.anInt2767, this.anInt2766, this.anInt2757);
				local43[local53] = this.anInt2760;
				local47[local53] = this.anInt2769;
				local51[local53] = this.anInt2768;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIII)V")
	private void method2349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 > arg2 ? arg0 : arg2;
		@Pc(31) int local31 = local16 >= arg1 ? local16 : arg1;
		@Pc(42) int local42 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(49) int local49 = arg1 >= local42 ? local42 : arg1;
		@Pc(54) int local54 = local31 - local49;
		this.anInt2766 = (local49 + local31) / 2;
		if (this.anInt2766 > 0 && this.anInt2766 < 4096) {
			this.anInt2767 = (local54 << 12) / (this.anInt2766 <= 2048 ? this.anInt2766 * 2 : 8192 - (this.anInt2766 * 2));
		} else {
			this.anInt2767 = 0;
		}
		if (local54 <= 0) {
			this.anInt2757 = 0;
			return;
		}
		@Pc(118) int local118 = (local31 - arg0 << 12) / local54;
		@Pc(127) int local127 = (local31 - arg2 << 12) / local54;
		@Pc(135) int local135 = (local31 - arg1 << 12) / local54;
		if (local31 == arg0) {
			this.anInt2757 = local49 == arg2 ? local135 + 20480 : -local127 + 4096;
		} else if (local31 == arg2) {
			this.anInt2757 = local49 == arg1 ? local118 + 4096 : 12288 - local135;
		} else {
			this.anInt2757 = local49 == arg0 ? local127 + 12288 : -local118 + 20480;
		}
		this.anInt2757 /= 6;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2763 = arg1.method8231();
		} else if (arg0 == 1) {
			this.anInt2758 = (arg1.method8208() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2759 = (arg1.method8208() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(IIII)V")
	private void method2351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 - (arg1 * arg0 >> 12);
		if (local25 <= 0) {
			this.anInt2760 = this.anInt2769 = this.anInt2768 = arg1;
			return;
		}
		@Pc(37) int local37 = arg2 * 6;
		@Pc(43) int local43 = arg1 + arg1 - local25;
		@Pc(51) int local51 = (local25 - local43 << 12) / local25;
		@Pc(55) int local55 = local37 >> 12;
		@Pc(62) int local62 = local37 - (local55 << 12);
		@Pc(70) int local70 = local51 * local25 >> 12;
		@Pc(76) int local76 = local70 * local62 >> 12;
		@Pc(80) int local80 = local43 + local76;
		@Pc(84) int local84 = local25 - local76;
		if (local55 == 0) {
			this.anInt2760 = local25;
			this.anInt2769 = local80;
			this.anInt2768 = local43;
			return;
		}
		if (local55 == 1) {
			this.anInt2760 = local84;
			this.anInt2768 = local43;
			this.anInt2769 = local25;
			return;
		}
		if (local55 == 2) {
			this.anInt2768 = local80;
			this.anInt2769 = local25;
			this.anInt2760 = local43;
			return;
		}
		if (local55 == 3) {
			this.anInt2768 = local25;
			this.anInt2769 = local84;
			this.anInt2760 = local43;
			return;
		}
		if (local55 == 4) {
			this.anInt2769 = local43;
			this.anInt2760 = local80;
			this.anInt2768 = local25;
			return;
		}
		if (local55 == 5) {
			this.anInt2769 = local43;
			this.anInt2768 = local84;
			this.anInt2760 = local25;
			return;
		}
	}
}
