import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	private int anInt2578;

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	private int anInt2580;

	@OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
	private int anInt2582;

	@OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
	private int anInt2584;

	@OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
	private int anInt2585;

	@OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
	private int anInt2586;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
	private int anInt2577 = 0;

	@OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
	private int anInt2583 = 0;

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
	private int anInt2581 = 0;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	private void method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = arg2 < arg0 ? arg0 : arg2;
		@Pc(29) int local29 = local18 < arg1 ? arg1 : local18;
		@Pc(36) int local36 = arg2 <= arg0 ? arg2 : arg0;
		@Pc(43) int local43 = arg1 < local36 ? arg1 : local36;
		this.anInt2585 = (local29 + local43) / 2;
		@Pc(55) int local55 = local29 - local43;
		if (local55 > 0) {
			@Pc(68) int local68 = (local29 - arg0 << 12) / local55;
			@Pc(77) int local77 = (local29 - arg2 << 12) / local55;
			@Pc(86) int local86 = (local29 - arg1 << 12) / local55;
			if (local29 == arg0) {
				this.anInt2586 = arg2 == local43 ? local86 + 20480 : -local77 + 4096;
			} else if (local29 == arg2) {
				this.anInt2586 = arg1 == local43 ? local68 + 4096 : -local86 + 12288;
			} else {
				this.anInt2586 = local43 == arg0 ? local77 + 12288 : -local68 + 20480;
			}
			this.anInt2586 /= 6;
		} else {
			this.anInt2586 = 0;
		}
		if (this.anInt2585 > 0 && this.anInt2585 < 4096) {
			this.anInt2578 = (local55 << 12) / (this.anInt2585 <= 2048 ? this.anInt2585 * 2 : 8192 - (this.anInt2585 * 2));
		} else {
			this.anInt2578 = 0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIZ)V")
	private void method2077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(30) int local30 = arg0 > 2048 ? arg1 + arg0 - (arg0 * arg1 >> 12) : (4096 - -arg1) * arg0 >> 12;
		if (local30 <= 0) {
			this.anInt2582 = this.anInt2584 = this.anInt2580 = arg0;
			return;
		}
		@Pc(49) int local49 = arg2 * 6;
		@Pc(56) int local56 = arg0 + arg0 - local30;
		@Pc(65) int local65 = (local30 - local56 << 12) / local30;
		@Pc(69) int local69 = local49 >> 12;
		@Pc(76) int local76 = local49 - (local69 << 12);
		@Pc(84) int local84 = local65 * local30 >> 12;
		@Pc(90) int local90 = local76 * local84 >> 12;
		@Pc(94) int local94 = local56 + local90;
		@Pc(99) int local99 = local30 - local90;
		if (local69 == 0) {
			this.anInt2582 = local30;
			this.anInt2584 = local94;
			this.anInt2580 = local56;
		} else if (local69 == 1) {
			this.anInt2580 = local56;
			this.anInt2584 = local30;
			this.anInt2582 = local99;
		} else if (local69 == 2) {
			this.anInt2580 = local94;
			this.anInt2582 = local56;
			this.anInt2584 = local30;
		} else if (local69 == 3) {
			this.anInt2584 = local99;
			this.anInt2582 = local56;
			this.anInt2580 = local30;
		} else if (local69 == 4) {
			this.anInt2582 = local94;
			this.anInt2584 = local56;
			this.anInt2580 = local30;
		} else if (local69 == 5) {
			this.anInt2580 = local99;
			this.anInt2584 = local56;
			this.anInt2582 = local30;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2581 = arg1.method5743();
		} else if (arg0 == 1) {
			this.anInt2577 = (arg1.method5759() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2583 = (arg1.method5759() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(23) int[][] local23 = this.method6061(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static391.anInt7118; local49++) {
				this.method2076(local27[local49], local35[local49], local31[local49]);
				this.anInt2586 += this.anInt2581;
				this.anInt2585 += this.anInt2583;
				this.anInt2578 += this.anInt2577;
				while (this.anInt2586 < 0) {
					this.anInt2586 += 4096;
				}
				while (this.anInt2586 > 4096) {
					this.anInt2586 -= 4096;
				}
				if (this.anInt2578 < 0) {
					this.anInt2578 = 0;
				}
				if (this.anInt2585 < 0) {
					this.anInt2585 = 0;
				}
				if (this.anInt2578 > 4096) {
					this.anInt2578 = 4096;
				}
				if (this.anInt2585 > 4096) {
					this.anInt2585 = 4096;
				}
				this.method2077(this.anInt2585, this.anInt2578, this.anInt2586);
				local39[local49] = this.anInt2582;
				local43[local49] = this.anInt2584;
				local47[local49] = this.anInt2580;
			}
		}
		return local11;
	}
}
