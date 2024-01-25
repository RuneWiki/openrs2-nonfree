import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class133 {

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	private int anInt3915;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!ts;")
	private Class112 aClass112_3;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	private int anInt3917;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "Lclient!lb;")
	private Class5_Sub1_Sub10 aClass5_Sub1_Sub10_3;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	private int anInt3919;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "Lclient!i;")
	private Class89 aClass89_2;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "Lclient!rs;")
	public Class32_Sub7 aClass32_Sub7_4;

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
	private int anInt3924;

	@OriginalMember(owner = "client!mj", name = "I", descriptor = "[Z")
	private boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
	private boolean aBoolean301 = false;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Z")
	private boolean aBoolean302 = false;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	private int anInt3921 = -1;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	private int anInt3914 = -32768;

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
	private int anInt3930 = -1;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
	private int anInt3922;

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
	public final int anInt3925;

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
	private int anInt3932;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
	public final int anInt3926;

	@OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
	public final int anInt3933;

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "Z")
	private final boolean aBoolean303;

	static {
		new Class85("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIIIZI)V")
	public Class133(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt3922 = arg6;
		this.anInt3925 = arg3;
		this.anInt3932 = arg7;
		this.aByte24 = (byte) arg4;
		this.anInt3926 = arg2;
		this.aBoolean301 = arg8;
		this.anInt3933 = arg1.lb;
		this.aByte25 = (byte) arg5;
		this.aBoolean303 = arg0.method5160() && arg1.aBoolean396 && !this.aBoolean301;
		if (arg9 != -1) {
			this.aBoolean302 = true;
		}
		this.method3487(arg9);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ea;)V")
	public void method3484(@OriginalArg(1) Class55 arg0) {
		if (this.aClass5_Sub1_Sub10_3 != null) {
			Static146.method2670(this.aClass5_Sub1_Sub10_3, this.aByte25, this.anInt3922, this.anInt3932, this.aBooleanArray15);
			this.aBooleanArray15 = null;
			this.aClass5_Sub1_Sub10_3 = null;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	public int method3485() {
		return this.anInt3914;
	}

	@OriginalMember(owner = "client!mj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass32_Sub7_4 != null) {
			this.aClass32_Sub7_4.method4957();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	private void method3487(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0;
		@Pc(14) boolean local14 = false;
		if (arg0 == -1) {
			@Pc(22) Class156 local22 = Static111.method1967(this.anInt3933);
			@Pc(24) Class156 local24 = local22;
			if (local22.anIntArray437 != null) {
				local22 = local22.method4232();
			}
			if (local22 == null) {
				return;
			}
			if (local22 == local24) {
				local24 = null;
			}
			if (local22.anIntArray434 != null) {
				if (this.aClass89_2 != null && local22.method4233(this.aClass89_2.anInt2467)) {
					return;
				}
				local12 = local22.method4234();
				if (this.anInt3930 != local22.lb) {
					local14 = local22.aBoolean386;
				}
			} else if (local22.anInt4736 == -1) {
				if (local24 != null && local24.anIntArray434 != null) {
					if (this.aClass89_2 != null && local24.method4233(this.aClass89_2.anInt2467)) {
						return;
					}
					local12 = local24.method4234();
					if (this.anInt3930 != local24.lb) {
						local14 = local24.aBoolean386;
					}
				} else if (local24 != null && local24.anInt4736 != -1 && local24.lb != this.anInt3930) {
					local12 = local24.anInt4736;
					local14 = local24.aBoolean386;
				}
			} else if (this.anInt3930 != local22.lb) {
				local12 = local22.anInt4736;
				local14 = local22.aBoolean386;
			}
		}
		if (local12 == -1) {
			this.aClass89_2 = null;
			return;
		}
		this.aClass112_3 = null;
		if (this.aClass89_2 == null || local12 != this.aClass89_2.anInt2467) {
			this.aClass89_2 = Static162.method2849(local12);
		} else if (this.aClass89_2.anInt2468 == 0) {
			return;
		}
		if (this.aClass89_2.anIntArray245 == null) {
			this.aClass89_2 = null;
			return;
		}
		if (local14) {
			this.anInt3919 = (int) ((double) this.aClass89_2.anIntArray245.length * Math.random());
			this.anInt3924 = (int) ((double) this.aClass89_2.anIntArray244[this.anInt3919] * Math.random()) + 1;
		} else {
			this.anInt3924 = 1;
			this.anInt3919 = 0;
		}
		this.anInt3917 = this.anInt3919 + 1;
		if (this.anInt3917 < 0 || this.anInt3917 >= this.aClass89_2.anIntArray245.length) {
			this.anInt3917 = -1;
		}
		this.anInt3915 = Static283.anInt5563 - this.anInt3924;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V")
	public void method3489(@OriginalArg(0) int arg0) {
		this.aBoolean302 = true;
		this.method3487(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)Z")
	public boolean method3490() {
		return this.aBoolean303;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ea;ZIIIZ)Lclient!ts;")
	public Class112 method3491(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) Class156 local10 = Static111.method1967(this.anInt3933);
		if (local10.anIntArray437 != null) {
			local10 = local10.method4232();
		}
		if (local10 == null) {
			this.method3484(arg1);
			this.anInt3930 = -1;
			this.anInt3921 = this.anInt3919;
			return null;
		}
		if (!this.aBoolean302 && this.anInt3930 != local10.lb) {
			this.aClass112_3 = null;
			this.method3487(-1);
		}
		this.method3492(arg0, arg3);
		@Pc(76) boolean local76 = arg5 & Static95.anInt1828 != 0 & this.aBoolean303;
		@Pc(113) boolean local113 = local76 & (this.anInt3930 != local10.lb || (this.anInt3919 != this.anInt3921 || this.aClass89_2 != null && (this.aClass89_2.aBoolean183 || Static85.aBoolean108) && this.anInt3917 != this.anInt3919) && Static95.anInt1828 >= 2);
		if (arg2 && !local113) {
			this.anInt3930 = local10.lb;
			this.anInt3921 = this.anInt3919;
			return null;
		}
		if (local113) {
			Static146.method2670(this.aClass5_Sub1_Sub10_3, this.aByte25, this.anInt3922, this.anInt3932, this.aBooleanArray15);
		}
		@Pc(145) Class51 local145 = Static8.aClass51Array1[this.aByte25];
		@Pc(161) Class51 local161;
		if (this.aBoolean301) {
			local161 = Static56.aClass51Array2[0];
		} else {
			local161 = this.aByte25 >= 3 ? null : Static8.aClass51Array1[this.aByte25 + 1];
		}
		@Pc(169) Class112 local169 = null;
		if (this.aClass89_2 != null) {
			if (local113) {
				arg4 |= 0x20000;
			}
			local169 = local10.method4226(this.anInt3926 == 11 ? this.anInt3925 + 4 : this.anInt3925, this.anInt3932, this.aClass89_2, local145, this.anInt3919, arg1, this.anInt3922, this.anInt3926 == 11 ? 10 : this.anInt3926, this.anInt3917, local161, arg4, local145.method1844(this.anInt3922, this.anInt3932), this.anInt3924);
			if (local169 == null) {
				this.anInt3914 = 0;
				this.aClass5_Sub1_Sub10_3 = null;
				this.aBooleanArray15 = null;
			} else {
				if (local113) {
					if (this.aBooleanArray15 == null) {
						this.aBooleanArray15 = new boolean[4];
					}
					this.aClass5_Sub1_Sub10_3 = local169.method4348(this.aClass5_Sub1_Sub10_3);
					Static231.method4152(this.aClass5_Sub1_Sub10_3, this.aByte25, arg0, arg3, this.aBooleanArray15);
				}
				this.anInt3914 = local169.method4331();
			}
			this.aClass112_3 = null;
		} else if (this.aClass112_3 != null && (this.aClass112_3.method4308() & arg4) == arg4 && this.anInt3930 == local10.lb) {
			local169 = this.aClass112_3;
		} else {
			if (this.aClass112_3 != null) {
				arg4 |= this.aClass112_3.method4308();
			}
			@Pc(341) Class191 local341 = local10.method4221(local145, arg1, this.anInt3926 == 11 ? this.anInt3925 + 4 : this.anInt3925, local113, this.anInt3926 == 11 ? 10 : this.anInt3926, local145.method1844(this.anInt3922, this.anInt3932), arg4, this.anInt3932, this.anInt3922, local161);
			if (local341 == null) {
				this.anInt3914 = 0;
				this.aBooleanArray15 = null;
				this.aClass112_3 = null;
				this.aClass5_Sub1_Sub10_3 = null;
			} else {
				local169 = local341.aClass112_6;
				this.aClass112_3 = local341.aClass112_6;
				if (local113) {
					this.aClass5_Sub1_Sub10_3 = local341.aClass5_Sub1_Sub10_6;
					this.aBooleanArray15 = null;
					Static231.method4152(this.aClass5_Sub1_Sub10_3, this.aByte25, arg0, arg3, null);
				}
				this.anInt3914 = local169.method4331();
			}
		}
		this.anInt3930 = local10.lb;
		this.anInt3922 = arg0;
		this.anInt3921 = this.anInt3919;
		this.anInt3932 = arg3;
		return local169;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	private void method3492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass89_2 == null) {
				if (this.aBoolean302) {
					return;
				}
				this.method3487(-1);
				if (this.aClass89_2 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static283.anInt5563 - this.anInt3915;
			if (local30 > 100 && this.aClass89_2.anInt2466 > 0) {
				@Pc(50) int local50 = this.aClass89_2.anIntArray245.length - this.aClass89_2.anInt2466;
				while (local50 > this.anInt3919 && this.aClass89_2.anIntArray244[this.anInt3919] < local30) {
					local30 -= this.aClass89_2.anIntArray244[this.anInt3919];
					this.anInt3919++;
				}
				if (this.anInt3919 >= local50) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass89_2.anIntArray245.length; local91++) {
						local89 += this.aClass89_2.anIntArray244[local91];
					}
					local30 %= local89;
				}
				this.anInt3917 = this.anInt3919 + 1;
				if (this.aClass89_2.anIntArray245.length <= this.anInt3917) {
					this.anInt3917 -= this.aClass89_2.anInt2466;
					if (this.anInt3917 < 0 || this.aClass89_2.anIntArray245.length <= this.anInt3917) {
						this.anInt3917 = -1;
					}
				}
			}
			while (local30 > this.aClass89_2.anIntArray244[this.anInt3919]) {
				Static311.method3258(this.aClass89_2, arg0, false, this.anInt3919, arg1);
				local30 -= this.aClass89_2.anIntArray244[this.anInt3919];
				this.anInt3919++;
				if (this.anInt3919 >= this.aClass89_2.anIntArray245.length) {
					this.anInt3919 -= this.aClass89_2.anInt2466;
					if (this.anInt3919 < 0 || this.aClass89_2.anIntArray245.length <= this.anInt3919) {
						this.aClass89_2 = null;
						continue label80;
					}
				}
				this.anInt3917 = this.anInt3919 + 1;
				if (this.anInt3917 >= this.aClass89_2.anIntArray245.length) {
					this.anInt3917 -= this.aClass89_2.anInt2466;
					if (this.anInt3917 < 0 || this.aClass89_2.anIntArray245.length <= this.anInt3917) {
						this.anInt3917 = -1;
					}
				}
			}
			this.anInt3915 = Static283.anInt5563 - local30;
			this.anInt3924 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!ea;ZIIIILclient!ts;)V")
	public void method3493(@OriginalArg(1) Class55 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class112 arg6) {
		@Pc(10) Class113[] local10 = arg6.method4321();
		@Pc(13) Class148[] local13 = arg6.method4334();
		if ((this.aClass32_Sub7_4 == null || this.aClass32_Sub7_4.aBoolean461) && (local10 != null || local13 != null)) {
			@Pc(29) Class156 local29 = Static111.method1967(this.anInt3933);
			if (local29.anIntArray437 != null) {
				local29 = local29.method4232();
			}
			if (local29 != null) {
				this.aClass32_Sub7_4 = new Class32_Sub7(Static283.anInt5563);
			}
		}
		if (this.aClass32_Sub7_4 == null) {
			return;
		}
		if (arg1) {
			this.aClass32_Sub7_4.method4963(arg0, (long) Static283.anInt5563, local10, local13);
		} else {
			this.aClass32_Sub7_4.method4964((long) Static283.anInt5563);
		}
		this.aClass32_Sub7_4.method4959(this.aByte24, arg4, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(ILclient!ea;)V")
	public void method3494(@OriginalArg(1) Class55 arg0) {
		this.method3491(this.anInt3922, arg0, true, this.anInt3932, 131072, true);
	}
}
