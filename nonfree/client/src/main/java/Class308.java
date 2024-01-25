import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class308 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "[J")
	private long[] aLongArray17;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "J")
	public long aLong255;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray59;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Z")
	private boolean aBoolean642;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "B")
	public byte aByte114;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "B")
	public byte aByte115;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "B")
	public byte aByte116;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "[I")
	private int[] anIntArray556;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "[J")
	private long[] aLongArray18;

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray60;

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "Z")
	private boolean aBoolean643;

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
	public int anInt8618;

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "Lclient!cja;")
	private Class62 aClass62_44;

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "Z")
	public boolean aBoolean644;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
	public int anInt8619;

	@OriginalMember(owner = "client!rh", name = "R", descriptor = "B")
	public byte aByte117;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
	public int anInt8608 = 0;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public int anInt8603 = -1;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
	public int anInt8605 = -1;

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "Ljava/lang/String;")
	public String aString106 = null;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class308(@OriginalArg(0) Class3_Sub17 arg0) {
		this.method7279(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	private Class308() {
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIJ)Z")
	public boolean method7277(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass62_44 == null) {
			this.aClass62_44 = new Class62(4);
		} else {
			@Pc(21) Class3 local21 = this.aClass62_44.method1682((long) arg0);
			if (local21 != null) {
				if (local21 instanceof Class3_Sub50) {
					@Pc(29) Class3_Sub50 local29 = (Class3_Sub50) local21;
					if (local29.aLong267 == arg1) {
						return false;
					}
					local29.aLong267 = arg1;
					return true;
				}
				local21.method8770();
			}
		}
		this.aClass62_44.method1686((long) arg0, new Class3_Sub50(arg1));
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	private void method7278() {
		if (this.anInt8619 == 0) {
			this.anInt8603 = -1;
			this.anInt8605 = -1;
			return;
		}
		this.anInt8605 = -1;
		this.anInt8603 = -1;
		@Pc(32) int local32 = 0;
		@Pc(37) byte local37 = this.aByteArray95[0];
		for (@Pc(39) int local39 = 1; local39 < this.anInt8619; local39++) {
			if (local37 < this.aByteArray95[local39]) {
				local37 = this.aByteArray95[local39];
				local32 = local39;
			} else if (this.anInt8605 == -1 && this.aByteArray95[local39] == 125) {
				this.anInt8605 = local39;
			}
		}
		this.anInt8603 = local32;
		if (this.anInt8603 != -1) {
			this.aByteArray95[this.anInt8603] = 126;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!fca;)V")
	private void method7279(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(9) int local9 = arg0.method4888();
		if (local9 < 1 || local9 > 3) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(30) int local30 = arg0.method4888();
		if ((local30 & 0x2) != 0) {
			this.aBoolean642 = true;
		}
		if ((local30 & 0x1) != 0) {
			this.aBoolean643 = true;
		}
		if (!this.aBoolean642) {
			this.aStringArray60 = null;
			this.aStringArray59 = null;
		}
		if (!this.aBoolean643) {
			this.aLongArray18 = null;
			this.aLongArray17 = null;
		}
		this.anInt8608 = arg0.method4868();
		arg0.method4868();
		this.anInt8619 = arg0.method4858();
		this.anInt8618 = arg0.method4888();
		this.aString106 = arg0.method4847();
		this.aBoolean644 = arg0.method4888() == 1;
		this.aByte117 = arg0.method4861();
		this.aByte114 = arg0.method4861();
		this.aByte115 = arg0.method4861();
		this.aByte116 = arg0.method4861();
		@Pc(201) int local201;
		if (this.anInt8619 > 0) {
			if (this.aBoolean643 && (this.aLongArray18 == null || this.aLongArray18.length < this.anInt8619)) {
				this.aLongArray18 = new long[this.anInt8619];
			}
			if (this.aBoolean642 && (this.aStringArray60 == null || this.aStringArray60.length < this.anInt8619)) {
				this.aStringArray60 = new String[this.anInt8619];
			}
			if (this.aByteArray95 == null || this.anInt8619 > this.aByteArray95.length) {
				this.aByteArray95 = new byte[this.anInt8619];
			}
			if (this.anIntArray556 == null || this.anIntArray556.length < this.anInt8619) {
				this.anIntArray556 = new int[this.anInt8619];
			}
			for (local201 = 0; local201 < this.anInt8619; local201++) {
				if (this.aBoolean643) {
					this.aLongArray18[local201] = arg0.method4865();
				}
				if (this.aBoolean642) {
					this.aStringArray60[local201] = arg0.method4897();
				}
				this.aByteArray95[local201] = arg0.method4861();
				if (local9 >= 2) {
					this.anIntArray556[local201] = arg0.method4868();
				}
			}
			this.method7278();
		}
		if (this.anInt8618 > 0) {
			if (this.aBoolean643 && (this.aLongArray17 == null || this.aLongArray17.length < this.anInt8618)) {
				this.aLongArray17 = new long[this.anInt8618];
			}
			if (this.aBoolean642 && (this.aStringArray59 == null || this.aStringArray59.length < this.anInt8618)) {
				this.aStringArray59 = new String[this.anInt8618];
			}
			for (local201 = 0; local201 < this.anInt8618; local201++) {
				if (this.aBoolean643) {
					this.aLongArray17[local201] = arg0.method4865();
				}
				if (this.aBoolean642) {
					this.aStringArray59[local201] = arg0.method4897();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local201 = arg0.method4858();
		if (local201 <= 0) {
			return;
		}
		this.aClass62_44 = new Class62(local201 < 16 ? Static527.method7377(local201) : 16);
		while (local201-- > 0) {
			@Pc(347) int local347 = arg0.method4868();
			@Pc(351) int local351 = local347 & 0x3FFFFFFF;
			@Pc(355) int local355 = local347 >>> 30;
			if (local355 == 0) {
				@Pc(401) int local401 = arg0.method4868();
				this.aClass62_44.method1686((long) local351, new Class3_Sub53(local401));
			} else if (local355 == 1) {
				@Pc(385) long local385 = arg0.method4865();
				this.aClass62_44.method1686((long) local351, new Class3_Sub50(local385));
			} else if (local355 == 2) {
				@Pc(369) String local369 = arg0.method4847();
				this.aClass62_44.method1686((long) local351, new Class3_Sub40(local369));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;JB)V")
	public void method7280(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 <= 0L == this.aBoolean643) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean643 + " but userhash:" + arg1);
		} else if (this.aBoolean642 == (arg0 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean642 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray17 == null || this.anInt8618 >= this.aLongArray17.length) || arg0 != null && (this.aStringArray59 == null || this.aStringArray59.length <= this.anInt8618)) {
				this.method7285(this.anInt8618 + 5);
			}
			if (this.aLongArray17 != null) {
				this.aLongArray17[this.anInt8618] = arg1;
			}
			if (this.aStringArray59 != null) {
				this.aStringArray59[this.anInt8618] = arg0;
			}
			this.anInt8618++;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBI)I")
	public int method7281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = (0x1 << arg3) - 1;
		@Pc(28) int local28 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(32) int local32 = arg0 << arg3;
		@Pc(36) int local36 = local15 ^ local28;
		@Pc(40) int local40 = local32 & local36;
		@Pc(45) int local45 = this.anIntArray556[arg1];
		if ((local45 & local36) == local40) {
			return -1;
		} else {
			local45 &= ~local36;
			this.anIntArray556[arg1] = local45 | local40;
			return arg1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
	public boolean method7283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass62_44 == null) {
			this.aClass62_44 = new Class62(4);
		} else {
			@Pc(13) Class3 local13 = this.aClass62_44.method1682((long) arg0);
			if (local13 != null) {
				if (local13 instanceof Class3_Sub53) {
					@Pc(21) Class3_Sub53 local21 = (Class3_Sub53) local13;
					if (arg1 == local21.anInt10023) {
						return false;
					}
					local21.anInt10023 = arg1;
					return true;
				}
				local13.method8770();
			}
		}
		this.aClass62_44.method1686((long) arg0, new Class3_Sub53(arg1));
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
	public void method7284(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anInt8619 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt8619);
		}
		this.anInt8619--;
		if (this.anInt8619 == 0) {
			this.anInt8605 = -1;
			this.anIntArray556 = null;
			this.anInt8603 = -1;
			this.aLongArray18 = null;
			this.aByteArray95 = null;
			this.aStringArray60 = null;
			return;
		}
		Static689.method8055(this.aByteArray95, arg0 + 1, this.aByteArray95, arg0, this.anInt8619 - arg0);
		Static689.method8054(this.anIntArray556, arg0 + 1, this.anIntArray556, arg0, this.anInt8619 - arg0);
		if (this.aLongArray18 != null) {
			Static689.method8059(this.aLongArray18, arg0 + 1, this.aLongArray18, arg0, this.anInt8619 - arg0);
		}
		if (this.aStringArray60 != null) {
			Static689.method8053(this.aStringArray60, arg0 + 1, this.aStringArray60, arg0, this.anInt8619 - arg0);
		}
		if (this.anInt8603 == arg0 || arg0 == this.anInt8605) {
			this.method7278();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	private void method7285(@OriginalArg(1) int arg0) {
		if (this.aBoolean643) {
			if (this.aLongArray17 == null) {
				this.aLongArray17 = new long[arg0];
			} else {
				Static689.method8059(this.aLongArray17, 0, this.aLongArray17 = new long[arg0], 0, this.anInt8618);
			}
		}
		if (!this.aBoolean642) {
			return;
		}
		if (this.aStringArray59 == null) {
			this.aStringArray59 = new String[arg0];
		} else {
			Static689.method8053(this.aStringArray59, 0, this.aStringArray59 = new String[arg0], 0, this.anInt8618);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BBI)I")
	public int method7286(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 126 || arg0 == 127) {
			return -1;
		} else if (arg1 == this.anInt8603 && (this.anInt8605 == -1 || this.aByteArray95[this.anInt8605] < 125)) {
			return -1;
		} else if (arg0 == this.aByteArray95[arg1]) {
			return -1;
		} else {
			this.aByteArray95[arg1] = arg0;
			this.method7278();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
	public void method7287(@OriginalArg(0) int arg0) {
		this.anInt8618--;
		if (this.anInt8618 == 0) {
			this.aStringArray59 = null;
			this.aLongArray17 = null;
			return;
		}
		if (this.aLongArray17 != null) {
			Static689.method8059(this.aLongArray17, arg0 + 1, this.aLongArray17, arg0, this.anInt8618 - arg0);
		}
		if (this.aStringArray59 != null) {
			Static689.method8053(this.aStringArray59, arg0 + 1, this.aStringArray59, arg0, this.anInt8618 - arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	public boolean method7288(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass62_44 == null) {
			this.aClass62_44 = new Class62(4);
		} else {
			@Pc(37) Class3 local37 = this.aClass62_44.method1682((long) arg0);
			if (local37 != null) {
				if (local37 instanceof Class3_Sub40) {
					@Pc(45) Class3_Sub40 local45 = (Class3_Sub40) local37;
					if (local45.aString100.equals(arg1)) {
						return false;
					}
					local45.aString100 = arg1;
					return true;
				}
				local37.method8770();
			}
		}
		this.aClass62_44.method1686((long) arg0, new Class3_Sub40(arg1));
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)Z")
	public boolean method7289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = (0x1 << arg0) - 1;
		@Pc(24) int local24 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		@Pc(28) int local28 = local24 ^ local9;
		@Pc(32) int local32 = arg3 << arg0;
		@Pc(41) int local41 = local32 & local28;
		if (this.aClass62_44 == null) {
			this.aClass62_44 = new Class62(4);
		} else {
			@Pc(61) Class3 local61 = this.aClass62_44.method1682((long) arg2);
			if (local61 != null) {
				if (local61 instanceof Class3_Sub53) {
					@Pc(69) Class3_Sub53 local69 = (Class3_Sub53) local61;
					if ((local69.anInt10023 & local28) == local41) {
						return false;
					}
					local69.anInt10023 &= ~local28;
					local69.anInt10023 |= local41;
					return true;
				}
				local61.method8770();
			}
		}
		this.aClass62_44.method1686((long) arg2, new Class3_Sub53(local41));
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method7291(@OriginalArg(0) int arg0) {
		if (this.aClass62_44 == null) {
			return null;
		} else {
			@Pc(19) Class3 local19 = this.aClass62_44.method1682((long) arg0);
			return local19 != null && local19 instanceof Class3_Sub40 ? ((Class3_Sub40) local19).aString100 : null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)Ljava/lang/Long;")
	public Long method7292(@OriginalArg(0) int arg0) {
		if (this.aClass62_44 == null) {
			return null;
		} else {
			@Pc(26) Class3 local26 = this.aClass62_44.method1682((long) arg0);
			return local26 != null && local26 instanceof Class3_Sub50 ? Long.valueOf(((Class3_Sub50) local26).aLong267) : null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)I")
	public int method7293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) int local22 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		return (local22 & this.anIntArray556[arg1]) >>> arg2;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIII)Ljava/lang/Integer;")
	public Integer method7294(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass62_44 == null) {
			return null;
		}
		@Pc(20) Class3 local20 = this.aClass62_44.method1682((long) arg1);
		if (local20 != null && local20 instanceof Class3_Sub53) {
			@Pc(40) int local40 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
			return Integer.valueOf((((Class3_Sub53) local20).anInt10023 & local40) >>> arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLjava/lang/String;J)V")
	public void method7295(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (this.aBoolean643 != arg1 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean643 + " but userhash:" + arg1);
		} else if (this.aBoolean642 == (arg0 != null)) {
			if (arg1 > 0L && (this.aLongArray18 == null || this.aLongArray18.length <= this.anInt8619) || arg0 != null && (this.aStringArray60 == null || this.anInt8619 >= this.aStringArray60.length)) {
				this.method7296(this.anInt8619 + 5);
			}
			if (this.aLongArray18 != null) {
				this.aLongArray18[this.anInt8619] = arg1;
			}
			if (this.aStringArray60 != null) {
				this.aStringArray60[this.anInt8619] = arg0;
			}
			if (this.anInt8603 == -1) {
				this.anInt8603 = this.anInt8619;
				this.aByteArray95[this.anInt8619] = 126;
			} else {
				this.aByteArray95[this.anInt8619] = 0;
			}
			this.anIntArray556[this.anInt8619] = 0;
			this.anInt8619++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean642 + " but displayname:" + arg0);
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(II)V")
	private void method7296(@OriginalArg(0) int arg0) {
		if (this.aBoolean643) {
			if (this.aLongArray18 == null) {
				this.aLongArray18 = new long[arg0];
			} else {
				Static689.method8059(this.aLongArray18, 0, this.aLongArray18 = new long[arg0], 0, this.anInt8619);
			}
		}
		if (this.aBoolean642) {
			if (this.aStringArray60 == null) {
				this.aStringArray60 = new String[arg0];
			} else {
				Static689.method8053(this.aStringArray60, 0, this.aStringArray60 = new String[arg0], 0, this.anInt8619);
			}
		}
		if (this.aByteArray95 == null) {
			this.aByteArray95 = new byte[arg0];
		} else {
			Static689.method8055(this.aByteArray95, 0, this.aByteArray95 = new byte[arg0], 0, this.anInt8619);
		}
		if (this.anIntArray556 == null) {
			this.anIntArray556 = new int[arg0];
		} else {
			Static689.method8054(this.anIntArray556, 0, this.anIntArray556 = new int[arg0], 0, this.anInt8619);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ljava/lang/Integer;")
	public Integer method7297(@OriginalArg(1) int arg0) {
		if (this.aClass62_44 == null) {
			return null;
		} else {
			@Pc(23) Class3 local23 = this.aClass62_44.method1682((long) arg0);
			return local23 != null && local23 instanceof Class3_Sub53 ? Integer.valueOf(((Class3_Sub53) local23).anInt10023) : null;
		}
	}
}
