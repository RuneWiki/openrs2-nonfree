import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class120 {

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "[Z")
	private boolean[] aBooleanArray63;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	private int anInt2933;

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "Lclient!qg;")
	private Class189 aClass189_2;

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "Lclient!mr;")
	private Class2_Sub1_Sub6 aClass2_Sub1_Sub6_3;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
	private int anInt2938;

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
	private int anInt2939;

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "Lclient!ab;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
	private int anInt2940;

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "Lclient!m;")
	public Class22_Sub6 aClass22_Sub6_3;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	private int anInt2930 = -1;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	private int anInt2934 = -1;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
	private int anInt2936 = -32768;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	public final int anInt2929;

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
	public final int anInt2942;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public final int anInt2922;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
	private int anInt2937;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIIIZI)V")
	public Class120(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt2929 = arg2;
		this.aBoolean213 = arg8;
		this.anInt2942 = arg3;
		this.anInt2922 = arg1.anInt802;
		this.aByte24 = (byte) arg5;
		this.anInt2937 = arg7;
		this.aByte25 = (byte) arg4;
		this.anInt2920 = arg6;
		this.aBoolean215 = arg0.method4527() && arg1.aBoolean65 && !this.aBoolean213;
		if (arg9 != -1) {
			this.aBoolean214 = true;
		}
		this.method2684(arg9);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZZILclient!km;IB)Lclient!ab;")
	public Class3 method2677(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(5) int arg5) {
		@Pc(16) Class34 local16 = Static11.aClass123_5.method2703(this.anInt2922);
		if (local16.anIntArray122 != null) {
			local16 = local16.method831(Static248.aClass125_1);
		}
		if (local16 == null) {
			this.method2678(arg4);
			this.anInt2934 = -1;
			this.anInt2930 = this.anInt2933;
			return null;
		}
		if (!this.aBoolean214 && this.anInt2934 != local16.anInt802) {
			this.aClass3_3 = null;
			this.method2684(-1);
		}
		this.method2682(arg0, arg3);
		@Pc(73) boolean local73 = arg2 & this.aBoolean215 & Static193.anInt6663 != 0;
		@Pc(116) boolean local116 = local73 & (this.anInt2934 != local16.anInt802 || (this.anInt2930 != this.anInt2933 || this.aClass189_2 != null && (this.aClass189_2.aBoolean383 || Static151.aBoolean203) && this.anInt2933 != this.anInt2939) && Static193.anInt6663 >= 2);
		if (arg1 && !local116) {
			this.anInt2934 = local16.anInt802;
			this.anInt2930 = this.anInt2933;
			return null;
		}
		if (local116) {
			Static64.method1166(this.aClass2_Sub1_Sub6_3, this.aByte24, this.anInt2920, this.anInt2937, this.aBooleanArray63);
		}
		@Pc(148) Class33 local148 = Static17.aClass33Array1[this.aByte24];
		@Pc(166) Class33 local166;
		if (this.aBoolean213) {
			local166 = Static39.aClass33Array2[0];
		} else {
			local166 = this.aByte24 >= 3 ? null : Static17.aClass33Array1[this.aByte24 + 1];
		}
		@Pc(174) Class3 local174 = null;
		if (this.aClass189_2 != null) {
			if (local116) {
				arg5 |= 0x20000;
			}
			local174 = local16.method826(local148, this.anInt2937, this.anInt2929 == 11 ? this.anInt2942 + 4 : this.anInt2942, local148.method4055(this.anInt2920, this.anInt2937), this.anInt2939, arg5, local166, this.aClass189_2, this.anInt2933, this.anInt2920, this.anInt2929 == 11 ? 10 : this.anInt2929, arg4, this.anInt2940);
			if (local174 == null) {
				this.aClass2_Sub1_Sub6_3 = null;
				this.anInt2936 = 0;
				this.aBooleanArray63 = null;
			} else {
				if (local116) {
					if (this.aBooleanArray63 == null) {
						this.aBooleanArray63 = new boolean[4];
					}
					this.aClass2_Sub1_Sub6_3 = local174.method3445(this.aClass2_Sub1_Sub6_3);
					Static197.method3302(this.aClass2_Sub1_Sub6_3, this.aByte24, arg3, arg0, this.aBooleanArray63);
				}
				this.anInt2936 = local174.method3459();
			}
			this.aClass3_3 = null;
		} else if (this.aClass3_3 != null && arg5 == (this.aClass3_3.method3474() & arg5) && local16.anInt802 == this.anInt2934) {
			local174 = this.aClass3_3;
		} else {
			if (this.aClass3_3 != null) {
				arg5 |= this.aClass3_3.method3474();
			}
			@Pc(351) Class146 local351 = local16.method827(local166, this.anInt2920, this.anInt2929 == 11 ? 10 : this.anInt2929, local148, this.anInt2929 == 11 ? this.anInt2942 + 4 : this.anInt2942, arg4, arg5, local116, this.anInt2937, local148.method4055(this.anInt2920, this.anInt2937));
			if (local351 == null) {
				this.anInt2936 = 0;
				this.aClass3_3 = null;
				this.aBooleanArray63 = null;
				this.aClass2_Sub1_Sub6_3 = null;
			} else {
				local174 = local351.aClass3_5;
				this.aClass3_3 = local351.aClass3_5;
				if (local116) {
					this.aBooleanArray63 = null;
					this.aClass2_Sub1_Sub6_3 = local351.aClass2_Sub1_Sub6_5;
					Static197.method3302(this.aClass2_Sub1_Sub6_3, this.aByte24, arg3, arg0, null);
				}
				this.anInt2936 = local174.method3459();
			}
		}
		this.anInt2934 = local16.anInt802;
		this.anInt2920 = arg3;
		this.anInt2937 = arg0;
		this.anInt2930 = this.anInt2933;
		return local174;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!km;)V")
	public void method2678(@OriginalArg(1) Class82 arg0) {
		if (this.aClass2_Sub1_Sub6_3 != null) {
			Static64.method1166(this.aClass2_Sub1_Sub6_3, this.aByte24, this.anInt2920, this.anInt2937, this.aBooleanArray63);
			this.aBooleanArray63 = null;
			this.aClass2_Sub1_Sub6_3 = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Z")
	public boolean method2679() {
		return this.aBoolean215;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
	public void method2680(@OriginalArg(0) int arg0) {
		this.aBoolean214 = true;
		this.method2684(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)I")
	public int method2681() {
		return this.anInt2936;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
	private void method2682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass189_2 == null) {
				if (this.aBoolean214) {
					return;
				}
				this.method2684(-1);
				if (this.aClass189_2 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static295.anInt5281 - this.anInt2938;
			if (local33 > 100 && this.aClass189_2.anInt5151 > 0) {
				@Pc(52) int local52 = this.aClass189_2.anIntArray639.length - this.aClass189_2.anInt5151;
				while (this.anInt2933 < local52 && local33 > this.aClass189_2.anIntArray640[this.anInt2933]) {
					local33 -= this.aClass189_2.anIntArray640[this.anInt2933];
					this.anInt2933++;
				}
				if (local52 <= this.anInt2933) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local52; local97 < this.aClass189_2.anIntArray639.length; local97++) {
						local95 += this.aClass189_2.anIntArray640[local97];
					}
					local33 %= local95;
				}
				this.anInt2939 = this.anInt2933 + 1;
				if (this.anInt2939 >= this.aClass189_2.anIntArray639.length) {
					this.anInt2939 -= this.aClass189_2.anInt5151;
					if (this.anInt2939 < 0 || this.anInt2939 >= this.aClass189_2.anIntArray639.length) {
						this.anInt2939 = -1;
					}
				}
			}
			while (this.aClass189_2.anIntArray640[this.anInt2933] < local33) {
				Static369.method5563(this.aByte25, this.aClass189_2, false, arg1, arg0, this.anInt2933);
				local33 -= this.aClass189_2.anIntArray640[this.anInt2933];
				this.anInt2933++;
				if (this.aClass189_2.anIntArray639.length <= this.anInt2933) {
					this.anInt2933 -= this.aClass189_2.anInt5151;
					if (this.anInt2933 < 0 || this.anInt2933 >= this.aClass189_2.anIntArray639.length) {
						this.aClass189_2 = null;
						continue label80;
					}
				}
				this.anInt2939 = this.anInt2933 + 1;
				if (this.anInt2939 >= this.aClass189_2.anIntArray639.length) {
					this.anInt2939 -= this.aClass189_2.anInt5151;
					if (this.anInt2939 < 0 || this.anInt2939 >= this.aClass189_2.anIntArray639.length) {
						this.anInt2939 = -1;
					}
				}
			}
			this.anInt2938 = Static295.anInt5281 - local33;
			this.anInt2940 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILclient!km;IILclient!ab;Z)V")
	public void method2683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3 arg5, @OriginalArg(7) boolean arg6) {
		@Pc(6) Class191[] local6 = arg5.method3476();
		@Pc(17) Class218[] local17 = arg5.method3441();
		if ((this.aClass22_Sub6_3 == null || this.aClass22_Sub6_3.aBoolean289) && (local6 != null || local17 != null)) {
			@Pc(34) Class34 local34 = Static11.aClass123_5.method2703(this.anInt2922);
			if (local34.anIntArray122 != null) {
				local34 = local34.method831(Static248.aClass125_1);
			}
			if (local34 != null) {
				this.aClass22_Sub6_3 = new Class22_Sub6(Static295.anInt5281);
			}
		}
		if (this.aClass22_Sub6_3 == null) {
			return;
		}
		if (arg6) {
			this.aClass22_Sub6_3.method3564(arg3, (long) Static295.anInt5281, local6, local17);
		} else {
			this.aClass22_Sub6_3.method3566((long) Static295.anInt5281);
		}
		this.aClass22_Sub6_3.method3560(this.aByte25, arg0, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
	private void method2684(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class34 local19 = Static11.aClass123_5.method2703(this.anInt2922);
			@Pc(21) Class34 local21 = local19;
			if (local19.anIntArray122 != null) {
				local19 = local19.method831(Static248.aClass125_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray124 != null) {
				if (this.aClass189_2 != null && local19.method818(this.aClass189_2.anInt5152)) {
					return;
				}
				local7 = local19.method821();
				if (this.anInt2934 != local19.anInt802) {
					local9 = local19.aBoolean56;
				}
			} else if (local19.anInt814 == -1) {
				if (local21 != null && local21.anIntArray124 != null) {
					if (this.aClass189_2 != null && local21.method818(this.aClass189_2.anInt5152)) {
						return;
					}
					local7 = local21.method821();
					if (this.anInt2934 != local21.anInt802) {
						local9 = local21.aBoolean56;
					}
				} else if (local21 != null && local21.anInt814 != -1 && local21.anInt802 != this.anInt2934) {
					local9 = local21.aBoolean56;
					local7 = local21.anInt814;
				}
			} else if (local19.anInt802 != this.anInt2934) {
				local9 = local19.aBoolean56;
				local7 = local19.anInt814;
			}
		}
		if (local7 == -1) {
			this.aClass189_2 = null;
			return;
		}
		this.aClass3_3 = null;
		if (this.aClass189_2 == null || local7 != this.aClass189_2.anInt5152) {
			this.aClass189_2 = Static351.aClass175_3.method4107(local7);
		} else if (this.aClass189_2.anInt5165 == 0) {
			return;
		}
		if (this.aClass189_2.anIntArray639 == null) {
			this.aClass189_2 = null;
			return;
		}
		if (local9) {
			this.anInt2933 = (int) (Math.random() * (double) this.aClass189_2.anIntArray639.length);
			this.anInt2940 = (int) ((double) this.aClass189_2.anIntArray640[this.anInt2933] * Math.random()) + 1;
		} else {
			this.anInt2940 = 1;
			this.anInt2933 = 0;
		}
		this.anInt2939 = this.anInt2933 + 1;
		if (this.anInt2939 < 0 || this.anInt2939 >= this.aClass189_2.anIntArray639.length) {
			this.anInt2939 = -1;
		}
		this.anInt2938 = Static295.anInt5281 - this.anInt2940;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!km;Z)V")
	public void method2686(@OriginalArg(0) Class82 arg0) {
		this.method2677(this.anInt2937, true, true, this.anInt2920, arg0, 131072);
	}

	@OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass22_Sub6_3 != null) {
			this.aClass22_Sub6_3.method3561();
		}
	}
}
