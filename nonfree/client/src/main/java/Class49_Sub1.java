import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public abstract class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	protected int anInt7049;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	protected int anInt7056;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	protected int anInt7068;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "I")
	protected int anInt7078;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!js;")
	protected final Class128_Sub1 aClass128_Sub1_11;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	protected final int anInt7074;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	protected final int anInt7067;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!js;II)V")
	protected Class49_Sub1(@OriginalArg(0) Class128_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass128_Sub1_11 = arg0;
		this.anInt7074 = arg1;
		this.anInt7067 = arg2;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected final void method5639(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class59 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass128_Sub1_11.method2701()) {
			throw new IllegalStateException();
		}
		this.method5363(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class59_Sub2 local18 = (Class59_Sub2) arg6;
		this.method5362(local18.anIntArray247, local18.anIntArray246, Static67.anInt7075 - arg7, -arg8 - (Static67.anInt7077 - Static67.anInt7070));
	}

	@OriginalMember(owner = "client!de", name = "UA", descriptor = "()I")
	@Override
	public final int UA() {
		return this.anInt7074;
	}

	@OriginalMember(owner = "client!de", name = "YA", descriptor = "(IIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "ka", descriptor = "(IIII)V")
	@Override
	public final void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7078 = arg0;
		this.anInt7049 = arg1;
		this.anInt7056 = arg2;
		this.anInt7068 = arg3;
	}

	@OriginalMember(owner = "client!de", name = "ja", descriptor = "()I")
	@Override
	public final int ja() {
		return this.anInt7078 + this.anInt7074 + this.anInt7056;
	}

	@OriginalMember(owner = "client!de", name = "qa", descriptor = "()I")
	@Override
	public final int qa() {
		return this.anInt7067;
	}

	@OriginalMember(owner = "client!de", name = "JA", descriptor = "()I")
	@Override
	public final int JA() {
		return this.anInt7049 + this.anInt7067 + this.anInt7068;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([I[III)V")
	protected abstract void method5362(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!ea;II)V")
	public abstract void method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!de", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass128_Sub1_11.method2701()) {
			throw new IllegalStateException();
		}
		this.method5363(arg0, arg1, arg2, arg3, arg4, arg5);
		Static67.anInt7069 = arg7;
		if (arg6 != 1) {
			Static67.anInt7065 = arg7 >>> 24;
			Static67.anInt7064 = 256 - Static67.anInt7065;
			if (arg6 == 0) {
				Static67.anInt7062 = arg7 >> 16 & 0xFF;
				Static67.anInt7063 = arg7 >> 8 & 0xFF;
				Static67.anInt7059 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static67.anInt7061 = arg7 >>> 24;
				Static67.anInt7071 = 256 - Static67.anInt7061;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static67.anInt7071 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static67.anInt7071 & 0xFF0000;
				Static67.anInt7051 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5364(1);
		} else if (arg6 == 0) {
			this.method5364(0);
		} else if (arg6 == 3) {
			this.method5364(3);
		} else if (arg6 == 2) {
			this.method5364(2);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FFFFFF)V")
	private void method5363(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7078 + this.anInt7074 + this.anInt7056;
		@Pc(17) int local17 = this.anInt7049 + this.anInt7067 + this.anInt7068;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7074 || local17 != this.anInt7067) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7049;
			local65 = local53 * (float) this.anInt7049;
			local71 = local32 * (float) this.anInt7078;
			local77 = local39 * (float) this.anInt7078;
			@Pc(84) float local84 = -local32 * (float) this.anInt7056;
			@Pc(91) float local91 = -local39 * (float) this.anInt7056;
			@Pc(98) float local98 = -local46 * (float) this.anInt7068;
			@Pc(105) float local105 = -local53 * (float) this.anInt7068;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass128_Sub1_11.anInt3213) {
			local46 = this.aClass128_Sub1_11.anInt3213;
		}
		if (local53 > (float) this.aClass128_Sub1_11.anInt3200) {
			local53 = this.aClass128_Sub1_11.anInt3200;
		}
		if (local59 < (float) this.aClass128_Sub1_11.anInt3208) {
			local59 = this.aClass128_Sub1_11.anInt3208;
		}
		if (local65 > (float) this.aClass128_Sub1_11.anInt3195) {
			local65 = this.aClass128_Sub1_11.anInt3195;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static67.anInt7060 = this.aClass128_Sub1_11.anInt3197;
		Static67.anInt7073 = (int) ((float) ((int) local59 * Static67.anInt7060) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static67.anInt7050 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7074 / local71);
		Static67.anInt7072 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7067 / local77);
		Static67.anInt7053 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7074 / local77);
		Static67.anInt7076 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7067 / local71);
		Static67.anInt7052 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static67.anInt7054 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static67.anInt7058 = (this.anInt7074 >> 1 << 12) + (Static67.anInt7054 * Static67.anInt7053 >> 4);
		Static67.anInt7079 = (this.anInt7067 >> 1 << 12) + (Static67.anInt7054 * Static67.anInt7076 >> 4);
		Static67.anInt7057 = Static67.anInt7052 * Static67.anInt7050 >> 4;
		Static67.anInt7055 = Static67.anInt7052 * Static67.anInt7072 >> 4;
		Static67.anInt7075 = (int) local46;
		Static67.anInt7066 = (int) local53;
		Static67.anInt7070 = (int) local59;
		Static67.anInt7077 = (int) local65;
	}

	@OriginalMember(owner = "client!de", name = "M", descriptor = "(IIIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!de", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public final void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass128_Sub1_11.method2701()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray474 == null) {
			this.anIntArray474 = new int[4];
		}
		this.aClass128_Sub1_11.u(this.anIntArray474);
		this.aClass128_Sub1_11.Z(this.aClass128_Sub1_11.anInt3213, this.aClass128_Sub1_11.anInt3208, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.ja();
		@Pc(40) int local40 = this.JA();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.YA(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass128_Sub1_11.pa(this.anIntArray474[0], this.anIntArray474[1], this.anIntArray474[2], this.anIntArray474[3]);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
	protected abstract void method5364(@OriginalArg(0) int arg0);
}
