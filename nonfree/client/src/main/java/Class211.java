import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class211 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public int anInt6588;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public int anInt6590;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public int anInt6595;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	private int anInt6603;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	private int anInt6604;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "I")
	public int anInt6606;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Ljava/lang/String;")
	public String aString250;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	public int anInt6609;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "[I")
	public int[] anIntArray555;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "I")
	public int anInt6611;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "I")
	private int anInt6613;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString252;

	@OriginalMember(owner = "client!w", name = "R", descriptor = "I")
	private int anInt6618;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public int anInt6586 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41 = new String[5];

	@OriginalMember(owner = "client!w", name = "n", descriptor = "I")
	private int anInt6597 = -1;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public int anInt6587 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "I")
	public int anInt6593 = 0;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	private int anInt6601 = -1;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	private int anInt6607 = -1;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
	public boolean aBoolean441 = true;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Z")
	public boolean aBoolean440 = false;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	private int anInt6600 = -1;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "I")
	public int anInt6612 = -1;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Z")
	public boolean aBoolean442 = true;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public int anInt6589 = -1;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "I")
	public int anInt6615 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "Z")
	public boolean aBoolean443 = true;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	public int anInt6610 = -1;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	private int anInt6617 = -1;

	@OriginalMember(owner = "client!w", name = "T", descriptor = "I")
	public int anInt6620 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!w", name = "S", descriptor = "I")
	public int anInt6619 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!fb;)V")
	public void method5557(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3643();
			if (local5 == 0) {
				return;
			}
			this.method5558(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!fb;)V")
	private void method5558(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt6612 = arg1.method3649();
		} else if (arg0 == 2) {
			this.anInt6610 = arg1.method3649();
		} else if (arg0 == 3) {
			this.aString250 = arg1.method3671();
		} else if (arg0 == 4) {
			this.anInt6588 = arg1.method3659();
		} else if (arg0 == 5) {
			this.anInt6619 = arg1.method3659();
		} else if (arg0 == 6) {
			this.anInt6593 = arg1.method3643();
		} else {
			@Pc(193) int local193;
			if (arg0 == 7) {
				local193 = arg1.method3643();
				if ((local193 & 0x2) == 2) {
					this.aBoolean440 = true;
				}
				if ((local193 & 0x1) == 0) {
					this.aBoolean441 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean443 = arg1.method3643() == 1;
			} else if (arg0 == 9) {
				this.anInt6597 = arg1.method3649();
				if (this.anInt6597 == 65535) {
					this.anInt6597 = -1;
				}
				this.anInt6600 = arg1.method3649();
				if (this.anInt6600 == 65535) {
					this.anInt6600 = -1;
				}
				this.anInt6618 = arg1.method3642();
				this.anInt6603 = arg1.method3642();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray41[arg0 - 10] = arg1.method3671();
			} else if (arg0 == 15) {
				local193 = arg1.method3643();
				this.anIntArray555 = new int[local193 * 2];
				for (@Pc(201) int local201 = 0; local201 < local193 * 2; local201++) {
					this.anIntArray555[local201] = arg1.method3622();
				}
				this.anInt6611 = arg1.method3642();
				this.anInt6606 = arg1.method3642();
			} else if (arg0 == 16) {
				this.aBoolean442 = false;
			} else if (arg0 == 17) {
				this.aString252 = arg1.method3671();
			} else if (arg0 == 18) {
				this.anInt6617 = arg1.method3649();
			} else if (arg0 == 19) {
				this.anInt6589 = arg1.method3649();
			} else if (arg0 == 20) {
				this.anInt6601 = arg1.method3649();
				if (this.anInt6601 == 65535) {
					this.anInt6601 = -1;
				}
				this.anInt6607 = arg1.method3649();
				if (this.anInt6607 == 65535) {
					this.anInt6607 = -1;
				}
				this.anInt6604 = arg1.method3642();
				this.anInt6613 = arg1.method3642();
			} else if (arg0 == 21) {
				this.anInt6609 = arg1.method3642();
			} else if (arg0 == 22) {
				this.anInt6595 = arg1.method3642();
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public void method5561() {
		if (this.anIntArray555 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray555.length; local15 += 2) {
			if (this.anInt6586 > this.anIntArray555[local15]) {
				this.anInt6586 = this.anIntArray555[local15];
			} else if (this.anInt6620 < this.anIntArray555[local15]) {
				this.anInt6620 = this.anIntArray555[local15];
			}
			if (this.anIntArray555[local15 + 1] < this.anInt6587) {
				this.anInt6587 = this.anIntArray555[local15 + 1];
			} else if (this.anInt6615 < this.anIntArray555[local15 + 1]) {
				this.anInt6615 = this.anIntArray555[local15 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
	public boolean method5562() {
		if (this.anInt6600 == -1 && this.anInt6597 == -1) {
			return true;
		}
		@Pc(31) int local31;
		if (this.anInt6600 == -1) {
			local31 = Static174.method2862(this.anInt6597);
		} else {
			local31 = Static38.anIntArray55[this.anInt6600];
		}
		if (this.anInt6618 > local31 || local31 > this.anInt6603) {
			return false;
		} else if (this.anInt6607 == -1 && this.anInt6601 == -1) {
			return true;
		} else {
			if (this.anInt6607 == -1) {
				local31 = Static174.method2862(this.anInt6601);
			} else {
				local31 = Static38.anIntArray55[this.anInt6607];
			}
			return local31 >= this.anInt6604 && this.anInt6613 >= local31;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZZLclient!tj;)Lclient!l;")
	public Class57 method5567(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt6610 : this.anInt6612;
		@Pc(18) int local18 = arg1.anInt5595 << 29 | local11;
		@Pc(30) Class57 local30 = (Class57) Static4.aClass198_3.method5242((long) local18);
		if (local30 != null) {
			return local30;
		} else if (Static186.aClass100_68.method2289(local11)) {
			@Pc(46) Class149 local46 = Static366.method3895(Static186.aClass100_68, local11, 0);
			if (local46 != null) {
				local30 = arg1.method4757(local46);
				Static4.aClass198_3.method5231((long) local18, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!tj;)Lclient!l;")
	public Class57 method5568(@OriginalArg(1) Class122 arg0) {
		@Pc(18) Class57 local18 = (Class57) Static4.aClass198_3.method5242((long) (this.anInt6617 | 0x20000 | arg0.anInt5595 << 29));
		if (local18 != null) {
			return local18;
		}
		Static186.aClass100_68.method2289(this.anInt6617);
		@Pc(34) Class149 local34 = Static366.method3895(Static186.aClass100_68, this.anInt6617, 0);
		if (local34 != null) {
			local18 = arg0.method4757(local34);
			Static4.aClass198_3.method5231((long) (arg0.anInt5595 << 29 | this.anInt6617 | 0x20000), local18);
		}
		return local18;
	}
}
