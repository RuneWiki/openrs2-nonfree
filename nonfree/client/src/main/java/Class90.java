import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class90 {

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Lclient!vq;")
	private Class372 aClass372_1;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Lclient!hj;")
	private Class138 aClass138_1;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "Lclient!sp;")
	public Class28_Sub7 aClass28_Sub7_2;

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
	private int anInt2762;

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
	private int anInt2764;

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "Lclient!r;")
	private Class3_Sub11_Sub3 aClass3_Sub11_Sub3_2;

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
	private int anInt2768;

	@OriginalMember(owner = "client!ek", name = "I", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
	private int anInt2773;

	@OriginalMember(owner = "client!ek", name = "N", descriptor = "Lclient!ka;")
	private Class95 aClass95_2;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	private int anInt2750 = 0;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	private int anInt2752 = -1;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	private int anInt2759 = 0;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	private int anInt2753 = -1;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
	private int anInt2772 = -1;

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "Lclient!wea;")
	private final Class28_Sub1 aClass28_Sub1_7;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
	public final int anInt2766;

	@OriginalMember(owner = "client!ek", name = "F", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
	public final int anInt2761;

	@OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
	public final int anInt2771;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
	private final boolean aBoolean214;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ha;Lclient!pu;IIIILclient!wea;ZI)V")
	public Class90(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class28_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aClass28_Sub1_7 = arg6;
		this.aBoolean215 = arg7;
		this.anInt2766 = arg2;
		this.aByte41 = (byte) arg4;
		this.aByte40 = (byte) arg5;
		this.anInt2761 = arg1.anInt7714;
		this.anInt2771 = arg3;
		this.aBoolean214 = arg0.method8470() && arg1.aBoolean590 && !this.aBoolean215;
		if (arg8 != -1) {
			this.aBoolean216 = true;
		}
		this.method2526(arg8);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLclient!ha;ZIZ)Lclient!ka;")
	public Class95 method2521(@OriginalArg(1) Class13 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class277 local11 = Static652.aClass267_4.method6682(this.anInt2761);
		if (local11.anIntArray660 != null) {
			local11 = local11.method6815(Static131.aClass66_1);
		}
		if (local11 == null) {
			this.method2530(arg0);
			this.anInt2753 = -1;
			this.anInt2752 = -1;
			this.anInt2772 = -1;
			return null;
		}
		if (!this.aBoolean216 && local11.anInt7714 != this.anInt2752) {
			this.aClass95_2 = null;
			this.method2526(-1);
		}
		this.method2525(this.aClass28_Sub1_7);
		if (arg1) {
			@Pc(79) boolean local79 = arg1 & this.aBoolean214 & Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374() != 0;
			arg1 = local79 & (local11.anInt7714 != this.anInt2772 || this.aClass372_1 != null && Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374() >= 2 && (this.anInt2753 != this.anInt2773 || (this.aClass372_1.aBoolean772 || Static100.aBoolean144) && this.anInt2762 != this.anInt2773));
		}
		if (arg3 && !arg1) {
			this.anInt2752 = local11.anInt7714;
			return null;
		}
		if (arg1) {
			Static351.method5213(this.aClass3_Sub11_Sub3_2, this.aByte40, this.aClass28_Sub1_7.anInt10729, this.aClass28_Sub1_7.anInt10731, this.aBooleanArray12);
			this.anInt2772 = -1;
			this.anInt2753 = -1;
		}
		@Pc(157) Class21 local157 = Static121.aClass21Array2[this.aByte40];
		@Pc(181) Class21 local181;
		if (this.aBoolean215) {
			local181 = Static582.aClass21Array3[0];
		} else {
			local181 = this.aByte40 >= 3 ? null : Static121.aClass21Array2[this.aByte40 + 1];
		}
		@Pc(189) Class95 local189 = null;
		if (this.aClass372_1 != null) {
			if (arg1) {
				arg2 |= 0x40000;
			}
			local189 = local11.method6814(this.anInt2766 == 11 ? 10 : this.anInt2766, this.aClass372_1, arg2, this.anInt2766 == 11 ? this.anInt2771 + 4 : this.anInt2771, local181, this.aClass28_Sub1_7.anInt10729, this.aClass138_1, this.anInt2762, this.anInt2773, local157, this.aClass28_Sub1_7.anInt10731, local157.method7980(this.aClass28_Sub1_7.anInt10731, this.aClass28_Sub1_7.anInt10729), this.anInt2768, arg0);
			if (local189 == null) {
				this.aClass3_Sub11_Sub3_2 = null;
				this.anInt2759 = 0;
				this.anInt2750 = 0;
				this.aBooleanArray12 = null;
			} else {
				if (arg1) {
					if (this.aBooleanArray12 == null) {
						this.aBooleanArray12 = new boolean[4];
					}
					this.aClass3_Sub11_Sub3_2 = local189.ba(this.aClass3_Sub11_Sub3_2);
					Static658.method9292(this.aClass3_Sub11_Sub3_2, this.aByte40, this.aClass28_Sub1_7.anInt10729, this.aClass28_Sub1_7.anInt10731, this.aBooleanArray12);
					this.anInt2772 = local11.anInt7714;
					this.anInt2753 = this.anInt2773;
				}
				this.anInt2759 = local189.fa();
				this.anInt2750 = local189.ma();
			}
			this.aClass95_2 = null;
		} else if (this.aClass95_2 != null && arg2 == (arg2 & this.aClass95_2.ua()) && local11.anInt7714 == this.anInt2752) {
			local189 = this.aClass95_2;
		} else {
			if (this.aClass95_2 != null) {
				arg2 |= this.aClass95_2.ua();
			}
			@Pc(390) Class136 local390 = local11.method6804(local157.method7980(this.aClass28_Sub1_7.anInt10731, this.aClass28_Sub1_7.anInt10729), local181, this.anInt2766 == 11 ? this.anInt2771 + 4 : this.anInt2771, local157, this.aClass138_1, this.anInt2766 == 11 ? 10 : this.anInt2766, arg2, arg1, this.aClass28_Sub1_7.anInt10729, this.aClass28_Sub1_7.anInt10731, arg0);
			if (local390 == null) {
				this.anInt2750 = 0;
				this.anInt2759 = 0;
				this.aClass3_Sub11_Sub3_2 = null;
				this.aClass95_2 = null;
				this.aBooleanArray12 = null;
			} else {
				local189 = local390.aClass95_4;
				this.aClass95_2 = local390.aClass95_4;
				if (arg1) {
					this.aClass3_Sub11_Sub3_2 = local390.aClass3_Sub11_Sub3_4;
					this.aBooleanArray12 = null;
					Static658.method9292(this.aClass3_Sub11_Sub3_2, this.aByte40, this.aClass28_Sub1_7.anInt10729, this.aClass28_Sub1_7.anInt10731, (boolean[]) null);
					this.anInt2772 = local11.anInt7714;
					this.anInt2753 = -1;
				}
				this.anInt2759 = local189.fa();
				this.anInt2750 = local189.ma();
			}
		}
		this.anInt2752 = local11.anInt7714;
		return local189;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I")
	public int method2523() {
		return this.anInt2759;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
	public int method2524(@OriginalArg(0) byte arg0) {
		if (arg0 < 109) {
			this.anInt2750 = -87;
		}
		return this.anInt2750;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!wea;I)V")
	private void method2525(@OriginalArg(0) Class28_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass372_1 == null) {
				if (this.aBoolean216) {
					return;
				}
				this.method2526(-1);
				if (this.aClass372_1 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static588.anInt9467 - this.anInt2764;
			if (local31 > 100 && this.aClass372_1.anInt10256 > 0) {
				@Pc(48) int local48 = this.aClass372_1.anIntArray901.length - this.aClass372_1.anInt10256;
				while (local48 > this.anInt2773 && local31 > this.aClass372_1.anIntArray900[this.anInt2773]) {
					local31 -= this.aClass372_1.anIntArray900[this.anInt2773];
					this.anInt2773++;
				}
				if (this.anInt2773 >= local48) {
					@Pc(87) int local87 = 0;
					for (@Pc(89) int local89 = local48; local89 < this.aClass372_1.anIntArray901.length; local89++) {
						local87 += this.aClass372_1.anIntArray900[local89];
					}
					local31 %= local87;
				}
				this.anInt2762 = this.anInt2773 + 1;
				if (this.anInt2762 >= this.aClass372_1.anIntArray901.length) {
					this.anInt2762 -= this.aClass372_1.anInt10256;
					if (this.anInt2762 < 0 || this.aClass372_1.anIntArray901.length <= this.anInt2762) {
						this.anInt2762 = -1;
					}
				}
			}
			while (this.aClass372_1.anIntArray900[this.anInt2773] < local31) {
				Static548.method7844(arg0, this.aClass372_1, this.anInt2773);
				local31 -= this.aClass372_1.anIntArray900[this.anInt2773];
				this.anInt2773++;
				if (this.anInt2773 >= this.aClass372_1.anIntArray901.length) {
					this.anInt2773 -= this.aClass372_1.anInt10256;
					if (this.anInt2773 < 0 || this.aClass372_1.anIntArray901.length <= this.anInt2773) {
						this.aClass372_1 = null;
						continue label80;
					}
				}
				this.anInt2762 = this.anInt2773 + 1;
				if (this.aClass372_1.anIntArray901.length <= this.anInt2762) {
					this.anInt2762 -= this.aClass372_1.anInt10256;
					if (this.anInt2762 < 0 || this.aClass372_1.anIntArray901.length <= this.anInt2762) {
						this.anInt2762 = -1;
					}
				}
			}
			this.anInt2768 = local31;
			this.anInt2764 = Static588.anInt9467 - local31;
			return;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	private void method2526(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class277 local18 = Static652.aClass267_4.method6682(this.anInt2761);
			@Pc(20) Class277 local20 = local18;
			if (local18.anIntArray660 != null) {
				local18 = local18.method6815(Static131.aClass66_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray659 != null) {
				if (this.aClass372_1 != null && local18.method6820(this.aClass372_1.anInt10252)) {
					return;
				}
				local7 = local18.method6816();
				if (this.anInt2752 != local18.anInt7714) {
					local9 = local18.aBoolean591;
				}
			} else if (local18.anInt7710 == -1) {
				if (local20 != null && local20.anIntArray659 != null) {
					if (this.aClass372_1 != null && local20.method6820(this.aClass372_1.anInt10252)) {
						return;
					}
					local7 = local20.method6816();
					if (this.anInt2752 != local20.anInt7714) {
						local9 = local20.aBoolean591;
					}
				} else if (local20 != null && local20.anInt7710 != -1 && this.anInt2752 != local20.anInt7714) {
					local7 = local20.anInt7710;
					local9 = local20.aBoolean591;
				}
			} else if (this.anInt2752 != local18.anInt7714) {
				local9 = local18.aBoolean591;
				local7 = local18.anInt7710;
			}
		}
		if (local7 == -1) {
			this.aClass372_1 = null;
			return;
		}
		this.aClass95_2 = null;
		if (this.aClass372_1 == null || local7 != this.aClass372_1.anInt10252) {
			this.aClass372_1 = Static243.aClass343_3.method8356(local7);
		} else if (this.aClass372_1.anInt10254 == 0) {
			return;
		}
		if (this.aClass372_1.anIntArray901 == null) {
			this.aClass372_1 = null;
			return;
		}
		if (local9) {
			this.anInt2773 = (int) ((double) this.aClass372_1.anIntArray901.length * Math.random());
			this.anInt2768 = (int) ((double) this.aClass372_1.anIntArray900[this.anInt2773] * Math.random()) + 1;
		} else {
			this.anInt2773 = 0;
			this.anInt2768 = 1;
		}
		this.anInt2762 = this.anInt2773 + 1;
		if (this.anInt2762 < 0 || this.anInt2762 >= this.aClass372_1.anIntArray901.length) {
			this.anInt2762 = -1;
		}
		this.anInt2764 = Static588.anInt9467 - this.anInt2768;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!hj;)V")
	public void method2527(@OriginalArg(1) Class138 arg0) {
		this.aClass95_2 = null;
		this.aClass138_1 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ha;ZIIIILclient!uu;Lclient!ka;B)V")
	public void method2528(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class239 arg6, @OriginalArg(7) Class95 arg7) {
		@Pc(10) Class49[] local10 = arg7.method5654();
		@Pc(13) Class197[] local13 = arg7.method5668();
		if ((this.aClass28_Sub7_2 == null || this.aClass28_Sub7_2.aBoolean709) && (local10 != null || local13 != null)) {
			@Pc(30) Class277 local30 = Static652.aClass267_4.method6682(this.anInt2761);
			if (local30.anIntArray660 != null) {
				local30 = local30.method6815(Static131.aClass66_1);
			}
			if (local30 != null) {
				this.aClass28_Sub7_2 = Static556.method7916(Static588.anInt9467, true);
			}
		}
		if (this.aClass28_Sub7_2 == null) {
			return;
		}
		arg7.method5669(arg6);
		if (arg1) {
			this.aClass28_Sub7_2.method7910(arg0, (long) Static588.anInt9467, local10, local13);
		} else {
			this.aClass28_Sub7_2.method7907((long) Static588.anInt9467);
		}
		this.aClass28_Sub7_2.method7914(this.aByte41, arg5, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!ha;)V")
	public void method2530(@OriginalArg(1) Class13 arg0) {
		if (this.aClass3_Sub11_Sub3_2 != null) {
			Static351.method5213(this.aClass3_Sub11_Sub3_2, this.aByte40, this.aClass28_Sub1_7.anInt10729, this.aClass28_Sub1_7.anInt10731, this.aBooleanArray12);
			this.aBooleanArray12 = null;
			this.aClass3_Sub11_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
	public void method2531(@OriginalArg(0) int arg0) {
		this.aBoolean216 = true;
		this.method2526(arg0);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z")
	public boolean method2532() {
		return this.aBoolean214;
	}

	@OriginalMember(owner = "client!ek", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub7_2 != null) {
			this.aClass28_Sub7_2.method7915();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!ha;)V")
	public void method2533(@OriginalArg(1) Class13 arg0) {
		this.method2521(arg0, true, 262144, true);
	}
}
