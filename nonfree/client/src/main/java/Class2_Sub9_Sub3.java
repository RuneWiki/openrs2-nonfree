import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class2_Sub9_Sub3 extends Class2_Sub9 {

	@OriginalMember(owner = "client!jd", name = "yb", descriptor = "Z")
	private boolean aBoolean102;

	@OriginalMember(owner = "client!jd", name = "zb", descriptor = "I")
	private int anInt1939;

	@OriginalMember(owner = "client!jd", name = "Ab", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!jd", name = "Cb", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!jd", name = "Db", descriptor = "I")
	private int anInt1940;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "[[Lclient!og;")
	private final Class2_Sub20[][] aClass2_Sub20ArrayArray2 = new Class2_Sub20[16][128];

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "[I")
	public final int[] anIntArray184 = new int[16];

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "[I")
	private final int[] anIntArray185 = new int[16];

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
	private final int anInt1915 = 1000000;

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "[I")
	public final int[] anIntArray188 = new int[16];

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "[I")
	private final int[] anIntArray191 = new int[16];

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "[I")
	private final int[] anIntArray193 = new int[16];

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "[I")
	private final int[] anIntArray192 = new int[16];

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "[I")
	private final int[] anIntArray187 = new int[16];

	@OriginalMember(owner = "client!jd", name = "hb", descriptor = "[I")
	private final int[] anIntArray195 = new int[16];

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	private int anInt1907 = 256;

	@OriginalMember(owner = "client!jd", name = "nb", descriptor = "[I")
	public final int[] anIntArray197 = new int[16];

	@OriginalMember(owner = "client!jd", name = "R", descriptor = "[I")
	private final int[] anIntArray190 = new int[16];

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "[I")
	private final int[] anIntArray189 = new int[16];

	@OriginalMember(owner = "client!jd", name = "gb", descriptor = "[I")
	private final int[] anIntArray194 = new int[16];

	@OriginalMember(owner = "client!jd", name = "tb", descriptor = "[I")
	private final int[] anIntArray198 = new int[16];

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "[I")
	private final int[] anIntArray186 = new int[16];

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "[[Lclient!og;")
	private final Class2_Sub20[][] aClass2_Sub20ArrayArray1 = new Class2_Sub20[16][128];

	@OriginalMember(owner = "client!jd", name = "xb", descriptor = "[I")
	private final int[] anIntArray199 = new int[16];

	@OriginalMember(owner = "client!jd", name = "lb", descriptor = "Lclient!vd;")
	private final Class102 aClass102_1 = new Class102();

	@OriginalMember(owner = "client!jd", name = "Bb", descriptor = "Lclient!gb;")
	private final Class2_Sub9_Sub1 aClass2_Sub9_Sub1_1 = new Class2_Sub9_Sub1(this);

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "Lclient!nc;")
	private final Class63 aClass63_6 = new Class63(128);

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class2_Sub9_Sub3() {
		this.method1539();
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "()Lclient!dh;")
	@Override
	public synchronized Class2_Sub9 method2470() {
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!og;B)I")
	private int method1535(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(25) int local25 = this.anIntArray189[arg0.anInt2923] * this.anIntArray190[arg0.anInt2923] + 4096 >> 13;
		@Pc(28) Class70 local28 = arg0.aClass70_1;
		@Pc(36) int local36 = local25 * local25 + 16384 >> 15;
		@Pc(45) int local45 = local36 * arg0.anInt2931 + 16384 >> 15;
		local25 = this.anInt1907 * local45 + 128 >> 8;
		if (local28.anInt2894 > 0) {
			local25 = (int) ((double) local25 * Math.pow(0.5D, (double) local28.anInt2894 * (double) arg0.anInt2921 * 1.953125E-5D) + 0.5D);
		}
		@Pc(89) int local89;
		@Pc(86) int local86;
		@Pc(107) int local107;
		@Pc(119) int local119;
		if (local28.aByteArray31 != null) {
			local86 = local28.aByteArray31[arg0.anInt2922 + 1];
			local89 = arg0.anInt2941;
			if (arg0.anInt2922 < local28.aByteArray31.length - 2) {
				local107 = (local28.aByteArray31[arg0.anInt2922] & 0xFF) << 8;
				local119 = (local28.aByteArray31[arg0.anInt2922 + 2] & 0xFF) << 8;
				local86 += (local89 - local107) * (local28.aByteArray31[arg0.anInt2922 + 3] - local86) / (local119 - local107);
			}
			local25 = local25 * local86 + 32 >> 6;
		}
		if (arg0.anInt2934 > 0 && local28.aByteArray32 != null) {
			local86 = local28.aByteArray32[arg0.anInt2927 + 1];
			local89 = arg0.anInt2934;
			if (arg0.anInt2927 < local28.aByteArray32.length - 2) {
				local119 = (local28.aByteArray32[arg0.anInt2927 + 2] & 0xFF) << 8;
				local107 = (local28.aByteArray32[arg0.anInt2927] & 0xFF) << 8;
				local86 += (local89 - local107) * (local28.aByteArray32[arg0.anInt2927 + 3] - local86) / (local119 - local107);
			}
			local25 = local86 * local25 + 32 >> 6;
		}
		return local25;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z")
	public synchronized boolean method1536() {
		return this.aClass102_1.method3062();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()Lclient!dh;")
	@Override
	public synchronized Class2_Sub9 method2468() {
		return this.aClass2_Sub9_Sub1_1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
	private void method1537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray198[arg0] = arg1;
		this.anIntArray188[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
	private void method1538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub20 local12 = this.aClass2_Sub20ArrayArray2[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub20ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray184[arg2] & 0x2) == 0) {
			local12.anInt2934 = 0;
			return;
		}
		for (@Pc(45) Class2_Sub20 local45 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method691(); local45 != null; local45 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method686()) {
			if (local12.anInt2923 == local45.anInt2923 && local45.anInt2934 < 0 && local45 != local12) {
				local12.anInt2934 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	private void method1539() {
		this.method1548(-1);
		this.method1545(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray195[local15] = this.anIntArray194[local15];
		}
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray192[local31] = this.anIntArray194[local31] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V")
	public synchronized void method1540() {
		for (@Pc(11) Class2_Sub18 local11 = (Class2_Sub18) this.aClass63_6.method2114(); local11 != null; local11 = (Class2_Sub18) this.aClass63_6.method2108()) {
			local11.method1950();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)V")
	private void method1541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public synchronized void method1542() {
		for (@Pc(11) Class2_Sub18 local11 = (Class2_Sub18) this.aClass63_6.method2114(); local11 != null; local11 = (Class2_Sub18) this.aClass63_6.method2108()) {
			local11.method3254();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	private void method1543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray186[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
	public synchronized void method1544() {
		this.aClass102_1.method3069();
		this.method1539();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	private void method1545(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
				this.method1545(local15);
			}
			return;
		}
		this.anIntArray190[arg0] = 12800;
		this.anIntArray191[arg0] = 8192;
		this.anIntArray189[arg0] = 16383;
		this.anIntArray186[arg0] = 8192;
		this.anIntArray199[arg0] = 0;
		this.anIntArray193[arg0] = 8192;
		this.method1564(arg0);
		this.method1557(arg0);
		this.anIntArray184[arg0] = 0;
		this.anIntArray185[arg0] = 32767;
		this.anIntArray187[arg0] = 256;
		this.anIntArray197[arg0] = 0;
		this.method1537(arg0, 8192);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLclient!og;I)V")
	public void method1547(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		@Pc(8) int local8 = arg1.aClass2_Sub6_Sub1_1.aByteArray5.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass2_Sub6_Sub1_1.aBoolean33) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass2_Sub6_Sub1_1.anInt609;
			local36 = (int) ((long) local23 * (long) this.anIntArray197[arg1.anInt2923] >> 6);
			local8 <<= 0x8;
			if (local8 <= local36) {
				local36 = local8 + local8 - local36 - 1;
				arg1.aClass2_Sub9_Sub2_1.method1335();
			}
		} else {
			local36 = (int) ((long) local8 * (long) this.anIntArray197[arg1.anInt2923] >> 6);
		}
		arg1.aClass2_Sub9_Sub2_1.method1326(local36);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass102_1.method3062()) {
			@Pc(14) int local14 = this.aClass102_1.anInt4004 * this.anInt1915 / Static68.anInt1622;
			do {
				@Pc(24) long local24 = this.aLong64 + (long) arg2 * (long) local14;
				if (this.aLong65 - local24 >= 0L) {
					this.aLong64 = local24;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong65 + (long) local14 - this.aLong64 - 1L) / (long) local14);
				arg2 -= local56;
				this.aLong64 += (long) local56 * (long) local14;
				this.aClass2_Sub9_Sub1_1.method2471(arg0, arg1, local56);
				arg1 += local56;
				this.method1563();
			} while (this.aClass102_1.method3062());
		}
		this.aClass2_Sub9_Sub1_1.method2471(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2473(@OriginalArg(0) int arg0) {
		if (this.aClass102_1.method3062()) {
			@Pc(18) int local18 = this.aClass102_1.anInt4004 * this.anInt1915 / Static68.anInt1622;
			do {
				@Pc(28) long local28 = this.aLong64 + (long) arg0 * (long) local18;
				if (this.aLong65 - local28 >= 0L) {
					this.aLong64 = local28;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong65 + (long) local18 - this.aLong64 - 1L) / (long) local18);
				arg0 -= local58;
				this.aLong64 += (long) local58 * (long) local18;
				this.aClass2_Sub9_Sub1_1.method2473(local58);
				this.method1563();
			} while (this.aClass102_1.method3062());
		}
		this.aClass2_Sub9_Sub1_1.method2473(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
	private void method1548(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub20 local8 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method691(); local8 != null; local8 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method686()) {
			if (arg0 < 0 || arg0 == local8.anInt2923) {
				if (local8.aClass2_Sub9_Sub2_1 != null) {
					local8.aClass2_Sub9_Sub2_1.method1328(Static68.anInt1622 / 100);
					if (local8.aClass2_Sub9_Sub2_1.method1336()) {
						this.aClass2_Sub9_Sub1_1.aClass2_Sub9_Sub4_2.method2476(local8.aClass2_Sub9_Sub2_1);
					}
					local8.method2243();
				}
				if (local8.anInt2934 < 0) {
					this.aClass2_Sub20ArrayArray2[local8.anInt2923][local8.anInt2917] = null;
				}
				local8.method3254();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!jf;Z)V")
	public synchronized void method1549(@OriginalArg(1) Class2_Sub14 arg0, @OriginalArg(2) boolean arg1) {
		this.method1544();
		this.aClass102_1.method3064(arg0.aByteArray20);
		this.aBoolean102 = arg1;
		this.aLong64 = 0L;
		@Pc(23) int local23 = this.aClass102_1.method3059();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass102_1.method3057(local25);
			this.aClass102_1.method3068(local25);
			this.aClass102_1.method3067(local25);
		}
		this.anInt1940 = this.aClass102_1.method3065();
		this.anInt1939 = this.aClass102_1.anIntArray395[this.anInt1940];
		this.aLong65 = this.aClass102_1.method3072(this.anInt1939);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)V")
	private void method1551(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub20 local12 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method691(); local12 != null; local12 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method686()) {
			if ((arg0 < 0 || local12.anInt2923 == arg0) && local12.anInt2934 < 0) {
				this.aClass2_Sub20ArrayArray2[local12.anInt2923][local12.anInt2917] = null;
				local12.anInt2934 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!og;Z)I")
	private int method1552(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(14) int local14 = (arg0.anInt2930 * arg0.anInt2932 >> 12) + arg0.anInt2919;
		local14 += (this.anIntArray186[arg0.anInt2923] - 8192) * this.anIntArray187[arg0.anInt2923] >> 12;
		@Pc(41) Class70 local41 = arg0.aClass70_1;
		@Pc(67) int local67;
		if (local41.anInt2888 > 0 && (local41.anInt2893 > 0 || this.anIntArray199[arg0.anInt2923] > 0)) {
			local67 = local41.anInt2893 << 2;
			@Pc(72) int local72 = local41.anInt2890 << 1;
			if (local72 > arg0.anInt2939) {
				local67 = local67 * arg0.anInt2939 / local72;
			}
			local67 += this.anIntArray199[arg0.anInt2923] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt2937 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local67 * local102);
		}
		local67 = (int) ((double) (arg0.aClass2_Sub6_Sub1_1.anInt610 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static68.anInt1622 + 0.5D);
		return local67 < 1 ? 1 : local67;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIB)V")
	public synchronized void method1553() {
		this.method1559();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!jf;Lclient!pj;IILclient!eh;)Z")
	public synchronized boolean method1554(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(4) Class28 arg2) {
		arg0.method1576();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(28) Class2_Sub25 local28 = (Class2_Sub25) arg0.aClass63_7.method2114(); local28 != null; local28 = (Class2_Sub25) arg0.aClass63_7.method2108()) {
			@Pc(34) int local34 = (int) local28.aLong149;
			@Pc(42) Class2_Sub18 local42 = (Class2_Sub18) this.aClass63_6.method2110((long) local34);
			if (local42 == null) {
				local42 = Static86.method1509(arg2, local34);
				if (local42 == null) {
					local9 = false;
					continue;
				}
				this.aClass63_6.method2115((long) local34, local42);
			}
			if (!local42.method1953(local28.aByteArray45, arg1, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method1575();
		}
		return local9;
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)I")
	public int method1555() {
		return this.anInt1907;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!og;)I")
	private int method1556(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(5) int local5 = this.anIntArray191[arg0.anInt2923];
		return local5 < 8192 ? arg0.anInt2936 * local5 + 32 >> 6 : 16384 - ((128 - arg0.anInt2936) * (-local5 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	private void method1557(@OriginalArg(0) int arg0) {
		if ((this.anIntArray184[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub20 local23 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method691(); local23 != null; local23 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method686()) {
			if (arg0 == local23.anInt2923) {
				local23.anInt2940 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2472() {
		return 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[IILclient!og;)Z")
	public boolean method1558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class2_Sub20 arg3) {
		arg3.anInt2928 = Static68.anInt1622 / 100;
		if (arg3.anInt2934 >= 0 && (arg3.aClass2_Sub9_Sub2_1 == null || arg3.aClass2_Sub9_Sub2_1.method1319())) {
			arg3.method2243();
			arg3.method3254();
			if (arg3.anInt2933 > 0 && arg3 == this.aClass2_Sub20ArrayArray1[arg3.anInt2923][arg3.anInt2933]) {
				this.aClass2_Sub20ArrayArray1[arg3.anInt2923][arg3.anInt2933] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg3.anInt2930;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray193[arg3.anInt2923] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg3.anInt2930 = local59;
		}
		arg3.aClass2_Sub9_Sub2_1.method1327(this.method1552(arg3));
		arg3.anInt2939++;
		@Pc(110) Class70 local110 = arg3.aClass70_1;
		arg3.anInt2937 += local110.anInt2888;
		@Pc(135) double local135 = (double) ((arg3.anInt2917 - 60 << 8) + (arg3.anInt2932 * arg3.anInt2930 >> 12)) * 5.086263020833333E-6D;
		@Pc(137) boolean local137 = false;
		if (local110.anInt2894 > 0) {
			if (local110.anInt2886 > 0) {
				arg3.anInt2921 += (int) (Math.pow(2.0D, (double) local110.anInt2886 * local135) * 128.0D + 0.5D);
			} else {
				arg3.anInt2921 += 128;
			}
			if (arg3.anInt2921 * local110.anInt2894 >= 819200) {
				local137 = true;
			}
		}
		if (local110.aByteArray31 != null) {
			if (local110.anInt2887 > 0) {
				arg3.anInt2941 += (int) (Math.pow(2.0D, (double) local110.anInt2887 * local135) * 128.0D + 0.5D);
			} else {
				arg3.anInt2941 += 128;
			}
			while (arg3.anInt2922 < local110.aByteArray31.length - 2 && (local110.aByteArray31[arg3.anInt2922 + 2] & 0xFF) << 8 < arg3.anInt2941) {
				arg3.anInt2922 += 2;
			}
			if (arg3.anInt2922 == local110.aByteArray31.length - 2 && local110.aByteArray31[arg3.anInt2922 + 1] == 0) {
				local137 = true;
			}
		}
		if (arg3.anInt2934 >= 0 && local110.aByteArray32 != null && (this.anIntArray184[arg3.anInt2923] & 0x1) == 0 && (arg3.anInt2933 < 0 || this.aClass2_Sub20ArrayArray1[arg3.anInt2923][arg3.anInt2933] != arg3)) {
			if (local110.anInt2885 > 0) {
				arg3.anInt2934 += (int) (Math.pow(2.0D, local135 * (double) local110.anInt2885) * 128.0D + 0.5D);
			} else {
				arg3.anInt2934 += 128;
			}
			while (arg3.anInt2927 < local110.aByteArray32.length - 2 && (local110.aByteArray32[arg3.anInt2927 + 2] & 0xFF) << 8 < arg3.anInt2934) {
				arg3.anInt2927 += 2;
			}
			if (arg3.anInt2927 == local110.aByteArray32.length - 2) {
				local137 = true;
			}
		}
		if (!local137) {
			arg3.aClass2_Sub9_Sub2_1.method1353(arg3.anInt2928, this.method1535(arg3), this.method1556(arg3));
			return false;
		}
		arg3.aClass2_Sub9_Sub2_1.method1328(arg3.anInt2928);
		if (arg2 == null) {
			arg3.aClass2_Sub9_Sub2_1.method2473(arg0);
		} else {
			arg3.aClass2_Sub9_Sub2_1.method2471(arg2, arg1, arg0);
		}
		if (arg3.aClass2_Sub9_Sub2_1.method1336()) {
			this.aClass2_Sub9_Sub1_1.aClass2_Sub9_Sub4_2.method2476(arg3.aClass2_Sub9_Sub2_1);
		}
		arg3.method2243();
		if (arg3.anInt2934 >= 0) {
			arg3.method3254();
			if (arg3.anInt2933 > 0 && arg3 == this.aClass2_Sub20ArrayArray1[arg3.anInt2923][arg3.anInt2933]) {
				this.aClass2_Sub20ArrayArray1[arg3.anInt2923][arg3.anInt2933] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZI)V")
	private void method1559() {
		this.anIntArray194[9] = 128;
		this.anIntArray192[9] = 128;
		this.method1565(9, 128);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V")
	public synchronized void method1560(@OriginalArg(0) int arg0) {
		this.anInt1907 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIII)V")
	private void method1561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1538(64, arg1, arg2);
		if ((this.anIntArray184[arg2] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub20 local28 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method683(); local28 != null; local28 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method688()) {
				if (local28.anInt2923 == arg2 && local28.anInt2934 < 0) {
					this.aClass2_Sub20ArrayArray2[arg2][local28.anInt2917] = null;
					this.aClass2_Sub20ArrayArray2[arg2][arg1] = local28;
					@Pc(70) int local70 = (local28.anInt2932 * local28.anInt2930 >> 12) + local28.anInt2919;
					local28.anInt2919 += arg1 - local28.anInt2917 << 8;
					local28.anInt2930 = 4096;
					local28.anInt2932 = local70 - local28.anInt2919;
					local28.anInt2917 = arg1;
					return;
				}
			}
		}
		@Pc(116) Class2_Sub18 local116 = (Class2_Sub18) this.aClass63_6.method2110((long) this.anIntArray195[arg2]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class2_Sub6_Sub1 local124 = local116.aClass2_Sub6_Sub1Array1[arg1];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class2_Sub20 local131 = new Class2_Sub20();
		local131.anInt2923 = arg2;
		local131.aClass2_Sub6_Sub1_1 = local124;
		local131.aClass2_Sub18_1 = local116;
		local131.aClass70_1 = local116.aClass70Array1[arg1];
		local131.anInt2933 = local116.aByteArray27[arg1];
		local131.anInt2917 = arg1;
		local131.anInt2931 = local116.aByteArray26[arg1] * arg0 * arg0 * local116.anInt2553 + 1024 >> 11;
		local131.anInt2936 = local116.aByteArray25[arg1] & 0xFF;
		local131.anInt2919 = (arg1 << 8) - (local116.aShortArray23[arg1] & 0x7FFF);
		local131.anInt2941 = 0;
		local131.anInt2934 = -1;
		local131.anInt2922 = 0;
		local131.anInt2927 = 0;
		local131.anInt2921 = 0;
		if (this.anIntArray197[arg2] == 0) {
			local131.aClass2_Sub9_Sub2_1 = Static219.method1333(local124, this.method1552(local131), this.method1535(local131), this.method1556(local131));
		} else {
			local131.aClass2_Sub9_Sub2_1 = Static219.method1333(local124, this.method1552(local131), 0, this.method1556(local131));
			this.method1547(local116.aShortArray23[arg1] < 0, local131);
		}
		if (local116.aShortArray23[arg1] < 0) {
			local131.aClass2_Sub9_Sub2_1.method1344(-1);
		}
		if (local131.anInt2933 >= 0) {
			@Pc(281) Class2_Sub20 local281 = this.aClass2_Sub20ArrayArray1[arg2][local131.anInt2933];
			if (local281 != null && local281.anInt2934 < 0) {
				this.aClass2_Sub20ArrayArray2[arg2][local281.anInt2917] = null;
				local281.anInt2934 = 0;
			}
			this.aClass2_Sub20ArrayArray1[arg2][local131.anInt2933] = local131;
		}
		this.aClass2_Sub9_Sub1_1.aClass19_3.method684(local131);
		this.aClass2_Sub20ArrayArray2[arg2][arg1] = local131;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(BLclient!og;)Z")
	public boolean method1562(@OriginalArg(1) Class2_Sub20 arg0) {
		if (arg0.aClass2_Sub9_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt2934 >= 0) {
			arg0.method3254();
			if (arg0.anInt2933 > 0 && this.aClass2_Sub20ArrayArray1[arg0.anInt2923][arg0.anInt2933] == arg0) {
				this.aClass2_Sub20ArrayArray1[arg0.anInt2923][arg0.anInt2933] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
	private void method1563() {
		@Pc(19) int local19 = this.anInt1940;
		@Pc(22) int local22 = this.anInt1939;
		@Pc(25) long local25 = this.aLong65;
		while (local22 == this.anInt1939) {
			while (local22 == this.aClass102_1.anIntArray395[local19]) {
				this.aClass102_1.method3057(local19);
				@Pc(36) int local36 = this.aClass102_1.method3063(local19);
				if (local36 == 1) {
					this.aClass102_1.method3070();
					this.aClass102_1.method3067(local19);
					if (this.aClass102_1.method3058()) {
						if (!this.aBoolean102 || local22 == 0) {
							this.method1539();
							this.aClass102_1.method3069();
							return;
						}
						this.aClass102_1.method3066(local25);
					}
					break;
				}
				if ((local36 & 0x80) != 0) {
					this.method1566(local36);
				}
				this.aClass102_1.method3068(local19);
				this.aClass102_1.method3067(local19);
			}
			local19 = this.aClass102_1.method3065();
			local22 = this.aClass102_1.anIntArray395[local19];
			local25 = this.aClass102_1.method3072(local22);
		}
		this.anInt1939 = local22;
		this.anInt1940 = local19;
		this.aLong65 = local25;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
	private void method1564(@OriginalArg(1) int arg0) {
		if ((this.anIntArray184[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method691(); local18 != null; local18 = (Class2_Sub20) this.aClass2_Sub9_Sub1_1.aClass19_3.method686()) {
			if (arg0 == local18.anInt2923 && this.aClass2_Sub20ArrayArray2[arg0][local18.anInt2917] == null && local18.anInt2934 < 0) {
				local18.anInt2934 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)V")
	private void method1565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray195[arg0] != arg1) {
			this.anIntArray195[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass2_Sub20ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V")
	private void method1566(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local13 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method1538(local32, local26, local20);
		} else if (local13 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 <= 0) {
				this.method1538(64, local26, local20);
			} else {
				this.method1561(local32, local26, local20);
			}
		} else if (local13 == 160) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method1567(local32, local26, local20);
		} else if (local13 == 176) {
			local20 = arg0 & 0xF;
			local32 = arg0 >> 16 & 0x7F;
			local26 = arg0 >> 8 & 0x7F;
			if (local26 == 0) {
				this.anIntArray192[local20] = (this.anIntArray192[local20] & 0xFFE03FFF) + (local32 << 14);
			}
			if (local26 == 32) {
				this.anIntArray192[local20] = (local32 << 7) + (this.anIntArray192[local20] & 0xFFFFC07F);
			}
			if (local26 == 1) {
				this.anIntArray199[local20] = (local32 << 7) + (this.anIntArray199[local20] & 0xFFFFC07F);
			}
			if (local26 == 33) {
				this.anIntArray199[local20] = (this.anIntArray199[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 5) {
				this.anIntArray193[local20] = (this.anIntArray193[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 37) {
				this.anIntArray193[local20] = local32 + (this.anIntArray193[local20] & 0xFFFFFF80);
			}
			if (local26 == 7) {
				this.anIntArray190[local20] = (this.anIntArray190[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 39) {
				this.anIntArray190[local20] = (this.anIntArray190[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 10) {
				this.anIntArray191[local20] = (this.anIntArray191[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 42) {
				this.anIntArray191[local20] = local32 + (this.anIntArray191[local20] & 0xFFFFFF80);
			}
			if (local26 == 11) {
				this.anIntArray189[local20] = (local32 << 7) + (this.anIntArray189[local20] & 0xFFFFC07F);
			}
			if (local26 == 43) {
				this.anIntArray189[local20] = (this.anIntArray189[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 64) {
				if (local32 < 64) {
					this.anIntArray184[local20] &= 0xFFFFFFFE;
				} else {
					this.anIntArray184[local20] |= 0x1;
				}
			}
			if (local26 == 65) {
				if (local32 < 64) {
					this.method1564(local20);
					this.anIntArray184[local20] &= 0xFFFFFFFD;
				} else {
					this.anIntArray184[local20] |= 0x2;
				}
			}
			if (local26 == 99) {
				this.anIntArray185[local20] = (local32 << 7) + (this.anIntArray185[local20] & 0x7F);
			}
			if (local26 == 98) {
				this.anIntArray185[local20] = (this.anIntArray185[local20] & 0x3F80) + local32;
			}
			if (local26 == 101) {
				this.anIntArray185[local20] = (this.anIntArray185[local20] & 0x7F) + (local32 << 7) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray185[local20] = (this.anIntArray185[local20] & 0x3F80) + local32 + 16384;
			}
			if (local26 == 120) {
				this.method1548(local20);
			}
			if (local26 == 121) {
				this.method1545(local20);
			}
			if (local26 == 123) {
				this.method1551(local20);
			}
			@Pc(517) int local517;
			if (local26 == 6) {
				local517 = this.anIntArray185[local20];
				if (local517 == 16384) {
					this.anIntArray187[local20] = (this.anIntArray187[local20] & 0xFFFFC07F) + (local32 << 7);
				}
			}
			if (local26 == 38) {
				local517 = this.anIntArray185[local20];
				if (local517 == 16384) {
					this.anIntArray187[local20] = (this.anIntArray187[local20] & 0xFFFFFF80) + local32;
				}
			}
			if (local26 == 16) {
				this.anIntArray197[local20] = (this.anIntArray197[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 48) {
				this.anIntArray197[local20] = (this.anIntArray197[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 81) {
				if (local32 >= 64) {
					this.anIntArray184[local20] |= 0x4;
				} else {
					this.method1557(local20);
					this.anIntArray184[local20] &= 0xFFFFFFFB;
				}
			}
			if (local26 == 17) {
				this.method1537(local20, (local32 << 7) + (this.anIntArray198[local20] & 0xFFFFC07F));
			}
			if (local26 == 49) {
				this.method1537(local20, (this.anIntArray198[local20] & 0xFFFFFF80) + local32);
			}
		} else if (local13 == 192) {
			local26 = arg0 >> 8 & 0x7F;
			local20 = arg0 & 0xF;
			this.method1565(local20, local26 + this.anIntArray192[local20]);
		} else if (local13 == 208) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method1541(local20, local26);
		} else if (local13 == 224) {
			local26 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			local20 = arg0 & 0xF;
			this.method1543(local26, local20);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method1539();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(IIII)V")
	private void method1567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}
}
