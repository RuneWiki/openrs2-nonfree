import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class2_Sub26_Sub3 extends Class2_Sub26 {

	@OriginalMember(owner = "client!of", name = "Kb", descriptor = "I")
	private int anInt7839;

	@OriginalMember(owner = "client!of", name = "Lb", descriptor = "Z")
	private boolean aBoolean582;

	@OriginalMember(owner = "client!of", name = "Mb", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!of", name = "Ob", descriptor = "I")
	private int anInt7840;

	@OriginalMember(owner = "client!of", name = "Pb", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "client!of", name = "Qb", descriptor = "I")
	private int anInt7841;

	@OriginalMember(owner = "client!of", name = "Rb", descriptor = "Z")
	private boolean aBoolean583;

	@OriginalMember(owner = "client!of", name = "Sb", descriptor = "Lclient!kp;")
	private Class2_Sub39 aClass2_Sub39_2;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "[I")
	private final int[] anIntArray380 = new int[16];

	@OriginalMember(owner = "client!of", name = "V", descriptor = "[I")
	private final int[] anIntArray383 = new int[16];

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "[[Lclient!mn;")
	private final Class2_Sub40[][] aClass2_Sub40ArrayArray1 = new Class2_Sub40[16][128];

	@OriginalMember(owner = "client!of", name = "pb", descriptor = "[I")
	public final int[] anIntArray387 = new int[16];

	@OriginalMember(owner = "client!of", name = "C", descriptor = "[I")
	private final int[] anIntArray382 = new int[16];

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "[I")
	private final int[] anIntArray384 = new int[16];

	@OriginalMember(owner = "client!of", name = "tb", descriptor = "[I")
	private final int[] anIntArray389 = new int[16];

	@OriginalMember(owner = "client!of", name = "ub", descriptor = "[I")
	private final int[] anIntArray390 = new int[16];

	@OriginalMember(owner = "client!of", name = "rb", descriptor = "[I")
	private final int[] anIntArray388 = new int[16];

	@OriginalMember(owner = "client!of", name = "Eb", descriptor = "I")
	private final int anInt7835 = 1000000;

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "[I")
	private final int[] anIntArray385 = new int[16];

	@OriginalMember(owner = "client!of", name = "Cb", descriptor = "[I")
	public final int[] anIntArray392 = new int[16];

	@OriginalMember(owner = "client!of", name = "B", descriptor = "[I")
	private final int[] anIntArray381 = new int[16];

	@OriginalMember(owner = "client!of", name = "Hb", descriptor = "[I")
	private final int[] anIntArray393 = new int[16];

	@OriginalMember(owner = "client!of", name = "xb", descriptor = "[I")
	private final int[] anIntArray391 = new int[16];

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "[[Lclient!mn;")
	private final Class2_Sub40[][] aClass2_Sub40ArrayArray2 = new Class2_Sub40[16][128];

	@OriginalMember(owner = "client!of", name = "Jb", descriptor = "[I")
	private final int[] anIntArray394 = new int[16];

	@OriginalMember(owner = "client!of", name = "Bb", descriptor = "I")
	private int anInt7833 = 256;

	@OriginalMember(owner = "client!of", name = "mb", descriptor = "[I")
	private final int[] anIntArray386 = new int[16];

	@OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
	public final int[] anIntArray379 = new int[16];

	@OriginalMember(owner = "client!of", name = "db", descriptor = "Lclient!lq;")
	private final Class222 aClass222_1 = new Class222();

	@OriginalMember(owner = "client!of", name = "Nb", descriptor = "Lclient!er;")
	private final Class2_Sub26_Sub1 aClass2_Sub26_Sub1_1 = new Class2_Sub26_Sub1(this);

	@OriginalMember(owner = "client!of", name = "P", descriptor = "Lclient!si;")
	private final Class335 aClass335_28;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class2_Sub26_Sub3() {
		this.aClass335_28 = new Class335(128);
		this.method6983(256, -1);
		this.method7009(true);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!of;)V")
	public Class2_Sub26_Sub3(@OriginalArg(0) Class2_Sub26_Sub3 arg0) {
		this.aClass335_28 = arg0.aClass335_28;
		this.method6983(256, -1);
		this.method7009(true);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public synchronized void method6973() {
		for (@Pc(13) Class2_Sub36 local13 = (Class2_Sub36) this.aClass335_28.method8358(); local13 != null; local13 = (Class2_Sub36) this.aClass335_28.method8355()) {
			local13.method5129();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
	private void method6974(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class2_Sub40 local18 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7177(); local18 != null; local18 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7175()) {
			if ((arg0 < 0 || local18.anInt7186 == arg0) && local18.anInt7179 < 0) {
				this.aClass2_Sub40ArrayArray1[local18.anInt7186][local18.anInt7189] = null;
				local18.anInt7179 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
	private void method6975(@OriginalArg(1) int arg0) {
		if ((this.anIntArray387[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class2_Sub40 local25 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7177(); local25 != null; local25 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7175()) {
			if (arg0 == local25.anInt7186) {
				local25.anInt7184 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)I")
	public int method6976() {
		return this.anInt7833;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)V")
	public synchronized void method6977() {
		this.method6982();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	private void method6978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)V")
	public synchronized void method6979(@OriginalArg(0) int arg0) {
		this.anInt7833 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V")
	private void method6980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(BII)V")
	private void method6981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray380[arg1] != arg0) {
			this.anIntArray380[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass2_Sub40ArrayArray2[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(III)V")
	private void method6982() {
		this.anIntArray391[9] = 128;
		this.anIntArray389[9] = 128;
		this.method6981(128, 9);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9759(@OriginalArg(0) int arg0) {
		if (this.aClass222_1.method6085()) {
			@Pc(14) int local14 = this.aClass222_1.anInt6792 * this.anInt7835 / Static237.anInt4718;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong217;
				if (this.aLong216 - local23 >= 0L) {
					this.aLong217 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong216 - this.aLong217 - 1L) / (long) local14);
				this.aLong217 += (long) local54 * (long) local14;
				this.aClass2_Sub26_Sub1_1.method9759(local54);
				arg0 -= local54;
				this.method7001();
			} while (this.aClass222_1.method6085());
		}
		this.aClass2_Sub26_Sub1_1.method9759(arg0);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V")
	public synchronized void method6983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray382[arg1] = arg0;
		} else {
			for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
				this.anIntArray382[local21] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!mn;ZB)V")
	public void method6984(@OriginalArg(0) Class2_Sub40 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub44_Sub1_4.aByteArray92.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass2_Sub44_Sub1_4.aBoolean748) {
			@Pc(39) int local39 = local8 + local8 - arg0.aClass2_Sub44_Sub1_4.anInt10349;
			local27 = (int) ((long) local39 * (long) this.anIntArray379[arg0.anInt7186] >> 6);
			local8 <<= 0x8;
			if (local8 <= local27) {
				arg0.aClass2_Sub26_Sub5_4.method9764();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) this.anIntArray379[arg0.anInt7186] * (long) local8 >> 6);
		}
		arg0.aClass2_Sub26_Sub5_4.method9783(local27);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!kp;Z)V")
	public synchronized void method6985(@OriginalArg(1) Class2_Sub39 arg0, @OriginalArg(2) boolean arg1) {
		this.method7004(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()I")
	@Override
	public synchronized int method9756() {
		return 0;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(II)V")
	private void method6986(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub40 local12 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7177(); local12 != null; local12 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7175()) {
			if (arg0 < 0 || arg0 == local12.anInt7186) {
				if (local12.aClass2_Sub26_Sub5_4 != null) {
					local12.aClass2_Sub26_Sub5_4.method9765(Static237.anInt4718 / 100);
					if (local12.aClass2_Sub26_Sub5_4.method9786()) {
						this.aClass2_Sub26_Sub1_1.aClass2_Sub26_Sub4_1.method7391(local12.aClass2_Sub26_Sub5_4);
					}
					local12.method6418();
				}
				if (local12.anInt7179 < 0) {
					this.aClass2_Sub40ArrayArray1[local12.anInt7186][local12.anInt7189] = null;
				}
				local12.method9825();
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIB)V")
	private void method6987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray388[arg0] = arg1;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "()Lclient!fja;")
	@Override
	public synchronized Class2_Sub26 method9758() {
		return null;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(II)V")
	private void method6988(@OriginalArg(0) int arg0) {
		if ((this.anIntArray387[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(16) Class2_Sub40 local16 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7177(); local16 != null; local16 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7175()) {
			if (arg0 == local16.anInt7186 && this.aClass2_Sub40ArrayArray1[arg0][local16.anInt7189] == null && local16.anInt7179 < 0) {
				local16.anInt7179 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IIII)V")
	private void method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method6992(arg2, 64, arg1);
		if ((this.anIntArray387[arg1] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub40 local25 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7170(); local25 != null; local25 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7179()) {
				if (local25.anInt7186 == arg1 && local25.anInt7179 < 0) {
					this.aClass2_Sub40ArrayArray1[arg1][local25.anInt7189] = null;
					this.aClass2_Sub40ArrayArray1[arg1][arg2] = local25;
					@Pc(61) int local61 = local25.anInt7178 + (local25.anInt7173 * local25.anInt7172 >> 12);
					local25.anInt7178 += arg2 - local25.anInt7189 << 8;
					local25.anInt7172 = 4096;
					local25.anInt7189 = arg2;
					local25.anInt7173 = local61 - local25.anInt7178;
					return;
				}
			}
		}
		@Pc(107) Class2_Sub36 local107 = (Class2_Sub36) this.aClass335_28.method8357((long) this.anIntArray380[arg1]);
		if (local107 == null) {
			return;
		}
		@Pc(115) Class2_Sub44_Sub1 local115 = local107.aClass2_Sub44_Sub1Array1[arg2];
		if (local115 == null) {
			return;
		}
		@Pc(122) Class2_Sub40 local122 = new Class2_Sub40();
		local122.aClass2_Sub44_Sub1_4 = local115;
		local122.aClass2_Sub36_1 = local107;
		local122.anInt7186 = arg1;
		local122.aClass8_1 = local107.aClass8Array1[arg2];
		local122.anInt7174 = local107.aByteArray46[arg2];
		local122.anInt7189 = arg2;
		local122.anInt7183 = local107.aByteArray47[arg2] * arg0 * arg0 * local107.anInt5663 + 1024 >> 11;
		local122.anInt7176 = local107.aByteArray48[arg2] & 0xFF;
		local122.anInt7178 = (arg2 << 8) - (local107.aShortArray87[arg2] & 0x7FFF);
		local122.anInt7182 = 0;
		local122.anInt7179 = -1;
		local122.anInt7177 = 0;
		local122.anInt7185 = 0;
		local122.anInt7171 = 0;
		if (this.anIntArray379[arg1] == 0) {
			local122.aClass2_Sub26_Sub5_4 = Static686.method9797(local115, this.method6995(local122), this.method6997(local122), this.method6990(local122));
		} else {
			local122.aClass2_Sub26_Sub5_4 = Static686.method9797(local115, this.method6995(local122), 0, this.method6990(local122));
			this.method6984(local122, local107.aShortArray87[arg2] < 0);
		}
		if (local107.aShortArray87[arg2] < 0) {
			local122.aClass2_Sub26_Sub5_4.method9763(-1);
		}
		if (local122.anInt7174 >= 0) {
			@Pc(280) Class2_Sub40 local280 = this.aClass2_Sub40ArrayArray2[arg1][local122.anInt7174];
			if (local280 != null && local280.anInt7179 < 0) {
				this.aClass2_Sub40ArrayArray1[arg1][local280.anInt7189] = null;
				local280.anInt7179 = 0;
			}
			this.aClass2_Sub40ArrayArray2[arg1][local122.anInt7174] = local122;
		}
		this.aClass2_Sub26_Sub1_1.aClass271_10.method7174(local122);
		this.aClass2_Sub40ArrayArray1[arg1][arg2] = local122;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!mn;B)I")
	private int method6990(@OriginalArg(0) Class2_Sub40 arg0) {
		@Pc(9) int local9 = this.anIntArray383[arg0.anInt7186];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt7176) * (-local9 + 16384) + 32 >> 6) : arg0.anInt7176 * local9 + 32 >> 6;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9760(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass222_1.method6085()) {
			@Pc(18) int local18 = this.aClass222_1.anInt6792 * this.anInt7835 / Static237.anInt4718;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong217;
				if (this.aLong216 - local27 >= 0L) {
					this.aLong217 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong216 - this.aLong217 - 1L) / (long) local18);
				this.aLong217 += (long) local18 * (long) local58;
				this.aClass2_Sub26_Sub1_1.method9760(arg0, arg1, local58);
				this.method7001();
				arg1 += local58;
				arg2 -= local58;
			} while (this.aClass222_1.method6085());
		}
		this.aClass2_Sub26_Sub1_1.method9760(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	private void method6991(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6992(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method6992(local22, 64, local16);
			} else {
				this.method6989(local28, local16, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6980(local16, local22, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray389[local16] = (this.anIntArray389[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray389[local16] = (local28 << 7) + (this.anIntArray389[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray384[local16] = (this.anIntArray384[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray384[local16] = local28 + (this.anIntArray384[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray394[local16] = (local28 << 7) + (this.anIntArray394[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray394[local16] = local28 + (this.anIntArray394[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray386[local16] = (this.anIntArray386[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray386[local16] = (this.anIntArray386[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray383[local16] = (local28 << 7) + (this.anIntArray383[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray383[local16] = local28 + (this.anIntArray383[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray385[local16] = (local28 << 7) + (this.anIntArray385[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray385[local16] = (this.anIntArray385[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray387[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray387[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray387[local16] |= 0x2;
				} else {
					this.method6988(local16);
					this.anIntArray387[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray390[local16] = (local28 << 7) + (this.anIntArray390[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray390[local16] = (this.anIntArray390[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray390[local16] = (local28 << 7) + (this.anIntArray390[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray390[local16] = (this.anIntArray390[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method6986(local16);
			}
			if (local22 == 121) {
				this.method6999(local16);
			}
			if (local22 == 123) {
				this.method6974(local16);
			}
			@Pc(490) int local490;
			if (local22 == 6) {
				local490 = this.anIntArray390[local16];
				if (local490 == 16384) {
					this.anIntArray381[local16] = (this.anIntArray381[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local490 = this.anIntArray390[local16];
				if (local490 == 16384) {
					this.anIntArray381[local16] = local28 + (this.anIntArray381[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray379[local16] = (this.anIntArray379[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray379[local16] = local28 + (this.anIntArray379[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method6975(local16);
					this.anIntArray387[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray387[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method7005((this.anIntArray393[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method7005(local28 + (this.anIntArray393[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6981(local22 + this.anIntArray389[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6978(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method6987(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method7009(true);
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBI)V")
	private void method6992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub40 local12 = this.aClass2_Sub40ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub40ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray387[arg2] & 0x2) == 0) {
			local12.anInt7179 = 0;
			return;
		}
		for (@Pc(45) Class2_Sub40 local45 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7177(); local45 != null; local45 = (Class2_Sub40) this.aClass2_Sub26_Sub1_1.aClass271_10.method7175()) {
			if (local12.anInt7186 == local45.anInt7186 && local45.anInt7179 < 0 && local12 != local45) {
				local12.anInt7179 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZJLclient!kp;ZB)V")
	public synchronized void method6993(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub39 arg1, @OriginalArg(3) boolean arg2) {
		this.method7004(arg1, arg2, true);
		this.method6998(arg0 * (long) this.aClass222_1.anInt6792);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!mn;)I")
	private int method6995(@OriginalArg(1) Class2_Sub40 arg0) {
		@Pc(20) int local20 = (arg0.anInt7173 * arg0.anInt7172 >> 12) + arg0.anInt7178;
		local20 += (this.anIntArray388[arg0.anInt7186] - 8192) * this.anIntArray381[arg0.anInt7186] >> 12;
		@Pc(41) Class8 local41 = arg0.aClass8_1;
		@Pc(67) int local67;
		if (local41.anInt138 > 0 && (local41.anInt142 > 0 || this.anIntArray384[arg0.anInt7186] > 0)) {
			local67 = local41.anInt142 << 2;
			@Pc(72) int local72 = local41.anInt143 << 1;
			if (arg0.anInt7188 < local72) {
				local67 = arg0.anInt7188 * local67 / local72;
			}
			local67 += this.anIntArray384[arg0.anInt7186] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt7180 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) ((double) local67 * local102);
		}
		local67 = (int) ((double) (arg0.aClass2_Sub44_Sub1_4.anInt10350 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static237.anInt4718 + 0.5D);
		return local67 < 1 ? 1 : local67;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ria;ILclient!kp;Lclient!gga;I)Z")
	public synchronized boolean method6996(@OriginalArg(0) Class316 arg0, @OriginalArg(2) Class2_Sub39 arg1, @OriginalArg(3) Class124 arg2) {
		arg1.method5347();
		@Pc(14) boolean local14 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(31) Class2_Sub16 local31 = (Class2_Sub16) arg1.aClass335_16.method8358(); local31 != null; local31 = (Class2_Sub16) arg1.aClass335_16.method8355()) {
			@Pc(37) int local37 = (int) local31.aLong313;
			@Pc(45) Class2_Sub36 local45 = (Class2_Sub36) this.aClass335_28.method8357((long) local37);
			if (local45 == null) {
				local45 = Static160.method9143(arg2, local37);
				if (local45 == null) {
					local14 = false;
					continue;
				}
				this.aClass335_28.method8356(local45, (long) local37);
			}
			if (!local45.method5128(local25, local31.aByteArray18, arg0)) {
				local14 = false;
			}
		}
		if (local14) {
			arg1.method5346();
		}
		return local14;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()Lclient!fja;")
	@Override
	public synchronized Class2_Sub26 method9761() {
		return this.aClass2_Sub26_Sub1_1;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Lclient!mn;B)I")
	private int method6997(@OriginalArg(0) Class2_Sub40 arg0) {
		if (this.anIntArray382[arg0.anInt7186] == 0) {
			return 0;
		}
		@Pc(14) Class8 local14 = arg0.aClass8_1;
		@Pc(30) int local30 = this.anIntArray386[arg0.anInt7186] * this.anIntArray385[arg0.anInt7186] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt7183 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt7833 * local47 + 128 >> 8;
		local30 = local56 * this.anIntArray382[arg0.anInt7186] + 128 >> 8;
		if (local14.anInt140 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) arg0.anInt7185 * 1.953125E-5D * (double) local14.anInt140) + 0.5D);
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(125) int local125;
		@Pc(137) int local137;
		if (local14.aByteArray2 != null) {
			local95 = arg0.anInt7177;
			local103 = local14.aByteArray2[arg0.anInt7182 + 1];
			if (arg0.anInt7182 < local14.aByteArray2.length - 2) {
				local125 = (local14.aByteArray2[arg0.anInt7182] & 0xFF) << 8;
				local137 = (local14.aByteArray2[arg0.anInt7182 + 2] & 0xFF) << 8;
				local103 += (local14.aByteArray2[arg0.anInt7182 + 3] - local103) * (local95 - local125) / (local137 - local125);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		if (arg0.anInt7179 > 0 && local14.aByteArray3 != null) {
			local95 = arg0.anInt7179;
			local103 = local14.aByteArray3[arg0.anInt7171 + 1];
			if (arg0.anInt7171 < local14.aByteArray3.length - 2) {
				local125 = (local14.aByteArray3[arg0.anInt7171] & 0xFF) << 8;
				local137 = (local14.aByteArray3[arg0.anInt7171 + 2] & 0xFF) << 8;
				local103 += (local14.aByteArray3[arg0.anInt7171 + 3] - local103) * (local95 - local125) / (local137 - local125);
			}
			local30 = local30 * local103 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)V")
	private void method6998(@OriginalArg(1) long arg0) {
		while (this.aLong216 <= arg0) {
			@Pc(18) int local18 = this.anInt7840;
			@Pc(21) int local21 = this.anInt7839;
			@Pc(24) long local24 = this.aLong216;
			while (local21 == this.anInt7839) {
				while (local21 == this.aClass222_1.anIntArray325[local18]) {
					this.aClass222_1.method6075(local18);
					@Pc(35) int local35 = this.aClass222_1.method6074(local18);
					if (local35 == 1) {
						this.aClass222_1.method6077();
						this.aClass222_1.method6079(local18);
						if (this.aClass222_1.method6083()) {
							if (!this.aBoolean582 || local21 == 0) {
								this.method7009(true);
								this.aClass222_1.method6071();
								return;
							}
							this.aClass222_1.method6080(local24);
						}
						break;
					}
					if ((local35 & 0x80) != 0 && (local35 & 0xF0) != 144) {
						this.method6991(local35);
					}
					this.aClass222_1.method6084(local18);
					this.aClass222_1.method6079(local18);
				}
				this.aLong217 = local24;
				local18 = this.aClass222_1.method6082();
				local21 = this.aClass222_1.anIntArray325[local18];
				local24 = this.aClass222_1.method6070(local21);
			}
			this.anInt7839 = local21;
			this.anInt7840 = local18;
			this.aLong216 = local24;
		}
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(II)V")
	private void method6999(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method6999(local12);
			}
			return;
		}
		this.anIntArray386[arg0] = 12800;
		this.anIntArray383[arg0] = 8192;
		this.anIntArray385[arg0] = 16383;
		this.anIntArray388[arg0] = 8192;
		this.anIntArray384[arg0] = 0;
		this.anIntArray394[arg0] = 8192;
		this.method6988(arg0);
		this.method6975(arg0);
		this.anIntArray387[arg0] = 0;
		this.anIntArray390[arg0] = 32767;
		this.anIntArray381[arg0] = 256;
		this.anIntArray379[arg0] = 0;
		this.method7005(8192, arg0);
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
	public synchronized void method7000() {
		for (@Pc(19) Class2_Sub36 local19 = (Class2_Sub36) this.aClass335_28.method8358(); local19 != null; local19 = (Class2_Sub36) this.aClass335_28.method8355()) {
			local19.method9825();
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	private void method7001() {
		@Pc(8) int local8 = this.anInt7840;
		@Pc(11) int local11 = this.anInt7839;
		@Pc(22) long local22 = this.aLong216;
		if (this.aClass2_Sub39_2 != null && this.anInt7841 == local11) {
			this.method7004(this.aClass2_Sub39_2, this.aBoolean582, this.aBoolean583);
			this.method7001();
			return;
		}
		while (local11 == this.anInt7839) {
			while (local11 == this.aClass222_1.anIntArray325[local8]) {
				this.aClass222_1.method6075(local8);
				@Pc(55) int local55 = this.aClass222_1.method6074(local8);
				if (local55 == 1) {
					this.aClass222_1.method6077();
					this.aClass222_1.method6079(local8);
					if (this.aClass222_1.method6083()) {
						if (this.aClass2_Sub39_2 != null) {
							this.method6985(this.aClass2_Sub39_2, this.aBoolean582);
							this.method7001();
							return;
						}
						if (!this.aBoolean582 || local11 == 0) {
							this.method7009(true);
							this.aClass222_1.method6071();
							return;
						}
						this.aClass222_1.method6080(local22);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method6991(local55);
				}
				this.aClass222_1.method6084(local8);
				this.aClass222_1.method6079(local8);
			}
			local8 = this.aClass222_1.method6082();
			local11 = this.aClass222_1.anIntArray325[local8];
			local22 = this.aClass222_1.method6070(local11);
		}
		this.anInt7840 = local8;
		this.aLong216 = local22;
		this.anInt7839 = local11;
		if (this.aClass2_Sub39_2 != null && local11 > this.anInt7841) {
			this.anInt7840 = -1;
			this.anInt7839 = this.anInt7841;
			this.aLong216 = this.aClass222_1.method6070(this.anInt7839);
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(Lclient!mn;B)Z")
	public boolean method7002(@OriginalArg(0) Class2_Sub40 arg0) {
		if (arg0.aClass2_Sub26_Sub5_4 != null) {
			return false;
		}
		if (arg0.anInt7179 >= 0) {
			arg0.method9825();
			if (arg0.anInt7174 > 0 && arg0 == this.aClass2_Sub40ArrayArray2[arg0.anInt7186][arg0.anInt7174]) {
				this.aClass2_Sub40ArrayArray2[arg0.anInt7186][arg0.anInt7174] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!of", name = "h", descriptor = "(I)Z")
	public synchronized boolean method7003() {
		return this.aClass222_1.method6085();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!kp;IZZ)V")
	private synchronized void method7004(@OriginalArg(0) Class2_Sub39 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method7006(arg2);
		this.aClass222_1.method6081(arg0.aByteArray49);
		this.aBoolean582 = arg1;
		this.aLong217 = 0L;
		@Pc(24) int local24 = this.aClass222_1.method6076();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass222_1.method6075(local26);
			this.aClass222_1.method6084(local26);
			this.aClass222_1.method6079(local26);
		}
		this.anInt7840 = this.aClass222_1.method6082();
		this.anInt7839 = this.aClass222_1.anIntArray325[this.anInt7840];
		this.aLong216 = this.aClass222_1.method6070(this.anInt7839);
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(III)V")
	private void method7005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray393[arg1] = arg0;
		this.anIntArray392[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
	private synchronized void method7006(@OriginalArg(0) boolean arg0) {
		this.aClass222_1.method6071();
		this.aClass2_Sub39_2 = null;
		this.method7009(arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZB)V")
	private void method7009(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6986(-1);
		} else {
			this.method6974(-1);
		}
		this.method6999(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray380[local29] = this.anIntArray391[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray389[local45] = this.anIntArray391[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!of", name = "i", descriptor = "(I)V")
	public synchronized void method7010() {
		this.method7006(true);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!mn;I[II)Z")
	public boolean method7011(@OriginalArg(1) Class2_Sub40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt7181 = Static237.anInt4718 / 100;
		if (arg0.anInt7179 >= 0 && (arg0.aClass2_Sub26_Sub5_4 == null || arg0.aClass2_Sub26_Sub5_4.method9799())) {
			arg0.method6418();
			arg0.method9825();
			if (arg0.anInt7174 > 0 && arg0 == this.aClass2_Sub40ArrayArray2[arg0.anInt7186][arg0.anInt7174]) {
				this.aClass2_Sub40ArrayArray2[arg0.anInt7186][arg0.anInt7174] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg0.anInt7172;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray394[arg0.anInt7186] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg0.anInt7172 = local59;
		}
		arg0.aClass2_Sub26_Sub5_4.method9791(this.method6995(arg0));
		@Pc(96) Class8 local96 = arg0.aClass8_1;
		@Pc(98) boolean local98 = false;
		arg0.anInt7180 += local96.anInt138;
		arg0.anInt7188++;
		@Pc(130) double local130 = (double) ((arg0.anInt7189 - 60 << 8) + (arg0.anInt7173 * arg0.anInt7172 >> 12)) * 5.086263020833333E-6D;
		if (local96.anInt140 > 0) {
			if (local96.anInt141 > 0) {
				arg0.anInt7185 += (int) (Math.pow(2.0D, local130 * (double) local96.anInt141) * 128.0D + 0.5D);
			} else {
				arg0.anInt7185 += 128;
			}
			if (arg0.anInt7185 * local96.anInt140 >= 819200) {
				local98 = true;
			}
		}
		if (local96.aByteArray2 != null) {
			if (local96.anInt137 <= 0) {
				arg0.anInt7177 += 128;
			} else {
				arg0.anInt7177 += (int) (Math.pow(2.0D, (double) local96.anInt137 * local130) * 128.0D + 0.5D);
			}
			while (local96.aByteArray2.length - 2 > arg0.anInt7182 && arg0.anInt7177 > (local96.aByteArray2[arg0.anInt7182 + 2] & 0xFF) << 8) {
				arg0.anInt7182 += 2;
			}
			if (local96.aByteArray2.length - 2 == arg0.anInt7182 && local96.aByteArray2[arg0.anInt7182 + 1] == 0) {
				local98 = true;
			}
		}
		if (arg0.anInt7179 >= 0 && local96.aByteArray3 != null && (this.anIntArray387[arg0.anInt7186] & 0x1) == 0 && (arg0.anInt7174 < 0 || this.aClass2_Sub40ArrayArray2[arg0.anInt7186][arg0.anInt7174] != arg0)) {
			if (local96.anInt139 <= 0) {
				arg0.anInt7179 += 128;
			} else {
				arg0.anInt7179 += (int) (Math.pow(2.0D, (double) local96.anInt139 * local130) * 128.0D + 0.5D);
			}
			while (local96.aByteArray3.length - 2 > arg0.anInt7171 && (local96.aByteArray3[arg0.anInt7171 + 2] & 0xFF) << 8 < arg0.anInt7179) {
				arg0.anInt7171 += 2;
			}
			if (local96.aByteArray3.length - 2 == arg0.anInt7171) {
				local98 = true;
			}
		}
		if (!local98) {
			arg0.aClass2_Sub26_Sub5_4.method9798(arg0.anInt7181, this.method6997(arg0), this.method6990(arg0));
			return false;
		}
		arg0.aClass2_Sub26_Sub5_4.method9765(arg0.anInt7181);
		if (arg2 == null) {
			arg0.aClass2_Sub26_Sub5_4.method9759(arg1);
		} else {
			arg0.aClass2_Sub26_Sub5_4.method9760(arg2, arg3, arg1);
		}
		if (arg0.aClass2_Sub26_Sub5_4.method9786()) {
			this.aClass2_Sub26_Sub1_1.aClass2_Sub26_Sub4_1.method7391(arg0.aClass2_Sub26_Sub5_4);
		}
		arg0.method6418();
		if (arg0.anInt7179 >= 0) {
			arg0.method9825();
			if (arg0.anInt7174 > 0 && arg0 == this.aClass2_Sub40ArrayArray2[arg0.anInt7186][arg0.anInt7174]) {
				this.aClass2_Sub40ArrayArray2[arg0.anInt7186][arg0.anInt7174] = null;
			}
		}
		return true;
	}
}
