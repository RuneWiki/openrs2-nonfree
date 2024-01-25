import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class108 implements Interface11 {

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "Lclient!lg;")
	private final Class149 aClass149_3 = new Class149(256);

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "Lclient!lt;")
	private final Class158 aClass158_31;

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Lclient!lt;")
	private final Class158 aClass158_32;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "[Lclient!sh;")
	private final Class229[] aClass229Array1;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!lt;Lclient!lt;Lclient!lt;)V")
	public Class108(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_31 = arg1;
		this.aClass158_32 = arg2;
		@Pc(24) Class6_Sub15 local24 = new Class6_Sub15(arg0.method3672(0, 0));
		@Pc(28) int local28 = local24.method3108();
		this.aClass229Array1 = new Class229[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3111() == 1) {
				this.aClass229Array1[local34] = new Class229();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass229Array1[local58] != null) {
				this.aClass229Array1[local58].aBoolean403 = local24.method3111() == 0;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < local28; local83++) {
			if (this.aClass229Array1[local83] != null) {
				this.aClass229Array1[local83].aBoolean406 = local24.method3111() == 1;
			}
		}
		for (@Pc(109) int local109 = 0; local109 < local28; local109++) {
			if (this.aClass229Array1[local109] != null) {
				this.aClass229Array1[local109].aBoolean405 = local24.method3111() == 1;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < local28; local139++) {
			if (this.aClass229Array1[local139] != null) {
				this.aClass229Array1[local139].aBoolean404 = local24.method3111() == 1;
			}
		}
		for (@Pc(165) int local165 = 0; local165 < local28; local165++) {
			if (this.aClass229Array1[local165] != null) {
				this.aClass229Array1[local165].aByte83 = local24.method3116();
			}
		}
		for (@Pc(190) int local190 = 0; local190 < local28; local190++) {
			if (this.aClass229Array1[local190] != null) {
				this.aClass229Array1[local190].aByte84 = local24.method3116();
			}
		}
		for (@Pc(211) int local211 = 0; local211 < local28; local211++) {
			if (this.aClass229Array1[local211] != null) {
				this.aClass229Array1[local211].aByte85 = local24.method3116();
			}
		}
		for (@Pc(236) int local236 = 0; local236 < local28; local236++) {
			if (this.aClass229Array1[local236] != null) {
				this.aClass229Array1[local236].aByte87 = local24.method3116();
			}
		}
		for (@Pc(261) int local261 = 0; local261 < local28; local261++) {
			if (this.aClass229Array1[local261] != null) {
				this.aClass229Array1[local261].aShort93 = (short) local24.method3108();
			}
		}
		for (@Pc(287) int local287 = 0; local287 < local28; local287++) {
			if (this.aClass229Array1[local287] != null) {
				this.aClass229Array1[local287].aByte88 = local24.method3116();
			}
		}
		for (@Pc(308) int local308 = 0; local308 < local28; local308++) {
			if (this.aClass229Array1[local308] != null) {
				this.aClass229Array1[local308].aByte89 = local24.method3116();
			}
		}
		for (@Pc(329) int local329 = 0; local329 < local28; local329++) {
			if (this.aClass229Array1[local329] != null) {
				this.aClass229Array1[local329].aBoolean400 = local24.method3111() == 1;
			}
		}
		for (@Pc(357) int local357 = 0; local357 < local28; local357++) {
			if (this.aClass229Array1[local357] != null) {
				this.aClass229Array1[local357].aBoolean402 = local24.method3111() == 1;
			}
		}
		for (@Pc(387) int local387 = 0; local387 < local28; local387++) {
			if (this.aClass229Array1[local387] != null) {
				this.aClass229Array1[local387].aByte86 = local24.method3116();
			}
		}
		for (@Pc(412) int local412 = 0; local412 < local28; local412++) {
			if (this.aClass229Array1[local412] != null) {
				this.aClass229Array1[local412].aBoolean399 = local24.method3111() == 1;
			}
		}
		for (@Pc(442) int local442 = 0; local442 < local28; local442++) {
			if (this.aClass229Array1[local442] != null) {
				this.aClass229Array1[local442].aBoolean407 = local24.method3111() == 1;
			}
		}
		for (@Pc(468) int local468 = 0; local468 < local28; local468++) {
			if (this.aClass229Array1[local468] != null) {
				this.aClass229Array1[local468].aBoolean401 = local24.method3111() == 1;
			}
		}
		for (@Pc(494) int local494 = 0; local494 < local28; local494++) {
			if (this.aClass229Array1[local494] != null) {
				this.aClass229Array1[local494].anInt6136 = local24.method3111();
			}
		}
		for (@Pc(515) int local515 = 0; local515 < local28; local515++) {
			if (this.aClass229Array1[local515] != null) {
				this.aClass229Array1[local515].anInt6138 = local24.method3109();
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method2468(@OriginalArg(0) int arg0) {
		@Pc(13) Class6_Sub1_Sub15 local13 = this.method2470(arg0);
		return local13 != null && local13.method4765(this, this.aClass158_32);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IFZIII)[I")
	@Override
	public int[] method2465(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method2470(arg2).method4762(this.aClass158_32, this.aClass229Array1[arg2].aBoolean402, (double) arg1, arg0, this, arg3);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(II)Lclient!qs;")
	private Class6_Sub1_Sub15 method2470(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub1 local12 = this.aClass149_3.method3402((long) arg0);
		if (local12 != null) {
			return (Class6_Sub1_Sub15) local12;
		}
		@Pc(23) byte[] local23 = this.aClass158_31.method3691(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(40) Class6_Sub1_Sub15 local40 = new Class6_Sub1_Sub15(new Class6_Sub15(local23));
			this.aClass149_3.method3404((long) arg0, local40);
			return local40;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZIFII)[I")
	@Override
	public int[] method2467(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4) {
		return this.method2470(arg2).method4767(arg0, this, arg1, arg4, this.aClass229Array1[arg2].aBoolean402, this.aClass158_32, (double) arg3);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(FZIIII)[F")
	@Override
	public float[] method2464(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method2470(arg3).method4763(this.aClass229Array1[arg3].aBoolean402, arg2, this.aClass158_32, this, arg1);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Lclient!sh;")
	@Override
	public Class229 method2466(@OriginalArg(0) int arg0) {
		return this.aClass229Array1[arg0];
	}
}
