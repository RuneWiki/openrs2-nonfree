import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class217_Sub1 extends Class217 {

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!nca", name = "x", descriptor = "Lclient!uia;")
	private Class345 aClass345_1;

	@OriginalMember(owner = "client!nca", name = "J", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
	private int anInt6776 = 0;

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "Lclient!he;")
	private final Class128 aClass128_24 = new Class128(16);

	@OriginalMember(owner = "client!nca", name = "H", descriptor = "I")
	private int anInt6778 = 0;

	@OriginalMember(owner = "client!nca", name = "G", descriptor = "Lclient!ada;")
	private final Class8 aClass8_39 = new Class8();

	@OriginalMember(owner = "client!nca", name = "K", descriptor = "J")
	private long aLong174 = 0L;

	@OriginalMember(owner = "client!nca", name = "w", descriptor = "I")
	private final int anInt6770;

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "Lclient!np;")
	private final Class227 aClass227_2;

	@OriginalMember(owner = "client!nca", name = "I", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!nca", name = "F", descriptor = "Lclient!ada;")
	private Class8 aClass8_38;

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "Lclient!hfa;")
	private final Class130 aClass130_2;

	@OriginalMember(owner = "client!nca", name = "L", descriptor = "Z")
	private final boolean aBoolean447;

	@OriginalMember(owner = "client!nca", name = "B", descriptor = "I")
	private final int anInt6774;

	@OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
	private final int anInt6765;

	@OriginalMember(owner = "client!nca", name = "u", descriptor = "Lclient!ro;")
	private final Class296 aClass296_3;

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "[B")
	private final byte[] aByteArray68;

	@OriginalMember(owner = "client!nca", name = "s", descriptor = "Lclient!np;")
	private final Class227 aClass227_3;

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "Lclient!cu;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_1;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(ILclient!np;Lclient!np;Lclient!ro;Lclient!hfa;I[BIZ)V")
	public Class217_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class227 arg2, @OriginalArg(3) Class296 arg3, @OriginalArg(4) Class130 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt6770 = arg0;
		this.aClass227_2 = arg1;
		if (this.aClass227_2 == null) {
			this.aBoolean445 = false;
		} else {
			this.aBoolean445 = true;
			this.aClass8_38 = new Class8();
		}
		this.aClass130_2 = arg4;
		this.aBoolean447 = arg8;
		this.anInt6774 = arg7;
		this.anInt6765 = arg5;
		this.aClass296_3 = arg3;
		this.aByteArray68 = arg6;
		this.aClass227_3 = arg2;
		if (this.aClass227_3 != null) {
			this.aClass6_Sub2_Sub3_1 = this.aClass130_2.method3581(this.aClass227_3, this.anInt6770);
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)I")
	public int method5796() {
		return this.aClass345_1 == null ? 0 : this.aClass345_1.anInt9658;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)Lclient!uia;")
	@Override
	public Class345 method5791() {
		if (this.aClass345_1 != null) {
			return this.aClass345_1;
		}
		if (this.aClass6_Sub2_Sub3_1 == null) {
			if (this.aClass296_3.method7427()) {
				return null;
			}
			this.aClass6_Sub2_Sub3_1 = this.aClass296_3.method7437(this.anInt6770, (byte) 0, true, 255);
		}
		if (this.aClass6_Sub2_Sub3_1.aBoolean158) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass6_Sub2_Sub3_1.method1736();
		if (this.aClass6_Sub2_Sub3_1 instanceof Class6_Sub2_Sub3_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass345_1 = new Class345(local50, this.anInt6765, this.aByteArray68);
				if (this.anInt6774 != this.aClass345_1.anInt9661) {
					throw new RuntimeException();
				}
			} catch (@Pc(85) RuntimeException local85) {
				this.aClass345_1 = null;
				if (this.aClass296_3.method7427()) {
					this.aClass6_Sub2_Sub3_1 = null;
				} else {
					this.aClass6_Sub2_Sub3_1 = this.aClass296_3.method7437(this.anInt6770, (byte) 0, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass345_1 = new Class345(local50, this.anInt6765, this.aByteArray68);
			} catch (@Pc(129) RuntimeException local129) {
				this.aClass296_3.method7433();
				this.aClass345_1 = null;
				if (this.aClass296_3.method7427()) {
					this.aClass6_Sub2_Sub3_1 = null;
				} else {
					this.aClass6_Sub2_Sub3_1 = this.aClass296_3.method7437(this.anInt6770, (byte) 0, true, 255);
				}
				return null;
			}
			if (this.aClass227_3 != null) {
				this.aClass130_2.method3585(this.aClass227_3, local50, this.anInt6770);
			}
		}
		if (this.aClass227_2 != null) {
			this.aByteArray67 = new byte[this.aClass345_1.anInt9659];
			this.anInt6776 = 0;
		}
		this.aClass6_Sub2_Sub3_1 = null;
		return this.aClass345_1;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)I")
	public int method5798() {
		return this.anInt6776;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BI)I")
	@Override
	public int method5793(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub2_Sub3 local16 = (Class6_Sub2_Sub3) this.aClass128_24.method3560((long) arg0);
		return local16 == null ? 0 : local16.method1735();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method5794(@OriginalArg(0) int arg0) {
		@Pc(15) Class6_Sub2_Sub3 local15 = this.method5804(arg0, 0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method1736();
			local15.method9043();
			return local23;
		}
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)I")
	public int method5799() {
		if (this.method5791() == null) {
			return this.aClass6_Sub2_Sub3_1 == null ? 0 : this.aClass6_Sub2_Sub3_1.method1735();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)I")
	public int method5800() {
		if (this.aClass345_1 == null) {
			return 0;
		} else if (this.aBoolean445) {
			@Pc(28) Class6 local28 = this.aClass8_38.method149();
			return local28 == null ? 0 : (int) local28.aLong278;
		} else {
			return this.aClass345_1.anInt9658;
		}
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)V")
	public void method5802() {
		if (this.aClass227_2 != null) {
			this.aBoolean446 = true;
			if (this.aClass8_38 == null) {
				this.aClass8_38 = new Class8();
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)V")
	@Override
	public void method5790(@OriginalArg(0) int arg0) {
		if (this.aClass227_2 == null) {
			return;
		}
		for (@Pc(21) Class6 local21 = this.aClass8_39.method149(); local21 != null; local21 = this.aClass8_39.method155()) {
			if (local21.aLong278 == (long) arg0) {
				return;
			}
		}
		@Pc(45) Class6 local45 = new Class6();
		local45.aLong278 = (long) arg0;
		this.aClass8_39.method157(local45);
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(I)V")
	public void method5803() {
		if (this.aClass8_38 != null) {
			if (this.method5791() == null) {
				return;
			}
			@Pc(24) boolean local24;
			@Pc(29) Class6 local29;
			@Pc(35) int local35;
			@Pc(126) Class6 local126;
			if (this.aBoolean445) {
				local24 = true;
				for (local29 = this.aClass8_38.method149(); local29 != null; local29 = this.aClass8_38.method155()) {
					local35 = (int) local29.aLong278;
					if (this.aByteArray67[local35] == 0) {
						this.method5804(local35, 1);
					}
					if (this.aByteArray67[local35] == 0) {
						local24 = false;
					} else {
						local29.method9043();
					}
				}
				while (this.aClass345_1.anIntArray589.length > this.anInt6778) {
					if (this.aClass345_1.anIntArray589[this.anInt6778] == 0) {
						this.anInt6778++;
					} else {
						if (this.aClass130_2.anInt4103 >= 250) {
							local24 = false;
							break;
						}
						if (this.aByteArray67[this.anInt6778] == 0) {
							this.method5804(this.anInt6778, 1);
						}
						if (this.aByteArray67[this.anInt6778] == 0) {
							local126 = new Class6();
							local126.aLong278 = (long) this.anInt6778;
							local24 = false;
							this.aClass8_38.method157(local126);
						}
						this.anInt6778++;
					}
				}
				if (local24) {
					this.anInt6778 = 0;
					this.aBoolean445 = false;
				}
			} else if (this.aBoolean446) {
				local24 = true;
				for (local29 = this.aClass8_38.method149(); local29 != null; local29 = this.aClass8_38.method155()) {
					local35 = (int) local29.aLong278;
					if (this.aByteArray67[local35] != 1) {
						this.method5804(local35, 2);
					}
					if (this.aByteArray67[local35] == 1) {
						local29.method9043();
					} else {
						local24 = false;
					}
				}
				while (this.anInt6778 < this.aClass345_1.anIntArray589.length) {
					if (this.aClass345_1.anIntArray589[this.anInt6778] == 0) {
						this.anInt6778++;
					} else {
						if (this.aClass296_3.method7432()) {
							local24 = false;
							break;
						}
						if (this.aByteArray67[this.anInt6778] != 1) {
							this.method5804(this.anInt6778, 2);
						}
						if (this.aByteArray67[this.anInt6778] != 1) {
							local126 = new Class6();
							local126.aLong278 = (long) this.anInt6778;
							local24 = false;
							this.aClass8_38.method157(local126);
						}
						this.anInt6778++;
					}
				}
				if (local24) {
					this.aBoolean446 = false;
					this.anInt6778 = 0;
				}
			} else {
				this.aClass8_38 = null;
			}
		}
		if (!this.aBoolean447 || Static32.method595() < this.aLong174) {
			return;
		}
		for (@Pc(320) Class6_Sub2_Sub3 local320 = (Class6_Sub2_Sub3) this.aClass128_24.method3556(); local320 != null; local320 = (Class6_Sub2_Sub3) this.aClass128_24.method3555()) {
			if (!local320.aBoolean158) {
				if (local320.aBoolean157) {
					if (!local320.aBoolean159) {
						throw new RuntimeException();
					}
					local320.method9043();
				} else {
					local320.aBoolean157 = true;
				}
			}
		}
		this.aLong174 = Static32.method595() + 1000L;
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(III)Lclient!cu;")
	private Class6_Sub2_Sub3 method5804(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class6_Sub2_Sub3 local20 = (Class6_Sub2_Sub3) this.aClass128_24.method3560((long) arg0);
		if (local20 != null && arg1 == 0 && !local20.aBoolean159 && local20.aBoolean158) {
			local20.method9043();
			local20 = null;
		}
		if (local20 == null) {
			if (arg1 == 0) {
				if (this.aClass227_2 == null || this.aByteArray67[arg0] == -1) {
					if (this.aClass296_3.method7427()) {
						return null;
					}
					local20 = this.aClass296_3.method7437(arg0, (byte) 2, true, this.anInt6770);
				} else {
					local20 = this.aClass130_2.method3581(this.aClass227_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass227_2 == null) {
					throw new RuntimeException();
				}
				local20 = this.aClass130_2.method3584(this.aClass227_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass227_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray67[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass296_3.method7432()) {
					return null;
				}
				local20 = this.aClass296_3.method7437(arg0, (byte) 2, false, this.anInt6770);
			} else {
				throw new RuntimeException();
			}
			this.aClass128_24.method3551((long) arg0, local20);
		}
		if (local20.aBoolean158) {
			return null;
		}
		@Pc(158) byte[] local158 = local20.method1736();
		@Pc(187) int local187;
		@Pc(214) byte[] local214;
		@Pc(223) byte[] local223;
		@Pc(225) int local225;
		@Pc(337) Class6_Sub2_Sub3_Sub2 local337;
		if (!(local20 instanceof Class6_Sub2_Sub3_Sub1)) {
			try {
				label157: {
					if (local158 != null && local158.length > 2) {
						Static484.aCRC32_1.reset();
						Static484.aCRC32_1.update(local158, 0, local158.length - 2);
						local187 = (int) Static484.aCRC32_1.getValue();
						if (this.aClass345_1.anIntArray592[arg0] != local187) {
							throw new RuntimeException();
						}
						if (this.aClass345_1.aByteArrayArray158 == null || this.aClass345_1.aByteArrayArray158[arg0] == null) {
							break label157;
						}
						local214 = this.aClass345_1.aByteArrayArray158[arg0];
						local223 = Static231.method3959(0, local158, local158.length - 2);
						local225 = 0;
						while (true) {
							if (local225 >= 64) {
								break label157;
							}
							if (local223[local225] != local214[local225]) {
								throw new RuntimeException();
							}
							local225++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass296_3.anInt8633 = 0;
				this.aClass296_3.anInt8634 = 0;
			} catch (@Pc(439) RuntimeException local439) {
				this.aClass296_3.method7433();
				local20.method9043();
				if (local20.aBoolean159 && !this.aClass296_3.method7427()) {
					local337 = this.aClass296_3.method7437(arg0, (byte) 2, true, this.anInt6770);
					this.aClass128_24.method3551((long) arg0, local337);
				}
				return null;
			}
			local158[local158.length - 2] = (byte) (this.aClass345_1.anIntArray587[arg0] >>> 8);
			local158[local158.length - 1] = (byte) this.aClass345_1.anIntArray587[arg0];
			if (this.aClass227_2 != null) {
				this.aClass130_2.method3585(this.aClass227_2, local158, arg0);
				if (this.aByteArray67[arg0] != 1) {
					this.anInt6776++;
					this.aByteArray67[arg0] = 1;
				}
			}
			if (!local20.aBoolean159) {
				local20.method9043();
			}
			return local20;
		}
		try {
			if (local158 == null || local158.length <= 2) {
				throw new RuntimeException();
			}
			Static484.aCRC32_1.reset();
			Static484.aCRC32_1.update(local158, 0, local158.length - 2);
			local187 = (int) Static484.aCRC32_1.getValue();
			if (this.aClass345_1.anIntArray592[arg0] != local187) {
				throw new RuntimeException();
			}
			if (this.aClass345_1.aByteArrayArray158 != null && this.aClass345_1.aByteArrayArray158[arg0] != null) {
				local214 = this.aClass345_1.aByteArrayArray158[arg0];
				local223 = Static231.method3959(0, local158, local158.length - 2);
				for (local225 = 0; local225 < 64; local225++) {
					if (local214[local225] != local223[local225]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(268) int local268 = (local158[local158.length - 1] & 0xFF) + ((local158[local158.length - 2] & 0xFF) << 8);
			if (local268 != (this.aClass345_1.anIntArray587[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray67[arg0] != 1) {
				this.anInt6776++;
				this.aByteArray67[arg0] = 1;
			}
			if (!local20.aBoolean159) {
				local20.method9043();
			}
			return local20;
		} catch (@Pc(309) Exception local309) {
			this.aByteArray67[arg0] = -1;
			local20.method9043();
			if (local20.aBoolean159 && !this.aClass296_3.method7427()) {
				local337 = this.aClass296_3.method7437(arg0, (byte) 2, true, this.anInt6770);
				this.aClass128_24.method3551((long) arg0, local337);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)V")
	public void method5805() {
		if (this.aClass8_38 == null || this.method5791() == null) {
			return;
		}
		for (@Pc(25) Class6 local25 = this.aClass8_39.method149(); local25 != null; local25 = this.aClass8_39.method155()) {
			@Pc(31) int local31 = (int) local25.aLong278;
			if (local31 < 0 || local31 >= this.aClass345_1.anInt9659 || this.aClass345_1.anIntArray589[local31] == 0) {
				local25.method9043();
			} else {
				if (this.aByteArray67[local31] == 0) {
					this.method5804(local31, 1);
				}
				if (this.aByteArray67[local31] == -1) {
					this.method5804(local31, 2);
				}
				if (this.aByteArray67[local31] == 1) {
					local25.method9043();
				}
			}
		}
	}
}
