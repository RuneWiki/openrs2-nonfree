import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!df", name = "Pb", descriptor = "I")
	private int anInt1333;

	@OriginalMember(owner = "client!df", name = "Qb", descriptor = "I")
	private int anInt1334;

	@OriginalMember(owner = "client!df", name = "Sb", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!df", name = "Tb", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!df", name = "Ub", descriptor = "Z")
	private boolean aBoolean76;

	@OriginalMember(owner = "client!df", name = "Vb", descriptor = "I")
	private int anInt1335;

	@OriginalMember(owner = "client!df", name = "Wb", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!df", name = "Xb", descriptor = "Lclient!si;")
	private Class1_Sub31 aClass1_Sub31_1;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "I")
	private int anInt1290 = 256;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "[I")
	public int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!df", name = "fb", descriptor = "[I")
	private int[] anIntArray128 = new int[16];

	@OriginalMember(owner = "client!df", name = "w", descriptor = "[[Lclient!oj;")
	private Class1_Sub25[][] aClass1_Sub25ArrayArray1 = new Class1_Sub25[16][128];

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "[I")
	private int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!df", name = "db", descriptor = "[I")
	private int[] anIntArray127 = new int[16];

	@OriginalMember(owner = "client!df", name = "C", descriptor = "[I")
	private int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!df", name = "ob", descriptor = "[I")
	private int[] anIntArray130 = new int[16];

	@OriginalMember(owner = "client!df", name = "z", descriptor = "[I")
	public int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!df", name = "sb", descriptor = "[I")
	private int[] anIntArray131 = new int[16];

	@OriginalMember(owner = "client!df", name = "lb", descriptor = "I")
	private int anInt1314 = 1000000;

	@OriginalMember(owner = "client!df", name = "Ib", descriptor = "[I")
	private int[] anIntArray135 = new int[16];

	@OriginalMember(owner = "client!df", name = "tb", descriptor = "[I")
	public int[] anIntArray132 = new int[16];

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "[I")
	private int[] anIntArray129 = new int[16];

	@OriginalMember(owner = "client!df", name = "ab", descriptor = "[I")
	private int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!df", name = "Eb", descriptor = "[I")
	private int[] anIntArray134 = new int[16];

	@OriginalMember(owner = "client!df", name = "yb", descriptor = "[[Lclient!oj;")
	private Class1_Sub25[][] aClass1_Sub25ArrayArray2 = new Class1_Sub25[16][128];

	@OriginalMember(owner = "client!df", name = "ub", descriptor = "[I")
	private int[] anIntArray133 = new int[16];

	@OriginalMember(owner = "client!df", name = "R", descriptor = "[I")
	private int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!df", name = "Ob", descriptor = "[I")
	private int[] anIntArray137 = new int[16];

	@OriginalMember(owner = "client!df", name = "qb", descriptor = "Lclient!eg;")
	private Class46 aClass46_1 = new Class46();

	@OriginalMember(owner = "client!df", name = "Rb", descriptor = "Lclient!kc;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1 = new Class1_Sub3_Sub3(this);

	@OriginalMember(owner = "client!df", name = "wb", descriptor = "Lclient!ol;")
	private Class117 aClass117_2 = new Class117(128);

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		this.method996();
		this.method998(true);
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)I")
	public int method976() {
		return this.anInt1290;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!oj;I[I)Z")
	public boolean method977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub25 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt4264 = Static43.anInt1255 / 100;
		if (arg2.anInt4277 >= 0 && (arg2.aClass1_Sub3_Sub4_3 == null || arg2.aClass1_Sub3_Sub4_3.method2556())) {
			arg2.method3417();
			arg2.method4742();
			if (arg2.anInt4282 > 0 && this.aClass1_Sub25ArrayArray1[arg2.anInt4268][arg2.anInt4282] == arg2) {
				this.aClass1_Sub25ArrayArray1[arg2.anInt4268][arg2.anInt4282] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg2.anInt4271;
		@Pc(61) boolean local61 = false;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray129[arg2.anInt4268] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg2.anInt4271 = local59;
		}
		arg2.aClass1_Sub3_Sub4_3.method2563(this.method981(arg2));
		@Pc(102) Class127 local102 = arg2.aClass127_1;
		arg2.anInt4274++;
		@Pc(126) double local126 = (double) ((arg2.anInt4271 * arg2.anInt4265 >> 12) + (arg2.anInt4276 - 60 << 8)) * 5.086263020833333E-6D;
		arg2.anInt4279 += local102.anInt4644;
		if (local102.anInt4639 > 0) {
			if (local102.anInt4641 > 0) {
				arg2.anInt4278 += (int) (Math.pow(2.0D, local126 * (double) local102.anInt4641) * 128.0D + 0.5D);
			} else {
				arg2.anInt4278 += 128;
			}
			if (local102.anInt4639 * arg2.anInt4278 >= 819200) {
				local61 = true;
			}
		}
		if (local102.aByteArray64 != null) {
			if (local102.anInt4638 <= 0) {
				arg2.anInt4275 += 128;
			} else {
				arg2.anInt4275 += (int) (Math.pow(2.0D, (double) local102.anInt4638 * local126) * 128.0D + 0.5D);
			}
			while (local102.aByteArray64.length - 2 > arg2.anInt4267 && arg2.anInt4275 > (local102.aByteArray64[arg2.anInt4267 + 2] & 0xFF) << 8) {
				arg2.anInt4267 += 2;
			}
			if (arg2.anInt4267 == local102.aByteArray64.length - 2 && local102.aByteArray64[arg2.anInt4267 + 1] == 0) {
				local61 = true;
			}
		}
		if (arg2.anInt4277 >= 0 && local102.aByteArray63 != null && (this.anIntArray132[arg2.anInt4268] & 0x1) == 0 && (arg2.anInt4282 < 0 || this.aClass1_Sub25ArrayArray1[arg2.anInt4268][arg2.anInt4282] != arg2)) {
			if (local102.anInt4637 > 0) {
				arg2.anInt4277 += (int) (Math.pow(2.0D, local126 * (double) local102.anInt4637) * 128.0D + 0.5D);
			} else {
				arg2.anInt4277 += 128;
			}
			while (local102.aByteArray63.length - 2 > arg2.anInt4281 && (local102.aByteArray63[arg2.anInt4281 + 2] & 0xFF) << 8 < arg2.anInt4277) {
				arg2.anInt4281 += 2;
			}
			if (arg2.anInt4281 == local102.aByteArray63.length - 2) {
				local61 = true;
			}
		}
		if (!local61) {
			arg2.aClass1_Sub3_Sub4_3.method2573(arg2.anInt4264, this.method988(arg2), this.method989(arg2));
			return false;
		}
		arg2.aClass1_Sub3_Sub4_3.method2547(arg2.anInt4264);
		if (arg3 == null) {
			arg2.aClass1_Sub3_Sub4_3.method2539(arg1);
		} else {
			arg2.aClass1_Sub3_Sub4_3.method2540(arg3, arg0, arg1);
		}
		if (arg2.aClass1_Sub3_Sub4_3.method2579()) {
			this.aClass1_Sub3_Sub3_1.aClass1_Sub3_Sub1_1.method522(arg2.aClass1_Sub3_Sub4_3);
		}
		arg2.method3417();
		if (arg2.anInt4277 >= 0) {
			arg2.method4742();
			if (arg2.anInt4282 > 0 && arg2 == this.aClass1_Sub25ArrayArray1[arg2.anInt4268][arg2.anInt4282]) {
				this.aClass1_Sub25ArrayArray1[arg2.anInt4268][arg2.anInt4282] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BZLclient!oj;)V")
	public void method978(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub25 arg1) {
		@Pc(4) int local4 = arg1.aClass1_Sub4_Sub1_1.aByteArray65.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass1_Sub4_Sub1_1.aBoolean266) {
			@Pc(44) int local44 = local4 + local4 - arg1.aClass1_Sub4_Sub1_1.anInt4841;
			local33 = (int) ((long) local44 * (long) this.anIntArray122[arg1.anInt4268] >> 6);
			local4 <<= 0x8;
			if (local4 <= local33) {
				arg1.aClass1_Sub3_Sub4_3.method2568();
				local33 = local4 + local4 - local33 - 1;
			}
		} else {
			local33 = (int) ((long) local4 * (long) this.anIntArray122[arg1.anInt4268] >> 6);
		}
		arg1.aClass1_Sub3_Sub4_3.method2580(local33);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZLclient!si;)V")
	public synchronized void method979(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub31 arg1) {
		this.method1001(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
	private void method980(@OriginalArg(1) int arg0) {
		if ((this.anIntArray132[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub25 local19 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3791(); local19 != null; local19 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3792()) {
			if (arg0 == local19.anInt4268 && this.aClass1_Sub25ArrayArray2[arg0][local19.anInt4276] == null && local19.anInt4277 < 0) {
				local19.anInt4277 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!oj;I)I")
	private int method981(@OriginalArg(0) Class1_Sub25 arg0) {
		@Pc(10) int local10 = (arg0.anInt4271 * arg0.anInt4265 >> 12) + arg0.anInt4284;
		local10 += this.anIntArray134[arg0.anInt4268] * (this.anIntArray124[arg0.anInt4268] - 8192) >> 12;
		@Pc(31) Class127 local31 = arg0.aClass127_1;
		@Pc(62) int local62;
		if (local31.anInt4644 > 0 && (local31.anInt4645 > 0 || this.anIntArray123[arg0.anInt4268] > 0)) {
			@Pc(57) int local57 = local31.anInt4642 << 1;
			local62 = local31.anInt4645 << 2;
			if (local57 > arg0.anInt4274) {
				local62 = arg0.anInt4274 * local62 / local57;
			}
			local62 += this.anIntArray123[arg0.anInt4268] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt4279 & 0x1FF) * 0.01227184630308513D);
			local10 += (int) ((double) local62 * local96);
		}
		local62 = (int) ((double) (arg0.aClass1_Sub4_Sub1_1.anInt4839 * 256) * Math.pow(2.0D, (double) local10 * 3.255208333333333E-4D) / (double) Static43.anInt1255 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)V")
	private void method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray124[arg1] = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)V")
	private void method984(@OriginalArg(0) int arg0) {
		if ((this.anIntArray132[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub25 local19 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3791(); local19 != null; local19 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3792()) {
			if (local19.anInt4268 == arg0) {
				local19.anInt4285 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()Lclient!ba;")
	@Override
	public synchronized Class1_Sub3 method2542() {
		return null;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(II)V")
	public synchronized void method985(@OriginalArg(0) int arg0) {
		this.anInt1290 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIII)V")
	private void method986(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub25 local12 = this.aClass1_Sub25ArrayArray2[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub25ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray132[arg2] & 0x2) == 0) {
			local12.anInt4277 = 0;
			return;
		}
		for (@Pc(47) Class1_Sub25 local47 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3791(); local47 != null; local47 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3792()) {
			if (local12.anInt4268 == local47.anInt4268 && local47.anInt4277 < 0 && local47 != local12) {
				local12.anInt4277 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public synchronized void method987() {
		this.method1011(true);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!oj;)I")
	private int method988(@OriginalArg(1) Class1_Sub25 arg0) {
		if (this.anIntArray128[arg0.anInt4268] == 0) {
			return 0;
		}
		@Pc(28) int local28 = this.anIntArray131[arg0.anInt4268] * this.anIntArray133[arg0.anInt4268] + 4096 >> 13;
		@Pc(36) int local36 = local28 * local28 + 16384 >> 15;
		@Pc(39) Class127 local39 = arg0.aClass127_1;
		@Pc(48) int local48 = local36 * arg0.anInt4270 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt1290 * local48 + 128 >> 8;
		local28 = this.anIntArray128[arg0.anInt4268] * local64 + 128 >> 8;
		if (local39.anInt4639 > 0) {
			local28 = (int) ((double) local28 * Math.pow(0.5D, (double) local39.anInt4639 * 1.953125E-5D * (double) arg0.anInt4278) + 0.5D);
		}
		@Pc(111) int local111;
		@Pc(108) int local108;
		@Pc(129) int local129;
		@Pc(141) int local141;
		if (local39.aByteArray64 != null) {
			local108 = local39.aByteArray64[arg0.anInt4267 + 1];
			local111 = arg0.anInt4275;
			if (arg0.anInt4267 < local39.aByteArray64.length - 2) {
				local129 = (local39.aByteArray64[arg0.anInt4267] & 0xFF) << 8;
				local141 = (local39.aByteArray64[arg0.anInt4267 + 2] & 0xFF) << 8;
				local108 += (local39.aByteArray64[arg0.anInt4267 + 3] - local108) * (local111 + -local129) / (local141 - local129);
			}
			local28 = local28 * local108 + 32 >> 6;
		}
		if (arg0.anInt4277 > 0 && local39.aByteArray63 != null) {
			local111 = arg0.anInt4277;
			local108 = local39.aByteArray63[arg0.anInt4281 + 1];
			if (arg0.anInt4281 < local39.aByteArray63.length - 2) {
				local129 = (local39.aByteArray63[arg0.anInt4281] & 0xFF) << 8;
				local141 = (local39.aByteArray63[arg0.anInt4281 + 2] & 0xFF) << 8;
				local108 += (local39.aByteArray63[arg0.anInt4281 + 3] - local108) * (local111 - local129) / (local141 - local129);
			}
			local28 = local108 * local28 + 32 >> 6;
		}
		return local28;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!oj;B)I")
	private int method989(@OriginalArg(0) Class1_Sub25 arg0) {
		@Pc(15) int local15 = this.anIntArray135[arg0.anInt4268];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt4273) * (16384 - local15) + 32 >> 6) : local15 * arg0.anInt4273 + 32 >> 6;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!oj;)Z")
	public boolean method991(@OriginalArg(1) Class1_Sub25 arg0) {
		if (arg0.aClass1_Sub3_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt4277 >= 0) {
			arg0.method4742();
			if (arg0.anInt4282 > 0 && this.aClass1_Sub25ArrayArray1[arg0.anInt4268][arg0.anInt4282] == arg0) {
				this.aClass1_Sub25ArrayArray1[arg0.anInt4268][arg0.anInt4282] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(IIII)V")
	private void method992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
	private void method993() {
		@Pc(8) int local8 = this.anInt1334;
		@Pc(11) long local11 = this.aLong48;
		@Pc(14) int local14 = this.anInt1333;
		if (this.aClass1_Sub31_1 != null && local14 == this.anInt1335) {
			this.method1001(this.aClass1_Sub31_1, this.aBoolean77, this.aBoolean76);
			this.method993();
			return;
		}
		while (this.anInt1333 == local14) {
			while (local14 == this.aClass46_1.anIntArray162[local8]) {
				this.aClass46_1.method1166(local8);
				@Pc(59) int local59 = this.aClass46_1.method1174(local8);
				if (local59 == 1) {
					this.aClass46_1.method1172();
					this.aClass46_1.method1173(local8);
					if (this.aClass46_1.method1175()) {
						if (this.aClass1_Sub31_1 != null) {
							this.method979(this.aBoolean76, this.aClass1_Sub31_1);
							this.method993();
							return;
						}
						if (!this.aBoolean76 || local14 == 0) {
							this.method998(true);
							this.aClass46_1.method1165();
							return;
						}
						this.aClass46_1.method1164(local11);
					}
					break;
				}
				if ((local59 & 0x80) != 0) {
					this.method994(local59);
				}
				this.aClass46_1.method1176(local8);
				this.aClass46_1.method1173(local8);
			}
			local8 = this.aClass46_1.method1170();
			local14 = this.aClass46_1.anIntArray162[local8];
			local11 = this.aClass46_1.method1171(local14);
		}
		this.anInt1334 = local8;
		this.aLong48 = local11;
		this.anInt1333 = local14;
		if (this.aClass1_Sub31_1 != null && local14 > this.anInt1335) {
			this.anInt1334 = -1;
			this.anInt1333 = this.anInt1335;
			this.aLong48 = this.aClass46_1.method1171(this.anInt1333);
		}
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(II)V")
	private void method994(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (local9 == 128) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			local31 = arg0 >> 16 & 0x7F;
			this.method986(local25, local31, local19);
		} else if (local9 == 144) {
			local31 = arg0 >> 16 & 0x7F;
			local25 = arg0 >> 8 & 0x7F;
			local19 = arg0 & 0xF;
			if (local31 <= 0) {
				this.method986(local25, 64, local19);
			} else {
				this.method1008(local31, local19, local25);
			}
		} else if (local9 == 160) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			local31 = arg0 >> 16 & 0x7F;
			this.method992(local25, local31, local19);
		} else if (local9 == 176) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			local31 = arg0 >> 16 & 0x7F;
			if (local25 == 0) {
				this.anIntArray137[local19] = (local31 << 14) + (this.anIntArray137[local19] & 0xFFE03FFF);
			}
			if (local25 == 32) {
				this.anIntArray137[local19] = (this.anIntArray137[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 1) {
				this.anIntArray123[local19] = (local31 << 7) + (this.anIntArray123[local19] & 0xFFFFC07F);
			}
			if (local25 == 33) {
				this.anIntArray123[local19] = (this.anIntArray123[local19] & 0xFFFFFF80) + local31;
			}
			if (local25 == 5) {
				this.anIntArray129[local19] = (this.anIntArray129[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 37) {
				this.anIntArray129[local19] = local31 + (this.anIntArray129[local19] & 0xFFFFFF80);
			}
			if (local25 == 7) {
				this.anIntArray131[local19] = (this.anIntArray131[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 39) {
				this.anIntArray131[local19] = local31 + (this.anIntArray131[local19] & 0xFFFFFF80);
			}
			if (local25 == 10) {
				this.anIntArray135[local19] = (this.anIntArray135[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 42) {
				this.anIntArray135[local19] = (this.anIntArray135[local19] & 0xFFFFFF80) + local31;
			}
			if (local25 == 11) {
				this.anIntArray133[local19] = (this.anIntArray133[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 43) {
				this.anIntArray133[local19] = (this.anIntArray133[local19] & 0xFFFFFF80) + local31;
			}
			if (local25 == 64) {
				if (local31 >= 64) {
					this.anIntArray132[local19] |= 0x1;
				} else {
					this.anIntArray132[local19] &= 0xFFFFFFFE;
				}
			}
			if (local25 == 65) {
				if (local31 >= 64) {
					this.anIntArray132[local19] |= 0x2;
				} else {
					this.method980(local19);
					this.anIntArray132[local19] &= 0xFFFFFFFD;
				}
			}
			if (local25 == 99) {
				this.anIntArray126[local19] = (local31 << 7) + (this.anIntArray126[local19] & 0x7F);
			}
			if (local25 == 98) {
				this.anIntArray126[local19] = (this.anIntArray126[local19] & 0x3F80) + local31;
			}
			if (local25 == 101) {
				this.anIntArray126[local19] = (local31 << 7) + (this.anIntArray126[local19] & 0x7F) + 16384;
			}
			if (local25 == 100) {
				this.anIntArray126[local19] = (this.anIntArray126[local19] & 0x3F80) + local31 + 16384;
			}
			if (local25 == 120) {
				this.method1000(local19);
			}
			if (local25 == 121) {
				this.method995(local19);
			}
			if (local25 == 123) {
				this.method1003(local19);
			}
			@Pc(517) int local517;
			if (local25 == 6) {
				local517 = this.anIntArray126[local19];
				if (local517 == 16384) {
					this.anIntArray134[local19] = (this.anIntArray134[local19] & 0xFFFFC07F) + (local31 << 7);
				}
			}
			if (local25 == 38) {
				local517 = this.anIntArray126[local19];
				if (local517 == 16384) {
					this.anIntArray134[local19] = local31 + (this.anIntArray134[local19] & 0xFFFFFF80);
				}
			}
			if (local25 == 16) {
				this.anIntArray122[local19] = (local31 << 7) + (this.anIntArray122[local19] & 0xFFFFC07F);
			}
			if (local25 == 48) {
				this.anIntArray122[local19] = local31 + (this.anIntArray122[local19] & 0xFFFFFF80);
			}
			if (local25 == 81) {
				if (local31 < 64) {
					this.method984(local19);
					this.anIntArray132[local19] &= 0xFFFFFFFB;
				} else {
					this.anIntArray132[local19] |= 0x4;
				}
			}
			if (local25 == 17) {
				this.method1009((this.anIntArray125[local19] & 0xFFFFC07F) + (local31 << 7), local19);
			}
			if (local25 == 49) {
				this.method1009((this.anIntArray125[local19] & 0xFFFFFF80) + local31, local19);
			}
		} else if (local9 == 192) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			this.method999(local19, local25 + this.anIntArray137[local19]);
		} else if (local9 == 208) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			this.method1004(local19, local25);
		} else if (local9 == 224) {
			local25 = arg0 & 0xF;
			local31 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0023) >> 9);
			this.method983(local31, local25);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method998(true);
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(II)V")
	private void method995(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.method995(local13);
			}
			return;
		}
		this.anIntArray131[arg0] = 12800;
		this.anIntArray135[arg0] = 8192;
		this.anIntArray133[arg0] = 16383;
		this.anIntArray124[arg0] = 8192;
		this.anIntArray123[arg0] = 0;
		this.anIntArray129[arg0] = 8192;
		this.method980(arg0);
		this.method984(arg0);
		this.anIntArray132[arg0] = 0;
		this.anIntArray126[arg0] = 32767;
		this.anIntArray134[arg0] = 256;
		this.anIntArray122[arg0] = 0;
		this.method1009(8192, arg0);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIB)V")
	private synchronized void method996() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray128[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method997() {
		return this.aClass46_1.method1163();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
	private void method998(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1000(-1);
		} else {
			this.method1003(-1);
		}
		this.method995(-1);
		@Pc(23) int local23;
		for (local23 = 0; local23 < 16; local23++) {
			this.anIntArray130[local23] = this.anIntArray127[local23];
		}
		for (local23 = 0; local23 < 16; local23++) {
			this.anIntArray137[local23] = this.anIntArray127[local23] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	private void method999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray130[arg0] != arg1) {
			this.anIntArray130[arg0] = arg1;
			for (@Pc(15) int local15 = 0; local15 < 128; local15++) {
				this.aClass1_Sub25ArrayArray1[arg0][local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass46_1.method1163()) {
			@Pc(15) int local15 = this.anInt1314 * this.aClass46_1.anInt1540 / Static43.anInt1255;
			do {
				@Pc(25) long local25 = this.aLong49 + (long) arg2 * (long) local15;
				if (this.aLong48 - local25 >= 0L) {
					this.aLong49 = local25;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong48 + (long) local15 - this.aLong49 - 1L) / (long) local15);
				this.aLong49 += (long) local56 * (long) local15;
				arg2 -= local56;
				this.aClass1_Sub3_Sub3_1.method2540(arg0, arg1, local56);
				arg1 += local56;
				this.method993();
			} while (this.aClass46_1.method1163());
		}
		this.aClass1_Sub3_Sub3_1.method2540(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(II)V")
	private void method1000(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub25 local8 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3791(); local8 != null; local8 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3792()) {
			if (arg0 < 0 || local8.anInt4268 == arg0) {
				if (local8.aClass1_Sub3_Sub4_3 != null) {
					local8.aClass1_Sub3_Sub4_3.method2547(Static43.anInt1255 / 100);
					if (local8.aClass1_Sub3_Sub4_3.method2579()) {
						this.aClass1_Sub3_Sub3_1.aClass1_Sub3_Sub1_1.method522(local8.aClass1_Sub3_Sub4_3);
					}
					local8.method3417();
				}
				if (local8.anInt4277 < 0) {
					this.aClass1_Sub25ArrayArray2[local8.anInt4268][local8.anInt4276] = null;
				}
				local8.method4742();
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()Lclient!ba;")
	@Override
	public synchronized Class1_Sub3 method2543() {
		return this.aClass1_Sub3_Sub3_1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!si;ZZ)V")
	private synchronized void method1001(@OriginalArg(1) Class1_Sub31 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method1011(arg1);
		this.aClass46_1.method1177(arg0.aByteArray71);
		this.aLong49 = 0L;
		this.aBoolean76 = arg2;
		@Pc(24) int local24 = this.aClass46_1.method1178();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass46_1.method1166(local26);
			this.aClass46_1.method1176(local26);
			this.aClass46_1.method1173(local26);
		}
		this.anInt1334 = this.aClass46_1.method1170();
		this.anInt1333 = this.aClass46_1.anIntArray162[this.anInt1334];
		this.aLong48 = this.aClass46_1.method1171(this.anInt1333);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IZ)V")
	private void method1003(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub25 local12 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3791(); local12 != null; local12 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3792()) {
			if ((arg0 < 0 || local12.anInt4268 == arg0) && local12.anInt4277 < 0) {
				this.aClass1_Sub25ArrayArray2[local12.anInt4268][local12.anInt4276] = null;
				local12.anInt4277 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
	private void method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	public synchronized void method1006() {
		for (@Pc(15) Class1_Sub17 local15 = (Class1_Sub17) this.aClass117_2.method3441(); local15 != null; local15 = (Class1_Sub17) this.aClass117_2.method3444()) {
			local15.method2137();
		}
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public synchronized void method1007() {
		for (@Pc(11) Class1_Sub17 local11 = (Class1_Sub17) this.aClass117_2.method3441(); local11 != null; local11 = (Class1_Sub17) this.aClass117_2.method3444()) {
			local11.method4742();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()I")
	@Override
	public synchronized int method2541() {
		return 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZIII)V")
	private void method1008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method986(arg2, 64, arg1);
		if ((this.anIntArray132[arg1] & 0x2) != 0) {
			for (@Pc(32) Class1_Sub25 local32 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3786(); local32 != null; local32 = (Class1_Sub25) this.aClass1_Sub3_Sub3_1.aClass131_9.method3785()) {
				if (local32.anInt4268 == arg1 && local32.anInt4277 < 0) {
					this.aClass1_Sub25ArrayArray2[arg1][local32.anInt4276] = null;
					this.aClass1_Sub25ArrayArray2[arg1][arg2] = local32;
					@Pc(75) int local75 = local32.anInt4284 + (local32.anInt4271 * local32.anInt4265 >> 12);
					local32.anInt4284 += arg2 - local32.anInt4276 << 8;
					local32.anInt4276 = arg2;
					local32.anInt4271 = 4096;
					local32.anInt4265 = local75 - local32.anInt4284;
					return;
				}
			}
		}
		@Pc(121) Class1_Sub17 local121 = (Class1_Sub17) this.aClass117_2.method3438((long) this.anIntArray130[arg1]);
		if (local121 == null) {
			return;
		}
		@Pc(131) Class1_Sub4_Sub1 local131 = local121.aClass1_Sub4_Sub1Array1[arg2];
		if (local131 == null) {
			return;
		}
		@Pc(138) Class1_Sub25 local138 = new Class1_Sub25();
		local138.aClass1_Sub17_1 = local121;
		local138.anInt4268 = arg1;
		local138.aClass1_Sub4_Sub1_1 = local131;
		local138.aClass127_1 = local121.aClass127Array1[arg2];
		local138.anInt4282 = local121.aByteArray31[arg2];
		local138.anInt4276 = arg2;
		local138.anInt4270 = arg0 * arg0 * local121.anInt2795 * local121.aByteArray29[arg2] + 1024 >> 11;
		local138.anInt4273 = local121.aByteArray30[arg2] & 0xFF;
		local138.anInt4284 = (arg2 << 8) - (local121.aShortArray45[arg2] & 0x7FFF);
		local138.anInt4278 = 0;
		local138.anInt4281 = 0;
		local138.anInt4267 = 0;
		local138.anInt4275 = 0;
		local138.anInt4277 = -1;
		if (this.anIntArray122[arg1] == 0) {
			local138.aClass1_Sub3_Sub4_3 = Static304.method2561(local131, this.method981(local138), this.method988(local138), this.method989(local138));
		} else {
			local138.aClass1_Sub3_Sub4_3 = Static304.method2561(local131, this.method981(local138), 0, this.method989(local138));
			this.method978(local121.aShortArray45[arg2] < 0, local138);
		}
		if (local121.aShortArray45[arg2] < 0) {
			local138.aClass1_Sub3_Sub4_3.method2583(-1);
		}
		if (local138.anInt4282 >= 0) {
			@Pc(287) Class1_Sub25 local287 = this.aClass1_Sub25ArrayArray1[arg1][local138.anInt4282];
			if (local287 != null && local287.anInt4277 < 0) {
				this.aClass1_Sub25ArrayArray2[arg1][local287.anInt4276] = null;
				local287.anInt4277 = 0;
			}
			this.aClass1_Sub25ArrayArray1[arg1][local138.anInt4282] = local138;
		}
		this.aClass1_Sub3_Sub3_1.aClass131_9.method3799(local138);
		this.aClass1_Sub25ArrayArray2[arg1][arg2] = local138;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZ)V")
	private void method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray125[arg1] = arg0;
		this.anIntArray121[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!di;Lclient!kb;IILclient!si;)Z")
	public synchronized boolean method1010(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(4) Class1_Sub31 arg2) {
		arg2.method4182();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub11 local29 = (Class1_Sub11) arg2.aClass117_21.method3441(); local29 != null; local29 = (Class1_Sub11) arg2.aClass117_21.method3444()) {
			@Pc(35) int local35 = (int) local29.aLong201;
			@Pc(43) Class1_Sub17 local43 = (Class1_Sub17) this.aClass117_2.method3438((long) local35);
			if (local43 == null) {
				local43 = Static23.method398(arg1, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass117_2.method3445(local43, (long) local35);
			}
			if (!local43.method2135(local29.aByteArray22, local23, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method4183();
		}
		return local9;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZB)V")
	private synchronized void method1011(@OriginalArg(0) boolean arg0) {
		this.aClass46_1.method1165();
		this.aClass1_Sub31_1 = null;
		this.method998(arg0);
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(III)V")
	public synchronized void method1012() {
		this.method1013();
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIZ)V")
	private void method1013() {
		this.anIntArray127[9] = 128;
		this.anIntArray137[9] = 128;
		this.method999(9, 128);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2539(@OriginalArg(0) int arg0) {
		if (this.aClass46_1.method1163()) {
			@Pc(15) int local15 = this.anInt1314 * this.aClass46_1.anInt1540 / Static43.anInt1255;
			do {
				@Pc(24) long local24 = this.aLong49 + (long) local15 * (long) arg0;
				if (this.aLong48 - local24 >= 0L) {
					this.aLong49 = local24;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong48 + (long) local15 - this.aLong49 - 1L) / (long) local15);
				this.aLong49 += (long) local53 * (long) local15;
				arg0 -= local53;
				this.aClass1_Sub3_Sub3_1.method2539(local53);
				this.method993();
			} while (this.aClass46_1.method1163());
		}
		this.aClass1_Sub3_Sub3_1.method2539(arg0);
	}
}
