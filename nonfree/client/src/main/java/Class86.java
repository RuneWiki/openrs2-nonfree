import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class86 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "[I")
	public int[] anIntArray240;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
	public int[] anIntArray241;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "[I")
	public int[] anIntArray243;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "[I")
	public int[] anIntArray245;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "[I")
	public int[] anIntArray246;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "[Lclient!ia;")
	public Class129[] aClass129Array3;

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "[Lclient!bd;")
	public Class26[] aClass26Array1;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "[Lclient!lh;")
	public Class178[] aClass178Array3;

	@OriginalMember(owner = "client!fd", name = "fb", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public int anInt3054 = 0;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
	public int anInt3066 = 0;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
	public int anInt3071 = 12;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
	public int anInt3059 = 0;

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "B")
	public byte aByte23 = 0;

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
	public int anInt3068 = 0;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
	public Class86(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2803(arg0);
		} else {
			this.method2798(arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(III)V")
	public Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray34 = new byte[arg1];
		this.aShortArray40 = new short[arg1];
		this.anIntArray243 = new int[arg0];
		this.aByteArray37 = new byte[arg1];
		this.aShortArray45 = new short[arg1];
		this.anIntArray246 = new int[arg0];
		this.anIntArray241 = new int[arg1];
		this.aShortArray46 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray245 = new int[arg2];
			this.anIntArray242 = new int[arg2];
			this.anIntArray250 = new int[arg2];
			this.anIntArray248 = new int[arg2];
			this.aShortArray41 = new short[arg2];
			this.anIntArray244 = new int[arg2];
			this.aByteArray38 = new byte[arg2];
			this.aByteArray40 = new byte[arg2];
			this.aShortArray43 = new short[arg2];
			this.aShortArray39 = new short[arg2];
			this.anIntArray240 = new int[arg2];
			this.aByteArray39 = new byte[arg2];
		}
		this.aShortArray44 = new short[arg1];
		this.anIntArray249 = new int[arg0];
		this.aShortArray37 = new short[arg1];
		this.aByteArray35 = new byte[arg1];
		this.anIntArray251 = new int[arg0];
		this.aByteArray36 = new byte[arg1];
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([Lclient!fd;I)V")
	public Class86(@OriginalArg(0) Class86[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3059 = 0;
		this.anInt3068 = 0;
		this.anInt3054 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		this.aByte23 = -1;
		@Pc(49) boolean local49 = false;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class86 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt3054 += local56.anInt3054;
				this.anInt3059 += local56.anInt3059;
				this.anInt3068 += local56.anInt3068;
				if (local56.aClass178Array3 != null) {
					local30 += local56.aClass178Array3.length;
				}
				local36 |= local56.aByteArray35 != null;
				if (local56.aClass26Array1 != null) {
					local34 += local56.aClass26Array1.length;
				}
				if (local56.aClass129Array3 != null) {
					local32 += local56.aClass129Array3.length;
				}
				local40 |= local56.aByteArray34 != null;
				local42 |= local56.aByteArray37 != null;
				local49 |= local56.anIntArray241 != null;
				if (local56.aByteArray36 == null) {
					if (this.aByte23 == -1) {
						this.aByte23 = local56.aByte23;
					}
					if (local56.aByte23 != this.aByte23) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local44 |= local56.aShortArray40 != null;
			}
		}
		this.aShortArray37 = new short[this.anInt3068];
		if (local49) {
			this.anIntArray241 = new int[this.anInt3068];
		}
		if (local36) {
			this.aByteArray35 = new byte[this.anInt3068];
		}
		this.aShortArray42 = new short[this.anInt3059];
		this.anIntArray243 = new int[this.anInt3059];
		this.aShortArray45 = new short[this.anInt3068];
		if (local34 > 0) {
			this.aClass26Array1 = new Class26[local34];
		}
		this.anIntArray249 = new int[this.anInt3059];
		if (local30 > 0) {
			this.aClass178Array3 = new Class178[local30];
		}
		if (local44) {
			this.aShortArray40 = new short[this.anInt3068];
		}
		if (this.anInt3054 > 0) {
			this.anIntArray242 = new int[this.anInt3054];
			this.anIntArray244 = new int[this.anInt3054];
			this.aShortArray39 = new short[this.anInt3054];
			this.aShortArray43 = new short[this.anInt3054];
			this.anIntArray245 = new int[this.anInt3054];
			this.aByteArray38 = new byte[this.anInt3054];
			this.aByteArray40 = new byte[this.anInt3054];
			this.aByteArray39 = new byte[this.anInt3054];
			this.anIntArray248 = new int[this.anInt3054];
			this.aShortArray41 = new short[this.anInt3054];
			this.anIntArray250 = new int[this.anInt3054];
			this.anIntArray240 = new int[this.anInt3054];
		}
		if (local38) {
			this.aByteArray36 = new byte[this.anInt3068];
		}
		this.aShortArray44 = new short[this.anInt3068];
		this.anIntArray246 = new int[this.anInt3059];
		if (local42) {
			this.aByteArray37 = new byte[this.anInt3068];
		}
		this.anIntArray251 = new int[this.anInt3059];
		if (local40) {
			this.aByteArray34 = new byte[this.anInt3068];
		}
		this.aShortArray46 = new short[this.anInt3068];
		this.aShortArray38 = new short[this.anInt3068];
		if (local32 > 0) {
			this.aClass129Array3 = new Class129[local32];
		}
		this.anInt3054 = 0;
		local34 = 0;
		this.anInt3059 = 0;
		local32 = 0;
		this.anInt3068 = 0;
		local30 = 0;
		@Pc(611) int local611;
		@Pc(622) int local622;
		for (@Pc(381) int local381 = 0; local381 < arg1; local381++) {
			@Pc(387) short local387 = (short) (0x1 << local381);
			@Pc(391) Class86 local391 = arg0[local381];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass26Array1 != null) {
					for (local398 = 0; local398 < local391.aClass26Array1.length; local398++) {
						@Pc(404) Class26 local404 = local391.aClass26Array1[local398];
						this.aClass26Array1[local34++] = local404.method1224(local404.anInt1199 + this.anInt3068);
					}
				}
				for (local398 = 0; local398 < local391.anInt3068; local398++) {
					if (local36 && local391.aByteArray35 != null) {
						this.aByteArray35[this.anInt3068] = local391.aByteArray35[local398];
					}
					if (local38) {
						if (local391.aByteArray36 == null) {
							this.aByteArray36[this.anInt3068] = local391.aByte23;
						} else {
							this.aByteArray36[this.anInt3068] = local391.aByteArray36[local398];
						}
					}
					if (local40 && local391.aByteArray34 != null) {
						this.aByteArray34[this.anInt3068] = local391.aByteArray34[local398];
					}
					if (local44) {
						if (local391.aShortArray40 == null) {
							this.aShortArray40[this.anInt3068] = -1;
						} else {
							this.aShortArray40[this.anInt3068] = local391.aShortArray40[local398];
						}
					}
					if (local49) {
						if (local391.anIntArray241 == null) {
							this.anIntArray241[this.anInt3068] = -1;
						} else {
							this.anIntArray241[this.anInt3068] = local391.anIntArray241[local398];
						}
					}
					this.aShortArray37[this.anInt3068] = (short) this.method2807(local387, local391, local391.aShortArray37[local398]);
					this.aShortArray44[this.anInt3068] = (short) this.method2807(local387, local391, local391.aShortArray44[local398]);
					this.aShortArray46[this.anInt3068] = (short) this.method2807(local387, local391, local391.aShortArray46[local398]);
					this.aShortArray38[this.anInt3068] = local387;
					this.aShortArray45[this.anInt3068] = local391.aShortArray45[local398];
					this.anInt3068++;
				}
				@Pc(599) int local599;
				if (local391.aClass178Array3 != null) {
					for (local599 = 0; local599 < local391.aClass178Array3.length; local599++) {
						local611 = this.method2807(local387, local391, local391.aClass178Array3[local599].anInt5394);
						local622 = this.method2807(local387, local391, local391.aClass178Array3[local599].anInt5388);
						@Pc(633) int local633 = this.method2807(local387, local391, local391.aClass178Array3[local599].anInt5386);
						this.aClass178Array3[local30] = local391.aClass178Array3[local599].method4675(local633, local622, local611);
						local30++;
					}
				}
				if (local391.aClass129Array3 != null) {
					for (local599 = 0; local599 < local391.aClass129Array3.length; local599++) {
						local611 = this.method2807(local387, local391, local391.aClass129Array3[local599].anInt4062);
						this.aClass129Array3[local32] = local391.aClass129Array3[local599].method3625(local611);
						local32++;
					}
				}
			}
		}
		@Pc(698) int local698 = 0;
		this.anInt3066 = this.anInt3059;
		for (@Pc(704) int local704 = 0; local704 < arg1; local704++) {
			@Pc(710) short local710 = (short) (0x1 << local704);
			@Pc(714) Class86 local714 = arg0[local704];
			if (local714 != null) {
				for (local611 = 0; local611 < local714.anInt3068; local611++) {
					if (local42) {
						this.aByteArray37[local698++] = (byte) (local714.aByteArray37 == null || local714.aByteArray37[local611] == -1 ? -1 : this.anInt3054 + local714.aByteArray37[local611]);
					}
				}
				for (local622 = 0; local622 < local714.anInt3054; local622++) {
					@Pc(765) byte local765 = this.aByteArray38[this.anInt3054] = local714.aByteArray38[local622];
					if (local765 == 0) {
						this.aShortArray43[this.anInt3054] = (short) this.method2807(local710, local714, local714.aShortArray43[local622]);
						this.aShortArray41[this.anInt3054] = (short) this.method2807(local710, local714, local714.aShortArray41[local622]);
						this.aShortArray39[this.anInt3054] = (short) this.method2807(local710, local714, local714.aShortArray39[local622]);
					}
					if (local765 >= 1 && local765 <= 3) {
						this.aShortArray43[this.anInt3054] = local714.aShortArray43[local622];
						this.aShortArray41[this.anInt3054] = local714.aShortArray41[local622];
						this.aShortArray39[this.anInt3054] = local714.aShortArray39[local622];
						this.anIntArray242[this.anInt3054] = local714.anIntArray242[local622];
						this.anIntArray250[this.anInt3054] = local714.anIntArray250[local622];
						this.anIntArray248[this.anInt3054] = local714.anIntArray248[local622];
						this.aByteArray39[this.anInt3054] = local714.aByteArray39[local622];
						this.aByteArray40[this.anInt3054] = local714.aByteArray40[local622];
						this.anIntArray245[this.anInt3054] = local714.anIntArray245[local622];
					}
					if (local765 == 2) {
						this.anIntArray240[this.anInt3054] = local714.anIntArray240[local622];
						this.anIntArray244[this.anInt3054] = local714.anIntArray244[local622];
					}
					this.anInt3054++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBI)V")
	public void method2792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt3059; local15++) {
			this.anIntArray251[local15] += arg0;
			this.anIntArray249[local15] += arg2;
			this.anIntArray246[local15] += arg1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)[[I")
	public int[][] method2794(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt3059 : this.anInt3066;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray243[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(42) int local42 = local8[local27]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(68) int local68 = 0; local68 <= local10; local68++) {
			local58[local68] = new int[local8[local68]];
			local8[local68] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < local18; local87++) {
			@Pc(94) int local94 = this.anIntArray243[local87];
			if (local94 >= 0) {
				local58[local94][local8[local94]++] = local87;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public void method2795() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3059; local1++) {
			this.anIntArray251[local1] <<= 0x0;
			this.anIntArray249[local1] <<= 0x0;
			this.anIntArray246[local1] <<= 0x0;
		}
		if (this.anInt3054 <= 0 || this.anIntArray242 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray242.length; local50++) {
			this.anIntArray242[local50] <<= 0x0;
			this.anIntArray250[local50] <<= 0x0;
			if (this.aByteArray38[local50] != 1) {
				this.anIntArray248[local50] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)[[I")
	public int[][] method2796() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass26Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass26Array1[local12].anInt1205;
			if (local20 >= 0) {
				@Pc(29) int local29 = local8[local20]++;
				if (local20 > local10) {
					local10 = local20;
				}
			}
		}
		@Pc(62) int[][] local62 = new int[local10 + 1][];
		for (@Pc(64) int local64 = 0; local64 <= local10; local64++) {
			local62[local64] = new int[local8[local64]];
			local8[local64] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < this.aClass26Array1.length; local87++) {
			@Pc(95) int local95 = this.aClass26Array1[local87].anInt1205;
			if (local95 >= 0) {
				local62[local95][local8[local95]++] = local87;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
	public void method2797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(15) int local15;
		@Pc(32) int local32;
		if (arg1 != 0) {
			local9 = Class307.anIntArray744[arg1];
			local13 = Class307.anIntArray743[arg1];
			for (local15 = 0; local15 < this.anInt3059; local15++) {
				local32 = this.anIntArray249[local15] * local9 + local13 * this.anIntArray251[local15] >> 15;
				this.anIntArray249[local15] = local13 * this.anIntArray249[local15] - this.anIntArray251[local15] * local9 >> 15;
				this.anIntArray251[local15] = local32;
			}
		}
		if (arg0 != 0) {
			local9 = Class307.anIntArray744[arg0];
			local13 = Class307.anIntArray743[arg0];
			for (local15 = 0; local15 < this.anInt3059; local15++) {
				local32 = this.anIntArray249[local15] * local13 - local9 * this.anIntArray246[local15] >> 15;
				this.anIntArray246[local15] = this.anIntArray249[local15] * local9 + this.anIntArray246[local15] * local13 >> 15;
				this.anIntArray249[local15] = local32;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local9 = Class307.anIntArray744[arg2];
		local13 = Class307.anIntArray743[arg2];
		for (local15 = 0; local15 < this.anInt3059; local15++) {
			local32 = local9 * this.anIntArray246[local15] + local13 * this.anIntArray251[local15] >> 15;
			this.anIntArray246[local15] = local13 * this.anIntArray246[local15] - this.anIntArray251[local15] * local9 >> 15;
			this.anIntArray251[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[B)V")
	private void method2798(@OriginalArg(1) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class1_Sub13 local12 = new Class1_Sub13(arg0);
		@Pc(17) Class1_Sub13 local17 = new Class1_Sub13(arg0);
		@Pc(22) Class1_Sub13 local22 = new Class1_Sub13(arg0);
		@Pc(27) Class1_Sub13 local27 = new Class1_Sub13(arg0);
		@Pc(32) Class1_Sub13 local32 = new Class1_Sub13(arg0);
		local12.anInt3400 = arg0.length - 18;
		this.anInt3059 = local12.method3056();
		this.anInt3068 = local12.method3056();
		this.anInt3054 = local12.method3043();
		@Pc(67) int local67 = local12.method3043();
		@Pc(71) int local71 = local12.method3043();
		@Pc(75) int local75 = local12.method3043();
		@Pc(79) int local79 = local12.method3043();
		@Pc(83) int local83 = local12.method3043();
		@Pc(87) int local87 = local12.method3056();
		@Pc(91) int local91 = local12.method3056();
		@Pc(95) int local95 = local12.method3056();
		@Pc(99) int local99 = local12.method3056();
		@Pc(108) int local108 = this.anInt3059;
		@Pc(110) int local110 = local108;
		local108 += this.anInt3068;
		@Pc(117) int local117 = local108;
		if (local71 == 255) {
			local108 += this.anInt3068;
		}
		@Pc(127) int local127 = local108;
		if (local79 == 1) {
			local108 += this.anInt3068;
		}
		@Pc(139) int local139 = local108;
		if (local67 == 1) {
			local108 += this.anInt3068;
		}
		@Pc(151) int local151 = local108;
		if (local83 == 1) {
			local108 += this.anInt3059;
		}
		@Pc(161) int local161 = local108;
		if (local75 == 1) {
			local108 += this.anInt3068;
		}
		@Pc(171) int local171 = local108;
		local108 += local99;
		@Pc(177) int local177 = local108;
		local108 += this.anInt3068 * 2;
		@Pc(186) int local186 = local108;
		local108 += this.anInt3054 * 6;
		@Pc(195) int local195 = local108;
		local108 += local87;
		@Pc(201) int local201 = local108;
		local108 += local91;
		local12.anInt3400 = 0;
		this.aShortArray37 = new short[this.anInt3068];
		this.anIntArray246 = new int[this.anInt3059];
		this.aShortArray46 = new short[this.anInt3068];
		if (local79 == 1) {
			this.anIntArray241 = new int[this.anInt3068];
		}
		if (local67 == 1) {
			this.aByteArray35 = new byte[this.anInt3068];
			this.aByteArray37 = new byte[this.anInt3068];
			this.aShortArray40 = new short[this.anInt3068];
		}
		this.aShortArray45 = new short[this.anInt3068];
		this.aShortArray44 = new short[this.anInt3068];
		if (local83 == 1) {
			this.anIntArray243 = new int[this.anInt3059];
		}
		if (local75 == 1) {
			this.aByteArray34 = new byte[this.anInt3068];
		}
		this.anIntArray249 = new int[this.anInt3059];
		if (this.anInt3054 > 0) {
			this.aByteArray38 = new byte[this.anInt3054];
			this.aShortArray41 = new short[this.anInt3054];
			this.aShortArray43 = new short[this.anInt3054];
			this.aShortArray39 = new short[this.anInt3054];
		}
		if (local71 == 255) {
			this.aByteArray36 = new byte[this.anInt3068];
		} else {
			this.aByte23 = (byte) local71;
		}
		this.anIntArray251 = new int[this.anInt3059];
		local17.anInt3400 = local195;
		local22.anInt3400 = local201;
		local27.anInt3400 = local108;
		local32.anInt3400 = local151;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(357) int local357;
		@Pc(359) int local359;
		for (@Pc(352) int local352 = 0; local352 < this.anInt3059; local352++) {
			local357 = local12.method3043();
			local359 = 0;
			if ((local357 & 0x1) != 0) {
				local359 = local17.method3078();
			}
			@Pc(369) int local369 = 0;
			if ((local357 & 0x2) != 0) {
				local369 = local22.method3078();
			}
			@Pc(382) int local382 = 0;
			if ((local357 & 0x4) != 0) {
				local382 = local27.method3078();
			}
			this.anIntArray251[local352] = local359 + local346;
			this.anIntArray249[local352] = local369 + local348;
			this.anIntArray246[local352] = local382 + local350;
			local350 = this.anIntArray246[local352];
			local348 = this.anIntArray249[local352];
			local346 = this.anIntArray251[local352];
			if (local83 == 1) {
				this.anIntArray243[local352] = local32.method3043();
			}
		}
		local12.anInt3400 = local177;
		local17.anInt3400 = local139;
		local22.anInt3400 = local117;
		local27.anInt3400 = local161;
		local32.anInt3400 = local127;
		for (local357 = 0; local357 < this.anInt3068; local357++) {
			this.aShortArray45[local357] = (short) local12.method3056();
			if (local67 == 1) {
				local359 = local17.method3043();
				if ((local359 & 0x1) == 1) {
					this.aByteArray35[local357] = 1;
					local5 = true;
				} else {
					this.aByteArray35[local357] = 0;
				}
				if ((local359 & 0x2) == 2) {
					this.aByteArray37[local357] = (byte) (local359 >> 2);
					this.aShortArray40[local357] = this.aShortArray45[local357];
					this.aShortArray45[local357] = 127;
					if (this.aShortArray40[local357] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray37[local357] = -1;
					this.aShortArray40[local357] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray36[local357] = local22.method3073();
			}
			if (local75 == 1) {
				this.aByteArray34[local357] = local27.method3073();
			}
			if (local79 == 1) {
				this.anIntArray241[local357] = local32.method3043();
			}
		}
		this.anInt3066 = -1;
		local12.anInt3400 = local171;
		local17.anInt3400 = local110;
		@Pc(598) short local598 = 0;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(611) int local611;
		for (@Pc(606) int local606 = 0; local606 < this.anInt3068; local606++) {
			local611 = local17.method3043();
			if (local611 == 1) {
				local598 = (short) (local604 + local12.method3078());
				local600 = (short) (local598 + local12.method3078());
				local602 = (short) (local12.method3078() + local600);
				this.aShortArray37[local606] = local598;
				local604 = local602;
				this.aShortArray44[local606] = local600;
				this.aShortArray46[local606] = local602;
				if (this.anInt3066 < local598) {
					this.anInt3066 = local598;
				}
				if (this.anInt3066 < local600) {
					this.anInt3066 = local600;
				}
				if (this.anInt3066 < local602) {
					this.anInt3066 = local602;
				}
			}
			if (local611 == 2) {
				local600 = local602;
				local602 = (short) (local12.method3078() + local604);
				this.aShortArray37[local606] = local598;
				local604 = local602;
				this.aShortArray44[local606] = local600;
				this.aShortArray46[local606] = local602;
				if (local602 > this.anInt3066) {
					this.anInt3066 = local602;
				}
			}
			if (local611 == 3) {
				local598 = local602;
				local602 = (short) (local12.method3078() + local604);
				this.aShortArray37[local606] = local598;
				local604 = local602;
				this.aShortArray44[local606] = local600;
				this.aShortArray46[local606] = local602;
				if (local602 > this.anInt3066) {
					this.anInt3066 = local602;
				}
			}
			if (local611 == 4) {
				@Pc(766) short local766 = local598;
				local598 = local600;
				local602 = (short) (local12.method3078() + local604);
				local600 = local766;
				this.aShortArray37[local606] = local598;
				local604 = local602;
				this.aShortArray44[local606] = local766;
				this.aShortArray46[local606] = local602;
				if (local602 > this.anInt3066) {
					this.anInt3066 = local602;
				}
			}
		}
		local12.anInt3400 = local186;
		this.anInt3066++;
		for (local611 = 0; local611 < this.anInt3054; local611++) {
			this.aByteArray38[local611] = 0;
			this.aShortArray43[local611] = (short) local12.method3056();
			this.aShortArray41[local611] = (short) local12.method3056();
			this.aShortArray39[local611] = (short) local12.method3056();
		}
		if (this.aByteArray37 != null) {
			@Pc(861) boolean local861 = false;
			for (@Pc(863) int local863 = 0; local863 < this.anInt3068; local863++) {
				@Pc(871) int local871 = this.aByteArray37[local863] & 0xFF;
				if (local871 != 255) {
					if (this.aShortArray37[local863] == (this.aShortArray43[local871] & 0xFFFF) && this.aShortArray44[local863] == (this.aShortArray41[local871] & 0xFFFF) && (this.aShortArray39[local871] & 0xFFFF) == this.aShortArray46[local863]) {
						this.aByteArray37[local863] = -1;
					} else {
						local861 = true;
					}
				}
			}
			if (!local861) {
				this.aByteArray37 = null;
			}
		}
		if (!local5) {
			this.aByteArray35 = null;
		}
		if (!local7) {
			this.aShortArray40 = null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(SBS)V")
	public void method2799(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3068; local1++) {
			if (arg0 == this.aShortArray45[local1]) {
				this.aShortArray45[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(SSBBBSBSSS)B")
	public byte method2801() {
		if (this.anInt3054 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray38[this.anInt3054] = 3;
		this.aShortArray43[this.anInt3054] = 0;
		this.aShortArray41[this.anInt3054] = 32767;
		this.aShortArray39[this.anInt3054] = 0;
		this.anIntArray242[this.anInt3054] = 1024;
		this.anIntArray250[this.anInt3054] = 1024;
		this.anIntArray248[this.anInt3054] = 1024;
		this.aByteArray39[this.anInt3054] = 0;
		this.aByteArray40[this.anInt3054] = 0;
		this.anIntArray245[this.anInt3054] = 0;
		return (byte) this.anInt3054++;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([BI)V")
	private void method2803(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg0);
		@Pc(13) Class1_Sub13 local13 = new Class1_Sub13(arg0);
		@Pc(18) Class1_Sub13 local18 = new Class1_Sub13(arg0);
		@Pc(23) Class1_Sub13 local23 = new Class1_Sub13(arg0);
		@Pc(28) Class1_Sub13 local28 = new Class1_Sub13(arg0);
		@Pc(33) Class1_Sub13 local33 = new Class1_Sub13(arg0);
		@Pc(38) Class1_Sub13 local38 = new Class1_Sub13(arg0);
		local8.anInt3400 = arg0.length - 23;
		this.anInt3059 = local8.method3056();
		this.anInt3068 = local8.method3056();
		this.anInt3054 = local8.method3043();
		@Pc(63) int local63 = local8.method3043();
		@Pc(72) boolean local72 = (local63 & 0x1) == 1;
		@Pc(81) boolean local81 = (local63 & 0x2) == 2;
		@Pc(92) boolean local92 = (local63 & 0x4) == 4;
		@Pc(101) boolean local101 = (local63 & 0x8) == 8;
		if (local101) {
			local8.anInt3400 -= 7;
			this.anInt3071 = local8.method3043();
			local8.anInt3400 += 6;
		}
		@Pc(124) int local124 = local8.method3043();
		@Pc(128) int local128 = local8.method3043();
		@Pc(132) int local132 = local8.method3043();
		@Pc(136) int local136 = local8.method3043();
		@Pc(140) int local140 = local8.method3043();
		@Pc(144) int local144 = local8.method3056();
		@Pc(148) int local148 = local8.method3056();
		@Pc(152) int local152 = local8.method3056();
		@Pc(156) int local156 = local8.method3056();
		@Pc(160) int local160 = local8.method3056();
		@Pc(162) int local162 = 0;
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(182) int local182;
		if (this.anInt3054 > 0) {
			local8.anInt3400 = 0;
			this.aByteArray38 = new byte[this.anInt3054];
			for (local182 = 0; local182 < this.anInt3054; local182++) {
				@Pc(192) byte local192 = this.aByteArray38[local182] = local8.method3073();
				if (local192 >= 1 && local192 <= 3) {
					local164++;
				}
				if (local192 == 2) {
					local166++;
				}
				if (local192 == 0) {
					local162++;
				}
			}
		}
		local182 = this.anInt3054;
		@Pc(218) int local218 = local182;
		local182 += this.anInt3059;
		@Pc(225) int local225 = local182;
		if (local72) {
			local182 += this.anInt3068;
		}
		@Pc(234) int local234 = local182;
		local182 += this.anInt3068;
		@Pc(241) int local241 = local182;
		if (local124 == 255) {
			local182 += this.anInt3068;
		}
		@Pc(251) int local251 = local182;
		if (local132 == 1) {
			local182 += this.anInt3068;
		}
		@Pc(263) int local263 = local182;
		if (local140 == 1) {
			local182 += this.anInt3059;
		}
		@Pc(273) int local273 = local182;
		if (local128 == 1) {
			local182 += this.anInt3068;
		}
		@Pc(285) int local285 = local182;
		local182 += local156;
		@Pc(291) int local291 = local182;
		if (local136 == 1) {
			local182 += this.anInt3068 * 2;
		}
		@Pc(305) int local305 = local182;
		local182 += local160;
		@Pc(311) int local311 = local182;
		local182 += this.anInt3068 * 2;
		@Pc(320) int local320 = local182;
		local182 += local144;
		@Pc(326) int local326 = local182;
		local182 += local148;
		@Pc(332) int local332 = local182;
		local182 += local152;
		@Pc(338) int local338 = local182;
		local182 += local162 * 6;
		@Pc(346) int local346 = local182;
		local182 += local164 * 6;
		@Pc(360) int local360 = this.anInt3071 >= 14 ? 7 : 6;
		@Pc(362) int local362 = local182;
		local182 += local360 * local164;
		@Pc(370) int local370 = local182;
		local182 += local164;
		@Pc(376) int local376 = local182;
		local182 += local164;
		@Pc(382) int local382 = local182;
		local182 += local164 + local166 * 2;
		if (local72) {
			this.aByteArray35 = new byte[this.anInt3068];
		}
		if (local132 == 1) {
			this.anIntArray241 = new int[this.anInt3068];
		}
		local8.anInt3400 = local218;
		if (local140 == 1) {
			this.anIntArray243 = new int[this.anInt3059];
		}
		if (local128 == 1) {
			this.aByteArray34 = new byte[this.anInt3068];
		}
		if (this.anInt3054 > 0) {
			if (local166 > 0) {
				this.anIntArray244 = new int[local166];
				this.anIntArray240 = new int[local166];
			}
			this.aShortArray43 = new short[this.anInt3054];
			if (local164 > 0) {
				this.anIntArray250 = new int[local164];
				this.anIntArray245 = new int[local164];
				this.anIntArray242 = new int[local164];
				this.anIntArray248 = new int[local164];
				this.aByteArray39 = new byte[local164];
				this.aByteArray40 = new byte[local164];
			}
			this.aShortArray41 = new short[this.anInt3054];
			this.aShortArray39 = new short[this.anInt3054];
		}
		if (local136 == 1) {
			this.aShortArray40 = new short[this.anInt3068];
		}
		this.aShortArray37 = new short[this.anInt3068];
		this.aShortArray46 = new short[this.anInt3068];
		this.anIntArray249 = new int[this.anInt3059];
		this.anIntArray246 = new int[this.anInt3059];
		if (local136 == 1 && this.anInt3054 > 0) {
			this.aByteArray37 = new byte[this.anInt3068];
		}
		this.anIntArray251 = new int[this.anInt3059];
		this.aShortArray44 = new short[this.anInt3068];
		if (local124 == 255) {
			this.aByteArray36 = new byte[this.anInt3068];
		} else {
			this.aByte23 = (byte) local124;
		}
		this.aShortArray45 = new short[this.anInt3068];
		local13.anInt3400 = local320;
		local18.anInt3400 = local326;
		local23.anInt3400 = local332;
		local28.anInt3400 = local263;
		@Pc(572) int local572 = 0;
		@Pc(574) int local574 = 0;
		@Pc(576) int local576 = 0;
		@Pc(583) int local583;
		for (@Pc(578) int local578 = 0; local578 < this.anInt3059; local578++) {
			local583 = local8.method3043();
			@Pc(585) int local585 = 0;
			if ((local583 & 0x1) != 0) {
				local585 = local13.method3078();
			}
			@Pc(595) int local595 = 0;
			if ((local583 & 0x2) != 0) {
				local595 = local18.method3078();
			}
			@Pc(605) int local605 = 0;
			if ((local583 & 0x4) != 0) {
				local605 = local23.method3078();
			}
			this.anIntArray251[local578] = local585 + local572;
			this.anIntArray249[local578] = local574 + local595;
			this.anIntArray246[local578] = local605 + local576;
			local574 = this.anIntArray249[local578];
			local576 = this.anIntArray246[local578];
			local572 = this.anIntArray251[local578];
			if (local140 == 1) {
				this.anIntArray243[local578] = local28.method3043();
			}
		}
		local8.anInt3400 = local311;
		local13.anInt3400 = local225;
		local18.anInt3400 = local241;
		local23.anInt3400 = local273;
		local28.anInt3400 = local251;
		local33.anInt3400 = local291;
		local38.anInt3400 = local305;
		for (local583 = 0; local583 < this.anInt3068; local583++) {
			this.aShortArray45[local583] = (short) local8.method3056();
			if (local72) {
				this.aByteArray35[local583] = local13.method3073();
			}
			if (local124 == 255) {
				this.aByteArray36[local583] = local18.method3073();
			}
			if (local128 == 1) {
				this.aByteArray34[local583] = local23.method3073();
			}
			if (local132 == 1) {
				this.anIntArray241[local583] = local28.method3043();
			}
			if (local136 == 1) {
				this.aShortArray40[local583] = (short) (local33.method3056() - 1);
			}
			if (this.aByteArray37 != null) {
				if (this.aShortArray40[local583] == -1) {
					this.aByteArray37[local583] = -1;
				} else {
					this.aByteArray37[local583] = (byte) (local38.method3043() - 1);
				}
			}
		}
		this.anInt3066 = -1;
		local8.anInt3400 = local285;
		local13.anInt3400 = local234;
		@Pc(809) short local809 = 0;
		@Pc(811) short local811 = 0;
		@Pc(813) short local813 = 0;
		@Pc(815) short local815 = 0;
		@Pc(822) int local822;
		for (@Pc(817) int local817 = 0; local817 < this.anInt3068; local817++) {
			local822 = local13.method3043();
			if (local822 == 1) {
				local809 = (short) (local815 + local8.method3078());
				local811 = (short) (local8.method3078() + local809);
				local813 = (short) (local811 + local8.method3078());
				local815 = local813;
				this.aShortArray37[local817] = local809;
				this.aShortArray44[local817] = local811;
				this.aShortArray46[local817] = local813;
				if (this.anInt3066 < local809) {
					this.anInt3066 = local809;
				}
				if (this.anInt3066 < local811) {
					this.anInt3066 = local811;
				}
				if (this.anInt3066 < local813) {
					this.anInt3066 = local813;
				}
			}
			if (local822 == 2) {
				local811 = local813;
				local813 = (short) (local8.method3078() + local815);
				local815 = local813;
				this.aShortArray37[local817] = local809;
				this.aShortArray44[local817] = local811;
				this.aShortArray46[local817] = local813;
				if (local813 > this.anInt3066) {
					this.anInt3066 = local813;
				}
			}
			if (local822 == 3) {
				local809 = local813;
				local813 = (short) (local8.method3078() + local815);
				local815 = local813;
				this.aShortArray37[local817] = local809;
				this.aShortArray44[local817] = local811;
				this.aShortArray46[local817] = local813;
				if (local813 > this.anInt3066) {
					this.anInt3066 = local813;
				}
			}
			if (local822 == 4) {
				@Pc(981) short local981 = local809;
				local809 = local811;
				local813 = (short) (local8.method3078() + local815);
				local811 = local981;
				this.aShortArray37[local817] = local809;
				local815 = local813;
				this.aShortArray44[local817] = local981;
				this.aShortArray46[local817] = local813;
				if (local813 > this.anInt3066) {
					this.anInt3066 = local813;
				}
			}
		}
		local8.anInt3400 = local338;
		this.anInt3066++;
		local13.anInt3400 = local346;
		local18.anInt3400 = local362;
		local23.anInt3400 = local370;
		local28.anInt3400 = local376;
		local33.anInt3400 = local382;
		@Pc(1055) int local1055;
		for (local822 = 0; local822 < this.anInt3054; local822++) {
			local1055 = this.aByteArray38[local822] & 0xFF;
			if (local1055 == 0) {
				this.aShortArray43[local822] = (short) local8.method3056();
				this.aShortArray41[local822] = (short) local8.method3056();
				this.aShortArray39[local822] = (short) local8.method3056();
			}
			if (local1055 == 1) {
				this.aShortArray43[local822] = (short) local13.method3056();
				this.aShortArray41[local822] = (short) local13.method3056();
				this.aShortArray39[local822] = (short) local13.method3056();
				this.anIntArray242[local822] = local18.method3056();
				if (this.anInt3071 < 14) {
					this.anIntArray250[local822] = local18.method3056();
				} else {
					this.anIntArray250[local822] = local18.method3039();
				}
				this.anIntArray248[local822] = local18.method3056();
				this.aByteArray39[local822] = local23.method3073();
				this.aByteArray40[local822] = local28.method3073();
				this.anIntArray245[local822] = local33.method3073();
			}
			if (local1055 == 2) {
				this.aShortArray43[local822] = (short) local13.method3056();
				this.aShortArray41[local822] = (short) local13.method3056();
				this.aShortArray39[local822] = (short) local13.method3056();
				this.anIntArray242[local822] = local18.method3056();
				if (this.anInt3071 < 14) {
					this.anIntArray250[local822] = local18.method3056();
				} else {
					this.anIntArray250[local822] = local18.method3039();
				}
				this.anIntArray248[local822] = local18.method3056();
				this.aByteArray39[local822] = local23.method3073();
				this.aByteArray40[local822] = local28.method3073();
				this.anIntArray245[local822] = local33.method3073();
				this.anIntArray240[local822] = local33.method3073();
				this.anIntArray244[local822] = local33.method3073();
			}
			if (local1055 == 3) {
				this.aShortArray43[local822] = (short) local13.method3056();
				this.aShortArray41[local822] = (short) local13.method3056();
				this.aShortArray39[local822] = (short) local13.method3056();
				this.anIntArray242[local822] = local18.method3056();
				if (this.anInt3071 < 14) {
					this.anIntArray250[local822] = local18.method3056();
				} else {
					this.anIntArray250[local822] = local18.method3039();
				}
				this.anIntArray248[local822] = local18.method3056();
				this.aByteArray39[local822] = local23.method3073();
				this.aByteArray40[local822] = local28.method3073();
				this.anIntArray245[local822] = local33.method3073();
			}
		}
		local8.anInt3400 = local182;
		@Pc(1380) int local1380;
		@Pc(1385) int local1385;
		@Pc(1389) int local1389;
		@Pc(1451) int local1451;
		if (local81) {
			local1055 = local8.method3043();
			if (local1055 > 0) {
				this.aClass178Array3 = new Class178[local1055];
				for (local1380 = 0; local1380 < local1055; local1380++) {
					local1385 = local8.method3056();
					local1389 = local8.method3056();
					@Pc(1397) byte local1397;
					if (local124 == 255) {
						local1397 = this.aByteArray36[local1389];
					} else {
						local1397 = (byte) local124;
					}
					this.aClass178Array3[local1380] = new Class178(local1385, this.aShortArray37[local1389], this.aShortArray44[local1389], this.aShortArray46[local1389], local1397);
				}
			}
			local1380 = local8.method3043();
			if (local1380 > 0) {
				this.aClass129Array3 = new Class129[local1380];
				for (local1385 = 0; local1385 < local1380; local1385++) {
					local1389 = local8.method3056();
					local1451 = local8.method3056();
					this.aClass129Array3[local1385] = new Class129(local1389, local1451);
				}
			}
		}
		if (!local92) {
			return;
		}
		local1055 = local8.method3043();
		if (local1055 <= 0) {
			return;
		}
		this.aClass26Array1 = new Class26[local1055];
		for (local1380 = 0; local1380 < local1055; local1380++) {
			local1385 = local8.method3056();
			local1389 = local8.method3056();
			local1451 = local8.method3043();
			@Pc(1504) byte local1504 = local8.method3073();
			this.aClass26Array1[local1380] = new Class26(local1385, local1389, local1451, local1504);
		}
		return;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ISS)V")
	public void method2804(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray40 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anInt3068; local14++) {
			if (this.aShortArray40[local14] == arg1) {
				this.aShortArray40[local14] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIII)I")
	public int method2805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3059; local13++) {
			if (arg1 == this.anIntArray251[local13] && this.anIntArray249[local13] == arg2 && arg0 == this.anIntArray246[local13]) {
				return local13;
			}
		}
		this.anIntArray251[this.anInt3059] = arg1;
		this.anIntArray249[this.anInt3059] = arg2;
		this.anIntArray246[this.anInt3059] = arg0;
		this.anInt3066 = this.anInt3059 + 1;
		return this.anInt3059++;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ISSBIBIBI)I")
	public int method2806(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray37[this.anInt3068] = (short) arg5;
		this.aShortArray44[this.anInt3068] = (short) arg7;
		this.aShortArray46[this.anInt3068] = (short) arg0;
		this.aByteArray35[this.anInt3068] = arg3;
		this.aByteArray37[this.anInt3068] = arg4;
		this.aShortArray45[this.anInt3068] = arg2;
		this.aByteArray34[this.anInt3068] = arg6;
		this.aShortArray40[this.anInt3068] = arg1;
		return this.anInt3068++;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(SLclient!fd;II)I")
	private int method2807(@OriginalArg(0) short arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.anIntArray251[arg2];
		@Pc(13) int local13 = arg1.anIntArray249[arg2];
		@Pc(18) int local18 = arg1.anIntArray246[arg2];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3059; local20++) {
			if (this.anIntArray251[local20] == local8 && this.anIntArray249[local20] == local13 && local18 == this.anIntArray246[local20]) {
				this.aShortArray42[local20] |= arg0;
				return local20;
			}
		}
		this.anIntArray251[this.anInt3059] = local8;
		this.anIntArray249[this.anInt3059] = local13;
		this.anIntArray246[this.anInt3059] = local18;
		this.aShortArray42[this.anInt3059] = arg0;
		this.anIntArray243[this.anInt3059] = arg1.anIntArray243 == null ? -1 : arg1.anIntArray243[arg2];
		return this.anInt3059++;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)[[I")
	public int[][] method2808() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3068; local12++) {
			@Pc(19) int local19 = this.anIntArray241[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(48) int local48 = 0; local48 <= local10; local48++) {
			local46[local48] = new int[local8[local48]];
			local8[local48] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt3068; local75++) {
			@Pc(82) int local82 = this.anIntArray241[local75];
			if (local82 >= 0) {
				local46[local82][local8[local82]++] = local75;
			}
		}
		return local46;
	}
}
