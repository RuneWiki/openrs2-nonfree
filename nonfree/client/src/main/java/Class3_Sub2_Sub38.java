import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class3_Sub2_Sub38 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
	private int anInt10098;

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
	private int anInt10101;

	@OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
	private int anInt10103;

	@OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
	private int anInt10105;

	@OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
	private int anInt10111;

	@OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
	private int anInt10114;

	@OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
	private int anInt10107 = 0;

	@OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
	private int anInt10109 = 0;

	@OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
	private int anInt10100 = 0;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBII)V")
	private void method8567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg1 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (arg0 + 4096) * arg1 >> 12;
		if (local33 <= 0) {
			this.anInt10111 = this.anInt10105 = this.anInt10101 = arg1;
			return;
		}
		@Pc(42) int local42 = arg2 * 6;
		@Pc(49) int local49 = arg1 + arg1 - local33;
		@Pc(57) int local57 = (local33 - local49 << 12) / local33;
		@Pc(61) int local61 = local42 >> 12;
		@Pc(67) int local67 = local42 - (local61 << 12);
		@Pc(75) int local75 = local33 * local57 >> 12;
		@Pc(81) int local81 = local67 * local75 >> 12;
		@Pc(85) int local85 = local81 + local49;
		@Pc(90) int local90 = local33 - local81;
		if (local61 == 0) {
			this.anInt10101 = local49;
			this.anInt10111 = local33;
			this.anInt10105 = local85;
			return;
		}
		if (local61 == 1) {
			this.anInt10101 = local49;
			this.anInt10111 = local90;
			this.anInt10105 = local33;
			return;
		}
		if (local61 == 2) {
			this.anInt10105 = local33;
			this.anInt10101 = local85;
			this.anInt10111 = local49;
			return;
		}
		if (local61 == 3) {
			this.anInt10105 = local90;
			this.anInt10111 = local49;
			this.anInt10101 = local33;
			return;
		}
		if (local61 == 4) {
			this.anInt10105 = local49;
			this.anInt10101 = local33;
			this.anInt10111 = local85;
			return;
		}
		if (local61 == 5) {
			this.anInt10105 = local49;
			this.anInt10101 = local90;
			this.anInt10111 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
	private void method8568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 > arg1 ? arg0 : arg1;
		@Pc(23) int local23 = local16 < arg2 ? arg2 : local16;
		@Pc(30) int local30 = arg1 <= arg0 ? arg1 : arg0;
		@Pc(41) int local41 = arg2 >= local30 ? local30 : arg2;
		@Pc(54) int local54 = local23 - local41;
		this.anInt10103 = (local41 + local23) / 2;
		if (local54 <= 0) {
			this.anInt10098 = 0;
		} else {
			@Pc(80) int local80 = (local23 - arg0 << 12) / local54;
			@Pc(88) int local88 = (local23 - arg1 << 12) / local54;
			@Pc(97) int local97 = (local23 - arg2 << 12) / local54;
			if (local23 == arg0) {
				this.anInt10098 = local41 == arg1 ? local97 + 20480 : -local88 + 4096;
			} else if (local23 == arg1) {
				this.anInt10098 = local41 == arg2 ? local80 + 4096 : -local97 + 12288;
			} else {
				this.anInt10098 = local41 == arg0 ? local88 + 12288 : -local80 + 20480;
			}
			this.anInt10098 /= 6;
		}
		if (this.anInt10103 > 0 && this.anInt10103 < 4096) {
			this.anInt10114 = (local54 << 12) / (this.anInt10103 > 2048 ? 8192 - (this.anInt10103 * 2) : this.anInt10103 * 2);
		} else {
			this.anInt10114 = 0;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10100 = arg0.method5624();
		} else if (arg1 == 1) {
			this.anInt10109 = (arg0.method5619() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt10107 = (arg0.method5619() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(21) int[][] local21 = this.method8672(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static201.anInt3738; local47++) {
				this.method8568(local25[local47], local29[local47], local33[local47]);
				this.anInt10114 += this.anInt10109;
				this.anInt10098 += this.anInt10100;
				this.anInt10103 += this.anInt10107;
				while (this.anInt10098 < 0) {
					this.anInt10098 += 4096;
				}
				while (this.anInt10098 > 4096) {
					this.anInt10098 -= 4096;
				}
				if (this.anInt10114 < 0) {
					this.anInt10114 = 0;
				}
				if (this.anInt10103 < 0) {
					this.anInt10103 = 0;
				}
				if (this.anInt10114 > 4096) {
					this.anInt10114 = 4096;
				}
				if (this.anInt10103 > 4096) {
					this.anInt10103 = 4096;
				}
				this.method8567(this.anInt10114, this.anInt10103, this.anInt10098);
				local37[local47] = this.anInt10111;
				local41[local47] = this.anInt10105;
				local45[local47] = this.anInt10101;
			}
		}
		return local11;
	}
}
