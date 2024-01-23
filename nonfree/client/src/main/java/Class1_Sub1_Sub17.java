import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
	private int anInt2180;

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
	private int anInt2183;

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
	private int anInt2184;

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
	private int anInt2186;

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
	private int anInt2188;

	@OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
	private int anInt2190;

	@OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
	private int anInt2181 = 0;

	@OriginalMember(owner = "client!hi", name = "S", descriptor = "I")
	private int anInt2191 = 0;

	@OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
	private int anInt2192 = 0;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V")
	private void method1973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) int local32 = arg1 > 2048 ? arg2 + arg1 - (arg1 * arg2 >> 12) : arg1 * (arg2 + 4096) >> 12;
		if (local32 <= 0) {
			this.anInt2184 = this.anInt2186 = this.anInt2188 = arg1;
			return;
		}
		@Pc(50) int local50 = arg0 * 6;
		@Pc(58) int local58 = arg1 + arg1 - local32;
		@Pc(67) int local67 = (local32 - local58 << 12) / local32;
		@Pc(71) int local71 = local50 >> 12;
		@Pc(79) int local79 = local67 * local32 >> 12;
		@Pc(86) int local86 = local50 - (local71 << 12);
		@Pc(92) int local92 = local86 * local79 >> 12;
		@Pc(97) int local97 = local32 - local92;
		@Pc(102) int local102 = local58 + local92;
		if (local71 == 0) {
			this.anInt2186 = local102;
			this.anInt2184 = local32;
			this.anInt2188 = local58;
		} else if (local71 == 1) {
			this.anInt2186 = local32;
			this.anInt2184 = local97;
			this.anInt2188 = local58;
		} else if (local71 == 2) {
			this.anInt2184 = local58;
			this.anInt2188 = local102;
			this.anInt2186 = local32;
		} else if (local71 == 3) {
			this.anInt2184 = local58;
			this.anInt2188 = local32;
			this.anInt2186 = local97;
		} else if (local71 == 4) {
			this.anInt2188 = local32;
			this.anInt2186 = local58;
			this.anInt2184 = local102;
		} else if (local71 == 5) {
			this.anInt2184 = local32;
			this.anInt2186 = local58;
			this.anInt2188 = local97;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(22) int[][] local22 = this.method4456(arg0, 0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local22[2];
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			for (@Pc(48) int local48 = 0; local48 < Static6.anInt4960; local48++) {
				this.method1975(local34[local48], local30[local48], local26[local48]);
				this.anInt2180 += this.anInt2181;
				this.anInt2190 += this.anInt2192;
				if (this.anInt2180 < 0) {
					this.anInt2180 = 0;
				}
				if (this.anInt2190 < 0) {
					this.anInt2190 = 0;
				}
				if (this.anInt2190 > 4096) {
					this.anInt2190 = 4096;
				}
				if (this.anInt2180 > 4096) {
					this.anInt2180 = 4096;
				}
				for (this.anInt2183 += this.anInt2191; this.anInt2183 < 0; this.anInt2183 += 4096) {
				}
				while (this.anInt2183 > 4096) {
					this.anInt2183 -= 4096;
				}
				this.method1973(this.anInt2183, this.anInt2190, this.anInt2180);
				local38[local48] = this.anInt2184;
				local42[local48] = this.anInt2186;
				local46[local48] = this.anInt2188;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIII)V")
	private void method1975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(19) int local19 = arg0 <= local12 ? local12 : arg0;
		@Pc(26) int local26 = arg2 >= arg1 ? arg1 : arg2;
		@Pc(37) int local37 = arg0 >= local26 ? local26 : arg0;
		@Pc(42) int local42 = local19 - local37;
		if (local42 <= 0) {
			this.anInt2183 = 0;
		} else {
			@Pc(58) int local58 = (local19 - arg1 << 12) / local42;
			@Pc(67) int local67 = (local19 - arg0 << 12) / local42;
			@Pc(76) int local76 = (local19 - arg2 << 12) / local42;
			if (local19 == arg2) {
				this.anInt2183 = arg1 == local37 ? local67 + 20480 : -local58 + 4096;
			} else if (local19 == arg1) {
				this.anInt2183 = arg0 == local37 ? local76 + 4096 : -local67 + 12288;
			} else {
				this.anInt2183 = local37 == arg2 ? local58 + 12288 : 20480 - local76;
			}
			this.anInt2183 /= 6;
		}
		this.anInt2190 = (local37 + local19) / 2;
		if (this.anInt2190 > 0 && this.anInt2190 < 4096) {
			this.anInt2180 = (local42 << 12) / (this.anInt2190 <= 2048 ? this.anInt2190 * 2 : 8192 - (this.anInt2190 * 2));
		} else {
			this.anInt2180 = 0;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2191 = arg0.method1843();
		} else if (arg1 == 1) {
			this.anInt2181 = (arg0.method1829() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt2192 = (arg0.method1829() << 12) / 100;
		}
	}
}
