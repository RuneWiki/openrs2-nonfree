import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class84 {

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!eaa", name = "y", descriptor = "[J")
	private long[] aLongArray4;

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray10;

	@OriginalMember(owner = "client!eaa", name = "L", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!eaa", name = "J", descriptor = "B")
	public byte aByte52;

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "J")
	public long aLong94;

	@OriginalMember(owner = "client!eaa", name = "N", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public int anInt2553;

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!eaa", name = "x", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!eaa", name = "P", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!eaa", name = "B", descriptor = "I")
	public int anInt2562;

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray11;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "Z")
	private boolean aBoolean168;

	@OriginalMember(owner = "client!eaa", name = "z", descriptor = "[J")
	private long[] aLongArray5;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lclient!qn;")
	private Class313 aClass313_11;

	@OriginalMember(owner = "client!eaa", name = "E", descriptor = "B")
	public byte aByte54;

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
	public int anInt2552 = -1;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
	private int anInt2557 = 0;

	@OriginalMember(owner = "client!eaa", name = "F", descriptor = "I")
	public int anInt2556 = 0;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "Ljava/lang/String;")
	public String aString45 = null;

	@OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
	public int anInt2568 = -1;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class84(@OriginalArg(0) Class3_Sub2 arg0) {
		this.method2336(arg0);
	}

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V")
	private Class84() {
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BII)Z")
	public boolean method2319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass313_11 == null) {
			this.aClass313_11 = new Class313(4);
		} else {
			@Pc(21) Class3 local21 = this.aClass313_11.method7104((long) arg0);
			if (local21 != null) {
				if (local21 instanceof Class3_Sub44) {
					@Pc(31) Class3_Sub44 local31 = (Class3_Sub44) local21;
					if (arg1 == local31.anInt7298) {
						return false;
					}
					local31.anInt7298 = arg1;
					return true;
				}
				local21.method9596();
			}
		}
		this.aClass313_11.method7107((long) arg0, new Class3_Sub44(arg1));
		return true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
	public void method2320(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt2562) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt2562);
		}
		this.anInt2562--;
		this.anIntArray157 = null;
		if (this.anInt2562 == 0) {
			this.aByteArray22 = null;
			this.anInt2552 = -1;
			this.aStringArray10 = null;
			this.anInt2568 = -1;
			this.aLongArray5 = null;
			this.anIntArray156 = null;
			this.anIntArray155 = null;
			return;
		}
		Static732.method6320(this.aByteArray22, arg0 + 1, this.aByteArray22, arg0, this.anInt2562 - arg0);
		Static732.method6321(this.anIntArray155, arg0 + 1, this.anIntArray155, arg0, this.anInt2562 - arg0);
		Static732.method6321(this.anIntArray156, arg0 + 1, this.anIntArray156, arg0, this.anInt2562 - arg0);
		if (this.aLongArray5 != null) {
			Static732.method6317(this.aLongArray5, arg0 + 1, this.aLongArray5, arg0, this.anInt2562 - arg0);
		}
		if (this.aStringArray10 != null) {
			Static732.method6316(this.aStringArray10, arg0 + 1, this.aStringArray10, arg0, this.anInt2562 - arg0);
		}
		if (this.anInt2552 == arg0 || arg0 == this.anInt2568) {
			this.method2338();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/lang/String;IJ)V")
	public void method2321(@OriginalArg(0) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 > 0L != this.aBoolean166) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean166 + " but userhash:" + arg1);
		} else if (this.aBoolean168 == (arg0 != null)) {
			if (arg1 > 0L && (this.aLongArray4 == null || this.anInt2553 >= this.aLongArray4.length) || arg0 != null && (this.aStringArray11 == null || this.anInt2553 >= this.aStringArray11.length)) {
				this.method2324(this.anInt2553 + 5);
			}
			if (this.aLongArray4 != null) {
				this.aLongArray4[this.anInt2553] = arg1;
			}
			if (this.aStringArray11 != null) {
				this.aStringArray11[this.anInt2553] = arg0;
			}
			this.anInt2553++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean168 + " but displayname:" + arg0);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(BI)Ljava/lang/Integer;")
	public Integer method2322(@OriginalArg(1) int arg0) {
		if (this.aClass313_11 == null) {
			return null;
		} else {
			@Pc(16) Class3 local16 = this.aClass313_11.method7104((long) arg0);
			return local16 != null && local16 instanceof Class3_Sub44 ? Integer.valueOf(((Class3_Sub44) local16).anInt7298) : null;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(IB)Ljava/lang/Long;")
	public Long method2323(@OriginalArg(0) int arg0) {
		if (this.aClass313_11 == null) {
			return null;
		} else {
			@Pc(24) Class3 local24 = this.aClass313_11.method7104((long) arg0);
			return local24 != null && local24 instanceof Class3_Sub19 ? Long.valueOf(((Class3_Sub19) local24).aLong84) : null;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI)V")
	private void method2324(@OriginalArg(1) int arg0) {
		if (this.aBoolean166) {
			if (this.aLongArray4 == null) {
				this.aLongArray4 = new long[arg0];
			} else {
				Static732.method6317(this.aLongArray4, 0, this.aLongArray4 = new long[arg0], 0, this.anInt2553);
			}
		}
		if (!this.aBoolean168) {
			return;
		}
		if (this.aStringArray11 == null) {
			this.aStringArray11 = new String[arg0];
		} else {
			Static732.method6316(this.aStringArray11, 0, this.aStringArray11 = new String[arg0], 0, this.anInt2553);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)V")
	private void method2325(@OriginalArg(1) int arg0) {
		if (this.aBoolean166) {
			if (this.aLongArray5 == null) {
				this.aLongArray5 = new long[arg0];
			} else {
				Static732.method6317(this.aLongArray5, 0, this.aLongArray5 = new long[arg0], 0, this.anInt2562);
			}
		}
		if (this.aBoolean168) {
			if (this.aStringArray10 == null) {
				this.aStringArray10 = new String[arg0];
			} else {
				Static732.method6316(this.aStringArray10, 0, this.aStringArray10 = new String[arg0], 0, this.anInt2562);
			}
		}
		if (this.aByteArray22 == null) {
			this.aByteArray22 = new byte[arg0];
		} else {
			Static732.method6320(this.aByteArray22, 0, this.aByteArray22 = new byte[arg0], 0, this.anInt2562);
		}
		if (this.anIntArray155 == null) {
			this.anIntArray155 = new int[arg0];
		} else {
			Static732.method6321(this.anIntArray155, 0, this.anIntArray155 = new int[arg0], 0, this.anInt2562);
		}
		if (this.anIntArray156 == null) {
			this.anIntArray156 = new int[arg0];
		} else {
			Static732.method6321(this.anIntArray156, 0, this.anIntArray156 = new int[arg0], 0, this.anInt2562);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method2326(@OriginalArg(0) int arg0) {
		if (this.aClass313_11 == null) {
			return null;
		} else {
			@Pc(22) Class3 local22 = this.aClass313_11.method7104((long) arg0);
			return local22 != null && local22 instanceof Class3_Sub40 ? ((Class3_Sub40) local22).aString78 : null;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIZ)I")
	public int method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		return (local25 & this.anIntArray155[arg0]) >>> arg2;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IB)V")
	public void method2328(@OriginalArg(0) int arg0) {
		this.anInt2553--;
		if (this.anInt2553 == 0) {
			this.aLongArray4 = null;
			this.aStringArray11 = null;
			return;
		}
		if (this.aLongArray4 != null) {
			Static732.method6317(this.aLongArray4, arg0 + 1, this.aLongArray4, arg0, this.anInt2553 - arg0);
		}
		if (this.aStringArray11 != null) {
			Static732.method6316(this.aStringArray11, arg0 + 1, this.aStringArray11, arg0, this.anInt2553 - arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIJ)Z")
	public boolean method2329(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass313_11 == null) {
			this.aClass313_11 = new Class313(4);
		} else {
			@Pc(23) Class3 local23 = this.aClass313_11.method7104((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class3_Sub19) {
					@Pc(33) Class3_Sub19 local33 = (Class3_Sub19) local23;
					if (arg1 == local33.aLong84) {
						return false;
					}
					local33.aLong84 = arg1;
					return true;
				}
				local23.method9596();
			}
		}
		this.aClass313_11.method7107((long) arg0, new Class3_Sub19(arg1));
		return true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method2330(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt2562; local20++) {
			if (this.aStringArray10[local20].equals(arg0)) {
				return local20;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIB)I")
	public int method2331(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt2552 == arg0 && (this.anInt2568 == -1 || this.aByteArray22[this.anInt2568] < 125)) {
			return -1;
		} else if (this.aByteArray22[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray22[arg0] = arg1;
			this.method2338();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIBI)Ljava/lang/Integer;")
	public Integer method2332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass313_11 == null) {
			return null;
		}
		@Pc(18) Class3 local18 = this.aClass313_11.method7104((long) arg0);
		if (local18 != null && local18 instanceof Class3_Sub44) {
			@Pc(50) int local50 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
			return Integer.valueOf((local50 & ((Class3_Sub44) local18).anInt7298) >>> arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)[I")
	public int[] method2333() {
		if (this.anIntArray157 == null) {
			@Pc(8) String[] local8 = new String[this.anInt2562];
			this.anIntArray157 = new int[this.anInt2562];
			@Pc(15) int local15 = 0;
			while (local15 < this.anInt2562) {
				local8[local15] = this.aStringArray10[local15];
				this.anIntArray157[local15] = local15++;
			}
			Static604.method7758(this.anIntArray157, local8);
		}
		return this.anIntArray157;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBJLjava/lang/String;)V")
	public void method2334(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) String arg2) {
		if (arg2 != null && arg2.length() == 0) {
			arg2 = null;
		}
		if (arg1 <= 0L == this.aBoolean166) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean166 + " but userhash:" + arg1);
		} else if ((arg2 != null) == this.aBoolean168) {
			if (arg1 > 0L && (this.aLongArray5 == null || this.aLongArray5.length <= this.anInt2562) || arg2 != null && (this.aStringArray10 == null || this.aStringArray10.length <= this.anInt2562)) {
				this.method2325(this.anInt2562 + 5);
			}
			if (this.aLongArray5 != null) {
				this.aLongArray5[this.anInt2562] = arg1;
			}
			if (this.aStringArray10 != null) {
				this.aStringArray10[this.anInt2562] = arg2;
			}
			if (this.anInt2552 == -1) {
				this.anInt2552 = this.anInt2562;
				this.aByteArray22[this.anInt2562] = 126;
			} else {
				this.aByteArray22[this.anInt2562] = 0;
			}
			this.anIntArray155[this.anInt2562] = 0;
			this.anIntArray156[this.anInt2562] = arg0;
			this.anInt2562++;
			this.anIntArray157 = null;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean168 + " but displayname:" + arg2);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIBI)I")
	public int method2335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg0) - 1;
		@Pc(23) int local23 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		@Pc(27) int local27 = arg2 << arg0;
		@Pc(31) int local31 = local9 ^ local23;
		@Pc(41) int local41 = local27 & local31;
		@Pc(46) int local46 = this.anIntArray155[arg3];
		if (local41 == (local46 & local31)) {
			return -1;
		} else {
			local46 &= ~local31;
			this.anIntArray155[arg3] = local46 | local41;
			return arg3;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZLclient!ika;)V")
	private void method2336(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(9) int local9 = arg0.method2048(255);
		if (local9 < 1 || local9 > 5) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(35) int local35 = arg0.method2048(255);
		if ((local35 & 0x2) != 0) {
			this.aBoolean168 = true;
		}
		if ((local35 & 0x1) != 0) {
			this.aBoolean166 = true;
		}
		if (!this.aBoolean168) {
			this.aStringArray11 = null;
			this.aStringArray10 = null;
		}
		if (!this.aBoolean166) {
			this.aLongArray4 = null;
			this.aLongArray5 = null;
		}
		this.anInt2556 = arg0.method2036();
		this.anInt2557 = arg0.method2036();
		if (local9 <= 3 && this.anInt2557 != 0) {
			this.anInt2557 += 16912800;
		}
		this.anInt2562 = arg0.method2028(-14795);
		this.anInt2553 = arg0.method2048(255);
		this.aString45 = arg0.method2014();
		if (local9 >= 4) {
			arg0.method2036();
		}
		this.aBoolean167 = arg0.method2048(255) == 1;
		this.aByte54 = arg0.method2022();
		this.aByte51 = arg0.method2022();
		this.aByte53 = arg0.method2022();
		this.aByte52 = arg0.method2022();
		@Pc(286) int local286;
		if (this.anInt2562 > 0) {
			if (this.aBoolean166 && (this.aLongArray5 == null || this.aLongArray5.length < this.anInt2562)) {
				this.aLongArray5 = new long[this.anInt2562];
			}
			if (this.aBoolean168 && (this.aStringArray10 == null || this.aStringArray10.length < this.anInt2562)) {
				this.aStringArray10 = new String[this.anInt2562];
			}
			if (this.aByteArray22 == null || this.anInt2562 > this.aByteArray22.length) {
				this.aByteArray22 = new byte[this.anInt2562];
			}
			if (this.anIntArray155 == null || this.anInt2562 > this.anIntArray155.length) {
				this.anIntArray155 = new int[this.anInt2562];
			}
			if (this.anIntArray156 == null || this.anIntArray156.length < this.anInt2562) {
				this.anIntArray156 = new int[this.anInt2562];
			}
			for (local286 = 0; local286 < this.anInt2562; local286++) {
				if (this.aBoolean166) {
					this.aLongArray5[local286] = arg0.method2063();
				}
				if (this.aBoolean168) {
					this.aStringArray10[local286] = arg0.method2066();
				}
				this.aByteArray22[local286] = arg0.method2022();
				if (local9 >= 2) {
					this.anIntArray155[local286] = arg0.method2036();
				}
				if (local9 >= 5) {
					this.anIntArray156[local286] = arg0.method2028(-14795);
				} else {
					this.anIntArray156[local286] = 0;
				}
			}
			this.method2338();
		}
		if (this.anInt2553 > 0) {
			if (this.aBoolean166 && (this.aLongArray4 == null || this.anInt2553 > this.aLongArray4.length)) {
				this.aLongArray4 = new long[this.anInt2553];
			}
			if (this.aBoolean168 && (this.aStringArray11 == null || this.aStringArray11.length < this.anInt2553)) {
				this.aStringArray11 = new String[this.anInt2553];
			}
			for (local286 = 0; local286 < this.anInt2553; local286++) {
				if (this.aBoolean166) {
					this.aLongArray4[local286] = arg0.method2063();
				}
				if (this.aBoolean168) {
					this.aStringArray11[local286] = arg0.method2066();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local286 = arg0.method2028(-14795);
		if (local286 <= 0) {
			return;
		}
		this.aClass313_11 = new Class313(local286 >= 16 ? 16 : Static92.method1941(local286));
		while (local286-- > 0) {
			@Pc(505) int local505 = arg0.method2036();
			@Pc(509) int local509 = local505 & 0x3FFFFFFF;
			@Pc(513) int local513 = local505 >>> 30;
			if (local513 == 0) {
				@Pc(519) int local519 = arg0.method2036();
				this.aClass313_11.method7107((long) local509, new Class3_Sub44(local519));
			} else if (local513 == 1) {
				@Pc(540) long local540 = arg0.method2063();
				this.aClass313_11.method7107((long) local509, new Class3_Sub19(local540));
			} else if (local513 == 2) {
				@Pc(563) String local563 = arg0.method2014();
				this.aClass313_11.method7107((long) local509, new Class3_Sub40(local563));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILjava/lang/String;Z)Z")
	public boolean method2337(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass313_11 == null) {
			this.aClass313_11 = new Class313(4);
		} else {
			@Pc(48) Class3 local48 = this.aClass313_11.method7104((long) arg0);
			if (local48 != null) {
				if (local48 instanceof Class3_Sub40) {
					@Pc(58) Class3_Sub40 local58 = (Class3_Sub40) local48;
					if (local58.aString78.equals(arg1)) {
						return false;
					}
					local58.aString78 = arg1;
					return true;
				}
				local48.method9596();
			}
		}
		this.aClass313_11.method7107((long) arg0, new Class3_Sub40(arg1));
		return true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
	private void method2338() {
		if (this.anInt2562 == 0) {
			this.anInt2568 = -1;
			this.anInt2552 = -1;
			return;
		}
		this.anInt2552 = -1;
		this.anInt2568 = -1;
		@Pc(32) int local32 = 0;
		@Pc(37) byte local37 = this.aByteArray22[0];
		for (@Pc(39) int local39 = 1; local39 < this.anInt2562; local39++) {
			if (local37 < this.aByteArray22[local39]) {
				if (local37 == 125) {
					this.anInt2568 = local32;
				}
				local37 = this.aByteArray22[local39];
				local32 = local39;
			} else if (this.anInt2568 == -1 && this.aByteArray22[local39] == 125) {
				this.anInt2568 = local39;
			}
		}
		this.anInt2552 = local32;
		if (this.anInt2552 != -1) {
			this.aByteArray22[this.anInt2552] = 126;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIII)Z")
	public boolean method2339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = (0x1 << arg1) - 1;
		@Pc(33) int local33 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		@Pc(37) int local37 = local17 ^ local33;
		@Pc(41) int local41 = arg2 << arg1;
		@Pc(45) int local45 = local41 & local37;
		if (this.aClass313_11 == null) {
			this.aClass313_11 = new Class313(4);
		} else {
			@Pc(67) Class3 local67 = this.aClass313_11.method7104((long) arg3);
			if (local67 != null) {
				if (local67 instanceof Class3_Sub44) {
					@Pc(77) Class3_Sub44 local77 = (Class3_Sub44) local67;
					if (local45 == (local37 & local77.anInt7298)) {
						return false;
					}
					local77.anInt7298 &= ~local37;
					local77.anInt7298 |= local45;
					return true;
				}
				local67.method9596();
			}
		}
		this.aClass313_11.method7107((long) arg3, new Class3_Sub44(local45));
		return true;
	}
}
