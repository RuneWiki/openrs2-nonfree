import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "Lclient!pd;")
	private Class238 aClass238_2;

	@OriginalMember(owner = "client!iw", name = "I", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!iw", name = "R", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!iw", name = "E", descriptor = "I")
	private int anInt4716 = 0;

	@OriginalMember(owner = "client!iw", name = "s", descriptor = "Lclient!dea;")
	private final Class68 aClass68_37 = new Class68(16);

	@OriginalMember(owner = "client!iw", name = "N", descriptor = "I")
	private int anInt4721 = 0;

	@OriginalMember(owner = "client!iw", name = "K", descriptor = "Lclient!dm;")
	private final Class73 aClass73_36 = new Class73();

	@OriginalMember(owner = "client!iw", name = "V", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
	private final int anInt4720;

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "Lclient!oba;")
	private final Class224 aClass224_3;

	@OriginalMember(owner = "client!iw", name = "O", descriptor = "Z")
	private boolean aBoolean374;

	@OriginalMember(owner = "client!iw", name = "L", descriptor = "Lclient!dm;")
	private Class73 aClass73_37;

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!iw", name = "U", descriptor = "Z")
	private final boolean aBoolean376;

	@OriginalMember(owner = "client!iw", name = "D", descriptor = "Lclient!ef;")
	private final Class86 aClass86_1;

	@OriginalMember(owner = "client!iw", name = "C", descriptor = "I")
	private final int anInt4715;

	@OriginalMember(owner = "client!iw", name = "q", descriptor = "Lclient!ni;")
	private final Class217 aClass217_2;

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "Lclient!oba;")
	private final Class224 aClass224_4;

	@OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
	private final int anInt4704;

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "Lclient!gs;")
	private Class12_Sub4_Sub9 aClass12_Sub4_Sub9_1;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(ILclient!oba;Lclient!oba;Lclient!ef;Lclient!ni;I[BIZ)V")
	public Class117_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class224 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) Class217 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt4720 = arg0;
		this.aClass224_3 = arg1;
		if (this.aClass224_3 == null) {
			this.aBoolean374 = false;
		} else {
			this.aBoolean374 = true;
			this.aClass73_37 = new Class73();
		}
		this.aByteArray56 = arg6;
		this.aBoolean376 = arg8;
		this.aClass86_1 = arg3;
		this.anInt4715 = arg5;
		this.aClass217_2 = arg4;
		this.aClass224_4 = arg2;
		this.anInt4704 = arg7;
		if (this.aClass224_4 != null) {
			this.aClass12_Sub4_Sub9_1 = this.aClass217_2.method5154(this.aClass224_4, this.anInt4720);
		}
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)V")
	public void method4003() {
		if (this.aClass73_37 == null || this.method3999() == null) {
			return;
		}
		for (@Pc(24) Class12 local24 = this.aClass73_36.method2005(); local24 != null; local24 = this.aClass73_36.method2009()) {
			@Pc(30) int local30 = (int) local24.aLong248;
			if (local30 < 0 || this.aClass238_2.anInt6878 <= local30 || this.aClass238_2.anIntArray474[local30] == 0) {
				local24.method7967();
			} else {
				if (this.aByteArray57[local30] == 0) {
					this.method4007(1, local30);
				}
				if (this.aByteArray57[local30] == -1) {
					this.method4007(2, local30);
				}
				if (this.aByteArray57[local30] == 1) {
					local24.method7967();
				}
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)I")
	public int method4004() {
		return this.aClass238_2 == null ? 0 : this.aClass238_2.anInt6880;
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	public void method4006() {
		if (this.aClass224_3 != null) {
			this.aBoolean375 = true;
			if (this.aClass73_37 == null) {
				this.aClass73_37 = new Class73();
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Lclient!gs;")
	private Class12_Sub4_Sub9 method4007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class12_Sub4_Sub9 local13 = (Class12_Sub4_Sub9) this.aClass68_37.method1917((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean622 && local13.aBoolean623) {
			local13.method7967();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass224_3 == null || this.aByteArray57[arg1] == -1) {
					if (this.aClass86_1.method2321()) {
						return null;
					}
					local13 = this.aClass86_1.method2310(true, this.anInt4720, (byte) 2, arg1);
				} else {
					local13 = this.aClass217_2.method5154(this.aClass224_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass224_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass217_2.method5152(this.aClass224_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass224_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray57[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass86_1.method2307()) {
					return null;
				}
				local13 = this.aClass86_1.method2310(false, this.anInt4720, (byte) 2, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass68_37.method1916(local13, (long) arg1);
		}
		if (local13.aBoolean623) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.method7280();
		@Pc(189) int local189;
		@Pc(216) byte[] local216;
		@Pc(225) byte[] local225;
		@Pc(227) int local227;
		@Pc(279) Class12_Sub4_Sub9_Sub2 local279;
		if (!(local13 instanceof Class12_Sub4_Sub9_Sub1)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static68.aCRC32_1.reset();
				Static68.aCRC32_1.update(local162, 0, local162.length - 2);
				local189 = (int) Static68.aCRC32_1.getValue();
				if (local189 != this.aClass238_2.anIntArray475[arg1]) {
					throw new RuntimeException();
				}
				if (this.aClass238_2.aByteArrayArray21 != null && this.aClass238_2.aByteArrayArray21[arg1] != null) {
					local216 = this.aClass238_2.aByteArrayArray21[arg1];
					local225 = Static344.method5423(0, local162.length - 2, local162);
					for (local227 = 0; local227 < 64; local227++) {
						if (local225[local227] != local216[local227]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass86_1.anInt2607 = 0;
				this.aClass86_1.anInt2608 = 0;
			} catch (@Pc(254) RuntimeException local254) {
				this.aClass86_1.method2313();
				local13.method7967();
				if (local13.aBoolean622 && !this.aClass86_1.method2321()) {
					local279 = this.aClass86_1.method2310(true, this.anInt4720, (byte) 2, arg1);
					this.aClass68_37.method1916(local279, (long) arg1);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass238_2.anIntArray479[arg1] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass238_2.anIntArray479[arg1];
			if (this.aClass224_3 != null) {
				this.aClass217_2.method5155(this.aClass224_3, arg1, local162);
				if (this.aByteArray57[arg1] != 1) {
					this.anInt4716++;
					this.aByteArray57[arg1] = 1;
				}
			}
			if (!local13.aBoolean622) {
				local13.method7967();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static68.aCRC32_1.reset();
			Static68.aCRC32_1.update(local162, 0, local162.length - 2);
			local189 = (int) Static68.aCRC32_1.getValue();
			if (local189 != this.aClass238_2.anIntArray475[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass238_2.aByteArrayArray21 != null && this.aClass238_2.aByteArrayArray21[arg1] != null) {
				local216 = this.aClass238_2.aByteArrayArray21[arg1];
				local225 = Static344.method5423(0, local162.length - 2, local162);
				for (local227 = 0; local227 < 64; local227++) {
					if (local216[local227] != local225[local227]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(462) int local462 = (local162[local162.length - 1] & 0xFF) + ((local162[local162.length - 2] & 0xFF) << 8);
			if ((this.aClass238_2.anIntArray479[arg1] & 0xFFFF) != local462) {
				throw new RuntimeException();
			}
			if (this.aByteArray57[arg1] != 1) {
				this.anInt4716++;
				this.aByteArray57[arg1] = 1;
			}
			if (!local13.aBoolean622) {
				local13.method7967();
			}
			return local13;
		} catch (@Pc(507) Exception local507) {
			this.aByteArray57[arg1] = -1;
			local13.method7967();
			if (local13.aBoolean622 && !this.aClass86_1.method2321()) {
				local279 = this.aClass86_1.method2310(true, this.anInt4720, (byte) 2, arg1);
				this.aClass68_37.method1916(local279, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(B)V")
	public void method4010() {
		if (this.aClass73_37 != null) {
			if (this.method3999() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class12 local26;
			@Pc(32) int local32;
			@Pc(122) Class12 local122;
			if (this.aBoolean374) {
				local21 = true;
				for (local26 = this.aClass73_37.method2005(); local26 != null; local26 = this.aClass73_37.method2009()) {
					local32 = (int) local26.aLong248;
					if (this.aByteArray57[local32] == 0) {
						this.method4007(1, local32);
					}
					if (this.aByteArray57[local32] == 0) {
						local21 = false;
					} else {
						local26.method7967();
					}
				}
				while (this.aClass238_2.anIntArray474.length > this.anInt4721) {
					if (this.aClass238_2.anIntArray474[this.anInt4721] == 0) {
						this.anInt4721++;
					} else {
						if (this.aClass217_2.anInt6159 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray57[this.anInt4721] == 0) {
							this.method4007(1, this.anInt4721);
						}
						if (this.aByteArray57[this.anInt4721] == 0) {
							local122 = new Class12();
							local122.aLong248 = this.anInt4721;
							this.aClass73_37.method2012(local122);
							local21 = false;
						}
						this.anInt4721++;
					}
				}
				if (local21) {
					this.anInt4721 = 0;
					this.aBoolean374 = false;
				}
			} else if (this.aBoolean375) {
				local21 = true;
				for (local26 = this.aClass73_37.method2005(); local26 != null; local26 = this.aClass73_37.method2009()) {
					local32 = (int) local26.aLong248;
					if (this.aByteArray57[local32] != 1) {
						this.method4007(2, local32);
					}
					if (this.aByteArray57[local32] == 1) {
						local26.method7967();
					} else {
						local21 = false;
					}
				}
				while (this.anInt4721 < this.aClass238_2.anIntArray474.length) {
					if (this.aClass238_2.anIntArray474[this.anInt4721] == 0) {
						this.anInt4721++;
					} else {
						if (this.aClass86_1.method2307()) {
							local21 = false;
							break;
						}
						if (this.aByteArray57[this.anInt4721] != 1) {
							this.method4007(2, this.anInt4721);
						}
						if (this.aByteArray57[this.anInt4721] != 1) {
							local122 = new Class12();
							local122.aLong248 = this.anInt4721;
							this.aClass73_37.method2012(local122);
							local21 = false;
						}
						this.anInt4721++;
					}
				}
				if (local21) {
					this.anInt4721 = 0;
					this.aBoolean375 = false;
				}
			} else {
				this.aClass73_37 = null;
			}
		}
		if (!this.aBoolean376 || this.aLong126 > Static76.method1679()) {
			return;
		}
		for (@Pc(321) Class12_Sub4_Sub9 local321 = (Class12_Sub4_Sub9) this.aClass68_37.method1923(); local321 != null; local321 = (Class12_Sub4_Sub9) this.aClass68_37.method1920()) {
			if (!local321.aBoolean623) {
				if (local321.aBoolean624) {
					if (!local321.aBoolean622) {
						throw new RuntimeException();
					}
					local321.method7967();
				} else {
					local321.aBoolean624 = true;
				}
			}
		}
		this.aLong126 = Static76.method1679() + 1000L;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(II)V")
	@Override
	public void method4002(@OriginalArg(1) int arg0) {
		if (this.aClass224_3 == null) {
			return;
		}
		for (@Pc(18) Class12 local18 = this.aClass73_36.method2005(); local18 != null; local18 = this.aClass73_36.method2009()) {
			if ((long) arg0 == local18.aLong248) {
				return;
			}
		}
		@Pc(42) Class12 local42 = new Class12();
		local42.aLong248 = arg0;
		this.aClass73_36.method2012(local42);
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)I")
	public int method4011() {
		return this.anInt4716;
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(B)I")
	public int method4012() {
		if (this.aClass238_2 == null) {
			return 0;
		} else if (this.aBoolean374) {
			@Pc(20) Class12 local20 = this.aClass73_37.method2005();
			return local20 == null ? 0 : (int) local20.aLong248;
		} else {
			return this.aClass238_2.anInt6880;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BI)I")
	@Override
	public int method3995(@OriginalArg(1) int arg0) {
		@Pc(19) Class12_Sub4_Sub9 local19 = (Class12_Sub4_Sub9) this.aClass68_37.method1917((long) arg0);
		return local19 == null ? 0 : local19.method7281();
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(Z)I")
	public int method4014() {
		if (this.method3999() == null) {
			return this.aClass12_Sub4_Sub9_1 == null ? 0 : this.aClass12_Sub4_Sub9_1.method7281();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method4000(@OriginalArg(0) int arg0) {
		@Pc(9) Class12_Sub4_Sub9 local9 = this.method4007(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method7280();
			local9.method7967();
			return local17;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)Lclient!pd;")
	@Override
	public Class238 method3999() {
		if (this.aClass238_2 != null) {
			return this.aClass238_2;
		}
		if (this.aClass12_Sub4_Sub9_1 == null) {
			if (this.aClass86_1.method2321()) {
				return null;
			}
			this.aClass12_Sub4_Sub9_1 = this.aClass86_1.method2310(true, 255, (byte) 0, this.anInt4720);
		}
		if (this.aClass12_Sub4_Sub9_1.aBoolean623) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass12_Sub4_Sub9_1.method7280();
		if (this.aClass12_Sub4_Sub9_1 instanceof Class12_Sub4_Sub9_Sub1) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass238_2 = new Class238(local49, this.anInt4715, this.aByteArray56);
				if (this.anInt4704 != this.aClass238_2.anInt6875) {
					throw new RuntimeException();
				}
			} catch (@Pc(80) RuntimeException local80) {
				this.aClass238_2 = null;
				if (this.aClass86_1.method2321()) {
					this.aClass12_Sub4_Sub9_1 = null;
				} else {
					this.aClass12_Sub4_Sub9_1 = this.aClass86_1.method2310(true, 255, (byte) 0, this.anInt4720);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass238_2 = new Class238(local49, this.anInt4715, this.aByteArray56);
			} catch (@Pc(124) RuntimeException local124) {
				this.aClass86_1.method2313();
				this.aClass238_2 = null;
				if (this.aClass86_1.method2321()) {
					this.aClass12_Sub4_Sub9_1 = null;
				} else {
					this.aClass12_Sub4_Sub9_1 = this.aClass86_1.method2310(true, 255, (byte) 0, this.anInt4720);
				}
				return null;
			}
			if (this.aClass224_4 != null) {
				this.aClass217_2.method5155(this.aClass224_4, this.anInt4720, local49);
			}
		}
		if (this.aClass224_3 != null) {
			this.aByteArray57 = new byte[this.aClass238_2.anInt6878];
			this.anInt4716 = 0;
		}
		this.aClass12_Sub4_Sub9_1 = null;
		return this.aClass238_2;
	}
}
