import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class255 implements Interface3 {

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "Lclient!cj;")
	private final Class57 aClass57_7 = new Class57(256);

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "Lclient!wia;")
	private final Class386 aClass386_96;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "Lclient!wia;")
	private final Class386 aClass386_95;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
	private final int anInt7505;

	@OriginalMember(owner = "client!oba", name = "n", descriptor = "[Lclient!lv;")
	private final Class224[] aClass224Array1;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;Lclient!wia;)V")
	public Class255(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_96 = arg2;
		this.aClass386_95 = arg1;
		@Pc(24) Class14_Sub29 local24 = new Class14_Sub29(arg0.method9196(0, 0));
		this.anInt7505 = local24.method5900();
		this.aClass224Array1 = new Class224[this.anInt7505];
		for (@Pc(36) int local36 = 0; local36 < this.anInt7505; local36++) {
			if (local24.method5866() == 1) {
				this.aClass224Array1[local36] = new Class224();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt7505; local61++) {
			if (this.aClass224Array1[local61] != null) {
				this.aClass224Array1[local61].aBoolean453 = local24.method5866() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt7505; local87++) {
			if (this.aClass224Array1[local87] != null) {
				this.aClass224Array1[local87].aBoolean455 = local24.method5866() == 1;
			}
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt7505; local114++) {
			if (this.aClass224Array1[local114] != null) {
				this.aClass224Array1[local114].aBoolean450 = local24.method5866() == 1;
			}
		}
		for (@Pc(145) int local145 = 0; local145 < this.anInt7505; local145++) {
			if (this.aClass224Array1[local145] != null) {
				this.aClass224Array1[local145].aByte99 = local24.method5845();
			}
		}
		for (@Pc(167) int local167 = 0; local167 < this.anInt7505; local167++) {
			if (this.aClass224Array1[local167] != null) {
				this.aClass224Array1[local167].aByte100 = local24.method5845();
			}
		}
		for (@Pc(193) int local193 = 0; local193 < this.anInt7505; local193++) {
			if (this.aClass224Array1[local193] != null) {
				this.aClass224Array1[local193].aByte96 = local24.method5845();
			}
		}
		for (@Pc(219) int local219 = 0; local219 < this.anInt7505; local219++) {
			if (this.aClass224Array1[local219] != null) {
				this.aClass224Array1[local219].aByte94 = local24.method5845();
			}
		}
		for (@Pc(245) int local245 = 0; local245 < this.anInt7505; local245++) {
			if (this.aClass224Array1[local245] != null) {
				this.aClass224Array1[local245].aShort74 = (short) local24.method5900();
			}
		}
		for (@Pc(268) int local268 = 0; local268 < this.anInt7505; local268++) {
			if (this.aClass224Array1[local268] != null) {
				this.aClass224Array1[local268].aByte98 = local24.method5845();
			}
		}
		for (@Pc(294) int local294 = 0; local294 < this.anInt7505; local294++) {
			if (this.aClass224Array1[local294] != null) {
				this.aClass224Array1[local294].aByte97 = local24.method5845();
			}
		}
		for (@Pc(316) int local316 = 0; local316 < this.anInt7505; local316++) {
			if (this.aClass224Array1[local316] != null) {
				this.aClass224Array1[local316].aBoolean456 = local24.method5866() == 1;
			}
		}
		for (@Pc(343) int local343 = 0; local343 < this.anInt7505; local343++) {
			if (this.aClass224Array1[local343] != null) {
				this.aClass224Array1[local343].aBoolean458 = local24.method5866() == 1;
			}
		}
		for (@Pc(374) int local374 = 0; local374 < this.anInt7505; local374++) {
			if (this.aClass224Array1[local374] != null) {
				this.aClass224Array1[local374].aByte95 = local24.method5845();
			}
		}
		for (@Pc(396) int local396 = 0; local396 < this.anInt7505; local396++) {
			if (this.aClass224Array1[local396] != null) {
				this.aClass224Array1[local396].aBoolean454 = local24.method5866() == 1;
			}
		}
		for (@Pc(427) int local427 = 0; local427 < this.anInt7505; local427++) {
			if (this.aClass224Array1[local427] != null) {
				this.aClass224Array1[local427].aBoolean451 = local24.method5866() == 1;
			}
		}
		for (@Pc(456) int local456 = 0; local456 < this.anInt7505; local456++) {
			if (this.aClass224Array1[local456] != null) {
				this.aClass224Array1[local456].aBoolean452 = local24.method5866() == 1;
			}
		}
		for (@Pc(489) int local489 = 0; local489 < this.anInt7505; local489++) {
			if (this.aClass224Array1[local489] != null) {
				this.aClass224Array1[local489].anInt6486 = local24.method5866();
			}
		}
		for (@Pc(515) int local515 = 0; local515 < this.anInt7505; local515++) {
			if (this.aClass224Array1[local515] != null) {
				this.aClass224Array1[local515].anInt6488 = local24.method5878();
			}
		}
		for (@Pc(541) int local541 = 0; local541 < this.anInt7505; local541++) {
			if (this.aClass224Array1[local541] != null) {
				this.aClass224Array1[local541].anInt6492 = local24.method5866();
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZ)Lclient!vc;")
	private Class14_Sub3_Sub19 method6182(@OriginalArg(0) int arg0) {
		@Pc(10) Class14_Sub3 local10 = this.aClass57_7.method1424((long) arg0);
		if (local10 != null) {
			return (Class14_Sub3_Sub19) local10;
		}
		@Pc(21) byte[] local21 = this.aClass386_95.method9192(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class14_Sub3_Sub19 local33 = new Class14_Sub3_Sub19(new Class14_Sub29(local21));
			this.aClass57_7.method1422(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BI)Lclient!lv;")
	@Override
	public Class224 method6177(@OriginalArg(1) int arg0) {
		return this.aClass224Array1[arg0];
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)I")
	@Override
	public int method6178() {
		return this.anInt7505;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6181(@OriginalArg(1) int arg0) {
		@Pc(13) Class14_Sub3_Sub19 local13 = this.method6182(arg0);
		return local13 != null && local13.method8733(this, this.aClass386_96);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BIIZIF)[I")
	@Override
	public int[] method6180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4) {
		return this.method6182(arg3).method8735(this.aClass386_96, (double) arg4, this.aClass224Array1[arg3].aBoolean458, arg0, this, arg1, arg2);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIFIIZ)[F")
	@Override
	public float[] method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		return this.method6182(arg0).method8737(arg3, this.aClass386_96, this, this.aClass224Array1[arg0].aBoolean458, arg1);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BZIIIF)[I")
	@Override
	public int[] method6176(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method6182(arg0).method8736(this.aClass224Array1[arg0].aBoolean458, arg1, (double) arg3, arg2, this, this.aClass386_96);
	}
}
