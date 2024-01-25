import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class117 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	private int anInt3232;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!c;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!j;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_4;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!dc;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[Z")
	private boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "I")
	private int anInt3245;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	private int anInt3246;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "I")
	private int anInt3251;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "Lclient!lr;")
	public Class38_Sub6 aClass38_Sub6_1;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Z")
	private boolean aBoolean278 = false;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	private int anInt3244 = -1;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	private int anInt3235 = -1;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	private int anInt3234 = -32768;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Z")
	private boolean aBoolean277 = false;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public final int anInt3233;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public final int anInt3240;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public final int anInt3237;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	private int anInt3239;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	private int anInt3242;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "B")
	private final byte aByte36;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "B")
	private final byte aByte35;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Z")
	private final boolean aBoolean276;

	static {
		new Class256("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIIIZI)V")
	public Class117(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt3233 = arg2;
		this.anInt3240 = arg1.anInt7160;
		this.anInt3237 = arg3;
		this.anInt3239 = arg7;
		this.anInt3242 = arg6;
		this.aByte36 = (byte) arg5;
		this.aByte35 = (byte) arg4;
		this.aBoolean278 = arg8;
		this.aBoolean276 = arg0.method2273() && arg1.aBoolean617 && !this.aBoolean278;
		if (arg9 != -1) {
			this.aBoolean277 = true;
		}
		this.method2621(arg9);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!c;Lclient!qa;IZIIIZ)V")
	public void method2614(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(6) Class202[] local6 = arg0.method5673();
		@Pc(9) Class17[] local9 = arg0.method5667();
		if ((this.aClass38_Sub6_1 == null || this.aClass38_Sub6_1.aBoolean368) && (local6 != null || local9 != null)) {
			@Pc(39) Class250 local39 = Static406.aClass150_3.method3508(this.anInt3240);
			if (local39.anIntArray479 != null) {
				local39 = local39.method5591(Static215.aClass225_1);
			}
			if (local39 != null) {
				this.aClass38_Sub6_1 = new Class38_Sub6(Static164.anInt3206);
			}
		}
		if (this.aClass38_Sub6_1 == null) {
			return;
		}
		if (arg6) {
			this.aClass38_Sub6_1.method3556(arg1, (long) Static164.anInt3206, local6, local9);
		} else {
			this.aClass38_Sub6_1.method3544((long) Static164.anInt3206);
		}
		this.aClass38_Sub6_1.method3555(this.aByte35, arg2, arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
	public void method2615(@OriginalArg(0) int arg0) {
		this.aBoolean277 = true;
		this.method2621(arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method2617(@OriginalArg(0) Class26 arg0) {
		this.method2618(true, true, arg0, this.anInt3239, this.anInt3242, 262144);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZZLclient!qa;IIII)Lclient!c;")
	public Class32 method2618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) Class250 local11 = Static406.aClass150_3.method3508(this.anInt3240);
		if (local11.anIntArray479 != null) {
			local11 = local11.method5591(Static215.aClass225_1);
		}
		if (local11 == null) {
			this.method2619(arg2);
			this.anInt3244 = this.anInt3246;
			this.anInt3235 = -1;
			return null;
		}
		if (!this.aBoolean277 && this.anInt3235 != local11.anInt7160) {
			this.aClass32_4 = null;
			this.method2621(-1);
		}
		this.method2622(arg4, arg3);
		@Pc(76) boolean local76 = arg1 & this.aBoolean276 & Static399.aClass167_Sub1_1.method4517(Static281.anInt5126) != 0;
		@Pc(120) boolean local120 = local76 & (local11.anInt7160 != this.anInt3235 || (this.anInt3244 != this.anInt3246 || this.aClass46_1 != null && (this.aClass46_1.aBoolean149 || Static431.aBoolean640) && this.anInt3251 != this.anInt3246) && Static399.aClass167_Sub1_1.method4517(Static281.anInt5126) >= 2);
		if (arg0 && !local120) {
			this.anInt3244 = this.anInt3246;
			this.anInt3235 = local11.anInt7160;
			return null;
		}
		if (local120) {
			Static450.method6081(this.aClass2_Sub2_Sub9_4, this.aByte36, this.anInt3242, this.anInt3239, this.aBooleanArray25);
		}
		@Pc(152) Class106 local152 = Static372.aClass106Array11[this.aByte36];
		@Pc(164) Class106 local164;
		if (this.aBoolean278) {
			local164 = Static72.aClass106Array4[0];
		} else {
			local164 = this.aByte36 < 3 ? Static372.aClass106Array11[this.aByte36 + 1] : null;
		}
		@Pc(183) Class32 local183 = null;
		if (this.aClass46_1 != null) {
			if (local120) {
				arg5 |= 0x40000;
			}
			local183 = local11.method5582(local164, this.anInt3251, this.anInt3233 == 11 ? 10 : this.anInt3233, this.aClass46_1, this.anInt3245, this.anInt3246, arg5, local152.va(this.anInt3242, this.anInt3239), arg2, local152, this.anInt3233 == 11 ? this.anInt3237 + 4 : this.anInt3237, this.anInt3242, this.anInt3239);
			if (local183 == null) {
				this.aClass2_Sub2_Sub9_4 = null;
				this.aBooleanArray25 = null;
				this.anInt3234 = 0;
			} else {
				if (local120) {
					if (this.aBooleanArray25 == null) {
						this.aBooleanArray25 = new boolean[4];
					}
					this.aClass2_Sub2_Sub9_4 = local183.ua(this.aClass2_Sub2_Sub9_4);
					Static95.method1600(this.aClass2_Sub2_Sub9_4, this.aByte36, arg4, arg3, this.aBooleanArray25);
				}
				this.anInt3234 = local183.b();
			}
			this.aClass32_4 = null;
		} else if (this.aClass32_4 != null && arg5 == (arg5 & this.aClass32_4.n()) && this.anInt3235 == local11.anInt7160) {
			local183 = this.aClass32_4;
		} else {
			if (this.aClass32_4 != null) {
				arg5 |= this.aClass32_4.n();
			}
			@Pc(255) Class69 local255 = local11.method5593(local120, this.anInt3233 == 11 ? 10 : this.anInt3233, arg2, this.anInt3239, local152, arg5, local164, this.anInt3242, this.anInt3233 == 11 ? this.anInt3237 + 4 : this.anInt3237, local152.va(this.anInt3242, this.anInt3239));
			if (local255 == null) {
				this.aBooleanArray25 = null;
				this.anInt3234 = 0;
				this.aClass2_Sub2_Sub9_4 = null;
				this.aClass32_4 = null;
			} else {
				local183 = local255.aClass32_2;
				this.aClass32_4 = local255.aClass32_2;
				if (local120) {
					this.aClass2_Sub2_Sub9_4 = local255.aClass2_Sub2_Sub9_2;
					this.aBooleanArray25 = null;
					Static95.method1600(this.aClass2_Sub2_Sub9_4, this.aByte36, arg4, arg3, null);
				}
				this.anInt3234 = local183.b();
			}
		}
		this.anInt3235 = local11.anInt7160;
		this.anInt3239 = arg3;
		this.anInt3242 = arg4;
		this.anInt3244 = this.anInt3246;
		return local183;
	}

	@OriginalMember(owner = "client!id", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass38_Sub6_1 != null) {
			this.aClass38_Sub6_1.method3548();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!qa;)V")
	public void method2619(@OriginalArg(1) Class26 arg0) {
		if (this.aClass2_Sub2_Sub9_4 != null) {
			Static450.method6081(this.aClass2_Sub2_Sub9_4, this.aByte36, this.anInt3242, this.anInt3239, this.aBooleanArray25);
			this.aClass2_Sub2_Sub9_4 = null;
			this.aBooleanArray25 = null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	private void method2621(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class250 local18 = Static406.aClass150_3.method3508(this.anInt3240);
			@Pc(20) Class250 local20 = local18;
			if (local18.anIntArray479 != null) {
				local18 = local18.method5591(Static215.aClass225_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray478 != null) {
				if (this.aClass46_1 != null && local18.method5588(this.aClass46_1.anInt1768)) {
					return;
				}
				local7 = local18.method5578();
				if (this.anInt3235 != local18.anInt7160) {
					local9 = local18.aBoolean613;
				}
			} else if (local18.anInt7183 == -1) {
				if (local20 != null && local20.anIntArray478 != null) {
					if (this.aClass46_1 != null && local20.method5588(this.aClass46_1.anInt1768)) {
						return;
					}
					local7 = local20.method5578();
					if (this.anInt3235 != local20.anInt7160) {
						local9 = local20.aBoolean613;
					}
				} else if (local20 != null && local20.anInt7183 != -1 && local20.anInt7160 != this.anInt3235) {
					local7 = local20.anInt7183;
					local9 = local20.aBoolean613;
				}
			} else if (local18.anInt7160 != this.anInt3235) {
				local7 = local18.anInt7183;
				local9 = local18.aBoolean613;
			}
		}
		if (local7 == -1) {
			this.aClass46_1 = null;
			return;
		}
		this.aClass32_4 = null;
		if (this.aClass46_1 == null || local7 != this.aClass46_1.anInt1768) {
			this.aClass46_1 = Static9.aClass194_1.method4371(local7);
		} else if (this.aClass46_1.anInt1764 == 0) {
			return;
		}
		if (this.aClass46_1.anIntArray90 == null) {
			this.aClass46_1 = null;
			return;
		}
		if (local9) {
			this.anInt3246 = (int) (Math.random() * (double) this.aClass46_1.anIntArray90.length);
			this.anInt3245 = (int) ((double) this.aClass46_1.anIntArray89[this.anInt3246] * Math.random()) + 1;
		} else {
			this.anInt3246 = 0;
			this.anInt3245 = 1;
		}
		this.anInt3251 = this.anInt3246 + 1;
		if (this.anInt3251 < 0 || this.aClass46_1.anIntArray90.length <= this.anInt3251) {
			this.anInt3251 = -1;
		}
		this.anInt3232 = Static164.anInt3206 - this.anInt3245;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	private void method2622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass46_1 == null) {
				if (this.aBoolean277) {
					return;
				}
				this.method2621(-1);
				if (this.aClass46_1 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static164.anInt3206 - this.anInt3232;
			if (local34 > 100 && this.aClass46_1.anInt1763 > 0) {
				@Pc(56) int local56 = this.aClass46_1.anIntArray90.length - this.aClass46_1.anInt1763;
				while (local56 > this.anInt3246 && local34 > this.aClass46_1.anIntArray89[this.anInt3246]) {
					local34 -= this.aClass46_1.anIntArray89[this.anInt3246];
					this.anInt3246++;
				}
				if (this.anInt3246 >= local56) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local56; local97 < this.aClass46_1.anIntArray90.length; local97++) {
						local95 += this.aClass46_1.anIntArray89[local97];
					}
					local34 %= local95;
				}
				this.anInt3251 = this.anInt3246 + 1;
				if (this.anInt3251 >= this.aClass46_1.anIntArray90.length) {
					this.anInt3251 -= this.aClass46_1.anInt1763;
					if (this.anInt3251 < 0 || this.aClass46_1.anIntArray90.length <= this.anInt3251) {
						this.anInt3251 = -1;
					}
				}
			}
			while (local34 > this.aClass46_1.anIntArray89[this.anInt3246]) {
				Static4.method137(this.aClass46_1, this.anInt3246, arg1, this.aByte35, arg0, false);
				local34 -= this.aClass46_1.anIntArray89[this.anInt3246];
				this.anInt3246++;
				if (this.aClass46_1.anIntArray90.length <= this.anInt3246) {
					this.anInt3246 -= this.aClass46_1.anInt1763;
					if (this.anInt3246 < 0 || this.anInt3246 >= this.aClass46_1.anIntArray90.length) {
						this.aClass46_1 = null;
						continue label80;
					}
				}
				this.anInt3251 = this.anInt3246 + 1;
				if (this.anInt3251 >= this.aClass46_1.anIntArray90.length) {
					this.anInt3251 -= this.aClass46_1.anInt1763;
					if (this.anInt3251 < 0 || this.aClass46_1.anIntArray90.length <= this.anInt3251) {
						this.anInt3251 = -1;
					}
				}
			}
			this.anInt3232 = Static164.anInt3206 - local34;
			this.anInt3245 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)I")
	public int method2623() {
		return this.anInt3234;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Z")
	public boolean method2625() {
		return this.aBoolean276;
	}
}
