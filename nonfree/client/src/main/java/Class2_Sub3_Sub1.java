import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ak", name = "Gb", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!ak", name = "Ib", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!ak", name = "Jb", descriptor = "Z")
	private boolean aBoolean22;

	@OriginalMember(owner = "client!ak", name = "Kb", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!ak", name = "Lb", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ak", name = "Mb", descriptor = "Lclient!tb;")
	private Class2_Sub27 aClass2_Sub27_1;

	@OriginalMember(owner = "client!ak", name = "Nb", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!ak", name = "Ob", descriptor = "Z")
	private boolean aBoolean23;

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "[I")
	public int[] anIntArray34 = new int[16];

	@OriginalMember(owner = "client!ak", name = "T", descriptor = "[I")
	private int[] anIntArray35 = new int[16];

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "[I")
	private int[] anIntArray27 = new int[16];

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "[[Lclient!eh;")
	private Class2_Sub14[][] aClass2_Sub14ArrayArray1 = new Class2_Sub14[16][128];

	@OriginalMember(owner = "client!ak", name = "cb", descriptor = "[I")
	private int[] anIntArray38 = new int[16];

	@OriginalMember(owner = "client!ak", name = "G", descriptor = "[[Lclient!eh;")
	private Class2_Sub14[][] aClass2_Sub14ArrayArray2 = new Class2_Sub14[16][128];

	@OriginalMember(owner = "client!ak", name = "L", descriptor = "[I")
	private int[] anIntArray33 = new int[16];

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "[I")
	private int[] anIntArray30 = new int[16];

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "[I")
	private int[] anIntArray29 = new int[16];

	@OriginalMember(owner = "client!ak", name = "Z", descriptor = "[I")
	private int[] anIntArray36 = new int[16];

	@OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
	private int anInt218 = 256;

	@OriginalMember(owner = "client!ak", name = "ab", descriptor = "[I")
	private int[] anIntArray37 = new int[16];

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "[I")
	private int[] anIntArray32 = new int[16];

	@OriginalMember(owner = "client!ak", name = "xb", descriptor = "[I")
	private int[] anIntArray40 = new int[16];

	@OriginalMember(owner = "client!ak", name = "eb", descriptor = "I")
	private int anInt221 = 1000000;

	@OriginalMember(owner = "client!ak", name = "H", descriptor = "[I")
	public int[] anIntArray31 = new int[16];

	@OriginalMember(owner = "client!ak", name = "sb", descriptor = "[I")
	private int[] anIntArray39 = new int[16];

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "[I")
	private int[] anIntArray28 = new int[16];

	@OriginalMember(owner = "client!ak", name = "Db", descriptor = "[I")
	private int[] anIntArray41 = new int[16];

	@OriginalMember(owner = "client!ak", name = "Fb", descriptor = "[I")
	public int[] anIntArray42 = new int[16];

	@OriginalMember(owner = "client!ak", name = "S", descriptor = "Lclient!hn;")
	private Class76 aClass76_1 = new Class76();

	@OriginalMember(owner = "client!ak", name = "Hb", descriptor = "Lclient!co;")
	private Class2_Sub3_Sub3 aClass2_Sub3_Sub3_1 = new Class2_Sub3_Sub3(this);

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Lclient!l;")
	private Class101 aClass101_1 = new Class101(128);

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub1() {
		this.method205();
		this.method218(true);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "()I")
	@Override
	public synchronized int method4651() {
		return 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V")
	private void method188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
	private void method189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray41[arg0]) {
			this.anIntArray41[arg0] = arg1;
			for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
				this.aClass2_Sub14ArrayArray2[arg0][local20] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
	public synchronized void method190() {
		for (@Pc(11) Class2_Sub22 local11 = (Class2_Sub22) this.aClass101_1.method2868(); local11 != null; local11 = (Class2_Sub22) this.aClass101_1.method2859()) {
			local11.method4743();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
	private void method191(@OriginalArg(1) int arg0) {
		if ((this.anIntArray34[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class2_Sub14 local25 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1352(); local25 != null; local25 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1360()) {
			if (local25.anInt1580 == arg0) {
				local25.anInt1583 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
	private void method192(@OriginalArg(1) int arg0) {
		if ((this.anIntArray34[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(26) Class2_Sub14 local26 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1352(); local26 != null; local26 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1360()) {
			if (local26.anInt1580 == arg0 && this.aClass2_Sub14ArrayArray1[arg0][local26.anInt1591] == null && local26.anInt1586 < 0) {
				local26.anInt1586 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	public synchronized void method193() {
		this.method206(true);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)V")
	private void method194(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub14 local12 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1352(); local12 != null; local12 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1360()) {
			if ((arg0 < 0 || local12.anInt1580 == arg0) && local12.anInt1586 < 0) {
				this.aClass2_Sub14ArrayArray1[local12.anInt1580][local12.anInt1591] = null;
				local12.anInt1586 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IBI)V")
	public synchronized void method196() {
		this.method221();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!eh;I)I")
	private int method198(@OriginalArg(0) Class2_Sub14 arg0) {
		@Pc(6) Class192 local6 = arg0.aClass192_1;
		@Pc(18) int local18 = arg0.anInt1589 + (arg0.anInt1584 * arg0.anInt1588 >> 12);
		local18 += this.anIntArray40[arg0.anInt1580] * (this.anIntArray29[arg0.anInt1580] - 8192) >> 12;
		@Pc(63) int local63;
		if (local6.anInt5948 > 0 && (local6.anInt5952 > 0 || this.anIntArray30[arg0.anInt1580] > 0)) {
			local63 = local6.anInt5952 << 2;
			@Pc(68) int local68 = local6.anInt5955 << 1;
			if (local68 > arg0.anInt1570) {
				local63 = local63 * arg0.anInt1570 / local68;
			}
			local63 += this.anIntArray30[arg0.anInt1580] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt1577 & 0x1FF) * 0.01227184630308513D);
			local18 += (int) ((double) local63 * local102);
		}
		local63 = (int) ((double) (arg0.aClass2_Sub19_Sub1_1.anInt3520 * 256) * Math.pow(2.0D, (double) local18 * 3.255208333333333E-4D) / (double) Static107.anInt2456 + 0.5D);
		return local63 >= 1 ? local63 : 1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLclient!eh;I)V")
	public void method199(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub14 arg1) {
		@Pc(16) int local16 = arg1.aClass2_Sub19_Sub1_1.aByteArray36.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass2_Sub19_Sub1_1.aBoolean241) {
			@Pc(31) int local31 = local16 + local16 - arg1.aClass2_Sub19_Sub1_1.anInt3518;
			local44 = (int) ((long) this.anIntArray42[arg1.anInt1580] * (long) local31 >> 6);
			local16 <<= 0x8;
			if (local16 <= local44) {
				local44 = local16 + local16 - local44 - 1;
				arg1.aClass2_Sub3_Sub2_1.method434();
			}
		} else {
			local44 = (int) ((long) this.anIntArray42[arg1.anInt1580] * (long) local16 >> 6);
		}
		arg1.aClass2_Sub3_Sub2_1.method421(local44);
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "()Lclient!mh;")
	@Override
	public synchronized Class2_Sub3 method4654() {
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
	public synchronized void method201(@OriginalArg(1) int arg0) {
		this.anInt218 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIII)V")
	private void method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method207(arg2, 64, arg1);
		if ((this.anIntArray34[arg2] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub14 local28 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1350(); local28 != null; local28 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1357()) {
				if (local28.anInt1580 == arg2 && local28.anInt1586 < 0) {
					this.aClass2_Sub14ArrayArray1[arg2][local28.anInt1591] = null;
					this.aClass2_Sub14ArrayArray1[arg2][arg1] = local28;
					@Pc(71) int local71 = (local28.anInt1584 * local28.anInt1588 >> 12) + local28.anInt1589;
					local28.anInt1588 = 4096;
					local28.anInt1589 += arg1 - local28.anInt1591 << 8;
					local28.anInt1591 = arg1;
					local28.anInt1584 = local71 - local28.anInt1589;
					return;
				}
			}
		}
		@Pc(116) Class2_Sub22 local116 = (Class2_Sub22) this.aClass101_1.method2867((long) this.anIntArray41[arg2]);
		if (local116 == null) {
			return;
		}
		@Pc(132) Class2_Sub19_Sub1 local132 = local116.aClass2_Sub19_Sub1Array1[arg1];
		if (local132 == null) {
			return;
		}
		@Pc(141) Class2_Sub14 local141 = new Class2_Sub14();
		local141.aClass2_Sub22_1 = local116;
		local141.anInt1580 = arg2;
		local141.aClass2_Sub19_Sub1_1 = local132;
		local141.aClass192_1 = local116.aClass192Array1[arg1];
		local141.anInt1574 = local116.aByteArray44[arg1];
		local141.anInt1591 = arg1;
		local141.anInt1587 = local116.anInt4198 * arg0 * arg0 * local116.aByteArray45[arg1] + 1024 >> 11;
		local141.anInt1576 = local116.aByteArray46[arg1] & 0xFF;
		local141.anInt1589 = (arg1 << 8) - (local116.aShortArray60[arg1] & 0x7FFF);
		local141.anInt1581 = 0;
		local141.anInt1571 = 0;
		local141.anInt1579 = 0;
		local141.anInt1586 = -1;
		local141.anInt1578 = 0;
		if (this.anIntArray42[arg2] == 0) {
			local141.aClass2_Sub3_Sub2_1 = Static316.method415(local132, this.method198(local141), this.method227(local141), this.method211(local141));
		} else {
			local141.aClass2_Sub3_Sub2_1 = Static316.method415(local132, this.method198(local141), 0, this.method211(local141));
			this.method199(local116.aShortArray60[arg1] < 0, local141);
		}
		if (local116.aShortArray60[arg1] < 0) {
			local141.aClass2_Sub3_Sub2_1.method405(-1);
		}
		if (local141.anInt1574 >= 0) {
			@Pc(286) Class2_Sub14 local286 = this.aClass2_Sub14ArrayArray2[arg2][local141.anInt1574];
			if (local286 != null && local286.anInt1586 < 0) {
				this.aClass2_Sub14ArrayArray1[arg2][local286.anInt1591] = null;
				local286.anInt1586 = 0;
			}
			this.aClass2_Sub14ArrayArray2[arg2][local141.anInt1574] = local141;
		}
		this.aClass2_Sub3_Sub3_1.aClass44_4.method1358(local141);
		this.aClass2_Sub14ArrayArray1[arg2][arg1] = local141;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(IBI)V")
	private void method203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray29[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!eh;B[III)Z")
	public boolean method204(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt1573 = Static107.anInt2456 / 100;
		if (arg0.anInt1586 >= 0 && (arg0.aClass2_Sub3_Sub2_1 == null || arg0.aClass2_Sub3_Sub2_1.method406())) {
			arg0.method1198();
			arg0.method4743();
			if (arg0.anInt1574 > 0 && arg0 == this.aClass2_Sub14ArrayArray2[arg0.anInt1580][arg0.anInt1574]) {
				this.aClass2_Sub14ArrayArray2[arg0.anInt1580][arg0.anInt1574] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg0.anInt1588;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray27[arg0.anInt1580] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg0.anInt1588 = local61;
		}
		arg0.aClass2_Sub3_Sub2_1.method413(this.method198(arg0));
		@Pc(119) double local119 = (double) ((arg0.anInt1591 - 60 << 8) + (arg0.anInt1588 * arg0.anInt1584 >> 12)) * 5.086263020833333E-6D;
		@Pc(122) Class192 local122 = arg0.aClass192_1;
		@Pc(124) boolean local124 = false;
		arg0.anInt1570++;
		arg0.anInt1577 += local122.anInt5948;
		if (local122.anInt5947 > 0) {
			if (local122.anInt5951 <= 0) {
				arg0.anInt1578 += 128;
			} else {
				arg0.anInt1578 += (int) (Math.pow(2.0D, (double) local122.anInt5951 * local119) * 128.0D + 0.5D);
			}
			if (arg0.anInt1578 * local122.anInt5947 >= 819200) {
				local124 = true;
			}
		}
		if (local122.aByteArray74 != null) {
			if (local122.anInt5956 <= 0) {
				arg0.anInt1579 += 128;
			} else {
				arg0.anInt1579 += (int) (Math.pow(2.0D, local119 * (double) local122.anInt5956) * 128.0D + 0.5D);
			}
			while (arg0.anInt1571 < local122.aByteArray74.length - 2 && arg0.anInt1579 > (local122.aByteArray74[arg0.anInt1571 + 2] & 0xFF) << 8) {
				arg0.anInt1571 += 2;
			}
			if (local122.aByteArray74.length - 2 == arg0.anInt1571 && local122.aByteArray74[arg0.anInt1571 + 1] == 0) {
				local124 = true;
			}
		}
		if (arg0.anInt1586 >= 0 && local122.aByteArray73 != null && (this.anIntArray34[arg0.anInt1580] & 0x1) == 0 && (arg0.anInt1574 < 0 || arg0 != this.aClass2_Sub14ArrayArray2[arg0.anInt1580][arg0.anInt1574])) {
			if (local122.anInt5949 <= 0) {
				arg0.anInt1586 += 128;
			} else {
				arg0.anInt1586 += (int) (Math.pow(2.0D, local119 * (double) local122.anInt5949) * 128.0D + 0.5D);
			}
			while (local122.aByteArray73.length - 2 > arg0.anInt1581 && (local122.aByteArray73[arg0.anInt1581 + 2] & 0xFF) << 8 < arg0.anInt1586) {
				arg0.anInt1581 += 2;
			}
			if (local122.aByteArray73.length - 2 == arg0.anInt1581) {
				local124 = true;
			}
		}
		if (!local124) {
			arg0.aClass2_Sub3_Sub2_1.method433(arg0.anInt1573, this.method227(arg0), this.method211(arg0));
			return false;
		}
		arg0.aClass2_Sub3_Sub2_1.method402(arg0.anInt1573);
		if (arg1 == null) {
			arg0.aClass2_Sub3_Sub2_1.method4650(arg3);
		} else {
			arg0.aClass2_Sub3_Sub2_1.method4653(arg1, arg2, arg3);
		}
		if (arg0.aClass2_Sub3_Sub2_1.method417()) {
			this.aClass2_Sub3_Sub3_1.aClass2_Sub3_Sub4_1.method4657(arg0.aClass2_Sub3_Sub2_1);
		}
		arg0.method1198();
		if (arg0.anInt1586 >= 0) {
			arg0.method4743();
			if (arg0.anInt1574 > 0 && arg0 == this.aClass2_Sub14ArrayArray2[arg0.anInt1580][arg0.anInt1574]) {
				this.aClass2_Sub14ArrayArray2[arg0.anInt1580][arg0.anInt1574] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)V")
	private synchronized void method205() {
		for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
			this.anIntArray37[local16] = 256;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)V")
	private synchronized void method206(@OriginalArg(1) boolean arg0) {
		this.aClass76_1.method1915();
		this.aClass2_Sub27_1 = null;
		this.method218(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IIII)V")
	private void method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub14 local12 = this.aClass2_Sub14ArrayArray1[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub14ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray34[arg0] & 0x2) == 0) {
			local12.anInt1586 = 0;
			return;
		}
		for (@Pc(42) Class2_Sub14 local42 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1352(); local42 != null; local42 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1360()) {
			if (local12.anInt1580 == local42.anInt1580 && local42.anInt1586 < 0 && local12 != local42) {
				local12.anInt1586 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "()Lclient!mh;")
	@Override
	public synchronized Class2_Sub3 method4649() {
		return this.aClass2_Sub3_Sub3_1;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Lclient!eh;I)Z")
	public boolean method208(@OriginalArg(0) Class2_Sub14 arg0) {
		if (arg0.aClass2_Sub3_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt1586 >= 0) {
			arg0.method4743();
			if (arg0.anInt1574 > 0 && this.aClass2_Sub14ArrayArray2[arg0.anInt1580][arg0.anInt1574] == arg0) {
				this.aClass2_Sub14ArrayArray2[arg0.anInt1580][arg0.anInt1574] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
	private void method209(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method209(local12);
			}
			return;
		}
		this.anIntArray35[arg0] = 12800;
		this.anIntArray36[arg0] = 8192;
		this.anIntArray38[arg0] = 16383;
		this.anIntArray29[arg0] = 8192;
		this.anIntArray30[arg0] = 0;
		this.anIntArray27[arg0] = 8192;
		this.method192(arg0);
		this.method191(arg0);
		this.anIntArray34[arg0] = 0;
		this.anIntArray39[arg0] = 32767;
		this.anIntArray40[arg0] = 256;
		this.anIntArray42[arg0] = 0;
		this.method215(arg0, 8192);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4653(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass76_1.method1919()) {
			@Pc(14) int local14 = this.aClass76_1.anInt2575 * this.anInt221 / Static107.anInt2456;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong9;
				if (this.aLong10 - local23 >= 0L) {
					this.aLong9 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong10 + (long) local14 - this.aLong9 - 1L) / (long) local14);
				arg2 -= local55;
				this.aLong9 += (long) local14 * (long) local55;
				this.aClass2_Sub3_Sub3_1.method4653(arg0, arg1, local55);
				this.method216();
				arg1 += local55;
			} while (this.aClass76_1.method1919());
		}
		this.aClass2_Sub3_Sub3_1.method4653(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIBI)V")
	private void method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!eh;)I")
	private int method211(@OriginalArg(1) Class2_Sub14 arg0) {
		@Pc(14) int local14 = this.anIntArray36[arg0.anInt1580];
		return local14 >= 8192 ? 16384 - ((128 - arg0.anInt1576) * (-local14 + 16384) + 32 >> 6) : arg0.anInt1576 * local14 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Z")
	public synchronized boolean method212() {
		return this.aClass76_1.method1919();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZILclient!tb;)V")
	private synchronized void method213(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class2_Sub27 arg2) {
		this.method206(arg1);
		this.aClass76_1.method1921(arg2.aByteArray55);
		this.aBoolean22 = arg0;
		this.aLong9 = 0;
		@Pc(25) int local25 = this.aClass76_1.method1924();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			this.aClass76_1.method1923(local27);
			this.aClass76_1.method1911(local27);
			this.aClass76_1.method1920(local27);
		}
		this.anInt245 = this.aClass76_1.method1922();
		this.anInt244 = this.aClass76_1.anIntArray227[this.anInt245];
		this.aLong10 = this.aClass76_1.method1909(this.anInt244);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!ek;Lclient!tb;ILclient!nb;)Z")
	public synchronized boolean method214(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class2_Sub27 arg1, @OriginalArg(4) Class118 arg2) {
		@Pc(3) boolean local3 = true;
		arg1.method4189();
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class2_Sub2 local26 = (Class2_Sub2) arg1.aClass101_22.method2868(); local26 != null; local26 = (Class2_Sub2) arg1.aClass101_22.method2859()) {
			@Pc(32) int local32 = (int) local26.aLong214;
			@Pc(40) Class2_Sub22 local40 = (Class2_Sub22) this.aClass101_1.method2867((long) local32);
			if (local40 == null) {
				local40 = Static178.method4273(local32, arg0);
				if (local40 == null) {
					local3 = false;
					continue;
				}
				this.aClass101_1.method2860(local40, (long) local32);
			}
			if (!local40.method3406(local20, local26.aByteArray1, arg2)) {
				local3 = false;
			}
		}
		if (local3) {
			arg1.method4187();
		}
		return local3;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZII)V")
	private void method215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray33[arg0] = arg1;
		this.anIntArray31[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V")
	private void method216() {
		@Pc(4) int local4 = this.anInt244;
		@Pc(11) int local11 = this.anInt245;
		@Pc(19) long local19 = this.aLong10;
		if (this.aClass2_Sub27_1 != null && local4 == this.anInt246) {
			this.method213(this.aBoolean22, this.aBoolean23, this.aClass2_Sub27_1);
			this.method216();
			return;
		}
		while (this.anInt244 == local4) {
			while (local4 == this.aClass76_1.anIntArray227[local11]) {
				this.aClass76_1.method1923(local11);
				@Pc(64) int local64 = this.aClass76_1.method1912(local11);
				if (local64 == 1) {
					this.aClass76_1.method1917();
					this.aClass76_1.method1920(local11);
					if (this.aClass76_1.method1916()) {
						if (this.aClass2_Sub27_1 != null) {
							this.method222(this.aClass2_Sub27_1, this.aBoolean22);
							this.method216();
							return;
						}
						if (!this.aBoolean22 || local4 == 0) {
							this.method218(true);
							this.aClass76_1.method1915();
							return;
						}
						this.aClass76_1.method1910(local19);
					}
					break;
				}
				if ((local64 & 0x80) != 0) {
					this.method224(local64);
				}
				this.aClass76_1.method1911(local11);
				this.aClass76_1.method1920(local11);
			}
			local11 = this.aClass76_1.method1922();
			local4 = this.aClass76_1.anIntArray227[local11];
			local19 = this.aClass76_1.method1909(local4);
		}
		this.aLong10 = local19;
		this.anInt245 = local11;
		this.anInt244 = local4;
		if (this.aClass2_Sub27_1 != null && local4 > this.anInt246) {
			this.anInt245 = -1;
			this.anInt244 = this.anInt246;
			this.aLong10 = this.aClass76_1.method1909(this.anInt244);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
	private void method217(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class2_Sub14 local18 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1352(); local18 != null; local18 = (Class2_Sub14) this.aClass2_Sub3_Sub3_1.aClass44_4.method1360()) {
			if (arg0 < 0 || local18.anInt1580 == arg0) {
				if (local18.aClass2_Sub3_Sub2_1 != null) {
					local18.aClass2_Sub3_Sub2_1.method402(Static107.anInt2456 / 100);
					if (local18.aClass2_Sub3_Sub2_1.method417()) {
						this.aClass2_Sub3_Sub3_1.aClass2_Sub3_Sub4_1.method4657(local18.aClass2_Sub3_Sub2_1);
					}
					local18.method1198();
				}
				if (local18.anInt1586 < 0) {
					this.aClass2_Sub14ArrayArray1[local18.anInt1580][local18.anInt1591] = null;
				}
				local18.method4743();
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZ)V")
	private void method218(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method217(-1);
		} else {
			this.method194(-1);
		}
		this.method209(-1);
		@Pc(19) int local19;
		for (local19 = 0; local19 < 16; local19++) {
			this.anIntArray41[local19] = this.anIntArray28[local19];
		}
		for (local19 = 0; local19 < 16; local19++) {
			this.anIntArray32[local19] = this.anIntArray28[local19] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)V")
	private void method221() {
		this.anIntArray28[9] = 128;
		this.anIntArray32[9] = 128;
		this.method189(9, 128);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!tb;Z)V")
	public synchronized void method222(@OriginalArg(1) Class2_Sub27 arg0, @OriginalArg(2) boolean arg1) {
		this.method213(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4650(@OriginalArg(0) int arg0) {
		if (this.aClass76_1.method1919()) {
			@Pc(14) int local14 = this.anInt221 * this.aClass76_1.anInt2575 / Static107.anInt2456;
			do {
				@Pc(23) long local23 = this.aLong9 + (long) local14 * (long) arg0;
				if (this.aLong10 - local23 >= 0L) {
					this.aLong9 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong10 + (long) local14 - this.aLong9 - 1L) / (long) local14);
				arg0 -= local55;
				this.aLong9 += (long) local55 * (long) local14;
				this.aClass2_Sub3_Sub3_1.method4650(local55);
				this.method216();
			} while (this.aClass76_1.method1919());
		}
		this.aClass2_Sub3_Sub3_1.method4650(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)V")
	private void method224(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(29) int local29;
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (local5 == 128) {
			local19 = arg0 >> 8 & 0x7F;
			local25 = arg0 >> 16 & 0x7F;
			local29 = arg0 & 0xF;
			this.method207(local29, local25, local19);
		} else if (local5 == 144) {
			local29 = arg0 & 0xF;
			local19 = arg0 >> 8 & 0x7F;
			local25 = arg0 >> 16 & 0x7F;
			if (local25 <= 0) {
				this.method207(local29, 64, local19);
			} else {
				this.method202(local25, local19, local29);
			}
		} else if (local5 == 160) {
			local29 = arg0 & 0xF;
			local25 = arg0 >> 16 & 0x7F;
			local19 = arg0 >> 8 & 0x7F;
			this.method210(local29, local19, local25);
		} else if (local5 == 176) {
			local19 = arg0 >> 8 & 0x7F;
			local25 = arg0 >> 16 & 0x7F;
			local29 = arg0 & 0xF;
			if (local19 == 0) {
				this.anIntArray32[local29] = (this.anIntArray32[local29] & 0xFFE03FFF) + (local25 << 14);
			}
			if (local19 == 32) {
				this.anIntArray32[local29] = (local25 << 7) + (this.anIntArray32[local29] & 0xFFFFC07F);
			}
			if (local19 == 1) {
				this.anIntArray30[local29] = (local25 << 7) + (this.anIntArray30[local29] & 0xFFFFC07F);
			}
			if (local19 == 33) {
				this.anIntArray30[local29] = local25 + (this.anIntArray30[local29] & 0xFFFFFF80);
			}
			if (local19 == 5) {
				this.anIntArray27[local29] = (local25 << 7) + (this.anIntArray27[local29] & 0xFFFFC07F);
			}
			if (local19 == 37) {
				this.anIntArray27[local29] = local25 + (this.anIntArray27[local29] & 0xFFFFFF80);
			}
			if (local19 == 7) {
				this.anIntArray35[local29] = (this.anIntArray35[local29] & 0xFFFFC07F) + (local25 << 7);
			}
			if (local19 == 39) {
				this.anIntArray35[local29] = (this.anIntArray35[local29] & 0xFFFFFF80) + local25;
			}
			if (local19 == 10) {
				this.anIntArray36[local29] = (local25 << 7) + (this.anIntArray36[local29] & 0xFFFFC07F);
			}
			if (local19 == 42) {
				this.anIntArray36[local29] = (this.anIntArray36[local29] & 0xFFFFFF80) + local25;
			}
			if (local19 == 11) {
				this.anIntArray38[local29] = (local25 << 7) + (this.anIntArray38[local29] & 0xFFFFC07F);
			}
			if (local19 == 43) {
				this.anIntArray38[local29] = (this.anIntArray38[local29] & 0xFFFFFF80) + local25;
			}
			if (local19 == 64) {
				if (local25 >= 64) {
					this.anIntArray34[local29] |= 0x1;
				} else {
					this.anIntArray34[local29] &= 0xFFFFFFFE;
				}
			}
			if (local19 == 65) {
				if (local25 < 64) {
					this.method192(local29);
					this.anIntArray34[local29] &= 0xFFFFFFFD;
				} else {
					this.anIntArray34[local29] |= 0x2;
				}
			}
			if (local19 == 99) {
				this.anIntArray39[local29] = (local25 << 7) + (this.anIntArray39[local29] & 0x7F);
			}
			if (local19 == 98) {
				this.anIntArray39[local29] = (this.anIntArray39[local29] & 0x3F80) + local25;
			}
			if (local19 == 101) {
				this.anIntArray39[local29] = (local25 << 7) + (this.anIntArray39[local29] & 0x7F) + 16384;
			}
			if (local19 == 100) {
				this.anIntArray39[local29] = (this.anIntArray39[local29] & 0x3F80) + local25 + 16384;
			}
			if (local19 == 120) {
				this.method217(local29);
			}
			if (local19 == 121) {
				this.method209(local29);
			}
			if (local19 == 123) {
				this.method194(local29);
			}
			@Pc(498) int local498;
			if (local19 == 6) {
				local498 = this.anIntArray39[local29];
				if (local498 == 16384) {
					this.anIntArray40[local29] = (local25 << 7) + (this.anIntArray40[local29] & 0xFFFFC07F);
				}
			}
			if (local19 == 38) {
				local498 = this.anIntArray39[local29];
				if (local498 == 16384) {
					this.anIntArray40[local29] = (this.anIntArray40[local29] & 0xFFFFFF80) + local25;
				}
			}
			if (local19 == 16) {
				this.anIntArray42[local29] = (this.anIntArray42[local29] & 0xFFFFC07F) + (local25 << 7);
			}
			if (local19 == 48) {
				this.anIntArray42[local29] = local25 + (this.anIntArray42[local29] & 0xFFFFFF80);
			}
			if (local19 == 81) {
				if (local25 >= 64) {
					this.anIntArray34[local29] |= 0x4;
				} else {
					this.method191(local29);
					this.anIntArray34[local29] &= 0xFFFFFFFB;
				}
			}
			if (local19 == 17) {
				this.method215(local29, (this.anIntArray33[local29] & 0xFFFFC07F) + (local25 << 7));
			}
			if (local19 == 49) {
				this.method215(local29, (this.anIntArray33[local29] & 0xFFFFFF80) + local25);
			}
		} else if (local5 == 192) {
			local29 = arg0 & 0xF;
			local19 = arg0 >> 8 & 0x7F;
			this.method189(local29, local19 + this.anIntArray32[local29]);
		} else if (local5 == 208) {
			local29 = arg0 & 0xF;
			local19 = arg0 >> 8 & 0x7F;
			this.method188(local29, local19);
		} else if (local5 == 224) {
			local29 = arg0 & 0xF;
			local19 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method203(local19, local29);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method218(true);
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
	public synchronized void method225() {
		for (@Pc(7) Class2_Sub22 local7 = (Class2_Sub22) this.aClass101_1.method2868(); local7 != null; local7 = (Class2_Sub22) this.aClass101_1.method2859()) {
			local7.method3411();
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)I")
	public int method226() {
		return this.anInt218;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(Lclient!eh;I)I")
	private int method227(@OriginalArg(0) Class2_Sub14 arg0) {
		if (this.anIntArray37[arg0.anInt1580] == 0) {
			return 0;
		}
		@Pc(15) Class192 local15 = arg0.aClass192_1;
		@Pc(31) int local31 = this.anIntArray38[arg0.anInt1580] * this.anIntArray35[arg0.anInt1580] + 4096 >> 13;
		@Pc(39) int local39 = local31 * local31 + 16384 >> 15;
		@Pc(48) int local48 = local39 * arg0.anInt1587 + 16384 >> 15;
		@Pc(57) int local57 = local48 * this.anInt218 + 128 >> 8;
		local31 = local57 * this.anIntArray37[arg0.anInt1580] + 128 >> 8;
		if (local15.anInt5947 > 0) {
			local31 = (int) ((double) local31 * Math.pow(0.5D, (double) local15.anInt5947 * 1.953125E-5D * (double) arg0.anInt1578) + 0.5D);
		}
		@Pc(115) int local115;
		@Pc(112) int local112;
		@Pc(138) int local138;
		@Pc(150) int local150;
		if (local15.aByteArray74 != null) {
			local112 = local15.aByteArray74[arg0.anInt1571 + 1];
			local115 = arg0.anInt1579;
			if (arg0.anInt1571 < local15.aByteArray74.length - 2) {
				local138 = (local15.aByteArray74[arg0.anInt1571] & 0xFF) << 8;
				local150 = (local15.aByteArray74[arg0.anInt1571 + 2] & 0xFF) << 8;
				local112 += (local115 - local138) * (local15.aByteArray74[arg0.anInt1571 + 3] - local112) / (local150 - local138);
			}
			local31 = local112 * local31 + 32 >> 6;
		}
		if (arg0.anInt1586 > 0 && local15.aByteArray73 != null) {
			local115 = arg0.anInt1586;
			local112 = local15.aByteArray73[arg0.anInt1581 + 1];
			if (arg0.anInt1581 < local15.aByteArray73.length - 2) {
				local138 = (local15.aByteArray73[arg0.anInt1581] & 0xFF) << 8;
				local150 = (local15.aByteArray73[arg0.anInt1581 + 2] & 0xFF) << 8;
				local112 += (local15.aByteArray73[arg0.anInt1581 + 3] - local112) * (-local138 + local115) / (local150 - local138);
			}
			local31 = local31 * local112 + 32 >> 6;
		}
		return local31;
	}
}
