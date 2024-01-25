import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ln", name = "Gb", descriptor = "I")
	private int anInt3783;

	@OriginalMember(owner = "client!ln", name = "Ib", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!ln", name = "Jb", descriptor = "J")
	private long aLong123;

	@OriginalMember(owner = "client!ln", name = "Kb", descriptor = "Z")
	private boolean aBoolean278;

	@OriginalMember(owner = "client!ln", name = "Lb", descriptor = "I")
	private int anInt3784;

	@OriginalMember(owner = "client!ln", name = "Mb", descriptor = "I")
	private int anInt3785;

	@OriginalMember(owner = "client!ln", name = "Nb", descriptor = "Lclient!mi;")
	private Class2_Sub25 aClass2_Sub25_1;

	@OriginalMember(owner = "client!ln", name = "Ob", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "[I")
	private final int[] anIntArray451 = new int[16];

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "[I")
	private final int[] anIntArray449 = new int[16];

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
	private final int anInt3746 = 1000000;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "[I")
	public final int[] anIntArray448 = new int[16];

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "[I")
	private final int[] anIntArray453 = new int[16];

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "[I")
	private final int[] anIntArray450 = new int[16];

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "[I")
	private final int[] anIntArray454 = new int[16];

	@OriginalMember(owner = "client!ln", name = "bb", descriptor = "[I")
	private final int[] anIntArray455 = new int[16];

	@OriginalMember(owner = "client!ln", name = "nb", descriptor = "[I")
	private final int[] anIntArray458 = new int[16];

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "[I")
	private final int[] anIntArray447 = new int[16];

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
	private int anInt3756 = 256;

	@OriginalMember(owner = "client!ln", name = "mb", descriptor = "[I")
	private final int[] anIntArray457 = new int[16];

	@OriginalMember(owner = "client!ln", name = "wb", descriptor = "[I")
	private final int[] anIntArray461 = new int[16];

	@OriginalMember(owner = "client!ln", name = "ob", descriptor = "[I")
	public final int[] anIntArray459 = new int[16];

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "[[Lclient!tr;")
	private final Class2_Sub37[][] aClass2_Sub37ArrayArray1 = new Class2_Sub37[16][128];

	@OriginalMember(owner = "client!ln", name = "qb", descriptor = "[I")
	private final int[] anIntArray460 = new int[16];

	@OriginalMember(owner = "client!ln", name = "zb", descriptor = "[I")
	private final int[] anIntArray462 = new int[16];

	@OriginalMember(owner = "client!ln", name = "hb", descriptor = "[I")
	public final int[] anIntArray456 = new int[16];

	@OriginalMember(owner = "client!ln", name = "xb", descriptor = "[[Lclient!tr;")
	private final Class2_Sub37[][] aClass2_Sub37ArrayArray2 = new Class2_Sub37[16][128];

	@OriginalMember(owner = "client!ln", name = "Fb", descriptor = "[I")
	private final int[] anIntArray463 = new int[16];

	@OriginalMember(owner = "client!ln", name = "Ab", descriptor = "Lclient!kl;")
	private final Class136 aClass136_1 = new Class136();

	@OriginalMember(owner = "client!ln", name = "Hb", descriptor = "Lclient!rm;")
	private final Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1 = new Class2_Sub2_Sub4(this);

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "Lclient!sq;")
	private final Class214 aClass214_20 = new Class214(128);

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		this.method3418();
		this.method3400(true);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!tr;I)Z")
	public boolean method3397(@OriginalArg(0) Class2_Sub37 arg0) {
		if (arg0.aClass2_Sub2_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt6082 >= 0) {
			arg0.method5745();
			if (arg0.anInt6064 > 0 && this.aClass2_Sub37ArrayArray2[arg0.anInt6073][arg0.anInt6064] == arg0) {
				this.aClass2_Sub37ArrayArray2[arg0.anInt6073][arg0.anInt6064] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)V")
	private void method3399(@OriginalArg(1) int arg0) {
		if ((this.anIntArray456[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class2_Sub37 local19 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5035(); local19 != null; local19 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5037()) {
			if (local19.anInt6073 == arg0 && this.aClass2_Sub37ArrayArray1[arg0][local19.anInt6074] == null && local19.anInt6082 < 0) {
				local19.anInt6082 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V")
	private void method3400(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method3416(-1);
		} else {
			this.method3430(-1);
		}
		this.method3407(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray450[local23] = this.anIntArray447[local23];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray462[local45] = this.anIntArray447[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	private void method3401(@OriginalArg(0) int arg0) {
		if ((this.anIntArray456[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(24) Class2_Sub37 local24 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5035(); local24 != null; local24 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5037()) {
			if (arg0 == local24.anInt6073) {
				local24.anInt6079 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZBLclient!mi;)V")
	public synchronized void method3402(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub25 arg1) {
		this.method3405(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	private void method3403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray453[arg1] = arg0;
		this.anIntArray448[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4828(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass136_1.method3030()) {
			@Pc(18) int local18 = this.aClass136_1.anInt3332 * this.anInt3746 / Static221.anInt4100;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong122;
				if (this.aLong123 - local27 >= 0L) {
					this.aLong122 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong123 - this.aLong122 - 1L) / (long) local18);
				this.aLong122 += (long) local56 * (long) local18;
				this.aClass2_Sub2_Sub4_1.method4828(arg0, arg1, local56);
				this.method3432();
				arg2 -= local56;
				arg1 += local56;
			} while (this.aClass136_1.method3030());
		}
		this.aClass2_Sub2_Sub4_1.method4828(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	public synchronized void method3404() {
		for (@Pc(11) Class2_Sub33 local11 = (Class2_Sub33) this.aClass214_20.method5060(); local11 != null; local11 = (Class2_Sub33) this.aClass214_20.method5064()) {
			local11.method5745();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZILclient!mi;Z)V")
	private synchronized void method3405(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub25 arg1, @OriginalArg(3) boolean arg2) {
		this.method3413(arg2);
		this.aClass136_1.method3035(arg1.aByteArray66);
		this.aLong122 = 0L;
		this.aBoolean278 = arg0;
		@Pc(24) int local24 = this.aClass136_1.method3037();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass136_1.method3034(local26);
			this.aClass136_1.method3036(local26);
			this.aClass136_1.method3033(local26);
		}
		this.anInt3784 = this.aClass136_1.method3031();
		this.anInt3783 = this.aClass136_1.anIntArray372[this.anInt3784];
		this.aLong123 = this.aClass136_1.method3027(this.anInt3783);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()Lclient!gh;")
	@Override
	public synchronized Class2_Sub2 method4830() {
		return null;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBI)V")
	private void method3406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V")
	private void method3407(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method3407(local9);
			}
			return;
		}
		this.anIntArray461[arg0] = 12800;
		this.anIntArray454[arg0] = 8192;
		this.anIntArray449[arg0] = 16383;
		this.anIntArray463[arg0] = 8192;
		this.anIntArray451[arg0] = 0;
		this.anIntArray458[arg0] = 8192;
		this.method3399(arg0);
		this.method3401(arg0);
		this.anIntArray456[arg0] = 0;
		this.anIntArray457[arg0] = 32767;
		this.anIntArray460[arg0] = 256;
		this.anIntArray459[arg0] = 0;
		this.method3403(8192, arg0);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V")
	private void method3408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray450[arg1]) {
			this.anIntArray450[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass2_Sub37ArrayArray2[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)V")
	private void method3409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class2_Sub37 local12 = this.aClass2_Sub37ArrayArray1[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub37ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray456[arg0] & 0x2) == 0) {
			local12.anInt6082 = 0;
			return;
		}
		for (@Pc(43) Class2_Sub37 local43 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5035(); local43 != null; local43 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5037()) {
			if (local12.anInt6073 == local43.anInt6073 && local43.anInt6082 < 0 && local43 != local12) {
				local12.anInt6082 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!tr;ZI)V")
	public void method3411(@OriginalArg(0) Class2_Sub37 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub4_Sub1_1.aByteArray19.length;
		@Pc(35) int local35;
		if (arg1 && arg0.aClass2_Sub4_Sub1_1.aBoolean88) {
			@Pc(22) int local22 = local8 + local8 - arg0.aClass2_Sub4_Sub1_1.anInt955;
			local35 = (int) ((long) this.anIntArray459[arg0.anInt6073] * (long) local22 >> 6);
			local8 <<= 0x8;
			if (local8 <= local35) {
				local35 = local8 + local8 - local35 - 1;
				arg0.aClass2_Sub2_Sub2_1.method3197();
			}
		} else {
			local35 = (int) ((long) this.anIntArray459[arg0.anInt6073] * (long) local8 >> 6);
		}
		arg0.aClass2_Sub2_Sub2_1.method3220(local35);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!tr;B)I")
	private int method3412(@OriginalArg(0) Class2_Sub37 arg0) {
		if (this.anIntArray455[arg0.anInt6073] == 0) {
			return 0;
		}
		@Pc(14) Class52 local14 = arg0.aClass52_1;
		@Pc(30) int local30 = this.anIntArray461[arg0.anInt6073] * this.anIntArray449[arg0.anInt6073] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt6072 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.anInt3756 + 128 >> 8;
		local30 = this.anIntArray455[arg0.anInt6073] * local56 + 128 >> 8;
		if (local14.anInt1253 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt6076 * 1.953125E-5D * (double) local14.anInt1253) * (double) local30 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local14.aByteArray23 != null) {
			local106 = arg0.anInt6070;
			local114 = local14.aByteArray23[arg0.anInt6060 + 1];
			if (local14.aByteArray23.length - 2 > arg0.anInt6060) {
				local132 = (local14.aByteArray23[arg0.anInt6060] & 0xFF) << 8;
				local144 = (local14.aByteArray23[arg0.anInt6060 + 2] & 0xFF) << 8;
				local114 += (local14.aByteArray23[arg0.anInt6060 + 3] - local114) * (-local132 + local106) / (local144 - local132);
			}
			local30 = local30 * local114 + 32 >> 6;
		}
		if (arg0.anInt6082 > 0 && local14.aByteArray22 != null) {
			local106 = arg0.anInt6082;
			local114 = local14.aByteArray22[arg0.anInt6067 + 1];
			if (arg0.anInt6067 < local14.aByteArray22.length - 2) {
				local132 = (local14.aByteArray22[arg0.anInt6067] & 0xFF) << 8;
				local144 = (local14.aByteArray22[arg0.anInt6067 + 2] & 0xFF) << 8;
				local114 += (local106 - local132) * (-local114 + local14.aByteArray22[arg0.anInt6067 + 3]) / (local144 - local132);
			}
			local30 = local30 * local114 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()Lclient!gh;")
	@Override
	public synchronized Class2_Sub2 method4832() {
		return this.aClass2_Sub2_Sub4_1;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BZ)V")
	private synchronized void method3413(@OriginalArg(1) boolean arg0) {
		this.aClass136_1.method3024();
		this.aClass2_Sub25_1 = null;
		this.method3400(arg0);
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)V")
	public synchronized void method3415(@OriginalArg(0) int arg0) {
		this.anInt3756 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(II)V")
	private void method3416(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class2_Sub37 local15 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5035(); local15 != null; local15 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5037()) {
			if (arg0 < 0 || local15.anInt6073 == arg0) {
				if (local15.aClass2_Sub2_Sub2_1 != null) {
					local15.aClass2_Sub2_Sub2_1.method3183(Static221.anInt4100 / 100);
					if (local15.aClass2_Sub2_Sub2_1.method3190()) {
						this.aClass2_Sub2_Sub4_1.aClass2_Sub2_Sub1_1.method112(local15.aClass2_Sub2_Sub2_1);
					}
					local15.method5255();
				}
				if (local15.anInt6082 < 0) {
					this.aClass2_Sub37ArrayArray1[local15.anInt6073][local15.anInt6074] = null;
				}
				local15.method5745();
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IBI)V")
	public synchronized void method3417() {
		this.method3424();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZ)V")
	private synchronized void method3418() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray455[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(II)V")
	private void method3419(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3409(local16, local28, local22);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method3426(local16, local28, local22);
			} else {
				this.method3409(local16, 64, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3422(local16, local28, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray462[local16] = (local28 << 14) + (this.anIntArray462[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray462[local16] = (this.anIntArray462[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray451[local16] = (local28 << 7) + (this.anIntArray451[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray451[local16] = local28 + (this.anIntArray451[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray458[local16] = (this.anIntArray458[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray458[local16] = (this.anIntArray458[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray461[local16] = (local28 << 7) + (this.anIntArray461[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray461[local16] = local28 + (this.anIntArray461[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray454[local16] = (this.anIntArray454[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray454[local16] = (this.anIntArray454[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray449[local16] = (this.anIntArray449[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray449[local16] = local28 + (this.anIntArray449[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray456[local16] |= 0x1;
				} else {
					this.anIntArray456[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method3399(local16);
					this.anIntArray456[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray456[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray457[local16] = (local28 << 7) + (this.anIntArray457[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray457[local16] = local28 + (this.anIntArray457[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray457[local16] = (this.anIntArray457[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray457[local16] = (this.anIntArray457[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method3416(local16);
			}
			if (local22 == 121) {
				this.method3407(local16);
			}
			if (local22 == 123) {
				this.method3430(local16);
			}
			@Pc(505) int local505;
			if (local22 == 6) {
				local505 = this.anIntArray457[local16];
				if (local505 == 16384) {
					this.anIntArray460[local16] = (this.anIntArray460[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local505 = this.anIntArray457[local16];
				if (local505 == 16384) {
					this.anIntArray460[local16] = (this.anIntArray460[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray459[local16] = (local28 << 7) + (this.anIntArray459[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray459[local16] = local28 + (this.anIntArray459[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray456[local16] |= 0x4;
				} else {
					this.method3401(local16);
					this.anIntArray456[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method3403((local28 << 7) + (this.anIntArray453[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method3403((this.anIntArray453[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3408(this.anIntArray462[local16] + local22, local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3406(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method3433(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method3400(true);
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4834() {
		return 0;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method3420() {
		return this.aClass136_1.method3030();
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)I")
	public int method3421() {
		return this.anInt3756;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IIII)V")
	private void method3422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(B)V")
	public synchronized void method3423() {
		this.method3413(true);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII)V")
	private void method3424() {
		this.anIntArray447[9] = 128;
		this.anIntArray462[9] = 128;
		this.method3408(128, 9);
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(Z)V")
	public synchronized void method3425() {
		for (@Pc(11) Class2_Sub33 local11 = (Class2_Sub33) this.aClass214_20.method5060(); local11 != null; local11 = (Class2_Sub33) this.aClass214_20.method5064()) {
			local11.method4820();
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(IIII)V")
	private void method3426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3409(arg0, 64, arg2);
		if ((this.anIntArray456[arg0] & 0x2) != 0) {
			for (@Pc(30) Class2_Sub37 local30 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5036(); local30 != null; local30 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5034()) {
				if (local30.anInt6073 == arg0 && local30.anInt6082 < 0) {
					this.aClass2_Sub37ArrayArray1[arg0][local30.anInt6074] = null;
					this.aClass2_Sub37ArrayArray1[arg0][arg2] = local30;
					@Pc(70) int local70 = local30.anInt6078 + (local30.anInt6077 * local30.anInt6068 >> 12);
					local30.anInt6078 += arg2 - local30.anInt6074 << 8;
					local30.anInt6077 = 4096;
					local30.anInt6074 = arg2;
					local30.anInt6068 = local70 - local30.anInt6078;
					return;
				}
			}
		}
		@Pc(115) Class2_Sub33 local115 = (Class2_Sub33) this.aClass214_20.method5059((long) this.anIntArray450[arg0]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class2_Sub4_Sub1 local123 = local115.aClass2_Sub4_Sub1Array1[arg2];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class2_Sub37 local130 = new Class2_Sub37();
		local130.aClass2_Sub33_1 = local115;
		local130.aClass2_Sub4_Sub1_1 = local123;
		local130.anInt6073 = arg0;
		local130.aClass52_1 = local115.aClass52Array1[arg2];
		local130.anInt6064 = local115.aByteArray86[arg2];
		local130.anInt6074 = arg2;
		local130.anInt6072 = local115.anInt5500 * arg1 * arg1 * local115.aByteArray87[arg2] + 1024 >> 11;
		local130.anInt6061 = local115.aByteArray88[arg2] & 0xFF;
		local130.anInt6078 = (arg2 << 8) - (local115.aShortArray101[arg2] & 0x7FFF);
		local130.anInt6060 = 0;
		local130.anInt6067 = 0;
		local130.anInt6082 = -1;
		local130.anInt6070 = 0;
		local130.anInt6076 = 0;
		if (this.anIntArray459[arg0] == 0) {
			local130.aClass2_Sub2_Sub2_1 = Static398.method3215(local123, this.method3431(local130), this.method3412(local130), this.method3429(local130));
		} else {
			local130.aClass2_Sub2_Sub2_1 = Static398.method3215(local123, this.method3431(local130), 0, this.method3429(local130));
			this.method3411(local130, local115.aShortArray101[arg2] < 0);
		}
		if (local115.aShortArray101[arg2] < 0) {
			local130.aClass2_Sub2_Sub2_1.method3196(-1);
		}
		if (local130.anInt6064 >= 0) {
			@Pc(289) Class2_Sub37 local289 = this.aClass2_Sub37ArrayArray2[arg0][local130.anInt6064];
			if (local289 != null && local289.anInt6082 < 0) {
				this.aClass2_Sub37ArrayArray1[arg0][local289.anInt6074] = null;
				local289.anInt6082 = 0;
			}
			this.aClass2_Sub37ArrayArray2[arg0][local130.anInt6064] = local130;
		}
		this.aClass2_Sub2_Sub4_1.aClass210_44.method5044(local130);
		this.aClass2_Sub37ArrayArray1[arg0][arg2] = local130;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4833(@OriginalArg(0) int arg0) {
		if (this.aClass136_1.method3030()) {
			@Pc(18) int local18 = this.aClass136_1.anInt3332 * this.anInt3746 / Static221.anInt4100;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong122;
				if (this.aLong123 - local27 >= 0L) {
					this.aLong122 = local27;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong123 + (long) local18 - this.aLong122 - 1L) / (long) local18);
				this.aLong122 += (long) local56 * (long) local18;
				this.aClass2_Sub2_Sub4_1.method4833(local56);
				arg0 -= local56;
				this.method3432();
			} while (this.aClass136_1.method3030());
		}
		this.aClass2_Sub2_Sub4_1.method4833(arg0);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!fc;ILclient!li;ZLclient!mi;)Z")
	public synchronized boolean method3428(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class142 arg1, @OriginalArg(4) Class2_Sub25 arg2) {
		arg2.method3672();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class2_Sub31 local26 = (Class2_Sub31) arg2.aClass214_24.method5060(); local26 != null; local26 = (Class2_Sub31) arg2.aClass214_24.method5064()) {
			@Pc(32) int local32 = (int) local26.aLong208;
			@Pc(40) Class2_Sub33 local40 = (Class2_Sub33) this.aClass214_20.method5059((long) local32);
			if (local40 == null) {
				local40 = Static104.method1845(local32, arg0);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass214_20.method5065((long) local32, local40);
			}
			if (!local40.method4816(local26.aByteArray81, local20, arg1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method3673();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!tr;)I")
	private int method3429(@OriginalArg(1) Class2_Sub37 arg0) {
		@Pc(14) int local14 = this.anIntArray454[arg0.anInt6073];
		return local14 < 8192 ? arg0.anInt6061 * local14 + 32 >> 6 : 16384 - ((128 - arg0.anInt6061) * (-local14 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(II)V")
	private void method3430(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class2_Sub37 local14 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5035(); local14 != null; local14 = (Class2_Sub37) this.aClass2_Sub2_Sub4_1.aClass210_44.method5037()) {
			if ((arg0 < 0 || arg0 == local14.anInt6073) && local14.anInt6082 < 0) {
				this.aClass2_Sub37ArrayArray1[local14.anInt6073][local14.anInt6074] = null;
				local14.anInt6082 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(BLclient!tr;)I")
	private int method3431(@OriginalArg(1) Class2_Sub37 arg0) {
		@Pc(14) int local14 = arg0.anInt6078 + (arg0.anInt6068 * arg0.anInt6077 >> 12);
		local14 += (this.anIntArray463[arg0.anInt6073] - 8192) * this.anIntArray460[arg0.anInt6073] >> 12;
		@Pc(35) Class52 local35 = arg0.aClass52_1;
		@Pc(58) int local58;
		if (local35.anInt1248 > 0 && (local35.anInt1254 > 0 || this.anIntArray451[arg0.anInt6073] > 0)) {
			local58 = local35.anInt1254 << 2;
			@Pc(63) int local63 = local35.anInt1249 << 1;
			if (arg0.anInt6065 < local63) {
				local58 = arg0.anInt6065 * local58 / local63;
			}
			local58 += this.anIntArray451[arg0.anInt6073] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt6063 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local97 * (double) local58);
		}
		local58 = (int) ((double) (arg0.aClass2_Sub4_Sub1_1.anInt954 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static221.anInt4100 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V")
	private void method3432() {
		@Pc(14) int local14 = this.anInt3784;
		@Pc(17) int local17 = this.anInt3783;
		@Pc(20) long local20 = this.aLong123;
		if (this.aClass2_Sub25_1 != null && local17 == this.anInt3785) {
			this.method3405(this.aBoolean278, this.aClass2_Sub25_1, this.aBoolean279);
			this.method3432();
			return;
		}
		while (local17 == this.anInt3783) {
			while (this.aClass136_1.anIntArray372[local14] == local17) {
				this.aClass136_1.method3034(local14);
				@Pc(53) int local53 = this.aClass136_1.method3039(local14);
				if (local53 == 1) {
					this.aClass136_1.method3029();
					this.aClass136_1.method3033(local14);
					if (this.aClass136_1.method3025()) {
						if (this.aClass2_Sub25_1 != null) {
							this.method3402(this.aBoolean278, this.aClass2_Sub25_1);
							this.method3432();
							return;
						}
						if (!this.aBoolean278 || local17 == 0) {
							this.method3400(true);
							this.aClass136_1.method3024();
							return;
						}
						this.aClass136_1.method3032(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method3419(local53);
				}
				this.aClass136_1.method3036(local14);
				this.aClass136_1.method3033(local14);
			}
			local14 = this.aClass136_1.method3031();
			local17 = this.aClass136_1.anIntArray372[local14];
			local20 = this.aClass136_1.method3027(local17);
		}
		this.aLong123 = local20;
		this.anInt3783 = local17;
		this.anInt3784 = local14;
		if (this.aClass2_Sub25_1 != null && local17 > this.anInt3785) {
			this.anInt3783 = this.anInt3785;
			this.anInt3784 = -1;
			this.aLong123 = this.aClass136_1.method3027(this.anInt3783);
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(III)V")
	private void method3433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray463[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!tr;III[I)Z")
	public boolean method3434(@OriginalArg(0) Class2_Sub37 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0.anInt6069 = Static221.anInt4100 / 100;
		if (arg0.anInt6082 >= 0 && (arg0.aClass2_Sub2_Sub2_1 == null || arg0.aClass2_Sub2_Sub2_1.method3209())) {
			arg0.method5255();
			arg0.method5745();
			if (arg0.anInt6064 > 0 && this.aClass2_Sub37ArrayArray2[arg0.anInt6073][arg0.anInt6064] == arg0) {
				this.aClass2_Sub37ArrayArray2[arg0.anInt6073][arg0.anInt6064] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt6077;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray458[arg0.anInt6073] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt6077 = local56;
		}
		arg0.aClass2_Sub2_Sub2_1.method3204(this.method3431(arg0));
		@Pc(96) Class52 local96 = arg0.aClass52_1;
		arg0.anInt6063 += local96.anInt1248;
		arg0.anInt6065++;
		@Pc(111) boolean local111 = false;
		@Pc(135) double local135 = (double) ((arg0.anInt6074 - 60 << 8) + (arg0.anInt6077 * arg0.anInt6068 >> 12)) * 5.086263020833333E-6D;
		if (local96.anInt1253 > 0) {
			if (local96.anInt1250 <= 0) {
				arg0.anInt6076 += 128;
			} else {
				arg0.anInt6076 += (int) (Math.pow(2.0D, local135 * (double) local96.anInt1250) * 128.0D + 0.5D);
			}
			if (arg0.anInt6076 * local96.anInt1253 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray23 != null) {
			if (local96.anInt1246 > 0) {
				arg0.anInt6070 += (int) (Math.pow(2.0D, local135 * (double) local96.anInt1246) * 128.0D + 0.5D);
			} else {
				arg0.anInt6070 += 128;
			}
			while (arg0.anInt6060 < local96.aByteArray23.length - 2 && arg0.anInt6070 > (local96.aByteArray23[arg0.anInt6060 + 2] & 0xFF) << 8) {
				arg0.anInt6060 += 2;
			}
			if (local96.aByteArray23.length - 2 == arg0.anInt6060 && local96.aByteArray23[arg0.anInt6060 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg0.anInt6082 >= 0 && local96.aByteArray22 != null && (this.anIntArray456[arg0.anInt6073] & 0x1) == 0 && (arg0.anInt6064 < 0 || arg0 != this.aClass2_Sub37ArrayArray2[arg0.anInt6073][arg0.anInt6064])) {
			if (local96.anInt1252 > 0) {
				arg0.anInt6082 += (int) (Math.pow(2.0D, (double) local96.anInt1252 * local135) * 128.0D + 0.5D);
			} else {
				arg0.anInt6082 += 128;
			}
			while (local96.aByteArray22.length - 2 > arg0.anInt6067 && arg0.anInt6082 > (local96.aByteArray22[arg0.anInt6067 + 2] & 0xFF) << 8) {
				arg0.anInt6067 += 2;
			}
			if (arg0.anInt6067 == local96.aByteArray22.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg0.aClass2_Sub2_Sub2_1.method3202(arg0.anInt6069, this.method3412(arg0), this.method3429(arg0));
			return false;
		}
		arg0.aClass2_Sub2_Sub2_1.method3183(arg0.anInt6069);
		if (arg3 == null) {
			arg0.aClass2_Sub2_Sub2_1.method4833(arg2);
		} else {
			arg0.aClass2_Sub2_Sub2_1.method4828(arg3, arg1, arg2);
		}
		if (arg0.aClass2_Sub2_Sub2_1.method3190()) {
			this.aClass2_Sub2_Sub4_1.aClass2_Sub2_Sub1_1.method112(arg0.aClass2_Sub2_Sub2_1);
		}
		arg0.method5255();
		if (arg0.anInt6082 >= 0) {
			arg0.method5745();
			if (arg0.anInt6064 > 0 && this.aClass2_Sub37ArrayArray2[arg0.anInt6073][arg0.anInt6064] == arg0) {
				this.aClass2_Sub37ArrayArray2[arg0.anInt6073][arg0.anInt6064] = null;
			}
		}
		return true;
	}
}
