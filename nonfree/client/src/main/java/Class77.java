import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class77 implements Interface7 {

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "Lclient!oe;")
	private final Class173 aClass173_1 = new Class173(256);

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "Lclient!dn;")
	private final Class56 aClass56_32;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "Lclient!dn;")
	private final Class56 aClass56_31;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "[Lclient!dv;")
	private final Class62[] aClass62Array1;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!dn;Lclient!dn;Lclient!dn;)V")
	public Class77(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_32 = arg2;
		this.aClass56_31 = arg1;
		@Pc(24) Class3_Sub2 local24 = new Class3_Sub2(arg0.method1384(0, 0));
		@Pc(28) int local28 = local24.method6004();
		this.aClass62Array1 = new Class62[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method6053() == 1) {
				this.aClass62Array1[local34] = new Class62();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass62Array1[local56] != null) {
				this.aClass62Array1[local56].aBoolean143 = local24.method6053() == 0;
			}
		}
		for (@Pc(81) int local81 = 0; local81 < local28; local81++) {
			if (this.aClass62Array1[local81] != null) {
				this.aClass62Array1[local81].aBoolean148 = local24.method6053() == 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < local28; local107++) {
			if (this.aClass62Array1[local107] != null) {
				this.aClass62Array1[local107].aBoolean142 = local24.method6053() == 1;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < local28; local139++) {
			if (this.aClass62Array1[local139] != null) {
				this.aClass62Array1[local139].aBoolean147 = local24.method6053() == 1;
			}
		}
		for (@Pc(167) int local167 = 0; local167 < local28; local167++) {
			if (this.aClass62Array1[local167] != null) {
				this.aClass62Array1[local167].aByte27 = local24.method6011();
			}
		}
		for (@Pc(192) int local192 = 0; local192 < local28; local192++) {
			if (this.aClass62Array1[local192] != null) {
				this.aClass62Array1[local192].aByte24 = local24.method6011();
			}
		}
		for (@Pc(217) int local217 = 0; local217 < local28; local217++) {
			if (this.aClass62Array1[local217] != null) {
				this.aClass62Array1[local217].aByte28 = local24.method6011();
			}
		}
		for (@Pc(242) int local242 = 0; local242 < local28; local242++) {
			if (this.aClass62Array1[local242] != null) {
				this.aClass62Array1[local242].aByte23 = local24.method6011();
			}
		}
		for (@Pc(267) int local267 = 0; local267 < local28; local267++) {
			if (this.aClass62Array1[local267] != null) {
				this.aClass62Array1[local267].aShort52 = (short) local24.method6004();
			}
		}
		for (@Pc(293) int local293 = 0; local293 < local28; local293++) {
			if (this.aClass62Array1[local293] != null) {
				this.aClass62Array1[local293].aByte22 = local24.method6011();
			}
		}
		for (@Pc(318) int local318 = 0; local318 < local28; local318++) {
			if (this.aClass62Array1[local318] != null) {
				this.aClass62Array1[local318].aByte26 = local24.method6011();
			}
		}
		for (@Pc(343) int local343 = 0; local343 < local28; local343++) {
			if (this.aClass62Array1[local343] != null) {
				this.aClass62Array1[local343].aBoolean144 = local24.method6053() == 1;
			}
		}
		for (@Pc(375) int local375 = 0; local375 < local28; local375++) {
			if (this.aClass62Array1[local375] != null) {
				this.aClass62Array1[local375].aBoolean141 = local24.method6053() == 1;
			}
		}
		for (@Pc(401) int local401 = 0; local401 < local28; local401++) {
			if (this.aClass62Array1[local401] != null) {
				this.aClass62Array1[local401].aByte25 = local24.method6011();
			}
		}
		for (@Pc(422) int local422 = 0; local422 < local28; local422++) {
			if (this.aClass62Array1[local422] != null) {
				this.aClass62Array1[local422].aBoolean145 = local24.method6053() == 1;
			}
		}
		for (@Pc(454) int local454 = 0; local454 < local28; local454++) {
			if (this.aClass62Array1[local454] != null) {
				this.aClass62Array1[local454].aBoolean149 = local24.method6053() == 1;
			}
		}
		for (@Pc(484) int local484 = 0; local484 < local28; local484++) {
			if (this.aClass62Array1[local484] != null) {
				this.aClass62Array1[local484].aBoolean146 = local24.method6053() == 1;
			}
		}
		for (@Pc(516) int local516 = 0; local516 < local28; local516++) {
			if (this.aClass62Array1[local516] != null) {
				this.aClass62Array1[local516].anInt1810 = local24.method6053();
			}
		}
		for (@Pc(537) int local537 = 0; local537 < local28; local537++) {
			if (this.aClass62Array1[local537] != null) {
				this.aClass62Array1[local537].anInt1812 = local24.method6014();
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(FIIBZI)[I")
	@Override
	public int[] method2129(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method2135(arg4).method608(arg3, arg1, this.aClass56_32, this, (double) arg0, this.aClass62Array1[arg4].aBoolean141, arg2);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Lclient!dv;")
	@Override
	public Class62 method2131(@OriginalArg(1) int arg0) {
		return this.aClass62Array1[arg0];
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method2132(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub3_Sub2 local13 = this.method2135(arg0);
		return local13 != null && local13.method605(this, this.aClass56_32);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZFIII)[I")
	@Override
	public int[] method2128(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method2135(arg2).method606(this.aClass62Array1[arg2].aBoolean141, this, this.aClass56_32, (double) arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(II)Lclient!aw;")
	private Class3_Sub3_Sub2 method2135(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3 local10 = this.aClass173_1.method4163((long) arg0);
		if (local10 != null) {
			return (Class3_Sub3_Sub2) local10;
		}
		@Pc(27) byte[] local27 = this.aClass56_31.method1391(arg0);
		if (local27 == null) {
			return null;
		} else {
			@Pc(39) Class3_Sub3_Sub2 local39 = new Class3_Sub3_Sub2(new Class3_Sub2(local27));
			this.aClass173_1.method4159(local39, (long) arg0);
			return local39;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZFBIII)[F")
	@Override
	public float[] method2130(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method2135(arg3).method604(this, arg2, this.aClass56_32, arg1, this.aClass62Array1[arg3].aBoolean141);
	}
}
