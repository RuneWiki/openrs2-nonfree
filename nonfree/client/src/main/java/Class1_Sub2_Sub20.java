import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
	private int anInt2637;

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
	private int anInt2642;

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
	private int anInt2646;

	@OriginalMember(owner = "client!kb", name = "ob", descriptor = "I")
	private int anInt2654;

	@OriginalMember(owner = "client!kb", name = "sb", descriptor = "I")
	private int anInt2657;

	@OriginalMember(owner = "client!kb", name = "ub", descriptor = "I")
	private int anInt2658;

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
	private int anInt2641;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
	private int anInt2636;

	@OriginalMember(owner = "client!kb", name = "rb", descriptor = "I")
	private int anInt2656;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(26) int[][] local26 = this.method3390(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local26[1];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static22.anInt596; local52++) {
				this.method1968(local42[local52], local30[local52], local38[local52]);
				this.anInt2654 += this.anInt2641;
				this.anInt2646 += this.anInt2636;
				while (this.anInt2654 < 0) {
					this.anInt2654 += 4096;
				}
				while (this.anInt2654 > 4096) {
					this.anInt2654 -= 4096;
				}
				this.anInt2642 += this.anInt2656;
				if (this.anInt2642 < 0) {
					this.anInt2642 = 0;
				}
				if (this.anInt2642 > 4096) {
					this.anInt2642 = 4096;
				}
				if (this.anInt2646 < 0) {
					this.anInt2646 = 0;
				}
				if (this.anInt2646 > 4096) {
					this.anInt2646 = 4096;
				}
				this.method1971(this.anInt2654, this.anInt2646, this.anInt2642);
				local34[local52] = this.anInt2657;
				local46[local52] = this.anInt2658;
				local50[local52] = this.anInt2637;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt2641 = arg1.method1279();
		} else if (arg0 == 1) {
			this.anInt2656 = (arg1.method1243() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2636 = (arg1.method1243() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIII)V")
	private void method1968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 < arg1 ? arg1 : arg0;
		@Pc(27) int local27 = arg1 < arg0 ? arg1 : arg0;
		@Pc(34) int local34 = arg2 <= local16 ? local16 : arg2;
		@Pc(45) int local45 = local27 > arg2 ? arg2 : local27;
		@Pc(50) int local50 = local34 - local45;
		this.anInt2646 = (local45 + local34) / 2;
		if (local50 <= 0) {
			return;
		}
		if (this.anInt2646 > 0 && this.anInt2646 < 4096) {
			this.anInt2642 = (local50 << 12) / (this.anInt2646 <= 2048 ? this.anInt2646 * 2 : 8192 - this.anInt2646 * 2);
		}
		@Pc(107) int local107 = (local34 - arg1 << 12) / local50;
		@Pc(116) int local116 = (local34 - arg0 << 12) / local50;
		@Pc(125) int local125 = (local34 - arg2 << 12) / local50;
		if (local34 == arg1) {
			this.anInt2654 = arg0 == local45 ? local125 + 20480 : -local116 + 4096;
		} else if (local34 == arg0) {
			this.anInt2654 = local45 == arg2 ? local107 + 4096 : -local125 + 12288;
		} else {
			this.anInt2654 = arg1 == local45 ? local116 + 12288 : -local107 + 20480;
		}
		this.anInt2654 /= 6;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIII)V")
	private void method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(34) int local34 = arg1 <= 2048 ? (arg2 + 4096) * arg1 >> 12 : arg1 + arg2 - (arg2 * arg1 >> 12);
		if (local34 <= 0) {
			this.anInt2657 = this.anInt2658 = this.anInt2637 = arg1;
			return;
		}
		@Pc(53) int local53 = arg0 * 6;
		@Pc(61) int local61 = arg1 + arg1 - local34;
		@Pc(70) int local70 = (local34 - local61 << 12) / local34;
		@Pc(74) int local74 = local53 >> 12;
		@Pc(80) int local80 = local53 - (local74 << 12);
		@Pc(88) int local88 = local70 * local34 >> 12;
		@Pc(94) int local94 = local88 * local80 >> 12;
		@Pc(98) int local98 = local94 + local61;
		@Pc(103) int local103 = local34 - local94;
		if (local74 == 0) {
			this.anInt2658 = local98;
			this.anInt2637 = local61;
			this.anInt2657 = local34;
		} else if (local74 == 1) {
			this.anInt2637 = local61;
			this.anInt2658 = local34;
			this.anInt2657 = local103;
		} else if (local74 == 2) {
			this.anInt2637 = local98;
			this.anInt2658 = local34;
			this.anInt2657 = local61;
		} else if (local74 == 3) {
			this.anInt2658 = local103;
			this.anInt2637 = local34;
			this.anInt2657 = local61;
		} else if (local74 == 4) {
			this.anInt2657 = local98;
			this.anInt2658 = local61;
			this.anInt2637 = local34;
		} else if (local74 == 5) {
			this.anInt2658 = local61;
			this.anInt2657 = local34;
			this.anInt2637 = local103;
		}
	}
}
