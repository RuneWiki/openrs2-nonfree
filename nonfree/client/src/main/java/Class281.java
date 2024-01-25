import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class281 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
	private int anInt8404;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!ba;")
	private Class2 aClass2_7;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
	private int anInt8406;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Lclient!w;")
	private Class3_Sub10_Sub18 aClass3_Sub10_Sub18_6;

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "Lclient!kw;")
	public Class4_Sub4 aClass4_Sub4_7;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "[Z")
	private boolean[] aBooleanArray42;

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
	private int anInt8419;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	private int anInt8426;

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "Lclient!hi;")
	private Class122 aClass122_3;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
	private int anInt8421 = -32768;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
	private int anInt8411 = -1;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "Z")
	private boolean aBoolean617 = false;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
	private int anInt8423 = -1;

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
	private int anInt8428 = -1;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
	public final int anInt8412;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "B")
	private final byte aByte85;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
	public final int anInt8418;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	private int anInt8422;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	private int anInt8425;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "B")
	private final byte aByte86;

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
	public final int anInt8427;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIIIZI)V")
	public Class281(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt8412 = arg1.anInt7168;
		this.aByte85 = (byte) arg5;
		this.aBoolean616 = arg8;
		this.anInt8418 = arg3;
		this.anInt8422 = arg6;
		this.anInt8425 = arg7;
		this.aByte86 = (byte) arg4;
		this.anInt8427 = arg2;
		this.aBoolean615 = arg0.method7439() && arg1.aBoolean488 && !this.aBoolean616;
		if (arg9 != -1) {
			this.aBoolean617 = true;
		}
		this.method6969(arg9);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	private void method6969(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(20) Class242 local20 = Static454.aClass298_3.method7185(this.anInt8412);
			@Pc(22) Class242 local22 = local20;
			if (local20.anIntArray632 != null) {
				local20 = local20.method5975(Static127.aClass215_1);
			}
			if (local20 == null) {
				return;
			}
			if (local20 == local22) {
				local22 = null;
			}
			if (local20.anIntArray633 != null) {
				if (this.aClass122_3 != null && local20.method5987(this.aClass122_3.anInt4150)) {
					return;
				}
				local7 = local20.method5979();
				if (this.anInt8428 != local20.anInt7168) {
					local9 = local20.aBoolean475;
				}
			} else if (local20.anInt7183 == -1) {
				if (local22 != null && local22.anIntArray633 != null) {
					if (this.aClass122_3 != null && local22.method5987(this.aClass122_3.anInt4150)) {
						return;
					}
					local7 = local22.method5979();
					if (this.anInt8428 != local22.anInt7168) {
						local9 = local22.aBoolean475;
					}
				} else if (local22 != null && local22.anInt7183 != -1 && this.anInt8428 != local22.anInt7168) {
					local7 = local22.anInt7183;
					local9 = local22.aBoolean475;
				}
			} else if (this.anInt8428 != local20.anInt7168) {
				local9 = local20.aBoolean475;
				local7 = local20.anInt7183;
			}
		}
		if (local7 == -1) {
			this.aClass122_3 = null;
			return;
		}
		this.aClass2_7 = null;
		if (this.aClass122_3 == null || local7 != this.aClass122_3.anInt4150) {
			this.aClass122_3 = Static46.aClass247_1.method6029(local7);
		} else if (this.aClass122_3.anInt4145 == 0) {
			return;
		}
		if (this.aClass122_3.anIntArray396 == null) {
			this.aClass122_3 = null;
			return;
		}
		if (local9) {
			this.anInt8404 = (int) ((double) this.aClass122_3.anIntArray396.length * Math.random());
			this.anInt8419 = (int) (Math.random() * (double) this.aClass122_3.anIntArray394[this.anInt8404]) + 1;
		} else {
			this.anInt8419 = 1;
			this.anInt8404 = 0;
		}
		this.anInt8426 = this.anInt8404 + 1;
		if (this.anInt8426 < 0 || this.anInt8426 >= this.aClass122_3.anIntArray396.length) {
			this.anInt8426 = -1;
		}
		this.anInt8406 = Static223.anInt4829 - this.anInt8419;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method6970(@OriginalArg(0) Class5 arg0) {
		this.method6979(this.anInt8422, true, this.anInt8425, 262144, arg0, true);
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	public void method6971(@OriginalArg(0) int arg0) {
		this.aBoolean617 = true;
		this.method6969(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!oa;)V")
	public void method6973(@OriginalArg(1) Class5 arg0) {
		if (this.aClass3_Sub10_Sub18_6 != null) {
			Static446.method6775(this.aClass3_Sub10_Sub18_6, this.aByte85, this.anInt8422, this.anInt8425, this.aBooleanArray42);
			this.aClass3_Sub10_Sub18_6 = null;
			this.aBooleanArray42 = null;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!q;BLclient!ba;IZIILclient!oa;I)V")
	public void method6974(@OriginalArg(0) Class205 arg0, @OriginalArg(2) Class2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5 arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class83[] local6 = arg1.method5778();
		@Pc(9) Class109[] local9 = arg1.method5789();
		if ((this.aClass4_Sub4_7 == null || this.aClass4_Sub4_7.aBoolean359) && (local6 != null || local9 != null)) {
			@Pc(32) Class242 local32 = Static454.aClass298_3.method7185(this.anInt8412);
			if (local32.anIntArray632 != null) {
				local32 = local32.method5975(Static127.aClass215_1);
			}
			if (local32 != null) {
				this.aClass4_Sub4_7 = Static261.method4593(Static223.anInt4829, true);
			}
		}
		if (this.aClass4_Sub4_7 == null) {
			return;
		}
		arg1.method5770(arg0);
		if (arg3) {
			this.aClass4_Sub4_7.method4599(arg6, (long) Static223.anInt4829, local6, local9);
		} else {
			this.aClass4_Sub4_7.method4601((long) Static223.anInt4829);
		}
		this.aClass4_Sub4_7.method4588(this.aByte86, arg2, arg5, arg7, arg4);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
	private void method6975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass122_3 == null) {
				if (this.aBoolean617) {
					return;
				}
				this.method6969(-1);
				if (this.aClass122_3 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static223.anInt4829 - this.anInt8406;
			if (local33 > 100 && this.aClass122_3.anInt4152 > 0) {
				@Pc(51) int local51 = this.aClass122_3.anIntArray396.length - this.aClass122_3.anInt4152;
				while (this.anInt8404 < local51 && this.aClass122_3.anIntArray394[this.anInt8404] < local33) {
					local33 -= this.aClass122_3.anIntArray394[this.anInt8404];
					this.anInt8404++;
				}
				if (local51 <= this.anInt8404) {
					@Pc(94) int local94 = 0;
					for (@Pc(96) int local96 = local51; local96 < this.aClass122_3.anIntArray396.length; local96++) {
						local94 += this.aClass122_3.anIntArray394[local96];
					}
					local33 %= local94;
				}
				this.anInt8426 = this.anInt8404 + 1;
				if (this.anInt8426 >= this.aClass122_3.anIntArray396.length) {
					this.anInt8426 -= this.aClass122_3.anInt4152;
					if (this.anInt8426 < 0 || this.anInt8426 >= this.aClass122_3.anIntArray396.length) {
						this.anInt8426 = -1;
					}
				}
			}
			while (local33 > this.aClass122_3.anIntArray394[this.anInt8404]) {
				Static448.method6790(false, arg0, arg1, this.aByte86, this.aClass122_3, this.anInt8404);
				local33 -= this.aClass122_3.anIntArray394[this.anInt8404];
				this.anInt8404++;
				if (this.anInt8404 >= this.aClass122_3.anIntArray396.length) {
					this.anInt8404 -= this.aClass122_3.anInt4152;
					if (this.anInt8404 < 0 || this.anInt8404 >= this.aClass122_3.anIntArray396.length) {
						this.aClass122_3 = null;
						continue label80;
					}
				}
				this.anInt8426 = this.anInt8404 + 1;
				if (this.anInt8426 >= this.aClass122_3.anIntArray396.length) {
					this.anInt8426 -= this.aClass122_3.anInt4152;
					if (this.anInt8426 < 0 || this.aClass122_3.anIntArray396.length <= this.anInt8426) {
						this.anInt8426 = -1;
					}
				}
			}
			this.anInt8406 = Static223.anInt4829 - local33;
			this.anInt8419 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)I")
	public int method6976() {
		return this.anInt8421;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Z")
	public boolean method6977() {
		return this.aBoolean615;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZIIILclient!oa;Z)Lclient!ba;")
	public Class2 method6979(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class242 local11 = Static454.aClass298_3.method7185(this.anInt8412);
		if (local11.anIntArray632 != null) {
			local11 = local11.method5975(Static127.aClass215_1);
		}
		if (local11 == null) {
			this.method6973(arg4);
			this.anInt8411 = -1;
			this.anInt8423 = -1;
			this.anInt8428 = -1;
			return null;
		}
		if (!this.aBoolean617 && this.anInt8428 != local11.anInt7168) {
			this.aClass2_7 = null;
			this.method6969(-1);
		}
		this.method6975(arg0, arg2);
		if (arg1) {
			@Pc(90) boolean local90 = arg1 & this.aBoolean615 & Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091) != 0;
			arg1 = local90 & (this.anInt8411 != local11.anInt7168 || this.aClass122_3 != null && Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091) >= 2 && (this.anInt8404 != this.anInt8423 || (this.aClass122_3.aBoolean297 || Static497.aBoolean651) && this.anInt8426 != this.anInt8404));
		}
		if (arg5 && !arg1) {
			this.anInt8428 = local11.anInt7168;
			return null;
		}
		if (arg1) {
			Static446.method6775(this.aClass3_Sub10_Sub18_6, this.aByte85, this.anInt8422, this.anInt8425, this.aBooleanArray42);
			this.anInt8411 = -1;
			this.anInt8423 = -1;
		}
		@Pc(164) Class52 local164 = Static511.aClass52Array3[this.aByte85];
		@Pc(171) Class52 local171;
		if (this.aBoolean616) {
			local171 = Static163.aClass52Array4[0];
		} else {
			local171 = this.aByte85 >= 3 ? null : Static511.aClass52Array3[this.aByte85 + 1];
		}
		@Pc(190) Class2 local190 = null;
		if (this.aClass122_3 != null) {
			if (arg1) {
				arg3 |= 0x40000;
			}
			local190 = local11.method5982(this.anInt8422, local171, this.anInt8404, local164.sa(this.anInt8422, this.anInt8425), this.anInt8419, this.anInt8427 == 11 ? 10 : this.anInt8427, this.anInt8425, this.anInt8427 == 11 ? this.anInt8418 + 4 : this.anInt8418, this.aClass122_3, arg3, local164, arg4, this.anInt8426);
			if (local190 == null) {
				this.anInt8421 = 0;
				this.aClass3_Sub10_Sub18_6 = null;
				this.aBooleanArray42 = null;
			} else {
				if (arg1) {
					if (this.aBooleanArray42 == null) {
						this.aBooleanArray42 = new boolean[4];
					}
					this.aClass3_Sub10_Sub18_6 = local190.Z(this.aClass3_Sub10_Sub18_6);
					Static348.method5673(this.aClass3_Sub10_Sub18_6, this.aByte85, arg0, arg2, this.aBooleanArray42);
					this.anInt8411 = local11.anInt7168;
					this.anInt8423 = this.anInt8404;
				}
				this.anInt8421 = local190.DA();
			}
			this.aClass2_7 = null;
		} else if (this.aClass2_7 != null && arg3 == (arg3 & this.aClass2_7.h()) && local11.anInt7168 == this.anInt8428) {
			local190 = this.aClass2_7;
		} else {
			if (this.aClass2_7 != null) {
				arg3 |= this.aClass2_7.h();
			}
			@Pc(373) Class181 local373 = local11.method5981(this.anInt8422, arg3, this.anInt8427 == 11 ? this.anInt8418 + 4 : this.anInt8418, arg4, local164.sa(this.anInt8422, this.anInt8425), arg1, this.anInt8427 == 11 ? 10 : this.anInt8427, local171, this.anInt8425, local164);
			if (local373 == null) {
				this.aBooleanArray42 = null;
				this.anInt8421 = 0;
				this.aClass3_Sub10_Sub18_6 = null;
				this.aClass2_7 = null;
			} else {
				local190 = local373.aClass2_3;
				this.aClass2_7 = local373.aClass2_3;
				if (arg1) {
					this.aBooleanArray42 = null;
					this.aClass3_Sub10_Sub18_6 = local373.aClass3_Sub10_Sub18_3;
					Static348.method5673(this.aClass3_Sub10_Sub18_6, this.aByte85, arg0, arg2, null);
					this.anInt8411 = local11.anInt7168;
					this.anInt8423 = -1;
				}
				this.anInt8421 = local190.DA();
			}
		}
		this.anInt8425 = arg2;
		this.anInt8428 = local11.anInt7168;
		this.anInt8422 = arg0;
		return local190;
	}

	@OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub4_7 != null) {
			this.aClass4_Sub4_7.method4600();
		}
	}
}
