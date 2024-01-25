import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Lclient!nq;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!eo", name = "I", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
	private int anInt2734 = 0;

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "Lclient!qn;")
	private final Class313 aClass313_14 = new Class313(16);

	@OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
	private int anInt2749 = 0;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Lclient!sja;")
	private final Class342 aClass342_23 = new Class342();

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "J")
	private long aLong103 = 0L;

	@OriginalMember(owner = "client!eo", name = "E", descriptor = "Lclient!jq;")
	private final Class199 aClass199_1;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	private final int anInt2739;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "client!eo", name = "C", descriptor = "Lclient!sja;")
	private Class342 aClass342_22;

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "I")
	private final int anInt2742;

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
	private final int anInt2735;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Lclient!su;")
	private final Class349 aClass349_2;

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "Z")
	private final boolean aBoolean177;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "Lclient!jq;")
	private final Class199 aClass199_2;

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "Lclient!ig;")
	private final Class176 aClass176_2;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Lclient!ek;")
	private Class3_Sub7_Sub7 aClass3_Sub7_Sub7_1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(ILclient!jq;Lclient!jq;Lclient!su;Lclient!ig;I[BIZ)V")
	public Class102_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(3) Class349 arg3, @OriginalArg(4) Class176 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass199_1 = arg1;
		this.anInt2739 = arg0;
		if (this.aClass199_1 == null) {
			this.aBoolean176 = false;
		} else {
			this.aBoolean176 = true;
			this.aClass342_22 = new Class342();
		}
		this.anInt2742 = arg7;
		this.aByteArray23 = arg6;
		this.anInt2735 = arg5;
		this.aClass349_2 = arg3;
		this.aBoolean177 = arg8;
		this.aClass199_2 = arg2;
		this.aClass176_2 = arg4;
		if (this.aClass199_2 != null) {
			this.aClass3_Sub7_Sub7_1 = this.aClass176_2.method3850(this.aClass199_2, this.anInt2739);
		}
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)I")
	public int method2514() {
		return this.aClass269_1 == null ? 0 : this.aClass269_1.anInt6894;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)V")
	@Override
	public void method2509(@OriginalArg(0) int arg0) {
		if (this.aClass199_1 == null) {
			return;
		}
		for (@Pc(20) Class3 local20 = this.aClass342_23.method7644(); local20 != null; local20 = this.aClass342_23.method7650()) {
			if ((long) arg0 == local20.aLong345) {
				return;
			}
		}
		@Pc(47) Class3 local47 = new Class3();
		local47.aLong345 = (long) arg0;
		this.aClass342_23.method7654(local47);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)Lclient!ek;")
	private Class3_Sub7_Sub7 method2515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class3_Sub7_Sub7 local21 = (Class3_Sub7_Sub7) this.aClass313_14.method7104((long) arg1);
		if (local21 != null && arg0 == 0 && !local21.aBoolean538 && local21.aBoolean537) {
			local21.method9596();
			local21 = null;
		}
		if (local21 == null) {
			if (arg0 == 0) {
				if (this.aClass199_1 == null || this.aByteArray24[arg1] == -1) {
					if (this.aClass349_2.method7773()) {
						return null;
					}
					local21 = this.aClass349_2.method7774(arg1, this.anInt2739, true, (byte) 2);
				} else {
					local21 = this.aClass176_2.method3850(this.aClass199_1, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass199_1 == null) {
					throw new RuntimeException();
				}
				local21 = this.aClass176_2.method3851(this.aClass199_1, arg1);
			} else if (arg0 == 2) {
				if (this.aClass199_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray24[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass349_2.method7767()) {
					return null;
				}
				local21 = this.aClass349_2.method7774(arg1, this.anInt2739, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass313_14.method7107((long) arg1, local21);
		}
		if (local21.aBoolean537) {
			return null;
		}
		@Pc(190) byte[] local190 = local21.method6874();
		@Pc(220) int local220;
		@Pc(254) byte[] local254;
		@Pc(263) byte[] local263;
		@Pc(265) int local265;
		@Pc(387) Class3_Sub7_Sub7_Sub1 local387;
		if (!(local21 instanceof Class3_Sub7_Sub7_Sub2)) {
			try {
				label157: {
					if (local190 != null && local190.length > 2) {
						Static287.aCRC32_2.reset();
						Static287.aCRC32_2.update(local190, 0, local190.length - 2);
						local220 = (int) Static287.aCRC32_2.getValue();
						if (this.aClass269_1.anIntArray506[arg1] != local220) {
							throw new RuntimeException();
						}
						if (this.aClass269_1.aByteArrayArray11 == null || this.aClass269_1.aByteArrayArray11[arg1] == null) {
							break label157;
						}
						local254 = this.aClass269_1.aByteArrayArray11[arg1];
						local263 = Static101.method1985(0, local190, local190.length - 2);
						local265 = 0;
						while (true) {
							if (local265 >= 64) {
								break label157;
							}
							if (local263[local265] != local254[local265]) {
								throw new RuntimeException();
							}
							local265++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass349_2.anInt9191 = 0;
				this.aClass349_2.anInt9192 = 0;
			} catch (@Pc(500) RuntimeException local500) {
				this.aClass349_2.method7765();
				local21.method9596();
				if (local21.aBoolean538 && !this.aClass349_2.method7773()) {
					local387 = this.aClass349_2.method7774(arg1, this.anInt2739, true, (byte) 2);
					this.aClass313_14.method7107((long) arg1, local387);
				}
				return null;
			}
			local190[local190.length - 2] = (byte) (this.aClass269_1.anIntArray508[arg1] >>> 8);
			local190[local190.length - 1] = (byte) this.aClass269_1.anIntArray508[arg1];
			if (this.aClass199_1 != null) {
				this.aClass176_2.method3857(arg1, this.aClass199_1, local190);
				if (this.aByteArray24[arg1] != 1) {
					this.anInt2734++;
					this.aByteArray24[arg1] = 1;
				}
			}
			if (!local21.aBoolean538) {
				local21.method9596();
			}
			return local21;
		}
		try {
			if (local190 == null || local190.length <= 2) {
				throw new RuntimeException();
			}
			Static287.aCRC32_2.reset();
			Static287.aCRC32_2.update(local190, 0, local190.length - 2);
			local220 = (int) Static287.aCRC32_2.getValue();
			if (local220 != this.aClass269_1.anIntArray506[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass269_1.aByteArrayArray11 != null && this.aClass269_1.aByteArrayArray11[arg1] != null) {
				local254 = this.aClass269_1.aByteArrayArray11[arg1];
				local263 = Static101.method1985(0, local190, local190.length - 2);
				for (local265 = 0; local265 < 64; local265++) {
					if (local254[local265] != local263[local265]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(309) int local309 = (local190[local190.length - 1] & 0xFF) + ((local190[local190.length - 2] & 0xFF) << 8);
			if (local309 != (this.aClass269_1.anIntArray508[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray24[arg1] != 1) {
				this.anInt2734++;
				this.aByteArray24[arg1] = 1;
			}
			if (!local21.aBoolean538) {
				local21.method9596();
			}
			return local21;
		} catch (@Pc(359) Exception local359) {
			this.aByteArray24[arg1] = -1;
			local21.method9596();
			if (local21.aBoolean538 && !this.aClass349_2.method7773()) {
				local387 = this.aClass349_2.method7774(arg1, this.anInt2739, true, (byte) 2);
				this.aClass313_14.method7107((long) arg1, local387);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)I")
	public int method2516() {
		if (this.aClass269_1 == null) {
			return 0;
		} else if (this.aBoolean176) {
			@Pc(30) Class3 local30 = this.aClass342_22.method7644();
			return local30 == null ? 0 : (int) local30.aLong345;
		} else {
			return this.aClass269_1.anInt6894;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public void method2517() {
		if (this.aClass342_22 != null) {
			if (this.method2508() == null) {
				return;
			}
			@Pc(33) boolean local33;
			@Pc(38) Class3 local38;
			@Pc(44) int local44;
			@Pc(147) Class3 local147;
			if (this.aBoolean176) {
				local33 = true;
				for (local38 = this.aClass342_22.method7644(); local38 != null; local38 = this.aClass342_22.method7650()) {
					local44 = (int) local38.aLong345;
					if (this.aByteArray24[local44] == 0) {
						this.method2515(1, local44);
					}
					if (this.aByteArray24[local44] == 0) {
						local33 = false;
					} else {
						local38.method9596();
					}
				}
				while (this.aClass269_1.anIntArray507.length > this.anInt2749) {
					if (this.aClass269_1.anIntArray507[this.anInt2749] == 0) {
						this.anInt2749++;
					} else {
						if (this.aClass176_2.anInt4202 >= 250) {
							local33 = false;
							break;
						}
						if (this.aByteArray24[this.anInt2749] == 0) {
							this.method2515(1, this.anInt2749);
						}
						if (this.aByteArray24[this.anInt2749] == 0) {
							local147 = new Class3();
							local147.aLong345 = (long) this.anInt2749;
							local33 = false;
							this.aClass342_22.method7654(local147);
						}
						this.anInt2749++;
					}
				}
				if (local33) {
					this.anInt2749 = 0;
					this.aBoolean176 = false;
				}
			} else if (this.aBoolean175) {
				local33 = true;
				for (local38 = this.aClass342_22.method7644(); local38 != null; local38 = this.aClass342_22.method7650()) {
					local44 = (int) local38.aLong345;
					if (this.aByteArray24[local44] != 1) {
						this.method2515(2, local44);
					}
					if (this.aByteArray24[local44] == 1) {
						local38.method9596();
					} else {
						local33 = false;
					}
				}
				while (this.aClass269_1.anIntArray507.length > this.anInt2749) {
					if (this.aClass269_1.anIntArray507[this.anInt2749] == 0) {
						this.anInt2749++;
					} else {
						if (this.aClass349_2.method7767()) {
							local33 = false;
							break;
						}
						if (this.aByteArray24[this.anInt2749] != 1) {
							this.method2515(2, this.anInt2749);
						}
						if (this.aByteArray24[this.anInt2749] != 1) {
							local147 = new Class3();
							local147.aLong345 = (long) this.anInt2749;
							local33 = false;
							this.aClass342_22.method7654(local147);
						}
						this.anInt2749++;
					}
				}
				if (local33) {
					this.anInt2749 = 0;
					this.aBoolean175 = false;
				}
			} else {
				this.aClass342_22 = null;
			}
		}
		if (!this.aBoolean177 || this.aLong103 > Static517.method6965()) {
			return;
		}
		for (@Pc(374) Class3_Sub7_Sub7 local374 = (Class3_Sub7_Sub7) this.aClass313_14.method7103(); local374 != null; local374 = (Class3_Sub7_Sub7) this.aClass313_14.method7110()) {
			if (!local374.aBoolean537) {
				if (local374.aBoolean539) {
					if (!local374.aBoolean538) {
						throw new RuntimeException();
					}
					local374.method9596();
				} else {
					local374.aBoolean539 = true;
				}
			}
		}
		this.aLong103 = Static517.method6965() + 1000L;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Lclient!nq;")
	@Override
	public Class269 method2508() {
		if (this.aClass269_1 != null) {
			return this.aClass269_1;
		}
		if (this.aClass3_Sub7_Sub7_1 == null) {
			if (this.aClass349_2.method7773()) {
				return null;
			}
			this.aClass3_Sub7_Sub7_1 = this.aClass349_2.method7774(this.anInt2739, 255, true, (byte) 0);
		}
		if (this.aClass3_Sub7_Sub7_1.aBoolean537) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass3_Sub7_Sub7_1.method6874();
		if (this.aClass3_Sub7_Sub7_1 instanceof Class3_Sub7_Sub7_Sub2) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass269_1 = new Class269(local50, this.anInt2735, this.aByteArray23);
				if (this.aClass269_1.anInt6897 != this.anInt2742) {
					throw new RuntimeException();
				}
			} catch (@Pc(83) RuntimeException local83) {
				this.aClass269_1 = null;
				if (this.aClass349_2.method7773()) {
					this.aClass3_Sub7_Sub7_1 = null;
				} else {
					this.aClass3_Sub7_Sub7_1 = this.aClass349_2.method7774(this.anInt2739, 255, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass269_1 = new Class269(local50, this.anInt2735, this.aByteArray23);
			} catch (@Pc(132) RuntimeException local132) {
				this.aClass349_2.method7765();
				this.aClass269_1 = null;
				if (this.aClass349_2.method7773()) {
					this.aClass3_Sub7_Sub7_1 = null;
				} else {
					this.aClass3_Sub7_Sub7_1 = this.aClass349_2.method7774(this.anInt2739, 255, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass199_2 != null) {
				this.aClass176_2.method3857(this.anInt2739, this.aClass199_2, local50);
			}
		}
		this.aClass3_Sub7_Sub7_1 = null;
		if (this.aClass199_1 != null) {
			this.anInt2734 = 0;
			this.aByteArray24 = new byte[this.aClass269_1.anInt6892];
		}
		return this.aClass269_1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I")
	public int method2518() {
		return this.anInt2734;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)I")
	@Override
	public int method2510(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub7_Sub7 local16 = (Class3_Sub7_Sub7) this.aClass313_14.method7104((long) arg0);
		return local16 == null ? 0 : local16.method6875();
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
	public void method2519() {
		if (this.aClass342_22 == null || this.method2508() == null) {
			return;
		}
		for (@Pc(21) Class3 local21 = this.aClass342_23.method7644(); local21 != null; local21 = this.aClass342_23.method7650()) {
			@Pc(35) int local35 = (int) local21.aLong345;
			if (local35 < 0 || local35 >= this.aClass269_1.anInt6892 || this.aClass269_1.anIntArray507[local35] == 0) {
				local21.method9596();
			} else {
				if (this.aByteArray24[local35] == 0) {
					this.method2515(1, local35);
				}
				if (this.aByteArray24[local35] == -1) {
					this.method2515(2, local35);
				}
				if (this.aByteArray24[local35] == 1) {
					local21.method9596();
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method2511(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub7_Sub7 local9 = this.method2515(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(28) byte[] local28 = local9.method6874();
			local9.method9596();
			return local28;
		}
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	public void method2520() {
		if (this.aClass199_1 != null) {
			this.aBoolean175 = true;
			if (this.aClass342_22 == null) {
				this.aClass342_22 = new Class342();
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(Z)I")
	public int method2521() {
		if (this.method2508() == null) {
			return this.aClass3_Sub7_Sub7_1 == null ? 0 : this.aClass3_Sub7_Sub7_1.method6875();
		} else {
			return 100;
		}
	}
}
