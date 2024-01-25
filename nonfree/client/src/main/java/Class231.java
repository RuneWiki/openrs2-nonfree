import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class231 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "[Lclient!lp;")
	public Class212[] aClass212Array1;

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "[Lclient!wj;")
	public Class362[] aClass362Array1;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "[I")
	public int[] anIntArray368;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!nba", name = "q", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!nba", name = "u", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!nba", name = "v", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!nba", name = "x", descriptor = "[I")
	public int[] anIntArray370;

	@OriginalMember(owner = "client!nba", name = "B", descriptor = "[I")
	public int[] anIntArray371;

	@OriginalMember(owner = "client!nba", name = "E", descriptor = "[I")
	public int[] anIntArray372;

	@OriginalMember(owner = "client!nba", name = "F", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!nba", name = "H", descriptor = "[Lclient!ns;")
	public Class244[] aClass244Array1;

	@OriginalMember(owner = "client!nba", name = "I", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!nba", name = "J", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!nba", name = "K", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!nba", name = "M", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!nba", name = "P", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!nba", name = "Q", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!nba", name = "R", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!nba", name = "T", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!nba", name = "U", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!nba", name = "W", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!nba", name = "Z", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!nba", name = "bb", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
	public int anInt6254 = 12;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
	public int anInt6251 = 0;

	@OriginalMember(owner = "client!nba", name = "A", descriptor = "I")
	public int anInt6260 = 0;

	@OriginalMember(owner = "client!nba", name = "V", descriptor = "I")
	public int anInt6267 = 0;

	@OriginalMember(owner = "client!nba", name = "X", descriptor = "I")
	public int anInt6268 = 0;

	@OriginalMember(owner = "client!nba", name = "db", descriptor = "B")
	public byte aByte86 = 0;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "()V")
	private Class231() {
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "([B)V")
	public Class231(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5080(arg0);
		} else {
			this.method5065(arg0);
		}
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(III)V")
	public Class231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray62 = new byte[arg1];
		this.anIntArray367 = new int[arg0];
		this.aByteArray61 = new byte[arg1];
		this.anIntArray375 = new int[arg0];
		this.aShortArray55 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray371 = new int[arg2];
			this.aByteArray63 = new byte[arg2];
			this.aShortArray58 = new short[arg2];
			this.aByteArray59 = new byte[arg2];
			this.aShortArray54 = new short[arg2];
			this.aShortArray57 = new short[arg2];
			this.anIntArray368 = new int[arg2];
			this.anIntArray365 = new int[arg2];
			this.anIntArray373 = new int[arg2];
			this.aByteArray58 = new byte[arg2];
			this.anIntArray369 = new int[arg2];
			this.anIntArray374 = new int[arg2];
		}
		this.anIntArray370 = new int[arg1];
		this.aByteArray60 = new byte[arg1];
		this.anIntArray372 = new int[arg0];
		this.aShortArray51 = new short[arg1];
		this.aShortArray52 = new short[arg1];
		this.anIntArray366 = new int[arg0];
		this.aShortArray61 = new short[arg1];
		this.aShortArray59 = new short[arg1];
		this.aByteArray64 = new byte[arg1];
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "([Lclient!nba;I)V")
	public Class231(@OriginalArg(0) Class231[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6267 = 0;
		this.anInt6251 = 0;
		this.anInt6268 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte86 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class231 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt6268 += local59.anInt6268;
				this.anInt6267 += local59.anInt6267;
				this.anInt6251 += local59.anInt6251;
				if (local59.aClass212Array1 != null) {
					local34 += local59.aClass212Array1.length;
				}
				if (local59.aClass244Array1 != null) {
					local32 += local59.aClass244Array1.length;
				}
				local38 |= local59.aByteArray61 != null;
				if (local59.aClass362Array1 != null) {
					local36 += local59.aClass362Array1.length;
				}
				local44 |= local59.aByteArray64 != null;
				if (local59.aByteArray60 == null) {
					if (this.aByte86 == -1) {
						this.aByte86 = local59.aByte86;
					}
					if (this.aByte86 != local59.aByte86) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local48 |= local59.anIntArray370 != null;
				local42 |= local59.aByteArray62 != null;
				local46 |= local59.aShortArray51 != null;
			}
		}
		if (local48) {
			this.anIntArray370 = new int[this.anInt6268];
		}
		this.anIntArray367 = new int[this.anInt6251];
		this.aShortArray59 = new short[this.anInt6268];
		this.aShortArray52 = new short[this.anInt6268];
		this.anIntArray366 = new int[this.anInt6251];
		if (local36 > 0) {
			this.aClass362Array1 = new Class362[local36];
		}
		if (local38) {
			this.aByteArray61 = new byte[this.anInt6268];
		}
		this.aShortArray61 = new short[this.anInt6268];
		this.aShortArray56 = new short[this.anInt6268];
		if (local32 > 0) {
			this.aClass244Array1 = new Class244[local32];
		}
		if (this.anInt6267 > 0) {
			this.anIntArray369 = new int[this.anInt6267];
			this.aShortArray58 = new short[this.anInt6267];
			this.anIntArray365 = new int[this.anInt6267];
			this.anIntArray371 = new int[this.anInt6267];
			this.anIntArray373 = new int[this.anInt6267];
			this.aByteArray58 = new byte[this.anInt6267];
			this.aShortArray54 = new short[this.anInt6267];
			this.aByteArray63 = new byte[this.anInt6267];
			this.anIntArray374 = new int[this.anInt6267];
			this.aShortArray57 = new short[this.anInt6267];
			this.anIntArray368 = new int[this.anInt6267];
			this.aByteArray59 = new byte[this.anInt6267];
		}
		if (local46) {
			this.aShortArray51 = new short[this.anInt6268];
		}
		if (local40) {
			this.aByteArray60 = new byte[this.anInt6268];
		}
		this.anIntArray372 = new int[this.anInt6251];
		if (local44) {
			this.aByteArray64 = new byte[this.anInt6268];
		}
		this.aShortArray55 = new short[this.anInt6268];
		this.aShortArray53 = new short[this.anInt6251];
		if (local34 > 0) {
			this.aClass212Array1 = new Class212[local34];
		}
		if (local42) {
			this.aByteArray62 = new byte[this.anInt6268];
		}
		this.anIntArray375 = new int[this.anInt6251];
		local34 = 0;
		this.anInt6268 = 0;
		local32 = 0;
		this.anInt6251 = 0;
		this.anInt6267 = 0;
		local36 = 0;
		@Pc(615) int local615;
		@Pc(626) int local626;
		for (@Pc(383) int local383 = 0; local383 < arg1; local383++) {
			@Pc(390) short local390 = (short) (0x1 << local383);
			@Pc(394) Class231 local394 = arg0[local383];
			if (local394 != null) {
				@Pc(401) int local401;
				if (local394.aClass362Array1 != null) {
					for (local401 = 0; local401 < local394.aClass362Array1.length; local401++) {
						@Pc(408) Class362 local408 = local394.aClass362Array1[local401];
						this.aClass362Array1[local36++] = local408.method7817(this.anInt6268 + local408.anInt9627);
					}
				}
				for (local401 = 0; local401 < local394.anInt6268; local401++) {
					if (local38 && local394.aByteArray61 != null) {
						this.aByteArray61[this.anInt6268] = local394.aByteArray61[local401];
					}
					if (local40) {
						if (local394.aByteArray60 == null) {
							this.aByteArray60[this.anInt6268] = local394.aByte86;
						} else {
							this.aByteArray60[this.anInt6268] = local394.aByteArray60[local401];
						}
					}
					if (local42 && local394.aByteArray62 != null) {
						this.aByteArray62[this.anInt6268] = local394.aByteArray62[local401];
					}
					if (local46) {
						if (local394.aShortArray51 == null) {
							this.aShortArray51[this.anInt6268] = -1;
						} else {
							this.aShortArray51[this.anInt6268] = local394.aShortArray51[local401];
						}
					}
					if (local48) {
						if (local394.anIntArray370 == null) {
							this.anIntArray370[this.anInt6268] = -1;
						} else {
							this.anIntArray370[this.anInt6268] = local394.anIntArray370[local401];
						}
					}
					this.aShortArray55[this.anInt6268] = (short) this.method5072(local390, local394, local394.aShortArray55[local401]);
					this.aShortArray61[this.anInt6268] = (short) this.method5072(local390, local394, local394.aShortArray61[local401]);
					this.aShortArray52[this.anInt6268] = (short) this.method5072(local390, local394, local394.aShortArray52[local401]);
					this.aShortArray56[this.anInt6268] = local390;
					this.aShortArray59[this.anInt6268] = local394.aShortArray59[local401];
					this.anInt6268++;
				}
				@Pc(602) int local602;
				if (local394.aClass244Array1 != null) {
					for (local602 = 0; local602 < local394.aClass244Array1.length; local602++) {
						local615 = this.method5072(local390, local394, local394.aClass244Array1[local602].anInt6527);
						local626 = this.method5072(local390, local394, local394.aClass244Array1[local602].anInt6532);
						@Pc(637) int local637 = this.method5072(local390, local394, local394.aClass244Array1[local602].anInt6530);
						this.aClass244Array1[local32] = local394.aClass244Array1[local602].method5297(local637, local626, local615);
						local32++;
					}
				}
				if (local394.aClass212Array1 != null) {
					for (local602 = 0; local602 < local394.aClass212Array1.length; local602++) {
						local615 = this.method5072(local390, local394, local394.aClass212Array1[local602].anInt5656);
						this.aClass212Array1[local34] = local394.aClass212Array1[local602].method4601(local615);
						local34++;
					}
				}
			}
		}
		@Pc(703) int local703 = 0;
		this.anInt6260 = this.anInt6251;
		for (@Pc(709) int local709 = 0; local709 < arg1; local709++) {
			@Pc(716) short local716 = (short) (0x1 << local709);
			@Pc(720) Class231 local720 = arg0[local709];
			if (local720 != null) {
				for (local615 = 0; local615 < local720.anInt6268; local615++) {
					if (local44) {
						this.aByteArray64[local703++] = (byte) (local720.aByteArray64 == null || local720.aByteArray64[local615] == -1 ? -1 : this.anInt6267 + local720.aByteArray64[local615]);
					}
				}
				for (local626 = 0; local626 < local720.anInt6267; local626++) {
					@Pc(776) byte local776 = this.aByteArray59[this.anInt6267] = local720.aByteArray59[local626];
					if (local776 == 0) {
						this.aShortArray57[this.anInt6267] = (short) this.method5072(local716, local720, local720.aShortArray57[local626]);
						this.aShortArray58[this.anInt6267] = (short) this.method5072(local716, local720, local720.aShortArray58[local626]);
						this.aShortArray54[this.anInt6267] = (short) this.method5072(local716, local720, local720.aShortArray54[local626]);
					}
					if (local776 >= 1 && local776 <= 3) {
						this.aShortArray57[this.anInt6267] = local720.aShortArray57[local626];
						this.aShortArray58[this.anInt6267] = local720.aShortArray58[local626];
						this.aShortArray54[this.anInt6267] = local720.aShortArray54[local626];
						this.anIntArray374[this.anInt6267] = local720.anIntArray374[local626];
						this.anIntArray369[this.anInt6267] = local720.anIntArray369[local626];
						this.anIntArray373[this.anInt6267] = local720.anIntArray373[local626];
						this.aByteArray63[this.anInt6267] = local720.aByteArray63[local626];
						this.aByteArray58[this.anInt6267] = local720.aByteArray58[local626];
						this.anIntArray368[this.anInt6267] = local720.anIntArray368[local626];
					}
					if (local776 == 2) {
						this.anIntArray365[this.anInt6267] = local720.anIntArray365[local626];
						this.anIntArray371[this.anInt6267] = local720.anIntArray371[local626];
					}
					this.anInt6267++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIII)V")
	public void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local10 = Class85_Sub8.anIntArray426[arg1];
			local14 = Class85_Sub8.anIntArray427[arg1];
			for (local16 = 0; local16 < this.anInt6251; local16++) {
				local34 = local10 * this.anIntArray375[local16] + this.anIntArray372[local16] * local14 >> 14;
				this.anIntArray375[local16] = local14 * this.anIntArray375[local16] - this.anIntArray372[local16] * local10 >> 14;
				this.anIntArray372[local16] = local34;
			}
		}
		if (arg0 != 0) {
			local10 = Class85_Sub8.anIntArray426[arg0];
			local14 = Class85_Sub8.anIntArray427[arg0];
			for (local16 = 0; local16 < this.anInt6251; local16++) {
				local34 = local14 * this.anIntArray375[local16] - local10 * this.anIntArray366[local16] >> 14;
				this.anIntArray366[local16] = local10 * this.anIntArray375[local16] + local14 * this.anIntArray366[local16] >> 14;
				this.anIntArray375[local16] = local34;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local10 = Class85_Sub8.anIntArray426[arg2];
		local14 = Class85_Sub8.anIntArray427[arg2];
		for (local16 = 0; local16 < this.anInt6251; local16++) {
			local34 = local10 * this.anIntArray366[local16] + this.anIntArray372[local16] * local14 >> 14;
			this.anIntArray366[local16] = this.anIntArray366[local16] * local14 - this.anIntArray372[local16] * local10 >> 14;
			this.anIntArray372[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[B)V")
	private void method5065(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub3 local14 = new Class1_Sub3(arg0);
		@Pc(19) Class1_Sub3 local19 = new Class1_Sub3(arg0);
		@Pc(24) Class1_Sub3 local24 = new Class1_Sub3(arg0);
		@Pc(29) Class1_Sub3 local29 = new Class1_Sub3(arg0);
		@Pc(34) Class1_Sub3 local34 = new Class1_Sub3(arg0);
		local14.anInt9802 = arg0.length - 18;
		this.anInt6251 = local14.method7945();
		this.anInt6268 = local14.method7945();
		this.anInt6267 = local14.method7974();
		@Pc(59) int local59 = local14.method7974();
		@Pc(63) int local63 = local14.method7974();
		@Pc(67) int local67 = local14.method7974();
		@Pc(71) int local71 = local14.method7974();
		@Pc(75) int local75 = local14.method7974();
		@Pc(79) int local79 = local14.method7945();
		@Pc(83) int local83 = local14.method7945();
		@Pc(89) int local89 = local14.method7945();
		@Pc(93) int local93 = local14.method7945();
		@Pc(102) int local102 = this.anInt6251;
		@Pc(104) int local104 = local102;
		local102 += this.anInt6268;
		@Pc(111) int local111 = local102;
		if (local63 == 255) {
			local102 += this.anInt6268;
		}
		@Pc(121) int local121 = local102;
		if (local71 == 1) {
			local102 += this.anInt6268;
		}
		@Pc(133) int local133 = local102;
		if (local59 == 1) {
			local102 += this.anInt6268;
		}
		@Pc(143) int local143 = local102;
		if (local75 == 1) {
			local102 += this.anInt6251;
		}
		@Pc(155) int local155 = local102;
		if (local67 == 1) {
			local102 += this.anInt6268;
		}
		@Pc(165) int local165 = local102;
		local102 += local93;
		@Pc(171) int local171 = local102;
		local102 += this.anInt6268 * 2;
		@Pc(180) int local180 = local102;
		local102 += this.anInt6267 * 6;
		@Pc(189) int local189 = local102;
		local102 += local79;
		@Pc(195) int local195 = local102;
		local102 += local83;
		local14.anInt9802 = 0;
		if (local71 == 1) {
			this.anIntArray370 = new int[this.anInt6268];
		}
		this.aShortArray61 = new short[this.anInt6268];
		this.anIntArray375 = new int[this.anInt6251];
		this.aShortArray59 = new short[this.anInt6268];
		if (local75 == 1) {
			this.anIntArray367 = new int[this.anInt6251];
		}
		this.anIntArray366 = new int[this.anInt6251];
		if (local59 == 1) {
			this.aByteArray61 = new byte[this.anInt6268];
			this.aShortArray51 = new short[this.anInt6268];
			this.aByteArray64 = new byte[this.anInt6268];
		}
		this.aShortArray52 = new short[this.anInt6268];
		if (local63 == 255) {
			this.aByteArray60 = new byte[this.anInt6268];
		} else {
			this.aByte86 = (byte) local63;
		}
		this.anIntArray372 = new int[this.anInt6251];
		if (local67 == 1) {
			this.aByteArray62 = new byte[this.anInt6268];
		}
		if (this.anInt6267 > 0) {
			this.aShortArray54 = new short[this.anInt6267];
			this.aShortArray58 = new short[this.anInt6267];
			this.aShortArray57 = new short[this.anInt6267];
			this.aByteArray59 = new byte[this.anInt6267];
		}
		this.aShortArray55 = new short[this.anInt6268];
		local19.anInt9802 = local189;
		local24.anInt9802 = local195;
		local29.anInt9802 = local102;
		local34.anInt9802 = local143;
		@Pc(338) int local338 = 0;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(350) int local350;
		@Pc(352) int local352;
		for (@Pc(344) int local344 = 0; local344 < this.anInt6251; local344++) {
			local350 = local14.method7974();
			local352 = 0;
			if ((local350 & 0x1) != 0) {
				local352 = local19.method7955();
			}
			@Pc(362) int local362 = 0;
			if ((local350 & 0x2) != 0) {
				local362 = local24.method7955();
			}
			@Pc(375) int local375 = 0;
			if ((local350 & 0x4) != 0) {
				local375 = local29.method7955();
			}
			this.anIntArray372[local344] = local352 + local338;
			this.anIntArray375[local344] = local340 + local362;
			this.anIntArray366[local344] = local375 + local342;
			local338 = this.anIntArray372[local344];
			local342 = this.anIntArray366[local344];
			local340 = this.anIntArray375[local344];
			if (local75 == 1) {
				this.anIntArray367[local344] = local34.method7974();
			}
		}
		local14.anInt9802 = local171;
		local19.anInt9802 = local133;
		local24.anInt9802 = local111;
		local29.anInt9802 = local155;
		local34.anInt9802 = local121;
		for (local350 = 0; local350 < this.anInt6268; local350++) {
			this.aShortArray59[local350] = (short) local14.method7945();
			if (local59 == 1) {
				local352 = local19.method7974();
				if ((local352 & 0x1) == 1) {
					local7 = true;
					this.aByteArray61[local350] = 1;
				} else {
					this.aByteArray61[local350] = 0;
				}
				if ((local352 & 0x2) == 2) {
					this.aByteArray64[local350] = (byte) (local352 >> 2);
					this.aShortArray51[local350] = this.aShortArray59[local350];
					this.aShortArray59[local350] = 127;
					if (this.aShortArray51[local350] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray64[local350] = -1;
					this.aShortArray51[local350] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray60[local350] = local24.method7963();
			}
			if (local67 == 1) {
				this.aByteArray62[local350] = local29.method7963();
			}
			if (local71 == 1) {
				this.anIntArray370[local350] = local34.method7974();
			}
		}
		this.anInt6260 = -1;
		local14.anInt9802 = local165;
		local19.anInt9802 = local104;
		@Pc(595) short local595 = 0;
		@Pc(597) short local597 = 0;
		@Pc(599) short local599 = 0;
		@Pc(601) short local601 = 0;
		@Pc(609) int local609;
		for (@Pc(603) int local603 = 0; local603 < this.anInt6268; local603++) {
			local609 = local19.method7974();
			if (local609 == 1) {
				local595 = (short) (local14.method7955() + local601);
				local597 = (short) (local14.method7955() + local595);
				local599 = (short) (local14.method7955() + local597);
				this.aShortArray55[local603] = local595;
				local601 = local599;
				this.aShortArray61[local603] = local597;
				this.aShortArray52[local603] = local599;
				if (local595 > this.anInt6260) {
					this.anInt6260 = local595;
				}
				if (local597 > this.anInt6260) {
					this.anInt6260 = local597;
				}
				if (local599 > this.anInt6260) {
					this.anInt6260 = local599;
				}
			}
			if (local609 == 2) {
				local597 = local599;
				local599 = (short) (local601 + local14.method7955());
				this.aShortArray55[local603] = local595;
				local601 = local599;
				this.aShortArray61[local603] = local597;
				this.aShortArray52[local603] = local599;
				if (this.anInt6260 < local599) {
					this.anInt6260 = local599;
				}
			}
			if (local609 == 3) {
				local595 = local599;
				local599 = (short) (local601 + local14.method7955());
				this.aShortArray55[local603] = local595;
				local601 = local599;
				this.aShortArray61[local603] = local597;
				this.aShortArray52[local603] = local599;
				if (local599 > this.anInt6260) {
					this.anInt6260 = local599;
				}
			}
			if (local609 == 4) {
				@Pc(764) short local764 = local595;
				local595 = local597;
				local597 = local764;
				local599 = (short) (local14.method7955() + local601);
				this.aShortArray55[local603] = local595;
				local601 = local599;
				this.aShortArray61[local603] = local764;
				this.aShortArray52[local603] = local599;
				if (local599 > this.anInt6260) {
					this.anInt6260 = local599;
				}
			}
		}
		this.anInt6260++;
		local14.anInt9802 = local180;
		for (local609 = 0; local609 < this.anInt6267; local609++) {
			this.aByteArray59[local609] = 0;
			this.aShortArray57[local609] = (short) local14.method7945();
			this.aShortArray58[local609] = (short) local14.method7945();
			this.aShortArray54[local609] = (short) local14.method7945();
		}
		if (this.aByteArray64 != null) {
			@Pc(864) boolean local864 = false;
			for (@Pc(866) int local866 = 0; local866 < this.anInt6268; local866++) {
				@Pc(875) int local875 = this.aByteArray64[local866] & 0xFF;
				if (local875 != 255) {
					if ((this.aShortArray57[local875] & 0xFFFF) == this.aShortArray55[local866] && this.aShortArray61[local866] == (this.aShortArray58[local875] & 0xFFFF) && this.aShortArray52[local866] == (this.aShortArray54[local875] & 0xFFFF)) {
						this.aByteArray64[local866] = -1;
					} else {
						local864 = true;
					}
				}
			}
			if (!local864) {
				this.aByteArray64 = null;
			}
		}
		if (!local7) {
			this.aByteArray61 = null;
		}
		if (!local9) {
			this.aShortArray51 = null;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BI)V")
	public void method5067() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt6251; local15++) {
			this.anIntArray372[local15] <<= 0x2;
			this.anIntArray375[local15] <<= 0x2;
			this.anIntArray366[local15] <<= 0x2;
		}
		if (this.anInt6267 <= 0 || this.anIntArray374 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray374.length; local57++) {
			this.anIntArray374[local57] <<= 0x2;
			this.anIntArray369[local57] <<= 0x2;
			if (this.aByteArray59[local57] != 1) {
				this.anIntArray373[local57] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(IIII)I")
	public int method5068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt6251; local13++) {
			if (this.anIntArray372[local13] == arg2 && arg1 == this.anIntArray375[local13] && arg0 == this.anIntArray366[local13]) {
				return local13;
			}
		}
		this.anIntArray372[this.anInt6251] = arg2;
		this.anIntArray375[this.anInt6251] = arg1;
		this.anIntArray366[this.anInt6251] = arg0;
		this.anInt6260 = this.anInt6251 + 1;
		return this.anInt6251++;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)[[I")
	public int[][] method5070(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt6251 : this.anInt6260;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray367[local20];
			if (local27 >= 0) {
				if (local27 > local10) {
					local10 = local27;
				}
				@Pc(41) int local41 = local8[local27]++;
			}
		}
		@Pc(53) int[][] local53 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local53[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < local18; local74++) {
			@Pc(81) int local81 = this.anIntArray367[local74];
			if (local81 >= 0) {
				local53[local81][local8[local81]++] = local74;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIBSIBISB)I")
	public int method5071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray55[this.anInt6268] = (short) arg0;
		this.aShortArray61[this.anInt6268] = (short) arg1;
		this.aShortArray52[this.anInt6268] = (short) arg5;
		this.aByteArray61[this.anInt6268] = arg2;
		this.aByteArray64[this.anInt6268] = arg4;
		this.aShortArray59[this.anInt6268] = arg3;
		this.aByteArray62[this.anInt6268] = arg7;
		this.aShortArray51[this.anInt6268] = arg6;
		return this.anInt6268++;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(SLclient!nba;II)I")
	private int method5072(@OriginalArg(0) short arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray372[arg2];
		@Pc(15) int local15 = arg1.anIntArray375[arg2];
		@Pc(20) int local20 = arg1.anIntArray366[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt6251; local22++) {
			if (local10 == this.anIntArray372[local22] && local15 == this.anIntArray375[local22] && this.anIntArray366[local22] == local20) {
				this.aShortArray53[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray372[this.anInt6251] = local10;
		this.anIntArray375[this.anInt6251] = local15;
		this.anIntArray366[this.anInt6251] = local20;
		this.aShortArray53[this.anInt6251] = arg0;
		this.anIntArray367[this.anInt6251] = arg1.anIntArray367 == null ? -1 : arg1.anIntArray367[arg2];
		return this.anInt6251++;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BBSBSSSSBS)B")
	public byte method5073() {
		if (this.anInt6267 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray59[this.anInt6267] = 3;
		this.aShortArray57[this.anInt6267] = 0;
		this.aShortArray58[this.anInt6267] = 32767;
		this.aShortArray54[this.anInt6267] = 0;
		this.anIntArray374[this.anInt6267] = 1024;
		this.anIntArray369[this.anInt6267] = 1024;
		this.anIntArray373[this.anInt6267] = 1024;
		this.aByteArray63[this.anInt6267] = 0;
		this.aByteArray58[this.anInt6267] = 0;
		this.anIntArray368[this.anInt6267] = 0;
		return (byte) this.anInt6267++;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BIII)V")
	public void method5074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6251; local3++) {
			this.anIntArray372[local3] += arg2;
			this.anIntArray375[local3] += arg1;
			this.anIntArray366[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(B)[[I")
	public int[][] method5076() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass362Array1.length; local17++) {
			@Pc(25) int local25 = this.aClass362Array1[local17].anInt9630;
			if (local25 >= 0) {
				if (local15 < local25) {
					local15 = local25;
				}
				@Pc(39) int local39 = local13[local25]++;
			}
		}
		@Pc(53) int[][] local53 = new int[local15 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local15; local55++) {
			local53[local55] = new int[local13[local55]];
			local13[local55] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass362Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass362Array1[local78].anInt9630;
			if (local86 >= 0) {
				local53[local86][local13[local86]++] = local78;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "(B)[[I")
	public int[][] method5077() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6268; local12++) {
			@Pc(19) int local19 = this.anIntArray370[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt6268; local72++) {
			@Pc(87) int local87 = this.anIntArray370[local72];
			if (local87 >= 0) {
				local47[local87][local8[local87]++] = local72;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(SSI)V")
	public void method5078(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray51 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6268; local17++) {
			if (this.aShortArray51[local17] == arg1) {
				this.aShortArray51[local17] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ISS)V")
	public void method5079(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6268; local7++) {
			if (this.aShortArray59[local7] == arg0) {
				this.aShortArray59[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B[B)V")
	private void method5080(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub3 local10 = new Class1_Sub3(arg0);
		@Pc(15) Class1_Sub3 local15 = new Class1_Sub3(arg0);
		@Pc(20) Class1_Sub3 local20 = new Class1_Sub3(arg0);
		@Pc(25) Class1_Sub3 local25 = new Class1_Sub3(arg0);
		@Pc(30) Class1_Sub3 local30 = new Class1_Sub3(arg0);
		@Pc(35) Class1_Sub3 local35 = new Class1_Sub3(arg0);
		@Pc(40) Class1_Sub3 local40 = new Class1_Sub3(arg0);
		local10.anInt9802 = arg0.length - 23;
		this.anInt6251 = local10.method7945();
		this.anInt6268 = local10.method7945();
		this.anInt6267 = local10.method7974();
		@Pc(65) int local65 = local10.method7974();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt9802 -= 7;
			this.anInt6254 = local10.method7974();
			local10.anInt9802 += 6;
		}
		@Pc(128) int local128 = local10.method7974();
		@Pc(132) int local132 = local10.method7974();
		@Pc(136) int local136 = local10.method7974();
		@Pc(140) int local140 = local10.method7974();
		@Pc(144) int local144 = local10.method7974();
		@Pc(148) int local148 = local10.method7945();
		@Pc(152) int local152 = local10.method7945();
		@Pc(164) int local164 = local10.method7945();
		@Pc(168) int local168 = local10.method7945();
		@Pc(172) int local172 = local10.method7945();
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(194) int local194;
		if (this.anInt6267 > 0) {
			this.aByteArray59 = new byte[this.anInt6267];
			local10.anInt9802 = 0;
			for (local194 = 0; local194 < this.anInt6267; local194++) {
				@Pc(205) byte local205 = this.aByteArray59[local194] = local10.method7963();
				if (local205 == 2) {
					local178++;
				}
				if (local205 >= 1 && local205 <= 3) {
					local176++;
				}
				if (local205 == 0) {
					local174++;
				}
			}
		}
		local194 = this.anInt6267;
		@Pc(235) int local235 = local194;
		local194 += this.anInt6251;
		@Pc(242) int local242 = local194;
		if (local74) {
			local194 += this.anInt6268;
		}
		@Pc(251) int local251 = local194;
		local194 += this.anInt6268;
		@Pc(258) int local258 = local194;
		if (local128 == 255) {
			local194 += this.anInt6268;
		}
		@Pc(268) int local268 = local194;
		if (local136 == 1) {
			local194 += this.anInt6268;
		}
		@Pc(278) int local278 = local194;
		if (local144 == 1) {
			local194 += this.anInt6251;
		}
		@Pc(288) int local288 = local194;
		if (local132 == 1) {
			local194 += this.anInt6268;
		}
		@Pc(298) int local298 = local194;
		local194 += local168;
		@Pc(304) int local304 = local194;
		if (local140 == 1) {
			local194 += this.anInt6268 * 2;
		}
		@Pc(316) int local316 = local194;
		local194 += local172;
		@Pc(322) int local322 = local194;
		local194 += this.anInt6268 * 2;
		@Pc(331) int local331 = local194;
		local194 += local148;
		@Pc(337) int local337 = local194;
		local194 += local152;
		@Pc(343) int local343 = local194;
		local194 += local164;
		@Pc(349) int local349 = local194;
		local194 += local174 * 6;
		@Pc(357) int local357 = local194;
		local194 += local176 * 6;
		@Pc(365) byte local365 = 6;
		if (this.anInt6254 == 14) {
			local365 = 7;
		} else if (this.anInt6254 >= 15) {
			local365 = 9;
		}
		@Pc(385) int local385 = local194;
		local194 += local365 * local176;
		@Pc(393) int local393 = local194;
		local194 += local176;
		@Pc(399) int local399 = local194;
		local194 += local176;
		@Pc(405) int local405 = local194;
		local194 += local176 + local178 * 2;
		this.aShortArray59 = new short[this.anInt6268];
		if (local144 == 1) {
			this.anIntArray367 = new int[this.anInt6251];
		}
		this.anIntArray372 = new int[this.anInt6251];
		if (this.anInt6267 > 0) {
			if (local178 > 0) {
				this.anIntArray371 = new int[local178];
				this.anIntArray365 = new int[local178];
			}
			this.aShortArray57 = new short[this.anInt6267];
			this.aShortArray54 = new short[this.anInt6267];
			if (local176 > 0) {
				this.anIntArray368 = new int[local176];
				this.aByteArray63 = new byte[local176];
				this.anIntArray374 = new int[local176];
				this.anIntArray369 = new int[local176];
				this.anIntArray373 = new int[local176];
				this.aByteArray58 = new byte[local176];
			}
			this.aShortArray58 = new short[this.anInt6267];
		}
		this.anIntArray375 = new int[this.anInt6251];
		local10.anInt9802 = local235;
		if (local136 == 1) {
			this.anIntArray370 = new int[this.anInt6268];
		}
		if (local132 == 1) {
			this.aByteArray62 = new byte[this.anInt6268];
		}
		if (local140 == 1 && this.anInt6267 > 0) {
			this.aByteArray64 = new byte[this.anInt6268];
		}
		if (local140 == 1) {
			this.aShortArray51 = new short[this.anInt6268];
		}
		if (local74) {
			this.aByteArray61 = new byte[this.anInt6268];
		}
		this.aShortArray61 = new short[this.anInt6268];
		this.anIntArray366 = new int[this.anInt6251];
		this.aShortArray52 = new short[this.anInt6268];
		this.aShortArray55 = new short[this.anInt6268];
		if (local128 == 255) {
			this.aByteArray60 = new byte[this.anInt6268];
		} else {
			this.aByte86 = (byte) local128;
		}
		local15.anInt9802 = local331;
		local20.anInt9802 = local337;
		local25.anInt9802 = local343;
		local30.anInt9802 = local278;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(601) int local601 = 0;
		@Pc(609) int local609;
		for (@Pc(603) int local603 = 0; local603 < this.anInt6251; local603++) {
			local609 = local10.method7974();
			@Pc(611) int local611 = 0;
			if ((local609 & 0x1) != 0) {
				local611 = local15.method7955();
			}
			@Pc(621) int local621 = 0;
			if ((local609 & 0x2) != 0) {
				local621 = local20.method7955();
			}
			@Pc(631) int local631 = 0;
			if ((local609 & 0x4) != 0) {
				local631 = local25.method7955();
			}
			this.anIntArray372[local603] = local611 + local597;
			this.anIntArray375[local603] = local621 + local599;
			this.anIntArray366[local603] = local601 + local631;
			local597 = this.anIntArray372[local603];
			local599 = this.anIntArray375[local603];
			local601 = this.anIntArray366[local603];
			if (local144 == 1) {
				this.anIntArray367[local603] = local30.method7974();
			}
		}
		local10.anInt9802 = local322;
		local15.anInt9802 = local242;
		local20.anInt9802 = local258;
		local25.anInt9802 = local288;
		local30.anInt9802 = local268;
		local35.anInt9802 = local304;
		local40.anInt9802 = local316;
		for (local609 = 0; local609 < this.anInt6268; local609++) {
			this.aShortArray59[local609] = (short) local10.method7945();
			if (local74) {
				this.aByteArray61[local609] = local15.method7963();
			}
			if (local128 == 255) {
				this.aByteArray60[local609] = local20.method7963();
			}
			if (local132 == 1) {
				this.aByteArray62[local609] = local25.method7963();
			}
			if (local136 == 1) {
				this.anIntArray370[local609] = local30.method7974();
			}
			if (local140 == 1) {
				this.aShortArray51[local609] = (short) (local35.method7945() - 1);
			}
			if (this.aByteArray64 != null) {
				if (this.aShortArray51[local609] == -1) {
					this.aByteArray64[local609] = -1;
				} else {
					this.aByteArray64[local609] = (byte) (local40.method7974() - 1);
				}
			}
		}
		local10.anInt9802 = local298;
		this.anInt6260 = -1;
		local15.anInt9802 = local251;
		@Pc(825) short local825 = 0;
		@Pc(827) short local827 = 0;
		@Pc(829) short local829 = 0;
		@Pc(831) short local831 = 0;
		@Pc(839) int local839;
		for (@Pc(833) int local833 = 0; local833 < this.anInt6268; local833++) {
			local839 = local15.method7974();
			if (local839 == 1) {
				local825 = (short) (local831 + local10.method7955());
				local827 = (short) (local825 + local10.method7955());
				local829 = (short) (local10.method7955() + local827);
				local831 = local829;
				this.aShortArray55[local833] = local825;
				this.aShortArray61[local833] = local827;
				this.aShortArray52[local833] = local829;
				if (this.anInt6260 < local825) {
					this.anInt6260 = local825;
				}
				if (local827 > this.anInt6260) {
					this.anInt6260 = local827;
				}
				if (this.anInt6260 < local829) {
					this.anInt6260 = local829;
				}
			}
			if (local839 == 2) {
				local827 = local829;
				local829 = (short) (local831 + local10.method7955());
				local831 = local829;
				this.aShortArray55[local833] = local825;
				this.aShortArray61[local833] = local827;
				this.aShortArray52[local833] = local829;
				if (local829 > this.anInt6260) {
					this.anInt6260 = local829;
				}
			}
			if (local839 == 3) {
				local825 = local829;
				local829 = (short) (local10.method7955() + local831);
				this.aShortArray55[local833] = local825;
				local831 = local829;
				this.aShortArray61[local833] = local827;
				this.aShortArray52[local833] = local829;
				if (local829 > this.anInt6260) {
					this.anInt6260 = local829;
				}
			}
			if (local839 == 4) {
				@Pc(992) short local992 = local825;
				local825 = local827;
				local829 = (short) (local10.method7955() + local831);
				local827 = local992;
				local831 = local829;
				this.aShortArray55[local833] = local825;
				this.aShortArray61[local833] = local992;
				this.aShortArray52[local833] = local829;
				if (this.anInt6260 < local829) {
					this.anInt6260 = local829;
				}
			}
		}
		local10.anInt9802 = local349;
		this.anInt6260++;
		local15.anInt9802 = local357;
		local20.anInt9802 = local385;
		local25.anInt9802 = local393;
		local30.anInt9802 = local399;
		local35.anInt9802 = local405;
		@Pc(1071) int local1071;
		for (local839 = 0; local839 < this.anInt6267; local839++) {
			local1071 = this.aByteArray59[local839] & 0xFF;
			if (local1071 == 0) {
				this.aShortArray57[local839] = (short) local10.method7945();
				this.aShortArray58[local839] = (short) local10.method7945();
				this.aShortArray54[local839] = (short) local10.method7945();
			}
			if (local1071 == 1) {
				this.aShortArray57[local839] = (short) local15.method7945();
				this.aShortArray58[local839] = (short) local15.method7945();
				this.aShortArray54[local839] = (short) local15.method7945();
				if (this.anInt6254 >= 15) {
					this.anIntArray374[local839] = local20.method7919();
					this.anIntArray369[local839] = local20.method7919();
					this.anIntArray373[local839] = local20.method7919();
				} else {
					this.anIntArray374[local839] = local20.method7945();
					if (this.anInt6254 >= 14) {
						this.anIntArray369[local839] = local20.method7919();
					} else {
						this.anIntArray369[local839] = local20.method7945();
					}
					this.anIntArray373[local839] = local20.method7945();
				}
				this.aByteArray63[local839] = local25.method7963();
				this.aByteArray58[local839] = local30.method7963();
				this.anIntArray368[local839] = local35.method7963();
			}
			if (local1071 == 2) {
				this.aShortArray57[local839] = (short) local15.method7945();
				this.aShortArray58[local839] = (short) local15.method7945();
				this.aShortArray54[local839] = (short) local15.method7945();
				if (this.anInt6254 < 15) {
					this.anIntArray374[local839] = local20.method7945();
					if (this.anInt6254 >= 14) {
						this.anIntArray369[local839] = local20.method7919();
					} else {
						this.anIntArray369[local839] = local20.method7945();
					}
					this.anIntArray373[local839] = local20.method7945();
				} else {
					this.anIntArray374[local839] = local20.method7919();
					this.anIntArray369[local839] = local20.method7919();
					this.anIntArray373[local839] = local20.method7919();
				}
				this.aByteArray63[local839] = local25.method7963();
				this.aByteArray58[local839] = local30.method7963();
				this.anIntArray368[local839] = local35.method7963();
				this.anIntArray365[local839] = local35.method7963();
				this.anIntArray371[local839] = local35.method7963();
			}
			if (local1071 == 3) {
				this.aShortArray57[local839] = (short) local15.method7945();
				this.aShortArray58[local839] = (short) local15.method7945();
				this.aShortArray54[local839] = (short) local15.method7945();
				if (this.anInt6254 < 15) {
					this.anIntArray374[local839] = local20.method7945();
					if (this.anInt6254 < 14) {
						this.anIntArray369[local839] = local20.method7945();
					} else {
						this.anIntArray369[local839] = local20.method7919();
					}
					this.anIntArray373[local839] = local20.method7945();
				} else {
					this.anIntArray374[local839] = local20.method7919();
					this.anIntArray369[local839] = local20.method7919();
					this.anIntArray373[local839] = local20.method7919();
				}
				this.aByteArray63[local839] = local25.method7963();
				this.aByteArray58[local839] = local30.method7963();
				this.anIntArray368[local839] = local35.method7963();
			}
		}
		local10.anInt9802 = local194;
		@Pc(1471) int local1471;
		@Pc(1477) int local1477;
		@Pc(1481) int local1481;
		@Pc(1546) int local1546;
		if (local85) {
			local1071 = local10.method7974();
			if (local1071 > 0) {
				this.aClass244Array1 = new Class244[local1071];
				for (local1471 = 0; local1471 < local1071; local1471++) {
					local1477 = local10.method7945();
					local1481 = local10.method7945();
					@Pc(1491) byte local1491;
					if (local128 == 255) {
						local1491 = this.aByteArray60[local1481];
					} else {
						local1491 = (byte) local128;
					}
					this.aClass244Array1[local1471] = new Class244(local1477, this.aShortArray55[local1481], this.aShortArray61[local1481], this.aShortArray52[local1481], local1491);
				}
			}
			local1471 = local10.method7974();
			if (local1471 > 0) {
				this.aClass212Array1 = new Class212[local1471];
				for (local1477 = 0; local1477 < local1471; local1477++) {
					local1481 = local10.method7945();
					local1546 = local10.method7945();
					this.aClass212Array1[local1477] = new Class212(local1481, local1546);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1071 = local10.method7974();
		if (local1071 <= 0) {
			return;
		}
		this.aClass362Array1 = new Class362[local1071];
		for (local1471 = 0; local1471 < local1071; local1471++) {
			local1477 = local10.method7945();
			local1481 = local10.method7945();
			local1546 = local10.method7974();
			@Pc(1591) byte local1591 = local10.method7963();
			this.aClass362Array1[local1471] = new Class362(local1477, local1481, local1546, local1591);
		}
		return;
	}
}
