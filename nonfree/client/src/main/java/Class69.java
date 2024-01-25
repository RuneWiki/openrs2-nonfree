import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class69 implements Interface1 {

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!wf;")
	private final Class215 aClass215_2 = new Class215(256);

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!ra;")
	private final Class170 aClass170_43;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!ra;")
	private final Class170 aClass170_41;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "[Lclient!hl;")
	private final Class84[] aClass84Array1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!ra;Lclient!ra;Lclient!ra;)V")
	public Class69(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) Class170 arg2) {
		this.aClass170_43 = arg1;
		this.aClass170_41 = arg2;
		@Pc(24) Class5_Sub1 local24 = new Class5_Sub1(arg0.method4584(0, 0));
		@Pc(28) int local28 = local24.method1845();
		this.aClass84Array1 = new Class84[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method1832() == 1) {
				this.aClass84Array1[local34] = new Class84();
			}
		}
		for (@Pc(60) int local60 = 0; local60 < local28; local60++) {
			if (this.aClass84Array1[local60] != null) {
				this.aClass84Array1[local60].aBoolean167 = local24.method1832() == 0;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < local28; local88++) {
			if (this.aClass84Array1[local88] != null) {
				this.aClass84Array1[local88].aBoolean172 = local24.method1832() == 1;
			}
		}
		for (@Pc(118) int local118 = 0; local118 < local28; local118++) {
			if (this.aClass84Array1[local118] != null) {
				this.aClass84Array1[local118].aBoolean170 = local24.method1832() == 1;
			}
		}
		for (@Pc(148) int local148 = 0; local148 < local28; local148++) {
			if (this.aClass84Array1[local148] != null) {
				this.aClass84Array1[local148].aBoolean168 = local24.method1832() == 1;
			}
		}
		for (@Pc(174) int local174 = 0; local174 < local28; local174++) {
			if (this.aClass84Array1[local174] != null) {
				this.aClass84Array1[local174].aByte30 = local24.method1863();
			}
		}
		for (@Pc(195) int local195 = 0; local195 < local28; local195++) {
			if (this.aClass84Array1[local195] != null) {
				this.aClass84Array1[local195].aByte26 = local24.method1863();
			}
		}
		for (@Pc(220) int local220 = 0; local220 < local28; local220++) {
			if (this.aClass84Array1[local220] != null) {
				this.aClass84Array1[local220].aByte29 = local24.method1863();
			}
		}
		for (@Pc(241) int local241 = 0; local241 < local28; local241++) {
			if (this.aClass84Array1[local241] != null) {
				this.aClass84Array1[local241].aByte27 = local24.method1863();
			}
		}
		for (@Pc(266) int local266 = 0; local266 < local28; local266++) {
			if (this.aClass84Array1[local266] != null) {
				this.aClass84Array1[local266].aShort30 = (short) local24.method1845();
			}
		}
		for (@Pc(292) int local292 = 0; local292 < local28; local292++) {
			if (this.aClass84Array1[local292] != null) {
				this.aClass84Array1[local292].aByte24 = local24.method1863();
			}
		}
		for (@Pc(313) int local313 = 0; local313 < local28; local313++) {
			if (this.aClass84Array1[local313] != null) {
				this.aClass84Array1[local313].aByte28 = local24.method1863();
			}
		}
		for (@Pc(338) int local338 = 0; local338 < local28; local338++) {
			if (this.aClass84Array1[local338] != null) {
				this.aClass84Array1[local338].aBoolean173 = local24.method1832() == 1;
			}
		}
		for (@Pc(366) int local366 = 0; local366 < local28; local366++) {
			if (this.aClass84Array1[local366] != null) {
				this.aClass84Array1[local366].aBoolean169 = local24.method1832() == 1;
			}
		}
		for (@Pc(396) int local396 = 0; local396 < local28; local396++) {
			if (this.aClass84Array1[local396] != null) {
				this.aClass84Array1[local396].aByte25 = local24.method1863();
			}
		}
		for (@Pc(421) int local421 = 0; local421 < local28; local421++) {
			if (this.aClass84Array1[local421] != null) {
				this.aClass84Array1[local421].aBoolean166 = local24.method1832() == 1;
			}
		}
		for (@Pc(453) int local453 = 0; local453 < local28; local453++) {
			if (this.aClass84Array1[local453] != null) {
				this.aClass84Array1[local453].aBoolean165 = local24.method1832() == 1;
			}
		}
		for (@Pc(479) int local479 = 0; local479 < local28; local479++) {
			if (this.aClass84Array1[local479] != null) {
				this.aClass84Array1[local479].aBoolean171 = local24.method1832() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIFIIZ)[I")
	@Override
	public int[] method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method2011(arg1).method5505((double) arg2, arg0, arg3, arg4, this, this.aClass170_41, this.aClass84Array1[arg1].aBoolean169);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method2003(@OriginalArg(0) int arg0) {
		@Pc(13) Class5_Sub9_Sub21 local13 = this.method2011(arg0);
		return local13 != null && local13.method5499(this, this.aClass170_41);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZBIFI)[F")
	@Override
	public float[] method2004(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method2011(arg0).method5500(arg1, arg3, this.aClass84Array1[arg0].aBoolean169, this, this.aClass170_41);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)Lclient!hl;")
	@Override
	public Class84 method2005(@OriginalArg(0) int arg0) {
		return this.aClass84Array1[arg0];
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZIFI)[I")
	@Override
	public int[] method2006(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method2011(arg1).method5501((double) arg2, arg3, arg0, this, this.aClass84Array1[arg1].aBoolean169, this.aClass170_41);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Lclient!va;")
	private Class5_Sub9_Sub21 method2011(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub9 local10 = this.aClass215_2.method5683((long) arg0);
		if (local10 != null) {
			return (Class5_Sub9_Sub21) local10;
		}
		@Pc(21) byte[] local21 = this.aClass170_43.method4571(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class5_Sub9_Sub21 local33 = new Class5_Sub9_Sub21(new Class5_Sub1(local21));
			this.aClass215_2.method5687(local33, (long) arg0);
			return local33;
		}
	}
}
