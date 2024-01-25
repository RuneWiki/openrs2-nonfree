import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class3_Sub1_Sub23 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mo", name = "I", descriptor = "I")
	private int anInt6855;

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
	private int anInt6860;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
	private int anInt6863;

	@OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
	private int anInt6864;

	@OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
	private int anInt6865;

	@OriginalMember(owner = "client!mo", name = "Y", descriptor = "I")
	private int anInt6869;

	@OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
	private int anInt6857 = 0;

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
	private int anInt6856 = 0;

	@OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
	private int anInt6859 = 0;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V")
	private void method5720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = arg0 > 2048 ? arg0 + arg2 - (arg2 * arg0 >> 12) : (4096 - -arg2) * arg0 >> 12;
		if (local26 <= 0) {
			this.anInt6869 = this.anInt6863 = this.anInt6864 = arg0;
			return;
		}
		@Pc(36) int local36 = arg1 * 6;
		@Pc(43) int local43 = arg0 + arg0 - local26;
		@Pc(52) int local52 = (local26 - local43 << 12) / local26;
		@Pc(56) int local56 = local36 >> 12;
		@Pc(63) int local63 = local36 - (local56 << 12);
		@Pc(71) int local71 = local52 * local26 >> 12;
		@Pc(77) int local77 = local71 * local63 >> 12;
		@Pc(81) int local81 = local77 + local43;
		@Pc(85) int local85 = local26 - local77;
		if (local56 == 0) {
			this.anInt6869 = local26;
			this.anInt6863 = local81;
			this.anInt6864 = local43;
			return;
		}
		if (local56 == 1) {
			this.anInt6869 = local85;
			this.anInt6863 = local26;
			this.anInt6864 = local43;
			return;
		}
		if (local56 == 2) {
			this.anInt6863 = local26;
			this.anInt6869 = local43;
			this.anInt6864 = local81;
			return;
		}
		if (local56 == 3) {
			this.anInt6869 = local43;
			this.anInt6863 = local85;
			this.anInt6864 = local26;
			return;
		}
		if (local56 == 4) {
			this.anInt6863 = local43;
			this.anInt6864 = local26;
			this.anInt6869 = local81;
			return;
		}
		if (local56 == 5) {
			this.anInt6863 = local43;
			this.anInt6864 = local85;
			this.anInt6869 = local26;
			return;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIII)V")
	private void method5721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg0 < arg2 ? arg2 : arg0;
		@Pc(31) int local31 = arg2 >= arg0 ? arg0 : arg2;
		@Pc(38) int local38 = local20 < arg1 ? arg1 : local20;
		@Pc(49) int local49 = arg1 >= local31 ? local31 : arg1;
		@Pc(54) int local54 = local38 - local49;
		this.anInt6860 = (local49 + local38) / 2;
		if (this.anInt6860 > 0 && this.anInt6860 < 4096) {
			this.anInt6855 = (local54 << 12) / (this.anInt6860 <= 2048 ? this.anInt6860 * 2 : 8192 - (this.anInt6860 * 2));
		} else {
			this.anInt6855 = 0;
		}
		if (local54 <= 0) {
			this.anInt6865 = 0;
			return;
		}
		@Pc(116) int local116 = (local38 - arg2 << 12) / local54;
		@Pc(124) int local124 = (local38 - arg0 << 12) / local54;
		@Pc(133) int local133 = (local38 - arg1 << 12) / local54;
		if (arg2 == local38) {
			this.anInt6865 = arg0 == local49 ? local133 + 20480 : -local124 + 4096;
		} else if (arg0 == local38) {
			this.anInt6865 = local49 == arg1 ? local116 + 4096 : 12288 - local133;
		} else {
			this.anInt6865 = arg2 == local49 ? local124 + 12288 : -local116 + 20480;
		}
		this.anInt6865 /= 6;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(21) int[][] local21 = this.method8360(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static131.anInt2935; local47++) {
				this.method5721(local29[local47], local33[local47], local25[local47]);
				this.anInt6860 += this.anInt6856;
				this.anInt6855 += this.anInt6857;
				for (this.anInt6865 += this.anInt6859; this.anInt6865 < 0; this.anInt6865 += 4096) {
				}
				if (this.anInt6855 < 0) {
					this.anInt6855 = 0;
				}
				while (this.anInt6865 > 4096) {
					this.anInt6865 -= 4096;
				}
				if (this.anInt6860 < 0) {
					this.anInt6860 = 0;
				}
				if (this.anInt6855 > 4096) {
					this.anInt6855 = 4096;
				}
				if (this.anInt6860 > 4096) {
					this.anInt6860 = 4096;
				}
				this.method5720(this.anInt6860, this.anInt6865, this.anInt6855);
				local37[local47] = this.anInt6869;
				local41[local47] = this.anInt6863;
				local45[local47] = this.anInt6864;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6859 = arg1.method6525();
		} else if (arg0 == 1) {
			this.anInt6857 = (arg1.method6529() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt6856 = (arg1.method6529() << 12) / 100;
		}
	}
}
