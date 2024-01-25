import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class133 {

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "Lclient!i;")
	private Class10_Sub1_Sub7 aClass10_Sub1_Sub7_1;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "[Z")
	private boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "Lclient!oi;")
	public Class40_Sub6 aClass40_Sub6_4;

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
	private int anInt3975;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
	private int anInt3976;

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
	private int anInt3977;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "Lclient!jv;")
	private Class137 aClass137_2;

	@OriginalMember(owner = "client!jp", name = "M", descriptor = "Lclient!e;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
	private int anInt3983;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
	private int anInt3966 = -1;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	private int anInt3958 = -1;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
	private int anInt3980 = -32768;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
	public final int anInt3964;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
	public final int anInt3978;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
	public final int anInt3962;

	@OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
	private int anInt3981;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
	private int anInt3969;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIIIZI)V")
	public Class133(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aBoolean268 = arg8;
		this.anInt3964 = arg1.anInt3798;
		this.aByte52 = (byte) arg5;
		this.anInt3978 = arg2;
		this.anInt3962 = arg3;
		this.anInt3981 = arg7;
		this.anInt3969 = arg6;
		this.aByte51 = (byte) arg4;
		this.aBoolean266 = arg0.method5867() && arg1.aBoolean253 && !this.aBoolean268;
		if (arg9 != -1) {
			this.aBoolean267 = true;
		}
		this.method3151(arg9);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIB)V")
	private void method3148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass137_2 == null) {
				if (this.aBoolean267) {
					return;
				}
				this.method3151(-1);
				if (this.aClass137_2 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static400.anInt6752 - this.anInt3976;
			if (local30 > 100 && this.aClass137_2.anInt4046 > 0) {
				@Pc(48) int local48 = this.aClass137_2.anIntArray403.length - this.aClass137_2.anInt4046;
				while (this.anInt3983 < local48 && local30 > this.aClass137_2.anIntArray404[this.anInt3983]) {
					local30 -= this.aClass137_2.anIntArray404[this.anInt3983];
					this.anInt3983++;
				}
				if (this.anInt3983 >= local48) {
					@Pc(83) int local83 = 0;
					for (@Pc(85) int local85 = local48; local85 < this.aClass137_2.anIntArray403.length; local85++) {
						local83 += this.aClass137_2.anIntArray404[local85];
					}
					local30 %= local83;
				}
				this.anInt3977 = this.anInt3983 + 1;
				if (this.aClass137_2.anIntArray403.length <= this.anInt3977) {
					this.anInt3977 -= this.aClass137_2.anInt4046;
					if (this.anInt3977 < 0 || this.aClass137_2.anIntArray403.length <= this.anInt3977) {
						this.anInt3977 = -1;
					}
				}
			}
			while (this.aClass137_2.anIntArray404[this.anInt3983] < local30) {
				Static302.method4200(this.aClass137_2, arg1, arg0, this.aByte51, this.anInt3983, false);
				local30 -= this.aClass137_2.anIntArray404[this.anInt3983];
				this.anInt3983++;
				if (this.aClass137_2.anIntArray403.length <= this.anInt3983) {
					this.anInt3983 -= this.aClass137_2.anInt4046;
					if (this.anInt3983 < 0 || this.aClass137_2.anIntArray403.length <= this.anInt3983) {
						this.aClass137_2 = null;
						continue label80;
					}
				}
				this.anInt3977 = this.anInt3983 + 1;
				if (this.aClass137_2.anIntArray403.length <= this.anInt3977) {
					this.anInt3977 -= this.aClass137_2.anInt4046;
					if (this.anInt3977 < 0 || this.anInt3977 >= this.aClass137_2.anIntArray403.length) {
						this.anInt3977 = -1;
					}
				}
			}
			this.anInt3976 = Static400.anInt6752 - local30;
			this.anInt3975 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIILclient!za;ZZ)Lclient!e;")
	public Class63 method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class126 local11 = Static342.aClass237_4.method5212(this.anInt3964);
		if (local11.anIntArray380 != null) {
			local11 = local11.method3009(Static329.aClass201_9);
		}
		if (local11 == null) {
			this.method3154(arg3);
			this.anInt3958 = -1;
			this.anInt3966 = this.anInt3983;
			return null;
		}
		if (!this.aBoolean267 && this.anInt3958 != local11.anInt3798) {
			this.aClass63_1 = null;
			this.method3151(-1);
		}
		this.method3148(arg1, arg0);
		@Pc(72) boolean local72 = arg4 & this.aBoolean266 & Static361.aClass85_Sub1_1.method2106(Static423.anInt7114) != 0;
		@Pc(122) boolean local122 = local72 & (this.anInt3958 != local11.anInt3798 || (this.anInt3966 != this.anInt3983 || this.aClass137_2 != null && (this.aClass137_2.aBoolean271 || Static102.aBoolean131) && this.anInt3977 != this.anInt3983) && Static361.aClass85_Sub1_1.method2106(Static423.anInt7114) >= 2);
		if (arg5 && !local122) {
			this.anInt3958 = local11.anInt3798;
			this.anInt3966 = this.anInt3983;
			return null;
		}
		if (local122) {
			Static116.method2047(this.aClass10_Sub1_Sub7_1, this.aByte52, this.anInt3969, this.anInt3981, this.aBooleanArray10);
		}
		@Pc(154) Class154 local154 = Static332.aClass154Array3[this.aByte52];
		@Pc(170) Class154 local170;
		if (this.aBoolean268) {
			local170 = Static256.aClass154Array2[0];
		} else {
			local170 = this.aByte52 < 3 ? Static332.aClass154Array3[this.aByte52 + 1] : null;
		}
		@Pc(183) Class63 local183 = null;
		if (this.aClass137_2 != null) {
			if (local122) {
				arg2 |= 0x40000;
			}
			local183 = local11.method3007(arg2, arg3, local170, this.anInt3977, this.aClass137_2, this.anInt3969, local154.ca(this.anInt3969, this.anInt3981), local154, this.anInt3975, this.anInt3978 == 11 ? 10 : this.anInt3978, this.anInt3983, this.anInt3981, this.anInt3978 == 11 ? this.anInt3962 + 4 : this.anInt3962);
			if (local183 == null) {
				this.aClass10_Sub1_Sub7_1 = null;
				this.anInt3980 = 0;
				this.aBooleanArray10 = null;
			} else {
				if (local122) {
					if (this.aBooleanArray10 == null) {
						this.aBooleanArray10 = new boolean[4];
					}
					this.aClass10_Sub1_Sub7_1 = local183.EA(this.aClass10_Sub1_Sub7_1);
					Static419.method5516(this.aClass10_Sub1_Sub7_1, this.aByte52, arg0, arg1, this.aBooleanArray10);
				}
				this.anInt3980 = local183.B();
			}
			this.aClass63_1 = null;
		} else if (this.aClass63_1 != null && (arg2 & this.aClass63_1.RA()) == arg2 && local11.anInt3798 == this.anInt3958) {
			local183 = this.aClass63_1;
		} else {
			if (this.aClass63_1 != null) {
				arg2 |= this.aClass63_1.RA();
			}
			@Pc(352) Class210 local352 = local11.method3014(local122, this.anInt3978 == 11 ? this.anInt3962 + 4 : this.anInt3962, this.anInt3969, this.anInt3981, local154.ca(this.anInt3969, this.anInt3981), arg2, local154, arg3, this.anInt3978 == 11 ? 10 : this.anInt3978, local170);
			if (local352 == null) {
				this.aClass63_1 = null;
				this.aBooleanArray10 = null;
				this.aClass10_Sub1_Sub7_1 = null;
				this.anInt3980 = 0;
			} else {
				local183 = local352.aClass63_5;
				this.aClass63_1 = local352.aClass63_5;
				if (local122) {
					this.aClass10_Sub1_Sub7_1 = local352.aClass10_Sub1_Sub7_4;
					this.aBooleanArray10 = null;
					Static419.method5516(this.aClass10_Sub1_Sub7_1, this.aByte52, arg0, arg1, null);
				}
				this.anInt3980 = local183.B();
			}
		}
		this.anInt3966 = this.anInt3983;
		this.anInt3981 = arg1;
		this.anInt3958 = local11.anInt3798;
		this.anInt3969 = arg0;
		return local183;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)V")
	private void method3151(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class126 local19 = Static342.aClass237_4.method5212(this.anInt3964);
			@Pc(21) Class126 local21 = local19;
			if (local19.anIntArray380 != null) {
				local19 = local19.method3009(Static329.aClass201_9);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray382 != null) {
				if (this.aClass137_2 != null && local19.method3020(this.aClass137_2.anInt4041)) {
					return;
				}
				local7 = local19.method3015();
				if (local19.anInt3798 != this.anInt3958) {
					local9 = local19.aBoolean242;
				}
			} else if (local19.anInt3761 == -1) {
				if (local21 != null && local21.anIntArray382 != null) {
					if (this.aClass137_2 != null && local21.method3020(this.aClass137_2.anInt4041)) {
						return;
					}
					local7 = local21.method3015();
					if (this.anInt3958 != local21.anInt3798) {
						local9 = local21.aBoolean242;
					}
				} else if (local21 != null && local21.anInt3761 != -1 && this.anInt3958 != local21.anInt3798) {
					local7 = local21.anInt3761;
					local9 = local21.aBoolean242;
				}
			} else if (this.anInt3958 != local19.anInt3798) {
				local7 = local19.anInt3761;
				local9 = local19.aBoolean242;
			}
		}
		if (local7 == -1) {
			this.aClass137_2 = null;
			return;
		}
		this.aClass63_1 = null;
		if (this.aClass137_2 == null || this.aClass137_2.anInt4041 != local7) {
			this.aClass137_2 = Static281.aClass98_3.method2405(local7);
		} else if (this.aClass137_2.anInt4039 == 0) {
			return;
		}
		if (this.aClass137_2.anIntArray403 == null) {
			this.aClass137_2 = null;
			return;
		}
		if (local9) {
			this.anInt3983 = (int) ((double) this.aClass137_2.anIntArray403.length * Math.random());
			this.anInt3975 = (int) ((double) this.aClass137_2.anIntArray404[this.anInt3983] * Math.random()) + 1;
		} else {
			this.anInt3983 = 0;
			this.anInt3975 = 1;
		}
		this.anInt3977 = this.anInt3983 + 1;
		if (this.anInt3977 < 0 || this.aClass137_2.anIntArray403.length <= this.anInt3977) {
			this.anInt3977 = -1;
		}
		this.anInt3976 = Static400.anInt6752 - this.anInt3975;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIILclient!e;ZLclient!za;)V")
	public void method3152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class63 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class50 arg6) {
		@Pc(10) Class78[] local10 = arg4.method6094();
		@Pc(13) Class141[] local13 = arg4.method6098();
		if ((this.aClass40_Sub6_4 == null || this.aClass40_Sub6_4.aBoolean346) && (local10 != null || local13 != null)) {
			@Pc(30) Class126 local30 = Static342.aClass237_4.method5212(this.anInt3964);
			if (local30.anIntArray380 != null) {
				local30 = local30.method3009(Static329.aClass201_9);
			}
			if (local30 != null) {
				this.aClass40_Sub6_4 = new Class40_Sub6(Static400.anInt6752);
			}
		}
		if (this.aClass40_Sub6_4 == null) {
			return;
		}
		if (arg5) {
			this.aClass40_Sub6_4.method4099(arg6, (long) Static400.anInt6752, local10, local13);
		} else {
			this.aClass40_Sub6_4.method4094((long) Static400.anInt6752);
		}
		this.aClass40_Sub6_4.method4091(this.aByte51, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Z")
	public boolean method3153() {
		return this.aBoolean266;
	}

	@OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass40_Sub6_4 != null) {
			this.aClass40_Sub6_4.method4097();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!za;)V")
	public void method3154(@OriginalArg(1) Class50 arg0) {
		if (this.aClass10_Sub1_Sub7_1 != null) {
			Static116.method2047(this.aClass10_Sub1_Sub7_1, this.aByte52, this.anInt3969, this.anInt3981, this.aBooleanArray10);
			this.aBooleanArray10 = null;
			this.aClass10_Sub1_Sub7_1 = null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)I")
	public int method3158() {
		return this.anInt3980;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(II)V")
	public void method3160(@OriginalArg(1) int arg0) {
		this.aBoolean267 = true;
		this.method3151(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!za;I)V")
	public void method3161(@OriginalArg(0) Class50 arg0) {
		this.method3149(this.anInt3969, this.anInt3981, 262144, arg0, true, true);
	}
}
