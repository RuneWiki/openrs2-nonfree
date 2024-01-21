import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class5_Sub1_Sub1_Sub2 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!bf", name = "rb", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!bf", name = "tb", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!bf", name = "ub", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!bf", name = "wb", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!bf", name = "xb", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!bf", name = "yb", descriptor = "[I")
	public int[] anIntArray27;

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!bf", name = "Ab", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!bf", name = "Bb", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bf", name = "Cb", descriptor = "[I")
	public int[] anIntArray28;

	@OriginalMember(owner = "client!bf", name = "Db", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!bf", name = "Eb", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!bf", name = "Fb", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!bf", name = "Hb", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "I")
	public int anInt349 = 0;

	@OriginalMember(owner = "client!bf", name = "ob", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
	public int anInt345 = 0;

	@OriginalMember(owner = "client!bf", name = "vb", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!bf", name = "lb", descriptor = "I")
	public int anInt347 = 0;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([Lclient!bf;I)V")
	public Class5_Sub1_Sub1_Sub2(@OriginalArg(0) Class5_Sub1_Sub1_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt349 = 0;
		this.anInt347 = 0;
		this.anInt345 = 0;
		this.aByte1 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class5_Sub1_Sub1_Sub2 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt349 += local41.anInt349;
				this.anInt347 += local41.anInt347;
				this.anInt345 += local41.anInt345;
				if (local41.aByteArray2 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local41.aByte1;
					}
					if (this.aByte1 != local41.aByte1) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray3 != null;
				local22 |= local41.aByteArray4 != null;
			}
		}
		this.anIntArray26 = new int[this.anInt349];
		this.anIntArray29 = new int[this.anInt349];
		this.anIntArray22 = new int[this.anInt349];
		this.anIntArray28 = new int[this.anInt347];
		this.anIntArray25 = new int[this.anInt347];
		this.anIntArray19 = new int[this.anInt347];
		this.anIntArray21 = new int[this.anInt347];
		this.anIntArray24 = new int[this.anInt347];
		this.anIntArray20 = new int[this.anInt347];
		if (this.anInt345 > 0) {
			this.anIntArray23 = new int[this.anInt345];
			this.anIntArray18 = new int[this.anInt345];
			this.anIntArray27 = new int[this.anInt345];
		}
		if (local18) {
			this.aByteArray2 = new byte[this.anInt347];
		}
		if (local20) {
			this.aByteArray3 = new byte[this.anInt347];
		}
		if (local22) {
			this.aByteArray4 = new byte[this.anInt347];
			this.aShortArray1 = new short[this.anInt347];
		}
		this.anInt349 = 0;
		this.anInt347 = 0;
		this.anInt345 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class5_Sub1_Sub1_Sub2 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt349;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt349; local221++) {
					this.anIntArray26[this.anInt349] = local214.anIntArray26[local221];
					this.anIntArray29[this.anInt349] = local214.anIntArray29[local221];
					this.anIntArray22[this.anInt349] = local214.anIntArray22[local221];
					this.anInt349++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt347; local262++) {
					this.anIntArray28[this.anInt347] = local214.anIntArray28[local262] + local219;
					this.anIntArray25[this.anInt347] = local214.anIntArray25[local262] + local219;
					this.anIntArray19[this.anInt347] = local214.anIntArray19[local262] + local219;
					this.anIntArray21[this.anInt347] = local214.anIntArray21[local262];
					this.anIntArray24[this.anInt347] = local214.anIntArray24[local262];
					this.anIntArray20[this.anInt347] = local214.anIntArray20[local262];
					if (local18) {
						if (local214.aByteArray2 == null) {
							this.aByteArray2[this.anInt347] = local214.aByte1;
						} else {
							this.aByteArray2[this.anInt347] = local214.aByteArray2[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray3 == null) {
							this.aByteArray3[this.anInt347] = 0;
						} else {
							this.aByteArray3[this.anInt347] = local214.aByteArray3[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray4 == null || local214.aByteArray4[local262] == -1) {
							this.aByteArray4[this.anInt347] = -1;
						} else {
							this.aByteArray4[this.anInt347] = (byte) (local214.aByteArray4[local262] + local207);
							this.aShortArray1[this.anInt347] = local214.aShortArray1[local262];
						}
					}
					this.anInt347++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt345; local418++) {
					this.anIntArray23[this.anInt345] = local214.anIntArray23[local418] + local219;
					this.anIntArray18[this.anInt345] = local214.anIntArray18[local418] + local219;
					this.anIntArray27[this.anInt345] = local214.anIntArray27[local418] + local219;
					this.anInt345++;
				}
				local207 += local214.anInt345;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
	public void method232() {
		if (this.anInt352 == 1) {
			return;
		}
		this.anInt352 = 1;
		super.anInt2987 = 0;
		this.anInt350 = 0;
		this.anInt346 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt349; local18++) {
			@Pc(24) int local24 = this.anIntArray26[local18];
			@Pc(29) int local29 = this.anIntArray29[local18];
			@Pc(34) int local34 = this.anIntArray22[local18];
			if (-local29 > super.anInt2987) {
				super.anInt2987 = -local29;
			}
			if (local29 > this.anInt350) {
				this.anInt350 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt346) {
				this.anInt346 = local58;
			}
		}
		this.anInt346 = (int) (Math.sqrt((double) this.anInt346) + 0.99D);
		this.anInt351 = (int) (Math.sqrt((double) (this.anInt346 * this.anInt346 + super.anInt2987 * super.anInt2987)) + 0.99D);
		this.anInt348 = this.anInt351 + (int) (Math.sqrt((double) (this.anInt346 * this.anInt346 + this.anInt350 * this.anInt350)) + 0.99D);
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
	private void method233(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static80.anInt1969;
		@Pc(3) int local3 = Static80.anInt1972;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray28[arg0];
		@Pc(15) int local15 = this.anIntArray25[arg0];
		@Pc(20) int local20 = this.anIntArray19[arg0];
		@Pc(24) int local24 = Static11.anIntArray46[local10];
		@Pc(28) int local28 = Static11.anIntArray46[local15];
		@Pc(32) int local32 = Static11.anIntArray46[local20];
		if (this.aByteArray3 == null) {
			Static80.anInt1971 = 0;
		} else {
			Static80.anInt1971 = this.aByteArray3[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static11.anIntArray48[0] = Static11.anIntArray45[local10];
			Static11.anIntArray31[0] = Static11.anIntArray37[local10];
			local5++;
			Static11.anIntArray36[0] = this.anIntArray21[arg0];
		} else {
			local73 = Static11.anIntArray32[local10];
			local77 = Static11.anIntArray35[local10];
			local82 = this.anIntArray21[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static11.anIntArray41[local32 - local24];
				Static11.anIntArray48[0] = local1 + (local73 + ((Static11.anIntArray32[local20] - local73) * local95 >> 16) << 9) / 50;
				Static11.anIntArray31[0] = local3 + (local77 + ((Static11.anIntArray35[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static11.anIntArray36[0] = local82 + ((this.anIntArray20[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static11.anIntArray41[local28 - local24];
				Static11.anIntArray48[local5] = local1 + (local73 + ((Static11.anIntArray32[local15] - local73) * local95 >> 16) << 9) / 50;
				Static11.anIntArray31[local5] = local3 + (local77 + ((Static11.anIntArray35[local15] - local77) * local95 >> 16) << 9) / 50;
				Static11.anIntArray36[local5++] = local82 + ((this.anIntArray24[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static11.anIntArray48[local5] = Static11.anIntArray45[local15];
			Static11.anIntArray31[local5] = Static11.anIntArray37[local15];
			Static11.anIntArray36[local5++] = this.anIntArray24[arg0];
		} else {
			local73 = Static11.anIntArray32[local15];
			local77 = Static11.anIntArray35[local15];
			local82 = this.anIntArray24[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static11.anIntArray41[local24 - local28];
				Static11.anIntArray48[local5] = local1 + (local73 + ((Static11.anIntArray32[local10] - local73) * local95 >> 16) << 9) / 50;
				Static11.anIntArray31[local5] = local3 + (local77 + ((Static11.anIntArray35[local10] - local77) * local95 >> 16) << 9) / 50;
				Static11.anIntArray36[local5++] = local82 + ((this.anIntArray21[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static11.anIntArray41[local32 - local28];
				Static11.anIntArray48[local5] = local1 + (local73 + ((Static11.anIntArray32[local20] - local73) * local95 >> 16) << 9) / 50;
				Static11.anIntArray31[local5] = local3 + (local77 + ((Static11.anIntArray35[local20] - local77) * local95 >> 16) << 9) / 50;
				Static11.anIntArray36[local5++] = local82 + ((this.anIntArray20[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static11.anIntArray48[local5] = Static11.anIntArray45[local20];
			Static11.anIntArray31[local5] = Static11.anIntArray37[local20];
			Static11.anIntArray36[local5++] = this.anIntArray20[arg0];
		} else {
			local73 = Static11.anIntArray32[local20];
			local77 = Static11.anIntArray35[local20];
			local82 = this.anIntArray20[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static11.anIntArray41[local28 - local32];
				Static11.anIntArray48[local5] = local1 + (local73 + ((Static11.anIntArray32[local15] - local73) * local95 >> 16) << 9) / 50;
				Static11.anIntArray31[local5] = local3 + (local77 + ((Static11.anIntArray35[local15] - local77) * local95 >> 16) << 9) / 50;
				Static11.anIntArray36[local5++] = local82 + ((this.anIntArray24[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static11.anIntArray41[local24 - local32];
				Static11.anIntArray48[local5] = local1 + (local73 + ((Static11.anIntArray32[local10] - local73) * local95 >> 16) << 9) / 50;
				Static11.anIntArray31[local5] = local3 + (local77 + ((Static11.anIntArray35[local10] - local77) * local95 >> 16) << 9) / 50;
				Static11.anIntArray36[local5++] = local82 + ((this.anIntArray21[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static11.anIntArray48[0];
		local77 = Static11.anIntArray48[1];
		local82 = Static11.anIntArray48[2];
		local95 = Static11.anIntArray31[0];
		@Pc(590) int local590 = Static11.anIntArray31[1];
		@Pc(594) int local594 = Static11.anIntArray31[2];
		Static80.aBoolean94 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static80.anInt1968 || local77 > Static80.anInt1968 || local82 > Static80.anInt1968) {
				Static80.aBoolean94 = true;
			}
			if (this.aByteArray4 != null && this.aByteArray4[arg0] != -1) {
				local669 = this.aByteArray4[arg0] & 0xFF;
				local674 = this.anIntArray23[local669];
				local679 = this.anIntArray18[local669];
				local684 = this.anIntArray27[local669];
				if (this.anIntArray20[arg0] == -1) {
					Static80.method1324(local95, local590, local594, local73, local77, local82, this.anIntArray21[arg0], this.anIntArray21[arg0], this.anIntArray21[arg0], Static11.anIntArray32[local674], Static11.anIntArray32[local679], Static11.anIntArray32[local684], Static11.anIntArray35[local674], Static11.anIntArray35[local679], Static11.anIntArray35[local684], Static11.anIntArray46[local674], Static11.anIntArray46[local679], Static11.anIntArray46[local684], this.aShortArray1[arg0]);
				} else {
					Static80.method1324(local95, local590, local594, local73, local77, local82, Static11.anIntArray36[0], Static11.anIntArray36[1], Static11.anIntArray36[2], Static11.anIntArray32[local674], Static11.anIntArray32[local679], Static11.anIntArray32[local684], Static11.anIntArray35[local674], Static11.anIntArray35[local679], Static11.anIntArray35[local684], Static11.anIntArray46[local674], Static11.anIntArray46[local679], Static11.anIntArray46[local684], this.aShortArray1[arg0]);
				}
			} else if (this.anIntArray20[arg0] == -1) {
				Static80.method1329(local95, local590, local594, local73, local77, local82, Static11.anIntArray38[this.anIntArray21[arg0]]);
			} else {
				Static80.method1326(local95, local590, local594, local73, local77, local82, Static11.anIntArray36[0], Static11.anIntArray36[1], Static11.anIntArray36[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static80.anInt1968 || local77 > Static80.anInt1968 || local82 > Static80.anInt1968 || Static11.anIntArray48[3] < 0 || Static11.anIntArray48[3] > Static80.anInt1968) {
			Static80.aBoolean94 = true;
		}
		if (this.aByteArray4 == null || this.aByteArray4[arg0] == -1) {
			if (this.anIntArray20[arg0] == -1) {
				local669 = Static11.anIntArray38[this.anIntArray21[arg0]];
				Static80.method1329(local95, local590, local594, local73, local77, local82, local669);
				Static80.method1329(local95, local594, Static11.anIntArray31[3], local73, local82, Static11.anIntArray48[3], local669);
				return;
			}
			Static80.method1326(local95, local590, local594, local73, local77, local82, Static11.anIntArray36[0], Static11.anIntArray36[1], Static11.anIntArray36[2]);
			Static80.method1326(local95, local594, Static11.anIntArray31[3], local73, local82, Static11.anIntArray48[3], Static11.anIntArray36[0], Static11.anIntArray36[2], Static11.anIntArray36[3]);
			return;
		}
		local669 = this.aByteArray4[arg0] & 0xFF;
		local674 = this.anIntArray23[local669];
		local679 = this.anIntArray18[local669];
		local684 = this.anIntArray27[local669];
		@Pc(924) short local924 = this.aShortArray1[arg0];
		if (this.anIntArray20[arg0] == -1) {
			Static80.method1324(local95, local590, local594, local73, local77, local82, this.anIntArray21[arg0], this.anIntArray21[arg0], this.anIntArray21[arg0], Static11.anIntArray32[local674], Static11.anIntArray32[local679], Static11.anIntArray32[local684], Static11.anIntArray35[local674], Static11.anIntArray35[local679], Static11.anIntArray35[local684], Static11.anIntArray46[local674], Static11.anIntArray46[local679], Static11.anIntArray46[local684], local924);
			Static80.method1324(local95, local594, Static11.anIntArray31[3], local73, local82, Static11.anIntArray48[3], this.anIntArray21[arg0], this.anIntArray21[arg0], this.anIntArray21[arg0], Static11.anIntArray32[local674], Static11.anIntArray32[local679], Static11.anIntArray32[local684], Static11.anIntArray35[local674], Static11.anIntArray35[local679], Static11.anIntArray35[local684], Static11.anIntArray46[local674], Static11.anIntArray46[local679], Static11.anIntArray46[local684], local924);
			return;
		}
		Static80.method1324(local95, local590, local594, local73, local77, local82, Static11.anIntArray36[0], Static11.anIntArray36[1], Static11.anIntArray36[2], Static11.anIntArray32[local674], Static11.anIntArray32[local679], Static11.anIntArray32[local684], Static11.anIntArray35[local674], Static11.anIntArray35[local679], Static11.anIntArray35[local684], Static11.anIntArray46[local674], Static11.anIntArray46[local679], Static11.anIntArray46[local684], local924);
		Static80.method1324(local95, local594, Static11.anIntArray31[3], local73, local82, Static11.anIntArray48[3], Static11.anIntArray36[0], Static11.anIntArray36[2], Static11.anIntArray36[3], Static11.anIntArray32[local674], Static11.anIntArray32[local679], Static11.anIntArray32[local684], Static11.anIntArray35[local674], Static11.anIntArray35[local679], Static11.anIntArray35[local684], Static11.anIntArray46[local674], Static11.anIntArray46[local679], Static11.anIntArray46[local684], local924);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZ)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class5_Sub1_Sub1_Sub2 local16;
		if (arg4) {
			local16 = new Class5_Sub1_Sub1_Sub2();
			local16.anInt349 = this.anInt349;
			local16.anInt347 = this.anInt347;
			local16.anInt345 = this.anInt345;
			local16.anIntArray26 = this.anIntArray26;
			local16.anIntArray22 = this.anIntArray22;
			local16.anIntArray28 = this.anIntArray28;
			local16.anIntArray25 = this.anIntArray25;
			local16.anIntArray19 = this.anIntArray19;
			local16.anIntArray21 = this.anIntArray21;
			local16.anIntArray24 = this.anIntArray24;
			local16.anIntArray20 = this.anIntArray20;
			local16.aByteArray2 = this.aByteArray2;
			local16.aByteArray3 = this.aByteArray3;
			local16.aByteArray4 = this.aByteArray4;
			local16.aShortArray1 = this.aShortArray1;
			local16.aByte1 = this.aByte1;
			local16.anIntArray23 = this.anIntArray23;
			local16.anIntArray18 = this.anIntArray18;
			local16.anIntArray27 = this.anIntArray27;
			local16.anIntArrayArray4 = this.anIntArrayArray4;
			local16.anIntArrayArray3 = this.anIntArrayArray3;
			local16.aBoolean8 = this.aBoolean8;
			local16.anIntArray29 = new int[local16.anInt349];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt349; local124++) {
			@Pc(130) int local130 = this.anIntArray26[local124];
			@Pc(135) int local135 = this.anIntArray29[local124];
			@Pc(140) int local140 = this.anIntArray22[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray29[local124] = local135 + local176 - local122;
		}
		local16.anInt352 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	public void method236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt349; local1++) {
			this.anIntArray26[local1] = this.anIntArray26[local1] * arg0 / 128;
			this.anIntArray29[local1] = this.anIntArray29[local1] * arg1 / 128;
			this.anIntArray22[local1] = this.anIntArray22[local1] * arg2 / 128;
		}
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!dc;ILclient!dc;I[I)V")
	public void method237(@OriginalArg(0) Class5_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method242(arg0, arg1);
			return;
		}
		@Pc(18) Class38 local18 = arg0.aClass38Array1[arg1];
		@Pc(23) Class38 local23 = arg2.aClass38Array1[arg3];
		@Pc(26) Class5_Sub8 local26 = local18.aClass5_Sub8_1;
		Static11.anInt355 = 0;
		Static11.anInt358 = 0;
		Static11.anInt354 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1434; local41++) {
			local47 = local18.anIntArray165[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray213[local47] == 0) {
				this.method244(local26.anIntArray213[local47], local26.anIntArrayArray21[local47], local18.anIntArray166[local41], local18.anIntArray163[local41], local18.anIntArray161[local41]);
			}
		}
		Static11.anInt355 = 0;
		Static11.anInt358 = 0;
		Static11.anInt354 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1434; local47++) {
			@Pc(112) int local112 = local23.anIntArray165[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray213[local112] == 0) {
				this.method244(local26.anIntArray213[local112], local26.anIntArrayArray21[local112], local23.anIntArray166[local47], local23.anIntArray163[local47], local23.anIntArray161[local47]);
			}
		}
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLclient!bf;[B)Lclient!bf;")
	private Class5_Sub1_Sub1_Sub2 method238(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt349 = this.anInt349;
		arg1.anInt347 = this.anInt347;
		arg1.anInt345 = this.anInt345;
		if (arg1.anIntArray26 == null || arg1.anIntArray26.length < this.anInt349) {
			arg1.anIntArray26 = new int[this.anInt349 + 100];
			arg1.anIntArray29 = new int[this.anInt349 + 100];
			arg1.anIntArray22 = new int[this.anInt349 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt349; local43++) {
			arg1.anIntArray26[local43] = this.anIntArray26[local43];
			arg1.anIntArray29[local43] = this.anIntArray29[local43];
			arg1.anIntArray22[local43] = this.anIntArray22[local43];
		}
		if (arg0) {
			arg1.aByteArray3 = this.aByteArray3;
		} else {
			arg1.aByteArray3 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray3 == null) {
				for (local88 = 0; local88 < this.anInt347; local88++) {
					arg1.aByteArray3[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt347; local88++) {
					arg1.aByteArray3[local88] = this.aByteArray3[local88];
				}
			}
		}
		arg1.anIntArray28 = this.anIntArray28;
		arg1.anIntArray25 = this.anIntArray25;
		arg1.anIntArray19 = this.anIntArray19;
		arg1.anIntArray21 = this.anIntArray21;
		arg1.anIntArray24 = this.anIntArray24;
		arg1.anIntArray20 = this.anIntArray20;
		arg1.aByteArray2 = this.aByteArray2;
		arg1.aByteArray4 = this.aByteArray4;
		arg1.aShortArray1 = this.aShortArray1;
		arg1.aByte1 = this.aByte1;
		arg1.anIntArray23 = this.anIntArray23;
		arg1.anIntArray18 = this.anIntArray18;
		arg1.anIntArray27 = this.anIntArray27;
		arg1.anIntArrayArray4 = this.anIntArrayArray4;
		arg1.anIntArrayArray3 = this.anIntArrayArray3;
		arg1.aBoolean8 = this.aBoolean8;
		arg1.anInt352 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()V")
	public void method239() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt349; local1++) {
			this.anIntArray26[local1] = -this.anIntArray26[local1];
			this.anIntArray22[local1] = -this.anIntArray22[local1];
		}
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()V")
	public void method240() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt349; local1++) {
			@Pc(7) int local7 = this.anIntArray26[local1];
			this.anIntArray26[local1] = this.anIntArray22[local1];
			this.anIntArray22[local1] = -local7;
		}
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!dc;I)V")
	public void method242(@OriginalArg(0) Class5_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray4 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class38 local12 = arg0.aClass38Array1[arg1];
		@Pc(15) Class5_Sub8 local15 = local12.aClass5_Sub8_1;
		Static11.anInt355 = 0;
		Static11.anInt358 = 0;
		Static11.anInt354 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1434; local23++) {
			@Pc(29) int local29 = local12.anIntArray165[local23];
			this.method244(local15.anIntArray213[local29], local15.anIntArrayArray21[local29], local12.anIntArray166[local23], local12.anIntArray163[local23], local12.anIntArray161[local23]);
		}
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method243(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static11.aByteArray5.length < this.anInt347) {
			Static11.aByteArray5 = new byte[this.anInt347 + 100];
		}
		return this.method238(arg0, Static11.aClass5_Sub1_Sub1_Sub2_1, Static11.aByteArray5);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[IIII)V")
	private void method244(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static11.anInt355 = 0;
			Static11.anInt358 = 0;
			Static11.anInt354 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray4.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray4[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static11.anInt355 += this.anIntArray26[local36];
						Static11.anInt358 += this.anIntArray29[local36];
						Static11.anInt354 += this.anIntArray22[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static11.anInt355 = Static11.anInt355 / local6 + arg2;
				Static11.anInt358 = Static11.anInt358 / local6 + arg3;
				Static11.anInt354 = Static11.anInt354 / local6 + arg4;
			} else {
				Static11.anInt355 = arg2;
				Static11.anInt358 = arg3;
				Static11.anInt354 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray4.length) {
					local115 = this.anIntArrayArray4[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray26[local31] += arg2;
						this.anIntArray29[local31] += arg3;
						this.anIntArray22[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray4.length) {
					local115 = this.anIntArrayArray4[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray26[local31] -= Static11.anInt355;
						this.anIntArray29[local31] -= Static11.anInt358;
						this.anIntArray22[local31] -= Static11.anInt354;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static11.anIntArray47[local225];
							local235 = Static11.anIntArray40[local225];
							local251 = this.anIntArray29[local31] * local231 + this.anIntArray26[local31] * local235 >> 16;
							this.anIntArray29[local31] = this.anIntArray29[local31] * local235 - this.anIntArray26[local31] * local231 >> 16;
							this.anIntArray26[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static11.anIntArray47[local36];
							local235 = Static11.anIntArray40[local36];
							local251 = this.anIntArray29[local31] * local235 - this.anIntArray22[local31] * local231 >> 16;
							this.anIntArray22[local31] = this.anIntArray29[local31] * local231 + this.anIntArray22[local31] * local235 >> 16;
							this.anIntArray29[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static11.anIntArray47[local219];
							local235 = Static11.anIntArray40[local219];
							local251 = this.anIntArray22[local31] * local231 + this.anIntArray26[local31] * local235 >> 16;
							this.anIntArray22[local31] = this.anIntArray22[local31] * local235 - this.anIntArray26[local31] * local231 >> 16;
							this.anIntArray26[local31] = local251;
						}
						this.anIntArray26[local31] += Static11.anInt355;
						this.anIntArray29[local31] += Static11.anInt358;
						this.anIntArray22[local31] += Static11.anInt354;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray4.length) {
					local115 = this.anIntArrayArray4[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray26[local31] -= Static11.anInt355;
						this.anIntArray29[local31] -= Static11.anInt358;
						this.anIntArray22[local31] -= Static11.anInt354;
						this.anIntArray26[local31] = this.anIntArray26[local31] * arg2 / 128;
						this.anIntArray29[local31] = this.anIntArray29[local31] * arg3 / 128;
						this.anIntArray22[local31] = this.anIntArray22[local31] * arg4 / 128;
						this.anIntArray26[local31] += Static11.anInt355;
						this.anIntArray29[local31] += Static11.anInt358;
						this.anIntArray22[local31] += Static11.anInt354;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray3 != null && this.aByteArray3 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray3.length) {
					local115 = this.anIntArrayArray3[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray3[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray3[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
	private void method245(@OriginalArg(0) int arg0) {
		if (Static11.aBooleanArray1[arg0]) {
			this.method233(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray28[arg0];
		@Pc(17) int local17 = this.anIntArray25[arg0];
		@Pc(22) int local22 = this.anIntArray19[arg0];
		Static80.aBoolean94 = Static11.aBooleanArray2[arg0];
		if (this.aByteArray3 == null) {
			Static80.anInt1971 = 0;
		} else {
			Static80.anInt1971 = this.aByteArray3[arg0] & 0xFF;
		}
		if (this.aByteArray4 != null && this.aByteArray4[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray4[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray23[local119];
			@Pc(129) int local129 = this.anIntArray18[local119];
			@Pc(134) int local134 = this.anIntArray27[local119];
			if (this.anIntArray20[arg0] == -1) {
				Static80.method1324(Static11.anIntArray37[local12], Static11.anIntArray37[local17], Static11.anIntArray37[local22], Static11.anIntArray45[local12], Static11.anIntArray45[local17], Static11.anIntArray45[local22], this.anIntArray21[arg0], this.anIntArray21[arg0], this.anIntArray21[arg0], Static11.anIntArray32[local124], Static11.anIntArray32[local129], Static11.anIntArray32[local134], Static11.anIntArray35[local124], Static11.anIntArray35[local129], Static11.anIntArray35[local134], Static11.anIntArray46[local124], Static11.anIntArray46[local129], Static11.anIntArray46[local134], this.aShortArray1[arg0]);
			} else {
				Static80.method1324(Static11.anIntArray37[local12], Static11.anIntArray37[local17], Static11.anIntArray37[local22], Static11.anIntArray45[local12], Static11.anIntArray45[local17], Static11.anIntArray45[local22], this.anIntArray21[arg0], this.anIntArray24[arg0], this.anIntArray20[arg0], Static11.anIntArray32[local124], Static11.anIntArray32[local129], Static11.anIntArray32[local134], Static11.anIntArray35[local124], Static11.anIntArray35[local129], Static11.anIntArray35[local134], Static11.anIntArray46[local124], Static11.anIntArray46[local129], Static11.anIntArray46[local134], this.aShortArray1[arg0]);
			}
		} else if (this.anIntArray20[arg0] == -1) {
			Static80.method1329(Static11.anIntArray37[local12], Static11.anIntArray37[local17], Static11.anIntArray37[local22], Static11.anIntArray45[local12], Static11.anIntArray45[local17], Static11.anIntArray45[local22], Static11.anIntArray38[this.anIntArray21[arg0]]);
		} else {
			Static80.method1326(Static11.anIntArray37[local12], Static11.anIntArray37[local17], Static11.anIntArray37[local22], Static11.anIntArray45[local12], Static11.anIntArray45[local17], Static11.anIntArray45[local22], this.anIntArray21[arg0], this.anIntArray24[arg0], this.anIntArray20[arg0]);
		}
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
	public void method246(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static11.anIntArray47[arg0];
		@Pc(7) int local7 = Static11.anIntArray40[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt349; local9++) {
			@Pc(26) int local26 = this.anIntArray29[local9] * local7 - this.anIntArray22[local9] * local3 >> 16;
			this.anIntArray22[local9] = this.anIntArray29[local9] * local3 + this.anIntArray22[local9] * local7 >> 16;
			this.anIntArray29[local9] = local26;
		}
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIIIII)V")
	public void method247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.anInt352 != 2 && this.anInt352 != 1) {
			this.method254();
		}
		@Pc(11) int local11 = Static80.anInt1969;
		@Pc(13) int local13 = Static80.anInt1972;
		@Pc(17) int local17 = Static11.anIntArray47[0];
		@Pc(21) int local21 = Static11.anIntArray40[0];
		@Pc(25) int local25 = Static11.anIntArray47[arg0];
		@Pc(29) int local29 = Static11.anIntArray40[arg0];
		@Pc(33) int local33 = Static11.anIntArray47[arg1];
		@Pc(37) int local37 = Static11.anIntArray40[arg1];
		@Pc(41) int local41 = Static11.anIntArray47[arg2];
		@Pc(45) int local45 = Static11.anIntArray40[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt349; local57++) {
			@Pc(63) int local63 = this.anIntArray26[local57];
			@Pc(68) int local68 = this.anIntArray29[local57];
			@Pc(73) int local73 = this.anIntArray22[local57];
			@Pc(85) int local85;
			if (arg1 != 0) {
				local85 = local68 * local33 + local63 * local37 >> 16;
				local68 = local68 * local37 - local63 * local33 >> 16;
				local63 = local85;
			}
			if (arg0 != 0) {
				local85 = local73 * local25 + local63 * local29 >> 16;
				local73 = local73 * local29 - local63 * local25 >> 16;
				local63 = local85;
			}
			local63 += arg3;
			local68 += arg4;
			local73 += arg5;
			local85 = local68 * local45 - local73 * local41 >> 16;
			local73 = local68 * local41 + local73 * local45 >> 16;
			Static11.anIntArray42[local57] = local73 - local55;
			Static11.anIntArray45[local57] = local11 + (local63 << 9) / arg6;
			Static11.anIntArray37[local57] = local13 + (local85 << 9) / arg6;
			if (this.anInt345 > 0) {
				Static11.anIntArray32[local57] = local63;
				Static11.anIntArray35[local57] = local85;
				Static11.anIntArray46[local57] = local73;
			}
		}
		try {
			this.method251(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()V")
	public void method248() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt349; local1++) {
			@Pc(7) int local7 = this.anIntArray22[local1];
			this.anIntArray22[local1] = this.anIntArray26[local1];
			this.anIntArray26[local1] = -local7;
		}
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
	public void method249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt349; local1++) {
			this.anIntArray26[local1] += arg0;
			this.anIntArray29[local1] += arg1;
			this.anIntArray22[local1] += arg2;
		}
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	public void method250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt352 != 2 && this.anInt352 != 1) {
			this.method254();
		}
		@Pc(11) int local11 = Static80.anInt1969;
		@Pc(13) int local13 = Static80.anInt1972;
		@Pc(17) int local17 = Static11.anIntArray47[0];
		@Pc(21) int local21 = Static11.anIntArray40[0];
		@Pc(25) int local25 = Static11.anIntArray47[arg0];
		@Pc(29) int local29 = Static11.anIntArray40[arg0];
		@Pc(33) int local33 = Static11.anIntArray47[arg1];
		@Pc(37) int local37 = Static11.anIntArray40[arg1];
		@Pc(41) int local41 = Static11.anIntArray47[arg2];
		@Pc(45) int local45 = Static11.anIntArray40[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt349; local57++) {
			@Pc(63) int local63 = this.anIntArray26[local57];
			@Pc(68) int local68 = this.anIntArray29[local57];
			@Pc(73) int local73 = this.anIntArray22[local57];
			@Pc(85) int local85;
			if (arg1 != 0) {
				local85 = local68 * local33 + local63 * local37 >> 16;
				local68 = local68 * local37 - local63 * local33 >> 16;
				local63 = local85;
			}
			if (arg0 != 0) {
				local85 = local73 * local25 + local63 * local29 >> 16;
				local73 = local73 * local29 - local63 * local25 >> 16;
				local63 = local85;
			}
			local63 += arg3;
			local68 += arg4;
			local73 += arg5;
			local85 = local68 * local45 - local73 * local41 >> 16;
			local73 = local68 * local41 + local73 * local45 >> 16;
			Static11.anIntArray42[local57] = local73 - local55;
			Static11.anIntArray45[local57] = local11 + (local63 << 9) / local73;
			Static11.anIntArray37[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt345 > 0) {
				Static11.anIntArray32[local57] = local63;
				Static11.anIntArray35[local57] = local85;
				Static11.anIntArray46[local57] = local73;
			}
		}
		try {
			this.method251(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZI)V")
	private void method251(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt348 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt348; local6++) {
			Static11.anIntArray43[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt347; local18++) {
			if (this.anIntArray20[local18] != -2) {
				local30 = this.anIntArray28[local18];
				local35 = this.anIntArray25[local18];
				local40 = this.anIntArray19[local18];
				local44 = Static11.anIntArray45[local30];
				local48 = Static11.anIntArray45[local35];
				local52 = Static11.anIntArray45[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static11.anIntArray32[local30];
					local71 = Static11.anIntArray32[local35];
					@Pc(75) int local75 = Static11.anIntArray32[local40];
					@Pc(79) int local79 = Static11.anIntArray35[local30];
					local83 = Static11.anIntArray35[local35];
					local87 = Static11.anIntArray35[local40];
					@Pc(91) int local91 = Static11.anIntArray46[local30];
					local95 = Static11.anIntArray46[local35];
					@Pc(99) int local99 = Static11.anIntArray46[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static11.aBooleanArray1[local18] = true;
						@Pc(180) int local180 = (Static11.anIntArray42[local30] + Static11.anIntArray42[local35] + Static11.anIntArray42[local40]) / 3 + this.anInt351;
						Static11.anIntArrayArray5[local180][Static11.anIntArray43[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method234(Static11.anInt357, Static11.anInt356, Static11.anIntArray37[local30], Static11.anIntArray37[local35], Static11.anIntArray37[local40], local44, local48, local52)) {
						Static11.anIntArray34[Static11.anInt353++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static11.anIntArray37[local40] - Static11.anIntArray37[local35]) - (Static11.anIntArray37[local30] - Static11.anIntArray37[local35]) * (local52 - local48) > 0) {
						Static11.aBooleanArray1[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static80.anInt1968 && local48 <= Static80.anInt1968 && local52 <= Static80.anInt1968) {
							Static11.aBooleanArray2[local18] = false;
						} else {
							Static11.aBooleanArray2[local18] = true;
						}
						local67 = (Static11.anIntArray42[local30] + Static11.anIntArray42[local35] + Static11.anIntArray42[local40]) / 3 + this.anInt351;
						Static11.anIntArrayArray5[local67][Static11.anIntArray43[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray2 == null) {
			for (local30 = this.anInt348 - 1; local30 >= 0; local30--) {
				local35 = Static11.anIntArray43[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static11.anIntArrayArray5[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method245(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static11.anIntArray30[local30] = 0;
			Static11.anIntArray33[local30] = 0;
		}
		for (local35 = this.anInt348 - 1; local35 >= 0; local35--) {
			local40 = Static11.anIntArray43[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static11.anIntArrayArray5[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray2[local52];
					local71 = Static11.anIntArray30[local388]++;
					Static11.anIntArrayArray6[local388][local71] = local52;
					if (local388 < 10) {
						Static11.anIntArray33[local388] += local35;
					} else if (local388 == 10) {
						Static11.anIntArray44[local71] = local35;
					} else {
						Static11.anIntArray39[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static11.anIntArray30[1] > 0 || Static11.anIntArray30[2] > 0) {
			local40 = (Static11.anIntArray33[1] + Static11.anIntArray33[2]) / (Static11.anIntArray30[1] + Static11.anIntArray30[2]);
		}
		local44 = 0;
		if (Static11.anIntArray30[3] > 0 || Static11.anIntArray30[4] > 0) {
			local44 = (Static11.anIntArray33[3] + Static11.anIntArray33[4]) / (Static11.anIntArray30[3] + Static11.anIntArray30[4]);
		}
		local48 = 0;
		if (Static11.anIntArray30[6] > 0 || Static11.anIntArray30[8] > 0) {
			local48 = (Static11.anIntArray33[6] + Static11.anIntArray33[8]) / (Static11.anIntArray30[6] + Static11.anIntArray30[8]);
		}
		local67 = 0;
		local71 = Static11.anIntArray30[10];
		@Pc(521) int[] local521 = Static11.anIntArrayArray6[10];
		@Pc(523) int[] local523 = Static11.anIntArray44;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static11.anIntArray30[11];
			local521 = Static11.anIntArrayArray6[11];
			local523 = Static11.anIntArray39;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method245(local521[local67++]);
				if (local67 == local71 && local521 != Static11.anIntArrayArray6[11]) {
					local67 = 0;
					local71 = Static11.anIntArray30[11];
					local521 = Static11.anIntArrayArray6[11];
					local523 = Static11.anIntArray39;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method245(local521[local67++]);
				if (local67 == local71 && local521 != Static11.anIntArrayArray6[11]) {
					local67 = 0;
					local71 = Static11.anIntArray30[11];
					local521 = Static11.anIntArrayArray6[11];
					local523 = Static11.anIntArray39;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method245(local521[local67++]);
				if (local67 == local71 && local521 != Static11.anIntArrayArray6[11]) {
					local67 = 0;
					local71 = Static11.anIntArray30[11];
					local521 = Static11.anIntArrayArray6[11];
					local523 = Static11.anIntArray39;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static11.anIntArray30[local83];
			@Pc(686) int[] local686 = Static11.anIntArrayArray6[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method245(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method245(local521[local67++]);
			if (local67 == local71 && local521 != Static11.anIntArrayArray6[11]) {
				local67 = 0;
				local521 = Static11.anIntArrayArray6[11];
				local71 = Static11.anIntArray30[11];
				local523 = Static11.anIntArray39;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(Z)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method252(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static11.aByteArray6.length < this.anInt347) {
			Static11.aByteArray6 = new byte[this.anInt347 + 100];
		}
		return this.method238(arg0, Static11.aClass5_Sub1_Sub1_Sub2_2, Static11.aByteArray6);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "()I")
	public int method253() {
		this.method232();
		return this.anInt346;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt352 != 1) {
			this.method232();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt346 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt346 << 9;
		if (local60 / local36 >= Static80.anInt1973) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt346 << 9;
		if (local73 / local36 <= Static80.anInt1975) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt346 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static80.anInt1970) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2987 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static80.anInt1974) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2987 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt345 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static11.aBoolean9) {
			local168 = local25 - local32;
			if (local168 <= 50) {
				local168 = 50;
			}
			if (local53 > 0) {
				local60 /= local36;
				local73 /= local168;
			} else {
				local73 /= local36;
				local60 /= local168;
			}
			if (local89 > 0) {
				local123 /= local36;
				local102 /= local168;
			} else {
				local102 /= local36;
				local123 /= local168;
			}
			local215 = Static11.anInt357 - Static80.anInt1969;
			local219 = Static11.anInt356 - Static80.anInt1972;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean8) {
					Static11.anIntArray34[Static11.anInt353++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static80.anInt1969;
		local215 = Static80.anInt1972;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static11.anIntArray47[arg0];
			local253 = Static11.anIntArray40[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt349; local265++) {
			@Pc(271) int local271 = this.anIntArray26[local265];
			@Pc(276) int local276 = this.anIntArray29[local265];
			@Pc(281) int local281 = this.anIntArray22[local265];
			@Pc(293) int local293;
			if (arg0 != 0) {
				local293 = local281 * local219 + local271 * local253 >> 16;
				local281 = local281 * local253 - local271 * local219 >> 16;
				local271 = local293;
			}
			local271 += arg5;
			local276 += arg6;
			local281 += arg7;
			local293 = local281 * arg3 + local271 * arg4 >> 16;
			local281 = local281 * arg4 - local271 * arg3 >> 16;
			local271 = local293;
			local293 = local276 * arg2 - local281 * arg1 >> 16;
			local281 = local276 * arg1 + local281 * arg2 >> 16;
			Static11.anIntArray42[local265] = local281 - local25;
			if (local281 >= 50) {
				Static11.anIntArray45[local265] = local168 + (local271 << 9) / local281;
				Static11.anIntArray37[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static11.anIntArray45[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static11.anIntArray32[local265] = local271;
				Static11.anIntArray35[local265] = local293;
				Static11.anIntArray46[local265] = local281;
			}
		}
		try {
			this.method251(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "()V")
	private void method254() {
		if (this.anInt352 == 2) {
			return;
		}
		this.anInt352 = 2;
		this.anInt346 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt349; local12++) {
			@Pc(18) int local18 = this.anIntArray26[local12];
			@Pc(23) int local23 = this.anIntArray29[local12];
			@Pc(28) int local28 = this.anIntArray22[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt346) {
				this.anInt346 = local40;
			}
		}
		this.anInt346 = (int) (Math.sqrt((double) this.anInt346) + 0.99D);
		this.anInt351 = this.anInt346;
		this.anInt348 = this.anInt346 + this.anInt346;
	}
}
