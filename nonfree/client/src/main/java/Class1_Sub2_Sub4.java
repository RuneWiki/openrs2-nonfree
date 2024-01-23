import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "F")
	private float aFloat1;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Lclient!oi;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "Z")
	private boolean aBoolean47;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "Z")
	private boolean aBoolean45;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!k;)V")
	public Class1_Sub2_Sub4(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aClass81_1 = new Class81(arg0);
		this.aBoolean47 = arg0.method3793() == 1;
		this.aBoolean45 = arg0.method3793() == 1;
		arg0.method3793();
		arg0.method3793();
		@Pc(46) int local46 = arg0.method3793() & 0x3;
		this.anInt915 = arg0.method3802();
		this.anInt922 = arg0.method3802();
		arg0.method3793();
		arg0.method3793();
	}

	@OriginalMember(owner = "client!dd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
	public void method670(@OriginalArg(1) int arg0) {
		if (this.anIntArray53 == null || this.anInt922 == 0 && this.anInt915 == 0) {
			return;
		}
		if (Static63.anIntArray94 == null || this.anIntArray53.length > Static63.anIntArray94.length) {
			Static63.anIntArray94 = new int[this.anIntArray53.length];
		}
		@Pc(46) int local46 = this.anIntArray53.length;
		@Pc(51) int local51 = arg0 * this.anInt915;
		@Pc(55) int local55 = local46 - 1;
		@Pc(64) int local64 = this.anIntArray53.length == 4096 ? 64 : 128;
		@Pc(68) int local68 = local64 - 1;
		@Pc(75) int local75 = local64 * arg0 * this.anInt922;
		for (@Pc(77) int local77 = 0; local77 < local46; local77 += local64) {
			@Pc(85) int local85 = local55 & local77 + local75;
			for (@Pc(87) int local87 = 0; local87 < local64; local87++) {
				@Pc(94) int local94 = local77 + local87;
				@Pc(103) int local103 = (local68 & local87 + local51) + local85;
				Static63.anIntArray94[local94] = this.anIntArray53[local103];
			}
		}
		@Pc(132) int[] local132 = this.anIntArray53;
		this.anIntArray53 = Static63.anIntArray94;
		Static63.anIntArray94 = local132;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!mb;ZLclient!mf;F)[I")
	public int[] method671(@OriginalArg(1) Class70 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) float arg3) {
		if (this.anIntArray53 == null || arg3 != this.aFloat1) {
			if (!this.aClass81_1.method2542(arg2, arg0)) {
				return null;
			}
			@Pc(34) int local34 = arg1 ? 64 : 128;
			this.anIntArray53 = this.aClass81_1.method2540(this.aBoolean45, arg0, true, local34, arg2, (double) arg3, local34);
			this.aFloat1 = arg3;
			if (this.aBoolean47) {
				@Pc(58) int[] local58 = new int[local34];
				@Pc(61) int[] local61 = new int[local34];
				@Pc(64) int[] local64 = new int[local34];
				@Pc(69) int[] local69 = new int[local34 * local34];
				@Pc(77) int local77 = local34 - 1;
				@Pc(81) int local81 = local34 * local34;
				@Pc(85) int local85 = local34 - 1;
				@Pc(88) int local88 = local34;
				@Pc(89) int local89 = local34;
				@Pc(95) int local95;
				for (@Pc(91) int local91 = 2; local91 >= 0; local91--) {
					for (local95 = local85; local95 >= 0; local95--) {
						local88--;
						@Pc(103) int local103 = this.anIntArray53[local88];
						local64[local95] += local103 >> 16 & 0xFF;
						local61[local95] += local103 >> 8 & 0xFF;
						local58[local95] += local103 & 0xFF;
					}
					if (local88 == 0) {
						local88 = local81;
					}
				}
				@Pc(152) int local152 = local81;
				for (@Pc(154) int local154 = local77; local154 >= 0; local154--) {
					@Pc(158) int local158 = 1;
					@Pc(161) int local161 = 0;
					@Pc(163) int local163 = 0;
					@Pc(164) int local164 = 0;
					@Pc(166) int local166 = 1;
					for (local95 = 2; local95 >= 0; local95--) {
						local166--;
						local163 += local58[local166];
						local161 += local61[local166];
						local164 += local64[local166];
						if (local166 == 0) {
							local166 = local34;
						}
					}
					for (local95 = local85; local95 >= 0; local95--) {
						local158--;
						@Pc(208) int local208 = local164 / 9;
						@Pc(212) int local212 = local161 / 9;
						local166--;
						@Pc(217) int local217 = local163 / 9;
						local152--;
						local69[local152] = local217 | local212 << 8 | local208 << 16;
						local161 += local61[local166] - local61[local158];
						local163 += local58[local166] - local58[local158];
						local164 += local64[local166] - local64[local158];
						if (local158 == 0) {
							local158 = local34;
						}
						if (local166 == 0) {
							local166 = local34;
						}
					}
					for (local95 = local85; local95 >= 0; local95--) {
						local88--;
						@Pc(286) int local286 = this.anIntArray53[local88];
						local89--;
						@Pc(292) int local292 = this.anIntArray53[local89];
						local64[local95] += (local286 >> 16 & 0xFF) - (local292 >> 16 & 0xFF);
						local61[local95] += (local286 >> 8 & 0xFF) - ((local292 & 0xFF48) >> 8);
						local58[local95] += (local286 & 0xFF) - (local292 & 0xFF);
					}
					if (local89 == 0) {
						local89 = local81;
					}
					if (local88 == 0) {
						local88 = local81;
					}
				}
				this.anIntArray53 = local69;
			}
		}
		return this.anIntArray53;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!mb;Lclient!mf;I)Z")
	public boolean method673(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Interface3 arg1) {
		return this.aClass81_1.method2542(arg1, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!mf;ZILclient!mb;)[I")
	public int[] method675(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class70 arg2) {
		if (this.aClass81_1.method2542(arg0, arg2)) {
			@Pc(29) int local29 = arg1 ? 64 : 128;
			return this.aClass81_1.method2540(this.aBoolean45, arg2, false, local29, arg0, 1.0D, local29);
		} else {
			return null;
		}
	}
}
