import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class10_Sub7_Sub4 extends Class10_Sub7 {

	@OriginalMember(owner = "client!rv", name = "Db", descriptor = "I")
	private int anInt6142;

	@OriginalMember(owner = "client!rv", name = "Eb", descriptor = "I")
	private int anInt6143;

	@OriginalMember(owner = "client!rv", name = "Fb", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!rv", name = "Gb", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!rv", name = "Hb", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!rv", name = "Ib", descriptor = "Lclient!ve;")
	private Class10_Sub43 aClass10_Sub43_2;

	@OriginalMember(owner = "client!rv", name = "Jb", descriptor = "I")
	private int anInt6144;

	@OriginalMember(owner = "client!rv", name = "Kb", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "[I")
	private final int[] anIntArray585 = new int[16];

	@OriginalMember(owner = "client!rv", name = "F", descriptor = "[I")
	private final int[] anIntArray589 = new int[16];

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
	private final int anInt6103 = 1000000;

	@OriginalMember(owner = "client!rv", name = "T", descriptor = "[I")
	public final int[] anIntArray591 = new int[16];

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "[I")
	private final int[] anIntArray584 = new int[16];

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "[I")
	private final int[] anIntArray588 = new int[16];

	@OriginalMember(owner = "client!rv", name = "Z", descriptor = "[I")
	public final int[] anIntArray592 = new int[16];

	@OriginalMember(owner = "client!rv", name = "eb", descriptor = "[I")
	public final int[] anIntArray595 = new int[16];

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "[I")
	private final int[] anIntArray586 = new int[16];

	@OriginalMember(owner = "client!rv", name = "bb", descriptor = "[I")
	private final int[] anIntArray593 = new int[16];

	@OriginalMember(owner = "client!rv", name = "mb", descriptor = "[I")
	private final int[] anIntArray597 = new int[16];

	@OriginalMember(owner = "client!rv", name = "jb", descriptor = "[I")
	private final int[] anIntArray596 = new int[16];

	@OriginalMember(owner = "client!rv", name = "db", descriptor = "[I")
	private final int[] anIntArray594 = new int[16];

	@OriginalMember(owner = "client!rv", name = "wb", descriptor = "[I")
	private final int[] anIntArray599 = new int[16];

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "[[Lclient!pg;")
	private final Class10_Sub35[][] aClass10_Sub35ArrayArray1 = new Class10_Sub35[16][128];

	@OriginalMember(owner = "client!rv", name = "S", descriptor = "[I")
	private final int[] anIntArray590 = new int[16];

	@OriginalMember(owner = "client!rv", name = "sb", descriptor = "[I")
	private final int[] anIntArray598 = new int[16];

	@OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
	private int anInt6105 = 256;

	@OriginalMember(owner = "client!rv", name = "V", descriptor = "[[Lclient!pg;")
	private final Class10_Sub35[][] aClass10_Sub35ArrayArray2 = new Class10_Sub35[16][128];

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "[I")
	private final int[] anIntArray587 = new int[16];

	@OriginalMember(owner = "client!rv", name = "zb", descriptor = "Lclient!jr;")
	private final Class134 aClass134_1 = new Class134();

	@OriginalMember(owner = "client!rv", name = "Cb", descriptor = "Lclient!oc;")
	private final Class10_Sub7_Sub3 aClass10_Sub7_Sub3_1 = new Class10_Sub7_Sub3(this);

	@OriginalMember(owner = "client!rv", name = "J", descriptor = "Lclient!mn;")
	private final Class167 aClass167_25 = new Class167(128);

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
	public Class10_Sub7_Sub4() {
		this.method4821();
		this.method4833(true);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!pg;)I")
	private int method4820(@OriginalArg(1) Class10_Sub35 arg0) {
		@Pc(14) int local14 = this.anIntArray590[arg0.anInt5340];
		return local14 < 8192 ? local14 * arg0.anInt5344 + 32 >> 6 : 16384 - ((16384 - local14) * (-arg0.anInt5344 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)V")
	private synchronized void method4821() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray587[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass134_1.method3172()) {
			@Pc(18) int local18 = this.aClass134_1.anInt4006 * this.anInt6103 / Static438.anInt7333;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong215;
				if (this.aLong216 - local27 >= 0L) {
					this.aLong215 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong216 - this.aLong215 - 1L) / (long) local18);
				this.aLong215 += (long) local18 * (long) local56;
				this.aClass10_Sub7_Sub3_1.method4813(arg0, arg1, local56);
				this.method4842();
				arg2 -= local56;
				arg1 += local56;
			} while (this.aClass134_1.method3172());
		}
		this.aClass10_Sub7_Sub3_1.method4813(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BZLclient!pg;)V")
	public void method4822(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class10_Sub35 arg1) {
		@Pc(8) int local8 = arg1.aClass10_Sub25_Sub1_2.aByteArray94.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass10_Sub25_Sub1_2.aBoolean498) {
			@Pc(38) int local38 = local8 + local8 - arg1.aClass10_Sub25_Sub1_2.anInt7556;
			local27 = (int) ((long) local38 * (long) this.anIntArray595[arg1.anInt5340] >> 6);
			local8 <<= 0x8;
			if (local27 >= local8) {
				local27 = local8 + local8 - local27 - 1;
				arg1.aClass10_Sub7_Sub1_4.method597();
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray595[arg1.anInt5340] >> 6);
		}
		arg1.aClass10_Sub7_Sub1_4.method600(local27);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V")
	private void method4823(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class10_Sub35 local16 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3620(); local16 != null; local16 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3621()) {
			if ((arg0 < 0 || local16.anInt5340 == arg0) && local16.anInt5347 < 0) {
				this.aClass10_Sub35ArrayArray1[local16.anInt5340][local16.anInt5342] = null;
				local16.anInt5347 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)V")
	private void method4824(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4824(local12);
			}
			return;
		}
		this.anIntArray596[arg0] = 12800;
		this.anIntArray590[arg0] = 8192;
		this.anIntArray584[arg0] = 16383;
		this.anIntArray589[arg0] = 8192;
		this.anIntArray597[arg0] = 0;
		this.anIntArray586[arg0] = 8192;
		this.method4825(arg0);
		this.method4834(arg0);
		this.anIntArray592[arg0] = 0;
		this.anIntArray585[arg0] = 32767;
		this.anIntArray598[arg0] = 256;
		this.anIntArray595[arg0] = 0;
		this.method4837(arg0, 8192);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(IB)V")
	private void method4825(@OriginalArg(0) int arg0) {
		if ((this.anIntArray592[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class10_Sub35 local22 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3620(); local22 != null; local22 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3621()) {
			if (arg0 == local22.anInt5340 && this.aClass10_Sub35ArrayArray1[arg0][local22.anInt5342] == null && local22.anInt5347 < 0) {
				local22.anInt5347 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZII)V")
	private void method4826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(ILclient!pg;)I")
	private int method4827(@OriginalArg(1) Class10_Sub35 arg0) {
		if (this.anIntArray587[arg0.anInt5340] == 0) {
			return 0;
		}
		@Pc(20) Class35 local20 = arg0.aClass35_1;
		@Pc(36) int local36 = this.anIntArray584[arg0.anInt5340] * this.anIntArray596[arg0.anInt5340] + 4096 >> 13;
		@Pc(44) int local44 = local36 * local36 + 16384 >> 15;
		@Pc(53) int local53 = arg0.anInt5354 * local44 + 16384 >> 15;
		@Pc(62) int local62 = this.anInt6105 * local53 + 128 >> 8;
		local36 = this.anIntArray587[arg0.anInt5340] * local62 + 128 >> 8;
		if (local20.anInt882 > 0) {
			local36 = (int) ((double) local36 * Math.pow(0.5D, (double) arg0.anInt5360 * 1.953125E-5D * (double) local20.anInt882) + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local20.aByteArray7 != null) {
			local101 = arg0.anInt5357;
			local109 = local20.aByteArray7[arg0.anInt5352 + 1];
			if (local20.aByteArray7.length - 2 > arg0.anInt5352) {
				local131 = (local20.aByteArray7[arg0.anInt5352] & 0xFF) << 8;
				local143 = (local20.aByteArray7[arg0.anInt5352 + 2] & 0xFF) << 8;
				local109 += (local101 - local131) * (-local109 + local20.aByteArray7[arg0.anInt5352 + 3]) / (local143 - local131);
			}
			local36 = local36 * local109 + 32 >> 6;
		}
		if (arg0.anInt5347 > 0 && local20.aByteArray8 != null) {
			local101 = arg0.anInt5347;
			local109 = local20.aByteArray8[arg0.anInt5348 + 1];
			if (arg0.anInt5348 < local20.aByteArray8.length - 2) {
				local131 = (local20.aByteArray8[arg0.anInt5348] & 0xFF) << 8;
				local143 = (local20.aByteArray8[arg0.anInt5348 + 2] & 0xFF) << 8;
				local109 += (local20.aByteArray8[arg0.anInt5348 + 3] - local109) * (-local131 + local101) / (local143 - local131);
			}
			local36 = local36 * local109 + 32 >> 6;
		}
		return local36;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZZLclient!ve;I)V")
	private synchronized void method4828(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class10_Sub43 arg2) {
		this.method4845(arg0);
		this.aClass134_1.method3183(arg2.aByteArray90);
		this.aLong215 = 0L;
		this.aBoolean395 = arg1;
		@Pc(34) int local34 = this.aClass134_1.method3176();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			this.aClass134_1.method3177(local36);
			this.aClass134_1.method3182(local36);
			this.aClass134_1.method3181(local36);
		}
		this.anInt6143 = this.aClass134_1.method3178();
		this.anInt6142 = this.aClass134_1.anIntArray398[this.anInt6143];
		this.aLong216 = this.aClass134_1.method3186(this.anInt6142);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III[ILclient!pg;)Z")
	public boolean method4829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class10_Sub35 arg3) {
		arg3.anInt5355 = Static438.anInt7333 / 100;
		if (arg3.anInt5347 >= 0 && (arg3.aClass10_Sub7_Sub1_4 == null || arg3.aClass10_Sub7_Sub1_4.method608())) {
			arg3.method4272();
			arg3.method6033();
			if (arg3.anInt5351 > 0 && arg3 == this.aClass10_Sub35ArrayArray2[arg3.anInt5340][arg3.anInt5351]) {
				this.aClass10_Sub35ArrayArray2[arg3.anInt5340][arg3.anInt5351] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg3.anInt5356;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray586[arg3.anInt5340] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg3.anInt5356 = local59;
		}
		arg3.aClass10_Sub7_Sub1_4.method614(this.method4851(arg3));
		@Pc(101) Class35 local101 = arg3.aClass35_1;
		arg3.anInt5359 += local101.anInt887;
		arg3.anInt5343++;
		@Pc(122) boolean local122 = false;
		@Pc(140) double local140 = (double) ((arg3.anInt5342 - 60 << 8) + (arg3.anInt5349 * arg3.anInt5356 >> 12)) * 5.086263020833333E-6D;
		if (local101.anInt882 > 0) {
			if (local101.anInt883 <= 0) {
				arg3.anInt5360 += 128;
			} else {
				arg3.anInt5360 += (int) (Math.pow(2.0D, local140 * (double) local101.anInt883) * 128.0D + 0.5D);
			}
			if (local101.anInt882 * arg3.anInt5360 >= 819200) {
				local122 = true;
			}
		}
		if (local101.aByteArray7 != null) {
			if (local101.anInt886 <= 0) {
				arg3.anInt5357 += 128;
			} else {
				arg3.anInt5357 += (int) (Math.pow(2.0D, local140 * (double) local101.anInt886) * 128.0D + 0.5D);
			}
			while (arg3.anInt5352 < local101.aByteArray7.length - 2 && (local101.aByteArray7[arg3.anInt5352 + 2] & 0xFF) << 8 < arg3.anInt5357) {
				arg3.anInt5352 += 2;
			}
			if (arg3.anInt5352 == local101.aByteArray7.length - 2 && local101.aByteArray7[arg3.anInt5352 + 1] == 0) {
				local122 = true;
			}
		}
		if (arg3.anInt5347 >= 0 && local101.aByteArray8 != null && (this.anIntArray592[arg3.anInt5340] & 0x1) == 0 && (arg3.anInt5351 < 0 || this.aClass10_Sub35ArrayArray2[arg3.anInt5340][arg3.anInt5351] != arg3)) {
			if (local101.anInt889 > 0) {
				arg3.anInt5347 += (int) (Math.pow(2.0D, (double) local101.anInt889 * local140) * 128.0D + 0.5D);
			} else {
				arg3.anInt5347 += 128;
			}
			while (arg3.anInt5348 < local101.aByteArray8.length - 2 && arg3.anInt5347 > (local101.aByteArray8[arg3.anInt5348 + 2] & 0xFF) << 8) {
				arg3.anInt5348 += 2;
			}
			if (arg3.anInt5348 == local101.aByteArray8.length - 2) {
				local122 = true;
			}
		}
		if (!local122) {
			arg3.aClass10_Sub7_Sub1_4.method620(arg3.anInt5355, this.method4827(arg3), this.method4820(arg3));
			return false;
		}
		arg3.aClass10_Sub7_Sub1_4.method612(arg3.anInt5355);
		if (arg2 == null) {
			arg3.aClass10_Sub7_Sub1_4.method4817(arg0);
		} else {
			arg3.aClass10_Sub7_Sub1_4.method4813(arg2, arg1, arg0);
		}
		if (arg3.aClass10_Sub7_Sub1_4.method594()) {
			this.aClass10_Sub7_Sub3_1.aClass10_Sub7_Sub2_3.method1844(arg3.aClass10_Sub7_Sub1_4);
		}
		arg3.method4272();
		if (arg3.anInt5347 >= 0) {
			arg3.method6033();
			if (arg3.anInt5351 > 0 && this.aClass10_Sub35ArrayArray2[arg3.anInt5340][arg3.anInt5351] == arg3) {
				this.aClass10_Sub35ArrayArray2[arg3.anInt5340][arg3.anInt5351] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "()Lclient!sc;")
	@Override
	public synchronized Class10_Sub7 method4818() {
		return this.aClass10_Sub7_Sub3_1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IBI)V")
	public synchronized void method4830() {
		this.method4838();
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(ILclient!pg;)Z")
	public boolean method4832(@OriginalArg(1) Class10_Sub35 arg0) {
		if (arg0.aClass10_Sub7_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt5347 >= 0) {
			arg0.method6033();
			if (arg0.anInt5351 > 0 && this.aClass10_Sub35ArrayArray2[arg0.anInt5340][arg0.anInt5351] == arg0) {
				this.aClass10_Sub35ArrayArray2[arg0.anInt5340][arg0.anInt5351] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(ZI)V")
	private void method4833(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4846(-1);
		} else {
			this.method4823(-1);
		}
		this.method4824(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray593[local29] = this.anIntArray599[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray594[local45] = this.anIntArray599[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V")
	private void method4834(@OriginalArg(1) int arg0) {
		if ((this.anIntArray592[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(30) Class10_Sub35 local30 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3620(); local30 != null; local30 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3621()) {
			if (arg0 == local30.anInt5340) {
				local30.anInt5358 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(IB)V")
	private void method4835(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4852(local24, local18, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method4847(local24, local18, local30);
			} else {
				this.method4852(local24, local18, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4826(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray594[local18] = (this.anIntArray594[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray594[local18] = (this.anIntArray594[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray597[local18] = (this.anIntArray597[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray597[local18] = (this.anIntArray597[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray586[local18] = (local30 << 7) + (this.anIntArray586[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray586[local18] = local30 + (this.anIntArray586[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray596[local18] = (this.anIntArray596[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray596[local18] = (this.anIntArray596[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray590[local18] = (local30 << 7) + (this.anIntArray590[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray590[local18] = (this.anIntArray590[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray584[local18] = (local30 << 7) + (this.anIntArray584[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray584[local18] = local30 + (this.anIntArray584[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray592[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray592[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method4825(local18);
					this.anIntArray592[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray592[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray585[local18] = (local30 << 7) + (this.anIntArray585[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray585[local18] = (this.anIntArray585[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray585[local18] = (this.anIntArray585[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray585[local18] = local30 + (this.anIntArray585[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method4846(local18);
			}
			if (local24 == 121) {
				this.method4824(local18);
			}
			if (local24 == 123) {
				this.method4823(local18);
			}
			@Pc(500) int local500;
			if (local24 == 6) {
				local500 = this.anIntArray585[local18];
				if (local500 == 16384) {
					this.anIntArray598[local18] = (local30 << 7) + (this.anIntArray598[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local500 = this.anIntArray585[local18];
				if (local500 == 16384) {
					this.anIntArray598[local18] = (this.anIntArray598[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray595[local18] = (local30 << 7) + (this.anIntArray595[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray595[local18] = local30 + (this.anIntArray595[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray592[local18] |= 0x4;
				} else {
					this.method4834(local18);
					this.anIntArray592[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method4837(local18, (local30 << 7) + (this.anIntArray588[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method4837(local18, (this.anIntArray588[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4844(local18, this.anIntArray594[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4848(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F47) >> 8);
			this.method4855(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4833(true);
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZLclient!ve;)V")
	public synchronized void method4836(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class10_Sub43 arg1) {
		this.method4828(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(III)V")
	private void method4837(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray588[arg0] = arg1;
		this.anIntArray591[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(IBI)V")
	private void method4838() {
		this.anIntArray599[9] = 128;
		this.anIntArray594[9] = 128;
		this.method4844(9, 128);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ph;Lclient!ve;IILclient!wo;)Z")
	public synchronized boolean method4839(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Class10_Sub43 arg1, @OriginalArg(4) Class269 arg2) {
		arg1.method5640();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class10_Sub9 local29 = (Class10_Sub9) arg1.aClass167_34.method3702(); local29 != null; local29 = (Class10_Sub9) arg1.aClass167_34.method3708()) {
			@Pc(35) int local35 = (int) local29.aLong264;
			@Pc(43) Class10_Sub15 local43 = (Class10_Sub15) this.aClass167_25.method3709((long) local35);
			if (local43 == null) {
				local43 = Static339.method4546(local35, arg0);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass167_25.method3705(local43, (long) local35);
			}
			if (!local43.method1790(arg2, local23, local29.aByteArray9)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method5641();
		}
		return local9;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)Z")
	public synchronized boolean method4840() {
		return this.aClass134_1.method3172();
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4819() {
		return 0;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "()Lclient!sc;")
	@Override
	public synchronized Class10_Sub7 method4816() {
		return null;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)V")
	private void method4842() {
		@Pc(8) int local8 = this.anInt6143;
		@Pc(11) int local11 = this.anInt6142;
		@Pc(14) long local14 = this.aLong216;
		if (this.aClass10_Sub43_2 != null && local11 == this.anInt6144) {
			this.method4828(this.aBoolean396, this.aBoolean395, this.aClass10_Sub43_2);
			this.method4842();
			return;
		}
		while (this.anInt6142 == local11) {
			while (this.aClass134_1.anIntArray398[local8] == local11) {
				this.aClass134_1.method3177(local8);
				@Pc(49) int local49 = this.aClass134_1.method3184(local8);
				if (local49 == 1) {
					this.aClass134_1.method3173();
					this.aClass134_1.method3181(local8);
					if (this.aClass134_1.method3187()) {
						if (this.aClass10_Sub43_2 != null) {
							this.method4836(this.aBoolean395, this.aClass10_Sub43_2);
							this.method4842();
							return;
						}
						if (!this.aBoolean395 || local11 == 0) {
							this.method4833(true);
							this.aClass134_1.method3175();
							return;
						}
						this.aClass134_1.method3174(local14);
					}
					break;
				}
				if ((local49 & 0x80) != 0) {
					this.method4835(local49);
				}
				this.aClass134_1.method3182(local8);
				this.aClass134_1.method3181(local8);
			}
			local8 = this.aClass134_1.method3178();
			local11 = this.aClass134_1.anIntArray398[local8];
			local14 = this.aClass134_1.method3186(local11);
		}
		this.aLong216 = local14;
		this.anInt6142 = local11;
		this.anInt6143 = local8;
		if (this.aClass10_Sub43_2 != null && local11 > this.anInt6144) {
			this.anInt6143 = -1;
			this.anInt6142 = this.anInt6144;
			this.aLong216 = this.aClass134_1.method3186(this.anInt6142);
		}
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(B)V")
	public synchronized void method4843() {
		for (@Pc(15) Class10_Sub15 local15 = (Class10_Sub15) this.aClass167_25.method3702(); local15 != null; local15 = (Class10_Sub15) this.aClass167_25.method3708()) {
			local15.method6033();
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(III)V")
	private void method4844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray593[arg0]) {
			this.anIntArray593[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass10_Sub35ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(ZI)V")
	private synchronized void method4845(@OriginalArg(0) boolean arg0) {
		this.aClass134_1.method3175();
		this.aClass10_Sub43_2 = null;
		this.method4833(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(II)V")
	private void method4846(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class10_Sub35 local14 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3620(); local14 != null; local14 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3621()) {
			if (arg0 < 0 || local14.anInt5340 == arg0) {
				if (local14.aClass10_Sub7_Sub1_4 != null) {
					local14.aClass10_Sub7_Sub1_4.method612(Static438.anInt7333 / 100);
					if (local14.aClass10_Sub7_Sub1_4.method594()) {
						this.aClass10_Sub7_Sub3_1.aClass10_Sub7_Sub2_3.method1844(local14.aClass10_Sub7_Sub1_4);
					}
					local14.method4272();
				}
				if (local14.anInt5347 < 0) {
					this.aClass10_Sub35ArrayArray1[local14.anInt5340][local14.anInt5342] = null;
				}
				local14.method6033();
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BIII)V")
	private void method4847(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4852(arg0, arg1, 64);
		if ((this.anIntArray592[arg1] & 0x2) != 0) {
			for (@Pc(28) Class10_Sub35 local28 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3612(); local28 != null; local28 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3624()) {
				if (local28.anInt5340 == arg1 && local28.anInt5347 < 0) {
					this.aClass10_Sub35ArrayArray1[arg1][local28.anInt5342] = null;
					this.aClass10_Sub35ArrayArray1[arg1][arg0] = local28;
					@Pc(67) int local67 = local28.anInt5353 + (local28.anInt5356 * local28.anInt5349 >> 12);
					local28.anInt5353 += arg0 - local28.anInt5342 << 8;
					local28.anInt5356 = 4096;
					local28.anInt5342 = arg0;
					local28.anInt5349 = local67 - local28.anInt5353;
					return;
				}
			}
		}
		@Pc(114) Class10_Sub15 local114 = (Class10_Sub15) this.aClass167_25.method3709((long) this.anIntArray593[arg1]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class10_Sub25_Sub1 local122 = local114.aClass10_Sub25_Sub1Array1[arg0];
		if (local122 == null) {
			return;
		}
		@Pc(135) Class10_Sub35 local135 = new Class10_Sub35();
		local135.aClass10_Sub15_1 = local114;
		local135.anInt5340 = arg1;
		local135.aClass10_Sub25_Sub1_2 = local122;
		local135.aClass35_1 = local114.aClass35Array1[arg0];
		local135.anInt5351 = local114.aByteArray19[arg0];
		local135.anInt5342 = arg0;
		local135.anInt5354 = local114.anInt2080 * arg2 * arg2 * local114.aByteArray18[arg0] + 1024 >> 11;
		local135.anInt5344 = local114.aByteArray17[arg0] & 0xFF;
		local135.anInt5353 = (arg0 << 8) - (local114.aShortArray17[arg0] & 0x7FFF);
		local135.anInt5357 = 0;
		local135.anInt5347 = -1;
		local135.anInt5360 = 0;
		local135.anInt5348 = 0;
		local135.anInt5352 = 0;
		if (this.anIntArray595[arg1] == 0) {
			local135.aClass10_Sub7_Sub1_4 = Static462.method591(local122, this.method4851(local135), this.method4827(local135), this.method4820(local135));
		} else {
			local135.aClass10_Sub7_Sub1_4 = Static462.method591(local122, this.method4851(local135), 0, this.method4820(local135));
			this.method4822(local114.aShortArray17[arg0] < 0, local135);
		}
		if (local114.aShortArray17[arg0] < 0) {
			local135.aClass10_Sub7_Sub1_4.method623(-1);
		}
		if (local135.anInt5351 >= 0) {
			@Pc(285) Class10_Sub35 local285 = this.aClass10_Sub35ArrayArray2[arg1][local135.anInt5351];
			if (local285 != null && local285.anInt5347 < 0) {
				this.aClass10_Sub35ArrayArray1[arg1][local285.anInt5342] = null;
				local285.anInt5347 = 0;
			}
			this.aClass10_Sub35ArrayArray2[arg1][local135.anInt5351] = local135;
		}
		this.aClass10_Sub7_Sub3_1.aClass163_32.method3613(local135);
		this.aClass10_Sub35ArrayArray1[arg1][arg0] = local135;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4817(@OriginalArg(0) int arg0) {
		if (this.aClass134_1.method3172()) {
			@Pc(18) int local18 = this.anInt6103 * this.aClass134_1.anInt4006 / Static438.anInt7333;
			do {
				@Pc(28) long local28 = this.aLong215 + (long) local18 * (long) arg0;
				if (this.aLong216 - local28 >= 0L) {
					this.aLong215 = local28;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong216 + (long) local18 - this.aLong215 - 1L) / (long) local18);
				this.aLong215 += (long) local56 * (long) local18;
				this.aClass10_Sub7_Sub3_1.method4817(local56);
				arg0 -= local56;
				this.method4842();
			} while (this.aClass134_1.method3172());
		}
		this.aClass10_Sub7_Sub3_1.method4817(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(III)V")
	private void method4848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(II)V")
	public synchronized void method4849(@OriginalArg(1) int arg0) {
		this.anInt6105 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!pg;I)I")
	private int method4851(@OriginalArg(0) Class10_Sub35 arg0) {
		@Pc(14) int local14 = arg0.anInt5353 + (arg0.anInt5356 * arg0.anInt5349 >> 12);
		local14 += (this.anIntArray589[arg0.anInt5340] - 8192) * this.anIntArray598[arg0.anInt5340] >> 12;
		@Pc(35) Class35 local35 = arg0.aClass35_1;
		@Pc(58) int local58;
		if (local35.anInt887 > 0 && (local35.anInt885 > 0 || this.anIntArray597[arg0.anInt5340] > 0)) {
			local58 = local35.anInt885 << 2;
			@Pc(63) int local63 = local35.anInt884 << 1;
			if (arg0.anInt5343 < local63) {
				local58 = local58 * arg0.anInt5343 / local63;
			}
			local58 += this.anIntArray597[arg0.anInt5340] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt5359 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local93 * (double) local58);
		}
		local58 = (int) ((double) (arg0.aClass10_Sub25_Sub1_2.anInt7555 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static438.anInt7333 + 0.5D);
		return local58 < 1 ? 1 : local58;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(BIII)V")
	private void method4852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class10_Sub35 local12 = this.aClass10_Sub35ArrayArray1[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass10_Sub35ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray592[arg1] & 0x2) == 0) {
			local12.anInt5347 = 0;
			return;
		}
		for (@Pc(42) Class10_Sub35 local42 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3620(); local42 != null; local42 = (Class10_Sub35) this.aClass10_Sub7_Sub3_1.aClass163_32.method3621()) {
			if (local42.anInt5340 == local12.anInt5340 && local42.anInt5347 < 0 && local42 != local12) {
				local12.anInt5347 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)V")
	public synchronized void method4853() {
		this.method4845(true);
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(Z)I")
	public int method4854() {
		return this.anInt6105;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(III)V")
	private void method4855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray589[arg0] = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(B)V")
	public synchronized void method4856() {
		for (@Pc(7) Class10_Sub15 local7 = (Class10_Sub15) this.aClass167_25.method3702(); local7 != null; local7 = (Class10_Sub15) this.aClass167_25.method3708()) {
			local7.method1794();
		}
	}
}
