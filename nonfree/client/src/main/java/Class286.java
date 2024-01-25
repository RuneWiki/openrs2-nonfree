import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class286 {

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	private int anInt8116;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!ba;")
	private Class24 aClass24_7;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	private int anInt8119;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Lclient!w;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_6;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!ct;")
	private Class63 aClass63_3;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "[Z")
	private boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!s", name = "G", descriptor = "I")
	private int anInt8135;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "I")
	private int anInt8137;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "Lclient!io;")
	public Class60_Sub4 aClass60_Sub4_7;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	private int anInt8123 = -32768;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
	private boolean aBoolean524 = false;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	private int anInt8127 = -1;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private int anInt8117 = -1;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "I")
	private int anInt8134 = -1;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	public final int anInt8133;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	private int anInt8121;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "I")
	private int anInt8130;

	@OriginalMember(owner = "client!s", name = "x", descriptor = "I")
	public final int anInt8129;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public final int anInt8120;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "Z")
	private final boolean aBoolean525;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIIIZI)V")
	public Class286(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte88 = (byte) arg5;
		this.anInt8133 = arg1.anInt5600;
		this.anInt8121 = arg6;
		this.anInt8130 = arg7;
		this.anInt8129 = arg3;
		this.aByte89 = (byte) arg4;
		this.anInt8120 = arg2;
		this.aBoolean524 = arg8;
		this.aBoolean525 = arg0.method7466() && arg1.aBoolean388 && !this.aBoolean524;
		if (arg9 != -1) {
			this.aBoolean523 = true;
		}
		this.method6450(arg9);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method6446(@OriginalArg(0) Class90 arg0) {
		if (this.aClass6_Sub5_Sub10_6 != null) {
			Static156.method2461(this.aClass6_Sub5_Sub10_6, this.aByte88, this.anInt8121, this.anInt8130, this.aBooleanArray28);
			this.aClass6_Sub5_Sub10_6 = null;
			this.aBooleanArray28 = null;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)I")
	public int method6448() {
		return this.anInt8123;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public void method6449(@OriginalArg(1) int arg0) {
		this.aBoolean523 = true;
		this.method6450(arg0);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
	private void method6450(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class192 local19 = Static85.aClass27_1.method516(this.anInt8133);
			@Pc(21) Class192 local21 = local19;
			if (local19.lb != null) {
				local19 = local19.method4585(Static65.aClass51_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray428 != null) {
				if (this.aClass63_3 != null && local19.method4588(this.aClass63_3.anInt1370)) {
					return;
				}
				local7 = local19.method4584();
				if (local19.anInt5600 != this.anInt8127) {
					local9 = local19.aBoolean398;
				}
			} else if (local19.anInt5620 == -1) {
				if (local21 != null && local21.anIntArray428 != null) {
					if (this.aClass63_3 != null && local21.method4588(this.aClass63_3.anInt1370)) {
						return;
					}
					local7 = local21.method4584();
					if (local21.anInt5600 != this.anInt8127) {
						local9 = local21.aBoolean398;
					}
				} else if (local21 != null && local21.anInt5620 != -1 && this.anInt8127 != local21.anInt5600) {
					local7 = local21.anInt5620;
					local9 = local21.aBoolean398;
				}
			} else if (local19.anInt5600 != this.anInt8127) {
				local7 = local19.anInt5620;
				local9 = local19.aBoolean398;
			}
		}
		if (local7 == -1) {
			this.aClass63_3 = null;
			return;
		}
		this.aClass24_7 = null;
		if (this.aClass63_3 == null || this.aClass63_3.anInt1370 != local7) {
			this.aClass63_3 = Static388.aClass324_2.method7265(local7);
		} else if (this.aClass63_3.anInt1379 == 0) {
			return;
		}
		if (this.aClass63_3.anIntArray127 == null) {
			this.aClass63_3 = null;
			return;
		}
		if (local9) {
			this.anInt8116 = (int) ((double) this.aClass63_3.anIntArray127.length * Math.random());
			this.anInt8135 = (int) ((double) this.aClass63_3.anIntArray128[this.anInt8116] * Math.random()) + 1;
		} else {
			this.anInt8135 = 1;
			this.anInt8116 = 0;
		}
		this.anInt8137 = this.anInt8116 + 1;
		if (this.anInt8137 < 0 || this.anInt8137 >= this.aClass63_3.anIntArray127.length) {
			this.anInt8137 = -1;
		}
		this.anInt8119 = Static363.anInt6671 - this.anInt8135;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLclient!oa;IZIIZ)Lclient!ba;")
	public Class24 method6452(@OriginalArg(1) Class90 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class192 local11 = Static85.aClass27_1.method516(this.anInt8133);
		if (local11.lb != null) {
			local11 = local11.method4585(Static65.aClass51_1);
		}
		if (local11 == null) {
			this.method6446(arg0);
			this.anInt8127 = -1;
			this.anInt8117 = -1;
			this.anInt8134 = -1;
			return null;
		}
		if (!this.aBoolean523 && local11.anInt5600 != this.anInt8127) {
			this.aClass24_7 = null;
			this.method6450(-1);
		}
		this.method6455(arg3, arg1);
		if (arg5) {
			@Pc(75) boolean local75 = arg5 & this.aBoolean525 & Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700) != 0;
			arg5 = local75 & (local11.anInt5600 != this.anInt8134 || this.aClass63_3 != null && Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700) >= 2 && (this.anInt8116 != this.anInt8117 || (this.aClass63_3.aBoolean106 || Static38.aBoolean50) && this.anInt8137 != this.anInt8116));
		}
		if (arg2 && !arg5) {
			this.anInt8127 = local11.anInt5600;
			return null;
		}
		if (arg5) {
			Static156.method2461(this.aClass6_Sub5_Sub10_6, this.aByte88, this.anInt8121, this.anInt8130, this.aBooleanArray28);
			this.anInt8134 = -1;
			this.anInt8117 = -1;
		}
		@Pc(159) Class46 local159 = Static205.aClass46Array1[this.aByte88];
		@Pc(166) Class46 local166;
		if (this.aBoolean524) {
			local166 = Static496.aClass46Array4[0];
		} else {
			local166 = this.aByte88 >= 3 ? null : Static205.aClass46Array1[this.aByte88 + 1];
		}
		@Pc(183) Class24 local183 = null;
		if (this.aClass63_3 != null) {
			if (arg5) {
				arg4 |= 0x40000;
			}
			local183 = local11.method4590(this.anInt8121, this.anInt8135, local166, this.anInt8120 == 11 ? 10 : this.anInt8120, local159, arg4, local159.sa(this.anInt8121, this.anInt8130), this.anInt8137, this.anInt8120 == 11 ? this.anInt8129 + 4 : this.anInt8129, this.anInt8130, arg0, this.anInt8116, this.aClass63_3);
			if (local183 == null) {
				this.anInt8123 = 0;
				this.aBooleanArray28 = null;
				this.aClass6_Sub5_Sub10_6 = null;
			} else {
				if (arg5) {
					if (this.aBooleanArray28 == null) {
						this.aBooleanArray28 = new boolean[4];
					}
					this.aClass6_Sub5_Sub10_6 = local183.Z(this.aClass6_Sub5_Sub10_6);
					Static485.method6822(this.aClass6_Sub5_Sub10_6, this.aByte88, arg1, arg3, this.aBooleanArray28);
					this.anInt8117 = this.anInt8116;
					this.anInt8134 = local11.anInt5600;
				}
				this.anInt8123 = local183.DA();
			}
			this.aClass24_7 = null;
		} else if (this.aClass24_7 != null && (arg4 & this.aClass24_7.h()) == arg4 && this.anInt8127 == local11.anInt5600) {
			local183 = this.aClass24_7;
		} else {
			if (this.aClass24_7 != null) {
				arg4 |= this.aClass24_7.h();
			}
			@Pc(260) Class47 local260 = local11.method4593(arg4, local166, local159.sa(this.anInt8121, this.anInt8130), this.anInt8120 == 11 ? 10 : this.anInt8120, local159, this.anInt8130, arg5, this.anInt8121, this.anInt8120 == 11 ? this.anInt8129 + 4 : this.anInt8129, arg0);
			if (local260 == null) {
				this.aBooleanArray28 = null;
				this.anInt8123 = 0;
				this.aClass6_Sub5_Sub10_6 = null;
				this.aClass24_7 = null;
			} else {
				local183 = local260.aClass24_1;
				this.aClass24_7 = local260.aClass24_1;
				if (arg5) {
					this.aClass6_Sub5_Sub10_6 = local260.aClass6_Sub5_Sub10_1;
					this.aBooleanArray28 = null;
					Static485.method6822(this.aClass6_Sub5_Sub10_6, this.aByte88, arg1, arg3, null);
					this.anInt8117 = -1;
					this.anInt8134 = local11.anInt5600;
				}
				this.anInt8123 = local183.DA();
			}
		}
		this.anInt8130 = arg3;
		this.anInt8121 = arg1;
		this.anInt8127 = local11.anInt5600;
		return local183;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!q;Lclient!oa;IIIIZLclient!ba;)V")
	public void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class24 arg7) {
		@Pc(9) Class33[] local9 = arg7.method7383();
		@Pc(12) Class335[] local12 = arg7.method7402();
		if ((this.aClass60_Sub4_7 == null || this.aClass60_Sub4_7.aBoolean316) && (local9 != null || local12 != null)) {
			@Pc(29) Class192 local29 = Static85.aClass27_1.method516(this.anInt8133);
			if (local29.lb != null) {
				local29 = local29.method4585(Static65.aClass51_1);
			}
			if (local29 != null) {
				this.aClass60_Sub4_7 = Static229.method3576(Static363.anInt6671, true);
			}
		}
		if (this.aClass60_Sub4_7 == null) {
			return;
		}
		arg7.method7388(arg1);
		if (arg6) {
			this.aClass60_Sub4_7.method3580(arg2, (long) Static363.anInt6671, local9, local12);
		} else {
			this.aClass60_Sub4_7.method3579((long) Static363.anInt6671);
		}
		this.aClass60_Sub4_7.method3577(this.aByte89, arg5, arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZI)V")
	private void method6455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass63_3 == null) {
				if (this.aBoolean523) {
					return;
				}
				this.method6450(-1);
				if (this.aClass63_3 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static363.anInt6671 - this.anInt8119;
			if (local34 > 100 && this.aClass63_3.anInt1378 > 0) {
				@Pc(55) int local55 = this.aClass63_3.anIntArray127.length - this.aClass63_3.anInt1378;
				while (this.anInt8116 < local55 && this.aClass63_3.anIntArray128[this.anInt8116] < local34) {
					local34 -= this.aClass63_3.anIntArray128[this.anInt8116];
					this.anInt8116++;
				}
				if (this.anInt8116 >= local55) {
					@Pc(98) int local98 = 0;
					for (@Pc(100) int local100 = local55; local100 < this.aClass63_3.anIntArray127.length; local100++) {
						local98 += this.aClass63_3.anIntArray128[local100];
					}
					local34 %= local98;
				}
				this.anInt8137 = this.anInt8116 + 1;
				if (this.aClass63_3.anIntArray127.length <= this.anInt8137) {
					this.anInt8137 -= this.aClass63_3.anInt1378;
					if (this.anInt8137 < 0 || this.anInt8137 >= this.aClass63_3.anIntArray127.length) {
						this.anInt8137 = -1;
					}
				}
			}
			while (local34 > this.aClass63_3.anIntArray128[this.anInt8116]) {
				Static32.method514(false, arg1, this.aByte89, this.aClass63_3, arg0, this.anInt8116);
				local34 -= this.aClass63_3.anIntArray128[this.anInt8116];
				this.anInt8116++;
				if (this.anInt8116 >= this.aClass63_3.anIntArray127.length) {
					this.anInt8116 -= this.aClass63_3.anInt1378;
					if (this.anInt8116 < 0 || this.anInt8116 >= this.aClass63_3.anIntArray127.length) {
						this.aClass63_3 = null;
						continue label80;
					}
				}
				this.anInt8137 = this.anInt8116 + 1;
				if (this.anInt8137 >= this.aClass63_3.anIntArray127.length) {
					this.anInt8137 -= this.aClass63_3.anInt1378;
					if (this.anInt8137 < 0 || this.anInt8137 >= this.aClass63_3.anIntArray127.length) {
						this.anInt8137 = -1;
					}
				}
			}
			this.anInt8119 = Static363.anInt6671 - local34;
			this.anInt8135 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)Z")
	public boolean method6456() {
		return this.aBoolean525;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLclient!oa;)V")
	public void method6457(@OriginalArg(1) Class90 arg0) {
		this.method6452(arg0, this.anInt8121, true, this.anInt8130, 262144, true);
	}

	@OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass60_Sub4_7 != null) {
			this.aClass60_Sub4_7.method3590();
		}
	}
}
