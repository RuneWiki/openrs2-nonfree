import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "Lclient!bs;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "Z")
	private boolean aBoolean432;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	private int anInt6806 = 0;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "Lclient!sd;")
	private final Class267 aClass267_31 = new Class267(16);

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	private int anInt6820 = 0;

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "Lclient!eea;")
	private final Class71 aClass71_52 = new Class71();

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Lclient!ls;")
	private final Class182 aClass182_4;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
	private final int anInt6812;

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "Lclient!eea;")
	private Class71 aClass71_53;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "Z")
	private final boolean aBoolean433;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "Lclient!kf;")
	private final Class162 aClass162_2;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
	private final int anInt6816;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!ls;")
	private final Class182 aClass182_3;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "[B")
	private final byte[] aByteArray74;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	private final int anInt6802;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!jq;")
	private final Class153 aClass153_3;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!dr;")
	private Class3_Sub10_Sub1 aClass3_Sub10_Sub1_1;

	static {
		new Class67("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILclient!ls;Lclient!ls;Lclient!jq;Lclient!kf;I[BIZ)V")
	public Class113_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class153 arg3, @OriginalArg(4) Class162 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass182_4 = arg1;
		this.anInt6812 = arg0;
		if (this.aClass182_4 == null) {
			this.aBoolean431 = false;
		} else {
			this.aBoolean431 = true;
			this.aClass71_53 = new Class71();
		}
		this.aBoolean433 = arg8;
		this.aClass162_2 = arg4;
		this.anInt6816 = arg7;
		this.aClass182_3 = arg2;
		this.aByteArray74 = arg6;
		this.anInt6802 = arg5;
		this.aClass153_3 = arg3;
		if (this.aClass182_3 != null) {
			this.aClass3_Sub10_Sub1_1 = this.aClass162_2.method4271(this.anInt6812, this.aClass182_3);
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)I")
	@Override
	public int method5708(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub10_Sub1 local11 = (Class3_Sub10_Sub1) this.aClass267_31.method6644((long) arg0);
		return local11 == null ? 0 : local11.method4926();
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)Lclient!dr;")
	private Class3_Sub10_Sub1 method5712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class3_Sub10_Sub1 local20 = (Class3_Sub10_Sub1) this.aClass267_31.method6644((long) arg1);
		if (local20 != null && arg0 == 0 && !local20.aBoolean381 && local20.aBoolean382) {
			local20.method7820();
			local20 = null;
		}
		if (local20 == null) {
			if (arg0 == 0) {
				if (this.aClass182_4 == null || this.aByteArray73[arg1] == -1) {
					if (this.aClass153_3.method4130()) {
						return null;
					}
					local20 = this.aClass153_3.method4117(this.anInt6812, (byte) 2, arg1, true);
				} else {
					local20 = this.aClass162_2.method4271(arg1, this.aClass182_4);
				}
			} else if (arg0 == 1) {
				if (this.aClass182_4 == null) {
					throw new RuntimeException();
				}
				local20 = this.aClass162_2.method4275(arg1, this.aClass182_4);
			} else if (arg0 == 2) {
				if (this.aClass182_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray73[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass153_3.method4124()) {
					return null;
				}
				local20 = this.aClass153_3.method4117(this.anInt6812, (byte) 2, arg1, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass267_31.method6640(local20, (long) arg1);
		}
		if (local20.aBoolean382) {
			return null;
		}
		@Pc(160) byte[] local160 = local20.method4927();
		@Pc(189) int local189;
		@Pc(216) byte[] local216;
		@Pc(225) byte[] local225;
		@Pc(227) int local227;
		@Pc(281) Class3_Sub10_Sub1_Sub1 local281;
		if (!(local20 instanceof Class3_Sub10_Sub1_Sub2)) {
			try {
				if (local160 == null || local160.length <= 2) {
					throw new RuntimeException();
				}
				Static244.aCRC32_1.reset();
				Static244.aCRC32_1.update(local160, 0, local160.length - 2);
				local189 = (int) Static244.aCRC32_1.getValue();
				if (local189 != this.aClass37_2.anIntArray136[arg1]) {
					throw new RuntimeException();
				}
				if (this.aClass37_2.aByteArrayArray1 != null && this.aClass37_2.aByteArrayArray1[arg1] != null) {
					local216 = this.aClass37_2.aByteArrayArray1[arg1];
					local225 = Static332.method5280(local160.length - 2, local160, 0);
					for (local227 = 0; local227 < 64; local227++) {
						if (local216[local227] != local225[local227]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass153_3.anInt4929 = 0;
				this.aClass153_3.anInt4928 = 0;
			} catch (@Pc(254) RuntimeException local254) {
				this.aClass153_3.method4123();
				local20.method7820();
				if (local20.aBoolean381 && !this.aClass153_3.method4130()) {
					local281 = this.aClass153_3.method4117(this.anInt6812, (byte) 2, arg1, true);
					this.aClass267_31.method6640(local281, (long) arg1);
				}
				return null;
			}
			local160[local160.length - 2] = (byte) (this.aClass37_2.anIntArray141[arg1] >>> 8);
			local160[local160.length - 1] = (byte) this.aClass37_2.anIntArray141[arg1];
			if (this.aClass182_4 != null) {
				this.aClass162_2.method4276(local160, arg1, this.aClass182_4);
				if (this.aByteArray73[arg1] != 1) {
					this.anInt6806++;
					this.aByteArray73[arg1] = 1;
				}
			}
			if (!local20.aBoolean381) {
				local20.method7820();
			}
			return local20;
		}
		try {
			if (local160 == null || local160.length <= 2) {
				throw new RuntimeException();
			}
			Static244.aCRC32_1.reset();
			Static244.aCRC32_1.update(local160, 0, local160.length - 2);
			local189 = (int) Static244.aCRC32_1.getValue();
			if (this.aClass37_2.anIntArray136[arg1] != local189) {
				throw new RuntimeException();
			}
			if (this.aClass37_2.aByteArrayArray1 != null && this.aClass37_2.aByteArrayArray1[arg1] != null) {
				local216 = this.aClass37_2.aByteArrayArray1[arg1];
				local225 = Static332.method5280(local160.length - 2, local160, 0);
				for (local227 = 0; local227 < 64; local227++) {
					if (local225[local227] != local216[local227]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(467) int local467 = ((local160[local160.length - 2] & 0xFF) << 8) + (local160[local160.length - 1] & 0xFF);
			if ((this.aClass37_2.anIntArray141[arg1] & 0xFFFF) != local467) {
				throw new RuntimeException();
			}
			if (this.aByteArray73[arg1] != 1) {
				this.anInt6806++;
				this.aByteArray73[arg1] = 1;
			}
			if (!local20.aBoolean381) {
				local20.method7820();
			}
			return local20;
		} catch (@Pc(508) Exception local508) {
			this.aByteArray73[arg1] = -1;
			local20.method7820();
			if (local20.aBoolean381 && !this.aClass153_3.method4130()) {
				local281 = this.aClass153_3.method4117(this.anInt6812, (byte) 2, arg1, true);
				this.aClass267_31.method6640(local281, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public void method5713() {
		if (this.aClass182_4 != null) {
			this.aBoolean432 = true;
			if (this.aClass71_53 == null) {
				this.aClass71_53 = new Class71();
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public void method5714() {
		if (this.aClass71_53 != null) {
			if (this.method5710() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class3 local31;
			@Pc(37) int local37;
			@Pc(125) Class3 local125;
			if (this.aBoolean431) {
				local26 = true;
				for (local31 = this.aClass71_53.method2089(); local31 != null; local31 = this.aClass71_53.method2086()) {
					local37 = (int) local31.aLong285;
					if (this.aByteArray73[local37] == 0) {
						this.method5712(1, local37);
					}
					if (this.aByteArray73[local37] == 0) {
						local26 = false;
					} else {
						local31.method7820();
					}
				}
				while (this.anInt6820 < this.aClass37_2.anIntArray138.length) {
					if (this.aClass37_2.anIntArray138[this.anInt6820] == 0) {
						this.anInt6820++;
					} else {
						if (this.aClass162_2.anInt5092 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray73[this.anInt6820] == 0) {
							this.method5712(1, this.anInt6820);
						}
						if (this.aByteArray73[this.anInt6820] == 0) {
							local125 = new Class3();
							local125.aLong285 = this.anInt6820;
							this.aClass71_53.method2076(local125);
							local26 = false;
						}
						this.anInt6820++;
					}
				}
				if (local26) {
					this.aBoolean431 = false;
					this.anInt6820 = 0;
				}
			} else if (this.aBoolean432) {
				local26 = true;
				for (local31 = this.aClass71_53.method2089(); local31 != null; local31 = this.aClass71_53.method2086()) {
					local37 = (int) local31.aLong285;
					if (this.aByteArray73[local37] != 1) {
						this.method5712(2, local37);
					}
					if (this.aByteArray73[local37] == 1) {
						local31.method7820();
					} else {
						local26 = false;
					}
				}
				while (this.aClass37_2.anIntArray138.length > this.anInt6820) {
					if (this.aClass37_2.anIntArray138[this.anInt6820] == 0) {
						this.anInt6820++;
					} else {
						if (this.aClass153_3.method4124()) {
							local26 = false;
							break;
						}
						if (this.aByteArray73[this.anInt6820] != 1) {
							this.method5712(2, this.anInt6820);
						}
						if (this.aByteArray73[this.anInt6820] != 1) {
							local125 = new Class3();
							local125.aLong285 = this.anInt6820;
							local26 = false;
							this.aClass71_53.method2076(local125);
						}
						this.anInt6820++;
					}
				}
				if (local26) {
					this.anInt6820 = 0;
					this.aBoolean432 = false;
				}
			} else {
				this.aClass71_53 = null;
			}
		}
		if (!this.aBoolean433 || Static12.method647() < this.aLong210) {
			return;
		}
		for (@Pc(306) Class3_Sub10_Sub1 local306 = (Class3_Sub10_Sub1) this.aClass267_31.method6643(); local306 != null; local306 = (Class3_Sub10_Sub1) this.aClass267_31.method6650()) {
			if (!local306.aBoolean382) {
				if (local306.aBoolean380) {
					if (!local306.aBoolean381) {
						throw new RuntimeException();
					}
					local306.method7820();
				} else {
					local306.aBoolean380 = true;
				}
			}
		}
		this.aLong210 = Static12.method647() + 1000L;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
	@Override
	public void method5706(@OriginalArg(0) int arg0) {
		if (this.aClass182_4 == null) {
			return;
		}
		for (@Pc(14) Class3 local14 = this.aClass71_52.method2089(); local14 != null; local14 = this.aClass71_52.method2086()) {
			if (local14.aLong285 == (long) arg0) {
				return;
			}
		}
		@Pc(34) Class3 local34 = new Class3();
		local34.aLong285 = arg0;
		this.aClass71_52.method2076(local34);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
	public void method5715() {
		if (this.aClass71_53 == null || this.method5710() == null) {
			return;
		}
		for (@Pc(23) Class3 local23 = this.aClass71_52.method2089(); local23 != null; local23 = this.aClass71_52.method2086()) {
			@Pc(29) int local29 = (int) local23.aLong285;
			if (local29 < 0 || local29 >= this.aClass37_2.anInt1020 || this.aClass37_2.anIntArray138[local29] == 0) {
				local23.method7820();
			} else {
				if (this.aByteArray73[local29] == 0) {
					this.method5712(1, local29);
				}
				if (this.aByteArray73[local29] == -1) {
					this.method5712(2, local29);
				}
				if (this.aByteArray73[local29] == 1) {
					local23.method7820();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)I")
	public int method5717() {
		if (this.method5710() == null) {
			return this.aClass3_Sub10_Sub1_1 == null ? 0 : this.aClass3_Sub10_Sub1_1.method4926();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)I")
	public int method5718() {
		return this.aClass37_2 == null ? 0 : this.aClass37_2.anInt1019;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method5707(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub10_Sub1 local9 = this.method5712(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method4927();
			local9.method7820();
			return local17;
		}
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)I")
	public int method5720() {
		if (this.aClass37_2 == null) {
			return 0;
		} else if (this.aBoolean431) {
			@Pc(20) Class3 local20 = this.aClass71_53.method2089();
			return local20 == null ? 0 : (int) local20.aLong285;
		} else {
			return this.aClass37_2.anInt1019;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lclient!bs;")
	@Override
	public Class37 method5710() {
		if (this.aClass37_2 != null) {
			return this.aClass37_2;
		}
		if (this.aClass3_Sub10_Sub1_1 == null) {
			if (this.aClass153_3.method4130()) {
				return null;
			}
			this.aClass3_Sub10_Sub1_1 = this.aClass153_3.method4117(255, (byte) 0, this.anInt6812, true);
		}
		if (this.aClass3_Sub10_Sub1_1.aBoolean382) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass3_Sub10_Sub1_1.method4927();
		if (this.aClass3_Sub10_Sub1_1 instanceof Class3_Sub10_Sub1_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass37_2 = new Class37(local48, this.anInt6802, this.aByteArray74);
				if (this.anInt6816 != this.aClass37_2.anInt1015) {
					throw new RuntimeException();
				}
			} catch (@Pc(79) RuntimeException local79) {
				this.aClass37_2 = null;
				if (this.aClass153_3.method4130()) {
					this.aClass3_Sub10_Sub1_1 = null;
				} else {
					this.aClass3_Sub10_Sub1_1 = this.aClass153_3.method4117(255, (byte) 0, this.anInt6812, true);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass37_2 = new Class37(local48, this.anInt6802, this.aByteArray74);
			} catch (@Pc(123) RuntimeException local123) {
				this.aClass153_3.method4123();
				this.aClass37_2 = null;
				if (this.aClass153_3.method4130()) {
					this.aClass3_Sub10_Sub1_1 = null;
				} else {
					this.aClass3_Sub10_Sub1_1 = this.aClass153_3.method4117(255, (byte) 0, this.anInt6812, true);
				}
				return null;
			}
			if (this.aClass182_3 != null) {
				this.aClass162_2.method4276(local48, this.anInt6812, this.aClass182_3);
			}
		}
		if (this.aClass182_4 != null) {
			this.anInt6806 = 0;
			this.aByteArray73 = new byte[this.aClass37_2.anInt1020];
		}
		this.aClass3_Sub10_Sub1_1 = null;
		return this.aClass37_2;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)I")
	public int method5721() {
		return this.anInt6806;
	}
}
