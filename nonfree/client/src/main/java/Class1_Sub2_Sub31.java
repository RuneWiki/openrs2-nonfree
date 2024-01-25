import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
	private int anInt5677;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
	private int anInt5679;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
	private int anInt5682;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
	private int anInt5685;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	private int anInt5687;

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
	private int anInt5688;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
	private int anInt5686 = 0;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
	private int anInt5690 = 0;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	private int anInt5693 = 0;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5693 = arg1.method3090();
		} else if (arg0 == 1) {
			this.anInt5686 = (arg1.method3130() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5690 = (arg1.method3130() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBI)V")
	private void method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 <= 2048 ? (arg1 + 4096) * arg2 >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local31 <= 0) {
			this.anInt5687 = this.anInt5688 = this.anInt5677 = arg2;
			return;
		}
		@Pc(50) int local50 = arg0 * 6;
		@Pc(57) int local57 = arg2 + arg2 - local31;
		@Pc(65) int local65 = (local31 - local57 << 12) / local31;
		@Pc(69) int local69 = local50 >> 12;
		@Pc(76) int local76 = local50 - (local69 << 12);
		@Pc(84) int local84 = local31 * local65 >> 12;
		@Pc(90) int local90 = local84 * local76 >> 12;
		@Pc(94) int local94 = local90 + local57;
		@Pc(98) int local98 = local31 - local90;
		if (local69 == 0) {
			this.anInt5677 = local57;
			this.anInt5687 = local31;
			this.anInt5688 = local94;
		} else if (local69 == 1) {
			this.anInt5688 = local31;
			this.anInt5687 = local98;
			this.anInt5677 = local57;
		} else if (local69 == 2) {
			this.anInt5688 = local31;
			this.anInt5677 = local94;
			this.anInt5687 = local57;
		} else if (local69 == 3) {
			this.anInt5677 = local31;
			this.anInt5688 = local98;
			this.anInt5687 = local57;
		} else if (local69 == 4) {
			this.anInt5677 = local31;
			this.anInt5688 = local57;
			this.anInt5687 = local94;
		} else if (local69 == 5) {
			this.anInt5688 = local57;
			this.anInt5687 = local31;
			this.anInt5677 = local98;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(29) int[][] local29 = this.method5659(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static251.anInt6509; local55++) {
				this.method5016(local37[local55], local41[local55], local33[local55]);
				this.anInt5679 += this.anInt5686;
				this.anInt5682 += this.anInt5690;
				for (this.anInt5685 += this.anInt5693; this.anInt5685 < 0; this.anInt5685 += 4096) {
				}
				while (this.anInt5685 > 4096) {
					this.anInt5685 -= 4096;
				}
				if (this.anInt5679 < 0) {
					this.anInt5679 = 0;
				}
				if (this.anInt5682 < 0) {
					this.anInt5682 = 0;
				}
				if (this.anInt5679 > 4096) {
					this.anInt5679 = 4096;
				}
				if (this.anInt5682 > 4096) {
					this.anInt5682 = 4096;
				}
				this.method5012(this.anInt5685, this.anInt5679, this.anInt5682);
				local45[local55] = this.anInt5687;
				local49[local55] = this.anInt5688;
				local53[local55] = this.anInt5677;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZII)V")
	private void method5016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg0 < arg2 ? arg2 : arg0;
		@Pc(29) int local29 = arg2 < arg0 ? arg2 : arg0;
		@Pc(40) int local40 = arg1 <= local18 ? local18 : arg1;
		@Pc(47) int local47 = local29 <= arg1 ? local29 : arg1;
		this.anInt5682 = (local40 + local47) / 2;
		@Pc(58) int local58 = local40 - local47;
		if (local58 > 0) {
			@Pc(69) int local69 = (local40 - arg2 << 12) / local58;
			@Pc(77) int local77 = (local40 - arg0 << 12) / local58;
			@Pc(85) int local85 = (local40 - arg1 << 12) / local58;
			if (local40 == arg2) {
				this.anInt5685 = arg0 == local47 ? local85 + 20480 : 4096 - local77;
			} else if (local40 == arg0) {
				this.anInt5685 = local47 == arg1 ? local69 + 4096 : -local85 + 12288;
			} else {
				this.anInt5685 = local47 == arg2 ? local77 + 12288 : 20480 - local69;
			}
			this.anInt5685 /= 6;
		} else {
			this.anInt5685 = 0;
		}
		if (this.anInt5682 > 0 && this.anInt5682 < 4096) {
			this.anInt5679 = (local58 << 12) / (this.anInt5682 <= 2048 ? this.anInt5682 * 2 : 8192 - (this.anInt5682 * 2));
		} else {
			this.anInt5679 = 0;
		}
	}
}
