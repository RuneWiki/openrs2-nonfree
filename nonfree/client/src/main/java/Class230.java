import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class230 {

	@OriginalMember(owner = "client!mca", name = "M", descriptor = "I")
	private int anInt5797;

	@OriginalMember(owner = "client!mca", name = "G", descriptor = "Lclient!r;")
	private Class5_Sub1_Sub15 aClass5_Sub1_Sub15_4;

	@OriginalMember(owner = "client!mca", name = "I", descriptor = "I")
	private int anInt5815;

	@OriginalMember(owner = "client!mca", name = "z", descriptor = "I")
	private int anInt5818;

	@OriginalMember(owner = "client!mca", name = "Q", descriptor = "I")
	private int anInt5821;

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "Lclient!oe;")
	private Class264 aClass264_1;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "Lclient!ka;")
	private Class43 aClass43_4;

	@OriginalMember(owner = "client!mca", name = "U", descriptor = "Lclient!dq;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "Lclient!tn;")
	public Class4_Sub9 aClass4_Sub9_4;

	@OriginalMember(owner = "client!mca", name = "v", descriptor = "[Z")
	private boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
	private int anInt5798 = -1;

	@OriginalMember(owner = "client!mca", name = "x", descriptor = "Z")
	private boolean aBoolean389 = false;

	@OriginalMember(owner = "client!mca", name = "T", descriptor = "I")
	private int anInt5810 = 0;

	@OriginalMember(owner = "client!mca", name = "J", descriptor = "I")
	private int anInt5806 = 0;

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
	private int anInt5816 = -1;

	@OriginalMember(owner = "client!mca", name = "C", descriptor = "I")
	private int anInt5813 = -1;

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
	public final int anInt5809;

	@OriginalMember(owner = "client!mca", name = "S", descriptor = "I")
	public final int anInt5822;

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
	public final int anInt5826;

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "Lclient!rda;")
	private final Class4_Sub1 aClass4_Sub1_14;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "B")
	private final byte aByte80;

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "B")
	private final byte aByte79;

	@OriginalMember(owner = "client!mca", name = "F", descriptor = "Z")
	private final boolean aBoolean388;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIILclient!rda;ZI)V")
	public Class230(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt5809 = arg2;
		this.anInt5822 = arg3;
		this.anInt5826 = arg1.anInt9392;
		this.aBoolean387 = arg7;
		this.aClass4_Sub1_14 = arg6;
		this.aByte80 = (byte) arg4;
		this.aByte79 = (byte) arg5;
		this.aBoolean388 = arg0.method8624() && arg1.aBoolean643 && !this.aBoolean387;
		if (arg8 != -1) {
			this.aBoolean389 = true;
		}
		this.method5183(arg8);
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)Z")
	public boolean method5178() {
		return this.aBoolean388;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!rda;)V")
	private void method5180(@OriginalArg(1) Class4_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass264_1 == null) {
				if (this.aBoolean389) {
					return;
				}
				this.method5183(-1);
				if (this.aClass264_1 == null) {
					return;
				}
			}
			@Pc(38) int local38 = Static565.anInt8921 - this.anInt5818;
			if (local38 > 100 && this.aClass264_1.anInt7050 > 0) {
				@Pc(59) int local59 = this.aClass264_1.anIntArray423.length - this.aClass264_1.anInt7050;
				while (this.anInt5797 < local59 && this.aClass264_1.anIntArray425[this.anInt5797] < local38) {
					local38 -= this.aClass264_1.anIntArray425[this.anInt5797];
					this.anInt5797++;
				}
				if (this.anInt5797 >= local59) {
					@Pc(108) int local108 = 0;
					for (@Pc(110) int local110 = local59; local110 < this.aClass264_1.anIntArray423.length; local110++) {
						local108 += this.aClass264_1.anIntArray425[local110];
					}
					local38 %= local108;
				}
				this.anInt5815 = this.anInt5797 + 1;
				if (this.anInt5815 >= this.aClass264_1.anIntArray423.length) {
					this.anInt5815 -= this.aClass264_1.anInt7050;
					if (this.anInt5815 < 0 || this.aClass264_1.anIntArray423.length <= this.anInt5815) {
						this.anInt5815 = -1;
					}
				}
			}
			while (local38 > this.aClass264_1.anIntArray425[this.anInt5797]) {
				Static628.method8566(this.aClass264_1, this.anInt5797, arg0);
				local38 -= this.aClass264_1.anIntArray425[this.anInt5797];
				this.anInt5797++;
				if (this.aClass264_1.anIntArray423.length <= this.anInt5797) {
					this.anInt5797 -= this.aClass264_1.anInt7050;
					if (this.anInt5797 < 0 || this.anInt5797 >= this.aClass264_1.anIntArray423.length) {
						this.aClass264_1 = null;
						continue label80;
					}
				}
				this.anInt5815 = this.anInt5797 + 1;
				if (this.anInt5815 >= this.aClass264_1.anIntArray423.length) {
					this.anInt5815 -= this.aClass264_1.anInt7050;
					if (this.anInt5815 < 0 || this.aClass264_1.anIntArray423.length <= this.anInt5815) {
						this.anInt5815 = -1;
					}
				}
			}
			this.anInt5818 = Static565.anInt8921 - local38;
			this.anInt5821 = local38;
			return;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IB)V")
	public void method5182(@OriginalArg(0) int arg0) {
		this.aBoolean389 = true;
		this.method5183(arg0);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V")
	private void method5183(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class354 local19 = Static528.aClass243_3.method5556(this.anInt5826);
			@Pc(21) Class354 local21 = local19;
			if (local19.anIntArray526 != null) {
				local19 = local19.method8024(Static23.aClass247_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray523 != null) {
				if (this.aClass264_1 != null && local19.method8018(this.aClass264_1.anInt7034)) {
					return;
				}
				local7 = local19.method8019();
				if (local19.anInt9392 != this.anInt5813) {
					local9 = local19.aBoolean638;
				}
			} else if (local19.anInt9422 == -1) {
				if (local21 != null && local21.anIntArray523 != null) {
					if (this.aClass264_1 != null && local21.method8018(this.aClass264_1.anInt7034)) {
						return;
					}
					local7 = local21.method8019();
					if (this.anInt5813 != local21.anInt9392) {
						local9 = local21.aBoolean638;
					}
				} else if (local21 != null && local21.anInt9422 != -1 && this.anInt5813 != local21.anInt9392) {
					local9 = local21.aBoolean638;
					local7 = local21.anInt9422;
				}
			} else if (this.anInt5813 != local19.anInt9392) {
				local9 = local19.aBoolean638;
				local7 = local19.anInt9422;
			}
		}
		if (local7 == -1) {
			this.aClass264_1 = null;
			return;
		}
		this.aClass43_4 = null;
		if (this.aClass264_1 == null || this.aClass264_1.anInt7034 != local7) {
			this.aClass264_1 = Static315.aClass14_1.method227(local7);
		} else if (this.aClass264_1.anInt7047 == 0) {
			return;
		}
		if (this.aClass264_1.anIntArray423 == null) {
			this.aClass264_1 = null;
			return;
		}
		if (local9) {
			this.anInt5797 = (int) ((double) this.aClass264_1.anIntArray423.length * Math.random());
			this.anInt5821 = (int) (Math.random() * (double) this.aClass264_1.anIntArray425[this.anInt5797]) + 1;
		} else {
			this.anInt5821 = 1;
			this.anInt5797 = 0;
		}
		this.anInt5815 = this.anInt5797 + 1;
		if (this.anInt5815 < 0 || this.anInt5815 >= this.aClass264_1.anIntArray423.length) {
			this.anInt5815 = -1;
		}
		this.anInt5818 = Static565.anInt8921 - this.anInt5821;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)I")
	public int method5184(@OriginalArg(0) int arg0) {
		if (arg0 < 92) {
			Static352.method5194();
		}
		return this.anInt5810;
	}

	@OriginalMember(owner = "client!mca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub9_4 != null) {
			this.aClass4_Sub9_4.method8044();
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!dq;)V")
	public void method5190(@OriginalArg(1) Class87 arg0) {
		this.aClass43_4 = null;
		this.aClass87_1 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)I")
	public int method5191() {
		return this.anInt5806;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!ha;)V")
	public void method5192(@OriginalArg(1) Class100 arg0) {
		this.method5196(262144, true, arg0, true);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BIIIILclient!ha;Lclient!sj;Lclient!ka;Z)V")
	public void method5193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) Class43 arg6, @OriginalArg(8) boolean arg7) {
		@Pc(6) Class363[] local6 = arg6.method8853();
		@Pc(9) Class270[] local9 = arg6.method8863();
		if ((this.aClass4_Sub9_4 == null || this.aClass4_Sub9_4.aBoolean654) && (local6 != null || local9 != null)) {
			@Pc(34) Class354 local34 = Static528.aClass243_3.method5556(this.anInt5826);
			if (local34.anIntArray526 != null) {
				local34 = local34.method8024(Static23.aClass247_1);
			}
			if (local34 != null) {
				this.aClass4_Sub9_4 = Static585.method8058(Static565.anInt8921, true);
			}
		}
		if (this.aClass4_Sub9_4 == null) {
			return;
		}
		arg6.method8847(arg5);
		if (arg7) {
			this.aClass4_Sub9_4.method8049(arg4, (long) Static565.anInt8921, local6, local9);
		} else {
			this.aClass4_Sub9_4.method8051((long) Static565.anInt8921);
		}
		this.aClass4_Sub9_4.method8057(this.aByte80, arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZLclient!ha;)V")
	public void method5195(@OriginalArg(1) Class100 arg0) {
		if (this.aClass5_Sub1_Sub15_4 != null) {
			Static530.method7245(this.aClass5_Sub1_Sub15_4, this.aByte79, this.aClass4_Sub1_14.anInt9805, this.aClass4_Sub1_14.anInt9803, this.aBooleanArray17);
			this.aClass5_Sub1_Sub15_4 = null;
			this.aBooleanArray17 = null;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZILclient!ha;Z)Lclient!ka;")
	public Class43 method5196(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(17) Class354 local17 = Static528.aClass243_3.method5556(this.anInt5826);
		if (local17.anIntArray526 != null) {
			local17 = local17.method8024(Static23.aClass247_1);
		}
		if (local17 == null) {
			this.method5195(arg2);
			this.anInt5798 = -1;
			this.anInt5813 = -1;
			this.anInt5816 = -1;
			return null;
		}
		if (!this.aBoolean389 && local17.anInt9392 != this.anInt5813) {
			this.aClass43_4 = null;
			this.method5183(-1);
		}
		this.method5180(this.aClass4_Sub1_14);
		if (arg3) {
			@Pc(95) boolean local95 = arg3 & this.aBoolean388 & Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430() != 0;
			arg3 = local95 & (this.anInt5798 != local17.anInt9392 || this.aClass264_1 != null && Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430() >= 2 && (this.anInt5797 != this.anInt5816 || (this.aClass264_1.aBoolean470 || Static54.aBoolean77) && this.anInt5815 != this.anInt5797));
		}
		if (arg1 && !arg3) {
			this.anInt5813 = local17.anInt9392;
			return null;
		}
		if (arg3) {
			Static530.method7245(this.aClass5_Sub1_Sub15_4, this.aByte79, this.aClass4_Sub1_14.anInt9805, this.aClass4_Sub1_14.anInt9803, this.aBooleanArray17);
			this.anInt5816 = -1;
			this.anInt5798 = -1;
		}
		@Pc(193) Class84 local193 = Static177.aClass84Array2[this.aByte79];
		@Pc(212) Class84 local212;
		if (this.aBoolean387) {
			local212 = Static668.aClass84Array4[0];
		} else {
			local212 = this.aByte79 >= 3 ? null : Static177.aClass84Array2[this.aByte79 + 1];
		}
		@Pc(220) Class43 local220 = null;
		if (this.aClass264_1 != null) {
			if (arg3) {
				arg0 |= 0x40000;
			}
			local220 = local17.method8023(this.aClass264_1, this.anInt5809 == 11 ? 10 : this.anInt5809, this.anInt5809 == 11 ? this.anInt5822 + 4 : this.anInt5822, local212, arg0, this.anInt5821, local193.method7625(this.aClass4_Sub1_14.anInt9805, this.aClass4_Sub1_14.anInt9803), this.aClass4_Sub1_14.anInt9803, this.anInt5797, local193, this.aClass87_1, this.aClass4_Sub1_14.anInt9805, this.anInt5815, arg2);
			if (local220 == null) {
				this.aBooleanArray17 = null;
				this.aClass5_Sub1_Sub15_4 = null;
				this.anInt5806 = 0;
				this.anInt5810 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray17 == null) {
						this.aBooleanArray17 = new boolean[4];
					}
					this.aClass5_Sub1_Sub15_4 = local220.ba(this.aClass5_Sub1_Sub15_4);
					Static409.method5964(this.aClass5_Sub1_Sub15_4, this.aByte79, this.aClass4_Sub1_14.anInt9805, this.aClass4_Sub1_14.anInt9803, this.aBooleanArray17);
					this.anInt5816 = this.anInt5797;
					this.anInt5798 = local17.anInt9392;
				}
				this.anInt5806 = local220.fa();
				this.anInt5810 = local220.ma();
			}
			this.aClass43_4 = null;
		} else if (this.aClass43_4 != null && (arg0 & this.aClass43_4.ua()) == arg0 && local17.anInt9392 == this.anInt5813) {
			local220 = this.aClass43_4;
		} else {
			if (this.aClass43_4 != null) {
				arg0 |= this.aClass43_4.ua();
			}
			@Pc(449) Class377 local449 = local17.method8030(this.aClass87_1, this.anInt5809 == 11 ? 10 : this.anInt5809, this.aClass4_Sub1_14.anInt9803, arg2, this.anInt5809 == 11 ? this.anInt5822 + 4 : this.anInt5822, local212, local193, this.aClass4_Sub1_14.anInt9805, arg3, arg0, local193.method7625(this.aClass4_Sub1_14.anInt9805, this.aClass4_Sub1_14.anInt9803));
			if (local449 == null) {
				this.aBooleanArray17 = null;
				this.aClass5_Sub1_Sub15_4 = null;
				this.aClass43_4 = null;
				this.anInt5806 = 0;
				this.anInt5810 = 0;
			} else {
				local220 = local449.aClass43_7;
				this.aClass43_4 = local449.aClass43_7;
				if (arg3) {
					this.aBooleanArray17 = null;
					this.aClass5_Sub1_Sub15_4 = local449.aClass5_Sub1_Sub15_6;
					Static409.method5964(this.aClass5_Sub1_Sub15_4, this.aByte79, this.aClass4_Sub1_14.anInt9805, this.aClass4_Sub1_14.anInt9803, (boolean[]) null);
					this.anInt5798 = local17.anInt9392;
					this.anInt5816 = -1;
				}
				this.anInt5806 = local220.fa();
				this.anInt5810 = local220.ma();
			}
		}
		this.anInt5813 = local17.anInt9392;
		return local220;
	}
}
