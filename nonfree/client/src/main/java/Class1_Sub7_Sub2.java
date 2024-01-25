import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub7_Sub2 extends Class1_Sub7 {

	@OriginalMember(owner = "client!bh", name = "Cb", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!bh", name = "Db", descriptor = "I")
	private int anInt597;

	@OriginalMember(owner = "client!bh", name = "Eb", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!bh", name = "Fb", descriptor = "Z")
	private boolean aBoolean53;

	@OriginalMember(owner = "client!bh", name = "Gb", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!bh", name = "Ib", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!bh", name = "Jb", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!bh", name = "Kb", descriptor = "Lclient!hfa;")
	private Class1_Sub23 aClass1_Sub23_1;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "[I")
	public final int[] anIntArray64 = new int[16];

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "[[Lclient!hb;")
	private final Class1_Sub21[][] aClass1_Sub21ArrayArray1 = new Class1_Sub21[16][128];

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "[I")
	private final int[] anIntArray67 = new int[16];

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "[I")
	private final int[] anIntArray70 = new int[16];

	@OriginalMember(owner = "client!bh", name = "hb", descriptor = "[I")
	private final int[] anIntArray71 = new int[16];

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "[I")
	private final int[] anIntArray63 = new int[16];

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "[I")
	private final int[] anIntArray65 = new int[16];

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "[I")
	private final int[] anIntArray66 = new int[16];

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
	private int anInt563 = 256;

	@OriginalMember(owner = "client!bh", name = "ob", descriptor = "[I")
	private final int[] anIntArray73 = new int[16];

	@OriginalMember(owner = "client!bh", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "[I")
	private final int[] anIntArray68 = new int[16];

	@OriginalMember(owner = "client!bh", name = "ub", descriptor = "[[Lclient!hb;")
	private final Class1_Sub21[][] aClass1_Sub21ArrayArray2 = new Class1_Sub21[16][128];

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "[I")
	public final int[] anIntArray69 = new int[16];

	@OriginalMember(owner = "client!bh", name = "vb", descriptor = "[I")
	private final int[] anIntArray75 = new int[16];

	@OriginalMember(owner = "client!bh", name = "sb", descriptor = "[I")
	private final int[] anIntArray74 = new int[16];

	@OriginalMember(owner = "client!bh", name = "kb", descriptor = "[I")
	public final int[] anIntArray72 = new int[16];

	@OriginalMember(owner = "client!bh", name = "Ab", descriptor = "[I")
	private final int[] anIntArray76 = new int[16];

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	private final int anInt559 = 1000000;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "[I")
	private final int[] anIntArray62 = new int[16];

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "Lclient!cea;")
	private final Class49 aClass49_1 = new Class49();

	@OriginalMember(owner = "client!bh", name = "Hb", descriptor = "Lclient!gv;")
	private final Class1_Sub7_Sub3 aClass1_Sub7_Sub3_1 = new Class1_Sub7_Sub3(this);

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "Lclient!kea;")
	private final Class187 aClass187_6 = new Class187(128);

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class1_Sub7_Sub2() {
		this.method530();
		this.method519(true);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6132(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass49_1.method987()) {
			@Pc(14) int local14 = this.anInt559 * this.aClass49_1.anInt1058 / Class1_Sub30_Sub1.lb;
			do {
				@Pc(24) long local24 = this.aLong31 + (long) local14 * (long) arg2;
				if (this.aLong30 - local24 >= 0L) {
					this.aLong31 = local24;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong30 + (long) local14 - this.aLong31 - 1L) / (long) local14);
				this.aLong31 += (long) local55 * (long) local14;
				this.aClass1_Sub7_Sub3_1.method6132(arg0, arg1, local55);
				arg1 += local55;
				arg2 -= local55;
				this.method501();
			} while (this.aClass49_1.method987());
		}
		this.aClass1_Sub7_Sub3_1.method6132(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
	private void method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class1_Sub21 local18 = this.aClass1_Sub21ArrayArray1[arg2][arg0];
		if (local18 == null) {
			return;
		}
		this.aClass1_Sub21ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray64[arg2] & 0x2) == 0) {
			local18.anInt3181 = 0;
			return;
		}
		for (@Pc(42) Class1_Sub21 local42 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7677(); local42 != null; local42 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7687()) {
			if (local42.anInt3168 == local18.anInt3168 && local42.anInt3181 < 0 && local42 != local18) {
				local18.anInt3181 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	private void method501() {
		@Pc(8) int local8 = this.anInt598;
		@Pc(11) int local11 = this.anInt597;
		@Pc(14) long local14 = this.aLong30;
		if (this.aClass1_Sub23_1 != null && local11 == this.anInt599) {
			this.method535(this.aClass1_Sub23_1, this.aBoolean54, this.aBoolean53);
			this.method501();
			return;
		}
		while (local11 == this.anInt597) {
			while (local11 == this.aClass49_1.anIntArray107[local8]) {
				this.aClass49_1.method986(local8);
				@Pc(43) int local43 = this.aClass49_1.method993(local8);
				if (local43 == 1) {
					this.aClass49_1.method989();
					this.aClass49_1.method979(local8);
					if (this.aClass49_1.method990()) {
						if (this.aClass1_Sub23_1 != null) {
							this.method528(this.aClass1_Sub23_1, this.aBoolean53);
							this.method501();
							return;
						}
						if (!this.aBoolean53 || local11 == 0) {
							this.method519(true);
							this.aClass49_1.method982();
							return;
						}
						this.aClass49_1.method994(local14);
					}
					break;
				}
				if ((local43 & 0x80) != 0) {
					this.method514(local43);
				}
				this.aClass49_1.method985(local8);
				this.aClass49_1.method979(local8);
			}
			local8 = this.aClass49_1.method984();
			local11 = this.aClass49_1.anIntArray107[local8];
			local14 = this.aClass49_1.method980(local11);
		}
		this.aLong30 = local14;
		this.anInt598 = local8;
		this.anInt597 = local11;
		if (this.aClass1_Sub23_1 != null && this.anInt599 < local11) {
			this.anInt597 = this.anInt599;
			this.anInt598 = -1;
			this.aLong30 = this.aClass49_1.method980(this.anInt597);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)V")
	private void method502() {
		this.anIntArray70[9] = 128;
		this.anIntArray63[9] = 128;
		this.method518(128, 9);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V")
	private void method504(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub21 local12 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7677(); local12 != null; local12 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7687()) {
			if (arg0 < 0 || arg0 == local12.anInt3168) {
				if (local12.aClass1_Sub7_Sub4_2 != null) {
					local12.aClass1_Sub7_Sub4_2.method6142(Class1_Sub30_Sub1.lb / 100);
					if (local12.aClass1_Sub7_Sub4_2.method6175()) {
						this.aClass1_Sub7_Sub3_1.aClass1_Sub7_Sub1_1.method470(local12.aClass1_Sub7_Sub4_2);
					}
					local12.method2553();
				}
				if (local12.anInt3181 < 0) {
					this.aClass1_Sub21ArrayArray1[local12.anInt3168][local12.anInt3177] = null;
				}
				local12.method7859();
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!hb;B)I")
	private int method505(@OriginalArg(0) Class1_Sub21 arg0) {
		@Pc(14) int local14 = (arg0.anInt3167 * arg0.anInt3166 >> 12) + arg0.anInt3182;
		local14 += this.anIntArray75[arg0.anInt3168] * (this.anIntArray62[arg0.anInt3168] - 8192) >> 12;
		@Pc(43) Class62 local43 = arg0.aClass62_1;
		@Pc(60) int local60;
		if (local43.anInt1426 > 0 && (local43.anInt1419 > 0 || this.lb[arg0.anInt3168] > 0)) {
			local60 = local43.anInt1419 << 2;
			@Pc(65) int local65 = local43.anInt1421 << 1;
			if (arg0.anInt3173 < local65) {
				local60 = arg0.anInt3173 * local60 / local65;
			}
			local60 += this.lb[arg0.anInt3168] >> 7;
			@Pc(95) double local95 = Math.sin((double) (arg0.anInt3172 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local60 * local95);
		}
		local60 = (int) ((double) (arg0.aClass1_Sub17_Sub1_2.anInt5538 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Class1_Sub30_Sub1.lb + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!hb;I)Z")
	public boolean method506(@OriginalArg(0) Class1_Sub21 arg0) {
		if (arg0.aClass1_Sub7_Sub4_2 != null) {
			return false;
		}
		if (arg0.anInt3181 >= 0) {
			arg0.method7859();
			if (arg0.anInt3184 > 0 && arg0 == this.aClass1_Sub21ArrayArray2[arg0.anInt3168][arg0.anInt3184]) {
				this.aClass1_Sub21ArrayArray2[arg0.anInt3168][arg0.anInt3184] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLclient!hb;Z)V")
	public void method507(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass1_Sub17_Sub1_2.aByteArray67.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass1_Sub17_Sub1_2.aBoolean445) {
			@Pc(42) int local42 = local12 + local12 - arg0.aClass1_Sub17_Sub1_2.anInt5539;
			local31 = (int) ((long) this.anIntArray69[arg0.anInt3168] * (long) local42 >> 6);
			local12 <<= 0x8;
			if (local12 <= local31) {
				local31 = local12 + local12 - local31 - 1;
				arg0.aClass1_Sub7_Sub4_2.method6149();
			}
		} else {
			local31 = (int) ((long) this.anIntArray69[arg0.anInt3168] * (long) local12 >> 6);
		}
		arg0.aClass1_Sub7_Sub4_2.method6171(local31);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method508() {
		return this.aClass49_1.method987();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	private void method509(@OriginalArg(1) int arg0) {
		if ((this.anIntArray64[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub21 local19 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7677(); local19 != null; local19 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7687()) {
			if (arg0 == local19.anInt3168) {
				local19.anInt3174 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(BI)V")
	private void method510(@OriginalArg(1) int arg0) {
		if ((this.anIntArray64[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class1_Sub21 local23 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7677(); local23 != null; local23 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7687()) {
			if (arg0 == local23.anInt3168 && this.aClass1_Sub21ArrayArray1[arg0][local23.anInt3177] == null && local23.anInt3181 < 0) {
				local23.anInt3181 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!hb;ZI[I)Z")
	public boolean method511(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub21 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1.anInt3175 = Class1_Sub30_Sub1.lb / 100;
		if (arg1.anInt3181 >= 0 && (arg1.aClass1_Sub7_Sub4_2 == null || arg1.aClass1_Sub7_Sub4_2.method6162())) {
			arg1.method2553();
			arg1.method7859();
			if (arg1.anInt3184 > 0 && arg1 == this.aClass1_Sub21ArrayArray2[arg1.anInt3168][arg1.anInt3184]) {
				this.aClass1_Sub21ArrayArray2[arg1.anInt3168][arg1.anInt3184] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt3166;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray73[arg1.anInt3168] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt3166 = local56;
		}
		arg1.aClass1_Sub7_Sub4_2.method6154(this.method505(arg1));
		@Pc(96) Class62 local96 = arg1.aClass62_1;
		arg1.anInt3173++;
		arg1.anInt3172 += local96.anInt1426;
		@Pc(111) boolean local111 = false;
		@Pc(129) double local129 = (double) ((arg1.anInt3166 * arg1.anInt3167 >> 12) + (arg1.anInt3177 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt1418 > 0) {
			if (local96.anInt1427 <= 0) {
				arg1.anInt3176 += 128;
			} else {
				arg1.anInt3176 += (int) (Math.pow(2.0D, (double) local96.anInt1427 * local129) * 128.0D + 0.5D);
			}
			if (local96.anInt1418 * arg1.anInt3176 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray11 != null) {
			if (local96.anInt1423 > 0) {
				arg1.anInt3179 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt1423) * 128.0D + 0.5D);
			} else {
				arg1.anInt3179 += 128;
			}
			while (local96.aByteArray11.length - 2 > arg1.anInt3171 && arg1.anInt3179 > (local96.aByteArray11[arg1.anInt3171 + 2] & 0xFF) << 8) {
				arg1.anInt3171 += 2;
			}
			if (arg1.anInt3171 == local96.aByteArray11.length - 2 && local96.aByteArray11[arg1.anInt3171 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg1.anInt3181 >= 0 && local96.aByteArray10 != null && (this.anIntArray64[arg1.anInt3168] & 0x1) == 0 && (arg1.anInt3184 < 0 || this.aClass1_Sub21ArrayArray2[arg1.anInt3168][arg1.anInt3184] != arg1)) {
			if (local96.anInt1420 > 0) {
				arg1.anInt3181 += (int) (Math.pow(2.0D, (double) local96.anInt1420 * local129) * 128.0D + 0.5D);
			} else {
				arg1.anInt3181 += 128;
			}
			while (local96.aByteArray10.length - 2 > arg1.anInt3180 && arg1.anInt3181 > (local96.aByteArray10[arg1.anInt3180 + 2] & 0xFF) << 8) {
				arg1.anInt3180 += 2;
			}
			if (local96.aByteArray10.length - 2 == arg1.anInt3180) {
				local111 = true;
			}
		}
		if (!local111) {
			arg1.aClass1_Sub7_Sub4_2.method6156(arg1.anInt3175, this.method533(arg1), this.method521(arg1));
			return false;
		}
		arg1.aClass1_Sub7_Sub4_2.method6142(arg1.anInt3175);
		if (arg3 == null) {
			arg1.aClass1_Sub7_Sub4_2.method6138(arg0);
		} else {
			arg1.aClass1_Sub7_Sub4_2.method6132(arg3, arg2, arg0);
		}
		if (arg1.aClass1_Sub7_Sub4_2.method6175()) {
			this.aClass1_Sub7_Sub3_1.aClass1_Sub7_Sub1_1.method470(arg1.aClass1_Sub7_Sub4_2);
		}
		arg1.method2553();
		if (arg1.anInt3181 >= 0) {
			arg1.method7859();
			if (arg1.anInt3184 > 0 && arg1 == this.aClass1_Sub21ArrayArray2[arg1.anInt3168][arg1.anInt3184]) {
				this.aClass1_Sub21ArrayArray2[arg1.anInt3168][arg1.anInt3184] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6138(@OriginalArg(0) int arg0) {
		if (this.aClass49_1.method987()) {
			@Pc(14) int local14 = this.anInt559 * this.aClass49_1.anInt1058 / Class1_Sub30_Sub1.lb;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong31;
				if (this.aLong30 - local23 >= 0L) {
					this.aLong31 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong30 + (long) local14 - this.aLong31 - 1L) / (long) local14);
				this.aLong31 += (long) local14 * (long) local53;
				this.aClass1_Sub7_Sub3_1.method6138(local53);
				arg0 -= local53;
				this.method501();
			} while (this.aClass49_1.method987());
		}
		this.aClass1_Sub7_Sub3_1.method6138(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(BI)V")
	private void method512(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class1_Sub21 local18 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7677(); local18 != null; local18 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7687()) {
			if ((arg0 < 0 || arg0 == local18.anInt3168) && local18.anInt3181 < 0) {
				this.aClass1_Sub21ArrayArray1[local18.anInt3168][local18.anInt3177] = null;
				local18.anInt3181 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	public synchronized void method513() {
		for (@Pc(11) Class1_Sub39 local11 = (Class1_Sub39) this.aClass187_6.method3799(); local11 != null; local11 = (Class1_Sub39) this.aClass187_6.method3805()) {
			local11.method7859();
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V")
	private void method514(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local17 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method500(local30, local36, local24);
		} else if (local17 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method517(local36, local30, local24);
			} else {
				this.method500(local30, 64, local24);
			}
		} else if (local17 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method524(local30, local24, local36);
		} else if (local17 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray63[local24] = (local36 << 14) + (this.anIntArray63[local24] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray63[local24] = (this.anIntArray63[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 1) {
				this.lb[local24] = (local36 << 7) + (this.lb[local24] & 0xFFFFC07F);
			}
			if (local30 == 33) {
				this.lb[local24] = local36 + (this.lb[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray73[local24] = (local36 << 7) + (this.anIntArray73[local24] & 0xFFFFC07F);
			}
			if (local30 == 37) {
				this.anIntArray73[local24] = local36 + (this.anIntArray73[local24] & 0xFFFFFF80);
			}
			if (local30 == 7) {
				this.anIntArray76[local24] = (local36 << 7) + (this.anIntArray76[local24] & 0xFFFFC07F);
			}
			if (local30 == 39) {
				this.anIntArray76[local24] = (this.anIntArray76[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 10) {
				this.anIntArray66[local24] = (local36 << 7) + (this.anIntArray66[local24] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray66[local24] = (this.anIntArray66[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 11) {
				this.anIntArray68[local24] = (local36 << 7) + (this.anIntArray68[local24] & 0xFFFFC07F);
			}
			if (local30 == 43) {
				this.anIntArray68[local24] = local36 + (this.anIntArray68[local24] & 0xFFFFFF80);
			}
			if (local30 == 64) {
				if (local36 < 64) {
					this.anIntArray64[local24] &= 0xFFFFFFFE;
				} else {
					this.anIntArray64[local24] |= 0x1;
				}
			}
			if (local30 == 65) {
				if (local36 < 64) {
					this.method510(local24);
					this.anIntArray64[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray64[local24] |= 0x2;
				}
			}
			if (local30 == 99) {
				this.anIntArray74[local24] = (local36 << 7) + (this.anIntArray74[local24] & 0x7F);
			}
			if (local30 == 98) {
				this.anIntArray74[local24] = (this.anIntArray74[local24] & 0x3F80) + local36;
			}
			if (local30 == 101) {
				this.anIntArray74[local24] = (local36 << 7) + (this.anIntArray74[local24] & 0x7F) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray74[local24] = local36 + (this.anIntArray74[local24] & 0x3F80) + 16384;
			}
			if (local30 == 120) {
				this.method504(local24);
			}
			if (local30 == 121) {
				this.method523(local24);
			}
			if (local30 == 123) {
				this.method512(local24);
			}
			@Pc(505) int local505;
			if (local30 == 6) {
				local505 = this.anIntArray74[local24];
				if (local505 == 16384) {
					this.anIntArray75[local24] = (this.anIntArray75[local24] & 0xFFFFC07F) + (local36 << 7);
				}
			}
			if (local30 == 38) {
				local505 = this.anIntArray74[local24];
				if (local505 == 16384) {
					this.anIntArray75[local24] = local36 + (this.anIntArray75[local24] & 0xFFFFFF80);
				}
			}
			if (local30 == 16) {
				this.anIntArray69[local24] = (local36 << 7) + (this.anIntArray69[local24] & 0xFFFFC07F);
			}
			if (local30 == 48) {
				this.anIntArray69[local24] = (this.anIntArray69[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 81) {
				if (local36 < 64) {
					this.method509(local24);
					this.anIntArray64[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray64[local24] |= 0x4;
				}
			}
			if (local30 == 17) {
				this.method529((local36 << 7) + (this.anIntArray71[local24] & 0xFFFFC07F), local24);
			}
			if (local30 == 49) {
				this.method529(local36 + (this.anIntArray71[local24] & 0xFFFFFF80), local24);
			}
		} else if (local17 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method518(local30 + this.anIntArray63[local24], local24);
		} else if (local17 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method522(local30, local24);
		} else if (local17 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method516(local24, local30);
		} else {
			local17 = arg0 & 0xFF;
			if (local17 == 255) {
				this.method519(true);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IBI)V")
	private void method516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray62[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIII)V")
	private void method517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method500(arg1, 64, arg2);
		if ((this.anIntArray64[arg2] & 0x2) != 0) {
			for (@Pc(27) Class1_Sub21 local27 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7676(); local27 != null; local27 = (Class1_Sub21) this.aClass1_Sub7_Sub3_1.aClass353_15.method7681()) {
				if (local27.anInt3168 == arg2 && local27.anInt3181 < 0) {
					this.aClass1_Sub21ArrayArray1[arg2][local27.anInt3177] = null;
					this.aClass1_Sub21ArrayArray1[arg2][arg1] = local27;
					@Pc(62) int local62 = (local27.anInt3167 * local27.anInt3166 >> 12) + local27.anInt3182;
					local27.anInt3182 += arg1 - local27.anInt3177 << 8;
					local27.anInt3177 = arg1;
					local27.anInt3167 = local62 - local27.anInt3182;
					local27.anInt3166 = 4096;
					return;
				}
			}
		}
		@Pc(108) Class1_Sub39 local108 = (Class1_Sub39) this.aClass187_6.method3797((long) this.anIntArray67[arg2]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class1_Sub17_Sub1 local116 = local108.aClass1_Sub17_Sub1Array1[arg1];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class1_Sub21 local123 = new Class1_Sub21();
		local123.anInt3168 = arg2;
		local123.aClass1_Sub39_1 = local108;
		local123.aClass1_Sub17_Sub1_2 = local116;
		local123.aClass62_1 = local108.aClass62Array1[arg1];
		local123.anInt3184 = local108.aByteArray80[arg1];
		local123.anInt3177 = arg1;
		local123.anInt3170 = arg0 * arg0 * local108.anInt6690 * local108.aByteArray81[arg1] + 1024 >> 11;
		local123.anInt3186 = local108.aByteArray79[arg1] & 0xFF;
		local123.anInt3182 = (arg1 << 8) - (local108.aShortArray110[arg1] & 0x7FFF);
		local123.anInt3181 = -1;
		local123.anInt3179 = 0;
		local123.anInt3176 = 0;
		local123.anInt3171 = 0;
		local123.anInt3180 = 0;
		if (this.anIntArray69[arg2] == 0) {
			local123.aClass1_Sub7_Sub4_2 = Static606.method6143(local116, this.method505(local123), this.method533(local123), this.method521(local123));
		} else {
			local123.aClass1_Sub7_Sub4_2 = Static606.method6143(local116, this.method505(local123), 0, this.method521(local123));
			this.method507(local123, local108.aShortArray110[arg1] < 0);
		}
		if (local108.aShortArray110[arg1] < 0) {
			local123.aClass1_Sub7_Sub4_2.method6178(-1);
		}
		if (local123.anInt3184 >= 0) {
			@Pc(287) Class1_Sub21 local287 = this.aClass1_Sub21ArrayArray2[arg2][local123.anInt3184];
			if (local287 != null && local287.anInt3181 < 0) {
				this.aClass1_Sub21ArrayArray1[arg2][local287.anInt3177] = null;
				local287.anInt3181 = 0;
			}
			this.aClass1_Sub21ArrayArray2[arg2][local123.anInt3184] = local123;
		}
		this.aClass1_Sub7_Sub3_1.aClass353_15.method7679(local123);
		this.aClass1_Sub21ArrayArray1[arg2][arg1] = local123;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	private void method518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray67[arg1] != arg0) {
			this.anIntArray67[arg1] = arg0;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass1_Sub21ArrayArray2[arg1][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)V")
	private void method519(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method504(-1);
		} else {
			this.method512(-1);
		}
		this.method523(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray67[local23] = this.anIntArray70[local23];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray63[local47] = this.anIntArray70[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public synchronized void method520() {
		this.method532(true);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lclient!hb;B)I")
	private int method521(@OriginalArg(0) Class1_Sub21 arg0) {
		@Pc(15) int local15 = this.anIntArray66[arg0.anInt3168];
		return local15 >= 8192 ? 16384 - ((16384 - local15) * (-arg0.anInt3186 + 128) + 32 >> 6) : arg0.anInt3186 * local15 - -32 >> 6;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()Lclient!pda;")
	@Override
	public synchronized Class1_Sub7 method6134() {
		return this.aClass1_Sub7_Sub3_1;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(IBI)V")
	private void method522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)V")
	private void method523(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method523(local12);
			}
			return;
		}
		this.anIntArray76[arg0] = 12800;
		this.anIntArray66[arg0] = 8192;
		this.anIntArray68[arg0] = 16383;
		this.anIntArray62[arg0] = 8192;
		this.lb[arg0] = 0;
		this.anIntArray73[arg0] = 8192;
		this.method510(arg0);
		this.method509(arg0);
		this.anIntArray64[arg0] = 0;
		this.anIntArray74[arg0] = 32767;
		this.anIntArray75[arg0] = 256;
		this.anIntArray69[arg0] = 0;
		this.method529(8192, arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIII)V")
	private void method524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLclient!ee;Lclient!pu;ILclient!hfa;)Z")
	public synchronized boolean method525(@OriginalArg(1) Class84 arg0, @OriginalArg(2) Class270 arg1, @OriginalArg(4) Class1_Sub23 arg2) {
		arg2.method2912();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub27 local29 = (Class1_Sub27) arg2.aClass187_14.method3799(); local29 != null; local29 = (Class1_Sub27) arg2.aClass187_14.method3805()) {
			@Pc(35) int local35 = (int) local29.aLong301;
			@Pc(43) Class1_Sub39 local43 = (Class1_Sub39) this.aClass187_6.method3797((long) local35);
			if (local43 == null) {
				local43 = Static104.method1719(arg1, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass187_6.method3795(local43, (long) local35);
			}
			if (!local43.method5353(arg0, local23, local29.aByteArray51)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method2913();
		}
		return local9;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)V")
	public synchronized void method526(@OriginalArg(0) int arg0) {
		this.anInt563 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()Lclient!pda;")
	@Override
	public synchronized Class1_Sub7 method6136() {
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)V")
	public synchronized void method527() {
		this.method502();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!hfa;Z)V")
	public synchronized void method528(@OriginalArg(1) Class1_Sub23 arg0, @OriginalArg(2) boolean arg1) {
		this.method535(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()I")
	@Override
	public synchronized int method6135() {
		return 0;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(III)V")
	private void method529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray71[arg1] = arg0;
		this.anIntArray72[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(IBI)V")
	private synchronized void method530() {
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray65[local20] = 256;
		}
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)I")
	public int method531() {
		return this.anInt563;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BZ)V")
	private synchronized void method532(@OriginalArg(1) boolean arg0) {
		this.aClass49_1.method982();
		this.aClass1_Sub23_1 = null;
		this.method519(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lclient!hb;I)I")
	private int method533(@OriginalArg(0) Class1_Sub21 arg0) {
		if (this.anIntArray65[arg0.anInt3168] == 0) {
			return 0;
		}
		@Pc(14) Class62 local14 = arg0.aClass62_1;
		@Pc(30) int local30 = this.anIntArray76[arg0.anInt3168] * this.anIntArray68[arg0.anInt3168] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt3170 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt563 * local47 + 128 >> 8;
		local30 = this.anIntArray65[arg0.anInt3168] * local64 + 128 >> 8;
		if (local14.anInt1418 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local14.anInt1418 * 1.953125E-5D * (double) arg0.anInt3176) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local14.aByteArray11 != null) {
			local103 = arg0.anInt3179;
			local111 = local14.aByteArray11[arg0.anInt3171 + 1];
			if (arg0.anInt3171 < local14.aByteArray11.length - 2) {
				local133 = (local14.aByteArray11[arg0.anInt3171] & 0xFF) << 8;
				local145 = (local14.aByteArray11[arg0.anInt3171 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (-local111 + local14.aByteArray11[arg0.anInt3171 + 3]) / (local145 - local133);
			}
			local30 = local111 * local30 + 32 >> 6;
		}
		if (arg0.anInt3181 > 0 && local14.aByteArray10 != null) {
			local103 = arg0.anInt3181;
			local111 = local14.aByteArray10[arg0.anInt3180 + 1];
			if (arg0.anInt3180 < local14.aByteArray10.length - 2) {
				local133 = (local14.aByteArray10[arg0.anInt3180] & 0xFF) << 8;
				local145 = (local14.aByteArray10[arg0.anInt3180 + 2] & 0xFF) << 8;
				local111 += (local14.aByteArray10[arg0.anInt3180 + 3] - local111) * (local103 + -local133) / (local145 - local133);
			}
			local30 = local30 * local111 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	public synchronized void method534() {
		for (@Pc(7) Class1_Sub39 local7 = (Class1_Sub39) this.aClass187_6.method3799(); local7 != null; local7 = (Class1_Sub39) this.aClass187_6.method3805()) {
			local7.method5354();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLclient!hfa;ZZ)V")
	private synchronized void method535(@OriginalArg(1) Class1_Sub23 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method532(arg1);
		this.aClass49_1.method983(arg0.aByteArray41);
		this.aLong31 = 0L;
		this.aBoolean53 = arg2;
		@Pc(28) int local28 = this.aClass49_1.method981();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass49_1.method986(local30);
			this.aClass49_1.method985(local30);
			this.aClass49_1.method979(local30);
		}
		this.anInt598 = this.aClass49_1.method984();
		this.anInt597 = this.aClass49_1.anIntArray107[this.anInt598];
		this.aLong30 = this.aClass49_1.method980(this.anInt597);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(JB)V")
	private void method536(@OriginalArg(0) long arg0) {
		while (this.aLong30 <= arg0) {
			@Pc(10) int local10 = this.anInt598;
			@Pc(13) int local13 = this.anInt597;
			@Pc(16) long local16 = this.aLong30;
			while (local13 == this.anInt597) {
				while (local13 == this.aClass49_1.anIntArray107[local10]) {
					this.aClass49_1.method986(local10);
					@Pc(27) int local27 = this.aClass49_1.method993(local10);
					if (local27 == 1) {
						this.aClass49_1.method989();
						this.aClass49_1.method979(local10);
						if (this.aClass49_1.method990()) {
							if (!this.aBoolean53 || local13 == 0) {
								this.method519(true);
								this.aClass49_1.method982();
								return;
							}
							this.aClass49_1.method994(local16);
						}
						break;
					}
					if ((local27 & 0x80) != 0 && (local27 & 0xF0) != 144) {
						this.method514(local27);
					}
					this.aClass49_1.method985(local10);
					this.aClass49_1.method979(local10);
				}
				this.aLong31 = local16;
				local10 = this.aClass49_1.method984();
				local13 = this.aClass49_1.anIntArray107[local10];
				local16 = this.aClass49_1.method980(local13);
			}
			this.anInt597 = local13;
			this.anInt598 = local10;
			this.aLong30 = local16;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZIJZLclient!hfa;)V")
	public synchronized void method537(@OriginalArg(0) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(4) Class1_Sub23 arg2) {
		this.method535(arg2, true, arg0);
		this.method536((long) this.aClass49_1.anInt1058 * arg1);
	}
}
