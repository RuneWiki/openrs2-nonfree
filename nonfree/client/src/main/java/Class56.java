import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class56 {

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
	private int anInt1465;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "Lclient!hc;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
	public int anInt1469;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Lclient!wa;")
	private Class257 aClass257_3;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	private int anInt1474;

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
	public int anInt1480;

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
	private int anInt1482;

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
	public int anInt1484;

	@OriginalMember(owner = "client!dt", name = "E", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
	public int anInt1488;

	@OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
	private int anInt1489;

	@OriginalMember(owner = "client!dt", name = "R", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!dt", name = "T", descriptor = "I")
	public int anInt1495;

	@OriginalMember(owner = "client!dt", name = "V", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
	public int anInt1471 = -1;

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
	public int anInt1467 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	public int anInt1470 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
	public int anInt1476 = -1;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
	public int anInt1479 = -1;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
	private int anInt1478 = -1;

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "Z")
	public boolean aBoolean117 = true;

	@OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
	private int anInt1490 = -1;

	@OriginalMember(owner = "client!dt", name = "I", descriptor = "Z")
	public boolean aBoolean118 = true;

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
	public int anInt1486 = -1;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	public int anInt1475 = 0;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
	public int anInt1473 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
	private int anInt1491 = -1;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "Z")
	public boolean aBoolean116 = true;

	@OriginalMember(owner = "client!dt", name = "Q", descriptor = "I")
	private int anInt1493 = -1;

	@OriginalMember(owner = "client!dt", name = "S", descriptor = "I")
	private int anInt1494 = -1;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "Z")
	public boolean aBoolean115 = false;

	@OriginalMember(owner = "client!dt", name = "U", descriptor = "I")
	public int anInt1496 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)I")
	public int method1225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass257_3 == null) {
			return arg1;
		} else {
			@Pc(24) Class1_Sub6 local24 = (Class1_Sub6) this.aClass257_3.method5503((long) arg0);
			return local24 == null ? arg1 : local24.anInt796;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method1226(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass257_3 == null) {
			return arg0;
		} else {
			@Pc(20) Class1_Sub40 local20 = (Class1_Sub40) this.aClass257_3.method5503((long) arg1);
			return local20 == null ? arg0 : local20.aString54;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	public void method1227() {
		if (this.anIntArray73 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray73.length; local6 += 2) {
			if (this.anIntArray73[local6] < this.anInt1473) {
				this.anInt1473 = this.anIntArray73[local6];
			} else if (this.anInt1470 < this.anIntArray73[local6]) {
				this.anInt1470 = this.anIntArray73[local6];
			}
			if (this.anIntArray73[local6 + 1] < this.anInt1467) {
				this.anInt1467 = this.anIntArray73[local6 + 1];
			} else if (this.anInt1496 < this.anIntArray73[local6 + 1]) {
				this.anInt1496 = this.anIntArray73[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!qa;)Lclient!f;")
	public Class49 method1228(@OriginalArg(1) Class128 arg0) {
		@Pc(20) Class49 local20 = (Class49) this.aClass101_1.aClass167_42.method3386((long) (this.anInt1493 | 0x20000 | arg0.anInt4410 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass101_1.aClass113_51.method2253(this.anInt1493);
		@Pc(40) Class100 local40 = Static458.method1922(this.aClass101_1.aClass113_51, this.anInt1493, 0);
		if (local40 != null) {
			local20 = arg0.method3540(local40);
			this.aClass101_1.aClass167_42.method3392(local20, (long) (this.anInt1493 | 0x20000 | arg0.anInt4410 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!dh;II)V")
	private void method1229(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1476 = arg0.method4485();
		} else if (arg1 == 2) {
			this.anInt1486 = arg0.method4485();
		} else if (arg1 == 3) {
			this.aString10 = arg0.method4484();
		} else if (arg1 == 4) {
			this.anInt1484 = arg0.method4493();
		} else if (arg1 == 5) {
			this.anInt1471 = arg0.method4493();
		} else if (arg1 == 6) {
			this.anInt1475 = arg0.method4463();
		} else {
			@Pc(68) int local68;
			if (arg1 == 7) {
				local68 = arg0.method4463();
				if ((local68 & 0x1) == 0) {
					this.aBoolean118 = false;
				}
				if ((local68 & 0x2) == 2) {
					this.aBoolean115 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean117 = arg0.method4463() == 1;
			} else if (arg1 == 9) {
				this.anInt1494 = arg0.method4485();
				if (this.anInt1494 == 65535) {
					this.anInt1494 = -1;
				}
				this.anInt1491 = arg0.method4485();
				if (this.anInt1491 == 65535) {
					this.anInt1491 = -1;
				}
				this.anInt1465 = arg0.method4487();
				this.anInt1482 = arg0.method4487();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray11[arg1 - 10] = arg0.method4484();
			} else {
				@Pc(138) int local138;
				if (arg1 == 15) {
					local68 = arg0.method4463();
					this.anIntArray73 = new int[local68 * 2];
					for (local138 = 0; local138 < local68 * 2; local138++) {
						this.anIntArray73[local138] = arg0.method4482();
					}
					this.anInt1495 = arg0.method4487();
					this.anInt1469 = arg0.method4487();
				} else if (arg1 == 16) {
					this.aBoolean116 = false;
				} else if (arg1 == 17) {
					this.aString11 = arg0.method4484();
				} else if (arg1 == 18) {
					this.anInt1493 = arg0.method4485();
				} else if (arg1 == 19) {
					this.anInt1479 = arg0.method4485();
				} else if (arg1 == 20) {
					this.anInt1490 = arg0.method4485();
					if (this.anInt1490 == 65535) {
						this.anInt1490 = -1;
					}
					this.anInt1478 = arg0.method4485();
					if (this.anInt1478 == 65535) {
						this.anInt1478 = -1;
					}
					this.anInt1474 = arg0.method4487();
					this.anInt1489 = arg0.method4487();
				} else if (arg1 == 21) {
					this.anInt1488 = arg0.method4487();
				} else if (arg1 == 22) {
					this.anInt1466 = arg0.method4487();
				} else if (arg1 == 249) {
					local68 = arg0.method4463();
					if (this.aClass257_3 == null) {
						local138 = Static88.method1286(local68);
						this.aClass257_3 = new Class257(local138);
					}
					for (local138 = 0; local138 < local68; local138++) {
						@Pc(300) boolean local300 = arg0.method4463() == 1;
						@Pc(304) int local304 = arg0.method4493();
						@Pc(315) Class1 local315;
						if (local300) {
							local315 = new Class1_Sub40(arg0.method4484());
						} else {
							local315 = new Class1_Sub6(arg0.method4487());
						}
						this.aClass257_3.method5504(local315, (long) local304);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!qa;IZ)Lclient!f;")
	public Class49 method1230(@OriginalArg(0) Class128 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1486 : this.anInt1476;
		@Pc(18) int local18 = arg0.anInt4410 << 29 | local11;
		@Pc(27) Class49 local27 = (Class49) this.aClass101_1.aClass167_42.method3386((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass101_1.aClass113_51.method2253(local11)) {
			@Pc(56) Class100 local56 = Static458.method1922(this.aClass101_1.aClass113_51, local11, 0);
			if (local56 != null) {
				local27 = arg0.method3540(local56);
				this.aClass101_1.aClass167_42.method3392(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!dh;B)V")
	public void method1232(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method1229(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!tn;)Z")
	public boolean method1234(@OriginalArg(1) Interface11 arg0) {
		@Pc(20) int local20;
		if (this.anInt1491 == -1) {
			if (this.anInt1494 == -1) {
				return true;
			}
			local20 = arg0.method5519(this.anInt1494);
		} else {
			local20 = arg0.method5520(this.anInt1491);
		}
		if (this.anInt1465 > local20 || local20 > this.anInt1482) {
			return false;
		}
		@Pc(57) int local57;
		if (this.anInt1478 == -1) {
			if (this.anInt1490 == -1) {
				return true;
			}
			local57 = arg0.method5519(this.anInt1490);
		} else {
			local57 = arg0.method5520(this.anInt1478);
		}
		return this.anInt1474 <= local57 && local57 <= this.anInt1489;
	}
}
