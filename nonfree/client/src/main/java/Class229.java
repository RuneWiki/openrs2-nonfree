import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class229 {

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "[J")
	private long[] aLongArray14;

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "[I")
	private int[] anIntArray473;

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!mda", name = "q", descriptor = "Z")
	public boolean aBoolean467;

	@OriginalMember(owner = "client!mda", name = "s", descriptor = "I")
	public int anInt6603;

	@OriginalMember(owner = "client!mda", name = "A", descriptor = "B")
	public byte aByte104;

	@OriginalMember(owner = "client!mda", name = "G", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!mda", name = "N", descriptor = "[J")
	private long[] aLongArray15;

	@OriginalMember(owner = "client!mda", name = "O", descriptor = "J")
	public long aLong183;

	@OriginalMember(owner = "client!mda", name = "P", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray21;

	@OriginalMember(owner = "client!mda", name = "S", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray22;

	@OriginalMember(owner = "client!mda", name = "T", descriptor = "Lclient!jo;")
	private Class187 aClass187_43;

	@OriginalMember(owner = "client!mda", name = "U", descriptor = "I")
	public int anInt6622;

	@OriginalMember(owner = "client!mda", name = "Y", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
	public int anInt6599 = -1;

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
	public int anInt6613 = 0;

	@OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
	private int anInt6604 = 0;

	@OriginalMember(owner = "client!mda", name = "J", descriptor = "Ljava/lang/String;")
	public String aString69 = null;

	@OriginalMember(owner = "client!mda", name = "Z", descriptor = "I")
	public int anInt6625 = -1;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class229(@OriginalArg(0) Class14_Sub29 arg0) {
		this.method5432(arg0);
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
	private Class229() {
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIBI)I")
	public int method5418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		return (local26 & this.anIntArray473[arg1]) >>> arg2;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BIIII)I")
	public int method5420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = (0x1 << arg2) - 1;
		@Pc(28) int local28 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		@Pc(32) int local32 = local28 ^ local15;
		@Pc(36) int local36 = arg3 << arg2;
		@Pc(40) int local40 = local36 & local32;
		@Pc(45) int local45 = this.anIntArray473[arg1];
		if ((local32 & local45) == local40) {
			return -1;
		} else {
			local45 &= ~local32;
			this.anIntArray473[arg1] = local40 | local45;
			return arg1;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIB)I")
	public int method5421(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt6599 && (this.anInt6625 == -1 || this.aByteArray76[this.anInt6625] < 125)) {
			return -1;
		} else if (this.aByteArray76[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray76[arg0] = arg1;
			this.method5437();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method5422(@OriginalArg(0) int arg0) {
		if (this.aClass187_43 == null) {
			return null;
		} else {
			@Pc(15) Class14 local15 = this.aClass187_43.method4078((long) arg0);
			return local15 != null && local15 instanceof Class14_Sub18 ? Integer.valueOf(((Class14_Sub18) local15).anInt2644) : null;
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(II)V")
	public void method5423(@OriginalArg(1) int arg0) {
		this.anInt6603--;
		if (this.anInt6603 == 0) {
			this.aStringArray21 = null;
			this.aLongArray15 = null;
			return;
		}
		if (this.aLongArray15 != null) {
			Static681.method2478(this.aLongArray15, arg0 + 1, this.aLongArray15, arg0, this.anInt6603 - arg0);
		}
		if (this.aStringArray21 != null) {
			Static681.method2481(this.aStringArray21, arg0 + 1, this.aStringArray21, arg0, this.anInt6603 - arg0);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)[I")
	public int[] method5425() {
		if (this.anIntArray474 == null) {
			@Pc(8) String[] local8 = new String[this.anInt6622];
			this.anIntArray474 = new int[this.anInt6622];
			@Pc(15) int local15 = 0;
			while (this.anInt6622 > local15) {
				local8[local15] = this.aStringArray22[local15];
				this.anIntArray474[local15] = local15++;
			}
			Static69.method1358(local8, this.anIntArray474);
		}
		return this.anIntArray474;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIII)Z")
	public boolean method5426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg2) - 1;
		@Pc(22) int local22 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(26) int local26 = local22 ^ local9;
		@Pc(30) int local30 = arg0 << arg2;
		@Pc(34) int local34 = local30 & local26;
		if (this.aClass187_43 == null) {
			this.aClass187_43 = new Class187(4);
		} else {
			@Pc(52) Class14 local52 = this.aClass187_43.method4078((long) arg1);
			if (local52 != null) {
				if (local52 instanceof Class14_Sub18) {
					@Pc(60) Class14_Sub18 local60 = (Class14_Sub18) local52;
					if (local34 == (local26 & local60.anInt2644)) {
						return false;
					}
					local60.anInt2644 &= ~local26;
					local60.anInt2644 |= local34;
					return true;
				}
				local52.method9315();
			}
		}
		this.aClass187_43.method4077((long) arg1, new Class14_Sub18(local34));
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(II)V")
	private void method5427(@OriginalArg(0) int arg0) {
		if (this.aBoolean465) {
			if (this.aLongArray14 == null) {
				this.aLongArray14 = new long[arg0];
			} else {
				Static681.method2478(this.aLongArray14, 0, this.aLongArray14 = new long[arg0], 0, this.anInt6622);
			}
		}
		if (this.aBoolean466) {
			if (this.aStringArray22 == null) {
				this.aStringArray22 = new String[arg0];
			} else {
				Static681.method2481(this.aStringArray22, 0, this.aStringArray22 = new String[arg0], 0, this.anInt6622);
			}
		}
		if (this.aByteArray76 == null) {
			this.aByteArray76 = new byte[arg0];
		} else {
			Static681.method2476(this.aByteArray76, 0, this.aByteArray76 = new byte[arg0], 0, this.anInt6622);
		}
		if (this.anIntArray473 == null) {
			this.anIntArray473 = new int[arg0];
		} else {
			Static681.method2482(this.anIntArray473, 0, this.anIntArray473 = new int[arg0], 0, this.anInt6622);
		}
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(II)Ljava/lang/String;")
	public String method5428(@OriginalArg(0) int arg0) {
		if (this.aClass187_43 == null) {
			return null;
		} else {
			@Pc(20) Class14 local20 = this.aClass187_43.method4078((long) arg0);
			return local20 != null && local20 instanceof Class14_Sub17 ? ((Class14_Sub17) local20).aString26 : null;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IJLjava/lang/String;)V")
	public void method5429(@OriginalArg(1) long arg0, @OriginalArg(2) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (arg0 <= 0L == this.aBoolean465) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean465 + " but userhash:" + arg0);
		} else if ((arg1 != null) == this.aBoolean466) {
			if (arg0 > 0L && (this.aLongArray14 == null || this.aLongArray14.length <= this.anInt6622) || arg1 != null && (this.aStringArray22 == null || this.aStringArray22.length <= this.anInt6622)) {
				this.method5427(this.anInt6622 + 5);
			}
			if (this.aLongArray14 != null) {
				this.aLongArray14[this.anInt6622] = arg0;
			}
			if (this.aStringArray22 != null) {
				this.aStringArray22[this.anInt6622] = arg1;
			}
			if (this.anInt6599 == -1) {
				this.anInt6599 = this.anInt6622;
				this.aByteArray76[this.anInt6622] = 126;
			} else {
				this.aByteArray76[this.anInt6622] = 0;
			}
			this.anIntArray473[this.anInt6622] = 0;
			this.anInt6622++;
			this.anIntArray474 = null;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean466 + " but displayname:" + arg1);
		}
	}

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "(II)V")
	public void method5430(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anInt6622 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt6622);
		}
		this.anInt6622--;
		this.anIntArray474 = null;
		if (this.anInt6622 == 0) {
			this.aByteArray76 = null;
			this.aLongArray14 = null;
			this.anIntArray473 = null;
			this.anInt6625 = -1;
			this.aStringArray22 = null;
			this.anInt6599 = -1;
			return;
		}
		Static681.method2476(this.aByteArray76, arg0 + 1, this.aByteArray76, arg0, this.anInt6622 - arg0);
		Static681.method2482(this.anIntArray473, arg0 + 1, this.anIntArray473, arg0, this.anInt6622 - arg0);
		if (this.aLongArray14 != null) {
			Static681.method2478(this.aLongArray14, arg0 + 1, this.aLongArray14, arg0, this.anInt6622 - arg0);
		}
		if (this.aStringArray22 != null) {
			Static681.method2481(this.aStringArray22, arg0 + 1, this.aStringArray22, arg0, this.anInt6622 - arg0);
		}
		if (arg0 == this.anInt6599 || this.anInt6625 == arg0) {
			this.method5437();
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZ)V")
	private void method5431(@OriginalArg(0) int arg0) {
		if (this.aBoolean465) {
			if (this.aLongArray15 == null) {
				this.aLongArray15 = new long[arg0];
			} else {
				Static681.method2478(this.aLongArray15, 0, this.aLongArray15 = new long[arg0], 0, this.anInt6603);
			}
		}
		if (!this.aBoolean466) {
			return;
		}
		if (this.aStringArray21 == null) {
			this.aStringArray21 = new String[arg0];
		} else {
			Static681.method2481(this.aStringArray21, 0, this.aStringArray21 = new String[arg0], 0, this.anInt6603);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!so;I)V")
	private void method5432(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(9) int local9 = arg0.method5866();
		if (local9 < 1 || local9 > 4) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(36) int local36 = arg0.method5866();
		if ((local36 & 0x2) != 0) {
			this.aBoolean466 = true;
		}
		if ((local36 & 0x1) != 0) {
			this.aBoolean465 = true;
		}
		if (!this.aBoolean465) {
			this.aLongArray14 = null;
			this.aLongArray15 = null;
		}
		if (!this.aBoolean466) {
			this.aStringArray22 = null;
			this.aStringArray21 = null;
		}
		this.anInt6613 = arg0.method5878();
		this.anInt6604 = arg0.method5878();
		if (local9 <= 3 && this.anInt6604 != 0) {
			this.anInt6604 += 16912800;
		}
		this.anInt6622 = arg0.method5900();
		this.anInt6603 = arg0.method5866();
		this.aString69 = arg0.method5898();
		if (local9 >= 4) {
			arg0.method5878();
		}
		this.aBoolean467 = arg0.method5866() == 1;
		this.aByte104 = arg0.method5845();
		this.aByte103 = arg0.method5845();
		this.aByte102 = arg0.method5845();
		this.aByte101 = arg0.method5845();
		@Pc(230) int local230;
		if (this.anInt6622 > 0) {
			if (this.aBoolean465 && (this.aLongArray14 == null || this.aLongArray14.length < this.anInt6622)) {
				this.aLongArray14 = new long[this.anInt6622];
			}
			if (this.aBoolean466 && (this.aStringArray22 == null || this.anInt6622 > this.aStringArray22.length)) {
				this.aStringArray22 = new String[this.anInt6622];
			}
			if (this.aByteArray76 == null || this.anInt6622 > this.aByteArray76.length) {
				this.aByteArray76 = new byte[this.anInt6622];
			}
			if (this.anIntArray473 == null || this.anInt6622 > this.anIntArray473.length) {
				this.anIntArray473 = new int[this.anInt6622];
			}
			for (local230 = 0; local230 < this.anInt6622; local230++) {
				if (this.aBoolean465) {
					this.aLongArray14[local230] = arg0.method5907();
				}
				if (this.aBoolean466) {
					this.aStringArray22[local230] = arg0.method5886();
				}
				this.aByteArray76[local230] = arg0.method5845();
				if (local9 >= 2) {
					this.anIntArray473[local230] = arg0.method5878();
				}
			}
			this.method5437();
		}
		if (this.anInt6603 > 0) {
			if (this.aBoolean465 && (this.aLongArray15 == null || this.anInt6603 > this.aLongArray15.length)) {
				this.aLongArray15 = new long[this.anInt6603];
			}
			if (this.aBoolean466 && (this.aStringArray21 == null || this.anInt6603 > this.aStringArray21.length)) {
				this.aStringArray21 = new String[this.anInt6603];
			}
			for (local230 = 0; local230 < this.anInt6603; local230++) {
				if (this.aBoolean465) {
					this.aLongArray15[local230] = arg0.method5907();
				}
				if (this.aBoolean466) {
					this.aStringArray21[local230] = arg0.method5886();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local230 = arg0.method5900();
		if (local230 <= 0) {
			return;
		}
		this.aClass187_43 = new Class187(local230 >= 16 ? 16 : Static330.method5181(local230));
		while (local230-- > 0) {
			@Pc(382) int local382 = arg0.method5878();
			@Pc(386) int local386 = local382 & 0x3FFFFFFF;
			@Pc(390) int local390 = local382 >>> 30;
			if (local390 == 0) {
				@Pc(396) int local396 = arg0.method5878();
				this.aClass187_43.method4077((long) local386, new Class14_Sub18(local396));
			} else if (local390 == 1) {
				@Pc(438) long local438 = arg0.method5907();
				this.aClass187_43.method4077((long) local386, new Class14_Sub10(local438));
			} else if (local390 == 2) {
				@Pc(420) String local420 = arg0.method5898();
				this.aClass187_43.method4077((long) local386, new Class14_Sub17(local420));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(JIB)Z")
	public boolean method5433(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass187_43 == null) {
			this.aClass187_43 = new Class187(4);
		} else {
			@Pc(21) Class14 local21 = this.aClass187_43.method4078((long) arg1);
			if (local21 != null) {
				if (local21 instanceof Class14_Sub10) {
					@Pc(29) Class14_Sub10 local29 = (Class14_Sub10) local21;
					if (arg0 == local29.aLong41) {
						return false;
					}
					local29.aLong41 = arg0;
					return true;
				}
				local21.method9315();
			}
		}
		this.aClass187_43.method4077((long) arg1, new Class14_Sub10(arg0));
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5434(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6622; local17++) {
			if (this.aStringArray22[local17].equals(arg0)) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BII)Z")
	public boolean method5436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass187_43 == null) {
			this.aClass187_43 = new Class187(4);
		} else {
			@Pc(13) Class14 local13 = this.aClass187_43.method4078((long) arg0);
			if (local13 != null) {
				if (local13 instanceof Class14_Sub18) {
					@Pc(21) Class14_Sub18 local21 = (Class14_Sub18) local13;
					if (local21.anInt2644 == arg1) {
						return false;
					}
					local21.anInt2644 = arg1;
					return true;
				}
				local13.method9315();
			}
		}
		this.aClass187_43.method4077((long) arg0, new Class14_Sub18(arg1));
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(Z)V")
	private void method5437() {
		if (this.anInt6622 == 0) {
			this.anInt6599 = -1;
			this.anInt6625 = -1;
			return;
		}
		this.anInt6599 = -1;
		this.anInt6625 = -1;
		@Pc(30) int local30 = 0;
		@Pc(35) byte local35 = this.aByteArray76[0];
		for (@Pc(37) int local37 = 1; local37 < this.anInt6622; local37++) {
			if (local35 < this.aByteArray76[local37]) {
				if (local35 == 125) {
					this.anInt6625 = local30;
				}
				local30 = local37;
				local35 = this.aByteArray76[local37];
			} else if (this.anInt6625 == -1 && this.aByteArray76[local37] == 125) {
				this.anInt6625 = local37;
			}
		}
		this.anInt6599 = local30;
		if (this.anInt6599 != -1) {
			this.aByteArray76[this.anInt6599] = 126;
		}
	}

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "(II)Ljava/lang/Long;")
	public Long method5438(@OriginalArg(0) int arg0) {
		if (this.aClass187_43 == null) {
			return null;
		} else {
			@Pc(23) Class14 local23 = this.aClass187_43.method4078((long) arg0);
			return local23 != null && local23 instanceof Class14_Sub10 ? Long.valueOf(((Class14_Sub10) local23).aLong41) : null;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIII)Ljava/lang/Integer;")
	public Integer method5439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass187_43 == null) {
			return null;
		}
		@Pc(21) Class14 local21 = this.aClass187_43.method4078((long) arg0);
		if (local21 != null && local21 instanceof Class14_Sub18) {
			@Pc(41) int local41 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
			return Integer.valueOf((((Class14_Sub18) local21).anInt2644 & local41) >>> arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLjava/lang/String;I)Z")
	public boolean method5440(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass187_43 == null) {
			this.aClass187_43 = new Class187(4);
		} else {
			@Pc(38) Class14 local38 = this.aClass187_43.method4078((long) arg1);
			if (local38 != null) {
				if (local38 instanceof Class14_Sub17) {
					@Pc(46) Class14_Sub17 local46 = (Class14_Sub17) local38;
					if (local46.aString26.equals(arg0)) {
						return false;
					}
					local46.aString26 = arg0;
					return true;
				}
				local38.method9315();
			}
		}
		this.aClass187_43.method4077((long) arg1, new Class14_Sub17(arg0));
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(JLjava/lang/String;B)V")
	public void method5441(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean465 != arg0 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean465 + " but userhash:" + arg0);
		} else if ((arg1 != null) == this.aBoolean466) {
			if (arg0 > 0L && (this.aLongArray15 == null || this.anInt6603 >= this.aLongArray15.length) || arg1 != null && (this.aStringArray21 == null || this.aStringArray21.length <= this.anInt6603)) {
				this.method5431(this.anInt6603 + 5);
			}
			if (this.aLongArray15 != null) {
				this.aLongArray15[this.anInt6603] = arg0;
			}
			if (this.aStringArray21 != null) {
				this.aStringArray21[this.anInt6603] = arg1;
			}
			this.anInt6603++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean466 + " but displayname:" + arg1);
		}
	}
}
