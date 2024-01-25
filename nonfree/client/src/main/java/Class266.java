import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class266 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
	public int[] anIntArray578;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "[Lclient!jt;")
	public Class181[] aClass181Array7;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[S")
	public short[] aShortArray121;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[Lclient!ol;")
	public Class253[] aClass253Array1;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "[S")
	public short[] aShortArray122;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
	public int[] anIntArray579;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "[I")
	public int[] anIntArray580;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "[I")
	public int[] anIntArray583;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "[S")
	public short[] aShortArray127;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "[I")
	public int[] anIntArray584;

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "[I")
	public int[] anIntArray585;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "[I")
	public int[] anIntArray587;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "[Lclient!efa;")
	public Class89[] aClass89Array7;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "[I")
	public int[] anIntArray588;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	public int anInt7023 = 0;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
	public int anInt7035 = 12;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
	public int anInt7030 = 0;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "B")
	public byte aByte78 = 0;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
	public int anInt7038 = 0;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	public int anInt7033 = 0;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
	public Class266(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5855(arg0);
		} else {
			this.method5857(arg0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(III)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray127 = new short[arg1];
		this.aShortArray124 = new short[arg1];
		this.aShortArray129 = new short[arg1];
		this.aShortArray121 = new short[arg1];
		this.aByteArray87 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray88 = new byte[arg2];
			this.aShortArray122 = new short[arg2];
			this.aShortArray130 = new short[arg2];
			this.anIntArray583 = new int[arg2];
			this.aByteArray89 = new byte[arg2];
			this.anIntArray585 = new int[arg2];
			this.aShortArray125 = new short[arg2];
			this.anIntArray586 = new int[arg2];
			this.anIntArray578 = new int[arg2];
			this.aByteArray91 = new byte[arg2];
			this.anIntArray587 = new int[arg2];
			this.anIntArray588 = new int[arg2];
		}
		this.aByteArray85 = new byte[arg1];
		this.aByteArray86 = new byte[arg1];
		this.aShortArray128 = new short[arg1];
		this.anIntArray584 = new int[arg0];
		this.anIntArray580 = new int[arg0];
		this.aByteArray90 = new byte[arg1];
		this.anIntArray582 = new int[arg1];
		this.anIntArray581 = new int[arg0];
		this.anIntArray579 = new int[arg0];
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([Lclient!pf;I)V")
	public Class266(@OriginalArg(0) Class266[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7038 = 0;
		this.anInt7030 = 0;
		this.anInt7023 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte78 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class266 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt7023 += local59.anInt7023;
				this.anInt7030 += local59.anInt7030;
				this.anInt7038 += local59.anInt7038;
				if (local59.aClass181Array7 != null) {
					local32 += local59.aClass181Array7.length;
				}
				if (local59.aClass89Array7 != null) {
					local34 += local59.aClass89Array7.length;
				}
				local38 |= local59.aByteArray85 != null;
				if (local59.aClass253Array1 != null) {
					local36 += local59.aClass253Array1.length;
				}
				if (local59.aByteArray87 == null) {
					if (this.aByte78 == -1) {
						this.aByte78 = local59.aByte78;
					}
					if (this.aByte78 != local59.aByte78) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray86 != null;
				local51 |= local59.anIntArray582 != null;
				local46 |= local59.aShortArray124 != null;
				local44 |= local59.aByteArray90 != null;
			}
		}
		this.aShortArray129 = new short[this.anInt7038];
		if (local42) {
			this.aByteArray86 = new byte[this.anInt7038];
		}
		if (local32 > 0) {
			this.aClass181Array7 = new Class181[local32];
		}
		this.aShortArray127 = new short[this.anInt7038];
		if (local34 > 0) {
			this.aClass89Array7 = new Class89[local34];
		}
		this.aShortArray126 = new short[this.anInt7038];
		this.anIntArray580 = new int[this.anInt7023];
		this.aShortArray121 = new short[this.anInt7038];
		if (this.anInt7030 > 0) {
			this.aShortArray122 = new short[this.anInt7030];
			this.aShortArray125 = new short[this.anInt7030];
			this.aByteArray91 = new byte[this.anInt7030];
			this.anIntArray586 = new int[this.anInt7030];
			this.aByteArray88 = new byte[this.anInt7030];
			this.anIntArray585 = new int[this.anInt7030];
			this.anIntArray583 = new int[this.anInt7030];
			this.aByteArray89 = new byte[this.anInt7030];
			this.anIntArray578 = new int[this.anInt7030];
			this.anIntArray588 = new int[this.anInt7030];
			this.aShortArray130 = new short[this.anInt7030];
			this.anIntArray587 = new int[this.anInt7030];
		}
		if (local38) {
			this.aByteArray85 = new byte[this.anInt7038];
		}
		if (local36 > 0) {
			this.aClass253Array1 = new Class253[local36];
		}
		this.aShortArray123 = new short[this.anInt7023];
		this.anIntArray584 = new int[this.anInt7023];
		if (local44) {
			this.aByteArray90 = new byte[this.anInt7038];
		}
		if (local40) {
			this.aByteArray87 = new byte[this.anInt7038];
		}
		this.anIntArray581 = new int[this.anInt7023];
		this.anIntArray579 = new int[this.anInt7023];
		this.aShortArray128 = new short[this.anInt7038];
		if (local51) {
			this.anIntArray582 = new int[this.anInt7038];
		}
		if (local46) {
			this.aShortArray124 = new short[this.anInt7038];
		}
		this.anInt7030 = 0;
		this.anInt7023 = 0;
		this.anInt7038 = 0;
		local36 = 0;
		local34 = 0;
		local32 = 0;
		@Pc(623) int local623;
		@Pc(634) int local634;
		for (@Pc(383) int local383 = 0; local383 < arg1; local383++) {
			@Pc(390) short local390 = (short) (0x1 << local383);
			@Pc(394) Class266 local394 = arg0[local383];
			if (local394 != null) {
				@Pc(401) int local401;
				if (local394.aClass253Array1 != null) {
					for (local401 = 0; local401 < local394.aClass253Array1.length; local401++) {
						@Pc(408) Class253 local408 = local394.aClass253Array1[local401];
						this.aClass253Array1[local36++] = local408.method5685(this.anInt7038 + local408.anInt6798);
					}
				}
				for (local401 = 0; local401 < local394.anInt7038; local401++) {
					if (local38 && local394.aByteArray85 != null) {
						this.aByteArray85[this.anInt7038] = local394.aByteArray85[local401];
					}
					if (local40) {
						if (local394.aByteArray87 == null) {
							this.aByteArray87[this.anInt7038] = local394.aByte78;
						} else {
							this.aByteArray87[this.anInt7038] = local394.aByteArray87[local401];
						}
					}
					if (local42 && local394.aByteArray86 != null) {
						this.aByteArray86[this.anInt7038] = local394.aByteArray86[local401];
					}
					if (local46) {
						if (local394.aShortArray124 == null) {
							this.aShortArray124[this.anInt7038] = -1;
						} else {
							this.aShortArray124[this.anInt7038] = local394.aShortArray124[local401];
						}
					}
					if (local51) {
						if (local394.anIntArray582 == null) {
							this.anIntArray582[this.anInt7038] = -1;
						} else {
							this.anIntArray582[this.anInt7038] = local394.anIntArray582[local401];
						}
					}
					this.aShortArray128[this.anInt7038] = (short) this.method5847(local394.aShortArray128[local401], local390, local394);
					this.aShortArray127[this.anInt7038] = (short) this.method5847(local394.aShortArray127[local401], local390, local394);
					this.aShortArray121[this.anInt7038] = (short) this.method5847(local394.aShortArray121[local401], local390, local394);
					this.aShortArray126[this.anInt7038] = local390;
					this.aShortArray129[this.anInt7038] = local394.aShortArray129[local401];
					this.anInt7038++;
				}
				@Pc(610) int local610;
				if (local394.aClass181Array7 != null) {
					for (local610 = 0; local610 < local394.aClass181Array7.length; local610++) {
						local623 = this.method5847(local394.aClass181Array7[local610].anInt5035, local390, local394);
						local634 = this.method5847(local394.aClass181Array7[local610].anInt5020, local390, local394);
						@Pc(645) int local645 = this.method5847(local394.aClass181Array7[local610].anInt5018, local390, local394);
						this.aClass181Array7[local32] = local394.aClass181Array7[local610].method4270(local623, local645, local634);
						local32++;
					}
				}
				if (local394.aClass89Array7 != null) {
					for (local610 = 0; local610 < local394.aClass89Array7.length; local610++) {
						local623 = this.method5847(local394.aClass89Array7[local610].anInt2746, local390, local394);
						this.aClass89Array7[local34] = local394.aClass89Array7[local610].method2425(local623);
						local34++;
					}
				}
			}
		}
		this.anInt7033 = this.anInt7023;
		@Pc(719) int local719 = 0;
		for (@Pc(721) int local721 = 0; local721 < arg1; local721++) {
			@Pc(728) short local728 = (short) (0x1 << local721);
			@Pc(732) Class266 local732 = arg0[local721];
			if (local732 != null) {
				for (local623 = 0; local623 < local732.anInt7038; local623++) {
					if (local44) {
						this.aByteArray90[local719++] = (byte) (local732.aByteArray90 == null || local732.aByteArray90[local623] == -1 ? -1 : local732.aByteArray90[local623] + this.anInt7030);
					}
				}
				for (local634 = 0; local634 < local732.anInt7030; local634++) {
					@Pc(784) byte local784 = this.aByteArray89[this.anInt7030] = local732.aByteArray89[local634];
					if (local784 == 0) {
						this.aShortArray122[this.anInt7030] = (short) this.method5847(local732.aShortArray122[local634], local728, local732);
						this.aShortArray125[this.anInt7030] = (short) this.method5847(local732.aShortArray125[local634], local728, local732);
						this.aShortArray130[this.anInt7030] = (short) this.method5847(local732.aShortArray130[local634], local728, local732);
					}
					if (local784 >= 1 && local784 <= 3) {
						this.aShortArray122[this.anInt7030] = local732.aShortArray122[local634];
						this.aShortArray125[this.anInt7030] = local732.aShortArray125[local634];
						this.aShortArray130[this.anInt7030] = local732.aShortArray130[local634];
						this.anIntArray586[this.anInt7030] = local732.anIntArray586[local634];
						this.anIntArray578[this.anInt7030] = local732.anIntArray578[local634];
						this.anIntArray588[this.anInt7030] = local732.anIntArray588[local634];
						this.aByteArray88[this.anInt7030] = local732.aByteArray88[local634];
						this.aByteArray91[this.anInt7030] = local732.aByteArray91[local634];
						this.anIntArray585[this.anInt7030] = local732.anIntArray585[local634];
					}
					if (local784 == 2) {
						this.anIntArray583[this.anInt7030] = local732.anIntArray583[local634];
						this.anIntArray587[this.anInt7030] = local732.anIntArray587[local634];
					}
					this.anInt7030++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)I")
	public int method5844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7023; local7++) {
			if (this.anIntArray581[local7] == arg1 && arg2 == this.anIntArray580[local7] && arg0 == this.anIntArray579[local7]) {
				return local7;
			}
		}
		this.anIntArray581[this.anInt7023] = arg1;
		this.anIntArray580[this.anInt7023] = arg2;
		this.anIntArray579[this.anInt7023] = arg0;
		this.anInt7033 = this.anInt7023 + 1;
		return this.anInt7023++;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ISS)V")
	public void method5845(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7038; local7++) {
			if (this.aShortArray129[local7] == arg0) {
				this.aShortArray129[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)[[I")
	public int[][] method5846() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass253Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass253Array1[local12].anInt6796;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local58[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.aClass253Array1.length; local83++) {
			@Pc(91) int local91 = this.aClass253Array1[local83].anInt6796;
			if (local91 >= 0) {
				local58[local91][local8[local91]++] = local83;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ISBLclient!pf;)I")
	private int method5847(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) Class266 arg2) {
		@Pc(10) int local10 = arg2.anIntArray581[arg0];
		@Pc(22) int local22 = arg2.anIntArray580[arg0];
		@Pc(27) int local27 = arg2.anIntArray579[arg0];
		for (@Pc(29) int local29 = 0; local29 < this.anInt7023; local29++) {
			if (this.anIntArray581[local29] == local10 && local22 == this.anIntArray580[local29] && local27 == this.anIntArray579[local29]) {
				this.aShortArray123[local29] |= arg1;
				return local29;
			}
		}
		this.anIntArray581[this.anInt7023] = local10;
		this.anIntArray580[this.anInt7023] = local22;
		this.anIntArray579[this.anInt7023] = local27;
		this.aShortArray123[this.anInt7023] = arg1;
		this.anIntArray584[this.anInt7023] = arg2.anIntArray584 == null ? -1 : arg2.anIntArray584[arg0];
		return this.anInt7023++;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(SIIIBBBIS)I")
	public int method5848(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) short arg7) {
		this.aShortArray128[this.anInt7038] = (short) arg6;
		this.aShortArray127[this.anInt7038] = (short) arg1;
		this.aShortArray121[this.anInt7038] = (short) arg2;
		this.aByteArray85[this.anInt7038] = arg4;
		this.aByteArray90[this.anInt7038] = arg5;
		this.aShortArray129[this.anInt7038] = arg7;
		this.aByteArray86[this.anInt7038] = arg3;
		this.aShortArray124[this.anInt7038] = arg0;
		return this.anInt7038++;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBII)V")
	public void method5850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(36) int local36;
		if (arg0 != 0) {
			@Pc(11) int local11 = Class4_Sub11.anIntArray148[arg0];
			local15 = Class4_Sub11.anIntArray147[arg0];
			for (local17 = 0; local17 < this.anInt7023; local17++) {
				local36 = this.anIntArray580[local17] * local11 + local15 * this.anIntArray581[local17] >> 14;
				this.anIntArray580[local17] = this.anIntArray580[local17] * local15 - local11 * this.anIntArray581[local17] >> 14;
				this.anIntArray581[local17] = local36;
			}
		}
		@Pc(112) int local112;
		if (arg2 != 0) {
			local15 = Class4_Sub11.anIntArray148[arg2];
			local17 = Class4_Sub11.anIntArray147[arg2];
			for (local36 = 0; local36 < this.anInt7023; local36++) {
				local112 = this.anIntArray580[local36] * local17 - local15 * this.anIntArray579[local36] >> 14;
				this.anIntArray579[local36] = local17 * this.anIntArray579[local36] + this.anIntArray580[local36] * local15 >> 14;
				this.anIntArray580[local36] = local112;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local15 = Class4_Sub11.anIntArray148[arg1];
		local17 = Class4_Sub11.anIntArray147[arg1];
		for (local36 = 0; local36 < this.anInt7023; local36++) {
			local112 = this.anIntArray579[local36] * local15 + this.anIntArray581[local36] * local17 >> 14;
			this.anIntArray579[local36] = local17 * this.anIntArray579[local36] - local15 * this.anIntArray581[local36] >> 14;
			this.anIntArray581[local36] = local112;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIB)V")
	public void method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt7023; local5++) {
			this.anIntArray581[local5] += arg1;
			this.anIntArray580[local5] += arg2;
			this.anIntArray579[local5] += arg0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
	public void method5852() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7023; local3++) {
			this.anIntArray581[local3] <<= 0x2;
			this.anIntArray580[local3] <<= 0x2;
			this.anIntArray579[local3] <<= 0x2;
		}
		if (this.anInt7030 <= 0 || this.anIntArray586 == null) {
			return;
		}
		for (@Pc(64) int local64 = 0; local64 < this.anIntArray586.length; local64++) {
			this.anIntArray586[local64] <<= 0x2;
			this.anIntArray578[local64] <<= 0x2;
			if (this.aByteArray89[local64] != 1) {
				this.anIntArray588[local64] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(SSI)V")
	public void method5853(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray124 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt7038; local11++) {
			if (arg1 == this.aShortArray124[local11]) {
				this.aShortArray124[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBSBSSBSSS)B")
	public byte method5854() {
		if (this.anInt7030 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray89[this.anInt7030] = 3;
		this.aShortArray122[this.anInt7030] = 0;
		this.aShortArray125[this.anInt7030] = 32767;
		this.aShortArray130[this.anInt7030] = 0;
		this.anIntArray586[this.anInt7030] = 1024;
		this.anIntArray578[this.anInt7030] = 1024;
		this.anIntArray588[this.anInt7030] = 1024;
		this.aByteArray88[this.anInt7030] = 0;
		this.aByteArray91[this.anInt7030] = 0;
		this.anIntArray585[this.anInt7030] = 0;
		return (byte) this.anInt7030++;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)V")
	private void method5855(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub9 local10 = new Class4_Sub9(arg0);
		@Pc(15) Class4_Sub9 local15 = new Class4_Sub9(arg0);
		@Pc(20) Class4_Sub9 local20 = new Class4_Sub9(arg0);
		@Pc(25) Class4_Sub9 local25 = new Class4_Sub9(arg0);
		@Pc(30) Class4_Sub9 local30 = new Class4_Sub9(arg0);
		@Pc(35) Class4_Sub9 local35 = new Class4_Sub9(arg0);
		@Pc(40) Class4_Sub9 local40 = new Class4_Sub9(arg0);
		local10.anInt7219 = arg0.length - 23;
		this.anInt7023 = local10.method5982();
		this.anInt7038 = local10.method5982();
		this.anInt7030 = local10.method6015();
		@Pc(65) int local65 = local10.method6015();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt7219 -= 7;
			this.anInt7035 = local10.method6015();
			local10.anInt7219 += 6;
		}
		@Pc(128) int local128 = local10.method6015();
		@Pc(144) int local144 = local10.method6015();
		@Pc(148) int local148 = local10.method6015();
		@Pc(154) int local154 = local10.method6015();
		@Pc(158) int local158 = local10.method6015();
		@Pc(162) int local162 = local10.method5982();
		@Pc(166) int local166 = local10.method5982();
		@Pc(170) int local170 = local10.method5982();
		@Pc(174) int local174 = local10.method5982();
		@Pc(178) int local178 = local10.method5982();
		@Pc(180) int local180 = 0;
		@Pc(182) int local182 = 0;
		@Pc(184) int local184 = 0;
		@Pc(197) int local197;
		if (this.anInt7030 > 0) {
			local10.anInt7219 = 0;
			this.aByteArray89 = new byte[this.anInt7030];
			for (local197 = 0; local197 < this.anInt7030; local197++) {
				@Pc(208) byte local208 = this.aByteArray89[local197] = local10.method6021();
				if (local208 == 0) {
					local180++;
				}
				if (local208 == 2) {
					local184++;
				}
				if (local208 >= 1 && local208 <= 3) {
					local182++;
				}
			}
		}
		local197 = this.anInt7030;
		@Pc(243) int local243 = local197;
		local197 += this.anInt7023;
		@Pc(250) int local250 = local197;
		if (local74) {
			local197 += this.anInt7038;
		}
		@Pc(259) int local259 = local197;
		local197 += this.anInt7038;
		@Pc(266) int local266 = local197;
		if (local128 == 255) {
			local197 += this.anInt7038;
		}
		@Pc(276) int local276 = local197;
		if (local148 == 1) {
			local197 += this.anInt7038;
		}
		@Pc(288) int local288 = local197;
		if (local158 == 1) {
			local197 += this.anInt7023;
		}
		@Pc(298) int local298 = local197;
		if (local144 == 1) {
			local197 += this.anInt7038;
		}
		@Pc(308) int local308 = local197;
		local197 += local174;
		@Pc(314) int local314 = local197;
		if (local154 == 1) {
			local197 += this.anInt7038 * 2;
		}
		@Pc(328) int local328 = local197;
		local197 += local178;
		@Pc(334) int local334 = local197;
		local197 += this.anInt7038 * 2;
		@Pc(343) int local343 = local197;
		local197 += local162;
		@Pc(349) int local349 = local197;
		local197 += local166;
		@Pc(355) int local355 = local197;
		local197 += local170;
		@Pc(361) int local361 = local197;
		local197 += local180 * 6;
		@Pc(369) int local369 = local197;
		local197 += local182 * 6;
		@Pc(377) byte local377 = 6;
		if (this.anInt7035 == 14) {
			local377 = 7;
		} else if (this.anInt7035 >= 15) {
			local377 = 9;
		}
		@Pc(393) int local393 = local197;
		local197 += local377 * local182;
		@Pc(401) int local401 = local197;
		local197 += local182;
		@Pc(407) int local407 = local197;
		local197 += local182;
		@Pc(413) int local413 = local197;
		local197 += local184 * 2 + local182;
		this.anIntArray579 = new int[this.anInt7023];
		this.aShortArray121 = new short[this.anInt7038];
		this.anIntArray581 = new int[this.anInt7023];
		if (local154 == 1) {
			this.aShortArray124 = new short[this.anInt7038];
		}
		if (local128 == 255) {
			this.aByteArray87 = new byte[this.anInt7038];
		} else {
			this.aByte78 = (byte) local128;
		}
		local10.anInt7219 = local243;
		this.anIntArray580 = new int[this.anInt7023];
		this.aShortArray127 = new short[this.anInt7038];
		if (local158 == 1) {
			this.anIntArray584 = new int[this.anInt7023];
		}
		if (local144 == 1) {
			this.aByteArray86 = new byte[this.anInt7038];
		}
		if (local74) {
			this.aByteArray85 = new byte[this.anInt7038];
		}
		this.aShortArray128 = new short[this.anInt7038];
		if (local154 == 1 && this.anInt7030 > 0) {
			this.aByteArray90 = new byte[this.anInt7038];
		}
		if (local148 == 1) {
			this.anIntArray582 = new int[this.anInt7038];
		}
		if (this.anInt7030 > 0) {
			if (local184 > 0) {
				this.anIntArray583 = new int[local184];
				this.anIntArray587 = new int[local184];
			}
			this.aShortArray130 = new short[this.anInt7030];
			this.aShortArray125 = new short[this.anInt7030];
			this.aShortArray122 = new short[this.anInt7030];
			if (local182 > 0) {
				this.anIntArray586 = new int[local182];
				this.anIntArray585 = new int[local182];
				this.aByteArray91 = new byte[local182];
				this.aByteArray88 = new byte[local182];
				this.anIntArray578 = new int[local182];
				this.anIntArray588 = new int[local182];
			}
		}
		this.aShortArray129 = new short[this.anInt7038];
		local15.anInt7219 = local343;
		local20.anInt7219 = local349;
		local25.anInt7219 = local355;
		local30.anInt7219 = local288;
		@Pc(606) int local606 = 0;
		@Pc(608) int local608 = 0;
		@Pc(610) int local610 = 0;
		@Pc(618) int local618;
		for (@Pc(612) int local612 = 0; local612 < this.anInt7023; local612++) {
			local618 = local10.method6015();
			@Pc(620) int local620 = 0;
			if ((local618 & 0x1) != 0) {
				local620 = local15.method6007();
			}
			@Pc(633) int local633 = 0;
			if ((local618 & 0x2) != 0) {
				local633 = local20.method6007();
			}
			@Pc(643) int local643 = 0;
			if ((local618 & 0x4) != 0) {
				local643 = local25.method6007();
			}
			this.anIntArray581[local612] = local620 + local606;
			this.anIntArray580[local612] = local608 + local633;
			this.anIntArray579[local612] = local610 + local643;
			local608 = this.anIntArray580[local612];
			local610 = this.anIntArray579[local612];
			local606 = this.anIntArray581[local612];
			if (local158 == 1) {
				this.anIntArray584[local612] = local30.method6015();
			}
		}
		local10.anInt7219 = local334;
		local15.anInt7219 = local250;
		local20.anInt7219 = local266;
		local25.anInt7219 = local298;
		local30.anInt7219 = local276;
		local35.anInt7219 = local314;
		local40.anInt7219 = local328;
		for (local618 = 0; local618 < this.anInt7038; local618++) {
			this.aShortArray129[local618] = (short) local10.method5982();
			if (local74) {
				this.aByteArray85[local618] = local15.method6021();
			}
			if (local128 == 255) {
				this.aByteArray87[local618] = local20.method6021();
			}
			if (local144 == 1) {
				this.aByteArray86[local618] = local25.method6021();
			}
			if (local148 == 1) {
				this.anIntArray582[local618] = local30.method6015();
			}
			if (local154 == 1) {
				this.aShortArray124[local618] = (short) (local35.method5982() - 1);
			}
			if (this.aByteArray90 != null) {
				if (this.aShortArray124[local618] == -1) {
					this.aByteArray90[local618] = -1;
				} else {
					this.aByteArray90[local618] = (byte) (local40.method6015() - 1);
				}
			}
		}
		local10.anInt7219 = local308;
		this.anInt7033 = -1;
		local15.anInt7219 = local259;
		@Pc(839) short local839 = 0;
		@Pc(841) short local841 = 0;
		@Pc(843) short local843 = 0;
		@Pc(845) short local845 = 0;
		@Pc(853) int local853;
		for (@Pc(847) int local847 = 0; local847 < this.anInt7038; local847++) {
			local853 = local15.method6015();
			if (local853 == 1) {
				local839 = (short) (local845 + local10.method6007());
				local841 = (short) (local839 + local10.method6007());
				local843 = (short) (local10.method6007() + local841);
				this.aShortArray128[local847] = local839;
				local845 = local843;
				this.aShortArray127[local847] = local841;
				this.aShortArray121[local847] = local843;
				if (this.anInt7033 < local839) {
					this.anInt7033 = local839;
				}
				if (this.anInt7033 < local841) {
					this.anInt7033 = local841;
				}
				if (this.anInt7033 < local843) {
					this.anInt7033 = local843;
				}
			}
			if (local853 == 2) {
				local841 = local843;
				local843 = (short) (local845 + local10.method6007());
				local845 = local843;
				this.aShortArray128[local847] = local839;
				this.aShortArray127[local847] = local841;
				this.aShortArray121[local847] = local843;
				if (this.anInt7033 < local843) {
					this.anInt7033 = local843;
				}
			}
			if (local853 == 3) {
				local839 = local843;
				local843 = (short) (local845 + local10.method6007());
				local845 = local843;
				this.aShortArray128[local847] = local839;
				this.aShortArray127[local847] = local841;
				this.aShortArray121[local847] = local843;
				if (local843 > this.anInt7033) {
					this.anInt7033 = local843;
				}
			}
			if (local853 == 4) {
				@Pc(1020) short local1020 = local839;
				local839 = local841;
				local843 = (short) (local845 + local10.method6007());
				local841 = local1020;
				local845 = local843;
				this.aShortArray128[local847] = local839;
				this.aShortArray127[local847] = local1020;
				this.aShortArray121[local847] = local843;
				if (this.anInt7033 < local843) {
					this.anInt7033 = local843;
				}
			}
		}
		local10.anInt7219 = local361;
		this.anInt7033++;
		local15.anInt7219 = local369;
		local20.anInt7219 = local393;
		local25.anInt7219 = local401;
		local30.anInt7219 = local407;
		local35.anInt7219 = local413;
		@Pc(1097) int local1097;
		for (local853 = 0; local853 < this.anInt7030; local853++) {
			local1097 = this.aByteArray89[local853] & 0xFF;
			if (local1097 == 0) {
				this.aShortArray122[local853] = (short) local10.method5982();
				this.aShortArray125[local853] = (short) local10.method5982();
				this.aShortArray130[local853] = (short) local10.method5982();
			}
			if (local1097 == 1) {
				this.aShortArray122[local853] = (short) local15.method5982();
				this.aShortArray125[local853] = (short) local15.method5982();
				this.aShortArray130[local853] = (short) local15.method5982();
				if (this.anInt7035 >= 15) {
					this.anIntArray586[local853] = local20.method6023();
					this.anIntArray578[local853] = local20.method6023();
					this.anIntArray588[local853] = local20.method6023();
				} else {
					this.anIntArray586[local853] = local20.method5982();
					if (this.anInt7035 >= 14) {
						this.anIntArray578[local853] = local20.method6023();
					} else {
						this.anIntArray578[local853] = local20.method5982();
					}
					this.anIntArray588[local853] = local20.method5982();
				}
				this.aByteArray88[local853] = local25.method6021();
				this.aByteArray91[local853] = local30.method6021();
				this.anIntArray585[local853] = local35.method6021();
			}
			if (local1097 == 2) {
				this.aShortArray122[local853] = (short) local15.method5982();
				this.aShortArray125[local853] = (short) local15.method5982();
				this.aShortArray130[local853] = (short) local15.method5982();
				if (this.anInt7035 >= 15) {
					this.anIntArray586[local853] = local20.method6023();
					this.anIntArray578[local853] = local20.method6023();
					this.anIntArray588[local853] = local20.method6023();
				} else {
					this.anIntArray586[local853] = local20.method5982();
					if (this.anInt7035 >= 14) {
						this.anIntArray578[local853] = local20.method6023();
					} else {
						this.anIntArray578[local853] = local20.method5982();
					}
					this.anIntArray588[local853] = local20.method5982();
				}
				this.aByteArray88[local853] = local25.method6021();
				this.aByteArray91[local853] = local30.method6021();
				this.anIntArray585[local853] = local35.method6021();
				this.anIntArray583[local853] = local35.method6021();
				this.anIntArray587[local853] = local35.method6021();
			}
			if (local1097 == 3) {
				this.aShortArray122[local853] = (short) local15.method5982();
				this.aShortArray125[local853] = (short) local15.method5982();
				this.aShortArray130[local853] = (short) local15.method5982();
				if (this.anInt7035 >= 15) {
					this.anIntArray586[local853] = local20.method6023();
					this.anIntArray578[local853] = local20.method6023();
					this.anIntArray588[local853] = local20.method6023();
				} else {
					this.anIntArray586[local853] = local20.method5982();
					if (this.anInt7035 >= 14) {
						this.anIntArray578[local853] = local20.method6023();
					} else {
						this.anIntArray578[local853] = local20.method5982();
					}
					this.anIntArray588[local853] = local20.method5982();
				}
				this.aByteArray88[local853] = local25.method6021();
				this.aByteArray91[local853] = local30.method6021();
				this.anIntArray585[local853] = local35.method6021();
			}
		}
		local10.anInt7219 = local197;
		@Pc(1506) int local1506;
		@Pc(1512) int local1512;
		@Pc(1516) int local1516;
		@Pc(1583) int local1583;
		if (local83) {
			local1097 = local10.method6015();
			if (local1097 > 0) {
				this.aClass181Array7 = new Class181[local1097];
				for (local1506 = 0; local1506 < local1097; local1506++) {
					local1512 = local10.method5982();
					local1516 = local10.method5982();
					@Pc(1526) byte local1526;
					if (local128 == 255) {
						local1526 = this.aByteArray87[local1516];
					} else {
						local1526 = (byte) local128;
					}
					this.aClass181Array7[local1506] = new Class181(local1512, this.aShortArray128[local1516], this.aShortArray127[local1516], this.aShortArray121[local1516], local1526);
				}
			}
			local1506 = local10.method6015();
			if (local1506 > 0) {
				this.aClass89Array7 = new Class89[local1506];
				for (local1512 = 0; local1512 < local1506; local1512++) {
					local1516 = local10.method5982();
					local1583 = local10.method5982();
					this.aClass89Array7[local1512] = new Class89(local1516, local1583);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1097 = local10.method6015();
		if (local1097 <= 0) {
			return;
		}
		this.aClass253Array1 = new Class253[local1097];
		for (local1506 = 0; local1506 < local1097; local1506++) {
			local1512 = local10.method5982();
			local1516 = local10.method5982();
			local1583 = local10.method6015();
			@Pc(1633) byte local1633 = local10.method6021();
			this.aClass253Array1[local1506] = new Class253(local1512, local1516, local1583, local1633);
		}
		return;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)[[I")
	public int[][] method5856() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt7038; local12++) {
			@Pc(19) int local19 = this.anIntArray582[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local54[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < this.anInt7038; local84++) {
			@Pc(91) int local91 = this.anIntArray582[local84];
			if (local91 >= 0) {
				local54[local91][local8[local91]++] = local84;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "([BI)V")
	private void method5857(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class4_Sub9 local14 = new Class4_Sub9(arg0);
		@Pc(19) Class4_Sub9 local19 = new Class4_Sub9(arg0);
		@Pc(24) Class4_Sub9 local24 = new Class4_Sub9(arg0);
		@Pc(29) Class4_Sub9 local29 = new Class4_Sub9(arg0);
		@Pc(34) Class4_Sub9 local34 = new Class4_Sub9(arg0);
		local14.anInt7219 = arg0.length - 18;
		this.anInt7023 = local14.method5982();
		this.anInt7038 = local14.method5982();
		this.anInt7030 = local14.method6015();
		@Pc(59) int local59 = local14.method6015();
		@Pc(65) int local65 = local14.method6015();
		@Pc(71) int local71 = local14.method6015();
		@Pc(77) int local77 = local14.method6015();
		@Pc(81) int local81 = local14.method6015();
		@Pc(85) int local85 = local14.method5982();
		@Pc(89) int local89 = local14.method5982();
		@Pc(93) int local93 = local14.method5982();
		@Pc(97) int local97 = local14.method5982();
		@Pc(106) int local106 = this.anInt7023;
		@Pc(108) int local108 = local106;
		local106 += this.anInt7038;
		@Pc(115) int local115 = local106;
		if (local65 == 255) {
			local106 += this.anInt7038;
		}
		@Pc(127) int local127 = local106;
		if (local77 == 1) {
			local106 += this.anInt7038;
		}
		@Pc(139) int local139 = local106;
		if (local59 == 1) {
			local106 += this.anInt7038;
		}
		@Pc(151) int local151 = local106;
		if (local81 == 1) {
			local106 += this.anInt7023;
		}
		@Pc(163) int local163 = local106;
		if (local71 == 1) {
			local106 += this.anInt7038;
		}
		@Pc(175) int local175 = local106;
		local106 += local97;
		@Pc(181) int local181 = local106;
		local106 += this.anInt7038 * 2;
		@Pc(190) int local190 = local106;
		local106 += this.anInt7030 * 6;
		@Pc(199) int local199 = local106;
		local106 += local85;
		@Pc(205) int local205 = local106;
		local106 += local89;
		if (local77 == 1) {
			this.anIntArray582 = new int[this.anInt7038];
		}
		this.anIntArray581 = new int[this.anInt7023];
		if (this.anInt7030 > 0) {
			this.aShortArray122 = new short[this.anInt7030];
			this.aShortArray125 = new short[this.anInt7030];
			this.aShortArray130 = new short[this.anInt7030];
			this.aByteArray89 = new byte[this.anInt7030];
		}
		this.aShortArray129 = new short[this.anInt7038];
		if (local71 == 1) {
			this.aByteArray86 = new byte[this.anInt7038];
		}
		if (local81 == 1) {
			this.anIntArray584 = new int[this.anInt7023];
		}
		this.anIntArray579 = new int[this.anInt7023];
		this.aShortArray121 = new short[this.anInt7038];
		this.aShortArray127 = new short[this.anInt7038];
		if (local59 == 1) {
			this.aByteArray90 = new byte[this.anInt7038];
			this.aByteArray85 = new byte[this.anInt7038];
			this.aShortArray124 = new short[this.anInt7038];
		}
		local14.anInt7219 = 0;
		this.aShortArray128 = new short[this.anInt7038];
		if (local65 == 255) {
			this.aByteArray87 = new byte[this.anInt7038];
		} else {
			this.aByte78 = (byte) local65;
		}
		this.anIntArray580 = new int[this.anInt7023];
		local19.anInt7219 = local199;
		local24.anInt7219 = local205;
		local29.anInt7219 = local106;
		local34.anInt7219 = local151;
		@Pc(355) int local355 = 0;
		@Pc(357) int local357 = 0;
		@Pc(359) int local359 = 0;
		@Pc(367) int local367;
		@Pc(369) int local369;
		for (@Pc(361) int local361 = 0; local361 < this.anInt7023; local361++) {
			local367 = local14.method6015();
			local369 = 0;
			if ((local367 & 0x1) != 0) {
				local369 = local19.method6007();
			}
			@Pc(382) int local382 = 0;
			if ((local367 & 0x2) != 0) {
				local382 = local24.method6007();
			}
			@Pc(392) int local392 = 0;
			if ((local367 & 0x4) != 0) {
				local392 = local29.method6007();
			}
			this.anIntArray581[local361] = local369 + local355;
			this.anIntArray580[local361] = local357 + local382;
			this.anIntArray579[local361] = local392 + local359;
			local359 = this.anIntArray579[local361];
			local357 = this.anIntArray580[local361];
			local355 = this.anIntArray581[local361];
			if (local81 == 1) {
				this.anIntArray584[local361] = local34.method6015();
			}
		}
		local14.anInt7219 = local181;
		local19.anInt7219 = local139;
		local24.anInt7219 = local115;
		local29.anInt7219 = local163;
		local34.anInt7219 = local127;
		for (local367 = 0; local367 < this.anInt7038; local367++) {
			this.aShortArray129[local367] = (short) local14.method5982();
			if (local59 == 1) {
				local369 = local19.method6015();
				if ((local369 & 0x1) == 1) {
					local7 = true;
					this.aByteArray85[local367] = 1;
				} else {
					this.aByteArray85[local367] = 0;
				}
				if ((local369 & 0x2) == 2) {
					this.aByteArray90[local367] = (byte) (local369 >> 2);
					this.aShortArray124[local367] = this.aShortArray129[local367];
					this.aShortArray129[local367] = 127;
					if (this.aShortArray124[local367] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray90[local367] = -1;
					this.aShortArray124[local367] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray87[local367] = local24.method6021();
			}
			if (local71 == 1) {
				this.aByteArray86[local367] = local29.method6021();
			}
			if (local77 == 1) {
				this.anIntArray582[local367] = local34.method6015();
			}
		}
		local14.anInt7219 = local175;
		this.anInt7033 = -1;
		local19.anInt7219 = local108;
		@Pc(632) short local632 = 0;
		@Pc(634) short local634 = 0;
		@Pc(636) short local636 = 0;
		@Pc(638) short local638 = 0;
		@Pc(646) int local646;
		for (@Pc(640) int local640 = 0; local640 < this.anInt7038; local640++) {
			local646 = local19.method6015();
			if (local646 == 1) {
				local632 = (short) (local14.method6007() + local638);
				local634 = (short) (local632 + local14.method6007());
				local636 = (short) (local14.method6007() + local634);
				this.aShortArray128[local640] = local632;
				local638 = local636;
				this.aShortArray127[local640] = local634;
				this.aShortArray121[local640] = local636;
				if (this.anInt7033 < local632) {
					this.anInt7033 = local632;
				}
				if (this.anInt7033 < local634) {
					this.anInt7033 = local634;
				}
				if (local636 > this.anInt7033) {
					this.anInt7033 = local636;
				}
			}
			if (local646 == 2) {
				local634 = local636;
				local636 = (short) (local638 + local14.method6007());
				this.aShortArray128[local640] = local632;
				local638 = local636;
				this.aShortArray127[local640] = local634;
				this.aShortArray121[local640] = local636;
				if (local636 > this.anInt7033) {
					this.anInt7033 = local636;
				}
			}
			if (local646 == 3) {
				local632 = local636;
				local636 = (short) (local638 + local14.method6007());
				this.aShortArray128[local640] = local632;
				local638 = local636;
				this.aShortArray127[local640] = local634;
				this.aShortArray121[local640] = local636;
				if (local636 > this.anInt7033) {
					this.anInt7033 = local636;
				}
			}
			if (local646 == 4) {
				@Pc(799) short local799 = local632;
				local632 = local634;
				local636 = (short) (local14.method6007() + local638);
				local634 = local799;
				this.aShortArray128[local640] = local632;
				local638 = local636;
				this.aShortArray127[local640] = local799;
				this.aShortArray121[local640] = local636;
				if (local636 > this.anInt7033) {
					this.anInt7033 = local636;
				}
			}
		}
		this.anInt7033++;
		local14.anInt7219 = local190;
		for (local646 = 0; local646 < this.anInt7030; local646++) {
			this.aByteArray89[local646] = 0;
			this.aShortArray122[local646] = (short) local14.method5982();
			this.aShortArray125[local646] = (short) local14.method5982();
			this.aShortArray130[local646] = (short) local14.method5982();
		}
		if (this.aByteArray90 != null) {
			@Pc(895) boolean local895 = false;
			for (@Pc(897) int local897 = 0; local897 < this.anInt7038; local897++) {
				@Pc(906) int local906 = this.aByteArray90[local897] & 0xFF;
				if (local906 != 255) {
					if (this.aShortArray128[local897] == (this.aShortArray122[local906] & 0xFFFF) && this.aShortArray127[local897] == (this.aShortArray125[local906] & 0xFFFF) && (this.aShortArray130[local906] & 0xFFFF) == this.aShortArray121[local897]) {
						this.aByteArray90[local897] = -1;
					} else {
						local895 = true;
					}
				}
			}
			if (!local895) {
				this.aByteArray90 = null;
			}
		}
		if (!local7) {
			this.aByteArray85 = null;
		}
		if (!local9) {
			this.aShortArray124 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
	public int[][] method5858(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt7023 : this.anInt7033;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray584[local20];
			if (local27 >= 0) {
				if (local27 > local10) {
					local10 = local27;
				}
				@Pc(38) int local38 = local8[local27]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local10; local58++) {
			local50[local58] = new int[local8[local58]];
			local8[local58] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < local18; local77++) {
			@Pc(84) int local84 = this.anIntArray584[local77];
			if (local84 >= 0) {
				local50[local84][local8[local84]++] = local77;
			}
		}
		return local50;
	}
}
