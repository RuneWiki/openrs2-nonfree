import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class42 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "I")
	private int anInt1268;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "I")
	private int anInt1271;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "I")
	public int anInt1272;

	@OriginalMember(owner = "client!br", name = "h", descriptor = "I")
	private int anInt1274;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "I")
	public int anInt1278;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!br", name = "t", descriptor = "[I")
	public int[] anIntArray91;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "I")
	private int anInt1283;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "I")
	public int anInt1285;

	@OriginalMember(owner = "client!br", name = "D", descriptor = "Lclient!g;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "I")
	public int anInt1291;

	@OriginalMember(owner = "client!br", name = "G", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!br", name = "H", descriptor = "I")
	public int anInt1293;

	@OriginalMember(owner = "client!br", name = "J", descriptor = "Lclient!jo;")
	private Class187 aClass187_9;

	@OriginalMember(owner = "client!br", name = "K", descriptor = "I")
	public int anInt1295;

	@OriginalMember(owner = "client!br", name = "L", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!br", name = "R", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!br", name = "S", descriptor = "I")
	public int anInt1300;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Z")
	public boolean aBoolean103 = true;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "I")
	public int anInt1287 = -1;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "I")
	public int anInt1288 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "I")
	private int anInt1290 = -1;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	public int anInt1281 = -1;

	@OriginalMember(owner = "client!br", name = "M", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "I")
	public int anInt1276 = -1;

	@OriginalMember(owner = "client!br", name = "P", descriptor = "I")
	public int anInt1298 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "I")
	private int anInt1284 = -1;

	@OriginalMember(owner = "client!br", name = "T", descriptor = "I")
	public int anInt1301 = -1;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "I")
	public int anInt1279 = 0;

	@OriginalMember(owner = "client!br", name = "N", descriptor = "I")
	private int anInt1296 = -1;

	@OriginalMember(owner = "client!br", name = "I", descriptor = "I")
	public int anInt1294 = -1;

	@OriginalMember(owner = "client!br", name = "F", descriptor = "I")
	public int anInt1292 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!br", name = "X", descriptor = "Z")
	public boolean aBoolean105 = true;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "I")
	private int anInt1289 = -1;

	@OriginalMember(owner = "client!br", name = "W", descriptor = "I")
	private int anInt1304 = -1;

	@OriginalMember(owner = "client!br", name = "V", descriptor = "I")
	public int anInt1303 = -1;

	@OriginalMember(owner = "client!br", name = "Y", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "I")
	public int anInt1269 = -1;

	@OriginalMember(owner = "client!br", name = "ab", descriptor = "I")
	public int anInt1306 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray5 = new String[5];

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)I")
	public int method1104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass187_9 == null) {
			return arg1;
		} else {
			@Pc(16) Class14_Sub18 local16 = (Class14_Sub18) this.aClass187_9.method4078((long) arg0);
			return local16 == null ? arg1 : local16.anInt2644;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!so;I)V")
	public void method1105(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method1107(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBLclient!so;)V")
	private void method1107(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt1281 = arg1.method5900();
		} else if (arg0 == 2) {
			this.anInt1301 = arg1.method5900();
		} else if (arg0 == 3) {
			this.aString12 = arg1.method5898();
		} else if (arg0 == 4) {
			this.anInt1293 = arg1.method5862();
		} else if (arg0 == 5) {
			this.anInt1269 = arg1.method5862();
		} else if (arg0 == 6) {
			this.anInt1279 = arg1.method5866();
		} else {
			@Pc(171) int local171;
			if (arg0 == 7) {
				local171 = arg1.method5866();
				if ((local171 & 0x2) == 2) {
					this.aBoolean104 = true;
				}
				if ((local171 & 0x1) == 0) {
					this.aBoolean105 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean103 = arg1.method5866() == 1;
			} else if (arg0 == 9) {
				this.anInt1304 = arg1.method5900();
				if (this.anInt1304 == 65535) {
					this.anInt1304 = -1;
				}
				this.anInt1290 = arg1.method5900();
				if (this.anInt1290 == 65535) {
					this.anInt1290 = -1;
				}
				this.anInt1283 = arg1.method5878();
				this.anInt1271 = arg1.method5878();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray5[arg0 - 10] = arg1.method5898();
			} else {
				@Pc(178) int local178;
				@Pc(203) int local203;
				if (arg0 == 15) {
					local171 = arg1.method5866();
					this.anIntArray91 = new int[local171 * 2];
					for (local178 = 0; local178 < local171 * 2; local178++) {
						this.anIntArray91[local178] = arg1.method5890();
					}
					this.anInt1291 = arg1.method5878();
					@Pc(358) int local358 = arg1.method5866();
					this.anIntArray92 = new int[local358];
					for (local203 = 0; local203 < this.anIntArray92.length; local203++) {
						this.anIntArray92[local203] = arg1.method5878();
					}
					this.aByteArray19 = new byte[local171];
					for (@Pc(385) int local385 = 0; local385 < local171; local385++) {
						this.aByteArray19[local385] = arg1.method5845();
					}
				} else if (arg0 == 16) {
					this.aBoolean106 = false;
				} else if (arg0 == 17) {
					this.aString11 = arg1.method5898();
				} else if (arg0 == 18) {
					this.anInt1284 = arg1.method5900();
				} else if (arg0 == 19) {
					this.anInt1303 = arg1.method5900();
				} else if (arg0 == 20) {
					this.anInt1296 = arg1.method5900();
					if (this.anInt1296 == 65535) {
						this.anInt1296 = -1;
					}
					this.anInt1289 = arg1.method5900();
					if (this.anInt1289 == 65535) {
						this.anInt1289 = -1;
					}
					this.anInt1268 = arg1.method5878();
					this.anInt1274 = arg1.method5878();
				} else if (arg0 == 21) {
					this.anInt1295 = arg1.method5878();
				} else if (arg0 == 22) {
					this.anInt1300 = arg1.method5878();
				} else if (arg0 == 23) {
					this.anInt1294 = arg1.method5866();
					this.anInt1276 = arg1.method5866();
					this.anInt1287 = arg1.method5866();
				} else if (arg0 == 24) {
					this.anInt1285 = arg1.method5890();
					this.anInt1272 = arg1.method5890();
				} else if (arg0 == 249) {
					local171 = arg1.method5866();
					if (this.aClass187_9 == null) {
						local178 = Static330.method5181(local171);
						this.aClass187_9 = new Class187(local178);
					}
					for (local178 = 0; local178 < local171; local178++) {
						@Pc(199) boolean local199 = arg1.method5866() == 1;
						local203 = arg1.method5862();
						@Pc(214) Class14 local214;
						if (local199) {
							local214 = new Class14_Sub17(arg1.method5898());
						} else {
							local214 = new Class14_Sub18(arg1.method5878());
						}
						this.aClass187_9.method4077((long) local203, local214);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BLclient!ob;)Z")
	public boolean method1109(@OriginalArg(1) Interface20 arg0) {
		@Pc(22) int local22;
		if (this.anInt1290 == -1) {
			if (this.anInt1304 == -1) {
				return true;
			}
			local22 = arg0.method5813(this.anInt1304);
		} else {
			local22 = arg0.method5814(this.anInt1290);
		}
		if (this.anInt1283 > local22 || local22 > this.anInt1271) {
			return false;
		}
		@Pc(65) int local65;
		if (this.anInt1289 == -1) {
			if (this.anInt1296 == -1) {
				return true;
			}
			local65 = arg0.method5813(this.anInt1296);
		} else {
			local65 = arg0.method5814(this.anInt1289);
		}
		return local65 >= this.anInt1268 && local65 <= this.anInt1274;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!ha;I)Lclient!jd;")
	public Class20 method1110(@OriginalArg(0) Class137 arg0) {
		@Pc(28) Class20 local28 = (Class20) this.aClass116_1.aClass264_22.method6367((long) (arg0.anInt9522 << 29 | this.anInt1284 | 0x20000));
		if (local28 != null) {
			return local28;
		}
		this.aClass116_1.aClass386_41.method9206(this.anInt1284);
		@Pc(48) Class356 local48 = Static688.method8619(this.aClass116_1.aClass386_41, this.anInt1284, 0);
		if (local48 != null) {
			local28 = arg0.method7951(local48, true);
			this.aClass116_1.aClass264_22.method6364((long) (arg0.anInt9522 << 29 | 0x20000 | this.anInt1284), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZILclient!ha;)Lclient!jd;")
	public Class20 method1111(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class137 arg1) {
		@Pc(23) int local23 = arg0 ? this.anInt1301 : this.anInt1281;
		@Pc(30) int local30 = arg1.anInt9522 << 29 | local23;
		@Pc(39) Class20 local39 = (Class20) this.aClass116_1.aClass264_22.method6367((long) local30);
		if (local39 != null) {
			return local39;
		} else if (this.aClass116_1.aClass386_41.method9206(local23)) {
			@Pc(59) Class356 local59 = Static688.method8619(this.aClass116_1.aClass386_41, local23, 0);
			if (local59 != null) {
				local39 = arg1.method7951(local59, true);
				this.aClass116_1.aClass264_22.method6364((long) local30, local39);
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
	public String method1113(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass187_9 == null) {
			return arg1;
		} else {
			@Pc(16) Class14_Sub17 local16 = (Class14_Sub17) this.aClass187_9.method4078((long) arg0);
			return local16 == null ? arg1 : local16.aString26;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public void method1115() {
		if (this.anIntArray91 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray91.length; local6 += 2) {
			if (this.anInt1306 > this.anIntArray91[local6]) {
				this.anInt1306 = this.anIntArray91[local6];
			} else if (this.anIntArray91[local6] > this.anInt1288) {
				this.anInt1288 = this.anIntArray91[local6];
			}
			if (this.anInt1298 > this.anIntArray91[local6 + 1]) {
				this.anInt1298 = this.anIntArray91[local6 + 1];
			} else if (this.anIntArray91[local6 + 1] > this.anInt1292) {
				this.anInt1292 = this.anIntArray91[local6 + 1];
			}
		}
	}
}
