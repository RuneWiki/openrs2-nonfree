import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class40 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!sl;")
	private Class310 aClass310_4;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public int anInt1379;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	private int anInt1382;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public int anInt1383;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public int anInt1384;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	public int anInt1387;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
	public int anInt1390;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
	private int anInt1396;

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "Lclient!jk;")
	public Class168 aClass168_1;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
	private int anInt1405;

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
	private int anInt1409;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	public int anInt1381 = -1;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public int anInt1380 = 0;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public int anInt1385 = -1;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Z")
	public boolean aBoolean92 = true;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	public int anInt1391 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray7 = new String[5];

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	public int anInt1386 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
	private int anInt1389 = -1;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	private int anInt1404 = -1;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
	private int anInt1394 = -1;

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
	public int anInt1402 = -1;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
	public int anInt1395 = -1;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	private int anInt1397 = -1;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
	public int anInt1407 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	private int anInt1388 = -1;

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "Z")
	public boolean aBoolean95 = false;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
	public int anInt1406 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method1116(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass310_4 == null) {
			return arg0;
		} else {
			@Pc(26) Class3_Sub51 local26 = (Class3_Sub51) this.aClass310_4.method6601((long) arg1);
			return local26 == null ? arg0 : local26.aString128;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!r;IZ)Lclient!f;")
	public Class46 method1118(@OriginalArg(0) Class43 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1402 : this.anInt1385;
		@Pc(18) int local18 = arg0.anInt8539 << 29 | local11;
		@Pc(35) Class46 local35 = (Class46) this.aClass168_1.aClass10_24.method250((long) local18);
		if (local35 != null) {
			return local35;
		} else if (this.aClass168_1.aClass246_121.method5667(local11)) {
			@Pc(55) Class355 local55 = Static606.method7590(this.aClass168_1.aClass246_121, local11, 0);
			if (local55 != null) {
				local35 = arg0.method7205(local55, true);
				this.aClass168_1.aClass10_24.method254(local35, (long) local18);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
	public int method1119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass310_4 == null) {
			return arg0;
		} else {
			@Pc(24) Class3_Sub4 local24 = (Class3_Sub4) this.aClass310_4.method6601((long) arg1);
			return local24 == null ? arg0 : local24.anInt109;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!qh;)V")
	private void method1121(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1385 = arg1.method3109();
		} else if (arg0 == 2) {
			this.anInt1402 = arg1.method3109();
		} else if (arg0 == 3) {
			this.aString25 = arg1.method3133();
		} else if (arg0 == 4) {
			this.anInt1390 = arg1.method3126();
		} else if (arg0 == 5) {
			this.anInt1381 = arg1.method3126();
		} else if (arg0 == 6) {
			this.anInt1380 = arg1.method3118();
		} else {
			@Pc(44) int local44;
			if (arg0 == 7) {
				local44 = arg1.method3118();
				if ((local44 & 0x2) == 2) {
					this.aBoolean95 = true;
				}
				if ((local44 & 0x1) == 0) {
					this.aBoolean94 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean92 = arg1.method3118() == 1;
			} else if (arg0 == 9) {
				this.anInt1389 = arg1.method3109();
				if (this.anInt1389 == 65535) {
					this.anInt1389 = -1;
				}
				this.anInt1397 = arg1.method3109();
				if (this.anInt1397 == 65535) {
					this.anInt1397 = -1;
				}
				this.anInt1405 = arg1.method3116();
				this.anInt1382 = arg1.method3116();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray7[arg0 - 10] = arg1.method3133();
			} else {
				@Pc(167) int local167;
				if (arg0 == 15) {
					local44 = arg1.method3118();
					this.anIntArray104 = new int[local44 * 2];
					for (local167 = 0; local167 < local44 * 2; local167++) {
						this.anIntArray104[local167] = arg1.method3107();
					}
					this.anInt1398 = arg1.method3116();
					this.anInt1383 = arg1.method3116();
				} else if (arg0 == 16) {
					this.aBoolean93 = false;
				} else if (arg0 == 17) {
					this.aString26 = arg1.method3133();
				} else if (arg0 == 18) {
					this.anInt1404 = arg1.method3109();
				} else if (arg0 == 19) {
					this.anInt1395 = arg1.method3109();
				} else if (arg0 == 20) {
					this.anInt1394 = arg1.method3109();
					if (this.anInt1394 == 65535) {
						this.anInt1394 = -1;
					}
					this.anInt1388 = arg1.method3109();
					if (this.anInt1388 == 65535) {
						this.anInt1388 = -1;
					}
					this.anInt1409 = arg1.method3116();
					this.anInt1396 = arg1.method3116();
				} else if (arg0 == 21) {
					this.anInt1384 = arg1.method3116();
				} else if (arg0 == 22) {
					this.anInt1387 = arg1.method3116();
				} else if (arg0 == 249) {
					local44 = arg1.method3118();
					if (this.aClass310_4 == null) {
						local167 = Static114.method2375(local44);
						this.aClass310_4 = new Class310(local167);
					}
					for (local167 = 0; local167 < local44; local167++) {
						@Pc(186) boolean local186 = arg1.method3118() == 1;
						@Pc(190) int local190 = arg1.method3126();
						@Pc(199) Class3 local199;
						if (local186) {
							local199 = new Class3_Sub51(arg1.method3133());
						} else {
							local199 = new Class3_Sub4(arg1.method3116());
						}
						this.aClass310_4.method6603(local199, (long) local190);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public void method1122() {
		if (this.anIntArray104 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray104.length; local10 += 2) {
			if (this.anIntArray104[local10] < this.anInt1407) {
				this.anInt1407 = this.anIntArray104[local10];
			} else if (this.anIntArray104[local10] > this.anInt1391) {
				this.anInt1391 = this.anIntArray104[local10];
			}
			if (this.anIntArray104[local10 + 1] < this.anInt1406) {
				this.anInt1406 = this.anIntArray104[local10 + 1];
			} else if (this.anIntArray104[local10 + 1] > this.anInt1386) {
				this.anInt1386 = this.anIntArray104[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method1123(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3118();
			if (local17 == 0) {
				return;
			}
			this.method1121(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!r;)Lclient!f;")
	public Class46 method1124(@OriginalArg(1) Class43 arg0) {
		@Pc(20) Class46 local20 = (Class46) this.aClass168_1.aClass10_24.method250((long) (arg0.anInt8539 << 29 | this.anInt1404 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass168_1.aClass246_121.method5667(this.anInt1404);
		@Pc(45) Class355 local45 = Static606.method7590(this.aClass168_1.aClass246_121, this.anInt1404, 0);
		if (local45 != null) {
			local20 = arg0.method7205(local45, true);
			this.aClass168_1.aClass10_24.method254(local20, (long) (arg0.anInt8539 << 29 | this.anInt1404 | 0x20000));
		}
		return local20;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!qs;I)Z")
	public boolean method1125(@OriginalArg(0) Interface21 arg0) {
		@Pc(20) int local20;
		if (this.anInt1397 == -1) {
			if (this.anInt1389 == -1) {
				return true;
			}
			local20 = arg0.method1725(this.anInt1389);
		} else {
			local20 = arg0.method1726(this.anInt1397);
		}
		if (this.anInt1405 > local20 || this.anInt1382 < local20) {
			return false;
		}
		@Pc(66) int local66;
		if (this.anInt1388 == -1) {
			if (this.anInt1394 == -1) {
				return true;
			}
			local66 = arg0.method1725(this.anInt1394);
		} else {
			local66 = arg0.method1726(this.anInt1388);
		}
		return local66 >= this.anInt1409 && local66 <= this.anInt1396;
	}
}
