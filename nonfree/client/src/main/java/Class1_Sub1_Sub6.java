import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!cp", name = "S", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!cp", name = "U", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!cp", name = "V", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!cp", name = "W", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
	private int anInt1004 = 0;

	@OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
	private int anInt1008 = 0;

	@OriginalMember(owner = "client!cp", name = "X", descriptor = "I")
	private int anInt1014 = 0;

	static {
		new Class151("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZI)V")
	private void method851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 < arg2 ? arg2 : arg0;
		@Pc(23) int local23 = arg1 <= local16 ? local16 : arg1;
		@Pc(30) int local30 = arg2 < arg0 ? arg2 : arg0;
		@Pc(37) int local37 = arg1 >= local30 ? local30 : arg1;
		this.anInt1007 = (local37 + local23) / 2;
		@Pc(48) int local48 = local23 - local37;
		if (local48 > 0) {
			@Pc(66) int local66 = (local23 - arg2 << 12) / local48;
			@Pc(75) int local75 = (local23 - arg0 << 12) / local48;
			@Pc(83) int local83 = (local23 - arg1 << 12) / local48;
			if (arg2 == local23) {
				this.anInt1009 = local37 == arg0 ? local83 + 20480 : -local75 + 4096;
			} else if (local23 == arg0) {
				this.anInt1009 = local37 == arg1 ? local66 + 4096 : -local83 + 12288;
			} else {
				this.anInt1009 = local37 == arg2 ? local75 + 12288 : 20480 - local66;
			}
			this.anInt1009 /= 6;
		} else {
			this.anInt1009 = 0;
		}
		if (this.anInt1007 > 0 && this.anInt1007 < 4096) {
			this.anInt1003 = (local48 << 12) / (this.anInt1007 <= 2048 ? this.anInt1007 * 2 : 8192 - (this.anInt1007 * 2));
		} else {
			this.anInt1003 = 0;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(21) int[][] local21 = this.method5624(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static434.anInt4326; local47++) {
				this.method851(local29[local47], local33[local47], local25[local47]);
				this.anInt1009 += this.anInt1004;
				this.anInt1007 += this.anInt1008;
				this.anInt1003 += this.anInt1014;
				while (this.anInt1009 < 0) {
					this.anInt1009 += 4096;
				}
				if (this.anInt1003 < 0) {
					this.anInt1003 = 0;
				}
				while (this.anInt1009 > 4096) {
					this.anInt1009 -= 4096;
				}
				if (this.anInt1007 < 0) {
					this.anInt1007 = 0;
				}
				if (this.anInt1003 > 4096) {
					this.anInt1003 = 4096;
				}
				if (this.anInt1007 > 4096) {
					this.anInt1007 = 4096;
				}
				this.method856(this.anInt1009, this.anInt1007, this.anInt1003);
				local37[local47] = this.anInt1011;
				local41[local47] = this.anInt1013;
				local45[local47] = this.anInt1012;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1004 = arg1.method4482();
		} else if (arg0 == 1) {
			this.anInt1014 = (arg1.method4452() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt1008 = (arg1.method4452() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V")
	private void method856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg1 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : (arg2 + 4096) * arg1 >> 12;
		if (local25 <= 0) {
			this.anInt1011 = this.anInt1013 = this.anInt1012 = arg1;
			return;
		}
		@Pc(48) int local48 = arg0 * 6;
		@Pc(55) int local55 = arg1 + arg1 - local25;
		@Pc(64) int local64 = (local25 - local55 << 12) / local25;
		@Pc(68) int local68 = local48 >> 12;
		@Pc(75) int local75 = local48 - (local68 << 12);
		@Pc(83) int local83 = local64 * local25 >> 12;
		@Pc(89) int local89 = local75 * local83 >> 12;
		@Pc(93) int local93 = local89 + local55;
		@Pc(98) int local98 = local25 - local89;
		if (local68 == 0) {
			this.anInt1013 = local93;
			this.anInt1011 = local25;
			this.anInt1012 = local55;
		} else if (local68 == 1) {
			this.anInt1013 = local25;
			this.anInt1011 = local98;
			this.anInt1012 = local55;
		} else if (local68 == 2) {
			this.anInt1012 = local93;
			this.anInt1013 = local25;
			this.anInt1011 = local55;
		} else if (local68 == 3) {
			this.anInt1011 = local55;
			this.anInt1012 = local25;
			this.anInt1013 = local98;
		} else if (local68 == 4) {
			this.anInt1012 = local25;
			this.anInt1011 = local93;
			this.anInt1013 = local55;
		} else if (local68 == 5) {
			this.anInt1012 = local98;
			this.anInt1011 = local25;
			this.anInt1013 = local55;
		}
	}
}
