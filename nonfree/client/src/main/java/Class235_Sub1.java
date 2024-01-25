import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class235_Sub1 extends Class235 {

	@OriginalMember(owner = "client!n", name = "x", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Lclient!sv;")
	private Class306 aClass306_2;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "I")
	private int anInt5994 = 0;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "Lclient!jw;")
	private final Class183 aClass183_23 = new Class183(16);

	@OriginalMember(owner = "client!n", name = "J", descriptor = "I")
	private int anInt6001 = 0;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!gj;")
	private final Class124 aClass124_30 = new Class124();

	@OriginalMember(owner = "client!n", name = "L", descriptor = "J")
	private long aLong173 = 0L;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!cc;")
	private final Class47 aClass47_3;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	private final int anInt5990;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!n", name = "I", descriptor = "Lclient!gj;")
	private Class124 aClass124_31;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "Lclient!lfa;")
	private final Class207 aClass207_3;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	private final int anInt6000;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Lclient!cc;")
	private final Class47 aClass47_4;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "I")
	private final int anInt5999;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!de;")
	private final Class70 aClass70_3;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!gq;")
	private Class4_Sub7_Sub7 aClass4_Sub7_Sub7_1;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(ILclient!cc;Lclient!cc;Lclient!lfa;Lclient!de;I[BIZ)V")
	public Class235_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) Class207 arg3, @OriginalArg(4) Class70 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass47_3 = arg1;
		this.anInt5990 = arg0;
		if (this.aClass47_3 == null) {
			this.aBoolean448 = false;
		} else {
			this.aBoolean448 = true;
			this.aClass124_31 = new Class124();
		}
		this.aClass207_3 = arg3;
		this.aBoolean450 = arg8;
		this.anInt6000 = arg7;
		this.aClass47_4 = arg2;
		this.anInt5999 = arg5;
		this.aClass70_3 = arg4;
		this.aByteArray62 = arg6;
		if (this.aClass47_4 != null) {
			this.aClass4_Sub7_Sub7_1 = this.aClass70_3.method2054(this.aClass47_4, this.anInt5990);
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IB)I")
	@Override
	public int method5081(@OriginalArg(0) int arg0) {
		@Pc(18) Class4_Sub7_Sub7 local18 = (Class4_Sub7_Sub7) this.aClass183_23.method4289((long) arg0);
		return local18 == null ? 0 : local18.method7630();
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
	public int method5082() {
		if (this.aClass306_2 == null) {
			return 0;
		} else if (this.aBoolean448) {
			@Pc(26) Class4 local26 = this.aClass124_31.method3267();
			return local26 == null ? 0 : (int) local26.aLong307;
		} else {
			return this.aClass306_2.anInt8585;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
	@Override
	public void method5079(@OriginalArg(0) int arg0) {
		if (this.aClass47_3 == null) {
			return;
		}
		for (@Pc(22) Class4 local22 = this.aClass124_30.method3267(); local22 != null; local22 = this.aClass124_30.method3273()) {
			if ((long) arg0 == local22.aLong307) {
				return;
			}
		}
		@Pc(42) Class4 local42 = new Class4();
		local42.aLong307 = arg0;
		this.aClass124_30.method3275(local42);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lclient!sv;")
	@Override
	public Class306 method5078() {
		if (this.aClass306_2 != null) {
			return this.aClass306_2;
		}
		if (this.aClass4_Sub7_Sub7_1 == null) {
			if (this.aClass207_3.method4640()) {
				return null;
			}
			this.aClass4_Sub7_Sub7_1 = this.aClass207_3.method4635(255, true, (byte) 0, this.anInt5990);
		}
		if (this.aClass4_Sub7_Sub7_1.aBoolean642) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass4_Sub7_Sub7_1.method7629();
		if (this.aClass4_Sub7_Sub7_1 instanceof Class4_Sub7_Sub7_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass306_2 = new Class306(local43, this.anInt5999, this.aByteArray62);
				if (this.anInt6000 != this.aClass306_2.anInt8586) {
					throw new RuntimeException();
				}
			} catch (@Pc(141) RuntimeException local141) {
				this.aClass306_2 = null;
				if (this.aClass207_3.method4640()) {
					this.aClass4_Sub7_Sub7_1 = null;
				} else {
					this.aClass4_Sub7_Sub7_1 = this.aClass207_3.method4635(255, true, (byte) 0, this.anInt5990);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass306_2 = new Class306(local43, this.anInt5999, this.aByteArray62);
			} catch (@Pc(65) RuntimeException local65) {
				this.aClass207_3.method4632();
				this.aClass306_2 = null;
				if (this.aClass207_3.method4640()) {
					this.aClass4_Sub7_Sub7_1 = null;
				} else {
					this.aClass4_Sub7_Sub7_1 = this.aClass207_3.method4635(255, true, (byte) 0, this.anInt5990);
				}
				return null;
			}
			if (this.aClass47_4 != null) {
				this.aClass70_3.method2058(this.aClass47_4, this.anInt5990, local43);
			}
		}
		this.aClass4_Sub7_Sub7_1 = null;
		if (this.aClass47_3 != null) {
			this.aByteArray63 = new byte[this.aClass306_2.anInt8587];
			this.anInt5994 = 0;
		}
		return this.aClass306_2;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public void method5084() {
		if (this.aClass124_31 != null) {
			if (this.method5078() == null) {
				return;
			}
			@Pc(32) boolean local32;
			@Pc(39) Class4 local39;
			@Pc(45) int local45;
			@Pc(132) Class4 local132;
			if (this.aBoolean448) {
				local32 = true;
				for (local39 = this.aClass124_31.method3267(); local39 != null; local39 = this.aClass124_31.method3273()) {
					local45 = (int) local39.aLong307;
					if (this.aByteArray63[local45] == 0) {
						this.method5088(1, local45);
					}
					if (this.aByteArray63[local45] == 0) {
						local32 = false;
					} else {
						local39.method8013();
					}
				}
				while (this.anInt6001 < this.aClass306_2.anIntArray659.length) {
					if (this.aClass306_2.anIntArray659[this.anInt6001] == 0) {
						this.anInt6001++;
					} else {
						if (this.aClass70_3.anInt2280 >= 250) {
							local32 = false;
							break;
						}
						if (this.aByteArray63[this.anInt6001] == 0) {
							this.method5088(1, this.anInt6001);
						}
						if (this.aByteArray63[this.anInt6001] == 0) {
							local132 = new Class4();
							local132.aLong307 = this.anInt6001;
							this.aClass124_31.method3275(local132);
							local32 = false;
						}
						this.anInt6001++;
					}
				}
				if (local32) {
					this.aBoolean448 = false;
					this.anInt6001 = 0;
				}
			} else if (this.aBoolean449) {
				local32 = true;
				for (local39 = this.aClass124_31.method3267(); local39 != null; local39 = this.aClass124_31.method3273()) {
					local45 = (int) local39.aLong307;
					if (this.aByteArray63[local45] != 1) {
						this.method5088(2, local45);
					}
					if (this.aByteArray63[local45] == 1) {
						local39.method8013();
					} else {
						local32 = false;
					}
				}
				while (this.anInt6001 < this.aClass306_2.anIntArray659.length) {
					if (this.aClass306_2.anIntArray659[this.anInt6001] == 0) {
						this.anInt6001++;
					} else {
						if (this.aClass207_3.method4628()) {
							local32 = false;
							break;
						}
						if (this.aByteArray63[this.anInt6001] != 1) {
							this.method5088(2, this.anInt6001);
						}
						if (this.aByteArray63[this.anInt6001] != 1) {
							local132 = new Class4();
							local132.aLong307 = this.anInt6001;
							this.aClass124_31.method3275(local132);
							local32 = false;
						}
						this.anInt6001++;
					}
				}
				if (local32) {
					this.anInt6001 = 0;
					this.aBoolean449 = false;
				}
			} else {
				this.aClass124_31 = null;
			}
		}
		if (!this.aBoolean450 || Static184.method3422() < this.aLong173) {
			return;
		}
		for (@Pc(323) Class4_Sub7_Sub7 local323 = (Class4_Sub7_Sub7) this.aClass183_23.method4286(); local323 != null; local323 = (Class4_Sub7_Sub7) this.aClass183_23.method4283()) {
			if (!local323.aBoolean642) {
				if (local323.aBoolean641) {
					if (!local323.aBoolean643) {
						throw new RuntimeException();
					}
					local323.method8013();
				} else {
					local323.aBoolean641 = true;
				}
			}
		}
		this.aLong173 = Static184.method3422() + 1000L;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	public void method5085() {
		if (this.aClass124_31 == null || this.method5078() == null) {
			return;
		}
		for (@Pc(26) Class4 local26 = this.aClass124_30.method3267(); local26 != null; local26 = this.aClass124_30.method3273()) {
			@Pc(32) int local32 = (int) local26.aLong307;
			if (local32 < 0 || local32 >= this.aClass306_2.anInt8587 || this.aClass306_2.anIntArray659[local32] == 0) {
				local26.method8013();
			} else {
				if (this.aByteArray63[local32] == 0) {
					this.method5088(1, local32);
				}
				if (this.aByteArray63[local32] == -1) {
					this.method5088(2, local32);
				}
				if (this.aByteArray63[local32] == 1) {
					local26.method8013();
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)I")
	public int method5086() {
		return this.anInt5994;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method5077(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub7_Sub7 local9 = this.method5088(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method7629();
			local9.method8013();
			return local17;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
	public void method5087() {
		if (this.aClass47_3 != null) {
			this.aBoolean449 = true;
			if (this.aClass124_31 == null) {
				this.aClass124_31 = new Class124();
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZI)Lclient!gq;")
	private Class4_Sub7_Sub7 method5088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub7_Sub7 local13 = (Class4_Sub7_Sub7) this.aClass183_23.method4289((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean643 && local13.aBoolean642) {
			local13.method8013();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass47_3 == null || this.aByteArray63[arg1] == -1) {
					if (this.aClass207_3.method4640()) {
						return null;
					}
					local13 = this.aClass207_3.method4635(this.anInt5990, true, (byte) 2, arg1);
				} else {
					local13 = this.aClass70_3.method2054(this.aClass47_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass47_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass70_3.method2053(this.aClass47_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass47_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray63[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass207_3.method4628()) {
					return null;
				}
				local13 = this.aClass207_3.method4635(this.anInt5990, false, (byte) 2, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass183_23.method4282((long) arg1, local13);
		}
		if (local13.aBoolean642) {
			return null;
		}
		@Pc(156) byte[] local156 = local13.method7629();
		@Pc(189) int local189;
		@Pc(220) byte[] local220;
		@Pc(229) byte[] local229;
		@Pc(231) int local231;
		@Pc(289) Class4_Sub7_Sub7_Sub2 local289;
		if (!(local13 instanceof Class4_Sub7_Sub7_Sub1)) {
			try {
				if (local156 == null || local156.length <= 2) {
					throw new RuntimeException();
				}
				Static415.aCRC32_1.reset();
				Static415.aCRC32_1.update(local156, 0, local156.length - 2);
				local189 = (int) Static415.aCRC32_1.getValue();
				if (local189 != this.aClass306_2.anIntArray656[arg1]) {
					throw new RuntimeException();
				}
				if (this.aClass306_2.aByteArrayArray37 != null && this.aClass306_2.aByteArrayArray37[arg1] != null) {
					local220 = this.aClass306_2.aByteArrayArray37[arg1];
					local229 = Static188.method3457(0, local156.length - 2, local156);
					for (local231 = 0; local231 < 64; local231++) {
						if (local229[local231] != local220[local231]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass207_3.anInt5474 = 0;
				this.aClass207_3.anInt5473 = 0;
			} catch (@Pc(264) RuntimeException local264) {
				this.aClass207_3.method4632();
				local13.method8013();
				if (local13.aBoolean643 && !this.aClass207_3.method4640()) {
					local289 = this.aClass207_3.method4635(this.anInt5990, true, (byte) 2, arg1);
					this.aClass183_23.method4282((long) arg1, local289);
				}
				return null;
			}
			local156[local156.length - 2] = (byte) (this.aClass306_2.anIntArray660[arg1] >>> 8);
			local156[local156.length - 1] = (byte) this.aClass306_2.anIntArray660[arg1];
			if (this.aClass47_3 != null) {
				this.aClass70_3.method2058(this.aClass47_3, arg1, local156);
				if (this.aByteArray63[arg1] != 1) {
					this.anInt5994++;
					this.aByteArray63[arg1] = 1;
				}
			}
			if (!local13.aBoolean643) {
				local13.method8013();
			}
			return local13;
		}
		try {
			if (local156 == null || local156.length <= 2) {
				throw new RuntimeException();
			}
			Static415.aCRC32_1.reset();
			Static415.aCRC32_1.update(local156, 0, local156.length - 2);
			local189 = (int) Static415.aCRC32_1.getValue();
			if (local189 != this.aClass306_2.anIntArray656[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass306_2.aByteArrayArray37 != null && this.aClass306_2.aByteArrayArray37[arg1] != null) {
				local220 = this.aClass306_2.aByteArrayArray37[arg1];
				local229 = Static188.method3457(0, local156.length - 2, local156);
				for (local231 = 0; local231 < 64; local231++) {
					if (local229[local231] != local220[local231]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(469) int local469 = ((local156[local156.length - 2] & 0xFF) << 8) + (local156[local156.length - 1] & 0xFF);
			if ((this.aClass306_2.anIntArray660[arg1] & 0xFFFF) != local469) {
				throw new RuntimeException();
			}
			if (this.aByteArray63[arg1] != 1) {
				this.anInt5994++;
				this.aByteArray63[arg1] = 1;
			}
			if (!local13.aBoolean643) {
				local13.method8013();
			}
			return local13;
		} catch (@Pc(512) Exception local512) {
			this.aByteArray63[arg1] = -1;
			local13.method8013();
			if (local13.aBoolean643 && !this.aClass207_3.method4640()) {
				local289 = this.aClass207_3.method4635(this.anInt5990, true, (byte) 2, arg1);
				this.aClass183_23.method4282((long) arg1, local289);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(B)I")
	public int method5089() {
		return this.aClass306_2 == null ? 0 : this.aClass306_2.anInt8585;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)I")
	public int method5090() {
		if (this.method5078() == null) {
			return this.aClass4_Sub7_Sub7_1 == null ? 0 : this.aClass4_Sub7_Sub7_1.method7630();
		} else {
			return 100;
		}
	}
}
