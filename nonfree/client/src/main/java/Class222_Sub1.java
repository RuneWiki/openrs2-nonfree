import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class222_Sub1 extends Class222 {

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "Lclient!bm;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "Z")
	private boolean aBoolean515;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	private int anInt6233 = 0;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Lclient!wa;")
	private final Class257 aClass257_28 = new Class257(16);

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
	private int anInt6248 = 0;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "Lclient!vp;")
	private final Class254 aClass254_41 = new Class254();

	@OriginalMember(owner = "client!sl", name = "S", descriptor = "J")
	private long aLong191 = 0L;

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
	private final int anInt6247;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "Lclient!oc;")
	private final Class178 aClass178_3;

	@OriginalMember(owner = "client!sl", name = "O", descriptor = "Z")
	private boolean aBoolean514;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "Lclient!vp;")
	private Class254 aClass254_42;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
	private final int anInt6235;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
	private final int anInt6246;

	@OriginalMember(owner = "client!sl", name = "R", descriptor = "Z")
	private final boolean aBoolean516;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "Lclient!kf;")
	private final Class134 aClass134_3;

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "Lclient!oc;")
	private final Class178 aClass178_4;

	@OriginalMember(owner = "client!sl", name = "H", descriptor = "Lclient!bd;")
	private final Class19 aClass19_3;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "Lclient!ag;")
	private Class1_Sub3_Sub2 aClass1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(ILclient!oc;Lclient!oc;Lclient!bd;Lclient!kf;IIZ)V")
	public Class222_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) Class134 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6247 = arg0;
		this.aClass178_3 = arg1;
		if (this.aClass178_3 == null) {
			this.aBoolean514 = false;
		} else {
			this.aBoolean514 = true;
			this.aClass254_42 = new Class254();
		}
		this.anInt6235 = arg5;
		this.anInt6246 = arg6;
		this.aBoolean516 = arg7;
		this.aClass134_3 = arg4;
		this.aClass178_4 = arg2;
		this.aClass19_3 = arg3;
		if (this.aClass178_4 != null) {
			this.aClass1_Sub3_Sub2_1 = this.aClass134_3.method2785(this.anInt6247, this.aClass178_4);
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V")
	public void method4787() {
		if (this.aClass254_42 == null || this.method4780() == null) {
			return;
		}
		for (@Pc(25) Class1 local25 = this.aClass254_41.method5437(); local25 != null; local25 = this.aClass254_41.method5433()) {
			@Pc(31) int local31 = (int) local25.aLong226;
			if (local31 < 0 || local31 >= this.aClass25_2.anInt623 || this.aClass25_2.anIntArray37[local31] == 0) {
				local25.method5617();
			} else {
				if (this.aByteArray73[local31] == 0) {
					this.method4788(1, local31);
				}
				if (this.aByteArray73[local31] == -1) {
					this.method4788(2, local31);
				}
				if (this.aByteArray73[local31] == 1) {
					local25.method5617();
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)V")
	@Override
	public void method4783(@OriginalArg(0) int arg0) {
		if (this.aClass178_3 == null) {
			return;
		}
		for (@Pc(18) Class1 local18 = this.aClass254_41.method5437(); local18 != null; local18 = this.aClass254_41.method5433()) {
			if (local18.aLong226 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class1 local38 = new Class1();
		local38.aLong226 = arg0;
		this.aClass254_41.method5430(local38);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)Lclient!ag;")
	private Class1_Sub3_Sub2 method4788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub3_Sub2 local13 = (Class1_Sub3_Sub2) this.aClass257_28.method5503((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean525 && local13.aBoolean524) {
			local13.method5617();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass178_3 == null || this.aByteArray73[arg1] == -1) {
					if (this.aClass19_3.method401()) {
						return null;
					}
					local13 = this.aClass19_3.method409((byte) 2, true, this.anInt6247, arg1);
				} else {
					local13 = this.aClass134_3.method2785(arg1, this.aClass178_3);
				}
			} else if (arg0 == 1) {
				if (this.aClass178_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass134_3.method2783(this.aClass178_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass178_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray73[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass19_3.method412()) {
					return null;
				}
				local13 = this.aClass19_3.method409((byte) 2, false, this.anInt6247, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass257_28.method5504(local13, (long) arg1);
		}
		if (local13.aBoolean524) {
			return null;
		}
		@Pc(159) byte[] local159 = local13.method4906();
		@Pc(188) int local188;
		@Pc(294) Class1_Sub3_Sub2_Sub2 local294;
		if (!(local13 instanceof Class1_Sub3_Sub2_Sub1)) {
			try {
				if (local159 == null || local159.length <= 2) {
					throw new RuntimeException();
				}
				Static66.aCRC32_1.reset();
				Static66.aCRC32_1.update(local159, 0, local159.length - 2);
				local188 = (int) Static66.aCRC32_1.getValue();
				if (local188 != this.aClass25_2.anIntArray35[arg1]) {
					throw new RuntimeException();
				}
				this.aClass19_3.anInt473 = 0;
				this.aClass19_3.anInt472 = 0;
			} catch (@Pc(354) RuntimeException local354) {
				this.aClass19_3.method399();
				local13.method5617();
				if (local13.aBoolean525 && !this.aClass19_3.method401()) {
					local294 = this.aClass19_3.method409((byte) 2, true, this.anInt6247, arg1);
					this.aClass257_28.method5504(local294, (long) arg1);
				}
				return null;
			}
			local159[local159.length - 2] = (byte) (this.aClass25_2.anIntArray33[arg1] >>> 8);
			local159[local159.length - 1] = (byte) this.aClass25_2.anIntArray33[arg1];
			if (this.aClass178_3 != null) {
				this.aClass134_3.method2788(arg1, local159, this.aClass178_3);
				if (this.aByteArray73[arg1] != 1) {
					this.anInt6233++;
					this.aByteArray73[arg1] = 1;
				}
			}
			if (!local13.aBoolean525) {
				local13.method5617();
			}
			return local13;
		}
		try {
			if (local159 == null || local159.length <= 2) {
				throw new RuntimeException();
			}
			Static66.aCRC32_1.reset();
			Static66.aCRC32_1.update(local159, 0, local159.length - 2);
			local188 = (int) Static66.aCRC32_1.getValue();
			if (local188 != this.aClass25_2.anIntArray35[arg1]) {
				throw new RuntimeException();
			}
			@Pc(223) int local223 = (local159[local159.length - 1] & 0xFF) + ((local159[local159.length - 2] & 0xFF) << 8);
			if ((this.aClass25_2.anIntArray33[arg1] & 0xFFFF) != local223) {
				throw new RuntimeException();
			}
			if (this.aByteArray73[arg1] != 1) {
				this.anInt6233++;
				this.aByteArray73[arg1] = 1;
			}
			if (!local13.aBoolean525) {
				local13.method5617();
			}
			return local13;
		} catch (@Pc(268) Exception local268) {
			this.aByteArray73[arg1] = -1;
			local13.method5617();
			if (local13.aBoolean525 && !this.aClass19_3.method401()) {
				local294 = this.aClass19_3.method409((byte) 2, true, this.anInt6247, arg1);
				this.aClass257_28.method5504(local294, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I")
	@Override
	public int method4779(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub3_Sub2 local16 = (Class1_Sub3_Sub2) this.aClass257_28.method5503((long) arg0);
		return local16 == null ? 0 : local16.method4908();
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)I")
	public int method4789() {
		return this.aClass25_2 == null ? 0 : this.aClass25_2.anInt620;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I")
	public int method4790() {
		return this.anInt6233;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public void method4791() {
		if (this.aClass178_3 != null) {
			this.aBoolean515 = true;
			if (this.aClass254_42 == null) {
				this.aClass254_42 = new Class254();
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(Z)V")
	public void method4793() {
		if (this.aClass254_42 != null) {
			if (this.method4780() == null) {
				return;
			}
			@Pc(22) boolean local22;
			@Pc(27) Class1 local27;
			@Pc(33) int local33;
			@Pc(126) Class1 local126;
			if (this.aBoolean514) {
				local22 = true;
				for (local27 = this.aClass254_42.method5437(); local27 != null; local27 = this.aClass254_42.method5433()) {
					local33 = (int) local27.aLong226;
					if (this.aByteArray73[local33] == 0) {
						this.method4788(1, local33);
					}
					if (this.aByteArray73[local33] == 0) {
						local22 = false;
					} else {
						local27.method5617();
					}
				}
				while (this.anInt6248 < this.aClass25_2.anIntArray37.length) {
					if (this.aClass25_2.anIntArray37[this.anInt6248] == 0) {
						this.anInt6248++;
					} else {
						if (this.aClass134_3.anInt3347 >= 250) {
							local22 = false;
							break;
						}
						if (this.aByteArray73[this.anInt6248] == 0) {
							this.method4788(1, this.anInt6248);
						}
						if (this.aByteArray73[this.anInt6248] == 0) {
							local126 = new Class1();
							local126.aLong226 = this.anInt6248;
							this.aClass254_42.method5430(local126);
							local22 = false;
						}
						this.anInt6248++;
					}
				}
				if (local22) {
					this.anInt6248 = 0;
					this.aBoolean514 = false;
				}
			} else if (this.aBoolean515) {
				local22 = true;
				for (local27 = this.aClass254_42.method5437(); local27 != null; local27 = this.aClass254_42.method5433()) {
					local33 = (int) local27.aLong226;
					if (this.aByteArray73[local33] != 1) {
						this.method4788(2, local33);
					}
					if (this.aByteArray73[local33] == 1) {
						local27.method5617();
					} else {
						local22 = false;
					}
				}
				while (this.aClass25_2.anIntArray37.length > this.anInt6248) {
					if (this.aClass25_2.anIntArray37[this.anInt6248] == 0) {
						this.anInt6248++;
					} else {
						if (this.aClass19_3.method412()) {
							local22 = false;
							break;
						}
						if (this.aByteArray73[this.anInt6248] != 1) {
							this.method4788(2, this.anInt6248);
						}
						if (this.aByteArray73[this.anInt6248] != 1) {
							local126 = new Class1();
							local126.aLong226 = this.anInt6248;
							local22 = false;
							this.aClass254_42.method5430(local126);
						}
						this.anInt6248++;
					}
				}
				if (local22) {
					this.aBoolean515 = false;
					this.anInt6248 = 0;
				}
			} else {
				this.aClass254_42 = null;
			}
		}
		if (!this.aBoolean516 || this.aLong191 > Static232.method3058()) {
			return;
		}
		for (@Pc(322) Class1_Sub3_Sub2 local322 = (Class1_Sub3_Sub2) this.aClass257_28.method5506(); local322 != null; local322 = (Class1_Sub3_Sub2) this.aClass257_28.method5501()) {
			if (!local322.aBoolean524) {
				if (local322.aBoolean523) {
					if (!local322.aBoolean525) {
						throw new RuntimeException();
					}
					local322.method5617();
				} else {
					local322.aBoolean523 = true;
				}
			}
		}
		this.aLong191 = Static232.method3058() + 1000L;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Lclient!bm;")
	@Override
	public Class25 method4780() {
		if (this.aClass25_2 != null) {
			return this.aClass25_2;
		}
		if (this.aClass1_Sub3_Sub2_1 == null) {
			if (this.aClass19_3.method401()) {
				return null;
			}
			this.aClass1_Sub3_Sub2_1 = this.aClass19_3.method409((byte) 0, true, 255, this.anInt6247);
		}
		if (this.aClass1_Sub3_Sub2_1.aBoolean524) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass1_Sub3_Sub2_1.method4906();
		if (this.aClass1_Sub3_Sub2_1 instanceof Class1_Sub3_Sub2_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass25_2 = new Class25(local48, this.anInt6235);
				if (this.anInt6246 != this.aClass25_2.anInt621) {
					throw new RuntimeException();
				}
			} catch (@Pc(77) RuntimeException local77) {
				this.aClass25_2 = null;
				if (this.aClass19_3.method401()) {
					this.aClass1_Sub3_Sub2_1 = null;
				} else {
					this.aClass1_Sub3_Sub2_1 = this.aClass19_3.method409((byte) 0, true, 255, this.anInt6247);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass25_2 = new Class25(local48, this.anInt6235);
			} catch (@Pc(119) RuntimeException local119) {
				this.aClass19_3.method399();
				this.aClass25_2 = null;
				if (this.aClass19_3.method401()) {
					this.aClass1_Sub3_Sub2_1 = null;
				} else {
					this.aClass1_Sub3_Sub2_1 = this.aClass19_3.method409((byte) 0, true, 255, this.anInt6247);
				}
				return null;
			}
			if (this.aClass178_4 != null) {
				this.aClass134_3.method2788(this.anInt6247, local48, this.aClass178_4);
			}
		}
		if (this.aClass178_3 != null) {
			this.aByteArray73 = new byte[this.aClass25_2.anInt623];
			this.anInt6233 = 0;
		}
		this.aClass1_Sub3_Sub2_1 = null;
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)I")
	public int method4794() {
		if (this.method4780() == null) {
			return this.aClass1_Sub3_Sub2_1 == null ? 0 : this.aClass1_Sub3_Sub2_1.method4908();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)I")
	public int method4795() {
		if (this.aClass25_2 == null) {
			return 0;
		} else if (this.aBoolean514) {
			@Pc(26) Class1 local26 = this.aClass254_42.method5437();
			return local26 == null ? 0 : (int) local26.aLong226;
		} else {
			return this.aClass25_2.anInt620;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method4786(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub3_Sub2 local14 = this.method4788(0, arg0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method4906();
			local14.method5617();
			return local22;
		}
	}
}
