import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!f;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "Z")
	private boolean aBoolean516;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private int anInt7295 = 0;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!ek;")
	private final Class67 aClass67_36 = new Class67(16);

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
	private int anInt7310 = 0;

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "Lclient!ub;")
	private final Class244 aClass244_49 = new Class244();

	@OriginalMember(owner = "client!wc", name = "Z", descriptor = "J")
	private long aLong220 = 0L;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
	private final int anInt7307;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Lclient!ht;")
	private final Class117 aClass117_4;

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "Z")
	private boolean aBoolean515;

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "Lclient!ub;")
	private Class244 aClass244_50;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
	private final int anInt7305;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "Lclient!su;")
	private final Class234 aClass234_3;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!dn;")
	private final Class54 aClass54_3;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!ht;")
	private final Class117 aClass117_3;

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "Z")
	private final boolean aBoolean517;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
	private final int anInt7302;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "Lclient!au;")
	private Class4_Sub2_Sub2 aClass4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(ILclient!ht;Lclient!ht;Lclient!dn;Lclient!su;IIZ)V")
	public Class124_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class54 arg3, @OriginalArg(4) Class234 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7307 = arg0;
		this.aClass117_4 = arg1;
		if (this.aClass117_4 == null) {
			this.aBoolean515 = false;
		} else {
			this.aBoolean515 = true;
			this.aClass244_50 = new Class244();
		}
		this.anInt7305 = arg6;
		this.aClass234_3 = arg4;
		this.aClass54_3 = arg3;
		this.aClass117_3 = arg2;
		this.aBoolean517 = arg7;
		this.anInt7302 = arg5;
		if (this.aClass117_3 != null) {
			this.aClass4_Sub2_Sub2_1 = this.aClass234_3.method4923(this.anInt7307, this.aClass117_3);
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)I")
	public int method5842() {
		if (this.aClass77_2 == null) {
			return 0;
		} else if (this.aBoolean515) {
			@Pc(26) Class4 local26 = this.aClass244_50.method5263();
			return local26 == null ? 0 : (int) local26.aLong227;
		} else {
			return this.aClass77_2.anInt1856;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	public int method5843() {
		return this.aClass77_2 == null ? 0 : this.aClass77_2.anInt1856;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V")
	public void method5844() {
		if (this.aClass244_50 == null || this.method5834() == null) {
			return;
		}
		for (@Pc(27) Class4 local27 = this.aClass244_49.method5263(); local27 != null; local27 = this.aClass244_49.method5271()) {
			@Pc(33) int local33 = (int) local27.aLong227;
			if (local33 < 0 || local33 >= this.aClass77_2.anInt1855 || this.aClass77_2.anIntArray135[local33] == 0) {
				local27.method6059();
			} else {
				if (this.aByteArray87[local33] == 0) {
					this.method5852(1, local33);
				}
				if (this.aByteArray87[local33] == -1) {
					this.method5852(2, local33);
				}
				if (this.aByteArray87[local33] == 1) {
					local27.method6059();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	public void method5845() {
		if (this.aClass244_50 != null) {
			if (this.method5834() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class4 local23;
			@Pc(29) int local29;
			@Pc(125) Class4 local125;
			if (this.aBoolean515) {
				local18 = true;
				for (local23 = this.aClass244_50.method5263(); local23 != null; local23 = this.aClass244_50.method5271()) {
					local29 = (int) local23.aLong227;
					if (this.aByteArray87[local29] == 0) {
						this.method5852(1, local29);
					}
					if (this.aByteArray87[local29] == 0) {
						local18 = false;
					} else {
						local23.method6059();
					}
				}
				while (this.aClass77_2.anIntArray135.length > this.anInt7310) {
					if (this.aClass77_2.anIntArray135[this.anInt7310] == 0) {
						this.anInt7310++;
					} else {
						if (this.aClass234_3.anInt6136 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray87[this.anInt7310] == 0) {
							this.method5852(1, this.anInt7310);
						}
						if (this.aByteArray87[this.anInt7310] == 0) {
							local125 = new Class4();
							local125.aLong227 = this.anInt7310;
							this.aClass244_50.method5273(local125);
							local18 = false;
						}
						this.anInt7310++;
					}
				}
				if (local18) {
					this.anInt7310 = 0;
					this.aBoolean515 = false;
				}
			} else if (this.aBoolean516) {
				local18 = true;
				for (local23 = this.aClass244_50.method5263(); local23 != null; local23 = this.aClass244_50.method5271()) {
					local29 = (int) local23.aLong227;
					if (this.aByteArray87[local29] != 1) {
						this.method5852(2, local29);
					}
					if (this.aByteArray87[local29] == 1) {
						local23.method6059();
					} else {
						local18 = false;
					}
				}
				while (this.aClass77_2.anIntArray135.length > this.anInt7310) {
					if (this.aClass77_2.anIntArray135[this.anInt7310] == 0) {
						this.anInt7310++;
					} else {
						if (this.aClass54_3.method1237()) {
							local18 = false;
							break;
						}
						if (this.aByteArray87[this.anInt7310] != 1) {
							this.method5852(2, this.anInt7310);
						}
						if (this.aByteArray87[this.anInt7310] != 1) {
							local125 = new Class4();
							local125.aLong227 = this.anInt7310;
							local18 = false;
							this.aClass244_50.method5273(local125);
						}
						this.anInt7310++;
					}
				}
				if (local18) {
					this.aBoolean516 = false;
					this.anInt7310 = 0;
				}
			} else {
				this.aClass244_50 = null;
			}
		}
		if (!this.aBoolean517 || Static266.method3498() < this.aLong220) {
			return;
		}
		for (@Pc(327) Class4_Sub2_Sub2 local327 = (Class4_Sub2_Sub2) this.aClass67_36.method1428(); local327 != null; local327 = (Class4_Sub2_Sub2) this.aClass67_36.method1424()) {
			if (!local327.aBoolean113) {
				if (local327.aBoolean112) {
					if (!local327.aBoolean114) {
						throw new RuntimeException();
					}
					local327.method6059();
				} else {
					local327.aBoolean112 = true;
				}
			}
		}
		this.aLong220 = Static266.method3498() + 1000L;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)I")
	public int method5846() {
		return this.anInt7295;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	@Override
	public void method5832(@OriginalArg(1) int arg0) {
		if (this.aClass117_4 == null) {
			return;
		}
		for (@Pc(16) Class4 local16 = this.aClass244_49.method5263(); local16 != null; local16 = this.aClass244_49.method5271()) {
			if (local16.aLong227 == (long) arg0) {
				return;
			}
		}
		@Pc(40) Class4 local40 = new Class4();
		local40.aLong227 = arg0;
		this.aClass244_49.method5273(local40);
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public void method5848() {
		if (this.aClass117_4 != null) {
			this.aBoolean516 = true;
			if (this.aClass244_50 == null) {
				this.aClass244_50 = new Class244();
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)I")
	public int method5849() {
		if (this.method5834() == null) {
			return this.aClass4_Sub2_Sub2_1 == null ? 0 : this.aClass4_Sub2_Sub2_1.method1361();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)[B")
	@Override
	public byte[] method5839(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub2_Sub2 local9 = this.method5852(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = local9.method1359();
			local9.method6059();
			return local19;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I")
	@Override
	public int method5837(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub2_Sub2 local17 = (Class4_Sub2_Sub2) this.aClass67_36.method1429((long) arg0);
		return local17 == null ? 0 : local17.method1361();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lclient!f;")
	@Override
	public Class77 method5834() {
		if (this.aClass77_2 != null) {
			return this.aClass77_2;
		}
		if (this.aClass4_Sub2_Sub2_1 == null) {
			if (this.aClass54_3.method1245()) {
				return null;
			}
			this.aClass4_Sub2_Sub2_1 = this.aClass54_3.method1239(true, this.anInt7307, 255, (byte) 0);
		}
		if (this.aClass4_Sub2_Sub2_1.aBoolean113) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass4_Sub2_Sub2_1.method1359();
		if (this.aClass4_Sub2_Sub2_1 instanceof Class4_Sub2_Sub2_Sub2) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass77_2 = new Class77(local51, this.anInt7302);
				if (this.aClass77_2.anInt1852 != this.anInt7305) {
					throw new RuntimeException();
				}
			} catch (@Pc(141) RuntimeException local141) {
				this.aClass77_2 = null;
				if (this.aClass54_3.method1245()) {
					this.aClass4_Sub2_Sub2_1 = null;
				} else {
					this.aClass4_Sub2_Sub2_1 = this.aClass54_3.method1239(true, this.anInt7307, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass77_2 = new Class77(local51, this.anInt7302);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass54_3.method1242();
				this.aClass77_2 = null;
				if (this.aClass54_3.method1245()) {
					this.aClass4_Sub2_Sub2_1 = null;
				} else {
					this.aClass4_Sub2_Sub2_1 = this.aClass54_3.method1239(true, this.anInt7307, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass117_3 != null) {
				this.aClass234_3.method4928(local51, this.aClass117_3, this.anInt7307);
			}
		}
		this.aClass4_Sub2_Sub2_1 = null;
		if (this.aClass117_4 != null) {
			this.aByteArray87 = new byte[this.aClass77_2.anInt1855];
			this.anInt7295 = 0;
		}
		return this.aClass77_2;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)Lclient!au;")
	private Class4_Sub2_Sub2 method5852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class4_Sub2_Sub2 local20 = (Class4_Sub2_Sub2) this.aClass67_36.method1429((long) arg1);
		if (local20 != null && arg0 == 0 && !local20.aBoolean114 && local20.aBoolean113) {
			local20.method6059();
			local20 = null;
		}
		if (local20 == null) {
			if (arg0 == 0) {
				if (this.aClass117_4 == null || this.aByteArray87[arg1] == -1) {
					if (this.aClass54_3.method1245()) {
						return null;
					}
					local20 = this.aClass54_3.method1239(true, arg1, this.anInt7307, (byte) 2);
				} else {
					local20 = this.aClass234_3.method4923(arg1, this.aClass117_4);
				}
			} else if (arg0 == 1) {
				if (this.aClass117_4 == null) {
					throw new RuntimeException();
				}
				local20 = this.aClass234_3.method4926(this.aClass117_4, arg1);
			} else if (arg0 == 2) {
				if (this.aClass117_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray87[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass54_3.method1237()) {
					return null;
				}
				local20 = this.aClass54_3.method1239(false, arg1, this.anInt7307, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass67_36.method1426(local20, (long) arg1);
		}
		if (local20.aBoolean113) {
			return null;
		}
		@Pc(165) byte[] local165 = local20.method1359();
		@Pc(192) int local192;
		@Pc(294) Class4_Sub2_Sub2_Sub1 local294;
		if (!(local20 instanceof Class4_Sub2_Sub2_Sub2)) {
			try {
				if (local165 == null || local165.length <= 2) {
					throw new RuntimeException();
				}
				Static128.aCRC32_24.reset();
				Static128.aCRC32_24.update(local165, 0, local165.length - 2);
				local192 = (int) Static128.aCRC32_24.getValue();
				if (this.aClass77_2.anIntArray141[arg1] != local192) {
					throw new RuntimeException();
				}
				this.aClass54_3.anInt1521 = 0;
				this.aClass54_3.anInt1522 = 0;
			} catch (@Pc(352) RuntimeException local352) {
				this.aClass54_3.method1242();
				local20.method6059();
				if (local20.aBoolean114 && !this.aClass54_3.method1245()) {
					local294 = this.aClass54_3.method1239(true, arg1, this.anInt7307, (byte) 2);
					this.aClass67_36.method1426(local294, (long) arg1);
				}
				return null;
			}
			local165[local165.length - 2] = (byte) (this.aClass77_2.anIntArray136[arg1] >>> 8);
			local165[local165.length - 1] = (byte) this.aClass77_2.anIntArray136[arg1];
			if (this.aClass117_4 != null) {
				this.aClass234_3.method4928(local165, this.aClass117_4, arg1);
				if (this.aByteArray87[arg1] != 1) {
					this.anInt7295++;
					this.aByteArray87[arg1] = 1;
				}
			}
			if (!local20.aBoolean114) {
				local20.method6059();
			}
			return local20;
		}
		try {
			if (local165 == null || local165.length <= 2) {
				throw new RuntimeException();
			}
			Static128.aCRC32_24.reset();
			Static128.aCRC32_24.update(local165, 0, local165.length - 2);
			local192 = (int) Static128.aCRC32_24.getValue();
			if (local192 != this.aClass77_2.anIntArray141[arg1]) {
				throw new RuntimeException();
			}
			@Pc(223) int local223 = (local165[local165.length - 1] & 0xFF) + ((local165[local165.length - 2] & 0xFF) << 8);
			if (local223 != (this.aClass77_2.anIntArray136[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray87[arg1] != 1) {
				this.anInt7295++;
				this.aByteArray87[arg1] = 1;
			}
			if (!local20.aBoolean114) {
				local20.method6059();
			}
			return local20;
		} catch (@Pc(268) Exception local268) {
			this.aByteArray87[arg1] = -1;
			local20.method6059();
			if (local20.aBoolean114 && !this.aClass54_3.method1245()) {
				local294 = this.aClass54_3.method1239(true, arg1, this.anInt7307, (byte) 2);
				this.aClass67_36.method1426(local294, (long) arg1);
			}
			return null;
		}
	}
}
