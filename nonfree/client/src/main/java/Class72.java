import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class72 {

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	private int anInt1508;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!du;")
	private Class81 aClass81_13;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Lclient!pm;")
	public Class273 aClass273_4;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	public int anInt1510;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	public int anInt1512;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	public int anInt1515;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
	public int anInt1519;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
	public int anInt1522;

	@OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
	private int anInt1525;

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
	public int anInt1532;

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
	public int anInt1536;

	@OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
	private int anInt1537;

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
	private int anInt1539;

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public int anInt1504 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	private int anInt1507 = -1;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Z")
	public boolean aBoolean118 = true;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
	private int anInt1521 = -1;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
	private int anInt1520 = -1;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public int anInt1509 = -1;

	@OriginalMember(owner = "client!dh", name = "F", descriptor = "Z")
	public boolean aBoolean120 = true;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
	public int anInt1518 = -1;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public int anInt1514 = -1;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray7 = new String[5];

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
	private int anInt1527 = -1;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
	public int anInt1523 = 0;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
	public int anInt1513 = -1;

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
	private int anInt1538 = -1;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
	public int anInt1540 = -1;

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
	public int anInt1531 = -1;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Z")
	public boolean aBoolean119 = true;

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
	public int anInt1526 = -1;

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
	public int anInt1529 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
	public int anInt1535 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
	public int anInt1528 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "Z")
	public boolean aBoolean121 = false;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method1440(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass81_13 == null) {
			return arg0;
		} else {
			@Pc(21) Class5_Sub36 local21 = (Class5_Sub36) this.aClass81_13.method1599((long) arg1);
			return local21 == null ? arg0 : local21.aString106;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public void method1441() {
		if (this.anIntArray130 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray130.length; local6 += 2) {
			if (this.anIntArray130[local6] < this.anInt1528) {
				this.anInt1528 = this.anIntArray130[local6];
			} else if (this.anIntArray130[local6] > this.anInt1535) {
				this.anInt1535 = this.anIntArray130[local6];
			}
			if (this.anInt1529 > this.anIntArray130[local6 + 1]) {
				this.anInt1529 = this.anIntArray130[local6 + 1];
			} else if (this.anIntArray130[local6 + 1] > this.anInt1504) {
				this.anInt1504 = this.anIntArray130[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ee;ZI)V")
	private void method1442(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1509 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt1518 = arg0.method8631();
		} else if (arg1 == 3) {
			this.aString22 = arg0.method8617();
		} else if (arg1 == 4) {
			this.anInt1536 = arg0.method8657();
		} else if (arg1 == 5) {
			this.anInt1514 = arg0.method8657();
		} else if (arg1 == 6) {
			this.anInt1523 = arg0.method8645();
		} else {
			@Pc(92) int local92;
			if (arg1 == 7) {
				local92 = arg0.method8645();
				if ((local92 & 0x1) == 0) {
					this.aBoolean120 = false;
				}
				if ((local92 & 0x2) == 2) {
					this.aBoolean121 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean119 = arg0.method8645() == 1;
			} else if (arg1 == 9) {
				this.anInt1507 = arg0.method8631();
				if (this.anInt1507 == 65535) {
					this.anInt1507 = -1;
				}
				this.anInt1521 = arg0.method8631();
				if (this.anInt1521 == 65535) {
					this.anInt1521 = -1;
				}
				this.anInt1508 = arg0.method8623();
				this.anInt1525 = arg0.method8623();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray7[arg1 - 10] = arg0.method8617();
			} else {
				@Pc(100) int local100;
				@Pc(130) int local130;
				if (arg1 == 15) {
					local92 = arg0.method8645();
					this.anIntArray130 = new int[local92 * 2];
					for (local100 = 0; local100 < local92 * 2; local100++) {
						this.anIntArray130[local100] = arg0.method8595();
					}
					this.anInt1512 = arg0.method8623();
					@Pc(124) int local124 = arg0.method8645();
					this.anIntArray129 = new int[local124];
					for (local130 = 0; local130 < this.anIntArray129.length; local130++) {
						this.anIntArray129[local130] = arg0.method8623();
					}
					this.aByteArray21 = new byte[local92];
					for (@Pc(155) int local155 = 0; local155 < local92; local155++) {
						this.aByteArray21[local155] = arg0.method8635();
					}
				} else if (arg1 == 16) {
					this.aBoolean118 = false;
				} else if (arg1 == 17) {
					this.aString21 = arg0.method8617();
				} else if (arg1 == 18) {
					this.anInt1527 = arg0.method8631();
				} else if (arg1 == 19) {
					this.anInt1513 = arg0.method8631();
				} else if (arg1 == 20) {
					this.anInt1520 = arg0.method8631();
					if (this.anInt1520 == 65535) {
						this.anInt1520 = -1;
					}
					this.anInt1538 = arg0.method8631();
					if (this.anInt1538 == 65535) {
						this.anInt1538 = -1;
					}
					this.anInt1539 = arg0.method8623();
					this.anInt1537 = arg0.method8623();
				} else if (arg1 == 21) {
					this.anInt1522 = arg0.method8623();
				} else if (arg1 == 22) {
					this.anInt1510 = arg0.method8623();
				} else if (arg1 == 23) {
					this.anInt1540 = arg0.method8645();
					this.anInt1531 = arg0.method8645();
					this.anInt1526 = arg0.method8645();
				} else if (arg1 == 24) {
					this.anInt1515 = arg0.method8595();
					this.anInt1532 = arg0.method8595();
				} else if (arg1 == 249) {
					local92 = arg0.method8645();
					if (this.aClass81_13 == null) {
						local100 = Static522.method6795(local92);
						this.aClass81_13 = new Class81(local100);
					}
					for (local100 = 0; local100 < local92; local100++) {
						@Pc(304) boolean local304 = arg0.method8645() == 1;
						local130 = arg0.method8657();
						@Pc(317) Class5 local317;
						if (local304) {
							local317 = new Class5_Sub36(arg0.method8617());
						} else {
							local317 = new Class5_Sub41(arg0.method8623());
						}
						this.aClass81_13.method1607(local317, (long) local130);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I")
	public int method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass81_13 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub41 local16 = (Class5_Sub41) this.aClass81_13.method1599((long) arg0);
			return local16 == null ? arg1 : local16.anInt7411;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLclient!ha;)Lclient!hu;")
	public Class44 method1444(@OriginalArg(1) Class126 arg0) {
		@Pc(20) Class44 local20 = (Class44) this.aClass273_4.aClass293_52.method6921((long) (this.anInt1527 | 0x20000 | arg0.anInt8069 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass273_4.aClass384_105.method8883(this.anInt1527);
		@Pc(45) Class176 local45 = Static654.method4046(this.aClass273_4.aClass384_105, this.anInt1527, 0);
		if (local45 != null) {
			local20 = arg0.method6994(local45, true);
			this.aClass273_4.aClass293_52.method6925((long) (arg0.anInt8069 << 29 | 0x20000 | this.anInt1527), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!bj;)Z")
	public boolean method1445(@OriginalArg(1) Interface4 arg0) {
		@Pc(15) int local15;
		if (this.anInt1521 == -1) {
			if (this.anInt1507 == -1) {
				return true;
			}
			local15 = arg0.method7288(this.anInt1507);
		} else {
			local15 = arg0.method7289(this.anInt1521);
		}
		if (this.anInt1508 > local15 || local15 > this.anInt1525) {
			return false;
		}
		@Pc(70) int local70;
		if (this.anInt1538 == -1) {
			if (this.anInt1520 == -1) {
				return true;
			}
			local70 = arg0.method7288(this.anInt1520);
		} else {
			local70 = arg0.method7289(this.anInt1538);
		}
		return local70 >= this.anInt1539 && this.anInt1537 >= local70;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!ee;)V")
	public void method1446(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method1442(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLclient!ha;B)Lclient!hu;")
	public Class44 method1448(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class126 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt1518 : this.anInt1509;
		@Pc(18) int local18 = arg1.anInt8069 << 29 | local11;
		@Pc(27) Class44 local27 = (Class44) this.aClass273_4.aClass293_52.method6921((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass273_4.aClass384_105.method8883(local11)) {
			@Pc(54) Class176 local54 = Static654.method4046(this.aClass273_4.aClass384_105, local11, 0);
			if (local54 != null) {
				local27 = arg1.method6994(local54, true);
				this.aClass273_4.aClass293_52.method6925((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}
}
