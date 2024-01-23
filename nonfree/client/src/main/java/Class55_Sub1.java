import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!gk;")
	private Class64 aClass64_2;

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "Z")
	private boolean aBoolean389;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	private int anInt5431 = 0;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!s;")
	private Class156 aClass156_28 = new Class156(16);

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
	private int anInt5434 = 0;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "Lclient!bo;")
	private Class24 aClass24_31 = new Class24();

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "Lclient!nm;")
	private Class120 aClass120_3;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	private int anInt5422;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "Z")
	private boolean aBoolean388;

	@OriginalMember(owner = "client!ug", name = "L", descriptor = "Lclient!bo;")
	private Class24 aClass24_30;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "Lclient!dl;")
	private Class40 aClass40_3;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	private int anInt5426;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	private int anInt5425;

	@OriginalMember(owner = "client!ug", name = "P", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "Lclient!cn;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "Lclient!nm;")
	private Class120 aClass120_4;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "Lclient!se;")
	private Class1_Sub1_Sub11 aClass1_Sub1_Sub11_1;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILclient!nm;Lclient!nm;Lclient!dl;Lclient!cn;IIZ)V")
	public Class55_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class120 arg1, @OriginalArg(2) Class120 arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) Class32 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass120_3 = arg1;
		this.anInt5422 = arg0;
		if (this.aClass120_3 == null) {
			this.aBoolean388 = false;
		} else {
			this.aBoolean388 = true;
			this.aClass24_30 = new Class24();
		}
		this.aClass40_3 = arg3;
		this.anInt5426 = arg5;
		this.anInt5425 = arg6;
		this.aBoolean390 = arg7;
		this.aClass32_2 = arg4;
		this.aClass120_4 = arg2;
		if (this.aClass120_4 != null) {
			this.aClass1_Sub1_Sub11_1 = this.aClass32_2.method682(this.anInt5422, this.aClass120_4);
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)I")
	public int method4241() {
		if (this.method4232() == null) {
			return this.aClass1_Sub1_Sub11_1 == null ? 0 : this.aClass1_Sub1_Sub11_1.method3721();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)V")
	public void method4242() {
		if (this.aClass24_30 != null) {
			if (this.method4232() == null) {
				return;
			}
			@Pc(28) boolean local28;
			@Pc(33) Class1 local33;
			@Pc(40) int local40;
			if (this.aBoolean388) {
				local28 = true;
				for (local33 = this.aClass24_30.method460(); local33 != null; local33 = this.aClass24_30.method464()) {
					local40 = (int) local33.aLong223;
					if (this.aByteArray68[local40] == 0) {
						this.method4244(local40, 1);
					}
					if (this.aByteArray68[local40] == 0) {
						local28 = false;
					} else {
						local33.method4616();
					}
				}
				while (this.aClass64_2.anIntArray136.length > this.anInt5434) {
					if (this.aClass64_2.anIntArray136[this.anInt5434] == 0) {
						this.anInt5434++;
					} else {
						if (this.aClass32_2.anInt774 >= 250) {
							local28 = false;
							break;
						}
						if (this.aByteArray68[this.anInt5434] == 0) {
							this.method4244(this.anInt5434, 1);
						}
						if (this.aByteArray68[this.anInt5434] == 0) {
							local33 = new Class1();
							local33.aLong223 = this.anInt5434;
							this.aClass24_30.method473(local33);
							local28 = false;
						}
						this.anInt5434++;
					}
				}
				if (local28) {
					this.aBoolean388 = false;
					this.anInt5434 = 0;
				}
			} else if (this.aBoolean389) {
				local28 = true;
				for (local33 = this.aClass24_30.method460(); local33 != null; local33 = this.aClass24_30.method464()) {
					local40 = (int) local33.aLong223;
					if (this.aByteArray68[local40] != 1) {
						this.method4244(local40, 2);
					}
					if (this.aByteArray68[local40] == 1) {
						local33.method4616();
					} else {
						local28 = false;
					}
				}
				while (this.aClass64_2.anIntArray136.length > this.anInt5434) {
					if (this.aClass64_2.anIntArray136[this.anInt5434] == 0) {
						this.anInt5434++;
					} else {
						if (this.aClass40_3.method859()) {
							local28 = false;
							break;
						}
						if (this.aByteArray68[this.anInt5434] != 1) {
							this.method4244(this.anInt5434, 2);
						}
						if (this.aByteArray68[this.anInt5434] != 1) {
							local28 = false;
							local33 = new Class1();
							local33.aLong223 = this.anInt5434;
							this.aClass24_30.method473(local33);
						}
						this.anInt5434++;
					}
				}
				if (local28) {
					this.aBoolean389 = false;
					this.anInt5434 = 0;
				}
			} else {
				this.aClass24_30 = null;
			}
		}
		if (!this.aBoolean390 || this.aLong204 > Static135.method2186()) {
			return;
		}
		for (@Pc(334) Class1_Sub1_Sub11 local334 = (Class1_Sub1_Sub11) this.aClass156_28.method3822(); local334 != null; local334 = (Class1_Sub1_Sub11) this.aClass156_28.method3820()) {
			if (!local334.aBoolean340) {
				if (local334.aBoolean338) {
					if (!local334.aBoolean339) {
						throw new RuntimeException();
					}
					local334.method4616();
				} else {
					local334.aBoolean338 = true;
				}
			}
		}
		this.aLong204 = Static135.method2186() + 1000L;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)I")
	@Override
	public int method4239(@OriginalArg(1) int arg0) {
		@Pc(7) Class1_Sub1_Sub11 local7 = (Class1_Sub1_Sub11) this.aClass156_28.method3821((long) arg0);
		return local7 == null ? 0 : local7.method3721();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)I")
	public int method4243() {
		return this.anInt5431;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Lclient!se;")
	private Class1_Sub1_Sub11 method4244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub1_Sub11 local9 = (Class1_Sub1_Sub11) this.aClass156_28.method3821((long) arg0);
		if (local9 != null && arg1 == 0 && !local9.aBoolean339 && local9.aBoolean340) {
			local9.method4616();
			local9 = null;
		}
		if (local9 == null) {
			if (arg1 == 0) {
				if (this.aClass120_3 == null || this.aByteArray68[arg0] == -1) {
					if (this.aClass40_3.method868()) {
						return null;
					}
					local9 = this.aClass40_3.method853(arg0, this.anInt5422, (byte) 2, true);
				} else {
					local9 = this.aClass32_2.method682(arg0, this.aClass120_3);
				}
			} else if (arg1 == 1) {
				if (this.aClass120_3 == null) {
					throw new RuntimeException();
				}
				local9 = this.aClass32_2.method687(arg0, this.aClass120_3);
			} else if (arg1 == 2) {
				if (this.aClass120_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray68[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass40_3.method859()) {
					return null;
				}
				local9 = this.aClass40_3.method853(arg0, this.anInt5422, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass156_28.method3816((long) arg0, local9);
		}
		if (local9.aBoolean340) {
			return null;
		}
		@Pc(160) byte[] local160 = local9.method3719();
		@Pc(197) int local197;
		@Pc(308) Class1_Sub1_Sub11_Sub1 local308;
		if (!(local9 instanceof Class1_Sub1_Sub11_Sub2)) {
			try {
				if (local160 == null || local160.length <= 2) {
					throw new RuntimeException();
				}
				Static20.aCRC32_1.reset();
				Static20.aCRC32_1.update(local160, 0, local160.length - 2);
				local197 = (int) Static20.aCRC32_1.getValue();
				if (local197 != this.aClass64_2.anIntArray137[arg0]) {
					throw new RuntimeException();
				}
				this.aClass40_3.anInt955 = 0;
				this.aClass40_3.anInt954 = 0;
			} catch (@Pc(366) RuntimeException local366) {
				this.aClass40_3.method862();
				local9.method4616();
				if (local9.aBoolean339 && !this.aClass40_3.method868()) {
					local308 = this.aClass40_3.method853(arg0, this.anInt5422, (byte) 2, true);
					this.aClass156_28.method3816((long) arg0, local308);
				}
				return null;
			}
			local160[local160.length - 2] = (byte) (this.aClass64_2.anIntArray138[arg0] >>> 8);
			local160[local160.length - 1] = (byte) this.aClass64_2.anIntArray138[arg0];
			if (this.aClass120_3 != null) {
				this.aClass32_2.method685(this.aClass120_3, local160, arg0);
				if (this.aByteArray68[arg0] != 1) {
					this.anInt5431++;
					this.aByteArray68[arg0] = 1;
				}
			}
			if (!local9.aBoolean339) {
				local9.method4616();
			}
			return local9;
		}
		try {
			if (local160 == null || local160.length <= 2) {
				throw new RuntimeException();
			}
			Static20.aCRC32_1.reset();
			Static20.aCRC32_1.update(local160, 0, local160.length - 2);
			local197 = (int) Static20.aCRC32_1.getValue();
			if (this.aClass64_2.anIntArray137[arg0] != local197) {
				throw new RuntimeException();
			}
			@Pc(230) int local230 = ((local160[local160.length - 2] & 0xFF) << 8) + (local160[local160.length - 1] & 0xFF);
			if (local230 != (this.aClass64_2.anIntArray138[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray68[arg0] != 1) {
				if (this.aByteArray68[arg0] == 0) {
				}
				this.anInt5431++;
				this.aByteArray68[arg0] = 1;
			}
			if (!local9.aBoolean339) {
				local9.method4616();
			}
			return local9;
		} catch (@Pc(280) Exception local280) {
			this.aByteArray68[arg0] = -1;
			local9.method4616();
			if (local9.aBoolean339 && !this.aClass40_3.method868()) {
				local308 = this.aClass40_3.method853(arg0, this.anInt5422, (byte) 2, true);
				this.aClass156_28.method3816((long) arg0, local308);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I")
	public int method4246() {
		if (this.aClass64_2 == null) {
			return 0;
		} else if (this.aBoolean388) {
			@Pc(28) Class1 local28 = this.aClass24_30.method460();
			return local28 == null ? 0 : (int) local28.aLong223;
		} else {
			return this.aClass64_2.anInt1740;
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I")
	public int method4247() {
		return this.aClass64_2 == null ? 0 : this.aClass64_2.anInt1740;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V")
	@Override
	public void method4233(@OriginalArg(1) int arg0) {
		if (this.aClass120_3 == null) {
			return;
		}
		@Pc(16) Class1 local16;
		for (local16 = this.aClass24_31.method460(); local16 != null; local16 = this.aClass24_31.method464()) {
			if ((long) arg0 == local16.aLong223) {
				return;
			}
		}
		local16 = new Class1();
		local16.aLong223 = arg0;
		this.aClass24_31.method473(local16);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method4234(@OriginalArg(1) int arg0) {
		@Pc(5) Class1_Sub1_Sub11 local5 = this.method4244(arg0, 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = local5.method3719();
			local5.method4616();
			return local19;
		}
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
	public void method4248() {
		if (this.aClass24_30 == null || this.method4232() == null) {
			return;
		}
		for (@Pc(34) Class1 local34 = this.aClass24_31.method460(); local34 != null; local34 = this.aClass24_31.method464()) {
			@Pc(40) int local40 = (int) local34.aLong223;
			if (local40 < 0 || local40 >= this.aClass64_2.anInt1745 || this.aClass64_2.anIntArray136[local40] == 0) {
				local34.method4616();
			} else {
				if (this.aByteArray68[local40] == 0) {
					this.method4244(local40, 1);
				}
				if (this.aByteArray68[local40] == -1) {
					this.method4244(local40, 2);
				}
				if (this.aByteArray68[local40] == 1) {
					local34.method4616();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
	public void method4249() {
		if (this.aClass120_3 != null) {
			this.aBoolean389 = true;
			if (this.aClass24_30 == null) {
				this.aClass24_30 = new Class24();
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lclient!gk;")
	@Override
	public Class64 method4232() {
		if (this.aClass64_2 != null) {
			return this.aClass64_2;
		}
		if (this.aClass1_Sub1_Sub11_1 == null) {
			if (this.aClass40_3.method868()) {
				return null;
			}
			this.aClass1_Sub1_Sub11_1 = this.aClass40_3.method853(this.anInt5422, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub1_Sub11_1.aBoolean340) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass1_Sub1_Sub11_1.method3719();
		if (this.aClass1_Sub1_Sub11_1 instanceof Class1_Sub1_Sub11_Sub2) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass64_2 = new Class64(local51, this.anInt5426);
				if (this.anInt5425 != this.aClass64_2.anInt1748) {
					throw new RuntimeException();
				}
			} catch (@Pc(144) RuntimeException local144) {
				this.aClass64_2 = null;
				if (this.aClass40_3.method868()) {
					this.aClass1_Sub1_Sub11_1 = null;
				} else {
					this.aClass1_Sub1_Sub11_1 = this.aClass40_3.method853(this.anInt5422, 255, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass64_2 = new Class64(local51, this.anInt5426);
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass40_3.method862();
				this.aClass64_2 = null;
				if (this.aClass40_3.method868()) {
					this.aClass1_Sub1_Sub11_1 = null;
				} else {
					this.aClass1_Sub1_Sub11_1 = this.aClass40_3.method853(this.anInt5422, 255, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass120_4 != null) {
				this.aClass32_2.method685(this.aClass120_4, local51, this.anInt5422);
			}
		}
		if (this.aClass120_3 != null) {
			this.anInt5431 = 0;
			this.aByteArray68 = new byte[this.aClass64_2.anInt1745];
		}
		this.aClass1_Sub1_Sub11_1 = null;
		return this.aClass64_2;
	}
}
