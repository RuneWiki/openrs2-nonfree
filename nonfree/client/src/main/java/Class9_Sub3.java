import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "[Lclient!gi;")
	public Class48[] aClass48Array1;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "[Lclient!gi;")
	public Class48[] aClass48Array2;

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "[Lclient!ni;")
	public Class93[] aClass93Array1;

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!ca", name = "W", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!ca", name = "db", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!ca", name = "eb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!ca", name = "gb", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!ca", name = "hb", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!ca", name = "ib", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!ca", name = "jb", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	public int anInt857 = 0;

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
	public int anInt860 = 0;

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
	public int anInt859 = 0;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	private Class9_Sub3() {
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V")
	public Class9_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method540(arg0);
		} else {
			this.method532(arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(III)V")
	public Class9_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray64 = new int[arg0];
		this.anIntArray69 = new int[arg0];
		this.anIntArray68 = new int[arg0];
		this.anIntArray74 = new int[arg0];
		this.anIntArray72 = new int[arg1];
		this.anIntArray75 = new int[arg1];
		this.anIntArray71 = new int[arg1];
		this.aByteArray13 = new byte[arg1];
		this.aByteArray16 = new byte[arg1];
		this.aByteArray9 = new byte[arg1];
		this.aShortArray15 = new short[arg1];
		this.aShortArray9 = new short[arg1];
		this.aByteArray11 = new byte[arg1];
		this.anIntArray66 = new int[arg1];
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([Lclient!ca;I)V")
	public Class9_Sub3(@OriginalArg(0) Class9_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt857 = 0;
		this.anInt859 = 0;
		this.anInt858 = 0;
		this.aByte3 = -1;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(51) Class9_Sub3 local51 = arg0[local46];
			if (local51 != null) {
				this.anInt857 += local51.anInt857;
				this.anInt859 += local51.anInt859;
				this.anInt858 += local51.anInt858;
				if (local51.aByteArray16 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local51.aByte3;
					}
					if (this.aByte3 != local51.aByte3) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local51.aByteArray13 != null;
				local22 |= local51.aByteArray9 != null;
				local24 |= local51.anIntArray66 != null;
				local26 |= local51.aShortArray9 != null;
				local28 |= local51.aByteArray11 != null;
			}
		}
		this.anIntArray64 = new int[this.anInt857];
		this.anIntArray69 = new int[this.anInt857];
		this.anIntArray68 = new int[this.anInt857];
		this.anIntArray74 = new int[this.anInt857];
		this.aShortArray14 = new short[this.anInt857];
		this.anIntArray72 = new int[this.anInt859];
		this.anIntArray75 = new int[this.anInt859];
		this.anIntArray71 = new int[this.anInt859];
		if (local18) {
			this.aByteArray13 = new byte[this.anInt859];
		}
		if (local20) {
			this.aByteArray16 = new byte[this.anInt859];
		}
		if (local22) {
			this.aByteArray9 = new byte[this.anInt859];
		}
		if (local24) {
			this.anIntArray66 = new int[this.anInt859];
		}
		if (local26) {
			this.aShortArray9 = new short[this.anInt859];
		}
		if (local28) {
			this.aByteArray11 = new byte[this.anInt859];
		}
		this.aShortArray15 = new short[this.anInt859];
		this.aShortArray18 = new short[this.anInt859];
		if (this.anInt858 > 0) {
			this.aByteArray17 = new byte[this.anInt858];
			this.aShortArray13 = new short[this.anInt858];
			this.aShortArray10 = new short[this.anInt858];
			this.aShortArray16 = new short[this.anInt858];
			this.aShortArray17 = new short[this.anInt858];
			this.aShortArray12 = new short[this.anInt858];
			this.aShortArray11 = new short[this.anInt858];
			this.aByteArray15 = new byte[this.anInt858];
			this.aByteArray14 = new byte[this.anInt858];
			this.aByteArray10 = new byte[this.anInt858];
			this.aByteArray8 = new byte[this.anInt858];
			this.aByteArray12 = new byte[this.anInt858];
		}
		this.anInt857 = 0;
		this.anInt859 = 0;
		this.anInt858 = 0;
		for (@Pc(314) int local314 = 0; local314 < arg1; local314++) {
			@Pc(320) short local320 = (short) (0x1 << local314);
			@Pc(324) Class9_Sub3 local324 = arg0[local314];
			if (local324 != null) {
				for (@Pc(328) int local328 = 0; local328 < local324.anInt859; local328++) {
					if (local18 && local324.aByteArray13 != null) {
						this.aByteArray13[this.anInt859] = local324.aByteArray13[local328];
					}
					if (local20) {
						if (local324.aByteArray16 == null) {
							this.aByteArray16[this.anInt859] = local324.aByte3;
						} else {
							this.aByteArray16[this.anInt859] = local324.aByteArray16[local328];
						}
					}
					if (local22 && local324.aByteArray9 != null) {
						this.aByteArray9[this.anInt859] = local324.aByteArray9[local328];
					}
					if (local24 && local324.anIntArray66 != null) {
						this.anIntArray66[this.anInt859] = local324.anIntArray66[local328];
					}
					if (local26) {
						if (local324.aShortArray9 == null) {
							this.aShortArray9[this.anInt859] = -1;
						} else {
							this.aShortArray9[this.anInt859] = local324.aShortArray9[local328];
						}
					}
					this.aShortArray15[this.anInt859] = local324.aShortArray15[local328];
					this.aShortArray18[this.anInt859] = local320;
					this.anIntArray72[this.anInt859] = this.method544(local324, local324.anIntArray72[local328], local320);
					this.anIntArray75[this.anInt859] = this.method544(local324, local324.anIntArray75[local328], local320);
					this.anIntArray71[this.anInt859] = this.method544(local324, local324.anIntArray71[local328], local320);
					this.anInt859++;
				}
			}
		}
		@Pc(485) int local485 = 0;
		this.anInt860 = this.anInt857;
		for (@Pc(491) int local491 = 0; local491 < arg1; local491++) {
			@Pc(496) Class9_Sub3 local496 = arg0[local491];
			@Pc(501) short local501 = (short) (0x1 << local491);
			if (local496 != null) {
				for (@Pc(505) int local505 = 0; local505 < local496.anInt859; local505++) {
					if (local28) {
						this.aByteArray11[local485++] = (byte) (local496.aByteArray11 == null || local496.aByteArray11[local505] == -1 ? -1 : local496.aByteArray11[local505] + this.anInt858);
					}
				}
				for (@Pc(539) int local539 = 0; local539 < local496.anInt858; local539++) {
					@Pc(551) byte local551 = this.aByteArray17[this.anInt858] = local496.aByteArray17[local539];
					if (local551 == 0) {
						this.aShortArray13[this.anInt858] = (short) this.method544(local496, local496.aShortArray13[local539], local501);
						this.aShortArray10[this.anInt858] = (short) this.method544(local496, local496.aShortArray10[local539], local501);
						this.aShortArray16[this.anInt858] = (short) this.method544(local496, local496.aShortArray16[local539], local501);
					}
					if (local551 >= 1 && local551 <= 3) {
						this.aShortArray13[this.anInt858] = local496.aShortArray13[local539];
						this.aShortArray10[this.anInt858] = local496.aShortArray10[local539];
						this.aShortArray16[this.anInt858] = local496.aShortArray16[local539];
						this.aShortArray17[this.anInt858] = local496.aShortArray17[local539];
						this.aShortArray12[this.anInt858] = local496.aShortArray12[local539];
						this.aShortArray11[this.anInt858] = local496.aShortArray11[local539];
						this.aByteArray15[this.anInt858] = local496.aByteArray15[local539];
						this.aByteArray14[this.anInt858] = local496.aByteArray14[local539];
						this.aByteArray10[this.anInt858] = local496.aByteArray10[local539];
					}
					if (local551 == 2) {
						this.aByteArray8[this.anInt858] = local496.aByteArray8[local539];
						this.aByteArray12[this.anInt858] = local496.aByteArray12[local539];
					}
					this.anInt858++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ca;ZZZZ)V")
	public Class9_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt857 = arg0.anInt857;
		this.anInt860 = arg0.anInt860;
		this.anInt859 = arg0.anInt859;
		this.anInt858 = arg0.anInt858;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray64 = arg0.anIntArray64;
			this.anIntArray69 = arg0.anIntArray69;
			this.anIntArray68 = arg0.anIntArray68;
		} else {
			this.anIntArray64 = new int[this.anInt857];
			this.anIntArray69 = new int[this.anInt857];
			this.anIntArray68 = new int[this.anInt857];
			for (local64 = 0; local64 < this.anInt857; local64++) {
				this.anIntArray64[local64] = arg0.anIntArray64[local64];
				this.anIntArray69[local64] = arg0.anIntArray69[local64];
				this.anIntArray68[local64] = arg0.anIntArray68[local64];
			}
		}
		if (arg2) {
			this.aShortArray15 = arg0.aShortArray15;
		} else {
			this.aShortArray15 = new short[this.anInt859];
			for (local64 = 0; local64 < this.anInt859; local64++) {
				this.aShortArray15[local64] = arg0.aShortArray15[local64];
			}
		}
		if (arg3 || arg0.aShortArray9 == null) {
			this.aShortArray9 = arg0.aShortArray9;
		} else {
			this.aShortArray9 = new short[this.anInt859];
			for (local64 = 0; local64 < this.anInt859; local64++) {
				this.aShortArray9[local64] = arg0.aShortArray9[local64];
			}
		}
		this.aByteArray9 = arg0.aByteArray9;
		this.anIntArray72 = arg0.anIntArray72;
		this.anIntArray75 = arg0.anIntArray75;
		this.anIntArray71 = arg0.anIntArray71;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray16 = arg0.aByteArray16;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByte3 = arg0.aByte3;
		this.aByteArray17 = arg0.aByteArray17;
		this.aShortArray13 = arg0.aShortArray13;
		this.aShortArray10 = arg0.aShortArray10;
		this.aShortArray16 = arg0.aShortArray16;
		this.aShortArray17 = arg0.aShortArray17;
		this.aShortArray12 = arg0.aShortArray12;
		this.aShortArray11 = arg0.aShortArray11;
		this.aByteArray15 = arg0.aByteArray15;
		this.aByteArray14 = arg0.aByteArray14;
		this.aByteArray10 = arg0.aByteArray10;
		this.aByteArray8 = arg0.aByteArray8;
		this.aByteArray12 = arg0.aByteArray12;
		this.anIntArray74 = arg0.anIntArray74;
		this.anIntArray66 = arg0.anIntArray66;
		this.anIntArrayArray8 = arg0.anIntArrayArray8;
		this.anIntArrayArray9 = arg0.anIntArrayArray9;
		this.aClass48Array1 = arg0.aClass48Array1;
		this.aClass93Array1 = arg0.aClass93Array1;
		this.aClass48Array2 = arg0.aClass48Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort8 = arg0.aShort8;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	private void method521(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static27.anIntArray73[arg0];
		@Pc(7) int local7 = Static27.anIntArray67[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt857; local9++) {
			@Pc(26) int local26 = this.anIntArray69[local9] * local3 + this.anIntArray64[local9] * local7 >> 16;
			this.anIntArray69[local9] = this.anIntArray69[local9] * local7 - this.anIntArray64[local9] * local3 >> 16;
			this.anIntArray64[local9] = local26;
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
	public void method522() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt857; local1++) {
			this.anIntArray64[local1] = -this.anIntArray64[local1];
			this.anIntArray68[local1] = -this.anIntArray68[local1];
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)V")
	public void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt857; local1++) {
			this.anIntArray64[local1] += arg0;
			this.anIntArray69[local1] += arg1;
			this.anIntArray68[local1] += arg2;
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
	public void method525() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray74 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt857; local9++) {
				local15 = this.anIntArray74[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray8 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray8[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt857) {
				local65 = this.anIntArray74[local59];
				this.anIntArrayArray8[local65][local5[local65]++] = local59++;
			}
			this.anIntArray74 = null;
		}
		if (this.anIntArray66 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt859; local9++) {
			local15 = this.anIntArray66[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray9 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray9[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt859) {
			local65 = this.anIntArray66[local59];
			this.anIntArrayArray9[local65][local5[local65]++] = local59++;
		}
		this.anIntArray66 = null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIII)Lclient!gh;")
	public Class9_Sub5 method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class9_Sub5_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)V")
	public void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt857; local1++) {
			this.anIntArray64[local1] = this.anIntArray64[local1] * arg0 / 128;
			this.anIntArray69[local1] = this.anIntArray69[local1] * arg1 / 128;
			this.anIntArray68[local1] = this.anIntArray68[local1] * arg2 / 128;
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(SS)V")
	public void method528(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt859; local1++) {
			if (this.aShortArray15[local1] == arg0) {
				this.aShortArray15[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(SS)V")
	public void method529(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray9 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt859; local5++) {
			if (this.aShortArray9[local5] == arg0) {
				this.aShortArray9[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Lclient!sa;")
	@Override
	public Class9 method3595() {
		return this.method526(this.aShort2, this.aShort8, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public void method530() {
		@Pc(3) int local3 = Static27.anIntArray73[256];
		@Pc(7) int local7 = Static27.anIntArray67[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt857; local9++) {
			@Pc(26) int local26 = this.anIntArray68[local9] * local3 + this.anIntArray64[local9] * local7 >> 16;
			this.anIntArray68[local9] = this.anIntArray68[local9] * local7 - this.anIntArray64[local9] * local3 >> 16;
			this.anIntArray64[local9] = local26;
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!sa;IIIZ)V")
	@Override
	public void method3596(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class9_Sub3 local2 = (Class9_Sub3) arg0;
		local2.method537();
		local2.method541();
		Static27.anInt856++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray64;
		@Pc(18) int local18 = local2.anInt860;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt860; local20++) {
			@Pc(26) Class48 local26 = this.aClass48Array1[local20];
			if (local26.anInt2178 != 0) {
				local36 = this.anIntArray69[local20] - arg2;
				if (local36 >= local2.aShort6 && local36 <= local2.aShort4) {
					@Pc(52) int local52 = this.anIntArray64[local20] - arg1;
					if (local52 >= local2.aShort5 && local52 <= local2.aShort1) {
						@Pc(68) int local68 = this.anIntArray68[local20] - arg3;
						if (local68 >= local2.aShort3 && local68 <= local2.aShort7) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class48 local85 = local2.aClass48Array1[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray68[local79] && local36 == local2.anIntArray69[local79] && local85.anInt2178 != 0) {
									if (this.aClass48Array2 == null) {
										this.aClass48Array2 = new Class48[this.anInt860];
									}
									if (local2.aClass48Array2 == null) {
										local2.aClass48Array2 = new Class48[local18];
									}
									@Pc(125) Class48 local125 = this.aClass48Array2[local20];
									if (local125 == null) {
										local125 = this.aClass48Array2[local20] = new Class48(local26);
									}
									@Pc(142) Class48 local142 = local2.aClass48Array2[local79];
									if (local142 == null) {
										local142 = local2.aClass48Array2[local79] = new Class48(local85);
									}
									local125.anInt2173 += local85.anInt2173;
									local125.anInt2177 += local85.anInt2177;
									local125.anInt2176 += local85.anInt2176;
									local125.anInt2178 += local85.anInt2178;
									local142.anInt2173 += local26.anInt2173;
									local142.anInt2177 += local26.anInt2177;
									local142.anInt2176 += local26.anInt2176;
									local142.anInt2178 += local26.anInt2178;
									local12++;
									Static27.anIntArray65[local20] = Static27.anInt856;
									Static27.anIntArray70[local79] = Static27.anInt856;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt859; local236++) {
			if (Static27.anIntArray65[this.anIntArray72[local236]] == Static27.anInt856 && Static27.anIntArray65[this.anIntArray75[local236]] == Static27.anInt856 && Static27.anIntArray65[this.anIntArray71[local236]] == Static27.anInt856) {
				if (this.aByteArray13 == null) {
					this.aByteArray13 = new byte[this.anInt859];
				}
				this.aByteArray13[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt859; local36++) {
			if (Static27.anIntArray70[local2.anIntArray72[local36]] == Static27.anInt856 && Static27.anIntArray70[local2.anIntArray75[local36]] == Static27.anInt856 && Static27.anIntArray70[local2.anIntArray71[local36]] == Static27.anInt856) {
				if (local2.aByteArray13 == null) {
					local2.aByteArray13 = new byte[local2.anInt859];
				}
				local2.aByteArray13[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "()V")
	public void method531() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt857; local1++) {
			@Pc(7) int local7 = this.anIntArray64[local1];
			this.anIntArray64[local1] = this.anIntArray68[local1];
			this.anIntArray68[local1] = -local7;
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([B)V")
	private void method532(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg0);
		@Pc(13) Class1_Sub13 local13 = new Class1_Sub13(arg0);
		@Pc(18) Class1_Sub13 local18 = new Class1_Sub13(arg0);
		@Pc(23) Class1_Sub13 local23 = new Class1_Sub13(arg0);
		@Pc(28) Class1_Sub13 local28 = new Class1_Sub13(arg0);
		local8.anInt2395 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1764();
		@Pc(42) int local42 = local8.method1764();
		@Pc(46) int local46 = local8.method1772();
		@Pc(50) int local50 = local8.method1772();
		@Pc(54) int local54 = local8.method1772();
		@Pc(58) int local58 = local8.method1772();
		@Pc(62) int local62 = local8.method1772();
		@Pc(66) int local66 = local8.method1772();
		@Pc(70) int local70 = local8.method1764();
		@Pc(74) int local74 = local8.method1764();
		@Pc(78) int local78 = local8.method1764();
		@Pc(82) int local82 = local8.method1764();
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
		this.anInt857 = local38;
		this.anInt859 = local42;
		this.anInt858 = local46;
		this.anIntArray64 = new int[local38];
		this.anIntArray69 = new int[local38];
		this.anIntArray68 = new int[local38];
		this.anIntArray72 = new int[local42];
		this.anIntArray75 = new int[local42];
		this.anIntArray71 = new int[local42];
		if (local46 > 0) {
			this.aByteArray17 = new byte[local46];
			this.aShortArray13 = new short[local46];
			this.aShortArray10 = new short[local46];
			this.aShortArray16 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray74 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray13 = new byte[local42];
			this.aByteArray11 = new byte[local42];
			this.aShortArray9 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray16 = new byte[local42];
		} else {
			this.aByte3 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray9 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray66 = new int[local42];
		}
		this.aShortArray15 = new short[local42];
		local8.anInt2395 = 0;
		local13.anInt2395 = local165;
		local18.anInt2395 = local171;
		local23.anInt2395 = local90;
		local28.anInt2395 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1772();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1790();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1790();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1790();
			}
			this.anIntArray64[local307] = local301 + local314;
			this.anIntArray69[local307] = local303 + local324;
			this.anIntArray68[local307] = local305 + local334;
			local301 = this.anIntArray64[local307];
			local303 = this.anIntArray69[local307];
			local305 = this.anIntArray68[local307];
			if (local66 == 1) {
				this.anIntArray74[local307] = local28.method1772();
			}
		}
		local8.anInt2395 = local149;
		local13.anInt2395 = local116;
		local18.anInt2395 = local98;
		local23.anInt2395 = local134;
		local28.anInt2395 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray15[local312] = (short) local8.method1764();
			if (local50 == 1) {
				local314 = local13.method1772();
				if ((local314 & 0x1) == 1) {
					this.aByteArray13[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray13[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray11[local312] = (byte) (local314 >> 2);
					this.aShortArray9[local312] = this.aShortArray15[local312];
					this.aShortArray15[local312] = 127;
					if (this.aShortArray9[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray11[local312] = -1;
					this.aShortArray9[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray16[local312] = local18.method1756();
			}
			if (local58 == 1) {
				this.aByteArray9[local312] = local23.method1756();
			}
			if (local62 == 1) {
				this.anIntArray66[local312] = local28.method1772();
			}
		}
		this.anInt860 = -1;
		local8.anInt2395 = local143;
		local13.anInt2395 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(539) int local539 = 0;
		@Pc(546) int local546;
		for (@Pc(541) int local541 = 0; local541 < local42; local541++) {
			local546 = local13.method1772();
			if (local546 == 1) {
				local314 = local8.method1790() + local539;
				local324 = local8.method1790() + local314;
				local334 = local8.method1790() + local324;
				local539 = local334;
				this.anIntArray72[local541] = local314;
				this.anIntArray75[local541] = local324;
				this.anIntArray71[local541] = local334;
				if (local314 > this.anInt860) {
					this.anInt860 = local314;
				}
				if (local324 > this.anInt860) {
					this.anInt860 = local324;
				}
				if (local334 > this.anInt860) {
					this.anInt860 = local334;
				}
			}
			if (local546 == 2) {
				local324 = local334;
				local334 = local8.method1790() + local539;
				local539 = local334;
				this.anIntArray72[local541] = local314;
				this.anIntArray75[local541] = local324;
				this.anIntArray71[local541] = local334;
				if (local334 > this.anInt860) {
					this.anInt860 = local334;
				}
			}
			if (local546 == 3) {
				local314 = local334;
				local334 = local8.method1790() + local539;
				local539 = local334;
				this.anIntArray72[local541] = local314;
				this.anIntArray75[local541] = local324;
				this.anIntArray71[local541] = local334;
				if (local334 > this.anInt860) {
					this.anInt860 = local334;
				}
			}
			if (local546 == 4) {
				@Pc(684) int local684 = local314;
				local314 = local324;
				local324 = local684;
				local334 = local8.method1790() + local539;
				local539 = local334;
				this.anIntArray72[local541] = local314;
				this.anIntArray75[local541] = local684;
				this.anIntArray71[local541] = local334;
				if (local334 > this.anInt860) {
					this.anInt860 = local334;
				}
			}
		}
		this.anInt860++;
		local8.anInt2395 = local157;
		for (local546 = 0; local546 < local46; local546++) {
			this.aByteArray17[local546] = 0;
			this.aShortArray13[local546] = (short) local8.method1764();
			this.aShortArray10[local546] = (short) local8.method1764();
			this.aShortArray16[local546] = (short) local8.method1764();
		}
		if (this.aByteArray11 != null) {
			@Pc(772) boolean local772 = false;
			for (@Pc(774) int local774 = 0; local774 < local42; local774++) {
				@Pc(782) int local782 = this.aByteArray11[local774] & 0xFF;
				if (local782 != 255) {
					if ((this.aShortArray13[local782] & 0xFFFF) == this.anIntArray72[local774] && (this.aShortArray10[local782] & 0xFFFF) == this.anIntArray75[local774] && (this.aShortArray16[local782] & 0xFFFF) == this.anIntArray71[local774]) {
						this.aByteArray11[local774] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray11 = null;
			}
		}
		if (!local3) {
			this.aShortArray9 = null;
		}
		if (!local1) {
			this.aByteArray13 = null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(III)I")
	public int method533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt857; local1++) {
			if (this.anIntArray64[local1] == arg0 && this.anIntArray69[local1] == 0 && this.anIntArray68[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray64[this.anInt857] = arg0;
		this.anIntArray69[this.anInt857] = 0;
		this.anIntArray68[this.anInt857] = arg1;
		this.anInt860 = ++this.anInt857;
		return this.anInt857 - 1;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "()V")
	public void method534() {
		this.anIntArray74 = null;
		this.anIntArray66 = null;
		this.anIntArrayArray8 = null;
		this.anIntArrayArray9 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([[IIIIII)V")
	private void method535(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static27.method536(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static27.method536(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static27.method536(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static27.method536(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method539(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method521(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method524(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "()V")
	private void method537() {
		if (this.aBoolean45) {
			return;
		}
		this.aBoolean45 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt860; local20++) {
			@Pc(26) int local26 = this.anIntArray64[local20];
			@Pc(31) int local31 = this.anIntArray69[local20];
			@Pc(36) int local36 = this.anIntArray68[local20];
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
		this.aShort5 = (short) local8;
		this.aShort1 = (short) local14;
		this.aShort6 = (short) local10;
		this.aShort4 = (short) local16;
		this.aShort3 = (short) local12;
		this.aShort7 = (short) local18;
	}

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "()Lclient!ca;")
	public Class9_Sub3 method538() {
		@Pc(3) Class9_Sub3 local3 = new Class9_Sub3();
		if (this.aByteArray13 != null) {
			local3.aByteArray13 = new byte[this.anInt859];
			for (@Pc(13) int local13 = 0; local13 < this.anInt859; local13++) {
				local3.aByteArray13[local13] = this.aByteArray13[local13];
			}
		}
		local3.anInt857 = this.anInt857;
		local3.anInt860 = this.anInt860;
		local3.anInt859 = this.anInt859;
		local3.anInt858 = this.anInt858;
		local3.anIntArray64 = this.anIntArray64;
		local3.anIntArray69 = this.anIntArray69;
		local3.anIntArray68 = this.anIntArray68;
		local3.anIntArray72 = this.anIntArray72;
		local3.anIntArray75 = this.anIntArray75;
		local3.anIntArray71 = this.anIntArray71;
		local3.aByteArray16 = this.aByteArray16;
		local3.aByteArray9 = this.aByteArray9;
		local3.aByteArray11 = this.aByteArray11;
		local3.aShortArray15 = this.aShortArray15;
		local3.aShortArray9 = this.aShortArray9;
		local3.aByte3 = this.aByte3;
		local3.aByteArray17 = this.aByteArray17;
		local3.aShortArray13 = this.aShortArray13;
		local3.aShortArray10 = this.aShortArray10;
		local3.aShortArray16 = this.aShortArray16;
		local3.aShortArray17 = this.aShortArray17;
		local3.aShortArray12 = this.aShortArray12;
		local3.aShortArray11 = this.aShortArray11;
		local3.aByteArray15 = this.aByteArray15;
		local3.aByteArray14 = this.aByteArray14;
		local3.aByteArray10 = this.aByteArray10;
		local3.aByteArray8 = this.aByteArray8;
		local3.aByteArray12 = this.aByteArray12;
		local3.anIntArray74 = this.anIntArray74;
		local3.anIntArray66 = this.anIntArray66;
		local3.anIntArrayArray8 = this.anIntArrayArray8;
		local3.anIntArrayArray9 = this.anIntArrayArray9;
		local3.aClass48Array1 = this.aClass48Array1;
		local3.aClass93Array1 = this.aClass93Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort8 = this.aShort8;
		return local3;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
	@Override
	public int method3587() {
		if (!this.aBoolean45) {
			this.method537();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	private void method539(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static27.anIntArray73[arg0];
		@Pc(7) int local7 = Static27.anIntArray67[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt857; local9++) {
			@Pc(26) int local26 = this.anIntArray69[local9] * local7 - this.anIntArray68[local9] * local3 >> 16;
			this.anIntArray68[local9] = this.anIntArray69[local9] * local3 + this.anIntArray68[local9] * local7 >> 16;
			this.anIntArray69[local9] = local26;
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "([B)V")
	private void method540(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg0);
		@Pc(9) Class1_Sub13 local9 = new Class1_Sub13(arg0);
		@Pc(14) Class1_Sub13 local14 = new Class1_Sub13(arg0);
		@Pc(19) Class1_Sub13 local19 = new Class1_Sub13(arg0);
		@Pc(24) Class1_Sub13 local24 = new Class1_Sub13(arg0);
		@Pc(29) Class1_Sub13 local29 = new Class1_Sub13(arg0);
		@Pc(34) Class1_Sub13 local34 = new Class1_Sub13(arg0);
		local4.anInt2395 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1764();
		@Pc(48) int local48 = local4.method1764();
		@Pc(52) int local52 = local4.method1772();
		@Pc(56) int local56 = local4.method1772();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method1772();
		@Pc(82) int local82 = local4.method1772();
		@Pc(86) int local86 = local4.method1772();
		@Pc(90) int local90 = local4.method1772();
		@Pc(94) int local94 = local4.method1772();
		@Pc(98) int local98 = local4.method1764();
		@Pc(102) int local102 = local4.method1764();
		@Pc(106) int local106 = local4.method1764();
		@Pc(110) int local110 = local4.method1764();
		@Pc(114) int local114 = local4.method1764();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray17 = new byte[local52];
			local4.anInt2395 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(141) byte local141 = this.aByteArray17[local131] = local4.method1756();
				if (local141 == 0) {
					local116++;
				}
				if (local141 >= 1 && local141 <= 3) {
					local118++;
				}
				if (local141 == 2) {
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
		this.anInt857 = local44;
		this.anInt859 = local48;
		this.anInt858 = local52;
		this.anIntArray64 = new int[local44];
		this.anIntArray69 = new int[local44];
		this.anIntArray68 = new int[local44];
		this.anIntArray72 = new int[local48];
		this.anIntArray75 = new int[local48];
		this.anIntArray71 = new int[local48];
		if (local94 == 1) {
			this.anIntArray74 = new int[local44];
		}
		if (local65) {
			this.aByteArray13 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray16 = new byte[local48];
		} else {
			this.aByte3 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray9 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray66 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray9 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray11 = new byte[local48];
		}
		this.aShortArray15 = new short[local48];
		if (local52 > 0) {
			this.aShortArray13 = new short[local52];
			this.aShortArray10 = new short[local52];
			this.aShortArray16 = new short[local52];
			if (local118 > 0) {
				this.aShortArray17 = new short[local118];
				this.aShortArray12 = new short[local118];
				this.aShortArray11 = new short[local118];
				this.aByteArray15 = new byte[local118];
				this.aByteArray14 = new byte[local118];
				this.aByteArray10 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray8 = new byte[local120];
				this.aByteArray12 = new byte[local120];
			}
		}
		local4.anInt2395 = local52;
		local9.anInt2395 = local250;
		local14.anInt2395 = local256;
		local19.anInt2395 = local262;
		local24.anInt2395 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(484) int local484;
		@Pc(486) int local486;
		@Pc(496) int local496;
		@Pc(506) int local506;
		for (@Pc(479) int local479 = 0; local479 < local44; local479++) {
			local484 = local4.method1772();
			local486 = 0;
			if ((local484 & 0x1) != 0) {
				local486 = local9.method1790();
			}
			local496 = 0;
			if ((local484 & 0x2) != 0) {
				local496 = local14.method1790();
			}
			local506 = 0;
			if ((local484 & 0x4) != 0) {
				local506 = local19.method1790();
			}
			this.anIntArray64[local479] = local473 + local486;
			this.anIntArray69[local479] = local475 + local496;
			this.anIntArray68[local479] = local477 + local506;
			local473 = this.anIntArray64[local479];
			local475 = this.anIntArray69[local479];
			local477 = this.anIntArray68[local479];
			if (local94 == 1) {
				this.anIntArray74[local479] = local24.method1772();
			}
		}
		local4.anInt2395 = local242;
		local9.anInt2395 = local169;
		local14.anInt2395 = local183;
		local19.anInt2395 = local210;
		local24.anInt2395 = local192;
		local29.anInt2395 = local225;
		local34.anInt2395 = local236;
		for (local484 = 0; local484 < local48; local484++) {
			this.aShortArray15[local484] = (short) local4.method1764();
			if (local65) {
				this.aByteArray13[local484] = local9.method1756();
			}
			if (local78 == 255) {
				this.aByteArray16[local484] = local14.method1756();
			}
			if (local82 == 1) {
				this.aByteArray9[local484] = local19.method1756();
			}
			if (local86 == 1) {
				this.anIntArray66[local484] = local24.method1772();
			}
			if (local90 == 1) {
				this.aShortArray9[local484] = (short) (local29.method1764() - 1);
			}
			if (this.aByteArray11 != null) {
				if (this.aShortArray9[local484] == -1) {
					this.aByteArray11[local484] = -1;
				} else {
					this.aByteArray11[local484] = (byte) (local34.method1772() - 1);
				}
			}
		}
		this.anInt860 = -1;
		local4.anInt2395 = local219;
		local9.anInt2395 = local177;
		local486 = 0;
		local496 = 0;
		local506 = 0;
		@Pc(694) int local694 = 0;
		@Pc(701) int local701;
		@Pc(839) int local839;
		for (@Pc(696) int local696 = 0; local696 < local48; local696++) {
			local701 = local9.method1772();
			if (local701 == 1) {
				local486 = local4.method1790() + local694;
				local496 = local4.method1790() + local486;
				local506 = local4.method1790() + local496;
				local694 = local506;
				this.anIntArray72[local696] = local486;
				this.anIntArray75[local696] = local496;
				this.anIntArray71[local696] = local506;
				if (local486 > this.anInt860) {
					this.anInt860 = local486;
				}
				if (local496 > this.anInt860) {
					this.anInt860 = local496;
				}
				if (local506 > this.anInt860) {
					this.anInt860 = local506;
				}
			}
			if (local701 == 2) {
				local496 = local506;
				local506 = local4.method1790() + local694;
				local694 = local506;
				this.anIntArray72[local696] = local486;
				this.anIntArray75[local696] = local496;
				this.anIntArray71[local696] = local506;
				if (local506 > this.anInt860) {
					this.anInt860 = local506;
				}
			}
			if (local701 == 3) {
				local486 = local506;
				local506 = local4.method1790() + local694;
				local694 = local506;
				this.anIntArray72[local696] = local486;
				this.anIntArray75[local696] = local496;
				this.anIntArray71[local696] = local506;
				if (local506 > this.anInt860) {
					this.anInt860 = local506;
				}
			}
			if (local701 == 4) {
				local839 = local486;
				local486 = local496;
				local496 = local839;
				local506 = local4.method1790() + local694;
				local694 = local506;
				this.anIntArray72[local696] = local486;
				this.anIntArray75[local696] = local839;
				this.anIntArray71[local696] = local506;
				if (local506 > this.anInt860) {
					this.anInt860 = local506;
				}
			}
		}
		this.anInt860++;
		local4.anInt2395 = local268;
		local9.anInt2395 = local276;
		local14.anInt2395 = local284;
		local19.anInt2395 = local292;
		local24.anInt2395 = local298;
		local29.anInt2395 = local304;
		for (local701 = 0; local701 < local52; local701++) {
			local839 = this.aByteArray17[local701] & 0xFF;
			if (local839 == 0) {
				this.aShortArray13[local701] = (short) local4.method1764();
				this.aShortArray10[local701] = (short) local4.method1764();
				this.aShortArray16[local701] = (short) local4.method1764();
			}
			if (local839 == 1) {
				this.aShortArray13[local701] = (short) local9.method1764();
				this.aShortArray10[local701] = (short) local9.method1764();
				this.aShortArray16[local701] = (short) local9.method1764();
				this.aShortArray17[local701] = (short) local14.method1764();
				this.aShortArray12[local701] = (short) local14.method1764();
				this.aShortArray11[local701] = (short) local14.method1764();
				this.aByteArray15[local701] = local19.method1756();
				this.aByteArray14[local701] = local24.method1756();
				this.aByteArray10[local701] = local29.method1756();
			}
			if (local839 == 2) {
				this.aShortArray13[local701] = (short) local9.method1764();
				this.aShortArray10[local701] = (short) local9.method1764();
				this.aShortArray16[local701] = (short) local9.method1764();
				this.aShortArray17[local701] = (short) local14.method1764();
				this.aShortArray12[local701] = (short) local14.method1764();
				this.aShortArray11[local701] = (short) local14.method1764();
				this.aByteArray15[local701] = local19.method1756();
				this.aByteArray14[local701] = local24.method1756();
				this.aByteArray10[local701] = local29.method1756();
				this.aByteArray8[local701] = local29.method1756();
				this.aByteArray12[local701] = local29.method1756();
			}
			if (local839 == 3) {
				this.aShortArray13[local701] = (short) local9.method1764();
				this.aShortArray10[local701] = (short) local9.method1764();
				this.aShortArray16[local701] = (short) local9.method1764();
				this.aShortArray17[local701] = (short) local14.method1764();
				this.aShortArray12[local701] = (short) local14.method1764();
				this.aShortArray11[local701] = (short) local14.method1764();
				this.aByteArray15[local701] = local19.method1756();
				this.aByteArray14[local701] = local24.method1756();
				this.aByteArray10[local701] = local29.method1756();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt2395 = local131;
		local839 = local4.method1772();
		if (local839 > 0) {
			local4.anInt2395 += local839 * 4;
		}
		@Pc(1194) int local1194 = local4.method1772();
		if (local1194 > 0) {
			local4.anInt2395 += local1194 * 4;
		}
	}

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "()V")
	public void method541() {
		if (this.aClass48Array1 != null) {
			return;
		}
		this.aClass48Array1 = new Class48[this.anInt860];
		for (@Pc(10) int local10 = 0; local10 < this.anInt860; local10++) {
			this.aClass48Array1[local10] = new Class48();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt859; local25++) {
			@Pc(31) int local31 = this.anIntArray72[local25];
			@Pc(36) int local36 = this.anIntArray75[local25];
			@Pc(41) int local41 = this.anIntArray71[local25];
			@Pc(51) int local51 = this.anIntArray64[local36] - this.anIntArray64[local31];
			@Pc(61) int local61 = this.anIntArray69[local36] - this.anIntArray69[local31];
			@Pc(71) int local71 = this.anIntArray68[local36] - this.anIntArray68[local31];
			@Pc(81) int local81 = this.anIntArray64[local41] - this.anIntArray64[local31];
			@Pc(91) int local91 = this.anIntArray69[local41] - this.anIntArray69[local31];
			@Pc(101) int local101 = this.anIntArray68[local41] - this.anIntArray68[local31];
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
			if (this.aByteArray13 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray13[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class48 local211 = this.aClass48Array1[local31];
				local211.anInt2173 += local109;
				local211.anInt2177 += local117;
				local211.anInt2176 += local125;
				local211.anInt2178++;
				@Pc(240) Class48 local240 = this.aClass48Array1[local36];
				local240.anInt2173 += local109;
				local240.anInt2177 += local117;
				local240.anInt2176 += local125;
				local240.anInt2178++;
				@Pc(269) Class48 local269 = this.aClass48Array1[local41];
				local269.anInt2173 += local109;
				local269.anInt2177 += local117;
				local269.anInt2176 += local125;
				local269.anInt2178++;
			} else if (local198 == 1) {
				if (this.aClass93Array1 == null) {
					this.aClass93Array1 = new Class93[this.anInt859];
				}
				@Pc(314) Class93 local314 = this.aClass93Array1[local25] = new Class93();
				local314.anInt3794 = local109;
				local314.anInt3792 = local117;
				local314.anInt3793 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBSB)I")
	public int method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray72[this.anInt859] = arg0;
		this.anIntArray75[this.anInt859] = arg1;
		this.anIntArray71[this.anInt859] = arg2;
		this.aByteArray13[this.anInt859] = 1;
		this.aByteArray11[this.anInt859] = -1;
		this.aShortArray15[this.anInt859] = arg3;
		this.aShortArray9[this.anInt859] = -1;
		this.aByteArray9[this.anInt859] = arg4;
		return this.anInt859++;
	}

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "()V")
	public void method543() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt857; local1++) {
			@Pc(7) int local7 = this.anIntArray68[local1];
			this.anIntArray68[local1] = this.anIntArray64[local1];
			this.anIntArray64[local1] = -local7;
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ca;IS)I")
	private int method544(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray64[arg1];
		@Pc(9) int local9 = arg0.anIntArray69[arg1];
		@Pc(14) int local14 = arg0.anIntArray68[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt857; local16++) {
			if (local4 == this.anIntArray64[local16] && local9 == this.anIntArray69[local16] && local14 == this.anIntArray68[local16]) {
				this.aShortArray14[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray64[this.anInt857] = local4;
		this.anIntArray69[this.anInt857] = local9;
		this.anIntArray68[this.anInt857] = local14;
		this.aShortArray14[this.anInt857] = arg2;
		if (arg0.anIntArray74 != null) {
			this.anIntArray74[this.anInt857] = arg0.anIntArray74[arg1];
		}
		return this.anInt857++;
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(III)V")
	public void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg2 != 0) {
			local5 = Static27.anIntArray73[arg2];
			local9 = Static27.anIntArray67[arg2];
			for (local11 = 0; local11 < this.anInt857; local11++) {
				local28 = this.anIntArray69[local11] * local5 + this.anIntArray64[local11] * local9 >> 16;
				this.anIntArray69[local11] = this.anIntArray69[local11] * local9 - this.anIntArray64[local11] * local5 >> 16;
				this.anIntArray64[local11] = local28;
			}
		}
		if (arg0 != 0) {
			local5 = Static27.anIntArray73[arg0];
			local9 = Static27.anIntArray67[arg0];
			for (local11 = 0; local11 < this.anInt857; local11++) {
				local28 = this.anIntArray69[local11] * local9 - this.anIntArray68[local11] * local5 >> 16;
				this.anIntArray68[local11] = this.anIntArray69[local11] * local5 + this.anIntArray68[local11] * local9 >> 16;
				this.anIntArray69[local11] = local28;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static27.anIntArray73[arg1];
		local9 = Static27.anIntArray67[arg1];
		for (local11 = 0; local11 < this.anInt857; local11++) {
			local28 = this.anIntArray68[local11] * local5 + this.anIntArray64[local11] * local9 >> 16;
			this.anIntArray68[local11] = this.anIntArray68[local11] * local9 - this.anIntArray64[local11] * local5 >> 16;
			this.anIntArray64[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!ca;")
	public Class9_Sub3 method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method537();
		@Pc(6) int local6 = arg4 + this.aShort5;
		@Pc(11) int local11 = arg4 + this.aShort1;
		@Pc(16) int local16 = arg6 + this.aShort3;
		@Pc(21) int local21 = arg6 + this.aShort7;
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
		@Pc(147) Class9_Sub3 local147 = new Class9_Sub3();
		local147.anInt857 = this.anInt857;
		local147.anInt860 = this.anInt860;
		local147.anInt859 = this.anInt859;
		local147.anInt858 = this.anInt858;
		local147.anIntArray72 = this.anIntArray72;
		local147.anIntArray75 = this.anIntArray75;
		local147.anIntArray71 = this.anIntArray71;
		local147.aByteArray13 = this.aByteArray13;
		local147.aByteArray16 = this.aByteArray16;
		local147.aByteArray9 = this.aByteArray9;
		local147.aByteArray11 = this.aByteArray11;
		local147.aShortArray15 = this.aShortArray15;
		local147.aShortArray9 = this.aShortArray9;
		local147.aByte3 = this.aByte3;
		local147.aByteArray17 = this.aByteArray17;
		local147.aShortArray13 = this.aShortArray13;
		local147.aShortArray10 = this.aShortArray10;
		local147.aShortArray16 = this.aShortArray16;
		local147.aShortArray17 = this.aShortArray17;
		local147.aShortArray12 = this.aShortArray12;
		local147.aShortArray11 = this.aShortArray11;
		local147.aByteArray15 = this.aByteArray15;
		local147.aByteArray14 = this.aByteArray14;
		local147.aByteArray10 = this.aByteArray10;
		local147.aByteArray8 = this.aByteArray8;
		local147.aByteArray12 = this.aByteArray12;
		local147.anIntArray74 = this.anIntArray74;
		local147.anIntArray66 = this.anIntArray66;
		local147.anIntArrayArray8 = this.anIntArrayArray8;
		local147.anIntArrayArray9 = this.anIntArrayArray9;
		local147.aShort2 = this.aShort2;
		local147.aShort8 = this.aShort8;
		local147.aClass48Array1 = this.aClass48Array1;
		local147.aClass93Array1 = this.aClass93Array1;
		local147.aClass48Array2 = this.aClass48Array2;
		if (arg0 == 3) {
			local147.anIntArray64 = Static188.method3171(this.anIntArray64);
			local147.anIntArray69 = Static188.method3171(this.anIntArray69);
			local147.anIntArray68 = Static188.method3171(this.anIntArray68);
		} else {
			local147.anIntArray64 = this.anIntArray64;
			local147.anIntArray69 = new int[local147.anInt857];
			local147.anIntArray68 = this.anIntArray68;
		}
		@Pc(330) int local330;
		@Pc(338) int local338;
		@Pc(345) int local345;
		@Pc(349) int local349;
		@Pc(353) int local353;
		@Pc(357) int local357;
		@Pc(361) int local361;
		@Pc(383) int local383;
		@Pc(409) int local409;
		@Pc(421) int local421;
		@Pc(551) int local551;
		if (arg0 == 1) {
			for (local330 = 0; local330 < local147.anInt860; local330++) {
				local338 = this.anIntArray64[local330] + arg4;
				local345 = this.anIntArray68[local330] + arg6;
				local349 = local338 & 0x7F;
				local353 = local345 & 0x7F;
				local357 = local338 >> 7;
				local361 = local345 >> 7;
				local383 = arg2[local357][local361] * (128 - local349) + arg2[local357 + 1][local361] * local349 >> 7;
				local409 = arg2[local357][local361 + 1] * (128 - local349) + arg2[local357 + 1][local361 + 1] * local349 >> 7;
				local421 = local383 * (128 - local353) + local409 * local353 >> 7;
				local147.anIntArray69[local330] = this.anIntArray69[local330] + local421 - arg5;
			}
			for (local338 = local147.anInt860; local338 < local147.anInt857; local338++) {
				local345 = this.anIntArray64[local338] + arg4;
				local349 = this.anIntArray68[local338] + arg6;
				local353 = local345 & 0x7F;
				local357 = local349 & 0x7F;
				local361 = local345 >> 7;
				local383 = local349 >> 7;
				if (local361 >= 0 && local361 < arg2.length - 1 && local383 >= 0 && local383 < arg2[0].length - 1) {
					local409 = arg2[local361][local383] * (128 - local353) + arg2[local361 + 1][local383] * local353 >> 7;
					local421 = arg2[local361][local383 + 1] * (128 - local353) + arg2[local361 + 1][local383 + 1] * local353 >> 7;
					local551 = local409 * (128 - local357) + local421 * local357 >> 7;
					local147.anIntArray69[local338] = this.anIntArray69[local338] + local551 - arg5;
				}
			}
		} else {
			@Pc(836) int local836;
			if (arg0 == 2) {
				for (local330 = 0; local330 < local147.anInt860; local330++) {
					local338 = (this.anIntArray69[local330] << 16) / this.aShort6;
					if (local338 < arg1) {
						local345 = this.anIntArray64[local330] + arg4;
						local349 = this.anIntArray68[local330] + arg6;
						local353 = local345 & 0x7F;
						local357 = local349 & 0x7F;
						local361 = local345 >> 7;
						local383 = local349 >> 7;
						local409 = arg2[local361][local383] * (128 - local353) + arg2[local361 + 1][local383] * local353 >> 7;
						local421 = arg2[local361][local383 + 1] * (128 - local353) + arg2[local361 + 1][local383 + 1] * local353 >> 7;
						local551 = local409 * (128 - local357) + local421 * local357 >> 7;
						local147.anIntArray69[local330] = this.anIntArray69[local330] + (local551 - arg5) * (arg1 - local338) / arg1;
					} else {
						local147.anIntArray69[local330] = this.anIntArray69[local330];
					}
				}
				for (local338 = local147.anInt860; local338 < local147.anInt857; local338++) {
					local345 = (this.anIntArray69[local338] << 16) / this.aShort6;
					if (local345 < arg1) {
						local349 = this.anIntArray64[local338] + arg4;
						local353 = this.anIntArray68[local338] + arg6;
						local357 = local349 & 0x7F;
						local361 = local353 & 0x7F;
						local383 = local349 >> 7;
						local409 = local353 >> 7;
						if (local383 >= 0 && local383 < arg2.length - 1 && local409 >= 0 && local409 < arg2[0].length - 1) {
							local421 = arg2[local383][local409] * (128 - local357) + arg2[local383 + 1][local409] * local357 >> 7;
							local551 = arg2[local383][local409 + 1] * (128 - local357) + arg2[local383 + 1][local409 + 1] * local357 >> 7;
							local836 = local421 * (128 - local361) + local551 * local361 >> 7;
							local147.anIntArray69[local338] = this.anIntArray69[local338] + (local836 - arg5) * (arg1 - local345) / arg1;
						}
					} else {
						local147.anIntArray69[local338] = this.anIntArray69[local338];
					}
				}
			} else if (arg0 == 3) {
				local330 = (arg1 & 0xFF) * 4;
				local338 = (arg1 >> 8 & 0xFF) * 4;
				local147.method535(arg2, arg4, arg5, arg6, local330, local338);
			} else if (arg0 == 4) {
				local330 = this.aShort4 - this.aShort6;
				for (local338 = 0; local338 < this.anInt860; local338++) {
					local345 = this.anIntArray64[local338] + arg4;
					local349 = this.anIntArray68[local338] + arg6;
					local353 = local345 & 0x7F;
					local357 = local349 & 0x7F;
					local361 = local345 >> 7;
					local383 = local349 >> 7;
					local409 = arg3[local361][local383] * (128 - local353) + arg3[local361 + 1][local383] * local353 >> 7;
					local421 = arg3[local361][local383 + 1] * (128 - local353) + arg3[local361 + 1][local383 + 1] * local353 >> 7;
					local551 = local409 * (128 - local357) + local421 * local357 >> 7;
					local147.anIntArray69[local338] = this.anIntArray69[local338] + local551 + local330 - arg5;
				}
				for (local345 = local147.anInt860; local345 < local147.anInt857; local345++) {
					local349 = this.anIntArray64[local345] + arg4;
					local353 = this.anIntArray68[local345] + arg6;
					local357 = local349 & 0x7F;
					local361 = local353 & 0x7F;
					local383 = local349 >> 7;
					local409 = local353 >> 7;
					if (local383 >= 0 && local383 < arg3.length - 1 && local409 >= 0 && local409 < arg3[0].length - 1) {
						local421 = arg3[local383][local409] * (128 - local357) + arg3[local383 + 1][local409] * local357 >> 7;
						local551 = arg3[local383][local409 + 1] * (128 - local357) + arg3[local383 + 1][local409 + 1] * local357 >> 7;
						local836 = local421 * (128 - local361) + local551 * local361 >> 7;
						local147.anIntArray69[local345] = this.anIntArray69[local345] + local836 + local330 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local330 = this.aShort4 - this.aShort6;
				@Pc(1315) int local1315;
				for (local338 = 0; local338 < this.anInt860; local338++) {
					local345 = this.anIntArray64[local338] + arg4;
					local349 = this.anIntArray68[local338] + arg6;
					local353 = local345 & 0x7F;
					local357 = local349 & 0x7F;
					local361 = local345 >> 7;
					local383 = local349 >> 7;
					local409 = arg2[local361][local383] * (128 - local353) + arg2[local361 + 1][local383] * local353 >> 7;
					local421 = arg2[local361][local383 + 1] * (128 - local353) + arg2[local361 + 1][local383 + 1] * local353 >> 7;
					local551 = local409 * (128 - local357) + local421 * local357 >> 7;
					local409 = arg3[local361][local383] * (128 - local353) + arg3[local361 + 1][local383] * local353 >> 7;
					local421 = arg3[local361][local383 + 1] * (128 - local353) + arg3[local361 + 1][local383 + 1] * local353 >> 7;
					local836 = local409 * (128 - local357) + local421 * local357 >> 7;
					local1315 = local551 - local836;
					local147.anIntArray69[local338] = ((this.anIntArray69[local338] << 8) / local330 * local1315 >> 8) - (arg5 - local551);
				}
				for (local345 = local147.anInt860; local345 < local147.anInt857; local345++) {
					local349 = this.anIntArray64[local345] + arg4;
					local353 = this.anIntArray68[local345] + arg6;
					local357 = local349 & 0x7F;
					local361 = local353 & 0x7F;
					local383 = local349 >> 7;
					local409 = local353 >> 7;
					if (local383 >= 0 && local383 < arg2.length - 1 && local383 < arg3.length - 1 && local409 >= 0 && local409 < arg2[0].length - 1 && local409 < arg3[0].length - 1) {
						local421 = arg2[local383][local409] * (128 - local357) + arg2[local383 + 1][local409] * local357 >> 7;
						local551 = arg2[local383][local409 + 1] * (128 - local357) + arg2[local383 + 1][local409 + 1] * local357 >> 7;
						local836 = local421 * (128 - local361) + local551 * local361 >> 7;
						local421 = arg3[local383][local409] * (128 - local357) + arg3[local383 + 1][local409] * local357 >> 7;
						local551 = arg3[local383][local409 + 1] * (128 - local357) + arg3[local383 + 1][local409 + 1] * local357 >> 7;
						local1315 = local421 * (128 - local361) + local551 * local361 >> 7;
						@Pc(1531) int local1531 = local836 - local1315;
						local147.anIntArray69[local345] = ((this.anIntArray69[local345] << 8) / local330 * local1531 >> 8) - (arg5 - local836);
					}
				}
			}
		}
		this.aBoolean45 = false;
		return local147;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()Z")
	@Override
	public boolean method3597() {
		return true;
	}

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "()V")
	public void method548() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt857; local1++) {
			this.anIntArray68[local1] = -this.anIntArray68[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt859; local18++) {
			@Pc(24) int local24 = this.anIntArray72[local18];
			this.anIntArray72[local18] = this.anIntArray71[local18];
			this.anIntArray71[local18] = local24;
		}
		this.method549();
	}

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "()V")
	private void method549() {
		this.aClass48Array1 = null;
		this.aClass48Array2 = null;
		this.aClass93Array1 = null;
		this.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(IIIII)Lclient!sl;")
	public Class9_Sub5_Sub1 method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class9_Sub5_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}
}
