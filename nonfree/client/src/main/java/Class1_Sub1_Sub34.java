import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sh", name = "kb", descriptor = "I")
	private int anInt3832;

	@OriginalMember(owner = "client!sh", name = "mb", descriptor = "I")
	private int anInt3833;

	@OriginalMember(owner = "client!sh", name = "ob", descriptor = "I")
	private int anInt3835;

	@OriginalMember(owner = "client!sh", name = "wb", descriptor = "I")
	private int anInt3841;

	@OriginalMember(owner = "client!sh", name = "yb", descriptor = "I")
	private int anInt3842;

	@OriginalMember(owner = "client!sh", name = "Ab", descriptor = "I")
	private int anInt3844;

	@OriginalMember(owner = "client!sh", name = "nb", descriptor = "I")
	private int anInt3834 = 0;

	@OriginalMember(owner = "client!sh", name = "pb", descriptor = "I")
	private int anInt3836 = 0;

	@OriginalMember(owner = "client!sh", name = "sb", descriptor = "I")
	private int anInt3839 = 0;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBI)V")
	private void method2918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg1 <= arg0 ? arg0 : arg1;
		@Pc(31) int local31 = arg1 >= arg0 ? arg0 : arg1;
		@Pc(38) int local38 = arg2 >= local31 ? local31 : arg2;
		@Pc(45) int local45 = arg2 <= local20 ? local20 : arg2;
		this.anInt3833 = (local45 + local38) / 2;
		@Pc(57) int local57 = local45 - local38;
		if (local57 <= 0) {
			this.anInt3844 = 0;
		} else {
			@Pc(72) int local72 = (local45 - arg1 << 12) / local57;
			@Pc(81) int local81 = (local45 - arg2 << 12) / local57;
			@Pc(90) int local90 = (local45 - arg0 << 12) / local57;
			if (arg1 == local45) {
				this.anInt3844 = local38 == arg0 ? local81 + 20480 : 4096 - local90;
			} else if (arg0 == local45) {
				this.anInt3844 = local38 == arg2 ? local72 + 4096 : -local81 + 12288;
			} else {
				this.anInt3844 = local38 == arg1 ? local90 + 12288 : -local72 + 20480;
			}
			this.anInt3844 /= 6;
		}
		if (this.anInt3833 > 0 && this.anInt3833 < 4096) {
			this.anInt3832 = (local57 << 12) / (this.anInt3833 <= 2048 ? this.anInt3833 * 2 : 8192 - (this.anInt3833 * 2));
		} else {
			this.anInt3832 = 0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
	private void method2920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25 = arg1 > 2048 ? arg1 + arg2 - (arg2 * arg1 >> 12) : arg1 * (arg2 + 4096) >> 12;
		if (local25 <= 0) {
			this.anInt3841 = this.anInt3835 = this.anInt3842 = arg1;
			return;
		}
		@Pc(34) int local34 = arg0 * 6;
		@Pc(41) int local41 = arg1 + arg1 - local25;
		@Pc(50) int local50 = (local25 - local41 << 12) / local25;
		@Pc(54) int local54 = local34 >> 12;
		@Pc(61) int local61 = local34 - (local54 << 12);
		@Pc(69) int local69 = local50 * local25 >> 12;
		@Pc(75) int local75 = local61 * local69 >> 12;
		@Pc(79) int local79 = local75 + local41;
		@Pc(84) int local84 = local25 - local75;
		if (local54 == 0) {
			this.anInt3842 = local41;
			this.anInt3835 = local79;
			this.anInt3841 = local25;
		} else if (local54 == 1) {
			this.anInt3841 = local84;
			this.anInt3842 = local41;
			this.anInt3835 = local25;
		} else if (local54 == 2) {
			this.anInt3835 = local25;
			this.anInt3841 = local41;
			this.anInt3842 = local79;
		} else if (local54 == 3) {
			this.anInt3835 = local84;
			this.anInt3841 = local41;
			this.anInt3842 = local25;
		} else if (local54 == 4) {
			this.anInt3841 = local79;
			this.anInt3835 = local41;
			this.anInt3842 = local25;
		} else if (local54 == 5) {
			this.anInt3841 = local25;
			this.anInt3835 = local41;
			this.anInt3842 = local84;
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(14) int[][] local14 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(24) int[][] local24 = this.method3307(0, arg0);
			@Pc(28) int[] local28 = local24[1];
			@Pc(32) int[] local32 = local24[0];
			@Pc(36) int[] local36 = local24[2];
			@Pc(40) int[] local40 = local14[0];
			@Pc(44) int[] local44 = local14[1];
			@Pc(48) int[] local48 = local14[2];
			for (@Pc(50) int local50 = 0; local50 < Static176.anInt3921; local50++) {
				this.method2918(local28[local50], local32[local50], local36[local50]);
				this.anInt3833 += this.anInt3839;
				if (this.anInt3833 < 0) {
					this.anInt3833 = 0;
				}
				for (this.anInt3844 += this.anInt3836; this.anInt3844 < 0; this.anInt3844 += 4096) {
				}
				while (this.anInt3844 > 4096) {
					this.anInt3844 -= 4096;
				}
				if (this.anInt3833 > 4096) {
					this.anInt3833 = 4096;
				}
				this.anInt3832 += this.anInt3834;
				if (this.anInt3832 < 0) {
					this.anInt3832 = 0;
				}
				if (this.anInt3832 > 4096) {
					this.anInt3832 = 4096;
				}
				this.method2920(this.anInt3844, this.anInt3833, this.anInt3832);
				local40[local50] = this.anInt3841;
				local44[local50] = this.anInt3835;
				local48[local50] = this.anInt3842;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt3836 = arg1.method1729();
		} else if (arg0 == 1) {
			this.anInt3834 = (arg1.method1720() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3839 = (arg1.method1720() << 12) / 100;
		}
	}
}
