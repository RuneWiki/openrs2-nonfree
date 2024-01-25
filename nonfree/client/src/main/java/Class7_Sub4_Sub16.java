import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class7_Sub4_Sub16 extends Class7_Sub4 {

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
	private int anInt3493;

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
	private int anInt3495;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
	private int anInt3496;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
	private int anInt3497;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
	private int anInt3510;

	@OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
	private int anInt3514;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
	private int anInt3494 = 0;

	@OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
	private int anInt3516 = 0;

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
	private int anInt3505 = 0;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
	private void method3212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 > arg2 ? arg0 : arg2;
		@Pc(23) int local23 = arg2 <= arg0 ? arg2 : arg0;
		@Pc(34) int local34 = arg1 > local16 ? arg1 : local16;
		@Pc(45) int local45 = local23 > arg1 ? arg1 : local23;
		this.anInt3514 = (local34 + local45) / 2;
		@Pc(57) int local57 = local34 - local45;
		if (local57 <= 0) {
			this.anInt3497 = 0;
		} else {
			@Pc(76) int local76 = (local34 - arg0 << 12) / local57;
			@Pc(85) int local85 = (local34 - arg2 << 12) / local57;
			@Pc(93) int local93 = (local34 - arg1 << 12) / local57;
			if (arg0 == local34) {
				this.anInt3497 = arg2 == local45 ? local93 + 20480 : -local85 + 4096;
			} else if (local34 == arg2) {
				this.anInt3497 = local45 == arg1 ? local76 + 4096 : -local93 + 12288;
			} else {
				this.anInt3497 = arg0 == local45 ? local85 + 12288 : -local76 + 20480;
			}
			this.anInt3497 /= 6;
		}
		if (this.anInt3514 > 0 && this.anInt3514 < 4096) {
			this.anInt3495 = (local57 << 12) / (this.anInt3514 <= 2048 ? this.anInt3514 * 2 : 8192 - (this.anInt3514 * 2));
		} else {
			this.anInt3495 = 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3505 = arg0.method2744();
		} else if (arg1 == 1) {
			this.anInt3494 = (arg0.method2779() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3516 = (arg0.method2779() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(21) int[][] local21 = this.method5638(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static201.anInt4174; local47++) {
				this.method3212(local25[local47], local33[local47], local29[local47]);
				this.anInt3497 += this.anInt3505;
				this.anInt3514 += this.anInt3516;
				this.anInt3495 += this.anInt3494;
				while (this.anInt3497 < 0) {
					this.anInt3497 += 4096;
				}
				if (this.anInt3495 < 0) {
					this.anInt3495 = 0;
				}
				while (this.anInt3497 > 4096) {
					this.anInt3497 -= 4096;
				}
				if (this.anInt3495 > 4096) {
					this.anInt3495 = 4096;
				}
				if (this.anInt3514 < 0) {
					this.anInt3514 = 0;
				}
				if (this.anInt3514 > 4096) {
					this.anInt3514 = 4096;
				}
				this.method3220(this.anInt3514, this.anInt3497, this.anInt3495);
				local37[local47] = this.anInt3493;
				local41[local47] = this.anInt3496;
				local45[local47] = this.anInt3510;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)V")
	private void method3220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg0 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local27 <= 0) {
			this.anInt3493 = this.anInt3496 = this.anInt3510 = arg0;
			return;
		}
		@Pc(41) int local41 = arg1 * 6;
		@Pc(48) int local48 = arg0 + arg0 - local27;
		@Pc(56) int local56 = (local27 - local48 << 12) / local27;
		@Pc(60) int local60 = local41 >> 12;
		@Pc(67) int local67 = local41 - (local60 << 12);
		@Pc(75) int local75 = local56 * local27 >> 12;
		@Pc(81) int local81 = local75 * local67 >> 12;
		@Pc(85) int local85 = local48 + local81;
		@Pc(90) int local90 = local27 - local81;
		if (local60 == 0) {
			this.anInt3493 = local27;
			this.anInt3496 = local85;
			this.anInt3510 = local48;
			return;
		}
		if (local60 == 1) {
			this.anInt3493 = local90;
			this.anInt3496 = local27;
			this.anInt3510 = local48;
			return;
		}
		if (local60 == 2) {
			this.anInt3496 = local27;
			this.anInt3493 = local48;
			this.anInt3510 = local85;
			return;
		}
		if (local60 == 3) {
			this.anInt3496 = local90;
			this.anInt3493 = local48;
			this.anInt3510 = local27;
			return;
		}
		if (local60 == 4) {
			this.anInt3493 = local85;
			this.anInt3510 = local27;
			this.anInt3496 = local48;
			return;
		}
		if (local60 == 5) {
			this.anInt3510 = local90;
			this.anInt3493 = local27;
			this.anInt3496 = local48;
			return;
		}
	}
}
