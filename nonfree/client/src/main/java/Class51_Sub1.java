import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!es", name = "v", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!es", name = "K", descriptor = "Lclient!mc;")
	private Class131 aClass131_2;

	@OriginalMember(owner = "client!es", name = "O", descriptor = "Z")
	private boolean aBoolean130;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "I")
	private int anInt1807 = 0;

	@OriginalMember(owner = "client!es", name = "A", descriptor = "Lclient!dq;")
	private final Class38 aClass38_8 = new Class38(16);

	@OriginalMember(owner = "client!es", name = "M", descriptor = "I")
	private int anInt1821 = 0;

	@OriginalMember(owner = "client!es", name = "Q", descriptor = "Lclient!eb;")
	private final Class42 aClass42_10 = new Class42();

	@OriginalMember(owner = "client!es", name = "S", descriptor = "J")
	private long aLong71 = 0L;

	@OriginalMember(owner = "client!es", name = "J", descriptor = "I")
	private final int anInt1819;

	@OriginalMember(owner = "client!es", name = "j", descriptor = "Lclient!cq;")
	private final Class28 aClass28_1;

	@OriginalMember(owner = "client!es", name = "N", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!es", name = "P", descriptor = "Lclient!eb;")
	private Class42 aClass42_9;

	@OriginalMember(owner = "client!es", name = "z", descriptor = "I")
	private final int anInt1813;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "Lclient!nb;")
	private final Class143 aClass143_1;

	@OriginalMember(owner = "client!es", name = "r", descriptor = "Lclient!cq;")
	private final Class28 aClass28_2;

	@OriginalMember(owner = "client!es", name = "F", descriptor = "I")
	private final int anInt1816;

	@OriginalMember(owner = "client!es", name = "B", descriptor = "Lclient!sp;")
	private final Class191 aClass191_1;

	@OriginalMember(owner = "client!es", name = "R", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "Lclient!vl;")
	private Class1_Sub4_Sub2 aClass1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILclient!cq;Lclient!cq;Lclient!sp;Lclient!nb;IIZ)V")
	public Class51_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) Class191 arg3, @OriginalArg(4) Class143 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1819 = arg0;
		this.aClass28_1 = arg1;
		if (this.aClass28_1 == null) {
			this.aBoolean129 = false;
		} else {
			this.aBoolean129 = true;
			this.aClass42_9 = new Class42();
		}
		this.anInt1813 = arg6;
		this.aClass143_1 = arg4;
		this.aClass28_2 = arg2;
		this.anInt1816 = arg5;
		this.aClass191_1 = arg3;
		this.aBoolean131 = arg7;
		if (this.aClass28_2 != null) {
			this.aClass1_Sub4_Sub2_1 = this.aClass143_1.method3805(this.aClass28_2, this.anInt1819);
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V")
	public void method1734() {
		if (this.aClass42_9 == null || this.method1728() == null) {
			return;
		}
		for (@Pc(29) Class1 local29 = this.aClass42_10.method1543(); local29 != null; local29 = this.aClass42_10.method1551()) {
			@Pc(35) int local35 = (int) local29.aLong217;
			if (local35 < 0 || local35 >= this.aClass131_2.anInt3881 || this.aClass131_2.anIntArray296[local35] == 0) {
				local29.method6045();
			} else {
				if (this.aByteArray38[local35] == 0) {
					this.method1739(1, local35);
				}
				if (this.aByteArray38[local35] == -1) {
					this.method1739(2, local35);
				}
				if (this.aByteArray38[local35] == 1) {
					local29.method6045();
				}
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	public void method1735() {
		if (this.aClass28_1 != null) {
			this.aBoolean130 = true;
			if (this.aClass42_9 == null) {
				this.aClass42_9 = new Class42();
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(B)I")
	public int method1736() {
		return this.aClass131_2 == null ? 0 : this.aClass131_2.anInt3887;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
	@Override
	public void method1729(@OriginalArg(1) int arg0) {
		if (this.aClass28_1 == null) {
			return;
		}
		for (@Pc(18) Class1 local18 = this.aClass42_10.method1543(); local18 != null; local18 = this.aClass42_10.method1551()) {
			if (local18.aLong217 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class1 local38 = new Class1();
		local38.aLong217 = arg0;
		this.aClass42_10.method1549(local38);
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(B)I")
	public int method1738() {
		if (this.aClass131_2 == null) {
			return 0;
		} else if (this.aBoolean129) {
			@Pc(28) Class1 local28 = this.aClass42_9.method1543();
			return local28 == null ? 0 : (int) local28.aLong217;
		} else {
			return this.aClass131_2.anInt3887;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Lclient!mc;")
	@Override
	public Class131 method1728() {
		if (this.aClass131_2 != null) {
			return this.aClass131_2;
		}
		if (this.aClass1_Sub4_Sub2_1 == null) {
			if (this.aClass191_1.method5181()) {
				return null;
			}
			this.aClass1_Sub4_Sub2_1 = this.aClass191_1.method5191(this.anInt1819, 255, true, (byte) 0);
		}
		if (this.aClass1_Sub4_Sub2_1.aBoolean367) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass1_Sub4_Sub2_1.method4468();
		if (this.aClass1_Sub4_Sub2_1 instanceof Class1_Sub4_Sub2_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass131_2 = new Class131(local43, this.anInt1816);
				if (this.aClass131_2.anInt3880 != this.anInt1813) {
					throw new RuntimeException();
				}
			} catch (@Pc(76) RuntimeException local76) {
				this.aClass131_2 = null;
				if (this.aClass191_1.method5181()) {
					this.aClass1_Sub4_Sub2_1 = null;
				} else {
					this.aClass1_Sub4_Sub2_1 = this.aClass191_1.method5191(this.anInt1819, 255, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass131_2 = new Class131(local43, this.anInt1816);
			} catch (@Pc(118) RuntimeException local118) {
				this.aClass191_1.method5188();
				this.aClass131_2 = null;
				if (this.aClass191_1.method5181()) {
					this.aClass1_Sub4_Sub2_1 = null;
				} else {
					this.aClass1_Sub4_Sub2_1 = this.aClass191_1.method5191(this.anInt1819, 255, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass28_2 != null) {
				this.aClass143_1.method3807(this.aClass28_2, local43, this.anInt1819);
			}
		}
		this.aClass1_Sub4_Sub2_1 = null;
		if (this.aClass28_1 != null) {
			this.aByteArray38 = new byte[this.aClass131_2.anInt3881];
			this.anInt1807 = 0;
		}
		return this.aClass131_2;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IBI)Lclient!vl;")
	private Class1_Sub4_Sub2 method1739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub4_Sub2 local13 = (Class1_Sub4_Sub2) this.aClass38_8.method1475((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean368 && local13.aBoolean367) {
			local13.method6045();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass28_1 == null || this.aByteArray38[arg1] == -1) {
					if (this.aClass191_1.method5181()) {
						return null;
					}
					local13 = this.aClass191_1.method5191(arg1, this.anInt1819, true, (byte) 2);
				} else {
					local13 = this.aClass143_1.method3805(this.aClass28_1, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass28_1 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass143_1.method3806(arg1, this.aClass28_1);
			} else if (arg0 == 2) {
				if (this.aClass28_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray38[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass191_1.method5186()) {
					return null;
				}
				local13 = this.aClass191_1.method5191(arg1, this.anInt1819, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass38_8.method1472(local13, (long) arg1);
		}
		if (local13.aBoolean367) {
			return null;
		}
		@Pc(166) byte[] local166 = local13.method4468();
		@Pc(193) int local193;
		@Pc(239) Class1_Sub4_Sub2_Sub1 local239;
		if (!(local13 instanceof Class1_Sub4_Sub2_Sub2)) {
			try {
				if (local166 == null || local166.length <= 2) {
					throw new RuntimeException();
				}
				Static103.aCRC32_1.reset();
				Static103.aCRC32_1.update(local166, 0, local166.length - 2);
				local193 = (int) Static103.aCRC32_1.getValue();
				if (this.aClass131_2.anIntArray295[arg1] != local193) {
					throw new RuntimeException();
				}
				this.aClass191_1.anInt5732 = 0;
				this.aClass191_1.anInt5731 = 0;
			} catch (@Pc(214) RuntimeException local214) {
				this.aClass191_1.method5188();
				local13.method6045();
				if (local13.aBoolean368 && !this.aClass191_1.method5181()) {
					local239 = this.aClass191_1.method5191(arg1, this.anInt1819, true, (byte) 2);
					this.aClass38_8.method1472(local239, (long) arg1);
				}
				return null;
			}
			local166[local166.length - 2] = (byte) (this.aClass131_2.anIntArray293[arg1] >>> 8);
			local166[local166.length - 1] = (byte) this.aClass131_2.anIntArray293[arg1];
			if (this.aClass28_1 != null) {
				this.aClass143_1.method3807(this.aClass28_1, local166, arg1);
				if (this.aByteArray38[arg1] != 1) {
					this.anInt1807++;
					this.aByteArray38[arg1] = 1;
				}
			}
			if (!local13.aBoolean368) {
				local13.method6045();
			}
			return local13;
		}
		try {
			if (local166 == null || local166.length <= 2) {
				throw new RuntimeException();
			}
			Static103.aCRC32_1.reset();
			Static103.aCRC32_1.update(local166, 0, local166.length - 2);
			local193 = (int) Static103.aCRC32_1.getValue();
			if (this.aClass131_2.anIntArray295[arg1] != local193) {
				throw new RuntimeException();
			}
			@Pc(372) int local372 = ((local166[local166.length - 2] & 0xFF) << 8) + (local166[local166.length - 1] & 0xFF);
			if ((this.aClass131_2.anIntArray293[arg1] & 0xFFFF) != local372) {
				throw new RuntimeException();
			}
			if (this.aByteArray38[arg1] != 1) {
				this.anInt1807++;
				this.aByteArray38[arg1] = 1;
			}
			if (!local13.aBoolean368) {
				local13.method6045();
			}
			return local13;
		} catch (@Pc(417) Exception local417) {
			this.aByteArray38[arg1] = -1;
			local13.method6045();
			if (local13.aBoolean368 && !this.aClass191_1.method5181()) {
				local239 = this.aClass191_1.method5191(arg1, this.anInt1819, true, (byte) 2);
				this.aClass38_8.method1472(local239, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)I")
	public int method1740() {
		return this.anInt1807;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(B)V")
	public void method1741() {
		if (this.aClass42_9 != null) {
			if (this.method1728() == null) {
				return;
			}
			@Pc(24) boolean local24;
			@Pc(29) Class1 local29;
			@Pc(35) int local35;
			@Pc(120) Class1 local120;
			if (this.aBoolean129) {
				local24 = true;
				for (local29 = this.aClass42_9.method1543(); local29 != null; local29 = this.aClass42_9.method1551()) {
					local35 = (int) local29.aLong217;
					if (this.aByteArray38[local35] == 0) {
						this.method1739(1, local35);
					}
					if (this.aByteArray38[local35] == 0) {
						local24 = false;
					} else {
						local29.method6045();
					}
				}
				while (this.aClass131_2.anIntArray296.length > this.anInt1821) {
					if (this.aClass131_2.anIntArray296[this.anInt1821] == 0) {
						this.anInt1821++;
					} else {
						if (this.aClass143_1.anInt4092 >= 250) {
							local24 = false;
							break;
						}
						if (this.aByteArray38[this.anInt1821] == 0) {
							this.method1739(1, this.anInt1821);
						}
						if (this.aByteArray38[this.anInt1821] == 0) {
							local120 = new Class1();
							local120.aLong217 = this.anInt1821;
							local24 = false;
							this.aClass42_9.method1549(local120);
						}
						this.anInt1821++;
					}
				}
				if (local24) {
					this.anInt1821 = 0;
					this.aBoolean129 = false;
				}
			} else if (this.aBoolean130) {
				local24 = true;
				for (local29 = this.aClass42_9.method1543(); local29 != null; local29 = this.aClass42_9.method1551()) {
					local35 = (int) local29.aLong217;
					if (this.aByteArray38[local35] != 1) {
						this.method1739(2, local35);
					}
					if (this.aByteArray38[local35] == 1) {
						local29.method6045();
					} else {
						local24 = false;
					}
				}
				while (this.anInt1821 < this.aClass131_2.anIntArray296.length) {
					if (this.aClass131_2.anIntArray296[this.anInt1821] == 0) {
						this.anInt1821++;
					} else {
						if (this.aClass191_1.method5186()) {
							local24 = false;
							break;
						}
						if (this.aByteArray38[this.anInt1821] != 1) {
							this.method1739(2, this.anInt1821);
						}
						if (this.aByteArray38[this.anInt1821] != 1) {
							local120 = new Class1();
							local120.aLong217 = this.anInt1821;
							this.aClass42_9.method1549(local120);
							local24 = false;
						}
						this.anInt1821++;
					}
				}
				if (local24) {
					this.anInt1821 = 0;
					this.aBoolean130 = false;
				}
			} else {
				this.aClass42_9 = null;
			}
		}
		if (!this.aBoolean131 || Static183.method3462() < this.aLong71) {
			return;
		}
		for (@Pc(319) Class1_Sub4_Sub2 local319 = (Class1_Sub4_Sub2) this.aClass38_8.method1474(); local319 != null; local319 = (Class1_Sub4_Sub2) this.aClass38_8.method1470()) {
			if (!local319.aBoolean367) {
				if (local319.aBoolean366) {
					if (!local319.aBoolean368) {
						throw new RuntimeException();
					}
					local319.method6045();
				} else {
					local319.aBoolean366 = true;
				}
			}
		}
		this.aLong71 = Static183.method3462() + 1000L;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I")
	@Override
	public int method1730(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub4_Sub2 local11 = (Class1_Sub4_Sub2) this.aClass38_8.method1475((long) arg0);
		return local11 == null ? 0 : local11.method4472();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method1732(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub4_Sub2 local15 = this.method1739(0, arg0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method4468();
			local15.method6045();
			return local23;
		}
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)I")
	public int method1742() {
		if (this.method1728() == null) {
			return this.aClass1_Sub4_Sub2_1 == null ? 0 : this.aClass1_Sub4_Sub2_1.method4472();
		} else {
			return 100;
		}
	}
}
