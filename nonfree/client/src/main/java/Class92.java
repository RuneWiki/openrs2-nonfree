import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class92 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!t;")
	private Class105 aClass105_3;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!sm;")
	private Class223 aClass223_2;

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "Lclient!mq;")
	public Class4_Sub7 aClass4_Sub7_4;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
	private int anInt2673;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "Lclient!ba;")
	private Class1_Sub2_Sub1 aClass1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "[Z")
	private boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
	private int anInt2684;

	@OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
	private int anInt2687;

	@OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
	private int anInt2691;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
	private int anInt2668 = -1;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	private int anInt2674 = -32768;

	@OriginalMember(owner = "client!gp", name = "H", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!gp", name = "E", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
	private int anInt2682 = -1;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
	public final int anInt2686;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
	private int anInt2680;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	public final int anInt2672;

	@OriginalMember(owner = "client!gp", name = "z", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
	public final int anInt2679;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
	private int anInt2675;

	@OriginalMember(owner = "client!gp", name = "D", descriptor = "Z")
	private final boolean aBoolean161;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!ya;Lclient!jt;IIIIIIZI)V")
	public Class92(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte56 = (byte) arg5;
		this.anInt2686 = arg2;
		this.anInt2680 = arg6;
		this.anInt2672 = arg1.anInt3530;
		this.aBoolean162 = arg8;
		this.aByte57 = (byte) arg4;
		this.anInt2679 = arg3;
		this.anInt2675 = arg7;
		this.aBoolean161 = arg0.method4568() && arg1.aBoolean214 && !this.aBoolean162;
		if (arg9 != -1) {
			this.aBoolean163 = true;
		}
		this.method2318(arg9);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z")
	public boolean method2310() {
		return this.aBoolean161;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)V")
	public void method2311(@OriginalArg(0) int arg0) {
		this.aBoolean163 = true;
		this.method2318(arg0);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)I")
	public int method2312() {
		return this.anInt2674;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ya;IILclient!t;ZIII)V")
	public void method2313(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class105 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class244[] local14 = arg3.method3535();
		@Pc(17) Class57[] local17 = arg3.method3530();
		if ((this.aClass4_Sub7_4 == null || this.aClass4_Sub7_4.aBoolean308) && (local14 != null || local17 != null)) {
			@Pc(34) Class129 local34 = Static349.aClass115_4.method2766(this.anInt2672);
			if (local34.anIntArray310 != null) {
				local34 = local34.method3031(Static394.aClass23_1);
			}
			if (local34 != null) {
				this.aClass4_Sub7_4 = new Class4_Sub7(Static378.anInt4244);
			}
		}
		if (this.aClass4_Sub7_4 == null) {
			return;
		}
		if (arg4) {
			this.aClass4_Sub7_4.method3779(arg0, (long) Static378.anInt4244, local14, local17);
		} else {
			this.aClass4_Sub7_4.method3783((long) Static378.anInt4244);
		}
		this.aClass4_Sub7_4.method3784(this.aByte57, arg5, arg1, arg6, arg2);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(III)V")
	private void method2314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass223_2 == null) {
				if (this.aBoolean163) {
					return;
				}
				this.method2318(-1);
				if (this.aClass223_2 == null) {
					return;
				}
			}
			@Pc(39) int local39 = Static378.anInt4244 - this.anInt2687;
			if (local39 > 100 && this.aClass223_2.anInt6055 > 0) {
				@Pc(58) int local58 = this.aClass223_2.anIntArray557.length - this.aClass223_2.anInt6055;
				while (this.anInt2673 < local58 && this.aClass223_2.anIntArray559[this.anInt2673] < local39) {
					local39 -= this.aClass223_2.anIntArray559[this.anInt2673];
					this.anInt2673++;
				}
				if (local58 <= this.anInt2673) {
					@Pc(97) int local97 = 0;
					for (@Pc(99) int local99 = local58; local99 < this.aClass223_2.anIntArray557.length; local99++) {
						local97 += this.aClass223_2.anIntArray559[local99];
					}
					local39 %= local97;
				}
				this.anInt2691 = this.anInt2673 + 1;
				if (this.aClass223_2.anIntArray557.length <= this.anInt2691) {
					this.anInt2691 -= this.aClass223_2.anInt6055;
					if (this.anInt2691 < 0 || this.anInt2691 >= this.aClass223_2.anIntArray557.length) {
						this.anInt2691 = -1;
					}
				}
			}
			while (local39 > this.aClass223_2.anIntArray559[this.anInt2673]) {
				Static172.method2762(this.aClass223_2, arg1, false, this.anInt2673, this.aByte57, arg0);
				local39 -= this.aClass223_2.anIntArray559[this.anInt2673];
				this.anInt2673++;
				if (this.anInt2673 >= this.aClass223_2.anIntArray557.length) {
					this.anInt2673 -= this.aClass223_2.anInt6055;
					if (this.anInt2673 < 0 || this.aClass223_2.anIntArray557.length <= this.anInt2673) {
						this.aClass223_2 = null;
						continue label80;
					}
				}
				this.anInt2691 = this.anInt2673 + 1;
				if (this.anInt2691 >= this.aClass223_2.anIntArray557.length) {
					this.anInt2691 -= this.aClass223_2.anInt6055;
					if (this.anInt2691 < 0 || this.aClass223_2.anIntArray557.length <= this.anInt2691) {
						this.anInt2691 = -1;
					}
				}
			}
			this.anInt2687 = Static378.anInt4244 - local39;
			this.anInt2684 = local39;
			return;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ya;I)V")
	public void method2315(@OriginalArg(0) Class39 arg0) {
		if (this.aClass1_Sub2_Sub1_3 != null) {
			Static205.method3297(this.aClass1_Sub2_Sub1_3, this.aByte56, this.anInt2680, this.anInt2675, this.aBooleanArray21);
			this.aClass1_Sub2_Sub1_3 = null;
			this.aBooleanArray21 = null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)V")
	private void method2318(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(26) Class129 local26 = Static349.aClass115_4.method2766(this.anInt2672);
			@Pc(28) Class129 local28 = local26;
			if (local26.anIntArray310 != null) {
				local26 = local26.method3031(Static394.aClass23_1);
			}
			if (local26 == null) {
				return;
			}
			if (local28 == local26) {
				local28 = null;
			}
			if (local26.anIntArray312 != null) {
				if (this.aClass223_2 != null && local26.method3016(this.aClass223_2.anInt6043)) {
					return;
				}
				local7 = local26.method3017();
				if (this.anInt2668 != local26.anInt3530) {
					local9 = local26.aBoolean219;
				}
			} else if (local26.anInt3496 == -1) {
				if (local28 != null && local28.anIntArray312 != null) {
					if (this.aClass223_2 != null && local28.method3016(this.aClass223_2.anInt6043)) {
						return;
					}
					local7 = local28.method3017();
					if (this.anInt2668 != local28.anInt3530) {
						local9 = local28.aBoolean219;
					}
				} else if (local28 != null && local28.anInt3496 != -1 && local28.anInt3530 != this.anInt2668) {
					local9 = local28.aBoolean219;
					local7 = local28.anInt3496;
				}
			} else if (this.anInt2668 != local26.anInt3530) {
				local9 = local26.aBoolean219;
				local7 = local26.anInt3496;
			}
		}
		if (local7 == -1) {
			this.aClass223_2 = null;
			return;
		}
		this.aClass105_3 = null;
		if (this.aClass223_2 == null || this.aClass223_2.anInt6043 != local7) {
			this.aClass223_2 = Static293.aClass127_1.method2975(local7);
		} else if (this.aClass223_2.anInt6050 == 0) {
			return;
		}
		if (this.aClass223_2.anIntArray557 == null) {
			this.aClass223_2 = null;
			return;
		}
		if (local9) {
			this.anInt2673 = (int) (Math.random() * (double) this.aClass223_2.anIntArray557.length);
			this.anInt2684 = (int) (Math.random() * (double) this.aClass223_2.anIntArray559[this.anInt2673]) + 1;
		} else {
			this.anInt2684 = 1;
			this.anInt2673 = 0;
		}
		this.anInt2691 = this.anInt2673 + 1;
		if (this.anInt2691 < 0 || this.aClass223_2.anIntArray557.length <= this.anInt2691) {
			this.anInt2691 = -1;
		}
		this.anInt2687 = Static378.anInt4244 - this.anInt2684;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIZLclient!ya;BZ)Lclient!t;")
	public Class105 method2319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(17) Class129 local17 = Static349.aClass115_4.method2766(this.anInt2672);
		if (local17.anIntArray310 != null) {
			local17 = local17.method3031(Static394.aClass23_1);
		}
		if (local17 == null) {
			this.method2315(arg4);
			this.anInt2668 = -1;
			this.anInt2682 = this.anInt2673;
			return null;
		}
		if (!this.aBoolean163 && local17.anInt3530 != this.anInt2668) {
			this.aClass105_3 = null;
			this.method2318(-1);
		}
		this.method2314(arg1, arg0);
		@Pc(77) boolean local77 = arg3 & this.aBoolean161 & Static38.aClass135_Sub1_1.method4236(Static143.anInt2766) != 0;
		@Pc(117) boolean local117 = local77 & (this.anInt2668 != local17.anInt3530 || (this.anInt2673 != this.anInt2682 || this.aClass223_2 != null && (this.aClass223_2.aBoolean421 || Static21.aBoolean16) && this.anInt2673 != this.anInt2691) && Static38.aClass135_Sub1_1.method4236(Static143.anInt2766) >= 2);
		if (arg5 && !local117) {
			this.anInt2668 = local17.anInt3530;
			this.anInt2682 = this.anInt2673;
			return null;
		}
		if (local117) {
			Static205.method3297(this.aClass1_Sub2_Sub1_3, this.aByte56, this.anInt2680, this.anInt2675, this.aBooleanArray21);
		}
		@Pc(149) Class149 local149 = Static105.aClass149Array1[this.aByte56];
		@Pc(156) Class149 local156;
		if (this.aBoolean162) {
			local156 = Static269.aClass149Array2[0];
		} else {
			local156 = this.aByte56 < 3 ? Static105.aClass149Array1[this.aByte56 + 1] : null;
		}
		@Pc(175) Class105 local175 = null;
		if (this.aClass223_2 != null) {
			if (local117) {
				arg2 |= 0x40000;
			}
			local175 = local17.method3026(local149.a(this.anInt2680, this.anInt2675), this.aClass223_2, arg4, this.anInt2675, this.anInt2686 == 11 ? this.anInt2679 + 4 : this.anInt2679, this.anInt2691, local156, this.anInt2680, this.anInt2686 == 11 ? 10 : this.anInt2686, this.anInt2673, arg2, this.anInt2684, local149);
			if (local175 == null) {
				this.aClass1_Sub2_Sub1_3 = null;
				this.aBooleanArray21 = null;
				this.anInt2674 = 0;
			} else {
				if (local117) {
					if (this.aBooleanArray21 == null) {
						this.aBooleanArray21 = new boolean[4];
					}
					this.aClass1_Sub2_Sub1_3 = local175.fa(this.aClass1_Sub2_Sub1_3);
					Static253.method3786(this.aClass1_Sub2_Sub1_3, this.aByte56, arg0, arg1, this.aBooleanArray21);
				}
				this.anInt2674 = local175.MA();
			}
			this.aClass105_3 = null;
		} else if (this.aClass105_3 != null && arg2 == (arg2 & this.aClass105_3.P()) && local17.anInt3530 == this.anInt2668) {
			local175 = this.aClass105_3;
		} else {
			if (this.aClass105_3 != null) {
				arg2 |= this.aClass105_3.P();
			}
			@Pc(345) Class193 local345 = local17.method3022(arg2, local149, local117, this.anInt2675, arg4, this.anInt2686 == 11 ? 10 : this.anInt2686, this.anInt2686 == 11 ? this.anInt2679 + 4 : this.anInt2679, local156, local149.a(this.anInt2680, this.anInt2675), this.anInt2680);
			if (local345 == null) {
				this.aClass1_Sub2_Sub1_3 = null;
				this.aBooleanArray21 = null;
				this.aClass105_3 = null;
				this.anInt2674 = 0;
			} else {
				local175 = local345.aClass105_6;
				this.aClass105_3 = local345.aClass105_6;
				if (local117) {
					this.aBooleanArray21 = null;
					this.aClass1_Sub2_Sub1_3 = local345.aClass1_Sub2_Sub1_5;
					Static253.method3786(this.aClass1_Sub2_Sub1_3, this.aByte56, arg0, arg1, null);
				}
				this.anInt2674 = local175.MA();
			}
		}
		this.anInt2682 = this.anInt2673;
		this.anInt2668 = local17.anInt3530;
		this.anInt2680 = arg0;
		this.anInt2675 = arg1;
		return local175;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Lclient!ya;I)V")
	public void method2321(@OriginalArg(0) Class39 arg0) {
		this.method2319(this.anInt2680, this.anInt2675, 262144, true, arg0, true);
	}

	@OriginalMember(owner = "client!gp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub7_4 != null) {
			this.aClass4_Sub7_4.method3776();
		}
	}
}
