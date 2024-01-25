import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class266 {

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	private int anInt7769;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
	private int anInt7770;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Lclient!rb;")
	public Class36_Sub7 aClass36_Sub7_7;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "Lclient!c;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
	private int anInt7778;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Lclient!dn;")
	private Class58 aClass58_3;

	@OriginalMember(owner = "client!ws", name = "E", descriptor = "Lclient!j;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!ws", name = "G", descriptor = "[Z")
	private boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!ws", name = "H", descriptor = "I")
	private int anInt7789;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	private int anInt7766 = -1;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "Z")
	private boolean aBoolean658 = false;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
	private int anInt7780 = -1;

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
	private int anInt7785 = -32768;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "B")
	private final byte aByte101;

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
	private int anInt7787;

	@OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
	public final int anInt7786;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
	private int anInt7767;

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "B")
	private final byte aByte102;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	public final int anInt7768;

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
	public final int anInt7784;

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "Z")
	private final boolean aBoolean660;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIIIZI)V")
	public Class266(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte101 = (byte) arg5;
		this.aBoolean659 = arg8;
		this.anInt7787 = arg7;
		this.anInt7786 = arg1.anInt545;
		this.anInt7767 = arg6;
		this.aByte102 = (byte) arg4;
		this.anInt7768 = arg2;
		this.anInt7784 = arg3;
		this.aBoolean660 = arg0.method4638() && arg1.aBoolean44 && !this.aBoolean659;
		if (arg9 != -1) {
			this.aBoolean658 = true;
		}
		this.method5980(arg9);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	private void method5980(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class29 local19 = Static251.aClass207_2.method4977(this.anInt7786);
			@Pc(21) Class29 local21 = local19;
			if (local19.anIntArray36 != null) {
				local19 = local19.method475(Static237.aClass80_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray33 != null) {
				if (this.aClass58_3 != null && local19.method471(this.aClass58_3.anInt1435)) {
					return;
				}
				local7 = local19.method476();
				if (this.anInt7780 != local19.anInt545) {
					local9 = local19.aBoolean42;
				}
			} else if (local19.anInt556 == -1) {
				if (local21 != null && local21.anIntArray33 != null) {
					if (this.aClass58_3 != null && local21.method471(this.aClass58_3.anInt1435)) {
						return;
					}
					local7 = local21.method476();
					if (local21.anInt545 != this.anInt7780) {
						local9 = local21.aBoolean42;
					}
				} else if (local21 != null && local21.anInt556 != -1 && local21.anInt545 != this.anInt7780) {
					local9 = local21.aBoolean42;
					local7 = local21.anInt556;
				}
			} else if (this.anInt7780 != local19.anInt545) {
				local9 = local19.aBoolean42;
				local7 = local19.anInt556;
			}
		}
		if (local7 == -1) {
			this.aClass58_3 = null;
			return;
		}
		this.aClass37_7 = null;
		if (this.aClass58_3 == null || this.aClass58_3.anInt1435 != local7) {
			this.aClass58_3 = Static322.aClass45_5.method690(local7);
		} else if (this.aClass58_3.anInt1436 == 0) {
			return;
		}
		if (this.aClass58_3.anIntArray65 == null) {
			this.aClass58_3 = null;
			return;
		}
		if (local9) {
			this.anInt7769 = (int) (Math.random() * (double) this.aClass58_3.anIntArray65.length);
			this.anInt7789 = (int) ((double) this.aClass58_3.anIntArray66[this.anInt7769] * Math.random()) + 1;
		} else {
			this.anInt7769 = 0;
			this.anInt7789 = 1;
		}
		this.anInt7778 = this.anInt7769 + 1;
		if (this.anInt7778 < 0 || this.aClass58_3.anIntArray65.length <= this.anInt7778) {
			this.anInt7778 = -1;
		}
		this.anInt7770 = Static123.anInt2333 - this.anInt7789;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!qa;Z)V")
	public void method5981(@OriginalArg(0) Class121 arg0) {
		this.method5988(this.anInt7787, this.anInt7767, true, arg0, 262144, true);
	}

	@OriginalMember(owner = "client!ws", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass36_Sub7_7 != null) {
			this.aClass36_Sub7_7.method4883();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!qa;)V")
	public void method5983(@OriginalArg(1) Class121 arg0) {
		if (this.aClass1_Sub1_Sub3_6 != null) {
			Static317.method4368(this.aClass1_Sub1_Sub3_6, this.aByte101, this.anInt7767, this.anInt7787, this.aBooleanArray27);
			this.aBooleanArray27 = null;
			this.aClass1_Sub1_Sub3_6 = null;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Z")
	public boolean method5984() {
		return this.aBoolean660;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)I")
	public int method5985() {
		return this.anInt7785;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)V")
	public void method5986(@OriginalArg(0) int arg0) {
		this.aBoolean658 = true;
		this.method5980(arg0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V")
	private void method5987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass58_3 == null) {
				if (this.aBoolean658) {
					return;
				}
				this.method5980(-1);
				if (this.aClass58_3 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static123.anInt2333 - this.anInt7770;
			if (local33 > 100 && this.aClass58_3.anInt1434 > 0) {
				@Pc(52) int local52 = this.aClass58_3.anIntArray65.length - this.aClass58_3.anInt1434;
				while (local52 > this.anInt7769 && this.aClass58_3.anIntArray66[this.anInt7769] < local33) {
					local33 -= this.aClass58_3.anIntArray66[this.anInt7769];
					this.anInt7769++;
				}
				if (local52 <= this.anInt7769) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local52; local93 < this.aClass58_3.anIntArray65.length; local93++) {
						local91 += this.aClass58_3.anIntArray66[local93];
					}
					local33 %= local91;
				}
				this.anInt7778 = this.anInt7769 + 1;
				if (this.aClass58_3.anIntArray65.length <= this.anInt7778) {
					this.anInt7778 -= this.aClass58_3.anInt1434;
					if (this.anInt7778 < 0 || this.aClass58_3.anIntArray65.length <= this.anInt7778) {
						this.anInt7778 = -1;
					}
				}
			}
			while (local33 > this.aClass58_3.anIntArray66[this.anInt7769]) {
				Static385.method5367(this.aByte102, arg0, this.anInt7769, this.aClass58_3, false, arg1);
				local33 -= this.aClass58_3.anIntArray66[this.anInt7769];
				this.anInt7769++;
				if (this.aClass58_3.anIntArray65.length <= this.anInt7769) {
					this.anInt7769 -= this.aClass58_3.anInt1434;
					if (this.anInt7769 < 0 || this.aClass58_3.anIntArray65.length <= this.anInt7769) {
						this.aClass58_3 = null;
						continue label80;
					}
				}
				this.anInt7778 = this.anInt7769 + 1;
				if (this.anInt7778 >= this.aClass58_3.anIntArray65.length) {
					this.anInt7778 -= this.aClass58_3.anInt1434;
					if (this.anInt7778 < 0 || this.anInt7778 >= this.aClass58_3.anIntArray65.length) {
						this.anInt7778 = -1;
					}
				}
			}
			this.anInt7770 = Static123.anInt2333 - local33;
			this.anInt7789 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIZLclient!qa;IZ)Lclient!c;")
	public Class37 method5988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class121 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class29 local11 = Static251.aClass207_2.method4977(this.anInt7786);
		if (local11.anIntArray36 != null) {
			local11 = local11.method475(Static237.aClass80_1);
		}
		if (local11 == null) {
			this.method5983(arg3);
			this.anInt7780 = -1;
			this.anInt7766 = this.anInt7769;
			return null;
		}
		if (!this.aBoolean658 && this.anInt7780 != local11.anInt545) {
			this.aClass37_7 = null;
			this.method5980(-1);
		}
		this.method5987(arg0, arg1);
		@Pc(75) boolean local75 = arg5 & this.aBoolean660 & Static327.aClass230_Sub1_1.method5636(Static146.anInt2664) != 0;
		@Pc(119) boolean local119 = local75 & (local11.anInt545 != this.anInt7780 || (this.anInt7769 != this.anInt7766 || this.aClass58_3 != null && (this.aClass58_3.aBoolean122 || Static147.aBoolean259) && this.anInt7769 != this.anInt7778) && Static327.aClass230_Sub1_1.method5636(Static146.anInt2664) >= 2);
		if (arg2 && !local119) {
			this.anInt7780 = local11.anInt545;
			this.anInt7766 = this.anInt7769;
			return null;
		}
		if (local119) {
			Static317.method4368(this.aClass1_Sub1_Sub3_6, this.aByte101, this.anInt7767, this.anInt7787, this.aBooleanArray27);
		}
		@Pc(151) Class70 local151 = Static256.aClass70Array2[this.aByte101];
		@Pc(169) Class70 local169;
		if (this.aBoolean659) {
			local169 = Static60.aClass70Array1[0];
		} else {
			local169 = this.aByte101 < 3 ? Static256.aClass70Array2[this.aByte101 + 1] : null;
		}
		@Pc(184) Class37 local184 = null;
		if (this.aClass58_3 != null) {
			if (local119) {
				arg4 |= 0x40000;
			}
			local184 = local11.method466(this.anInt7789, arg4, local151, this.anInt7787, this.aClass58_3, this.anInt7768 == 11 ? this.anInt7784 + 4 : this.anInt7784, this.anInt7768 == 11 ? 10 : this.anInt7768, arg3, this.anInt7769, local151.va(this.anInt7767, this.anInt7787), this.anInt7767, this.anInt7778, local169);
			if (local184 == null) {
				this.aClass1_Sub1_Sub3_6 = null;
				this.anInt7785 = 0;
				this.aBooleanArray27 = null;
			} else {
				if (local119) {
					if (this.aBooleanArray27 == null) {
						this.aBooleanArray27 = new boolean[4];
					}
					this.aClass1_Sub1_Sub3_6 = local184.ua(this.aClass1_Sub1_Sub3_6);
					Static1.method23(this.aClass1_Sub1_Sub3_6, this.aByte101, arg1, arg0, this.aBooleanArray27);
				}
				this.anInt7785 = local184.b();
			}
			this.aClass37_7 = null;
		} else if (this.aClass37_7 != null && arg4 == (this.aClass37_7.n() & arg4) && local11.anInt545 == this.anInt7780) {
			local184 = this.aClass37_7;
		} else {
			if (this.aClass37_7 != null) {
				arg4 |= this.aClass37_7.n();
			}
			@Pc(357) Class209 local357 = local11.method464(arg3, local169, local151.va(this.anInt7767, this.anInt7787), this.anInt7768 == 11 ? 10 : this.anInt7768, this.anInt7767, this.anInt7768 == 11 ? this.anInt7784 + 4 : this.anInt7784, local119, this.anInt7787, arg4, local151);
			if (local357 == null) {
				this.aClass37_7 = null;
				this.aClass1_Sub1_Sub3_6 = null;
				this.aBooleanArray27 = null;
				this.anInt7785 = 0;
			} else {
				local184 = local357.aClass37_6;
				this.aClass37_7 = local357.aClass37_6;
				if (local119) {
					this.aClass1_Sub1_Sub3_6 = local357.aClass1_Sub1_Sub3_5;
					this.aBooleanArray27 = null;
					Static1.method23(this.aClass1_Sub1_Sub3_6, this.aByte101, arg1, arg0, null);
				}
				this.anInt7785 = local184.b();
			}
		}
		this.anInt7787 = arg0;
		this.anInt7767 = arg1;
		this.anInt7780 = local11.anInt545;
		this.anInt7766 = this.anInt7769;
		return local184;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIILclient!c;ZILclient!qa;B)V")
	public void method5990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class37 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class121 arg6) {
		@Pc(13) Class203[] local13 = arg3.method4169();
		@Pc(16) Class265[] local16 = arg3.method4157();
		if ((this.aClass36_Sub7_7 == null || this.aClass36_Sub7_7.aBoolean500) && (local13 != null || local16 != null)) {
			@Pc(35) Class29 local35 = Static251.aClass207_2.method4977(this.anInt7786);
			if (local35.anIntArray36 != null) {
				local35 = local35.method475(Static237.aClass80_1);
			}
			if (local35 != null) {
				this.aClass36_Sub7_7 = new Class36_Sub7(Static123.anInt2333);
			}
		}
		if (this.aClass36_Sub7_7 == null) {
			return;
		}
		if (arg4) {
			this.aClass36_Sub7_7.method4873(arg6, (long) Static123.anInt2333, local13, local16);
		} else {
			this.aClass36_Sub7_7.method4880((long) Static123.anInt2333);
		}
		this.aClass36_Sub7_7.method4884(this.aByte102, arg5, arg0, arg1, arg2);
	}
}
