import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class53_Sub3 extends Class53 {

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
	public int anInt3352;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "[Lclient!sk;")
	public Class161[] aClass161Array1;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "[Lclient!ci;")
	public Class31[] aClass31Array1;

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "[Lclient!mj;")
	public Class122[] aClass122Array1;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "[Lclient!u;")
	public Class170[] aClass170Array1;

	@OriginalMember(owner = "client!ml", name = "Y", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!ml", name = "ab", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!ml", name = "bb", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!ml", name = "cb", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!ml", name = "db", descriptor = "[Lclient!ci;")
	public Class31[] aClass31Array2;

	@OriginalMember(owner = "client!ml", name = "eb", descriptor = "S")
	public short aShort33;

	@OriginalMember(owner = "client!ml", name = "fb", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!ml", name = "hb", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!ml", name = "ib", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!ml", name = "kb", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!ml", name = "lb", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!ml", name = "mb", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!ml", name = "nb", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
	public int anInt3353 = 0;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ml", name = "gb", descriptor = "I")
	public int anInt3356 = 0;

	@OriginalMember(owner = "client!ml", name = "jb", descriptor = "B")
	public byte aByte11 = 0;

	@OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
	public int anInt3355 = 0;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	private Class53_Sub3() {
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([B)V")
	public Class53_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2768(arg0);
		} else {
			this.method2764(arg0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(III)V")
	public Class53_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray329 = new int[arg0];
		this.anIntArray324 = new int[arg0];
		this.anIntArray326 = new int[arg0];
		this.anIntArray323 = new int[arg0];
		this.anIntArray331 = new int[arg1];
		this.anIntArray330 = new int[arg1];
		this.anIntArray332 = new int[arg1];
		this.aByteArray40 = new byte[arg1];
		this.aByteArray37 = new byte[arg1];
		this.aByteArray33 = new byte[arg1];
		this.aShortArray53 = new short[arg1];
		this.aShortArray51 = new short[arg1];
		this.aByteArray35 = new byte[arg1];
		this.anIntArray325 = new int[arg1];
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([Lclient!ml;I)V")
	public Class53_Sub3(@OriginalArg(0) Class53_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt3356 = 0;
		this.anInt3353 = 0;
		this.anInt3352 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		this.aByte11 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class53_Sub3 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt3356 += local53.anInt3356;
				this.anInt3353 += local53.anInt3353;
				this.anInt3352 += local53.anInt3352;
				if (local53.aByteArray37 == null) {
					if (this.aByte11 == -1) {
						this.aByte11 = local53.aByte11;
					}
					if (this.aByte11 != local53.aByte11) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray40 != null;
				local22 |= local53.aByteArray33 != null;
				local24 |= local53.anIntArray325 != null;
				local26 |= local53.aShortArray51 != null;
				local28 |= local53.aByteArray35 != null;
				if (local53.aClass161Array1 != null) {
					local39 += local53.aClass161Array1.length;
				}
				if (local53.aClass170Array1 != null) {
					local41 += local53.aClass170Array1.length;
				}
			}
		}
		this.anIntArray329 = new int[this.anInt3356];
		this.anIntArray324 = new int[this.anInt3356];
		this.anIntArray326 = new int[this.anInt3356];
		this.anIntArray323 = new int[this.anInt3356];
		this.aShortArray52 = new short[this.anInt3356];
		this.anIntArray331 = new int[this.anInt3353];
		this.anIntArray330 = new int[this.anInt3353];
		this.anIntArray332 = new int[this.anInt3353];
		if (local18) {
			this.aByteArray40 = new byte[this.anInt3353];
		}
		if (local20) {
			this.aByteArray37 = new byte[this.anInt3353];
		}
		if (local22) {
			this.aByteArray33 = new byte[this.anInt3353];
		}
		if (local24) {
			this.anIntArray325 = new int[this.anInt3353];
		}
		if (local26) {
			this.aShortArray51 = new short[this.anInt3353];
		}
		if (local28) {
			this.aByteArray35 = new byte[this.anInt3353];
		}
		if (local39 > 0) {
			this.aClass161Array1 = new Class161[local39];
		}
		if (local41 > 0) {
			this.aClass170Array1 = new Class170[local41];
		}
		this.aShortArray53 = new short[this.anInt3353];
		this.aShortArray54 = new short[this.anInt3353];
		if (this.anInt3352 > 0) {
			this.aByteArray38 = new byte[this.anInt3352];
			this.aShortArray59 = new short[this.anInt3352];
			this.aShortArray56 = new short[this.anInt3352];
			this.aShortArray57 = new short[this.anInt3352];
			this.aShortArray60 = new short[this.anInt3352];
			this.aShortArray55 = new short[this.anInt3352];
			this.aShortArray58 = new short[this.anInt3352];
			this.aByteArray36 = new byte[this.anInt3352];
			this.aByteArray39 = new byte[this.anInt3352];
			this.aByteArray34 = new byte[this.anInt3352];
			this.aByteArray32 = new byte[this.anInt3352];
			this.aByteArray31 = new byte[this.anInt3352];
		}
		this.anInt3356 = 0;
		this.anInt3353 = 0;
		this.anInt3352 = 0;
		local39 = 0;
		local41 = 0;
		@Pc(356) Class53_Sub3 local356;
		@Pc(531) int local531;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(352) short local352 = (short) (0x1 << local46);
			local356 = arg0[local46];
			if (local356 != null) {
				@Pc(360) int local360;
				for (local360 = 0; local360 < local356.anInt3353; local360++) {
					if (local18 && local356.aByteArray40 != null) {
						this.aByteArray40[this.anInt3353] = local356.aByteArray40[local360];
					}
					if (local20) {
						if (local356.aByteArray37 == null) {
							this.aByteArray37[this.anInt3353] = local356.aByte11;
						} else {
							this.aByteArray37[this.anInt3353] = local356.aByteArray37[local360];
						}
					}
					if (local22 && local356.aByteArray33 != null) {
						this.aByteArray33[this.anInt3353] = local356.aByteArray33[local360];
					}
					if (local24 && local356.anIntArray325 != null) {
						this.anIntArray325[this.anInt3353] = local356.anIntArray325[local360];
					}
					if (local26) {
						if (local356.aShortArray51 == null) {
							this.aShortArray51[this.anInt3353] = -1;
						} else {
							this.aShortArray51[this.anInt3353] = local356.aShortArray51[local360];
						}
					}
					this.aShortArray53[this.anInt3353] = local356.aShortArray53[local360];
					this.aShortArray54[this.anInt3353] = local352;
					this.anIntArray331[this.anInt3353] = this.method2754(local356, local356.anIntArray331[local360], local352);
					this.anIntArray330[this.anInt3353] = this.method2754(local356, local356.anIntArray330[local360], local352);
					this.anIntArray332[this.anInt3353] = this.method2754(local356, local356.anIntArray332[local360], local352);
					this.anInt3353++;
				}
				if (local356.aClass161Array1 != null) {
					for (local360 = 0; local360 < local356.aClass161Array1.length; local360++) {
						local531 = this.method2754(local356, local356.aClass161Array1[local360].anInt4870, local352);
						@Pc(541) int local541 = this.method2754(local356, local356.aClass161Array1[local360].anInt4869, local352);
						@Pc(551) int local551 = this.method2754(local356, local356.aClass161Array1[local360].anInt4865, local352);
						this.aClass161Array1[local39] = new Class161(local356.aClass161Array1[local360].aClass90_2, local531, local541, local551);
						local39++;
					}
				}
				if (local356.aClass170Array1 != null) {
					for (local360 = 0; local360 < local356.aClass170Array1.length; local360++) {
						local531 = this.method2754(local356, local356.aClass170Array1[local360].anInt5233, local352);
						this.aClass170Array1[local41] = new Class170(local356.aClass170Array1[local360].aClass37_1, local531);
						local41++;
					}
				}
			}
		}
		local46 = 0;
		this.anInt3355 = this.anInt3356;
		for (@Pc(615) int local615 = 0; local615 < arg1; local615++) {
			local356 = arg0[local615];
			@Pc(627) short local627 = (short) (0x1 << local615);
			if (local356 != null) {
				for (local531 = 0; local531 < local356.anInt3353; local531++) {
					if (local28) {
						this.aByteArray35[local46++] = (byte) (local356.aByteArray35 == null || local356.aByteArray35[local531] == -1 ? -1 : local356.aByteArray35[local531] + this.anInt3352);
					}
				}
				for (local531 = 0; local531 < local356.anInt3352; local531++) {
					@Pc(680) byte local680 = this.aByteArray38[this.anInt3352] = local356.aByteArray38[local531];
					if (local680 == 0) {
						this.aShortArray59[this.anInt3352] = (short) this.method2754(local356, local356.aShortArray59[local531], local627);
						this.aShortArray56[this.anInt3352] = (short) this.method2754(local356, local356.aShortArray56[local531], local627);
						this.aShortArray57[this.anInt3352] = (short) this.method2754(local356, local356.aShortArray57[local531], local627);
					}
					if (local680 >= 1 && local680 <= 3) {
						this.aShortArray59[this.anInt3352] = local356.aShortArray59[local531];
						this.aShortArray56[this.anInt3352] = local356.aShortArray56[local531];
						this.aShortArray57[this.anInt3352] = local356.aShortArray57[local531];
						this.aShortArray60[this.anInt3352] = local356.aShortArray60[local531];
						this.aShortArray55[this.anInt3352] = local356.aShortArray55[local531];
						this.aShortArray58[this.anInt3352] = local356.aShortArray58[local531];
						this.aByteArray36[this.anInt3352] = local356.aByteArray36[local531];
						this.aByteArray39[this.anInt3352] = local356.aByteArray39[local531];
						this.aByteArray34[this.anInt3352] = local356.aByteArray34[local531];
					}
					if (local680 == 2) {
						this.aByteArray32[this.anInt3352] = local356.aByteArray32[local531];
						this.aByteArray31[this.anInt3352] = local356.aByteArray31[local531];
					}
					this.anInt3352++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ml;ZZZZ)V")
	public Class53_Sub3(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3356 = arg0.anInt3356;
		this.anInt3355 = arg0.anInt3355;
		this.anInt3353 = arg0.anInt3353;
		this.anInt3352 = arg0.anInt3352;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray329 = arg0.anIntArray329;
			this.anIntArray324 = arg0.anIntArray324;
			this.anIntArray326 = arg0.anIntArray326;
		} else {
			this.anIntArray329 = new int[this.anInt3356];
			this.anIntArray324 = new int[this.anInt3356];
			this.anIntArray326 = new int[this.anInt3356];
			for (local64 = 0; local64 < this.anInt3356; local64++) {
				this.anIntArray329[local64] = arg0.anIntArray329[local64];
				this.anIntArray324[local64] = arg0.anIntArray324[local64];
				this.anIntArray326[local64] = arg0.anIntArray326[local64];
			}
		}
		if (arg2) {
			this.aShortArray53 = arg0.aShortArray53;
		} else {
			this.aShortArray53 = new short[this.anInt3353];
			for (local64 = 0; local64 < this.anInt3353; local64++) {
				this.aShortArray53[local64] = arg0.aShortArray53[local64];
			}
		}
		if (arg3 || arg0.aShortArray51 == null) {
			this.aShortArray51 = arg0.aShortArray51;
		} else {
			this.aShortArray51 = new short[this.anInt3353];
			for (local64 = 0; local64 < this.anInt3353; local64++) {
				this.aShortArray51[local64] = arg0.aShortArray51[local64];
			}
		}
		this.aByteArray33 = arg0.aByteArray33;
		this.anIntArray331 = arg0.anIntArray331;
		this.anIntArray330 = arg0.anIntArray330;
		this.anIntArray332 = arg0.anIntArray332;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByte11 = arg0.aByte11;
		this.aByteArray38 = arg0.aByteArray38;
		this.aShortArray59 = arg0.aShortArray59;
		this.aShortArray56 = arg0.aShortArray56;
		this.aShortArray57 = arg0.aShortArray57;
		this.aShortArray60 = arg0.aShortArray60;
		this.aShortArray55 = arg0.aShortArray55;
		this.aShortArray58 = arg0.aShortArray58;
		this.aByteArray36 = arg0.aByteArray36;
		this.aByteArray39 = arg0.aByteArray39;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByteArray31 = arg0.aByteArray31;
		this.anIntArray323 = arg0.anIntArray323;
		this.anIntArray325 = arg0.anIntArray325;
		this.anIntArrayArray27 = arg0.anIntArrayArray27;
		this.anIntArrayArray26 = arg0.anIntArrayArray26;
		this.aClass31Array1 = arg0.aClass31Array1;
		this.aClass122Array1 = arg0.aClass122Array1;
		this.aClass31Array2 = arg0.aClass31Array2;
		this.aShort33 = arg0.aShort33;
		this.aShort29 = arg0.aShort29;
		this.aClass161Array1 = arg0.aClass161Array1;
		this.aClass170Array1 = arg0.aClass170Array1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method2753() {
		@Pc(3) int local3 = Static176.anIntArray322[256];
		@Pc(7) int local7 = Static176.anIntArray321[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3356; local9++) {
			@Pc(29) int local29 = this.anIntArray326[local9] * local3 + this.anIntArray329[local9] * local7 >> 16;
			this.anIntArray326[local9] = this.anIntArray326[local9] * local7 - this.anIntArray329[local9] * local3 >> 16;
			this.anIntArray329[local9] = local29;
		}
		this.method2770();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ml;IS)I")
	private int method2754(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray329[arg1];
		@Pc(9) int local9 = arg0.anIntArray324[arg1];
		@Pc(14) int local14 = arg0.anIntArray326[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3356; local16++) {
			if (local4 == this.anIntArray329[local16] && local9 == this.anIntArray324[local16] && local14 == this.anIntArray326[local16]) {
				this.aShortArray52[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray329[this.anInt3356] = local4;
		this.anIntArray324[this.anInt3356] = local9;
		this.anIntArray326[this.anInt3356] = local14;
		this.aShortArray52[this.anInt3356] = arg2;
		if (arg0.anIntArray323 != null) {
			this.anIntArray323[this.anInt3356] = arg0.anIntArray323[arg1];
		}
		return this.anInt3356++;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()I")
	@Override
	public int method3850() {
		if (!this.aBoolean238) {
			this.method2778();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()V")
	public void method2755() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			@Pc(10) int local10 = this.anIntArray329[local1];
			this.anIntArray329[local1] = this.anIntArray326[local1];
			this.anIntArray326[local1] = -local10;
		}
		this.method2770();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public void method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			this.anIntArray329[local1] += arg0;
			this.anIntArray324[local1] += arg1;
			this.anIntArray326[local1] += arg2;
		}
		this.method2770();
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()V")
	public void method2757() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray323 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3356; local9++) {
				local18 = this.anIntArray323[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray27 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray27[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt3356) {
				local18 = this.anIntArray323[local9];
				this.anIntArrayArray27[local18][local5[local18]++] = local9++;
			}
			this.anIntArray323 = null;
		}
		if (this.anIntArray325 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3353; local9++) {
			local18 = this.anIntArray325[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray26 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray26[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt3353) {
			local18 = this.anIntArray325[local9];
			this.anIntArrayArray26[local18][local5[local18]++] = local9++;
		}
		this.anIntArray325 = null;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
	public void method2758() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			this.anIntArray329[local1] = -this.anIntArray329[local1];
			this.anIntArray326[local1] = -this.anIntArray326[local1];
		}
		this.method2770();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([[IIIIII)V")
	private void method2759(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static176.method2775(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static176.method2775(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static176.method2775(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static176.method2775(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method2771(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method2782(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method2756(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()Z")
	@Override
	public boolean method3845() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "()V")
	public void method2760() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			@Pc(10) int local10 = this.anIntArray326[local1];
			this.anIntArray326[local1] = this.anIntArray329[local1];
			this.anIntArray329[local1] = -local10;
		}
		this.method2770();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Lclient!vc;")
	@Override
	public Class53 method3846() {
		return this.method2774(this.aShort33, this.aShort29, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "()V")
	public void method2761() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt3356; local1++) {
			this.anIntArray326[local1] = -this.anIntArray326[local1];
		}
		for (local1 = 0; local1 < this.anInt3353; local1++) {
			@Pc(27) int local27 = this.anIntArray331[local1];
			this.anIntArray331[local1] = this.anIntArray332[local1];
			this.anIntArray332[local1] = local27;
		}
		this.method2770();
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "()Lclient!ml;")
	public Class53_Sub3 method2762() {
		@Pc(3) Class53_Sub3 local3 = new Class53_Sub3();
		if (this.aByteArray40 != null) {
			local3.aByteArray40 = new byte[this.anInt3353];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3353; local13++) {
				local3.aByteArray40[local13] = this.aByteArray40[local13];
			}
		}
		local3.anInt3356 = this.anInt3356;
		local3.anInt3355 = this.anInt3355;
		local3.anInt3353 = this.anInt3353;
		local3.anInt3352 = this.anInt3352;
		local3.anIntArray329 = this.anIntArray329;
		local3.anIntArray324 = this.anIntArray324;
		local3.anIntArray326 = this.anIntArray326;
		local3.anIntArray331 = this.anIntArray331;
		local3.anIntArray330 = this.anIntArray330;
		local3.anIntArray332 = this.anIntArray332;
		local3.aByteArray37 = this.aByteArray37;
		local3.aByteArray33 = this.aByteArray33;
		local3.aByteArray35 = this.aByteArray35;
		local3.aShortArray53 = this.aShortArray53;
		local3.aShortArray51 = this.aShortArray51;
		local3.aByte11 = this.aByte11;
		local3.aByteArray38 = this.aByteArray38;
		local3.aShortArray59 = this.aShortArray59;
		local3.aShortArray56 = this.aShortArray56;
		local3.aShortArray57 = this.aShortArray57;
		local3.aShortArray60 = this.aShortArray60;
		local3.aShortArray55 = this.aShortArray55;
		local3.aShortArray58 = this.aShortArray58;
		local3.aByteArray36 = this.aByteArray36;
		local3.aByteArray39 = this.aByteArray39;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray32 = this.aByteArray32;
		local3.aByteArray31 = this.aByteArray31;
		local3.anIntArray323 = this.anIntArray323;
		local3.anIntArray325 = this.anIntArray325;
		local3.anIntArrayArray27 = this.anIntArrayArray27;
		local3.anIntArrayArray26 = this.anIntArrayArray26;
		local3.aClass31Array1 = this.aClass31Array1;
		local3.aClass122Array1 = this.aClass122Array1;
		local3.aShort33 = this.aShort33;
		local3.aShort29 = this.aShort29;
		local3.aClass161Array1 = this.aClass161Array1;
		local3.aClass170Array1 = this.aClass170Array1;
		return local3;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([B)V")
	private void method2764(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class4_Sub10 local8 = new Class4_Sub10(arg0);
		@Pc(13) Class4_Sub10 local13 = new Class4_Sub10(arg0);
		@Pc(18) Class4_Sub10 local18 = new Class4_Sub10(arg0);
		@Pc(23) Class4_Sub10 local23 = new Class4_Sub10(arg0);
		@Pc(28) Class4_Sub10 local28 = new Class4_Sub10(arg0);
		local8.anInt5713 = arg0.length - 18;
		@Pc(38) int local38 = local8.method4653();
		@Pc(42) int local42 = local8.method4653();
		@Pc(46) int local46 = local8.method4666();
		@Pc(50) int local50 = local8.method4666();
		@Pc(54) int local54 = local8.method4666();
		@Pc(58) int local58 = local8.method4666();
		@Pc(62) int local62 = local8.method4666();
		@Pc(66) int local66 = local8.method4666();
		@Pc(70) int local70 = local8.method4653();
		@Pc(74) int local74 = local8.method4653();
		@Pc(78) int local78 = local8.method4653();
		@Pc(82) int local82 = local8.method4653();
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
		this.anInt3356 = local38;
		this.anInt3353 = local42;
		this.anInt3352 = local46;
		this.anIntArray329 = new int[local38];
		this.anIntArray324 = new int[local38];
		this.anIntArray326 = new int[local38];
		this.anIntArray331 = new int[local42];
		this.anIntArray330 = new int[local42];
		this.anIntArray332 = new int[local42];
		if (local46 > 0) {
			this.aByteArray38 = new byte[local46];
			this.aShortArray59 = new short[local46];
			this.aShortArray56 = new short[local46];
			this.aShortArray57 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray323 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray40 = new byte[local42];
			this.aByteArray35 = new byte[local42];
			this.aShortArray51 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray37 = new byte[local42];
		} else {
			this.aByte11 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray33 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray325 = new int[local42];
		}
		this.aShortArray53 = new short[local42];
		local8.anInt5713 = 0;
		local13.anInt5713 = local165;
		local18.anInt5713 = local171;
		local23.anInt5713 = local90;
		local28.anInt5713 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method4666();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method4634();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method4634();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method4634();
			}
			this.anIntArray329[local307] = local301 + local316;
			this.anIntArray324[local307] = local303 + local326;
			this.anIntArray326[local307] = local305 + local336;
			local301 = this.anIntArray329[local307];
			local303 = this.anIntArray324[local307];
			local305 = this.anIntArray326[local307];
			if (local66 == 1) {
				this.anIntArray323[local307] = local28.method4666();
			}
		}
		local8.anInt5713 = local149;
		local13.anInt5713 = local116;
		local18.anInt5713 = local98;
		local23.anInt5713 = local134;
		local28.anInt5713 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray53[local307] = (short) local8.method4653();
			if (local50 == 1) {
				local314 = local13.method4666();
				if ((local314 & 0x1) == 1) {
					this.aByteArray40[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray40[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray35[local307] = (byte) (local314 >> 2);
					this.aShortArray51[local307] = this.aShortArray53[local307];
					this.aShortArray53[local307] = 127;
					if (this.aShortArray51[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray35[local307] = -1;
					this.aShortArray51[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray37[local307] = local18.method4674();
			}
			if (local58 == 1) {
				this.aByteArray33[local307] = local23.method4674();
			}
			if (local62 == 1) {
				this.anIntArray325[local307] = local28.method4666();
			}
		}
		this.anInt3355 = -1;
		local8.anInt5713 = local143;
		local13.anInt5713 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method4666();
			if (local548 == 1) {
				local307 = local8.method4634() + local326;
				local314 = local8.method4634() + local307;
				local316 = local8.method4634() + local314;
				local326 = local316;
				this.anIntArray331[local336] = local307;
				this.anIntArray330[local336] = local314;
				this.anIntArray332[local336] = local316;
				if (local307 > this.anInt3355) {
					this.anInt3355 = local307;
				}
				if (local314 > this.anInt3355) {
					this.anInt3355 = local314;
				}
				if (local316 > this.anInt3355) {
					this.anInt3355 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method4634() + local326;
				local326 = local316;
				this.anIntArray331[local336] = local307;
				this.anIntArray330[local336] = local314;
				this.anIntArray332[local336] = local316;
				if (local316 > this.anInt3355) {
					this.anInt3355 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method4634() + local326;
				local326 = local316;
				this.anIntArray331[local336] = local307;
				this.anIntArray330[local336] = local314;
				this.anIntArray332[local336] = local316;
				if (local316 > this.anInt3355) {
					this.anInt3355 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method4634() + local326;
				local326 = local316;
				this.anIntArray331[local336] = local307;
				this.anIntArray330[local336] = local686;
				this.anIntArray332[local336] = local316;
				if (local316 > this.anInt3355) {
					this.anInt3355 = local316;
				}
			}
		}
		this.anInt3355++;
		local8.anInt5713 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray38[local336] = 0;
			this.aShortArray59[local336] = (short) local8.method4653();
			this.aShortArray56[local336] = (short) local8.method4653();
			this.aShortArray57[local336] = (short) local8.method4653();
		}
		if (this.aByteArray35 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray35[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray59[local686] & 0xFFFF) == this.anIntArray331[local548] && (this.aShortArray56[local686] & 0xFFFF) == this.anIntArray330[local548] && (this.aShortArray57[local686] & 0xFFFF) == this.anIntArray332[local548]) {
						this.aByteArray35[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray35 = null;
			}
		}
		if (!local3) {
			this.aShortArray51 = null;
		}
		if (!local1) {
			this.aByteArray40 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(SS)V")
	public void method2766(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray51 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3353; local5++) {
			if (this.aShortArray51[local5] == arg0) {
				this.aShortArray51[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(III)V")
	public void method2767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static176.anIntArray322[arg2];
			local9 = Static176.anIntArray321[arg2];
			for (local11 = 0; local11 < this.anInt3356; local11++) {
				local31 = this.anIntArray324[local11] * local5 + this.anIntArray329[local11] * local9 >> 16;
				this.anIntArray324[local11] = this.anIntArray324[local11] * local9 - this.anIntArray329[local11] * local5 >> 16;
				this.anIntArray329[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static176.anIntArray322[arg0];
			local9 = Static176.anIntArray321[arg0];
			for (local11 = 0; local11 < this.anInt3356; local11++) {
				local31 = this.anIntArray324[local11] * local9 - this.anIntArray326[local11] * local5 >> 16;
				this.anIntArray326[local11] = this.anIntArray324[local11] * local5 + this.anIntArray326[local11] * local9 >> 16;
				this.anIntArray324[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static176.anIntArray322[arg1];
		local9 = Static176.anIntArray321[arg1];
		for (local11 = 0; local11 < this.anInt3356; local11++) {
			local31 = this.anIntArray326[local11] * local5 + this.anIntArray329[local11] * local9 >> 16;
			this.anIntArray326[local11] = this.anIntArray326[local11] * local9 - this.anIntArray329[local11] * local5 >> 16;
			this.anIntArray329[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "([B)V")
	private void method2768(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub10 local4 = new Class4_Sub10(arg0);
		@Pc(9) Class4_Sub10 local9 = new Class4_Sub10(arg0);
		@Pc(14) Class4_Sub10 local14 = new Class4_Sub10(arg0);
		@Pc(19) Class4_Sub10 local19 = new Class4_Sub10(arg0);
		@Pc(24) Class4_Sub10 local24 = new Class4_Sub10(arg0);
		@Pc(29) Class4_Sub10 local29 = new Class4_Sub10(arg0);
		@Pc(34) Class4_Sub10 local34 = new Class4_Sub10(arg0);
		local4.anInt5713 = arg0.length - 23;
		@Pc(44) int local44 = local4.method4653();
		@Pc(48) int local48 = local4.method4653();
		@Pc(52) int local52 = local4.method4666();
		@Pc(56) int local56 = local4.method4666();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method4666();
		@Pc(82) int local82 = local4.method4666();
		@Pc(86) int local86 = local4.method4666();
		@Pc(90) int local90 = local4.method4666();
		@Pc(94) int local94 = local4.method4666();
		@Pc(98) int local98 = local4.method4653();
		@Pc(102) int local102 = local4.method4653();
		@Pc(106) int local106 = local4.method4653();
		@Pc(110) int local110 = local4.method4653();
		@Pc(114) int local114 = local4.method4653();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray38 = new byte[local52];
			local4.anInt5713 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray38[local131] = local4.method4674();
				if (local143 == 0) {
					local116++;
				}
				if (local143 >= 1 && local143 <= 3) {
					local118++;
				}
				if (local143 == 2) {
					local120++;
				}
			}
		}
		local131 = local52 + local44;
		@Pc(169) int local169 = local131;
		if (local65) {
			local131 += local48;
		}
		@Pc(177) int local177 = local131;
		local131 += local48;
		@Pc(183) int local183 = local131;
		if (local78 == 255) {
			local131 += local48;
		}
		@Pc(192) int local192 = local131;
		if (local86 == 1) {
			local131 += local48;
		}
		@Pc(201) int local201 = local131;
		if (local94 == 1) {
			local131 += local44;
		}
		@Pc(210) int local210 = local131;
		if (local82 == 1) {
			local131 += local48;
		}
		@Pc(219) int local219 = local131;
		local131 += local110;
		@Pc(225) int local225 = local131;
		if (local90 == 1) {
			local131 += local48 * 2;
		}
		@Pc(236) int local236 = local131;
		local131 += local114;
		@Pc(242) int local242 = local131;
		local131 += local48 * 2;
		@Pc(250) int local250 = local131;
		local131 += local98;
		@Pc(256) int local256 = local131;
		local131 += local102;
		@Pc(262) int local262 = local131;
		local131 += local106;
		@Pc(268) int local268 = local131;
		local131 += local116 * 6;
		@Pc(276) int local276 = local131;
		local131 += local118 * 6;
		@Pc(284) int local284 = local131;
		local131 += local118 * 6;
		@Pc(292) int local292 = local131;
		local131 += local118;
		@Pc(298) int local298 = local131;
		local131 += local118;
		@Pc(304) int local304 = local131;
		local131 += local118 + local120 * 2;
		this.anInt3356 = local44;
		this.anInt3353 = local48;
		this.anInt3352 = local52;
		this.anIntArray329 = new int[local44];
		this.anIntArray324 = new int[local44];
		this.anIntArray326 = new int[local44];
		this.anIntArray331 = new int[local48];
		this.anIntArray330 = new int[local48];
		this.anIntArray332 = new int[local48];
		if (local94 == 1) {
			this.anIntArray323 = new int[local44];
		}
		if (local65) {
			this.aByteArray40 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray37 = new byte[local48];
		} else {
			this.aByte11 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray33 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray325 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray51 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray35 = new byte[local48];
		}
		this.aShortArray53 = new short[local48];
		if (local52 > 0) {
			this.aShortArray59 = new short[local52];
			this.aShortArray56 = new short[local52];
			this.aShortArray57 = new short[local52];
			if (local118 > 0) {
				this.aShortArray60 = new short[local118];
				this.aShortArray55 = new short[local118];
				this.aShortArray58 = new short[local118];
				this.aByteArray36 = new byte[local118];
				this.aByteArray39 = new byte[local118];
				this.aByteArray34 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray32 = new byte[local120];
				this.aByteArray31 = new byte[local120];
			}
		}
		local4.anInt5713 = local52;
		local9.anInt5713 = local250;
		local14.anInt5713 = local256;
		local19.anInt5713 = local262;
		local24.anInt5713 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method4666();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method4634();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method4634();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method4634();
			}
			this.anIntArray329[local479] = local473 + local488;
			this.anIntArray324[local479] = local475 + local498;
			this.anIntArray326[local479] = local477 + local508;
			local473 = this.anIntArray329[local479];
			local475 = this.anIntArray324[local479];
			local477 = this.anIntArray326[local479];
			if (local94 == 1) {
				this.anIntArray323[local479] = local24.method4666();
			}
		}
		local4.anInt5713 = local242;
		local9.anInt5713 = local169;
		local14.anInt5713 = local183;
		local19.anInt5713 = local210;
		local24.anInt5713 = local192;
		local29.anInt5713 = local225;
		local34.anInt5713 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray53[local479] = (short) local4.method4653();
			if (local65) {
				this.aByteArray40[local479] = local9.method4674();
			}
			if (local78 == 255) {
				this.aByteArray37[local479] = local14.method4674();
			}
			if (local82 == 1) {
				this.aByteArray33[local479] = local19.method4674();
			}
			if (local86 == 1) {
				this.anIntArray325[local479] = local24.method4666();
			}
			if (local90 == 1) {
				this.aShortArray51[local479] = (short) (local29.method4653() - 1);
			}
			if (this.aByteArray35 != null) {
				if (this.aShortArray51[local479] == -1) {
					this.aByteArray35[local479] = -1;
				} else {
					this.aByteArray35[local479] = (byte) (local34.method4666() - 1);
				}
			}
		}
		this.anInt3355 = -1;
		local4.anInt5713 = local219;
		local9.anInt5713 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		@Pc(841) int local841;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method4666();
			if (local703 == 1) {
				local479 = local4.method4634() + local498;
				local486 = local4.method4634() + local479;
				local488 = local4.method4634() + local486;
				local498 = local488;
				this.anIntArray331[local508] = local479;
				this.anIntArray330[local508] = local486;
				this.anIntArray332[local508] = local488;
				if (local479 > this.anInt3355) {
					this.anInt3355 = local479;
				}
				if (local486 > this.anInt3355) {
					this.anInt3355 = local486;
				}
				if (local488 > this.anInt3355) {
					this.anInt3355 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method4634() + local498;
				local498 = local488;
				this.anIntArray331[local508] = local479;
				this.anIntArray330[local508] = local486;
				this.anIntArray332[local508] = local488;
				if (local488 > this.anInt3355) {
					this.anInt3355 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method4634() + local498;
				local498 = local488;
				this.anIntArray331[local508] = local479;
				this.anIntArray330[local508] = local486;
				this.anIntArray332[local508] = local488;
				if (local488 > this.anInt3355) {
					this.anInt3355 = local488;
				}
			}
			if (local703 == 4) {
				local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method4634() + local498;
				local498 = local488;
				this.anIntArray331[local508] = local479;
				this.anIntArray330[local508] = local841;
				this.anIntArray332[local508] = local488;
				if (local488 > this.anInt3355) {
					this.anInt3355 = local488;
				}
			}
		}
		this.anInt3355++;
		local4.anInt5713 = local268;
		local9.anInt5713 = local276;
		local14.anInt5713 = local284;
		local19.anInt5713 = local292;
		local24.anInt5713 = local298;
		local29.anInt5713 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray38[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray59[local508] = (short) local4.method4653();
				this.aShortArray56[local508] = (short) local4.method4653();
				this.aShortArray57[local508] = (short) local4.method4653();
			}
			if (local703 == 1) {
				this.aShortArray59[local508] = (short) local9.method4653();
				this.aShortArray56[local508] = (short) local9.method4653();
				this.aShortArray57[local508] = (short) local9.method4653();
				this.aShortArray60[local508] = (short) local14.method4653();
				this.aShortArray55[local508] = (short) local14.method4653();
				this.aShortArray58[local508] = (short) local14.method4653();
				this.aByteArray36[local508] = local19.method4674();
				this.aByteArray39[local508] = local24.method4674();
				this.aByteArray34[local508] = local29.method4674();
			}
			if (local703 == 2) {
				this.aShortArray59[local508] = (short) local9.method4653();
				this.aShortArray56[local508] = (short) local9.method4653();
				this.aShortArray57[local508] = (short) local9.method4653();
				this.aShortArray60[local508] = (short) local14.method4653();
				this.aShortArray55[local508] = (short) local14.method4653();
				this.aShortArray58[local508] = (short) local14.method4653();
				this.aByteArray36[local508] = local19.method4674();
				this.aByteArray39[local508] = local24.method4674();
				this.aByteArray34[local508] = local29.method4674();
				this.aByteArray32[local508] = local29.method4674();
				this.aByteArray31[local508] = local29.method4674();
			}
			if (local703 == 3) {
				this.aShortArray59[local508] = (short) local9.method4653();
				this.aShortArray56[local508] = (short) local9.method4653();
				this.aShortArray57[local508] = (short) local9.method4653();
				this.aShortArray60[local508] = (short) local14.method4653();
				this.aShortArray55[local508] = (short) local14.method4653();
				this.aShortArray58[local508] = (short) local14.method4653();
				this.aByteArray36[local508] = local19.method4674();
				this.aByteArray39[local508] = local24.method4674();
				this.aByteArray34[local508] = local29.method4674();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt5713 = local131;
		local508 = local4.method4666();
		if (local508 > 0) {
			this.aClass161Array1 = new Class161[local508];
			for (local703 = 0; local703 < local508; local703++) {
				local841 = local4.method4653();
				@Pc(1199) int local1199 = local4.method4653();
				this.aClass161Array1[local703] = new Class161(local841, this.anIntArray331[local1199], this.anIntArray330[local1199], this.anIntArray332[local1199]);
			}
		}
		local703 = local4.method4666();
		if (local703 > 0) {
			this.aClass170Array1 = new Class170[local703];
			for (local841 = 0; local841 < local703; local841++) {
				this.aClass170Array1[local841] = new Class170(local4.method4653(), local4.method4653());
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIBSB)I")
	public int method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray331[this.anInt3353] = arg0;
		this.anIntArray330[this.anInt3353] = arg1;
		this.anIntArray332[this.anInt3353] = arg2;
		this.aByteArray40[this.anInt3353] = 1;
		this.aByteArray35[this.anInt3353] = -1;
		this.aShortArray53[this.anInt3353] = arg3;
		this.aShortArray51[this.anInt3353] = -1;
		this.aByteArray33[this.anInt3353] = arg4;
		return this.anInt3353++;
	}

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "()V")
	private void method2770() {
		this.aClass31Array1 = null;
		this.aClass31Array2 = null;
		this.aClass122Array1 = null;
		this.aBoolean238 = false;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	private void method2771(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static176.anIntArray322[arg0];
		@Pc(7) int local7 = Static176.anIntArray321[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3356; local9++) {
			@Pc(29) int local29 = this.anIntArray324[local9] * local7 - this.anIntArray326[local9] * local3 >> 16;
			this.anIntArray326[local9] = this.anIntArray324[local9] * local3 + this.anIntArray326[local9] * local7 >> 16;
			this.anIntArray324[local9] = local29;
		}
		this.method2770();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIII)Lclient!na;")
	public Class53_Sub4_Sub1 method2772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class53_Sub4_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "()V")
	public void method2773() {
		this.anIntArray323 = null;
		this.anIntArray325 = null;
		this.anIntArrayArray27 = null;
		this.anIntArrayArray26 = null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!vc;IIIZ)V")
	@Override
	public void method3844(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class53_Sub3 local2 = (Class53_Sub3) arg0;
		local2.method2778();
		local2.method2777();
		Static176.anInt3354++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray329;
		@Pc(18) int local18 = local2.anInt3355;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt3355; local20++) {
			@Pc(29) Class31 local29 = this.aClass31Array1[local20];
			if (local29.anInt620 != 0) {
				@Pc(40) int local40 = this.anIntArray324[local20] - arg2;
				if (local40 >= local2.aShort31 && local40 <= local2.aShort30) {
					@Pc(56) int local56 = this.anIntArray329[local20] - arg1;
					if (local56 >= local2.aShort27 && local56 <= local2.aShort34) {
						@Pc(72) int local72 = this.anIntArray326[local20] - arg3;
						if (local72 >= local2.aShort32 && local72 <= local2.aShort28) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class31 local91 = local2.aClass31Array1[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray326[local83] && local40 == local2.anIntArray324[local83] && local91.anInt620 != 0) {
									if (this.aClass31Array2 == null) {
										this.aClass31Array2 = new Class31[this.anInt3355];
									}
									if (local2.aClass31Array2 == null) {
										local2.aClass31Array2 = new Class31[local18];
									}
									@Pc(131) Class31 local131 = this.aClass31Array2[local20];
									if (local131 == null) {
										local131 = this.aClass31Array2[local20] = new Class31(local29);
									}
									@Pc(148) Class31 local148 = local2.aClass31Array2[local83];
									if (local148 == null) {
										local148 = local2.aClass31Array2[local83] = new Class31(local91);
									}
									local131.anInt621 += local91.anInt621;
									local131.anInt619 += local91.anInt619;
									local131.anInt625 += local91.anInt625;
									local131.anInt620 += local91.anInt620;
									local148.anInt621 += local29.anInt621;
									local148.anInt619 += local29.anInt619;
									local148.anInt625 += local29.anInt625;
									local148.anInt620 += local29.anInt620;
									local12++;
									Static176.anIntArray327[local20] = Static176.anInt3354;
									Static176.anIntArray328[local83] = Static176.anInt3354;
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
		for (local20 = 0; local20 < this.anInt3353; local20++) {
			if (Static176.anIntArray327[this.anIntArray331[local20]] == Static176.anInt3354 && Static176.anIntArray327[this.anIntArray330[local20]] == Static176.anInt3354 && Static176.anIntArray327[this.anIntArray332[local20]] == Static176.anInt3354) {
				if (this.aByteArray40 == null) {
					this.aByteArray40 = new byte[this.anInt3353];
				}
				this.aByteArray40[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt3353; local20++) {
			if (Static176.anIntArray328[local2.anIntArray331[local20]] == Static176.anInt3354 && Static176.anIntArray328[local2.anIntArray330[local20]] == Static176.anInt3354 && Static176.anIntArray328[local2.anIntArray332[local20]] == Static176.anInt3354) {
				if (local2.aByteArray40 == null) {
					local2.aByteArray40 = new byte[local2.anInt3353];
				}
				local2.aByteArray40[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(IIIII)Lclient!vg;")
	public Class53_Sub4 method2774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static94.aBoolean138) {
			@Pc(9) Class53_Sub4_Sub2 local9 = new Class53_Sub4_Sub2(this, arg0, arg1, true);
			local9.method3903();
			return local9;
		} else {
			return new Class53_Sub4_Sub1(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(III)I")
	public int method2776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			if (this.anIntArray329[local1] == arg0 && this.anIntArray324[local1] == 0 && this.anIntArray326[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray329[this.anInt3356] = arg0;
		this.anIntArray324[this.anInt3356] = 0;
		this.anIntArray326[this.anInt3356] = arg1;
		this.anInt3355 = ++this.anInt3356;
		return this.anInt3356 - 1;
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "()V")
	public void method2777() {
		if (this.aClass31Array1 != null) {
			return;
		}
		this.aClass31Array1 = new Class31[this.anInt3355];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt3355; local10++) {
			this.aClass31Array1[local10] = new Class31();
		}
		for (local10 = 0; local10 < this.anInt3353; local10++) {
			@Pc(34) int local34 = this.anIntArray331[local10];
			@Pc(39) int local39 = this.anIntArray330[local10];
			@Pc(44) int local44 = this.anIntArray332[local10];
			@Pc(54) int local54 = this.anIntArray329[local39] - this.anIntArray329[local34];
			@Pc(64) int local64 = this.anIntArray324[local39] - this.anIntArray324[local34];
			@Pc(74) int local74 = this.anIntArray326[local39] - this.anIntArray326[local34];
			@Pc(84) int local84 = this.anIntArray329[local44] - this.anIntArray329[local34];
			@Pc(94) int local94 = this.anIntArray324[local44] - this.anIntArray324[local34];
			@Pc(104) int local104 = this.anIntArray326[local44] - this.anIntArray326[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 0x1) {
				local112 >>= 0x1;
				local120 >>= 0x1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.aByteArray40 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray40[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class31 local214 = this.aClass31Array1[local34];
				local214.anInt621 += local112;
				local214.anInt619 += local120;
				local214.anInt625 += local128;
				local214.anInt620++;
				@Pc(243) Class31 local243 = this.aClass31Array1[local39];
				local243.anInt621 += local112;
				local243.anInt619 += local120;
				local243.anInt625 += local128;
				local243.anInt620++;
				@Pc(272) Class31 local272 = this.aClass31Array1[local44];
				local272.anInt621 += local112;
				local272.anInt619 += local120;
				local272.anInt625 += local128;
				local272.anInt620++;
			} else if (local201 == 1) {
				if (this.aClass122Array1 == null) {
					this.aClass122Array1 = new Class122[this.anInt3353];
				}
				@Pc(317) Class122 local317 = this.aClass122Array1[local10] = new Class122();
				local317.anInt3342 = local112;
				local317.anInt3339 = local120;
				local317.anInt3343 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "()V")
	private void method2778() {
		if (this.aBoolean238) {
			return;
		}
		this.aBoolean238 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3355; local20++) {
			@Pc(29) int local29 = this.anIntArray329[local20];
			@Pc(34) int local34 = this.anIntArray324[local20];
			@Pc(39) int local39 = this.anIntArray326[local20];
			if (local29 < local8) {
				local8 = local29;
			}
			if (local29 > local14) {
				local14 = local29;
			}
			if (local34 < local10) {
				local10 = local34;
			}
			if (local34 > local16) {
				local16 = local34;
			}
			if (local39 < local12) {
				local12 = local39;
			}
			if (local39 > local18) {
				local18 = local39;
			}
		}
		this.aShort27 = (short) local8;
		this.aShort34 = (short) local14;
		this.aShort31 = (short) local10;
		this.aShort30 = (short) local16;
		this.aShort32 = (short) local12;
		this.aShort28 = (short) local18;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!ml;")
	public Class53_Sub3 method2779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2778();
		@Pc(6) int local6 = arg4 + this.aShort27;
		@Pc(11) int local11 = arg4 + this.aShort34;
		@Pc(16) int local16 = arg6 + this.aShort32;
		@Pc(21) int local21 = arg6 + this.aShort28;
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
		@Pc(147) Class53_Sub3 local147 = new Class53_Sub3();
		local147.anInt3356 = this.anInt3356;
		local147.anInt3355 = this.anInt3355;
		local147.anInt3353 = this.anInt3353;
		local147.anInt3352 = this.anInt3352;
		local147.anIntArray331 = this.anIntArray331;
		local147.anIntArray330 = this.anIntArray330;
		local147.anIntArray332 = this.anIntArray332;
		local147.aByteArray40 = this.aByteArray40;
		local147.aByteArray37 = this.aByteArray37;
		local147.aByteArray33 = this.aByteArray33;
		local147.aByteArray35 = this.aByteArray35;
		local147.aShortArray53 = this.aShortArray53;
		local147.aShortArray51 = this.aShortArray51;
		local147.aByte11 = this.aByte11;
		local147.aByteArray38 = this.aByteArray38;
		local147.aShortArray59 = this.aShortArray59;
		local147.aShortArray56 = this.aShortArray56;
		local147.aShortArray57 = this.aShortArray57;
		local147.aShortArray60 = this.aShortArray60;
		local147.aShortArray55 = this.aShortArray55;
		local147.aShortArray58 = this.aShortArray58;
		local147.aByteArray36 = this.aByteArray36;
		local147.aByteArray39 = this.aByteArray39;
		local147.aByteArray34 = this.aByteArray34;
		local147.aByteArray32 = this.aByteArray32;
		local147.aByteArray31 = this.aByteArray31;
		local147.anIntArray323 = this.anIntArray323;
		local147.anIntArray325 = this.anIntArray325;
		local147.anIntArrayArray27 = this.anIntArrayArray27;
		local147.anIntArrayArray26 = this.anIntArrayArray26;
		local147.aShort33 = this.aShort33;
		local147.aShort29 = this.aShort29;
		local147.aClass31Array1 = this.aClass31Array1;
		local147.aClass122Array1 = this.aClass122Array1;
		local147.aClass31Array2 = this.aClass31Array2;
		local147.aClass161Array1 = this.aClass161Array1;
		local147.aClass170Array1 = this.aClass170Array1;
		if (arg0 == 3) {
			local147.anIntArray329 = Static160.method2579(this.anIntArray329);
			local147.anIntArray324 = Static160.method2579(this.anIntArray324);
			local147.anIntArray326 = Static160.method2579(this.anIntArray326);
		} else {
			local147.anIntArray329 = this.anIntArray329;
			local147.anIntArray324 = new int[local147.anInt3356];
			local147.anIntArray326 = this.anIntArray326;
		}
		@Pc(338) int local338;
		@Pc(349) int local349;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(364) int local364;
		@Pc(368) int local368;
		@Pc(372) int local372;
		@Pc(394) int local394;
		@Pc(420) int local420;
		@Pc(432) int local432;
		if (arg0 == 1) {
			for (local338 = 0; local338 < local147.anInt3355; local338++) {
				local349 = this.anIntArray329[local338] + arg4;
				local356 = this.anIntArray326[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
				local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
				local432 = local394 * (128 - local364) + local420 * local364 >> 7;
				local147.anIntArray324[local338] = this.anIntArray324[local338] + local432 - arg5;
			}
			for (local338 = local147.anInt3355; local338 < local147.anInt3356; local338++) {
				local349 = this.anIntArray329[local338] + arg4;
				local356 = this.anIntArray326[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				if (local368 >= 0 && local368 < arg2.length - 1 && local372 >= 0 && local372 < arg2[0].length - 1) {
					local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
					local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
					local432 = local394 * (128 - local364) + local420 * local364 >> 7;
					local147.anIntArray324[local338] = this.anIntArray324[local338] + local432 - arg5;
				}
			}
		} else {
			@Pc(689) int local689;
			if (arg0 == 2) {
				for (local338 = 0; local338 < local147.anInt3355; local338++) {
					local349 = (this.anIntArray324[local338] << 16) / this.aShort31;
					if (local349 < arg1) {
						local356 = this.anIntArray329[local338] + arg4;
						local360 = this.anIntArray326[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray324[local338] = this.anIntArray324[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
					} else {
						local147.anIntArray324[local338] = this.anIntArray324[local338];
					}
				}
				for (local338 = local147.anInt3355; local338 < local147.anInt3356; local338++) {
					local349 = (this.anIntArray324[local338] << 16) / this.aShort31;
					if (local349 < arg1) {
						local356 = this.anIntArray329[local338] + arg4;
						local360 = this.anIntArray326[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						if (local372 >= 0 && local372 < arg2.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1) {
							local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
							local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
							local689 = local420 * (128 - local368) + local432 * local368 >> 7;
							local147.anIntArray324[local338] = this.anIntArray324[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
						}
					} else {
						local147.anIntArray324[local338] = this.anIntArray324[local338];
					}
				}
			} else if (arg0 == 3) {
				local338 = (arg1 & 0xFF) * 4;
				local349 = (arg1 >> 8 & 0xFF) * 4;
				local147.method2759(arg2, arg4, arg5, arg6, local338, local349);
			} else if (arg0 == 4) {
				local338 = this.aShort30 - this.aShort31;
				for (local349 = 0; local349 < this.anInt3355; local349++) {
					local356 = this.anIntArray329[local349] + arg4;
					local360 = this.anIntArray326[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local147.anIntArray324[local349] = this.anIntArray324[local349] + local689 + local338 - arg5;
				}
				for (local349 = local147.anInt3355; local349 < local147.anInt3356; local349++) {
					local356 = this.anIntArray329[local349] + arg4;
					local360 = this.anIntArray326[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg3[0].length - 1) {
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray324[local349] = this.anIntArray324[local349] + local689 + local338 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local338 = this.aShort30 - this.aShort31;
				@Pc(1322) int local1322;
				@Pc(1326) int local1326;
				for (local349 = 0; local349 < this.anInt3355; local349++) {
					local356 = this.anIntArray329[local349] + arg4;
					local360 = this.anIntArray326[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
					local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local1322 = local420 * (128 - local368) + local432 * local368 >> 7;
					local1326 = local689 - local1322;
					local147.anIntArray324[local349] = ((this.anIntArray324[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
				}
				for (local349 = local147.anInt3355; local349 < local147.anInt3356; local349++) {
					local356 = this.anIntArray329[local349] + arg4;
					local360 = this.anIntArray326[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg2.length - 1 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1 && local394 < arg3[0].length - 1) {
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local1322 = local420 * (128 - local368) + local432 * local368 >> 7;
						local1326 = local689 - local1322;
						local147.anIntArray324[local349] = ((this.anIntArray324[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
					}
				}
			}
		}
		this.aBoolean238 = false;
		return local147;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(III)V")
	public void method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			this.anIntArray329[local1] = this.anIntArray329[local1] * arg0 / 128;
			this.anIntArray324[local1] = this.anIntArray324[local1] * arg1 / 128;
			this.anIntArray326[local1] = this.anIntArray326[local1] * arg2 / 128;
		}
		this.method2770();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(SS)V")
	public void method2781(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3353; local1++) {
			if (this.aShortArray53[local1] == arg0) {
				this.aShortArray53[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	private void method2782(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static176.anIntArray322[arg0];
		@Pc(7) int local7 = Static176.anIntArray321[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3356; local9++) {
			@Pc(29) int local29 = this.anIntArray324[local9] * local3 + this.anIntArray329[local9] * local7 >> 16;
			this.anIntArray324[local9] = this.anIntArray324[local9] * local7 - this.anIntArray329[local9] * local3 >> 16;
			this.anIntArray329[local9] = local29;
		}
		this.method2770();
	}
}
