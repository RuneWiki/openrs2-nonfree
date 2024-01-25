import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class1_Sub8_Sub33 extends Class1_Sub8 {

	@OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
	private int anInt6796;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
	private int anInt6798;

	@OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
	private int anInt6800;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
	private int anInt6802;

	@OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
	private int anInt6808;

	@OriginalMember(owner = "client!sm", name = "Z", descriptor = "I")
	private int anInt6809;

	@OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
	private int anInt6794 = 0;

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
	private int anInt6799 = 0;

	@OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
	private int anInt6807 = 0;

	static {
		new Class158(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[][] local29 = this.method6035(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static18.anInt439; local55++) {
				this.method5184(local41[local55], local33[local55], local37[local55]);
				this.anInt6800 += this.anInt6807;
				this.anInt6809 += this.anInt6794;
				this.anInt6796 += this.anInt6799;
				while (this.anInt6800 < 0) {
					this.anInt6800 += 4096;
				}
				while (this.anInt6800 > 4096) {
					this.anInt6800 -= 4096;
				}
				if (this.anInt6809 < 0) {
					this.anInt6809 = 0;
				}
				if (this.anInt6796 < 0) {
					this.anInt6796 = 0;
				}
				if (this.anInt6809 > 4096) {
					this.anInt6809 = 4096;
				}
				if (this.anInt6796 > 4096) {
					this.anInt6796 = 4096;
				}
				this.method5180(this.anInt6809, this.anInt6796, this.anInt6800);
				local45[local55] = this.anInt6808;
				local49[local55] = this.anInt6802;
				local53[local55] = this.anInt6798;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(IIII)V")
	private void method5180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 - (arg0 * arg1 >> 12);
		if (local29 <= 0) {
			this.anInt6808 = this.anInt6802 = this.anInt6798 = arg1;
			return;
		}
		@Pc(38) int local38 = arg2 * 6;
		@Pc(45) int local45 = arg1 + arg1 - local29;
		@Pc(53) int local53 = (local29 - local45 << 12) / local29;
		@Pc(57) int local57 = local38 >> 12;
		@Pc(64) int local64 = local38 - (local57 << 12);
		@Pc(72) int local72 = local53 * local29 >> 12;
		@Pc(78) int local78 = local72 * local64 >> 12;
		@Pc(82) int local82 = local78 + local45;
		@Pc(87) int local87 = local29 - local78;
		if (local57 == 0) {
			this.anInt6798 = local45;
			this.anInt6802 = local82;
			this.anInt6808 = local29;
		} else if (local57 == 1) {
			this.anInt6802 = local29;
			this.anInt6808 = local87;
			this.anInt6798 = local45;
		} else if (local57 == 2) {
			this.anInt6798 = local82;
			this.anInt6802 = local29;
			this.anInt6808 = local45;
		} else if (local57 == 3) {
			this.anInt6798 = local29;
			this.anInt6808 = local45;
			this.anInt6802 = local87;
		} else if (local57 == 4) {
			this.anInt6808 = local82;
			this.anInt6798 = local29;
			this.anInt6802 = local45;
		} else if (local57 == 5) {
			this.anInt6798 = local87;
			this.anInt6802 = local45;
			this.anInt6808 = local29;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6807 = arg1.method1215();
		} else if (arg0 == 1) {
			this.anInt6794 = (arg1.method1212() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt6799 = (arg1.method1212() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(IIII)V")
	private void method5184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 < arg1 ? arg1 : arg2;
		@Pc(29) int local29 = arg1 >= arg2 ? arg2 : arg1;
		@Pc(40) int local40 = local12 >= arg0 ? local12 : arg0;
		@Pc(47) int local47 = local29 <= arg0 ? local29 : arg0;
		@Pc(51) int local51 = local40 - local47;
		this.anInt6796 = (local47 + local40) / 2;
		if (local51 > 0) {
			@Pc(69) int local69 = (local40 - arg1 << 12) / local51;
			@Pc(78) int local78 = (local40 - arg2 << 12) / local51;
			@Pc(86) int local86 = (local40 - arg0 << 12) / local51;
			if (local40 == arg1) {
				this.anInt6800 = arg2 == local47 ? local86 + 20480 : -local78 + 4096;
			} else if (arg2 == local40) {
				this.anInt6800 = local47 == arg0 ? local69 + 4096 : 12288 - local86;
			} else {
				this.anInt6800 = arg1 == local47 ? local78 + 12288 : -local69 + 20480;
			}
			this.anInt6800 /= 6;
		} else {
			this.anInt6800 = 0;
		}
		if (this.anInt6796 > 0 && this.anInt6796 < 4096) {
			this.anInt6809 = (local51 << 12) / (this.anInt6796 > 2048 ? 8192 - (this.anInt6796 * 2) : this.anInt6796 * 2);
		} else {
			this.anInt6809 = 0;
		}
	}
}
