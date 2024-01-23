import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "Lclient!fo;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	private int anInt5787 = 0;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ic;")
	private Class85 aClass85_27 = new Class85(16);

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	private int anInt5806 = 0;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "Lclient!ll;")
	private Class114 aClass114_29 = new Class114();

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!fm;")
	private Class60 aClass60_4;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private int anInt5794;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!ll;")
	private Class114 aClass114_30;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private int anInt5804;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private int anInt5788;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!ja;")
	private Class93 aClass93_3;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!fm;")
	private Class60 aClass60_3;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!en;")
	private Class51 aClass51_3;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!ng;")
	private Class4_Sub3_Sub1 aClass4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILclient!fm;Lclient!fm;Lclient!en;Lclient!ja;IIZ)V")
	public Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) Class93 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass60_4 = arg1;
		this.anInt5794 = arg0;
		if (this.aClass60_4 == null) {
			this.aBoolean395 = false;
		} else {
			this.aBoolean395 = true;
			this.aClass114_30 = new Class114();
		}
		this.anInt5804 = arg6;
		this.aBoolean397 = arg7;
		this.anInt5788 = arg5;
		this.aClass93_3 = arg4;
		this.aClass60_3 = arg2;
		this.aClass51_3 = arg3;
		if (this.aClass60_3 != null) {
			this.aClass4_Sub3_Sub1_1 = this.aClass93_3.method1974(this.aClass60_3, this.anInt5794);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	public int method4697() {
		if (this.aClass61_2 == null) {
			return 0;
		} else if (this.aBoolean395) {
			@Pc(27) Class4 local27 = this.aClass114_30.method2623();
			return local27 == null ? 0 : (int) local27.aLong217;
		} else {
			return this.aClass61_2.anInt1972;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lclient!fo;")
	@Override
	public Class61 method4696() {
		if (this.aClass61_2 != null) {
			return this.aClass61_2;
		}
		if (this.aClass4_Sub3_Sub1_1 == null) {
			if (this.aClass51_3.method1083()) {
				return null;
			}
			this.aClass4_Sub3_Sub1_1 = this.aClass51_3.method1088((byte) 0, 255, true, this.anInt5794);
		}
		if (this.aClass4_Sub3_Sub1_1.aBoolean365) {
			return null;
		}
		@Pc(53) byte[] local53 = this.aClass4_Sub3_Sub1_1.method4389();
		if (this.aClass4_Sub3_Sub1_1 instanceof Class4_Sub3_Sub1_Sub1) {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aClass61_2 = new Class61(local53, this.anInt5788);
				if (this.anInt5804 != this.aClass61_2.anInt1971) {
					throw new RuntimeException();
				}
			} catch (@Pc(149) RuntimeException local149) {
				this.aClass61_2 = null;
				if (this.aClass51_3.method1083()) {
					this.aClass4_Sub3_Sub1_1 = null;
				} else {
					this.aClass4_Sub3_Sub1_1 = this.aClass51_3.method1088((byte) 0, 255, true, this.anInt5794);
				}
				return null;
			}
		} else {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aClass61_2 = new Class61(local53, this.anInt5788);
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass51_3.method1091();
				this.aClass61_2 = null;
				if (this.aClass51_3.method1083()) {
					this.aClass4_Sub3_Sub1_1 = null;
				} else {
					this.aClass4_Sub3_Sub1_1 = this.aClass51_3.method1088((byte) 0, 255, true, this.anInt5794);
				}
				return null;
			}
			if (this.aClass60_3 != null) {
				this.aClass93_3.method1969(this.aClass60_3, local53, this.anInt5794);
			}
		}
		if (this.aClass60_4 != null) {
			this.anInt5787 = 0;
			this.aByteArray72 = new byte[this.aClass61_2.anInt1979];
		}
		this.aClass4_Sub3_Sub1_1 = null;
		return this.aClass61_2;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
	public int method4701() {
		if (this.method4696() == null) {
			return this.aClass4_Sub3_Sub1_1 == null ? 0 : this.aClass4_Sub3_Sub1_1.method4391();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	@Override
	public void method4693(@OriginalArg(0) int arg0) {
		if (this.aClass60_4 == null) {
			return;
		}
		@Pc(22) Class4 local22;
		for (local22 = this.aClass114_29.method2623(); local22 != null; local22 = this.aClass114_29.method2629()) {
			if ((long) arg0 == local22.aLong217) {
				return;
			}
		}
		local22 = new Class4();
		local22.aLong217 = arg0;
		this.aClass114_29.method2625(local22);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	public void method4703() {
		if (this.aClass114_30 == null || this.method4696() == null) {
			return;
		}
		for (@Pc(22) Class4 local22 = this.aClass114_29.method2623(); local22 != null; local22 = this.aClass114_29.method2629()) {
			@Pc(32) int local32 = (int) local22.aLong217;
			if (local32 < 0 || this.aClass61_2.anInt1979 <= local32 || this.aClass61_2.anIntArray154[local32] == 0) {
				local22.method4854();
			} else {
				if (this.aByteArray72[local32] == 0) {
					this.method4709(local32, 1);
				}
				if (this.aByteArray72[local32] == -1) {
					this.method4709(local32, 2);
				}
				if (this.aByteArray72[local32] == 1) {
					local22.method4854();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)I")
	public int method4704() {
		return this.anInt5787;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public void method4705() {
		if (this.aClass60_4 != null) {
			this.aBoolean396 = true;
			if (this.aClass114_30 == null) {
				this.aClass114_30 = new Class114();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)[B")
	@Override
	public byte[] method4694(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub3_Sub1 local9 = this.method4709(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method4389();
			local9.method4854();
			return local25;
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	public int method4708() {
		return this.aClass61_2 == null ? 0 : this.aClass61_2.anInt1972;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	@Override
	public int method4692(@OriginalArg(0) int arg0) {
		@Pc(9) Class4_Sub3_Sub1 local9 = (Class4_Sub3_Sub1) this.aClass85_27.method1845((long) arg0);
		return local9 == null ? 0 : local9.method4391();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lclient!ng;")
	private Class4_Sub3_Sub1 method4709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub3_Sub1 local13 = (Class4_Sub3_Sub1) this.aClass85_27.method1845((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean364 && local13.aBoolean365) {
			local13.method4854();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass60_4 == null || this.aByteArray72[arg0] == -1) {
					if (this.aClass51_3.method1083()) {
						return null;
					}
					local13 = this.aClass51_3.method1088((byte) 2, this.anInt5794, true, arg0);
				} else {
					local13 = this.aClass93_3.method1974(this.aClass60_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass60_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass93_3.method1966(this.aClass60_4, arg0);
			} else if (arg1 == 2) {
				if (this.aClass60_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray72[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass51_3.method1095()) {
					return null;
				}
				local13 = this.aClass51_3.method1088((byte) 2, this.anInt5794, false, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass85_27.method1841(local13, (long) arg0);
		}
		if (local13.aBoolean365) {
			return null;
		}
		@Pc(169) byte[] local169 = local13.method4389();
		@Pc(197) int local197;
		@Pc(244) Class4_Sub3_Sub1_Sub2 local244;
		if (!(local13 instanceof Class4_Sub3_Sub1_Sub1)) {
			try {
				if (local169 == null || local169.length <= 2) {
					throw new RuntimeException();
				}
				Static315.aCRC32_1.reset();
				Static315.aCRC32_1.update(local169, 0, local169.length - 2);
				local197 = (int) Static315.aCRC32_1.getValue();
				if (this.aClass61_2.anIntArray153[arg0] != local197) {
					throw new RuntimeException();
				}
				this.aClass51_3.anInt1358 = 0;
				this.aClass51_3.anInt1359 = 0;
			} catch (@Pc(219) RuntimeException local219) {
				this.aClass51_3.method1091();
				local13.method4854();
				if (local13.aBoolean364 && !this.aClass51_3.method1083()) {
					local244 = this.aClass51_3.method1088((byte) 2, this.anInt5794, true, arg0);
					this.aClass85_27.method1841(local244, (long) arg0);
				}
				return null;
			}
			local169[local169.length - 2] = (byte) (this.aClass61_2.anIntArray157[arg0] >>> 8);
			local169[local169.length - 1] = (byte) this.aClass61_2.anIntArray157[arg0];
			if (this.aClass60_4 != null) {
				this.aClass93_3.method1969(this.aClass60_4, local169, arg0);
				if (this.aByteArray72[arg0] != 1) {
					this.anInt5787++;
					this.aByteArray72[arg0] = 1;
				}
			}
			if (!local13.aBoolean364) {
				local13.method4854();
			}
			return local13;
		}
		try {
			if (local169 == null || local169.length <= 2) {
				throw new RuntimeException();
			}
			Static315.aCRC32_1.reset();
			Static315.aCRC32_1.update(local169, 0, local169.length - 2);
			local197 = (int) Static315.aCRC32_1.getValue();
			if (local197 != this.aClass61_2.anIntArray153[arg0]) {
				throw new RuntimeException();
			}
			@Pc(378) int local378 = (local169[local169.length - 1] & 0xFF) + ((local169[local169.length - 2] & 0xFF) << 8);
			if ((this.aClass61_2.anIntArray157[arg0] & 0xFFFF) != local378) {
				throw new RuntimeException();
			}
			if (this.aByteArray72[arg0] != 1) {
				if (this.aByteArray72[arg0] != 0) {
				}
				this.anInt5787++;
				this.aByteArray72[arg0] = 1;
			}
			if (!local13.aBoolean364) {
				local13.method4854();
			}
			return local13;
		} catch (@Pc(428) Exception local428) {
			this.aByteArray72[arg0] = -1;
			local13.method4854();
			if (local13.aBoolean364 && !this.aClass51_3.method1083()) {
				local244 = this.aClass51_3.method1088((byte) 2, this.anInt5794, true, arg0);
				this.aClass85_27.method1841(local244, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public void method4710() {
		if (this.aClass114_30 != null) {
			if (this.method4696() == null) {
				return;
			}
			@Pc(31) boolean local31;
			@Pc(36) Class4 local36;
			@Pc(42) int local42;
			if (this.aBoolean395) {
				local31 = true;
				for (local36 = this.aClass114_30.method2623(); local36 != null; local36 = this.aClass114_30.method2629()) {
					local42 = (int) local36.aLong217;
					if (this.aByteArray72[local42] == 0) {
						this.method4709(local42, 1);
					}
					if (this.aByteArray72[local42] == 0) {
						local31 = false;
					} else {
						local36.method4854();
					}
				}
				while (this.anInt5806 < this.aClass61_2.anIntArray154.length) {
					if (this.aClass61_2.anIntArray154[this.anInt5806] == 0) {
						this.anInt5806++;
					} else {
						if (this.aClass93_3.anInt2520 >= 250) {
							local31 = false;
							break;
						}
						if (this.aByteArray72[this.anInt5806] == 0) {
							this.method4709(this.anInt5806, 1);
						}
						if (this.aByteArray72[this.anInt5806] == 0) {
							local31 = false;
							local36 = new Class4();
							local36.aLong217 = this.anInt5806;
							this.aClass114_30.method2625(local36);
						}
						this.anInt5806++;
					}
				}
				if (local31) {
					this.aBoolean395 = false;
					this.anInt5806 = 0;
				}
			} else if (this.aBoolean396) {
				local31 = true;
				for (local36 = this.aClass114_30.method2623(); local36 != null; local36 = this.aClass114_30.method2629()) {
					local42 = (int) local36.aLong217;
					if (this.aByteArray72[local42] != 1) {
						this.method4709(local42, 2);
					}
					if (this.aByteArray72[local42] == 1) {
						local36.method4854();
					} else {
						local31 = false;
					}
				}
				while (this.aClass61_2.anIntArray154.length > this.anInt5806) {
					if (this.aClass61_2.anIntArray154[this.anInt5806] == 0) {
						this.anInt5806++;
					} else {
						if (this.aClass51_3.method1095()) {
							local31 = false;
							break;
						}
						if (this.aByteArray72[this.anInt5806] != 1) {
							this.method4709(this.anInt5806, 2);
						}
						if (this.aByteArray72[this.anInt5806] != 1) {
							local31 = false;
							local36 = new Class4();
							local36.aLong217 = this.anInt5806;
							this.aClass114_30.method2625(local36);
						}
						this.anInt5806++;
					}
				}
				if (local31) {
					this.aBoolean396 = false;
					this.anInt5806 = 0;
				}
			} else {
				this.aClass114_30 = null;
			}
		}
		if (!this.aBoolean397 || this.aLong204 > Static101.method1677()) {
			return;
		}
		for (@Pc(335) Class4_Sub3_Sub1 local335 = (Class4_Sub3_Sub1) this.aClass85_27.method1843(); local335 != null; local335 = (Class4_Sub3_Sub1) this.aClass85_27.method1844()) {
			if (!local335.aBoolean365) {
				if (local335.aBoolean366) {
					if (!local335.aBoolean364) {
						throw new RuntimeException();
					}
					local335.method4854();
				} else {
					local335.aBoolean366 = true;
				}
			}
		}
		this.aLong204 = Static101.method1677() + 1000L;
	}
}
