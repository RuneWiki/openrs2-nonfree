import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class115 {

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "Lclient!c;")
	private Class9 aClass9_3;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Lclient!kf;")
	private Class128 aClass128_2;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	private int anInt3436;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
	private int anInt3437;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "Lclient!wk;")
	public Class6_Sub8 aClass6_Sub8_5;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	private int anInt3444;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
	private int anInt3446;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Lclient!j;")
	private Class3_Sub4_Sub4 aClass3_Sub4_Sub4_3;

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "[Z")
	private boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Z")
	private boolean aBoolean294 = false;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	private int anInt3433 = -1;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
	private int anInt3448 = -1;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Z")
	private boolean aBoolean293 = false;

	@OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
	private int anInt3455 = -32768;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	public final int anInt3443;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
	private int anInt3441;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
	public final int anInt3450;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	private int anInt3440;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public final int anInt3435;

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "Z")
	private final boolean aBoolean295;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!qa;Lclient!gm;IIIIIIZI)V")
	public Class115(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt3443 = arg2;
		this.anInt3441 = arg7;
		this.anInt3450 = arg1.anInt2747;
		this.anInt3440 = arg6;
		this.aByte60 = (byte) arg5;
		this.aByte61 = (byte) arg4;
		this.anInt3435 = arg3;
		this.aBoolean294 = arg8;
		this.aBoolean295 = arg0.method5513() && arg1.aBoolean257 && !this.aBoolean294;
		if (arg9 != -1) {
			this.aBoolean293 = true;
		}
		this.method2759(arg9);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
	private void method2759(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(7) boolean local7 = false;
		if (arg0 == -1) {
			@Pc(16) Class93 local16 = Static435.aClass30_4.method769(this.anInt3450);
			@Pc(18) Class93 local18 = local16;
			if (local16.anIntArray171 != null) {
				local16 = local16.method2066(Static85.aClass49_1);
			}
			if (local16 == null) {
				return;
			}
			if (local16 == local18) {
				local18 = null;
			}
			if (local16.anIntArray169 != null) {
				if (this.aClass128_2 != null && local16.method2056(this.aClass128_2.anInt3967)) {
					return;
				}
				local5 = local16.method2071();
				if (this.anInt3448 != local16.anInt2747) {
					local7 = local16.aBoolean255;
				}
			} else if (local16.anInt2763 == -1) {
				if (local18 != null && local18.anIntArray169 != null) {
					if (this.aClass128_2 != null && local18.method2056(this.aClass128_2.anInt3967)) {
						return;
					}
					local5 = local18.method2071();
					if (this.anInt3448 != local18.anInt2747) {
						local7 = local18.aBoolean255;
					}
				} else if (local18 != null && local18.anInt2763 != -1 && local18.anInt2747 != this.anInt3448) {
					local7 = local18.aBoolean255;
					local5 = local18.anInt2763;
				}
			} else if (local16.anInt2747 != this.anInt3448) {
				local7 = local16.aBoolean255;
				local5 = local16.anInt2763;
			}
		}
		if (local5 == -1) {
			this.aClass128_2 = null;
			return;
		}
		this.aClass9_3 = null;
		if (this.aClass128_2 == null || this.aClass128_2.anInt3967 != local5) {
			this.aClass128_2 = Static301.aClass170_3.method3936(local5);
		} else if (this.aClass128_2.anInt3973 == 0) {
			return;
		}
		if (this.aClass128_2.anIntArray252 == null) {
			this.aClass128_2 = null;
			return;
		}
		if (local7) {
			this.anInt3436 = (int) ((double) this.aClass128_2.anIntArray252.length * Math.random());
			this.anInt3437 = (int) ((double) this.aClass128_2.anIntArray254[this.anInt3436] * Math.random()) + 1;
		} else {
			this.anInt3436 = 0;
			this.anInt3437 = 1;
		}
		this.anInt3444 = this.anInt3436 + 1;
		if (this.anInt3444 < 0 || this.anInt3444 >= this.aClass128_2.anIntArray252.length) {
			this.anInt3444 = -1;
		}
		this.anInt3446 = Static253.anInt4787 - this.anInt3437;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method2760(@OriginalArg(0) Class172 arg0) {
		if (this.aClass3_Sub4_Sub4_3 != null) {
			Static206.method3200(this.aClass3_Sub4_Sub4_3, this.aByte60, this.anInt3440, this.anInt3441, this.aBooleanArray13);
			this.aBooleanArray13 = null;
			this.aClass3_Sub4_Sub4_3 = null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBLclient!qa;IIZLclient!c;I)V")
	public void method2762(@OriginalArg(0) int arg0, @OriginalArg(2) Class172 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class9 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class269[] local12 = arg5.method5680();
		@Pc(15) Class165[] local15 = arg5.method5685();
		if ((this.aClass6_Sub8_5 == null || this.aClass6_Sub8_5.aBoolean653) && (local12 != null || local15 != null)) {
			@Pc(32) Class93 local32 = Static435.aClass30_4.method769(this.anInt3450);
			if (local32.anIntArray171 != null) {
				local32 = local32.method2066(Static85.aClass49_1);
			}
			if (local32 != null) {
				this.aClass6_Sub8_5 = new Class6_Sub8(Static253.anInt4787);
			}
		}
		if (this.aClass6_Sub8_5 == null) {
			return;
		}
		if (arg4) {
			this.aClass6_Sub8_5.method5920(arg1, (long) Static253.anInt4787, local12, local15);
		} else {
			this.aClass6_Sub8_5.method5922((long) Static253.anInt4787);
		}
		this.aClass6_Sub8_5.method5917(this.aByte61, arg2, arg3, arg6, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
	public void method2763(@OriginalArg(0) int arg0) {
		this.aBoolean293 = true;
		this.method2759(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Lclient!qa;B)V")
	public void method2764(@OriginalArg(0) Class172 arg0) {
		this.method2765(262144, true, arg0, this.anInt3441, true, this.anInt3440);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIZLclient!qa;IZI)Lclient!c;")
	public Class9 method2765(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class172 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class93 local11 = Static435.aClass30_4.method769(this.anInt3450);
		if (local11.anIntArray171 != null) {
			local11 = local11.method2066(Static85.aClass49_1);
		}
		if (local11 == null) {
			this.method2760(arg2);
			this.anInt3433 = this.anInt3436;
			this.anInt3448 = -1;
			return null;
		}
		if (!this.aBoolean293 && this.anInt3448 != local11.anInt2747) {
			this.aClass9_3 = null;
			this.method2759(-1);
		}
		this.method2767(arg5, arg3);
		@Pc(71) boolean local71 = arg1 & this.aBoolean295 & Static374.aClass20_Sub1_1.method1806(Static105.anInt2382) != 0;
		@Pc(117) boolean local117 = local71 & (local11.anInt2747 != this.anInt3448 || (this.anInt3433 != this.anInt3436 || this.aClass128_2 != null && (this.aClass128_2.aBoolean341 || Static262.aBoolean439) && this.anInt3444 != this.anInt3436) && Static374.aClass20_Sub1_1.method1806(Static105.anInt2382) >= 2);
		if (arg4 && !local117) {
			this.anInt3448 = local11.anInt2747;
			this.anInt3433 = this.anInt3436;
			return null;
		}
		if (local117) {
			Static206.method3200(this.aClass3_Sub4_Sub4_3, this.aByte60, this.anInt3440, this.anInt3441, this.aBooleanArray13);
		}
		@Pc(149) Class159 local149 = Static444.aClass159Array3[this.aByte60];
		@Pc(167) Class159 local167;
		if (this.aBoolean294) {
			local167 = Static26.aClass159Array1[0];
		} else {
			local167 = this.aByte60 >= 3 ? null : Static444.aClass159Array3[this.aByte60 + 1];
		}
		@Pc(175) Class9 local175 = null;
		if (this.aClass128_2 != null) {
			if (local117) {
				arg0 |= 0x40000;
			}
			local175 = local11.method2069(this.anInt3443 == 11 ? this.anInt3435 + 4 : this.anInt3435, this.anInt3443 == 11 ? 10 : this.anInt3443, this.aClass128_2, arg2, this.anInt3440, this.anInt3436, local149, local167, this.anInt3441, local149.va(this.anInt3440, this.anInt3441), arg0, this.anInt3444, this.anInt3437);
			if (local175 == null) {
				this.aClass3_Sub4_Sub4_3 = null;
				this.aBooleanArray13 = null;
				this.anInt3455 = 0;
			} else {
				if (local117) {
					if (this.aBooleanArray13 == null) {
						this.aBooleanArray13 = new boolean[4];
					}
					this.aClass3_Sub4_Sub4_3 = local175.ua(this.aClass3_Sub4_Sub4_3);
					Static218.method3304(this.aClass3_Sub4_Sub4_3, this.aByte60, arg5, arg3, this.aBooleanArray13);
				}
				this.anInt3455 = local175.b();
			}
			this.aClass9_3 = null;
		} else if (this.aClass9_3 != null && arg0 == (this.aClass9_3.n() & arg0) && local11.anInt2747 == this.anInt3448) {
			local175 = this.aClass9_3;
		} else {
			if (this.aClass9_3 != null) {
				arg0 |= this.aClass9_3.n();
			}
			@Pc(348) Class157 local348 = local11.method2060(this.anInt3440, this.anInt3441, this.anInt3443 == 11 ? this.anInt3435 + 4 : this.anInt3435, local167, arg0, local117, arg2, local149, this.anInt3443 == 11 ? 10 : this.anInt3443, local149.va(this.anInt3440, this.anInt3441));
			if (local348 == null) {
				this.anInt3455 = 0;
				this.aClass9_3 = null;
				this.aClass3_Sub4_Sub4_3 = null;
				this.aBooleanArray13 = null;
			} else {
				local175 = local348.aClass9_6;
				this.aClass9_3 = local348.aClass9_6;
				if (local117) {
					this.aBooleanArray13 = null;
					this.aClass3_Sub4_Sub4_3 = local348.aClass3_Sub4_Sub4_5;
					Static218.method3304(this.aClass3_Sub4_Sub4_3, this.aByte60, arg5, arg3, null);
				}
				this.anInt3455 = local175.b();
			}
		}
		this.anInt3433 = this.anInt3436;
		this.anInt3440 = arg5;
		this.anInt3448 = local11.anInt2747;
		this.anInt3441 = arg3;
		return local175;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Z")
	public boolean method2766() {
		return this.aBoolean295;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)V")
	private void method2767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass128_2 == null) {
				if (this.aBoolean293) {
					return;
				}
				this.method2759(-1);
				if (this.aClass128_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static253.anInt4787 - this.anInt3446;
			if (local32 > 100 && this.aClass128_2.anInt3970 > 0) {
				@Pc(54) int local54 = this.aClass128_2.anIntArray252.length - this.aClass128_2.anInt3970;
				while (this.anInt3436 < local54 && local32 > this.aClass128_2.anIntArray254[this.anInt3436]) {
					local32 -= this.aClass128_2.anIntArray254[this.anInt3436];
					this.anInt3436++;
				}
				if (local54 <= this.anInt3436) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local54; local95 < this.aClass128_2.anIntArray252.length; local95++) {
						local93 += this.aClass128_2.anIntArray254[local95];
					}
					local32 %= local93;
				}
				this.anInt3444 = this.anInt3436 + 1;
				if (this.anInt3444 >= this.aClass128_2.anIntArray252.length) {
					this.anInt3444 -= this.aClass128_2.anInt3970;
					if (this.anInt3444 < 0 || this.aClass128_2.anIntArray252.length <= this.anInt3444) {
						this.anInt3444 = -1;
					}
				}
			}
			while (this.aClass128_2.anIntArray254[this.anInt3436] < local32) {
				Static135.method2140(this.anInt3436, this.aClass128_2, arg1, false, arg0, this.aByte61);
				local32 -= this.aClass128_2.anIntArray254[this.anInt3436];
				this.anInt3436++;
				if (this.anInt3436 >= this.aClass128_2.anIntArray252.length) {
					this.anInt3436 -= this.aClass128_2.anInt3970;
					if (this.anInt3436 < 0 || this.aClass128_2.anIntArray252.length <= this.anInt3436) {
						this.aClass128_2 = null;
						continue label80;
					}
				}
				this.anInt3444 = this.anInt3436 + 1;
				if (this.aClass128_2.anIntArray252.length <= this.anInt3444) {
					this.anInt3444 -= this.aClass128_2.anInt3970;
					if (this.anInt3444 < 0 || this.anInt3444 >= this.aClass128_2.anIntArray252.length) {
						this.anInt3444 = -1;
					}
				}
			}
			this.anInt3446 = Static253.anInt4787 - local32;
			this.anInt3437 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
	public int method2769() {
		return this.anInt3455;
	}

	@OriginalMember(owner = "client!ik", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub8_5 != null) {
			this.aClass6_Sub8_5.method5919();
		}
	}
}
