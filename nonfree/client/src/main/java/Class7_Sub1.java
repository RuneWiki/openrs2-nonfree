import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Lclient!r;")
	private Class171 aClass171_1;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!hs", name = "P", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
	private int anInt2972 = 0;

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "Lclient!dj;")
	private final Class43 aClass43_16 = new Class43(16);

	@OriginalMember(owner = "client!hs", name = "R", descriptor = "I")
	private int anInt2985 = 0;

	@OriginalMember(owner = "client!hs", name = "M", descriptor = "Lclient!kn;")
	private final Class116 aClass116_17 = new Class116();

	@OriginalMember(owner = "client!hs", name = "T", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "Lclient!we;")
	private final Class214 aClass214_3;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
	private final int anInt2968;

	@OriginalMember(owner = "client!hs", name = "Q", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "Lclient!kn;")
	private Class116 aClass116_18;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "Lclient!we;")
	private final Class214 aClass214_2;

	@OriginalMember(owner = "client!hs", name = "C", descriptor = "Lclient!as;")
	private final Class13 aClass13_2;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
	private final int anInt2975;

	@OriginalMember(owner = "client!hs", name = "J", descriptor = "I")
	private final int anInt2983;

	@OriginalMember(owner = "client!hs", name = "H", descriptor = "Lclient!ef;")
	private final Class53 aClass53_2;

	@OriginalMember(owner = "client!hs", name = "U", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "Lclient!qc;")
	private Class4_Sub4_Sub2 aClass4_Sub4_Sub2_1;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(ILclient!we;Lclient!we;Lclient!as;Lclient!ef;IIZ)V")
	public Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class214 arg2, @OriginalArg(3) Class13 arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass214_3 = arg1;
		this.anInt2968 = arg0;
		if (this.aClass214_3 == null) {
			this.aBoolean214 = false;
		} else {
			this.aBoolean214 = true;
			this.aClass116_18 = new Class116();
		}
		this.aClass214_2 = arg2;
		this.aClass13_2 = arg3;
		this.anInt2975 = arg5;
		this.anInt2983 = arg6;
		this.aClass53_2 = arg4;
		this.aBoolean215 = arg7;
		if (this.aClass214_2 != null) {
			this.aClass4_Sub4_Sub2_1 = this.aClass53_2.method1715(this.aClass214_2, this.anInt2968);
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(II)I")
	@Override
	public int method2584(@OriginalArg(1) int arg0) {
		@Pc(19) Class4_Sub4_Sub2 local19 = (Class4_Sub4_Sub2) this.aClass43_16.method1273((long) arg0);
		return local19 == null ? 0 : local19.method2405();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
	@Override
	public void method2579(@OriginalArg(0) int arg0) {
		if (this.aClass214_3 == null) {
			return;
		}
		for (@Pc(14) Class4 local14 = this.aClass116_17.method3270(); local14 != null; local14 = this.aClass116_17.method3272()) {
			if ((long) arg0 == local14.aLong223) {
				return;
			}
		}
		@Pc(38) Class4 local38 = new Class4();
		local38.aLong223 = arg0;
		this.aClass116_17.method3274(local38);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
	public void method2588() {
		if (this.aClass116_18 != null) {
			if (this.method2580() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class4 local23;
			@Pc(29) int local29;
			@Pc(118) Class4 local118;
			if (this.aBoolean214) {
				local18 = true;
				for (local23 = this.aClass116_18.method3270(); local23 != null; local23 = this.aClass116_18.method3272()) {
					local29 = (int) local23.aLong223;
					if (this.aByteArray47[local29] == 0) {
						this.method2593(1, local29);
					}
					if (this.aByteArray47[local29] == 0) {
						local18 = false;
					} else {
						local23.method5687();
					}
				}
				while (this.anInt2985 < this.aClass171_1.anIntArray437.length) {
					if (this.aClass171_1.anIntArray437[this.anInt2985] == 0) {
						this.anInt2985++;
					} else {
						if (this.aClass53_2.anInt1887 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray47[this.anInt2985] == 0) {
							this.method2593(1, this.anInt2985);
						}
						if (this.aByteArray47[this.anInt2985] == 0) {
							local118 = new Class4();
							local118.aLong223 = this.anInt2985;
							this.aClass116_18.method3274(local118);
							local18 = false;
						}
						this.anInt2985++;
					}
				}
				if (local18) {
					this.aBoolean214 = false;
					this.anInt2985 = 0;
				}
			} else if (this.aBoolean213) {
				local18 = true;
				for (local23 = this.aClass116_18.method3270(); local23 != null; local23 = this.aClass116_18.method3272()) {
					local29 = (int) local23.aLong223;
					if (this.aByteArray47[local29] != 1) {
						this.method2593(2, local29);
					}
					if (this.aByteArray47[local29] == 1) {
						local23.method5687();
					} else {
						local18 = false;
					}
				}
				while (this.anInt2985 < this.aClass171_1.anIntArray437.length) {
					if (this.aClass171_1.anIntArray437[this.anInt2985] == 0) {
						this.anInt2985++;
					} else {
						if (this.aClass13_2.method285()) {
							local18 = false;
							break;
						}
						if (this.aByteArray47[this.anInt2985] != 1) {
							this.method2593(2, this.anInt2985);
						}
						if (this.aByteArray47[this.anInt2985] != 1) {
							local118 = new Class4();
							local118.aLong223 = this.anInt2985;
							local18 = false;
							this.aClass116_18.method3274(local118);
						}
						this.anInt2985++;
					}
				}
				if (local18) {
					this.anInt2985 = 0;
					this.aBoolean213 = false;
				}
			} else {
				this.aClass116_18 = null;
			}
		}
		if (!this.aBoolean215 || Static208.method3879() < this.aLong88) {
			return;
		}
		for (@Pc(315) Class4_Sub4_Sub2 local315 = (Class4_Sub4_Sub2) this.aClass43_16.method1283(); local315 != null; local315 = (Class4_Sub4_Sub2) this.aClass43_16.method1278()) {
			if (!local315.aBoolean197) {
				if (local315.aBoolean196) {
					if (!local315.aBoolean198) {
						throw new RuntimeException();
					}
					local315.method5687();
				} else {
					local315.aBoolean196 = true;
				}
			}
		}
		this.aLong88 = Static208.method3879() + 1000L;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
	public void method2589() {
		if (this.aClass214_3 != null) {
			this.aBoolean213 = true;
			if (this.aClass116_18 == null) {
				this.aClass116_18 = new Class116();
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)I")
	public int method2590() {
		if (this.method2580() == null) {
			return this.aClass4_Sub4_Sub2_1 == null ? 0 : this.aClass4_Sub4_Sub2_1.method2405();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method2582(@OriginalArg(0) int arg0) {
		@Pc(9) Class4_Sub4_Sub2 local9 = this.method2593(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local9.method2408();
			local9.method5687();
			return local22;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
	public void method2592() {
		if (this.aClass116_18 == null || this.method2580() == null) {
			return;
		}
		for (@Pc(23) Class4 local23 = this.aClass116_17.method3270(); local23 != null; local23 = this.aClass116_17.method3272()) {
			@Pc(29) int local29 = (int) local23.aLong223;
			if (local29 < 0 || this.aClass171_1.anInt5365 <= local29 || this.aClass171_1.anIntArray437[local29] == 0) {
				local23.method5687();
			} else {
				if (this.aByteArray47[local29] == 0) {
					this.method2593(1, local29);
				}
				if (this.aByteArray47[local29] == -1) {
					this.method2593(2, local29);
				}
				if (this.aByteArray47[local29] == 1) {
					local23.method5687();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)Lclient!qc;")
	private Class4_Sub4_Sub2 method2593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub4_Sub2 local15 = (Class4_Sub4_Sub2) this.aClass43_16.method1273((long) arg1);
		if (local15 != null && arg0 == 0 && !local15.aBoolean198 && local15.aBoolean197) {
			local15.method5687();
			local15 = null;
		}
		if (local15 == null) {
			if (arg0 == 0) {
				if (this.aClass214_3 == null || this.aByteArray47[arg1] == -1) {
					if (this.aClass13_2.method288()) {
						return null;
					}
					local15 = this.aClass13_2.method294(this.anInt2968, true, arg1, (byte) 2);
				} else {
					local15 = this.aClass53_2.method1715(this.aClass214_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass214_3 == null) {
					throw new RuntimeException();
				}
				local15 = this.aClass53_2.method1720(arg1, this.aClass214_3);
			} else if (arg0 == 2) {
				if (this.aClass214_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray47[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass13_2.method285()) {
					return null;
				}
				local15 = this.aClass13_2.method294(this.anInt2968, false, arg1, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass43_16.method1276(local15, (long) arg1);
		}
		if (local15.aBoolean197) {
			return null;
		}
		@Pc(163) byte[] local163 = local15.method2408();
		@Pc(190) int local190;
		@Pc(292) Class4_Sub4_Sub2_Sub1 local292;
		if (!(local15 instanceof Class4_Sub4_Sub2_Sub2)) {
			try {
				if (local163 == null || local163.length <= 2) {
					throw new RuntimeException();
				}
				Static167.aCRC32_1.reset();
				Static167.aCRC32_1.update(local163, 0, local163.length - 2);
				local190 = (int) Static167.aCRC32_1.getValue();
				if (this.aClass171_1.anIntArray434[arg1] != local190) {
					throw new RuntimeException();
				}
				this.aClass13_2.anInt343 = 0;
				this.aClass13_2.anInt342 = 0;
			} catch (@Pc(348) RuntimeException local348) {
				this.aClass13_2.method292();
				local15.method5687();
				if (local15.aBoolean198 && !this.aClass13_2.method288()) {
					local292 = this.aClass13_2.method294(this.anInt2968, true, arg1, (byte) 2);
					this.aClass43_16.method1276(local292, (long) arg1);
				}
				return null;
			}
			local163[local163.length - 2] = (byte) (this.aClass171_1.anIntArray435[arg1] >>> 8);
			local163[local163.length - 1] = (byte) this.aClass171_1.anIntArray435[arg1];
			if (this.aClass214_3 != null) {
				this.aClass53_2.method1716(this.aClass214_3, arg1, local163);
				if (this.aByteArray47[arg1] != 1) {
					this.anInt2972++;
					this.aByteArray47[arg1] = 1;
				}
			}
			if (!local15.aBoolean198) {
				local15.method5687();
			}
			return local15;
		}
		try {
			if (local163 == null || local163.length <= 2) {
				throw new RuntimeException();
			}
			Static167.aCRC32_1.reset();
			Static167.aCRC32_1.update(local163, 0, local163.length - 2);
			local190 = (int) Static167.aCRC32_1.getValue();
			if (this.aClass171_1.anIntArray434[arg1] != local190) {
				throw new RuntimeException();
			}
			@Pc(221) int local221 = (local163[local163.length - 1] & 0xFF) + ((local163[local163.length - 2] & 0xFF) << 8);
			if (local221 != (this.aClass171_1.anIntArray435[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray47[arg1] != 1) {
				this.anInt2972++;
				this.aByteArray47[arg1] = 1;
			}
			if (!local15.aBoolean198) {
				local15.method5687();
			}
			return local15;
		} catch (@Pc(266) Exception local266) {
			this.aByteArray47[arg1] = -1;
			local15.method5687();
			if (local15.aBoolean198 && !this.aClass13_2.method288()) {
				local292 = this.aClass13_2.method294(this.anInt2968, true, arg1, (byte) 2);
				this.aClass43_16.method1276(local292, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)I")
	public int method2595() {
		return this.anInt2972;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)Lclient!r;")
	@Override
	public Class171 method2580() {
		if (this.aClass171_1 != null) {
			return this.aClass171_1;
		}
		if (this.aClass4_Sub4_Sub2_1 == null) {
			if (this.aClass13_2.method288()) {
				return null;
			}
			this.aClass4_Sub4_Sub2_1 = this.aClass13_2.method294(255, true, this.anInt2968, (byte) 0);
		}
		if (this.aClass4_Sub4_Sub2_1.aBoolean197) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass4_Sub4_Sub2_1.method2408();
		if (this.aClass4_Sub4_Sub2_1 instanceof Class4_Sub4_Sub2_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass171_1 = new Class171(local43, this.anInt2975);
				if (this.aClass171_1.anInt5366 != this.anInt2983) {
					throw new RuntimeException();
				}
			} catch (@Pc(81) RuntimeException local81) {
				this.aClass171_1 = null;
				if (this.aClass13_2.method288()) {
					this.aClass4_Sub4_Sub2_1 = null;
				} else {
					this.aClass4_Sub4_Sub2_1 = this.aClass13_2.method294(255, true, this.anInt2968, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass171_1 = new Class171(local43, this.anInt2975);
			} catch (@Pc(123) RuntimeException local123) {
				this.aClass13_2.method292();
				this.aClass171_1 = null;
				if (this.aClass13_2.method288()) {
					this.aClass4_Sub4_Sub2_1 = null;
				} else {
					this.aClass4_Sub4_Sub2_1 = this.aClass13_2.method294(255, true, this.anInt2968, (byte) 0);
				}
				return null;
			}
			if (this.aClass214_2 != null) {
				this.aClass53_2.method1716(this.aClass214_2, this.anInt2968, local43);
			}
		}
		this.aClass4_Sub4_Sub2_1 = null;
		if (this.aClass214_3 != null) {
			this.anInt2972 = 0;
			this.aByteArray47 = new byte[this.aClass171_1.anInt5365];
		}
		return this.aClass171_1;
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(B)I")
	public int method2596() {
		if (this.aClass171_1 == null) {
			return 0;
		} else if (this.aBoolean214) {
			@Pc(26) Class4 local26 = this.aClass116_18.method3270();
			return local26 == null ? 0 : (int) local26.aLong223;
		} else {
			return this.aClass171_1.anInt5364;
		}
	}

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "(I)I")
	public int method2598() {
		return this.aClass171_1 == null ? 0 : this.aClass171_1.anInt5364;
	}
}
