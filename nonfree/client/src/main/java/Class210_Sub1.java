import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class210_Sub1 extends Class210 {

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!lda", name = "w", descriptor = "Lclient!oia;")
	private Class265 aClass265_1;

	@OriginalMember(owner = "client!lda", name = "E", descriptor = "Z")
	private boolean aBoolean544;

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
	private int anInt6193 = 0;

	@OriginalMember(owner = "client!lda", name = "r", descriptor = "Lclient!rda;")
	private final Class300 aClass300_27 = new Class300(16);

	@OriginalMember(owner = "client!lda", name = "J", descriptor = "I")
	private int anInt6201 = 0;

	@OriginalMember(owner = "client!lda", name = "F", descriptor = "Lclient!fca;")
	private final Class114 aClass114_43 = new Class114();

	@OriginalMember(owner = "client!lda", name = "K", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!lda", name = "z", descriptor = "Lclient!cr;")
	private final Class71 aClass71_3;

	@OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
	private final int anInt6198;

	@OriginalMember(owner = "client!lda", name = "G", descriptor = "Z")
	private boolean aBoolean545;

	@OriginalMember(owner = "client!lda", name = "I", descriptor = "Lclient!fca;")
	private Class114 aClass114_44;

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "Lclient!hh;")
	private final Class147 aClass147_1;

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "Lclient!cr;")
	private final Class71 aClass71_2;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "[B")
	private final byte[] aByteArray51;

	@OriginalMember(owner = "client!lda", name = "t", descriptor = "Lclient!qv;")
	private final Class296 aClass296_1;

	@OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
	private final int anInt6199;

	@OriginalMember(owner = "client!lda", name = "L", descriptor = "Z")
	private final boolean aBoolean546;

	@OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
	private final int anInt6196;

	@OriginalMember(owner = "client!lda", name = "A", descriptor = "Lclient!np;")
	private Class5_Sub3_Sub11 aClass5_Sub3_Sub11_1;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(ILclient!cr;Lclient!cr;Lclient!qv;Lclient!hh;I[BIZ)V")
	public Class210_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class296 arg3, @OriginalArg(4) Class147 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass71_3 = arg1;
		this.anInt6198 = arg0;
		if (this.aClass71_3 == null) {
			this.aBoolean545 = false;
		} else {
			this.aBoolean545 = true;
			this.aClass114_44 = new Class114();
		}
		this.aClass147_1 = arg4;
		this.aClass71_2 = arg2;
		this.aByteArray51 = arg6;
		this.aClass296_1 = arg3;
		this.anInt6199 = arg7;
		this.aBoolean546 = arg8;
		this.anInt6196 = arg5;
		if (this.aClass71_2 != null) {
			this.aClass5_Sub3_Sub11_1 = this.aClass147_1.method3557(this.anInt6198, this.aClass71_2);
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)I")
	public int method5147() {
		if (this.aClass265_1 == null) {
			return 0;
		} else if (this.aBoolean545) {
			@Pc(20) Class5 local20 = this.aClass114_44.method2805();
			return local20 == null ? 0 : (int) local20.aLong307;
		} else {
			return this.aClass265_1.anInt7448;
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V")
	public void method5148() {
		if (this.aClass114_44 != null) {
			if (this.method5142() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class5 local30;
			@Pc(36) int local36;
			@Pc(125) Class5 local125;
			if (this.aBoolean545) {
				local25 = true;
				for (local30 = this.aClass114_44.method2805(); local30 != null; local30 = this.aClass114_44.method2814()) {
					local36 = (int) local30.aLong307;
					if (this.aByteArray52[local36] == 0) {
						this.method5155(local36, 1);
					}
					if (this.aByteArray52[local36] == 0) {
						local25 = false;
					} else {
						local30.method9052();
					}
				}
				while (this.anInt6201 < this.aClass265_1.anIntArray424.length) {
					if (this.aClass265_1.anIntArray424[this.anInt6201] == 0) {
						this.anInt6201++;
					} else {
						if (this.aClass147_1.anInt4196 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray52[this.anInt6201] == 0) {
							this.method5155(this.anInt6201, 1);
						}
						if (this.aByteArray52[this.anInt6201] == 0) {
							local125 = new Class5();
							local125.aLong307 = (long) this.anInt6201;
							local25 = false;
							this.aClass114_44.method2807(local125);
						}
						this.anInt6201++;
					}
				}
				if (local25) {
					this.aBoolean545 = false;
					this.anInt6201 = 0;
				}
			} else if (this.aBoolean544) {
				local25 = true;
				for (local30 = this.aClass114_44.method2805(); local30 != null; local30 = this.aClass114_44.method2814()) {
					local36 = (int) local30.aLong307;
					if (this.aByteArray52[local36] != 1) {
						this.method5155(local36, 2);
					}
					if (this.aByteArray52[local36] == 1) {
						local30.method9052();
					} else {
						local25 = false;
					}
				}
				while (this.aClass265_1.anIntArray424.length > this.anInt6201) {
					if (this.aClass265_1.anIntArray424[this.anInt6201] == 0) {
						this.anInt6201++;
					} else {
						if (this.aClass296_1.method7101()) {
							local25 = false;
							break;
						}
						if (this.aByteArray52[this.anInt6201] != 1) {
							this.method5155(this.anInt6201, 2);
						}
						if (this.aByteArray52[this.anInt6201] != 1) {
							local125 = new Class5();
							local125.aLong307 = (long) this.anInt6201;
							local25 = false;
							this.aClass114_44.method2807(local125);
						}
						this.anInt6201++;
					}
				}
				if (local25) {
					this.anInt6201 = 0;
					this.aBoolean544 = false;
				}
			} else {
				this.aClass114_44 = null;
			}
		}
		if (!this.aBoolean546 || this.aLong161 > Static547.method7619()) {
			return;
		}
		for (@Pc(323) Class5_Sub3_Sub11 local323 = (Class5_Sub3_Sub11) this.aClass300_27.method7182(); local323 != null; local323 = (Class5_Sub3_Sub11) this.aClass300_27.method7192()) {
			if (!local323.aBoolean664) {
				if (local323.aBoolean665) {
					if (!local323.aBoolean663) {
						throw new RuntimeException();
					}
					local323.method9052();
				} else {
					local323.aBoolean665 = true;
				}
			}
		}
		this.aLong161 = Static547.method7619() + 1000L;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Lclient!oia;")
	@Override
	public Class265 method5142() {
		if (this.aClass265_1 != null) {
			return this.aClass265_1;
		}
		if (this.aClass5_Sub3_Sub11_1 == null) {
			if (this.aClass296_1.method7095()) {
				return null;
			}
			this.aClass5_Sub3_Sub11_1 = this.aClass296_1.method7094(true, this.anInt6198, (byte) 0, 255);
		}
		if (this.aClass5_Sub3_Sub11_1.aBoolean664) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass5_Sub3_Sub11_1.method6567();
		if (this.aClass5_Sub3_Sub11_1 instanceof Class5_Sub3_Sub11_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass265_1 = new Class265(local48, this.anInt6196, this.aByteArray51);
				if (this.aClass265_1.anInt7447 != this.anInt6199) {
					throw new RuntimeException();
				}
			} catch (@Pc(142) RuntimeException local142) {
				this.aClass265_1 = null;
				if (this.aClass296_1.method7095()) {
					this.aClass5_Sub3_Sub11_1 = null;
				} else {
					this.aClass5_Sub3_Sub11_1 = this.aClass296_1.method7094(true, this.anInt6198, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass265_1 = new Class265(local48, this.anInt6196, this.aByteArray51);
			} catch (@Pc(70) RuntimeException local70) {
				this.aClass296_1.method7099();
				this.aClass265_1 = null;
				if (this.aClass296_1.method7095()) {
					this.aClass5_Sub3_Sub11_1 = null;
				} else {
					this.aClass5_Sub3_Sub11_1 = this.aClass296_1.method7094(true, this.anInt6198, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass71_2 != null) {
				this.aClass147_1.method3556(this.aClass71_2, this.anInt6198, local48);
			}
		}
		this.aClass5_Sub3_Sub11_1 = null;
		if (this.aClass71_3 != null) {
			this.anInt6193 = 0;
			this.aByteArray52 = new byte[this.aClass265_1.anInt7442];
		}
		return this.aClass265_1;
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(B)I")
	public int method5149() {
		if (this.method5142() == null) {
			return this.aClass5_Sub3_Sub11_1 == null ? 0 : this.aClass5_Sub3_Sub11_1.method6565();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method5144(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub3_Sub11 local11 = this.method5155(arg0, 0);
		if (local11 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local11.method6567();
			local11.method9052();
			return local24;
		}
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(B)V")
	public void method5150() {
		if (this.aClass114_44 == null || this.method5142() == null) {
			return;
		}
		for (@Pc(19) Class5 local19 = this.aClass114_43.method2805(); local19 != null; local19 = this.aClass114_43.method2814()) {
			@Pc(31) int local31 = (int) local19.aLong307;
			if (local31 < 0 || this.aClass265_1.anInt7442 <= local31 || this.aClass265_1.anIntArray424[local31] == 0) {
				local19.method9052();
			} else {
				if (this.aByteArray52[local31] == 0) {
					this.method5155(local31, 1);
				}
				if (this.aByteArray52[local31] == -1) {
					this.method5155(local31, 2);
				}
				if (this.aByteArray52[local31] == 1) {
					local19.method9052();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BI)V")
	@Override
	public void method5146(@OriginalArg(1) int arg0) {
		if (this.aClass71_3 == null) {
			return;
		}
		for (@Pc(21) Class5 local21 = this.aClass114_43.method2805(); local21 != null; local21 = this.aClass114_43.method2814()) {
			if ((long) arg0 == local21.aLong307) {
				return;
			}
		}
		@Pc(41) Class5 local41 = new Class5();
		local41.aLong307 = (long) arg0;
		this.aClass114_43.method2807(local41);
	}

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "(B)I")
	public int method5151() {
		return this.aClass265_1 == null ? 0 : this.aClass265_1.anInt7448;
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)I")
	public int method5152() {
		return this.anInt6193;
	}

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "(B)V")
	public void method5153() {
		if (this.aClass71_3 != null) {
			this.aBoolean544 = true;
			if (this.aClass114_44 == null) {
				this.aClass114_44 = new Class114();
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)Lclient!np;")
	private Class5_Sub3_Sub11 method5155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub3_Sub11 local13 = (Class5_Sub3_Sub11) this.aClass300_27.method7188((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean663 && local13.aBoolean664) {
			local13.method9052();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass71_3 == null || this.aByteArray52[arg0] == -1) {
					if (this.aClass296_1.method7095()) {
						return null;
					}
					local13 = this.aClass296_1.method7094(true, arg0, (byte) 2, this.anInt6198);
				} else {
					local13 = this.aClass147_1.method3557(arg0, this.aClass71_3);
				}
			} else if (arg1 == 1) {
				if (this.aClass71_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass147_1.method3560(arg0, this.aClass71_3);
			} else if (arg1 == 2) {
				if (this.aClass71_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray52[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass296_1.method7101()) {
					return null;
				}
				local13 = this.aClass296_1.method7094(false, arg0, (byte) 2, this.anInt6198);
			} else {
				throw new RuntimeException();
			}
			this.aClass300_27.method7191(local13, (long) arg0);
		}
		if (local13.aBoolean664) {
			return null;
		}
		@Pc(163) byte[] local163 = local13.method6567();
		@Pc(190) int local190;
		@Pc(217) byte[] local217;
		@Pc(228) byte[] local228;
		@Pc(230) int local230;
		@Pc(334) Class5_Sub3_Sub11_Sub1 local334;
		if (!(local13 instanceof Class5_Sub3_Sub11_Sub2)) {
			try {
				label157: {
					if (local163 != null && local163.length > 2) {
						Static267.aCRC32_1.reset();
						Static267.aCRC32_1.update(local163, 0, local163.length - 2);
						local190 = (int) Static267.aCRC32_1.getValue();
						if (this.aClass265_1.anIntArray421[arg0] != local190) {
							throw new RuntimeException();
						}
						if (this.aClass265_1.aByteArrayArray24 == null || this.aClass265_1.aByteArrayArray24[arg0] == null) {
							break label157;
						}
						local217 = this.aClass265_1.aByteArrayArray24[arg0];
						local228 = Static257.method4017(local163, local163.length - 2, 0);
						local230 = 0;
						while (true) {
							if (local230 >= 64) {
								break label157;
							}
							if (local217[local230] != local228[local230]) {
								throw new RuntimeException();
							}
							local230++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass296_1.anInt8296 = 0;
				this.aClass296_1.anInt8297 = 0;
			} catch (@Pc(446) RuntimeException local446) {
				this.aClass296_1.method7099();
				local13.method9052();
				if (local13.aBoolean663 && !this.aClass296_1.method7095()) {
					local334 = this.aClass296_1.method7094(true, arg0, (byte) 2, this.anInt6198);
					this.aClass300_27.method7191(local334, (long) arg0);
				}
				return null;
			}
			local163[local163.length - 2] = (byte) (this.aClass265_1.anIntArray423[arg0] >>> 8);
			local163[local163.length - 1] = (byte) this.aClass265_1.anIntArray423[arg0];
			if (this.aClass71_3 != null) {
				this.aClass147_1.method3556(this.aClass71_3, arg0, local163);
				if (this.aByteArray52[arg0] != 1) {
					this.anInt6193++;
					this.aByteArray52[arg0] = 1;
				}
			}
			if (!local13.aBoolean663) {
				local13.method9052();
			}
			return local13;
		}
		try {
			if (local163 == null || local163.length <= 2) {
				throw new RuntimeException();
			}
			Static267.aCRC32_1.reset();
			Static267.aCRC32_1.update(local163, 0, local163.length - 2);
			local190 = (int) Static267.aCRC32_1.getValue();
			if (this.aClass265_1.anIntArray421[arg0] != local190) {
				throw new RuntimeException();
			}
			if (this.aClass265_1.aByteArrayArray24 != null && this.aClass265_1.aByteArrayArray24[arg0] != null) {
				local217 = this.aClass265_1.aByteArrayArray24[arg0];
				local228 = Static257.method4017(local163, local163.length - 2, 0);
				for (local230 = 0; local230 < 64; local230++) {
					if (local217[local230] != local228[local230]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(267) int local267 = ((local163[local163.length - 2] & 0xFF) << 8) + (local163[local163.length - 1] & 0xFF);
			if ((this.aClass265_1.anIntArray423[arg0] & 0xFFFF) != local267) {
				throw new RuntimeException();
			}
			if (this.aByteArray52[arg0] != 1) {
				this.anInt6193++;
				this.aByteArray52[arg0] = 1;
			}
			if (!local13.aBoolean663) {
				local13.method9052();
			}
			return local13;
		} catch (@Pc(306) Exception local306) {
			this.aByteArray52[arg0] = -1;
			local13.method9052();
			if (local13.aBoolean663 && !this.aClass296_1.method7095()) {
				local334 = this.aClass296_1.method7094(true, arg0, (byte) 2, this.anInt6198);
				this.aClass300_27.method7191(local334, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(IB)I")
	@Override
	public int method5145(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub3_Sub11 local11 = (Class5_Sub3_Sub11) this.aClass300_27.method7188((long) arg0);
		return local11 == null ? 0 : local11.method6565();
	}
}
