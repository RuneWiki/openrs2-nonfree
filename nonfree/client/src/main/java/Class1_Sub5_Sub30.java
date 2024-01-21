import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub5_Sub30 extends Class1_Sub5 {

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
	private int anInt3132;

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	private int anInt3137;

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
	private int anInt3140;

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
	private int anInt3142;

	@OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
	private int anInt3145;

	@OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
	private int anInt3146;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	private int anInt3134;

	@OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
	private int anInt3143;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
	private int anInt3133;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
	private void method2414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg0 <= 2048 ? arg0 * (arg2 + 4096) >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
		if (local31 <= 0) {
			this.anInt3145 = this.anInt3137 = this.anInt3132 = arg0;
			return;
		}
		@Pc(47) int local47 = arg1 * 6;
		@Pc(53) int local53 = arg0 + arg0 - local31;
		@Pc(62) int local62 = (local31 - local53 << 12) / local31;
		@Pc(66) int local66 = local47 >> 12;
		@Pc(72) int local72 = local47 - (local66 << 12);
		@Pc(80) int local80 = local62 * local31 >> 12;
		@Pc(86) int local86 = local72 * local80 >> 12;
		@Pc(90) int local90 = local86 + local53;
		@Pc(94) int local94 = local31 - local86;
		if (local66 == 0) {
			this.anInt3145 = local31;
			this.anInt3137 = local90;
			this.anInt3132 = local53;
		} else if (local66 == 1) {
			this.anInt3145 = local94;
			this.anInt3137 = local31;
			this.anInt3132 = local53;
		} else if (local66 == 2) {
			this.anInt3132 = local90;
			this.anInt3137 = local31;
			this.anInt3145 = local53;
		} else if (local66 == 3) {
			this.anInt3145 = local53;
			this.anInt3137 = local94;
			this.anInt3132 = local31;
		} else if (local66 == 4) {
			this.anInt3145 = local90;
			this.anInt3132 = local31;
			this.anInt3137 = local53;
		} else if (local66 == 5) {
			this.anInt3137 = local53;
			this.anInt3132 = local94;
			this.anInt3145 = local31;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(29) int[][] local29 = this.method3144(arg0, 0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local29[0];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static177.anInt4018; local55++) {
				this.method2416(local41[local55], local33[local55], local45[local55]);
				this.anInt3142 += this.anInt3133;
				this.anInt3140 += this.anInt3143;
				if (this.anInt3142 < 0) {
					this.anInt3142 = 0;
				}
				while (this.anInt3140 < 0) {
					this.anInt3140 += 4096;
				}
				if (this.anInt3142 > 4096) {
					this.anInt3142 = 4096;
				}
				while (this.anInt3140 > 4096) {
					this.anInt3140 -= 4096;
				}
				this.anInt3146 += this.anInt3134;
				if (this.anInt3146 < 0) {
					this.anInt3146 = 0;
				}
				if (this.anInt3146 > 4096) {
					this.anInt3146 = 4096;
				}
				this.method2414(this.anInt3146, this.anInt3140, this.anInt3142);
				local49[local55] = this.anInt3145;
				local37[local55] = this.anInt3137;
				local53[local55] = this.anInt3132;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3143 = arg0.method332();
		} else if (arg1 == 1) {
			this.anInt3133 = (arg0.method339() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3134 = (arg0.method339() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIBI)V")
	private void method2416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(23) int local23 = arg0 > local12 ? arg0 : local12;
		@Pc(35) int local35 = arg1 > arg2 ? arg2 : arg1;
		@Pc(46) int local46 = local35 > arg0 ? arg0 : local35;
		this.anInt3146 = (local46 + local23) / 2;
		@Pc(59) int local59 = local23 - local46;
		if (local59 <= 0) {
			return;
		}
		if (this.anInt3146 > 0 && this.anInt3146 < 4096) {
			this.anInt3142 = (local59 << 12) / (this.anInt3146 > 2048 ? 8192 - this.anInt3146 * 2 : this.anInt3146 * 2);
		}
		@Pc(107) int local107 = (local23 - arg2 << 12) / local59;
		@Pc(116) int local116 = (local23 - arg0 << 12) / local59;
		@Pc(125) int local125 = (local23 - arg1 << 12) / local59;
		if (arg2 == local23) {
			this.anInt3140 = local46 == arg1 ? local116 + 20480 : -local125 + 4096;
		} else if (local23 == arg1) {
			this.anInt3140 = local46 == arg0 ? local107 + 4096 : 12288 - local116;
		} else {
			this.anInt3140 = local46 == arg2 ? local125 + 12288 : -local107 + 20480;
		}
		this.anInt3140 /= 6;
	}
}
