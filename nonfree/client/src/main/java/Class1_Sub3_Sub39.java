import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class1_Sub3_Sub39 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wq", name = "M", descriptor = "I")
	private int anInt9515;

	@OriginalMember(owner = "client!wq", name = "N", descriptor = "I")
	private int anInt9516;

	@OriginalMember(owner = "client!wq", name = "P", descriptor = "I")
	private int anInt9518;

	@OriginalMember(owner = "client!wq", name = "R", descriptor = "I")
	private int anInt9520;

	@OriginalMember(owner = "client!wq", name = "X", descriptor = "I")
	private int anInt9526;

	@OriginalMember(owner = "client!wq", name = "Y", descriptor = "I")
	private int anInt9527;

	@OriginalMember(owner = "client!wq", name = "T", descriptor = "I")
	private int anInt9522 = 0;

	@OriginalMember(owner = "client!wq", name = "V", descriptor = "I")
	private int anInt9524 = 0;

	@OriginalMember(owner = "client!wq", name = "Q", descriptor = "I")
	private int anInt9519 = 0;

	static {
		new Class45("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(23) int[][] local23 = this.method8199(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static254.anInt4973; local49++) {
				this.method8208(local27[local49], local35[local49], local31[local49]);
				this.anInt9526 += this.anInt9519;
				this.anInt9518 += this.anInt9522;
				this.anInt9527 += this.anInt9524;
				while (this.anInt9518 < 0) {
					this.anInt9518 += 4096;
				}
				while (this.anInt9518 > 4096) {
					this.anInt9518 -= 4096;
				}
				if (this.anInt9527 < 0) {
					this.anInt9527 = 0;
				}
				if (this.anInt9526 < 0) {
					this.anInt9526 = 0;
				}
				if (this.anInt9527 > 4096) {
					this.anInt9527 = 4096;
				}
				if (this.anInt9526 > 4096) {
					this.anInt9526 = 4096;
				}
				this.method8207(this.anInt9526, this.anInt9518, this.anInt9527);
				local39[local49] = this.anInt9516;
				local43[local49] = this.anInt9520;
				local47[local49] = this.anInt9515;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIII)V")
	private void method8207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) int local35 = arg0 <= 2048 ? arg0 * (arg2 + 4096) >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
		if (local35 <= 0) {
			this.anInt9516 = this.anInt9520 = this.anInt9515 = arg0;
			return;
		}
		@Pc(44) int local44 = arg1 * 6;
		@Pc(51) int local51 = arg0 + arg0 - local35;
		@Pc(60) int local60 = (local35 - local51 << 12) / local35;
		@Pc(64) int local64 = local44 >> 12;
		@Pc(70) int local70 = local44 - (local64 << 12);
		@Pc(78) int local78 = local60 * local35 >> 12;
		@Pc(84) int local84 = local70 * local78 >> 12;
		@Pc(88) int local88 = local51 + local84;
		@Pc(92) int local92 = local35 - local84;
		if (local64 == 0) {
			this.anInt9520 = local88;
			this.anInt9516 = local35;
			this.anInt9515 = local51;
			return;
		}
		if (local64 == 1) {
			this.anInt9516 = local92;
			this.anInt9515 = local51;
			this.anInt9520 = local35;
			return;
		}
		if (local64 == 2) {
			this.anInt9520 = local35;
			this.anInt9515 = local88;
			this.anInt9516 = local51;
			return;
		}
		if (local64 == 3) {
			this.anInt9516 = local51;
			this.anInt9515 = local35;
			this.anInt9520 = local92;
			return;
		}
		if (local64 == 4) {
			this.anInt9515 = local35;
			this.anInt9520 = local51;
			this.anInt9516 = local88;
			return;
		}
		if (local64 == 5) {
			this.anInt9520 = local51;
			this.anInt9516 = local35;
			this.anInt9515 = local92;
			return;
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(IIII)V")
	private void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 > arg2 ? arg0 : arg2;
		@Pc(19) int local19 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(26) int local26 = local12 >= arg1 ? local12 : arg1;
		@Pc(37) int local37 = arg1 >= local19 ? local19 : arg1;
		@Pc(51) int local51 = local26 - local37;
		this.anInt9526 = (local26 + local37) / 2;
		if (this.anInt9526 > 0 && this.anInt9526 < 4096) {
			this.anInt9527 = (local51 << 12) / (this.anInt9526 > 2048 ? 8192 - (this.anInt9526 * 2) : this.anInt9526 * 2);
		} else {
			this.anInt9527 = 0;
		}
		if (local51 <= 0) {
			this.anInt9518 = 0;
			return;
		}
		@Pc(114) int local114 = (local26 - arg0 << 12) / local51;
		@Pc(122) int local122 = (local26 - arg2 << 12) / local51;
		@Pc(130) int local130 = (local26 - arg1 << 12) / local51;
		if (arg0 == local26) {
			this.anInt9518 = arg2 == local37 ? local130 + 20480 : -local122 + 4096;
		} else if (arg2 == local26) {
			this.anInt9518 = arg1 == local37 ? local114 + 4096 : -local130 + 12288;
		} else {
			this.anInt9518 = arg0 == local37 ? local122 + 12288 : -local114 + 20480;
		}
		this.anInt9518 /= 6;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt9522 = arg1.method4447();
		} else if (arg0 == 1) {
			this.anInt9524 = (arg1.method4482() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt9519 = (arg1.method4482() << 12) / 100;
		}
	}
}
