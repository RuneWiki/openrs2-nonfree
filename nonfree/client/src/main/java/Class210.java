import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class210 {

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "[Z")
	private boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
	private int anInt6586;

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
	private int anInt6587;

	@OriginalMember(owner = "client!mda", name = "v", descriptor = "Lclient!w;")
	private Class3_Sub4_Sub2 aClass3_Sub4_Sub2_4;

	@OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
	private int anInt6596;

	@OriginalMember(owner = "client!mda", name = "C", descriptor = "Lclient!ru;")
	public Class55_Sub8 aClass55_Sub8_4;

	@OriginalMember(owner = "client!mda", name = "E", descriptor = "I")
	private int anInt6599;

	@OriginalMember(owner = "client!mda", name = "F", descriptor = "Lclient!ba;")
	private Class21 aClass21_5;

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "Lclient!jq;")
	private Class174 aClass174_2;

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
	private int anInt6580 = -1;

	@OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
	private int anInt6590 = -32768;

	@OriginalMember(owner = "client!mda", name = "y", descriptor = "Z")
	private boolean aBoolean570 = false;

	@OriginalMember(owner = "client!mda", name = "r", descriptor = "Z")
	private boolean aBoolean569 = false;

	@OriginalMember(owner = "client!mda", name = "B", descriptor = "I")
	private int anInt6597 = -1;

	@OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
	private int anInt6601 = -1;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
	public final int anInt6583;

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
	public final int anInt6581;

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
	private int anInt6584;

	@OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
	private int anInt6600;

	@OriginalMember(owner = "client!mda", name = "x", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!mda", name = "z", descriptor = "I")
	public final int anInt6595;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "Z")
	private final boolean aBoolean568;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIIIZI)V")
	public Class210(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aBoolean569 = arg8;
		this.anInt6583 = arg3;
		this.aByte67 = (byte) arg4;
		this.anInt6581 = arg1.anInt8757;
		this.anInt6584 = arg7;
		this.anInt6600 = arg6;
		this.aByte68 = (byte) arg5;
		this.anInt6595 = arg2;
		this.aBoolean568 = arg0.method5335() && arg1.aBoolean721 && !this.aBoolean569;
		if (arg9 != -1) {
			this.aBoolean570 = true;
		}
		this.method5523(arg9);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Z")
	public boolean method5517() {
		return this.aBoolean568;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!oa;ILclient!q;IIZLclient!ba;I)V")
	public void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class255 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class21 arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class121[] local10 = arg6.method7138();
		@Pc(13) Class280[] local13 = arg6.method7135();
		if ((this.aClass55_Sub8_4 == null || this.aClass55_Sub8_4.aBoolean712) && (local10 != null || local13 != null)) {
			@Pc(30) Class292 local30 = Static253.aClass146_2.method3356(this.anInt6581);
			if (local30.anIntArray571 != null) {
				local30 = local30.method7198(Static588.aClass322_1);
			}
			if (local30 != null) {
				this.aClass55_Sub8_4 = Static465.method7126(Static129.anInt10429, true);
			}
		}
		if (this.aClass55_Sub8_4 == null) {
			return;
		}
		arg6.method7143(arg3);
		if (arg5) {
			this.aClass55_Sub8_4.method7121(arg1, (long) Static129.anInt10429, local10, local13);
		} else {
			this.aClass55_Sub8_4.method7119((long) Static129.anInt10429);
		}
		this.aClass55_Sub8_4.method7124(this.aByte67, arg2, arg7, arg4, arg0);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZ)V")
	public void method5519(@OriginalArg(0) int arg0) {
		this.aBoolean570 = true;
		this.method5523(arg0);
	}

	@OriginalMember(owner = "client!mda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass55_Sub8_4 != null) {
			this.aClass55_Sub8_4.method7122();
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!oa;)V")
	public void method5522(@OriginalArg(1) Class15 arg0) {
		this.method5524(arg0, this.anInt6584, true, 262144, true, this.anInt6600);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)V")
	private void method5523(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(7) boolean local7 = false;
		if (arg0 == -1) {
			@Pc(17) Class292 local17 = Static253.aClass146_2.method3356(this.anInt6581);
			@Pc(19) Class292 local19 = local17;
			if (local17.anIntArray571 != null) {
				local17 = local17.method7198(Static588.aClass322_1);
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray573 != null) {
				if (this.aClass174_2 != null && local17.method7197(this.aClass174_2.anInt5481)) {
					return;
				}
				local5 = local17.method7200();
				if (this.anInt6597 != local17.anInt8757) {
					local7 = local17.aBoolean737;
				}
			} else if (local17.anInt8765 == -1) {
				if (local19 != null && local19.anIntArray573 != null) {
					if (this.aClass174_2 != null && local19.method7197(this.aClass174_2.anInt5481)) {
						return;
					}
					local5 = local19.method7200();
					if (this.anInt6597 != local19.anInt8757) {
						local7 = local19.aBoolean737;
					}
				} else if (local19 != null && local19.anInt8765 != -1 && this.anInt6597 != local19.anInt8757) {
					local5 = local19.anInt8765;
					local7 = local19.aBoolean737;
				}
			} else if (local17.anInt8757 != this.anInt6597) {
				local7 = local17.aBoolean737;
				local5 = local17.anInt8765;
			}
		}
		if (local5 == -1) {
			this.aClass174_2 = null;
			return;
		}
		this.aClass21_5 = null;
		if (this.aClass174_2 == null || local5 != this.aClass174_2.anInt5481) {
			this.aClass174_2 = Static532.aClass157_2.method3734(local5);
		} else if (this.aClass174_2.anInt5488 == 0) {
			return;
		}
		if (this.aClass174_2.anIntArray326 == null) {
			this.aClass174_2 = null;
			return;
		}
		if (local7) {
			this.anInt6586 = (int) (Math.random() * (double) this.aClass174_2.anIntArray326.length);
			this.anInt6596 = (int) ((double) this.aClass174_2.anIntArray325[this.anInt6586] * Math.random()) + 1;
		} else {
			this.anInt6596 = 1;
			this.anInt6586 = 0;
		}
		this.anInt6599 = this.anInt6586 + 1;
		if (this.anInt6599 < 0 || this.anInt6599 >= this.aClass174_2.anIntArray326.length) {
			this.anInt6599 = -1;
		}
		this.anInt6587 = Static129.anInt10429 - this.anInt6596;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!oa;IZIZII)Lclient!ba;")
	public Class21 method5524(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(9) Class292 local9 = Static253.aClass146_2.method3356(this.anInt6581);
		if (local9.anIntArray571 != null) {
			local9 = local9.method7198(Static588.aClass322_1);
		}
		if (local9 == null) {
			this.method5527(arg0);
			this.anInt6601 = -1;
			this.anInt6597 = -1;
			this.anInt6580 = -1;
			return null;
		}
		if (!this.aBoolean570 && this.anInt6597 != local9.anInt8757) {
			this.aClass21_5 = null;
			this.method5523(-1);
		}
		this.method5525(arg1, arg5);
		if (arg2) {
			@Pc(82) boolean local82 = arg2 & this.aBoolean568 & Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823) != 0;
			arg2 = local82 & (this.anInt6580 != local9.anInt8757 || this.aClass174_2 != null && Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823) >= 2 && (this.anInt6601 != this.anInt6586 || (this.aClass174_2.aBoolean470 || Static4.aBoolean20) && this.anInt6586 != this.anInt6599));
		}
		if (arg4 && !arg2) {
			this.anInt6597 = local9.anInt8757;
			return null;
		}
		if (arg2) {
			Static214.method3738(this.aClass3_Sub4_Sub2_4, this.aByte68, this.anInt6600, this.anInt6584, this.aBooleanArray28);
			this.anInt6580 = -1;
			this.anInt6601 = -1;
		}
		@Pc(162) Class4 local162 = Static224.aClass4Array3[this.aByte68];
		@Pc(178) Class4 local178;
		if (this.aBoolean569) {
			local178 = Static381.aClass4Array2[0];
		} else {
			local178 = this.aByte68 >= 3 ? null : Static224.aClass4Array3[this.aByte68 + 1];
		}
		@Pc(185) Class21 local185 = null;
		if (this.aClass174_2 != null) {
			if (arg2) {
				arg3 |= 0x40000;
			}
			local185 = local9.method7201(local178, arg3, this.anInt6584, local162.sa(this.anInt6600, this.anInt6584), this.anInt6596, this.anInt6595 == 11 ? this.anInt6583 + 4 : this.anInt6583, this.aClass174_2, this.anInt6586, this.anInt6599, local162, arg0, this.anInt6600, this.anInt6595 == 11 ? 10 : this.anInt6595);
			if (local185 == null) {
				this.aBooleanArray28 = null;
				this.anInt6590 = 0;
				this.aClass3_Sub4_Sub2_4 = null;
			} else {
				if (arg2) {
					if (this.aBooleanArray28 == null) {
						this.aBooleanArray28 = new boolean[4];
					}
					this.aClass3_Sub4_Sub2_4 = local185.Z(this.aClass3_Sub4_Sub2_4);
					Static361.method5982(this.aClass3_Sub4_Sub2_4, this.aByte68, arg5, arg1, this.aBooleanArray28);
					this.anInt6601 = this.anInt6586;
					this.anInt6580 = local9.anInt8757;
				}
				this.anInt6590 = local185.DA();
			}
			this.aClass21_5 = null;
		} else if (this.aClass21_5 != null && arg3 == (this.aClass21_5.h() & arg3) && this.anInt6597 == local9.anInt8757) {
			local185 = this.aClass21_5;
		} else {
			if (this.aClass21_5 != null) {
				arg3 |= this.aClass21_5.h();
			}
			@Pc(364) Class155 local364 = local9.method7194(arg2, local162, this.anInt6584, local162.sa(this.anInt6600, this.anInt6584), this.anInt6595 == 11 ? 10 : this.anInt6595, this.anInt6595 == 11 ? this.anInt6583 + 4 : this.anInt6583, arg0, arg3, local178, this.anInt6600);
			if (local364 == null) {
				this.aBooleanArray28 = null;
				this.anInt6590 = 0;
				this.aClass21_5 = null;
				this.aClass3_Sub4_Sub2_4 = null;
			} else {
				local185 = local364.aClass21_3;
				this.aClass21_5 = local364.aClass21_3;
				if (arg2) {
					this.aBooleanArray28 = null;
					this.aClass3_Sub4_Sub2_4 = local364.aClass3_Sub4_Sub2_2;
					Static361.method5982(this.aClass3_Sub4_Sub2_4, this.aByte68, arg5, arg1, null);
					this.anInt6601 = -1;
					this.anInt6580 = local9.anInt8757;
				}
				this.anInt6590 = local185.DA();
			}
		}
		this.anInt6600 = arg5;
		this.anInt6584 = arg1;
		this.anInt6597 = local9.anInt8757;
		return local185;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)V")
	private void method5525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass174_2 == null) {
				if (this.aBoolean570) {
					return;
				}
				this.method5523(-1);
				if (this.aClass174_2 == null) {
					return;
				}
			}
			@Pc(29) int local29 = Static129.anInt10429 - this.anInt6587;
			if (local29 > 100 && this.aClass174_2.anInt5485 > 0) {
				@Pc(49) int local49 = this.aClass174_2.anIntArray326.length - this.aClass174_2.anInt5485;
				while (this.anInt6586 < local49 && this.aClass174_2.anIntArray325[this.anInt6586] < local29) {
					local29 -= this.aClass174_2.anIntArray325[this.anInt6586];
					this.anInt6586++;
				}
				if (this.anInt6586 >= local49) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local49; local93 < this.aClass174_2.anIntArray326.length; local93++) {
						local91 += this.aClass174_2.anIntArray325[local93];
					}
					local29 %= local91;
				}
				this.anInt6599 = this.anInt6586 + 1;
				if (this.aClass174_2.anIntArray326.length <= this.anInt6599) {
					this.anInt6599 -= this.aClass174_2.anInt5485;
					if (this.anInt6599 < 0 || this.aClass174_2.anIntArray326.length <= this.anInt6599) {
						this.anInt6599 = -1;
					}
				}
			}
			while (this.aClass174_2.anIntArray325[this.anInt6586] < local29) {
				Static28.method957(this.aClass174_2, this.aByte67, arg0, arg1, false, this.anInt6586);
				local29 -= this.aClass174_2.anIntArray325[this.anInt6586];
				this.anInt6586++;
				if (this.anInt6586 >= this.aClass174_2.anIntArray326.length) {
					this.anInt6586 -= this.aClass174_2.anInt5485;
					if (this.anInt6586 < 0 || this.aClass174_2.anIntArray326.length <= this.anInt6586) {
						this.aClass174_2 = null;
						continue label80;
					}
				}
				this.anInt6599 = this.anInt6586 + 1;
				if (this.aClass174_2.anIntArray326.length <= this.anInt6599) {
					this.anInt6599 -= this.aClass174_2.anInt5485;
					if (this.anInt6599 < 0 || this.aClass174_2.anIntArray326.length <= this.anInt6599) {
						this.anInt6599 = -1;
					}
				}
			}
			this.anInt6587 = Static129.anInt10429 - local29;
			this.anInt6596 = local29;
			return;
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)I")
	public int method5526() {
		return this.anInt6590;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZLclient!oa;)V")
	public void method5527(@OriginalArg(1) Class15 arg0) {
		if (this.aClass3_Sub4_Sub2_4 != null) {
			Static214.method3738(this.aClass3_Sub4_Sub2_4, this.aByte68, this.anInt6600, this.anInt6584, this.aBooleanArray28);
			this.aBooleanArray28 = null;
			this.aClass3_Sub4_Sub2_4 = null;
		}
	}
}
