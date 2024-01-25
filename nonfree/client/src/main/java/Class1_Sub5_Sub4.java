import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub5_Sub4 extends Class1_Sub5 {

	@OriginalMember(owner = "client!qe", name = "Mb", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!qe", name = "Nb", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!qe", name = "Ob", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!qe", name = "Rb", descriptor = "I")
	private int anInt5646;

	@OriginalMember(owner = "client!qe", name = "Sb", descriptor = "I")
	private int anInt5647;

	@OriginalMember(owner = "client!qe", name = "Tb", descriptor = "Lclient!qj;")
	private Class1_Sub33 aClass1_Sub33_4;

	@OriginalMember(owner = "client!qe", name = "Ub", descriptor = "Z")
	private boolean aBoolean454;

	@OriginalMember(owner = "client!qe", name = "Vb", descriptor = "I")
	private int anInt5648;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "[I")
	private final int[] anIntArray429 = new int[16];

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
	private final int anInt5620 = 1000000;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "[I")
	private final int[] anIntArray427 = new int[16];

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
	private int anInt5602 = 256;

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "[I")
	private final int[] anIntArray430 = new int[16];

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "[I")
	private final int[] anIntArray428 = new int[16];

	@OriginalMember(owner = "client!qe", name = "ib", descriptor = "[I")
	public final int[] anIntArray432 = new int[16];

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "[[Lclient!dg;")
	private final Class1_Sub10[][] aClass1_Sub10ArrayArray2 = new Class1_Sub10[16][128];

	@OriginalMember(owner = "client!qe", name = "nb", descriptor = "[I")
	public final int[] anIntArray434 = new int[16];

	@OriginalMember(owner = "client!qe", name = "kb", descriptor = "[I")
	private final int[] anIntArray433 = new int[16];

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "[I")
	private final int[] anIntArray425 = new int[16];

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "[I")
	public final int[] anIntArray426 = new int[16];

	@OriginalMember(owner = "client!qe", name = "qb", descriptor = "[I")
	private final int[] anIntArray435 = new int[16];

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "[I")
	private final int[] anIntArray424 = new int[16];

	@OriginalMember(owner = "client!qe", name = "zb", descriptor = "[I")
	private final int[] anIntArray437 = new int[16];

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "[I")
	private final int[] anIntArray431 = new int[16];

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "[[Lclient!dg;")
	private final Class1_Sub10[][] aClass1_Sub10ArrayArray1 = new Class1_Sub10[16][128];

	@OriginalMember(owner = "client!qe", name = "vb", descriptor = "[I")
	private final int[] anIntArray436 = new int[16];

	@OriginalMember(owner = "client!qe", name = "Gb", descriptor = "[I")
	private final int[] anIntArray438 = new int[16];

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!qe", name = "pb", descriptor = "Lclient!wj;")
	private final Class263 aClass263_1 = new Class263();

	@OriginalMember(owner = "client!qe", name = "Pb", descriptor = "Lclient!he;")
	private final Class1_Sub5_Sub3 aClass1_Sub5_Sub3_1 = new Class1_Sub5_Sub3(this);

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "Lclient!cv;")
	private final Class51 aClass51_19 = new Class51(128);

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub4() {
		this.method4460();
		this.method4472(true);
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Z")
	public synchronized boolean method4449() {
		return this.aClass263_1.method5935();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z[ILclient!dg;II)Z")
	public boolean method4450(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt1257 = Static3.anInt61 / 100;
		if (arg1.anInt1252 >= 0 && (arg1.aClass1_Sub5_Sub2_1 == null || arg1.aClass1_Sub5_Sub2_1.method1983())) {
			arg1.method1014();
			arg1.method5965();
			if (arg1.anInt1250 > 0 && arg1 == this.aClass1_Sub10ArrayArray2[arg1.anInt1254][arg1.anInt1250]) {
				this.aClass1_Sub10ArrayArray2[arg1.anInt1254][arg1.anInt1250] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg1.anInt1249;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.lb[arg1.anInt1254] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg1.anInt1249 = local59;
		}
		arg1.aClass1_Sub5_Sub2_1.method1997(this.method4465(arg1));
		@Pc(102) Class168 local102 = arg1.aClass168_1;
		@Pc(104) boolean local104 = false;
		arg1.anInt1263++;
		arg1.anInt1259 += local102.anInt4374;
		@Pc(135) double local135 = (double) ((arg1.anInt1247 * arg1.anInt1249 >> 12) + (arg1.anInt1264 - 60 << 8)) * 5.086263020833333E-6D;
		if (local102.anInt4367 > 0) {
			if (local102.anInt4371 > 0) {
				arg1.anInt1260 += (int) (Math.pow(2.0D, (double) local102.anInt4371 * local135) * 128.0D + 0.5D);
			} else {
				arg1.anInt1260 += 128;
			}
			if (arg1.anInt1260 * local102.anInt4367 >= 819200) {
				local104 = true;
			}
		}
		if (local102.aByteArray51 != null) {
			if (local102.anInt4368 > 0) {
				arg1.anInt1258 += (int) (Math.pow(2.0D, local135 * (double) local102.anInt4368) * 128.0D + 0.5D);
			} else {
				arg1.anInt1258 += 128;
			}
			while (arg1.anInt1256 < local102.aByteArray51.length - 2 && arg1.anInt1258 > (local102.aByteArray51[arg1.anInt1256 + 2] & 0xFF) << 8) {
				arg1.anInt1256 += 2;
			}
			if (local102.aByteArray51.length - 2 == arg1.anInt1256 && local102.aByteArray51[arg1.anInt1256 + 1] == 0) {
				local104 = true;
			}
		}
		if (arg1.anInt1252 >= 0 && local102.aByteArray50 != null && (this.anIntArray426[arg1.anInt1254] & 0x1) == 0 && (arg1.anInt1250 < 0 || arg1 != this.aClass1_Sub10ArrayArray2[arg1.anInt1254][arg1.anInt1250])) {
			if (local102.anInt4369 > 0) {
				arg1.anInt1252 += (int) (Math.pow(2.0D, (double) local102.anInt4369 * local135) * 128.0D + 0.5D);
			} else {
				arg1.anInt1252 += 128;
			}
			while (local102.aByteArray50.length - 2 > arg1.anInt1255 && (local102.aByteArray50[arg1.anInt1255 + 2] & 0xFF) << 8 < arg1.anInt1252) {
				arg1.anInt1255 += 2;
			}
			if (local102.aByteArray50.length - 2 == arg1.anInt1255) {
				local104 = true;
			}
		}
		if (!local104) {
			arg1.aClass1_Sub5_Sub2_1.method1986(arg1.anInt1257, this.method4485(arg1), this.method4486(arg1));
			return false;
		}
		arg1.aClass1_Sub5_Sub2_1.method1968(arg1.anInt1257);
		if (arg0 == null) {
			arg1.aClass1_Sub5_Sub2_1.method4445(arg2);
		} else {
			arg1.aClass1_Sub5_Sub2_1.method4446(arg0, arg3, arg2);
		}
		if (arg1.aClass1_Sub5_Sub2_1.method1989()) {
			this.aClass1_Sub5_Sub3_1.aClass1_Sub5_Sub1_1.method422(arg1.aClass1_Sub5_Sub2_1);
		}
		arg1.method1014();
		if (arg1.anInt1252 >= 0) {
			arg1.method5965();
			if (arg1.anInt1250 > 0 && this.aClass1_Sub10ArrayArray2[arg1.anInt1254][arg1.anInt1250] == arg1) {
				this.aClass1_Sub10ArrayArray2[arg1.anInt1254][arg1.anInt1250] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
	public synchronized void method4451() {
		for (@Pc(15) Class1_Sub24 local15 = (Class1_Sub24) this.aClass51_19.method928(); local15 != null; local15 = (Class1_Sub24) this.aClass51_19.method926()) {
			local15.method5965();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZLclient!qj;)V")
	public synchronized void method4452(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		this.method4476(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIII)V")
	private void method4453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	private void method4454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray435[arg0] = arg1;
		this.anIntArray432[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V")
	private void method4455(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub10 local16 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3199(); local16 != null; local16 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3198()) {
			if ((arg0 < 0 || local16.anInt1254 == arg0) && local16.anInt1252 < 0) {
				this.aClass1_Sub10ArrayArray1[local16.anInt1254][local16.anInt1264] = null;
				local16.anInt1252 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!dg;I)V")
	public void method4456(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub10 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub6_Sub1_1.aByteArray6.length;
		@Pc(40) int local40;
		if (arg0 && arg1.aClass1_Sub6_Sub1_1.aBoolean57) {
			@Pc(27) int local27 = local8 + local8 - arg1.aClass1_Sub6_Sub1_1.anInt645;
			local40 = (int) ((long) local27 * (long) this.anIntArray434[arg1.anInt1254] >> 6);
			local8 <<= 0x8;
			if (local8 <= local40) {
				local40 = local8 + local8 - local40 - 1;
				arg1.aClass1_Sub5_Sub2_1.method1982();
			}
		} else {
			local40 = (int) ((long) this.anIntArray434[arg1.anInt1254] * (long) local8 >> 6);
		}
		arg1.aClass1_Sub5_Sub2_1.method1976(local40);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
	@Override
	public synchronized int method4441() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!dg;)Z")
	public boolean method4457(@OriginalArg(1) Class1_Sub10 arg0) {
		if (arg0.aClass1_Sub5_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt1252 >= 0) {
			arg0.method5965();
			if (arg0.anInt1250 > 0 && this.aClass1_Sub10ArrayArray2[arg0.anInt1254][arg0.anInt1250] == arg0) {
				this.aClass1_Sub10ArrayArray2[arg0.anInt1254][arg0.anInt1250] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)V")
	private void method4458() {
		this.anIntArray425[9] = 128;
		this.anIntArray429[9] = 128;
		this.method4471(128, 9);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)V")
	private void method4459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)V")
	private synchronized void method4460() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray431[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!hh;ILclient!uh;Lclient!qj;)Z")
	public synchronized boolean method4461(@OriginalArg(1) Class109 arg0, @OriginalArg(3) Class240 arg1, @OriginalArg(4) Class1_Sub33 arg2) {
		arg2.method4743();
		@Pc(9) boolean local9 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class1_Sub30 local27 = (Class1_Sub30) arg2.aClass51_20.method928(); local27 != null; local27 = (Class1_Sub30) arg2.aClass51_20.method926()) {
			@Pc(33) int local33 = (int) local27.aLong237;
			@Pc(41) Class1_Sub24 local41 = (Class1_Sub24) this.aClass51_19.method930((long) local33);
			if (local41 == null) {
				local41 = Static32.method456(arg0, local33);
				if (local41 == null) {
					local9 = false;
					continue;
				}
				this.aClass51_19.method931(local41, (long) local33);
			}
			if (!local41.method2986(local21, local27.aByteArray55, arg1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method4742();
		}
		return local9;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	private void method4462(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4462(local12);
			}
			return;
		}
		this.anIntArray433[arg0] = 12800;
		this.anIntArray438[arg0] = 8192;
		this.anIntArray424[arg0] = 16383;
		this.anIntArray430[arg0] = 8192;
		this.anIntArray436[arg0] = 0;
		this.lb[arg0] = 8192;
		this.method4479(arg0);
		this.method4463(arg0);
		this.anIntArray426[arg0] = 0;
		this.anIntArray437[arg0] = 32767;
		this.anIntArray427[arg0] = 256;
		this.anIntArray434[arg0] = 0;
		this.method4454(arg0, 8192);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
	private void method4463(@OriginalArg(1) int arg0) {
		if ((this.anIntArray426[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class1_Sub10 local23 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3199(); local23 != null; local23 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3198()) {
			if (local23.anInt1254 == arg0) {
				local23.anInt1251 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()Lclient!ei;")
	@Override
	public synchronized Class1_Sub5 method4447() {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!dg;I)I")
	private int method4465(@OriginalArg(0) Class1_Sub10 arg0) {
		@Pc(15) int local15 = arg0.anInt1262 + (arg0.anInt1249 * arg0.anInt1247 >> 12);
		local15 += (this.anIntArray430[arg0.anInt1254] - 8192) * this.anIntArray427[arg0.anInt1254] >> 12;
		@Pc(43) Class168 local43 = arg0.aClass168_1;
		@Pc(63) int local63;
		if (local43.anInt4374 > 0 && (local43.anInt4372 > 0 || this.anIntArray436[arg0.anInt1254] > 0)) {
			local63 = local43.anInt4372 << 2;
			@Pc(68) int local68 = local43.anInt4370 << 1;
			if (local68 > arg0.anInt1263) {
				local63 = local63 * arg0.anInt1263 / local68;
			}
			local63 += this.anIntArray436[arg0.anInt1254] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt1259 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local63 * local98);
		}
		local63 = (int) ((double) (arg0.aClass1_Sub6_Sub1_1.anInt643 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static3.anInt61 + 0.5D);
		return local63 >= 1 ? local63 : 1;
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)V")
	public synchronized void method4466() {
		for (@Pc(15) Class1_Sub24 local15 = (Class1_Sub24) this.aClass51_19.method928(); local15 != null; local15 = (Class1_Sub24) this.aClass51_19.method926()) {
			local15.method2987();
		}
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V")
	private void method4467() {
		@Pc(12) int local12 = this.anInt5646;
		@Pc(15) int local15 = this.anInt5647;
		@Pc(18) long local18 = this.aLong164;
		if (this.aClass1_Sub33_4 != null && this.anInt5648 == local15) {
			this.method4476(this.aBoolean454, this.aClass1_Sub33_4, this.aBoolean453);
			this.method4467();
			return;
		}
		while (local15 == this.anInt5647) {
			while (local15 == this.aClass263_1.anIntArray580[local12]) {
				this.aClass263_1.method5933(local12);
				@Pc(51) int local51 = this.aClass263_1.method5923(local12);
				if (local51 == 1) {
					this.aClass263_1.method5932();
					this.aClass263_1.method5925(local12);
					if (this.aClass263_1.method5931()) {
						if (this.aClass1_Sub33_4 != null) {
							this.method4452(this.aBoolean453, this.aClass1_Sub33_4);
							this.method4467();
							return;
						}
						if (!this.aBoolean453 || local15 == 0) {
							this.method4472(true);
							this.aClass263_1.method5926();
							return;
						}
						this.aClass263_1.method5936(local18);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method4470(local51);
				}
				this.aClass263_1.method5938(local12);
				this.aClass263_1.method5925(local12);
			}
			local12 = this.aClass263_1.method5930();
			local15 = this.aClass263_1.anIntArray580[local12];
			local18 = this.aClass263_1.method5927(local15);
		}
		this.anInt5646 = local12;
		this.anInt5647 = local15;
		this.aLong164 = local18;
		if (this.aClass1_Sub33_4 != null && local15 > this.anInt5648) {
			this.anInt5647 = this.anInt5648;
			this.anInt5646 = -1;
			this.aLong164 = this.aClass263_1.method5927(this.anInt5647);
		}
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)I")
	public int method4468() {
		return this.anInt5602;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)V")
	private void method4470(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 & 0xF0;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (local14 == 128) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			local33 = arg0 >> 16 & 0x7F;
			this.method4483(local33, local27, local21);
		} else if (local14 == 144) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			local33 = arg0 >> 16 & 0x7F;
			if (local33 <= 0) {
				this.method4483(64, local27, local21);
			} else {
				this.method4474(local33, local21, local27);
			}
		} else if (local14 == 160) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			local33 = arg0 >> 16 & 0x7F;
			this.method4453(local33, local27, local21);
		} else if (local14 == 176) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			local33 = arg0 >> 16 & 0x7F;
			if (local27 == 0) {
				this.anIntArray429[local21] = (local33 << 14) + (this.anIntArray429[local21] & 0xFFE03FFF);
			}
			if (local27 == 32) {
				this.anIntArray429[local21] = (local33 << 7) + (this.anIntArray429[local21] & 0xFFFFC07F);
			}
			if (local27 == 1) {
				this.anIntArray436[local21] = (local33 << 7) + (this.anIntArray436[local21] & 0xFFFFC07F);
			}
			if (local27 == 33) {
				this.anIntArray436[local21] = (this.anIntArray436[local21] & 0xFFFFFF80) + local33;
			}
			if (local27 == 5) {
				this.lb[local21] = (local33 << 7) + (this.lb[local21] & 0xFFFFC07F);
			}
			if (local27 == 37) {
				this.lb[local21] = (this.lb[local21] & 0xFFFFFF80) + local33;
			}
			if (local27 == 7) {
				this.anIntArray433[local21] = (this.anIntArray433[local21] & 0xFFFFC07F) + (local33 << 7);
			}
			if (local27 == 39) {
				this.anIntArray433[local21] = (this.anIntArray433[local21] & 0xFFFFFF80) + local33;
			}
			if (local27 == 10) {
				this.anIntArray438[local21] = (this.anIntArray438[local21] & 0xFFFFC07F) + (local33 << 7);
			}
			if (local27 == 42) {
				this.anIntArray438[local21] = local33 + (this.anIntArray438[local21] & 0xFFFFFF80);
			}
			if (local27 == 11) {
				this.anIntArray424[local21] = (local33 << 7) + (this.anIntArray424[local21] & 0xFFFFC07F);
			}
			if (local27 == 43) {
				this.anIntArray424[local21] = local33 + (this.anIntArray424[local21] & 0xFFFFFF80);
			}
			if (local27 == 64) {
				if (local33 < 64) {
					this.anIntArray426[local21] &= 0xFFFFFFFE;
				} else {
					this.anIntArray426[local21] |= 0x1;
				}
			}
			if (local27 == 65) {
				if (local33 >= 64) {
					this.anIntArray426[local21] |= 0x2;
				} else {
					this.method4479(local21);
					this.anIntArray426[local21] &= 0xFFFFFFFD;
				}
			}
			if (local27 == 99) {
				this.anIntArray437[local21] = (local33 << 7) + (this.anIntArray437[local21] & 0x7F);
			}
			if (local27 == 98) {
				this.anIntArray437[local21] = local33 + (this.anIntArray437[local21] & 0x3F80);
			}
			if (local27 == 101) {
				this.anIntArray437[local21] = (local33 << 7) + (this.anIntArray437[local21] & 0x7F) + 16384;
			}
			if (local27 == 100) {
				this.anIntArray437[local21] = (this.anIntArray437[local21] & 0x3F80) + local33 + 16384;
			}
			if (local27 == 120) {
				this.method4481(local21);
			}
			if (local27 == 121) {
				this.method4462(local21);
			}
			if (local27 == 123) {
				this.method4455(local21);
			}
			@Pc(504) int local504;
			if (local27 == 6) {
				local504 = this.anIntArray437[local21];
				if (local504 == 16384) {
					this.anIntArray427[local21] = (local33 << 7) + (this.anIntArray427[local21] & 0xFFFFC07F);
				}
			}
			if (local27 == 38) {
				local504 = this.anIntArray437[local21];
				if (local504 == 16384) {
					this.anIntArray427[local21] = (this.anIntArray427[local21] & 0xFFFFFF80) + local33;
				}
			}
			if (local27 == 16) {
				this.anIntArray434[local21] = (local33 << 7) + (this.anIntArray434[local21] & 0xFFFFC07F);
			}
			if (local27 == 48) {
				this.anIntArray434[local21] = local33 + (this.anIntArray434[local21] & 0xFFFFFF80);
			}
			if (local27 == 81) {
				if (local33 >= 64) {
					this.anIntArray426[local21] |= 0x4;
				} else {
					this.method4463(local21);
					this.anIntArray426[local21] &= 0xFFFFFFFB;
				}
			}
			if (local27 == 17) {
				this.method4454(local21, (local33 << 7) + (this.anIntArray435[local21] & 0xFFFFC07F));
			}
			if (local27 == 49) {
				this.method4454(local21, (this.anIntArray435[local21] & 0xFFFFFF80) + local33);
			}
		} else if (local14 == 192) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			this.method4471(this.anIntArray429[local21] + local27, local21);
		} else if (local14 == 208) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			this.method4459(local27, local21);
		} else if (local14 == 224) {
			local21 = arg0 & 0xF;
			local27 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00CC) >> 9);
			this.method4480(local21, local27);
		} else {
			local14 = arg0 & 0xFF;
			if (local14 == 255) {
				this.method4472(true);
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(III)V")
	private void method4471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray428[arg1]) {
			this.anIntArray428[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass1_Sub10ArrayArray2[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass263_1.method5935()) {
			@Pc(14) int local14 = this.anInt5620 * this.aClass263_1.anInt7703 / Static3.anInt61;
			do {
				@Pc(23) long local23 = this.aLong165 + (long) local14 * (long) arg2;
				if (this.aLong164 - local23 >= 0L) {
					this.aLong165 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong164 - this.aLong165 - 1L) / (long) local14);
				this.aLong165 += (long) local14 * (long) local52;
				this.aClass1_Sub5_Sub3_1.method4446(arg0, arg1, local52);
				this.method4467();
				arg1 += local52;
				arg2 -= local52;
			} while (this.aClass263_1.method5935());
		}
		this.aClass1_Sub5_Sub3_1.method4446(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZB)V")
	private void method4472(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4481(-1);
		} else {
			this.method4455(-1);
		}
		this.method4462(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray428[local29] = this.anIntArray425[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray429[local45] = this.anIntArray425[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	public synchronized void method4473(@OriginalArg(1) int arg0) {
		this.anInt5602 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZI)V")
	private void method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4483(64, arg2, arg1);
		if ((this.anIntArray426[arg1] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub10 local25 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3202(); local25 != null; local25 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3211()) {
				if (local25.anInt1254 == arg1 && local25.anInt1252 < 0) {
					this.aClass1_Sub10ArrayArray1[arg1][local25.anInt1264] = null;
					this.aClass1_Sub10ArrayArray1[arg1][arg2] = local25;
					@Pc(64) int local64 = (local25.anInt1249 * local25.anInt1247 >> 12) + local25.anInt1262;
					local25.anInt1262 += arg2 - local25.anInt1264 << 8;
					local25.anInt1264 = arg2;
					local25.anInt1249 = 4096;
					local25.anInt1247 = local64 - local25.anInt1262;
					return;
				}
			}
		}
		@Pc(109) Class1_Sub24 local109 = (Class1_Sub24) this.aClass51_19.method930((long) this.anIntArray428[arg1]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class1_Sub6_Sub1 local117 = local109.aClass1_Sub6_Sub1Array1[arg2];
		if (local117 == null) {
			return;
		}
		@Pc(124) Class1_Sub10 local124 = new Class1_Sub10();
		local124.aClass1_Sub6_Sub1_1 = local117;
		local124.aClass1_Sub24_1 = local109;
		local124.anInt1254 = arg1;
		local124.aClass168_1 = local109.aClass168Array1[arg2];
		local124.anInt1250 = local109.aByteArray37[arg2];
		local124.anInt1264 = arg2;
		local124.anInt1248 = local109.aByteArray39[arg2] * arg0 * arg0 * local109.anInt3483 + 1024 >> 11;
		local124.anInt1253 = local109.aByteArray38[arg2] & 0xFF;
		local124.anInt1262 = (arg2 << 8) - (local109.aShortArray55[arg2] & 0x7FFF);
		local124.anInt1258 = 0;
		local124.anInt1252 = -1;
		local124.anInt1256 = 0;
		local124.anInt1260 = 0;
		local124.anInt1255 = 0;
		if (this.anIntArray434[arg1] == 0) {
			local124.aClass1_Sub5_Sub2_1 = Static460.method2005(local117, this.method4465(local124), this.method4485(local124), this.method4486(local124));
		} else {
			local124.aClass1_Sub5_Sub2_1 = Static460.method2005(local117, this.method4465(local124), 0, this.method4486(local124));
			this.method4456(local109.aShortArray55[arg2] < 0, local124);
		}
		if (local109.aShortArray55[arg2] < 0) {
			local124.aClass1_Sub5_Sub2_1.method1972(-1);
		}
		if (local124.anInt1250 >= 0) {
			@Pc(274) Class1_Sub10 local274 = this.aClass1_Sub10ArrayArray2[arg1][local124.anInt1250];
			if (local274 != null && local274.anInt1252 < 0) {
				this.aClass1_Sub10ArrayArray1[arg1][local274.anInt1264] = null;
				local274.anInt1252 = 0;
			}
			this.aClass1_Sub10ArrayArray2[arg1][local124.anInt1250] = local124;
		}
		this.aClass1_Sub5_Sub3_1.aClass142_18.method3212(local124);
		this.aClass1_Sub10ArrayArray1[arg1][arg2] = local124;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(III)V")
	public synchronized void method4475() {
		this.method4458();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()Lclient!ei;")
	@Override
	public synchronized Class1_Sub5 method4442() {
		return this.aClass1_Sub5_Sub3_1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZLclient!qj;Z)V")
	private synchronized void method4476(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub33 arg1, @OriginalArg(3) boolean arg2) {
		this.method4478(arg0);
		this.aClass263_1.method5934(arg1.aByteArray66);
		this.aBoolean453 = arg2;
		this.aLong165 = 0L;
		@Pc(24) int local24 = this.aClass263_1.method5928();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass263_1.method5933(local26);
			this.aClass263_1.method5938(local26);
			this.aClass263_1.method5925(local26);
		}
		this.anInt5646 = this.aClass263_1.method5930();
		this.anInt5647 = this.aClass263_1.anIntArray580[this.anInt5646];
		this.aLong164 = this.aClass263_1.method5927(this.anInt5647);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(ZI)V")
	private synchronized void method4478(@OriginalArg(0) boolean arg0) {
		this.aClass263_1.method5926();
		this.aClass1_Sub33_4 = null;
		this.method4472(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)V")
	private void method4479(@OriginalArg(1) int arg0) {
		if ((this.anIntArray426[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub10 local19 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3199(); local19 != null; local19 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3198()) {
			if (arg0 == local19.anInt1254 && this.aClass1_Sub10ArrayArray1[arg0][local19.anInt1264] == null && local19.anInt1252 < 0) {
				local19.anInt1252 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4445(@OriginalArg(0) int arg0) {
		if (this.aClass263_1.method5935()) {
			@Pc(18) int local18 = this.anInt5620 * this.aClass263_1.anInt7703 / Static3.anInt61;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong165;
				if (this.aLong164 - local27 >= 0L) {
					this.aLong165 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong164 + (long) local18 - this.aLong165 - 1L) / (long) local18);
				this.aLong165 += (long) local18 * (long) local57;
				this.aClass1_Sub5_Sub3_1.method4445(local57);
				arg0 -= local57;
				this.method4467();
			} while (this.aClass263_1.method5935());
		}
		this.aClass1_Sub5_Sub3_1.method4445(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(III)V")
	private void method4480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray430[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IB)V")
	private void method4481(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub10 local16 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3199(); local16 != null; local16 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3198()) {
			if (arg0 < 0 || local16.anInt1254 == arg0) {
				if (local16.aClass1_Sub5_Sub2_1 != null) {
					local16.aClass1_Sub5_Sub2_1.method1968(Static3.anInt61 / 100);
					if (local16.aClass1_Sub5_Sub2_1.method1989()) {
						this.aClass1_Sub5_Sub3_1.aClass1_Sub5_Sub1_1.method422(local16.aClass1_Sub5_Sub2_1);
					}
					local16.method1014();
				}
				if (local16.anInt1252 < 0) {
					this.aClass1_Sub10ArrayArray1[local16.anInt1254][local16.anInt1264] = null;
				}
				local16.method5965();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIII)V")
	private void method4483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class1_Sub10 local23 = this.aClass1_Sub10ArrayArray1[arg2][arg1];
		if (local23 == null) {
			return;
		}
		this.aClass1_Sub10ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray426[arg2] & 0x2) == 0) {
			local23.anInt1252 = 0;
			return;
		}
		for (@Pc(47) Class1_Sub10 local47 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3199(); local47 != null; local47 = (Class1_Sub10) this.aClass1_Sub5_Sub3_1.aClass142_18.method3198()) {
			if (local47.anInt1254 == local23.anInt1254 && local47.anInt1252 < 0 && local23 != local47) {
				local23.anInt1252 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "(I)V")
	public synchronized void method4484() {
		this.method4478(true);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(ILclient!dg;)I")
	private int method4485(@OriginalArg(1) Class1_Sub10 arg0) {
		if (this.anIntArray431[arg0.anInt1254] == 0) {
			return 0;
		}
		@Pc(14) Class168 local14 = arg0.aClass168_1;
		@Pc(30) int local30 = this.anIntArray433[arg0.anInt1254] * this.anIntArray424[arg0.anInt1254] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt1248 * local38 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt5602 * local47 + 128 >> 8;
		local30 = local56 * this.anIntArray431[arg0.anInt1254] + 128 >> 8;
		if (local14.anInt4367 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt1260 * 1.953125E-5D * (double) local14.anInt4367) * (double) local30 + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(124) int local124;
		@Pc(136) int local136;
		if (local14.aByteArray51 != null) {
			local98 = arg0.anInt1258;
			local106 = local14.aByteArray51[arg0.anInt1256 + 1];
			if (local14.aByteArray51.length - 2 > arg0.anInt1256) {
				local124 = (local14.aByteArray51[arg0.anInt1256] & 0xFF) << 8;
				local136 = (local14.aByteArray51[arg0.anInt1256 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (-local106 + local14.aByteArray51[arg0.anInt1256 - -3]) / (local136 - local124);
			}
			local30 = local30 * local106 + 32 >> 6;
		}
		if (arg0.anInt1252 > 0 && local14.aByteArray50 != null) {
			local98 = arg0.anInt1252;
			local106 = local14.aByteArray50[arg0.anInt1255 + 1];
			if (arg0.anInt1255 < local14.aByteArray50.length - 2) {
				local124 = (local14.aByteArray50[arg0.anInt1255] & 0xFF) << 8;
				local136 = (local14.aByteArray50[arg0.anInt1255 + 2] & 0xFF) << 8;
				local106 += (local14.aByteArray50[arg0.anInt1255 + 3] - local106) * (-local124 + local98) / (local136 - local124);
			}
			local30 = local30 * local106 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(ILclient!dg;)I")
	private int method4486(@OriginalArg(1) Class1_Sub10 arg0) {
		@Pc(9) int local9 = this.anIntArray438[arg0.anInt1254];
		return local9 >= 8192 ? 16384 - ((16384 - local9) * (-arg0.anInt1253 + 128) + 32 >> 6) : local9 * arg0.anInt1253 - -32 >> 6;
	}
}
