import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bb", name = "bc", descriptor = "Z")
	private boolean aBoolean20;

	@OriginalMember(owner = "client!bb", name = "cc", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!bb", name = "ec", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!bb", name = "fc", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!bb", name = "gc", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
	private int anInt276 = 256;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "[[Lclient!fi;")
	private final Class3_Sub10[][] aClass3_Sub10ArrayArray2 = new Class3_Sub10[16][128];

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "[I")
	private final int[] anIntArray40 = new int[16];

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "[I")
	private final int[] anIntArray41 = new int[16];

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "[I")
	private final int[] anIntArray46 = new int[16];

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "[I")
	private final int[] anIntArray38 = new int[16];

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "[I")
	public final int[] anIntArray43 = new int[16];

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "[I")
	private final int[] anIntArray47 = new int[16];

	@OriginalMember(owner = "client!bb", name = "Nb", descriptor = "[I")
	public final int[] anIntArray48 = new int[16];

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[[Lclient!fi;")
	private final Class3_Sub10[][] aClass3_Sub10ArrayArray1 = new Class3_Sub10[16][128];

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "[I")
	private final int[] anIntArray37 = new int[16];

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "[I")
	public final int[] anIntArray45 = new int[16];

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "[I")
	private final int[] anIntArray44 = new int[16];

	@OriginalMember(owner = "client!bb", name = "Vb", descriptor = "[I")
	private final int[] anIntArray50 = new int[16];

	@OriginalMember(owner = "client!bb", name = "Yb", descriptor = "[I")
	private final int[] anIntArray51 = new int[16];

	@OriginalMember(owner = "client!bb", name = "Ob", descriptor = "[I")
	private final int[] anIntArray49 = new int[16];

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "[I")
	private final int[] anIntArray42 = new int[16];

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "[I")
	private final int[] anIntArray39 = new int[16];

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
	private final int anInt277 = 1000000;

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lclient!ub;")
	private final Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!bb", name = "dc", descriptor = "Lclient!nd;")
	private final Class3_Sub4_Sub3 aClass3_Sub4_Sub3_1 = new Class3_Sub4_Sub3(this);

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "Lclient!lc;")
	private final Class54 aClass54_3 = new Class54(128);

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub1() {
		this.method215();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Z")
	public synchronized boolean method196() {
		return this.aClass88_1.method2842();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
	private void method198(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 & 0xF0;
		@Pc(23) int local23;
		@Pc(35) int local35;
		@Pc(29) int local29;
		if (local14 == 128) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 16 & 0x7F;
			local35 = arg0 >> 8 & 0x7F;
			this.method225(local35, local29, local23);
		} else if (local14 == 144) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 16 & 0x7F;
			local35 = arg0 >> 8 & 0x7F;
			if (local29 <= 0) {
				this.method225(local35, 64, local23);
			} else {
				this.method222(local35, local23, local29);
			}
		} else if (local14 == 160) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 16 & 0x7F;
			local35 = arg0 >> 8 & 0x7F;
			this.method231(local23, local35, local29);
		} else if (local14 == 176) {
			local35 = arg0 >> 8 & 0x7F;
			local23 = arg0 & 0xF;
			local29 = arg0 >> 16 & 0x7F;
			if (local35 == 0) {
				this.anIntArray41[local23] = (local29 << 14) + (this.anIntArray41[local23] & 0xFFE03FFF);
			}
			if (local35 == 32) {
				this.anIntArray41[local23] = (local29 << 7) + (this.anIntArray41[local23] & 0xFFFFC07F);
			}
			if (local35 == 1) {
				this.anIntArray49[local23] = (this.anIntArray49[local23] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local35 == 33) {
				this.anIntArray49[local23] = (this.anIntArray49[local23] & 0xFFFFFF80) + local29;
			}
			if (local35 == 5) {
				this.anIntArray44[local23] = (local29 << 7) + (this.anIntArray44[local23] & 0xFFFFC07F);
			}
			if (local35 == 37) {
				this.anIntArray44[local23] = local29 + (this.anIntArray44[local23] & 0xFFFFFF80);
			}
			if (local35 == 7) {
				this.anIntArray46[local23] = (local29 << 7) + (this.anIntArray46[local23] & 0xFFFFC07F);
			}
			if (local35 == 39) {
				this.anIntArray46[local23] = (this.anIntArray46[local23] & 0xFFFFFF80) + local29;
			}
			if (local35 == 10) {
				this.anIntArray38[local23] = (this.anIntArray38[local23] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local35 == 42) {
				this.anIntArray38[local23] = (this.anIntArray38[local23] & 0xFFFFFF80) + local29;
			}
			if (local35 == 11) {
				this.anIntArray47[local23] = (local29 << 7) + (this.anIntArray47[local23] & 0xFFFFC07F);
			}
			if (local35 == 43) {
				this.anIntArray47[local23] = (this.anIntArray47[local23] & 0xFFFFFF80) + local29;
			}
			if (local35 == 64) {
				if (local29 >= 64) {
					this.anIntArray45[local23] |= 0x1;
				} else {
					this.anIntArray45[local23] &= 0xFFFFFFFE;
				}
			}
			if (local35 == 65) {
				if (local29 >= 64) {
					this.anIntArray45[local23] |= 0x2;
				} else {
					this.method213(local23);
					this.anIntArray45[local23] &= 0xFFFFFFFD;
				}
			}
			if (local35 == 99) {
				this.anIntArray51[local23] = (this.anIntArray51[local23] & 0x7F) + (local29 << 7);
			}
			if (local35 == 98) {
				this.anIntArray51[local23] = (this.anIntArray51[local23] & 0x3F80) + local29;
			}
			if (local35 == 101) {
				this.anIntArray51[local23] = (local29 << 7) + (this.anIntArray51[local23] & 0x7F) + 16384;
			}
			if (local35 == 100) {
				this.anIntArray51[local23] = (this.anIntArray51[local23] & 0x3F80) + local29 + 16384;
			}
			if (local35 == 120) {
				this.method216(local23);
			}
			if (local35 == 121) {
				this.method207(local23);
			}
			if (local35 == 123) {
				this.method228(local23);
			}
			@Pc(517) int local517;
			if (local35 == 6) {
				local517 = this.anIntArray51[local23];
				if (local517 == 16384) {
					this.anIntArray50[local23] = (local29 << 7) + (this.anIntArray50[local23] & 0xFFFFC07F);
				}
			}
			if (local35 == 38) {
				local517 = this.anIntArray51[local23];
				if (local517 == 16384) {
					this.anIntArray50[local23] = local29 + (this.anIntArray50[local23] & 0xFFFFFF80);
				}
			}
			if (local35 == 16) {
				this.anIntArray48[local23] = (local29 << 7) + (this.anIntArray48[local23] & 0xFFFFC07F);
			}
			if (local35 == 48) {
				this.anIntArray48[local23] = (this.anIntArray48[local23] & 0xFFFFFF80) + local29;
			}
			if (local35 == 81) {
				if (local29 >= 64) {
					this.anIntArray45[local23] |= 0x4;
				} else {
					this.method221(local23);
					this.anIntArray45[local23] &= 0xFFFFFFFB;
				}
			}
			if (local35 == 17) {
				this.method204(local23, (local29 << 7) + (this.anIntArray40[local23] & 0xFFFFC07F));
			}
			if (local35 == 49) {
				this.method204(local23, (this.anIntArray40[local23] & 0xFFFFFF80) + local29);
			}
		} else if (local14 == 192) {
			local35 = arg0 >> 8 & 0x7F;
			local23 = arg0 & 0xF;
			this.method223(this.anIntArray41[local23] + local35, local23);
		} else if (local14 == 208) {
			local35 = arg0 >> 8 & 0x7F;
			local23 = arg0 & 0xF;
			this.method201(local35, local23);
		} else if (local14 == 224) {
			local23 = arg0 & 0xF;
			local35 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method199(local35, local23);
		} else {
			local14 = arg0 & 0xFF;
			if (local14 == 255) {
				this.method215();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZII)V")
	private void method199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray42[arg1] = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(ZII)V")
	public synchronized void method200() {
		this.method232();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	private void method201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	private void method203() {
		@Pc(16) int local16 = this.anInt309;
		@Pc(19) int local19 = this.anInt310;
		@Pc(22) long local22 = this.aLong10;
		while (local19 == this.anInt310) {
			while (this.aClass88_1.anIntArray482[local16] == local19) {
				this.aClass88_1.method2845(local16);
				@Pc(33) int local33 = this.aClass88_1.method2840(local16);
				if (local33 == 1) {
					this.aClass88_1.method2843();
					this.aClass88_1.method2846(local16);
					if (this.aClass88_1.method2850()) {
						if (!this.aBoolean20 || local19 == 0) {
							this.method215();
							this.aClass88_1.method2855();
							return;
						}
						this.aClass88_1.method2854(local22);
					}
					break;
				}
				if ((local33 & 0x80) != 0) {
					this.method198(local33);
				}
				this.aClass88_1.method2848(local16);
				this.aClass88_1.method2846(local16);
			}
			local16 = this.aClass88_1.method2849();
			local19 = this.aClass88_1.anIntArray482[local16];
			local22 = this.aClass88_1.method2847(local19);
		}
		this.aLong10 = local22;
		this.anInt309 = local16;
		this.anInt310 = local19;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)V")
	private void method204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray40[arg0] = arg1;
		this.anIntArray43[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	public synchronized void method205() {
		for (@Pc(11) Class3_Sub23 local11 = (Class3_Sub23) this.aClass54_3.method1503(); local11 != null; local11 = (Class3_Sub23) this.aClass54_3.method1497()) {
			local11.method2768();
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(II)V")
	private void method207(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method207(local12);
			}
			return;
		}
		this.anIntArray46[arg0] = 12800;
		this.anIntArray38[arg0] = 8192;
		this.anIntArray47[arg0] = 16383;
		this.anIntArray42[arg0] = 8192;
		this.anIntArray49[arg0] = 0;
		this.anIntArray44[arg0] = 8192;
		this.method213(arg0);
		this.method221(arg0);
		this.anIntArray45[arg0] = 0;
		this.anIntArray51[arg0] = 32767;
		this.anIntArray50[arg0] = 256;
		this.anIntArray48[arg0] = 0;
		this.method204(arg0, 8192);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	public synchronized void method208() {
		for (@Pc(7) Class3_Sub23 local7 = (Class3_Sub23) this.aClass54_3.method1503(); local7 != null; local7 = (Class3_Sub23) this.aClass54_3.method1497()) {
			local7.method3159();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!fi;)I")
	private int method209(@OriginalArg(1) Class3_Sub10 arg0) {
		@Pc(15) int local15 = this.anIntArray38[arg0.anInt1191];
		return local15 >= 8192 ? 16384 - ((16384 - local15) * (-arg0.anInt1175 + 128) + 32 >> 6) : arg0.anInt1175 * local15 + 32 >> 6;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fi;I)Z")
	public boolean method210(@OriginalArg(0) Class3_Sub10 arg0) {
		if (arg0.aClass3_Sub4_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt1176 >= 0) {
			arg0.method3159();
			if (arg0.anInt1180 > 0 && arg0 == this.aClass3_Sub10ArrayArray1[arg0.anInt1191][arg0.anInt1180]) {
				this.aClass3_Sub10ArrayArray1[arg0.anInt1191][arg0.anInt1180] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!pb;ILclient!wb;Lclient!bc;)Z")
	public synchronized boolean method211(@OriginalArg(1) Class72 arg0, @OriginalArg(3) Class3_Sub25 arg1, @OriginalArg(4) Class1 arg2) {
		@Pc(3) boolean local3 = true;
		arg1.method3115();
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class3_Sub8 local26 = (Class3_Sub8) arg1.aClass54_16.method1503(); local26 != null; local26 = (Class3_Sub8) arg1.aClass54_16.method1497()) {
			@Pc(35) int local35 = (int) local26.aLong154;
			@Pc(43) Class3_Sub23 local43 = (Class3_Sub23) this.aClass54_3.method1496((long) local35);
			if (local43 == null) {
				local43 = Static4.method131(arg2, local35);
				if (local43 == null) {
					local3 = false;
					continue;
				}
				this.aClass54_3.method1494((long) local35, local43);
			}
			if (!local43.method2769(local26.aByteArray3, local20, arg0)) {
				local3 = false;
			}
		}
		if (local3) {
			arg1.method3114();
		}
		return local3;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(BLclient!fi;)I")
	private int method212(@OriginalArg(1) Class3_Sub10 arg0) {
		@Pc(19) int local19 = this.anIntArray47[arg0.anInt1191] * this.anIntArray46[arg0.anInt1191] + 4096 >> 13;
		@Pc(22) Class63 local22 = arg0.aClass63_1;
		@Pc(30) int local30 = local19 * local19 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt1174 + 16384 >> 15;
		local19 = local39 * this.anInt276 + 128 >> 8;
		if (local22.anInt2647 > 0) {
			local19 = (int) (Math.pow(0.5D, (double) local22.anInt2647 * (double) arg0.anInt1183 * 1.953125E-5D) * (double) local19 + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(104) int local104;
		@Pc(116) int local116;
		if (local22.aByteArray26 != null) {
			local83 = local22.aByteArray26[arg0.anInt1181 + 1];
			@Pc(86) int local86 = arg0.anInt1185;
			if (local22.aByteArray26.length - 2 > arg0.anInt1181) {
				local104 = (local22.aByteArray26[arg0.anInt1181] & 0xFF) << 8;
				local116 = (local22.aByteArray26[arg0.anInt1181 + 2] & 0xFF) << 8;
				local83 += (local86 - local104) * (local22.aByteArray26[arg0.anInt1181 + 3] - local83) / (local116 - local104);
			}
			local19 = local83 * local19 + 32 >> 6;
		}
		if (arg0.anInt1176 > 0 && local22.aByteArray25 != null) {
			local83 = arg0.anInt1176;
			local104 = local22.aByteArray25[arg0.anInt1190 + 1];
			if (local22.aByteArray25.length - 2 > arg0.anInt1190) {
				local116 = (local22.aByteArray25[arg0.anInt1190] & 0xFF) << 8;
				@Pc(206) int local206 = (local22.aByteArray25[arg0.anInt1190 + 2] & 0xFF) << 8;
				local104 += (local22.aByteArray25[arg0.anInt1190 + 3] - local104) * (local83 - local116) / (local206 - local116);
			}
			local19 = local19 * local104 + 32 >> 6;
		}
		return local19;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1975(@OriginalArg(0) int arg0) {
		if (this.aClass88_1.method2842()) {
			@Pc(18) int local18 = this.anInt277 * this.aClass88_1.anInt3978 / Static47.anInt1073;
			do {
				@Pc(28) long local28 = this.aLong11 + (long) arg0 * (long) local18;
				if (this.aLong10 - local28 >= 0L) {
					this.aLong11 = local28;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong10 - this.aLong11 - 1L) / (long) local18);
				this.aLong11 += (long) local18 * (long) local56;
				this.aClass3_Sub4_Sub3_1.method1975(local56);
				this.method203();
				arg0 -= local56;
			} while (this.aClass88_1.method2842());
		}
		this.aClass3_Sub4_Sub3_1.method1975(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(II)V")
	private void method213(@OriginalArg(1) int arg0) {
		if ((this.anIntArray45[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class3_Sub10 local23 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1953(); local23 != null; local23 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1948()) {
			if (local23.anInt1191 == arg0 && this.aClass3_Sub10ArrayArray2[arg0][local23.anInt1182] == null && local23.anInt1176 < 0) {
				local23.anInt1176 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fi;B)I")
	private int method214(@OriginalArg(0) Class3_Sub10 arg0) {
		@Pc(20) int local20 = (arg0.anInt1186 * arg0.anInt1192 >> 12) + arg0.anInt1173;
		local20 += (this.anIntArray42[arg0.anInt1191] - 8192) * this.anIntArray50[arg0.anInt1191] >> 12;
		@Pc(41) Class63 local41 = arg0.aClass63_1;
		@Pc(64) int local64;
		if (local41.anInt2652 > 0 && (local41.anInt2656 > 0 || this.anIntArray49[arg0.anInt1191] > 0)) {
			local64 = local41.anInt2656 << 2;
			@Pc(69) int local69 = local41.anInt2654 << 1;
			if (arg0.anInt1184 < local69) {
				local64 = local64 * arg0.anInt1184 / local69;
			}
			local64 += this.anIntArray49[arg0.anInt1191] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt1188 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) ((double) local64 * local99);
		}
		local64 = (int) ((double) (arg0.aClass3_Sub19_Sub1_1.anInt2750 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static47.anInt1073 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	private void method215() {
		this.method216(-1);
		this.method207(-1);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray39[local19] = this.anIntArray37[local19];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray41[local35] = this.anIntArray37[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(II)V")
	private void method216(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class3_Sub10 local14 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1953(); local14 != null; local14 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1948()) {
			if (arg0 < 0 || arg0 == local14.anInt1191) {
				if (local14.aClass3_Sub4_Sub4_1 != null) {
					local14.aClass3_Sub4_Sub4_1.method1991(Static47.anInt1073 / 100);
					if (local14.aClass3_Sub4_Sub4_1.method1997()) {
						this.aClass3_Sub4_Sub3_1.aClass3_Sub4_Sub2_1.method1516(local14.aClass3_Sub4_Sub4_1);
					}
					local14.method799();
				}
				if (local14.anInt1176 < 0) {
					this.aClass3_Sub10ArrayArray2[local14.anInt1191][local14.anInt1182] = null;
				}
				local14.method3159();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
	public synchronized void method220() {
		this.aClass88_1.method2855();
		this.method215();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(IB)V")
	private void method221(@OriginalArg(0) int arg0) {
		if ((this.anIntArray45[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class3_Sub10 local20 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1953(); local20 != null; local20 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1948()) {
			if (arg0 == local20.anInt1191) {
				local20.anInt1187 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "()Lclient!pg;")
	@Override
	public synchronized Class3_Sub4 method1976() {
		return this.aClass3_Sub4_Sub3_1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
	private void method222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method225(arg0, 64, arg1);
		if ((this.anIntArray45[arg1] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub10 local28 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1956(); local28 != null; local28 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1961()) {
				if (arg1 == local28.anInt1191 && local28.anInt1176 < 0) {
					this.aClass3_Sub10ArrayArray2[arg1][local28.anInt1182] = null;
					this.aClass3_Sub10ArrayArray2[arg1][arg0] = local28;
					@Pc(67) int local67 = local28.anInt1173 + (local28.anInt1192 * local28.anInt1186 >> 12);
					local28.anInt1186 = 4096;
					local28.anInt1173 += arg0 - local28.anInt1182 << 8;
					local28.anInt1182 = arg0;
					local28.anInt1192 = local67 - local28.anInt1173;
					return;
				}
			}
		}
		@Pc(113) Class3_Sub23 local113 = (Class3_Sub23) this.aClass54_3.method1496((long) this.anIntArray39[arg1]);
		if (local113 == null) {
			return;
		}
		@Pc(129) Class3_Sub19_Sub1 local129 = local113.aClass3_Sub19_Sub1Array1[arg0];
		if (local129 == null) {
			return;
		}
		@Pc(136) Class3_Sub10 local136 = new Class3_Sub10();
		local136.aClass3_Sub23_1 = local113;
		local136.anInt1191 = arg1;
		local136.aClass3_Sub19_Sub1_1 = local129;
		local136.aClass63_1 = local113.aClass63Array1[arg0];
		local136.anInt1180 = local113.aByteArray45[arg0];
		local136.anInt1182 = arg0;
		local136.anInt1174 = arg2 * arg2 * local113.anInt3860 * local113.aByteArray44[arg0] + 1024 >> 11;
		local136.anInt1175 = local113.aByteArray46[arg0] & 0xFF;
		local136.anInt1173 = (arg0 << 8) - (local113.aShortArray48[arg0] & 0x7FFF);
		local136.anInt1190 = 0;
		local136.anInt1176 = -1;
		local136.anInt1181 = 0;
		local136.anInt1185 = 0;
		local136.anInt1183 = 0;
		if (this.anIntArray48[arg1] == 0) {
			local136.aClass3_Sub4_Sub4_1 = Static202.method1996(local129, this.method214(local136), this.method212(local136), this.method209(local136));
		} else {
			local136.aClass3_Sub4_Sub4_1 = Static202.method1996(local129, this.method214(local136), 0, this.method209(local136));
			this.method224(local136, local113.aShortArray48[arg0] < 0);
		}
		if (local113.aShortArray48[arg0] < 0) {
			local136.aClass3_Sub4_Sub4_1.method1994(-1);
		}
		if (local136.anInt1180 >= 0) {
			@Pc(287) Class3_Sub10 local287 = this.aClass3_Sub10ArrayArray1[arg1][local136.anInt1180];
			if (local287 != null && local287.anInt1176 < 0) {
				this.aClass3_Sub10ArrayArray2[arg1][local287.anInt1182] = null;
				local287.anInt1176 = 0;
			}
			this.aClass3_Sub10ArrayArray1[arg1][local136.anInt1180] = local136;
		}
		this.aClass3_Sub4_Sub3_1.aClass70_15.method1958(local136);
		this.aClass3_Sub10ArrayArray2[arg1][arg0] = local136;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(ZII)V")
	private void method223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray39[arg1] != arg0) {
			this.anIntArray39[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass3_Sub10ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fi;ZZ)V")
	public void method224(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass3_Sub19_Sub1_1.aByteArray37.length;
		@Pc(33) int local33;
		if (arg1 && arg0.aClass3_Sub19_Sub1_1.aBoolean110) {
			@Pc(44) int local44 = local8 + local8 - arg0.aClass3_Sub19_Sub1_1.anInt2751;
			local8 <<= 0x8;
			local33 = (int) ((long) this.anIntArray48[arg0.anInt1191] * (long) local44 >> 6);
			if (local8 <= local33) {
				local33 = local8 + local8 - local33 - 1;
				arg0.aClass3_Sub4_Sub4_1.method2001();
			}
		} else {
			local33 = (int) ((long) local8 * (long) this.anIntArray48[arg0.anInt1191] >> 6);
		}
		arg0.aClass3_Sub4_Sub4_1.method1995(local33);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(IIII)V")
	private void method225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3_Sub10 local16 = this.aClass3_Sub10ArrayArray2[arg2][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass3_Sub10ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray45[arg2] & 0x2) == 0) {
			local16.anInt1176 = 0;
			return;
		}
		for (@Pc(40) Class3_Sub10 local40 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1953(); local40 != null; local40 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1948()) {
			if (local40.anInt1191 == local16.anInt1191 && local40.anInt1176 < 0 && local40 != local16) {
				local16.anInt1176 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(B)I")
	public int method227() {
		return this.anInt276;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1971(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass88_1.method2842()) {
			@Pc(18) int local18 = this.anInt277 * this.aClass88_1.anInt3978 / Static47.anInt1073;
			do {
				@Pc(27) long local27 = this.aLong11 + (long) arg2 * (long) local18;
				if (this.aLong10 - local27 >= 0L) {
					this.aLong11 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong10 - this.aLong11 - 1L) / (long) local18);
				arg2 -= local55;
				this.aLong11 += (long) local55 * (long) local18;
				this.aClass3_Sub4_Sub3_1.method1971(arg0, arg1, local55);
				arg1 += local55;
				this.method203();
			} while (this.aClass88_1.method2842());
		}
		this.aClass3_Sub4_Sub3_1.method1971(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
	private void method228(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub10 local12 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1953(); local12 != null; local12 = (Class3_Sub10) this.aClass3_Sub4_Sub3_1.aClass70_15.method1948()) {
			if ((arg0 < 0 || local12.anInt1191 == arg0) && local12.anInt1176 < 0) {
				this.aClass3_Sub10ArrayArray2[local12.anInt1191][local12.anInt1182] = null;
				local12.anInt1176 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
	public synchronized void method229(@OriginalArg(1) int arg0) {
		this.anInt276 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILclient!wb;)V")
	public synchronized void method230(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		this.method220();
		this.aClass88_1.method2841(arg1.aByteArray50);
		this.aBoolean20 = arg0;
		this.aLong11 = 0L;
		@Pc(23) int local23 = this.aClass88_1.method2844();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass88_1.method2845(local25);
			this.aClass88_1.method2848(local25);
			this.aClass88_1.method2846(local25);
		}
		this.anInt309 = this.aClass88_1.method2849();
		this.anInt310 = this.aClass88_1.anIntArray482[this.anInt309];
		this.aLong10 = this.aClass88_1.method2847(this.anInt310);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BIII)V")
	private void method231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)V")
	private void method232() {
		this.anIntArray37[9] = 128;
		this.anIntArray41[9] = 128;
		this.method223(128, 9);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fi;III[I)Z")
	public boolean method233(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		arg0.anInt1189 = Static47.anInt1073 / 100;
		if (arg0.anInt1176 >= 0 && (arg0.aClass3_Sub4_Sub4_1 == null || arg0.aClass3_Sub4_Sub4_1.method1977())) {
			arg0.method799();
			arg0.method3159();
			if (arg0.anInt1180 > 0 && arg0 == this.aClass3_Sub10ArrayArray1[arg0.anInt1191][arg0.anInt1180]) {
				this.aClass3_Sub10ArrayArray1[arg0.anInt1191][arg0.anInt1180] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg0.anInt1186;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray44[arg0.anInt1191] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg0.anInt1186 = local53;
		}
		arg0.aClass3_Sub4_Sub4_1.method1981(this.method214(arg0));
		@Pc(90) Class63 local90 = arg0.aClass63_1;
		arg0.anInt1188 += local90.anInt2652;
		arg0.anInt1184++;
		@Pc(121) double local121 = (double) ((arg0.anInt1192 * arg0.anInt1186 >> 12) + (arg0.anInt1182 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(129) boolean local129 = false;
		if (local90.anInt2647 > 0) {
			if (local90.anInt2657 <= 0) {
				arg0.anInt1183 += 128;
			} else {
				arg0.anInt1183 += (int) (Math.pow(2.0D, local121 * (double) local90.anInt2657) * 128.0D + 0.5D);
			}
			if (arg0.anInt1183 * local90.anInt2647 >= 819200) {
				local129 = true;
			}
		}
		if (local90.aByteArray26 != null) {
			if (local90.anInt2655 <= 0) {
				arg0.anInt1185 += 128;
			} else {
				arg0.anInt1185 += (int) (Math.pow(2.0D, (double) local90.anInt2655 * local121) * 128.0D + 0.5D);
			}
			while (arg0.anInt1181 < local90.aByteArray26.length - 2 && (local90.aByteArray26[arg0.anInt1181 + 2] & 0xFF) << 8 < arg0.anInt1185) {
				arg0.anInt1181 += 2;
			}
			if (local90.aByteArray26.length - 2 == arg0.anInt1181 && local90.aByteArray26[arg0.anInt1181 + 1] == 0) {
				local129 = true;
			}
		}
		if (arg0.anInt1176 >= 0 && local90.aByteArray25 != null && (this.anIntArray45[arg0.anInt1191] & 0x1) == 0 && (arg0.anInt1180 < 0 || this.aClass3_Sub10ArrayArray1[arg0.anInt1191][arg0.anInt1180] != arg0)) {
			if (local90.anInt2649 > 0) {
				arg0.anInt1176 += (int) (Math.pow(2.0D, (double) local90.anInt2649 * local121) * 128.0D + 0.5D);
			} else {
				arg0.anInt1176 += 128;
			}
			while (arg0.anInt1190 < local90.aByteArray25.length - 2 && arg0.anInt1176 > (local90.aByteArray25[arg0.anInt1190 + 2] & 0xFF) << 8) {
				arg0.anInt1190 += 2;
			}
			if (local90.aByteArray25.length - 2 == arg0.anInt1190) {
				local129 = true;
			}
		}
		if (!local129) {
			arg0.aClass3_Sub4_Sub4_1.method1982(arg0.anInt1189, this.method212(arg0), this.method209(arg0));
			return false;
		}
		arg0.aClass3_Sub4_Sub4_1.method1991(arg0.anInt1189);
		if (arg3 == null) {
			arg0.aClass3_Sub4_Sub4_1.method1975(arg1);
		} else {
			arg0.aClass3_Sub4_Sub4_1.method1971(arg3, arg2, arg1);
		}
		if (arg0.aClass3_Sub4_Sub4_1.method1997()) {
			this.aClass3_Sub4_Sub3_1.aClass3_Sub4_Sub2_1.method1516(arg0.aClass3_Sub4_Sub4_1);
		}
		arg0.method799();
		if (arg0.anInt1176 >= 0) {
			arg0.method3159();
			if (arg0.anInt1180 > 0 && arg0 == this.aClass3_Sub10ArrayArray1[arg0.anInt1191][arg0.anInt1180]) {
				this.aClass3_Sub10ArrayArray1[arg0.anInt1191][arg0.anInt1180] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
	@Override
	public synchronized int method1970() {
		return 0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lclient!pg;")
	@Override
	public synchronized Class3_Sub4 method1973() {
		return null;
	}
}
