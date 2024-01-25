import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class91 implements Interface7 {

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!lt;")
	private final Class142 aClass142_2 = new Class142(256);

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!fs;")
	private final Class76 aClass76_34;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!fs;")
	private final Class76 aClass76_35;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "[Lclient!vf;")
	private final Class251[] aClass251Array1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!fs;Lclient!fs;Lclient!fs;)V")
	public Class91(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_34 = arg2;
		this.aClass76_35 = arg1;
		@Pc(24) Class4_Sub12 local24 = new Class4_Sub12(arg0.method2104(0, 0));
		@Pc(28) int local28 = local24.method2536();
		this.aClass251Array1 = new Class251[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method2490() == 1) {
				this.aClass251Array1[local34] = new Class251();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass251Array1[local54] != null) {
				this.aClass251Array1[local54].aBoolean639 = local24.method2490() == 0;
			}
		}
		for (@Pc(82) int local82 = 0; local82 < local28; local82++) {
			if (this.aClass251Array1[local82] != null) {
				this.aClass251Array1[local82].aBoolean640 = local24.method2490() == 1;
			}
		}
		for (@Pc(112) int local112 = 0; local112 < local28; local112++) {
			if (this.aClass251Array1[local112] != null) {
				this.aClass251Array1[local112].aBoolean637 = local24.method2490() == 1;
			}
		}
		for (@Pc(142) int local142 = 0; local142 < local28; local142++) {
			if (this.aClass251Array1[local142] != null) {
				this.aClass251Array1[local142].aBoolean642 = local24.method2490() == 1;
			}
		}
		for (@Pc(170) int local170 = 0; local170 < local28; local170++) {
			if (this.aClass251Array1[local170] != null) {
				this.aClass251Array1[local170].aByte87 = local24.method2542();
			}
		}
		for (@Pc(191) int local191 = 0; local191 < local28; local191++) {
			if (this.aClass251Array1[local191] != null) {
				this.aClass251Array1[local191].aByte90 = local24.method2542();
			}
		}
		for (@Pc(216) int local216 = 0; local216 < local28; local216++) {
			if (this.aClass251Array1[local216] != null) {
				this.aClass251Array1[local216].aByte89 = local24.method2542();
			}
		}
		for (@Pc(241) int local241 = 0; local241 < local28; local241++) {
			if (this.aClass251Array1[local241] != null) {
				this.aClass251Array1[local241].aByte88 = local24.method2542();
			}
		}
		for (@Pc(266) int local266 = 0; local266 < local28; local266++) {
			if (this.aClass251Array1[local266] != null) {
				this.aClass251Array1[local266].aShort99 = (short) local24.method2536();
			}
		}
		for (@Pc(292) int local292 = 0; local292 < local28; local292++) {
			if (this.aClass251Array1[local292] != null) {
				this.aClass251Array1[local292].aByte91 = local24.method2542();
			}
		}
		for (@Pc(313) int local313 = 0; local313 < local28; local313++) {
			if (this.aClass251Array1[local313] != null) {
				this.aClass251Array1[local313].aByte93 = local24.method2542();
			}
		}
		for (@Pc(338) int local338 = 0; local338 < local28; local338++) {
			if (this.aClass251Array1[local338] != null) {
				this.aClass251Array1[local338].aBoolean641 = local24.method2490() == 1;
			}
		}
		for (@Pc(366) int local366 = 0; local366 < local28; local366++) {
			if (this.aClass251Array1[local366] != null) {
				this.aClass251Array1[local366].aBoolean645 = local24.method2490() == 1;
			}
		}
		for (@Pc(392) int local392 = 0; local392 < local28; local392++) {
			if (this.aClass251Array1[local392] != null) {
				this.aClass251Array1[local392].aByte92 = local24.method2542();
			}
		}
		for (@Pc(417) int local417 = 0; local417 < local28; local417++) {
			if (this.aClass251Array1[local417] != null) {
				this.aClass251Array1[local417].aBoolean643 = local24.method2490() == 1;
			}
		}
		for (@Pc(445) int local445 = 0; local445 < local28; local445++) {
			if (this.aClass251Array1[local445] != null) {
				this.aClass251Array1[local445].aBoolean644 = local24.method2490() == 1;
			}
		}
		for (@Pc(471) int local471 = 0; local471 < local28; local471++) {
			if (this.aClass251Array1[local471] != null) {
				this.aClass251Array1[local471].aBoolean638 = local24.method2490() == 1;
			}
		}
		for (@Pc(501) int local501 = 0; local501 < local28; local501++) {
			if (this.aClass251Array1[local501] != null) {
				this.aClass251Array1[local501].anInt6934 = local24.method2490();
			}
		}
		for (@Pc(522) int local522 = 0; local522 < local28; local522++) {
			if (this.aClass251Array1[local522] != null) {
				this.aClass251Array1[local522].anInt6933 = local24.method2529();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Lclient!vf;")
	@Override
	public Class251 method2396(@OriginalArg(1) int arg0) {
		return this.aClass251Array1[arg0];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIZFII)[I")
	@Override
	public int[] method2395(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method2397(arg0).method3282(arg3, this.aClass76_34, this, arg2, (double) arg1, this.aClass251Array1[arg0].aBoolean645);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIFII)[I")
	@Override
	public int[] method2393(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method2397(arg1).method3277(this, arg0, this.aClass251Array1[arg1].aBoolean645, this.aClass76_34, (double) arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(FIIZII)[F")
	@Override
	public float[] method2394(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method2397(arg1).method3283(this, this.aClass76_34, arg3, this.aClass251Array1[arg1].aBoolean645, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)Lclient!kv;")
	private Class4_Sub1_Sub14 method2397(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1 local10 = this.aClass142_2.method3483((long) arg0);
		if (local10 != null) {
			return (Class4_Sub1_Sub14) local10;
		}
		@Pc(26) byte[] local26 = this.aClass76_35.method2122(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class4_Sub1_Sub14 local38 = new Class4_Sub1_Sub14(new Class4_Sub12(local26));
			this.aClass142_2.method3480((long) arg0, local38);
			return local38;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2392(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub1_Sub14 local15 = this.method2397(arg0);
		return local15 != null && local15.method3276(this.aClass76_34, this);
	}
}
