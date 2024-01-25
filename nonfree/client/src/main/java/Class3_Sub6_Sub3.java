import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class3_Sub6_Sub3 extends Class3_Sub6 {

	@OriginalMember(owner = "client!dp", name = "Cb", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!dp", name = "Db", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!dp", name = "Eb", descriptor = "I")
	private int anInt2393;

	@OriginalMember(owner = "client!dp", name = "Fb", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!dp", name = "Gb", descriptor = "I")
	private int anInt2394;

	@OriginalMember(owner = "client!dp", name = "Ib", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!dp", name = "Jb", descriptor = "I")
	private int anInt2395;

	@OriginalMember(owner = "client!dp", name = "Kb", descriptor = "Lclient!mc;")
	private Class3_Sub32 aClass3_Sub32_1;

	@OriginalMember(owner = "client!dp", name = "B", descriptor = "[I")
	private final int[] anIntArray151 = new int[16];

	@OriginalMember(owner = "client!dp", name = "K", descriptor = "[I")
	private final int[] anIntArray153 = new int[16];

	@OriginalMember(owner = "client!dp", name = "F", descriptor = "[[Lclient!at;")
	private final Class3_Sub7[][] aClass3_Sub7ArrayArray1 = new Class3_Sub7[16][128];

	@OriginalMember(owner = "client!dp", name = "C", descriptor = "[I")
	private final int[] anIntArray152 = new int[16];

	@OriginalMember(owner = "client!dp", name = "M", descriptor = "[I")
	private final int[] anIntArray154 = new int[16];

	@OriginalMember(owner = "client!dp", name = "S", descriptor = "[[Lclient!at;")
	private final Class3_Sub7[][] aClass3_Sub7ArrayArray2 = new Class3_Sub7[16][128];

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "[I")
	private final int[] anIntArray148 = new int[16];

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "[I")
	public final int[] anIntArray149 = new int[16];

	@OriginalMember(owner = "client!dp", name = "Y", descriptor = "[I")
	private final int[] anIntArray158 = new int[16];

	@OriginalMember(owner = "client!dp", name = "W", descriptor = "I")
	private int anInt2372 = 256;

	@OriginalMember(owner = "client!dp", name = "db", descriptor = "I")
	private final int anInt2376 = 1000000;

	@OriginalMember(owner = "client!dp", name = "T", descriptor = "[I")
	private final int[] anIntArray156 = new int[16];

	@OriginalMember(owner = "client!dp", name = "P", descriptor = "[I")
	private final int[] anIntArray155 = new int[16];

	@OriginalMember(owner = "client!dp", name = "Z", descriptor = "[I")
	private final int[] anIntArray159 = new int[16];

	@OriginalMember(owner = "client!dp", name = "X", descriptor = "[I")
	private final int[] anIntArray157 = new int[16];

	@OriginalMember(owner = "client!dp", name = "vb", descriptor = "[I")
	public final int[] anIntArray163 = new int[16];

	@OriginalMember(owner = "client!dp", name = "A", descriptor = "[I")
	private final int[] anIntArray150 = new int[16];

	@OriginalMember(owner = "client!dp", name = "xb", descriptor = "[I")
	public final int[] anIntArray164 = new int[16];

	@OriginalMember(owner = "client!dp", name = "ob", descriptor = "[I")
	private final int[] anIntArray161 = new int[16];

	@OriginalMember(owner = "client!dp", name = "sb", descriptor = "[I")
	private final int[] anIntArray162 = new int[16];

	@OriginalMember(owner = "client!dp", name = "N", descriptor = "Lclient!oc;")
	private final Class238 aClass238_1 = new Class238();

	@OriginalMember(owner = "client!dp", name = "Hb", descriptor = "Lclient!iaa;")
	private final Class3_Sub6_Sub4 aClass3_Sub6_Sub4_1 = new Class3_Sub6_Sub4(this);

	@OriginalMember(owner = "client!dp", name = "qb", descriptor = "Lclient!sl;")
	private final Class310 aClass310_9 = new Class310(128);

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub3() {
		this.method2124();
		this.method2126(true);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIB)V")
	private void method2113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method2117(arg2, 64, arg0);
		if ((this.anIntArray163[arg0] & 0x2) != 0) {
			for (@Pc(30) Class3_Sub7 local30 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3540(); local30 != null; local30 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3550()) {
				if (arg0 == local30.anInt578 && local30.anInt573 < 0) {
					this.aClass3_Sub7ArrayArray2[arg0][local30.anInt571] = null;
					this.aClass3_Sub7ArrayArray2[arg0][arg2] = local30;
					@Pc(69) int local69 = local30.anInt584 + (local30.anInt574 * local30.anInt586 >> 12);
					local30.anInt584 += arg2 - local30.anInt571 << 8;
					local30.anInt571 = arg2;
					local30.anInt574 = local69 - local30.anInt584;
					local30.anInt586 = 4096;
					return;
				}
			}
		}
		@Pc(114) Class3_Sub12 local114 = (Class3_Sub12) this.aClass310_9.method6601((long) this.anIntArray158[arg0]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class3_Sub20_Sub1 local122 = local114.aClass3_Sub20_Sub1Array1[arg2];
		if (local122 == null) {
			return;
		}
		@Pc(129) Class3_Sub7 local129 = new Class3_Sub7();
		local129.anInt578 = arg0;
		local129.aClass3_Sub12_1 = local114;
		local129.aClass3_Sub20_Sub1_1 = local122;
		local129.aClass228_1 = local114.aClass228Array1[arg2];
		local129.anInt580 = local114.aByteArray11[arg2];
		local129.anInt571 = arg2;
		local129.anInt577 = local114.aByteArray13[arg2] * arg1 * arg1 * local114.anInt1308 + 1024 >> 11;
		local129.anInt576 = local114.aByteArray12[arg2] & 0xFF;
		local129.anInt584 = (arg2 << 8) - (local114.aShortArray28[arg2] & 0x7FFF);
		local129.anInt569 = 0;
		local129.anInt587 = 0;
		local129.anInt570 = 0;
		local129.anInt583 = 0;
		local129.anInt573 = -1;
		if (this.anIntArray164[arg0] == 0) {
			local129.aClass3_Sub6_Sub2_1 = Static598.method1557(local122, this.method2141(local129), this.method2116(local129), this.method2139(local129));
		} else {
			local129.aClass3_Sub6_Sub2_1 = Static598.method1557(local122, this.method2141(local129), 0, this.method2139(local129));
			this.method2133(local114.aShortArray28[arg2] < 0, local129);
		}
		if (local114.aShortArray28[arg2] < 0) {
			local129.aClass3_Sub6_Sub2_1.method1582(-1);
		}
		if (local129.anInt580 >= 0) {
			@Pc(286) Class3_Sub7 local286 = this.aClass3_Sub7ArrayArray1[arg0][local129.anInt580];
			if (local286 != null && local286.anInt573 < 0) {
				this.aClass3_Sub7ArrayArray2[arg0][local286.anInt571] = null;
				local286.anInt573 = 0;
			}
			this.aClass3_Sub7ArrayArray1[arg0][local129.anInt580] = local129;
		}
		this.aClass3_Sub6_Sub4_1.aClass130_21.method3548(local129);
		this.aClass3_Sub7ArrayArray2[arg0][arg2] = local129;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZII)V")
	public synchronized void method2114() {
		this.method2148();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)V")
	private void method2115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray155[arg0] = arg1;
		this.anIntArray149[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "()I")
	@Override
	public synchronized int method3727() {
		return 0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!at;)I")
	private int method2116(@OriginalArg(1) Class3_Sub7 arg0) {
		if (this.anIntArray153[arg0.anInt578] == 0) {
			return 0;
		}
		@Pc(14) Class228 local14 = arg0.aClass228_1;
		@Pc(30) int local30 = this.anIntArray156[arg0.anInt578] * this.anIntArray150[arg0.anInt578] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt577 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt2372 * local47 + 128 >> 8;
		local30 = this.anIntArray153[arg0.anInt578] * local56 + 128 >> 8;
		if (local14.anInt6134 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local14.anInt6134 * (double) arg0.anInt583 * 1.953125E-5D) + 0.5D);
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(125) int local125;
		@Pc(137) int local137;
		if (local14.aByteArray78 != null) {
			local95 = arg0.anInt570;
			local103 = local14.aByteArray78[arg0.anInt587 + 1];
			if (arg0.anInt587 < local14.aByteArray78.length - 2) {
				local125 = (local14.aByteArray78[arg0.anInt587] & 0xFF) << 8;
				local137 = (local14.aByteArray78[arg0.anInt587 + 2] & 0xFF) << 8;
				local103 += (local95 - local125) * (-local103 + local14.aByteArray78[arg0.anInt587 + 3]) / (local137 - local125);
			}
			local30 = local30 * local103 + 32 >> 6;
		}
		if (arg0.anInt573 > 0 && local14.aByteArray79 != null) {
			local95 = arg0.anInt573;
			local103 = local14.aByteArray79[arg0.anInt569 + 1];
			if (arg0.anInt569 < local14.aByteArray79.length - 2) {
				local125 = (local14.aByteArray79[arg0.anInt569] & 0xFF) << 8;
				local137 = (local14.aByteArray79[arg0.anInt569 + 2] & 0xFF) << 8;
				local103 += (local14.aByteArray79[arg0.anInt569 + 3] - local103) * (local95 - local125) / (local137 - local125);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIII)V")
	private void method2117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub7 local12 = this.aClass3_Sub7ArrayArray2[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub7ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray163[arg2] & 0x2) == 0) {
			local12.anInt573 = 0;
			return;
		}
		for (@Pc(51) Class3_Sub7 local51 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3543(); local51 != null; local51 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3551()) {
			if (local51.anInt578 == local12.anInt578 && local51.anInt573 < 0 && local51 != local12) {
				local12.anInt573 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public synchronized void method2118(@OriginalArg(0) int arg0) {
		this.anInt2372 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)V")
	private void method2119(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.method2119(local13);
			}
			return;
		}
		this.anIntArray150[arg0] = 12800;
		this.anIntArray157[arg0] = 8192;
		this.anIntArray156[arg0] = 16383;
		this.anIntArray162[arg0] = 8192;
		this.anIntArray151[arg0] = 0;
		this.anIntArray154[arg0] = 8192;
		this.method2150(arg0);
		this.method2132(arg0);
		this.anIntArray163[arg0] = 0;
		this.anIntArray159[arg0] = 32767;
		this.anIntArray152[arg0] = 256;
		this.anIntArray164[arg0] = 0;
		this.method2115(arg0, 8192);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(BI)V")
	private void method2120(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class3_Sub7 local14 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3543(); local14 != null; local14 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3551()) {
			if (arg0 < 0 || local14.anInt578 == arg0) {
				if (local14.aClass3_Sub6_Sub2_1 != null) {
					local14.aClass3_Sub6_Sub2_1.method1560(Static124.anInt3635 / 100);
					if (local14.aClass3_Sub6_Sub2_1.method1577()) {
						this.aClass3_Sub6_Sub4_1.aClass3_Sub6_Sub1_2.method285(local14.aClass3_Sub6_Sub2_1);
					}
					local14.method459();
				}
				if (local14.anInt573 < 0) {
					this.aClass3_Sub7ArrayArray2[local14.anInt578][local14.anInt571] = null;
				}
				local14.method7812();
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIBI)V")
	private void method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "(I)V")
	public synchronized void method2122() {
		for (@Pc(17) Class3_Sub12 local17 = (Class3_Sub12) this.aClass310_9.method6602(); local17 != null; local17 = (Class3_Sub12) this.aClass310_9.method6599()) {
			local17.method1062();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!mc;Lclient!tu;BLclient!om;)Z")
	public synchronized boolean method2123(@OriginalArg(1) Class3_Sub32 arg0, @OriginalArg(2) Class326 arg1, @OriginalArg(4) Class246 arg2) {
		arg0.method4959();
		@Pc(9) boolean local9 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class3_Sub27 local34 = (Class3_Sub27) arg0.aClass310_23.method6602(); local34 != null; local34 = (Class3_Sub27) arg0.aClass310_23.method6599()) {
			@Pc(40) int local40 = (int) local34.aLong273;
			@Pc(48) Class3_Sub12 local48 = (Class3_Sub12) this.aClass310_9.method6601((long) local40);
			if (local48 == null) {
				local48 = Static150.method2787(local40, arg2);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass310_9.method6603(local48, (long) local40);
			}
			if (!local48.method1064(local34.aByteArray40, arg1, local28)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method4961();
		}
		return local9;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(III)V")
	private synchronized void method2124() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray153[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3732(@OriginalArg(0) int arg0) {
		if (this.aClass238_1.method5500()) {
			@Pc(18) int local18 = this.anInt2376 * this.aClass238_1.anInt6334 / Static124.anInt3635;
			do {
				@Pc(28) long local28 = this.aLong58 + (long) local18 * (long) arg0;
				if (this.aLong59 - local28 >= 0L) {
					this.aLong58 = local28;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong59 + (long) local18 - this.aLong58 - 1L) / (long) local18);
				this.aLong58 += (long) local18 * (long) local58;
				arg0 -= local58;
				this.aClass3_Sub6_Sub4_1.method3732(local58);
				this.method2146();
			} while (this.aClass238_1.method5500());
		}
		this.aClass3_Sub6_Sub4_1.method3732(arg0);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)V")
	private void method2126(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method2120(-1);
		} else {
			this.method2149(-1);
		}
		this.method2119(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray158[local29] = this.anIntArray161[local29];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray148[local47] = this.anIntArray161[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZZLclient!mc;JB)V")
	public synchronized void method2127(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub32 arg1, @OriginalArg(3) long arg2) {
		this.method2135(true, arg0, arg1);
		this.method2137(arg2 * (long) this.aClass238_1.anInt6334);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(ILclient!at;)Z")
	public boolean method2128(@OriginalArg(1) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub6_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt573 >= 0) {
			arg0.method7812();
			if (arg0.anInt580 > 0 && this.aClass3_Sub7ArrayArray1[arg0.anInt578][arg0.anInt580] == arg0) {
				this.aClass3_Sub7ArrayArray1[arg0.anInt578][arg0.anInt580] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!at;II[II)Z")
	public boolean method2129(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg0.anInt585 = Static124.anInt3635 / 100;
		if (arg0.anInt573 >= 0 && (arg0.aClass3_Sub6_Sub2_1 == null || arg0.aClass3_Sub6_Sub2_1.method1555())) {
			arg0.method459();
			arg0.method7812();
			if (arg0.anInt580 > 0 && this.aClass3_Sub7ArrayArray1[arg0.anInt578][arg0.anInt580] == arg0) {
				this.aClass3_Sub7ArrayArray1[arg0.anInt578][arg0.anInt580] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg0.anInt586;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray154[arg0.anInt578] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg0.anInt586 = local53;
		}
		arg0.aClass3_Sub6_Sub2_1.method1585(this.method2141(arg0));
		@Pc(93) Class228 local93 = arg0.aClass228_1;
		arg0.anInt572 += local93.anInt6139;
		@Pc(102) boolean local102 = false;
		arg0.anInt581++;
		@Pc(126) double local126 = (double) ((arg0.anInt586 * arg0.anInt574 >> 12) + (arg0.anInt571 - 60 << 8)) * 5.086263020833333E-6D;
		if (local93.anInt6134 > 0) {
			if (local93.anInt6131 <= 0) {
				arg0.anInt583 += 128;
			} else {
				arg0.anInt583 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt6131) * 128.0D + 0.5D);
			}
			if (arg0.anInt583 * local93.anInt6134 >= 819200) {
				local102 = true;
			}
		}
		if (local93.aByteArray78 != null) {
			if (local93.anInt6133 <= 0) {
				arg0.anInt570 += 128;
			} else {
				arg0.anInt570 += (int) (Math.pow(2.0D, (double) local93.anInt6133 * local126) * 128.0D + 0.5D);
			}
			while (arg0.anInt587 < local93.aByteArray78.length - 2 && (local93.aByteArray78[arg0.anInt587 + 2] & 0xFF) << 8 < arg0.anInt570) {
				arg0.anInt587 += 2;
			}
			if (arg0.anInt587 == local93.aByteArray78.length - 2 && local93.aByteArray78[arg0.anInt587 + 1] == 0) {
				local102 = true;
			}
		}
		if (arg0.anInt573 >= 0 && local93.aByteArray79 != null && (this.anIntArray163[arg0.anInt578] & 0x1) == 0 && (arg0.anInt580 < 0 || arg0 != this.aClass3_Sub7ArrayArray1[arg0.anInt578][arg0.anInt580])) {
			if (local93.anInt6137 > 0) {
				arg0.anInt573 += (int) (Math.pow(2.0D, (double) local93.anInt6137 * local126) * 128.0D + 0.5D);
			} else {
				arg0.anInt573 += 128;
			}
			while (local93.aByteArray79.length - 2 > arg0.anInt569 && (local93.aByteArray79[arg0.anInt569 + 2] & 0xFF) << 8 < arg0.anInt573) {
				arg0.anInt569 += 2;
			}
			if (arg0.anInt569 == local93.aByteArray79.length - 2) {
				local102 = true;
			}
		}
		if (!local102) {
			arg0.aClass3_Sub6_Sub2_1.method1552(arg0.anInt585, this.method2116(arg0), this.method2139(arg0));
			return false;
		}
		arg0.aClass3_Sub6_Sub2_1.method1560(arg0.anInt585);
		if (arg3 == null) {
			arg0.aClass3_Sub6_Sub2_1.method3732(arg2);
		} else {
			arg0.aClass3_Sub6_Sub2_1.method3728(arg3, arg1, arg2);
		}
		if (arg0.aClass3_Sub6_Sub2_1.method1577()) {
			this.aClass3_Sub6_Sub4_1.aClass3_Sub6_Sub1_2.method285(arg0.aClass3_Sub6_Sub2_1);
		}
		arg0.method459();
		if (arg0.anInt573 >= 0) {
			arg0.method7812();
			if (arg0.anInt580 > 0 && arg0 == this.aClass3_Sub7ArrayArray1[arg0.anInt578][arg0.anInt580]) {
				this.aClass3_Sub7ArrayArray1[arg0.anInt578][arg0.anInt580] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)V")
	private void method2130(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2117(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method2117(local22, 64, local16);
			} else {
				this.method2113(local16, local28, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2121(local22, local28, local16);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray148[local16] = (local28 << 14) + (this.anIntArray148[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray148[local16] = (this.anIntArray148[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray151[local16] = (local28 << 7) + (this.anIntArray151[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray151[local16] = (this.anIntArray151[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray154[local16] = (this.anIntArray154[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray154[local16] = (this.anIntArray154[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray150[local16] = (local28 << 7) + (this.anIntArray150[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray150[local16] = local28 + (this.anIntArray150[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray157[local16] = (local28 << 7) + (this.anIntArray157[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray157[local16] = local28 + (this.anIntArray157[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray156[local16] = (this.anIntArray156[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray156[local16] = local28 + (this.anIntArray156[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray163[local16] |= 0x1;
				} else {
					this.anIntArray163[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method2150(local16);
					this.anIntArray163[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray163[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray159[local16] = (this.anIntArray159[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray159[local16] = (this.anIntArray159[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray159[local16] = (local28 << 7) + (this.anIntArray159[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray159[local16] = (this.anIntArray159[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method2120(local16);
			}
			if (local22 == 121) {
				this.method2119(local16);
			}
			if (local22 == 123) {
				this.method2149(local16);
			}
			@Pc(498) int local498;
			if (local22 == 6) {
				local498 = this.anIntArray159[local16];
				if (local498 == 16384) {
					this.anIntArray152[local16] = (local28 << 7) + (this.anIntArray152[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local498 = this.anIntArray159[local16];
				if (local498 == 16384) {
					this.anIntArray152[local16] = local28 + (this.anIntArray152[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray164[local16] = (this.anIntArray164[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray164[local16] = local28 + (this.anIntArray164[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray163[local16] |= 0x4;
				} else {
					this.method2132(local16);
					this.anIntArray163[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method2115(local16, (this.anIntArray155[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method2115(local16, local28 + (this.anIntArray155[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2136(local22 + this.anIntArray148[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2138(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F4E) >> 8);
			this.method2151(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2126(true);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V")
	public synchronized void method2131() {
		this.method2140(true);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)V")
	private void method2132(@OriginalArg(0) int arg0) {
		if ((this.anIntArray163[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(28) Class3_Sub7 local28 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3543(); local28 != null; local28 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3551()) {
			if (local28.anInt578 == arg0) {
				local28.anInt582 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BZLclient!at;)V")
	public void method2133(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		@Pc(16) int local16 = arg1.aClass3_Sub20_Sub1_1.aByteArray23.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass3_Sub20_Sub1_1.aBoolean212) {
			@Pc(31) int local31 = local16 + local16 - arg1.aClass3_Sub20_Sub1_1.anInt2620;
			local44 = (int) ((long) local31 * (long) this.anIntArray164[arg1.anInt578] >> 6);
			local16 <<= 0x8;
			if (local16 <= local44) {
				local44 = local16 + local16 - local44 - 1;
				arg1.aClass3_Sub6_Sub2_1.method1581();
			}
		} else {
			local44 = (int) ((long) this.anIntArray164[arg1.anInt578] * (long) local16 >> 6);
		}
		arg1.aClass3_Sub6_Sub2_1.method1572(local44);
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)V")
	public synchronized void method2134() {
		for (@Pc(15) Class3_Sub12 local15 = (Class3_Sub12) this.aClass310_9.method6602(); local15 != null; local15 = (Class3_Sub12) this.aClass310_9.method6599()) {
			local15.method7812();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZZLclient!mc;I)V")
	private synchronized void method2135(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub32 arg2) {
		this.method2140(arg0);
		this.aClass238_1.method5499(arg2.aByteArray69);
		this.aBoolean195 = arg1;
		this.aLong58 = 0L;
		@Pc(24) int local24 = this.aClass238_1.method5502();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass238_1.method5511(local26);
			this.aClass238_1.method5513(local26);
			this.aClass238_1.method5506(local26);
		}
		this.anInt2394 = this.aClass238_1.method5505();
		this.anInt2393 = this.aClass238_1.anIntArray504[this.anInt2394];
		this.aLong59 = this.aClass238_1.method5504(this.anInt2393);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIB)V")
	private void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray158[arg1] != arg0) {
			this.anIntArray158[arg1] = arg0;
			for (@Pc(33) int local33 = 0; local33 < 128; local33++) {
				this.aClass3_Sub7ArrayArray1[arg1][local33] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(JB)V")
	private void method2137(@OriginalArg(0) long arg0) {
		while (this.aLong59 <= arg0) {
			@Pc(14) int local14 = this.anInt2394;
			@Pc(17) int local17 = this.anInt2393;
			@Pc(20) long local20 = this.aLong59;
			while (this.anInt2393 == local17) {
				while (this.aClass238_1.anIntArray504[local14] == local17) {
					this.aClass238_1.method5511(local14);
					@Pc(31) int local31 = this.aClass238_1.method5509(local14);
					if (local31 == 1) {
						this.aClass238_1.method5498();
						this.aClass238_1.method5506(local14);
						if (this.aClass238_1.method5510()) {
							if (!this.aBoolean195 || local17 == 0) {
								this.method2126(true);
								this.aClass238_1.method5508();
								return;
							}
							this.aClass238_1.method5503(local20);
						}
						break;
					}
					if ((local31 & 0x80) != 0 && (local31 & 0xF0) != 144) {
						this.method2130(local31);
					}
					this.aClass238_1.method5513(local14);
					this.aClass238_1.method5506(local14);
				}
				this.aLong58 = local20;
				local14 = this.aClass238_1.method5505();
				local17 = this.aClass238_1.anIntArray504[local14];
				local20 = this.aClass238_1.method5504(local17);
			}
			this.anInt2394 = local14;
			this.aLong59 = local20;
			this.anInt2393 = local17;
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(III)V")
	private void method2138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!at;I)I")
	private int method2139(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(14) int local14 = this.anIntArray157[arg0.anInt578];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt576 + 128) + 32 >> 6) : arg0.anInt576 * local14 - -32 >> 6;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V")
	private synchronized void method2140(@OriginalArg(0) boolean arg0) {
		this.aClass238_1.method5508();
		this.aClass3_Sub32_1 = null;
		this.method2126(arg0);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(Lclient!at;I)I")
	private int method2141(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(15) int local15 = arg0.anInt584 + (arg0.anInt586 * arg0.anInt574 >> 12);
		local15 += this.anIntArray152[arg0.anInt578] * (this.anIntArray162[arg0.anInt578] - 8192) >> 12;
		@Pc(36) Class228 local36 = arg0.aClass228_1;
		@Pc(62) int local62;
		if (local36.anInt6139 > 0 && (local36.anInt6138 > 0 || this.anIntArray151[arg0.anInt578] > 0)) {
			local62 = local36.anInt6138 << 2;
			@Pc(67) int local67 = local36.anInt6132 << 1;
			if (local67 > arg0.anInt581) {
				local62 = local62 * arg0.anInt581 / local67;
			}
			local62 += this.anIntArray151[arg0.anInt578] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt572 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local62 * local97);
		}
		local62 = (int) ((double) (arg0.aClass3_Sub20_Sub1_1.anInt2622 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static124.anInt3635 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(B)Z")
	public synchronized boolean method2142() {
		return this.aClass238_1.method5500();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!mc;IZ)V")
	public synchronized void method2143(@OriginalArg(0) Class3_Sub32 arg0, @OriginalArg(2) boolean arg1) {
		this.method2135(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3728(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass238_1.method5500()) {
			@Pc(18) int local18 = this.aClass238_1.anInt6334 * this.anInt2376 / Static124.anInt3635;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong58;
				if (this.aLong59 - local27 >= 0L) {
					this.aLong58 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong59 - this.aLong58 - 1L) / (long) local18);
				this.aLong58 += (long) local18 * (long) local57;
				this.aClass3_Sub6_Sub4_1.method3728(arg0, arg1, local57);
				this.method2146();
				arg2 -= local57;
				arg1 += local57;
			} while (this.aClass238_1.method5500());
		}
		this.aClass3_Sub6_Sub4_1.method3728(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "(I)V")
	private void method2146() {
		@Pc(8) int local8 = this.anInt2394;
		@Pc(11) int local11 = this.anInt2393;
		@Pc(14) long local14 = this.aLong59;
		if (this.aClass3_Sub32_1 != null && local11 == this.anInt2395) {
			this.method2135(this.aBoolean196, this.aBoolean195, this.aClass3_Sub32_1);
			this.method2146();
			return;
		}
		while (local11 == this.anInt2393) {
			while (this.aClass238_1.anIntArray504[local8] == local11) {
				this.aClass238_1.method5511(local8);
				@Pc(43) int local43 = this.aClass238_1.method5509(local8);
				if (local43 == 1) {
					this.aClass238_1.method5498();
					this.aClass238_1.method5506(local8);
					if (this.aClass238_1.method5510()) {
						if (this.aClass3_Sub32_1 != null) {
							this.method2143(this.aClass3_Sub32_1, this.aBoolean195);
							this.method2146();
							return;
						}
						if (!this.aBoolean195 || local11 == 0) {
							this.method2126(true);
							this.aClass238_1.method5508();
							return;
						}
						this.aClass238_1.method5503(local14);
					}
					break;
				}
				if ((local43 & 0x80) != 0) {
					this.method2130(local43);
				}
				this.aClass238_1.method5513(local8);
				this.aClass238_1.method5506(local8);
			}
			local8 = this.aClass238_1.method5505();
			local11 = this.aClass238_1.anIntArray504[local8];
			local14 = this.aClass238_1.method5504(local11);
		}
		this.anInt2394 = local8;
		this.anInt2393 = local11;
		this.aLong59 = local14;
		if (this.aClass3_Sub32_1 != null && this.anInt2395 < local11) {
			this.anInt2394 = -1;
			this.anInt2393 = this.anInt2395;
			this.aLong59 = this.aClass238_1.method5504(this.anInt2393);
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "()Lclient!oea;")
	@Override
	public synchronized Class3_Sub6 method3730() {
		return null;
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "(B)I")
	public int method2147() {
		return this.anInt2372;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(III)V")
	private void method2148() {
		this.anIntArray161[9] = 128;
		this.anIntArray148[9] = 128;
		this.method2136(128, 9);
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(II)V")
	private void method2149(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class3_Sub7 local16 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3543(); local16 != null; local16 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3551()) {
			if ((arg0 < 0 || local16.anInt578 == arg0) && local16.anInt573 < 0) {
				this.aClass3_Sub7ArrayArray2[local16.anInt578][local16.anInt571] = null;
				local16.anInt573 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(IB)V")
	private void method2150(@OriginalArg(0) int arg0) {
		if ((this.anIntArray163[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3543(); local15 != null; local15 = (Class3_Sub7) this.aClass3_Sub6_Sub4_1.aClass130_21.method3551()) {
			if (arg0 == local15.anInt578 && this.aClass3_Sub7ArrayArray2[arg0][local15.anInt571] == null && local15.anInt573 < 0) {
				local15.anInt573 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "(III)V")
	private void method2151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray162[arg1] = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "()Lclient!oea;")
	@Override
	public synchronized Class3_Sub6 method3731() {
		return this.aClass3_Sub6_Sub4_1;
	}
}
