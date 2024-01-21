import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
	private int anInt600;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!ca", name = "lb", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!ca", name = "mb", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!ca", name = "pb", descriptor = "I")
	private int anInt613;

	@OriginalMember(owner = "client!ca", name = "ub", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!ca", name = "eb", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!ca", name = "ob", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!ca", name = "qb", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt612 = arg0.method875();
		} else if (arg1 == 1) {
			this.anInt614 = (arg0.method900() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt604 = (arg0.method900() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZII)V")
	private void method351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg1 <= 2048 ? (arg2 + 4096) * arg1 >> 12 : arg1 + arg2 - (arg2 * arg1 >> 12);
		if (local28 <= 0) {
			this.anInt613 = this.anInt609 = this.anInt600 = arg1;
			return;
		}
		@Pc(48) int local48 = arg1 + arg1 - local28;
		@Pc(57) int local57 = (local28 - local48 << 12) / local28;
		@Pc(61) int local61 = arg0 * 6;
		@Pc(65) int local65 = local61 >> 12;
		@Pc(72) int local72 = local61 - (local65 << 12);
		@Pc(80) int local80 = local57 * local28 >> 12;
		@Pc(86) int local86 = local80 * local72 >> 12;
		@Pc(90) int local90 = local48 + local86;
		@Pc(95) int local95 = local28 - local86;
		if (local65 == 0) {
			this.anInt609 = local90;
			this.anInt613 = local28;
			this.anInt600 = local48;
		} else if (local65 == 1) {
			this.anInt613 = local95;
			this.anInt609 = local28;
			this.anInt600 = local48;
		} else if (local65 == 2) {
			this.anInt613 = local48;
			this.anInt600 = local90;
			this.anInt609 = local28;
		} else if (local65 == 3) {
			this.anInt609 = local95;
			this.anInt600 = local28;
			this.anInt613 = local48;
		} else if (local65 == 4) {
			this.anInt613 = local90;
			this.anInt609 = local48;
			this.anInt600 = local28;
		} else if (local65 == 5) {
			this.anInt609 = local48;
			this.anInt613 = local28;
			this.anInt600 = local95;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBII)V")
	private void method353(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 <= arg1 ? arg1 : arg0;
		@Pc(27) int local27 = local16 < arg2 ? arg2 : local16;
		@Pc(37) int local37 = arg1 > arg0 ? arg0 : arg1;
		@Pc(48) int local48 = local37 > arg2 ? arg2 : local37;
		this.anInt602 = (local27 + local48) / 2;
		@Pc(60) int local60 = local27 - local48;
		if (local60 <= 0) {
			return;
		}
		if (this.anInt602 > 0 && this.anInt602 < 4096) {
			this.anInt610 = (local60 << 12) / (this.anInt602 > 2048 ? 8192 - this.anInt602 * 2 : this.anInt602 * 2);
		}
		@Pc(106) int local106 = (local27 - arg0 << 12) / local60;
		@Pc(115) int local115 = (local27 - arg2 << 12) / local60;
		@Pc(123) int local123 = (local27 - arg1 << 12) / local60;
		if (arg0 == local27) {
			this.anInt616 = arg1 == local48 ? local115 + 20480 : 4096 - local123;
		} else if (arg1 == local27) {
			this.anInt616 = local48 == arg2 ? local106 + 4096 : -local115 + 12288;
		} else {
			this.anInt616 = local48 == arg0 ? local123 + 12288 : -local106 + 20480;
		}
		this.anInt616 /= 6;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(26) int[][] local26 = this.method3118(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local16[2];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local26[2];
			for (@Pc(52) int local52 = 0; local52 < Static110.anInt2825; local52++) {
				this.method353(local34[local52], local30[local52], local50[local52]);
				this.anInt610 += this.anInt614;
				this.anInt602 += this.anInt604;
				for (this.anInt616 += this.anInt612; this.anInt616 < 0; this.anInt616 += 4096) {
				}
				while (this.anInt616 > 4096) {
					this.anInt616 -= 4096;
				}
				if (this.anInt610 < 0) {
					this.anInt610 = 0;
				}
				if (this.anInt602 < 0) {
					this.anInt602 = 0;
				}
				if (this.anInt610 > 4096) {
					this.anInt610 = 4096;
				}
				if (this.anInt602 > 4096) {
					this.anInt602 = 4096;
				}
				this.method351(this.anInt616, this.anInt602, this.anInt610);
				local46[local52] = this.anInt613;
				local38[local52] = this.anInt609;
				local42[local52] = this.anInt600;
			}
		}
		return local16;
	}
}
