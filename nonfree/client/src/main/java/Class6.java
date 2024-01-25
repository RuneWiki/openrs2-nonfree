import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class6 implements Interface9 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!ne;")
	private final Class166 aClass166_1 = new Class166(256);

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!nl;")
	private final Class171 aClass171_3;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "Lclient!nl;")
	private final Class171 aClass171_4;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[Lclient!kb;")
	private final Class132[] aClass132Array1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!nl;Lclient!nl;Lclient!nl;)V")
	public Class6(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_3 = arg1;
		this.aClass171_4 = arg2;
		@Pc(24) Class2_Sub16 local24 = new Class2_Sub16(arg0.method3745(0, 0));
		@Pc(28) int local28 = local24.method5312();
		this.aClass132Array1 = new Class132[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5350() == 1) {
				this.aClass132Array1[local34] = new Class132();
			}
		}
		for (@Pc(60) int local60 = 0; local60 < local28; local60++) {
			if (this.aClass132Array1[local60] != null) {
				this.aClass132Array1[local60].aBoolean255 = local24.method5350() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < local28; local92++) {
			if (this.aClass132Array1[local92] != null) {
				this.aClass132Array1[local92].aBoolean252 = local24.method5350() == 1;
			}
		}
		for (@Pc(124) int local124 = 0; local124 < local28; local124++) {
			if (this.aClass132Array1[local124] != null) {
				this.aClass132Array1[local124].aBoolean249 = local24.method5350() == 1;
			}
		}
		for (@Pc(150) int local150 = 0; local150 < local28; local150++) {
			if (this.aClass132Array1[local150] != null) {
				this.aClass132Array1[local150].aBoolean253 = local24.method5350() == 1;
			}
		}
		for (@Pc(176) int local176 = 0; local176 < local28; local176++) {
			if (this.aClass132Array1[local176] != null) {
				this.aClass132Array1[local176].aByte32 = local24.method5330();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < local28; local201++) {
			if (this.aClass132Array1[local201] != null) {
				this.aClass132Array1[local201].aByte34 = local24.method5330();
			}
		}
		for (@Pc(222) int local222 = 0; local222 < local28; local222++) {
			if (this.aClass132Array1[local222] != null) {
				this.aClass132Array1[local222].aByte33 = local24.method5330();
			}
		}
		for (@Pc(243) int local243 = 0; local243 < local28; local243++) {
			if (this.aClass132Array1[local243] != null) {
				this.aClass132Array1[local243].aByte35 = local24.method5330();
			}
		}
		for (@Pc(268) int local268 = 0; local268 < local28; local268++) {
			if (this.aClass132Array1[local268] != null) {
				this.aClass132Array1[local268].aShort52 = (short) local24.method5312();
			}
		}
		for (@Pc(294) int local294 = 0; local294 < local28; local294++) {
			if (this.aClass132Array1[local294] != null) {
				this.aClass132Array1[local294].aByte31 = local24.method5330();
			}
		}
		for (@Pc(319) int local319 = 0; local319 < local28; local319++) {
			if (this.aClass132Array1[local319] != null) {
				this.aClass132Array1[local319].aByte29 = local24.method5330();
			}
		}
		for (@Pc(340) int local340 = 0; local340 < local28; local340++) {
			if (this.aClass132Array1[local340] != null) {
				this.aClass132Array1[local340].aBoolean256 = local24.method5350() == 1;
			}
		}
		for (@Pc(366) int local366 = 0; local366 < local28; local366++) {
			if (this.aClass132Array1[local366] != null) {
				this.aClass132Array1[local366].aBoolean251 = local24.method5350() == 1;
			}
		}
		for (@Pc(398) int local398 = 0; local398 < local28; local398++) {
			if (this.aClass132Array1[local398] != null) {
				this.aClass132Array1[local398].aByte30 = local24.method5330();
			}
		}
		for (@Pc(423) int local423 = 0; local423 < local28; local423++) {
			if (this.aClass132Array1[local423] != null) {
				this.aClass132Array1[local423].aBoolean250 = local24.method5350() == 1;
			}
		}
		for (@Pc(449) int local449 = 0; local449 < local28; local449++) {
			if (this.aClass132Array1[local449] != null) {
				this.aClass132Array1[local449].aBoolean257 = local24.method5350() == 1;
			}
		}
		for (@Pc(481) int local481 = 0; local481 < local28; local481++) {
			if (this.aClass132Array1[local481] != null) {
				this.aClass132Array1[local481].aBoolean254 = local24.method5350() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method142(@OriginalArg(1) int arg0) {
		@Pc(20) Class2_Sub10_Sub17 local20 = this.method150(arg0);
		return local20 != null && local20.method5040(this.aClass171_4, this);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Lclient!kb;")
	@Override
	public Class132 method139(@OriginalArg(1) int arg0) {
		return this.aClass132Array1[arg0];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZFII)[I")
	@Override
	public int[] method141(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method150(arg3).method5037(this.aClass132Array1[arg3].aBoolean251, arg2, this, (double) arg1, arg0, this.aClass171_4);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZIIF)[F")
	@Override
	public float[] method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method150(arg1).method5035(arg2, this.aClass171_4, this.aClass132Array1[arg1].aBoolean251, this, arg0);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIZIF)[I")
	@Override
	public int[] method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) float arg4) {
		return this.method150(arg0).method5038(arg2, this.aClass171_4, arg1, this, arg3, this.aClass132Array1[arg0].aBoolean251, (double) arg4);
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(II)Lclient!uj;")
	private Class2_Sub10_Sub17 method150(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub10 local10 = this.aClass166_1.method3688((long) arg0);
		if (local10 != null) {
			return (Class2_Sub10_Sub17) local10;
		}
		@Pc(33) byte[] local33 = this.aClass171_3.method3762(arg0);
		if (local33 == null) {
			return null;
		} else {
			@Pc(45) Class2_Sub10_Sub17 local45 = new Class2_Sub10_Sub17(new Class2_Sub16(local33));
			this.aClass166_1.method3693((long) arg0, local45);
			return local45;
		}
	}
}
