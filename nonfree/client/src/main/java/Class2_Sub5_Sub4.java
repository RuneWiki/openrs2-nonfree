import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class2_Sub5_Sub4 extends Class2_Sub5 {

	@OriginalMember(owner = "client!wb", name = "Gb", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!wb", name = "Hb", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!wb", name = "Ib", descriptor = "I")
	private int anInt3771;

	@OriginalMember(owner = "client!wb", name = "Jb", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!wb", name = "Kb", descriptor = "I")
	private int anInt3772;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "[I")
	private final int[] anIntArray407 = new int[16];

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "[I")
	private final int[] anIntArray408 = new int[16];

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "[I")
	private final int[] anIntArray409 = new int[16];

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
	private int anInt3744 = 256;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "[I")
	public final int[] anIntArray410 = new int[16];

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "[I")
	private final int[] anIntArray404 = new int[16];

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "[I")
	private final int[] anIntArray411 = new int[16];

	@OriginalMember(owner = "client!wb", name = "jb", descriptor = "[I")
	public final int[] anIntArray415 = new int[16];

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "[I")
	private final int[] anIntArray405 = new int[16];

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "[I")
	private final int[] anIntArray412 = new int[16];

	@OriginalMember(owner = "client!wb", name = "kb", descriptor = "[[Lclient!ed;")
	private final Class2_Sub7[][] aClass2_Sub7ArrayArray2 = new Class2_Sub7[16][128];

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "[I")
	private final int[] anIntArray406 = new int[16];

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "[I")
	private final int[] anIntArray418 = new int[16];

	@OriginalMember(owner = "client!wb", name = "rb", descriptor = "I")
	private final int anInt3757 = 1000000;

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "[I")
	public final int[] anIntArray413 = new int[16];

	@OriginalMember(owner = "client!wb", name = "lb", descriptor = "[I")
	private final int[] anIntArray416 = new int[16];

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "[I")
	private final int[] anIntArray414 = new int[16];

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "[[Lclient!ed;")
	private final Class2_Sub7[][] aClass2_Sub7ArrayArray1 = new Class2_Sub7[16][128];

	@OriginalMember(owner = "client!wb", name = "qb", descriptor = "[I")
	private final int[] anIntArray417 = new int[16];

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "Lclient!kc;")
	private final Class46 aClass46_1 = new Class46();

	@OriginalMember(owner = "client!wb", name = "Lb", descriptor = "Lclient!dc;")
	private final Class2_Sub5_Sub1 aClass2_Sub5_Sub1_1 = new Class2_Sub5_Sub1(this);

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "Lclient!dh;")
	private final Class18 aClass18_11 = new Class18(128);

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class2_Sub5_Sub4() {
		this.method2688();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)I")
	public int method2660() {
		return this.anInt3744;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lclient!nb;")
	@Override
	public synchronized Class2_Sub5 method2652() {
		return this.aClass2_Sub5_Sub1_1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZ)V")
	private void method2662() {
		this.anIntArray412[9] = 128;
		this.anIntArray418[9] = 128;
		this.method2668(9, 128);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!la;I)V")
	public synchronized void method2663(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		this.method2691();
		this.aClass46_1.method1339(arg1.aByteArray25);
		this.aLong138 = 0L;
		this.aBoolean166 = arg0;
		@Pc(23) int local23 = this.aClass46_1.method1335();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass46_1.method1342(local25);
			this.aClass46_1.method1343(local25);
			this.aClass46_1.method1341(local25);
		}
		this.anInt3772 = this.aClass46_1.method1340();
		this.anInt3771 = this.aClass46_1.anIntArray209[this.anInt3772];
		this.aLong137 = this.aClass46_1.method1337(this.anInt3771);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2657() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public synchronized void method2664() {
		for (@Pc(7) Class2_Sub3 local7 = (Class2_Sub3) this.aClass18_11.method687(); local7 != null; local7 = (Class2_Sub3) this.aClass18_11.method682()) {
			local7.method2705();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB)V")
	private void method2665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray411[arg1] = arg0;
		this.anIntArray415[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Z")
	public synchronized boolean method2666() {
		return this.aClass46_1.method1330();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!la;Lclient!fc;IILclient!kh;)Z")
	public synchronized boolean method2667(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(4) Class29 arg2) {
		arg0.method1507();
		@Pc(17) int[] local17 = new int[] { 22050 };
		@Pc(23) boolean local23 = true;
		for (@Pc(29) Class2_Sub6 local29 = (Class2_Sub6) arg0.aClass18_8.method687(); local29 != null; local29 = (Class2_Sub6) arg0.aClass18_8.method682()) {
			@Pc(35) int local35 = (int) local29.aLong139;
			@Pc(43) Class2_Sub3 local43 = (Class2_Sub3) this.aClass18_11.method683((long) local35);
			if (local43 == null) {
				local43 = Static18.method318(arg2, local35);
				if (local43 == null) {
					local23 = false;
					continue;
				}
				this.aClass18_11.method685((long) local35, local43);
			}
			if (!local43.method217(local17, arg1, local29.aByteArray10)) {
				local23 = false;
			}
		}
		if (local23) {
			arg0.method1506();
		}
		return local23;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()Lclient!nb;")
	@Override
	public synchronized Class2_Sub5 method2655() {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2653(@OriginalArg(0) int arg0) {
		if (this.aClass46_1.method1330()) {
			@Pc(18) int local18 = this.aClass46_1.anInt1907 * this.anInt3757 / Static45.anInt1131;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong138;
				if (this.aLong137 - local27 >= 0L) {
					this.aLong138 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong137 - this.aLong138 - 1L) / (long) local18);
				arg0 -= local55;
				this.aLong138 += (long) local55 * (long) local18;
				this.aClass2_Sub5_Sub1_1.method2653(local55);
				this.method2682();
			} while (this.aClass46_1.method1330());
		}
		this.aClass2_Sub5_Sub1_1.method2653(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	private void method2668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray414[arg0]) {
			this.anIntArray414[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass2_Sub7ArrayArray1[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!ed;)I")
	private int method2669(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(14) int local14 = this.anIntArray416[arg0.anInt949];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt958 + 128) + 32 >> 6) : arg0.anInt958 * local14 + 32 >> 6;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	public synchronized void method2670() {
		for (@Pc(11) Class2_Sub3 local11 = (Class2_Sub3) this.aClass18_11.method687(); local11 != null; local11 = (Class2_Sub3) this.aClass18_11.method682()) {
			local11.method221();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ed;I)I")
	private int method2671(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(14) int local14 = (arg0.anInt950 * arg0.anInt948 >> 12) + arg0.anInt964;
		@Pc(17) Class67 local17 = arg0.aClass67_1;
		local14 += this.anIntArray408[arg0.anInt949] * (this.anIntArray405[arg0.anInt949] - 8192) >> 12;
		@Pc(55) int local55;
		if (local17.anInt2907 > 0 && (local17.anInt2903 > 0 || this.anIntArray409[arg0.anInt949] > 0)) {
			local55 = local17.anInt2903 << 2;
			@Pc(60) int local60 = local17.anInt2901 << 1;
			if (arg0.anInt946 < local60) {
				local55 = local55 * arg0.anInt946 / local60;
			}
			local55 += this.anIntArray409[arg0.anInt949] >> 7;
			@Pc(94) double local94 = Math.sin((double) (arg0.anInt944 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local94 * (double) local55);
		}
		local55 = (int) ((double) (arg0.aClass2_Sub10_Sub1_1.anInt1799 * 256) * Math.pow((double) 2, (double) local14 * 3.255208333333333E-4D) / (double) Static45.anInt1131 + 0.5D);
		return local55 < 1 ? 1 : local55;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2651(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass46_1.method1330()) {
			@Pc(14) int local14 = this.aClass46_1.anInt1907 * this.anInt3757 / Static45.anInt1131;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong138;
				if (this.aLong137 - local23 >= 0L) {
					this.aLong138 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong137 - this.aLong138 - 1L) / (long) local14);
				this.aLong138 += (long) local14 * (long) local51;
				this.aClass2_Sub5_Sub1_1.method2651(arg0, arg1, local51);
				arg1 += local51;
				this.method2682();
				arg2 -= local51;
			} while (this.aClass46_1.method1330());
		}
		this.aClass2_Sub5_Sub1_1.method2651(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
	private void method2672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray405[arg1] = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
	private void method2673(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub7 local8 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method384(); local8 != null; local8 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method381()) {
			if ((arg0 < 0 || arg0 == local8.anInt949) && local8.anInt960 < 0) {
				this.aClass2_Sub7ArrayArray2[local8.anInt949][local8.anInt955] = null;
				local8.anInt960 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILclient!ed;)Z")
	public boolean method2674(@OriginalArg(1) Class2_Sub7 arg0) {
		if (arg0.aClass2_Sub5_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt960 >= 0) {
			arg0.method2705();
			if (arg0.anInt962 > 0 && arg0 == this.aClass2_Sub7ArrayArray1[arg0.anInt949][arg0.anInt962]) {
				this.aClass2_Sub7ArrayArray1[arg0.anInt949][arg0.anInt962] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
	private void method2675(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
				this.method2675(local16);
			}
			return;
		}
		this.anIntArray406[arg0] = 12800;
		this.anIntArray416[arg0] = 8192;
		this.anIntArray407[arg0] = 16383;
		this.anIntArray405[arg0] = 8192;
		this.anIntArray409[arg0] = 0;
		this.anIntArray417[arg0] = 8192;
		this.method2681(arg0);
		this.method2687(arg0);
		this.anIntArray410[arg0] = 0;
		this.anIntArray404[arg0] = 32767;
		this.anIntArray408[arg0] = 256;
		this.anIntArray413[arg0] = 0;
		this.method2665(8192, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIB)V")
	private void method2676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArray2[arg2][arg0];
		if (local8 == null) {
			return;
		}
		this.aClass2_Sub7ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray410[arg2] & 0x2) == 0) {
			local8.anInt960 = 0;
			return;
		}
		for (@Pc(44) Class2_Sub7 local44 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method384(); local44 != null; local44 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method381()) {
			if (local44.anInt949 == local8.anInt949 && local44.anInt960 < 0 && local44 != local8) {
				local8.anInt960 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(III)V")
	public synchronized void method2677() {
		this.method2662();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ed;IZ)V")
	public void method2679(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) int local4 = arg0.aClass2_Sub10_Sub1_1.aByteArray21.length;
		@Pc(36) int local36;
		if (arg1 && arg0.aClass2_Sub10_Sub1_1.aBoolean78) {
			@Pc(23) int local23 = local4 + local4 - arg0.aClass2_Sub10_Sub1_1.anInt1798;
			local36 = (int) ((long) this.anIntArray413[arg0.anInt949] * (long) local23 >> 6);
			local4 <<= 0x8;
			if (local4 <= local36) {
				local36 = local4 + local4 - local36 - 1;
				arg0.aClass2_Sub5_Sub2_1.method2340();
			}
		} else {
			local36 = (int) ((long) this.anIntArray413[arg0.anInt949] * (long) local4 >> 6);
		}
		arg0.aClass2_Sub5_Sub2_1.method2316(local36);
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(III)V")
	private void method2680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)V")
	private void method2681(@OriginalArg(0) int arg0) {
		if ((this.anIntArray410[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub7 local23 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method384(); local23 != null; local23 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method381()) {
			if (local23.anInt949 == arg0 && this.aClass2_Sub7ArrayArray2[arg0][local23.anInt955] == null && local23.anInt960 < 0) {
				local23.anInt960 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
	private void method2682() {
		@Pc(8) int local8 = this.anInt3772;
		@Pc(11) int local11 = this.anInt3771;
		@Pc(14) long local14 = this.aLong137;
		while (local11 == this.anInt3771) {
			while (local11 == this.aClass46_1.anIntArray209[local8]) {
				this.aClass46_1.method1342(local8);
				@Pc(25) int local25 = this.aClass46_1.method1331(local8);
				if (local25 == 1) {
					this.aClass46_1.method1338();
					this.aClass46_1.method1341(local8);
					if (this.aClass46_1.method1334()) {
						if (!this.aBoolean166 || local11 == 0) {
							this.method2688();
							this.aClass46_1.method1333();
							return;
						}
						this.aClass46_1.method1336(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method2686(local25);
				}
				this.aClass46_1.method1343(local8);
				this.aClass46_1.method1341(local8);
			}
			local8 = this.aClass46_1.method1340();
			local11 = this.aClass46_1.anIntArray209[local8];
			local14 = this.aClass46_1.method1337(local11);
		}
		this.anInt3771 = local11;
		this.aLong137 = local14;
		this.anInt3772 = local8;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
	private void method2683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2676(arg2, 64, arg0);
		if ((this.anIntArray410[arg0] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub7 local28 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method380(); local28 != null; local28 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method377()) {
				if (local28.anInt949 == arg0 && local28.anInt960 < 0) {
					this.aClass2_Sub7ArrayArray2[arg0][local28.anInt955] = null;
					this.aClass2_Sub7ArrayArray2[arg0][arg2] = local28;
					@Pc(67) int local67 = (local28.anInt948 * local28.anInt950 >> 12) + local28.anInt964;
					local28.anInt948 = 4096;
					local28.anInt964 += arg2 - local28.anInt955 << 8;
					local28.anInt955 = arg2;
					local28.anInt950 = local67 - local28.anInt964;
					return;
				}
			}
		}
		@Pc(113) Class2_Sub3 local113 = (Class2_Sub3) this.aClass18_11.method683((long) this.anIntArray414[arg0]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class2_Sub10_Sub1 local121 = local113.aClass2_Sub10_Sub1Array1[arg2];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class2_Sub7 local128 = new Class2_Sub7();
		local128.aClass2_Sub3_1 = local113;
		local128.aClass2_Sub10_Sub1_1 = local121;
		local128.anInt949 = arg0;
		local128.aClass67_1 = local113.aClass67Array1[arg2];
		local128.anInt962 = local113.aByteArray3[arg2];
		local128.anInt955 = arg2;
		local128.anInt945 = local113.anInt377 * arg1 * arg1 * local113.aByteArray4[arg2] + 1024 >> 11;
		local128.anInt958 = local113.aByteArray5[arg2] & 0xFF;
		local128.anInt964 = (arg2 << 8) - (local113.aShortArray6[arg2] & 0x7FFF);
		local128.anInt952 = 0;
		local128.anInt957 = 0;
		local128.anInt960 = -1;
		local128.anInt956 = 0;
		local128.anInt953 = 0;
		if (this.anIntArray413[arg0] == 0) {
			local128.aClass2_Sub5_Sub2_1 = Static186.method2347(local121, this.method2671(local128), this.method2689(local128), this.method2669(local128));
		} else {
			local128.aClass2_Sub5_Sub2_1 = Static186.method2347(local121, this.method2671(local128), 0, this.method2669(local128));
			this.method2679(local128, local113.aShortArray6[arg2] < 0);
		}
		if (local113.aShortArray6[arg2] < 0) {
			local128.aClass2_Sub5_Sub2_1.method2318(-1);
		}
		if (local128.anInt962 >= 0) {
			@Pc(279) Class2_Sub7 local279 = this.aClass2_Sub7ArrayArray1[arg0][local128.anInt962];
			if (local279 != null && local279.anInt960 < 0) {
				this.aClass2_Sub7ArrayArray2[arg0][local279.anInt955] = null;
				local279.anInt960 = 0;
			}
			this.aClass2_Sub7ArrayArray1[arg0][local128.anInt962] = local128;
		}
		this.aClass2_Sub5_Sub1_1.aClass12_3.method382(local128);
		this.aClass2_Sub7ArrayArray2[arg0][arg2] = local128;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	public synchronized void method2684(@OriginalArg(0) int arg0) {
		this.anInt3744 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(BI)V")
	private void method2685(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub7 local12 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method384(); local12 != null; local12 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method381()) {
			if (arg0 < 0 || local12.anInt949 == arg0) {
				if (local12.aClass2_Sub5_Sub2_1 != null) {
					local12.aClass2_Sub5_Sub2_1.method2345(Static45.anInt1131 / 100);
					if (local12.aClass2_Sub5_Sub2_1.method2329()) {
						this.aClass2_Sub5_Sub1_1.aClass2_Sub5_Sub3_2.method2612(local12.aClass2_Sub5_Sub2_1);
					}
					local12.method782();
				}
				if (local12.anInt960 < 0) {
					this.aClass2_Sub7ArrayArray2[local12.anInt949][local12.anInt955] = null;
				}
				local12.method2705();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	private void method2686(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2676(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method2683(local16, local28, local22);
			} else {
				this.method2676(local22, 64, local16);
			}
		} else if (local9 == 160) {
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2692(local22, local28, local16);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray418[local16] = (this.anIntArray418[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray418[local16] = (this.anIntArray418[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray409[local16] = (this.anIntArray409[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray409[local16] = local28 + (this.anIntArray409[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray417[local16] = (this.anIntArray417[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray417[local16] = local28 + (this.anIntArray417[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray406[local16] = (local28 << 7) + (this.anIntArray406[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray406[local16] = local28 + (this.anIntArray406[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray416[local16] = (this.anIntArray416[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray416[local16] = (this.anIntArray416[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray407[local16] = (this.anIntArray407[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray407[local16] = local28 + (this.anIntArray407[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray410[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray410[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray410[local16] |= 0x2;
				} else {
					this.method2681(local16);
					this.anIntArray410[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray404[local16] = (local28 << 7) + (this.anIntArray404[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray404[local16] = local28 + (this.anIntArray404[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray404[local16] = (this.anIntArray404[local16] & 0x7F) + ((local28 << 7) + 16384);
			}
			if (local22 == 100) {
				this.anIntArray404[local16] = (this.anIntArray404[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method2685(local16);
			}
			if (local22 == 121) {
				this.method2675(local16);
			}
			if (local22 == 123) {
				this.method2673(local16);
			}
			@Pc(506) int local506;
			if (local22 == 6) {
				local506 = this.anIntArray404[local16];
				if (local506 == 16384) {
					this.anIntArray408[local16] = (this.anIntArray408[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local506 = this.anIntArray404[local16];
				if (local506 == 16384) {
					this.anIntArray408[local16] = (this.anIntArray408[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray413[local16] = (this.anIntArray413[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray413[local16] = (this.anIntArray413[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray410[local16] |= 0x4;
				} else {
					this.method2687(local16);
					this.anIntArray410[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method2665((this.anIntArray411[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method2665((this.anIntArray411[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2668(local16, local22 + this.anIntArray418[local16]);
		} else if (local9 == 208) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2680(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0085) >> 9);
			this.method2672(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2688();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(BI)V")
	private void method2687(@OriginalArg(1) int arg0) {
		if ((this.anIntArray410[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub7 local18 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method384(); local18 != null; local18 = (Class2_Sub7) this.aClass2_Sub5_Sub1_1.aClass12_3.method381()) {
			if (arg0 == local18.anInt949) {
				local18.anInt954 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
	private void method2688() {
		this.method2685(-1);
		this.method2675(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray414[local15] = this.anIntArray412[local15];
		}
		for (@Pc(33) int local33 = 0; local33 < 16; local33++) {
			this.anIntArray418[local33] = this.anIntArray412[local33] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!ed;)I")
	private int method2689(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(15) int local15 = this.anIntArray406[arg0.anInt949] * this.anIntArray407[arg0.anInt949] + 4096 >> 13;
		@Pc(29) int local29 = local15 * local15 + 16384 >> 15;
		@Pc(36) Class67 local36 = arg0.aClass67_1;
		@Pc(45) int local45 = arg0.anInt945 * local29 + 16384 >> 15;
		local15 = this.anInt3744 * local45 + 128 >> 8;
		if (local36.anInt2913 > 0) {
			local15 = (int) (Math.pow(0.5D, (double) local36.anInt2913 * 1.953125E-5D * (double) arg0.anInt952) * (double) local15 + 0.5D);
		}
		@Pc(89) int local89;
		@Pc(86) int local86;
		@Pc(123) int local123;
		@Pc(113) int local113;
		if (local36.aByteArray36 != null) {
			local86 = local36.aByteArray36[arg0.anInt953 + 1];
			local89 = arg0.anInt956;
			if (arg0.anInt953 < local36.aByteArray36.length - 2) {
				local113 = (local36.aByteArray36[arg0.anInt953 + 2] & 0xFF) << 8;
				local123 = (local36.aByteArray36[arg0.anInt953] & 0xFF) << 8;
				local86 += (local36.aByteArray36[arg0.anInt953 + 3] - local86) * (local89 - local123) / (local113 - local123);
			}
			local15 = local15 * local86 + 32 >> 6;
		}
		if (arg0.anInt960 > 0 && local36.aByteArray37 != null) {
			local89 = arg0.anInt960;
			local86 = local36.aByteArray37[arg0.anInt957 + 1];
			if (arg0.anInt957 < local36.aByteArray37.length - 2) {
				local123 = (local36.aByteArray37[arg0.anInt957] & 0xFF) << 8;
				local113 = (local36.aByteArray37[arg0.anInt957 + 2] & 0xFF) << 8;
				local86 += (local89 - local123) * (local36.aByteArray37[arg0.anInt957 + 3] - local86) / (local113 - local123);
			}
			local15 = local15 * local86 + 32 >> 6;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[ILclient!ed;)Z")
	public boolean method2690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class2_Sub7 arg3) {
		arg3.anInt947 = Static45.anInt1131 / 100;
		if (arg3.anInt960 >= 0 && (arg3.aClass2_Sub5_Sub2_1 == null || arg3.aClass2_Sub5_Sub2_1.method2346())) {
			arg3.method782();
			arg3.method2705();
			if (arg3.anInt962 > 0 && arg3 == this.aClass2_Sub7ArrayArray1[arg3.anInt949][arg3.anInt962]) {
				this.aClass2_Sub7ArrayArray1[arg3.anInt949][arg3.anInt962] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg3.anInt948;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray417[arg3.anInt949] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg3.anInt948 = local53;
		}
		arg3.aClass2_Sub5_Sub2_1.method2338(this.method2671(arg3));
		arg3.anInt946++;
		@Pc(99) Class67 local99 = arg3.aClass67_1;
		@Pc(110) boolean local110 = false;
		@Pc(128) double local128 = (double) ((arg3.anInt950 * arg3.anInt948 >> 12) + (arg3.anInt955 - 60 << 8)) * 5.086263020833333E-6D;
		arg3.anInt944 += local99.anInt2907;
		if (local99.anInt2913 > 0) {
			if (local99.anInt2914 > 0) {
				arg3.anInt952 += (int) (Math.pow(2.0D, local128 * (double) local99.anInt2914) * 128.0D + 0.5D);
			} else {
				arg3.anInt952 += 128;
			}
			if (arg3.anInt952 * local99.anInt2913 >= 819200) {
				local110 = true;
			}
		}
		if (local99.aByteArray36 != null) {
			if (local99.anInt2912 > 0) {
				arg3.anInt956 += (int) (Math.pow(2.0D, (double) local99.anInt2912 * local128) * 128.0D + 0.5D);
			} else {
				arg3.anInt956 += 128;
			}
			while (arg3.anInt953 < local99.aByteArray36.length - 2 && arg3.anInt956 > (local99.aByteArray36[arg3.anInt953 + 2] & 0xFF) << 8) {
				arg3.anInt953 += 2;
			}
			if (local99.aByteArray36.length - 2 == arg3.anInt953 && local99.aByteArray36[arg3.anInt953 + 1] == 0) {
				local110 = true;
			}
		}
		if (arg3.anInt960 >= 0 && local99.aByteArray37 != null && (this.anIntArray410[arg3.anInt949] & 0x1) == 0 && (arg3.anInt962 < 0 || this.aClass2_Sub7ArrayArray1[arg3.anInt949][arg3.anInt962] != arg3)) {
			if (local99.anInt2909 > 0) {
				arg3.anInt960 += (int) (Math.pow(2.0D, local128 * (double) local99.anInt2909) * 128.0D + 0.5D);
			} else {
				arg3.anInt960 += 128;
			}
			while (arg3.anInt957 < local99.aByteArray37.length - 2 && (local99.aByteArray37[arg3.anInt957 + 2] & 0xFF) << 8 < arg3.anInt960) {
				arg3.anInt957 += 2;
			}
			if (local99.aByteArray37.length - 2 == arg3.anInt957) {
				local110 = true;
			}
		}
		if (!local110) {
			arg3.aClass2_Sub5_Sub2_1.method2335(arg3.anInt947, this.method2689(arg3), this.method2669(arg3));
			return false;
		}
		arg3.aClass2_Sub5_Sub2_1.method2345(arg3.anInt947);
		if (arg2 == null) {
			arg3.aClass2_Sub5_Sub2_1.method2653(arg0);
		} else {
			arg3.aClass2_Sub5_Sub2_1.method2651(arg2, arg1, arg0);
		}
		if (arg3.aClass2_Sub5_Sub2_1.method2329()) {
			this.aClass2_Sub5_Sub1_1.aClass2_Sub5_Sub3_2.method2612(arg3.aClass2_Sub5_Sub2_1);
		}
		arg3.method782();
		if (arg3.anInt960 >= 0) {
			arg3.method2705();
			if (arg3.anInt962 > 0 && arg3 == this.aClass2_Sub7ArrayArray1[arg3.anInt949][arg3.anInt962]) {
				this.aClass2_Sub7ArrayArray1[arg3.anInt949][arg3.anInt962] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	public synchronized void method2691() {
		this.aClass46_1.method1333();
		this.method2688();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)V")
	private void method2692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}
}
