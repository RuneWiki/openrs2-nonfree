import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ec", name = "Ib", descriptor = "I")
	private int anInt1150;

	@OriginalMember(owner = "client!ec", name = "Jb", descriptor = "I")
	private int anInt1151;

	@OriginalMember(owner = "client!ec", name = "Kb", descriptor = "Z")
	private boolean aBoolean51;

	@OriginalMember(owner = "client!ec", name = "Lb", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!ec", name = "Mb", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "[I")
	private final int[] anIntArray92 = new int[16];

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "[I")
	private final int[] anIntArray90 = new int[16];

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[[Lclient!ng;")
	private final Class2_Sub20[][] aClass2_Sub20ArrayArray1 = new Class2_Sub20[16][128];

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[I")
	private final int[] anIntArray91 = new int[16];

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "[I")
	private final int[] anIntArray89 = new int[16];

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	private final int anInt1110 = 1000000;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[I")
	public final int[] anIntArray88 = new int[16];

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "[I")
	private final int[] anIntArray93 = new int[16];

	@OriginalMember(owner = "client!ec", name = "jb", descriptor = "[I")
	public final int[] anIntArray97 = new int[16];

	@OriginalMember(owner = "client!ec", name = "kb", descriptor = "[I")
	private final int[] anIntArray98 = new int[16];

	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "[I")
	private final int[] anIntArray96 = new int[16];

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "[I")
	private final int[] anIntArray94 = new int[16];

	@OriginalMember(owner = "client!ec", name = "yb", descriptor = "I")
	private int anInt1142 = 256;

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "[I")
	public final int[] anIntArray95 = new int[16];

	@OriginalMember(owner = "client!ec", name = "Db", descriptor = "[I")
	private final int[] anIntArray101 = new int[16];

	@OriginalMember(owner = "client!ec", name = "xb", descriptor = "[I")
	private final int[] anIntArray100 = new int[16];

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "[[Lclient!ng;")
	private final Class2_Sub20[][] aClass2_Sub20ArrayArray2 = new Class2_Sub20[16][128];

	@OriginalMember(owner = "client!ec", name = "qb", descriptor = "[I")
	private final int[] anIntArray99 = new int[16];

	@OriginalMember(owner = "client!ec", name = "Hb", descriptor = "[I")
	private final int[] anIntArray102 = new int[16];

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lclient!af;")
	private final Class3 aClass3_1 = new Class3();

	@OriginalMember(owner = "client!ec", name = "Nb", descriptor = "Lclient!ra;")
	private final Class2_Sub8_Sub4 aClass2_Sub8_Sub4_1 = new Class2_Sub8_Sub4(this);

	@OriginalMember(owner = "client!ec", name = "pb", descriptor = "Lclient!id;")
	private final Class35 aClass35_17 = new Class35(128);

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class2_Sub8_Sub1() {
		this.method766();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)V")
	private void method766() {
		this.method777(-1);
		this.method784(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray91[local15] = this.anIntArray98[local15];
		}
		for (@Pc(33) int local33 = 0; local33 < 16; local33++) {
			this.anIntArray92[local33] = this.anIntArray98[local33] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	private void method767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method789(64, arg0, arg2);
		if ((this.anIntArray97[arg0] & 0x2) != 0) {
			for (@Pc(27) Class2_Sub20 local27 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2122(); local27 != null; local27 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2112()) {
				if (local27.anInt2736 == arg0 && local27.anInt2730 < 0) {
					this.aClass2_Sub20ArrayArray2[arg0][local27.anInt2741] = null;
					this.aClass2_Sub20ArrayArray2[arg0][arg2] = local27;
					@Pc(65) int local65 = local27.anInt2740 + (local27.anInt2731 * local27.anInt2744 >> 12);
					local27.anInt2731 = 4096;
					local27.anInt2740 += arg2 - local27.anInt2741 << 8;
					local27.anInt2744 = local65 - local27.anInt2740;
					local27.anInt2741 = arg2;
					return;
				}
			}
		}
		@Pc(113) Class2_Sub12 local113 = (Class2_Sub12) this.aClass35_17.method1354((long) this.anIntArray91[arg0]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class2_Sub18_Sub1 local121 = local113.aClass2_Sub18_Sub1Array1[arg2];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class2_Sub20 local128 = new Class2_Sub20();
		local128.aClass2_Sub18_Sub1_1 = local121;
		local128.aClass2_Sub12_1 = local113;
		local128.anInt2736 = arg0;
		local128.aClass7_1 = local113.aClass7Array1[arg2];
		local128.anInt2735 = local113.aByteArray32[arg2];
		local128.anInt2741 = arg2;
		local128.anInt2729 = local113.anInt2250 * arg1 * arg1 * local113.aByteArray34[arg2] + 1024 >> 11;
		local128.anInt2747 = local113.aByteArray33[arg2] & 0xFF;
		local128.anInt2740 = (arg2 << 8) - (local113.aShortArray31[arg2] & 0x7FFF);
		local128.anInt2748 = 0;
		local128.anInt2746 = 0;
		local128.anInt2743 = 0;
		local128.anInt2738 = 0;
		local128.anInt2730 = -1;
		if (this.anIntArray95[arg0] == 0) {
			local128.aClass2_Sub8_Sub2_3 = Static182.method844(local121, this.method795(local128), this.method799(local128), this.method786(local128));
		} else {
			local128.aClass2_Sub8_Sub2_3 = Static182.method844(local121, this.method795(local128), 0, this.method786(local128));
			this.method771(local128, local113.aShortArray31[arg2] < 0);
		}
		if (local113.aShortArray31[arg2] < 0) {
			local128.aClass2_Sub8_Sub2_3.method819(-1);
		}
		if (local128.anInt2735 >= 0) {
			@Pc(278) Class2_Sub20 local278 = this.aClass2_Sub20ArrayArray1[arg0][local128.anInt2735];
			if (local278 != null && local278.anInt2730 < 0) {
				this.aClass2_Sub20ArrayArray2[arg0][local278.anInt2741] = null;
				local278.anInt2730 = 0;
			}
			this.aClass2_Sub20ArrayArray1[arg0][local128.anInt2735] = local128;
		}
		this.aClass2_Sub8_Sub4_1.aClass65_12.method2116(local128);
		this.aClass2_Sub20ArrayArray2[arg0][arg2] = local128;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)V")
	private void method768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()Lclient!qa;")
	@Override
	public synchronized Class2_Sub8 method2179() {
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public synchronized void method769() {
		for (@Pc(13) Class2_Sub12 local13 = (Class2_Sub12) this.aClass35_17.method1359(); local13 != null; local13 = (Class2_Sub12) this.aClass35_17.method1361()) {
			local13.method2888();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass3_1.method241()) {
			@Pc(18) int local18 = this.anInt1110 * this.aClass3_1.anInt376 / Static113.anInt2749;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong39;
				if (this.aLong40 - local27 >= 0L) {
					this.aLong39 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong40 + (long) local18 - this.aLong39 - 1L) / (long) local18);
				this.aLong39 += (long) local18 * (long) local58;
				this.aClass2_Sub8_Sub4_1.method2180(arg0, arg1, local58);
				this.method776();
				arg2 -= local58;
				arg1 += local58;
			} while (this.aClass3_1.method241());
		}
		this.aClass2_Sub8_Sub4_1.method2180(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	private void method770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray91[arg1] != arg0) {
			this.anIntArray91[arg1] = arg0;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass2_Sub20ArrayArray1[arg1][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ng;IZ)V")
	public void method771(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub18_Sub1_1.aByteArray36.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass2_Sub18_Sub1_1.aBoolean124) {
			@Pc(42) int local42 = local8 + local8 - arg0.aClass2_Sub18_Sub1_1.anInt2663;
			local31 = (int) ((long) local42 * (long) this.anIntArray95[arg0.anInt2736] >> 6);
			local8 <<= 0x8;
			if (local31 >= local8) {
				local31 = local8 + local8 - local31 - 1;
				arg0.aClass2_Sub8_Sub2_3.method822();
			}
		} else {
			local31 = (int) ((long) local8 * (long) this.anIntArray95[arg0.anInt2736] >> 6);
		}
		arg0.aClass2_Sub8_Sub2_3.method814(local31);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()Lclient!qa;")
	@Override
	public synchronized Class2_Sub8 method2178() {
		return this.aClass2_Sub8_Sub4_1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	private void method772(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class2_Sub20 local10 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2115(); local10 != null; local10 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2117()) {
			if ((arg0 < 0 || arg0 == local10.anInt2736) && local10.anInt2730 < 0) {
				this.aClass2_Sub20ArrayArray2[local10.anInt2736][local10.anInt2741] = null;
				local10.anInt2730 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ng;)Z")
	public boolean method775(@OriginalArg(1) Class2_Sub20 arg0) {
		if (arg0.aClass2_Sub8_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt2730 >= 0) {
			arg0.method2888();
			if (arg0.anInt2735 > 0 && this.aClass2_Sub20ArrayArray1[arg0.anInt2736][arg0.anInt2735] == arg0) {
				this.aClass2_Sub20ArrayArray1[arg0.anInt2736][arg0.anInt2735] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	private void method776() {
		@Pc(8) int local8 = this.anInt1151;
		@Pc(15) int local15 = this.anInt1150;
		@Pc(18) long local18 = this.aLong40;
		while (local15 == this.anInt1150) {
			while (local15 == this.aClass3_1.anIntArray22[local8]) {
				this.aClass3_1.method239(local8);
				@Pc(29) int local29 = this.aClass3_1.method237(local8);
				if (local29 == 1) {
					this.aClass3_1.method231();
					this.aClass3_1.method232(local8);
					if (this.aClass3_1.method242()) {
						if (!this.aBoolean51 || local15 == 0) {
							this.method766();
							this.aClass3_1.method236();
							return;
						}
						this.aClass3_1.method235(local18);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method790(local29);
				}
				this.aClass3_1.method244(local8);
				this.aClass3_1.method232(local8);
			}
			local8 = this.aClass3_1.method243();
			local15 = this.aClass3_1.anIntArray22[local8];
			local18 = this.aClass3_1.method245(local15);
		}
		this.aLong40 = local18;
		this.anInt1150 = local15;
		this.anInt1151 = local8;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)V")
	private void method777(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub20 local12 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2115(); local12 != null; local12 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2117()) {
			if (arg0 < 0 || local12.anInt2736 == arg0) {
				if (local12.aClass2_Sub8_Sub2_3 != null) {
					local12.aClass2_Sub8_Sub2_3.method832(Static113.anInt2749 / 100);
					if (local12.aClass2_Sub8_Sub2_3.method831()) {
						this.aClass2_Sub8_Sub4_1.aClass2_Sub8_Sub3_2.method1741(local12.aClass2_Sub8_Sub2_3);
					}
					local12.method1899();
				}
				if (local12.anInt2730 < 0) {
					this.aClass2_Sub20ArrayArray2[local12.anInt2736][local12.anInt2741] = null;
				}
				local12.method2888();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!jb;Lclient!jc;Lclient!ve;)Z")
	public synchronized boolean method778(@OriginalArg(2) Class39 arg0, @OriginalArg(3) Class40 arg1, @OriginalArg(4) Class2_Sub25 arg2) {
		arg2.method2727();
		@Pc(9) boolean local9 = true;
		@Pc(27) int[] local27 = new int[] { 22050 };
		for (@Pc(33) Class2_Sub5 local33 = (Class2_Sub5) arg2.aClass35_44.method1359(); local33 != null; local33 = (Class2_Sub5) arg2.aClass35_44.method1361()) {
			@Pc(39) int local39 = (int) local33.aLong145;
			@Pc(47) Class2_Sub12 local47 = (Class2_Sub12) this.aClass35_17.method1354((long) local39);
			if (local47 == null) {
				local47 = Static123.method2010(local39, arg1);
				if (local47 == null) {
					local9 = false;
					continue;
				}
				this.aClass35_17.method1362(local47, (long) local39);
			}
			if (!local47.method1577(arg0, local33.aByteArray5, local27)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method2729();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(Z)V")
	public synchronized void method779() {
		this.aClass3_1.method236();
		this.method766();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
	private void method780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray90[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)V")
	public synchronized void method781() {
		this.method788();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public synchronized void method782(@OriginalArg(0) int arg0) {
		this.anInt1142 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ve;Z)V")
	public synchronized void method783(@OriginalArg(1) Class2_Sub25 arg0, @OriginalArg(2) boolean arg1) {
		this.method779();
		this.aClass3_1.method230(arg0.aByteArray48);
		this.aBoolean51 = arg1;
		this.aLong39 = 0L;
		@Pc(23) int local23 = this.aClass3_1.method233();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass3_1.method239(local25);
			this.aClass3_1.method244(local25);
			this.aClass3_1.method232(local25);
		}
		this.anInt1151 = this.aClass3_1.method243();
		this.anInt1150 = this.aClass3_1.anIntArray22[this.anInt1151];
		this.aLong40 = this.aClass3_1.method245(this.anInt1150);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IZ)V")
	private void method784(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
				this.method784(local20);
			}
			return;
		}
		this.anIntArray96[arg0] = 12800;
		this.anIntArray101[arg0] = 8192;
		this.anIntArray102[arg0] = 16383;
		this.anIntArray90[arg0] = 8192;
		this.anIntArray89[arg0] = 0;
		this.anIntArray94[arg0] = 8192;
		this.method785(arg0);
		this.method798(arg0);
		this.anIntArray97[arg0] = 0;
		this.anIntArray99[arg0] = 32767;
		this.anIntArray100[arg0] = 256;
		this.anIntArray95[arg0] = 0;
		this.method792(8192, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
	private void method785(@OriginalArg(1) int arg0) {
		if ((this.anIntArray97[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(16) Class2_Sub20 local16 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2115(); local16 != null; local16 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2117()) {
			if (local16.anInt2736 == arg0 && this.aClass2_Sub20ArrayArray2[arg0][local16.anInt2741] == null && local16.anInt2730 < 0) {
				local16.anInt2730 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(ILclient!ng;)I")
	private int method786(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(9) int local9 = this.anIntArray101[arg0.anInt2736];
		return local9 < 8192 ? arg0.anInt2747 * local9 + 32 >> 6 : 16384 - ((128 - arg0.anInt2747) * (16384 - local9) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)V")
	private void method788() {
		this.anIntArray98[9] = 128;
		this.anIntArray92[9] = 128;
		this.method770(128, 9);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2182(@OriginalArg(0) int arg0) {
		if (this.aClass3_1.method241()) {
			@Pc(14) int local14 = this.anInt1110 * this.aClass3_1.anInt376 / Static113.anInt2749;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong39;
				if (this.aLong40 - local23 >= 0L) {
					this.aLong39 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong40 - this.aLong39 - 1L) / (long) local14);
				arg0 -= local53;
				this.aLong39 += (long) local53 * (long) local14;
				this.aClass2_Sub8_Sub4_1.method2182(local53);
				this.method776();
			} while (this.aClass3_1.method241());
		}
		this.aClass2_Sub8_Sub4_1.method2182(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIII)V")
	private void method789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub20 local16 = this.aClass2_Sub20ArrayArray2[arg1][arg2];
		if (local16 == null) {
			return;
		}
		this.aClass2_Sub20ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray97[arg1] & 0x2) == 0) {
			local16.anInt2730 = 0;
			return;
		}
		for (@Pc(47) Class2_Sub20 local47 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2115(); local47 != null; local47 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2117()) {
			if (local47.anInt2736 == local16.anInt2736 && local47.anInt2730 < 0 && local16 != local47) {
				local16.anInt2730 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)V")
	private void method790(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method789(local30, local18, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method767(local18, local30, local24);
			} else {
				this.method789(64, local18, local24);
			}
		} else if (local9 == 160) {
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			local18 = arg0 & 0xF;
			this.method796(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray92[local18] = (local30 << 14) + (this.anIntArray92[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray92[local18] = (local30 << 7) + (this.anIntArray92[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray89[local18] = (this.anIntArray89[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray89[local18] = local30 + (this.anIntArray89[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray94[local18] = (local30 << 7) + (this.anIntArray94[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray94[local18] = (this.anIntArray94[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray96[local18] = (this.anIntArray96[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray96[local18] = local30 + (this.anIntArray96[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray101[local18] = (this.anIntArray101[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray101[local18] = local30 + (this.anIntArray101[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray102[local18] = (this.anIntArray102[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray102[local18] = local30 + (this.anIntArray102[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray97[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray97[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method785(local18);
					this.anIntArray97[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray97[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray99[local18] = (local30 << 7) + (this.anIntArray99[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray99[local18] = (this.anIntArray99[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray99[local18] = (local30 << 7) + (this.anIntArray99[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray99[local18] = (this.anIntArray99[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method777(local18);
			}
			if (local24 == 121) {
				this.method784(local18);
			}
			if (local24 == 123) {
				this.method772(local18);
			}
			@Pc(505) int local505;
			if (local24 == 6) {
				local505 = this.anIntArray99[local18];
				if (local505 == 16384) {
					this.anIntArray100[local18] = (this.anIntArray100[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local505 = this.anIntArray99[local18];
				if (local505 == 16384) {
					this.anIntArray100[local18] = (this.anIntArray100[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray95[local18] = (this.anIntArray95[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray95[local18] = (this.anIntArray95[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray97[local18] |= 0x4;
				} else {
					this.method798(local18);
					this.anIntArray97[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method792((local30 << 7) + (this.anIntArray93[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method792(local30 + (this.anIntArray93[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method770(local24 + this.anIntArray92[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method768(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method780(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method766();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Z")
	public synchronized boolean method791() {
		return this.aClass3_1.method241();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IBI)V")
	private void method792(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray93[arg1] = arg0;
		this.anIntArray88[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ng;I[III)Z")
	public boolean method793(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg0.anInt2739 = Static113.anInt2749 / 100;
		if (arg0.anInt2730 >= 0 && (arg0.aClass2_Sub8_Sub2_3 == null || arg0.aClass2_Sub8_Sub2_3.method852())) {
			arg0.method1899();
			arg0.method2888();
			if (arg0.anInt2735 > 0 && arg0 == this.aClass2_Sub20ArrayArray1[arg0.anInt2736][arg0.anInt2735]) {
				this.aClass2_Sub20ArrayArray1[arg0.anInt2736][arg0.anInt2735] = null;
			}
			return true;
		}
		@Pc(57) boolean local57 = false;
		@Pc(60) int local60 = arg0.anInt2731;
		if (local60 > 0) {
			local60 -= (int) (Math.pow(2.0D, (double) this.anIntArray94[arg0.anInt2736] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local60 < 0) {
				local60 = 0;
			}
			arg0.anInt2731 = local60;
		}
		arg0.aClass2_Sub8_Sub2_3.method825(this.method795(arg0));
		@Pc(115) double local115 = (double) ((arg0.anInt2731 * arg0.anInt2744 >> 12) + (arg0.anInt2741 - 60 << 8)) * 5.086263020833333E-6D;
		arg0.anInt2745++;
		@Pc(124) Class7 local124 = arg0.aClass7_1;
		arg0.anInt2737 += local124.anInt661;
		if (local124.anInt655 > 0) {
			if (local124.anInt660 <= 0) {
				arg0.anInt2748 += 128;
			} else {
				arg0.anInt2748 += (int) (Math.pow(2.0D, local115 * (double) local124.anInt660) * 128.0D + 0.5D);
			}
			if (arg0.anInt2748 * local124.anInt655 >= 819200) {
				local57 = true;
			}
		}
		if (local124.aByteArray9 != null) {
			if (local124.anInt657 <= 0) {
				arg0.anInt2746 += 128;
			} else {
				arg0.anInt2746 += (int) (Math.pow(2.0D, (double) local124.anInt657 * local115) * 128.0D + 0.5D);
			}
			while (local124.aByteArray9.length - 2 > arg0.anInt2743 && (local124.aByteArray9[arg0.anInt2743 + 2] & 0xFF) << 8 < arg0.anInt2746) {
				arg0.anInt2743 += 2;
			}
			if (local124.aByteArray9.length - 2 == arg0.anInt2743 && local124.aByteArray9[arg0.anInt2743 + 1] == 0) {
				local57 = true;
			}
		}
		if (arg0.anInt2730 >= 0 && local124.aByteArray8 != null && (this.anIntArray97[arg0.anInt2736] & 0x1) == 0 && (arg0.anInt2735 < 0 || this.aClass2_Sub20ArrayArray1[arg0.anInt2736][arg0.anInt2735] != arg0)) {
			if (local124.anInt656 > 0) {
				arg0.anInt2730 += (int) (Math.pow(2.0D, (double) local124.anInt656 * local115) * 128.0D + 0.5D);
			} else {
				arg0.anInt2730 += 128;
			}
			while (arg0.anInt2738 < local124.aByteArray8.length - 2 && arg0.anInt2730 > (local124.aByteArray8[arg0.anInt2738 + 2] & 0xFF) << 8) {
				arg0.anInt2738 += 2;
			}
			if (arg0.anInt2738 == local124.aByteArray8.length - 2) {
				local57 = true;
			}
		}
		if (!local57) {
			arg0.aClass2_Sub8_Sub2_3.method817(arg0.anInt2739, this.method799(arg0), this.method786(arg0));
			return false;
		}
		arg0.aClass2_Sub8_Sub2_3.method832(arg0.anInt2739);
		if (arg2 == null) {
			arg0.aClass2_Sub8_Sub2_3.method2182(arg3);
		} else {
			arg0.aClass2_Sub8_Sub2_3.method2180(arg2, arg1, arg3);
		}
		if (arg0.aClass2_Sub8_Sub2_3.method831()) {
			this.aClass2_Sub8_Sub4_1.aClass2_Sub8_Sub3_2.method1741(arg0.aClass2_Sub8_Sub2_3);
		}
		arg0.method1899();
		if (arg0.anInt2730 >= 0) {
			arg0.method2888();
			if (arg0.anInt2735 > 0 && arg0 == this.aClass2_Sub20ArrayArray1[arg0.anInt2736][arg0.anInt2735]) {
				this.aClass2_Sub20ArrayArray1[arg0.anInt2736][arg0.anInt2735] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	public synchronized void method794() {
		for (@Pc(7) Class2_Sub12 local7 = (Class2_Sub12) this.aClass35_17.method1359(); local7 != null; local7 = (Class2_Sub12) this.aClass35_17.method1361()) {
			local7.method1580();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ng;I)I")
	private int method795(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(6) Class7 local6 = arg0.aClass7_1;
		@Pc(17) int local17 = (arg0.anInt2744 * arg0.anInt2731 >> 12) + arg0.anInt2740;
		local17 += this.anIntArray100[arg0.anInt2736] * (this.anIntArray90[arg0.anInt2736] - 8192) >> 12;
		@Pc(69) int local69;
		if (local6.anInt661 > 0 && (local6.anInt653 > 0 || this.anIntArray89[arg0.anInt2736] > 0)) {
			@Pc(64) int local64 = local6.anInt659 << 1;
			local69 = local6.anInt653 << 2;
			if (local64 > arg0.anInt2745) {
				local69 = arg0.anInt2745 * local69 / local64;
			}
			local69 += this.anIntArray89[arg0.anInt2736] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt2737 & 0x1FF) * 0.01227184630308513D);
			local17 += (int) ((double) local69 * local103);
		}
		local69 = (int) ((double) (arg0.aClass2_Sub18_Sub1_1.anInt2664 * 256) * Math.pow(2.0D, (double) local17 * 3.255208333333333E-4D) / (double) Static113.anInt2749 + 0.5D);
		return local69 < 1 ? 1 : local69;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2183() {
		return 0;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(IIII)V")
	private void method796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I")
	public int method797() {
		return this.anInt1142;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
	private void method798(@OriginalArg(1) int arg0) {
		if ((this.anIntArray97[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2115(); local18 != null; local18 = (Class2_Sub20) this.aClass2_Sub8_Sub4_1.aClass65_12.method2117()) {
			if (local18.anInt2736 == arg0) {
				local18.anInt2733 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!ng;)I")
	private int method799(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(13) Class7 local13 = arg0.aClass7_1;
		@Pc(29) int local29 = this.anIntArray96[arg0.anInt2736] * this.anIntArray102[arg0.anInt2736] + 4096 >> 13;
		@Pc(37) int local37 = local29 * local29 + 16384 >> 15;
		@Pc(46) int local46 = arg0.anInt2729 * local37 + 16384 >> 15;
		local29 = local46 * this.anInt1142 + 128 >> 8;
		if (local13.anInt655 > 0) {
			local29 = (int) (Math.pow(0.5D, (double) local13.anInt655 * 1.953125E-5D * (double) arg0.anInt2748) * (double) local29 + 0.5D);
		}
		@Pc(82) int local82;
		@Pc(90) int local90;
		@Pc(112) int local112;
		@Pc(124) int local124;
		if (local13.aByteArray9 != null) {
			local82 = arg0.anInt2746;
			local90 = local13.aByteArray9[arg0.anInt2743 + 1];
			if (local13.aByteArray9.length - 2 > arg0.anInt2743) {
				local112 = (local13.aByteArray9[arg0.anInt2743] & 0xFF) << 8;
				local124 = (local13.aByteArray9[arg0.anInt2743 + 2] & 0xFF) << 8;
				local90 += (local82 - local112) * (local13.aByteArray9[arg0.anInt2743 + 3] - local90) / (local124 - local112);
			}
			local29 = local90 * local29 + 32 >> 6;
		}
		if (arg0.anInt2730 > 0 && local13.aByteArray8 != null) {
			local90 = local13.aByteArray8[arg0.anInt2738 + 1];
			local82 = arg0.anInt2730;
			if (local13.aByteArray8.length - 2 > arg0.anInt2738) {
				local112 = (local13.aByteArray8[arg0.anInt2738] & 0xFF) << 8;
				local124 = (local13.aByteArray8[arg0.anInt2738 + 2] & 0xFF) << 8;
				local90 += (local13.aByteArray8[arg0.anInt2738 + 3] - local90) * (local82 - local112) / (local124 - local112);
			}
			local29 = local90 * local29 + 32 >> 6;
		}
		return local29;
	}
}
