import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class71 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	private int anInt2016;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_3;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "Lclient!kea;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Lclient!pia;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
	private int anInt2028;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	private int anInt2030;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
	private int anInt2031;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "[Z")
	private boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "Lclient!ka;")
	private Class75 aClass75_4;

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "Lclient!nha;")
	public Class9_Sub8 aClass9_Sub8_3;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	private int anInt2017 = -1;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	private int anInt2018 = 0;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	private int anInt2029 = -1;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	private int anInt2032 = -1;

	@OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
	private int anInt2037 = 0;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
	public final int anInt2024;

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "Lclient!uq;")
	private final Class9_Sub2 aClass9_Sub2_10;

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
	public final int anInt2033;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
	public final int anInt2039;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "B")
	private final byte aByte48;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "Z")
	private final boolean aBoolean160;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!ha;Lclient!ts;IIIILclient!uq;ZI)V")
	public Class71(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class9_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt2024 = arg1.anInt9240;
		this.aClass9_Sub2_10 = arg6;
		this.anInt2033 = arg2;
		this.aByte49 = (byte) arg4;
		this.anInt2039 = arg3;
		this.aBoolean158 = arg7;
		this.aByte48 = (byte) arg5;
		this.aBoolean160 = arg0.method6111() && arg1.aBoolean692 && !this.aBoolean158;
		if (arg8 != -1) {
			this.aBoolean159 = true;
		}
		this.method1696(arg8);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Z")
	public boolean method1691() {
		return this.aBoolean160;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method1692(@OriginalArg(0) Class82 arg0) {
		this.method1702(true, true, arg0, 262144);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)I")
	public int method1693(@OriginalArg(0) int arg0) {
		if (arg0 != 10) {
			this.method1693(-60);
		}
		return this.anInt2037;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ih;IILclient!ka;ILclient!ha;ZII)V")
	public void method1694(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class82 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		@Pc(13) Class228[] local13 = arg3.method6794();
		@Pc(16) Class232[] local16 = arg3.method6801();
		if ((this.aClass9_Sub8_3 == null || this.aClass9_Sub8_3.aBoolean493) && (local13 != null || local16 != null)) {
			@Pc(33) Class330 local33 = Static370.aClass284_3.method6915(this.anInt2024);
			if (local33.anIntArray581 != null) {
				local33 = local33.method7892(Static183.aClass285_1);
			}
			if (local33 != null) {
				this.aClass9_Sub8_3 = Static375.method5938(Static304.anInt8391, true);
			}
		}
		if (this.aClass9_Sub8_3 == null) {
			return;
		}
		arg3.method6797(arg0);
		if (arg6) {
			this.aClass9_Sub8_3.method5936(arg5, (long) Static304.anInt8391, local13, local16);
		} else {
			this.aClass9_Sub8_3.method5940((long) Static304.anInt8391);
		}
		this.aClass9_Sub8_3.method5946(this.aByte49, arg7, arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)V")
	private void method1696(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class330 local18 = Static370.aClass284_3.method6915(this.anInt2024);
			@Pc(20) Class330 local20 = local18;
			if (local18.anIntArray581 != null) {
				local18 = local18.method7892(Static183.aClass285_1);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray580 != null) {
				if (this.aClass267_1 != null && local18.method7886(this.aClass267_1.anInt7578)) {
					return;
				}
				local7 = local18.method7898();
				if (this.anInt2017 != local18.anInt9240) {
					local9 = local18.aBoolean687;
				}
			} else if (local18.anInt9222 == -1) {
				if (local20 != null && local20.anIntArray580 != null) {
					if (this.aClass267_1 != null && local20.method7886(this.aClass267_1.anInt7578)) {
						return;
					}
					local7 = local20.method7898();
					if (this.anInt2017 != local20.anInt9240) {
						local9 = local20.aBoolean687;
					}
				} else if (local20 != null && local20.anInt9222 != -1 && this.anInt2017 != local20.anInt9240) {
					local9 = local20.aBoolean687;
					local7 = local20.anInt9222;
				}
			} else if (local18.anInt9240 != this.anInt2017) {
				local7 = local18.anInt9222;
				local9 = local18.aBoolean687;
			}
		}
		if (local7 == -1) {
			this.aClass267_1 = null;
			return;
		}
		this.aClass75_4 = null;
		if (this.aClass267_1 == null || this.aClass267_1.anInt7578 != local7) {
			this.aClass267_1 = Static474.aClass264_2.method6574(local7);
		} else if (this.aClass267_1.anInt7585 == 0) {
			return;
		}
		if (this.aClass267_1.anIntArray458 == null) {
			this.aClass267_1 = null;
			return;
		}
		if (local9) {
			this.anInt2031 = (int) (Math.random() * (double) this.aClass267_1.anIntArray458.length);
			this.anInt2030 = (int) (Math.random() * (double) this.aClass267_1.anIntArray456[this.anInt2031]) + 1;
		} else {
			this.anInt2030 = 1;
			this.anInt2031 = 0;
		}
		this.anInt2016 = this.anInt2031 + 1;
		if (this.anInt2016 < 0 || this.aClass267_1.anIntArray458.length <= this.anInt2016) {
			this.anInt2016 = -1;
		}
		this.anInt2028 = Static304.anInt8391 - this.anInt2030;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)I")
	public int method1697() {
		return this.anInt2018;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V")
	public void method1698(@OriginalArg(0) int arg0) {
		this.aBoolean159 = true;
		this.method1696(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!ha;)V")
	public void method1699(@OriginalArg(1) Class82 arg0) {
		if (this.aClass3_Sub7_Sub17_3 != null) {
			Static334.method5410(this.aClass3_Sub7_Sub17_3, this.aByte48, this.aClass9_Sub2_10.anInt10152, this.aClass9_Sub2_10.anInt10158, this.aBooleanArray4);
			this.aClass3_Sub7_Sub17_3 = null;
			this.aBooleanArray4 = null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub8_3 != null) {
			this.aClass9_Sub8_3.method5945();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!uq;Z)V")
	private void method1701(@OriginalArg(0) Class9_Sub2 arg0) {
		label80: while (true) {
			if (this.aClass267_1 == null) {
				if (this.aBoolean159) {
					return;
				}
				this.method1696(-1);
				if (this.aClass267_1 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static304.anInt8391 - this.anInt2028;
			if (local30 > 100 && this.aClass267_1.anInt7575 > 0) {
				@Pc(49) int local49 = this.aClass267_1.anIntArray458.length - this.aClass267_1.anInt7575;
				while (this.anInt2031 < local49 && local30 > this.aClass267_1.anIntArray456[this.anInt2031]) {
					local30 -= this.aClass267_1.anIntArray456[this.anInt2031];
					this.anInt2031++;
				}
				if (this.anInt2031 >= local49) {
					@Pc(88) int local88 = 0;
					for (@Pc(90) int local90 = local49; local90 < this.aClass267_1.anIntArray458.length; local90++) {
						local88 += this.aClass267_1.anIntArray456[local90];
					}
					local30 %= local88;
				}
				this.anInt2016 = this.anInt2031 + 1;
				if (this.aClass267_1.anIntArray458.length <= this.anInt2016) {
					this.anInt2016 -= this.aClass267_1.anInt7575;
					if (this.anInt2016 < 0 || this.aClass267_1.anIntArray458.length <= this.anInt2016) {
						this.anInt2016 = -1;
					}
				}
			}
			while (this.aClass267_1.anIntArray456[this.anInt2031] < local30) {
				Static522.method7586(this.anInt2031, arg0, this.aClass267_1);
				local30 -= this.aClass267_1.anIntArray456[this.anInt2031];
				this.anInt2031++;
				if (this.aClass267_1.anIntArray458.length <= this.anInt2031) {
					this.anInt2031 -= this.aClass267_1.anInt7575;
					if (this.anInt2031 < 0 || this.aClass267_1.anIntArray458.length <= this.anInt2031) {
						this.aClass267_1 = null;
						continue label80;
					}
				}
				this.anInt2016 = this.anInt2031 + 1;
				if (this.aClass267_1.anIntArray458.length <= this.anInt2016) {
					this.anInt2016 -= this.aClass267_1.anInt7575;
					if (this.anInt2016 < 0 || this.anInt2016 >= this.aClass267_1.anIntArray458.length) {
						this.anInt2016 = -1;
					}
				}
			}
			this.anInt2030 = local30;
			this.anInt2028 = Static304.anInt8391 - local30;
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZZILclient!ha;I)Lclient!ka;")
	public Class75 method1702(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class330 local11 = Static370.aClass284_3.method6915(this.anInt2024);
		if (local11.anIntArray581 != null) {
			local11 = local11.method7892(Static183.aClass285_1);
		}
		if (local11 == null) {
			this.method1699(arg2);
			this.anInt2029 = -1;
			this.anInt2017 = -1;
			this.anInt2032 = -1;
			return null;
		}
		if (!this.aBoolean159 && local11.anInt9240 != this.anInt2017) {
			this.aClass75_4 = null;
			this.method1696(-1);
		}
		this.method1701(this.aClass9_Sub2_10);
		if (arg0) {
			@Pc(72) boolean local72 = arg0 & this.aBoolean160 & Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984() != 0;
			arg0 = local72 & (local11.anInt9240 != this.anInt2029 || this.aClass267_1 != null && Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984() >= 2 && (this.anInt2031 != this.anInt2032 || (this.aClass267_1.aBoolean542 || Static607.aBoolean749) && this.anInt2031 != this.anInt2016));
		}
		if (arg1 && !arg0) {
			this.anInt2017 = local11.anInt9240;
			return null;
		}
		if (arg0) {
			Static334.method5410(this.aClass3_Sub7_Sub17_3, this.aByte48, this.aClass9_Sub2_10.anInt10152, this.aClass9_Sub2_10.anInt10158, this.aBooleanArray4);
			this.anInt2032 = -1;
			this.anInt2029 = -1;
		}
		@Pc(152) Class91 local152 = Static637.aClass91Array4[this.aByte48];
		@Pc(159) Class91 local159;
		if (this.aBoolean158) {
			local159 = Static518.aClass91Array2[0];
		} else {
			local159 = this.aByte48 < 3 ? Static637.aClass91Array4[this.aByte48 + 1] : null;
		}
		@Pc(176) Class75 local176 = null;
		if (this.aClass267_1 != null) {
			if (arg0) {
				arg3 |= 0x40000;
			}
			local176 = local11.method7884(this.aClass9_Sub2_10.anInt10158, local152.method7725(this.aClass9_Sub2_10.anInt10152, this.aClass9_Sub2_10.anInt10158), local152, local159, this.aClass187_1, this.aClass267_1, this.anInt2033 == 11 ? this.anInt2039 + 4 : this.anInt2039, this.anInt2033 == 11 ? 10 : this.anInt2033, this.anInt2016, arg2, this.aClass9_Sub2_10.anInt10152, this.anInt2030, arg3, this.anInt2031);
			if (local176 == null) {
				this.aBooleanArray4 = null;
				this.aClass3_Sub7_Sub17_3 = null;
				this.anInt2018 = 0;
				this.anInt2037 = 0;
			} else {
				if (arg0) {
					if (this.aBooleanArray4 == null) {
						this.aBooleanArray4 = new boolean[4];
					}
					this.aClass3_Sub7_Sub17_3 = local176.ba(this.aClass3_Sub7_Sub17_3);
					Static334.method5411(this.aClass3_Sub7_Sub17_3, this.aByte48, this.aClass9_Sub2_10.anInt10152, this.aClass9_Sub2_10.anInt10158, this.aBooleanArray4);
					this.anInt2029 = local11.anInt9240;
					this.anInt2032 = this.anInt2031;
				}
				this.anInt2018 = local176.fa();
				this.anInt2037 = local176.ma();
			}
			this.aClass75_4 = null;
		} else if (this.aClass75_4 != null && arg3 == (arg3 & this.aClass75_4.ua()) && this.anInt2017 == local11.anInt9240) {
			local176 = this.aClass75_4;
		} else {
			if (this.aClass75_4 != null) {
				arg3 |= this.aClass75_4.ua();
			}
			@Pc(250) Class58 local250 = local11.method7890(this.anInt2033 == 11 ? this.anInt2039 + 4 : this.anInt2039, this.aClass187_1, arg3, arg2, this.anInt2033 == 11 ? 10 : this.anInt2033, this.aClass9_Sub2_10.anInt10158, arg0, local152.method7725(this.aClass9_Sub2_10.anInt10152, this.aClass9_Sub2_10.anInt10158), local159, local152, this.aClass9_Sub2_10.anInt10152);
			if (local250 == null) {
				this.anInt2018 = 0;
				this.aBooleanArray4 = null;
				this.anInt2037 = 0;
				this.aClass75_4 = null;
				this.aClass3_Sub7_Sub17_3 = null;
			} else {
				local176 = local250.aClass75_2;
				this.aClass75_4 = local250.aClass75_2;
				if (arg0) {
					this.aClass3_Sub7_Sub17_3 = local250.aClass3_Sub7_Sub17_1;
					this.aBooleanArray4 = null;
					Static334.method5411(this.aClass3_Sub7_Sub17_3, this.aByte48, this.aClass9_Sub2_10.anInt10152, this.aClass9_Sub2_10.anInt10158, (boolean[]) null);
					this.anInt2029 = local11.anInt9240;
					this.anInt2032 = -1;
				}
				this.anInt2018 = local176.fa();
				this.anInt2037 = local176.ma();
			}
		}
		this.anInt2017 = local11.anInt9240;
		return local176;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!kea;)V")
	public void method1703(@OriginalArg(1) Class187 arg0) {
		this.aClass187_1 = arg0;
		this.aClass75_4 = null;
	}
}
