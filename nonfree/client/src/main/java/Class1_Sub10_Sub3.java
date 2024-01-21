import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub10_Sub3 extends Class1_Sub10 {

	@OriginalMember(owner = "client!ie", name = "Gb", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!ie", name = "Hb", descriptor = "Z")
	private boolean aBoolean70;

	@OriginalMember(owner = "client!ie", name = "Ib", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!ie", name = "Jb", descriptor = "I")
	private int anInt1806;

	@OriginalMember(owner = "client!ie", name = "Kb", descriptor = "I")
	private int anInt1807;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "[I")
	private final int[] anIntArray159 = new int[16];

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "[I")
	private final int[] anIntArray160 = new int[16];

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
	private final int[] anIntArray158 = new int[16];

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "[I")
	private final int[] anIntArray165 = new int[16];

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "[I")
	private final int[] anIntArray164 = new int[16];

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "[I")
	private final int[] anIntArray166 = new int[16];

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	private final int anInt1776 = 1000000;

	@OriginalMember(owner = "client!ie", name = "qb", descriptor = "[I")
	private final int[] anIntArray170 = new int[16];

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[I")
	private final int[] anIntArray157 = new int[16];

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "[I")
	private final int[] anIntArray169 = new int[16];

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "[[Lclient!a;")
	private final Class1_Sub1[][] aClass1_Sub1ArrayArray1 = new Class1_Sub1[16][128];

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "[I")
	public final int[] anIntArray163 = new int[16];

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
	private int anInt1780 = 256;

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "[I")
	public final int[] anIntArray167 = new int[16];

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "[I")
	public final int[] anIntArray168 = new int[16];

	@OriginalMember(owner = "client!ie", name = "Db", descriptor = "[I")
	private final int[] anIntArray172 = new int[16];

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "[I")
	private final int[] anIntArray162 = new int[16];

	@OriginalMember(owner = "client!ie", name = "Fb", descriptor = "[[Lclient!a;")
	private final Class1_Sub1[][] aClass1_Sub1ArrayArray2 = new Class1_Sub1[16][128];

	@OriginalMember(owner = "client!ie", name = "Cb", descriptor = "[I")
	private final int[] anIntArray171 = new int[16];

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "Lclient!kh;")
	private final Class50 aClass50_1 = new Class50();

	@OriginalMember(owner = "client!ie", name = "Lb", descriptor = "Lclient!fi;")
	private final Class1_Sub10_Sub2 aClass1_Sub10_Sub2_1 = new Class1_Sub10_Sub2(this);

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "Lclient!ah;")
	private final Class5 aClass5_6 = new Class5(128);

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class1_Sub10_Sub3() {
		this.method1297();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	private void method1292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray169[arg1] != arg0) {
			this.anIntArray169[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass1_Sub1ArrayArray2[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)V")
	public synchronized void method1293() {
		this.method1294();
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(III)V")
	private void method1294() {
		this.anIntArray164[9] = 128;
		this.anIntArray162[9] = 128;
		this.method1292(128, 9);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!a;Z)V")
	public void method1295(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass1_Sub11_Sub1_1.aByteArray4.length;
		@Pc(36) int local36;
		if (arg1 && arg0.aClass1_Sub11_Sub1_1.aBoolean27) {
			@Pc(23) int local23 = local8 + local8 - arg0.aClass1_Sub11_Sub1_1.anInt807;
			local36 = (int) ((long) this.anIntArray163[arg0.anInt17] * (long) local23 >> 6);
			local8 <<= 0x8;
			if (local36 >= local8) {
				local36 = local8 + local8 - local36 - 1;
				arg0.aClass1_Sub10_Sub4_1.method2454();
			}
		} else {
			local36 = (int) ((long) this.anIntArray163[arg0.anInt17] * (long) local8 >> 6);
		}
		arg0.aClass1_Sub10_Sub4_1.method2447(local36);
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(III)V")
	private void method1296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	private void method1297() {
		this.method1308(-1);
		this.method1321(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray169[local15] = this.anIntArray164[local15];
		}
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray162[local31] = this.anIntArray164[local31] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	public synchronized void method1298() {
		for (@Pc(7) Class1_Sub24 local7 = (Class1_Sub24) this.aClass5_6.method140(); local7 != null; local7 = (Class1_Sub24) this.aClass5_6.method132()) {
			local7.method3134();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
	private void method1299(@OriginalArg(1) int arg0) {
		if ((this.anIntArray167[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub1 local18 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1115(); local18 != null; local18 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1125()) {
			if (arg0 == local18.anInt17) {
				local18.anInt18 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
	private void method1300(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub1 local8 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1115(); local8 != null; local8 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1125()) {
			if ((arg0 < 0 || arg0 == local8.anInt17) && local8.anInt25 < 0) {
				this.aClass1_Sub1ArrayArray1[local8.anInt17][local8.anInt27] = null;
				local8.anInt25 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public synchronized void method1301() {
		for (@Pc(9) Class1_Sub24 local9 = (Class1_Sub24) this.aClass5_6.method140(); local9 != null; local9 = (Class1_Sub24) this.aClass5_6.method132()) {
			local9.method2907();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
	private void method1302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class1_Sub1 local12 = this.aClass1_Sub1ArrayArray1[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub1ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray167[arg2] & 0x2) == 0) {
			local12.anInt25 = 0;
			return;
		}
		for (@Pc(45) Class1_Sub1 local45 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1115(); local45 != null; local45 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1125()) {
			if (local45.anInt17 == local12.anInt17 && local45.anInt25 < 0 && local12 != local45) {
				local12.anInt25 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(III)V")
	private void method1303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray160[arg0] = arg1;
		this.anIntArray168[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!a;I)I")
	private int method1304(@OriginalArg(0) Class1_Sub1 arg0) {
		@Pc(17) int local17 = this.anIntArray159[arg0.anInt17];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt21) * (-local17 + 16384) + 32 >> 6) : arg0.anInt21 * local17 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)I")
	public int method1305() {
		return this.anInt1780;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIII)V")
	private void method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IB)V")
	private void method1307(@OriginalArg(0) int arg0) {
		if ((this.anIntArray167[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(26) Class1_Sub1 local26 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1115(); local26 != null; local26 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1125()) {
			if (arg0 == local26.anInt17 && this.aClass1_Sub1ArrayArray1[arg0][local26.anInt27] == null && local26.anInt25 < 0) {
				local26.anInt25 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	private void method1308(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub1 local8 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1115(); local8 != null; local8 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1125()) {
			if (arg0 < 0 || local8.anInt17 == arg0) {
				if (local8.aClass1_Sub10_Sub4_1 != null) {
					local8.aClass1_Sub10_Sub4_1.method2482(Static185.anInt3915 / 100);
					if (local8.aClass1_Sub10_Sub4_1.method2471()) {
						this.aClass1_Sub10_Sub2_1.aClass1_Sub10_Sub1_2.method454(local8.aClass1_Sub10_Sub4_1);
					}
					local8.method17();
				}
				if (local8.anInt25 < 0) {
					this.aClass1_Sub1ArrayArray1[local8.anInt17][local8.anInt27] = null;
				}
				local8.method3134();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	public synchronized void method1309(@OriginalArg(1) int arg0) {
		this.anInt1780 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[IIILclient!a;)Z")
	public boolean method1310(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1 arg3) {
		arg3.anInt31 = Static185.anInt3915 / 100;
		if (arg3.anInt25 >= 0 && (arg3.aClass1_Sub10_Sub4_1 == null || arg3.aClass1_Sub10_Sub4_1.method2460())) {
			arg3.method17();
			arg3.method3134();
			if (arg3.anInt16 > 0 && this.aClass1_Sub1ArrayArray2[arg3.anInt17][arg3.anInt16] == arg3) {
				this.aClass1_Sub1ArrayArray2[arg3.anInt17][arg3.anInt16] = null;
			}
			return true;
		}
		@Pc(60) boolean local60 = false;
		@Pc(63) int local63 = arg3.anInt33;
		if (local63 > 0) {
			local63 -= (int) (Math.pow(2.0D, (double) this.anIntArray158[arg3.anInt17] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local63 < 0) {
				local63 = 0;
			}
			arg3.anInt33 = local63;
		}
		arg3.aClass1_Sub10_Sub4_1.method2478(this.method1319(arg3));
		@Pc(118) double local118 = (double) ((arg3.anInt33 * arg3.anInt30 >> 12) + (arg3.anInt27 - 60 << 8)) * 5.086263020833333E-6D;
		arg3.anInt24++;
		@Pc(127) Class88 local127 = arg3.aClass88_1;
		arg3.anInt26 += local127.anInt4052;
		if (local127.anInt4045 > 0) {
			if (local127.anInt4050 <= 0) {
				arg3.anInt12 += 128;
			} else {
				arg3.anInt12 += (int) (Math.pow(2.0D, local118 * (double) local127.anInt4050) * 128.0D + 0.5D);
			}
			if (local127.anInt4045 * arg3.anInt12 >= 819200) {
				local60 = true;
			}
		}
		if (local127.aByteArray47 != null) {
			if (local127.anInt4047 <= 0) {
				arg3.anInt11 += 128;
			} else {
				arg3.anInt11 += (int) (Math.pow(2.0D, (double) local127.anInt4047 * local118) * 128.0D + 0.5D);
			}
			while (arg3.anInt23 < local127.aByteArray47.length - 2 && (local127.aByteArray47[arg3.anInt23 + 2] & 0xFF) << 8 < arg3.anInt11) {
				arg3.anInt23 += 2;
			}
			if (arg3.anInt23 == local127.aByteArray47.length - 2 && local127.aByteArray47[arg3.anInt23 + 1] == 0) {
				local60 = true;
			}
		}
		if (arg3.anInt25 >= 0 && local127.aByteArray48 != null && (this.anIntArray167[arg3.anInt17] & 0x1) == 0 && (arg3.anInt16 < 0 || arg3 != this.aClass1_Sub1ArrayArray2[arg3.anInt17][arg3.anInt16])) {
			if (local127.anInt4044 <= 0) {
				arg3.anInt25 += 128;
			} else {
				arg3.anInt25 += (int) (Math.pow(2.0D, (double) local127.anInt4044 * local118) * 128.0D + 0.5D);
			}
			while (arg3.anInt22 < local127.aByteArray48.length - 2 && (local127.aByteArray48[arg3.anInt22 + 2] & 0xFF) << 8 < arg3.anInt25) {
				arg3.anInt22 += 2;
			}
			if (local127.aByteArray48.length - 2 == arg3.anInt22) {
				local60 = true;
			}
		}
		if (!local60) {
			arg3.aClass1_Sub10_Sub4_1.method2477(arg3.anInt31, this.method1316(arg3), this.method1304(arg3));
			return false;
		}
		arg3.aClass1_Sub10_Sub4_1.method2482(arg3.anInt31);
		if (arg0 == null) {
			arg3.aClass1_Sub10_Sub4_1.method2438(arg2);
		} else {
			arg3.aClass1_Sub10_Sub4_1.method2442(arg0, arg1, arg2);
		}
		if (arg3.aClass1_Sub10_Sub4_1.method2471()) {
			this.aClass1_Sub10_Sub2_1.aClass1_Sub10_Sub1_2.method454(arg3.aClass1_Sub10_Sub4_1);
		}
		arg3.method17();
		if (arg3.anInt25 >= 0) {
			arg3.method3134();
			if (arg3.anInt16 > 0 && arg3 == this.aClass1_Sub1ArrayArray2[arg3.anInt17][arg3.anInt16]) {
				this.aClass1_Sub1ArrayArray2[arg3.anInt17][arg3.anInt16] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
	public synchronized void method1311() {
		this.aClass50_1.method1519();
		this.method1297();
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
	private void method1312() {
		@Pc(13) int local13 = this.anInt1806;
		@Pc(16) int local16 = this.anInt1807;
		@Pc(19) long local19 = this.aLong65;
		while (this.anInt1807 == local16) {
			while (local16 == this.aClass50_1.anIntArray225[local13]) {
				this.aClass50_1.method1522(local13);
				@Pc(30) int local30 = this.aClass50_1.method1528(local13);
				if (local30 == 1) {
					this.aClass50_1.method1524();
					this.aClass50_1.method1525(local13);
					if (this.aClass50_1.method1529()) {
						if (!this.aBoolean70 || local16 == 0) {
							this.method1297();
							this.aClass50_1.method1519();
							return;
						}
						this.aClass50_1.method1516(local19);
					}
					break;
				}
				if ((local30 & 0x80) != 0) {
					this.method1323(local30);
				}
				this.aClass50_1.method1515(local13);
				this.aClass50_1.method1525(local13);
			}
			local13 = this.aClass50_1.method1514();
			local16 = this.aClass50_1.anIntArray225[local13];
			local19 = this.aClass50_1.method1527(local16);
		}
		this.anInt1807 = local16;
		this.anInt1806 = local13;
		this.aLong65 = local19;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZZLclient!rd;)V")
	public synchronized void method1313(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		this.method1311();
		this.aClass50_1.method1520(arg1.aByteArray23);
		this.aBoolean70 = arg0;
		this.aLong64 = 0L;
		@Pc(23) int local23 = this.aClass50_1.method1521();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass50_1.method1522(local25);
			this.aClass50_1.method1515(local25);
			this.aClass50_1.method1525(local25);
		}
		this.anInt1806 = this.aClass50_1.method1514();
		this.anInt1807 = this.aClass50_1.anIntArray225[this.anInt1806];
		this.aLong65 = this.aClass50_1.method1527(this.anInt1807);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!a;)Z")
	public boolean method1315(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub10_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt25 >= 0) {
			arg0.method3134();
			if (arg0.anInt16 > 0 && this.aClass1_Sub1ArrayArray2[arg0.anInt17][arg0.anInt16] == arg0) {
				this.aClass1_Sub1ArrayArray2[arg0.anInt17][arg0.anInt16] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2436() {
		return 0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()Lclient!vh;")
	@Override
	public synchronized Class1_Sub10 method2439() {
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!a;I)I")
	private int method1316(@OriginalArg(0) Class1_Sub1 arg0) {
		@Pc(14) Class88 local14 = arg0.aClass88_1;
		@Pc(30) int local30 = this.anIntArray157[arg0.anInt17] * this.anIntArray172[arg0.anInt17] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt32 * local38 + 16384 >> 15;
		local30 = this.anInt1780 * local47 + 128 >> 8;
		if (local14.anInt4045 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local14.anInt4045 * (double) arg0.anInt12 * 1.953125E-5D) + 0.5D);
		}
		@Pc(91) int local91;
		@Pc(88) int local88;
		@Pc(113) int local113;
		@Pc(125) int local125;
		if (local14.aByteArray47 != null) {
			local88 = local14.aByteArray47[arg0.anInt23 + 1];
			local91 = arg0.anInt11;
			if (local14.aByteArray47.length - 2 > arg0.anInt23) {
				local113 = (local14.aByteArray47[arg0.anInt23] & 0xFF) << 8;
				local125 = (local14.aByteArray47[arg0.anInt23 + 2] & 0xFF) << 8;
				local88 += (local91 - local113) * (local14.aByteArray47[arg0.anInt23 + 3] - local88) / (local125 - local113);
			}
			local30 = local30 * local88 + 32 >> 6;
		}
		if (arg0.anInt25 > 0 && local14.aByteArray48 != null) {
			local91 = arg0.anInt25;
			local88 = local14.aByteArray48[arg0.anInt22 + 1];
			if (arg0.anInt22 < local14.aByteArray48.length - 2) {
				local113 = (local14.aByteArray48[arg0.anInt22] & 0xFF) << 8;
				local125 = (local14.aByteArray48[arg0.anInt22 + 2] & 0xFF) << 8;
				local88 += (local91 - local113) * (local14.aByteArray48[arg0.anInt22 + 3] - local88) / (local125 - local113);
			}
			local30 = local88 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIB)V")
	private void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1302(64, arg2, arg0);
		if ((this.anIntArray167[arg0] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub1 local25 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1123(); local25 != null; local25 = (Class1_Sub1) this.aClass1_Sub10_Sub2_1.aClass30_9.method1119()) {
				if (local25.anInt17 == arg0 && local25.anInt25 < 0) {
					this.aClass1_Sub1ArrayArray1[arg0][local25.anInt27] = null;
					this.aClass1_Sub1ArrayArray1[arg0][arg2] = local25;
					@Pc(60) int local60 = (local25.anInt33 * local25.anInt30 >> 12) + local25.anInt29;
					local25.anInt33 = 4096;
					local25.anInt29 += arg2 - local25.anInt27 << 8;
					local25.anInt30 = local60 - local25.anInt29;
					local25.anInt27 = arg2;
					return;
				}
			}
		}
		@Pc(108) Class1_Sub24 local108 = (Class1_Sub24) this.aClass5_6.method134((long) this.anIntArray169[arg0]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class1_Sub11_Sub1 local116 = local108.aClass1_Sub11_Sub1Array1[arg2];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class1_Sub1 local123 = new Class1_Sub1();
		local123.aClass1_Sub24_1 = local108;
		local123.aClass1_Sub11_Sub1_1 = local116;
		local123.anInt17 = arg0;
		local123.aClass88_1 = local108.aClass88Array1[arg2];
		local123.anInt16 = local108.aByteArray44[arg2];
		local123.anInt27 = arg2;
		local123.anInt32 = local108.aByteArray45[arg2] * arg1 * arg1 * local108.anInt3819 + 1024 >> 11;
		local123.anInt21 = local108.aByteArray43[arg2] & 0xFF;
		local123.anInt29 = (arg2 << 8) - (local108.aShortArray50[arg2] & 0x7FFF);
		local123.anInt23 = 0;
		local123.anInt22 = 0;
		local123.anInt12 = 0;
		local123.anInt11 = 0;
		local123.anInt25 = -1;
		if (this.anIntArray163[arg0] == 0) {
			local123.aClass1_Sub10_Sub4_1 = Static193.method2455(local116, this.method1319(local123), this.method1316(local123), this.method1304(local123));
		} else {
			local123.aClass1_Sub10_Sub4_1 = Static193.method2455(local116, this.method1319(local123), 0, this.method1304(local123));
			this.method1295(local123, local108.aShortArray50[arg2] < 0);
		}
		if (local108.aShortArray50[arg2] < 0) {
			local123.aClass1_Sub10_Sub4_1.method2461(-1);
		}
		if (local123.anInt16 >= 0) {
			@Pc(279) Class1_Sub1 local279 = this.aClass1_Sub1ArrayArray2[arg0][local123.anInt16];
			if (local279 != null && local279.anInt25 < 0) {
				this.aClass1_Sub1ArrayArray1[arg0][local279.anInt27] = null;
				local279.anInt25 = 0;
			}
			this.aClass1_Sub1ArrayArray2[arg0][local123.anInt16] = local123;
		}
		this.aClass1_Sub10_Sub2_1.aClass30_9.method1113(local123);
		this.aClass1_Sub1ArrayArray1[arg0][arg2] = local123;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)Z")
	public synchronized boolean method1318() {
		return this.aClass50_1.method1517();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2438(@OriginalArg(0) int arg0) {
		if (this.aClass50_1.method1517()) {
			@Pc(14) int local14 = this.aClass50_1.anInt1992 * this.anInt1776 / Static185.anInt3915;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong64;
				if (this.aLong65 - local23 >= 0L) {
					this.aLong64 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong65 + (long) local14 - this.aLong64 - 1L) / (long) local14);
				this.aLong64 += (long) local54 * (long) local14;
				this.aClass1_Sub10_Sub2_1.method2438(local54);
				arg0 -= local54;
				this.method1312();
			} while (this.aClass50_1.method1517());
		}
		this.aClass1_Sub10_Sub2_1.method2438(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ILclient!a;)I")
	private int method1319(@OriginalArg(1) Class1_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt29 + (arg0.anInt33 * arg0.anInt30 >> 12);
		local14 += (this.anIntArray171[arg0.anInt17] - 8192) * this.anIntArray165[arg0.anInt17] >> 12;
		@Pc(43) Class88 local43 = arg0.aClass88_1;
		@Pc(63) int local63;
		if (local43.anInt4052 > 0 && (local43.anInt4048 > 0 || this.anIntArray166[arg0.anInt17] > 0)) {
			local63 = local43.anInt4048 << 2;
			@Pc(68) int local68 = local43.anInt4049 << 1;
			if (local68 > arg0.anInt24) {
				local63 = arg0.anInt24 * local63 / local68;
			}
			local63 += this.anIntArray166[arg0.anInt17] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt26 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local102 * (double) local63);
		}
		local63 = (int) ((double) (arg0.aClass1_Sub11_Sub1_1.anInt805 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static185.anInt3915 + 0.5D);
		return local63 < 1 ? 1 : local63;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(BI)V")
	private void method1321(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1321(local12);
			}
			return;
		}
		this.anIntArray172[arg0] = 12800;
		this.anIntArray159[arg0] = 8192;
		this.anIntArray157[arg0] = 16383;
		this.anIntArray171[arg0] = 8192;
		this.anIntArray166[arg0] = 0;
		this.anIntArray158[arg0] = 8192;
		this.method1307(arg0);
		this.method1299(arg0);
		this.anIntArray167[arg0] = 0;
		this.anIntArray170[arg0] = 32767;
		this.anIntArray165[arg0] = 256;
		this.anIntArray163[arg0] = 0;
		this.method1303(arg0, 8192);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass50_1.method1517()) {
			@Pc(18) int local18 = this.aClass50_1.anInt1992 * this.anInt1776 / Static185.anInt3915;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong64;
				if (this.aLong65 - local27 >= 0L) {
					this.aLong64 = local27;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong65 + (long) local18 - this.aLong64 - 1L) / (long) local18);
				arg2 -= local55;
				this.aLong64 += (long) local55 * (long) local18;
				this.aClass1_Sub10_Sub2_1.method2442(arg0, arg1, local55);
				this.method1312();
				arg1 += local55;
			} while (this.aClass50_1.method1517());
		}
		this.aClass1_Sub10_Sub2_1.method2442(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(III)V")
	private void method1322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray171[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
	private void method1323(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1302(local28, local22, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method1302(64, local22, local16);
			} else {
				this.method1317(local16, local28, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1306(local28, local22, local16);
		} else if (local9 == 176) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray162[local16] = (this.anIntArray162[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray162[local16] = (this.anIntArray162[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray166[local16] = (local28 << 7) + (this.anIntArray166[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray166[local16] = local28 + (this.anIntArray166[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray158[local16] = (this.anIntArray158[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray158[local16] = (this.anIntArray158[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray172[local16] = (local28 << 7) + (this.anIntArray172[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray172[local16] = local28 + (this.anIntArray172[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray159[local16] = (local28 << 7) + (this.anIntArray159[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray159[local16] = (this.anIntArray159[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray157[local16] = (this.anIntArray157[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray157[local16] = (this.anIntArray157[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray167[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray167[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method1307(local16);
					this.anIntArray167[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray167[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray170[local16] = (this.anIntArray170[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray170[local16] = (this.anIntArray170[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray170[local16] = (local28 << 7) + (this.anIntArray170[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray170[local16] = (this.anIntArray170[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method1308(local16);
			}
			if (local22 == 121) {
				this.method1321(local16);
			}
			if (local22 == 123) {
				this.method1300(local16);
			}
			@Pc(498) int local498;
			if (local22 == 6) {
				local498 = this.anIntArray170[local16];
				if (local498 == 16384) {
					this.anIntArray165[local16] = (local28 << 7) + (this.anIntArray165[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local498 = this.anIntArray170[local16];
				if (local498 == 16384) {
					this.anIntArray165[local16] = (this.anIntArray165[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray163[local16] = (local28 << 7) + (this.anIntArray163[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray163[local16] = local28 + (this.anIntArray163[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method1299(local16);
					this.anIntArray167[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray167[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method1303(local16, (local28 << 7) + (this.anIntArray160[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method1303(local16, (this.anIntArray160[local16] & 0xFFFFFF80) + local28);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1292(local22 + this.anIntArray162[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1296(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F10) >> 8);
			this.method1322(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1297();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!rd;ZLclient!ag;Lclient!vb;)Z")
	public synchronized boolean method1324(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(3) Class4 arg1, @OriginalArg(4) Class82 arg2) {
		arg0.method2424();
		@Pc(9) boolean local9 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class1_Sub25 local34 = (Class1_Sub25) arg0.aClass5_9.method140(); local34 != null; local34 = (Class1_Sub25) arg0.aClass5_9.method132()) {
			@Pc(40) int local40 = (int) local34.aLong148;
			@Pc(48) Class1_Sub24 local48 = (Class1_Sub24) this.aClass5_6.method134((long) local40);
			if (local48 == null) {
				local48 = Static10.method183(arg2, local40);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass5_6.method138(local48, (long) local40);
			}
			if (!local48.method2909(arg1, local28, local34.aByteArray46)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method2425();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "()Lclient!vh;")
	@Override
	public synchronized Class1_Sub10 method2440() {
		return this.aClass1_Sub10_Sub2_1;
	}
}
