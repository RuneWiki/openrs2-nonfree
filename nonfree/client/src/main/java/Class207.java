import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class207 {

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub5 aClass3_Sub4_Sub5_5;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "Lclient!ka;")
	private Class17 aClass17_5;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
	private int anInt6097;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
	private int anInt6098;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	private int anInt6102;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	private int anInt6106;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "Lclient!vo;")
	private Class361 aClass361_2;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "Lclient!ta;")
	public Class4_Sub10 aClass4_Sub10_6;

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "[Z")
	private boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
	private int anInt6099 = -1;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
	private int anInt6110 = -1;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
	private int anInt6112 = 0;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	private int anInt6105 = -1;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
	private int anInt6093 = 0;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "B")
	private final byte aByte97;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	public final int anInt6090;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "B")
	private final byte aByte96;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public final int anInt6095;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Lclient!jw;")
	private final Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
	public final int anInt6108;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Z")
	private final boolean aBoolean431;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIILclient!jw;ZI)V")
	public Class207(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aByte97 = (byte) arg5;
		this.anInt6090 = arg1.anInt8677;
		this.aByte96 = (byte) arg4;
		this.anInt6095 = arg2;
		this.aClass4_Sub1_1 = arg6;
		this.aBoolean433 = arg7;
		this.anInt6108 = arg3;
		this.aBoolean431 = arg0.method7494() && arg1.aBoolean600 && !this.aBoolean433;
		if (arg8 != -1) {
			this.aBoolean432 = true;
		}
		this.method5309(arg8);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!ha;)V")
	public void method5301(@OriginalArg(1) Class5 arg0) {
		if (this.aClass3_Sub4_Sub5_5 != null) {
			Static112.method2304(this.aClass3_Sub4_Sub5_5, this.aByte97, this.aClass4_Sub1_1.anInt8916, this.aClass4_Sub1_1.anInt8911, this.aBooleanArray18);
			this.aBooleanArray18 = null;
			this.aClass3_Sub4_Sub5_5 = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
	public void method5302(@OriginalArg(1) int arg0) {
		this.aBoolean432 = true;
		this.method5309(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub10_6 != null) {
			this.aClass4_Sub10_6.method7847();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	public int method5304(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method5311(-30, true, false, null);
		}
		return this.anInt6093;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!jw;)V")
	private void method5305(@OriginalArg(1) Class4_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass361_2 == null) {
				if (this.aBoolean432) {
					return;
				}
				this.method5309(-1);
				if (this.aClass361_2 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static101.anInt2262 - this.anInt6106;
			if (local30 > 100 && this.aClass361_2.anInt9863 > 0) {
				@Pc(47) int local47 = this.aClass361_2.anIntArray638.length - this.aClass361_2.anInt9863;
				while (this.anInt6098 < local47 && local30 > this.aClass361_2.anIntArray642[this.anInt6098]) {
					local30 -= this.aClass361_2.anIntArray642[this.anInt6098];
					this.anInt6098++;
				}
				if (this.anInt6098 >= local47) {
					@Pc(90) int local90 = 0;
					for (@Pc(92) int local92 = local47; local92 < this.aClass361_2.anIntArray638.length; local92++) {
						local90 += this.aClass361_2.anIntArray642[local92];
					}
					local30 %= local90;
				}
				this.anInt6102 = this.anInt6098 + 1;
				if (this.aClass361_2.anIntArray638.length <= this.anInt6102) {
					this.anInt6102 -= this.aClass361_2.anInt9863;
					if (this.anInt6102 < 0 || this.aClass361_2.anIntArray638.length <= this.anInt6102) {
						this.anInt6102 = -1;
					}
				}
			}
			while (local30 > this.aClass361_2.anIntArray642[this.anInt6098]) {
				Static74.method1765(this.anInt6098, this.aClass361_2, arg0);
				local30 -= this.aClass361_2.anIntArray642[this.anInt6098];
				this.anInt6098++;
				if (this.anInt6098 >= this.aClass361_2.anIntArray638.length) {
					this.anInt6098 -= this.aClass361_2.anInt9863;
					if (this.anInt6098 < 0 || this.anInt6098 >= this.aClass361_2.anIntArray638.length) {
						this.aClass361_2 = null;
						continue label80;
					}
				}
				this.anInt6102 = this.anInt6098 + 1;
				if (this.anInt6102 >= this.aClass361_2.anIntArray638.length) {
					this.anInt6102 -= this.aClass361_2.anInt9863;
					if (this.anInt6102 < 0 || this.anInt6102 >= this.aClass361_2.anIntArray638.length) {
						this.anInt6102 = -1;
					}
				}
			}
			this.anInt6106 = Static101.anInt2262 - local30;
			this.anInt6097 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!ka;ZLclient!ha;IIILclient!sk;)V")
	public void method5306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class39 arg7) {
		@Pc(6) Class284[] local6 = arg2.method5417();
		@Pc(14) Class353[] local14 = arg2.method5415();
		if ((this.aClass4_Sub10_6 == null || this.aClass4_Sub10_6.aBoolean651) && (local6 != null || local14 != null)) {
			@Pc(31) Class299 local31 = Static105.aClass302_1.method7466(this.anInt6090);
			if (local31.anIntArray533 != null) {
				local31 = local31.method7418(Static373.aClass150_1);
			}
			if (local31 != null) {
				this.aClass4_Sub10_6 = Static536.method7851(Static101.anInt2262, true);
			}
		}
		if (this.aClass4_Sub10_6 == null) {
			return;
		}
		arg2.method5425(arg7);
		if (arg3) {
			this.aClass4_Sub10_6.method7849(arg4, (long) Static101.anInt2262, local6, local14);
		} else {
			this.aClass4_Sub10_6.method7845((long) Static101.anInt2262);
		}
		this.aClass4_Sub10_6.method7853(this.aByte96, arg6, arg1, arg0, arg5);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
	public int method5307() {
		return this.anInt6112;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method5308(@OriginalArg(0) Class5 arg0) {
		this.method5311(262144, true, true, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
	private void method5309(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(24) Class299 local24 = Static105.aClass302_1.method7466(this.anInt6090);
			@Pc(26) Class299 local26 = local24;
			if (local24.anIntArray533 != null) {
				local24 = local24.method7418(Static373.aClass150_1);
			}
			if (local24 == null) {
				return;
			}
			if (local24 == local26) {
				local26 = null;
			}
			if (local24.anIntArray536 != null) {
				if (this.aClass361_2 != null && local24.method7409(this.aClass361_2.anInt9862)) {
					return;
				}
				local13 = local24.method7420();
				if (this.anInt6110 != local24.anInt8677) {
					local15 = local24.aBoolean612;
				}
			} else if (local24.anInt8644 == -1) {
				if (local26 != null && local26.anIntArray536 != null) {
					if (this.aClass361_2 != null && local26.method7409(this.aClass361_2.anInt9862)) {
						return;
					}
					local13 = local26.method7420();
					if (local26.anInt8677 != this.anInt6110) {
						local15 = local26.aBoolean612;
					}
				} else if (local26 != null && local26.anInt8644 != -1 && this.anInt6110 != local26.anInt8677) {
					local15 = local26.aBoolean612;
					local13 = local26.anInt8644;
				}
			} else if (this.anInt6110 != local24.anInt8677) {
				local15 = local24.aBoolean612;
				local13 = local24.anInt8644;
			}
		}
		if (local13 == -1) {
			this.aClass361_2 = null;
			return;
		}
		this.aClass17_5 = null;
		if (this.aClass361_2 == null || this.aClass361_2.anInt9862 != local13) {
			this.aClass361_2 = Static115.aClass227_1.method5968(local13);
		} else if (this.aClass361_2.anInt9867 == 0) {
			return;
		}
		if (this.aClass361_2.anIntArray638 == null) {
			this.aClass361_2 = null;
			return;
		}
		if (local15) {
			this.anInt6098 = (int) ((double) this.aClass361_2.anIntArray638.length * Math.random());
			this.anInt6097 = (int) ((double) this.aClass361_2.anIntArray642[this.anInt6098] * Math.random()) + 1;
		} else {
			this.anInt6098 = 0;
			this.anInt6097 = 1;
		}
		this.anInt6102 = this.anInt6098 + 1;
		if (this.anInt6102 < 0 || this.anInt6102 >= this.aClass361_2.anIntArray638.length) {
			this.anInt6102 = -1;
		}
		this.anInt6106 = Static101.anInt2262 - this.anInt6097;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Z")
	public boolean method5310() {
		return this.aBoolean431;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZZLclient!ha;)Lclient!ka;")
	public Class17 method5311(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class5 arg3) {
		@Pc(11) Class299 local11 = Static105.aClass302_1.method7466(this.anInt6090);
		if (local11.anIntArray533 != null) {
			local11 = local11.method7418(Static373.aClass150_1);
		}
		if (local11 == null) {
			this.method5301(arg3);
			this.anInt6110 = -1;
			this.anInt6105 = -1;
			this.anInt6099 = -1;
			return null;
		}
		if (!this.aBoolean432 && local11.anInt8677 != this.anInt6110) {
			this.aClass17_5 = null;
			this.method5309(-1);
		}
		this.method5305(this.aClass4_Sub1_1);
		if (arg1) {
			@Pc(83) boolean local83 = arg1 & this.aBoolean431 & Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474() != 0;
			arg1 = local83 & (this.anInt6099 != local11.anInt8677 || this.aClass361_2 != null && Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474() >= 2 && (this.anInt6098 != this.anInt6105 || (this.aClass361_2.aBoolean709 || Static583.aBoolean687) && this.anInt6098 != this.anInt6102));
		}
		if (arg2 && !arg1) {
			this.anInt6110 = local11.anInt8677;
			return null;
		}
		if (arg1) {
			Static112.method2304(this.aClass3_Sub4_Sub5_5, this.aByte97, this.aClass4_Sub1_1.anInt8916, this.aClass4_Sub1_1.anInt8911, this.aBooleanArray18);
			this.anInt6099 = -1;
			this.anInt6105 = -1;
		}
		@Pc(157) Class51 local157 = Static364.aClass51Array3[this.aByte97];
		@Pc(164) Class51 local164;
		if (this.aBoolean433) {
			local164 = Static559.aClass51Array4[0];
		} else {
			local164 = this.aByte97 >= 3 ? null : Static364.aClass51Array3[this.aByte97 + 1];
		}
		@Pc(181) Class17 local181 = null;
		if (this.aClass361_2 != null) {
			if (arg1) {
				arg0 |= 0x40000;
			}
			local181 = local11.method7406(arg0, this.anInt6098, this.anInt6097, this.aClass4_Sub1_1.anInt8916, this.anInt6095 == 11 ? 10 : this.anInt6095, local157, this.aClass4_Sub1_1.anInt8911, local157.method7839(this.aClass4_Sub1_1.anInt8916, this.aClass4_Sub1_1.anInt8911), arg3, this.anInt6095 == 11 ? this.anInt6108 + 4 : this.anInt6108, local164, this.anInt6102, this.aClass361_2);
			if (local181 == null) {
				this.anInt6093 = 0;
				this.anInt6112 = 0;
				this.aBooleanArray18 = null;
				this.aClass3_Sub4_Sub5_5 = null;
			} else {
				if (arg1) {
					if (this.aBooleanArray18 == null) {
						this.aBooleanArray18 = new boolean[4];
					}
					this.aClass3_Sub4_Sub5_5 = local181.ba(this.aClass3_Sub4_Sub5_5);
					Static145.method2663(this.aClass3_Sub4_Sub5_5, this.aByte97, this.aClass4_Sub1_1.anInt8916, this.aClass4_Sub1_1.anInt8911, this.aBooleanArray18);
					this.anInt6099 = local11.anInt8677;
					this.anInt6105 = this.anInt6098;
				}
				this.anInt6112 = local181.fa();
				this.anInt6093 = local181.ma();
			}
			this.aClass17_5 = null;
		} else if (this.aClass17_5 != null && (arg0 & this.aClass17_5.ua()) == arg0 && this.anInt6110 == local11.anInt8677) {
			local181 = this.aClass17_5;
		} else {
			if (this.aClass17_5 != null) {
				arg0 |= this.aClass17_5.ua();
			}
			@Pc(380) Class216 local380 = local11.method7408(this.aClass4_Sub1_1.anInt8916, this.anInt6095 == 11 ? this.anInt6108 + 4 : this.anInt6108, arg1, this.aClass4_Sub1_1.anInt8911, this.anInt6095 == 11 ? 10 : this.anInt6095, arg0, arg3, local157.method7839(this.aClass4_Sub1_1.anInt8916, this.aClass4_Sub1_1.anInt8911), local157, local164);
			if (local380 == null) {
				this.anInt6093 = 0;
				this.aBooleanArray18 = null;
				this.aClass17_5 = null;
				this.anInt6112 = 0;
				this.aClass3_Sub4_Sub5_5 = null;
			} else {
				local181 = local380.aClass17_6;
				this.aClass17_5 = local380.aClass17_6;
				if (arg1) {
					this.aClass3_Sub4_Sub5_5 = local380.aClass3_Sub4_Sub5_6;
					this.aBooleanArray18 = null;
					Static145.method2663(this.aClass3_Sub4_Sub5_5, this.aByte97, this.aClass4_Sub1_1.anInt8916, this.aClass4_Sub1_1.anInt8911, null);
					this.anInt6099 = local11.anInt8677;
					this.anInt6105 = -1;
				}
				this.anInt6112 = local181.fa();
				this.anInt6093 = local181.ma();
			}
		}
		this.anInt6110 = local11.anInt8677;
		return local181;
	}
}
