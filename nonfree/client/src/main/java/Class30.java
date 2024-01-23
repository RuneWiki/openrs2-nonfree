import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public class Class30 implements Interface1 {

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Lclient!qj;")
	private Class148 aClass148_3 = new Class148(256);

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!nk;")
	private Class121 aClass121_27;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "Lclient!nk;")
	private Class121 aClass121_28;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "[Lclient!nb;")
	private Class116[] aClass116Array2;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!nk;Lclient!nk;Lclient!nk;)V")
	protected Class30(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class121 arg2) {
		this.aClass121_27 = arg1;
		this.aClass121_28 = arg2;
		@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0.method3115(0, 0));
		@Pc(28) int local28 = local24.method1386();
		this.aClass116Array2 = new Class116[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method1378() == 1) {
				this.aClass116Array2[local34] = new Class116();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aBoolean240 = local24.method1378() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aBoolean238 = local24.method1378() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aBoolean236 = local24.method1378() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aBoolean239 = local24.method1378() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aByte21 = local24.method1363();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aByte20 = local24.method1363();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aByte19 = local24.method1363();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aByte22 = local24.method1363();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass116Array2[local34] != null) {
				this.aClass116Array2[local34].aShort23 = (short) local24.method1386();
			}
		}
		if (local24.anInt1480 < local24.aByteArray17.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass116Array2[local34] != null) {
					local24.method1363();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass116Array2[local34] != null) {
					local24.method1363();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass116Array2[local34] != null) {
					local24.method1378();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass116Array2[local34] != null) {
					this.aClass116Array2[local34].aBoolean237 = local24.method1378() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass116Array2[local34] != null) {
					local24.method1363();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass116Array2[local34] != null) {
					local24.method1378();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass116Array2[local34] != null) {
					local24.method1378();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass116Array2[local34] != null) {
					local24.method1378();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Z")
	@Override
	public final boolean method756(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub8 local12 = this.method759(arg0);
		return local12 != null && local12.method2455(this.aClass121_28, this);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)Lclient!nb;")
	@Override
	public final Class116 method755(@OriginalArg(0) int arg0) {
		return this.aClass116Array2[arg0];
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(BI)Lclient!kd;")
	protected Class1_Sub2_Sub8 method759(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2 local6 = this.aClass148_3.method3600((long) arg0);
		if (local6 != null) {
			return (Class1_Sub2_Sub8) local6;
		}
		@Pc(22) byte[] local22 = this.aClass121_27.method3139(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(40) Class1_Sub2_Sub8 local40 = new Class1_Sub2_Sub8(new Class1_Sub14(local22));
			this.aClass148_3.method3602(local40, (long) arg0);
			return local40;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIIIF)[I")
	@Override
	public final int[] method754(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method759(arg1).method2464(this.aClass116Array2[arg1].aBoolean237, arg2, false, this.aClass121_28, (double) arg3, this, arg0);
	}
}
