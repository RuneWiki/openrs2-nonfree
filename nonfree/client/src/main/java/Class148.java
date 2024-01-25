import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class148 implements Interface1 {

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Lclient!dl;")
	private final Class90 aClass90_4 = new Class90(256);

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Lclient!la;")
	private final Class208 aClass208_50;

	@OriginalMember(owner = "client!go", name = "t", descriptor = "Lclient!la;")
	private final Class208 aClass208_51;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	private final int anInt3233;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "[Lclient!mf;")
	private final Class233[] aClass233Array1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!la;)V")
	public Class148(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_50 = arg2;
		this.aClass208_51 = arg1;
		@Pc(24) Class5_Sub23 local24 = new Class5_Sub23(arg0.method4991(0, 0, -122));
		this.anInt3233 = local24.method8519();
		this.aClass233Array1 = new Class233[this.anInt3233];
		for (@Pc(36) int local36 = 0; local36 < this.anInt3233; local36++) {
			if (local24.method8529() == 1) {
				this.aClass233Array1[local36] = new Class233();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt3233; local61++) {
			if (this.aClass233Array1[local61] != null) {
				this.aClass233Array1[local61].aBoolean482 = local24.method8529() == 0;
			}
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt3233; local97++) {
			if (this.aClass233Array1[local97] != null) {
				this.aClass233Array1[local97].aBoolean485 = local24.method8529() == 1;
			}
		}
		for (@Pc(135) int local135 = 0; local135 < this.anInt3233; local135++) {
			if (this.aClass233Array1[local135] != null) {
				this.aClass233Array1[local135].aBoolean481 = local24.method8529() == 1;
			}
		}
		for (@Pc(171) int local171 = 0; local171 < this.anInt3233; local171++) {
			if (this.aClass233Array1[local171] != null) {
				this.aClass233Array1[local171].aByte98 = local24.method8488();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.anInt3233; local203++) {
			if (this.aClass233Array1[local203] != null) {
				this.aClass233Array1[local203].aByte97 = local24.method8488();
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.anInt3233; local231++) {
			if (this.aClass233Array1[local231] != null) {
				this.aClass233Array1[local231].aByte94 = local24.method8488();
			}
		}
		for (@Pc(259) int local259 = 0; local259 < this.anInt3233; local259++) {
			if (this.aClass233Array1[local259] != null) {
				this.aClass233Array1[local259].aByte92 = local24.method8488();
			}
		}
		for (@Pc(287) int local287 = 0; local287 < this.anInt3233; local287++) {
			if (this.aClass233Array1[local287] != null) {
				this.aClass233Array1[local287].aShort78 = (short) local24.method8519();
			}
		}
		for (@Pc(316) int local316 = 0; local316 < this.anInt3233; local316++) {
			if (this.aClass233Array1[local316] != null) {
				this.aClass233Array1[local316].aByte96 = local24.method8488();
			}
		}
		for (@Pc(348) int local348 = 0; local348 < this.anInt3233; local348++) {
			if (this.aClass233Array1[local348] != null) {
				this.aClass233Array1[local348].aByte93 = local24.method8488();
			}
		}
		for (@Pc(380) int local380 = 0; local380 < this.anInt3233; local380++) {
			if (this.aClass233Array1[local380] != null) {
				this.aClass233Array1[local380].aBoolean484 = local24.method8529() == 1;
			}
		}
		for (@Pc(420) int local420 = 0; local420 < this.anInt3233; local420++) {
			if (this.aClass233Array1[local420] != null) {
				this.aClass233Array1[local420].aBoolean483 = local24.method8529() == 1;
			}
		}
		for (@Pc(454) int local454 = 0; local454 < this.anInt3233; local454++) {
			if (this.aClass233Array1[local454] != null) {
				this.aClass233Array1[local454].aByte95 = local24.method8488();
			}
		}
		for (@Pc(482) int local482 = 0; local482 < this.anInt3233; local482++) {
			if (this.aClass233Array1[local482] != null) {
				this.aClass233Array1[local482].aBoolean478 = local24.method8529() == 1;
			}
		}
		for (@Pc(520) int local520 = 0; local520 < this.anInt3233; local520++) {
			if (this.aClass233Array1[local520] != null) {
				this.aClass233Array1[local520].aBoolean480 = local24.method8529() == 1;
			}
		}
		for (@Pc(554) int local554 = 0; local554 < this.anInt3233; local554++) {
			if (this.aClass233Array1[local554] != null) {
				this.aClass233Array1[local554].aBoolean479 = local24.method8529() == 1;
			}
		}
		for (@Pc(590) int local590 = 0; local590 < this.anInt3233; local590++) {
			if (this.aClass233Array1[local590] != null) {
				this.aClass233Array1[local590].anInt6310 = local24.method8529();
			}
		}
		for (@Pc(618) int local618 = 0; local618 < this.anInt3233; local618++) {
			if (this.aClass233Array1[local618] != null) {
				this.aClass233Array1[local618].anInt6309 = local24.method8527();
			}
		}
		for (@Pc(646) int local646 = 0; local646 < this.anInt3233; local646++) {
			if (this.aClass233Array1[local646] != null) {
				this.aClass233Array1[local646].anInt6313 = local24.method8529();
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)Lclient!ij;")
	private Class5_Sub5_Sub11 method2867(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub5 local10 = this.aClass90_4.method1632((long) arg0);
		if (local10 != null) {
			return (Class5_Sub5_Sub11) local10;
		}
		@Pc(22) byte[] local22 = this.aClass208_51.method4997(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(35) Class5_Sub5_Sub11 local35 = new Class5_Sub5_Sub11(new Class5_Sub23(local22));
			this.aClass90_4.method1631(local35, (long) arg0);
			return local35;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIIIF)[I")
	@Override
	public int[] method2861(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4) {
		return this.method2867(arg1).method3721(this.aClass208_50, this, (double) arg4, arg3, arg2, arg0, this.aClass233Array1[arg1].aBoolean483);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)Lclient!mf;")
	@Override
	public Class233 method2863(@OriginalArg(1) int arg0) {
		return this.aClass233Array1[arg0];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIIFII)[F")
	@Override
	public float[] method2865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		return this.method2867(arg1).method3724(arg3, this, this.aClass208_50, this.aClass233Array1[arg1].aBoolean483, arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method2860(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub5_Sub11 local16 = this.method2867(arg0);
		return local16 != null && local16.method3725(this, this.aClass208_50);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BIZFII)[I")
	@Override
	public int[] method2862(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method2867(arg2).method3722((double) arg1, arg0, this, this.aClass208_50, this.aClass233Array1[arg2].aBoolean483, arg3);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I")
	@Override
	public int method2864() {
		return this.anInt3233;
	}
}
