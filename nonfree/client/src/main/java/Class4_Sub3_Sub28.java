import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class4_Sub3_Sub28 extends Class4_Sub3 {

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
	private int anInt5089;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
	private int anInt5090;

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
	private int anInt5096;

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
	private int anInt5099;

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
	private int anInt5100;

	@OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
	private int anInt5104;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
	private int anInt5091 = 0;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	private int anInt5095 = 0;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
	private int anInt5094 = 0;

	static {
		new Class21("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5095 = arg1.method4586();
		} else if (arg0 == 1) {
			this.anInt5091 = (arg1.method4576() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5094 = (arg1.method4576() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIZ)V")
	private void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg0 >= arg1 ? arg0 : arg1;
		@Pc(23) int local23 = arg2 > local16 ? arg2 : local16;
		@Pc(30) int local30 = arg0 > arg1 ? arg1 : arg0;
		@Pc(41) int local41 = arg2 >= local30 ? local30 : arg2;
		this.anInt5090 = (local23 + local41) / 2;
		@Pc(62) int local62 = local23 - local41;
		if (this.anInt5090 > 0 && this.anInt5090 < 4096) {
			this.anInt5096 = (local62 << 12) / (this.anInt5090 > 2048 ? 8192 - (this.anInt5090 * 2) : this.anInt5090 * 2);
		} else {
			this.anInt5096 = 0;
		}
		if (local62 <= 0) {
			this.anInt5104 = 0;
			return;
		}
		@Pc(110) int local110 = (local23 - arg1 << 12) / local62;
		@Pc(119) int local119 = (local23 - arg0 << 12) / local62;
		@Pc(127) int local127 = (local23 - arg2 << 12) / local62;
		if (local23 == arg1) {
			this.anInt5104 = arg0 == local41 ? local127 + 20480 : -local119 + 4096;
		} else if (local23 == arg0) {
			this.anInt5104 = local41 == arg2 ? local110 + 4096 : -local127 + 12288;
		} else {
			this.anInt5104 = local41 == arg1 ? local119 + 12288 : -local110 + 20480;
		}
		this.anInt5104 /= 6;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZI)V")
	private void method4310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) int local32 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg0 + arg2 - (arg2 * arg0 >> 12);
		if (local32 <= 0) {
			this.anInt5099 = this.anInt5089 = this.anInt5100 = arg0;
			return;
		}
		@Pc(51) int local51 = arg1 * 6;
		@Pc(57) int local57 = arg0 + arg0 - local32;
		@Pc(66) int local66 = (local32 - local57 << 12) / local32;
		@Pc(70) int local70 = local51 >> 12;
		@Pc(77) int local77 = local51 - (local70 << 12);
		@Pc(85) int local85 = local66 * local32 >> 12;
		@Pc(91) int local91 = local77 * local85 >> 12;
		@Pc(95) int local95 = local91 + local57;
		@Pc(100) int local100 = local32 - local91;
		if (local70 == 0) {
			this.anInt5089 = local95;
			this.anInt5099 = local32;
			this.anInt5100 = local57;
		} else if (local70 == 1) {
			this.anInt5100 = local57;
			this.anInt5089 = local32;
			this.anInt5099 = local100;
		} else if (local70 == 2) {
			this.anInt5089 = local32;
			this.anInt5099 = local57;
			this.anInt5100 = local95;
		} else if (local70 == 3) {
			this.anInt5099 = local57;
			this.anInt5100 = local32;
			this.anInt5089 = local100;
		} else if (local70 == 4) {
			this.anInt5089 = local57;
			this.anInt5100 = local32;
			this.anInt5099 = local95;
		} else if (local70 == 5) {
			this.anInt5100 = local100;
			this.anInt5099 = local32;
			this.anInt5089 = local57;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(21) int[][] local21 = this.method6331(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static304.anInt5637; local47++) {
				this.method4308(local29[local47], local25[local47], local33[local47]);
				this.anInt5104 += this.anInt5095;
				this.anInt5096 += this.anInt5091;
				this.anInt5090 += this.anInt5094;
				while (this.anInt5104 < 0) {
					this.anInt5104 += 4096;
				}
				while (this.anInt5104 > 4096) {
					this.anInt5104 -= 4096;
				}
				if (this.anInt5096 < 0) {
					this.anInt5096 = 0;
				}
				if (this.anInt5090 < 0) {
					this.anInt5090 = 0;
				}
				if (this.anInt5096 > 4096) {
					this.anInt5096 = 4096;
				}
				if (this.anInt5090 > 4096) {
					this.anInt5090 = 4096;
				}
				this.method4310(this.anInt5090, this.anInt5104, this.anInt5096);
				local37[local47] = this.anInt5099;
				local41[local47] = this.anInt5089;
				local45[local47] = this.anInt5100;
			}
		}
		return local11;
	}
}
