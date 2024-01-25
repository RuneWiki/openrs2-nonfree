import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class391 {

	@OriginalMember(owner = "client!wfa", name = "m", descriptor = "B")
	public byte aByte147;

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "Z")
	public boolean aBoolean762;

	@OriginalMember(owner = "client!wfa", name = "A", descriptor = "J")
	public long aLong339;

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "Lclient!dfa;")
	private Class74 aClass74_76;

	@OriginalMember(owner = "client!wfa", name = "O", descriptor = "[I")
	public int[] anIntArray688;

	@OriginalMember(owner = "client!wfa", name = "T", descriptor = "[I")
	private int[] anIntArray689;

	@OriginalMember(owner = "client!wfa", name = "o", descriptor = "[J")
	private long[] aLongArray21;

	@OriginalMember(owner = "client!wfa", name = "n", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray46;

	@OriginalMember(owner = "client!wfa", name = "x", descriptor = "B")
	public byte aByte148;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
	public int anInt10309;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "B")
	public byte aByte149;

	@OriginalMember(owner = "client!wfa", name = "I", descriptor = "Z")
	private boolean aBoolean763;

	@OriginalMember(owner = "client!wfa", name = "M", descriptor = "Z")
	private boolean aBoolean764;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray47;

	@OriginalMember(owner = "client!wfa", name = "v", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!wfa", name = "B", descriptor = "[J")
	private long[] aLongArray22;

	@OriginalMember(owner = "client!wfa", name = "z", descriptor = "[I")
	private int[] anIntArray690;

	@OriginalMember(owner = "client!wfa", name = "F", descriptor = "I")
	public int anInt10321;

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "[B")
	public byte[] aByteArray110;

	@OriginalMember(owner = "client!wfa", name = "J", descriptor = "I")
	private int anInt10300 = 0;

	@OriginalMember(owner = "client!wfa", name = "t", descriptor = "Ljava/lang/String;")
	public String aString129 = null;

	@OriginalMember(owner = "client!wfa", name = "K", descriptor = "I")
	public int anInt10315 = 0;

	@OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
	public int anInt10320 = -1;

	@OriginalMember(owner = "client!wfa", name = "y", descriptor = "I")
	public int anInt10323 = -1;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class391(@OriginalArg(0) Class6_Sub15 arg0) {
		this.method8902(arg0);
	}

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V")
	private Class391() {
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)Z")
	public boolean method8882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass74_76 == null) {
			this.aClass74_76 = new Class74(4);
		} else {
			@Pc(23) Class6 local23 = this.aClass74_76.method1401((long) arg1);
			if (local23 != null) {
				if (local23 instanceof Class6_Sub6) {
					@Pc(33) Class6_Sub6 local33 = (Class6_Sub6) local23;
					if (local33.anInt482 == arg0) {
						return false;
					}
					local33.anInt482 = arg0;
					return true;
				}
				local23.method9051();
			}
		}
		this.aClass74_76.method1399(new Class6_Sub6(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method8883(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt10309; local23++) {
			if (this.aStringArray47[local23].equals(arg0)) {
				return local23;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	private void method8884() {
		if (this.anInt10309 == 0) {
			this.anInt10323 = -1;
			this.anInt10320 = -1;
			return;
		}
		this.anInt10320 = -1;
		this.anInt10323 = -1;
		@Pc(24) int local24 = 0;
		@Pc(29) byte local29 = this.aByteArray110[0];
		for (@Pc(31) int local31 = 1; local31 < this.anInt10309; local31++) {
			if (this.aByteArray110[local31] > local29) {
				if (local29 == 125) {
					this.anInt10320 = local24;
				}
				local24 = local31;
				local29 = this.aByteArray110[local31];
			} else if (this.anInt10320 == -1 && this.aByteArray110[local31] == 125) {
				this.anInt10320 = local31;
			}
		}
		this.anInt10323 = local24;
		if (this.anInt10323 != -1) {
			this.aByteArray110[this.anInt10323] = 126;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)V")
	private void method8885(@OriginalArg(1) int arg0) {
		if (this.aBoolean763) {
			if (this.aLongArray22 == null) {
				this.aLongArray22 = new long[arg0];
			} else {
				Static695.method5646(this.aLongArray22, 0, this.aLongArray22 = new long[arg0], 0, this.anInt10321);
			}
		}
		if (!this.aBoolean764) {
			return;
		}
		if (this.aStringArray46 == null) {
			this.aStringArray46 = new String[arg0];
		} else {
			Static695.method5647(this.aStringArray46, 0, this.aStringArray46 = new String[arg0], 0, this.anInt10321);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBB)I")
	public int method8886(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt10323 == arg0 && (this.anInt10320 == -1 || this.aByteArray110[this.anInt10320] < 125)) {
			return -1;
		} else if (this.aByteArray110[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray110[arg0] = arg1;
			this.method8884();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)[I")
	public int[] method8887() {
		if (this.anIntArray690 == null) {
			@Pc(17) String[] local17 = new String[this.anInt10309];
			this.anIntArray690 = new int[this.anInt10309];
			@Pc(24) int local24 = 0;
			while (local24 < this.anInt10309) {
				local17[local24] = this.aStringArray47[local24];
				this.anIntArray690[local24] = local24++;
			}
			Static273.method4619(this.anIntArray690, local17);
		}
		return this.anIntArray690;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BI)V")
	private void method8888(@OriginalArg(1) int arg0) {
		if (this.aBoolean763) {
			if (this.aLongArray21 == null) {
				this.aLongArray21 = new long[arg0];
			} else {
				Static695.method5646(this.aLongArray21, 0, this.aLongArray21 = new long[arg0], 0, this.anInt10309);
			}
		}
		if (this.aBoolean764) {
			if (this.aStringArray47 == null) {
				this.aStringArray47 = new String[arg0];
			} else {
				Static695.method5647(this.aStringArray47, 0, this.aStringArray47 = new String[arg0], 0, this.anInt10309);
			}
		}
		if (this.aByteArray110 == null) {
			this.aByteArray110 = new byte[arg0];
		} else {
			Static695.method5648(this.aByteArray110, 0, this.aByteArray110 = new byte[arg0], 0, this.anInt10309);
		}
		if (this.anIntArray689 == null) {
			this.anIntArray689 = new int[arg0];
		} else {
			Static695.method5649(this.anIntArray689, 0, this.anIntArray689 = new int[arg0], 0, this.anInt10309);
		}
		if (this.anIntArray688 == null) {
			this.anIntArray688 = new int[arg0];
		} else {
			Static695.method5649(this.anIntArray688, 0, this.anIntArray688 = new int[arg0], 0, this.anInt10309);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "(II)Ljava/lang/String;")
	public String method8889(@OriginalArg(0) int arg0) {
		if (this.aClass74_76 == null) {
			return null;
		} else {
			@Pc(24) Class6 local24 = this.aClass74_76.method1401((long) arg0);
			return local24 != null && local24 instanceof Class6_Sub43 ? ((Class6_Sub43) local24).aString89 : null;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)V")
	public void method8890(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anInt10309 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt10309);
		}
		this.anInt10309--;
		this.anIntArray690 = null;
		if (this.anInt10309 == 0) {
			this.aStringArray47 = null;
			this.anIntArray688 = null;
			this.anInt10320 = -1;
			this.aLongArray21 = null;
			this.anIntArray689 = null;
			this.aByteArray110 = null;
			this.anInt10323 = -1;
			return;
		}
		Static695.method5648(this.aByteArray110, arg0 + 1, this.aByteArray110, arg0, this.anInt10309 - arg0);
		Static695.method5649(this.anIntArray689, arg0 + 1, this.anIntArray689, arg0, this.anInt10309 - arg0);
		Static695.method5649(this.anIntArray688, arg0 + 1, this.anIntArray688, arg0, this.anInt10309 - arg0);
		if (this.aLongArray21 != null) {
			Static695.method5646(this.aLongArray21, arg0 + 1, this.aLongArray21, arg0, this.anInt10309 - arg0);
		}
		if (this.aStringArray47 != null) {
			Static695.method5647(this.aStringArray47, arg0 + 1, this.aStringArray47, arg0, this.anInt10309 - arg0);
		}
		if (this.anInt10323 == arg0 || this.anInt10320 == arg0) {
			this.method8884();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(IIIII)Z")
	public boolean method8891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg3) - 1;
		@Pc(23) int local23 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		@Pc(27) int local27 = arg2 << arg3;
		@Pc(31) int local31 = local9 ^ local23;
		@Pc(35) int local35 = local27 & local31;
		if (this.aClass74_76 == null) {
			this.aClass74_76 = new Class74(4);
		} else {
			@Pc(45) Class6 local45 = this.aClass74_76.method1401((long) arg0);
			if (local45 != null) {
				if (local45 instanceof Class6_Sub6) {
					@Pc(55) Class6_Sub6 local55 = (Class6_Sub6) local45;
					if (local35 == (local31 & local55.anInt482)) {
						return false;
					}
					local55.anInt482 &= ~local31;
					local55.anInt482 |= local35;
					return true;
				}
				local45.method9051();
			}
		}
		this.aClass74_76.method1399(new Class6_Sub6(local35), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IJLjava/lang/String;B)V")
	public void method8892(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) String arg2) {
		if (arg2 != null && arg2.length() == 0) {
			arg2 = null;
		}
		if (this.aBoolean763 == arg1 <= 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean763 + " but userhash:" + arg1);
		} else if (this.aBoolean764 == (arg2 != null)) {
			if (arg1 > 0L && (this.aLongArray21 == null || this.anInt10309 >= this.aLongArray21.length) || arg2 != null && (this.aStringArray47 == null || this.aStringArray47.length <= this.anInt10309)) {
				this.method8888(this.anInt10309 + 5);
			}
			if (this.aLongArray21 != null) {
				this.aLongArray21[this.anInt10309] = arg1;
			}
			if (this.aStringArray47 != null) {
				this.aStringArray47[this.anInt10309] = arg2;
			}
			if (this.anInt10323 == -1) {
				this.anInt10323 = this.anInt10309;
				this.aByteArray110[this.anInt10309] = 126;
			} else {
				this.aByteArray110[this.anInt10309] = 0;
			}
			this.anIntArray689[this.anInt10309] = 0;
			this.anIntArray688[this.anInt10309] = arg0;
			this.anIntArray690 = null;
			this.anInt10309++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean764 + " but displayname:" + arg2);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIII)Ljava/lang/Integer;")
	public Integer method8893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass74_76 == null) {
			return null;
		}
		@Pc(26) Class6 local26 = this.aClass74_76.method1401((long) arg1);
		if (local26 != null && local26 instanceof Class6_Sub6) {
			@Pc(52) int local52 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
			return Integer.valueOf((((Class6_Sub6) local26).anInt482 & local52) >>> arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIB)I")
	public int method8894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		return (local25 & this.anIntArray689[arg2]) >>> arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(II)V")
	public void method8895(@OriginalArg(0) int arg0) {
		this.anInt10321--;
		if (this.anInt10321 == 0) {
			this.aStringArray46 = null;
			this.aLongArray22 = null;
			return;
		}
		if (this.aLongArray22 != null) {
			Static695.method5646(this.aLongArray22, arg0 + 1, this.aLongArray22, arg0, this.anInt10321 - arg0);
		}
		if (this.aStringArray46 != null) {
			Static695.method5647(this.aStringArray46, arg0 + 1, this.aStringArray46, arg0, this.anInt10321 - arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIII)I")
	public int method8897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg0) - 1;
		@Pc(23) int local23 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(27) int local27 = arg1 << arg0;
		@Pc(31) int local31 = local9 ^ local23;
		@Pc(35) int local35 = local27 & local31;
		@Pc(46) int local46 = this.anIntArray689[arg3];
		if (local35 == (local46 & local31)) {
			return -1;
		} else {
			local46 &= ~local31;
			this.anIntArray689[arg3] = local46 | local35;
			return arg3;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;IJ)V")
	public void method8898(@OriginalArg(0) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (this.aBoolean763 != arg1 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean763 + " but userhash:" + arg1);
		} else if (this.aBoolean764 == (arg0 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean764 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray22 == null || this.aLongArray22.length <= this.anInt10321) || arg0 != null && (this.aStringArray46 == null || this.anInt10321 >= this.aStringArray46.length)) {
				this.method8885(this.anInt10321 + 5);
			}
			if (this.aLongArray22 != null) {
				this.aLongArray22[this.anInt10321] = arg1;
			}
			if (this.aStringArray46 != null) {
				this.aStringArray46[this.anInt10321] = arg0;
			}
			this.anInt10321++;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILjava/lang/String;B)Z")
	public boolean method8900(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass74_76 == null) {
			this.aClass74_76 = new Class74(4);
		} else {
			@Pc(34) Class6 local34 = this.aClass74_76.method1401((long) arg0);
			if (local34 != null) {
				if (local34 instanceof Class6_Sub43) {
					@Pc(44) Class6_Sub43 local44 = (Class6_Sub43) local34;
					if (local44.aString89.equals(arg1)) {
						return false;
					}
					local44.aString89 = arg1;
					return true;
				}
				local34.method9051();
			}
		}
		this.aClass74_76.method1399(new Class6_Sub43(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method8901(@OriginalArg(0) int arg0) {
		if (this.aClass74_76 == null) {
			return null;
		} else {
			@Pc(24) Class6 local24 = this.aClass74_76.method1401((long) arg0);
			return local24 != null && local24 instanceof Class6_Sub6 ? Integer.valueOf(((Class6_Sub6) local24).anInt482) : null;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILclient!jc;)V")
	private void method8902(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(20) int local20 = arg0.method3030();
		if (local20 < 1 || local20 > 5) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local20);
		}
		@Pc(48) int local48 = arg0.method3030();
		if ((local48 & 0x2) != 0) {
			this.aBoolean764 = true;
		}
		if ((local48 & 0x1) != 0) {
			this.aBoolean763 = true;
		}
		if (!this.aBoolean763) {
			this.aLongArray21 = null;
			this.aLongArray22 = null;
		}
		if (!this.aBoolean764) {
			this.aStringArray47 = null;
			this.aStringArray46 = null;
		}
		this.anInt10315 = arg0.method3015();
		this.anInt10300 = arg0.method3015();
		if (local20 <= 3 && this.anInt10300 != 0) {
			this.anInt10300 += 16912800;
		}
		this.anInt10309 = arg0.method3018();
		this.anInt10321 = arg0.method3030();
		this.aString129 = arg0.method3046();
		if (local20 >= 4) {
			arg0.method3015();
		}
		this.aBoolean762 = arg0.method3030() == 1;
		this.aByte148 = arg0.method3027();
		this.aByte147 = arg0.method3027();
		this.aByte149 = arg0.method3027();
		this.aByte150 = arg0.method3027();
		@Pc(280) int local280;
		if (this.anInt10309 > 0) {
			if (this.aBoolean763 && (this.aLongArray21 == null || this.anInt10309 > this.aLongArray21.length)) {
				this.aLongArray21 = new long[this.anInt10309];
			}
			if (this.aBoolean764 && (this.aStringArray47 == null || this.anInt10309 > this.aStringArray47.length)) {
				this.aStringArray47 = new String[this.anInt10309];
			}
			if (this.aByteArray110 == null || this.anInt10309 > this.aByteArray110.length) {
				this.aByteArray110 = new byte[this.anInt10309];
			}
			if (this.anIntArray689 == null || this.anIntArray689.length < this.anInt10309) {
				this.anIntArray689 = new int[this.anInt10309];
			}
			if (this.anIntArray688 == null || this.anIntArray688.length < this.anInt10309) {
				this.anIntArray688 = new int[this.anInt10309];
			}
			for (local280 = 0; local280 < this.anInt10309; local280++) {
				if (this.aBoolean763) {
					this.aLongArray21[local280] = arg0.method3049();
				}
				if (this.aBoolean764) {
					this.aStringArray47[local280] = arg0.method2986();
				}
				this.aByteArray110[local280] = arg0.method3027();
				if (local20 >= 2) {
					this.anIntArray689[local280] = arg0.method3015();
				}
				if (local20 < 5) {
					this.anIntArray688[local280] = 0;
				} else {
					this.anIntArray688[local280] = arg0.method3018();
				}
			}
			this.method8884();
		}
		if (this.anInt10321 > 0) {
			if (this.aBoolean763 && (this.aLongArray22 == null || this.anInt10321 > this.aLongArray22.length)) {
				this.aLongArray22 = new long[this.anInt10321];
			}
			if (this.aBoolean764 && (this.aStringArray46 == null || this.aStringArray46.length < this.anInt10321)) {
				this.aStringArray46 = new String[this.anInt10321];
			}
			for (local280 = 0; local280 < this.anInt10321; local280++) {
				if (this.aBoolean763) {
					this.aLongArray22[local280] = arg0.method3049();
				}
				if (this.aBoolean764) {
					this.aStringArray46[local280] = arg0.method2986();
				}
			}
		}
		if (local20 < 3) {
			return;
		}
		local280 = arg0.method3018();
		if (local280 <= 0) {
			return;
		}
		this.aClass74_76 = new Class74(local280 >= 16 ? 16 : Static314.method4970(local280));
		while (local280-- > 0) {
			@Pc(491) int local491 = arg0.method3015();
			@Pc(495) int local495 = local491 & 0x3FFFFFFF;
			@Pc(499) int local499 = local491 >>> 30;
			if (local499 == 0) {
				@Pc(549) int local549 = arg0.method3015();
				this.aClass74_76.method1399(new Class6_Sub6(local549), (long) local495);
			} else if (local499 == 1) {
				@Pc(512) long local512 = arg0.method3049();
				this.aClass74_76.method1399(new Class6_Sub40(local512), (long) local495);
			} else if (local499 == 2) {
				@Pc(533) String local533 = arg0.method3046();
				this.aClass74_76.method1399(new Class6_Sub43(local533), (long) local495);
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(JII)Z")
	public boolean method8903(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		if (this.aClass74_76 == null) {
			this.aClass74_76 = new Class74(4);
		} else {
			@Pc(23) Class6 local23 = this.aClass74_76.method1401((long) arg1);
			if (local23 != null) {
				if (local23 instanceof Class6_Sub40) {
					@Pc(33) Class6_Sub40 local33 = (Class6_Sub40) local23;
					if (local33.aLong237 == arg0) {
						return false;
					}
					local33.aLong237 = arg0;
					return true;
				}
				local23.method9051();
			}
		}
		this.aClass74_76.method1399(new Class6_Sub40(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)Ljava/lang/Long;")
	public Long method8904(@OriginalArg(0) int arg0) {
		if (this.aClass74_76 == null) {
			return null;
		} else {
			@Pc(16) Class6 local16 = this.aClass74_76.method1401((long) arg0);
			return local16 != null && local16 instanceof Class6_Sub40 ? Long.valueOf(((Class6_Sub40) local16).aLong237) : null;
		}
	}
}
