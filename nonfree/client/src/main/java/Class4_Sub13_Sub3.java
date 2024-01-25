import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class4_Sub13_Sub3 extends Class4_Sub13 {

	@OriginalMember(owner = "client!s", name = "Eb", descriptor = "I")
	private int anInt5794;

	@OriginalMember(owner = "client!s", name = "Gb", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!s", name = "Hb", descriptor = "Z")
	private boolean aBoolean509;

	@OriginalMember(owner = "client!s", name = "Ib", descriptor = "I")
	private int anInt5795;

	@OriginalMember(owner = "client!s", name = "Kb", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!s", name = "Lb", descriptor = "Lclient!hl;")
	private Class4_Sub17 aClass4_Sub17_3;

	@OriginalMember(owner = "client!s", name = "Mb", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!s", name = "Nb", descriptor = "I")
	private int anInt5796;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "[I")
	private final int[] anIntArray467 = new int[16];

	@OriginalMember(owner = "client!s", name = "D", descriptor = "[I")
	public final int[] anIntArray470 = new int[16];

	@OriginalMember(owner = "client!s", name = "H", descriptor = "[[Lclient!fa;")
	private final Class4_Sub9[][] aClass4_Sub9ArrayArray1 = new Class4_Sub9[16][128];

	@OriginalMember(owner = "client!s", name = "s", descriptor = "[I")
	private final int[] anIntArray466 = new int[16];

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "[I")
	private final int[] anIntArray476 = new int[16];

	@OriginalMember(owner = "client!s", name = "q", descriptor = "[I")
	private final int[] anIntArray465 = new int[16];

	@OriginalMember(owner = "client!s", name = "w", descriptor = "[I")
	private final int[] anIntArray468 = new int[16];

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "[I")
	public final int[] lb = new int[16];

	@OriginalMember(owner = "client!s", name = "O", descriptor = "[I")
	private final int[] anIntArray474 = new int[16];

	@OriginalMember(owner = "client!s", name = "pb", descriptor = "[I")
	public final int[] anIntArray478 = new int[16];

	@OriginalMember(owner = "client!s", name = "G", descriptor = "[I")
	private final int[] anIntArray471 = new int[16];

	@OriginalMember(owner = "client!s", name = "J", descriptor = "[[Lclient!fa;")
	private final Class4_Sub9[][] aClass4_Sub9ArrayArray2 = new Class4_Sub9[16][128];

	@OriginalMember(owner = "client!s", name = "tb", descriptor = "I")
	private int anInt5785 = 256;

	@OriginalMember(owner = "client!s", name = "ob", descriptor = "[I")
	private final int[] anIntArray477 = new int[16];

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	private final int anInt5757 = 1000000;

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "[I")
	private final int[] anIntArray475 = new int[16];

	@OriginalMember(owner = "client!s", name = "I", descriptor = "[I")
	private final int[] anIntArray472 = new int[16];

	@OriginalMember(owner = "client!s", name = "N", descriptor = "[I")
	private final int[] anIntArray473 = new int[16];

	@OriginalMember(owner = "client!s", name = "x", descriptor = "[I")
	private final int[] anIntArray469 = new int[16];

	@OriginalMember(owner = "client!s", name = "xb", descriptor = "[I")
	private final int[] anIntArray479 = new int[16];

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "Lclient!ps;")
	private final Class161 aClass161_1 = new Class161();

	@OriginalMember(owner = "client!s", name = "Jb", descriptor = "Lclient!ug;")
	private final Class4_Sub13_Sub4 aClass4_Sub13_Sub4_1 = new Class4_Sub13_Sub4(this);

	@OriginalMember(owner = "client!s", name = "K", descriptor = "Lclient!uc;")
	private final Class198 aClass198_33 = new Class198(128);

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class4_Sub13_Sub3() {
		this.method4901();
		this.method4868(true);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IILclient!fa;I)Z")
	public boolean method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub9 arg3) {
		arg3.anInt1751 = Static57.anInt1232 / 100;
		if (arg3.anInt1755 >= 0 && (arg3.aClass4_Sub13_Sub1_1 == null || arg3.aClass4_Sub13_Sub1_1.method1951())) {
			arg3.method1464();
			arg3.method5667();
			if (arg3.anInt1762 > 0 && this.aClass4_Sub9ArrayArray2[arg3.anInt1768][arg3.anInt1762] == arg3) {
				this.aClass4_Sub9ArrayArray2[arg3.anInt1768][arg3.anInt1762] = null;
			}
			return true;
		}
		@Pc(60) int local60 = arg3.anInt1748;
		if (local60 > 0) {
			local60 -= (int) (Math.pow(2.0D, (double) this.anIntArray476[arg3.anInt1768] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local60 < 0) {
				local60 = 0;
			}
			arg3.anInt1748 = local60;
		}
		arg3.aClass4_Sub13_Sub1_1.method1934(this.method4882(arg3));
		@Pc(100) Class164 local100 = arg3.aClass164_1;
		@Pc(102) boolean local102 = false;
		arg3.anInt1749 += local100.anInt5253;
		arg3.anInt1767++;
		@Pc(133) double local133 = (double) ((arg3.anInt1754 * arg3.anInt1748 >> 12) + (arg3.anInt1753 - 60 << 8)) * 5.086263020833333E-6D;
		if (local100.anInt5256 > 0) {
			if (local100.anInt5254 <= 0) {
				arg3.anInt1759 += 128;
			} else {
				arg3.anInt1759 += (int) (Math.pow(2.0D, (double) local100.anInt5254 * local133) * 128.0D + 0.5D);
			}
			if (local100.anInt5256 * arg3.anInt1759 >= 819200) {
				local102 = true;
			}
		}
		if (local100.aByteArray80 != null) {
			if (local100.anInt5251 > 0) {
				arg3.anInt1771 += (int) (Math.pow(2.0D, (double) local100.anInt5251 * local133) * 128.0D + 0.5D);
			} else {
				arg3.anInt1771 += 128;
			}
			while (local100.aByteArray80.length - 2 > arg3.anInt1746 && arg3.anInt1771 > (local100.aByteArray80[arg3.anInt1746 + 2] & 0xFF) << 8) {
				arg3.anInt1746 += 2;
			}
			if (local100.aByteArray80.length - 2 == arg3.anInt1746 && local100.aByteArray80[arg3.anInt1746 + 1] == 0) {
				local102 = true;
			}
		}
		if (arg3.anInt1755 >= 0 && local100.aByteArray79 != null && (this.anIntArray478[arg3.anInt1768] & 0x1) == 0 && (arg3.anInt1762 < 0 || this.aClass4_Sub9ArrayArray2[arg3.anInt1768][arg3.anInt1762] != arg3)) {
			if (local100.anInt5250 > 0) {
				arg3.anInt1755 += (int) (Math.pow(2.0D, local133 * (double) local100.anInt5250) * 128.0D + 0.5D);
			} else {
				arg3.anInt1755 += 128;
			}
			while (arg3.anInt1760 < local100.aByteArray79.length - 2 && arg3.anInt1755 > (local100.aByteArray79[arg3.anInt1760 + 2] & 0xFF) << 8) {
				arg3.anInt1760 += 2;
			}
			if (arg3.anInt1760 == local100.aByteArray79.length - 2) {
				local102 = true;
			}
		}
		if (!local102) {
			arg3.aClass4_Sub13_Sub1_1.method1931(arg3.anInt1751, this.method4899(arg3), this.method4887(arg3));
			return false;
		}
		arg3.aClass4_Sub13_Sub1_1.method1939(arg3.anInt1751);
		if (arg1 == null) {
			arg3.aClass4_Sub13_Sub1_1.method5300(arg2);
		} else {
			arg3.aClass4_Sub13_Sub1_1.method5299(arg1, arg0, arg2);
		}
		if (arg3.aClass4_Sub13_Sub1_1.method1918()) {
			this.aClass4_Sub13_Sub4_1.aClass4_Sub13_Sub2_3.method2496(arg3.aClass4_Sub13_Sub1_1);
		}
		arg3.method1464();
		if (arg3.anInt1755 >= 0) {
			arg3.method5667();
			if (arg3.anInt1762 > 0 && this.aClass4_Sub9ArrayArray2[arg3.anInt1768][arg3.anInt1762] == arg3) {
				this.aClass4_Sub9ArrayArray2[arg3.anInt1768][arg3.anInt1762] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
	private void method4868(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method4871(-1);
		} else {
			this.method4878(-1);
		}
		this.method4886(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray479[local29] = this.anIntArray474[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray473[local45] = this.anIntArray474[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "()Lclient!le;")
	@Override
	public synchronized Class4_Sub13 method5303() {
		return this.aClass4_Sub13_Sub4_1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	private void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray472[arg1] = arg0;
		this.anIntArray470[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public synchronized void method4870() {
		for (@Pc(19) Class4_Sub31 local19 = (Class4_Sub31) this.aClass198_33.method5268(); local19 != null; local19 = (Class4_Sub31) this.aClass198_33.method5263()) {
			local19.method5667();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
	private void method4871(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class4_Sub9 local12 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3499(); local12 != null; local12 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3512()) {
			if (arg0 < 0 || local12.anInt1768 == arg0) {
				if (local12.aClass4_Sub13_Sub1_1 != null) {
					local12.aClass4_Sub13_Sub1_1.method1939(Static57.anInt1232 / 100);
					if (local12.aClass4_Sub13_Sub1_1.method1918()) {
						this.aClass4_Sub13_Sub4_1.aClass4_Sub13_Sub2_3.method2496(local12.aClass4_Sub13_Sub1_1);
					}
					local12.method1464();
				}
				if (local12.anInt1755 < 0) {
					this.aClass4_Sub9ArrayArray1[local12.anInt1768][local12.anInt1753] = null;
				}
				local12.method5667();
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)V")
	public synchronized void method4872() {
		this.method4896();
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public synchronized void method4873() {
		for (@Pc(7) Class4_Sub31 local7 = (Class4_Sub31) this.aClass198_33.method5268(); local7 != null; local7 = (Class4_Sub31) this.aClass198_33.method5263()) {
			local7.method3684();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	private void method4874(@OriginalArg(1) int arg0) {
		if ((this.anIntArray478[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class4_Sub9 local19 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3499(); local19 != null; local19 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3512()) {
			if (local19.anInt1768 == arg0 && this.aClass4_Sub9ArrayArray1[arg0][local19.anInt1753] == null && local19.anInt1755 < 0) {
				local19.anInt1755 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)V")
	private void method4875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray479[arg0] != arg1) {
			this.anIntArray479[arg0] = arg1;
			for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
				this.aClass4_Sub9ArrayArray2[arg0][local19] = null;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZB)V")
	private synchronized void method4877(@OriginalArg(0) boolean arg0) {
		this.aClass161_1.method4325();
		this.aClass4_Sub17_3 = null;
		this.method4868(arg0);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)V")
	private void method4878(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class4_Sub9 local16 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3499(); local16 != null; local16 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3512()) {
			if ((arg0 < 0 || local16.anInt1768 == arg0) && local16.anInt1755 < 0) {
				this.aClass4_Sub9ArrayArray1[local16.anInt1768][local16.anInt1753] = null;
				local16.anInt1755 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!hl;ZZ)V")
	private synchronized void method4879(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method4877(arg2);
		this.aClass161_1.method4321(arg0.aByteArray41);
		this.aBoolean509 = arg1;
		this.aLong215 = 0L;
		@Pc(24) int local24 = this.aClass161_1.method4334();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass161_1.method4332(local26);
			this.aClass161_1.method4329(local26);
			this.aClass161_1.method4328(local26);
		}
		this.anInt5795 = this.aClass161_1.method4330();
		this.anInt5794 = this.aClass161_1.anIntArray426[this.anInt5795];
		this.aLong216 = this.aClass161_1.method4335(this.anInt5794);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	private void method4880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IBI)V")
	private void method4881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray471[arg1] = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fa;I)I")
	private int method4882(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(14) int local14 = arg0.anInt1769 + (arg0.anInt1754 * arg0.anInt1748 >> 12);
		local14 += (this.anIntArray471[arg0.anInt1768] - 8192) * this.anIntArray477[arg0.anInt1768] >> 12;
		@Pc(35) Class164 local35 = arg0.aClass164_1;
		@Pc(62) int local62;
		if (local35.anInt5253 > 0 && (local35.anInt5252 > 0 || this.anIntArray465[arg0.anInt1768] > 0)) {
			local62 = local35.anInt5252 << 2;
			@Pc(67) int local67 = local35.anInt5249 << 1;
			if (arg0.anInt1767 < local67) {
				local62 = arg0.anInt1767 * local62 / local67;
			}
			local62 += this.anIntArray465[arg0.anInt1768] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt1749 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local62 * local97);
		}
		local62 = (int) ((double) (arg0.aClass4_Sub5_Sub1_1.anInt6833 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static57.anInt1232 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!fa;)Z")
	public boolean method4883(@OriginalArg(1) Class4_Sub9 arg0) {
		if (arg0.aClass4_Sub13_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt1755 >= 0) {
			arg0.method5667();
			if (arg0.anInt1762 > 0 && this.aClass4_Sub9ArrayArray2[arg0.anInt1768][arg0.anInt1762] == arg0) {
				this.aClass4_Sub9ArrayArray2[arg0.anInt1768][arg0.anInt1762] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZLclient!fa;)V")
	public void method4884(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		@Pc(14) int local14 = arg1.aClass4_Sub5_Sub1_1.aByteArray94.length;
		@Pc(46) int local46;
		if (arg0 && arg1.aClass4_Sub5_Sub1_1.aBoolean595) {
			@Pc(29) int local29 = local14 + local14 - arg1.aClass4_Sub5_Sub1_1.anInt6832;
			local14 <<= 0x8;
			local46 = (int) ((long) this.lb[arg1.anInt1768] * (long) local29 >> 6);
			if (local14 <= local46) {
				local46 = local14 + local14 - local46 - 1;
				arg1.aClass4_Sub13_Sub1_1.method1944();
			}
		} else {
			local46 = (int) ((long) this.lb[arg1.anInt1768] * (long) local14 >> 6);
		}
		arg1.aClass4_Sub13_Sub1_1.method1938(local46);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!am;Lclient!qb;BILclient!hl;)Z")
	public synchronized boolean method4885(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(4) Class4_Sub17 arg2) {
		arg2.method2133();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class4_Sub16 local29 = (Class4_Sub16) arg2.aClass198_17.method5268(); local29 != null; local29 = (Class4_Sub16) arg2.aClass198_17.method5263()) {
			@Pc(35) int local35 = (int) local29.aLong259;
			@Pc(43) Class4_Sub31 local43 = (Class4_Sub31) this.aClass198_33.method5261((long) local35);
			if (local43 == null) {
				local43 = Static44.method810(local35, arg0);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass198_33.method5267((long) local35, local43);
			}
			if (!local43.method3680(arg1, local23, local29.aByteArray40)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method2132();
		}
		return local9;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
	private void method4886(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4886(local12);
			}
			return;
		}
		this.anIntArray475[arg0] = 12800;
		this.anIntArray466[arg0] = 8192;
		this.anIntArray468[arg0] = 16383;
		this.anIntArray471[arg0] = 8192;
		this.anIntArray465[arg0] = 0;
		this.anIntArray476[arg0] = 8192;
		this.method4874(arg0);
		this.method4889(arg0);
		this.anIntArray478[arg0] = 0;
		this.anIntArray469[arg0] = 32767;
		this.anIntArray477[arg0] = 256;
		this.lb[arg0] = 0;
		this.method4869(8192, arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!fa;)I")
	private int method4887(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(9) int local9 = this.anIntArray466[arg0.anInt1768];
		return local9 < 8192 ? arg0.anInt1763 * local9 + 32 >> 6 : 16384 - ((128 - arg0.anInt1763) * (-local9 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(BI)V")
	private void method4889(@OriginalArg(1) int arg0) {
		if ((this.anIntArray478[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class4_Sub9 local22 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3499(); local22 != null; local22 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3512()) {
			if (local22.anInt1768 == arg0) {
				local22.anInt1750 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "()I")
	@Override
	public synchronized int method5305() {
		return 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5299(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass161_1.method4326()) {
			@Pc(14) int local14 = this.anInt5757 * this.aClass161_1.anInt5210 / Static57.anInt1232;
			do {
				@Pc(23) long local23 = this.aLong215 + (long) local14 * (long) arg2;
				if (this.aLong216 - local23 >= 0L) {
					this.aLong215 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong216 - this.aLong215 - 1L) / (long) local14);
				this.aLong215 += (long) local14 * (long) local51;
				this.aClass4_Sub13_Sub4_1.method5299(arg0, arg1, local51);
				arg1 += local51;
				arg2 -= local51;
				this.method4900();
			} while (this.aClass161_1.method4326());
		}
		this.aClass4_Sub13_Sub4_1.method5299(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public synchronized void method4890() {
		this.method4877(true);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)I")
	public int method4892() {
		return this.anInt5785;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V")
	public synchronized void method4894(@OriginalArg(0) int arg0) {
		this.anInt5785 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLclient!hl;I)V")
	public synchronized void method4895(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub17 arg1) {
		this.method4879(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(IBI)V")
	private void method4896() {
		this.anIntArray474[9] = 128;
		this.anIntArray473[9] = 128;
		this.method4875(9, 128);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)V")
	private void method4897(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4904(local24, local18, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method4904(local24, local18, 64);
			} else {
				this.method4898(local30, local24, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4902(local18, local30, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray473[local18] = (this.anIntArray473[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray473[local18] = (local30 << 7) + (this.anIntArray473[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray465[local18] = (this.anIntArray465[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray465[local18] = (this.anIntArray465[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray476[local18] = (local30 << 7) + (this.anIntArray476[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray476[local18] = (this.anIntArray476[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray475[local18] = (local30 << 7) + (this.anIntArray475[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray475[local18] = local30 + (this.anIntArray475[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray466[local18] = (this.anIntArray466[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray466[local18] = (this.anIntArray466[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray468[local18] = (this.anIntArray468[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray468[local18] = (this.anIntArray468[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray478[local18] |= 0x1;
				} else {
					this.anIntArray478[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method4874(local18);
					this.anIntArray478[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray478[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray469[local18] = (this.anIntArray469[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray469[local18] = local30 + (this.anIntArray469[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray469[local18] = (local30 << 7) + (this.anIntArray469[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray469[local18] = local30 + (this.anIntArray469[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method4871(local18);
			}
			if (local24 == 121) {
				this.method4886(local18);
			}
			if (local24 == 123) {
				this.method4878(local18);
			}
			@Pc(505) int local505;
			if (local24 == 6) {
				local505 = this.anIntArray469[local18];
				if (local505 == 16384) {
					this.anIntArray477[local18] = (local30 << 7) + (this.anIntArray477[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local505 = this.anIntArray469[local18];
				if (local505 == 16384) {
					this.anIntArray477[local18] = local30 + (this.anIntArray477[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.lb[local18] = (local30 << 7) + (this.lb[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.lb[local18] = (this.lb[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method4889(local18);
					this.anIntArray478[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray478[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method4869((this.anIntArray472[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method4869((this.anIntArray472[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4875(local18, this.anIntArray473[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4880(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F017D) >> 9);
			this.method4881(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4868(true);
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5300(@OriginalArg(0) int arg0) {
		if (this.aClass161_1.method4326()) {
			@Pc(18) int local18 = this.anInt5757 * this.aClass161_1.anInt5210 / Static57.anInt1232;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong215;
				if (this.aLong216 - local27 >= 0L) {
					this.aLong215 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong216 + (long) local18 - this.aLong215 - 1L) / (long) local18);
				this.aLong215 += (long) local18 * (long) local58;
				this.aClass4_Sub13_Sub4_1.method5300(local58);
				arg0 -= local58;
				this.method4900();
			} while (this.aClass161_1.method4326());
		}
		this.aClass4_Sub13_Sub4_1.method5300(arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	private void method4898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4904(arg1, arg2, 64);
		if ((this.anIntArray478[arg2] & 0x2) != 0) {
			for (@Pc(36) Class4_Sub9 local36 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3506(); local36 != null; local36 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3501()) {
				if (arg2 == local36.anInt1768 && local36.anInt1755 < 0) {
					this.aClass4_Sub9ArrayArray1[arg2][local36.anInt1753] = null;
					this.aClass4_Sub9ArrayArray1[arg2][arg1] = local36;
					@Pc(75) int local75 = local36.anInt1769 + (local36.anInt1748 * local36.anInt1754 >> 12);
					local36.anInt1769 += arg1 - local36.anInt1753 << 8;
					local36.anInt1754 = local75 - local36.anInt1769;
					local36.anInt1748 = 4096;
					local36.anInt1753 = arg1;
					return;
				}
			}
		}
		@Pc(121) Class4_Sub31 local121 = (Class4_Sub31) this.aClass198_33.method5261((long) this.anIntArray479[arg2]);
		if (local121 == null) {
			return;
		}
		@Pc(129) Class4_Sub5_Sub1 local129 = local121.aClass4_Sub5_Sub1Array1[arg1];
		if (local129 == null) {
			return;
		}
		@Pc(136) Class4_Sub9 local136 = new Class4_Sub9();
		local136.aClass4_Sub5_Sub1_1 = local129;
		local136.anInt1768 = arg2;
		local136.aClass4_Sub31_1 = local121;
		local136.aClass164_1 = local121.aClass164Array1[arg1];
		local136.anInt1762 = local121.aByteArray52[arg1];
		local136.anInt1753 = arg1;
		local136.anInt1752 = local121.aByteArray53[arg1] * arg0 * arg0 * local121.anInt4413 + 1024 >> 11;
		local136.anInt1763 = local121.aByteArray51[arg1] & 0xFF;
		local136.anInt1769 = (arg1 << 8) - (local121.aShortArray67[arg1] & 0x7FFF);
		local136.anInt1760 = 0;
		local136.anInt1771 = 0;
		local136.anInt1759 = 0;
		local136.anInt1746 = 0;
		local136.anInt1755 = -1;
		if (this.lb[arg2] == 0) {
			local136.aClass4_Sub13_Sub1_1 = Static359.method1925(local129, this.method4882(local136), this.method4899(local136), this.method4887(local136));
		} else {
			local136.aClass4_Sub13_Sub1_1 = Static359.method1925(local129, this.method4882(local136), 0, this.method4887(local136));
			this.method4884(local121.aShortArray67[arg1] < 0, local136);
		}
		if (local121.aShortArray67[arg1] < 0) {
			local136.aClass4_Sub13_Sub1_1.method1940(-1);
		}
		if (local136.anInt1762 >= 0) {
			@Pc(289) Class4_Sub9 local289 = this.aClass4_Sub9ArrayArray2[arg2][local136.anInt1762];
			if (local289 != null && local289.anInt1755 < 0) {
				this.aClass4_Sub9ArrayArray1[arg2][local289.anInt1753] = null;
				local289.anInt1755 = 0;
			}
			this.aClass4_Sub9ArrayArray2[arg2][local136.anInt1762] = local136;
		}
		this.aClass4_Sub13_Sub4_1.aClass130_144.method3510(local136);
		this.aClass4_Sub9ArrayArray1[arg2][arg1] = local136;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fa;B)I")
	private int method4899(@OriginalArg(0) Class4_Sub9 arg0) {
		if (this.anIntArray467[arg0.anInt1768] == 0) {
			return 0;
		}
		@Pc(14) Class164 local14 = arg0.aClass164_1;
		@Pc(30) int local30 = this.anIntArray475[arg0.anInt1768] * this.anIntArray468[arg0.anInt1768] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt1752 * local38 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt5785 * local47 + 128 >> 8;
		local30 = local56 * this.anIntArray467[arg0.anInt1768] + 128 >> 8;
		if (local14.anInt5256 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local14.anInt5256 * 1.953125E-5D * (double) arg0.anInt1759) + 0.5D);
		}
		@Pc(102) int local102;
		@Pc(110) int local110;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local14.aByteArray80 != null) {
			local102 = arg0.anInt1771;
			local110 = local14.aByteArray80[arg0.anInt1746 + 1];
			if (arg0.anInt1746 < local14.aByteArray80.length - 2) {
				local132 = (local14.aByteArray80[arg0.anInt1746] & 0xFF) << 8;
				local144 = (local14.aByteArray80[arg0.anInt1746 + 2] & 0xFF) << 8;
				local110 += (local14.aByteArray80[arg0.anInt1746 + 3] - local110) * (local102 + -local132) / (local144 - local132);
			}
			local30 = local110 * local30 + 32 >> 6;
		}
		if (arg0.anInt1755 > 0 && local14.aByteArray79 != null) {
			local102 = arg0.anInt1755;
			local110 = local14.aByteArray79[arg0.anInt1760 + 1];
			if (arg0.anInt1760 < local14.aByteArray79.length - 2) {
				local132 = (local14.aByteArray79[arg0.anInt1760] & 0xFF) << 8;
				local144 = (local14.aByteArray79[arg0.anInt1760 + 2] & 0xFF) << 8;
				local110 += (local14.aByteArray79[arg0.anInt1760 + 3] - local110) * (-local132 + local102) / (local144 - local132);
			}
			local30 = local110 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(I)V")
	private void method4900() {
		@Pc(16) int local16 = this.anInt5795;
		@Pc(19) int local19 = this.anInt5794;
		@Pc(22) long local22 = this.aLong216;
		if (this.aClass4_Sub17_3 != null && this.anInt5796 == local19) {
			this.method4879(this.aClass4_Sub17_3, this.aBoolean509, this.aBoolean510);
			this.method4900();
			return;
		}
		while (this.anInt5794 == local19) {
			while (local19 == this.aClass161_1.anIntArray426[local16]) {
				this.aClass161_1.method4332(local16);
				@Pc(55) int local55 = this.aClass161_1.method4336(local16);
				if (local55 == 1) {
					this.aClass161_1.method4324();
					this.aClass161_1.method4328(local16);
					if (this.aClass161_1.method4323()) {
						if (this.aClass4_Sub17_3 != null) {
							this.method4895(this.aBoolean509, this.aClass4_Sub17_3);
							this.method4900();
							return;
						}
						if (!this.aBoolean509 || local19 == 0) {
							this.method4868(true);
							this.aClass161_1.method4325();
							return;
						}
						this.aClass161_1.method4327(local22);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method4897(local55);
				}
				this.aClass161_1.method4329(local16);
				this.aClass161_1.method4328(local16);
			}
			local16 = this.aClass161_1.method4330();
			local19 = this.aClass161_1.anIntArray426[local16];
			local22 = this.aClass161_1.method4335(local19);
		}
		this.anInt5795 = local16;
		this.anInt5794 = local19;
		this.aLong216 = local22;
		if (this.aClass4_Sub17_3 != null && this.anInt5796 < local19) {
			this.anInt5794 = this.anInt5796;
			this.anInt5795 = -1;
			this.aLong216 = this.aClass161_1.method4335(this.anInt5794);
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(III)V")
	private synchronized void method4901() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray467[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IIII)V")
	private void method4902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()Lclient!le;")
	@Override
	public synchronized Class4_Sub13 method5301() {
		return null;
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "(I)Z")
	public synchronized boolean method4903() {
		return this.aClass161_1.method4326();
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(IIII)V")
	private void method4904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class4_Sub9 local18 = this.aClass4_Sub9ArrayArray1[arg1][arg0];
		if (local18 == null) {
			return;
		}
		this.aClass4_Sub9ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray478[arg1] & 0x2) == 0) {
			local18.anInt1755 = 0;
			return;
		}
		for (@Pc(46) Class4_Sub9 local46 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3499(); local46 != null; local46 = (Class4_Sub9) this.aClass4_Sub13_Sub4_1.aClass130_144.method3512()) {
			if (local18.anInt1768 == local46.anInt1768 && local46.anInt1755 < 0 && local18 != local46) {
				local18.anInt1755 = 0;
				return;
			}
		}
	}
}
