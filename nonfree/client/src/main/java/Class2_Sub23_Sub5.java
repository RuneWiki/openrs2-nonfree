import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class2_Sub23_Sub5 extends Class2_Sub23 {

	@OriginalMember(owner = "client!rha", name = "Ab", descriptor = "I")
	private int anInt8698;

	@OriginalMember(owner = "client!rha", name = "ab", descriptor = "I")
	private int anInt8699;

	@OriginalMember(owner = "client!rha", name = "Cb", descriptor = "J")
	private long aLong275;

	@OriginalMember(owner = "client!rha", name = "x", descriptor = "Z")
	private boolean aBoolean740;

	@OriginalMember(owner = "client!rha", name = "pb", descriptor = "J")
	private long aLong276;

	@OriginalMember(owner = "client!rha", name = "nb", descriptor = "I")
	private int anInt8700;

	@OriginalMember(owner = "client!rha", name = "sb", descriptor = "Z")
	private boolean aBoolean741;

	@OriginalMember(owner = "client!rha", name = "tb", descriptor = "Lclient!eu;")
	private Class2_Sub21 aClass2_Sub21_4;

	@OriginalMember(owner = "client!rha", name = "Y", descriptor = "[I")
	private final int[] anIntArray624 = new int[16];

	@OriginalMember(owner = "client!rha", name = "G", descriptor = "[I")
	private final int[] anIntArray623 = new int[16];

	@OriginalMember(owner = "client!rha", name = "yb", descriptor = "[I")
	public final int[] anIntArray618 = new int[16];

	@OriginalMember(owner = "client!rha", name = "fb", descriptor = "[I")
	private final int[] anIntArray617 = new int[16];

	@OriginalMember(owner = "client!rha", name = "K", descriptor = "[I")
	private final int[] anIntArray627 = new int[16];

	@OriginalMember(owner = "client!rha", name = "V", descriptor = "[I")
	private final int[] anIntArray620 = new int[16];

	@OriginalMember(owner = "client!rha", name = "I", descriptor = "[I")
	public final int[] anIntArray621 = new int[16];

	@OriginalMember(owner = "client!rha", name = "D", descriptor = "[I")
	private final int[] anIntArray626 = new int[16];

	@OriginalMember(owner = "client!rha", name = "eb", descriptor = "I")
	private int anInt8676 = 256;

	@OriginalMember(owner = "client!rha", name = "H", descriptor = "[I")
	private final int[] anIntArray625 = new int[16];

	@OriginalMember(owner = "client!rha", name = "Mb", descriptor = "[I")
	private final int[] anIntArray622 = new int[16];

	@OriginalMember(owner = "client!rha", name = "E", descriptor = "[I")
	private final int[] anIntArray629 = new int[16];

	@OriginalMember(owner = "client!rha", name = "S", descriptor = "[I")
	private int[] anIntArray619 = new int[16];

	@OriginalMember(owner = "client!rha", name = "mb", descriptor = "[I")
	private final int[] anIntArray631 = new int[16];

	@OriginalMember(owner = "client!rha", name = "F", descriptor = "[I")
	public final int[] anIntArray630 = new int[16];

	@OriginalMember(owner = "client!rha", name = "v", descriptor = "[[Lclient!kka;")
	private final Class2_Sub37[][] aClass2_Sub37ArrayArray2 = new Class2_Sub37[16][128];

	@OriginalMember(owner = "client!rha", name = "Eb", descriptor = "[I")
	private final int[] anIntArray632 = new int[16];

	@OriginalMember(owner = "client!rha", name = "zb", descriptor = "I")
	private final int anInt8695 = 1000000;

	@OriginalMember(owner = "client!rha", name = "Z", descriptor = "[I")
	private final int[] anIntArray628 = new int[16];

	@OriginalMember(owner = "client!rha", name = "hb", descriptor = "[[Lclient!kka;")
	private final Class2_Sub37[][] aClass2_Sub37ArrayArray1 = new Class2_Sub37[16][128];

	@OriginalMember(owner = "client!rha", name = "gb", descriptor = "Lclient!rw;")
	private final Class333 aClass333_1 = new Class333();

	@OriginalMember(owner = "client!rha", name = "Lb", descriptor = "Lclient!qi;")
	private final Class2_Sub23_Sub4 aClass2_Sub23_Sub4_1 = new Class2_Sub23_Sub4(this);

	@OriginalMember(owner = "client!rha", name = "ob", descriptor = "Lclient!lba;")
	private final Class218 aClass218_39;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "()V")
	public Class2_Sub23_Sub5() {
		this.aClass218_39 = new Class218(128);
		this.method7711(-1, 256);
		this.method7683(true);
	}

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lclient!rha;)V")
	public Class2_Sub23_Sub5(@OriginalArg(0) Class2_Sub23_Sub5 arg0) {
		this.aClass218_39 = arg0.aClass218_39;
		this.method7711(-1, 256);
		this.method7683(true);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "([ILclient!kka;III)Z")
	public boolean method7678(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub37 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg1.anInt5151 = Static24.anInt294 / 100;
		if (arg1.anInt5159 >= 0 && (arg1.aClass2_Sub23_Sub2_2 == null || arg1.aClass2_Sub23_Sub2_2.method4488())) {
			arg1.method4668();
			arg1.method9872();
			if (arg1.anInt5153 > 0 && this.aClass2_Sub37ArrayArray1[arg1.anInt5152][arg1.anInt5153] == arg1) {
				this.aClass2_Sub37ArrayArray1[arg1.anInt5152][arg1.anInt5153] = null;
			}
			return true;
		}
		@Pc(66) int local66 = arg1.anInt5150;
		if (arg4 != 3) {
			this.anIntArray619 = null;
		}
		if (local66 > 0) {
			local66 -= (int) (Math.pow(2.0D, (double) this.anIntArray626[arg1.anInt5152] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local66 < 0) {
				local66 = 0;
			}
			arg1.anInt5150 = local66;
		}
		arg1.aClass2_Sub23_Sub2_2.method4481(this.method7698(arg1));
		@Pc(111) Class124 local111 = arg1.aClass124_1;
		@Pc(113) boolean local113 = false;
		arg1.anInt5161++;
		arg1.anInt5160 += local111.anInt3046;
		@Pc(144) double local144 = (double) ((arg1.anInt5149 - 60 << 8) + (arg1.anInt5154 * arg1.anInt5150 >> 12)) * 5.086263020833333E-6D;
		if (local111.anInt3037 > 0) {
			if (local111.anInt3035 <= 0) {
				arg1.anInt5157 += 128;
			} else {
				arg1.anInt5157 += (int) (Math.pow(2.0D, (double) local111.anInt3035 * local144) * 128.0D + 0.5D);
			}
			if (arg1.anInt5157 * local111.anInt3037 >= 819200) {
				local113 = true;
			}
		}
		if (local111.aByteArray36 != null) {
			if (local111.anInt3043 > 0) {
				arg1.anInt5165 += (int) (Math.pow(2.0D, local144 * (double) local111.anInt3043) * 128.0D + 0.5D);
			} else {
				arg1.anInt5165 += 128;
			}
			while (local111.aByteArray36.length - 2 > arg1.anInt5162 && (local111.aByteArray36[arg1.anInt5162 + 2] & 0xFF) << 8 < arg1.anInt5165) {
				arg1.anInt5162 += 2;
			}
			if (arg1.anInt5162 == local111.aByteArray36.length - 2 && local111.aByteArray36[arg1.anInt5162 + 1] == 0) {
				local113 = true;
			}
		}
		if (arg1.anInt5159 >= 0 && local111.aByteArray35 != null && (this.anIntArray618[arg1.anInt5152] & 0x1) == 0 && (arg1.anInt5153 < 0 || arg1 != this.aClass2_Sub37ArrayArray1[arg1.anInt5152][arg1.anInt5153])) {
			if (local111.anInt3036 <= 0) {
				arg1.anInt5159 += 128;
			} else {
				arg1.anInt5159 += (int) (Math.pow(2.0D, (double) local111.anInt3036 * local144) * 128.0D + 0.5D);
			}
			while (local111.aByteArray35.length - 2 > arg1.anInt5155 && arg1.anInt5159 > (local111.aByteArray35[arg1.anInt5155 + 2] & 0xFF) << 8) {
				arg1.anInt5155 += 2;
			}
			if (arg1.anInt5155 == local111.aByteArray35.length - 2) {
				local113 = true;
			}
		}
		if (!local113) {
			arg1.aClass2_Sub23_Sub2_2.method4486(arg1.anInt5151, this.method7688(arg1), this.method7707(arg1));
			return false;
		}
		arg1.aClass2_Sub23_Sub2_2.method4517(arg1.anInt5151);
		if (arg0 == null) {
			arg1.aClass2_Sub23_Sub2_2.method7671(arg3);
		} else {
			arg1.aClass2_Sub23_Sub2_2.method7675(arg0, arg2, arg3);
		}
		if (arg1.aClass2_Sub23_Sub2_2.method4511()) {
			this.aClass2_Sub23_Sub4_1.aClass2_Sub23_Sub3_2.method6795(arg1.aClass2_Sub23_Sub2_2);
		}
		arg1.method4668();
		if (arg1.anInt5159 >= 0) {
			arg1.method9872();
			if (arg1.anInt5153 > 0 && arg1 == this.aClass2_Sub37ArrayArray1[arg1.anInt5152][arg1.anInt5153]) {
				this.aClass2_Sub37ArrayArray1[arg1.anInt5152][arg1.anInt5153] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IB)V")
	private void method7679(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method7712(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method7712(local18, local24, 64);
			} else {
				this.method7705(local18, local24, local30);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method7701(local24, local18, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray631[local18] = (this.anIntArray631[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray631[local18] = (this.anIntArray631[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray620[local18] = (local30 << 7) + (this.anIntArray620[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray620[local18] = (this.anIntArray620[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray626[local18] = (this.anIntArray626[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray626[local18] = local30 + (this.anIntArray626[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray617[local18] = (local30 << 7) + (this.anIntArray617[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray617[local18] = local30 + (this.anIntArray617[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray619[local18] = (local30 << 7) + (this.anIntArray619[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray619[local18] = local30 + (this.anIntArray619[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray628[local18] = (local30 << 7) + (this.anIntArray628[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray628[local18] = (this.anIntArray628[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray618[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray618[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method7692(local18);
					this.anIntArray618[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray618[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray627[local18] = (local30 << 7) + (this.anIntArray627[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray627[local18] = local30 + (this.anIntArray627[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray627[local18] = (this.anIntArray627[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray627[local18] = local30 + (this.anIntArray627[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method7703(local18);
			}
			if (local24 == 121) {
				this.method7684(local18);
			}
			if (local24 == 123) {
				this.method7690(local18);
			}
			@Pc(552) int local552;
			if (local24 == 6) {
				local552 = this.anIntArray627[local18];
				if (local552 == 16384) {
					this.anIntArray624[local18] = (local30 << 7) + (this.anIntArray624[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local552 = this.anIntArray627[local18];
				if (local552 == 16384) {
					this.anIntArray624[local18] = (this.anIntArray624[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray630[local18] = (this.anIntArray630[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray630[local18] = (this.anIntArray630[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method7706(local18);
					this.anIntArray618[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray618[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method7709((this.anIntArray632[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method7709((this.anIntArray632[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method7714(local24 + this.anIntArray631[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method7702(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method7700(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method7683(true);
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!kka;B)Z")
	public boolean method7680(@OriginalArg(0) Class2_Sub37 arg0) {
		if (arg0.aClass2_Sub23_Sub2_2 != null) {
			return false;
		}
		if (arg0.anInt5159 >= 0) {
			arg0.method9872();
			if (arg0.anInt5153 > 0 && this.aClass2_Sub37ArrayArray1[arg0.anInt5152][arg0.anInt5153] == arg0) {
				this.aClass2_Sub37ArrayArray1[arg0.anInt5152][arg0.anInt5153] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)V")
	public synchronized void method7681() {
		this.method7687(true);
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public synchronized Class2_Sub23 method7677() {
		return null;
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(BI)V")
	public synchronized void method7682(@OriginalArg(1) int arg0) {
		this.anInt8676 = arg0;
	}

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public synchronized Class2_Sub23 method7676() {
		return this.aClass2_Sub23_Sub4_1;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZI)V")
	private void method7683(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method7703(-1);
		} else {
			this.method7690(-1);
		}
		this.method7684(-1);
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray629[local35] = this.anIntArray623[local35];
		}
		for (@Pc(53) int local53 = 0; local53 < 16; local53++) {
			this.anIntArray631[local53] = this.anIntArray623[local53] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(II)V")
	private void method7684(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method7684(local9);
			}
			return;
		}
		this.anIntArray617[arg0] = 12800;
		this.anIntArray619[arg0] = 8192;
		this.anIntArray628[arg0] = 16383;
		this.anIntArray625[arg0] = 8192;
		this.anIntArray620[arg0] = 0;
		this.anIntArray626[arg0] = 8192;
		this.method7692(arg0);
		this.method7706(arg0);
		this.anIntArray618[arg0] = 0;
		this.anIntArray627[arg0] = 32767;
		this.anIntArray624[arg0] = 256;
		this.anIntArray630[arg0] = 0;
		this.method7709(8192, arg0);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZZLclient!eu;)V")
	public synchronized void method7685(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		this.method7697(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!eu;Lclient!nca;BLclient!aea;I)Z")
	public synchronized boolean method7686(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(3) Class6 arg2) {
		arg0.method2359();
		@Pc(22) boolean local22 = true;
		@Pc(36) int[] local36 = new int[] { 22050 };
		for (@Pc(42) Class2_Sub9 local42 = (Class2_Sub9) arg0.aClass218_11.method5092(); local42 != null; local42 = (Class2_Sub9) arg0.aClass218_11.method5096()) {
			@Pc(50) int local50 = (int) local42.aLong352;
			@Pc(58) Class2_Sub56 local58 = (Class2_Sub56) this.aClass218_39.method5095((long) local50, 0);
			if (local58 == null) {
				local58 = Static132.method1921(arg1, local50);
				if (local58 == null) {
					local22 = false;
					continue;
				}
				this.aClass218_39.method5099(local58, (long) local50);
			}
			if (!local58.method9516(arg2, local42.aByteArray8, local36)) {
				local22 = false;
			}
		}
		if (local22) {
			arg0.method2360();
		}
		return local22;
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "()I")
	@Override
	public synchronized int method7674() {
		return 0;
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(ZI)V")
	private synchronized void method7687(@OriginalArg(0) boolean arg0) {
		this.aClass333_1.method7880();
		this.aClass2_Sub21_4 = null;
		this.method7683(arg0);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!kka;Z)I")
	private int method7688(@OriginalArg(0) Class2_Sub37 arg0) {
		if (this.anIntArray622[arg0.anInt5152] == 0) {
			return 0;
		}
		@Pc(15) Class124 local15 = arg0.aClass124_1;
		@Pc(31) int local31 = this.anIntArray617[arg0.anInt5152] * this.anIntArray628[arg0.anInt5152] + 4096 >> 13;
		@Pc(39) int local39 = local31 * local31 + 16384 >> 15;
		@Pc(61) int local61 = local39 * arg0.anInt5167 + 16384 >> 15;
		@Pc(70) int local70 = local61 * this.anInt8676 + 128 >> 8;
		local31 = this.anIntArray622[arg0.anInt5152] * local70 + 128 >> 8;
		if (local15.anInt3037 > 0) {
			local31 = (int) (Math.pow(0.5D, (double) arg0.anInt5157 * 1.953125E-5D * (double) local15.anInt3037) * (double) local31 + 0.5D);
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local15.aByteArray36 != null) {
			local109 = arg0.anInt5165;
			local117 = local15.aByteArray36[arg0.anInt5162 + 1];
			if (local15.aByteArray36.length - 2 > arg0.anInt5162) {
				local135 = (local15.aByteArray36[arg0.anInt5162] & 0xFF) << 8;
				local147 = (local15.aByteArray36[arg0.anInt5162 + 2] & 0xFF) << 8;
				local117 += (local15.aByteArray36[arg0.anInt5162 + 3] - local117) * (local109 + -local135) / (local147 - local135);
			}
			local31 = local117 * local31 + 32 >> 6;
		}
		if (arg0.anInt5159 > 0 && local15.aByteArray35 != null) {
			local109 = arg0.anInt5159;
			local117 = local15.aByteArray35[arg0.anInt5155 + 1];
			if (arg0.anInt5155 < local15.aByteArray35.length - 2) {
				local135 = (local15.aByteArray35[arg0.anInt5155] & 0xFF) << 8;
				local147 = (local15.aByteArray35[arg0.anInt5155 + 2] & 0xFF) << 8;
				local117 += (local15.aByteArray35[arg0.anInt5155 + 3] - local117) * (local109 + -local135) / (local147 - local135);
			}
			local31 = local117 * local31 + 32 >> 6;
		}
		return local31;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)V")
	private void method7689() {
		this.anIntArray623[9] = 128;
		this.anIntArray631[9] = 128;
		this.method7714(128, 9);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(BI)V")
	private void method7690(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1226(7); local10 != null; local10 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1228()) {
			if ((arg0 < 0 || local10.anInt5152 == arg0) && local10.anInt5159 < 0) {
				this.aClass2_Sub37ArrayArray2[local10.anInt5152][local10.anInt5149] = null;
				local10.anInt5159 = 0;
			}
		}
		if (-27 != -27) {
			this.method7678((int[]) null, (Class2_Sub37) null, 123, -108, -48);
		}
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "(II)V")
	private void method7692(@OriginalArg(0) int arg0) {
		if ((this.anIntArray618[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(16) Class2_Sub37 local16 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1226(7); local16 != null; local16 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1228()) {
			if (local16.anInt5152 == arg0 && this.aClass2_Sub37ArrayArray2[arg0][local16.anInt5149] == null && local16.anInt5159 < 0) {
				local16.anInt5159 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "(B)V")
	public synchronized void method7693() {
		for (@Pc(9) Class2_Sub56 local9 = (Class2_Sub56) this.aClass218_39.method5092(); local9 != null; local9 = (Class2_Sub56) this.aClass218_39.method5096()) {
			local9.method9515();
		}
		if (32 != 32) {
			this.method7696(61);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZJZLclient!eu;I)V")
	public synchronized void method7694(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class2_Sub21 arg2) {
		this.method7697(arg0, true, arg2);
		this.method7710(arg1 * (long) this.aClass333_1.anInt8902);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7675(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass333_1.method7877()) {
			@Pc(18) int local18 = this.anInt8695 * this.aClass333_1.anInt8902 / Static24.anInt294;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong275;
				if (this.aLong276 - local27 >= 0L) {
					this.aLong275 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong276 - this.aLong275 - 1L) / (long) local18);
				this.aLong275 += (long) local55 * (long) local18;
				this.aClass2_Sub23_Sub4_1.method7675(arg0, arg1, local55);
				arg1 += local55;
				this.method7704();
				arg2 -= local55;
			} while (this.aClass333_1.method7877());
		}
		this.aClass2_Sub23_Sub4_1.method7675(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "(B)Z")
	public synchronized boolean method7695() {
		return this.aClass333_1.method7877();
	}

	@OriginalMember(owner = "client!rha", name = "f", descriptor = "(I)I")
	public int method7696(@OriginalArg(0) int arg0) {
		return arg0 == 255 ? this.anInt8676 : -111;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7671(@OriginalArg(0) int arg0) {
		if (this.aClass333_1.method7877()) {
			@Pc(14) int local14 = this.anInt8695 * this.aClass333_1.anInt8902 / Static24.anInt294;
			do {
				@Pc(24) long local24 = this.aLong275 + (long) arg0 * (long) local14;
				if (this.aLong276 - local24 >= 0L) {
					this.aLong275 = local24;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong276 + (long) local14 - this.aLong275 - 1L) / (long) local14);
				this.aLong275 += (long) local14 * (long) local55;
				arg0 -= local55;
				this.aClass2_Sub23_Sub4_1.method7671(local55);
				this.method7704();
			} while (this.aClass333_1.method7877());
		}
		this.aClass2_Sub23_Sub4_1.method7671(arg0);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZBZLclient!eu;)V")
	private synchronized void method7697(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub21 arg2) {
		this.method7687(arg1);
		this.aClass333_1.method7875(arg2.aByteArray32);
		this.aBoolean740 = arg0;
		this.aLong275 = 0L;
		@Pc(32) int local32 = this.aClass333_1.method7871();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass333_1.method7867(local34);
			this.aClass333_1.method7876(local34);
			this.aClass333_1.method7866(local34);
		}
		this.anInt8698 = this.aClass333_1.method7870();
		this.anInt8699 = this.aClass333_1.anIntArray644[this.anInt8698];
		this.aLong276 = this.aClass333_1.method7873(this.anInt8699);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILclient!kka;)I")
	private int method7698(@OriginalArg(1) Class2_Sub37 arg0) {
		@Pc(14) int local14 = (arg0.anInt5150 * arg0.anInt5154 >> 12) + arg0.anInt5158;
		local14 += (this.anIntArray625[arg0.anInt5152] - 8192) * this.anIntArray624[arg0.anInt5152] >> 12;
		@Pc(35) Class124 local35 = arg0.aClass124_1;
		@Pc(62) int local62;
		if (local35.anInt3046 > 0 && (local35.anInt3044 > 0 || this.anIntArray620[arg0.anInt5152] > 0)) {
			local62 = local35.anInt3044 << 2;
			@Pc(67) int local67 = local35.anInt3040 << 1;
			if (arg0.anInt5161 < local67) {
				local62 = arg0.anInt5161 * local62 / local67;
			}
			local62 += this.anIntArray620[arg0.anInt5152] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt5160 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local97 * (double) local62);
		}
		local62 = (int) ((double) (arg0.aClass2_Sub4_Sub1_2.anInt8532 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static24.anInt294 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIZ)V")
	public synchronized void method7699() {
		this.method7689();
	}

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "(III)V")
	private void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray625[arg1] = arg0;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIII)V")
	private void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "(III)V")
	private void method7702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(II)V")
	private void method7703(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub37 local8 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1226(7); local8 != null; local8 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1228()) {
			if (arg0 < 0 || local8.anInt5152 == arg0) {
				if (local8.aClass2_Sub23_Sub2_2 != null) {
					local8.aClass2_Sub23_Sub2_2.method4517(Static24.anInt294 / 100);
					if (local8.aClass2_Sub23_Sub2_2.method4511()) {
						this.aClass2_Sub23_Sub4_1.aClass2_Sub23_Sub3_2.method6795(local8.aClass2_Sub23_Sub2_2);
					}
					local8.method4668();
				}
				if (local8.anInt5159 < 0) {
					this.aClass2_Sub37ArrayArray2[local8.anInt5152][local8.anInt5149] = null;
				}
				local8.method9872();
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)V")
	private void method7704() {
		@Pc(8) int local8 = this.anInt8698;
		@Pc(16) int local16 = this.anInt8699;
		@Pc(19) long local19 = this.aLong276;
		if (this.aClass2_Sub21_4 != null && this.anInt8700 == local16) {
			this.method7697(this.aBoolean740, this.aBoolean741, this.aClass2_Sub21_4);
			this.method7704();
			return;
		}
		while (local16 == this.anInt8699) {
			while (this.aClass333_1.anIntArray644[local8] == local16) {
				this.aClass333_1.method7867(local8);
				@Pc(51) int local51 = this.aClass333_1.method7868(local8);
				if (local51 == 1) {
					this.aClass333_1.method7878();
					this.aClass333_1.method7866(local8);
					if (this.aClass333_1.method7869()) {
						if (this.aClass2_Sub21_4 != null) {
							this.method7685(this.aBoolean740, this.aClass2_Sub21_4);
							this.method7704();
							return;
						}
						if (!this.aBoolean740 || local16 == 0) {
							this.method7683(true);
							this.aClass333_1.method7880();
							return;
						}
						this.aClass333_1.method7879(local19);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method7679(local51);
				}
				this.aClass333_1.method7876(local8);
				this.aClass333_1.method7866(local8);
			}
			local8 = this.aClass333_1.method7870();
			local16 = this.aClass333_1.anIntArray644[local8];
			local19 = this.aClass333_1.method7873(local16);
		}
		this.aLong276 = local19;
		this.anInt8698 = local8;
		this.anInt8699 = local16;
		if (this.aClass2_Sub21_4 != null && this.anInt8700 < local16) {
			this.anInt8698 = -1;
			this.anInt8699 = this.anInt8700;
			this.aLong276 = this.aClass333_1.method7873(this.anInt8699);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZIII)V")
	private void method7705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method7712(arg0, arg1, 64);
		if ((this.anIntArray618[arg0] & 0x2) != 0) {
			for (@Pc(33) Class2_Sub37 local33 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1227(); local33 != null; local33 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1224()) {
				if (arg0 == local33.anInt5152 && local33.anInt5159 < 0) {
					this.aClass2_Sub37ArrayArray2[arg0][local33.anInt5149] = null;
					this.aClass2_Sub37ArrayArray2[arg0][arg1] = local33;
					@Pc(76) int local76 = local33.anInt5158 + (local33.anInt5150 * local33.anInt5154 >> 12);
					local33.anInt5158 += arg1 - local33.anInt5149 << 8;
					local33.anInt5154 = local76 - local33.anInt5158;
					local33.anInt5149 = arg1;
					local33.anInt5150 = 4096;
					return;
				}
			}
		}
		@Pc(122) Class2_Sub56 local122 = (Class2_Sub56) this.aClass218_39.method5095((long) this.anIntArray629[arg0], 0);
		if (local122 == null) {
			return;
		}
		@Pc(131) Class2_Sub4_Sub1 local131 = local122.aClass2_Sub4_Sub1Array1[arg1];
		if (local131 == null) {
			return;
		}
		@Pc(139) Class2_Sub37 local139 = new Class2_Sub37();
		local139.aClass2_Sub56_1 = local122;
		local139.anInt5152 = arg0;
		local139.aClass2_Sub4_Sub1_2 = local131;
		local139.aClass124_1 = local122.aClass124Array1[arg1];
		local139.anInt5153 = local122.aByteArray123[arg1];
		local139.anInt5149 = arg1;
		local139.anInt5167 = local122.anInt10899 * arg2 * arg2 * local122.aByteArray121[arg1] + 1024 >> 11;
		local139.anInt5164 = local122.aByteArray122[arg1] & 0xFF;
		local139.anInt5158 = (arg1 << 8) - (local122.aShortArray147[arg1] & 0x7FFF);
		local139.anInt5162 = 0;
		local139.anInt5159 = -1;
		local139.anInt5155 = 0;
		local139.anInt5157 = 0;
		local139.anInt5165 = 0;
		if (this.anIntArray630[arg0] == 0) {
			local139.aClass2_Sub23_Sub2_2 = Static733.method4506(local131, this.method7698(local139), this.method7688(local139), this.method7707(local139));
		} else {
			local139.aClass2_Sub23_Sub2_2 = Static733.method4506(local131, this.method7698(local139), 0, this.method7707(local139));
			this.method7708(local139, local122.aShortArray147[arg1] < 0);
		}
		if (local122.aShortArray147[arg1] < 0) {
			local139.aClass2_Sub23_Sub2_2.method4498(-1);
		}
		if (local139.anInt5153 >= 0) {
			@Pc(300) Class2_Sub37 local300 = this.aClass2_Sub37ArrayArray1[arg0][local139.anInt5153];
			if (local300 != null && local300.anInt5159 < 0) {
				this.aClass2_Sub37ArrayArray2[arg0][local300.anInt5149] = null;
				local300.anInt5159 = 0;
			}
			this.aClass2_Sub37ArrayArray1[arg0][local139.anInt5153] = local139;
		}
		this.aClass2_Sub23_Sub4_1.aClass60_165.method1233(local139);
		this.aClass2_Sub37ArrayArray2[arg0][arg1] = local139;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZ)V")
	private void method7706(@OriginalArg(0) int arg0) {
		if ((this.anIntArray618[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(27) Class2_Sub37 local27 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1226(7); local27 != null; local27 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1228()) {
			if (local27.anInt5152 == arg0) {
				local27.anInt5166 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(Lclient!kka;Z)I")
	private int method7707(@OriginalArg(0) Class2_Sub37 arg0) {
		@Pc(9) int local9 = this.anIntArray619[arg0.anInt5152];
		return local9 < 8192 ? arg0.anInt5164 * local9 + 32 >> 6 : 16384 - ((128 - arg0.anInt5164) * (-local9 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!kka;ZZ)V")
	public void method7708(@OriginalArg(0) Class2_Sub37 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(13) int local13 = arg0.aClass2_Sub4_Sub1_2.aByteArray102.length;
		@Pc(48) int local48;
		if (arg1 && arg0.aClass2_Sub4_Sub1_2.aBoolean731) {
			@Pc(31) int local31 = local13 + local13 - arg0.aClass2_Sub4_Sub1_2.anInt8533;
			local13 <<= 0x8;
			local48 = (int) ((long) local31 * (long) this.anIntArray630[arg0.anInt5152] >> 6);
			if (local13 <= local48) {
				local48 = local13 + local13 - local48 - 1;
				arg0.aClass2_Sub23_Sub2_2.method4518();
			}
		} else {
			local48 = (int) ((long) local13 * (long) this.anIntArray630[arg0.anInt5152] >> 6);
		}
		arg0.aClass2_Sub23_Sub2_2.method4495(local48);
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "(III)V")
	private void method7709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray632[arg1] = arg0;
		this.anIntArray621[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IJ)V")
	private void method7710(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong276) {
			@Pc(21) int local21 = this.anInt8698;
			@Pc(24) int local24 = this.anInt8699;
			@Pc(27) long local27 = this.aLong276;
			while (this.anInt8699 == local24) {
				while (local24 == this.aClass333_1.anIntArray644[local21]) {
					this.aClass333_1.method7867(local21);
					@Pc(40) int local40 = this.aClass333_1.method7868(local21);
					if (local40 == 1) {
						this.aClass333_1.method7878();
						this.aClass333_1.method7866(local21);
						if (this.aClass333_1.method7869()) {
							if (!this.aBoolean740 || local24 == 0) {
								this.method7683(true);
								this.aClass333_1.method7880();
								return;
							}
							this.aClass333_1.method7879(local27);
						}
						break;
					}
					if ((local40 & 0x80) != 0 && (local40 & 0xF0) != 144) {
						this.method7679(local40);
					}
					this.aClass333_1.method7876(local21);
					this.aClass333_1.method7866(local21);
				}
				this.aLong275 = local27;
				local21 = this.aClass333_1.method7870();
				local24 = this.aClass333_1.anIntArray644[local21];
				local27 = this.aClass333_1.method7873(local24);
			}
			this.aLong276 = local27;
			this.anInt8698 = local21;
			this.anInt8699 = local24;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZI)V")
	public synchronized void method7711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0) {
			for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
				this.anIntArray622[local16] = arg1;
			}
		} else {
			this.anIntArray622[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(IIII)V")
	private void method7712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class2_Sub37 local12 = this.aClass2_Sub37ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub37ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray618[arg0] & 0x2) == 0) {
			local12.anInt5159 = 0;
			return;
		}
		for (@Pc(40) Class2_Sub37 local40 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1226(7); local40 != null; local40 = (Class2_Sub37) this.aClass2_Sub23_Sub4_1.aClass60_165.method1228()) {
			if (local12.anInt5152 == local40.anInt5152 && local40.anInt5159 < 0 && local12 != local40) {
				local12.anInt5159 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "(I)V")
	public synchronized void method7713() {
		for (@Pc(11) Class2_Sub56 local11 = (Class2_Sub56) this.aClass218_39.method5092(); local11 != null; local11 = (Class2_Sub56) this.aClass218_39.method5096()) {
			local11.method9872();
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(III)V")
	private void method7714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray629[arg1]) {
			this.anIntArray629[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass2_Sub37ArrayArray1[arg1][local18] = null;
			}
		}
	}
}
