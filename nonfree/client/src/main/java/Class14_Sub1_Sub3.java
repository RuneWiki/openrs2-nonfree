import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class14_Sub1_Sub3 extends Class14_Sub1 {

	@OriginalMember(owner = "client!eba", name = "Bb", descriptor = "I")
	private int anInt1999;

	@OriginalMember(owner = "client!eba", name = "vb", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!eba", name = "hb", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!eba", name = "Lb", descriptor = "Z")
	private boolean aBoolean138;

	@OriginalMember(owner = "client!eba", name = "jb", descriptor = "I")
	private int anInt2000;

	@OriginalMember(owner = "client!eba", name = "yb", descriptor = "I")
	private int anInt2001;

	@OriginalMember(owner = "client!eba", name = "A", descriptor = "Z")
	private boolean aBoolean139;

	@OriginalMember(owner = "client!eba", name = "zb", descriptor = "Lclient!mn;")
	private Class14_Sub28 aClass14_Sub28_1;

	@OriginalMember(owner = "client!eba", name = "tb", descriptor = "[[Lclient!oca;")
	private final Class14_Sub34[][] aClass14_Sub34ArrayArray1 = new Class14_Sub34[16][128];

	@OriginalMember(owner = "client!eba", name = "y", descriptor = "[I")
	private final int[] anIntArray115 = new int[16];

	@OriginalMember(owner = "client!eba", name = "Nb", descriptor = "[I")
	public final int[] anIntArray113 = new int[16];

	@OriginalMember(owner = "client!eba", name = "t", descriptor = "[I")
	private final int[] anIntArray114 = new int[16];

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "[I")
	private final int[] anIntArray116 = new int[16];

	@OriginalMember(owner = "client!eba", name = "M", descriptor = "[I")
	private final int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!eba", name = "V", descriptor = "[I")
	private final int[] anIntArray118 = new int[16];

	@OriginalMember(owner = "client!eba", name = "J", descriptor = "[I")
	private final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!eba", name = "u", descriptor = "[[Lclient!oca;")
	private final Class14_Sub34[][] aClass14_Sub34ArrayArray2 = new Class14_Sub34[16][128];

	@OriginalMember(owner = "client!eba", name = "ob", descriptor = "[I")
	private final int[] anIntArray120 = new int[16];

	@OriginalMember(owner = "client!eba", name = "bb", descriptor = "I")
	private final int anInt1984 = 1000000;

	@OriginalMember(owner = "client!eba", name = "U", descriptor = "[I")
	private final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!eba", name = "eb", descriptor = "[I")
	public final int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!eba", name = "P", descriptor = "[I")
	private final int[] anIntArray112 = new int[16];

	@OriginalMember(owner = "client!eba", name = "Y", descriptor = "[I")
	private final int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!eba", name = "H", descriptor = "I")
	private int anInt1971 = 256;

	@OriginalMember(owner = "client!eba", name = "T", descriptor = "[I")
	public final int[] anIntArray117 = new int[16];

	@OriginalMember(owner = "client!eba", name = "Eb", descriptor = "[I")
	private final int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!eba", name = "wb", descriptor = "[I")
	private final int[] anIntArray127 = new int[16];

	@OriginalMember(owner = "client!eba", name = "R", descriptor = "[I")
	private final int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!eba", name = "B", descriptor = "Lclient!nm;")
	private final Class254 aClass254_1 = new Class254();

	@OriginalMember(owner = "client!eba", name = "v", descriptor = "Lclient!mw;")
	private final Class14_Sub1_Sub4 aClass14_Sub1_Sub4_1 = new Class14_Sub1_Sub4(this);

	@OriginalMember(owner = "client!eba", name = "lb", descriptor = "Lclient!fw;")
	private final Class125 lb;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub3() {
		this.lb = new Class125(128);
		this.method1919(256, -1);
		this.method1894(true);
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!eba;)V")
	public Class14_Sub1_Sub3(@OriginalArg(0) Class14_Sub1_Sub3 arg0) {
		this.lb = arg0.lb;
		this.method1919(256, -1);
		this.method1894(true);
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "()I")
	@Override
	public synchronized int method9321() {
		return 0;
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(II)V")
	private void method1888(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method1888(local10);
			}
			return;
		}
		this.anIntArray122[arg0] = 12800;
		this.anIntArray125[arg0] = 8192;
		this.anIntArray119[arg0] = 16383;
		this.anIntArray112[arg0] = 8192;
		this.anIntArray114[arg0] = 0;
		this.anIntArray123[arg0] = 8192;
		this.method1904(arg0);
		this.method1905(arg0);
		this.anIntArray121[arg0] = 0;
		this.anIntArray124[arg0] = 32767;
		this.anIntArray116[arg0] = 256;
		this.anIntArray117[arg0] = 0;
		this.method1899(8192, arg0);
	}

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)Z")
	public synchronized boolean method1889() {
		return this.aClass254_1.method6250();
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(BI)V")
	public synchronized void method1890(@OriginalArg(1) int arg0) {
		this.anInt1971 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(B)V")
	public synchronized void method1892() {
		for (@Pc(19) Class14_Sub17 local19 = (Class14_Sub17) this.lb.method2633(); local19 != null; local19 = (Class14_Sub17) this.lb.method2627()) {
			local19.method2152();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!oca;I)I")
	private int method1893(@OriginalArg(0) Class14_Sub34 arg0) {
		if (this.anIntArray120[arg0.anInt7287] == 0) {
			return 0;
		}
		@Pc(18) Class156 local18 = arg0.aClass156_1;
		@Pc(34) int local34 = this.anIntArray119[arg0.anInt7287] * this.anIntArray122[arg0.anInt7287] + 4096 >> 13;
		@Pc(42) int local42 = local34 * local34 + 16384 >> 15;
		@Pc(51) int local51 = local42 * arg0.anInt7275 + 16384 >> 15;
		@Pc(60) int local60 = this.anInt1971 * local51 + 128 >> 8;
		local34 = local60 * this.anIntArray120[arg0.anInt7287] + 128 >> 8;
		if (local18.anInt4369 > 0) {
			local34 = (int) ((double) local34 * Math.pow(0.5D, (double) arg0.anInt7286 * 1.953125E-5D * (double) local18.anInt4369) + 0.5D);
		}
		@Pc(110) int local110;
		@Pc(118) int local118;
		@Pc(140) int local140;
		@Pc(152) int local152;
		if (local18.aByteArray54 != null) {
			local110 = arg0.anInt7276;
			local118 = local18.aByteArray54[arg0.anInt7289 + 1];
			if (local18.aByteArray54.length - 2 > arg0.anInt7289) {
				local140 = (local18.aByteArray54[arg0.anInt7289] & 0xFF) << 8;
				local152 = (local18.aByteArray54[arg0.anInt7289 + 2] & 0xFF) << 8;
				local118 += (local110 - local140) * (-local118 + local18.aByteArray54[arg0.anInt7289 + 3]) / (local152 - local140);
			}
			local34 = local118 * local34 + 32 >> 6;
		}
		if (arg0.anInt7272 > 0 && local18.aByteArray55 != null) {
			local110 = arg0.anInt7272;
			local118 = local18.aByteArray55[arg0.anInt7281 + 1];
			if (local18.aByteArray55.length - 2 > arg0.anInt7281) {
				local140 = (local18.aByteArray55[arg0.anInt7281] & 0xFF) << 8;
				local152 = (local18.aByteArray55[arg0.anInt7281 + 2] & 0xFF) << 8;
				local118 += (local110 - local140) * (-local118 + local18.aByteArray55[arg0.anInt7281 + 3]) / (local152 - local140);
			}
			local34 = local34 * local118 + 32 >> 6;
		}
		return local34;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V")
	private void method1894(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1924(-1);
		} else {
			this.method1909(-1);
		}
		this.method1888(-1);
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray126[local21] = this.anIntArray118[local21];
		}
		for (@Pc(36) int local36 = 0; local36 < 16; local36++) {
			this.anIntArray115[local36] = this.anIntArray118[local36] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "(I)V")
	public synchronized void method1895() {
		for (@Pc(7) Class14_Sub17 local7 = (Class14_Sub17) this.lb.method2633(); local7 != null; local7 = (Class14_Sub17) this.lb.method2627()) {
			local7.method9513();
		}
		if (false) {
			this.method1908(-71, 43, 3);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!oca;ZI)V")
	public void method1896(@OriginalArg(0) Class14_Sub34 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(16) int local16 = arg0.aClass14_Sub19_Sub1_2.aByteArray83.length;
		@Pc(45) int local45;
		if (arg1 && arg0.aClass14_Sub19_Sub1_2.aBoolean539) {
			@Pc(32) int local32 = local16 + local16 - arg0.aClass14_Sub19_Sub1_2.anInt7682;
			local45 = (int) ((long) this.anIntArray117[arg0.anInt7287] * (long) local32 >> 6);
			local16 <<= 0x8;
			if (local45 >= local16) {
				local45 = local16 + local16 - local45 - 1;
				arg0.aClass14_Sub1_Sub1_2.method164();
			}
		} else {
			local45 = (int) ((long) local16 * (long) this.anIntArray117[arg0.anInt7287] >> 6);
		}
		arg0.aClass14_Sub1_Sub1_2.method159(local45);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!oca;Z)Z")
	public boolean method1897(@OriginalArg(0) Class14_Sub34 arg0) {
		if (arg0.aClass14_Sub1_Sub1_2 != null) {
			return false;
		}
		if (arg0.anInt7272 >= 0) {
			arg0.method9513();
			if (arg0.anInt7290 > 0 && arg0 == this.aClass14_Sub34ArrayArray1[arg0.anInt7287][arg0.anInt7290]) {
				this.aClass14_Sub34ArrayArray1[arg0.anInt7287][arg0.anInt7290] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(III)V")
	private void method1898() {
		this.anIntArray118[9] = 128;
		this.anIntArray115[9] = 128;
		this.method1900(9, 128);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZI)V")
	private void method1899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray127[arg1] = arg0;
		this.anIntArray113[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "(III)V")
	private void method1900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray126[arg0] != arg1) {
			this.anIntArray126[arg0] = arg1;
			for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
				this.aClass14_Sub34ArrayArray1[arg0][local19] = null;
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IJ)V")
	private void method1901(@OriginalArg(1) long arg0) {
		while (this.aLong83 <= arg0) {
			@Pc(15) int local15 = this.anInt1999;
			@Pc(18) int local18 = this.anInt2000;
			@Pc(21) long local21 = this.aLong83;
			while (this.anInt2000 == local18) {
				while (this.aClass254_1.anIntArray364[local15] == local18) {
					this.aClass254_1.method6248(local15);
					@Pc(34) int local34 = this.aClass254_1.method6245(local15);
					if (local34 == 1) {
						this.aClass254_1.method6236();
						this.aClass254_1.method6244(local15);
						if (this.aClass254_1.method6237()) {
							if (!this.aBoolean138 || local18 == 0) {
								this.method1894(true);
								this.aClass254_1.method6246();
								return;
							}
							this.aClass254_1.method6238(local21);
						}
						break;
					}
					if ((local34 & 0x80) != 0 && (local34 & 0xF0) != 144) {
						this.method1913(local34);
					}
					this.aClass254_1.method6239(local15);
					this.aClass254_1.method6244(local15);
				}
				this.aLong82 = local21;
				local15 = this.aClass254_1.method6243();
				local18 = this.aClass254_1.anIntArray364[local15];
				local21 = this.aClass254_1.method6241(local18);
			}
			this.aLong83 = local21;
			this.anInt1999 = local15;
			this.anInt2000 = local18;
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(Lclient!oca;I)I")
	private int method1902(@OriginalArg(0) Class14_Sub34 arg0) {
		@Pc(14) int local14 = (arg0.anInt7280 * arg0.anInt7283 >> 12) + arg0.anInt7288;
		local14 += (this.anIntArray112[arg0.anInt7287] - 8192) * this.anIntArray116[arg0.anInt7287] >> 12;
		@Pc(35) Class156 local35 = arg0.aClass156_1;
		@Pc(62) int local62;
		if (local35.anInt4371 > 0 && (local35.anInt4372 > 0 || this.anIntArray114[arg0.anInt7287] > 0)) {
			local62 = local35.anInt4372 << 2;
			@Pc(67) int local67 = local35.anInt4368 << 1;
			if (arg0.anInt7284 < local67) {
				local62 = arg0.anInt7284 * local62 / local67;
			}
			local62 += this.anIntArray114[arg0.anInt7287] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt7277 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local97 * (double) local62);
		}
		local62 = (int) ((double) (arg0.aClass14_Sub19_Sub1_2.anInt7680 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static157.anInt2396 + 0.5D);
		return local62 < 1 ? 1 : local62;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZLclient!mn;)V")
	public synchronized void method1903(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class14_Sub28 arg1) {
		this.method1926(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(II)V")
	private void method1904(@OriginalArg(1) int arg0) {
		if ((this.anIntArray121[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(14) Class14_Sub34 local14 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method584(); local14 != null; local14 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method577()) {
			if (arg0 == local14.anInt7287 && this.aClass14_Sub34ArrayArray2[arg0][local14.anInt7291] == null && local14.anInt7272 < 0) {
				local14.anInt7272 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method9317(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass254_1.method6250()) {
			@Pc(18) int local18 = this.anInt1984 * this.aClass254_1.anInt7143 / Static157.anInt2396;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong82;
				if (this.aLong83 - local27 >= 0L) {
					this.aLong82 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong83 - this.aLong82 - 1L) / (long) local18);
				this.aLong82 += (long) local18 * (long) local58;
				this.aClass14_Sub1_Sub4_1.method9317(arg0, arg1, local58);
				arg2 -= local58;
				arg1 += local58;
				this.method1915();
			} while (this.aClass254_1.method6250());
		}
		this.aClass14_Sub1_Sub4_1.method9317(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IB)V")
	private void method1905(@OriginalArg(0) int arg0) {
		if ((this.anIntArray121[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class14_Sub34 local26 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method584(); local26 != null; local26 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method577()) {
			if (local26.anInt7287 == arg0) {
				local26.anInt7285 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!mn;JZZI)V")
	public synchronized void method1906(@OriginalArg(0) Class14_Sub28 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2) {
		this.method1926(arg2, arg0, true);
		this.method1901(arg1 * (long) this.aClass254_1.anInt7143);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!ls;Lclient!mn;ILclient!rg;I)Z")
	public synchronized boolean method1907(@OriginalArg(0) Class226 arg0, @OriginalArg(1) Class14_Sub28 arg1, @OriginalArg(3) Class310 arg2) {
		arg1.method5903();
		@Pc(13) boolean local13 = true;
		@Pc(24) int[] local24 = new int[] { 22050 };
		for (@Pc(30) Class14_Sub23 local30 = (Class14_Sub23) arg1.aClass125_26.method2633(); local30 != null; local30 = (Class14_Sub23) arg1.aClass125_26.method2627()) {
			@Pc(35) int local35 = (int) local30.aLong324;
			@Pc(43) Class14_Sub17 local43 = (Class14_Sub17) this.lb.method2630((long) local35);
			if (local43 == null) {
				local43 = Static491.method7395(local35, arg2);
				if (local43 == null) {
					local13 = false;
					continue;
				}
				this.lb.method2626(local43, (long) local35);
			}
			if (!local43.method2154(arg0, local24, local30.aByteArray66)) {
				local13 = false;
			}
		}
		if (local13) {
			arg1.method5902();
		}
		return local13;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIB)V")
	private void method1908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class14_Sub34 local12 = this.aClass14_Sub34ArrayArray2[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass14_Sub34ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray121[arg1] & 0x2) == 0) {
			local12.anInt7272 = 0;
			return;
		}
		for (@Pc(48) Class14_Sub34 local48 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method584(); local48 != null; local48 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method577()) {
			if (local48.anInt7287 == local12.anInt7287 && local48.anInt7272 < 0 && local12 != local48) {
				local12.anInt7272 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "()Lclient!ec;")
	@Override
	public synchronized Class14_Sub1 method9316() {
		return this.aClass14_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BI)V")
	private void method1909(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class14_Sub34 local15 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method584(); local15 != null; local15 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method577()) {
			if ((arg0 < 0 || arg0 == local15.anInt7287) && local15.anInt7272 < 0) {
				this.aClass14_Sub34ArrayArray2[local15.anInt7287][local15.anInt7291] = null;
				local15.anInt7272 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)V")
	private void method1910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method9318(@OriginalArg(0) int arg0) {
		if (this.aClass254_1.method6250()) {
			@Pc(18) int local18 = this.aClass254_1.anInt7143 * this.anInt1984 / Static157.anInt2396;
			do {
				@Pc(28) long local28 = this.aLong82 + (long) arg0 * (long) local18;
				if (this.aLong83 - local28 >= 0L) {
					this.aLong82 = local28;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong83 + (long) local18 - this.aLong82 - 1L) / (long) local18);
				this.aLong82 += (long) local59 * (long) local18;
				this.aClass14_Sub1_Sub4_1.method9318(local59);
				arg0 -= local59;
				this.method1915();
			} while (this.aClass254_1.method6250());
		}
		this.aClass14_Sub1_Sub4_1.method9318(arg0);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIZI)V")
	private void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method1908(64, arg0, arg1);
		if ((this.anIntArray121[arg0] & 0x2) != 0) {
			for (@Pc(25) Class14_Sub34 local25 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method578(); local25 != null; local25 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method580()) {
				if (local25.anInt7287 == arg0 && local25.anInt7272 < 0) {
					this.aClass14_Sub34ArrayArray2[arg0][local25.anInt7291] = null;
					this.aClass14_Sub34ArrayArray2[arg0][arg1] = local25;
					@Pc(72) int local72 = local25.anInt7288 + (local25.anInt7283 * local25.anInt7280 >> 12);
					local25.anInt7288 += arg1 - local25.anInt7291 << 8;
					local25.anInt7291 = arg1;
					local25.anInt7280 = local72 - local25.anInt7288;
					local25.anInt7283 = 4096;
					return;
				}
			}
		}
		@Pc(117) Class14_Sub17 local117 = (Class14_Sub17) this.lb.method2630((long) this.anIntArray126[arg0]);
		if (local117 == null) {
			return;
		}
		@Pc(126) Class14_Sub19_Sub1 local126 = local117.aClass14_Sub19_Sub1Array1[arg1];
		if (local126 == null) {
			return;
		}
		@Pc(134) Class14_Sub34 local134 = new Class14_Sub34();
		local134.aClass14_Sub17_1 = local117;
		local134.aClass14_Sub19_Sub1_2 = local126;
		local134.anInt7287 = arg0;
		local134.aClass156_1 = local117.aClass156Array1[arg1];
		local134.anInt7290 = local117.aByteArray40[arg1];
		local134.anInt7291 = arg1;
		local134.anInt7275 = local117.anInt2272 * arg2 * arg2 * local117.aByteArray39[arg1] + 1024 >> 11;
		local134.anInt7274 = local117.aByteArray38[arg1] & 0xFF;
		local134.anInt7288 = (arg1 << 8) - (local117.aShortArray33[arg1] & 0x7FFF);
		local134.anInt7281 = 0;
		local134.anInt7276 = 0;
		local134.anInt7289 = 0;
		local134.anInt7272 = -1;
		local134.anInt7286 = 0;
		if (this.anIntArray117[arg0] == 0) {
			local134.aClass14_Sub1_Sub1_2 = Static692.method188(local126, this.method1902(local134), this.method1893(local134), this.method1923(local134));
		} else {
			local134.aClass14_Sub1_Sub1_2 = Static692.method188(local126, this.method1902(local134), 0, this.method1923(local134));
			this.method1896(local134, local117.aShortArray33[arg1] < 0);
		}
		if (local117.aShortArray33[arg1] < 0) {
			local134.aClass14_Sub1_Sub1_2.method152(-1);
		}
		if (local134.anInt7290 >= 0) {
			@Pc(302) Class14_Sub34 local302 = this.aClass14_Sub34ArrayArray1[arg0][local134.anInt7290];
			if (local302 != null && local302.anInt7272 < 0) {
				this.aClass14_Sub34ArrayArray2[arg0][local302.anInt7291] = null;
				local302.anInt7272 = 0;
			}
			this.aClass14_Sub34ArrayArray1[arg0][local134.anInt7290] = local134;
		}
		this.aClass14_Sub1_Sub4_1.aClass32_40.method582(local134);
		this.aClass14_Sub34ArrayArray2[arg0][arg1] = local134;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZI)V")
	private void method1913(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1908(local30, local18, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1908(64, local18, local24);
			} else {
				this.method1911(local18, local24, local30);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1922(local30, local18, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray115[local18] = (local30 << 14) + (this.anIntArray115[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray115[local18] = (local30 << 7) + (this.anIntArray115[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray114[local18] = (local30 << 7) + (this.anIntArray114[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray114[local18] = (this.anIntArray114[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray123[local18] = (local30 << 7) + (this.anIntArray123[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray123[local18] = local30 + (this.anIntArray123[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray122[local18] = (this.anIntArray122[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray122[local18] = (this.anIntArray122[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray125[local18] = (local30 << 7) + (this.anIntArray125[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray125[local18] = (this.anIntArray125[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray119[local18] = (this.anIntArray119[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray119[local18] = local30 + (this.anIntArray119[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray121[local18] |= 0x1;
				} else {
					this.anIntArray121[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1904(local18);
					this.anIntArray121[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray121[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray124[local18] = (local30 << 7) + (this.anIntArray124[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray124[local18] = local30 + (this.anIntArray124[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray124[local18] = (local30 << 7) + (this.anIntArray124[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray124[local18] = (this.anIntArray124[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method1924(local18);
			}
			if (local24 == 121) {
				this.method1888(local18);
			}
			if (local24 == 123) {
				this.method1909(local18);
			}
			@Pc(559) int local559;
			if (local24 == 6) {
				local559 = this.anIntArray124[local18];
				if (local559 == 16384) {
					this.anIntArray116[local18] = (this.anIntArray116[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local559 = this.anIntArray124[local18];
				if (local559 == 16384) {
					this.anIntArray116[local18] = (this.anIntArray116[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray117[local18] = (local30 << 7) + (this.anIntArray117[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray117[local18] = (this.anIntArray117[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray121[local18] |= 0x4;
				} else {
					this.method1905(local18);
					this.anIntArray121[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1899((this.anIntArray127[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method1899(local30 + (this.anIntArray127[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1900(local18, this.anIntArray115[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1910(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1916(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1894(true);
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public synchronized void method1914() {
		this.method1925(true);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)V")
	private void method1915() {
		@Pc(8) int local8 = this.anInt1999;
		@Pc(11) int local11 = this.anInt2000;
		@Pc(14) long local14 = this.aLong83;
		if (this.aClass14_Sub28_1 != null && local11 == this.anInt2001) {
			this.method1926(this.aBoolean138, this.aClass14_Sub28_1, this.aBoolean139);
			this.method1915();
			return;
		}
		while (this.anInt2000 == local11) {
			while (this.aClass254_1.anIntArray364[local8] == local11) {
				this.aClass254_1.method6248(local8);
				@Pc(48) int local48 = this.aClass254_1.method6245(local8);
				if (local48 == 1) {
					this.aClass254_1.method6236();
					this.aClass254_1.method6244(local8);
					if (this.aClass254_1.method6237()) {
						if (this.aClass14_Sub28_1 != null) {
							this.method1903(this.aBoolean138, this.aClass14_Sub28_1);
							this.method1915();
							return;
						}
						if (!this.aBoolean138 || local11 == 0) {
							this.method1894(true);
							this.aClass254_1.method6246();
							return;
						}
						this.aClass254_1.method6238(local14);
					}
					break;
				}
				if ((local48 & 0x80) != 0) {
					this.method1913(local48);
				}
				this.aClass254_1.method6239(local8);
				this.aClass254_1.method6244(local8);
			}
			local8 = this.aClass254_1.method6243();
			local11 = this.aClass254_1.anIntArray364[local8];
			local14 = this.aClass254_1.method6241(local11);
		}
		this.anInt2000 = local11;
		this.aLong83 = local14;
		this.anInt1999 = local8;
		if (this.aClass14_Sub28_1 != null && local11 > this.anInt2001) {
			this.anInt2000 = this.anInt2001;
			this.anInt1999 = -1;
			this.aLong83 = this.aClass254_1.method6241(this.anInt2000);
		}
	}

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "(III)V")
	private void method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray112[arg0] = arg1;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(III)V")
	public synchronized void method1917() {
		this.method1898();
	}

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "(I)I")
	public int method1918() {
		return this.anInt1971;
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(III)V")
	public synchronized void method1919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray120[arg1] = arg0;
		} else {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.anIntArray120[local13] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "()Lclient!ec;")
	@Override
	public synchronized Class14_Sub1 method9320() {
		return null;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!oca;I[IZI)Z")
	public boolean method1920(@OriginalArg(0) Class14_Sub34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt7273 = Static157.anInt2396 / 100;
		if (arg0.anInt7272 >= 0 && (arg0.aClass14_Sub1_Sub1_2 == null || arg0.aClass14_Sub1_Sub1_2.method172())) {
			arg0.method6444();
			arg0.method9513();
			if (arg0.anInt7290 > 0 && this.aClass14_Sub34ArrayArray1[arg0.anInt7287][arg0.anInt7290] == arg0) {
				this.aClass14_Sub34ArrayArray1[arg0.anInt7287][arg0.anInt7290] = null;
			}
			return true;
		}
		@Pc(66) int local66 = arg0.anInt7283;
		if (local66 > 0) {
			local66 -= (int) (Math.pow(2.0D, (double) this.anIntArray123[arg0.anInt7287] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local66 < 0) {
				local66 = 0;
			}
			arg0.anInt7283 = local66;
		}
		arg0.aClass14_Sub1_Sub1_2.method163(this.method1902(arg0));
		@Pc(109) Class156 local109 = arg0.aClass156_1;
		@Pc(111) boolean local111 = false;
		arg0.anInt7277 += local109.anInt4371;
		arg0.anInt7284++;
		@Pc(142) double local142 = (double) ((arg0.anInt7283 * arg0.anInt7280 >> 12) + (arg0.anInt7291 - 60 << 8)) * 5.086263020833333E-6D;
		if (local109.anInt4369 > 0) {
			if (local109.anInt4366 > 0) {
				arg0.anInt7286 += (int) (Math.pow(2.0D, local142 * (double) local109.anInt4366) * 128.0D + 0.5D);
			} else {
				arg0.anInt7286 += 128;
			}
			if (arg0.anInt7286 * local109.anInt4369 >= 819200) {
				local111 = true;
			}
		}
		if (local109.aByteArray54 != null) {
			if (local109.anInt4373 <= 0) {
				arg0.anInt7276 += 128;
			} else {
				arg0.anInt7276 += (int) (Math.pow(2.0D, (double) local109.anInt4373 * local142) * 128.0D + 0.5D);
			}
			while (arg0.anInt7289 < local109.aByteArray54.length - 2 && arg0.anInt7276 > (local109.aByteArray54[arg0.anInt7289 + 2] & 0xFF) << 8) {
				arg0.anInt7289 += 2;
			}
			if (local109.aByteArray54.length - 2 == arg0.anInt7289 && local109.aByteArray54[arg0.anInt7289 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg0.anInt7272 >= 0 && local109.aByteArray55 != null && (this.anIntArray121[arg0.anInt7287] & 0x1) == 0 && (arg0.anInt7290 < 0 || arg0 != this.aClass14_Sub34ArrayArray1[arg0.anInt7287][arg0.anInt7290])) {
			if (local109.anInt4370 <= 0) {
				arg0.anInt7272 += 128;
			} else {
				arg0.anInt7272 += (int) (Math.pow(2.0D, (double) local109.anInt4370 * local142) * 128.0D + 0.5D);
			}
			while (local109.aByteArray55.length - 2 > arg0.anInt7281 && arg0.anInt7272 > (local109.aByteArray55[arg0.anInt7281 + 2] & 0xFF) << 8) {
				arg0.anInt7281 += 2;
			}
			if (local109.aByteArray55.length - 2 == arg0.anInt7281) {
				local111 = true;
			}
		}
		if (!local111) {
			arg0.aClass14_Sub1_Sub1_2.method170(arg0.anInt7273, this.method1893(arg0), this.method1923(arg0));
			return false;
		}
		arg0.aClass14_Sub1_Sub1_2.method181(arg0.anInt7273);
		if (arg2 == null) {
			arg0.aClass14_Sub1_Sub1_2.method9318(arg1);
		} else {
			arg0.aClass14_Sub1_Sub1_2.method9317(arg2, arg3, arg1);
		}
		if (arg0.aClass14_Sub1_Sub1_2.method175()) {
			this.aClass14_Sub1_Sub4_1.aClass14_Sub1_Sub2_2.method1805(arg0.aClass14_Sub1_Sub1_2);
		}
		arg0.method6444();
		if (arg0.anInt7272 >= 0) {
			arg0.method9513();
			if (arg0.anInt7290 > 0 && arg0 == this.aClass14_Sub34ArrayArray1[arg0.anInt7287][arg0.anInt7290]) {
				this.aClass14_Sub34ArrayArray1[arg0.anInt7287][arg0.anInt7290] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIII)V")
	private void method1922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZLclient!oca;)I")
	private int method1923(@OriginalArg(1) Class14_Sub34 arg0) {
		@Pc(19) int local19 = this.anIntArray125[arg0.anInt7287];
		return local19 < 8192 ? arg0.anInt7274 * local19 + 32 >> 6 : 16384 - ((16384 - local19) * (-arg0.anInt7274 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V")
	private void method1924(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class14_Sub34 local11 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method584(); local11 != null; local11 = (Class14_Sub34) this.aClass14_Sub1_Sub4_1.aClass32_40.method577()) {
			if (arg0 < 0 || local11.anInt7287 == arg0) {
				if (local11.aClass14_Sub1_Sub1_2 != null) {
					local11.aClass14_Sub1_Sub1_2.method181(Static157.anInt2396 / 100);
					if (local11.aClass14_Sub1_Sub1_2.method175()) {
						this.aClass14_Sub1_Sub4_1.aClass14_Sub1_Sub2_2.method1805(local11.aClass14_Sub1_Sub1_2);
					}
					local11.method6444();
				}
				if (local11.anInt7272 < 0) {
					this.aClass14_Sub34ArrayArray2[local11.anInt7287][local11.anInt7291] = null;
				}
				local11.method9513();
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(IZ)V")
	private synchronized void method1925(@OriginalArg(1) boolean arg0) {
		this.aClass254_1.method6246();
		this.aClass14_Sub28_1 = null;
		this.method1894(arg0);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZLclient!mn;IZ)V")
	private synchronized void method1926(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14_Sub28 arg1, @OriginalArg(3) boolean arg2) {
		this.method1925(arg2);
		this.aClass254_1.method6247(arg1.aByteArray74);
		this.aLong82 = 0L;
		this.aBoolean138 = arg0;
		@Pc(32) int local32 = this.aClass254_1.method6249();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass254_1.method6248(local34);
			this.aClass254_1.method6239(local34);
			this.aClass254_1.method6244(local34);
		}
		this.anInt1999 = this.aClass254_1.method6243();
		this.anInt2000 = this.aClass254_1.anIntArray364[this.anInt1999];
		this.aLong83 = this.aClass254_1.method6241(this.anInt2000);
	}
}
