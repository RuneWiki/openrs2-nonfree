import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class23 {

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!aq", name = "I", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "[J")
	private long[] aLongArray3;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!aq", name = "B", descriptor = "J")
	public long aLong18;

	@OriginalMember(owner = "client!aq", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray5;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "Z")
	private boolean aBoolean23;

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!aq", name = "P", descriptor = "Lclient!fw;")
	private Class125 aClass125_2;

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "B")
	public byte aByte2;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "[J")
	private long[] aLongArray4;

	@OriginalMember(owner = "client!aq", name = "V", descriptor = "Z")
	public boolean aBoolean24;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "B")
	public byte aByte3;

	@OriginalMember(owner = "client!aq", name = "C", descriptor = "Z")
	private boolean aBoolean25;

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "B")
	public byte aByte4;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
	public int anInt304 = -1;

	@OriginalMember(owner = "client!aq", name = "X", descriptor = "I")
	private int anInt311 = 0;

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "Ljava/lang/String;")
	public String aString7 = null;

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "I")
	public int anInt327 = -1;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	public int anInt317 = 0;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class23(@OriginalArg(0) Class14_Sub21 arg0) {
		this.method356(arg0);
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BIII)Ljava/lang/Integer;")
	public Integer method330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass125_2 == null) {
			return null;
		}
		@Pc(24) Class14 local24 = this.aClass125_2.method2630((long) arg2);
		if (local24 != null && local24 instanceof Class14_Sub30) {
			@Pc(48) int local48 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
			return Integer.valueOf((((Class14_Sub30) local24).anInt6793 & local48) >>> arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIBI)I")
	public int method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		return (local27 & this.anIntArray25[arg2]) >>> arg1;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(JZLjava/lang/String;)V")
	public void method333(@OriginalArg(0) long arg0, @OriginalArg(2) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean25 != arg0 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean25 + " but userhash:" + arg0);
		} else if ((arg1 != null) == this.aBoolean23) {
			if (arg0 > 0L && (this.aLongArray4 == null || this.aLongArray4.length <= this.anInt298) || arg1 != null && (this.aStringArray4 == null || this.aStringArray4.length <= this.anInt298)) {
				this.method352(this.anInt298 + 5);
			}
			if (this.aLongArray4 != null) {
				this.aLongArray4[this.anInt298] = arg0;
			}
			if (this.aStringArray4 != null) {
				this.aStringArray4[this.anInt298] = arg1;
			}
			this.anInt298++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean23 + " but displayname:" + arg1);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
	private void method335() {
		if (this.anInt299 == 0) {
			this.anInt327 = -1;
			this.anInt304 = -1;
			return;
		}
		this.anInt304 = -1;
		this.anInt327 = -1;
		@Pc(25) int local25 = 0;
		@Pc(30) byte local30 = this.aByteArray5[0];
		for (@Pc(40) int local40 = 1; local40 < this.anInt299; local40++) {
			if (this.aByteArray5[local40] > local30) {
				if (local30 == 125) {
					this.anInt327 = local25;
				}
				local25 = local40;
				local30 = this.aByteArray5[local40];
			} else if (this.anInt327 == -1 && this.aByteArray5[local40] == 125) {
				this.anInt327 = local40;
			}
		}
		this.anInt304 = local25;
		if (this.anInt304 != -1) {
			this.aByteArray5[this.anInt304] = 126;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)Z")
	public boolean method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass125_2 == null) {
			this.aClass125_2 = new Class125(4);
		} else {
			@Pc(13) Class14 local13 = this.aClass125_2.method2630((long) arg0);
			if (local13 != null) {
				if (local13 instanceof Class14_Sub30) {
					@Pc(23) Class14_Sub30 local23 = (Class14_Sub30) local13;
					if (local23.anInt6793 == arg1) {
						return false;
					}
					local23.anInt6793 = arg1;
					return true;
				}
				local13.method9513();
			}
		}
		this.aClass125_2.method2626(new Class14_Sub30(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(II)V")
	public void method338(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anInt299 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt299);
		}
		this.anInt299--;
		this.anIntArray24 = null;
		if (this.anInt299 == 0) {
			this.aStringArray5 = null;
			this.anInt327 = -1;
			this.anIntArray26 = null;
			this.anInt304 = -1;
			this.anIntArray25 = null;
			this.aByteArray5 = null;
			this.aLongArray3 = null;
			return;
		}
		Static691.method82(this.aByteArray5, arg0 + 1, this.aByteArray5, arg0, this.anInt299 - arg0);
		Static691.method84(this.anIntArray25, arg0 + 1, this.anIntArray25, arg0, this.anInt299 - arg0);
		Static691.method84(this.anIntArray26, arg0 + 1, this.anIntArray26, arg0, this.anInt299 - arg0);
		if (this.aLongArray3 != null) {
			Static691.method87(this.aLongArray3, arg0 + 1, this.aLongArray3, arg0, this.anInt299 - arg0);
		}
		if (this.aStringArray5 != null) {
			Static691.method86(this.aStringArray5, arg0 + 1, this.aStringArray5, arg0, this.anInt299 - arg0);
		}
		if (arg0 == this.anInt304 || this.anInt327 == arg0) {
			this.method335();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;JIB)V")
	public void method339(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 > 0L != this.aBoolean25) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean25 + " but userhash:" + arg1);
		} else if ((arg0 != null) == this.aBoolean23) {
			if (arg1 > 0L && (this.aLongArray3 == null || this.aLongArray3.length <= this.anInt299) || arg0 != null && (this.aStringArray5 == null || this.anInt299 >= this.aStringArray5.length)) {
				this.method341(this.anInt299 + 5);
			}
			if (this.aLongArray3 != null) {
				this.aLongArray3[this.anInt299] = arg1;
			}
			if (this.aStringArray5 != null) {
				this.aStringArray5[this.anInt299] = arg0;
			}
			if (this.anInt304 == -1) {
				this.anInt304 = this.anInt299;
				this.aByteArray5[this.anInt299] = 126;
			} else {
				this.aByteArray5[this.anInt299] = 0;
			}
			this.anIntArray25[this.anInt299] = 0;
			this.anIntArray26[this.anInt299] = arg2;
			this.anInt299++;
			this.anIntArray24 = null;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean23 + " but displayname:" + arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)I")
	public int method340(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt304 == arg0 && (this.anInt327 == -1 || this.aByteArray5[this.anInt327] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray5[arg0]) {
			return -1;
		} else {
			this.aByteArray5[arg0] = arg1;
			this.method335();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZ)V")
	private void method341(@OriginalArg(0) int arg0) {
		if (this.aBoolean25) {
			if (this.aLongArray3 == null) {
				this.aLongArray3 = new long[arg0];
			} else {
				Static691.method87(this.aLongArray3, 0, this.aLongArray3 = new long[arg0], 0, this.anInt299);
			}
		}
		if (this.aBoolean23) {
			if (this.aStringArray5 == null) {
				this.aStringArray5 = new String[arg0];
			} else {
				Static691.method86(this.aStringArray5, 0, this.aStringArray5 = new String[arg0], 0, this.anInt299);
			}
		}
		if (this.aByteArray5 == null) {
			this.aByteArray5 = new byte[arg0];
		} else {
			Static691.method82(this.aByteArray5, 0, this.aByteArray5 = new byte[arg0], 0, this.anInt299);
		}
		if (this.anIntArray25 == null) {
			this.anIntArray25 = new int[arg0];
		} else {
			Static691.method84(this.anIntArray25, 0, this.anIntArray25 = new int[arg0], 0, this.anInt299);
		}
		if (this.anIntArray26 == null) {
			this.anIntArray26 = new int[arg0];
		} else {
			Static691.method84(this.anIntArray26, 0, this.anIntArray26 = new int[arg0], 0, this.anInt299);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)[I")
	public int[] method342() {
		if (this.anIntArray24 == null) {
			this.anIntArray24 = new int[this.anInt299];
			@Pc(15) String[] local15 = new String[this.anInt299];
			@Pc(17) int local17 = 0;
			while (this.anInt299 > local17) {
				local15[local17] = this.aStringArray5[local17];
				this.anIntArray24[local17] = local17++;
			}
			Static214.method3272(local15, this.anIntArray24);
		}
		return this.anIntArray24;
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(BI)Ljava/lang/Integer;")
	public Integer method343(@OriginalArg(1) int arg0) {
		if (this.aClass125_2 == null) {
			return null;
		} else {
			@Pc(24) Class14 local24 = this.aClass125_2.method2630((long) arg0);
			return local24 != null && local24 instanceof Class14_Sub30 ? Integer.valueOf(((Class14_Sub30) local24).anInt6793) : null;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZIII)Z")
	public boolean method344(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = (0x1 << arg2) - 1;
		@Pc(29) int local29 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		@Pc(33) int local33 = local29 ^ local15;
		@Pc(37) int local37 = arg1 << arg2;
		@Pc(41) int local41 = local37 & local33;
		if (this.aClass125_2 == null) {
			this.aClass125_2 = new Class125(4);
		} else {
			@Pc(61) Class14 local61 = this.aClass125_2.method2630((long) arg3);
			if (local61 != null) {
				if (local61 instanceof Class14_Sub30) {
					@Pc(71) Class14_Sub30 local71 = (Class14_Sub30) local61;
					if (local41 == (local33 & local71.anInt6793)) {
						return false;
					}
					local71.anInt6793 &= ~local33;
					local71.anInt6793 |= local41;
					return true;
				}
				local61.method9513();
			}
		}
		this.aClass125_2.method2626(new Class14_Sub30(local41), (long) arg3);
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IJI)Z")
	public boolean method347(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass125_2 == null) {
			this.aClass125_2 = new Class125(4);
		} else {
			@Pc(26) Class14 local26 = this.aClass125_2.method2630((long) arg0);
			if (local26 != null) {
				if (local26 instanceof Class14_Sub46) {
					@Pc(36) Class14_Sub46 local36 = (Class14_Sub46) local26;
					if (arg1 == local36.aLong284) {
						return false;
					}
					local36.aLong284 = arg1;
					return true;
				}
				local26.method9513();
			}
		}
		this.aClass125_2.method2626(new Class14_Sub46(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public boolean method349(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass125_2 == null) {
			this.aClass125_2 = new Class125(4);
		} else {
			@Pc(44) Class14 local44 = this.aClass125_2.method2630((long) arg0);
			if (local44 != null) {
				if (local44 instanceof Class14_Sub45) {
					@Pc(54) Class14_Sub45 local54 = (Class14_Sub45) local44;
					if (local54.aString109.equals(arg1)) {
						return false;
					}
					local54.aString109 = arg1;
					return true;
				}
				local44.method9513();
			}
		}
		this.aClass125_2.method2626(new Class14_Sub45(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(BI)V")
	public void method350(@OriginalArg(1) int arg0) {
		this.anInt298--;
		if (this.anInt298 == 0) {
			this.aStringArray4 = null;
			this.aLongArray4 = null;
			return;
		}
		if (this.aLongArray4 != null) {
			Static691.method87(this.aLongArray4, arg0 + 1, this.aLongArray4, arg0, this.anInt298 - arg0);
		}
		if (this.aStringArray4 != null) {
			Static691.method86(this.aStringArray4, arg0 + 1, this.aStringArray4, arg0, this.anInt298 - arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method351(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt299; local21++) {
			if (this.aStringArray5[local21].equals(arg0)) {
				return local21;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	private void method352(@OriginalArg(0) int arg0) {
		if (this.aBoolean25) {
			if (this.aLongArray4 == null) {
				this.aLongArray4 = new long[arg0];
			} else {
				Static691.method87(this.aLongArray4, 0, this.aLongArray4 = new long[arg0], 0, this.anInt298);
			}
		}
		if (!this.aBoolean23) {
			return;
		}
		if (this.aStringArray4 == null) {
			this.aStringArray4 = new String[arg0];
		} else {
			Static691.method86(this.aStringArray4, 0, this.aStringArray4 = new String[arg0], 0, this.anInt298);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIII)I")
	public int method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = (0x1 << arg3) - 1;
		@Pc(25) int local25 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		@Pc(29) int local29 = arg0 << arg3;
		@Pc(33) int local33 = local25 ^ local9;
		@Pc(37) int local37 = local29 & local33;
		@Pc(42) int local42 = this.anIntArray25[arg2];
		if ((local42 & local33) == local37) {
			return -1;
		} else {
			local42 &= ~local33;
			this.anIntArray25[arg2] = local37 | local42;
			return arg2;
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method354(@OriginalArg(1) int arg0) {
		if (this.aClass125_2 == null) {
			return null;
		} else {
			@Pc(16) Class14 local16 = this.aClass125_2.method2630((long) arg0);
			return local16 != null && local16 instanceof Class14_Sub45 ? ((Class14_Sub45) local16).aString109 : null;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)Ljava/lang/Long;")
	public Long method355(@OriginalArg(1) int arg0) {
		if (this.aClass125_2 == null) {
			return null;
		} else {
			@Pc(16) Class14 local16 = this.aClass125_2.method2630((long) arg0);
			return local16 != null && local16 instanceof Class14_Sub46 ? Long.valueOf(((Class14_Sub46) local16).aLong284) : null;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!jc;)V")
	private void method356(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(9) int local9 = arg0.method7695(109);
		if (local9 < 1 || local9 > 5) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(37) int local37 = arg0.method7695(122);
		if ((local37 & 0x2) != 0) {
			this.aBoolean23 = true;
		}
		if ((local37 & 0x1) != 0) {
			this.aBoolean25 = true;
		}
		if (!this.aBoolean23) {
			this.aStringArray5 = null;
			this.aStringArray4 = null;
		}
		if (!this.aBoolean25) {
			this.aLongArray4 = null;
			this.aLongArray3 = null;
		}
		this.anInt317 = arg0.method7748();
		this.anInt311 = arg0.method7748();
		if (local9 <= 3 && this.anInt311 != 0) {
			this.anInt311 += 16912800;
		}
		this.anInt299 = arg0.method7717(-1978450544);
		this.anInt298 = arg0.method7695(104);
		this.aString7 = arg0.method7703(0);
		if (local9 >= 4) {
			arg0.method7748();
		}
		this.aBoolean24 = arg0.method7695(99) == 1;
		this.aByte4 = arg0.method7720();
		this.aByte1 = arg0.method7720();
		this.aByte2 = arg0.method7720();
		this.aByte3 = arg0.method7720();
		@Pc(293) int local293;
		if (this.anInt299 > 0) {
			if (this.aBoolean25 && (this.aLongArray3 == null || this.aLongArray3.length < this.anInt299)) {
				this.aLongArray3 = new long[this.anInt299];
			}
			if (this.aBoolean23 && (this.aStringArray5 == null || this.aStringArray5.length < this.anInt299)) {
				this.aStringArray5 = new String[this.anInt299];
			}
			if (this.aByteArray5 == null || this.anInt299 > this.aByteArray5.length) {
				this.aByteArray5 = new byte[this.anInt299];
			}
			if (this.anIntArray25 == null || this.anIntArray25.length < this.anInt299) {
				this.anIntArray25 = new int[this.anInt299];
			}
			if (this.anIntArray26 == null || this.anIntArray26.length < this.anInt299) {
				this.anIntArray26 = new int[this.anInt299];
			}
			for (local293 = 0; local293 < this.anInt299; local293++) {
				if (this.aBoolean25) {
					this.aLongArray3[local293] = arg0.method7729();
				}
				if (this.aBoolean23) {
					this.aStringArray5[local293] = arg0.method7706();
				}
				this.aByteArray5[local293] = arg0.method7720();
				if (local9 >= 2) {
					this.anIntArray25[local293] = arg0.method7748();
				}
				if (local9 < 5) {
					this.anIntArray26[local293] = 0;
				} else {
					this.anIntArray26[local293] = arg0.method7717(-1978450544);
				}
			}
			this.method335();
		}
		if (this.anInt298 > 0) {
			if (this.aBoolean25 && (this.aLongArray4 == null || this.aLongArray4.length < this.anInt298)) {
				this.aLongArray4 = new long[this.anInt298];
			}
			if (this.aBoolean23 && (this.aStringArray4 == null || this.aStringArray4.length < this.anInt298)) {
				this.aStringArray4 = new String[this.anInt298];
			}
			for (local293 = 0; local293 < this.anInt298; local293++) {
				if (this.aBoolean25) {
					this.aLongArray4[local293] = arg0.method7729();
				}
				if (this.aBoolean23) {
					this.aStringArray4[local293] = arg0.method7706();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local293 = arg0.method7717(-1978450544);
		if (local293 <= 0) {
			return;
		}
		this.aClass125_2 = new Class125(local293 < 16 ? Static255.method4294(local293) : 16);
		while (local293-- > 0) {
			@Pc(503) int local503 = arg0.method7748();
			@Pc(507) int local507 = local503 & 0x3FFFFFFF;
			@Pc(511) int local511 = local503 >>> 30;
			if (local511 == 0) {
				@Pc(563) int local563 = arg0.method7748();
				this.aClass125_2.method2626(new Class14_Sub30(local563), (long) local507);
			} else if (local511 == 1) {
				@Pc(547) long local547 = arg0.method7729();
				this.aClass125_2.method2626(new Class14_Sub46(local547), (long) local507);
			} else if (local511 == 2) {
				@Pc(531) String local531 = arg0.method7703(0);
				this.aClass125_2.method2626(new Class14_Sub45(local531), (long) local507);
			}
		}
		return;
	}
}
