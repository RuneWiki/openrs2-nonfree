import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class117 {

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "[Lclient!jc;")
	public Class163[] aClass163Array1;

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "[Lclient!cba;")
	public Class49[] aClass49Array2;

	@OriginalMember(owner = "client!gfa", name = "j", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!gfa", name = "l", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!gfa", name = "m", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!gfa", name = "t", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!gfa", name = "u", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!gfa", name = "y", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!gfa", name = "A", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!gfa", name = "B", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!gfa", name = "D", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!gfa", name = "E", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!gfa", name = "F", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!gfa", name = "H", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!gfa", name = "J", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!gfa", name = "K", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!gfa", name = "M", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!gfa", name = "O", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!gfa", name = "Q", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!gfa", name = "R", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!gfa", name = "V", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!gfa", name = "W", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!gfa", name = "X", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!gfa", name = "ab", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!gfa", name = "cb", descriptor = "[Lclient!kw;")
	public Class197[] aClass197Array2;

	@OriginalMember(owner = "client!gfa", name = "eb", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!gfa", name = "fb", descriptor = "[I")
	public int[] anIntArray336;

	@OriginalMember(owner = "client!gfa", name = "hb", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!gfa", name = "z", descriptor = "I")
	public int anInt3814 = 0;

	@OriginalMember(owner = "client!gfa", name = "L", descriptor = "B")
	public byte aByte52 = 0;

	@OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
	public int anInt3811 = 0;

	@OriginalMember(owner = "client!gfa", name = "S", descriptor = "I")
	public int anInt3817 = 0;

	@OriginalMember(owner = "client!gfa", name = "gb", descriptor = "I")
	public int anInt3824 = 12;

	@OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
	public int anInt3807 = 0;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
	private Class117() {
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "([B)V")
	public Class117(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3486(arg0);
		} else {
			this.method3494(arg0);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(III)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray57 = new short[arg1];
		this.anIntArray335 = new int[arg0];
		this.aShortArray50 = new short[arg1];
		this.aByteArray30 = new byte[arg1];
		this.aShortArray58 = new short[arg1];
		this.anIntArray332 = new int[arg1];
		this.anIntArray325 = new int[arg0];
		this.aShortArray54 = new short[arg1];
		this.anIntArray328 = new int[arg0];
		this.aByteArray35 = new byte[arg1];
		this.aByteArray33 = new byte[arg1];
		if (arg2 > 0) {
			this.anIntArray336 = new int[arg2];
			this.anIntArray327 = new int[arg2];
			this.aByteArray29 = new byte[arg2];
			this.aByteArray32 = new byte[arg2];
			this.anIntArray330 = new int[arg2];
			this.aByteArray31 = new byte[arg2];
			this.anIntArray334 = new int[arg2];
			this.aShortArray56 = new short[arg2];
			this.aShortArray59 = new short[arg2];
			this.anIntArray329 = new int[arg2];
			this.aShortArray55 = new short[arg2];
			this.anIntArray331 = new int[arg2];
		}
		this.aShortArray52 = new short[arg1];
		this.aByteArray34 = new byte[arg1];
		this.anIntArray333 = new int[arg0];
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "([Lclient!gfa;I)V")
	public Class117(@OriginalArg(0) Class117[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3811 = 0;
		this.anInt3817 = 0;
		this.anInt3807 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte52 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class117 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt3807 += local59.anInt3807;
				this.anInt3817 += local59.anInt3817;
				this.anInt3811 += local59.anInt3811;
				if (local59.aClass163Array1 != null) {
					local36 += local59.aClass163Array1.length;
				}
				local38 |= local59.aByteArray33 != null;
				if (local59.aClass197Array2 != null) {
					local34 += local59.aClass197Array2.length;
				}
				if (local59.aClass49Array2 != null) {
					local32 += local59.aClass49Array2.length;
				}
				local42 |= local59.aByteArray34 != null;
				local51 |= local59.anIntArray332 != null;
				local44 |= local59.aByteArray35 != null;
				if (local59.aByteArray30 == null) {
					if (this.aByte52 == -1) {
						this.aByte52 = local59.aByte52;
					}
					if (local59.aByte52 != this.aByte52) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray58 != null;
			}
		}
		this.aShortArray51 = new short[this.anInt3807];
		this.aShortArray50 = new short[this.anInt3811];
		this.aShortArray53 = new short[this.anInt3811];
		if (local34 > 0) {
			this.aClass197Array2 = new Class197[local34];
		}
		this.anIntArray333 = new int[this.anInt3807];
		if (local44) {
			this.aByteArray35 = new byte[this.anInt3811];
		}
		if (local40) {
			this.aByteArray30 = new byte[this.anInt3811];
		}
		this.anIntArray328 = new int[this.anInt3807];
		if (this.anInt3817 > 0) {
			this.aByteArray29 = new byte[this.anInt3817];
			this.anIntArray327 = new int[this.anInt3817];
			this.aShortArray59 = new short[this.anInt3817];
			this.anIntArray336 = new int[this.anInt3817];
			this.anIntArray329 = new int[this.anInt3817];
			this.anIntArray331 = new int[this.anInt3817];
			this.anIntArray330 = new int[this.anInt3817];
			this.anIntArray334 = new int[this.anInt3817];
			this.aShortArray55 = new short[this.anInt3817];
			this.aShortArray56 = new short[this.anInt3817];
			this.aByteArray32 = new byte[this.anInt3817];
			this.aByteArray31 = new byte[this.anInt3817];
		}
		if (local51) {
			this.anIntArray332 = new int[this.anInt3811];
		}
		this.anIntArray325 = new int[this.anInt3807];
		if (local42) {
			this.aByteArray34 = new byte[this.anInt3811];
		}
		this.aShortArray54 = new short[this.anInt3811];
		if (local36 > 0) {
			this.aClass163Array1 = new Class163[local36];
		}
		this.anIntArray335 = new int[this.anInt3807];
		if (local46) {
			this.aShortArray58 = new short[this.anInt3811];
		}
		this.aShortArray52 = new short[this.anInt3811];
		this.aShortArray57 = new short[this.anInt3811];
		if (local38) {
			this.aByteArray33 = new byte[this.anInt3811];
		}
		if (local32 > 0) {
			this.aClass49Array2 = new Class49[local32];
		}
		local32 = 0;
		local34 = 0;
		this.anInt3817 = 0;
		local36 = 0;
		this.anInt3811 = 0;
		this.anInt3807 = 0;
		@Pc(619) int local619;
		@Pc(630) int local630;
		for (@Pc(387) int local387 = 0; local387 < arg1; local387++) {
			@Pc(394) short local394 = (short) (0x1 << local387);
			@Pc(398) Class117 local398 = arg0[local387];
			if (local398 != null) {
				@Pc(405) int local405;
				if (local398.aClass163Array1 != null) {
					for (local405 = 0; local405 < local398.aClass163Array1.length; local405++) {
						@Pc(412) Class163 local412 = local398.aClass163Array1[local405];
						this.aClass163Array1[local36++] = local412.method4376(this.anInt3811 + local412.anInt4727);
					}
				}
				for (local405 = 0; local405 < local398.anInt3811; local405++) {
					if (local38 && local398.aByteArray33 != null) {
						this.aByteArray33[this.anInt3811] = local398.aByteArray33[local405];
					}
					if (local40) {
						if (local398.aByteArray30 == null) {
							this.aByteArray30[this.anInt3811] = local398.aByte52;
						} else {
							this.aByteArray30[this.anInt3811] = local398.aByteArray30[local405];
						}
					}
					if (local42 && local398.aByteArray34 != null) {
						this.aByteArray34[this.anInt3811] = local398.aByteArray34[local405];
					}
					if (local46) {
						if (local398.aShortArray58 == null) {
							this.aShortArray58[this.anInt3811] = -1;
						} else {
							this.aShortArray58[this.anInt3811] = local398.aShortArray58[local405];
						}
					}
					if (local51) {
						if (local398.anIntArray332 == null) {
							this.anIntArray332[this.anInt3811] = -1;
						} else {
							this.anIntArray332[this.anInt3811] = local398.anIntArray332[local405];
						}
					}
					this.aShortArray54[this.anInt3811] = (short) this.method3485(local394, local398.aShortArray54[local405], local398);
					this.aShortArray57[this.anInt3811] = (short) this.method3485(local394, local398.aShortArray57[local405], local398);
					this.aShortArray52[this.anInt3811] = (short) this.method3485(local394, local398.aShortArray52[local405], local398);
					this.aShortArray53[this.anInt3811] = local394;
					this.aShortArray50[this.anInt3811] = local398.aShortArray50[local405];
					this.anInt3811++;
				}
				@Pc(606) int local606;
				if (local398.aClass49Array2 != null) {
					for (local606 = 0; local606 < local398.aClass49Array2.length; local606++) {
						local619 = this.method3485(local394, local398.aClass49Array2[local606].anInt1244, local398);
						local630 = this.method3485(local394, local398.aClass49Array2[local606].anInt1241, local398);
						@Pc(641) int local641 = this.method3485(local394, local398.aClass49Array2[local606].anInt1237, local398);
						this.aClass49Array2[local32] = local398.aClass49Array2[local606].method1283(local641, local619, local630);
						local32++;
					}
				}
				if (local398.aClass197Array2 != null) {
					for (local606 = 0; local606 < local398.aClass197Array2.length; local606++) {
						local619 = this.method3485(local394, local398.aClass197Array2[local606].anInt5432, local398);
						this.aClass197Array2[local34] = local398.aClass197Array2[local606].method4970(local619);
						local34++;
					}
				}
			}
		}
		this.anInt3814 = this.anInt3807;
		@Pc(711) int local711 = 0;
		for (@Pc(713) int local713 = 0; local713 < arg1; local713++) {
			@Pc(720) short local720 = (short) (0x1 << local713);
			@Pc(724) Class117 local724 = arg0[local713];
			if (local724 != null) {
				for (local619 = 0; local619 < local724.anInt3811; local619++) {
					if (local44) {
						this.aByteArray35[local711++] = (byte) (local724.aByteArray35 == null || local724.aByteArray35[local619] == -1 ? -1 : local724.aByteArray35[local619] + this.anInt3817);
					}
				}
				for (local630 = 0; local630 < local724.anInt3817; local630++) {
					@Pc(776) byte local776 = this.aByteArray31[this.anInt3817] = local724.aByteArray31[local630];
					if (local776 == 0) {
						this.aShortArray59[this.anInt3817] = (short) this.method3485(local720, local724.aShortArray59[local630], local724);
						this.aShortArray56[this.anInt3817] = (short) this.method3485(local720, local724.aShortArray56[local630], local724);
						this.aShortArray55[this.anInt3817] = (short) this.method3485(local720, local724.aShortArray55[local630], local724);
					}
					if (local776 >= 1 && local776 <= 3) {
						this.aShortArray59[this.anInt3817] = local724.aShortArray59[local630];
						this.aShortArray56[this.anInt3817] = local724.aShortArray56[local630];
						this.aShortArray55[this.anInt3817] = local724.aShortArray55[local630];
						this.anIntArray330[this.anInt3817] = local724.anIntArray330[local630];
						this.anIntArray334[this.anInt3817] = local724.anIntArray334[local630];
						this.anIntArray327[this.anInt3817] = local724.anIntArray327[local630];
						this.aByteArray32[this.anInt3817] = local724.aByteArray32[local630];
						this.aByteArray29[this.anInt3817] = local724.aByteArray29[local630];
						this.anIntArray336[this.anInt3817] = local724.anIntArray336[local630];
					}
					if (local776 == 2) {
						this.anIntArray331[this.anInt3817] = local724.anIntArray331[local630];
						this.anIntArray329[this.anInt3817] = local724.anIntArray329[local630];
					}
					this.anInt3817++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)V")
	public void method3478() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3807; local3++) {
			this.anIntArray335[local3] <<= 0x2;
			this.anIntArray333[local3] <<= 0x2;
			this.anIntArray325[local3] <<= 0x2;
		}
		if (this.anInt3817 <= 0 || this.anIntArray330 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray330.length; local53++) {
			this.anIntArray330[local53] <<= 0x2;
			this.anIntArray334[local53] <<= 0x2;
			if (this.aByteArray31[local53] != 1) {
				this.anIntArray327[local53] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)[[I")
	public int[][] method3482() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass163Array1.length; local17++) {
			@Pc(25) int local25 = this.aClass163Array1[local17].anInt4730;
			if (local25 >= 0) {
				@Pc(34) int local34 = local13[local25]++;
				if (local15 < local25) {
					local15 = local25;
				}
			}
		}
		@Pc(57) int[][] local57 = new int[local15 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local15; local59++) {
			local57[local59] = new int[local13[local59]];
			local13[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass163Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass163Array1[local78].anInt4730;
			if (local86 >= 0) {
				local57[local86][local13[local86]++] = local78;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIII)V")
	public void method3483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg2 != 0) {
			local14 = Class3_Sub20.anIntArray206[arg2];
			local18 = Class3_Sub20.anIntArray204[arg2];
			for (local20 = 0; local20 < this.anInt3807; local20++) {
				local38 = this.anIntArray335[local20] * local18 + this.anIntArray333[local20] * local14 >> 14;
				this.anIntArray333[local20] = local18 * this.anIntArray333[local20] - this.anIntArray335[local20] * local14 >> 14;
				this.anIntArray335[local20] = local38;
			}
		}
		if (arg1 != 0) {
			local14 = Class3_Sub20.anIntArray206[arg1];
			local18 = Class3_Sub20.anIntArray204[arg1];
			for (local20 = 0; local20 < this.anInt3807; local20++) {
				local38 = this.anIntArray333[local20] * local18 - local14 * this.anIntArray325[local20] >> 14;
				this.anIntArray325[local20] = this.anIntArray333[local20] * local14 + local18 * this.anIntArray325[local20] >> 14;
				this.anIntArray333[local20] = local38;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local14 = Class3_Sub20.anIntArray206[arg0];
		local18 = Class3_Sub20.anIntArray204[arg0];
		for (local20 = 0; local20 < this.anInt3807; local20++) {
			local38 = this.anIntArray325[local20] * local14 + this.anIntArray335[local20] * local18 >> 14;
			this.anIntArray325[local20] = local18 * this.anIntArray325[local20] - this.anIntArray335[local20] * local14 >> 14;
			this.anIntArray335[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(SSI)V")
	public void method3484(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray58 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt3811; local11++) {
			if (this.aShortArray58[local11] == arg1) {
				this.aShortArray58[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(SIBLclient!gfa;)I")
	private int method3485(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class117 arg2) {
		@Pc(10) int local10 = arg2.anIntArray335[arg1];
		@Pc(15) int local15 = arg2.anIntArray333[arg1];
		@Pc(26) int local26 = arg2.anIntArray325[arg1];
		for (@Pc(28) int local28 = 0; local28 < this.anInt3807; local28++) {
			if (this.anIntArray335[local28] == local10 && this.anIntArray333[local28] == local15 && this.anIntArray325[local28] == local26) {
				this.aShortArray51[local28] |= arg0;
				return local28;
			}
		}
		this.anIntArray335[this.anInt3807] = local10;
		this.anIntArray333[this.anInt3807] = local15;
		this.anIntArray325[this.anInt3807] = local26;
		this.aShortArray51[this.anInt3807] = arg0;
		this.anIntArray328[this.anInt3807] = arg2.anIntArray328 == null ? -1 : arg2.anIntArray328[arg1];
		return this.anInt3807++;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "([BI)V")
	private void method3486(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub25 local10 = new Class3_Sub25(arg0);
		@Pc(15) Class3_Sub25 local15 = new Class3_Sub25(arg0);
		@Pc(20) Class3_Sub25 local20 = new Class3_Sub25(arg0);
		@Pc(25) Class3_Sub25 local25 = new Class3_Sub25(arg0);
		@Pc(30) Class3_Sub25 local30 = new Class3_Sub25(arg0);
		@Pc(35) Class3_Sub25 local35 = new Class3_Sub25(arg0);
		@Pc(40) Class3_Sub25 local40 = new Class3_Sub25(arg0);
		local10.anInt9765 = arg0.length - 23;
		this.anInt3807 = local10.method8593();
		this.anInt3811 = local10.method8593();
		this.anInt3817 = local10.method8632();
		@Pc(65) int local65 = local10.method8632();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(98) boolean local98 = (local65 & 0x4) == 4;
		@Pc(109) boolean local109 = (local65 & 0x8) == 8;
		if (local109) {
			local10.anInt9765 -= 7;
			this.anInt3824 = local10.method8632();
			local10.anInt9765 += 6;
		}
		@Pc(132) int local132 = local10.method8632();
		@Pc(136) int local136 = local10.method8632();
		@Pc(140) int local140 = local10.method8632();
		@Pc(144) int local144 = local10.method8632();
		@Pc(148) int local148 = local10.method8632();
		@Pc(152) int local152 = local10.method8593();
		@Pc(156) int local156 = local10.method8593();
		@Pc(160) int local160 = local10.method8593();
		@Pc(164) int local164 = local10.method8593();
		@Pc(168) int local168 = local10.method8593();
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(187) int local187;
		if (this.anInt3817 > 0) {
			local10.anInt9765 = 0;
			this.aByteArray31 = new byte[this.anInt3817];
			for (local187 = 0; local187 < this.anInt3817; local187++) {
				@Pc(198) byte local198 = this.aByteArray31[local187] = local10.method8621();
				if (local198 >= 1 && local198 <= 3) {
					local172++;
				}
				if (local198 == 0) {
					local170++;
				}
				if (local198 == 2) {
					local174++;
				}
			}
		}
		local187 = this.anInt3817;
		@Pc(231) int local231 = local187;
		local187 += this.anInt3807;
		@Pc(238) int local238 = local187;
		if (local76) {
			local187 += this.anInt3811;
		}
		@Pc(247) int local247 = local187;
		local187 += this.anInt3811;
		@Pc(254) int local254 = local187;
		if (local132 == 255) {
			local187 += this.anInt3811;
		}
		@Pc(266) int local266 = local187;
		if (local140 == 1) {
			local187 += this.anInt3811;
		}
		@Pc(278) int local278 = local187;
		if (local148 == 1) {
			local187 += this.anInt3807;
		}
		@Pc(288) int local288 = local187;
		if (local136 == 1) {
			local187 += this.anInt3811;
		}
		@Pc(300) int local300 = local187;
		local187 += local164;
		@Pc(306) int local306 = local187;
		if (local144 == 1) {
			local187 += this.anInt3811 * 2;
		}
		@Pc(320) int local320 = local187;
		local187 += local168;
		@Pc(326) int local326 = local187;
		local187 += this.anInt3811 * 2;
		@Pc(335) int local335 = local187;
		local187 += local152;
		@Pc(341) int local341 = local187;
		local187 += local156;
		@Pc(347) int local347 = local187;
		local187 += local160;
		@Pc(353) int local353 = local187;
		local187 += local170 * 6;
		@Pc(361) int local361 = local187;
		local187 += local172 * 6;
		@Pc(369) byte local369 = 6;
		if (this.anInt3824 == 14) {
			local369 = 7;
		} else if (this.anInt3824 >= 15) {
			local369 = 9;
		}
		@Pc(385) int local385 = local187;
		local187 += local369 * local172;
		@Pc(393) int local393 = local187;
		local187 += local172;
		@Pc(399) int local399 = local187;
		local187 += local172;
		@Pc(405) int local405 = local187;
		local187 += local172 + local174 * 2;
		this.aShortArray52 = new short[this.anInt3811];
		this.aShortArray54 = new short[this.anInt3811];
		if (local136 == 1) {
			this.aByteArray34 = new byte[this.anInt3811];
		}
		if (local140 == 1) {
			this.anIntArray332 = new int[this.anInt3811];
		}
		if (local144 == 1) {
			this.aShortArray58 = new short[this.anInt3811];
		}
		if (local148 == 1) {
			this.anIntArray328 = new int[this.anInt3807];
		}
		this.aShortArray57 = new short[this.anInt3811];
		this.anIntArray335 = new int[this.anInt3807];
		if (local132 == 255) {
			this.aByteArray30 = new byte[this.anInt3811];
		} else {
			this.aByte52 = (byte) local132;
		}
		this.anIntArray325 = new int[this.anInt3807];
		local10.anInt9765 = local231;
		if (local76) {
			this.aByteArray33 = new byte[this.anInt3811];
		}
		this.anIntArray333 = new int[this.anInt3807];
		if (local144 == 1 && this.anInt3817 > 0) {
			this.aByteArray35 = new byte[this.anInt3811];
		}
		if (this.anInt3817 > 0) {
			this.aShortArray56 = new short[this.anInt3817];
			if (local172 > 0) {
				this.aByteArray32 = new byte[local172];
				this.anIntArray330 = new int[local172];
				this.anIntArray334 = new int[local172];
				this.anIntArray327 = new int[local172];
				this.anIntArray336 = new int[local172];
				this.aByteArray29 = new byte[local172];
			}
			this.aShortArray55 = new short[this.anInt3817];
			if (local174 > 0) {
				this.anIntArray329 = new int[local174];
				this.anIntArray331 = new int[local174];
			}
			this.aShortArray59 = new short[this.anInt3817];
		}
		this.aShortArray50 = new short[this.anInt3811];
		local15.anInt9765 = local335;
		local20.anInt9765 = local341;
		local25.anInt9765 = local347;
		local30.anInt9765 = local278;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(607) int local607;
		for (@Pc(601) int local601 = 0; local601 < this.anInt3807; local601++) {
			local607 = local10.method8632();
			@Pc(609) int local609 = 0;
			if ((local607 & 0x1) != 0) {
				local609 = local15.method8591();
			}
			@Pc(622) int local622 = 0;
			if ((local607 & 0x2) != 0) {
				local622 = local20.method8591();
			}
			@Pc(635) int local635 = 0;
			if ((local607 & 0x4) != 0) {
				local635 = local25.method8591();
			}
			this.anIntArray335[local601] = local609 + local595;
			this.anIntArray333[local601] = local622 + local597;
			this.anIntArray325[local601] = local599 + local635;
			local595 = this.anIntArray335[local601];
			local597 = this.anIntArray333[local601];
			local599 = this.anIntArray325[local601];
			if (local148 == 1) {
				this.anIntArray328[local601] = local30.method8632();
			}
		}
		local10.anInt9765 = local326;
		local15.anInt9765 = local238;
		local20.anInt9765 = local254;
		local25.anInt9765 = local288;
		local30.anInt9765 = local266;
		local35.anInt9765 = local306;
		local40.anInt9765 = local320;
		for (local607 = 0; local607 < this.anInt3811; local607++) {
			this.aShortArray50[local607] = (short) local10.method8593();
			if (local76) {
				this.aByteArray33[local607] = local15.method8621();
			}
			if (local132 == 255) {
				this.aByteArray30[local607] = local20.method8621();
			}
			if (local136 == 1) {
				this.aByteArray34[local607] = local25.method8621();
			}
			if (local140 == 1) {
				this.anIntArray332[local607] = local30.method8632();
			}
			if (local144 == 1) {
				this.aShortArray58[local607] = (short) (local35.method8593() - 1);
			}
			if (this.aByteArray35 != null) {
				if (this.aShortArray58[local607] == -1) {
					this.aByteArray35[local607] = -1;
				} else {
					this.aByteArray35[local607] = (byte) (local40.method8632() - 1);
				}
			}
		}
		local10.anInt9765 = local300;
		this.anInt3814 = -1;
		local15.anInt9765 = local247;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(842) short local842 = 0;
		@Pc(850) int local850;
		for (@Pc(844) int local844 = 0; local844 < this.anInt3811; local844++) {
			local850 = local15.method8632();
			if (local850 == 1) {
				local836 = (short) (local842 + local10.method8591());
				local838 = (short) (local836 + local10.method8591());
				local840 = (short) (local10.method8591() + local838);
				this.aShortArray54[local844] = local836;
				local842 = local840;
				this.aShortArray57[local844] = local838;
				this.aShortArray52[local844] = local840;
				if (this.anInt3814 < local836) {
					this.anInt3814 = local836;
				}
				if (this.anInt3814 < local838) {
					this.anInt3814 = local838;
				}
				if (local840 > this.anInt3814) {
					this.anInt3814 = local840;
				}
			}
			if (local850 == 2) {
				local838 = local840;
				local840 = (short) (local10.method8591() + local842);
				this.aShortArray54[local844] = local836;
				local842 = local840;
				this.aShortArray57[local844] = local838;
				this.aShortArray52[local844] = local840;
				if (this.anInt3814 < local840) {
					this.anInt3814 = local840;
				}
			}
			if (local850 == 3) {
				local836 = local840;
				local840 = (short) (local842 + local10.method8591());
				this.aShortArray54[local844] = local836;
				local842 = local840;
				this.aShortArray57[local844] = local838;
				this.aShortArray52[local844] = local840;
				if (this.anInt3814 < local840) {
					this.anInt3814 = local840;
				}
			}
			if (local850 == 4) {
				@Pc(1013) short local1013 = local836;
				local836 = local838;
				local840 = (short) (local842 + local10.method8591());
				local838 = local1013;
				local842 = local840;
				this.aShortArray54[local844] = local836;
				this.aShortArray57[local844] = local1013;
				this.aShortArray52[local844] = local840;
				if (local840 > this.anInt3814) {
					this.anInt3814 = local840;
				}
			}
		}
		local10.anInt9765 = local353;
		this.anInt3814++;
		local15.anInt9765 = local361;
		local20.anInt9765 = local385;
		local25.anInt9765 = local393;
		local30.anInt9765 = local399;
		local35.anInt9765 = local405;
		@Pc(1092) int local1092;
		for (local850 = 0; local850 < this.anInt3817; local850++) {
			local1092 = this.aByteArray31[local850] & 0xFF;
			if (local1092 == 0) {
				this.aShortArray59[local850] = (short) local10.method8593();
				this.aShortArray56[local850] = (short) local10.method8593();
				this.aShortArray55[local850] = (short) local10.method8593();
			}
			if (local1092 == 1) {
				this.aShortArray59[local850] = (short) local15.method8593();
				this.aShortArray56[local850] = (short) local15.method8593();
				this.aShortArray55[local850] = (short) local15.method8593();
				if (this.anInt3824 < 15) {
					this.anIntArray330[local850] = local20.method8593();
					if (this.anInt3824 < 14) {
						this.anIntArray334[local850] = local20.method8593();
					} else {
						this.anIntArray334[local850] = local20.method8607();
					}
					this.anIntArray327[local850] = local20.method8593();
				} else {
					this.anIntArray330[local850] = local20.method8607();
					this.anIntArray334[local850] = local20.method8607();
					this.anIntArray327[local850] = local20.method8607();
				}
				this.aByteArray32[local850] = local25.method8621();
				this.aByteArray29[local850] = local30.method8621();
				this.anIntArray336[local850] = local35.method8621();
			}
			if (local1092 == 2) {
				this.aShortArray59[local850] = (short) local15.method8593();
				this.aShortArray56[local850] = (short) local15.method8593();
				this.aShortArray55[local850] = (short) local15.method8593();
				if (this.anInt3824 >= 15) {
					this.anIntArray330[local850] = local20.method8607();
					this.anIntArray334[local850] = local20.method8607();
					this.anIntArray327[local850] = local20.method8607();
				} else {
					this.anIntArray330[local850] = local20.method8593();
					if (this.anInt3824 >= 14) {
						this.anIntArray334[local850] = local20.method8607();
					} else {
						this.anIntArray334[local850] = local20.method8593();
					}
					this.anIntArray327[local850] = local20.method8593();
				}
				this.aByteArray32[local850] = local25.method8621();
				this.aByteArray29[local850] = local30.method8621();
				this.anIntArray336[local850] = local35.method8621();
				this.anIntArray331[local850] = local35.method8621();
				this.anIntArray329[local850] = local35.method8621();
			}
			if (local1092 == 3) {
				this.aShortArray59[local850] = (short) local15.method8593();
				this.aShortArray56[local850] = (short) local15.method8593();
				this.aShortArray55[local850] = (short) local15.method8593();
				if (this.anInt3824 >= 15) {
					this.anIntArray330[local850] = local20.method8607();
					this.anIntArray334[local850] = local20.method8607();
					this.anIntArray327[local850] = local20.method8607();
				} else {
					this.anIntArray330[local850] = local20.method8593();
					if (this.anInt3824 >= 14) {
						this.anIntArray334[local850] = local20.method8607();
					} else {
						this.anIntArray334[local850] = local20.method8593();
					}
					this.anIntArray327[local850] = local20.method8593();
				}
				this.aByteArray32[local850] = local25.method8621();
				this.aByteArray29[local850] = local30.method8621();
				this.anIntArray336[local850] = local35.method8621();
			}
		}
		local10.anInt9765 = local187;
		@Pc(1487) int local1487;
		@Pc(1493) int local1493;
		@Pc(1497) int local1497;
		@Pc(1562) int local1562;
		if (local85) {
			local1092 = local10.method8632();
			if (local1092 > 0) {
				this.aClass49Array2 = new Class49[local1092];
				for (local1487 = 0; local1487 < local1092; local1487++) {
					local1493 = local10.method8593();
					local1497 = local10.method8593();
					@Pc(1507) byte local1507;
					if (local132 == 255) {
						local1507 = this.aByteArray30[local1497];
					} else {
						local1507 = (byte) local132;
					}
					this.aClass49Array2[local1487] = new Class49(local1493, this.aShortArray54[local1497], this.aShortArray57[local1497], this.aShortArray52[local1497], local1507);
				}
			}
			local1487 = local10.method8632();
			if (local1487 > 0) {
				this.aClass197Array2 = new Class197[local1487];
				for (local1493 = 0; local1493 < local1487; local1493++) {
					local1497 = local10.method8593();
					local1562 = local10.method8593();
					this.aClass197Array2[local1493] = new Class197(local1497, local1562);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1092 = local10.method8632();
		if (local1092 <= 0) {
			return;
		}
		this.aClass163Array1 = new Class163[local1092];
		for (local1487 = 0; local1487 < local1092; local1487++) {
			local1493 = local10.method8593();
			local1497 = local10.method8593();
			local1562 = local10.method8632();
			@Pc(1607) byte local1607 = local10.method8621();
			this.aClass163Array1[local1487] = new Class163(local1493, local1497, local1562, local1607);
		}
		return;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(SBBSSBBSSS)B")
	public byte method3487() {
		if (this.anInt3817 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray31[this.anInt3817] = 3;
		this.aShortArray59[this.anInt3817] = 0;
		this.aShortArray56[this.anInt3817] = 32767;
		this.aShortArray55[this.anInt3817] = 0;
		this.anIntArray330[this.anInt3817] = 1024;
		this.anIntArray334[this.anInt3817] = 1024;
		this.anIntArray327[this.anInt3817] = 1024;
		this.aByteArray32[this.anInt3817] = 0;
		this.aByteArray29[this.anInt3817] = 0;
		this.anIntArray336[this.anInt3817] = 0;
		return (byte) this.anInt3817++;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IZ)[[I")
	public int[][] method3488(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt3807 : this.anInt3814;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray328[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < local18; local75++) {
			@Pc(82) int local82 = this.anIntArray328[local75];
			if (local82 >= 0) {
				local54[local82][local8[local82]++] = local75;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(B)[[I")
	public int[][] method3489() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3811; local17++) {
			@Pc(24) int local24 = this.anIntArray332[local17];
			if (local24 >= 0) {
				@Pc(30) int local30 = local8[local24]++;
				if (local10 < local24) {
					local10 = local24;
				}
			}
		}
		@Pc(48) int[][] local48 = new int[local10 + 1][];
		for (@Pc(50) int local50 = 0; local50 <= local10; local50++) {
			local48[local50] = new int[local8[local50]];
			local8[local50] = 0;
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt3811; local69++) {
			@Pc(76) int local76 = this.anIntArray332[local69];
			if (local76 >= 0) {
				local48[local76][local8[local76]++] = local69;
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IBISIBSIB)I")
	public int method3490(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray54[this.anInt3811] = (short) arg6;
		this.aShortArray57[this.anInt3811] = (short) arg1;
		this.aShortArray52[this.anInt3811] = (short) arg3;
		this.aByteArray33[this.anInt3811] = arg7;
		this.aByteArray35[this.anInt3811] = arg0;
		this.aShortArray50[this.anInt3811] = arg2;
		this.aByteArray34[this.anInt3811] = arg4;
		this.aShortArray58[this.anInt3811] = arg5;
		return this.anInt3811++;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[B)V")
	private void method3494(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub25 local14 = new Class3_Sub25(arg0);
		@Pc(19) Class3_Sub25 local19 = new Class3_Sub25(arg0);
		@Pc(24) Class3_Sub25 local24 = new Class3_Sub25(arg0);
		@Pc(29) Class3_Sub25 local29 = new Class3_Sub25(arg0);
		@Pc(34) Class3_Sub25 local34 = new Class3_Sub25(arg0);
		local14.anInt9765 = arg0.length - 18;
		this.anInt3807 = local14.method8593();
		this.anInt3811 = local14.method8593();
		this.anInt3817 = local14.method8632();
		@Pc(59) int local59 = local14.method8632();
		@Pc(63) int local63 = local14.method8632();
		@Pc(67) int local67 = local14.method8632();
		@Pc(71) int local71 = local14.method8632();
		@Pc(75) int local75 = local14.method8632();
		@Pc(79) int local79 = local14.method8593();
		@Pc(83) int local83 = local14.method8593();
		@Pc(87) int local87 = local14.method8593();
		@Pc(91) int local91 = local14.method8593();
		@Pc(100) int local100 = this.anInt3807;
		@Pc(102) int local102 = local100;
		local100 += this.anInt3811;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt3811;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt3811;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt3811;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt3807;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt3811;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt3811 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt3817 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		if (local75 == 1) {
			this.anIntArray328 = new int[this.anInt3807];
		}
		this.anIntArray335 = new int[this.anInt3807];
		this.anIntArray333 = new int[this.anInt3807];
		if (local63 == 255) {
			this.aByteArray30 = new byte[this.anInt3811];
		} else {
			this.aByte52 = (byte) local63;
		}
		this.aShortArray57 = new short[this.anInt3811];
		if (local59 == 1) {
			this.aShortArray58 = new short[this.anInt3811];
			this.aByteArray35 = new byte[this.anInt3811];
			this.aByteArray33 = new byte[this.anInt3811];
		}
		this.aShortArray50 = new short[this.anInt3811];
		this.anIntArray325 = new int[this.anInt3807];
		local14.anInt9765 = 0;
		this.aShortArray52 = new short[this.anInt3811];
		if (local67 == 1) {
			this.aByteArray34 = new byte[this.anInt3811];
		}
		this.aShortArray54 = new short[this.anInt3811];
		if (this.anInt3817 > 0) {
			this.aShortArray55 = new short[this.anInt3817];
			this.aByteArray31 = new byte[this.anInt3817];
			this.aShortArray56 = new short[this.anInt3817];
			this.aShortArray59 = new short[this.anInt3817];
		}
		if (local71 == 1) {
			this.anIntArray332 = new int[this.anInt3811];
		}
		local19.anInt9765 = local189;
		local24.anInt9765 = local195;
		local29.anInt9765 = local100;
		local34.anInt9765 = local141;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(367) int local367;
		@Pc(369) int local369;
		for (@Pc(361) int local361 = 0; local361 < this.anInt3807; local361++) {
			local367 = local14.method8632();
			local369 = 0;
			if ((local367 & 0x1) != 0) {
				local369 = local19.method8591();
			}
			@Pc(379) int local379 = 0;
			if ((local367 & 0x2) != 0) {
				local379 = local24.method8591();
			}
			@Pc(392) int local392 = 0;
			if ((local367 & 0x4) != 0) {
				local392 = local29.method8591();
			}
			this.anIntArray335[local361] = local369 + local347;
			this.anIntArray333[local361] = local349 + local379;
			this.anIntArray325[local361] = local351 + local392;
			local349 = this.anIntArray333[local361];
			local351 = this.anIntArray325[local361];
			local347 = this.anIntArray335[local361];
			if (local75 == 1) {
				this.anIntArray328[local361] = local34.method8632();
			}
		}
		local14.anInt9765 = local171;
		local19.anInt9765 = local129;
		local24.anInt9765 = local109;
		local29.anInt9765 = local153;
		local34.anInt9765 = local119;
		for (local367 = 0; local367 < this.anInt3811; local367++) {
			this.aShortArray50[local367] = (short) local14.method8593();
			if (local59 == 1) {
				local369 = local19.method8632();
				if ((local369 & 0x1) == 1) {
					local7 = true;
					this.aByteArray33[local367] = 1;
				} else {
					this.aByteArray33[local367] = 0;
				}
				if ((local369 & 0x2) == 2) {
					this.aByteArray35[local367] = (byte) (local369 >> 2);
					this.aShortArray58[local367] = this.aShortArray50[local367];
					this.aShortArray50[local367] = 127;
					if (this.aShortArray58[local367] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray35[local367] = -1;
					this.aShortArray58[local367] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray30[local367] = local24.method8621();
			}
			if (local67 == 1) {
				this.aByteArray34[local367] = local29.method8621();
			}
			if (local71 == 1) {
				this.anIntArray332[local367] = local34.method8632();
			}
		}
		local14.anInt9765 = local165;
		this.anInt3814 = -1;
		local19.anInt9765 = local102;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(616) short local616 = 0;
		@Pc(618) short local618 = 0;
		@Pc(626) int local626;
		for (@Pc(620) int local620 = 0; local620 < this.anInt3811; local620++) {
			local626 = local19.method8632();
			if (local626 == 1) {
				local612 = (short) (local618 + local14.method8591());
				local614 = (short) (local14.method8591() + local612);
				local616 = (short) (local14.method8591() + local614);
				local618 = local616;
				this.aShortArray54[local620] = local612;
				this.aShortArray57[local620] = local614;
				this.aShortArray52[local620] = local616;
				if (local612 > this.anInt3814) {
					this.anInt3814 = local612;
				}
				if (local614 > this.anInt3814) {
					this.anInt3814 = local614;
				}
				if (this.anInt3814 < local616) {
					this.anInt3814 = local616;
				}
			}
			if (local626 == 2) {
				local614 = local616;
				local616 = (short) (local14.method8591() + local618);
				local618 = local616;
				this.aShortArray54[local620] = local612;
				this.aShortArray57[local620] = local614;
				this.aShortArray52[local620] = local616;
				if (this.anInt3814 < local616) {
					this.anInt3814 = local616;
				}
			}
			if (local626 == 3) {
				local612 = local616;
				local616 = (short) (local618 + local14.method8591());
				local618 = local616;
				this.aShortArray54[local620] = local612;
				this.aShortArray57[local620] = local614;
				this.aShortArray52[local620] = local616;
				if (local616 > this.anInt3814) {
					this.anInt3814 = local616;
				}
			}
			if (local626 == 4) {
				@Pc(783) short local783 = local612;
				local612 = local614;
				local616 = (short) (local618 + local14.method8591());
				local614 = local783;
				local618 = local616;
				this.aShortArray54[local620] = local612;
				this.aShortArray57[local620] = local783;
				this.aShortArray52[local620] = local616;
				if (this.anInt3814 < local616) {
					this.anInt3814 = local616;
				}
			}
		}
		local14.anInt9765 = local180;
		this.anInt3814++;
		for (local626 = 0; local626 < this.anInt3817; local626++) {
			this.aByteArray31[local626] = 0;
			this.aShortArray59[local626] = (short) local14.method8593();
			this.aShortArray56[local626] = (short) local14.method8593();
			this.aShortArray55[local626] = (short) local14.method8593();
		}
		if (this.aByteArray35 != null) {
			@Pc(879) boolean local879 = false;
			for (@Pc(881) int local881 = 0; local881 < this.anInt3811; local881++) {
				@Pc(890) int local890 = this.aByteArray35[local881] & 0xFF;
				if (local890 != 255) {
					if ((this.aShortArray59[local890] & 0xFFFF) == this.aShortArray54[local881] && (this.aShortArray56[local890] & 0xFFFF) == this.aShortArray57[local881] && this.aShortArray52[local881] == (this.aShortArray55[local890] & 0xFFFF)) {
						this.aByteArray35[local881] = -1;
					} else {
						local879 = true;
					}
				}
			}
			if (!local879) {
				this.aByteArray35 = null;
			}
		}
		if (!local9) {
			this.aShortArray58 = null;
		}
		if (!local7) {
			this.aByteArray33 = null;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIB)I")
	public int method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt3807; local12++) {
			if (this.anIntArray335[local12] == arg1 && arg0 == this.anIntArray333[local12] && this.anIntArray325[local12] == arg2) {
				return local12;
			}
		}
		this.anIntArray335[this.anInt3807] = arg1;
		this.anIntArray333[this.anInt3807] = arg0;
		this.anIntArray325[this.anInt3807] = arg2;
		this.anInt3814 = this.anInt3807 + 1;
		return this.anInt3807++;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(SSZ)V")
	public void method3496(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3811; local7++) {
			if (this.aShortArray50[local7] == arg1) {
				this.aShortArray50[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(IIII)V")
	public void method3497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3807; local11++) {
			this.anIntArray335[local11] += arg1;
			this.anIntArray333[local11] += arg2;
			this.anIntArray325[local11] += arg0;
		}
	}
}
