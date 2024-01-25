import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!du", name = "o", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!du", name = "E", descriptor = "Lclient!ega;")
	private Class99 aClass99_1;

	@OriginalMember(owner = "client!du", name = "I", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "client!du", name = "z", descriptor = "I")
	private int anInt2346 = 0;

	@OriginalMember(owner = "client!du", name = "D", descriptor = "Lclient!cja;")
	private final Class62 aClass62_12 = new Class62(16);

	@OriginalMember(owner = "client!du", name = "J", descriptor = "I")
	private int anInt2349 = 0;

	@OriginalMember(owner = "client!du", name = "G", descriptor = "Lclient!jia;")
	private final Class193 aClass193_13 = new Class193();

	@OriginalMember(owner = "client!du", name = "L", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "I")
	private final int anInt2339;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Lclient!rt;")
	private final Class313 aClass313_2;

	@OriginalMember(owner = "client!du", name = "H", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!du", name = "F", descriptor = "Lclient!jia;")
	private Class193 aClass193_12;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "I")
	private final int anInt2336;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!du", name = "K", descriptor = "Z")
	private final boolean aBoolean199;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Lclient!us;")
	private final Class366 aClass366_1;

	@OriginalMember(owner = "client!du", name = "w", descriptor = "Lclient!ma;")
	private final Class233 aClass233_3;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Lclient!rt;")
	private final Class313 aClass313_1;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	private final int anInt2337;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "Lclient!fn;")
	private Class3_Sub6_Sub2 aClass3_Sub6_Sub2_1;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(ILclient!rt;Lclient!rt;Lclient!us;Lclient!ma;I[BIZ)V")
	public Class89_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) Class313 arg2, @OriginalArg(3) Class366 arg3, @OriginalArg(4) Class233 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2339 = arg0;
		this.aClass313_2 = arg1;
		if (this.aClass313_2 == null) {
			this.aBoolean197 = false;
		} else {
			this.aBoolean197 = true;
			this.aClass193_12 = new Class193();
		}
		this.anInt2336 = arg7;
		this.aByteArray17 = arg6;
		this.aBoolean199 = arg8;
		this.aClass366_1 = arg3;
		this.aClass233_3 = arg4;
		this.aClass313_1 = arg2;
		this.anInt2337 = arg5;
		if (this.aClass313_1 != null) {
			this.aClass3_Sub6_Sub2_1 = this.aClass233_3.method5371(this.aClass313_1, this.anInt2339);
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public void method2155() {
		if (this.aClass313_2 != null) {
			this.aBoolean198 = true;
			if (this.aClass193_12 == null) {
				this.aClass193_12 = new Class193();
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZII)Lclient!fn;")
	private Class3_Sub6_Sub2 method2156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub6_Sub2 local13 = (Class3_Sub6_Sub2) this.aClass62_12.method1682((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean678 && local13.aBoolean677) {
			local13.method8770();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass313_2 == null || this.aByteArray18[arg0] == -1) {
					if (this.aClass366_1.method8105()) {
						return null;
					}
					local13 = this.aClass366_1.method8098(true, arg0, this.anInt2339, (byte) 2);
				} else {
					local13 = this.aClass233_3.method5371(this.aClass313_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass313_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass233_3.method5370(this.aClass313_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass313_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray18[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass366_1.method8109()) {
					return null;
				}
				local13 = this.aClass366_1.method8098(false, arg0, this.anInt2339, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass62_12.method1686((long) arg0, local13);
		}
		if (local13.aBoolean677) {
			return null;
		}
		@Pc(160) byte[] local160 = local13.method7723();
		@Pc(189) int local189;
		@Pc(220) byte[] local220;
		@Pc(229) byte[] local229;
		@Pc(231) int local231;
		@Pc(283) Class3_Sub6_Sub2_Sub1 local283;
		if (!(local13 instanceof Class3_Sub6_Sub2_Sub2)) {
			try {
				if (local160 == null || local160.length <= 2) {
					throw new RuntimeException();
				}
				Static260.aCRC32_1.reset();
				Static260.aCRC32_1.update(local160, 0, local160.length - 2);
				local189 = (int) Static260.aCRC32_1.getValue();
				if (local189 != this.aClass99_1.anIntArray164[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass99_1.aByteArrayArray1 != null && this.aClass99_1.aByteArrayArray1[arg0] != null) {
					local220 = this.aClass99_1.aByteArrayArray1[arg0];
					local229 = Static62.method1526(local160.length - 2, local160, 0);
					for (local231 = 0; local231 < 64; local231++) {
						if (local220[local231] != local229[local231]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass366_1.anInt9591 = 0;
				this.aClass366_1.anInt9592 = 0;
			} catch (@Pc(258) RuntimeException local258) {
				this.aClass366_1.method8108();
				local13.method8770();
				if (local13.aBoolean678 && !this.aClass366_1.method8105()) {
					local283 = this.aClass366_1.method8098(true, arg0, this.anInt2339, (byte) 2);
					this.aClass62_12.method1686((long) arg0, local283);
				}
				return null;
			}
			local160[local160.length - 2] = (byte) (this.aClass99_1.anIntArray169[arg0] >>> 8);
			local160[local160.length - 1] = (byte) this.aClass99_1.anIntArray169[arg0];
			if (this.aClass313_2 != null) {
				this.aClass233_3.method5372(local160, this.aClass313_2, arg0);
				if (this.aByteArray18[arg0] != 1) {
					this.anInt2346++;
					this.aByteArray18[arg0] = 1;
				}
			}
			if (!local13.aBoolean678) {
				local13.method8770();
			}
			return local13;
		}
		try {
			if (local160 == null || local160.length <= 2) {
				throw new RuntimeException();
			}
			Static260.aCRC32_1.reset();
			Static260.aCRC32_1.update(local160, 0, local160.length - 2);
			local189 = (int) Static260.aCRC32_1.getValue();
			if (this.aClass99_1.anIntArray164[arg0] != local189) {
				throw new RuntimeException();
			}
			if (this.aClass99_1.aByteArrayArray1 != null && this.aClass99_1.aByteArrayArray1[arg0] != null) {
				local220 = this.aClass99_1.aByteArrayArray1[arg0];
				local229 = Static62.method1526(local160.length - 2, local160, 0);
				for (local231 = 0; local231 < 64; local231++) {
					if (local220[local231] != local229[local231]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(458) int local458 = (local160[local160.length - 1] & 0xFF) + ((local160[local160.length - 2] & 0xFF) << 8);
			if (local458 != (this.aClass99_1.anIntArray169[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray18[arg0] != 1) {
				this.anInt2346++;
				this.aByteArray18[arg0] = 1;
			}
			if (!local13.aBoolean678) {
				local13.method8770();
			}
			return local13;
		} catch (@Pc(499) Exception local499) {
			this.aByteArray18[arg0] = -1;
			local13.method8770();
			if (local13.aBoolean678 && !this.aClass366_1.method8105()) {
				local283 = this.aClass366_1.method8098(true, arg0, this.anInt2339, (byte) 2);
				this.aClass62_12.method1686((long) arg0, local283);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(B)I")
	public int method2157() {
		return this.anInt2346;
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(B)I")
	public int method2159() {
		if (this.method2154() == null) {
			return this.aClass3_Sub6_Sub2_1 == null ? 0 : this.aClass3_Sub6_Sub2_1.method7721();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(B)V")
	public void method2160() {
		if (this.aClass193_12 == null || this.method2154() == null) {
			return;
		}
		for (@Pc(24) Class3 local24 = this.aClass193_13.method4457(); local24 != null; local24 = this.aClass193_13.method4459()) {
			@Pc(30) int local30 = (int) local24.aLong309;
			if (local30 < 0 || local30 >= this.aClass99_1.anInt2490 || this.aClass99_1.anIntArray168[local30] == 0) {
				local24.method8770();
			} else {
				if (this.aByteArray18[local30] == 0) {
					this.method2156(local30, 1);
				}
				if (this.aByteArray18[local30] == -1) {
					this.method2156(local30, 2);
				}
				if (this.aByteArray18[local30] == 1) {
					local24.method8770();
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)Lclient!ega;")
	@Override
	public Class99 method2154() {
		if (this.aClass99_1 != null) {
			return this.aClass99_1;
		}
		if (this.aClass3_Sub6_Sub2_1 == null) {
			if (this.aClass366_1.method8105()) {
				return null;
			}
			this.aClass3_Sub6_Sub2_1 = this.aClass366_1.method8098(true, this.anInt2339, 255, (byte) 0);
		}
		if (this.aClass3_Sub6_Sub2_1.aBoolean677) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass3_Sub6_Sub2_1.method7723();
		if (this.aClass3_Sub6_Sub2_1 instanceof Class3_Sub6_Sub2_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass99_1 = new Class99(local43, this.anInt2337, this.aByteArray17);
				if (this.anInt2336 != this.aClass99_1.anInt2487) {
					throw new RuntimeException();
				}
			} catch (@Pc(83) RuntimeException local83) {
				this.aClass99_1 = null;
				if (this.aClass366_1.method8105()) {
					this.aClass3_Sub6_Sub2_1 = null;
				} else {
					this.aClass3_Sub6_Sub2_1 = this.aClass366_1.method8098(true, this.anInt2339, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass99_1 = new Class99(local43, this.anInt2337, this.aByteArray17);
			} catch (@Pc(127) RuntimeException local127) {
				this.aClass366_1.method8108();
				this.aClass99_1 = null;
				if (this.aClass366_1.method8105()) {
					this.aClass3_Sub6_Sub2_1 = null;
				} else {
					this.aClass3_Sub6_Sub2_1 = this.aClass366_1.method8098(true, this.anInt2339, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass313_1 != null) {
				this.aClass233_3.method5372(local43, this.aClass313_1, this.anInt2339);
			}
		}
		this.aClass3_Sub6_Sub2_1 = null;
		if (this.aClass313_2 != null) {
			this.aByteArray18 = new byte[this.aClass99_1.anInt2490];
			this.anInt2346 = 0;
		}
		return this.aClass99_1;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)V")
	@Override
	public void method2153(@OriginalArg(1) int arg0) {
		if (this.aClass313_2 == null) {
			return;
		}
		for (@Pc(19) Class3 local19 = this.aClass193_13.method4457(); local19 != null; local19 = this.aClass193_13.method4459()) {
			if (local19.aLong309 == (long) arg0) {
				return;
			}
		}
		@Pc(39) Class3 local39 = new Class3();
		local39.aLong309 = (long) arg0;
		this.aClass193_13.method4462(local39);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZI)I")
	@Override
	public int method2152(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub6_Sub2 local11 = (Class3_Sub6_Sub2) this.aClass62_12.method1682((long) arg0);
		return local11 == null ? 0 : local11.method7721();
	}

	@OriginalMember(owner = "client!du", name = "e", descriptor = "(B)V")
	public void method2161() {
		if (this.aClass193_12 != null) {
			if (this.method2154() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class3 local23;
			@Pc(29) int local29;
			@Pc(114) Class3 local114;
			if (this.aBoolean197) {
				local18 = true;
				for (local23 = this.aClass193_12.method4457(); local23 != null; local23 = this.aClass193_12.method4459()) {
					local29 = (int) local23.aLong309;
					if (this.aByteArray18[local29] == 0) {
						this.method2156(local29, 1);
					}
					if (this.aByteArray18[local29] == 0) {
						local18 = false;
					} else {
						local23.method8770();
					}
				}
				while (this.aClass99_1.anIntArray168.length > this.anInt2349) {
					if (this.aClass99_1.anIntArray168[this.anInt2349] == 0) {
						this.anInt2349++;
					} else {
						if (this.aClass233_3.anInt6400 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray18[this.anInt2349] == 0) {
							this.method2156(this.anInt2349, 1);
						}
						if (this.aByteArray18[this.anInt2349] == 0) {
							local114 = new Class3();
							local114.aLong309 = (long) this.anInt2349;
							this.aClass193_12.method4462(local114);
							local18 = false;
						}
						this.anInt2349++;
					}
				}
				if (local18) {
					this.aBoolean197 = false;
					this.anInt2349 = 0;
				}
			} else if (this.aBoolean198) {
				local18 = true;
				for (local23 = this.aClass193_12.method4457(); local23 != null; local23 = this.aClass193_12.method4459()) {
					local29 = (int) local23.aLong309;
					if (this.aByteArray18[local29] != 1) {
						this.method2156(local29, 2);
					}
					if (this.aByteArray18[local29] == 1) {
						local23.method8770();
					} else {
						local18 = false;
					}
				}
				while (this.aClass99_1.anIntArray168.length > this.anInt2349) {
					if (this.aClass99_1.anIntArray168[this.anInt2349] == 0) {
						this.anInt2349++;
					} else {
						if (this.aClass366_1.method8109()) {
							local18 = false;
							break;
						}
						if (this.aByteArray18[this.anInt2349] != 1) {
							this.method2156(this.anInt2349, 2);
						}
						if (this.aByteArray18[this.anInt2349] != 1) {
							local114 = new Class3();
							local114.aLong309 = (long) this.anInt2349;
							this.aClass193_12.method4462(local114);
							local18 = false;
						}
						this.anInt2349++;
					}
				}
				if (local18) {
					this.anInt2349 = 0;
					this.aBoolean198 = false;
				}
			} else {
				this.aClass193_12 = null;
			}
		}
		if (!this.aBoolean199 || this.aLong67 > Static131.method2268()) {
			return;
		}
		for (@Pc(322) Class3_Sub6_Sub2 local322 = (Class3_Sub6_Sub2) this.aClass62_12.method1680(); local322 != null; local322 = (Class3_Sub6_Sub2) this.aClass62_12.method1681()) {
			if (!local322.aBoolean677) {
				if (local322.aBoolean676) {
					if (!local322.aBoolean678) {
						throw new RuntimeException();
					}
					local322.method8770();
				} else {
					local322.aBoolean676 = true;
				}
			}
		}
		this.aLong67 = Static131.method2268() + 1000L;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method2151(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub6_Sub2 local14 = this.method2156(arg0, 0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method7723();
			local14.method8770();
			return local22;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)I")
	public int method2163() {
		if (this.aClass99_1 == null) {
			return 0;
		} else if (this.aBoolean197) {
			@Pc(27) Class3 local27 = this.aClass193_12.method4457();
			return local27 == null ? 0 : (int) local27.aLong309;
		} else {
			return this.aClass99_1.anInt2485;
		}
	}

	@OriginalMember(owner = "client!du", name = "g", descriptor = "(B)I")
	public int method2164() {
		return this.aClass99_1 == null ? 0 : this.aClass99_1.anInt2485;
	}
}
