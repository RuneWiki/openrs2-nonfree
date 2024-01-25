import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class216 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	private int anInt6594;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	private int anInt6599;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	private int anInt6606;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	private int anInt6612;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "Lclient!b;")
	private Class14 aClass14_2;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "[Z")
	private boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "Lclient!o;")
	private Class4_Sub4_Sub4 aClass4_Sub4_Sub4_6;

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "Lclient!nl;")
	public Class2_Sub4 aClass2_Sub4_6;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "Lclient!ni;")
	private Class38 aClass38_7;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	private int anInt6593 = -32768;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	private int anInt6605 = -1;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	private int anInt6613 = -1;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Z")
	private boolean aBoolean478 = false;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "Z")
	private boolean aBoolean479 = false;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	private int anInt6614;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
	public final int anInt6616;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	private int anInt6598;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
	public final int anInt6611;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
	public final int anInt6617;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "Z")
	private final boolean aBoolean477;

	static {
		new Class159("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIIIZI)V")
	public Class216(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aBoolean478 = arg8;
		this.anInt6614 = arg6;
		this.anInt6616 = arg1.anInt534;
		this.aByte73 = (byte) arg5;
		this.anInt6598 = arg7;
		this.anInt6611 = arg3;
		this.aByte74 = (byte) arg4;
		this.anInt6617 = arg2;
		this.aBoolean477 = arg0.method2740() && arg1.aBoolean52 && !this.aBoolean478;
		if (arg9 != -1) {
			this.aBoolean479 = true;
		}
		this.method5537(arg9);
	}

	@OriginalMember(owner = "client!wg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub4_6 != null) {
			this.aClass2_Sub4_6.method3930();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	private void method5537(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(20) Class18 local20 = Static113.method2380(this.anInt6616);
			@Pc(22) Class18 local22 = local20;
			if (local20.anIntArray23 != null) {
				local20 = local20.method416();
			}
			if (local20 == null) {
				return;
			}
			if (local22 == local20) {
				local22 = null;
			}
			if (local20.anIntArray19 != null) {
				if (this.aClass14_2 != null && local20.method404(this.aClass14_2.anInt353)) {
					return;
				}
				local7 = local20.method422();
				if (this.anInt6605 != local20.anInt534) {
					local9 = local20.aBoolean50;
				}
			} else if (local20.anInt516 == -1) {
				if (local22 != null && local22.anIntArray19 != null) {
					if (this.aClass14_2 != null && local22.method404(this.aClass14_2.anInt353)) {
						return;
					}
					local7 = local22.method422();
					if (this.anInt6605 != local22.anInt534) {
						local9 = local22.aBoolean50;
					}
				} else if (local22 != null && local22.anInt516 != -1 && this.anInt6605 != local22.anInt534) {
					local9 = local22.aBoolean50;
					local7 = local22.anInt516;
				}
			} else if (this.anInt6605 != local20.anInt534) {
				local7 = local20.anInt516;
				local9 = local20.aBoolean50;
			}
		}
		if (local7 == -1) {
			this.aClass14_2 = null;
			return;
		}
		this.aClass38_7 = null;
		if (this.aClass14_2 == null || this.aClass14_2.anInt353 != local7) {
			this.aClass14_2 = Static225.method4042(local7);
		} else if (this.aClass14_2.anInt351 == 0) {
			return;
		}
		if (this.aClass14_2.anIntArray12 == null) {
			this.aClass14_2 = null;
			return;
		}
		if (local9) {
			this.anInt6599 = (int) (Math.random() * (double) this.aClass14_2.anIntArray12.length);
			this.anInt6594 = (int) ((double) this.aClass14_2.anIntArray11[this.anInt6599] * Math.random()) + 1;
		} else {
			this.anInt6599 = 0;
			this.anInt6594 = 1;
		}
		this.anInt6606 = this.anInt6599 + 1;
		if (this.anInt6606 < 0 || this.aClass14_2.anIntArray12.length <= this.anInt6606) {
			this.anInt6606 = -1;
		}
		this.anInt6612 = Static199.anInt4137 - this.anInt6594;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!vq;)V")
	public void method5538(@OriginalArg(1) Class47 arg0) {
		this.method5549(this.anInt6598, true, this.anInt6614, arg0, true, 131072);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIILclient!vq;ILclient!ni;I)V")
	public void method5540(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class47 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class38 arg6) {
		@Pc(12) Class89[] local12 = arg6.method1917();
		@Pc(15) Class175[] local15 = arg6.method1901();
		if ((this.aClass2_Sub4_6 == null || this.aClass2_Sub4_6.aBoolean348) && (local12 != null || local15 != null)) {
			@Pc(33) Class18 local33 = Static113.method2380(this.anInt6616);
			if (local33.anIntArray23 != null) {
				local33 = local33.method416();
			}
			if (local33 != null) {
				this.aClass2_Sub4_6 = new Class2_Sub4(Static199.anInt4137);
			}
		}
		if (this.aClass2_Sub4_6 == null) {
			return;
		}
		if (arg0) {
			this.aClass2_Sub4_6.method3929(arg4, (long) Static199.anInt4137, local12, local15);
		} else {
			this.aClass2_Sub4_6.method3931((long) Static199.anInt4137);
		}
		this.aClass2_Sub4_6.method3925(this.aByte74, arg5, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
	public boolean method5541() {
		return this.aBoolean477;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)I")
	public int method5542() {
		return this.anInt6593;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!vq;Z)V")
	public void method5543(@OriginalArg(0) Class47 arg0) {
		if (this.aClass4_Sub4_Sub4_6 != null) {
			Static66.method1584(this.aClass4_Sub4_Sub4_6, this.aByte73, this.anInt6614, this.anInt6598, this.aBooleanArray29);
			this.aClass4_Sub4_Sub4_6 = null;
			this.aBooleanArray29 = null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
	private void method5545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass14_2 == null) {
				if (this.aBoolean479) {
					return;
				}
				this.method5537(-1);
				if (this.aClass14_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static199.anInt4137 - this.anInt6612;
			if (local32 > 100 && this.aClass14_2.anInt348 > 0) {
				@Pc(50) int local50 = this.aClass14_2.anIntArray12.length - this.aClass14_2.anInt348;
				while (local50 > this.anInt6599 && local32 > this.aClass14_2.anIntArray11[this.anInt6599]) {
					local32 -= this.aClass14_2.anIntArray11[this.anInt6599];
					this.anInt6599++;
				}
				if (local50 <= this.anInt6599) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass14_2.anIntArray12.length; local91++) {
						local89 += this.aClass14_2.anIntArray11[local91];
					}
					local32 %= local89;
				}
				this.anInt6606 = this.anInt6599 + 1;
				if (this.aClass14_2.anIntArray12.length <= this.anInt6606) {
					this.anInt6606 -= this.aClass14_2.anInt348;
					if (this.anInt6606 < 0 || this.anInt6606 >= this.aClass14_2.anIntArray12.length) {
						this.anInt6606 = -1;
					}
				}
			}
			while (local32 > this.aClass14_2.anIntArray11[this.anInt6599]) {
				Static167.method3265(arg1, arg0, this.anInt6599, false, this.aClass14_2);
				local32 -= this.aClass14_2.anIntArray11[this.anInt6599];
				this.anInt6599++;
				if (this.aClass14_2.anIntArray12.length <= this.anInt6599) {
					this.anInt6599 -= this.aClass14_2.anInt348;
					if (this.anInt6599 < 0 || this.aClass14_2.anIntArray12.length <= this.anInt6599) {
						this.aClass14_2 = null;
						continue label80;
					}
				}
				this.anInt6606 = this.anInt6599 + 1;
				if (this.aClass14_2.anIntArray12.length <= this.anInt6606) {
					this.anInt6606 -= this.aClass14_2.anInt348;
					if (this.anInt6606 < 0 || this.aClass14_2.anIntArray12.length <= this.anInt6606) {
						this.anInt6606 = -1;
					}
				}
			}
			this.anInt6594 = local32;
			this.anInt6612 = Static199.anInt4137 - local32;
			return;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
	public void method5546(@OriginalArg(1) int arg0) {
		this.aBoolean479 = true;
		this.method5537(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZILclient!vq;IZI)Lclient!ni;")
	public Class38 method5549(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class18 local10 = Static113.method2380(this.anInt6616);
		if (local10.anIntArray23 != null) {
			local10 = local10.method416();
		}
		if (local10 == null) {
			this.method5543(arg3);
			this.anInt6605 = -1;
			this.anInt6613 = this.anInt6599;
			return null;
		}
		if (!this.aBoolean479 && this.anInt6605 != local10.anInt534) {
			this.aClass38_7 = null;
			this.method5537(-1);
		}
		this.method5545(arg0, arg2);
		@Pc(67) boolean local67 = arg4 & this.aBoolean477 & Static9.anInt216 != 0;
		@Pc(108) boolean local108 = local67 & (this.anInt6605 != local10.anInt534 || (this.anInt6599 != this.anInt6613 || this.aClass14_2 != null && (this.aClass14_2.aBoolean31 || Static246.aBoolean378) && this.anInt6606 != this.anInt6599) && Static9.anInt216 >= 2);
		if (arg1 && !local108) {
			this.anInt6605 = local10.anInt534;
			this.anInt6613 = this.anInt6599;
			return null;
		}
		if (local108) {
			Static66.method1584(this.aClass4_Sub4_Sub4_6, this.aByte73, this.anInt6614, this.anInt6598, this.aBooleanArray29);
		}
		@Pc(148) Class60 local148 = Static261.aClass60Array2[this.aByte73];
		@Pc(155) Class60 local155;
		if (this.aBoolean478) {
			local155 = Static304.aClass60Array3[0];
		} else {
			local155 = this.aByte73 < 3 ? Static261.aClass60Array2[this.aByte73 + 1] : null;
		}
		@Pc(172) Class38 local172 = null;
		if (this.aClass14_2 != null) {
			if (local108) {
				arg5 |= 0x20000;
			}
			local172 = local10.method415(arg5, local148.method2270(this.anInt6614, this.anInt6598), this.anInt6599, this.aClass14_2, this.anInt6594, local148, local155, this.anInt6606, this.anInt6614, arg3, this.anInt6617 == 11 ? this.anInt6611 + 4 : this.anInt6611, this.anInt6598, this.anInt6617 == 11 ? 10 : this.anInt6617);
			if (local172 == null) {
				this.aClass4_Sub4_Sub4_6 = null;
				this.anInt6593 = 0;
				this.aBooleanArray29 = null;
			} else {
				if (local108) {
					if (this.aBooleanArray29 == null) {
						this.aBooleanArray29 = new boolean[4];
					}
					this.aClass4_Sub4_Sub4_6 = local172.method1914(this.aClass4_Sub4_Sub4_6);
					Static70.method1652(this.aClass4_Sub4_Sub4_6, this.aByte73, arg2, arg0, this.aBooleanArray29);
				}
				this.anInt6593 = local172.method1921();
			}
			this.aClass38_7 = null;
		} else if (this.aClass38_7 != null && arg5 == (arg5 & this.aClass38_7.method1898()) && local10.anInt534 == this.anInt6605) {
			local172 = this.aClass38_7;
		} else {
			if (this.aClass38_7 != null) {
				arg5 |= this.aClass38_7.method1898();
			}
			@Pc(247) Class184 local247 = local10.method410(arg5, this.anInt6598, local148, this.anInt6617 == 11 ? this.anInt6611 + 4 : this.anInt6611, this.anInt6617 == 11 ? 10 : this.anInt6617, this.anInt6614, arg3, local108, local155, local148.method2270(this.anInt6614, this.anInt6598));
			if (local247 == null) {
				this.anInt6593 = 0;
				this.aClass38_7 = null;
				this.aBooleanArray29 = null;
				this.aClass4_Sub4_Sub4_6 = null;
			} else {
				local172 = local247.aClass38_5;
				this.aClass38_7 = local247.aClass38_5;
				if (local108) {
					this.aClass4_Sub4_Sub4_6 = local247.aClass4_Sub4_Sub4_4;
					this.aBooleanArray29 = null;
					Static70.method1652(this.aClass4_Sub4_Sub4_6, this.aByte73, arg2, arg0, null);
				}
				this.anInt6593 = local172.method1921();
			}
		}
		this.anInt6614 = arg2;
		this.anInt6613 = this.anInt6599;
		this.anInt6598 = arg0;
		this.anInt6605 = local10.anInt534;
		return local172;
	}
}
