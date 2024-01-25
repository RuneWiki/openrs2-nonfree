import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class267 {

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray32;

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray33;

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "[J")
	private long[] aLongArray10;

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "Z")
	public boolean aBoolean525;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "[I")
	private int[] anIntArray467;

	@OriginalMember(owner = "client!oga", name = "q", descriptor = "J")
	public long aLong196;

	@OriginalMember(owner = "client!oga", name = "s", descriptor = "B")
	public byte aByte93;

	@OriginalMember(owner = "client!oga", name = "y", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!oga", name = "A", descriptor = "B")
	public byte aByte94;

	@OriginalMember(owner = "client!oga", name = "E", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!oga", name = "F", descriptor = "I")
	public int anInt6793;

	@OriginalMember(owner = "client!oga", name = "K", descriptor = "Lclient!dj;")
	private Class66 aClass66_31;

	@OriginalMember(owner = "client!oga", name = "N", descriptor = "Z")
	private boolean aBoolean526;

	@OriginalMember(owner = "client!oga", name = "O", descriptor = "B")
	public byte aByte95;

	@OriginalMember(owner = "client!oga", name = "P", descriptor = "[J")
	private long[] aLongArray11;

	@OriginalMember(owner = "client!oga", name = "Q", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!oga", name = "W", descriptor = "I")
	public int anInt6803;

	@OriginalMember(owner = "client!oga", name = "X", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
	public int anInt6780 = -1;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "Ljava/lang/String;")
	public String aString81 = null;

	@OriginalMember(owner = "client!oga", name = "D", descriptor = "I")
	public int anInt6792 = 0;

	@OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
	public int anInt6790 = -1;

	@OriginalMember(owner = "client!oga", name = "M", descriptor = "I")
	private int anInt6798 = 0;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class267(@OriginalArg(0) Class4_Sub11 arg0) {
		this.method5944(arg0);
	}

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
	private Class267() {
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIB)I")
	public int method5940(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt6790 && (this.anInt6780 == -1 || this.aByteArray64[this.anInt6780] < 125)) {
			return -1;
		} else if (this.aByteArray64[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray64[arg0] = arg1;
			this.method5941();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)V")
	private void method5941() {
		if (this.anInt6793 == 0) {
			this.anInt6790 = -1;
			this.anInt6780 = -1;
			return;
		}
		this.anInt6790 = -1;
		this.anInt6780 = -1;
		@Pc(31) int local31 = 0;
		@Pc(36) byte local36 = this.aByteArray64[0];
		for (@Pc(38) int local38 = 1; local38 < this.anInt6793; local38++) {
			if (this.aByteArray64[local38] > local36) {
				if (local36 == 125) {
					this.anInt6780 = local31;
				}
				local31 = local38;
				local36 = this.aByteArray64[local38];
			} else if (this.anInt6780 == -1 && this.aByteArray64[local38] == 125) {
				this.anInt6780 = local38;
			}
		}
		this.anInt6790 = local31;
		if (this.anInt6790 != -1) {
			this.aByteArray64[this.anInt6790] = 126;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZI)Ljava/lang/Integer;")
	public Integer method5942(@OriginalArg(1) int arg0) {
		if (this.aClass66_31 == null) {
			return null;
		} else {
			@Pc(15) Class4 local15 = this.aClass66_31.method1994((long) arg0);
			return local15 != null && local15 instanceof Class4_Sub24 ? Integer.valueOf(((Class4_Sub24) local15).anInt4156) : null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)[I")
	public int[] method5943() {
		if (this.anIntArray467 == null) {
			this.anIntArray467 = new int[this.anInt6793];
			@Pc(17) String[] local17 = new String[this.anInt6793];
			@Pc(19) int local19 = 0;
			while (this.anInt6793 > local19) {
				local17[local19] = this.aStringArray33[local19];
				this.anIntArray467[local19] = local19++;
			}
			Static46.method827(local17, this.anIntArray467);
		}
		return this.anIntArray467;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!es;I)V")
	private void method5944(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method8865();
		if (local9 < 1 || local9 > 4) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(32) int local32 = arg0.method8865();
		if ((local32 & 0x2) != 0) {
			this.aBoolean527 = true;
		}
		if ((local32 & 0x1) != 0) {
			this.aBoolean526 = true;
		}
		if (!this.aBoolean526) {
			this.aLongArray10 = null;
			this.aLongArray11 = null;
		}
		if (!this.aBoolean527) {
			this.aStringArray33 = null;
			this.aStringArray32 = null;
		}
		this.anInt6792 = arg0.method8850();
		this.anInt6798 = arg0.method8850();
		if (local9 <= 3 && this.anInt6798 != 0) {
			this.anInt6798 += 16912800;
		}
		this.anInt6793 = arg0.method8859();
		this.anInt6803 = arg0.method8865();
		this.aString81 = arg0.method8853();
		if (local9 >= 4) {
			arg0.method8850();
		}
		this.aBoolean525 = arg0.method8865() == 1;
		this.aByte94 = arg0.method8861();
		this.aByte93 = arg0.method8861();
		this.aByte96 = arg0.method8861();
		this.aByte95 = arg0.method8861();
		@Pc(222) int local222;
		if (this.anInt6793 > 0) {
			if (this.aBoolean526 && (this.aLongArray10 == null || this.anInt6793 > this.aLongArray10.length)) {
				this.aLongArray10 = new long[this.anInt6793];
			}
			if (this.aBoolean527 && (this.aStringArray33 == null || this.anInt6793 > this.aStringArray33.length)) {
				this.aStringArray33 = new String[this.anInt6793];
			}
			if (this.aByteArray64 == null || this.aByteArray64.length < this.anInt6793) {
				this.aByteArray64 = new byte[this.anInt6793];
			}
			if (this.anIntArray468 == null || this.anInt6793 > this.anIntArray468.length) {
				this.anIntArray468 = new int[this.anInt6793];
			}
			for (local222 = 0; local222 < this.anInt6793; local222++) {
				if (this.aBoolean526) {
					this.aLongArray10[local222] = arg0.method8830();
				}
				if (this.aBoolean527) {
					this.aStringArray33[local222] = arg0.method8852();
				}
				this.aByteArray64[local222] = arg0.method8861();
				if (local9 >= 2) {
					this.anIntArray468[local222] = arg0.method8850();
				}
			}
			this.method5941();
		}
		if (this.anInt6803 > 0) {
			if (this.aBoolean526 && (this.aLongArray11 == null || this.anInt6803 > this.aLongArray11.length)) {
				this.aLongArray11 = new long[this.anInt6803];
			}
			if (this.aBoolean527 && (this.aStringArray32 == null || this.anInt6803 > this.aStringArray32.length)) {
				this.aStringArray32 = new String[this.anInt6803];
			}
			for (local222 = 0; local222 < this.anInt6803; local222++) {
				if (this.aBoolean526) {
					this.aLongArray11[local222] = arg0.method8830();
				}
				if (this.aBoolean527) {
					this.aStringArray32[local222] = arg0.method8852();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local222 = arg0.method8859();
		if (local222 <= 0) {
			return;
		}
		this.aClass66_31 = new Class66(local222 < 16 ? Static162.method2593(local222) : 16);
		while (local222-- > 0) {
			@Pc(376) int local376 = arg0.method8850();
			@Pc(380) int local380 = local376 & 0x3FFFFFFF;
			@Pc(384) int local384 = local376 >>> 30;
			if (local384 == 0) {
				@Pc(393) int local393 = arg0.method8850();
				this.aClass66_31.method1985(new Class4_Sub24(local393), (long) local380);
			} else if (local384 == 1) {
				@Pc(414) long local414 = arg0.method8830();
				this.aClass66_31.method1985(new Class4_Sub50(local414), (long) local380);
			} else if (local384 == 2) {
				@Pc(435) String local435 = arg0.method8853();
				this.aClass66_31.method1985(new Class4_Sub46(local435), (long) local380);
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIII)I")
	public int method5945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		return (local26 & this.anIntArray468[arg2]) >>> arg1;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)V")
	public void method5946(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anInt6793 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt6793);
		}
		this.anIntArray467 = null;
		this.anInt6793--;
		if (this.anInt6793 == 0) {
			this.aStringArray33 = null;
			this.aByteArray64 = null;
			this.anInt6790 = -1;
			this.anInt6780 = -1;
			this.aLongArray10 = null;
			this.anIntArray468 = null;
			return;
		}
		Static685.method6464(this.aByteArray64, arg0 + 1, this.aByteArray64, arg0, this.anInt6793 - arg0);
		Static685.method6466(this.anIntArray468, arg0 + 1, this.anIntArray468, arg0, this.anInt6793 - arg0);
		if (this.aLongArray10 != null) {
			Static685.method6465(this.aLongArray10, arg0 + 1, this.aLongArray10, arg0, this.anInt6793 - arg0);
		}
		if (this.aStringArray33 != null) {
			Static685.method6469(this.aStringArray33, arg0 + 1, this.aStringArray33, arg0, this.anInt6793 - arg0);
		}
		if (arg0 == this.anInt6790 || this.anInt6780 == arg0) {
			this.method5941();
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)V")
	private void method5947(@OriginalArg(1) int arg0) {
		if (this.aBoolean526) {
			if (this.aLongArray11 == null) {
				this.aLongArray11 = new long[arg0];
			} else {
				Static685.method6465(this.aLongArray11, 0, this.aLongArray11 = new long[arg0], 0, this.anInt6803);
			}
		}
		if (!this.aBoolean527) {
			return;
		}
		if (this.aStringArray32 == null) {
			this.aStringArray32 = new String[arg0];
		} else {
			Static685.method6469(this.aStringArray32, 0, this.aStringArray32 = new String[arg0], 0, this.anInt6803);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;IB)Z")
	public boolean method5948(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass66_31 == null) {
			this.aClass66_31 = new Class66(4);
		} else {
			@Pc(40) Class4 local40 = this.aClass66_31.method1994((long) arg1);
			if (local40 != null) {
				if (local40 instanceof Class4_Sub46) {
					@Pc(48) Class4_Sub46 local48 = (Class4_Sub46) local40;
					if (local48.aString110.equals(arg0)) {
						return false;
					}
					local48.aString110 = arg0;
					return true;
				}
				local40.method9000();
			}
		}
		this.aClass66_31.method1985(new Class4_Sub46(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method5949(@OriginalArg(0) int arg0) {
		if (this.aClass66_31 == null) {
			return null;
		} else {
			@Pc(23) Class4 local23 = this.aClass66_31.method1994((long) arg0);
			return local23 != null && local23 instanceof Class4_Sub46 ? ((Class4_Sub46) local23).aString110 : null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIII)Z")
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg1) - 1;
		@Pc(32) int local32 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(36) int local36 = local32 ^ local9;
		@Pc(40) int local40 = arg0 << arg1;
		@Pc(44) int local44 = local40 & local36;
		if (this.aClass66_31 == null) {
			this.aClass66_31 = new Class66(4);
		} else {
			@Pc(62) Class4 local62 = this.aClass66_31.method1994((long) arg3);
			if (local62 != null) {
				if (local62 instanceof Class4_Sub24) {
					@Pc(70) Class4_Sub24 local70 = (Class4_Sub24) local62;
					if (local44 == (local70.anInt4156 & local36)) {
						return false;
					}
					local70.anInt4156 &= ~local36;
					local70.anInt4156 |= local44;
					return true;
				}
				local62.method9000();
			}
		}
		this.aClass66_31.method1985(new Class4_Sub24(local44), (long) arg3);
		return true;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(JLjava/lang/String;I)V")
	public void method5952(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (arg0 <= 0L == this.aBoolean526) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean526 + " but userhash:" + arg0);
		} else if ((arg1 != null) == this.aBoolean527) {
			if (arg0 > 0L && (this.aLongArray10 == null || this.aLongArray10.length <= this.anInt6793) || arg1 != null && (this.aStringArray33 == null || this.aStringArray33.length <= this.anInt6793)) {
				this.method5953(this.anInt6793 + 5);
			}
			if (this.aLongArray10 != null) {
				this.aLongArray10[this.anInt6793] = arg0;
			}
			if (this.aStringArray33 != null) {
				this.aStringArray33[this.anInt6793] = arg1;
			}
			if (this.anInt6790 == -1) {
				this.anInt6790 = this.anInt6793;
				this.aByteArray64[this.anInt6793] = 126;
			} else {
				this.aByteArray64[this.anInt6793] = 0;
			}
			this.anIntArray468[this.anInt6793] = 0;
			this.anInt6793++;
			this.anIntArray467 = null;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean527 + " but displayname:" + arg1);
		}
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(II)V")
	private void method5953(@OriginalArg(0) int arg0) {
		if (this.aBoolean526) {
			if (this.aLongArray10 == null) {
				this.aLongArray10 = new long[arg0];
			} else {
				Static685.method6465(this.aLongArray10, 0, this.aLongArray10 = new long[arg0], 0, this.anInt6793);
			}
		}
		if (this.aBoolean527) {
			if (this.aStringArray33 == null) {
				this.aStringArray33 = new String[arg0];
			} else {
				Static685.method6469(this.aStringArray33, 0, this.aStringArray33 = new String[arg0], 0, this.anInt6793);
			}
		}
		if (this.aByteArray64 == null) {
			this.aByteArray64 = new byte[arg0];
		} else {
			Static685.method6464(this.aByteArray64, 0, this.aByteArray64 = new byte[arg0], 0, this.anInt6793);
		}
		if (this.anIntArray468 == null) {
			this.anIntArray468 = new int[arg0];
		} else {
			Static685.method6466(this.anIntArray468, 0, this.anIntArray468 = new int[arg0], 0, this.anInt6793);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BII)Z")
	public boolean method5954(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass66_31 == null) {
			this.aClass66_31 = new Class66(4);
		} else {
			@Pc(13) Class4 local13 = this.aClass66_31.method1994((long) arg1);
			if (local13 != null) {
				if (local13 instanceof Class4_Sub24) {
					@Pc(21) Class4_Sub24 local21 = (Class4_Sub24) local13;
					if (local21.anInt4156 == arg0) {
						return false;
					}
					local21.anInt4156 = arg0;
					return true;
				}
				local13.method9000();
			}
		}
		this.aClass66_31.method1985(new Class4_Sub24(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BIJ)Z")
	public boolean method5955(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass66_31 == null) {
			this.aClass66_31 = new Class66(4);
		} else {
			@Pc(19) Class4 local19 = this.aClass66_31.method1994((long) arg0);
			if (local19 != null) {
				if (local19 instanceof Class4_Sub50) {
					@Pc(27) Class4_Sub50 local27 = (Class4_Sub50) local19;
					if (local27.aLong276 == arg1) {
						return false;
					}
					local27.aLong276 = arg1;
					return true;
				}
				local19.method9000();
			}
		}
		this.aClass66_31.method1985(new Class4_Sub50(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(IIIII)I")
	public int method5956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg0) - 1;
		@Pc(24) int local24 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		@Pc(28) int local28 = local9 ^ local24;
		@Pc(32) int local32 = arg2 << arg0;
		@Pc(41) int local41 = local32 & local28;
		@Pc(46) int local46 = this.anIntArray468[arg3];
		if (local41 == (local46 & local28)) {
			return -1;
		} else {
			local46 &= ~local28;
			this.anIntArray468[arg3] = local41 | local46;
			return arg3;
		}
	}

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "(II)Ljava/lang/Long;")
	public Long method5957(@OriginalArg(1) int arg0) {
		if (this.aClass66_31 == null) {
			return null;
		} else {
			@Pc(22) Class4 local22 = this.aClass66_31.method1994((long) arg0);
			return local22 != null && local22 instanceof Class4_Sub50 ? Long.valueOf(((Class4_Sub50) local22).aLong276) : null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IBII)Ljava/lang/Integer;")
	public Integer method5958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass66_31 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass66_31.method1994((long) arg0);
		if (local23 != null && local23 instanceof Class4_Sub24) {
			@Pc(45) int local45 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
			return Integer.valueOf((((Class4_Sub24) local23).anInt4156 & local45) >>> arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(JBLjava/lang/String;)V")
	public void method5959(@OriginalArg(0) long arg0, @OriginalArg(2) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean526 != arg0 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean526 + " but userhash:" + arg0);
		} else if (this.aBoolean527 == (arg1 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean527 + " but displayname:" + arg1);
		} else {
			if (arg0 > 0L && (this.aLongArray11 == null || this.aLongArray11.length <= this.anInt6803) || arg1 != null && (this.aStringArray32 == null || this.aStringArray32.length <= this.anInt6803)) {
				this.method5947(this.anInt6803 + 5);
			}
			if (this.aLongArray11 != null) {
				this.aLongArray11[this.anInt6803] = arg0;
			}
			if (this.aStringArray32 != null) {
				this.aStringArray32[this.anInt6803] = arg1;
			}
			this.anInt6803++;
		}
	}

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "(II)V")
	public void method5960(@OriginalArg(1) int arg0) {
		this.anInt6803--;
		if (this.anInt6803 == 0) {
			this.aStringArray32 = null;
			this.aLongArray11 = null;
			return;
		}
		if (this.aLongArray11 != null) {
			Static685.method6465(this.aLongArray11, arg0 + 1, this.aLongArray11, arg0, this.anInt6803 - arg0);
		}
		if (this.aStringArray32 != null) {
			Static685.method6469(this.aStringArray32, arg0 + 1, this.aStringArray32, arg0, this.anInt6803 - arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5961(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6793; local17++) {
			if (this.aStringArray33[local17].equals(arg0)) {
				return local17;
			}
		}
		return -1;
	}
}
