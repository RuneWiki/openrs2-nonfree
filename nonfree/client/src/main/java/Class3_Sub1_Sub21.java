import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class3_Sub1_Sub21 extends Class3_Sub1 {

	@OriginalMember(owner = "client!oha", name = "R", descriptor = "I")
	private int anInt7323;

	@OriginalMember(owner = "client!oha", name = "I", descriptor = "I")
	private int anInt7325;

	@OriginalMember(owner = "client!oha", name = "P", descriptor = "I")
	private int anInt7329;

	@OriginalMember(owner = "client!oha", name = "M", descriptor = "I")
	private int anInt7333;

	@OriginalMember(owner = "client!oha", name = "S", descriptor = "I")
	private int anInt7334;

	@OriginalMember(owner = "client!oha", name = "H", descriptor = "I")
	private int anInt7338;

	@OriginalMember(owner = "client!oha", name = "B", descriptor = "I")
	private int anInt7331 = 0;

	@OriginalMember(owner = "client!oha", name = "D", descriptor = "I")
	private int anInt7328 = 0;

	@OriginalMember(owner = "client!oha", name = "L", descriptor = "I")
	private int anInt7332 = 0;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(21) int[][] local21 = this.method9576(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static379.anInt5859; local47++) {
				this.method6340(local33[local47], local29[local47], local25[local47]);
				this.anInt7338 += this.anInt7332;
				this.anInt7334 += this.anInt7328;
				this.anInt7323 += this.anInt7331;
				while (this.anInt7338 < 0) {
					this.anInt7338 += 4096;
				}
				if (this.anInt7323 < 0) {
					this.anInt7323 = 0;
				}
				while (this.anInt7338 > 4096) {
					this.anInt7338 -= 4096;
				}
				if (this.anInt7323 > 4096) {
					this.anInt7323 = 4096;
				}
				if (this.anInt7334 < 0) {
					this.anInt7334 = 0;
				}
				if (this.anInt7334 > 4096) {
					this.anInt7334 = 4096;
				}
				this.method6341(this.anInt7338, this.anInt7323, this.anInt7334);
				local37[local47] = this.anInt7325;
				local41[local47] = this.anInt7329;
				local45[local47] = this.anInt7333;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(BIII)V")
	private void method6340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(25) int local25 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(42) int local42 = arg0 > local17 ? arg0 : local17;
		@Pc(50) int local50 = arg0 < local25 ? arg0 : local25;
		@Pc(55) int local55 = local42 - local50;
		this.anInt7334 = (local42 + local50) / 2;
		if (local55 > 0) {
			@Pc(73) int local73 = (local42 - arg2 << 12) / local55;
			@Pc(81) int local81 = (local42 - arg1 << 12) / local55;
			@Pc(90) int local90 = (local42 - arg0 << 12) / local55;
			if (local42 == arg2) {
				this.anInt7338 = local50 == arg1 ? local90 + 20480 : -local81 + 4096;
			} else if (local42 == arg1) {
				this.anInt7338 = arg0 == local50 ? local73 + 4096 : 12288 - local90;
			} else {
				this.anInt7338 = local50 == arg2 ? local81 + 12288 : -local73 + 20480;
			}
			this.anInt7338 /= 6;
		} else {
			this.anInt7338 = 0;
		}
		if (this.anInt7334 > 0 && this.anInt7334 < 4096) {
			this.anInt7323 = (local55 << 12) / (this.anInt7334 > 2048 ? 8192 - (this.anInt7334 * 2) : this.anInt7334 * 2);
		} else {
			this.anInt7323 = 0;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIB)V")
	private void method6341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(30) int local30 = arg2 > 2048 ? arg2 + arg1 - (arg1 * arg2 >> 12) : (arg1 + 4096) * arg2 >> 12;
		if (local30 <= 0) {
			this.anInt7325 = this.anInt7329 = this.anInt7333 = arg2;
			return;
		}
		@Pc(36) int local36 = arg0 * 6;
		@Pc(43) int local43 = arg2 + arg2 - local30;
		@Pc(52) int local52 = (local30 - local43 << 12) / local30;
		@Pc(56) int local56 = local36 >> 12;
		@Pc(62) int local62 = local36 - (local56 << 12);
		@Pc(70) int local70 = local52 * local30 >> 12;
		@Pc(76) int local76 = local62 * local70 >> 12;
		@Pc(80) int local80 = local43 + local76;
		@Pc(85) int local85 = local30 - local76;
		if (local56 == 0) {
			this.anInt7333 = local43;
			this.anInt7329 = local80;
			this.anInt7325 = local30;
		} else if (local56 == 1) {
			this.anInt7329 = local30;
			this.anInt7333 = local43;
			this.anInt7325 = local85;
		} else if (local56 == 2) {
			this.anInt7329 = local30;
			this.anInt7325 = local43;
			this.anInt7333 = local80;
		} else if (local56 == 3) {
			this.anInt7333 = local30;
			this.anInt7325 = local43;
			this.anInt7329 = local85;
		} else if (local56 == 4) {
			this.anInt7333 = local30;
			this.anInt7329 = local43;
			this.anInt7325 = local80;
		} else if (local56 == 5) {
			this.anInt7329 = local43;
			this.anInt7333 = local85;
			this.anInt7325 = local30;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7332 = arg1.method2017();
		} else if (arg0 == 1) {
			this.anInt7331 = (arg1.method2022() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt7328 = (arg1.method2022() << 12) / 100;
		}
	}
}
