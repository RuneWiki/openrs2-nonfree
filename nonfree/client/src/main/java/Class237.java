import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class237 {

	@OriginalMember(owner = "client!mea", name = "F", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
	public int anInt6960;

	@OriginalMember(owner = "client!mea", name = "N", descriptor = "Lclient!gn;")
	private Class136 aClass136_31;

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray26;

	@OriginalMember(owner = "client!mea", name = "A", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!mea", name = "J", descriptor = "B")
	public byte aByte104;

	@OriginalMember(owner = "client!mea", name = "D", descriptor = "Z")
	private boolean aBoolean548;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "B")
	public byte aByte105;

	@OriginalMember(owner = "client!mea", name = "G", descriptor = "J")
	public long aLong228;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "[J")
	private long[] aLongArray12;

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!mea", name = "I", descriptor = "[I")
	private int[] anIntArray379;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "Z")
	public boolean aBoolean549;

	@OriginalMember(owner = "client!mea", name = "B", descriptor = "[J")
	private long[] aLongArray13;

	@OriginalMember(owner = "client!mea", name = "R", descriptor = "B")
	public byte aByte106;

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "B")
	public byte aByte107;

	@OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
	public int anInt6982;

	@OriginalMember(owner = "client!mea", name = "C", descriptor = "Z")
	private boolean aBoolean550;

	@OriginalMember(owner = "client!mea", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray27;

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
	public int anInt6977 = -1;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
	private int anInt6970 = 0;

	@OriginalMember(owner = "client!mea", name = "E", descriptor = "Ljava/lang/String;")
	public String aString101 = null;

	@OriginalMember(owner = "client!mea", name = "M", descriptor = "I")
	public int anInt6979 = 0;

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
	public int anInt6968 = -1;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class237(@OriginalArg(0) Class3_Sub28 arg0) {
		this.method5854(arg0);
	}

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V")
	private Class237() {
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIII)Z")
	public boolean method5839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg0) - 1;
		@Pc(23) int local23 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(27) int local27 = arg1 << arg0;
		@Pc(31) int local31 = local9 ^ local23;
		@Pc(35) int local35 = local27 & local31;
		if (this.aClass136_31 == null) {
			this.aClass136_31 = new Class136(4);
		} else {
			@Pc(45) Class3 local45 = this.aClass136_31.method3503((long) arg3);
			if (local45 != null) {
				if (local45 instanceof Class3_Sub42) {
					@Pc(55) Class3_Sub42 local55 = (Class3_Sub42) local45;
					if (local35 == (local55.anInt8429 & local31)) {
						return false;
					}
					local55.anInt8429 &= ~local31;
					local55.anInt8429 |= local35;
					return true;
				}
				local45.method9446();
			}
		}
		this.aClass136_31.method3508((long) arg3, new Class3_Sub42(local35));
		return true;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(JIILjava/lang/String;)V")
	public void method5840(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg2 != null && arg2.length() == 0) {
			arg2 = null;
		}
		if (arg0 > 0L != this.aBoolean550) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean550 + " but userhash:" + arg0);
		} else if (this.aBoolean548 == (arg2 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean548 + " but displayname:" + arg2);
		} else {
			if (arg0 > 0L && (this.aLongArray12 == null || this.aLongArray12.length <= this.anInt6982) || arg2 != null && (this.aStringArray26 == null || this.aStringArray26.length <= this.anInt6982)) {
				this.method5842(this.anInt6982 + 5);
			}
			if (this.aLongArray12 != null) {
				this.aLongArray12[this.anInt6982] = arg0;
			}
			if (this.aStringArray26 != null) {
				this.aStringArray26[this.anInt6982] = arg2;
			}
			if (this.anInt6968 == -1) {
				this.anInt6968 = this.anInt6982;
				this.aByteArray54[this.anInt6982] = 126;
			} else {
				this.aByteArray54[this.anInt6982] = 0;
			}
			this.anIntArray379[this.anInt6982] = 0;
			this.anIntArray378[this.anInt6982] = arg1;
			this.anIntArray377 = null;
			this.anInt6982++;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(JIB)Z")
	public boolean method5841(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass136_31 == null) {
			this.aClass136_31 = new Class136(4);
		} else {
			@Pc(23) Class3 local23 = this.aClass136_31.method3503((long) arg1);
			if (local23 != null) {
				if (local23 instanceof Class3_Sub43) {
					@Pc(33) Class3_Sub43 local33 = (Class3_Sub43) local23;
					if (local33.aLong282 == arg0) {
						return false;
					}
					local33.aLong282 = arg0;
					return true;
				}
				local23.method9446();
			}
		}
		this.aClass136_31.method3508((long) arg1, new Class3_Sub43(arg0));
		return true;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(IZ)V")
	private void method5842(@OriginalArg(0) int arg0) {
		if (this.aBoolean550) {
			if (this.aLongArray12 == null) {
				this.aLongArray12 = new long[arg0];
			} else {
				Static735.method9186(this.aLongArray12, 0, this.aLongArray12 = new long[arg0], 0, this.anInt6982);
			}
		}
		if (this.aBoolean548) {
			if (this.aStringArray26 == null) {
				this.aStringArray26 = new String[arg0];
			} else {
				Static735.method9183(this.aStringArray26, 0, this.aStringArray26 = new String[arg0], 0, this.anInt6982);
			}
		}
		if (this.aByteArray54 == null) {
			this.aByteArray54 = new byte[arg0];
		} else {
			Static735.method9185(this.aByteArray54, 0, this.aByteArray54 = new byte[arg0], 0, this.anInt6982);
		}
		if (this.anIntArray379 == null) {
			this.anIntArray379 = new int[arg0];
		} else {
			Static735.method9182(this.anIntArray379, 0, this.anIntArray379 = new int[arg0], 0, this.anInt6982);
		}
		if (this.anIntArray378 == null) {
			this.anIntArray378 = new int[arg0];
		} else {
			Static735.method9182(this.anIntArray378, 0, this.anIntArray378 = new int[arg0], 0, this.anInt6982);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BII)Z")
	public boolean method5843(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass136_31 == null) {
			this.aClass136_31 = new Class136(4);
		} else {
			@Pc(13) Class3 local13 = this.aClass136_31.method3503((long) arg1);
			if (local13 != null) {
				if (local13 instanceof Class3_Sub42) {
					@Pc(23) Class3_Sub42 local23 = (Class3_Sub42) local13;
					if (arg0 == local23.anInt8429) {
						return false;
					}
					local23.anInt8429 = arg0;
					return true;
				}
				local13.method9446();
			}
		}
		this.aClass136_31.method3508((long) arg1, new Class3_Sub42(arg0));
		return true;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method5844(@OriginalArg(0) int arg0) {
		if (this.aClass136_31 == null) {
			return null;
		} else {
			@Pc(16) Class3 local16 = this.aClass136_31.method3503((long) arg0);
			return local16 != null && local16 instanceof Class3_Sub42 ? Integer.valueOf(((Class3_Sub42) local16).anInt8429) : null;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public boolean method5845(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass136_31 == null) {
			this.aClass136_31 = new Class136(4);
		} else {
			@Pc(42) Class3 local42 = this.aClass136_31.method3503((long) arg0);
			if (local42 != null) {
				if (local42 instanceof Class3_Sub30) {
					@Pc(52) Class3_Sub30 local52 = (Class3_Sub30) local42;
					if (local52.aString89.equals(arg1)) {
						return false;
					}
					local52.aString89 = arg1;
					return true;
				}
				local42.method9446();
			}
		}
		this.aClass136_31.method3508((long) arg0, new Class3_Sub30(arg1));
		return true;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIBII)I")
	public int method5846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg2) - 1;
		@Pc(25) int local25 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(29) int local29 = arg1 << arg2;
		@Pc(33) int local33 = local25 ^ local9;
		@Pc(37) int local37 = local29 & local33;
		@Pc(42) int local42 = this.anIntArray379[arg0];
		if ((local42 & local33) == local37) {
			return -1;
		} else {
			local42 &= ~local33;
			this.anIntArray379[arg0] = local42 | local37;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILjava/lang/String;J)V")
	public void method5847(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 <= 0L == this.aBoolean550) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean550 + " but userhash:" + arg1);
		} else if (this.aBoolean548 == (arg0 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean548 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray13 == null || this.anInt6960 >= this.aLongArray13.length) || arg0 != null && (this.aStringArray27 == null || this.aStringArray27.length <= this.anInt6960)) {
				this.method5855(this.anInt6960 + 5);
			}
			if (this.aLongArray13 != null) {
				this.aLongArray13[this.anInt6960] = arg1;
			}
			if (this.aStringArray27 != null) {
				this.aStringArray27[this.anInt6960] = arg0;
			}
			this.anInt6960++;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)[I")
	public int[] method5848() {
		if (this.anIntArray377 == null) {
			this.anIntArray377 = new int[this.anInt6982];
			@Pc(13) String[] local13 = new String[this.anInt6982];
			@Pc(15) int local15 = 0;
			while (this.anInt6982 > local15) {
				local13[local15] = this.aStringArray26[local15];
				this.anIntArray377[local15] = local15++;
			}
			Static32.method466(local13, this.anIntArray377);
		}
		return this.anIntArray377;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIII)I")
	public int method5849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray379[arg1] & local25) >>> arg0;
	}

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "(II)V")
	public void method5850(@OriginalArg(0) int arg0) {
		this.anInt6960--;
		if (this.anInt6960 == 0) {
			this.aLongArray13 = null;
			this.aStringArray27 = null;
			return;
		}
		if (this.aLongArray13 != null) {
			Static735.method9186(this.aLongArray13, arg0 + 1, this.aLongArray13, arg0, this.anInt6960 - arg0);
		}
		if (this.aStringArray27 != null) {
			Static735.method9183(this.aStringArray27, arg0 + 1, this.aStringArray27, arg0, this.anInt6960 - arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZII)Ljava/lang/Integer;")
	public Integer method5851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass136_31 == null) {
			return null;
		}
		@Pc(16) Class3 local16 = this.aClass136_31.method3503((long) arg2);
		if (local16 != null && local16 instanceof Class3_Sub42) {
			@Pc(42) int local42 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
			return Integer.valueOf((((Class3_Sub42) local16).anInt8429 & local42) >>> arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIB)I")
	public int method5852(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt6968 && (this.anInt6977 == -1 || this.aByteArray54[this.anInt6977] < 125)) {
			return -1;
		} else if (this.aByteArray54[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray54[arg0] = arg1;
			this.method5859();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5853(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt6982; local23++) {
			if (this.aStringArray26[local23].equals(arg0)) {
				return local23;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!rba;I)V")
	private void method5854(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(9) int local9 = arg0.method5322(-94);
		if (local9 < 1 || local9 > 5) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(37) int local37 = arg0.method5322(-90);
		if ((local37 & 0x2) != 0) {
			this.aBoolean548 = true;
		}
		if ((local37 & 0x1) != 0) {
			this.aBoolean550 = true;
		}
		if (!this.aBoolean548) {
			this.aStringArray27 = null;
			this.aStringArray26 = null;
		}
		if (!this.aBoolean550) {
			this.aLongArray13 = null;
			this.aLongArray12 = null;
		}
		this.anInt6979 = arg0.method5312();
		this.anInt6970 = arg0.method5312();
		if (local9 <= 3 && this.anInt6970 != 0) {
			this.anInt6970 += 16912800;
		}
		this.anInt6982 = arg0.method5272();
		this.anInt6960 = arg0.method5322(-25);
		this.aString101 = arg0.method5295();
		if (local9 >= 4) {
			arg0.method5312();
		}
		this.aBoolean549 = arg0.method5322(-120) == 1;
		this.aByte106 = arg0.method5288();
		this.aByte105 = arg0.method5288();
		this.aByte107 = arg0.method5288();
		this.aByte104 = arg0.method5288();
		@Pc(276) int local276;
		if (this.anInt6982 > 0) {
			if (this.aBoolean550 && (this.aLongArray12 == null || this.anInt6982 > this.aLongArray12.length)) {
				this.aLongArray12 = new long[this.anInt6982];
			}
			if (this.aBoolean548 && (this.aStringArray26 == null || this.anInt6982 > this.aStringArray26.length)) {
				this.aStringArray26 = new String[this.anInt6982];
			}
			if (this.aByteArray54 == null || this.aByteArray54.length < this.anInt6982) {
				this.aByteArray54 = new byte[this.anInt6982];
			}
			if (this.anIntArray379 == null || this.anIntArray379.length < this.anInt6982) {
				this.anIntArray379 = new int[this.anInt6982];
			}
			if (this.anIntArray378 == null || this.anIntArray378.length < this.anInt6982) {
				this.anIntArray378 = new int[this.anInt6982];
			}
			for (local276 = 0; local276 < this.anInt6982; local276++) {
				if (this.aBoolean550) {
					this.aLongArray12[local276] = arg0.method5287();
				}
				if (this.aBoolean548) {
					this.aStringArray26[local276] = arg0.method5306();
				}
				this.aByteArray54[local276] = arg0.method5288();
				if (local9 >= 2) {
					this.anIntArray379[local276] = arg0.method5312();
				}
				if (local9 >= 5) {
					this.anIntArray378[local276] = arg0.method5272();
				} else {
					this.anIntArray378[local276] = 0;
				}
			}
			this.method5859();
		}
		if (this.anInt6960 > 0) {
			if (this.aBoolean550 && (this.aLongArray13 == null || this.aLongArray13.length < this.anInt6960)) {
				this.aLongArray13 = new long[this.anInt6960];
			}
			if (this.aBoolean548 && (this.aStringArray27 == null || this.anInt6960 > this.aStringArray27.length)) {
				this.aStringArray27 = new String[this.anInt6960];
			}
			for (local276 = 0; local276 < this.anInt6960; local276++) {
				if (this.aBoolean550) {
					this.aLongArray13[local276] = arg0.method5287();
				}
				if (this.aBoolean548) {
					this.aStringArray27[local276] = arg0.method5306();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local276 = arg0.method5272();
		if (local276 <= 0) {
			return;
		}
		this.aClass136_31 = new Class136(local276 >= 16 ? 16 : Static60.method735(local276));
		while (local276-- > 0) {
			@Pc(494) int local494 = arg0.method5312();
			@Pc(498) int local498 = local494 & 0x3FFFFFFF;
			@Pc(502) int local502 = local494 >>> 30;
			if (local502 == 0) {
				@Pc(557) int local557 = arg0.method5312();
				this.aClass136_31.method3508((long) local498, new Class3_Sub42(local557));
			} else if (local502 == 1) {
				@Pc(541) long local541 = arg0.method5287();
				this.aClass136_31.method3508((long) local498, new Class3_Sub43(local541));
			} else if (local502 == 2) {
				@Pc(525) String local525 = arg0.method5295();
				this.aClass136_31.method3508((long) local498, new Class3_Sub30(local525));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(II)V")
	private void method5855(@OriginalArg(1) int arg0) {
		if (this.aBoolean550) {
			if (this.aLongArray13 == null) {
				this.aLongArray13 = new long[arg0];
			} else {
				Static735.method9186(this.aLongArray13, 0, this.aLongArray13 = new long[arg0], 0, this.anInt6960);
			}
		}
		if (!this.aBoolean548) {
			return;
		}
		if (this.aStringArray27 == null) {
			this.aStringArray27 = new String[arg0];
		} else {
			Static735.method9183(this.aStringArray27, 0, this.aStringArray27 = new String[arg0], 0, this.anInt6960);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method5856(@OriginalArg(0) int arg0) {
		if (this.aClass136_31 == null) {
			return null;
		} else {
			@Pc(16) Class3 local16 = this.aClass136_31.method3503((long) arg0);
			return local16 != null && local16 instanceof Class3_Sub30 ? ((Class3_Sub30) local16).aString89 : null;
		}
	}

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "(II)V")
	public void method5857(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anInt6982 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt6982);
		}
		this.anIntArray377 = null;
		this.anInt6982--;
		if (this.anInt6982 == 0) {
			this.anInt6977 = -1;
			this.aByteArray54 = null;
			this.anIntArray378 = null;
			this.aStringArray26 = null;
			this.anInt6968 = -1;
			this.anIntArray379 = null;
			this.aLongArray12 = null;
			return;
		}
		Static735.method9185(this.aByteArray54, arg0 + 1, this.aByteArray54, arg0, this.anInt6982 - arg0);
		Static735.method9182(this.anIntArray379, arg0 + 1, this.anIntArray379, arg0, this.anInt6982 - arg0);
		Static735.method9182(this.anIntArray378, arg0 + 1, this.anIntArray378, arg0, this.anInt6982 - arg0);
		if (this.aLongArray12 != null) {
			Static735.method9186(this.aLongArray12, arg0 + 1, this.aLongArray12, arg0, this.anInt6982 - arg0);
		}
		if (this.aStringArray26 != null) {
			Static735.method9183(this.aStringArray26, arg0 + 1, this.aStringArray26, arg0, this.anInt6982 - arg0);
		}
		if (arg0 == this.anInt6968 || arg0 == this.anInt6977) {
			this.method5859();
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)Ljava/lang/Long;")
	public Long method5858(@OriginalArg(1) int arg0) {
		if (this.aClass136_31 == null) {
			return null;
		} else {
			@Pc(16) Class3 local16 = this.aClass136_31.method3503((long) arg0);
			return local16 != null && local16 instanceof Class3_Sub43 ? Long.valueOf(((Class3_Sub43) local16).aLong282) : null;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	private void method5859() {
		if (this.anInt6982 == 0) {
			this.anInt6977 = -1;
			this.anInt6968 = -1;
			return;
		}
		this.anInt6968 = -1;
		this.anInt6977 = -1;
		@Pc(38) int local38 = 0;
		@Pc(43) byte local43 = this.aByteArray54[0];
		for (@Pc(45) int local45 = 1; local45 < this.anInt6982; local45++) {
			if (local43 < this.aByteArray54[local45]) {
				if (local43 == 125) {
					this.anInt6977 = local38;
				}
				local38 = local45;
				local43 = this.aByteArray54[local45];
			} else if (this.anInt6977 == -1 && this.aByteArray54[local45] == 125) {
				this.anInt6977 = local45;
			}
		}
		this.anInt6968 = local38;
		if (this.anInt6968 != -1) {
			this.aByteArray54[this.anInt6968] = 126;
		}
	}
}
