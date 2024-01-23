import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "[J")
	public static long[] aLongArray2 = new long[256];

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!oh;")
	private Class126 aClass126_2;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "Z")
	private boolean aBoolean120;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	private int anInt1850 = 0;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!l;")
	private Class101 aClass101_3 = new Class101(16);

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	private int anInt1868 = 0;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "Lclient!en;")
	private Class44 aClass44_7 = new Class44();

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "J")
	private long aLong66 = 0L;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	private int anInt1853;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "Lclient!ma;")
	private Class108 aClass108_2;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "Z")
	private boolean aBoolean119;

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "Lclient!en;")
	private Class44 aClass44_6;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	private int anInt1858;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!id;")
	private Class80 aClass80_2;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!bo;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Z")
	private boolean aBoolean121;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
	private int anInt1866;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!ma;")
	private Class108 aClass108_1;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!il;")
	private Class2_Sub8_Sub2 aClass2_Sub8_Sub2_1;

	static {
		for (@Pc(81) int local81 = 0; local81 < 256; local81++) {
			@Pc(89) long local89 = (long) local81;
			for (@Pc(91) int local91 = 0; local91 < 8; local91++) {
				if ((local89 & 0x1L) == 1L) {
					local89 = local89 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local89 >>>= 0x1;
				}
			}
			aLongArray2[local81] = local89;
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient!ma;Lclient!ma;Lclient!bo;Lclient!id;IIZ)V")
	public Class31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) Class108 arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) Class80 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1853 = arg0;
		this.aClass108_2 = arg1;
		if (this.aClass108_2 == null) {
			this.aBoolean119 = false;
		} else {
			this.aBoolean119 = true;
			this.aClass44_6 = new Class44();
		}
		this.anInt1858 = arg5;
		this.aClass80_2 = arg4;
		this.aClass21_2 = arg3;
		this.aBoolean121 = arg7;
		this.anInt1866 = arg6;
		this.aClass108_1 = arg2;
		if (this.aClass108_1 != null) {
			this.aClass2_Sub8_Sub2_1 = this.aClass80_2.method1999(this.aClass108_1, this.anInt1853);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Lclient!il;")
	private Class2_Sub8_Sub2 method1412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class2_Sub8_Sub2 local21 = (Class2_Sub8_Sub2) this.aClass101_3.method2867((long) arg1);
		if (local21 != null && arg0 == 0 && !local21.aBoolean271 && local21.aBoolean272) {
			local21.method4743();
			local21 = null;
		}
		if (local21 == null) {
			if (arg0 == 0) {
				if (this.aClass108_2 == null || this.aByteArray11[arg1] == -1) {
					if (this.aClass21_2.method561()) {
						return null;
					}
					local21 = this.aClass21_2.method564((byte) 2, arg1, this.anInt1853, true);
				} else {
					local21 = this.aClass80_2.method1999(this.aClass108_2, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass108_2 == null) {
					throw new RuntimeException();
				}
				local21 = this.aClass80_2.method2005(arg1, this.aClass108_2);
			} else if (arg0 == 2) {
				if (this.aClass108_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray11[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass21_2.method551()) {
					return null;
				}
				local21 = this.aClass21_2.method564((byte) 2, arg1, this.anInt1853, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass101_3.method2860(local21, (long) arg1);
		}
		if (local21.aBoolean272) {
			return null;
		}
		@Pc(170) byte[] local170 = local21.method3254();
		@Pc(197) int local197;
		@Pc(246) Class2_Sub8_Sub2_Sub1 local246;
		if (!(local21 instanceof Class2_Sub8_Sub2_Sub2)) {
			try {
				if (local170 == null || local170.length <= 2) {
					throw new RuntimeException();
				}
				Static277.aCRC32_1.reset();
				Static277.aCRC32_1.update(local170, 0, local170.length - 2);
				local197 = (int) Static277.aCRC32_1.getValue();
				if (local197 != this.aClass126_2.anIntArray420[arg1]) {
					throw new RuntimeException();
				}
				this.aClass21_2.anInt641 = 0;
				this.aClass21_2.anInt640 = 0;
			} catch (@Pc(219) RuntimeException local219) {
				this.aClass21_2.method556();
				local21.method4743();
				if (local21.aBoolean271 && !this.aClass21_2.method561()) {
					local246 = this.aClass21_2.method564((byte) 2, arg1, this.anInt1853, true);
					this.aClass101_3.method2860(local246, (long) arg1);
				}
				return null;
			}
			local170[local170.length - 2] = (byte) (this.aClass126_2.anIntArray417[arg1] >>> 8);
			local170[local170.length - 1] = (byte) this.aClass126_2.anIntArray417[arg1];
			if (this.aClass108_2 != null) {
				this.aClass80_2.method2002(local170, this.aClass108_2, arg1);
				if (this.aByteArray11[arg1] != 1) {
					this.anInt1850++;
					this.aByteArray11[arg1] = 1;
				}
			}
			if (!local21.aBoolean271) {
				local21.method4743();
			}
			return local21;
		}
		try {
			if (local170 == null || local170.length <= 2) {
				throw new RuntimeException();
			}
			Static277.aCRC32_1.reset();
			Static277.aCRC32_1.update(local170, 0, local170.length - 2);
			local197 = (int) Static277.aCRC32_1.getValue();
			if (local197 != this.aClass126_2.anIntArray420[arg1]) {
				throw new RuntimeException();
			}
			@Pc(378) int local378 = (local170[local170.length - 1] & 0xFF) + ((local170[local170.length - 2] & 0xFF) << 8);
			if ((this.aClass126_2.anIntArray417[arg1] & 0xFFFF) != local378) {
				throw new RuntimeException();
			}
			if (this.aByteArray11[arg1] != 1) {
				if (this.aByteArray11[arg1] != 0) {
				}
				this.anInt1850++;
				this.aByteArray11[arg1] = 1;
			}
			if (!local21.aBoolean271) {
				local21.method4743();
			}
			return local21;
		} catch (@Pc(431) Exception local431) {
			this.aByteArray11[arg1] = -1;
			local21.method4743();
			if (local21.aBoolean271 && !this.aClass21_2.method561()) {
				local246 = this.aClass21_2.method564((byte) 2, arg1, this.anInt1853, true);
				this.aClass101_3.method2860(local246, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)I")
	public int method1413() {
		if (this.aClass126_2 == null) {
			return 0;
		} else if (this.aBoolean119) {
			@Pc(30) Class2 local30 = this.aClass44_6.method1352();
			return local30 == null ? 0 : (int) local30.aLong214;
		} else {
			return this.aClass126_2.anInt4264;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	@Override
	public void method1405(@OriginalArg(0) int arg0) {
		if (this.aClass108_2 == null) {
			return;
		}
		@Pc(16) Class2 local16;
		for (local16 = this.aClass44_7.method1352(); local16 != null; local16 = this.aClass44_7.method1360()) {
			if ((long) arg0 == local16.aLong214) {
				return;
			}
		}
		local16 = new Class2();
		local16.aLong214 = arg0;
		this.aClass44_7.method1358(local16);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public void method1414() {
		if (this.aClass44_6 != null) {
			if (this.method1406() == null) {
				return;
			}
			@Pc(24) boolean local24;
			@Pc(29) Class2 local29;
			@Pc(35) int local35;
			if (this.aBoolean119) {
				local24 = true;
				for (local29 = this.aClass44_6.method1352(); local29 != null; local29 = this.aClass44_6.method1360()) {
					local35 = (int) local29.aLong214;
					if (this.aByteArray11[local35] == 0) {
						this.method1412(1, local35);
					}
					if (this.aByteArray11[local35] == 0) {
						local24 = false;
					} else {
						local29.method4743();
					}
				}
				while (this.aClass126_2.anIntArray419.length > this.anInt1868) {
					if (this.aClass126_2.anIntArray419[this.anInt1868] == 0) {
						this.anInt1868++;
					} else {
						if (this.aClass80_2.anInt2644 >= 250) {
							local24 = false;
							break;
						}
						if (this.aByteArray11[this.anInt1868] == 0) {
							this.method1412(1, this.anInt1868);
						}
						if (this.aByteArray11[this.anInt1868] == 0) {
							local29 = new Class2();
							local29.aLong214 = this.anInt1868;
							local24 = false;
							this.aClass44_6.method1358(local29);
						}
						this.anInt1868++;
					}
				}
				if (local24) {
					this.anInt1868 = 0;
					this.aBoolean119 = false;
				}
			} else if (this.aBoolean120) {
				local24 = true;
				for (local29 = this.aClass44_6.method1352(); local29 != null; local29 = this.aClass44_6.method1360()) {
					local35 = (int) local29.aLong214;
					if (this.aByteArray11[local35] != 1) {
						this.method1412(2, local35);
					}
					if (this.aByteArray11[local35] == 1) {
						local29.method4743();
					} else {
						local24 = false;
					}
				}
				while (this.anInt1868 < this.aClass126_2.anIntArray419.length) {
					if (this.aClass126_2.anIntArray419[this.anInt1868] == 0) {
						this.anInt1868++;
					} else {
						if (this.aClass21_2.method551()) {
							local24 = false;
							break;
						}
						if (this.aByteArray11[this.anInt1868] != 1) {
							this.method1412(2, this.anInt1868);
						}
						if (this.aByteArray11[this.anInt1868] != 1) {
							local24 = false;
							local29 = new Class2();
							local29.aLong214 = this.anInt1868;
							this.aClass44_6.method1358(local29);
						}
						this.anInt1868++;
					}
				}
				if (local24) {
					this.anInt1868 = 0;
					this.aBoolean120 = false;
				}
			} else {
				this.aClass44_6 = null;
			}
		}
		if (!this.aBoolean121 || Static221.method3670() < this.aLong66) {
			return;
		}
		for (@Pc(327) Class2_Sub8_Sub2 local327 = (Class2_Sub8_Sub2) this.aClass101_3.method2868(); local327 != null; local327 = (Class2_Sub8_Sub2) this.aClass101_3.method2859()) {
			if (!local327.aBoolean272) {
				if (local327.aBoolean273) {
					if (!local327.aBoolean271) {
						throw new RuntimeException();
					}
					local327.method4743();
				} else {
					local327.aBoolean273 = true;
				}
			}
		}
		this.aLong66 = Static221.method3670() + 1000L;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public void method1415() {
		if (this.aClass108_2 != null) {
			this.aBoolean120 = true;
			if (this.aClass44_6 == null) {
				this.aClass44_6 = new Class44();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)[B")
	@Override
	public byte[] method1411(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub8_Sub2 local9 = this.method1412(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = local9.method3254();
			local9.method4743();
			return local19;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class126 method1406() {
		if (this.aClass126_2 != null) {
			return this.aClass126_2;
		}
		if (this.aClass2_Sub8_Sub2_1 == null) {
			if (this.aClass21_2.method561()) {
				return null;
			}
			this.aClass2_Sub8_Sub2_1 = this.aClass21_2.method564((byte) 0, this.anInt1853, 255, true);
		}
		if (this.aClass2_Sub8_Sub2_1.aBoolean272) {
			return null;
		}
		@Pc(47) byte[] local47 = this.aClass2_Sub8_Sub2_1.method3254();
		if (this.aClass2_Sub8_Sub2_1 instanceof Class2_Sub8_Sub2_Sub2) {
			try {
				if (local47 == null) {
					throw new RuntimeException();
				}
				this.aClass126_2 = new Class126(local47, this.anInt1858);
				if (this.aClass126_2.anInt4266 != this.anInt1866) {
					throw new RuntimeException();
				}
			} catch (@Pc(148) RuntimeException local148) {
				this.aClass126_2 = null;
				if (this.aClass21_2.method561()) {
					this.aClass2_Sub8_Sub2_1 = null;
				} else {
					this.aClass2_Sub8_Sub2_1 = this.aClass21_2.method564((byte) 0, this.anInt1853, 255, true);
				}
				return null;
			}
		} else {
			try {
				if (local47 == null) {
					throw new RuntimeException();
				}
				this.aClass126_2 = new Class126(local47, this.anInt1858);
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass21_2.method556();
				this.aClass126_2 = null;
				if (this.aClass21_2.method561()) {
					this.aClass2_Sub8_Sub2_1 = null;
				} else {
					this.aClass2_Sub8_Sub2_1 = this.aClass21_2.method564((byte) 0, this.anInt1853, 255, true);
				}
				return null;
			}
			if (this.aClass108_1 != null) {
				this.aClass80_2.method2002(local47, this.aClass108_1, this.anInt1853);
			}
		}
		if (this.aClass108_2 != null) {
			this.anInt1850 = 0;
			this.aByteArray11 = new byte[this.aClass126_2.anInt4267];
		}
		this.aClass2_Sub8_Sub2_1 = null;
		return this.aClass126_2;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	public void method1417() {
		if (this.aClass44_6 == null || this.method1406() == null) {
			return;
		}
		for (@Pc(24) Class2 local24 = this.aClass44_7.method1352(); local24 != null; local24 = this.aClass44_7.method1360()) {
			@Pc(31) int local31 = (int) local24.aLong214;
			if (local31 < 0 || this.aClass126_2.anInt4267 <= local31 || this.aClass126_2.anIntArray419[local31] == 0) {
				local24.method4743();
			} else {
				if (this.aByteArray11[local31] == 0) {
					this.method1412(1, local31);
				}
				if (this.aByteArray11[local31] == -1) {
					this.method1412(2, local31);
				}
				if (this.aByteArray11[local31] == 1) {
					local24.method4743();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I")
	public int method1418() {
		if (this.method1406() == null) {
			return this.aClass2_Sub8_Sub2_1 == null ? 0 : this.aClass2_Sub8_Sub2_1.method3255();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)I")
	@Override
	public int method1408(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub8_Sub2 local16 = (Class2_Sub8_Sub2) this.aClass101_3.method2867((long) arg0);
		return local16 == null ? 0 : local16.method3255();
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)I")
	public int method1419() {
		return this.anInt1850;
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)I")
	public int method1420() {
		return this.aClass126_2 == null ? 0 : this.aClass126_2.anInt4264;
	}
}
