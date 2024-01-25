import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class353 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	private int anInt9566;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!dv;")
	private Class77 aClass77_3;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "[Z")
	private boolean[] aBooleanArray40;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!w;")
	private Class4_Sub7_Sub3 aClass4_Sub7_Sub3_6;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!ba;")
	private Class9 aClass9_7;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	private int anInt9575;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private int anInt9576;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Lclient!hv;")
	public Class26_Sub3 aClass26_Sub3_8;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
	private int anInt9586;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	private int anInt9567 = -32768;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	private int anInt9572 = -1;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	private int anInt9570 = -1;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Z")
	private boolean aBoolean674 = false;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	private int anInt9582 = -1;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
	public final int anInt9584;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	public final int anInt9583;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	private int anInt9574;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "B")
	private final byte aByte108;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
	public final int anInt9579;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "B")
	private final byte aByte107;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	private int anInt9564;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "Z")
	private final boolean aBoolean675;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIIIZI)V")
	public Class353(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt9584 = arg2;
		this.anInt9583 = arg3;
		this.anInt9574 = arg6;
		this.aByte108 = (byte) arg5;
		this.anInt9579 = arg1.anInt605;
		this.aBoolean674 = arg8;
		this.aByte107 = (byte) arg4;
		this.anInt9564 = arg7;
		this.aBoolean675 = arg0.method6789() && arg1.aBoolean57 && !this.aBoolean674;
		if (arg9 != -1) {
			this.aBoolean673 = true;
		}
		this.method7863(arg9);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!q;ILclient!oa;ZZLclient!ba;III)V")
	public void method7858(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class181[] local6 = arg4.method4019();
		@Pc(9) Class89[] local9 = arg4.method4015();
		if ((this.aClass26_Sub3_8 == null || this.aClass26_Sub3_8.aBoolean320) && (local6 != null || local9 != null)) {
			@Pc(26) Class25 local26 = Static553.aClass288_4.method6419(this.anInt9579);
			if (local26.anIntArray115 != null) {
				local26 = local26.method578(Static511.aClass335_2);
			}
			if (local26 != null) {
				this.aClass26_Sub3_8 = Static207.method3660(Static237.anInt7561, true);
			}
		}
		if (this.aClass26_Sub3_8 == null) {
			return;
		}
		arg4.method4011(arg0);
		if (arg3) {
			this.aClass26_Sub3_8.method3659(arg2, (long) Static237.anInt7561, local6, local9);
		} else {
			this.aClass26_Sub3_8.method3665((long) Static237.anInt7561);
		}
		this.aClass26_Sub3_8.method3653(this.aByte107, arg7, arg5, arg1, arg6);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLclient!oa;)V")
	public void method7860(@OriginalArg(1) Class66 arg0) {
		if (this.aClass4_Sub7_Sub3_6 != null) {
			Static159.method3156(this.aClass4_Sub7_Sub3_6, this.aByte108, this.anInt9574, this.anInt9564, this.aBooleanArray40);
			this.aBooleanArray40 = null;
			this.aClass4_Sub7_Sub3_6 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass26_Sub3_8 != null) {
			this.aClass26_Sub3_8.method3661();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!oa;IIZZII)Lclient!ba;")
	public Class9 method7862(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(11) Class25 local11 = Static553.aClass288_4.method6419(this.anInt9579);
		if (local11.anIntArray115 != null) {
			local11 = local11.method578(Static511.aClass335_2);
		}
		if (local11 == null) {
			this.method7860(arg0);
			this.anInt9570 = -1;
			this.anInt9572 = -1;
			this.anInt9582 = -1;
			return null;
		}
		if (!this.aBoolean673 && this.anInt9572 != local11.anInt605) {
			this.aClass9_7 = null;
			this.method7863(-1);
		}
		this.method7864(arg5, arg1);
		if (arg4) {
			@Pc(86) boolean local86 = arg4 & this.aBoolean675 & Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994) != 0;
			arg4 = local86 & (local11.anInt605 != this.anInt9570 || this.aClass77_3 != null && Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994) >= 2 && (this.anInt9582 != this.anInt9586 || (this.aClass77_3.aBoolean205 || Static244.aBoolean365) && this.anInt9586 != this.anInt9576));
		}
		if (arg3 && !arg4) {
			this.anInt9572 = local11.anInt605;
			return null;
		}
		if (arg4) {
			Static159.method3156(this.aClass4_Sub7_Sub3_6, this.aByte108, this.anInt9574, this.anInt9564, this.aBooleanArray40);
			this.anInt9570 = -1;
			this.anInt9582 = -1;
		}
		@Pc(162) Class16 local162 = Static112.aClass16Array3[this.aByte108];
		@Pc(169) Class16 local169;
		if (this.aBoolean674) {
			local169 = Static45.aClass16Array1[0];
		} else {
			local169 = this.aByte108 < 3 ? Static112.aClass16Array3[this.aByte108 + 1] : null;
		}
		@Pc(186) Class9 local186 = null;
		if (this.aClass77_3 != null) {
			if (arg4) {
				arg2 |= 0x40000;
			}
			local186 = local11.method561(local169, local162.sa(this.anInt9574, this.anInt9564), this.anInt9566, local162, this.anInt9574, this.anInt9584 == 11 ? this.anInt9583 + 4 : this.anInt9583, this.aClass77_3, this.anInt9576, arg0, this.anInt9564, this.anInt9586, arg2, this.anInt9584 == 11 ? 10 : this.anInt9584);
			if (local186 == null) {
				this.anInt9567 = 0;
				this.aClass4_Sub7_Sub3_6 = null;
				this.aBooleanArray40 = null;
			} else {
				if (arg4) {
					if (this.aBooleanArray40 == null) {
						this.aBooleanArray40 = new boolean[4];
					}
					this.aClass4_Sub7_Sub3_6 = local186.Z(this.aClass4_Sub7_Sub3_6);
					Static55.method846(this.aClass4_Sub7_Sub3_6, this.aByte108, arg5, arg1, this.aBooleanArray40);
					this.anInt9582 = this.anInt9586;
					this.anInt9570 = local11.anInt605;
				}
				this.anInt9567 = local186.DA();
			}
			this.aClass9_7 = null;
		} else if (this.aClass9_7 != null && arg2 == (arg2 & this.aClass9_7.h()) && local11.anInt605 == this.anInt9572) {
			local186 = this.aClass9_7;
		} else {
			if (this.aClass9_7 != null) {
				arg2 |= this.aClass9_7.h();
			}
			@Pc(364) Class339 local364 = local11.method564(local169, this.anInt9574, this.anInt9564, arg2, local162.sa(this.anInt9574, this.anInt9564), arg0, arg4, this.anInt9584 == 11 ? 10 : this.anInt9584, local162, this.anInt9584 == 11 ? this.anInt9583 + 4 : this.anInt9583);
			if (local364 == null) {
				this.aClass9_7 = null;
				this.anInt9567 = 0;
				this.aBooleanArray40 = null;
				this.aClass4_Sub7_Sub3_6 = null;
			} else {
				local186 = local364.aClass9_6;
				this.aClass9_7 = local364.aClass9_6;
				if (arg4) {
					this.aBooleanArray40 = null;
					this.aClass4_Sub7_Sub3_6 = local364.aClass4_Sub7_Sub3_5;
					Static55.method846(this.aClass4_Sub7_Sub3_6, this.aByte108, arg5, arg1, null);
					this.anInt9582 = -1;
					this.anInt9570 = local11.anInt605;
				}
				this.anInt9567 = local186.DA();
			}
		}
		this.anInt9564 = arg1;
		this.anInt9572 = local11.anInt605;
		this.anInt9574 = arg5;
		return local186;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V")
	private void method7863(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(13) boolean local13 = false;
		if (arg0 == -1) {
			@Pc(22) Class25 local22 = Static553.aClass288_4.method6419(this.anInt9579);
			@Pc(24) Class25 local24 = local22;
			if (local22.anIntArray115 != null) {
				local22 = local22.method578(Static511.aClass335_2);
			}
			if (local22 == null) {
				return;
			}
			if (local24 == local22) {
				local24 = null;
			}
			if (local22.anIntArray114 != null) {
				if (this.aClass77_3 != null && local22.method566(this.aClass77_3.anInt2574)) {
					return;
				}
				local7 = local22.method565();
				if (this.anInt9572 != local22.anInt605) {
					local13 = local22.aBoolean59;
				}
			} else if (local22.anInt645 == -1) {
				if (local24 != null && local24.anIntArray114 != null) {
					if (this.aClass77_3 != null && local24.method566(this.aClass77_3.anInt2574)) {
						return;
					}
					local7 = local24.method565();
					if (local24.anInt605 != this.anInt9572) {
						local13 = local24.aBoolean59;
					}
				} else if (local24 != null && local24.anInt645 != -1 && local24.anInt605 != this.anInt9572) {
					local13 = local24.aBoolean59;
					local7 = local24.anInt645;
				}
			} else if (local22.anInt605 != this.anInt9572) {
				local13 = local22.aBoolean59;
				local7 = local22.anInt645;
			}
		}
		if (local7 == -1) {
			this.aClass77_3 = null;
			return;
		}
		this.aClass9_7 = null;
		if (this.aClass77_3 == null || local7 != this.aClass77_3.anInt2574) {
			this.aClass77_3 = Static168.aClass327_2.method7326(local7);
		} else if (this.aClass77_3.anInt2586 == 0) {
			return;
		}
		if (this.aClass77_3.anIntArray238 == null) {
			this.aClass77_3 = null;
			return;
		}
		if (local13) {
			this.anInt9586 = (int) ((double) this.aClass77_3.anIntArray238.length * Math.random());
			this.anInt9566 = (int) (Math.random() * (double) this.aClass77_3.anIntArray240[this.anInt9586]) + 1;
		} else {
			this.anInt9586 = 0;
			this.anInt9566 = 1;
		}
		this.anInt9576 = this.anInt9586 + 1;
		if (this.anInt9576 < 0 || this.anInt9576 >= this.aClass77_3.anIntArray238.length) {
			this.anInt9576 = -1;
		}
		this.anInt9575 = Static237.anInt7561 - this.anInt9566;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZ)V")
	private void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass77_3 == null) {
				if (this.aBoolean673) {
					return;
				}
				this.method7863(-1);
				if (this.aClass77_3 == null) {
					return;
				}
			}
			@Pc(39) int local39 = Static237.anInt7561 - this.anInt9575;
			if (local39 > 100 && this.aClass77_3.anInt2575 > 0) {
				@Pc(58) int local58 = this.aClass77_3.anIntArray238.length - this.aClass77_3.anInt2575;
				while (this.anInt9586 < local58 && local39 > this.aClass77_3.anIntArray240[this.anInt9586]) {
					local39 -= this.aClass77_3.anIntArray240[this.anInt9586];
					this.anInt9586++;
				}
				if (this.anInt9586 >= local58) {
					@Pc(101) int local101 = 0;
					for (@Pc(103) int local103 = local58; local103 < this.aClass77_3.anIntArray238.length; local103++) {
						local101 += this.aClass77_3.anIntArray240[local103];
					}
					local39 %= local101;
				}
				this.anInt9576 = this.anInt9586 + 1;
				if (this.aClass77_3.anIntArray238.length <= this.anInt9576) {
					this.anInt9576 -= this.aClass77_3.anInt2575;
					if (this.anInt9576 < 0 || this.aClass77_3.anIntArray238.length <= this.anInt9576) {
						this.anInt9576 = -1;
					}
				}
			}
			while (local39 > this.aClass77_3.anIntArray240[this.anInt9586]) {
				Static240.method4084(this.aByte107, arg0, arg1, this.anInt9586, this.aClass77_3, false);
				local39 -= this.aClass77_3.anIntArray240[this.anInt9586];
				this.anInt9586++;
				if (this.anInt9586 >= this.aClass77_3.anIntArray238.length) {
					this.anInt9586 -= this.aClass77_3.anInt2575;
					if (this.anInt9586 < 0 || this.anInt9586 >= this.aClass77_3.anIntArray238.length) {
						this.aClass77_3 = null;
						continue label80;
					}
				}
				this.anInt9576 = this.anInt9586 + 1;
				if (this.aClass77_3.anIntArray238.length <= this.anInt9576) {
					this.anInt9576 -= this.aClass77_3.anInt2575;
					if (this.anInt9576 < 0 || this.anInt9576 >= this.aClass77_3.anIntArray238.length) {
						this.anInt9576 = -1;
					}
				}
			}
			this.anInt9566 = local39;
			this.anInt9575 = Static237.anInt7561 - local39;
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Z")
	public boolean method7865() {
		return this.aBoolean675;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)I")
	public int method7866() {
		return this.anInt9567;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
	public void method7867(@OriginalArg(0) int arg0) {
		this.aBoolean673 = true;
		this.method7863(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!oa;)V")
	public void method7868(@OriginalArg(1) Class66 arg0) {
		this.method7862(arg0, this.anInt9564, 262144, true, true, this.anInt9574);
	}
}
