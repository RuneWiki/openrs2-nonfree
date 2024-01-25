import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class14_Sub19_Sub4 extends Class14_Sub19 {

	@OriginalMember(owner = "client!uj", name = "Eb", descriptor = "I")
	private int anInt6205;

	@OriginalMember(owner = "client!uj", name = "Fb", descriptor = "Z")
	private boolean aBoolean425;

	@OriginalMember(owner = "client!uj", name = "Hb", descriptor = "J")
	private long aLong195;

	@OriginalMember(owner = "client!uj", name = "Ib", descriptor = "I")
	private int anInt6206;

	@OriginalMember(owner = "client!uj", name = "Jb", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!uj", name = "Kb", descriptor = "Z")
	private boolean aBoolean426;

	@OriginalMember(owner = "client!uj", name = "Lb", descriptor = "Lclient!ld;")
	private Class14_Sub21 aClass14_Sub21_4;

	@OriginalMember(owner = "client!uj", name = "Mb", descriptor = "I")
	private int anInt6207;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "[I")
	public final int[] anIntArray550 = new int[16];

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
	public final int[] anIntArray551 = new int[16];

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "[I")
	private final int[] anIntArray552 = new int[16];

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
	private final int[] anIntArray555 = new int[16];

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "[I")
	private final int[] anIntArray553 = new int[16];

	@OriginalMember(owner = "client!uj", name = "W", descriptor = "[I")
	public final int[] anIntArray558 = new int[16];

	@OriginalMember(owner = "client!uj", name = "fb", descriptor = "[I")
	private final int[] anIntArray560 = new int[16];

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "[I")
	private final int[] anIntArray556 = new int[16];

	@OriginalMember(owner = "client!uj", name = "ab", descriptor = "[I")
	private final int[] anIntArray559 = new int[16];

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "[[Lclient!v;")
	private final Class14_Sub35[][] aClass14_Sub35ArrayArray1 = new Class14_Sub35[16][128];

	@OriginalMember(owner = "client!uj", name = "O", descriptor = "[I")
	private final int[] anIntArray557 = new int[16];

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
	private final int anInt6169 = 1000000;

	@OriginalMember(owner = "client!uj", name = "ub", descriptor = "[I")
	private final int[] anIntArray563 = new int[16];

	@OriginalMember(owner = "client!uj", name = "sb", descriptor = "[I")
	private final int[] anIntArray562 = new int[16];

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[I")
	private final int[] anIntArray554 = new int[16];

	@OriginalMember(owner = "client!uj", name = "ib", descriptor = "I")
	private int anInt6191 = 256;

	@OriginalMember(owner = "client!uj", name = "yb", descriptor = "[I")
	private final int[] anIntArray565 = new int[16];

	@OriginalMember(owner = "client!uj", name = "pb", descriptor = "[I")
	private final int[] anIntArray561 = new int[16];

	@OriginalMember(owner = "client!uj", name = "vb", descriptor = "[[Lclient!v;")
	private final Class14_Sub35[][] aClass14_Sub35ArrayArray2 = new Class14_Sub35[16][128];

	@OriginalMember(owner = "client!uj", name = "xb", descriptor = "[I")
	private final int[] anIntArray564 = new int[16];

	@OriginalMember(owner = "client!uj", name = "hb", descriptor = "Lclient!sc;")
	private final Class183 aClass183_1 = new Class183();

	@OriginalMember(owner = "client!uj", name = "Gb", descriptor = "Lclient!ja;")
	private final Class14_Sub19_Sub1 aClass14_Sub19_Sub1_1 = new Class14_Sub19_Sub1(this);

	@OriginalMember(owner = "client!uj", name = "S", descriptor = "Lclient!bn;")
	private final Class25 aClass25_34 = new Class25(128);

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class14_Sub19_Sub4() {
		this.method5517();
		this.method5539(true);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!v;)I")
	private int method5511(@OriginalArg(1) Class14_Sub35 arg0) {
		if (this.anIntArray554[arg0.anInt6302] == 0) {
			return 0;
		}
		@Pc(20) Class131 local20 = arg0.aClass131_1;
		@Pc(36) int local36 = this.anIntArray556[arg0.anInt6302] * this.anIntArray565[arg0.anInt6302] + 4096 >> 13;
		@Pc(44) int local44 = local36 * local36 + 16384 >> 15;
		@Pc(53) int local53 = arg0.anInt6296 * local44 + 16384 >> 15;
		@Pc(62) int local62 = this.anInt6191 * local53 + 128 >> 8;
		local36 = local62 * this.anIntArray554[arg0.anInt6302] + 128 >> 8;
		if (local20.anInt3820 > 0) {
			local36 = (int) (Math.pow(0.5D, (double) arg0.anInt6294 * 1.953125E-5D * (double) local20.anInt3820) * (double) local36 + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(127) int local127;
		@Pc(139) int local139;
		if (local20.aByteArray108 != null) {
			local101 = arg0.anInt6299;
			local109 = local20.aByteArray108[arg0.anInt6293 + 1];
			if (local20.aByteArray108.length - 2 > arg0.anInt6293) {
				local127 = (local20.aByteArray108[arg0.anInt6293] & 0xFF) << 8;
				local139 = (local20.aByteArray108[arg0.anInt6293 + 2] & 0xFF) << 8;
				local109 += (local101 - local127) * (local20.aByteArray108[arg0.anInt6293 + 3] + -local109) / (local139 - local127);
			}
			local36 = local109 * local36 + 32 >> 6;
		}
		if (arg0.anInt6291 > 0 && local20.aByteArray109 != null) {
			local101 = arg0.anInt6291;
			local109 = local20.aByteArray109[arg0.anInt6305 + 1];
			if (local20.aByteArray109.length - 2 > arg0.anInt6305) {
				local127 = (local20.aByteArray109[arg0.anInt6305] & 0xFF) << 8;
				local139 = (local20.aByteArray109[arg0.anInt6305 + 2] & 0xFF) << 8;
				local109 += (local101 - local127) * (local20.aByteArray109[arg0.anInt6305 - -3] + -local109) / (local139 - local127);
			}
			local36 = local36 * local109 + 32 >> 6;
		}
		return local36;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
	private void method5512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray560[arg0] = arg1;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V")
	private void method5515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray562[arg0] = arg1;
		this.anIntArray551[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILclient!eq;Lclient!ld;Lclient!mo;)Z")
	public synchronized boolean method5516(@OriginalArg(2) Class55 arg0, @OriginalArg(3) Class14_Sub21 arg1, @OriginalArg(4) Class143 arg2) {
		arg1.method3411();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class14_Sub32 local29 = (Class14_Sub32) arg1.aClass25_18.method697(); local29 != null; local29 = (Class14_Sub32) arg1.aClass25_18.method694()) {
			@Pc(35) int local35 = (int) local29.aLong217;
			@Pc(43) Class14_Sub24 local43 = (Class14_Sub24) this.aClass25_34.method691((long) local35);
			if (local43 == null) {
				local43 = Static45.method1110(local35, arg2);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass25_34.method687((long) local35, local43);
			}
			if (!local43.method4371(arg0, local29.aByteArray179, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method3410();
		}
		return local9;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(III)V")
	private synchronized void method5517() {
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray554[local19] = 256;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	private void method5518(@OriginalArg(0) int arg0) {
		if ((this.anIntArray550[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(28) Class14_Sub35 local28 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method459(); local28 != null; local28 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method453()) {
			if (local28.anInt6302 == arg0) {
				local28.anInt6285 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
	private void method5519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method5524(64, arg2, arg0);
		if ((this.anIntArray550[arg2] & 0x2) != 0) {
			for (@Pc(28) Class14_Sub35 local28 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method463(); local28 != null; local28 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method460()) {
				if (local28.anInt6302 == arg2 && local28.anInt6291 < 0) {
					this.aClass14_Sub35ArrayArray1[arg2][local28.anInt6289] = null;
					this.aClass14_Sub35ArrayArray1[arg2][arg0] = local28;
					@Pc(70) int local70 = (local28.anInt6298 * local28.anInt6286 >> 12) + local28.anInt6284;
					local28.anInt6284 += arg0 - local28.anInt6289 << 8;
					local28.anInt6286 = 4096;
					local28.anInt6289 = arg0;
					local28.anInt6298 = local70 - local28.anInt6284;
					return;
				}
			}
		}
		@Pc(118) Class14_Sub24 local118 = (Class14_Sub24) this.aClass25_34.method691((long) this.anIntArray561[arg2]);
		if (local118 == null) {
			return;
		}
		@Pc(126) Class14_Sub11_Sub1 local126 = local118.aClass14_Sub11_Sub1Array1[arg0];
		if (local126 == null) {
			return;
		}
		@Pc(133) Class14_Sub35 local133 = new Class14_Sub35();
		local133.aClass14_Sub24_1 = local118;
		local133.aClass14_Sub11_Sub1_1 = local126;
		local133.anInt6302 = arg2;
		local133.aClass131_1 = local118.aClass131Array1[arg0];
		local133.anInt6297 = local118.aByteArray146[arg0];
		local133.anInt6289 = arg0;
		local133.anInt6296 = arg1 * arg1 * local118.anInt4855 * local118.aByteArray147[arg0] + 1024 >> 11;
		local133.anInt6290 = local118.aByteArray145[arg0] & 0xFF;
		local133.anInt6284 = (arg0 << 8) - (local118.aShortArray99[arg0] & 0x7FFF);
		local133.anInt6305 = 0;
		local133.anInt6291 = -1;
		local133.anInt6293 = 0;
		local133.anInt6299 = 0;
		local133.anInt6294 = 0;
		if (this.anIntArray558[arg2] == 0) {
			local133.aClass14_Sub19_Sub3_3 = Static365.method4835(local126, this.method5546(local133), this.method5511(local133), this.method5537(local133));
		} else {
			local133.aClass14_Sub19_Sub3_3 = Static365.method4835(local126, this.method5546(local133), 0, this.method5537(local133));
			this.method5529(local133, local118.aShortArray99[arg0] < 0);
		}
		if (local118.aShortArray99[arg0] < 0) {
			local133.aClass14_Sub19_Sub3_3.method4840(-1);
		}
		if (local133.anInt6297 >= 0) {
			@Pc(282) Class14_Sub35 local282 = this.aClass14_Sub35ArrayArray2[arg2][local133.anInt6297];
			if (local282 != null && local282.anInt6291 < 0) {
				this.aClass14_Sub35ArrayArray1[arg2][local282.anInt6289] = null;
				local282.anInt6291 = 0;
			}
			this.aClass14_Sub35ArrayArray2[arg2][local133.anInt6297] = local133;
		}
		this.aClass14_Sub19_Sub1_1.aClass18_13.method451(local133);
		this.aClass14_Sub35ArrayArray1[arg2][arg0] = local133;
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5507(@OriginalArg(0) int arg0) {
		if (this.aClass183_1.method4904()) {
			@Pc(18) int local18 = this.aClass183_1.anInt5463 * this.anInt6169 / Static223.anInt5818;
			do {
				@Pc(27) long local27 = this.aLong196 + (long) local18 * (long) arg0;
				if (this.aLong195 - local27 >= 0L) {
					this.aLong196 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong195 + (long) local18 - this.aLong196 - 1L) / (long) local18);
				this.aLong196 += (long) local18 * (long) local57;
				this.aClass14_Sub19_Sub1_1.method5507(local57);
				arg0 -= local57;
				this.method5522();
			} while (this.aClass183_1.method4904());
		}
		this.aClass14_Sub19_Sub1_1.method5507(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZBLclient!ld;)V")
	public synchronized void method5520(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		this.method5526(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)I")
	public int method5521() {
		return this.anInt6191;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
	private void method5522() {
		@Pc(8) int local8 = this.anInt6205;
		@Pc(19) int local19 = this.anInt6206;
		@Pc(22) long local22 = this.aLong195;
		if (this.aClass14_Sub21_4 != null && this.anInt6207 == local19) {
			this.method5526(this.aBoolean426, this.aBoolean425, this.aClass14_Sub21_4);
			this.method5522();
			return;
		}
		while (this.anInt6206 == local19) {
			while (local19 == this.aClass183_1.anIntArray497[local8]) {
				this.aClass183_1.method4902(local8);
				@Pc(51) int local51 = this.aClass183_1.method4905(local8);
				if (local51 == 1) {
					this.aClass183_1.method4907();
					this.aClass183_1.method4899(local8);
					if (this.aClass183_1.method4913()) {
						if (this.aClass14_Sub21_4 != null) {
							this.method5520(this.aBoolean425, this.aClass14_Sub21_4);
							this.method5522();
							return;
						}
						if (!this.aBoolean425 || local19 == 0) {
							this.method5539(true);
							this.aClass183_1.method4903();
							return;
						}
						this.aClass183_1.method4906(local22);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method5548(local51);
				}
				this.aClass183_1.method4900(local8);
				this.aClass183_1.method4899(local8);
			}
			local8 = this.aClass183_1.method4910();
			local19 = this.aClass183_1.anIntArray497[local8];
			local22 = this.aClass183_1.method4912(local19);
		}
		this.anInt6206 = local19;
		this.aLong195 = local22;
		this.anInt6205 = local8;
		if (this.aClass14_Sub21_4 != null && local19 > this.anInt6207) {
			this.anInt6205 = -1;
			this.anInt6206 = this.anInt6207;
			this.aLong195 = this.aClass183_1.method4912(this.anInt6206);
		}
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(III)V")
	private void method5523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIII)V")
	private void method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class14_Sub35 local12 = this.aClass14_Sub35ArrayArray1[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass14_Sub35ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray550[arg1] & 0x2) == 0) {
			local12.anInt6291 = 0;
			return;
		}
		for (@Pc(43) Class14_Sub35 local43 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method459(); local43 != null; local43 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method453()) {
			if (local43.anInt6302 == local12.anInt6302 && local43.anInt6291 < 0 && local43 != local12) {
				local12.anInt6291 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZZLclient!ld;)V")
	private synchronized void method5526(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class14_Sub21 arg2) {
		this.method5543(arg0);
		this.aClass183_1.method4909(arg2.aByteArray101);
		this.aBoolean425 = arg1;
		this.aLong196 = 0;
		@Pc(27) int local27 = this.aClass183_1.method4908();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			this.aClass183_1.method4902(local29);
			this.aClass183_1.method4900(local29);
			this.aClass183_1.method4899(local29);
		}
		this.anInt6205 = this.aClass183_1.method4910();
		this.anInt6206 = this.aClass183_1.anIntArray497[this.anInt6205];
		this.aLong195 = this.aClass183_1.method4912(this.anInt6206);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!v;B)Z")
	public boolean method5527(@OriginalArg(0) Class14_Sub35 arg0) {
		if (arg0.aClass14_Sub19_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt6291 >= 0) {
			arg0.method5986();
			if (arg0.anInt6297 > 0 && arg0 == this.aClass14_Sub35ArrayArray2[arg0.anInt6302][arg0.anInt6297]) {
				this.aClass14_Sub35ArrayArray2[arg0.anInt6302][arg0.anInt6297] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(Z)V")
	public synchronized void method5528() {
		for (@Pc(7) Class14_Sub24 local7 = (Class14_Sub24) this.aClass25_34.method697(); local7 != null; local7 = (Class14_Sub24) this.aClass25_34.method694()) {
			local7.method5986();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!v;ZI)V")
	public void method5529(@OriginalArg(0) Class14_Sub35 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass14_Sub11_Sub1_1.aByteArray98.length;
		@Pc(44) int local44;
		if (arg1 && arg0.aClass14_Sub11_Sub1_1.aBoolean229) {
			@Pc(27) int local27 = local12 + local12 - arg0.aClass14_Sub11_Sub1_1.anInt3561;
			local12 <<= 0x8;
			local44 = (int) ((long) local27 * (long) this.anIntArray558[arg0.anInt6302] >> 6);
			if (local44 >= local12) {
				local44 = local12 + local12 - local44 - 1;
				arg0.aClass14_Sub19_Sub3_3.method4824();
			}
		} else {
			local44 = (int) ((long) this.anIntArray558[arg0.anInt6302] * (long) local12 >> 6);
		}
		arg0.aClass14_Sub19_Sub3_3.method4841(local44);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
	private void method5530(@OriginalArg(1) int arg0) {
		if ((this.anIntArray550[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(27) Class14_Sub35 local27 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method459(); local27 != null; local27 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method453()) {
			if (local27.anInt6302 == arg0 && this.aClass14_Sub35ArrayArray1[arg0][local27.anInt6289] == null && local27.anInt6291 < 0) {
				local27.anInt6291 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5504(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass183_1.method4904()) {
			@Pc(18) int local18 = this.aClass183_1.anInt5463 * this.anInt6169 / Static223.anInt5818;
			do {
				@Pc(28) long local28 = this.aLong196 + (long) arg2 * (long) local18;
				if (this.aLong195 - local28 >= 0L) {
					this.aLong196 = local28;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong195 + (long) local18 - this.aLong196 - 1L) / (long) local18);
				this.aLong196 += (long) local59 * (long) local18;
				this.aClass14_Sub19_Sub1_1.method5504(arg0, arg1, local59);
				this.method5522();
				arg2 -= local59;
				arg1 += local59;
			} while (this.aClass183_1.method4904());
		}
		this.aClass14_Sub19_Sub1_1.method5504(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "()I")
	@Override
	public synchronized int method5509() {
		return 0;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(III)V")
	private void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray561[arg0] != arg1) {
			this.anIntArray561[arg0] = arg1;
			for (@Pc(28) int local28 = 0; local28 < 128; local28++) {
				this.aClass14_Sub35ArrayArray2[arg0][local28] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(BII)V")
	private void method5533() {
		this.anIntArray559[9] = 128;
		this.anIntArray563[9] = 128;
		this.method5531(9, 128);
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
	public synchronized void method5534() {
		for (@Pc(7) Class14_Sub24 local7 = (Class14_Sub24) this.aClass25_34.method697(); local7 != null; local7 = (Class14_Sub24) this.aClass25_34.method694()) {
			local7.method4372();
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)V")
	public synchronized void method5536(@OriginalArg(1) int arg0) {
		this.anInt6191 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!v;)I")
	private int method5537(@OriginalArg(1) Class14_Sub35 arg0) {
		@Pc(17) int local17 = this.anIntArray564[arg0.anInt6302];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt6290) * (-local17 + 16384) + 32 >> 6) : local17 * arg0.anInt6290 + 32 >> 6;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()Lclient!kp;")
	@Override
	public synchronized Class14_Sub19 method5508() {
		return null;
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(III)V")
	public synchronized void method5538() {
		this.method5533();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZZ)V")
	private void method5539(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method5549(-1);
		} else {
			this.method5547(-1);
		}
		this.method5544(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray561[local29] = this.anIntArray559[local29];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray563[local47] = this.anIntArray559[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(B)Z")
	public synchronized boolean method5540() {
		return this.aClass183_1.method4904();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([ILclient!v;III)Z")
	public boolean method5541(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class14_Sub35 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt6288 = Static223.anInt5818 / 100;
		if (arg1.anInt6291 >= 0 && (arg1.aClass14_Sub19_Sub3_3 == null || arg1.aClass14_Sub19_Sub3_3.method4831())) {
			arg1.method5624();
			arg1.method5986();
			if (arg1.anInt6297 > 0 && arg1 == this.aClass14_Sub35ArrayArray2[arg1.anInt6302][arg1.anInt6297]) {
				this.aClass14_Sub35ArrayArray2[arg1.anInt6302][arg1.anInt6297] = null;
			}
			return true;
		}
		@Pc(65) int local65 = arg1.anInt6286;
		if (local65 > 0) {
			local65 -= (int) (Math.pow(2.0D, (double) this.anIntArray552[arg1.anInt6302] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local65 < 0) {
				local65 = 0;
			}
			arg1.anInt6286 = local65;
		}
		arg1.aClass14_Sub19_Sub3_3.method4830(this.method5546(arg1));
		@Pc(105) Class131 local105 = arg1.aClass131_1;
		@Pc(107) boolean local107 = false;
		arg1.anInt6306++;
		arg1.anInt6287 += local105.anInt3827;
		@Pc(138) double local138 = (double) ((arg1.anInt6286 * arg1.anInt6298 >> 12) + (arg1.anInt6289 - 60 << 8)) * 5.086263020833333E-6D;
		if (local105.anInt3820 > 0) {
			if (local105.anInt3825 <= 0) {
				arg1.anInt6294 += 128;
			} else {
				arg1.anInt6294 += (int) (Math.pow(2.0D, (double) local105.anInt3825 * local138) * 128.0D + 0.5D);
			}
			if (local105.anInt3820 * arg1.anInt6294 >= 819200) {
				local107 = true;
			}
		}
		if (local105.aByteArray108 != null) {
			if (local105.anInt3824 > 0) {
				arg1.anInt6299 += (int) (Math.pow(2.0D, local138 * (double) local105.anInt3824) * 128.0D + 0.5D);
			} else {
				arg1.anInt6299 += 128;
			}
			while (arg1.anInt6293 < local105.aByteArray108.length - 2 && arg1.anInt6299 > (local105.aByteArray108[arg1.anInt6293 + 2] & 0xFF) << 8) {
				arg1.anInt6293 += 2;
			}
			if (arg1.anInt6293 == local105.aByteArray108.length - 2 && local105.aByteArray108[arg1.anInt6293 + 1] == 0) {
				local107 = true;
			}
		}
		if (arg1.anInt6291 >= 0 && local105.aByteArray109 != null && (this.anIntArray550[arg1.anInt6302] & 0x1) == 0 && (arg1.anInt6297 < 0 || arg1 != this.aClass14_Sub35ArrayArray2[arg1.anInt6302][arg1.anInt6297])) {
			if (local105.anInt3819 > 0) {
				arg1.anInt6291 += (int) (Math.pow(2.0D, local138 * (double) local105.anInt3819) * 128.0D + 0.5D);
			} else {
				arg1.anInt6291 += 128;
			}
			while (local105.aByteArray109.length - 2 > arg1.anInt6305 && arg1.anInt6291 > (local105.aByteArray109[arg1.anInt6305 + 2] & 0xFF) << 8) {
				arg1.anInt6305 += 2;
			}
			if (local105.aByteArray109.length - 2 == arg1.anInt6305) {
				local107 = true;
			}
		}
		if (!local107) {
			arg1.aClass14_Sub19_Sub3_3.method4850(arg1.anInt6288, this.method5511(arg1), this.method5537(arg1));
			return false;
		}
		arg1.aClass14_Sub19_Sub3_3.method4828(arg1.anInt6288);
		if (arg0 == null) {
			arg1.aClass14_Sub19_Sub3_3.method5507(arg2);
		} else {
			arg1.aClass14_Sub19_Sub3_3.method5504(arg0, arg3, arg2);
		}
		if (arg1.aClass14_Sub19_Sub3_3.method4845()) {
			this.aClass14_Sub19_Sub1_1.aClass14_Sub19_Sub2_2.method4248(arg1.aClass14_Sub19_Sub3_3);
		}
		arg1.method5624();
		if (arg1.anInt6291 >= 0) {
			arg1.method5986();
			if (arg1.anInt6297 > 0 && arg1 == this.aClass14_Sub35ArrayArray2[arg1.anInt6302][arg1.anInt6297]) {
				this.aClass14_Sub35ArrayArray2[arg1.anInt6302][arg1.anInt6297] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBI)V")
	private void method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)V")
	private synchronized void method5543(@OriginalArg(1) boolean arg0) {
		this.aClass183_1.method4903();
		this.aClass14_Sub21_4 = null;
		this.method5539(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(II)V")
	private void method5544(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method5544(local9);
			}
			return;
		}
		this.anIntArray556[arg0] = 12800;
		this.anIntArray564[arg0] = 8192;
		this.anIntArray565[arg0] = 16383;
		this.anIntArray560[arg0] = 8192;
		this.anIntArray557[arg0] = 0;
		this.anIntArray552[arg0] = 8192;
		this.method5530(arg0);
		this.method5518(arg0);
		this.anIntArray550[arg0] = 0;
		this.anIntArray553[arg0] = 32767;
		this.anIntArray555[arg0] = 256;
		this.anIntArray558[arg0] = 0;
		this.method5515(arg0, 8192);
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
	public synchronized void method5545() {
		this.method5543(true);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()Lclient!kp;")
	@Override
	public synchronized Class14_Sub19 method5506() {
		return this.aClass14_Sub19_Sub1_1;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(ILclient!v;)I")
	private int method5546(@OriginalArg(1) Class14_Sub35 arg0) {
		@Pc(21) int local21 = arg0.anInt6284 + (arg0.anInt6286 * arg0.anInt6298 >> 12);
		local21 += this.anIntArray555[arg0.anInt6302] * (this.anIntArray560[arg0.anInt6302] - 8192) >> 12;
		@Pc(42) Class131 local42 = arg0.aClass131_1;
		@Pc(62) int local62;
		if (local42.anInt3827 > 0 && (local42.anInt3821 > 0 || this.anIntArray557[arg0.anInt6302] > 0)) {
			local62 = local42.anInt3821 << 2;
			@Pc(67) int local67 = local42.anInt3822 << 1;
			if (arg0.anInt6306 < local67) {
				local62 = arg0.anInt6306 * local62 / local67;
			}
			local62 += this.anIntArray557[arg0.anInt6302] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt6287 & 0x1FF) * 0.01227184630308513D);
			local21 += (int) (local97 * (double) local62);
		}
		local62 = (int) ((double) (arg0.aClass14_Sub11_Sub1_1.anInt3560 * 256) * Math.pow(2.0D, (double) local21 * 3.255208333333333E-4D) / (double) Static223.anInt5818 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(II)V")
	private void method5547(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class14_Sub35 local8 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method459(); local8 != null; local8 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method453()) {
			if ((arg0 < 0 || arg0 == local8.anInt6302) && local8.anInt6291 < 0) {
				this.aClass14_Sub35ArrayArray1[local8.anInt6302][local8.anInt6289] = null;
				local8.anInt6291 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(II)V")
	private void method5548(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method5524(local30, local18, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method5524(64, local18, local24);
			} else {
				this.method5519(local24, local30, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method5542(local30, local18, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray563[local18] = (this.anIntArray563[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray563[local18] = (this.anIntArray563[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray557[local18] = (local30 << 7) + (this.anIntArray557[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray557[local18] = (this.anIntArray557[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray552[local18] = (this.anIntArray552[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray552[local18] = local30 + (this.anIntArray552[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray556[local18] = (local30 << 7) + (this.anIntArray556[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray556[local18] = local30 + (this.anIntArray556[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray564[local18] = (local30 << 7) + (this.anIntArray564[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray564[local18] = local30 + (this.anIntArray564[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray565[local18] = (local30 << 7) + (this.anIntArray565[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray565[local18] = local30 + (this.anIntArray565[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray550[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray550[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method5530(local18);
					this.anIntArray550[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray550[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray553[local18] = (local30 << 7) + (this.anIntArray553[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray553[local18] = local30 + (this.anIntArray553[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray553[local18] = (this.anIntArray553[local18] & 0x7F) + ((local30 << 7) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray553[local18] = (this.anIntArray553[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method5549(local18);
			}
			if (local24 == 121) {
				this.method5544(local18);
			}
			if (local24 == 123) {
				this.method5547(local18);
			}
			@Pc(506) int local506;
			if (local24 == 6) {
				local506 = this.anIntArray553[local18];
				if (local506 == 16384) {
					this.anIntArray555[local18] = (this.anIntArray555[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local506 = this.anIntArray553[local18];
				if (local506 == 16384) {
					this.anIntArray555[local18] = (this.anIntArray555[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray558[local18] = (local30 << 7) + (this.anIntArray558[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray558[local18] = local30 + (this.anIntArray558[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method5518(local18);
					this.anIntArray550[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray550[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method5515(local18, (this.anIntArray562[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method5515(local18, (this.anIntArray562[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method5531(local18, this.anIntArray563[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method5523(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FBA) >> 8);
			this.method5512(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method5539(true);
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "(II)V")
	private void method5549(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class14_Sub35 local16 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method459(); local16 != null; local16 = (Class14_Sub35) this.aClass14_Sub19_Sub1_1.aClass18_13.method453()) {
			if (arg0 < 0 || local16.anInt6302 == arg0) {
				if (local16.aClass14_Sub19_Sub3_3 != null) {
					local16.aClass14_Sub19_Sub3_3.method4828(Static223.anInt5818 / 100);
					if (local16.aClass14_Sub19_Sub3_3.method4845()) {
						this.aClass14_Sub19_Sub1_1.aClass14_Sub19_Sub2_2.method4248(local16.aClass14_Sub19_Sub3_3);
					}
					local16.method5624();
				}
				if (local16.anInt6291 < 0) {
					this.aClass14_Sub35ArrayArray1[local16.anInt6302][local16.anInt6289] = null;
				}
				local16.method5986();
			}
		}
	}
}
