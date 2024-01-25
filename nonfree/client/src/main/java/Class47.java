import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class47 implements Interface9 {

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "Lclient!qda;")
	private final Class300 aClass300_1 = new Class300(256);

	@OriginalMember(owner = "client!cka", name = "k", descriptor = "Lclient!bt;")
	private final Class34 aClass34_12;

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "Lclient!bt;")
	private final Class34 aClass34_13;

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
	private final int anInt1535;

	@OriginalMember(owner = "client!cka", name = "d", descriptor = "[Lclient!gd;")
	private final Class130[] aClass130Array1;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;Lclient!bt;)V")
	public Class47(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_12 = arg2;
		this.aClass34_13 = arg1;
		@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0.method1239(0, 0));
		this.anInt1535 = local24.method8859();
		this.aClass130Array1 = new Class130[this.anInt1535];
		for (@Pc(36) int local36 = 0; local36 < this.anInt1535; local36++) {
			if (local24.method8865() == 1) {
				this.aClass130Array1[local36] = new Class130();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1535; local61++) {
			if (this.aClass130Array1[local61] != null) {
				this.aClass130Array1[local61].aBoolean241 = local24.method8865() == 0;
			}
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt1535; local91++) {
			if (this.aClass130Array1[local91] != null) {
				this.aClass130Array1[local91].aBoolean236 = local24.method8865() == 1;
			}
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt1535; local118++) {
			if (this.aClass130Array1[local118] != null) {
				this.aClass130Array1[local118].aBoolean238 = local24.method8865() == 1;
			}
		}
		for (@Pc(147) int local147 = 0; local147 < this.anInt1535; local147++) {
			if (this.aClass130Array1[local147] != null) {
				this.aClass130Array1[local147].aByte38 = local24.method8861();
			}
		}
		for (@Pc(169) int local169 = 0; local169 < this.anInt1535; local169++) {
			if (this.aClass130Array1[local169] != null) {
				this.aClass130Array1[local169].aByte40 = local24.method8861();
			}
		}
		for (@Pc(191) int local191 = 0; local191 < this.anInt1535; local191++) {
			if (this.aClass130Array1[local191] != null) {
				this.aClass130Array1[local191].aByte39 = local24.method8861();
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt1535; local217++) {
			if (this.aClass130Array1[local217] != null) {
				this.aClass130Array1[local217].aByte35 = local24.method8861();
			}
		}
		for (@Pc(243) int local243 = 0; local243 < this.anInt1535; local243++) {
			if (this.aClass130Array1[local243] != null) {
				this.aClass130Array1[local243].aShort49 = (short) local24.method8859();
			}
		}
		for (@Pc(266) int local266 = 0; local266 < this.anInt1535; local266++) {
			if (this.aClass130Array1[local266] != null) {
				this.aClass130Array1[local266].aByte34 = local24.method8861();
			}
		}
		for (@Pc(292) int local292 = 0; local292 < this.anInt1535; local292++) {
			if (this.aClass130Array1[local292] != null) {
				this.aClass130Array1[local292].aByte36 = local24.method8861();
			}
		}
		for (@Pc(314) int local314 = 0; local314 < this.anInt1535; local314++) {
			if (this.aClass130Array1[local314] != null) {
				this.aClass130Array1[local314].aBoolean240 = local24.method8865() == 1;
			}
		}
		for (@Pc(343) int local343 = 0; local343 < this.anInt1535; local343++) {
			if (this.aClass130Array1[local343] != null) {
				this.aClass130Array1[local343].aBoolean237 = local24.method8865() == 1;
			}
		}
		for (@Pc(374) int local374 = 0; local374 < this.anInt1535; local374++) {
			if (this.aClass130Array1[local374] != null) {
				this.aClass130Array1[local374].aByte37 = local24.method8861();
			}
		}
		for (@Pc(396) int local396 = 0; local396 < this.anInt1535; local396++) {
			if (this.aClass130Array1[local396] != null) {
				this.aClass130Array1[local396].aBoolean235 = local24.method8865() == 1;
			}
		}
		for (@Pc(423) int local423 = 0; local423 < this.anInt1535; local423++) {
			if (this.aClass130Array1[local423] != null) {
				this.aClass130Array1[local423].aBoolean239 = local24.method8865() == 1;
			}
		}
		for (@Pc(452) int local452 = 0; local452 < this.anInt1535; local452++) {
			if (this.aClass130Array1[local452] != null) {
				this.aClass130Array1[local452].aBoolean242 = local24.method8865() == 1;
			}
		}
		for (@Pc(481) int local481 = 0; local481 < this.anInt1535; local481++) {
			if (this.aClass130Array1[local481] != null) {
				this.aClass130Array1[local481].anInt3117 = local24.method8865();
			}
		}
		for (@Pc(503) int local503 = 0; local503 < this.anInt1535; local503++) {
			if (this.aClass130Array1[local503] != null) {
				this.aClass130Array1[local503].anInt3118 = local24.method8850();
			}
		}
		for (@Pc(525) int local525 = 0; local525 < this.anInt1535; local525++) {
			if (this.aClass130Array1[local525] != null) {
				this.aClass130Array1[local525].anInt3119 = local24.method8865();
			}
		}
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(II)Lclient!gd;")
	@Override
	public Class130 method1558(@OriginalArg(0) int arg0) {
		return this.aClass130Array1[arg0];
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIZIIF)[I")
	@Override
	public int[] method1559(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method1561(arg0).method4864((double) arg3, this.aClass34_12, arg1, this, this.aClass130Array1[arg0].aBoolean237, arg2);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIIFZI)[F")
	@Override
	public float[] method1556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		return this.method1561(arg1).method4867(this, this.aClass34_12, arg2, arg0, this.aClass130Array1[arg1].aBoolean237);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IFZIIB)[I")
	@Override
	public int[] method1555(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method1561(arg0).method4866(arg3, this.aClass130Array1[arg0].aBoolean237, this, (double) arg1, arg4, arg2, this.aClass34_12);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1557(@OriginalArg(1) int arg0) {
		@Pc(20) Class4_Sub5_Sub14 local20 = this.method1561(arg0);
		return local20 != null && local20.method4869(this, this.aClass34_12);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)I")
	@Override
	public int method1554() {
		return this.anInt1535;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IB)Lclient!mea;")
	private Class4_Sub5_Sub14 method1561(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub5 local10 = this.aClass300_1.method6604((long) arg0);
		if (local10 != null) {
			return (Class4_Sub5_Sub14) local10;
		}
		@Pc(21) byte[] local21 = this.aClass34_13.method1255(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(45) Class4_Sub5_Sub14 local45 = new Class4_Sub5_Sub14(new Class4_Sub11(local21));
			this.aClass300_1.method6600((long) arg0, local45);
			return local45;
		}
	}
}
