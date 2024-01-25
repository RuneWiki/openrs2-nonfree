import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!aca;")
	private Class5 aClass5_2;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "Z")
	private boolean aBoolean546;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
	private int anInt7774 = 0;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "Lclient!hd;")
	private final Class128 aClass128_37 = new Class128(16);

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
	private int anInt7783 = 0;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "Lclient!ws;")
	private final Class361 aClass361_57 = new Class361();

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "J")
	private long aLong211 = 0L;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "Lclient!kf;")
	private final Class172 aClass172_4;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
	private final int anInt7778;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "Z")
	private boolean aBoolean547;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "Lclient!ws;")
	private Class361 aClass361_56;

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Z")
	private final boolean aBoolean548;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient!cs;")
	private final Class55 aClass55_3;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
	private final int anInt7776;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "Lclient!jt;")
	private final Class163 aClass163_2;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "[B")
	private final byte[] aByteArray97;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!kf;")
	private final Class172 aClass172_3;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	private final int anInt7766;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!ci;")
	private Class6_Sub2_Sub4 aClass6_Sub2_Sub4_1;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILclient!kf;Lclient!kf;Lclient!jt;Lclient!cs;I[BIZ)V")
	public Class160_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) Class55 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass172_4 = arg1;
		this.anInt7778 = arg0;
		if (this.aClass172_4 == null) {
			this.aBoolean547 = false;
		} else {
			this.aBoolean547 = true;
			this.aClass361_56 = new Class361();
		}
		this.aBoolean548 = arg8;
		this.aClass55_3 = arg4;
		this.anInt7776 = arg5;
		this.aClass163_2 = arg3;
		this.aByteArray97 = arg6;
		this.aClass172_3 = arg2;
		this.anInt7766 = arg7;
		if (this.aClass172_3 != null) {
			this.aClass6_Sub2_Sub4_1 = this.aClass55_3.method1441(this.aClass172_3, this.anInt7778);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I")
	@Override
	public int method6352(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub2_Sub4 local11 = (Class6_Sub2_Sub4) this.aClass128_37.method3263((long) arg0);
		return local11 == null ? 0 : local11.method4909();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class5 method6354() {
		if (this.aClass5_2 != null) {
			return this.aClass5_2;
		}
		if (this.aClass6_Sub2_Sub4_1 == null) {
			if (this.aClass163_2.method4209()) {
				return null;
			}
			this.aClass6_Sub2_Sub4_1 = this.aClass163_2.method4208((byte) 0, true, this.anInt7778, 255);
		}
		if (this.aClass6_Sub2_Sub4_1.aBoolean400) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass6_Sub2_Sub4_1.method4908();
		if (this.aClass6_Sub2_Sub4_1 instanceof Class6_Sub2_Sub4_Sub1) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass5_2 = new Class5(local51, this.anInt7776, this.aByteArray97);
				if (this.anInt7766 != this.aClass5_2.anInt241) {
					throw new RuntimeException();
				}
			} catch (@Pc(149) RuntimeException local149) {
				this.aClass5_2 = null;
				if (this.aClass163_2.method4209()) {
					this.aClass6_Sub2_Sub4_1 = null;
				} else {
					this.aClass6_Sub2_Sub4_1 = this.aClass163_2.method4208((byte) 0, true, this.anInt7778, 255);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass5_2 = new Class5(local51, this.anInt7776, this.aByteArray97);
			} catch (@Pc(73) RuntimeException local73) {
				this.aClass163_2.method4219();
				this.aClass5_2 = null;
				if (this.aClass163_2.method4209()) {
					this.aClass6_Sub2_Sub4_1 = null;
				} else {
					this.aClass6_Sub2_Sub4_1 = this.aClass163_2.method4208((byte) 0, true, this.anInt7778, 255);
				}
				return null;
			}
			if (this.aClass172_3 != null) {
				this.aClass55_3.method1439(this.aClass172_3, this.anInt7778, local51);
			}
		}
		this.aClass6_Sub2_Sub4_1 = null;
		if (this.aClass172_4 != null) {
			this.aByteArray96 = new byte[this.aClass5_2.anInt242];
			this.anInt7774 = 0;
		}
		return this.aClass5_2;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method6357(@OriginalArg(0) int arg0) {
		@Pc(9) Class6_Sub2_Sub4 local9 = this.method6360(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method4908();
			local9.method7804();
			return local17;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	public void method6359() {
		if (this.aClass361_56 == null || this.method6354() == null) {
			return;
		}
		for (@Pc(25) Class6 local25 = this.aClass361_57.method7838(); local25 != null; local25 = this.aClass361_57.method7845()) {
			@Pc(31) int local31 = (int) local25.aLong263;
			if (local31 < 0 || this.aClass5_2.anInt242 <= local31 || this.aClass5_2.anIntArray21[local31] == 0) {
				local25.method7804();
			} else {
				if (this.aByteArray96[local31] == 0) {
					this.method6360(1, local31);
				}
				if (this.aByteArray96[local31] == -1) {
					this.method6360(2, local31);
				}
				if (this.aByteArray96[local31] == 1) {
					local25.method7804();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Lclient!ci;")
	private Class6_Sub2_Sub4 method6360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class6_Sub2_Sub4 local13 = (Class6_Sub2_Sub4) this.aClass128_37.method3263((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean398 && local13.aBoolean400) {
			local13.method7804();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass172_4 == null || this.aByteArray96[arg1] == -1) {
					if (this.aClass163_2.method4209()) {
						return null;
					}
					local13 = this.aClass163_2.method4208((byte) 2, true, arg1, this.anInt7778);
				} else {
					local13 = this.aClass55_3.method1441(this.aClass172_4, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass172_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass55_3.method1442(arg1, this.aClass172_4);
			} else if (arg0 == 2) {
				if (this.aClass172_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray96[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass163_2.method4215()) {
					return null;
				}
				local13 = this.aClass163_2.method4208((byte) 2, false, arg1, this.anInt7778);
			} else {
				throw new RuntimeException();
			}
			this.aClass128_37.method3267(local13, (long) arg1);
		}
		if (local13.aBoolean400) {
			return null;
		}
		@Pc(164) byte[] local164 = local13.method4908();
		@Pc(191) int local191;
		@Pc(218) byte[] local218;
		@Pc(227) byte[] local227;
		@Pc(229) int local229;
		@Pc(337) Class6_Sub2_Sub4_Sub2 local337;
		if (!(local13 instanceof Class6_Sub2_Sub4_Sub1)) {
			try {
				label157: {
					if (local164 != null && local164.length > 2) {
						Static109.aCRC32_1.reset();
						Static109.aCRC32_1.update(local164, 0, local164.length - 2);
						local191 = (int) Static109.aCRC32_1.getValue();
						if (this.aClass5_2.anIntArray19[arg1] != local191) {
							throw new RuntimeException();
						}
						if (this.aClass5_2.aByteArrayArray1 == null || this.aClass5_2.aByteArrayArray1[arg1] == null) {
							break label157;
						}
						local218 = this.aClass5_2.aByteArrayArray1[arg1];
						local227 = Static222.method3989(0, local164.length - 2, local164);
						local229 = 0;
						while (true) {
							if (local229 >= 64) {
								break label157;
							}
							if (local218[local229] != local227[local229]) {
								throw new RuntimeException();
							}
							local229++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass163_2.anInt4877 = 0;
				this.aClass163_2.anInt4878 = 0;
			} catch (@Pc(447) RuntimeException local447) {
				this.aClass163_2.method4219();
				local13.method7804();
				if (local13.aBoolean398 && !this.aClass163_2.method4209()) {
					local337 = this.aClass163_2.method4208((byte) 2, true, arg1, this.anInt7778);
					this.aClass128_37.method3267(local337, (long) arg1);
				}
				return null;
			}
			local164[local164.length - 2] = (byte) (this.aClass5_2.anIntArray20[arg1] >>> 8);
			local164[local164.length - 1] = (byte) this.aClass5_2.anIntArray20[arg1];
			if (this.aClass172_4 != null) {
				this.aClass55_3.method1439(this.aClass172_4, arg1, local164);
				if (this.aByteArray96[arg1] != 1) {
					this.anInt7774++;
					this.aByteArray96[arg1] = 1;
				}
			}
			if (!local13.aBoolean398) {
				local13.method7804();
			}
			return local13;
		}
		try {
			if (local164 == null || local164.length <= 2) {
				throw new RuntimeException();
			}
			Static109.aCRC32_1.reset();
			Static109.aCRC32_1.update(local164, 0, local164.length - 2);
			local191 = (int) Static109.aCRC32_1.getValue();
			if (local191 != this.aClass5_2.anIntArray19[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass5_2.aByteArrayArray1 != null && this.aClass5_2.aByteArrayArray1[arg1] != null) {
				local218 = this.aClass5_2.aByteArrayArray1[arg1];
				local227 = Static222.method3989(0, local164.length - 2, local164);
				for (local229 = 0; local229 < 64; local229++) {
					if (local218[local229] != local227[local229]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(270) int local270 = (local164[local164.length - 1] & 0xFF) + ((local164[local164.length - 2] & 0xFF) << 8);
			if ((this.aClass5_2.anIntArray20[arg1] & 0xFFFF) != local270) {
				throw new RuntimeException();
			}
			if (this.aByteArray96[arg1] != 1) {
				this.anInt7774++;
				this.aByteArray96[arg1] = 1;
			}
			if (!local13.aBoolean398) {
				local13.method7804();
			}
			return local13;
		} catch (@Pc(311) Exception local311) {
			this.aByteArray96[arg1] = -1;
			local13.method7804();
			if (local13.aBoolean398 && !this.aClass163_2.method4209()) {
				local337 = this.aClass163_2.method4208((byte) 2, true, arg1, this.anInt7778);
				this.aClass128_37.method3267(local337, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)I")
	public int method6361() {
		if (this.aClass5_2 == null) {
			return 0;
		} else if (this.aBoolean547) {
			@Pc(28) Class6 local28 = this.aClass361_56.method7838();
			return local28 == null ? 0 : (int) local28.aLong263;
		} else {
			return this.aClass5_2.anInt243;
		}
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)I")
	public int method6362() {
		return this.aClass5_2 == null ? 0 : this.aClass5_2.anInt243;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
	public int method6363() {
		return this.anInt7774;
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)I")
	public int method6364() {
		if (this.method6354() == null) {
			return this.aClass6_Sub2_Sub4_1 == null ? 0 : this.aClass6_Sub2_Sub4_1.method4909();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
	@Override
	public void method6353(@OriginalArg(1) int arg0) {
		if (this.aClass172_4 == null) {
			return;
		}
		for (@Pc(14) Class6 local14 = this.aClass361_57.method7838(); local14 != null; local14 = this.aClass361_57.method7845()) {
			if ((long) arg0 == local14.aLong263) {
				return;
			}
		}
		@Pc(46) Class6 local46 = new Class6();
		local46.aLong263 = arg0;
		this.aClass361_57.method7833(local46);
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
	public void method6365() {
		if (this.aClass172_4 != null) {
			this.aBoolean546 = true;
			if (this.aClass361_56 == null) {
				this.aClass361_56 = new Class361();
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public void method6366() {
		if (this.aClass361_56 != null) {
			if (this.method6354() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class6 local31;
			@Pc(37) int local37;
			@Pc(124) Class6 local124;
			if (this.aBoolean547) {
				local26 = true;
				for (local31 = this.aClass361_56.method7838(); local31 != null; local31 = this.aClass361_56.method7845()) {
					local37 = (int) local31.aLong263;
					if (this.aByteArray96[local37] == 0) {
						this.method6360(1, local37);
					}
					if (this.aByteArray96[local37] == 0) {
						local26 = false;
					} else {
						local31.method7804();
					}
				}
				while (this.aClass5_2.anIntArray21.length > this.anInt7783) {
					if (this.aClass5_2.anIntArray21[this.anInt7783] == 0) {
						this.anInt7783++;
					} else {
						if (this.aClass55_3.anInt1514 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray96[this.anInt7783] == 0) {
							this.method6360(1, this.anInt7783);
						}
						if (this.aByteArray96[this.anInt7783] == 0) {
							local124 = new Class6();
							local124.aLong263 = this.anInt7783;
							this.aClass361_56.method7833(local124);
							local26 = false;
						}
						this.anInt7783++;
					}
				}
				if (local26) {
					this.aBoolean547 = false;
					this.anInt7783 = 0;
				}
			} else if (this.aBoolean546) {
				local26 = true;
				for (local31 = this.aClass361_56.method7838(); local31 != null; local31 = this.aClass361_56.method7845()) {
					local37 = (int) local31.aLong263;
					if (this.aByteArray96[local37] != 1) {
						this.method6360(2, local37);
					}
					if (this.aByteArray96[local37] == 1) {
						local31.method7804();
					} else {
						local26 = false;
					}
				}
				while (this.anInt7783 < this.aClass5_2.anIntArray21.length) {
					if (this.aClass5_2.anIntArray21[this.anInt7783] == 0) {
						this.anInt7783++;
					} else {
						if (this.aClass163_2.method4215()) {
							local26 = false;
							break;
						}
						if (this.aByteArray96[this.anInt7783] != 1) {
							this.method6360(2, this.anInt7783);
						}
						if (this.aByteArray96[this.anInt7783] != 1) {
							local124 = new Class6();
							local124.aLong263 = this.anInt7783;
							local26 = false;
							this.aClass361_56.method7833(local124);
						}
						this.anInt7783++;
					}
				}
				if (local26) {
					this.aBoolean546 = false;
					this.anInt7783 = 0;
				}
			} else {
				this.aClass361_56 = null;
			}
		}
		if (!this.aBoolean548 || Static8.method201() < this.aLong211) {
			return;
		}
		for (@Pc(323) Class6_Sub2_Sub4 local323 = (Class6_Sub2_Sub4) this.aClass128_37.method3265(); local323 != null; local323 = (Class6_Sub2_Sub4) this.aClass128_37.method3273()) {
			if (!local323.aBoolean400) {
				if (local323.aBoolean399) {
					if (!local323.aBoolean398) {
						throw new RuntimeException();
					}
					local323.method7804();
				} else {
					local323.aBoolean399 = true;
				}
			}
		}
		this.aLong211 = Static8.method201() + 1000L;
	}
}
