import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class246 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	private int anInt6584;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!rn;")
	private Class309 aClass309_1;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "Lclient!hs;")
	private Class165 aClass165_2;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub4 aClass5_Sub5_Sub4_4;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
	private int anInt6599;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	private int anInt6600;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!kq;")
	public Class8_Sub5 aClass8_Sub5_6;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "Lclient!ka;")
	private Class164 aClass164_5;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	private int anInt6604;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	private int anInt6581 = -1;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
	private int anInt6593 = 0;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	private int anInt6596 = -1;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	private int anInt6603 = -1;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
	private int anInt6605 = 0;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "Z")
	private boolean aBoolean508 = false;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!df;")
	private final Class8_Sub1 aClass8_Sub1_17;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	public int anInt6590;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "B")
	private final byte aByte106;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public final int anInt6597;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public final int anInt6595;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Z")
	private final boolean aBoolean507;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIILclient!df;ZI)V")
	public Class246(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aByte105 = (byte) arg4;
		this.aClass8_Sub1_17 = arg6;
		this.anInt6590 = arg2;
		this.aBoolean506 = arg7;
		this.aByte106 = (byte) arg5;
		this.anInt6597 = arg3;
		this.anInt6595 = arg1.anInt911;
		this.aBoolean507 = arg0.method7704() && arg1.aBoolean80 && !this.aBoolean506;
		if (arg8 != -1) {
			this.aBoolean508 = true;
		}
		this.method5637(arg8);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
	public int method5626(@OriginalArg(0) int arg0) {
		return this.anInt6605;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)I")
	public int method5627() {
		return this.anInt6593;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
	public void method5628(@OriginalArg(1) int arg0) {
		this.aBoolean508 = true;
		this.method5637(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_6 != null) {
			this.aClass8_Sub5_6.method4913();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!ha;)V")
	public void method5629(@OriginalArg(1) Class57 arg0) {
		if (this.aClass5_Sub5_Sub4_4 != null) {
			Static98.method1435(this.aClass5_Sub5_Sub4_4, this.aByte106, this.aClass8_Sub1_17.anInt10355, this.aClass8_Sub1_17.anInt10363, this.aBooleanArray12);
			this.aClass5_Sub5_Sub4_4 = null;
			this.aBooleanArray12 = null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(ILclient!ha;)V")
	public void method5630(@OriginalArg(1) Class57 arg0) {
		this.method5638(262144, arg0, -101, true, true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ka;IILclient!qq;ILclient!ha;IBZ)V")
	public void method5631(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class203 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class57 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) Class189[] local6 = arg0.method9081();
		@Pc(9) Class161[] local9 = arg0.method9070();
		if (arg7 > -113) {
			this.anInt6590 = 78;
		}
		if ((this.aClass8_Sub5_6 == null || this.aClass8_Sub5_6.aBoolean440) && (local6 != null || local9 != null)) {
			@Pc(40) Class55 local40 = Static536.aClass392_2.method9293(0, this.anInt6595);
			if (local40.anIntArray46 != null) {
				local40 = local40.method847(Static413.aClass118_1);
			}
			if (local40 != null) {
				this.aClass8_Sub5_6 = Static321.method4911(Static44.anInt740, true);
			}
		}
		if (this.aClass8_Sub5_6 == null) {
			return;
		}
		arg0.method9090(arg3);
		if (arg8) {
			this.aClass8_Sub5_6.method4903(arg5, (long) Static44.anInt740, local6, local9);
		} else {
			this.aClass8_Sub5_6.method4918((long) Static44.anInt740);
		}
		this.aClass8_Sub5_6.method4917(this.aByte105, arg6, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!rn;)V")
	public void method5634(@OriginalArg(1) Class309 arg0) {
		this.aClass309_1 = arg0;
		this.aClass164_5 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!df;B)V")
	private void method5635(@OriginalArg(0) Class8_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass165_2 == null) {
				if (this.aBoolean508) {
					return;
				}
				this.method5637(-1);
				if (this.aClass165_2 == null) {
					return;
				}
			}
			@Pc(39) int local39 = Static44.anInt740 - this.anInt6599;
			if (local39 > 100 && this.aClass165_2.anInt3907 > 0) {
				@Pc(58) int local58 = this.aClass165_2.anIntArray226.length - this.aClass165_2.anInt3907;
				while (this.anInt6584 < local58 && this.aClass165_2.anIntArray225[this.anInt6584] < local39) {
					local39 -= this.aClass165_2.anIntArray225[this.anInt6584];
					this.anInt6584++;
				}
				if (local58 <= this.anInt6584) {
					@Pc(103) int local103 = 0;
					for (@Pc(105) int local105 = local58; local105 < this.aClass165_2.anIntArray226.length; local105++) {
						local103 += this.aClass165_2.anIntArray225[local105];
					}
					local39 %= local103;
				}
				this.anInt6604 = this.anInt6584 + 1;
				if (this.aClass165_2.anIntArray226.length <= this.anInt6604) {
					this.anInt6604 -= this.aClass165_2.anInt3907;
					if (this.anInt6604 < 0 || this.aClass165_2.anIntArray226.length <= this.anInt6604) {
						this.anInt6604 = -1;
					}
				}
			}
			while (local39 > this.aClass165_2.anIntArray225[this.anInt6584]) {
				Static268.method4004(this.aClass165_2, arg0, this.anInt6584);
				local39 -= this.aClass165_2.anIntArray225[this.anInt6584];
				this.anInt6584++;
				if (this.aClass165_2.anIntArray226.length <= this.anInt6584) {
					this.anInt6584 -= this.aClass165_2.anInt3907;
					if (this.anInt6584 < 0 || this.anInt6584 >= this.aClass165_2.anIntArray226.length) {
						this.aClass165_2 = null;
						continue label80;
					}
				}
				this.anInt6604 = this.anInt6584 + 1;
				if (this.aClass165_2.anIntArray226.length <= this.anInt6604) {
					this.anInt6604 -= this.aClass165_2.anInt3907;
					if (this.anInt6604 < 0 || this.anInt6604 >= this.aClass165_2.anIntArray226.length) {
						this.anInt6604 = -1;
					}
				}
			}
			this.anInt6600 = local39;
			this.anInt6599 = Static44.anInt740 - local39;
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Z")
	public boolean method5636() {
		return this.aBoolean507;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	private void method5637(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class55 local19 = Static536.aClass392_2.method9293(0, this.anInt6595);
			@Pc(21) Class55 local21 = local19;
			if (local19.anIntArray46 != null) {
				local19 = local19.method847(Static413.aClass118_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.lb != null) {
				if (this.aClass165_2 != null && local19.method859(this.aClass165_2.anInt3916)) {
					return;
				}
				local7 = local19.method848();
				if (local19.anInt911 != this.anInt6596) {
					local9 = local19.aBoolean83;
				}
			} else if (local19.anInt934 == -1) {
				if (local21 != null && local21.lb != null) {
					if (this.aClass165_2 != null && local21.method859(this.aClass165_2.anInt3916)) {
						return;
					}
					local7 = local21.method848();
					if (this.anInt6596 != local21.anInt911) {
						local9 = local21.aBoolean83;
					}
				} else if (local21 != null && local21.anInt934 != -1 && this.anInt6596 != local21.anInt911) {
					local7 = local21.anInt934;
					local9 = local21.aBoolean83;
				}
			} else if (local19.anInt911 != this.anInt6596) {
				local7 = local19.anInt934;
				local9 = local19.aBoolean83;
			}
		}
		if (local7 == -1) {
			this.aClass165_2 = null;
			return;
		}
		this.aClass164_5 = null;
		if (this.aClass165_2 == null || this.aClass165_2.anInt3916 != local7) {
			this.aClass165_2 = Static158.aClass317_1.method7882(local7, 100);
		} else if (this.aClass165_2.anInt3919 == 0) {
			return;
		}
		if (this.aClass165_2.anIntArray226 == null) {
			this.aClass165_2 = null;
			return;
		}
		if (local9) {
			this.anInt6584 = (int) ((double) this.aClass165_2.anIntArray226.length * Math.random());
			this.anInt6600 = (int) (Math.random() * (double) this.aClass165_2.anIntArray225[this.anInt6584]) + 1;
		} else {
			this.anInt6600 = 1;
			this.anInt6584 = 0;
		}
		this.anInt6604 = this.anInt6584 + 1;
		if (this.anInt6604 < 0 || this.aClass165_2.anIntArray226.length <= this.anInt6604) {
			this.anInt6604 = -1;
		}
		this.anInt6599 = Static44.anInt740 - this.anInt6600;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!ha;IZZ)Lclient!ka;")
	public Class164 method5638(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class55 local11 = Static536.aClass392_2.method9293(0, this.anInt6595);
		if (local11.anIntArray46 != null) {
			local11 = local11.method847(Static413.aClass118_1);
		}
		if (local11 == null) {
			this.method5629(arg1);
			this.anInt6581 = -1;
			this.anInt6603 = -1;
			this.anInt6596 = -1;
			return null;
		}
		if (!this.aBoolean508 && this.anInt6596 != local11.anInt911) {
			this.aClass164_5 = null;
			this.method5637(-1);
		}
		this.method5635(this.aClass8_Sub1_17);
		if (arg3) {
			@Pc(87) boolean local87 = arg3 & this.aBoolean507 & Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674() != 0;
			arg3 = local87 & (local11.anInt911 != this.anInt6603 || this.aClass165_2 != null && Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674() >= 2 && (this.anInt6581 != this.anInt6584 || (this.aClass165_2.aBoolean304 || Static95.aBoolean147) && this.anInt6604 != this.anInt6584));
		}
		if (arg4 && !arg3) {
			this.anInt6596 = local11.anInt911;
			return null;
		}
		if (arg3) {
			Static98.method1435(this.aClass5_Sub5_Sub4_4, this.aByte106, this.aClass8_Sub1_17.anInt10355, this.aClass8_Sub1_17.anInt10363, this.aBooleanArray12);
			this.anInt6603 = -1;
			this.anInt6581 = -1;
		}
		@Pc(191) Class22 local191 = Static242.aClass22Array3[this.aByte106];
		@Pc(212) Class22 local212;
		if (this.aBoolean506) {
			local212 = Static220.aClass22Array2[0];
		} else {
			local212 = this.aByte106 < 3 ? Static242.aClass22Array3[this.aByte106 + 1] : null;
		}
		if (arg2 >= -88) {
			this.method5631((Class164) null, 70, 123, (Class203) null, -29, (Class57) null, -124, (byte) 88, false);
		}
		@Pc(236) Class164 local236 = null;
		if (this.aClass165_2 != null) {
			if (arg3) {
				arg0 |= 0x40000;
			}
			local236 = local11.method853(local191, local191.method8032(this.aClass8_Sub1_17.anInt10355, this.aClass8_Sub1_17.anInt10363), this.anInt6584, arg1, arg0, this.aClass8_Sub1_17.anInt10355, this.anInt6590 == 11 ? this.anInt6597 + 4 : this.anInt6597, this.anInt6590 == 11 ? 10 : this.anInt6590, this.aClass165_2, local212, this.aClass8_Sub1_17.anInt10363, this.anInt6600, this.aClass309_1, this.anInt6604);
			if (local236 == null) {
				this.anInt6593 = 0;
				this.aBooleanArray12 = null;
				this.anInt6605 = 0;
				this.aClass5_Sub5_Sub4_4 = null;
			} else {
				if (arg3) {
					if (this.aBooleanArray12 == null) {
						this.aBooleanArray12 = new boolean[4];
					}
					this.aClass5_Sub5_Sub4_4 = local236.ba(this.aClass5_Sub5_Sub4_4);
					Static332.method5049(this.aClass5_Sub5_Sub4_4, this.aByte106, this.aClass8_Sub1_17.anInt10355, this.aClass8_Sub1_17.anInt10363, this.aBooleanArray12);
					this.anInt6603 = local11.anInt911;
					this.anInt6581 = this.anInt6584;
				}
				this.anInt6605 = local236.fa();
				this.anInt6593 = local236.ma();
			}
			this.aClass164_5 = null;
		} else if (this.aClass164_5 != null && arg0 == (arg0 & this.aClass164_5.ua()) && local11.anInt911 == this.anInt6596) {
			local236 = this.aClass164_5;
		} else {
			if (this.aClass164_5 != null) {
				arg0 |= this.aClass164_5.ua();
			}
			@Pc(326) Class214 local326 = local11.method862(arg0, this.aClass8_Sub1_17.anInt10363, local191.method8032(this.aClass8_Sub1_17.anInt10355, this.aClass8_Sub1_17.anInt10363), this.aClass8_Sub1_17.anInt10355, 89, arg1, local212, this.anInt6590 == 11 ? this.anInt6597 + 4 : this.anInt6597, this.anInt6590 == 11 ? 10 : this.anInt6590, local191, arg3, this.aClass309_1);
			if (local326 == null) {
				this.anInt6593 = 0;
				this.anInt6605 = 0;
				this.aClass5_Sub5_Sub4_4 = null;
				this.aBooleanArray12 = null;
				this.aClass164_5 = null;
			} else {
				local236 = local326.aClass164_3;
				this.aClass164_5 = local326.aClass164_3;
				if (arg3) {
					this.aClass5_Sub5_Sub4_4 = local326.aClass5_Sub5_Sub4_2;
					this.aBooleanArray12 = null;
					Static332.method5049(this.aClass5_Sub5_Sub4_4, this.aByte106, this.aClass8_Sub1_17.anInt10355, this.aClass8_Sub1_17.anInt10363, (boolean[]) null);
					this.anInt6603 = local11.anInt911;
					this.anInt6581 = -1;
				}
				this.anInt6605 = local236.fa();
				this.anInt6593 = local236.ma();
			}
		}
		this.anInt6596 = local11.anInt911;
		return local236;
	}
}
