import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class4_Sub1_Sub30 extends Class4_Sub1 {

	@OriginalMember(owner = "client!su", name = "D", descriptor = "I")
	private int anInt8927;

	@OriginalMember(owner = "client!su", name = "J", descriptor = "I")
	private int anInt8933;

	@OriginalMember(owner = "client!su", name = "L", descriptor = "I")
	private int anInt8935;

	@OriginalMember(owner = "client!su", name = "M", descriptor = "I")
	private int anInt8936;

	@OriginalMember(owner = "client!su", name = "O", descriptor = "I")
	private int anInt8938;

	@OriginalMember(owner = "client!su", name = "P", descriptor = "I")
	private int anInt8939;

	@OriginalMember(owner = "client!su", name = "G", descriptor = "I")
	private int anInt8930 = 0;

	@OriginalMember(owner = "client!su", name = "E", descriptor = "I")
	private int anInt8928 = 0;

	@OriginalMember(owner = "client!su", name = "K", descriptor = "I")
	private int anInt8934 = 0;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIII)V")
	private void method7292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(35) int local35 = arg1 <= local16 ? local16 : arg1;
		@Pc(46) int local46 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(53) int local53 = arg1 >= local46 ? local46 : arg1;
		this.anInt8939 = (local53 + local35) / 2;
		@Pc(65) int local65 = local35 - local53;
		if (local65 <= 0) {
			this.anInt8933 = 0;
		} else {
			@Pc(81) int local81 = (local35 - arg0 << 12) / local65;
			@Pc(90) int local90 = (local35 - arg2 << 12) / local65;
			@Pc(99) int local99 = (local35 - arg1 << 12) / local65;
			if (local35 == arg0) {
				this.anInt8933 = local53 == arg2 ? local99 + 20480 : -local90 + 4096;
			} else if (local35 == arg2) {
				this.anInt8933 = local53 == arg1 ? local81 + 4096 : -local99 + 12288;
			} else {
				this.anInt8933 = local53 == arg0 ? local90 + 12288 : -local81 + 20480;
			}
			this.anInt8933 /= 6;
		}
		if (this.anInt8939 > 0 && this.anInt8939 < 4096) {
			this.anInt8938 = (local65 << 12) / (this.anInt8939 > 2048 ? 8192 - (this.anInt8939 * 2) : this.anInt8939 * 2);
		} else {
			this.anInt8938 = 0;
		}
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(IIII)V")
	private void method7294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg0 > 2048 ? arg2 + arg0 - (arg2 * arg0 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local31 <= 0) {
			this.anInt8936 = this.anInt8935 = this.anInt8927 = arg0;
			return;
		}
		@Pc(50) int local50 = arg1 * 6;
		@Pc(57) int local57 = arg0 + arg0 - local31;
		@Pc(66) int local66 = (local31 - local57 << 12) / local31;
		@Pc(70) int local70 = local50 >> 12;
		@Pc(76) int local76 = local50 - (local70 << 12);
		@Pc(84) int local84 = local66 * local31 >> 12;
		@Pc(90) int local90 = local76 * local84 >> 12;
		@Pc(94) int local94 = local90 + local57;
		@Pc(99) int local99 = local31 - local90;
		if (local70 == 0) {
			this.anInt8927 = local57;
			this.anInt8936 = local31;
			this.anInt8935 = local94;
		} else if (local70 == 1) {
			this.anInt8935 = local31;
			this.anInt8927 = local57;
			this.anInt8936 = local99;
		} else if (local70 == 2) {
			this.anInt8936 = local57;
			this.anInt8935 = local31;
			this.anInt8927 = local94;
		} else if (local70 == 3) {
			this.anInt8927 = local31;
			this.anInt8935 = local99;
			this.anInt8936 = local57;
		} else if (local70 == 4) {
			this.anInt8936 = local94;
			this.anInt8927 = local31;
			this.anInt8935 = local57;
		} else if (local70 == 5) {
			this.anInt8936 = local31;
			this.anInt8927 = local99;
			this.anInt8935 = local57;
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(26) int[][] local26 = this.method8385(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static376.anInt7260; local52++) {
				this.method7292(local30[local52], local38[local52], local34[local52]);
				this.anInt8938 += this.anInt8928;
				this.anInt8939 += this.anInt8934;
				for (this.anInt8933 += this.anInt8930; this.anInt8933 < 0; this.anInt8933 += 4096) {
				}
				if (this.anInt8938 < 0) {
					this.anInt8938 = 0;
				}
				while (this.anInt8933 > 4096) {
					this.anInt8933 -= 4096;
				}
				if (this.anInt8938 > 4096) {
					this.anInt8938 = 4096;
				}
				if (this.anInt8939 < 0) {
					this.anInt8939 = 0;
				}
				if (this.anInt8939 > 4096) {
					this.anInt8939 = 4096;
				}
				this.method7294(this.anInt8939, this.anInt8933, this.anInt8938);
				local42[local52] = this.anInt8936;
				local46[local52] = this.anInt8935;
				local50[local52] = this.anInt8927;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt8930 = arg1.method4946();
		} else if (arg0 == 1) {
			this.anInt8928 = (arg1.method4925() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt8934 = (arg1.method4925() << 12) / 100;
		}
	}
}
