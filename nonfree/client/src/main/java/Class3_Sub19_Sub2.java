import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class3_Sub19_Sub2 extends Class3_Sub19 {

	@OriginalMember(owner = "client!tc", name = "Fb", descriptor = "J")
	private long aLong125;

	@OriginalMember(owner = "client!tc", name = "Gb", descriptor = "J")
	private long aLong126;

	@OriginalMember(owner = "client!tc", name = "Hb", descriptor = "I")
	private int anInt3735;

	@OriginalMember(owner = "client!tc", name = "Ib", descriptor = "I")
	private int anInt3736;

	@OriginalMember(owner = "client!tc", name = "Lb", descriptor = "Z")
	private boolean aBoolean169;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "[I")
	private final int[] anIntArray310 = new int[16];

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "[I")
	private final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
	private final int anInt3719 = 1000000;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "[I")
	private final int[] anIntArray306 = new int[16];

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
	private int anInt3724 = 256;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "[I")
	private final int[] anIntArray308 = new int[16];

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "[[Lclient!fd;")
	private final Class3_Sub8[][] aClass3_Sub8ArrayArray1 = new Class3_Sub8[16][128];

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "[I")
	private final int[] anIntArray307 = new int[16];

	@OriginalMember(owner = "client!tc", name = "tb", descriptor = "[I")
	public final int[] anIntArray317 = new int[16];

	@OriginalMember(owner = "client!tc", name = "sb", descriptor = "[I")
	private final int[] anIntArray316 = new int[16];

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "[I")
	private final int[] anIntArray313 = new int[16];

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "[I")
	private final int[] anIntArray312 = new int[16];

	@OriginalMember(owner = "client!tc", name = "vb", descriptor = "[I")
	public final int[] anIntArray318 = new int[16];

	@OriginalMember(owner = "client!tc", name = "qb", descriptor = "[I")
	private final int[] anIntArray315 = new int[16];

	@OriginalMember(owner = "client!tc", name = "ob", descriptor = "[I")
	private final int[] anIntArray314 = new int[16];

	@OriginalMember(owner = "client!tc", name = "zb", descriptor = "[I")
	private final int[] anIntArray319 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "[I")
	public final int[] anIntArray311 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Ab", descriptor = "[[Lclient!fd;")
	private final Class3_Sub8[][] aClass3_Sub8ArrayArray2 = new Class3_Sub8[16][128];

	@OriginalMember(owner = "client!tc", name = "Cb", descriptor = "[I")
	private final int[] anIntArray320 = new int[16];

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "Lclient!qf;")
	private final Class79 aClass79_1 = new Class79();

	@OriginalMember(owner = "client!tc", name = "Jb", descriptor = "Lclient!l;")
	private final Class3_Sub19_Sub1 aClass3_Sub19_Sub1_1 = new Class3_Sub19_Sub1(this);

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "Lclient!gj;")
	private final Class40 aClass40_14 = new Class40(128);

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class3_Sub19_Sub2() {
		this.method2863();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
	@Override
	public synchronized int method3244() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB[ILclient!fd;I)Z")
	public boolean method2844(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class3_Sub8 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt1170 = Static91.anInt1796 / 100;
		if (arg2.anInt1188 >= 0 && (arg2.aClass3_Sub19_Sub4_1 == null || arg2.aClass3_Sub19_Sub4_1.method3290())) {
			arg2.method877();
			arg2.method3320();
			if (arg2.anInt1171 > 0 && this.aClass3_Sub8ArrayArray2[arg2.anInt1179][arg2.anInt1171] == arg2) {
				this.aClass3_Sub8ArrayArray2[arg2.anInt1179][arg2.anInt1171] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg2.anInt1181;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray316[arg2.anInt1179] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg2.anInt1181 = local53;
		}
		arg2.aClass3_Sub19_Sub4_1.method3270(this.method2857(arg2));
		@Pc(98) Class43 local98 = arg2.aClass43_1;
		arg2.anInt1176++;
		arg2.anInt1182 += local98.anInt1627;
		@Pc(129) double local129 = (double) ((arg2.anInt1181 * arg2.anInt1177 >> 12) + (arg2.anInt1180 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(131) boolean local131 = false;
		if (local98.anInt1618 > 0) {
			if (local98.anInt1619 > 0) {
				arg2.anInt1187 += (int) (Math.pow(2.0D, local129 * (double) local98.anInt1619) * 128.0D + 0.5D);
			} else {
				arg2.anInt1187 += 128;
			}
			if (arg2.anInt1187 * local98.anInt1618 >= 819200) {
				local131 = true;
			}
		}
		if (local98.aByteArray10 != null) {
			if (local98.anInt1623 <= 0) {
				arg2.anInt1174 += 128;
			} else {
				arg2.anInt1174 += (int) (Math.pow(2.0D, local129 * (double) local98.anInt1623) * 128.0D + 0.5D);
			}
			while (local98.aByteArray10.length - 2 > arg2.anInt1190 && (local98.aByteArray10[arg2.anInt1190 + 2] & 0xFF) << 8 < arg2.anInt1174) {
				arg2.anInt1190 += 2;
			}
			if (local98.aByteArray10.length - 2 == arg2.anInt1190 && local98.aByteArray10[arg2.anInt1190 + 1] == 0) {
				local131 = true;
			}
		}
		if (arg2.anInt1188 >= 0 && local98.aByteArray11 != null && (this.anIntArray318[arg2.anInt1179] & 0x1) == 0 && (arg2.anInt1171 < 0 || this.aClass3_Sub8ArrayArray2[arg2.anInt1179][arg2.anInt1171] != arg2)) {
			if (local98.anInt1625 <= 0) {
				arg2.anInt1188 += 128;
			} else {
				arg2.anInt1188 += (int) (Math.pow(2.0D, (double) local98.anInt1625 * local129) * 128.0D + 0.5D);
			}
			while (local98.aByteArray11.length - 2 > arg2.anInt1186 && (local98.aByteArray11[arg2.anInt1186 + 2] & 0xFF) << 8 < arg2.anInt1188) {
				arg2.anInt1186 += 2;
			}
			if (local98.aByteArray11.length - 2 == arg2.anInt1186) {
				local131 = true;
			}
		}
		if (!local131) {
			arg2.aClass3_Sub19_Sub4_1.method3262(arg2.anInt1170, this.method2858(arg2), this.method2864(arg2));
			return false;
		}
		arg2.aClass3_Sub19_Sub4_1.method3268(arg2.anInt1170);
		if (arg1 == null) {
			arg2.aClass3_Sub19_Sub4_1.method3248(arg0);
		} else {
			arg2.aClass3_Sub19_Sub4_1.method3249(arg1, arg3, arg0);
		}
		if (arg2.aClass3_Sub19_Sub4_1.method3254()) {
			this.aClass3_Sub19_Sub1_1.aClass3_Sub19_Sub3_1.method2922(arg2.aClass3_Sub19_Sub4_1);
		}
		arg2.method877();
		if (arg2.anInt1188 >= 0) {
			arg2.method3320();
			if (arg2.anInt1171 > 0 && this.aClass3_Sub8ArrayArray2[arg2.anInt1179][arg2.anInt1171] == arg2) {
				this.aClass3_Sub8ArrayArray2[arg2.anInt1179][arg2.anInt1171] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!fd;)Z")
	public boolean method2845(@OriginalArg(1) Class3_Sub8 arg0) {
		if (arg0.aClass3_Sub19_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt1188 >= 0) {
			arg0.method3320();
			if (arg0.anInt1171 > 0 && this.aClass3_Sub8ArrayArray2[arg0.anInt1179][arg0.anInt1171] == arg0) {
				this.aClass3_Sub8ArrayArray2[arg0.anInt1179][arg0.anInt1171] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)I")
	public int method2846() {
		return this.anInt3724;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	private void method2848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray309[arg0]) {
			this.anIntArray309[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass3_Sub8ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)V")
	public synchronized void method2849(@OriginalArg(0) int arg0) {
		this.anInt3724 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
	private void method2850(@OriginalArg(0) int arg0) {
		if ((this.anIntArray318[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(25) Class3_Sub8 local25 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method267(); local25 != null; local25 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method268()) {
			if (local25.anInt1179 == arg0 && this.aClass3_Sub8ArrayArray1[arg0][local25.anInt1180] == null && local25.anInt1188 < 0) {
				local25.anInt1188 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V")
	private void method2851(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method2851(local7);
			}
			return;
		}
		this.anIntArray319[arg0] = 12800;
		this.anIntArray313[arg0] = 8192;
		this.anIntArray307[arg0] = 16383;
		this.anIntArray314[arg0] = 8192;
		this.anIntArray320[arg0] = 0;
		this.anIntArray316[arg0] = 8192;
		this.method2850(arg0);
		this.method2861(arg0);
		this.anIntArray318[arg0] = 0;
		this.anIntArray315[arg0] = 32767;
		this.anIntArray312[arg0] = 256;
		this.anIntArray317[arg0] = 0;
		this.method2867(8192, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V")
	public synchronized void method2852() {
		for (@Pc(15) Class3_Sub21 local15 = (Class3_Sub21) this.aClass40_14.method1026(); local15 != null; local15 = (Class3_Sub21) this.aClass40_14.method1024()) {
			local15.method2420();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3248(@OriginalArg(0) int arg0) {
		if (this.aClass79_1.method2377()) {
			@Pc(18) int local18 = this.anInt3719 * this.aClass79_1.anInt3265 / Static91.anInt1796;
			do {
				@Pc(27) long local27 = this.aLong125 + (long) local18 * (long) arg0;
				if (this.aLong126 - local27 >= 0L) {
					this.aLong125 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong126 - this.aLong125 - 1L) / (long) local18);
				this.aLong125 += (long) local58 * (long) local18;
				arg0 -= local58;
				this.aClass3_Sub19_Sub1_1.method3248(local58);
				this.method2866();
			} while (this.aClass79_1.method2377());
		}
		this.aClass3_Sub19_Sub1_1.method3248(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V")
	private void method2853(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local5 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2855(local22, local28, local16);
		} else if (local5 == 144) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			if (local28 <= 0) {
				this.method2855(local22, 64, local16);
			} else {
				this.method2860(local28, local16, local22);
			}
		} else if (local5 == 160) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			this.method2876(local22, local28, local16);
		} else if (local5 == 176) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray306[local16] = (local28 << 14) + (this.anIntArray306[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray306[local16] = (this.anIntArray306[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray320[local16] = (this.anIntArray320[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray320[local16] = (this.anIntArray320[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray316[local16] = (local28 << 7) + (this.anIntArray316[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray316[local16] = (this.anIntArray316[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray319[local16] = (local28 << 7) + (this.anIntArray319[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray319[local16] = (this.anIntArray319[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray313[local16] = (this.anIntArray313[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray313[local16] = (this.anIntArray313[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray307[local16] = (this.anIntArray307[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray307[local16] = (this.anIntArray307[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray318[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray318[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method2850(local16);
					this.anIntArray318[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray318[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray315[local16] = (local28 << 7) + (this.anIntArray315[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray315[local16] = local28 + (this.anIntArray315[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray315[local16] = (this.anIntArray315[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray315[local16] = (this.anIntArray315[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method2870(local16);
			}
			if (local22 == 121) {
				this.method2851(local16);
			}
			if (local22 == 123) {
				this.method2874(local16);
			}
			@Pc(496) int local496;
			if (local22 == 6) {
				local496 = this.anIntArray315[local16];
				if (local496 == 16384) {
					this.anIntArray312[local16] = (local28 << 7) + (this.anIntArray312[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local496 = this.anIntArray315[local16];
				if (local496 == 16384) {
					this.anIntArray312[local16] = (this.anIntArray312[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray317[local16] = (this.anIntArray317[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray317[local16] = (this.anIntArray317[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray318[local16] |= 0x4;
				} else {
					this.method2861(local16);
					this.anIntArray318[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method2867((local28 << 7) + (this.anIntArray310[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method2867(local28 + (this.anIntArray310[local16] & 0xFFFFFF80), local16);
			}
		} else if (local5 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2848(local16, local22 + this.anIntArray306[local16]);
		} else if (local5 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2859(local22, local16);
		} else if (local5 == 224) {
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			local16 = arg0 & 0xF;
			this.method2856(local22, local16);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method2863();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)Z")
	public synchronized boolean method2854() {
		return this.aClass79_1.method2377();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
	private void method2855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub8 local12 = this.aClass3_Sub8ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub8ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray318[arg2] & 0x2) == 0) {
			local12.anInt1188 = 0;
			return;
		}
		for (@Pc(44) Class3_Sub8 local44 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method267(); local44 != null; local44 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method268()) {
			if (local44.anInt1179 == local12.anInt1179 && local44.anInt1188 < 0 && local44 != local12) {
				local12.anInt1188 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
	private void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray314[arg1] = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILclient!fd;)I")
	private int method2857(@OriginalArg(1) Class3_Sub8 arg0) {
		@Pc(19) int local19 = (arg0.anInt1181 * arg0.anInt1177 >> 12) + arg0.anInt1175;
		local19 += (this.anIntArray314[arg0.anInt1179] - 8192) * this.anIntArray312[arg0.anInt1179] >> 12;
		@Pc(40) Class43 local40 = arg0.aClass43_1;
		@Pc(60) int local60;
		if (local40.anInt1627 > 0 && (local40.anInt1629 > 0 || this.anIntArray320[arg0.anInt1179] > 0)) {
			local60 = local40.anInt1629 << 2;
			@Pc(65) int local65 = local40.anInt1621 << 1;
			if (arg0.anInt1176 < local65) {
				local60 = local60 * arg0.anInt1176 / local65;
			}
			local60 += this.anIntArray320[arg0.anInt1179] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt1182 & 0x1FF) * 0.01227184630308513D);
			local19 += (int) (local99 * (double) local60);
		}
		local60 = (int) ((double) (arg0.aClass3_Sub24_Sub1_1.anInt3687 * 256) * Math.pow(2.0D, (double) local19 * 3.255208333333333E-4D) / (double) Static91.anInt1796 + 0.5D);
		return local60 < 1 ? 1 : local60;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!fd;I)I")
	private int method2858(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(11) Class43 local11 = arg0.aClass43_1;
		@Pc(27) int local27 = this.anIntArray319[arg0.anInt1179] * this.anIntArray307[arg0.anInt1179] + 4096 >> 13;
		@Pc(35) int local35 = local27 * local27 + 16384 >> 15;
		@Pc(44) int local44 = local35 * arg0.anInt1178 + 16384 >> 15;
		local27 = local44 * this.anInt3724 + 128 >> 8;
		if (local11.anInt1618 > 0) {
			local27 = (int) (Math.pow(0.5D, (double) arg0.anInt1187 * 1.953125E-5D * (double) local11.anInt1618) * (double) local27 + 0.5D);
		}
		@Pc(91) int local91;
		@Pc(88) int local88;
		@Pc(109) int local109;
		@Pc(121) int local121;
		if (local11.aByteArray10 != null) {
			local88 = local11.aByteArray10[arg0.anInt1190 + 1];
			local91 = arg0.anInt1174;
			if (local11.aByteArray10.length - 2 > arg0.anInt1190) {
				local109 = (local11.aByteArray10[arg0.anInt1190] & 0xFF) << 8;
				local121 = (local11.aByteArray10[arg0.anInt1190 + 2] & 0xFF) << 8;
				local88 += (local91 - local109) * (local11.aByteArray10[arg0.anInt1190 + 3] - local88) / (local121 - local109);
			}
			local27 = local88 * local27 + 32 >> 6;
		}
		if (arg0.anInt1188 > 0 && local11.aByteArray11 != null) {
			local91 = arg0.anInt1188;
			local88 = local11.aByteArray11[arg0.anInt1186 + 1];
			if (arg0.anInt1186 < local11.aByteArray11.length - 2) {
				local109 = (local11.aByteArray11[arg0.anInt1186] & 0xFF) << 8;
				local121 = (local11.aByteArray11[arg0.anInt1186 + 2] & 0xFF) << 8;
				local88 += (local91 - local109) * (local11.aByteArray11[arg0.anInt1186 + 3] - local88) / (local121 - local109);
			}
			local27 = local27 * local88 + 32 >> 6;
		}
		return local27;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BII)V")
	private void method2859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIII)V")
	private void method2860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2855(arg2, 64, arg1);
		if ((this.anIntArray318[arg1] & 0x2) != 0) {
			for (@Pc(27) Class3_Sub8 local27 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method257(); local27 != null; local27 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method269()) {
				if (local27.anInt1179 == arg1 && local27.anInt1188 < 0) {
					this.aClass3_Sub8ArrayArray1[arg1][local27.anInt1180] = null;
					this.aClass3_Sub8ArrayArray1[arg1][arg2] = local27;
					@Pc(66) int local66 = local27.anInt1175 + (local27.anInt1177 * local27.anInt1181 >> 12);
					local27.anInt1175 += arg2 - local27.anInt1180 << 8;
					local27.anInt1181 = 4096;
					local27.anInt1180 = arg2;
					local27.anInt1177 = local66 - local27.anInt1175;
					return;
				}
			}
		}
		@Pc(112) Class3_Sub21 local112 = (Class3_Sub21) this.aClass40_14.method1029((long) this.anIntArray309[arg1]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class3_Sub24_Sub1 local120 = local112.aClass3_Sub24_Sub1Array1[arg2];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class3_Sub8 local127 = new Class3_Sub8();
		local127.anInt1179 = arg1;
		local127.aClass3_Sub24_Sub1_1 = local120;
		local127.aClass3_Sub21_1 = local112;
		local127.aClass43_1 = local112.aClass43Array1[arg2];
		local127.anInt1171 = local112.aByteArray35[arg2];
		local127.anInt1180 = arg2;
		local127.anInt1178 = local112.aByteArray36[arg2] * arg0 * arg0 * local112.anInt3310 + 1024 >> 11;
		local127.anInt1185 = local112.aByteArray34[arg2] & 0xFF;
		local127.anInt1175 = (arg2 << 8) - (local112.aShortArray44[arg2] & 0x7FFF);
		local127.anInt1186 = 0;
		local127.anInt1190 = 0;
		local127.anInt1188 = -1;
		local127.anInt1187 = 0;
		local127.anInt1174 = 0;
		if (this.anIntArray317[arg1] == 0) {
			local127.aClass3_Sub19_Sub4_1 = Static220.method3255(local120, this.method2857(local127), this.method2858(local127), this.method2864(local127));
		} else {
			local127.aClass3_Sub19_Sub4_1 = Static220.method3255(local120, this.method2857(local127), 0, this.method2864(local127));
			this.method2869(local127, local112.aShortArray44[arg2] < 0);
		}
		if (local112.aShortArray44[arg2] < 0) {
			local127.aClass3_Sub19_Sub4_1.method3285(-1);
		}
		if (local127.anInt1171 >= 0) {
			@Pc(280) Class3_Sub8 local280 = this.aClass3_Sub8ArrayArray2[arg1][local127.anInt1171];
			if (local280 != null && local280.anInt1188 < 0) {
				this.aClass3_Sub8ArrayArray1[arg1][local280.anInt1180] = null;
				local280.anInt1188 = 0;
			}
			this.aClass3_Sub8ArrayArray2[arg1][local127.anInt1171] = local127;
		}
		this.aClass3_Sub19_Sub1_1.aClass10_66.method261(local127);
		this.aClass3_Sub8ArrayArray1[arg1][arg2] = local127;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3249(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass79_1.method2377()) {
			@Pc(14) int local14 = this.anInt3719 * this.aClass79_1.anInt3265 / Static91.anInt1796;
			do {
				@Pc(24) long local24 = this.aLong125 + (long) arg2 * (long) local14;
				if (this.aLong126 - local24 >= 0L) {
					this.aLong125 = local24;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong126 + (long) local14 - this.aLong125 - 1L) / (long) local14);
				this.aLong125 += (long) local53 * (long) local14;
				this.aClass3_Sub19_Sub1_1.method3249(arg0, arg1, local53);
				this.method2866();
				arg2 -= local53;
				arg1 += local53;
			} while (this.aClass79_1.method2377());
		}
		this.aClass3_Sub19_Sub1_1.method3249(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)V")
	private void method2861(@OriginalArg(1) int arg0) {
		if ((this.anIntArray318[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class3_Sub8 local16 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method267(); local16 != null; local16 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method268()) {
			if (local16.anInt1179 == arg0) {
				local16.anInt1194 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()Lclient!pb;")
	@Override
	public synchronized Class3_Sub19 method3247() {
		return this.aClass3_Sub19_Sub1_1;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	private void method2863() {
		this.method2870(-1);
		this.method2851(-1);
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			this.anIntArray309[local13] = this.anIntArray308[local13];
		}
		for (@Pc(30) int local30 = 0; local30 < 16; local30++) {
			this.anIntArray306[local30] = this.anIntArray308[local30] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(ILclient!fd;)I")
	private int method2864(@OriginalArg(1) Class3_Sub8 arg0) {
		@Pc(15) int local15 = this.anIntArray313[arg0.anInt1179];
		return local15 >= 8192 ? 16384 - ((16384 - local15) * (-arg0.anInt1185 + 128) + 32 >> 6) : arg0.anInt1185 * local15 + 32 >> 6;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V")
	public synchronized void method2865() {
		this.method2873();
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(B)V")
	private void method2866() {
		@Pc(8) long local8 = this.aLong126;
		@Pc(15) int local15 = this.anInt3735;
		@Pc(18) int local18 = this.anInt3736;
		while (local18 == this.anInt3736) {
			while (this.aClass79_1.anIntArray238[local15] == local18) {
				this.aClass79_1.method2382(local15);
				@Pc(29) int local29 = this.aClass79_1.method2381(local15);
				if (local29 == 1) {
					this.aClass79_1.method2372();
					this.aClass79_1.method2371(local15);
					if (this.aClass79_1.method2375()) {
						if (!this.aBoolean169 || local18 == 0) {
							this.method2863();
							this.aClass79_1.method2379();
							return;
						}
						this.aClass79_1.method2374(local8);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method2853(local29);
				}
				this.aClass79_1.method2367(local15);
				this.aClass79_1.method2371(local15);
			}
			local15 = this.aClass79_1.method2376();
			local18 = this.aClass79_1.anIntArray238[local15];
			local8 = this.aClass79_1.method2378(local18);
		}
		this.anInt3735 = local15;
		this.aLong126 = local8;
		this.anInt3736 = local18;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(III)V")
	private void method2867(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray310[arg1] = arg0;
		this.anIntArray311[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * (double) 2097152 + 0.5D);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!kb;Lclient!mb;Lclient!ke;I)Z")
	public synchronized boolean method2868(@OriginalArg(1) Class3_Sub18 arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) Class52 arg2) {
		arg0.method1483();
		@Pc(9) boolean local9 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class3_Sub11 local34 = (Class3_Sub11) arg0.aClass40_5.method1026(); local34 != null; local34 = (Class3_Sub11) arg0.aClass40_5.method1024()) {
			@Pc(40) int local40 = (int) local34.aLong147;
			@Pc(48) Class3_Sub21 local48 = (Class3_Sub21) this.aClass40_14.method1029((long) local40);
			if (local48 == null) {
				local48 = Static97.method1406(arg2, local40);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass40_14.method1027(local48, (long) local40);
			}
			if (!local48.method2419(arg1, local28, local34.aByteArray9)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method1485();
		}
		return local9;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!fd;IZ)V")
	public void method2869(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass3_Sub24_Sub1_1.aByteArray47.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass3_Sub24_Sub1_1.aBoolean167) {
			@Pc(37) int local37 = local8 + local8 - arg0.aClass3_Sub24_Sub1_1.anInt3686;
			local27 = (int) ((long) local37 * (long) this.anIntArray317[arg0.anInt1179] >> 6);
			local8 <<= 0x8;
			if (local27 >= local8) {
				arg0.aClass3_Sub19_Sub4_1.method3273();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray317[arg0.anInt1179] >> 6);
		}
		arg0.aClass3_Sub19_Sub4_1.method3253(local27);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(II)V")
	private void method2870(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class3_Sub8 local14 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method267(); local14 != null; local14 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method268()) {
			if (arg0 < 0 || local14.anInt1179 == arg0) {
				if (local14.aClass3_Sub19_Sub4_1 != null) {
					local14.aClass3_Sub19_Sub4_1.method3268(Static91.anInt1796 / 100);
					if (local14.aClass3_Sub19_Sub4_1.method3254()) {
						this.aClass3_Sub19_Sub1_1.aClass3_Sub19_Sub3_1.method2922(local14.aClass3_Sub19_Sub4_1);
					}
					local14.method877();
				}
				if (local14.anInt1188 < 0) {
					this.aClass3_Sub8ArrayArray1[local14.anInt1179][local14.anInt1180] = null;
				}
				local14.method3320();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZLclient!kb;)V")
	public synchronized void method2871(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub18 arg1) {
		this.method2872();
		this.aClass79_1.method2373(arg1.aByteArray18);
		this.aLong125 = 0L;
		this.aBoolean169 = arg0;
		@Pc(27) int local27 = this.aClass79_1.method2380();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			this.aClass79_1.method2382(local29);
			this.aClass79_1.method2367(local29);
			this.aClass79_1.method2371(local29);
		}
		this.anInt3735 = this.aClass79_1.method2376();
		this.anInt3736 = this.aClass79_1.anIntArray238[this.anInt3735];
		this.aLong126 = this.aClass79_1.method2378(this.anInt3736);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public synchronized void method2872() {
		this.aClass79_1.method2379();
		this.method2863();
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(III)V")
	private void method2873() {
		this.anIntArray308[9] = 128;
		this.anIntArray306[9] = 128;
		this.method2848(9, 128);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(II)V")
	private void method2874(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class3_Sub8 local8 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method267(); local8 != null; local8 = (Class3_Sub8) this.aClass3_Sub19_Sub1_1.aClass10_66.method268()) {
			if ((arg0 < 0 || local8.anInt1179 == arg0) && local8.anInt1188 < 0) {
				this.aClass3_Sub8ArrayArray1[local8.anInt1179][local8.anInt1180] = null;
				local8.anInt1188 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	public synchronized void method2875() {
		for (@Pc(7) Class3_Sub21 local7 = (Class3_Sub21) this.aClass40_14.method1026(); local7 != null; local7 = (Class3_Sub21) this.aClass40_14.method1024()) {
			local7.method3320();
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "()Lclient!pb;")
	@Override
	public synchronized Class3_Sub19 method3246() {
		return null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZIII)V")
	private void method2876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}
}
