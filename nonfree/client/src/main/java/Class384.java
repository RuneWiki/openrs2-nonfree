import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class384 implements Interface3 {

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "Lclient!o;")
	private final Class252 aClass252_4 = new Class252(256);

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "Lclient!cb;")
	private final Class50 aClass50_178;

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "Lclient!cb;")
	private final Class50 aClass50_179;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
	private final int anInt10187;

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "[Lclient!tca;")
	private final Class331[] aClass331Array1;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;Lclient!cb;)V")
	public Class384(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_178 = arg1;
		this.aClass50_179 = arg2;
		@Pc(22) Class5_Sub15 local22 = new Class5_Sub15(arg0.method916(0, 0));
		this.anInt10187 = local22.method3698();
		this.aClass331Array1 = new Class331[this.anInt10187];
		for (@Pc(34) int local34 = 0; local34 < this.anInt10187; local34++) {
			if (local22.method3642() == 1) {
				this.aClass331Array1[local34] = new Class331();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anInt10187; local56++) {
			if (this.aClass331Array1[local56] != null) {
				this.aClass331Array1[local56].aBoolean660 = local22.method3642() == 0;
			}
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt10187; local81++) {
			if (this.aClass331Array1[local81] != null) {
				this.aClass331Array1[local81].aBoolean659 = local22.method3642() == 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < this.anInt10187; local107++) {
			if (this.aClass331Array1[local107] != null) {
				this.aClass331Array1[local107].aBoolean658 = local22.method3642() == 1;
			}
		}
		for (@Pc(135) int local135 = 0; local135 < this.anInt10187; local135++) {
			if (this.aClass331Array1[local135] != null) {
				this.aClass331Array1[local135].aByte115 = local22.method3677();
			}
		}
		for (@Pc(156) int local156 = 0; local156 < this.anInt10187; local156++) {
			if (this.aClass331Array1[local156] != null) {
				this.aClass331Array1[local156].aByte118 = local22.method3677();
			}
		}
		for (@Pc(181) int local181 = 0; local181 < this.anInt10187; local181++) {
			if (this.aClass331Array1[local181] != null) {
				this.aClass331Array1[local181].aByte117 = local22.method3677();
			}
		}
		for (@Pc(206) int local206 = 0; local206 < this.anInt10187; local206++) {
			if (this.aClass331Array1[local206] != null) {
				this.aClass331Array1[local206].aByte114 = local22.method3677();
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt10187; local227++) {
			if (this.aClass331Array1[local227] != null) {
				this.aClass331Array1[local227].aShort102 = (short) local22.method3698();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.anInt10187; local249++) {
			if (this.aClass331Array1[local249] != null) {
				this.aClass331Array1[local249].aByte116 = local22.method3677();
			}
		}
		for (@Pc(270) int local270 = 0; local270 < this.anInt10187; local270++) {
			if (this.aClass331Array1[local270] != null) {
				this.aClass331Array1[local270].aByte113 = local22.method3677();
			}
		}
		for (@Pc(295) int local295 = 0; local295 < this.anInt10187; local295++) {
			if (this.aClass331Array1[local295] != null) {
				this.aClass331Array1[local295].aBoolean656 = local22.method3642() == 1;
			}
		}
		for (@Pc(327) int local327 = 0; local327 < this.anInt10187; local327++) {
			if (this.aClass331Array1[local327] != null) {
				this.aClass331Array1[local327].aBoolean657 = local22.method3642() == 1;
			}
		}
		for (@Pc(357) int local357 = 0; local357 < this.anInt10187; local357++) {
			if (this.aClass331Array1[local357] != null) {
				this.aClass331Array1[local357].aByte119 = local22.method3677();
			}
		}
		for (@Pc(378) int local378 = 0; local378 < this.anInt10187; local378++) {
			if (this.aClass331Array1[local378] != null) {
				this.aClass331Array1[local378].aBoolean662 = local22.method3642() == 1;
			}
		}
		for (@Pc(406) int local406 = 0; local406 < this.anInt10187; local406++) {
			if (this.aClass331Array1[local406] != null) {
				this.aClass331Array1[local406].aBoolean663 = local22.method3642() == 1;
			}
		}
		for (@Pc(438) int local438 = 0; local438 < this.anInt10187; local438++) {
			if (this.aClass331Array1[local438] != null) {
				this.aClass331Array1[local438].aBoolean661 = local22.method3642() == 1;
			}
		}
		for (@Pc(466) int local466 = 0; local466 < this.anInt10187; local466++) {
			if (this.aClass331Array1[local466] != null) {
				this.aClass331Array1[local466].anInt9138 = local22.method3642();
			}
		}
		for (@Pc(487) int local487 = 0; local487 < this.anInt10187; local487++) {
			if (this.aClass331Array1[local487] != null) {
				this.aClass331Array1[local487].anInt9139 = local22.method3671();
			}
		}
		for (@Pc(512) int local512 = 0; local512 < this.anInt10187; local512++) {
			if (this.aClass331Array1[local512] != null) {
				this.aClass331Array1[local512].anInt9140 = local22.method3642();
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method8500(@OriginalArg(0) int arg0) {
		@Pc(13) Class5_Sub2_Sub15 local13 = this.method8504(arg0);
		return local13 != null && local13.method5969(this.aClass50_179, this);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIZFI)[I")
	@Override
	public int[] method8499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method8504(arg0).method5965(arg1, this, this.aClass50_179, arg2, (double) arg3, this.aClass331Array1[arg0].aBoolean657, arg4);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIFZI)[I")
	@Override
	public int[] method8497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method8504(arg0).method5968(arg3, arg1, (double) arg2, this, this.aClass331Array1[arg0].aBoolean657, this.aClass50_179);
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(IB)Lclient!tca;")
	@Override
	public Class331 method8501(@OriginalArg(0) int arg0) {
		return this.aClass331Array1[arg0];
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)Lclient!nw;")
	private Class5_Sub2_Sub15 method8504(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2 local10 = this.aClass252_4.method5973((long) arg0);
		if (local10 != null) {
			return (Class5_Sub2_Sub15) local10;
		}
		@Pc(21) byte[] local21 = this.aClass50_178.method915(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class5_Sub2_Sub15 local33 = new Class5_Sub2_Sub15(new Class5_Sub15(local21));
			this.aClass252_4.method5974(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IFIZBI)[F")
	@Override
	public float[] method8498(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method8504(arg0).method5966(arg2, this, this.aClass331Array1[arg0].aBoolean657, arg3, this.aClass50_179);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)I")
	@Override
	public int method8502() {
		return this.anInt10187;
	}
}
