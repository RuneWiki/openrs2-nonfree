import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class243 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	private int anInt6343;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public int anInt6348;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "I")
	public int anInt6352;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	public int anInt6353;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	private int anInt6355;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	public int anInt6358;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	private int anInt6361;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "[I")
	public int[] anIntArray1317;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "I")
	private int anInt6364;

	@OriginalMember(owner = "client!we", name = "G", descriptor = "Lclient!tm;")
	public Class226 aClass226_4;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "Lclient!wk;")
	private Class246 aClass246_33;

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
	public int anInt6373;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	private int anInt6349 = -1;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Z")
	public boolean aBoolean453 = true;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public int anInt6344 = -1;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	private int anInt6346 = -1;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public int anInt6354 = -1;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	public int anInt6357 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	private int anInt6359 = -1;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Z")
	public boolean aBoolean454 = false;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Z")
	public boolean aBoolean452 = true;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "I")
	public int anInt6363 = -1;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	private int anInt6360 = -1;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "I")
	public int anInt6366 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray159 = new String[5];

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	public int anInt6350 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!we", name = "O", descriptor = "I")
	private int anInt6371 = -1;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "I")
	public int anInt6369 = 0;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "I")
	public int anInt6372 = -1;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Z")
	public boolean aBoolean455 = true;

	@OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
	public int anInt6375 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)I")
	public int method5518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass246_33 == null) {
			return arg0;
		} else {
			@Pc(23) Class2_Sub14 local23 = (Class2_Sub14) this.aClass246_33.method5613((long) arg1);
			return local23 == null ? arg0 : local23.anInt1455;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZLclient!vc;)Lclient!rn;")
	public Class18 method5519(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt6363 : this.anInt6344;
		@Pc(23) int local23 = local11 | arg1.anInt2081 << 29;
		@Pc(32) Class18 local32 = (Class18) this.aClass226_4.aClass160_56.method3599((long) local23);
		if (local32 != null) {
			return local32;
		} else if (this.aClass226_4.aClass171_89.method3739(local11)) {
			@Pc(52) Class86 local52 = Static397.method2330(this.aClass226_4.aClass171_89, local11, 0);
			if (local52 != null) {
				local32 = arg1.method2000(local52);
				this.aClass226_4.aClass160_56.method3602((long) local23, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!kk;II)V")
	private void method5521(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6344 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt6363 = arg0.method5312();
		} else if (arg1 == 3) {
			this.aString64 = arg0.method5364();
		} else if (arg1 == 4) {
			this.anInt6373 = arg0.method5356();
		} else if (arg1 == 5) {
			this.anInt6372 = arg0.method5356();
		} else if (arg1 == 6) {
			this.anInt6369 = arg0.method5350();
		} else {
			@Pc(126) int local126;
			if (arg1 == 7) {
				local126 = arg0.method5350();
				if ((local126 & 0x1) == 0) {
					this.aBoolean455 = false;
				}
				if ((local126 & 0x2) == 2) {
					this.aBoolean454 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean453 = arg0.method5350() == 1;
			} else if (arg1 == 9) {
				this.anInt6360 = arg0.method5312();
				if (this.anInt6360 == 65535) {
					this.anInt6360 = -1;
				}
				this.anInt6349 = arg0.method5312();
				if (this.anInt6349 == 65535) {
					this.anInt6349 = -1;
				}
				this.anInt6343 = arg0.method5346();
				this.anInt6361 = arg0.method5346();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray159[arg1 - 10] = arg0.method5364();
			} else {
				@Pc(134) int local134;
				if (arg1 == 15) {
					local126 = arg0.method5350();
					this.anIntArray1317 = new int[local126 * 2];
					for (local134 = 0; local134 < local126 * 2; local134++) {
						this.anIntArray1317[local134] = arg0.method5341();
					}
					this.anInt6348 = arg0.method5346();
					this.anInt6362 = arg0.method5346();
				} else if (arg1 == 16) {
					this.aBoolean452 = false;
				} else if (arg1 == 17) {
					this.aString65 = arg0.method5364();
				} else if (arg1 == 18) {
					this.anInt6371 = arg0.method5312();
				} else if (arg1 == 19) {
					this.anInt6354 = arg0.method5312();
				} else if (arg1 == 20) {
					this.anInt6359 = arg0.method5312();
					if (this.anInt6359 == 65535) {
						this.anInt6359 = -1;
					}
					this.anInt6346 = arg0.method5312();
					if (this.anInt6346 == 65535) {
						this.anInt6346 = -1;
					}
					this.anInt6355 = arg0.method5346();
					this.anInt6364 = arg0.method5346();
				} else if (arg1 == 21) {
					this.anInt6353 = arg0.method5346();
				} else if (arg1 == 22) {
					this.anInt6358 = arg0.method5346();
				} else if (arg1 == 249) {
					local126 = arg0.method5350();
					if (this.aClass246_33 == null) {
						local134 = Static6.method148(local126);
						this.aClass246_33 = new Class246(local134);
					}
					for (local134 = 0; local134 < local126; local134++) {
						@Pc(287) boolean local287 = arg0.method5350() == 1;
						@Pc(291) int local291 = arg0.method5356();
						@Pc(300) Class2 local300;
						if (local287) {
							local300 = new Class2_Sub8(arg0.method5364());
						} else {
							local300 = new Class2_Sub14(arg0.method5346());
						}
						this.aClass246_33.method5609(local300, (long) local291);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method5522(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass246_33 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub8 local21 = (Class2_Sub8) this.aClass246_33.method5613((long) arg1);
			return local21 == null ? arg0 : local21.aString8;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!kk;)V")
	public void method5524(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5350();
			if (local17 == 0) {
				return;
			}
			this.method5521(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!qr;)Z")
	public boolean method5525(@OriginalArg(1) Interface8 arg0) {
		@Pc(25) int local25;
		if (this.anInt6349 == -1) {
			if (this.anInt6360 == -1) {
				return true;
			}
			local25 = arg0.method4464(this.anInt6360);
		} else {
			local25 = arg0.method4463(this.anInt6349);
		}
		if (local25 < this.anInt6343 || local25 > this.anInt6361) {
			return false;
		}
		@Pc(63) int local63;
		if (this.anInt6346 == -1) {
			if (this.anInt6359 == -1) {
				return true;
			}
			local63 = arg0.method4464(this.anInt6359);
		} else {
			local63 = arg0.method4463(this.anInt6346);
		}
		return this.anInt6355 <= local63 && local63 <= this.anInt6364;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public void method5526() {
		if (this.anIntArray1317 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray1317.length; local16 += 2) {
			if (this.anInt6366 > this.anIntArray1317[local16]) {
				this.anInt6366 = this.anIntArray1317[local16];
			} else if (this.anInt6375 < this.anIntArray1317[local16]) {
				this.anInt6375 = this.anIntArray1317[local16];
			}
			if (this.anInt6350 > this.anIntArray1317[local16 + 1]) {
				this.anInt6350 = this.anIntArray1317[local16 + 1];
			} else if (this.anInt6357 < this.anIntArray1317[local16 + 1]) {
				this.anInt6357 = this.anIntArray1317[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!vc;)Lclient!rn;")
	public Class18 method5527(@OriginalArg(1) Class63 arg0) {
		@Pc(22) Class18 local22 = (Class18) this.aClass226_4.aClass160_56.method3599((long) (this.anInt6371 | 0x20000 | arg0.anInt2081 << 29));
		if (local22 != null) {
			return local22;
		}
		this.aClass226_4.aClass171_89.method3739(this.anInt6371);
		@Pc(42) Class86 local42 = Static397.method2330(this.aClass226_4.aClass171_89, this.anInt6371, 0);
		if (local42 != null) {
			local22 = arg0.method2000(local42);
			this.aClass226_4.aClass160_56.method3602((long) (this.anInt6371 | 0x20000 | arg0.anInt2081 << 29), local22);
		}
		return local22;
	}
}
