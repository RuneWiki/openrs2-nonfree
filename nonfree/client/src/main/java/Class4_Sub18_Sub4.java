import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class4_Sub18_Sub4 extends Class4_Sub18 {

	@OriginalMember(owner = "client!wo", name = "Ib", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!wo", name = "Jb", descriptor = "I")
	private int anInt7511;

	@OriginalMember(owner = "client!wo", name = "Kb", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!wo", name = "Lb", descriptor = "I")
	private int anInt7512;

	@OriginalMember(owner = "client!wo", name = "Mb", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!wo", name = "Ob", descriptor = "I")
	private int anInt7513;

	@OriginalMember(owner = "client!wo", name = "Pb", descriptor = "Lclient!cl;")
	private Class4_Sub7 aClass4_Sub7_4;

	@OriginalMember(owner = "client!wo", name = "Qb", descriptor = "Z")
	private boolean aBoolean498;

	@OriginalMember(owner = "client!wo", name = "K", descriptor = "[I")
	private final int[] anIntArray659 = new int[16];

	@OriginalMember(owner = "client!wo", name = "J", descriptor = "[I")
	public final int[] anIntArray658 = new int[16];

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "[[Lclient!wm;")
	private final Class4_Sub45[][] aClass4_Sub45ArrayArray1 = new Class4_Sub45[16][128];

	@OriginalMember(owner = "client!wo", name = "G", descriptor = "[I")
	private final int[] anIntArray656 = new int[16];

	@OriginalMember(owner = "client!wo", name = "bb", descriptor = "[I")
	private final int[] anIntArray662 = new int[16];

	@OriginalMember(owner = "client!wo", name = "kb", descriptor = "[I")
	private final int[] anIntArray666 = new int[16];

	@OriginalMember(owner = "client!wo", name = "fb", descriptor = "[I")
	private final int[] anIntArray665 = new int[16];

	@OriginalMember(owner = "client!wo", name = "H", descriptor = "[I")
	private final int[] anIntArray657 = new int[16];

	@OriginalMember(owner = "client!wo", name = "eb", descriptor = "[I")
	private final int[] anIntArray664 = new int[16];

	@OriginalMember(owner = "client!wo", name = "db", descriptor = "[I")
	private final int[] anIntArray663 = new int[16];

	@OriginalMember(owner = "client!wo", name = "T", descriptor = "[I")
	private final int[] anIntArray660 = new int[16];

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "[I")
	private final int[] anIntArray655 = new int[16];

	@OriginalMember(owner = "client!wo", name = "sb", descriptor = "I")
	private int anInt7500 = 256;

	@OriginalMember(owner = "client!wo", name = "Y", descriptor = "[I")
	private final int[] anIntArray661 = new int[16];

	@OriginalMember(owner = "client!wo", name = "ob", descriptor = "[I")
	private final int[] anIntArray667 = new int[16];

	@OriginalMember(owner = "client!wo", name = "rb", descriptor = "[I")
	private final int[] anIntArray668 = new int[16];

	@OriginalMember(owner = "client!wo", name = "yb", descriptor = "I")
	private final int anInt7505 = 1000000;

	@OriginalMember(owner = "client!wo", name = "Cb", descriptor = "[I")
	public final int[] anIntArray669 = new int[16];

	@OriginalMember(owner = "client!wo", name = "vb", descriptor = "[[Lclient!wm;")
	private final Class4_Sub45[][] aClass4_Sub45ArrayArray2 = new Class4_Sub45[16][128];

	@OriginalMember(owner = "client!wo", name = "Hb", descriptor = "[I")
	public final int[] anIntArray670 = new int[16];

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "Lclient!km;")
	private final Class139 aClass139_1 = new Class139();

	@OriginalMember(owner = "client!wo", name = "Nb", descriptor = "Lclient!ve;")
	private final Class4_Sub18_Sub3 aClass4_Sub18_Sub3_1 = new Class4_Sub18_Sub3(this);

	@OriginalMember(owner = "client!wo", name = "Gb", descriptor = "Lclient!qo;")
	private final Class196 aClass196_42 = new Class196(128);

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class4_Sub18_Sub4() {
		this.method5784();
		this.method5786(true);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	public synchronized void method5756() {
		for (@Pc(11) Class4_Sub24 local11 = (Class4_Sub24) this.aClass196_42.method4482(); local11 != null; local11 = (Class4_Sub24) this.aClass196_42.method4472()) {
			local11.method5854();
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)V")
	public synchronized void method5758(@OriginalArg(0) int arg0) {
		this.anInt7500 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
	private void method5759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBII)V")
	private void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5781(arg0, arg1, 64);
		if ((this.anIntArray670[arg0] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub45 local28 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5536(); local28 != null; local28 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5532()) {
				if (arg0 == local28.anInt7439 && local28.anInt7452 < 0) {
					this.aClass4_Sub45ArrayArray1[arg0][local28.anInt7442] = null;
					this.aClass4_Sub45ArrayArray1[arg0][arg1] = local28;
					@Pc(70) int local70 = (local28.anInt7435 * local28.anInt7440 >> 12) + local28.anInt7453;
					local28.anInt7453 += arg1 - local28.anInt7442 << 8;
					local28.anInt7435 = 4096;
					local28.anInt7440 = local70 - local28.anInt7453;
					local28.anInt7442 = arg1;
					return;
				}
			}
		}
		@Pc(115) Class4_Sub24 local115 = (Class4_Sub24) this.aClass196_42.method4477((long) this.anIntArray667[arg0]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class4_Sub35_Sub1 local123 = local115.aClass4_Sub35_Sub1Array1[arg1];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class4_Sub45 local130 = new Class4_Sub45();
		local130.aClass4_Sub35_Sub1_2 = local123;
		local130.anInt7439 = arg0;
		local130.aClass4_Sub24_1 = local115;
		local130.aClass194_1 = local115.aClass194Array1[arg1];
		local130.anInt7434 = local115.aByteArray38[arg1];
		local130.anInt7442 = arg1;
		local130.anInt7433 = local115.aByteArray39[arg1] * local115.anInt3779 * arg2 * arg2 + 1024 >> 11;
		local130.anInt7437 = local115.aByteArray40[arg1] & 0xFF;
		local130.anInt7453 = (arg1 << 8) - (local115.aShortArray60[arg1] & 0x7FFF);
		local130.anInt7452 = -1;
		local130.anInt7443 = 0;
		local130.anInt7445 = 0;
		local130.anInt7447 = 0;
		local130.anInt7441 = 0;
		if (this.anIntArray669[arg0] == 0) {
			local130.aClass4_Sub18_Sub2_4 = Static463.method4563(local123, this.method5788(local130), this.method5761(local130), this.method5783(local130));
		} else {
			local130.aClass4_Sub18_Sub2_4 = Static463.method4563(local123, this.method5788(local130), 0, this.method5783(local130));
			this.method5763(local130, local115.aShortArray60[arg1] < 0);
		}
		if (local115.aShortArray60[arg1] < 0) {
			local130.aClass4_Sub18_Sub2_4.method4578(-1);
		}
		if (local130.anInt7434 >= 0) {
			@Pc(284) Class4_Sub45 local284 = this.aClass4_Sub45ArrayArray2[arg0][local130.anInt7434];
			if (local284 != null && local284.anInt7452 < 0) {
				this.aClass4_Sub45ArrayArray1[arg0][local284.anInt7442] = null;
				local284.anInt7452 = 0;
			}
			this.aClass4_Sub45ArrayArray2[arg0][local130.anInt7434] = local130;
		}
		this.aClass4_Sub18_Sub3_1.aClass258_46.method5526(local130);
		this.aClass4_Sub45ArrayArray1[arg0][arg1] = local130;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5755(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass139_1.method2995()) {
			@Pc(14) int local14 = this.aClass139_1.anInt3965 * this.anInt7505 / Static410.anInt6810;
			do {
				@Pc(23) long local23 = this.aLong222 + (long) arg2 * (long) local14;
				if (this.aLong221 - local23 >= 0L) {
					this.aLong222 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong221 - this.aLong222 - 1L) / (long) local14);
				this.aLong222 += (long) local14 * (long) local54;
				this.aClass4_Sub18_Sub3_1.method5755(arg0, arg1, local54);
				this.method5773();
				arg2 -= local54;
				arg1 += local54;
			} while (this.aClass139_1.method2995());
		}
		this.aClass4_Sub18_Sub3_1.method5755(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!wm;)I")
	private int method5761(@OriginalArg(1) Class4_Sub45 arg0) {
		if (this.anIntArray659[arg0.anInt7439] == 0) {
			return 0;
		}
		@Pc(17) Class194 local17 = arg0.aClass194_1;
		@Pc(33) int local33 = this.anIntArray666[arg0.anInt7439] * this.anIntArray662[arg0.anInt7439] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt7433 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt7500 * local50 + 128 >> 8;
		local33 = local59 * this.anIntArray659[arg0.anInt7439] + 128 >> 8;
		if (local17.anInt5757 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) arg0.anInt7441 * 1.953125E-5D * (double) local17.anInt5757) * (double) local33 + 0.5D);
		}
		@Pc(110) int local110;
		@Pc(118) int local118;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local17.aByteArray68 != null) {
			local110 = arg0.anInt7445;
			local118 = local17.aByteArray68[arg0.anInt7443 + 1];
			if (local17.aByteArray68.length - 2 > arg0.anInt7443) {
				local136 = (local17.aByteArray68[arg0.anInt7443] & 0xFF) << 8;
				local148 = (local17.aByteArray68[arg0.anInt7443 + 2] & 0xFF) << 8;
				local118 += (local110 - local136) * (local17.aByteArray68[arg0.anInt7443 + 3] - local118) / (local148 - local136);
			}
			local33 = local118 * local33 + 32 >> 6;
		}
		if (arg0.anInt7452 > 0 && local17.aByteArray67 != null) {
			local110 = arg0.anInt7452;
			local118 = local17.aByteArray67[arg0.anInt7447 + 1];
			if (local17.aByteArray67.length - 2 > arg0.anInt7447) {
				local136 = (local17.aByteArray67[arg0.anInt7447] & 0xFF) << 8;
				local148 = (local17.aByteArray67[arg0.anInt7447 + 2] & 0xFF) << 8;
				local118 += (local17.aByteArray67[arg0.anInt7447 + 3] - local118) * (local110 - local136) / (local148 - local136);
			}
			local33 = local33 * local118 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIILclient!wm;[I)Z")
	public boolean method5762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub45 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt7436 = Static410.anInt6810 / 100;
		if (arg2.anInt7452 >= 0 && (arg2.aClass4_Sub18_Sub2_4 == null || arg2.aClass4_Sub18_Sub2_4.method4560())) {
			arg2.method5737();
			arg2.method5854();
			if (arg2.anInt7434 > 0 && arg2 == this.aClass4_Sub45ArrayArray2[arg2.anInt7439][arg2.anInt7434]) {
				this.aClass4_Sub45ArrayArray2[arg2.anInt7439][arg2.anInt7434] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt7435;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray656[arg2.anInt7439] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt7435 = local56;
		}
		arg2.aClass4_Sub18_Sub2_4.method4551(this.method5788(arg2));
		@Pc(93) Class194 local93 = arg2.aClass194_1;
		arg2.anInt7444++;
		@Pc(101) boolean local101 = false;
		arg2.anInt7448 += local93.anInt5754;
		@Pc(126) double local126 = (double) ((arg2.anInt7435 * arg2.anInt7440 >> 12) + (arg2.anInt7442 - 60 << 8)) * 5.086263020833333E-6D;
		if (local93.anInt5757 > 0) {
			if (local93.anInt5762 <= 0) {
				arg2.anInt7441 += 128;
			} else {
				arg2.anInt7441 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt5762) * 128.0D + 0.5D);
			}
			if (local93.anInt5757 * arg2.anInt7441 >= 819200) {
				local101 = true;
			}
		}
		if (local93.aByteArray68 != null) {
			if (local93.anInt5759 > 0) {
				arg2.anInt7445 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt5759) * 128.0D + 0.5D);
			} else {
				arg2.anInt7445 += 128;
			}
			while (local93.aByteArray68.length - 2 > arg2.anInt7443 && (local93.aByteArray68[arg2.anInt7443 + 2] & 0xFF) << 8 < arg2.anInt7445) {
				arg2.anInt7443 += 2;
			}
			if (arg2.anInt7443 == local93.aByteArray68.length - 2 && local93.aByteArray68[arg2.anInt7443 + 1] == 0) {
				local101 = true;
			}
		}
		if (arg2.anInt7452 >= 0 && local93.aByteArray67 != null && (this.anIntArray670[arg2.anInt7439] & 0x1) == 0 && (arg2.anInt7434 < 0 || arg2 != this.aClass4_Sub45ArrayArray2[arg2.anInt7439][arg2.anInt7434])) {
			if (local93.anInt5758 <= 0) {
				arg2.anInt7452 += 128;
			} else {
				arg2.anInt7452 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt5758) * 128.0D + 0.5D);
			}
			while (arg2.anInt7447 < local93.aByteArray67.length - 2 && arg2.anInt7452 > (local93.aByteArray67[arg2.anInt7447 + 2] & 0xFF) << 8) {
				arg2.anInt7447 += 2;
			}
			if (local93.aByteArray67.length - 2 == arg2.anInt7447) {
				local101 = true;
			}
		}
		if (!local101) {
			arg2.aClass4_Sub18_Sub2_4.method4547(arg2.anInt7436, this.method5761(arg2), this.method5783(arg2));
			return false;
		}
		arg2.aClass4_Sub18_Sub2_4.method4558(arg2.anInt7436);
		if (arg3 == null) {
			arg2.aClass4_Sub18_Sub2_4.method5749(arg1);
		} else {
			arg2.aClass4_Sub18_Sub2_4.method5755(arg3, arg0, arg1);
		}
		if (arg2.aClass4_Sub18_Sub2_4.method4572()) {
			this.aClass4_Sub18_Sub3_1.aClass4_Sub18_Sub1_2.method2787(arg2.aClass4_Sub18_Sub2_4);
		}
		arg2.method5737();
		if (arg2.anInt7452 >= 0) {
			arg2.method5854();
			if (arg2.anInt7434 > 0 && this.aClass4_Sub45ArrayArray2[arg2.anInt7439][arg2.anInt7434] == arg2) {
				this.aClass4_Sub45ArrayArray2[arg2.anInt7439][arg2.anInt7434] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "()I")
	@Override
	public synchronized int method5754() {
		return 0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "()Lclient!ho;")
	@Override
	public synchronized Class4_Sub18 method5751() {
		return this.aClass4_Sub18_Sub3_1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!wm;ZI)V")
	public void method5763(@OriginalArg(0) Class4_Sub45 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass4_Sub35_Sub1_2.aByteArray92.length;
		@Pc(42) int local42;
		if (arg1 && arg0.aClass4_Sub35_Sub1_2.aBoolean468) {
			@Pc(25) int local25 = local8 + local8 - arg0.aClass4_Sub35_Sub1_2.anInt6960;
			local8 <<= 0x8;
			local42 = (int) ((long) local25 * (long) this.anIntArray669[arg0.anInt7439] >> 6);
			if (local8 <= local42) {
				arg0.aClass4_Sub18_Sub2_4.method4549();
				local42 = local8 + local8 - local42 - 1;
			}
		} else {
			local42 = (int) ((long) this.anIntArray669[arg0.anInt7439] * (long) local8 >> 6);
		}
		arg0.aClass4_Sub18_Sub2_4.method4580(local42);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V")
	private void method5764(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class4_Sub45 local8 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5538(); local8 != null; local8 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5528()) {
			if ((arg0 < 0 || local8.anInt7439 == arg0) && local8.anInt7452 < 0) {
				this.aClass4_Sub45ArrayArray1[local8.anInt7439][local8.anInt7442] = null;
				local8.anInt7452 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V")
	public synchronized void method5765() {
		this.method5780(true);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(II)V")
	private void method5766(@OriginalArg(1) int arg0) {
		if ((this.anIntArray670[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub45 local18 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5538(); local18 != null; local18 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5528()) {
			if (local18.anInt7439 == arg0 && this.aClass4_Sub45ArrayArray1[arg0][local18.anInt7442] == null && local18.anInt7452 < 0) {
				local18.anInt7452 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	public synchronized void method5767() {
		for (@Pc(15) Class4_Sub24 local15 = (Class4_Sub24) this.aClass196_42.method4482(); local15 != null; local15 = (Class4_Sub24) this.aClass196_42.method4472()) {
			local15.method2842();
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "()Lclient!ho;")
	@Override
	public synchronized Class4_Sub18 method5752() {
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(II)V")
	private void method5769(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local15 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method5781(local24, local30, local36);
		} else if (local15 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method5760(local24, local30, local36);
			} else {
				this.method5781(local24, local30, 64);
			}
		} else if (local15 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method5792(local24, local30, local36);
		} else if (local15 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray655[local24] = (this.anIntArray655[local24] & 0xFFE03FFF) + (local36 << 14);
			}
			if (local30 == 32) {
				this.anIntArray655[local24] = (local36 << 7) + (this.anIntArray655[local24] & 0xFFFFC07F);
			}
			if (local30 == 1) {
				this.anIntArray668[local24] = (this.anIntArray668[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 33) {
				this.anIntArray668[local24] = (this.anIntArray668[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 5) {
				this.anIntArray656[local24] = (local36 << 7) + (this.anIntArray656[local24] & 0xFFFFC07F);
			}
			if (local30 == 37) {
				this.anIntArray656[local24] = (this.anIntArray656[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 7) {
				this.anIntArray666[local24] = (this.anIntArray666[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 39) {
				this.anIntArray666[local24] = (this.anIntArray666[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 10) {
				this.anIntArray663[local24] = (local36 << 7) + (this.anIntArray663[local24] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray663[local24] = (this.anIntArray663[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 11) {
				this.anIntArray662[local24] = (this.anIntArray662[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 43) {
				this.anIntArray662[local24] = (this.anIntArray662[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 64) {
				if (local36 >= 64) {
					this.anIntArray670[local24] |= 0x1;
				} else {
					this.anIntArray670[local24] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local36 >= 64) {
					this.anIntArray670[local24] |= 0x2;
				} else {
					this.method5766(local24);
					this.anIntArray670[local24] &= 0xFFFFFFFD;
				}
			}
			if (local30 == 99) {
				this.anIntArray657[local24] = (this.anIntArray657[local24] & 0x7F) + (local36 << 7);
			}
			if (local30 == 98) {
				this.anIntArray657[local24] = local36 + (this.anIntArray657[local24] & 0x3F80);
			}
			if (local30 == 101) {
				this.anIntArray657[local24] = (this.anIntArray657[local24] & 0x7F) + (local36 << 7) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray657[local24] = (this.anIntArray657[local24] & 0x3F80) + local36 + 16384;
			}
			if (local30 == 120) {
				this.method5790(local24);
			}
			if (local30 == 121) {
				this.method5787(local24);
			}
			if (local30 == 123) {
				this.method5764(local24);
			}
			@Pc(509) int local509;
			if (local30 == 6) {
				local509 = this.anIntArray657[local24];
				if (local509 == 16384) {
					this.anIntArray660[local24] = (local36 << 7) + (this.anIntArray660[local24] & 0xFFFFC07F);
				}
			}
			if (local30 == 38) {
				local509 = this.anIntArray657[local24];
				if (local509 == 16384) {
					this.anIntArray660[local24] = local36 + (this.anIntArray660[local24] & 0xFFFFFF80);
				}
			}
			if (local30 == 16) {
				this.anIntArray669[local24] = (this.anIntArray669[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 48) {
				this.anIntArray669[local24] = local36 + (this.anIntArray669[local24] & 0xFFFFFF80);
			}
			if (local30 == 81) {
				if (local36 < 64) {
					this.method5791(local24);
					this.anIntArray670[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray670[local24] |= 0x4;
				}
			}
			if (local30 == 17) {
				this.method5778((this.anIntArray664[local24] & 0xFFFFC07F) + (local36 << 7), local24);
			}
			if (local30 == 49) {
				this.method5778((this.anIntArray664[local24] & 0xFFFFFF80) + local36, local24);
			}
		} else if (local15 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method5789(this.anIntArray655[local24] + local30, local24);
		} else if (local15 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method5759(local24, local30);
		} else if (local15 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FE9) >> 8);
			this.method5772(local30, local24);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method5786(true);
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(ILclient!wm;)Z")
	public boolean method5770(@OriginalArg(1) Class4_Sub45 arg0) {
		if (arg0.aClass4_Sub18_Sub2_4 != null) {
			return false;
		}
		if (arg0.anInt7452 >= 0) {
			arg0.method5854();
			if (arg0.anInt7434 > 0 && arg0 == this.aClass4_Sub45ArrayArray2[arg0.anInt7439][arg0.anInt7434]) {
				this.aClass4_Sub45ArrayArray2[arg0.anInt7439][arg0.anInt7434] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I")
	public int method5771() {
		return this.anInt7500;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)V")
	private void method5772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray665[arg1] = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)V")
	private void method5773() {
		@Pc(8) int local8 = this.anInt7511;
		@Pc(11) int local11 = this.anInt7512;
		@Pc(14) long local14 = this.aLong221;
		if (this.aClass4_Sub7_4 != null && local11 == this.anInt7513) {
			this.method5785(this.aClass4_Sub7_4, this.aBoolean498, this.aBoolean497);
			this.method5773();
			return;
		}
		while (this.anInt7512 == local11) {
			while (local11 == this.aClass139_1.anIntArray327[local8]) {
				this.aClass139_1.method3010(local8);
				@Pc(49) int local49 = this.aClass139_1.method2998(local8);
				if (local49 == 1) {
					this.aClass139_1.method3009();
					this.aClass139_1.method3003(local8);
					if (this.aClass139_1.method3002()) {
						if (this.aClass4_Sub7_4 != null) {
							this.method5779(this.aClass4_Sub7_4, this.aBoolean497);
							this.method5773();
							return;
						}
						if (!this.aBoolean497 || local11 == 0) {
							this.method5786(true);
							this.aClass139_1.method2996();
							return;
						}
						this.aClass139_1.method2997(local14);
					}
					break;
				}
				if ((local49 & 0x80) != 0) {
					this.method5769(local49);
				}
				this.aClass139_1.method3000(local8);
				this.aClass139_1.method3003(local8);
			}
			local8 = this.aClass139_1.method2999();
			local11 = this.aClass139_1.anIntArray327[local8];
			local14 = this.aClass139_1.method3007(local11);
		}
		this.aLong221 = local14;
		this.anInt7511 = local8;
		this.anInt7512 = local11;
		if (this.aClass4_Sub7_4 != null && this.anInt7513 < local11) {
			this.anInt7512 = this.anInt7513;
			this.anInt7511 = -1;
			this.aLong221 = this.aClass139_1.method3007(this.anInt7512);
		}
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)Z")
	public synchronized boolean method5774() {
		return this.aClass139_1.method2995();
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(III)V")
	public synchronized void method5775() {
		this.method5776();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIB)V")
	private void method5776() {
		this.anIntArray661[9] = 128;
		this.anIntArray655[9] = 128;
		this.method5789(128, 9);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(III)V")
	private void method5778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray664[arg1] = arg0;
		this.anIntArray658[arg1] = (int) (Math.pow((double) 2, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!cl;ZI)V")
	public synchronized void method5779(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		this.method5785(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(IZ)V")
	private synchronized void method5780(@OriginalArg(1) boolean arg0) {
		this.aClass139_1.method2996();
		this.aClass4_Sub7_4 = null;
		this.method5786(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIBI)V")
	private void method5781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub45 local12 = this.aClass4_Sub45ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub45ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray670[arg0] & 0x2) == 0) {
			local12.anInt7452 = 0;
			return;
		}
		for (@Pc(43) Class4_Sub45 local43 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5538(); local43 != null; local43 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5528()) {
			if (local12.anInt7439 == local43.anInt7439 && local43.anInt7452 < 0 && local12 != local43) {
				local12.anInt7452 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ns;BLclient!cl;ILclient!en;)Z")
	public synchronized boolean method5782(@OriginalArg(0) Class166 arg0, @OriginalArg(2) Class4_Sub7 arg1, @OriginalArg(4) Class65 arg2) {
		arg1.method1078();
		@Pc(15) boolean local15 = true;
		@Pc(26) int[] local26 = new int[] { 22050 };
		for (@Pc(32) Class4_Sub26 local32 = (Class4_Sub26) arg1.aClass196_3.method4482(); local32 != null; local32 = (Class4_Sub26) arg1.aClass196_3.method4472()) {
			@Pc(38) int local38 = (int) local32.aLong225;
			@Pc(46) Class4_Sub24 local46 = (Class4_Sub24) this.aClass196_42.method4477((long) local38);
			if (local46 == null) {
				local46 = Static375.method4048(arg0, local38);
				if (local46 == null) {
					local15 = false;
					continue;
				}
				this.aClass196_42.method4474((long) local38, local46);
			}
			if (!local46.method2840(local32.aByteArray41, local26, arg2)) {
				local15 = false;
			}
		}
		if (local15) {
			arg1.method1080();
		}
		return local15;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!wm;B)I")
	private int method5783(@OriginalArg(0) Class4_Sub45 arg0) {
		@Pc(9) int local9 = this.anIntArray663[arg0.anInt7439];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt7437) * (-local9 + 16384) + 32 >> 6) : arg0.anInt7437 * local9 - -32 >> 6;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BII)V")
	private synchronized void method5784() {
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray659[local19] = 256;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5749(@OriginalArg(0) int arg0) {
		if (this.aClass139_1.method2995()) {
			@Pc(14) int local14 = this.aClass139_1.anInt3965 * this.anInt7505 / Static410.anInt6810;
			do {
				@Pc(23) long local23 = this.aLong222 + (long) local14 * (long) arg0;
				if (this.aLong221 - local23 >= 0L) {
					this.aLong222 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong221 - this.aLong222 - 1L) / (long) local14);
				this.aLong222 += (long) local14 * (long) local54;
				this.aClass4_Sub18_Sub3_1.method5749(local54);
				arg0 -= local54;
				this.method5773();
			} while (this.aClass139_1.method2995());
		}
		this.aClass4_Sub18_Sub3_1.method5749(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!cl;IZZ)V")
	private synchronized void method5785(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method5780(arg1);
		this.aClass139_1.method3006(arg0.aByteArray10);
		this.aBoolean497 = arg2;
		this.aLong222 = 0L;
		@Pc(24) int local24 = this.aClass139_1.method3008();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass139_1.method3010(local26);
			this.aClass139_1.method3000(local26);
			this.aClass139_1.method3003(local26);
		}
		this.anInt7511 = this.aClass139_1.method2999();
		this.anInt7512 = this.aClass139_1.anIntArray327[this.anInt7511];
		this.aLong221 = this.aClass139_1.method3007(this.anInt7512);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
	private void method5786(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5790(-1);
		} else {
			this.method5764(-1);
		}
		this.method5787(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray667[local23] = this.anIntArray661[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray655[local41] = this.anIntArray661[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	private void method5787(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method5787(local9);
			}
			return;
		}
		this.anIntArray666[arg0] = 12800;
		this.anIntArray663[arg0] = 8192;
		this.anIntArray662[arg0] = 16383;
		this.anIntArray665[arg0] = 8192;
		this.anIntArray668[arg0] = 0;
		this.anIntArray656[arg0] = 8192;
		this.method5766(arg0);
		this.method5791(arg0);
		this.anIntArray670[arg0] = 0;
		this.anIntArray657[arg0] = 32767;
		this.anIntArray660[arg0] = 256;
		this.anIntArray669[arg0] = 0;
		this.method5778(8192, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Lclient!wm;B)I")
	private int method5788(@OriginalArg(0) Class4_Sub45 arg0) {
		@Pc(22) int local22 = arg0.anInt7453 + (arg0.anInt7435 * arg0.anInt7440 >> 12);
		local22 += (this.anIntArray665[arg0.anInt7439] - 8192) * this.anIntArray660[arg0.anInt7439] >> 12;
		@Pc(43) Class194 local43 = arg0.aClass194_1;
		@Pc(66) int local66;
		if (local43.anInt5754 > 0 && (local43.anInt5756 > 0 || this.anIntArray668[arg0.anInt7439] > 0)) {
			local66 = local43.anInt5756 << 2;
			@Pc(71) int local71 = local43.anInt5760 << 1;
			if (local71 > arg0.anInt7444) {
				local66 = local66 * arg0.anInt7444 / local71;
			}
			local66 += this.anIntArray668[arg0.anInt7439] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt7448 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) (local105 * (double) local66);
		}
		local66 = (int) ((double) (arg0.aClass4_Sub35_Sub1_2.anInt6961 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static410.anInt6810 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(III)V")
	private void method5789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray667[arg1]) {
			this.anIntArray667[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass4_Sub45ArrayArray2[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(II)V")
	private void method5790(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class4_Sub45 local12 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5538(); local12 != null; local12 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5528()) {
			if (arg0 < 0 || arg0 == local12.anInt7439) {
				if (local12.aClass4_Sub18_Sub2_4 != null) {
					local12.aClass4_Sub18_Sub2_4.method4558(Static410.anInt6810 / 100);
					if (local12.aClass4_Sub18_Sub2_4.method4572()) {
						this.aClass4_Sub18_Sub3_1.aClass4_Sub18_Sub1_2.method2787(local12.aClass4_Sub18_Sub2_4);
					}
					local12.method5737();
				}
				if (local12.anInt7452 < 0) {
					this.aClass4_Sub45ArrayArray1[local12.anInt7439][local12.anInt7442] = null;
				}
				local12.method5854();
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(II)V")
	private void method5791(@OriginalArg(1) int arg0) {
		if ((this.anIntArray670[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(29) Class4_Sub45 local29 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5538(); local29 != null; local29 = (Class4_Sub45) this.aClass4_Sub18_Sub3_1.aClass258_46.method5528()) {
			if (local29.anInt7439 == arg0) {
				local29.anInt7446 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(IBII)V")
	private void method5792(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}
}
