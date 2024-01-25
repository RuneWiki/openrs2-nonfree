import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class394 {

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "J")
	public long aLong340;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "Lclient!lba;")
	private Class218 aClass218_44;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray43;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "B")
	public byte aByte147;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "[J")
	private long[] aLongArray23;

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
	public int anInt10742;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Z")
	private boolean aBoolean921;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "[I")
	public int[] anIntArray744;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray44;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "Z")
	private boolean aBoolean922;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "[I")
	private int[] anIntArray745;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "[J")
	private long[] aLongArray24;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "B")
	public byte aByte148;

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "B")
	public byte aByte149;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "Z")
	public boolean aBoolean923;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "[B")
	public byte[] aByteArray120;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	public int anInt10757;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "[I")
	private int[] anIntArray746;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
	public int anInt10743 = 0;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	public int anInt10750 = -1;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	private int anInt10755 = 0;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
	public int anInt10756 = -1;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Ljava/lang/String;")
	public String aString126 = null;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class394(@OriginalArg(0) Class2_Sub20 arg0) {
		this.method9406(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	private Class394() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBII)Ljava/lang/Integer;")
	public Integer method9386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass218_44 == null) {
			return null;
		}
		@Pc(24) Class2 local24 = this.aClass218_44.method5095((long) arg2, 0);
		if (local24 != null && local24 instanceof Class2_Sub2) {
			@Pc(50) int local50 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
			return Integer.valueOf((((Class2_Sub2) local24).anInt41 & local50) >>> arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method9387(@OriginalArg(1) int arg0) {
		if (this.aClass218_44 == null) {
			return null;
		} else {
			@Pc(26) Class2 local26 = this.aClass218_44.method5095((long) arg0, 0);
			return local26 != null && local26 instanceof Class2_Sub2 ? Integer.valueOf(((Class2_Sub2) local26).anInt41) : null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIII)I")
	public int method9388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(24) int local24 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		return (this.anIntArray745[arg0] & local24) >>> arg2;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIJ)Z")
	public boolean method9389(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass218_44 == null) {
			this.aClass218_44 = new Class218(4);
		} else {
			@Pc(13) Class2 local13 = this.aClass218_44.method5095((long) arg0, 0);
			if (local13 != null) {
				if (local13 instanceof Class2_Sub42) {
					@Pc(23) Class2_Sub42 local23 = (Class2_Sub42) local13;
					if (arg1 == local23.aLong198) {
						return false;
					}
					local23.aLong198 = arg1;
					return true;
				}
				local13.method9872();
			}
		}
		this.aClass218_44.method5099(new Class2_Sub42(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)I")
	public int method9390(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 126 || arg0 == 127) {
			return -1;
		} else if (arg1 == this.anInt10756 && (this.anInt10750 == -1 || this.aByteArray120[this.anInt10750] < 125)) {
			return -1;
		} else if (this.aByteArray120[arg1] == arg0) {
			return -1;
		} else {
			this.aByteArray120[arg1] = arg0;
			this.method9395();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V")
	public void method9391(@OriginalArg(1) int arg0) {
		this.anInt10757--;
		if (this.anInt10757 == 0) {
			this.aLongArray23 = null;
			this.aStringArray43 = null;
			return;
		}
		if (this.aLongArray23 != null) {
			Static728.method268(this.aLongArray23, arg0 + 1, this.aLongArray23, arg0, this.anInt10757 - arg0);
		}
		if (this.aStringArray43 != null) {
			Static728.method269(this.aStringArray43, arg0 + 1, this.aStringArray43, arg0, this.anInt10757 - arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(JIILjava/lang/String;)V")
	public void method9392(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg2 != null && arg2.length() == 0) {
			arg2 = null;
		}
		if (this.aBoolean922 != arg0 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean922 + " but userhash:" + arg0);
		} else if ((arg2 == null) == this.aBoolean921) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean921 + " but displayname:" + arg2);
		} else {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt10742 >= this.aLongArray24.length) || arg2 != null && (this.aStringArray44 == null || this.anInt10742 >= this.aStringArray44.length)) {
				this.method9398(this.anInt10742 + 5);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt10742] = arg0;
			}
			if (this.aStringArray44 != null) {
				this.aStringArray44[this.anInt10742] = arg2;
			}
			if (this.anInt10756 == -1) {
				this.anInt10756 = this.anInt10742;
				this.aByteArray120[this.anInt10742] = 126;
			} else {
				this.aByteArray120[this.anInt10742] = 0;
			}
			this.anIntArray745[this.anInt10742] = 0;
			this.anIntArray744[this.anInt10742] = arg1;
			this.anIntArray746 = null;
			this.anInt10742++;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)Z")
	public boolean method9393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg1) - 1;
		@Pc(25) int local25 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(29) int local29 = local25 ^ local9;
		@Pc(33) int local33 = arg0 << arg1;
		@Pc(37) int local37 = local33 & local29;
		if (this.aClass218_44 == null) {
			this.aClass218_44 = new Class218(4);
		} else {
			@Pc(49) Class2 local49 = this.aClass218_44.method5095((long) arg3, 0);
			if (local49 != null) {
				if (local49 instanceof Class2_Sub2) {
					@Pc(59) Class2_Sub2 local59 = (Class2_Sub2) local49;
					if (local37 == (local29 & local59.anInt41)) {
						return false;
					}
					local59.anInt41 &= ~local29;
					local59.anInt41 |= local37;
					return true;
				}
				local49.method9872();
			}
		}
		this.aClass218_44.method5099(new Class2_Sub2(local37), (long) arg3);
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIII)I")
	public int method9394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg1) - 1;
		@Pc(25) int local25 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(29) int local29 = arg3 << arg1;
		@Pc(33) int local33 = local9 ^ local25;
		@Pc(37) int local37 = local29 & local33;
		@Pc(42) int local42 = this.anIntArray745[arg0];
		if ((local42 & local33) == local37) {
			return -1;
		} else {
			local42 &= ~local33;
			this.anIntArray745[arg0] = local42 | local37;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	private void method9395() {
		if (this.anInt10742 == 0) {
			this.anInt10750 = -1;
			this.anInt10756 = -1;
			return;
		}
		this.anInt10750 = -1;
		this.anInt10756 = -1;
		@Pc(27) int local27 = 0;
		@Pc(32) byte local32 = this.aByteArray120[0];
		for (@Pc(34) int local34 = 1; local34 < this.anInt10742; local34++) {
			if (local32 < this.aByteArray120[local34]) {
				if (local32 == 125) {
					this.anInt10750 = local27;
				}
				local32 = this.aByteArray120[local34];
				local27 = local34;
			} else if (this.anInt10750 == -1 && this.aByteArray120[local34] == 125) {
				this.anInt10750 = local34;
			}
		}
		this.anInt10756 = local27;
		if (this.anInt10756 != -1) {
			this.aByteArray120[this.anInt10756] = 126;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)[I")
	public int[] method9396() {
		if (this.anIntArray746 == null) {
			this.anIntArray746 = new int[this.anInt10742];
			@Pc(13) String[] local13 = new String[this.anInt10742];
			@Pc(15) int local15 = 0;
			while (this.anInt10742 > local15) {
				local13[local15] = this.aStringArray44[local15];
				this.anIntArray746[local15] = local15++;
			}
			Static1.method8061(this.anIntArray746, local13);
		}
		return this.anIntArray746;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	public boolean method9397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass218_44 == null) {
			this.aClass218_44 = new Class218(4);
		} else {
			@Pc(23) Class2 local23 = this.aClass218_44.method5095((long) arg0, 0);
			if (local23 != null) {
				if (local23 instanceof Class2_Sub2) {
					@Pc(33) Class2_Sub2 local33 = (Class2_Sub2) local23;
					if (arg1 == local33.anInt41) {
						return false;
					}
					local33.anInt41 = arg1;
					return true;
				}
				local23.method9872();
			}
		}
		this.aClass218_44.method5099(new Class2_Sub2(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	private void method9398(@OriginalArg(0) int arg0) {
		if (this.aBoolean922) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				Static728.method268(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt10742);
			}
		}
		if (this.aBoolean921) {
			if (this.aStringArray44 == null) {
				this.aStringArray44 = new String[arg0];
			} else {
				Static728.method269(this.aStringArray44, 0, this.aStringArray44 = new String[arg0], 0, this.anInt10742);
			}
		}
		if (this.aByteArray120 == null) {
			this.aByteArray120 = new byte[arg0];
		} else {
			Static728.method274(this.aByteArray120, 0, this.aByteArray120 = new byte[arg0], 0, this.anInt10742);
		}
		if (this.anIntArray745 == null) {
			this.anIntArray745 = new int[arg0];
		} else {
			Static728.method273(this.anIntArray745, 0, this.anIntArray745 = new int[arg0], 0, this.anInt10742);
		}
		if (this.anIntArray744 == null) {
			this.anIntArray744 = new int[arg0];
		} else {
			Static728.method273(this.anIntArray744, 0, this.anIntArray744 = new int[arg0], 0, this.anInt10742);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLjava/lang/String;I)Z")
	public boolean method9399(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass218_44 == null) {
			this.aClass218_44 = new Class218(4);
		} else {
			@Pc(42) Class2 local42 = this.aClass218_44.method5095((long) arg1, 0);
			if (local42 != null) {
				if (local42 instanceof Class2_Sub47) {
					@Pc(52) Class2_Sub47 local52 = (Class2_Sub47) local42;
					if (local52.aString88.equals(arg0)) {
						return false;
					}
					local52.aString88 = arg0;
					return true;
				}
				local42.method9872();
			}
		}
		this.aClass218_44.method5099(new Class2_Sub47(arg0), (long) arg1);
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method9401(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt10742; local17++) {
			if (this.aStringArray44[local17].equals(arg0)) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(II)V")
	private void method9402(@OriginalArg(0) int arg0) {
		if (this.aBoolean922) {
			if (this.aLongArray23 == null) {
				this.aLongArray23 = new long[arg0];
			} else {
				Static728.method268(this.aLongArray23, 0, this.aLongArray23 = new long[arg0], 0, this.anInt10757);
			}
		}
		if (!this.aBoolean921) {
			return;
		}
		if (this.aStringArray43 == null) {
			this.aStringArray43 = new String[arg0];
		} else {
			Static728.method269(this.aStringArray43, 0, this.aStringArray43 = new String[arg0], 0, this.anInt10757);
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(II)V")
	public void method9403(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anInt10742 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt10742);
		}
		this.anIntArray746 = null;
		this.anInt10742--;
		if (this.anInt10742 == 0) {
			this.anIntArray745 = null;
			this.aByteArray120 = null;
			this.aLongArray24 = null;
			this.aStringArray44 = null;
			this.anInt10756 = -1;
			this.anIntArray744 = null;
			this.anInt10750 = -1;
			return;
		}
		Static728.method274(this.aByteArray120, arg0 + 1, this.aByteArray120, arg0, this.anInt10742 - arg0);
		Static728.method273(this.anIntArray745, arg0 + 1, this.anIntArray745, arg0, this.anInt10742 - arg0);
		Static728.method273(this.anIntArray744, arg0 + 1, this.anIntArray744, arg0, this.anInt10742 - arg0);
		if (this.aLongArray24 != null) {
			Static728.method268(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt10742 - arg0);
		}
		if (this.aStringArray44 != null) {
			Static728.method269(this.aStringArray44, arg0 + 1, this.aStringArray44, arg0, this.anInt10742 - arg0);
		}
		if (this.anInt10756 == arg0 || this.anInt10750 == arg0) {
			this.method9395();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Ljava/lang/Long;")
	public Long method9404(@OriginalArg(0) int arg0) {
		if (this.aClass218_44 == null) {
			return null;
		} else {
			@Pc(22) Class2 local22 = this.aClass218_44.method5095((long) arg0, 0);
			return local22 != null && local22 instanceof Class2_Sub42 ? Long.valueOf(((Class2_Sub42) local22).aLong198) : null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method9405(@OriginalArg(0) int arg0) {
		if (this.aClass218_44 == null) {
			return null;
		} else {
			@Pc(29) Class2 local29 = this.aClass218_44.method5095((long) arg0, 0);
			return local29 != null && local29 instanceof Class2_Sub47 ? ((Class2_Sub47) local29).aString88 : null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!et;)V")
	private void method9406(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(11) int local11 = arg0.method8581(-17416);
		if (local11 < 1 || local11 > 5) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local11);
		}
		@Pc(41) int local41 = arg0.method8581(-17416);
		if ((local41 & 0x2) != 0) {
			this.aBoolean921 = true;
		}
		if ((local41 & 0x1) != 0) {
			this.aBoolean922 = true;
		}
		if (!this.aBoolean922) {
			this.aLongArray24 = null;
			this.aLongArray23 = null;
		}
		if (!this.aBoolean921) {
			this.aStringArray43 = null;
			this.aStringArray44 = null;
		}
		this.anInt10743 = arg0.method8555(-9372);
		this.anInt10755 = arg0.method8555(-9372);
		if (local11 <= 3 && this.anInt10755 != 0) {
			this.anInt10755 += 16912800;
		}
		this.anInt10742 = arg0.method8575();
		this.anInt10757 = arg0.method8581(-17416);
		this.aString126 = arg0.method8553();
		if (local11 >= 4) {
			arg0.method8555(-9372);
		}
		this.aBoolean923 = arg0.method8581(-17416) == 1;
		this.aByte149 = arg0.method8536();
		this.aByte150 = arg0.method8536();
		this.aByte148 = arg0.method8536();
		this.aByte147 = arg0.method8536();
		@Pc(296) int local296;
		if (this.anInt10742 > 0) {
			if (this.aBoolean922 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt10742)) {
				this.aLongArray24 = new long[this.anInt10742];
			}
			if (this.aBoolean921 && (this.aStringArray44 == null || this.anInt10742 > this.aStringArray44.length)) {
				this.aStringArray44 = new String[this.anInt10742];
			}
			if (this.aByteArray120 == null || this.aByteArray120.length < this.anInt10742) {
				this.aByteArray120 = new byte[this.anInt10742];
			}
			if (this.anIntArray745 == null || this.anInt10742 > this.anIntArray745.length) {
				this.anIntArray745 = new int[this.anInt10742];
			}
			if (this.anIntArray744 == null || this.anIntArray744.length < this.anInt10742) {
				this.anIntArray744 = new int[this.anInt10742];
			}
			for (local296 = 0; local296 < this.anInt10742; local296++) {
				if (this.aBoolean922) {
					this.aLongArray24[local296] = arg0.method8590();
				}
				if (this.aBoolean921) {
					this.aStringArray44[local296] = arg0.method8569();
				}
				this.aByteArray120[local296] = arg0.method8536();
				if (local11 >= 2) {
					this.anIntArray745[local296] = arg0.method8555(-9372);
				}
				if (local11 < 5) {
					this.anIntArray744[local296] = 0;
				} else {
					this.anIntArray744[local296] = arg0.method8575();
				}
			}
			this.method9395();
		}
		if (this.anInt10757 > 0) {
			if (this.aBoolean922 && (this.aLongArray23 == null || this.anInt10757 > this.aLongArray23.length)) {
				this.aLongArray23 = new long[this.anInt10757];
			}
			if (this.aBoolean921 && (this.aStringArray43 == null || this.anInt10757 > this.aStringArray43.length)) {
				this.aStringArray43 = new String[this.anInt10757];
			}
			for (local296 = 0; local296 < this.anInt10757; local296++) {
				if (this.aBoolean922) {
					this.aLongArray23[local296] = arg0.method8590();
				}
				if (this.aBoolean921) {
					this.aStringArray43[local296] = arg0.method8569();
				}
			}
		}
		if (local11 < 3) {
			return;
		}
		local296 = arg0.method8575();
		if (local296 <= 0) {
			return;
		}
		this.aClass218_44 = new Class218(local296 < 16 ? Static330.method4577(local296) : 16);
		while (local296-- > 0) {
			@Pc(515) int local515 = arg0.method8555(-9372);
			@Pc(519) int local519 = local515 & 0x3FFFFFFF;
			@Pc(523) int local523 = local515 >>> 30;
			if (local523 == 0) {
				@Pc(532) int local532 = arg0.method8555(-9372);
				this.aClass218_44.method5099(new Class2_Sub2(local532), (long) local519);
			} else if (local523 == 1) {
				@Pc(580) long local580 = arg0.method8590();
				this.aClass218_44.method5099(new Class2_Sub42(local580), (long) local519);
			} else if (local523 == 2) {
				@Pc(564) String local564 = arg0.method8553();
				this.aClass218_44.method5099(new Class2_Sub47(local564), (long) local519);
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;J)V")
	public void method9407(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 > 0L != this.aBoolean922) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean922 + " but userhash:" + arg1);
		} else if ((arg0 != null) == this.aBoolean921) {
			if (arg1 > 0L && (this.aLongArray23 == null || this.aLongArray23.length <= this.anInt10757) || arg0 != null && (this.aStringArray43 == null || this.anInt10757 >= this.aStringArray43.length)) {
				this.method9402(this.anInt10757 + 5);
			}
			if (this.aLongArray23 != null) {
				this.aLongArray23[this.anInt10757] = arg1;
			}
			if (this.aStringArray43 != null) {
				this.aStringArray43[this.anInt10757] = arg0;
			}
			this.anInt10757++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean921 + " but displayname:" + arg0);
		}
	}
}
