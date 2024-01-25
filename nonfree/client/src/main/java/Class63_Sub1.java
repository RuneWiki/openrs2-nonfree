import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!et", name = "w", descriptor = "I")
	public int anInt1593;

	@OriginalMember(owner = "client!et", name = "z", descriptor = "I")
	public int anInt1596;

	@OriginalMember(owner = "client!et", name = "A", descriptor = "I")
	public int anInt1597;

	@OriginalMember(owner = "client!et", name = "D", descriptor = "Lclient!mo;")
	private Class160 aClass160_17;

	@OriginalMember(owner = "client!et", name = "H", descriptor = "F")
	private float aFloat8;

	@OriginalMember(owner = "client!et", name = "J", descriptor = "I")
	public int anInt1602;

	@OriginalMember(owner = "client!et", name = "K", descriptor = "I")
	public int anInt1603;

	@OriginalMember(owner = "client!et", name = "L", descriptor = "I")
	public int anInt1604;

	@OriginalMember(owner = "client!et", name = "N", descriptor = "I")
	public int anInt1605;

	@OriginalMember(owner = "client!et", name = "P", descriptor = "Lclient!kf;")
	public Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
	public int anInt1607;

	@OriginalMember(owner = "client!et", name = "R", descriptor = "I")
	public int anInt1608;

	@OriginalMember(owner = "client!et", name = "bb", descriptor = "I")
	private int anInt1615;

	@OriginalMember(owner = "client!et", name = "cb", descriptor = "I")
	public int anInt1616;

	@OriginalMember(owner = "client!et", name = "eb", descriptor = "Z")
	public boolean aBoolean120;

	@OriginalMember(owner = "client!et", name = "ib", descriptor = "F")
	private float aFloat9;

	@OriginalMember(owner = "client!et", name = "mb", descriptor = "[Lclient!sq;")
	private Class219[] aClass219Array1;

	@OriginalMember(owner = "client!et", name = "qb", descriptor = "Lclient!lq;")
	private Class2_Sub27 aClass2_Sub27_1;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "I")
	public int anInt1600 = 0;

	@OriginalMember(owner = "client!et", name = "G", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!et", name = "B", descriptor = "I")
	public int anInt1598 = 512;

	@OriginalMember(owner = "client!et", name = "C", descriptor = "I")
	public int anInt1599 = 75518;

	@OriginalMember(owner = "client!et", name = "T", descriptor = "I")
	public int anInt1610 = 0;

	@OriginalMember(owner = "client!et", name = "X", descriptor = "I")
	public int anInt1611 = 512;

	@OriginalMember(owner = "client!et", name = "F", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "I")
	public int anInt1595 = 45823;

	@OriginalMember(owner = "client!et", name = "W", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!et", name = "S", descriptor = "I")
	public int anInt1609 = 0;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "I")
	private int anInt1594 = 0;

	@OriginalMember(owner = "client!et", name = "Z", descriptor = "I")
	public int anInt1613 = 50;

	@OriginalMember(owner = "client!et", name = "M", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!et", name = "hb", descriptor = "I")
	public int anInt1618 = 0;

	@OriginalMember(owner = "client!et", name = "I", descriptor = "I")
	private int anInt1601 = 0;

	@OriginalMember(owner = "client!et", name = "nb", descriptor = "I")
	public int anInt1621 = 0;

	@OriginalMember(owner = "client!et", name = "db", descriptor = "I")
	public int anInt1617 = 78642;

	@OriginalMember(owner = "client!et", name = "lb", descriptor = "I")
	public int lb = 3500;

	@OriginalMember(owner = "client!et", name = "kb", descriptor = "I")
	public int anInt1620 = 0;

	@OriginalMember(owner = "client!et", name = "jb", descriptor = "I")
	public int anInt1619 = 0;

	@OriginalMember(owner = "client!et", name = "ab", descriptor = "I")
	private int anInt1614 = 3500;

	@OriginalMember(owner = "client!et", name = "O", descriptor = "I")
	public int anInt1606 = this.anInt1614 - 255;

	@OriginalMember(owner = "client!et", name = "ob", descriptor = "I")
	private int anInt1622 = 0;

	@OriginalMember(owner = "client!et", name = "V", descriptor = "Lclient!mo;")
	private final Class160 aClass160_18 = new Class160(16);

	@OriginalMember(owner = "client!et", name = "fb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!et", name = "U", descriptor = "Lclient!md;")
	private Class123 aClass123_1;

	@OriginalMember(owner = "client!et", name = "gb", descriptor = "[I")
	public int[] anIntArray359;

	@OriginalMember(owner = "client!et", name = "pb", descriptor = "I")
	public int anInt1623;

	@OriginalMember(owner = "client!et", name = "Y", descriptor = "I")
	private int anInt1612;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!tq;I)V")
	public Class63_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2) {
		super(arg2, arg1);
		this.aCanvas1 = arg0;
		this.aClass123_1 = Static143.method2684(this.aCanvas1);
		this.anIntArray359 = this.aClass123_1.anIntArray969;
		this.anInt1623 = this.aClass123_1.anInt4907;
		this.anInt1612 = this.aClass123_1.anInt4906;
		this.method1510();
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method2015(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method2015(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt1600) {
					arg1 += local104 * (this.anInt1600 - arg0);
					arg0 = this.anInt1600;
				}
				if (arg2 >= this.anInt1620) {
					arg2 = this.anInt1620 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1610 && local150 < this.anInt1618) {
							this.anIntArray359[arg0 + local150 * this.anInt1623] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1610 && local213 < this.anInt1618) {
							local228 = arg0 + local213 * this.anInt1623;
							local233 = this.anIntArray359[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray359[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt1610) {
					arg0 += local104 * (this.anInt1610 - arg1);
					arg1 = this.anInt1610;
				}
				if (arg3 >= this.anInt1618) {
					arg3 = this.anInt1618 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1600 && local150 < this.anInt1620) {
							this.anIntArray359[local150 + arg1 * this.anInt1623] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1600 && local213 < this.anInt1620) {
							local228 = local213 + arg1 * this.anInt1623;
							local233 = this.anIntArray359[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray359[local213 + arg1 * this.anInt1623] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method1960(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method1960(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!n;Lclient!pa;Lclient!de;Lclient!r;I)V")
	@Override
	public void method2055(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) Class10_Sub7 arg3) {
		((Class66_Sub2) arg0).method5178(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!et", name = "L", descriptor = "()Z")
	@Override
	public boolean method2057() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	@Override
	public void method2004(@OriginalArg(0) int arg0) {
		if (this.anInt1604 == arg0) {
			return;
		}
		this.anInt1604 = arg0;
		this.aClass219Array1 = new Class219[this.anInt1604];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1604; local14++) {
			this.aClass219Array1[local14] = new Class219(this);
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "()V")
	@Override
	public void method1952() {
		this.anInt1621 = this.anInt1594;
		this.aBoolean117 = false;
	}

	@OriginalMember(owner = "client!et", name = "q", descriptor = "()I")
	@Override
	public int method1990() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "(I)Z")
	public boolean method1506(@OriginalArg(0) int arg0) {
		return super.anInterface9_3.method142(arg0);
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "(I)Z")
	public boolean method1507(@OriginalArg(0) int arg0) {
		return this.aBoolean118 || super.anInterface9_3.method139(arg0).aBoolean249;
	}

	@OriginalMember(owner = "client!et", name = "J", descriptor = "()V")
	@Override
	public void method2049() {
		if (this.aCanvas1 == null || this.aClass123_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass123_1.method4319(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class219 local3 = this.method1515(Thread.currentThread());
		@Pc(6) Class43 local6 = local3.aClass43_1;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(66) int local66 = arg5 * local50 >> 17;
		@Pc(74) int local74 = arg5 * local50 + 1 >> 17;
		@Pc(80) int local80 = arg5 * local44 >> 17;
		@Pc(88) int local88 = arg5 * local44 + 1 >> 17;
		@Pc(93) int local93 = arg0 - local6.method887();
		@Pc(98) int local98 = arg1 - local6.method889();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt1064 = 0;
		local6.aBoolean83 = local102 < 0 || local102 > local6.anInt1063 || local106 < 0 || local106 > local6.anInt1063 || local112 < 0 || local112 > local6.anInt1063;
		local6.method892(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean83 = local102 < 0 || local102 > local6.anInt1063 || local106 < 0 || local106 > local6.anInt1063 || local118 < 0 || local118 > local6.anInt1063;
		local6.method892(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(I)V")
	@Override
	public void method2042(@OriginalArg(0) int arg0) {
		this.aClass219Array1[arg0].method4710(null);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1610 || arg1 >= this.anInt1618) {
			return;
		}
		if (arg0 < this.anInt1600) {
			arg2 -= this.anInt1600 - arg0;
			arg0 = this.anInt1600;
		}
		if (arg0 + arg2 > this.anInt1620) {
			arg2 = this.anInt1620 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1623;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray359[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray359[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray359[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray359[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray359[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(II)V")
	@Override
	public void method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1613 = arg0;
		this.anInt1614 = arg1;
		this.anInt1606 = this.anInt1614 - 255;
		this.method1509();
	}

	@OriginalMember(owner = "client!et", name = "C", descriptor = "()V")
	@Override
	public void method2022() {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!pa;)V")
	@Override
	public void method1973(@OriginalArg(0) Class186 arg0) {
		@Pc(3) Class10_Sub8 local3 = arg0.aClass148_1.aClass10_Sub8_1;
		for (@Pc(6) Class10_Sub8 local6 = local3.aClass10_Sub8_8; local6 != local3; local6 = local6.aClass10_Sub8_8) {
			@Pc(10) Class10_Sub8_Sub1 local10 = (Class10_Sub8_Sub1) local6;
			@Pc(15) int local15 = local10.anInt5294 >> 12;
			@Pc(20) int local20 = local10.anInt5295 >> 12;
			@Pc(25) int local25 = local10.anInt5296 >> 12;
			@Pc(49) int local49 = this.aClass44_Sub1_1.anInt3396 + (this.aClass44_Sub1_1.anInt3392 * local15 + this.aClass44_Sub1_1.anInt3395 * local20 + this.aClass44_Sub1_1.anInt3397 * local25 >> 15);
			if (local49 >= this.anInt1613 && local49 <= this.anInt1614) {
				@Pc(90) int local90 = this.anInt1603 + this.anInt1611 * (this.aClass44_Sub1_1.anInt3394 + (this.aClass44_Sub1_1.anInt3398 * local15 + this.aClass44_Sub1_1.anInt3389 * local20 + this.aClass44_Sub1_1.anInt3391 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt1596 + this.anInt1598 * (this.aClass44_Sub1_1.anInt3393 + (this.aClass44_Sub1_1.anInt3390 * local15 + this.aClass44_Sub1_1.anInt3399 * local20 + this.aClass44_Sub1_1.anInt3388 * local25 >> 15)) / local49;
				if (local90 >= this.anInt1600 && local90 <= this.anInt1620 && local122 >= this.anInt1610 && local122 <= this.anInt1618) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1511(local10, local90, local122, (local10.anInt5302 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIILclient!oj;II)V")
	@Override
	public void method1964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class165 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class165_Sub1 local2 = (Class165_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray774;
		@Pc(8) int[] local8 = local2.anIntArray775;
		@Pc(17) int local17 = this.anInt1610 > arg7 ? this.anInt1610 : arg7;
		@Pc(32) int local32 = this.anInt1618 < arg7 + local5.length ? this.anInt1618 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt1600 && local129 < this.anInt1620 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray359[local129 + arg1 * this.anInt1623] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt1600 && local133 < this.anInt1620 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1623;
						local248 = this.anIntArray359[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray359[local133 + arg1 * this.anInt1623] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt1600) {
			arg1 += local83 * (this.anInt1600 - arg0);
			arg0 = this.anInt1600;
		}
		if (arg2 >= this.anInt1620) {
			arg2 = this.anInt1620 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray359[arg0 + local129 * this.anInt1623] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt1623;
					local248 = this.anIntArray359[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray359[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([Lclient!n;Lclient!pa;Lclient!de;[Lclient!r;I)V")
	@Override
	public void method1969(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) Class10_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class66_Sub2[] local3 = new Class66_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class66_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class66_Sub2 local26 = Static352.method5177(this, local3);
		local26.method5178(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!et", name = "u", descriptor = "()V")
	@Override
	public void method2001() {
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "()V")
	@Override
	public void method1968() {
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(IIII)[I")
	@Override
	public int[] method2010() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt1623;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray359[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!rp;)V")
	@Override
	public void method1989(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!et", name = "k", descriptor = "(I)I")
	public int method1508(@OriginalArg(0) int arg0) {
		return super.anInterface9_3.method139(arg0).aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!et", name = "I", descriptor = "()I")
	@Override
	public int method2043() {
		@Pc(2) int local2 = this.anInt1622;
		this.anInt1622 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
	@Override
	public void method2020(@OriginalArg(0) int arg0) {
		this.method1982(0, 0, this.anInt1623, this.anInt1612, arg0, 0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	@Override
	public void method1992(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!et", name = "D", descriptor = "()Lclient!de;")
	@Override
	public Class44 method2024() {
		@Pc(3) Class219 local3 = this.method1515(Thread.currentThread());
		return local3.aClass44_Sub1_2;
	}

	@OriginalMember(owner = "client!et", name = "k", descriptor = "()Z")
	@Override
	public boolean method1971() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([I)V")
	@Override
	public void method1962(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1600;
		arg0[1] = this.anInt1610;
		arg0[2] = this.anInt1620;
		arg0[3] = this.anInt1618;
	}

	@OriginalMember(owner = "client!et", name = "F", descriptor = "()Z")
	@Override
	public boolean method2036() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2015(arg0, arg1, arg2, arg4, arg5);
		this.method2015(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method1960(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method1960(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "()V")
	private void method1509() {
		if (this.aFloat8 == 0.0F) {
			this.lb = this.anInt1614;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1614;
		@Pc(12) float local12 = (float) this.anInt1613;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat9 / (this.aFloat8 + this.aFloat9);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat8;
		this.lb = (int) (((float) this.anInt1614 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass44_Sub1_1.anInt3392 * arg0 + this.aClass44_Sub1_1.anInt3395 * arg1 + this.aClass44_Sub1_1.anInt3397 * arg2 >> 15) + this.aClass44_Sub1_1.anInt3396;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass44_Sub1_1.anInt3392 * arg3 + this.aClass44_Sub1_1.anInt3395 * arg4 + this.aClass44_Sub1_1.anInt3397 * arg5 >> 15) + this.aClass44_Sub1_1.anInt3396;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1613 && local52 < this.anInt1613 || !(local23 <= this.anInt1614 || local52 <= this.anInt1614)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1611 * ((this.aClass44_Sub1_1.anInt3398 * arg0 + this.aClass44_Sub1_1.anInt3389 * arg1 + this.aClass44_Sub1_1.anInt3391 * arg2 >> 15) + this.aClass44_Sub1_1.anInt3394) / local23;
		@Pc(133) int local133 = this.anInt1611 * ((this.aClass44_Sub1_1.anInt3398 * arg3 + this.aClass44_Sub1_1.anInt3389 * arg4 + this.aClass44_Sub1_1.anInt3391 * arg5 >> 15) + this.aClass44_Sub1_1.anInt3394) / local52;
		if (local104 < this.anInt1607 && local133 < this.anInt1607 || local104 > this.anInt1605 && local133 > this.anInt1605) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1598 * ((this.aClass44_Sub1_1.anInt3390 * arg0 + this.aClass44_Sub1_1.anInt3399 * arg1 + this.aClass44_Sub1_1.anInt3388 * arg2 >> 15) + this.aClass44_Sub1_1.anInt3393) / local23;
			@Pc(209) int local209 = this.anInt1598 * ((this.aClass44_Sub1_1.anInt3390 * arg3 + this.aClass44_Sub1_1.anInt3399 * arg4 + this.aClass44_Sub1_1.anInt3388 * arg5 >> 15) + this.aClass44_Sub1_1.anInt3393) / local52;
			return (local180 >= this.anInt1602 || local209 >= this.anInt1602) && (local180 <= this.anInt1593 || local209 <= this.anInt1593);
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1600 < arg0) {
			this.anInt1600 = arg0;
		}
		if (this.anInt1610 < arg1) {
			this.anInt1610 = arg1;
		}
		if (this.anInt1620 > arg2) {
			this.anInt1620 = arg2;
		}
		if (this.anInt1618 > arg3) {
			this.anInt1618 = arg3;
		}
		this.method1517();
	}

	@OriginalMember(owner = "client!et", name = "t", descriptor = "()Z")
	@Override
	public boolean method1996() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "(IIIIII)Lclient!rp;")
	@Override
	public Class21 method2033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II[[I[[IIII)Lclient!ij;")
	@Override
	public Class107 method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class107_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1600) {
			arg2 -= this.anInt1600 - arg0;
			arg0 = this.anInt1600;
		}
		if (arg1 < this.anInt1610) {
			arg3 -= this.anInt1610 - arg1;
			arg1 = this.anInt1610;
		}
		if (arg0 + arg2 > this.anInt1620) {
			arg2 = this.anInt1620 - arg0;
		}
		if (arg1 + arg3 > this.anInt1618) {
			arg3 = this.anInt1618 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1620 || arg1 > this.anInt1618) {
			return;
		}
		@Pc(67) int local67 = this.anInt1623 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1623;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(221) int local221;
			if (arg5 == 1) {
				@Pc(205) int local205 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local78 >> 8 & 0xFF00) + (local78 << 24);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local221 = this.anIntArray359[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray359[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray359[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray359[local74++] = local221 - local298 | local298 - (local298 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray359[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)V")
	@Override
	public void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1623) {
			arg2 = this.anInt1623;
		}
		if (arg3 > this.anInt1612) {
			arg3 = this.anInt1612;
		}
		this.anInt1600 = arg0;
		this.anInt1620 = arg2;
		this.anInt1610 = arg1;
		this.anInt1618 = arg3;
		this.method1517();
	}

	@OriginalMember(owner = "client!et", name = "z", descriptor = "()Z")
	@Override
	public boolean method2013() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "B", descriptor = "()V")
	@Override
	public void method2021() {
		this.aClass160_17.method3595();
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IIII)V")
	@Override
	public void method1978() {
		this.anInt1594 = this.anInt1621;
		this.anInt1609 = -1;
		this.anInt1621 = 1583160;
		this.anInt1619 = 40;
		this.aBoolean117 = true;
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "()V")
	@Override
	public void method1956() {
		this.aClass123_1 = Static143.method2684(this.aCanvas1);
		this.anIntArray359 = this.aClass123_1.anIntArray969;
		this.anInt1623 = this.aClass123_1.anInt4907;
		this.anInt1612 = this.aClass123_1.anInt4906;
		for (@Pc(22) int local22 = 0; local22 < this.anInt1604; local22++) {
			this.aClass219Array1[local22].method4708();
		}
		this.method1967();
	}

	@OriginalMember(owner = "client!et", name = "o", descriptor = "()Z")
	@Override
	public boolean method1986() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V")
	@Override
	public void method2044(@OriginalArg(0) int arg0) {
		this.aClass219Array1[arg0].method4710(Thread.currentThread());
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(II)I")
	@Override
	public int method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "()V")
	private void method1510() {
		this.aClass160_17 = new Class160(20);
		this.aClass44_Sub1_1 = new Class44_Sub1();
		Static342.method5006(false);
		this.aBoolean119 = true;
		this.method2004(1);
		this.method2044(0);
		this.method1967();
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "()Z")
	@Override
	public boolean method1953() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1603 = arg0;
		this.anInt1596 = arg1;
		this.anInt1611 = arg2;
		this.anInt1598 = arg3;
		this.method1517();
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(II)I")
	@Override
	public int method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
	@Override
	public void method1991(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1615;
		for (@Pc(9) Object local9 = this.aClass160_17.method3604(); local9 != null; local9 = this.aClass160_17.method3607()) {
			@Pc(13) Class2_Sub34 local13 = (Class2_Sub34) local9;
			if (local13.aBoolean355) {
				local13.anInt4764 += local4;
				@Pc(27) int local27 = local13.anInt4764 / 20;
				if (local27 > 0) {
					@Pc(36) Class132 local36 = super.anInterface9_3.method139(local13.anInt4765);
					local13.method4206(local36.aByte31 * local4 * 50 / 1000, local36.aByte29 * local4 * 50 / 1000);
					local13.anInt4764 -= local27 * 20;
				}
				local13.aBoolean355 = false;
			}
		}
		this.anInt1615 = arg0;
		this.aClass160_18.method3606(5);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!kg;[Lclient!gm;Z)Lclient!am;")
	@Override
	public Class9 method2034(@OriginalArg(0) Class136 arg0, @OriginalArg(1) Class86[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2411;
			local7[local11] = arg1[local11].anInt2410;
			if (arg1[local11].aByteArray34 != null) {
			}
		}
		return new Class9_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(F)V")
	@Override
	public void method1959(@OriginalArg(0) float arg0) {
		this.anInt1599 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!vm;III)V")
	public void method1511(@OriginalArg(0) Class10_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt5303;
		if (local6 == -1) {
			this.method2026(arg1, arg2, local3, arg0.anInt5301);
			return;
		}
		if (this.aClass2_Sub27_1 == null || this.aClass2_Sub27_1.aLong209 != (long) local6) {
			this.aClass2_Sub27_1 = (Class2_Sub27) this.aClass160_18.method3599((long) local6);
		}
		if (this.aClass2_Sub27_1 == null) {
			@Pc(44) int[] local44 = this.method1516(local6);
			if (local44 == null) {
				return;
			}
			this.aClass2_Sub27_1 = new Class2_Sub27();
			this.aClass2_Sub27_1.aBoolean284 = this.method1507(local6);
			@Pc(65) int local65 = this.aClass2_Sub27_1.aBoolean284 ? 64 : 128;
			this.aClass2_Sub27_1.aClass18_16 = this.method2029(local44, local65, local65, local65);
			this.aClass160_18.method3602((long) local6, this.aClass2_Sub27_1);
		}
		if (this.aClass2_Sub27_1.aBoolean284) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass2_Sub27_1.aClass18_16.method4569(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt5301, 1);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass44_Sub1_1.anInt3396 + (this.aClass44_Sub1_1.anInt3392 * arg0 + this.aClass44_Sub1_1.anInt3395 * arg1 + this.aClass44_Sub1_1.anInt3397 * arg2 >> 15);
		if (local23 < this.anInt1613 || local23 > this.anInt1614) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1611 * (this.aClass44_Sub1_1.anInt3394 + (this.aClass44_Sub1_1.anInt3398 * arg0 + this.aClass44_Sub1_1.anInt3389 * arg1 + this.aClass44_Sub1_1.anInt3391 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt1598 * (this.aClass44_Sub1_1.anInt3393 + (this.aClass44_Sub1_1.anInt3390 * arg0 + this.aClass44_Sub1_1.anInt3399 * arg1 + this.aClass44_Sub1_1.anInt3388 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt1607 && local73 <= this.anInt1605 && local102 >= this.anInt1602 && local102 <= this.anInt1593) {
			arg3[0] = local73 - this.anInt1607;
			arg3[1] = local102 - this.anInt1602;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!et", name = "A", descriptor = "()I")
	@Override
	public int method2018() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIZ)Lclient!rn;")
	@Override
	public Class18 method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1623 + arg0;
		@Pc(16) int local16 = this.anInt1623 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray359[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class18_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class18_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!et", name = "y", descriptor = "()Z")
	@Override
	public boolean method2012() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "p", descriptor = "()I")
	@Override
	public int method1987() {
		@Pc(2) int local2 = this.anInt1601;
		this.anInt1601 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!oj;II)V")
	@Override
	public void method1977(@OriginalArg(1) Class165 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class165_Sub1 local2 = (Class165_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray774;
		@Pc(8) int[] local8 = local2.anIntArray775;
		@Pc(20) int local20;
		if (this.anInt1618 < arg2 + local5.length) {
			local20 = this.anInt1618 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1610 > arg2) {
			local33 = this.anInt1610 - arg2;
			arg2 = this.anInt1610;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt1623;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1600 > local58) {
				local62 -= this.anInt1600 - local58;
				local58 = this.anInt1600;
			}
			if (this.anInt1620 < local58 + local62) {
				local62 = this.anInt1620 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray359[local58++] = -16777216;
			}
			local49 += this.anInt1623;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
	@Override
	public void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1621 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1621 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1621 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1621 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1621 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean120 = false;
		} else {
			this.aBoolean120 = true;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1623;
		@Pc(35) int local35 = this.anInt1623 - arg2;
		if (arg1 + arg3 > this.anInt1618) {
			arg3 -= arg1 + arg3 - this.anInt1618;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1610) {
			local59 = this.anInt1610 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1623;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1620) {
			local59 = arg0 + arg2 - this.anInt1620;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1600) {
			local59 = this.anInt1600 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 = local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray359[local30++] = arg4;
					} else {
						this.anIntArray359[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray359[local30];
					this.anIntArray359[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray359[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray359[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "(I)Z")
	public boolean method1512(@OriginalArg(0) int arg0) {
		return super.anInterface9_3.method139(arg0).aBoolean252;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[Lclient!nq;)V")
	@Override
	public void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17[] arg1) {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(FFF)V")
	@Override
	public void method1988(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(Z)V")
	@Override
	public void method2053(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!et", name = "w", descriptor = "()I")
	@Override
	public int method2003() {
		return this.anInt1614;
	}

	@OriginalMember(owner = "client!et", name = "E", descriptor = "()Z")
	@Override
	public boolean method2032() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "()V")
	@Override
	public void method1967() {
		this.anInt1600 = 0;
		this.anInt1610 = 0;
		this.anInt1620 = this.anInt1623;
		this.anInt1618 = this.anInt1612;
		this.method1517();
	}

	@OriginalMember(owner = "client!et", name = "v", descriptor = "()F")
	@Override
	public float method2002() {
		return this.aFloat9;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!hb;)V")
	@Override
	public void method2014(@OriginalArg(0) Class2_Sub20 arg0) {
	}

	@OriginalMember(owner = "client!et", name = "G", descriptor = "()I")
	@Override
	public int method2039() {
		return this.anInt1613;
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "()Z")
	@Override
	public boolean method1966() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)Lclient!hb;")
	@Override
	public Class2_Sub20 method2037() {
		return null;
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "()Z")
	@Override
	public boolean method1974() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([IIIII)Lclient!rn;")
	@Override
	public Class18 method2029(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class18_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class18_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class18_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class18_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1600 || arg0 >= this.anInt1620) {
			return;
		}
		if (arg1 < this.anInt1610) {
			arg2 -= this.anInt1610 - arg1;
			arg1 = this.anInt1610;
		}
		if (arg1 + arg2 > this.anInt1618) {
			arg2 = this.anInt1618 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1623;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray359[local40 + local54 * this.anInt1623] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt1623;
				local116 = this.anIntArray359[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray359[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1623;
				local111 = this.anIntArray359[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray359[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!gm;Z)Lclient!rn;")
	@Override
	public Class18 method2000(@OriginalArg(0) Class86 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray455;
		@Pc(5) byte[] local5 = arg0.aByteArray35;
		@Pc(8) int local8 = arg0.anInt2411;
		@Pc(11) int local11 = arg0.anInt2410;
		@Pc(76) Class18_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray34 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class18_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray34;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class18_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class18_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class18_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.method4552(arg0.anInt2408, arg0.anInt2407, arg0.anInt2409, arg0.anInt2412);
		return local76;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method1981(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas1 == null || this.aClass123_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1623 && local21.y <= this.anInt1612 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass123_1.method4320(local21.y, local14, local21.x, local21.width, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(FF)V")
	@Override
	public void method2030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat9 = arg0;
		this.aFloat8 = arg1;
		this.method1509();
	}

	@OriginalMember(owner = "client!et", name = "n", descriptor = "()V")
	@Override
	protected void method1980() {
		if (this.aBoolean119) {
			Static6.method145(false);
			this.aBoolean119 = false;
		}
		this.aCanvas1 = null;
		this.aClass123_1 = null;
		this.aBoolean116 = true;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([Lclient!n;Lclient!de;[Lclient!r;I)V")
	@Override
	public void method2007(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class10_Sub7[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class66_Sub2[] local3 = new Class66_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class66_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class66_Sub2 local26 = Static352.method5177(this, local3);
		local26.method5178(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II[I[I)Lclient!oj;")
	@Override
	public Class165 method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class165_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!et", name = "m", descriptor = "(I)[I")
	public int[] method1513(@OriginalArg(0) int arg0) {
		@Pc(2) Class160 local2 = this.aClass160_17;
		@Pc(12) Class2_Sub34 local12;
		synchronized (this.aClass160_17) {
			local12 = (Class2_Sub34) this.aClass160_17.method3599((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_3.method142(arg0)) {
					return null;
				}
				@Pc(32) Class132 local32 = super.anInterface9_3.method139(arg0);
				@Pc(42) int local42 = local32.aBoolean249 || this.aBoolean118 ? 64 : 128;
				local12 = new Class2_Sub34(arg0, local42, super.anInterface9_3.method143(arg0, local42, local42, true, 0.7F), local32.aBoolean256);
				this.aClass160_17.method3602((long) arg0, local12);
			}
		}
		local12.aBoolean355 = true;
		return local12.method4205();
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1609 = arg0;
		this.anInt1621 = arg1;
		this.anInt1619 = arg2;
	}

	@OriginalMember(owner = "client!et", name = "s", descriptor = "()Lclient!de;")
	@Override
	public Class44 method1995() {
		return new Class44_Sub1();
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "()Z")
	@Override
	public boolean method1957() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "m", descriptor = "()Z")
	@Override
	public boolean method1979() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "()Z")
	public boolean method1514() {
		return this.aBoolean116;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!sq;")
	public Class219 method1515(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1604; local1++) {
			if (this.aClass219Array1[local1].aRunnable1 == arg0) {
				return this.aClass219Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!qi;IIII)Lclient!n;")
	@Override
	public Class66 method1998(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class66_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V")
	@Override
	public void method1997(@OriginalArg(0) boolean arg0) {
		this.aBoolean118 = arg0;
		this.aClass160_17.method3595();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!de;)V")
	@Override
	public void method1961(@OriginalArg(0) Class44 arg0) {
		this.aClass44_Sub1_1 = (Class44_Sub1) arg0;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1610) {
			local8 = this.anInt1610;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1618) {
			local21 = this.anInt1618;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt1600) {
					local91 = this.anInt1600;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1620) {
					local102 = this.anInt1620;
				}
				local116 = local91 + local30 * this.anInt1623;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray359[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt1600) {
					local91 = this.anInt1600;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1620 - 1) {
					local102 = this.anInt1620 - 1;
				}
				local116 = local91 + local30 * this.anInt1623;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray359[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local91 = 256 - local57;
		@Pc(334) int local334;
		@Pc(340) int local340;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local102 = arg0 + 1 - local36;
			if (local102 < this.anInt1600) {
				local102 = this.anInt1600;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1620) {
				local116 = this.anInt1620;
			}
			local118 = local102 + local30 * this.anInt1623;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray359[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray359[local118++] = local277 + local360;
			}
			local30++;
			local44 -= local40-- + local40;
			local48 -= local40 + local40;
		}
		local36 = arg2;
		local40 = -local40;
		local48 = local40 * local40 + local34;
		local44 = local48 - arg2;
		local48 -= local40;
		while (local30 < local21) {
			while (local48 > local34 && local44 > local34) {
				local48 -= local36-- + local36;
				local44 -= local36 + local36;
			}
			local102 = arg0 - local36;
			if (local102 < this.anInt1600) {
				local102 = this.anInt1600;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1620 - 1) {
				local116 = this.anInt1620 - 1;
			}
			local118 = local102 + local30 * this.anInt1623;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray359[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray359[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(IIII)V")
	@Override
	public void method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!et", name = "x", descriptor = "()Z")
	@Override
	public boolean method2005() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method1993(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.method1956();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2040() {
		@Pc(3) Class219 local3 = this.method1515(Thread.currentThread());
		@Pc(6) Class43 local6 = local3.aClass43_1;
		local6.aBoolean86 = false;
		local6.aBoolean86 = false;
		local6.anInt1064 = 0;
		local6.aBoolean83 = true;
		local6.method891(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean86 = true;
	}

	@OriginalMember(owner = "client!et", name = "r", descriptor = "()Z")
	@Override
	public boolean method1994() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!rp;Lclient!rp;FLclient!rp;)Lclient!rp;")
	@Override
	public Class21 method2016(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!et", name = "n", descriptor = "(I)[I")
	private int[] method1516(@OriginalArg(0) int arg0) {
		@Pc(2) Class160 local2 = this.aClass160_17;
		@Pc(12) Class2_Sub34 local12;
		synchronized (this.aClass160_17) {
			local12 = (Class2_Sub34) this.aClass160_17.method3599((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_3.method142(arg0)) {
					return null;
				}
				@Pc(32) Class132 local32 = super.anInterface9_3.method139(arg0);
				@Pc(42) int local42 = local32.aBoolean249 || this.aBoolean118 ? 64 : 128;
				local12 = new Class2_Sub34(arg0, local42, super.anInterface9_3.method141(local42, 0.7F, local42, arg0), local32.aBoolean256);
				this.aClass160_17.method3602((long) arg0, local12);
			}
		}
		local12.aBoolean355 = true;
		return local12.method4205();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1595 = (int) (arg1 * 65535.0F);
		this.anInt1617 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1608 = (int) (arg3 * 65535.0F / local26);
		this.anInt1597 = (int) (arg4 * 65535.0F / local26);
		this.anInt1616 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!et", name = "M", descriptor = "()V")
	private void method1517() {
		this.anInt1607 = this.anInt1600 - this.anInt1603;
		this.anInt1605 = this.anInt1620 - this.anInt1603;
		this.anInt1602 = this.anInt1610 - this.anInt1596;
		this.anInt1593 = this.anInt1618 - this.anInt1596;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1604; local29++) {
			@Pc(36) Class43 local36 = this.aClass219Array1[local29].aClass43_1;
			local36.anInt1062 = this.anInt1603 - this.anInt1600;
			local36.anInt1065 = this.anInt1596 - this.anInt1610;
			local36.anInt1063 = this.anInt1620 - this.anInt1600;
			local36.anInt1066 = this.anInt1618 - this.anInt1610;
		}
		@Pc(78) int local78 = this.anInt1610 * this.anInt1623 + this.anInt1600;
		for (@Pc(81) int local81 = this.anInt1610; local81 < this.anInt1618; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1604; local84++) {
				this.aClass219Array1[local84].aClass43_1.anIntArray218[local81 - this.anInt1610] = local78;
			}
			local78 += this.anInt1623;
		}
	}

	@OriginalMember(owner = "client!et", name = "K", descriptor = "()F")
	@Override
	public float method2056() {
		return this.aFloat8;
	}

	@OriginalMember(owner = "client!et", name = "H", descriptor = "()V")
	@Override
	public void method2041() {
	}
}
