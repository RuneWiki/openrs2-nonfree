import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	public int anInt1471;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	private int anInt1473;

	@OriginalMember(owner = "client!co", name = "E", descriptor = "F")
	private float aFloat6;

	@OriginalMember(owner = "client!co", name = "J", descriptor = "I")
	public int anInt1478;

	@OriginalMember(owner = "client!co", name = "K", descriptor = "[Lclient!de;")
	private Class41[] aClass41Array1;

	@OriginalMember(owner = "client!co", name = "R", descriptor = "I")
	public int anInt1484;

	@OriginalMember(owner = "client!co", name = "T", descriptor = "I")
	public int anInt1485;

	@OriginalMember(owner = "client!co", name = "X", descriptor = "I")
	public int anInt1489;

	@OriginalMember(owner = "client!co", name = "cb", descriptor = "I")
	public int anInt1492;

	@OriginalMember(owner = "client!co", name = "db", descriptor = "Lclient!jo;")
	public Class109_Sub1 aClass109_Sub1_1;

	@OriginalMember(owner = "client!co", name = "fb", descriptor = "F")
	private float aFloat7;

	@OriginalMember(owner = "client!co", name = "gb", descriptor = "Z")
	public boolean aBoolean144;

	@OriginalMember(owner = "client!co", name = "hb", descriptor = "I")
	public int anInt1493;

	@OriginalMember(owner = "client!co", name = "ib", descriptor = "I")
	public int anInt1494;

	@OriginalMember(owner = "client!co", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!co", name = "ob", descriptor = "I")
	public int anInt1498;

	@OriginalMember(owner = "client!co", name = "pb", descriptor = "Lclient!hq;")
	private Class87 aClass87_12;

	@OriginalMember(owner = "client!co", name = "qb", descriptor = "Lclient!lq;")
	private Class1_Sub24 aClass1_Sub24_1;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!co", name = "P", descriptor = "I")
	public int anInt1483 = 0;

	@OriginalMember(owner = "client!co", name = "v", descriptor = "I")
	private int anInt1469 = 0;

	@OriginalMember(owner = "client!co", name = "u", descriptor = "I")
	public int anInt1468 = 0;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "I")
	public int anInt1472 = 512;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "I")
	public int anInt1470 = 50;

	@OriginalMember(owner = "client!co", name = "M", descriptor = "I")
	public int anInt1480 = 78642;

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	public int anInt1479 = 0;

	@OriginalMember(owner = "client!co", name = "Y", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!co", name = "Z", descriptor = "I")
	private int anInt1490 = 0;

	@OriginalMember(owner = "client!co", name = "U", descriptor = "I")
	private int anInt1486 = 0;

	@OriginalMember(owner = "client!co", name = "V", descriptor = "I")
	public int anInt1487 = 75518;

	@OriginalMember(owner = "client!co", name = "N", descriptor = "I")
	public int anInt1481 = 45823;

	@OriginalMember(owner = "client!co", name = "O", descriptor = "I")
	public int anInt1482 = 0;

	@OriginalMember(owner = "client!co", name = "C", descriptor = "I")
	public int anInt1474 = 0;

	@OriginalMember(owner = "client!co", name = "S", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!co", name = "mb", descriptor = "I")
	private int anInt1497 = 3500;

	@OriginalMember(owner = "client!co", name = "jb", descriptor = "I")
	public int anInt1495 = 0;

	@OriginalMember(owner = "client!co", name = "kb", descriptor = "I")
	public int anInt1496 = this.anInt1497 - 255;

	@OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
	public int anInt1491 = 3500;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "I")
	public int anInt1475 = 512;

	@OriginalMember(owner = "client!co", name = "I", descriptor = "I")
	public int anInt1477 = 0;

	@OriginalMember(owner = "client!co", name = "nb", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!co", name = "F", descriptor = "Lclient!hq;")
	private final Class87 aClass87_11 = new Class87(16);

	@OriginalMember(owner = "client!co", name = "z", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!co", name = "eb", descriptor = "Lclient!gd;")
	public Interface2 anInterface2_2;

	@OriginalMember(owner = "client!co", name = "bb", descriptor = "Lclient!lo;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!co", name = "Q", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!co", name = "W", descriptor = "I")
	public int anInt1488;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "I")
	private int anInt1476;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!gd;I)V")
	public Class32_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		this.aCanvas1 = arg0;
		this.anInterface2_2 = arg1;
		super.anInt2472 = arg2;
		this.aClass47_1 = Static336.method5436(this.aCanvas1);
		this.anIntArray116 = this.aClass47_1.anIntArray370;
		this.anInt1488 = this.aClass47_1.anInt4082;
		this.anInt1476 = this.aClass47_1.anInt4083;
		this.method1267();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ts;)V")
	@Override
	public void method2169(@OriginalArg(0) Class114 arg0) {
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "()I")
	@Override
	public int method2151() {
		@Pc(2) int local2 = this.anInt1490;
		this.anInt1490 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!co", name = "u", descriptor = "()I")
	@Override
	public int method2203() {
		return this.anInt1497;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IIII)V")
	@Override
	public void method2218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!co", name = "L", descriptor = "()I")
	@Override
	public int method2240() {
		return 0;
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass109_Sub1_1.anInt3185 * arg0 + this.aClass109_Sub1_1.anInt3180 * arg1 + this.aClass109_Sub1_1.anInt3177 * arg2 >> 15) + this.aClass109_Sub1_1.anInt3183;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass109_Sub1_1.anInt3185 * arg3 + this.aClass109_Sub1_1.anInt3180 * arg4 + this.aClass109_Sub1_1.anInt3177 * arg5 >> 15) + this.aClass109_Sub1_1.anInt3183;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1470 && local52 < this.anInt1470 || !(local23 <= this.anInt1497 || local52 <= this.anInt1497)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1472 * ((this.aClass109_Sub1_1.anInt3187 * arg0 + this.aClass109_Sub1_1.anInt3182 * arg1 + this.aClass109_Sub1_1.anInt3181 * arg2 >> 15) + this.aClass109_Sub1_1.anInt3176) / local23;
		@Pc(133) int local133 = this.anInt1472 * ((this.aClass109_Sub1_1.anInt3187 * arg3 + this.aClass109_Sub1_1.anInt3182 * arg4 + this.aClass109_Sub1_1.anInt3181 * arg5 >> 15) + this.aClass109_Sub1_1.anInt3176) / local52;
		if (local104 < this.anInt1484 && local133 < this.anInt1484 || local104 > this.anInt1492 && local133 > this.anInt1492) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1475 * ((this.aClass109_Sub1_1.anInt3184 * arg0 + this.aClass109_Sub1_1.anInt3179 * arg1 + this.aClass109_Sub1_1.anInt3178 * arg2 >> 15) + this.aClass109_Sub1_1.anInt3186) / local23;
			@Pc(209) int local209 = this.anInt1475 * ((this.aClass109_Sub1_1.anInt3184 * arg3 + this.aClass109_Sub1_1.anInt3179 * arg4 + this.aClass109_Sub1_1.anInt3178 * arg5 >> 15) + this.aClass109_Sub1_1.anInt3186) / local52;
			return (local180 >= this.anInt1489 || local209 >= this.anInt1489) && (local180 <= this.anInt1478 || local209 <= this.anInt1478);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II[I[I)Lclient!em;")
	@Override
	public Class52 method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class52_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(II)V")
	@Override
	public void method2204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1474 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1474 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1474 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1474 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1474 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean144 = false;
		} else {
			this.aBoolean144 = true;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!fa;[Lclient!iq;Z)Lclient!ak;")
	@Override
	public Class9 method2199(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class99[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2875;
			local7[local11] = arg1[local11].anInt2877;
			if (arg1[local11].aByteArray51 != null) {
			}
		}
		return new Class9_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
	@Override
	public void method2195(@OriginalArg(0) int arg0) {
		this.aClass41Array1[arg0].method1341(null);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1483 || arg1 >= this.anInt1495) {
			return;
		}
		if (arg0 < this.anInt1479) {
			arg2 -= this.anInt1479 - arg0;
			arg0 = this.anInt1479;
		}
		if (arg0 + arg2 > this.anInt1482) {
			arg2 = this.anInt1482 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1488;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray116[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray116[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray116[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray116[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray116[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(III)V")
	@Override
	public void method2164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1477 = arg0;
		this.anInt1474 = arg1;
		this.anInt1468 = arg2;
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1471 = arg0;
		this.anInt1498 = arg1;
		this.anInt1472 = arg2;
		this.anInt1475 = arg3;
		this.method1277();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()Z")
	public boolean method1266() {
		return this.aBoolean141;
	}

	@OriginalMember(owner = "client!co", name = "y", descriptor = "()Z")
	@Override
	public boolean method2214() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class41 local3 = this.method1268(Thread.currentThread());
		@Pc(6) Class39 local6 = local3.aClass39_1;
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
		@Pc(93) int local93 = arg0 - local6.method1320();
		@Pc(98) int local98 = arg1 - local6.method1324();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt1552 = 0;
		local6.aBoolean153 = local102 < 0 || local102 > local6.anInt1547 || local106 < 0 || local106 > local6.anInt1547 || local112 < 0 || local112 > local6.anInt1547;
		local6.method1323(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean153 = local102 < 0 || local102 > local6.anInt1547 || local106 < 0 || local106 > local6.anInt1547 || local118 < 0 || local118 > local6.anInt1547;
		local6.method1323(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "()V")
	private void method1267() {
		this.aClass87_12 = new Class87(20);
		this.aClass109_Sub1_1 = new Class109_Sub1();
		Static140.method2826(false);
		this.aBoolean143 = true;
		this.method2147(1);
		this.method2211(0);
		this.method2184();
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(II)V")
	@Override
	public void method2202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1470 = arg0;
		this.anInt1497 = arg1;
		this.anInt1496 = this.anInt1497 - 255;
		this.method1269();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ge;Lclient!sk;Lclient!wr;Lclient!fi;I)V")
	@Override
	public void method2181(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class8_Sub3 arg3) {
		((Class73_Sub1) arg0).method3054(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	@Override
	public void method2180(@OriginalArg(0) int arg0) {
		this.method2241(0, 0, this.anInt1488, this.anInt1476, arg0, 0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIILclient!em;II)V")
	@Override
	public void method2154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class52 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class52_Sub1 local2 = (Class52_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray177;
		@Pc(8) int[] local8 = local2.anIntArray176;
		@Pc(17) int local17 = this.anInt1483 > arg7 ? this.anInt1483 : arg7;
		@Pc(32) int local32 = this.anInt1495 < arg7 + local5.length ? this.anInt1495 : arg7 + local5.length;
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
					if (local129 >= this.anInt1479 && local129 < this.anInt1482 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray116[local129 + arg1 * this.anInt1488] = arg4;
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
					if (local133 >= this.anInt1479 && local133 < this.anInt1482 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1488;
						local248 = this.anIntArray116[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray116[local133 + arg1 * this.anInt1488] = local201 + local584;
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
		if (arg0 < this.anInt1479) {
			arg1 += local83 * (this.anInt1479 - arg0);
			arg0 = this.anInt1479;
		}
		if (arg2 >= this.anInt1482) {
			arg2 = this.anInt1482 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray116[arg0 + local129 * this.anInt1488] = arg4;
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
					local243 = arg0 + local133 * this.anInt1488;
					local248 = this.anIntArray116[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray116[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!co", name = "o", descriptor = "()V")
	@Override
	public void method2179() {
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	@Override
	public void method2158(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1473;
		for (@Pc(9) Object local9 = this.aClass87_12.method2474(); local9 != null; local9 = this.aClass87_12.method2479()) {
			@Pc(13) Class1_Sub32 local13 = (Class1_Sub32) local9;
			if (local13.aBoolean540) {
				local13.anInt5541 += local4;
				@Pc(27) int local27 = local13.anInt5541 / 20;
				if (local27 > 0) {
					@Pc(36) Class154 local36 = this.anInterface2_2.method4244(local13.anInt5543);
					local13.method4758(local36.aByte33 * local4 * 50 / 1000, local36.aByte31 * local4 * 50 / 1000);
					local13.anInt5541 -= local27 * 20;
				}
				local13.aBoolean540 = false;
			}
		}
		this.anInt1473 = arg0;
		this.aClass87_11.method2473(5);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!de;")
	public Class41 method1268(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1485; local1++) {
			if (this.aClass41Array1[local1].aRunnable1 == arg0) {
				return this.aClass41Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "()V")
	private void method1269() {
		if (this.aFloat6 == 0.0F) {
			this.anInt1491 = this.anInt1497;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1497;
		@Pc(12) float local12 = (float) this.anInt1470;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat7 / (this.aFloat6 + this.aFloat7);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat6;
		this.anInt1491 = (int) (((float) this.anInt1497 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1481 = (int) (arg1 * 65535.0F);
		this.anInt1480 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1494 = (int) (arg3 * 65535.0F / local26);
		this.anInt1493 = (int) (arg4 * 65535.0F / local26);
		this.lb = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1488;
		@Pc(35) int local35 = this.anInt1488 - arg2;
		if (arg1 + arg3 > this.anInt1495) {
			arg3 -= arg1 + arg3 - this.anInt1495;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1483) {
			local59 = this.anInt1483 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1488;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1482) {
			local59 = arg0 + arg2 - this.anInt1482;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1479) {
			local59 = this.anInt1479 - arg0;
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
						this.anIntArray116[local30++] = arg4;
					} else {
						this.anIntArray116[local30++] = arg5;
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
					local245 = this.anIntArray116[local30];
					this.anIntArray116[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray116[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray116[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!co", name = "G", descriptor = "()I")
	@Override
	public int method2230() {
		@Pc(2) int local2 = this.anInt1486;
		this.anInt1486 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!co", name = "J", descriptor = "()Z")
	@Override
	public boolean method2235() {
		return true;
	}

	@OriginalMember(owner = "client!co", name = "j", descriptor = "()Z")
	@Override
	public boolean method2163() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ac;)V")
	@Override
	public void method2176(@OriginalArg(0) Class1_Sub2 arg0) {
	}

	@OriginalMember(owner = "client!co", name = "q", descriptor = "()V")
	@Override
	public void method2184() {
		this.anInt1479 = 0;
		this.anInt1483 = 0;
		this.anInt1482 = this.anInt1488;
		this.anInt1495 = this.anInt1476;
		this.method1277();
	}

	@OriginalMember(owner = "client!co", name = "E", descriptor = "()I")
	@Override
	public int method2227() {
		return 0;
	}

	@OriginalMember(owner = "client!co", name = "i", descriptor = "(I)Z")
	public boolean method1270(@OriginalArg(0) int arg0) {
		return this.aBoolean145 || this.anInterface2_2.method4244(arg0).aBoolean440;
	}

	@OriginalMember(owner = "client!co", name = "j", descriptor = "(I)I")
	public int method1271(@OriginalArg(0) int arg0) {
		return this.anInterface2_2.method4244(arg0).aShort54 & 0xFFFF;
	}

	@OriginalMember(owner = "client!co", name = "k", descriptor = "(I)[I")
	public int[] method1272(@OriginalArg(0) int arg0) {
		@Pc(2) Class87 local2 = this.aClass87_12;
		@Pc(12) Class1_Sub32 local12;
		synchronized (this.aClass87_12) {
			local12 = (Class1_Sub32) this.aClass87_12.method2482((long) arg0);
			if (local12 == null) {
				if (!this.anInterface2_2.method4241(arg0)) {
					return null;
				}
				@Pc(32) Class154 local32 = this.anInterface2_2.method4244(arg0);
				@Pc(42) int local42 = local32.aBoolean440 || this.aBoolean145 ? 64 : 128;
				local12 = new Class1_Sub32(arg0, local42, this.anInterface2_2.method4243(local42, arg0, 0.7F, local42, true), local32.aBoolean436);
				this.aClass87_12.method2481(local12, (long) arg0);
			}
		}
		local12.aBoolean540 = true;
		return local12.method4759();
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "()V")
	@Override
	public void method2146() {
		this.aClass87_12.method2485();
	}

	@OriginalMember(owner = "client!co", name = "K", descriptor = "()Z")
	@Override
	public boolean method2237() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "D", descriptor = "()I")
	@Override
	public int method2223() {
		return this.anInt1470;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!bp;III)V")
	public void method1273(@OriginalArg(0) Class8_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt1225;
		if (local6 == -1) {
			this.method2171(arg1, arg2, local3, arg0.anInt1221);
			return;
		}
		if (this.aClass1_Sub24_1 == null || this.aClass1_Sub24_1.aLong213 != (long) local6) {
			this.aClass1_Sub24_1 = (Class1_Sub24) this.aClass87_11.method2482((long) local6);
		}
		if (this.aClass1_Sub24_1 == null) {
			@Pc(44) int[] local44 = this.method1275(local6);
			if (local44 == null) {
				return;
			}
			this.aClass1_Sub24_1 = new Class1_Sub24();
			this.aClass1_Sub24_1.aBoolean354 = this.method1270(local6);
			@Pc(65) int local65 = this.aClass1_Sub24_1.aBoolean354 ? 64 : 128;
			this.aClass1_Sub24_1.aClass5_19 = this.method2155(local44, local65, local65, local65);
			this.aClass87_11.method2481(this.aClass1_Sub24_1, (long) local6);
		}
		if (this.aClass1_Sub24_1.aBoolean354) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass1_Sub24_1.aClass5_19.method3634(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt1221, 1);
	}

	@OriginalMember(owner = "client!co", name = "z", descriptor = "()F")
	@Override
	public float method2216() {
		return this.aFloat6;
	}

	@OriginalMember(owner = "client!co", name = "v", descriptor = "()V")
	@Override
	public void method2209() {
		if (this.aCanvas1 == null || this.aClass47_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass47_1.method3696(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(FF)V")
	@Override
	public void method2225(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat7 = arg0;
		this.aFloat6 = arg1;
		this.method1269();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
	@Override
	public int method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!co", name = "p", descriptor = "()V")
	@Override
	protected void method2182() {
		if (this.aBoolean143) {
			Static117.method2484(false);
			this.aBoolean143 = false;
		}
		this.aCanvas1 = null;
		this.anInterface2_2 = null;
		this.aClass47_1 = null;
		this.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!co", name = "h", descriptor = "()Z")
	@Override
	public boolean method2160() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "l", descriptor = "(I)Z")
	public boolean method1274(@OriginalArg(0) int arg0) {
		return this.anInterface2_2.method4244(arg0).aBoolean439;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1488) {
			arg2 = this.anInt1488;
		}
		if (arg3 > this.anInt1476) {
			arg3 = this.anInt1476;
		}
		this.anInt1479 = arg0;
		this.anInt1482 = arg2;
		this.anInt1483 = arg1;
		this.anInt1495 = arg3;
		this.method1277();
	}

	@OriginalMember(owner = "client!co", name = "m", descriptor = "(I)[I")
	private int[] method1275(@OriginalArg(0) int arg0) {
		@Pc(2) Class87 local2 = this.aClass87_12;
		@Pc(12) Class1_Sub32 local12;
		synchronized (this.aClass87_12) {
			local12 = (Class1_Sub32) this.aClass87_12.method2482((long) arg0);
			if (local12 == null) {
				if (!this.anInterface2_2.method4241(arg0)) {
					return null;
				}
				@Pc(32) Class154 local32 = this.anInterface2_2.method4244(arg0);
				@Pc(42) int local42 = local32.aBoolean440 || this.aBoolean145 ? 64 : 128;
				local12 = new Class1_Sub32(arg0, local42, this.anInterface2_2.method4242(arg0, local42, 0.7F, local42), local32.aBoolean436);
				this.aClass87_12.method2481(local12, (long) arg0);
			}
		}
		local12.aBoolean540 = true;
		return local12.method4759();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2165(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas1 == null || this.aClass47_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1488 && local21.y <= this.anInt1476 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass47_1.method3702(local21.y, local21.x, local21.height, local21.width, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!co", name = "I", descriptor = "()Z")
	@Override
	public boolean method2233() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)V")
	@Override
	public void method2207(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2196() {
		@Pc(3) Class41 local3 = this.method1268(Thread.currentThread());
		@Pc(6) Class39 local6 = local3.aClass39_1;
		local6.aBoolean152 = false;
		local6.aBoolean152 = false;
		local6.anInt1552 = 0;
		local6.aBoolean153 = true;
		local6.method1318(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean152 = true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!em;II)V")
	@Override
	public void method2156(@OriginalArg(1) Class52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class52_Sub1 local2 = (Class52_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray177;
		@Pc(8) int[] local8 = local2.anIntArray176;
		@Pc(20) int local20;
		if (this.anInt1495 < arg2 + local5.length) {
			local20 = this.anInt1495 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1483 > arg2) {
			local33 = this.anInt1483 - arg2;
			arg2 = this.anInt1483;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt1488;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1479 > local58) {
				local62 -= this.anInt1479 - local58;
				local58 = this.anInt1479;
			}
			if (this.anInt1482 < local58 + local62) {
				local62 = this.anInt1482 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray116[local58++] = -16777216;
			}
			local49 += this.anInt1488;
		}
	}

	@OriginalMember(owner = "client!co", name = "B", descriptor = "()Lclient!wr;")
	@Override
	public Class109 method2221() {
		return new Class109_Sub1();
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(I)Lclient!ac;")
	@Override
	public Class1_Sub2 method2210() {
		return null;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)I")
	@Override
	public int method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([I)V")
	@Override
	public void method2174(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1479;
		arg0[1] = this.anInt1483;
		arg0[2] = this.anInt1482;
		arg0[3] = this.anInt1495;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([IIIII)Lclient!c;")
	@Override
	public Class5 method2155(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class5_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class5_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class5_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class5_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!co", name = "n", descriptor = "(I)Z")
	public boolean method1276(@OriginalArg(0) int arg0) {
		return this.anInterface2_2.method4241(arg0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(F)V")
	@Override
	public void method2140(@OriginalArg(0) float arg0) {
		this.anInt1487 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1479 < arg0) {
			this.anInt1479 = arg0;
		}
		if (this.anInt1483 < arg1) {
			this.anInt1483 = arg1;
		}
		if (this.anInt1482 > arg2) {
			this.anInt1482 = arg2;
		}
		if (this.anInt1495 > arg3) {
			this.anInt1495 = arg3;
		}
		this.method1277();
	}

	@OriginalMember(owner = "client!co", name = "r", descriptor = "()V")
	@Override
	public void method2187() {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	@Override
	public void method2142(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!co", name = "l", descriptor = "()Z")
	@Override
	public boolean method2175() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "i", descriptor = "()V")
	@Override
	public void method2162() {
		this.anInt1474 = this.anInt1469;
		this.aBoolean142 = false;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "()Z")
	@Override
	public boolean method2141() {
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	@Override
	public void method2138() {
		this.anInt1469 = this.anInt1474;
		this.anInt1477 = -1;
		this.anInt1474 = 1583160;
		this.anInt1468 = 40;
		this.aBoolean142 = true;
	}

	@OriginalMember(owner = "client!co", name = "M", descriptor = "()V")
	private void method1277() {
		this.anInt1484 = this.anInt1479 - this.anInt1471;
		this.anInt1492 = this.anInt1482 - this.anInt1471;
		this.anInt1489 = this.anInt1483 - this.anInt1498;
		this.anInt1478 = this.anInt1495 - this.anInt1498;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1485; local29++) {
			@Pc(36) Class39 local36 = this.aClass41Array1[local29].aClass39_1;
			local36.anInt1551 = this.anInt1471 - this.anInt1479;
			local36.anInt1549 = this.anInt1498 - this.anInt1483;
			local36.anInt1547 = this.anInt1482 - this.anInt1479;
			local36.anInt1550 = this.anInt1495 - this.anInt1483;
		}
		@Pc(78) int local78 = this.anInt1483 * this.anInt1488 + this.anInt1479;
		for (@Pc(81) int local81 = this.anInt1483; local81 < this.anInt1495; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1485; local84++) {
				this.aClass41Array1[local84].aClass39_1.anIntArray122[local81 - this.anInt1483] = local78;
			}
			local78 += this.anInt1488;
		}
	}

	@OriginalMember(owner = "client!co", name = "t", descriptor = "()Lclient!wr;")
	@Override
	public Class109 method2194() {
		@Pc(3) Class41 local3 = this.method1268(Thread.currentThread());
		return local3.aClass109_Sub1_2;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method2190(@OriginalArg(0) Class191 arg0) {
		@Pc(3) Class8_Sub2 local3 = arg0.aClass130_1.aClass8_Sub2_7;
		for (@Pc(6) Class8_Sub2 local6 = local3.aClass8_Sub2_5; local6 != local3; local6 = local6.aClass8_Sub2_5) {
			@Pc(10) Class8_Sub2_Sub1 local10 = (Class8_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt1227 >> 12;
			@Pc(20) int local20 = local10.anInt1226 >> 12;
			@Pc(25) int local25 = local10.anInt1223 >> 12;
			@Pc(49) int local49 = this.aClass109_Sub1_1.anInt3183 + (this.aClass109_Sub1_1.anInt3185 * local15 + this.aClass109_Sub1_1.anInt3180 * local20 + this.aClass109_Sub1_1.anInt3177 * local25 >> 15);
			if (local49 >= this.anInt1470 && local49 <= this.anInt1497) {
				@Pc(90) int local90 = this.anInt1471 + this.anInt1472 * (this.aClass109_Sub1_1.anInt3176 + (this.aClass109_Sub1_1.anInt3187 * local15 + this.aClass109_Sub1_1.anInt3182 * local20 + this.aClass109_Sub1_1.anInt3181 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt1498 + this.anInt1475 * (this.aClass109_Sub1_1.anInt3186 + (this.aClass109_Sub1_1.anInt3184 * local15 + this.aClass109_Sub1_1.anInt3179 * local20 + this.aClass109_Sub1_1.anInt3178 * local25 >> 15)) / local49;
				if (local90 >= this.anInt1479 && local90 <= this.anInt1482 && local122 >= this.anInt1483 && local122 <= this.anInt1495) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1273(local10, local90, local122, (local10.anInt1220 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "H", descriptor = "()Z")
	@Override
	public boolean method2231() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method2161(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method2161(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt1479) {
					arg1 += local104 * (this.anInt1479 - arg0);
					arg0 = this.anInt1479;
				}
				if (arg2 >= this.anInt1482) {
					arg2 = this.anInt1482 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1483 && local150 < this.anInt1495) {
							this.anIntArray116[arg0 + local150 * this.anInt1488] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1483 && local213 < this.anInt1495) {
							local228 = arg0 + local213 * this.anInt1488;
							local233 = this.anIntArray116[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray116[local228] = local204 + local233;
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
				if (arg1 < this.anInt1483) {
					arg0 += local104 * (this.anInt1483 - arg1);
					arg1 = this.anInt1483;
				}
				if (arg3 >= this.anInt1495) {
					arg3 = this.anInt1495 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1479 && local150 < this.anInt1482) {
							this.anIntArray116[local150 + arg1 * this.anInt1488] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1479 && local213 < this.anInt1482) {
							local228 = local213 + arg1 * this.anInt1488;
							local233 = this.anIntArray116[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray116[local213 + arg1 * this.anInt1488] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method2148(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method2148(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method2171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1483) {
			local8 = this.anInt1483;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1495) {
			local21 = this.anInt1495;
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
				if (local91 < this.anInt1479) {
					local91 = this.anInt1479;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1482) {
					local102 = this.anInt1482;
				}
				local116 = local91 + local30 * this.anInt1488;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray116[local116++] = arg3;
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
				if (local91 < this.anInt1479) {
					local91 = this.anInt1479;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1482 - 1) {
					local102 = this.anInt1482 - 1;
				}
				local116 = local91 + local30 * this.anInt1488;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray116[local116++] = arg3;
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
			if (local102 < this.anInt1479) {
				local102 = this.anInt1479;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1482) {
				local116 = this.anInt1482;
			}
			local118 = local102 + local30 * this.anInt1488;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray116[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray116[local118++] = local277 + local360;
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
			if (local102 < this.anInt1479) {
				local102 = this.anInt1479;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1482 - 1) {
				local116 = this.anInt1482 - 1;
			}
			local118 = local102 + local30 * this.anInt1488;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray116[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray116[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method2208() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt1488;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray116[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(IIIIII)Lclient!ts;")
	@Override
	public Class114 method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II[[I[[IIII)Lclient!ip;")
	@Override
	public Class53 method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class53_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2145(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.method2228();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIZ)Lclient!c;")
	@Override
	public Class5 method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1488 + arg0;
		@Pc(16) int local16 = this.anInt1488 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray116[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class5_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class5_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(Z)V")
	@Override
	public void method2239(@OriginalArg(0) boolean arg0) {
		this.aBoolean145 = arg0;
		this.aClass87_12.method2485();
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V")
	@Override
	public void method2211(@OriginalArg(0) int arg0) {
		this.aClass41Array1[arg0].method1341(Thread.currentThread());
	}

	@OriginalMember(owner = "client!co", name = "x", descriptor = "()Z")
	@Override
	public boolean method2213() {
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	@Override
	public void method2147(@OriginalArg(0) int arg0) {
		if (this.anInt1485 == arg0) {
			return;
		}
		this.anInt1485 = arg0;
		this.aClass41Array1 = new Class41[this.anInt1485];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1485; local14++) {
			this.aClass41Array1[local14] = new Class41(this);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[Lclient!si;)V")
	@Override
	public void method2236(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub30[] arg1) {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!iq;Z)Lclient!c;")
	@Override
	public Class5 method2149(@OriginalArg(0) Class99 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray257;
		@Pc(5) byte[] local5 = arg0.aByteArray52;
		@Pc(8) int local8 = arg0.anInt2875;
		@Pc(11) int local11 = arg0.anInt2877;
		@Pc(76) Class5_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray51 == null) {
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
			local76 = new Class5_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray51;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class5_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class5_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class5_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.method3636(arg0.anInt2874, arg0.anInt2876, arg0.anInt2872, arg0.anInt2873);
		return local76;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!wr;)V")
	@Override
	public void method2201(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub1_1 = (Class109_Sub1) arg0;
	}

	@OriginalMember(owner = "client!co", name = "A", descriptor = "()V")
	@Override
	public void method2217() {
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method2241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1479) {
			arg2 -= this.anInt1479 - arg0;
			arg0 = this.anInt1479;
		}
		if (arg1 < this.anInt1483) {
			arg3 -= this.anInt1483 - arg1;
			arg1 = this.anInt1483;
		}
		if (arg0 + arg2 > this.anInt1482) {
			arg2 = this.anInt1482 - arg0;
		}
		if (arg1 + arg3 > this.anInt1495) {
			arg3 = this.anInt1495 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1482 || arg1 > this.anInt1495) {
			return;
		}
		@Pc(67) int local67 = this.anInt1488 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1488;
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
						local221 = this.anIntArray116[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray116[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray116[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray116[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray116[arg2] = arg4;
					arg2++;
					this.anIntArray116[arg2] = arg4;
					arg2++;
					this.anIntArray116[arg2] = arg4;
					arg2++;
					this.anIntArray116[arg2] = arg4;
					arg2++;
					this.anIntArray116[arg2] = arg4;
					arg2++;
					this.anIntArray116[arg2] = arg4;
					arg2++;
					this.anIntArray116[arg2] = arg4;
					arg2++;
					this.anIntArray116[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray116[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1479 || arg0 >= this.anInt1482) {
			return;
		}
		if (arg1 < this.anInt1483) {
			arg2 -= this.anInt1483 - arg1;
			arg1 = this.anInt1483;
		}
		if (arg1 + arg2 > this.anInt1495) {
			arg2 = this.anInt1495 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1488;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray116[local40 + local54 * this.anInt1488] = arg3;
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
				local111 = local40 + local103 * this.anInt1488;
				local116 = this.anIntArray116[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray116[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1488;
				local111 = this.anIntArray116[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray116[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2229(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "()Z")
	@Override
	public boolean method2144() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "w", descriptor = "()F")
	@Override
	public float method2212() {
		return this.aFloat7;
	}

	@OriginalMember(owner = "client!co", name = "s", descriptor = "()Z")
	@Override
	public boolean method2192() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "k", descriptor = "()Z")
	@Override
	public boolean method2166() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "C", descriptor = "()Z")
	@Override
	public boolean method2222() {
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!hf;IIII)Lclient!ge;")
	@Override
	public Class73 method2153(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class73_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2161(arg0, arg1, arg2, arg4, arg5);
		this.method2161(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method2148(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method2148(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!co", name = "n", descriptor = "()Z")
	@Override
	public boolean method2178() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "F", descriptor = "()V")
	@Override
	public void method2228() {
		this.aClass47_1 = Static336.method5436(this.aCanvas1);
		this.anIntArray116 = this.aClass47_1.anIntArray370;
		this.anInt1488 = this.aClass47_1.anInt4082;
		this.anInt1476 = this.aClass47_1.anInt4083;
		for (@Pc(22) int local22 = 0; local22 < this.anInt1485; local22++) {
			this.aClass41Array1[local22].method1343();
		}
		this.method2184();
	}

	@OriginalMember(owner = "client!co", name = "m", descriptor = "()V")
	@Override
	public void method2177() {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass109_Sub1_1.anInt3183 + (this.aClass109_Sub1_1.anInt3185 * arg0 + this.aClass109_Sub1_1.anInt3180 * arg1 + this.aClass109_Sub1_1.anInt3177 * arg2 >> 15);
		if (local23 < this.anInt1470 || local23 > this.anInt1497) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1472 * (this.aClass109_Sub1_1.anInt3176 + (this.aClass109_Sub1_1.anInt3187 * arg0 + this.aClass109_Sub1_1.anInt3182 * arg1 + this.aClass109_Sub1_1.anInt3181 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt1475 * (this.aClass109_Sub1_1.anInt3186 + (this.aClass109_Sub1_1.anInt3184 * arg0 + this.aClass109_Sub1_1.anInt3179 * arg1 + this.aClass109_Sub1_1.anInt3178 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt1484 && local73 <= this.anInt1492 && local102 >= this.anInt1489 && local102 <= this.anInt1478) {
			arg3[0] = local73 - this.anInt1484;
			arg3[1] = local102 - this.anInt1489;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([Lclient!ge;Lclient!wr;[Lclient!fi;I)V")
	@Override
	public void method2198(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class8_Sub3[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class73_Sub1[] local3 = new Class73_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class73_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class73_Sub1 local26 = Static151.method3060(this, local3);
		local26.method3054(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([Lclient!ge;Lclient!sk;Lclient!wr;[Lclient!fi;I)V")
	@Override
	public void method2172(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class8_Sub3[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class73_Sub1[] local3 = new Class73_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class73_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class73_Sub1 local26 = Static151.method3060(this, local3);
		local26.method3054(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ts;Lclient!ts;FLclient!ts;)Lclient!ts;")
	@Override
	public Class114 method2139(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class114 arg3) {
		return null;
	}
}
