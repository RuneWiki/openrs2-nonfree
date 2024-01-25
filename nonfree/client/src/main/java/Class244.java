import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class244 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "Lclient!ka;")
	private Class62 aClass62_5;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!gt;")
	private Class141 aClass141_2;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
	private int anInt5687;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "Lclient!sia;")
	public Class3_Sub7 aClass3_Sub7_6;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
	private int anInt5698;

	@OriginalMember(owner = "client!mw", name = "A", descriptor = "I")
	private int anInt5706;

	@OriginalMember(owner = "client!mw", name = "B", descriptor = "Lclient!r;")
	private Class4_Sub5_Sub9 aClass4_Sub5_Sub9_4;

	@OriginalMember(owner = "client!mw", name = "C", descriptor = "[Z")
	private boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
	private int anInt5708;

	@OriginalMember(owner = "client!mw", name = "F", descriptor = "Lclient!fs;")
	private Class124 aClass124_2;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
	private int anInt5704 = 0;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	private int anInt5689 = -1;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
	private int anInt5700 = -1;

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "Z")
	private boolean aBoolean434 = false;

	@OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
	private int anInt5707 = 0;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
	private int anInt5697 = -1;

	@OriginalMember(owner = "client!mw", name = "L", descriptor = "I")
	public final int anInt5711;

	@OriginalMember(owner = "client!mw", name = "K", descriptor = "B")
	private final byte aByte90;

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
	public final int anInt5694;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	public final int anInt5688;

	@OriginalMember(owner = "client!mw", name = "J", descriptor = "Lclient!gda;")
	private final Class3_Sub1 aClass3_Sub1_18;

	@OriginalMember(owner = "client!mw", name = "H", descriptor = "Z")
	private final boolean aBoolean435;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIILclient!gda;ZI)V")
	public Class244(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt5711 = arg3;
		this.aByte90 = (byte) arg5;
		this.aByte89 = (byte) arg4;
		this.anInt5694 = arg1.anInt8738;
		this.anInt5688 = arg2;
		this.aBoolean434 = arg7;
		this.aClass3_Sub1_18 = arg6;
		this.aBoolean435 = arg0.method8152() && arg1.lb && !this.aBoolean434;
		if (arg8 != -1) {
			this.aBoolean433 = true;
		}
		this.method5006(arg8);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)I")
	public int method5004(@OriginalArg(0) byte arg0) {
		return arg0 == -15 ? this.anInt5704 : -36;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!ha;)V")
	public void method5005(@OriginalArg(1) Class33 arg0) {
		this.method5008(262144, true, true, arg0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)V")
	private void method5006(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class342 local18 = Static441.aClass74_169.method2075(this.anInt5694);
			@Pc(20) Class342 local20 = local18;
			if (local18.anIntArray620 != null) {
				local18 = local18.method7495(Static526.aClass293_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray617 != null) {
				if (this.aClass124_2 != null && local18.method7496(this.aClass124_2.anInt3031)) {
					return;
				}
				local7 = local18.method7503();
				if (this.anInt5700 != local18.anInt8738) {
					local9 = local18.aBoolean689;
				}
			} else if (local18.anInt8727 == -1) {
				if (local20 != null && local20.anIntArray617 != null) {
					if (this.aClass124_2 != null && local20.method7496(this.aClass124_2.anInt3031)) {
						return;
					}
					local7 = local20.method7503();
					if (local20.anInt8738 != this.anInt5700) {
						local9 = local20.aBoolean689;
					}
				} else if (local20 != null && local20.anInt8727 != -1 && local20.anInt8738 != this.anInt5700) {
					local7 = local20.anInt8727;
					local9 = local20.aBoolean689;
				}
			} else if (local18.anInt8738 != this.anInt5700) {
				local9 = local18.aBoolean689;
				local7 = local18.anInt8727;
			}
		}
		if (local7 == -1) {
			this.aClass124_2 = null;
			return;
		}
		this.aClass62_5 = null;
		if (this.aClass124_2 == null || this.aClass124_2.anInt3031 != local7) {
			this.aClass124_2 = Static99.aClass2_1.method22(local7);
		} else if (this.aClass124_2.anInt3024 == 0) {
			return;
		}
		if (this.aClass124_2.anIntArray224 == null) {
			this.aClass124_2 = null;
			return;
		}
		if (local9) {
			this.anInt5708 = (int) (Math.random() * (double) this.aClass124_2.anIntArray224.length);
			this.anInt5687 = (int) (Math.random() * (double) this.aClass124_2.anIntArray221[this.anInt5708]) + 1;
		} else {
			this.anInt5687 = 1;
			this.anInt5708 = 0;
		}
		this.anInt5706 = this.anInt5708 + 1;
		if (this.anInt5706 < 0 || this.anInt5706 >= this.aClass124_2.anIntArray224.length) {
			this.anInt5706 = -1;
		}
		this.anInt5698 = Static177.anInt3088 - this.anInt5687;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!gt;)V")
	public void method5007(@OriginalArg(1) Class141 arg0) {
		this.aClass141_2 = arg0;
		this.aClass62_5 = null;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZZILclient!ha;)Lclient!ka;")
	public Class62 method5008(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class33 arg3) {
		@Pc(11) Class342 local11 = Static441.aClass74_169.method2075(this.anInt5694);
		if (local11.anIntArray620 != null) {
			local11 = local11.method7495(Static526.aClass293_1);
		}
		if (local11 == null) {
			this.method5016(arg3);
			this.anInt5697 = -1;
			this.anInt5689 = -1;
			this.anInt5700 = -1;
			return null;
		}
		if (!this.aBoolean433 && local11.anInt8738 != this.anInt5700) {
			this.aClass62_5 = null;
			this.method5006(-1);
		}
		this.method5009(this.aClass3_Sub1_18);
		if (arg2) {
			@Pc(76) boolean local76 = arg2 & this.aBoolean435 & Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571() != 0;
			arg2 = local76 & (local11.anInt8738 != this.anInt5689 || this.aClass124_2 != null && Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571() >= 2 && (this.anInt5708 != this.anInt5697 || (this.aClass124_2.aBoolean222 || Static562.aBoolean673) && this.anInt5706 != this.anInt5708));
		}
		if (arg1 && !arg2) {
			this.anInt5700 = local11.anInt8738;
			return null;
		}
		if (arg2) {
			Static545.method7262(this.aClass4_Sub5_Sub9_4, this.aByte90, this.aClass3_Sub1_18.anInt9925, this.aClass3_Sub1_18.anInt9917, this.aBooleanArray13);
			this.anInt5697 = -1;
			this.anInt5689 = -1;
		}
		@Pc(162) Class42 local162 = Static140.aClass42Array4[this.aByte90];
		@Pc(176) Class42 local176;
		if (this.aBoolean434) {
			local176 = Static655.aClass42Array5[0];
		} else {
			local176 = this.aByte90 < 3 ? Static140.aClass42Array4[this.aByte90 + 1] : null;
		}
		@Pc(193) Class62 local193 = null;
		if (this.aClass124_2 != null) {
			if (arg2) {
				arg0 |= 0x40000;
			}
			local193 = local11.method7502(this.anInt5708, this.aClass3_Sub1_18.anInt9917, arg0, arg3, this.anInt5688 == 11 ? 10 : this.anInt5688, this.anInt5688 == 11 ? this.anInt5711 + 4 : this.anInt5711, this.aClass124_2, local162.method7453(this.aClass3_Sub1_18.anInt9925, this.aClass3_Sub1_18.anInt9917), this.anInt5687, local162, this.aClass3_Sub1_18.anInt9925, this.aClass141_2, this.anInt5706, local176);
			if (local193 == null) {
				this.anInt5704 = 0;
				this.aClass4_Sub5_Sub9_4 = null;
				this.anInt5707 = 0;
				this.aBooleanArray13 = null;
			} else {
				if (arg2) {
					if (this.aBooleanArray13 == null) {
						this.aBooleanArray13 = new boolean[4];
					}
					this.aClass4_Sub5_Sub9_4 = local193.ba(this.aClass4_Sub5_Sub9_4);
					Static383.method8453(this.aClass4_Sub5_Sub9_4, this.aByte90, this.aClass3_Sub1_18.anInt9925, this.aClass3_Sub1_18.anInt9917, this.aBooleanArray13);
					this.anInt5689 = local11.anInt8738;
					this.anInt5697 = this.anInt5708;
				}
				this.anInt5707 = local193.fa();
				this.anInt5704 = local193.ma();
			}
			this.aClass62_5 = null;
		} else if (this.aClass62_5 != null && (arg0 & this.aClass62_5.ua()) == arg0 && local11.anInt8738 == this.anInt5700) {
			local193 = this.aClass62_5;
		} else {
			if (this.aClass62_5 != null) {
				arg0 |= this.aClass62_5.ua();
			}
			@Pc(405) Class395 local405 = local11.method7498(this.aClass3_Sub1_18.anInt9925, this.aClass3_Sub1_18.anInt9917, local162, arg3, local176, arg0, this.aClass141_2, arg2, this.anInt5688 == 11 ? 10 : this.anInt5688, this.anInt5688 == 11 ? this.anInt5711 + 4 : this.anInt5711, local162.method7453(this.aClass3_Sub1_18.anInt9925, this.aClass3_Sub1_18.anInt9917));
			if (local405 == null) {
				this.aClass4_Sub5_Sub9_4 = null;
				this.anInt5707 = 0;
				this.aClass62_5 = null;
				this.aBooleanArray13 = null;
				this.anInt5704 = 0;
			} else {
				local193 = local405.aClass62_7;
				this.aClass62_5 = local405.aClass62_7;
				if (arg2) {
					this.aClass4_Sub5_Sub9_4 = local405.aClass4_Sub5_Sub9_6;
					this.aBooleanArray13 = null;
					Static383.method8453(this.aClass4_Sub5_Sub9_4, this.aByte90, this.aClass3_Sub1_18.anInt9925, this.aClass3_Sub1_18.anInt9917, (boolean[]) null);
					this.anInt5697 = -1;
					this.anInt5689 = local11.anInt8738;
				}
				this.anInt5707 = local193.fa();
				this.anInt5704 = local193.ma();
			}
		}
		this.anInt5700 = local11.anInt8738;
		return local193;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!gda;)V")
	private void method5009(@OriginalArg(1) Class3_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass124_2 == null) {
				if (this.aBoolean433) {
					return;
				}
				this.method5006(-1);
				if (this.aClass124_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static177.anInt3088 - this.anInt5698;
			if (local32 > 100 && this.aClass124_2.anInt3035 > 0) {
				@Pc(53) int local53 = this.aClass124_2.anIntArray224.length - this.aClass124_2.anInt3035;
				while (local53 > this.anInt5708 && local32 > this.aClass124_2.anIntArray221[this.anInt5708]) {
					local32 -= this.aClass124_2.anIntArray221[this.anInt5708];
					this.anInt5708++;
				}
				if (this.anInt5708 >= local53) {
					@Pc(96) int local96 = 0;
					for (@Pc(98) int local98 = local53; local98 < this.aClass124_2.anIntArray224.length; local98++) {
						local96 += this.aClass124_2.anIntArray221[local98];
					}
					local32 %= local96;
				}
				this.anInt5706 = this.anInt5708 + 1;
				if (this.anInt5706 >= this.aClass124_2.anIntArray224.length) {
					this.anInt5706 -= this.aClass124_2.anInt3035;
					if (this.anInt5706 < 0 || this.aClass124_2.anIntArray224.length <= this.anInt5706) {
						this.anInt5706 = -1;
					}
				}
			}
			while (local32 > this.aClass124_2.anIntArray221[this.anInt5708]) {
				Static633.method8389(this.anInt5708, arg0, this.aClass124_2);
				local32 -= this.aClass124_2.anIntArray221[this.anInt5708];
				this.anInt5708++;
				if (this.anInt5708 >= this.aClass124_2.anIntArray224.length) {
					this.anInt5708 -= this.aClass124_2.anInt3035;
					if (this.anInt5708 < 0 || this.aClass124_2.anIntArray224.length <= this.anInt5708) {
						this.aClass124_2 = null;
						continue label80;
					}
				}
				this.anInt5706 = this.anInt5708 + 1;
				if (this.aClass124_2.anIntArray224.length <= this.anInt5706) {
					this.anInt5706 -= this.aClass124_2.anInt3035;
					if (this.anInt5706 < 0 || this.aClass124_2.anIntArray224.length <= this.anInt5706) {
						this.anInt5706 = -1;
					}
				}
			}
			this.anInt5687 = local32;
			this.anInt5698 = Static177.anInt3088 - local32;
			return;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZI)V")
	public void method5010(@OriginalArg(1) int arg0) {
		this.aBoolean433 = true;
		this.method5006(arg0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)I")
	public int method5012() {
		return this.anInt5707;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)Z")
	public boolean method5014() {
		return this.aBoolean435;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZIILclient!ka;IILclient!nh;ILclient!ha;)V")
	public void method5015(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class33 arg7) {
		@Pc(10) Class235[] local10 = arg3.method7331();
		@Pc(13) Class170[] local13 = arg3.method7333();
		if ((this.aClass3_Sub7_6 == null || this.aClass3_Sub7_6.aBoolean652) && (local10 != null || local13 != null)) {
			@Pc(32) Class342 local32 = Static441.aClass74_169.method2075(this.anInt5694);
			if (local32.anIntArray620 != null) {
				local32 = local32.method7495(Static526.aClass293_1);
			}
			if (local32 != null) {
				this.aClass3_Sub7_6 = Static549.method7310(Static177.anInt3088, true);
			}
		}
		if (this.aClass3_Sub7_6 == null) {
			return;
		}
		arg3.method7336(arg5);
		if (arg0) {
			this.aClass3_Sub7_6.method7307(arg7, (long) Static177.anInt3088, local10, local13);
		} else {
			this.aClass3_Sub7_6.method7302((long) Static177.anInt3088);
		}
		this.aClass3_Sub7_6.method7297(this.aByte89, arg2, arg1, arg6, arg4);
	}

	@OriginalMember(owner = "client!mw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub7_6 != null) {
			this.aClass3_Sub7_6.method7304();
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method5016(@OriginalArg(0) Class33 arg0) {
		if (this.aClass4_Sub5_Sub9_4 != null) {
			Static545.method7262(this.aClass4_Sub5_Sub9_4, this.aByte90, this.aClass3_Sub1_18.anInt9925, this.aClass3_Sub1_18.anInt9917, this.aBooleanArray13);
			this.aClass4_Sub5_Sub9_4 = null;
			this.aBooleanArray13 = null;
		}
	}
}
