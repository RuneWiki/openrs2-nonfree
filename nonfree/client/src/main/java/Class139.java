import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class139 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public int anInt4215;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	private int anInt4224;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	private int anInt4226;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "I")
	public int anInt4235;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "I")
	public int anInt4238;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "I")
	public int anInt4239;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "I")
	public int anInt4240;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "I")
	private int anInt4241;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "I")
	public int anInt4242;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "I")
	private int anInt4247;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "I")
	public int anInt4232 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "I")
	private int anInt4237 = -1;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	private int anInt4228 = -1;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Z")
	public boolean aBoolean390 = true;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "I")
	public int anInt4233 = 0;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	public int anInt4229 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	private int anInt4214 = -1;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "I")
	private int anInt4231 = -1;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray44 = new String[5];

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public int anInt4219 = -1;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "Z")
	public boolean aBoolean393 = false;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "Z")
	public boolean aBoolean392 = true;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public int anInt4223 = -1;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "I")
	public int anInt4245 = -1;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "I")
	private int anInt4244 = -1;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "I")
	public int anInt4230 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "I")
	public int anInt4243 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "I")
	public int anInt4246 = -1;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "Z")
	public boolean aBoolean391 = true;

	static {
		new Class34("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Z")
	public boolean method3810() {
		if (this.anInt4214 == -1 && this.anInt4244 == -1) {
			return true;
		}
		@Pc(32) int local32;
		if (this.anInt4214 == -1) {
			local32 = Static5.method195(this.anInt4244);
		} else {
			local32 = Static30.anIntArray104[this.anInt4214];
		}
		if (this.anInt4241 > local32 || local32 > this.anInt4247) {
			return false;
		} else if (this.anInt4237 == -1 && this.anInt4231 == -1) {
			return true;
		} else {
			if (this.anInt4237 == -1) {
				local32 = Static5.method195(this.anInt4231);
			} else {
				local32 = Static30.anIntArray104[this.anInt4237];
			}
			return this.anInt4224 <= local32 && local32 <= this.anInt4226;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!uo;I)Lclient!c;")
	public Class5 method3811(@OriginalArg(0) Class32 arg0) {
		@Pc(18) Class5 local18 = (Class5) Static259.aClass87_26.method2482((long) (arg0.anInt2472 << 29 | this.anInt4228 | 0x20000));
		if (local18 != null) {
			return local18;
		}
		Static348.aClass216_97.method5651(this.anInt4228);
		@Pc(39) Class99 local39 = Static366.method2655(Static348.aClass216_97, this.anInt4228, 0);
		if (local39 != null) {
			local18 = arg0.method2149(local39);
			Static259.aClass87_26.method2481(local18, (long) (arg0.anInt2472 << 29 | this.anInt4228 | 0x20000));
		}
		return local18;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!bg;IB)V")
	private void method3814(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4245 = arg0.method4556();
		} else if (arg1 == 2) {
			this.anInt4219 = arg0.method4556();
		} else if (arg1 == 3) {
			this.aString37 = arg0.method4534();
		} else if (arg1 == 4) {
			this.anInt4239 = arg0.method4514();
		} else if (arg1 == 5) {
			this.anInt4223 = arg0.method4514();
		} else if (arg1 == 6) {
			this.anInt4233 = arg0.method4532();
		} else {
			@Pc(65) int local65;
			if (arg1 == 7) {
				local65 = arg0.method4532();
				if ((local65 & 0x1) == 0) {
					this.aBoolean390 = false;
				}
				if ((local65 & 0x2) == 2) {
					this.aBoolean393 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean392 = arg0.method4532() == 1;
			} else if (arg1 == 9) {
				this.anInt4244 = arg0.method4556();
				if (this.anInt4244 == 65535) {
					this.anInt4244 = -1;
				}
				this.anInt4214 = arg0.method4556();
				if (this.anInt4214 == 65535) {
					this.anInt4214 = -1;
				}
				this.anInt4241 = arg0.method4545();
				this.anInt4247 = arg0.method4545();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray44[arg1 - 10] = arg0.method4534();
			} else if (arg1 == 15) {
				local65 = arg0.method4532();
				this.anIntArray381 = new int[local65 * 2];
				for (@Pc(116) int local116 = 0; local116 < local65 * 2; local116++) {
					this.anIntArray381[local116] = arg0.method4551();
				}
				this.anInt4215 = arg0.method4545();
				this.anInt4235 = arg0.method4545();
			} else if (arg1 == 16) {
				this.aBoolean391 = false;
			} else if (arg1 == 17) {
				this.aString36 = arg0.method4534();
			} else if (arg1 == 18) {
				this.anInt4228 = arg0.method4556();
			} else if (arg1 == 19) {
				this.anInt4246 = arg0.method4556();
			} else if (arg1 == 20) {
				this.anInt4231 = arg0.method4556();
				if (this.anInt4231 == 65535) {
					this.anInt4231 = -1;
				}
				this.anInt4237 = arg0.method4556();
				if (this.anInt4237 == 65535) {
					this.anInt4237 = -1;
				}
				this.anInt4224 = arg0.method4545();
				this.anInt4226 = arg0.method4545();
			} else if (arg1 == 21) {
				this.anInt4242 = arg0.method4545();
			} else if (arg1 == 22) {
				this.anInt4240 = arg0.method4545();
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public void method3816() {
		if (this.anIntArray381 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray381.length; local18 += 2) {
			if (this.anIntArray381[local18] < this.anInt4229) {
				this.anInt4229 = this.anIntArray381[local18];
			} else if (this.anIntArray381[local18] > this.anInt4232) {
				this.anInt4232 = this.anIntArray381[local18];
			}
			if (this.anIntArray381[local18 + 1] < this.anInt4243) {
				this.anInt4243 = this.anIntArray381[local18 + 1];
			} else if (this.anIntArray381[local18 + 1] > this.anInt4230) {
				this.anInt4230 = this.anIntArray381[local18 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZLclient!uo;)Lclient!c;")
	public Class5 method3818(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class32 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt4219 : this.anInt4245;
		@Pc(18) int local18 = local11 | arg1.anInt2472 << 29;
		@Pc(25) Class5 local25 = (Class5) Static259.aClass87_26.method2482((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static348.aClass216_97.method5651(local11)) {
			@Pc(41) Class99 local41 = Static366.method2655(Static348.aClass216_97, local11, 0);
			if (local41 != null) {
				local25 = arg1.method2149(local41);
				Static259.aClass87_26.method2481(local25, (long) local18);
			}
			return local25;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!bg;)V")
	public void method3819(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4532();
			if (local7 == 0) {
				return;
			}
			this.method3814(arg0, local7);
		}
	}
}
