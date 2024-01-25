import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class361 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!rj;")
	private Class290 aClass290_3;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!aj;")
	public Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
	private int anInt10187;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "[Z")
	private boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "Lclient!r;")
	private Class3_Sub1_Sub6 aClass3_Sub1_Sub6_5;

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
	private int anInt10188;

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
	private int anInt10192;

	@OriginalMember(owner = "client!vt", name = "B", descriptor = "Lclient!ka;")
	private Class128 aClass128_5;

	@OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
	private int anInt10196;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
	private int anInt10179 = -1;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
	private int anInt10180 = -1;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
	private int anInt10183 = 0;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "Z")
	private boolean aBoolean857 = false;

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "Z")
	private boolean aBoolean859 = false;

	@OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
	private int anInt10199 = -1;

	@OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
	private int anInt10201 = 0;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "B")
	private final byte aByte125;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
	public final int anInt10185;

	@OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
	public final int anInt10200;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "B")
	private final byte aByte126;

	@OriginalMember(owner = "client!vt", name = "I", descriptor = "Lclient!mb;")
	private final Class2_Sub3 aClass2_Sub3_22;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
	public final int anInt10186;

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "Z")
	private final boolean aBoolean858;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIILclient!mb;ZI)V")
	public Class361(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub3 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aBoolean859 = arg7;
		this.aByte125 = (byte) arg5;
		this.anInt10185 = arg3;
		this.anInt10200 = arg2;
		this.aByte126 = (byte) arg4;
		this.aClass2_Sub3_22 = arg6;
		this.anInt10186 = arg1.anInt8290;
		this.aBoolean858 = arg0.method6172() && arg1.aBoolean710 && !this.aBoolean859;
		if (arg8 != -1) {
			this.aBoolean857 = true;
		}
		this.method8358(arg8);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IB)V")
	public void method8357(@OriginalArg(0) int arg0) {
		this.aBoolean857 = true;
		this.method8358(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	private void method8358(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(25) Class272 local25 = Static541.aClass349_4.method8123(this.anInt10186);
			@Pc(27) Class272 local27 = local25;
			if (local25.anIntArray523 != null) {
				local25 = local25.method6856(Static514.aClass166_1);
			}
			if (local25 == null) {
				return;
			}
			if (local27 == local25) {
				local27 = null;
			}
			if (local25.anIntArray525 != null) {
				if (this.aClass290_3 != null && local25.method6854(this.aClass290_3.anInt8686)) {
					return;
				}
				local13 = local25.method6864();
				if (this.anInt10199 != local25.anInt8290) {
					local15 = local25.aBoolean714;
				}
			} else if (local25.lb == -1) {
				if (local27 != null && local27.anIntArray525 != null) {
					if (this.aClass290_3 != null && local27.method6854(this.aClass290_3.anInt8686)) {
						return;
					}
					local13 = local27.method6864();
					if (local27.anInt8290 != this.anInt10199) {
						local15 = local27.aBoolean714;
					}
				} else if (local27 != null && local27.lb != -1 && local27.anInt8290 != this.anInt10199) {
					local15 = local27.aBoolean714;
					local13 = local27.lb;
				}
			} else if (local25.anInt8290 != this.anInt10199) {
				local13 = local25.lb;
				local15 = local25.aBoolean714;
			}
		}
		if (local13 == -1) {
			this.aClass290_3 = null;
			return;
		}
		this.aClass128_5 = null;
		if (this.aClass290_3 == null || this.aClass290_3.anInt8686 != local13) {
			this.aClass290_3 = Static618.aClass222_2.method5867(local13);
		} else if (this.aClass290_3.anInt8682 == 0) {
			return;
		}
		if (this.aClass290_3.anIntArray550 == null) {
			this.aClass290_3 = null;
			return;
		}
		if (local15) {
			this.anInt10196 = (int) (Math.random() * (double) this.aClass290_3.anIntArray550.length);
			this.anInt10187 = (int) (Math.random() * (double) this.aClass290_3.anIntArray548[this.anInt10196]) + 1;
		} else {
			this.anInt10187 = 1;
			this.anInt10196 = 0;
		}
		this.anInt10192 = this.anInt10196 + 1;
		if (this.anInt10192 < 0 || this.anInt10192 >= this.aClass290_3.anIntArray550.length) {
			this.anInt10192 = -1;
		}
		this.anInt10188 = Static251.anInt5580 - this.anInt10187;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!ha;IIIZLclient!ka;Lclient!wc;IZ)V")
	public void method8360(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class128 arg5, @OriginalArg(6) Class47 arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class18[] local6 = arg5.method6277();
		@Pc(13) Class215[] local13 = arg5.method6278();
		if ((this.aClass2_Sub2_8 == null || this.aClass2_Sub2_8.aBoolean15) && (local6 != null || local13 != null)) {
			@Pc(30) Class272 local30 = Static541.aClass349_4.method8123(this.anInt10186);
			if (local30.anIntArray523 != null) {
				local30 = local30.method6856(Static514.aClass166_1);
			}
			if (local30 != null) {
				this.aClass2_Sub2_8 = Static15.method226(Static251.anInt5580, true);
			}
		}
		if (this.aClass2_Sub2_8 == null) {
			return;
		}
		arg5.method6287(arg6);
		if (arg4) {
			this.aClass2_Sub2_8.method223(arg0, (long) Static251.anInt5580, local6, local13);
		} else {
			this.aClass2_Sub2_8.method228((long) Static251.anInt5580);
		}
		this.aClass2_Sub2_8.method233(this.aByte126, arg7, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)Z")
	public boolean method8361() {
		return this.aBoolean858;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)I")
	public int method8362(@OriginalArg(0) byte arg0) {
		if (arg0 != 103) {
			this.aBoolean859 = false;
		}
		return this.anInt10183;
	}

	@OriginalMember(owner = "client!vt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub2_8 != null) {
			this.aClass2_Sub2_8.method232();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!ha;)V")
	public void method8363(@OriginalArg(1) Class33 arg0) {
		this.method8364(true, arg0, 262144, true);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZLclient!ha;IZB)Lclient!ka;")
	public Class128 method8364(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(18) Class272 local18 = Static541.aClass349_4.method8123(this.anInt10186);
		if (local18.anIntArray523 != null) {
			local18 = local18.method6856(Static514.aClass166_1);
		}
		if (local18 == null) {
			this.method8366(arg1);
			this.anInt10199 = -1;
			this.anInt10180 = -1;
			this.anInt10179 = -1;
			return null;
		}
		if (!this.aBoolean857 && this.anInt10199 != local18.anInt8290) {
			this.aClass128_5 = null;
			this.method8358(-1);
		}
		this.method8367(this.aClass2_Sub3_22);
		if (arg0) {
			@Pc(79) boolean local79 = arg0 & this.aBoolean858 & Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537() != 0;
			arg0 = local79 & (local18.anInt8290 != this.anInt10179 || this.aClass290_3 != null && Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537() >= 2 && (this.anInt10196 != this.anInt10180 || (this.aClass290_3.aBoolean738 || Static433.aBoolean671) && this.anInt10196 != this.anInt10192));
		}
		if (arg3 && !arg0) {
			this.anInt10199 = local18.anInt8290;
			return null;
		}
		if (arg0) {
			Static579.method8024(this.aClass3_Sub1_Sub6_5, this.aByte125, this.aClass2_Sub3_22.anInt10428, this.aClass2_Sub3_22.anInt10424, this.aBooleanArray27);
			this.anInt10179 = -1;
			this.anInt10180 = -1;
		}
		@Pc(161) Class274 local161 = Static500.aClass274Array2[this.aByte125];
		@Pc(179) Class274 local179;
		if (this.aBoolean859) {
			local179 = Static445.aClass274Array1[0];
		} else {
			local179 = this.aByte125 < 3 ? Static500.aClass274Array2[this.aByte125 + 1] : null;
		}
		@Pc(187) Class128 local187 = null;
		if (this.aClass290_3 != null) {
			if (arg0) {
				arg2 |= 0x40000;
			}
			local187 = local18.method6863(this.anInt10192, this.anInt10200 == 11 ? this.anInt10185 + 4 : this.anInt10185, this.anInt10196, this.anInt10200 == 11 ? 10 : this.anInt10200, this.aClass2_Sub3_22.anInt10428, this.aClass2_Sub3_22.anInt10424, local161.method8043(this.aClass2_Sub3_22.anInt10424, this.aClass2_Sub3_22.anInt10428), this.aClass290_3, arg2, local179, local161, arg1, this.anInt10187);
			if (local187 == null) {
				this.anInt10183 = 0;
				this.aClass3_Sub1_Sub6_5 = null;
				this.aBooleanArray27 = null;
				this.anInt10201 = 0;
			} else {
				if (arg0) {
					if (this.aBooleanArray27 == null) {
						this.aBooleanArray27 = new boolean[4];
					}
					this.aClass3_Sub1_Sub6_5 = local187.ba(this.aClass3_Sub1_Sub6_5);
					Static287.method4989(this.aClass3_Sub1_Sub6_5, this.aByte125, this.aClass2_Sub3_22.anInt10428, this.aClass2_Sub3_22.anInt10424, this.aBooleanArray27);
					this.anInt10179 = local18.anInt8290;
					this.anInt10180 = this.anInt10196;
				}
				this.anInt10201 = local187.fa();
				this.anInt10183 = local187.ma();
			}
			this.aClass128_5 = null;
		} else if (this.aClass128_5 != null && arg2 == (this.aClass128_5.ua() & arg2) && local18.anInt8290 == this.anInt10199) {
			local187 = this.aClass128_5;
		} else {
			if (this.aClass128_5 != null) {
				arg2 |= this.aClass128_5.ua();
			}
			@Pc(388) Class300 local388 = local18.method6851(arg0, this.aClass2_Sub3_22.anInt10428, this.anInt10200 == 11 ? 10 : this.anInt10200, arg1, arg2, local179, local161.method8043(this.aClass2_Sub3_22.anInt10424, this.aClass2_Sub3_22.anInt10428), this.anInt10200 == 11 ? this.anInt10185 + 4 : this.anInt10185, local161, this.aClass2_Sub3_22.anInt10424);
			if (local388 == null) {
				this.aClass3_Sub1_Sub6_5 = null;
				this.aBooleanArray27 = null;
				this.anInt10183 = 0;
				this.aClass128_5 = null;
				this.anInt10201 = 0;
			} else {
				local187 = local388.aClass128_3;
				this.aClass128_5 = local388.aClass128_3;
				if (arg0) {
					this.aBooleanArray27 = null;
					this.aClass3_Sub1_Sub6_5 = local388.aClass3_Sub1_Sub6_3;
					Static287.method4989(this.aClass3_Sub1_Sub6_5, this.aByte125, this.aClass2_Sub3_22.anInt10428, this.aClass2_Sub3_22.anInt10424, null);
					this.anInt10180 = -1;
					this.anInt10179 = local18.anInt8290;
				}
				this.anInt10201 = local187.fa();
				this.anInt10183 = local187.ma();
			}
		}
		this.anInt10199 = local18.anInt8290;
		return local187;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)I")
	public int method8365() {
		return this.anInt10201;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(ILclient!ha;)V")
	public void method8366(@OriginalArg(1) Class33 arg0) {
		if (this.aClass3_Sub1_Sub6_5 != null) {
			Static579.method8024(this.aClass3_Sub1_Sub6_5, this.aByte125, this.aClass2_Sub3_22.anInt10428, this.aClass2_Sub3_22.anInt10424, this.aBooleanArray27);
			this.aClass3_Sub1_Sub6_5 = null;
			this.aBooleanArray27 = null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLclient!mb;)V")
	private void method8367(@OriginalArg(1) Class2_Sub3 arg0) {
		label80: while (true) {
			if (this.aClass290_3 == null) {
				if (this.aBoolean857) {
					return;
				}
				this.method8358(-1);
				if (this.aClass290_3 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static251.anInt5580 - this.anInt10188;
			if (local30 > 100 && this.aClass290_3.anInt8684 > 0) {
				@Pc(50) int local50 = this.aClass290_3.anIntArray550.length - this.aClass290_3.anInt8684;
				while (local50 > this.anInt10196 && this.aClass290_3.anIntArray548[this.anInt10196] < local30) {
					local30 -= this.aClass290_3.anIntArray548[this.anInt10196];
					this.anInt10196++;
				}
				if (local50 <= this.anInt10196) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass290_3.anIntArray550.length; local91++) {
						local89 += this.aClass290_3.anIntArray548[local91];
					}
					local30 %= local89;
				}
				this.anInt10192 = this.anInt10196 + 1;
				if (this.anInt10192 >= this.aClass290_3.anIntArray550.length) {
					this.anInt10192 -= this.aClass290_3.anInt8684;
					if (this.anInt10192 < 0 || this.aClass290_3.anIntArray550.length <= this.anInt10192) {
						this.anInt10192 = -1;
					}
				}
			}
			while (this.aClass290_3.anIntArray548[this.anInt10196] < local30) {
				Static349.method5726(this.anInt10196, this.aClass290_3, arg0);
				local30 -= this.aClass290_3.anIntArray548[this.anInt10196];
				this.anInt10196++;
				if (this.aClass290_3.anIntArray550.length <= this.anInt10196) {
					this.anInt10196 -= this.aClass290_3.anInt8684;
					if (this.anInt10196 < 0 || this.aClass290_3.anIntArray550.length <= this.anInt10196) {
						this.aClass290_3 = null;
						continue label80;
					}
				}
				this.anInt10192 = this.anInt10196 + 1;
				if (this.anInt10192 >= this.aClass290_3.anIntArray550.length) {
					this.anInt10192 -= this.aClass290_3.anInt8684;
					if (this.anInt10192 < 0 || this.aClass290_3.anIntArray550.length <= this.anInt10192) {
						this.anInt10192 = -1;
					}
				}
			}
			this.anInt10188 = Static251.anInt5580 - local30;
			this.anInt10187 = local30;
			return;
		}
	}
}
