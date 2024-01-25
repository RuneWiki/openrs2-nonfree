import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class169 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!ka;")
	private Class180 aClass180_6;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	private int anInt4348;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "Lclient!r;")
	private Class5_Sub4_Sub10 aClass5_Sub4_Sub10_5;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
	private int anInt4353;

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "Lclient!la;")
	private Class200 aClass200_3;

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "Lclient!l;")
	public Class14_Sub8 aClass14_Sub8_7;

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
	private int anInt4361;

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
	private int anInt4363;

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "[Z")
	private boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "Lclient!bk;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	private int anInt4347 = -1;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
	private int anInt4354 = 0;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	private int anInt4349 = -1;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
	private boolean aBoolean354 = false;

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
	private int anInt4367 = -1;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
	private int anInt4360 = 0;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Z")
	private boolean aBoolean353 = false;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	public final int anInt4345;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public final int anInt4344;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "Lclient!kf;")
	private final Class14_Sub1 aClass14_Sub1_17;

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
	public final int anInt4368;

	@OriginalMember(owner = "client!jh", name = "K", descriptor = "Z")
	private final boolean aBoolean355;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIILclient!kf;ZI)V")
	public Class169(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aByte83 = (byte) arg5;
		this.aByte82 = (byte) arg4;
		this.anInt4345 = arg2;
		this.anInt4344 = arg1.anInt7807;
		this.aBoolean354 = arg7;
		this.aClass14_Sub1_17 = arg6;
		this.anInt4368 = arg3;
		this.aBoolean355 = arg0.method7034() && arg1.aBoolean650 && !this.aBoolean354;
		if (arg8 != -1) {
			this.aBoolean353 = true;
		}
		this.method3991(arg8);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method3983(@OriginalArg(0) Class126 arg0) {
		if (this.aClass5_Sub4_Sub10_5 != null) {
			Static574.method8137(this.aClass5_Sub4_Sub10_5, this.aByte83, this.aClass14_Sub1_17.anInt9317, this.aClass14_Sub1_17.anInt9315, this.aBooleanArray28);
			this.aBooleanArray28 = null;
			this.aClass5_Sub4_Sub10_5 = null;
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
	public int method3985(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method3985(126);
		}
		return this.anInt4360;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)Z")
	public boolean method3986() {
		return this.aBoolean355;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ha;ZIIZ)Lclient!ka;")
	public Class180 method3987(@OriginalArg(0) Class126 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class283 local11 = Static525.aClass371_4.method8554(this.anInt4344);
		if (local11.anIntArray623 != null) {
			local11 = local11.method6858(Static564.aClass304_1);
		}
		if (local11 == null) {
			this.method3983(arg0);
			this.anInt4349 = -1;
			this.anInt4347 = -1;
			this.anInt4367 = -1;
			return null;
		}
		if (!this.aBoolean353 && this.anInt4349 != local11.anInt7807) {
			this.aClass180_6 = null;
			this.method3991(-1);
		}
		this.method3996(this.aClass14_Sub1_17);
		if (arg1) {
			@Pc(74) boolean local74 = arg1 & this.aBoolean355 & Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195() != 0;
			arg1 = local74 & (local11.anInt7807 != this.anInt4367 || this.aClass200_3 != null && Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195() >= 2 && (this.anInt4361 != this.anInt4347 || (this.aClass200_3.aBoolean403 || Static35.aBoolean59) && this.anInt4353 != this.anInt4361));
		}
		if (arg3 && !arg1) {
			this.anInt4349 = local11.anInt7807;
			return null;
		}
		if (arg1) {
			Static574.method8137(this.aClass5_Sub4_Sub10_5, this.aByte83, this.aClass14_Sub1_17.anInt9317, this.aClass14_Sub1_17.anInt9315, this.aBooleanArray28);
			this.anInt4367 = -1;
			this.anInt4347 = -1;
		}
		@Pc(150) Class40 local150 = Static299.aClass40Array1[this.aByte83];
		@Pc(163) Class40 local163;
		if (this.aBoolean354) {
			local163 = Static492.aClass40Array3[0];
		} else {
			local163 = this.aByte83 < 3 ? Static299.aClass40Array1[this.aByte83 + 1] : null;
		}
		@Pc(180) Class180 local180 = null;
		if (this.aClass200_3 != null) {
			if (arg1) {
				arg2 |= 0x40000;
			}
			local180 = local11.method6847(this.anInt4345 == 11 ? this.anInt4368 + 4 : this.anInt4368, this.anInt4361, this.aClass35_1, this.aClass14_Sub1_17.anInt9317, this.anInt4345 == 11 ? 10 : this.anInt4345, this.anInt4363, local163, local150.method8447(this.aClass14_Sub1_17.anInt9317, this.aClass14_Sub1_17.anInt9315), this.aClass14_Sub1_17.anInt9315, this.aClass200_3, local150, this.anInt4353, arg0, arg2);
			if (local180 == null) {
				this.aClass5_Sub4_Sub10_5 = null;
				this.anInt4354 = 0;
				this.anInt4360 = 0;
				this.aBooleanArray28 = null;
			} else {
				if (arg1) {
					if (this.aBooleanArray28 == null) {
						this.aBooleanArray28 = new boolean[4];
					}
					this.aClass5_Sub4_Sub10_5 = local180.ba(this.aClass5_Sub4_Sub10_5);
					Static342.method5250(this.aClass5_Sub4_Sub10_5, this.aByte83, this.aClass14_Sub1_17.anInt9317, this.aClass14_Sub1_17.anInt9315, this.aBooleanArray28);
					this.anInt4367 = local11.anInt7807;
					this.anInt4347 = this.anInt4361;
				}
				this.anInt4354 = local180.fa();
				this.anInt4360 = local180.ma();
			}
			this.aClass180_6 = null;
		} else if (this.aClass180_6 != null && arg2 == (arg2 & this.aClass180_6.ua()) && this.anInt4349 == local11.anInt7807) {
			local180 = this.aClass180_6;
		} else {
			if (this.aClass180_6 != null) {
				arg2 |= this.aClass180_6.ua();
			}
			@Pc(380) Class120 local380 = local11.method6846(this.anInt4345 == 11 ? this.anInt4368 + 4 : this.anInt4368, arg1, this.aClass35_1, arg2, local150.method8447(this.aClass14_Sub1_17.anInt9317, this.aClass14_Sub1_17.anInt9315), arg0, this.aClass14_Sub1_17.anInt9315, this.anInt4345 == 11 ? 10 : this.anInt4345, this.aClass14_Sub1_17.anInt9317, local150, local163);
			if (local380 == null) {
				this.aClass180_6 = null;
				this.anInt4360 = 0;
				this.anInt4354 = 0;
				this.aBooleanArray28 = null;
				this.aClass5_Sub4_Sub10_5 = null;
			} else {
				local180 = local380.aClass180_4;
				this.aClass180_6 = local380.aClass180_4;
				if (arg1) {
					this.aClass5_Sub4_Sub10_5 = local380.aClass5_Sub4_Sub10_4;
					this.aBooleanArray28 = null;
					Static342.method5250(this.aClass5_Sub4_Sub10_5, this.aByte83, this.aClass14_Sub1_17.anInt9317, this.aClass14_Sub1_17.anInt9315, (boolean[]) null);
					this.anInt4367 = local11.anInt7807;
					this.anInt4347 = -1;
				}
				this.anInt4354 = local180.fa();
				this.anInt4360 = local180.ma();
			}
		}
		this.anInt4349 = local11.anInt7807;
		return local180;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
	public int method3989() {
		return this.anInt4354;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V")
	public void method3990(@OriginalArg(1) int arg0) {
		this.aBoolean353 = true;
		this.method3991(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(BI)V")
	private void method3991(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(25) Class283 local25 = Static525.aClass371_4.method8554(this.anInt4344);
			@Pc(27) Class283 local27 = local25;
			if (local25.anIntArray623 != null) {
				local25 = local25.method6858(Static564.aClass304_1);
			}
			if (local25 == null) {
				return;
			}
			if (local27 == local25) {
				local27 = null;
			}
			if (local25.anIntArray625 != null) {
				if (this.aClass200_3 != null && local25.method6861(this.aClass200_3.anInt4881)) {
					return;
				}
				local13 = local25.method6859();
				if (local25.anInt7807 != this.anInt4349) {
					local15 = local25.aBoolean642;
				}
			} else if (local25.anInt7794 == -1) {
				if (local27 != null && local27.anIntArray625 != null) {
					if (this.aClass200_3 != null && local27.method6861(this.aClass200_3.anInt4881)) {
						return;
					}
					local13 = local27.method6859();
					if (local27.anInt7807 != this.anInt4349) {
						local15 = local27.aBoolean642;
					}
				} else if (local27 != null && local27.anInt7794 != -1 && this.anInt4349 != local27.anInt7807) {
					local15 = local27.aBoolean642;
					local13 = local27.anInt7794;
				}
			} else if (this.anInt4349 != local25.anInt7807) {
				local15 = local25.aBoolean642;
				local13 = local25.anInt7794;
			}
		}
		if (local13 == -1) {
			this.aClass200_3 = null;
			return;
		}
		this.aClass180_6 = null;
		if (this.aClass200_3 == null || this.aClass200_3.anInt4881 != local13) {
			this.aClass200_3 = Static396.aClass359_2.method8415(local13);
		} else if (this.aClass200_3.anInt4871 == 0) {
			return;
		}
		if (this.aClass200_3.anIntArray389 == null) {
			this.aClass200_3 = null;
			return;
		}
		if (local15) {
			this.anInt4361 = (int) (Math.random() * (double) this.aClass200_3.anIntArray389.length);
			this.anInt4363 = (int) (Math.random() * (double) this.aClass200_3.anIntArray388[this.anInt4361]) + 1;
		} else {
			this.anInt4363 = 1;
			this.anInt4361 = 0;
		}
		this.anInt4353 = this.anInt4361 + 1;
		if (this.anInt4353 < 0 || this.aClass200_3.anIntArray389.length <= this.anInt4353) {
			this.anInt4353 = -1;
		}
		this.anInt4348 = Static235.anInt3998 - this.anInt4363;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method3992(@OriginalArg(0) Class35 arg0) {
		this.aClass35_1 = arg0;
		this.aClass180_6 = null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!ha;)V")
	public void method3994(@OriginalArg(1) Class126 arg0) {
		this.method3987(arg0, true, 262144, true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZILclient!ofa;ILclient!ka;Lclient!ha;IIZ)V")
	public void method3995(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class180 arg3, @OriginalArg(5) Class126 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(10) Class57[] local10 = arg3.method7940();
		@Pc(13) Class143[] local13 = arg3.method7935();
		if ((this.aClass14_Sub8_7 == null || this.aClass14_Sub8_7.aBoolean397) && (local10 != null || local13 != null)) {
			@Pc(30) Class283 local30 = Static525.aClass371_4.method8554(this.anInt4344);
			if (local30.anIntArray623 != null) {
				local30 = local30.method6858(Static564.aClass304_1);
			}
			if (local30 != null) {
				this.aClass14_Sub8_7 = Static307.method4460(Static235.anInt3998, true);
			}
		}
		if (this.aClass14_Sub8_7 == null) {
			return;
		}
		arg3.method7951(arg1);
		if (arg7) {
			this.aClass14_Sub8_7.method4456(arg4, (long) Static235.anInt3998, local10, local13);
		} else {
			this.aClass14_Sub8_7.method4461((long) Static235.anInt3998);
		}
		this.aClass14_Sub8_7.method4447(this.aByte82, arg2, arg5, arg6, arg0);
	}

	@OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass14_Sub8_7 != null) {
			this.aClass14_Sub8_7.method4450();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!kf;)V")
	private void method3996(@OriginalArg(1) Class14_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass200_3 == null) {
				if (this.aBoolean353) {
					return;
				}
				this.method3991(-1);
				if (this.aClass200_3 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static235.anInt3998 - this.anInt4348;
			if (local30 > 100 && this.aClass200_3.anInt4887 > 0) {
				@Pc(51) int local51 = this.aClass200_3.anIntArray389.length - this.aClass200_3.anInt4887;
				while (this.anInt4361 < local51 && this.aClass200_3.anIntArray388[this.anInt4361] < local30) {
					local30 -= this.aClass200_3.anIntArray388[this.anInt4361];
					this.anInt4361++;
				}
				if (local51 <= this.anInt4361) {
					@Pc(94) int local94 = 0;
					for (@Pc(96) int local96 = local51; local96 < this.aClass200_3.anIntArray389.length; local96++) {
						local94 += this.aClass200_3.anIntArray388[local96];
					}
					local30 %= local94;
				}
				this.anInt4353 = this.anInt4361 + 1;
				if (this.anInt4353 >= this.aClass200_3.anIntArray389.length) {
					this.anInt4353 -= this.aClass200_3.anInt4887;
					if (this.anInt4353 < 0 || this.anInt4353 >= this.aClass200_3.anIntArray389.length) {
						this.anInt4353 = -1;
					}
				}
			}
			while (this.aClass200_3.anIntArray388[this.anInt4361] < local30) {
				Static270.method4083(this.aClass200_3, this.anInt4361, arg0);
				local30 -= this.aClass200_3.anIntArray388[this.anInt4361];
				this.anInt4361++;
				if (this.aClass200_3.anIntArray389.length <= this.anInt4361) {
					this.anInt4361 -= this.aClass200_3.anInt4887;
					if (this.anInt4361 < 0 || this.aClass200_3.anIntArray389.length <= this.anInt4361) {
						this.aClass200_3 = null;
						continue label80;
					}
				}
				this.anInt4353 = this.anInt4361 + 1;
				if (this.anInt4353 >= this.aClass200_3.anIntArray389.length) {
					this.anInt4353 -= this.aClass200_3.anInt4887;
					if (this.anInt4353 < 0 || this.anInt4353 >= this.aClass200_3.anIntArray389.length) {
						this.anInt4353 = -1;
					}
				}
			}
			this.anInt4363 = local30;
			this.anInt4348 = Static235.anInt3998 - local30;
			return;
		}
	}
}
