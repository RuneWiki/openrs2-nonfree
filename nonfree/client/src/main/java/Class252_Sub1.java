import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class252_Sub1 extends Class252 {

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "Lclient!km;")
	private Class191 aClass191_2;

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "[B")
	private byte[] aByteArray106;

	@OriginalMember(owner = "client!ww", name = "P", descriptor = "Z")
	private boolean aBoolean715;

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
	private int anInt9664 = 0;

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "Lclient!wh;")
	private final Class356 aClass356_44 = new Class356(16);

	@OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
	private int anInt9686 = 0;

	@OriginalMember(owner = "client!ww", name = "K", descriptor = "Lclient!wo;")
	private final Class361 aClass361_103 = new Class361();

	@OriginalMember(owner = "client!ww", name = "R", descriptor = "J")
	private long aLong426 = 0L;

	@OriginalMember(owner = "client!ww", name = "D", descriptor = "I")
	private final int anInt9681;

	@OriginalMember(owner = "client!ww", name = "E", descriptor = "Lclient!cr;")
	private final Class57 aClass57_5;

	@OriginalMember(owner = "client!ww", name = "L", descriptor = "Z")
	private boolean aBoolean714;

	@OriginalMember(owner = "client!ww", name = "O", descriptor = "Lclient!wo;")
	private Class361 aClass361_104;

	@OriginalMember(owner = "client!ww", name = "z", descriptor = "Lclient!cr;")
	private final Class57 aClass57_4;

	@OriginalMember(owner = "client!ww", name = "A", descriptor = "Lclient!gb;")
	private final Class113 aClass113_3;

	@OriginalMember(owner = "client!ww", name = "I", descriptor = "I")
	private final int anInt9684;

	@OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
	private final int anInt9672;

	@OriginalMember(owner = "client!ww", name = "F", descriptor = "Lclient!qt;")
	private final Class274 aClass274_3;

	@OriginalMember(owner = "client!ww", name = "Q", descriptor = "Z")
	private final boolean aBoolean716;

	@OriginalMember(owner = "client!ww", name = "s", descriptor = "[B")
	private final byte[] aByteArray107;

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "Lclient!kw;")
	private Class1_Sub3_Sub11 aClass1_Sub3_Sub11_1;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(ILclient!cr;Lclient!cr;Lclient!gb;Lclient!qt;I[BIZ)V")
	public Class252_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class274 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt9681 = arg0;
		this.aClass57_5 = arg1;
		if (this.aClass57_5 == null) {
			this.aBoolean714 = false;
		} else {
			this.aBoolean714 = true;
			this.aClass361_104 = new Class361();
		}
		this.aClass57_4 = arg2;
		this.aClass113_3 = arg3;
		this.anInt9684 = arg5;
		this.anInt9672 = arg7;
		this.aClass274_3 = arg4;
		this.aBoolean716 = arg8;
		this.aByteArray107 = arg6;
		if (this.aClass57_4 != null) {
			this.aClass1_Sub3_Sub11_1 = this.aClass274_3.method6343(this.anInt9681, this.aClass57_4);
		}
	}

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "(I)V")
	public void method7928() {
		if (this.aClass57_5 != null) {
			this.aBoolean715 = true;
			if (this.aClass361_104 == null) {
				this.aClass361_104 = new Class361();
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)Lclient!km;")
	@Override
	public Class191 method7921() {
		if (this.aClass191_2 != null) {
			return this.aClass191_2;
		}
		if (this.aClass1_Sub3_Sub11_1 == null) {
			if (this.aClass113_3.method2485()) {
				return null;
			}
			this.aClass1_Sub3_Sub11_1 = this.aClass113_3.method2486(this.anInt9681, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub3_Sub11_1.aBoolean684) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass1_Sub3_Sub11_1.method7748();
		if (this.aClass1_Sub3_Sub11_1 instanceof Class1_Sub3_Sub11_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass191_2 = new Class191(local43, this.anInt9684, this.aByteArray107);
				if (this.aClass191_2.anInt5089 != this.anInt9672) {
					throw new RuntimeException();
				}
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass191_2 = null;
				if (this.aClass113_3.method2485()) {
					this.aClass1_Sub3_Sub11_1 = null;
				} else {
					this.aClass1_Sub3_Sub11_1 = this.aClass113_3.method2486(this.anInt9681, 255, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass191_2 = new Class191(local43, this.anInt9684, this.aByteArray107);
			} catch (@Pc(118) RuntimeException local118) {
				this.aClass113_3.method2487();
				this.aClass191_2 = null;
				if (this.aClass113_3.method2485()) {
					this.aClass1_Sub3_Sub11_1 = null;
				} else {
					this.aClass1_Sub3_Sub11_1 = this.aClass113_3.method2486(this.anInt9681, 255, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass57_4 != null) {
				this.aClass274_3.method6346(this.anInt9681, this.aClass57_4, local43);
			}
		}
		if (this.aClass57_5 != null) {
			this.anInt9664 = 0;
			this.aByteArray106 = new byte[this.aClass191_2.anInt5084];
		}
		this.aClass1_Sub3_Sub11_1 = null;
		return this.aClass191_2;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)I")
	public int method7930() {
		return this.anInt9664;
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)I")
	public int method7931() {
		if (this.method7921() == null) {
			return this.aClass1_Sub3_Sub11_1 == null ? 0 : this.aClass1_Sub3_Sub11_1.method7746();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method7922(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub3_Sub11 local17 = this.method7933(arg0, 0);
		if (local17 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local17.method7748();
			local17.method7878();
			return local25;
		}
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(IB)V")
	@Override
	public void method7926(@OriginalArg(0) int arg0) {
		if (this.aClass57_5 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass361_103.method7854(); local14 != null; local14 = this.aClass361_103.method7853()) {
			if (local14.aLong425 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class1 local38 = new Class1();
		local38.aLong425 = arg0;
		this.aClass361_103.method7855(local38);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BII)Lclient!kw;")
	private Class1_Sub3_Sub11 method7933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub3_Sub11 local13 = (Class1_Sub3_Sub11) this.aClass356_44.method7796((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean686 && local13.aBoolean684) {
			local13.method7878();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass57_5 == null || this.aByteArray106[arg0] == -1) {
					if (this.aClass113_3.method2485()) {
						return null;
					}
					local13 = this.aClass113_3.method2486(arg0, this.anInt9681, (byte) 2, true);
				} else {
					local13 = this.aClass274_3.method6343(arg0, this.aClass57_5);
				}
			} else if (arg1 == 1) {
				if (this.aClass57_5 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass274_3.method6344(arg0, this.aClass57_5);
			} else if (arg1 == 2) {
				if (this.aClass57_5 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray106[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass113_3.method2481()) {
					return null;
				}
				local13 = this.aClass113_3.method2486(arg0, this.anInt9681, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass356_44.method7800((long) arg0, local13);
		}
		if (local13.aBoolean684) {
			return null;
		}
		@Pc(161) byte[] local161 = local13.method7748();
		@Pc(190) int local190;
		@Pc(217) byte[] local217;
		@Pc(226) byte[] local226;
		@Pc(228) int local228;
		@Pc(334) Class1_Sub3_Sub11_Sub2 local334;
		if (!(local13 instanceof Class1_Sub3_Sub11_Sub1)) {
			try {
				label157: {
					if (local161 != null && local161.length > 2) {
						Static314.aCRC32_1.reset();
						Static314.aCRC32_1.update(local161, 0, local161.length - 2);
						local190 = (int) Static314.aCRC32_1.getValue();
						if (this.aClass191_2.anIntArray305[arg0] != local190) {
							throw new RuntimeException();
						}
						if (this.aClass191_2.aByteArrayArray17 == null || this.aClass191_2.aByteArrayArray17[arg0] == null) {
							break label157;
						}
						local217 = this.aClass191_2.aByteArrayArray17[arg0];
						local226 = Static149.method2389(local161.length - 2, local161, 0);
						local228 = 0;
						while (true) {
							if (local228 >= 64) {
								break label157;
							}
							if (local217[local228] != local226[local228]) {
								throw new RuntimeException();
							}
							local228++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass113_3.anInt2963 = 0;
				this.aClass113_3.anInt2962 = 0;
			} catch (@Pc(446) RuntimeException local446) {
				this.aClass113_3.method2487();
				local13.method7878();
				if (local13.aBoolean686 && !this.aClass113_3.method2485()) {
					local334 = this.aClass113_3.method2486(arg0, this.anInt9681, (byte) 2, true);
					this.aClass356_44.method7800((long) arg0, local334);
				}
				return null;
			}
			local161[local161.length - 2] = (byte) (this.aClass191_2.anIntArray309[arg0] >>> 8);
			local161[local161.length - 1] = (byte) this.aClass191_2.anIntArray309[arg0];
			if (this.aClass57_5 != null) {
				this.aClass274_3.method6346(arg0, this.aClass57_5, local161);
				if (this.aByteArray106[arg0] != 1) {
					this.anInt9664++;
					this.aByteArray106[arg0] = 1;
				}
			}
			if (!local13.aBoolean686) {
				local13.method7878();
			}
			return local13;
		}
		try {
			if (local161 == null || local161.length <= 2) {
				throw new RuntimeException();
			}
			Static314.aCRC32_1.reset();
			Static314.aCRC32_1.update(local161, 0, local161.length - 2);
			local190 = (int) Static314.aCRC32_1.getValue();
			if (local190 != this.aClass191_2.anIntArray305[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass191_2.aByteArrayArray17 != null && this.aClass191_2.aByteArrayArray17[arg0] != null) {
				local217 = this.aClass191_2.aByteArrayArray17[arg0];
				local226 = Static149.method2389(local161.length - 2, local161, 0);
				for (local228 = 0; local228 < 64; local228++) {
					if (local217[local228] != local226[local228]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(265) int local265 = (local161[local161.length - 1] & 0xFF) + ((local161[local161.length - 2] & 0xFF) << 8);
			if ((this.aClass191_2.anIntArray309[arg0] & 0xFFFF) != local265) {
				throw new RuntimeException();
			}
			if (this.aByteArray106[arg0] != 1) {
				this.anInt9664++;
				this.aByteArray106[arg0] = 1;
			}
			if (!local13.aBoolean686) {
				local13.method7878();
			}
			return local13;
		} catch (@Pc(308) Exception local308) {
			this.aByteArray106[arg0] = -1;
			local13.method7878();
			if (local13.aBoolean686 && !this.aClass113_3.method2485()) {
				local334 = this.aClass113_3.method2486(arg0, this.anInt9681, (byte) 2, true);
				this.aClass356_44.method7800((long) arg0, local334);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IB)I")
	@Override
	public int method7923(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub3_Sub11 local11 = (Class1_Sub3_Sub11) this.aClass356_44.method7796((long) arg0);
		return local11 == null ? 0 : local11.method7746();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)V")
	public void method7935() {
		if (this.aClass361_104 != null) {
			if (this.method7921() == null) {
				return;
			}
			@Pc(24) boolean local24;
			@Pc(29) Class1 local29;
			@Pc(35) int local35;
			@Pc(119) Class1 local119;
			if (this.aBoolean714) {
				local24 = true;
				for (local29 = this.aClass361_104.method7854(); local29 != null; local29 = this.aClass361_104.method7853()) {
					local35 = (int) local29.aLong425;
					if (this.aByteArray106[local35] == 0) {
						this.method7933(local35, 1);
					}
					if (this.aByteArray106[local35] == 0) {
						local24 = false;
					} else {
						local29.method7878();
					}
				}
				while (this.aClass191_2.anIntArray308.length > this.anInt9686) {
					if (this.aClass191_2.anIntArray308[this.anInt9686] == 0) {
						this.anInt9686++;
					} else {
						if (this.aClass274_3.anInt7717 >= 250) {
							local24 = false;
							break;
						}
						if (this.aByteArray106[this.anInt9686] == 0) {
							this.method7933(this.anInt9686, 1);
						}
						if (this.aByteArray106[this.anInt9686] == 0) {
							local119 = new Class1();
							local119.aLong425 = this.anInt9686;
							local24 = false;
							this.aClass361_104.method7855(local119);
						}
						this.anInt9686++;
					}
				}
				if (local24) {
					this.aBoolean714 = false;
					this.anInt9686 = 0;
				}
			} else if (this.aBoolean715) {
				local24 = true;
				for (local29 = this.aClass361_104.method7854(); local29 != null; local29 = this.aClass361_104.method7853()) {
					local35 = (int) local29.aLong425;
					if (this.aByteArray106[local35] != 1) {
						this.method7933(local35, 2);
					}
					if (this.aByteArray106[local35] == 1) {
						local29.method7878();
					} else {
						local24 = false;
					}
				}
				while (this.anInt9686 < this.aClass191_2.anIntArray308.length) {
					if (this.aClass191_2.anIntArray308[this.anInt9686] == 0) {
						this.anInt9686++;
					} else {
						if (this.aClass113_3.method2481()) {
							local24 = false;
							break;
						}
						if (this.aByteArray106[this.anInt9686] != 1) {
							this.method7933(this.anInt9686, 2);
						}
						if (this.aByteArray106[this.anInt9686] != 1) {
							local119 = new Class1();
							local119.aLong425 = this.anInt9686;
							local24 = false;
							this.aClass361_104.method7855(local119);
						}
						this.anInt9686++;
					}
				}
				if (local24) {
					this.anInt9686 = 0;
					this.aBoolean715 = false;
				}
			} else {
				this.aClass361_104 = null;
			}
		}
		if (!this.aBoolean716 || Static255.method4035() < this.aLong426) {
			return;
		}
		for (@Pc(318) Class1_Sub3_Sub11 local318 = (Class1_Sub3_Sub11) this.aClass356_44.method7792(); local318 != null; local318 = (Class1_Sub3_Sub11) this.aClass356_44.method7795()) {
			if (!local318.aBoolean684) {
				if (local318.aBoolean685) {
					if (!local318.aBoolean686) {
						throw new RuntimeException();
					}
					local318.method7878();
				} else {
					local318.aBoolean685 = true;
				}
			}
		}
		this.aLong426 = Static255.method4035() + 1000L;
	}

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "(I)V")
	public void method7936() {
		if (this.aClass361_104 == null || this.method7921() == null) {
			return;
		}
		for (@Pc(21) Class1 local21 = this.aClass361_103.method7854(); local21 != null; local21 = this.aClass361_103.method7853()) {
			@Pc(27) int local27 = (int) local21.aLong425;
			if (local27 < 0 || this.aClass191_2.anInt5084 <= local27 || this.aClass191_2.anIntArray308[local27] == 0) {
				local21.method7878();
			} else {
				if (this.aByteArray106[local27] == 0) {
					this.method7933(local27, 1);
				}
				if (this.aByteArray106[local27] == -1) {
					this.method7933(local27, 2);
				}
				if (this.aByteArray106[local27] == 1) {
					local21.method7878();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)I")
	public int method7938() {
		if (this.aClass191_2 == null) {
			return 0;
		} else if (this.aBoolean714) {
			@Pc(20) Class1 local20 = this.aClass361_104.method7854();
			return local20 == null ? 0 : (int) local20.aLong425;
		} else {
			return this.aClass191_2.anInt5090;
		}
	}

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)I")
	public int method7939() {
		return this.aClass191_2 == null ? 0 : this.aClass191_2.anInt5090;
	}
}
