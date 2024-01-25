import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!jba", name = "Cb", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!jba", name = "Eb", descriptor = "I")
	private int anInt4398;

	@OriginalMember(owner = "client!jba", name = "Fb", descriptor = "I")
	private int anInt4399;

	@OriginalMember(owner = "client!jba", name = "Gb", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!jba", name = "Hb", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!jba", name = "Ib", descriptor = "Lclient!nfa;")
	private Class1_Sub36 aClass1_Sub36_1;

	@OriginalMember(owner = "client!jba", name = "Jb", descriptor = "I")
	private int anInt4400;

	@OriginalMember(owner = "client!jba", name = "Kb", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
	private int anInt4354 = 256;

	@OriginalMember(owner = "client!jba", name = "w", descriptor = "[I")
	private final int[] anIntArray228 = new int[16];

	@OriginalMember(owner = "client!jba", name = "L", descriptor = "[I")
	private final int[] anIntArray230 = new int[16];

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "[I")
	private final int[] anIntArray229 = new int[16];

	@OriginalMember(owner = "client!jba", name = "Q", descriptor = "[I")
	private final int[] anIntArray233 = new int[16];

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "[I")
	private final int[] anIntArray226 = new int[16];

	@OriginalMember(owner = "client!jba", name = "mb", descriptor = "[[Lclient!ag;")
	private final Class1_Sub5[][] aClass1_Sub5ArrayArray2 = new Class1_Sub5[16][128];

	@OriginalMember(owner = "client!jba", name = "S", descriptor = "[I")
	private final int[] anIntArray234 = new int[16];

	@OriginalMember(owner = "client!jba", name = "P", descriptor = "[I")
	private final int[] anIntArray232 = new int[16];

	@OriginalMember(owner = "client!jba", name = "fb", descriptor = "[I")
	private final int[] anIntArray236 = new int[16];

	@OriginalMember(owner = "client!jba", name = "gb", descriptor = "[I")
	private final int[] anIntArray237 = new int[16];

	@OriginalMember(owner = "client!jba", name = "cb", descriptor = "[I")
	private final int[] anIntArray235 = new int[16];

	@OriginalMember(owner = "client!jba", name = "nb", descriptor = "[I")
	public final int[] anIntArray238 = new int[16];

	@OriginalMember(owner = "client!jba", name = "O", descriptor = "[I")
	private final int[] anIntArray231 = new int[16];

	@OriginalMember(owner = "client!jba", name = "sb", descriptor = "[I")
	private final int[] anIntArray241 = new int[16];

	@OriginalMember(owner = "client!jba", name = "r", descriptor = "[I")
	private final int[] anIntArray227 = new int[16];

	@OriginalMember(owner = "client!jba", name = "pb", descriptor = "[I")
	public final int[] anIntArray239 = new int[16];

	@OriginalMember(owner = "client!jba", name = "W", descriptor = "I")
	private final int anInt4377 = 1000000;

	@OriginalMember(owner = "client!jba", name = "M", descriptor = "[[Lclient!ag;")
	private final Class1_Sub5[][] aClass1_Sub5ArrayArray1 = new Class1_Sub5[16][128];

	@OriginalMember(owner = "client!jba", name = "rb", descriptor = "[I")
	public final int[] anIntArray240 = new int[16];

	@OriginalMember(owner = "client!jba", name = "db", descriptor = "Lclient!vba;")
	private final Class342 aClass342_1 = new Class342();

	@OriginalMember(owner = "client!jba", name = "Db", descriptor = "Lclient!ao;")
	private final Class1_Sub6_Sub1 aClass1_Sub6_Sub1_1 = new Class1_Sub6_Sub1(this);

	@OriginalMember(owner = "client!jba", name = "N", descriptor = "Lclient!faa;")
	private final Class91 aClass91_17;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "()V")
	public Class1_Sub6_Sub2() {
		this.aClass91_17 = new Class91(128);
		this.method3522(-1, 256);
		this.method3535(true);
	}

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!jba;)V")
	public Class1_Sub6_Sub2(@OriginalArg(0) Class1_Sub6_Sub2 arg0) {
		this.aClass91_17 = arg0.aClass91_17;
		this.method3522(-1, 256);
		this.method3535(true);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!ag;)Z")
	public boolean method3500(@OriginalArg(1) Class1_Sub5 arg0) {
		if (arg0.aClass1_Sub6_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt301 >= 0) {
			arg0.method7908();
			if (arg0.anInt293 > 0 && arg0 == this.aClass1_Sub5ArrayArray2[arg0.anInt305][arg0.anInt293]) {
				this.aClass1_Sub5ArrayArray2[arg0.anInt305][arg0.anInt293] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "()Lclient!jc;")
	@Override
	public synchronized Class1_Sub6 method6577() {
		return this.aClass1_Sub6_Sub1_1;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(Z)V")
	public synchronized void method3502() {
		for (@Pc(7) Class1_Sub48 local7 = (Class1_Sub48) this.aClass91_17.method2278(); local7 != null; local7 = (Class1_Sub48) this.aClass91_17.method2276()) {
			local7.method7908();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!nfa;IZZ)V")
	private synchronized void method3503(@OriginalArg(0) Class1_Sub36 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method3534(arg1);
		this.aClass342_1.method7441(arg0.aByteArray66);
		this.aLong111 = 0;
		this.aBoolean313 = arg2;
		@Pc(25) int local25 = this.aClass342_1.method7446();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			this.aClass342_1.method7445(local27);
			this.aClass342_1.method7443(local27);
			this.aClass342_1.method7450(local27);
		}
		this.anInt4398 = this.aClass342_1.method7442();
		this.anInt4399 = this.aClass342_1.anIntArray574[this.anInt4398];
		this.aLong110 = this.aClass342_1.method7451(this.anInt4399);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZI)V")
	public synchronized void method3505() {
		this.method3537();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BZLclient!ag;)V")
	public void method3506(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub13_Sub1_3.aByteArray8.length;
		@Pc(40) int local40;
		if (arg0 && arg1.aClass1_Sub13_Sub1_3.aBoolean51) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass1_Sub13_Sub1_3.anInt913;
			local8 <<= 0x8;
			local40 = (int) ((long) this.anIntArray240[arg1.anInt305] * (long) local23 >> 6);
			if (local40 >= local8) {
				arg1.aClass1_Sub6_Sub4_3.method6596();
				local40 = local8 + local8 - local40 - 1;
			}
		} else {
			local40 = (int) ((long) this.anIntArray240[arg1.anInt305] * (long) local8 >> 6);
		}
		arg1.aClass1_Sub6_Sub4_3.method6588(local40);
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(ILclient!ag;)I")
	private int method3507(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(14) int local14 = (arg0.anInt299 * arg0.anInt296 >> 12) + arg0.anInt288;
		local14 += this.anIntArray230[arg0.anInt305] * (this.anIntArray229[arg0.anInt305] - 8192) >> 12;
		@Pc(35) Class309 local35 = arg0.aClass309_1;
		@Pc(55) int local55;
		if (local35.anInt8194 > 0 && (local35.anInt8193 > 0 || this.anIntArray232[arg0.anInt305] > 0)) {
			local55 = local35.anInt8193 << 2;
			@Pc(60) int local60 = local35.anInt8190 << 1;
			if (arg0.anInt295 < local60) {
				local55 = local55 * arg0.anInt295 / local60;
			}
			local55 += this.anIntArray232[arg0.anInt305] >> 7;
			@Pc(94) double local94 = Math.sin((double) (arg0.anInt303 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local94 * (double) local55);
		}
		local55 = (int) ((double) (arg0.aClass1_Sub13_Sub1_3.anInt914 * 256) * Math.pow((double) 2, (double) local14 * 3.255208333333333E-4D) / (double) Static304.anInt5650 + 0.5D);
		return local55 < 1 ? 1 : local55;
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)V")
	private void method3508() {
		@Pc(16) int local16 = this.anInt4398;
		@Pc(19) int local19 = this.anInt4399;
		@Pc(22) long local22 = this.aLong110;
		if (this.aClass1_Sub36_1 != null && local19 == this.anInt4400) {
			this.method3503(this.aClass1_Sub36_1, this.aBoolean314, this.aBoolean313);
			this.method3508();
			return;
		}
		while (this.anInt4399 == local19) {
			while (this.aClass342_1.anIntArray574[local16] == local19) {
				this.aClass342_1.method7445(local16);
				@Pc(55) int local55 = this.aClass342_1.method7440(local16);
				if (local55 == 1) {
					this.aClass342_1.method7439();
					this.aClass342_1.method7450(local16);
					if (this.aClass342_1.method7452()) {
						if (this.aClass1_Sub36_1 != null) {
							this.method3521(this.aClass1_Sub36_1, this.aBoolean313);
							this.method3508();
							return;
						}
						if (!this.aBoolean313 || local19 == 0) {
							this.method3535(true);
							this.aClass342_1.method7447();
							return;
						}
						this.aClass342_1.method7438(local22);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method3525(local55);
				}
				this.aClass342_1.method7443(local16);
				this.aClass342_1.method7450(local16);
			}
			local16 = this.aClass342_1.method7442();
			local19 = this.aClass342_1.anIntArray574[local16];
			local22 = this.aClass342_1.method7451(local19);
		}
		this.anInt4399 = local19;
		this.aLong110 = local22;
		this.anInt4398 = local16;
		if (this.aClass1_Sub36_1 != null && this.anInt4400 < local19) {
			this.anInt4398 = -1;
			this.anInt4399 = this.anInt4400;
			this.aLong110 = this.aClass342_1.method7451(this.anInt4399);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V")
	private void method3509(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
				this.method3509(local15);
			}
			return;
		}
		this.anIntArray233[arg0] = 12800;
		this.anIntArray226[arg0] = 8192;
		this.anIntArray236[arg0] = 16383;
		this.anIntArray229[arg0] = 8192;
		this.anIntArray232[arg0] = 0;
		this.anIntArray241[arg0] = 8192;
		this.method3511(arg0);
		this.method3532(arg0);
		this.anIntArray239[arg0] = 0;
		this.anIntArray231[arg0] = 32767;
		this.anIntArray230[arg0] = 256;
		this.anIntArray240[arg0] = 0;
		this.method3524(arg0, 8192);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(JI)V")
	private void method3510(@OriginalArg(0) long arg0) {
		while (this.aLong110 <= arg0) {
			@Pc(13) int local13 = this.anInt4398;
			@Pc(16) int local16 = this.anInt4399;
			@Pc(19) long local19 = this.aLong110;
			while (local16 == this.anInt4399) {
				while (this.aClass342_1.anIntArray574[local13] == local16) {
					this.aClass342_1.method7445(local13);
					@Pc(30) int local30 = this.aClass342_1.method7440(local13);
					if (local30 == 1) {
						this.aClass342_1.method7439();
						this.aClass342_1.method7450(local13);
						if (this.aClass342_1.method7452()) {
							if (!this.aBoolean313 || local16 == 0) {
								this.method3535(true);
								this.aClass342_1.method7447();
								return;
							}
							this.aClass342_1.method7438(local19);
						}
						break;
					}
					if ((local30 & 0x80) != 0 && (local30 & 0xF0) != 144) {
						this.method3525(local30);
					}
					this.aClass342_1.method7443(local13);
					this.aClass342_1.method7450(local13);
				}
				this.aLong111 = local19;
				local13 = this.aClass342_1.method7442();
				local16 = this.aClass342_1.anIntArray574[local13];
				local19 = this.aClass342_1.method7451(local16);
			}
			this.anInt4398 = local13;
			this.aLong110 = local19;
			this.anInt4399 = local16;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BI)V")
	private void method3511(@OriginalArg(1) int arg0) {
		if ((this.anIntArray239[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(28) Class1_Sub5 local28 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2547(); local28 != null; local28 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2554()) {
			if (local28.anInt305 == arg0 && this.aClass1_Sub5ArrayArray1[arg0][local28.anInt290] == null && local28.anInt301 < 0) {
				local28.anInt301 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(BI)V")
	public synchronized void method3512(@OriginalArg(1) int arg0) {
		this.anInt4354 = arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIBI)V")
	private void method3513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub5 local12 = this.aClass1_Sub5ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub5ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray239[arg0] & 0x2) == 0) {
			local12.anInt301 = 0;
			return;
		}
		for (@Pc(44) Class1_Sub5 local44 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2547(); local44 != null; local44 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2554()) {
			if (local12.anInt305 == local44.anInt305 && local44.anInt301 < 0 && local12 != local44) {
				local12.anInt301 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!sea;Lclient!nfa;Lclient!on;I)Z")
	public synchronized boolean method3514(@OriginalArg(1) Class308 arg0, @OriginalArg(2) Class1_Sub36 arg1, @OriginalArg(3) Class257 arg2) {
		arg1.method5158();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(31) Class1_Sub34 local31 = (Class1_Sub34) arg1.aClass91_28.method2278(); local31 != null; local31 = (Class1_Sub34) arg1.aClass91_28.method2276()) {
			@Pc(37) int local37 = (int) local31.aLong268;
			@Pc(45) Class1_Sub48 local45 = (Class1_Sub48) this.aClass91_17.method2271((long) local37);
			if (local45 == null) {
				local45 = Static277.method4022(arg0, local37);
				if (local45 == null) {
					local9 = false;
					continue;
				}
				this.aClass91_17.method2269((long) local37, local45);
			}
			if (!local45.method7550(local31.aByteArray56, local20, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method5159();
		}
		return local9;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(II)V")
	private void method3515(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2547(); local12 != null; local12 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2554()) {
			if ((arg0 < 0 || arg0 == local12.anInt305) && local12.anInt301 < 0) {
				this.aClass1_Sub5ArrayArray1[local12.anInt305][local12.anInt290] = null;
				local12.anInt301 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(ILclient!ag;)I")
	private int method3516(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(17) int local17 = this.anIntArray226[arg0.anInt305];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt304) * (16384 - local17) + 32 >> 6) : local17 * arg0.anInt304 + 32 >> 6;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIZ)V")
	private void method3517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass342_1.method7444()) {
			@Pc(14) int local14 = this.anInt4377 * this.aClass342_1.anInt9124 / Static304.anInt5650;
			do {
				@Pc(23) long local23 = this.aLong111 + (long) arg2 * (long) local14;
				if (this.aLong110 - local23 >= 0L) {
					this.aLong111 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong110 + (long) local14 - this.aLong111 - 1L) / (long) local14);
				this.aLong111 += (long) local14 * (long) local52;
				this.aClass1_Sub6_Sub1_1.method6576(arg0, arg1, local52);
				arg1 += local52;
				arg2 -= local52;
				this.method3508();
			} while (this.aClass342_1.method7444());
		}
		this.aClass1_Sub6_Sub1_1.method6576(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)I")
	public int method3518() {
		return this.anInt4354;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IB)V")
	private void method3519(@OriginalArg(0) int arg0) {
		for (@Pc(20) Class1_Sub5 local20 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2547(); local20 != null; local20 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2554()) {
			if (arg0 < 0 || arg0 == local20.anInt305) {
				if (local20.aClass1_Sub6_Sub4_3 != null) {
					local20.aClass1_Sub6_Sub4_3.method6611(Static304.anInt5650 / 100);
					if (local20.aClass1_Sub6_Sub4_3.method6584()) {
						this.aClass1_Sub6_Sub1_1.aClass1_Sub6_Sub3_1.method6530(local20.aClass1_Sub6_Sub4_3);
					}
					local20.method248();
				}
				if (local20.anInt301 < 0) {
					this.aClass1_Sub5ArrayArray1[local20.anInt305][local20.anInt290] = null;
				}
				local20.method7908();
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
	private void method3520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray229[arg0] = arg1;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!nfa;IZ)V")
	public synchronized void method3521(@OriginalArg(0) Class1_Sub36 arg0, @OriginalArg(2) boolean arg1) {
		this.method3503(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(IZI)V")
	public synchronized void method3522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.anIntArray228[local9] = arg1;
			}
		} else {
			this.anIntArray228[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IJLclient!nfa;ZZ)V")
	public synchronized void method3523(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub36 arg1, @OriginalArg(4) boolean arg2) {
		this.method3503(arg1, true, arg2);
		this.method3510(arg0 * (long) this.aClass342_1.anInt9124);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBI)V")
	private void method3524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray227[arg0] = arg1;
		this.anIntArray238[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "()Lclient!jc;")
	@Override
	public synchronized Class1_Sub6 method6578() {
		return null;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(II)V")
	private void method3525(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3513(local16, local22, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method3529(local22, local16, local28);
			} else {
				this.method3513(local16, local22, 64);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3517(local16, local22, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray234[local16] = (local28 << 14) + (this.anIntArray234[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray234[local16] = (this.anIntArray234[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray232[local16] = (this.anIntArray232[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray232[local16] = (this.anIntArray232[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray241[local16] = (this.anIntArray241[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray241[local16] = local28 + (this.anIntArray241[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray233[local16] = (local28 << 7) + (this.anIntArray233[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray233[local16] = (this.anIntArray233[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray226[local16] = (this.anIntArray226[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray226[local16] = (this.anIntArray226[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray236[local16] = (local28 << 7) + (this.anIntArray236[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray236[local16] = local28 + (this.anIntArray236[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray239[local16] |= 0x1;
				} else {
					this.anIntArray239[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method3511(local16);
					this.anIntArray239[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray239[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray231[local16] = (local28 << 7) + (this.anIntArray231[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray231[local16] = local28 + (this.anIntArray231[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray231[local16] = (this.anIntArray231[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray231[local16] = local28 + (this.anIntArray231[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method3519(local16);
			}
			if (local22 == 121) {
				this.method3509(local16);
			}
			if (local22 == 123) {
				this.method3515(local16);
			}
			@Pc(499) int local499;
			if (local22 == 6) {
				local499 = this.anIntArray231[local16];
				if (local499 == 16384) {
					this.anIntArray230[local16] = (local28 << 7) + (this.anIntArray230[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local499 = this.anIntArray231[local16];
				if (local499 == 16384) {
					this.anIntArray230[local16] = local28 + (this.anIntArray230[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray240[local16] = (this.anIntArray240[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray240[local16] = local28 + (this.anIntArray240[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray239[local16] |= 0x4;
				} else {
					this.method3532(local16);
					this.anIntArray239[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method3524(local16, (this.anIntArray227[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method3524(local16, local28 + (this.anIntArray227[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3533(local16, local22 + this.anIntArray234[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3536(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method3520(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method3535(true);
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "(I)V")
	public synchronized void method3526() {
		for (@Pc(16) Class1_Sub48 local16 = (Class1_Sub48) this.aClass91_17.method2278(); local16 != null; local16 = (Class1_Sub48) this.aClass91_17.method2276()) {
			local16.method7551();
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V")
	public synchronized void method3527() {
		this.method3534(true);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ag;Z)I")
	private int method3528(@OriginalArg(0) Class1_Sub5 arg0) {
		if (this.anIntArray228[arg0.anInt305] == 0) {
			return 0;
		}
		@Pc(17) Class309 local17 = arg0.aClass309_1;
		@Pc(38) int local38 = this.anIntArray236[arg0.anInt305] * this.anIntArray233[arg0.anInt305] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = local46 * arg0.anInt307 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt4354 * local55 + 128 >> 8;
		local38 = local64 * this.anIntArray228[arg0.anInt305] + 128 >> 8;
		if (local17.anInt8189 > 0) {
			local38 = (int) ((double) local38 * Math.pow(0.5D, (double) arg0.anInt291 * 1.953125E-5D * (double) local17.anInt8189) + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local17.aByteArray86 != null) {
			local106 = arg0.anInt306;
			local114 = local17.aByteArray86[arg0.anInt297 + 1];
			if (arg0.anInt297 < local17.aByteArray86.length - 2) {
				local132 = (local17.aByteArray86[arg0.anInt297] & 0xFF) << 8;
				local144 = (local17.aByteArray86[arg0.anInt297 + 2] & 0xFF) << 8;
				local114 += (local17.aByteArray86[arg0.anInt297 + 3] - local114) * (-local132 + local106) / (local144 - local132);
			}
			local38 = local114 * local38 + 32 >> 6;
		}
		if (arg0.anInt301 > 0 && local17.aByteArray85 != null) {
			local106 = arg0.anInt301;
			local114 = local17.aByteArray85[arg0.anInt298 + 1];
			if (arg0.anInt298 < local17.aByteArray85.length - 2) {
				local132 = (local17.aByteArray85[arg0.anInt298] & 0xFF) << 8;
				local144 = (local17.aByteArray85[arg0.anInt298 + 2] & 0xFF) << 8;
				local114 += (local17.aByteArray85[arg0.anInt298 + 3] - local114) * (local106 + -local132) / (local144 - local132);
			}
			local38 = local38 * local114 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIZI)V")
	private void method3529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method3513(arg1, arg0, 64);
		if ((this.anIntArray239[arg1] & 0x2) != 0) {
			for (@Pc(34) Class1_Sub5 local34 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2544(); local34 != null; local34 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2551()) {
				if (local34.anInt305 == arg1 && local34.anInt301 < 0) {
					this.aClass1_Sub5ArrayArray1[arg1][local34.anInt290] = null;
					this.aClass1_Sub5ArrayArray1[arg1][arg0] = local34;
					@Pc(69) int local69 = (local34.anInt299 * local34.anInt296 >> 12) + local34.anInt288;
					local34.anInt288 += arg0 - local34.anInt290 << 8;
					local34.anInt296 = local69 - local34.anInt288;
					local34.anInt290 = arg0;
					local34.anInt299 = 4096;
					return;
				}
			}
		}
		@Pc(113) Class1_Sub48 local113 = (Class1_Sub48) this.aClass91_17.method2271((long) this.anIntArray235[arg1]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class1_Sub13_Sub1 local121 = local113.aClass1_Sub13_Sub1Array1[arg0];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class1_Sub5 local128 = new Class1_Sub5();
		local128.aClass1_Sub48_1 = local113;
		local128.anInt305 = arg1;
		local128.aClass1_Sub13_Sub1_3 = local121;
		local128.aClass309_1 = local113.aClass309Array1[arg0];
		local128.anInt293 = local113.aByteArray93[arg0];
		local128.anInt290 = arg0;
		local128.anInt307 = local113.anInt9272 * arg2 * arg2 * local113.aByteArray95[arg0] + 1024 >> 11;
		local128.anInt304 = local113.aByteArray94[arg0] & 0xFF;
		local128.anInt288 = (arg0 << 8) - (local113.aShortArray136[arg0] & 0x7FFF);
		local128.anInt306 = 0;
		local128.anInt298 = 0;
		local128.anInt291 = 0;
		local128.anInt301 = -1;
		local128.anInt297 = 0;
		if (this.anIntArray240[arg1] == 0) {
			local128.aClass1_Sub6_Sub4_3 = Static605.method6617(local121, this.method3507(local128), this.method3528(local128), this.method3516(local128));
		} else {
			local128.aClass1_Sub6_Sub4_3 = Static605.method6617(local121, this.method3507(local128), 0, this.method3516(local128));
			this.method3506(local113.aShortArray136[arg0] < 0, local128);
		}
		if (local113.aShortArray136[arg0] < 0) {
			local128.aClass1_Sub6_Sub4_3.method6620(-1);
		}
		if (local128.anInt293 >= 0) {
			@Pc(282) Class1_Sub5 local282 = this.aClass1_Sub5ArrayArray2[arg1][local128.anInt293];
			if (local282 != null && local282.anInt301 < 0) {
				this.aClass1_Sub5ArrayArray1[arg1][local282.anInt290] = null;
				local282.anInt301 = 0;
			}
			this.aClass1_Sub5ArrayArray2[arg1][local128.anInt293] = local128;
		}
		this.aClass1_Sub6_Sub1_1.aClass111_1.method2552(local128);
		this.aClass1_Sub5ArrayArray1[arg1][arg0] = local128;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ag;[IIII)Z")
	public boolean method3530(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt289 = Static304.anInt5650 / 100;
		if (arg0.anInt301 >= 0 && (arg0.aClass1_Sub6_Sub4_3 == null || arg0.aClass1_Sub6_Sub4_3.method6608())) {
			arg0.method248();
			arg0.method7908();
			if (arg0.anInt293 > 0 && arg0 == this.aClass1_Sub5ArrayArray2[arg0.anInt305][arg0.anInt293]) {
				this.aClass1_Sub5ArrayArray2[arg0.anInt305][arg0.anInt293] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt299;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray241[arg0.anInt305] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt299 = local56;
		}
		arg0.aClass1_Sub6_Sub4_3.method6597(this.method3507(arg0));
		@Pc(93) Class309 local93 = arg0.aClass309_1;
		arg0.anInt303 += local93.anInt8194;
		arg0.anInt295++;
		@Pc(108) boolean local108 = false;
		@Pc(132) double local132 = (double) ((arg0.anInt290 - 60 << 8) + (arg0.anInt296 * arg0.anInt299 >> 12)) * 5.086263020833333E-6D;
		if (local93.anInt8189 > 0) {
			if (local93.anInt8195 > 0) {
				arg0.anInt291 += (int) (Math.pow(2.0D, local132 * (double) local93.anInt8195) * 128.0D + 0.5D);
			} else {
				arg0.anInt291 += 128;
			}
			if (local93.anInt8189 * arg0.anInt291 >= 819200) {
				local108 = true;
			}
		}
		if (local93.aByteArray86 != null) {
			if (local93.anInt8198 > 0) {
				arg0.anInt306 += (int) (Math.pow(2.0D, local132 * (double) local93.anInt8198) * 128.0D + 0.5D);
			} else {
				arg0.anInt306 += 128;
			}
			while (arg0.anInt297 < local93.aByteArray86.length - 2 && (local93.aByteArray86[arg0.anInt297 + 2] & 0xFF) << 8 < arg0.anInt306) {
				arg0.anInt297 += 2;
			}
			if (arg0.anInt297 == local93.aByteArray86.length - 2 && local93.aByteArray86[arg0.anInt297 + 1] == 0) {
				local108 = true;
			}
		}
		if (arg0.anInt301 >= 0 && local93.aByteArray85 != null && (this.anIntArray239[arg0.anInt305] & 0x1) == 0 && (arg0.anInt293 < 0 || this.aClass1_Sub5ArrayArray2[arg0.anInt305][arg0.anInt293] != arg0)) {
			if (local93.anInt8196 > 0) {
				arg0.anInt301 += (int) (Math.pow(2.0D, (double) local93.anInt8196 * local132) * 128.0D + 0.5D);
			} else {
				arg0.anInt301 += 128;
			}
			while (arg0.anInt298 < local93.aByteArray85.length - 2 && arg0.anInt301 > (local93.aByteArray85[arg0.anInt298 + 2] & 0xFF) << 8) {
				arg0.anInt298 += 2;
			}
			if (local93.aByteArray85.length - 2 == arg0.anInt298) {
				local108 = true;
			}
		}
		if (!local108) {
			arg0.aClass1_Sub6_Sub4_3.method6599(arg0.anInt289, this.method3528(arg0), this.method3516(arg0));
			return false;
		}
		arg0.aClass1_Sub6_Sub4_3.method6611(arg0.anInt289);
		if (arg1 == null) {
			arg0.aClass1_Sub6_Sub4_3.method6579(arg2);
		} else {
			arg0.aClass1_Sub6_Sub4_3.method6576(arg1, arg3, arg2);
		}
		if (arg0.aClass1_Sub6_Sub4_3.method6584()) {
			this.aClass1_Sub6_Sub1_1.aClass1_Sub6_Sub3_1.method6530(arg0.aClass1_Sub6_Sub4_3);
		}
		arg0.method248();
		if (arg0.anInt301 >= 0) {
			arg0.method7908();
			if (arg0.anInt293 > 0 && arg0 == this.aClass1_Sub5ArrayArray2[arg0.anInt305][arg0.anInt293]) {
				this.aClass1_Sub5ArrayArray2[arg0.anInt305][arg0.anInt293] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(B)Z")
	public synchronized boolean method3531() {
		return this.aClass342_1.method7444();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6579(@OriginalArg(0) int arg0) {
		if (this.aClass342_1.method7444()) {
			@Pc(14) int local14 = this.aClass342_1.anInt9124 * this.anInt4377 / Static304.anInt5650;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong111;
				if (this.aLong110 - local23 >= 0L) {
					this.aLong111 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong110 - this.aLong111 - 1L) / (long) local14);
				this.aLong111 += (long) local14 * (long) local51;
				arg0 -= local51;
				this.aClass1_Sub6_Sub1_1.method6579(local51);
				this.method3508();
			} while (this.aClass342_1.method7444());
		}
		this.aClass1_Sub6_Sub1_1.method6579(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZ)V")
	private void method3532(@OriginalArg(0) int arg0) {
		if ((this.anIntArray239[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub5 local19 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2547(); local19 != null; local19 = (Class1_Sub5) this.aClass1_Sub6_Sub1_1.aClass111_1.method2554()) {
			if (local19.anInt305 == arg0) {
				local19.anInt302 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(III)V")
	private void method3533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray235[arg0]) {
			this.anIntArray235[arg0] = arg1;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass1_Sub5ArrayArray2[arg0][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZI)V")
	private synchronized void method3534(@OriginalArg(0) boolean arg0) {
		this.aClass342_1.method7447();
		this.aClass1_Sub36_1 = null;
		this.method3535(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "()I")
	@Override
	public synchronized int method6580() {
		return 0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZB)V")
	private void method3535(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method3519(-1);
		} else {
			this.method3515(-1);
		}
		this.method3509(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray235[local29] = this.anIntArray237[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray234[local45] = this.anIntArray237[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(IZI)V")
	private void method3536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BII)V")
	private void method3537() {
		this.anIntArray237[9] = 128;
		this.anIntArray234[9] = 128;
		this.method3533(9, 128);
	}
}
