import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public final class Class233 {

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "B")
	public byte aByte83;

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "B")
	public byte aByte84;

	@OriginalMember(owner = "client!mia", name = "h", descriptor = "I")
	public int anInt6453;

	@OriginalMember(owner = "client!mia", name = "i", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!mia", name = "l", descriptor = "Lclient!tga;")
	private Class335 aClass335_29;

	@OriginalMember(owner = "client!mia", name = "m", descriptor = "[J")
	private long[] aLongArray16;

	@OriginalMember(owner = "client!mia", name = "n", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray22;

	@OriginalMember(owner = "client!mia", name = "o", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!mia", name = "y", descriptor = "B")
	public byte aByte85;

	@OriginalMember(owner = "client!mia", name = "B", descriptor = "Z")
	public boolean aBoolean463;

	@OriginalMember(owner = "client!mia", name = "D", descriptor = "[I")
	private int[] anIntArray366;

	@OriginalMember(owner = "client!mia", name = "E", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!mia", name = "H", descriptor = "J")
	public long aLong187;

	@OriginalMember(owner = "client!mia", name = "K", descriptor = "B")
	public byte aByte86;

	@OriginalMember(owner = "client!mia", name = "M", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray23;

	@OriginalMember(owner = "client!mia", name = "Q", descriptor = "[J")
	private long[] aLongArray17;

	@OriginalMember(owner = "client!mia", name = "R", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!mia", name = "T", descriptor = "I")
	public int anInt6476;

	@OriginalMember(owner = "client!mia", name = "q", descriptor = "I")
	public int anInt6457 = -1;

	@OriginalMember(owner = "client!mia", name = "F", descriptor = "I")
	public int anInt6467 = -1;

	@OriginalMember(owner = "client!mia", name = "A", descriptor = "I")
	public int anInt6465 = 0;

	@OriginalMember(owner = "client!mia", name = "u", descriptor = "Ljava/lang/String;")
	public String aString64 = null;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class233(@OriginalArg(0) Class5_Sub15 arg0) {
		this.method5427(arg0);
	}

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "()V")
	private Class233() {
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5411(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt6476; local20++) {
			if (this.aStringArray23[local20].equals(arg0)) {
				return local20;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(II)V")
	public void method5412(@OriginalArg(0) int arg0) {
		this.anInt6453--;
		if (this.anInt6453 == 0) {
			this.aLongArray17 = null;
			this.aStringArray22 = null;
			return;
		}
		if (this.aLongArray17 != null) {
			Static685.method8332(this.aLongArray17, arg0 + 1, this.aLongArray17, arg0, this.anInt6453 - arg0);
		}
		if (this.aStringArray22 != null) {
			Static685.method8331(this.aStringArray22, arg0 + 1, this.aStringArray22, arg0, this.anInt6453 - arg0);
		}
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(IIIII)I")
	public int method5415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = (0x1 << arg3) - 1;
		@Pc(27) int local27 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(31) int local31 = local14 ^ local27;
		@Pc(35) int local35 = arg1 << arg3;
		@Pc(39) int local39 = local35 & local31;
		@Pc(44) int local44 = this.anIntArray365[arg0];
		if (local39 == (local31 & local44)) {
			return -1;
		} else {
			local44 &= ~local31;
			this.anIntArray365[arg0] = local39 | local44;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(II)V")
	private void method5416(@OriginalArg(0) int arg0) {
		if (this.aBoolean464) {
			if (this.aLongArray16 == null) {
				this.aLongArray16 = new long[arg0];
			} else {
				Static685.method8332(this.aLongArray16, 0, this.aLongArray16 = new long[arg0], 0, this.anInt6476);
			}
		}
		if (this.aBoolean462) {
			if (this.aStringArray23 == null) {
				this.aStringArray23 = new String[arg0];
			} else {
				Static685.method8331(this.aStringArray23, 0, this.aStringArray23 = new String[arg0], 0, this.anInt6476);
			}
		}
		if (this.aByteArray62 == null) {
			this.aByteArray62 = new byte[arg0];
		} else {
			Static685.method8328(this.aByteArray62, 0, this.aByteArray62 = new byte[arg0], 0, this.anInt6476);
		}
		if (this.anIntArray365 == null) {
			this.anIntArray365 = new int[arg0];
		} else {
			Static685.method8329(this.anIntArray365, 0, this.anIntArray365 = new int[arg0], 0, this.anInt6476);
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IZII)Ljava/lang/Integer;")
	public Integer method5417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass335_29 == null) {
			return null;
		}
		@Pc(21) Class5 local21 = this.aClass335_29.method7766((long) arg2);
		if (local21 != null && local21 instanceof Class5_Sub43) {
			@Pc(41) int local41 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
			return Integer.valueOf((((Class5_Sub43) local21).anInt7821 & local41) >>> arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;J)V")
	public void method5418(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 > 0L != this.aBoolean464) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean464 + " but userhash:" + arg1);
		} else if (this.aBoolean462 == (arg0 != null)) {
			if (arg1 > 0L && (this.aLongArray16 == null || this.aLongArray16.length <= this.anInt6476) || arg0 != null && (this.aStringArray23 == null || this.anInt6476 >= this.aStringArray23.length)) {
				this.method5416(this.anInt6476 + 5);
			}
			if (this.aLongArray16 != null) {
				this.aLongArray16[this.anInt6476] = arg1;
			}
			if (this.aStringArray23 != null) {
				this.aStringArray23[this.anInt6476] = arg0;
			}
			if (this.anInt6467 == -1) {
				this.anInt6467 = this.anInt6476;
				this.aByteArray62[this.anInt6476] = 126;
			} else {
				this.aByteArray62[this.anInt6476] = 0;
			}
			this.anIntArray365[this.anInt6476] = 0;
			this.anIntArray366 = null;
			this.anInt6476++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean462 + " but displayname:" + arg0);
		}
	}

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "(II)V")
	private void method5419(@OriginalArg(0) int arg0) {
		if (this.aBoolean464) {
			if (this.aLongArray17 == null) {
				this.aLongArray17 = new long[arg0];
			} else {
				Static685.method8332(this.aLongArray17, 0, this.aLongArray17 = new long[arg0], 0, this.anInt6453);
			}
		}
		if (!this.aBoolean462) {
			return;
		}
		if (this.aStringArray22 == null) {
			this.aStringArray22 = new String[arg0];
		} else {
			Static685.method8331(this.aStringArray22, 0, this.aStringArray22 = new String[arg0], 0, this.anInt6453);
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIII)I")
	public int method5420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		return (this.anIntArray365[arg1] & local25) >>> arg2;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIJ)Z")
	public boolean method5421(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass335_29 == null) {
			this.aClass335_29 = new Class335(4);
		} else {
			@Pc(13) Class5 local13 = this.aClass335_29.method7766((long) arg0);
			if (local13 != null) {
				if (local13 instanceof Class5_Sub50) {
					@Pc(21) Class5_Sub50 local21 = (Class5_Sub50) local13;
					if (arg1 == local21.aLong293) {
						return false;
					}
					local21.aLong293 = arg1;
					return true;
				}
				local13.method8829();
			}
		}
		this.aClass335_29.method7770((long) arg0, new Class5_Sub50(arg1));
		return true;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)Z")
	public boolean method5422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass335_29 == null) {
			this.aClass335_29 = new Class335(4);
		} else {
			@Pc(13) Class5 local13 = this.aClass335_29.method7766((long) arg0);
			if (local13 != null) {
				if (local13 instanceof Class5_Sub43) {
					@Pc(21) Class5_Sub43 local21 = (Class5_Sub43) local13;
					if (arg1 == local21.anInt7821) {
						return false;
					}
					local21.anInt7821 = arg1;
					return true;
				}
				local13.method8829();
			}
		}
		this.aClass335_29.method7770((long) arg0, new Class5_Sub43(arg1));
		return true;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public boolean method5423(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass335_29 == null) {
			this.aClass335_29 = new Class335(4);
		} else {
			@Pc(35) Class5 local35 = this.aClass335_29.method7766((long) arg0);
			if (local35 != null) {
				if (local35 instanceof Class5_Sub44) {
					@Pc(43) Class5_Sub44 local43 = (Class5_Sub44) local35;
					if (local43.aString83.equals(arg1)) {
						return false;
					}
					local43.aString83 = arg1;
					return true;
				}
				local35.method8829();
			}
		}
		this.aClass335_29.method7770((long) arg0, new Class5_Sub44(arg1));
		return true;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BI)Ljava/lang/Long;")
	public Long method5424(@OriginalArg(1) int arg0) {
		if (this.aClass335_29 == null) {
			return null;
		} else {
			@Pc(15) Class5 local15 = this.aClass335_29.method7766((long) arg0);
			return local15 != null && local15 instanceof Class5_Sub50 ? Long.valueOf(((Class5_Sub50) local15).aLong293) : null;
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BBI)I")
	public int method5425(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 126 || arg0 == 127) {
			return -1;
		} else if (arg1 == this.anInt6467 && (this.anInt6457 == -1 || this.aByteArray62[this.anInt6457] < 125)) {
			return -1;
		} else if (this.aByteArray62[arg1] == arg0) {
			return -1;
		} else {
			this.aByteArray62[arg1] = arg0;
			this.method5426();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)V")
	private void method5426() {
		if (this.anInt6476 == 0) {
			this.anInt6467 = -1;
			this.anInt6457 = -1;
			return;
		}
		this.anInt6467 = -1;
		this.anInt6457 = -1;
		@Pc(24) int local24 = 0;
		@Pc(29) byte local29 = this.aByteArray62[0];
		for (@Pc(31) int local31 = 1; local31 < this.anInt6476; local31++) {
			if (local29 < this.aByteArray62[local31]) {
				if (local29 == 125) {
					this.anInt6457 = local24;
				}
				local29 = this.aByteArray62[local31];
				local24 = local31;
			} else if (this.anInt6457 == -1 && this.aByteArray62[local31] == 125) {
				this.anInt6457 = local31;
			}
		}
		this.anInt6467 = local24;
		if (this.anInt6467 != -1) {
			this.aByteArray62[this.anInt6467] = 126;
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!rv;B)V")
	private void method5427(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3642();
		if (local7 < 1 || local7 > 3) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local7);
		}
		@Pc(32) int local32 = arg0.method3642();
		if ((local32 & 0x2) != 0) {
			this.aBoolean462 = true;
		}
		if ((local32 & 0x1) != 0) {
			this.aBoolean464 = true;
		}
		if (!this.aBoolean464) {
			this.aLongArray17 = null;
			this.aLongArray16 = null;
		}
		if (!this.aBoolean462) {
			this.aStringArray22 = null;
			this.aStringArray23 = null;
		}
		this.anInt6465 = arg0.method3671();
		arg0.method3671();
		this.anInt6476 = arg0.method3698();
		this.anInt6453 = arg0.method3642();
		this.aString64 = arg0.method3661();
		this.aBoolean463 = arg0.method3642() == 1;
		this.aByte85 = arg0.method3677();
		this.aByte84 = arg0.method3677();
		this.aByte83 = arg0.method3677();
		this.aByte86 = arg0.method3677();
		@Pc(207) int local207;
		if (this.anInt6476 > 0) {
			if (this.aBoolean464 && (this.aLongArray16 == null || this.aLongArray16.length < this.anInt6476)) {
				this.aLongArray16 = new long[this.anInt6476];
			}
			if (this.aBoolean462 && (this.aStringArray23 == null || this.anInt6476 > this.aStringArray23.length)) {
				this.aStringArray23 = new String[this.anInt6476];
			}
			if (this.aByteArray62 == null || this.aByteArray62.length < this.anInt6476) {
				this.aByteArray62 = new byte[this.anInt6476];
			}
			if (this.anIntArray365 == null || this.anIntArray365.length < this.anInt6476) {
				this.anIntArray365 = new int[this.anInt6476];
			}
			for (local207 = 0; local207 < this.anInt6476; local207++) {
				if (this.aBoolean464) {
					this.aLongArray16[local207] = arg0.method3634();
				}
				if (this.aBoolean462) {
					this.aStringArray23[local207] = arg0.method3691();
				}
				this.aByteArray62[local207] = arg0.method3677();
				if (local7 >= 2) {
					this.anIntArray365[local207] = arg0.method3671();
				}
			}
			this.method5426();
		}
		if (this.anInt6453 > 0) {
			if (this.aBoolean464 && (this.aLongArray17 == null || this.aLongArray17.length < this.anInt6453)) {
				this.aLongArray17 = new long[this.anInt6453];
			}
			if (this.aBoolean462 && (this.aStringArray22 == null || this.anInt6453 > this.aStringArray22.length)) {
				this.aStringArray22 = new String[this.anInt6453];
			}
			for (local207 = 0; local207 < this.anInt6453; local207++) {
				if (this.aBoolean464) {
					this.aLongArray17[local207] = arg0.method3634();
				}
				if (this.aBoolean462) {
					this.aStringArray22[local207] = arg0.method3691();
				}
			}
		}
		if (local7 < 3) {
			return;
		}
		local207 = arg0.method3698();
		if (local207 <= 0) {
			return;
		}
		this.aClass335_29 = new Class335(local207 >= 16 ? 16 : Static209.method2991(local207));
		while (local207-- > 0) {
			@Pc(361) int local361 = arg0.method3671();
			@Pc(365) int local365 = local361 & 0x3FFFFFFF;
			@Pc(369) int local369 = local361 >>> 30;
			if (local369 == 0) {
				@Pc(375) int local375 = arg0.method3671();
				this.aClass335_29.method7770((long) local365, new Class5_Sub43(local375));
			} else if (local369 == 1) {
				@Pc(415) long local415 = arg0.method3634();
				this.aClass335_29.method7770((long) local365, new Class5_Sub50(local415));
			} else if (local369 == 2) {
				@Pc(398) String local398 = arg0.method3661();
				this.aClass335_29.method7770((long) local365, new Class5_Sub44(local398));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!mia", name = "d", descriptor = "(II)V")
	public void method5428(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt6476) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt6476);
		}
		this.anIntArray366 = null;
		this.anInt6476--;
		if (this.anInt6476 == 0) {
			this.aLongArray16 = null;
			this.aStringArray23 = null;
			this.anInt6467 = -1;
			this.aByteArray62 = null;
			this.anInt6457 = -1;
			this.anIntArray365 = null;
			return;
		}
		Static685.method8328(this.aByteArray62, arg0 + 1, this.aByteArray62, arg0, this.anInt6476 - arg0);
		Static685.method8329(this.anIntArray365, arg0 + 1, this.anIntArray365, arg0, this.anInt6476 - arg0);
		if (this.aLongArray16 != null) {
			Static685.method8332(this.aLongArray16, arg0 + 1, this.aLongArray16, arg0, this.anInt6476 - arg0);
		}
		if (this.aStringArray23 != null) {
			Static685.method8331(this.aStringArray23, arg0 + 1, this.aStringArray23, arg0, this.anInt6476 - arg0);
		}
		if (arg0 == this.anInt6467 || this.anInt6457 == arg0) {
			this.method5426();
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)[I")
	public int[] method5429() {
		if (this.anIntArray366 == null) {
			@Pc(16) String[] local16 = new String[this.anInt6476];
			this.anIntArray366 = new int[this.anInt6476];
			@Pc(23) int local23 = 0;
			while (local23 < this.anInt6476) {
				local16[local23] = this.aStringArray23[local23];
				this.anIntArray366[local23] = local23++;
			}
			Static59.method5266(this.anIntArray366, local16);
		}
		return this.anIntArray366;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIBII)Z")
	public boolean method5430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg3) - 1;
		@Pc(24) int local24 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(28) int local28 = arg1 << arg3;
		@Pc(37) int local37 = local24 ^ local9;
		@Pc(41) int local41 = local28 & local37;
		if (this.aClass335_29 == null) {
			this.aClass335_29 = new Class335(4);
		} else {
			@Pc(51) Class5 local51 = this.aClass335_29.method7766((long) arg0);
			if (local51 != null) {
				if (local51 instanceof Class5_Sub43) {
					@Pc(59) Class5_Sub43 local59 = (Class5_Sub43) local51;
					if (local41 == (local37 & local59.anInt7821)) {
						return false;
					}
					local59.anInt7821 &= ~local37;
					local59.anInt7821 |= local41;
					return true;
				}
				local51.method8829();
			}
		}
		this.aClass335_29.method7770((long) arg0, new Class5_Sub43(local41));
		return true;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Ljava/lang/String;JI)V")
	public void method5431(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 <= 0L == this.aBoolean464) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean464 + " but userhash:" + arg1);
		} else if (this.aBoolean462 == (arg0 != null)) {
			if (arg1 > 0L && (this.aLongArray17 == null || this.aLongArray17.length <= this.anInt6453) || arg0 != null && (this.aStringArray22 == null || this.anInt6453 >= this.aStringArray22.length)) {
				this.method5419(this.anInt6453 + 5);
			}
			if (this.aLongArray17 != null) {
				this.aLongArray17[this.anInt6453] = arg1;
			}
			if (this.aStringArray22 != null) {
				this.aStringArray22[this.anInt6453] = arg0;
			}
			this.anInt6453++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean462 + " but displayname:" + arg0);
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IB)Ljava/lang/Integer;")
	public Integer method5432(@OriginalArg(0) int arg0) {
		if (this.aClass335_29 == null) {
			return null;
		} else {
			@Pc(15) Class5 local15 = this.aClass335_29.method7766((long) arg0);
			return local15 != null && local15 instanceof Class5_Sub43 ? Integer.valueOf(((Class5_Sub43) local15).anInt7821) : null;
		}
	}

	@OriginalMember(owner = "client!mia", name = "e", descriptor = "(II)Ljava/lang/String;")
	public String method5433(@OriginalArg(0) int arg0) {
		if (this.aClass335_29 == null) {
			return null;
		} else {
			@Pc(21) Class5 local21 = this.aClass335_29.method7766((long) arg0);
			return local21 != null && local21 instanceof Class5_Sub44 ? ((Class5_Sub44) local21).aString83 : null;
		}
	}
}
