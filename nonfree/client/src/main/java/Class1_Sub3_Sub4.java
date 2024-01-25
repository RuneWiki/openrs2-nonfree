import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!al", name = "E", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!al", name = "K", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!al", name = "L", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!al", name = "M", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!al", name = "U", descriptor = "I")
	private int anInt455;

	@OriginalMember(owner = "client!al", name = "J", descriptor = "I")
	private int anInt446 = 0;

	@OriginalMember(owner = "client!al", name = "I", descriptor = "I")
	private int anInt445 = 0;

	@OriginalMember(owner = "client!al", name = "S", descriptor = "I")
	private int anInt453 = 0;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V")
	private void method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(27) int local27 = arg1 > 2048 ? arg1 + arg0 - (arg1 * arg0 >> 12) : (arg0 + 4096) * arg1 >> 12;
		if (local27 <= 0) {
			this.anInt443 = this.anInt448 = this.anInt447 = arg1;
			return;
		}
		@Pc(36) int local36 = arg2 * 6;
		@Pc(43) int local43 = arg1 + arg1 - local27;
		@Pc(51) int local51 = (local27 - local43 << 12) / local27;
		@Pc(55) int local55 = local36 >> 12;
		@Pc(62) int local62 = local36 - (local55 << 12);
		@Pc(70) int local70 = local27 * local51 >> 12;
		@Pc(76) int local76 = local62 * local70 >> 12;
		@Pc(80) int local80 = local76 + local43;
		@Pc(84) int local84 = local27 - local76;
		if (local55 == 0) {
			this.anInt447 = local43;
			this.anInt443 = local27;
			this.anInt448 = local80;
		} else if (local55 == 1) {
			this.anInt447 = local43;
			this.anInt443 = local84;
			this.anInt448 = local27;
		} else if (local55 == 2) {
			this.anInt443 = local43;
			this.anInt447 = local80;
			this.anInt448 = local27;
		} else if (local55 == 3) {
			this.anInt443 = local43;
			this.anInt448 = local84;
			this.anInt447 = local27;
		} else if (local55 == 4) {
			this.anInt447 = local27;
			this.anInt448 = local43;
			this.anInt443 = local80;
		} else if (local55 == 5) {
			this.anInt447 = local84;
			this.anInt443 = local27;
			this.anInt448 = local43;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt446 = arg0.method3964();
		} else if (arg1 == 1) {
			this.anInt453 = (arg0.method3928() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt445 = (arg0.method3928() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BIII)V")
	private void method473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 < arg2 ? arg2 : arg0;
		@Pc(23) int local23 = arg2 < arg0 ? arg2 : arg0;
		@Pc(34) int local34 = local12 < arg1 ? arg1 : local12;
		@Pc(45) int local45 = local23 > arg1 ? arg1 : local23;
		this.anInt455 = (local34 + local45) / 2;
		@Pc(57) int local57 = local34 - local45;
		if (local57 <= 0) {
			this.anInt441 = 0;
		} else {
			@Pc(76) int local76 = (local34 - arg2 << 12) / local57;
			@Pc(85) int local85 = (local34 - arg0 << 12) / local57;
			@Pc(93) int local93 = (local34 - arg1 << 12) / local57;
			if (arg2 == local34) {
				this.anInt441 = arg0 == local45 ? local93 + 20480 : -local85 + 4096;
			} else if (arg0 == local34) {
				this.anInt441 = arg1 == local45 ? local76 + 4096 : -local93 + 12288;
			} else {
				this.anInt441 = arg2 == local45 ? local85 + 12288 : -local76 + 20480;
			}
			this.anInt441 /= 6;
		}
		if (this.anInt455 > 0 && this.anInt455 < 4096) {
			this.anInt449 = (local57 << 12) / (this.anInt455 > 2048 ? 8192 - (this.anInt455 * 2) : this.anInt455 * 2);
		} else {
			this.anInt449 = 0;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(26) int[][] local26 = this.method7130(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static452.anInt7734; local52++) {
				this.method473(local34[local52], local38[local52], local30[local52]);
				this.anInt449 += this.anInt453;
				this.anInt455 += this.anInt445;
				for (this.anInt441 += this.anInt446; this.anInt441 < 0; this.anInt441 += 4096) {
				}
				if (this.anInt449 < 0) {
					this.anInt449 = 0;
				}
				while (this.anInt441 > 4096) {
					this.anInt441 -= 4096;
				}
				if (this.anInt449 > 4096) {
					this.anInt449 = 4096;
				}
				if (this.anInt455 < 0) {
					this.anInt455 = 0;
				}
				if (this.anInt455 > 4096) {
					this.anInt455 = 4096;
				}
				this.method471(this.anInt449, this.anInt455, this.anInt441);
				local42[local52] = this.anInt443;
				local46[local52] = this.anInt448;
				local50[local52] = this.anInt447;
			}
		}
		return local16;
	}
}
