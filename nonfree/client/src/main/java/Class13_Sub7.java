import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "[Lclient!ah;")
	public Class8[] aClass8Array1;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "[I")
	public int[] anIntArray423;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "[I")
	public int[] anIntArray424;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "[Lclient!kd;")
	public Class88[] aClass88Array3;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "[Lclient!ah;")
	public Class8[] aClass8Array2;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "[Lclient!jd;")
	public Class81[] aClass81Array1;

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
	public int anInt5392;

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "S")
	public short aShort41;

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "[I")
	public int[] anIntArray432;

	@OriginalMember(owner = "client!ud", name = "jb", descriptor = "[I")
	public int[] anIntArray433;

	@OriginalMember(owner = "client!ud", name = "kb", descriptor = "[Lclient!go;")
	public Class62[] aClass62Array3;

	@OriginalMember(owner = "client!ud", name = "lb", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!ud", name = "mb", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!ud", name = "nb", descriptor = "S")
	public short aShort44;

	@OriginalMember(owner = "client!ud", name = "ob", descriptor = "[I")
	public int[] anIntArray434;

	@OriginalMember(owner = "client!ud", name = "pb", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
	public int anInt5389 = 0;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Z")
	private boolean aBoolean362 = false;

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
	public int anInt5391 = 0;

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "B")
	public byte aByte21 = 0;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
	public int anInt5390 = 0;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	private Class13_Sub7() {
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([B)V")
	public Class13_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4284(arg0);
		} else {
			this.method4277(arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(III)V")
	public Class13_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray433 = new int[arg0];
		this.anIntArray434 = new int[arg0];
		this.anIntArray430 = new int[arg0];
		this.anIntArray423 = new int[arg0];
		this.anIntArray432 = new int[arg1];
		this.anIntArray424 = new int[arg1];
		this.anIntArray426 = new int[arg1];
		this.aByteArray70 = new byte[arg1];
		this.aByteArray65 = new byte[arg1];
		this.aByteArray66 = new byte[arg1];
		this.aShortArray91 = new short[arg1];
		this.aShortArray89 = new short[arg1];
		this.aByteArray68 = new byte[arg1];
		this.anIntArray428 = new int[arg1];
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([Lclient!ud;I)V")
	public Class13_Sub7(@OriginalArg(0) Class13_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt5391 = 0;
		this.anInt5390 = 0;
		this.anInt5392 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		this.aByte21 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class13_Sub7 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt5391 += local53.anInt5391;
				this.anInt5390 += local53.anInt5390;
				this.anInt5392 += local53.anInt5392;
				if (local53.aByteArray65 == null) {
					if (this.aByte21 == -1) {
						this.aByte21 = local53.aByte21;
					}
					if (this.aByte21 != local53.aByte21) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray70 != null;
				local22 |= local53.aByteArray66 != null;
				local24 |= local53.anIntArray428 != null;
				local26 |= local53.aShortArray89 != null;
				local28 |= local53.aByteArray68 != null;
				if (local53.aClass62Array3 != null) {
					local39 += local53.aClass62Array3.length;
				}
				if (local53.aClass88Array3 != null) {
					local41 += local53.aClass88Array3.length;
				}
			}
		}
		this.anIntArray433 = new int[this.anInt5391];
		this.anIntArray434 = new int[this.anInt5391];
		this.anIntArray430 = new int[this.anInt5391];
		this.anIntArray423 = new int[this.anInt5391];
		this.aShortArray92 = new short[this.anInt5391];
		this.anIntArray432 = new int[this.anInt5390];
		this.anIntArray424 = new int[this.anInt5390];
		this.anIntArray426 = new int[this.anInt5390];
		if (local18) {
			this.aByteArray70 = new byte[this.anInt5390];
		}
		if (local20) {
			this.aByteArray65 = new byte[this.anInt5390];
		}
		if (local22) {
			this.aByteArray66 = new byte[this.anInt5390];
		}
		if (local24) {
			this.anIntArray428 = new int[this.anInt5390];
		}
		if (local26) {
			this.aShortArray89 = new short[this.anInt5390];
		}
		if (local28) {
			this.aByteArray68 = new byte[this.anInt5390];
		}
		if (local39 > 0) {
			this.aClass62Array3 = new Class62[local39];
		}
		if (local41 > 0) {
			this.aClass88Array3 = new Class88[local41];
		}
		this.aShortArray91 = new short[this.anInt5390];
		this.aShortArray87 = new short[this.anInt5390];
		if (this.anInt5392 > 0) {
			this.aByteArray67 = new byte[this.anInt5392];
			this.aShortArray86 = new short[this.anInt5392];
			this.aShortArray83 = new short[this.anInt5392];
			this.aShortArray84 = new short[this.anInt5392];
			this.aShortArray90 = new short[this.anInt5392];
			this.aShortArray85 = new short[this.anInt5392];
			this.aShortArray88 = new short[this.anInt5392];
			this.aByteArray69 = new byte[this.anInt5392];
			this.aByteArray64 = new byte[this.anInt5392];
			this.aByteArray62 = new byte[this.anInt5392];
			this.aByteArray71 = new byte[this.anInt5392];
			this.aByteArray63 = new byte[this.anInt5392];
		}
		this.anInt5391 = 0;
		this.anInt5390 = 0;
		this.anInt5392 = 0;
		local39 = 0;
		local41 = 0;
		@Pc(356) Class13_Sub7 local356;
		@Pc(531) int local531;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(352) short local352 = (short) (0x1 << local46);
			local356 = arg0[local46];
			if (local356 != null) {
				@Pc(360) int local360;
				for (local360 = 0; local360 < local356.anInt5390; local360++) {
					if (local18 && local356.aByteArray70 != null) {
						this.aByteArray70[this.anInt5390] = local356.aByteArray70[local360];
					}
					if (local20) {
						if (local356.aByteArray65 == null) {
							this.aByteArray65[this.anInt5390] = local356.aByte21;
						} else {
							this.aByteArray65[this.anInt5390] = local356.aByteArray65[local360];
						}
					}
					if (local22 && local356.aByteArray66 != null) {
						this.aByteArray66[this.anInt5390] = local356.aByteArray66[local360];
					}
					if (local24 && local356.anIntArray428 != null) {
						this.anIntArray428[this.anInt5390] = local356.anIntArray428[local360];
					}
					if (local26) {
						if (local356.aShortArray89 == null) {
							this.aShortArray89[this.anInt5390] = -1;
						} else {
							this.aShortArray89[this.anInt5390] = local356.aShortArray89[local360];
						}
					}
					this.aShortArray91[this.anInt5390] = local356.aShortArray91[local360];
					this.aShortArray87[this.anInt5390] = local352;
					this.anIntArray432[this.anInt5390] = this.method4279(local356, local356.anIntArray432[local360], local352);
					this.anIntArray424[this.anInt5390] = this.method4279(local356, local356.anIntArray424[local360], local352);
					this.anIntArray426[this.anInt5390] = this.method4279(local356, local356.anIntArray426[local360], local352);
					this.anInt5390++;
				}
				if (local356.aClass62Array3 != null) {
					for (local360 = 0; local360 < local356.aClass62Array3.length; local360++) {
						local531 = this.method4279(local356, local356.aClass62Array3[local360].anInt1870, local352);
						@Pc(541) int local541 = this.method4279(local356, local356.aClass62Array3[local360].anInt1871, local352);
						@Pc(551) int local551 = this.method4279(local356, local356.aClass62Array3[local360].anInt1872, local352);
						this.aClass62Array3[local39] = new Class62(local356.aClass62Array3[local360].aClass74_1, local531, local541, local551);
						local39++;
					}
				}
				if (local356.aClass88Array3 != null) {
					for (local360 = 0; local360 < local356.aClass88Array3.length; local360++) {
						local531 = this.method4279(local356, local356.aClass88Array3[local360].anInt2769, local352);
						this.aClass88Array3[local41] = new Class88(local356.aClass88Array3[local360].aClass146_1, local531);
						local41++;
					}
				}
			}
		}
		local46 = 0;
		this.anInt5389 = this.anInt5391;
		for (@Pc(615) int local615 = 0; local615 < arg1; local615++) {
			local356 = arg0[local615];
			@Pc(627) short local627 = (short) (0x1 << local615);
			if (local356 != null) {
				for (local531 = 0; local531 < local356.anInt5390; local531++) {
					if (local28) {
						this.aByteArray68[local46++] = (byte) (local356.aByteArray68 == null || local356.aByteArray68[local531] == -1 ? -1 : local356.aByteArray68[local531] + this.anInt5392);
					}
				}
				for (local531 = 0; local531 < local356.anInt5392; local531++) {
					@Pc(680) byte local680 = this.aByteArray67[this.anInt5392] = local356.aByteArray67[local531];
					if (local680 == 0) {
						this.aShortArray86[this.anInt5392] = (short) this.method4279(local356, local356.aShortArray86[local531], local627);
						this.aShortArray83[this.anInt5392] = (short) this.method4279(local356, local356.aShortArray83[local531], local627);
						this.aShortArray84[this.anInt5392] = (short) this.method4279(local356, local356.aShortArray84[local531], local627);
					}
					if (local680 >= 1 && local680 <= 3) {
						this.aShortArray86[this.anInt5392] = local356.aShortArray86[local531];
						this.aShortArray83[this.anInt5392] = local356.aShortArray83[local531];
						this.aShortArray84[this.anInt5392] = local356.aShortArray84[local531];
						this.aShortArray90[this.anInt5392] = local356.aShortArray90[local531];
						this.aShortArray85[this.anInt5392] = local356.aShortArray85[local531];
						this.aShortArray88[this.anInt5392] = local356.aShortArray88[local531];
						this.aByteArray69[this.anInt5392] = local356.aByteArray69[local531];
						this.aByteArray64[this.anInt5392] = local356.aByteArray64[local531];
						this.aByteArray62[this.anInt5392] = local356.aByteArray62[local531];
					}
					if (local680 == 2) {
						this.aByteArray71[this.anInt5392] = local356.aByteArray71[local531];
						this.aByteArray63[this.anInt5392] = local356.aByteArray63[local531];
					}
					this.anInt5392++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ud;ZZZZ)V")
	public Class13_Sub7(@OriginalArg(0) Class13_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5391 = arg0.anInt5391;
		this.anInt5389 = arg0.anInt5389;
		this.anInt5390 = arg0.anInt5390;
		this.anInt5392 = arg0.anInt5392;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray433 = arg0.anIntArray433;
			this.anIntArray434 = arg0.anIntArray434;
			this.anIntArray430 = arg0.anIntArray430;
		} else {
			this.anIntArray433 = new int[this.anInt5391];
			this.anIntArray434 = new int[this.anInt5391];
			this.anIntArray430 = new int[this.anInt5391];
			for (local64 = 0; local64 < this.anInt5391; local64++) {
				this.anIntArray433[local64] = arg0.anIntArray433[local64];
				this.anIntArray434[local64] = arg0.anIntArray434[local64];
				this.anIntArray430[local64] = arg0.anIntArray430[local64];
			}
		}
		if (arg2) {
			this.aShortArray91 = arg0.aShortArray91;
		} else {
			this.aShortArray91 = new short[this.anInt5390];
			for (local64 = 0; local64 < this.anInt5390; local64++) {
				this.aShortArray91[local64] = arg0.aShortArray91[local64];
			}
		}
		if (arg3 || arg0.aShortArray89 == null) {
			this.aShortArray89 = arg0.aShortArray89;
		} else {
			this.aShortArray89 = new short[this.anInt5390];
			for (local64 = 0; local64 < this.anInt5390; local64++) {
				this.aShortArray89[local64] = arg0.aShortArray89[local64];
			}
		}
		this.aByteArray66 = arg0.aByteArray66;
		this.anIntArray432 = arg0.anIntArray432;
		this.anIntArray424 = arg0.anIntArray424;
		this.anIntArray426 = arg0.anIntArray426;
		this.aByteArray70 = arg0.aByteArray70;
		this.aByteArray65 = arg0.aByteArray65;
		this.aByteArray68 = arg0.aByteArray68;
		this.aByte21 = arg0.aByte21;
		this.aByteArray67 = arg0.aByteArray67;
		this.aShortArray86 = arg0.aShortArray86;
		this.aShortArray83 = arg0.aShortArray83;
		this.aShortArray84 = arg0.aShortArray84;
		this.aShortArray90 = arg0.aShortArray90;
		this.aShortArray85 = arg0.aShortArray85;
		this.aShortArray88 = arg0.aShortArray88;
		this.aByteArray69 = arg0.aByteArray69;
		this.aByteArray64 = arg0.aByteArray64;
		this.aByteArray62 = arg0.aByteArray62;
		this.aByteArray71 = arg0.aByteArray71;
		this.aByteArray63 = arg0.aByteArray63;
		this.anIntArray423 = arg0.anIntArray423;
		this.anIntArray428 = arg0.anIntArray428;
		this.anIntArrayArray36 = arg0.anIntArrayArray36;
		this.anIntArrayArray35 = arg0.anIntArrayArray35;
		this.aClass8Array2 = arg0.aClass8Array2;
		this.aClass81Array1 = arg0.aClass81Array1;
		this.aClass8Array1 = arg0.aClass8Array1;
		this.aShort41 = arg0.aShort41;
		this.aShort44 = arg0.aShort44;
		this.aClass62Array3 = arg0.aClass62Array3;
		this.aClass88Array3 = arg0.aClass88Array3;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "()V")
	public void method4269() {
		this.anIntArray423 = null;
		this.anIntArray428 = null;
		this.anIntArrayArray36 = null;
		this.anIntArrayArray35 = null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIIII)Lclient!gk;")
	public Class13_Sub1 method4270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static251.aBoolean330) {
			@Pc(9) Class13_Sub1_Sub2 local9 = new Class13_Sub1_Sub2(this, arg0, arg1, true);
			local9.method2785();
			return local9;
		} else {
			return new Class13_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "()Lclient!ud;")
	public Class13_Sub7 method4271() {
		@Pc(3) Class13_Sub7 local3 = new Class13_Sub7();
		if (this.aByteArray70 != null) {
			local3.aByteArray70 = new byte[this.anInt5390];
			for (@Pc(13) int local13 = 0; local13 < this.anInt5390; local13++) {
				local3.aByteArray70[local13] = this.aByteArray70[local13];
			}
		}
		local3.anInt5391 = this.anInt5391;
		local3.anInt5389 = this.anInt5389;
		local3.anInt5390 = this.anInt5390;
		local3.anInt5392 = this.anInt5392;
		local3.anIntArray433 = this.anIntArray433;
		local3.anIntArray434 = this.anIntArray434;
		local3.anIntArray430 = this.anIntArray430;
		local3.anIntArray432 = this.anIntArray432;
		local3.anIntArray424 = this.anIntArray424;
		local3.anIntArray426 = this.anIntArray426;
		local3.aByteArray65 = this.aByteArray65;
		local3.aByteArray66 = this.aByteArray66;
		local3.aByteArray68 = this.aByteArray68;
		local3.aShortArray91 = this.aShortArray91;
		local3.aShortArray89 = this.aShortArray89;
		local3.aByte21 = this.aByte21;
		local3.aByteArray67 = this.aByteArray67;
		local3.aShortArray86 = this.aShortArray86;
		local3.aShortArray83 = this.aShortArray83;
		local3.aShortArray84 = this.aShortArray84;
		local3.aShortArray90 = this.aShortArray90;
		local3.aShortArray85 = this.aShortArray85;
		local3.aShortArray88 = this.aShortArray88;
		local3.aByteArray69 = this.aByteArray69;
		local3.aByteArray64 = this.aByteArray64;
		local3.aByteArray62 = this.aByteArray62;
		local3.aByteArray71 = this.aByteArray71;
		local3.aByteArray63 = this.aByteArray63;
		local3.anIntArray423 = this.anIntArray423;
		local3.anIntArray428 = this.anIntArray428;
		local3.anIntArrayArray36 = this.anIntArrayArray36;
		local3.anIntArrayArray35 = this.anIntArrayArray35;
		local3.aClass8Array2 = this.aClass8Array2;
		local3.aClass81Array1 = this.aClass81Array1;
		local3.aShort41 = this.aShort41;
		local3.aShort44 = this.aShort44;
		local3.aClass62Array3 = this.aClass62Array3;
		local3.aClass88Array3 = this.aClass88Array3;
		return local3;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	private void method4272(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static271.anIntArray425[arg0];
		@Pc(7) int local7 = Static271.anIntArray429[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5391; local9++) {
			@Pc(29) int local29 = this.anIntArray434[local9] * local3 + this.anIntArray433[local9] * local7 >> 16;
			this.anIntArray434[local9] = this.anIntArray434[local9] * local7 - this.anIntArray433[local9] * local3 >> 16;
			this.anIntArray433[local9] = local29;
		}
		this.method4297();
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "()V")
	public void method4273() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5391; local1++) {
			this.anIntArray433[local1] = -this.anIntArray433[local1];
			this.anIntArray430[local1] = -this.anIntArray430[local1];
		}
		this.method4297();
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		if (!this.aBoolean362) {
			this.method4285();
		}
		return this.aShort38;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(SS)V")
	public void method4274(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5390; local1++) {
			if (this.aShortArray91[local1] == arg0) {
				this.aShortArray91[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)V")
	public void method4275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5391; local1++) {
			this.anIntArray433[local1] += arg0;
			this.anIntArray434[local1] += arg1;
			this.anIntArray430[local1] += arg2;
		}
		this.method4297();
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public void method4276() {
		@Pc(3) int local3 = Static271.anIntArray425[256];
		@Pc(7) int local7 = Static271.anIntArray429[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5391; local9++) {
			@Pc(29) int local29 = this.anIntArray430[local9] * local3 + this.anIntArray433[local9] * local7 >> 16;
			this.anIntArray430[local9] = this.anIntArray430[local9] * local7 - this.anIntArray433[local9] * local3 >> 16;
			this.anIntArray433[local9] = local29;
		}
		this.method4297();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([B)V")
	private void method4277(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class4_Sub24 local8 = new Class4_Sub24(arg0);
		@Pc(13) Class4_Sub24 local13 = new Class4_Sub24(arg0);
		@Pc(18) Class4_Sub24 local18 = new Class4_Sub24(arg0);
		@Pc(23) Class4_Sub24 local23 = new Class4_Sub24(arg0);
		@Pc(28) Class4_Sub24 local28 = new Class4_Sub24(arg0);
		local8.anInt3822 = arg0.length - 18;
		@Pc(38) int local38 = local8.method3085();
		@Pc(42) int local42 = local8.method3085();
		@Pc(46) int local46 = local8.method3110();
		@Pc(50) int local50 = local8.method3110();
		@Pc(54) int local54 = local8.method3110();
		@Pc(58) int local58 = local8.method3110();
		@Pc(62) int local62 = local8.method3110();
		@Pc(66) int local66 = local8.method3110();
		@Pc(70) int local70 = local8.method3085();
		@Pc(74) int local74 = local8.method3085();
		@Pc(78) int local78 = local8.method3085();
		@Pc(82) int local82 = local8.method3085();
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
		this.anInt5391 = local38;
		this.anInt5390 = local42;
		this.anInt5392 = local46;
		this.anIntArray433 = new int[local38];
		this.anIntArray434 = new int[local38];
		this.anIntArray430 = new int[local38];
		this.anIntArray432 = new int[local42];
		this.anIntArray424 = new int[local42];
		this.anIntArray426 = new int[local42];
		if (local46 > 0) {
			this.aByteArray67 = new byte[local46];
			this.aShortArray86 = new short[local46];
			this.aShortArray83 = new short[local46];
			this.aShortArray84 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray423 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray70 = new byte[local42];
			this.aByteArray68 = new byte[local42];
			this.aShortArray89 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray65 = new byte[local42];
		} else {
			this.aByte21 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray66 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray428 = new int[local42];
		}
		this.aShortArray91 = new short[local42];
		local8.anInt3822 = 0;
		local13.anInt3822 = local165;
		local18.anInt3822 = local171;
		local23.anInt3822 = local90;
		local28.anInt3822 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method3110();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method3067();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method3067();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method3067();
			}
			this.anIntArray433[local307] = local301 + local316;
			this.anIntArray434[local307] = local303 + local326;
			this.anIntArray430[local307] = local305 + local336;
			local301 = this.anIntArray433[local307];
			local303 = this.anIntArray434[local307];
			local305 = this.anIntArray430[local307];
			if (local66 == 1) {
				this.anIntArray423[local307] = local28.method3110();
			}
		}
		local8.anInt3822 = local149;
		local13.anInt3822 = local116;
		local18.anInt3822 = local98;
		local23.anInt3822 = local134;
		local28.anInt3822 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray91[local307] = (short) local8.method3085();
			if (local50 == 1) {
				local314 = local13.method3110();
				if ((local314 & 0x1) == 1) {
					this.aByteArray70[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray70[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray68[local307] = (byte) (local314 >> 2);
					this.aShortArray89[local307] = this.aShortArray91[local307];
					this.aShortArray91[local307] = 127;
					if (this.aShortArray89[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray68[local307] = -1;
					this.aShortArray89[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray65[local307] = local18.method3069();
			}
			if (local58 == 1) {
				this.aByteArray66[local307] = local23.method3069();
			}
			if (local62 == 1) {
				this.anIntArray428[local307] = local28.method3110();
			}
		}
		this.anInt5389 = -1;
		local8.anInt3822 = local143;
		local13.anInt3822 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method3110();
			if (local548 == 1) {
				local307 = local8.method3067() + local326;
				local314 = local8.method3067() + local307;
				local316 = local8.method3067() + local314;
				local326 = local316;
				this.anIntArray432[local336] = local307;
				this.anIntArray424[local336] = local314;
				this.anIntArray426[local336] = local316;
				if (local307 > this.anInt5389) {
					this.anInt5389 = local307;
				}
				if (local314 > this.anInt5389) {
					this.anInt5389 = local314;
				}
				if (local316 > this.anInt5389) {
					this.anInt5389 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method3067() + local326;
				local326 = local316;
				this.anIntArray432[local336] = local307;
				this.anIntArray424[local336] = local314;
				this.anIntArray426[local336] = local316;
				if (local316 > this.anInt5389) {
					this.anInt5389 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method3067() + local326;
				local326 = local316;
				this.anIntArray432[local336] = local307;
				this.anIntArray424[local336] = local314;
				this.anIntArray426[local336] = local316;
				if (local316 > this.anInt5389) {
					this.anInt5389 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method3067() + local326;
				local326 = local316;
				this.anIntArray432[local336] = local307;
				this.anIntArray424[local336] = local686;
				this.anIntArray426[local336] = local316;
				if (local316 > this.anInt5389) {
					this.anInt5389 = local316;
				}
			}
		}
		this.anInt5389++;
		local8.anInt3822 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray67[local336] = 0;
			this.aShortArray86[local336] = (short) local8.method3085();
			this.aShortArray83[local336] = (short) local8.method3085();
			this.aShortArray84[local336] = (short) local8.method3085();
		}
		if (this.aByteArray68 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray68[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray86[local686] & 0xFFFF) == this.anIntArray432[local548] && (this.aShortArray83[local686] & 0xFFFF) == this.anIntArray424[local548] && (this.aShortArray84[local686] & 0xFFFF) == this.anIntArray426[local548]) {
						this.aByteArray68[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray68 = null;
			}
		}
		if (!local3) {
			this.aShortArray89 = null;
		}
		if (!local1) {
			this.aByteArray70 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lclient!uk;")
	@Override
	public Class13 method4268() {
		return this.method4270(this.aShort41, this.aShort44, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "()V")
	public void method4278() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5391; local1++) {
			@Pc(10) int local10 = this.anIntArray430[local1];
			this.anIntArray430[local1] = this.anIntArray433[local1];
			this.anIntArray433[local1] = -local10;
		}
		this.method4297();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "()Z")
	@Override
	public boolean method4264() {
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;IS)I")
	private int method4279(@OriginalArg(0) Class13_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray433[arg1];
		@Pc(9) int local9 = arg0.anIntArray434[arg1];
		@Pc(14) int local14 = arg0.anIntArray430[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5391; local16++) {
			if (local4 == this.anIntArray433[local16] && local9 == this.anIntArray434[local16] && local14 == this.anIntArray430[local16]) {
				this.aShortArray92[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray433[this.anInt5391] = local4;
		this.anIntArray434[this.anInt5391] = local9;
		this.anIntArray430[this.anInt5391] = local14;
		this.aShortArray92[this.anInt5391] = arg2;
		if (arg0.anIntArray423 != null) {
			this.anIntArray423[this.anInt5391] = arg0.anIntArray423[arg1];
		}
		return this.anInt5391++;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIBSB)I")
	public int method4281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray432[this.anInt5390] = arg0;
		this.anIntArray424[this.anInt5390] = arg1;
		this.anIntArray426[this.anInt5390] = arg2;
		this.aByteArray70[this.anInt5390] = 1;
		this.aByteArray68[this.anInt5390] = -1;
		this.aShortArray91[this.anInt5390] = arg3;
		this.aShortArray89[this.anInt5390] = -1;
		this.aByteArray66[this.anInt5390] = arg4;
		return this.anInt5390++;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(III)V")
	public void method4283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5391; local1++) {
			this.anIntArray433[local1] = this.anIntArray433[local1] * arg0 / 128;
			this.anIntArray434[local1] = this.anIntArray434[local1] * arg1 / 128;
			this.anIntArray430[local1] = this.anIntArray430[local1] * arg2 / 128;
		}
		this.method4297();
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "([B)V")
	private void method4284(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub24 local4 = new Class4_Sub24(arg0);
		@Pc(9) Class4_Sub24 local9 = new Class4_Sub24(arg0);
		@Pc(14) Class4_Sub24 local14 = new Class4_Sub24(arg0);
		@Pc(19) Class4_Sub24 local19 = new Class4_Sub24(arg0);
		@Pc(24) Class4_Sub24 local24 = new Class4_Sub24(arg0);
		@Pc(29) Class4_Sub24 local29 = new Class4_Sub24(arg0);
		@Pc(34) Class4_Sub24 local34 = new Class4_Sub24(arg0);
		local4.anInt3822 = arg0.length - 23;
		@Pc(44) int local44 = local4.method3085();
		@Pc(48) int local48 = local4.method3085();
		@Pc(52) int local52 = local4.method3110();
		@Pc(56) int local56 = local4.method3110();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method3110();
		@Pc(82) int local82 = local4.method3110();
		@Pc(86) int local86 = local4.method3110();
		@Pc(90) int local90 = local4.method3110();
		@Pc(94) int local94 = local4.method3110();
		@Pc(98) int local98 = local4.method3085();
		@Pc(102) int local102 = local4.method3085();
		@Pc(106) int local106 = local4.method3085();
		@Pc(110) int local110 = local4.method3085();
		@Pc(114) int local114 = local4.method3085();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray67 = new byte[local52];
			local4.anInt3822 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray67[local131] = local4.method3069();
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
		this.anInt5391 = local44;
		this.anInt5390 = local48;
		this.anInt5392 = local52;
		this.anIntArray433 = new int[local44];
		this.anIntArray434 = new int[local44];
		this.anIntArray430 = new int[local44];
		this.anIntArray432 = new int[local48];
		this.anIntArray424 = new int[local48];
		this.anIntArray426 = new int[local48];
		if (local94 == 1) {
			this.anIntArray423 = new int[local44];
		}
		if (local65) {
			this.aByteArray70 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray65 = new byte[local48];
		} else {
			this.aByte21 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray66 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray428 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray89 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray68 = new byte[local48];
		}
		this.aShortArray91 = new short[local48];
		if (local52 > 0) {
			this.aShortArray86 = new short[local52];
			this.aShortArray83 = new short[local52];
			this.aShortArray84 = new short[local52];
			if (local118 > 0) {
				this.aShortArray90 = new short[local118];
				this.aShortArray85 = new short[local118];
				this.aShortArray88 = new short[local118];
				this.aByteArray69 = new byte[local118];
				this.aByteArray64 = new byte[local118];
				this.aByteArray62 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray71 = new byte[local120];
				this.aByteArray63 = new byte[local120];
			}
		}
		local4.anInt3822 = local52;
		local9.anInt3822 = local250;
		local14.anInt3822 = local256;
		local19.anInt3822 = local262;
		local24.anInt3822 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method3110();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method3067();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method3067();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method3067();
			}
			this.anIntArray433[local479] = local473 + local488;
			this.anIntArray434[local479] = local475 + local498;
			this.anIntArray430[local479] = local477 + local508;
			local473 = this.anIntArray433[local479];
			local475 = this.anIntArray434[local479];
			local477 = this.anIntArray430[local479];
			if (local94 == 1) {
				this.anIntArray423[local479] = local24.method3110();
			}
		}
		local4.anInt3822 = local242;
		local9.anInt3822 = local169;
		local14.anInt3822 = local183;
		local19.anInt3822 = local210;
		local24.anInt3822 = local192;
		local29.anInt3822 = local225;
		local34.anInt3822 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray91[local479] = (short) local4.method3085();
			if (local65) {
				this.aByteArray70[local479] = local9.method3069();
			}
			if (local78 == 255) {
				this.aByteArray65[local479] = local14.method3069();
			}
			if (local82 == 1) {
				this.aByteArray66[local479] = local19.method3069();
			}
			if (local86 == 1) {
				this.anIntArray428[local479] = local24.method3110();
			}
			if (local90 == 1) {
				this.aShortArray89[local479] = (short) (local29.method3085() - 1);
			}
			if (this.aByteArray68 != null) {
				if (this.aShortArray89[local479] == -1) {
					this.aByteArray68[local479] = -1;
				} else {
					this.aByteArray68[local479] = (byte) (local34.method3110() - 1);
				}
			}
		}
		this.anInt5389 = -1;
		local4.anInt3822 = local219;
		local9.anInt3822 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		@Pc(841) int local841;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method3110();
			if (local703 == 1) {
				local479 = local4.method3067() + local498;
				local486 = local4.method3067() + local479;
				local488 = local4.method3067() + local486;
				local498 = local488;
				this.anIntArray432[local508] = local479;
				this.anIntArray424[local508] = local486;
				this.anIntArray426[local508] = local488;
				if (local479 > this.anInt5389) {
					this.anInt5389 = local479;
				}
				if (local486 > this.anInt5389) {
					this.anInt5389 = local486;
				}
				if (local488 > this.anInt5389) {
					this.anInt5389 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method3067() + local498;
				local498 = local488;
				this.anIntArray432[local508] = local479;
				this.anIntArray424[local508] = local486;
				this.anIntArray426[local508] = local488;
				if (local488 > this.anInt5389) {
					this.anInt5389 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method3067() + local498;
				local498 = local488;
				this.anIntArray432[local508] = local479;
				this.anIntArray424[local508] = local486;
				this.anIntArray426[local508] = local488;
				if (local488 > this.anInt5389) {
					this.anInt5389 = local488;
				}
			}
			if (local703 == 4) {
				local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method3067() + local498;
				local498 = local488;
				this.anIntArray432[local508] = local479;
				this.anIntArray424[local508] = local841;
				this.anIntArray426[local508] = local488;
				if (local488 > this.anInt5389) {
					this.anInt5389 = local488;
				}
			}
		}
		this.anInt5389++;
		local4.anInt3822 = local268;
		local9.anInt3822 = local276;
		local14.anInt3822 = local284;
		local19.anInt3822 = local292;
		local24.anInt3822 = local298;
		local29.anInt3822 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray67[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray86[local508] = (short) local4.method3085();
				this.aShortArray83[local508] = (short) local4.method3085();
				this.aShortArray84[local508] = (short) local4.method3085();
			}
			if (local703 == 1) {
				this.aShortArray86[local508] = (short) local9.method3085();
				this.aShortArray83[local508] = (short) local9.method3085();
				this.aShortArray84[local508] = (short) local9.method3085();
				this.aShortArray90[local508] = (short) local14.method3085();
				this.aShortArray85[local508] = (short) local14.method3085();
				this.aShortArray88[local508] = (short) local14.method3085();
				this.aByteArray69[local508] = local19.method3069();
				this.aByteArray64[local508] = local24.method3069();
				this.aByteArray62[local508] = local29.method3069();
			}
			if (local703 == 2) {
				this.aShortArray86[local508] = (short) local9.method3085();
				this.aShortArray83[local508] = (short) local9.method3085();
				this.aShortArray84[local508] = (short) local9.method3085();
				this.aShortArray90[local508] = (short) local14.method3085();
				this.aShortArray85[local508] = (short) local14.method3085();
				this.aShortArray88[local508] = (short) local14.method3085();
				this.aByteArray69[local508] = local19.method3069();
				this.aByteArray64[local508] = local24.method3069();
				this.aByteArray62[local508] = local29.method3069();
				this.aByteArray71[local508] = local29.method3069();
				this.aByteArray63[local508] = local29.method3069();
			}
			if (local703 == 3) {
				this.aShortArray86[local508] = (short) local9.method3085();
				this.aShortArray83[local508] = (short) local9.method3085();
				this.aShortArray84[local508] = (short) local9.method3085();
				this.aShortArray90[local508] = (short) local14.method3085();
				this.aShortArray85[local508] = (short) local14.method3085();
				this.aShortArray88[local508] = (short) local14.method3085();
				this.aByteArray69[local508] = local19.method3069();
				this.aByteArray64[local508] = local24.method3069();
				this.aByteArray62[local508] = local29.method3069();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt3822 = local131;
		local508 = local4.method3110();
		if (local508 > 0) {
			this.aClass62Array3 = new Class62[local508];
			for (local703 = 0; local703 < local508; local703++) {
				local841 = local4.method3085();
				@Pc(1199) int local1199 = local4.method3085();
				this.aClass62Array3[local703] = new Class62(local841, this.anIntArray432[local1199], this.anIntArray424[local1199], this.anIntArray426[local1199]);
			}
		}
		local703 = local4.method3110();
		if (local703 > 0) {
			this.aClass88Array3 = new Class88[local703];
			for (local841 = 0; local841 < local703; local841++) {
				this.aClass88Array3[local841] = new Class88(local4.method3085(), local4.method3085());
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "()V")
	private void method4285() {
		if (this.aBoolean362) {
			return;
		}
		this.aBoolean362 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5389; local20++) {
			@Pc(29) int local29 = this.anIntArray433[local20];
			@Pc(34) int local34 = this.anIntArray434[local20];
			@Pc(39) int local39 = this.anIntArray430[local20];
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
		this.aShort39 = (short) local8;
		this.aShort42 = (short) local14;
		this.aShort38 = (short) local10;
		this.aShort37 = (short) local16;
		this.aShort40 = (short) local12;
		this.aShort43 = (short) local18;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(III)I")
	public int method4286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5391; local1++) {
			if (this.anIntArray433[local1] == arg0 && this.anIntArray434[local1] == 0 && this.anIntArray430[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray433[this.anInt5391] = arg0;
		this.anIntArray434[this.anInt5391] = 0;
		this.anIntArray430[this.anInt5391] = arg1;
		this.anInt5389 = ++this.anInt5391;
		return this.anInt5391 - 1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([[IIIIII)V")
	private void method4287(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static271.method4280(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static271.method4280(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static271.method4280(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static271.method4280(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method4298(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method4272(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method4275(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!uk;IIIZ)V")
	@Override
	public void method4261(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class13_Sub7 local2 = (Class13_Sub7) arg0;
		local2.method4285();
		local2.method4290();
		Static271.anInt5393++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray433;
		@Pc(18) int local18 = local2.anInt5389;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt5389; local20++) {
			@Pc(29) Class8 local29 = this.aClass8Array2[local20];
			if (local29.anInt150 != 0) {
				@Pc(40) int local40 = this.anIntArray434[local20] - arg2;
				if (local40 >= local2.aShort38 && local40 <= local2.aShort37) {
					@Pc(56) int local56 = this.anIntArray433[local20] - arg1;
					if (local56 >= local2.aShort39 && local56 <= local2.aShort42) {
						@Pc(72) int local72 = this.anIntArray430[local20] - arg3;
						if (local72 >= local2.aShort40 && local72 <= local2.aShort43) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class8 local91 = local2.aClass8Array2[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray430[local83] && local40 == local2.anIntArray434[local83] && local91.anInt150 != 0) {
									if (this.aClass8Array1 == null) {
										this.aClass8Array1 = new Class8[this.anInt5389];
									}
									if (local2.aClass8Array1 == null) {
										local2.aClass8Array1 = new Class8[local18];
									}
									@Pc(131) Class8 local131 = this.aClass8Array1[local20];
									if (local131 == null) {
										local131 = this.aClass8Array1[local20] = new Class8(local29);
									}
									@Pc(148) Class8 local148 = local2.aClass8Array1[local83];
									if (local148 == null) {
										local148 = local2.aClass8Array1[local83] = new Class8(local91);
									}
									local131.anInt154 += local91.anInt154;
									local131.anInt153 += local91.anInt153;
									local131.anInt151 += local91.anInt151;
									local131.anInt150 += local91.anInt150;
									local148.anInt154 += local29.anInt154;
									local148.anInt153 += local29.anInt153;
									local148.anInt151 += local29.anInt151;
									local148.anInt150 += local29.anInt150;
									local12++;
									Static271.anIntArray427[local20] = Static271.anInt5393;
									Static271.anIntArray431[local83] = Static271.anInt5393;
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
		for (local20 = 0; local20 < this.anInt5390; local20++) {
			if (Static271.anIntArray427[this.anIntArray432[local20]] == Static271.anInt5393 && Static271.anIntArray427[this.anIntArray424[local20]] == Static271.anInt5393 && Static271.anIntArray427[this.anIntArray426[local20]] == Static271.anInt5393) {
				if (this.aByteArray70 == null) {
					this.aByteArray70 = new byte[this.anInt5390];
				}
				this.aByteArray70[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt5390; local20++) {
			if (Static271.anIntArray431[local2.anIntArray432[local20]] == Static271.anInt5393 && Static271.anIntArray431[local2.anIntArray424[local20]] == Static271.anInt5393 && Static271.anIntArray431[local2.anIntArray426[local20]] == Static271.anInt5393) {
				if (local2.aByteArray70 == null) {
					local2.aByteArray70 = new byte[local2.anInt5390];
				}
				local2.aByteArray70[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!ud;")
	public Class13_Sub7 method4288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4285();
		@Pc(6) int local6 = arg4 + this.aShort39;
		@Pc(11) int local11 = arg4 + this.aShort42;
		@Pc(16) int local16 = arg6 + this.aShort40;
		@Pc(21) int local21 = arg6 + this.aShort43;
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
		@Pc(147) Class13_Sub7 local147 = new Class13_Sub7();
		local147.anInt5391 = this.anInt5391;
		local147.anInt5389 = this.anInt5389;
		local147.anInt5390 = this.anInt5390;
		local147.anInt5392 = this.anInt5392;
		local147.anIntArray432 = this.anIntArray432;
		local147.anIntArray424 = this.anIntArray424;
		local147.anIntArray426 = this.anIntArray426;
		local147.aByteArray70 = this.aByteArray70;
		local147.aByteArray65 = this.aByteArray65;
		local147.aByteArray66 = this.aByteArray66;
		local147.aByteArray68 = this.aByteArray68;
		local147.aShortArray91 = this.aShortArray91;
		local147.aShortArray89 = this.aShortArray89;
		local147.aByte21 = this.aByte21;
		local147.aByteArray67 = this.aByteArray67;
		local147.aShortArray86 = this.aShortArray86;
		local147.aShortArray83 = this.aShortArray83;
		local147.aShortArray84 = this.aShortArray84;
		local147.aShortArray90 = this.aShortArray90;
		local147.aShortArray85 = this.aShortArray85;
		local147.aShortArray88 = this.aShortArray88;
		local147.aByteArray69 = this.aByteArray69;
		local147.aByteArray64 = this.aByteArray64;
		local147.aByteArray62 = this.aByteArray62;
		local147.aByteArray71 = this.aByteArray71;
		local147.aByteArray63 = this.aByteArray63;
		local147.anIntArray423 = this.anIntArray423;
		local147.anIntArray428 = this.anIntArray428;
		local147.anIntArrayArray36 = this.anIntArrayArray36;
		local147.anIntArrayArray35 = this.anIntArrayArray35;
		local147.aShort41 = this.aShort41;
		local147.aShort44 = this.aShort44;
		local147.aClass8Array2 = this.aClass8Array2;
		local147.aClass81Array1 = this.aClass81Array1;
		local147.aClass8Array1 = this.aClass8Array1;
		local147.aClass62Array3 = this.aClass62Array3;
		local147.aClass88Array3 = this.aClass88Array3;
		if (arg0 == 3) {
			local147.anIntArray433 = Static162.method2610(this.anIntArray433);
			local147.anIntArray434 = Static162.method2610(this.anIntArray434);
			local147.anIntArray430 = Static162.method2610(this.anIntArray430);
		} else {
			local147.anIntArray433 = this.anIntArray433;
			local147.anIntArray434 = new int[local147.anInt5391];
			local147.anIntArray430 = this.anIntArray430;
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
			for (local338 = 0; local338 < local147.anInt5389; local338++) {
				local349 = this.anIntArray433[local338] + arg4;
				local356 = this.anIntArray430[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
				local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
				local432 = local394 * (128 - local364) + local420 * local364 >> 7;
				local147.anIntArray434[local338] = this.anIntArray434[local338] + local432 - arg5;
			}
			for (local338 = local147.anInt5389; local338 < local147.anInt5391; local338++) {
				local349 = this.anIntArray433[local338] + arg4;
				local356 = this.anIntArray430[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				if (local368 >= 0 && local368 < arg2.length - 1 && local372 >= 0 && local372 < arg2[0].length - 1) {
					local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
					local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
					local432 = local394 * (128 - local364) + local420 * local364 >> 7;
					local147.anIntArray434[local338] = this.anIntArray434[local338] + local432 - arg5;
				}
			}
		} else {
			@Pc(689) int local689;
			if (arg0 == 2) {
				for (local338 = 0; local338 < local147.anInt5389; local338++) {
					local349 = (this.anIntArray434[local338] << 16) / this.aShort38;
					if (local349 < arg1) {
						local356 = this.anIntArray433[local338] + arg4;
						local360 = this.anIntArray430[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray434[local338] = this.anIntArray434[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
					} else {
						local147.anIntArray434[local338] = this.anIntArray434[local338];
					}
				}
				for (local338 = local147.anInt5389; local338 < local147.anInt5391; local338++) {
					local349 = (this.anIntArray434[local338] << 16) / this.aShort38;
					if (local349 < arg1) {
						local356 = this.anIntArray433[local338] + arg4;
						local360 = this.anIntArray430[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						if (local372 >= 0 && local372 < arg2.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1) {
							local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
							local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
							local689 = local420 * (128 - local368) + local432 * local368 >> 7;
							local147.anIntArray434[local338] = this.anIntArray434[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
						}
					} else {
						local147.anIntArray434[local338] = this.anIntArray434[local338];
					}
				}
			} else if (arg0 == 3) {
				local338 = (arg1 & 0xFF) * 4;
				local349 = (arg1 >> 8 & 0xFF) * 4;
				local147.method4287(arg2, arg4, arg5, arg6, local338, local349);
			} else if (arg0 == 4) {
				local338 = this.aShort37 - this.aShort38;
				for (local349 = 0; local349 < this.anInt5389; local349++) {
					local356 = this.anIntArray433[local349] + arg4;
					local360 = this.anIntArray430[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local147.anIntArray434[local349] = this.anIntArray434[local349] + local689 + local338 - arg5;
				}
				for (local349 = local147.anInt5389; local349 < local147.anInt5391; local349++) {
					local356 = this.anIntArray433[local349] + arg4;
					local360 = this.anIntArray430[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg3[0].length - 1) {
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray434[local349] = this.anIntArray434[local349] + local689 + local338 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local338 = this.aShort37 - this.aShort38;
				@Pc(1322) int local1322;
				@Pc(1326) int local1326;
				for (local349 = 0; local349 < this.anInt5389; local349++) {
					local356 = this.anIntArray433[local349] + arg4;
					local360 = this.anIntArray430[local349] + arg6;
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
					local147.anIntArray434[local349] = ((this.anIntArray434[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
				}
				for (local349 = local147.anInt5389; local349 < local147.anInt5391; local349++) {
					local356 = this.anIntArray433[local349] + arg4;
					local360 = this.anIntArray430[local349] + arg6;
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
						local147.anIntArray434[local349] = ((this.anIntArray434[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
					}
				}
			}
		}
		this.aBoolean362 = false;
		return local147;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(IIIII)Lclient!bb;")
	public Class13_Sub1_Sub1 method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class13_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "()V")
	public void method4290() {
		if (this.aClass8Array2 != null) {
			return;
		}
		this.aClass8Array2 = new Class8[this.anInt5389];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt5389; local10++) {
			this.aClass8Array2[local10] = new Class8();
		}
		for (local10 = 0; local10 < this.anInt5390; local10++) {
			@Pc(34) int local34 = this.anIntArray432[local10];
			@Pc(39) int local39 = this.anIntArray424[local10];
			@Pc(44) int local44 = this.anIntArray426[local10];
			@Pc(54) int local54 = this.anIntArray433[local39] - this.anIntArray433[local34];
			@Pc(64) int local64 = this.anIntArray434[local39] - this.anIntArray434[local34];
			@Pc(74) int local74 = this.anIntArray430[local39] - this.anIntArray430[local34];
			@Pc(84) int local84 = this.anIntArray433[local44] - this.anIntArray433[local34];
			@Pc(94) int local94 = this.anIntArray434[local44] - this.anIntArray434[local34];
			@Pc(104) int local104 = this.anIntArray430[local44] - this.anIntArray430[local34];
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
			if (this.aByteArray70 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray70[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class8 local214 = this.aClass8Array2[local34];
				local214.anInt154 += local112;
				local214.anInt153 += local120;
				local214.anInt151 += local128;
				local214.anInt150++;
				@Pc(243) Class8 local243 = this.aClass8Array2[local39];
				local243.anInt154 += local112;
				local243.anInt153 += local120;
				local243.anInt151 += local128;
				local243.anInt150++;
				@Pc(272) Class8 local272 = this.aClass8Array2[local44];
				local272.anInt154 += local112;
				local272.anInt153 += local120;
				local272.anInt151 += local128;
				local272.anInt150++;
			} else if (local201 == 1) {
				if (this.aClass81Array1 == null) {
					this.aClass81Array1 = new Class81[this.anInt5390];
				}
				@Pc(317) Class81 local317 = this.aClass81Array1[local10] = new Class81();
				local317.anInt2514 = local112;
				local317.anInt2517 = local120;
				local317.anInt2516 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(SS)V")
	public void method4291(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray89 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt5390; local5++) {
			if (this.aShortArray89[local5] == arg0) {
				this.aShortArray89[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(III)V")
	public void method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static271.anIntArray425[arg2];
			local9 = Static271.anIntArray429[arg2];
			for (local11 = 0; local11 < this.anInt5391; local11++) {
				local31 = this.anIntArray434[local11] * local5 + this.anIntArray433[local11] * local9 >> 16;
				this.anIntArray434[local11] = this.anIntArray434[local11] * local9 - this.anIntArray433[local11] * local5 >> 16;
				this.anIntArray433[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static271.anIntArray425[arg0];
			local9 = Static271.anIntArray429[arg0];
			for (local11 = 0; local11 < this.anInt5391; local11++) {
				local31 = this.anIntArray434[local11] * local9 - this.anIntArray430[local11] * local5 >> 16;
				this.anIntArray430[local11] = this.anIntArray434[local11] * local5 + this.anIntArray430[local11] * local9 >> 16;
				this.anIntArray434[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static271.anIntArray425[arg1];
		local9 = Static271.anIntArray429[arg1];
		for (local11 = 0; local11 < this.anInt5391; local11++) {
			local31 = this.anIntArray430[local11] * local5 + this.anIntArray433[local11] * local9 >> 16;
			this.anIntArray430[local11] = this.anIntArray430[local11] * local9 - this.anIntArray433[local11] * local5 >> 16;
			this.anIntArray433[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "()V")
	public void method4294() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray423 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt5391; local9++) {
				local18 = this.anIntArray423[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray36 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray36[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt5391) {
				local18 = this.anIntArray423[local9];
				this.anIntArrayArray36[local18][local5[local18]++] = local9++;
			}
			this.anIntArray423 = null;
		}
		if (this.anIntArray428 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt5390; local9++) {
			local18 = this.anIntArray428[local9];
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
		while (local9 < this.anInt5390) {
			local18 = this.anIntArray428[local9];
			this.anIntArrayArray35[local18][local5[local18]++] = local9++;
		}
		this.anIntArray428 = null;
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "()V")
	public void method4295() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5391; local1++) {
			this.anIntArray430[local1] = -this.anIntArray430[local1];
		}
		for (local1 = 0; local1 < this.anInt5390; local1++) {
			@Pc(27) int local27 = this.anIntArray432[local1];
			this.anIntArray432[local1] = this.anIntArray426[local1];
			this.anIntArray426[local1] = local27;
		}
		this.method4297();
	}

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "()V")
	public void method4296() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5391; local1++) {
			@Pc(10) int local10 = this.anIntArray433[local1];
			this.anIntArray433[local1] = this.anIntArray430[local1];
			this.anIntArray430[local1] = -local10;
		}
		this.method4297();
	}

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "()V")
	private void method4297() {
		this.aClass8Array2 = null;
		this.aClass8Array1 = null;
		this.aClass81Array1 = null;
		this.aBoolean362 = false;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	private void method4298(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static271.anIntArray425[arg0];
		@Pc(7) int local7 = Static271.anIntArray429[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5391; local9++) {
			@Pc(29) int local29 = this.anIntArray434[local9] * local7 - this.anIntArray430[local9] * local3 >> 16;
			this.anIntArray430[local9] = this.anIntArray434[local9] * local3 + this.anIntArray430[local9] * local7 >> 16;
			this.anIntArray434[local9] = local29;
		}
		this.method4297();
	}
}
