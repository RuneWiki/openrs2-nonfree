import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!wv;")
	private Class272 aClass272_2;

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!ft", name = "H", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
	private int anInt2218 = 0;

	@OriginalMember(owner = "client!ft", name = "A", descriptor = "Lclient!qh;")
	private final Class199 aClass199_70 = new Class199(16);

	@OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
	private int anInt2228 = 0;

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "Lclient!sr;")
	private final Class227 aClass227_17 = new Class227();

	@OriginalMember(owner = "client!ft", name = "L", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!ft", name = "E", descriptor = "Lclient!vs;")
	private final Class257 aClass257_2;

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
	private final int anInt2221;

	@OriginalMember(owner = "client!ft", name = "G", descriptor = "Z")
	private boolean aBoolean251;

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "Lclient!sr;")
	private Class227 aClass227_16;

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "I")
	private final int anInt2223;

	@OriginalMember(owner = "client!ft", name = "M", descriptor = "Z")
	private final boolean aBoolean253;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "Lclient!sn;")
	private final Class224 aClass224_2;

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "Lclient!qj;")
	private final Class200 aClass200_2;

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "Lclient!vs;")
	private final Class257 aClass257_1;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
	private final int anInt2210;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "Lclient!hi;")
	private Class1_Sub5_Sub9 aClass1_Sub5_Sub9_1;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILclient!vs;Lclient!vs;Lclient!sn;Lclient!qj;IIZ)V")
	public Class85_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(2) Class257 arg2, @OriginalArg(3) Class224 arg3, @OriginalArg(4) Class200 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass257_2 = arg1;
		this.anInt2221 = arg0;
		if (this.aClass257_2 == null) {
			this.aBoolean251 = false;
		} else {
			this.aBoolean251 = true;
			this.aClass227_16 = new Class227();
		}
		this.anInt2223 = arg6;
		this.aBoolean253 = arg7;
		this.aClass224_2 = arg3;
		this.aClass200_2 = arg4;
		this.aClass257_1 = arg2;
		this.anInt2210 = arg5;
		if (this.aClass257_1 != null) {
			this.aClass1_Sub5_Sub9_1 = this.aClass200_2.method4425(this.anInt2221, this.aClass257_1);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Lclient!wv;")
	@Override
	public Class272 method1893() {
		if (this.aClass272_2 != null) {
			return this.aClass272_2;
		}
		if (this.aClass1_Sub5_Sub9_1 == null) {
			if (this.aClass224_2.method4931()) {
				return null;
			}
			this.aClass1_Sub5_Sub9_1 = this.aClass224_2.method4923(this.anInt2221, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub5_Sub9_1.aBoolean740) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass1_Sub5_Sub9_1.method5312();
		if (this.aClass1_Sub5_Sub9_1 instanceof Class1_Sub5_Sub9_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass272_2 = new Class272(local43, this.anInt2210);
				if (this.anInt2223 != this.aClass272_2.anInt7541) {
					throw new RuntimeException();
				}
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass272_2 = null;
				if (this.aClass224_2.method4931()) {
					this.aClass1_Sub5_Sub9_1 = null;
				} else {
					this.aClass1_Sub5_Sub9_1 = this.aClass224_2.method4923(this.anInt2221, 255, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass272_2 = new Class272(local43, this.anInt2210);
			} catch (@Pc(114) RuntimeException local114) {
				this.aClass224_2.method4933();
				this.aClass272_2 = null;
				if (this.aClass224_2.method4931()) {
					this.aClass1_Sub5_Sub9_1 = null;
				} else {
					this.aClass1_Sub5_Sub9_1 = this.aClass224_2.method4923(this.anInt2221, 255, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass257_1 != null) {
				this.aClass200_2.method4423(this.anInt2221, local43, this.aClass257_1);
			}
		}
		if (this.aClass257_2 != null) {
			this.anInt2218 = 0;
			this.aByteArray32 = new byte[this.aClass272_2.anInt7538];
		}
		this.aClass1_Sub5_Sub9_1 = null;
		return this.aClass272_2;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)I")
	public int method1900() {
		if (this.method1893() == null) {
			return this.aClass1_Sub5_Sub9_1 == null ? 0 : this.aClass1_Sub5_Sub9_1.method5308();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method1897(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub5_Sub9 local9 = this.method1908(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5312();
			local9.method5915();
			return local17;
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)I")
	public int method1901() {
		return this.anInt2218;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)V")
	public void method1902() {
		if (this.aClass257_2 != null) {
			this.aBoolean252 = true;
			if (this.aClass227_16 == null) {
				this.aClass227_16 = new Class227();
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(B)I")
	public int method1903() {
		return this.aClass272_2 == null ? 0 : this.aClass272_2.anInt7537;
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(B)V")
	public void method1904() {
		if (this.aClass227_16 == null || this.method1893() == null) {
			return;
		}
		for (@Pc(19) Class1 local19 = this.aClass227_17.method4967(); local19 != null; local19 = this.aClass227_17.method4973()) {
			@Pc(25) int local25 = (int) local19.aLong230;
			if (local25 < 0 || local25 >= this.aClass272_2.anInt7538 || this.aClass272_2.anIntArray516[local25] == 0) {
				local19.method5915();
			} else {
				if (this.aByteArray32[local25] == 0) {
					this.method1908(1, local25);
				}
				if (this.aByteArray32[local25] == -1) {
					this.method1908(2, local25);
				}
				if (this.aByteArray32[local25] == 1) {
					local19.method5915();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IB)V")
	@Override
	public void method1894(@OriginalArg(0) int arg0) {
		if (this.aClass257_2 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass227_17.method4967(); local14 != null; local14 = this.aClass227_17.method4973()) {
			if (local14.aLong230 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class1 local38 = new Class1();
		local38.aLong230 = arg0;
		this.aClass227_17.method4972(local38);
	}

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "(B)V")
	public void method1906() {
		if (this.aClass227_16 != null) {
			if (this.method1893() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class1 local30;
			@Pc(36) int local36;
			@Pc(121) Class1 local121;
			if (this.aBoolean251) {
				local25 = true;
				for (local30 = this.aClass227_16.method4967(); local30 != null; local30 = this.aClass227_16.method4973()) {
					local36 = (int) local30.aLong230;
					if (this.aByteArray32[local36] == 0) {
						this.method1908(1, local36);
					}
					if (this.aByteArray32[local36] == 0) {
						local25 = false;
					} else {
						local30.method5915();
					}
				}
				while (this.aClass272_2.anIntArray516.length > this.anInt2228) {
					if (this.aClass272_2.anIntArray516[this.anInt2228] == 0) {
						this.anInt2228++;
					} else {
						if (this.aClass200_2.anInt5622 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray32[this.anInt2228] == 0) {
							this.method1908(1, this.anInt2228);
						}
						if (this.aByteArray32[this.anInt2228] == 0) {
							local121 = new Class1();
							local121.aLong230 = this.anInt2228;
							this.aClass227_16.method4972(local121);
							local25 = false;
						}
						this.anInt2228++;
					}
				}
				if (local25) {
					this.aBoolean251 = false;
					this.anInt2228 = 0;
				}
			} else if (this.aBoolean252) {
				local25 = true;
				for (local30 = this.aClass227_16.method4967(); local30 != null; local30 = this.aClass227_16.method4973()) {
					local36 = (int) local30.aLong230;
					if (this.aByteArray32[local36] != 1) {
						this.method1908(2, local36);
					}
					if (this.aByteArray32[local36] == 1) {
						local30.method5915();
					} else {
						local25 = false;
					}
				}
				while (this.anInt2228 < this.aClass272_2.anIntArray516.length) {
					if (this.aClass272_2.anIntArray516[this.anInt2228] == 0) {
						this.anInt2228++;
					} else {
						if (this.aClass224_2.method4924()) {
							local25 = false;
							break;
						}
						if (this.aByteArray32[this.anInt2228] != 1) {
							this.method1908(2, this.anInt2228);
						}
						if (this.aByteArray32[this.anInt2228] != 1) {
							local121 = new Class1();
							local121.aLong230 = this.anInt2228;
							this.aClass227_16.method4972(local121);
							local25 = false;
						}
						this.anInt2228++;
					}
				}
				if (local25) {
					this.aBoolean252 = false;
					this.anInt2228 = 0;
				}
			} else {
				this.aClass227_16 = null;
			}
		}
		if (!this.aBoolean253 || this.aLong67 > Static27.method359()) {
			return;
		}
		for (@Pc(321) Class1_Sub5_Sub9 local321 = (Class1_Sub5_Sub9) this.aClass199_70.method4392(); local321 != null; local321 = (Class1_Sub5_Sub9) this.aClass199_70.method4393()) {
			if (!local321.aBoolean740) {
				if (local321.aBoolean742) {
					if (!local321.aBoolean741) {
						throw new RuntimeException();
					}
					local321.method5915();
				} else {
					local321.aBoolean742 = true;
				}
			}
		}
		this.aLong67 = Static27.method359() + 1000L;
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I")
	public int method1907() {
		if (this.aClass272_2 == null) {
			return 0;
		} else if (this.aBoolean251) {
			@Pc(28) Class1 local28 = this.aClass227_16.method4967();
			return local28 == null ? 0 : (int) local28.aLong230;
		} else {
			return this.aClass272_2.anInt7537;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBI)Lclient!hi;")
	private Class1_Sub5_Sub9 method1908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub5_Sub9 local13 = (Class1_Sub5_Sub9) this.aClass199_70.method4387((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean741 && local13.aBoolean740) {
			local13.method5915();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass257_2 == null || this.aByteArray32[arg1] == -1) {
					if (this.aClass224_2.method4931()) {
						return null;
					}
					local13 = this.aClass224_2.method4923(arg1, this.anInt2221, (byte) 2, true);
				} else {
					local13 = this.aClass200_2.method4425(arg1, this.aClass257_2);
				}
			} else if (arg0 == 1) {
				if (this.aClass257_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass200_2.method4422(this.aClass257_2, arg1);
			} else if (arg0 == 2) {
				if (this.aClass257_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray32[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass224_2.method4924()) {
					return null;
				}
				local13 = this.aClass224_2.method4923(arg1, this.anInt2221, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass199_70.method4383((long) arg1, local13);
		}
		if (local13.aBoolean740) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.method5312();
		@Pc(191) int local191;
		@Pc(295) Class1_Sub5_Sub9_Sub2 local295;
		if (!(local13 instanceof Class1_Sub5_Sub9_Sub1)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static354.aCRC32_1.reset();
				Static354.aCRC32_1.update(local162, 0, local162.length - 2);
				local191 = (int) Static354.aCRC32_1.getValue();
				if (this.aClass272_2.anIntArray517[arg1] != local191) {
					throw new RuntimeException();
				}
				this.aClass224_2.anInt6268 = 0;
				this.aClass224_2.anInt6269 = 0;
			} catch (@Pc(355) RuntimeException local355) {
				this.aClass224_2.method4933();
				local13.method5915();
				if (local13.aBoolean741 && !this.aClass224_2.method4931()) {
					local295 = this.aClass224_2.method4923(arg1, this.anInt2221, (byte) 2, true);
					this.aClass199_70.method4383((long) arg1, local295);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass272_2.anIntArray515[arg1] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass272_2.anIntArray515[arg1];
			if (this.aClass257_2 != null) {
				this.aClass200_2.method4423(arg1, local162, this.aClass257_2);
				if (this.aByteArray32[arg1] != 1) {
					this.anInt2218++;
					this.aByteArray32[arg1] = 1;
				}
			}
			if (!local13.aBoolean741) {
				local13.method5915();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static354.aCRC32_1.reset();
			Static354.aCRC32_1.update(local162, 0, local162.length - 2);
			local191 = (int) Static354.aCRC32_1.getValue();
			if (local191 != this.aClass272_2.anIntArray517[arg1]) {
				throw new RuntimeException();
			}
			@Pc(226) int local226 = (local162[local162.length - 1] & 0xFF) + ((local162[local162.length - 2] & 0xFF) << 8);
			if ((this.aClass272_2.anIntArray515[arg1] & 0xFFFF) != local226) {
				throw new RuntimeException();
			}
			if (this.aByteArray32[arg1] != 1) {
				this.anInt2218++;
				this.aByteArray32[arg1] = 1;
			}
			if (!local13.aBoolean741) {
				local13.method5915();
			}
			return local13;
		} catch (@Pc(269) Exception local269) {
			this.aByteArray32[arg1] = -1;
			local13.method5915();
			if (local13.aBoolean741 && !this.aClass224_2.method4931()) {
				local295 = this.aClass224_2.method4923(arg1, this.anInt2221, (byte) 2, true);
				this.aClass199_70.method4383((long) arg1, local295);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(IB)I")
	@Override
	public int method1896(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub5_Sub9 local11 = (Class1_Sub5_Sub9) this.aClass199_70.method4387((long) arg0);
		return local11 == null ? 0 : local11.method5308();
	}
}
