import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class150 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!oq", name = "H", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!oq", name = "I", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!oq", name = "K", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!oq", name = "L", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!oq", name = "M", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!oq", name = "N", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!oq", name = "O", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!oq", name = "R", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!oq", name = "S", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!oq", name = "T", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!oq", name = "W", descriptor = "[Lclient!or;")
	public Class151[] aClass151Array2;

	@OriginalMember(owner = "client!oq", name = "Z", descriptor = "[Lclient!nr;")
	public Class140[] aClass140Array2;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	public int anInt4521 = 0;

	@OriginalMember(owner = "client!oq", name = "J", descriptor = "I")
	public int anInt4532 = 0;

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "I")
	public int anInt4530 = 0;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "B")
	public byte aByte50 = 0;

	@OriginalMember(owner = "client!oq", name = "U", descriptor = "I")
	public int anInt4535 = 0;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V")
	public Class150(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3981(arg0);
		} else {
			this.method3982(arg0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(III)V")
	public Class150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray326 = new int[arg0];
		this.aShortArray52 = new short[arg1];
		this.anIntArray328 = new int[arg0];
		this.aByteArray63 = new byte[arg1];
		this.aShortArray62 = new short[arg1];
		this.aShortArray53 = new short[arg1];
		this.aShortArray55 = new short[arg1];
		this.aByteArray58 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray59 = new byte[arg2];
			this.aShortArray64 = new short[arg2];
			this.aByteArray65 = new byte[arg2];
			this.aByteArray60 = new byte[arg2];
			this.aShortArray59 = new short[arg2];
			this.aByteArray64 = new byte[arg2];
			this.aByteArray57 = new byte[arg2];
			this.aByteArray62 = new byte[arg2];
			this.aShortArray54 = new short[arg2];
			this.aShortArray58 = new short[arg2];
			this.aShortArray57 = new short[arg2];
			this.aShortArray56 = new short[arg2];
		}
		this.aByteArray61 = new byte[arg1];
		this.anIntArray325 = new int[arg0];
		this.anIntArray327 = new int[arg0];
		this.aShortArray63 = new short[arg1];
		this.anIntArray329 = new int[arg1];
		this.aByteArray56 = new byte[arg1];
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([Lclient!oq;I)V")
	public Class150(@OriginalArg(0) Class150[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4521 = 0;
		this.anInt4535 = 0;
		this.anInt4530 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte50 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class150 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt4521 += local54.anInt4521;
				this.anInt4530 += local54.anInt4530;
				this.anInt4535 += local54.anInt4535;
				if (local54.aClass151Array2 != null) {
					local31 += local54.aClass151Array2.length;
				}
				if (local54.aClass140Array2 != null) {
					local29 += local54.aClass140Array2.length;
				}
				local33 |= local54.aByteArray63 != null;
				local37 |= local54.aByteArray56 != null;
				if (local54.aByteArray58 == null) {
					if (this.aByte50 == -1) {
						this.aByte50 = local54.aByte50;
					}
					if (local54.aByte50 != this.aByte50) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local41 |= local54.aShortArray52 != null;
				local39 |= local54.aByteArray61 != null;
				local46 |= local54.anIntArray329 != null;
			}
		}
		this.aShortArray63 = new short[this.anInt4521];
		if (local37) {
			this.aByteArray56 = new byte[this.anInt4521];
		}
		if (local41) {
			this.aShortArray52 = new short[this.anInt4521];
		}
		if (local31 > 0) {
			this.aClass151Array2 = new Class151[local31];
		}
		if (local46) {
			this.anIntArray329 = new int[this.anInt4521];
		}
		this.aShortArray62 = new short[this.anInt4521];
		this.anIntArray327 = new int[this.anInt4530];
		this.aShortArray55 = new short[this.anInt4521];
		if (local33) {
			this.aByteArray63 = new byte[this.anInt4521];
		}
		if (local29 > 0) {
			this.aClass140Array2 = new Class140[local29];
		}
		if (local39) {
			this.aByteArray61 = new byte[this.anInt4521];
		}
		this.anIntArray325 = new int[this.anInt4530];
		if (local35) {
			this.aByteArray58 = new byte[this.anInt4521];
		}
		this.anIntArray326 = new int[this.anInt4530];
		this.aShortArray60 = new short[this.anInt4521];
		this.aShortArray53 = new short[this.anInt4521];
		if (this.anInt4535 > 0) {
			this.aShortArray56 = new short[this.anInt4535];
			this.aShortArray54 = new short[this.anInt4535];
			this.aShortArray58 = new short[this.anInt4535];
			this.aByteArray62 = new byte[this.anInt4535];
			this.aShortArray64 = new short[this.anInt4535];
			this.aShortArray59 = new short[this.anInt4535];
			this.aByteArray60 = new byte[this.anInt4535];
			this.aByteArray57 = new byte[this.anInt4535];
			this.aByteArray65 = new byte[this.anInt4535];
			this.aByteArray64 = new byte[this.anInt4535];
			this.aByteArray59 = new byte[this.anInt4535];
			this.aShortArray57 = new short[this.anInt4535];
		}
		this.anIntArray328 = new int[this.anInt4530];
		this.aShortArray61 = new short[this.anInt4530];
		this.anInt4530 = 0;
		this.anInt4535 = 0;
		local31 = 0;
		local29 = 0;
		this.anInt4521 = 0;
		@Pc(562) int local562;
		@Pc(573) int local573;
		for (@Pc(361) int local361 = 0; local361 < arg1; local361++) {
			@Pc(368) short local368 = (short) (0x1 << local361);
			@Pc(372) Class150 local372 = arg0[local361];
			if (local372 != null) {
				for (@Pc(376) int local376 = 0; local376 < local372.anInt4521; local376++) {
					if (local33 && local372.aByteArray63 != null) {
						this.aByteArray63[this.anInt4521] = local372.aByteArray63[local376];
					}
					if (local35) {
						if (local372.aByteArray58 == null) {
							this.aByteArray58[this.anInt4521] = local372.aByte50;
						} else {
							this.aByteArray58[this.anInt4521] = local372.aByteArray58[local376];
						}
					}
					if (local37 && local372.aByteArray56 != null) {
						this.aByteArray56[this.anInt4521] = local372.aByteArray56[local376];
					}
					if (local41) {
						if (local372.aShortArray52 == null) {
							this.aShortArray52[this.anInt4521] = -1;
						} else {
							this.aShortArray52[this.anInt4521] = local372.aShortArray52[local376];
						}
					}
					if (local46) {
						if (local372.anIntArray329 == null) {
							this.anIntArray329[this.anInt4521] = -1;
						} else {
							this.anIntArray329[this.anInt4521] = local372.anIntArray329[local376];
						}
					}
					this.aShortArray62[this.anInt4521] = (short) this.method3979(local372.aShortArray62[local376], local368, local372);
					this.aShortArray53[this.anInt4521] = (short) this.method3979(local372.aShortArray53[local376], local368, local372);
					this.aShortArray63[this.anInt4521] = (short) this.method3979(local372.aShortArray63[local376], local368, local372);
					this.aShortArray60[this.anInt4521] = local368;
					this.aShortArray55[this.anInt4521] = local372.aShortArray55[local376];
					this.anInt4521++;
				}
				@Pc(549) int local549;
				if (local372.aClass140Array2 != null) {
					for (local549 = 0; local549 < local372.aClass140Array2.length; local549++) {
						local562 = this.method3979(local372.aClass140Array2[local549].anInt4248, local368, local372);
						local573 = this.method3979(local372.aClass140Array2[local549].anInt4240, local368, local372);
						@Pc(584) int local584 = this.method3979(local372.aClass140Array2[local549].anInt4241, local368, local372);
						this.aClass140Array2[local29] = new Class140(local372.aClass140Array2[local549].anInt4254, local562, local573, local584, local372.aClass140Array2[local549].aByte49);
						local29++;
					}
				}
				if (local372.aClass151Array2 != null) {
					for (local549 = 0; local549 < local372.aClass151Array2.length; local549++) {
						local562 = this.method3979(local372.aClass151Array2[local549].anInt4539, local368, local372);
						this.aClass151Array2[local31] = new Class151(local372.aClass151Array2[local549].anInt4541, local562);
						local31++;
					}
				}
			}
		}
		@Pc(663) int local663 = 0;
		this.anInt4532 = this.anInt4530;
		for (@Pc(669) int local669 = 0; local669 < arg1; local669++) {
			@Pc(676) short local676 = (short) (0x1 << local669);
			@Pc(680) Class150 local680 = arg0[local669];
			if (local680 != null) {
				for (local562 = 0; local562 < local680.anInt4521; local562++) {
					if (local39) {
						this.aByteArray61[local663++] = (byte) (local680.aByteArray61 == null || local680.aByteArray61[local562] == -1 ? -1 : this.anInt4535 + local680.aByteArray61[local562]);
					}
				}
				for (local573 = 0; local573 < local680.anInt4535; local573++) {
					@Pc(736) byte local736 = this.aByteArray62[this.anInt4535] = local680.aByteArray62[local573];
					if (local736 == 0) {
						this.aShortArray64[this.anInt4535] = (short) this.method3979(local680.aShortArray64[local573], local676, local680);
						this.aShortArray54[this.anInt4535] = (short) this.method3979(local680.aShortArray54[local573], local676, local680);
						this.aShortArray58[this.anInt4535] = (short) this.method3979(local680.aShortArray58[local573], local676, local680);
					}
					if (local736 >= 1 && local736 <= 3) {
						this.aShortArray64[this.anInt4535] = local680.aShortArray64[local573];
						this.aShortArray54[this.anInt4535] = local680.aShortArray54[local573];
						this.aShortArray58[this.anInt4535] = local680.aShortArray58[local573];
						this.aShortArray59[this.anInt4535] = local680.aShortArray59[local573];
						this.aShortArray57[this.anInt4535] = local680.aShortArray57[local573];
						this.aShortArray56[this.anInt4535] = local680.aShortArray56[local573];
						this.aByteArray60[this.anInt4535] = local680.aByteArray60[local573];
						this.aByteArray59[this.anInt4535] = local680.aByteArray59[local573];
						this.aByteArray57[this.anInt4535] = local680.aByteArray57[local573];
					}
					if (local736 == 2) {
						this.aByteArray65[this.anInt4535] = local680.aByteArray65[local573];
						this.aByteArray64[this.anInt4535] = local680.aByteArray64[local573];
					}
					this.anInt4535++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIII)V")
	public void method3969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(32) int local32;
		if (arg2 != 0) {
			local7 = Class5_Sub9_Sub12.anIntArray169[arg2];
			local11 = Class5_Sub9_Sub12.anIntArray170[arg2];
			for (local13 = 0; local13 < this.anInt4530; local13++) {
				local32 = local7 * this.anIntArray327[local13] + this.anIntArray325[local13] * local11 >> 15;
				this.anIntArray327[local13] = this.anIntArray327[local13] * local11 - local7 * this.anIntArray325[local13] >> 15;
				this.anIntArray325[local13] = local32;
			}
		}
		if (arg1 != 0) {
			local7 = Class5_Sub9_Sub12.anIntArray169[arg1];
			local11 = Class5_Sub9_Sub12.anIntArray170[arg1];
			for (local13 = 0; local13 < this.anInt4530; local13++) {
				local32 = this.anIntArray327[local13] * local11 - local7 * this.anIntArray328[local13] >> 15;
				this.anIntArray328[local13] = this.anIntArray327[local13] * local7 + local11 * this.anIntArray328[local13] >> 15;
				this.anIntArray327[local13] = local32;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local7 = Class5_Sub9_Sub12.anIntArray169[arg0];
		local11 = Class5_Sub9_Sub12.anIntArray170[arg0];
		for (local13 = 0; local13 < this.anInt4530; local13++) {
			local32 = local11 * this.anIntArray325[local13] + local7 * this.anIntArray328[local13] >> 15;
			this.anIntArray328[local13] = this.anIntArray328[local13] * local11 - local7 * this.anIntArray325[local13] >> 15;
			this.anIntArray325[local13] = local32;
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)[[I")
	public int[][] method3971() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4532; local12++) {
			@Pc(19) int local19 = this.anIntArray326[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt4532; local75++) {
			@Pc(82) int local82 = this.anIntArray326[local75];
			if (local82 >= 0) {
				local50[local82][local8[local82]++] = local75;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII)V")
	public void method3973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4530; local11++) {
			this.anIntArray325[local11] += arg0;
			this.anIntArray327[local11] += arg1;
			this.anIntArray328[local11] += arg2;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BSSBSSSSBB)B")
	public byte method3974() {
		if (this.anInt4535 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray62[this.anInt4535] = 3;
		this.aShortArray64[this.anInt4535] = 0;
		this.aShortArray54[this.anInt4535] = 32767;
		this.aShortArray58[this.anInt4535] = 0;
		this.aShortArray59[this.anInt4535] = 1024;
		this.aShortArray57[this.anInt4535] = 1024;
		this.aShortArray56[this.anInt4535] = 1024;
		this.aByteArray60[this.anInt4535] = 0;
		this.aByteArray59[this.anInt4535] = 0;
		this.aByteArray57[this.anInt4535] = 0;
		return (byte) this.anInt4535++;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(SBS)V")
	public void method3975(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray52 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt4521; local18++) {
			if (this.aShortArray52[local18] == arg0) {
				this.aShortArray52[local18] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)[[I")
	public int[][] method3976() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4521; local12++) {
			@Pc(19) int local19 = this.anIntArray329[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt4521; local77++) {
			@Pc(84) int local84 = this.anIntArray329[local77];
			if (local84 >= 0) {
				local50[local84][local8[local84]++] = local77;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIBSIBSBI)I")
	public int method3977(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray62[this.anInt4521] = (short) arg3;
		this.aShortArray53[this.anInt4521] = (short) arg7;
		this.aShortArray63[this.anInt4521] = (short) arg1;
		this.aByteArray63[this.anInt4521] = arg6;
		this.aByteArray61[this.anInt4521] = arg4;
		this.aShortArray55[this.anInt4521] = arg2;
		this.aByteArray56[this.anInt4521] = arg0;
		this.aShortArray52[this.anInt4521] = arg5;
		return this.anInt4521++;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBSLclient!oq;)I")
	private int method3979(@OriginalArg(0) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) Class150 arg2) {
		@Pc(10) int local10 = arg2.anIntArray325[arg0];
		@Pc(15) int local15 = arg2.anIntArray327[arg0];
		@Pc(20) int local20 = arg2.anIntArray328[arg0];
		for (@Pc(30) int local30 = 0; local30 < this.anInt4530; local30++) {
			if (local10 == this.anIntArray325[local30] && local15 == this.anIntArray327[local30] && local20 == this.anIntArray328[local30]) {
				this.aShortArray61[local30] |= arg1;
				return local30;
			}
		}
		this.anIntArray325[this.anInt4530] = local10;
		this.anIntArray327[this.anInt4530] = local15;
		this.anIntArray328[this.anInt4530] = local20;
		this.aShortArray61[this.anInt4530] = arg1;
		this.anIntArray326[this.anInt4530] = arg2.anIntArray326 == null ? -1 : arg2.anIntArray326[arg0];
		return this.anInt4530++;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([BB)V")
	private void method3981(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class5_Sub1 local10 = new Class5_Sub1(arg0);
		@Pc(15) Class5_Sub1 local15 = new Class5_Sub1(arg0);
		@Pc(20) Class5_Sub1 local20 = new Class5_Sub1(arg0);
		@Pc(25) Class5_Sub1 local25 = new Class5_Sub1(arg0);
		@Pc(30) Class5_Sub1 local30 = new Class5_Sub1(arg0);
		@Pc(35) Class5_Sub1 local35 = new Class5_Sub1(arg0);
		@Pc(40) Class5_Sub1 local40 = new Class5_Sub1(arg0);
		local10.anInt2029 = arg0.length - 23;
		this.anInt4530 = local10.method1845();
		this.anInt4521 = local10.method1845();
		this.anInt4535 = local10.method1832();
		@Pc(67) int local67 = local10.method1832();
		@Pc(78) boolean local78 = (local67 & 0x1) == 1;
		@Pc(89) boolean local89 = (local67 & 0x2) == 2;
		@Pc(93) int local93 = local10.method1832();
		@Pc(97) int local97 = local10.method1832();
		@Pc(101) int local101 = local10.method1832();
		@Pc(105) int local105 = local10.method1832();
		@Pc(109) int local109 = local10.method1832();
		@Pc(113) int local113 = local10.method1845();
		@Pc(117) int local117 = local10.method1845();
		@Pc(121) int local121 = local10.method1845();
		@Pc(125) int local125 = local10.method1845();
		@Pc(131) int local131 = local10.method1845();
		@Pc(133) int local133 = 0;
		@Pc(135) int local135 = 0;
		@Pc(137) int local137 = 0;
		@Pc(150) int local150;
		if (this.anInt4535 > 0) {
			this.aByteArray62 = new byte[this.anInt4535];
			local10.anInt2029 = 0;
			for (local150 = 0; local150 < this.anInt4535; local150++) {
				@Pc(161) byte local161 = this.aByteArray62[local150] = local10.method1863();
				if (local161 == 2) {
					local137++;
				}
				if (local161 == 0) {
					local133++;
				}
				if (local161 >= 1 && local161 <= 3) {
					local135++;
				}
			}
		}
		local150 = this.anInt4535;
		@Pc(187) int local187 = local150;
		local150 += this.anInt4530;
		@Pc(194) int local194 = local150;
		if (local78) {
			local150 += this.anInt4521;
		}
		@Pc(203) int local203 = local150;
		local150 += this.anInt4521;
		@Pc(210) int local210 = local150;
		if (local93 == 255) {
			local150 += this.anInt4521;
		}
		@Pc(222) int local222 = local150;
		if (local101 == 1) {
			local150 += this.anInt4521;
		}
		@Pc(232) int local232 = local150;
		if (local109 == 1) {
			local150 += this.anInt4530;
		}
		@Pc(242) int local242 = local150;
		if (local97 == 1) {
			local150 += this.anInt4521;
		}
		@Pc(254) int local254 = local150;
		local150 += local125;
		@Pc(260) int local260 = local150;
		if (local105 == 1) {
			local150 += this.anInt4521 * 2;
		}
		@Pc(272) int local272 = local150;
		local150 += local131;
		@Pc(278) int local278 = local150;
		local150 += this.anInt4521 * 2;
		@Pc(287) int local287 = local150;
		local150 += local113;
		@Pc(293) int local293 = local150;
		local150 += local117;
		@Pc(299) int local299 = local150;
		local150 += local121;
		@Pc(305) int local305 = local150;
		local150 += local133 * 6;
		@Pc(313) int local313 = local150;
		local150 += local135 * 6;
		@Pc(321) int local321 = local150;
		local150 += local135 * 6;
		@Pc(329) int local329 = local150;
		local150 += local135;
		@Pc(335) int local335 = local150;
		local150 += local135;
		@Pc(341) int local341 = local150;
		local150 += local135 + local137 * 2;
		if (local78) {
			this.aByteArray63 = new byte[this.anInt4521];
		}
		if (local101 == 1) {
			this.anIntArray329 = new int[this.anInt4521];
		}
		this.aShortArray55 = new short[this.anInt4521];
		if (local105 == 1 && this.anInt4535 > 0) {
			this.aByteArray61 = new byte[this.anInt4521];
		}
		this.anIntArray327 = new int[this.anInt4530];
		if (local109 == 1) {
			this.anIntArray326 = new int[this.anInt4530];
		}
		this.aShortArray53 = new short[this.anInt4521];
		this.aShortArray63 = new short[this.anInt4521];
		if (this.anInt4535 > 0) {
			this.aShortArray64 = new short[this.anInt4535];
			this.aShortArray58 = new short[this.anInt4535];
			this.aShortArray54 = new short[this.anInt4535];
			if (local135 > 0) {
				this.aByteArray57 = new byte[local135];
				this.aByteArray59 = new byte[local135];
				this.aShortArray59 = new short[local135];
				this.aByteArray60 = new byte[local135];
				this.aShortArray56 = new short[local135];
				this.aShortArray57 = new short[local135];
			}
			if (local137 > 0) {
				this.aByteArray65 = new byte[local137];
				this.aByteArray64 = new byte[local137];
			}
		}
		this.aShortArray62 = new short[this.anInt4521];
		local10.anInt2029 = local187;
		if (local105 == 1) {
			this.aShortArray52 = new short[this.anInt4521];
		}
		this.anIntArray328 = new int[this.anInt4530];
		this.anIntArray325 = new int[this.anInt4530];
		if (local97 == 1) {
			this.aByteArray56 = new byte[this.anInt4521];
		}
		if (local93 == 255) {
			this.aByteArray58 = new byte[this.anInt4521];
		} else {
			this.aByte50 = (byte) local93;
		}
		local15.anInt2029 = local287;
		local20.anInt2029 = local293;
		local25.anInt2029 = local299;
		local30.anInt2029 = local232;
		@Pc(530) int local530 = 0;
		@Pc(532) int local532 = 0;
		@Pc(534) int local534 = 0;
		@Pc(548) int local548;
		for (@Pc(536) int local536 = 0; local536 < this.anInt4530; local536++) {
			local548 = local10.method1832();
			@Pc(550) int local550 = 0;
			if ((local548 & 0x1) != 0) {
				local550 = local15.method1854();
			}
			@Pc(563) int local563 = 0;
			if ((local548 & 0x2) != 0) {
				local563 = local20.method1854();
			}
			@Pc(578) int local578 = 0;
			if ((local548 & 0x4) != 0) {
				local578 = local25.method1854();
			}
			this.anIntArray325[local536] = local550 + local530;
			this.anIntArray327[local536] = local563 + local532;
			this.anIntArray328[local536] = local578 + local534;
			local534 = this.anIntArray328[local536];
			local530 = this.anIntArray325[local536];
			local532 = this.anIntArray327[local536];
			if (local109 == 1) {
				this.anIntArray326[local536] = local30.method1832();
			}
		}
		local10.anInt2029 = local278;
		local15.anInt2029 = local194;
		local20.anInt2029 = local210;
		local25.anInt2029 = local242;
		local30.anInt2029 = local222;
		local35.anInt2029 = local260;
		local40.anInt2029 = local272;
		for (local548 = 0; local548 < this.anInt4521; local548++) {
			this.aShortArray55[local548] = (short) local10.method1845();
			if (local78) {
				this.aByteArray63[local548] = local15.method1863();
			}
			if (local93 == 255) {
				this.aByteArray58[local548] = local20.method1863();
			}
			if (local97 == 1) {
				this.aByteArray56[local548] = local25.method1863();
			}
			if (local101 == 1) {
				this.anIntArray329[local548] = local30.method1832();
			}
			if (local105 == 1) {
				this.aShortArray52[local548] = (short) (local35.method1845() - 1);
			}
			if (this.aByteArray61 != null) {
				if (this.aShortArray52[local548] == -1) {
					this.aByteArray61[local548] = -1;
				} else {
					this.aByteArray61[local548] = (byte) (local40.method1832() - 1);
				}
			}
		}
		local10.anInt2029 = local254;
		this.anInt4532 = -1;
		local15.anInt2029 = local203;
		@Pc(770) short local770 = 0;
		@Pc(772) short local772 = 0;
		@Pc(774) short local774 = 0;
		@Pc(776) short local776 = 0;
		@Pc(784) int local784;
		for (@Pc(778) int local778 = 0; local778 < this.anInt4521; local778++) {
			local784 = local15.method1832();
			if (local784 == 1) {
				local770 = (short) (local776 + local10.method1854());
				local772 = (short) (local10.method1854() + local770);
				local774 = (short) (local10.method1854() + local772);
				this.aShortArray62[local778] = local770;
				local776 = local774;
				this.aShortArray53[local778] = local772;
				this.aShortArray63[local778] = local774;
				if (local770 > this.anInt4532) {
					this.anInt4532 = local770;
				}
				if (local772 > this.anInt4532) {
					this.anInt4532 = local772;
				}
				if (this.anInt4532 < local774) {
					this.anInt4532 = local774;
				}
			}
			if (local784 == 2) {
				local772 = local774;
				local774 = (short) (local10.method1854() + local776);
				this.aShortArray62[local778] = local770;
				local776 = local774;
				this.aShortArray53[local778] = local772;
				this.aShortArray63[local778] = local774;
				if (local774 > this.anInt4532) {
					this.anInt4532 = local774;
				}
			}
			if (local784 == 3) {
				local770 = local774;
				local774 = (short) (local776 + local10.method1854());
				local776 = local774;
				this.aShortArray62[local778] = local770;
				this.aShortArray53[local778] = local772;
				this.aShortArray63[local778] = local774;
				if (this.anInt4532 < local774) {
					this.anInt4532 = local774;
				}
			}
			if (local784 == 4) {
				@Pc(935) short local935 = local770;
				local770 = local772;
				local772 = local935;
				local774 = (short) (local776 + local10.method1854());
				this.aShortArray62[local778] = local770;
				local776 = local774;
				this.aShortArray53[local778] = local935;
				this.aShortArray63[local778] = local774;
				if (this.anInt4532 < local774) {
					this.anInt4532 = local774;
				}
			}
		}
		this.anInt4532++;
		local10.anInt2029 = local305;
		local15.anInt2029 = local313;
		local20.anInt2029 = local321;
		local25.anInt2029 = local329;
		local30.anInt2029 = local335;
		local35.anInt2029 = local341;
		@Pc(1014) int local1014;
		for (local784 = 0; local784 < this.anInt4535; local784++) {
			local1014 = this.aByteArray62[local784] & 0xFF;
			if (local1014 == 0) {
				this.aShortArray64[local784] = (short) local10.method1845();
				this.aShortArray54[local784] = (short) local10.method1845();
				this.aShortArray58[local784] = (short) local10.method1845();
			}
			if (local1014 == 1) {
				this.aShortArray64[local784] = (short) local15.method1845();
				this.aShortArray54[local784] = (short) local15.method1845();
				this.aShortArray58[local784] = (short) local15.method1845();
				this.aShortArray59[local784] = (short) local20.method1845();
				this.aShortArray57[local784] = (short) local20.method1845();
				this.aShortArray56[local784] = (short) local20.method1845();
				this.aByteArray60[local784] = local25.method1863();
				this.aByteArray59[local784] = local30.method1863();
				this.aByteArray57[local784] = local35.method1863();
			}
			if (local1014 == 2) {
				this.aShortArray64[local784] = (short) local15.method1845();
				this.aShortArray54[local784] = (short) local15.method1845();
				this.aShortArray58[local784] = (short) local15.method1845();
				this.aShortArray59[local784] = (short) local20.method1845();
				this.aShortArray57[local784] = (short) local20.method1845();
				this.aShortArray56[local784] = (short) local20.method1845();
				this.aByteArray60[local784] = local25.method1863();
				this.aByteArray59[local784] = local30.method1863();
				this.aByteArray57[local784] = local35.method1863();
				this.aByteArray65[local784] = local35.method1863();
				this.aByteArray64[local784] = local35.method1863();
			}
			if (local1014 == 3) {
				this.aShortArray64[local784] = (short) local15.method1845();
				this.aShortArray54[local784] = (short) local15.method1845();
				this.aShortArray58[local784] = (short) local15.method1845();
				this.aShortArray59[local784] = (short) local20.method1845();
				this.aShortArray57[local784] = (short) local20.method1845();
				this.aShortArray56[local784] = (short) local20.method1845();
				this.aByteArray60[local784] = local25.method1863();
				this.aByteArray59[local784] = local30.method1863();
				this.aByteArray57[local784] = local35.method1863();
			}
		}
		if (!local89) {
			return;
		}
		local10.anInt2029 = local150;
		local1014 = local10.method1832();
		@Pc(1306) int local1306;
		@Pc(1312) int local1312;
		if (local1014 > 0) {
			this.aClass140Array2 = new Class140[local1014];
			for (local1306 = 0; local1306 < local1014; local1306++) {
				local1312 = local10.method1845();
				@Pc(1316) int local1316 = local10.method1845();
				@Pc(1326) byte local1326;
				if (local93 == 255) {
					local1326 = this.aByteArray58[local1316];
				} else {
					local1326 = (byte) local93;
				}
				this.aClass140Array2[local1306] = new Class140(local1312, this.aShortArray62[local1316], this.aShortArray53[local1316], this.aShortArray63[local1316], local1326);
			}
		}
		local1306 = local10.method1832();
		if (local1306 <= 0) {
			return;
		}
		this.aClass151Array2 = new Class151[local1306];
		for (local1312 = 0; local1312 < local1306; local1312++) {
			this.aClass151Array2[local1312] = new Class151(local10.method1845(), local10.method1845());
		}
		return;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[B)V")
	private void method3982(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class5_Sub1 local14 = new Class5_Sub1(arg0);
		@Pc(19) Class5_Sub1 local19 = new Class5_Sub1(arg0);
		@Pc(24) Class5_Sub1 local24 = new Class5_Sub1(arg0);
		@Pc(29) Class5_Sub1 local29 = new Class5_Sub1(arg0);
		@Pc(34) Class5_Sub1 local34 = new Class5_Sub1(arg0);
		local14.anInt2029 = arg0.length - 18;
		this.anInt4530 = local14.method1845();
		this.anInt4521 = local14.method1845();
		this.anInt4535 = local14.method1832();
		@Pc(59) int local59 = local14.method1832();
		@Pc(63) int local63 = local14.method1832();
		@Pc(67) int local67 = local14.method1832();
		@Pc(71) int local71 = local14.method1832();
		@Pc(75) int local75 = local14.method1832();
		@Pc(79) int local79 = local14.method1845();
		@Pc(85) int local85 = local14.method1845();
		@Pc(89) int local89 = local14.method1845();
		@Pc(93) int local93 = local14.method1845();
		@Pc(102) int local102 = this.anInt4530;
		@Pc(104) int local104 = local102;
		local102 += this.anInt4521;
		@Pc(111) int local111 = local102;
		if (local63 == 255) {
			local102 += this.anInt4521;
		}
		@Pc(121) int local121 = local102;
		if (local71 == 1) {
			local102 += this.anInt4521;
		}
		@Pc(131) int local131 = local102;
		if (local59 == 1) {
			local102 += this.anInt4521;
		}
		@Pc(141) int local141 = local102;
		if (local75 == 1) {
			local102 += this.anInt4530;
		}
		@Pc(151) int local151 = local102;
		if (local67 == 1) {
			local102 += this.anInt4521;
		}
		@Pc(161) int local161 = local102;
		local102 += local93;
		@Pc(167) int local167 = local102;
		local102 += this.anInt4521 * 2;
		@Pc(184) int local184 = local102;
		local102 += this.anInt4535 * 6;
		@Pc(193) int local193 = local102;
		local102 += local79;
		@Pc(199) int local199 = local102;
		local102 += local85;
		if (local71 == 1) {
			this.anIntArray329 = new int[this.anInt4521];
		}
		this.aShortArray63 = new short[this.anInt4521];
		if (local67 == 1) {
			this.aByteArray56 = new byte[this.anInt4521];
		}
		if (local75 == 1) {
			this.anIntArray326 = new int[this.anInt4530];
		}
		if (local63 == 255) {
			this.aByteArray58 = new byte[this.anInt4521];
		} else {
			this.aByte50 = (byte) local63;
		}
		this.anIntArray325 = new int[this.anInt4530];
		this.anIntArray328 = new int[this.anInt4530];
		this.aShortArray62 = new short[this.anInt4521];
		this.anIntArray327 = new int[this.anInt4530];
		local14.anInt2029 = 0;
		if (local59 == 1) {
			this.aByteArray61 = new byte[this.anInt4521];
			this.aByteArray63 = new byte[this.anInt4521];
			this.aShortArray52 = new short[this.anInt4521];
		}
		this.aShortArray53 = new short[this.anInt4521];
		this.aShortArray55 = new short[this.anInt4521];
		if (this.anInt4535 > 0) {
			this.aByteArray62 = new byte[this.anInt4535];
			this.aShortArray54 = new short[this.anInt4535];
			this.aShortArray64 = new short[this.anInt4535];
			this.aShortArray58 = new short[this.anInt4535];
		}
		local19.anInt2029 = local193;
		local24.anInt2029 = local199;
		local29.anInt2029 = local102;
		local34.anInt2029 = local141;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(357) int local357;
		@Pc(359) int local359;
		for (@Pc(351) int local351 = 0; local351 < this.anInt4530; local351++) {
			local357 = local14.method1832();
			local359 = 0;
			if ((local357 & 0x1) != 0) {
				local359 = local19.method1854();
			}
			@Pc(372) int local372 = 0;
			if ((local357 & 0x2) != 0) {
				local372 = local24.method1854();
			}
			@Pc(382) int local382 = 0;
			if ((local357 & 0x4) != 0) {
				local382 = local29.method1854();
			}
			this.anIntArray325[local351] = local359 + local345;
			this.anIntArray327[local351] = local372 + local347;
			this.anIntArray328[local351] = local349 + local382;
			local347 = this.anIntArray327[local351];
			local345 = this.anIntArray325[local351];
			local349 = this.anIntArray328[local351];
			if (local75 == 1) {
				this.anIntArray326[local351] = local34.method1832();
			}
		}
		local14.anInt2029 = local167;
		local19.anInt2029 = local131;
		local24.anInt2029 = local111;
		local29.anInt2029 = local151;
		local34.anInt2029 = local121;
		for (local357 = 0; local357 < this.anInt4521; local357++) {
			this.aShortArray55[local357] = (short) local14.method1845();
			if (local59 == 1) {
				local359 = local19.method1832();
				if ((local359 & 0x1) == 1) {
					local7 = true;
					this.aByteArray63[local357] = 1;
				} else {
					this.aByteArray63[local357] = 0;
				}
				if ((local359 & 0x2) == 2) {
					this.aByteArray61[local357] = (byte) (local359 >> 2);
					this.aShortArray52[local357] = this.aShortArray55[local357];
					this.aShortArray55[local357] = 127;
					if (this.aShortArray52[local357] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray61[local357] = -1;
					this.aShortArray52[local357] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray58[local357] = local24.method1863();
			}
			if (local67 == 1) {
				this.aByteArray56[local357] = local29.method1863();
			}
			if (local71 == 1) {
				this.anIntArray329[local357] = local34.method1832();
			}
		}
		this.anInt4532 = -1;
		local14.anInt2029 = local161;
		local19.anInt2029 = local104;
		@Pc(597) short local597 = 0;
		@Pc(599) short local599 = 0;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(611) int local611;
		for (@Pc(605) int local605 = 0; local605 < this.anInt4521; local605++) {
			local611 = local19.method1832();
			if (local611 == 1) {
				local597 = (short) (local603 + local14.method1854());
				local599 = (short) (local14.method1854() + local597);
				local601 = (short) (local599 + local14.method1854());
				local603 = local601;
				this.aShortArray62[local605] = local597;
				this.aShortArray53[local605] = local599;
				this.aShortArray63[local605] = local601;
				if (local597 > this.anInt4532) {
					this.anInt4532 = local597;
				}
				if (this.anInt4532 < local599) {
					this.anInt4532 = local599;
				}
				if (local601 > this.anInt4532) {
					this.anInt4532 = local601;
				}
			}
			if (local611 == 2) {
				local599 = local601;
				local601 = (short) (local14.method1854() + local603);
				this.aShortArray62[local605] = local597;
				local603 = local601;
				this.aShortArray53[local605] = local599;
				this.aShortArray63[local605] = local601;
				if (local601 > this.anInt4532) {
					this.anInt4532 = local601;
				}
			}
			if (local611 == 3) {
				local597 = local601;
				local601 = (short) (local14.method1854() + local603);
				this.aShortArray62[local605] = local597;
				local603 = local601;
				this.aShortArray53[local605] = local599;
				this.aShortArray63[local605] = local601;
				if (local601 > this.anInt4532) {
					this.anInt4532 = local601;
				}
			}
			if (local611 == 4) {
				@Pc(772) short local772 = local597;
				local597 = local599;
				local601 = (short) (local14.method1854() + local603);
				local599 = local772;
				this.aShortArray62[local605] = local597;
				local603 = local601;
				this.aShortArray53[local605] = local772;
				this.aShortArray63[local605] = local601;
				if (local601 > this.anInt4532) {
					this.anInt4532 = local601;
				}
			}
		}
		this.anInt4532++;
		local14.anInt2029 = local184;
		for (local611 = 0; local611 < this.anInt4535; local611++) {
			this.aByteArray62[local611] = 0;
			this.aShortArray64[local611] = (short) local14.method1845();
			this.aShortArray54[local611] = (short) local14.method1845();
			this.aShortArray58[local611] = (short) local14.method1845();
		}
		if (this.aByteArray61 != null) {
			@Pc(878) boolean local878 = false;
			for (@Pc(880) int local880 = 0; local880 < this.anInt4521; local880++) {
				@Pc(889) int local889 = this.aByteArray61[local880] & 0xFF;
				if (local889 != 255) {
					if (this.aShortArray62[local880] == (this.aShortArray64[local889] & 0xFFFF) && this.aShortArray53[local880] == (this.aShortArray54[local889] & 0xFFFF) && (this.aShortArray58[local889] & 0xFFFF) == this.aShortArray63[local880]) {
						this.aByteArray61[local880] = -1;
					} else {
						local878 = true;
					}
				}
			}
			if (!local878) {
				this.aByteArray61 = null;
			}
		}
		if (!local9) {
			this.aShortArray52 = null;
		}
		if (!local7) {
			this.aByteArray63 = null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(IIII)I")
	public int method3983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4530; local7++) {
			if (this.anIntArray325[local7] == arg2 && this.anIntArray327[local7] == arg0 && this.anIntArray328[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray325[this.anInt4530] = arg2;
		this.anIntArray327[this.anInt4530] = arg0;
		this.anIntArray328[this.anInt4530] = arg1;
		this.anInt4532 = this.anInt4530 + 1;
		return this.anInt4530++;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BSS)V")
	public void method3984(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt4521; local9++) {
			if (this.aShortArray55[local9] == arg1) {
				this.aShortArray55[local9] = arg0;
			}
		}
	}
}
