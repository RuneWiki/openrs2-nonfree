import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class3_Sub15_Sub4 extends Class3_Sub15 {

	@OriginalMember(owner = "client!ue", name = "Ib", descriptor = "I")
	private int anInt5644;

	@OriginalMember(owner = "client!ue", name = "Jb", descriptor = "I")
	private int anInt5645;

	@OriginalMember(owner = "client!ue", name = "Kb", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!ue", name = "Mb", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!ue", name = "Nb", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "client!ue", name = "Ob", descriptor = "I")
	private int anInt5646;

	@OriginalMember(owner = "client!ue", name = "Pb", descriptor = "Z")
	private boolean aBoolean388;

	@OriginalMember(owner = "client!ue", name = "Qb", descriptor = "Lclient!oo;")
	private Class3_Sub23 aClass3_Sub23_2;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "[I")
	private int[] anIntArray573 = new int[16];

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "[I")
	private int[] anIntArray579 = new int[16];

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "[I")
	private int[] anIntArray575 = new int[16];

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
	private int anInt5613 = 256;

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "[I")
	private int[] anIntArray581 = new int[16];

	@OriginalMember(owner = "client!ue", name = "lb", descriptor = "[I")
	public int[] anIntArray585 = new int[16];

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "[[Lclient!hn;")
	private Class3_Sub13[][] aClass3_Sub13ArrayArray1 = new Class3_Sub13[16][128];

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "[I")
	private int[] anIntArray576 = new int[16];

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
	private int anInt5621 = 1000000;

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
	private int[] anIntArray580 = new int[16];

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "[I")
	private int[] anIntArray584 = new int[16];

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "[I")
	public int[] anIntArray572 = new int[16];

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "[I")
	private int[] anIntArray578 = new int[16];

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "[I")
	private int[] anIntArray574 = new int[16];

	@OriginalMember(owner = "client!ue", name = "xb", descriptor = "[I")
	private int[] anIntArray586 = new int[16];

	@OriginalMember(owner = "client!ue", name = "zb", descriptor = "[I")
	private int[] anIntArray587 = new int[16];

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "[[Lclient!hn;")
	private Class3_Sub13[][] aClass3_Sub13ArrayArray2 = new Class3_Sub13[16][128];

	@OriginalMember(owner = "client!ue", name = "Ab", descriptor = "[I")
	private int[] anIntArray588 = new int[16];

	@OriginalMember(owner = "client!ue", name = "ib", descriptor = "[I")
	private int[] anIntArray583 = new int[16];

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "[I")
	public int[] anIntArray577 = new int[16];

	@OriginalMember(owner = "client!ue", name = "yb", descriptor = "Lclient!vk;")
	private Class186 aClass186_1 = new Class186();

	@OriginalMember(owner = "client!ue", name = "Lb", descriptor = "Lclient!ng;")
	private Class3_Sub15_Sub3 aClass3_Sub15_Sub3_1 = new Class3_Sub15_Sub3(this);

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Lclient!cn;")
	private Class30 aClass30_31 = new Class30(128);

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class3_Sub15_Sub4() {
		this.method4570();
		this.method4569(true);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	private void method4565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray588[arg1] = arg0;
		this.anIntArray572[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!hn;)Z")
	public boolean method4566(@OriginalArg(1) Class3_Sub13 arg0) {
		if (arg0.aClass3_Sub15_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt2054 >= 0) {
			arg0.method5013();
			if (arg0.anInt2045 > 0 && this.aClass3_Sub13ArrayArray1[arg0.anInt2043][arg0.anInt2045] == arg0) {
				this.aClass3_Sub13ArrayArray1[arg0.anInt2043][arg0.anInt2045] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!rn;Lclient!oo;IILclient!kb;)Z")
	public synchronized boolean method4567(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class3_Sub23 arg1, @OriginalArg(4) Class92 arg2) {
		arg1.method3446();
		@Pc(5) boolean local5 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class3_Sub12 local27 = (Class3_Sub12) arg1.aClass30_25.method664(); local27 != null; local27 = (Class3_Sub12) arg1.aClass30_25.method671()) {
			@Pc(34) int local34 = (int) local27.aLong243;
			@Pc(42) Class3_Sub22 local42 = (Class3_Sub22) this.aClass30_31.method663((long) local34);
			if (local42 == null) {
				local42 = Static108.method1770(local34, arg0);
				if (local42 == null) {
					local5 = false;
					continue;
				}
				this.aClass30_31.method668(local42, (long) local34);
			}
			if (!local42.method3145(local27.aByteArray18, arg2, local21)) {
				local5 = false;
			}
		}
		if (local5) {
			arg1.method3444();
		}
		return local5;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(III)V")
	private void method4568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray586[arg1] != arg0) {
			this.anIntArray586[arg1] = arg0;
			for (@Pc(15) int local15 = 0; local15 < 128; local15++) {
				this.aClass3_Sub13ArrayArray1[arg1][local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZ)V")
	private void method4569(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4579(-1);
		} else {
			this.method4584(-1);
		}
		this.method4583(-1);
		@Pc(23) int local23;
		for (local23 = 0; local23 < 16; local23++) {
			this.anIntArray586[local23] = this.anIntArray578[local23];
		}
		for (local23 = 0; local23 < 16; local23++) {
			this.anIntArray573[local23] = this.anIntArray578[local23] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(III)V")
	private synchronized void method4570() {
		for (@Pc(6) int local6 = 0; local6 < 16; local6++) {
			this.anIntArray574[local6] = 256;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)V")
	private void method4571(@OriginalArg(1) int arg0) {
		if ((this.anIntArray585[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class3_Sub13 local22 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1281(); local22 != null; local22 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1278()) {
			if (arg0 == local22.anInt2043 && this.aClass3_Sub13ArrayArray2[arg0][local22.anInt2059] == null && local22.anInt2054 < 0) {
				local22.anInt2054 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(III)V")
	private void method4572() {
		this.anIntArray578[9] = 128;
		this.anIntArray573[9] = 128;
		this.method4568(128, 9);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZLclient!oo;I)V")
	private synchronized void method4573(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub23 arg2) {
		this.method4596(arg1);
		this.aClass186_1.method4828(arg2.aByteArray52);
		this.aLong217 = 0L;
		this.aBoolean387 = arg0;
		@Pc(24) int local24 = this.aClass186_1.method4829();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass186_1.method4819(local34);
			this.aClass186_1.method4827(local34);
			this.aClass186_1.method4821(local34);
		}
		this.anInt5644 = this.aClass186_1.method4824();
		this.anInt5645 = this.aClass186_1.anIntArray607[this.anInt5644];
		this.aLong216 = this.aClass186_1.method4822(this.anInt5645);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!hn;III[I)Z")
	public boolean method4574(@OriginalArg(0) Class3_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0.anInt2047 = Static155.anInt2915 / 100;
		if (arg0.anInt2054 >= 0 && (arg0.aClass3_Sub15_Sub1_1 == null || arg0.aClass3_Sub15_Sub1_1.method2139())) {
			arg0.method1790();
			arg0.method5013();
			if (arg0.anInt2045 > 0 && this.aClass3_Sub13ArrayArray1[arg0.anInt2043][arg0.anInt2045] == arg0) {
				this.aClass3_Sub13ArrayArray1[arg0.anInt2043][arg0.anInt2045] = null;
			}
			return true;
		}
		@Pc(69) int local69 = arg0.anInt2055;
		@Pc(71) boolean local71 = false;
		if (local69 > 0) {
			local69 -= (int) (Math.pow(2.0D, (double) this.anIntArray580[arg0.anInt2043] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local69 < 0) {
				local69 = 0;
			}
			arg0.anInt2055 = local69;
		}
		arg0.aClass3_Sub15_Sub1_1.method2116(this.method4588(arg0));
		@Pc(127) double local127 = (double) ((arg0.anInt2040 * arg0.anInt2055 >> 12) + (arg0.anInt2059 - 60 << 8)) * 5.086263020833333E-6D;
		arg0.anInt2050++;
		@Pc(136) Class126 local136 = arg0.aClass126_1;
		arg0.anInt2058 += local136.anInt3822;
		if (local136.anInt3819 > 0) {
			if (local136.anInt3823 > 0) {
				arg0.anInt2049 += (int) (Math.pow(2.0D, local127 * (double) local136.anInt3823) * 128.0D + 0.5D);
			} else {
				arg0.anInt2049 += 128;
			}
			if (local136.anInt3819 * arg0.anInt2049 >= 819200) {
				local71 = true;
			}
		}
		if (local136.aByteArray49 != null) {
			if (local136.anInt3812 <= 0) {
				arg0.anInt2052 += 128;
			} else {
				arg0.anInt2052 += (int) (Math.pow(2.0D, local127 * (double) local136.anInt3812) * 128.0D + 0.5D);
			}
			while (local136.aByteArray49.length - 2 > arg0.anInt2056 && arg0.anInt2052 > (local136.aByteArray49[arg0.anInt2056 + 2] & 0xFF) << 8) {
				arg0.anInt2056 += 2;
			}
			if (arg0.anInt2056 == local136.aByteArray49.length - 2 && local136.aByteArray49[arg0.anInt2056 + 1] == 0) {
				local71 = true;
			}
		}
		if (arg0.anInt2054 >= 0 && local136.aByteArray50 != null && (this.anIntArray585[arg0.anInt2043] & 0x1) == 0 && (arg0.anInt2045 < 0 || this.aClass3_Sub13ArrayArray1[arg0.anInt2043][arg0.anInt2045] != arg0)) {
			if (local136.anInt3820 <= 0) {
				arg0.anInt2054 += 128;
			} else {
				arg0.anInt2054 += (int) (Math.pow(2.0D, local127 * (double) local136.anInt3820) * 128.0D + 0.5D);
			}
			while (local136.aByteArray50.length - 2 > arg0.anInt2051 && (local136.aByteArray50[arg0.anInt2051 + 2] & 0xFF) << 8 < arg0.anInt2054) {
				arg0.anInt2051 += 2;
			}
			if (local136.aByteArray50.length - 2 == arg0.anInt2051) {
				local71 = true;
			}
		}
		if (!local71) {
			arg0.aClass3_Sub15_Sub1_1.method2124(arg0.anInt2047, this.method4582(arg0), this.method4575(arg0));
			return false;
		}
		arg0.aClass3_Sub15_Sub1_1.method2125(arg0.anInt2047);
		if (arg3 == null) {
			arg0.aClass3_Sub15_Sub1_1.method4561(arg2);
		} else {
			arg0.aClass3_Sub15_Sub1_1.method4560(arg3, arg1, arg2);
		}
		if (arg0.aClass3_Sub15_Sub1_1.method2126()) {
			this.aClass3_Sub15_Sub3_1.aClass3_Sub15_Sub2_2.method2430(arg0.aClass3_Sub15_Sub1_1);
		}
		arg0.method1790();
		if (arg0.anInt2054 >= 0) {
			arg0.method5013();
			if (arg0.anInt2045 > 0 && arg0 == this.aClass3_Sub13ArrayArray1[arg0.anInt2043][arg0.anInt2045]) {
				this.aClass3_Sub13ArrayArray1[arg0.anInt2043][arg0.anInt2045] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILclient!hn;)I")
	private int method4575(@OriginalArg(1) Class3_Sub13 arg0) {
		@Pc(9) int local9 = this.anIntArray575[arg0.anInt2043];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt2046) * (16384 - local9) + 32 >> 6) : local9 * arg0.anInt2046 - -32 >> 6;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
	private void method4576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub13 local8 = this.aClass3_Sub13ArrayArray2[arg1][arg2];
		if (local8 == null) {
			return;
		}
		this.aClass3_Sub13ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray585[arg1] & 0x2) == 0) {
			local8.anInt2054 = 0;
			return;
		}
		for (@Pc(51) Class3_Sub13 local51 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1281(); local51 != null; local51 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1278()) {
			if (local51.anInt2043 == local8.anInt2043 && local51.anInt2054 < 0 && local8 != local51) {
				local8.anInt2054 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)Z")
	public synchronized boolean method4577() {
		return this.aClass186_1.method4823();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
	private void method4578(@OriginalArg(1) int arg0) {
		if ((this.anIntArray585[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class3_Sub13 local18 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1281(); local18 != null; local18 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1278()) {
			if (arg0 == local18.anInt2043) {
				local18.anInt2053 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IB)V")
	private void method4579(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class3_Sub13 local8 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1281(); local8 != null; local8 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1278()) {
			if (arg0 < 0 || local8.anInt2043 == arg0) {
				if (local8.aClass3_Sub15_Sub1_1 != null) {
					local8.aClass3_Sub15_Sub1_1.method2125(Static155.anInt2915 / 100);
					if (local8.aClass3_Sub15_Sub1_1.method2126()) {
						this.aClass3_Sub15_Sub3_1.aClass3_Sub15_Sub2_2.method2430(local8.aClass3_Sub15_Sub1_1);
					}
					local8.method1790();
				}
				if (local8.anInt2054 < 0) {
					this.aClass3_Sub13ArrayArray2[local8.anInt2043][local8.anInt2059] = null;
				}
				local8.method5013();
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIII)V")
	private void method4580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4576(64, arg1, arg0);
		if ((this.anIntArray585[arg1] & 0x2) != 0) {
			for (@Pc(29) Class3_Sub13 local29 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1275(); local29 != null; local29 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1269()) {
				if (local29.anInt2043 == arg1 && local29.anInt2054 < 0) {
					this.aClass3_Sub13ArrayArray2[arg1][local29.anInt2059] = null;
					this.aClass3_Sub13ArrayArray2[arg1][arg0] = local29;
					@Pc(70) int local70 = local29.anInt2041 + (local29.anInt2040 * local29.anInt2055 >> 12);
					local29.anInt2055 = 4096;
					local29.anInt2041 += arg0 - local29.anInt2059 << 8;
					local29.anInt2040 = local70 - local29.anInt2041;
					local29.anInt2059 = arg0;
					return;
				}
			}
		}
		@Pc(114) Class3_Sub22 local114 = (Class3_Sub22) this.aClass30_31.method663((long) this.anIntArray586[arg1]);
		if (local114 == null) {
			return;
		}
		@Pc(123) Class3_Sub11_Sub1 local123 = local114.aClass3_Sub11_Sub1Array1[arg0];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class3_Sub13 local130 = new Class3_Sub13();
		local130.anInt2043 = arg1;
		local130.aClass3_Sub22_1 = local114;
		local130.aClass3_Sub11_Sub1_1 = local123;
		local130.aClass126_1 = local114.aClass126Array1[arg0];
		local130.anInt2045 = local114.aByteArray46[arg0];
		local130.anInt2059 = arg0;
		local130.anInt2057 = local114.aByteArray45[arg0] * local114.anInt3712 * arg2 * arg2 + 1024 >> 11;
		local130.anInt2046 = local114.aByteArray44[arg0] & 0xFF;
		local130.anInt2041 = (arg0 << 8) - (local114.aShortArray72[arg0] & 0x7FFF);
		local130.anInt2056 = 0;
		local130.anInt2049 = 0;
		local130.anInt2051 = 0;
		local130.anInt2054 = -1;
		local130.anInt2052 = 0;
		if (this.anIntArray577[arg1] == 0) {
			local130.aClass3_Sub15_Sub1_1 = Static319.method2113(local123, this.method4588(local130), this.method4582(local130), this.method4575(local130));
		} else {
			local130.aClass3_Sub15_Sub1_1 = Static319.method2113(local123, this.method4588(local130), 0, this.method4575(local130));
			this.method4585(local114.aShortArray72[arg0] < 0, local130);
		}
		if (local114.aShortArray72[arg0] < 0) {
			local130.aClass3_Sub15_Sub1_1.method2133(-1);
		}
		if (local130.anInt2045 >= 0) {
			@Pc(293) Class3_Sub13 local293 = this.aClass3_Sub13ArrayArray1[arg1][local130.anInt2045];
			if (local293 != null && local293.anInt2054 < 0) {
				this.aClass3_Sub13ArrayArray2[arg1][local293.anInt2059] = null;
				local293.anInt2054 = 0;
			}
			this.aClass3_Sub13ArrayArray1[arg1][local130.anInt2045] = local130;
		}
		this.aClass3_Sub15_Sub3_1.aClass56_11.method1282(local130);
		this.aClass3_Sub13ArrayArray2[arg1][arg0] = local130;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
	private void method4581() {
		@Pc(16) int local16 = this.anInt5644;
		@Pc(19) long local19 = this.aLong216;
		@Pc(22) int local22 = this.anInt5645;
		if (this.aClass3_Sub23_2 != null && local22 == this.anInt5646) {
			this.method4573(this.aBoolean387, this.aBoolean388, this.aClass3_Sub23_2);
			this.method4581();
			return;
		}
		while (local22 == this.anInt5645) {
			while (local22 == this.aClass186_1.anIntArray607[local16]) {
				this.aClass186_1.method4819(local16);
				@Pc(68) int local68 = this.aClass186_1.method4818(local16);
				if (local68 == 1) {
					this.aClass186_1.method4825();
					this.aClass186_1.method4821(local16);
					if (this.aClass186_1.method4817()) {
						if (this.aClass3_Sub23_2 != null) {
							this.method4595(this.aBoolean387, this.aClass3_Sub23_2);
							this.method4581();
							return;
						}
						if (!this.aBoolean387 || local22 == 0) {
							this.method4569(true);
							this.aClass186_1.method4820();
							return;
						}
						this.aClass186_1.method4826(local19);
					}
					break;
				}
				if ((local68 & 0x80) != 0) {
					this.method4599(local68);
				}
				this.aClass186_1.method4827(local16);
				this.aClass186_1.method4821(local16);
			}
			local16 = this.aClass186_1.method4824();
			local22 = this.aClass186_1.anIntArray607[local16];
			local19 = this.aClass186_1.method4822(local22);
		}
		this.aLong216 = local19;
		this.anInt5645 = local22;
		this.anInt5644 = local16;
		if (this.aClass3_Sub23_2 != null && local22 > this.anInt5646) {
			this.anInt5645 = this.anInt5646;
			this.anInt5644 = -1;
			this.aLong216 = this.aClass186_1.method4822(this.anInt5645);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!hn;I)I")
	private int method4582(@OriginalArg(0) Class3_Sub13 arg0) {
		if (this.anIntArray574[arg0.anInt2043] == 0) {
			return 0;
		}
		@Pc(23) Class126 local23 = arg0.aClass126_1;
		@Pc(39) int local39 = this.anIntArray587[arg0.anInt2043] * this.anIntArray581[arg0.anInt2043] + 4096 >> 13;
		@Pc(47) int local47 = local39 * local39 + 16384 >> 15;
		@Pc(56) int local56 = local47 * arg0.anInt2057 + 16384 >> 15;
		@Pc(65) int local65 = local56 * this.anInt5613 + 128 >> 8;
		local39 = this.anIntArray574[arg0.anInt2043] * local65 + 128 >> 8;
		if (local23.anInt3819 > 0) {
			local39 = (int) (Math.pow(0.5D, (double) local23.anInt3819 * 1.953125E-5D * (double) arg0.anInt2049) * (double) local39 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local23.aByteArray49 != null) {
			local106 = arg0.anInt2052;
			local114 = local23.aByteArray49[arg0.anInt2056 + 1];
			if (local23.aByteArray49.length - 2 > arg0.anInt2056) {
				local133 = (local23.aByteArray49[arg0.anInt2056] & 0xFF) << 8;
				local145 = (local23.aByteArray49[arg0.anInt2056 + 2] & 0xFF) << 8;
				local114 += (local106 - local133) * (-local114 + local23.aByteArray49[arg0.anInt2056 - -3]) / (local145 - local133);
			}
			local39 = local114 * local39 + 32 >> 6;
		}
		if (arg0.anInt2054 > 0 && local23.aByteArray50 != null) {
			local114 = local23.aByteArray50[arg0.anInt2051 + 1];
			local106 = arg0.anInt2054;
			if (arg0.anInt2051 < local23.aByteArray50.length - 2) {
				local145 = (local23.aByteArray50[arg0.anInt2051 + 2] & 0xFF) << 8;
				local133 = (local23.aByteArray50[arg0.anInt2051] & 0xFF) << 8;
				local114 += (local106 - local133) * (-local114 + local23.aByteArray50[arg0.anInt2051 + 3]) / (local145 - local133);
			}
			local39 = local114 * local39 + 32 >> 6;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V")
	private void method4583(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.method4583(local13);
			}
			return;
		}
		this.anIntArray581[arg0] = 12800;
		this.anIntArray575[arg0] = 8192;
		this.anIntArray587[arg0] = 16383;
		this.anIntArray583[arg0] = 8192;
		this.anIntArray576[arg0] = 0;
		this.anIntArray580[arg0] = 8192;
		this.method4571(arg0);
		this.method4578(arg0);
		this.anIntArray585[arg0] = 0;
		this.anIntArray579[arg0] = 32767;
		this.anIntArray584[arg0] = 256;
		this.anIntArray577[arg0] = 0;
		this.method4565(8192, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)V")
	private void method4584(@OriginalArg(0) int arg0) {
		for (@Pc(19) Class3_Sub13 local19 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1281(); local19 != null; local19 = (Class3_Sub13) this.aClass3_Sub15_Sub3_1.aClass56_11.method1278()) {
			if ((arg0 < 0 || arg0 == local19.anInt2043) && local19.anInt2054 < 0) {
				this.aClass3_Sub13ArrayArray2[local19.anInt2043][local19.anInt2059] = null;
				local19.anInt2054 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLclient!hn;I)V")
	public void method4585(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub13 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub11_Sub1_1.aByteArray59.length;
		@Pc(41) int local41;
		if (arg0 && arg1.aClass3_Sub11_Sub1_1.aBoolean313) {
			@Pc(24) int local24 = local8 + local8 - arg1.aClass3_Sub11_Sub1_1.anInt4385;
			local8 <<= 0x8;
			local41 = (int) ((long) local24 * (long) this.anIntArray577[arg1.anInt2043] >> 6);
			if (local8 <= local41) {
				arg1.aClass3_Sub15_Sub1_1.method2143();
				local41 = local8 + local8 - local41 - 1;
			}
		} else {
			local41 = (int) ((long) local8 * (long) this.anIntArray577[arg1.anInt2043] >> 6);
		}
		arg1.aClass3_Sub15_Sub1_1.method2120(local41);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(IIII)V")
	private void method4586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public synchronized void method4587() {
		for (@Pc(15) Class3_Sub22 local15 = (Class3_Sub22) this.aClass30_31.method664(); local15 != null; local15 = (Class3_Sub22) this.aClass30_31.method671()) {
			local15.method5013();
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Lclient!hn;I)I")
	private int method4588(@OriginalArg(0) Class3_Sub13 arg0) {
		@Pc(15) int local15 = arg0.anInt2041 + (arg0.anInt2055 * arg0.anInt2040 >> 12);
		local15 += (this.anIntArray583[arg0.anInt2043] - 8192) * this.anIntArray584[arg0.anInt2043] >> 12;
		@Pc(42) Class126 local42 = arg0.aClass126_1;
		@Pc(64) int local64;
		if (local42.anInt3822 > 0 && (local42.anInt3813 > 0 || this.anIntArray576[arg0.anInt2043] > 0)) {
			local64 = local42.anInt3813 << 2;
			@Pc(69) int local69 = local42.anInt3821 << 1;
			if (local69 > arg0.anInt2050) {
				local64 = arg0.anInt2050 * local64 / local69;
			}
			local64 += this.anIntArray576[arg0.anInt2043] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt2058 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local99 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass3_Sub11_Sub1_1.anInt4384 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static155.anInt2915 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()Lclient!ph;")
	@Override
	public synchronized Class3_Sub15 method4559() {
		return this.aClass3_Sub15_Sub3_1;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(III)V")
	private void method4589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass186_1.method4823()) {
			@Pc(14) int local14 = this.anInt5621 * this.aClass186_1.anInt5889 / Static155.anInt2915;
			do {
				@Pc(23) long local23 = this.aLong217 + (long) local14 * (long) arg2;
				if (this.aLong216 - local23 >= 0L) {
					this.aLong217 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong216 - this.aLong217 - 1L) / (long) local14);
				this.aLong217 += (long) local52 * (long) local14;
				arg2 -= local52;
				this.aClass3_Sub15_Sub3_1.method4560(arg0, arg1, local52);
				arg1 += local52;
				this.method4581();
			} while (this.aClass186_1.method4823());
		}
		this.aClass3_Sub15_Sub3_1.method4560(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)V")
	public synchronized void method4591() {
		this.method4572();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public synchronized void method4592() {
		this.method4596(true);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)I")
	public int method4593() {
		return this.anInt5613;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()Lclient!ph;")
	@Override
	public synchronized Class3_Sub15 method4563() {
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4561(@OriginalArg(0) int arg0) {
		if (this.aClass186_1.method4823()) {
			@Pc(19) int local19 = this.anInt5621 * this.aClass186_1.anInt5889 / Static155.anInt2915;
			do {
				@Pc(28) long local28 = (long) arg0 * (long) local19 + this.aLong217;
				if (this.aLong216 - local28 >= 0L) {
					this.aLong217 = local28;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local19 + this.aLong216 - this.aLong217 - 1L) / (long) local19);
				arg0 -= local58;
				this.aLong217 += (long) local58 * (long) local19;
				this.aClass3_Sub15_Sub3_1.method4561(local58);
				this.method4581();
			} while (this.aClass186_1.method4823());
		}
		this.aClass3_Sub15_Sub3_1.method4561(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(III)V")
	private void method4594(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray583[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZILclient!oo;)V")
	public synchronized void method4595(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub23 arg1) {
		this.method4573(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZB)V")
	private synchronized void method4596(@OriginalArg(0) boolean arg0) {
		this.aClass186_1.method4820();
		this.aClass3_Sub23_2 = null;
		this.method4569(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(IB)V")
	public synchronized void method4597(@OriginalArg(0) int arg0) {
		this.anInt5613 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
	public synchronized void method4598() {
		for (@Pc(9) Class3_Sub22 local9 = (Class3_Sub22) this.aClass30_31.method664(); local9 != null; local9 = (Class3_Sub22) this.aClass30_31.method671()) {
			local9.method3146();
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(II)V")
	private void method4599(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(28) int local28;
		@Pc(22) int local22;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			this.method4576(local22, local16, local28);
		} else if (local9 == 144) {
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			if (local22 <= 0) {
				this.method4576(64, local16, local28);
			} else {
				this.method4580(local28, local16, local22);
			}
		} else if (local9 == 160) {
			local22 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method4586(local22, local16, local28);
		} else if (local9 == 176) {
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			if (local28 == 0) {
				this.anIntArray573[local16] = (this.anIntArray573[local16] & 0xFFE03FFF) + (local22 << 14);
			}
			if (local28 == 32) {
				this.anIntArray573[local16] = (this.anIntArray573[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 1) {
				this.anIntArray576[local16] = (local22 << 7) + (this.anIntArray576[local16] & 0xFFFFC07F);
			}
			if (local28 == 33) {
				this.anIntArray576[local16] = (this.anIntArray576[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 5) {
				this.anIntArray580[local16] = (local22 << 7) + (this.anIntArray580[local16] & 0xFFFFC07F);
			}
			if (local28 == 37) {
				this.anIntArray580[local16] = local22 + (this.anIntArray580[local16] & 0xFFFFFF80);
			}
			if (local28 == 7) {
				this.anIntArray581[local16] = (this.anIntArray581[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 39) {
				this.anIntArray581[local16] = (this.anIntArray581[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 10) {
				this.anIntArray575[local16] = (local22 << 7) + (this.anIntArray575[local16] & 0xFFFFC07F);
			}
			if (local28 == 42) {
				this.anIntArray575[local16] = (this.anIntArray575[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 11) {
				this.anIntArray587[local16] = (this.anIntArray587[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 43) {
				this.anIntArray587[local16] = local22 + (this.anIntArray587[local16] & 0xFFFFFF80);
			}
			if (local28 == 64) {
				if (local22 < 64) {
					this.anIntArray585[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray585[local16] |= 0x1;
				}
			}
			if (local28 == 65) {
				if (local22 < 64) {
					this.method4571(local16);
					this.anIntArray585[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray585[local16] |= 0x2;
				}
			}
			if (local28 == 99) {
				this.anIntArray579[local16] = (local22 << 7) + (this.anIntArray579[local16] & 0x7F);
			}
			if (local28 == 98) {
				this.anIntArray579[local16] = (this.anIntArray579[local16] & 0x3F80) + local22;
			}
			if (local28 == 101) {
				this.anIntArray579[local16] = (local22 << 7) + (this.anIntArray579[local16] & 0x7F) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray579[local16] = local22 + (this.anIntArray579[local16] & 0x3F80) + 16384;
			}
			if (local28 == 120) {
				this.method4579(local16);
			}
			if (local28 == 121) {
				this.method4583(local16);
			}
			if (local28 == 123) {
				this.method4584(local16);
			}
			@Pc(518) int local518;
			if (local28 == 6) {
				local518 = this.anIntArray579[local16];
				if (local518 == 16384) {
					this.anIntArray584[local16] = (this.anIntArray584[local16] & 0xFFFFC07F) + (local22 << 7);
				}
			}
			if (local28 == 38) {
				local518 = this.anIntArray579[local16];
				if (local518 == 16384) {
					this.anIntArray584[local16] = (this.anIntArray584[local16] & 0xFFFFFF80) + local22;
				}
			}
			if (local28 == 16) {
				this.anIntArray577[local16] = (this.anIntArray577[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 48) {
				this.anIntArray577[local16] = local22 + (this.anIntArray577[local16] & 0xFFFFFF80);
			}
			if (local28 == 81) {
				if (local22 < 64) {
					this.method4578(local16);
					this.anIntArray585[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray585[local16] |= 0x4;
				}
			}
			if (local28 == 17) {
				this.method4565((this.anIntArray588[local16] & 0xFFFFC07F) + (local22 << 7), local16);
			}
			if (local28 == 49) {
				this.method4565(local22 + (this.anIntArray588[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method4568(local28 + this.anIntArray573[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method4589(local28, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local28 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method4594(local28, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4569(true);
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4564() {
		return 0;
	}
}
