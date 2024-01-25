import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class193_Sub1 extends Class193 {

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "Lclient!te;")
	private Class319 aClass319_1;

	@OriginalMember(owner = "client!lw", name = "B", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!lw", name = "N", descriptor = "Z")
	private boolean aBoolean525;

	@OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
	private int anInt6667 = 0;

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "Lclient!wr;")
	private final Class380 aClass380_25 = new Class380(16);

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
	private int anInt6676 = 0;

	@OriginalMember(owner = "client!lw", name = "M", descriptor = "Lclient!kba;")
	private final Class163 aClass163_37 = new Class163();

	@OriginalMember(owner = "client!lw", name = "O", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "Lclient!bg;")
	private final Class26 aClass26_2;

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
	private final int anInt6666;

	@OriginalMember(owner = "client!lw", name = "L", descriptor = "Z")
	private boolean aBoolean524;

	@OriginalMember(owner = "client!lw", name = "J", descriptor = "Lclient!kba;")
	private Class163 aClass163_36;

	@OriginalMember(owner = "client!lw", name = "D", descriptor = "Lclient!jd;")
	private final Class152 aClass152_2;

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "Lclient!bg;")
	private final Class26 aClass26_3;

	@OriginalMember(owner = "client!lw", name = "P", descriptor = "Z")
	private final boolean aBoolean526;

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
	private final int anInt6665;

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "Lclient!pt;")
	private final Class267 aClass267_3;

	@OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
	private final int anInt6675;

	@OriginalMember(owner = "client!lw", name = "F", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "Lclient!hia;")
	private Class6_Sub5_Sub12 aClass6_Sub5_Sub12_1;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(ILclient!bg;Lclient!bg;Lclient!jd;Lclient!pt;I[BIZ)V")
	public Class193_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) Class152 arg3, @OriginalArg(4) Class267 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass26_2 = arg1;
		this.anInt6666 = arg0;
		if (this.aClass26_2 == null) {
			this.aBoolean524 = false;
		} else {
			this.aBoolean524 = true;
			this.aClass163_36 = new Class163();
		}
		this.aClass152_2 = arg3;
		this.aClass26_3 = arg2;
		this.aBoolean526 = arg8;
		this.anInt6665 = arg5;
		this.aClass267_3 = arg4;
		this.anInt6675 = arg7;
		this.aByteArray56 = arg6;
		if (this.aClass26_3 != null) {
			this.aClass6_Sub5_Sub12_1 = this.aClass267_3.method6815(this.aClass26_3, this.anInt6666);
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)I")
	public int method5575() {
		if (this.aClass319_1 == null) {
			return 0;
		} else if (this.aBoolean524) {
			@Pc(25) Class6 local25 = this.aClass163_36.method4966();
			return local25 == null ? 0 : (int) local25.aLong278;
		} else {
			return this.aClass319_1.anInt9369;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Lclient!hia;")
	private Class6_Sub5_Sub12 method5576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub5_Sub12 local15 = (Class6_Sub5_Sub12) this.aClass380_25.method8747((long) arg0);
		if (local15 != null && arg1 == 0 && !local15.aBoolean681 && local15.aBoolean682) {
			local15.method8792();
			local15 = null;
		}
		if (local15 == null) {
			if (arg1 == 0) {
				if (this.aClass26_2 == null || this.aByteArray55[arg0] == -1) {
					if (this.aClass152_2.method4602()) {
						return null;
					}
					local15 = this.aClass152_2.method4601(this.anInt6666, (byte) 2, arg0, true);
				} else {
					local15 = this.aClass267_3.method6815(this.aClass26_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass26_2 == null) {
					throw new RuntimeException();
				}
				local15 = this.aClass267_3.method6807(arg0, this.aClass26_2);
			} else if (arg1 == 2) {
				if (this.aClass26_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray55[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass152_2.method4612()) {
					return null;
				}
				local15 = this.aClass152_2.method4601(this.anInt6666, (byte) 2, arg0, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass380_25.method8753(local15, (long) arg0);
		}
		if (local15.aBoolean682) {
			return null;
		}
		@Pc(155) byte[] local155 = local15.method7125();
		@Pc(191) int local191;
		@Pc(222) byte[] local222;
		@Pc(231) byte[] local231;
		@Pc(233) int local233;
		@Pc(344) Class6_Sub5_Sub12_Sub1 local344;
		if (!(local15 instanceof Class6_Sub5_Sub12_Sub2)) {
			try {
				label157: {
					if (local155 != null && local155.length > 2) {
						Static492.aCRC32_1.reset();
						Static492.aCRC32_1.update(local155, 0, local155.length - 2);
						local191 = (int) Static492.aCRC32_1.getValue();
						if (this.aClass319_1.anIntArray494[arg0] != local191) {
							throw new RuntimeException();
						}
						if (this.aClass319_1.aByteArrayArray30 == null || this.aClass319_1.aByteArrayArray30[arg0] == null) {
							break label157;
						}
						local222 = this.aClass319_1.aByteArrayArray30[arg0];
						local231 = Static221.method4083(0, local155, local155.length - 2);
						local233 = 0;
						while (true) {
							if (local233 >= 64) {
								break label157;
							}
							if (local222[local233] != local231[local233]) {
								throw new RuntimeException();
							}
							local233++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass152_2.anInt5586 = 0;
				this.aClass152_2.anInt5587 = 0;
			} catch (@Pc(454) RuntimeException local454) {
				this.aClass152_2.method4606();
				local15.method8792();
				if (local15.aBoolean681 && !this.aClass152_2.method4602()) {
					local344 = this.aClass152_2.method4601(this.anInt6666, (byte) 2, arg0, true);
					this.aClass380_25.method8753(local344, (long) arg0);
				}
				return null;
			}
			local155[local155.length - 2] = (byte) (this.aClass319_1.anIntArray491[arg0] >>> 8);
			local155[local155.length - 1] = (byte) this.aClass319_1.anIntArray491[arg0];
			if (this.aClass26_2 != null) {
				this.aClass267_3.method6810(local155, this.aClass26_2, arg0);
				if (this.aByteArray55[arg0] != 1) {
					this.anInt6667++;
					this.aByteArray55[arg0] = 1;
				}
			}
			if (!local15.aBoolean681) {
				local15.method8792();
			}
			return local15;
		}
		try {
			if (local155 == null || local155.length <= 2) {
				throw new RuntimeException();
			}
			Static492.aCRC32_1.reset();
			Static492.aCRC32_1.update(local155, 0, local155.length - 2);
			local191 = (int) Static492.aCRC32_1.getValue();
			if (local191 != this.aClass319_1.anIntArray494[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass319_1.aByteArrayArray30 != null && this.aClass319_1.aByteArrayArray30[arg0] != null) {
				local222 = this.aClass319_1.aByteArrayArray30[arg0];
				local231 = Static221.method4083(0, local155, local155.length - 2);
				for (local233 = 0; local233 < 64; local233++) {
					if (local231[local233] != local222[local233]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(271) int local271 = ((local155[local155.length - 2] & 0xFF) << 8) + (local155[local155.length - 1] & 0xFF);
			if (local271 != (this.aClass319_1.anIntArray491[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray55[arg0] != 1) {
				this.anInt6667++;
				this.aByteArray55[arg0] = 1;
			}
			if (!local15.aBoolean681) {
				local15.method8792();
			}
			return local15;
		} catch (@Pc(318) Exception local318) {
			this.aByteArray55[arg0] = -1;
			local15.method8792();
			if (local15.aBoolean681 && !this.aClass152_2.method4602()) {
				local344 = this.aClass152_2.method4601(this.anInt6666, (byte) 2, arg0, true);
				this.aClass380_25.method8753(local344, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method5570(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub5_Sub12 local11 = this.method5576(arg0, 0);
		if (local11 == null) {
			return null;
		} else {
			@Pc(21) byte[] local21 = local11.method7125();
			local11.method8792();
			return local21;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Lclient!te;")
	@Override
	public Class319 method5568() {
		if (this.aClass319_1 != null) {
			return this.aClass319_1;
		}
		if (this.aClass6_Sub5_Sub12_1 == null) {
			if (this.aClass152_2.method4602()) {
				return null;
			}
			this.aClass6_Sub5_Sub12_1 = this.aClass152_2.method4601(255, (byte) 0, this.anInt6666, true);
		}
		if (this.aClass6_Sub5_Sub12_1.aBoolean682) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass6_Sub5_Sub12_1.method7125();
		if (this.aClass6_Sub5_Sub12_1 instanceof Class6_Sub5_Sub12_Sub2) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass319_1 = new Class319(local50, this.anInt6665, this.aByteArray56);
				if (this.anInt6675 != this.aClass319_1.anInt9374) {
					throw new RuntimeException();
				}
			} catch (@Pc(144) RuntimeException local144) {
				this.aClass319_1 = null;
				if (this.aClass152_2.method4602()) {
					this.aClass6_Sub5_Sub12_1 = null;
				} else {
					this.aClass6_Sub5_Sub12_1 = this.aClass152_2.method4601(255, (byte) 0, this.anInt6666, true);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass319_1 = new Class319(local50, this.anInt6665, this.aByteArray56);
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass152_2.method4606();
				this.aClass319_1 = null;
				if (this.aClass152_2.method4602()) {
					this.aClass6_Sub5_Sub12_1 = null;
				} else {
					this.aClass6_Sub5_Sub12_1 = this.aClass152_2.method4601(255, (byte) 0, this.anInt6666, true);
				}
				return null;
			}
			if (this.aClass26_3 != null) {
				this.aClass267_3.method6810(local50, this.aClass26_3, this.anInt6666);
			}
		}
		this.aClass6_Sub5_Sub12_1 = null;
		if (this.aClass26_2 != null) {
			this.aByteArray55 = new byte[this.aClass319_1.anInt9371];
			this.anInt6667 = 0;
		}
		return this.aClass319_1;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)I")
	@Override
	public int method5574(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub5_Sub12 local16 = (Class6_Sub5_Sub12) this.aClass380_25.method8747((long) arg0);
		return local16 == null ? 0 : local16.method7124();
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
	public void method5577() {
		if (this.aClass26_2 != null) {
			this.aBoolean525 = true;
			if (this.aClass163_36 == null) {
				this.aClass163_36 = new Class163();
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)I")
	public int method5579() {
		if (this.method5568() == null) {
			return this.aClass6_Sub5_Sub12_1 == null ? 0 : this.aClass6_Sub5_Sub12_1.method7124();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5569(@OriginalArg(0) int arg0) {
		if (this.aClass26_2 == null) {
			return;
		}
		for (@Pc(20) Class6 local20 = this.aClass163_37.method4966(); local20 != null; local20 = this.aClass163_37.method4965()) {
			if ((long) arg0 == local20.aLong278) {
				return;
			}
		}
		@Pc(40) Class6 local40 = new Class6();
		local40.aLong278 = (long) arg0;
		this.aClass163_37.method4967(local40);
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)V")
	public void method5580() {
		if (this.aClass163_36 != null) {
			if (this.method5568() == null) {
				return;
			}
			@Pc(22) boolean local22;
			@Pc(27) Class6 local27;
			@Pc(33) int local33;
			@Pc(129) Class6 local129;
			if (this.aBoolean524) {
				local22 = true;
				for (local27 = this.aClass163_36.method4966(); local27 != null; local27 = this.aClass163_36.method4965()) {
					local33 = (int) local27.aLong278;
					if (this.aByteArray55[local33] == 0) {
						this.method5576(local33, 1);
					}
					if (this.aByteArray55[local33] == 0) {
						local22 = false;
					} else {
						local27.method8792();
					}
				}
				while (this.aClass319_1.anIntArray492.length > this.anInt6676) {
					if (this.aClass319_1.anIntArray492[this.anInt6676] == 0) {
						this.anInt6676++;
					} else {
						if (this.aClass267_3.anInt8099 >= 250) {
							local22 = false;
							break;
						}
						if (this.aByteArray55[this.anInt6676] == 0) {
							this.method5576(this.anInt6676, 1);
						}
						if (this.aByteArray55[this.anInt6676] == 0) {
							local129 = new Class6();
							local129.aLong278 = (long) this.anInt6676;
							local22 = false;
							this.aClass163_36.method4967(local129);
						}
						this.anInt6676++;
					}
				}
				if (local22) {
					this.anInt6676 = 0;
					this.aBoolean524 = false;
				}
			} else if (this.aBoolean525) {
				local22 = true;
				for (local27 = this.aClass163_36.method4966(); local27 != null; local27 = this.aClass163_36.method4965()) {
					local33 = (int) local27.aLong278;
					if (this.aByteArray55[local33] != 1) {
						this.method5576(local33, 2);
					}
					if (this.aByteArray55[local33] == 1) {
						local27.method8792();
					} else {
						local22 = false;
					}
				}
				while (this.anInt6676 < this.aClass319_1.anIntArray492.length) {
					if (this.aClass319_1.anIntArray492[this.anInt6676] == 0) {
						this.anInt6676++;
					} else {
						if (this.aClass152_2.method4612()) {
							local22 = false;
							break;
						}
						if (this.aByteArray55[this.anInt6676] != 1) {
							this.method5576(this.anInt6676, 2);
						}
						if (this.aByteArray55[this.anInt6676] != 1) {
							local129 = new Class6();
							local129.aLong278 = (long) this.anInt6676;
							this.aClass163_36.method4967(local129);
							local22 = false;
						}
						this.anInt6676++;
					}
				}
				if (local22) {
					this.anInt6676 = 0;
					this.aBoolean525 = false;
				}
			} else {
				this.aClass163_36 = null;
			}
		}
		if (!this.aBoolean526 || this.aLong182 > Static582.method8056()) {
			return;
		}
		for (@Pc(333) Class6_Sub5_Sub12 local333 = (Class6_Sub5_Sub12) this.aClass380_25.method8755(); local333 != null; local333 = (Class6_Sub5_Sub12) this.aClass380_25.method8752()) {
			if (!local333.aBoolean682) {
				if (local333.aBoolean680) {
					if (!local333.aBoolean681) {
						throw new RuntimeException();
					}
					local333.method8792();
				} else {
					local333.aBoolean680 = true;
				}
			}
		}
		this.aLong182 = Static582.method8056() + 1000L;
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "(I)V")
	public void method5581() {
		if (this.aClass163_36 == null || this.method5568() == null) {
			return;
		}
		for (@Pc(29) Class6 local29 = this.aClass163_37.method4966(); local29 != null; local29 = this.aClass163_37.method4965()) {
			@Pc(35) int local35 = (int) local29.aLong278;
			if (local35 < 0 || this.aClass319_1.anInt9371 <= local35 || this.aClass319_1.anIntArray492[local35] == 0) {
				local29.method8792();
			} else {
				if (this.aByteArray55[local35] == 0) {
					this.method5576(local35, 1);
				}
				if (this.aByteArray55[local35] == -1) {
					this.method5576(local35, 2);
				}
				if (this.aByteArray55[local35] == 1) {
					local29.method8792();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "(I)I")
	public int method5582() {
		return this.anInt6667;
	}

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "(I)I")
	public int method5584() {
		return this.aClass319_1 == null ? 0 : this.aClass319_1.anInt9369;
	}
}
