import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "Lclient!ofa;")
	private Class231 aClass231_1;

	@OriginalMember(owner = "client!cm", name = "G", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!cm", name = "L", descriptor = "Z")
	private boolean aBoolean99;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
	private int anInt1269 = 0;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Lclient!oj;")
	private final Class234 aClass234_5 = new Class234(16);

	@OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
	private int anInt1281 = 0;

	@OriginalMember(owner = "client!cm", name = "I", descriptor = "Lclient!su;")
	private final Class298 aClass298_27 = new Class298();

	@OriginalMember(owner = "client!cm", name = "N", descriptor = "J")
	private long aLong23 = 0L;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "Lclient!fo;")
	private final Class109 aClass109_1;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
	private final int anInt1271;

	@OriginalMember(owner = "client!cm", name = "J", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "Lclient!su;")
	private Class298 aClass298_26;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
	private final int anInt1268;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "Lclient!lba;")
	private final Class180 aClass180_2;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
	private final int anInt1277;

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "Z")
	private final boolean aBoolean100;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Lclient!fo;")
	private final Class109 aClass109_2;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Lclient!np;")
	private final Class219 aClass219_2;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "Lclient!ed;")
	private Class6_Sub5_Sub3 aClass6_Sub5_Sub3_1;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(ILclient!fo;Lclient!fo;Lclient!lba;Lclient!np;I[BIZ)V")
	public Class58_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class180 arg3, @OriginalArg(4) Class219 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass109_1 = arg1;
		this.anInt1271 = arg0;
		if (this.aClass109_1 == null) {
			this.aBoolean98 = false;
		} else {
			this.aBoolean98 = true;
			this.aClass298_26 = new Class298();
		}
		this.anInt1268 = arg5;
		this.aClass180_2 = arg3;
		this.anInt1277 = arg7;
		this.aBoolean100 = arg8;
		this.aByteArray8 = arg6;
		this.aClass109_2 = arg2;
		this.aClass219_2 = arg4;
		if (this.aClass109_2 != null) {
			this.aClass6_Sub5_Sub3_1 = this.aClass219_2.method5323(this.aClass109_2, this.anInt1271);
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(BI)I")
	@Override
	public int method1064(@OriginalArg(1) int arg0) {
		@Pc(20) Class6_Sub5_Sub3 local20 = (Class6_Sub5_Sub3) this.aClass234_5.method5464((long) arg0);
		return local20 == null ? 0 : local20.method5769();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lclient!ofa;")
	@Override
	public Class231 method1060() {
		if (this.aClass231_1 != null) {
			return this.aClass231_1;
		}
		if (this.aClass6_Sub5_Sub3_1 == null) {
			if (this.aClass180_2.method4353()) {
				return null;
			}
			this.aClass6_Sub5_Sub3_1 = this.aClass180_2.method4354(this.anInt1271, true, 255, (byte) 0);
		}
		if (this.aClass6_Sub5_Sub3_1.aBoolean492) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass6_Sub5_Sub3_1.method5767();
		if (this.aClass6_Sub5_Sub3_1 instanceof Class6_Sub5_Sub3_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass231_1 = new Class231(local43, this.anInt1268, this.aByteArray8);
				if (this.aClass231_1.anInt6725 != this.anInt1277) {
					throw new RuntimeException();
				}
			} catch (@Pc(141) RuntimeException local141) {
				this.aClass231_1 = null;
				if (this.aClass180_2.method4353()) {
					this.aClass6_Sub5_Sub3_1 = null;
				} else {
					this.aClass6_Sub5_Sub3_1 = this.aClass180_2.method4354(this.anInt1271, true, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass231_1 = new Class231(local43, this.anInt1268, this.aByteArray8);
			} catch (@Pc(65) RuntimeException local65) {
				this.aClass180_2.method4351();
				this.aClass231_1 = null;
				if (this.aClass180_2.method4353()) {
					this.aClass6_Sub5_Sub3_1 = null;
				} else {
					this.aClass6_Sub5_Sub3_1 = this.aClass180_2.method4354(this.anInt1271, true, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass109_2 != null) {
				this.aClass219_2.method5318(this.anInt1271, this.aClass109_2, local43);
			}
		}
		if (this.aClass109_1 != null) {
			this.aByteArray9 = new byte[this.aClass231_1.anInt6727];
			this.anInt1269 = 0;
		}
		this.aClass6_Sub5_Sub3_1 = null;
		return this.aClass231_1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method1058(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub5_Sub3 local15 = this.method1073(arg0, 0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method5767();
			local15.method7948();
			return local23;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	public int method1068() {
		return this.anInt1269;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)I")
	public int method1069() {
		if (this.method1060() == null) {
			return this.aClass6_Sub5_Sub3_1 == null ? 0 : this.aClass6_Sub5_Sub3_1.method5769();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)I")
	public int method1070() {
		return this.aClass231_1 == null ? 0 : this.aClass231_1.anInt6730;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
	public void method1071() {
		if (this.aClass298_26 == null || this.method1060() == null) {
			return;
		}
		for (@Pc(19) Class6 local19 = this.aClass298_27.method6809(); local19 != null; local19 = this.aClass298_27.method6821()) {
			@Pc(27) int local27 = (int) local19.aLong245;
			if (local27 < 0 || local27 >= this.aClass231_1.anInt6727 || this.aClass231_1.anIntArray473[local27] == 0) {
				local19.method7948();
			} else {
				if (this.aByteArray9[local27] == 0) {
					this.method1073(local27, 1);
				}
				if (this.aByteArray9[local27] == -1) {
					this.method1073(local27, 2);
				}
				if (this.aByteArray9[local27] == 1) {
					local19.method7948();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
	public void method1072() {
		if (this.aClass298_26 != null) {
			if (this.method1060() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class6 local26;
			@Pc(32) int local32;
			@Pc(123) Class6 local123;
			if (this.aBoolean98) {
				local21 = true;
				for (local26 = this.aClass298_26.method6809(); local26 != null; local26 = this.aClass298_26.method6821()) {
					local32 = (int) local26.aLong245;
					if (this.aByteArray9[local32] == 0) {
						this.method1073(local32, 1);
					}
					if (this.aByteArray9[local32] == 0) {
						local21 = false;
					} else {
						local26.method7948();
					}
				}
				while (this.aClass231_1.anIntArray473.length > this.anInt1281) {
					if (this.aClass231_1.anIntArray473[this.anInt1281] == 0) {
						this.anInt1281++;
					} else {
						if (this.aClass219_2.anInt6591 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray9[this.anInt1281] == 0) {
							this.method1073(this.anInt1281, 1);
						}
						if (this.aByteArray9[this.anInt1281] == 0) {
							local123 = new Class6();
							local123.aLong245 = this.anInt1281;
							local21 = false;
							this.aClass298_26.method6812(local123);
						}
						this.anInt1281++;
					}
				}
				if (local21) {
					this.anInt1281 = 0;
					this.aBoolean98 = false;
				}
			} else if (this.aBoolean99) {
				local21 = true;
				for (local26 = this.aClass298_26.method6809(); local26 != null; local26 = this.aClass298_26.method6821()) {
					local32 = (int) local26.aLong245;
					if (this.aByteArray9[local32] != 1) {
						this.method1073(local32, 2);
					}
					if (this.aByteArray9[local32] == 1) {
						local26.method7948();
					} else {
						local21 = false;
					}
				}
				while (this.anInt1281 < this.aClass231_1.anIntArray473.length) {
					if (this.aClass231_1.anIntArray473[this.anInt1281] == 0) {
						this.anInt1281++;
					} else {
						if (this.aClass180_2.method4344()) {
							local21 = false;
							break;
						}
						if (this.aByteArray9[this.anInt1281] != 1) {
							this.method1073(this.anInt1281, 2);
						}
						if (this.aByteArray9[this.anInt1281] != 1) {
							local123 = new Class6();
							local123.aLong245 = this.anInt1281;
							local21 = false;
							this.aClass298_26.method6812(local123);
						}
						this.anInt1281++;
					}
				}
				if (local21) {
					this.aBoolean99 = false;
					this.anInt1281 = 0;
				}
			} else {
				this.aClass298_26 = null;
			}
		}
		if (!this.aBoolean100 || this.aLong23 > Static416.method5922()) {
			return;
		}
		for (@Pc(330) Class6_Sub5_Sub3 local330 = (Class6_Sub5_Sub3) this.aClass234_5.method5469(); local330 != null; local330 = (Class6_Sub5_Sub3) this.aClass234_5.method5465()) {
			if (!local330.aBoolean492) {
				if (local330.aBoolean494) {
					if (!local330.aBoolean493) {
						throw new RuntimeException();
					}
					local330.method7948();
				} else {
					local330.aBoolean494 = true;
				}
			}
		}
		this.aLong23 = Static416.method5922() + 1000L;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BII)Lclient!ed;")
	private Class6_Sub5_Sub3 method1073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub5_Sub3 local13 = (Class6_Sub5_Sub3) this.aClass234_5.method5464((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean493 && local13.aBoolean492) {
			local13.method7948();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass109_1 == null || this.aByteArray9[arg0] == -1) {
					if (this.aClass180_2.method4353()) {
						return null;
					}
					local13 = this.aClass180_2.method4354(arg0, true, this.anInt1271, (byte) 2);
				} else {
					local13 = this.aClass219_2.method5323(this.aClass109_1, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass109_1 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass219_2.method5321(arg0, this.aClass109_1);
			} else if (arg1 == 2) {
				if (this.aClass109_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray9[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass180_2.method4344()) {
					return null;
				}
				local13 = this.aClass180_2.method4354(arg0, false, this.anInt1271, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass234_5.method5466((long) arg0, local13);
		}
		if (local13.aBoolean492) {
			return null;
		}
		@Pc(157) byte[] local157 = local13.method5767();
		@Pc(186) int local186;
		@Pc(213) byte[] local213;
		@Pc(222) byte[] local222;
		@Pc(224) int local224;
		@Pc(334) Class6_Sub5_Sub3_Sub2 local334;
		if (!(local13 instanceof Class6_Sub5_Sub3_Sub1)) {
			try {
				label157: {
					if (local157 != null && local157.length > 2) {
						Static102.aCRC32_1.reset();
						Static102.aCRC32_1.update(local157, 0, local157.length - 2);
						local186 = (int) Static102.aCRC32_1.getValue();
						if (this.aClass231_1.anIntArray472[arg0] != local186) {
							throw new RuntimeException();
						}
						if (this.aClass231_1.aByteArrayArray18 == null || this.aClass231_1.aByteArrayArray18[arg0] == null) {
							break label157;
						}
						local213 = this.aClass231_1.aByteArrayArray18[arg0];
						local222 = Static557.method7739(local157.length - 2, local157, 0);
						local224 = 0;
						while (true) {
							if (local224 >= 64) {
								break label157;
							}
							if (local222[local224] != local213[local224]) {
								throw new RuntimeException();
							}
							local224++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass180_2.anInt5272 = 0;
				this.aClass180_2.anInt5273 = 0;
			} catch (@Pc(440) RuntimeException local440) {
				this.aClass180_2.method4351();
				local13.method7948();
				if (local13.aBoolean493 && !this.aClass180_2.method4353()) {
					local334 = this.aClass180_2.method4354(arg0, true, this.anInt1271, (byte) 2);
					this.aClass234_5.method5466((long) arg0, local334);
				}
				return null;
			}
			local157[local157.length - 2] = (byte) (this.aClass231_1.anIntArray476[arg0] >>> 8);
			local157[local157.length - 1] = (byte) this.aClass231_1.anIntArray476[arg0];
			if (this.aClass109_1 != null) {
				this.aClass219_2.method5318(arg0, this.aClass109_1, local157);
				if (this.aByteArray9[arg0] != 1) {
					this.anInt1269++;
					this.aByteArray9[arg0] = 1;
				}
			}
			if (!local13.aBoolean493) {
				local13.method7948();
			}
			return local13;
		}
		try {
			if (local157 == null || local157.length <= 2) {
				throw new RuntimeException();
			}
			Static102.aCRC32_1.reset();
			Static102.aCRC32_1.update(local157, 0, local157.length - 2);
			local186 = (int) Static102.aCRC32_1.getValue();
			if (local186 != this.aClass231_1.anIntArray472[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass231_1.aByteArrayArray18 != null && this.aClass231_1.aByteArrayArray18[arg0] != null) {
				local213 = this.aClass231_1.aByteArrayArray18[arg0];
				local222 = Static557.method7739(local157.length - 2, local157, 0);
				for (local224 = 0; local224 < 64; local224++) {
					if (local213[local224] != local222[local224]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(265) int local265 = (local157[local157.length - 1] & 0xFF) + ((local157[local157.length - 2] & 0xFF) << 8);
			if (local265 != (this.aClass231_1.anIntArray476[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray9[arg0] != 1) {
				this.anInt1269++;
				this.aByteArray9[arg0] = 1;
			}
			if (!local13.aBoolean493) {
				local13.method7948();
			}
			return local13;
		} catch (@Pc(308) Exception local308) {
			this.aByteArray9[arg0] = -1;
			local13.method7948();
			if (local13.aBoolean493 && !this.aClass180_2.method4353()) {
				local334 = this.aClass180_2.method4354(arg0, true, this.anInt1271, (byte) 2);
				this.aClass234_5.method5466((long) arg0, local334);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V")
	@Override
	public void method1065(@OriginalArg(0) int arg0) {
		if (this.aClass109_1 == null) {
			return;
		}
		for (@Pc(14) Class6 local14 = this.aClass298_27.method6809(); local14 != null; local14 = this.aClass298_27.method6821()) {
			if ((long) arg0 == local14.aLong245) {
				return;
			}
		}
		@Pc(34) Class6 local34 = new Class6();
		local34.aLong245 = arg0;
		this.aClass298_27.method6812(local34);
	}

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)I")
	public int method1074() {
		if (this.aClass231_1 == null) {
			return 0;
		} else if (this.aBoolean98) {
			@Pc(28) Class6 local28 = this.aClass298_26.method6809();
			return local28 == null ? 0 : (int) local28.aLong245;
		} else {
			return this.aClass231_1.anInt6730;
		}
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(Z)V")
	public void method1075() {
		if (this.aClass109_1 != null) {
			this.aBoolean99 = true;
			if (this.aClass298_26 == null) {
				this.aClass298_26 = new Class298();
			}
		}
	}
}
