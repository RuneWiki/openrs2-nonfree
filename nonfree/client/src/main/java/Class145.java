import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class145 {

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "Z")
	private boolean aBoolean216;

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "B")
	public byte aByte52;

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "J")
	public long aLong115;

	@OriginalMember(owner = "client!hia", name = "f", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray23;

	@OriginalMember(owner = "client!hia", name = "h", descriptor = "I")
	public int anInt3676;

	@OriginalMember(owner = "client!hia", name = "j", descriptor = "[J")
	private long[] aLongArray14;

	@OriginalMember(owner = "client!hia", name = "k", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!hia", name = "n", descriptor = "[J")
	private long[] aLongArray15;

	@OriginalMember(owner = "client!hia", name = "o", descriptor = "Lclient!lk;")
	private Class209 aClass209_14;

	@OriginalMember(owner = "client!hia", name = "r", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!hia", name = "x", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!hia", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray24;

	@OriginalMember(owner = "client!hia", name = "C", descriptor = "B")
	public byte aByte54;

	@OriginalMember(owner = "client!hia", name = "E", descriptor = "I")
	public int anInt3689;

	@OriginalMember(owner = "client!hia", name = "H", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!hia", name = "O", descriptor = "B")
	public byte aByte55;

	@OriginalMember(owner = "client!hia", name = "X", descriptor = "Z")
	private boolean aBoolean219;

	@OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
	public int anInt3679 = -1;

	@OriginalMember(owner = "client!hia", name = "K", descriptor = "I")
	public int anInt3693 = 0;

	@OriginalMember(owner = "client!hia", name = "v", descriptor = "Ljava/lang/String;")
	public String aString37 = null;

	@OriginalMember(owner = "client!hia", name = "S", descriptor = "I")
	public int anInt3699 = -1;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class145(@OriginalArg(0) Class6_Sub23 arg0) {
		this.method3163(arg0);
	}

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V")
	private Class145() {
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public boolean method3144(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass209_14 == null) {
			this.aClass209_14 = new Class209(4);
		} else {
			@Pc(45) Class6 local45 = this.aClass209_14.method5038((long) arg1);
			if (local45 != null) {
				if (local45 instanceof Class6_Sub16) {
					@Pc(53) Class6_Sub16 local53 = (Class6_Sub16) local45;
					if (local53.aString22.equals(arg0)) {
						return false;
					}
					local53.aString22 = arg0;
					return true;
				}
				local45.method9174();
			}
		}
		this.aClass209_14.method5035((long) arg1, new Class6_Sub16(arg0));
		return true;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BII)I")
	public int method3145(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 126 || arg0 == 127) {
			return -1;
		} else if (arg1 == this.anInt3699 && (this.anInt3679 == -1 || this.aByteArray46[this.anInt3679] < 125)) {
			return -1;
		} else if (arg0 == this.aByteArray46[arg1]) {
			return -1;
		} else {
			this.aByteArray46[arg1] = arg0;
			this.method3150();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method3146(@OriginalArg(1) int arg0) {
		if (this.aClass209_14 == null) {
			return null;
		} else {
			@Pc(21) Class6 local21 = this.aClass209_14.method5038((long) arg0);
			return local21 != null && local21 instanceof Class6_Sub36 ? Integer.valueOf(((Class6_Sub36) local21).anInt5996) : null;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;IJ)V")
	public void method3147(@OriginalArg(0) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (this.aBoolean219 == arg1 <= 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean219 + " but userhash:" + arg1);
		} else if ((arg0 == null) == this.aBoolean216) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean216 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray15 == null || this.anInt3676 >= this.aLongArray15.length) || arg0 != null && (this.aStringArray24 == null || this.anInt3676 >= this.aStringArray24.length)) {
				this.method3162(this.anInt3676 + 5);
			}
			if (this.aLongArray15 != null) {
				this.aLongArray15[this.anInt3676] = arg1;
			}
			if (this.aStringArray24 != null) {
				this.aStringArray24[this.anInt3676] = arg0;
			}
			this.anInt3676++;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)[I")
	public int[] method3148() {
		if (this.anIntArray208 == null) {
			@Pc(13) String[] local13 = new String[this.anInt3689];
			this.anIntArray208 = new int[this.anInt3689];
			@Pc(20) int local20 = 0;
			while (local20 < this.anInt3689) {
				local13[local20] = this.aStringArray23[local20];
				this.anIntArray208[local20] = local20++;
			}
			Static293.method4212(this.anIntArray208, local13);
		}
		return this.anIntArray208;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BIIII)I")
	public int method3149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg3) - 1;
		@Pc(24) int local24 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		@Pc(28) int local28 = arg0 << arg3;
		@Pc(32) int local32 = local24 ^ local9;
		@Pc(44) int local44 = local28 & local32;
		@Pc(49) int local49 = this.anIntArray207[arg2];
		if (local44 == (local49 & local32)) {
			return -1;
		} else {
			local49 &= ~local32;
			this.anIntArray207[arg2] = local49 | local44;
			return arg2;
		}
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V")
	private void method3150() {
		if (this.anInt3689 == 0) {
			this.anInt3699 = -1;
			this.anInt3679 = -1;
			return;
		}
		this.anInt3679 = -1;
		this.anInt3699 = -1;
		@Pc(26) int local26 = 0;
		@Pc(31) byte local31 = this.aByteArray46[0];
		for (@Pc(33) int local33 = 1; local33 < this.anInt3689; local33++) {
			if (this.aByteArray46[local33] > local31) {
				if (local31 == 125) {
					this.anInt3679 = local26;
				}
				local26 = local33;
				local31 = this.aByteArray46[local33];
			} else if (this.anInt3679 == -1 && this.aByteArray46[local33] == 125) {
				this.anInt3679 = local33;
			}
		}
		this.anInt3699 = local26;
		if (this.anInt3699 != -1) {
			this.aByteArray46[this.anInt3699] = 126;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BLjava/lang/String;J)V")
	public void method3151(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 > 0L != this.aBoolean219) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean219 + " but userhash:" + arg1);
		} else if ((arg0 != null) == this.aBoolean216) {
			if (arg1 > 0L && (this.aLongArray14 == null || this.anInt3689 >= this.aLongArray14.length) || arg0 != null && (this.aStringArray23 == null || this.anInt3689 >= this.aStringArray23.length)) {
				this.method3160(this.anInt3689 + 5);
			}
			if (this.aLongArray14 != null) {
				this.aLongArray14[this.anInt3689] = arg1;
			}
			if (this.aStringArray23 != null) {
				this.aStringArray23[this.anInt3689] = arg0;
			}
			if (this.anInt3699 == -1) {
				this.anInt3699 = this.anInt3689;
				this.aByteArray46[this.anInt3689] = 126;
			} else {
				this.aByteArray46[this.anInt3689] = 0;
			}
			this.anIntArray207[this.anInt3689] = 0;
			this.anInt3689++;
			this.anIntArray208 = null;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean216 + " but displayname:" + arg0);
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZIJ)Z")
	public boolean method3152(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass209_14 == null) {
			this.aClass209_14 = new Class209(4);
		} else {
			@Pc(21) Class6 local21 = this.aClass209_14.method5038((long) arg0);
			if (local21 != null) {
				if (local21 instanceof Class6_Sub50) {
					@Pc(29) Class6_Sub50 local29 = (Class6_Sub50) local21;
					if (arg1 == local29.aLong268) {
						return false;
					}
					local29.aLong268 = arg1;
					return true;
				}
				local21.method9174();
			}
		}
		this.aClass209_14.method5035((long) arg0, new Class6_Sub50(arg1));
		return true;
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(II)V")
	public void method3153(@OriginalArg(0) int arg0) {
		this.anInt3676--;
		if (this.anInt3676 == 0) {
			this.aStringArray24 = null;
			this.aLongArray15 = null;
			return;
		}
		if (this.aLongArray15 != null) {
			Static679.method1565(this.aLongArray15, arg0 + 1, this.aLongArray15, arg0, this.anInt3676 - arg0);
		}
		if (this.aStringArray24 != null) {
			Static679.method1568(this.aStringArray24, arg0 + 1, this.aStringArray24, arg0, this.anInt3676 - arg0);
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZIII)I")
	public int method3154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray207[arg1] & local16) >>> arg0;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIII)Ljava/lang/Integer;")
	public Integer method3155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass209_14 == null) {
			return null;
		}
		@Pc(15) Class6 local15 = this.aClass209_14.method5038((long) arg2);
		if (local15 != null && local15 instanceof Class6_Sub36) {
			@Pc(43) int local43 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
			return Integer.valueOf((local43 & ((Class6_Sub36) local15).anInt5996) >>> arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "(II)V")
	public void method3156(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt3689) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt3689);
		}
		this.anInt3689--;
		this.anIntArray208 = null;
		if (this.anInt3689 == 0) {
			this.aByteArray46 = null;
			this.anIntArray207 = null;
			this.anInt3679 = -1;
			this.anInt3699 = -1;
			this.aStringArray23 = null;
			this.aLongArray14 = null;
			return;
		}
		Static679.method1563(this.aByteArray46, arg0 + 1, this.aByteArray46, arg0, this.anInt3689 - arg0);
		Static679.method1569(this.anIntArray207, arg0 + 1, this.anIntArray207, arg0, this.anInt3689 - arg0);
		if (this.aLongArray14 != null) {
			Static679.method1565(this.aLongArray14, arg0 + 1, this.aLongArray14, arg0, this.anInt3689 - arg0);
		}
		if (this.aStringArray23 != null) {
			Static679.method1568(this.aStringArray23, arg0 + 1, this.aStringArray23, arg0, this.anInt3689 - arg0);
		}
		if (this.anInt3699 == arg0 || arg0 == this.anInt3679) {
			this.method3150();
		}
	}

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "(II)Ljava/lang/Long;")
	public Long method3157(@OriginalArg(1) int arg0) {
		if (this.aClass209_14 == null) {
			return null;
		} else {
			@Pc(20) Class6 local20 = this.aClass209_14.method5038((long) arg0);
			return local20 != null && local20 instanceof Class6_Sub50 ? Long.valueOf(((Class6_Sub50) local20).aLong268) : null;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIIBI)Z")
	public boolean method3158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = (0x1 << arg3) - 1;
		@Pc(31) int local31 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		@Pc(35) int local35 = local31 ^ local16;
		@Pc(39) int local39 = arg1 << arg3;
		@Pc(43) int local43 = local39 & local35;
		if (this.aClass209_14 == null) {
			this.aClass209_14 = new Class209(4);
		} else {
			@Pc(53) Class6 local53 = this.aClass209_14.method5038((long) arg2);
			if (local53 != null) {
				if (local53 instanceof Class6_Sub36) {
					@Pc(61) Class6_Sub36 local61 = (Class6_Sub36) local53;
					if ((local35 & local61.anInt5996) == local43) {
						return false;
					}
					local61.anInt5996 &= ~local35;
					local61.anInt5996 |= local43;
					return true;
				}
				local53.method9174();
			}
		}
		this.aClass209_14.method5035((long) arg2, new Class6_Sub36(local43));
		return true;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IZ)V")
	private void method3160(@OriginalArg(0) int arg0) {
		if (this.aBoolean219) {
			if (this.aLongArray14 == null) {
				this.aLongArray14 = new long[arg0];
			} else {
				Static679.method1565(this.aLongArray14, 0, this.aLongArray14 = new long[arg0], 0, this.anInt3689);
			}
		}
		if (this.aBoolean216) {
			if (this.aStringArray23 == null) {
				this.aStringArray23 = new String[arg0];
			} else {
				Static679.method1568(this.aStringArray23, 0, this.aStringArray23 = new String[arg0], 0, this.anInt3689);
			}
		}
		if (this.aByteArray46 == null) {
			this.aByteArray46 = new byte[arg0];
		} else {
			Static679.method1563(this.aByteArray46, 0, this.aByteArray46 = new byte[arg0], 0, this.anInt3689);
		}
		if (this.anIntArray207 == null) {
			this.anIntArray207 = new int[arg0];
		} else {
			Static679.method1569(this.anIntArray207, 0, this.anIntArray207 = new int[arg0], 0, this.anInt3689);
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3161(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt3689; local23++) {
			if (this.aStringArray23[local23].equals(arg0)) {
				return local23;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "(II)V")
	private void method3162(@OriginalArg(1) int arg0) {
		if (this.aBoolean219) {
			if (this.aLongArray15 == null) {
				this.aLongArray15 = new long[arg0];
			} else {
				Static679.method1565(this.aLongArray15, 0, this.aLongArray15 = new long[arg0], 0, this.anInt3676);
			}
		}
		if (!this.aBoolean216) {
			return;
		}
		if (this.aStringArray24 == null) {
			this.aStringArray24 = new String[arg0];
		} else {
			Static679.method1568(this.aStringArray24, 0, this.aStringArray24 = new String[arg0], 0, this.anInt3676);
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BLclient!gga;)V")
	private void method3163(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(11) int local11 = arg0.method8374();
		if (local11 < 1 || local11 > 3) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local11);
		}
		@Pc(34) int local34 = arg0.method8374();
		if ((local34 & 0x2) != 0) {
			this.aBoolean216 = true;
		}
		if ((local34 & 0x1) != 0) {
			this.aBoolean219 = true;
		}
		if (!this.aBoolean219) {
			this.aLongArray15 = null;
			this.aLongArray14 = null;
		}
		if (!this.aBoolean216) {
			this.aStringArray24 = null;
			this.aStringArray23 = null;
		}
		this.anInt3693 = arg0.method8369();
		arg0.method8369();
		this.anInt3689 = arg0.method8363();
		this.anInt3676 = arg0.method8374();
		this.aString37 = arg0.method8354();
		this.aBoolean217 = arg0.method8374() == 1;
		this.aByte54 = arg0.method8391();
		this.aByte55 = arg0.method8391();
		this.aByte53 = arg0.method8391();
		this.aByte52 = arg0.method8391();
		@Pc(211) int local211;
		if (this.anInt3689 > 0) {
			if (this.aBoolean219 && (this.aLongArray14 == null || this.anInt3689 > this.aLongArray14.length)) {
				this.aLongArray14 = new long[this.anInt3689];
			}
			if (this.aBoolean216 && (this.aStringArray23 == null || this.aStringArray23.length < this.anInt3689)) {
				this.aStringArray23 = new String[this.anInt3689];
			}
			if (this.aByteArray46 == null || this.anInt3689 > this.aByteArray46.length) {
				this.aByteArray46 = new byte[this.anInt3689];
			}
			if (this.anIntArray207 == null || this.anInt3689 > this.anIntArray207.length) {
				this.anIntArray207 = new int[this.anInt3689];
			}
			for (local211 = 0; local211 < this.anInt3689; local211++) {
				if (this.aBoolean219) {
					this.aLongArray14[local211] = arg0.method8381();
				}
				if (this.aBoolean216) {
					this.aStringArray23[local211] = arg0.method8359();
				}
				this.aByteArray46[local211] = arg0.method8391();
				if (local11 >= 2) {
					this.anIntArray207[local211] = arg0.method8369();
				}
			}
			this.method3150();
		}
		if (this.anInt3676 > 0) {
			if (this.aBoolean219 && (this.aLongArray15 == null || this.aLongArray15.length < this.anInt3676)) {
				this.aLongArray15 = new long[this.anInt3676];
			}
			if (this.aBoolean216 && (this.aStringArray24 == null || this.aStringArray24.length < this.anInt3676)) {
				this.aStringArray24 = new String[this.anInt3676];
			}
			for (local211 = 0; local211 < this.anInt3676; local211++) {
				if (this.aBoolean219) {
					this.aLongArray15[local211] = arg0.method8381();
				}
				if (this.aBoolean216) {
					this.aStringArray24[local211] = arg0.method8359();
				}
			}
		}
		if (local11 < 3) {
			return;
		}
		local211 = arg0.method8363();
		if (local211 <= 0) {
			return;
		}
		this.aClass209_14 = new Class209(local211 >= 16 ? 16 : Static655.method8912(local211));
		while (local211-- > 0) {
			@Pc(365) int local365 = arg0.method8369();
			@Pc(369) int local369 = local365 & 0x3FFFFFFF;
			@Pc(373) int local373 = local365 >>> 30;
			if (local373 == 0) {
				@Pc(379) int local379 = arg0.method8369();
				this.aClass209_14.method5035((long) local369, new Class6_Sub36(local379));
			} else if (local373 == 1) {
				@Pc(400) long local400 = arg0.method8381();
				this.aClass209_14.method5035((long) local369, new Class6_Sub50(local400));
			} else if (local373 == 2) {
				@Pc(421) String local421 = arg0.method8354();
				this.aClass209_14.method5035((long) local369, new Class6_Sub16(local421));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method3164(@OriginalArg(0) int arg0) {
		if (this.aClass209_14 == null) {
			return null;
		} else {
			@Pc(15) Class6 local15 = this.aClass209_14.method5038((long) arg0);
			return local15 != null && local15 instanceof Class6_Sub16 ? ((Class6_Sub16) local15).aString22 : null;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)Z")
	public boolean method3166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass209_14 == null) {
			this.aClass209_14 = new Class209(4);
		} else {
			@Pc(13) Class6 local13 = this.aClass209_14.method5038((long) arg1);
			if (local13 != null) {
				if (local13 instanceof Class6_Sub36) {
					@Pc(21) Class6_Sub36 local21 = (Class6_Sub36) local13;
					if (arg0 == local21.anInt5996) {
						return false;
					}
					local21.anInt5996 = arg0;
					return true;
				}
				local13.method9174();
			}
		}
		this.aClass209_14.method5035((long) arg1, new Class6_Sub36(arg0));
		return true;
	}
}
