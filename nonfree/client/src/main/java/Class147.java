import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class147 {

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "[Lclient!ck;")
	public Class40[] aClass40Array2;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "[Lclient!sd;")
	public Class230[] aClass230Array2;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!ld", name = "bb", descriptor = "[Lclient!vm;")
	public Class264[] aClass264Array1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public int anInt4171 = 0;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
	public int anInt4181 = 12;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
	public int anInt4183 = 0;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "B")
	public byte aByte64 = 0;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	public int anInt4185 = 0;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
	public int anInt4178 = 0;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([B)V")
	public Class147(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3305(arg0);
		} else {
			this.method3308(arg0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(III)V")
	public Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 0) {
			this.aShortArray64 = new short[arg2];
			this.anIntArray306 = new int[arg2];
			this.anIntArray303 = new int[arg2];
			this.aShortArray58 = new short[arg2];
			this.anIntArray297 = new int[arg2];
			this.anIntArray302 = new int[arg2];
			this.anIntArray299 = new int[arg2];
			this.aByteArray56 = new byte[arg2];
			this.aShortArray65 = new short[arg2];
			this.anIntArray298 = new int[arg2];
			this.aByteArray54 = new byte[arg2];
			this.aByteArray58 = new byte[arg2];
		}
		this.anIntArray307 = new int[arg1];
		this.aShortArray62 = new short[arg1];
		this.aShortArray61 = new short[arg1];
		this.anIntArray300 = new int[arg0];
		this.anIntArray305 = new int[arg0];
		this.aShortArray63 = new short[arg1];
		this.aByteArray59 = new byte[arg1];
		this.aShortArray57 = new short[arg1];
		this.anIntArray304 = new int[arg0];
		this.aByteArray55 = new byte[arg1];
		this.aByteArray60 = new byte[arg1];
		this.aShortArray60 = new short[arg1];
		this.anIntArray301 = new int[arg0];
		this.aByteArray57 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([Lclient!ld;I)V")
	public Class147(@OriginalArg(0) Class147[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4171 = 0;
		this.anInt4178 = 0;
		this.anInt4185 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte64 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class147 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt4185 += local59.anInt4185;
				this.anInt4171 += local59.anInt4171;
				this.anInt4178 += local59.anInt4178;
				if (local59.aClass40Array2 != null) {
					local32 += local59.aClass40Array2.length;
				}
				if (local59.aClass264Array1 != null) {
					local36 += local59.aClass264Array1.length;
				}
				local38 |= local59.aByteArray57 != null;
				if (local59.aClass230Array2 != null) {
					local34 += local59.aClass230Array2.length;
				}
				local46 |= local59.aShortArray60 != null;
				if (local59.aByteArray59 == null) {
					if (this.aByte64 == -1) {
						this.aByte64 = local59.aByte64;
					}
					if (local59.aByte64 != this.aByte64) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray60 != null;
				local48 |= local59.anIntArray307 != null;
				local44 |= local59.aByteArray55 != null;
			}
		}
		if (local42) {
			this.aByteArray60 = new byte[this.anInt4185];
		}
		this.aShortArray56 = new short[this.anInt4178];
		this.anIntArray305 = new int[this.anInt4178];
		this.anIntArray304 = new int[this.anInt4178];
		if (this.anInt4171 > 0) {
			this.aShortArray58 = new short[this.anInt4171];
			this.anIntArray306 = new int[this.anInt4171];
			this.aByteArray54 = new byte[this.anInt4171];
			this.anIntArray298 = new int[this.anInt4171];
			this.aShortArray64 = new short[this.anInt4171];
			this.aShortArray65 = new short[this.anInt4171];
			this.aByteArray58 = new byte[this.anInt4171];
			this.anIntArray297 = new int[this.anInt4171];
			this.anIntArray299 = new int[this.anInt4171];
			this.anIntArray302 = new int[this.anInt4171];
			this.aByteArray56 = new byte[this.anInt4171];
			this.anIntArray303 = new int[this.anInt4171];
		}
		if (local34 > 0) {
			this.aClass230Array2 = new Class230[local34];
		}
		if (local32 > 0) {
			this.aClass40Array2 = new Class40[local32];
		}
		if (local44) {
			this.aByteArray55 = new byte[this.anInt4185];
		}
		this.aShortArray59 = new short[this.anInt4185];
		if (local38) {
			this.aByteArray57 = new byte[this.anInt4185];
		}
		if (local46) {
			this.aShortArray60 = new short[this.anInt4185];
		}
		this.anIntArray300 = new int[this.anInt4178];
		this.anIntArray301 = new int[this.anInt4178];
		this.aShortArray62 = new short[this.anInt4185];
		this.aShortArray57 = new short[this.anInt4185];
		this.aShortArray63 = new short[this.anInt4185];
		if (local36 > 0) {
			this.aClass264Array1 = new Class264[local36];
		}
		if (local48) {
			this.anIntArray307 = new int[this.anInt4185];
		}
		if (local40) {
			this.aByteArray59 = new byte[this.anInt4185];
		}
		this.aShortArray61 = new short[this.anInt4185];
		local32 = 0;
		this.anInt4185 = 0;
		local36 = 0;
		this.anInt4178 = 0;
		local34 = 0;
		this.anInt4171 = 0;
		@Pc(623) int local623;
		@Pc(634) int local634;
		for (@Pc(383) int local383 = 0; local383 < arg1; local383++) {
			@Pc(390) short local390 = (short) (0x1 << local383);
			@Pc(394) Class147 local394 = arg0[local383];
			if (local394 != null) {
				@Pc(401) int local401;
				if (local394.aClass264Array1 != null) {
					for (local401 = 0; local401 < local394.aClass264Array1.length; local401++) {
						@Pc(408) Class264 local408 = local394.aClass264Array1[local401];
						this.aClass264Array1[local36++] = local408.method5489(local408.anInt6895 + this.anInt4185);
					}
				}
				for (local401 = 0; local401 < local394.anInt4185; local401++) {
					if (local38 && local394.aByteArray57 != null) {
						this.aByteArray57[this.anInt4185] = local394.aByteArray57[local401];
					}
					if (local40) {
						if (local394.aByteArray59 == null) {
							this.aByteArray59[this.anInt4185] = local394.aByte64;
						} else {
							this.aByteArray59[this.anInt4185] = local394.aByteArray59[local401];
						}
					}
					if (local42 && local394.aByteArray60 != null) {
						this.aByteArray60[this.anInt4185] = local394.aByteArray60[local401];
					}
					if (local46) {
						if (local394.aShortArray60 == null) {
							this.aShortArray60[this.anInt4185] = -1;
						} else {
							this.aShortArray60[this.anInt4185] = local394.aShortArray60[local401];
						}
					}
					if (local48) {
						if (local394.anIntArray307 == null) {
							this.anIntArray307[this.anInt4185] = -1;
						} else {
							this.anIntArray307[this.anInt4185] = local394.anIntArray307[local401];
						}
					}
					this.aShortArray61[this.anInt4185] = (short) this.method3304(local390, local394, local394.aShortArray61[local401]);
					this.aShortArray57[this.anInt4185] = (short) this.method3304(local390, local394, local394.aShortArray57[local401]);
					this.aShortArray62[this.anInt4185] = (short) this.method3304(local390, local394, local394.aShortArray62[local401]);
					this.aShortArray59[this.anInt4185] = local390;
					this.aShortArray63[this.anInt4185] = local394.aShortArray63[local401];
					this.anInt4185++;
				}
				@Pc(610) int local610;
				if (local394.aClass40Array2 != null) {
					for (local610 = 0; local610 < local394.aClass40Array2.length; local610++) {
						local623 = this.method3304(local390, local394, local394.aClass40Array2[local610].anInt765);
						local634 = this.method3304(local390, local394, local394.aClass40Array2[local610].anInt764);
						@Pc(645) int local645 = this.method3304(local390, local394, local394.aClass40Array2[local610].anInt756);
						this.aClass40Array2[local32] = local394.aClass40Array2[local610].method700(local645, local634, local623);
						local32++;
					}
				}
				if (local394.aClass230Array2 != null) {
					for (local610 = 0; local610 < local394.aClass230Array2.length; local610++) {
						local623 = this.method3304(local390, local394, local394.aClass230Array2[local610].anInt6004);
						this.aClass230Array2[local34] = local394.aClass230Array2[local610].method4833(local623);
						local34++;
					}
				}
			}
		}
		@Pc(707) int local707 = 0;
		this.anInt4183 = this.anInt4178;
		for (@Pc(713) int local713 = 0; local713 < arg1; local713++) {
			@Pc(720) short local720 = (short) (0x1 << local713);
			@Pc(724) Class147 local724 = arg0[local713];
			if (local724 != null) {
				for (local623 = 0; local623 < local724.anInt4185; local623++) {
					if (local44) {
						this.aByteArray55[local707++] = (byte) (local724.aByteArray55 == null || local724.aByteArray55[local623] == -1 ? -1 : this.anInt4171 + local724.aByteArray55[local623]);
					}
				}
				for (local634 = 0; local634 < local724.anInt4171; local634++) {
					@Pc(776) byte local776 = this.aByteArray54[this.anInt4171] = local724.aByteArray54[local634];
					if (local776 == 0) {
						this.aShortArray58[this.anInt4171] = (short) this.method3304(local720, local724, local724.aShortArray58[local634]);
						this.aShortArray65[this.anInt4171] = (short) this.method3304(local720, local724, local724.aShortArray65[local634]);
						this.aShortArray64[this.anInt4171] = (short) this.method3304(local720, local724, local724.aShortArray64[local634]);
					}
					if (local776 >= 1 && local776 <= 3) {
						this.aShortArray58[this.anInt4171] = local724.aShortArray58[local634];
						this.aShortArray65[this.anInt4171] = local724.aShortArray65[local634];
						this.aShortArray64[this.anInt4171] = local724.aShortArray64[local634];
						this.anIntArray306[this.anInt4171] = local724.anIntArray306[local634];
						this.anIntArray303[this.anInt4171] = local724.anIntArray303[local634];
						this.anIntArray298[this.anInt4171] = local724.anIntArray298[local634];
						this.aByteArray56[this.anInt4171] = local724.aByteArray56[local634];
						this.aByteArray58[this.anInt4171] = local724.aByteArray58[local634];
						this.anIntArray302[this.anInt4171] = local724.anIntArray302[local634];
					}
					if (local776 == 2) {
						this.anIntArray299[this.anInt4171] = local724.anIntArray299[local634];
						this.anIntArray297[this.anInt4171] = local724.anIntArray297[local634];
					}
					this.anInt4171++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public void method3297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(43) int local43;
		if (arg0 != 0) {
			local18 = Class1_Sub29.anIntArray537[arg0];
			local22 = Class1_Sub29.anIntArray536[arg0];
			for (local24 = 0; local24 < this.anInt4178; local24++) {
				local43 = local18 * this.anIntArray301[local24] + local22 * this.anIntArray305[local24] >> 15;
				this.anIntArray301[local24] = this.anIntArray301[local24] * local22 - this.anIntArray305[local24] * local18 >> 15;
				this.anIntArray305[local24] = local43;
			}
		}
		if (arg1 != 0) {
			local18 = Class1_Sub29.anIntArray537[arg1];
			local22 = Class1_Sub29.anIntArray536[arg1];
			for (local24 = 0; local24 < this.anInt4178; local24++) {
				local43 = local22 * this.anIntArray301[local24] - local18 * this.anIntArray300[local24] >> 15;
				this.anIntArray300[local24] = local18 * this.anIntArray301[local24] + local22 * this.anIntArray300[local24] >> 15;
				this.anIntArray301[local24] = local43;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local18 = Class1_Sub29.anIntArray537[arg2];
		local22 = Class1_Sub29.anIntArray536[arg2];
		for (local24 = 0; local24 < this.anInt4178; local24++) {
			local43 = local22 * this.anIntArray305[local24] + local18 * this.anIntArray300[local24] >> 15;
			this.anIntArray300[local24] = local22 * this.anIntArray300[local24] - local18 * this.anIntArray305[local24] >> 15;
			this.anIntArray305[local24] = local43;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIBIBSBIS)I")
	public int method3298(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) short arg7) {
		this.aShortArray61[this.anInt4185] = (short) arg6;
		this.aShortArray57[this.anInt4185] = (short) arg1;
		this.aShortArray62[this.anInt4185] = (short) arg3;
		this.aByteArray57[this.anInt4185] = arg5;
		this.aByteArray55[this.anInt4185] = arg0;
		this.aShortArray63[this.anInt4185] = arg7;
		this.aByteArray60[this.anInt4185] = arg2;
		this.aShortArray60[this.anInt4185] = arg4;
		return this.anInt4185++;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)[[I")
	public int[][] method3299() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4183; local12++) {
			@Pc(19) int local19 = this.anIntArray304[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(68) int local68 = 0; local68 < this.anInt4183; local68++) {
			@Pc(75) int local75 = this.anIntArray304[local68];
			if (local75 >= 0) {
				local47[local75][local8[local75]++] = local68;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIII)I")
	public int method3300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4178; local7++) {
			if (arg0 == this.anIntArray305[local7] && arg1 == this.anIntArray301[local7] && arg2 == this.anIntArray300[local7]) {
				return local7;
			}
		}
		this.anIntArray305[this.anInt4178] = arg0;
		this.anIntArray301[this.anInt4178] = arg1;
		this.anIntArray300[this.anInt4178] = arg2;
		this.anInt4183 = this.anInt4178 + 1;
		return this.anInt4178++;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBI)V")
	public void method3301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4178; local7++) {
			this.anIntArray305[local7] += arg0;
			this.anIntArray301[local7] += arg1;
			this.anIntArray300[local7] += arg2;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZSS)V")
	public void method3302(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4185; local11++) {
			if (this.aShortArray63[local11] == arg1) {
				this.aShortArray63[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)[[I")
	public int[][] method3303() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4185; local12++) {
			@Pc(19) int local19 = this.anIntArray307[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt4185; local71++) {
			@Pc(78) int local78 = this.anIntArray307[local71];
			if (local78 >= 0) {
				local50[local78][local8[local78]++] = local71;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(SLclient!ld;ZI)I")
	private int method3304(@OriginalArg(0) short arg0, @OriginalArg(1) Class147 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1.anIntArray305[arg2];
		@Pc(20) int local20 = arg1.anIntArray301[arg2];
		@Pc(25) int local25 = arg1.anIntArray300[arg2];
		for (@Pc(27) int local27 = 0; local27 < this.anInt4178; local27++) {
			if (this.anIntArray305[local27] == local15 && local20 == this.anIntArray301[local27] && local25 == this.anIntArray300[local27]) {
				this.aShortArray56[local27] |= arg0;
				return local27;
			}
		}
		this.anIntArray305[this.anInt4178] = local15;
		this.anIntArray301[this.anInt4178] = local20;
		this.anIntArray300[this.anInt4178] = local25;
		this.aShortArray56[this.anInt4178] = arg0;
		this.anIntArray304[this.anInt4178] = arg1.anIntArray304 == null ? -1 : arg1.anIntArray304[arg2];
		return this.anInt4178++;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B[B)V")
	private void method3305(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub19 local10 = new Class1_Sub19(arg0);
		@Pc(15) Class1_Sub19 local15 = new Class1_Sub19(arg0);
		@Pc(20) Class1_Sub19 local20 = new Class1_Sub19(arg0);
		@Pc(25) Class1_Sub19 local25 = new Class1_Sub19(arg0);
		@Pc(30) Class1_Sub19 local30 = new Class1_Sub19(arg0);
		@Pc(35) Class1_Sub19 local35 = new Class1_Sub19(arg0);
		@Pc(40) Class1_Sub19 local40 = new Class1_Sub19(arg0);
		local10.anInt3698 = arg0.length - 23;
		this.anInt4178 = local10.method2896();
		this.anInt4185 = local10.method2896();
		this.anInt4171 = local10.method2915();
		@Pc(65) int local65 = local10.method2915();
		@Pc(80) boolean local80 = (local65 & 0x1) == 1;
		@Pc(89) boolean local89 = (local65 & 0x2) == 2;
		@Pc(100) boolean local100 = (local65 & 0x4) == 4;
		@Pc(111) boolean local111 = (local65 & 0x8) == 8;
		if (local111) {
			local10.anInt3698 -= 7;
			this.anInt4181 = local10.method2915();
			local10.anInt3698 += 6;
		}
		@Pc(134) int local134 = local10.method2915();
		@Pc(138) int local138 = local10.method2915();
		@Pc(142) int local142 = local10.method2915();
		@Pc(146) int local146 = local10.method2915();
		@Pc(150) int local150 = local10.method2915();
		@Pc(154) int local154 = local10.method2896();
		@Pc(158) int local158 = local10.method2896();
		@Pc(162) int local162 = local10.method2896();
		@Pc(166) int local166 = local10.method2896();
		@Pc(170) int local170 = local10.method2896();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(189) int local189;
		if (this.anInt4171 > 0) {
			this.aByteArray54 = new byte[this.anInt4171];
			local10.anInt3698 = 0;
			for (local189 = 0; local189 < this.anInt4171; local189++) {
				@Pc(200) byte local200 = this.aByteArray54[local189] = local10.method2917();
				if (local200 >= 1 && local200 <= 3) {
					local174++;
				}
				if (local200 == 0) {
					local172++;
				}
				if (local200 == 2) {
					local176++;
				}
			}
		}
		local189 = this.anInt4171;
		@Pc(233) int local233 = local189;
		local189 += this.anInt4178;
		@Pc(240) int local240 = local189;
		if (local80) {
			local189 += this.anInt4185;
		}
		@Pc(249) int local249 = local189;
		local189 += this.anInt4185;
		@Pc(256) int local256 = local189;
		if (local134 == 255) {
			local189 += this.anInt4185;
		}
		@Pc(268) int local268 = local189;
		if (local142 == 1) {
			local189 += this.anInt4185;
		}
		@Pc(278) int local278 = local189;
		if (local150 == 1) {
			local189 += this.anInt4178;
		}
		@Pc(290) int local290 = local189;
		if (local138 == 1) {
			local189 += this.anInt4185;
		}
		@Pc(302) int local302 = local189;
		local189 += local166;
		@Pc(308) int local308 = local189;
		if (local146 == 1) {
			local189 += this.anInt4185 * 2;
		}
		@Pc(322) int local322 = local189;
		local189 += local170;
		@Pc(328) int local328 = local189;
		local189 += this.anInt4185 * 2;
		@Pc(337) int local337 = local189;
		local189 += local154;
		@Pc(343) int local343 = local189;
		local189 += local158;
		@Pc(349) int local349 = local189;
		local189 += local162;
		@Pc(355) int local355 = local189;
		local189 += local172 * 6;
		@Pc(363) int local363 = local189;
		local189 += local174 * 6;
		@Pc(377) int local377 = this.anInt4181 < 14 ? 6 : 7;
		@Pc(379) int local379 = local189;
		local189 += local174 * local377;
		@Pc(387) int local387 = local189;
		local189 += local174;
		@Pc(393) int local393 = local189;
		local189 += local174;
		@Pc(399) int local399 = local189;
		local189 += local174 + local176 * 2;
		this.aShortArray61 = new short[this.anInt4185];
		if (local146 == 1) {
			this.aShortArray60 = new short[this.anInt4185];
		}
		local10.anInt3698 = local233;
		if (local134 == 255) {
			this.aByteArray59 = new byte[this.anInt4185];
		} else {
			this.aByte64 = (byte) local134;
		}
		if (local146 == 1 && this.anInt4171 > 0) {
			this.aByteArray55 = new byte[this.anInt4185];
		}
		if (this.anInt4171 > 0) {
			this.aShortArray58 = new short[this.anInt4171];
			if (local176 > 0) {
				this.anIntArray297 = new int[local176];
				this.anIntArray299 = new int[local176];
			}
			this.aShortArray64 = new short[this.anInt4171];
			this.aShortArray65 = new short[this.anInt4171];
			if (local174 > 0) {
				this.aByteArray56 = new byte[local174];
				this.anIntArray306 = new int[local174];
				this.anIntArray302 = new int[local174];
				this.anIntArray298 = new int[local174];
				this.anIntArray303 = new int[local174];
				this.aByteArray58 = new byte[local174];
			}
		}
		this.anIntArray301 = new int[this.anInt4178];
		if (local138 == 1) {
			this.aByteArray60 = new byte[this.anInt4185];
		}
		if (local150 == 1) {
			this.anIntArray304 = new int[this.anInt4178];
		}
		this.aShortArray63 = new short[this.anInt4185];
		this.aShortArray62 = new short[this.anInt4185];
		this.anIntArray305 = new int[this.anInt4178];
		if (local142 == 1) {
			this.anIntArray307 = new int[this.anInt4185];
		}
		if (local80) {
			this.aByteArray57 = new byte[this.anInt4185];
		}
		this.aShortArray57 = new short[this.anInt4185];
		this.anIntArray300 = new int[this.anInt4178];
		local15.anInt3698 = local337;
		local20.anInt3698 = local343;
		local25.anInt3698 = local349;
		local30.anInt3698 = local278;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(590) int local590 = 0;
		@Pc(598) int local598;
		for (@Pc(592) int local592 = 0; local592 < this.anInt4178; local592++) {
			local598 = local10.method2915();
			@Pc(600) int local600 = 0;
			if ((local598 & 0x1) != 0) {
				local600 = local15.method2918();
			}
			@Pc(610) int local610 = 0;
			if ((local598 & 0x2) != 0) {
				local610 = local20.method2918();
			}
			@Pc(620) int local620 = 0;
			if ((local598 & 0x4) != 0) {
				local620 = local25.method2918();
			}
			this.anIntArray305[local592] = local586 + local600;
			this.anIntArray301[local592] = local610 + local588;
			this.anIntArray300[local592] = local620 + local590;
			local588 = this.anIntArray301[local592];
			local590 = this.anIntArray300[local592];
			local586 = this.anIntArray305[local592];
			if (local150 == 1) {
				this.anIntArray304[local592] = local30.method2915();
			}
		}
		local10.anInt3698 = local328;
		local15.anInt3698 = local240;
		local20.anInt3698 = local256;
		local25.anInt3698 = local290;
		local30.anInt3698 = local268;
		local35.anInt3698 = local308;
		local40.anInt3698 = local322;
		for (local598 = 0; local598 < this.anInt4185; local598++) {
			this.aShortArray63[local598] = (short) local10.method2896();
			if (local80) {
				this.aByteArray57[local598] = local15.method2917();
			}
			if (local134 == 255) {
				this.aByteArray59[local598] = local20.method2917();
			}
			if (local138 == 1) {
				this.aByteArray60[local598] = local25.method2917();
			}
			if (local142 == 1) {
				this.anIntArray307[local598] = local30.method2915();
			}
			if (local146 == 1) {
				this.aShortArray60[local598] = (short) (local35.method2896() - 1);
			}
			if (this.aByteArray55 != null) {
				if (this.aShortArray60[local598] == -1) {
					this.aByteArray55[local598] = -1;
				} else {
					this.aByteArray55[local598] = (byte) (local40.method2915() - 1);
				}
			}
		}
		local10.anInt3698 = local302;
		this.anInt4183 = -1;
		local15.anInt3698 = local249;
		@Pc(812) short local812 = 0;
		@Pc(814) short local814 = 0;
		@Pc(816) short local816 = 0;
		@Pc(818) short local818 = 0;
		@Pc(826) int local826;
		for (@Pc(820) int local820 = 0; local820 < this.anInt4185; local820++) {
			local826 = local15.method2915();
			if (local826 == 1) {
				local812 = (short) (local10.method2918() + local818);
				local814 = (short) (local812 + local10.method2918());
				local816 = (short) (local10.method2918() + local814);
				local818 = local816;
				this.aShortArray61[local820] = local812;
				this.aShortArray57[local820] = local814;
				this.aShortArray62[local820] = local816;
				if (local812 > this.anInt4183) {
					this.anInt4183 = local812;
				}
				if (local814 > this.anInt4183) {
					this.anInt4183 = local814;
				}
				if (local816 > this.anInt4183) {
					this.anInt4183 = local816;
				}
			}
			if (local826 == 2) {
				local814 = local816;
				local816 = (short) (local10.method2918() + local818);
				this.aShortArray61[local820] = local812;
				local818 = local816;
				this.aShortArray57[local820] = local814;
				this.aShortArray62[local820] = local816;
				if (local816 > this.anInt4183) {
					this.anInt4183 = local816;
				}
			}
			if (local826 == 3) {
				local812 = local816;
				local816 = (short) (local10.method2918() + local818);
				this.aShortArray61[local820] = local812;
				local818 = local816;
				this.aShortArray57[local820] = local814;
				this.aShortArray62[local820] = local816;
				if (this.anInt4183 < local816) {
					this.anInt4183 = local816;
				}
			}
			if (local826 == 4) {
				@Pc(989) short local989 = local812;
				local812 = local814;
				local814 = local989;
				local816 = (short) (local818 + local10.method2918());
				this.aShortArray61[local820] = local812;
				local818 = local816;
				this.aShortArray57[local820] = local989;
				this.aShortArray62[local820] = local816;
				if (local816 > this.anInt4183) {
					this.anInt4183 = local816;
				}
			}
		}
		local10.anInt3698 = local355;
		this.anInt4183++;
		local15.anInt3698 = local363;
		local20.anInt3698 = local379;
		local25.anInt3698 = local387;
		local30.anInt3698 = local393;
		local35.anInt3698 = local399;
		@Pc(1064) int local1064;
		for (local826 = 0; local826 < this.anInt4171; local826++) {
			local1064 = this.aByteArray54[local826] & 0xFF;
			if (local1064 == 0) {
				this.aShortArray58[local826] = (short) local10.method2896();
				this.aShortArray65[local826] = (short) local10.method2896();
				this.aShortArray64[local826] = (short) local10.method2896();
			}
			if (local1064 == 1) {
				this.aShortArray58[local826] = (short) local15.method2896();
				this.aShortArray65[local826] = (short) local15.method2896();
				this.aShortArray64[local826] = (short) local15.method2896();
				this.anIntArray306[local826] = local20.method2896();
				if (this.anInt4181 < 14) {
					this.anIntArray303[local826] = local20.method2896();
				} else {
					this.anIntArray303[local826] = local20.method2881();
				}
				this.anIntArray298[local826] = local20.method2896();
				this.aByteArray56[local826] = local25.method2917();
				this.aByteArray58[local826] = local30.method2917();
				this.anIntArray302[local826] = local35.method2917();
			}
			if (local1064 == 2) {
				this.aShortArray58[local826] = (short) local15.method2896();
				this.aShortArray65[local826] = (short) local15.method2896();
				this.aShortArray64[local826] = (short) local15.method2896();
				this.anIntArray306[local826] = local20.method2896();
				if (this.anInt4181 < 14) {
					this.anIntArray303[local826] = local20.method2896();
				} else {
					this.anIntArray303[local826] = local20.method2881();
				}
				this.anIntArray298[local826] = local20.method2896();
				this.aByteArray56[local826] = local25.method2917();
				this.aByteArray58[local826] = local30.method2917();
				this.anIntArray302[local826] = local35.method2917();
				this.anIntArray299[local826] = local35.method2917();
				this.anIntArray297[local826] = local35.method2917();
			}
			if (local1064 == 3) {
				this.aShortArray58[local826] = (short) local15.method2896();
				this.aShortArray65[local826] = (short) local15.method2896();
				this.aShortArray64[local826] = (short) local15.method2896();
				this.anIntArray306[local826] = local20.method2896();
				if (this.anInt4181 < 14) {
					this.anIntArray303[local826] = local20.method2896();
				} else {
					this.anIntArray303[local826] = local20.method2881();
				}
				this.anIntArray298[local826] = local20.method2896();
				this.aByteArray56[local826] = local25.method2917();
				this.aByteArray58[local826] = local30.method2917();
				this.anIntArray302[local826] = local35.method2917();
			}
		}
		local10.anInt3698 = local189;
		@Pc(1382) int local1382;
		@Pc(1388) int local1388;
		@Pc(1392) int local1392;
		@Pc(1461) int local1461;
		if (local89) {
			local1064 = local10.method2915();
			if (local1064 > 0) {
				this.aClass40Array2 = new Class40[local1064];
				for (local1382 = 0; local1382 < local1064; local1382++) {
					local1388 = local10.method2896();
					local1392 = local10.method2896();
					@Pc(1402) byte local1402;
					if (local134 == 255) {
						local1402 = this.aByteArray59[local1392];
					} else {
						local1402 = (byte) local134;
					}
					this.aClass40Array2[local1382] = new Class40(local1388, this.aShortArray61[local1392], this.aShortArray57[local1392], this.aShortArray62[local1392], local1402);
				}
			}
			local1382 = local10.method2915();
			if (local1382 > 0) {
				this.aClass230Array2 = new Class230[local1382];
				for (local1388 = 0; local1388 < local1382; local1388++) {
					local1392 = local10.method2896();
					local1461 = local10.method2896();
					this.aClass230Array2[local1388] = new Class230(local1392, local1461);
				}
			}
		}
		if (!local100) {
			return;
		}
		local1064 = local10.method2915();
		if (local1064 <= 0) {
			return;
		}
		this.aClass264Array1 = new Class264[local1064];
		for (local1382 = 0; local1382 < local1064; local1382++) {
			local1388 = local10.method2896();
			local1392 = local10.method2896();
			local1461 = local10.method2915();
			@Pc(1510) byte local1510 = local10.method2917();
			this.aClass264Array1[local1382] = new Class264(local1388, local1392, local1461, local1510);
		}
		return;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public void method3306() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4178; local3++) {
			this.anIntArray305[local3] <<= 0x0;
			this.anIntArray301[local3] <<= 0x0;
			this.anIntArray300[local3] <<= 0x0;
		}
		if (this.anInt4171 <= 0 || this.anIntArray306 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray306.length; local50++) {
			this.anIntArray306[local50] <<= 0x0;
			this.anIntArray303[local50] <<= 0x0;
			if (this.aByteArray54[local50] != 1) {
				this.anIntArray298[local50] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BSSSBBSBSS)B")
	public byte method3307() {
		if (this.anInt4171 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray54[this.anInt4171] = 3;
		this.aShortArray58[this.anInt4171] = 0;
		this.aShortArray65[this.anInt4171] = 32767;
		this.aShortArray64[this.anInt4171] = 0;
		this.anIntArray306[this.anInt4171] = 1024;
		this.anIntArray303[this.anInt4171] = 1024;
		this.anIntArray298[this.anInt4171] = 1024;
		this.aByteArray56[this.anInt4171] = 0;
		this.aByteArray58[this.anInt4171] = 0;
		this.anIntArray302[this.anInt4171] = 0;
		return (byte) this.anInt4171++;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([BI)V")
	private void method3308(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub19 local14 = new Class1_Sub19(arg0);
		@Pc(19) Class1_Sub19 local19 = new Class1_Sub19(arg0);
		@Pc(24) Class1_Sub19 local24 = new Class1_Sub19(arg0);
		@Pc(29) Class1_Sub19 local29 = new Class1_Sub19(arg0);
		@Pc(34) Class1_Sub19 local34 = new Class1_Sub19(arg0);
		local14.anInt3698 = arg0.length - 18;
		this.anInt4178 = local14.method2896();
		this.anInt4185 = local14.method2896();
		this.anInt4171 = local14.method2915();
		@Pc(61) int local61 = local14.method2915();
		@Pc(65) int local65 = local14.method2915();
		@Pc(69) int local69 = local14.method2915();
		@Pc(73) int local73 = local14.method2915();
		@Pc(77) int local77 = local14.method2915();
		@Pc(81) int local81 = local14.method2896();
		@Pc(85) int local85 = local14.method2896();
		@Pc(89) int local89 = local14.method2896();
		@Pc(93) int local93 = local14.method2896();
		@Pc(102) int local102 = this.anInt4178;
		@Pc(104) int local104 = local102;
		local102 += this.anInt4185;
		@Pc(111) int local111 = local102;
		if (local65 == 255) {
			local102 += this.anInt4185;
		}
		@Pc(123) int local123 = local102;
		if (local73 == 1) {
			local102 += this.anInt4185;
		}
		@Pc(133) int local133 = local102;
		if (local61 == 1) {
			local102 += this.anInt4185;
		}
		@Pc(145) int local145 = local102;
		if (local77 == 1) {
			local102 += this.anInt4178;
		}
		@Pc(155) int local155 = local102;
		if (local69 == 1) {
			local102 += this.anInt4185;
		}
		@Pc(165) int local165 = local102;
		local102 += local93;
		@Pc(171) int local171 = local102;
		local102 += this.anInt4185 * 2;
		@Pc(180) int local180 = local102;
		local102 += this.anInt4171 * 6;
		@Pc(189) int local189 = local102;
		local102 += local81;
		@Pc(195) int local195 = local102;
		local102 += local85;
		this.aShortArray57 = new short[this.anInt4185];
		if (this.anInt4171 > 0) {
			this.aShortArray58 = new short[this.anInt4171];
			this.aShortArray64 = new short[this.anInt4171];
			this.aShortArray65 = new short[this.anInt4171];
			this.aByteArray54 = new byte[this.anInt4171];
		}
		this.aShortArray61 = new short[this.anInt4185];
		this.aShortArray62 = new short[this.anInt4185];
		if (local69 == 1) {
			this.aByteArray60 = new byte[this.anInt4185];
		}
		if (local65 == 255) {
			this.aByteArray59 = new byte[this.anInt4185];
		} else {
			this.aByte64 = (byte) local65;
		}
		this.aShortArray63 = new short[this.anInt4185];
		this.anIntArray305 = new int[this.anInt4178];
		this.anIntArray301 = new int[this.anInt4178];
		this.anIntArray300 = new int[this.anInt4178];
		if (local61 == 1) {
			this.aShortArray60 = new short[this.anInt4185];
			this.aByteArray57 = new byte[this.anInt4185];
			this.aByteArray55 = new byte[this.anInt4185];
		}
		if (local77 == 1) {
			this.anIntArray304 = new int[this.anInt4178];
		}
		local14.anInt3698 = 0;
		if (local73 == 1) {
			this.anIntArray307 = new int[this.anInt4185];
		}
		local19.anInt3698 = local189;
		local24.anInt3698 = local195;
		local29.anInt3698 = local102;
		local34.anInt3698 = local145;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt4178; local350++) {
			local356 = local14.method2915();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method2918();
			}
			@Pc(368) int local368 = 0;
			if ((local356 & 0x2) != 0) {
				local368 = local24.method2918();
			}
			@Pc(378) int local378 = 0;
			if ((local356 & 0x4) != 0) {
				local378 = local29.method2918();
			}
			this.anIntArray305[local350] = local358 + local344;
			this.anIntArray301[local350] = local346 + local368;
			this.anIntArray300[local350] = local348 + local378;
			local346 = this.anIntArray301[local350];
			local348 = this.anIntArray300[local350];
			local344 = this.anIntArray305[local350];
			if (local77 == 1) {
				this.anIntArray304[local350] = local34.method2915();
			}
		}
		local14.anInt3698 = local171;
		local19.anInt3698 = local133;
		local24.anInt3698 = local111;
		local29.anInt3698 = local155;
		local34.anInt3698 = local123;
		for (local356 = 0; local356 < this.anInt4185; local356++) {
			this.aShortArray63[local356] = (short) local14.method2896();
			if (local61 == 1) {
				local358 = local19.method2915();
				if ((local358 & 0x1) == 1) {
					this.aByteArray57[local356] = 1;
					local7 = true;
				} else {
					this.aByteArray57[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray55[local356] = (byte) (local358 >> 2);
					this.aShortArray60[local356] = this.aShortArray63[local356];
					this.aShortArray63[local356] = 127;
					if (this.aShortArray60[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray55[local356] = -1;
					this.aShortArray60[local356] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray59[local356] = local24.method2917();
			}
			if (local69 == 1) {
				this.aByteArray60[local356] = local29.method2917();
			}
			if (local73 == 1) {
				this.anIntArray307[local356] = local34.method2915();
			}
		}
		this.anInt4183 = -1;
		local14.anInt3698 = local165;
		local19.anInt3698 = local104;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(614) int local614;
		for (@Pc(608) int local608 = 0; local608 < this.anInt4185; local608++) {
			local614 = local19.method2915();
			if (local614 == 1) {
				local600 = (short) (local14.method2918() + local606);
				local602 = (short) (local14.method2918() + local600);
				local604 = (short) (local14.method2918() + local602);
				local606 = local604;
				this.aShortArray61[local608] = local600;
				this.aShortArray57[local608] = local602;
				this.aShortArray62[local608] = local604;
				if (this.anInt4183 < local600) {
					this.anInt4183 = local600;
				}
				if (local602 > this.anInt4183) {
					this.anInt4183 = local602;
				}
				if (this.anInt4183 < local604) {
					this.anInt4183 = local604;
				}
			}
			if (local614 == 2) {
				local602 = local604;
				local604 = (short) (local14.method2918() + local606);
				this.aShortArray61[local608] = local600;
				local606 = local604;
				this.aShortArray57[local608] = local602;
				this.aShortArray62[local608] = local604;
				if (this.anInt4183 < local604) {
					this.anInt4183 = local604;
				}
			}
			if (local614 == 3) {
				local600 = local604;
				local604 = (short) (local606 + local14.method2918());
				this.aShortArray61[local608] = local600;
				local606 = local604;
				this.aShortArray57[local608] = local602;
				this.aShortArray62[local608] = local604;
				if (this.anInt4183 < local604) {
					this.anInt4183 = local604;
				}
			}
			if (local614 == 4) {
				@Pc(763) short local763 = local600;
				local600 = local602;
				local604 = (short) (local606 + local14.method2918());
				local602 = local763;
				this.aShortArray61[local608] = local600;
				local606 = local604;
				this.aShortArray57[local608] = local763;
				this.aShortArray62[local608] = local604;
				if (local604 > this.anInt4183) {
					this.anInt4183 = local604;
				}
			}
		}
		local14.anInt3698 = local180;
		this.anInt4183++;
		for (local614 = 0; local614 < this.anInt4171; local614++) {
			this.aByteArray54[local614] = 0;
			this.aShortArray58[local614] = (short) local14.method2896();
			this.aShortArray65[local614] = (short) local14.method2896();
			this.aShortArray64[local614] = (short) local14.method2896();
		}
		if (this.aByteArray55 != null) {
			@Pc(859) boolean local859 = false;
			for (@Pc(861) int local861 = 0; local861 < this.anInt4185; local861++) {
				@Pc(870) int local870 = this.aByteArray55[local861] & 0xFF;
				if (local870 != 255) {
					if ((this.aShortArray58[local870] & 0xFFFF) == this.aShortArray61[local861] && (this.aShortArray65[local870] & 0xFFFF) == this.aShortArray57[local861] && this.aShortArray62[local861] == (this.aShortArray64[local870] & 0xFFFF)) {
						this.aByteArray55[local861] = -1;
					} else {
						local859 = true;
					}
				}
			}
			if (!local859) {
				this.aByteArray55 = null;
			}
		}
		if (!local7) {
			this.aByteArray57 = null;
		}
		if (!local9) {
			this.aShortArray60 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)[[I")
	public int[][] method3309() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass264Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass264Array1[local12].anInt6891;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(35) int local35 = local8[local20]++;
			}
		}
		@Pc(49) int[][] local49 = new int[local10 + 1][];
		for (@Pc(51) int local51 = 0; local51 <= local10; local51++) {
			local49[local51] = new int[local8[local51]];
			local8[local51] = 0;
		}
		for (@Pc(70) int local70 = 0; local70 < this.aClass264Array1.length; local70++) {
			@Pc(78) int local78 = this.aClass264Array1[local70].anInt6891;
			if (local78 >= 0) {
				local49[local78][local8[local78]++] = local70;
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ISS)V")
	public void method3311(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray60 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4185; local21++) {
			if (this.aShortArray60[local21] == arg1) {
				this.aShortArray60[local21] = arg0;
			}
		}
	}
}
