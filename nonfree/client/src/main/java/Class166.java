import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class166 {

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "Lclient!rda;")
	private Class300 aClass300_20;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "B")
	public byte aByte71;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "Z")
	public boolean aBoolean414;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "[J")
	private long[] aLongArray17;

	@OriginalMember(owner = "client!im", name = "x", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!im", name = "y", descriptor = "I")
	public int anInt4857;

	@OriginalMember(owner = "client!im", name = "B", descriptor = "[J")
	private long[] aLongArray18;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!im", name = "G", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!im", name = "I", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray28;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "I")
	public int anInt4865;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!im", name = "R", descriptor = "J")
	public long aLong121;

	@OriginalMember(owner = "client!im", name = "S", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray29;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Ljava/lang/String;")
	public String aString39 = null;

	@OriginalMember(owner = "client!im", name = "F", descriptor = "I")
	private int anInt4862 = 0;

	@OriginalMember(owner = "client!im", name = "N", descriptor = "I")
	public int anInt4866 = -1;

	@OriginalMember(owner = "client!im", name = "P", descriptor = "I")
	public int anInt4868 = -1;

	@OriginalMember(owner = "client!im", name = "H", descriptor = "I")
	public int anInt4863 = 0;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class166(@OriginalArg(0) Class5_Sub41 arg0) {
		this.method4098(arg0);
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	private Class166() {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method4089(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4865; local12++) {
			if (this.aStringArray28[local12].equals(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Ljava/lang/Long;")
	public Long method4090(@OriginalArg(1) int arg0) {
		if (this.aClass300_20 == null) {
			return null;
		} else {
			@Pc(23) Class5 local23 = this.aClass300_20.method7188((long) arg0);
			return local23 != null && local23 instanceof Class5_Sub8 ? Long.valueOf(((Class5_Sub8) local23).aLong24) : null;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;IJ)V")
	public void method4091(@OriginalArg(0) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 > 0L != this.aBoolean413) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean413 + " but userhash:" + arg1);
		} else if ((arg0 != null) == this.aBoolean415) {
			if (arg1 > 0L && (this.aLongArray17 == null || this.aLongArray17.length <= this.anInt4865) || arg0 != null && (this.aStringArray28 == null || this.aStringArray28.length <= this.anInt4865)) {
				this.method4099(this.anInt4865 + 5);
			}
			if (this.aLongArray17 != null) {
				this.aLongArray17[this.anInt4865] = arg1;
			}
			if (this.aStringArray28 != null) {
				this.aStringArray28[this.anInt4865] = arg0;
			}
			if (this.anInt4866 == -1) {
				this.anInt4866 = this.anInt4865;
				this.aByteArray43[this.anInt4865] = 126;
			} else {
				this.aByteArray43[this.anInt4865] = 0;
			}
			this.anIntArray256[this.anInt4865] = 0;
			this.anIntArray255 = null;
			this.anInt4865++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean415 + " but displayname:" + arg0);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	private void method4092() {
		if (this.anInt4865 == 0) {
			this.anInt4868 = -1;
			this.anInt4866 = -1;
			return;
		}
		this.anInt4868 = -1;
		this.anInt4866 = -1;
		@Pc(23) int local23 = 0;
		@Pc(28) byte local28 = this.aByteArray43[0];
		for (@Pc(30) int local30 = 1; local30 < this.anInt4865; local30++) {
			if (this.aByteArray43[local30] > local28) {
				if (local28 == 125) {
					this.anInt4868 = local23;
				}
				local28 = this.aByteArray43[local30];
				local23 = local30;
			} else if (this.anInt4868 == -1 && this.aByteArray43[local30] == 125) {
				this.anInt4868 = local30;
			}
		}
		this.anInt4866 = local23;
		if (this.anInt4866 != -1) {
			this.aByteArray43[this.anInt4866] = 126;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;ZI)Z")
	public boolean method4093(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass300_20 == null) {
			this.aClass300_20 = new Class300(4);
		} else {
			@Pc(43) Class5 local43 = this.aClass300_20.method7188((long) arg1);
			if (local43 != null) {
				if (local43 instanceof Class5_Sub11) {
					@Pc(51) Class5_Sub11 local51 = (Class5_Sub11) local43;
					if (local51.aString8.equals(arg0)) {
						return false;
					}
					local51.aString8 = arg0;
					return true;
				}
				local43.method9052();
			}
		}
		this.aClass300_20.method7191(new Class5_Sub11(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method4094(@OriginalArg(1) int arg0) {
		if (this.aClass300_20 == null) {
			return null;
		} else {
			@Pc(15) Class5 local15 = this.aClass300_20.method7188((long) arg0);
			return local15 != null && local15 instanceof Class5_Sub47 ? Integer.valueOf(((Class5_Sub47) local15).anInt8308) : null;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIII)I")
	public int method4095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg3) - 1;
		@Pc(24) int local24 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(28) int local28 = local24 ^ local9;
		@Pc(32) int local32 = arg1 << arg3;
		@Pc(36) int local36 = local32 & local28;
		@Pc(41) int local41 = this.anIntArray256[arg0];
		if (local36 == (local28 & local41)) {
			return -1;
		} else {
			local41 &= ~local28;
			this.anIntArray256[arg0] = local41 | local36;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)[I")
	public int[] method4096() {
		if (this.anIntArray255 == null) {
			@Pc(16) String[] local16 = new String[this.anInt4865];
			this.anIntArray255 = new int[this.anInt4865];
			@Pc(23) int local23 = 0;
			while (this.anInt4865 > local23) {
				local16[local23] = this.aStringArray28[local23];
				this.anIntArray255[local23] = local23++;
			}
			Static41.method595(this.anIntArray255, local16);
		}
		return this.anIntArray255;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(II)V")
	public void method4097(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4865) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt4865);
		}
		this.anInt4865--;
		this.anIntArray255 = null;
		if (this.anInt4865 == 0) {
			this.aStringArray28 = null;
			this.aLongArray17 = null;
			this.anInt4868 = -1;
			this.aByteArray43 = null;
			this.anInt4866 = -1;
			this.anIntArray256 = null;
			return;
		}
		Static686.method4972(this.aByteArray43, arg0 + 1, this.aByteArray43, arg0, this.anInt4865 - arg0);
		Static686.method4967(this.anIntArray256, arg0 + 1, this.anIntArray256, arg0, this.anInt4865 - arg0);
		if (this.aLongArray17 != null) {
			Static686.method4971(this.aLongArray17, arg0 + 1, this.aLongArray17, arg0, this.anInt4865 - arg0);
		}
		if (this.aStringArray28 != null) {
			Static686.method4966(this.aStringArray28, arg0 + 1, this.aStringArray28, arg0, this.anInt4865 - arg0);
		}
		if (this.anInt4866 == arg0 || this.anInt4868 == arg0) {
			this.method4092();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!mc;Z)V")
	private void method4098(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(9) int local9 = arg0.method7816();
		if (local9 < 1 || local9 > 4) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(30) int local30 = arg0.method7816();
		if ((local30 & 0x2) != 0) {
			this.aBoolean415 = true;
		}
		if ((local30 & 0x1) != 0) {
			this.aBoolean413 = true;
		}
		if (!this.aBoolean413) {
			this.aLongArray18 = null;
			this.aLongArray17 = null;
		}
		if (!this.aBoolean415) {
			this.aStringArray28 = null;
			this.aStringArray29 = null;
		}
		this.anInt4863 = arg0.method7804();
		this.anInt4862 = arg0.method7804();
		if (local9 <= 3 && this.anInt4862 != 0) {
			this.anInt4862 += 16912800;
		}
		this.anInt4865 = arg0.method7860();
		this.anInt4857 = arg0.method7816();
		this.aString39 = arg0.method7847();
		if (local9 >= 4) {
			arg0.method7804();
		}
		this.aBoolean414 = arg0.method7816() == 1;
		this.aByte72 = arg0.method7861();
		this.aByte70 = arg0.method7861();
		this.aByte71 = arg0.method7861();
		this.aByte73 = arg0.method7861();
		@Pc(240) int local240;
		if (this.anInt4865 > 0) {
			if (this.aBoolean413 && (this.aLongArray17 == null || this.aLongArray17.length < this.anInt4865)) {
				this.aLongArray17 = new long[this.anInt4865];
			}
			if (this.aBoolean415 && (this.aStringArray28 == null || this.anInt4865 > this.aStringArray28.length)) {
				this.aStringArray28 = new String[this.anInt4865];
			}
			if (this.aByteArray43 == null || this.anInt4865 > this.aByteArray43.length) {
				this.aByteArray43 = new byte[this.anInt4865];
			}
			if (this.anIntArray256 == null || this.anIntArray256.length < this.anInt4865) {
				this.anIntArray256 = new int[this.anInt4865];
			}
			for (local240 = 0; local240 < this.anInt4865; local240++) {
				if (this.aBoolean413) {
					this.aLongArray17[local240] = arg0.method7823();
				}
				if (this.aBoolean415) {
					this.aStringArray28[local240] = arg0.method7815();
				}
				this.aByteArray43[local240] = arg0.method7861();
				if (local9 >= 2) {
					this.anIntArray256[local240] = arg0.method7804();
				}
			}
			this.method4092();
		}
		if (this.anInt4857 > 0) {
			if (this.aBoolean413 && (this.aLongArray18 == null || this.aLongArray18.length < this.anInt4857)) {
				this.aLongArray18 = new long[this.anInt4857];
			}
			if (this.aBoolean415 && (this.aStringArray29 == null || this.anInt4857 > this.aStringArray29.length)) {
				this.aStringArray29 = new String[this.anInt4857];
			}
			for (local240 = 0; local240 < this.anInt4857; local240++) {
				if (this.aBoolean413) {
					this.aLongArray18[local240] = arg0.method7823();
				}
				if (this.aBoolean415) {
					this.aStringArray29[local240] = arg0.method7815();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local240 = arg0.method7860();
		if (local240 <= 0) {
			return;
		}
		this.aClass300_20 = new Class300(local240 >= 16 ? 16 : Static67.method917(local240));
		while (local240-- > 0) {
			@Pc(389) int local389 = arg0.method7804();
			@Pc(393) int local393 = local389 & 0x3FFFFFFF;
			@Pc(397) int local397 = local389 >>> 30;
			if (local397 == 0) {
				@Pc(441) int local441 = arg0.method7804();
				this.aClass300_20.method7191(new Class5_Sub47(local441), (long) local393);
			} else if (local397 == 1) {
				@Pc(406) long local406 = arg0.method7823();
				this.aClass300_20.method7191(new Class5_Sub8(local406), (long) local393);
			} else if (local397 == 2) {
				@Pc(425) String local425 = arg0.method7847();
				this.aClass300_20.method7191(new Class5_Sub11(local425), (long) local393);
			}
		}
		return;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(II)V")
	private void method4099(@OriginalArg(0) int arg0) {
		if (this.aBoolean413) {
			if (this.aLongArray17 == null) {
				this.aLongArray17 = new long[arg0];
			} else {
				Static686.method4971(this.aLongArray17, 0, this.aLongArray17 = new long[arg0], 0, this.anInt4865);
			}
		}
		if (this.aBoolean415) {
			if (this.aStringArray28 == null) {
				this.aStringArray28 = new String[arg0];
			} else {
				Static686.method4966(this.aStringArray28, 0, this.aStringArray28 = new String[arg0], 0, this.anInt4865);
			}
		}
		if (this.aByteArray43 == null) {
			this.aByteArray43 = new byte[arg0];
		} else {
			Static686.method4972(this.aByteArray43, 0, this.aByteArray43 = new byte[arg0], 0, this.anInt4865);
		}
		if (this.anIntArray256 == null) {
			this.anIntArray256 = new int[arg0];
		} else {
			Static686.method4967(this.anIntArray256, 0, this.anIntArray256 = new int[arg0], 0, this.anInt4865);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;J)V")
	public void method4101(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (this.aBoolean413 != arg1 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean413 + " but userhash:" + arg1);
		} else if (this.aBoolean415 == (arg0 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean415 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray18 == null || this.anInt4857 >= this.aLongArray18.length) || arg0 != null && (this.aStringArray29 == null || this.anInt4857 >= this.aStringArray29.length)) {
				this.method4103(this.anInt4857 + 5);
			}
			if (this.aLongArray18 != null) {
				this.aLongArray18[this.anInt4857] = arg1;
			}
			if (this.aStringArray29 != null) {
				this.aStringArray29[this.anInt4857] = arg0;
			}
			this.anInt4857++;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZI)V")
	private void method4103(@OriginalArg(1) int arg0) {
		if (this.aBoolean413) {
			if (this.aLongArray18 == null) {
				this.aLongArray18 = new long[arg0];
			} else {
				Static686.method4971(this.aLongArray18, 0, this.aLongArray18 = new long[arg0], 0, this.anInt4857);
			}
		}
		if (!this.aBoolean415) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			Static686.method4966(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4857);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)V")
	public void method4104(@OriginalArg(0) int arg0) {
		this.anInt4857--;
		if (this.anInt4857 == 0) {
			this.aStringArray29 = null;
			this.aLongArray18 = null;
			return;
		}
		if (this.aLongArray18 != null) {
			Static686.method4971(this.aLongArray18, arg0 + 1, this.aLongArray18, arg0, this.anInt4857 - arg0);
		}
		if (this.aStringArray29 != null) {
			Static686.method4966(this.aStringArray29, arg0 + 1, this.aStringArray29, arg0, this.anInt4857 - arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIII)Ljava/lang/Integer;")
	public Integer method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass300_20 == null) {
			return null;
		}
		@Pc(20) Class5 local20 = this.aClass300_20.method7188((long) arg2);
		if (local20 != null && local20 instanceof Class5_Sub47) {
			@Pc(40) int local40 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
			return Integer.valueOf((local40 & ((Class5_Sub47) local20).anInt8308) >>> arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(IBI)I")
	public int method4106(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt4866 && (this.anInt4868 == -1 || this.aByteArray43[this.anInt4868] < 125)) {
			return -1;
		} else if (this.aByteArray43[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray43[arg0] = arg1;
			this.method4092();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBII)I")
	public int method4107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray256[arg1] & local23) >>> arg0;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(IIIII)Z")
	public boolean method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg0) - 1;
		@Pc(22) int local22 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(26) int local26 = local9 ^ local22;
		@Pc(30) int local30 = arg3 << arg0;
		@Pc(34) int local34 = local30 & local26;
		if (this.aClass300_20 == null) {
			this.aClass300_20 = new Class300(4);
		} else {
			@Pc(44) Class5 local44 = this.aClass300_20.method7188((long) arg1);
			if (local44 != null) {
				if (local44 instanceof Class5_Sub47) {
					@Pc(52) Class5_Sub47 local52 = (Class5_Sub47) local44;
					if ((local26 & local52.anInt8308) == local34) {
						return false;
					}
					local52.anInt8308 &= ~local26;
					local52.anInt8308 |= local34;
					return true;
				}
				local44.method9052();
			}
		}
		this.aClass300_20.method7191(new Class5_Sub47(local34), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BIJ)Z")
	public boolean method4109(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass300_20 == null) {
			this.aClass300_20 = new Class300(4);
		} else {
			@Pc(29) Class5 local29 = this.aClass300_20.method7188((long) arg0);
			if (local29 != null) {
				if (local29 instanceof Class5_Sub8) {
					@Pc(37) Class5_Sub8 local37 = (Class5_Sub8) local29;
					if (arg1 == local37.aLong24) {
						return false;
					}
					local37.aLong24 = arg1;
					return true;
				}
				local29.method9052();
			}
		}
		this.aClass300_20.method7191(new Class5_Sub8(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z")
	public boolean method4110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass300_20 == null) {
			this.aClass300_20 = new Class300(4);
		} else {
			@Pc(13) Class5 local13 = this.aClass300_20.method7188((long) arg1);
			if (local13 != null) {
				if (local13 instanceof Class5_Sub47) {
					@Pc(21) Class5_Sub47 local21 = (Class5_Sub47) local13;
					if (local21.anInt8308 == arg0) {
						return false;
					}
					local21.anInt8308 = arg0;
					return true;
				}
				local13.method9052();
			}
		}
		this.aClass300_20.method7191(new Class5_Sub47(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(II)Ljava/lang/String;")
	public String method4111(@OriginalArg(1) int arg0) {
		if (this.aClass300_20 == null) {
			return null;
		} else {
			@Pc(23) Class5 local23 = this.aClass300_20.method7188((long) arg0);
			return local23 != null && local23 instanceof Class5_Sub11 ? ((Class5_Sub11) local23).aString8 : null;
		}
	}
}
