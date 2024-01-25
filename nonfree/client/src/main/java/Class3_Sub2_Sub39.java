import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class3_Sub2_Sub39 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
	private int anInt7566;

	@OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
	private int anInt7569;

	@OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
	private int anInt7572;

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
	private int anInt7575;

	@OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
	private int anInt7579;

	@OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
	private int anInt7580;

	@OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
	private int anInt7568 = 0;

	@OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
	private int anInt7571 = 0;

	@OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
	private int anInt7578 = 0;

	static {
		new Class189("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
		new Class189("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7568 = arg0.method2641();
		} else if (arg1 == 1) {
			this.anInt7571 = (arg0.method2612() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt7578 = (arg0.method2612() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIBI)V")
	private void method5904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg0 > 2048 ? arg0 + arg2 - (arg2 * arg0 >> 12) : arg0 * (arg2 + 4096) >> 12;
		if (local29 <= 0) {
			this.anInt7569 = this.anInt7580 = this.anInt7572 = arg0;
			return;
		}
		@Pc(49) int local49 = arg1 * 6;
		@Pc(57) int local57 = arg0 + arg0 - local29;
		@Pc(66) int local66 = (local29 - local57 << 12) / local29;
		@Pc(70) int local70 = local49 >> 12;
		@Pc(76) int local76 = local49 - (local70 << 12);
		@Pc(84) int local84 = local29 * local66 >> 12;
		@Pc(90) int local90 = local76 * local84 >> 12;
		@Pc(94) int local94 = local90 + local57;
		@Pc(99) int local99 = local29 - local90;
		if (local70 == 0) {
			this.anInt7572 = local57;
			this.anInt7569 = local29;
			this.anInt7580 = local94;
		} else if (local70 == 1) {
			this.anInt7580 = local29;
			this.anInt7569 = local99;
			this.anInt7572 = local57;
		} else if (local70 == 2) {
			this.anInt7580 = local29;
			this.anInt7572 = local94;
			this.anInt7569 = local57;
		} else if (local70 == 3) {
			this.anInt7572 = local29;
			this.anInt7569 = local57;
			this.anInt7580 = local99;
		} else if (local70 == 4) {
			this.anInt7580 = local57;
			this.anInt7572 = local29;
			this.anInt7569 = local94;
		} else if (local70 == 5) {
			this.anInt7580 = local57;
			this.anInt7569 = local29;
			this.anInt7572 = local99;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIII)V")
	private void method5905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 < arg2 ? arg2 : arg1;
		@Pc(23) int local23 = arg0 <= local16 ? local16 : arg0;
		@Pc(30) int local30 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(41) int local41 = arg0 >= local30 ? local30 : arg0;
		@Pc(46) int local46 = local23 - local41;
		this.anInt7566 = (local41 + local23) / 2;
		if (this.anInt7566 > 0 && this.anInt7566 < 4096) {
			this.anInt7579 = (local46 << 12) / (this.anInt7566 <= 2048 ? this.anInt7566 * 2 : 8192 - this.anInt7566 * 2);
		} else {
			this.anInt7579 = 0;
		}
		if (local46 <= 0) {
			this.anInt7575 = 0;
			return;
		}
		@Pc(109) int local109 = (local23 - arg2 << 12) / local46;
		@Pc(118) int local118 = (local23 - arg1 << 12) / local46;
		@Pc(127) int local127 = (local23 - arg0 << 12) / local46;
		if (arg2 == local23) {
			this.anInt7575 = local41 == arg1 ? local127 + 20480 : 4096 - local118;
		} else if (arg1 == local23) {
			this.anInt7575 = local41 == arg0 ? local109 + 4096 : -local127 + 12288;
		} else {
			this.anInt7575 = local41 == arg2 ? local118 + 12288 : -local109 + 20480;
		}
		this.anInt7575 /= 6;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(27) int[][] local27 = this.method5899(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static406.anInt6694; local53++) {
				this.method5905(local39[local53], local35[local53], local31[local53]);
				this.anInt7575 += this.anInt7568;
				this.anInt7566 += this.anInt7578;
				this.anInt7579 += this.anInt7571;
				while (this.anInt7575 < 0) {
					this.anInt7575 += 4096;
				}
				while (this.anInt7575 > 4096) {
					this.anInt7575 -= 4096;
				}
				if (this.anInt7579 < 0) {
					this.anInt7579 = 0;
				}
				if (this.anInt7566 < 0) {
					this.anInt7566 = 0;
				}
				if (this.anInt7579 > 4096) {
					this.anInt7579 = 4096;
				}
				if (this.anInt7566 > 4096) {
					this.anInt7566 = 4096;
				}
				this.method5904(this.anInt7566, this.anInt7575, this.anInt7579);
				local43[local53] = this.anInt7569;
				local47[local53] = this.anInt7580;
				local51[local53] = this.anInt7572;
			}
		}
		return local11;
	}
}
