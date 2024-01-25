import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class205 {

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!qha;")
	private Class291 aClass291_23;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!kp", name = "U", descriptor = "[J")
	private long[] aLongArray13;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "Z")
	public boolean aBoolean434;

	@OriginalMember(owner = "client!kp", name = "S", descriptor = "[J")
	private long[] aLongArray14;

	@OriginalMember(owner = "client!kp", name = "V", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "Z")
	private boolean aBoolean435;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray37;

	@OriginalMember(owner = "client!kp", name = "R", descriptor = "Z")
	private boolean aBoolean436;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray38;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "B")
	public byte aByte76;

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
	public int anInt5752;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	public int anInt5756;

	@OriginalMember(owner = "client!kp", name = "I", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
	public int anInt5737 = 0;

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
	public int anInt5738 = -1;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	private int anInt5741 = 0;

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "Ljava/lang/String;")
	public String aString73 = null;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
	public int anInt5757 = -1;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class205(@OriginalArg(0) Class5_Sub23 arg0) {
		this.method4878(arg0);
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	private Class205() {
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	private void method4875(@OriginalArg(1) int arg0) {
		if (this.aBoolean436) {
			if (this.aLongArray13 == null) {
				this.aLongArray13 = new long[arg0];
			} else {
				Static682.method798(this.aLongArray13, 0, this.aLongArray13 = new long[arg0], 0, this.anInt5752);
			}
		}
		if (this.aBoolean435) {
			if (this.aStringArray37 == null) {
				this.aStringArray37 = new String[arg0];
			} else {
				Static682.method797(this.aStringArray37, 0, this.aStringArray37 = new String[arg0], 0, this.anInt5752);
			}
		}
		if (this.aByteArray46 == null) {
			this.aByteArray46 = new byte[arg0];
		} else {
			Static682.method799(this.aByteArray46, 0, this.aByteArray46 = new byte[arg0], 0, this.anInt5752);
		}
		if (this.anIntArray320 == null) {
			this.anIntArray320 = new int[arg0];
		} else {
			Static682.method796(this.anIntArray320, 0, this.anIntArray320 = new int[arg0], 0, this.anInt5752);
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	private void method4876() {
		if (this.anInt5752 == 0) {
			this.anInt5757 = -1;
			this.anInt5738 = -1;
			return;
		}
		this.anInt5757 = -1;
		this.anInt5738 = -1;
		@Pc(24) int local24 = 0;
		@Pc(29) byte local29 = this.aByteArray46[0];
		for (@Pc(31) int local31 = 1; local31 < this.anInt5752; local31++) {
			if (this.aByteArray46[local31] > local29) {
				if (local29 == 125) {
					this.anInt5757 = local24;
				}
				local24 = local31;
				local29 = this.aByteArray46[local31];
			} else if (this.anInt5757 == -1 && this.aByteArray46[local31] == 125) {
				this.anInt5757 = local31;
			}
		}
		this.anInt5738 = local24;
		if (this.anInt5738 != -1) {
			this.aByteArray46[this.anInt5738] = 126;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(IB)V")
	public void method4877(@OriginalArg(0) int arg0) {
		this.anInt5756--;
		if (this.anInt5756 == 0) {
			this.aLongArray14 = null;
			this.aStringArray38 = null;
			return;
		}
		if (this.aLongArray14 != null) {
			Static682.method798(this.aLongArray14, arg0 + 1, this.aLongArray14, arg0, this.anInt5756 - arg0);
		}
		if (this.aStringArray38 != null) {
			Static682.method797(this.aStringArray38, arg0 + 1, this.aStringArray38, arg0, this.anInt5756 - arg0);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ib;B)V")
	private void method4878(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(9) int local9 = arg0.method8529();
		if (local9 < 1 || local9 > 4) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(44) int local44 = arg0.method8529();
		if ((local44 & 0x2) != 0) {
			this.aBoolean435 = true;
		}
		if ((local44 & 0x1) != 0) {
			this.aBoolean436 = true;
		}
		if (!this.aBoolean435) {
			this.aStringArray38 = null;
			this.aStringArray37 = null;
		}
		if (!this.aBoolean436) {
			this.aLongArray14 = null;
			this.aLongArray13 = null;
		}
		this.anInt5737 = arg0.method8527();
		this.anInt5741 = arg0.method8527();
		if (local9 <= 3 && this.anInt5741 != 0) {
			this.anInt5741 += 16912800;
		}
		this.anInt5752 = arg0.method8519();
		this.anInt5756 = arg0.method8529();
		this.aString73 = arg0.method8497();
		if (local9 >= 4) {
			arg0.method8527();
		}
		this.aBoolean434 = arg0.method8529() == 1;
		this.aByte75 = arg0.method8488();
		this.aByte78 = arg0.method8488();
		this.aByte76 = arg0.method8488();
		this.aByte77 = arg0.method8488();
		@Pc(275) int local275;
		if (this.anInt5752 > 0) {
			if (this.aBoolean436 && (this.aLongArray13 == null || this.aLongArray13.length < this.anInt5752)) {
				this.aLongArray13 = new long[this.anInt5752];
			}
			if (this.aBoolean435 && (this.aStringArray37 == null || this.anInt5752 > this.aStringArray37.length)) {
				this.aStringArray37 = new String[this.anInt5752];
			}
			if (this.aByteArray46 == null || this.aByteArray46.length < this.anInt5752) {
				this.aByteArray46 = new byte[this.anInt5752];
			}
			if (this.anIntArray320 == null || this.anIntArray320.length < this.anInt5752) {
				this.anIntArray320 = new int[this.anInt5752];
			}
			for (local275 = 0; local275 < this.anInt5752; local275++) {
				if (this.aBoolean436) {
					this.aLongArray13[local275] = arg0.method8509();
				}
				if (this.aBoolean435) {
					this.aStringArray37[local275] = arg0.method8475();
				}
				this.aByteArray46[local275] = arg0.method8488();
				if (local9 >= 2) {
					this.anIntArray320[local275] = arg0.method8527();
				}
			}
			this.method4876();
		}
		if (this.anInt5756 > 0) {
			if (this.aBoolean436 && (this.aLongArray14 == null || this.aLongArray14.length < this.anInt5756)) {
				this.aLongArray14 = new long[this.anInt5756];
			}
			if (this.aBoolean435 && (this.aStringArray38 == null || this.anInt5756 > this.aStringArray38.length)) {
				this.aStringArray38 = new String[this.anInt5756];
			}
			for (local275 = 0; local275 < this.anInt5756; local275++) {
				if (this.aBoolean436) {
					this.aLongArray14[local275] = arg0.method8509();
				}
				if (this.aBoolean435) {
					this.aStringArray38[local275] = arg0.method8475();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local275 = arg0.method8519();
		if (local275 <= 0) {
			return;
		}
		this.aClass291_23 = new Class291(local275 < 16 ? Static94.method1393(local275) : 16);
		while (local275-- > 0) {
			@Pc(468) int local468 = arg0.method8527();
			@Pc(472) int local472 = local468 & 0x3FFFFFFF;
			@Pc(476) int local476 = local468 >>> 30;
			if (local476 == 0) {
				@Pc(485) int local485 = arg0.method8527();
				this.aClass291_23.method6984((long) local472, new Class5_Sub29(local485));
			} else if (local476 == 1) {
				@Pc(531) long local531 = arg0.method8509();
				this.aClass291_23.method6984((long) local472, new Class5_Sub13(local531));
			} else if (local476 == 2) {
				@Pc(513) String local513 = arg0.method8497();
				this.aClass291_23.method6984((long) local472, new Class5_Sub42(local513));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method4879(@OriginalArg(0) int arg0) {
		if (this.aClass291_23 == null) {
			return null;
		} else {
			@Pc(24) Class5 local24 = this.aClass291_23.method6993((long) arg0, 1);
			return local24 != null && local24 instanceof Class5_Sub42 ? ((Class5_Sub42) local24).aString105 : null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)Z")
	public boolean method4880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = (0x1 << arg1) - 1;
		@Pc(31) int local31 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(35) int local35 = local9 ^ local31;
		@Pc(39) int local39 = arg0 << arg1;
		@Pc(43) int local43 = local39 & local35;
		if (this.aClass291_23 == null) {
			this.aClass291_23 = new Class291(4);
		} else {
			@Pc(53) Class5 local53 = this.aClass291_23.method6993((long) arg3, 1);
			if (local53 != null) {
				if (local53 instanceof Class5_Sub29) {
					@Pc(63) Class5_Sub29 local63 = (Class5_Sub29) local53;
					if ((local35 & local63.anInt5492) == local43) {
						return false;
					}
					local63.anInt5492 &= ~local35;
					local63.anInt5492 |= local43;
					return true;
				}
				local53.method9327(1);
			}
		}
		this.aClass291_23.method6984((long) arg3, new Class5_Sub29(local43));
		return true;
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method4882(@OriginalArg(1) int arg0) {
		if (this.aClass291_23 == null) {
			return null;
		} else {
			@Pc(16) Class5 local16 = this.aClass291_23.method6993((long) arg0, 1);
			return local16 != null && local16 instanceof Class5_Sub29 ? Integer.valueOf(((Class5_Sub29) local16).anInt5492) : null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4883(@OriginalArg(1) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt5752; local28++) {
			if (this.aStringArray37[local28].equals(arg0)) {
				return local28;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(JZLjava/lang/String;)V")
	public void method4884(@OriginalArg(0) long arg0, @OriginalArg(2) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean436 != arg0 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean436 + " but userhash:" + arg0);
		} else if ((arg1 == null) == this.aBoolean435) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean435 + " but displayname:" + arg1);
		} else {
			if (arg0 > 0L && (this.aLongArray13 == null || this.aLongArray13.length <= this.anInt5752) || arg1 != null && (this.aStringArray37 == null || this.anInt5752 >= this.aStringArray37.length)) {
				this.method4875(this.anInt5752 + 5);
			}
			if (this.aLongArray13 != null) {
				this.aLongArray13[this.anInt5752] = arg0;
			}
			if (this.aStringArray37 != null) {
				this.aStringArray37[this.anInt5752] = arg1;
			}
			if (this.anInt5738 == -1) {
				this.anInt5738 = this.anInt5752;
				this.aByteArray46[this.anInt5752] = 126;
			} else {
				this.aByteArray46[this.anInt5752] = 0;
			}
			this.anIntArray320[this.anInt5752] = 0;
			this.anInt5752++;
			this.anIntArray319 = null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBII)I")
	public int method4885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray320[arg0] & local25) >>> arg1;
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(II)V")
	public void method4886(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anInt5752 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt5752);
		}
		this.anInt5752--;
		this.anIntArray319 = null;
		if (this.anInt5752 == 0) {
			this.aStringArray37 = null;
			this.anIntArray320 = null;
			this.aByteArray46 = null;
			this.aLongArray13 = null;
			this.anInt5757 = -1;
			this.anInt5738 = -1;
			return;
		}
		Static682.method799(this.aByteArray46, arg0 + 1, this.aByteArray46, arg0, this.anInt5752 - arg0);
		Static682.method796(this.anIntArray320, arg0 + 1, this.anIntArray320, arg0, this.anInt5752 - arg0);
		if (this.aLongArray13 != null) {
			Static682.method798(this.aLongArray13, arg0 + 1, this.aLongArray13, arg0, this.anInt5752 - arg0);
		}
		if (this.aStringArray37 != null) {
			Static682.method797(this.aStringArray37, arg0 + 1, this.aStringArray37, arg0, this.anInt5752 - arg0);
		}
		if (this.anInt5738 == arg0 || this.anInt5757 == arg0) {
			this.method4876();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IJLjava/lang/String;)V")
	public void method4887(@OriginalArg(1) long arg0, @OriginalArg(2) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean436 == arg0 <= 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean436 + " but userhash:" + arg0);
		} else if ((arg1 != null) == this.aBoolean435) {
			if (arg0 > 0L && (this.aLongArray14 == null || this.anInt5756 >= this.aLongArray14.length) || arg1 != null && (this.aStringArray38 == null || this.aStringArray38.length <= this.anInt5756)) {
				this.method4894(this.anInt5756 + 5);
			}
			if (this.aLongArray14 != null) {
				this.aLongArray14[this.anInt5756] = arg0;
			}
			if (this.aStringArray38 != null) {
				this.aStringArray38[this.anInt5756] = arg1;
			}
			this.anInt5756++;
		} else {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean435 + " but displayname:" + arg1);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIBI)Ljava/lang/Integer;")
	public Integer method4888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass291_23 == null) {
			return null;
		}
		@Pc(27) Class5 local27 = this.aClass291_23.method6993((long) arg2, 1);
		if (local27 != null && local27 instanceof Class5_Sub29) {
			@Pc(53) int local53 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
			return Integer.valueOf((((Class5_Sub29) local27).anInt5492 & local53) >>> arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Z")
	public boolean method4889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass291_23 == null) {
			this.aClass291_23 = new Class291(4);
		} else {
			@Pc(21) Class5 local21 = this.aClass291_23.method6993((long) arg0, 1);
			if (local21 != null) {
				if (local21 instanceof Class5_Sub29) {
					@Pc(31) Class5_Sub29 local31 = (Class5_Sub29) local21;
					if (local31.anInt5492 == arg1) {
						return false;
					}
					local31.anInt5492 = arg1;
					return true;
				}
				local21.method9327(1);
			}
		}
		this.aClass291_23.method6984((long) arg0, new Class5_Sub29(arg1));
		return true;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Ljava/lang/Long;")
	public Long method4891(@OriginalArg(1) int arg0) {
		if (this.aClass291_23 == null) {
			return null;
		} else {
			@Pc(16) Class5 local16 = this.aClass291_23.method6993((long) arg0, 1);
			return local16 != null && local16 instanceof Class5_Sub13 ? Long.valueOf(((Class5_Sub13) local16).aLong62) : null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIB)I")
	public int method4892(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt5738 == arg0 && (this.anInt5757 == -1 || this.aByteArray46[this.anInt5757] < 125)) {
			return -1;
		} else if (this.aByteArray46[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray46[arg0] = arg1;
			this.method4876();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(IIIII)I")
	public int method4893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17 = (0x1 << arg2) - 1;
		@Pc(33) int local33 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		@Pc(37) int local37 = arg1 << arg2;
		@Pc(41) int local41 = local17 ^ local33;
		@Pc(45) int local45 = local37 & local41;
		@Pc(50) int local50 = this.anIntArray320[arg3];
		if (local45 == (local50 & local41)) {
			return -1;
		} else {
			local50 &= ~local41;
			this.anIntArray320[arg3] = local45 | local50;
			return arg3;
		}
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(II)V")
	private void method4894(@OriginalArg(1) int arg0) {
		if (this.aBoolean436) {
			if (this.aLongArray14 == null) {
				this.aLongArray14 = new long[arg0];
			} else {
				Static682.method798(this.aLongArray14, 0, this.aLongArray14 = new long[arg0], 0, this.anInt5756);
			}
		}
		if (!this.aBoolean435) {
			return;
		}
		if (this.aStringArray38 == null) {
			this.aStringArray38 = new String[arg0];
		} else {
			Static682.method797(this.aStringArray38, 0, this.aStringArray38 = new String[arg0], 0, this.anInt5756);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public boolean method4895(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass291_23 == null) {
			this.aClass291_23 = new Class291(4);
		} else {
			@Pc(50) Class5 local50 = this.aClass291_23.method6993((long) arg1, 1);
			if (local50 != null) {
				if (local50 instanceof Class5_Sub42) {
					@Pc(60) Class5_Sub42 local60 = (Class5_Sub42) local50;
					if (local60.aString105.equals(arg0)) {
						return false;
					}
					local60.aString105 = arg0;
					return true;
				}
				local50.method9327(1);
			}
		}
		this.aClass291_23.method6984((long) arg1, new Class5_Sub42(arg0));
		return true;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IJB)Z")
	public boolean method4896(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass291_23 == null) {
			this.aClass291_23 = new Class291(4);
		} else {
			@Pc(13) Class5 local13 = this.aClass291_23.method6993((long) arg0, 1);
			if (local13 != null) {
				if (local13 instanceof Class5_Sub13) {
					@Pc(23) Class5_Sub13 local23 = (Class5_Sub13) local13;
					if (local23.aLong62 == arg1) {
						return false;
					}
					local23.aLong62 = arg1;
					return true;
				}
				local13.method9327(1);
			}
		}
		this.aClass291_23.method6984((long) arg0, new Class5_Sub13(arg1));
		return true;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)[I")
	public int[] method4897() {
		if (this.anIntArray319 == null) {
			@Pc(8) String[] local8 = new String[this.anInt5752];
			this.anIntArray319 = new int[this.anInt5752];
			@Pc(15) int local15 = 0;
			while (this.anInt5752 > local15) {
				local8[local15] = this.aStringArray37[local15];
				this.anIntArray319[local15] = local15++;
			}
			Static259.method3829(local8, this.anIntArray319);
		}
		return this.anIntArray319;
	}
}
