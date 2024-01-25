import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class104 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!r;")
	private Class2_Sub5_Sub12 aClass2_Sub5_Sub12_4;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	private int anInt3163;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!f;")
	public Class11_Sub4 aClass11_Sub4_4;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	private int anInt3166;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!hn;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "[Z")
	private boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
	private int anInt3178;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Lclient!ka;")
	private Class25 aClass25_4;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	private int anInt3162 = -1;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	private int anInt3164 = 0;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	private int anInt3171 = 0;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
	private int anInt3173 = -1;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	private int anInt3184 = -1;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!gs;")
	private final Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
	public final int anInt3177;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	public final int anInt3176;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
	public final int anInt3183;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Z")
	private final boolean aBoolean270;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ha;Lclient!uw;IIIILclient!gs;ZI)V")
	public Class104(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class11_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aClass11_Sub1_1 = arg6;
		this.anInt3177 = arg2;
		this.anInt3176 = arg3;
		this.aByte56 = (byte) arg5;
		this.aBoolean268 = arg7;
		this.anInt3183 = arg1.anInt9607;
		this.aByte55 = (byte) arg4;
		this.aBoolean270 = arg0.method7904() && arg1.aBoolean706 && !this.aBoolean268;
		if (arg8 != -1) {
			this.aBoolean269 = true;
		}
		this.method2727(arg8);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!ha;ZZ)Lclient!ka;")
	public Class25 method2724(@OriginalArg(0) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(20) Class350 local20 = Static619.aClass281_4.method6734(this.anInt3183);
		if (local20.anIntArray665 != null) {
			local20 = local20.method8080(Static438.aClass198_1);
		}
		if (local20 == null) {
			this.method2729(arg1);
			this.anInt3184 = -1;
			this.anInt3162 = -1;
			this.anInt3173 = -1;
			return null;
		}
		if (!this.aBoolean269 && this.anInt3173 != local20.anInt9607) {
			this.aClass25_4 = null;
			this.method2727(-1);
		}
		this.method2733(this.aClass11_Sub1_1);
		if (arg2) {
			@Pc(88) boolean local88 = arg2 & this.aBoolean270 & Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495() != 0;
			arg2 = local88 & (local20.anInt9607 != this.anInt3184 || this.aClass149_1 != null && Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495() >= 2 && (this.anInt3162 != this.anInt3166 || (this.aClass149_1.aBoolean376 || Static424.aBoolean577) && this.anInt3163 != this.anInt3166));
		}
		if (arg3 && !arg2) {
			this.anInt3173 = local20.anInt9607;
			return null;
		}
		if (arg2) {
			Static363.method5523(this.aClass2_Sub5_Sub12_4, this.aByte56, this.aClass11_Sub1_1.anInt9925, this.aClass11_Sub1_1.anInt9929, this.aBooleanArray21);
			this.anInt3184 = -1;
			this.anInt3162 = -1;
		}
		@Pc(164) Class112 local164 = Static331.aClass112Array3[this.aByte56];
		@Pc(171) Class112 local171;
		if (this.aBoolean268) {
			local171 = Static178.aClass112Array2[0];
		} else {
			local171 = this.aByte56 >= 3 ? null : Static331.aClass112Array3[this.aByte56 + 1];
		}
		@Pc(190) Class25 local190 = null;
		if (this.aClass149_1 != null) {
			if (arg2) {
				arg0 |= 0x40000;
			}
			local190 = local20.method8093(this.anInt3178, local171, this.anInt3163, this.anInt3166, this.aClass149_1, arg0, this.aClass11_Sub1_1.anInt9929, local164.method7826(this.aClass11_Sub1_1.anInt9925, this.aClass11_Sub1_1.anInt9929), this.anInt3177 == 11 ? 10 : this.anInt3177, local164, this.anInt3177 == 11 ? this.anInt3176 + 4 : this.anInt3176, arg1, this.aClass11_Sub1_1.anInt9925);
			if (local190 == null) {
				this.anInt3164 = 0;
				this.aClass2_Sub5_Sub12_4 = null;
				this.aBooleanArray21 = null;
				this.anInt3171 = 0;
			} else {
				if (arg2) {
					if (this.aBooleanArray21 == null) {
						this.aBooleanArray21 = new boolean[4];
					}
					this.aClass2_Sub5_Sub12_4 = local190.ba(this.aClass2_Sub5_Sub12_4);
					Static616.method8379(this.aClass2_Sub5_Sub12_4, this.aByte56, this.aClass11_Sub1_1.anInt9925, this.aClass11_Sub1_1.anInt9929, this.aBooleanArray21);
					this.anInt3162 = this.anInt3166;
					this.anInt3184 = local20.anInt9607;
				}
				this.anInt3164 = local190.fa();
				this.anInt3171 = local190.ma();
			}
			this.aClass25_4 = null;
		} else if (this.aClass25_4 != null && arg0 == (arg0 & this.aClass25_4.ua()) && local20.anInt9607 == this.anInt3173) {
			local190 = this.aClass25_4;
		} else {
			if (this.aClass25_4 != null) {
				arg0 |= this.aClass25_4.ua();
			}
			@Pc(392) Class234 local392 = local20.method8090(local171, local164, local164.method7826(this.aClass11_Sub1_1.anInt9925, this.aClass11_Sub1_1.anInt9929), arg2, this.anInt3177 == 11 ? this.anInt3176 + 4 : this.anInt3176, this.aClass11_Sub1_1.anInt9925, this.anInt3177 == 11 ? 10 : this.anInt3177, arg0, arg1, this.aClass11_Sub1_1.anInt9929);
			if (local392 == null) {
				this.aBooleanArray21 = null;
				this.aClass25_4 = null;
				this.anInt3171 = 0;
				this.aClass2_Sub5_Sub12_4 = null;
				this.anInt3164 = 0;
			} else {
				local190 = local392.aClass25_7;
				this.aClass25_4 = local392.aClass25_7;
				if (arg2) {
					this.aClass2_Sub5_Sub12_4 = local392.aClass2_Sub5_Sub12_6;
					this.aBooleanArray21 = null;
					Static616.method8379(this.aClass2_Sub5_Sub12_4, this.aByte56, this.aClass11_Sub1_1.anInt9925, this.aClass11_Sub1_1.anInt9929, null);
					this.anInt3162 = -1;
					this.anInt3184 = local20.anInt9607;
				}
				this.anInt3164 = local190.fa();
				this.anInt3171 = local190.ma();
			}
		}
		this.anInt3173 = local20.anInt9607;
		return local190;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
	public void method2725(@OriginalArg(1) int arg0) {
		this.aBoolean269 = true;
		this.method2727(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass11_Sub4_4 != null) {
			this.aClass11_Sub4_4.method2632();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	private void method2727(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(7) boolean local7 = false;
		if (arg0 == -1) {
			@Pc(17) Class350 local17 = Static619.aClass281_4.method6734(this.anInt3183);
			@Pc(19) Class350 local19 = local17;
			if (local17.anIntArray665 != null) {
				local17 = local17.method8080(Static438.aClass198_1);
			}
			if (local17 == null) {
				return;
			}
			if (local19 == local17) {
				local19 = null;
			}
			if (local17.anIntArray668 != null) {
				if (this.aClass149_1 != null && local17.method8079(this.aClass149_1.anInt4520)) {
					return;
				}
				local5 = local17.method8083();
				if (local17.anInt9607 != this.anInt3173) {
					local7 = local17.aBoolean702;
				}
			} else if (local17.anInt9664 == -1) {
				if (local19 != null && local19.anIntArray668 != null) {
					if (this.aClass149_1 != null && local19.method8079(this.aClass149_1.anInt4520)) {
						return;
					}
					local5 = local19.method8083();
					if (local19.anInt9607 != this.anInt3173) {
						local7 = local19.aBoolean702;
					}
				} else if (local19 != null && local19.anInt9664 != -1 && local19.anInt9607 != this.anInt3173) {
					local5 = local19.anInt9664;
					local7 = local19.aBoolean702;
				}
			} else if (this.anInt3173 != local17.anInt9607) {
				local7 = local17.aBoolean702;
				local5 = local17.anInt9664;
			}
		}
		if (local5 == -1) {
			this.aClass149_1 = null;
			return;
		}
		this.aClass25_4 = null;
		if (this.aClass149_1 == null || local5 != this.aClass149_1.anInt4520) {
			this.aClass149_1 = Static185.aClass303_1.method7201(local5);
		} else if (this.aClass149_1.anInt4516 == 0) {
			return;
		}
		if (this.aClass149_1.anIntArray308 == null) {
			this.aClass149_1 = null;
			return;
		}
		if (local7) {
			this.anInt3166 = (int) ((double) this.aClass149_1.anIntArray308.length * Math.random());
			this.anInt3178 = (int) ((double) this.aClass149_1.anIntArray306[this.anInt3166] * Math.random()) + 1;
		} else {
			this.anInt3178 = 1;
			this.anInt3166 = 0;
		}
		this.anInt3163 = this.anInt3166 + 1;
		if (this.anInt3163 < 0 || this.anInt3163 >= this.aClass149_1.anIntArray308.length) {
			this.anInt3163 = -1;
		}
		this.anInt3179 = Static325.anInt5888 - this.anInt3178;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ha;Z)V")
	public void method2728(@OriginalArg(0) Class87 arg0) {
		this.method2724(262144, arg0, true, true);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method2729(@OriginalArg(0) Class87 arg0) {
		if (this.aClass2_Sub5_Sub12_4 != null) {
			Static363.method5523(this.aClass2_Sub5_Sub12_4, this.aByte56, this.aClass11_Sub1_1.anInt9925, this.aClass11_Sub1_1.anInt9929, this.aBooleanArray21);
			this.aClass2_Sub5_Sub12_4 = null;
			this.aBooleanArray21 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Z")
	public boolean method2730() {
		return this.aBoolean270;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ha;ILclient!kd;ZIILclient!ka;I)V")
	public void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class25 arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class130[] local6 = arg6.method7731();
		@Pc(9) Class337[] local9 = arg6.method7724();
		if ((this.aClass11_Sub4_4 == null || this.aClass11_Sub4_4.aBoolean260) && (local6 != null || local9 != null)) {
			@Pc(28) Class350 local28 = Static619.aClass281_4.method6734(this.anInt3183);
			if (local28.anIntArray665 != null) {
				local28 = local28.method8080(Static438.aClass198_1);
			}
			if (local28 != null) {
				this.aClass11_Sub4_4 = Static138.method2640(Static325.anInt5888, true);
			}
		}
		if (this.aClass11_Sub4_4 == null) {
			return;
		}
		arg6.method7723(arg2);
		if (arg3) {
			this.aClass11_Sub4_4.method2636(arg1, (long) Static325.anInt5888, local6, local9);
		} else {
			this.aClass11_Sub4_4.method2626((long) Static325.anInt5888);
		}
		this.aClass11_Sub4_4.method2629(this.aByte55, arg5, arg7, arg4, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
	public int method2732() {
		return this.anInt3164;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!gs;B)V")
	private void method2733(@OriginalArg(0) Class11_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass149_1 == null) {
				if (this.aBoolean269) {
					return;
				}
				this.method2727(-1);
				if (this.aClass149_1 == null) {
					return;
				}
			}
			@Pc(35) int local35 = Static325.anInt5888 - this.anInt3179;
			if (local35 > 100 && this.aClass149_1.anInt4505 > 0) {
				@Pc(52) int local52 = this.aClass149_1.anIntArray308.length - this.aClass149_1.anInt4505;
				while (local52 > this.anInt3166 && local35 > this.aClass149_1.anIntArray306[this.anInt3166]) {
					local35 -= this.aClass149_1.anIntArray306[this.anInt3166];
					this.anInt3166++;
				}
				if (this.anInt3166 >= local52) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local52; local97 < this.aClass149_1.anIntArray308.length; local97++) {
						local95 += this.aClass149_1.anIntArray306[local97];
					}
					local35 %= local95;
				}
				this.anInt3163 = this.anInt3166 + 1;
				if (this.anInt3163 >= this.aClass149_1.anIntArray308.length) {
					this.anInt3163 -= this.aClass149_1.anInt4505;
					if (this.anInt3163 < 0 || this.anInt3163 >= this.aClass149_1.anIntArray308.length) {
						this.anInt3163 = -1;
					}
				}
			}
			while (local35 > this.aClass149_1.anIntArray306[this.anInt3166]) {
				Static330.method3630(this.anInt3166, this.aClass149_1, arg0);
				local35 -= this.aClass149_1.anIntArray306[this.anInt3166];
				this.anInt3166++;
				if (this.aClass149_1.anIntArray308.length <= this.anInt3166) {
					this.anInt3166 -= this.aClass149_1.anInt4505;
					if (this.anInt3166 < 0 || this.aClass149_1.anIntArray308.length <= this.anInt3166) {
						this.aClass149_1 = null;
						continue label80;
					}
				}
				this.anInt3163 = this.anInt3166 + 1;
				if (this.anInt3163 >= this.aClass149_1.anIntArray308.length) {
					this.anInt3163 -= this.aClass149_1.anInt4505;
					if (this.anInt3163 < 0 || this.aClass149_1.anIntArray308.length <= this.anInt3163) {
						this.anInt3163 = -1;
					}
				}
			}
			this.anInt3178 = local35;
			this.anInt3179 = Static325.anInt5888 - local35;
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)I")
	public int method2734(@OriginalArg(0) boolean arg0) {
		return arg0 ? -44 : this.anInt3171;
	}
}
