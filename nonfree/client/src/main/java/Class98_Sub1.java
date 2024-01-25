import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "Lclient!naa;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "Z")
	private boolean aBoolean288;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
	private int anInt4736 = 0;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "Lclient!nj;")
	private final Class212 aClass212_20 = new Class212(16);

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
	private int anInt4742 = 0;

	@OriginalMember(owner = "client!lm", name = "L", descriptor = "Lclient!rh;")
	private final Class275 aClass275_98 = new Class275();

	@OriginalMember(owner = "client!lm", name = "P", descriptor = "J")
	private long aLong133 = 0L;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "Lclient!vh;")
	private final Class331 aClass331_1;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
	private final int anInt4740;

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "Lclient!rh;")
	private Class275 aClass275_99;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	private final int anInt4731;

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "Lclient!mca;")
	private final Class195 aClass195_4;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	private final int anInt4733;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "Z")
	private final boolean aBoolean290;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Lclient!vh;")
	private final Class331 aClass331_2;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!kl;")
	private final Class175 aClass175_2;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Lclient!ml;")
	private Class6_Sub1_Sub10 aClass6_Sub1_Sub10_1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(ILclient!vh;Lclient!vh;Lclient!kl;Lclient!mca;I[BIZ)V")
	public Class98_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) Class331 arg2, @OriginalArg(3) Class175 arg3, @OriginalArg(4) Class195 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass331_1 = arg1;
		this.anInt4740 = arg0;
		if (this.aClass331_1 == null) {
			this.aBoolean289 = false;
		} else {
			this.aBoolean289 = true;
			this.aClass275_99 = new Class275();
		}
		this.anInt4731 = arg5;
		this.aClass195_4 = arg4;
		this.anInt4733 = arg7;
		this.aBoolean290 = arg8;
		this.aClass331_2 = arg2;
		this.aClass175_2 = arg3;
		this.aByteArray58 = arg6;
		if (this.aClass331_2 != null) {
			this.aClass6_Sub1_Sub10_1 = this.aClass195_4.method4683(this.anInt4740, this.aClass331_2);
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	public void method4074() {
		if (this.aClass331_1 != null) {
			this.aBoolean288 = true;
			if (this.aClass275_99 == null) {
				this.aClass275_99 = new Class275();
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)I")
	public int method4076() {
		if (this.method4070() == null) {
			return this.aClass6_Sub1_Sub10_1 == null ? 0 : this.aClass6_Sub1_Sub10_1.method7036();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZ)Lclient!ml;")
	private Class6_Sub1_Sub10 method4079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class6_Sub1_Sub10 local13 = (Class6_Sub1_Sub10) this.aClass212_20.method5106((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean605 && local13.aBoolean607) {
			local13.method7849();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass331_1 == null || this.aByteArray57[arg1] == -1) {
					if (this.aClass175_2.method3746()) {
						return null;
					}
					local13 = this.aClass175_2.method3736(arg1, true, (byte) 2, this.anInt4740);
				} else {
					local13 = this.aClass195_4.method4683(arg1, this.aClass331_1);
				}
			} else if (arg0 == 1) {
				if (this.aClass331_1 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass195_4.method4679(arg1, this.aClass331_1);
			} else if (arg0 == 2) {
				if (this.aClass331_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray57[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass175_2.method3734()) {
					return null;
				}
				local13 = this.aClass175_2.method3736(arg1, false, (byte) 2, this.anInt4740);
			} else {
				throw new RuntimeException();
			}
			this.aClass212_20.method5104((long) arg1, local13);
		}
		if (local13.aBoolean607) {
			return null;
		}
		@Pc(155) byte[] local155 = local13.method7037();
		@Pc(182) int local182;
		@Pc(209) byte[] local209;
		@Pc(218) byte[] local218;
		@Pc(220) int local220;
		@Pc(272) Class6_Sub1_Sub10_Sub1 local272;
		if (!(local13 instanceof Class6_Sub1_Sub10_Sub2)) {
			try {
				if (local155 == null || local155.length <= 2) {
					throw new RuntimeException();
				}
				Static166.aCRC32_1.reset();
				Static166.aCRC32_1.update(local155, 0, local155.length - 2);
				local182 = (int) Static166.aCRC32_1.getValue();
				if (local182 != this.aClass207_1.anIntArray525[arg1]) {
					throw new RuntimeException();
				}
				if (this.aClass207_1.aByteArrayArray18 != null && this.aClass207_1.aByteArrayArray18[arg1] != null) {
					local209 = this.aClass207_1.aByteArrayArray18[arg1];
					local218 = Static139.method2085(local155.length - 2, 0, local155);
					for (local220 = 0; local220 < 64; local220++) {
						if (local209[local220] != local218[local220]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass175_2.anInt4360 = 0;
				this.aClass175_2.anInt4361 = 0;
			} catch (@Pc(247) RuntimeException local247) {
				this.aClass175_2.method3744();
				local13.method7849();
				if (local13.aBoolean605 && !this.aClass175_2.method3746()) {
					local272 = this.aClass175_2.method3736(arg1, true, (byte) 2, this.anInt4740);
					this.aClass212_20.method5104((long) arg1, local272);
				}
				return null;
			}
			local155[local155.length - 2] = (byte) (this.aClass207_1.anIntArray523[arg1] >>> 8);
			local155[local155.length - 1] = (byte) this.aClass207_1.anIntArray523[arg1];
			if (this.aClass331_1 != null) {
				this.aClass195_4.method4684(local155, arg1, this.aClass331_1);
				if (this.aByteArray57[arg1] != 1) {
					this.anInt4736++;
					this.aByteArray57[arg1] = 1;
				}
			}
			if (!local13.aBoolean605) {
				local13.method7849();
			}
			return local13;
		}
		try {
			if (local155 == null || local155.length <= 2) {
				throw new RuntimeException();
			}
			Static166.aCRC32_1.reset();
			Static166.aCRC32_1.update(local155, 0, local155.length - 2);
			local182 = (int) Static166.aCRC32_1.getValue();
			if (this.aClass207_1.anIntArray525[arg1] != local182) {
				throw new RuntimeException();
			}
			if (this.aClass207_1.aByteArrayArray18 != null && this.aClass207_1.aByteArrayArray18[arg1] != null) {
				local209 = this.aClass207_1.aByteArrayArray18[arg1];
				local218 = Static139.method2085(local155.length - 2, 0, local155);
				for (local220 = 0; local220 < 64; local220++) {
					if (local218[local220] != local209[local220]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(451) int local451 = ((local155[local155.length - 2] & 0xFF) << 8) + (local155[local155.length - 1] & 0xFF);
			if (local451 != (this.aClass207_1.anIntArray523[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray57[arg1] != 1) {
				this.anInt4736++;
				this.aByteArray57[arg1] = 1;
			}
			if (!local13.aBoolean605) {
				local13.method7849();
			}
			return local13;
		} catch (@Pc(492) Exception local492) {
			this.aByteArray57[arg1] = -1;
			local13.method7849();
			if (local13.aBoolean605 && !this.aClass175_2.method3746()) {
				local272 = this.aClass175_2.method3736(arg1, true, (byte) 2, this.anInt4740);
				this.aClass212_20.method5104((long) arg1, local272);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)I")
	public int method4080() {
		if (this.aClass207_1 == null) {
			return 0;
		} else if (this.aBoolean289) {
			@Pc(28) Class6 local28 = this.aClass275_99.method6366();
			return local28 == null ? 0 : (int) local28.aLong249;
		} else {
			return this.aClass207_1.anInt5825;
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	public void method4081() {
		if (this.aClass275_99 == null || this.method4070() == null) {
			return;
		}
		for (@Pc(25) Class6 local25 = this.aClass275_98.method6366(); local25 != null; local25 = this.aClass275_98.method6364()) {
			@Pc(31) int local31 = (int) local25.aLong249;
			if (local31 < 0 || this.aClass207_1.anInt5826 <= local31 || this.aClass207_1.anIntArray524[local31] == 0) {
				local25.method7849();
			} else {
				if (this.aByteArray57[local31] == 0) {
					this.method4079(1, local31);
				}
				if (this.aByteArray57[local31] == -1) {
					this.method4079(2, local31);
				}
				if (this.aByteArray57[local31] == 1) {
					local25.method7849();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Lclient!naa;")
	@Override
	public Class207 method4070() {
		if (this.aClass207_1 != null) {
			return this.aClass207_1;
		}
		if (this.aClass6_Sub1_Sub10_1 == null) {
			if (this.aClass175_2.method3746()) {
				return null;
			}
			this.aClass6_Sub1_Sub10_1 = this.aClass175_2.method3736(this.anInt4740, true, (byte) 0, 255);
		}
		if (this.aClass6_Sub1_Sub10_1.aBoolean607) {
			return null;
		}
		@Pc(45) byte[] local45 = this.aClass6_Sub1_Sub10_1.method7037();
		if (this.aClass6_Sub1_Sub10_1 instanceof Class6_Sub1_Sub10_Sub2) {
			try {
				if (local45 == null) {
					throw new RuntimeException();
				}
				this.aClass207_1 = new Class207(local45, this.anInt4731, this.aByteArray58);
				if (this.aClass207_1.anInt5829 != this.anInt4733) {
					throw new RuntimeException();
				}
			} catch (@Pc(150) RuntimeException local150) {
				this.aClass207_1 = null;
				if (this.aClass175_2.method3746()) {
					this.aClass6_Sub1_Sub10_1 = null;
				} else {
					this.aClass6_Sub1_Sub10_1 = this.aClass175_2.method3736(this.anInt4740, true, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local45 == null) {
					throw new RuntimeException();
				}
				this.aClass207_1 = new Class207(local45, this.anInt4731, this.aByteArray58);
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass175_2.method3744();
				this.aClass207_1 = null;
				if (this.aClass175_2.method3746()) {
					this.aClass6_Sub1_Sub10_1 = null;
				} else {
					this.aClass6_Sub1_Sub10_1 = this.aClass175_2.method3736(this.anInt4740, true, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass331_2 != null) {
				this.aClass195_4.method4684(local45, this.anInt4740, this.aClass331_2);
			}
		}
		this.aClass6_Sub1_Sub10_1 = null;
		if (this.aClass331_1 != null) {
			this.aByteArray57 = new byte[this.aClass207_1.anInt5826];
			this.anInt4736 = 0;
		}
		return this.aClass207_1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)I")
	@Override
	public int method4071(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub1_Sub10 local16 = (Class6_Sub1_Sub10) this.aClass212_20.method5106((long) arg0);
		return local16 == null ? 0 : local16.method7036();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method4067(@OriginalArg(0) int arg0) {
		@Pc(9) Class6_Sub1_Sub10 local9 = this.method4079(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = local9.method7037();
			local9.method7849();
			return local19;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4073(@OriginalArg(1) int arg0) {
		if (this.aClass331_1 == null) {
			return;
		}
		for (@Pc(22) Class6 local22 = this.aClass275_98.method6366(); local22 != null; local22 = this.aClass275_98.method6364()) {
			if ((long) arg0 == local22.aLong249) {
				return;
			}
		}
		@Pc(46) Class6 local46 = new Class6();
		local46.aLong249 = arg0;
		this.aClass275_98.method6370(local46);
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)I")
	public int method4082() {
		return this.aClass207_1 == null ? 0 : this.aClass207_1.anInt5825;
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)I")
	public int method4084() {
		return this.anInt4736;
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V")
	public void method4087() {
		if (this.aClass275_99 != null) {
			if (this.method4070() == null) {
				return;
			}
			@Pc(32) boolean local32;
			@Pc(37) Class6 local37;
			@Pc(43) int local43;
			@Pc(135) Class6 local135;
			if (this.aBoolean289) {
				local32 = true;
				for (local37 = this.aClass275_99.method6366(); local37 != null; local37 = this.aClass275_99.method6364()) {
					local43 = (int) local37.aLong249;
					if (this.aByteArray57[local43] == 0) {
						this.method4079(1, local43);
					}
					if (this.aByteArray57[local43] == 0) {
						local32 = false;
					} else {
						local37.method7849();
					}
				}
				while (this.aClass207_1.anIntArray524.length > this.anInt4742) {
					if (this.aClass207_1.anIntArray524[this.anInt4742] == 0) {
						this.anInt4742++;
					} else {
						if (this.aClass195_4.anInt5476 >= 250) {
							local32 = false;
							break;
						}
						if (this.aByteArray57[this.anInt4742] == 0) {
							this.method4079(1, this.anInt4742);
						}
						if (this.aByteArray57[this.anInt4742] == 0) {
							local135 = new Class6();
							local135.aLong249 = this.anInt4742;
							local32 = false;
							this.aClass275_99.method6370(local135);
						}
						this.anInt4742++;
					}
				}
				if (local32) {
					this.aBoolean289 = false;
					this.anInt4742 = 0;
				}
			} else if (this.aBoolean288) {
				local32 = true;
				for (local37 = this.aClass275_99.method6366(); local37 != null; local37 = this.aClass275_99.method6364()) {
					local43 = (int) local37.aLong249;
					if (this.aByteArray57[local43] != 1) {
						this.method4079(2, local43);
					}
					if (this.aByteArray57[local43] == 1) {
						local37.method7849();
					} else {
						local32 = false;
					}
				}
				while (this.aClass207_1.anIntArray524.length > this.anInt4742) {
					if (this.aClass207_1.anIntArray524[this.anInt4742] == 0) {
						this.anInt4742++;
					} else {
						if (this.aClass175_2.method3734()) {
							local32 = false;
							break;
						}
						if (this.aByteArray57[this.anInt4742] != 1) {
							this.method4079(2, this.anInt4742);
						}
						if (this.aByteArray57[this.anInt4742] != 1) {
							local135 = new Class6();
							local135.aLong249 = this.anInt4742;
							local32 = false;
							this.aClass275_99.method6370(local135);
						}
						this.anInt4742++;
					}
				}
				if (local32) {
					this.aBoolean288 = false;
					this.anInt4742 = 0;
				}
			} else {
				this.aClass275_99 = null;
			}
		}
		if (!this.aBoolean290 || Static137.method2058() < this.aLong133) {
			return;
		}
		for (@Pc(320) Class6_Sub1_Sub10 local320 = (Class6_Sub1_Sub10) this.aClass212_20.method5099(); local320 != null; local320 = (Class6_Sub1_Sub10) this.aClass212_20.method5103()) {
			if (!local320.aBoolean607) {
				if (local320.aBoolean606) {
					if (!local320.aBoolean605) {
						throw new RuntimeException();
					}
					local320.method7849();
				} else {
					local320.aBoolean606 = true;
				}
			}
		}
		this.aLong133 = Static137.method2058() + 1000L;
	}
}
