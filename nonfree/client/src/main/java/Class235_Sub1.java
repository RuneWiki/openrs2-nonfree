import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class235_Sub1 extends Class235 {

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!wh;")
	private Class317 aClass317_2;

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "Z")
	private boolean aBoolean509;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	private int anInt6901 = 0;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!pt;")
	private final Class230 aClass230_41 = new Class230(16);

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
	private int anInt6906 = 0;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Lclient!ui;")
	private final Class295 aClass295_41 = new Class295();

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "J")
	private long aLong197 = 0L;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	private final int anInt6897;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "Lclient!es;")
	private final Class90 aClass90_5;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "Lclient!ui;")
	private Class295 aClass295_40;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!bj;")
	private final Class30 aClass30_3;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "[B")
	private final byte[] aByteArray96;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "Lclient!gq;")
	private final Class117 aClass117_4;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "Z")
	private final boolean aBoolean511;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	private final int anInt6894;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!es;")
	private final Class90 aClass90_4;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
	private final int anInt6902;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!rda;")
	private Class1_Sub2_Sub6 aClass1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILclient!es;Lclient!es;Lclient!gq;Lclient!bj;I[BIZ)V")
	public Class235_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) Class30 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt6897 = arg0;
		this.aClass90_5 = arg1;
		if (this.aClass90_5 == null) {
			this.aBoolean510 = false;
		} else {
			this.aBoolean510 = true;
			this.aClass295_40 = new Class295();
		}
		this.aClass30_3 = arg4;
		this.aByteArray96 = arg6;
		this.aClass117_4 = arg3;
		this.aBoolean511 = arg8;
		this.anInt6894 = arg7;
		this.aClass90_4 = arg2;
		this.anInt6902 = arg5;
		if (this.aClass90_4 != null) {
			this.aClass1_Sub2_Sub6_1 = this.aClass30_3.method1114(this.anInt6897, this.aClass90_4);
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
	public int method6223() {
		return this.anInt6901;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)I")
	public int method6224() {
		if (this.aClass317_2 == null) {
			return 0;
		} else if (this.aBoolean510) {
			@Pc(25) Class1 local25 = this.aClass295_40.method7543();
			return local25 == null ? 0 : (int) local25.aLong251;
		} else {
			return this.aClass317_2.anInt9415;
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
	public int method6225() {
		return this.aClass317_2 == null ? 0 : this.aClass317_2.anInt9415;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
	@Override
	public int method6217(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub2_Sub6 local16 = (Class1_Sub2_Sub6) this.aClass230_41.method6144((long) arg0);
		return local16 == null ? 0 : local16.method6033();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	@Override
	public void method6215(@OriginalArg(0) int arg0) {
		if (this.aClass90_5 == null) {
			return;
		}
		for (@Pc(20) Class1 local20 = this.aClass295_41.method7543(); local20 != null; local20 = this.aClass295_41.method7540()) {
			if (local20.aLong251 == (long) arg0) {
				return;
			}
		}
		@Pc(44) Class1 local44 = new Class1();
		local44.aLong251 = arg0;
		this.aClass295_41.method7533(local44);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public void method6226() {
		if (this.aClass295_40 == null || this.method6221() == null) {
			return;
		}
		for (@Pc(25) Class1 local25 = this.aClass295_41.method7543(); local25 != null; local25 = this.aClass295_41.method7540()) {
			@Pc(31) int local31 = (int) local25.aLong251;
			if (local31 < 0 || this.aClass317_2.anInt9413 <= local31 || this.aClass317_2.anIntArray826[local31] == 0) {
				local25.method8239();
			} else {
				if (this.aByteArray95[local31] == 0) {
					this.method6231(1, local31);
				}
				if (this.aByteArray95[local31] == -1) {
					this.method6231(2, local31);
				}
				if (this.aByteArray95[local31] == 1) {
					local25.method8239();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
	public void method6227() {
		if (this.aClass90_5 != null) {
			this.aBoolean509 = true;
			if (this.aClass295_40 == null) {
				this.aClass295_40 = new Class295();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lclient!wh;")
	@Override
	public Class317 method6221() {
		if (this.aClass317_2 != null) {
			return this.aClass317_2;
		}
		if (this.aClass1_Sub2_Sub6_1 == null) {
			if (this.aClass117_4.method2925()) {
				return null;
			}
			this.aClass1_Sub2_Sub6_1 = this.aClass117_4.method2921((byte) 0, this.anInt6897, 255, true);
		}
		if (this.aClass1_Sub2_Sub6_1.aBoolean497) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass1_Sub2_Sub6_1.method6032();
		if (this.aClass1_Sub2_Sub6_1 instanceof Class1_Sub2_Sub6_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass317_2 = new Class317(local48, this.anInt6902, this.aByteArray96);
				if (this.aClass317_2.anInt9411 != this.anInt6894) {
					throw new RuntimeException();
				}
			} catch (@Pc(144) RuntimeException local144) {
				this.aClass317_2 = null;
				if (this.aClass117_4.method2925()) {
					this.aClass1_Sub2_Sub6_1 = null;
				} else {
					this.aClass1_Sub2_Sub6_1 = this.aClass117_4.method2921((byte) 0, this.anInt6897, 255, true);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass317_2 = new Class317(local48, this.anInt6902, this.aByteArray96);
			} catch (@Pc(70) RuntimeException local70) {
				this.aClass117_4.method2923();
				this.aClass317_2 = null;
				if (this.aClass117_4.method2925()) {
					this.aClass1_Sub2_Sub6_1 = null;
				} else {
					this.aClass1_Sub2_Sub6_1 = this.aClass117_4.method2921((byte) 0, this.anInt6897, 255, true);
				}
				return null;
			}
			if (this.aClass90_4 != null) {
				this.aClass30_3.method1117(local48, this.aClass90_4, this.anInt6897);
			}
		}
		if (this.aClass90_5 != null) {
			this.anInt6901 = 0;
			this.aByteArray95 = new byte[this.aClass317_2.anInt9413];
		}
		this.aClass1_Sub2_Sub6_1 = null;
		return this.aClass317_2;
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)I")
	public int method6229() {
		if (this.method6221() == null) {
			return this.aClass1_Sub2_Sub6_1 == null ? 0 : this.aClass1_Sub2_Sub6_1.method6033();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBI)Lclient!rda;")
	private Class1_Sub2_Sub6 method6231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub6 local13 = (Class1_Sub2_Sub6) this.aClass230_41.method6144((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean496 && local13.aBoolean497) {
			local13.method8239();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass90_5 == null || this.aByteArray95[arg1] == -1) {
					if (this.aClass117_4.method2925()) {
						return null;
					}
					local13 = this.aClass117_4.method2921((byte) 2, arg1, this.anInt6897, true);
				} else {
					local13 = this.aClass30_3.method1114(arg1, this.aClass90_5);
				}
			} else if (arg0 == 1) {
				if (this.aClass90_5 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass30_3.method1116(arg1, this.aClass90_5);
			} else if (arg0 == 2) {
				if (this.aClass90_5 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray95[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass117_4.method2931()) {
					return null;
				}
				local13 = this.aClass117_4.method2921((byte) 2, arg1, this.anInt6897, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass230_41.method6139((long) arg1, local13);
		}
		if (local13.aBoolean497) {
			return null;
		}
		@Pc(152) byte[] local152 = local13.method6032();
		@Pc(187) int local187;
		@Pc(214) byte[] local214;
		@Pc(223) byte[] local223;
		@Pc(225) int local225;
		@Pc(283) Class1_Sub2_Sub6_Sub2 local283;
		if (!(local13 instanceof Class1_Sub2_Sub6_Sub1)) {
			try {
				if (local152 == null || local152.length <= 2) {
					throw new RuntimeException();
				}
				Static118.aCRC32_1.reset();
				Static118.aCRC32_1.update(local152, 0, local152.length - 2);
				local187 = (int) Static118.aCRC32_1.getValue();
				if (local187 != this.aClass317_2.anIntArray827[arg1]) {
					throw new RuntimeException();
				}
				if (this.aClass317_2.aByteArrayArray29 != null && this.aClass317_2.aByteArrayArray29[arg1] != null) {
					local214 = this.aClass317_2.aByteArrayArray29[arg1];
					local223 = Static271.method4826(0, local152.length - 2, local152);
					for (local225 = 0; local225 < 64; local225++) {
						if (local223[local225] != local214[local225]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass117_4.anInt3160 = 0;
				this.aClass117_4.anInt3159 = 0;
			} catch (@Pc(258) RuntimeException local258) {
				this.aClass117_4.method2923();
				local13.method8239();
				if (local13.aBoolean496 && !this.aClass117_4.method2925()) {
					local283 = this.aClass117_4.method2921((byte) 2, arg1, this.anInt6897, true);
					this.aClass230_41.method6139((long) arg1, local283);
				}
				return null;
			}
			local152[local152.length - 2] = (byte) (this.aClass317_2.anIntArray828[arg1] >>> 8);
			local152[local152.length - 1] = (byte) this.aClass317_2.anIntArray828[arg1];
			if (this.aClass90_5 != null) {
				this.aClass30_3.method1117(local152, this.aClass90_5, arg1);
				if (this.aByteArray95[arg1] != 1) {
					this.anInt6901++;
					this.aByteArray95[arg1] = 1;
				}
			}
			if (!local13.aBoolean496) {
				local13.method8239();
			}
			return local13;
		}
		try {
			if (local152 == null || local152.length <= 2) {
				throw new RuntimeException();
			}
			Static118.aCRC32_1.reset();
			Static118.aCRC32_1.update(local152, 0, local152.length - 2);
			local187 = (int) Static118.aCRC32_1.getValue();
			if (this.aClass317_2.anIntArray827[arg1] != local187) {
				throw new RuntimeException();
			}
			if (this.aClass317_2.aByteArrayArray29 != null && this.aClass317_2.aByteArrayArray29[arg1] != null) {
				local214 = this.aClass317_2.aByteArrayArray29[arg1];
				local223 = Static271.method4826(0, local152.length - 2, local152);
				for (local225 = 0; local225 < 64; local225++) {
					if (local223[local225] != local214[local225]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(460) int local460 = (local152[local152.length - 1] & 0xFF) + ((local152[local152.length - 2] & 0xFF) << 8);
			if ((this.aClass317_2.anIntArray828[arg1] & 0xFFFF) != local460) {
				throw new RuntimeException();
			}
			if (this.aByteArray95[arg1] != 1) {
				this.anInt6901++;
				this.aByteArray95[arg1] = 1;
			}
			if (!local13.aBoolean496) {
				local13.method8239();
			}
			return local13;
		} catch (@Pc(505) Exception local505) {
			this.aByteArray95[arg1] = -1;
			local13.method8239();
			if (local13.aBoolean496 && !this.aClass117_4.method2925()) {
				local283 = this.aClass117_4.method2921((byte) 2, arg1, this.anInt6897, true);
				this.aClass230_41.method6139((long) arg1, local283);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V")
	public void method6232() {
		if (this.aClass295_40 != null) {
			if (this.method6221() == null) {
				return;
			}
			@Pc(32) boolean local32;
			@Pc(37) Class1 local37;
			@Pc(43) int local43;
			@Pc(131) Class1 local131;
			if (this.aBoolean510) {
				local32 = true;
				for (local37 = this.aClass295_40.method7543(); local37 != null; local37 = this.aClass295_40.method7540()) {
					local43 = (int) local37.aLong251;
					if (this.aByteArray95[local43] == 0) {
						this.method6231(1, local43);
					}
					if (this.aByteArray95[local43] == 0) {
						local32 = false;
					} else {
						local37.method8239();
					}
				}
				while (this.aClass317_2.anIntArray826.length > this.anInt6906) {
					if (this.aClass317_2.anIntArray826[this.anInt6906] == 0) {
						this.anInt6906++;
					} else {
						if (this.aClass30_3.anInt1104 >= 250) {
							local32 = false;
							break;
						}
						if (this.aByteArray95[this.anInt6906] == 0) {
							this.method6231(1, this.anInt6906);
						}
						if (this.aByteArray95[this.anInt6906] == 0) {
							local131 = new Class1();
							local131.aLong251 = this.anInt6906;
							this.aClass295_40.method7533(local131);
							local32 = false;
						}
						this.anInt6906++;
					}
				}
				if (local32) {
					this.aBoolean510 = false;
					this.anInt6906 = 0;
				}
			} else if (this.aBoolean509) {
				local32 = true;
				for (local37 = this.aClass295_40.method7543(); local37 != null; local37 = this.aClass295_40.method7540()) {
					local43 = (int) local37.aLong251;
					if (this.aByteArray95[local43] != 1) {
						this.method6231(2, local43);
					}
					if (this.aByteArray95[local43] == 1) {
						local37.method8239();
					} else {
						local32 = false;
					}
				}
				while (this.anInt6906 < this.aClass317_2.anIntArray826.length) {
					if (this.aClass317_2.anIntArray826[this.anInt6906] == 0) {
						this.anInt6906++;
					} else {
						if (this.aClass117_4.method2931()) {
							local32 = false;
							break;
						}
						if (this.aByteArray95[this.anInt6906] != 1) {
							this.method6231(2, this.anInt6906);
						}
						if (this.aByteArray95[this.anInt6906] != 1) {
							local131 = new Class1();
							local131.aLong251 = this.anInt6906;
							this.aClass295_40.method7533(local131);
							local32 = false;
						}
						this.anInt6906++;
					}
				}
				if (local32) {
					this.anInt6906 = 0;
					this.aBoolean509 = false;
				}
			} else {
				this.aClass295_40 = null;
			}
		}
		if (!this.aBoolean511 || this.aLong197 > Static110.method2222()) {
			return;
		}
		for (@Pc(328) Class1_Sub2_Sub6 local328 = (Class1_Sub2_Sub6) this.aClass230_41.method6137(); local328 != null; local328 = (Class1_Sub2_Sub6) this.aClass230_41.method6140()) {
			if (!local328.aBoolean497) {
				if (local328.aBoolean498) {
					if (!local328.aBoolean496) {
						throw new RuntimeException();
					}
					local328.method8239();
				} else {
					local328.aBoolean498 = true;
				}
			}
		}
		this.aLong197 = Static110.method2222() + 1000L;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method6218(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub2_Sub6 local15 = this.method6231(0, arg0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method6032();
			local15.method8239();
			return local23;
		}
	}
}
