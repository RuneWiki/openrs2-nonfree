import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class39 implements Interface4 {

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Lclient!lp;")
	private final Class195 aClass195_1 = new Class195(256);

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!vd;")
	private final Class353 aClass353_9;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!vd;")
	private final Class353 aClass353_8;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
	private final int anInt943;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "[Lclient!tha;")
	private final Class325[] aClass325Array1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;Lclient!vd;)V")
	public Class39(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_9 = arg2;
		this.aClass353_8 = arg1;
		@Pc(24) Class6_Sub40 local24 = new Class6_Sub40(arg0.method8404(0, 0));
		this.anInt943 = local24.method8571();
		this.aClass325Array1 = new Class325[this.anInt943];
		for (@Pc(36) int local36 = 0; local36 < this.anInt943; local36++) {
			if (local24.method8604() == 1) {
				this.aClass325Array1[local36] = new Class325();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt943; local57++) {
			if (this.aClass325Array1[local57] != null) {
				this.aClass325Array1[local57].aBoolean636 = local24.method8604() == 0;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt943; local83++) {
			if (this.aClass325Array1[local83] != null) {
				this.aClass325Array1[local83].aBoolean633 = local24.method8604() == 1;
			}
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt943; local114++) {
			if (this.aClass325Array1[local114] != null) {
				this.aClass325Array1[local114].aBoolean638 = local24.method8604() == 1;
			}
		}
		for (@Pc(147) int local147 = 0; local147 < this.anInt943; local147++) {
			if (this.aClass325Array1[local147] != null) {
				this.aClass325Array1[local147].aByte117 = local24.method8602();
			}
		}
		for (@Pc(173) int local173 = 0; local173 < this.anInt943; local173++) {
			if (this.aClass325Array1[local173] != null) {
				this.aClass325Array1[local173].aByte113 = local24.method8602();
			}
		}
		for (@Pc(195) int local195 = 0; local195 < this.anInt943; local195++) {
			if (this.aClass325Array1[local195] != null) {
				this.aClass325Array1[local195].aByte115 = local24.method8602();
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt943; local217++) {
			if (this.aClass325Array1[local217] != null) {
				this.aClass325Array1[local217].aByte112 = local24.method8602();
			}
		}
		for (@Pc(243) int local243 = 0; local243 < this.anInt943; local243++) {
			if (this.aClass325Array1[local243] != null) {
				this.aClass325Array1[local243].aShort111 = (short) local24.method8571();
			}
		}
		for (@Pc(270) int local270 = 0; local270 < this.anInt943; local270++) {
			if (this.aClass325Array1[local270] != null) {
				this.aClass325Array1[local270].aByte116 = local24.method8602();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < this.anInt943; local296++) {
			if (this.aClass325Array1[local296] != null) {
				this.aClass325Array1[local296].aByte111 = local24.method8602();
			}
		}
		for (@Pc(322) int local322 = 0; local322 < this.anInt943; local322++) {
			if (this.aClass325Array1[local322] != null) {
				this.aClass325Array1[local322].aBoolean634 = local24.method8604() == 1;
			}
		}
		for (@Pc(349) int local349 = 0; local349 < this.anInt943; local349++) {
			if (this.aClass325Array1[local349] != null) {
				this.aClass325Array1[local349].aBoolean640 = local24.method8604() == 1;
			}
		}
		for (@Pc(382) int local382 = 0; local382 < this.anInt943; local382++) {
			if (this.aClass325Array1[local382] != null) {
				this.aClass325Array1[local382].aByte114 = local24.method8602();
			}
		}
		for (@Pc(408) int local408 = 0; local408 < this.anInt943; local408++) {
			if (this.aClass325Array1[local408] != null) {
				this.aClass325Array1[local408].aBoolean637 = local24.method8604() == 1;
			}
		}
		for (@Pc(435) int local435 = 0; local435 < this.anInt943; local435++) {
			if (this.aClass325Array1[local435] != null) {
				this.aClass325Array1[local435].aBoolean639 = local24.method8604() == 1;
			}
		}
		for (@Pc(462) int local462 = 0; local462 < this.anInt943; local462++) {
			if (this.aClass325Array1[local462] != null) {
				this.aClass325Array1[local462].aBoolean635 = local24.method8604() == 1;
			}
		}
		for (@Pc(489) int local489 = 0; local489 < this.anInt943; local489++) {
			if (this.aClass325Array1[local489] != null) {
				this.aClass325Array1[local489].anInt9370 = local24.method8604();
			}
		}
		for (@Pc(511) int local511 = 0; local511 < this.anInt943; local511++) {
			if (this.aClass325Array1[local511] != null) {
				this.aClass325Array1[local511].anInt9368 = local24.method8579();
			}
		}
		for (@Pc(537) int local537 = 0; local537 < this.anInt943; local537++) {
			if (this.aClass325Array1[local537] != null) {
				this.aClass325Array1[local537].anInt9371 = local24.method8604();
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIFZ)[F")
	@Override
	public float[] method893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method899(arg0).method1815(arg2, arg1, this.aClass353_9, this.aClass325Array1[arg0].aBoolean640, this);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)Lclient!tha;")
	@Override
	public Class325 method895(@OriginalArg(1) int arg0) {
		return this.aClass325Array1[arg0];
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZIBFII)[I")
	@Override
	public int[] method897(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method899(arg0).method1819(arg3, this.aClass353_9, arg2, this.aClass325Array1[arg0].aBoolean640, this, (double) arg1);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BFZIII)[I")
	@Override
	public int[] method894(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method899(arg2).method1814(arg3, this.aClass353_9, arg1, this.aClass325Array1[arg2].aBoolean640, arg4, (double) arg0, this);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method892(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub2_Sub5 local16 = this.method899(arg0);
		return local16 != null && local16.method1818(this.aClass353_9, this);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)Lclient!dq;")
	private Class6_Sub2_Sub5 method899(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2 local10 = this.aClass195_1.method5381((long) arg0);
		if (local10 != null) {
			return (Class6_Sub2_Sub5) local10;
		}
		@Pc(21) byte[] local21 = this.aClass353_8.method8419(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(39) Class6_Sub2_Sub5 local39 = new Class6_Sub2_Sub5(new Class6_Sub40(local21));
			this.aClass195_1.method5384((long) arg0, local39);
			return local39;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
	@Override
	public int method896() {
		return this.anInt943;
	}
}
