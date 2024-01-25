import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class178 {

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
	private int anInt4897;

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
	private int anInt4899;

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
	private int anInt4904;

	@OriginalMember(owner = "client!jfa", name = "o", descriptor = "Lclient!mk;")
	private Class228 aClass228_3;

	@OriginalMember(owner = "client!jfa", name = "p", descriptor = "[Z")
	private boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!jfa", name = "x", descriptor = "I")
	private int anInt4913;

	@OriginalMember(owner = "client!jfa", name = "y", descriptor = "Lclient!od;")
	public Class16_Sub7 aClass16_Sub7_6;

	@OriginalMember(owner = "client!jfa", name = "H", descriptor = "Lclient!r;")
	private Class2_Sub7_Sub17 aClass2_Sub7_Sub17_3;

	@OriginalMember(owner = "client!jfa", name = "J", descriptor = "Lclient!ka;")
	private Class193 aClass193_4;

	@OriginalMember(owner = "client!jfa", name = "K", descriptor = "Lclient!td;")
	private Class326 aClass326_2;

	@OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
	private int anInt4910 = 0;

	@OriginalMember(owner = "client!jfa", name = "z", descriptor = "I")
	private int anInt4914 = -1;

	@OriginalMember(owner = "client!jfa", name = "k", descriptor = "Z")
	private boolean aBoolean364 = false;

	@OriginalMember(owner = "client!jfa", name = "l", descriptor = "Z")
	private boolean aBoolean365 = false;

	@OriginalMember(owner = "client!jfa", name = "C", descriptor = "I")
	private int anInt4915 = -1;

	@OriginalMember(owner = "client!jfa", name = "G", descriptor = "I")
	private int anInt4917 = 0;

	@OriginalMember(owner = "client!jfa", name = "M", descriptor = "I")
	private int anInt4920 = -1;

	@OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
	public final int anInt4905;

	@OriginalMember(owner = "client!jfa", name = "E", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
	public final int anInt4901;

	@OriginalMember(owner = "client!jfa", name = "t", descriptor = "Lclient!rba;")
	private final Class16_Sub1 aClass16_Sub1_14;

	@OriginalMember(owner = "client!jfa", name = "q", descriptor = "I")
	public final int anInt4908;

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!ha;Lclient!ac;IIIILclient!rba;ZI)V")
	public Class178(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class16_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt4905 = arg1.anInt106;
		this.aByte73 = (byte) arg4;
		this.anInt4901 = arg3;
		this.aClass16_Sub1_14 = arg6;
		this.anInt4908 = arg2;
		this.aByte72 = (byte) arg5;
		this.aBoolean365 = arg7;
		this.aBoolean366 = arg0.method8109() && arg1.aBoolean3 && !this.aBoolean365;
		if (arg8 != -1) {
			this.aBoolean364 = true;
		}
		this.method4317(arg8);
	}

	@OriginalMember(owner = "client!jfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass16_Sub7_6 != null) {
			this.aClass16_Sub7_6.method5990();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)V")
	private void method4317(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(24) Class5 local24 = Static79.aClass304_2.method6956(this.anInt4905);
			@Pc(26) Class5 local26 = local24;
			if (local24.anIntArray9 != null) {
				local24 = local24.method77(Static382.aClass282_1);
			}
			if (local24 == null) {
				return;
			}
			if (local24 == local26) {
				local26 = null;
			}
			if (local24.anIntArray11 != null) {
				if (this.aClass228_3 != null && local24.method86(this.aClass228_3.anInt6230)) {
					return;
				}
				local13 = local24.method81();
				if (this.anInt4920 != local24.anInt106) {
					local15 = local24.aBoolean1;
				}
			} else if (local24.lb == -1) {
				if (local26 != null && local26.anIntArray11 != null) {
					if (this.aClass228_3 != null && local26.method86(this.aClass228_3.anInt6230)) {
						return;
					}
					local13 = local26.method81();
					if (this.anInt4920 != local26.anInt106) {
						local15 = local26.aBoolean1;
					}
				} else if (local26 != null && local26.lb != -1 && local26.anInt106 != this.anInt4920) {
					local13 = local26.lb;
					local15 = local26.aBoolean1;
				}
			} else if (this.anInt4920 != local24.anInt106) {
				local13 = local24.lb;
				local15 = local24.aBoolean1;
			}
		}
		if (local13 == -1) {
			this.aClass228_3 = null;
			return;
		}
		this.aClass193_4 = null;
		if (this.aClass228_3 == null || this.aClass228_3.anInt6230 != local13) {
			this.aClass228_3 = Static479.aClass308_2.method7075(local13);
		} else if (this.aClass228_3.anInt6220 == 0) {
			return;
		}
		if (this.aClass228_3.anIntArray403 == null) {
			this.aClass228_3 = null;
			return;
		}
		if (local15) {
			this.anInt4913 = (int) (Math.random() * (double) this.aClass228_3.anIntArray403.length);
			this.anInt4904 = (int) ((double) this.aClass228_3.anIntArray404[this.anInt4913] * Math.random()) + 1;
		} else {
			this.anInt4904 = 1;
			this.anInt4913 = 0;
		}
		this.anInt4899 = this.anInt4913 + 1;
		if (this.anInt4899 < 0 || this.anInt4899 >= this.aClass228_3.anIntArray403.length) {
			this.anInt4899 = -1;
		}
		this.anInt4897 = Static389.anInt6694 - this.anInt4904;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)I")
	public int method4318(@OriginalArg(0) byte arg0) {
		if (arg0 != -20) {
			this.method4321((Class13) null);
		}
		return this.anInt4910;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILclient!pda;ZLclient!ka;Lclient!ha;IIZ)V")
	public void method4319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class193 arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class287[] local6 = arg4.method6621();
		@Pc(15) Class156[] local15 = arg4.method6625();
		if ((this.aClass16_Sub7_6 == null || this.aClass16_Sub7_6.aBoolean488) && (local6 != null || local15 != null)) {
			@Pc(32) Class5 local32 = Static79.aClass304_2.method6956(this.anInt4905);
			if (local32.anIntArray9 != null) {
				local32 = local32.method77(Static382.aClass282_1);
			}
			if (local32 != null) {
				this.aClass16_Sub7_6 = Static401.method5991(Static389.anInt6694, true);
			}
		}
		if (this.aClass16_Sub7_6 == null) {
			return;
		}
		arg4.method6608(arg2);
		if (arg3) {
			this.aClass16_Sub7_6.method5981(arg5, (long) Static389.anInt6694, local6, local15);
		} else {
			this.aClass16_Sub7_6.method5987((long) Static389.anInt6694);
		}
		this.aClass16_Sub7_6.method5985(this.aByte73, arg6, arg7, arg0, arg1);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!ha;)V")
	public void method4320(@OriginalArg(1) Class13 arg0) {
		if (this.aClass2_Sub7_Sub17_3 != null) {
			Static118.method2106(this.aClass2_Sub7_Sub17_3, this.aByte72, this.aClass16_Sub1_14.anInt8037, this.aClass16_Sub1_14.anInt8034, this.aBooleanArray9);
			this.aClass2_Sub7_Sub17_3 = null;
			this.aBooleanArray9 = null;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method4321(@OriginalArg(0) Class13 arg0) {
		this.method4326(true, arg0, 262144, true);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)Z")
	public boolean method4322() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!td;)V")
	public void method4323(@OriginalArg(1) Class326 arg0) {
		this.aClass193_4 = null;
		this.aClass326_2 = arg0;
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)I")
	public int method4324() {
		return this.anInt4917;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZLclient!ha;ZIZ)Lclient!ka;")
	public Class193 method4326(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) Class5 local15 = Static79.aClass304_2.method6956(this.anInt4905);
		if (local15.anIntArray9 != null) {
			local15 = local15.method77(Static382.aClass282_1);
		}
		if (local15 == null) {
			this.method4320(arg1);
			this.anInt4920 = -1;
			this.anInt4915 = -1;
			this.anInt4914 = -1;
			return null;
		}
		if (!this.aBoolean364 && local15.anInt106 != this.anInt4920) {
			this.aClass193_4 = null;
			this.method4317(-1);
		}
		this.method4328(this.aClass16_Sub1_14);
		if (arg0) {
			@Pc(84) boolean local84 = arg0 & this.aBoolean366 & Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267() != 0;
			arg0 = local84 & (local15.anInt106 != this.anInt4914 || this.aClass228_3 != null && Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267() >= 2 && (this.anInt4913 != this.anInt4915 || (this.aClass228_3.aBoolean450 || Static462.aBoolean531) && this.anInt4913 != this.anInt4899));
		}
		if (arg3 && !arg0) {
			this.anInt4920 = local15.anInt106;
			return null;
		}
		if (arg0) {
			Static118.method2106(this.aClass2_Sub7_Sub17_3, this.aByte72, this.aClass16_Sub1_14.anInt8037, this.aClass16_Sub1_14.anInt8034, this.aBooleanArray9);
			this.anInt4914 = -1;
			this.anInt4915 = -1;
		}
		@Pc(156) Class91 local156 = Static511.aClass91Array3[this.aByte72];
		@Pc(163) Class91 local163;
		if (this.aBoolean365) {
			local163 = Static124.aClass91Array1[0];
		} else {
			local163 = this.aByte72 < 3 ? Static511.aClass91Array3[this.aByte72 + 1] : null;
		}
		@Pc(180) Class193 local180 = null;
		if (this.aClass228_3 != null) {
			if (arg0) {
				arg2 |= 0x40000;
			}
			local180 = local15.method78(arg1, this.aClass16_Sub1_14.anInt8034, local163, this.anInt4899, local156.method7446(this.aClass16_Sub1_14.anInt8037, this.aClass16_Sub1_14.anInt8034), this.aClass228_3, this.anInt4908 == 11 ? 10 : this.anInt4908, this.aClass16_Sub1_14.anInt8037, this.anInt4908 == 11 ? this.anInt4901 + 4 : this.anInt4901, local156, this.anInt4904, this.aClass326_2, arg2, this.anInt4913);
			if (local180 == null) {
				this.anInt4910 = 0;
				this.aBooleanArray9 = null;
				this.anInt4917 = 0;
				this.aClass2_Sub7_Sub17_3 = null;
			} else {
				if (arg0) {
					if (this.aBooleanArray9 == null) {
						this.aBooleanArray9 = new boolean[4];
					}
					this.aClass2_Sub7_Sub17_3 = local180.ba(this.aClass2_Sub7_Sub17_3);
					Static28.method8894(this.aClass2_Sub7_Sub17_3, this.aByte72, this.aClass16_Sub1_14.anInt8037, this.aClass16_Sub1_14.anInt8034, this.aBooleanArray9);
					this.anInt4915 = this.anInt4913;
					this.anInt4914 = local15.anInt106;
				}
				this.anInt4917 = local180.fa();
				this.anInt4910 = local180.ma();
			}
			this.aClass193_4 = null;
		} else if (this.aClass193_4 != null && (arg2 & this.aClass193_4.ua()) == arg2 && local15.anInt106 == this.anInt4920) {
			local180 = this.aClass193_4;
		} else {
			if (this.aClass193_4 != null) {
				arg2 |= this.aClass193_4.ua();
			}
			@Pc(258) Class259 local258 = local15.method84(local163, this.aClass16_Sub1_14.anInt8034, this.anInt4908 == 11 ? this.anInt4901 + 4 : this.anInt4901, this.anInt4908 == 11 ? 10 : this.anInt4908, local156, local156.method7446(this.aClass16_Sub1_14.anInt8037, this.aClass16_Sub1_14.anInt8034), arg1, arg2, arg0, this.aClass16_Sub1_14.anInt8037, this.aClass326_2);
			if (local258 == null) {
				this.aClass2_Sub7_Sub17_3 = null;
				this.aBooleanArray9 = null;
				this.aClass193_4 = null;
				this.anInt4917 = 0;
				this.anInt4910 = 0;
			} else {
				local180 = local258.aClass193_7;
				this.aClass193_4 = local258.aClass193_7;
				if (arg0) {
					this.aBooleanArray9 = null;
					this.aClass2_Sub7_Sub17_3 = local258.aClass2_Sub7_Sub17_6;
					Static28.method8894(this.aClass2_Sub7_Sub17_3, this.aByte72, this.aClass16_Sub1_14.anInt8037, this.aClass16_Sub1_14.anInt8034, (boolean[]) null);
					this.anInt4914 = local15.anInt106;
					this.anInt4915 = -1;
				}
				this.anInt4917 = local180.fa();
				this.anInt4910 = local180.ma();
			}
		}
		this.anInt4920 = local15.anInt106;
		return local180;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!rba;I)V")
	private void method4328(@OriginalArg(0) Class16_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass228_3 == null) {
				if (this.aBoolean364) {
					return;
				}
				this.method4317(-1);
				if (this.aClass228_3 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static389.anInt6694 - this.anInt4897;
			if (local31 > 100 && this.aClass228_3.anInt6231 > 0) {
				@Pc(51) int local51 = this.aClass228_3.anIntArray403.length - this.aClass228_3.anInt6231;
				while (local51 > this.anInt4913 && this.aClass228_3.anIntArray404[this.anInt4913] < local31) {
					local31 -= this.aClass228_3.anIntArray404[this.anInt4913];
					this.anInt4913++;
				}
				if (local51 <= this.anInt4913) {
					@Pc(94) int local94 = 0;
					for (@Pc(96) int local96 = local51; local96 < this.aClass228_3.anIntArray403.length; local96++) {
						local94 += this.aClass228_3.anIntArray404[local96];
					}
					local31 %= local94;
				}
				this.anInt4899 = this.anInt4913 + 1;
				if (this.aClass228_3.anIntArray403.length <= this.anInt4899) {
					this.anInt4899 -= this.aClass228_3.anInt6231;
					if (this.anInt4899 < 0 || this.aClass228_3.anIntArray403.length <= this.anInt4899) {
						this.anInt4899 = -1;
					}
				}
			}
			while (local31 > this.aClass228_3.anIntArray404[this.anInt4913]) {
				Static145.method2602(this.anInt4913, arg0, this.aClass228_3);
				local31 -= this.aClass228_3.anIntArray404[this.anInt4913];
				this.anInt4913++;
				if (this.aClass228_3.anIntArray403.length <= this.anInt4913) {
					this.anInt4913 -= this.aClass228_3.anInt6231;
					if (this.anInt4913 < 0 || this.anInt4913 >= this.aClass228_3.anIntArray403.length) {
						this.aClass228_3 = null;
						continue label80;
					}
				}
				this.anInt4899 = this.anInt4913 + 1;
				if (this.aClass228_3.anIntArray403.length <= this.anInt4899) {
					this.anInt4899 -= this.aClass228_3.anInt6231;
					if (this.anInt4899 < 0 || this.aClass228_3.anIntArray403.length <= this.anInt4899) {
						this.anInt4899 = -1;
					}
				}
			}
			this.anInt4897 = Static389.anInt6694 - local31;
			this.anInt4904 = local31;
			return;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)V")
	public void method4329(@OriginalArg(1) int arg0) {
		this.aBoolean364 = true;
		this.method4317(arg0);
	}
}
