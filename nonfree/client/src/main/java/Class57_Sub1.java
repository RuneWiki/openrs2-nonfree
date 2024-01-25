import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public abstract class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	protected int anInt7148;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	protected int anInt7155;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	protected int anInt7157;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
	protected int anInt7162;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "Lclient!bc;")
	protected final Class19_Sub1 aClass19_Sub1_11;

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
	protected final int anInt7168;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	protected final int anInt7144;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!bc;II)V")
	protected Class57_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub1_11 = arg0;
		this.anInt7168 = arg1;
		this.anInt7144 = arg2;
	}

	@OriginalMember(owner = "client!sf", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt7144;
	}

	@OriginalMember(owner = "client!sf", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt7168;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected final void method5535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass19_Sub1_11.method489()) {
			throw new IllegalStateException();
		}
		this.method5543(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class145_Sub2 local18 = (Class145_Sub2) arg6;
		this.method5545(local18.anIntArray554, local18.anIntArray553, Static359.anInt7170 - arg7, -arg8 - (Static359.anInt7141 - Static359.anInt7149));
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFFFF)V")
	private void method5543(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7157 + this.anInt7168 + this.anInt7155;
		@Pc(17) int local17 = this.anInt7148 + this.anInt7144 + this.anInt7162;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7168 || local17 != this.anInt7144) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7148;
			local65 = local53 * (float) this.anInt7148;
			local71 = local32 * (float) this.anInt7157;
			local77 = local39 * (float) this.anInt7157;
			@Pc(84) float local84 = -local32 * (float) this.anInt7155;
			@Pc(91) float local91 = -local39 * (float) this.anInt7155;
			@Pc(98) float local98 = -local46 * (float) this.anInt7162;
			@Pc(105) float local105 = -local53 * (float) this.anInt7162;
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
		if (local46 < (float) this.aClass19_Sub1_11.lb) {
			local46 = this.aClass19_Sub1_11.lb;
		}
		if (local53 > (float) this.aClass19_Sub1_11.anInt402) {
			local53 = this.aClass19_Sub1_11.anInt402;
		}
		if (local59 < (float) this.aClass19_Sub1_11.anInt425) {
			local59 = this.aClass19_Sub1_11.anInt425;
		}
		if (local65 > (float) this.aClass19_Sub1_11.anInt421) {
			local65 = this.aClass19_Sub1_11.anInt421;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static359.anInt7154 = this.aClass19_Sub1_11.anInt430;
		Static359.anInt7156 = (int) ((float) ((int) local59 * Static359.anInt7154) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static359.anInt7153 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7168 / local71);
		Static359.anInt7164 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7144 / local77);
		Static359.anInt7169 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7168 / local77);
		Static359.anInt7150 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7144 / local71);
		Static359.anInt7140 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static359.anInt7163 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static359.anInt7145 = (this.anInt7168 >> 1 << 12) + (Static359.anInt7163 * Static359.anInt7169 >> 4);
		Static359.anInt7146 = (this.anInt7144 >> 1 << 12) + (Static359.anInt7163 * Static359.anInt7150 >> 4);
		Static359.anInt7143 = Static359.anInt7140 * Static359.anInt7153 >> 4;
		Static359.anInt7142 = Static359.anInt7140 * Static359.anInt7164 >> 4;
		Static359.anInt7170 = (int) local46;
		Static359.anInt7151 = (int) local53;
		Static359.anInt7149 = (int) local59;
		Static359.anInt7141 = (int) local65;
	}

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "()I")
	@Override
	public final int j() {
		return this.anInt7157 + this.anInt7168 + this.anInt7155;
	}

	@OriginalMember(owner = "client!sf", name = "MA", descriptor = "(IIII)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7157 = arg0;
		this.anInt7148 = arg1;
		this.anInt7155 = arg2;
		this.anInt7162 = arg3;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V")
	protected abstract void method5544(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "(IIIII)V")
	public abstract void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!ma;II)V")
	public abstract void method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "(IIIIIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt7148 + this.anInt7144 + this.anInt7162;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass19_Sub1_11.method489()) {
			throw new IllegalStateException();
		}
		this.method5543(arg0, arg1, arg2, arg3, arg4, arg5);
		Static359.anInt7160 = arg7;
		if (arg6 != 1) {
			Static359.anInt7161 = arg7 >>> 24;
			Static359.anInt7159 = 256 - Static359.anInt7161;
			if (arg6 == 0) {
				Static359.anInt7165 = arg7 >> 16 & 0xFF;
				Static359.anInt7167 = arg7 >> 8 & 0xFF;
				Static359.anInt7158 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static359.anInt7147 = arg7 >>> 24;
				Static359.anInt7166 = 256 - Static359.anInt7147;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static359.anInt7166 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static359.anInt7166 & 0xFF0000;
				Static359.anInt7152 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5544(1);
		} else if (arg6 == 0) {
			this.method5544(0);
		} else if (arg6 == 3) {
			this.method5544(3);
		} else if (arg6 == 2) {
			this.method5544(2);
		}
	}

	@OriginalMember(owner = "client!sf", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass19_Sub1_11.method489()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray541 == null) {
			this.anIntArray541 = new int[4];
		}
		this.aClass19_Sub1_11.da(this.anIntArray541);
		this.aClass19_Sub1_11.fa(this.aClass19_Sub1_11.lb, this.aClass19_Sub1_11.anInt425, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.j();
		@Pc(40) int local40 = this.T();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.r(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass19_Sub1_11.OA(this.anIntArray541[0], this.anIntArray541[1], this.anIntArray541[2], this.anIntArray541[3]);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([I[III)V")
	protected abstract void method5545(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
