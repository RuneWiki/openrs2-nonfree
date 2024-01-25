import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class4_Sub13_Sub3 extends Class4_Sub13 {

	@OriginalMember(owner = "client!nb", name = "yb", descriptor = "I")
	private int anInt6060;

	@OriginalMember(owner = "client!nb", name = "zb", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!nb", name = "Ab", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!nb", name = "Bb", descriptor = "I")
	private int anInt6061;

	@OriginalMember(owner = "client!nb", name = "Cb", descriptor = "Z")
	private boolean aBoolean452;

	@OriginalMember(owner = "client!nb", name = "Db", descriptor = "Lclient!saa;")
	private Class4_Sub43 aClass4_Sub43_2;

	@OriginalMember(owner = "client!nb", name = "Eb", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!nb", name = "Fb", descriptor = "I")
	private int anInt6062;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "[[Lclient!cfa;")
	private final Class4_Sub10[][] aClass4_Sub10ArrayArray1 = new Class4_Sub10[16][128];

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "[I")
	public final int[] anIntArray497 = new int[16];

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "[I")
	public final int[] anIntArray498 = new int[16];

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "[I")
	private final int[] anIntArray492 = new int[16];

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
	private final int[] anIntArray490 = new int[16];

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "[I")
	private final int[] anIntArray494 = new int[16];

	@OriginalMember(owner = "client!nb", name = "mb", descriptor = "[I")
	private final int[] anIntArray503 = new int[16];

	@OriginalMember(owner = "client!nb", name = "X", descriptor = "[I")
	private final int[] anIntArray500 = new int[16];

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
	private final int[] anIntArray491 = new int[16];

	@OriginalMember(owner = "client!nb", name = "gb", descriptor = "[I")
	private final int[] anIntArray502 = new int[16];

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "[I")
	private final int[] anIntArray496 = new int[16];

	@OriginalMember(owner = "client!nb", name = "sb", descriptor = "[I")
	private final int[] anIntArray505 = new int[16];

	@OriginalMember(owner = "client!nb", name = "tb", descriptor = "I")
	private int anInt6056 = 256;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "[I")
	public final int[] anIntArray493 = new int[16];

	@OriginalMember(owner = "client!nb", name = "fb", descriptor = "[I")
	private final int[] anIntArray501 = new int[16];

	@OriginalMember(owner = "client!nb", name = "pb", descriptor = "[I")
	private final int[] anIntArray504 = new int[16];

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	private final int anInt6022 = 1000000;

	@OriginalMember(owner = "client!nb", name = "lb", descriptor = "[[Lclient!cfa;")
	private final Class4_Sub10[][] lb = new Class4_Sub10[16][128];

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "[I")
	private final int[] anIntArray495 = new int[16];

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "[I")
	private final int[] anIntArray499 = new int[16];

	@OriginalMember(owner = "client!nb", name = "eb", descriptor = "Lclient!of;")
	private final Class250 aClass250_1 = new Class250();

	@OriginalMember(owner = "client!nb", name = "xb", descriptor = "Lclient!qm;")
	private final Class4_Sub13_Sub4 aClass4_Sub13_Sub4_1 = new Class4_Sub13_Sub4(this);

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "Lclient!jw;")
	private final Class183 aClass183_24 = new Class183(128);

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class4_Sub13_Sub3() {
		this.method5114();
		this.method5116(true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I")
	public int method5113() {
		return this.anInt6056;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZI)V")
	private synchronized void method5114() {
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			this.anIntArray496[local13] = 256;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!cfa;Z)I")
	private int method5115(@OriginalArg(0) Class4_Sub10 arg0) {
		@Pc(15) int local15 = this.anIntArray491[arg0.anInt1188];
		return local15 >= 8192 ? 16384 - ((16384 - local15) * (128 - arg0.anInt1193) + 32 >> 6) : local15 * arg0.anInt1193 + 32 >> 6;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V")
	private void method5116(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5142(-1);
		} else {
			this.method5140(-1);
		}
		this.method5133(-1);
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			this.anIntArray503[local25] = this.anIntArray490[local25];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray500[local41] = this.anIntArray490[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!saa;ILclient!bi;BLclient!ns;)Z")
	public synchronized boolean method5117(@OriginalArg(0) Class4_Sub43 arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(4) Class246 arg2) {
		arg0.method6601();
		@Pc(17) boolean local17 = true;
		@Pc(31) int[] local31 = new int[] { 22050 };
		for (@Pc(37) Class4_Sub36 local37 = (Class4_Sub36) arg0.aClass183_32.method4286(); local37 != null; local37 = (Class4_Sub36) arg0.aClass183_32.method4283()) {
			@Pc(43) int local43 = (int) local37.aLong307;
			@Pc(51) Class4_Sub14 local51 = (Class4_Sub14) this.aClass183_24.method4289((long) local43);
			if (local51 == null) {
				local51 = Static518.method7286(local43, arg1);
				if (local51 == null) {
					local17 = false;
					continue;
				}
				this.aClass183_24.method4282((long) local43, local51);
			}
			if (!local51.method2334(local31, arg2, local37.aByteArray74)) {
				local17 = false;
			}
		}
		if (local17) {
			arg0.method6602();
		}
		return local17;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Z")
	public synchronized boolean method5118() {
		return this.aClass250_1.method5622();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZI)V")
	private void method5119(@OriginalArg(1) int arg0) {
		if ((this.anIntArray493[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class4_Sub10 local22 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3267(); local22 != null; local22 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3273()) {
			if (arg0 == local22.anInt1188 && this.lb[arg0][local22.anInt1201] == null && local22.anInt1197 < 0) {
				local22.anInt1197 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V")
	private void method5120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method5132(arg1, arg2, 64);
		if ((this.anIntArray493[arg2] & 0x2) != 0) {
			for (@Pc(25) Class4_Sub10 local25 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3274(); local25 != null; local25 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3266()) {
				if (arg2 == local25.anInt1188 && local25.anInt1197 < 0) {
					this.lb[arg2][local25.anInt1201] = null;
					this.lb[arg2][arg1] = local25;
					@Pc(63) int local63 = local25.anInt1200 + (local25.anInt1198 * local25.anInt1189 >> 12);
					local25.anInt1200 += arg1 - local25.anInt1201 << 8;
					local25.anInt1198 = local63 - local25.anInt1200;
					local25.anInt1189 = 4096;
					local25.anInt1201 = arg1;
					return;
				}
			}
		}
		@Pc(110) Class4_Sub14 local110 = (Class4_Sub14) this.aClass183_24.method4289((long) this.anIntArray503[arg2]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class4_Sub16_Sub1 local118 = local110.aClass4_Sub16_Sub1Array1[arg1];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class4_Sub10 local125 = new Class4_Sub10();
		local125.anInt1188 = arg2;
		local125.aClass4_Sub16_Sub1_2 = local118;
		local125.aClass4_Sub14_1 = local110;
		local125.aClass132_1 = local110.aClass132Array1[arg1];
		local125.anInt1181 = local110.aByteArray33[arg1];
		local125.anInt1201 = arg1;
		local125.anInt1184 = local110.anInt2620 * arg0 * arg0 * local110.aByteArray34[arg1] + 1024 >> 11;
		local125.anInt1193 = local110.aByteArray32[arg1] & 0xFF;
		local125.anInt1200 = (arg1 << 8) - (local110.aShortArray54[arg1] & 0x7FFF);
		local125.anInt1187 = 0;
		local125.anInt1197 = -1;
		local125.anInt1194 = 0;
		local125.anInt1190 = 0;
		local125.anInt1195 = 0;
		if (this.anIntArray498[arg2] == 0) {
			local125.aClass4_Sub13_Sub2_2 = Static604.method3921(local118, this.method5141(local125), this.method5129(local125), this.method5115(local125));
		} else {
			local125.aClass4_Sub13_Sub2_2 = Static604.method3921(local118, this.method5141(local125), 0, this.method5115(local125));
			this.method5135(local125, local110.aShortArray54[arg1] < 0);
		}
		if (local110.aShortArray54[arg1] < 0) {
			local125.aClass4_Sub13_Sub2_2.method3914(-1);
		}
		if (local125.anInt1181 >= 0) {
			@Pc(277) Class4_Sub10 local277 = this.aClass4_Sub10ArrayArray1[arg2][local125.anInt1181];
			if (local277 != null && local277.anInt1197 < 0) {
				this.lb[arg2][local277.anInt1201] = null;
				local277.anInt1197 = 0;
			}
			this.aClass4_Sub10ArrayArray1[arg2][local125.anInt1181] = local125;
		}
		this.aClass4_Sub13_Sub4_1.aClass124_47.method3275(local125);
		this.lb[arg2][arg1] = local125;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(ZI)V")
	private synchronized void method5121(@OriginalArg(0) boolean arg0) {
		this.aClass250_1.method5617();
		this.aClass4_Sub43_2 = null;
		this.method5116(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(ZI)V")
	private void method5122(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local15 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method5132(local30, local24, local36);
		} else if (local15 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 <= 0) {
				this.method5132(local30, local24, 64);
			} else {
				this.method5120(local36, local30, local24);
			}
		} else if (local15 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method5146(local36, local30, local24);
		} else if (local15 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray500[local24] = (local36 << 14) + (this.anIntArray500[local24] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray500[local24] = (this.anIntArray500[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 1) {
				this.anIntArray504[local24] = (local36 << 7) + (this.anIntArray504[local24] & 0xFFFFC07F);
			}
			if (local30 == 33) {
				this.anIntArray504[local24] = local36 + (this.anIntArray504[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray502[local24] = (this.anIntArray502[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 37) {
				this.anIntArray502[local24] = (this.anIntArray502[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 7) {
				this.anIntArray495[local24] = (this.anIntArray495[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 39) {
				this.anIntArray495[local24] = local36 + (this.anIntArray495[local24] & 0xFFFFFF80);
			}
			if (local30 == 10) {
				this.anIntArray491[local24] = (this.anIntArray491[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 42) {
				this.anIntArray491[local24] = (this.anIntArray491[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 11) {
				this.anIntArray499[local24] = (this.anIntArray499[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 43) {
				this.anIntArray499[local24] = local36 + (this.anIntArray499[local24] & 0xFFFFFF80);
			}
			if (local30 == 64) {
				if (local36 >= 64) {
					this.anIntArray493[local24] |= 0x1;
				} else {
					this.anIntArray493[local24] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local36 >= 64) {
					this.anIntArray493[local24] |= 0x2;
				} else {
					this.method5119(local24);
					this.anIntArray493[local24] &= 0xFFFFFFFD;
				}
			}
			if (local30 == 99) {
				this.anIntArray494[local24] = (this.anIntArray494[local24] & 0x7F) + (local36 << 7);
			}
			if (local30 == 98) {
				this.anIntArray494[local24] = local36 + (this.anIntArray494[local24] & 0x3F80);
			}
			if (local30 == 101) {
				this.anIntArray494[local24] = (this.anIntArray494[local24] & 0x7F) + (local36 << 7) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray494[local24] = local36 + (this.anIntArray494[local24] & 0x3F80) + 16384;
			}
			if (local30 == 120) {
				this.method5142(local24);
			}
			if (local30 == 121) {
				this.method5133(local24);
			}
			if (local30 == 123) {
				this.method5140(local24);
			}
			@Pc(508) int local508;
			if (local30 == 6) {
				local508 = this.anIntArray494[local24];
				if (local508 == 16384) {
					this.anIntArray501[local24] = (local36 << 7) + (this.anIntArray501[local24] & 0xFFFFC07F);
				}
			}
			if (local30 == 38) {
				local508 = this.anIntArray494[local24];
				if (local508 == 16384) {
					this.anIntArray501[local24] = (this.anIntArray501[local24] & 0xFFFFFF80) + local36;
				}
			}
			if (local30 == 16) {
				this.anIntArray498[local24] = (local36 << 7) + (this.anIntArray498[local24] & 0xFFFFC07F);
			}
			if (local30 == 48) {
				this.anIntArray498[local24] = (this.anIntArray498[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 81) {
				if (local36 < 64) {
					this.method5128(local24);
					this.anIntArray493[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray493[local24] |= 0x4;
				}
			}
			if (local30 == 17) {
				this.method5147(local24, (this.anIntArray505[local24] & 0xFFFFC07F) + (local36 << 7));
			}
			if (local30 == 49) {
				this.method5147(local24, local36 + (this.anIntArray505[local24] & 0xFFFFFF80));
			}
		} else if (local15 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method5136(local30 + this.anIntArray500[local24], local24);
		} else if (local15 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method5144(local24, local30);
		} else if (local15 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F5E) >> 8);
			this.method5123(local24, local30);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method5116(true);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)V")
	private void method5123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray492[arg0] = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZLclient!saa;Z)V")
	private synchronized void method5124(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub43 arg1, @OriginalArg(3) boolean arg2) {
		this.method5121(arg2);
		this.aClass250_1.method5624(arg1.aByteArray105);
		this.aLong176 = 0L;
		this.aBoolean452 = arg0;
		@Pc(30) int local30 = this.aClass250_1.method5615();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass250_1.method5627(local32);
			this.aClass250_1.method5620(local32);
			this.aClass250_1.method5625(local32);
		}
		this.anInt6061 = this.aClass250_1.method5628();
		this.anInt6060 = this.aClass250_1.anIntArray539[this.anInt6061];
		this.aLong175 = this.aClass250_1.method5626(this.anInt6060);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()Lclient!sda;")
	@Override
	public synchronized Class4_Sub13 method6216() {
		return null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
	public synchronized void method5125(@OriginalArg(1) int arg0) {
		this.anInt6056 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public synchronized void method5126() {
		for (@Pc(15) Class4_Sub14 local15 = (Class4_Sub14) this.aClass183_24.method4286(); local15 != null; local15 = (Class4_Sub14) this.aClass183_24.method4283()) {
			local15.method8013();
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()Lclient!sda;")
	@Override
	public synchronized Class4_Sub13 method6220() {
		return this.aClass4_Sub13_Sub4_1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6215(@OriginalArg(0) int arg0) {
		if (this.aClass250_1.method5622()) {
			@Pc(18) int local18 = this.anInt6022 * this.aClass250_1.anInt6721 / Static379.anInt7010;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong176;
				if (this.aLong175 - local27 >= 0L) {
					this.aLong176 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong175 + (long) local18 - this.aLong176 - 1L) / (long) local18);
				this.aLong176 += (long) local18 * (long) local58;
				this.aClass4_Sub13_Sub4_1.method6215(local58);
				arg0 -= local58;
				this.method5131();
			} while (this.aClass250_1.method5622());
		}
		this.aClass4_Sub13_Sub4_1.method6215(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
	public synchronized void method5127() {
		for (@Pc(13) Class4_Sub14 local13 = (Class4_Sub14) this.aClass183_24.method4286(); local13 != null; local13 = (Class4_Sub14) this.aClass183_24.method4283()) {
			local13.method2335();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	private void method5128(@OriginalArg(0) int arg0) {
		if ((this.anIntArray493[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class4_Sub10 local22 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3267(); local22 != null; local22 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3273()) {
			if (arg0 == local22.anInt1188) {
				local22.anInt1185 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!cfa;I)I")
	private int method5129(@OriginalArg(0) Class4_Sub10 arg0) {
		if (this.anIntArray496[arg0.anInt1188] == 0) {
			return 0;
		}
		@Pc(14) Class132 local14 = arg0.aClass132_1;
		@Pc(30) int local30 = this.anIntArray499[arg0.anInt1188] * this.anIntArray495[arg0.anInt1188] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt1184 * local38 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt6056 * local47 + 128 >> 8;
		local30 = local56 * this.anIntArray496[arg0.anInt1188] + 128 >> 8;
		if (local14.anInt3830 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) local14.anInt3830 * 1.953125E-5D * (double) arg0.anInt1194) * (double) local30 + 0.5D);
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(121) int local121;
		@Pc(133) int local133;
		if (local14.aByteArray44 != null) {
			local95 = arg0.anInt1190;
			local103 = local14.aByteArray44[arg0.anInt1187 + 1];
			if (arg0.anInt1187 < local14.aByteArray44.length - 2) {
				local121 = (local14.aByteArray44[arg0.anInt1187] & 0xFF) << 8;
				local133 = (local14.aByteArray44[arg0.anInt1187 + 2] & 0xFF) << 8;
				local103 += (local14.aByteArray44[arg0.anInt1187 + 3] - local103) * (local95 + -local121) / (local133 - local121);
			}
			local30 = local30 * local103 + 32 >> 6;
		}
		if (arg0.anInt1197 > 0 && local14.aByteArray45 != null) {
			local95 = arg0.anInt1197;
			local103 = local14.aByteArray45[arg0.anInt1195 + 1];
			if (local14.aByteArray45.length - 2 > arg0.anInt1195) {
				local121 = (local14.aByteArray45[arg0.anInt1195] & 0xFF) << 8;
				local133 = (local14.aByteArray45[arg0.anInt1195 + 2] & 0xFF) << 8;
				local103 += (local95 - local121) * (-local103 + local14.aByteArray45[arg0.anInt1195 + 3]) / (local133 - local121);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLclient!cfa;)Z")
	public boolean method5130(@OriginalArg(1) Class4_Sub10 arg0) {
		if (arg0.aClass4_Sub13_Sub2_2 != null) {
			return false;
		}
		if (arg0.anInt1197 >= 0) {
			arg0.method8013();
			if (arg0.anInt1181 > 0 && arg0 == this.aClass4_Sub10ArrayArray1[arg0.anInt1188][arg0.anInt1181]) {
				this.aClass4_Sub10ArrayArray1[arg0.anInt1188][arg0.anInt1181] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()I")
	@Override
	public synchronized int method6217() {
		return 0;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	private void method5131() {
		@Pc(8) int local8 = this.anInt6061;
		@Pc(11) int local11 = this.anInt6060;
		@Pc(20) long local20 = this.aLong175;
		if (this.aClass4_Sub43_2 != null && local11 == this.anInt6062) {
			this.method5124(this.aBoolean452, this.aClass4_Sub43_2, this.aBoolean453);
			this.method5131();
			return;
		}
		while (local11 == this.anInt6060) {
			while (this.aClass250_1.anIntArray539[local8] == local11) {
				this.aClass250_1.method5627(local8);
				@Pc(49) int local49 = this.aClass250_1.method5613(local8);
				if (local49 == 1) {
					this.aClass250_1.method5623();
					this.aClass250_1.method5625(local8);
					if (this.aClass250_1.method5621()) {
						if (this.aClass4_Sub43_2 != null) {
							this.method5143(this.aClass4_Sub43_2, this.aBoolean452);
							this.method5131();
							return;
						}
						if (!this.aBoolean452 || local11 == 0) {
							this.method5116(true);
							this.aClass250_1.method5617();
							return;
						}
						this.aClass250_1.method5618(local20);
					}
					break;
				}
				if ((local49 & 0x80) != 0) {
					this.method5122(local49);
				}
				this.aClass250_1.method5620(local8);
				this.aClass250_1.method5625(local8);
			}
			local8 = this.aClass250_1.method5628();
			local11 = this.aClass250_1.anIntArray539[local8];
			local20 = this.aClass250_1.method5626(local11);
		}
		this.anInt6060 = local11;
		this.anInt6061 = local8;
		this.aLong175 = local20;
		if (this.aClass4_Sub43_2 != null && local11 > this.anInt6062) {
			this.anInt6061 = -1;
			this.anInt6060 = this.anInt6062;
			this.aLong175 = this.aClass250_1.method5626(this.anInt6060);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBII)V")
	private void method5132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub10 local12 = this.lb[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.lb[arg1][arg0] = null;
		if ((this.anIntArray493[arg1] & 0x2) == 0) {
			local12.anInt1197 = 0;
			return;
		}
		for (@Pc(41) Class4_Sub10 local41 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3267(); local41 != null; local41 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3273()) {
			if (local12.anInt1188 == local41.anInt1188 && local41.anInt1197 < 0 && local12 != local41) {
				local12.anInt1197 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(BI)V")
	private void method5133(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.method5133(local13);
			}
			return;
		}
		this.anIntArray495[arg0] = 12800;
		this.anIntArray491[arg0] = 8192;
		this.anIntArray499[arg0] = 16383;
		this.anIntArray492[arg0] = 8192;
		this.anIntArray504[arg0] = 0;
		this.anIntArray502[arg0] = 8192;
		this.method5119(arg0);
		this.method5128(arg0);
		this.anIntArray493[arg0] = 0;
		this.anIntArray494[arg0] = 32767;
		this.anIntArray501[arg0] = 256;
		this.anIntArray498[arg0] = 0;
		this.method5147(arg0, 8192);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public synchronized void method5134() {
		this.method5139();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!cfa;ZI)V")
	public void method5135(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass4_Sub16_Sub1_2.aByteArray37.length;
		@Pc(45) int local45;
		if (arg1 && arg0.aClass4_Sub16_Sub1_2.aBoolean247) {
			@Pc(32) int local32 = local8 + local8 - arg0.aClass4_Sub16_Sub1_2.anInt3114;
			local45 = (int) ((long) this.anIntArray498[arg0.anInt1188] * (long) local32 >> 6);
			local8 <<= 0x8;
			if (local8 <= local45) {
				arg0.aClass4_Sub13_Sub2_2.method3907();
				local45 = local8 + local8 - local45 - 1;
			}
		} else {
			local45 = (int) ((long) local8 * (long) this.anIntArray498[arg0.anInt1188] >> 6);
		}
		arg0.aClass4_Sub13_Sub2_2.method3903(local45);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)V")
	private void method5136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray503[arg1] != arg0) {
			this.anIntArray503[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass4_Sub10ArrayArray1[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!cfa;[III)Z")
	public boolean method5137(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt1191 = Static379.anInt7010 / 100;
		if (arg0.anInt1197 >= 0 && (arg0.aClass4_Sub13_Sub2_2 == null || arg0.aClass4_Sub13_Sub2_2.method3915())) {
			arg0.method1067();
			arg0.method8013();
			if (arg0.anInt1181 > 0 && arg0 == this.aClass4_Sub10ArrayArray1[arg0.anInt1188][arg0.anInt1181]) {
				this.aClass4_Sub10ArrayArray1[arg0.anInt1188][arg0.anInt1181] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg0.anInt1189;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray502[arg0.anInt1188] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg0.anInt1189 = local61;
		}
		arg0.aClass4_Sub13_Sub2_2.method3913(this.method5141(arg0));
		@Pc(101) Class132 local101 = arg0.aClass132_1;
		arg0.anInt1192 += local101.anInt3831;
		@Pc(110) boolean local110 = false;
		arg0.anInt1183++;
		@Pc(135) double local135 = (double) ((arg0.anInt1201 - 60 << 8) + (arg0.anInt1198 * arg0.anInt1189 >> 12)) * 5.086263020833333E-6D;
		if (local101.anInt3830 > 0) {
			if (local101.anInt3833 <= 0) {
				arg0.anInt1194 += 128;
			} else {
				arg0.anInt1194 += (int) (Math.pow(2.0D, (double) local101.anInt3833 * local135) * 128.0D + 0.5D);
			}
			if (local101.anInt3830 * arg0.anInt1194 >= 819200) {
				local110 = true;
			}
		}
		if (local101.aByteArray44 != null) {
			if (local101.anInt3836 <= 0) {
				arg0.anInt1190 += 128;
			} else {
				arg0.anInt1190 += (int) (Math.pow(2.0D, (double) local101.anInt3836 * local135) * 128.0D + 0.5D);
			}
			while (arg0.anInt1187 < local101.aByteArray44.length - 2 && arg0.anInt1190 > (local101.aByteArray44[arg0.anInt1187 + 2] & 0xFF) << 8) {
				arg0.anInt1187 += 2;
			}
			if (local101.aByteArray44.length - 2 == arg0.anInt1187 && local101.aByteArray44[arg0.anInt1187 + 1] == 0) {
				local110 = true;
			}
		}
		if (arg0.anInt1197 >= 0 && local101.aByteArray45 != null && (this.anIntArray493[arg0.anInt1188] & 0x1) == 0 && (arg0.anInt1181 < 0 || arg0 != this.aClass4_Sub10ArrayArray1[arg0.anInt1188][arg0.anInt1181])) {
			if (local101.anInt3835 <= 0) {
				arg0.anInt1197 += 128;
			} else {
				arg0.anInt1197 += (int) (Math.pow(2.0D, (double) local101.anInt3835 * local135) * 128.0D + 0.5D);
			}
			while (arg0.anInt1195 < local101.aByteArray45.length - 2 && (local101.aByteArray45[arg0.anInt1195 + 2] & 0xFF) << 8 < arg0.anInt1197) {
				arg0.anInt1195 += 2;
			}
			if (arg0.anInt1195 == local101.aByteArray45.length - 2) {
				local110 = true;
			}
		}
		if (!local110) {
			arg0.aClass4_Sub13_Sub2_2.method3931(arg0.anInt1191, this.method5129(arg0), this.method5115(arg0));
			return false;
		}
		arg0.aClass4_Sub13_Sub2_2.method3911(arg0.anInt1191);
		if (arg1 == null) {
			arg0.aClass4_Sub13_Sub2_2.method6215(arg2);
		} else {
			arg0.aClass4_Sub13_Sub2_2.method6221(arg1, arg3, arg2);
		}
		if (arg0.aClass4_Sub13_Sub2_2.method3909()) {
			this.aClass4_Sub13_Sub4_1.aClass4_Sub13_Sub1_2.method2272(arg0.aClass4_Sub13_Sub2_2);
		}
		arg0.method1067();
		if (arg0.anInt1197 >= 0) {
			arg0.method8013();
			if (arg0.anInt1181 > 0 && this.aClass4_Sub10ArrayArray1[arg0.anInt1188][arg0.anInt1181] == arg0) {
				this.aClass4_Sub10ArrayArray1[arg0.anInt1188][arg0.anInt1181] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(III)V")
	private void method5139() {
		this.anIntArray490[9] = 128;
		this.anIntArray500[9] = 128;
		this.method5136(128, 9);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	private void method5140(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class4_Sub10 local16 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3267(); local16 != null; local16 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3273()) {
			if ((arg0 < 0 || local16.anInt1188 == arg0) && local16.anInt1197 < 0) {
				this.lb[local16.anInt1188][local16.anInt1201] = null;
				local16.anInt1197 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!cfa;I)I")
	private int method5141(@OriginalArg(0) Class4_Sub10 arg0) {
		@Pc(14) int local14 = (arg0.anInt1198 * arg0.anInt1189 >> 12) + arg0.anInt1200;
		local14 += (this.anIntArray492[arg0.anInt1188] - 8192) * this.anIntArray501[arg0.anInt1188] >> 12;
		@Pc(41) Class132 local41 = arg0.aClass132_1;
		@Pc(61) int local61;
		if (local41.anInt3831 > 0 && (local41.anInt3837 > 0 || this.anIntArray504[arg0.anInt1188] > 0)) {
			local61 = local41.anInt3837 << 2;
			@Pc(66) int local66 = local41.anInt3834 << 1;
			if (arg0.anInt1183 < local66) {
				local61 = local61 * arg0.anInt1183 / local66;
			}
			local61 += this.anIntArray504[arg0.anInt1188] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt1192 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local96 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass4_Sub16_Sub1_2.anInt3115 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static379.anInt7010 + 0.5D);
		return local61 >= 1 ? local61 : 1;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)V")
	private void method5142(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class4_Sub10 local12 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3267(); local12 != null; local12 = (Class4_Sub10) this.aClass4_Sub13_Sub4_1.aClass124_47.method3273()) {
			if (arg0 < 0 || arg0 == local12.anInt1188) {
				if (local12.aClass4_Sub13_Sub2_2 != null) {
					local12.aClass4_Sub13_Sub2_2.method3911(Static379.anInt7010 / 100);
					if (local12.aClass4_Sub13_Sub2_2.method3909()) {
						this.aClass4_Sub13_Sub4_1.aClass4_Sub13_Sub1_2.method2272(local12.aClass4_Sub13_Sub2_2);
					}
					local12.method1067();
				}
				if (local12.anInt1197 < 0) {
					this.lb[local12.anInt1188][local12.anInt1201] = null;
				}
				local12.method8013();
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!saa;ZZ)V")
	public synchronized void method5143(@OriginalArg(0) Class4_Sub43 arg0, @OriginalArg(1) boolean arg1) {
		this.method5124(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(III)V")
	private void method5144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6221(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass250_1.method5622()) {
			@Pc(14) int local14 = this.anInt6022 * this.aClass250_1.anInt6721 / Static379.anInt7010;
			do {
				@Pc(23) long local23 = this.aLong176 + (long) arg2 * (long) local14;
				if (this.aLong175 - local23 >= 0L) {
					this.aLong176 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong175 + (long) local14 - this.aLong176 - 1L) / (long) local14);
				this.aLong176 += (long) local53 * (long) local14;
				this.aClass4_Sub13_Sub4_1.method6221(arg0, arg1, local53);
				arg2 -= local53;
				arg1 += local53;
				this.method5131();
			} while (this.aClass250_1.method5622());
		}
		this.aClass4_Sub13_Sub4_1.method6221(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public synchronized void method5145() {
		this.method5121(true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZII)V")
	private void method5146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)V")
	private void method5147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray505[arg0] = arg1;
		this.anIntArray497[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}
}
