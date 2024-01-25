import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class5_Sub2_Sub25 extends Class5_Sub2 {

	@OriginalMember(owner = "client!of", name = "J", descriptor = "I")
	private int anInt4395;

	@OriginalMember(owner = "client!of", name = "M", descriptor = "I")
	private int anInt4398;

	@OriginalMember(owner = "client!of", name = "N", descriptor = "I")
	private int anInt4399;

	@OriginalMember(owner = "client!of", name = "O", descriptor = "I")
	private int anInt4400;

	@OriginalMember(owner = "client!of", name = "V", descriptor = "I")
	private int anInt4407;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "I")
	private int anInt4408;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "I")
	private int anInt4401 = 0;

	@OriginalMember(owner = "client!of", name = "S", descriptor = "I")
	private int anInt4404 = 0;

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
	private int anInt4409 = 0;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4404 = arg0.method1834();
		} else if (arg1 == 1) {
			this.anInt4409 = (arg0.method1863() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt4401 = (arg0.method1863() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(BIII)V")
	private void method3884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 <= 2048 ? (arg1 + 4096) * arg2 >> 12 : arg1 + arg2 - (arg1 * arg2 >> 12);
		if (local31 <= 0) {
			this.anInt4400 = this.anInt4399 = this.anInt4408 = arg2;
			return;
		}
		@Pc(50) int local50 = arg0 * 6;
		@Pc(58) int local58 = arg2 + arg2 - local31;
		@Pc(67) int local67 = (local31 - local58 << 12) / local31;
		@Pc(71) int local71 = local50 >> 12;
		@Pc(78) int local78 = local50 - (local71 << 12);
		@Pc(86) int local86 = local67 * local31 >> 12;
		@Pc(92) int local92 = local86 * local78 >> 12;
		@Pc(96) int local96 = local92 + local58;
		@Pc(101) int local101 = local31 - local92;
		if (local71 == 0) {
			this.anInt4408 = local58;
			this.anInt4400 = local31;
			this.anInt4399 = local96;
		} else if (local71 == 1) {
			this.anInt4399 = local31;
			this.anInt4408 = local58;
			this.anInt4400 = local101;
		} else if (local71 == 2) {
			this.anInt4400 = local58;
			this.anInt4399 = local31;
			this.anInt4408 = local96;
		} else if (local71 == 3) {
			this.anInt4400 = local58;
			this.anInt4399 = local101;
			this.anInt4408 = local31;
		} else if (local71 == 4) {
			this.anInt4399 = local58;
			this.anInt4408 = local31;
			this.anInt4400 = local96;
		} else if (local71 == 5) {
			this.anInt4399 = local58;
			this.anInt4400 = local31;
			this.anInt4408 = local101;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V")
	private void method3888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 < arg0 ? arg0 : arg2;
		@Pc(23) int local23 = local16 >= arg1 ? local16 : arg1;
		@Pc(30) int local30 = arg0 < arg2 ? arg0 : arg2;
		@Pc(41) int local41 = arg1 >= local30 ? local30 : arg1;
		@Pc(54) int local54 = local23 - local41;
		this.anInt4395 = (local41 + local23) / 2;
		if (local54 > 0) {
			@Pc(75) int local75 = (local23 - arg0 << 12) / local54;
			@Pc(84) int local84 = (local23 - arg2 << 12) / local54;
			@Pc(93) int local93 = (local23 - arg1 << 12) / local54;
			if (local23 == arg0) {
				this.anInt4407 = arg2 == local41 ? local93 + 20480 : -local84 + 4096;
			} else if (arg2 == local23) {
				this.anInt4407 = local41 == arg1 ? local75 + 4096 : -local93 + 12288;
			} else {
				this.anInt4407 = local41 == arg0 ? local84 + 12288 : -local75 + 20480;
			}
			this.anInt4407 /= 6;
		} else {
			this.anInt4407 = 0;
		}
		if (this.anInt4395 > 0 && this.anInt4395 < 4096) {
			this.anInt4398 = (local54 << 12) / (this.anInt4395 <= 2048 ? this.anInt4395 * 2 : 8192 - (this.anInt4395 * 2));
		} else {
			this.anInt4398 = 0;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(29) int[][] local29 = this.method5818(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static15.anInt493; local55++) {
				this.method3888(local33[local55], local41[local55], local37[local55]);
				this.anInt4407 += this.anInt4404;
				this.anInt4398 += this.anInt4409;
				this.anInt4395 += this.anInt4401;
				while (this.anInt4407 < 0) {
					this.anInt4407 += 4096;
				}
				while (this.anInt4407 > 4096) {
					this.anInt4407 -= 4096;
				}
				if (this.anInt4398 < 0) {
					this.anInt4398 = 0;
				}
				if (this.anInt4398 > 4096) {
					this.anInt4398 = 4096;
				}
				if (this.anInt4395 < 0) {
					this.anInt4395 = 0;
				}
				if (this.anInt4395 > 4096) {
					this.anInt4395 = 4096;
				}
				this.method3884(this.anInt4407, this.anInt4398, this.anInt4395);
				local45[local55] = this.anInt4400;
				local49[local55] = this.anInt4399;
				local53[local55] = this.anInt4408;
			}
		}
		return local19;
	}
}
