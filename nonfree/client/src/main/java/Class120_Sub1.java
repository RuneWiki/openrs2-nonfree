import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class120_Sub1 extends Class120 {

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "Lclient!oba;")
	private Class241 aClass241_1;

	@OriginalMember(owner = "client!gu", name = "B", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!gu", name = "I", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	private int anInt4496 = 0;

	@OriginalMember(owner = "client!gu", name = "D", descriptor = "Lclient!sga;")
	private final Class307 aClass307_25 = new Class307(16);

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
	private int anInt4511 = 0;

	@OriginalMember(owner = "client!gu", name = "L", descriptor = "Lclient!qia;")
	private final Class276 aClass276_30 = new Class276();

	@OriginalMember(owner = "client!gu", name = "O", descriptor = "J")
	private long aLong95 = 0L;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	private final int anInt4491;

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "Lclient!wea;")
	private final Class370 aClass370_1;

	@OriginalMember(owner = "client!gu", name = "K", descriptor = "Z")
	private boolean aBoolean380;

	@OriginalMember(owner = "client!gu", name = "M", descriptor = "Lclient!qia;")
	private Class276 aClass276_31;

	@OriginalMember(owner = "client!gu", name = "H", descriptor = "Lclient!wea;")
	private final Class370 aClass370_2;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
	private final int anInt4499;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "Lclient!dm;")
	private final Class65 aClass65_1;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "[B")
	private final byte[] aByteArray39;

	@OriginalMember(owner = "client!gu", name = "N", descriptor = "Z")
	private final boolean aBoolean381;

	@OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
	private final int anInt4509;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "Lclient!he;")
	private final Class126 aClass126_3;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Lclient!dq;")
	private Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILclient!wea;Lclient!wea;Lclient!dm;Lclient!he;I[BIZ)V")
	public Class120_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class370 arg1, @OriginalArg(2) Class370 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) Class126 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt4491 = arg0;
		this.aClass370_1 = arg1;
		if (this.aClass370_1 == null) {
			this.aBoolean380 = false;
		} else {
			this.aBoolean380 = true;
			this.aClass276_31 = new Class276();
		}
		this.aClass370_2 = arg2;
		this.anInt4499 = arg5;
		this.aClass65_1 = arg3;
		this.aByteArray39 = arg6;
		this.aBoolean381 = arg8;
		this.anInt4509 = arg7;
		this.aClass126_3 = arg4;
		if (this.aClass370_2 != null) {
			this.aClass3_Sub1_Sub3_1 = this.aClass126_3.method3959(this.anInt4491, this.aClass370_2);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)Lclient!dq;")
	private Class3_Sub1_Sub3 method3833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub1_Sub3 local13 = (Class3_Sub1_Sub3) this.aClass307_25.method7424((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean829 && local13.aBoolean830) {
			local13.method8671();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass370_1 == null || this.aByteArray40[arg0] == -1) {
					if (this.aClass65_1.method2523()) {
						return null;
					}
					local13 = this.aClass65_1.method2529(arg0, (byte) 2, true, this.anInt4491);
				} else {
					local13 = this.aClass126_3.method3959(arg0, this.aClass370_1);
				}
			} else if (arg1 == 1) {
				if (this.aClass370_1 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass126_3.method3953(arg0, this.aClass370_1);
			} else if (arg1 == 2) {
				if (this.aClass370_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray40[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass65_1.method2518()) {
					return null;
				}
				local13 = this.aClass65_1.method2529(arg0, (byte) 2, false, this.anInt4491);
			} else {
				throw new RuntimeException();
			}
			this.aClass307_25.method7425((long) arg0, local13);
		}
		if (local13.aBoolean830) {
			return null;
		}
		@Pc(154) byte[] local154 = local13.method8168();
		@Pc(183) int local183;
		@Pc(210) byte[] local210;
		@Pc(219) byte[] local219;
		@Pc(221) int local221;
		@Pc(273) Class3_Sub1_Sub3_Sub1 local273;
		if (!(local13 instanceof Class3_Sub1_Sub3_Sub2)) {
			try {
				if (local154 == null || local154.length <= 2) {
					throw new RuntimeException();
				}
				Static172.aCRC32_1.reset();
				Static172.aCRC32_1.update(local154, 0, local154.length - 2);
				local183 = (int) Static172.aCRC32_1.getValue();
				if (this.aClass241_1.anIntArray461[arg0] != local183) {
					throw new RuntimeException();
				}
				if (this.aClass241_1.aByteArrayArray15 != null && this.aClass241_1.aByteArrayArray15[arg0] != null) {
					local210 = this.aClass241_1.aByteArrayArray15[arg0];
					local219 = Static341.method5638(0, local154.length - 2, local154);
					for (local221 = 0; local221 < 64; local221++) {
						if (local210[local221] != local219[local221]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass65_1.anInt2591 = 0;
				this.aClass65_1.anInt2592 = 0;
			} catch (@Pc(248) RuntimeException local248) {
				this.aClass65_1.method2516();
				local13.method8671();
				if (local13.aBoolean829 && !this.aClass65_1.method2523()) {
					local273 = this.aClass65_1.method2529(arg0, (byte) 2, true, this.anInt4491);
					this.aClass307_25.method7425((long) arg0, local273);
				}
				return null;
			}
			local154[local154.length - 2] = (byte) (this.aClass241_1.anIntArray460[arg0] >>> 8);
			local154[local154.length - 1] = (byte) this.aClass241_1.anIntArray460[arg0];
			if (this.aClass370_1 != null) {
				this.aClass126_3.method3957(arg0, local154, this.aClass370_1);
				if (this.aByteArray40[arg0] != 1) {
					this.anInt4496++;
					this.aByteArray40[arg0] = 1;
				}
			}
			if (!local13.aBoolean829) {
				local13.method8671();
			}
			return local13;
		}
		try {
			if (local154 == null || local154.length <= 2) {
				throw new RuntimeException();
			}
			Static172.aCRC32_1.reset();
			Static172.aCRC32_1.update(local154, 0, local154.length - 2);
			local183 = (int) Static172.aCRC32_1.getValue();
			if (local183 != this.aClass241_1.anIntArray461[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass241_1.aByteArrayArray15 != null && this.aClass241_1.aByteArrayArray15[arg0] != null) {
				local210 = this.aClass241_1.aByteArrayArray15[arg0];
				local219 = Static341.method5638(0, local154.length - 2, local154);
				for (local221 = 0; local221 < 64; local221++) {
					if (local210[local221] != local219[local221]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(448) int local448 = (local154[local154.length - 1] & 0xFF) + ((local154[local154.length - 2] & 0xFF) << 8);
			if ((this.aClass241_1.anIntArray460[arg0] & 0xFFFF) != local448) {
				throw new RuntimeException();
			}
			if (this.aByteArray40[arg0] != 1) {
				this.anInt4496++;
				this.aByteArray40[arg0] = 1;
			}
			if (!local13.aBoolean829) {
				local13.method8671();
			}
			return local13;
		} catch (@Pc(491) Exception local491) {
			this.aByteArray40[arg0] = -1;
			local13.method8671();
			if (local13.aBoolean829 && !this.aClass65_1.method2523()) {
				local273 = this.aClass65_1.method2529(arg0, (byte) 2, true, this.anInt4491);
				this.aClass307_25.method7425((long) arg0, local273);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
	public int method3834() {
		return this.aClass241_1 == null ? 0 : this.aClass241_1.anInt7443;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	public void method3837() {
		if (this.aClass276_31 != null) {
			if (this.method3827() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class3 local23;
			@Pc(29) int local29;
			@Pc(113) Class3 local113;
			if (this.aBoolean380) {
				local18 = true;
				for (local23 = this.aClass276_31.method6907(); local23 != null; local23 = this.aClass276_31.method6912()) {
					local29 = (int) local23.aLong277;
					if (this.aByteArray40[local29] == 0) {
						this.method3833(local29, 1);
					}
					if (this.aByteArray40[local29] == 0) {
						local18 = false;
					} else {
						local23.method8671();
					}
				}
				while (this.anInt4511 < this.aClass241_1.anIntArray458.length) {
					if (this.aClass241_1.anIntArray458[this.anInt4511] == 0) {
						this.anInt4511++;
					} else {
						if (this.aClass126_3.anInt4722 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray40[this.anInt4511] == 0) {
							this.method3833(this.anInt4511, 1);
						}
						if (this.aByteArray40[this.anInt4511] == 0) {
							local113 = new Class3();
							local113.aLong277 = this.anInt4511;
							this.aClass276_31.method6906(local113);
							local18 = false;
						}
						this.anInt4511++;
					}
				}
				if (local18) {
					this.aBoolean380 = false;
					this.anInt4511 = 0;
				}
			} else if (this.aBoolean379) {
				local18 = true;
				for (local23 = this.aClass276_31.method6907(); local23 != null; local23 = this.aClass276_31.method6912()) {
					local29 = (int) local23.aLong277;
					if (this.aByteArray40[local29] != 1) {
						this.method3833(local29, 2);
					}
					if (this.aByteArray40[local29] == 1) {
						local23.method8671();
					} else {
						local18 = false;
					}
				}
				while (this.anInt4511 < this.aClass241_1.anIntArray458.length) {
					if (this.aClass241_1.anIntArray458[this.anInt4511] == 0) {
						this.anInt4511++;
					} else {
						if (this.aClass65_1.method2518()) {
							local18 = false;
							break;
						}
						if (this.aByteArray40[this.anInt4511] != 1) {
							this.method3833(this.anInt4511, 2);
						}
						if (this.aByteArray40[this.anInt4511] != 1) {
							local113 = new Class3();
							local113.aLong277 = this.anInt4511;
							this.aClass276_31.method6906(local113);
							local18 = false;
						}
						this.anInt4511++;
					}
				}
				if (local18) {
					this.anInt4511 = 0;
					this.aBoolean379 = false;
				}
			} else {
				this.aClass276_31 = null;
			}
		}
		if (!this.aBoolean381 || this.aLong95 > Static444.method6719()) {
			return;
		}
		for (@Pc(317) Class3_Sub1_Sub3 local317 = (Class3_Sub1_Sub3) this.aClass307_25.method7421(); local317 != null; local317 = (Class3_Sub1_Sub3) this.aClass307_25.method7428()) {
			if (!local317.aBoolean830) {
				if (local317.aBoolean828) {
					if (!local317.aBoolean829) {
						throw new RuntimeException();
					}
					local317.method8671();
				} else {
					local317.aBoolean828 = true;
				}
			}
		}
		this.aLong95 = Static444.method6719() + 1000L;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)I")
	public int method3838() {
		if (this.aClass241_1 == null) {
			return 0;
		} else if (this.aBoolean380) {
			@Pc(25) Class3 local25 = this.aClass276_31.method6907();
			return local25 == null ? 0 : (int) local25.aLong277;
		} else {
			return this.aClass241_1.anInt7443;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Lclient!oba;")
	@Override
	public Class241 method3827() {
		if (this.aClass241_1 != null) {
			return this.aClass241_1;
		}
		if (this.aClass3_Sub1_Sub3_1 == null) {
			if (this.aClass65_1.method2523()) {
				return null;
			}
			this.aClass3_Sub1_Sub3_1 = this.aClass65_1.method2529(this.anInt4491, (byte) 0, true, 255);
		}
		if (this.aClass3_Sub1_Sub3_1.aBoolean830) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass3_Sub1_Sub3_1.method8168();
		if (this.aClass3_Sub1_Sub3_1 instanceof Class3_Sub1_Sub3_Sub2) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass241_1 = new Class241(local49, this.anInt4499, this.aByteArray39);
				if (this.anInt4509 != this.aClass241_1.anInt7442) {
					throw new RuntimeException();
				}
			} catch (@Pc(84) RuntimeException local84) {
				this.aClass241_1 = null;
				if (this.aClass65_1.method2523()) {
					this.aClass3_Sub1_Sub3_1 = null;
				} else {
					this.aClass3_Sub1_Sub3_1 = this.aClass65_1.method2529(this.anInt4491, (byte) 0, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass241_1 = new Class241(local49, this.anInt4499, this.aByteArray39);
			} catch (@Pc(128) RuntimeException local128) {
				this.aClass65_1.method2516();
				this.aClass241_1 = null;
				if (this.aClass65_1.method2523()) {
					this.aClass3_Sub1_Sub3_1 = null;
				} else {
					this.aClass3_Sub1_Sub3_1 = this.aClass65_1.method2529(this.anInt4491, (byte) 0, true, 255);
				}
				return null;
			}
			if (this.aClass370_2 != null) {
				this.aClass126_3.method3957(this.anInt4491, local49, this.aClass370_2);
			}
		}
		if (this.aClass370_1 != null) {
			this.aByteArray40 = new byte[this.aClass241_1.anInt7448];
			this.anInt4496 = 0;
		}
		this.aClass3_Sub1_Sub3_1 = null;
		return this.aClass241_1;
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
	public void method3839() {
		if (this.aClass370_1 != null) {
			this.aBoolean379 = true;
			if (this.aClass276_31 == null) {
				this.aClass276_31 = new Class276();
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I")
	public int method3840() {
		if (this.method3827() == null) {
			return this.aClass3_Sub1_Sub3_1 == null ? 0 : this.aClass3_Sub1_Sub3_1.method8170();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)I")
	@Override
	public int method3830(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub1_Sub3 local11 = (Class3_Sub1_Sub3) this.aClass307_25.method7424((long) arg0);
		return local11 == null ? 0 : local11.method8170();
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)I")
	public int method3841() {
		return this.anInt4496;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	@Override
	public void method3829(@OriginalArg(1) int arg0) {
		if (this.aClass370_1 == null) {
			return;
		}
		for (@Pc(18) Class3 local18 = this.aClass276_30.method6907(); local18 != null; local18 = this.aClass276_30.method6912()) {
			if (local18.aLong277 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class3 local38 = new Class3();
		local38.aLong277 = arg0;
		this.aClass276_30.method6906(local38);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(IB)[B")
	@Override
	public byte[] method3831(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub1_Sub3 local17 = this.method3833(arg0, 0);
		if (local17 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local17.method8168();
			local17.method8671();
			return local25;
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V")
	public void method3843() {
		if (this.aClass276_31 == null || this.method3827() == null) {
			return;
		}
		for (@Pc(23) Class3 local23 = this.aClass276_30.method6907(); local23 != null; local23 = this.aClass276_30.method6912()) {
			@Pc(29) int local29 = (int) local23.aLong277;
			if (local29 < 0 || local29 >= this.aClass241_1.anInt7448 || this.aClass241_1.anIntArray458[local29] == 0) {
				local23.method8671();
			} else {
				if (this.aByteArray40[local29] == 0) {
					this.method3833(local29, 1);
				}
				if (this.aByteArray40[local29] == -1) {
					this.method3833(local29, 2);
				}
				if (this.aByteArray40[local29] == 1) {
					local23.method8671();
				}
			}
		}
	}
}
