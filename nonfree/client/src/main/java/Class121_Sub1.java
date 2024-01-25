import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "Lclient!ij;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
	private int anInt3523 = 0;

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "Lclient!bn;")
	private final Class25 aClass25_17 = new Class25(16);

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
	private int anInt3542 = 0;

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "Lclient!bd;")
	private final Class18 aClass18_19 = new Class18();

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
	private final int anInt3541;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Lclient!ug;")
	private final Class199 aClass199_2;

	@OriginalMember(owner = "client!ko", name = "O", descriptor = "Z")
	private boolean aBoolean226;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "Lclient!bd;")
	private Class18 aClass18_18;

	@OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
	private final int anInt3537;

	@OriginalMember(owner = "client!ko", name = "U", descriptor = "Z")
	private final boolean aBoolean228;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "Lclient!ug;")
	private final Class199 aClass199_3;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "Lclient!bi;")
	private final Class21 aClass21_3;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
	private final int anInt3531;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "Lclient!cq;")
	private final Class35 aClass35_3;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Lclient!os;")
	private Class14_Sub2_Sub16 aClass14_Sub2_Sub16_1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(ILclient!ug;Lclient!ug;Lclient!cq;Lclient!bi;IIZ)V")
	public Class121_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) Class21 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3541 = arg0;
		this.aClass199_2 = arg1;
		if (this.aClass199_2 == null) {
			this.aBoolean226 = false;
		} else {
			this.aBoolean226 = true;
			this.aClass18_18 = new Class18();
		}
		this.anInt3537 = arg5;
		this.aBoolean228 = arg7;
		this.aClass199_3 = arg2;
		this.aClass21_3 = arg4;
		this.anInt3531 = arg6;
		this.aClass35_3 = arg3;
		if (this.aClass199_3 != null) {
			this.aClass14_Sub2_Sub16_1 = this.aClass21_3.method648(this.anInt3541, this.aClass199_3);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)I")
	public int method3320() {
		if (this.method3319() == null) {
			return this.aClass14_Sub2_Sub16_1 == null ? 0 : this.aClass14_Sub2_Sub16_1.method5610();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	@Override
	public void method3314(@OriginalArg(0) int arg0) {
		if (this.aClass199_2 == null) {
			return;
		}
		for (@Pc(20) Class14 local20 = this.aClass18_19.method459(); local20 != null; local20 = this.aClass18_19.method453()) {
			if (local20.aLong217 == (long) arg0) {
				return;
			}
		}
		@Pc(44) Class14 local44 = new Class14();
		local44.aLong217 = arg0;
		this.aClass18_19.method451(local44);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)I")
	public int method3323() {
		return this.aClass92_1 == null ? 0 : this.aClass92_1.anInt2864;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
	public void method3325() {
		if (this.aClass18_18 != null) {
			if (this.method3319() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class14 local26;
			@Pc(32) int local32;
			@Pc(124) Class14 local124;
			if (this.aBoolean226) {
				local21 = true;
				for (local26 = this.aClass18_18.method459(); local26 != null; local26 = this.aClass18_18.method453()) {
					local32 = (int) local26.aLong217;
					if (this.aByteArray96[local32] == 0) {
						this.method3327(local32, 1);
					}
					if (this.aByteArray96[local32] == 0) {
						local21 = false;
					} else {
						local26.method5986();
					}
				}
				while (this.anInt3542 < this.aClass92_1.anIntArray258.length) {
					if (this.aClass92_1.anIntArray258[this.anInt3542] == 0) {
						this.anInt3542++;
					} else {
						if (this.aClass21_3.anInt597 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray96[this.anInt3542] == 0) {
							this.method3327(this.anInt3542, 1);
						}
						if (this.aByteArray96[this.anInt3542] == 0) {
							local124 = new Class14();
							local124.aLong217 = this.anInt3542;
							this.aClass18_18.method451(local124);
							local21 = false;
						}
						this.anInt3542++;
					}
				}
				if (local21) {
					this.aBoolean226 = false;
					this.anInt3542 = 0;
				}
			} else if (this.aBoolean227) {
				local21 = true;
				for (local26 = this.aClass18_18.method459(); local26 != null; local26 = this.aClass18_18.method453()) {
					local32 = (int) local26.aLong217;
					if (this.aByteArray96[local32] != 1) {
						this.method3327(local32, 2);
					}
					if (this.aByteArray96[local32] == 1) {
						local26.method5986();
					} else {
						local21 = false;
					}
				}
				while (this.aClass92_1.anIntArray258.length > this.anInt3542) {
					if (this.aClass92_1.anIntArray258[this.anInt3542] == 0) {
						this.anInt3542++;
					} else {
						if (this.aClass35_3.method1146()) {
							local21 = false;
							break;
						}
						if (this.aByteArray96[this.anInt3542] != 1) {
							this.method3327(this.anInt3542, 2);
						}
						if (this.aByteArray96[this.anInt3542] != 1) {
							local124 = new Class14();
							local124.aLong217 = this.anInt3542;
							this.aClass18_18.method451(local124);
							local21 = false;
						}
						this.anInt3542++;
					}
				}
				if (local21) {
					this.anInt3542 = 0;
					this.aBoolean227 = false;
				}
			} else {
				this.aClass18_18 = null;
			}
		}
		if (!this.aBoolean228 || Static168.method3300() < this.aLong110) {
			return;
		}
		for (@Pc(319) Class14_Sub2_Sub16 local319 = (Class14_Sub2_Sub16) this.aClass25_17.method697(); local319 != null; local319 = (Class14_Sub2_Sub16) this.aClass25_17.method694()) {
			if (!local319.aBoolean428) {
				if (local319.aBoolean429) {
					if (!local319.aBoolean427) {
						throw new RuntimeException();
					}
					local319.method5986();
				} else {
					local319.aBoolean429 = true;
				}
			}
		}
		this.aLong110 = Static168.method3300() + 1000L;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Lclient!ij;")
	@Override
	public Class92 method3319() {
		if (this.aClass92_1 != null) {
			return this.aClass92_1;
		}
		if (this.aClass14_Sub2_Sub16_1 == null) {
			if (this.aClass35_3.method1153()) {
				return null;
			}
			this.aClass14_Sub2_Sub16_1 = this.aClass35_3.method1154((byte) 0, this.anInt3541, true, 255);
		}
		if (this.aClass14_Sub2_Sub16_1.aBoolean428) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass14_Sub2_Sub16_1.method5613();
		if (this.aClass14_Sub2_Sub16_1 instanceof Class14_Sub2_Sub16_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass92_1 = new Class92(local48, this.anInt3537);
				if (this.anInt3531 != this.aClass92_1.anInt2867) {
					throw new RuntimeException();
				}
			} catch (@Pc(138) RuntimeException local138) {
				this.aClass92_1 = null;
				if (this.aClass35_3.method1153()) {
					this.aClass14_Sub2_Sub16_1 = null;
				} else {
					this.aClass14_Sub2_Sub16_1 = this.aClass35_3.method1154((byte) 0, this.anInt3541, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass92_1 = new Class92(local48, this.anInt3537);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass35_3.method1143();
				this.aClass92_1 = null;
				if (this.aClass35_3.method1153()) {
					this.aClass14_Sub2_Sub16_1 = null;
				} else {
					this.aClass14_Sub2_Sub16_1 = this.aClass35_3.method1154((byte) 0, this.anInt3541, true, 255);
				}
				return null;
			}
			if (this.aClass199_3 != null) {
				this.aClass21_3.method654(local48, this.aClass199_3, this.anInt3541);
			}
		}
		this.aClass14_Sub2_Sub16_1 = null;
		if (this.aClass199_2 != null) {
			this.aByteArray96 = new byte[this.aClass92_1.anInt2865];
			this.anInt3523 = 0;
		}
		return this.aClass92_1;
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)V")
	public void method3326() {
		if (this.aClass18_18 == null || this.method3319() == null) {
			return;
		}
		for (@Pc(19) Class14 local19 = this.aClass18_19.method459(); local19 != null; local19 = this.aClass18_19.method453()) {
			@Pc(33) int local33 = (int) local19.aLong217;
			if (local33 < 0 || this.aClass92_1.anInt2865 <= local33 || this.aClass92_1.anIntArray258[local33] == 0) {
				local19.method5986();
			} else {
				if (this.aByteArray96[local33] == 0) {
					this.method3327(local33, 1);
				}
				if (this.aByteArray96[local33] == -1) {
					this.method3327(local33, 2);
				}
				if (this.aByteArray96[local33] == 1) {
					local19.method5986();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZI)Lclient!os;")
	private Class14_Sub2_Sub16 method3327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class14_Sub2_Sub16 local13 = (Class14_Sub2_Sub16) this.aClass25_17.method691((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean427 && local13.aBoolean428) {
			local13.method5986();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass199_2 == null || this.aByteArray96[arg0] == -1) {
					if (this.aClass35_3.method1153()) {
						return null;
					}
					local13 = this.aClass35_3.method1154((byte) 2, arg0, true, this.anInt3541);
				} else {
					local13 = this.aClass21_3.method648(arg0, this.aClass199_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass199_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass21_3.method653(this.aClass199_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass199_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray96[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass35_3.method1146()) {
					return null;
				}
				local13 = this.aClass35_3.method1154((byte) 2, arg0, false, this.anInt3541);
			} else {
				throw new RuntimeException();
			}
			this.aClass25_17.method687((long) arg0, local13);
		}
		if (local13.aBoolean428) {
			return null;
		}
		@Pc(157) byte[] local157 = local13.method5613();
		@Pc(186) int local186;
		@Pc(286) Class14_Sub2_Sub16_Sub2 local286;
		if (!(local13 instanceof Class14_Sub2_Sub16_Sub1)) {
			try {
				if (local157 == null || local157.length <= 2) {
					throw new RuntimeException();
				}
				Static60.aCRC32_1.reset();
				Static60.aCRC32_1.update(local157, 0, local157.length - 2);
				local186 = (int) Static60.aCRC32_1.getValue();
				if (this.aClass92_1.anIntArray260[arg0] != local186) {
					throw new RuntimeException();
				}
				this.aClass35_3.anInt1201 = 0;
				this.aClass35_3.anInt1200 = 0;
			} catch (@Pc(342) RuntimeException local342) {
				this.aClass35_3.method1143();
				local13.method5986();
				if (local13.aBoolean427 && !this.aClass35_3.method1153()) {
					local286 = this.aClass35_3.method1154((byte) 2, arg0, true, this.anInt3541);
					this.aClass25_17.method687((long) arg0, local286);
				}
				return null;
			}
			local157[local157.length - 2] = (byte) (this.aClass92_1.anIntArray255[arg0] >>> 8);
			local157[local157.length - 1] = (byte) this.aClass92_1.anIntArray255[arg0];
			if (this.aClass199_2 != null) {
				this.aClass21_3.method654(local157, this.aClass199_2, arg0);
				if (this.aByteArray96[arg0] != 1) {
					this.anInt3523++;
					this.aByteArray96[arg0] = 1;
				}
			}
			if (!local13.aBoolean427) {
				local13.method5986();
			}
			return local13;
		}
		try {
			if (local157 == null || local157.length <= 2) {
				throw new RuntimeException();
			}
			Static60.aCRC32_1.reset();
			Static60.aCRC32_1.update(local157, 0, local157.length - 2);
			local186 = (int) Static60.aCRC32_1.getValue();
			if (this.aClass92_1.anIntArray260[arg0] != local186) {
				throw new RuntimeException();
			}
			@Pc(217) int local217 = (local157[local157.length - 1] & 0xFF) + ((local157[local157.length - 2] & 0xFF) << 8);
			if ((this.aClass92_1.anIntArray255[arg0] & 0xFFFF) != local217) {
				throw new RuntimeException();
			}
			if (this.aByteArray96[arg0] != 1) {
				this.anInt3523++;
				this.aByteArray96[arg0] = 1;
			}
			if (!local13.aBoolean427) {
				local13.method5986();
			}
			return local13;
		} catch (@Pc(260) Exception local260) {
			this.aByteArray96[arg0] = -1;
			local13.method5986();
			if (local13.aBoolean427 && !this.aClass35_3.method1153()) {
				local286 = this.aClass35_3.method1154((byte) 2, arg0, true, this.anInt3541);
				this.aClass25_17.method687((long) arg0, local286);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(B)I")
	public int method3328() {
		if (this.aClass92_1 == null) {
			return 0;
		} else if (this.aBoolean226) {
			@Pc(20) Class14 local20 = this.aClass18_18.method459();
			return local20 == null ? 0 : (int) local20.aLong217;
		} else {
			return this.aClass92_1.anInt2864;
		}
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(B)V")
	public void method3329() {
		if (this.aClass199_2 != null) {
			this.aBoolean227 = true;
			if (this.aClass18_18 == null) {
				this.aClass18_18 = new Class18();
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method3317(@OriginalArg(0) int arg0) {
		@Pc(9) Class14_Sub2_Sub16 local9 = this.method3327(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5613();
			local9.method5986();
			return local17;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)I")
	@Override
	public int method3315(@OriginalArg(0) int arg0) {
		@Pc(17) Class14_Sub2_Sub16 local17 = (Class14_Sub2_Sub16) this.aClass25_17.method691((long) arg0);
		return local17 == null ? 0 : local17.method5610();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)I")
	public int method3331() {
		return this.anInt3523;
	}
}
