import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class143 {

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
	private int anInt5100;

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "Lclient!ka;")
	private Class83 aClass83_5;

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
	private int anInt5104;

	@OriginalMember(owner = "client!iea", name = "n", descriptor = "[Z")
	private boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!iea", name = "z", descriptor = "Lclient!pd;")
	public Class15_Sub8 aClass15_Sub8_5;

	@OriginalMember(owner = "client!iea", name = "C", descriptor = "Lclient!r;")
	private Class8_Sub5_Sub11 aClass8_Sub5_Sub11_3;

	@OriginalMember(owner = "client!iea", name = "L", descriptor = "I")
	private int anInt5122;

	@OriginalMember(owner = "client!iea", name = "M", descriptor = "I")
	private int anInt5123;

	@OriginalMember(owner = "client!iea", name = "N", descriptor = "Lclient!fba;")
	private Class97 aClass97_2;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	private int anInt5102 = -1;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
	private int anInt5108 = -1;

	@OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
	private int anInt5106 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	private int anInt5097 = -1;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "Z")
	private boolean aBoolean379 = false;

	@OriginalMember(owner = "client!iea", name = "D", descriptor = "Z")
	private boolean aBoolean380 = false;

	@OriginalMember(owner = "client!iea", name = "F", descriptor = "I")
	private int anInt5117 = 0;

	@OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
	public final int anInt5110;

	@OriginalMember(owner = "client!iea", name = "x", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
	public final int anInt5101;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
	public final int anInt5113;

	@OriginalMember(owner = "client!iea", name = "B", descriptor = "Lclient!rr;")
	private final Class15_Sub1 aClass15_Sub1_12;

	@OriginalMember(owner = "client!iea", name = "J", descriptor = "Z")
	private final boolean aBoolean381;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!ha;Lclient!vc;IIIILclient!rr;ZI)V")
	public Class143(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class15_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt5110 = arg1.anInt10077;
		this.aByte54 = (byte) arg4;
		this.aBoolean380 = arg7;
		this.anInt5101 = arg3;
		this.aByte53 = (byte) arg5;
		this.anInt5113 = arg2;
		this.aClass15_Sub1_12 = arg6;
		this.aBoolean381 = arg0.method6091() && arg1.aBoolean725 && !this.aBoolean380;
		if (arg8 != -1) {
			this.aBoolean379 = true;
		}
		this.method4188(arg8);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)I")
	public int method4176() {
		return this.anInt5106;
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(Z)I")
	public int method4178(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.anInt5117 : -126;
	}

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "(Z)Z")
	public boolean method4180() {
		return this.aBoolean381;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)V")
	public void method4181(@OriginalArg(0) int arg0) {
		this.aBoolean379 = true;
		this.method4188(arg0);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLclient!ha;ZII)Lclient!ka;")
	public Class83 method4182(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class352 local11 = Static437.aClass199_3.method5342(this.anInt5110);
		if (local11.anIntArray591 != null) {
			local11 = local11.method8164(Static420.aClass77_1);
		}
		if (local11 == null) {
			this.method4186(arg1);
			this.anInt5108 = -1;
			this.anInt5097 = -1;
			this.anInt5102 = -1;
			return null;
		}
		if (!this.aBoolean379 && local11.anInt10077 != this.anInt5097) {
			this.aClass83_5 = null;
			this.method4188(-1);
		}
		this.method4183(this.aClass15_Sub1_12);
		if (arg0) {
			@Pc(72) boolean local72 = arg0 & this.aBoolean381 & Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894() != 0;
			arg0 = local72 & (this.anInt5108 != local11.anInt10077 || this.aClass97_2 != null && Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894() >= 2 && (this.anInt5104 != this.anInt5102 || (this.aClass97_2.aBoolean266 || Static460.aBoolean600) && this.anInt5122 != this.anInt5104));
		}
		if (arg2 && !arg0) {
			this.anInt5097 = local11.anInt10077;
			return null;
		}
		if (arg0) {
			Static213.method4054(this.aClass8_Sub5_Sub11_3, this.aByte53, this.aClass15_Sub1_12.anInt10301, this.aClass15_Sub1_12.anInt10298, this.aBooleanArray13);
			this.anInt5108 = -1;
			this.anInt5102 = -1;
		}
		@Pc(146) Class86 local146 = Static34.aClass86Array5[this.aByte53];
		@Pc(153) Class86 local153;
		if (this.aBoolean380) {
			local153 = Static86.aClass86Array2[0];
		} else {
			local153 = this.aByte53 < 3 ? Static34.aClass86Array5[this.aByte53 + 1] : null;
		}
		@Pc(172) Class83 local172 = null;
		if (this.aClass97_2 != null) {
			if (arg0) {
				arg3 |= 0x40000;
			}
			local172 = local11.method8176(this.aClass97_2, this.anInt5122, arg1, this.aClass15_Sub1_12.anInt10298, this.anInt5113 == 11 ? 10 : this.anInt5113, this.anInt5113 == 11 ? this.anInt5101 + 4 : this.anInt5101, this.anInt5104, local153, this.aClass15_Sub1_12.anInt10301, this.anInt5100, local146.method8088(this.aClass15_Sub1_12.anInt10298, this.aClass15_Sub1_12.anInt10301), arg3, local146);
			if (local172 == null) {
				this.aClass8_Sub5_Sub11_3 = null;
				this.anInt5117 = 0;
				this.aBooleanArray13 = null;
				this.anInt5106 = 0;
			} else {
				if (arg0) {
					if (this.aBooleanArray13 == null) {
						this.aBooleanArray13 = new boolean[4];
					}
					this.aClass8_Sub5_Sub11_3 = local172.ba(this.aClass8_Sub5_Sub11_3);
					Static560.method7830(this.aClass8_Sub5_Sub11_3, this.aByte53, this.aClass15_Sub1_12.anInt10301, this.aClass15_Sub1_12.anInt10298, this.aBooleanArray13);
					this.anInt5102 = this.anInt5104;
					this.anInt5108 = local11.anInt10077;
				}
				this.anInt5106 = local172.fa();
				this.anInt5117 = local172.ma();
			}
			this.aClass83_5 = null;
		} else if (this.aClass83_5 != null && arg3 == (this.aClass83_5.ua() & arg3) && local11.anInt10077 == this.anInt5097) {
			local172 = this.aClass83_5;
		} else {
			if (this.aClass83_5 != null) {
				arg3 |= this.aClass83_5.ua();
			}
			@Pc(374) Class45 local374 = local11.method8172(this.anInt5113 == 11 ? this.anInt5101 + 4 : this.anInt5101, arg3, local153, arg0, this.aClass15_Sub1_12.anInt10298, arg1, local146.method8088(this.aClass15_Sub1_12.anInt10298, this.aClass15_Sub1_12.anInt10301), this.anInt5113 == 11 ? 10 : this.anInt5113, local146, this.aClass15_Sub1_12.anInt10301);
			if (local374 == null) {
				this.aBooleanArray13 = null;
				this.aClass8_Sub5_Sub11_3 = null;
				this.anInt5106 = 0;
				this.aClass83_5 = null;
				this.anInt5117 = 0;
			} else {
				local172 = local374.aClass83_1;
				this.aClass83_5 = local374.aClass83_1;
				if (arg0) {
					this.aBooleanArray13 = null;
					this.aClass8_Sub5_Sub11_3 = local374.aClass8_Sub5_Sub11_1;
					Static560.method7830(this.aClass8_Sub5_Sub11_3, this.aByte53, this.aClass15_Sub1_12.anInt10301, this.aClass15_Sub1_12.anInt10298, null);
					this.anInt5108 = local11.anInt10077;
					this.anInt5102 = -1;
				}
				this.anInt5106 = local172.fa();
				this.anInt5117 = local172.ma();
			}
		}
		this.anInt5097 = local11.anInt10077;
		return local172;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!rr;B)V")
	private void method4183(@OriginalArg(0) Class15_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass97_2 == null) {
				if (this.aBoolean379) {
					return;
				}
				this.method4188(-1);
				if (this.aClass97_2 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static435.anInt8192 - this.anInt5123;
			if (local30 > 100 && this.aClass97_2.anInt3609 > 0) {
				@Pc(51) int local51 = this.aClass97_2.anIntArray182.length - this.aClass97_2.anInt3609;
				while (this.anInt5104 < local51 && this.aClass97_2.anIntArray180[this.anInt5104] < local30) {
					local30 -= this.aClass97_2.anIntArray180[this.anInt5104];
					this.anInt5104++;
				}
				if (this.anInt5104 >= local51) {
					@Pc(90) int local90 = 0;
					for (@Pc(92) int local92 = local51; local92 < this.aClass97_2.anIntArray182.length; local92++) {
						local90 += this.aClass97_2.anIntArray180[local92];
					}
					local30 %= local90;
				}
				this.anInt5122 = this.anInt5104 + 1;
				if (this.anInt5122 >= this.aClass97_2.anIntArray182.length) {
					this.anInt5122 -= this.aClass97_2.anInt3609;
					if (this.anInt5122 < 0 || this.anInt5122 >= this.aClass97_2.anIntArray182.length) {
						this.anInt5122 = -1;
					}
				}
			}
			while (this.aClass97_2.anIntArray180[this.anInt5104] < local30) {
				Static522.method7447(arg0, this.aClass97_2, this.anInt5104);
				local30 -= this.aClass97_2.anIntArray180[this.anInt5104];
				this.anInt5104++;
				if (this.anInt5104 >= this.aClass97_2.anIntArray182.length) {
					this.anInt5104 -= this.aClass97_2.anInt3609;
					if (this.anInt5104 < 0 || this.anInt5104 >= this.aClass97_2.anIntArray182.length) {
						this.aClass97_2 = null;
						continue label80;
					}
				}
				this.anInt5122 = this.anInt5104 + 1;
				if (this.aClass97_2.anIntArray182.length <= this.anInt5122) {
					this.anInt5122 -= this.aClass97_2.anInt3609;
					if (this.anInt5122 < 0 || this.anInt5122 >= this.aClass97_2.anIntArray182.length) {
						this.anInt5122 = -1;
					}
				}
			}
			this.anInt5100 = local30;
			this.anInt5123 = Static435.anInt8192 - local30;
			return;
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILclient!ka;ILclient!dfa;ILclient!ha;BZ)V")
	public void method4184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class54 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(8) boolean arg7) {
		@Pc(6) Class219[] local6 = arg2.method8010();
		@Pc(13) Class238[] local13 = arg2.method8005();
		if ((this.aClass15_Sub8_5 == null || this.aClass15_Sub8_5.aBoolean568) && (local6 != null || local13 != null)) {
			@Pc(30) Class352 local30 = Static437.aClass199_3.method5342(this.anInt5110);
			if (local30.anIntArray591 != null) {
				local30 = local30.method8164(Static420.aClass77_1);
			}
			if (local30 != null) {
				this.aClass15_Sub8_5 = Static417.method6545(Static435.anInt8192, true);
			}
		}
		if (this.aClass15_Sub8_5 == null) {
			return;
		}
		arg2.method7999(arg4);
		if (arg7) {
			this.aClass15_Sub8_5.method6535(arg6, (long) Static435.anInt8192, local6, local13);
		} else {
			this.aClass15_Sub8_5.method6538((long) Static435.anInt8192);
		}
		this.aClass15_Sub8_5.method6544(this.aByte54, arg5, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method4186(@OriginalArg(0) Class16 arg0) {
		if (this.aClass8_Sub5_Sub11_3 != null) {
			Static213.method4054(this.aClass8_Sub5_Sub11_3, this.aByte53, this.aClass15_Sub1_12.anInt10301, this.aClass15_Sub1_12.anInt10298, this.aBooleanArray13);
			this.aClass8_Sub5_Sub11_3 = null;
			this.aBooleanArray13 = null;
		}
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(Lclient!ha;I)V")
	public void method4187(@OriginalArg(0) Class16 arg0) {
		this.method4182(true, arg0, true, 262144);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BI)V")
	private void method4188(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0;
		@Pc(13) boolean local13 = false;
		if (arg0 == -1) {
			@Pc(23) Class352 local23 = Static437.aClass199_3.method5342(this.anInt5110);
			@Pc(25) Class352 local25 = local23;
			if (local23.anIntArray591 != null) {
				local23 = local23.method8164(Static420.aClass77_1);
			}
			if (local23 == null) {
				return;
			}
			if (local23 == local25) {
				local25 = null;
			}
			if (local23.anIntArray588 != null) {
				if (this.aClass97_2 != null && local23.method8168(this.aClass97_2.anInt3601)) {
					return;
				}
				local11 = local23.method8175();
				if (local23.anInt10077 != this.anInt5097) {
					local13 = local23.aBoolean719;
				}
			} else if (local23.anInt10078 == -1) {
				if (local25 != null && local25.anIntArray588 != null) {
					if (this.aClass97_2 != null && local25.method8168(this.aClass97_2.anInt3601)) {
						return;
					}
					local11 = local25.method8175();
					if (local25.anInt10077 != this.anInt5097) {
						local13 = local25.aBoolean719;
					}
				} else if (local25 != null && local25.anInt10078 != -1 && local25.anInt10077 != this.anInt5097) {
					local11 = local25.anInt10078;
					local13 = local25.aBoolean719;
				}
			} else if (local23.anInt10077 != this.anInt5097) {
				local11 = local23.anInt10078;
				local13 = local23.aBoolean719;
			}
		}
		if (local11 == -1) {
			this.aClass97_2 = null;
			return;
		}
		this.aClass83_5 = null;
		if (this.aClass97_2 == null || local11 != this.aClass97_2.anInt3601) {
			this.aClass97_2 = Static28.aClass220_1.method5670(local11);
		} else if (this.aClass97_2.anInt3603 == 0) {
			return;
		}
		if (this.aClass97_2.anIntArray182 == null) {
			this.aClass97_2 = null;
			return;
		}
		if (local13) {
			this.anInt5104 = (int) (Math.random() * (double) this.aClass97_2.anIntArray182.length);
			this.anInt5100 = (int) ((double) this.aClass97_2.anIntArray180[this.anInt5104] * Math.random()) + 1;
		} else {
			this.anInt5104 = 0;
			this.anInt5100 = 1;
		}
		this.anInt5122 = this.anInt5104 + 1;
		if (this.anInt5122 < 0 || this.anInt5122 >= this.aClass97_2.anIntArray182.length) {
			this.anInt5122 = -1;
		}
		this.anInt5123 = Static435.anInt8192 - this.anInt5100;
	}

	@OriginalMember(owner = "client!iea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub8_5 != null) {
			this.aClass15_Sub8_5.method6531();
		}
	}
}
