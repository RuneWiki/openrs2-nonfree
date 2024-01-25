import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!at", name = "q", descriptor = "Lclient!sia;")
	private Class319 aClass319_1;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!at", name = "H", descriptor = "Z")
	private boolean aBoolean45;

	@OriginalMember(owner = "client!at", name = "F", descriptor = "I")
	private int anInt598 = 0;

	@OriginalMember(owner = "client!at", name = "v", descriptor = "Lclient!gca;")
	private final Class118 aClass118_4 = new Class118(16);

	@OriginalMember(owner = "client!at", name = "L", descriptor = "I")
	private int anInt600 = 0;

	@OriginalMember(owner = "client!at", name = "K", descriptor = "Lclient!fha;")
	private final Class109 aClass109_4 = new Class109();

	@OriginalMember(owner = "client!at", name = "O", descriptor = "J")
	private long aLong19 = 0L;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "I")
	private final int anInt584;

	@OriginalMember(owner = "client!at", name = "C", descriptor = "Lclient!hca;")
	private final Class135 aClass135_2;

	@OriginalMember(owner = "client!at", name = "M", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!at", name = "I", descriptor = "Lclient!fha;")
	private Class109 aClass109_3;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "Lclient!fd;")
	private final Class104 aClass104_1;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!at", name = "N", descriptor = "Z")
	private final boolean aBoolean47;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "Lclient!wm;")
	private final Class376 aClass376_1;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "Lclient!hca;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!at", name = "h", descriptor = "I")
	private final int anInt583;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "I")
	private final int anInt589;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!in;")
	private Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(ILclient!hca;Lclient!hca;Lclient!fd;Lclient!wm;I[BIZ)V")
	public Class20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(2) Class135 arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) Class376 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt584 = arg0;
		this.aClass135_2 = arg1;
		if (this.aClass135_2 == null) {
			this.aBoolean46 = false;
		} else {
			this.aBoolean46 = true;
			this.aClass109_3 = new Class109();
		}
		this.aClass104_1 = arg3;
		this.aByteArray7 = arg6;
		this.aBoolean47 = arg8;
		this.aClass376_1 = arg4;
		this.aClass135_1 = arg2;
		this.anInt583 = arg7;
		this.anInt589 = arg5;
		if (this.aClass135_1 != null) {
			this.aClass2_Sub2_Sub1_1 = this.aClass376_1.method8482(this.anInt584, this.aClass135_1);
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)I")
	public int method468() {
		return this.anInt598;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)V")
	@Override
	public void method462(@OriginalArg(1) int arg0) {
		if (this.aClass135_2 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass109_4.method2325(); local14 != null; local14 = this.aClass109_4.method2318()) {
			if ((long) arg0 == local14.aLong280) {
				return;
			}
		}
		@Pc(38) Class2 local38 = new Class2();
		local38.aLong280 = arg0;
		this.aClass109_4.method2323(local38);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)V")
	public void method469() {
		if (this.aClass109_3 != null) {
			if (this.method466() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class2 local23;
			@Pc(29) int local29;
			@Pc(116) Class2 local116;
			if (this.aBoolean46) {
				local18 = true;
				for (local23 = this.aClass109_3.method2325(); local23 != null; local23 = this.aClass109_3.method2318()) {
					local29 = (int) local23.aLong280;
					if (this.aByteArray8[local29] == 0) {
						this.method471(local29, 1);
					}
					if (this.aByteArray8[local29] == 0) {
						local18 = false;
					} else {
						local23.method8653();
					}
				}
				while (this.aClass319_1.anIntArray586.length > this.anInt600) {
					if (this.aClass319_1.anIntArray586[this.anInt600] == 0) {
						this.anInt600++;
					} else {
						if (this.aClass376_1.anInt10191 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray8[this.anInt600] == 0) {
							this.method471(this.anInt600, 1);
						}
						if (this.aByteArray8[this.anInt600] == 0) {
							local116 = new Class2();
							local116.aLong280 = this.anInt600;
							local18 = false;
							this.aClass109_3.method2323(local116);
						}
						this.anInt600++;
					}
				}
				if (local18) {
					this.anInt600 = 0;
					this.aBoolean46 = false;
				}
			} else if (this.aBoolean45) {
				local18 = true;
				for (local23 = this.aClass109_3.method2325(); local23 != null; local23 = this.aClass109_3.method2318()) {
					local29 = (int) local23.aLong280;
					if (this.aByteArray8[local29] != 1) {
						this.method471(local29, 2);
					}
					if (this.aByteArray8[local29] == 1) {
						local23.method8653();
					} else {
						local18 = false;
					}
				}
				while (this.aClass319_1.anIntArray586.length > this.anInt600) {
					if (this.aClass319_1.anIntArray586[this.anInt600] == 0) {
						this.anInt600++;
					} else {
						if (this.aClass104_1.method2239()) {
							local18 = false;
							break;
						}
						if (this.aByteArray8[this.anInt600] != 1) {
							this.method471(this.anInt600, 2);
						}
						if (this.aByteArray8[this.anInt600] != 1) {
							local116 = new Class2();
							local116.aLong280 = this.anInt600;
							local18 = false;
							this.aClass109_3.method2323(local116);
						}
						this.anInt600++;
					}
				}
				if (local18) {
					this.aBoolean45 = false;
					this.anInt600 = 0;
				}
			} else {
				this.aClass109_3 = null;
			}
		}
		if (!this.aBoolean47 || this.aLong19 > Static476.method6413()) {
			return;
		}
		for (@Pc(315) Class2_Sub2_Sub1 local315 = (Class2_Sub2_Sub1) this.aClass118_4.method2596(); local315 != null; local315 = (Class2_Sub2_Sub1) this.aClass118_4.method2597()) {
			if (!local315.aBoolean283) {
				if (local315.aBoolean282) {
					if (!local315.aBoolean281) {
						throw new RuntimeException();
					}
					local315.method8653();
				} else {
					local315.aBoolean282 = true;
				}
			}
		}
		this.aLong19 = Static476.method6413() + 1000L;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method465(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub2_Sub1 local9 = this.method471(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method3401();
			local9.method8653();
			return local17;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
	public void method470() {
		if (this.aClass135_2 != null) {
			this.aBoolean45 = true;
			if (this.aClass109_3 == null) {
				this.aClass109_3 = new Class109();
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIB)Lclient!in;")
	private Class2_Sub2_Sub1 method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class2_Sub2_Sub1 local18 = (Class2_Sub2_Sub1) this.aClass118_4.method2595((long) arg0);
		if (local18 != null && arg1 == 0 && !local18.aBoolean281 && local18.aBoolean283) {
			local18.method8653();
			local18 = null;
		}
		if (local18 == null) {
			if (arg1 == 0) {
				if (this.aClass135_2 == null || this.aByteArray8[arg0] == -1) {
					if (this.aClass104_1.method2231()) {
						return null;
					}
					local18 = this.aClass104_1.method2238(arg0, true, (byte) 2, this.anInt584);
				} else {
					local18 = this.aClass376_1.method8482(arg0, this.aClass135_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass135_2 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass376_1.method8484(arg0, this.aClass135_2);
			} else if (arg1 == 2) {
				if (this.aClass135_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray8[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass104_1.method2239()) {
					return null;
				}
				local18 = this.aClass104_1.method2238(arg0, false, (byte) 2, this.anInt584);
			} else {
				throw new RuntimeException();
			}
			this.aClass118_4.method2601(local18, (long) arg0);
		}
		if (local18.aBoolean283) {
			return null;
		}
		@Pc(160) byte[] local160 = local18.method3401();
		@Pc(189) int local189;
		@Pc(216) byte[] local216;
		@Pc(225) byte[] local225;
		@Pc(227) int local227;
		@Pc(338) Class2_Sub2_Sub1_Sub1 local338;
		if (!(local18 instanceof Class2_Sub2_Sub1_Sub2)) {
			try {
				label157: {
					if (local160 != null && local160.length > 2) {
						Static493.aCRC32_1.reset();
						Static493.aCRC32_1.update(local160, 0, local160.length - 2);
						local189 = (int) Static493.aCRC32_1.getValue();
						if (local189 != this.aClass319_1.anIntArray587[arg0]) {
							throw new RuntimeException();
						}
						if (this.aClass319_1.aByteArrayArray29 == null || this.aClass319_1.aByteArrayArray29[arg0] == null) {
							break label157;
						}
						local216 = this.aClass319_1.aByteArrayArray29[arg0];
						local225 = Static4.method98(local160.length - 2, 0, local160);
						local227 = 0;
						while (true) {
							if (local227 >= 64) {
								break label157;
							}
							if (local216[local227] != local225[local227]) {
								throw new RuntimeException();
							}
							local227++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass104_1.anInt2683 = 0;
				this.aClass104_1.anInt2684 = 0;
			} catch (@Pc(444) RuntimeException local444) {
				this.aClass104_1.method2230();
				local18.method8653();
				if (local18.aBoolean281 && !this.aClass104_1.method2231()) {
					local338 = this.aClass104_1.method2238(arg0, true, (byte) 2, this.anInt584);
					this.aClass118_4.method2601(local338, (long) arg0);
				}
				return null;
			}
			local160[local160.length - 2] = (byte) (this.aClass319_1.anIntArray585[arg0] >>> 8);
			local160[local160.length - 1] = (byte) this.aClass319_1.anIntArray585[arg0];
			if (this.aClass135_2 != null) {
				this.aClass376_1.method8485(local160, arg0, this.aClass135_2);
				if (this.aByteArray8[arg0] != 1) {
					this.anInt598++;
					this.aByteArray8[arg0] = 1;
				}
			}
			if (!local18.aBoolean281) {
				local18.method8653();
			}
			return local18;
		}
		try {
			if (local160 == null || local160.length <= 2) {
				throw new RuntimeException();
			}
			Static493.aCRC32_1.reset();
			Static493.aCRC32_1.update(local160, 0, local160.length - 2);
			local189 = (int) Static493.aCRC32_1.getValue();
			if (this.aClass319_1.anIntArray587[arg0] != local189) {
				throw new RuntimeException();
			}
			if (this.aClass319_1.aByteArrayArray29 != null && this.aClass319_1.aByteArrayArray29[arg0] != null) {
				local216 = this.aClass319_1.aByteArrayArray29[arg0];
				local225 = Static4.method98(local160.length - 2, 0, local160);
				for (local227 = 0; local227 < 64; local227++) {
					if (local216[local227] != local225[local227]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(267) int local267 = ((local160[local160.length - 2] & 0xFF) << 8) + (local160[local160.length - 1] & 0xFF);
			if (local267 != (this.aClass319_1.anIntArray585[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray8[arg0] != 1) {
				this.anInt598++;
				this.aByteArray8[arg0] = 1;
			}
			if (!local18.aBoolean281) {
				local18.method8653();
			}
			return local18;
		} catch (@Pc(308) Exception local308) {
			this.aByteArray8[arg0] = -1;
			local18.method8653();
			if (local18.aBoolean281 && !this.aClass104_1.method2231()) {
				local338 = this.aClass104_1.method2238(arg0, true, (byte) 2, this.anInt584);
				this.aClass118_4.method2601(local338, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I")
	public int method472() {
		if (this.aClass319_1 == null) {
			return 0;
		} else if (this.aBoolean46) {
			@Pc(20) Class2 local20 = this.aClass109_3.method2325();
			return local20 == null ? 0 : (int) local20.aLong280;
		} else {
			return this.aClass319_1.anInt8621;
		}
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(B)I")
	public int method473() {
		if (this.method466() == null) {
			return this.aClass2_Sub2_Sub1_1 == null ? 0 : this.aClass2_Sub2_Sub1_1.method3399();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)I")
	@Override
	public int method467(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub2_Sub1 local19 = (Class2_Sub2_Sub1) this.aClass118_4.method2595((long) arg0);
		return local19 == null ? 0 : local19.method3399();
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)I")
	public int method475() {
		return this.aClass319_1 == null ? 0 : this.aClass319_1.anInt8621;
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V")
	public void method476() {
		if (this.aClass109_3 == null || this.method466() == null) {
			return;
		}
		for (@Pc(26) Class2 local26 = this.aClass109_4.method2325(); local26 != null; local26 = this.aClass109_4.method2318()) {
			@Pc(32) int local32 = (int) local26.aLong280;
			if (local32 < 0 || local32 >= this.aClass319_1.anInt8622 || this.aClass319_1.anIntArray586[local32] == 0) {
				local26.method8653();
			} else {
				if (this.aByteArray8[local32] == 0) {
					this.method471(local32, 1);
				}
				if (this.aByteArray8[local32] == -1) {
					this.method471(local32, 2);
				}
				if (this.aByteArray8[local32] == 1) {
					local26.method8653();
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Lclient!sia;")
	@Override
	public Class319 method466() {
		if (this.aClass319_1 != null) {
			return this.aClass319_1;
		}
		if (this.aClass2_Sub2_Sub1_1 == null) {
			if (this.aClass104_1.method2231()) {
				return null;
			}
			this.aClass2_Sub2_Sub1_1 = this.aClass104_1.method2238(this.anInt584, true, (byte) 0, 255);
		}
		if (this.aClass2_Sub2_Sub1_1.aBoolean283) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass2_Sub2_Sub1_1.method3401();
		if (this.aClass2_Sub2_Sub1_1 instanceof Class2_Sub2_Sub1_Sub2) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass319_1 = new Class319(local50, this.anInt589, this.aByteArray7);
				if (this.anInt583 != this.aClass319_1.anInt8624) {
					throw new RuntimeException();
				}
			} catch (@Pc(85) RuntimeException local85) {
				this.aClass319_1 = null;
				if (this.aClass104_1.method2231()) {
					this.aClass2_Sub2_Sub1_1 = null;
				} else {
					this.aClass2_Sub2_Sub1_1 = this.aClass104_1.method2238(this.anInt584, true, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass319_1 = new Class319(local50, this.anInt589, this.aByteArray7);
			} catch (@Pc(129) RuntimeException local129) {
				this.aClass104_1.method2230();
				this.aClass319_1 = null;
				if (this.aClass104_1.method2231()) {
					this.aClass2_Sub2_Sub1_1 = null;
				} else {
					this.aClass2_Sub2_Sub1_1 = this.aClass104_1.method2238(this.anInt584, true, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass135_1 != null) {
				this.aClass376_1.method8485(local50, this.anInt584, this.aClass135_1);
			}
		}
		this.aClass2_Sub2_Sub1_1 = null;
		if (this.aClass135_2 != null) {
			this.anInt598 = 0;
			this.aByteArray8 = new byte[this.aClass319_1.anInt8622];
		}
		return this.aClass319_1;
	}
}
