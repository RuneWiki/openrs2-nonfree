import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class2_Sub6_Sub27 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
	private int anInt4603;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
	private int anInt4606;

	@OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
	private int anInt4607;

	@OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
	private int anInt4611;

	@OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
	private int anInt4612;

	@OriginalMember(owner = "client!ol", name = "X", descriptor = "I")
	private int anInt4613;

	@OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
	private int anInt4604 = 0;

	@OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
	private int anInt4600 = 0;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
	private int anInt4602 = 0;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4602 = arg0.method4251();
		} else if (arg1 == 1) {
			this.anInt4600 = (arg0.method4217() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt4604 = (arg0.method4217() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(27) int[][] local27 = this.method5640(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static151.anInt2711; local53++) {
				this.method4045(local31[local53], local39[local53], local35[local53]);
				this.anInt4611 += this.anInt4600;
				this.anInt4612 += this.anInt4602;
				this.anInt4606 += this.anInt4604;
				while (this.anInt4612 < 0) {
					this.anInt4612 += 4096;
				}
				while (this.anInt4612 > 4096) {
					this.anInt4612 -= 4096;
				}
				if (this.anInt4611 < 0) {
					this.anInt4611 = 0;
				}
				if (this.anInt4611 > 4096) {
					this.anInt4611 = 4096;
				}
				if (this.anInt4606 < 0) {
					this.anInt4606 = 0;
				}
				if (this.anInt4606 > 4096) {
					this.anInt4606 = 4096;
				}
				this.method4043(this.anInt4606, this.anInt4612, this.anInt4611);
				local43[local53] = this.anInt4613;
				local47[local53] = this.anInt4607;
				local51[local53] = this.anInt4603;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V")
	private void method4043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg0 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : arg0 * (arg2 + 4096) >> 12;
		if (local27 <= 0) {
			this.anInt4613 = this.anInt4607 = this.anInt4603 = arg0;
			return;
		}
		@Pc(33) int local33 = arg1 * 6;
		@Pc(40) int local40 = arg0 + arg0 - local27;
		@Pc(48) int local48 = (local27 - local40 << 12) / local27;
		@Pc(52) int local52 = local33 >> 12;
		@Pc(59) int local59 = local33 - (local52 << 12);
		@Pc(67) int local67 = local27 * local48 >> 12;
		@Pc(73) int local73 = local59 * local67 >> 12;
		@Pc(77) int local77 = local73 + local40;
		@Pc(82) int local82 = local27 - local73;
		if (local52 == 0) {
			this.anInt4613 = local27;
			this.anInt4603 = local40;
			this.anInt4607 = local77;
		} else if (local52 == 1) {
			this.anInt4613 = local82;
			this.anInt4607 = local27;
			this.anInt4603 = local40;
		} else if (local52 == 2) {
			this.anInt4607 = local27;
			this.anInt4613 = local40;
			this.anInt4603 = local77;
		} else if (local52 == 3) {
			this.anInt4603 = local27;
			this.anInt4613 = local40;
			this.anInt4607 = local82;
		} else if (local52 == 4) {
			this.anInt4613 = local77;
			this.anInt4603 = local27;
			this.anInt4607 = local40;
		} else if (local52 == 5) {
			this.anInt4607 = local40;
			this.anInt4613 = local27;
			this.anInt4603 = local82;
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IIII)V")
	private void method4045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(19) int local19 = local12 < arg1 ? arg1 : local12;
		@Pc(26) int local26 = arg2 <= arg0 ? arg2 : arg0;
		@Pc(33) int local33 = local26 > arg1 ? arg1 : local26;
		this.anInt4606 = (local19 + local33) / 2;
		@Pc(50) int local50 = local19 - local33;
		if (this.anInt4606 > 0 && this.anInt4606 < 4096) {
			this.anInt4611 = (local50 << 12) / (this.anInt4606 > 2048 ? 8192 - this.anInt4606 * 2 : this.anInt4606 * 2);
		} else {
			this.anInt4611 = 0;
		}
		if (local50 <= 0) {
			this.anInt4612 = 0;
			return;
		}
		@Pc(101) int local101 = (local19 - arg0 << 12) / local50;
		@Pc(110) int local110 = (local19 - arg2 << 12) / local50;
		@Pc(118) int local118 = (local19 - arg1 << 12) / local50;
		if (local19 == arg0) {
			this.anInt4612 = arg2 == local33 ? local118 + 20480 : -local110 + 4096;
		} else if (arg2 == local19) {
			this.anInt4612 = arg1 == local33 ? local101 + 4096 : -local118 + 12288;
		} else {
			this.anInt4612 = arg0 == local33 ? local110 + 12288 : -local101 + 20480;
		}
		this.anInt4612 /= 6;
	}
}
