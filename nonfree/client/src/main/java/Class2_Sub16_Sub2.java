import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub16_Sub2 extends Class2_Sub16 {

	@OriginalMember(owner = "client!v", name = "Yb", descriptor = "Z")
	private boolean aBoolean114;

	@OriginalMember(owner = "client!v", name = "Zb", descriptor = "I")
	private int anInt2626;

	@OriginalMember(owner = "client!v", name = "ac", descriptor = "I")
	private int anInt2627;

	@OriginalMember(owner = "client!v", name = "bc", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!v", name = "cc", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "[I")
	private final int[] anIntArray374 = new int[16];

	@OriginalMember(owner = "client!v", name = "G", descriptor = "[I")
	private final int[] anIntArray373 = new int[16];

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "[I")
	public final int[] anIntArray376 = new int[16];

	@OriginalMember(owner = "client!v", name = "J", descriptor = "I")
	private int anInt2587 = 256;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "[I")
	private final int[] anIntArray375 = new int[16];

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
	private final int[] anIntArray380 = new int[16];

	@OriginalMember(owner = "client!v", name = "Cb", descriptor = "[[Lclient!ce;")
	private final Class2_Sub5[][] aClass2_Sub5ArrayArray2 = new Class2_Sub5[16][128];

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
	public final int[] anIntArray377 = new int[16];

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "[I")
	private final int[] anIntArray378 = new int[16];

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
	private final int[] anIntArray379 = new int[16];

	@OriginalMember(owner = "client!v", name = "vb", descriptor = "[I")
	private final int[] anIntArray381 = new int[16];

	@OriginalMember(owner = "client!v", name = "Hb", descriptor = "[I")
	private final int[] anIntArray385 = new int[16];

	@OriginalMember(owner = "client!v", name = "Eb", descriptor = "[I")
	private final int[] anIntArray383 = new int[16];

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "[[Lclient!ce;")
	private final Class2_Sub5[][] aClass2_Sub5ArrayArray1 = new Class2_Sub5[16][128];

	@OriginalMember(owner = "client!v", name = "Fb", descriptor = "[I")
	private final int[] anIntArray384 = new int[16];

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "[I")
	private final int[] anIntArray382 = new int[16];

	@OriginalMember(owner = "client!v", name = "Jb", descriptor = "[I")
	public final int[] anIntArray386 = new int[16];

	@OriginalMember(owner = "client!v", name = "Wb", descriptor = "[I")
	private final int[] anIntArray387 = new int[16];

	@OriginalMember(owner = "client!v", name = "D", descriptor = "Lclient!kd;")
	private final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!v", name = "dc", descriptor = "Lclient!wa;")
	private final Class2_Sub16_Sub4 aClass2_Sub16_Sub4_1 = new Class2_Sub16_Sub4(this);

	@OriginalMember(owner = "client!v", name = "T", descriptor = "Lclient!oe;")
	private final Class58 aClass58_64 = new Class58(128);

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class2_Sub16_Sub2() {
		this.method1786();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
	private void method1783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
	private void method1784(@OriginalArg(1) int arg0) {
		if ((this.anIntArray376[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub5 local18 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method415(); local18 != null; local18 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method414()) {
			if (arg0 == local18.anInt453 && this.aClass2_Sub5ArrayArray1[arg0][local18.anInt441] == null && local18.anInt433 < 0) {
				local18.anInt433 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	private void method1786() {
		this.method1818(-1);
		this.method1811(-1);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray378[local19] = this.anIntArray379[local19];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray380[local35] = this.anIntArray379[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
	public synchronized void method1789() {
		this.method1803();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ce;)I")
	private int method1790(@OriginalArg(1) Class2_Sub5 arg0) {
		@Pc(2) Class72 local2 = arg0.aClass72_1;
		@Pc(22) int local22 = this.anIntArray385[arg0.anInt453] * this.anIntArray384[arg0.anInt453] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt446 * local30 + 16384 >> 15;
		local22 = this.anInt2587 * local39 + 128 >> 8;
		if (local2.anInt2456 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) arg0.anInt455 * 1.953125E-5D * (double) local2.anInt2456) + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(113) int local113;
		@Pc(125) int local125;
		if (local2.aByteArray36 != null) {
			local83 = arg0.anInt454;
			local91 = local2.aByteArray36[arg0.anInt436 + 1];
			if (local2.aByteArray36.length - 2 > arg0.anInt436) {
				local113 = (local2.aByteArray36[arg0.anInt436] & 0xFF) << 8;
				local125 = (local2.aByteArray36[arg0.anInt436 + 2] & 0xFF) << 8;
				local91 += (local2.aByteArray36[arg0.anInt436 + 3] - local91) * (local83 - local113) / (local125 - local113);
			}
			local22 = local22 * local91 + 32 >> 6;
		}
		if (arg0.anInt433 > 0 && local2.aByteArray37 != null) {
			local91 = local2.aByteArray37[arg0.anInt425 + 1];
			local83 = arg0.anInt433;
			if (arg0.anInt425 < local2.aByteArray37.length - 2) {
				local113 = (local2.aByteArray37[arg0.anInt425] & 0xFF) << 8;
				local125 = (local2.aByteArray37[arg0.anInt425 + 2] & 0xFF) << 8;
				local91 += (local83 - local113) * (local2.aByteArray37[arg0.anInt425 + 3] - local91) / (local125 - local113);
			}
			local22 = local91 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Z")
	public synchronized boolean method1791() {
		return this.aClass40_1.method974();
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	private void method1792() {
		@Pc(4) int local4 = this.anInt2626;
		@Pc(11) long local11 = this.aLong90;
		@Pc(14) int local14 = this.anInt2627;
		while (this.anInt2627 == local14) {
			while (local14 == this.aClass40_1.anIntArray169[local4]) {
				this.aClass40_1.method970(local4);
				@Pc(29) int local29 = this.aClass40_1.method971(local4);
				if (local29 == 1) {
					this.aClass40_1.method980();
					this.aClass40_1.method973(local4);
					if (this.aClass40_1.method969()) {
						if (!this.aBoolean114 || local14 == 0) {
							this.method1786();
							this.aClass40_1.method977();
							return;
						}
						this.aClass40_1.method981(local11);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method1810(local29);
				}
				this.aClass40_1.method975(local4);
				this.aClass40_1.method973(local4);
			}
			local4 = this.aClass40_1.method979();
			local14 = this.aClass40_1.anIntArray169[local4];
			local11 = this.aClass40_1.method982(local14);
		}
		this.anInt2627 = local14;
		this.anInt2626 = local4;
		this.aLong90 = local11;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()Lclient!wc;")
	@Override
	public synchronized Class2_Sub16 method1911() {
		return null;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
	private void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray378[arg1]) {
			this.anIntArray378[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass2_Sub5ArrayArray2[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(BII)V")
	private void method1795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray375[arg1] = arg0;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)V")
	private void method1796(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class2_Sub5 local18 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method415(); local18 != null; local18 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method414()) {
			if ((arg0 < 0 || local18.anInt453 == arg0) && local18.anInt433 < 0) {
				this.aClass2_Sub5ArrayArray1[local18.anInt453][local18.anInt441] = null;
				local18.anInt433 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!ce;I)V")
	public void method1797(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		@Pc(15) int local15 = arg1.aClass2_Sub14_Sub1_1.aByteArray11.length;
		@Pc(34) int local34;
		if (arg0 && arg1.aClass2_Sub14_Sub1_1.aBoolean55) {
			@Pc(44) int local44 = local15 + local15 - arg1.aClass2_Sub14_Sub1_1.anInt1409;
			local34 = (int) ((long) this.anIntArray386[arg1.anInt453] * (long) local44 >> 6);
			local15 <<= 0x8;
			if (local15 <= local34) {
				local34 = local15 + local15 - local34 - 1;
				arg1.aClass2_Sub16_Sub1_1.method1173();
			}
		} else {
			local34 = (int) ((long) this.anIntArray386[arg1.anInt453] * (long) local15 >> 6);
		}
		arg1.aClass2_Sub16_Sub1_1.method1187(local34);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public synchronized void method1798() {
		this.aClass40_1.method977();
		this.method1786();
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(III)V")
	private void method1799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray381[arg0] = arg1;
		this.anIntArray377[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(II)V")
	private void method1800(@OriginalArg(1) int arg0) {
		if ((this.anIntArray376[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class2_Sub5 local19 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method415(); local19 != null; local19 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method414()) {
			if (local19.anInt453 == arg0) {
				local19.anInt430 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ce;Z)I")
	private int method1801(@OriginalArg(0) Class2_Sub5 arg0) {
		@Pc(6) Class72 local6 = arg0.aClass72_1;
		@Pc(17) int local17 = arg0.anInt443 + (arg0.anInt452 * arg0.anInt437 >> 12);
		local17 += (this.anIntArray375[arg0.anInt453] - 8192) * this.anIntArray374[arg0.anInt453] >> 12;
		@Pc(58) int local58;
		if (local6.anInt2457 > 0 && (local6.anInt2450 > 0 || this.anIntArray383[arg0.anInt453] > 0)) {
			local58 = local6.anInt2450 << 2;
			@Pc(63) int local63 = local6.anInt2459 << 1;
			if (arg0.anInt431 < local63) {
				local58 = arg0.anInt431 * local58 / local63;
			}
			local58 += this.anIntArray383[arg0.anInt453] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt439 & 0x1FF) * 0.01227184630308513D);
			local17 += (int) ((double) local58 * local97);
		}
		local58 = (int) ((double) (arg0.aClass2_Sub14_Sub1_1.anInt1408 * 256) * Math.pow(2.0D, (double) local17 * 3.255208333333333E-4D) / (double) Static119.anInt2551 + 0.5D);
		return local58 < 1 ? 1 : local58;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
	public synchronized void method1802() {
		for (@Pc(11) Class2_Sub15 local11 = (Class2_Sub15) this.aClass58_64.method1305(); local11 != null; local11 = (Class2_Sub15) this.aClass58_64.method1302()) {
			local11.method1930();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)V")
	private void method1803() {
		this.anIntArray379[9] = 128;
		this.anIntArray380[9] = 128;
		this.method1794(128, 9);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	private void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1807(arg2, arg1, 64);
		if ((this.anIntArray376[arg2] & 0x2) != 0) {
			for (@Pc(30) Class2_Sub5 local30 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method424(); local30 != null; local30 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method425()) {
				if (local30.anInt453 == arg2 && local30.anInt433 < 0) {
					this.aClass2_Sub5ArrayArray1[arg2][local30.anInt441] = null;
					this.aClass2_Sub5ArrayArray1[arg2][arg1] = local30;
					@Pc(66) int local66 = local30.anInt443 + (local30.anInt452 * local30.anInt437 >> 12);
					local30.anInt443 += arg1 - local30.anInt441 << 8;
					local30.anInt437 = 4096;
					local30.anInt441 = arg1;
					local30.anInt452 = local66 - local30.anInt443;
					return;
				}
			}
		}
		@Pc(114) Class2_Sub15 local114 = (Class2_Sub15) this.aClass58_64.method1307((long) this.anIntArray378[arg2]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class2_Sub14_Sub1 local122 = local114.aClass2_Sub14_Sub1Array1[arg1];
		if (local122 == null) {
			return;
		}
		@Pc(129) Class2_Sub5 local129 = new Class2_Sub5();
		local129.aClass2_Sub15_1 = local114;
		local129.aClass2_Sub14_Sub1_1 = local122;
		local129.anInt453 = arg2;
		local129.aClass72_1 = local114.aClass72Array1[arg1];
		local129.anInt427 = local114.aByteArray12[arg1];
		local129.anInt441 = arg1;
		local129.anInt446 = local114.aByteArray13[arg1] * local114.anInt1481 * arg0 * arg0 + 1024 >> 11;
		local129.anInt432 = local114.aByteArray14[arg1] & 0xFF;
		local129.anInt443 = (arg1 << 8) - (local114.aShortArray8[arg1] & 0x7FFF);
		local129.anInt436 = 0;
		local129.anInt425 = 0;
		local129.anInt433 = -1;
		local129.anInt455 = 0;
		local129.anInt454 = 0;
		if (this.anIntArray386[arg2] == 0) {
			local129.aClass2_Sub16_Sub1_1 = Static134.method1186(local122, this.method1801(local129), this.method1790(local129), this.method1816(local129));
		} else {
			local129.aClass2_Sub16_Sub1_1 = Static134.method1186(local122, this.method1801(local129), 0, this.method1816(local129));
			this.method1797(local114.aShortArray8[arg1] < 0, local129);
		}
		if (local114.aShortArray8[arg1] < 0) {
			local129.aClass2_Sub16_Sub1_1.method1174(-1);
		}
		if (local129.anInt427 >= 0) {
			@Pc(281) Class2_Sub5 local281 = this.aClass2_Sub5ArrayArray2[arg2][local129.anInt427];
			if (local281 != null && local281.anInt433 < 0) {
				this.aClass2_Sub5ArrayArray1[arg2][local281.anInt441] = null;
				local281.anInt433 = 0;
			}
			this.aClass2_Sub5ArrayArray2[arg2][local129.anInt427] = local129;
		}
		this.aClass2_Sub16_Sub4_1.aClass13_68.method418(local129);
		this.aClass2_Sub5ArrayArray1[arg2][arg1] = local129;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(IIII)V")
	private void method1805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)I")
	public int method1806() {
		return this.anInt2587;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBII)V")
	private void method1807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub5 local12 = this.aClass2_Sub5ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub5ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray376[arg0] & 0x2) == 0) {
			local12.anInt433 = 0;
			return;
		}
		for (@Pc(43) Class2_Sub5 local43 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method415(); local43 != null; local43 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method414()) {
			if (local12.anInt453 == local43.anInt453 && local43.anInt433 < 0 && local12 != local43) {
				local12.anInt433 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()Lclient!wc;")
	@Override
	public synchronized Class2_Sub16 method1912() {
		return this.aClass2_Sub16_Sub4_1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1913(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass40_1.method974()) {
			@Pc(17) int local17 = this.aClass40_1.anInt1391 * 1000000 / Static119.anInt2551;
			do {
				@Pc(26) long local26 = (long) arg2 * (long) local17 + this.aLong89;
				if (this.aLong90 - local26 >= 0L) {
					this.aLong89 = local26;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local17 + this.aLong90 - this.aLong89 - 1L) / (long) local17);
				this.aLong89 += (long) local57 * (long) local17;
				this.aClass2_Sub16_Sub4_1.method1913(arg0, arg1, local57);
				arg1 += local57;
				arg2 -= local57;
				this.method1792();
			} while (this.aClass40_1.method974());
		}
		this.aClass2_Sub16_Sub4_1.method1913(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(II)V")
	public synchronized void method1808(@OriginalArg(1) int arg0) {
		this.anInt2587 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!id;ILclient!g;Lclient!rd;I)Z")
	public synchronized boolean method1809(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class2_Sub18 arg2) {
		arg2.method1576();
		@Pc(5) boolean local5 = true;
		@Pc(31) int[] local31 = new int[] { 22050 };
		for (@Pc(37) Class2_Sub4 local37 = (Class2_Sub4) arg2.aClass58_58.method1305(); local37 != null; local37 = (Class2_Sub4) arg2.aClass58_58.method1302()) {
			@Pc(43) int local43 = (int) local37.aLong96;
			@Pc(51) Class2_Sub15 local51 = (Class2_Sub15) this.aClass58_64.method1307((long) local43);
			if (local51 == null) {
				local51 = Static67.method1022(arg1, local43);
				if (local51 == null) {
					local5 = false;
					continue;
				}
				this.aClass58_64.method1301((long) local43, local51);
			}
			if (!local51.method1026(local31, arg0, local37.aByteArray2)) {
				local5 = false;
			}
		}
		if (local5) {
			arg2.method1577();
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(II)V")
	private void method1810(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1807(local16, local22, local28);
		} else if (local9 == 144) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method1807(local16, local22, 64);
			} else {
				this.method1804(local28, local22, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1805(local16, local28, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray380[local16] = (this.anIntArray380[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray380[local16] = (local28 << 7) + (this.anIntArray380[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray383[local16] = (local28 << 7) + (this.anIntArray383[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray383[local16] = local28 + (this.anIntArray383[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray387[local16] = (this.anIntArray387[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray387[local16] = local28 + (this.anIntArray387[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray385[local16] = (this.anIntArray385[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray385[local16] = (this.anIntArray385[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray382[local16] = (this.anIntArray382[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray382[local16] = local28 + (this.anIntArray382[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray384[local16] = (this.anIntArray384[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray384[local16] = (this.anIntArray384[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray376[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray376[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method1784(local16);
					this.anIntArray376[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray376[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray373[local16] = (this.anIntArray373[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray373[local16] = (this.anIntArray373[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray373[local16] = (local28 << 7) + (this.anIntArray373[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray373[local16] = (this.anIntArray373[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method1818(local16);
			}
			if (local22 == 121) {
				this.method1811(local16);
			}
			if (local22 == 123) {
				this.method1796(local16);
			}
			@Pc(502) int local502;
			if (local22 == 6) {
				local502 = this.anIntArray373[local16];
				if (local502 == 16384) {
					this.anIntArray374[local16] = (this.anIntArray374[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local502 = this.anIntArray373[local16];
				if (local502 == 16384) {
					this.anIntArray374[local16] = (this.anIntArray374[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray386[local16] = (this.anIntArray386[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray386[local16] = (this.anIntArray386[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method1800(local16);
					this.anIntArray376[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray376[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method1799(local16, (this.anIntArray381[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method1799(local16, local28 + (this.anIntArray381[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1794(this.anIntArray380[local16] + local22, local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1783(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F2B) >> 8);
			this.method1795(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1786();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()I")
	@Override
	public synchronized int method1914() {
		return 0;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(II)V")
	private void method1811(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1811(local9);
			}
			return;
		}
		this.anIntArray385[arg0] = 12800;
		this.anIntArray382[arg0] = 8192;
		this.anIntArray384[arg0] = 16383;
		this.anIntArray375[arg0] = 8192;
		this.anIntArray383[arg0] = 0;
		this.anIntArray387[arg0] = 8192;
		this.method1784(arg0);
		this.method1800(arg0);
		this.anIntArray376[arg0] = 0;
		this.anIntArray373[arg0] = 32767;
		this.anIntArray374[arg0] = 256;
		this.anIntArray386[arg0] = 0;
		this.method1799(arg0, 8192);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILclient!ce;[I)Z")
	public boolean method1813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub5 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt451 = Static119.anInt2551 / 100;
		if (arg2.anInt433 >= 0 && (arg2.aClass2_Sub16_Sub1_1 == null || arg2.aClass2_Sub16_Sub1_1.method1164())) {
			arg2.method350();
			arg2.method1930();
			if (arg2.anInt427 > 0 && this.aClass2_Sub5ArrayArray2[arg2.anInt453][arg2.anInt427] == arg2) {
				this.aClass2_Sub5ArrayArray2[arg2.anInt453][arg2.anInt427] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg2.anInt437;
		@Pc(60) boolean local60 = false;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray387[arg2.anInt453] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg2.anInt437 = local58;
		}
		arg2.aClass2_Sub16_Sub1_1.method1168(this.method1801(arg2));
		arg2.anInt431++;
		@Pc(127) double local127 = (double) ((arg2.anInt441 - 60 << 8) + (arg2.anInt437 * arg2.anInt452 >> 12)) * 5.086263020833333E-6D;
		@Pc(130) Class72 local130 = arg2.aClass72_1;
		arg2.anInt439 += local130.anInt2457;
		if (local130.anInt2456 > 0) {
			if (local130.anInt2451 <= 0) {
				arg2.anInt455 += 128;
			} else {
				arg2.anInt455 += (int) (Math.pow(2.0D, local127 * (double) local130.anInt2451) * 128.0D + 0.5D);
			}
		}
		if (local130.aByteArray36 != null) {
			if (local130.anInt2454 <= 0) {
				arg2.anInt454 += 128;
			} else {
				arg2.anInt454 += (int) (Math.pow(2.0D, local127 * (double) local130.anInt2454) * 128.0D + 0.5D);
			}
			while (local130.aByteArray36.length - 2 > arg2.anInt436 && arg2.anInt454 > (local130.aByteArray36[arg2.anInt436 + 2] & 0xFF) << 8) {
				arg2.anInt436 += 2;
			}
			if (local130.aByteArray36.length - 2 == arg2.anInt436 && local130.aByteArray36[arg2.anInt436 + 1] == 0) {
				local60 = true;
			}
		}
		if (arg2.anInt433 >= 0 && local130.aByteArray37 != null && (this.anIntArray376[arg2.anInt453] & 0x1) == 0 && (arg2.anInt427 < 0 || arg2 != this.aClass2_Sub5ArrayArray2[arg2.anInt453][arg2.anInt427])) {
			if (local130.anInt2461 > 0) {
				arg2.anInt433 += (int) (Math.pow(2.0D, (double) local130.anInt2461 * local127) * 128.0D + 0.5D);
			} else {
				arg2.anInt433 += 128;
			}
			while (local130.aByteArray37.length - 2 > arg2.anInt425 && (local130.aByteArray37[arg2.anInt425 + 2] & 0xFF) << 8 < arg2.anInt433) {
				arg2.anInt425 += 2;
			}
			if (arg2.anInt425 == local130.aByteArray37.length - 2) {
				local60 = true;
			}
		}
		if (!local60) {
			arg2.aClass2_Sub16_Sub1_1.method1202(arg2.anInt451, this.method1790(arg2), this.method1816(arg2));
			return false;
		}
		arg2.aClass2_Sub16_Sub1_1.method1185(arg2.anInt451);
		if (arg3 == null) {
			arg2.aClass2_Sub16_Sub1_1.method1916(arg0);
		} else {
			arg2.aClass2_Sub16_Sub1_1.method1913(arg3, arg1, arg0);
		}
		if (arg2.aClass2_Sub16_Sub1_1.method1184()) {
			this.aClass2_Sub16_Sub4_1.aClass2_Sub16_Sub3_3.method1839(arg2.aClass2_Sub16_Sub1_1);
		}
		arg2.method350();
		if (arg2.anInt433 >= 0) {
			arg2.method1930();
			if (arg2.anInt427 > 0 && this.aClass2_Sub5ArrayArray2[arg2.anInt453][arg2.anInt427] == arg2) {
				this.aClass2_Sub5ArrayArray2[arg2.anInt453][arg2.anInt427] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!ce;)Z")
	public boolean method1814(@OriginalArg(1) Class2_Sub5 arg0) {
		if (arg0.aClass2_Sub16_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt433 >= 0) {
			arg0.method1930();
			if (arg0.anInt427 > 0 && this.aClass2_Sub5ArrayArray2[arg0.anInt453][arg0.anInt427] == arg0) {
				this.aClass2_Sub5ArrayArray2[arg0.anInt453][arg0.anInt427] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!rd;B)V")
	public synchronized void method1815(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub18 arg1) {
		this.method1798();
		this.aClass40_1.method972(arg1.aByteArray28);
		this.aLong89 = 0L;
		this.aBoolean114 = arg0;
		@Pc(23) int local23 = this.aClass40_1.method976();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass40_1.method970(local25);
			this.aClass40_1.method975(local25);
			this.aClass40_1.method973(local25);
		}
		this.anInt2626 = this.aClass40_1.method979();
		this.anInt2627 = this.aClass40_1.anIntArray169[this.anInt2626];
		this.aLong90 = this.aClass40_1.method982(this.anInt2627);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1916(@OriginalArg(0) int arg0) {
		if (this.aClass40_1.method974()) {
			@Pc(17) int local17 = this.aClass40_1.anInt1391 * 1000000 / Static119.anInt2551;
			do {
				@Pc(27) long local27 = this.aLong89 + (long) local17 * (long) arg0;
				if (this.aLong90 - local27 >= 0L) {
					this.aLong89 = local27;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong90 + (long) local17 - this.aLong89 - 1L) / (long) local17);
				this.aLong89 += (long) local17 * (long) local55;
				arg0 -= local55;
				this.aClass2_Sub16_Sub4_1.method1916(local55);
				this.method1792();
			} while (this.aClass40_1.method974());
		}
		this.aClass2_Sub16_Sub4_1.method1916(arg0);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(ILclient!ce;)I")
	private int method1816(@OriginalArg(1) Class2_Sub5 arg0) {
		@Pc(10) int local10 = this.anIntArray382[arg0.anInt453];
		return local10 < 8192 ? local10 * arg0.anInt432 + 32 >> 6 : 16384 - ((16384 - local10) * (-arg0.anInt432 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	public synchronized void method1817() {
		for (@Pc(19) Class2_Sub15 local19 = (Class2_Sub15) this.aClass58_64.method1305(); local19 != null; local19 = (Class2_Sub15) this.aClass58_64.method1302()) {
			local19.method1023();
		}
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(II)V")
	private void method1818(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub5 local12 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method415(); local12 != null; local12 = (Class2_Sub5) this.aClass2_Sub16_Sub4_1.aClass13_68.method414()) {
			if (arg0 < 0 || local12.anInt453 == arg0) {
				if (local12.aClass2_Sub16_Sub1_1 != null) {
					local12.aClass2_Sub16_Sub1_1.method1185(Static119.anInt2551 / 100);
					if (local12.aClass2_Sub16_Sub1_1.method1184()) {
						this.aClass2_Sub16_Sub4_1.aClass2_Sub16_Sub3_3.method1839(local12.aClass2_Sub16_Sub1_1);
					}
					local12.method350();
				}
				if (local12.anInt433 < 0) {
					this.aClass2_Sub5ArrayArray1[local12.anInt453][local12.anInt441] = null;
				}
				local12.method1930();
			}
		}
	}
}
