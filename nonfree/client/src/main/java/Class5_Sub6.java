import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "[Lclient!c;")
	public Class16[] aClass16Array1;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "[I")
	public int[] anIntArray348;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "[I")
	public int[] anIntArray349;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "[I")
	public int[] anIntArray350;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "[Lclient!sa;")
	public Class101[] aClass101Array1;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "[[I")
	public int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "[I")
	public int[] anIntArray353;

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "[I")
	public int[] anIntArray354;

	@OriginalMember(owner = "client!vd", name = "Y", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!vd", name = "Z", descriptor = "[Lclient!sa;")
	public Class101[] aClass101Array2;

	@OriginalMember(owner = "client!vd", name = "bb", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!vd", name = "cb", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!vd", name = "db", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!vd", name = "eb", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!vd", name = "fb", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!vd", name = "hb", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
	public int anInt4581;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
	public int anInt4579 = 0;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
	public int anInt4578 = 0;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "B")
	public byte aByte17 = 0;

	@OriginalMember(owner = "client!vd", name = "ab", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	private Class5_Sub6() {
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V")
	public Class5_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3569(arg0);
		} else {
			this.method3586(arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(III)V")
	public Class5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray355 = new int[arg0];
		this.anIntArray350 = new int[arg0];
		this.anIntArray348 = new int[arg0];
		this.anIntArray346 = new int[arg0];
		this.anIntArray353 = new int[arg1];
		this.anIntArray349 = new int[arg1];
		this.anIntArray354 = new int[arg1];
		this.aByteArray52 = new byte[arg1];
		this.aByteArray58 = new byte[arg1];
		this.aByteArray59 = new byte[arg1];
		this.aShortArray50 = new short[arg1];
		this.aShortArray47 = new short[arg1];
		this.aByteArray51 = new byte[arg1];
		this.anIntArray347 = new int[arg1];
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([Lclient!vd;I)V")
	public Class5_Sub6(@OriginalArg(0) Class5_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt4579 = 0;
		this.anInt4578 = 0;
		this.anInt4581 = 0;
		this.aByte17 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class5_Sub6 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt4579 += local44.anInt4579;
				this.anInt4578 += local44.anInt4578;
				this.anInt4581 += local44.anInt4581;
				if (local44.aByteArray58 == null) {
					if (this.aByte17 == -1) {
						this.aByte17 = local44.aByte17;
					}
					if (this.aByte17 != local44.aByte17) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray52 != null;
				local19 |= local44.aByteArray59 != null;
				local21 |= local44.anIntArray347 != null;
				local23 |= local44.aShortArray47 != null;
				local25 |= local44.aByteArray51 != null;
			}
		}
		this.anIntArray355 = new int[this.anInt4579];
		this.anIntArray350 = new int[this.anInt4579];
		this.anIntArray348 = new int[this.anInt4579];
		this.anIntArray346 = new int[this.anInt4579];
		this.anIntArray353 = new int[this.anInt4578];
		this.anIntArray349 = new int[this.anInt4578];
		this.anIntArray354 = new int[this.anInt4578];
		if (local15) {
			this.aByteArray52 = new byte[this.anInt4578];
		}
		if (local17) {
			this.aByteArray58 = new byte[this.anInt4578];
		}
		if (local19) {
			this.aByteArray59 = new byte[this.anInt4578];
		}
		if (local21) {
			this.anIntArray347 = new int[this.anInt4578];
		}
		if (local23) {
			this.aShortArray47 = new short[this.anInt4578];
		}
		if (local25) {
			this.aByteArray51 = new byte[this.anInt4578];
		}
		this.aShortArray50 = new short[this.anInt4578];
		if (this.anInt4581 > 0) {
			this.aByteArray56 = new byte[this.anInt4581];
			this.aShortArray48 = new short[this.anInt4581];
			this.aShortArray53 = new short[this.anInt4581];
			this.aShortArray54 = new short[this.anInt4581];
			this.aShortArray49 = new short[this.anInt4581];
			this.aShortArray51 = new short[this.anInt4581];
			this.aShortArray52 = new short[this.anInt4581];
			this.aByteArray55 = new byte[this.anInt4581];
			this.aByteArray54 = new byte[this.anInt4581];
			this.aByteArray53 = new byte[this.anInt4581];
			this.aByteArray50 = new byte[this.anInt4581];
			this.aByteArray57 = new byte[this.anInt4581];
		}
		this.anInt4579 = 0;
		this.anInt4578 = 0;
		this.anInt4581 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class5_Sub6 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt4578; local302++) {
					if (local15 && local298.aByteArray52 != null) {
						this.aByteArray52[this.anInt4578] = local298.aByteArray52[local302];
					}
					if (local17) {
						if (local298.aByteArray58 == null) {
							this.aByteArray58[this.anInt4578] = local298.aByte17;
						} else {
							this.aByteArray58[this.anInt4578] = local298.aByteArray58[local302];
						}
					}
					if (local19 && local298.aByteArray59 != null) {
						this.aByteArray59[this.anInt4578] = local298.aByteArray59[local302];
					}
					if (local21 && local298.anIntArray347 != null) {
						this.anIntArray347[this.anInt4578] = local298.anIntArray347[local302];
					}
					if (local23) {
						if (local298.aShortArray47 == null) {
							this.aShortArray47[this.anInt4578] = -1;
						} else {
							this.aShortArray47[this.anInt4578] = local298.aShortArray47[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray51 == null || local298.aByteArray51[local302] == -1) {
							this.aByteArray51[this.anInt4578] = -1;
						} else {
							this.aByteArray51[this.anInt4578] = (byte) (local298.aByteArray51[local302] + this.anInt4581);
						}
					}
					this.aShortArray50[this.anInt4578] = local298.aShortArray50[local302];
					this.anIntArray353[this.anInt4578] = this.method3574(local298, local298.anIntArray353[local302]);
					this.anIntArray349[this.anInt4578] = this.method3574(local298, local298.anIntArray349[local302]);
					this.anIntArray354[this.anInt4578] = this.method3574(local298, local298.anIntArray354[local302]);
					this.anInt4578++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt4581; local477++) {
					@Pc(489) byte local489 = this.aByteArray56[this.anInt4581] = local298.aByteArray56[local477];
					if (local489 == 0) {
						this.aShortArray48[this.anInt4581] = (short) this.method3574(local298, local298.aShortArray48[local477]);
						this.aShortArray53[this.anInt4581] = (short) this.method3574(local298, local298.aShortArray53[local477]);
						this.aShortArray54[this.anInt4581] = (short) this.method3574(local298, local298.aShortArray54[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray48[this.anInt4581] = local298.aShortArray48[local477];
						this.aShortArray53[this.anInt4581] = local298.aShortArray53[local477];
						this.aShortArray54[this.anInt4581] = local298.aShortArray54[local477];
						this.aShortArray49[this.anInt4581] = local298.aShortArray49[local477];
						this.aShortArray51[this.anInt4581] = local298.aShortArray51[local477];
						this.aShortArray52[this.anInt4581] = local298.aShortArray52[local477];
						this.aByteArray55[this.anInt4581] = local298.aByteArray55[local477];
						this.aByteArray54[this.anInt4581] = local298.aByteArray54[local477];
						this.aByteArray53[this.anInt4581] = local298.aByteArray53[local477];
					}
					if (local489 == 2) {
						this.aByteArray50[this.anInt4581] = local298.aByteArray50[local477];
						this.aByteArray57[this.anInt4581] = local298.aByteArray57[local477];
					}
					this.anInt4581++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!vd;ZZZZ)V")
	public Class5_Sub6(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4579 = arg0.anInt4579;
		this.anInt4578 = arg0.anInt4578;
		this.anInt4581 = arg0.anInt4581;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray355 = arg0.anIntArray355;
			this.anIntArray350 = arg0.anIntArray350;
			this.anIntArray348 = arg0.anIntArray348;
		} else {
			this.anIntArray355 = new int[this.anInt4579];
			this.anIntArray350 = new int[this.anInt4579];
			this.anIntArray348 = new int[this.anInt4579];
			for (local57 = 0; local57 < this.anInt4579; local57++) {
				this.anIntArray355[local57] = arg0.anIntArray355[local57];
				this.anIntArray350[local57] = arg0.anIntArray350[local57];
				this.anIntArray348[local57] = arg0.anIntArray348[local57];
			}
		}
		if (arg2) {
			this.aShortArray50 = arg0.aShortArray50;
		} else {
			this.aShortArray50 = new short[this.anInt4578];
			for (local57 = 0; local57 < this.anInt4578; local57++) {
				this.aShortArray50[local57] = arg0.aShortArray50[local57];
			}
		}
		if (arg3 || arg0.aShortArray47 == null) {
			this.aShortArray47 = arg0.aShortArray47;
		} else {
			this.aShortArray47 = new short[this.anInt4578];
			for (local57 = 0; local57 < this.anInt4578; local57++) {
				this.aShortArray47[local57] = arg0.aShortArray47[local57];
			}
		}
		this.aByteArray59 = arg0.aByteArray59;
		this.anIntArray353 = arg0.anIntArray353;
		this.anIntArray349 = arg0.anIntArray349;
		this.anIntArray354 = arg0.anIntArray354;
		this.aByteArray52 = arg0.aByteArray52;
		this.aByteArray58 = arg0.aByteArray58;
		this.aByteArray51 = arg0.aByteArray51;
		this.aByte17 = arg0.aByte17;
		this.aByteArray56 = arg0.aByteArray56;
		this.aShortArray48 = arg0.aShortArray48;
		this.aShortArray53 = arg0.aShortArray53;
		this.aShortArray54 = arg0.aShortArray54;
		this.aShortArray49 = arg0.aShortArray49;
		this.aShortArray51 = arg0.aShortArray51;
		this.aShortArray52 = arg0.aShortArray52;
		this.aByteArray55 = arg0.aByteArray55;
		this.aByteArray54 = arg0.aByteArray54;
		this.aByteArray53 = arg0.aByteArray53;
		this.aByteArray50 = arg0.aByteArray50;
		this.aByteArray57 = arg0.aByteArray57;
		this.anIntArray346 = arg0.anIntArray346;
		this.anIntArray347 = arg0.anIntArray347;
		this.anIntArrayArray38 = arg0.anIntArrayArray38;
		this.anIntArrayArray39 = arg0.anIntArrayArray39;
		this.aClass101Array2 = arg0.aClass101Array2;
		this.aClass16Array1 = arg0.aClass16Array1;
		this.aClass101Array1 = arg0.aClass101Array1;
		this.aShort29 = arg0.aShort29;
		this.aShort28 = arg0.aShort28;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(SS)V")
	public void method3564(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray47 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt4578; local5++) {
			if (this.aShortArray47[local5] == arg0) {
				this.aShortArray47[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
	public void method3565() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4579; local1++) {
			this.anIntArray355[local1] = -this.anIntArray355[local1];
			this.anIntArray348[local1] = -this.anIntArray348[local1];
		}
		this.method3570();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(SS)V")
	public void method3566(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4578; local1++) {
			if (this.aShortArray50[local1] == arg0) {
				this.aShortArray50[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public void method3567() {
		@Pc(3) int local3 = Static215.anIntArray352[256];
		@Pc(7) int local7 = Static215.anIntArray345[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4579; local9++) {
			@Pc(26) int local26 = this.anIntArray348[local9] * local3 + this.anIntArray355[local9] * local7 >> 16;
			this.anIntArray348[local9] = this.anIntArray348[local9] * local7 - this.anIntArray355[local9] * local3 >> 16;
			this.anIntArray355[local9] = local26;
		}
		this.method3570();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
	public void method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4579; local1++) {
			this.anIntArray355[local1] += arg0;
			this.anIntArray350[local1] += arg1;
			this.anIntArray348[local1] += arg2;
		}
		this.method3570();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([B)V")
	private void method3569(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub16 local4 = new Class1_Sub16(arg0);
		@Pc(9) Class1_Sub16 local9 = new Class1_Sub16(arg0);
		@Pc(14) Class1_Sub16 local14 = new Class1_Sub16(arg0);
		@Pc(19) Class1_Sub16 local19 = new Class1_Sub16(arg0);
		@Pc(24) Class1_Sub16 local24 = new Class1_Sub16(arg0);
		@Pc(29) Class1_Sub16 local29 = new Class1_Sub16(arg0);
		@Pc(34) Class1_Sub16 local34 = new Class1_Sub16(arg0);
		local4.anInt4860 = arg0.length - 23;
		@Pc(44) int local44 = local4.method3805();
		@Pc(48) int local48 = local4.method3805();
		@Pc(52) int local52 = local4.method3793();
		@Pc(56) int local56 = local4.method3793();
		@Pc(60) int local60 = local4.method3793();
		@Pc(64) int local64 = local4.method3793();
		@Pc(68) int local68 = local4.method3793();
		@Pc(72) int local72 = local4.method3793();
		@Pc(76) int local76 = local4.method3793();
		@Pc(80) int local80 = local4.method3805();
		@Pc(84) int local84 = local4.method3805();
		@Pc(88) int local88 = local4.method3805();
		@Pc(92) int local92 = local4.method3805();
		@Pc(96) int local96 = local4.method3805();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray56 = new byte[local52];
			local4.anInt4860 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray56[local113] = local4.method3802();
				if (local123 == 0) {
					local98++;
				}
				if (local123 >= 1 && local123 <= 3) {
					local100++;
				}
				if (local123 == 2) {
					local102++;
				}
			}
		}
		local113 = local52 + local44;
		@Pc(151) int local151 = local113;
		if (local56 == 1) {
			local113 += local48;
		}
		@Pc(160) int local160 = local113;
		local113 += local48;
		@Pc(166) int local166 = local113;
		if (local60 == 255) {
			local113 += local48;
		}
		@Pc(175) int local175 = local113;
		if (local68 == 1) {
			local113 += local48;
		}
		@Pc(184) int local184 = local113;
		if (local76 == 1) {
			local113 += local44;
		}
		@Pc(193) int local193 = local113;
		if (local64 == 1) {
			local113 += local48;
		}
		@Pc(202) int local202 = local113;
		local113 += local92;
		@Pc(208) int local208 = local113;
		if (local72 == 1) {
			local113 += local48 * 2;
		}
		@Pc(219) int local219 = local113;
		local113 += local96;
		@Pc(225) int local225 = local113;
		local113 += local48 * 2;
		@Pc(233) int local233 = local113;
		local113 += local80;
		@Pc(239) int local239 = local113;
		local113 += local84;
		@Pc(245) int local245 = local113;
		local113 += local88;
		@Pc(251) int local251 = local113;
		local113 += local98 * 6;
		@Pc(259) int local259 = local113;
		local113 += local100 * 6;
		@Pc(267) int local267 = local113;
		local113 += local100 * 6;
		@Pc(275) int local275 = local113;
		local113 += local100;
		@Pc(281) int local281 = local113;
		local113 += local100;
		this.anInt4579 = local44;
		this.anInt4578 = local48;
		this.anInt4581 = local52;
		this.anIntArray355 = new int[local44];
		this.anIntArray350 = new int[local44];
		this.anIntArray348 = new int[local44];
		this.anIntArray353 = new int[local48];
		this.anIntArray349 = new int[local48];
		this.anIntArray354 = new int[local48];
		if (local76 == 1) {
			this.anIntArray346 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray52 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray58 = new byte[local48];
		} else {
			this.aByte17 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray59 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray347 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray47 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray51 = new byte[local48];
		}
		this.aShortArray50 = new short[local48];
		if (local52 > 0) {
			this.aShortArray48 = new short[local52];
			this.aShortArray53 = new short[local52];
			this.aShortArray54 = new short[local52];
			if (local100 > 0) {
				this.aShortArray49 = new short[local100];
				this.aShortArray51 = new short[local100];
				this.aShortArray52 = new short[local100];
				this.aByteArray55 = new byte[local100];
				this.aByteArray54 = new byte[local100];
				this.aByteArray53 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray50 = new byte[local102];
				this.aByteArray57 = new byte[local102];
			}
		}
		local4.anInt4860 = local52;
		local9.anInt4860 = local233;
		local14.anInt4860 = local239;
		local19.anInt4860 = local245;
		local24.anInt4860 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method3793();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method3788();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method3788();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method3788();
			}
			this.anIntArray355[local461] = local455 + local468;
			this.anIntArray350[local461] = local457 + local478;
			this.anIntArray348[local461] = local459 + local488;
			local455 = this.anIntArray355[local461];
			local457 = this.anIntArray350[local461];
			local459 = this.anIntArray348[local461];
			if (local76 == 1) {
				this.anIntArray346[local461] = local24.method3793();
			}
		}
		local4.anInt4860 = local225;
		local9.anInt4860 = local151;
		local14.anInt4860 = local166;
		local19.anInt4860 = local193;
		local24.anInt4860 = local175;
		local29.anInt4860 = local208;
		local34.anInt4860 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray50[local466] = (short) local4.method3805();
			if (local56 == 1) {
				this.aByteArray52[local466] = local9.method3802();
			}
			if (local60 == 255) {
				this.aByteArray58[local466] = local14.method3802();
			}
			if (local64 == 1) {
				this.aByteArray59[local466] = local19.method3802();
			}
			if (local68 == 1) {
				this.anIntArray347[local466] = local24.method3793();
			}
			if (local72 == 1) {
				this.aShortArray47[local466] = (short) (local29.method3805() - 1);
			}
			if (this.aByteArray51 != null) {
				if (this.aShortArray47[local466] == -1) {
					this.aByteArray51[local466] = -1;
				} else {
					this.aByteArray51[local466] = (byte) (local34.method3793() - 1);
				}
			}
		}
		local4.anInt4860 = local202;
		local9.anInt4860 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method3793();
			if (local681 == 1) {
				local468 = local4.method3788() + local674;
				local478 = local4.method3788() + local468;
				local488 = local4.method3788() + local478;
				local674 = local488;
				this.anIntArray353[local676] = local468;
				this.anIntArray349[local676] = local478;
				this.anIntArray354[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method3788() + local674;
				local674 = local488;
				this.anIntArray353[local676] = local468;
				this.anIntArray349[local676] = local478;
				this.anIntArray354[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method3788() + local674;
				local674 = local488;
				this.anIntArray353[local676] = local468;
				this.anIntArray349[local676] = local478;
				this.anIntArray354[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method3788() + local674;
				local674 = local488;
				this.anIntArray353[local676] = local468;
				this.anIntArray349[local676] = local784;
				this.anIntArray354[local676] = local488;
			}
		}
		local4.anInt4860 = local251;
		local9.anInt4860 = local259;
		local14.anInt4860 = local267;
		local19.anInt4860 = local275;
		local24.anInt4860 = local281;
		local29.anInt4860 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray56[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray48[local681] = (short) local4.method3805();
				this.aShortArray53[local681] = (short) local4.method3805();
				this.aShortArray54[local681] = (short) local4.method3805();
			}
			if (local784 == 1) {
				this.aShortArray48[local681] = (short) local9.method3805();
				this.aShortArray53[local681] = (short) local9.method3805();
				this.aShortArray54[local681] = (short) local9.method3805();
				this.aShortArray49[local681] = (short) local14.method3805();
				this.aShortArray51[local681] = (short) local14.method3805();
				this.aShortArray52[local681] = (short) local14.method3805();
				this.aByteArray55[local681] = local19.method3802();
				this.aByteArray54[local681] = local24.method3802();
				this.aByteArray53[local681] = local29.method3802();
			}
			if (local784 == 2) {
				this.aShortArray48[local681] = (short) local9.method3805();
				this.aShortArray53[local681] = (short) local9.method3805();
				this.aShortArray54[local681] = (short) local9.method3805();
				this.aShortArray49[local681] = (short) local14.method3805();
				this.aShortArray51[local681] = (short) local14.method3805();
				this.aShortArray52[local681] = (short) local14.method3805();
				this.aByteArray55[local681] = local19.method3802();
				this.aByteArray54[local681] = local24.method3802();
				this.aByteArray53[local681] = local29.method3802();
				this.aByteArray50[local681] = local29.method3802();
				this.aByteArray57[local681] = local29.method3802();
			}
			if (local784 == 3) {
				this.aShortArray48[local681] = (short) local9.method3805();
				this.aShortArray53[local681] = (short) local9.method3805();
				this.aShortArray54[local681] = (short) local9.method3805();
				this.aShortArray49[local681] = (short) local14.method3805();
				this.aShortArray51[local681] = (short) local14.method3805();
				this.aShortArray52[local681] = (short) local14.method3805();
				this.aByteArray55[local681] = local19.method3802();
				this.aByteArray54[local681] = local24.method3802();
				this.aByteArray53[local681] = local29.method3802();
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()Z")
	@Override
	public boolean method3681() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()V")
	private void method3570() {
		this.aClass101Array2 = null;
		this.aClass101Array1 = null;
		this.aClass16Array1 = null;
		this.aBoolean208 = false;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "()V")
	public void method3573() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4579; local1++) {
			@Pc(7) int local7 = this.anIntArray355[local1];
			this.anIntArray355[local1] = this.anIntArray348[local1];
			this.anIntArray348[local1] = -local7;
		}
		this.method3570();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vd;I)I")
	private int method3574(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray355[arg1];
		@Pc(11) int local11 = arg0.anIntArray350[arg1];
		@Pc(16) int local16 = arg0.anIntArray348[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4579; local18++) {
			if (local6 == this.anIntArray355[local18] && local11 == this.anIntArray350[local18] && local16 == this.anIntArray348[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray355[this.anInt4579] = local6;
			this.anIntArray350[this.anInt4579] = local11;
			this.anIntArray348[this.anInt4579] = local16;
			if (arg0.anIntArray346 != null) {
				this.anIntArray346[this.anInt4579] = arg0.anIntArray346[arg1];
			}
			local1 = this.anInt4579++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	private void method3575(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static215.anIntArray352[arg0];
		@Pc(7) int local7 = Static215.anIntArray345[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4579; local9++) {
			@Pc(26) int local26 = this.anIntArray350[local9] * local3 + this.anIntArray355[local9] * local7 >> 16;
			this.anIntArray350[local9] = this.anIntArray350[local9] * local7 - this.anIntArray355[local9] * local3 >> 16;
			this.anIntArray355[local9] = local26;
		}
		this.method3570();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!vd;")
	public Class5_Sub6 method3576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3587();
		@Pc(6) int local6 = arg4 + this.aShort24;
		@Pc(11) int local11 = arg4 + this.aShort23;
		@Pc(16) int local16 = arg6 + this.aShort26;
		@Pc(21) int local21 = arg6 + this.aShort25;
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
		@Pc(147) Class5_Sub6 local147 = new Class5_Sub6();
		local147.anInt4579 = this.anInt4579;
		local147.anInt4578 = this.anInt4578;
		local147.anInt4581 = this.anInt4581;
		local147.anIntArray353 = this.anIntArray353;
		local147.anIntArray349 = this.anIntArray349;
		local147.anIntArray354 = this.anIntArray354;
		local147.aByteArray52 = this.aByteArray52;
		local147.aByteArray58 = this.aByteArray58;
		local147.aByteArray59 = this.aByteArray59;
		local147.aByteArray51 = this.aByteArray51;
		local147.aShortArray50 = this.aShortArray50;
		local147.aShortArray47 = this.aShortArray47;
		local147.aByte17 = this.aByte17;
		local147.aByteArray56 = this.aByteArray56;
		local147.aShortArray48 = this.aShortArray48;
		local147.aShortArray53 = this.aShortArray53;
		local147.aShortArray54 = this.aShortArray54;
		local147.aShortArray49 = this.aShortArray49;
		local147.aShortArray51 = this.aShortArray51;
		local147.aShortArray52 = this.aShortArray52;
		local147.aByteArray55 = this.aByteArray55;
		local147.aByteArray54 = this.aByteArray54;
		local147.aByteArray53 = this.aByteArray53;
		local147.aByteArray50 = this.aByteArray50;
		local147.aByteArray57 = this.aByteArray57;
		local147.anIntArray346 = this.anIntArray346;
		local147.anIntArray347 = this.anIntArray347;
		local147.anIntArrayArray38 = this.anIntArrayArray38;
		local147.anIntArrayArray39 = this.anIntArrayArray39;
		local147.aShort29 = this.aShort29;
		local147.aShort28 = this.aShort28;
		local147.aClass101Array2 = this.aClass101Array2;
		local147.aClass16Array1 = this.aClass16Array1;
		local147.aClass101Array1 = this.aClass101Array1;
		if (arg0 == 3) {
			local147.anIntArray355 = Static212.method3505(this.anIntArray355);
			local147.anIntArray350 = Static212.method3505(this.anIntArray350);
			local147.anIntArray348 = Static212.method3505(this.anIntArray348);
		} else {
			local147.anIntArray355 = this.anIntArray355;
			local147.anIntArray350 = new int[local147.anInt4579];
			local147.anIntArray348 = this.anIntArray348;
		}
		@Pc(326) int local326;
		@Pc(334) int local334;
		@Pc(341) int local341;
		@Pc(345) int local345;
		@Pc(349) int local349;
		@Pc(353) int local353;
		@Pc(357) int local357;
		@Pc(379) int local379;
		@Pc(405) int local405;
		@Pc(417) int local417;
		if (arg0 == 1) {
			for (local326 = 0; local326 < local147.anInt4579; local326++) {
				local334 = this.anIntArray355[local326] + arg4;
				local341 = this.anIntArray348[local326] + arg6;
				local345 = local334 & 0x7F;
				local349 = local341 & 0x7F;
				local353 = local334 >> 7;
				local357 = local341 >> 7;
				local379 = arg2[local353][local357] * (128 - local345) + arg2[local353 + 1][local357] * local345 >> 7;
				local405 = arg2[local353][local357 + 1] * (128 - local345) + arg2[local353 + 1][local357 + 1] * local345 >> 7;
				local417 = local379 * (128 - local349) + local405 * local349 >> 7;
				local147.anIntArray350[local326] = this.anIntArray350[local326] + local417 - arg5;
			}
		} else {
			@Pc(544) int local544;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.anInt4579; local326++) {
					local334 = (this.anIntArray350[local326] << 16) / this.aShort27;
					if (local334 < arg1) {
						local341 = this.anIntArray355[local326] + arg4;
						local345 = this.anIntArray348[local326] + arg6;
						local349 = local341 & 0x7F;
						local353 = local345 & 0x7F;
						local357 = local341 >> 7;
						local379 = local345 >> 7;
						local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
						local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
						local544 = local405 * (128 - local353) + local417 * local353 >> 7;
						local147.anIntArray350[local326] = this.anIntArray350[local326] + (local544 - arg5) * (arg1 - local334) / arg1;
					} else {
						local147.anIntArray350[local326] = this.anIntArray350[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local334 = (arg1 >> 8 & 0xFF) * 4;
				this.method3585(arg2, arg4, arg5, arg6, local326, local334);
			} else if (arg0 == 4) {
				local326 = this.aShort30 - this.aShort27;
				for (local334 = 0; local334 < this.anInt4579; local334++) {
					local341 = this.anIntArray355[local334] + arg4;
					local345 = this.anIntArray348[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local147.anIntArray350[local334] = this.anIntArray350[local334] + local544 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort30 - this.aShort27;
				for (local334 = 0; local334 < this.anInt4579; local334++) {
					local341 = this.anIntArray355[local334] + arg4;
					local345 = this.anIntArray348[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
					local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					@Pc(887) int local887 = local405 * (128 - local353) + local417 * local353 >> 7;
					@Pc(891) int local891 = local544 - local887;
					local147.anIntArray350[local334] = ((this.anIntArray350[local334] << 8) / local326 * local891 >> 8) - (arg5 - local544);
				}
			}
		}
		this.aBoolean208 = false;
		return local147;
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "()V")
	public void method3577() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4579; local1++) {
			this.anIntArray348[local1] = -this.anIntArray348[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt4578; local18++) {
			@Pc(24) int local24 = this.anIntArray353[local18];
			this.anIntArray353[local18] = this.anIntArray354[local18];
			this.anIntArray354[local18] = local24;
		}
		this.method3570();
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "()V")
	public void method3578() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray346 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt4579; local9++) {
				local15 = this.anIntArray346[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray38 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray38[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt4579) {
				local65 = this.anIntArray346[local59];
				this.anIntArrayArray38[local65][local5[local65]++] = local59++;
			}
			this.anIntArray346 = null;
		}
		if (this.anIntArray347 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt4578; local9++) {
			local15 = this.anIntArray347[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray39 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray39[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt4578) {
			local65 = this.anIntArray347[local59];
			this.anIntArrayArray39[local65][local5[local65]++] = local59++;
		}
		this.anIntArray347 = null;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(III)I")
	public int method3579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4579; local1++) {
			if (this.anIntArray355[local1] == arg0 && this.anIntArray350[local1] == 0 && this.anIntArray348[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray355[this.anInt4579] = arg0;
		this.anIntArray350[this.anInt4579] = 0;
		this.anIntArray348[this.anInt4579] = arg1;
		return this.anInt4579++;
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "()V")
	public void method3580() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4579; local1++) {
			@Pc(7) int local7 = this.anIntArray348[local1];
			this.anIntArray348[local1] = this.anIntArray355[local1];
			this.anIntArray355[local1] = -local7;
		}
		this.method3570();
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "()V")
	public void method3581() {
		this.anIntArray346 = null;
		this.anIntArray347 = null;
		this.anIntArrayArray38 = null;
		this.anIntArrayArray39 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)Lclient!ei;")
	public Class5_Sub2 method3582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class5_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "()V")
	public void method3583() {
		if (this.aClass101Array2 != null) {
			return;
		}
		this.aClass101Array2 = new Class101[this.anInt4579];
		for (@Pc(10) int local10 = 0; local10 < this.anInt4579; local10++) {
			this.aClass101Array2[local10] = new Class101();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4578; local25++) {
			@Pc(31) int local31 = this.anIntArray353[local25];
			@Pc(36) int local36 = this.anIntArray349[local25];
			@Pc(41) int local41 = this.anIntArray354[local25];
			@Pc(51) int local51 = this.anIntArray355[local36] - this.anIntArray355[local31];
			@Pc(61) int local61 = this.anIntArray350[local36] - this.anIntArray350[local31];
			@Pc(71) int local71 = this.anIntArray348[local36] - this.anIntArray348[local31];
			@Pc(81) int local81 = this.anIntArray355[local41] - this.anIntArray355[local31];
			@Pc(91) int local91 = this.anIntArray350[local41] - this.anIntArray350[local31];
			@Pc(101) int local101 = this.anIntArray348[local41] - this.anIntArray348[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray52 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray52[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class101 local211 = this.aClass101Array2[local31];
				local211.anInt3937 += local109;
				local211.anInt3933 += local117;
				local211.anInt3941 += local125;
				local211.anInt3934++;
				@Pc(240) Class101 local240 = this.aClass101Array2[local36];
				local240.anInt3937 += local109;
				local240.anInt3933 += local117;
				local240.anInt3941 += local125;
				local240.anInt3934++;
				@Pc(269) Class101 local269 = this.aClass101Array2[local41];
				local269.anInt3937 += local109;
				local269.anInt3933 += local117;
				local269.anInt3941 += local125;
				local269.anInt3934++;
			} else if (local198 == 1) {
				if (this.aClass16Array1 == null) {
					this.aClass16Array1 = new Class16[this.anInt4578];
				}
				@Pc(314) Class16 local314 = this.aClass16Array1[local25] = new Class16();
				local314.anInt585 = local109;
				local314.anInt586 = local117;
				local314.anInt588 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(III)V")
	public void method3584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg2 != 0) {
			local5 = Static215.anIntArray352[arg2];
			local9 = Static215.anIntArray345[arg2];
			for (local11 = 0; local11 < this.anInt4579; local11++) {
				local28 = this.anIntArray350[local11] * local5 + this.anIntArray355[local11] * local9 >> 16;
				this.anIntArray350[local11] = this.anIntArray350[local11] * local9 - this.anIntArray355[local11] * local5 >> 16;
				this.anIntArray355[local11] = local28;
			}
		}
		if (arg0 != 0) {
			local5 = Static215.anIntArray352[arg0];
			local9 = Static215.anIntArray345[arg0];
			for (local11 = 0; local11 < this.anInt4579; local11++) {
				local28 = this.anIntArray350[local11] * local9 - this.anIntArray348[local11] * local5 >> 16;
				this.anIntArray348[local11] = this.anIntArray350[local11] * local5 + this.anIntArray348[local11] * local9 >> 16;
				this.anIntArray350[local11] = local28;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static215.anIntArray352[arg1];
		local9 = Static215.anIntArray345[arg1];
		for (local11 = 0; local11 < this.anInt4579; local11++) {
			local28 = this.anIntArray348[local11] * local5 + this.anIntArray355[local11] * local9 >> 16;
			this.anIntArray348[local11] = this.anIntArray348[local11] * local9 - this.anIntArray355[local11] * local5 >> 16;
			this.anIntArray355[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([[IIIIII)V")
	private void method3585(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static215.method3592(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static215.method3592(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static215.method3592(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static215.method3592(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method3591(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method3575(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method3568(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()I")
	@Override
	public int method3680() {
		if (!this.aBoolean208) {
			this.method3587();
		}
		return this.aShort27;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "([B)V")
	private void method3586(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(arg0);
		@Pc(13) Class1_Sub16 local13 = new Class1_Sub16(arg0);
		@Pc(18) Class1_Sub16 local18 = new Class1_Sub16(arg0);
		@Pc(23) Class1_Sub16 local23 = new Class1_Sub16(arg0);
		@Pc(28) Class1_Sub16 local28 = new Class1_Sub16(arg0);
		local8.anInt4860 = arg0.length - 18;
		@Pc(38) int local38 = local8.method3805();
		@Pc(42) int local42 = local8.method3805();
		@Pc(46) int local46 = local8.method3793();
		@Pc(50) int local50 = local8.method3793();
		@Pc(54) int local54 = local8.method3793();
		@Pc(58) int local58 = local8.method3793();
		@Pc(62) int local62 = local8.method3793();
		@Pc(66) int local66 = local8.method3793();
		@Pc(70) int local70 = local8.method3805();
		@Pc(74) int local74 = local8.method3805();
		@Pc(78) int local78 = local8.method3805();
		@Pc(82) int local82 = local8.method3805();
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
		this.anInt4579 = local38;
		this.anInt4578 = local42;
		this.anInt4581 = local46;
		this.anIntArray355 = new int[local38];
		this.anIntArray350 = new int[local38];
		this.anIntArray348 = new int[local38];
		this.anIntArray353 = new int[local42];
		this.anIntArray349 = new int[local42];
		this.anIntArray354 = new int[local42];
		if (local46 > 0) {
			this.aByteArray56 = new byte[local46];
			this.aShortArray48 = new short[local46];
			this.aShortArray53 = new short[local46];
			this.aShortArray54 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray346 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray52 = new byte[local42];
			this.aByteArray51 = new byte[local42];
			this.aShortArray47 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray58 = new byte[local42];
		} else {
			this.aByte17 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray59 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray347 = new int[local42];
		}
		this.aShortArray50 = new short[local42];
		local8.anInt4860 = 0;
		local13.anInt4860 = local165;
		local18.anInt4860 = local171;
		local23.anInt4860 = local90;
		local28.anInt4860 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method3793();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method3788();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method3788();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method3788();
			}
			this.anIntArray355[local307] = local301 + local314;
			this.anIntArray350[local307] = local303 + local324;
			this.anIntArray348[local307] = local305 + local334;
			local301 = this.anIntArray355[local307];
			local303 = this.anIntArray350[local307];
			local305 = this.anIntArray348[local307];
			if (local66 == 1) {
				this.anIntArray346[local307] = local28.method3793();
			}
		}
		local8.anInt4860 = local149;
		local13.anInt4860 = local116;
		local18.anInt4860 = local98;
		local23.anInt4860 = local134;
		local28.anInt4860 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray50[local312] = (short) local8.method3805();
			if (local50 == 1) {
				local314 = local13.method3793();
				if ((local314 & 0x1) == 1) {
					this.aByteArray52[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray52[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray51[local312] = (byte) (local314 >> 2);
					this.aShortArray47[local312] = this.aShortArray50[local312];
					this.aShortArray50[local312] = 127;
					if (this.aShortArray47[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray51[local312] = -1;
					this.aShortArray47[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray58[local312] = local18.method3802();
			}
			if (local58 == 1) {
				this.aByteArray59[local312] = local23.method3802();
			}
			if (local62 == 1) {
				this.anIntArray347[local312] = local28.method3793();
			}
		}
		local8.anInt4860 = local143;
		local13.anInt4860 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method3793();
			if (local543 == 1) {
				local314 = local8.method3788() + local536;
				local324 = local8.method3788() + local314;
				local334 = local8.method3788() + local324;
				local536 = local334;
				this.anIntArray353[local538] = local314;
				this.anIntArray349[local538] = local324;
				this.anIntArray354[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method3788() + local536;
				local536 = local334;
				this.anIntArray353[local538] = local314;
				this.anIntArray349[local538] = local324;
				this.anIntArray354[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method3788() + local536;
				local536 = local334;
				this.anIntArray353[local538] = local314;
				this.anIntArray349[local538] = local324;
				this.anIntArray354[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method3788() + local536;
				local536 = local334;
				this.anIntArray353[local538] = local314;
				this.anIntArray349[local538] = local646;
				this.anIntArray354[local538] = local334;
			}
		}
		local8.anInt4860 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray56[local543] = 0;
			this.aShortArray48[local543] = (short) local8.method3805();
			this.aShortArray53[local543] = (short) local8.method3805();
			this.aShortArray54[local543] = (short) local8.method3805();
		}
		if (this.aByteArray51 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray51[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray48[local731] & 0xFFFF) == this.anIntArray353[local723] && (this.aShortArray53[local731] & 0xFFFF) == this.anIntArray349[local723] && (this.aShortArray54[local731] & 0xFFFF) == this.anIntArray354[local723]) {
						this.aByteArray51[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray51 = null;
			}
		}
		if (!local3) {
			this.aShortArray47 = null;
		}
		if (!local1) {
			this.aByteArray52 = null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Lclient!ij;")
	@Override
	public Class5 method3682() {
		return this.method3582(this.aShort29, this.aShort28, -50, -10, -50);
	}

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "()V")
	private void method3587() {
		if (this.aBoolean208) {
			return;
		}
		this.aBoolean208 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt4579; local20++) {
			@Pc(26) int local26 = this.anIntArray355[local20];
			@Pc(31) int local31 = this.anIntArray350[local20];
			@Pc(36) int local36 = this.anIntArray348[local20];
			if (local26 < local8) {
				local8 = local26;
			}
			if (local26 > local14) {
				local14 = local26;
			}
			if (local31 < local10) {
				local10 = local31;
			}
			if (local31 > local16) {
				local16 = local31;
			}
			if (local36 < local12) {
				local12 = local36;
			}
			if (local36 > local18) {
				local18 = local36;
			}
		}
		this.aShort24 = (short) local8;
		this.aShort23 = (short) local14;
		this.aShort27 = (short) local10;
		this.aShort30 = (short) local16;
		this.aShort26 = (short) local12;
		this.aShort25 = (short) local18;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)Lclient!ra;")
	public Class5_Sub2_Sub1 method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class5_Sub2_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIBSB)I")
	public int method3589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray353[this.anInt4578] = arg0;
		this.anIntArray349[this.anInt4578] = arg1;
		this.anIntArray354[this.anInt4578] = arg2;
		this.aByteArray52[this.anInt4578] = 1;
		this.aByteArray51[this.anInt4578] = -1;
		this.aShortArray50[this.anInt4578] = arg3;
		this.aShortArray47[this.anInt4578] = -1;
		this.aByteArray59[this.anInt4578] = arg4;
		return this.anInt4578++;
	}

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "()Lclient!vd;")
	public Class5_Sub6 method3590() {
		@Pc(3) Class5_Sub6 local3 = new Class5_Sub6();
		if (this.aByteArray52 != null) {
			local3.aByteArray52 = new byte[this.anInt4578];
			for (@Pc(13) int local13 = 0; local13 < this.anInt4578; local13++) {
				local3.aByteArray52[local13] = this.aByteArray52[local13];
			}
		}
		local3.anInt4579 = this.anInt4579;
		local3.anInt4578 = this.anInt4578;
		local3.anInt4581 = this.anInt4581;
		local3.anIntArray355 = this.anIntArray355;
		local3.anIntArray350 = this.anIntArray350;
		local3.anIntArray348 = this.anIntArray348;
		local3.anIntArray353 = this.anIntArray353;
		local3.anIntArray349 = this.anIntArray349;
		local3.anIntArray354 = this.anIntArray354;
		local3.aByteArray58 = this.aByteArray58;
		local3.aByteArray59 = this.aByteArray59;
		local3.aByteArray51 = this.aByteArray51;
		local3.aShortArray50 = this.aShortArray50;
		local3.aShortArray47 = this.aShortArray47;
		local3.aByte17 = this.aByte17;
		local3.aByteArray56 = this.aByteArray56;
		local3.aShortArray48 = this.aShortArray48;
		local3.aShortArray53 = this.aShortArray53;
		local3.aShortArray54 = this.aShortArray54;
		local3.aShortArray49 = this.aShortArray49;
		local3.aShortArray51 = this.aShortArray51;
		local3.aShortArray52 = this.aShortArray52;
		local3.aByteArray55 = this.aByteArray55;
		local3.aByteArray54 = this.aByteArray54;
		local3.aByteArray53 = this.aByteArray53;
		local3.aByteArray50 = this.aByteArray50;
		local3.aByteArray57 = this.aByteArray57;
		local3.anIntArray346 = this.anIntArray346;
		local3.anIntArray347 = this.anIntArray347;
		local3.anIntArrayArray38 = this.anIntArrayArray38;
		local3.anIntArrayArray39 = this.anIntArrayArray39;
		local3.aClass101Array2 = this.aClass101Array2;
		local3.aClass16Array1 = this.aClass16Array1;
		local3.aShort29 = this.aShort29;
		local3.aShort28 = this.aShort28;
		return local3;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	private void method3591(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static215.anIntArray352[arg0];
		@Pc(7) int local7 = Static215.anIntArray345[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4579; local9++) {
			@Pc(26) int local26 = this.anIntArray350[local9] * local7 - this.anIntArray348[local9] * local3 >> 16;
			this.anIntArray348[local9] = this.anIntArray350[local9] * local3 + this.anIntArray348[local9] * local7 >> 16;
			this.anIntArray350[local9] = local26;
		}
		this.method3570();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ij;IIIZ)V")
	@Override
	public void method3678(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class5_Sub6 local2 = (Class5_Sub6) arg0;
		local2.method3587();
		local2.method3583();
		Static215.anInt4580++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray355;
		@Pc(18) int local18 = local2.anInt4579;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt4579; local20++) {
			@Pc(26) Class101 local26 = this.aClass101Array2[local20];
			if (local26.anInt3934 != 0) {
				local36 = this.anIntArray350[local20] - arg2;
				if (local36 >= local2.aShort27 && local36 <= local2.aShort30) {
					@Pc(52) int local52 = this.anIntArray355[local20] - arg1;
					if (local52 >= local2.aShort24 && local52 <= local2.aShort23) {
						@Pc(68) int local68 = this.anIntArray348[local20] - arg3;
						if (local68 >= local2.aShort26 && local68 <= local2.aShort25) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class101 local85 = local2.aClass101Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray348[local79] && local36 == local2.anIntArray350[local79] && local85.anInt3934 != 0) {
									if (this.aClass101Array1 == null) {
										this.aClass101Array1 = new Class101[this.anInt4579];
									}
									if (local2.aClass101Array1 == null) {
										local2.aClass101Array1 = new Class101[local18];
									}
									@Pc(125) Class101 local125 = this.aClass101Array1[local20];
									if (local125 == null) {
										local125 = this.aClass101Array1[local20] = new Class101(local26);
									}
									@Pc(142) Class101 local142 = local2.aClass101Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass101Array1[local79] = new Class101(local85);
									}
									local125.anInt3937 += local85.anInt3937;
									local125.anInt3933 += local85.anInt3933;
									local125.anInt3941 += local85.anInt3941;
									local125.anInt3934 += local85.anInt3934;
									local142.anInt3937 += local26.anInt3937;
									local142.anInt3933 += local26.anInt3933;
									local142.anInt3941 += local26.anInt3941;
									local142.anInt3934 += local26.anInt3934;
									local12++;
									Static215.anIntArray356[local20] = Static215.anInt4580;
									Static215.anIntArray351[local79] = Static215.anInt4580;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt4578; local236++) {
			if (Static215.anIntArray356[this.anIntArray353[local236]] == Static215.anInt4580 && Static215.anIntArray356[this.anIntArray349[local236]] == Static215.anInt4580 && Static215.anIntArray356[this.anIntArray354[local236]] == Static215.anInt4580) {
				if (this.aByteArray52 == null) {
					this.aByteArray52 = new byte[this.anInt4578];
				}
				this.aByteArray52[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt4578; local36++) {
			if (Static215.anIntArray351[local2.anIntArray353[local36]] == Static215.anInt4580 && Static215.anIntArray351[local2.anIntArray349[local36]] == Static215.anInt4580 && Static215.anIntArray351[local2.anIntArray354[local36]] == Static215.anInt4580) {
				if (local2.aByteArray52 == null) {
					local2.aByteArray52 = new byte[local2.anInt4578];
				}
				local2.aByteArray52[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(III)V")
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4579; local1++) {
			this.anIntArray355[local1] = this.anIntArray355[local1] * arg0 / 128;
			this.anIntArray350[local1] = this.anIntArray350[local1] * arg1 / 128;
			this.anIntArray348[local1] = this.anIntArray348[local1] * arg2 / 128;
		}
		this.method3570();
	}
}
