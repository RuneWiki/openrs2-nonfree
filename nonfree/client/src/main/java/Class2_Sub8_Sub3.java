import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class2_Sub8_Sub3 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ma", name = "Hb", descriptor = "I")
	private int anInt6811;

	@OriginalMember(owner = "client!ma", name = "Ib", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!ma", name = "Kb", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!ma", name = "Lb", descriptor = "I")
	private int anInt6812;

	@OriginalMember(owner = "client!ma", name = "Mb", descriptor = "Z")
	private boolean aBoolean498;

	@OriginalMember(owner = "client!ma", name = "Nb", descriptor = "I")
	private int anInt6813;

	@OriginalMember(owner = "client!ma", name = "Ob", descriptor = "Lclient!dl;")
	private Class2_Sub14 aClass2_Sub14_7;

	@OriginalMember(owner = "client!ma", name = "Pb", descriptor = "Z")
	private boolean aBoolean499;

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "[I")
	private final int[] anIntArray415 = new int[16];

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "[[Lclient!vv;")
	private final Class2_Sub49[][] aClass2_Sub49ArrayArray1 = new Class2_Sub49[16][128];

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "[I")
	private final int[] anIntArray418 = new int[16];

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "[I")
	public final int[] anIntArray420 = new int[16];

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "[I")
	public final int[] anIntArray419 = new int[16];

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "[I")
	private final int[] anIntArray413 = new int[16];

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "[I")
	private final int[] anIntArray416 = new int[16];

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "[I")
	private final int[] anIntArray422 = new int[16];

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "[I")
	private final int[] anIntArray417 = new int[16];

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "[I")
	public final int[] anIntArray414 = new int[16];

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "[[Lclient!vv;")
	private final Class2_Sub49[][] aClass2_Sub49ArrayArray2 = new Class2_Sub49[16][128];

	@OriginalMember(owner = "client!ma", name = "ob", descriptor = "[I")
	private final int[] anIntArray423 = new int[16];

	@OriginalMember(owner = "client!ma", name = "qb", descriptor = "[I")
	private final int[] anIntArray424 = new int[16];

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
	private final int anInt6787 = 1000000;

	@OriginalMember(owner = "client!ma", name = "tb", descriptor = "[I")
	private final int[] anIntArray425 = new int[16];

	@OriginalMember(owner = "client!ma", name = "wb", descriptor = "[I")
	private final int[] anIntArray426 = new int[16];

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "[I")
	private final int[] anIntArray421 = new int[16];

	@OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
	private int anInt6796 = 256;

	@OriginalMember(owner = "client!ma", name = "Eb", descriptor = "[I")
	private final int[] anIntArray428 = new int[16];

	@OriginalMember(owner = "client!ma", name = "yb", descriptor = "[I")
	private final int[] anIntArray427 = new int[16];

	@OriginalMember(owner = "client!ma", name = "vb", descriptor = "Lclient!rf;")
	private final Class293 aClass293_1 = new Class293();

	@OriginalMember(owner = "client!ma", name = "Jb", descriptor = "Lclient!bea;")
	private final Class2_Sub8_Sub1 aClass2_Sub8_Sub1_1 = new Class2_Sub8_Sub1(this);

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Lclient!eq;")
	private final Class99 aClass99_47;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class2_Sub8_Sub3() {
		this.aClass99_47 = new Class99(128);
		this.method5785(256, -1);
		this.method5793(true);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!ma;)V")
	public Class2_Sub8_Sub3(@OriginalArg(0) Class2_Sub8_Sub3 arg0) {
		this.aClass99_47 = arg0.aClass99_47;
		this.method5785(256, -1);
		this.method5793(true);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()Lclient!jba;")
	@Override
	public synchronized Class2_Sub8 method8817() {
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZB)V")
	private synchronized void method5782(@OriginalArg(0) boolean arg0) {
		this.aClass293_1.method7537();
		this.aClass2_Sub14_7 = null;
		this.method5793(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(III)V")
	public synchronized void method5783() {
		this.method5796();
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	private void method5784(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method5791(local28, local22, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method5791(64, local22, local16);
			} else {
				this.method5795(local28, local22, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method5805(local28, local16, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray427[local16] = (local28 << 14) + (this.anIntArray427[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray427[local16] = (local28 << 7) + (this.anIntArray427[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray416[local16] = (this.anIntArray416[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray416[local16] = (this.anIntArray416[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray424[local16] = (this.anIntArray424[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray424[local16] = local28 + (this.anIntArray424[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray428[local16] = (local28 << 7) + (this.anIntArray428[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray428[local16] = local28 + (this.anIntArray428[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray413[local16] = (local28 << 7) + (this.anIntArray413[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray413[local16] = local28 + (this.anIntArray413[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray415[local16] = (local28 << 7) + (this.anIntArray415[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray415[local16] = (this.anIntArray415[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray414[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray414[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray414[local16] |= 0x2;
				} else {
					this.method5800(local16);
					this.anIntArray414[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray418[local16] = (local28 << 7) + (this.anIntArray418[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray418[local16] = (this.anIntArray418[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray418[local16] = (this.anIntArray418[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray418[local16] = local28 + (this.anIntArray418[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method5814(local16);
			}
			if (local22 == 121) {
				this.method5807(local16);
			}
			if (local22 == 123) {
				this.method5797(local16);
			}
			@Pc(504) int local504;
			if (local22 == 6) {
				local504 = this.anIntArray418[local16];
				if (local504 == 16384) {
					this.anIntArray417[local16] = (local28 << 7) + (this.anIntArray417[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local504 = this.anIntArray418[local16];
				if (local504 == 16384) {
					this.anIntArray417[local16] = local28 + (this.anIntArray417[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray420[local16] = (this.anIntArray420[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray420[local16] = (this.anIntArray420[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray414[local16] |= 0x4;
				} else {
					this.method5792(local16);
					this.anIntArray414[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method5799(local16, (local28 << 7) + (this.anIntArray425[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method5799(local16, local28 + (this.anIntArray425[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5815(this.anIntArray427[local16] + local22, local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5801(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0064) >> 9);
			this.method5817(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method5793(true);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(III)V")
	public synchronized void method5785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
				this.anIntArray422[local5] = arg0;
			}
		} else {
			this.anIntArray422[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)I")
	public int method5786() {
		return this.anInt6796;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!vv;)I")
	private int method5787(@OriginalArg(1) Class2_Sub49 arg0) {
		@Pc(20) int local20 = arg0.anInt10759 + (arg0.anInt10754 * arg0.anInt10766 >> 12);
		local20 += (this.anIntArray423[arg0.anInt10749] - 8192) * this.anIntArray417[arg0.anInt10749] >> 12;
		@Pc(41) Class136 local41 = arg0.aClass136_1;
		@Pc(61) int local61;
		if (local41.anInt4914 > 0 && (local41.anInt4915 > 0 || this.anIntArray416[arg0.anInt10749] > 0)) {
			local61 = local41.anInt4915 << 2;
			@Pc(66) int local66 = local41.anInt4910 << 1;
			if (arg0.anInt10761 < local66) {
				local61 = local61 * arg0.anInt10761 / local66;
			}
			local61 += this.anIntArray416[arg0.anInt10749] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt10757 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass2_Sub29_Sub1_4.anInt7490 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static215.anInt4848 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZZLclient!dl;Z)V")
	private synchronized void method5788(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub14 arg1, @OriginalArg(3) boolean arg2) {
		this.method5782(arg0);
		this.aClass293_1.method7532(arg1.aByteArray38);
		this.aLong163 = 0L;
		this.aBoolean498 = arg2;
		@Pc(24) int local24 = this.aClass293_1.method7533();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass293_1.method7542(local26);
			this.aClass293_1.method7535(local26);
			this.aClass293_1.method7536(local26);
		}
		this.anInt6812 = this.aClass293_1.method7540();
		this.anInt6811 = this.aClass293_1.anIntArray579[this.anInt6812];
		this.aLong162 = this.aClass293_1.method7538(this.anInt6811);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(ILclient!vv;)Z")
	public boolean method5789(@OriginalArg(1) Class2_Sub49 arg0) {
		if (arg0.aClass2_Sub8_Sub5_4 != null) {
			return false;
		}
		if (arg0.anInt10764 >= 0) {
			arg0.method9253();
			if (arg0.anInt10765 > 0 && arg0 == this.aClass2_Sub49ArrayArray1[arg0.anInt10749][arg0.anInt10765]) {
				this.aClass2_Sub49ArrayArray1[arg0.anInt10749][arg0.anInt10765] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!vv;B)I")
	private int method5790(@OriginalArg(0) Class2_Sub49 arg0) {
		@Pc(15) int local15 = this.anIntArray413[arg0.anInt10749];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt10756) * (16384 - local15) + 32 >> 6) : arg0.anInt10756 * local15 - -32 >> 6;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBI)V")
	private void method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub49 local12 = this.aClass2_Sub49ArrayArray2[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub49ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray414[arg2] & 0x2) == 0) {
			local12.anInt10764 = 0;
			return;
		}
		for (@Pc(47) Class2_Sub49 local47 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8524(); local47 != null; local47 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8519()) {
			if (local47.anInt10749 == local12.anInt10749 && local47.anInt10764 < 0 && local12 != local47) {
				local12.anInt10764 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)V")
	private void method5792(@OriginalArg(0) int arg0) {
		if ((this.anIntArray414[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub49 local18 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8524(); local18 != null; local18 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8519()) {
			if (arg0 == local18.anInt10749) {
				local18.anInt10760 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZZ)V")
	private void method5793(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method5814(-1);
		} else {
			this.method5797(-1);
		}
		this.method5807(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray421[local29] = this.anIntArray426[local29];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray427[local47] = this.anIntArray426[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([IILclient!vv;IB)Z")
	public boolean method5794(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub49 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt10763 = Static215.anInt4848 / 100;
		if (arg2.anInt10764 >= 0 && (arg2.aClass2_Sub8_Sub5_4 == null || arg2.aClass2_Sub8_Sub5_4.method8823())) {
			arg2.method8976();
			arg2.method9253();
			if (arg2.anInt10765 > 0 && arg2 == this.aClass2_Sub49ArrayArray1[arg2.anInt10749][arg2.anInt10765]) {
				this.aClass2_Sub49ArrayArray1[arg2.anInt10749][arg2.anInt10765] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg2.anInt10766;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray424[arg2.anInt10749] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg2.anInt10766 = local53;
		}
		arg2.aClass2_Sub8_Sub5_4.method8834(this.method5787(arg2));
		@Pc(101) Class136 local101 = arg2.aClass136_1;
		@Pc(103) boolean local103 = false;
		arg2.anInt10757 += local101.anInt4914;
		arg2.anInt10761++;
		@Pc(135) double local135 = (double) ((arg2.anInt10753 - 60 << 8) + (arg2.anInt10754 * arg2.anInt10766 >> 12)) * 5.086263020833333E-6D;
		if (local101.anInt4911 > 0) {
			if (local101.anInt4913 <= 0) {
				arg2.anInt10767 += 128;
			} else {
				arg2.anInt10767 += (int) (Math.pow(2.0D, (double) local101.anInt4913 * local135) * 128.0D + 0.5D);
			}
			if (local101.anInt4911 * arg2.anInt10767 >= 819200) {
				local103 = true;
			}
		}
		if (local101.aByteArray60 != null) {
			if (local101.anInt4909 > 0) {
				arg2.anInt10752 += (int) (Math.pow(2.0D, local135 * (double) local101.anInt4909) * 128.0D + 0.5D);
			} else {
				arg2.anInt10752 += 128;
			}
			while (local101.aByteArray60.length - 2 > arg2.anInt10751 && arg2.anInt10752 > (local101.aByteArray60[arg2.anInt10751 + 2] & 0xFF) << 8) {
				arg2.anInt10751 += 2;
			}
			if (arg2.anInt10751 == local101.aByteArray60.length - 2 && local101.aByteArray60[arg2.anInt10751 + 1] == 0) {
				local103 = true;
			}
		}
		if (arg2.anInt10764 >= 0 && local101.aByteArray59 != null && (this.anIntArray414[arg2.anInt10749] & 0x1) == 0 && (arg2.anInt10765 < 0 || this.aClass2_Sub49ArrayArray1[arg2.anInt10749][arg2.anInt10765] != arg2)) {
			if (local101.anInt4912 > 0) {
				arg2.anInt10764 += (int) (Math.pow(2.0D, (double) local101.anInt4912 * local135) * 128.0D + 0.5D);
			} else {
				arg2.anInt10764 += 128;
			}
			while (local101.aByteArray59.length - 2 > arg2.anInt10762 && arg2.anInt10764 > (local101.aByteArray59[arg2.anInt10762 + 2] & 0xFF) << 8) {
				arg2.anInt10762 += 2;
			}
			if (local101.aByteArray59.length - 2 == arg2.anInt10762) {
				local103 = true;
			}
		}
		if (!local103) {
			arg2.aClass2_Sub8_Sub5_4.method8821(arg2.anInt10763, this.method5810(arg2), this.method5790(arg2));
			return false;
		}
		arg2.aClass2_Sub8_Sub5_4.method8835(arg2.anInt10763);
		if (arg0 == null) {
			arg2.aClass2_Sub8_Sub5_4.method8818(arg1);
		} else {
			arg2.aClass2_Sub8_Sub5_4.method8816(arg0, arg3, arg1);
		}
		if (arg2.aClass2_Sub8_Sub5_4.method8828()) {
			this.aClass2_Sub8_Sub1_1.aClass2_Sub8_Sub4_1.method7928(arg2.aClass2_Sub8_Sub5_4);
		}
		arg2.method8976();
		if (arg2.anInt10764 >= 0) {
			arg2.method9253();
			if (arg2.anInt10765 > 0 && arg2 == this.aClass2_Sub49ArrayArray1[arg2.anInt10749][arg2.anInt10765]) {
				this.aClass2_Sub49ArrayArray1[arg2.anInt10749][arg2.anInt10765] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	private void method5795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5791(64, arg1, arg2);
		if ((this.anIntArray414[arg2] & 0x2) != 0) {
			for (@Pc(30) Class2_Sub49 local30 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8522(); local30 != null; local30 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8532()) {
				if (arg2 == local30.anInt10749 && local30.anInt10764 < 0) {
					this.aClass2_Sub49ArrayArray2[arg2][local30.anInt10753] = null;
					this.aClass2_Sub49ArrayArray2[arg2][arg1] = local30;
					@Pc(72) int local72 = (local30.anInt10766 * local30.anInt10754 >> 12) + local30.anInt10759;
					local30.anInt10759 += arg1 - local30.anInt10753 << 8;
					local30.anInt10754 = local72 - local30.anInt10759;
					local30.anInt10753 = arg1;
					local30.anInt10766 = 4096;
					return;
				}
			}
		}
		@Pc(118) Class2_Sub27 local118 = (Class2_Sub27) this.aClass99_47.method3056((long) this.anIntArray421[arg2]);
		if (local118 == null) {
			return;
		}
		@Pc(126) Class2_Sub29_Sub1 local126 = local118.aClass2_Sub29_Sub1Array1[arg1];
		if (local126 == null) {
			return;
		}
		@Pc(133) Class2_Sub49 local133 = new Class2_Sub49();
		local133.anInt10749 = arg2;
		local133.aClass2_Sub27_1 = local118;
		local133.aClass2_Sub29_Sub1_4 = local126;
		local133.aClass136_1 = local118.aClass136Array1[arg1];
		local133.anInt10765 = local118.aByteArray74[arg1];
		local133.anInt10753 = arg1;
		local133.anInt10748 = local118.aByteArray75[arg1] * local118.anInt5524 * arg0 * arg0 + 1024 >> 11;
		local133.anInt10756 = local118.aByteArray73[arg1] & 0xFF;
		local133.anInt10759 = (arg1 << 8) - (local118.aShortArray65[arg1] & 0x7FFF);
		local133.anInt10764 = -1;
		local133.anInt10752 = 0;
		local133.anInt10751 = 0;
		local133.anInt10767 = 0;
		local133.anInt10762 = 0;
		if (this.anIntArray420[arg2] == 0) {
			local133.aClass2_Sub8_Sub5_4 = Static654.method8844(local126, this.method5787(local133), this.method5810(local133), this.method5790(local133));
		} else {
			local133.aClass2_Sub8_Sub5_4 = Static654.method8844(local126, this.method5787(local133), 0, this.method5790(local133));
			this.method5816(local118.aShortArray65[arg1] < 0, local133);
		}
		if (local118.aShortArray65[arg1] < 0) {
			local133.aClass2_Sub8_Sub5_4.method8850(-1);
		}
		if (local133.anInt10765 >= 0) {
			@Pc(288) Class2_Sub49 local288 = this.aClass2_Sub49ArrayArray1[arg2][local133.anInt10765];
			if (local288 != null && local288.anInt10764 < 0) {
				this.aClass2_Sub49ArrayArray2[arg2][local288.anInt10753] = null;
				local288.anInt10764 = 0;
			}
			this.aClass2_Sub49ArrayArray1[arg2][local133.anInt10765] = local133;
		}
		this.aClass2_Sub8_Sub1_1.aClass341_8.method8528(local133);
		this.aClass2_Sub49ArrayArray2[arg2][arg1] = local133;
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(III)V")
	private void method5796() {
		this.anIntArray426[9] = 128;
		this.anIntArray427[9] = 128;
		this.method5815(128, 9);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)V")
	private void method5797(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class2_Sub49 local16 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8524(); local16 != null; local16 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8519()) {
			if ((arg0 < 0 || local16.anInt10749 == arg0) && local16.anInt10764 < 0) {
				this.aClass2_Sub49ArrayArray2[local16.anInt10749][local16.anInt10753] = null;
				local16.anInt10764 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	private void method5798() {
		@Pc(8) int local8 = this.anInt6812;
		@Pc(11) int local11 = this.anInt6811;
		@Pc(14) long local14 = this.aLong162;
		if (this.aClass2_Sub14_7 != null && this.anInt6813 == local11) {
			this.method5788(this.aBoolean499, this.aClass2_Sub14_7, this.aBoolean498);
			this.method5798();
			return;
		}
		while (this.anInt6811 == local11) {
			while (this.aClass293_1.anIntArray579[local8] == local11) {
				this.aClass293_1.method7542(local8);
				@Pc(43) int local43 = this.aClass293_1.method7544(local8);
				if (local43 == 1) {
					this.aClass293_1.method7545();
					this.aClass293_1.method7536(local8);
					if (this.aClass293_1.method7530()) {
						if (this.aClass2_Sub14_7 != null) {
							this.method5811(this.aClass2_Sub14_7, this.aBoolean498);
							this.method5798();
							return;
						}
						if (!this.aBoolean498 || local11 == 0) {
							this.method5793(true);
							this.aClass293_1.method7537();
							return;
						}
						this.aClass293_1.method7534(local14);
					}
					break;
				}
				if ((local43 & 0x80) != 0) {
					this.method5784(local43);
				}
				this.aClass293_1.method7535(local8);
				this.aClass293_1.method7536(local8);
			}
			local8 = this.aClass293_1.method7540();
			local11 = this.aClass293_1.anIntArray579[local8];
			local14 = this.aClass293_1.method7538(local11);
		}
		this.aLong162 = local14;
		this.anInt6811 = local11;
		this.anInt6812 = local8;
		if (this.aClass2_Sub14_7 != null && local11 > this.anInt6813) {
			this.anInt6812 = -1;
			this.anInt6811 = this.anInt6813;
			this.aLong162 = this.aClass293_1.method7538(this.anInt6811);
		}
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(III)V")
	private void method5799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray425[arg0] = arg1;
		this.anIntArray419[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(II)V")
	private void method5800(@OriginalArg(1) int arg0) {
		if ((this.anIntArray414[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(28) Class2_Sub49 local28 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8524(); local28 != null; local28 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8519()) {
			if (arg0 == local28.anInt10749 && this.aClass2_Sub49ArrayArray2[arg0][local28.anInt10753] == null && local28.anInt10764 < 0) {
				local28.anInt10764 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8818(@OriginalArg(0) int arg0) {
		if (this.aClass293_1.method7541()) {
			@Pc(18) int local18 = this.aClass293_1.anInt8992 * this.anInt6787 / Static215.anInt4848;
			do {
				@Pc(27) long local27 = this.aLong163 + (long) local18 * (long) arg0;
				if (this.aLong162 - local27 >= 0L) {
					this.aLong163 = local27;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong162 + (long) local18 - this.aLong163 - 1L) / (long) local18);
				this.aLong163 += (long) local56 * (long) local18;
				this.aClass2_Sub8_Sub1_1.method8818(local56);
				arg0 -= local56;
				this.method5798();
			} while (this.aClass293_1.method7541());
		}
		this.aClass2_Sub8_Sub1_1.method8818(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(III)V")
	private void method5801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Z")
	public synchronized boolean method5802() {
		return this.aClass293_1.method7541();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass293_1.method7541()) {
			@Pc(18) int local18 = this.anInt6787 * this.aClass293_1.anInt8992 / Static215.anInt4848;
			do {
				@Pc(27) long local27 = this.aLong163 + (long) arg2 * (long) local18;
				if (this.aLong162 - local27 >= 0L) {
					this.aLong163 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong162 - this.aLong163 - 1L) / (long) local18);
				this.aLong163 += (long) local18 * (long) local56;
				this.aClass2_Sub8_Sub1_1.method8816(arg0, arg1, local56);
				arg1 += local56;
				arg2 -= local56;
				this.method5798();
			} while (this.aClass293_1.method7541());
		}
		this.aClass2_Sub8_Sub1_1.method8816(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(II)V")
	public synchronized void method5803(@OriginalArg(1) int arg0) {
		this.anInt6796 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIII)V")
	private void method5805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(B)V")
	public synchronized void method5806() {
		for (@Pc(17) Class2_Sub27 local17 = (Class2_Sub27) this.aClass99_47.method3060(); local17 != null; local17 = (Class2_Sub27) this.aClass99_47.method3058()) {
			local17.method4754();
		}
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(II)V")
	private void method5807(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method5807(local9);
			}
			return;
		}
		this.anIntArray428[arg0] = 12800;
		this.anIntArray413[arg0] = 8192;
		this.anIntArray415[arg0] = 16383;
		this.anIntArray423[arg0] = 8192;
		this.anIntArray416[arg0] = 0;
		this.anIntArray424[arg0] = 8192;
		this.method5800(arg0);
		this.method5792(arg0);
		this.anIntArray414[arg0] = 0;
		this.anIntArray418[arg0] = 32767;
		this.anIntArray417[arg0] = 256;
		this.anIntArray420[arg0] = 0;
		this.method5799(arg0, 8192);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!dl;ILclient!hs;Lclient!in;I)Z")
	public synchronized boolean method5808(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(2) Class138 arg1, @OriginalArg(3) Class157 arg2) {
		arg0.method2685();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class2_Sub20 local26 = (Class2_Sub20) arg0.aClass99_24.method3060(); local26 != null; local26 = (Class2_Sub20) arg0.aClass99_24.method3058()) {
			@Pc(32) int local32 = (int) local26.aLong278;
			@Pc(40) Class2_Sub27 local40 = (Class2_Sub27) this.aClass99_47.method3056((long) local32);
			if (local40 == null) {
				local40 = Static460.method7178(arg2, local32);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass99_47.method3059((long) local32, local40);
			}
			if (!local40.method4753(arg1, local20, local26.aByteArray52)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method2687();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
	public synchronized void method5809() {
		for (@Pc(15) Class2_Sub27 local15 = (Class2_Sub27) this.aClass99_47.method3060(); local15 != null; local15 = (Class2_Sub27) this.aClass99_47.method3058()) {
			local15.method9253();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!vv;I)I")
	private int method5810(@OriginalArg(0) Class2_Sub49 arg0) {
		if (this.anIntArray422[arg0.anInt10749] == 0) {
			return 0;
		}
		@Pc(21) Class136 local21 = arg0.aClass136_1;
		@Pc(37) int local37 = this.anIntArray428[arg0.anInt10749] * this.anIntArray415[arg0.anInt10749] + 4096 >> 13;
		@Pc(45) int local45 = local37 * local37 + 16384 >> 15;
		@Pc(54) int local54 = local45 * arg0.anInt10748 + 16384 >> 15;
		@Pc(63) int local63 = local54 * this.anInt6796 + 128 >> 8;
		local37 = this.anIntArray422[arg0.anInt10749] * local63 + 128 >> 8;
		if (local21.anInt4911 > 0) {
			local37 = (int) ((double) local37 * Math.pow(0.5D, (double) arg0.anInt10767 * 1.953125E-5D * (double) local21.anInt4911) + 0.5D);
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local21.aByteArray60 != null) {
			local105 = arg0.anInt10752;
			local113 = local21.aByteArray60[arg0.anInt10751 + 1];
			if (arg0.anInt10751 < local21.aByteArray60.length - 2) {
				local131 = (local21.aByteArray60[arg0.anInt10751] & 0xFF) << 8;
				local143 = (local21.aByteArray60[arg0.anInt10751 + 2] & 0xFF) << 8;
				local113 += (local21.aByteArray60[arg0.anInt10751 + 3] - local113) * (local105 + -local131) / (local143 - local131);
			}
			local37 = local37 * local113 + 32 >> 6;
		}
		if (arg0.anInt10764 > 0 && local21.aByteArray59 != null) {
			local105 = arg0.anInt10764;
			local113 = local21.aByteArray59[arg0.anInt10762 + 1];
			if (local21.aByteArray59.length - 2 > arg0.anInt10762) {
				local131 = (local21.aByteArray59[arg0.anInt10762] & 0xFF) << 8;
				local143 = (local21.aByteArray59[arg0.anInt10762 + 2] & 0xFF) << 8;
				local113 += (local21.aByteArray59[arg0.anInt10762 + 3] - local113) * (local105 + -local131) / (local143 - local131);
			}
			local37 = local113 * local37 + 32 >> 6;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!dl;ZZ)V")
	public synchronized void method5811(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		this.method5788(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!dl;JZZB)V")
	public synchronized void method5812(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2) {
		this.method5788(true, arg0, arg2);
		this.method5818((long) this.aClass293_1.anInt8992 * arg1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()Lclient!jba;")
	@Override
	public synchronized Class2_Sub8 method8815() {
		return this.aClass2_Sub8_Sub1_1;
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "(II)V")
	private void method5814(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class2_Sub49 local14 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8524(); local14 != null; local14 = (Class2_Sub49) this.aClass2_Sub8_Sub1_1.aClass341_8.method8519()) {
			if (arg0 < 0 || arg0 == local14.anInt10749) {
				if (local14.aClass2_Sub8_Sub5_4 != null) {
					local14.aClass2_Sub8_Sub5_4.method8835(Static215.anInt4848 / 100);
					if (local14.aClass2_Sub8_Sub5_4.method8828()) {
						this.aClass2_Sub8_Sub1_1.aClass2_Sub8_Sub4_1.method7928(local14.aClass2_Sub8_Sub5_4);
					}
					local14.method8976();
				}
				if (local14.anInt10764 < 0) {
					this.aClass2_Sub49ArrayArray2[local14.anInt10749][local14.anInt10753] = null;
				}
				local14.method9253();
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII)V")
	private void method5815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray421[arg1]) {
			this.anIntArray421[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass2_Sub49ArrayArray1[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZLclient!vv;)V")
	public void method5816(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub49 arg1) {
		@Pc(8) int local8 = arg1.aClass2_Sub29_Sub1_4.aByteArray97.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass2_Sub29_Sub1_4.aBoolean543) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass2_Sub29_Sub1_4.anInt7489;
			local36 = (int) ((long) this.anIntArray420[arg1.anInt10749] * (long) local23 >> 6);
			local8 <<= 0x8;
			if (local8 <= local36) {
				local36 = local8 + local8 - local36 - 1;
				arg1.aClass2_Sub8_Sub5_4.method8824();
			}
		} else {
			local36 = (int) ((long) local8 * (long) this.anIntArray420[arg1.anInt10749] >> 6);
		}
		arg1.aClass2_Sub8_Sub5_4.method8857(local36);
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "(III)V")
	private void method5817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray423[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(JI)V")
	private void method5818(@OriginalArg(0) long arg0) {
		while (this.aLong162 <= arg0) {
			@Pc(12) int local12 = this.anInt6812;
			@Pc(15) int local15 = this.anInt6811;
			@Pc(18) long local18 = this.aLong162;
			while (this.anInt6811 == local15) {
				while (this.aClass293_1.anIntArray579[local12] == local15) {
					this.aClass293_1.method7542(local12);
					@Pc(29) int local29 = this.aClass293_1.method7544(local12);
					if (local29 == 1) {
						this.aClass293_1.method7545();
						this.aClass293_1.method7536(local12);
						if (this.aClass293_1.method7530()) {
							if (!this.aBoolean498 || local15 == 0) {
								this.method5793(true);
								this.aClass293_1.method7537();
								return;
							}
							this.aClass293_1.method7534(local18);
						}
						break;
					}
					if ((local29 & 0x80) != 0 && (local29 & 0xF0) != 144) {
						this.method5784(local29);
					}
					this.aClass293_1.method7535(local12);
					this.aClass293_1.method7536(local12);
				}
				this.aLong163 = local18;
				local12 = this.aClass293_1.method7540();
				local15 = this.aClass293_1.anIntArray579[local12];
				local18 = this.aClass293_1.method7538(local15);
			}
			this.anInt6812 = local12;
			this.aLong162 = local18;
			this.anInt6811 = local15;
		}
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
	public synchronized void method5819() {
		this.method5782(true);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()I")
	@Override
	public synchronized int method8820() {
		return 0;
	}
}
