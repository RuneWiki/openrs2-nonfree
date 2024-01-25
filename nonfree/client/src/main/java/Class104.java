import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class104 implements Interface4 {

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Lclient!bt;")
	private final Class29 aClass29_2 = new Class29(256);

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!ul;")
	private final Class246 aClass246_88;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!ul;")
	private final Class246 aClass246_87;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[Lclient!oh;")
	private final Class183[] aClass183Array1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ul;Lclient!ul;Lclient!ul;)V")
	public Class104(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_88 = arg2;
		this.aClass246_87 = arg1;
		@Pc(24) Class1_Sub5 local24 = new Class1_Sub5(arg0.method5477(0, 0));
		@Pc(28) int local28 = local24.method5362();
		this.aClass183Array1 = new Class183[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5366() == 1) {
				this.aClass183Array1[local34] = new Class183();
			}
		}
		for (@Pc(60) int local60 = 0; local60 < local28; local60++) {
			if (this.aClass183Array1[local60] != null) {
				this.aClass183Array1[local60].aBoolean332 = local24.method5366() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < local28; local92++) {
			if (this.aClass183Array1[local92] != null) {
				this.aClass183Array1[local92].aBoolean337 = local24.method5366() == 1;
			}
		}
		for (@Pc(122) int local122 = 0; local122 < local28; local122++) {
			if (this.aClass183Array1[local122] != null) {
				this.aClass183Array1[local122].aBoolean331 = local24.method5366() == 1;
			}
		}
		for (@Pc(148) int local148 = 0; local148 < local28; local148++) {
			if (this.aClass183Array1[local148] != null) {
				this.aClass183Array1[local148].aBoolean330 = local24.method5366() == 1;
			}
		}
		for (@Pc(178) int local178 = 0; local178 < local28; local178++) {
			if (this.aClass183Array1[local178] != null) {
				this.aClass183Array1[local178].aByte79 = local24.method5416();
			}
		}
		for (@Pc(199) int local199 = 0; local199 < local28; local199++) {
			if (this.aClass183Array1[local199] != null) {
				this.aClass183Array1[local199].aByte80 = local24.method5416();
			}
		}
		for (@Pc(220) int local220 = 0; local220 < local28; local220++) {
			if (this.aClass183Array1[local220] != null) {
				this.aClass183Array1[local220].aByte76 = local24.method5416();
			}
		}
		for (@Pc(241) int local241 = 0; local241 < local28; local241++) {
			if (this.aClass183Array1[local241] != null) {
				this.aClass183Array1[local241].aByte75 = local24.method5416();
			}
		}
		for (@Pc(266) int local266 = 0; local266 < local28; local266++) {
			if (this.aClass183Array1[local266] != null) {
				this.aClass183Array1[local266].aShort75 = (short) local24.method5362();
			}
		}
		for (@Pc(292) int local292 = 0; local292 < local28; local292++) {
			if (this.aClass183Array1[local292] != null) {
				this.aClass183Array1[local292].aByte78 = local24.method5416();
			}
		}
		for (@Pc(317) int local317 = 0; local317 < local28; local317++) {
			if (this.aClass183Array1[local317] != null) {
				this.aClass183Array1[local317].aByte81 = local24.method5416();
			}
		}
		for (@Pc(338) int local338 = 0; local338 < local28; local338++) {
			if (this.aClass183Array1[local338] != null) {
				this.aClass183Array1[local338].aBoolean336 = local24.method5366() == 1;
			}
		}
		for (@Pc(370) int local370 = 0; local370 < local28; local370++) {
			if (this.aClass183Array1[local370] != null) {
				this.aClass183Array1[local370].aBoolean338 = local24.method5366() == 1;
			}
		}
		for (@Pc(402) int local402 = 0; local402 < local28; local402++) {
			if (this.aClass183Array1[local402] != null) {
				this.aClass183Array1[local402].aByte77 = local24.method5416();
			}
		}
		for (@Pc(423) int local423 = 0; local423 < local28; local423++) {
			if (this.aClass183Array1[local423] != null) {
				this.aClass183Array1[local423].aBoolean335 = local24.method5366() == 1;
			}
		}
		for (@Pc(453) int local453 = 0; local453 < local28; local453++) {
			if (this.aClass183Array1[local453] != null) {
				this.aClass183Array1[local453].aBoolean333 = local24.method5366() == 1;
			}
		}
		for (@Pc(485) int local485 = 0; local485 < local28; local485++) {
			if (this.aClass183Array1[local485] != null) {
				this.aClass183Array1[local485].aBoolean334 = local24.method5366() == 1;
			}
		}
		for (@Pc(517) int local517 = 0; local517 < local28; local517++) {
			if (this.aClass183Array1[local517] != null) {
				this.aClass183Array1[local517].anInt4981 = local24.method5366();
			}
		}
		for (@Pc(542) int local542 = 0; local542 < local28; local542++) {
			if (this.aClass183Array1[local542] != null) {
				this.aClass183Array1[local542].anInt4980 = local24.method5407();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method2454(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub2_Sub13 local14 = this.method2456(arg0);
		return local14 != null && local14.method4782(this.aClass246_88, this);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIIIF)[I")
	@Override
	public int[] method2452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method2456(arg0).method4784((double) arg3, arg2, this, this.aClass246_88, this.aClass183Array1[arg0].aBoolean338, arg1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZFIII)[F")
	@Override
	public float[] method2453(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method2456(arg0).method4787(arg2, arg3, this.aClass183Array1[arg0].aBoolean338, this, this.aClass246_88);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIFBZ)[I")
	@Override
	public int[] method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) boolean arg4) {
		return this.method2456(arg2).method4783(this.aClass183Array1[arg2].aBoolean338, (double) arg3, this, arg1, this.aClass246_88, arg0, arg4);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)Lclient!oh;")
	@Override
	public Class183 method2450(@OriginalArg(1) int arg0) {
		return this.aClass183Array1[arg0];
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lclient!rb;")
	private Class1_Sub2_Sub13 method2456(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2 local10 = this.aClass29_2.method757((long) arg0);
		if (local10 != null) {
			return (Class1_Sub2_Sub13) local10;
		}
		@Pc(28) byte[] local28 = this.aClass246_87.method5499(arg0);
		if (local28 == null) {
			return null;
		} else {
			@Pc(40) Class1_Sub2_Sub13 local40 = new Class1_Sub2_Sub13(new Class1_Sub5(local28));
			this.aClass29_2.method756(local40, (long) arg0);
			return local40;
		}
	}
}
