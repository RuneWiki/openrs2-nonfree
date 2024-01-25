import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class16 {

	@OriginalMember(owner = "client!as", name = "e", descriptor = "[Z")
	private boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	private int anInt680;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Lclient!ba;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "Lclient!w;")
	private Class6_Sub2_Sub14 aClass6_Sub2_Sub14_1;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "Lclient!l;")
	public Class98_Sub3 aClass98_Sub3_3;

	@OriginalMember(owner = "client!as", name = "B", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!as", name = "G", descriptor = "I")
	private int anInt691;

	@OriginalMember(owner = "client!as", name = "H", descriptor = "Lclient!cu;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "I")
	private int anInt675 = -1;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	private int anInt670 = -32768;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	private int anInt678 = -1;

	@OriginalMember(owner = "client!as", name = "J", descriptor = "I")
	private int anInt693 = -1;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	private int anInt677;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public final int anInt672;

	@OriginalMember(owner = "client!as", name = "L", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "B")
	private final byte aByte19;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!as", name = "C", descriptor = "I")
	public final int anInt687;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "I")
	public final int anInt682;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "Z")
	private final boolean aBoolean46;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIIIZI)V")
	public Class16(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt677 = arg7;
		this.anInt672 = arg3;
		this.aByte20 = (byte) arg5;
		this.aByte19 = (byte) arg4;
		this.anInt683 = arg6;
		this.anInt687 = arg1.anInt6905;
		this.aBoolean47 = arg8;
		this.anInt682 = arg2;
		this.aBoolean46 = arg0.method6849() && arg1.aBoolean476 && !this.aBoolean47;
		if (arg9 != -1) {
			this.aBoolean45 = true;
		}
		this.method731(arg9);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method729(@OriginalArg(0) Class14 arg0) {
		this.method730(262144, arg0, this.anInt677, true, this.anInt683, true);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!oa;BIZIZ)Lclient!ba;")
	public Class20 method730(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class252 local11 = Static412.aClass307_4.method6636(this.anInt687);
		if (local11.anIntArray506 != null) {
			local11 = local11.method5799(Static498.aClass101_1);
		}
		if (local11 == null) {
			this.method732(arg1);
			this.anInt675 = -1;
			this.anInt693 = -1;
			this.anInt678 = -1;
			return null;
		}
		if (!this.aBoolean45 && local11.anInt6905 != this.anInt693) {
			this.aClass20_1 = null;
			this.method731(-1);
		}
		this.method733(arg2, arg4);
		if (arg5) {
			@Pc(72) boolean local72 = arg5 & this.aBoolean46 & Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242) != 0;
			arg5 = local72 & (this.anInt678 != local11.anInt6905 || this.aClass57_1 != null && Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242) >= 2 && (this.anInt691 != this.anInt675 || (this.aClass57_1.aBoolean112 || Static132.aBoolean213) && this.anInt680 != this.anInt691));
		}
		if (arg3 && !arg5) {
			this.anInt693 = local11.anInt6905;
			return null;
		}
		if (arg5) {
			Static272.method4497(this.aClass6_Sub2_Sub14_1, this.aByte20, this.anInt683, this.anInt677, this.aBooleanArray2);
			this.anInt678 = -1;
			this.anInt675 = -1;
		}
		@Pc(160) Class59 local160 = Static133.aClass59Array3[this.aByte20];
		@Pc(167) Class59 local167;
		if (this.aBoolean47) {
			local167 = Static273.aClass59Array4[0];
		} else {
			local167 = this.aByte20 >= 3 ? null : Static133.aClass59Array3[this.aByte20 + 1];
		}
		@Pc(184) Class20 local184 = null;
		if (this.aClass57_1 != null) {
			if (arg5) {
				arg0 |= 0x40000;
			}
			local184 = local11.method5784(this.anInt683, arg1, this.anInt686, local160, this.anInt677, this.anInt682 == 11 ? this.anInt672 + 4 : this.anInt672, this.anInt680, local160.sa(this.anInt683, this.anInt677), local167, this.anInt691, this.aClass57_1, this.anInt682 == 11 ? 10 : this.anInt682, arg0);
			if (local184 == null) {
				this.anInt670 = 0;
				this.aClass6_Sub2_Sub14_1 = null;
				this.aBooleanArray2 = null;
			} else {
				if (arg5) {
					if (this.aBooleanArray2 == null) {
						this.aBooleanArray2 = new boolean[4];
					}
					this.aClass6_Sub2_Sub14_1 = local184.Z(this.aClass6_Sub2_Sub14_1);
					Static60.method1249(this.aClass6_Sub2_Sub14_1, this.aByte20, arg4, arg2, this.aBooleanArray2);
					this.anInt675 = this.anInt691;
					this.anInt678 = local11.anInt6905;
				}
				this.anInt670 = local184.DA();
			}
			this.aClass20_1 = null;
		} else if (this.aClass20_1 != null && arg0 == (arg0 & this.aClass20_1.h()) && local11.anInt6905 == this.anInt693) {
			local184 = this.aClass20_1;
		} else {
			if (this.aClass20_1 != null) {
				arg0 |= this.aClass20_1.h();
			}
			@Pc(363) Class202 local363 = local11.method5785(local167, this.anInt677, this.anInt682 == 11 ? this.anInt672 + 4 : this.anInt672, this.anInt683, arg0, local160, local160.sa(this.anInt683, this.anInt677), this.anInt682 == 11 ? 10 : this.anInt682, arg5, arg1);
			if (local363 == null) {
				this.aClass6_Sub2_Sub14_1 = null;
				this.aBooleanArray2 = null;
				this.aClass20_1 = null;
				this.anInt670 = 0;
			} else {
				local184 = local363.aClass20_4;
				this.aClass20_1 = local363.aClass20_4;
				if (arg5) {
					this.aBooleanArray2 = null;
					this.aClass6_Sub2_Sub14_1 = local363.aClass6_Sub2_Sub14_4;
					Static60.method1249(this.aClass6_Sub2_Sub14_1, this.aByte20, arg4, arg2, null);
					this.anInt675 = -1;
					this.anInt678 = local11.anInt6905;
				}
				this.anInt670 = local184.DA();
			}
		}
		this.anInt677 = arg2;
		this.anInt683 = arg4;
		this.anInt693 = local11.anInt6905;
		return local184;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
	private void method731(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class252 local19 = Static412.aClass307_4.method6636(this.anInt687);
			@Pc(21) Class252 local21 = local19;
			if (local19.anIntArray506 != null) {
				local19 = local19.method5799(Static498.aClass101_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray505 != null) {
				if (this.aClass57_1 != null && local19.method5791(this.aClass57_1.anInt1538)) {
					return;
				}
				local7 = local19.method5794();
				if (this.anInt693 != local19.anInt6905) {
					local9 = local19.aBoolean473;
				}
			} else if (local19.anInt6926 == -1) {
				if (local21 != null && local21.anIntArray505 != null) {
					if (this.aClass57_1 != null && local21.method5791(this.aClass57_1.anInt1538)) {
						return;
					}
					local7 = local21.method5794();
					if (local21.anInt6905 != this.anInt693) {
						local9 = local21.aBoolean473;
					}
				} else if (local21 != null && local21.anInt6926 != -1 && this.anInt693 != local21.anInt6905) {
					local7 = local21.anInt6926;
					local9 = local21.aBoolean473;
				}
			} else if (this.anInt693 != local19.anInt6905) {
				local7 = local19.anInt6926;
				local9 = local19.aBoolean473;
			}
		}
		if (local7 == -1) {
			this.aClass57_1 = null;
			return;
		}
		this.aClass20_1 = null;
		if (this.aClass57_1 == null || this.aClass57_1.anInt1538 != local7) {
			this.aClass57_1 = Static78.aClass298_2.method6521(local7);
		} else if (this.aClass57_1.anInt1547 == 0) {
			return;
		}
		if (this.aClass57_1.anIntArray132 == null) {
			this.aClass57_1 = null;
			return;
		}
		if (local9) {
			this.anInt691 = (int) (Math.random() * (double) this.aClass57_1.anIntArray132.length);
			this.anInt686 = (int) ((double) this.aClass57_1.anIntArray130[this.anInt691] * Math.random()) + 1;
		} else {
			this.anInt686 = 1;
			this.anInt691 = 0;
		}
		this.anInt680 = this.anInt691 + 1;
		if (this.anInt680 < 0 || this.aClass57_1.anIntArray132.length <= this.anInt680) {
			this.anInt680 = -1;
		}
		this.anInt681 = Static312.anInt5688 - this.anInt686;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZLclient!oa;)V")
	public void method732(@OriginalArg(1) Class14 arg0) {
		if (this.aClass6_Sub2_Sub14_1 != null) {
			Static272.method4497(this.aClass6_Sub2_Sub14_1, this.aByte20, this.anInt683, this.anInt677, this.aBooleanArray2);
			this.aClass6_Sub2_Sub14_1 = null;
			this.aBooleanArray2 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	private void method733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass57_1 == null) {
				if (this.aBoolean45) {
					return;
				}
				this.method731(-1);
				if (this.aClass57_1 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static312.anInt5688 - this.anInt681;
			if (local34 > 100 && this.aClass57_1.anInt1549 > 0) {
				@Pc(54) int local54 = this.aClass57_1.anIntArray132.length - this.aClass57_1.anInt1549;
				while (this.anInt691 < local54 && this.aClass57_1.anIntArray130[this.anInt691] < local34) {
					local34 -= this.aClass57_1.anIntArray130[this.anInt691];
					this.anInt691++;
				}
				if (local54 <= this.anInt691) {
					@Pc(101) int local101 = 0;
					for (@Pc(103) int local103 = local54; local103 < this.aClass57_1.anIntArray132.length; local103++) {
						local101 += this.aClass57_1.anIntArray130[local103];
					}
					local34 %= local101;
				}
				this.anInt680 = this.anInt691 + 1;
				if (this.anInt680 >= this.aClass57_1.anIntArray132.length) {
					this.anInt680 -= this.aClass57_1.anInt1549;
					if (this.anInt680 < 0 || this.anInt680 >= this.aClass57_1.anIntArray132.length) {
						this.anInt680 = -1;
					}
				}
			}
			while (this.aClass57_1.anIntArray130[this.anInt691] < local34) {
				Static520.method6532(this.aByte19, this.aClass57_1, false, arg1, this.anInt691, arg0);
				local34 -= this.aClass57_1.anIntArray130[this.anInt691];
				this.anInt691++;
				if (this.anInt691 >= this.aClass57_1.anIntArray132.length) {
					this.anInt691 -= this.aClass57_1.anInt1549;
					if (this.anInt691 < 0 || this.aClass57_1.anIntArray132.length <= this.anInt691) {
						this.aClass57_1 = null;
						continue label80;
					}
				}
				this.anInt680 = this.anInt691 + 1;
				if (this.aClass57_1.anIntArray132.length <= this.anInt680) {
					this.anInt680 -= this.aClass57_1.anInt1549;
					if (this.anInt680 < 0 || this.aClass57_1.anIntArray132.length <= this.anInt680) {
						this.anInt680 = -1;
					}
				}
			}
			this.anInt681 = Static312.anInt5688 - local34;
			this.anInt686 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!as", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass98_Sub3_3 != null) {
			this.aClass98_Sub3_3.method4537();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
	public int method734() {
		return this.anInt670;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!q;ZILclient!ba;ILclient!oa;BII)V")
	public void method735(@OriginalArg(0) Class54 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class85[] local6 = arg3.method7267();
		@Pc(15) Class90[] local15 = arg3.method7261();
		if ((this.aClass98_Sub3_3 == null || this.aClass98_Sub3_3.aBoolean369) && (local6 != null || local15 != null)) {
			@Pc(34) Class252 local34 = Static412.aClass307_4.method6636(this.anInt687);
			if (local34.anIntArray506 != null) {
				local34 = local34.method5799(Static498.aClass101_1);
			}
			if (local34 != null) {
				this.aClass98_Sub3_3 = Static275.method4528(Static312.anInt5688, true);
			}
		}
		if (this.aClass98_Sub3_3 == null) {
			return;
		}
		arg3.method7263(arg0);
		if (arg1) {
			this.aClass98_Sub3_3.method4538(arg5, (long) Static312.anInt5688, local6, local15);
		} else {
			this.aClass98_Sub3_3.method4534((long) Static312.anInt5688);
		}
		this.aClass98_Sub3_3.method4530(this.aByte19, arg4, arg2, arg6, arg7);
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(II)V")
	public void method736(@OriginalArg(0) int arg0) {
		this.aBoolean45 = true;
		this.method731(arg0);
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Z")
	public boolean method738() {
		return this.aBoolean46;
	}
}
