import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class14_Sub1_Sub7 extends Class14_Sub1 {

	@OriginalMember(owner = "client!dea", name = "F", descriptor = "I")
	private int anInt2086;

	@OriginalMember(owner = "client!dea", name = "I", descriptor = "I")
	private int anInt2089;

	@OriginalMember(owner = "client!dea", name = "K", descriptor = "I")
	private int anInt2091;

	@OriginalMember(owner = "client!dea", name = "L", descriptor = "I")
	private int anInt2092;

	@OriginalMember(owner = "client!dea", name = "N", descriptor = "I")
	private int anInt2094;

	@OriginalMember(owner = "client!dea", name = "R", descriptor = "I")
	private int anInt2098;

	@OriginalMember(owner = "client!dea", name = "J", descriptor = "I")
	private int anInt2090 = 0;

	@OriginalMember(owner = "client!dea", name = "S", descriptor = "I")
	private int anInt2099 = 0;

	@OriginalMember(owner = "client!dea", name = "T", descriptor = "I")
	private int anInt2100 = 0;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(29) int[][] local29 = this.method8904(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static371.anInt6835; local55++) {
				this.method1773(local33[local55], local41[local55], local37[local55]);
				this.anInt2091 += this.anInt2099;
				this.anInt2092 += this.anInt2100;
				this.anInt2089 += this.anInt2090;
				while (this.anInt2092 < 0) {
					this.anInt2092 += 4096;
				}
				if (this.anInt2089 < 0) {
					this.anInt2089 = 0;
				}
				while (this.anInt2092 > 4096) {
					this.anInt2092 -= 4096;
				}
				if (this.anInt2089 > 4096) {
					this.anInt2089 = 4096;
				}
				if (this.anInt2091 < 0) {
					this.anInt2091 = 0;
				}
				if (this.anInt2091 > 4096) {
					this.anInt2091 = 4096;
				}
				this.method1775(this.anInt2089, this.anInt2092, this.anInt2091);
				local45[local55] = this.anInt2086;
				local49[local55] = this.anInt2098;
				local53[local55] = this.anInt2094;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2100 = arg0.method5890();
		} else if (arg1 == 1) {
			this.anInt2090 = (arg0.method5845() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt2099 = (arg0.method5845() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(BIII)V")
	private void method1773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 >= arg0 ? arg2 : arg0;
		@Pc(31) int local31 = arg2 > arg0 ? arg0 : arg2;
		@Pc(38) int local38 = local16 >= arg1 ? local16 : arg1;
		@Pc(49) int local49 = arg1 < local31 ? arg1 : local31;
		this.anInt2091 = (local49 + local38) / 2;
		@Pc(60) int local60 = local38 - local49;
		if (local60 <= 0) {
			this.anInt2092 = 0;
		} else {
			@Pc(79) int local79 = (local38 - arg0 << 12) / local60;
			@Pc(88) int local88 = (local38 - arg2 << 12) / local60;
			@Pc(96) int local96 = (local38 - arg1 << 12) / local60;
			if (local38 == arg0) {
				this.anInt2092 = arg2 == local49 ? local96 + 20480 : -local88 + 4096;
			} else if (arg2 == local38) {
				this.anInt2092 = arg1 == local49 ? local79 + 4096 : -local96 + 12288;
			} else {
				this.anInt2092 = arg0 == local49 ? local88 + 12288 : -local79 + 20480;
			}
			this.anInt2092 /= 6;
		}
		if (this.anInt2091 > 0 && this.anInt2091 < 4096) {
			this.anInt2089 = (local60 << 12) / (this.anInt2091 > 2048 ? 8192 - (this.anInt2091 * 2) : this.anInt2091 * 2);
		} else {
			this.anInt2089 = 0;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII)V")
	private void method1775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg2 <= 2048 ? arg2 * (arg0 + 4096) >> 12 : arg2 + arg0 - (arg0 * arg2 >> 12);
		if (local27 <= 0) {
			this.anInt2086 = this.anInt2098 = this.anInt2094 = arg2;
			return;
		}
		@Pc(39) int local39 = arg1 * 6;
		@Pc(47) int local47 = arg2 + arg2 - local27;
		@Pc(56) int local56 = (local27 - local47 << 12) / local27;
		@Pc(60) int local60 = local39 >> 12;
		@Pc(66) int local66 = local39 - (local60 << 12);
		@Pc(74) int local74 = local27 * local56 >> 12;
		@Pc(80) int local80 = local66 * local74 >> 12;
		@Pc(85) int local85 = local47 + local80;
		@Pc(90) int local90 = local27 - local80;
		if (local60 == 0) {
			this.anInt2086 = local27;
			this.anInt2098 = local85;
			this.anInt2094 = local47;
			return;
		}
		if (local60 == 1) {
			this.anInt2086 = local90;
			this.anInt2094 = local47;
			this.anInt2098 = local27;
			return;
		}
		if (local60 == 2) {
			this.anInt2086 = local47;
			this.anInt2098 = local27;
			this.anInt2094 = local85;
			return;
		}
		if (local60 == 3) {
			this.anInt2098 = local90;
			this.anInt2094 = local27;
			this.anInt2086 = local47;
			return;
		}
		if (local60 == 4) {
			this.anInt2098 = local47;
			this.anInt2086 = local85;
			this.anInt2094 = local27;
			return;
		}
		if (local60 == 5) {
			this.anInt2098 = local47;
			this.anInt2086 = local27;
			this.anInt2094 = local90;
			return;
		}
	}
}
