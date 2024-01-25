import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "Lclient!of;")
	private Class238 aClass238_1;

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "Z")
	private boolean aBoolean59;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	private int anInt655 = 0;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "Lclient!wa;")
	private final Class354 aClass354_2 = new Class354(16);

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
	private int anInt667 = 0;

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "Lclient!gk;")
	private final Class112 aClass112_7 = new Class112();

	@OriginalMember(owner = "client!bd", name = "S", descriptor = "J")
	private long aLong29 = 0L;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
	private final int anInt659;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!at;")
	private final Class22 aClass22_2;

	@OriginalMember(owner = "client!bd", name = "O", descriptor = "Z")
	private boolean aBoolean60;

	@OriginalMember(owner = "client!bd", name = "P", descriptor = "Lclient!gk;")
	private Class112 aClass112_8;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	private final int anInt657;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	private final int anInt650;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Lclient!mv;")
	private final Class217 aClass217_1;

	@OriginalMember(owner = "client!bd", name = "R", descriptor = "Z")
	private final boolean aBoolean61;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!ql;")
	private final Class277 aClass277_1;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!at;")
	private final Class22 aClass22_3;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!ng;")
	private Class3_Sub7_Sub1 aClass3_Sub7_Sub1_1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(ILclient!at;Lclient!at;Lclient!ql;Lclient!mv;I[BIZ)V")
	public Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) Class217 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt659 = arg0;
		this.aClass22_2 = arg1;
		if (this.aClass22_2 == null) {
			this.aBoolean60 = false;
		} else {
			this.aBoolean60 = true;
			this.aClass112_8 = new Class112();
		}
		this.aByteArray8 = arg6;
		this.anInt657 = arg5;
		this.anInt650 = arg7;
		this.aClass217_1 = arg4;
		this.aBoolean61 = arg8;
		this.aClass277_1 = arg3;
		this.aClass22_3 = arg2;
		if (this.aClass22_3 != null) {
			this.aClass3_Sub7_Sub1_1 = this.aClass217_1.method5080(this.anInt659, this.aClass22_3);
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)Lclient!of;")
	@Override
	public Class238 method579() {
		if (this.aClass238_1 != null) {
			return this.aClass238_1;
		}
		if (this.aClass3_Sub7_Sub1_1 == null) {
			if (this.aClass277_1.method6124()) {
				return null;
			}
			this.aClass3_Sub7_Sub1_1 = this.aClass277_1.method6121((byte) 0, this.anInt659, true, 255);
		}
		if (this.aClass3_Sub7_Sub1_1.aBoolean458) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass3_Sub7_Sub1_1.method5380();
		if (this.aClass3_Sub7_Sub1_1 instanceof Class3_Sub7_Sub1_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass238_1 = new Class238(local43, this.anInt657, this.aByteArray8);
				if (this.aClass238_1.anInt6480 != this.anInt650) {
					throw new RuntimeException();
				}
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass238_1 = null;
				if (this.aClass277_1.method6124()) {
					this.aClass3_Sub7_Sub1_1 = null;
				} else {
					this.aClass3_Sub7_Sub1_1 = this.aClass277_1.method6121((byte) 0, this.anInt659, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass238_1 = new Class238(local43, this.anInt657, this.aByteArray8);
			} catch (@Pc(118) RuntimeException local118) {
				this.aClass277_1.method6123();
				this.aClass238_1 = null;
				if (this.aClass277_1.method6124()) {
					this.aClass3_Sub7_Sub1_1 = null;
				} else {
					this.aClass3_Sub7_Sub1_1 = this.aClass277_1.method6121((byte) 0, this.anInt659, true, 255);
				}
				return null;
			}
			if (this.aClass22_3 != null) {
				this.aClass217_1.method5079(this.anInt659, this.aClass22_3, local43);
			}
		}
		this.aClass3_Sub7_Sub1_1 = null;
		if (this.aClass22_2 != null) {
			this.aByteArray7 = new byte[this.aClass238_1.anInt6485];
			this.anInt655 = 0;
		}
		return this.aClass238_1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
	public int method580() {
		return this.aClass238_1 == null ? 0 : this.aClass238_1.anInt6478;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
	public int method581() {
		if (this.method579() == null) {
			return this.aClass3_Sub7_Sub1_1 == null ? 0 : this.aClass3_Sub7_Sub1_1.method5382();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public void method582() {
		if (this.aClass22_2 != null) {
			this.aBoolean59 = true;
			if (this.aClass112_8 == null) {
				this.aClass112_8 = new Class112();
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	@Override
	public void method574(@OriginalArg(1) int arg0) {
		if (this.aClass22_2 == null) {
			return;
		}
		for (@Pc(14) Class3 local14 = this.aClass112_7.method3088(); local14 != null; local14 = this.aClass112_7.method3084()) {
			if (local14.aLong273 == (long) arg0) {
				return;
			}
		}
		@Pc(42) Class3 local42 = new Class3();
		local42.aLong273 = arg0;
		this.aClass112_7.method3079(local42);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)I")
	public int method584() {
		if (this.aClass238_1 == null) {
			return 0;
		} else if (this.aBoolean60) {
			@Pc(20) Class3 local20 = this.aClass112_8.method3088();
			return local20 == null ? 0 : (int) local20.aLong273;
		} else {
			return this.aClass238_1.anInt6478;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method573(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub7_Sub1 local14 = this.method589(0, arg0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method5380();
			local14.method7825();
			return local22;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)I")
	@Override
	public int method577(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub7_Sub1 local18 = (Class3_Sub7_Sub1) this.aClass354_2.method7689((long) arg0);
		return local18 == null ? 0 : local18.method5382();
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)I")
	public int method585() {
		return this.anInt655;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public void method586() {
		if (this.aClass112_8 != null) {
			if (this.method579() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class3 local23;
			@Pc(29) int local29;
			@Pc(122) Class3 local122;
			if (this.aBoolean60) {
				local18 = true;
				for (local23 = this.aClass112_8.method3088(); local23 != null; local23 = this.aClass112_8.method3084()) {
					local29 = (int) local23.aLong273;
					if (this.aByteArray7[local29] == 0) {
						this.method589(1, local29);
					}
					if (this.aByteArray7[local29] == 0) {
						local18 = false;
					} else {
						local23.method7825();
					}
				}
				while (this.aClass238_1.anIntArray395.length > this.anInt667) {
					if (this.aClass238_1.anIntArray395[this.anInt667] == 0) {
						this.anInt667++;
					} else {
						if (this.aClass217_1.anInt6010 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray7[this.anInt667] == 0) {
							this.method589(1, this.anInt667);
						}
						if (this.aByteArray7[this.anInt667] == 0) {
							local122 = new Class3();
							local122.aLong273 = this.anInt667;
							this.aClass112_8.method3079(local122);
							local18 = false;
						}
						this.anInt667++;
					}
				}
				if (local18) {
					this.aBoolean60 = false;
					this.anInt667 = 0;
				}
			} else if (this.aBoolean59) {
				local18 = true;
				for (local23 = this.aClass112_8.method3088(); local23 != null; local23 = this.aClass112_8.method3084()) {
					local29 = (int) local23.aLong273;
					if (this.aByteArray7[local29] != 1) {
						this.method589(2, local29);
					}
					if (this.aByteArray7[local29] == 1) {
						local23.method7825();
					} else {
						local18 = false;
					}
				}
				while (this.anInt667 < this.aClass238_1.anIntArray395.length) {
					if (this.aClass238_1.anIntArray395[this.anInt667] == 0) {
						this.anInt667++;
					} else {
						if (this.aClass277_1.method6120()) {
							local18 = false;
							break;
						}
						if (this.aByteArray7[this.anInt667] != 1) {
							this.method589(2, this.anInt667);
						}
						if (this.aByteArray7[this.anInt667] != 1) {
							local122 = new Class3();
							local122.aLong273 = this.anInt667;
							this.aClass112_8.method3079(local122);
							local18 = false;
						}
						this.anInt667++;
					}
				}
				if (local18) {
					this.aBoolean59 = false;
					this.anInt667 = 0;
				}
			} else {
				this.aClass112_8 = null;
			}
		}
		if (!this.aBoolean61 || this.aLong29 > Static158.method2936()) {
			return;
		}
		for (@Pc(315) Class3_Sub7_Sub1 local315 = (Class3_Sub7_Sub1) this.aClass354_2.method7694(); local315 != null; local315 = (Class3_Sub7_Sub1) this.aClass354_2.method7692()) {
			if (!local315.aBoolean458) {
				if (local315.aBoolean459) {
					if (!local315.aBoolean460) {
						throw new RuntimeException();
					}
					local315.method7825();
				} else {
					local315.aBoolean459 = true;
				}
			}
		}
		this.aLong29 = Static158.method2936() + 1000L;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
	public void method587() {
		if (this.aClass112_8 == null || this.method579() == null) {
			return;
		}
		for (@Pc(19) Class3 local19 = this.aClass112_7.method3088(); local19 != null; local19 = this.aClass112_7.method3084()) {
			@Pc(25) int local25 = (int) local19.aLong273;
			if (local25 < 0 || local25 >= this.aClass238_1.anInt6485 || this.aClass238_1.anIntArray395[local25] == 0) {
				local19.method7825();
			} else {
				if (this.aByteArray7[local25] == 0) {
					this.method589(1, local25);
				}
				if (this.aByteArray7[local25] == -1) {
					this.method589(2, local25);
				}
				if (this.aByteArray7[local25] == 1) {
					local19.method7825();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Lclient!ng;")
	private Class3_Sub7_Sub1 method589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub7_Sub1 local13 = (Class3_Sub7_Sub1) this.aClass354_2.method7689((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean460 && local13.aBoolean458) {
			local13.method7825();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass22_2 == null || this.aByteArray7[arg1] == -1) {
					if (this.aClass277_1.method6124()) {
						return null;
					}
					local13 = this.aClass277_1.method6121((byte) 2, arg1, true, this.anInt659);
				} else {
					local13 = this.aClass217_1.method5080(arg1, this.aClass22_2);
				}
			} else if (arg0 == 1) {
				if (this.aClass22_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass217_1.method5074(this.aClass22_2, arg1);
			} else if (arg0 == 2) {
				if (this.aClass22_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray7[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass277_1.method6120()) {
					return null;
				}
				local13 = this.aClass277_1.method6121((byte) 2, arg1, false, this.anInt659);
			} else {
				throw new RuntimeException();
			}
			this.aClass354_2.method7691(local13, (long) arg1);
		}
		if (local13.aBoolean458) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.method5380();
		@Pc(189) int local189;
		@Pc(216) byte[] local216;
		@Pc(225) byte[] local225;
		@Pc(227) int local227;
		@Pc(337) Class3_Sub7_Sub1_Sub2 local337;
		if (!(local13 instanceof Class3_Sub7_Sub1_Sub1)) {
			try {
				label157: {
					if (local162 != null && local162.length > 2) {
						Static500.aCRC32_1.reset();
						Static500.aCRC32_1.update(local162, 0, local162.length - 2);
						local189 = (int) Static500.aCRC32_1.getValue();
						if (this.aClass238_1.anIntArray396[arg1] != local189) {
							throw new RuntimeException();
						}
						if (this.aClass238_1.aByteArrayArray19 == null || this.aClass238_1.aByteArrayArray19[arg1] == null) {
							break label157;
						}
						local216 = this.aClass238_1.aByteArrayArray19[arg1];
						local225 = Static175.method3078(local162, local162.length - 2, 0);
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
				this.aClass277_1.anInt7302 = 0;
				this.aClass277_1.anInt7303 = 0;
			} catch (@Pc(437) RuntimeException local437) {
				this.aClass277_1.method6123();
				local13.method7825();
				if (local13.aBoolean460 && !this.aClass277_1.method6124()) {
					local337 = this.aClass277_1.method6121((byte) 2, arg1, true, this.anInt659);
					this.aClass354_2.method7691(local337, (long) arg1);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass238_1.anIntArray398[arg1] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass238_1.anIntArray398[arg1];
			if (this.aClass22_2 != null) {
				this.aClass217_1.method5079(arg1, this.aClass22_2, local162);
				if (this.aByteArray7[arg1] != 1) {
					this.anInt655++;
					this.aByteArray7[arg1] = 1;
				}
			}
			if (!local13.aBoolean460) {
				local13.method7825();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static500.aCRC32_1.reset();
			Static500.aCRC32_1.update(local162, 0, local162.length - 2);
			local189 = (int) Static500.aCRC32_1.getValue();
			if (local189 != this.aClass238_1.anIntArray396[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass238_1.aByteArrayArray19 != null && this.aClass238_1.aByteArrayArray19[arg1] != null) {
				local216 = this.aClass238_1.aByteArrayArray19[arg1];
				local225 = Static175.method3078(local162, local162.length - 2, 0);
				for (local227 = 0; local227 < 64; local227++) {
					if (local216[local227] != local225[local227]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(268) int local268 = (local162[local162.length - 1] & 0xFF) + ((local162[local162.length - 2] & 0xFF) << 8);
			if ((this.aClass238_1.anIntArray398[arg1] & 0xFFFF) != local268) {
				throw new RuntimeException();
			}
			if (this.aByteArray7[arg1] != 1) {
				this.anInt655++;
				this.aByteArray7[arg1] = 1;
			}
			if (!local13.aBoolean460) {
				local13.method7825();
			}
			return local13;
		} catch (@Pc(311) Exception local311) {
			this.aByteArray7[arg1] = -1;
			local13.method7825();
			if (local13.aBoolean460 && !this.aClass277_1.method6124()) {
				local337 = this.aClass277_1.method6121((byte) 2, arg1, true, this.anInt659);
				this.aClass354_2.method7691(local337, (long) arg1);
			}
			return null;
		}
	}
}
