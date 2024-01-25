import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class185 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray15;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "[J")
	private long[] aLongArray9;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
	private boolean aBoolean368;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray16;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "B")
	public byte aByte71;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	public int anInt5057;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Z")
	public boolean aBoolean369;

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "Lclient!ee;")
	private Class83 aClass83_16;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Z")
	private boolean aBoolean370;

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "B")
	public byte aByte74;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "[J")
	private long[] aLongArray10;

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
	public int anInt5076;

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "J")
	public long aLong159;

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "[I")
	private int[] anIntArray450;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public int anInt5049 = -1;

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "Ljava/lang/String;")
	public String aString48 = null;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
	private int anInt5066 = 0;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	public int anInt5071 = 0;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
	public int anInt5074 = -1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class185(@OriginalArg(0) Class3_Sub25 arg0) {
		this.method4644(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	private Class185() {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method4633(@OriginalArg(0) int arg0) {
		if (this.aClass83_16 == null) {
			return null;
		} else {
			@Pc(26) Class3 local26 = this.aClass83_16.method2368((long) arg0);
			return local26 != null && local26 instanceof Class3_Sub33 ? Integer.valueOf(((Class3_Sub33) local26).anInt4831) : null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
	public boolean method4635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass83_16 == null) {
			this.aClass83_16 = new Class83(4);
		} else {
			@Pc(13) Class3 local13 = this.aClass83_16.method2368((long) arg0);
			if (local13 != null) {
				if (local13 instanceof Class3_Sub33) {
					@Pc(21) Class3_Sub33 local21 = (Class3_Sub33) local13;
					if (arg1 == local21.anInt4831) {
						return false;
					}
					local21.anInt4831 = arg1;
					return true;
				}
				local13.method9380();
			}
		}
		this.aClass83_16.method2377((long) arg0, new Class3_Sub33(arg1));
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZII)I")
	public int method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg1) - 1;
		@Pc(22) int local22 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(26) int local26 = local22 ^ local9;
		@Pc(36) int local36 = arg3 << arg1;
		@Pc(40) int local40 = local36 & local26;
		@Pc(45) int local45 = this.anIntArray450[arg0];
		if (local40 == (local45 & local26)) {
			return -1;
		} else {
			local45 &= ~local26;
			this.anIntArray450[arg0] = local45 | local40;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)[I")
	public int[] method4637() {
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[this.anInt5057];
			@Pc(23) String[] local23 = new String[this.anInt5057];
			@Pc(25) int local25 = 0;
			while (local25 < this.anInt5057) {
				local23[local25] = this.aStringArray16[local25];
				this.anIntArray449[local25] = local25++;
			}
			Static579.method8158(this.anIntArray449, local23);
		}
		return this.anIntArray449;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZII)Ljava/lang/Integer;")
	public Integer method4638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass83_16 == null) {
			return null;
		}
		@Pc(21) Class3 local21 = this.aClass83_16.method2368((long) arg2);
		if (local21 != null && local21 instanceof Class3_Sub33) {
			@Pc(43) int local43 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
			return Integer.valueOf((local43 & ((Class3_Sub33) local21).anInt4831) >>> arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BJLjava/lang/String;)V")
	public void method4639(@OriginalArg(1) long arg0, @OriginalArg(2) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (arg0 > 0L != this.aBoolean368) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean368 + " but userhash:" + arg0);
		} else if (this.aBoolean370 == (arg1 != null)) {
			if (arg0 > 0L && (this.aLongArray10 == null || this.anInt5057 >= this.aLongArray10.length) || arg1 != null && (this.aStringArray16 == null || this.anInt5057 >= this.aStringArray16.length)) {
				this.method4656(this.anInt5057 + 5);
			}
			if (this.aLongArray10 != null) {
				this.aLongArray10[this.anInt5057] = arg0;
			}
			if (this.aStringArray16 != null) {
				this.aStringArray16[this.anInt5057] = arg1;
			}
			if (this.anInt5049 == -1) {
				this.anInt5049 = this.anInt5057;
				this.aByteArray46[this.anInt5057] = 126;
			} else {
				this.aByteArray46[this.anInt5057] = 0;
			}
			this.anIntArray450[this.anInt5057] = 0;
			this.anInt5057++;
			this.anIntArray449 = null;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean370 + " but displayname:" + arg1);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	private void method4640() {
		if (this.anInt5057 == 0) {
			this.anInt5074 = -1;
			this.anInt5049 = -1;
			return;
		}
		this.anInt5074 = -1;
		this.anInt5049 = -1;
		@Pc(26) int local26 = 0;
		@Pc(31) byte local31 = this.aByteArray46[0];
		for (@Pc(33) int local33 = 1; local33 < this.anInt5057; local33++) {
			if (local31 < this.aByteArray46[local33]) {
				if (local31 == 125) {
					this.anInt5074 = local26;
				}
				local26 = local33;
				local31 = this.aByteArray46[local33];
			} else if (this.anInt5074 == -1 && this.aByteArray46[local33] == 125) {
				this.anInt5074 = local33;
			}
		}
		this.anInt5049 = local26;
		if (this.anInt5049 != -1) {
			this.aByteArray46[this.anInt5049] = 126;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Ljava/lang/Long;")
	public Long method4641(@OriginalArg(0) int arg0) {
		if (this.aClass83_16 == null) {
			return null;
		} else {
			@Pc(23) Class3 local23 = this.aClass83_16.method2368((long) arg0);
			return local23 != null && local23 instanceof Class3_Sub42 ? Long.valueOf(((Class3_Sub42) local23).aLong197) : null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public boolean method4642(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass83_16 == null) {
			this.aClass83_16 = new Class83(4);
		} else {
			@Pc(32) Class3 local32 = this.aClass83_16.method2368((long) arg1);
			if (local32 != null) {
				if (local32 instanceof Class3_Sub49) {
					@Pc(40) Class3_Sub49 local40 = (Class3_Sub49) local32;
					if (local40.aString100.equals(arg0)) {
						return false;
					}
					local40.aString100 = arg0;
					return true;
				}
				local32.method9380();
			}
		}
		this.aClass83_16.method2377((long) arg1, new Class3_Sub49(arg0));
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
	public void method4643(@OriginalArg(1) int arg0) {
		this.anInt5076--;
		if (this.anInt5076 == 0) {
			this.aLongArray9 = null;
			this.aStringArray15 = null;
			return;
		}
		if (this.aLongArray9 != null) {
			Static684.method5329(this.aLongArray9, arg0 + 1, this.aLongArray9, arg0, this.anInt5076 - arg0);
		}
		if (this.aStringArray15 != null) {
			Static684.method5327(this.aStringArray15, arg0 + 1, this.aStringArray15, arg0, this.anInt5076 - arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!jp;)V")
	private void method4644(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(9) int local9 = arg0.method8632();
		if (local9 < 1 || local9 > 4) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(30) int local30 = arg0.method8632();
		if ((local30 & 0x2) != 0) {
			this.aBoolean370 = true;
		}
		if ((local30 & 0x1) != 0) {
			this.aBoolean368 = true;
		}
		if (!this.aBoolean370) {
			this.aStringArray16 = null;
			this.aStringArray15 = null;
		}
		if (!this.aBoolean368) {
			this.aLongArray10 = null;
			this.aLongArray9 = null;
		}
		this.anInt5071 = arg0.method8618();
		this.anInt5066 = arg0.method8618();
		if (local9 <= 3 && this.anInt5066 != 0) {
			this.anInt5066 += 16912800;
		}
		this.anInt5057 = arg0.method8593();
		this.anInt5076 = arg0.method8632();
		this.aString48 = arg0.method8613();
		if (local9 >= 4) {
			arg0.method8618();
		}
		this.aBoolean369 = arg0.method8632() == 1;
		this.aByte73 = arg0.method8621();
		this.aByte72 = arg0.method8621();
		this.aByte74 = arg0.method8621();
		this.aByte71 = arg0.method8621();
		@Pc(233) int local233;
		if (this.anInt5057 > 0) {
			if (this.aBoolean368 && (this.aLongArray10 == null || this.anInt5057 > this.aLongArray10.length)) {
				this.aLongArray10 = new long[this.anInt5057];
			}
			if (this.aBoolean370 && (this.aStringArray16 == null || this.aStringArray16.length < this.anInt5057)) {
				this.aStringArray16 = new String[this.anInt5057];
			}
			if (this.aByteArray46 == null || this.aByteArray46.length < this.anInt5057) {
				this.aByteArray46 = new byte[this.anInt5057];
			}
			if (this.anIntArray450 == null || this.anInt5057 > this.anIntArray450.length) {
				this.anIntArray450 = new int[this.anInt5057];
			}
			for (local233 = 0; local233 < this.anInt5057; local233++) {
				if (this.aBoolean368) {
					this.aLongArray10[local233] = arg0.method8600();
				}
				if (this.aBoolean370) {
					this.aStringArray16[local233] = arg0.method8617();
				}
				this.aByteArray46[local233] = arg0.method8621();
				if (local9 >= 2) {
					this.anIntArray450[local233] = arg0.method8618();
				}
			}
			this.method4640();
		}
		if (this.anInt5076 > 0) {
			if (this.aBoolean368 && (this.aLongArray9 == null || this.anInt5076 > this.aLongArray9.length)) {
				this.aLongArray9 = new long[this.anInt5076];
			}
			if (this.aBoolean370 && (this.aStringArray15 == null || this.aStringArray15.length < this.anInt5076)) {
				this.aStringArray15 = new String[this.anInt5076];
			}
			for (local233 = 0; local233 < this.anInt5076; local233++) {
				if (this.aBoolean368) {
					this.aLongArray9[local233] = arg0.method8600();
				}
				if (this.aBoolean370) {
					this.aStringArray15[local233] = arg0.method8617();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local233 = arg0.method8593();
		if (local233 <= 0) {
			return;
		}
		this.aClass83_16 = new Class83(local233 < 16 ? Static282.method4521(local233) : 16);
		while (local233-- > 0) {
			@Pc(385) int local385 = arg0.method8618();
			@Pc(389) int local389 = local385 & 0x3FFFFFFF;
			@Pc(393) int local393 = local385 >>> 30;
			if (local393 == 0) {
				@Pc(439) int local439 = arg0.method8618();
				this.aClass83_16.method2377((long) local389, new Class3_Sub33(local439));
			} else if (local393 == 1) {
				@Pc(402) long local402 = arg0.method8600();
				this.aClass83_16.method2377((long) local389, new Class3_Sub42(local402));
			} else if (local393 == 2) {
				@Pc(423) String local423 = arg0.method8613();
				this.aClass83_16.method2377((long) local389, new Class3_Sub49(local423));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	private void method4645(@OriginalArg(0) int arg0) {
		if (this.aBoolean368) {
			if (this.aLongArray9 == null) {
				this.aLongArray9 = new long[arg0];
			} else {
				Static684.method5329(this.aLongArray9, 0, this.aLongArray9 = new long[arg0], 0, this.anInt5076);
			}
		}
		if (!this.aBoolean370) {
			return;
		}
		if (this.aStringArray15 == null) {
			this.aStringArray15 = new String[arg0];
		} else {
			Static684.method5327(this.aStringArray15, 0, this.aStringArray15 = new String[arg0], 0, this.anInt5076);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I")
	public int method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		return (this.anIntArray450[arg1] & local21) >>> arg2;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method4648(@OriginalArg(0) int arg0) {
		if (this.aClass83_16 == null) {
			return null;
		} else {
			@Pc(15) Class3 local15 = this.aClass83_16.method2368((long) arg0);
			return local15 != null && local15 instanceof Class3_Sub49 ? ((Class3_Sub49) local15).aString100 : null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(JII)Z")
	public boolean method4649(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		if (this.aClass83_16 == null) {
			this.aClass83_16 = new Class83(4);
		} else {
			@Pc(19) Class3 local19 = this.aClass83_16.method2368((long) arg1);
			if (local19 != null) {
				if (local19 instanceof Class3_Sub42) {
					@Pc(27) Class3_Sub42 local27 = (Class3_Sub42) local19;
					if (arg0 == local27.aLong197) {
						return false;
					}
					local27.aLong197 = arg0;
					return true;
				}
				local19.method9380();
			}
		}
		this.aClass83_16.method2377((long) arg1, new Class3_Sub42(arg0));
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4650(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt5057; local22++) {
			if (this.aStringArray16[local22].equals(arg0)) {
				return local22;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
	public void method4653(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anInt5057 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt5057);
		}
		this.anIntArray449 = null;
		this.anInt5057--;
		if (this.anInt5057 == 0) {
			this.anInt5074 = -1;
			this.aStringArray16 = null;
			this.aByteArray46 = null;
			this.aLongArray10 = null;
			this.anIntArray450 = null;
			this.anInt5049 = -1;
			return;
		}
		Static684.method5324(this.aByteArray46, arg0 + 1, this.aByteArray46, arg0, this.anInt5057 - arg0);
		Static684.method5326(this.anIntArray450, arg0 + 1, this.anIntArray450, arg0, this.anInt5057 - arg0);
		if (this.aLongArray10 != null) {
			Static684.method5329(this.aLongArray10, arg0 + 1, this.aLongArray10, arg0, this.anInt5057 - arg0);
		}
		if (this.aStringArray16 != null) {
			Static684.method5327(this.aStringArray16, arg0 + 1, this.aStringArray16, arg0, this.anInt5057 - arg0);
		}
		if (arg0 == this.anInt5049 || arg0 == this.anInt5074) {
			this.method4640();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIZI)Z")
	public boolean method4654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg3) - 1;
		@Pc(24) int local24 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(28) int local28 = arg1 << arg3;
		@Pc(37) int local37 = local24 ^ local9;
		@Pc(41) int local41 = local28 & local37;
		if (this.aClass83_16 == null) {
			this.aClass83_16 = new Class83(4);
		} else {
			@Pc(51) Class3 local51 = this.aClass83_16.method2368((long) arg0);
			if (local51 != null) {
				if (local51 instanceof Class3_Sub33) {
					@Pc(59) Class3_Sub33 local59 = (Class3_Sub33) local51;
					if ((local59.anInt4831 & local37) == local41) {
						return false;
					}
					local59.anInt4831 &= ~local37;
					local59.anInt4831 |= local41;
					return true;
				}
				local51.method9380();
			}
		}
		this.aClass83_16.method2377((long) arg0, new Class3_Sub33(local41));
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;IJ)V")
	public void method4655(@OriginalArg(0) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (this.aBoolean368 == arg1 <= 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean368 + " but userhash:" + arg1);
		} else if ((arg0 != null) == this.aBoolean370) {
			if (arg1 > 0L && (this.aLongArray9 == null || this.aLongArray9.length <= this.anInt5076) || arg0 != null && (this.aStringArray15 == null || this.anInt5076 >= this.aStringArray15.length)) {
				this.method4645(this.anInt5076 + 5);
			}
			if (this.aLongArray9 != null) {
				this.aLongArray9[this.anInt5076] = arg1;
			}
			if (this.aStringArray15 != null) {
				this.aStringArray15[this.anInt5076] = arg0;
			}
			this.anInt5076++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean370 + " but displayname:" + arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)V")
	private void method4656(@OriginalArg(0) int arg0) {
		if (this.aBoolean368) {
			if (this.aLongArray10 == null) {
				this.aLongArray10 = new long[arg0];
			} else {
				Static684.method5329(this.aLongArray10, 0, this.aLongArray10 = new long[arg0], 0, this.anInt5057);
			}
		}
		if (this.aBoolean370) {
			if (this.aStringArray16 == null) {
				this.aStringArray16 = new String[arg0];
			} else {
				Static684.method5327(this.aStringArray16, 0, this.aStringArray16 = new String[arg0], 0, this.anInt5057);
			}
		}
		if (this.aByteArray46 == null) {
			this.aByteArray46 = new byte[arg0];
		} else {
			Static684.method5324(this.aByteArray46, 0, this.aByteArray46 = new byte[arg0], 0, this.anInt5057);
		}
		if (this.anIntArray450 == null) {
			this.anIntArray450 = new int[arg0];
		} else {
			Static684.method5326(this.anIntArray450, 0, this.anIntArray450 = new int[arg0], 0, this.anInt5057);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBB)I")
	public int method4657(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt5049 && (this.anInt5074 == -1 || this.aByteArray46[this.anInt5074] < 125)) {
			return -1;
		} else if (this.aByteArray46[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray46[arg0] = arg1;
			this.method4640();
			return arg0;
		}
	}
}
