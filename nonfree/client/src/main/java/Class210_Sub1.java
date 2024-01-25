import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class210_Sub1 extends Class210 {

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "Lclient!hq;")
	private Class137 aClass137_1;

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!mn", name = "K", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
	private int anInt6713 = 0;

	@OriginalMember(owner = "client!mn", name = "H", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_24 = new Class253(16);

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
	private int anInt6727 = 0;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "Lclient!bq;")
	private final Class43 aClass43_38 = new Class43();

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "J")
	private long aLong169 = 0L;

	@OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
	private final int anInt6726;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "Lclient!rfa;")
	private final Class291 aClass291_2;

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "Lclient!bq;")
	private Class43 aClass43_37;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
	private final int anInt6715;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Lclient!gd;")
	private final Class113 aClass113_2;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "Lclient!rfa;")
	private final Class291 aClass291_3;

	@OriginalMember(owner = "client!mn", name = "O", descriptor = "Z")
	private final boolean aBoolean468;

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!oj;")
	private final Class239 aClass239_2;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
	private final int anInt6709;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "Lclient!nq;")
	private Class8_Sub5_Sub13 aClass8_Sub5_Sub13_1;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(ILclient!rfa;Lclient!rfa;Lclient!gd;Lclient!oj;I[BIZ)V")
	public Class210_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) Class291 arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class239 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt6726 = arg0;
		this.aClass291_2 = arg1;
		if (this.aClass291_2 == null) {
			this.aBoolean467 = false;
		} else {
			this.aBoolean467 = true;
			this.aClass43_37 = new Class43();
		}
		this.anInt6715 = arg7;
		this.aClass113_2 = arg3;
		this.aClass291_3 = arg2;
		this.aBoolean468 = arg8;
		this.aClass239_2 = arg4;
		this.aByteArray49 = arg6;
		this.anInt6709 = arg5;
		if (this.aClass291_3 != null) {
			this.aClass8_Sub5_Sub13_1 = this.aClass239_2.method6344(this.anInt6726, this.aClass291_3);
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I")
	public int method5507() {
		if (this.method5501() == null) {
			return this.aClass8_Sub5_Sub13_1 == null ? 0 : this.aClass8_Sub5_Sub13_1.method7304();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)I")
	public int method5508() {
		return this.aClass137_1 == null ? 0 : this.aClass137_1.anInt4971;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V")
	public void method5509() {
		if (this.aClass43_37 != null) {
			if (this.method5501() == null) {
				return;
			}
			@Pc(24) boolean local24;
			@Pc(29) Class8 local29;
			@Pc(35) int local35;
			@Pc(120) Class8 local120;
			if (this.aBoolean467) {
				local24 = true;
				for (local29 = this.aClass43_37.method1422(); local29 != null; local29 = this.aClass43_37.method1426()) {
					local35 = (int) local29.aLong285;
					if (this.aByteArray50[local35] == 0) {
						this.method5513(local35, 1);
					}
					if (this.aByteArray50[local35] == 0) {
						local24 = false;
					} else {
						local29.method8640();
					}
				}
				while (this.anInt6727 < this.aClass137_1.anIntArray266.length) {
					if (this.aClass137_1.anIntArray266[this.anInt6727] == 0) {
						this.anInt6727++;
					} else {
						if (this.aClass239_2.anInt7671 >= 250) {
							local24 = false;
							break;
						}
						if (this.aByteArray50[this.anInt6727] == 0) {
							this.method5513(this.anInt6727, 1);
						}
						if (this.aByteArray50[this.anInt6727] == 0) {
							local120 = new Class8();
							local120.aLong285 = this.anInt6727;
							this.aClass43_37.method1424(local120);
							local24 = false;
						}
						this.anInt6727++;
					}
				}
				if (local24) {
					this.aBoolean467 = false;
					this.anInt6727 = 0;
				}
			} else if (this.aBoolean466) {
				local24 = true;
				for (local29 = this.aClass43_37.method1422(); local29 != null; local29 = this.aClass43_37.method1426()) {
					local35 = (int) local29.aLong285;
					if (this.aByteArray50[local35] != 1) {
						this.method5513(local35, 2);
					}
					if (this.aByteArray50[local35] == 1) {
						local29.method8640();
					} else {
						local24 = false;
					}
				}
				while (this.anInt6727 < this.aClass137_1.anIntArray266.length) {
					if (this.aClass137_1.anIntArray266[this.anInt6727] == 0) {
						this.anInt6727++;
					} else {
						if (this.aClass113_2.method3347()) {
							local24 = false;
							break;
						}
						if (this.aByteArray50[this.anInt6727] != 1) {
							this.method5513(this.anInt6727, 2);
						}
						if (this.aByteArray50[this.anInt6727] != 1) {
							local120 = new Class8();
							local120.aLong285 = this.anInt6727;
							this.aClass43_37.method1424(local120);
							local24 = false;
						}
						this.anInt6727++;
					}
				}
				if (local24) {
					this.anInt6727 = 0;
					this.aBoolean466 = false;
				}
			} else {
				this.aClass43_37 = null;
			}
		}
		if (!this.aBoolean468 || this.aLong169 > Static342.method5463()) {
			return;
		}
		for (@Pc(314) Class8_Sub5_Sub13 local314 = (Class8_Sub5_Sub13) this.aClass253_24.method6593(); local314 != null; local314 = (Class8_Sub5_Sub13) this.aClass253_24.method6595()) {
			if (!local314.aBoolean624) {
				if (local314.aBoolean625) {
					if (!local314.aBoolean623) {
						throw new RuntimeException();
					}
					local314.method8640();
				} else {
					local314.aBoolean625 = true;
				}
			}
		}
		this.aLong169 = Static342.method5463() + 1000L;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)I")
	public int method5512() {
		if (this.aClass137_1 == null) {
			return 0;
		} else if (this.aBoolean467) {
			@Pc(22) Class8 local22 = this.aClass43_37.method1422();
			return local22 == null ? 0 : (int) local22.aLong285;
		} else {
			return this.aClass137_1.anInt4971;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)Lclient!nq;")
	private Class8_Sub5_Sub13 method5513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class8_Sub5_Sub13 local17 = (Class8_Sub5_Sub13) this.aClass253_24.method6594((long) arg0);
		if (local17 != null && arg1 == 0 && !local17.aBoolean623 && local17.aBoolean624) {
			local17.method8640();
			local17 = null;
		}
		if (local17 == null) {
			if (arg1 == 0) {
				if (this.aClass291_2 == null || this.aByteArray50[arg0] == -1) {
					if (this.aClass113_2.method3339()) {
						return null;
					}
					local17 = this.aClass113_2.method3335(this.anInt6726, (byte) 2, arg0, true);
				} else {
					local17 = this.aClass239_2.method6344(arg0, this.aClass291_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass291_2 == null) {
					throw new RuntimeException();
				}
				local17 = this.aClass239_2.method6349(this.aClass291_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass291_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray50[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass113_2.method3347()) {
					return null;
				}
				local17 = this.aClass113_2.method3335(this.anInt6726, (byte) 2, arg0, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass253_24.method6591(local17, (long) arg0);
		}
		if (local17.aBoolean624) {
			return null;
		}
		@Pc(166) byte[] local166 = local17.method7301();
		@Pc(193) int local193;
		@Pc(224) byte[] local224;
		@Pc(233) byte[] local233;
		@Pc(235) int local235;
		@Pc(343) Class8_Sub5_Sub13_Sub1 local343;
		if (!(local17 instanceof Class8_Sub5_Sub13_Sub2)) {
			try {
				label157: {
					if (local166 != null && local166.length > 2) {
						Static295.aCRC32_1.reset();
						Static295.aCRC32_1.update(local166, 0, local166.length - 2);
						local193 = (int) Static295.aCRC32_1.getValue();
						if (this.aClass137_1.anIntArray268[arg0] != local193) {
							throw new RuntimeException();
						}
						if (this.aClass137_1.aByteArrayArray79 == null || this.aClass137_1.aByteArrayArray79[arg0] == null) {
							break label157;
						}
						local224 = this.aClass137_1.aByteArrayArray79[arg0];
						local233 = Static212.method4042(0, local166.length - 2, local166);
						local235 = 0;
						while (true) {
							if (local235 >= 64) {
								break label157;
							}
							if (local233[local235] != local224[local235]) {
								throw new RuntimeException();
							}
							local235++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass113_2.anInt4112 = 0;
				this.aClass113_2.anInt4113 = 0;
			} catch (@Pc(443) RuntimeException local443) {
				this.aClass113_2.method3332();
				local17.method8640();
				if (local17.aBoolean623 && !this.aClass113_2.method3339()) {
					local343 = this.aClass113_2.method3335(this.anInt6726, (byte) 2, arg0, true);
					this.aClass253_24.method6591(local343, (long) arg0);
				}
				return null;
			}
			local166[local166.length - 2] = (byte) (this.aClass137_1.anIntArray267[arg0] >>> 8);
			local166[local166.length - 1] = (byte) this.aClass137_1.anIntArray267[arg0];
			if (this.aClass291_2 != null) {
				this.aClass239_2.method6345(arg0, local166, this.aClass291_2);
				if (this.aByteArray50[arg0] != 1) {
					this.anInt6713++;
					this.aByteArray50[arg0] = 1;
				}
			}
			if (!local17.aBoolean623) {
				local17.method8640();
			}
			return local17;
		}
		try {
			if (local166 == null || local166.length <= 2) {
				throw new RuntimeException();
			}
			Static295.aCRC32_1.reset();
			Static295.aCRC32_1.update(local166, 0, local166.length - 2);
			local193 = (int) Static295.aCRC32_1.getValue();
			if (this.aClass137_1.anIntArray268[arg0] != local193) {
				throw new RuntimeException();
			}
			if (this.aClass137_1.aByteArrayArray79 != null && this.aClass137_1.aByteArrayArray79[arg0] != null) {
				local224 = this.aClass137_1.aByteArrayArray79[arg0];
				local233 = Static212.method4042(0, local166.length - 2, local166);
				for (local235 = 0; local235 < 64; local235++) {
					if (local224[local235] != local233[local235]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(276) int local276 = ((local166[local166.length - 2] & 0xFF) << 8) + (local166[local166.length - 1] & 0xFF);
			if ((this.aClass137_1.anIntArray267[arg0] & 0xFFFF) != local276) {
				throw new RuntimeException();
			}
			if (this.aByteArray50[arg0] != 1) {
				this.anInt6713++;
				this.aByteArray50[arg0] = 1;
			}
			if (!local17.aBoolean623) {
				local17.method8640();
			}
			return local17;
		} catch (@Pc(317) Exception local317) {
			this.aByteArray50[arg0] = -1;
			local17.method8640();
			if (local17.aBoolean623 && !this.aClass113_2.method3339()) {
				local343 = this.aClass113_2.method3335(this.anInt6726, (byte) 2, arg0, true);
				this.aClass253_24.method6591(local343, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)Lclient!hq;")
	@Override
	public Class137 method5501() {
		if (this.aClass137_1 != null) {
			return this.aClass137_1;
		}
		if (this.aClass8_Sub5_Sub13_1 == null) {
			if (this.aClass113_2.method3339()) {
				return null;
			}
			this.aClass8_Sub5_Sub13_1 = this.aClass113_2.method3335(255, (byte) 0, this.anInt6726, true);
		}
		if (this.aClass8_Sub5_Sub13_1.aBoolean624) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass8_Sub5_Sub13_1.method7301();
		if (this.aClass8_Sub5_Sub13_1 instanceof Class8_Sub5_Sub13_Sub2) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass137_1 = new Class137(local49, this.anInt6709, this.aByteArray49);
				if (this.aClass137_1.anInt4969 != this.anInt6715) {
					throw new RuntimeException();
				}
			} catch (@Pc(147) RuntimeException local147) {
				this.aClass137_1 = null;
				if (this.aClass113_2.method3339()) {
					this.aClass8_Sub5_Sub13_1 = null;
				} else {
					this.aClass8_Sub5_Sub13_1 = this.aClass113_2.method3335(255, (byte) 0, this.anInt6726, true);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass137_1 = new Class137(local49, this.anInt6709, this.aByteArray49);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass113_2.method3332();
				this.aClass137_1 = null;
				if (this.aClass113_2.method3339()) {
					this.aClass8_Sub5_Sub13_1 = null;
				} else {
					this.aClass8_Sub5_Sub13_1 = this.aClass113_2.method3335(255, (byte) 0, this.anInt6726, true);
				}
				return null;
			}
			if (this.aClass291_3 != null) {
				this.aClass239_2.method6345(this.anInt6726, local49, this.aClass291_3);
			}
		}
		if (this.aClass291_2 != null) {
			this.anInt6713 = 0;
			this.aByteArray50 = new byte[this.aClass137_1.anInt4973];
		}
		this.aClass8_Sub5_Sub13_1 = null;
		return this.aClass137_1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)I")
	@Override
	public int method5502(@OriginalArg(0) int arg0) {
		@Pc(17) Class8_Sub5_Sub13 local17 = (Class8_Sub5_Sub13) this.aClass253_24.method6594((long) arg0);
		return local17 == null ? 0 : local17.method7304();
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)V")
	public void method5516() {
		if (this.aClass43_37 == null || this.method5501() == null) {
			return;
		}
		for (@Pc(19) Class8 local19 = this.aClass43_38.method1422(); local19 != null; local19 = this.aClass43_38.method1426()) {
			@Pc(25) int local25 = (int) local19.aLong285;
			if (local25 < 0 || local25 >= this.aClass137_1.anInt4973 || this.aClass137_1.anIntArray266[local25] == 0) {
				local19.method8640();
			} else {
				if (this.aByteArray50[local25] == 0) {
					this.method5513(local25, 1);
				}
				if (this.aByteArray50[local25] == -1) {
					this.method5513(local25, 2);
				}
				if (this.aByteArray50[local25] == 1) {
					local19.method8640();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method5503(@OriginalArg(1) int arg0) {
		@Pc(16) Class8_Sub5_Sub13 local16 = this.method5513(arg0, 0);
		if (local16 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local16.method7301();
			local16.method8640();
			return local24;
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(IB)V")
	@Override
	public void method5506(@OriginalArg(0) int arg0) {
		if (this.aClass291_2 == null) {
			return;
		}
		for (@Pc(14) Class8 local14 = this.aClass43_38.method1422(); local14 != null; local14 = this.aClass43_38.method1426()) {
			if ((long) arg0 == local14.aLong285) {
				return;
			}
		}
		@Pc(42) Class8 local42 = new Class8();
		local42.aLong285 = arg0;
		this.aClass43_38.method1424(local42);
	}

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)V")
	public void method5517() {
		if (this.aClass291_2 != null) {
			this.aBoolean466 = true;
			if (this.aClass43_37 == null) {
				this.aClass43_37 = new Class43();
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "(I)I")
	public int method5518() {
		return this.anInt6713;
	}
}
