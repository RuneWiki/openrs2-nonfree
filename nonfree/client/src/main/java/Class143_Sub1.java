import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!se", name = "x", descriptor = "Lclient!wm;")
	private Class181 aClass181_2;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!se", name = "M", descriptor = "Z")
	private boolean aBoolean385;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	private int anInt4978 = 0;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!cd;")
	private Class22 aClass22_17 = new Class22(16);

	@OriginalMember(owner = "client!se", name = "O", descriptor = "I")
	private int anInt4986 = 0;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "Lclient!hh;")
	private Class69 aClass69_24 = new Class69();

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "J")
	private long aLong155 = 0L;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Lclient!tm;")
	private Class159 aClass159_4;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	private int anInt4973;

	@OriginalMember(owner = "client!se", name = "N", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "Lclient!hh;")
	private Class69 aClass69_23;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "I")
	private int anInt4981;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "Lclient!wj;")
	private Class179 aClass179_3;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Lclient!vb;")
	private Class168 aClass168_4;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!tm;")
	private Class159 aClass159_3;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	private int anInt4969;

	@OriginalMember(owner = "client!se", name = "R", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "Lclient!hl;")
	private Class1_Sub2_Sub1 aClass1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(ILclient!tm;Lclient!tm;Lclient!vb;Lclient!wj;IIZ)V")
	public Class143_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) Class168 arg3, @OriginalArg(4) Class179 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass159_4 = arg1;
		this.anInt4973 = arg0;
		if (this.aClass159_4 == null) {
			this.aBoolean386 = false;
		} else {
			this.aBoolean386 = true;
			this.aClass69_23 = new Class69();
		}
		this.anInt4981 = arg5;
		this.aClass179_3 = arg4;
		this.aClass168_4 = arg3;
		this.aClass159_3 = arg2;
		this.anInt4969 = arg6;
		this.aBoolean387 = arg7;
		if (this.aClass159_3 != null) {
			this.aClass1_Sub2_Sub1_1 = this.aClass179_3.method4526(this.anInt4973, this.aClass159_3);
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)[B")
	@Override
	public byte[] method3820(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub2_Sub1 local9 = this.method3828(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method2546();
			local9.method4534();
			return local18;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I")
	public int method3823() {
		if (this.aClass181_2 == null) {
			return 0;
		} else if (this.aBoolean386) {
			@Pc(30) Class1 local30 = this.aClass69_23.method1636();
			return local30 == null ? 0 : (int) local30.aLong202;
		} else {
			return this.aClass181_2.anInt5900;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)I")
	public int method3824() {
		return this.anInt4978;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
	@Override
	public void method3815(@OriginalArg(0) int arg0) {
		if (this.aClass159_4 == null) {
			return;
		}
		@Pc(19) Class1 local19;
		for (local19 = this.aClass69_24.method1636(); local19 != null; local19 = this.aClass69_24.method1631()) {
			if (local19.aLong202 == (long) arg0) {
				return;
			}
		}
		local19 = new Class1();
		local19.aLong202 = arg0;
		this.aClass69_24.method1628(local19);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Lclient!wm;")
	@Override
	public Class181 method3816() {
		if (this.aClass181_2 != null) {
			return this.aClass181_2;
		}
		if (this.aClass1_Sub2_Sub1_1 == null) {
			if (this.aClass168_4.method4266()) {
				return null;
			}
			this.aClass1_Sub2_Sub1_1 = this.aClass168_4.method4276((byte) 0, this.anInt4973, true, 255);
		}
		if (this.aClass1_Sub2_Sub1_1.aBoolean233) {
			return null;
		}
		@Pc(45) byte[] local45 = this.aClass1_Sub2_Sub1_1.method2546();
		if (this.aClass1_Sub2_Sub1_1 instanceof Class1_Sub2_Sub1_Sub2) {
			try {
				if (local45 == null) {
					throw new RuntimeException();
				}
				this.aClass181_2 = new Class181(local45, this.anInt4981);
				if (this.aClass181_2.anInt5909 != this.anInt4969) {
					throw new RuntimeException();
				}
			} catch (@Pc(75) RuntimeException local75) {
				this.aClass181_2 = null;
				if (this.aClass168_4.method4266()) {
					this.aClass1_Sub2_Sub1_1 = null;
				} else {
					this.aClass1_Sub2_Sub1_1 = this.aClass168_4.method4276((byte) 0, this.anInt4973, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local45 == null) {
					throw new RuntimeException();
				}
				this.aClass181_2 = new Class181(local45, this.anInt4981);
			} catch (@Pc(118) RuntimeException local118) {
				this.aClass168_4.method4268();
				this.aClass181_2 = null;
				if (this.aClass168_4.method4266()) {
					this.aClass1_Sub2_Sub1_1 = null;
				} else {
					this.aClass1_Sub2_Sub1_1 = this.aClass168_4.method4276((byte) 0, this.anInt4973, true, 255);
				}
				return null;
			}
			if (this.aClass159_3 != null) {
				this.aClass179_3.method4528(this.aClass159_3, this.anInt4973, local45);
			}
		}
		this.aClass1_Sub2_Sub1_1 = null;
		if (this.aClass159_4 != null) {
			this.aByteArray78 = new byte[this.aClass181_2.anInt5906];
			this.anInt4978 = 0;
		}
		return this.aClass181_2;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I")
	public int method3825() {
		if (this.method3816() == null) {
			return this.aClass1_Sub2_Sub1_1 == null ? 0 : this.aClass1_Sub2_Sub1_1.method2547();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	public void method3826() {
		if (this.aClass69_23 != null) {
			if (this.method3816() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class1 local30;
			@Pc(37) int local37;
			if (this.aBoolean386) {
				local25 = true;
				for (local30 = this.aClass69_23.method1636(); local30 != null; local30 = this.aClass69_23.method1631()) {
					local37 = (int) local30.aLong202;
					if (this.aByteArray78[local37] == 0) {
						this.method3828(1, local37);
					}
					if (this.aByteArray78[local37] == 0) {
						local25 = false;
					} else {
						local30.method4534();
					}
				}
				while (this.aClass181_2.anIntArray695.length > this.anInt4986) {
					if (this.aClass181_2.anIntArray695[this.anInt4986] == 0) {
						this.anInt4986++;
					} else {
						if (this.aClass179_3.anInt5880 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray78[this.anInt4986] == 0) {
							this.method3828(1, this.anInt4986);
						}
						if (this.aByteArray78[this.anInt4986] == 0) {
							local30 = new Class1();
							local25 = false;
							local30.aLong202 = this.anInt4986;
							this.aClass69_23.method1628(local30);
						}
						this.anInt4986++;
					}
				}
				if (local25) {
					this.anInt4986 = 0;
					this.aBoolean386 = false;
				}
			} else if (this.aBoolean385) {
				local25 = true;
				for (local30 = this.aClass69_23.method1636(); local30 != null; local30 = this.aClass69_23.method1631()) {
					local37 = (int) local30.aLong202;
					if (this.aByteArray78[local37] != 1) {
						this.method3828(2, local37);
					}
					if (this.aByteArray78[local37] == 1) {
						local30.method4534();
					} else {
						local25 = false;
					}
				}
				while (this.anInt4986 < this.aClass181_2.anIntArray695.length) {
					if (this.aClass181_2.anIntArray695[this.anInt4986] == 0) {
						this.anInt4986++;
					} else {
						if (this.aClass168_4.method4281()) {
							local25 = false;
							break;
						}
						if (this.aByteArray78[this.anInt4986] != 1) {
							this.method3828(2, this.anInt4986);
						}
						if (this.aByteArray78[this.anInt4986] != 1) {
							local25 = false;
							local30 = new Class1();
							local30.aLong202 = this.anInt4986;
							this.aClass69_23.method1628(local30);
						}
						this.anInt4986++;
					}
				}
				if (local25) {
					this.anInt4986 = 0;
					this.aBoolean385 = false;
				}
			} else {
				this.aClass69_23 = null;
			}
		}
		if (!this.aBoolean387 || this.aLong155 > Static252.method3964()) {
			return;
		}
		for (@Pc(331) Class1_Sub2_Sub1 local331 = (Class1_Sub2_Sub1) this.aClass22_17.method640(); local331 != null; local331 = (Class1_Sub2_Sub1) this.aClass22_17.method637()) {
			if (!local331.aBoolean233) {
				if (local331.aBoolean232) {
					if (!local331.aBoolean231) {
						throw new RuntimeException();
					}
					local331.method4534();
				} else {
					local331.aBoolean232 = true;
				}
			}
		}
		this.aLong155 = Static252.method3964() + 1000L;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I")
	public int method3827() {
		return this.aClass181_2 == null ? 0 : this.aClass181_2.anInt5900;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Lclient!hl;")
	private Class1_Sub2_Sub1 method3828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub2_Sub1 local13 = (Class1_Sub2_Sub1) this.aClass22_17.method633((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean231 && local13.aBoolean233) {
			local13.method4534();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass159_4 == null || this.aByteArray78[arg1] == -1) {
					if (this.aClass168_4.method4266()) {
						return null;
					}
					local13 = this.aClass168_4.method4276((byte) 2, arg1, true, this.anInt4973);
				} else {
					local13 = this.aClass179_3.method4526(arg1, this.aClass159_4);
				}
			} else if (arg0 == 1) {
				if (this.aClass159_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass179_3.method4530(arg1, this.aClass159_4);
			} else if (arg0 == 2) {
				if (this.aClass159_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray78[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass168_4.method4281()) {
					return null;
				}
				local13 = this.aClass168_4.method4276((byte) 2, arg1, false, this.anInt4973);
			} else {
				throw new RuntimeException();
			}
			this.aClass22_17.method643((long) arg1, local13);
		}
		if (local13.aBoolean233) {
			return null;
		}
		@Pc(166) byte[] local166 = local13.method2546();
		@Pc(194) int local194;
		@Pc(308) Class1_Sub2_Sub1_Sub1 local308;
		if (!(local13 instanceof Class1_Sub2_Sub1_Sub2)) {
			try {
				if (local166 == null || local166.length <= 2) {
					throw new RuntimeException();
				}
				Static93.aCRC32_1.reset();
				Static93.aCRC32_1.update(local166, 0, local166.length - 2);
				local194 = (int) Static93.aCRC32_1.getValue();
				if (this.aClass181_2.anIntArray698[arg1] != local194) {
					throw new RuntimeException();
				}
				this.aClass168_4.anInt5582 = 0;
				this.aClass168_4.anInt5583 = 0;
			} catch (@Pc(371) RuntimeException local371) {
				this.aClass168_4.method4268();
				local13.method4534();
				if (local13.aBoolean231 && !this.aClass168_4.method4266()) {
					local308 = this.aClass168_4.method4276((byte) 2, arg1, true, this.anInt4973);
					this.aClass22_17.method643((long) arg1, local308);
				}
				return null;
			}
			local166[local166.length - 2] = (byte) (this.aClass181_2.anIntArray694[arg1] >>> 8);
			local166[local166.length - 1] = (byte) this.aClass181_2.anIntArray694[arg1];
			if (this.aClass159_4 != null) {
				this.aClass179_3.method4528(this.aClass159_4, arg1, local166);
				if (this.aByteArray78[arg1] != 1) {
					this.anInt4978++;
					this.aByteArray78[arg1] = 1;
				}
			}
			if (!local13.aBoolean231) {
				local13.method4534();
			}
			return local13;
		}
		try {
			if (local166 == null || local166.length <= 2) {
				throw new RuntimeException();
			}
			Static93.aCRC32_1.reset();
			Static93.aCRC32_1.update(local166, 0, local166.length - 2);
			local194 = (int) Static93.aCRC32_1.getValue();
			if (local194 != this.aClass181_2.anIntArray698[arg1]) {
				throw new RuntimeException();
			}
			@Pc(225) int local225 = (local166[local166.length - 1] & 0xFF) + ((local166[local166.length - 2] & 0xFF) << 8);
			if (local225 != (this.aClass181_2.anIntArray694[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray78[arg1] != 1) {
				if (this.aByteArray78[arg1] != 0) {
				}
				this.anInt4978++;
				this.aByteArray78[arg1] = 1;
			}
			if (!local13.aBoolean231) {
				local13.method4534();
			}
			return local13;
		} catch (@Pc(281) Exception local281) {
			this.aByteArray78[arg1] = -1;
			local13.method4534();
			if (local13.aBoolean231 && !this.aClass168_4.method4266()) {
				local308 = this.aClass168_4.method4276((byte) 2, arg1, true, this.anInt4973);
				this.aClass22_17.method643((long) arg1, local308);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	public void method3831() {
		if (this.aClass159_4 != null) {
			this.aBoolean385 = true;
			if (this.aClass69_23 == null) {
				this.aClass69_23 = new Class69();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public void method3832() {
		if (this.aClass69_23 == null || this.method3816() == null) {
			return;
		}
		for (@Pc(21) Class1 local21 = this.aClass69_24.method1636(); local21 != null; local21 = this.aClass69_24.method1631()) {
			@Pc(36) int local36 = (int) local21.aLong202;
			if (local36 < 0 || local36 >= this.aClass181_2.anInt5906 || this.aClass181_2.anIntArray695[local36] == 0) {
				local21.method4534();
			} else {
				if (this.aByteArray78[local36] == 0) {
					this.method3828(1, local36);
				}
				if (this.aByteArray78[local36] == -1) {
					this.method3828(2, local36);
				}
				if (this.aByteArray78[local36] == 1) {
					local21.method4534();
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
	@Override
	public int method3813(@OriginalArg(1) int arg0) {
		@Pc(7) Class1_Sub2_Sub1 local7 = (Class1_Sub2_Sub1) this.aClass22_17.method633((long) arg0);
		return local7 == null ? 0 : local7.method2547();
	}
}
