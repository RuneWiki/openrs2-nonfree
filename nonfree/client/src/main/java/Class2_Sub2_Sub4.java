import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!dk", name = "gb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
	private int anInt849 = 0;

	@OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
	private int anInt848 = 0;

	@OriginalMember(owner = "client!dk", name = "hb", descriptor = "I")
	private int anInt857 = 0;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt848 = arg0.method2104();
		} else if (arg1 == 1) {
			this.anInt857 = (arg0.method2114() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt849 = (arg0.method2114() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZI)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg0 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : arg0 * (arg1 + 4096) >> 12;
		if (local25 <= 0) {
			this.anInt843 = this.anInt846 = this.anInt844 = arg0;
			return;
		}
		@Pc(39) int local39 = arg2 * 6;
		@Pc(46) int local46 = arg0 + arg0 - local25;
		@Pc(55) int local55 = (local25 - local46 << 12) / local25;
		@Pc(59) int local59 = local39 >> 12;
		@Pc(68) int local68 = local39 - (local59 << 12);
		@Pc(74) int local74 = local25 * local55 >> 12;
		@Pc(80) int local80 = local68 * local74 >> 12;
		@Pc(85) int local85 = local25 - local80;
		@Pc(90) int local90 = local46 + local80;
		if (local59 == 0) {
			this.anInt843 = local25;
			this.anInt844 = local46;
			this.anInt846 = local90;
			return;
		}
		if (local59 == 1) {
			this.anInt843 = local85;
			this.anInt846 = local25;
			this.anInt844 = local46;
			return;
		}
		if (local59 == 2) {
			this.anInt844 = local90;
			this.anInt843 = local46;
			this.anInt846 = local25;
			return;
		}
		if (local59 == 3) {
			this.anInt844 = local25;
			this.anInt843 = local46;
			this.anInt846 = local85;
			return;
		}
		if (local59 == 4) {
			this.anInt843 = local90;
			this.anInt846 = local46;
			this.anInt844 = local25;
			return;
		}
		if (local59 == 5) {
			this.anInt843 = local25;
			this.anInt846 = local46;
			this.anInt844 = local85;
			return;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V")
	private void method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 > arg1 ? arg2 : arg1;
		@Pc(27) int local27 = arg2 >= arg1 ? arg1 : arg2;
		@Pc(34) int local34 = local16 < arg0 ? arg0 : local16;
		@Pc(41) int local41 = local27 > arg0 ? arg0 : local27;
		@Pc(46) int local46 = local34 - local41;
		this.anInt851 = (local34 + local41) / 2;
		if (local46 > 0) {
			@Pc(67) int local67 = (local34 - arg2 << 12) / local46;
			@Pc(76) int local76 = (local34 - arg0 << 12) / local46;
			@Pc(85) int local85 = (local34 - arg1 << 12) / local46;
			if (arg2 == local34) {
				this.anInt842 = local41 == arg1 ? local76 + 20480 : -local85 + 4096;
			} else if (arg1 == local34) {
				this.anInt842 = local41 == arg0 ? local67 + 4096 : -local76 + 12288;
			} else {
				this.anInt842 = arg2 == local41 ? local85 + 12288 : -local67 + 20480;
			}
			this.anInt842 /= 6;
		} else {
			this.anInt842 = 0;
		}
		if (this.anInt851 > 0 && this.anInt851 < 4096) {
			this.anInt856 = (local46 << 12) / (this.anInt851 > 2048 ? 8192 - (this.anInt851 * 2) : this.anInt851 * 2);
		} else {
			this.anInt856 = 0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(29) int[][] local29 = this.method3952(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local19[1];
			@Pc(49) int[] local49 = local29[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static54.anInt953; local55++) {
				this.method622(local37[local55], local49[local55], local33[local55]);
				this.anInt851 += this.anInt849;
				if (this.anInt851 < 0) {
					this.anInt851 = 0;
				}
				this.anInt856 += this.anInt857;
				for (this.anInt842 += this.anInt848; this.anInt842 < 0; this.anInt842 += 4096) {
				}
				if (this.anInt856 < 0) {
					this.anInt856 = 0;
				}
				if (this.anInt856 > 4096) {
					this.anInt856 = 4096;
				}
				if (this.anInt851 > 4096) {
					this.anInt851 = 4096;
				}
				while (this.anInt842 > 4096) {
					this.anInt842 -= 4096;
				}
				this.method621(this.anInt851, this.anInt856, this.anInt842);
				local41[local55] = this.anInt843;
				local45[local55] = this.anInt846;
				local53[local55] = this.anInt844;
			}
		}
		return local19;
	}
}
