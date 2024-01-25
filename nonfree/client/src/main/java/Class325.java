import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class325 {

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!sca", name = "y", descriptor = "I")
	public int anInt8576;

	@OriginalMember(owner = "client!sca", name = "L", descriptor = "B")
	public byte aByte119;

	@OriginalMember(owner = "client!sca", name = "I", descriptor = "J")
	public long aLong247;

	@OriginalMember(owner = "client!sca", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray36;

	@OriginalMember(owner = "client!sca", name = "D", descriptor = "[I")
	private int[] anIntArray491;

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "Z")
	public boolean aBoolean564;

	@OriginalMember(owner = "client!sca", name = "s", descriptor = "B")
	public byte aByte120;

	@OriginalMember(owner = "client!sca", name = "J", descriptor = "I")
	public int anInt8584;

	@OriginalMember(owner = "client!sca", name = "R", descriptor = "Lclient!qr;")
	private Class306 aClass306_39;

	@OriginalMember(owner = "client!sca", name = "t", descriptor = "[J")
	private long[] aLongArray17;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "[J")
	private long[] aLongArray18;

	@OriginalMember(owner = "client!sca", name = "E", descriptor = "B")
	public byte aByte121;

	@OriginalMember(owner = "client!sca", name = "z", descriptor = "Z")
	private boolean aBoolean566;

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "[I")
	private int[] anIntArray492;

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "Z")
	private boolean aBoolean567;

	@OriginalMember(owner = "client!sca", name = "Q", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray37;

	@OriginalMember(owner = "client!sca", name = "q", descriptor = "B")
	public byte aByte122;

	@OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
	public int anInt8575 = 0;

	@OriginalMember(owner = "client!sca", name = "O", descriptor = "I")
	public int anInt8577 = -1;

	@OriginalMember(owner = "client!sca", name = "x", descriptor = "I")
	public int anInt8572 = -1;

	@OriginalMember(owner = "client!sca", name = "F", descriptor = "Ljava/lang/String;")
	public String aString97 = null;

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
	private int anInt8571 = 0;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class325(@OriginalArg(0) Class5_Sub36 arg0) {
		this.method7404(arg0);
	}

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "()V")
	private Class325() {
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(JLjava/lang/String;I)V")
	public void method7385(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean566 != arg0 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean566 + " but userhash:" + arg0);
		} else if ((arg1 == null) == this.aBoolean567) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean567 + " but displayname:" + arg1);
		} else {
			if (arg0 > 0L && (this.aLongArray17 == null || this.anInt8584 >= this.aLongArray17.length) || arg1 != null && (this.aStringArray37 == null || this.anInt8584 >= this.aStringArray37.length)) {
				this.method7390(this.anInt8584 + 5);
			}
			if (this.aLongArray17 != null) {
				this.aLongArray17[this.anInt8584] = arg0;
			}
			if (this.aStringArray37 != null) {
				this.aStringArray37[this.anInt8584] = arg1;
			}
			this.anInt8584++;
		}
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(IIII)I")
	public int method7386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		return (local26 & this.anIntArray491[arg2]) >>> arg0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BII)I")
	public int method7388(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 126 || arg0 == 127) {
			return -1;
		} else if (arg1 == this.anInt8577 && (this.anInt8572 == -1 || this.aByteArray90[this.anInt8572] < 125)) {
			return -1;
		} else if (arg0 == this.aByteArray90[arg1]) {
			return -1;
		} else {
			this.aByteArray90[arg1] = arg0;
			this.method7393();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)V")
	public void method7389(@OriginalArg(0) int arg0) {
		this.anInt8584--;
		if (this.anInt8584 == 0) {
			this.aLongArray17 = null;
			this.aStringArray37 = null;
			return;
		}
		if (this.aLongArray17 != null) {
			Static693.method8317(this.aLongArray17, arg0 + 1, this.aLongArray17, arg0, this.anInt8584 - arg0);
		}
		if (this.aStringArray37 != null) {
			Static693.method8316(this.aStringArray37, arg0 + 1, this.aStringArray37, arg0, this.anInt8584 - arg0);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BI)V")
	private void method7390(@OriginalArg(1) int arg0) {
		if (this.aBoolean566) {
			if (this.aLongArray17 == null) {
				this.aLongArray17 = new long[arg0];
			} else {
				Static693.method8317(this.aLongArray17, 0, this.aLongArray17 = new long[arg0], 0, this.anInt8584);
			}
		}
		if (!this.aBoolean567) {
			return;
		}
		if (this.aStringArray37 == null) {
			this.aStringArray37 = new String[arg0];
		} else {
			Static693.method8316(this.aStringArray37, 0, this.aStringArray37 = new String[arg0], 0, this.anInt8584);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method7391(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt8576; local28++) {
			if (this.aStringArray36[local28].equals(arg0)) {
				return local28;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(BII)Z")
	public boolean method7392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass306_39 == null) {
			this.aClass306_39 = new Class306(4);
		} else {
			@Pc(13) Class5 local13 = this.aClass306_39.method6943((long) arg1);
			if (local13 != null) {
				if (local13 instanceof Class5_Sub43) {
					@Pc(23) Class5_Sub43 local23 = (Class5_Sub43) local13;
					if (local23.anInt6989 == arg0) {
						return false;
					}
					local23.anInt6989 = arg0;
					return true;
				}
				local13.method9222();
			}
		}
		this.aClass306_39.method6944(new Class5_Sub43(arg0), (long) arg1, -12002);
		return true;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)V")
	private void method7393() {
		if (this.anInt8576 == 0) {
			this.anInt8577 = -1;
			this.anInt8572 = -1;
			return;
		}
		this.anInt8572 = -1;
		this.anInt8577 = -1;
		@Pc(32) int local32 = 0;
		@Pc(37) byte local37 = this.aByteArray90[0];
		for (@Pc(39) int local39 = 1; local39 < this.anInt8576; local39++) {
			if (this.aByteArray90[local39] > local37) {
				if (local37 == 125) {
					this.anInt8572 = local32;
				}
				local37 = this.aByteArray90[local39];
				local32 = local39;
			} else if (this.anInt8572 == -1 && this.aByteArray90[local39] == 125) {
				this.anInt8572 = local39;
			}
		}
		this.anInt8577 = local32;
		if (this.anInt8577 != -1) {
			this.aByteArray90[this.anInt8577] = 126;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZI)V")
	public void method7394(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt8576) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt8576);
		}
		this.anInt8576--;
		this.anIntArray492 = null;
		if (this.anInt8576 == 0) {
			this.aLongArray18 = null;
			this.anIntArray491 = null;
			this.aStringArray36 = null;
			this.anInt8577 = -1;
			this.aByteArray90 = null;
			this.anInt8572 = -1;
			return;
		}
		Static693.method8320(this.aByteArray90, arg0 + 1, this.aByteArray90, arg0, this.anInt8576 - arg0);
		Static693.method8323(this.anIntArray491, arg0 + 1, this.anIntArray491, arg0, this.anInt8576 - arg0);
		if (this.aLongArray18 != null) {
			Static693.method8317(this.aLongArray18, arg0 + 1, this.aLongArray18, arg0, this.anInt8576 - arg0);
		}
		if (this.aStringArray36 != null) {
			Static693.method8316(this.aStringArray36, arg0 + 1, this.aStringArray36, arg0, this.anInt8576 - arg0);
		}
		if (this.anInt8577 == arg0 || this.anInt8572 == arg0) {
			this.method7393();
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIJ)Z")
	public boolean method7395(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass306_39 == null) {
			this.aClass306_39 = new Class306(4);
		} else {
			@Pc(31) Class5 local31 = this.aClass306_39.method6943((long) arg0);
			if (local31 != null) {
				if (local31 instanceof Class5_Sub44) {
					@Pc(41) Class5_Sub44 local41 = (Class5_Sub44) local31;
					if (local41.aLong203 == arg1) {
						return false;
					}
					local41.aLong203 = arg1;
					return true;
				}
				local31.method9222();
			}
		}
		this.aClass306_39.method6944(new Class5_Sub44(arg1), (long) arg0, -12002);
		return true;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)[I")
	public int[] method7396() {
		if (this.anIntArray492 == null) {
			this.anIntArray492 = new int[this.anInt8576];
			@Pc(23) String[] local23 = new String[this.anInt8576];
			@Pc(25) int local25 = 0;
			while (this.anInt8576 > local25) {
				local23[local25] = this.aStringArray36[local25];
				this.anIntArray492[local25] = local25++;
			}
			Static166.method3018(local23, this.anIntArray492);
		}
		return this.anIntArray492;
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method7397(@OriginalArg(1) int arg0) {
		if (this.aClass306_39 == null) {
			return null;
		} else {
			@Pc(16) Class5 local16 = this.aClass306_39.method6943((long) arg0);
			return local16 != null && local16 instanceof Class5_Sub46 ? ((Class5_Sub46) local16).aString87 : null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method7398(@OriginalArg(0) int arg0) {
		if (this.aClass306_39 == null) {
			return null;
		} else {
			@Pc(22) Class5 local22 = this.aClass306_39.method6943((long) arg0);
			return local22 != null && local22 instanceof Class5_Sub43 ? Integer.valueOf(((Class5_Sub43) local22).anInt6989) : null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(II)V")
	private void method7399(@OriginalArg(1) int arg0) {
		if (this.aBoolean566) {
			if (this.aLongArray18 == null) {
				this.aLongArray18 = new long[arg0];
			} else {
				Static693.method8317(this.aLongArray18, 0, this.aLongArray18 = new long[arg0], 0, this.anInt8576);
			}
		}
		if (this.aBoolean567) {
			if (this.aStringArray36 == null) {
				this.aStringArray36 = new String[arg0];
			} else {
				Static693.method8316(this.aStringArray36, 0, this.aStringArray36 = new String[arg0], 0, this.anInt8576);
			}
		}
		if (this.aByteArray90 == null) {
			this.aByteArray90 = new byte[arg0];
		} else {
			Static693.method8320(this.aByteArray90, 0, this.aByteArray90 = new byte[arg0], 0, this.anInt8576);
		}
		if (this.anIntArray491 == null) {
			this.anIntArray491 = new int[arg0];
		} else {
			Static693.method8323(this.anIntArray491, 0, this.anIntArray491 = new int[arg0], 0, this.anInt8576);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BJLjava/lang/String;)V")
	public void method7400(@OriginalArg(1) long arg0, @OriginalArg(2) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (arg0 <= 0L == this.aBoolean566) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean566 + " but userhash:" + arg0);
		} else if ((arg1 != null) == this.aBoolean567) {
			if (arg0 > 0L && (this.aLongArray18 == null || this.aLongArray18.length <= this.anInt8576) || arg1 != null && (this.aStringArray36 == null || this.anInt8576 >= this.aStringArray36.length)) {
				this.method7399(this.anInt8576 + 5);
			}
			if (this.aLongArray18 != null) {
				this.aLongArray18[this.anInt8576] = arg0;
			}
			if (this.aStringArray36 != null) {
				this.aStringArray36[this.anInt8576] = arg1;
			}
			if (this.anInt8577 == -1) {
				this.anInt8577 = this.anInt8576;
				this.aByteArray90[this.anInt8576] = 126;
			} else {
				this.aByteArray90[this.anInt8576] = 0;
			}
			this.anIntArray491[this.anInt8576] = 0;
			this.anInt8576++;
			this.anIntArray492 = null;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean567 + " but displayname:" + arg1);
		}
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(IIIII)Z")
	public boolean method7401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg1) - 1;
		@Pc(31) int local31 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(35) int local35 = local31 ^ local9;
		@Pc(39) int local39 = arg0 << arg1;
		@Pc(43) int local43 = local39 & local35;
		if (this.aClass306_39 == null) {
			this.aClass306_39 = new Class306(4);
		} else {
			@Pc(63) Class5 local63 = this.aClass306_39.method6943((long) arg3);
			if (local63 != null) {
				if (local63 instanceof Class5_Sub43) {
					@Pc(73) Class5_Sub43 local73 = (Class5_Sub43) local63;
					if ((local73.anInt6989 & local35) == local43) {
						return false;
					}
					local73.anInt6989 &= ~local35;
					local73.anInt6989 |= local43;
					return true;
				}
				local63.method9222();
			}
		}
		this.aClass306_39.method6944(new Class5_Sub43(local43), (long) arg3, -12002);
		return true;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIII)I")
	public int method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg3) - 1;
		@Pc(25) int local25 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		@Pc(37) int local37 = arg1 << arg3;
		@Pc(41) int local41 = local25 ^ local9;
		@Pc(45) int local45 = local37 & local41;
		@Pc(50) int local50 = this.anIntArray491[arg2];
		if (local45 == (local41 & local50)) {
			return -1;
		} else {
			local50 &= ~local41;
			this.anIntArray491[arg2] = local45 | local50;
			return arg2;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IB)Ljava/lang/Long;")
	public Long method7403(@OriginalArg(0) int arg0) {
		if (this.aClass306_39 == null) {
			return null;
		} else {
			@Pc(16) Class5 local16 = this.aClass306_39.method6943((long) arg0);
			return local16 != null && local16 instanceof Class5_Sub44 ? Long.valueOf(((Class5_Sub44) local16).aLong203) : null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BLclient!wq;)V")
	private void method7404(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(9) int local9 = arg0.method7291();
		if (local9 < 1 || local9 > 4) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(39) int local39 = arg0.method7291();
		if ((local39 & 0x1) != 0) {
			this.aBoolean566 = true;
		}
		if ((local39 & 0x2) != 0) {
			this.aBoolean567 = true;
		}
		if (!this.aBoolean567) {
			this.aStringArray37 = null;
			this.aStringArray36 = null;
		}
		if (!this.aBoolean566) {
			this.aLongArray17 = null;
			this.aLongArray18 = null;
		}
		this.anInt8575 = arg0.method7268();
		this.anInt8571 = arg0.method7268();
		if (local9 <= 3 && this.anInt8571 != 0) {
			this.anInt8571 += 16912800;
		}
		this.anInt8576 = arg0.method7333();
		this.anInt8584 = arg0.method7291();
		this.aString97 = arg0.method7281();
		if (local9 >= 4) {
			arg0.method7268();
		}
		this.aBoolean564 = arg0.method7291() == 1;
		this.aByte119 = arg0.method7318();
		this.aByte120 = arg0.method7318();
		this.aByte121 = arg0.method7318();
		this.aByte122 = arg0.method7318();
		@Pc(276) int local276;
		if (this.anInt8576 > 0) {
			if (this.aBoolean566 && (this.aLongArray18 == null || this.aLongArray18.length < this.anInt8576)) {
				this.aLongArray18 = new long[this.anInt8576];
			}
			if (this.aBoolean567 && (this.aStringArray36 == null || this.anInt8576 > this.aStringArray36.length)) {
				this.aStringArray36 = new String[this.anInt8576];
			}
			if (this.aByteArray90 == null || this.aByteArray90.length < this.anInt8576) {
				this.aByteArray90 = new byte[this.anInt8576];
			}
			if (this.anIntArray491 == null || this.anInt8576 > this.anIntArray491.length) {
				this.anIntArray491 = new int[this.anInt8576];
			}
			for (local276 = 0; local276 < this.anInt8576; local276++) {
				if (this.aBoolean566) {
					this.aLongArray18[local276] = arg0.method7304();
				}
				if (this.aBoolean567) {
					this.aStringArray36[local276] = arg0.method7312();
				}
				this.aByteArray90[local276] = arg0.method7318();
				if (local9 >= 2) {
					this.anIntArray491[local276] = arg0.method7268();
				}
			}
			this.method7393();
		}
		if (this.anInt8584 > 0) {
			if (this.aBoolean566 && (this.aLongArray17 == null || this.aLongArray17.length < this.anInt8584)) {
				this.aLongArray17 = new long[this.anInt8584];
			}
			if (this.aBoolean567 && (this.aStringArray37 == null || this.aStringArray37.length < this.anInt8584)) {
				this.aStringArray37 = new String[this.anInt8584];
			}
			for (local276 = 0; local276 < this.anInt8584; local276++) {
				if (this.aBoolean566) {
					this.aLongArray17[local276] = arg0.method7304();
				}
				if (this.aBoolean567) {
					this.aStringArray37[local276] = arg0.method7312();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local276 = arg0.method7333();
		if (local276 <= 0) {
			return;
		}
		this.aClass306_39 = new Class306(local276 >= 16 ? 16 : Static146.method2737(local276));
		while (local276-- > 0) {
			@Pc(478) int local478 = arg0.method7268();
			@Pc(482) int local482 = local478 & 0x3FFFFFFF;
			@Pc(486) int local486 = local478 >>> 30;
			if (local486 == 0) {
				@Pc(494) int local494 = arg0.method7268();
				this.aClass306_39.method6944(new Class5_Sub43(local494), (long) local482, -12002);
			} else if (local486 == 1) {
				@Pc(536) long local536 = arg0.method7304();
				this.aClass306_39.method6944(new Class5_Sub44(local536), (long) local482, -12002);
			} else if (local486 == 2) {
				@Pc(520) String local520 = arg0.method7281();
				this.aClass306_39.method6944(new Class5_Sub46(local520), (long) local482, -12002);
			}
		}
		return;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIII)Ljava/lang/Integer;")
	public Integer method7405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass306_39 == null) {
			return null;
		}
		@Pc(16) Class5 local16 = this.aClass306_39.method6943((long) arg1);
		if (local16 != null && local16 instanceof Class5_Sub43) {
			@Pc(42) int local42 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
			return Integer.valueOf((local42 & ((Class5_Sub43) local16).anInt6989) >>> arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILjava/lang/String;Z)Z")
	public boolean method7406(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass306_39 == null) {
			this.aClass306_39 = new Class306(4);
		} else {
			@Pc(42) Class5 local42 = this.aClass306_39.method6943((long) arg0);
			if (local42 != null) {
				if (local42 instanceof Class5_Sub46) {
					@Pc(52) Class5_Sub46 local52 = (Class5_Sub46) local42;
					if (local52.aString87.equals(arg1)) {
						return false;
					}
					local52.aString87 = arg1;
					return true;
				}
				local42.method9222();
			}
		}
		this.aClass306_39.method6944(new Class5_Sub46(arg1), (long) arg0, -12002);
		return true;
	}
}
