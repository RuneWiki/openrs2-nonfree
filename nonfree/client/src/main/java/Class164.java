import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class164 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!qi;")
	private Class170 aClass170_2;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	private int anInt4814;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "[Z")
	private boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
	private int anInt4827;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "Lclient!ug;")
	private Class7_Sub1_Sub4 aClass7_Sub1_Sub4_4;

	@OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
	private int anInt4834;

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
	private int anInt4836;

	@OriginalMember(owner = "client!pl", name = "S", descriptor = "Lclient!ha;")
	public Class36_Sub3 aClass36_Sub3_4;

	@OriginalMember(owner = "client!pl", name = "U", descriptor = "Lclient!sj;")
	private Class31 aClass31_5;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
	private int anInt4815 = -1;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	private int anInt4812 = -32768;

	@OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
	private int anInt4833 = -1;

	@OriginalMember(owner = "client!pl", name = "D", descriptor = "Z")
	private boolean aBoolean354 = false;

	@OriginalMember(owner = "client!pl", name = "R", descriptor = "Z")
	private boolean aBoolean356 = false;

	@OriginalMember(owner = "client!pl", name = "T", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
	private int anInt4820;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	public final int anInt4821;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public final int anInt4816;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
	private int anInt4823;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "B")
	private final byte aByte48;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
	public final int anInt4825;

	@OriginalMember(owner = "client!pl", name = "H", descriptor = "Z")
	private final boolean aBoolean355;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!pe;Lclient!kk;IIIIIIZI)V")
	public Class164(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aBoolean356 = arg8;
		this.aByte49 = (byte) arg4;
		this.anInt4820 = arg7;
		this.anInt4821 = arg1.anInt3534;
		this.anInt4816 = arg2;
		this.anInt4823 = arg6;
		this.aByte48 = (byte) arg5;
		this.anInt4825 = arg3;
		this.aBoolean355 = arg0.method5418() && arg1.aBoolean274 && !this.aBoolean356;
		if (arg9 != -1) {
			this.aBoolean354 = true;
		}
		this.method4214(arg9);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!sj;IIILclient!pe;IIZ)V")
	public void method4210(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class89 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(13) Class57[] local13 = arg0.method1942();
		@Pc(16) Class6[] local16 = arg0.method1952();
		if ((this.aClass36_Sub3_4 == null || this.aClass36_Sub3_4.aBoolean178) && (local13 != null || local16 != null)) {
			@Pc(32) Class122 local32 = Static245.method4227(this.anInt4821);
			if (local32.anIntArray481 != null) {
				local32 = local32.method3234();
			}
			if (local32 != null) {
				this.aClass36_Sub3_4 = new Class36_Sub3(Static212.anInt4234);
			}
		}
		if (this.aClass36_Sub3_4 == null) {
			return;
		}
		if (arg6) {
			this.aClass36_Sub3_4.method2169(arg4, (long) Static212.anInt4234, local13, local16);
		} else {
			this.aClass36_Sub3_4.method2168((long) Static212.anInt4234);
		}
		this.aClass36_Sub3_4.method2180(this.aByte49, arg1, arg2, arg5, arg3);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB)V")
	private void method4211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass170_2 == null) {
				if (this.aBoolean354) {
					return;
				}
				this.method4214(-1);
				if (this.aClass170_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static212.anInt4234 - this.anInt4836;
			if (local32 > 100 && this.aClass170_2.anInt4956 > 0) {
				@Pc(54) int local54 = this.aClass170_2.anIntArray652.length - this.aClass170_2.anInt4956;
				while (this.anInt4814 < local54 && local32 > this.aClass170_2.anIntArray650[this.anInt4814]) {
					local32 -= this.aClass170_2.anIntArray650[this.anInt4814];
					this.anInt4814++;
				}
				if (this.anInt4814 >= local54) {
					@Pc(97) int local97 = 0;
					for (@Pc(99) int local99 = local54; local99 < this.aClass170_2.anIntArray652.length; local99++) {
						local97 += this.aClass170_2.anIntArray650[local99];
					}
					local32 %= local97;
				}
				this.anInt4827 = this.anInt4814 + 1;
				if (this.anInt4827 >= this.aClass170_2.anIntArray652.length) {
					this.anInt4827 -= this.aClass170_2.anInt4956;
					if (this.anInt4827 < 0 || this.aClass170_2.anIntArray652.length <= this.anInt4827) {
						this.anInt4827 = -1;
					}
				}
			}
			while (this.aClass170_2.anIntArray650[this.anInt4814] < local32) {
				Static219.method3870(this.aClass170_2, arg1, false, this.anInt4814, arg0);
				local32 -= this.aClass170_2.anIntArray650[this.anInt4814];
				this.anInt4814++;
				if (this.anInt4814 >= this.aClass170_2.anIntArray652.length) {
					this.anInt4814 -= this.aClass170_2.anInt4956;
					if (this.anInt4814 < 0 || this.aClass170_2.anIntArray652.length <= this.anInt4814) {
						this.aClass170_2 = null;
						continue label80;
					}
				}
				this.anInt4827 = this.anInt4814 + 1;
				if (this.anInt4827 >= this.aClass170_2.anIntArray652.length) {
					this.anInt4827 -= this.aClass170_2.anInt4956;
					if (this.anInt4827 < 0 || this.anInt4827 >= this.aClass170_2.anIntArray652.length) {
						this.anInt4827 = -1;
					}
				}
			}
			this.anInt4836 = Static212.anInt4234 - local32;
			this.anInt4834 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)V")
	private void method4214(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(11) boolean local11 = false;
		if (arg0 == -1) {
			@Pc(19) Class122 local19 = Static245.method4227(this.anInt4821);
			@Pc(21) Class122 local21 = local19;
			if (local19.anIntArray481 != null) {
				local19 = local19.method3234();
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray474 != null) {
				if (this.aClass170_2 != null && local19.method3225(this.aClass170_2.anInt4955)) {
					return;
				}
				local5 = local19.method3236();
				if (local19.anInt3534 != this.anInt4833) {
					local11 = local19.aBoolean262;
				}
			} else if (local19.anInt3523 == -1) {
				if (local21 != null && local21.anIntArray474 != null) {
					if (this.aClass170_2 != null && local21.method3225(this.aClass170_2.anInt4955)) {
						return;
					}
					local5 = local21.method3236();
					if (local21.anInt3534 != this.anInt4833) {
						local11 = local21.aBoolean262;
					}
				} else if (local21 != null && local21.anInt3523 != -1 && this.anInt4833 != local21.anInt3534) {
					local11 = local21.aBoolean262;
					local5 = local21.anInt3523;
				}
			} else if (local19.anInt3534 != this.anInt4833) {
				local5 = local19.anInt3523;
				local11 = local19.aBoolean262;
			}
		}
		if (local5 == -1) {
			this.aClass170_2 = null;
			return;
		}
		this.aClass31_5 = null;
		if (this.aClass170_2 == null || this.aClass170_2.anInt4955 != local5) {
			this.aClass170_2 = Static261.method4379(local5);
		} else if (this.aClass170_2.anInt4968 == 0) {
			return;
		}
		if (this.aClass170_2.anIntArray652 == null) {
			this.aClass170_2 = null;
			return;
		}
		if (local11) {
			this.anInt4814 = (int) ((double) this.aClass170_2.anIntArray652.length * Math.random());
			this.anInt4834 = (int) (Math.random() * (double) this.aClass170_2.anIntArray650[this.anInt4814]) + 1;
		} else {
			this.anInt4834 = 1;
			this.anInt4814 = 0;
		}
		this.anInt4827 = this.anInt4814 + 1;
		if (this.anInt4827 < 0 || this.aClass170_2.anIntArray652.length <= this.anInt4827) {
			this.anInt4827 = -1;
		}
		this.anInt4836 = Static212.anInt4234 - this.anInt4834;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!pe;I)V")
	public void method4215(@OriginalArg(0) Class89 arg0) {
		this.method4216(this.anInt4823, arg0, true, 131072, this.anInt4820, true);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!pe;ZIIIZ)Lclient!sj;")
	public Class31 method4216(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) Class122 local10 = Static245.method4227(this.anInt4821);
		if (local10.anIntArray481 != null) {
			local10 = local10.method3234();
		}
		if (local10 == null) {
			this.method4217(arg1);
			this.anInt4815 = this.anInt4814;
			this.anInt4833 = -1;
			return null;
		}
		if (!this.aBoolean354 && this.anInt4833 != local10.anInt3534) {
			this.aClass31_5 = null;
			this.method4214(-1);
		}
		this.method4211(arg0, arg4);
		@Pc(68) boolean local68 = arg2 & this.aBoolean355 & Static336.anInt4180 != 0;
		@Pc(107) boolean local107 = local68 & (this.anInt4833 != local10.anInt3534 || (this.anInt4815 != this.anInt4814 || this.aClass170_2 != null && (this.aClass170_2.aBoolean363 || Static214.aBoolean327) && this.anInt4827 != this.anInt4814) && Static336.anInt4180 >= 2);
		if (arg5 && !local107) {
			this.anInt4833 = local10.anInt3534;
			this.anInt4815 = this.anInt4814;
			return null;
		}
		if (local107) {
			Static86.method1826(this.aClass7_Sub1_Sub4_4, this.aByte48, this.anInt4823, this.anInt4820, this.aBooleanArray22);
		}
		@Pc(139) Class8 local139 = Static331.aClass8Array5[this.aByte48];
		@Pc(146) Class8 local146;
		if (this.aBoolean356) {
			local146 = Static136.aClass8Array3[0];
		} else {
			local146 = this.aByte48 < 3 ? Static331.aClass8Array5[this.aByte48 + 1] : null;
		}
		@Pc(165) Class31 local165 = null;
		if (this.aClass170_2 != null) {
			if (local107) {
				arg3 |= 0x20000;
			}
			local165 = local10.method3240(local139.method4169(this.anInt4823, this.anInt4820), this.anInt4816 == 11 ? this.anInt4825 + 4 : this.anInt4825, this.anInt4814, local146, arg1, this.anInt4823, this.anInt4834, this.anInt4827, arg3, this.anInt4816 == 11 ? 10 : this.anInt4816, this.aClass170_2, local139, this.anInt4820);
			if (local165 == null) {
				this.aBooleanArray22 = null;
				this.aClass7_Sub1_Sub4_4 = null;
				this.anInt4812 = 0;
			} else {
				if (local107) {
					if (this.aBooleanArray22 == null) {
						this.aBooleanArray22 = new boolean[4];
					}
					this.aClass7_Sub1_Sub4_4 = local165.method1930(this.aClass7_Sub1_Sub4_4);
					Static33.method687(this.aClass7_Sub1_Sub4_4, this.aByte48, arg0, arg4, this.aBooleanArray22);
				}
				this.anInt4812 = local165.method1920();
			}
			this.aClass31_5 = null;
		} else if (this.aClass31_5 != null && (arg3 & this.aClass31_5.method1912()) == arg3 && local10.anInt3534 == this.anInt4833) {
			local165 = this.aClass31_5;
		} else {
			if (this.aClass31_5 != null) {
				arg3 |= this.aClass31_5.method1912();
			}
			@Pc(238) Class104 local238 = local10.method3229(this.anInt4820, this.anInt4816 == 11 ? this.anInt4825 + 4 : this.anInt4825, local107, arg1, local139, local146, this.anInt4816 == 11 ? 10 : this.anInt4816, local139.method4169(this.anInt4823, this.anInt4820), arg3, this.anInt4823);
			if (local238 == null) {
				this.anInt4812 = 0;
				this.aBooleanArray22 = null;
				this.aClass7_Sub1_Sub4_4 = null;
				this.aClass31_5 = null;
			} else {
				local165 = local238.aClass31_2;
				this.aClass31_5 = local238.aClass31_2;
				if (local107) {
					this.aClass7_Sub1_Sub4_4 = local238.aClass7_Sub1_Sub4_2;
					this.aBooleanArray22 = null;
					Static33.method687(this.aClass7_Sub1_Sub4_4, this.aByte48, arg0, arg4, null);
				}
				this.anInt4812 = local165.method1920();
			}
		}
		this.anInt4815 = this.anInt4814;
		this.anInt4823 = arg0;
		this.anInt4820 = arg4;
		this.anInt4833 = local10.anInt3534;
		return local165;
	}

	@OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass36_Sub3_4 != null) {
			this.aClass36_Sub3_4.method2173();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!pe;B)V")
	public void method4217(@OriginalArg(0) Class89 arg0) {
		if (this.aClass7_Sub1_Sub4_4 != null) {
			Static86.method1826(this.aClass7_Sub1_Sub4_4, this.aByte48, this.anInt4823, this.anInt4820, this.aBooleanArray22);
			this.aClass7_Sub1_Sub4_4 = null;
			this.aBooleanArray22 = null;
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Z")
	public boolean method4221() {
		return this.aBoolean355;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V")
	public void method4222(@OriginalArg(1) int arg0) {
		this.aBoolean354 = true;
		this.method4214(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I")
	public int method4223() {
		return this.anInt4812;
	}
}
