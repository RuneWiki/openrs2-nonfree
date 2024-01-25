import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Lclient!md;")
	private Class126 aClass126_1;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!f", name = "T", descriptor = "Z")
	private boolean aBoolean147;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "I")
	private int anInt1700 = 0;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!br;")
	private final Class26 aClass26_8 = new Class26(16);

	@OriginalMember(owner = "client!f", name = "O", descriptor = "I")
	private int anInt1706 = 0;

	@OriginalMember(owner = "client!f", name = "P", descriptor = "Lclient!tc;")
	private final Class195 aClass195_10 = new Class195();

	@OriginalMember(owner = "client!f", name = "V", descriptor = "J")
	private long aLong70 = 0L;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	private final int anInt1692;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!rb;")
	private final Class173 aClass173_3;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "Z")
	private boolean aBoolean146;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "Lclient!tc;")
	private Class195 aClass195_11;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "I")
	private final int anInt1693;

	@OriginalMember(owner = "client!f", name = "N", descriptor = "Lclient!ul;")
	private final Class205 aClass205_1;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "I")
	private final int anInt1686;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!rb;")
	private final Class173 aClass173_4;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "Z")
	private final boolean aBoolean148;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "Lclient!mr;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "Lclient!dn;")
	private Class1_Sub1_Sub1 aClass1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILclient!rb;Lclient!rb;Lclient!ul;Lclient!mr;IIZ)V")
	public Class56_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) Class173 arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) Class135 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1692 = arg0;
		this.aClass173_3 = arg1;
		if (this.aClass173_3 == null) {
			this.aBoolean146 = false;
		} else {
			this.aBoolean146 = true;
			this.aClass195_11 = new Class195();
		}
		this.anInt1693 = arg5;
		this.aClass205_1 = arg3;
		this.anInt1686 = arg6;
		this.aClass173_4 = arg2;
		this.aBoolean148 = arg7;
		this.aClass135_1 = arg4;
		if (this.aClass173_4 != null) {
			this.aClass1_Sub1_Sub1_1 = this.aClass135_1.method3738(this.aClass173_4, this.anInt1692);
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public void method1643() {
		if (this.aClass173_3 != null) {
			this.aBoolean147 = true;
			if (this.aClass195_11 == null) {
				this.aClass195_11 = new Class195();
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method1641(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub1_Sub1 local9 = this.method1646(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method1692();
			local9.method5710();
			return local25;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)Lclient!dn;")
	private Class1_Sub1_Sub1 method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub1_Sub1 local13 = (Class1_Sub1_Sub1) this.aClass26_8.method870((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean155 && local13.aBoolean154) {
			local13.method5710();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass173_3 == null || this.aByteArray23[arg1] == -1) {
					if (this.aClass205_1.method5340()) {
						return null;
					}
					local13 = this.aClass205_1.method5350(this.anInt1692, true, arg1, (byte) 2);
				} else {
					local13 = this.aClass135_1.method3738(this.aClass173_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass173_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass135_1.method3733(this.aClass173_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass173_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray23[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass205_1.method5352()) {
					return null;
				}
				local13 = this.aClass205_1.method5350(this.anInt1692, false, arg1, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass26_8.method877((long) arg1, local13);
		}
		if (local13.aBoolean154) {
			return null;
		}
		@Pc(164) byte[] local164 = local13.method1692();
		@Pc(191) int local191;
		@Pc(287) Class1_Sub1_Sub1_Sub2 local287;
		if (!(local13 instanceof Class1_Sub1_Sub1_Sub1)) {
			try {
				if (local164 == null || local164.length <= 2) {
					throw new RuntimeException();
				}
				Static39.aCRC32_1.reset();
				Static39.aCRC32_1.update(local164, 0, local164.length - 2);
				local191 = (int) Static39.aCRC32_1.getValue();
				if (local191 != this.aClass126_1.anIntArray466[arg1]) {
					throw new RuntimeException();
				}
				this.aClass205_1.anInt6111 = 0;
				this.aClass205_1.anInt6110 = 0;
			} catch (@Pc(345) RuntimeException local345) {
				this.aClass205_1.method5338();
				local13.method5710();
				if (local13.aBoolean155 && !this.aClass205_1.method5340()) {
					local287 = this.aClass205_1.method5350(this.anInt1692, true, arg1, (byte) 2);
					this.aClass26_8.method877((long) arg1, local287);
				}
				return null;
			}
			local164[local164.length - 2] = (byte) (this.aClass126_1.anIntArray467[arg1] >>> 8);
			local164[local164.length - 1] = (byte) this.aClass126_1.anIntArray467[arg1];
			if (this.aClass173_3 != null) {
				this.aClass135_1.method3735(local164, arg1, this.aClass173_3);
				if (this.aByteArray23[arg1] != 1) {
					this.anInt1700++;
					this.aByteArray23[arg1] = 1;
				}
			}
			if (!local13.aBoolean155) {
				local13.method5710();
			}
			return local13;
		}
		try {
			if (local164 == null || local164.length <= 2) {
				throw new RuntimeException();
			}
			Static39.aCRC32_1.reset();
			Static39.aCRC32_1.update(local164, 0, local164.length - 2);
			local191 = (int) Static39.aCRC32_1.getValue();
			if (local191 != this.aClass126_1.anIntArray466[arg1]) {
				throw new RuntimeException();
			}
			@Pc(222) int local222 = (local164[local164.length - 1] & 0xFF) + ((local164[local164.length - 2] & 0xFF) << 8);
			if (local222 != (this.aClass126_1.anIntArray467[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray23[arg1] != 1) {
				this.anInt1700++;
				this.aByteArray23[arg1] = 1;
			}
			if (!local13.aBoolean155) {
				local13.method5710();
			}
			return local13;
		} catch (@Pc(261) Exception local261) {
			this.aByteArray23[arg1] = -1;
			local13.method5710();
			if (local13.aBoolean155 && !this.aClass205_1.method5340()) {
				local287 = this.aClass205_1.method5350(this.anInt1692, true, arg1, (byte) 2);
				this.aClass26_8.method877((long) arg1, local287);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
	public int method1647() {
		if (this.aClass126_1 == null) {
			return 0;
		} else if (this.aBoolean146) {
			@Pc(27) Class1 local27 = this.aClass195_11.method5029();
			return local27 == null ? 0 : (int) local27.aLong215;
		} else {
			return this.aClass126_1.anInt3927;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
	@Override
	public int method1636(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub1_Sub1 local11 = (Class1_Sub1_Sub1) this.aClass26_8.method870((long) arg0);
		return local11 == null ? 0 : local11.method1688();
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)I")
	public int method1648() {
		return this.aClass126_1 == null ? 0 : this.aClass126_1.anInt3927;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public void method1649() {
		if (this.aClass195_11 == null || this.method1637() == null) {
			return;
		}
		for (@Pc(24) Class1 local24 = this.aClass195_10.method5029(); local24 != null; local24 = this.aClass195_10.method5021()) {
			@Pc(30) int local30 = (int) local24.aLong215;
			if (local30 < 0 || local30 >= this.aClass126_1.anInt3922 || this.aClass126_1.anIntArray464[local30] == 0) {
				local24.method5710();
			} else {
				if (this.aByteArray23[local30] == 0) {
					this.method1646(1, local30);
				}
				if (this.aByteArray23[local30] == -1) {
					this.method1646(2, local30);
				}
				if (this.aByteArray23[local30] == 1) {
					local24.method5710();
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public void method1650() {
		if (this.aClass195_11 != null) {
			if (this.method1637() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class1 local31;
			@Pc(37) int local37;
			@Pc(127) Class1 local127;
			if (this.aBoolean146) {
				local26 = true;
				for (local31 = this.aClass195_11.method5029(); local31 != null; local31 = this.aClass195_11.method5021()) {
					local37 = (int) local31.aLong215;
					if (this.aByteArray23[local37] == 0) {
						this.method1646(1, local37);
					}
					if (this.aByteArray23[local37] == 0) {
						local26 = false;
					} else {
						local31.method5710();
					}
				}
				while (this.aClass126_1.anIntArray464.length > this.anInt1706) {
					if (this.aClass126_1.anIntArray464[this.anInt1706] == 0) {
						this.anInt1706++;
					} else {
						if (this.aClass135_1.anInt4051 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray23[this.anInt1706] == 0) {
							this.method1646(1, this.anInt1706);
						}
						if (this.aByteArray23[this.anInt1706] == 0) {
							local127 = new Class1();
							local127.aLong215 = this.anInt1706;
							this.aClass195_11.method5018(local127);
							local26 = false;
						}
						this.anInt1706++;
					}
				}
				if (local26) {
					this.anInt1706 = 0;
					this.aBoolean146 = false;
				}
			} else if (this.aBoolean147) {
				local26 = true;
				for (local31 = this.aClass195_11.method5029(); local31 != null; local31 = this.aClass195_11.method5021()) {
					local37 = (int) local31.aLong215;
					if (this.aByteArray23[local37] != 1) {
						this.method1646(2, local37);
					}
					if (this.aByteArray23[local37] == 1) {
						local31.method5710();
					} else {
						local26 = false;
					}
				}
				while (this.anInt1706 < this.aClass126_1.anIntArray464.length) {
					if (this.aClass126_1.anIntArray464[this.anInt1706] == 0) {
						this.anInt1706++;
					} else {
						if (this.aClass205_1.method5352()) {
							local26 = false;
							break;
						}
						if (this.aByteArray23[this.anInt1706] != 1) {
							this.method1646(2, this.anInt1706);
						}
						if (this.aByteArray23[this.anInt1706] != 1) {
							local127 = new Class1();
							local127.aLong215 = this.anInt1706;
							this.aClass195_11.method5018(local127);
							local26 = false;
						}
						this.anInt1706++;
					}
				}
				if (local26) {
					this.anInt1706 = 0;
					this.aBoolean147 = false;
				}
			} else {
				this.aClass195_11 = null;
			}
		}
		if (!this.aBoolean148 || this.aLong70 > Static349.method5647()) {
			return;
		}
		for (@Pc(328) Class1_Sub1_Sub1 local328 = (Class1_Sub1_Sub1) this.aClass26_8.method871(); local328 != null; local328 = (Class1_Sub1_Sub1) this.aClass26_8.method878()) {
			if (!local328.aBoolean154) {
				if (local328.aBoolean152) {
					if (!local328.aBoolean155) {
						throw new RuntimeException();
					}
					local328.method5710();
				} else {
					local328.aBoolean152 = true;
				}
			}
		}
		this.aLong70 = Static349.method5647() + 1000L;
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)I")
	public int method1651() {
		if (this.method1637() == null) {
			return this.aClass1_Sub1_Sub1_1 == null ? 0 : this.aClass1_Sub1_Sub1_1.method1688();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V")
	@Override
	public void method1639(@OriginalArg(1) int arg0) {
		if (this.aClass173_3 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass195_10.method5029(); local14 != null; local14 = this.aClass195_10.method5021()) {
			if ((long) arg0 == local14.aLong215) {
				return;
			}
		}
		@Pc(45) Class1 local45 = new Class1();
		local45.aLong215 = arg0;
		this.aClass195_10.method5018(local45);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Lclient!md;")
	@Override
	public Class126 method1637() {
		if (this.aClass126_1 != null) {
			return this.aClass126_1;
		}
		if (this.aClass1_Sub1_Sub1_1 == null) {
			if (this.aClass205_1.method5340()) {
				return null;
			}
			this.aClass1_Sub1_Sub1_1 = this.aClass205_1.method5350(255, true, this.anInt1692, (byte) 0);
		}
		if (this.aClass1_Sub1_Sub1_1.aBoolean154) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass1_Sub1_Sub1_1.method1692();
		if (this.aClass1_Sub1_Sub1_1 instanceof Class1_Sub1_Sub1_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass126_1 = new Class126(local43, this.anInt1693);
				if (this.anInt1686 != this.aClass126_1.anInt3928) {
					throw new RuntimeException();
				}
			} catch (@Pc(139) RuntimeException local139) {
				this.aClass126_1 = null;
				if (this.aClass205_1.method5340()) {
					this.aClass1_Sub1_Sub1_1 = null;
				} else {
					this.aClass1_Sub1_Sub1_1 = this.aClass205_1.method5350(255, true, this.anInt1692, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass126_1 = new Class126(local43, this.anInt1693);
			} catch (@Pc(63) RuntimeException local63) {
				this.aClass205_1.method5338();
				this.aClass126_1 = null;
				if (this.aClass205_1.method5340()) {
					this.aClass1_Sub1_Sub1_1 = null;
				} else {
					this.aClass1_Sub1_Sub1_1 = this.aClass205_1.method5350(255, true, this.anInt1692, (byte) 0);
				}
				return null;
			}
			if (this.aClass173_4 != null) {
				this.aClass135_1.method3735(local43, this.anInt1692, this.aClass173_4);
			}
		}
		this.aClass1_Sub1_Sub1_1 = null;
		if (this.aClass173_3 != null) {
			this.aByteArray23 = new byte[this.aClass126_1.anInt3922];
			this.anInt1700 = 0;
		}
		return this.aClass126_1;
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "(I)I")
	public int method1652() {
		return this.anInt1700;
	}
}
