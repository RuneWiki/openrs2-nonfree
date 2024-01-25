import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class72 {

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!dea", name = "o", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!dea", name = "u", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!dea", name = "cb", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!dea", name = "T", descriptor = "[Lclient!tm;")
	public Class352[] aClass352Array1;

	@OriginalMember(owner = "client!dea", name = "M", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!dea", name = "K", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!dea", name = "P", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!dea", name = "I", descriptor = "[Lclient!vo;")
	public Class381[] aClass381Array1;

	@OriginalMember(owner = "client!dea", name = "v", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!dea", name = "S", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!dea", name = "ab", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!dea", name = "q", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!dea", name = "V", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!dea", name = "X", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!dea", name = "r", descriptor = "[I")
	public int[] anIntArray100;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!dea", name = "Z", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "[I")
	public int[] anIntArray101;

	@OriginalMember(owner = "client!dea", name = "t", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "[Lclient!ih;")
	public Class172[] aClass172Array1;

	@OriginalMember(owner = "client!dea", name = "A", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!dea", name = "x", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!dea", name = "U", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!dea", name = "H", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!dea", name = "s", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
	public int anInt1750 = 0;

	@OriginalMember(owner = "client!dea", name = "D", descriptor = "B")
	public byte aByte25 = 0;

	@OriginalMember(owner = "client!dea", name = "N", descriptor = "I")
	public int anInt1755 = 0;

	@OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
	public int anInt1746 = 0;

	@OriginalMember(owner = "client!dea", name = "y", descriptor = "I")
	public int anInt1744 = 12;

	@OriginalMember(owner = "client!dea", name = "bb", descriptor = "I")
	public int anInt1757 = 0;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V")
	private Class72() {
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "([B)V")
	public Class72(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1692(arg0);
		} else {
			this.method1697(arg0);
		}
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(III)V")
	public Class72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 0) {
			this.aByteArray31 = new byte[arg2];
			this.anIntArray95 = new int[arg2];
			this.anIntArray96 = new int[arg2];
			this.anIntArray98 = new int[arg2];
			this.aShortArray26 = new short[arg2];
			this.anIntArray97 = new int[arg2];
			this.anIntArray103 = new int[arg2];
			this.aByteArray33 = new byte[arg2];
			this.aShortArray29 = new short[arg2];
			this.aShortArray30 = new short[arg2];
			this.aByteArray32 = new byte[arg2];
			this.anIntArray94 = new int[arg2];
		}
		this.aShortArray22 = new short[arg1];
		this.aShortArray24 = new short[arg1];
		this.aByteArray27 = new byte[arg1];
		this.anIntArray100 = new int[arg1];
		this.aByteArray28 = new byte[arg1];
		this.anIntArray101 = new int[arg0];
		this.anIntArray99 = new int[arg0];
		this.anIntArray93 = new int[arg0];
		this.anIntArray102 = new int[arg0];
		this.aShortArray25 = new short[arg1];
		this.aByteArray29 = new byte[arg1];
		this.aShortArray27 = new short[arg1];
		this.aShortArray21 = new short[arg1];
		this.aByteArray30 = new byte[arg1];
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "([Lclient!dea;I)V")
	public Class72(@OriginalArg(0) Class72[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1757 = 0;
		this.anInt1746 = 0;
		this.anInt1750 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		this.aByte25 = -1;
		@Pc(49) boolean local49 = false;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class72 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt1750 += local56.anInt1750;
				this.anInt1757 += local56.anInt1757;
				this.anInt1746 += local56.anInt1746;
				if (local56.aClass381Array1 != null) {
					local34 += local56.aClass381Array1.length;
				}
				if (local56.aClass172Array1 != null) {
					local32 += local56.aClass172Array1.length;
				}
				if (local56.aClass352Array1 != null) {
					local30 += local56.aClass352Array1.length;
				}
				local36 |= local56.aByteArray28 != null;
				local42 |= local56.aByteArray30 != null;
				local49 |= local56.anIntArray100 != null;
				local44 |= local56.aShortArray22 != null;
				local40 |= local56.aByteArray29 != null;
				if (local56.aByteArray27 == null) {
					if (this.aByte25 == -1) {
						this.aByte25 = local56.aByte25;
					}
					if (local56.aByte25 != this.aByte25) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
			}
		}
		if (local49) {
			this.anIntArray100 = new int[this.anInt1750];
		}
		this.anIntArray101 = new int[this.anInt1746];
		this.aShortArray24 = new short[this.anInt1750];
		if (local42) {
			this.aByteArray30 = new byte[this.anInt1750];
		}
		this.aShortArray28 = new short[this.anInt1746];
		this.aShortArray23 = new short[this.anInt1750];
		this.anIntArray99 = new int[this.anInt1746];
		if (local44) {
			this.aShortArray22 = new short[this.anInt1750];
		}
		if (local36) {
			this.aByteArray28 = new byte[this.anInt1750];
		}
		this.aShortArray21 = new short[this.anInt1750];
		this.aShortArray27 = new short[this.anInt1750];
		this.anIntArray93 = new int[this.anInt1746];
		if (local32 > 0) {
			this.aClass172Array1 = new Class172[local32];
		}
		if (local38) {
			this.aByteArray27 = new byte[this.anInt1750];
		}
		if (local34 > 0) {
			this.aClass381Array1 = new Class381[local34];
		}
		if (local40) {
			this.aByteArray29 = new byte[this.anInt1750];
		}
		if (this.anInt1757 > 0) {
			this.anIntArray98 = new int[this.anInt1757];
			this.aByteArray31 = new byte[this.anInt1757];
			this.aShortArray26 = new short[this.anInt1757];
			this.anIntArray97 = new int[this.anInt1757];
			this.aByteArray33 = new byte[this.anInt1757];
			this.aShortArray29 = new short[this.anInt1757];
			this.aByteArray32 = new byte[this.anInt1757];
			this.anIntArray94 = new int[this.anInt1757];
			this.anIntArray96 = new int[this.anInt1757];
			this.anIntArray95 = new int[this.anInt1757];
			this.anIntArray103 = new int[this.anInt1757];
			this.aShortArray30 = new short[this.anInt1757];
		}
		this.aShortArray25 = new short[this.anInt1750];
		this.anIntArray102 = new int[this.anInt1746];
		if (local30 > 0) {
			this.aClass352Array1 = new Class352[local30];
		}
		local30 = 0;
		local34 = 0;
		this.anInt1746 = 0;
		this.anInt1750 = 0;
		local32 = 0;
		this.anInt1757 = 0;
		@Pc(657) int local657;
		@Pc(668) int local668;
		for (@Pc(411) int local411 = 0; local411 < arg1; local411++) {
			@Pc(417) short local417 = (short) (0x1 << local411);
			@Pc(421) Class72 local421 = arg0[local411];
			if (local421 != null) {
				@Pc(430) int local430;
				if (local421.aClass381Array1 != null) {
					for (local430 = 0; local430 < local421.aClass381Array1.length; local430++) {
						@Pc(436) Class381 local436 = local421.aClass381Array1[local430];
						this.aClass381Array1[local34++] = local436.method9147(this.anInt1750 + local436.anInt10709);
					}
				}
				for (local430 = 0; local430 < local421.anInt1750; local430++) {
					if (local36 && local421.aByteArray28 != null) {
						this.aByteArray28[this.anInt1750] = local421.aByteArray28[local430];
					}
					if (local38) {
						if (local421.aByteArray27 == null) {
							this.aByteArray27[this.anInt1750] = local421.aByte25;
						} else {
							this.aByteArray27[this.anInt1750] = local421.aByteArray27[local430];
						}
					}
					if (local40 && local421.aByteArray29 != null) {
						this.aByteArray29[this.anInt1750] = local421.aByteArray29[local430];
					}
					if (local44) {
						if (local421.aShortArray22 == null) {
							this.aShortArray22[this.anInt1750] = -1;
						} else {
							this.aShortArray22[this.anInt1750] = local421.aShortArray22[local430];
						}
					}
					if (local49) {
						if (local421.anIntArray100 == null) {
							this.anIntArray100[this.anInt1750] = -1;
						} else {
							this.anIntArray100[this.anInt1750] = local421.anIntArray100[local430];
						}
					}
					this.aShortArray25[this.anInt1750] = (short) this.method1683(local417, local421.aShortArray25[local430], local421);
					this.aShortArray27[this.anInt1750] = (short) this.method1683(local417, local421.aShortArray27[local430], local421);
					this.aShortArray24[this.anInt1750] = (short) this.method1683(local417, local421.aShortArray24[local430], local421);
					this.aShortArray23[this.anInt1750] = local417;
					this.aShortArray21[this.anInt1750] = local421.aShortArray21[local430];
					this.anInt1750++;
				}
				@Pc(645) int local645;
				if (local421.aClass352Array1 != null) {
					for (local645 = 0; local645 < local421.aClass352Array1.length; local645++) {
						local657 = this.method1683(local417, local421.aClass352Array1[local645].anInt9767, local421);
						local668 = this.method1683(local417, local421.aClass352Array1[local645].anInt9765, local421);
						@Pc(679) int local679 = this.method1683(local417, local421.aClass352Array1[local645].anInt9772, local421);
						this.aClass352Array1[local30] = local421.aClass352Array1[local645].method8404(local657, local668, local679);
						local30++;
					}
				}
				if (local421.aClass172Array1 != null) {
					for (local645 = 0; local645 < local421.aClass172Array1.length; local645++) {
						local657 = this.method1683(local417, local421.aClass172Array1[local645].anInt4761, local421);
						this.aClass172Array1[local32] = local421.aClass172Array1[local645].method4228(local657);
						local32++;
					}
				}
			}
		}
		@Pc(748) int local748 = 0;
		this.anInt1755 = this.anInt1746;
		for (@Pc(754) int local754 = 0; local754 < arg1; local754++) {
			@Pc(760) short local760 = (short) (0x1 << local754);
			@Pc(764) Class72 local764 = arg0[local754];
			if (local764 != null) {
				for (local657 = 0; local657 < local764.anInt1750; local657++) {
					if (local42) {
						this.aByteArray30[local748++] = (byte) (local764.aByteArray30 == null || local764.aByteArray30[local657] == -1 ? -1 : local764.aByteArray30[local657] + this.anInt1757);
					}
				}
				for (local668 = 0; local668 < local764.anInt1757; local668++) {
					@Pc(819) byte local819 = this.aByteArray32[this.anInt1757] = local764.aByteArray32[local668];
					if (local819 == 0) {
						this.aShortArray29[this.anInt1757] = (short) this.method1683(local760, local764.aShortArray29[local668], local764);
						this.aShortArray30[this.anInt1757] = (short) this.method1683(local760, local764.aShortArray30[local668], local764);
						this.aShortArray26[this.anInt1757] = (short) this.method1683(local760, local764.aShortArray26[local668], local764);
					}
					if (local819 >= 1 && local819 <= 3) {
						this.aShortArray29[this.anInt1757] = local764.aShortArray29[local668];
						this.aShortArray30[this.anInt1757] = local764.aShortArray30[local668];
						this.aShortArray26[this.anInt1757] = local764.aShortArray26[local668];
						this.anIntArray94[this.anInt1757] = local764.anIntArray94[local668];
						this.anIntArray103[this.anInt1757] = local764.anIntArray103[local668];
						this.anIntArray97[this.anInt1757] = local764.anIntArray97[local668];
						this.aByteArray31[this.anInt1757] = local764.aByteArray31[local668];
						this.aByteArray33[this.anInt1757] = local764.aByteArray33[local668];
						this.anIntArray95[this.anInt1757] = local764.anIntArray95[local668];
					}
					if (local819 == 2) {
						this.anIntArray98[this.anInt1757] = local764.anIntArray98[local668];
						this.anIntArray96[this.anInt1757] = local764.anIntArray96[local668];
					}
					this.anInt1757++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)[[I")
	public int[][] method1682() {
		@Pc(6) int[] local6 = new int[256];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.aClass381Array1.length; local10++) {
			@Pc(17) int local17 = this.aClass381Array1[local10].anInt10714;
			if (local17 >= 0) {
				if (local17 > local8) {
					local8 = local17;
				}
				@Pc(37) int local37 = local6[local17]++;
			}
		}
		@Pc(51) int[][] local51 = new int[local8 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local8; local59++) {
			local51[local59] = new int[local6[local59]];
			local6[local59] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < this.aClass381Array1.length; local81++) {
			@Pc(88) int local88 = this.aClass381Array1[local81].anInt10714;
			if (local88 >= 0) {
				local51[local88][local6[local88]++] = local81;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ISILclient!dea;)I")
	private int method1683(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class72 arg2) {
		@Pc(8) int local8 = arg2.anIntArray93[arg1];
		@Pc(13) int local13 = arg2.anIntArray102[arg1];
		@Pc(18) int local18 = arg2.anIntArray99[arg1];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1746; local20++) {
			if (local8 == this.anIntArray93[local20] && local13 == this.anIntArray102[local20] && local18 == this.anIntArray99[local20]) {
				this.aShortArray28[local20] |= arg0;
				return local20;
			}
		}
		this.anIntArray93[this.anInt1746] = local8;
		this.anIntArray102[this.anInt1746] = local13;
		this.anIntArray99[this.anInt1746] = local18;
		this.aShortArray28[this.anInt1746] = arg0;
		this.anIntArray101[this.anInt1746] = arg2.anIntArray101 == null ? -1 : arg2.anIntArray101[arg1];
		return this.anInt1746++;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIB)I")
	public int method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1746; local7++) {
			if (this.anIntArray93[local7] == arg2 && arg1 == this.anIntArray102[local7] && this.anIntArray99[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray93[this.anInt1746] = arg2;
		if (arg3 > -4) {
			return 115;
		} else {
			this.anIntArray102[this.anInt1746] = arg1;
			this.anIntArray99[this.anInt1746] = arg0;
			this.anInt1755 = this.anInt1746 + 1;
			return this.anInt1746++;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ISSSSBBBSS)B")
	public byte method1685() {
		if (this.anInt1757 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray32[this.anInt1757] = 3;
		this.aShortArray29[this.anInt1757] = 0;
		this.aShortArray30[this.anInt1757] = 32767;
		this.aShortArray26[this.anInt1757] = 0;
		this.anIntArray94[this.anInt1757] = 1024;
		this.anIntArray103[this.anInt1757] = 1024;
		this.anIntArray97[this.anInt1757] = 1024;
		this.aByteArray31[this.anInt1757] = 0;
		this.aByteArray33[this.anInt1757] = 0;
		this.anIntArray95[this.anInt1757] = 0;
		return (byte) this.anInt1757++;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII)V")
	public void method1686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg0 != 0) {
			local10 = Class141.anIntArray207[arg0];
			local14 = Class141.anIntArray208[arg0];
			for (local16 = 0; local16 < this.anInt1746; local16++) {
				local34 = this.anIntArray93[local16] * local14 + this.anIntArray102[local16] * local10 >> 14;
				this.anIntArray102[local16] = local14 * this.anIntArray102[local16] - this.anIntArray93[local16] * local10 >> 14;
				this.anIntArray93[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class141.anIntArray207[arg2];
			local14 = Class141.anIntArray208[arg2];
			for (local16 = 0; local16 < this.anInt1746; local16++) {
				local34 = this.anIntArray102[local16] * local14 - this.anIntArray99[local16] * local10 >> 14;
				this.anIntArray99[local16] = local14 * this.anIntArray99[local16] + this.anIntArray102[local16] * local10 >> 14;
				this.anIntArray102[local16] = local34;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local10 = Class141.anIntArray207[arg1];
		local14 = Class141.anIntArray208[arg1];
		for (local16 = 0; local16 < this.anInt1746; local16++) {
			local34 = local10 * this.anIntArray99[local16] + local14 * this.anIntArray93[local16] >> 14;
			this.anIntArray99[local16] = local14 * this.anIntArray99[local16] - local10 * this.anIntArray93[local16] >> 14;
			this.anIntArray93[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)[[I")
	public int[][] method1687() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1750; local12++) {
			@Pc(21) int local21 = this.anIntArray100[local12];
			if (local21 >= 0) {
				@Pc(27) int local27 = local8[local21]++;
				if (local21 > local10) {
					local10 = local21;
				}
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(51) int local51 = 0; local51 <= local10; local51++) {
			local47[local51] = new int[local8[local51]];
			local8[local51] = 0;
		}
		if (-31495 != -31495) {
			Static101.method1695(81);
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt1750; local87++) {
			@Pc(94) int local94 = this.anIntArray100[local87];
			if (local94 >= 0) {
				local47[local94][local8[local94]++] = local87;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ISS)V")
	public void method1688(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt1750; local5++) {
			if (this.aShortArray21[local5] == arg1) {
				this.aShortArray21[local5] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)V")
	public void method1689() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1746; local1++) {
			this.anIntArray93[local1] <<= 0x2;
			this.anIntArray102[local1] <<= 0x2;
			this.anIntArray99[local1] <<= 0x2;
		}
		if (this.anInt1757 <= 0 || this.anIntArray94 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray94.length; local56++) {
			this.anIntArray94[local56] <<= 0x2;
			this.anIntArray103[local56] <<= 0x2;
			if (this.aByteArray32[local56] != 1) {
				this.anIntArray97[local56] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(SSZ)V")
	public void method1690(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray22 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt1750; local28++) {
			if (arg1 == this.aShortArray22[local28]) {
				this.aShortArray22[local28] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B[B)V")
	private void method1692(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class14_Sub21 local8 = new Class14_Sub21(arg0);
		@Pc(13) Class14_Sub21 local13 = new Class14_Sub21(arg0);
		@Pc(18) Class14_Sub21 local18 = new Class14_Sub21(arg0);
		@Pc(23) Class14_Sub21 local23 = new Class14_Sub21(arg0);
		@Pc(28) Class14_Sub21 local28 = new Class14_Sub21(arg0);
		@Pc(33) Class14_Sub21 local33 = new Class14_Sub21(arg0);
		@Pc(38) Class14_Sub21 local38 = new Class14_Sub21(arg0);
		local8.anInt8936 = arg0.length - 23;
		this.anInt1746 = local8.method7717(-1978450544);
		this.anInt1750 = local8.method7717(-1978450544);
		this.anInt1757 = local8.method7695(126);
		@Pc(65) int local65 = local8.method7695(105);
		@Pc(75) boolean local75 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(99) boolean local99 = (local65 & 0x4) == 4;
		@Pc(111) boolean local111 = (local65 & 0x8) == 8;
		if (local111) {
			local8.anInt8936 -= 7;
			this.anInt1744 = local8.method7695(121);
			local8.anInt8936 += 6;
		}
		@Pc(140) int local140 = local8.method7695(113);
		@Pc(144) int local144 = local8.method7695(104);
		@Pc(148) int local148 = local8.method7695(97);
		@Pc(154) int local154 = local8.method7695(107);
		@Pc(158) int local158 = local8.method7695(124);
		@Pc(162) int local162 = local8.method7717(-1978450544);
		@Pc(168) int local168 = local8.method7717(-1978450544);
		@Pc(172) int local172 = local8.method7717(-1978450544);
		@Pc(176) int local176 = local8.method7717(-1978450544);
		@Pc(182) int local182 = local8.method7717(-1978450544);
		@Pc(184) int local184 = 0;
		@Pc(186) int local186 = 0;
		@Pc(188) int local188 = 0;
		@Pc(209) int local209;
		if (this.anInt1757 > 0) {
			this.aByteArray32 = new byte[this.anInt1757];
			local8.anInt8936 = 0;
			for (local209 = 0; local209 < this.anInt1757; local209++) {
				@Pc(219) byte local219 = this.aByteArray32[local209] = local8.method7720();
				if (local219 == 0) {
					local184++;
				}
				if (local219 == 2) {
					local188++;
				}
				if (local219 >= 1 && local219 <= 3) {
					local186++;
				}
			}
		}
		local209 = this.anInt1757;
		@Pc(259) int local259 = local209;
		local209 += this.anInt1746;
		@Pc(266) int local266 = local209;
		if (local75) {
			local209 += this.anInt1750;
		}
		@Pc(275) int local275 = local209;
		local209 += this.anInt1750;
		@Pc(282) int local282 = local209;
		if (local140 == 255) {
			local209 += this.anInt1750;
		}
		@Pc(294) int local294 = local209;
		if (local148 == 1) {
			local209 += this.anInt1750;
		}
		@Pc(306) int local306 = local209;
		if (local158 == 1) {
			local209 += this.anInt1746;
		}
		@Pc(316) int local316 = local209;
		if (local144 == 1) {
			local209 += this.anInt1750;
		}
		@Pc(328) int local328 = local209;
		local209 += local176;
		@Pc(334) int local334 = local209;
		if (local154 == 1) {
			local209 += this.anInt1750 * 2;
		}
		@Pc(346) int local346 = local209;
		local209 += local182;
		@Pc(352) int local352 = local209;
		local209 += this.anInt1750 * 2;
		@Pc(361) int local361 = local209;
		local209 += local162;
		@Pc(367) int local367 = local209;
		local209 += local168;
		@Pc(373) int local373 = local209;
		local209 += local172;
		@Pc(379) int local379 = local209;
		local209 += local184 * 6;
		@Pc(387) int local387 = local209;
		local209 += local186 * 6;
		@Pc(395) byte local395 = 6;
		if (this.anInt1744 == 14) {
			local395 = 7;
		} else if (this.anInt1744 >= 15) {
			local395 = 9;
		}
		@Pc(410) int local410 = local209;
		local209 += local395 * local186;
		@Pc(418) int local418 = local209;
		local209 += local186;
		@Pc(424) int local424 = local209;
		local209 += local186;
		@Pc(430) int local430 = local209;
		local209 += local188 * 2 + local186;
		if (local158 == 1) {
			this.anIntArray101 = new int[this.anInt1746];
		}
		this.anIntArray99 = new int[this.anInt1746];
		if (local75) {
			this.aByteArray28 = new byte[this.anInt1750];
		}
		if (local154 == 1 && this.anInt1757 > 0) {
			this.aByteArray30 = new byte[this.anInt1750];
		}
		this.aShortArray25 = new short[this.anInt1750];
		if (local140 == 255) {
			this.aByteArray27 = new byte[this.anInt1750];
		} else {
			this.aByte25 = (byte) local140;
		}
		this.anIntArray93 = new int[this.anInt1746];
		local8.anInt8936 = local259;
		if (local144 == 1) {
			this.aByteArray29 = new byte[this.anInt1750];
		}
		this.aShortArray24 = new short[this.anInt1750];
		this.aShortArray21 = new short[this.anInt1750];
		this.anIntArray102 = new int[this.anInt1746];
		if (local148 == 1) {
			this.anIntArray100 = new int[this.anInt1750];
		}
		this.aShortArray27 = new short[this.anInt1750];
		if (local154 == 1) {
			this.aShortArray22 = new short[this.anInt1750];
		}
		if (this.anInt1757 > 0) {
			this.aShortArray30 = new short[this.anInt1757];
			this.aShortArray26 = new short[this.anInt1757];
			if (local186 > 0) {
				this.aByteArray31 = new byte[local186];
				this.anIntArray103 = new int[local186];
				this.anIntArray95 = new int[local186];
				this.anIntArray97 = new int[local186];
				this.anIntArray94 = new int[local186];
				this.aByteArray33 = new byte[local186];
			}
			this.aShortArray29 = new short[this.anInt1757];
			if (local188 > 0) {
				this.anIntArray96 = new int[local188];
				this.anIntArray98 = new int[local188];
			}
		}
		local13.anInt8936 = local361;
		local18.anInt8936 = local367;
		local23.anInt8936 = local373;
		local28.anInt8936 = local306;
		@Pc(648) int local648 = 0;
		@Pc(650) int local650 = 0;
		@Pc(652) int local652 = 0;
		@Pc(659) int local659;
		for (@Pc(654) int local654 = 0; local654 < this.anInt1746; local654++) {
			local659 = local8.method7695(103);
			@Pc(661) int local661 = 0;
			if ((local659 & 0x1) != 0) {
				local661 = local13.method7753();
			}
			@Pc(671) int local671 = 0;
			if ((local659 & 0x2) != 0) {
				local671 = local18.method7753();
			}
			@Pc(681) int local681 = 0;
			if ((local659 & 0x4) != 0) {
				local681 = local23.method7753();
			}
			this.anIntArray93[local654] = local661 + local648;
			this.anIntArray102[local654] = local671 + local650;
			this.anIntArray99[local654] = local652 + local681;
			local650 = this.anIntArray102[local654];
			local648 = this.anIntArray93[local654];
			local652 = this.anIntArray99[local654];
			if (local158 == 1) {
				this.anIntArray101[local654] = local28.method7695(127);
			}
		}
		local8.anInt8936 = local352;
		local13.anInt8936 = local266;
		local18.anInt8936 = local282;
		local23.anInt8936 = local316;
		local28.anInt8936 = local294;
		local33.anInt8936 = local334;
		local38.anInt8936 = local346;
		for (local659 = 0; local659 < this.anInt1750; local659++) {
			this.aShortArray21[local659] = (short) local8.method7717(-1978450544);
			if (local75) {
				this.aByteArray28[local659] = local13.method7720();
			}
			if (local140 == 255) {
				this.aByteArray27[local659] = local18.method7720();
			}
			if (local144 == 1) {
				this.aByteArray29[local659] = local23.method7720();
			}
			if (local148 == 1) {
				this.anIntArray100[local659] = local28.method7695(119);
			}
			if (local154 == 1) {
				this.aShortArray22[local659] = (short) (local33.method7717(-1978450544) - 1);
			}
			if (this.aByteArray30 != null) {
				if (this.aShortArray22[local659] == -1) {
					this.aByteArray30[local659] = -1;
				} else {
					this.aByteArray30[local659] = (byte) (local38.method7695(119) - 1);
				}
			}
		}
		this.anInt1755 = -1;
		local8.anInt8936 = local328;
		local13.anInt8936 = local275;
		@Pc(897) short local897 = 0;
		@Pc(899) short local899 = 0;
		@Pc(901) short local901 = 0;
		@Pc(903) short local903 = 0;
		@Pc(912) int local912;
		for (@Pc(905) int local905 = 0; local905 < this.anInt1750; local905++) {
			local912 = local13.method7695(99);
			if (local912 == 1) {
				local897 = (short) (local8.method7753() + local903);
				local899 = (short) (local897 + local8.method7753());
				local901 = (short) (local8.method7753() + local899);
				this.aShortArray25[local905] = local897;
				local903 = local901;
				this.aShortArray27[local905] = local899;
				this.aShortArray24[local905] = local901;
				if (local897 > this.anInt1755) {
					this.anInt1755 = local897;
				}
				if (local899 > this.anInt1755) {
					this.anInt1755 = local899;
				}
				if (local901 > this.anInt1755) {
					this.anInt1755 = local901;
				}
			}
			if (local912 == 2) {
				local899 = local901;
				local901 = (short) (local8.method7753() + local903);
				this.aShortArray25[local905] = local897;
				local903 = local901;
				this.aShortArray27[local905] = local899;
				this.aShortArray24[local905] = local901;
				if (local901 > this.anInt1755) {
					this.anInt1755 = local901;
				}
			}
			if (local912 == 3) {
				local897 = local901;
				local901 = (short) (local8.method7753() + local903);
				local903 = local901;
				this.aShortArray25[local905] = local897;
				this.aShortArray27[local905] = local899;
				this.aShortArray24[local905] = local901;
				if (local901 > this.anInt1755) {
					this.anInt1755 = local901;
				}
			}
			if (local912 == 4) {
				@Pc(1087) short local1087 = local897;
				local897 = local899;
				local899 = local1087;
				local901 = (short) (local8.method7753() + local903);
				this.aShortArray25[local905] = local897;
				local903 = local901;
				this.aShortArray27[local905] = local1087;
				this.aShortArray24[local905] = local901;
				if (this.anInt1755 < local901) {
					this.anInt1755 = local901;
				}
			}
		}
		this.anInt1755++;
		local8.anInt8936 = local379;
		local13.anInt8936 = local387;
		local18.anInt8936 = local410;
		local23.anInt8936 = local418;
		local28.anInt8936 = local424;
		local33.anInt8936 = local430;
		@Pc(1169) int local1169;
		for (local912 = 0; local912 < this.anInt1757; local912++) {
			local1169 = this.aByteArray32[local912] & 0xFF;
			if (local1169 == 0) {
				this.aShortArray29[local912] = (short) local8.method7717(-1978450544);
				this.aShortArray30[local912] = (short) local8.method7717(-1978450544);
				this.aShortArray26[local912] = (short) local8.method7717(-1978450544);
			}
			if (local1169 == 1) {
				this.aShortArray29[local912] = (short) local13.method7717(-1978450544);
				this.aShortArray30[local912] = (short) local13.method7717(-1978450544);
				this.aShortArray26[local912] = (short) local13.method7717(-1978450544);
				if (this.anInt1744 >= 15) {
					this.anIntArray94[local912] = local18.method7719();
					this.anIntArray103[local912] = local18.method7719();
					this.anIntArray97[local912] = local18.method7719();
				} else {
					this.anIntArray94[local912] = local18.method7717(-1978450544);
					if (this.anInt1744 < 14) {
						this.anIntArray103[local912] = local18.method7717(-1978450544);
					} else {
						this.anIntArray103[local912] = local18.method7719();
					}
					this.anIntArray97[local912] = local18.method7717(-1978450544);
				}
				this.aByteArray31[local912] = local23.method7720();
				this.aByteArray33[local912] = local28.method7720();
				this.anIntArray95[local912] = local33.method7720();
			}
			if (local1169 == 2) {
				this.aShortArray29[local912] = (short) local13.method7717(-1978450544);
				this.aShortArray30[local912] = (short) local13.method7717(-1978450544);
				this.aShortArray26[local912] = (short) local13.method7717(-1978450544);
				if (this.anInt1744 < 15) {
					this.anIntArray94[local912] = local18.method7717(-1978450544);
					if (this.anInt1744 < 14) {
						this.anIntArray103[local912] = local18.method7717(-1978450544);
					} else {
						this.anIntArray103[local912] = local18.method7719();
					}
					this.anIntArray97[local912] = local18.method7717(-1978450544);
				} else {
					this.anIntArray94[local912] = local18.method7719();
					this.anIntArray103[local912] = local18.method7719();
					this.anIntArray97[local912] = local18.method7719();
				}
				this.aByteArray31[local912] = local23.method7720();
				this.aByteArray33[local912] = local28.method7720();
				this.anIntArray95[local912] = local33.method7720();
				this.anIntArray98[local912] = local33.method7720();
				this.anIntArray96[local912] = local33.method7720();
			}
			if (local1169 == 3) {
				this.aShortArray29[local912] = (short) local13.method7717(-1978450544);
				this.aShortArray30[local912] = (short) local13.method7717(-1978450544);
				this.aShortArray26[local912] = (short) local13.method7717(-1978450544);
				if (this.anInt1744 < 15) {
					this.anIntArray94[local912] = local18.method7717(-1978450544);
					if (this.anInt1744 < 14) {
						this.anIntArray103[local912] = local18.method7717(-1978450544);
					} else {
						this.anIntArray103[local912] = local18.method7719();
					}
					this.anIntArray97[local912] = local18.method7717(-1978450544);
				} else {
					this.anIntArray94[local912] = local18.method7719();
					this.anIntArray103[local912] = local18.method7719();
					this.anIntArray97[local912] = local18.method7719();
				}
				this.aByteArray31[local912] = local23.method7720();
				this.aByteArray33[local912] = local28.method7720();
				this.anIntArray95[local912] = local33.method7720();
			}
		}
		local8.anInt8936 = local209;
		@Pc(1602) int local1602;
		@Pc(1607) int local1607;
		@Pc(1611) int local1611;
		@Pc(1676) int local1676;
		if (local87) {
			local1169 = local8.method7695(124);
			if (local1169 > 0) {
				this.aClass352Array1 = new Class352[local1169];
				for (local1602 = 0; local1602 < local1169; local1602++) {
					local1607 = local8.method7717(-1978450544);
					local1611 = local8.method7717(-1978450544);
					@Pc(1619) byte local1619;
					if (local140 == 255) {
						local1619 = this.aByteArray27[local1611];
					} else {
						local1619 = (byte) local140;
					}
					this.aClass352Array1[local1602] = new Class352(local1607, this.aShortArray25[local1611], this.aShortArray27[local1611], this.aShortArray24[local1611], local1619);
				}
			}
			local1602 = local8.method7695(122);
			if (local1602 > 0) {
				this.aClass172Array1 = new Class172[local1602];
				for (local1607 = 0; local1607 < local1602; local1607++) {
					local1611 = local8.method7717(-1978450544);
					local1676 = local8.method7717(-1978450544);
					this.aClass172Array1[local1607] = new Class172(local1611, local1676);
				}
			}
		}
		if (!local99) {
			return;
		}
		local1169 = local8.method7695(95);
		if (local1169 <= 0) {
			return;
		}
		this.aClass381Array1 = new Class381[local1169];
		for (local1602 = 0; local1602 < local1169; local1602++) {
			local1607 = local8.method7717(-1978450544);
			local1611 = local8.method7717(-1978450544);
			local1676 = local8.method7695(99);
			@Pc(1729) byte local1729 = local8.method7720();
			this.aClass381Array1[local1602] = new Class381(local1607, local1611, local1676, local1729);
		}
		return;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZB)[[I")
	public int[][] method1693(@OriginalArg(0) boolean arg0) {
		@Pc(6) int[] local6 = new int[256];
		@Pc(8) int local8 = 0;
		@Pc(17) int local17 = arg0 ? this.anInt1746 : this.anInt1755;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.anIntArray101[local19];
			if (local25 >= 0) {
				if (local25 > local8) {
					local8 = local25;
				}
				@Pc(42) int local42 = local6[local25]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local8 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local8; local60++) {
			local58[local60] = new int[local6[local60]];
			local6[local60] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < local17; local78++) {
			@Pc(84) int local84 = this.anIntArray101[local78];
			if (local84 >= 0) {
				local58[local84][local6[local84]++] = local78;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(IIII)V")
	public void method1694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1746; local1++) {
			this.anIntArray93[local1] += arg2;
			this.anIntArray102[local1] += arg1;
			this.anIntArray99[local1] += arg0;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIBBBSBIS)I")
	public int method1696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) short arg7) {
		this.aShortArray25[this.anInt1750] = (short) arg6;
		this.aShortArray27[this.anInt1750] = (short) arg0;
		this.aShortArray24[this.anInt1750] = (short) arg1;
		this.aByteArray28[this.anInt1750] = arg5;
		this.aByteArray30[this.anInt1750] = arg2;
		this.aShortArray21[this.anInt1750] = arg4;
		this.aByteArray29[this.anInt1750] = arg3;
		this.aShortArray22[this.anInt1750] = arg7;
		return this.anInt1750++;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([BB)V")
	private void method1697(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class14_Sub21 local12 = new Class14_Sub21(arg0);
		@Pc(17) Class14_Sub21 local17 = new Class14_Sub21(arg0);
		@Pc(22) Class14_Sub21 local22 = new Class14_Sub21(arg0);
		@Pc(27) Class14_Sub21 local27 = new Class14_Sub21(arg0);
		@Pc(32) Class14_Sub21 local32 = new Class14_Sub21(arg0);
		local12.anInt8936 = arg0.length - 18;
		this.anInt1746 = local12.method7717(-1978450544);
		this.anInt1750 = local12.method7717(-1978450544);
		this.anInt1757 = local12.method7695(121);
		@Pc(57) int local57 = local12.method7695(112);
		@Pc(61) int local61 = local12.method7695(119);
		@Pc(65) int local65 = local12.method7695(95);
		@Pc(69) int local69 = local12.method7695(99);
		@Pc(73) int local73 = local12.method7695(107);
		@Pc(77) int local77 = local12.method7717(-1978450544);
		@Pc(81) int local81 = local12.method7717(-1978450544);
		@Pc(85) int local85 = local12.method7717(-1978450544);
		@Pc(89) int local89 = local12.method7717(-1978450544);
		@Pc(98) int local98 = this.anInt1746;
		@Pc(100) int local100 = local98;
		local98 += this.anInt1750;
		@Pc(107) int local107 = local98;
		if (local61 == 255) {
			local98 += this.anInt1750;
		}
		@Pc(117) int local117 = local98;
		if (local69 == 1) {
			local98 += this.anInt1750;
		}
		@Pc(127) int local127 = local98;
		if (local57 == 1) {
			local98 += this.anInt1750;
		}
		@Pc(139) int local139 = local98;
		if (local73 == 1) {
			local98 += this.anInt1746;
		}
		@Pc(149) int local149 = local98;
		if (local65 == 1) {
			local98 += this.anInt1750;
		}
		@Pc(161) int local161 = local98;
		local98 += local89;
		@Pc(167) int local167 = local98;
		local98 += this.anInt1750 * 2;
		@Pc(176) int local176 = local98;
		local98 += this.anInt1757 * 6;
		@Pc(185) int local185 = local98;
		local98 += local77;
		@Pc(191) int local191 = local98;
		local98 += local81;
		if (local61 == 255) {
			this.aByteArray27 = new byte[this.anInt1750];
		} else {
			this.aByte25 = (byte) local61;
		}
		this.anIntArray99 = new int[this.anInt1746];
		if (local65 == 1) {
			this.aByteArray29 = new byte[this.anInt1750];
		}
		this.aShortArray24 = new short[this.anInt1750];
		if (local69 == 1) {
			this.anIntArray100 = new int[this.anInt1750];
		}
		if (local73 == 1) {
			this.anIntArray101 = new int[this.anInt1746];
		}
		this.aShortArray21 = new short[this.anInt1750];
		this.aShortArray25 = new short[this.anInt1750];
		this.anIntArray102 = new int[this.anInt1746];
		this.aShortArray27 = new short[this.anInt1750];
		if (local57 == 1) {
			this.aByteArray30 = new byte[this.anInt1750];
			this.aByteArray28 = new byte[this.anInt1750];
			this.aShortArray22 = new short[this.anInt1750];
		}
		if (this.anInt1757 > 0) {
			this.aShortArray26 = new short[this.anInt1757];
			this.aShortArray29 = new short[this.anInt1757];
			this.aByteArray32 = new byte[this.anInt1757];
			this.aShortArray30 = new short[this.anInt1757];
		}
		local12.anInt8936 = 0;
		this.anIntArray93 = new int[this.anInt1746];
		local17.anInt8936 = local185;
		local22.anInt8936 = local191;
		local27.anInt8936 = local98;
		local32.anInt8936 = local139;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(368) int local368;
		@Pc(370) int local370;
		for (@Pc(355) int local355 = 0; local355 < this.anInt1746; local355++) {
			local368 = local12.method7695(98);
			local370 = 0;
			if ((local368 & 0x1) != 0) {
				local370 = local17.method7753();
			}
			@Pc(383) int local383 = 0;
			if ((local368 & 0x2) != 0) {
				local383 = local22.method7753();
			}
			@Pc(393) int local393 = 0;
			if ((local368 & 0x4) != 0) {
				local393 = local27.method7753();
			}
			this.anIntArray93[local355] = local349 + local370;
			this.anIntArray102[local355] = local351 + local383;
			this.anIntArray99[local355] = local353 + local393;
			local351 = this.anIntArray102[local355];
			local353 = this.anIntArray99[local355];
			local349 = this.anIntArray93[local355];
			if (local73 == 1) {
				this.anIntArray101[local355] = local32.method7695(105);
			}
		}
		local12.anInt8936 = local167;
		local17.anInt8936 = local127;
		local22.anInt8936 = local107;
		local27.anInt8936 = local149;
		local32.anInt8936 = local117;
		for (local368 = 0; local368 < this.anInt1750; local368++) {
			this.aShortArray21[local368] = (short) local12.method7717(-1978450544);
			if (local57 == 1) {
				local370 = local17.method7695(96);
				if ((local370 & 0x1) == 1) {
					local5 = true;
					this.aByteArray28[local368] = 1;
				} else {
					this.aByteArray28[local368] = 0;
				}
				if ((local370 & 0x2) == 2) {
					this.aByteArray30[local368] = (byte) (local370 >> 2);
					this.aShortArray22[local368] = this.aShortArray21[local368];
					this.aShortArray21[local368] = 127;
					if (this.aShortArray22[local368] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray30[local368] = -1;
					this.aShortArray22[local368] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray27[local368] = local22.method7720();
			}
			if (local65 == 1) {
				this.aByteArray29[local368] = local27.method7720();
			}
			if (local69 == 1) {
				this.anIntArray100[local368] = local32.method7695(116);
			}
		}
		local12.anInt8936 = local161;
		this.anInt1755 = -1;
		local17.anInt8936 = local100;
		@Pc(617) short local617 = 0;
		@Pc(619) short local619 = 0;
		@Pc(621) short local621 = 0;
		@Pc(623) short local623 = 0;
		@Pc(630) int local630;
		for (@Pc(625) int local625 = 0; local625 < this.anInt1750; local625++) {
			local630 = local17.method7695(118);
			if (local630 == 1) {
				local617 = (short) (local12.method7753() + local623);
				local619 = (short) (local12.method7753() + local617);
				local621 = (short) (local619 + local12.method7753());
				this.aShortArray25[local625] = local617;
				local623 = local621;
				this.aShortArray27[local625] = local619;
				this.aShortArray24[local625] = local621;
				if (this.anInt1755 < local617) {
					this.anInt1755 = local617;
				}
				if (this.anInt1755 < local619) {
					this.anInt1755 = local619;
				}
				if (this.anInt1755 < local621) {
					this.anInt1755 = local621;
				}
			}
			if (local630 == 2) {
				local619 = local621;
				local621 = (short) (local12.method7753() + local623);
				local623 = local621;
				this.aShortArray25[local625] = local617;
				this.aShortArray27[local625] = local619;
				this.aShortArray24[local625] = local621;
				if (this.anInt1755 < local621) {
					this.anInt1755 = local621;
				}
			}
			if (local630 == 3) {
				local617 = local621;
				local621 = (short) (local623 + local12.method7753());
				this.aShortArray25[local625] = local617;
				local623 = local621;
				this.aShortArray27[local625] = local619;
				this.aShortArray24[local625] = local621;
				if (this.anInt1755 < local621) {
					this.anInt1755 = local621;
				}
			}
			if (local630 == 4) {
				@Pc(799) short local799 = local617;
				local617 = local619;
				local619 = local799;
				local621 = (short) (local623 + local12.method7753());
				this.aShortArray25[local625] = local617;
				local623 = local621;
				this.aShortArray27[local625] = local799;
				this.aShortArray24[local625] = local621;
				if (this.anInt1755 < local621) {
					this.anInt1755 = local621;
				}
			}
		}
		this.anInt1755++;
		local12.anInt8936 = local176;
		for (local630 = 0; local630 < this.anInt1757; local630++) {
			this.aByteArray32[local630] = 0;
			this.aShortArray29[local630] = (short) local12.method7717(-1978450544);
			this.aShortArray30[local630] = (short) local12.method7717(-1978450544);
			this.aShortArray26[local630] = (short) local12.method7717(-1978450544);
		}
		if (this.aByteArray30 != null) {
			@Pc(906) boolean local906 = false;
			for (@Pc(908) int local908 = 0; local908 < this.anInt1750; local908++) {
				@Pc(916) int local916 = this.aByteArray30[local908] & 0xFF;
				if (local916 != 255) {
					if ((this.aShortArray29[local916] & 0xFFFF) == this.aShortArray25[local908] && (this.aShortArray30[local916] & 0xFFFF) == this.aShortArray27[local908] && (this.aShortArray26[local916] & 0xFFFF) == this.aShortArray24[local908]) {
						this.aByteArray30[local908] = -1;
					} else {
						local906 = true;
					}
				}
			}
			if (!local906) {
				this.aByteArray30 = null;
			}
		}
		if (!local5) {
			this.aByteArray28 = null;
		}
		if (!local7) {
			this.aShortArray22 = null;
		}
	}
}
