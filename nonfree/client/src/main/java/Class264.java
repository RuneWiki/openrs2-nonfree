import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class264 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "[I")
	public int[] anIntArray666;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "[Lclient!it;")
	public Class122[] aClass122Array4;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "[I")
	public int[] anIntArray667;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "[I")
	public int[] anIntArray668;

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "[I")
	public int[] anIntArray669;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!wk", name = "B", descriptor = "[Lclient!vj;")
	public Class252[] aClass252Array4;

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "[I")
	public int[] anIntArray670;

	@OriginalMember(owner = "client!wk", name = "F", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "[I")
	public int[] anIntArray671;

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "[Lclient!lv;")
	public Class152[] aClass152Array1;

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "[I")
	public int[] anIntArray672;

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "[I")
	public int[] anIntArray673;

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!wk", name = "P", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!wk", name = "Q", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!wk", name = "R", descriptor = "[I")
	public int[] anIntArray674;

	@OriginalMember(owner = "client!wk", name = "S", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!wk", name = "U", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!wk", name = "V", descriptor = "[I")
	public int[] anIntArray675;

	@OriginalMember(owner = "client!wk", name = "W", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!wk", name = "X", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!wk", name = "Y", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!wk", name = "bb", descriptor = "[I")
	public int[] anIntArray676;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	public int anInt7622 = 0;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	public int anInt7617 = 12;

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
	public int anInt7628 = 0;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "B")
	public byte aByte104 = 0;

	@OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
	public int anInt7629 = 0;

	@OriginalMember(owner = "client!wk", name = "ab", descriptor = "I")
	public int anInt7636 = 0;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "([B)V")
	public Class264(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5918(arg0);
		} else {
			this.method5917(arg0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(III)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray89 = new byte[arg1];
		this.anIntArray671 = new int[arg0];
		this.aByteArray91 = new byte[arg1];
		this.anIntArray676 = new int[arg0];
		this.anIntArray672 = new int[arg0];
		this.aShortArray109 = new short[arg1];
		this.aByteArray90 = new byte[arg1];
		this.anIntArray669 = new int[arg1];
		this.anIntArray666 = new int[arg0];
		this.aShortArray106 = new short[arg1];
		this.aShortArray108 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray670 = new int[arg2];
			this.anIntArray668 = new int[arg2];
			this.aShortArray110 = new short[arg2];
			this.anIntArray673 = new int[arg2];
			this.aShortArray107 = new short[arg2];
			this.aByteArray88 = new byte[arg2];
			this.aByteArray94 = new byte[arg2];
			this.anIntArray667 = new int[arg2];
			this.aShortArray103 = new short[arg2];
			this.anIntArray675 = new int[arg2];
			this.aByteArray92 = new byte[arg2];
			this.anIntArray674 = new int[arg2];
		}
		this.aShortArray111 = new short[arg1];
		this.aShortArray102 = new short[arg1];
		this.aByteArray93 = new byte[arg1];
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "([Lclient!wk;I)V")
	public Class264(@OriginalArg(0) Class264[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7629 = 0;
		this.anInt7636 = 0;
		this.anInt7622 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte104 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class264 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt7629 += local59.anInt7629;
				this.anInt7622 += local59.anInt7622;
				this.anInt7636 += local59.anInt7636;
				if (local59.aClass122Array4 != null) {
					local34 += local59.aClass122Array4.length;
				}
				local38 |= local59.aByteArray90 != null;
				if (local59.aClass252Array4 != null) {
					local32 += local59.aClass252Array4.length;
				}
				if (local59.aClass152Array1 != null) {
					local36 += local59.aClass152Array1.length;
				}
				local42 |= local59.aByteArray91 != null;
				local48 |= local59.anIntArray669 != null;
				local44 |= local59.aByteArray89 != null;
				local46 |= local59.aShortArray106 != null;
				if (local59.aByteArray93 == null) {
					if (this.aByte104 == -1) {
						this.aByte104 = local59.aByte104;
					}
					if (local59.aByte104 != this.aByte104) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local42) {
			this.aByteArray91 = new byte[this.anInt7629];
		}
		this.anIntArray666 = new int[this.anInt7622];
		this.aShortArray105 = new short[this.anInt7622];
		this.anIntArray672 = new int[this.anInt7622];
		if (local40) {
			this.aByteArray93 = new byte[this.anInt7629];
		}
		if (local34 > 0) {
			this.aClass122Array4 = new Class122[local34];
		}
		if (local38) {
			this.aByteArray90 = new byte[this.anInt7629];
		}
		this.aShortArray109 = new short[this.anInt7629];
		if (local36 > 0) {
			this.aClass152Array1 = new Class152[local36];
		}
		this.anIntArray676 = new int[this.anInt7622];
		this.aShortArray111 = new short[this.anInt7629];
		this.aShortArray108 = new short[this.anInt7629];
		if (local48) {
			this.anIntArray669 = new int[this.anInt7629];
		}
		this.aShortArray102 = new short[this.anInt7629];
		if (local44) {
			this.aByteArray89 = new byte[this.anInt7629];
		}
		this.anIntArray671 = new int[this.anInt7622];
		if (local32 > 0) {
			this.aClass252Array4 = new Class252[local32];
		}
		if (local46) {
			this.aShortArray106 = new short[this.anInt7629];
		}
		this.aShortArray104 = new short[this.anInt7629];
		if (this.anInt7636 > 0) {
			this.aByteArray94 = new byte[this.anInt7636];
			this.anIntArray670 = new int[this.anInt7636];
			this.anIntArray673 = new int[this.anInt7636];
			this.aShortArray110 = new short[this.anInt7636];
			this.aByteArray92 = new byte[this.anInt7636];
			this.anIntArray668 = new int[this.anInt7636];
			this.anIntArray675 = new int[this.anInt7636];
			this.anIntArray667 = new int[this.anInt7636];
			this.aShortArray103 = new short[this.anInt7636];
			this.anIntArray674 = new int[this.anInt7636];
			this.aByteArray88 = new byte[this.anInt7636];
			this.aShortArray107 = new short[this.anInt7636];
		}
		this.anInt7629 = 0;
		this.anInt7622 = 0;
		local36 = 0;
		local34 = 0;
		this.anInt7636 = 0;
		local32 = 0;
		@Pc(616) int local616;
		@Pc(627) int local627;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class264 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass152Array1 != null) {
					for (local398 = 0; local398 < local391.aClass152Array1.length; local398++) {
						@Pc(405) Class152 local405 = local391.aClass152Array1[local398];
						this.aClass152Array1[local36++] = local405.method3557(this.anInt7629 + local405.anInt4303);
					}
				}
				for (local398 = 0; local398 < local391.anInt7629; local398++) {
					if (local38 && local391.aByteArray90 != null) {
						this.aByteArray90[this.anInt7629] = local391.aByteArray90[local398];
					}
					if (local40) {
						if (local391.aByteArray93 == null) {
							this.aByteArray93[this.anInt7629] = local391.aByte104;
						} else {
							this.aByteArray93[this.anInt7629] = local391.aByteArray93[local398];
						}
					}
					if (local42 && local391.aByteArray91 != null) {
						this.aByteArray91[this.anInt7629] = local391.aByteArray91[local398];
					}
					if (local46) {
						if (local391.aShortArray106 == null) {
							this.aShortArray106[this.anInt7629] = -1;
						} else {
							this.aShortArray106[this.anInt7629] = local391.aShortArray106[local398];
						}
					}
					if (local48) {
						if (local391.anIntArray669 == null) {
							this.anIntArray669[this.anInt7629] = -1;
						} else {
							this.anIntArray669[this.anInt7629] = local391.anIntArray669[local398];
						}
					}
					this.aShortArray109[this.anInt7629] = (short) this.method5915(local391, local387, local391.aShortArray109[local398]);
					this.aShortArray108[this.anInt7629] = (short) this.method5915(local391, local387, local391.aShortArray108[local398]);
					this.aShortArray102[this.anInt7629] = (short) this.method5915(local391, local387, local391.aShortArray102[local398]);
					this.aShortArray104[this.anInt7629] = local387;
					this.aShortArray111[this.anInt7629] = local391.aShortArray111[local398];
					this.anInt7629++;
				}
				@Pc(603) int local603;
				if (local391.aClass252Array4 != null) {
					for (local603 = 0; local603 < local391.aClass252Array4.length; local603++) {
						local616 = this.method5915(local391, local387, local391.aClass252Array4[local603].anInt7339);
						local627 = this.method5915(local391, local387, local391.aClass252Array4[local603].anInt7338);
						@Pc(638) int local638 = this.method5915(local391, local387, local391.aClass252Array4[local603].anInt7345);
						this.aClass252Array4[local32] = local391.aClass252Array4[local603].method5686(local638, local616, local627);
						local32++;
					}
				}
				if (local391.aClass122Array4 != null) {
					for (local603 = 0; local603 < local391.aClass122Array4.length; local603++) {
						local616 = this.method5915(local391, local387, local391.aClass122Array4[local603].anInt3358);
						this.aClass122Array4[local34] = local391.aClass122Array4[local603].method2822(local616);
						local34++;
					}
				}
			}
		}
		@Pc(704) int local704 = 0;
		this.anInt7628 = this.anInt7622;
		for (@Pc(710) int local710 = 0; local710 < arg1; local710++) {
			@Pc(717) short local717 = (short) (0x1 << local710);
			@Pc(721) Class264 local721 = arg0[local710];
			if (local721 != null) {
				for (local616 = 0; local616 < local721.anInt7629; local616++) {
					if (local44) {
						this.aByteArray89[local704++] = (byte) (local721.aByteArray89 == null || local721.aByteArray89[local616] == -1 ? -1 : local721.aByteArray89[local616] + this.anInt7636);
					}
				}
				for (local627 = 0; local627 < local721.anInt7636; local627++) {
					@Pc(778) byte local778 = this.aByteArray94[this.anInt7636] = local721.aByteArray94[local627];
					if (local778 == 0) {
						this.aShortArray107[this.anInt7636] = (short) this.method5915(local721, local717, local721.aShortArray107[local627]);
						this.aShortArray110[this.anInt7636] = (short) this.method5915(local721, local717, local721.aShortArray110[local627]);
						this.aShortArray103[this.anInt7636] = (short) this.method5915(local721, local717, local721.aShortArray103[local627]);
					}
					if (local778 >= 1 && local778 <= 3) {
						this.aShortArray107[this.anInt7636] = local721.aShortArray107[local627];
						this.aShortArray110[this.anInt7636] = local721.aShortArray110[local627];
						this.aShortArray103[this.anInt7636] = local721.aShortArray103[local627];
						this.anIntArray675[this.anInt7636] = local721.anIntArray675[local627];
						this.anIntArray667[this.anInt7636] = local721.anIntArray667[local627];
						this.anIntArray670[this.anInt7636] = local721.anIntArray670[local627];
						this.aByteArray92[this.anInt7636] = local721.aByteArray92[local627];
						this.aByteArray88[this.anInt7636] = local721.aByteArray88[local627];
						this.anIntArray673[this.anInt7636] = local721.anIntArray673[local627];
					}
					if (local778 == 2) {
						this.anIntArray668[this.anInt7636] = local721.anIntArray668[local627];
						this.anIntArray674[this.anInt7636] = local721.anIntArray674[local627];
					}
					this.anInt7636++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V")
	public void method5905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7622; local3++) {
			this.anIntArray672[local3] += arg1;
			this.anIntArray666[local3] += arg0;
			this.anIntArray671[local3] += arg2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)[[I")
	public int[][] method5906() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass152Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass152Array1[local12].anInt4302;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local20 > local10) {
					local10 = local20;
				}
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(47) int local47 = 0; local47 <= local10; local47++) {
			local45[local47] = new int[local8[local47]];
			local8[local47] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.aClass152Array1.length; local75++) {
			@Pc(83) int local83 = this.aClass152Array1[local75].anInt4302;
			if (local83 >= 0) {
				local45[local83][local8[local83]++] = local75;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(SIS)V")
	public void method5907(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7629; local3++) {
			if (this.aShortArray111[local3] == arg1) {
				this.aShortArray111[local3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BSIBSIBIB)I")
	public int method5908(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray109[this.anInt7629] = (short) arg6;
		this.aShortArray108[this.anInt7629] = (short) arg4;
		this.aShortArray102[this.anInt7629] = (short) arg1;
		this.aByteArray90[this.anInt7629] = arg2;
		this.aByteArray89[this.anInt7629] = arg7;
		this.aShortArray111[this.anInt7629] = arg3;
		this.aByteArray91[this.anInt7629] = arg5;
		this.aShortArray106[this.anInt7629] = arg0;
		return this.anInt7629++;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	public void method5909() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt7622; local10++) {
			this.anIntArray672[local10] <<= 0x0;
			this.anIntArray666[local10] <<= 0x0;
			this.anIntArray671[local10] <<= 0x0;
		}
		if (this.anInt7636 <= 0 || this.anIntArray675 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray675.length; local56++) {
			this.anIntArray675[local56] <<= 0x0;
			this.anIntArray667[local56] <<= 0x0;
			if (this.aByteArray94[local56] != 1) {
				this.anIntArray670[local56] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(SBSSBBSBSS)B")
	public byte method5911() {
		if (this.anInt7636 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray94[this.anInt7636] = 3;
		this.aShortArray107[this.anInt7636] = 0;
		this.aShortArray110[this.anInt7636] = 32767;
		this.aShortArray103[this.anInt7636] = 0;
		this.anIntArray675[this.anInt7636] = 1024;
		this.anIntArray667[this.anInt7636] = 1024;
		this.anIntArray670[this.anInt7636] = 1024;
		this.aByteArray92[this.anInt7636] = 0;
		this.aByteArray88[this.anInt7636] = 0;
		this.anIntArray673[this.anInt7636] = 0;
		return (byte) this.anInt7636++;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIII)I")
	public int method5912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7622; local7++) {
			if (arg2 == this.anIntArray672[local7] && arg1 == this.anIntArray666[local7] && arg0 == this.anIntArray671[local7]) {
				return local7;
			}
		}
		this.anIntArray672[this.anInt7622] = arg2;
		this.anIntArray666[this.anInt7622] = arg1;
		this.anIntArray671[this.anInt7622] = arg0;
		this.anInt7628 = this.anInt7622 + 1;
		return this.anInt7622++;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)[[I")
	public int[][] method5913() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt7628; local20++) {
			@Pc(27) int local27 = this.anIntArray676[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(45) int local45 = local8[local27]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local58[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt7628; local83++) {
			@Pc(90) int local90 = this.anIntArray676[local83];
			if (local90 >= 0) {
				local58[local90][local8[local90]++] = local83;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(SIS)V")
	public void method5914(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray106 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anInt7629; local16++) {
			if (arg0 == this.aShortArray106[local16]) {
				this.aShortArray106[local16] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!wk;SI)I")
	private int method5915(@OriginalArg(1) Class264 arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray672[arg2];
		@Pc(15) int local15 = arg0.anIntArray666[arg2];
		@Pc(20) int local20 = arg0.anIntArray671[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt7622; local22++) {
			if (local10 == this.anIntArray672[local22] && local15 == this.anIntArray666[local22] && this.anIntArray671[local22] == local20) {
				this.aShortArray105[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray672[this.anInt7622] = local10;
		this.anIntArray666[this.anInt7622] = local15;
		this.anIntArray671[this.anInt7622] = local20;
		this.aShortArray105[this.anInt7622] = arg1;
		this.anIntArray676[this.anInt7622] = arg0.anIntArray676 == null ? -1 : arg0.anIntArray676[arg2];
		return this.anInt7622++;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBII)V")
	public void method5916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg1 != 0) {
			local14 = Class4.anIntArray7[arg1];
			local18 = Class4.anIntArray6[arg1];
			for (local20 = 0; local20 < this.anInt7622; local20++) {
				local38 = local14 * this.anIntArray666[local20] + local18 * this.anIntArray672[local20] >> 15;
				this.anIntArray666[local20] = this.anIntArray666[local20] * local18 - local14 * this.anIntArray672[local20] >> 15;
				this.anIntArray672[local20] = local38;
			}
		}
		if (arg0 != 0) {
			local14 = Class4.anIntArray7[arg0];
			local18 = Class4.anIntArray6[arg0];
			for (local20 = 0; local20 < this.anInt7622; local20++) {
				local38 = local18 * this.anIntArray666[local20] - this.anIntArray671[local20] * local14 >> 15;
				this.anIntArray671[local20] = local18 * this.anIntArray671[local20] + local14 * this.anIntArray666[local20] >> 15;
				this.anIntArray666[local20] = local38;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local14 = Class4.anIntArray7[arg2];
		local18 = Class4.anIntArray6[arg2];
		for (local20 = 0; local20 < this.anInt7622; local20++) {
			local38 = local14 * this.anIntArray671[local20] + this.anIntArray672[local20] * local18 >> 15;
			this.anIntArray671[local20] = local18 * this.anIntArray671[local20] - local14 * this.anIntArray672[local20] >> 15;
			this.anIntArray672[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[B)V")
	private void method5917(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub1 local14 = new Class1_Sub1(arg0);
		@Pc(28) Class1_Sub1 local28 = new Class1_Sub1(arg0);
		@Pc(33) Class1_Sub1 local33 = new Class1_Sub1(arg0);
		@Pc(38) Class1_Sub1 local38 = new Class1_Sub1(arg0);
		@Pc(43) Class1_Sub1 local43 = new Class1_Sub1(arg0);
		local14.anInt5056 = arg0.length - 18;
		this.anInt7622 = local14.method4093();
		this.anInt7629 = local14.method4093();
		this.anInt7636 = local14.method4130();
		@Pc(68) int local68 = local14.method4130();
		@Pc(72) int local72 = local14.method4130();
		@Pc(76) int local76 = local14.method4130();
		@Pc(80) int local80 = local14.method4130();
		@Pc(84) int local84 = local14.method4130();
		@Pc(88) int local88 = local14.method4093();
		@Pc(92) int local92 = local14.method4093();
		@Pc(96) int local96 = local14.method4093();
		@Pc(100) int local100 = local14.method4093();
		@Pc(109) int local109 = this.anInt7622;
		@Pc(111) int local111 = local109;
		local109 += this.anInt7629;
		@Pc(118) int local118 = local109;
		if (local72 == 255) {
			local109 += this.anInt7629;
		}
		@Pc(130) int local130 = local109;
		if (local80 == 1) {
			local109 += this.anInt7629;
		}
		@Pc(142) int local142 = local109;
		if (local68 == 1) {
			local109 += this.anInt7629;
		}
		@Pc(152) int local152 = local109;
		if (local84 == 1) {
			local109 += this.anInt7622;
		}
		@Pc(162) int local162 = local109;
		if (local76 == 1) {
			local109 += this.anInt7629;
		}
		@Pc(174) int local174 = local109;
		local109 += local100;
		@Pc(180) int local180 = local109;
		local109 += this.anInt7629 * 2;
		@Pc(189) int local189 = local109;
		local109 += this.anInt7636 * 6;
		@Pc(198) int local198 = local109;
		local109 += local88;
		@Pc(204) int local204 = local109;
		local109 += local92;
		this.aShortArray111 = new short[this.anInt7629];
		local14.anInt5056 = 0;
		if (local76 == 1) {
			this.aByteArray91 = new byte[this.anInt7629];
		}
		if (local68 == 1) {
			this.aByteArray90 = new byte[this.anInt7629];
			this.aShortArray106 = new short[this.anInt7629];
			this.aByteArray89 = new byte[this.anInt7629];
		}
		this.anIntArray671 = new int[this.anInt7622];
		if (local84 == 1) {
			this.anIntArray676 = new int[this.anInt7622];
		}
		this.aShortArray109 = new short[this.anInt7629];
		if (local72 == 255) {
			this.aByteArray93 = new byte[this.anInt7629];
		} else {
			this.aByte104 = (byte) local72;
		}
		if (local80 == 1) {
			this.anIntArray669 = new int[this.anInt7629];
		}
		this.anIntArray666 = new int[this.anInt7622];
		this.anIntArray672 = new int[this.anInt7622];
		this.aShortArray108 = new short[this.anInt7629];
		if (this.anInt7636 > 0) {
			this.aShortArray107 = new short[this.anInt7636];
			this.aShortArray110 = new short[this.anInt7636];
			this.aByteArray94 = new byte[this.anInt7636];
			this.aShortArray103 = new short[this.anInt7636];
		}
		this.aShortArray102 = new short[this.anInt7629];
		local28.anInt5056 = local198;
		local33.anInt5056 = local204;
		local38.anInt5056 = local109;
		local43.anInt5056 = local152;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(364) int local364;
		@Pc(366) int local366;
		for (@Pc(358) int local358 = 0; local358 < this.anInt7622; local358++) {
			local364 = local14.method4130();
			local366 = 0;
			if ((local364 & 0x1) != 0) {
				local366 = local28.method4131();
			}
			@Pc(376) int local376 = 0;
			if ((local364 & 0x2) != 0) {
				local376 = local33.method4131();
			}
			@Pc(389) int local389 = 0;
			if ((local364 & 0x4) != 0) {
				local389 = local38.method4131();
			}
			this.anIntArray672[local358] = local366 + local352;
			this.anIntArray666[local358] = local354 + local376;
			this.anIntArray671[local358] = local389 + local356;
			local356 = this.anIntArray671[local358];
			local352 = this.anIntArray672[local358];
			local354 = this.anIntArray666[local358];
			if (local84 == 1) {
				this.anIntArray676[local358] = local43.method4130();
			}
		}
		local14.anInt5056 = local180;
		local28.anInt5056 = local142;
		local33.anInt5056 = local118;
		local38.anInt5056 = local162;
		local43.anInt5056 = local130;
		for (local364 = 0; local364 < this.anInt7629; local364++) {
			this.aShortArray111[local364] = (short) local14.method4093();
			if (local68 == 1) {
				local366 = local28.method4130();
				if ((local366 & 0x1) == 1) {
					local7 = true;
					this.aByteArray90[local364] = 1;
				} else {
					this.aByteArray90[local364] = 0;
				}
				if ((local366 & 0x2) == 2) {
					this.aByteArray89[local364] = (byte) (local366 >> 2);
					this.aShortArray106[local364] = this.aShortArray111[local364];
					this.aShortArray111[local364] = 127;
					if (this.aShortArray106[local364] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray89[local364] = -1;
					this.aShortArray106[local364] = -1;
				}
			}
			if (local72 == 255) {
				this.aByteArray93[local364] = local33.method4112();
			}
			if (local76 == 1) {
				this.aByteArray91[local364] = local38.method4112();
			}
			if (local80 == 1) {
				this.anIntArray669[local364] = local43.method4130();
			}
		}
		this.anInt7628 = -1;
		local14.anInt5056 = local174;
		local28.anInt5056 = local111;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(615) int local615;
		for (@Pc(609) int local609 = 0; local609 < this.anInt7629; local609++) {
			local615 = local28.method4130();
			if (local615 == 1) {
				local601 = (short) (local607 + local14.method4131());
				local603 = (short) (local601 + local14.method4131());
				local605 = (short) (local14.method4131() + local603);
				this.aShortArray109[local609] = local601;
				local607 = local605;
				this.aShortArray108[local609] = local603;
				this.aShortArray102[local609] = local605;
				if (local601 > this.anInt7628) {
					this.anInt7628 = local601;
				}
				if (local603 > this.anInt7628) {
					this.anInt7628 = local603;
				}
				if (local605 > this.anInt7628) {
					this.anInt7628 = local605;
				}
			}
			if (local615 == 2) {
				local603 = local605;
				local605 = (short) (local607 + local14.method4131());
				this.aShortArray109[local609] = local601;
				local607 = local605;
				this.aShortArray108[local609] = local603;
				this.aShortArray102[local609] = local605;
				if (this.anInt7628 < local605) {
					this.anInt7628 = local605;
				}
			}
			if (local615 == 3) {
				local601 = local605;
				local605 = (short) (local607 + local14.method4131());
				this.aShortArray109[local609] = local601;
				local607 = local605;
				this.aShortArray108[local609] = local603;
				this.aShortArray102[local609] = local605;
				if (local605 > this.anInt7628) {
					this.anInt7628 = local605;
				}
			}
			if (local615 == 4) {
				@Pc(774) short local774 = local601;
				local601 = local603;
				local603 = local774;
				local605 = (short) (local14.method4131() + local607);
				this.aShortArray109[local609] = local601;
				local607 = local605;
				this.aShortArray108[local609] = local774;
				this.aShortArray102[local609] = local605;
				if (this.anInt7628 < local605) {
					this.anInt7628 = local605;
				}
			}
		}
		this.anInt7628++;
		local14.anInt5056 = local189;
		for (local615 = 0; local615 < this.anInt7636; local615++) {
			this.aByteArray94[local615] = 0;
			this.aShortArray107[local615] = (short) local14.method4093();
			this.aShortArray110[local615] = (short) local14.method4093();
			this.aShortArray103[local615] = (short) local14.method4093();
		}
		if (this.aByteArray89 != null) {
			@Pc(870) boolean local870 = false;
			for (@Pc(872) int local872 = 0; local872 < this.anInt7629; local872++) {
				@Pc(881) int local881 = this.aByteArray89[local872] & 0xFF;
				if (local881 != 255) {
					if ((this.aShortArray107[local881] & 0xFFFF) == this.aShortArray109[local872] && this.aShortArray108[local872] == (this.aShortArray110[local881] & 0xFFFF) && (this.aShortArray103[local881] & 0xFFFF) == this.aShortArray102[local872]) {
						this.aByteArray89[local872] = -1;
					} else {
						local870 = true;
					}
				}
			}
			if (!local870) {
				this.aByteArray89 = null;
			}
		}
		if (!local9) {
			this.aShortArray106 = null;
		}
		if (!local7) {
			this.aByteArray90 = null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B[B)V")
	private void method5918(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub1 local10 = new Class1_Sub1(arg0);
		@Pc(15) Class1_Sub1 local15 = new Class1_Sub1(arg0);
		@Pc(20) Class1_Sub1 local20 = new Class1_Sub1(arg0);
		@Pc(25) Class1_Sub1 local25 = new Class1_Sub1(arg0);
		@Pc(30) Class1_Sub1 local30 = new Class1_Sub1(arg0);
		@Pc(35) Class1_Sub1 local35 = new Class1_Sub1(arg0);
		@Pc(40) Class1_Sub1 local40 = new Class1_Sub1(arg0);
		local10.anInt5056 = arg0.length - 23;
		this.anInt7622 = local10.method4093();
		this.anInt7629 = local10.method4093();
		this.anInt7636 = local10.method4130();
		@Pc(69) int local69 = local10.method4130();
		@Pc(80) boolean local80 = (local69 & 0x1) == 1;
		@Pc(91) boolean local91 = (local69 & 0x2) == 2;
		@Pc(100) boolean local100 = (local69 & 0x4) == 4;
		@Pc(111) boolean local111 = (local69 & 0x8) == 8;
		if (local111) {
			local10.anInt5056 -= 7;
			this.anInt7617 = local10.method4130();
			local10.anInt5056 += 6;
		}
		@Pc(134) int local134 = local10.method4130();
		@Pc(140) int local140 = local10.method4130();
		@Pc(144) int local144 = local10.method4130();
		@Pc(148) int local148 = local10.method4130();
		@Pc(154) int local154 = local10.method4130();
		@Pc(158) int local158 = local10.method4093();
		@Pc(162) int local162 = local10.method4093();
		@Pc(166) int local166 = local10.method4093();
		@Pc(170) int local170 = local10.method4093();
		@Pc(174) int local174 = local10.method4093();
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(180) int local180 = 0;
		@Pc(196) int local196;
		if (this.anInt7636 > 0) {
			this.aByteArray94 = new byte[this.anInt7636];
			local10.anInt5056 = 0;
			for (local196 = 0; local196 < this.anInt7636; local196++) {
				@Pc(207) byte local207 = this.aByteArray94[local196] = local10.method4112();
				if (local207 == 2) {
					local180++;
				}
				if (local207 == 0) {
					local176++;
				}
				if (local207 >= 1 && local207 <= 3) {
					local178++;
				}
			}
		}
		local196 = this.anInt7636;
		@Pc(242) int local242 = local196;
		local196 += this.anInt7622;
		@Pc(249) int local249 = local196;
		if (local80) {
			local196 += this.anInt7629;
		}
		@Pc(258) int local258 = local196;
		local196 += this.anInt7629;
		@Pc(265) int local265 = local196;
		if (local134 == 255) {
			local196 += this.anInt7629;
		}
		@Pc(277) int local277 = local196;
		if (local144 == 1) {
			local196 += this.anInt7629;
		}
		@Pc(289) int local289 = local196;
		if (local154 == 1) {
			local196 += this.anInt7622;
		}
		@Pc(299) int local299 = local196;
		if (local140 == 1) {
			local196 += this.anInt7629;
		}
		@Pc(311) int local311 = local196;
		local196 += local170;
		@Pc(317) int local317 = local196;
		if (local148 == 1) {
			local196 += this.anInt7629 * 2;
		}
		@Pc(331) int local331 = local196;
		local196 += local174;
		@Pc(337) int local337 = local196;
		local196 += this.anInt7629 * 2;
		@Pc(346) int local346 = local196;
		local196 += local158;
		@Pc(352) int local352 = local196;
		local196 += local162;
		@Pc(358) int local358 = local196;
		local196 += local166;
		@Pc(364) int local364 = local196;
		local196 += local176 * 6;
		@Pc(372) int local372 = local196;
		local196 += local178 * 6;
		@Pc(386) int local386 = this.anInt7617 < 14 ? 6 : 7;
		@Pc(388) int local388 = local196;
		local196 += local178 * local386;
		@Pc(396) int local396 = local196;
		local196 += local178;
		@Pc(402) int local402 = local196;
		local196 += local178;
		@Pc(408) int local408 = local196;
		local196 += local180 * 2 + local178;
		if (local154 == 1) {
			this.anIntArray676 = new int[this.anInt7622];
		}
		this.anIntArray666 = new int[this.anInt7622];
		if (this.anInt7636 > 0) {
			this.aShortArray103 = new short[this.anInt7636];
			if (local178 > 0) {
				this.anIntArray673 = new int[local178];
				this.anIntArray670 = new int[local178];
				this.anIntArray667 = new int[local178];
				this.aByteArray88 = new byte[local178];
				this.anIntArray675 = new int[local178];
				this.aByteArray92 = new byte[local178];
			}
			if (local180 > 0) {
				this.anIntArray674 = new int[local180];
				this.anIntArray668 = new int[local180];
			}
			this.aShortArray107 = new short[this.anInt7636];
			this.aShortArray110 = new short[this.anInt7636];
		}
		this.aShortArray109 = new short[this.anInt7629];
		this.aShortArray102 = new short[this.anInt7629];
		if (local148 == 1 && this.anInt7636 > 0) {
			this.aByteArray89 = new byte[this.anInt7629];
		}
		this.aShortArray108 = new short[this.anInt7629];
		if (local134 == 255) {
			this.aByteArray93 = new byte[this.anInt7629];
		} else {
			this.aByte104 = (byte) local134;
		}
		if (local80) {
			this.aByteArray90 = new byte[this.anInt7629];
		}
		if (local148 == 1) {
			this.aShortArray106 = new short[this.anInt7629];
		}
		if (local140 == 1) {
			this.aByteArray91 = new byte[this.anInt7629];
		}
		if (local144 == 1) {
			this.anIntArray669 = new int[this.anInt7629];
		}
		local10.anInt5056 = local242;
		this.aShortArray111 = new short[this.anInt7629];
		this.anIntArray672 = new int[this.anInt7622];
		this.anIntArray671 = new int[this.anInt7622];
		local15.anInt5056 = local346;
		local20.anInt5056 = local352;
		local25.anInt5056 = local358;
		local30.anInt5056 = local289;
		@Pc(607) int local607 = 0;
		@Pc(609) int local609 = 0;
		@Pc(611) int local611 = 0;
		@Pc(619) int local619;
		for (@Pc(613) int local613 = 0; local613 < this.anInt7622; local613++) {
			local619 = local10.method4130();
			@Pc(621) int local621 = 0;
			if ((local619 & 0x1) != 0) {
				local621 = local15.method4131();
			}
			@Pc(631) int local631 = 0;
			if ((local619 & 0x2) != 0) {
				local631 = local20.method4131();
			}
			@Pc(644) int local644 = 0;
			if ((local619 & 0x4) != 0) {
				local644 = local25.method4131();
			}
			this.anIntArray672[local613] = local607 + local621;
			this.anIntArray666[local613] = local609 + local631;
			this.anIntArray671[local613] = local611 + local644;
			local607 = this.anIntArray672[local613];
			local611 = this.anIntArray671[local613];
			local609 = this.anIntArray666[local613];
			if (local154 == 1) {
				this.anIntArray676[local613] = local30.method4130();
			}
		}
		local10.anInt5056 = local337;
		local15.anInt5056 = local249;
		local20.anInt5056 = local265;
		local25.anInt5056 = local299;
		local30.anInt5056 = local277;
		local35.anInt5056 = local317;
		local40.anInt5056 = local331;
		for (local619 = 0; local619 < this.anInt7629; local619++) {
			this.aShortArray111[local619] = (short) local10.method4093();
			if (local80) {
				this.aByteArray90[local619] = local15.method4112();
			}
			if (local134 == 255) {
				this.aByteArray93[local619] = local20.method4112();
			}
			if (local140 == 1) {
				this.aByteArray91[local619] = local25.method4112();
			}
			if (local144 == 1) {
				this.anIntArray669[local619] = local30.method4130();
			}
			if (local148 == 1) {
				this.aShortArray106[local619] = (short) (local35.method4093() - 1);
			}
			if (this.aByteArray89 != null) {
				if (this.aShortArray106[local619] == -1) {
					this.aByteArray89[local619] = -1;
				} else {
					this.aByteArray89[local619] = (byte) (local40.method4130() - 1);
				}
			}
		}
		this.anInt7628 = -1;
		local10.anInt5056 = local311;
		local15.anInt5056 = local258;
		@Pc(837) short local837 = 0;
		@Pc(839) short local839 = 0;
		@Pc(841) short local841 = 0;
		@Pc(843) short local843 = 0;
		@Pc(851) int local851;
		for (@Pc(845) int local845 = 0; local845 < this.anInt7629; local845++) {
			local851 = local15.method4130();
			if (local851 == 1) {
				local837 = (short) (local10.method4131() + local843);
				local839 = (short) (local837 + local10.method4131());
				local841 = (short) (local839 + local10.method4131());
				this.aShortArray109[local845] = local837;
				local843 = local841;
				this.aShortArray108[local845] = local839;
				this.aShortArray102[local845] = local841;
				if (local837 > this.anInt7628) {
					this.anInt7628 = local837;
				}
				if (this.anInt7628 < local839) {
					this.anInt7628 = local839;
				}
				if (local841 > this.anInt7628) {
					this.anInt7628 = local841;
				}
			}
			if (local851 == 2) {
				local839 = local841;
				local841 = (short) (local10.method4131() + local843);
				this.aShortArray109[local845] = local837;
				local843 = local841;
				this.aShortArray108[local845] = local839;
				this.aShortArray102[local845] = local841;
				if (local841 > this.anInt7628) {
					this.anInt7628 = local841;
				}
			}
			if (local851 == 3) {
				local837 = local841;
				local841 = (short) (local10.method4131() + local843);
				local843 = local841;
				this.aShortArray109[local845] = local837;
				this.aShortArray108[local845] = local839;
				this.aShortArray102[local845] = local841;
				if (local841 > this.anInt7628) {
					this.anInt7628 = local841;
				}
			}
			if (local851 == 4) {
				@Pc(1006) short local1006 = local837;
				local837 = local839;
				local841 = (short) (local10.method4131() + local843);
				local839 = local1006;
				this.aShortArray109[local845] = local837;
				local843 = local841;
				this.aShortArray108[local845] = local1006;
				this.aShortArray102[local845] = local841;
				if (local841 > this.anInt7628) {
					this.anInt7628 = local841;
				}
			}
		}
		this.anInt7628++;
		local10.anInt5056 = local364;
		local15.anInt5056 = local372;
		local20.anInt5056 = local388;
		local25.anInt5056 = local396;
		local30.anInt5056 = local402;
		local35.anInt5056 = local408;
		@Pc(1089) int local1089;
		for (local851 = 0; local851 < this.anInt7636; local851++) {
			local1089 = this.aByteArray94[local851] & 0xFF;
			if (local1089 == 0) {
				this.aShortArray107[local851] = (short) local10.method4093();
				this.aShortArray110[local851] = (short) local10.method4093();
				this.aShortArray103[local851] = (short) local10.method4093();
			}
			if (local1089 == 1) {
				this.aShortArray107[local851] = (short) local15.method4093();
				this.aShortArray110[local851] = (short) local15.method4093();
				this.aShortArray103[local851] = (short) local15.method4093();
				this.anIntArray675[local851] = local20.method4093();
				if (this.anInt7617 < 14) {
					this.anIntArray667[local851] = local20.method4093();
				} else {
					this.anIntArray667[local851] = local20.method4142();
				}
				this.anIntArray670[local851] = local20.method4093();
				this.aByteArray92[local851] = local25.method4112();
				this.aByteArray88[local851] = local30.method4112();
				this.anIntArray673[local851] = local35.method4112();
			}
			if (local1089 == 2) {
				this.aShortArray107[local851] = (short) local15.method4093();
				this.aShortArray110[local851] = (short) local15.method4093();
				this.aShortArray103[local851] = (short) local15.method4093();
				this.anIntArray675[local851] = local20.method4093();
				if (this.anInt7617 >= 14) {
					this.anIntArray667[local851] = local20.method4142();
				} else {
					this.anIntArray667[local851] = local20.method4093();
				}
				this.anIntArray670[local851] = local20.method4093();
				this.aByteArray92[local851] = local25.method4112();
				this.aByteArray88[local851] = local30.method4112();
				this.anIntArray673[local851] = local35.method4112();
				this.anIntArray668[local851] = local35.method4112();
				this.anIntArray674[local851] = local35.method4112();
			}
			if (local1089 == 3) {
				this.aShortArray107[local851] = (short) local15.method4093();
				this.aShortArray110[local851] = (short) local15.method4093();
				this.aShortArray103[local851] = (short) local15.method4093();
				this.anIntArray675[local851] = local20.method4093();
				if (this.anInt7617 < 14) {
					this.anIntArray667[local851] = local20.method4093();
				} else {
					this.anIntArray667[local851] = local20.method4142();
				}
				this.anIntArray670[local851] = local20.method4093();
				this.aByteArray92[local851] = local25.method4112();
				this.aByteArray88[local851] = local30.method4112();
				this.anIntArray673[local851] = local35.method4112();
			}
		}
		local10.anInt5056 = local196;
		@Pc(1410) int local1410;
		@Pc(1416) int local1416;
		@Pc(1420) int local1420;
		@Pc(1483) int local1483;
		if (local91) {
			local1089 = local10.method4130();
			if (local1089 > 0) {
				this.aClass252Array4 = new Class252[local1089];
				for (local1410 = 0; local1410 < local1089; local1410++) {
					local1416 = local10.method4093();
					local1420 = local10.method4093();
					@Pc(1428) byte local1428;
					if (local134 == 255) {
						local1428 = this.aByteArray93[local1420];
					} else {
						local1428 = (byte) local134;
					}
					this.aClass252Array4[local1410] = new Class252(local1416, this.aShortArray109[local1420], this.aShortArray108[local1420], this.aShortArray102[local1420], local1428);
				}
			}
			local1410 = local10.method4130();
			if (local1410 > 0) {
				this.aClass122Array4 = new Class122[local1410];
				for (local1416 = 0; local1416 < local1410; local1416++) {
					local1420 = local10.method4093();
					local1483 = local10.method4093();
					this.aClass122Array4[local1416] = new Class122(local1420, local1483);
				}
			}
		}
		if (!local100) {
			return;
		}
		local1089 = local10.method4130();
		if (local1089 <= 0) {
			return;
		}
		this.aClass152Array1 = new Class152[local1089];
		for (local1410 = 0; local1410 < local1089; local1410++) {
			local1416 = local10.method4093();
			local1420 = local10.method4093();
			local1483 = local10.method4130();
			@Pc(1530) byte local1530 = local10.method4112();
			this.aClass152Array1[local1410] = new Class152(local1416, local1420, local1483, local1530);
		}
		return;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)[[I")
	public int[][] method5919() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt7629; local12++) {
			@Pc(27) int local27 = this.anIntArray669[local12];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(38) int local38 = local8[local27]++;
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local10; local53++) {
			local51[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt7629; local76++) {
			@Pc(83) int local83 = this.anIntArray669[local76];
			if (local83 >= 0) {
				local51[local83][local8[local83]++] = local76;
			}
		}
		return local51;
	}
}
