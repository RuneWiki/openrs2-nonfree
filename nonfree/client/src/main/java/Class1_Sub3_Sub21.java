import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kba", name = "F", descriptor = "I")
	private int anInt4735;

	@OriginalMember(owner = "client!kba", name = "H", descriptor = "I")
	private int anInt4737;

	@OriginalMember(owner = "client!kba", name = "L", descriptor = "I")
	private int anInt4741;

	@OriginalMember(owner = "client!kba", name = "M", descriptor = "I")
	private int anInt4742;

	@OriginalMember(owner = "client!kba", name = "P", descriptor = "I")
	private int anInt4744;

	@OriginalMember(owner = "client!kba", name = "R", descriptor = "I")
	private int anInt4746;

	@OriginalMember(owner = "client!kba", name = "N", descriptor = "I")
	private int anInt4743 = 0;

	@OriginalMember(owner = "client!kba", name = "Q", descriptor = "I")
	private int anInt4745 = 0;

	@OriginalMember(owner = "client!kba", name = "I", descriptor = "I")
	private int anInt4738 = 0;

	static {
		new Class114("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIB)V")
	private void method4142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) int local35 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg2 * (4096 - -arg1) >> 12;
		if (local35 <= 0) {
			this.anInt4735 = this.anInt4737 = this.anInt4744 = arg2;
			return;
		}
		@Pc(51) int local51 = arg0 * 6;
		@Pc(58) int local58 = arg2 + arg2 - local35;
		@Pc(67) int local67 = (local35 - local58 << 12) / local35;
		@Pc(71) int local71 = local51 >> 12;
		@Pc(78) int local78 = local51 - (local71 << 12);
		@Pc(86) int local86 = local67 * local35 >> 12;
		@Pc(92) int local92 = local78 * local86 >> 12;
		@Pc(96) int local96 = local92 + local58;
		@Pc(101) int local101 = local35 - local92;
		if (local71 == 0) {
			this.anInt4735 = local35;
			this.anInt4744 = local58;
			this.anInt4737 = local96;
		} else if (local71 == 1) {
			this.anInt4744 = local58;
			this.anInt4735 = local101;
			this.anInt4737 = local35;
		} else if (local71 == 2) {
			this.anInt4735 = local58;
			this.anInt4737 = local35;
			this.anInt4744 = local96;
		} else if (local71 == 3) {
			this.anInt4735 = local58;
			this.anInt4737 = local101;
			this.anInt4744 = local35;
		} else if (local71 == 4) {
			this.anInt4744 = local35;
			this.anInt4737 = local58;
			this.anInt4735 = local96;
		} else if (local71 == 5) {
			this.anInt4744 = local101;
			this.anInt4737 = local58;
			this.anInt4735 = local35;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(27) int[][] local27 = this.method7910(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static236.anInt4609; local53++) {
				this.method4145(local35[local53], local31[local53], local39[local53]);
				this.anInt4741 += this.anInt4743;
				this.anInt4746 += this.anInt4738;
				for (this.anInt4742 += this.anInt4745; this.anInt4742 < 0; this.anInt4742 += 4096) {
				}
				if (this.anInt4741 < 0) {
					this.anInt4741 = 0;
				}
				while (this.anInt4742 > 4096) {
					this.anInt4742 -= 4096;
				}
				if (this.anInt4746 < 0) {
					this.anInt4746 = 0;
				}
				if (this.anInt4741 > 4096) {
					this.anInt4741 = 4096;
				}
				if (this.anInt4746 > 4096) {
					this.anInt4746 = 4096;
				}
				this.method4142(this.anInt4742, this.anInt4741, this.anInt4746);
				local43[local53] = this.anInt4735;
				local47[local53] = this.anInt4737;
				local51[local53] = this.anInt4744;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4745 = arg0.method3058();
		} else if (arg1 == 1) {
			this.anInt4743 = (arg0.method3073() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt4738 = (arg0.method3073() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(IIIB)V")
	private void method4145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 > arg0 ? arg1 : arg0;
		@Pc(23) int local23 = arg1 < arg0 ? arg1 : arg0;
		@Pc(34) int local34 = arg2 <= local12 ? local12 : arg2;
		@Pc(41) int local41 = arg2 < local23 ? arg2 : local23;
		this.anInt4746 = (local34 + local41) / 2;
		@Pc(53) int local53 = local34 - local41;
		if (local53 <= 0) {
			this.anInt4742 = 0;
		} else {
			@Pc(68) int local68 = (local34 - arg1 << 12) / local53;
			@Pc(77) int local77 = (local34 - arg0 << 12) / local53;
			@Pc(86) int local86 = (local34 - arg2 << 12) / local53;
			if (arg1 == local34) {
				this.anInt4742 = arg0 == local41 ? local86 + 20480 : 4096 - local77;
			} else if (arg0 == local34) {
				this.anInt4742 = arg2 == local41 ? local68 + 4096 : -local86 + 12288;
			} else {
				this.anInt4742 = local41 == arg1 ? local77 + 12288 : -local68 + 20480;
			}
			this.anInt4742 /= 6;
		}
		if (this.anInt4746 > 0 && this.anInt4746 < 4096) {
			this.anInt4741 = (local53 << 12) / (this.anInt4746 > 2048 ? 8192 - (this.anInt4746 * 2) : this.anInt4746 * 2);
		} else {
			this.anInt4741 = 0;
		}
	}
}
