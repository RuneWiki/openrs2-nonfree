import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class304 {

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
	private int anInt8315;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "[Z")
	private boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
	private int anInt8319;

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "Lclient!da;")
	private Class61 aClass61_6;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "Lclient!ii;")
	public Class20_Sub5 aClass20_Sub5_7;

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "Lclient!hca;")
	private Class131 aClass131_3;

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
	private int anInt8326;

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
	private int anInt8333;

	@OriginalMember(owner = "client!sw", name = "C", descriptor = "Lclient!ha;")
	private Class1_Sub3_Sub4 aClass1_Sub3_Sub4_5;

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
	private int anInt8331 = -1;

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
	private int anInt8332 = 0;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
	private int anInt8316 = 0;

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
	private int anInt8321 = -1;

	@OriginalMember(owner = "client!sw", name = "F", descriptor = "I")
	private int anInt8336 = -1;

	@OriginalMember(owner = "client!sw", name = "E", descriptor = "Z")
	private boolean aBoolean603 = false;

	@OriginalMember(owner = "client!sw", name = "M", descriptor = "Z")
	private boolean aBoolean605 = false;

	@OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
	private int anInt8334;

	@OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
	public final int anInt8328;

	@OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
	private int anInt8335;

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
	public final int anInt8323;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "B")
	private final byte aByte104;

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
	public final int anInt8330;

	@OriginalMember(owner = "client!sw", name = "K", descriptor = "Z")
	private final boolean aBoolean604;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIIZI)V")
	public Class304(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt8334 = arg6;
		this.anInt8328 = arg3;
		this.anInt8335 = arg7;
		this.anInt8323 = arg2;
		this.aByte105 = (byte) arg4;
		this.aByte104 = (byte) arg5;
		this.anInt8330 = arg1.anInt8416;
		this.aBoolean605 = arg8;
		this.aBoolean604 = arg0.method6473() && arg1.aBoolean613 && !this.aBoolean605;
		if (arg9 != -1) {
			this.aBoolean603 = true;
		}
		this.method6927(arg9);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
	public boolean method6917() {
		return this.aBoolean604;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)V")
	public void method6918(@OriginalArg(0) int arg0) {
		this.aBoolean603 = true;
		this.method6927(arg0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!r;B)V")
	public void method6919(@OriginalArg(0) Class12 arg0) {
		if (this.aClass1_Sub3_Sub4_5 != null) {
			Static221.method3670(this.aClass1_Sub3_Sub4_5, this.aByte104, this.anInt8334, this.anInt8335, this.aBooleanArray25);
			this.aBooleanArray25 = null;
			this.aClass1_Sub3_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!q;ILclient!da;ILclient!r;ZIII)V")
	public void method6920(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(4) Class12 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class219[] local10 = arg2.method7597();
		@Pc(13) Class101[] local13 = arg2.method7599();
		if ((this.aClass20_Sub5_7 == null || this.aClass20_Sub5_7.aBoolean342) && (local10 != null || local13 != null)) {
			@Pc(30) Class306 local30 = Static146.aClass214_1.method4897(this.anInt8330);
			if (local30.anIntArray570 != null) {
				local30 = local30.method6966(Static121.aClass148_1);
			}
			if (local30 != null) {
				this.aClass20_Sub5_7 = Static220.method3658(Static81.anInt1910, true);
			}
		}
		if (this.aClass20_Sub5_7 == null) {
			return;
		}
		arg2.method7588(arg0);
		if (arg4) {
			this.aClass20_Sub5_7.method3656(arg3, (long) Static81.anInt1910, local10, local13);
		} else {
			this.aClass20_Sub5_7.method3668((long) Static81.anInt1910);
		}
		this.aClass20_Sub5_7.method3655(this.aByte105, arg6, arg5, arg7, arg1);
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I")
	public int method6921(@OriginalArg(0) int arg0) {
		return this.anInt8316;
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)I")
	public int method6922() {
		return this.anInt8332;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILclient!r;)V")
	public void method6923(@OriginalArg(1) Class12 arg0) {
		this.method6925(true, this.anInt8334, this.anInt8335, true, arg0, 262144);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZIIZLclient!r;II)Lclient!da;")
	public Class61 method6925(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Class306 local13 = Static146.aClass214_1.method4897(this.anInt8330);
		if (local13.anIntArray570 != null) {
			local13 = local13.method6966(Static121.aClass148_1);
		}
		if (local13 == null) {
			this.method6919(arg4);
			this.anInt8321 = -1;
			this.anInt8331 = -1;
			this.anInt8336 = -1;
			return null;
		}
		if (!this.aBoolean603 && this.anInt8336 != local13.anInt8416) {
			this.aClass61_6 = null;
			this.method6927(-1);
		}
		this.method6926(arg2, arg1);
		if (arg3) {
			@Pc(77) boolean local77 = arg3 & this.aBoolean604 & Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609) != 0;
			arg3 = local77 & (local13.anInt8416 != this.anInt8331 || this.aClass131_3 != null && Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609) >= 2 && (this.anInt8321 != this.anInt8326 || (this.aClass131_3.aBoolean304 || Static153.aBoolean202) && this.anInt8333 != this.anInt8326));
		}
		if (arg0 && !arg3) {
			this.anInt8336 = local13.anInt8416;
			return null;
		}
		if (arg3) {
			Static221.method3670(this.aClass1_Sub3_Sub4_5, this.aByte104, this.anInt8334, this.anInt8335, this.aBooleanArray25);
			this.anInt8331 = -1;
			this.anInt8321 = -1;
		}
		@Pc(159) Class17 local159 = Static20.aClass17Array1[this.aByte104];
		@Pc(175) Class17 local175;
		if (this.aBoolean605) {
			local175 = Static158.aClass17Array2[0];
		} else {
			local175 = this.aByte104 >= 3 ? null : Static20.aClass17Array1[this.aByte104 + 1];
		}
		@Pc(183) Class61 local183 = null;
		if (this.aClass131_3 != null) {
			if (arg3) {
				arg5 |= 0x40000;
			}
			local183 = local13.method6973(this.anInt8323 == 11 ? this.anInt8328 + 4 : this.anInt8328, this.anInt8333, this.anInt8319, this.anInt8326, this.anInt8334, this.anInt8335, local159.method6637(this.anInt8334, this.anInt8335), arg4, arg5, this.anInt8323 == 11 ? 10 : this.anInt8323, local159, this.aClass131_3, local175);
			if (local183 == null) {
				this.aBooleanArray25 = null;
				this.anInt8332 = 0;
				this.aClass1_Sub3_Sub4_5 = null;
				this.anInt8316 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray25 == null) {
						this.aBooleanArray25 = new boolean[4];
					}
					this.aClass1_Sub3_Sub4_5 = local183.S(this.aClass1_Sub3_Sub4_5);
					Static148.method2387(this.aClass1_Sub3_Sub4_5, this.aByte104, arg1, arg2, this.aBooleanArray25);
					this.anInt8331 = local13.anInt8416;
					this.anInt8321 = this.anInt8326;
				}
				this.anInt8332 = local183.J();
				this.anInt8316 = local183.RA();
			}
			this.aClass61_6 = null;
		} else if (this.aClass61_6 != null && (arg5 & this.aClass61_6.PA()) == arg5 && local13.anInt8416 == this.anInt8336) {
			local183 = this.aClass61_6;
		} else {
			if (this.aClass61_6 != null) {
				arg5 |= this.aClass61_6.PA();
			}
			@Pc(371) Class144 local371 = local13.method6963(local159.method6637(this.anInt8334, this.anInt8335), this.anInt8323 == 11 ? this.anInt8328 + 4 : this.anInt8328, arg3, arg4, this.anInt8335, this.anInt8334, arg5, this.anInt8323 == 11 ? 10 : this.anInt8323, local175, local159);
			if (local371 == null) {
				this.anInt8316 = 0;
				this.aClass61_6 = null;
				this.aBooleanArray25 = null;
				this.aClass1_Sub3_Sub4_5 = null;
				this.anInt8332 = 0;
			} else {
				local183 = local371.aClass61_5;
				this.aClass61_6 = local371.aClass61_5;
				if (arg3) {
					this.aClass1_Sub3_Sub4_5 = local371.aClass1_Sub3_Sub4_4;
					this.aBooleanArray25 = null;
					Static148.method2387(this.aClass1_Sub3_Sub4_5, this.aByte104, arg1, arg2, null);
					this.anInt8321 = -1;
					this.anInt8331 = local13.anInt8416;
				}
				this.anInt8332 = local183.J();
				this.anInt8316 = local183.RA();
			}
		}
		this.anInt8335 = arg2;
		this.anInt8334 = arg1;
		this.anInt8336 = local13.anInt8416;
		return local183;
	}

	@OriginalMember(owner = "client!sw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub5_7 != null) {
			this.aClass20_Sub5_7.method3661();
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)V")
	private void method6926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass131_3 == null) {
				if (this.aBoolean603) {
					return;
				}
				this.method6927(-1);
				if (this.aClass131_3 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static81.anInt1910 - this.anInt8315;
			if (local32 > 100 && this.aClass131_3.anInt3744 > 0) {
				@Pc(49) int local49 = this.aClass131_3.anIntArray202.length - this.aClass131_3.anInt3744;
				while (local49 > this.anInt8326 && local32 > this.aClass131_3.anIntArray204[this.anInt8326]) {
					local32 -= this.aClass131_3.anIntArray204[this.anInt8326];
					this.anInt8326++;
				}
				if (this.anInt8326 >= local49) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local49; local94 < this.aClass131_3.anIntArray202.length; local94++) {
						local92 += this.aClass131_3.anIntArray204[local94];
					}
					local32 %= local92;
				}
				this.anInt8333 = this.anInt8326 + 1;
				if (this.anInt8333 >= this.aClass131_3.anIntArray202.length) {
					this.anInt8333 -= this.aClass131_3.anInt3744;
					if (this.anInt8333 < 0 || this.aClass131_3.anIntArray202.length <= this.anInt8333) {
						this.anInt8333 = -1;
					}
				}
			}
			while (this.aClass131_3.anIntArray204[this.anInt8326] < local32) {
				Static171.method2603(this.anInt8326, arg1, this.aClass131_3, arg0, this.aByte105, false);
				local32 -= this.aClass131_3.anIntArray204[this.anInt8326];
				this.anInt8326++;
				if (this.aClass131_3.anIntArray202.length <= this.anInt8326) {
					this.anInt8326 -= this.aClass131_3.anInt3744;
					if (this.anInt8326 < 0 || this.anInt8326 >= this.aClass131_3.anIntArray202.length) {
						this.aClass131_3 = null;
						continue label80;
					}
				}
				this.anInt8333 = this.anInt8326 + 1;
				if (this.anInt8333 >= this.aClass131_3.anIntArray202.length) {
					this.anInt8333 -= this.aClass131_3.anInt3744;
					if (this.anInt8333 < 0 || this.anInt8333 >= this.aClass131_3.anIntArray202.length) {
						this.anInt8333 = -1;
					}
				}
			}
			this.anInt8315 = Static81.anInt1910 - local32;
			this.anInt8319 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(II)V")
	private void method6927(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(25) Class306 local25 = Static146.aClass214_1.method4897(this.anInt8330);
			@Pc(27) Class306 local27 = local25;
			if (local25.anIntArray570 != null) {
				local25 = local25.method6966(Static121.aClass148_1);
			}
			if (local25 == null) {
				return;
			}
			if (local27 == local25) {
				local27 = null;
			}
			if (local25.anIntArray571 != null) {
				if (this.aClass131_3 != null && local25.method6975(this.aClass131_3.anInt3737)) {
					return;
				}
				local13 = local25.method6965();
				if (this.anInt8336 != local25.anInt8416) {
					local15 = local25.aBoolean619;
				}
			} else if (local25.anInt8397 == -1) {
				if (local27 != null && local27.anIntArray571 != null) {
					if (this.aClass131_3 != null && local27.method6975(this.aClass131_3.anInt3737)) {
						return;
					}
					local13 = local27.method6965();
					if (this.anInt8336 != local27.anInt8416) {
						local15 = local27.aBoolean619;
					}
				} else if (local27 != null && local27.anInt8397 != -1 && this.anInt8336 != local27.anInt8416) {
					local15 = local27.aBoolean619;
					local13 = local27.anInt8397;
				}
			} else if (this.anInt8336 != local25.anInt8416) {
				local15 = local25.aBoolean619;
				local13 = local25.anInt8397;
			}
		}
		if (local13 == -1) {
			this.aClass131_3 = null;
			return;
		}
		this.aClass61_6 = null;
		if (this.aClass131_3 == null || local13 != this.aClass131_3.anInt3737) {
			this.aClass131_3 = Static594.aClass311_2.method7009(local13);
		} else if (this.aClass131_3.anInt3742 == 0) {
			return;
		}
		if (this.aClass131_3.anIntArray202 == null) {
			this.aClass131_3 = null;
			return;
		}
		if (local15) {
			this.anInt8326 = (int) ((double) this.aClass131_3.anIntArray202.length * Math.random());
			this.anInt8319 = (int) ((double) this.aClass131_3.anIntArray204[this.anInt8326] * Math.random()) + 1;
		} else {
			this.anInt8319 = 1;
			this.anInt8326 = 0;
		}
		this.anInt8333 = this.anInt8326 + 1;
		if (this.anInt8333 < 0 || this.anInt8333 >= this.aClass131_3.anIntArray202.length) {
			this.anInt8333 = -1;
		}
		this.anInt8315 = Static81.anInt1910 - this.anInt8319;
	}
}
