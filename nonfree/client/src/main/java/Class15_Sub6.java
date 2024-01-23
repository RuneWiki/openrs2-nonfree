import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class15_Sub6 extends Class15 {

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "[Lclient!nl;")
	public Class122[] aClass122Array1;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "S")
	public short aShort26;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "[Lclient!sk;")
	public Class163[] aClass163Array1;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "[Lclient!uj;")
	public Class180[] aClass180Array3;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "[Lclient!nl;")
	public Class122[] aClass122Array2;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
	public int anInt4385;

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "[Lclient!ud;")
	public Class176[] aClass176Array3;

	@OriginalMember(owner = "client!rd", name = "gb", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!rd", name = "hb", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!rd", name = "ib", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!rd", name = "jb", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!rd", name = "kb", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "Z")
	private boolean aBoolean302 = false;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
	public int anInt4384 = 0;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "B")
	public byte aByte26 = 0;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
	public int anInt4382 = 0;

	@OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
	public int anInt4386 = 0;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	private Class15_Sub6() {
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
	public Class15_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3751(arg0);
		} else {
			this.method3778(arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(III)V")
	public Class15_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray383 = new int[arg0];
		this.anIntArray382 = new int[arg0];
		this.anIntArray381 = new int[arg0];
		this.anIntArray378 = new int[arg0];
		this.anIntArray377 = new int[arg1];
		this.anIntArray380 = new int[arg1];
		this.anIntArray375 = new int[arg1];
		this.aByteArray61 = new byte[arg1];
		this.aByteArray58 = new byte[arg1];
		this.aByteArray65 = new byte[arg1];
		this.aShortArray78 = new short[arg1];
		this.aShortArray85 = new short[arg1];
		this.aByteArray64 = new byte[arg1];
		this.anIntArray386 = new int[arg1];
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([Lclient!rd;I)V")
	public Class15_Sub6(@OriginalArg(0) Class15_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt4386 = 0;
		this.anInt4382 = 0;
		this.anInt4385 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		this.aByte26 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class15_Sub6 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt4386 += local53.anInt4386;
				this.anInt4382 += local53.anInt4382;
				this.anInt4385 += local53.anInt4385;
				if (local53.aByteArray58 == null) {
					if (this.aByte26 == -1) {
						this.aByte26 = local53.aByte26;
					}
					if (this.aByte26 != local53.aByte26) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray61 != null;
				local22 |= local53.aByteArray65 != null;
				local24 |= local53.anIntArray386 != null;
				local26 |= local53.aShortArray85 != null;
				local28 |= local53.aByteArray64 != null;
				if (local53.aClass180Array3 != null) {
					local39 += local53.aClass180Array3.length;
				}
				if (local53.aClass176Array3 != null) {
					local41 += local53.aClass176Array3.length;
				}
			}
		}
		this.anIntArray383 = new int[this.anInt4386];
		this.anIntArray382 = new int[this.anInt4386];
		this.anIntArray381 = new int[this.anInt4386];
		this.anIntArray378 = new int[this.anInt4386];
		this.aShortArray80 = new short[this.anInt4386];
		this.anIntArray377 = new int[this.anInt4382];
		this.anIntArray380 = new int[this.anInt4382];
		this.anIntArray375 = new int[this.anInt4382];
		if (local18) {
			this.aByteArray61 = new byte[this.anInt4382];
		}
		if (local20) {
			this.aByteArray58 = new byte[this.anInt4382];
		}
		if (local22) {
			this.aByteArray65 = new byte[this.anInt4382];
		}
		if (local24) {
			this.anIntArray386 = new int[this.anInt4382];
		}
		if (local26) {
			this.aShortArray85 = new short[this.anInt4382];
		}
		if (local28) {
			this.aByteArray64 = new byte[this.anInt4382];
		}
		if (local39 > 0) {
			this.aClass180Array3 = new Class180[local39];
		}
		if (local41 > 0) {
			this.aClass176Array3 = new Class176[local41];
		}
		this.aShortArray78 = new short[this.anInt4382];
		this.aShortArray79 = new short[this.anInt4382];
		if (this.anInt4385 > 0) {
			this.aByteArray56 = new byte[this.anInt4385];
			this.aShortArray81 = new short[this.anInt4385];
			this.aShortArray82 = new short[this.anInt4385];
			this.aShortArray83 = new short[this.anInt4385];
			this.aShortArray86 = new short[this.anInt4385];
			this.aShortArray87 = new short[this.anInt4385];
			this.aShortArray84 = new short[this.anInt4385];
			this.aByteArray63 = new byte[this.anInt4385];
			this.aByteArray62 = new byte[this.anInt4385];
			this.aByteArray59 = new byte[this.anInt4385];
			this.aByteArray57 = new byte[this.anInt4385];
			this.aByteArray60 = new byte[this.anInt4385];
		}
		this.anInt4386 = 0;
		this.anInt4382 = 0;
		this.anInt4385 = 0;
		local39 = 0;
		local41 = 0;
		@Pc(356) Class15_Sub6 local356;
		@Pc(531) int local531;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(352) short local352 = (short) (0x1 << local46);
			local356 = arg0[local46];
			if (local356 != null) {
				@Pc(360) int local360;
				for (local360 = 0; local360 < local356.anInt4382; local360++) {
					if (local18 && local356.aByteArray61 != null) {
						this.aByteArray61[this.anInt4382] = local356.aByteArray61[local360];
					}
					if (local20) {
						if (local356.aByteArray58 == null) {
							this.aByteArray58[this.anInt4382] = local356.aByte26;
						} else {
							this.aByteArray58[this.anInt4382] = local356.aByteArray58[local360];
						}
					}
					if (local22 && local356.aByteArray65 != null) {
						this.aByteArray65[this.anInt4382] = local356.aByteArray65[local360];
					}
					if (local24 && local356.anIntArray386 != null) {
						this.anIntArray386[this.anInt4382] = local356.anIntArray386[local360];
					}
					if (local26) {
						if (local356.aShortArray85 == null) {
							this.aShortArray85[this.anInt4382] = -1;
						} else {
							this.aShortArray85[this.anInt4382] = local356.aShortArray85[local360];
						}
					}
					this.aShortArray78[this.anInt4382] = local356.aShortArray78[local360];
					this.aShortArray79[this.anInt4382] = local352;
					this.anIntArray377[this.anInt4382] = this.method3757(local356, local356.anIntArray377[local360], local352);
					this.anIntArray380[this.anInt4382] = this.method3757(local356, local356.anIntArray380[local360], local352);
					this.anIntArray375[this.anInt4382] = this.method3757(local356, local356.anIntArray375[local360], local352);
					this.anInt4382++;
				}
				if (local356.aClass180Array3 != null) {
					for (local360 = 0; local360 < local356.aClass180Array3.length; local360++) {
						local531 = this.method3757(local356, local356.aClass180Array3[local360].anInt5137, local352);
						@Pc(541) int local541 = this.method3757(local356, local356.aClass180Array3[local360].anInt5139, local352);
						@Pc(551) int local551 = this.method3757(local356, local356.aClass180Array3[local360].anInt5135, local352);
						this.aClass180Array3[local39] = new Class180(local356.aClass180Array3[local360].aClass165_1, local531, local541, local551);
						local39++;
					}
				}
				if (local356.aClass176Array3 != null) {
					for (local360 = 0; local360 < local356.aClass176Array3.length; local360++) {
						local531 = this.method3757(local356, local356.aClass176Array3[local360].anInt5087, local352);
						this.aClass176Array3[local41] = new Class176(local356.aClass176Array3[local360].aClass5_1, local531);
						local41++;
					}
				}
			}
		}
		local46 = 0;
		this.anInt4384 = this.anInt4386;
		for (@Pc(615) int local615 = 0; local615 < arg1; local615++) {
			local356 = arg0[local615];
			@Pc(627) short local627 = (short) (0x1 << local615);
			if (local356 != null) {
				for (local531 = 0; local531 < local356.anInt4382; local531++) {
					if (local28) {
						this.aByteArray64[local46++] = (byte) (local356.aByteArray64 == null || local356.aByteArray64[local531] == -1 ? -1 : local356.aByteArray64[local531] + this.anInt4385);
					}
				}
				for (local531 = 0; local531 < local356.anInt4385; local531++) {
					@Pc(680) byte local680 = this.aByteArray56[this.anInt4385] = local356.aByteArray56[local531];
					if (local680 == 0) {
						this.aShortArray81[this.anInt4385] = (short) this.method3757(local356, local356.aShortArray81[local531], local627);
						this.aShortArray82[this.anInt4385] = (short) this.method3757(local356, local356.aShortArray82[local531], local627);
						this.aShortArray83[this.anInt4385] = (short) this.method3757(local356, local356.aShortArray83[local531], local627);
					}
					if (local680 >= 1 && local680 <= 3) {
						this.aShortArray81[this.anInt4385] = local356.aShortArray81[local531];
						this.aShortArray82[this.anInt4385] = local356.aShortArray82[local531];
						this.aShortArray83[this.anInt4385] = local356.aShortArray83[local531];
						this.aShortArray86[this.anInt4385] = local356.aShortArray86[local531];
						this.aShortArray87[this.anInt4385] = local356.aShortArray87[local531];
						this.aShortArray84[this.anInt4385] = local356.aShortArray84[local531];
						this.aByteArray63[this.anInt4385] = local356.aByteArray63[local531];
						this.aByteArray62[this.anInt4385] = local356.aByteArray62[local531];
						this.aByteArray59[this.anInt4385] = local356.aByteArray59[local531];
					}
					if (local680 == 2) {
						this.aByteArray57[this.anInt4385] = local356.aByteArray57[local531];
						this.aByteArray60[this.anInt4385] = local356.aByteArray60[local531];
					}
					this.anInt4385++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!rd;ZZZZ)V")
	public Class15_Sub6(@OriginalArg(0) Class15_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4386 = arg0.anInt4386;
		this.anInt4384 = arg0.anInt4384;
		this.anInt4382 = arg0.anInt4382;
		this.anInt4385 = arg0.anInt4385;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray383 = arg0.anIntArray383;
			this.anIntArray382 = arg0.anIntArray382;
			this.anIntArray381 = arg0.anIntArray381;
		} else {
			this.anIntArray383 = new int[this.anInt4386];
			this.anIntArray382 = new int[this.anInt4386];
			this.anIntArray381 = new int[this.anInt4386];
			for (local64 = 0; local64 < this.anInt4386; local64++) {
				this.anIntArray383[local64] = arg0.anIntArray383[local64];
				this.anIntArray382[local64] = arg0.anIntArray382[local64];
				this.anIntArray381[local64] = arg0.anIntArray381[local64];
			}
		}
		if (arg2) {
			this.aShortArray78 = arg0.aShortArray78;
		} else {
			this.aShortArray78 = new short[this.anInt4382];
			for (local64 = 0; local64 < this.anInt4382; local64++) {
				this.aShortArray78[local64] = arg0.aShortArray78[local64];
			}
		}
		if (arg3 || arg0.aShortArray85 == null) {
			this.aShortArray85 = arg0.aShortArray85;
		} else {
			this.aShortArray85 = new short[this.anInt4382];
			for (local64 = 0; local64 < this.anInt4382; local64++) {
				this.aShortArray85[local64] = arg0.aShortArray85[local64];
			}
		}
		this.aByteArray65 = arg0.aByteArray65;
		this.anIntArray377 = arg0.anIntArray377;
		this.anIntArray380 = arg0.anIntArray380;
		this.anIntArray375 = arg0.anIntArray375;
		this.aByteArray61 = arg0.aByteArray61;
		this.aByteArray58 = arg0.aByteArray58;
		this.aByteArray64 = arg0.aByteArray64;
		this.aByte26 = arg0.aByte26;
		this.aByteArray56 = arg0.aByteArray56;
		this.aShortArray81 = arg0.aShortArray81;
		this.aShortArray82 = arg0.aShortArray82;
		this.aShortArray83 = arg0.aShortArray83;
		this.aShortArray86 = arg0.aShortArray86;
		this.aShortArray87 = arg0.aShortArray87;
		this.aShortArray84 = arg0.aShortArray84;
		this.aByteArray63 = arg0.aByteArray63;
		this.aByteArray62 = arg0.aByteArray62;
		this.aByteArray59 = arg0.aByteArray59;
		this.aByteArray57 = arg0.aByteArray57;
		this.aByteArray60 = arg0.aByteArray60;
		this.anIntArray378 = arg0.anIntArray378;
		this.anIntArray386 = arg0.anIntArray386;
		this.anIntArrayArray35 = arg0.anIntArrayArray35;
		this.anIntArrayArray34 = arg0.anIntArrayArray34;
		this.aClass122Array1 = arg0.aClass122Array1;
		this.aClass163Array1 = arg0.aClass163Array1;
		this.aClass122Array2 = arg0.aClass122Array2;
		this.aShort26 = arg0.aShort26;
		this.aShort27 = arg0.aShort27;
		this.aClass180Array3 = arg0.aClass180Array3;
		this.aClass176Array3 = arg0.aClass176Array3;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()V")
	public void method3749() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4386; local1++) {
			this.anIntArray381[local1] = -this.anIntArray381[local1];
		}
		for (local1 = 0; local1 < this.anInt4382; local1++) {
			@Pc(27) int local27 = this.anIntArray377[local1];
			this.anIntArray377[local1] = this.anIntArray375[local1];
			this.anIntArray375[local1] = local27;
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10) {
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	public void method3750() {
		this.anIntArray378 = null;
		this.anIntArray386 = null;
		this.anIntArrayArray35 = null;
		this.anIntArrayArray34 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()I")
	@Override
	public int method4676() {
		if (!this.aBoolean302) {
			this.method3773();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([B)V")
	private void method3751(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg0);
		@Pc(9) Class1_Sub14 local9 = new Class1_Sub14(arg0);
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		@Pc(19) Class1_Sub14 local19 = new Class1_Sub14(arg0);
		@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0);
		@Pc(29) Class1_Sub14 local29 = new Class1_Sub14(arg0);
		@Pc(34) Class1_Sub14 local34 = new Class1_Sub14(arg0);
		local4.anInt1480 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1386();
		@Pc(48) int local48 = local4.method1386();
		@Pc(52) int local52 = local4.method1378();
		@Pc(56) int local56 = local4.method1378();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method1378();
		@Pc(82) int local82 = local4.method1378();
		@Pc(86) int local86 = local4.method1378();
		@Pc(90) int local90 = local4.method1378();
		@Pc(94) int local94 = local4.method1378();
		@Pc(98) int local98 = local4.method1386();
		@Pc(102) int local102 = local4.method1386();
		@Pc(106) int local106 = local4.method1386();
		@Pc(110) int local110 = local4.method1386();
		@Pc(114) int local114 = local4.method1386();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray56 = new byte[local52];
			local4.anInt1480 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray56[local131] = local4.method1363();
				if (local143 == 0) {
					local116++;
				}
				if (local143 >= 1 && local143 <= 3) {
					local118++;
				}
				if (local143 == 2) {
					local120++;
				}
			}
		}
		local131 = local52 + local44;
		@Pc(169) int local169 = local131;
		if (local65) {
			local131 += local48;
		}
		@Pc(177) int local177 = local131;
		local131 += local48;
		@Pc(183) int local183 = local131;
		if (local78 == 255) {
			local131 += local48;
		}
		@Pc(192) int local192 = local131;
		if (local86 == 1) {
			local131 += local48;
		}
		@Pc(201) int local201 = local131;
		if (local94 == 1) {
			local131 += local44;
		}
		@Pc(210) int local210 = local131;
		if (local82 == 1) {
			local131 += local48;
		}
		@Pc(219) int local219 = local131;
		local131 += local110;
		@Pc(225) int local225 = local131;
		if (local90 == 1) {
			local131 += local48 * 2;
		}
		@Pc(236) int local236 = local131;
		local131 += local114;
		@Pc(242) int local242 = local131;
		local131 += local48 * 2;
		@Pc(250) int local250 = local131;
		local131 += local98;
		@Pc(256) int local256 = local131;
		local131 += local102;
		@Pc(262) int local262 = local131;
		local131 += local106;
		@Pc(268) int local268 = local131;
		local131 += local116 * 6;
		@Pc(276) int local276 = local131;
		local131 += local118 * 6;
		@Pc(284) int local284 = local131;
		local131 += local118 * 6;
		@Pc(292) int local292 = local131;
		local131 += local118;
		@Pc(298) int local298 = local131;
		local131 += local118;
		@Pc(304) int local304 = local131;
		local131 += local118 + local120 * 2;
		this.anInt4386 = local44;
		this.anInt4382 = local48;
		this.anInt4385 = local52;
		this.anIntArray383 = new int[local44];
		this.anIntArray382 = new int[local44];
		this.anIntArray381 = new int[local44];
		this.anIntArray377 = new int[local48];
		this.anIntArray380 = new int[local48];
		this.anIntArray375 = new int[local48];
		if (local94 == 1) {
			this.anIntArray378 = new int[local44];
		}
		if (local65) {
			this.aByteArray61 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray58 = new byte[local48];
		} else {
			this.aByte26 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray65 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray386 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray85 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray64 = new byte[local48];
		}
		this.aShortArray78 = new short[local48];
		if (local52 > 0) {
			this.aShortArray81 = new short[local52];
			this.aShortArray82 = new short[local52];
			this.aShortArray83 = new short[local52];
			if (local118 > 0) {
				this.aShortArray86 = new short[local118];
				this.aShortArray87 = new short[local118];
				this.aShortArray84 = new short[local118];
				this.aByteArray63 = new byte[local118];
				this.aByteArray62 = new byte[local118];
				this.aByteArray59 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray57 = new byte[local120];
				this.aByteArray60 = new byte[local120];
			}
		}
		local4.anInt1480 = local52;
		local9.anInt1480 = local250;
		local14.anInt1480 = local256;
		local19.anInt1480 = local262;
		local24.anInt1480 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method1378();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method1358();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method1358();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method1358();
			}
			this.anIntArray383[local479] = local473 + local488;
			this.anIntArray382[local479] = local475 + local498;
			this.anIntArray381[local479] = local477 + local508;
			local473 = this.anIntArray383[local479];
			local475 = this.anIntArray382[local479];
			local477 = this.anIntArray381[local479];
			if (local94 == 1) {
				this.anIntArray378[local479] = local24.method1378();
			}
		}
		local4.anInt1480 = local242;
		local9.anInt1480 = local169;
		local14.anInt1480 = local183;
		local19.anInt1480 = local210;
		local24.anInt1480 = local192;
		local29.anInt1480 = local225;
		local34.anInt1480 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray78[local479] = (short) local4.method1386();
			if (local65) {
				this.aByteArray61[local479] = local9.method1363();
			}
			if (local78 == 255) {
				this.aByteArray58[local479] = local14.method1363();
			}
			if (local82 == 1) {
				this.aByteArray65[local479] = local19.method1363();
			}
			if (local86 == 1) {
				this.anIntArray386[local479] = local24.method1378();
			}
			if (local90 == 1) {
				this.aShortArray85[local479] = (short) (local29.method1386() - 1);
			}
			if (this.aByteArray64 != null) {
				if (this.aShortArray85[local479] == -1) {
					this.aByteArray64[local479] = -1;
				} else {
					this.aByteArray64[local479] = (byte) (local34.method1378() - 1);
				}
			}
		}
		this.anInt4384 = -1;
		local4.anInt1480 = local219;
		local9.anInt1480 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		@Pc(841) int local841;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method1378();
			if (local703 == 1) {
				local479 = local4.method1358() + local498;
				local486 = local4.method1358() + local479;
				local488 = local4.method1358() + local486;
				local498 = local488;
				this.anIntArray377[local508] = local479;
				this.anIntArray380[local508] = local486;
				this.anIntArray375[local508] = local488;
				if (local479 > this.anInt4384) {
					this.anInt4384 = local479;
				}
				if (local486 > this.anInt4384) {
					this.anInt4384 = local486;
				}
				if (local488 > this.anInt4384) {
					this.anInt4384 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method1358() + local498;
				local498 = local488;
				this.anIntArray377[local508] = local479;
				this.anIntArray380[local508] = local486;
				this.anIntArray375[local508] = local488;
				if (local488 > this.anInt4384) {
					this.anInt4384 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method1358() + local498;
				local498 = local488;
				this.anIntArray377[local508] = local479;
				this.anIntArray380[local508] = local486;
				this.anIntArray375[local508] = local488;
				if (local488 > this.anInt4384) {
					this.anInt4384 = local488;
				}
			}
			if (local703 == 4) {
				local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method1358() + local498;
				local498 = local488;
				this.anIntArray377[local508] = local479;
				this.anIntArray380[local508] = local841;
				this.anIntArray375[local508] = local488;
				if (local488 > this.anInt4384) {
					this.anInt4384 = local488;
				}
			}
		}
		this.anInt4384++;
		local4.anInt1480 = local268;
		local9.anInt1480 = local276;
		local14.anInt1480 = local284;
		local19.anInt1480 = local292;
		local24.anInt1480 = local298;
		local29.anInt1480 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray56[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray81[local508] = (short) local4.method1386();
				this.aShortArray82[local508] = (short) local4.method1386();
				this.aShortArray83[local508] = (short) local4.method1386();
			}
			if (local703 == 1) {
				this.aShortArray81[local508] = (short) local9.method1386();
				this.aShortArray82[local508] = (short) local9.method1386();
				this.aShortArray83[local508] = (short) local9.method1386();
				this.aShortArray86[local508] = (short) local14.method1386();
				this.aShortArray87[local508] = (short) local14.method1386();
				this.aShortArray84[local508] = (short) local14.method1386();
				this.aByteArray63[local508] = local19.method1363();
				this.aByteArray62[local508] = local24.method1363();
				this.aByteArray59[local508] = local29.method1363();
			}
			if (local703 == 2) {
				this.aShortArray81[local508] = (short) local9.method1386();
				this.aShortArray82[local508] = (short) local9.method1386();
				this.aShortArray83[local508] = (short) local9.method1386();
				this.aShortArray86[local508] = (short) local14.method1386();
				this.aShortArray87[local508] = (short) local14.method1386();
				this.aShortArray84[local508] = (short) local14.method1386();
				this.aByteArray63[local508] = local19.method1363();
				this.aByteArray62[local508] = local24.method1363();
				this.aByteArray59[local508] = local29.method1363();
				this.aByteArray57[local508] = local29.method1363();
				this.aByteArray60[local508] = local29.method1363();
			}
			if (local703 == 3) {
				this.aShortArray81[local508] = (short) local9.method1386();
				this.aShortArray82[local508] = (short) local9.method1386();
				this.aShortArray83[local508] = (short) local9.method1386();
				this.aShortArray86[local508] = (short) local14.method1386();
				this.aShortArray87[local508] = (short) local14.method1386();
				this.aShortArray84[local508] = (short) local14.method1386();
				this.aByteArray63[local508] = local19.method1363();
				this.aByteArray62[local508] = local24.method1363();
				this.aByteArray59[local508] = local29.method1363();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt1480 = local131;
		local508 = local4.method1378();
		if (local508 > 0) {
			this.aClass180Array3 = new Class180[local508];
			for (local703 = 0; local703 < local508; local703++) {
				local841 = local4.method1386();
				@Pc(1199) int local1199 = local4.method1386();
				this.aClass180Array3[local703] = new Class180(local841, this.anIntArray377[local1199], this.anIntArray380[local1199], this.anIntArray375[local1199]);
			}
		}
		local703 = local4.method1378();
		if (local703 > 0) {
			this.aClass176Array3 = new Class176[local703];
			for (local841 = 0; local841 < local703; local841++) {
				this.aClass176Array3[local841] = new Class176(local4.method1386(), local4.method1386());
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V")
	public void method3752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4386; local1++) {
			this.anIntArray383[local1] += arg0;
			this.anIntArray382[local1] += arg1;
			this.anIntArray381[local1] += arg2;
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()Z")
	@Override
	public boolean method4680() {
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!rd;")
	public Class15_Sub6 method3753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3773();
		@Pc(6) int local6 = arg4 + this.aShort31;
		@Pc(11) int local11 = arg4 + this.aShort33;
		@Pc(16) int local16 = arg6 + this.aShort29;
		@Pc(21) int local21 = arg6 + this.aShort32;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local6 >>= 0x7;
			local11 = local11 + 127 >> 7;
			local16 >>= 0x7;
			local21 = local21 + 127 >> 7;
			if (arg2[local6][local16] == arg5 && arg2[local11][local16] == arg5 && arg2[local6][local21] == arg5 && arg2[local11][local21] == arg5) {
				return this;
			}
		}
		@Pc(147) Class15_Sub6 local147 = new Class15_Sub6();
		local147.anInt4386 = this.anInt4386;
		local147.anInt4384 = this.anInt4384;
		local147.anInt4382 = this.anInt4382;
		local147.anInt4385 = this.anInt4385;
		local147.anIntArray377 = this.anIntArray377;
		local147.anIntArray380 = this.anIntArray380;
		local147.anIntArray375 = this.anIntArray375;
		local147.aByteArray61 = this.aByteArray61;
		local147.aByteArray58 = this.aByteArray58;
		local147.aByteArray65 = this.aByteArray65;
		local147.aByteArray64 = this.aByteArray64;
		local147.aShortArray78 = this.aShortArray78;
		local147.aShortArray85 = this.aShortArray85;
		local147.aByte26 = this.aByte26;
		local147.aByteArray56 = this.aByteArray56;
		local147.aShortArray81 = this.aShortArray81;
		local147.aShortArray82 = this.aShortArray82;
		local147.aShortArray83 = this.aShortArray83;
		local147.aShortArray86 = this.aShortArray86;
		local147.aShortArray87 = this.aShortArray87;
		local147.aShortArray84 = this.aShortArray84;
		local147.aByteArray63 = this.aByteArray63;
		local147.aByteArray62 = this.aByteArray62;
		local147.aByteArray59 = this.aByteArray59;
		local147.aByteArray57 = this.aByteArray57;
		local147.aByteArray60 = this.aByteArray60;
		local147.anIntArray378 = this.anIntArray378;
		local147.anIntArray386 = this.anIntArray386;
		local147.anIntArrayArray35 = this.anIntArrayArray35;
		local147.anIntArrayArray34 = this.anIntArrayArray34;
		local147.aShort26 = this.aShort26;
		local147.aShort27 = this.aShort27;
		local147.aClass122Array1 = this.aClass122Array1;
		local147.aClass163Array1 = this.aClass163Array1;
		local147.aClass122Array2 = this.aClass122Array2;
		local147.aClass180Array3 = this.aClass180Array3;
		local147.aClass176Array3 = this.aClass176Array3;
		if (arg0 == 3) {
			local147.anIntArray383 = Static142.method2456(this.anIntArray383);
			local147.anIntArray382 = Static142.method2456(this.anIntArray382);
			local147.anIntArray381 = Static142.method2456(this.anIntArray381);
		} else {
			local147.anIntArray383 = this.anIntArray383;
			local147.anIntArray382 = new int[local147.anInt4386];
			local147.anIntArray381 = this.anIntArray381;
		}
		@Pc(338) int local338;
		@Pc(349) int local349;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(364) int local364;
		@Pc(368) int local368;
		@Pc(372) int local372;
		@Pc(394) int local394;
		@Pc(420) int local420;
		@Pc(432) int local432;
		if (arg0 == 1) {
			for (local338 = 0; local338 < local147.anInt4384; local338++) {
				local349 = this.anIntArray383[local338] + arg4;
				local356 = this.anIntArray381[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
				local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
				local432 = local394 * (128 - local364) + local420 * local364 >> 7;
				local147.anIntArray382[local338] = this.anIntArray382[local338] + local432 - arg5;
			}
			for (local338 = local147.anInt4384; local338 < local147.anInt4386; local338++) {
				local349 = this.anIntArray383[local338] + arg4;
				local356 = this.anIntArray381[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				if (local368 >= 0 && local368 < arg2.length - 1 && local372 >= 0 && local372 < arg2[0].length - 1) {
					local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
					local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
					local432 = local394 * (128 - local364) + local420 * local364 >> 7;
					local147.anIntArray382[local338] = this.anIntArray382[local338] + local432 - arg5;
				}
			}
		} else {
			@Pc(689) int local689;
			if (arg0 == 2) {
				for (local338 = 0; local338 < local147.anInt4384; local338++) {
					local349 = (this.anIntArray382[local338] << 16) / this.aShort30;
					if (local349 < arg1) {
						local356 = this.anIntArray383[local338] + arg4;
						local360 = this.anIntArray381[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray382[local338] = this.anIntArray382[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
					} else {
						local147.anIntArray382[local338] = this.anIntArray382[local338];
					}
				}
				for (local338 = local147.anInt4384; local338 < local147.anInt4386; local338++) {
					local349 = (this.anIntArray382[local338] << 16) / this.aShort30;
					if (local349 < arg1) {
						local356 = this.anIntArray383[local338] + arg4;
						local360 = this.anIntArray381[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						if (local372 >= 0 && local372 < arg2.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1) {
							local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
							local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
							local689 = local420 * (128 - local368) + local432 * local368 >> 7;
							local147.anIntArray382[local338] = this.anIntArray382[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
						}
					} else {
						local147.anIntArray382[local338] = this.anIntArray382[local338];
					}
				}
			} else if (arg0 == 3) {
				local338 = (arg1 & 0xFF) * 4;
				local349 = (arg1 >> 8 & 0xFF) * 4;
				local147.method3769(arg2, arg4, arg5, arg6, local338, local349);
			} else if (arg0 == 4) {
				local338 = this.aShort28 - this.aShort30;
				for (local349 = 0; local349 < this.anInt4384; local349++) {
					local356 = this.anIntArray383[local349] + arg4;
					local360 = this.anIntArray381[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local147.anIntArray382[local349] = this.anIntArray382[local349] + local689 + local338 - arg5;
				}
				for (local349 = local147.anInt4384; local349 < local147.anInt4386; local349++) {
					local356 = this.anIntArray383[local349] + arg4;
					local360 = this.anIntArray381[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg3[0].length - 1) {
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray382[local349] = this.anIntArray382[local349] + local689 + local338 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local338 = this.aShort28 - this.aShort30;
				@Pc(1322) int local1322;
				@Pc(1326) int local1326;
				for (local349 = 0; local349 < this.anInt4384; local349++) {
					local356 = this.anIntArray383[local349] + arg4;
					local360 = this.anIntArray381[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
					local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local1322 = local420 * (128 - local368) + local432 * local368 >> 7;
					local1326 = local689 - local1322;
					local147.anIntArray382[local349] = ((this.anIntArray382[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
				}
				for (local349 = local147.anInt4384; local349 < local147.anInt4386; local349++) {
					local356 = this.anIntArray383[local349] + arg4;
					local360 = this.anIntArray381[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg2.length - 1 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1 && local394 < arg3[0].length - 1) {
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local1322 = local420 * (128 - local368) + local432 * local368 >> 7;
						local1326 = local689 - local1322;
						local147.anIntArray382[local349] = ((this.anIntArray382[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
					}
				}
			}
		}
		this.aBoolean302 = false;
		return local147;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	private void method3754(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static241.anIntArray385[arg0];
		@Pc(7) int local7 = Static241.anIntArray376[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4386; local9++) {
			@Pc(29) int local29 = this.anIntArray382[local9] * local7 - this.anIntArray381[local9] * local3 >> 16;
			this.anIntArray381[local9] = this.anIntArray382[local9] * local3 + this.anIntArray381[local9] * local7 >> 16;
			this.anIntArray382[local9] = local29;
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;IS)I")
	private int method3757(@OriginalArg(0) Class15_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray383[arg1];
		@Pc(9) int local9 = arg0.anIntArray382[arg1];
		@Pc(14) int local14 = arg0.anIntArray381[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4386; local16++) {
			if (local4 == this.anIntArray383[local16] && local9 == this.anIntArray382[local16] && local14 == this.anIntArray381[local16]) {
				this.aShortArray80[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray383[this.anInt4386] = local4;
		this.anIntArray382[this.anInt4386] = local9;
		this.anIntArray381[this.anInt4386] = local14;
		this.aShortArray80[this.anInt4386] = arg2;
		if (arg0.anIntArray378 != null) {
			this.anIntArray378[this.anInt4386] = arg0.anIntArray378[arg1];
		}
		return this.anInt4386++;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	private void method3758(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static241.anIntArray385[arg0];
		@Pc(7) int local7 = Static241.anIntArray376[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4386; local9++) {
			@Pc(29) int local29 = this.anIntArray382[local9] * local3 + this.anIntArray383[local9] * local7 >> 16;
			this.anIntArray382[local9] = this.anIntArray382[local9] * local7 - this.anIntArray383[local9] * local3 >> 16;
			this.anIntArray383[local9] = local29;
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)V")
	public void method3759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4386; local1++) {
			this.anIntArray383[local1] = this.anIntArray383[local1] * arg0 / 128;
			this.anIntArray382[local1] = this.anIntArray382[local1] * arg1 / 128;
			this.anIntArray381[local1] = this.anIntArray381[local1] * arg2 / 128;
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIII)Lclient!bf;")
	public Class15_Sub2 method3760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static156.aBoolean211) {
			@Pc(9) Class15_Sub2_Sub1 local9 = new Class15_Sub2_Sub1(this, arg0, arg1, true);
			local9.method877();
			return local9;
		} else {
			return new Class15_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIBSB)I")
	public int method3761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray377[this.anInt4382] = arg0;
		this.anIntArray380[this.anInt4382] = arg1;
		this.anIntArray375[this.anInt4382] = arg2;
		this.aByteArray61[this.anInt4382] = 1;
		this.aByteArray64[this.anInt4382] = -1;
		this.aShortArray78[this.anInt4382] = arg3;
		this.aShortArray85[this.anInt4382] = -1;
		this.aByteArray65[this.anInt4382] = arg4;
		return this.anInt4382++;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "()V")
	public void method3762() {
		if (this.aClass122Array1 != null) {
			return;
		}
		this.aClass122Array1 = new Class122[this.anInt4384];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt4384; local10++) {
			this.aClass122Array1[local10] = new Class122();
		}
		for (local10 = 0; local10 < this.anInt4382; local10++) {
			@Pc(34) int local34 = this.anIntArray377[local10];
			@Pc(39) int local39 = this.anIntArray380[local10];
			@Pc(44) int local44 = this.anIntArray375[local10];
			@Pc(54) int local54 = this.anIntArray383[local39] - this.anIntArray383[local34];
			@Pc(64) int local64 = this.anIntArray382[local39] - this.anIntArray382[local34];
			@Pc(74) int local74 = this.anIntArray381[local39] - this.anIntArray381[local34];
			@Pc(84) int local84 = this.anIntArray383[local44] - this.anIntArray383[local34];
			@Pc(94) int local94 = this.anIntArray382[local44] - this.anIntArray382[local34];
			@Pc(104) int local104 = this.anIntArray381[local44] - this.anIntArray381[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 0x1) {
				local112 >>= 0x1;
				local120 >>= 0x1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.aByteArray61 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray61[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class122 local214 = this.aClass122Array1[local34];
				local214.anInt3672 += local112;
				local214.anInt3676 += local120;
				local214.anInt3670 += local128;
				local214.anInt3674++;
				@Pc(243) Class122 local243 = this.aClass122Array1[local39];
				local243.anInt3672 += local112;
				local243.anInt3676 += local120;
				local243.anInt3670 += local128;
				local243.anInt3674++;
				@Pc(272) Class122 local272 = this.aClass122Array1[local44];
				local272.anInt3672 += local112;
				local272.anInt3676 += local120;
				local272.anInt3670 += local128;
				local272.anInt3674++;
			} else if (local201 == 1) {
				if (this.aClass163Array1 == null) {
					this.aClass163Array1 = new Class163[this.anInt4382];
				}
				@Pc(317) Class163 local317 = this.aClass163Array1[local10] = new Class163();
				local317.anInt4718 = local112;
				local317.anInt4716 = local120;
				local317.anInt4719 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIII)Lclient!eb;")
	public Class15_Sub2_Sub2 method3764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class15_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "()V")
	public void method3765() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray378 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt4386; local9++) {
				local18 = this.anIntArray378[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray35 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray35[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt4386) {
				local18 = this.anIntArray378[local9];
				this.anIntArrayArray35[local18][local5[local18]++] = local9++;
			}
			this.anIntArray378 = null;
		}
		if (this.anIntArray386 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt4382; local9++) {
			local18 = this.anIntArray386[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray34 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray34[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt4382) {
			local18 = this.anIntArray386[local9];
			this.anIntArrayArray34[local18][local5[local18]++] = local9++;
		}
		this.anIntArray386 = null;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "()V")
	public void method3766() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4386; local1++) {
			@Pc(10) int local10 = this.anIntArray383[local1];
			this.anIntArray383[local1] = this.anIntArray381[local1];
			this.anIntArray381[local1] = -local10;
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(SS)V")
	public void method3767(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray85 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt4382; local5++) {
			if (this.aShortArray85[local5] == arg0) {
				this.aShortArray85[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(III)V")
	public void method3768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static241.anIntArray385[arg2];
			local9 = Static241.anIntArray376[arg2];
			for (local11 = 0; local11 < this.anInt4386; local11++) {
				local31 = this.anIntArray382[local11] * local5 + this.anIntArray383[local11] * local9 >> 16;
				this.anIntArray382[local11] = this.anIntArray382[local11] * local9 - this.anIntArray383[local11] * local5 >> 16;
				this.anIntArray383[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static241.anIntArray385[arg0];
			local9 = Static241.anIntArray376[arg0];
			for (local11 = 0; local11 < this.anInt4386; local11++) {
				local31 = this.anIntArray382[local11] * local9 - this.anIntArray381[local11] * local5 >> 16;
				this.anIntArray381[local11] = this.anIntArray382[local11] * local5 + this.anIntArray381[local11] * local9 >> 16;
				this.anIntArray382[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static241.anIntArray385[arg1];
		local9 = Static241.anIntArray376[arg1];
		for (local11 = 0; local11 < this.anInt4386; local11++) {
			local31 = this.anIntArray381[local11] * local5 + this.anIntArray383[local11] * local9 >> 16;
			this.anIntArray381[local11] = this.anIntArray381[local11] * local9 - this.anIntArray383[local11] * local5 >> 16;
			this.anIntArray383[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Lclient!io;")
	@Override
	public Class15 method4684() {
		return this.method3760(this.aShort26, this.aShort27, -50, -10, -50);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([[IIIIII)V")
	private void method3769(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static241.method3756(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static241.method3756(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static241.method3756(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static241.method3756(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method3754(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method3758(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method3752(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "()V")
	public void method3770() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4386; local1++) {
			this.anIntArray383[local1] = -this.anIntArray383[local1];
			this.anIntArray381[local1] = -this.anIntArray381[local1];
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "()V")
	public void method3771() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4386; local1++) {
			@Pc(10) int local10 = this.anIntArray381[local1];
			this.anIntArray381[local1] = this.anIntArray383[local1];
			this.anIntArray383[local1] = -local10;
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "()Lclient!rd;")
	public Class15_Sub6 method3772() {
		@Pc(3) Class15_Sub6 local3 = new Class15_Sub6();
		if (this.aByteArray61 != null) {
			local3.aByteArray61 = new byte[this.anInt4382];
			for (@Pc(13) int local13 = 0; local13 < this.anInt4382; local13++) {
				local3.aByteArray61[local13] = this.aByteArray61[local13];
			}
		}
		local3.anInt4386 = this.anInt4386;
		local3.anInt4384 = this.anInt4384;
		local3.anInt4382 = this.anInt4382;
		local3.anInt4385 = this.anInt4385;
		local3.anIntArray383 = this.anIntArray383;
		local3.anIntArray382 = this.anIntArray382;
		local3.anIntArray381 = this.anIntArray381;
		local3.anIntArray377 = this.anIntArray377;
		local3.anIntArray380 = this.anIntArray380;
		local3.anIntArray375 = this.anIntArray375;
		local3.aByteArray58 = this.aByteArray58;
		local3.aByteArray65 = this.aByteArray65;
		local3.aByteArray64 = this.aByteArray64;
		local3.aShortArray78 = this.aShortArray78;
		local3.aShortArray85 = this.aShortArray85;
		local3.aByte26 = this.aByte26;
		local3.aByteArray56 = this.aByteArray56;
		local3.aShortArray81 = this.aShortArray81;
		local3.aShortArray82 = this.aShortArray82;
		local3.aShortArray83 = this.aShortArray83;
		local3.aShortArray86 = this.aShortArray86;
		local3.aShortArray87 = this.aShortArray87;
		local3.aShortArray84 = this.aShortArray84;
		local3.aByteArray63 = this.aByteArray63;
		local3.aByteArray62 = this.aByteArray62;
		local3.aByteArray59 = this.aByteArray59;
		local3.aByteArray57 = this.aByteArray57;
		local3.aByteArray60 = this.aByteArray60;
		local3.anIntArray378 = this.anIntArray378;
		local3.anIntArray386 = this.anIntArray386;
		local3.anIntArrayArray35 = this.anIntArrayArray35;
		local3.anIntArrayArray34 = this.anIntArrayArray34;
		local3.aClass122Array1 = this.aClass122Array1;
		local3.aClass163Array1 = this.aClass163Array1;
		local3.aShort26 = this.aShort26;
		local3.aShort27 = this.aShort27;
		local3.aClass180Array3 = this.aClass180Array3;
		local3.aClass176Array3 = this.aClass176Array3;
		return local3;
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "()V")
	private void method3773() {
		if (this.aBoolean302) {
			return;
		}
		this.aBoolean302 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt4384; local20++) {
			@Pc(29) int local29 = this.anIntArray383[local20];
			@Pc(34) int local34 = this.anIntArray382[local20];
			@Pc(39) int local39 = this.anIntArray381[local20];
			if (local29 < local8) {
				local8 = local29;
			}
			if (local29 > local14) {
				local14 = local29;
			}
			if (local34 < local10) {
				local10 = local34;
			}
			if (local34 > local16) {
				local16 = local34;
			}
			if (local39 < local12) {
				local12 = local39;
			}
			if (local39 > local18) {
				local18 = local39;
			}
		}
		this.aShort31 = (short) local8;
		this.aShort33 = (short) local14;
		this.aShort30 = (short) local10;
		this.aShort28 = (short) local16;
		this.aShort29 = (short) local12;
		this.aShort32 = (short) local18;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(III)I")
	public int method3774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4386; local1++) {
			if (this.anIntArray383[local1] == arg0 && this.anIntArray382[local1] == 0 && this.anIntArray381[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray383[this.anInt4386] = arg0;
		this.anIntArray382[this.anInt4386] = 0;
		this.anIntArray381[this.anInt4386] = arg1;
		this.anInt4384 = ++this.anInt4386;
		return this.anInt4386 - 1;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(SS)V")
	public void method3775(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4382; local1++) {
			if (this.aShortArray78[local1] == arg0) {
				this.aShortArray78[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	public void method3776() {
		@Pc(3) int local3 = Static241.anIntArray385[256];
		@Pc(7) int local7 = Static241.anIntArray376[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4386; local9++) {
			@Pc(29) int local29 = this.anIntArray381[local9] * local3 + this.anIntArray383[local9] * local7 >> 16;
			this.anIntArray381[local9] = this.anIntArray381[local9] * local7 - this.anIntArray383[local9] * local3 >> 16;
			this.anIntArray383[local9] = local29;
		}
		this.method3777();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!io;IIIZ)V")
	@Override
	public void method4683(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class15_Sub6 local2 = (Class15_Sub6) arg0;
		local2.method3773();
		local2.method3762();
		Static241.anInt4383++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray383;
		@Pc(18) int local18 = local2.anInt4384;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt4384; local20++) {
			@Pc(29) Class122 local29 = this.aClass122Array1[local20];
			if (local29.anInt3674 != 0) {
				@Pc(40) int local40 = this.anIntArray382[local20] - arg2;
				if (local40 >= local2.aShort30 && local40 <= local2.aShort28) {
					@Pc(56) int local56 = this.anIntArray383[local20] - arg1;
					if (local56 >= local2.aShort31 && local56 <= local2.aShort33) {
						@Pc(72) int local72 = this.anIntArray381[local20] - arg3;
						if (local72 >= local2.aShort29 && local72 <= local2.aShort32) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class122 local91 = local2.aClass122Array1[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray381[local83] && local40 == local2.anIntArray382[local83] && local91.anInt3674 != 0) {
									if (this.aClass122Array2 == null) {
										this.aClass122Array2 = new Class122[this.anInt4384];
									}
									if (local2.aClass122Array2 == null) {
										local2.aClass122Array2 = new Class122[local18];
									}
									@Pc(131) Class122 local131 = this.aClass122Array2[local20];
									if (local131 == null) {
										local131 = this.aClass122Array2[local20] = new Class122(local29);
									}
									@Pc(148) Class122 local148 = local2.aClass122Array2[local83];
									if (local148 == null) {
										local148 = local2.aClass122Array2[local83] = new Class122(local91);
									}
									local131.anInt3672 += local91.anInt3672;
									local131.anInt3676 += local91.anInt3676;
									local131.anInt3670 += local91.anInt3670;
									local131.anInt3674 += local91.anInt3674;
									local148.anInt3672 += local29.anInt3672;
									local148.anInt3676 += local29.anInt3676;
									local148.anInt3670 += local29.anInt3670;
									local148.anInt3674 += local29.anInt3674;
									local12++;
									Static241.anIntArray379[local20] = Static241.anInt4383;
									Static241.anIntArray384[local83] = Static241.anInt4383;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (local20 = 0; local20 < this.anInt4382; local20++) {
			if (Static241.anIntArray379[this.anIntArray377[local20]] == Static241.anInt4383 && Static241.anIntArray379[this.anIntArray380[local20]] == Static241.anInt4383 && Static241.anIntArray379[this.anIntArray375[local20]] == Static241.anInt4383) {
				if (this.aByteArray61 == null) {
					this.aByteArray61 = new byte[this.anInt4382];
				}
				this.aByteArray61[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt4382; local20++) {
			if (Static241.anIntArray384[local2.anIntArray377[local20]] == Static241.anInt4383 && Static241.anIntArray384[local2.anIntArray380[local20]] == Static241.anInt4383 && Static241.anIntArray384[local2.anIntArray375[local20]] == Static241.anInt4383) {
				if (local2.aByteArray61 == null) {
					local2.aByteArray61 = new byte[local2.anInt4382];
				}
				local2.aByteArray61[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "()V")
	private void method3777() {
		this.aClass122Array1 = null;
		this.aClass122Array2 = null;
		this.aClass163Array1 = null;
		this.aBoolean302 = false;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([B)V")
	private void method3778(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(13) Class1_Sub14 local13 = new Class1_Sub14(arg0);
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg0);
		@Pc(23) Class1_Sub14 local23 = new Class1_Sub14(arg0);
		@Pc(28) Class1_Sub14 local28 = new Class1_Sub14(arg0);
		local8.anInt1480 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1386();
		@Pc(42) int local42 = local8.method1386();
		@Pc(46) int local46 = local8.method1378();
		@Pc(50) int local50 = local8.method1378();
		@Pc(54) int local54 = local8.method1378();
		@Pc(58) int local58 = local8.method1378();
		@Pc(62) int local62 = local8.method1378();
		@Pc(66) int local66 = local8.method1378();
		@Pc(70) int local70 = local8.method1386();
		@Pc(74) int local74 = local8.method1386();
		@Pc(78) int local78 = local8.method1386();
		@Pc(82) int local82 = local8.method1386();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt4386 = local38;
		this.anInt4382 = local42;
		this.anInt4385 = local46;
		this.anIntArray383 = new int[local38];
		this.anIntArray382 = new int[local38];
		this.anIntArray381 = new int[local38];
		this.anIntArray377 = new int[local42];
		this.anIntArray380 = new int[local42];
		this.anIntArray375 = new int[local42];
		if (local46 > 0) {
			this.aByteArray56 = new byte[local46];
			this.aShortArray81 = new short[local46];
			this.aShortArray82 = new short[local46];
			this.aShortArray83 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray378 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray61 = new byte[local42];
			this.aByteArray64 = new byte[local42];
			this.aShortArray85 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray58 = new byte[local42];
		} else {
			this.aByte26 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray65 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray386 = new int[local42];
		}
		this.aShortArray78 = new short[local42];
		local8.anInt1480 = 0;
		local13.anInt1480 = local165;
		local18.anInt1480 = local171;
		local23.anInt1480 = local90;
		local28.anInt1480 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method1378();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method1358();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method1358();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method1358();
			}
			this.anIntArray383[local307] = local301 + local316;
			this.anIntArray382[local307] = local303 + local326;
			this.anIntArray381[local307] = local305 + local336;
			local301 = this.anIntArray383[local307];
			local303 = this.anIntArray382[local307];
			local305 = this.anIntArray381[local307];
			if (local66 == 1) {
				this.anIntArray378[local307] = local28.method1378();
			}
		}
		local8.anInt1480 = local149;
		local13.anInt1480 = local116;
		local18.anInt1480 = local98;
		local23.anInt1480 = local134;
		local28.anInt1480 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray78[local307] = (short) local8.method1386();
			if (local50 == 1) {
				local314 = local13.method1378();
				if ((local314 & 0x1) == 1) {
					this.aByteArray61[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray61[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray64[local307] = (byte) (local314 >> 2);
					this.aShortArray85[local307] = this.aShortArray78[local307];
					this.aShortArray78[local307] = 127;
					if (this.aShortArray85[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray64[local307] = -1;
					this.aShortArray85[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray58[local307] = local18.method1363();
			}
			if (local58 == 1) {
				this.aByteArray65[local307] = local23.method1363();
			}
			if (local62 == 1) {
				this.anIntArray386[local307] = local28.method1378();
			}
		}
		this.anInt4384 = -1;
		local8.anInt1480 = local143;
		local13.anInt1480 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method1378();
			if (local548 == 1) {
				local307 = local8.method1358() + local326;
				local314 = local8.method1358() + local307;
				local316 = local8.method1358() + local314;
				local326 = local316;
				this.anIntArray377[local336] = local307;
				this.anIntArray380[local336] = local314;
				this.anIntArray375[local336] = local316;
				if (local307 > this.anInt4384) {
					this.anInt4384 = local307;
				}
				if (local314 > this.anInt4384) {
					this.anInt4384 = local314;
				}
				if (local316 > this.anInt4384) {
					this.anInt4384 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method1358() + local326;
				local326 = local316;
				this.anIntArray377[local336] = local307;
				this.anIntArray380[local336] = local314;
				this.anIntArray375[local336] = local316;
				if (local316 > this.anInt4384) {
					this.anInt4384 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method1358() + local326;
				local326 = local316;
				this.anIntArray377[local336] = local307;
				this.anIntArray380[local336] = local314;
				this.anIntArray375[local336] = local316;
				if (local316 > this.anInt4384) {
					this.anInt4384 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method1358() + local326;
				local326 = local316;
				this.anIntArray377[local336] = local307;
				this.anIntArray380[local336] = local686;
				this.anIntArray375[local336] = local316;
				if (local316 > this.anInt4384) {
					this.anInt4384 = local316;
				}
			}
		}
		this.anInt4384++;
		local8.anInt1480 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray56[local336] = 0;
			this.aShortArray81[local336] = (short) local8.method1386();
			this.aShortArray82[local336] = (short) local8.method1386();
			this.aShortArray83[local336] = (short) local8.method1386();
		}
		if (this.aByteArray64 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray64[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray81[local686] & 0xFFFF) == this.anIntArray377[local548] && (this.aShortArray82[local686] & 0xFFFF) == this.anIntArray380[local548] && (this.aShortArray83[local686] & 0xFFFF) == this.anIntArray375[local548]) {
						this.aByteArray64[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray64 = null;
			}
		}
		if (!local3) {
			this.aShortArray85 = null;
		}
		if (!local1) {
			this.aByteArray61 = null;
		}
	}
}
