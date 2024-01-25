import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class60_Sub1_Sub1_Sub5 extends Class60_Sub1_Sub1 {

	@OriginalMember(owner = "client!qha", name = "Jb", descriptor = "D")
	private double aDouble34;

	@OriginalMember(owner = "client!qha", name = "qb", descriptor = "D")
	private double aDouble35;

	@OriginalMember(owner = "client!qha", name = "Ib", descriptor = "I")
	private int anInt8320;

	@OriginalMember(owner = "client!qha", name = "tb", descriptor = "D")
	private double aDouble36;

	@OriginalMember(owner = "client!qha", name = "ob", descriptor = "I")
	private int anInt8324;

	@OriginalMember(owner = "client!qha", name = "Lb", descriptor = "D")
	private double aDouble37;

	@OriginalMember(owner = "client!qha", name = "hb", descriptor = "D")
	private double aDouble38;

	@OriginalMember(owner = "client!qha", name = "bb", descriptor = "D")
	private double aDouble39;

	@OriginalMember(owner = "client!qha", name = "vb", descriptor = "D")
	private double aDouble40;

	@OriginalMember(owner = "client!qha", name = "ib", descriptor = "D")
	private double aDouble41;

	@OriginalMember(owner = "client!qha", name = "mb", descriptor = "Lclient!it;")
	private Class60_Sub4 aClass60_Sub4_7;

	@OriginalMember(owner = "client!qha", name = "Ob", descriptor = "I")
	private int anInt8313 = 0;

	@OriginalMember(owner = "client!qha", name = "nb", descriptor = "Z")
	private boolean aBoolean638 = false;

	@OriginalMember(owner = "client!qha", name = "V", descriptor = "Z")
	private boolean aBoolean640 = false;

	@OriginalMember(owner = "client!qha", name = "ub", descriptor = "I")
	private int anInt8327 = 0;

	@OriginalMember(owner = "client!qha", name = "Nb", descriptor = "I")
	private final int anInt8323;

	@OriginalMember(owner = "client!qha", name = "Qb", descriptor = "I")
	private final int anInt8317;

	@OriginalMember(owner = "client!qha", name = "pb", descriptor = "I")
	private final int anInt8346;

	@OriginalMember(owner = "client!qha", name = "sb", descriptor = "I")
	private final int anInt8345;

	@OriginalMember(owner = "client!qha", name = "Fb", descriptor = "I")
	public final int anInt8316;

	@OriginalMember(owner = "client!qha", name = "kb", descriptor = "I")
	private final int anInt8326;

	@OriginalMember(owner = "client!qha", name = "ab", descriptor = "I")
	public final int anInt8322;

	@OriginalMember(owner = "client!qha", name = "Kb", descriptor = "Z")
	private final boolean aBoolean639;

	@OriginalMember(owner = "client!qha", name = "W", descriptor = "I")
	private final int anInt8321;

	@OriginalMember(owner = "client!qha", name = "Eb", descriptor = "I")
	public final int anInt8314;

	@OriginalMember(owner = "client!qha", name = "eb", descriptor = "I")
	public int anInt8329;

	@OriginalMember(owner = "client!qha", name = "Db", descriptor = "Lclient!qu;")
	private final Class104 aClass104_10;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class60_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static248.method4318(arg4, arg1, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt8323 = arg5;
		this.anInt8317 = arg14;
		this.anInt8346 = arg9;
		this.anInt8345 = arg8;
		this.anInt8316 = arg12;
		this.aBoolean640 = false;
		this.anInt8326 = arg10;
		this.anInt8322 = arg11;
		this.aBoolean639 = arg13;
		this.anInt8321 = arg0;
		this.anInt8314 = arg7;
		this.anInt8329 = arg6;
		@Pc(82) int local82 = Static655.aClass172_2.method4449(this.anInt8321).anInt251;
		this.aClass104_10 = new Class104_Sub2(this, false);
		this.aClass104_10.method9035(local82);
	}

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class54 local11 = this.method7286(arg1, arg1 ^ 0x2FC4E4A9, arg0);
		if (local11 == null) {
			return;
		}
		@Pc(18) Class109 local18 = arg0.method6643();
		local18.method4607(this.anInt8320);
		local18.method4608(this.anInt8324);
		local18.method4604((int) this.aDouble34, (int) this.aDouble40, (int) this.aDouble39);
		this.anInt8313 = local11.fa();
		this.anInt8327 = local11.ma();
		this.method7287(local18, arg0, local11);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIII)V")
	public void method7282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean640) {
			local13 = (double) (arg3 - super.anInt9048);
			@Pc(19) double local19 = (double) (arg1 - super.anInt9057);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble34 = (double) this.anInt8346 * local13 / local28 + (double) super.anInt9048;
			this.aDouble39 = (double) super.anInt9057 + (double) this.anInt8346 * local19 / local28;
			if (this.aBoolean639) {
				this.aDouble40 = (double) (Static248.method4318((int) this.aDouble39, super.aByte135, (int) this.aDouble34) - this.anInt8323);
			} else {
				this.aDouble40 = (double) super.anInt9051;
			}
		}
		local13 = (double) (this.anInt8314 + 1 - arg2);
		this.aDouble35 = ((double) arg3 - this.aDouble34) / local13;
		this.aDouble36 = ((double) arg1 - this.aDouble39) / local13;
		this.aDouble38 = Math.sqrt(this.aDouble35 * this.aDouble35 + this.aDouble36 * this.aDouble36);
		if (this.anInt8345 == -1) {
			this.aDouble41 = ((double) arg0 - this.aDouble40) / local13;
		} else {
			if (!this.aBoolean640) {
				this.aDouble41 = -this.aDouble38 * Math.tan((double) this.anInt8345 * 0.02454369D);
			}
			this.aDouble37 = ((double) arg0 - this.aDouble41 * local13 - this.aDouble40) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		@Pc(11) Class54 local11 = this.method7286(2048, 801432745, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(19) Class109 local19 = arg0.method6643();
		local19.method4607(this.anInt8320);
		local19.method4608(this.anInt8324);
		local19.method4604((int) this.aDouble34, (int) this.aDouble40, (int) this.aDouble39);
		this.method7287(local19, arg0, local11);
		@Pc(49) Class60_Sub9 local49 = Static511.method7383(false, 1);
		if (Static490.aBoolean634) {
			local11.method7407(local19, local49.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			local11.method7401(local19, local49.aClass60_Sub10Array1[0], 0);
		}
		if (this.aClass60_Sub4_7 != null) {
			@Pc(81) Class209 local81 = this.aClass60_Sub4_7.method4544();
			if (Static490.aBoolean634) {
				arg0.method6685(local81, Static377.anInt6468);
			} else {
				arg0.method6634(local81);
			}
		}
		this.aBoolean638 = local11.F();
		this.anInt8313 = local11.fa();
		this.anInt8327 = local11.ma();
		return local49;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V")
	public void method7283() {
		if (this.aBoolean640 || this.anInt8326 == 0) {
			return;
		}
		@Pc(16) Class60_Sub1_Sub1_Sub3 local16 = null;
		@Pc(25) int local25;
		if (this.anInt8326 < 0) {
			local25 = -this.anInt8326 - 1;
			if (Static503.anInt8407 == local25) {
				local16 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1;
			} else {
				local16 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local25];
			}
		} else {
			local25 = this.anInt8326 - 1;
			@Pc(48) Class6_Sub11 local48 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local25);
			if (local48 != null) {
				local16 = local48.aClass60_Sub1_Sub1_Sub3_Sub2_1;
			}
		}
		if (local16 == null) {
			return;
		}
		super.anInt9057 = local16.anInt9057;
		super.anInt9048 = local16.anInt9048;
		super.anInt9051 = Static248.method4318(local16.anInt9057, super.aByte135, local16.anInt9048) - this.anInt8323;
		if (this.anInt8317 < 0) {
			return;
		}
		@Pc(85) Class396 local85 = local16.method4417(27750);
		@Pc(87) int local87 = 0;
		@Pc(89) int local89 = 0;
		if (local85.anIntArrayArray60 != null && local85.anIntArrayArray60[this.anInt8317] != null) {
			local89 = local85.anIntArrayArray60[this.anInt8317][2];
			local87 = local85.anIntArrayArray60[this.anInt8317][0];
		}
		if (local85.anIntArrayArray61 != null && local85.anIntArrayArray61[this.anInt8317] != null) {
			local87 += local85.anIntArrayArray61[this.anInt8317][0];
			local89 += local85.anIntArrayArray61[this.anInt8317][2];
		}
		if (local87 == 0 && local89 == 0) {
			return;
		}
		@Pc(165) int local165 = local16.aClass258_7.method6285(16383);
		@Pc(167) int local167 = local165;
		if (local16.anIntArray262 != null && local16.anIntArray262[this.anInt8317] != -1) {
			local167 = local16.anIntArray262[this.anInt8317];
		}
		@Pc(191) int local191 = local167 - local165 & 0x3FFF;
		@Pc(195) int local195 = Class6_Sub2_Sub12.anIntArray293[local191];
		@Pc(199) int local199 = Class6_Sub2_Sub12.anIntArray292[local191];
		@Pc(209) int local209 = local89 * local195 + local199 * local87 >> 14;
		local89 = local89 * local199 - local195 * local87 >> 14;
		super.anInt9057 += local89;
		super.anInt9048 += local209;
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		return false;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class54 method7286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2) {
		if (arg1 != 801432745) {
			this.anInt8329 = 107;
		}
		@Pc(17) Class17 local17 = Static655.aClass172_2.method4449(this.anInt8321);
		return local17.method221(arg0, this.aClass104_10, arg2, (byte) 2);
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aBoolean638;
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.anInt8313;
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!qa;ILclient!ha;Lclient!ka;)V")
	private void method7287(@OriginalArg(0) Class109 arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) Class54 arg2) {
		arg2.method7410(arg0);
		@Pc(14) Class216[] local14 = arg2.method7408();
		@Pc(17) Class173[] local17 = arg2.method7409();
		if ((this.aClass60_Sub4_7 == null || this.aClass60_Sub4_7.aBoolean376) && (local14 != null || local17 != null)) {
			this.aClass60_Sub4_7 = Static267.method4553(Static141.anInt8737, true);
		}
		if (this.aClass60_Sub4_7 != null) {
			this.aClass60_Sub4_7.method4548(arg1, (long) Static141.anInt8737, local14, local17);
			this.aClass60_Sub4_7.method4547(super.aByte135, super.aShort100, super.aShort101, super.aShort102, super.aShort99);
		}
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(B)V")
	@Override
	public void method7280() {
		super.aShort102 = super.aShort99 = (short) (int) (this.aDouble39 / 512.0D);
		super.aShort100 = super.aShort101 = (short) (int) (this.aDouble34 / 512.0D);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass60_Sub4_7 != null) {
			this.aClass60_Sub4_7.method4543();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		return arg0 == 114 ? this.anInt8327 : -90;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
	public void method7290() {
		if (this.aClass60_Sub4_7 != null) {
			this.aClass60_Sub4_7.method4543();
		}
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(II)V")
	public void method7291(@OriginalArg(0) int arg0) {
		this.aDouble39 += (double) arg0 * this.aDouble36;
		this.aDouble34 += this.aDouble35 * (double) arg0;
		this.aBoolean640 = true;
		if (this.aBoolean639) {
			this.aDouble40 = (double) (Static248.method4318((int) this.aDouble39, super.aByte135, (int) this.aDouble34) - this.anInt8323);
		} else if (this.anInt8345 == -1) {
			this.aDouble40 += (double) arg0 * this.aDouble41;
		} else {
			this.aDouble40 += (double) arg0 * this.aDouble37 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble41;
			this.aDouble41 += (double) arg0 * this.aDouble37;
		}
		this.anInt8324 = (int) (Math.atan2(this.aDouble35, this.aDouble36) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt8320 = (int) (Math.atan2(this.aDouble41, this.aDouble38) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass104_10.method9039(1) && this.aClass104_10.method9038()) {
			this.aClass104_10.method9022();
		}
	}
}
