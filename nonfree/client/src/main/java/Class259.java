import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class259 {

	@OriginalMember(owner = "client!nja", name = "j", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!nja", name = "C", descriptor = "[I")
	public int[] anIntArray498;

	@OriginalMember(owner = "client!nja", name = "s", descriptor = "Ljava/lang/String;")
	public String aString74;

	@OriginalMember(owner = "client!nja", name = "Z", descriptor = "I")
	private int anInt6949;

	@OriginalMember(owner = "client!nja", name = "m", descriptor = "I")
	private int anInt6951;

	@OriginalMember(owner = "client!nja", name = "e", descriptor = "I")
	public int anInt6952;

	@OriginalMember(owner = "client!nja", name = "T", descriptor = "I")
	public int anInt6956;

	@OriginalMember(owner = "client!nja", name = "A", descriptor = "Lclient!lba;")
	private Class218 aClass218_30;

	@OriginalMember(owner = "client!nja", name = "S", descriptor = "Ljava/lang/String;")
	public String aString75;

	@OriginalMember(owner = "client!nja", name = "z", descriptor = "I")
	private int anInt6965;

	@OriginalMember(owner = "client!nja", name = "W", descriptor = "I")
	public int anInt6970;

	@OriginalMember(owner = "client!nja", name = "G", descriptor = "Lclient!jha;")
	public Class196 aClass196_4;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "I")
	public int anInt6972;

	@OriginalMember(owner = "client!nja", name = "F", descriptor = "I")
	private int anInt6974;

	@OriginalMember(owner = "client!nja", name = "N", descriptor = "I")
	public int anInt6975;

	@OriginalMember(owner = "client!nja", name = "t", descriptor = "I")
	public int anInt6977;

	@OriginalMember(owner = "client!nja", name = "n", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!nja", name = "p", descriptor = "I")
	public int anInt6978;

	@OriginalMember(owner = "client!nja", name = "w", descriptor = "I")
	public int anInt6947 = -1;

	@OriginalMember(owner = "client!nja", name = "O", descriptor = "I")
	public int anInt6957 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nja", name = "k", descriptor = "I")
	public int anInt6961 = -1;

	@OriginalMember(owner = "client!nja", name = "U", descriptor = "I")
	public int anInt6954 = -1;

	@OriginalMember(owner = "client!nja", name = "V", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray29 = new String[5];

	@OriginalMember(owner = "client!nja", name = "K", descriptor = "I")
	private int anInt6963 = -1;

	@OriginalMember(owner = "client!nja", name = "r", descriptor = "I")
	public int anInt6959 = -1;

	@OriginalMember(owner = "client!nja", name = "L", descriptor = "I")
	public int anInt6964 = -1;

	@OriginalMember(owner = "client!nja", name = "q", descriptor = "I")
	public int anInt6973 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nja", name = "i", descriptor = "I")
	private int anInt6962 = -1;

	@OriginalMember(owner = "client!nja", name = "d", descriptor = "I")
	public int anInt6950 = -1;

	@OriginalMember(owner = "client!nja", name = "v", descriptor = "I")
	public int anInt6969 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nja", name = "E", descriptor = "I")
	private int anInt6979 = -1;

	@OriginalMember(owner = "client!nja", name = "M", descriptor = "Z")
	public boolean aBoolean582 = true;

	@OriginalMember(owner = "client!nja", name = "P", descriptor = "Z")
	public boolean aBoolean583 = true;

	@OriginalMember(owner = "client!nja", name = "u", descriptor = "I")
	private int anInt6980 = -1;

	@OriginalMember(owner = "client!nja", name = "c", descriptor = "I")
	private int anInt6946 = -1;

	@OriginalMember(owner = "client!nja", name = "x", descriptor = "I")
	public int anInt6982 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nja", name = "H", descriptor = "I")
	public int anInt6981 = -1;

	@OriginalMember(owner = "client!nja", name = "Y", descriptor = "I")
	public int anInt6983 = 0;

	@OriginalMember(owner = "client!nja", name = "R", descriptor = "Z")
	public boolean aBoolean584 = true;

	@OriginalMember(owner = "client!nja", name = "Q", descriptor = "Z")
	public boolean aBoolean581 = false;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(BLclient!vt;)Z")
	public boolean method6247(@OriginalArg(1) Interface26 arg0) {
		@Pc(28) int local28;
		if (this.anInt6946 == -1) {
			if (this.anInt6962 == -1) {
				return true;
			}
			local28 = arg0.method5146(this.anInt6962);
		} else {
			local28 = arg0.method5145(this.anInt6946);
		}
		if (local28 < this.anInt6974 || this.anInt6951 < local28) {
			return false;
		}
		@Pc(72) int local72;
		if (this.anInt6979 == -1) {
			if (this.anInt6963 == -1) {
				return true;
			}
			local72 = arg0.method5146(this.anInt6963);
		} else {
			local72 = arg0.method5145(this.anInt6979);
		}
		return local72 >= this.anInt6949 && local72 <= this.anInt6965;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Z)V")
	public void method6248() {
		if (this.anIntArray497 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray497.length; local6 += 2) {
			if (this.anInt6973 > this.anIntArray497[local6]) {
				this.anInt6973 = this.anIntArray497[local6];
			} else if (this.anIntArray497[local6] > this.anInt6969) {
				this.anInt6969 = this.anIntArray497[local6];
			}
			if (this.anInt6982 > this.anIntArray497[local6 + 1]) {
				this.anInt6982 = this.anIntArray497[local6 + 1];
			} else if (this.anIntArray497[local6 + 1] > this.anInt6957) {
				this.anInt6957 = this.anIntArray497[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IBI)I")
	public int method6250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass218_30 == null) {
			return arg1;
		} else {
			@Pc(23) Class2_Sub2 local23 = (Class2_Sub2) this.aClass218_30.method5095((long) arg0, 0);
			return local23 == null ? arg1 : local23.anInt41;
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ILclient!et;)V")
	public void method6252(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8581(-17416);
			if (local9 == 0) {
				return;
			}
			this.method6255(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method6253(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass218_30 == null) {
			return arg1;
		} else {
			@Pc(17) Class2_Sub47 local17 = (Class2_Sub47) this.aClass218_30.method5095((long) arg0, 0);
			return local17 == null ? arg1 : local17.aString88;
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ILclient!ha;)Lclient!ug;")
	public Class43 method6254(@OriginalArg(1) Class145 arg0) {
		@Pc(20) Class43 local20 = (Class43) this.aClass196_4.aClass85_35.method1737((long) (this.anInt6980 | 0x20000 | arg0.anInt11056 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass196_4.aClass254_92.method6072(this.anInt6980);
		@Pc(49) Class355 local49 = Static737.method8362(this.aClass196_4.aClass254_92, this.anInt6980, 0);
		if (local49 != null) {
			local20 = arg0.method9683(local49, true);
			this.aClass196_4.aClass85_35.method1745((long) (this.anInt6980 | 0x20000 | arg0.anInt11056 << 29), 16383, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(BLclient!et;I)V")
	private void method6255(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6954 = arg0.method8575();
		} else if (arg1 == 2) {
			this.anInt6964 = arg0.method8575();
		} else if (arg1 == 3) {
			this.aString75 = arg0.method8553();
		} else if (arg1 == 4) {
			this.anInt6978 = arg0.method8583();
		} else if (arg1 == 5) {
			this.anInt6959 = arg0.method8583();
		} else if (arg1 == 6) {
			this.anInt6983 = arg0.method8581(-17416);
		} else {
			@Pc(64) int local64;
			if (arg1 == 7) {
				local64 = arg0.method8581(-17416);
				if ((local64 & 0x2) == 2) {
					this.aBoolean581 = true;
				}
				if ((local64 & 0x1) == 0) {
					this.aBoolean582 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean583 = arg0.method8581(-17416) == 1;
			} else if (arg1 == 9) {
				this.anInt6962 = arg0.method8575();
				if (this.anInt6962 == 65535) {
					this.anInt6962 = -1;
				}
				this.anInt6946 = arg0.method8575();
				if (this.anInt6946 == 65535) {
					this.anInt6946 = -1;
				}
				this.anInt6974 = arg0.method8555(-9372);
				this.anInt6951 = arg0.method8555(-9372);
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray29[arg1 - 10] = arg0.method8553();
			} else {
				@Pc(259) int local259;
				@Pc(285) int local285;
				if (arg1 == 15) {
					local64 = arg0.method8581(-17416);
					this.anIntArray497 = new int[local64 * 2];
					for (local259 = 0; local259 < local64 * 2; local259++) {
						this.anIntArray497[local259] = arg0.method8598();
					}
					this.anInt6975 = arg0.method8555(-9372);
					@Pc(445) int local445 = arg0.method8581(-17416);
					this.anIntArray498 = new int[local445];
					for (local285 = 0; local285 < this.anIntArray498.length; local285++) {
						this.anIntArray498[local285] = arg0.method8555(-9372);
					}
					this.aByteArray89 = new byte[local64];
					for (@Pc(480) int local480 = 0; local480 < local64; local480++) {
						this.aByteArray89[local480] = arg0.method8536();
					}
				} else if (arg1 == 16) {
					this.aBoolean584 = false;
				} else if (arg1 == 17) {
					this.aString74 = arg0.method8553();
				} else if (arg1 == 18) {
					this.anInt6980 = arg0.method8575();
				} else if (arg1 == 19) {
					this.anInt6981 = arg0.method8575();
				} else if (arg1 == 20) {
					this.anInt6963 = arg0.method8575();
					if (this.anInt6963 == 65535) {
						this.anInt6963 = -1;
					}
					this.anInt6979 = arg0.method8575();
					if (this.anInt6979 == 65535) {
						this.anInt6979 = -1;
					}
					this.anInt6949 = arg0.method8555(-9372);
					this.anInt6965 = arg0.method8555(-9372);
				} else if (arg1 == 21) {
					this.anInt6956 = arg0.method8555(-9372);
				} else if (arg1 == 22) {
					this.anInt6970 = arg0.method8555(-9372);
				} else if (arg1 == 23) {
					this.anInt6961 = arg0.method8581(-17416);
					this.anInt6947 = arg0.method8581(-17416);
					this.anInt6950 = arg0.method8581(-17416);
				} else if (arg1 == 24) {
					this.anInt6977 = arg0.method8598();
					this.anInt6952 = arg0.method8598();
				} else if (arg1 == 249) {
					local64 = arg0.method8581(-17416);
					if (this.aClass218_30 == null) {
						local259 = Static330.method4577(local64);
						this.aClass218_30 = new Class218(local259);
					}
					for (local259 = 0; local259 < local64; local259++) {
						@Pc(281) boolean local281 = arg0.method8581(-17416) == 1;
						local285 = arg0.method8583();
						@Pc(294) Class2 local294;
						if (local281) {
							local294 = new Class2_Sub47(arg0.method8553());
						} else {
							local294 = new Class2_Sub2(arg0.method8555(-9372));
						}
						this.aClass218_30.method5099(local294, (long) local285);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!ha;IZ)Lclient!ug;")
	public Class43 method6256(@OriginalArg(0) Class145 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg1 ? this.anInt6964 : this.anInt6954;
		@Pc(19) int local19 = arg0.anInt11056 << 29 | local12;
		@Pc(30) Class43 local30 = (Class43) this.aClass196_4.aClass85_35.method1737((long) local19);
		if (local30 != null) {
			return local30;
		} else if (this.aClass196_4.aClass254_92.method6072(local12)) {
			@Pc(52) Class355 local52 = Static737.method8362(this.aClass196_4.aClass254_92, local12, 0);
			if (local52 != null) {
				local30 = arg0.method9683(local52, true);
				this.aClass196_4.aClass85_35.method1745((long) local19, 16383, local30);
			}
			return local30;
		} else {
			return null;
		}
	}
}
