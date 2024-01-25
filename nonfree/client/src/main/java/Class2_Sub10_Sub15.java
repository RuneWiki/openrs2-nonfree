import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class2_Sub10_Sub15 extends Class2_Sub10 {

	@OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
	private int anInt4981;

	@OriginalMember(owner = "client!jaa", name = "H", descriptor = "I")
	private int anInt4986;

	@OriginalMember(owner = "client!jaa", name = "I", descriptor = "I")
	private int anInt4987;

	@OriginalMember(owner = "client!jaa", name = "P", descriptor = "I")
	private int anInt4991;

	@OriginalMember(owner = "client!jaa", name = "R", descriptor = "I")
	private int anInt4993;

	@OriginalMember(owner = "client!jaa", name = "Y", descriptor = "I")
	private int anInt5000;

	@OriginalMember(owner = "client!jaa", name = "Q", descriptor = "I")
	private int anInt4992 = 0;

	@OriginalMember(owner = "client!jaa", name = "D", descriptor = "I")
	private int anInt4982 = 0;

	@OriginalMember(owner = "client!jaa", name = "X", descriptor = "I")
	private int anInt4999 = 0;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4982 = arg0.method6856();
		} else if (arg1 == 1) {
			this.anInt4999 = (arg0.method6908() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt4992 = (arg0.method6908() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(27) int[][] local27 = this.method8408(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static93.anInt1862; local53++) {
				this.method4165(local39[local53], local35[local53], local31[local53]);
				this.anInt4991 += this.anInt4999;
				this.anInt4993 += this.anInt4982;
				this.anInt4986 += this.anInt4992;
				while (this.anInt4993 < 0) {
					this.anInt4993 += 4096;
				}
				if (this.anInt4991 < 0) {
					this.anInt4991 = 0;
				}
				while (this.anInt4993 > 4096) {
					this.anInt4993 -= 4096;
				}
				if (this.anInt4986 < 0) {
					this.anInt4986 = 0;
				}
				if (this.anInt4991 > 4096) {
					this.anInt4991 = 4096;
				}
				if (this.anInt4986 > 4096) {
					this.anInt4986 = 4096;
				}
				this.method4167(this.anInt4986, this.anInt4993, this.anInt4991);
				local43[local53] = this.anInt4987;
				local47[local53] = this.anInt5000;
				local51[local53] = this.anInt4981;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBII)V")
	private void method4165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg1 < arg2 ? arg2 : arg1;
		@Pc(27) int local27 = arg0 > local20 ? arg0 : local20;
		@Pc(34) int local34 = arg1 > arg2 ? arg2 : arg1;
		@Pc(45) int local45 = arg0 < local34 ? arg0 : local34;
		@Pc(50) int local50 = local27 - local45;
		this.anInt4986 = (local27 + local45) / 2;
		if (local50 <= 0) {
			this.anInt4993 = 0;
		} else {
			@Pc(75) int local75 = (local27 - arg2 << 12) / local50;
			@Pc(84) int local84 = (local27 - arg1 << 12) / local50;
			@Pc(93) int local93 = (local27 - arg0 << 12) / local50;
			if (local27 == arg2) {
				this.anInt4993 = arg1 == local45 ? local93 + 20480 : -local84 + 4096;
			} else if (arg1 == local27) {
				this.anInt4993 = local45 == arg0 ? local75 + 4096 : -local93 + 12288;
			} else {
				this.anInt4993 = arg2 == local45 ? local84 + 12288 : -local75 + 20480;
			}
			this.anInt4993 /= 6;
		}
		if (this.anInt4986 > 0 && this.anInt4986 < 4096) {
			this.anInt4991 = (local50 << 12) / (this.anInt4986 > 2048 ? 8192 - this.anInt4986 * 2 : this.anInt4986 * 2);
		} else {
			this.anInt4991 = 0;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)V")
	private void method4167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg0 > 2048 ? arg0 + arg2 - (arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local33 <= 0) {
			this.anInt4987 = this.anInt5000 = this.anInt4981 = arg0;
			return;
		}
		@Pc(39) int local39 = arg1 * 6;
		@Pc(46) int local46 = arg0 + arg0 - local33;
		@Pc(55) int local55 = (local33 - local46 << 12) / local33;
		@Pc(59) int local59 = local39 >> 12;
		@Pc(66) int local66 = local39 - (local59 << 12);
		@Pc(74) int local74 = local33 * local55 >> 12;
		@Pc(80) int local80 = local66 * local74 >> 12;
		@Pc(84) int local84 = local80 + local46;
		@Pc(89) int local89 = local33 - local80;
		if (local59 == 0) {
			this.anInt4987 = local33;
			this.anInt5000 = local84;
			this.anInt4981 = local46;
			return;
		}
		if (local59 == 1) {
			this.anInt5000 = local33;
			this.anInt4981 = local46;
			this.anInt4987 = local89;
			return;
		}
		if (local59 == 2) {
			this.anInt5000 = local33;
			this.anInt4987 = local46;
			this.anInt4981 = local84;
			return;
		}
		if (local59 == 3) {
			this.anInt4981 = local33;
			this.anInt5000 = local89;
			this.anInt4987 = local46;
			return;
		}
		if (local59 == 4) {
			this.anInt4981 = local33;
			this.anInt4987 = local84;
			this.anInt5000 = local46;
			return;
		}
		if (local59 == 5) {
			this.anInt4987 = local33;
			this.anInt4981 = local89;
			this.anInt5000 = local46;
			return;
		}
	}
}
