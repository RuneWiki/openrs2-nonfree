import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class342 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
	private int[] anIntArray512;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "[J")
	private long[] aLongArray17;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray61;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "B")
	public byte aByte128;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	public int anInt9482;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "B")
	public byte aByte129;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "Z")
	private boolean aBoolean657;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "B")
	public byte aByte130;

	@OriginalMember(owner = "client!tn", name = "A", descriptor = "Z")
	public boolean aBoolean659;

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "Lclient!tca;")
	private Class333 aClass333_41;

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray62;

	@OriginalMember(owner = "client!tn", name = "H", descriptor = "Z")
	private boolean aBoolean660;

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "[J")
	private long[] aLongArray18;

	@OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
	public int anInt9493;

	@OriginalMember(owner = "client!tn", name = "N", descriptor = "[I")
	private int[] anIntArray513;

	@OriginalMember(owner = "client!tn", name = "Q", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!tn", name = "S", descriptor = "J")
	public long aLong269;

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "Ljava/lang/String;")
	public String aString107 = null;

	@OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
	public int anInt9495 = 0;

	@OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
	public int anInt9496 = -1;

	@OriginalMember(owner = "client!tn", name = "R", descriptor = "I")
	public int anInt9497 = -1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class342(@OriginalArg(0) Class3_Sub4 arg0) {
		this.method7730(arg0);
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	private Class342() {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLclient!dt;)V")
	private void method7730(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(9) int local9 = arg0.method7954();
		if (local9 < 1 || local9 > 3) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(32) int local32 = arg0.method7954();
		if ((local32 & 0x2) != 0) {
			this.aBoolean657 = true;
		}
		if ((local32 & 0x1) != 0) {
			this.aBoolean660 = true;
		}
		if (!this.aBoolean657) {
			this.aStringArray62 = null;
			this.aStringArray61 = null;
		}
		if (!this.aBoolean660) {
			this.aLongArray17 = null;
			this.aLongArray18 = null;
		}
		this.anInt9495 = arg0.method7895();
		arg0.method7895();
		this.anInt9482 = arg0.method7951();
		this.anInt9493 = arg0.method7954();
		this.aString107 = arg0.method7922();
		this.aBoolean659 = arg0.method7954() == 1;
		this.aByte130 = arg0.method7960();
		this.aByte127 = arg0.method7960();
		this.aByte128 = arg0.method7960();
		this.aByte129 = arg0.method7960();
		@Pc(197) int local197;
		if (this.anInt9482 > 0) {
			if (this.aBoolean660 && (this.aLongArray18 == null || this.aLongArray18.length < this.anInt9482)) {
				this.aLongArray18 = new long[this.anInt9482];
			}
			if (this.aBoolean657 && (this.aStringArray62 == null || this.anInt9482 > this.aStringArray62.length)) {
				this.aStringArray62 = new String[this.anInt9482];
			}
			if (this.aByteArray87 == null || this.anInt9482 > this.aByteArray87.length) {
				this.aByteArray87 = new byte[this.anInt9482];
			}
			if (this.anIntArray512 == null || this.anIntArray512.length < this.anInt9482) {
				this.anIntArray512 = new int[this.anInt9482];
			}
			for (local197 = 0; local197 < this.anInt9482; local197++) {
				if (this.aBoolean660) {
					this.aLongArray18[local197] = arg0.method7946();
				}
				if (this.aBoolean657) {
					this.aStringArray62[local197] = arg0.method7917();
				}
				this.aByteArray87[local197] = arg0.method7960();
				if (local9 >= 2) {
					this.anIntArray512[local197] = arg0.method7895();
				}
			}
			this.method7739();
		}
		if (this.anInt9493 > 0) {
			if (this.aBoolean660 && (this.aLongArray17 == null || this.aLongArray17.length < this.anInt9493)) {
				this.aLongArray17 = new long[this.anInt9493];
			}
			if (this.aBoolean657 && (this.aStringArray61 == null || this.anInt9493 > this.aStringArray61.length)) {
				this.aStringArray61 = new String[this.anInt9493];
			}
			for (local197 = 0; local197 < this.anInt9493; local197++) {
				if (this.aBoolean660) {
					this.aLongArray17[local197] = arg0.method7946();
				}
				if (this.aBoolean657) {
					this.aStringArray61[local197] = arg0.method7917();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local197 = arg0.method7951();
		if (local197 <= 0) {
			return;
		}
		this.aClass333_41 = new Class333(local197 < 16 ? Static585.method7772(local197) : 16);
		while (local197-- > 0) {
			@Pc(349) int local349 = arg0.method7895();
			@Pc(353) int local353 = local349 & 0x3FFFFFFF;
			@Pc(357) int local357 = local349 >>> 30;
			if (local357 == 0) {
				@Pc(366) int local366 = arg0.method7895();
				this.aClass333_41.method7488((long) local353, new Class3_Sub24(local366));
			} else if (local357 == 1) {
				@Pc(385) long local385 = arg0.method7946();
				this.aClass333_41.method7488((long) local353, new Class3_Sub11(local385));
			} else if (local357 == 2) {
				@Pc(404) String local404 = arg0.method7922();
				this.aClass333_41.method7488((long) local353, new Class3_Sub19(local404));
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBII)Ljava/lang/Integer;")
	public Integer method7731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass333_41 == null) {
			return null;
		}
		@Pc(23) Class3 local23 = this.aClass333_41.method7489((long) arg2);
		if (local23 != null && local23 instanceof Class3_Sub24) {
			@Pc(45) int local45 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
			return Integer.valueOf((((Class3_Sub24) local23).anInt3846 & local45) >>> arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IJI)Z")
	public boolean method7733(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		if (this.aClass333_41 == null) {
			this.aClass333_41 = new Class333(4);
		} else {
			@Pc(17) Class3 local17 = this.aClass333_41.method7489((long) arg1);
			if (local17 != null) {
				if (local17 instanceof Class3_Sub11) {
					@Pc(25) Class3_Sub11 local25 = (Class3_Sub11) local17;
					if (arg0 == local25.aLong57) {
						return false;
					}
					local25.aLong57 = arg0;
					return true;
				}
				local17.method9034();
			}
		}
		this.aClass333_41.method7488((long) arg1, new Class3_Sub11(arg0));
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)Z")
	public boolean method7734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = (0x1 << arg1) - 1;
		@Pc(29) int local29 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(33) int local33 = local14 ^ local29;
		@Pc(37) int local37 = arg3 << arg1;
		@Pc(41) int local41 = local37 & local33;
		if (this.aClass333_41 == null) {
			this.aClass333_41 = new Class333(4);
		} else {
			@Pc(59) Class3 local59 = this.aClass333_41.method7489((long) arg0);
			if (local59 != null) {
				if (local59 instanceof Class3_Sub24) {
					@Pc(67) Class3_Sub24 local67 = (Class3_Sub24) local59;
					if ((local67.anInt3846 & local33) == local41) {
						return false;
					}
					local67.anInt3846 &= ~local33;
					local67.anInt3846 |= local41;
					return true;
				}
				local59.method9034();
			}
		}
		this.aClass333_41.method7488((long) arg0, new Class3_Sub24(local41));
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method7735(@OriginalArg(0) int arg0) {
		if (this.aClass333_41 == null) {
			return null;
		} else {
			@Pc(15) Class3 local15 = this.aClass333_41.method7489((long) arg0);
			return local15 != null && local15 instanceof Class3_Sub24 ? Integer.valueOf(((Class3_Sub24) local15).anInt3846) : null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V")
	public void method7736(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt9482) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt9482);
		}
		this.anIntArray513 = null;
		this.anInt9482--;
		if (this.anInt9482 == 0) {
			this.anInt9497 = -1;
			this.anInt9496 = -1;
			this.aStringArray62 = null;
			this.anIntArray512 = null;
			this.aLongArray18 = null;
			this.aByteArray87 = null;
			return;
		}
		Static681.method4034(this.aByteArray87, arg0 + 1, this.aByteArray87, arg0, this.anInt9482 - arg0);
		Static681.method4031(this.anIntArray512, arg0 + 1, this.anIntArray512, arg0, this.anInt9482 - arg0);
		if (this.aLongArray18 != null) {
			Static681.method4036(this.aLongArray18, arg0 + 1, this.aLongArray18, arg0, this.anInt9482 - arg0);
		}
		if (this.aStringArray62 != null) {
			Static681.method4033(this.aStringArray62, arg0 + 1, this.aStringArray62, arg0, this.anInt9482 - arg0);
		}
		if (this.anInt9497 == arg0 || arg0 == this.anInt9496) {
			this.method7739();
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BII)I")
	public int method7737(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 126 || arg0 == 127) {
			return -1;
		} else if (arg1 == this.anInt9497 && (this.anInt9496 == -1 || this.aByteArray87[this.anInt9496] < 125)) {
			return -1;
		} else if (this.aByteArray87[arg1] == arg0) {
			return -1;
		} else {
			this.aByteArray87[arg1] = arg0;
			this.method7739();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method7738(@OriginalArg(0) int arg0) {
		if (this.aClass333_41 == null) {
			return null;
		} else {
			@Pc(20) Class3 local20 = this.aClass333_41.method7489((long) arg0);
			return local20 != null && local20 instanceof Class3_Sub19 ? ((Class3_Sub19) local20).aString42 : null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
	private void method7739() {
		if (this.anInt9482 == 0) {
			this.anInt9497 = -1;
			this.anInt9496 = -1;
			return;
		}
		this.anInt9496 = -1;
		this.anInt9497 = -1;
		@Pc(23) int local23 = 0;
		@Pc(28) byte local28 = this.aByteArray87[0];
		for (@Pc(30) int local30 = 1; local30 < this.anInt9482; local30++) {
			if (local28 < this.aByteArray87[local30]) {
				if (local28 == 125) {
					this.anInt9496 = local23;
				}
				local23 = local30;
				local28 = this.aByteArray87[local30];
			} else if (this.anInt9496 == -1 && this.aByteArray87[local30] == 125) {
				this.anInt9496 = local30;
			}
		}
		this.anInt9497 = local23;
		if (this.anInt9497 != -1) {
			this.aByteArray87[this.anInt9497] = 126;
		}
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)V")
	private void method7740(@OriginalArg(0) int arg0) {
		if (this.aBoolean660) {
			if (this.aLongArray18 == null) {
				this.aLongArray18 = new long[arg0];
			} else {
				Static681.method4036(this.aLongArray18, 0, this.aLongArray18 = new long[arg0], 0, this.anInt9482);
			}
		}
		if (this.aBoolean657) {
			if (this.aStringArray62 == null) {
				this.aStringArray62 = new String[arg0];
			} else {
				Static681.method4033(this.aStringArray62, 0, this.aStringArray62 = new String[arg0], 0, this.anInt9482);
			}
		}
		if (this.aByteArray87 == null) {
			this.aByteArray87 = new byte[arg0];
		} else {
			Static681.method4034(this.aByteArray87, 0, this.aByteArray87 = new byte[arg0], 0, this.anInt9482);
		}
		if (this.anIntArray512 == null) {
			this.anIntArray512 = new int[arg0];
		} else {
			Static681.method4031(this.anIntArray512, 0, this.anIntArray512 = new int[arg0], 0, this.anInt9482);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZI)I")
	public int method7741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		return (this.anIntArray512[arg2] & local23) >>> arg1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)Ljava/lang/Long;")
	public Long method7742(@OriginalArg(0) int arg0) {
		if (this.aClass333_41 == null) {
			return null;
		} else {
			@Pc(20) Class3 local20 = this.aClass333_41.method7489((long) arg0);
			return local20 != null && local20 instanceof Class3_Sub11 ? Long.valueOf(((Class3_Sub11) local20).aLong57) : null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)[I")
	public int[] method7743() {
		if (this.anIntArray513 == null) {
			@Pc(12) String[] local12 = new String[this.anInt9482];
			this.anIntArray513 = new int[this.anInt9482];
			@Pc(19) int local19 = 0;
			while (local19 < this.anInt9482) {
				local12[local19] = this.aStringArray62[local19];
				this.anIntArray513[local19] = local19++;
			}
			Static304.method4417(local12, this.anIntArray513);
		}
		return this.anIntArray513;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;IJ)V")
	public void method7744(@OriginalArg(0) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (this.aBoolean660 == arg1 <= 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean660 + " but userhash:" + arg1);
		} else if ((arg0 == null) == this.aBoolean657) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean657 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray17 == null || this.aLongArray17.length <= this.anInt9493) || arg0 != null && (this.aStringArray61 == null || this.anInt9493 >= this.aStringArray61.length)) {
				this.method7748(this.anInt9493 + 5);
			}
			if (this.aLongArray17 != null) {
				this.aLongArray17[this.anInt9493] = arg1;
			}
			if (this.aStringArray61 != null) {
				this.aStringArray61[this.anInt9493] = arg0;
			}
			this.anInt9493++;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBIII)I")
	public int method7745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg3) - 1;
		@Pc(28) int local28 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		@Pc(32) int local32 = arg2 << arg3;
		@Pc(36) int local36 = local9 ^ local28;
		@Pc(40) int local40 = local32 & local36;
		@Pc(45) int local45 = this.anIntArray512[arg1];
		if ((local36 & local45) == local40) {
			return -1;
		} else {
			local45 &= ~local36;
			this.anIntArray512[arg1] = local40 | local45;
			return arg1;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method7747(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt9482; local15++) {
			if (this.aStringArray62[local15].equals(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(II)V")
	private void method7748(@OriginalArg(0) int arg0) {
		if (this.aBoolean660) {
			if (this.aLongArray17 == null) {
				this.aLongArray17 = new long[arg0];
			} else {
				Static681.method4036(this.aLongArray17, 0, this.aLongArray17 = new long[arg0], 0, this.anInt9493);
			}
		}
		if (!this.aBoolean657) {
			return;
		}
		if (this.aStringArray61 == null) {
			this.aStringArray61 = new String[arg0];
		} else {
			Static681.method4033(this.aStringArray61, 0, this.aStringArray61 = new String[arg0], 0, this.anInt9493);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public boolean method7749(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass333_41 == null) {
			this.aClass333_41 = new Class333(4);
		} else {
			@Pc(38) Class3 local38 = this.aClass333_41.method7489((long) arg0);
			if (local38 != null) {
				if (local38 instanceof Class3_Sub19) {
					@Pc(46) Class3_Sub19 local46 = (Class3_Sub19) local38;
					if (local46.aString42.equals(arg1)) {
						return false;
					}
					local46.aString42 = arg1;
					return true;
				}
				local38.method9034();
			}
		}
		this.aClass333_41.method7488((long) arg0, new Class3_Sub19(arg1));
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(II)V")
	public void method7750(@OriginalArg(1) int arg0) {
		this.anInt9493--;
		if (this.anInt9493 == 0) {
			this.aStringArray61 = null;
			this.aLongArray17 = null;
			return;
		}
		if (this.aLongArray17 != null) {
			Static681.method4036(this.aLongArray17, arg0 + 1, this.aLongArray17, arg0, this.anInt9493 - arg0);
		}
		if (this.aStringArray61 != null) {
			Static681.method4033(this.aStringArray61, arg0 + 1, this.aStringArray61, arg0, this.anInt9493 - arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZI)Z")
	public boolean method7751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass333_41 == null) {
			this.aClass333_41 = new Class333(4);
		} else {
			@Pc(13) Class3 local13 = this.aClass333_41.method7489((long) arg1);
			if (local13 != null) {
				if (local13 instanceof Class3_Sub24) {
					@Pc(21) Class3_Sub24 local21 = (Class3_Sub24) local13;
					if (local21.anInt3846 == arg0) {
						return false;
					}
					local21.anInt3846 = arg0;
					return true;
				}
				local13.method9034();
			}
		}
		this.aClass333_41.method7488((long) arg1, new Class3_Sub24(arg0));
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(JLjava/lang/String;I)V")
	public void method7752(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (arg0 <= 0L == this.aBoolean660) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean660 + " but userhash:" + arg0);
		} else if ((arg1 == null) == this.aBoolean657) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean657 + " but displayname:" + arg1);
		} else {
			if (arg0 > 0L && (this.aLongArray18 == null || this.aLongArray18.length <= this.anInt9482) || arg1 != null && (this.aStringArray62 == null || this.anInt9482 >= this.aStringArray62.length)) {
				this.method7740(this.anInt9482 + 5);
			}
			if (this.aLongArray18 != null) {
				this.aLongArray18[this.anInt9482] = arg0;
			}
			if (this.aStringArray62 != null) {
				this.aStringArray62[this.anInt9482] = arg1;
			}
			if (this.anInt9497 == -1) {
				this.anInt9497 = this.anInt9482;
				this.aByteArray87[this.anInt9482] = 126;
			} else {
				this.aByteArray87[this.anInt9482] = 0;
			}
			this.anIntArray512[this.anInt9482] = 0;
			this.anIntArray513 = null;
			this.anInt9482++;
		}
	}
}
