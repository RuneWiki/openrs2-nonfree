import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class390 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "[Z")
	private boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	private int anInt10738;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "Lclient!r;")
	private Class6_Sub4_Sub5 aClass6_Sub4_Sub5_6;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "Lclient!ka;")
	private Class184 aClass184_7;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Lclient!ju;")
	public Class2_Sub8 aClass2_Sub8_8;

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "I")
	private int anInt10756;

	@OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
	private int anInt10757;

	@OriginalMember(owner = "client!wm", name = "J", descriptor = "Lclient!aka;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!wm", name = "L", descriptor = "Lclient!gf;")
	private Class119 aClass119_2;

	@OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
	private int anInt10761;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	private int anInt10750 = 0;

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "Z")
	private boolean aBoolean740 = false;

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
	private int anInt10753 = 0;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "Z")
	private boolean aBoolean739 = false;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
	private int anInt10737 = -1;

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
	private int anInt10755 = -1;

	@OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
	private int anInt10758 = -1;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	public final int anInt10748;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "Lclient!oq;")
	private final Class2_Sub1 aClass2_Sub1_23;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
	public final int anInt10742;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
	public final int anInt10752;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "B")
	private final byte aByte150;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "B")
	private final byte aByte149;

	@OriginalMember(owner = "client!wm", name = "I", descriptor = "Z")
	private final boolean aBoolean741;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIILclient!oq;ZI)V")
	public Class390(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt10748 = arg3;
		this.aClass2_Sub1_23 = arg6;
		this.anInt10742 = arg1.anInt8569;
		this.aBoolean740 = arg7;
		this.anInt10752 = arg2;
		this.aByte150 = (byte) arg4;
		this.aByte149 = (byte) arg5;
		this.aBoolean741 = arg0.method7480() && arg1.aBoolean592 && !this.aBoolean740;
		if (arg8 != -1) {
			this.aBoolean739 = true;
		}
		this.method9078(arg8);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!aka;I)V")
	public void method9076(@OriginalArg(0) Class18 arg0) {
		this.aClass184_7 = null;
		this.aClass18_2 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub8_8 != null) {
			this.aClass2_Sub8_8.method4175();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
	private void method9078(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0;
		@Pc(13) boolean local13 = false;
		if (arg0 == -1) {
			@Pc(22) Class308 local22 = Static411.aClass88_3.method2024(this.anInt10742);
			@Pc(24) Class308 local24 = local22;
			if (local22.anIntArray566 != null) {
				local22 = local22.method7297(Static659.aClass363_3);
			}
			if (local22 == null) {
				return;
			}
			if (local24 == local22) {
				local24 = null;
			}
			if (local22.anIntArray568 != null) {
				if (this.aClass119_2 != null && local22.method7304(this.aClass119_2.anInt3015)) {
					return;
				}
				local11 = local22.method7294();
				if (local22.anInt8569 != this.anInt10755) {
					local13 = local22.aBoolean593;
				}
			} else if (local22.anInt8618 == -1) {
				if (local24 != null && local24.anIntArray568 != null) {
					if (this.aClass119_2 != null && local24.method7304(this.aClass119_2.anInt3015)) {
						return;
					}
					local11 = local24.method7294();
					if (local24.anInt8569 != this.anInt10755) {
						local13 = local24.aBoolean593;
					}
				} else if (local24 != null && local24.anInt8618 != -1 && this.anInt10755 != local24.anInt8569) {
					local11 = local24.anInt8618;
					local13 = local24.aBoolean593;
				}
			} else if (this.anInt10755 != local22.anInt8569) {
				local11 = local22.anInt8618;
				local13 = local22.aBoolean593;
			}
		}
		if (local11 == -1) {
			this.aClass119_2 = null;
			return;
		}
		this.aClass184_7 = null;
		if (this.aClass119_2 == null || this.aClass119_2.anInt3015 != local11) {
			this.aClass119_2 = Static334.aClass268_2.method6469(local11);
		} else if (this.aClass119_2.anInt3012 == 0) {
			return;
		}
		if (this.aClass119_2.anIntArray167 == null) {
			this.aClass119_2 = null;
			return;
		}
		if (local13) {
			this.anInt10756 = (int) ((double) this.aClass119_2.anIntArray167.length * Math.random());
			this.anInt10738 = (int) ((double) this.aClass119_2.anIntArray168[this.anInt10756] * Math.random()) + 1;
		} else {
			this.anInt10756 = 0;
			this.anInt10738 = 1;
		}
		this.anInt10757 = this.anInt10756 + 1;
		if (this.anInt10757 < 0 || this.anInt10757 >= this.aClass119_2.anIntArray167.length) {
			this.anInt10757 = -1;
		}
		this.anInt10761 = Static90.anInt1698 - this.anInt10738;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!ha;)V")
	public void method9079(@OriginalArg(1) Class132 arg0) {
		if (this.aClass6_Sub4_Sub5_6 != null) {
			Static187.method2664(this.aClass6_Sub4_Sub5_6, this.aByte149, this.aClass2_Sub1_23.anInt10006, this.aClass2_Sub1_23.anInt10001, this.aBooleanArray36);
			this.aBooleanArray36 = null;
			this.aClass6_Sub4_Sub5_6 = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!ha;)V")
	public void method9080(@OriginalArg(1) Class132 arg0) {
		this.method9082(true, arg0, 262144, true);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!oq;Z)V")
	private void method9081(@OriginalArg(0) Class2_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass119_2 == null) {
				if (this.aBoolean739) {
					return;
				}
				this.method9078(-1);
				if (this.aClass119_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static90.anInt1698 - this.anInt10761;
			if (local32 > 100 && this.aClass119_2.anInt3005 > 0) {
				@Pc(54) int local54 = this.aClass119_2.anIntArray167.length - this.aClass119_2.anInt3005;
				while (this.anInt10756 < local54 && local32 > this.aClass119_2.anIntArray168[this.anInt10756]) {
					local32 -= this.aClass119_2.anIntArray168[this.anInt10756];
					this.anInt10756++;
				}
				if (this.anInt10756 >= local54) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local54; local91 < this.aClass119_2.anIntArray167.length; local91++) {
						local89 += this.aClass119_2.anIntArray168[local91];
					}
					local32 %= local89;
				}
				this.anInt10757 = this.anInt10756 + 1;
				if (this.anInt10757 >= this.aClass119_2.anIntArray167.length) {
					this.anInt10757 -= this.aClass119_2.anInt3005;
					if (this.anInt10757 < 0 || this.aClass119_2.anIntArray167.length <= this.anInt10757) {
						this.anInt10757 = -1;
					}
				}
			}
			while (this.aClass119_2.anIntArray168[this.anInt10756] < local32) {
				Static658.method8966(arg0, this.anInt10756, this.aClass119_2);
				local32 -= this.aClass119_2.anIntArray168[this.anInt10756];
				this.anInt10756++;
				if (this.anInt10756 >= this.aClass119_2.anIntArray167.length) {
					this.anInt10756 -= this.aClass119_2.anInt3005;
					if (this.anInt10756 < 0 || this.anInt10756 >= this.aClass119_2.anIntArray167.length) {
						this.aClass119_2 = null;
						continue label80;
					}
				}
				this.anInt10757 = this.anInt10756 + 1;
				if (this.anInt10757 >= this.aClass119_2.anIntArray167.length) {
					this.anInt10757 -= this.aClass119_2.anInt3005;
					if (this.anInt10757 < 0 || this.anInt10757 >= this.aClass119_2.anIntArray167.length) {
						this.anInt10757 = -1;
					}
				}
			}
			this.anInt10761 = Static90.anInt1698 - local32;
			this.anInt10738 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BZLclient!ha;IZ)Lclient!ka;")
	public Class184 method9082(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class132 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class308 local11 = Static411.aClass88_3.method2024(this.anInt10742);
		if (local11.anIntArray566 != null) {
			local11 = local11.method7297(Static659.aClass363_3);
		}
		if (local11 == null) {
			this.method9079(arg1);
			this.anInt10737 = -1;
			this.anInt10755 = -1;
			this.anInt10758 = -1;
			return null;
		}
		if (!this.aBoolean739 && this.anInt10755 != local11.anInt8569) {
			this.aClass184_7 = null;
			this.method9078(-1);
		}
		this.method9081(this.aClass2_Sub1_23);
		if (arg3) {
			@Pc(85) boolean local85 = arg3 & this.aBoolean741 & Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428() != 0;
			arg3 = local85 & (this.anInt10758 != local11.anInt8569 || this.aClass119_2 != null && Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428() >= 2 && (this.anInt10737 != this.anInt10756 || (this.aClass119_2.aBoolean185 || Static386.aBoolean433) && this.anInt10757 != this.anInt10756));
		}
		if (arg0 && !arg3) {
			this.anInt10755 = local11.anInt8569;
			return null;
		}
		if (arg3) {
			Static187.method2664(this.aClass6_Sub4_Sub5_6, this.aByte149, this.aClass2_Sub1_23.anInt10006, this.aClass2_Sub1_23.anInt10001, this.aBooleanArray36);
			this.anInt10737 = -1;
			this.anInt10758 = -1;
		}
		@Pc(165) Class12 local165 = Static289.aClass12Array3[this.aByte149];
		@Pc(172) Class12 local172;
		if (this.aBoolean740) {
			local172 = Static64.aClass12Array1[0];
		} else {
			local172 = this.aByte149 >= 3 ? null : Static289.aClass12Array3[this.aByte149 + 1];
		}
		@Pc(191) Class184 local191 = null;
		if (this.aClass119_2 != null) {
			if (arg3) {
				arg2 |= 0x40000;
			}
			local191 = local11.method7299(local165.method7854(this.aClass2_Sub1_23.anInt10001, this.aClass2_Sub1_23.anInt10006), this.aClass18_2, this.anInt10752 == 11 ? 10 : this.anInt10752, this.anInt10757, this.anInt10738, arg1, local172, local165, arg2, this.anInt10756, this.aClass2_Sub1_23.anInt10001, this.aClass119_2, this.anInt10752 == 11 ? this.anInt10748 + 4 : this.anInt10748, this.aClass2_Sub1_23.anInt10006);
			if (local191 == null) {
				this.anInt10750 = 0;
				this.aBooleanArray36 = null;
				this.aClass6_Sub4_Sub5_6 = null;
				this.anInt10753 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray36 == null) {
						this.aBooleanArray36 = new boolean[4];
					}
					this.aClass6_Sub4_Sub5_6 = local191.ba(this.aClass6_Sub4_Sub5_6);
					Static312.method7136(this.aClass6_Sub4_Sub5_6, this.aByte149, this.aClass2_Sub1_23.anInt10006, this.aClass2_Sub1_23.anInt10001, this.aBooleanArray36);
					this.anInt10758 = local11.anInt8569;
					this.anInt10737 = this.anInt10756;
				}
				this.anInt10750 = local191.fa();
				this.anInt10753 = local191.ma();
			}
			this.aClass184_7 = null;
		} else if (this.aClass184_7 != null && arg2 == (this.aClass184_7.ua() & arg2) && local11.anInt8569 == this.anInt10755) {
			local191 = this.aClass184_7;
		} else {
			if (this.aClass184_7 != null) {
				arg2 |= this.aClass184_7.ua();
			}
			@Pc(275) Class345 local275 = local11.method7306(arg1, this.anInt10752 == 11 ? 10 : this.anInt10752, local172, this.aClass2_Sub1_23.anInt10001, arg3, this.aClass2_Sub1_23.anInt10006, local165.method7854(this.aClass2_Sub1_23.anInt10001, this.aClass2_Sub1_23.anInt10006), this.anInt10752 == 11 ? this.anInt10748 + 4 : this.anInt10748, arg2, this.aClass18_2, local165);
			if (local275 == null) {
				this.aBooleanArray36 = null;
				this.anInt10753 = 0;
				this.aClass184_7 = null;
				this.aClass6_Sub4_Sub5_6 = null;
				this.anInt10750 = 0;
			} else {
				local191 = local275.aClass184_5;
				this.aClass184_7 = local275.aClass184_5;
				if (arg3) {
					this.aBooleanArray36 = null;
					this.aClass6_Sub4_Sub5_6 = local275.aClass6_Sub4_Sub5_4;
					Static312.method7136(this.aClass6_Sub4_Sub5_6, this.aByte149, this.aClass2_Sub1_23.anInt10006, this.aClass2_Sub1_23.anInt10001, (boolean[]) null);
					this.anInt10758 = local11.anInt8569;
					this.anInt10737 = -1;
				}
				this.anInt10750 = local191.fa();
				this.anInt10753 = local191.ma();
			}
		}
		this.anInt10755 = local11.anInt8569;
		return local191;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
	public int method9083(@OriginalArg(0) int arg0) {
		if (arg0 != -16897) {
			this.method9085();
		}
		return this.anInt10753;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)Z")
	public boolean method9085() {
		return this.aBoolean741;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)I")
	public int method9086() {
		return this.anInt10750;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
	public void method9088(@OriginalArg(1) int arg0) {
		this.aBoolean739 = true;
		this.method9078(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIZILclient!ha;Lclient!ka;Lclient!oo;)V")
	public void method9089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class132 arg5, @OriginalArg(7) Class184 arg6, @OriginalArg(8) Class207 arg7) {
		@Pc(10) Class100[] local10 = arg6.method8657();
		@Pc(13) Class218[] local13 = arg6.method8643();
		if ((this.aClass2_Sub8_8 == null || this.aClass2_Sub8_8.aBoolean310) && (local10 != null || local13 != null)) {
			@Pc(32) Class308 local32 = Static411.aClass88_3.method2024(this.anInt10742);
			if (local32.anIntArray566 != null) {
				local32 = local32.method7297(Static659.aClass363_3);
			}
			if (local32 != null) {
				this.aClass2_Sub8_8 = Static290.method4176(Static90.anInt1698, true);
			}
		}
		if (this.aClass2_Sub8_8 == null) {
			return;
		}
		arg6.method8659(arg7);
		if (arg3) {
			this.aClass2_Sub8_8.method4169(arg5, (long) Static90.anInt1698, local10, local13);
		} else {
			this.aClass2_Sub8_8.method4174((long) Static90.anInt1698);
		}
		this.aClass2_Sub8_8.method4171(this.aByte150, arg2, arg1, arg0, arg4);
	}
}
