import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class219 {

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "B")
	public byte aByte91;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray36;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "B")
	public byte aByte92;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "[J")
	private long[] aLongArray14;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "B")
	public byte aByte93;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	public int anInt6726;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
	private boolean aBoolean509;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!si;")
	private Class335 aClass335_22;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "J")
	public long aLong174;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "B")
	public byte aByte94;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray37;

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
	public int anInt6739;

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "[J")
	private long[] aLongArray15;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "Z")
	public boolean aBoolean511;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
	public int anInt6728 = 0;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
	public int anInt6736 = -1;

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
	public int anInt6738 = -1;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Ljava/lang/String;")
	public String aString78 = null;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class219(@OriginalArg(0) Class2_Sub8 arg0) {
		this.method6030(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	private Class219() {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(JII)Z")
	public boolean method6010(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass335_22 == null) {
			this.aClass335_22 = new Class335(4);
		} else {
			@Pc(13) Class2 local13 = this.aClass335_22.method8357((long) arg1);
			if (local13 != null) {
				if (local13 instanceof Class2_Sub17) {
					@Pc(21) Class2_Sub17 local21 = (Class2_Sub17) local13;
					if (local21.aLong54 == arg0) {
						return false;
					}
					local21.aLong54 = arg0;
					return true;
				}
				local13.method9825();
			}
		}
		this.aClass335_22.method8356(new Class2_Sub17(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method6011(@OriginalArg(1) int arg0) {
		if (this.aClass335_22 == null) {
			return null;
		} else {
			@Pc(21) Class2 local21 = this.aClass335_22.method8357((long) arg0);
			return local21 != null && local21 instanceof Class2_Sub19 ? ((Class2_Sub19) local21).aString21 : null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IJLjava/lang/String;)V")
	public void method6012(@OriginalArg(1) long arg0, @OriginalArg(2) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean509 != arg0 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean509 + " but userhash:" + arg0);
		} else if ((arg1 == null) == this.aBoolean510) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean510 + " but displayname:" + arg1);
		} else {
			if (arg0 > 0L && (this.aLongArray14 == null || this.anInt6726 >= this.aLongArray14.length) || arg1 != null && (this.aStringArray37 == null || this.anInt6726 >= this.aStringArray37.length)) {
				this.method6031(this.anInt6726 + 5);
			}
			if (this.aLongArray14 != null) {
				this.aLongArray14[this.anInt6726] = arg0;
			}
			if (this.aStringArray37 != null) {
				this.aStringArray37[this.anInt6726] = arg1;
			}
			this.anInt6726++;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)V")
	public void method6013(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt6739) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt6739);
		}
		this.anInt6739--;
		if (this.anInt6739 == 0) {
			this.anInt6736 = -1;
			this.aStringArray36 = null;
			this.anInt6738 = -1;
			this.aLongArray15 = null;
			this.anIntArray322 = null;
			this.aByteArray65 = null;
			return;
		}
		Static679.method4129(this.aByteArray65, arg0 + 1, this.aByteArray65, arg0, this.anInt6739 - arg0);
		Static679.method4128(this.anIntArray322, arg0 + 1, this.anIntArray322, arg0, this.anInt6739 - arg0);
		if (this.aLongArray15 != null) {
			Static679.method4127(this.aLongArray15, arg0 + 1, this.aLongArray15, arg0, this.anInt6739 - arg0);
		}
		if (this.aStringArray36 != null) {
			Static679.method4131(this.aStringArray36, arg0 + 1, this.aStringArray36, arg0, this.anInt6739 - arg0);
		}
		if (this.anInt6736 == arg0 || arg0 == this.anInt6738) {
			this.method6028();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;J)V")
	public void method6015(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 <= 0L == this.aBoolean509) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean509 + " but userhash:" + arg1);
		} else if (this.aBoolean510 == (arg0 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean510 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray15 == null || this.aLongArray15.length <= this.anInt6739) || arg0 != null && (this.aStringArray36 == null || this.aStringArray36.length <= this.anInt6739)) {
				this.method6025(this.anInt6739 + 5);
			}
			if (this.aLongArray15 != null) {
				this.aLongArray15[this.anInt6739] = arg1;
			}
			if (this.aStringArray36 != null) {
				this.aStringArray36[this.anInt6739] = arg0;
			}
			if (this.anInt6736 == -1) {
				this.anInt6736 = this.anInt6739;
				this.aByteArray65[this.anInt6739] = 126;
			} else {
				this.aByteArray65[this.anInt6739] = 0;
			}
			this.anIntArray322[this.anInt6739] = 0;
			this.anInt6739++;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)Z")
	public boolean method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg0) - 1;
		@Pc(24) int local24 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(28) int local28 = local9 ^ local24;
		@Pc(32) int local32 = arg3 << arg0;
		@Pc(36) int local36 = local32 & local28;
		if (this.aClass335_22 == null) {
			this.aClass335_22 = new Class335(4);
		} else {
			@Pc(46) Class2 local46 = this.aClass335_22.method8357((long) arg1);
			if (local46 != null) {
				if (local46 instanceof Class2_Sub14) {
					@Pc(54) Class2_Sub14 local54 = (Class2_Sub14) local46;
					if ((local28 & local54.anInt1303) == local36) {
						return false;
					}
					local54.anInt1303 &= ~local28;
					local54.anInt1303 |= local36;
					return true;
				}
				local46.method9825();
			}
		}
		this.aClass335_22.method8356(new Class2_Sub14(local36), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIIII)I")
	public int method6018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg0) - 1;
		@Pc(22) int local22 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(26) int local26 = local9 ^ local22;
		@Pc(30) int local30 = arg2 << arg0;
		@Pc(34) int local34 = local30 & local26;
		@Pc(39) int local39 = this.anIntArray322[arg1];
		if (local34 == (local26 & local39)) {
			return -1;
		} else {
			local39 &= ~local26;
			this.anIntArray322[arg1] = local34 | local39;
			return arg1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method6019(@OriginalArg(0) int arg0) {
		if (this.aClass335_22 == null) {
			return null;
		} else {
			@Pc(15) Class2 local15 = this.aClass335_22.method8357((long) arg0);
			return local15 != null && local15 instanceof Class2_Sub14 ? Integer.valueOf(((Class2_Sub14) local15).anInt1303) : null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)V")
	public void method6020(@OriginalArg(1) int arg0) {
		this.anInt6726--;
		if (this.anInt6726 == 0) {
			this.aLongArray14 = null;
			this.aStringArray37 = null;
			return;
		}
		if (this.aLongArray14 != null) {
			Static679.method4127(this.aLongArray14, arg0 + 1, this.aLongArray14, arg0, this.anInt6726 - arg0);
		}
		if (this.aStringArray37 != null) {
			Static679.method4131(this.aStringArray37, arg0 + 1, this.aStringArray37, arg0, this.anInt6726 - arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)Ljava/lang/Long;")
	public Long method6022(@OriginalArg(1) int arg0) {
		if (this.aClass335_22 == null) {
			return null;
		} else {
			@Pc(20) Class2 local20 = this.aClass335_22.method8357((long) arg0);
			return local20 != null && local20 instanceof Class2_Sub17 ? Long.valueOf(((Class2_Sub17) local20).aLong54) : null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)I")
	public int method6023(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt6736 == arg0 && (this.anInt6738 == -1 || this.aByteArray65[this.anInt6738] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray65[arg0]) {
			return -1;
		} else {
			this.aByteArray65[arg0] = arg1;
			this.method6028();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public boolean method6024(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass335_22 == null) {
			this.aClass335_22 = new Class335(4);
		} else {
			@Pc(34) Class2 local34 = this.aClass335_22.method8357((long) arg1);
			if (local34 != null) {
				if (local34 instanceof Class2_Sub19) {
					@Pc(42) Class2_Sub19 local42 = (Class2_Sub19) local34;
					if (local42.aString21.equals(arg0)) {
						return false;
					}
					local42.aString21 = arg0;
					return true;
				}
				local34.method9825();
			}
		}
		this.aClass335_22.method8356(new Class2_Sub19(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(BI)V")
	private void method6025(@OriginalArg(1) int arg0) {
		if (this.aBoolean509) {
			if (this.aLongArray15 == null) {
				this.aLongArray15 = new long[arg0];
			} else {
				Static679.method4127(this.aLongArray15, 0, this.aLongArray15 = new long[arg0], 0, this.anInt6739);
			}
		}
		if (this.aBoolean510) {
			if (this.aStringArray36 == null) {
				this.aStringArray36 = new String[arg0];
			} else {
				Static679.method4131(this.aStringArray36, 0, this.aStringArray36 = new String[arg0], 0, this.anInt6739);
			}
		}
		if (this.aByteArray65 == null) {
			this.aByteArray65 = new byte[arg0];
		} else {
			Static679.method4129(this.aByteArray65, 0, this.aByteArray65 = new byte[arg0], 0, this.anInt6739);
		}
		if (this.anIntArray322 == null) {
			this.anIntArray322 = new int[arg0];
		} else {
			Static679.method4128(this.anIntArray322, 0, this.anIntArray322 = new int[arg0], 0, this.anInt6739);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIBI)I")
	public int method6026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray322[arg1] & local18) >>> arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z")
	public boolean method6027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass335_22 == null) {
			this.aClass335_22 = new Class335(4);
		} else {
			@Pc(21) Class2 local21 = this.aClass335_22.method8357((long) arg1);
			if (local21 != null) {
				if (local21 instanceof Class2_Sub14) {
					@Pc(29) Class2_Sub14 local29 = (Class2_Sub14) local21;
					if (arg0 == local29.anInt1303) {
						return false;
					}
					local29.anInt1303 = arg0;
					return true;
				}
				local21.method9825();
			}
		}
		this.aClass335_22.method8356(new Class2_Sub14(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
	private void method6028() {
		if (this.anInt6739 == 0) {
			this.anInt6736 = -1;
			this.anInt6738 = -1;
			return;
		}
		this.anInt6736 = -1;
		this.anInt6738 = -1;
		@Pc(23) int local23 = 0;
		@Pc(28) byte local28 = this.aByteArray65[0];
		for (@Pc(30) int local30 = 1; local30 < this.anInt6739; local30++) {
			if (local28 < this.aByteArray65[local30]) {
				if (local28 == 125) {
					this.anInt6738 = local23;
				}
				local28 = this.aByteArray65[local30];
				local23 = local30;
			} else if (this.anInt6738 == -1 && this.aByteArray65[local30] == 125) {
				this.anInt6738 = local30;
			}
		}
		this.anInt6736 = local23;
		if (this.anInt6736 != -1) {
			this.aByteArray65[this.anInt6736] = 126;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)Ljava/lang/Integer;")
	public Integer method6029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass335_22 == null) {
			return null;
		}
		@Pc(15) Class2 local15 = this.aClass335_22.method8357((long) arg2);
		if (local15 != null && local15 instanceof Class2_Sub14) {
			@Pc(41) int local41 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
			return Integer.valueOf((((Class2_Sub14) local15).anInt1303 & local41) >>> arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!ol;)V")
	private void method6030(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method5203();
		if (local9 < 1 || local9 > 3) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(32) int local32 = arg0.method5203();
		if ((local32 & 0x2) != 0) {
			this.aBoolean510 = true;
		}
		if ((local32 & 0x1) != 0) {
			this.aBoolean509 = true;
		}
		if (!this.aBoolean509) {
			this.aLongArray15 = null;
			this.aLongArray14 = null;
		}
		if (!this.aBoolean510) {
			this.aStringArray36 = null;
			this.aStringArray37 = null;
		}
		this.anInt6728 = arg0.method5172();
		arg0.method5172();
		this.anInt6739 = arg0.method5211();
		this.anInt6726 = arg0.method5203();
		this.aString78 = arg0.method5178();
		this.aBoolean511 = arg0.method5203() == 1;
		this.aByte92 = arg0.method5175();
		this.aByte93 = arg0.method5175();
		this.aByte91 = arg0.method5175();
		this.aByte94 = arg0.method5175();
		@Pc(212) int local212;
		if (this.anInt6739 > 0) {
			if (this.aBoolean509 && (this.aLongArray15 == null || this.aLongArray15.length < this.anInt6739)) {
				this.aLongArray15 = new long[this.anInt6739];
			}
			if (this.aBoolean510 && (this.aStringArray36 == null || this.aStringArray36.length < this.anInt6739)) {
				this.aStringArray36 = new String[this.anInt6739];
			}
			if (this.aByteArray65 == null || this.aByteArray65.length < this.anInt6739) {
				this.aByteArray65 = new byte[this.anInt6739];
			}
			if (this.anIntArray322 == null || this.anInt6739 > this.anIntArray322.length) {
				this.anIntArray322 = new int[this.anInt6739];
			}
			for (local212 = 0; local212 < this.anInt6739; local212++) {
				if (this.aBoolean509) {
					this.aLongArray15[local212] = arg0.method5213();
				}
				if (this.aBoolean510) {
					this.aStringArray36[local212] = arg0.method5224();
				}
				this.aByteArray65[local212] = arg0.method5175();
				if (local9 >= 2) {
					this.anIntArray322[local212] = arg0.method5172();
				}
			}
			this.method6028();
		}
		if (this.anInt6726 > 0) {
			if (this.aBoolean509 && (this.aLongArray14 == null || this.aLongArray14.length < this.anInt6726)) {
				this.aLongArray14 = new long[this.anInt6726];
			}
			if (this.aBoolean510 && (this.aStringArray37 == null || this.aStringArray37.length < this.anInt6726)) {
				this.aStringArray37 = new String[this.anInt6726];
			}
			for (local212 = 0; local212 < this.anInt6726; local212++) {
				if (this.aBoolean509) {
					this.aLongArray14[local212] = arg0.method5213();
				}
				if (this.aBoolean510) {
					this.aStringArray37[local212] = arg0.method5224();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local212 = arg0.method5211();
		if (local212 <= 0) {
			return;
		}
		this.aClass335_22 = new Class335(local212 >= 16 ? 16 : Static432.method7064(local212));
		while (local212-- > 0) {
			@Pc(368) int local368 = arg0.method5172();
			@Pc(372) int local372 = local368 & 0x3FFFFFFF;
			@Pc(376) int local376 = local368 >>> 30;
			if (local376 == 0) {
				@Pc(382) int local382 = arg0.method5172();
				this.aClass335_22.method8356(new Class2_Sub14(local382), (long) local372);
			} else if (local376 == 1) {
				@Pc(422) long local422 = arg0.method5213();
				this.aClass335_22.method8356(new Class2_Sub17(local422), (long) local372);
			} else if (local376 == 2) {
				@Pc(406) String local406 = arg0.method5178();
				this.aClass335_22.method8356(new Class2_Sub19(local406), (long) local372);
			}
		}
		return;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	private void method6031(@OriginalArg(0) int arg0) {
		if (this.aBoolean509) {
			if (this.aLongArray14 == null) {
				this.aLongArray14 = new long[arg0];
			} else {
				Static679.method4127(this.aLongArray14, 0, this.aLongArray14 = new long[arg0], 0, this.anInt6726);
			}
		}
		if (!this.aBoolean510) {
			return;
		}
		if (this.aStringArray37 == null) {
			this.aStringArray37 = new String[arg0];
		} else {
			Static679.method4131(this.aStringArray37, 0, this.aStringArray37 = new String[arg0], 0, this.anInt6726);
		}
	}
}
