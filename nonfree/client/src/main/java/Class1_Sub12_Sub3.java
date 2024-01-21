import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub12_Sub3 extends Class1_Sub12 {

	@OriginalMember(owner = "client!pg", name = "Mb", descriptor = "Z")
	private boolean aBoolean174;

	@OriginalMember(owner = "client!pg", name = "Nb", descriptor = "I")
	private int anInt3044;

	@OriginalMember(owner = "client!pg", name = "Ob", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!pg", name = "Qb", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!pg", name = "Rb", descriptor = "I")
	private int anInt3045;

	@OriginalMember(owner = "client!pg", name = "M", descriptor = "[I")
	public final int[] anIntArray262 = new int[16];

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
	private final int anInt3011 = 1000000;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "[I")
	private final int[] anIntArray260 = new int[16];

	@OriginalMember(owner = "client!pg", name = "mb", descriptor = "[I")
	public final int[] anIntArray270 = new int[16];

	@OriginalMember(owner = "client!pg", name = "cb", descriptor = "[I")
	public final int[] anIntArray267 = new int[16];

	@OriginalMember(owner = "client!pg", name = "R", descriptor = "[I")
	private final int[] anIntArray264 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Y", descriptor = "[I")
	private final int[] anIntArray266 = new int[16];

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "[I")
	private final int[] anIntArray263 = new int[16];

	@OriginalMember(owner = "client!pg", name = "jb", descriptor = "[I")
	private final int[] anIntArray269 = new int[16];

	@OriginalMember(owner = "client!pg", name = "wb", descriptor = "[I")
	private final int[] anIntArray271 = new int[16];

	@OriginalMember(owner = "client!pg", name = "xb", descriptor = "[[Lclient!da;")
	private final Class1_Sub5[][] aClass1_Sub5ArrayArray1 = new Class1_Sub5[16][128];

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "[I")
	private final int[] anIntArray261 = new int[16];

	@OriginalMember(owner = "client!pg", name = "lb", descriptor = "I")
	private int anInt3027 = 256;

	@OriginalMember(owner = "client!pg", name = "db", descriptor = "[I")
	private final int[] anIntArray268 = new int[16];

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "[I")
	private final int[] anIntArray265 = new int[16];

	@OriginalMember(owner = "client!pg", name = "yb", descriptor = "[I")
	private final int[] anIntArray272 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Gb", descriptor = "[[Lclient!da;")
	private final Class1_Sub5[][] aClass1_Sub5ArrayArray2 = new Class1_Sub5[16][128];

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "[I")
	private final int[] anIntArray259 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Kb", descriptor = "[I")
	private final int[] anIntArray274 = new int[16];

	@OriginalMember(owner = "client!pg", name = "kb", descriptor = "Lclient!bc;")
	private final Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!pg", name = "Pb", descriptor = "Lclient!ia;")
	private final Class1_Sub12_Sub1 aClass1_Sub12_Sub1_1 = new Class1_Sub12_Sub1(this);

	@OriginalMember(owner = "client!pg", name = "vb", descriptor = "Lclient!wd;")
	private final Class97 aClass97_15 = new Class97(128);

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class1_Sub12_Sub3() {
		this.method2224();
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	public synchronized void method2222() {
		for (@Pc(7) Class1_Sub13 local7 = (Class1_Sub13) this.aClass97_15.method3372(); local7 != null; local7 = (Class1_Sub13) this.aClass97_15.method3377()) {
			local7.method1352();
		}
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2757(@OriginalArg(0) int arg0) {
		if (this.aClass12_1.method243()) {
			@Pc(14) int local14 = this.aClass12_1.anInt371 * this.anInt3011 / Static96.anInt2009;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg0 + this.aLong163;
				if (this.aLong162 - local23 >= 0L) {
					this.aLong163 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong162 - this.aLong163 - 1L) / (long) local14);
				arg0 -= local54;
				this.aLong163 += (long) local14 * (long) local54;
				this.aClass1_Sub12_Sub1_1.method2757(local54);
				this.method2243();
			} while (this.aClass12_1.method243());
		}
		this.aClass1_Sub12_Sub1_1.method2757(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!da;)I")
	private int method2223(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(15) int local15 = arg0.anInt750 + (arg0.anInt757 * arg0.anInt751 >> 12);
		local15 += (this.anIntArray264[arg0.anInt738] - 8192) * this.anIntArray271[arg0.anInt738] >> 12;
		@Pc(44) Class49 local44 = arg0.aClass49_1;
		@Pc(64) int local64;
		if (local44.anInt1867 > 0 && (local44.anInt1865 > 0 || this.anIntArray261[arg0.anInt738] > 0)) {
			local64 = local44.anInt1865 << 2;
			@Pc(69) int local69 = local44.anInt1864 << 1;
			if (local69 > arg0.anInt740) {
				local64 = arg0.anInt740 * local64 / local69;
			}
			local64 += this.anIntArray261[arg0.anInt738] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt758 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local103 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass1_Sub22_Sub1_1.anInt3127 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static96.anInt2009 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	private void method2224() {
		this.method2233(-1);
		this.method2226(-1);
		for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
			this.anIntArray269[local24] = this.anIntArray265[local24];
		}
		for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
			this.anIntArray266[local42] = this.anIntArray265[local42] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	private void method2225(@OriginalArg(0) int arg0) {
		if ((this.anIntArray267[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class1_Sub5 local25 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method467(); local25 != null; local25 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method468()) {
			if (arg0 == local25.anInt738) {
				local25.anInt745 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
	private void method2226(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2226(local12);
			}
			return;
		}
		this.anIntArray272[arg0] = 12800;
		this.anIntArray268[arg0] = 8192;
		this.anIntArray263[arg0] = 16383;
		this.anIntArray264[arg0] = 8192;
		this.anIntArray261[arg0] = 0;
		this.anIntArray274[arg0] = 8192;
		this.method2242(arg0);
		this.method2225(arg0);
		this.anIntArray267[arg0] = 0;
		this.anIntArray260[arg0] = 32767;
		this.anIntArray271[arg0] = 256;
		this.anIntArray262[arg0] = 0;
		this.method2246(arg0, 8192);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	private void method2227() {
		this.anIntArray265[9] = 128;
		this.anIntArray266[9] = 128;
		this.method2249(128, 9);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)V")
	private void method2228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(ILclient!da;)I")
	private int method2229(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(6) Class49 local6 = arg0.aClass49_1;
		@Pc(22) int local22 = this.anIntArray272[arg0.anInt738] * this.anIntArray263[arg0.anInt738] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt735 + 16384 >> 15;
		local22 = local39 * this.anInt3027 + 128 >> 8;
		if (local6.anInt1858 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) local6.anInt1858 * 1.953125E-5D * (double) arg0.anInt747) * (double) local22 + 0.5D);
		}
		@Pc(80) int local80;
		@Pc(88) int local88;
		@Pc(118) int local118;
		@Pc(108) int local108;
		if (local6.aByteArray8 != null) {
			local80 = arg0.anInt744;
			local88 = local6.aByteArray8[arg0.anInt755 + 1];
			if (local6.aByteArray8.length - 2 > arg0.anInt755) {
				local108 = (local6.aByteArray8[arg0.anInt755 + 2] & 0xFF) << 8;
				local118 = (local6.aByteArray8[arg0.anInt755] & 0xFF) << 8;
				local88 += (local80 - local118) * (local6.aByteArray8[arg0.anInt755 + 3] - local88) / (local108 - local118);
			}
			local22 = local22 * local88 + 32 >> 6;
		}
		if (arg0.anInt753 > 0 && local6.aByteArray9 != null) {
			local88 = local6.aByteArray9[arg0.anInt734 + 1];
			local80 = arg0.anInt753;
			if (arg0.anInt734 < local6.aByteArray9.length - 2) {
				local118 = (local6.aByteArray9[arg0.anInt734] & 0xFF) << 8;
				local108 = (local6.aByteArray9[arg0.anInt734 + 2] & 0xFF) << 8;
				local88 += (local80 - local118) * (local6.aByteArray9[arg0.anInt734 + 3] - local88) / (local108 - local118);
			}
			local22 = local88 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIILclient!da;I)Z")
	public boolean method2230(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub5 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt743 = Static96.anInt2009 / 100;
		if (arg2.anInt753 >= 0 && (arg2.aClass1_Sub12_Sub4_1 == null || arg2.aClass1_Sub12_Sub4_1.method2794())) {
			arg2.method574();
			arg2.method3414();
			if (arg2.anInt752 > 0 && arg2 == this.aClass1_Sub5ArrayArray2[arg2.anInt738][arg2.anInt752]) {
				this.aClass1_Sub5ArrayArray2[arg2.anInt738][arg2.anInt752] = null;
			}
			return true;
		}
		@Pc(67) int local67 = arg2.anInt751;
		if (local67 > 0) {
			local67 -= (int) (Math.pow(2.0D, (double) this.anIntArray274[arg2.anInt738] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local67 < 0) {
				local67 = 0;
			}
			arg2.anInt751 = local67;
		}
		@Pc(102) boolean local102 = false;
		arg2.aClass1_Sub12_Sub4_1.method2790(this.method2223(arg2));
		@Pc(112) Class49 local112 = arg2.aClass49_1;
		arg2.anInt740++;
		@Pc(136) double local136 = (double) ((arg2.anInt757 * arg2.anInt751 >> 12) + (arg2.anInt756 - 60 << 8)) * 5.086263020833333E-6D;
		arg2.anInt758 += local112.anInt1867;
		if (local112.anInt1858 > 0) {
			if (local112.anInt1866 <= 0) {
				arg2.anInt747 += 128;
			} else {
				arg2.anInt747 += (int) (Math.pow(2.0D, local136 * (double) local112.anInt1866) * 128.0D + 0.5D);
			}
			if (local112.anInt1858 * arg2.anInt747 >= 819200) {
				local102 = true;
			}
		}
		if (local112.aByteArray8 != null) {
			if (local112.anInt1868 <= 0) {
				arg2.anInt744 += 128;
			} else {
				arg2.anInt744 += (int) (Math.pow(2.0D, local136 * (double) local112.anInt1868) * 128.0D + 0.5D);
			}
			while (arg2.anInt755 < local112.aByteArray8.length - 2 && arg2.anInt744 > (local112.aByteArray8[arg2.anInt755 + 2] & 0xFF) << 8) {
				arg2.anInt755 += 2;
			}
			if (local112.aByteArray8.length - 2 == arg2.anInt755 && local112.aByteArray8[arg2.anInt755 + 1] == 0) {
				local102 = true;
			}
		}
		if (arg2.anInt753 >= 0 && local112.aByteArray9 != null && (this.anIntArray267[arg2.anInt738] & 0x1) == 0 && (arg2.anInt752 < 0 || this.aClass1_Sub5ArrayArray2[arg2.anInt738][arg2.anInt752] != arg2)) {
			if (local112.anInt1859 > 0) {
				arg2.anInt753 += (int) (Math.pow(2.0D, local136 * (double) local112.anInt1859) * 128.0D + 0.5D);
			} else {
				arg2.anInt753 += 128;
			}
			while (local112.aByteArray9.length - 2 > arg2.anInt734 && arg2.anInt753 > (local112.aByteArray9[arg2.anInt734 + 2] & 0xFF) << 8) {
				arg2.anInt734 += 2;
			}
			if (local112.aByteArray9.length - 2 == arg2.anInt734) {
				local102 = true;
			}
		}
		if (!local102) {
			arg2.aClass1_Sub12_Sub4_1.method2785(arg2.anInt743, this.method2229(arg2), this.method2240(arg2));
			return false;
		}
		arg2.aClass1_Sub12_Sub4_1.method2782(arg2.anInt743);
		if (arg0 == null) {
			arg2.aClass1_Sub12_Sub4_1.method2757(arg3);
		} else {
			arg2.aClass1_Sub12_Sub4_1.method2753(arg0, arg1, arg3);
		}
		if (arg2.aClass1_Sub12_Sub4_1.method2779()) {
			this.aClass1_Sub12_Sub1_1.aClass1_Sub12_Sub2_3.method1609(arg2.aClass1_Sub12_Sub4_1);
		}
		arg2.method574();
		if (arg2.anInt753 >= 0) {
			arg2.method3414();
			if (arg2.anInt752 > 0 && this.aClass1_Sub5ArrayArray2[arg2.anInt738][arg2.anInt752] == arg2) {
				this.aClass1_Sub5ArrayArray2[arg2.anInt738][arg2.anInt752] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
	public synchronized void method2231() {
		this.aClass12_1.method242();
		this.method2224();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
	private void method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2241(64, arg2, arg1);
		if ((this.anIntArray267[arg1] & 0x2) != 0) {
			for (@Pc(32) Class1_Sub5 local32 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method477(); local32 != null; local32 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method473()) {
				if (local32.anInt738 == arg1 && local32.anInt753 < 0) {
					this.aClass1_Sub5ArrayArray1[arg1][local32.anInt756] = null;
					this.aClass1_Sub5ArrayArray1[arg1][arg2] = local32;
					@Pc(71) int local71 = local32.anInt750 + (local32.anInt757 * local32.anInt751 >> 12);
					local32.anInt751 = 4096;
					local32.anInt750 += arg2 - local32.anInt756 << 8;
					local32.anInt756 = arg2;
					local32.anInt757 = local71 - local32.anInt750;
					return;
				}
			}
		}
		@Pc(115) Class1_Sub13 local115 = (Class1_Sub13) this.aClass97_15.method3375((long) this.anIntArray269[arg1]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class1_Sub22_Sub1 local123 = local115.aClass1_Sub22_Sub1Array1[arg2];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class1_Sub5 local130 = new Class1_Sub5();
		local130.aClass1_Sub13_1 = local115;
		local130.anInt738 = arg1;
		local130.aClass1_Sub22_Sub1_1 = local123;
		local130.aClass49_1 = local115.aClass49Array1[arg2];
		local130.anInt752 = local115.aByteArray12[arg2];
		local130.anInt756 = arg2;
		local130.anInt735 = local115.aByteArray11[arg2] * local115.anInt1965 * arg0 * arg0 + 1024 >> 11;
		local130.anInt736 = local115.aByteArray10[arg2] & 0xFF;
		local130.anInt750 = (arg2 << 8) - (local115.aShortArray14[arg2] & 0x7FFF);
		local130.anInt734 = 0;
		local130.anInt744 = 0;
		local130.anInt755 = 0;
		local130.anInt753 = -1;
		local130.anInt747 = 0;
		if (this.anIntArray262[arg1] == 0) {
			local130.aClass1_Sub12_Sub4_1 = Static217.method2777(local123, this.method2223(local130), this.method2229(local130), this.method2240(local130));
		} else {
			local130.aClass1_Sub12_Sub4_1 = Static217.method2777(local123, this.method2223(local130), 0, this.method2240(local130));
			this.method2247(local115.aShortArray14[arg2] < 0, local130);
		}
		if (local115.aShortArray14[arg2] < 0) {
			local130.aClass1_Sub12_Sub4_1.method2772(-1);
		}
		if (local130.anInt752 >= 0) {
			@Pc(279) Class1_Sub5 local279 = this.aClass1_Sub5ArrayArray2[arg1][local130.anInt752];
			if (local279 != null && local279.anInt753 < 0) {
				this.aClass1_Sub5ArrayArray1[arg1][local279.anInt756] = null;
				local279.anInt753 = 0;
			}
			this.aClass1_Sub5ArrayArray2[arg1][local130.anInt752] = local130;
		}
		this.aClass1_Sub12_Sub1_1.aClass20_8.method466(local130);
		this.aClass1_Sub5ArrayArray1[arg1][arg2] = local130;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	private void method2233(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method467(); local12 != null; local12 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method468()) {
			if (arg0 < 0 || arg0 == local12.anInt738) {
				if (local12.aClass1_Sub12_Sub4_1 != null) {
					local12.aClass1_Sub12_Sub4_1.method2782(Static96.anInt2009 / 100);
					if (local12.aClass1_Sub12_Sub4_1.method2779()) {
						this.aClass1_Sub12_Sub1_1.aClass1_Sub12_Sub2_3.method1609(local12.aClass1_Sub12_Sub4_1);
					}
					local12.method574();
				}
				if (local12.anInt753 < 0) {
					this.aClass1_Sub5ArrayArray1[local12.anInt738][local12.anInt756] = null;
				}
				local12.method3414();
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V")
	private void method2234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray264[arg0] = arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZZLclient!of;)V")
	public synchronized void method2235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		this.method2231();
		this.aClass12_1.method245(arg1.aByteArray42);
		this.aLong163 = 0L;
		this.aBoolean174 = arg0;
		@Pc(23) int local23 = this.aClass12_1.method233();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass12_1.method234(local25);
			this.aClass12_1.method238(local25);
			this.aClass12_1.method246(local25);
		}
		this.anInt3044 = this.aClass12_1.method239();
		this.anInt3045 = this.aClass12_1.anIntArray36[this.anInt3044];
		this.aLong162 = this.aClass12_1.method240(this.anInt3045);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!of;Lclient!ab;IILclient!ra;)Z")
	public synchronized boolean method2236(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(4) Class79 arg2) {
		arg0.method2089();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub9 local29 = (Class1_Sub9) arg0.aClass97_14.method3372(); local29 != null; local29 = (Class1_Sub9) arg0.aClass97_14.method3377()) {
			@Pc(35) int local35 = (int) local29.aLong251;
			@Pc(43) Class1_Sub13 local43 = (Class1_Sub13) this.aClass97_15.method3375((long) local35);
			if (local43 == null) {
				local43 = Static133.method1973(arg1, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass97_15.method3374(local43, (long) local35);
			}
			if (!local43.method1354(local23, arg2, local29.aByteArray5)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method2090();
		}
		return local9;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method2237() {
		return this.aClass12_1.method243();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLclient!da;)I")
	private int method2240(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(9) int local9 = this.anIntArray268[arg0.anInt738];
		return local9 >= 8192 ? 16384 - ((16384 - local9) * (-arg0.anInt736 + 128) + 32 >> 6) : arg0.anInt736 * local9 + 32 >> 6;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)V")
	private void method2241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub5 local12 = this.aClass1_Sub5ArrayArray1[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub5ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray267[arg2] & 0x2) == 0) {
			local12.anInt753 = 0;
			return;
		}
		for (@Pc(44) Class1_Sub5 local44 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method467(); local44 != null; local44 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method468()) {
			if (local44.anInt738 == local12.anInt738 && local44.anInt753 < 0 && local44 != local12) {
				local12.anInt753 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(II)V")
	private void method2242(@OriginalArg(1) int arg0) {
		if ((this.anIntArray267[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class1_Sub5 local23 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method467(); local23 != null; local23 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method468()) {
			if (arg0 == local23.anInt738 && this.aClass1_Sub5ArrayArray1[arg0][local23.anInt756] == null && local23.anInt753 < 0) {
				local23.anInt753 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
	private void method2243() {
		@Pc(10) int local10 = this.anInt3044;
		@Pc(17) int local17 = this.anInt3045;
		@Pc(20) long local20 = this.aLong162;
		while (local17 == this.anInt3045) {
			while (this.aClass12_1.anIntArray36[local10] == local17) {
				this.aClass12_1.method234(local10);
				@Pc(31) int local31 = this.aClass12_1.method247(local10);
				if (local31 == 1) {
					this.aClass12_1.method235();
					this.aClass12_1.method246(local10);
					if (this.aClass12_1.method248()) {
						if (!this.aBoolean174 || local17 == 0) {
							this.method2224();
							this.aClass12_1.method242();
							return;
						}
						this.aClass12_1.method236(local20);
					}
					break;
				}
				if ((local31 & 0x80) != 0) {
					this.method2252(local31);
				}
				this.aClass12_1.method238(local10);
				this.aClass12_1.method246(local10);
			}
			local10 = this.aClass12_1.method239();
			local17 = this.aClass12_1.anIntArray36[local10];
			local20 = this.aClass12_1.method240(local17);
		}
		this.anInt3045 = local17;
		this.anInt3044 = local10;
		this.aLong162 = local20;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
	public synchronized void method2244() {
		this.method2227();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!da;B)Z")
	public boolean method2245(@OriginalArg(0) Class1_Sub5 arg0) {
		if (arg0.aClass1_Sub12_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt753 >= 0) {
			arg0.method3414();
			if (arg0.anInt752 > 0 && this.aClass1_Sub5ArrayArray2[arg0.anInt738][arg0.anInt752] == arg0) {
				this.aClass1_Sub5ArrayArray2[arg0.anInt738][arg0.anInt752] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZI)V")
	private void method2246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray259[arg0] = arg1;
		this.anIntArray270[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZBLclient!da;)V")
	public void method2247(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		@Pc(16) int local16 = arg1.aClass1_Sub22_Sub1_1.aByteArray43.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass1_Sub22_Sub1_1.aBoolean179) {
			@Pc(31) int local31 = local16 + local16 - arg1.aClass1_Sub22_Sub1_1.anInt3128;
			local44 = (int) ((long) local31 * (long) this.anIntArray262[arg1.anInt738] >> 6);
			local16 <<= 0x8;
			if (local44 >= local16) {
				local44 = local16 + local16 - local44 - 1;
				arg1.aClass1_Sub12_Sub4_1.method2792();
			}
		} else {
			local44 = (int) ((long) this.anIntArray262[arg1.anInt738] * (long) local16 >> 6);
		}
		arg1.aClass1_Sub12_Sub4_1.method2765(local44);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()I")
	@Override
	public synchronized int method2756() {
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)V")
	private void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray269[arg1] != arg0) {
			this.anIntArray269[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub5ArrayArray2[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
	public synchronized void method2250() {
		for (@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass97_15.method3372(); local17 != null; local17 = (Class1_Sub13) this.aClass97_15.method3377()) {
			local17.method3414();
		}
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)I")
	public int method2251() {
		return this.anInt3027;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)V")
	private void method2252(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(28) int local28;
		@Pc(22) int local22;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			this.method2241(local22, local28, local16);
		} else if (local9 == 144) {
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			if (local22 <= 0) {
				this.method2241(64, local28, local16);
			} else {
				this.method2232(local22, local16, local28);
			}
		} else if (local9 == 160) {
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			this.method2254(local28, local16, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			if (local28 == 0) {
				this.anIntArray266[local16] = (this.anIntArray266[local16] & 0xFFE03FFF) + (local22 << 14);
			}
			if (local28 == 32) {
				this.anIntArray266[local16] = (local22 << 7) + (this.anIntArray266[local16] & 0xFFFFC07F);
			}
			if (local28 == 1) {
				this.anIntArray261[local16] = (this.anIntArray261[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 33) {
				this.anIntArray261[local16] = local22 + (this.anIntArray261[local16] & 0xFFFFFF80);
			}
			if (local28 == 5) {
				this.anIntArray274[local16] = (this.anIntArray274[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 37) {
				this.anIntArray274[local16] = (this.anIntArray274[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 7) {
				this.anIntArray272[local16] = (local22 << 7) + (this.anIntArray272[local16] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray272[local16] = local22 + (this.anIntArray272[local16] & 0xFFFFFF80);
			}
			if (local28 == 10) {
				this.anIntArray268[local16] = (local22 << 7) + (this.anIntArray268[local16] & 0xFFFFC07F);
			}
			if (local28 == 42) {
				this.anIntArray268[local16] = local22 + (this.anIntArray268[local16] & 0xFFFFFF80);
			}
			if (local28 == 11) {
				this.anIntArray263[local16] = (local22 << 7) + (this.anIntArray263[local16] & 0xFFFFC07F);
			}
			if (local28 == 43) {
				this.anIntArray263[local16] = local22 + (this.anIntArray263[local16] & 0xFFFFFF80);
			}
			if (local28 == 64) {
				if (local22 < 64) {
					this.anIntArray267[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray267[local16] |= 0x1;
				}
			}
			if (local28 == 65) {
				if (local22 < 64) {
					this.method2242(local16);
					this.anIntArray267[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray267[local16] |= 0x2;
				}
			}
			if (local28 == 99) {
				this.anIntArray260[local16] = (local22 << 7) + (this.anIntArray260[local16] & 0x7F);
			}
			if (local28 == 98) {
				this.anIntArray260[local16] = local22 + (this.anIntArray260[local16] & 0x3F80);
			}
			if (local28 == 101) {
				this.anIntArray260[local16] = (this.anIntArray260[local16] & 0x7F) + (local22 << 7) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray260[local16] = (this.anIntArray260[local16] & 0x3F80) + (local22 + 16384);
			}
			if (local28 == 120) {
				this.method2233(local16);
			}
			if (local28 == 121) {
				this.method2226(local16);
			}
			if (local28 == 123) {
				this.method2255(local16);
			}
			@Pc(498) int local498;
			if (local28 == 6) {
				local498 = this.anIntArray260[local16];
				if (local498 == 16384) {
					this.anIntArray271[local16] = (this.anIntArray271[local16] & 0xFFFFC07F) + (local22 << 7);
				}
			}
			if (local28 == 38) {
				local498 = this.anIntArray260[local16];
				if (local498 == 16384) {
					this.anIntArray271[local16] = (this.anIntArray271[local16] & 0xFFFFFF80) + local22;
				}
			}
			if (local28 == 16) {
				this.anIntArray262[local16] = (this.anIntArray262[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 48) {
				this.anIntArray262[local16] = (this.anIntArray262[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 81) {
				if (local22 < 64) {
					this.method2225(local16);
					this.anIntArray267[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray267[local16] |= 0x4;
				}
			}
			if (local28 == 17) {
				this.method2246(local16, (this.anIntArray259[local16] & 0xFFFFC07F) + (local22 << 7));
			}
			if (local28 == 49) {
				this.method2246(local16, (this.anIntArray259[local16] & 0xFFFFFF80) + local22);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method2249(this.anIntArray266[local16] + local28, local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method2228(local28, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local28 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2234(local16, local28);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2224();
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(IB)V")
	public synchronized void method2253(@OriginalArg(0) int arg0) {
		this.anInt3027 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBI)V")
	private void method2254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()Lclient!jc;")
	@Override
	public synchronized Class1_Sub12 method2755() {
		return null;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass12_1.method243()) {
			@Pc(18) int local18 = this.anInt3011 * this.aClass12_1.anInt371 / Static96.anInt2009;
			do {
				@Pc(28) long local28 = this.aLong163 + (long) arg2 * (long) local18;
				if (this.aLong162 - local28 >= 0L) {
					this.aLong163 = local28;
					break;
				}
				@Pc(59) int local59 = (int) (((long) local18 + this.aLong162 - this.aLong163 - 1L) / (long) local18);
				this.aLong163 += (long) local18 * (long) local59;
				this.aClass1_Sub12_Sub1_1.method2753(arg0, arg1, local59);
				arg2 -= local59;
				this.method2243();
				arg1 += local59;
			} while (this.aClass12_1.method243());
		}
		this.aClass1_Sub12_Sub1_1.method2753(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()Lclient!jc;")
	@Override
	public synchronized Class1_Sub12 method2754() {
		return this.aClass1_Sub12_Sub1_1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
	private void method2255(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method467(); local12 != null; local12 = (Class1_Sub5) this.aClass1_Sub12_Sub1_1.aClass20_8.method468()) {
			if ((arg0 < 0 || arg0 == local12.anInt738) && local12.anInt753 < 0) {
				this.aClass1_Sub5ArrayArray1[local12.anInt738][local12.anInt756] = null;
				local12.anInt753 = 0;
			}
		}
	}
}
