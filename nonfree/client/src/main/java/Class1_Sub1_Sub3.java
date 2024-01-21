import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kd", name = "Wb", descriptor = "I")
	private int anInt1546;

	@OriginalMember(owner = "client!kd", name = "Yb", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!kd", name = "Zb", descriptor = "I")
	private int anInt1547;

	@OriginalMember(owner = "client!kd", name = "ac", descriptor = "Z")
	private boolean aBoolean47;

	@OriginalMember(owner = "client!kd", name = "bc", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "[I")
	private final int[] anIntArray248 = new int[16];

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "[I")
	private final int[] anIntArray249 = new int[16];

	@OriginalMember(owner = "client!kd", name = "vb", descriptor = "[I")
	private final int[] anIntArray257 = new int[16];

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "[I")
	private final int[] anIntArray252 = new int[16];

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "[I")
	private final int[] anIntArray256 = new int[16];

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "[I")
	public final int[] anIntArray250 = new int[16];

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "[I")
	private final int[] anIntArray254 = new int[16];

	@OriginalMember(owner = "client!kd", name = "qb", descriptor = "[I")
	private final int[] anIntArray255 = new int[16];

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
	private int anInt1532 = 256;

	@OriginalMember(owner = "client!kd", name = "Gb", descriptor = "[I")
	private final int[] anIntArray259 = new int[16];

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "[I")
	private final int[] anIntArray253 = new int[16];

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
	private final int anInt1522 = 1000000;

	@OriginalMember(owner = "client!kd", name = "Mb", descriptor = "[I")
	private final int[] anIntArray260 = new int[16];

	@OriginalMember(owner = "client!kd", name = "Sb", descriptor = "[[Lclient!m;")
	private final Class1_Sub13[][] aClass1_Sub13ArrayArray2 = new Class1_Sub13[16][128];

	@OriginalMember(owner = "client!kd", name = "Tb", descriptor = "[I")
	private final int[] anIntArray261 = new int[16];

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "[I")
	public final int[] anIntArray251 = new int[16];

	@OriginalMember(owner = "client!kd", name = "Fb", descriptor = "[[Lclient!m;")
	private final Class1_Sub13[][] aClass1_Sub13ArrayArray1 = new Class1_Sub13[16][128];

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "[I")
	private final int[] anIntArray258 = new int[16];

	@OriginalMember(owner = "client!kd", name = "Vb", descriptor = "[I")
	public final int[] anIntArray262 = new int[16];

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "Lclient!i;")
	private final Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!kd", name = "Xb", descriptor = "Lclient!mf;")
	private final Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1 = new Class1_Sub1_Sub4(this);

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "Lclient!bd;")
	private final Class7 aClass7_7 = new Class7(128);

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		this.method1146();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!m;)I")
	private int method1144(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(16) int local16 = this.anIntArray252[arg0.anInt1731];
		return local16 >= 8192 ? 16384 - ((128 - arg0.anInt1726) * (-local16 + 16384) + 32 >> 6) : local16 * arg0.anInt1726 - -32 >> 6;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(BI)V")
	private void method1145(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1145(local12);
			}
			return;
		}
		this.anIntArray259[arg0] = 12800;
		this.anIntArray252[arg0] = 8192;
		this.anIntArray249[arg0] = 16383;
		this.anIntArray258[arg0] = 8192;
		this.anIntArray254[arg0] = 0;
		this.anIntArray253[arg0] = 8192;
		this.method1156(arg0);
		this.method1157(arg0);
		this.anIntArray251[arg0] = 0;
		this.anIntArray260[arg0] = 32767;
		this.anIntArray248[arg0] = 256;
		this.anIntArray262[arg0] = 0;
		this.method1163(8192, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	private void method1146() {
		this.method1159(-1);
		this.method1145(-1);
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			this.anIntArray256[local11] = this.anIntArray255[local11];
		}
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray257[local27] = this.anIntArray255[local27] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!m;)I")
	private int method1148(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(15) int local15 = this.anIntArray249[arg0.anInt1731] * this.anIntArray259[arg0.anInt1731] + 4096 >> 13;
		@Pc(22) Class32 local22 = arg0.aClass32_1;
		@Pc(30) int local30 = local15 * local15 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt1729 * local30 + 16384 >> 15;
		local15 = local39 * this.anInt1532 + 128 >> 8;
		if (local22.anInt1138 > 0) {
			local15 = (int) ((double) local15 * Math.pow(0.5D, (double) local22.anInt1138 * 1.953125E-5D * (double) arg0.anInt1727) + 0.5D);
		}
		@Pc(78) int local78;
		@Pc(86) int local86;
		@Pc(116) int local116;
		@Pc(106) int local106;
		if (local22.aByteArray24 != null) {
			local78 = arg0.anInt1723;
			local86 = local22.aByteArray24[arg0.anInt1724 + 1];
			if (local22.aByteArray24.length - 2 > arg0.anInt1724) {
				local106 = (local22.aByteArray24[arg0.anInt1724 + 2] & 0xFF) << 8;
				local116 = (local22.aByteArray24[arg0.anInt1724] & 0xFF) << 8;
				local86 += (local22.aByteArray24[arg0.anInt1724 + 3] - local86) * (local78 - local116) / (local106 - local116);
			}
			local15 = local15 * local86 + 32 >> 6;
		}
		if (arg0.anInt1735 > 0 && local22.aByteArray23 != null) {
			local78 = arg0.anInt1735;
			local86 = local22.aByteArray23[arg0.anInt1733 + 1];
			if (arg0.anInt1733 < local22.aByteArray23.length - 2) {
				local106 = (local22.aByteArray23[arg0.anInt1733 + 2] & 0xFF) << 8;
				local116 = (local22.aByteArray23[arg0.anInt1733] & 0xFF) << 8;
				local86 += (local78 - local116) * (local22.aByteArray23[arg0.anInt1733 + 3] - local86) / (local106 - local116);
			}
			local15 = local15 * local86 + 32 >> 6;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!q;ILclient!j;BLclient!kb;)Z")
	public synchronized boolean method1149(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class1_Sub8 arg1, @OriginalArg(4) Class41 arg2) {
		arg1.method1018();
		@Pc(5) boolean local5 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(37) Class1_Sub18 local37 = (Class1_Sub18) arg1.aClass7_5.method288(); local37 != null; local37 = (Class1_Sub18) arg1.aClass7_5.method284()) {
			@Pc(43) int local43 = (int) local37.aLong95;
			@Pc(51) Class1_Sub4 local51 = (Class1_Sub4) this.aClass7_7.method287((long) local43);
			if (local51 == null) {
				local51 = Static100.method1692(local43, arg2);
				if (local51 == null) {
					local5 = false;
					continue;
				}
				this.aClass7_7.method291(local51, (long) local43);
			}
			if (!local51.method258(arg0, local37.aByteArray32, local23)) {
				local5 = false;
			}
		}
		if (local5) {
			arg1.method1016();
		}
		return local5;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI)V")
	private void method1150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!m;I)I")
	private int method1151(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(15) int local15 = arg0.anInt1734 + (arg0.anInt1717 * arg0.anInt1721 >> 12);
		local15 += this.anIntArray248[arg0.anInt1731] * (this.anIntArray258[arg0.anInt1731] - 8192) >> 12;
		@Pc(36) Class32 local36 = arg0.aClass32_1;
		@Pc(56) int local56;
		if (local36.anInt1145 > 0 && (local36.anInt1136 > 0 || this.anIntArray254[arg0.anInt1731] > 0)) {
			local56 = local36.anInt1136 << 2;
			@Pc(61) int local61 = local36.anInt1143 << 1;
			if (local61 > arg0.anInt1718) {
				local56 = arg0.anInt1718 * local56 / local61;
			}
			local56 += this.anIntArray254[arg0.anInt1731] >> 7;
			@Pc(91) double local91 = Math.sin((double) (arg0.anInt1737 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local91 * (double) local56);
		}
		local56 = (int) ((double) (arg0.aClass1_Sub9_Sub1_1.anInt3155 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static45.anInt2755 + 0.5D);
		return local56 >= 1 ? local56 : 1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
	public synchronized void method1152() {
		this.method1178();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!j;ZB)V")
	public synchronized void method1153(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		this.method1175();
		this.aClass35_1.method920(arg0.aByteArray26);
		this.aLong49 = 0L;
		this.aBoolean47 = arg1;
		@Pc(27) int local27 = this.aClass35_1.method907();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			this.aClass35_1.method910(local29);
			this.aClass35_1.method908(local29);
			this.aClass35_1.method921(local29);
		}
		this.anInt1546 = this.aClass35_1.method915();
		this.anInt1547 = this.aClass35_1.anIntArray210[this.anInt1546];
		this.aLong50 = this.aClass35_1.method916(this.anInt1547);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	private void method1154(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub13 local12 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1442(); local12 != null; local12 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1450()) {
			if ((arg0 < 0 || local12.anInt1731 == arg0) && local12.anInt1735 < 0) {
				this.aClass1_Sub13ArrayArray1[local12.anInt1731][local12.anInt1738] = null;
				local12.anInt1735 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
	public synchronized void method1155() {
		for (@Pc(11) Class1_Sub4 local11 = (Class1_Sub4) this.aClass7_7.method288(); local11 != null; local11 = (Class1_Sub4) this.aClass7_7.method284()) {
			local11.method260();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V")
	private void method1156(@OriginalArg(1) int arg0) {
		if ((this.anIntArray251[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(30) Class1_Sub13 local30 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1442(); local30 != null; local30 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1450()) {
			if (local30.anInt1731 == arg0 && this.aClass1_Sub13ArrayArray1[arg0][local30.anInt1738] == null && local30.anInt1735 < 0) {
				local30.anInt1735 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
	private void method1157(@OriginalArg(0) int arg0) {
		if ((this.anIntArray251[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1442(); local15 != null; local15 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1450()) {
			if (arg0 == local15.anInt1731) {
				local15.anInt1716 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZI)V")
	private void method1158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray256[arg1]) {
			this.anIntArray256[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass1_Sub13ArrayArray2[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V")
	private void method1159(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub13 local8 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1442(); local8 != null; local8 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1450()) {
			if (arg0 < 0 || local8.anInt1731 == arg0) {
				if (local8.aClass1_Sub1_Sub2_1 != null) {
					local8.aClass1_Sub1_Sub2_1.method985(Static45.anInt2755 / 100);
					if (local8.aClass1_Sub1_Sub2_1.method978()) {
						this.aClass1_Sub1_Sub4_1.aClass1_Sub1_Sub1_1.method38(local8.aClass1_Sub1_Sub2_1);
					}
					local8.method1273();
				}
				if (local8.anInt1735 < 0) {
					this.aClass1_Sub13ArrayArray1[local8.anInt1731][local8.anInt1738] = null;
				}
				local8.method2220();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)V")
	private void method1160(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(30) int local30;
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (local9 == 128) {
			local26 = arg0 >> 8 & 0x7F;
			local30 = arg0 & 0xF;
			local36 = arg0 >> 16 & 0x7F;
			this.method1173(local26, local36, local30);
		} else if (local9 == 144) {
			local30 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method1166(local36, local26, local30);
			} else {
				this.method1173(local26, 64, local30);
			}
		} else if (local9 == 160) {
			local30 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method1161(local26, local36, local30);
		} else if (local9 == 176) {
			local26 = arg0 >> 8 & 0x7F;
			local30 = arg0 & 0xF;
			local36 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray257[local30] = (this.anIntArray257[local30] & 0xFFE03FFF) + (local36 << 14);
			}
			if (local26 == 32) {
				this.anIntArray257[local30] = (local36 << 7) + (this.anIntArray257[local30] & 0xFFFFC07F);
			}
			if (local26 == 1) {
				this.anIntArray254[local30] = (this.anIntArray254[local30] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local26 == 33) {
				this.anIntArray254[local30] = local36 + (this.anIntArray254[local30] & 0xFFFFFF80);
			}
			if (local26 == 5) {
				this.anIntArray253[local30] = (local36 << 7) + (this.anIntArray253[local30] & 0xFFFFC07F);
			}
			if (local26 == 37) {
				this.anIntArray253[local30] = (this.anIntArray253[local30] & 0xFFFFFF80) + local36;
			}
			if (local26 == 7) {
				this.anIntArray259[local30] = (local36 << 7) + (this.anIntArray259[local30] & 0xFFFFC07F);
			}
			if (local26 == 39) {
				this.anIntArray259[local30] = local36 + (this.anIntArray259[local30] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray252[local30] = (local36 << 7) + (this.anIntArray252[local30] & 0xFFFFC07F);
			}
			if (local26 == 42) {
				this.anIntArray252[local30] = local36 + (this.anIntArray252[local30] & 0xFFFFFF80);
			}
			if (local26 == 11) {
				this.anIntArray249[local30] = (local36 << 7) + (this.anIntArray249[local30] & 0xFFFFC07F);
			}
			if (local26 == 43) {
				this.anIntArray249[local30] = local36 + (this.anIntArray249[local30] & 0xFFFFFF80);
			}
			if (local26 == 64) {
				if (local36 >= 64) {
					this.anIntArray251[local30] |= 0x1;
				} else {
					this.anIntArray251[local30] &= 0xFFFFFFFE;
				}
			}
			if (local26 == 65) {
				if (local36 >= 64) {
					this.anIntArray251[local30] |= 0x2;
				} else {
					this.method1156(local30);
					this.anIntArray251[local30] &= 0xFFFFFFFD;
				}
			}
			if (local26 == 99) {
				this.anIntArray260[local30] = (local36 << 7) + (this.anIntArray260[local30] & 0x7F);
			}
			if (local26 == 98) {
				this.anIntArray260[local30] = local36 + (this.anIntArray260[local30] & 0x3F80);
			}
			if (local26 == 101) {
				this.anIntArray260[local30] = (local36 << 7) + (this.anIntArray260[local30] & 0x7F) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray260[local30] = (this.anIntArray260[local30] & 0x3F80) + local36 + 16384;
			}
			if (local26 == 120) {
				this.method1159(local30);
			}
			if (local26 == 121) {
				this.method1145(local30);
			}
			if (local26 == 123) {
				this.method1154(local30);
			}
			@Pc(510) int local510;
			if (local26 == 6) {
				local510 = this.anIntArray260[local30];
				if (local510 == 16384) {
					this.anIntArray248[local30] = (this.anIntArray248[local30] & 0xFFFFC07F) + (local36 << 7);
				}
			}
			if (local26 == 38) {
				local510 = this.anIntArray260[local30];
				if (local510 == 16384) {
					this.anIntArray248[local30] = local36 + (this.anIntArray248[local30] & 0xFFFFFF80);
				}
			}
			if (local26 == 16) {
				this.anIntArray262[local30] = (this.anIntArray262[local30] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local26 == 48) {
				this.anIntArray262[local30] = local36 + (this.anIntArray262[local30] & 0xFFFFFF80);
			}
			if (local26 == 81) {
				if (local36 >= 64) {
					this.anIntArray251[local30] |= 0x4;
				} else {
					this.method1157(local30);
					this.anIntArray251[local30] &= 0xFFFFFFFB;
				}
			}
			if (local26 == 17) {
				this.method1163((local36 << 7) + (this.anIntArray261[local30] & 0xFFFFC07F), local30);
			}
			if (local26 == 49) {
				this.method1163((this.anIntArray261[local30] & 0xFFFFFF80) + local36, local30);
			}
		} else if (local9 == 192) {
			local30 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method1158(this.anIntArray257[local30] + local26, local30);
		} else if (local9 == 208) {
			local30 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method1150(local26, local30);
		} else if (local9 == 224) {
			local26 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F93) >> 8);
			local30 = arg0 & 0xF;
			this.method1162(local30, local26);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1146();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)V")
	private void method1161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1359(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass35_1.method909()) {
			@Pc(14) int local14 = this.anInt1522 * this.aClass35_1.anInt1267 / Static45.anInt2755;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong49;
				if (this.aLong50 - local23 >= 0L) {
					this.aLong49 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong50 + (long) local14 - this.aLong49 - 1L) / (long) local14);
				this.aLong49 += (long) local52 * (long) local14;
				this.aClass1_Sub1_Sub4_1.method1359(arg0, arg1, local52);
				arg1 += local52;
				this.method1164();
				arg2 -= local52;
			} while (this.aClass35_1.method909());
		}
		this.aClass1_Sub1_Sub4_1.method1359(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()Lclient!ja;")
	@Override
	public synchronized Class1_Sub1 method1357() {
		return null;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IZI)V")
	private void method1162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray258[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()Lclient!ja;")
	@Override
	public synchronized Class1_Sub1 method1362() {
		return this.aClass1_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	private void method1163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray261[arg1] = arg0;
		this.anIntArray250[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
	private void method1164() {
		@Pc(4) int local4 = this.anInt1547;
		@Pc(11) int local11 = this.anInt1546;
		@Pc(20) long local20 = this.aLong50;
		while (this.anInt1547 == local4) {
			while (this.aClass35_1.anIntArray210[local11] == local4) {
				this.aClass35_1.method910(local11);
				@Pc(31) int local31 = this.aClass35_1.method911(local11);
				if (local31 == 1) {
					this.aClass35_1.method919();
					this.aClass35_1.method921(local11);
					if (this.aClass35_1.method917()) {
						if (!this.aBoolean47 || local4 == 0) {
							this.method1146();
							this.aClass35_1.method914();
							return;
						}
						this.aClass35_1.method918(local20);
					}
					break;
				}
				if ((local31 & 0x80) != 0) {
					this.method1160(local31);
				}
				this.aClass35_1.method908(local11);
				this.aClass35_1.method921(local11);
			}
			local11 = this.aClass35_1.method915();
			local4 = this.aClass35_1.anIntArray210[local11];
			local20 = this.aClass35_1.method916(local4);
		}
		this.aLong50 = local20;
		this.anInt1547 = local4;
		this.anInt1546 = local11;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ILclient!m;)Z")
	public boolean method1165(@OriginalArg(1) Class1_Sub13 arg0) {
		if (arg0.aClass1_Sub1_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt1735 >= 0) {
			arg0.method2220();
			if (arg0.anInt1732 > 0 && this.aClass1_Sub13ArrayArray2[arg0.anInt1731][arg0.anInt1732] == arg0) {
				this.aClass1_Sub13ArrayArray2[arg0.anInt1731][arg0.anInt1732] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
	private void method1166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method1173(arg1, 64, arg2);
		if ((this.anIntArray251[arg2] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub13 local25 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1444(); local25 != null; local25 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1443()) {
				if (arg2 == local25.anInt1731 && local25.anInt1735 < 0) {
					this.aClass1_Sub13ArrayArray1[arg2][local25.anInt1738] = null;
					this.aClass1_Sub13ArrayArray1[arg2][arg1] = local25;
					@Pc(68) int local68 = local25.anInt1734 + (local25.anInt1721 * local25.anInt1717 >> 12);
					local25.anInt1734 += arg1 - local25.anInt1738 << 8;
					local25.anInt1721 = 4096;
					local25.anInt1738 = arg1;
					local25.anInt1717 = local68 - local25.anInt1734;
					return;
				}
			}
		}
		@Pc(115) Class1_Sub4 local115 = (Class1_Sub4) this.aClass7_7.method287((long) this.anIntArray256[arg2]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class1_Sub9_Sub1 local123 = local115.aClass1_Sub9_Sub1Array1[arg1];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class1_Sub13 local130 = new Class1_Sub13();
		local130.aClass1_Sub4_1 = local115;
		local130.aClass1_Sub9_Sub1_1 = local123;
		local130.anInt1731 = arg2;
		local130.aClass32_1 = local115.aClass32Array1[arg1];
		local130.anInt1732 = local115.aByteArray9[arg1];
		local130.anInt1738 = arg1;
		local130.anInt1729 = local115.aByteArray10[arg1] * local115.anInt279 * arg0 * arg0 + 1024 >> 11;
		local130.anInt1726 = local115.aByteArray11[arg1] & 0xFF;
		local130.anInt1734 = (arg1 << 8) - (local115.aShortArray1[arg1] & 0x7FFF);
		local130.anInt1723 = 0;
		local130.anInt1733 = 0;
		local130.anInt1735 = -1;
		local130.anInt1727 = 0;
		local130.anInt1724 = 0;
		if (this.anIntArray262[arg2] == 0) {
			local130.aClass1_Sub1_Sub2_1 = Static133.method986(local123, this.method1151(local130), this.method1148(local130), this.method1144(local130));
		} else {
			local130.aClass1_Sub1_Sub2_1 = Static133.method986(local123, this.method1151(local130), 0, this.method1144(local130));
			this.method1169(local115.aShortArray1[arg1] < 0, local130);
		}
		if (local115.aShortArray1[arg1] < 0) {
			local130.aClass1_Sub1_Sub2_1.method980(-1);
		}
		if (local130.anInt1732 >= 0) {
			@Pc(285) Class1_Sub13 local285 = this.aClass1_Sub13ArrayArray2[arg2][local130.anInt1732];
			if (local285 != null && local285.anInt1735 < 0) {
				this.aClass1_Sub13ArrayArray1[arg2][local285.anInt1738] = null;
				local285.anInt1735 = 0;
			}
			this.aClass1_Sub13ArrayArray2[arg2][local130.anInt1732] = local130;
		}
		this.aClass1_Sub1_Sub4_1.aClass53_11.method1449(local130);
		this.aClass1_Sub13ArrayArray1[arg2][arg1] = local130;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public synchronized void method1168() {
		for (@Pc(13) Class1_Sub4 local13 = (Class1_Sub4) this.aClass7_7.method288(); local13 != null; local13 = (Class1_Sub4) this.aClass7_7.method284()) {
			local13.method2220();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLclient!m;I)V")
	public void method1169(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub9_Sub1_1.aByteArray39.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass1_Sub9_Sub1_1.aBoolean121) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass1_Sub9_Sub1_1.anInt3157;
			local36 = (int) ((long) this.anIntArray262[arg1.anInt1731] * (long) local23 >> 6);
			local8 <<= 0x8;
			if (local8 <= local36) {
				local36 = local8 + local8 - local36 - 1;
				arg1.aClass1_Sub1_Sub2_1.method1000();
			}
		} else {
			local36 = (int) ((long) this.anIntArray262[arg1.anInt1731] * (long) local8 >> 6);
		}
		arg1.aClass1_Sub1_Sub2_1.method1001(local36);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1358(@OriginalArg(0) int arg0) {
		if (this.aClass35_1.method909()) {
			@Pc(18) int local18 = this.aClass35_1.anInt1267 * this.anInt1522 / Static45.anInt2755;
			do {
				@Pc(27) long local27 = this.aLong49 + (long) local18 * (long) arg0;
				if (this.aLong50 - local27 >= 0L) {
					this.aLong49 = local27;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong50 + (long) local18 - this.aLong49 - 1L) / (long) local18);
				this.aLong49 += (long) local59 * (long) local18;
				arg0 -= local59;
				this.aClass1_Sub1_Sub4_1.method1358(local59);
				this.method1164();
			} while (this.aClass35_1.method909());
		}
		this.aClass1_Sub1_Sub4_1.method1358(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Z")
	public synchronized boolean method1172() {
		return this.aClass35_1.method909();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()I")
	@Override
	public synchronized int method1360() {
		return 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIB)V")
	private void method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub13 local8 = this.aClass1_Sub13ArrayArray1[arg2][arg0];
		if (local8 == null) {
			return;
		}
		this.aClass1_Sub13ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray251[arg2] & 0x2) == 0) {
			local8.anInt1735 = 0;
			return;
		}
		for (@Pc(39) Class1_Sub13 local39 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1442(); local39 != null; local39 = (Class1_Sub13) this.aClass1_Sub1_Sub4_1.aClass53_11.method1450()) {
			if (local39.anInt1731 == local8.anInt1731 && local39.anInt1735 < 0 && local39 != local8) {
				local8.anInt1735 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([ILclient!m;IBI)Z")
	public boolean method1174(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub13 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt1715 = Static45.anInt2755 / 100;
		if (arg1.anInt1735 >= 0 && (arg1.aClass1_Sub1_Sub2_1 == null || arg1.aClass1_Sub1_Sub2_1.method994())) {
			arg1.method1273();
			arg1.method2220();
			if (arg1.anInt1732 > 0 && this.aClass1_Sub13ArrayArray2[arg1.anInt1731][arg1.anInt1732] == arg1) {
				this.aClass1_Sub13ArrayArray2[arg1.anInt1731][arg1.anInt1732] = null;
			}
			return true;
		}
		@Pc(58) boolean local58 = false;
		@Pc(61) int local61 = arg1.anInt1721;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray253[arg1.anInt1731] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg1.anInt1721 = local61;
		}
		arg1.aClass1_Sub1_Sub2_1.method1002(this.method1151(arg1));
		@Pc(101) Class32 local101 = arg1.aClass32_1;
		arg1.anInt1718++;
		@Pc(126) double local126 = (double) ((arg1.anInt1738 - 60 << 8) + (arg1.anInt1717 * arg1.anInt1721 >> 12)) * 5.086263020833333E-6D;
		arg1.anInt1737 += local101.anInt1145;
		if (local101.anInt1138 > 0) {
			if (local101.anInt1141 > 0) {
				arg1.anInt1727 += (int) (Math.pow(2.0D, local126 * (double) local101.anInt1141) * 128.0D + 0.5D);
			} else {
				arg1.anInt1727 += 128;
			}
		}
		if (local101.aByteArray24 != null) {
			if (local101.anInt1147 > 0) {
				arg1.anInt1723 += (int) (Math.pow(2.0D, (double) local101.anInt1147 * local126) * 128.0D + 0.5D);
			} else {
				arg1.anInt1723 += 128;
			}
			while (arg1.anInt1724 < local101.aByteArray24.length - 2 && (local101.aByteArray24[arg1.anInt1724 + 2] & 0xFF) << 8 < arg1.anInt1723) {
				arg1.anInt1724 += 2;
			}
			if (arg1.anInt1724 == local101.aByteArray24.length - 2 && local101.aByteArray24[arg1.anInt1724 + 1] == 0) {
				local58 = true;
			}
		}
		if (arg1.anInt1735 >= 0 && local101.aByteArray23 != null && (this.anIntArray251[arg1.anInt1731] & 0x1) == 0 && (arg1.anInt1732 < 0 || arg1 != this.aClass1_Sub13ArrayArray2[arg1.anInt1731][arg1.anInt1732])) {
			if (local101.anInt1148 > 0) {
				arg1.anInt1735 += (int) (Math.pow(2.0D, (double) local101.anInt1148 * local126) * 128.0D + 0.5D);
			} else {
				arg1.anInt1735 += 128;
			}
			while (arg1.anInt1733 < local101.aByteArray23.length - 2 && arg1.anInt1735 > (local101.aByteArray23[arg1.anInt1733 + 2] & 0xFF) << 8) {
				arg1.anInt1733 += 2;
			}
			if (local101.aByteArray23.length - 2 == arg1.anInt1733) {
				local58 = true;
			}
		}
		if (!local58) {
			arg1.aClass1_Sub1_Sub2_1.method1003(arg1.anInt1715, this.method1148(arg1), this.method1144(arg1));
			return false;
		}
		arg1.aClass1_Sub1_Sub2_1.method985(arg1.anInt1715);
		if (arg0 == null) {
			arg1.aClass1_Sub1_Sub2_1.method1358(arg3);
		} else {
			arg1.aClass1_Sub1_Sub2_1.method1359(arg0, arg2, arg3);
		}
		if (arg1.aClass1_Sub1_Sub2_1.method978()) {
			this.aClass1_Sub1_Sub4_1.aClass1_Sub1_Sub1_1.method38(arg1.aClass1_Sub1_Sub2_1);
		}
		arg1.method1273();
		if (arg1.anInt1735 >= 0) {
			arg1.method2220();
			if (arg1.anInt1732 > 0 && arg1 == this.aClass1_Sub13ArrayArray2[arg1.anInt1731][arg1.anInt1732]) {
				this.aClass1_Sub13ArrayArray2[arg1.anInt1731][arg1.anInt1732] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
	public synchronized void method1175() {
		this.aClass35_1.method914();
		this.method1146();
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(II)V")
	public synchronized void method1176(@OriginalArg(1) int arg0) {
		this.anInt1532 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)I")
	public int method1177() {
		return this.anInt1532;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
	private void method1178() {
		this.anIntArray255[9] = 128;
		this.anIntArray257[9] = 128;
		this.method1158(128, 9);
	}
}
