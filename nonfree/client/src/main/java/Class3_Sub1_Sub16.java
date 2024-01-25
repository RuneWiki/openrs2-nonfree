import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
	private int anInt2490;

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
	private int anInt2495;

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
	private int anInt2498;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
	private int anInt2499;

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
	private int anInt2500;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
	private int anInt2492 = 0;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
	private int anInt2496 = 0;

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
	private int anInt2488 = 0;

	static {
		new Class57("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BIII)V")
	private void method2089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 >= arg2 ? arg0 : arg2;
		@Pc(23) int local23 = arg2 < arg0 ? arg2 : arg0;
		@Pc(30) int local30 = local16 < arg1 ? arg1 : local16;
		@Pc(37) int local37 = arg1 >= local23 ? local23 : arg1;
		this.anInt2498 = (local37 + local30) / 2;
		@Pc(49) int local49 = local30 - local37;
		if (this.anInt2498 > 0 && this.anInt2498 < 4096) {
			this.anInt2495 = (local49 << 12) / (this.anInt2498 <= 2048 ? this.anInt2498 * 2 : 8192 - (this.anInt2498 * 2));
		} else {
			this.anInt2495 = 0;
		}
		if (local49 <= 0) {
			this.anInt2494 = 0;
			return;
		}
		@Pc(103) int local103 = (local30 - arg2 << 12) / local49;
		@Pc(112) int local112 = (local30 - arg0 << 12) / local49;
		@Pc(121) int local121 = (local30 - arg1 << 12) / local49;
		if (arg2 == local30) {
			this.anInt2494 = arg0 == local37 ? local121 + 20480 : -local112 + 4096;
		} else if (arg0 == local30) {
			this.anInt2494 = arg1 == local37 ? local103 + 4096 : -local121 + 12288;
		} else {
			this.anInt2494 = local37 == arg2 ? local112 + 12288 : -local103 + 20480;
		}
		this.anInt2494 /= 6;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2496 = arg0.method2740();
		} else if (arg1 == 1) {
			this.anInt2492 = (arg0.method2753() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt2488 = (arg0.method2753() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	private void method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 > 2048 ? arg2 + arg0 - (arg2 * arg0 >> 12) : arg2 * (arg0 + 4096) >> 12;
		if (local31 <= 0) {
			this.anInt2499 = this.anInt2500 = this.anInt2490 = arg2;
			return;
		}
		@Pc(40) int local40 = arg1 * 6;
		@Pc(46) int local46 = arg2 + arg2 - local31;
		@Pc(54) int local54 = (local31 - local46 << 12) / local31;
		@Pc(58) int local58 = local40 >> 12;
		@Pc(64) int local64 = local40 - (local58 << 12);
		@Pc(72) int local72 = local54 * local31 >> 12;
		@Pc(78) int local78 = local64 * local72 >> 12;
		@Pc(82) int local82 = local78 + local46;
		@Pc(87) int local87 = local31 - local78;
		if (local58 == 0) {
			this.anInt2490 = local46;
			this.anInt2500 = local82;
			this.anInt2499 = local31;
			return;
		}
		if (local58 == 1) {
			this.anInt2500 = local31;
			this.anInt2499 = local87;
			this.anInt2490 = local46;
			return;
		}
		if (local58 == 2) {
			this.anInt2500 = local31;
			this.anInt2490 = local82;
			this.anInt2499 = local46;
			return;
		}
		if (local58 == 3) {
			this.anInt2499 = local46;
			this.anInt2500 = local87;
			this.anInt2490 = local31;
			return;
		}
		if (local58 == 4) {
			this.anInt2490 = local31;
			this.anInt2500 = local46;
			this.anInt2499 = local82;
			return;
		}
		if (local58 == 5) {
			this.anInt2490 = local87;
			this.anInt2499 = local31;
			this.anInt2500 = local46;
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(21) int[][] local21 = this.method5551(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static238.anInt4221; local47++) {
				this.method2089(local29[local47], local33[local47], local25[local47]);
				this.anInt2495 += this.anInt2492;
				this.anInt2498 += this.anInt2488;
				for (this.anInt2494 += this.anInt2496; this.anInt2494 < 0; this.anInt2494 += 4096) {
				}
				if (this.anInt2495 < 0) {
					this.anInt2495 = 0;
				}
				while (this.anInt2494 > 4096) {
					this.anInt2494 -= 4096;
				}
				if (this.anInt2495 > 4096) {
					this.anInt2495 = 4096;
				}
				if (this.anInt2498 < 0) {
					this.anInt2498 = 0;
				}
				if (this.anInt2498 > 4096) {
					this.anInt2498 = 4096;
				}
				this.method2091(this.anInt2495, this.anInt2494, this.anInt2498);
				local37[local47] = this.anInt2499;
				local41[local47] = this.anInt2500;
				local45[local47] = this.anInt2490;
			}
		}
		return local11;
	}
}
