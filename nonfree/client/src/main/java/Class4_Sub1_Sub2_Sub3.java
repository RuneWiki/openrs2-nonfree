import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class4_Sub1_Sub2_Sub3 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!kba", name = "T", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!kba", name = "U", descriptor = "D")
	private double aDouble15;

	@OriginalMember(owner = "client!kba", name = "W", descriptor = "D")
	private double aDouble16;

	@OriginalMember(owner = "client!kba", name = "cb", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!kba", name = "ob", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!kba", name = "qb", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!kba", name = "sb", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!kba", name = "Ab", descriptor = "I")
	private int anInt5115;

	@OriginalMember(owner = "client!kba", name = "Bb", descriptor = "I")
	private int anInt5116;

	@OriginalMember(owner = "client!kba", name = "Jb", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!kba", name = "Kb", descriptor = "Lclient!ta;")
	private Class4_Sub10 aClass4_Sub10_3;

	@OriginalMember(owner = "client!kba", name = "P", descriptor = "Z")
	private boolean aBoolean334 = false;

	@OriginalMember(owner = "client!kba", name = "gb", descriptor = "I")
	private int anInt5102 = -1;

	@OriginalMember(owner = "client!kba", name = "V", descriptor = "Z")
	private boolean aBoolean335 = false;

	@OriginalMember(owner = "client!kba", name = "S", descriptor = "I")
	private int anInt5094 = 0;

	@OriginalMember(owner = "client!kba", name = "rb", descriptor = "I")
	private int anInt5107 = 0;

	@OriginalMember(owner = "client!kba", name = "xb", descriptor = "I")
	private int anInt5112 = 0;

	@OriginalMember(owner = "client!kba", name = "Eb", descriptor = "I")
	private int anInt5119 = 0;

	@OriginalMember(owner = "client!kba", name = "Db", descriptor = "I")
	private final int anInt5118;

	@OriginalMember(owner = "client!kba", name = "Z", descriptor = "I")
	public final int anInt5097;

	@OriginalMember(owner = "client!kba", name = "db", descriptor = "I")
	private final int anInt5100;

	@OriginalMember(owner = "client!kba", name = "zb", descriptor = "I")
	public final int anInt5114;

	@OriginalMember(owner = "client!kba", name = "ib", descriptor = "Z")
	private final boolean aBoolean336;

	@OriginalMember(owner = "client!kba", name = "nb", descriptor = "I")
	public final int anInt5106;

	@OriginalMember(owner = "client!kba", name = "M", descriptor = "I")
	private final int anInt5090;

	@OriginalMember(owner = "client!kba", name = "X", descriptor = "I")
	private final int anInt5095;

	@OriginalMember(owner = "client!kba", name = "ab", descriptor = "I")
	private final int anInt5098;

	@OriginalMember(owner = "client!kba", name = "J", descriptor = "I")
	private final int anInt5089;

	@OriginalMember(owner = "client!kba", name = "Hb", descriptor = "I")
	public final int anInt5122;

	@OriginalMember(owner = "client!kba", name = "pb", descriptor = "Lclient!vo;")
	private final Class361 aClass361_1;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class4_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static192.method3263(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt5118 = arg9;
		this.anInt5097 = arg11;
		this.anInt5100 = arg14;
		this.anInt5114 = arg6;
		this.aBoolean336 = arg13;
		this.anInt5106 = arg7;
		this.aBoolean335 = false;
		this.anInt5090 = arg5;
		this.anInt5095 = arg0;
		this.anInt5098 = arg10;
		this.anInt5089 = arg8;
		this.anInt5122 = arg12;
		@Pc(90) int local90 = Static275.aClass68_2.method2087(this.anInt5095).anInt4224;
		if (local90 == -1) {
			this.aClass361_1 = null;
		} else {
			this.aClass361_1 = Static115.aClass227_1.method5968(local90);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!sk;Lclient!ha;Lclient!ka;)V")
	private void method4596(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class17 arg2) {
		arg2.method5425(arg0);
		@Pc(9) Class284[] local9 = arg2.method5417();
		@Pc(12) Class353[] local12 = arg2.method5415();
		if ((this.aClass4_Sub10_3 == null || this.aClass4_Sub10_3.aBoolean651) && (local9 != null || local12 != null)) {
			this.aClass4_Sub10_3 = Static536.method7851(Static101.anInt2262, true);
		}
		if (this.aClass4_Sub10_3 != null) {
			this.aClass4_Sub10_3.method7849(arg1, (long) Static101.anInt2262, local9, local12);
			this.aClass4_Sub10_3.method7853(super.aByte123, super.aShort118, super.aShort117, super.aShort116, super.aShort119);
		}
	}

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "(I)V")
	@Override
	public void method7707() {
		super.aShort116 = super.aShort119 = (short) (this.aDouble20 / 512.0D);
		super.aShort118 = super.aShort117 = (short) (this.aDouble14 / 512.0D);
	}

	@OriginalMember(owner = "client!kba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub10_3 != null) {
			this.aClass4_Sub10_3.method7847();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
	public void method4597(@OriginalArg(1) int arg0) {
		this.aBoolean335 = true;
		this.aDouble20 += this.aDouble19 * (double) arg0;
		this.aDouble14 += (double) arg0 * this.aDouble21;
		if (this.aBoolean336) {
			this.aDouble15 = Static192.method3263((int) this.aDouble20, (int) this.aDouble14, super.aByte123) - this.anInt5090;
		} else if (this.anInt5089 == -1) {
			this.aDouble15 += this.aDouble16 * (double) arg0;
		} else {
			this.aDouble15 += (double) arg0 * this.aDouble16 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble18;
			this.aDouble16 += (double) arg0 * this.aDouble18;
		}
		this.anInt5116 = (int) (Math.atan2(this.aDouble21, this.aDouble19) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5115 = (int) (Math.atan2(this.aDouble16, this.aDouble17) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass361_1 == null) {
			return;
		}
		this.anInt5094 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass361_1.anIntArray642[this.anInt5107] >= this.anInt5094) {
						return;
					}
					this.anInt5094 -= this.aClass361_1.anIntArray642[this.anInt5107];
					this.anInt5107++;
					if (this.aClass361_1.anIntArray638.length <= this.anInt5107) {
						this.anInt5107 -= this.aClass361_1.anInt9863;
						if (this.anInt5107 < 0 || this.anInt5107 >= this.aClass361_1.anIntArray638.length) {
							this.anInt5107 = 0;
						}
					}
					this.anInt5102 = this.anInt5107 + 1;
				} while (this.anInt5102 < this.aClass361_1.anIntArray638.length);
				this.anInt5102 -= this.aClass361_1.anInt9863;
			} while (this.anInt5102 >= 0 && this.anInt5102 < this.aClass361_1.anIntArray638.length);
			this.anInt5102 = -1;
		}
	}

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		return false;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
	public void method4598() {
		if (this.aClass4_Sub10_3 != null) {
			this.aClass4_Sub10_3.method7847();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		@Pc(16) Class17 local16 = this.method4603(arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class39 local23 = arg0.method7546();
		local23.method7237(this.anInt5115);
		local23.method7247(this.anInt5116);
		local23.method7244((int) this.aDouble14, (int) this.aDouble15, (int) this.aDouble20);
		this.method4596(local23, arg0, local16);
		@Pc(53) Class4_Sub8 local53 = Static271.method4457(false, 1);
		if (Static279.aBoolean329) {
			local16.method5413(local23, local53.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			local16.method5411(local23, local53.aClass4_Sub5Array1[0], 0);
		}
		if (this.aClass4_Sub10_3 != null) {
			@Pc(81) Class85 local81 = this.aClass4_Sub10_3.method7850();
			if (Static279.aBoolean329) {
				arg0.method7551(local81, Static401.anInt7417);
			} else {
				arg0.method7538(local81);
			}
		}
		this.aBoolean334 = local16.F();
		this.anInt5112 = local16.fa();
		this.anInt5119 = local16.ma();
		return local53;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aBoolean334;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIII)V")
	public void method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean335) {
			local12 = arg2 - super.anInt8916;
			@Pc(19) double local19 = (double) (arg1 - super.anInt8911);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble20 = (double) this.anInt5118 * local19 / local28 + (double) super.anInt8911;
			this.aDouble14 = (double) super.anInt8916 + (double) this.anInt5118 * local12 / local28;
			if (this.aBoolean336) {
				this.aDouble15 = Static192.method3263((int) this.aDouble20, (int) this.aDouble14, super.aByte123) - this.anInt5090;
			} else {
				this.aDouble15 = super.anInt8915;
			}
		}
		local12 = this.anInt5106 + 1 - arg0;
		this.aDouble21 = ((double) arg2 - this.aDouble14) / local12;
		this.aDouble19 = ((double) arg1 - this.aDouble20) / local12;
		this.aDouble17 = Math.sqrt(this.aDouble21 * this.aDouble21 + this.aDouble19 * this.aDouble19);
		if (this.anInt5089 == -1) {
			this.aDouble16 = ((double) arg3 - this.aDouble15) / local12;
		} else {
			if (!this.aBoolean335) {
				this.aDouble16 = -this.aDouble17 * Math.tan((double) this.anInt5089 * 0.02454369D);
			}
			this.aDouble18 = ((double) arg3 - local12 * this.aDouble16 - this.aDouble15) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
	public void method4602() {
		if (this.aBoolean335 || this.anInt5098 == 0) {
			return;
		}
		@Pc(19) Class4_Sub1_Sub2_Sub1 local19 = null;
		@Pc(27) int local27;
		if (this.anInt5098 >= 0) {
			local27 = this.anInt5098 - 1;
			@Pc(34) Class3_Sub28 local34 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local27);
			if (local34 != null) {
				local19 = local34.aClass4_Sub1_Sub2_Sub1_Sub1_2;
			}
		} else {
			local27 = -this.anInt5098 - 1;
			if (Static97.anInt2234 == local27) {
				local19 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2;
			} else {
				local19 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local27];
			}
		}
		if (local19 == null) {
			return;
		}
		super.anInt8916 = local19.anInt8916;
		super.anInt8911 = local19.anInt8911;
		super.anInt8915 = Static192.method3263(local19.anInt8911, local19.anInt8916, super.aByte123) - this.anInt5090;
		if (this.anInt5100 < 0) {
			return;
		}
		@Pc(92) Class143 local92 = local19.method5058();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		if (local92.anIntArrayArray32 != null && local92.anIntArrayArray32[this.anInt5100] != null) {
			local96 = local92.anIntArrayArray32[this.anInt5100][2];
			local94 = local92.anIntArrayArray32[this.anInt5100][0];
		}
		if (local92.anIntArrayArray31 != null && local92.anIntArrayArray31[this.anInt5100] != null) {
			local96 += local92.anIntArrayArray31[this.anInt5100][2];
			local94 += local92.anIntArrayArray31[this.anInt5100][0];
		}
		if (local94 != 0 || local96 != 0) {
			@Pc(163) int local163 = local19.aClass63_7.method1994();
			@Pc(165) int local165 = local163;
			if (local19.anIntArray305 != null && local19.anIntArray305[this.anInt5100] != -1) {
				local165 = local19.anIntArray305[this.anInt5100];
			}
			@Pc(189) int local189 = local165 - local163 & 0x3FFF;
			@Pc(193) int local193 = Class21.anIntArray656[local189];
			@Pc(197) int local197 = Class21.anIntArray655[local189];
			@Pc(207) int local207 = local94 * local197 + local96 * local193 >> 14;
			local96 = local197 * local96 - local94 * local193 >> 14;
			super.anInt8911 += local96;
			super.anInt8916 += local207;
		}
		return;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
		@Pc(9) Class17 local9 = this.method4603(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(21) Class39 local21 = arg0.method7546();
		local21.method7237(this.anInt5115);
		local21.method7247(this.anInt5116);
		local21.method7244((int) this.aDouble14, (int) this.aDouble15, (int) this.aDouble20);
		this.anInt5112 = local9.fa();
		this.anInt5119 = local9.ma();
		this.method4596(local21, arg0, local9);
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.anInt5112;
	}

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!ha;IZ)Lclient!ka;")
	private Class17 method4603(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class145 local14 = Static275.aClass68_2.method2087(this.anInt5095);
		return local14.method3711(this.anInt5107, Static115.aClass227_1, this.anInt5094, arg1, arg0, this.anInt5102);
	}

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 > -4) {
			this.method4603(null, 98);
		}
		return this.anInt5119;
	}
}
