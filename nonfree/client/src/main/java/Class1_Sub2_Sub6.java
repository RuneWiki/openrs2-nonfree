import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
	private int anInt2072;

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
	private int anInt2075;

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
	private int anInt2076;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
	private int anInt2080;

	@OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
	private int anInt2083;

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
	private int anInt2078 = 0;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
	private int anInt2073 = 0;

	@OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
	private int anInt2082 = 0;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2078 = arg0.method4531();
		} else if (arg1 == 1) {
			this.anInt2073 = (arg0.method4529() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt2082 = (arg0.method4529() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
	private void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int local20 = arg2 <= arg1 ? arg1 : arg2;
		@Pc(27) int local27 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(34) int local34 = local20 < arg0 ? arg0 : local20;
		@Pc(45) int local45 = local27 <= arg0 ? local27 : arg0;
		@Pc(49) int local49 = local34 - local45;
		this.anInt2083 = (local45 + local34) / 2;
		if (this.anInt2083 > 0 && this.anInt2083 < 4096) {
			this.anInt2076 = (local49 << 12) / (this.anInt2083 > 2048 ? 8192 - (this.anInt2083 * 2) : this.anInt2083 * 2);
		} else {
			this.anInt2076 = 0;
		}
		if (local49 <= 0) {
			this.anInt2072 = 0;
			return;
		}
		@Pc(109) int local109 = (local34 - arg2 << 12) / local49;
		@Pc(118) int local118 = (local34 - arg1 << 12) / local49;
		@Pc(127) int local127 = (local34 - arg0 << 12) / local49;
		if (local34 == arg2) {
			this.anInt2072 = arg1 == local45 ? local127 + 20480 : 4096 - local118;
		} else if (arg1 == local34) {
			this.anInt2072 = arg0 == local45 ? local109 + 4096 : -local127 + 12288;
		} else {
			this.anInt2072 = local45 == arg2 ? local118 + 12288 : -local109 + 20480;
		}
		this.anInt2072 /= 6;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(26) int[][] local26 = this.method5867(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static410.anInt7198; local52++) {
				this.method1698(local38[local52], local34[local52], local30[local52]);
				this.anInt2083 += this.anInt2082;
				this.anInt2072 += this.anInt2078;
				this.anInt2076 += this.anInt2073;
				while (this.anInt2072 < 0) {
					this.anInt2072 += 4096;
				}
				while (this.anInt2072 > 4096) {
					this.anInt2072 -= 4096;
				}
				if (this.anInt2076 < 0) {
					this.anInt2076 = 0;
				}
				if (this.anInt2083 < 0) {
					this.anInt2083 = 0;
				}
				if (this.anInt2076 > 4096) {
					this.anInt2076 = 4096;
				}
				if (this.anInt2083 > 4096) {
					this.anInt2083 = 4096;
				}
				this.method1702(this.anInt2083, this.anInt2076, this.anInt2072);
				local42[local52] = this.anInt2071;
				local46[local52] = this.anInt2080;
				local50[local52] = this.anInt2075;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIII)V")
	private void method1702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg0 <= 2048 ? arg0 * (arg1 + 4096) >> 12 : arg1 + arg0 - (arg1 * arg0 >> 12);
		if (local31 <= 0) {
			this.anInt2071 = this.anInt2080 = this.anInt2075 = arg0;
			return;
		}
		@Pc(47) int local47 = arg2 * 6;
		@Pc(54) int local54 = arg0 + arg0 - local31;
		@Pc(62) int local62 = (local31 - local54 << 12) / local31;
		@Pc(66) int local66 = local47 >> 12;
		@Pc(73) int local73 = local47 - (local66 << 12);
		@Pc(81) int local81 = local31 * local62 >> 12;
		@Pc(87) int local87 = local73 * local81 >> 12;
		@Pc(91) int local91 = local87 + local54;
		@Pc(96) int local96 = local31 - local87;
		if (local66 == 0) {
			this.anInt2075 = local54;
			this.anInt2071 = local31;
			this.anInt2080 = local91;
		} else if (local66 == 1) {
			this.anInt2080 = local31;
			this.anInt2075 = local54;
			this.anInt2071 = local96;
		} else if (local66 == 2) {
			this.anInt2071 = local54;
			this.anInt2075 = local91;
			this.anInt2080 = local31;
		} else if (local66 == 3) {
			this.anInt2075 = local31;
			this.anInt2080 = local96;
			this.anInt2071 = local54;
		} else if (local66 == 4) {
			this.anInt2075 = local31;
			this.anInt2071 = local91;
			this.anInt2080 = local54;
		} else if (local66 == 5) {
			this.anInt2071 = local31;
			this.anInt2080 = local54;
			this.anInt2075 = local96;
		}
	}
}
