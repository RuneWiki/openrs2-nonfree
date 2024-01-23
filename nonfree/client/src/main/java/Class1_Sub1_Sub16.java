import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
	private int anInt2310;

	@OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
	private int anInt2312;

	@OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
	private int anInt2315;

	@OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
	private int anInt2317;

	@OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
	private int anInt2326;

	@OriginalMember(owner = "client!ja", name = "jb", descriptor = "I")
	private int anInt2330;

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
	private int anInt2311 = 0;

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
	private int anInt2324 = 0;

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
	private int anInt2314 = 0;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2324 = arg0.method3064();
		} else if (arg1 == 1) {
			this.anInt2314 = (arg0.method3082() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt2311 = (arg0.method3082() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V")
	private void method1885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) int local37 = arg1 > 2048 ? arg0 + arg1 - (arg1 * arg0 >> 12) : (arg0 + 4096) * arg1 >> 12;
		if (local37 <= 0) {
			this.anInt2330 = this.anInt2315 = this.anInt2317 = arg1;
			return;
		}
		@Pc(46) int local46 = arg2 * 6;
		@Pc(53) int local53 = arg1 + arg1 - local37;
		@Pc(62) int local62 = (local37 - local53 << 12) / local37;
		@Pc(66) int local66 = local46 >> 12;
		@Pc(73) int local73 = local46 - (local66 << 12);
		@Pc(81) int local81 = local37 * local62 >> 12;
		@Pc(87) int local87 = local73 * local81 >> 12;
		@Pc(92) int local92 = local53 + local87;
		@Pc(97) int local97 = local37 - local87;
		if (local66 == 0) {
			this.anInt2330 = local37;
			this.anInt2315 = local92;
			this.anInt2317 = local53;
		} else if (local66 == 1) {
			this.anInt2315 = local37;
			this.anInt2330 = local97;
			this.anInt2317 = local53;
		} else if (local66 == 2) {
			this.anInt2315 = local37;
			this.anInt2317 = local92;
			this.anInt2330 = local53;
		} else if (local66 == 3) {
			this.anInt2315 = local97;
			this.anInt2317 = local37;
			this.anInt2330 = local53;
		} else if (local66 == 4) {
			this.anInt2317 = local37;
			this.anInt2315 = local53;
			this.anInt2330 = local92;
		} else if (local66 == 5) {
			this.anInt2330 = local37;
			this.anInt2315 = local53;
			this.anInt2317 = local97;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIII)V")
	private void method1892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 > arg2 ? arg0 : arg2;
		@Pc(23) int local23 = local8 < arg1 ? arg1 : local8;
		@Pc(30) int local30 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(41) int local41 = arg1 >= local30 ? local30 : arg1;
		this.anInt2326 = (local23 + local41) / 2;
		@Pc(56) int local56 = local23 - local41;
		if (this.anInt2326 > 0 && this.anInt2326 < 4096) {
			this.anInt2310 = (local56 << 12) / (this.anInt2326 > 2048 ? 8192 - (this.anInt2326 * 2) : this.anInt2326 * 2);
		} else {
			this.anInt2310 = 0;
		}
		if (local56 <= 0) {
			this.anInt2312 = 0;
			return;
		}
		@Pc(109) int local109 = (local23 - arg0 << 12) / local56;
		@Pc(118) int local118 = (local23 - arg2 << 12) / local56;
		@Pc(127) int local127 = (local23 - arg1 << 12) / local56;
		if (local23 == arg0) {
			this.anInt2312 = arg2 == local41 ? local127 + 20480 : -local118 + 4096;
		} else if (arg2 == local23) {
			this.anInt2312 = arg1 == local41 ? local109 + 4096 : -local127 + 12288;
		} else {
			this.anInt2312 = local41 == arg0 ? local118 + 12288 : -local109 + 20480;
		}
		this.anInt2312 /= 6;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(26) int[][] local26 = this.method4457(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[1];
			for (@Pc(52) int local52 = 0; local52 < Static131.anInt2513; local52++) {
				this.method1892(local30[local52], local38[local52], local34[local52]);
				this.anInt2312 += this.anInt2324;
				this.anInt2326 += this.anInt2311;
				this.anInt2310 += this.anInt2314;
				while (this.anInt2312 < 0) {
					this.anInt2312 += 4096;
				}
				while (this.anInt2312 > 4096) {
					this.anInt2312 -= 4096;
				}
				if (this.anInt2310 < 0) {
					this.anInt2310 = 0;
				}
				if (this.anInt2310 > 4096) {
					this.anInt2310 = 4096;
				}
				if (this.anInt2326 < 0) {
					this.anInt2326 = 0;
				}
				if (this.anInt2326 > 4096) {
					this.anInt2326 = 4096;
				}
				this.method1885(this.anInt2310, this.anInt2326, this.anInt2312);
				local42[local52] = this.anInt2330;
				local50[local52] = this.anInt2315;
				local46[local52] = this.anInt2317;
			}
		}
		return local16;
	}
}
