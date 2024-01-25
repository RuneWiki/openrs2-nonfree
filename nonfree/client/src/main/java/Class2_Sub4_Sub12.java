import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub4_Sub12 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int anInt3188;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	private int anInt3190;

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
	private int anInt3194;

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
	private int anInt3195;

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
	private int anInt3197;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
	private int anInt3199;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	private int anInt3184 = 0;

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
	private int anInt3196 = 0;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	private int anInt3192 = 0;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBII)V")
	private void method2677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 >= arg2 ? arg0 : arg2;
		@Pc(27) int local27 = arg1 <= local16 ? local16 : arg1;
		@Pc(38) int local38 = arg0 <= arg2 ? arg0 : arg2;
		@Pc(50) int local50 = local38 > arg1 ? arg1 : local38;
		this.anInt3195 = (local50 + local27) / 2;
		@Pc(62) int local62 = local27 - local50;
		if (this.anInt3195 > 0 && this.anInt3195 < 4096) {
			this.anInt3190 = (local62 << 12) / (this.anInt3195 <= 2048 ? this.anInt3195 * 2 : 8192 - (this.anInt3195 * 2));
		} else {
			this.anInt3190 = 0;
		}
		if (local62 <= 0) {
			this.anInt3194 = 0;
			return;
		}
		@Pc(117) int local117 = (local27 - arg2 << 12) / local62;
		@Pc(126) int local126 = (local27 - arg0 << 12) / local62;
		@Pc(135) int local135 = (local27 - arg1 << 12) / local62;
		if (arg2 == local27) {
			this.anInt3194 = local50 == arg0 ? local135 + 20480 : -local126 + 4096;
		} else if (local27 == arg0) {
			this.anInt3194 = local50 == arg1 ? local117 + 4096 : -local135 + 12288;
		} else {
			this.anInt3194 = arg2 == local50 ? local126 + 12288 : -local117 + 20480;
		}
		this.anInt3194 /= 6;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(30) int[][] local30 = this.method7567(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static143.anInt7434; local56++) {
				this.method2677(local38[local56], local42[local56], local34[local56]);
				this.anInt3194 += this.anInt3192;
				this.anInt3190 += this.anInt3196;
				this.anInt3195 += this.anInt3184;
				while (this.anInt3194 < 0) {
					this.anInt3194 += 4096;
				}
				if (this.anInt3190 < 0) {
					this.anInt3190 = 0;
				}
				while (this.anInt3194 > 4096) {
					this.anInt3194 -= 4096;
				}
				if (this.anInt3195 < 0) {
					this.anInt3195 = 0;
				}
				if (this.anInt3190 > 4096) {
					this.anInt3190 = 4096;
				}
				if (this.anInt3195 > 4096) {
					this.anInt3195 = 4096;
				}
				this.method2678(this.anInt3190, this.anInt3194, this.anInt3195);
				local46[local56] = this.anInt3197;
				local50[local56] = this.anInt3199;
				local54[local56] = this.anInt3188;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	private void method2678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg2 <= 2048 ? arg2 * (arg0 + 4096) >> 12 : arg0 + arg2 - (arg2 * arg0 >> 12);
		if (local33 <= 0) {
			this.anInt3197 = this.anInt3199 = this.anInt3188 = arg2;
			return;
		}
		@Pc(52) int local52 = arg1 * 6;
		@Pc(60) int local60 = arg2 + arg2 - local33;
		@Pc(68) int local68 = (local33 - local60 << 12) / local33;
		@Pc(72) int local72 = local52 >> 12;
		@Pc(78) int local78 = local52 - (local72 << 12);
		@Pc(86) int local86 = local68 * local33 >> 12;
		@Pc(92) int local92 = local78 * local86 >> 12;
		@Pc(96) int local96 = local60 + local92;
		@Pc(101) int local101 = local33 - local92;
		if (local72 == 0) {
			this.anInt3188 = local60;
			this.anInt3199 = local96;
			this.anInt3197 = local33;
		} else if (local72 == 1) {
			this.anInt3197 = local101;
			this.anInt3199 = local33;
			this.anInt3188 = local60;
		} else if (local72 == 2) {
			this.anInt3199 = local33;
			this.anInt3188 = local96;
			this.anInt3197 = local60;
		} else if (local72 == 3) {
			this.anInt3199 = local101;
			this.anInt3188 = local33;
			this.anInt3197 = local60;
		} else if (local72 == 4) {
			this.anInt3199 = local60;
			this.anInt3188 = local33;
			this.anInt3197 = local96;
		} else if (local72 == 5) {
			this.anInt3197 = local33;
			this.anInt3188 = local101;
			this.anInt3199 = local60;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3192 = arg1.method4478();
		} else if (arg0 == 1) {
			this.anInt3196 = (arg1.method4477() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3184 = (arg1.method4477() << 12) / 100;
		}
	}
}
