import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!lf", name = "cc", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!lf", name = "dc", descriptor = "I")
	private int anInt1898;

	@OriginalMember(owner = "client!lf", name = "ec", descriptor = "I")
	private int anInt1899;

	@OriginalMember(owner = "client!lf", name = "gc", descriptor = "Z")
	private boolean aBoolean85;

	@OriginalMember(owner = "client!lf", name = "hc", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	private int anInt1860 = 256;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "[I")
	private final int[] anIntArray148 = new int[16];

	@OriginalMember(owner = "client!lf", name = "gb", descriptor = "[I")
	public final int[] anIntArray150 = new int[16];

	@OriginalMember(owner = "client!lf", name = "jb", descriptor = "[I")
	private final int[] anIntArray151 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "[I")
	private final int[] anIntArray149 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "[I")
	public final int[] anIntArray146 = new int[16];

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "[I")
	private final int[] anIntArray145 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Eb", descriptor = "[I")
	private final int[] anIntArray154 = new int[16];

	@OriginalMember(owner = "client!lf", name = "rb", descriptor = "[I")
	public final int[] anIntArray153 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Fb", descriptor = "[I")
	private final int[] anIntArray155 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Xb", descriptor = "[I")
	private final int[] anIntArray158 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Ub", descriptor = "[[Lclient!w;")
	private final Class3_Sub19[][] aClass3_Sub19ArrayArray2 = new Class3_Sub19[16][128];

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "[I")
	private final int[] anIntArray147 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Sb", descriptor = "[[Lclient!w;")
	private final Class3_Sub19[][] aClass3_Sub19ArrayArray1 = new Class3_Sub19[16][128];

	@OriginalMember(owner = "client!lf", name = "Hb", descriptor = "[I")
	private final int[] anIntArray156 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Yb", descriptor = "[I")
	private final int[] anIntArray159 = new int[16];

	@OriginalMember(owner = "client!lf", name = "lb", descriptor = "[I")
	private final int[] anIntArray152 = new int[16];

	@OriginalMember(owner = "client!lf", name = "Wb", descriptor = "[I")
	private final int[] anIntArray157 = new int[16];

	@OriginalMember(owner = "client!lf", name = "sb", descriptor = "Lclient!vb;")
	private final Class77 aClass77_1 = new Class77();

	@OriginalMember(owner = "client!lf", name = "fc", descriptor = "Lclient!bb;")
	private final Class3_Sub3_Sub1 aClass3_Sub3_Sub1_1 = new Class3_Sub3_Sub1(this);

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "Lclient!ab;")
	private final Class2 aClass2_6 = new Class2(128);

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub2() {
		this.method1241();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	private void method1231(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class3_Sub19 local12 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method989(); local12 != null; local12 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method990()) {
			if ((arg0 < 0 || local12.anInt3034 == arg0) && local12.anInt3029 < 0) {
				this.aClass3_Sub19ArrayArray1[local12.anInt3034][local12.anInt3036] = null;
				local12.anInt3029 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Z")
	public synchronized boolean method1232() {
		return this.aClass77_1.method1932();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
	public synchronized void method1233(@OriginalArg(1) int arg0) {
		this.anInt1860 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	public synchronized void method1235() {
		this.aClass77_1.method1943();
		this.method1241();
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	private void method1236() {
		@Pc(8) int local8 = this.anInt1899;
		@Pc(11) int local11 = this.anInt1898;
		@Pc(14) long local14 = this.aLong49;
		while (this.anInt1899 == local8) {
			while (local8 == this.aClass77_1.anIntArray310[local11]) {
				this.aClass77_1.method1940(local11);
				@Pc(25) int local25 = this.aClass77_1.method1946(local11);
				if (local25 == 1) {
					this.aClass77_1.method1939();
					this.aClass77_1.method1945(local11);
					if (this.aClass77_1.method1935()) {
						if (!this.aBoolean85 || local8 == 0) {
							this.method1241();
							this.aClass77_1.method1943();
							return;
						}
						this.aClass77_1.method1938(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method1262(local25);
				}
				this.aClass77_1.method1933(local11);
				this.aClass77_1.method1945(local11);
			}
			local11 = this.aClass77_1.method1934();
			local8 = this.aClass77_1.anIntArray310[local11];
			local14 = this.aClass77_1.method1944(local8);
		}
		this.anInt1898 = local11;
		this.anInt1899 = local8;
		this.aLong49 = local14;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
	public synchronized void method1239() {
		for (@Pc(19) Class3_Sub10 local19 = (Class3_Sub10) this.aClass2_6.method10(); local19 != null; local19 = (Class3_Sub10) this.aClass2_6.method14()) {
			local19.method2055();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	private void method1240(@OriginalArg(0) int arg0) {
		if ((this.anIntArray146[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(27) Class3_Sub19 local27 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method989(); local27 != null; local27 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method990()) {
			if (local27.anInt3034 == arg0 && this.aClass3_Sub19ArrayArray1[arg0][local27.anInt3036] == null && local27.anInt3029 < 0) {
				local27.anInt3029 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	private void method1241() {
		this.method1253(-1);
		this.method1248(-1);
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			this.anIntArray155[local11] = this.anIntArray158[local11];
		}
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray154[local29] = this.anIntArray158[local29] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2057(@OriginalArg(0) int arg0) {
		if (this.aClass77_1.method1932()) {
			@Pc(17) int local17 = this.aClass77_1.anInt2991 * 1000000 / Static7.anInt420;
			do {
				@Pc(26) long local26 = this.aLong50 + (long) arg0 * (long) local17;
				if (this.aLong49 - local26 >= 0L) {
					this.aLong50 = local26;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local17 + this.aLong49 - this.aLong50 - 1L) / (long) local17);
				this.aLong50 += (long) local17 * (long) local55;
				this.aClass3_Sub3_Sub1_1.method2057(local55);
				this.method1236();
				arg0 -= local55;
			} while (this.aClass77_1.method1932());
		}
		this.aClass3_Sub3_Sub1_1.method2057(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)I")
	public int method1242() {
		return this.anInt1860;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!w;B)I")
	private int method1243(@OriginalArg(0) Class3_Sub19 arg0) {
		@Pc(14) int local14 = (arg0.anInt3030 * arg0.anInt3031 >> 12) + arg0.anInt3023;
		@Pc(17) Class32 local17 = arg0.aClass32_1;
		local14 += this.anIntArray148[arg0.anInt3034] * (this.anIntArray159[arg0.anInt3034] - 8192) >> 12;
		@Pc(55) int local55;
		if (local17.anInt1159 > 0 && (local17.anInt1151 > 0 || this.anIntArray156[arg0.anInt3034] > 0)) {
			local55 = local17.anInt1151 << 2;
			@Pc(60) int local60 = local17.anInt1155 << 1;
			if (arg0.anInt3033 < local60) {
				local55 = local55 * arg0.anInt3033 / local60;
			}
			local55 += this.anIntArray156[arg0.anInt3034] >> 7;
			@Pc(94) double local94 = Math.sin((double) (arg0.anInt3028 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local94 * (double) local55);
		}
		local55 = (int) ((double) (arg0.aClass3_Sub4_Sub1_1.anInt2498 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static7.anInt420 + 0.5D);
		return local55 < 1 ? 1 : local55;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!w;)Z")
	public boolean method1244(@OriginalArg(1) Class3_Sub19 arg0) {
		arg0.anInt3042 = Static7.anInt420 / 100;
		if (arg0.anInt3029 >= 0 && (arg0.aClass3_Sub3_Sub3_3 == null || arg0.aClass3_Sub3_Sub3_3.method1576())) {
			arg0.method1973();
			arg0.method2055();
			if (arg0.anInt3039 > 0 && this.aClass3_Sub19ArrayArray2[arg0.anInt3034][arg0.anInt3039] == arg0) {
				this.aClass3_Sub19ArrayArray2[arg0.anInt3034][arg0.anInt3039] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg0.anInt3030;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray145[arg0.anInt3034] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg0.anInt3030 = local53;
		}
		arg0.aClass3_Sub3_Sub3_3.method1593(this.method1243(arg0));
		@Pc(98) Class32 local98 = arg0.aClass32_1;
		@Pc(100) boolean local100 = false;
		arg0.anInt3033++;
		@Pc(124) double local124 = (double) ((arg0.anInt3030 * arg0.anInt3031 >> 12) + (arg0.anInt3036 - 60 << 8)) * 5.086263020833333E-6D;
		arg0.anInt3028 += local98.anInt1159;
		if (local98.anInt1157 > 0) {
			if (local98.anInt1161 <= 0) {
				arg0.anInt3025 += 128;
			} else {
				arg0.anInt3025 += (int) (Math.pow(2.0D, local124 * (double) local98.anInt1161) * 128.0D + 0.5D);
			}
		}
		if (local98.aByteArray12 != null) {
			if (local98.anInt1153 <= 0) {
				arg0.anInt3038 += 128;
			} else {
				arg0.anInt3038 += (int) (Math.pow(2.0D, local124 * (double) local98.anInt1153) * 128.0D + 0.5D);
			}
			while (local98.aByteArray12.length - 2 > arg0.anInt3024 && arg0.anInt3038 > (local98.aByteArray12[arg0.anInt3024 + 2] & 0xFF) << 8) {
				arg0.anInt3024 += 2;
			}
			if (arg0.anInt3024 == local98.aByteArray12.length - 2 && local98.aByteArray12[arg0.anInt3024 + 1] == 0) {
				local100 = true;
			}
		}
		if (arg0.anInt3029 >= 0 && local98.aByteArray13 != null && (this.anIntArray146[arg0.anInt3034] & 0x1) == 0 && (arg0.anInt3039 < 0 || arg0 != this.aClass3_Sub19ArrayArray2[arg0.anInt3034][arg0.anInt3039])) {
			if (local98.anInt1152 <= 0) {
				arg0.anInt3029 += 128;
			} else {
				arg0.anInt3029 += (int) (Math.pow(2.0D, (double) local98.anInt1152 * local124) * 128.0D + 0.5D);
			}
			while (arg0.anInt3044 < local98.aByteArray13.length - 2 && (local98.aByteArray13[arg0.anInt3044 + 2] & 0xFF) << 8 < arg0.anInt3029) {
				arg0.anInt3044 += 2;
			}
			if (local98.aByteArray13.length - 2 == arg0.anInt3044) {
				local100 = true;
			}
		}
		if (!local100) {
			arg0.aClass3_Sub3_Sub3_3.method1569(arg0.anInt3042, this.method1246(arg0), this.method1259(arg0));
			return false;
		}
		arg0.aClass3_Sub3_Sub3_3.method1571(arg0.anInt3042);
		if (arg0.aClass3_Sub3_Sub3_3.method1594()) {
			this.aClass3_Sub3_Sub1_1.aClass3_Sub3_Sub4_1.method2068(arg0.aClass3_Sub3_Sub3_3);
		}
		arg0.method1973();
		if (arg0.anInt3029 >= 0) {
			arg0.method2055();
			if (arg0.anInt3039 > 0 && arg0 == this.aClass3_Sub19ArrayArray2[arg0.anInt3034][arg0.anInt3039]) {
				this.aClass3_Sub19ArrayArray2[arg0.anInt3034][arg0.anInt3039] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)V")
	public synchronized void method1245() {
		for (@Pc(11) Class3_Sub10 local11 = (Class3_Sub10) this.aClass2_6.method10(); local11 != null; local11 = (Class3_Sub10) this.aClass2_6.method14()) {
			local11.method1010();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!w;)I")
	private int method1246(@OriginalArg(1) Class3_Sub19 arg0) {
		@Pc(6) Class32 local6 = arg0.aClass32_1;
		@Pc(22) int local22 = this.anIntArray152[arg0.anInt3034] * this.anIntArray157[arg0.anInt3034] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt3027 * local30 + 16384 >> 15;
		local22 = local39 * this.anInt1860 + 128 >> 8;
		if (local6.anInt1157 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) local6.anInt1157 * 1.953125E-5D * (double) arg0.anInt3025) * (double) local22 + 0.5D);
		}
		@Pc(86) int local86;
		@Pc(83) int local83;
		@Pc(120) int local120;
		@Pc(110) int local110;
		if (local6.aByteArray12 != null) {
			local83 = local6.aByteArray12[arg0.anInt3024 + 1];
			local86 = arg0.anInt3038;
			if (arg0.anInt3024 < local6.aByteArray12.length - 2) {
				local110 = (local6.aByteArray12[arg0.anInt3024 + 2] & 0xFF) << 8;
				local120 = (local6.aByteArray12[arg0.anInt3024] & 0xFF) << 8;
				local83 += (local86 - local120) * (local6.aByteArray12[arg0.anInt3024 + 3] - local83) / (local110 - local120);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		if (arg0.anInt3029 > 0 && local6.aByteArray13 != null) {
			local86 = arg0.anInt3029;
			local83 = local6.aByteArray13[arg0.anInt3044 + 1];
			if (local6.aByteArray13.length - 2 > arg0.anInt3044) {
				local120 = (local6.aByteArray13[arg0.anInt3044] & 0xFF) << 8;
				local110 = (local6.aByteArray13[arg0.anInt3044 + 2] & 0xFF) << 8;
				local83 += (local6.aByteArray13[arg0.anInt3044 + 3] - local83) * (local86 - local120) / (local110 - local120);
			}
			local22 = local22 * local83 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	private void method1248(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1248(local9);
			}
			return;
		}
		this.anIntArray157[arg0] = 12800;
		this.anIntArray147[arg0] = 8192;
		this.anIntArray152[arg0] = 16383;
		this.anIntArray159[arg0] = 8192;
		this.anIntArray156[arg0] = 0;
		this.anIntArray145[arg0] = 8192;
		this.method1240(arg0);
		this.method1258(arg0);
		this.anIntArray146[arg0] = 0;
		this.anIntArray149[arg0] = 32767;
		this.anIntArray148[arg0] = 256;
		this.anIntArray150[arg0] = 0;
		this.method1251(8192, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V")
	public synchronized void method1249() {
		this.method1263();
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "()Lclient!be;")
	@Override
	public synchronized Class3_Sub3 method2060() {
		return this.aClass3_Sub3_Sub1_1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V")
	private void method1250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	private void method1251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray151[arg1] = arg0;
		this.anIntArray153[arg1] = (int) (Math.pow((double) 2, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIB)V")
	private void method1252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V")
	private void method1253(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class3_Sub19 local18 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method989(); local18 != null; local18 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method990()) {
			if (arg0 < 0 || arg0 == local18.anInt3034) {
				if (local18.aClass3_Sub3_Sub3_3 != null) {
					local18.aClass3_Sub3_Sub3_3.method1571(Static7.anInt420 / 100);
					if (local18.aClass3_Sub3_Sub3_3.method1594()) {
						this.aClass3_Sub3_Sub1_1.aClass3_Sub3_Sub4_1.method2068(local18.aClass3_Sub3_Sub3_3);
					}
					local18.method1973();
				}
				if (local18.anInt3029 < 0) {
					this.aClass3_Sub19ArrayArray1[local18.anInt3034][local18.anInt3036] = null;
				}
				local18.method2055();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()Lclient!be;")
	@Override
	public synchronized Class3_Sub3 method2059() {
		return null;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2062(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass77_1.method1932()) {
			@Pc(17) int local17 = this.aClass77_1.anInt2991 * 1000000 / Static7.anInt420;
			do {
				@Pc(26) long local26 = this.aLong50 + (long) arg2 * (long) local17;
				if (this.aLong49 - local26 >= 0L) {
					this.aLong50 = local26;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local17 + this.aLong49 - this.aLong50 - 1L) / (long) local17);
				arg2 -= local55;
				this.aLong50 += (long) local17 * (long) local55;
				this.aClass3_Sub3_Sub1_1.method2062(arg0, arg1, local55);
				this.method1236();
				arg1 += local55;
			} while (this.aClass77_1.method1932());
		}
		this.aClass3_Sub3_Sub1_1.method2062(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!w;ZI)V")
	public void method1255(@OriginalArg(0) Class3_Sub19 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(13) int local13 = arg0.aClass3_Sub4_Sub1_1.aByteArray32.length;
		@Pc(41) int local41;
		if (arg1 && arg0.aClass3_Sub4_Sub1_1.aBoolean117) {
			@Pc(28) int local28 = local13 + local13 - arg0.aClass3_Sub4_Sub1_1.anInt2499;
			local41 = (int) ((long) local28 * (long) this.anIntArray150[arg0.anInt3034] >> 6);
			local13 <<= 0x8;
			if (local41 >= local13) {
				arg0.aClass3_Sub3_Sub3_3.method1568();
				local41 = local13 + local13 - local41 - 1;
			}
		} else {
			local41 = (int) ((long) this.anIntArray150[arg0.anInt3034] * (long) local13 >> 6);
		}
		arg0.aClass3_Sub3_Sub3_3.method1590(local41);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIII)V")
	private void method1256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class3_Sub19 local13 = this.aClass3_Sub19ArrayArray1[arg2][arg0];
		if (local13 == null) {
			return;
		}
		this.aClass3_Sub19ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray146[arg2] & 0x2) == 0) {
			local13.anInt3029 = 0;
			return;
		}
		for (@Pc(44) Class3_Sub19 local44 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method989(); local44 != null; local44 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method990()) {
			if (local13.anInt3034 == local44.anInt3034 && local44.anInt3029 < 0 && local13 != local44) {
				local13.anInt3029 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)V")
	private void method1257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray159[arg1] = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)V")
	private void method1258(@OriginalArg(0) int arg0) {
		if ((this.anIntArray146[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class3_Sub19 local18 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method989(); local18 != null; local18 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method990()) {
			if (arg0 == local18.anInt3034) {
				local18.anInt3035 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!w;I)I")
	private int method1259(@OriginalArg(0) Class3_Sub19 arg0) {
		@Pc(14) int local14 = this.anIntArray147[arg0.anInt3034];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt3037 + 128) + 32 >> 6) : local14 * arg0.anInt3037 + 32 >> 6;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
	private void method1260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray155[arg0]) {
			this.anIntArray155[arg0] = arg1;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass3_Sub19ArrayArray2[arg0][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(IIII)V")
	private void method1261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method1256(arg2, 64, arg0);
		if ((this.anIntArray146[arg0] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub19 local25 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method997(); local25 != null; local25 = (Class3_Sub19) this.aClass3_Sub3_Sub1_1.aClass37_1.method993()) {
				if (arg0 == local25.anInt3034 && local25.anInt3029 < 0) {
					this.aClass3_Sub19ArrayArray1[arg0][local25.anInt3036] = null;
					this.aClass3_Sub19ArrayArray1[arg0][arg2] = local25;
					@Pc(60) int local60 = (local25.anInt3030 * local25.anInt3031 >> 12) + local25.anInt3023;
					local25.anInt3023 += arg2 - local25.anInt3036 << 8;
					local25.anInt3030 = 4096;
					local25.anInt3031 = local60 - local25.anInt3023;
					local25.anInt3036 = arg2;
					return;
				}
			}
		}
		@Pc(105) Class3_Sub10 local105 = (Class3_Sub10) this.aClass2_6.method17((long) this.anIntArray155[arg0]);
		if (local105 == null) {
			return;
		}
		@Pc(113) Class3_Sub4_Sub1 local113 = local105.aClass3_Sub4_Sub1Array1[arg2];
		if (local113 == null) {
			return;
		}
		@Pc(127) Class3_Sub19 local127 = new Class3_Sub19();
		local127.anInt3034 = arg0;
		local127.aClass3_Sub10_1 = local105;
		local127.aClass3_Sub4_Sub1_1 = local113;
		local127.aClass32_1 = local105.aClass32Array1[arg2];
		local127.anInt3039 = local105.aByteArray16[arg2];
		local127.anInt3036 = arg2;
		local127.anInt3027 = local105.aByteArray17[arg2] * local105.anInt1542 * arg1 * arg1 + 1024 >> 11;
		local127.anInt3037 = local105.aByteArray18[arg2] & 0xFF;
		local127.anInt3023 = (arg2 << 8) - (local105.aShortArray4[arg2] & 0x7FFF);
		local127.anInt3025 = 0;
		local127.anInt3024 = 0;
		local127.anInt3044 = 0;
		local127.anInt3038 = 0;
		local127.anInt3029 = -1;
		if (this.anIntArray150[arg0] == 0) {
			local127.aClass3_Sub3_Sub3_3 = Static132.method1577(local113, this.method1243(local127), this.method1246(local127), this.method1259(local127));
		} else {
			local127.aClass3_Sub3_Sub3_3 = Static132.method1577(local113, this.method1243(local127), 0, this.method1259(local127));
			this.method1255(local127, local105.aShortArray4[arg2] < 0);
		}
		if (local105.aShortArray4[arg2] < 0) {
			local127.aClass3_Sub3_Sub3_3.method1564(-1);
		}
		if (local127.anInt3039 >= 0) {
			@Pc(278) Class3_Sub19 local278 = this.aClass3_Sub19ArrayArray2[arg0][local127.anInt3039];
			if (local278 != null && local278.anInt3029 < 0) {
				this.aClass3_Sub19ArrayArray1[arg0][local278.anInt3036] = null;
				local278.anInt3029 = 0;
			}
			this.aClass3_Sub19ArrayArray2[arg0][local127.anInt3039] = local127;
		}
		this.aClass3_Sub3_Sub1_1.aClass37_1.method985(local127);
		this.aClass3_Sub19ArrayArray1[arg0][arg2] = local127;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(IB)V")
	private void method1262(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1256(local24, local30, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1256(local24, 64, local18);
			} else {
				this.method1261(local18, local30, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1250(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 >> 8 & 0x7F;
			if (local24 == 0) {
				this.anIntArray154[local18] = (local30 << 14) + (this.anIntArray154[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray154[local18] = (this.anIntArray154[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray156[local18] = (local30 << 7) + (this.anIntArray156[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray156[local18] = local30 + (this.anIntArray156[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray145[local18] = (local30 << 7) + (this.anIntArray145[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray145[local18] = local30 + (this.anIntArray145[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray157[local18] = (this.anIntArray157[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray157[local18] = local30 + (this.anIntArray157[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray147[local18] = (this.anIntArray147[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray147[local18] = (this.anIntArray147[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray152[local18] = (this.anIntArray152[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray152[local18] = local30 + (this.anIntArray152[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray146[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray146[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1240(local18);
					this.anIntArray146[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray146[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray149[local18] = (local30 << 7) + (this.anIntArray149[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray149[local18] = local30 + (this.anIntArray149[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray149[local18] = (local30 << 7) + ((this.anIntArray149[local18] & 0x7F) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray149[local18] = (this.anIntArray149[local18] & 0x3F80) + (local30 + 16384);
			}
			if (local24 == 120) {
				this.method1253(local18);
			}
			if (local24 == 121) {
				this.method1248(local18);
			}
			if (local24 == 123) {
				this.method1231(local18);
			}
			@Pc(494) int local494;
			if (local24 == 6) {
				local494 = this.anIntArray149[local18];
				if (local494 == 16384) {
					this.anIntArray148[local18] = (this.anIntArray148[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local494 = this.anIntArray149[local18];
				if (local494 == 16384) {
					this.anIntArray148[local18] = local30 + (this.anIntArray148[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray150[local18] = (local30 << 7) + (this.anIntArray150[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray150[local18] = (this.anIntArray150[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method1258(local18);
					this.anIntArray146[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray146[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method1251((local30 << 7) + (this.anIntArray151[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method1251((this.anIntArray151[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1260(local18, this.anIntArray154[local18] + local24);
		} else if (local9 == 208) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method1252(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1257(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1241();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IZI)V")
	private void method1263() {
		this.anIntArray158[9] = 128;
		this.anIntArray154[9] = 128;
		this.method1260(9, 128);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2063() {
		return 0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ha;IILclient!tb;Lclient!va;)Z")
	public synchronized boolean method1264(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(3) Class44 arg1, @OriginalArg(4) Class76 arg2) {
		arg0.method798();
		@Pc(23) int[] local23 = new int[] { 22050 };
		@Pc(25) boolean local25 = true;
		for (@Pc(31) Class3_Sub5 local31 = (Class3_Sub5) arg0.aClass2_2.method10(); local31 != null; local31 = (Class3_Sub5) arg0.aClass2_2.method14()) {
			@Pc(37) int local37 = (int) local31.aLong94;
			@Pc(45) Class3_Sub10 local45 = (Class3_Sub10) this.aClass2_6.method17((long) local37);
			if (local45 == null) {
				local45 = Static96.method1689(local37, arg1);
				if (local45 == null) {
					local25 = false;
					continue;
				}
				this.aClass2_6.method12(local45, (long) local37);
			}
			if (!local45.method1011(local31.aByteArray10, arg2, local23)) {
				local25 = false;
			}
		}
		if (local25) {
			arg0.method797();
		}
		return local25;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ha;IZ)V")
	public synchronized void method1265(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) boolean arg1) {
		this.method1235();
		this.aClass77_1.method1937(arg0.aByteArray11);
		this.aLong50 = 0L;
		this.aBoolean85 = arg1;
		@Pc(21) int local21 = this.aClass77_1.method1947();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			this.aClass77_1.method1940(local23);
			this.aClass77_1.method1933(local23);
			this.aClass77_1.method1945(local23);
		}
		this.anInt1898 = this.aClass77_1.method1934();
		this.anInt1899 = this.aClass77_1.anIntArray310[this.anInt1898];
		this.aLong49 = this.aClass77_1.method1944(this.anInt1899);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lclient!w;B)Z")
	public boolean method1267(@OriginalArg(0) Class3_Sub19 arg0) {
		if (arg0.aClass3_Sub3_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt3029 >= 0) {
			arg0.method2055();
			if (arg0.anInt3039 > 0 && this.aClass3_Sub19ArrayArray2[arg0.anInt3034][arg0.anInt3039] == arg0) {
				this.aClass3_Sub19ArrayArray2[arg0.anInt3034][arg0.anInt3039] = null;
			}
		}
		return true;
	}
}
