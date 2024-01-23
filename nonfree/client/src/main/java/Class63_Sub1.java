import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!hn", name = "P", descriptor = "Lclient!ki;")
	private Class89 aClass89_1;

	@OriginalMember(owner = "client!hn", name = "S", descriptor = "Z")
	private boolean aBoolean170;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	private int anInt2443 = 0;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!ik;")
	private Class70 aClass70_7 = new Class70(16);

	@OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
	private int anInt2465 = 0;

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "Lclient!hi;")
	private Class61 aClass61_11 = new Class61();

	@OriginalMember(owner = "client!hn", name = "W", descriptor = "J")
	private long aLong95 = 0L;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "Lclient!ng;")
	private Class111 aClass111_2;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	private int anInt2441;

	@OriginalMember(owner = "client!hn", name = "U", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!hn", name = "T", descriptor = "Lclient!hi;")
	private Class61 aClass61_12;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "Lclient!ng;")
	private Class111 aClass111_3;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
	private int anInt2451;

	@OriginalMember(owner = "client!hn", name = "V", descriptor = "Z")
	private boolean aBoolean172;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "Lclient!pk;")
	private Class130 aClass130_3;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "Lclient!ue;")
	private Class162 aClass162_2;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	private int anInt2447;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "Lclient!kd;")
	private Class1_Sub2_Sub6 aClass1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILclient!ng;Lclient!ng;Lclient!ue;Lclient!pk;IIZ)V")
	public Class63_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Class162 arg3, @OriginalArg(4) Class130 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass111_2 = arg1;
		this.anInt2441 = arg0;
		if (this.aClass111_2 == null) {
			this.aBoolean171 = false;
		} else {
			this.aBoolean171 = true;
			this.aClass61_12 = new Class61();
		}
		this.aClass111_3 = arg2;
		this.anInt2451 = arg5;
		this.aBoolean172 = arg7;
		this.aClass130_3 = arg4;
		this.aClass162_2 = arg3;
		this.anInt2447 = arg6;
		if (this.aClass111_3 != null) {
			this.aClass1_Sub2_Sub6_1 = this.aClass130_3.method3291(this.aClass111_3, this.anInt2441);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Lclient!kd;")
	private Class1_Sub2_Sub6 method1931(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub6 local9 = (Class1_Sub2_Sub6) this.aClass70_7.method2075((long) arg0);
		if (local9 != null && arg1 == 0 && !local9.aBoolean327 && local9.aBoolean325) {
			local9.method4441();
			local9 = null;
		}
		if (local9 == null) {
			if (arg1 == 0) {
				if (this.aClass111_2 == null || this.aByteArray38[arg0] == -1) {
					if (this.aClass162_2.method4039()) {
						return null;
					}
					local9 = this.aClass162_2.method4036(arg0, (byte) 2, this.anInt2441, true);
				} else {
					local9 = this.aClass130_3.method3291(this.aClass111_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass111_2 == null) {
					throw new RuntimeException();
				}
				local9 = this.aClass130_3.method3288(arg0, this.aClass111_2);
			} else if (arg1 == 2) {
				if (this.aClass111_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray38[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass162_2.method4041()) {
					return null;
				}
				local9 = this.aClass162_2.method4036(arg0, (byte) 2, this.anInt2441, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass70_7.method2084((long) arg0, local9);
		}
		if (local9.aBoolean325) {
			return null;
		}
		@Pc(162) byte[] local162 = local9.method3364();
		@Pc(191) int local191;
		@Pc(238) Class1_Sub2_Sub6_Sub2 local238;
		if (!(local9 instanceof Class1_Sub2_Sub6_Sub1)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static279.aCRC32_1.reset();
				Static279.aCRC32_1.update(local162, 0, local162.length - 2);
				local191 = (int) Static279.aCRC32_1.getValue();
				if (local191 != this.aClass89_1.anIntArray274[arg0]) {
					throw new RuntimeException();
				}
				this.aClass162_2.anInt5162 = 0;
				this.aClass162_2.anInt5163 = 0;
			} catch (@Pc(212) RuntimeException local212) {
				this.aClass162_2.method4037();
				local9.method4441();
				if (local9.aBoolean327 && !this.aClass162_2.method4039()) {
					local238 = this.aClass162_2.method4036(arg0, (byte) 2, this.anInt2441, true);
					this.aClass70_7.method2084((long) arg0, local238);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass89_1.anIntArray277[arg0] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass89_1.anIntArray277[arg0];
			if (this.aClass111_2 != null) {
				this.aClass130_3.method3290(this.aClass111_2, arg0, local162);
				if (this.aByteArray38[arg0] != 1) {
					this.anInt2443++;
					this.aByteArray38[arg0] = 1;
				}
			}
			if (!local9.aBoolean327) {
				local9.method4441();
			}
			return local9;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static279.aCRC32_1.reset();
			Static279.aCRC32_1.update(local162, 0, local162.length - 2);
			local191 = (int) Static279.aCRC32_1.getValue();
			if (this.aClass89_1.anIntArray274[arg0] != local191) {
				throw new RuntimeException();
			}
			@Pc(373) int local373 = ((local162[local162.length - 2] & 0xFF) << 8) + (local162[local162.length - 1] & 0xFF);
			if (local373 != (this.aClass89_1.anIntArray277[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray38[arg0] != 1) {
				if (this.aByteArray38[arg0] != 0) {
				}
				this.anInt2443++;
				this.aByteArray38[arg0] = 1;
			}
			if (!local9.aBoolean327) {
				local9.method4441();
			}
			return local9;
		} catch (@Pc(420) Exception local420) {
			this.aByteArray38[arg0] = -1;
			local9.method4441();
			if (local9.aBoolean327 && !this.aClass162_2.method4039()) {
				local238 = this.aClass162_2.method4036(arg0, (byte) 2, this.anInt2441, true);
				this.aClass70_7.method2084((long) arg0, local238);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public void method1933() {
		if (this.aClass61_12 == null || this.method1925() == null) {
			return;
		}
		for (@Pc(26) Class1 local26 = this.aClass61_11.method1835(); local26 != null; local26 = this.aClass61_11.method1836()) {
			@Pc(32) int local32 = (int) local26.aLong205;
			if (local32 < 0 || this.aClass89_1.anInt3040 <= local32 || this.aClass89_1.anIntArray278[local32] == 0) {
				local26.method4441();
			} else {
				if (this.aByteArray38[local32] == 0) {
					this.method1931(local32, 1);
				}
				if (this.aByteArray38[local32] == -1) {
					this.method1931(local32, 2);
				}
				if (this.aByteArray38[local32] == 1) {
					local26.method4441();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(BI)V")
	@Override
	public void method1930(@OriginalArg(1) int arg0) {
		if (this.aClass111_2 == null) {
			return;
		}
		@Pc(15) Class1 local15;
		for (local15 = this.aClass61_11.method1835(); local15 != null; local15 = this.aClass61_11.method1836()) {
			if (local15.aLong205 == (long) arg0) {
				return;
			}
		}
		local15 = new Class1();
		local15.aLong205 = arg0;
		this.aClass61_11.method1839(local15);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I")
	public int method1935() {
		return this.aClass89_1 == null ? 0 : this.aClass89_1.anInt3038;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)I")
	@Override
	public int method1927(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub2_Sub6 local19 = (Class1_Sub2_Sub6) this.aClass70_7.method2075((long) arg0);
		return local19 == null ? 0 : local19.method3362();
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
	public void method1936() {
		if (this.aClass61_12 != null) {
			if (this.method1925() == null) {
				return;
			}
			@Pc(31) boolean local31;
			@Pc(36) Class1 local36;
			@Pc(43) int local43;
			if (this.aBoolean171) {
				local31 = true;
				for (local36 = this.aClass61_12.method1835(); local36 != null; local36 = this.aClass61_12.method1836()) {
					local43 = (int) local36.aLong205;
					if (this.aByteArray38[local43] == 0) {
						this.method1931(local43, 1);
					}
					if (this.aByteArray38[local43] == 0) {
						local31 = false;
					} else {
						local36.method4441();
					}
				}
				while (this.aClass89_1.anIntArray278.length > this.anInt2465) {
					if (this.aClass89_1.anIntArray278[this.anInt2465] == 0) {
						this.anInt2465++;
					} else {
						if (this.aClass130_3.anInt4143 >= 250) {
							local31 = false;
							break;
						}
						if (this.aByteArray38[this.anInt2465] == 0) {
							this.method1931(this.anInt2465, 1);
						}
						if (this.aByteArray38[this.anInt2465] == 0) {
							local36 = new Class1();
							local36.aLong205 = this.anInt2465;
							this.aClass61_12.method1839(local36);
							local31 = false;
						}
						this.anInt2465++;
					}
				}
				if (local31) {
					this.aBoolean171 = false;
					this.anInt2465 = 0;
				}
			} else if (this.aBoolean170) {
				local31 = true;
				for (local36 = this.aClass61_12.method1835(); local36 != null; local36 = this.aClass61_12.method1836()) {
					local43 = (int) local36.aLong205;
					if (this.aByteArray38[local43] != 1) {
						this.method1931(local43, 2);
					}
					if (this.aByteArray38[local43] == 1) {
						local36.method4441();
					} else {
						local31 = false;
					}
				}
				while (this.anInt2465 < this.aClass89_1.anIntArray278.length) {
					if (this.aClass89_1.anIntArray278[this.anInt2465] == 0) {
						this.anInt2465++;
					} else {
						if (this.aClass162_2.method4041()) {
							local31 = false;
							break;
						}
						if (this.aByteArray38[this.anInt2465] != 1) {
							this.method1931(this.anInt2465, 2);
						}
						if (this.aByteArray38[this.anInt2465] != 1) {
							local31 = false;
							local36 = new Class1();
							local36.aLong205 = this.anInt2465;
							this.aClass61_12.method1839(local36);
						}
						this.anInt2465++;
					}
				}
				if (local31) {
					this.aBoolean170 = false;
					this.anInt2465 = 0;
				}
			} else {
				this.aClass61_12 = null;
			}
		}
		if (!this.aBoolean172 || Static294.method4413() < this.aLong95) {
			return;
		}
		for (@Pc(338) Class1_Sub2_Sub6 local338 = (Class1_Sub2_Sub6) this.aClass70_7.method2074(); local338 != null; local338 = (Class1_Sub2_Sub6) this.aClass70_7.method2079()) {
			if (!local338.aBoolean325) {
				if (local338.aBoolean326) {
					if (!local338.aBoolean327) {
						throw new RuntimeException();
					}
					local338.method4441();
				} else {
					local338.aBoolean326 = true;
				}
			}
		}
		this.aLong95 = Static294.method4413() + 1000L;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I")
	public int method1937() {
		return this.anInt2443;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	public void method1938() {
		if (this.aClass111_2 != null) {
			this.aBoolean170 = true;
			if (this.aClass61_12 == null) {
				this.aClass61_12 = new Class61();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)I")
	public int method1940() {
		if (this.method1925() == null) {
			return this.aClass1_Sub2_Sub6_1 == null ? 0 : this.aClass1_Sub2_Sub6_1.method3362();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)I")
	public int method1941() {
		if (this.aClass89_1 == null) {
			return 0;
		} else if (this.aBoolean171) {
			@Pc(23) Class1 local23 = this.aClass61_12.method1835();
			return local23 == null ? 0 : (int) local23.aLong205;
		} else {
			return this.aClass89_1.anInt3038;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Lclient!ki;")
	@Override
	public Class89 method1925() {
		if (this.aClass89_1 != null) {
			return this.aClass89_1;
		}
		if (this.aClass1_Sub2_Sub6_1 == null) {
			if (this.aClass162_2.method4039()) {
				return null;
			}
			this.aClass1_Sub2_Sub6_1 = this.aClass162_2.method4036(this.anInt2441, (byte) 0, 255, true);
		}
		if (this.aClass1_Sub2_Sub6_1.aBoolean325) {
			return null;
		}
		@Pc(55) byte[] local55 = this.aClass1_Sub2_Sub6_1.method3364();
		if (this.aClass1_Sub2_Sub6_1 instanceof Class1_Sub2_Sub6_Sub1) {
			try {
				if (local55 == null) {
					throw new RuntimeException();
				}
				this.aClass89_1 = new Class89(local55, this.anInt2451);
				if (this.anInt2447 != this.aClass89_1.anInt3041) {
					throw new RuntimeException();
				}
			} catch (@Pc(151) RuntimeException local151) {
				this.aClass89_1 = null;
				if (this.aClass162_2.method4039()) {
					this.aClass1_Sub2_Sub6_1 = null;
				} else {
					this.aClass1_Sub2_Sub6_1 = this.aClass162_2.method4036(this.anInt2441, (byte) 0, 255, true);
				}
				return null;
			}
		} else {
			try {
				if (local55 == null) {
					throw new RuntimeException();
				}
				this.aClass89_1 = new Class89(local55, this.anInt2451);
			} catch (@Pc(77) RuntimeException local77) {
				this.aClass162_2.method4037();
				this.aClass89_1 = null;
				if (this.aClass162_2.method4039()) {
					this.aClass1_Sub2_Sub6_1 = null;
				} else {
					this.aClass1_Sub2_Sub6_1 = this.aClass162_2.method4036(this.anInt2441, (byte) 0, 255, true);
				}
				return null;
			}
			if (this.aClass111_3 != null) {
				this.aClass130_3.method3290(this.aClass111_3, this.anInt2441, local55);
			}
		}
		if (this.aClass111_2 != null) {
			this.aByteArray38 = new byte[this.aClass89_1.anInt3040];
			this.anInt2443 = 0;
		}
		this.aClass1_Sub2_Sub6_1 = null;
		return this.aClass89_1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method1929(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub2_Sub6 local9 = this.method1931(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = local9.method3364();
			local9.method4441();
			return local19;
		}
	}
}
